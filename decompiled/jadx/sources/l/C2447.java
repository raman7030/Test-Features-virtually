package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alipay.sdk.m.y.q;
import com.google.android.material.snackbar.SnackbarManager;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۖۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5UN */
/* JADX INFO: loaded from: classes3.dex */
public class C2447 extends C8776 {

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f7802 = 0;

    /* JADX INFO: renamed from: ᩸ۙۙ, reason: not valid java name and contains not printable characters */
    private static final short[] f7803 = {1544, 14384, 14363, 14420, 14362, 14363, 14336, 14420, 14343, 14337, 14340, 14340, 14363, 14342, 14336};

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f7804;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public float f7805;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f7806;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f7807;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public Paint f7808;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f7809;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f7810;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f7811;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f7812;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f7813;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f7814;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f7815;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public int f7816;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public long f7817;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public int f7818;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public int f7819;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public View f7820;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public boolean f7821;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC2968 f7822;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C14792 f7823;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public float f7824;

    @Override // l.C13132
    public final void setAdapter(AbstractC19902 abstractC19902) {
        AbstractC2968 abstractC2968 = null;
        AbstractC19902 adapter = null;
        int i = 370991265;
        int i2 = RunnableC3474.f10992;
        int i3 = C3683.f11629;
        int iM6981 = C2105.m6981("֡ᩳ") ^ i3;
        int i4 = ((iM6981 ^ i2) * (-8661)) ^ (-785544117);
        int i5 = -406860785;
        while (true) {
            i = ((((i ^ i2) * 10785) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2091207627:
                case -890898148:
                    if (C1773.f6144 <= 0) {
                        iM6981 = C2105.m6981("᩷ᩳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 31965) ^ 1330700745;
                        i5 = -1471478010;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ܿ۟")) * (-61);
                        i4 = ((iM6981 ^ i2) * (-6949)) ^ 1548867937;
                        i5 = 13452409;
                    }
                    break;
                case -1865308029:
                case -31783362:
                    if (C2520.f8000 >= 0) {
                        iM6981 = (C2105.m6981("ۙ᩷") + i3) * (-41);
                        i4 = ((iM6981 ^ i2) * 10563) ^ 1053071394;
                        i5 = 2030214235;
                    } else {
                        iM6981 = (i3 - C2105.m6981("᩷ܿ")) * (-85);
                        i4 = ((iM6981 ^ i2) * (-127)) ^ (-469255383);
                        i5 = -1631741243;
                    }
                    break;
                case -1636488406:
                case -572588077:
                    super.setAdapter(abstractC19902);
                    abstractC2968 = this.f7822;
                    if (abstractC2968 != null) {
                        iM6981 = C0630.m2566("ۗۗ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-21011)) ^ 2079155941;
                        i5 = -364214542;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ۡ۠")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM6981 ^ i3) * 24591) ^ 837306304;
                        i5 = -222855819;
                    }
                    break;
                case -1504463515:
                case 1015870432:
                    if (C5695.m16023() >= 0) {
                        iM6981 = (i2 - C0630.m2566("ۜۨ")) * 77;
                        i4 = ((iM6981 ^ i3) * (-30789)) ^ (-577157147);
                        i5 = 1764373602;
                    } else {
                        iM6981 = C0630.m2566("ܿۛ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-32695)) ^ (-1852194764);
                        i5 = -2045831750;
                    }
                    break;
                case -1422660407:
                case 1566172877:
                    if (C21923.m49329()) {
                        iM6981 = C2105.m6981("᩷ᩳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 31965) ^ 1330700745;
                        i5 = -1471478010;
                    } else {
                        iM6981 = C0630.m2566("۠ۚ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-15449)) ^ (-550138264);
                        i5 = 383592115;
                    }
                    break;
                case -1357305658:
                case 1095161716:
                    C0798.m2998();
                    iM6981 = (i2 - C0630.m2566("ۜۨ")) * 77;
                    i4 = ((iM6981 ^ i3) * (-30789)) ^ (-577157147);
                    i5 = 1764373602;
                    break;
                case -1323242288:
                case -135793384:
                    if (C2126.f7087) {
                        iM6981 = (C2105.m6981("ۙܳ") + i3) * 79;
                        i4 = ((iM6981 ^ i2) * 24373) ^ (-183272527);
                        i5 = -986498178;
                    } else {
                        iM6981 = (C0630.m2566("ۘ᩶") ^ i3) * (-87);
                        i4 = ((iM6981 ^ i2) * (-887)) ^ (-2037618853);
                        i5 = 1529812996;
                    }
                    break;
                case -1290032713:
                case 1252723122:
                    if (!C1005.f3721) {
                        iM6981 = (C0630.m2566("ۢ֨") ^ i2) * (-75);
                        i4 = ((iM6981 ^ i3) * 32617) ^ (-1288963875);
                        i5 = 1595709142;
                    } else {
                        iM6981 = (C2105.m6981("ۙ᩷") + i3) * (-41);
                        i4 = ((iM6981 ^ i2) * 10563) ^ 1053071394;
                        i5 = 2030214235;
                    }
                    break;
                case -1255911061:
                case -742848618:
                    break;
                case -1188425226:
                case 259509553:
                    C1047.m3599();
                    if (C3432.f10845 < 0) {
                        iM6981 = (C2105.m6981("ۙ᩷") + i3) * (-41);
                        i4 = ((iM6981 ^ i2) * 10563) ^ 1053071394;
                        i5 = 2030214235;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ۜۨ")) * 77;
                        i4 = ((iM6981 ^ i3) * (-30789)) ^ (-577157147);
                        i5 = 1764373602;
                    }
                    break;
                case -1156534146:
                case 1169085809:
                    if (this.f7822 != null) {
                        iM6981 = (C0630.m2566("ۨۧ") + i2) * (-17);
                        i4 = ((iM6981 ^ i3) * 27111) ^ 1450383003;
                        i5 = 1840226768;
                    } else {
                        iM6981 = C2105.m6981("ۜ᩹") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-18903)) ^ 1766544156;
                        i5 = 1794246106;
                    }
                    break;
                case -1121859601:
                case 325652418:
                    if (C3432.f10845 >= 0) {
                        iM6981 = C2105.m6981("᩷ᩳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 31965) ^ 1330700745;
                        i5 = -1471478010;
                    } else {
                        iM6981 = C0630.m2566("᩺ۚ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-21025)) ^ 3121821;
                        i5 = -1611468749;
                    }
                    break;
                case -912096137:
                case -293505774:
                    if (ViewOnClickListenerC1958.m6429() < 0) {
                        iM6981 = (C2105.m6981("ۙܳ") + i3) * 79;
                        i4 = ((iM6981 ^ i2) * 24373) ^ (-183272527);
                        i5 = -986498178;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ۜۨ")) * 77;
                        i4 = ((iM6981 ^ i3) * (-30789)) ^ (-577157147);
                        i5 = 1764373602;
                    }
                    break;
                case -741238574:
                case -252811139:
                    abstractC19902.registerAdapterDataObserver(abstractC2968);
                    iM6981 = (C0630.m2566("ܰۤ") ^ i3) * (-117);
                    i4 = ((iM6981 ^ i2) * (-22479)) ^ 2057987151;
                    i5 = -743700272;
                    break;
                case -549902022:
                case 516791807:
                    if (abstractC19902 != null) {
                        iM6981 = C0630.m2566("ܿܰ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 30289) ^ (-781996466);
                        i5 = 659996398;
                    } else {
                        iM6981 = (C0630.m2566("ܰۤ") ^ i3) * (-117);
                        i4 = ((iM6981 ^ i2) * (-22479)) ^ 2057987151;
                        i5 = -743700272;
                    }
                    break;
                case -497402716:
                case 1932515994:
                    if (C22628.f73083 <= 0) {
                        iM6981 = C2105.m6981("᩷ᩳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 31965) ^ 1330700745;
                        i5 = -1471478010;
                    } else {
                        iM6981 = C0630.m2566("᩵ۙ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-23815)) ^ 1161269153;
                        i5 = 1566901577;
                    }
                    break;
                case -309302397:
                case 483008850:
                    this.f7822.onChanged();
                    iM6981 = (i2 - C0630.m2566("ۡ۠")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i4 = ((iM6981 ^ i3) * 24591) ^ 837306304;
                    i5 = -222855819;
                    break;
                case -7317411:
                case 1249511592:
                    adapter.unregisterAdapterDataObserver(this.f7822);
                    iM6981 = C2105.m6981("ۜ᩹") ^ i3;
                    i4 = ((iM6981 ^ i2) * (-18903)) ^ 1766544156;
                    i5 = 1794246106;
                    break;
                case 318114628:
                case 725780208:
                    adapter = getAdapter();
                    if (adapter != null) {
                        iM6981 = C0630.m2566("ܽۛ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 10027) ^ 1841074399;
                        i5 = 730866235;
                    } else {
                        iM6981 = C2105.m6981("ۜ᩹") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-18903)) ^ 1766544156;
                        i5 = 1794246106;
                    }
                    break;
                case 322487568:
                case 1195715773:
                    if (C3245.f10203 <= 0) {
                        iM6981 = (C0630.m2566("ۢ֨") ^ i2) * (-75);
                        i4 = ((iM6981 ^ i3) * 32617) ^ (-1288963875);
                        i5 = 1595709142;
                    } else {
                        iM6981 = (C2105.m6981("᩻ۛ") ^ i2) * (-43);
                        i4 = ((iM6981 ^ i3) * 3057) ^ 485236052;
                        i5 = 2052353705;
                    }
                    break;
                case 369558337:
                case 1363341778:
                    if (C1916.f6442) {
                        iM6981 = (C2105.m6981("֨ܽ") + i2) * 55;
                        i4 = ((iM6981 ^ i3) * (-16921)) ^ (-1445791247);
                        i5 = -1565882649;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ۜۨ")) * 77;
                        i4 = ((iM6981 ^ i3) * (-30789)) ^ (-577157147);
                        i5 = 1764373602;
                    }
                    break;
                case 1168893699:
                case 1921528619:
                    if (C0382.f1805) {
                        iM6981 = C2105.m6981("ۚܳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-5989)) ^ 1694111050;
                        i5 = -1425019096;
                    } else {
                        iM6981 = (C2105.m6981("ۙܳ") + i3) * 79;
                        i4 = ((iM6981 ^ i2) * 24373) ^ (-183272527);
                        i5 = -986498178;
                    }
                    break;
                default:
                    C3663.m11168();
                    break;
            }
            return;
        }
    }

    @Override // l.C13132
    public final void setLayoutManager(AbstractC17366 abstractC17366) {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 843777834;
        int i6 = RunnableC0588.f2309;
        int i7 = C1128.f4106;
        int iM2566 = C0630.m2566("֡ۛ") ^ i6;
        int i8 = ((iM2566 ^ i7) * (-11721)) ^ (-530442815);
        int i9 = 1813524828;
        while (true) {
            i5 = ((((i5 ^ i7) * 23523) >> 31) & i8) ^ (iM2566 ^ i9);
            switch (i5) {
                case -2051439621:
                case -1204049715:
                    C1773.m5908();
                    if (C21923.f70183 != 0) {
                        iM2566 = C0630.m2566("ۤܶ") ^ i7;
                        i8 = ((iM2566 ^ i6) * 19607) ^ 972190174;
                        i9 = -901648243;
                    } else {
                        iM2566 = (i6 - C2105.m6981("ۜ᩻")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = ((iM2566 ^ i7) * 1809) ^ (-1265132408);
                        i9 = -1375935419;
                    }
                    break;
                case -1852766818:
                case -1647619194:
                    i3 = 293197129;
                    if (C0483.f2088 >= 0) {
                        iM2566 = (C0630.m2566("᩺ܿ") ^ i7) * 31;
                        i8 = ((iM2566 ^ i6) * (-23341)) ^ 889100034;
                        i9 = -1915109848;
                    } else {
                        iM2566 = C2105.m6981("۟۠") ^ i7;
                        i8 = ((iM2566 ^ i6) * 1695) ^ (-1727461268);
                        i9 = 1790455664;
                    }
                    break;
                case -1823416923:
                case 788198455:
                    s = sArr[c];
                    s2 = 34246;
                    if (C3432.f10845 >= 0) {
                        iM2566 = C0630.m2566("᩹᩵") ^ i6;
                        i8 = ((iM2566 ^ i7) * (-29481)) ^ (-133336095);
                        i9 = 843898397;
                    } else {
                        iM2566 = (C2105.m6981("۠ᩴ") ^ i6) * 127;
                        i8 = ((iM2566 ^ i7) * (-32155)) ^ 1548689647;
                        i9 = 944129084;
                    }
                    break;
                case -1632620363:
                case 1509591771:
                    c = 0;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = (C2105.m6981("ۧۜ") + i7) * (-59);
                        i8 = ((iM2566 ^ i6) * 655) ^ 1474930973;
                        i9 = 2045026145;
                    } else {
                        iM2566 = C0630.m2566("ۤۘ") ^ i7;
                        i8 = ((iM2566 ^ i6) * 8839) ^ 561816983;
                        i9 = 645803915;
                    }
                    break;
                case -1543909617:
                case 1648161625:
                    if ((i2 + i3) - i < 0) {
                        iM2566 = (C2105.m6981("۠ۡ") ^ i6) * (-43);
                        i8 = ((iM2566 ^ i7) * 19551) ^ (-612404341);
                        i9 = 1650136305;
                    } else {
                        iM2566 = C2105.m6981("ܶۛ") ^ i7;
                        i8 = ((iM2566 ^ i6) * (-21949)) ^ (-554192879);
                        i9 = 1334471709;
                    }
                    break;
                case -1414238546:
                case -14466814:
                    if (!C1005.f3721) {
                        iM2566 = (C0630.m2566("᩺ܿ") ^ i7) * 31;
                        i8 = ((iM2566 ^ i6) * (-23341)) ^ 889100034;
                        i9 = -1915109848;
                    } else {
                        iM2566 = (C2105.m6981("ۧۜ") + i7) * (-59);
                        i8 = ((iM2566 ^ i6) * 655) ^ 1474930973;
                        i9 = 2045026145;
                    }
                    break;
                case -1059345865:
                case 1540049273:
                    i = s * s2;
                    i2 = s * s;
                    if (RunnableC1108.f4040) {
                        iM2566 = C2105.m6981("۫ۚ") ^ i6;
                        i8 = ((iM2566 ^ i7) * 19545) ^ 1482792176;
                        i9 = 70283622;
                    } else {
                        iM2566 = (C0630.m2566("᩺ܿ") ^ i7) * 31;
                        i8 = ((iM2566 ^ i6) * (-23341)) ^ 889100034;
                        i9 = -1915109848;
                    }
                    break;
                case -1027265641:
                case 1809004682:
                    if (C1420.f5096 > 0) {
                        iM2566 = (i6 - C2105.m6981("ۜ᩻")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = ((iM2566 ^ i7) * 1809) ^ (-1265132408);
                        i9 = -1375935419;
                    } else {
                        iM2566 = (C2105.m6981("ۧۜ") + i7) * (-59);
                        i8 = ((iM2566 ^ i6) * 655) ^ 1474930973;
                        i9 = 2045026145;
                    }
                    break;
                case -967700715:
                case 1218442742:
                    if (C1294.f4556 >= 0) {
                        iM2566 = C0630.m2566("᩹᩵") ^ i6;
                        i8 = ((iM2566 ^ i7) * (-29481)) ^ (-133336095);
                        i9 = 843898397;
                    } else {
                        iM2566 = C2105.m6981("۫֨") ^ i6;
                        i8 = ((iM2566 ^ i7) * (-14767)) ^ (-1580508371);
                        i9 = 1924799585;
                    }
                    break;
                case -799505822:
                case 1583568338:
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = C0630.m2566("᩹᩵") ^ i6;
                        i8 = ((iM2566 ^ i7) * (-29481)) ^ (-133336095);
                        i9 = 843898397;
                    } else {
                        iM2566 = C2105.m6981("᩺ۧ") ^ i6;
                        i8 = ((iM2566 ^ i7) * o.a.p) ^ (-1363294703);
                        i9 = -781766156;
                    }
                    break;
                case -518895725:
                case -406549013:
                    short[] sArr2 = f7803;
                    if (C3537.f11231 < 0 && !RunnableC1108.m3790()) {
                        throw new RuntimeException(C2167.m7159(sArr2, 1, 14, i4));
                    }
                    iM2566 = C0630.m2566("ۤܶ") ^ i7;
                    i8 = ((iM2566 ^ i6) * 19607) ^ 972190174;
                    i9 = -901648243;
                    break;
                case -348045357:
                case 1887208036:
                    sArr = f7803;
                    if (C3746.f11829 <= 0) {
                        iM2566 = (C2105.m6981("ۧۜ") + i7) * (-59);
                        i8 = ((iM2566 ^ i6) * 655) ^ 1474930973;
                        i9 = 2045026145;
                    } else {
                        iM2566 = C0630.m2566("۬᩸") ^ i7;
                        i8 = ((iM2566 ^ i6) * (-29081)) ^ 815898211;
                        i9 = -1774926223;
                    }
                    break;
                case -169641047:
                case 2012859507:
                    if (C1005.m3501()) {
                        iM2566 = (C2105.m6981("ۗᩳ") + i7) * 91;
                        i8 = ((iM2566 ^ i6) * (-21995)) ^ (-2086898161);
                        i9 = -686094258;
                    } else {
                        iM2566 = C0630.m2566("᩹᩵") ^ i6;
                        i8 = ((iM2566 ^ i7) * (-29481)) ^ (-133336095);
                        i9 = 843898397;
                    }
                    break;
                case -104262873:
                case 1192136112:
                    i4 = 14452;
                    iM2566 = (C0630.m2566("ᩳܳ") + i6) * 11;
                    i8 = ((iM2566 ^ i7) * 12627) ^ (-1761954577);
                    i9 = 2095432054;
                    break;
                case 839773135:
                case 1891356848:
                    RunnableC1108.m3790();
                    C4263.m12819();
                    return;
                case 860461957:
                case 1847642677:
                    C1294.m4372();
                    iM2566 = (C2105.m6981("ۧۜ") + i7) * (-59);
                    i8 = ((iM2566 ^ i6) * 655) ^ 1474930973;
                    i9 = 2045026145;
                    break;
                default:
                    i4 = 43099;
                    iM2566 = (C0630.m2566("ᩳܳ") + i6) * 11;
                    i8 = ((iM2566 ^ i7) * 12627) ^ (-1761954577);
                    i9 = 2095432054;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m7899() {
        int iM3848 = 0;
        int i = 0;
        int iM1484 = 0;
        int iM3498 = 0;
        int i2 = -968544134;
        int i3 = C4616.f14690;
        int i4 = C1128.f4106;
        int iM6981 = C2105.m6981("ۧۚ") ^ i3;
        int i5 = ((iM6981 ^ i4) * (-27391)) ^ 965589091;
        int i6 = -2014368713;
        while (true) {
            i2 = ((((i2 ^ i4) * 6883) >> 31) & i5) ^ (iM6981 ^ i6);
            switch (i2) {
                case -1951972930:
                case -696302290:
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = C2105.m6981("᩺᩹") ^ i3;
                        i5 = ((iM6981 ^ i4) * 23833) ^ (-1186152475);
                        i6 = 1565673353;
                    } else {
                        iM6981 = (C2105.m6981("ۙ᩺") + i3) * (-73);
                        i5 = ((iM6981 ^ i4) * 16805) ^ 78787839;
                        i6 = -1637551927;
                    }
                    break;
                case -1889645990:
                case 1783469822:
                    if (C1005.f3721) {
                        iM6981 = (C2105.m6981("ۗܳ") + i4) * (-107);
                        i5 = ((iM6981 ^ i3) * (-2869)) ^ (-1450421061);
                        i6 = -458611930;
                    } else {
                        iM6981 = (C2105.m6981("ܰ֨") ^ i4) * (-9);
                        i5 = ((iM6981 ^ i3) * 2371) ^ (-381521818);
                        i6 = -7054535;
                    }
                    break;
                case -1797308814:
                case 429477013:
                    if (C1916.f6442) {
                        iM6981 = C2105.m6981("᩹ۧ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-8039)) ^ 1512463299;
                        i6 = -1128077582;
                    } else {
                        iM6981 = C2105.m6981("ܶ֡") ^ i4;
                        i5 = ((iM6981 ^ i3) * 5833) ^ (-1439954257);
                        i6 = 2050637937;
                    }
                    break;
                case -1703279684:
                case -967902615:
                    if (C4616.f14690 <= 0) {
                        iM6981 = C2105.m6981("ܶ֡") ^ i4;
                        i5 = ((iM6981 ^ i3) * 5833) ^ (-1439954257);
                        i6 = 2050637937;
                    } else {
                        iM6981 = C0630.m2566("ᩳ᩻") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-12447)) ^ 803600653;
                        i6 = -1548717423;
                    }
                    break;
                case -1696814309:
                case 513828887:
                    if (C0798.f2919) {
                        iM6981 = C2105.m6981("᩺᩹") ^ i3;
                        i5 = ((iM6981 ^ i4) * 23833) ^ (-1186152475);
                        i6 = 1565673353;
                    } else {
                        iM6981 = C0630.m2566("۬ۨ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-16653)) ^ (-76327284);
                        i6 = -553934950;
                    }
                    break;
                case -1689107645:
                case -669816140:
                    if (ViewOnClickListenerC1958.m6429() < 0) {
                        iM6981 = C2105.m6981("᩺᩹") ^ i3;
                        i5 = ((iM6981 ^ i4) * 23833) ^ (-1186152475);
                        i6 = 1565673353;
                    } else {
                        iM6981 = C0630.m2566("᩶ۧ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-5829)) ^ 980695164;
                        i6 = 1612689824;
                    }
                    break;
                case -1597985004:
                case 1672614079:
                    i = 1;
                    if (iM3848 >= 1) {
                        iM6981 = (C2105.m6981("֨ᩴ") ^ i3) * 97;
                        i5 = ((iM6981 ^ i4) * 8019) ^ (-378653956);
                        i6 = 1193548197;
                    } else {
                        iM1484 = iM3848;
                        iM6981 = C2105.m6981("֫ۙ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-1177)) ^ 223201837;
                        i6 = 931316384;
                    }
                    break;
                case -1588318684:
                case 1310059164:
                    iM3848 = C1128.m3848(this);
                    if (C3683.f11629 >= 0) {
                        iM6981 = (C2105.m6981("ܰ֨") ^ i4) * (-9);
                        i5 = ((iM6981 ^ i3) * 2371) ^ (-381521818);
                        i6 = -7054535;
                    } else {
                        iM6981 = (C2105.m6981("۬ܺ") + i4) * (-79);
                        i5 = ((iM6981 ^ i3) * (-561)) ^ (-926224825);
                        i6 = -1471587564;
                    }
                    break;
                case -1422443727:
                case 1864972636:
                    if (C0237.f1507 != 0) {
                        iM6981 = C0630.m2566("᩶ۧ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-5829)) ^ 980695164;
                        i6 = 1612689824;
                    } else {
                        iM6981 = C0630.m2566("ۤ۫") ^ i4;
                        i5 = ((iM6981 ^ i3) * 4175) ^ 1145227363;
                        i6 = 1378203366;
                    }
                    break;
                case -616310664:
                case 1070610150:
                    this.f7816 = iM1484;
                    iM6981 = C0630.m2566("ܽᩴ") ^ i3;
                    i5 = ((iM6981 ^ i4) * 941) ^ 259405965;
                    i6 = 600578933;
                    break;
                case -540551463:
                case -339238359:
                    iM3498 = C1005.m3498(C2958.m9024(this, 0));
                    if (iM3498 > i) {
                        iM6981 = (C0630.m2566("ۨ᩹") ^ i4) * 119;
                        i5 = ((iM6981 ^ i3) * (-2063)) ^ (-378409791);
                        i6 = -1792345503;
                    } else {
                        iM1484 = iM3848;
                        iM6981 = C2105.m6981("֫ۙ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-1177)) ^ 223201837;
                        i6 = 931316384;
                    }
                    break;
                case -241846434:
                case 1745073360:
                    if (C4263.f13799 <= 0) {
                        iM6981 = C2105.m6981("ܶ֡") ^ i4;
                        i5 = ((iM6981 ^ i3) * 5833) ^ (-1439954257);
                        i6 = 2050637937;
                    } else {
                        iM6981 = (C2105.m6981("ۡۚ") + i3) * (-37);
                        i5 = ((iM6981 ^ i4) * (-4723)) ^ (-1251037725);
                        i6 = 2014877364;
                    }
                    break;
                case -199762596:
                case 91701090:
                    return this.f7816;
                case -155943518:
                case 1376196239:
                    if (C3245.m9925() != 0) {
                        iM6981 = C2105.m6981("᩺᩹") ^ i3;
                        i5 = ((iM6981 ^ i4) * 23833) ^ (-1186152475);
                        i6 = 1565673353;
                    } else {
                        iM6981 = (i3 - C0630.m2566("۟ۚ")) * (-31);
                        i5 = ((iM6981 ^ i4) * (-27787)) ^ (-1805594625);
                        i6 = -1093725925;
                    }
                    break;
                case 724042475:
                case 1520528809:
                    if (C3019.f9544 >= 0) {
                        iM6981 = (C2105.m6981("ܰ֨") ^ i4) * (-9);
                        i5 = ((iM6981 ^ i3) * 2371) ^ (-381521818);
                        i6 = -7054535;
                    } else {
                        iM6981 = C2105.m6981("ܿ֡") ^ i3;
                        i5 = ((iM6981 ^ i4) * 14129) ^ (-1278821247);
                        i6 = -2038720618;
                    }
                    break;
                case 1057387494:
                case 1813248289:
                    if (iM1484 > this.f7816) {
                        iM6981 = (C0630.m2566("۟ܺ") ^ i4) * (-85);
                        i5 = ((iM6981 ^ i3) * (-31)) ^ (-2035827985);
                        i6 = 338874039;
                    } else {
                        iM6981 = C0630.m2566("ܽᩴ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 941) ^ 259405965;
                        i6 = 600578933;
                    }
                    break;
                case 1155190732:
                case 2078987894:
                    C3683.m11222();
                    if (C0798.m2998() != 0) {
                        iM6981 = C2105.m6981("ܶ֡") ^ i4;
                        i5 = ((iM6981 ^ i3) * 5833) ^ (-1439954257);
                        i6 = 2050637937;
                    } else {
                        iM6981 = C0630.m2566("᩶ۧ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-5829)) ^ 980695164;
                        i6 = 1612689824;
                    }
                    break;
                case 1185371217:
                case 1399220238:
                    C2105.m6982();
                    return 0;
                case 1625555006:
                case 2070416976:
                    iM1484 = C0237.m1484(iM3848, C1005.m3498(this) / iM3498);
                    iM6981 = C2105.m6981("֫ۙ") ^ i4;
                    i5 = ((iM6981 ^ i3) * (-1177)) ^ 223201837;
                    i6 = 931316384;
                    break;
                case 1715704134:
                case 1925096082:
                    RunnableC0588.m2441();
                    C2520.m8026();
                    iM6981 = C0630.m2566("᩶ۧ") ^ i3;
                    i5 = ((iM6981 ^ i4) * (-5829)) ^ 980695164;
                    i6 = 1612689824;
                    break;
                default:
                    C0382.m1848();
                    if (C0714.f2697 >= 0) {
                        iM6981 = C2105.m6981("ܶ֡") ^ i4;
                        i5 = ((iM6981 ^ i3) * 5833) ^ (-1439954257);
                        i6 = 2050637937;
                    } else {
                        iM6981 = (i3 - C2105.m6981("۟ۤ")) * 89;
                        i5 = ((iM6981 ^ i4) * 4789) ^ (-101248816);
                        i6 = -1357867881;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2447(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        int i = -1172631078;
        int i2 = C3019.f9544;
        int i3 = C3683.f11629;
        int iM2566 = (C0630.m2566("ۘܶ") ^ i2) * 33;
        int i4 = ((iM2566 ^ i3) * 27449) ^ 43560498;
        int i5 = 317670513;
        while (true) {
            i = (iM2566 ^ i5) ^ (i4 & (((i ^ i3) * 27207) >> 31));
            switch (i) {
                case -2119249634:
                case 825726045:
                    return;
                case -1289425889:
                case 1604418822:
                    if (C1128.f4106 <= 0) {
                        iM2566 = C0630.m2566("᩺۬") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-28009)) ^ (-1105209522);
                        i5 = -1541256253;
                    } else {
                        iM2566 = (C2105.m6981("ۢۖ") + i2) * (-85);
                        i4 = ((iM2566 ^ i3) * (-25987)) ^ (-1447721058);
                        i5 = 673415761;
                    }
                    break;
                case -406225312:
                case 1132407039:
                    C1711.m5736();
                    C2126.m7040();
                    throw new RuntimeException();
                case -324610481:
                case 1480590761:
                    if (C11340.f33930 >= 0) {
                        iM2566 = C0630.m2566("᩻ܺ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 1237) ^ 625990453;
                        i5 = 323847058;
                    } else {
                        iM2566 = C0630.m2566("ۗ۬") ^ i3;
                        i4 = ((iM2566 ^ i2) * 16303) ^ (-1981902034);
                        i5 = -493008200;
                    }
                    break;
                case 370823584:
                case 809584150:
                    C0964.m3413();
                    iM2566 = C0630.m2566("᩻ܺ") ^ i3;
                    i4 = ((iM2566 ^ i2) * 1237) ^ 625990453;
                    i5 = 323847058;
                    break;
                case 1353101724:
                case 1406889195:
                    if (C1047.f3863 < 0) {
                        iM2566 = (C0630.m2566("۟۫") + i2) * 35;
                        i4 = ((iM2566 ^ i3) * 30391) ^ (-933218279);
                        i5 = 628353213;
                    } else {
                        iM2566 = (C2105.m6981("᩵۬") ^ i2) * 43;
                        i4 = ((iM2566 ^ i3) * (-5927)) ^ (-1103293395);
                        i5 = -511220327;
                    }
                    break;
                default:
                    if (RunnableC0588.f2309 < 0) {
                        iM2566 = (C0630.m2566("۟۫") + i2) * 35;
                        i4 = ((iM2566 ^ i3) * 30391) ^ (-933218279);
                        i5 = 628353213;
                    } else {
                        iM2566 = C0630.m2566("᩻ܺ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 1237) ^ 625990453;
                        i5 = 323847058;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m7900(View view) {
        AbstractC19902 adapter = null;
        int i = 258051823;
        int i2 = C4263.f13799;
        int i3 = C3746.f11829;
        int iM6981 = C2105.m6981("֫᩹") ^ i2;
        int i4 = ((iM6981 ^ i3) * (-25855)) ^ (-707727019);
        int i5 = 329546173;
        while (true) {
            i = ((((i ^ i3) * 16949) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2076819396:
                case -1889008112:
                    if (C2167.f7158 >= 0) {
                        iM6981 = C0630.m2566("᩷᩺") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-8815)) ^ 1121553874;
                        i5 = 25785115;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۖۙ")) * (-29);
                        i4 = ((iM6981 ^ i2) * 13857) ^ 2110367740;
                        i5 = -1765798875;
                    }
                    break;
                case -1892832971:
                case 1757165516:
                    this.f7822 = new C15851(this, view);
                    iM6981 = (i2 - C0630.m2566("ۘ᩻")) * (-55);
                    i4 = ((iM6981 ^ i3) * 24415) ^ (-1105578908);
                    i5 = -1976047377;
                    break;
                case -1776492328:
                case -1288152421:
                    if (!C2167.m7155()) {
                        iM6981 = C0630.m2566("᩷ܿ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 25771) ^ 169086976;
                        i5 = -1792840043;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ۚۜ")) * q.h;
                        i4 = ((iM6981 ^ i3) * 4277) ^ (-2144572563);
                        i5 = -609683183;
                    }
                    break;
                case -1633358059:
                case 1662482451:
                    if (C1711.f5919) {
                        iM6981 = C0630.m2566("᩷᩺") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-8815)) ^ 1121553874;
                        i5 = 25785115;
                    } else {
                        iM6981 = (C2105.m6981("۟֨") + i3) * (-73);
                        i4 = ((iM6981 ^ i2) * (-20383)) ^ 226769063;
                        i5 = -21556808;
                    }
                    break;
                case -1556741897:
                case 1434242362:
                    if (C4616.f14690 <= 0) {
                        iM6981 = (i2 - C0630.m2566("ۖ۬")) * (-127);
                        i4 = ((iM6981 ^ i3) * 10873) ^ (-1566811332);
                        i5 = -1249083447;
                    } else {
                        iM6981 = C0630.m2566("ۢۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-8453)) ^ 1983506842;
                        i5 = 1316197138;
                    }
                    break;
                case -1518385196:
                case 2135503428:
                    adapter.registerAdapterDataObserver(this.f7822);
                    iM6981 = (C2105.m6981("ᩴᩴ") + i3) * (-27);
                    i4 = ((iM6981 ^ i2) * (-21675)) ^ (-1496235703);
                    i5 = 144377568;
                    break;
                case -1406556797:
                case -723534289:
                    if (C3746.f11829 <= 0) {
                        iM6981 = (i2 - C0630.m2566("ۖ۬")) * (-127);
                        i4 = ((iM6981 ^ i3) * 10873) ^ (-1566811332);
                        i5 = -1249083447;
                    } else {
                        iM6981 = (C0630.m2566("֨ܳ") + i3) * (-111);
                        i4 = ((iM6981 ^ i2) * (-22911)) ^ (-1531416429);
                        i5 = 546154388;
                    }
                    break;
                case -1015502543:
                case -809793021:
                    if (C3245.m9925() != 0) {
                        iM6981 = C0630.m2566("᩷᩺") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-8815)) ^ 1121553874;
                        i5 = 25785115;
                    } else {
                        iM6981 = C2105.m6981("ᩳܿ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 16619) ^ 1387330214;
                        i5 = 511072036;
                    }
                    break;
                case -570364982:
                case -56273041:
                    if (C1916.f6442) {
                        iM6981 = C0630.m2566("᩵᩺") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-15791)) ^ (-1750627900);
                        i5 = -1335285839;
                    } else {
                        iM6981 = C0630.m2566("᩷᩺") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-8815)) ^ 1121553874;
                        i5 = 25785115;
                    }
                    break;
                case -201777704:
                case 1658902703:
                    RunnableC0588.m2441();
                    break;
                case 121256784:
                case 1043702600:
                    if (C3683.f11629 >= 0) {
                        iM6981 = (i2 - C0630.m2566("ۖ۬")) * (-127);
                        i4 = ((iM6981 ^ i3) * 10873) ^ (-1566811332);
                        i5 = -1249083447;
                    } else {
                        iM6981 = C0630.m2566("ۜ᩶") ^ i2;
                        i4 = ((iM6981 ^ i3) * 7055) ^ (-753344481);
                        i5 = -1426577113;
                    }
                    break;
                case 310572556:
                case 903222480:
                    C4263.m12819();
                    if (C1047.f3863 < 0) {
                        iM6981 = (i2 - C2105.m6981("ۚۜ")) * q.h;
                        i4 = ((iM6981 ^ i3) * 4277) ^ (-2144572563);
                        i5 = -609683183;
                    } else {
                        iM6981 = C2105.m6981("۟ۖ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 9109) ^ (-1640440678);
                        i5 = 1280245551;
                    }
                    break;
                case 546575117:
                case 707347744:
                    this.f7820 = view;
                    if (this.f7822 == null) {
                        iM6981 = (i3 - C2105.m6981("ܿ᩻")) * (-57);
                        i4 = ((iM6981 ^ i2) * (-18629)) ^ 435555764;
                        i5 = 1902811635;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ۘ᩻")) * (-55);
                        i4 = ((iM6981 ^ i3) * 24415) ^ (-1105578908);
                        i5 = -1976047377;
                    }
                    break;
                case 588547797:
                case 1262350431:
                    C2167.m7155();
                    iM6981 = C0630.m2566("᩷ܿ") ^ i3;
                    i4 = ((iM6981 ^ i2) * 25771) ^ 169086976;
                    i5 = -1792840043;
                    break;
                case 670603963:
                case 1738372877:
                    if (C7106.f21815 != 0) {
                        iM6981 = (i2 - C0630.m2566("ۖ۬")) * (-127);
                        i4 = ((iM6981 ^ i3) * 10873) ^ (-1566811332);
                        i5 = -1249083447;
                    } else {
                        iM6981 = (C2105.m6981("ܶۛ") + i2) * (-57);
                        i4 = ((iM6981 ^ i3) * (-18419)) ^ (-1504544566);
                        i5 = -76665832;
                    }
                    break;
                case 702738095:
                case 2049926780:
                    if (C4263.f13799 <= 0) {
                        iM6981 = C0630.m2566("᩷᩺") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-8815)) ^ 1121553874;
                        i5 = 25785115;
                    } else {
                        iM6981 = C0630.m2566("ܳۢ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 28419) ^ (-3667485);
                        i5 = -1703085691;
                    }
                    break;
                case 774311609:
                case 1369889397:
                    this.f7822.onChanged();
                    break;
                case 999806110:
                case 1246856578:
                    adapter = getAdapter();
                    if (adapter != null) {
                        iM6981 = (C0630.m2566("֫ܶ") ^ i2) * (-51);
                        i4 = ((iM6981 ^ i3) * (-7173)) ^ 242853286;
                        i5 = 888368115;
                    } else {
                        iM6981 = (C2105.m6981("ᩴᩴ") + i3) * (-27);
                        i4 = ((iM6981 ^ i2) * (-21675)) ^ (-1496235703);
                        i5 = 144377568;
                    }
                    break;
                case 1207409124:
                case 1655913007:
                    if (C1711.f5919) {
                        iM6981 = (i2 - C0630.m2566("ۖ۬")) * (-127);
                        i4 = ((iM6981 ^ i3) * 10873) ^ (-1566811332);
                        i5 = -1249083447;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۖܺ")) * 75;
                        i4 = ((iM6981 ^ i2) * (-30141)) ^ (-1259394383);
                        i5 = 526222531;
                    }
                    break;
                default:
                    RunnableC1937.m6387();
                    if (C5695.f17556 >= 0) {
                        iM6981 = (i2 - C0630.m2566("ۖ۬")) * (-127);
                        i4 = ((iM6981 ^ i3) * 10873) ^ (-1566811332);
                        i5 = -1249083447;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ۚۜ")) * q.h;
                        i4 = ((iM6981 ^ i3) * 4277) ^ (-2144572563);
                        i5 = -609683183;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        if (l.C1128.f4106 <= 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2447(Context context, AttributeSet attributeSet, int i) {
        C14792 c14792;
        int iM2566;
        int i2;
        int i3;
        boolean z;
        int iM6981;
        int i4;
        int i5;
        super(context, attributeSet, i);
        boolean z2 = false;
        C14792 c14793 = null;
        boolean z3 = false;
        DisplayMetrics displayMetrics = null;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        AbstractC22723 itemAnimator = null;
        long j = 0;
        int i6 = 933327684;
        int i7 = C4075.f12947;
        int i8 = C0422.f1886;
        int iM6982 = C2105.m6981("ۤᩳ") ^ i7;
        int i9 = ((iM6982 ^ i8) * (-22669)) ^ (-1370704112);
        int i10 = 660173456;
        while (true) {
            int i11 = iM6982 ^ i10;
            while (true) {
                i6 = ((((i6 ^ i8) * 29641) >> 31) & i9) ^ i11;
                switch (i6) {
                    case -2016961477:
                    case -115839024:
                        this.f7805 = f3;
                        if (C0964.f3626 != 0) {
                            z = z3;
                            iM6981 = (i7 - C2105.m6981("۟ۚ")) * (-127);
                            i4 = ((iM6981 ^ i8) * (-14599)) ^ 234824961;
                            i5 = -2115779855;
                            i9 = i4;
                            i11 = iM6981 ^ i5;
                        } else {
                            addOnScrollListener(new C8797(this));
                            super.setLayoutManager(new C18654(context));
                            if (C0714.f2697 >= 0) {
                                z = z3;
                                iM6981 = C0630.m2566("ܺ֡") ^ i8;
                                i4 = ((iM6981 ^ i7) * 3901) ^ (-1801764849);
                                i5 = -1086546798;
                                i9 = i4;
                                i11 = iM6981 ^ i5;
                            } else {
                                int iM2567 = (C0630.m2566("ܺۗ") + i7) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                z = z3;
                                int i12 = ((iM2567 ^ i8) * 2371) ^ (-1495035680);
                                i11 = iM2567 ^ (-1551884620);
                                i9 = i12;
                            }
                        }
                        z3 = z;
                        break;
                    case -1814881439:
                    case 200925212:
                        z = z3;
                        this.f7814 = f * f2;
                        f3 = f * 48.0f;
                        if (!C1504.m5179()) {
                            z3 = z;
                            int iM2568 = (C0630.m2566("ᩳ᩵") ^ i7) * (-123);
                            c14792 = c14793;
                            int i13 = ((iM2568 ^ i8) * (-13249)) ^ (-1184130808);
                            i11 = iM2568 ^ 1571445030;
                            i9 = i13;
                            c14793 = c14792;
                        } else {
                            iM6981 = C0630.m2566("᩷۫") ^ i8;
                            i4 = ((iM6981 ^ i7) * 26157) ^ (-1790425054);
                            i5 = -1624251282;
                            i9 = i4;
                            i11 = iM6981 ^ i5;
                            z3 = z;
                        }
                        break;
                    case -1745689483:
                    case -1358785721:
                        c14792 = c14793;
                        z = z3;
                        z2 = true;
                        z2 = true;
                        this.f7809 = true;
                        this.f7817 = 0L;
                        if (!C1916.f6442) {
                            c14793 = c14792;
                            iM6981 = C0630.m2566("ܺ֡") ^ i8;
                            i4 = ((iM6981 ^ i7) * 3901) ^ (-1801764849);
                            i5 = -1086546798;
                            i9 = i4;
                            i11 = iM6981 ^ i5;
                            z3 = z;
                        } else {
                            int iM2569 = (C0630.m2566("᩺ۘ") ^ i8) * (-43);
                            i11 = (-1198285816) ^ iM2569;
                            i9 = ((iM2569 ^ i7) * 13527) ^ 287774171;
                            z3 = z;
                            c14793 = c14792;
                        }
                        break;
                    case -1479067084:
                    case -409968323:
                        RunnableC1108.m3790();
                        int iM25610 = (C0630.m2566("ᩳ᩵") ^ i7) * (-123);
                        c14792 = c14793;
                        int i14 = ((iM25610 ^ i8) * (-13249)) ^ (-1184130808);
                        i11 = iM25610 ^ 1571445030;
                        i9 = i14;
                        c14793 = c14792;
                        break;
                    case -1473410159:
                    case 538990724:
                        C3245.m9925();
                        AbstractC2021.m6574();
                        throw new RuntimeException();
                    case -1041104915:
                    case 1751130435:
                        z = z3;
                        c14793 = new C14792(3);
                        if (C3245.f10203 <= 0) {
                            iM6981 = C0630.m2566("ܺ֡") ^ i8;
                            i4 = ((iM6981 ^ i7) * 3901) ^ (-1801764849);
                            i5 = -1086546798;
                        } else {
                            iM6981 = (i7 - C2105.m6981("ۘۙ")) * 71;
                            i4 = ((iM6981 ^ i8) * (-16921)) ^ (-1888775169);
                            i5 = -953599751;
                        }
                        i9 = i4;
                        i11 = iM6981 ^ i5;
                        z3 = z;
                        break;
                    case -993494336:
                    case -780701931:
                        break;
                    case -623053428:
                    case 6480913:
                        C3019.m9255();
                        if (C0630.f2410 > 0) {
                            z = z3;
                            iM6981 = C0630.m2566("ܺ֡") ^ i8;
                            i4 = ((iM6981 ^ i7) * 3901) ^ (-1801764849);
                            i5 = -1086546798;
                            i9 = i4;
                            i11 = iM6981 ^ i5;
                            z3 = z;
                        } else {
                            int iM25611 = (C0630.m2566("ᩳ᩵") ^ i7) * (-123);
                            c14792 = c14793;
                            int i15 = ((iM25611 ^ i8) * (-13249)) ^ (-1184130808);
                            i11 = iM25611 ^ 1571445030;
                            i9 = i15;
                            c14793 = c14792;
                        }
                        break;
                    case -535412219:
                    case 497522444:
                        itemAnimator.m50786(j);
                        setMotionEventSplittingEnabled(z3);
                        this.f7819 = ViewConfiguration.get(context).getScaledTouchSlop();
                        return;
                    case 240758473:
                    case 1267983901:
                        z = z3;
                        displayMetrics = context.getResources().getDisplayMetrics();
                        if (C0237.f1507 != 0) {
                            iM6981 = (i7 - C2105.m6981("۟ۚ")) * (-127);
                            i4 = ((iM6981 ^ i8) * (-14599)) ^ 234824961;
                            i5 = -2115779855;
                        } else {
                            iM6981 = C0630.m2566("ܽ᩺") ^ i8;
                            i4 = ((iM6981 ^ i7) * (-6797)) ^ 2124868314;
                            i5 = 1890927208;
                        }
                        i9 = i4;
                        i11 = iM6981 ^ i5;
                        z3 = z;
                        break;
                    case 371985752:
                    case 1416017095:
                        this.f7823 = c14793;
                        z3 = false;
                        this.f7813 = false;
                        this.f7816 = z2 ? 1 : 0;
                        if (C1420.f5096 <= 0) {
                            int iM25612 = (C0630.m2566("ᩳ᩵") ^ i7) * (-123);
                            c14792 = c14793;
                            int i16 = ((iM25612 ^ i8) * (-13249)) ^ (-1184130808);
                            i11 = iM25612 ^ 1571445030;
                            i9 = i16;
                        } else {
                            c14792 = c14793;
                            this.f7808 = new Paint();
                            this.f7821 = z2;
                            this.f7818 = 0;
                            if (C0483.f2088 >= 0) {
                                iM2566 = C2105.m6981("ۙۢ") ^ i8;
                                i2 = ((iM2566 ^ i7) * 287) ^ 542486981;
                                i3 = -912459971;
                            } else {
                                iM2566 = (C0630.m2566("ۜܺ") + i7) * 73;
                                i2 = ((iM2566 ^ i8) * (-165)) ^ 184458441;
                                i3 = -1448792325;
                            }
                            i9 = i2;
                            i11 = iM2566 ^ i3;
                        }
                        c14793 = c14792;
                        break;
                    case 1264262306:
                    case 1751055284:
                        z = z3;
                        f = displayMetrics.density;
                        this.f7806 = -579373193;
                        f2 = 8.0f;
                        if (C0237.f1507 != 0) {
                            iM6981 = C2105.m6981("ۜۙ") ^ i8;
                            i4 = ((iM6981 ^ i7) * (-7413)) ^ 141337698;
                            i5 = 2087074957;
                        } else {
                            iM6981 = (C0630.m2566("۠ۘ") ^ i7) * 51;
                            i4 = ((iM6981 ^ i8) * 5391) ^ (-634152750);
                            i5 = -1181065471;
                        }
                        i9 = i4;
                        i11 = iM6981 ^ i5;
                        z3 = z;
                        break;
                    case 1528780447:
                    case 1687004401:
                        if (C3911.f12484 >= 0) {
                            c14792 = c14793;
                            iM2566 = C2105.m6981("ۙۢ") ^ i8;
                            i2 = ((iM2566 ^ i7) * 287) ^ 542486981;
                            i3 = -912459971;
                            i9 = i2;
                            i11 = iM2566 ^ i3;
                            c14793 = c14792;
                        } else {
                            z = z3;
                            iM6981 = C0630.m2566("ܺ֡") ^ i8;
                            i4 = ((iM6981 ^ i7) * 3901) ^ (-1801764849);
                            i5 = -1086546798;
                            i9 = i4;
                            i11 = iM6981 ^ i5;
                            z3 = z;
                        }
                        break;
                    default:
                        itemAnimator = getItemAnimator();
                        j = 100;
                        itemAnimator.m50782(100L);
                        itemAnimator.m50792(100L);
                        itemAnimator.m50789(200L);
                        if (C1420.f5096 > 0) {
                        }
                        int iM25613 = (C0630.m2566("ᩳ᩵") ^ i7) * (-123);
                        c14792 = c14793;
                        int i17 = ((iM25613 ^ i8) * (-13249)) ^ (-1184130808);
                        i11 = iM25613 ^ 1571445030;
                        i9 = i17;
                        c14793 = c14792;
                        break;
                }
            }
            iM6982 = C0630.m2566("ᩴ᩹") ^ i8;
            i9 = ((iM6982 ^ i7) * (-13727)) ^ (-162298923);
            i10 = 89102984;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m7898() {
        boolean z = false;
        int i = 164425559;
        int i2 = C0714.f2697;
        int i3 = C1294.f4556;
        int iM2566 = C0630.m2566("᩹᩻") ^ i2;
        int i4 = ((iM2566 ^ i3) * (-18859)) ^ (-1045589502);
        int i5 = 1623484634;
        while (true) {
            i = ((((i ^ i3) * (-4263)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -1962821183:
                case -264366055:
                    if (C0422.f1886 <= 0) {
                        iM2566 = (i2 - C0630.m2566("᩷ܽ")) * 61;
                        i4 = ((iM2566 ^ i3) * 17323) ^ 88739045;
                        i5 = -707177184;
                    } else {
                        iM2566 = (C0630.m2566("ܽ۟") + i3) * (-65);
                        i4 = ((iM2566 ^ i2) * 32017) ^ (-81939394);
                        i5 = -627301885;
                    }
                    break;
                case -1812364659:
                case 1079862223:
                    ViewOnClickListenerC1958.m6429();
                    iM2566 = (C0630.m2566("ܽ۟") + i3) * (-65);
                    i4 = ((iM2566 ^ i2) * 32017) ^ (-81939394);
                    i5 = -627301885;
                    break;
                case -1580696080:
                case -1248696759:
                    if (C21923.f70183 != 0) {
                        iM2566 = C2105.m6981("ۚܶ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-25995)) ^ (-1060874902);
                        i5 = 1597404590;
                    } else {
                        iM2566 = (C0630.m2566("֨ᩴ") ^ i3) * (-7);
                        i4 = ((iM2566 ^ i2) * (-12273)) ^ (-596681769);
                        i5 = 151383603;
                    }
                    break;
                case -1539710222:
                case -1390520307:
                    if (C2958.f9394 >= 0) {
                        iM2566 = C0630.m2566("᩸۠") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-21283)) ^ 1312319280;
                        i5 = -980676704;
                    } else {
                        iM2566 = (C2105.m6981("ۡ֡") ^ i3) * (-19);
                        i4 = ((iM2566 ^ i2) * 10153) ^ (-669258725);
                        i5 = 835709791;
                    }
                    break;
                case -1474814758:
                case 1052282034:
                    break;
                case -742631181:
                case 1269111393:
                    if (C1420.f5096 <= 0) {
                        iM2566 = C0630.m2566("᩸۠") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-21283)) ^ 1312319280;
                        i5 = -980676704;
                    } else {
                        iM2566 = C0630.m2566("ۨ᩸") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-26773)) ^ 148755162;
                        i5 = -575036955;
                    }
                    break;
                case -521810156:
                case -491717623:
                    setVerticalScrollBarEnabled(true);
                    iM2566 = C0630.m2566("ۖᩴ") ^ i2;
                    i4 = ((iM2566 ^ i3) * (-31031)) ^ (-1108540480);
                    i5 = -1325958927;
                    break;
                case -413530007:
                case 865077168:
                    if (C0382.f1805) {
                        iM2566 = (i3 - C2105.m6981("۠ܿ")) * (-103);
                        i4 = ((iM2566 ^ i2) * 25021) ^ 1047219231;
                        i5 = 2083171938;
                    } else {
                        iM2566 = (C0630.m2566("ۗ᩷") + i2) * 19;
                        i4 = ((iM2566 ^ i3) * (-31451)) ^ 1109670014;
                        i5 = -810696600;
                    }
                    break;
                case -293061147:
                case 220082755:
                    z = false;
                    if (C3683.f11629 >= 0) {
                        iM2566 = (C0630.m2566("ܽ۟") + i3) * (-65);
                        i4 = ((iM2566 ^ i2) * 32017) ^ (-81939394);
                        i5 = -627301885;
                    } else {
                        iM2566 = (i2 - C0630.m2566("ܿܳ")) * 101;
                        i4 = ((iM2566 ^ i3) * 31485) ^ (-12720719);
                        i5 = -1983410496;
                    }
                    break;
                case -291306382:
                case 1021600728:
                    if (C1711.f5919) {
                        iM2566 = (C0630.m2566("ۗ᩷") + i2) * 19;
                        i4 = ((iM2566 ^ i3) * (-31451)) ^ 1109670014;
                        i5 = -810696600;
                    } else {
                        iM2566 = (C0630.m2566("֡᩷") ^ i3) * (-113);
                        i4 = ((iM2566 ^ i2) * (-3237)) ^ (-98595448);
                        i5 = 1862031488;
                    }
                    break;
                case -268570482:
                case 1511819900:
                    if (C4159.f13567) {
                        iM2566 = (C0630.m2566("ۨۨ") + i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM2566 ^ i3) * 31423) ^ (-1475450802);
                        i5 = 885748369;
                    } else {
                        iM2566 = (C0630.m2566("ۗ᩷") + i2) * 19;
                        i4 = ((iM2566 ^ i3) * (-31451)) ^ 1109670014;
                        i5 = -810696600;
                    }
                    break;
                case -117949744:
                case 1408650088:
                    this.f7809 = z;
                    if (this.f7821) {
                        iM2566 = C0630.m2566("ۖᩴ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-31031)) ^ (-1108540480);
                        i5 = -1325958927;
                    } else {
                        iM2566 = (i3 - C0630.m2566("᩺ᩴ")) * 71;
                        i4 = ((iM2566 ^ i2) * (-13115)) ^ 1486238319;
                        i5 = 1788494787;
                    }
                    break;
                case 305410549:
                case 1787265763:
                    C1005.m3501();
                    if (!RunnableC3474.m10630()) {
                        iM2566 = (i2 - C0630.m2566("᩷ܽ")) * 61;
                        i4 = ((iM2566 ^ i3) * 17323) ^ 88739045;
                        i5 = -707177184;
                    } else {
                        iM2566 = C2105.m6981("ۚܶ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-25995)) ^ (-1060874902);
                        i5 = 1597404590;
                    }
                    break;
                case 1004703054:
                case 1036867451:
                    ViewOnClickListenerC1958.m6429();
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = (C0630.m2566("ۗ᩷") + i2) * 19;
                        i4 = ((iM2566 ^ i3) * (-31451)) ^ 1109670014;
                        i5 = -810696600;
                    } else {
                        iM2566 = (C0630.m2566("ܽ۟") + i3) * (-65);
                        i4 = ((iM2566 ^ i2) * 32017) ^ (-81939394);
                        i5 = -627301885;
                    }
                    break;
                case 1069641372:
                case 1082295589:
                    if (C3683.m11222()) {
                        iM2566 = (C0630.m2566("ۗ᩷") + i2) * 19;
                        i4 = ((iM2566 ^ i3) * (-31451)) ^ 1109670014;
                        i5 = -810696600;
                    } else {
                        iM2566 = C2105.m6981("ۧܺ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 30893) ^ (-345299180);
                        i5 = 500148539;
                    }
                    break;
                case 1336359822:
                case 2135981068:
                    if (C21923.f70183 != 0) {
                        iM2566 = (C0630.m2566("ۗ᩷") + i2) * 19;
                        i4 = ((iM2566 ^ i3) * (-31451)) ^ 1109670014;
                        i5 = -810696600;
                    } else {
                        iM2566 = C0630.m2566("᩺᩺") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-4053)) ^ 1543556971;
                        i5 = 1004417812;
                    }
                    break;
                case 1410540880:
                case 1948227904:
                    RunnableC0588.m2441();
                    break;
                default:
                    if (C2167.m7155()) {
                        iM2566 = C0630.m2566("᩸۠") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-21283)) ^ 1312319280;
                        i5 = -980676704;
                    } else {
                        iM2566 = C2105.m6981("ۢ֫") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-18463)) ^ 210350325;
                        i5 = -1297374516;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m7897(int i) {
        AbstractC17366 layoutManager = null;
        int i2 = -242377599;
        int i3 = C1047.f3863;
        int i4 = ServiceConnectionC3453.f10921;
        int iM2566 = (C0630.m2566("ܶۢ") ^ i4) * (-5);
        int i5 = ((iM2566 ^ i3) * 3169) ^ (-533656838);
        int i6 = -1563039692;
        while (true) {
            i2 = ((((i2 ^ i3) * 1509) >> 31) & i5) ^ (iM2566 ^ i6);
            switch (i2) {
                case -2115514082:
                case 709065973:
                    if (C0237.f1507 != 0) {
                        iM2566 = C0630.m2566("ᩴ᩶") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-6973)) ^ (-312489127);
                        i6 = 1317434827;
                    } else {
                        iM2566 = C2105.m6981("ۤᩴ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 16601) ^ 1549939597;
                        i6 = 2082963350;
                    }
                    break;
                case -2063560948:
                case 1996747102:
                    if (C1711.m5736() <= 0) {
                        iM2566 = C2105.m6981("ۙ۬") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-30071)) ^ (-1162929383);
                        i6 = -2146791658;
                    } else {
                        iM2566 = C0630.m2566("ᩴ᩻") ^ i3;
                        i5 = ((iM2566 ^ i4) * 11133) ^ (-319654705);
                        i6 = 293558457;
                    }
                    break;
                case -1785791392:
                case 1494778213:
                    if (C7106.f21815 != 0) {
                        iM2566 = C0630.m2566("ᩴ᩶") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-6973)) ^ (-312489127);
                        i6 = 1317434827;
                    } else {
                        iM2566 = C2105.m6981("ۙ۬") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-30071)) ^ (-1162929383);
                        i6 = -2146791658;
                    }
                    break;
                case -1763599326:
                case 730403671:
                    if (!C2126.f7087) {
                        iM2566 = C0630.m2566("ۚᩳ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-14291)) ^ 469244613;
                        i6 = -731878699;
                    } else {
                        iM2566 = C2105.m6981("ۙ۬") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-30071)) ^ (-1162929383);
                        i6 = -2146791658;
                    }
                    break;
                case -1677454505:
                case 894171838:
                    if (C3537.m10746() <= 0) {
                        iM2566 = C0630.m2566("ᩴ᩶") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-6973)) ^ (-312489127);
                        i6 = 1317434827;
                    } else {
                        iM2566 = C0630.m2566("ۜ۬") ^ i4;
                        i5 = ((iM2566 ^ i3) * 14095) ^ 2000853500;
                        i6 = 182372629;
                    }
                    break;
                case -1569534407:
                case -1502529167:
                    RunnableC0588.m2441();
                    iM2566 = C2105.m6981("ۙ۬") ^ i3;
                    i5 = ((iM2566 ^ i4) * (-30071)) ^ (-1162929383);
                    i6 = -2146791658;
                    break;
                case -1274566329:
                case -33994688:
                    if (C3245.m9925() != 0) {
                        iM2566 = C0630.m2566("ۚᩳ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-14291)) ^ 469244613;
                        i6 = -731878699;
                    } else {
                        iM2566 = C0630.m2566("ۚܶ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-19181)) ^ 510461271;
                        i6 = -915252502;
                    }
                    break;
                case -553320765:
                case -245396753:
                    if (C1504.m5179()) {
                        iM2566 = (C0630.m2566("᩵۫") ^ i4) * 119;
                        i5 = ((iM2566 ^ i3) * (-8347)) ^ (-1366713219);
                        i6 = 1388838964;
                    } else {
                        iM2566 = (C2105.m6981("ᩴ֫") + i4) * 7;
                        i5 = ((iM2566 ^ i3) * (-17499)) ^ (-1071758456);
                        i6 = 663484355;
                    }
                    break;
                case -433461259:
                case -388595186:
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        iM2566 = C2105.m6981("ۙ۬") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-30071)) ^ (-1162929383);
                        i6 = -2146791658;
                    } else {
                        iM2566 = C2105.m6981("۟ۜ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 9627) ^ (-679573501);
                        i6 = -2092637805;
                    }
                    break;
                case 349870195:
                case 745156371:
                    if (C0237.f1507 != 0) {
                        iM2566 = C2105.m6981("ۙ۬") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-30071)) ^ (-1162929383);
                        i6 = -2146791658;
                    } else {
                        iM2566 = (C0630.m2566("᩵ۡ") + i4) * 19;
                        i5 = ((iM2566 ^ i3) * 25069) ^ 1272078388;
                        i6 = -904855991;
                    }
                    break;
                case 629502982:
                case 1879585422:
                    if (C11340.f33930 >= 0) {
                        iM2566 = (C0630.m2566("᩶ۚ") ^ i4) * 45;
                        i5 = ((iM2566 ^ i3) * 1011) ^ 607899970;
                        i6 = 837408998;
                    } else {
                        iM2566 = C2105.m6981("ۙۗ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 10629) ^ (-1510617405);
                        i6 = -1717418492;
                    }
                    break;
                case 886404629:
                case 1055602606:
                    ((C6495) layoutManager).scrollToPositionWithOffset(i, 0);
                    break;
                case 1468931586:
                case 1565900242:
                    if (C1773.f6144 > 0) {
                        iM2566 = (C0630.m2566("᩶ۚ") ^ i4) * 45;
                        i5 = ((iM2566 ^ i3) * 1011) ^ 607899970;
                        i6 = 837408998;
                    } else {
                        iM2566 = C0630.m2566("ۚᩳ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-14291)) ^ 469244613;
                        i6 = -731878699;
                    }
                    break;
                case 1555326845:
                case 1964898384:
                    if (C0798.f2919) {
                        iM2566 = C0630.m2566("ۚᩳ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-14291)) ^ 469244613;
                        i6 = -731878699;
                    } else {
                        iM2566 = (C0630.m2566("ۢܺ") + i3) * q.h;
                        i5 = ((iM2566 ^ i4) * (-8847)) ^ 2082197590;
                        i6 = -1780380829;
                    }
                    break;
                case 1874054974:
                case 2077201553:
                    layoutManager = super.getLayoutManager();
                    if (C4616.f14690 <= 0) {
                        iM2566 = (C2105.m6981("ᩴ֫") + i4) * 7;
                        i5 = ((iM2566 ^ i3) * (-17499)) ^ (-1071758456);
                        i6 = 663484355;
                    } else {
                        iM2566 = C0630.m2566("ܿ۫") ^ i3;
                        i5 = ((iM2566 ^ i4) * 27043) ^ (-990486172);
                        i6 = -1179806480;
                    }
                    break;
                default:
                    C0237.m1481();
                    break;
            }
            return;
        }
    }

    @Override // l.C13132, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = -785462602;
        int i6 = C0630.f2410;
        int i7 = AbstractC2021.f6743;
        int iM2566 = (i6 - C0630.m2566("ۛ᩸")) * 49;
        int i8 = ((iM2566 ^ i7) * (-6445)) ^ 2127895405;
        int i9 = -896390740;
        while (true) {
            i5 = ((((i5 ^ i7) * (-12595)) >> 31) & i8) ^ (iM2566 ^ i9);
            switch (i5) {
                case -2060145520:
                case 1473207371:
                    if (C7106.f21815 != 0) {
                        iM2566 = (i6 - C2105.m6981("ۙܳ")) * (-87);
                        i8 = ((iM2566 ^ i7) * 22383) ^ (-724477408);
                        i9 = -1588081619;
                    } else {
                        iM2566 = (i7 - C0630.m2566("ۜ۠")) * (-93);
                        i8 = ((iM2566 ^ i6) * 243) ^ (-498452059);
                        i9 = 169609973;
                    }
                    break;
                case -1908042072:
                case -73929300:
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        iM2566 = C2105.m6981("ᩳᩳ") ^ i6;
                        i8 = ((iM2566 ^ i7) * 28285) ^ (-1726176623);
                        i9 = -1687739661;
                    } else {
                        iM2566 = C0630.m2566("᩺ۤ") ^ i6;
                        i8 = ((iM2566 ^ i7) * (-16991)) ^ (-1536166110);
                        i9 = -1982363160;
                    }
                    break;
                case -1887532671:
                case 1366651072:
                    C1128.m3851();
                    if (!AbstractC2021.m6574()) {
                        iM2566 = (C0630.m2566("۫ۡ") ^ i6) * 67;
                        i8 = ((iM2566 ^ i7) * (-7145)) ^ (-1021991611);
                        i9 = 1162506998;
                    } else {
                        iM2566 = C2105.m6981("ܶܰ") ^ i7;
                        i8 = ((iM2566 ^ i6) * 32499) ^ 563947076;
                        i9 = 33349520;
                    }
                    break;
                case -1860033451:
                case -194111050:
                    if (C1773.f6144 <= 0) {
                        iM2566 = (i6 - C2105.m6981("ۙܳ")) * (-87);
                        i8 = ((iM2566 ^ i7) * 22383) ^ (-724477408);
                        i9 = -1588081619;
                    } else {
                        iM2566 = C2105.m6981("۟ܿ") ^ i6;
                        i8 = ((iM2566 ^ i7) * 27309) ^ (-2074529832);
                        i9 = -912007182;
                    }
                    break;
                case -1827410700:
                case 1466610893:
                    if (C3019.f9544 >= 0) {
                        iM2566 = C2105.m6981("ᩳᩳ") ^ i6;
                        i8 = ((iM2566 ^ i7) * 28285) ^ (-1726176623);
                        i9 = -1687739661;
                    } else {
                        iM2566 = C0630.m2566("۫ᩳ") ^ i7;
                        i8 = ((iM2566 ^ i6) * (-11933)) ^ 1763026406;
                        i9 = -1760906901;
                    }
                    break;
                case -1443542293:
                case -683803165:
                    C4075.m12263();
                    if (C4616.f14690 <= 0) {
                        iM2566 = (C0630.m2566("۫ۡ") ^ i6) * 67;
                        i8 = ((iM2566 ^ i7) * (-7145)) ^ (-1021991611);
                        i9 = 1162506998;
                    } else {
                        iM2566 = C2105.m6981("ᩳᩳ") ^ i6;
                        i8 = ((iM2566 ^ i7) * 28285) ^ (-1726176623);
                        i9 = -1687739661;
                    }
                    break;
                case -1174415554:
                case 573559079:
                    try {
                        super.onLayout(z, i, i2, i3, i4);
                        break;
                    } catch (Exception unused) {
                    }
                    iM2566 = (C2105.m6981("ۢۧ") + i7) * 43;
                    i8 = ((iM2566 ^ i6) * 15777) ^ 238920549;
                    i9 = -168143108;
                    break;
                case -1046426112:
                case 1702368641:
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        iM2566 = C2105.m6981("ܶܰ") ^ i7;
                        i8 = ((iM2566 ^ i6) * 32499) ^ 563947076;
                        i9 = 33349520;
                    } else {
                        iM2566 = (C0630.m2566("֡֡") + i6) * 59;
                        i8 = ((iM2566 ^ i7) * 26563) ^ (-1791224511);
                        i9 = -327952460;
                    }
                    break;
                case -1043037227:
                case -492925483:
                    AbstractC2021.m6574();
                    C0630.m2564();
                    break;
                case -984333489:
                case 373679574:
                    if (C4616.m13552() != 0) {
                        iM2566 = (i6 - C2105.m6981("ۙܳ")) * (-87);
                        i8 = ((iM2566 ^ i7) * 22383) ^ (-724477408);
                        i9 = -1588081619;
                    } else {
                        iM2566 = C0630.m2566("ۜ᩹") ^ i7;
                        i8 = ((iM2566 ^ i6) * 16197) ^ 1465838369;
                        i9 = -279595104;
                    }
                    break;
                case -918173084:
                case 1620469418:
                    if (C1773.f6144 <= 0) {
                        iM2566 = (C0630.m2566("۫ۡ") ^ i6) * 67;
                        i8 = ((iM2566 ^ i7) * (-7145)) ^ (-1021991611);
                        i9 = 1162506998;
                    } else {
                        iM2566 = (C2105.m6981("ܳۖ") + i7) * 101;
                        i8 = ((iM2566 ^ i6) * 29467) ^ (-1841312226);
                        i9 = -878487246;
                    }
                    break;
                case -111712058:
                case 945558166:
                    C3746.m11369();
                    C3683.m11222();
                    iM2566 = C2105.m6981("ᩳᩳ") ^ i6;
                    i8 = ((iM2566 ^ i7) * 28285) ^ (-1726176623);
                    i9 = -1687739661;
                    break;
                case -100268820:
                case 1656607994:
                    if (C1005.m3501()) {
                        iM2566 = C0630.m2566("֫ᩳ") ^ i6;
                        i8 = ((iM2566 ^ i7) * (-22345)) ^ (-1363851344);
                        i9 = -544962050;
                    } else {
                        iM2566 = (i6 - C2105.m6981("ۙܳ")) * (-87);
                        i8 = ((iM2566 ^ i7) * 22383) ^ (-724477408);
                        i9 = -1588081619;
                    }
                    break;
                case -39076768:
                case 1465300649:
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = C2105.m6981("ᩳᩳ") ^ i6;
                        i8 = ((iM2566 ^ i7) * 28285) ^ (-1726176623);
                        i9 = -1687739661;
                    } else {
                        iM2566 = C2105.m6981("ۚ۠") ^ i7;
                        i8 = ((iM2566 ^ i6) * (-18251)) ^ 1960905879;
                        i9 = -10543570;
                    }
                    break;
                case 98727604:
                case 176389942:
                    if (C1005.f3721) {
                        iM2566 = C2105.m6981("ۘܳ") ^ i7;
                        i8 = ((iM2566 ^ i6) * 19833) ^ 1791139680;
                        i9 = 909914738;
                    } else {
                        iM2566 = C2105.m6981("ܶܰ") ^ i7;
                        i8 = ((iM2566 ^ i6) * 32499) ^ 563947076;
                        i9 = 33349520;
                    }
                    break;
                case 1585932703:
                case 2066828388:
                    this.f7818 = 0;
                    break;
                default:
                    if (C1711.f5919) {
                        iM2566 = (C0630.m2566("۫ۡ") ^ i6) * 67;
                        i8 = ((iM2566 ^ i7) * (-7145)) ^ (-1021991611);
                        i9 = 1162506998;
                    } else {
                        iM2566 = C2105.m6981("ۗ۠") ^ i6;
                        i8 = ((iM2566 ^ i7) * (-25921)) ^ (-1294796723);
                        i9 = 1291178105;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.C13132
    public final AbstractC17366 getLayoutManager() {
        return (C6495) super.getLayoutManager();
    }

    @Override // l.C13132
    public final void scrollToPosition(int i) {
        AbstractC17366 layoutManager = null;
        int i2 = -853972407;
        int i3 = C4075.f12947;
        int i4 = AbstractC2021.f6743;
        int iM2566 = (C0630.m2566("ۘ᩻") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
        int i5 = ((iM2566 ^ i3) * 2063) ^ (-1976726827);
        int i6 = 833366241;
        while (true) {
            i2 = ((((i2 ^ i3) * 15833) >> 31) & i5) ^ (iM2566 ^ i6);
            switch (i2) {
                case -2020218095:
                case -1273619886:
                    if (C0422.m1963()) {
                        iM2566 = (C2105.m6981("ܽۙ") + i4) * 55;
                        i5 = ((iM2566 ^ i3) * 9835) ^ (-1535412364);
                        i6 = -633275960;
                    } else {
                        iM2566 = C2105.m6981("ۨ֡") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-29765)) ^ 1166636189;
                        i6 = 1521617659;
                    }
                    break;
                case -1877315858:
                case 1150712513:
                    if (RunnableC1108.f4040) {
                        iM2566 = C0630.m2566("ۤ᩷") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-32311)) ^ (-1125032837);
                        i6 = -1695074424;
                    } else {
                        iM2566 = C2105.m6981("ۨ֡") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-29765)) ^ 1166636189;
                        i6 = 1521617659;
                    }
                    break;
                case -1856626982:
                case 1347532670:
                    C2105.m6982();
                    if (!C2167.m7155()) {
                        iM2566 = C2105.m6981("ۨ֡") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-29765)) ^ 1166636189;
                        i6 = 1521617659;
                    } else {
                        iM2566 = C2105.m6981("֫ۙ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 22821) ^ (-1060769469);
                        i6 = 1263819823;
                    }
                    break;
                case -1791405650:
                case 517024940:
                    C3245.m9925();
                    iM2566 = C2105.m6981("֫ۙ") ^ i4;
                    i5 = ((iM2566 ^ i3) * 22821) ^ (-1060769469);
                    i6 = 1263819823;
                    break;
                case -1758244732:
                case 1704913650:
                    if (C3663.f11553) {
                        iM2566 = C2105.m6981("۫ۤ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 20237) ^ 1309046808;
                        i6 = -1769283539;
                    } else {
                        iM2566 = C2105.m6981("ۚ᩶") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-609)) ^ 471031999;
                        i6 = 720431873;
                    }
                    break;
                case -1008032712:
                case 2086308446:
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        iM2566 = C2105.m6981("֨᩷") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-20643)) ^ 1643205984;
                        i6 = 117174578;
                    } else {
                        iM2566 = C2105.m6981("۟ܺ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-6061)) ^ (-1236811621);
                        i6 = -555766822;
                    }
                    break;
                case -962414825:
                case 1862007152:
                    if (C2167.m7155()) {
                        iM2566 = C2105.m6981("֨᩷") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-20643)) ^ 1643205984;
                        i6 = 117174578;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ܽۡ")) * 55;
                        i5 = ((iM2566 ^ i4) * (-23697)) ^ 1527275885;
                        i6 = 1947668208;
                    }
                    break;
                case -866301928:
                case 896912107:
                    if (C0483.m2121()) {
                        iM2566 = (i3 - C2105.m6981("ܿۢ")) * (-65);
                        i5 = ((iM2566 ^ i4) * (-30903)) ^ (-592660625);
                        i6 = 187243997;
                    } else {
                        iM2566 = C2105.m6981("֫ۙ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 22821) ^ (-1060769469);
                        i6 = 1263819823;
                    }
                    break;
                case -852007000:
                case 503211298:
                    C7106.m19120();
                    C1504.m5179();
                    break;
                case -756432742:
                case 36533777:
                    if (C3911.f12484 >= 0) {
                        iM2566 = C2105.m6981("۫ۤ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 20237) ^ 1309046808;
                        i6 = -1769283539;
                    } else {
                        iM2566 = C2105.m6981("֫ۙ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 22821) ^ (-1060769469);
                        i6 = 1263819823;
                    }
                    break;
                case -622432496:
                case 1061694268:
                    if (C0050.f910 >= 0) {
                        iM2566 = C0630.m2566("᩶ۧ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-25497)) ^ 764455169;
                        i6 = -1251444350;
                    } else {
                        iM2566 = (C2105.m6981("֨ۨ") + i4) * (-83);
                        i5 = ((iM2566 ^ i3) * (-7627)) ^ 1419718173;
                        i6 = -2082043083;
                    }
                    break;
                case -73146420:
                case 1026577259:
                    C4263.m12819();
                    if (C11340.f33930 >= 0) {
                        iM2566 = C2105.m6981("֨᩷") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-20643)) ^ 1643205984;
                        i6 = 117174578;
                    } else {
                        iM2566 = C2105.m6981("֫ۙ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 22821) ^ (-1060769469);
                        i6 = 1263819823;
                    }
                    break;
                case 1168915610:
                case 1521602449:
                    layoutManager = super.getLayoutManager();
                    if (C2958.f9394 >= 0) {
                        iM2566 = C0630.m2566("᩶ۧ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-25497)) ^ 764455169;
                        i6 = -1251444350;
                    } else {
                        iM2566 = C0630.m2566("۫᩻") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-22033)) ^ (-2075288414);
                        i6 = -134916475;
                    }
                    break;
                case 1228678018:
                case 1451517497:
                    if (C4075.m12263() <= 0) {
                        iM2566 = C2105.m6981("֨᩷") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-20643)) ^ 1643205984;
                        i6 = 117174578;
                    } else {
                        iM2566 = (C2105.m6981("ܳܽ") + i3) * (-105);
                        i5 = ((iM2566 ^ i4) * (-30791)) ^ 1325360518;
                        i6 = -1781348353;
                    }
                    break;
                case 1626426353:
                case 1781685686:
                    if (C3537.f11231 >= 0) {
                        iM2566 = C2105.m6981("֨᩷") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-20643)) ^ 1643205984;
                        i6 = 117174578;
                    } else {
                        iM2566 = (C0630.m2566("ᩴܽ") ^ i4) * (-117);
                        i5 = ((iM2566 ^ i3) * 14969) ^ 1864573645;
                        i6 = 568091444;
                    }
                    break;
                default:
                    ((C6495) layoutManager).scrollToPosition(i);
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m7895() {
        return ((C6495) super.getLayoutManager()).findFirstVisibleItemPosition();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m7896() {
        return ((C6495) super.getLayoutManager()).findLastVisibleItemPosition();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m7903() {
        awakenScrollBars(SnackbarManager.SHORT_DURATION_MS);
    }

    /* JADX WARN: Code duplicated, block: B:136:0x060c A[PHI: r1 r2 r12 r33 r37 r38 r42 r43
      0x060c: PHI (r1v13 boolean) = (r1v6 boolean), (r1v11 boolean), (r1v14 boolean) binds: [B:100:0x0434, B:134:0x05f3, B:124:0x0587] A[DONT_GENERATE, DONT_INLINE]
      0x060c: PHI (r2v11 boolean) = (r2v4 boolean), (r2v9 boolean), (r2v12 boolean) binds: [B:100:0x0434, B:134:0x05f3, B:124:0x0587] A[DONT_GENERATE, DONT_INLINE]
      0x060c: PHI (r12v4 float) = (r12v2 float), (r12v3 float), (r12v2 float) binds: [B:100:0x0434, B:134:0x05f3, B:124:0x0587] A[DONT_GENERATE, DONT_INLINE]
      0x060c: PHI (r33v4 float) = (r33v2 float), (r33v3 float), (r33v2 float) binds: [B:100:0x0434, B:134:0x05f3, B:124:0x0587] A[DONT_GENERATE, DONT_INLINE]
      0x060c: PHI (r37v6 int) = (r37v3 int), (r37v4 int), (r37v7 int) binds: [B:100:0x0434, B:134:0x05f3, B:124:0x0587] A[DONT_GENERATE, DONT_INLINE]
      0x060c: PHI (r38v6 int) = (r38v3 int), (r38v4 int), (r38v7 int) binds: [B:100:0x0434, B:134:0x05f3, B:124:0x0587] A[DONT_GENERATE, DONT_INLINE]
      0x060c: PHI (r42v6 float) = (r42v2 float), (r42v4 float), (r42v7 float) binds: [B:100:0x0434, B:134:0x05f3, B:124:0x0587] A[DONT_GENERATE, DONT_INLINE]
      0x060c: PHI (r43v12 int) = (r43v4 int), (r43v10 int), (r43v13 int) binds: [B:100:0x0434, B:134:0x05f3, B:124:0x0587] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:184:0x092a A[PHI: r2 r3 r4 r5 r24 r28 r31 r37 r38 r42 r43
      0x092a: PHI (r2v51 boolean) = (r2v32 boolean), (r2v33 boolean), (r2v52 boolean) binds: [B:182:0x0911, B:177:0x08db, B:147:0x06ba] A[DONT_GENERATE, DONT_INLINE]
      0x092a: PHI (r3v85 int) = (r3v72 int), (r3v73 int), (r3v86 int) binds: [B:182:0x0911, B:177:0x08db, B:147:0x06ba] A[DONT_GENERATE, DONT_INLINE]
      0x092a: PHI (r4v53 int) = (r4v36 int), (r4v37 int), (r4v54 int) binds: [B:182:0x0911, B:177:0x08db, B:147:0x06ba] A[DONT_GENERATE, DONT_INLINE]
      0x092a: PHI (r5v18 int) = (r5v3 int), (r5v4 int), (r5v19 int) binds: [B:182:0x0911, B:177:0x08db, B:147:0x06ba] A[DONT_GENERATE, DONT_INLINE]
      0x092a: PHI (r24v20 boolean) = (r24v3 boolean), (r24v4 boolean), (r24v21 boolean) binds: [B:182:0x0911, B:177:0x08db, B:147:0x06ba] A[DONT_GENERATE, DONT_INLINE]
      0x092a: PHI (r28v17 int) = (r28v3 int), (r28v4 int), (r28v18 int) binds: [B:182:0x0911, B:177:0x08db, B:147:0x06ba] A[DONT_GENERATE, DONT_INLINE]
      0x092a: PHI (r31v17 float) = (r31v3 float), (r31v4 float), (r31v18 float) binds: [B:182:0x0911, B:177:0x08db, B:147:0x06ba] A[DONT_GENERATE, DONT_INLINE]
      0x092a: PHI (r37v37 int) = (r37v22 int), (r37v23 int), (r37v38 int) binds: [B:182:0x0911, B:177:0x08db, B:147:0x06ba] A[DONT_GENERATE, DONT_INLINE]
      0x092a: PHI (r38v38 int) = (r38v24 int), (r38v25 int), (r38v39 int) binds: [B:182:0x0911, B:177:0x08db, B:147:0x06ba] A[DONT_GENERATE, DONT_INLINE]
      0x092a: PHI (r42v37 float) = (r42v23 float), (r42v24 float), (r42v38 float) binds: [B:182:0x0911, B:177:0x08db, B:147:0x06ba] A[DONT_GENERATE, DONT_INLINE]
      0x092a: PHI (r43v51 int) = (r43v37 int), (r43v38 int), (r43v52 int) binds: [B:182:0x0911, B:177:0x08db, B:147:0x06ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x014c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0172  */
    /* JADX WARN: Code duplicated, block: B:46:0x01c7 A[PHI: r5 r8 r11 r14
      0x01c7: PHI (r5v32 float) = (r5v31 float), (r5v2 float), (r5v2 float) binds: [B:45:0x01c5, B:35:0x0169, B:27:0x012d] A[DONT_GENERATE, DONT_INLINE]
      0x01c7: PHI (r8v4 float) = (r8v3 float), (r8v2 float), (r8v2 float) binds: [B:45:0x01c5, B:35:0x0169, B:27:0x012d] A[DONT_GENERATE, DONT_INLINE]
      0x01c7: PHI (r11v4 float) = (r11v3 float), (r11v2 float), (r11v2 float) binds: [B:45:0x01c5, B:35:0x0169, B:27:0x012d] A[DONT_GENERATE, DONT_INLINE]
      0x01c7: PHI (r14v4 l.ܳ᩸ۡ) = (r14v3 l.ܳ᩸ۡ), (r14v2 l.ܳ᩸ۡ), (r14v2 l.ܳ᩸ۡ) binds: [B:45:0x01c5, B:35:0x0169, B:27:0x012d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0220 A[PHI: r2 r7 r34 r35
      0x0220: PHI (r2v90 float) = (r2v2 float), (r2v87 float), (r2v2 float) binds: [B:55:0x021e, B:49:0x01fb, B:17:0x0111] A[DONT_GENERATE, DONT_INLINE]
      0x0220: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:55:0x021e, B:49:0x01fb, B:17:0x0111] A[DONT_GENERATE, DONT_INLINE]
      0x0220: PHI (r34v6 float) = (r34v4 float), (r34v2 float), (r34v2 float) binds: [B:55:0x021e, B:49:0x01fb, B:17:0x0111] A[DONT_GENERATE, DONT_INLINE]
      0x0220: PHI (r35v5 float) = (r35v4 float), (r35v2 float), (r35v2 float) binds: [B:55:0x021e, B:49:0x01fb, B:17:0x0111] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        int iM6981;
        int i3;
        int i4;
        int i5;
        int iM6982;
        int i6;
        int iM2566;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z3;
        int i15;
        boolean z4;
        int i16;
        int i17;
        int i18;
        float f;
        int i19;
        int i20;
        boolean z5;
        int i21;
        int iM2567;
        int i22;
        int i23;
        boolean z6;
        int iM11358;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int iM2568;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        float f2;
        int iM6983;
        int i34;
        int iM6984;
        int i35;
        int i36;
        int i37;
        int iM2569;
        int i38;
        int iM25610;
        int i39;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i40 = RunnableC3474.f10992;
        int i41 = C0714.f2697;
        int iM6985 = (i41 - C2105.m6981("᩺᩹")) * 61;
        int i42 = ((iM6985 ^ i40) * 17793) ^ (-1324524814);
        Paint paint = null;
        C14792 c14792 = null;
        int i43 = iM6985 ^ (-568554293);
        float f6 = 0.0f;
        int iM3498 = 0;
        float f7 = 0.0f;
        int i44 = 0;
        int i45 = 0;
        float f8 = 0.0f;
        int iComputeVerticalScrollOffset = 0;
        int i46 = 0;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        int iM11931 = 0;
        int i47 = 0;
        int i48 = 0;
        int i49 = 0;
        int i50 = 0;
        int i51 = 0;
        int i52 = 0;
        int i53 = 0;
        int i54 = 0;
        int i55 = 0;
        int i56 = 0;
        float f12 = 0.0f;
        int i57 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        boolean z7 = false;
        boolean z8 = false;
        int i58 = 0;
        int i59 = 1562748325;
        int i60 = 0;
        while (true) {
            i59 = i43 ^ (i42 & (((i59 ^ i40) * (-10975)) >> 31));
            switch (i59) {
                case -2133241994:
                case 746306378:
                    f6 = f6;
                    int i61 = i58;
                    i60 = i60;
                    i = iM3498;
                    z = z8;
                    f11 = 0.0f;
                    i2 = i61;
                    z2 = z7;
                    iM2566 = (C2105.m6981("۟ܳ") ^ i41) * (-7);
                    i7 = ((iM2566 ^ i40) * (-14801)) ^ 330630805;
                    i8 = 1491797755;
                    i9 = iM2566 ^ i8;
                    z7 = z2;
                    i42 = i7;
                    iM3498 = i;
                    i60 = i60;
                    i58 = i2;
                    z8 = z;
                    f6 = f6;
                    i43 = i9;
                    break;
                case -2121085942:
                case -1240848848:
                    RunnableC1937.m6387();
                    if (RunnableC0588.f2309 >= 0) {
                        iM25610 = (C2105.m6981("ۗ֡") ^ i40) * (-11);
                        i10 = ((iM25610 ^ i41) * 28001) ^ 131506612;
                        i39 = -902839091;
                    } else {
                        iM25610 = (i41 - C2105.m6981("۬ܺ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i10 = ((iM25610 ^ i40) * (-14225)) ^ (-1264440472);
                        i39 = -1539222083;
                    }
                    i43 = iM25610 ^ i39;
                    i42 = i10;
                    break;
                case -1972794334:
                case 503813871:
                    f6 = f6;
                    Paint paint2 = this.f7808;
                    i5 = i60;
                    paint2.setColor(i5);
                    if (!C4159.f13567) {
                        paint = paint2;
                        i60 = i5;
                        iM6984 = C0630.m2566("᩹ܰ") ^ i40;
                        i35 = ((iM6984 ^ i41) * (-12267)) ^ (-1937018364);
                        i36 = 1094230195;
                        i37 = iM6984 ^ i36;
                        f2 = f6;
                        i43 = i37;
                        i42 = i35;
                        f6 = f2;
                    } else {
                        iM6982 = C2105.m6981("ܰ᩹") ^ i41;
                        paint = paint2;
                        i42 = ((iM6982 ^ i40) * (-18553)) ^ (-2044447289);
                        i6 = 1691392334;
                        i9 = iM6982 ^ i6;
                        i60 = i5;
                        f6 = f6;
                        i43 = i9;
                    }
                    break;
                case -1967078509:
                case -1533075978:
                    f6 = f6;
                    i58 = i58;
                    i60 = i60;
                    if (i58 > 1500) {
                        iM6981 = C2105.m6981("ۙۧ") ^ i40;
                        i3 = ((iM6981 ^ i41) * (-31539)) ^ 1498400260;
                        i4 = -95300789;
                        i27 = iM6981 ^ i4;
                        i60 = i60;
                        i58 = i58;
                        i42 = i3;
                        f2 = f6;
                        i43 = i27;
                        f6 = f2;
                    } else {
                        i = iM3498;
                        z = z8;
                        i2 = i58;
                        z2 = z7;
                        f11 = f10;
                        iM2566 = (C2105.m6981("۟ܳ") ^ i41) * (-7);
                        i7 = ((iM2566 ^ i40) * (-14801)) ^ 330630805;
                        i8 = 1491797755;
                        i9 = iM2566 ^ i8;
                        z7 = z2;
                        i42 = i7;
                        iM3498 = i;
                        i60 = i60;
                        i58 = i2;
                        z8 = z;
                        f6 = f6;
                        i43 = i9;
                    }
                    break;
                case -1925507936:
                case 957048479:
                    f6 = f6;
                    i15 = i57;
                    i16 = i58;
                    i17 = i60;
                    i18 = iM3498;
                    f = f7;
                    i19 = i55;
                    i20 = i56;
                    i21 = i44;
                    i48 = i15 - i20;
                    z7 = true;
                    if (i20 <= 0) {
                        z4 = false;
                        int iM25611 = C0630.m2566("ᩴۖ") ^ i40;
                        i22 = ((iM25611 ^ i41) * 19521) ^ (-293217129);
                        i31 = iM25611 ^ 2045862045;
                        i55 = i19;
                        iM3498 = i18;
                        i60 = i17;
                        i58 = i16;
                        z8 = z4;
                        f6 = f6;
                        i43 = i31;
                        i42 = i22;
                        i44 = i21;
                        i56 = i20;
                        f7 = f;
                        i57 = i15;
                    } else {
                        int iM6986 = (C2105.m6981("֡ᩳ") + i40) * 23;
                        int i62 = ((iM6986 ^ i41) * (-14465)) ^ (-904424983);
                        i27 = iM6986 ^ 1518660895;
                        i55 = i19;
                        i42 = i62;
                        i44 = i21;
                        iM3498 = i18;
                        i56 = i20;
                        f7 = f;
                        i60 = i17;
                        i57 = i15;
                        i58 = i16;
                        z8 = false;
                        f2 = f6;
                        i43 = i27;
                        f6 = f2;
                    }
                    break;
                case -1895207157:
                case 595058119:
                    float f17 = this.f7805;
                    f16 = f13 - f17;
                    if (C1420.f5096 > 0) {
                        iM2569 = (i40 - C2105.m6981("֡ܺ")) * (-13);
                        f15 = f17;
                        i42 = ((iM2569 ^ i41) * (-14625)) ^ 125126325;
                        i38 = 1242248850;
                        i43 = iM2569 ^ i38;
                    } else {
                        f15 = f17;
                        iM25610 = (i40 - C2105.m6981("ܶܳ")) * (-71);
                        i10 = ((iM25610 ^ i41) * (-7283)) ^ 508545412;
                        i39 = 996983584;
                        i43 = iM25610 ^ i39;
                        i42 = i10;
                    }
                    break;
                case -1857301865:
                case 404264914:
                    f6 = f6;
                    i15 = i57;
                    z4 = z8;
                    i16 = i58;
                    i17 = i60;
                    i18 = iM3498;
                    f = f7;
                    i19 = i55;
                    i20 = i56;
                    z5 = z7;
                    i21 = i44;
                    if (this.f7821) {
                        iM2567 = C0630.m2566("ܰۧ") ^ i41;
                        i22 = ((iM2567 ^ i40) * (-26095)) ^ 123383076;
                        i23 = -400670496;
                    } else {
                        iM2567 = (i40 - C2105.m6981("ܿۙ")) * (-21);
                        i22 = ((iM2567 ^ i41) * (-4715)) ^ 443485516;
                        i23 = 1171316845;
                    }
                    i31 = iM2567 ^ i23;
                    z7 = z5;
                    i55 = i19;
                    iM3498 = i18;
                    i60 = i17;
                    i58 = i16;
                    z8 = z4;
                    f6 = f6;
                    i43 = i31;
                    i42 = i22;
                    i44 = i21;
                    i56 = i20;
                    f7 = f;
                    i57 = i15;
                    break;
                case -1766955690:
                case 242685715:
                    f6 = f6;
                    i15 = i57;
                    boolean z9 = z7;
                    z4 = z8;
                    i16 = i58;
                    i17 = i60;
                    i18 = iM3498;
                    f = f7;
                    i19 = i55;
                    i20 = i56;
                    i21 = i44;
                    if (i48 <= 0) {
                        z7 = z9;
                        int iM25612 = C0630.m2566("ᩴۖ") ^ i40;
                        i22 = ((iM25612 ^ i41) * 19521) ^ (-293217129);
                        i31 = iM25612 ^ 2045862045;
                        i55 = i19;
                        iM3498 = i18;
                        i60 = i17;
                        i58 = i16;
                        z8 = z4;
                        f6 = f6;
                        i43 = i31;
                        i42 = i22;
                        i44 = i21;
                        i56 = i20;
                        f7 = f;
                        i57 = i15;
                    } else {
                        iM2568 = (i41 - C2105.m6981("ۡᩴ")) * (-63);
                        z6 = z9;
                        i42 = ((iM2568 ^ i40) * 4949) ^ 1321059392;
                        i29 = 492960231;
                        int i63 = iM2568 ^ i29;
                        z7 = z6;
                        i55 = i19;
                        iM3498 = i18;
                        i60 = i17;
                        i58 = i16;
                        z8 = z4;
                        f6 = f6;
                        i43 = i63;
                        i44 = i21;
                        i56 = i20;
                        f7 = f;
                        i57 = i15;
                    }
                    break;
                case -1750315815:
                case 1363733821:
                    f6 = f6;
                    i21 = i44;
                    int i64 = i57;
                    z4 = z8;
                    i16 = i58;
                    i17 = i60;
                    i18 = iM3498;
                    f = f7;
                    int i65 = i55;
                    this.f7818 = i65;
                    z6 = z7;
                    int i66 = i47;
                    i26 = i64;
                    iM11358 = i65;
                    i24 = i66;
                    i28 = iM11358;
                    int i67 = i26;
                    i47 = i24;
                    i30 = i67;
                    int iM25613 = C0630.m2566("ۢۗ") ^ i41;
                    z7 = z6;
                    i55 = iM11358;
                    int i68 = i21;
                    i56 = i28;
                    i42 = ((iM25613 ^ i40) * 14875) ^ 523512632;
                    i44 = i68;
                    int i69 = i16;
                    z8 = z4;
                    f6 = f6;
                    i43 = iM25613 ^ 57987720;
                    f7 = f;
                    i57 = i30;
                    iM3498 = i18;
                    i60 = i17;
                    i58 = i69;
                    break;
                case -1726552011:
                case -1340488162:
                    f12 = f5 / i46;
                    float f18 = iM3498;
                    if (C3245.f10203 > 0) {
                        iM2569 = C0630.m2566("᩸۠") ^ i40;
                        f13 = f18;
                        i42 = ((iM2569 ^ i41) * 4391) ^ 878108196;
                        i38 = 1117661954;
                        i43 = iM2569 ^ i38;
                    } else {
                        f13 = f18;
                        f6 = f6;
                        i5 = i60;
                        iM6983 = (C2105.m6981("ܿۗ") + i41) * 17;
                        i10 = ((iM6983 ^ i40) * (-15425)) ^ 377900627;
                        i34 = 718600676;
                        i11 = iM6983 ^ i34;
                        i60 = i5;
                        f6 = f6;
                        i43 = i11;
                        i42 = i10;
                    }
                    break;
                case -1725868551:
                case 730875828:
                    f11 = f10 - (i44 / 300.0f);
                    f6 = f6;
                    z2 = z7;
                    z = z8;
                    i2 = i58;
                    i60 = i60;
                    i = iM3498;
                    iM2566 = (C2105.m6981("۟ܳ") ^ i41) * (-7);
                    i7 = ((iM2566 ^ i40) * (-14801)) ^ 330630805;
                    i8 = 1491797755;
                    i9 = iM2566 ^ i8;
                    z7 = z2;
                    i42 = i7;
                    iM3498 = i;
                    i60 = i60;
                    i58 = i2;
                    z8 = z;
                    f6 = f6;
                    i43 = i9;
                    break;
                case -1682192952:
                case 939168074:
                    f6 = f6;
                    int i70 = i60;
                    i12 = i58;
                    i44 = i12 - 1500;
                    if (i44 >= 300) {
                        i13 = i70;
                        i14 = iM3498;
                        z3 = z8;
                        int iM6987 = C2105.m6981("֡ۨ") ^ i40;
                        z8 = z3;
                        f6 = f6;
                        i43 = iM6987 ^ (-516737092);
                        i32 = i13;
                        i58 = i12;
                        i42 = ((iM6987 ^ i41) * (-30577)) ^ (-72377819);
                        iM3498 = i14;
                        i60 = i32;
                    } else {
                        int iM6988 = C2105.m6981("ܰۜ") ^ i41;
                        int i71 = ((iM6988 ^ i40) * 6545) ^ 1824984977;
                        i9 = iM6988 ^ (-1512065019);
                        i60 = i70;
                        i58 = i12;
                        i42 = i71;
                        f6 = f6;
                        i43 = i9;
                    }
                    break;
                case -1600774581:
                case 443891401:
                    C2167.m7155();
                    if (C0050.f910 >= 0) {
                        f6 = f6;
                        i5 = i60;
                        iM6983 = (C2105.m6981("ܿۗ") + i41) * 17;
                        i10 = ((iM6983 ^ i40) * (-15425)) ^ 377900627;
                        i34 = 718600676;
                        i11 = iM6983 ^ i34;
                        i60 = i5;
                        f6 = f6;
                        i43 = i11;
                        i42 = i10;
                    } else {
                        f6 = f6;
                        iM6984 = C0630.m2566("᩹ܰ") ^ i40;
                        i35 = ((iM6984 ^ i41) * (-12267)) ^ (-1937018364);
                        i36 = 1094230195;
                        i37 = iM6984 ^ i36;
                        f2 = f6;
                        i43 = i37;
                        i42 = i35;
                        f6 = f2;
                    }
                    break;
                case -1489791132:
                case 1543148675:
                    f6 = f6;
                    i60 = (i54 << 24) | i50;
                    if (C2167.m7155()) {
                        iM6984 = C0630.m2566("᩹ܰ") ^ i40;
                        i35 = ((iM6984 ^ i41) * (-12267)) ^ (-1937018364);
                        i36 = 1094230195;
                    } else {
                        iM6984 = (C2105.m6981("᩸ۧ") + i40) * 69;
                        i35 = ((iM6984 ^ i41) * (-15063)) ^ 1232818420;
                        i36 = 2066735715;
                    }
                    i37 = iM6984 ^ i36;
                    f2 = f6;
                    i43 = i37;
                    i42 = i35;
                    f6 = f2;
                    break;
                case -1434784522:
                case 759978056:
                    f6 = f6;
                    i5 = i60;
                    i52 = i49 >>> i51;
                    i53 = 255;
                    if (C5695.f17556 >= 0) {
                        iM6983 = (C0630.m2566("ۜۢ") + i41) * 33;
                        i10 = ((iM6983 ^ i40) * 23379) ^ (-905063324);
                        i34 = -1153109733;
                    } else {
                        iM6983 = (i40 - C0630.m2566("᩹ܿ")) * 75;
                        i10 = ((iM6983 ^ i41) * (-24389)) ^ (-686327930);
                        i34 = 1586665197;
                    }
                    i11 = iM6983 ^ i34;
                    i60 = i5;
                    f6 = f6;
                    i43 = i11;
                    i42 = i10;
                    break;
                case -1432855722:
                case -263904352:
                    f6 = f6;
                    i5 = i60;
                    int i72 = (int) ((i52 & i53) * f11);
                    if (!C2126.f7087) {
                        iM6982 = (C0630.m2566("ܰᩴ") ^ i41) * (-47);
                        i54 = i72;
                        i42 = ((iM6982 ^ i40) * 23741) ^ 1444611603;
                        i6 = -2068851158;
                        i9 = iM6982 ^ i6;
                        i60 = i5;
                        f6 = f6;
                        i43 = i9;
                    } else {
                        i54 = i72;
                        iM6983 = (C2105.m6981("ܿۗ") + i41) * 17;
                        i10 = ((iM6983 ^ i40) * (-15425)) ^ 377900627;
                        i34 = 718600676;
                        i11 = iM6983 ^ i34;
                        i60 = i5;
                        f6 = f6;
                        i43 = i11;
                        i42 = i10;
                    }
                    break;
                case -1428349794:
                case 727775262:
                    f6 = f6;
                    z = z8;
                    int i73 = i58;
                    i60 = i60;
                    iM11931 = C3911.m11931(this);
                    iM3498 = C1005.m3498(this);
                    if (!this.f7811) {
                        int iM6989 = C2105.m6981("ۡۨ") ^ i41;
                        i10 = ((iM6989 ^ i40) * (-7945)) ^ 1204637684;
                        i11 = iM6989 ^ 2026817432;
                        i60 = i60;
                        i58 = i73;
                        z8 = z;
                        f6 = f6;
                        i43 = i11;
                        i42 = i10;
                    } else {
                        int iM25614 = C0630.m2566("ۢ۫") ^ i41;
                        i2 = i73;
                        i42 = ((iM25614 ^ i40) * 13073) ^ 210287745;
                        i9 = iM25614 ^ (-122116818);
                        i60 = i60;
                        i58 = i2;
                        z8 = z;
                        f6 = f6;
                        i43 = i9;
                    }
                    break;
                case -1373259653:
                case 1127911962:
                    f6 = f6;
                    z2 = z7;
                    z = z8;
                    i2 = i58;
                    i60 = i60;
                    i = iM3498;
                    if (f11 <= f14) {
                        iM2566 = C2105.m6981("֨۬") ^ i41;
                        i7 = ((iM2566 ^ i40) * 5533) ^ (-1072807914);
                        i8 = 2120339932;
                    } else {
                        iM2566 = C2105.m6981("֫ᩴ") ^ i40;
                        i7 = ((iM2566 ^ i41) * 30315) ^ 1904141890;
                        i8 = 1062176748;
                    }
                    i9 = iM2566 ^ i8;
                    z7 = z2;
                    i42 = i7;
                    iM3498 = i;
                    i60 = i60;
                    i58 = i2;
                    z8 = z;
                    f6 = f6;
                    i43 = i9;
                    break;
                case -1353114492:
                case 1317204526:
                    f6 = f6;
                    z2 = z7;
                    z = z8;
                    i2 = i58;
                    i60 = i60;
                    i = iM3498;
                    f14 = 0.0f;
                    f10 = 1.0f;
                    if (this.f7811) {
                        f11 = f10;
                        iM2566 = (C2105.m6981("۟ܳ") ^ i41) * (-7);
                        i7 = ((iM2566 ^ i40) * (-14801)) ^ 330630805;
                        i8 = 1491797755;
                    } else {
                        iM2566 = (i40 - C0630.m2566("᩸ܽ")) * 69;
                        i7 = ((iM2566 ^ i41) * 13045) ^ (-361851475);
                        i8 = 1766988155;
                    }
                    i9 = iM2566 ^ i8;
                    z7 = z2;
                    i42 = i7;
                    iM3498 = i;
                    i60 = i60;
                    i58 = i2;
                    z8 = z;
                    f6 = f6;
                    i43 = i9;
                    break;
                case -1322796686:
                case 1995924346:
                    i33 = C21943.f70257;
                    i49 = i33;
                    iM6981 = C0630.m2566("ᩴᩳ") ^ i40;
                    i3 = ((iM6981 ^ i41) * (-14233)) ^ 368138583;
                    i4 = -695925035;
                    i27 = iM6981 ^ i4;
                    i60 = i60;
                    i58 = i58;
                    i42 = i3;
                    f2 = f6;
                    i43 = i27;
                    f6 = f2;
                    break;
                case -1316499446:
                case 2126728955:
                    break;
                case -1308557892:
                case 1402246476:
                    f6 = f6;
                    i15 = i57;
                    boolean z10 = z7;
                    z4 = z8;
                    i16 = i58;
                    i17 = i60;
                    i18 = iM3498;
                    f = f7;
                    i20 = i56;
                    i21 = i44;
                    this.f7821 = z10;
                    setVerticalScrollBarEnabled(z10);
                    i19 = i55;
                    z5 = z10;
                    iM2567 = C0630.m2566("ܰۧ") ^ i41;
                    i22 = ((iM2567 ^ i40) * (-26095)) ^ 123383076;
                    i23 = -400670496;
                    i31 = iM2567 ^ i23;
                    z7 = z5;
                    i55 = i19;
                    iM3498 = i18;
                    i60 = i17;
                    i58 = i16;
                    z8 = z4;
                    f6 = f6;
                    i43 = i31;
                    i42 = i22;
                    i44 = i21;
                    i56 = i20;
                    f7 = f;
                    i57 = i15;
                    break;
                case -1217624825:
                case 1493124633:
                    f6 = f6;
                    i5 = i60;
                    i50 = i49 & 16777215;
                    i51 = 24;
                    if (C1711.f5919) {
                        iM6983 = (C2105.m6981("ܿۗ") + i41) * 17;
                        i10 = ((iM6983 ^ i40) * (-15425)) ^ 377900627;
                        i34 = 718600676;
                    } else {
                        iM6983 = C2105.m6981("᩶ۘ") ^ i41;
                        i10 = ((iM6983 ^ i40) * (-19161)) ^ 472510592;
                        i34 = -1560249993;
                    }
                    i11 = iM6983 ^ i34;
                    i60 = i5;
                    f6 = f6;
                    i43 = i11;
                    i42 = i10;
                    break;
                case -1185535177:
                case -265388667:
                    this.f7815 = z8;
                    break;
                case -1109787592:
                case 63008922:
                    f6 = f6;
                    i15 = i57;
                    z4 = z8;
                    i16 = i58;
                    i17 = i60;
                    i18 = iM3498;
                    f = f7;
                    i19 = i55;
                    i20 = i56;
                    z5 = z7;
                    i21 = i44;
                    if (getAdapter() == null) {
                        iM2567 = (i41 - C2105.m6981("ᩳܺ")) * (-123);
                        i22 = ((iM2567 ^ i40) * (-7007)) ^ (-1873993038);
                        i23 = -548892363;
                    } else {
                        iM2567 = (C0630.m2566("᩶᩷") + i40) * (-117);
                        i22 = ((iM2567 ^ i41) * 25619) ^ 593790304;
                        i23 = 93767131;
                    }
                    i31 = iM2567 ^ i23;
                    z7 = z5;
                    i55 = i19;
                    iM3498 = i18;
                    i60 = i17;
                    i58 = i16;
                    z8 = z4;
                    f6 = f6;
                    i43 = i31;
                    i42 = i22;
                    i44 = i21;
                    i56 = i20;
                    f7 = f;
                    i57 = i15;
                    break;
                case -1102340053:
                case 50769208:
                    this.f7815 = z8;
                    break;
                case -918839040:
                case 1841370687:
                    f8 = f6 - f3;
                    f7 = i45;
                    f9 = f7 + f15;
                    c14792 = this.f7823;
                    if (C3245.m9925() != 0) {
                        iM25610 = (i41 - C2105.m6981("۬ܺ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i10 = ((iM25610 ^ i40) * (-14225)) ^ (-1264440472);
                        i39 = -1539222083;
                    } else {
                        iM25610 = (i40 - C0630.m2566("᩷ۡ")) * 35;
                        i10 = ((iM25610 ^ i41) * (-14069)) ^ (-1761498081);
                        i39 = 646655082;
                    }
                    i43 = iM25610 ^ i39;
                    i42 = i10;
                    break;
                case -914031040:
                case -892403453:
                    C0050.m940();
                    if (C2167.m7155()) {
                        iM25610 = (C0630.m2566("ܽۛ") + i41) * (-119);
                        i10 = ((iM25610 ^ i40) * 19265) ^ 859623076;
                        i39 = 1499304633;
                    } else {
                        iM25610 = (i40 - C2105.m6981("ܶܳ")) * (-71);
                        i10 = ((iM25610 ^ i41) * (-7283)) ^ 508545412;
                        i39 = 996983584;
                    }
                    i43 = iM25610 ^ i39;
                    i42 = i10;
                    break;
                case -661588204:
                case 907270701:
                    f6 = f6;
                    i15 = i57;
                    z4 = z8;
                    i16 = i58;
                    i17 = i60;
                    i18 = iM3498;
                    f = f7;
                    i19 = i55;
                    i20 = i56;
                    z5 = z7;
                    i21 = i44;
                    super.dispatchDraw(canvas);
                    if (this.f7809) {
                        iM2567 = (C0630.m2566("ۨۖ") + i40) * (-63);
                        i22 = ((iM2567 ^ i41) * (-12087)) ^ (-1218080556);
                        i23 = -457149631;
                    } else {
                        iM2567 = (i41 - C2105.m6981("ᩳܺ")) * (-123);
                        i22 = ((iM2567 ^ i40) * (-7007)) ^ (-1873993038);
                        i23 = -548892363;
                    }
                    i31 = iM2567 ^ i23;
                    z7 = z5;
                    i55 = i19;
                    iM3498 = i18;
                    i60 = i17;
                    i58 = i16;
                    z8 = z4;
                    f6 = f6;
                    i43 = i31;
                    i42 = i22;
                    i44 = i21;
                    i56 = i20;
                    f7 = f;
                    i57 = i15;
                    break;
                case -581412153:
                case 171461363:
                    f6 = f6;
                    z2 = z7;
                    z = z8;
                    i2 = i58;
                    i60 = i60;
                    i = iM3498;
                    if (this.f7813) {
                        f11 = f10;
                        iM2566 = (C2105.m6981("۟ܳ") ^ i41) * (-7);
                        i7 = ((iM2566 ^ i40) * (-14801)) ^ 330630805;
                        i8 = 1491797755;
                    } else {
                        iM2566 = C0630.m2566("ۨۘ") ^ i40;
                        i7 = ((iM2566 ^ i41) * 18741) ^ (-1577374724);
                        i8 = 228269112;
                    }
                    i9 = iM2566 ^ i8;
                    z7 = z2;
                    i42 = i7;
                    iM3498 = i;
                    i60 = i60;
                    i58 = i2;
                    z8 = z;
                    f6 = f6;
                    i43 = i9;
                    break;
                case -485860584:
                case 137361430:
                    C2126.m7040();
                    if (C3746.m11369() >= 0) {
                        iM25610 = (i41 - C2105.m6981("۬ܺ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i10 = ((iM25610 ^ i40) * (-14225)) ^ (-1264440472);
                        i39 = -1539222083;
                    } else {
                        iM25610 = C2105.m6981("֫ܳ") ^ i40;
                        i10 = ((iM25610 ^ i41) * 9109) ^ (-2050017841);
                        i39 = -1771016934;
                    }
                    i43 = iM25610 ^ i39;
                    i42 = i10;
                    break;
                case -481546160:
                case 322027997:
                    if (C4616.m13552() == 0) {
                        f6 = f6;
                        iM6984 = C0630.m2566("᩹ܰ") ^ i40;
                        i35 = ((iM6984 ^ i41) * (-12267)) ^ (-1937018364);
                        i36 = 1094230195;
                        i37 = iM6984 ^ i36;
                        f2 = f6;
                        i43 = i37;
                        i42 = i35;
                        f6 = f2;
                    } else {
                        iM25610 = C2105.m6981("֫ܳ") ^ i40;
                        i10 = ((iM25610 ^ i41) * 9109) ^ (-2050017841);
                        i39 = -1771016934;
                        i43 = iM25610 ^ i39;
                        i42 = i10;
                    }
                    break;
                case -449112460:
                case 773775424:
                    C0422.m1963();
                    C2105.m6982();
                    iM25610 = (C2105.m6981("ۗ֡") ^ i40) * (-11);
                    i10 = ((iM25610 ^ i41) * 28001) ^ 131506612;
                    i39 = -902839091;
                    i43 = iM25610 ^ i39;
                    i42 = i10;
                    break;
                case -408783347:
                case 1031927006:
                    f6 = f6;
                    i15 = i57;
                    boolean z11 = z7;
                    z4 = z8;
                    i16 = i58;
                    i17 = i60;
                    i18 = iM3498;
                    f = f7;
                    i20 = i56;
                    i21 = i44;
                    if (i15 / i20 <= 3.5f) {
                        z7 = z11;
                        i19 = i55;
                        int iM25615 = C0630.m2566("ᩴۖ") ^ i40;
                        i22 = ((iM25615 ^ i41) * 19521) ^ (-293217129);
                        i31 = iM25615 ^ 2045862045;
                        i55 = i19;
                        iM3498 = i18;
                        i60 = i17;
                        i58 = i16;
                        z8 = z4;
                        f6 = f6;
                        i43 = i31;
                        i42 = i22;
                        i44 = i21;
                        i56 = i20;
                        f7 = f;
                        i57 = i15;
                    } else {
                        int iM25616 = C0630.m2566("۫ۘ") ^ i40;
                        z7 = z11;
                        i42 = ((iM25616 ^ i41) * 10469) ^ (-1844507752);
                        i44 = i21;
                        i56 = i20;
                        f7 = f;
                        i57 = i15;
                        i25 = i16;
                        z8 = z4;
                        f6 = f6;
                        i43 = iM25616 ^ (-981646768);
                        iM3498 = i18;
                        i60 = i17;
                        i58 = i25;
                    }
                    break;
                case -399401756:
                case 1293417998:
                    i45 = (int) (f16 * f12);
                    f6 = iM11931;
                    if (RunnableC1937.f6483 >= 0) {
                        iM25610 = (i40 - C2105.m6981("ܶܳ")) * (-71);
                        i10 = ((iM25610 ^ i41) * (-7283)) ^ 508545412;
                        i39 = 996983584;
                    } else {
                        iM25610 = C0630.m2566("۬ۨ") ^ i41;
                        i10 = ((iM25610 ^ i40) * 8985) ^ 1399670483;
                        i39 = -477179554;
                    }
                    i43 = iM25610 ^ i39;
                    i42 = i10;
                    break;
                case -371226435:
                case 1911473601:
                    f6 = f6;
                    i28 = i47;
                    i15 = i57;
                    z4 = z8;
                    i16 = i58;
                    i17 = i60;
                    i18 = iM3498;
                    f = f7;
                    i19 = i55;
                    i20 = i56;
                    z6 = z7;
                    i21 = i44;
                    if (i19 <= i28) {
                        i47 = i28;
                        i30 = i15;
                        iM11358 = i19;
                        int iM25617 = C0630.m2566("ۢۗ") ^ i41;
                        z7 = z6;
                        i55 = iM11358;
                        int i610 = i21;
                        i56 = i28;
                        i42 = ((iM25617 ^ i40) * 14875) ^ 523512632;
                        i44 = i610;
                        int i611 = i16;
                        z8 = z4;
                        f6 = f6;
                        i43 = iM25617 ^ 57987720;
                        f7 = f;
                        i57 = i30;
                        iM3498 = i18;
                        i60 = i17;
                        i58 = i611;
                    } else {
                        iM2568 = C0630.m2566("ᩴۨ") ^ i41;
                        i47 = i28;
                        i42 = ((iM2568 ^ i40) * (-22653)) ^ 1594516520;
                        i29 = 434138160;
                        int i612 = iM2568 ^ i29;
                        z7 = z6;
                        i55 = i19;
                        iM3498 = i18;
                        i60 = i17;
                        i58 = i16;
                        z8 = z4;
                        f6 = f6;
                        i43 = i612;
                        i44 = i21;
                        i56 = i20;
                        f7 = f;
                        i57 = i15;
                    }
                    break;
                case -358647270:
                case 688753554:
                    float f19 = this.f7814;
                    f4 = f11 * f19;
                    float f20 = iComputeVerticalScrollOffset;
                    if (C22628.f73083 <= 0) {
                        int iM69810 = (i40 - C2105.m6981("ۧ᩻")) * (-31);
                        i42 = ((iM69810 ^ i41) * 31239) ^ 1103183006;
                        i43 = iM69810 ^ 1054542032;
                        f3 = f19;
                        f5 = f20;
                    } else {
                        int iM25618 = (C0630.m2566("ۤۗ") ^ i41) * 13;
                        f6 = f6;
                        i35 = ((iM25618 ^ i40) * 12597) ^ 1099260700;
                        i37 = iM25618 ^ (-1978346104);
                        f3 = f19;
                        f5 = f20;
                        f2 = f6;
                        i43 = i37;
                        i42 = i35;
                        f6 = f2;
                    }
                    break;
                case -268160834:
                case 550590153:
                    if (C1294.f4556 < 0) {
                        f6 = f6;
                        i5 = i60;
                        iM6983 = (C0630.m2566("ۜۢ") + i41) * 33;
                        i10 = ((iM6983 ^ i40) * 23379) ^ (-905063324);
                        i34 = -1153109733;
                        i11 = iM6983 ^ i34;
                        i60 = i5;
                        f6 = f6;
                        i43 = i11;
                        i42 = i10;
                    }
                    iM25610 = C2105.m6981("֫ܳ") ^ i40;
                    i10 = ((iM25610 ^ i41) * 9109) ^ (-2050017841);
                    i39 = -1771016934;
                    i43 = iM25610 ^ i39;
                    i42 = i10;
                    break;
                case -159317598:
                case 663159015:
                    i33 = this.f7806;
                    i49 = i33;
                    iM6981 = C0630.m2566("ᩴᩳ") ^ i40;
                    i3 = ((iM6981 ^ i41) * (-14233)) ^ 368138583;
                    i4 = -695925035;
                    i27 = iM6981 ^ i4;
                    i60 = i60;
                    i58 = i58;
                    i42 = i3;
                    f2 = f6;
                    i43 = i27;
                    f6 = f2;
                    break;
                case -140896673:
                case 1707447208:
                    if (C4075.f12947 >= 0) {
                        iM25610 = (C2105.m6981("ۗ֡") ^ i40) * (-11);
                        i10 = ((iM25610 ^ i41) * 28001) ^ 131506612;
                        i39 = -902839091;
                    } else {
                        iM25610 = (C0630.m2566("ܽۛ") + i41) * (-119);
                        i10 = ((iM25610 ^ i40) * 19265) ^ 859623076;
                        i39 = 1499304633;
                    }
                    i43 = iM25610 ^ i39;
                    i42 = i10;
                    break;
                case 14608254:
                case 229291556:
                    C3663.m11168();
                    C0237.m1481();
                    break;
                case 267454954:
                case 554625832:
                    f6 = f6;
                    z = z8;
                    int i74 = i58;
                    i60 = i60;
                    this.f7821 = z;
                    setVerticalScrollBarEnabled(z);
                    i2 = i74;
                    i = iM3498;
                    z2 = z7;
                    iM2566 = C2105.m6981("֨ۤ") ^ i41;
                    i7 = ((iM2566 ^ i40) * (-6749)) ^ (-1531003740);
                    i8 = -1523624897;
                    i9 = iM2566 ^ i8;
                    z7 = z2;
                    i42 = i7;
                    iM3498 = i;
                    i60 = i60;
                    i58 = i2;
                    z8 = z;
                    f6 = f6;
                    i43 = i9;
                    break;
                case 991484906:
                case 1501881089:
                    C3432.m10477();
                    if (C1711.m5736() > 0) {
                        iM25610 = (C2105.m6981("ۗ֡") ^ i40) * (-11);
                        i10 = ((iM25610 ^ i41) * 28001) ^ 131506612;
                        i39 = -902839091;
                    } else {
                        iM25610 = C0630.m2566("᩸ᩴ") ^ i41;
                        i10 = ((iM25610 ^ i40) * (-29017)) ^ 639752151;
                        i39 = 1149457890;
                    }
                    i43 = iM25610 ^ i39;
                    i42 = i10;
                    break;
                case 1002161249:
                case 1925843044:
                    f6 = f6;
                    f = f7;
                    int i75 = i56;
                    z6 = z7;
                    z4 = z8;
                    i16 = i58;
                    i17 = i60;
                    i18 = iM3498;
                    i21 = i44;
                    int itemCount = getAdapter().getItemCount();
                    iM11358 = C3746.m11358(this);
                    i24 = this.f7818;
                    if (iM11358 == i24) {
                        i26 = itemCount;
                        i28 = iM11358;
                        int i613 = i26;
                        i47 = i24;
                        i30 = i613;
                        int iM25619 = C0630.m2566("ۢۗ") ^ i41;
                        z7 = z6;
                        i55 = iM11358;
                        int i614 = i21;
                        i56 = i28;
                        i42 = ((iM25619 ^ i40) * 14875) ^ 523512632;
                        i44 = i614;
                        int i615 = i16;
                        z8 = z4;
                        f6 = f6;
                        i43 = iM25619 ^ 57987720;
                        f7 = f;
                        i57 = i30;
                        iM3498 = i18;
                        i60 = i17;
                        i58 = i615;
                    } else {
                        int iM69811 = (i41 - C2105.m6981("ᩳܽ")) * (-81);
                        i42 = ((iM69811 ^ i40) * 17119) ^ 1234897964;
                        z7 = z6;
                        i55 = iM11358;
                        i25 = i16;
                        z8 = z4;
                        f6 = f6;
                        i43 = iM69811 ^ 270663072;
                        i44 = i21;
                        i56 = i75;
                        f7 = f;
                        i57 = itemCount;
                        i47 = i24;
                        iM3498 = i18;
                        i60 = i17;
                        i58 = i25;
                    }
                    break;
                case 1143091171:
                case 1833422496:
                    c14792.m35175(f8, f7, f6, f9);
                    canvas.drawRect(f6 - f4, f7, f6, f9, paint);
                    postInvalidate();
                    break;
                case 1587904616:
                case 1786544857:
                    f6 = f6;
                    z2 = z7;
                    z = z8;
                    i2 = i58;
                    i60 = i60;
                    i = iM3498;
                    this.f7815 = z2;
                    if (this.f7821) {
                        iM2566 = C0630.m2566("֫ۧ") ^ i41;
                        i7 = ((iM2566 ^ i40) * 17087) ^ 1099904278;
                        i8 = -1354676311;
                    } else {
                        iM2566 = C2105.m6981("֨ۤ") ^ i41;
                        i7 = ((iM2566 ^ i40) * (-6749)) ^ (-1531003740);
                        i8 = -1523624897;
                    }
                    i9 = iM2566 ^ i8;
                    z7 = z2;
                    i42 = i7;
                    iM3498 = i;
                    i60 = i60;
                    i58 = i2;
                    z8 = z;
                    f6 = f6;
                    i43 = i9;
                    break;
                case 1625993945:
                case 1819348325:
                    f6 = f6;
                    z3 = z8;
                    i13 = i60;
                    int i76 = iM3498;
                    int iM10751 = (int) (C3537.m10751() - this.f7817);
                    if (iM10751 >= 0) {
                        int iM25620 = (C0630.m2566("ۛ֡") ^ i40) * (-15);
                        i14 = i76;
                        i42 = ((iM25620 ^ i41) * (-2695)) ^ (-1148788237);
                        z8 = z3;
                        f6 = f6;
                        i43 = iM25620 ^ (-405306579);
                        i32 = i13;
                        i58 = iM10751;
                    } else {
                        i14 = i76;
                        i12 = iM10751;
                        int iM69812 = C2105.m6981("֡ۨ") ^ i40;
                        z8 = z3;
                        f6 = f6;
                        i43 = iM69812 ^ (-516737092);
                        i32 = i13;
                        i58 = i12;
                        i42 = ((iM69812 ^ i41) * (-30577)) ^ (-72377819);
                    }
                    iM3498 = i14;
                    i60 = i32;
                    break;
                case 1716633418:
                case 2030213657:
                    f6 = f6;
                    i15 = i57;
                    z4 = z8;
                    i16 = i58;
                    i17 = i60;
                    i18 = iM3498;
                    f = f7;
                    i20 = i56;
                    i21 = i44;
                    this.f7815 = z4;
                    i19 = i55;
                    z5 = z7;
                    iM2567 = (i41 - C2105.m6981("ᩳܺ")) * (-123);
                    i22 = ((iM2567 ^ i40) * (-7007)) ^ (-1873993038);
                    i23 = -548892363;
                    i31 = iM2567 ^ i23;
                    z7 = z5;
                    i55 = i19;
                    iM3498 = i18;
                    i60 = i17;
                    i58 = i16;
                    z8 = z4;
                    f6 = f6;
                    i43 = i31;
                    i42 = i22;
                    i44 = i21;
                    i56 = i20;
                    f7 = f;
                    i57 = i15;
                    break;
                default:
                    f6 = f6;
                    z2 = z7;
                    z = z8;
                    i2 = i58;
                    i60 = i60;
                    i = iM3498;
                    int iComputeVerticalScrollRange = computeVerticalScrollRange();
                    int iComputeVerticalScrollExtent = computeVerticalScrollExtent();
                    iComputeVerticalScrollOffset = computeVerticalScrollOffset();
                    i46 = iComputeVerticalScrollRange - iComputeVerticalScrollExtent;
                    if (i46 <= 0) {
                        iM2566 = (C0630.m2566("᩷᩹") ^ i40) * 91;
                        i7 = ((iM2566 ^ i41) * 13333) ^ (-17846597);
                        i8 = -855179219;
                    } else {
                        iM2566 = (i41 - C2105.m6981("ۗ۠")) * (-15);
                        i7 = ((iM2566 ^ i40) * 26593) ^ 249040275;
                        i8 = -404178470;
                    }
                    i9 = iM2566 ^ i8;
                    z7 = z2;
                    i42 = i7;
                    iM3498 = i;
                    i60 = i60;
                    i58 = i2;
                    z8 = z;
                    f6 = f6;
                    i43 = i9;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x042f A[PHI: r3
      0x042f: PHI (r3v3 boolean) = 
      (r3v2 boolean)
      (r3v2 boolean)
      (r3v2 boolean)
      (r3v2 boolean)
      (r3v2 boolean)
      (r3v2 boolean)
      (r3v2 boolean)
      (r3v4 boolean)
     binds: [B:109:0x03e2, B:92:0x0338, B:83:0x02c2, B:78:0x028b, B:66:0x0205, B:63:0x01ff, B:42:0x0126, B:6:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:122:0x047d  */
    /* JADX WARN: Code duplicated, block: B:47:0x014c A[PHI: r15 r16
      0x014c: PHI (r15v3 float) = (r15v2 float), (r15v2 float), (r15v4 float) binds: [B:21:0x00d4, B:9:0x0077, B:46:0x014a] A[DONT_GENERATE, DONT_INLINE]
      0x014c: PHI (r16v3 int) = (r16v2 int), (r16v2 int), (r16v4 int) binds: [B:21:0x00d4, B:9:0x0077, B:46:0x014a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01a8 A[PHI: r11
      0x01a8: PHI (r11v4 float) = (r11v3 float), (r11v2 float) binds: [B:55:0x01a6, B:24:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0229 A[PHI: r9 r17
      0x0229: PHI (r9v5 float) = (r9v3 float), (r9v2 float), (r9v2 float), (r9v2 float), (r9v2 float) binds: [B:71:0x0227, B:30:0x00e6, B:27:0x00e0, B:13:0x0095, B:39:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x0229: PHI (r17v4 float) = (r17v2 float), (r17v2 float), (r17v2 float), (r17v2 float), (r17v7 float) binds: [B:71:0x0227, B:30:0x00e6, B:27:0x00e0, B:13:0x0095, B:39:0x0106] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x025d A[PHI: r8 r10 r12 r13 r14
      0x025d: PHI (r8v4 float) = (r8v3 float), (r8v2 float), (r8v2 float) binds: [B:75:0x025b, B:59:0x01e2, B:51:0x0186] A[DONT_GENERATE, DONT_INLINE]
      0x025d: PHI (r10v4 float) = (r10v2 float), (r10v3 float), (r10v2 float) binds: [B:75:0x025b, B:59:0x01e2, B:51:0x0186] A[DONT_GENERATE, DONT_INLINE]
      0x025d: PHI (r12v3 float) = (r12v2 float), (r12v2 float), (r12v4 float) binds: [B:75:0x025b, B:59:0x01e2, B:51:0x0186] A[DONT_GENERATE, DONT_INLINE]
      0x025d: PHI (r13v3 float) = (r13v2 float), (r13v2 float), (r13v4 float) binds: [B:75:0x025b, B:59:0x01e2, B:51:0x0186] A[DONT_GENERATE, DONT_INLINE]
      0x025d: PHI (r14v3 float) = (r14v2 float), (r14v2 float), (r14v4 float) binds: [B:75:0x025b, B:59:0x01e2, B:51:0x0186] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x0318  */
    /* JADX WARN: Code duplicated, block: B:96:0x0358 A[PHI: r7
      0x0358: PHI (r7v4 float) = (r7v3 float), (r7v2 float), (r7v2 float), (r7v2 float) binds: [B:95:0x0356, B:32:0x00ea, B:30:0x00e6, B:21:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.C13132, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iM2566;
        int i;
        int i2;
        int iM6981;
        int i3;
        int i4 = C1420.f5096;
        int i5 = C0050.f910;
        int iM2567 = (C0630.m2566("ܺۤ") ^ i5) * (-115);
        int i6 = ((iM2567 ^ i4) * 10833) ^ 35519097;
        C14792 c14792 = null;
        int i7 = iM2567 ^ (-311176797);
        boolean z = false;
        boolean z2 = false;
        int actionMasked = 0;
        float y = 0.0f;
        float f = 0.0f;
        float f2 = 0.0f;
        float x = 0.0f;
        float y2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        int i8 = 0;
        float f7 = 0.0f;
        int i9 = -546940162;
        boolean zOnInterceptTouchEvent = false;
        while (true) {
            i9 = i7 ^ (i6 & (((i9 ^ i4) * 28167) >> 31));
            switch (i9) {
                case -1930305558:
                case 1225078939:
                    if (c14792.m35178(this.f7807, this.f7812)) {
                        iM2566 = (i5 - C0630.m2566("֡ۘ")) * 49;
                        i = ((iM2566 ^ i4) * (-5521)) ^ 1687296290;
                        i2 = 500700101;
                    } else {
                        iM2566 = C0630.m2566("ۨܽ") ^ i4;
                        i = ((iM2566 ^ i5) * (-5299)) ^ 1777852211;
                        i2 = -340773477;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1918752157:
                case -629982913:
                    C11340.m28031();
                    iM2566 = (i4 - C0630.m2566("ܺۜ")) * (-27);
                    i = ((iM2566 ^ i5) * 2139) ^ (-674706672);
                    i2 = -1877527418;
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1913566803:
                case -951217563:
                    if (actionMasked != z) {
                        iM2566 = (i5 - C2105.m6981("ۘ۬")) * (-125);
                        i = ((iM2566 ^ i4) * 26835) ^ 114376208;
                        i2 = -631393300;
                    } else {
                        iM2566 = (i5 - C2105.m6981("ۛ֨")) * 3;
                        i = ((iM2566 ^ i4) * (-4915)) ^ 1315609668;
                        i2 = 1682876037;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1851625505:
                case 1020003693:
                    this.f7804 = z2;
                    iM2566 = (C0630.m2566("ۛᩴ") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i = ((iM2566 ^ i5) * 16935) ^ (-1968800570);
                    i2 = -1929401307;
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1814942818:
                case -1499927915:
                    f2 = this.f7812;
                    if (C0483.f2088 >= 0) {
                        iM2566 = C0630.m2566("ۧۤ") ^ i5;
                        i = ((iM2566 ^ i4) * 26271) ^ 2106384482;
                        i2 = 651622569;
                    } else {
                        iM2566 = C2105.m6981("ܿ᩶") ^ i4;
                        i = ((iM2566 ^ i5) * 15265) ^ (-262367661);
                        i2 = 1337842960;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1675203866:
                case -467049687:
                    if (C2126.m7040()) {
                        iM2566 = (C0630.m2566("ܳۖ") + i5) * 65;
                        i = ((iM2566 ^ i4) * 1809) ^ (-1654814034);
                        i2 = 1119993258;
                    } else {
                        iM2566 = (C0630.m2566("ۨۧ") + i5) * (-5);
                        i = ((iM2566 ^ i4) * (-15123)) ^ 751370954;
                        i2 = 1438517554;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1494069421:
                case -2576672:
                    return zOnInterceptTouchEvent;
                case -1468386470:
                case -1230693653:
                    this.f7804 = z;
                    iM2566 = (C0630.m2566("ۛᩴ") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i = ((iM2566 ^ i5) * 16935) ^ (-1968800570);
                    i2 = -1929401307;
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1467703282:
                case 298641832:
                    this.f7807 = motionEvent.getX();
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = (C0630.m2566("ܳۖ") + i5) * 65;
                        i = ((iM2566 ^ i4) * 1809) ^ (-1654814034);
                        i2 = 1119993258;
                    } else {
                        iM2566 = C2105.m6981("ۧۜ") ^ i5;
                        i = ((iM2566 ^ i4) * 26725) ^ 1694581365;
                        i2 = 1127474695;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1446336903:
                case 167052897:
                    if (this.f7804) {
                        iM2566 = (C2105.m6981("᩶ۜ") ^ i4) * (-113);
                        i = ((iM2566 ^ i5) * 2739) ^ 730459858;
                        i2 = 480831475;
                    } else {
                        iM2566 = (C0630.m2566("ۛᩴ") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM2566 ^ i5) * 16935) ^ (-1968800570);
                        i2 = -1929401307;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1384787944:
                case -654260860:
                    if (C4075.f12947 < 0) {
                        iM2566 = C0630.m2566("ۧۤ") ^ i5;
                        i = ((iM2566 ^ i4) * 26271) ^ 2106384482;
                        i2 = 651622569;
                    } else {
                        iM2566 = (C0630.m2566("ܳۖ") + i5) * 65;
                        i = ((iM2566 ^ i4) * 1809) ^ (-1654814034);
                        i2 = 1119993258;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1178391452:
                case 1165759932:
                    C1005.m3501();
                    if (C3683.f11629 >= 0) {
                        iM2566 = (i4 - C0630.m2566("ܺۜ")) * (-27);
                        i = ((iM2566 ^ i5) * 2139) ^ (-674706672);
                        i2 = -1877527418;
                    } else {
                        iM2566 = C2105.m6981("᩺ۘ") ^ i4;
                        i = ((iM2566 ^ i5) * (-4651)) ^ 900033021;
                        i2 = 1735927717;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1083995850:
                case 1430763718:
                    if (f6 > i8 * i8) {
                        iM2566 = (i5 - C2105.m6981("ᩴܶ")) * (-81);
                        i = ((iM2566 ^ i4) * (-13345)) ^ 1893106775;
                        i2 = -515070756;
                    } else {
                        iM2566 = (C0630.m2566("ۛᩴ") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM2566 ^ i5) * 16935) ^ (-1968800570);
                        i2 = -1929401307;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1080678503:
                case 1946038302:
                    y = motionEvent.getY();
                    if (C3432.f10845 >= 0) {
                        iM2566 = (i4 - C0630.m2566("ܺۜ")) * (-27);
                        i = ((iM2566 ^ i5) * 2139) ^ (-674706672);
                        i2 = -1877527418;
                    } else {
                        iM2566 = C0630.m2566("ۧ֡") ^ i4;
                        i = ((iM2566 ^ i5) * 4543) ^ 588429099;
                        i2 = 1732030994;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1062160080:
                case 1692887908:
                    if (RunnableC0588.f2309 < 0) {
                        iM2566 = (i4 - C0630.m2566("ܺۜ")) * (-27);
                        i = ((iM2566 ^ i5) * 2139) ^ (-674706672);
                        i2 = -1877527418;
                    } else {
                        iM2566 = C0630.m2566("ۧۤ") ^ i5;
                        i = ((iM2566 ^ i4) * 26271) ^ 2106384482;
                        i2 = 651622569;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1045465986:
                case 1813784334:
                    if (C1711.f5919) {
                        iM2566 = (C0630.m2566("ܳۖ") + i5) * 65;
                        i = ((iM2566 ^ i4) * 1809) ^ (-1654814034);
                        i2 = 1119993258;
                    } else {
                        iM2566 = (C0630.m2566("ᩳ᩹") + i5) * 15;
                        i = ((iM2566 ^ i4) * (-991)) ^ (-2058016103);
                        i2 = -889889815;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1039978624:
                case -844780729:
                    if (actionMasked != 3) {
                        iM2566 = (C0630.m2566("ۛᩴ") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM2566 ^ i5) * 16935) ^ (-1968800570);
                        i2 = -1929401307;
                    } else {
                        iM2566 = (i5 - C2105.m6981("ۛ֨")) * 3;
                        i = ((iM2566 ^ i4) * (-4915)) ^ 1315609668;
                        i2 = 1682876037;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -914488964:
                case 1167854723:
                    f6 = (f4 * f4) + f5;
                    int i10 = this.f7819;
                    if (C0630.f2410 > 0) {
                        iM6981 = (C2105.m6981("ۧᩳ") + i5) * 123;
                        i8 = i10;
                        i6 = ((iM6981 ^ i4) * (-509)) ^ (-1320171621);
                        i3 = 915353131;
                        i7 = iM6981 ^ i3;
                    } else {
                        i8 = i10;
                        iM2566 = C2105.m6981("᩺ۘ") ^ i4;
                        i = ((iM2566 ^ i5) * (-4651)) ^ 900033021;
                        i2 = 1735927717;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    }
                    break;
                case -737911053:
                case 635698334:
                    y2 = motionEvent.getY();
                    if (C21923.f70183 != 0) {
                        iM2566 = (i4 - C2105.m6981("ۛ۬")) * (-19);
                        i = ((iM2566 ^ i5) * (-1553)) ^ (-1481047928);
                        i2 = 1433677183;
                    } else {
                        iM2566 = (C2105.m6981("᩵ۨ") + i5) * (-21);
                        i = ((iM2566 ^ i4) * (-23827)) ^ (-472693492);
                        i2 = 1418192924;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -703383610:
                case 140535331:
                    return z2;
                case -623770422:
                case 1775471600:
                    try {
                        zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
                        iM2566 = C2105.m6981("ۚ֨") ^ i4;
                        i = ((iM2566 ^ i5) * 9217) ^ 106324322;
                        i2 = -1139626118;
                    } catch (Exception unused) {
                        iM2566 = (C2105.m6981("ۘ᩹") + i5) * (-53);
                        i = ((iM2566 ^ i4) * (-3993)) ^ (-177538507);
                        i2 = 1737277410;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -579172961:
                case 479359177:
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = C0630.m2566("ۧۤ") ^ i5;
                        i = ((iM2566 ^ i4) * 26271) ^ 2106384482;
                        i2 = 651622569;
                    } else {
                        iM2566 = C2105.m6981("᩹ᩳ") ^ i4;
                        i = ((iM2566 ^ i5) * (-27709)) ^ (-519366208);
                        i2 = -1478428761;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -492367424:
                case 1543014585:
                    this.f7824 = f7 - f3;
                    return z;
                case -242491397:
                case 130332481:
                    this.f7804 = z2;
                    this.f7811 = z;
                    float f8 = c14792.f45166;
                    if (C2958.f9394 < 0) {
                        iM6981 = C0630.m2566("ۗܿ") ^ i4;
                        f7 = f8;
                        i6 = ((iM6981 ^ i5) * 15799) ^ (-349915000);
                        i3 = -1586687716;
                        i7 = iM6981 ^ i3;
                    } else {
                        f7 = f8;
                        iM2566 = C0630.m2566("ۧۤ") ^ i5;
                        i = ((iM2566 ^ i4) * 26271) ^ 2106384482;
                        i2 = 651622569;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    }
                    break;
                case -199649016:
                case 209190291:
                    this.f7824 = f - f2;
                    return z;
                case -16901639:
                case 723514391:
                    actionMasked = motionEvent.getActionMasked();
                    c14792 = this.f7823;
                    if (actionMasked != 0) {
                        iM2566 = C2105.m6981("᩵᩹") ^ i5;
                        i = ((iM2566 ^ i4) * (-15597)) ^ 305400297;
                        i2 = 1901533762;
                    } else {
                        iM2566 = (i4 - C0630.m2566("ᩳ۫")) * (-107);
                        i = ((iM2566 ^ i5) * 8399) ^ 1817688623;
                        i2 = -1169999676;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case 120263862:
                case 2083142660:
                    z = true;
                    if (this.f7811) {
                        iM2566 = (i5 - C2105.m6981("᩷ܺ")) * (-31);
                        i = ((iM2566 ^ i4) * (-5691)) ^ (-1121003229);
                        i2 = 1548210973;
                    } else {
                        iM2566 = (C2105.m6981("ۘۘ") + i4) * (-23);
                        i = ((iM2566 ^ i5) * (-16477)) ^ (-562498215);
                        i2 = -344972491;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case 256587421:
                case 918091664:
                    x = motionEvent.getX() - this.f7807;
                    if (C1773.f6144 <= 0) {
                        iM2566 = (i5 - C2105.m6981("۟ۡ")) * (-19);
                        i = ((iM2566 ^ i4) * (-1247)) ^ (-783417783);
                        i2 = 1683382906;
                    } else {
                        iM2566 = (C2105.m6981("۠۟") + i4) * 33;
                        i = ((iM2566 ^ i5) * 30697) ^ 1090691349;
                        i2 = -1734257299;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case 313993302:
                case 1127491036:
                    f3 = this.f7812;
                    f4 = y2 - f3;
                    f5 = x * x;
                    if (C1128.f4106 <= 0) {
                        iM2566 = (i5 - C2105.m6981("۟ۡ")) * (-19);
                        i = ((iM2566 ^ i4) * (-1247)) ^ (-783417783);
                        i2 = 1683382906;
                    } else {
                        iM2566 = C0630.m2566("᩻ܺ") ^ i4;
                        i = ((iM2566 ^ i5) * 21349) ^ 1470701631;
                        i2 = -1967659273;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case 497891152:
                case 675448696:
                    if (this.f7815) {
                        iM2566 = (i4 - C2105.m6981("ۗᩳ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM2566 ^ i5) * (-30923)) ^ 2060263233;
                        i2 = 316653153;
                    } else {
                        iM2566 = (C0630.m2566("ۛᩴ") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM2566 ^ i5) * 16935) ^ (-1968800570);
                        i2 = -1929401307;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case 615630767:
                case 1073105479:
                    if (C11340.f33930 >= 0) {
                        iM2566 = (C0630.m2566("ܳۖ") + i5) * 65;
                        i = ((iM2566 ^ i4) * 1809) ^ (-1654814034);
                        i2 = 1119993258;
                    } else {
                        iM2566 = (i4 - C2105.m6981("ۛ۬")) * (-19);
                        i = ((iM2566 ^ i5) * (-1553)) ^ (-1481047928);
                        i2 = 1433677183;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case 620147228:
                case 859598412:
                    this.f7812 = y;
                    if (c14792.m35177(this.f7807, y)) {
                        iM2566 = C0630.m2566("ܺ᩻") ^ i4;
                        i = ((iM2566 ^ i5) * 18755) ^ 396852715;
                        i2 = 181344654;
                    } else {
                        iM2566 = (C0630.m2566("ۛᩴ") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM2566 ^ i5) * 16935) ^ (-1968800570);
                        i2 = -1929401307;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case 874676149:
                case 1398602682:
                    return z;
                case 1185937009:
                case 1418379443:
                    this.f7811 = z;
                    f = c14792.f45166;
                    if (C0630.f2410 <= 0) {
                        iM2566 = (i5 - C2105.m6981("۟ۡ")) * (-19);
                        i = ((iM2566 ^ i4) * (-1247)) ^ (-783417783);
                        i2 = 1683382906;
                    } else {
                        iM2566 = C2105.m6981("ܰ᩺") ^ i4;
                        i = ((iM2566 ^ i5) * (-1959)) ^ 653964230;
                        i2 = -447559605;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case 1235486140:
                case 2116655751:
                    C1047.m3599();
                    C3663.m11168();
                    return false;
                case 1236332346:
                case 2039879881:
                    if (actionMasked != 2) {
                        iM2566 = (i5 - C2105.m6981("֡֡")) * (-55);
                        i = ((iM2566 ^ i4) * 1527) ^ (-1738346954);
                        i2 = 1963510916;
                    } else {
                        iM2566 = (C0630.m2566("ۗۖ") ^ i5) * 73;
                        i = ((iM2566 ^ i4) * (-23737)) ^ (-1167242632);
                        i2 = 45150037;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case 1410864327:
                case 1536771919:
                    C5695.m16023();
                    if (C1504.f5354) {
                        iM2566 = C2105.m6981("᩺ۘ") ^ i4;
                        i = ((iM2566 ^ i5) * (-4651)) ^ 900033021;
                        i2 = 1735927717;
                    } else {
                        iM2566 = (C0630.m2566("᩷᩻") ^ i5) * (-57);
                        i = ((iM2566 ^ i4) * 5363) ^ (-297865903);
                        i2 = 1670241174;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                default:
                    z2 = false;
                    if (this.f7809) {
                        iM2566 = (i5 - C0630.m2566("ۤۗ")) * 123;
                        i = ((iM2566 ^ i4) * 10243) ^ (-2026117828);
                        i2 = 1252630704;
                    } else {
                        iM2566 = (C0630.m2566("ۛᩴ") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM2566 ^ i5) * 16935) ^ (-1968800570);
                        i2 = -1929401307;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:107:0x03de A[PHI: r2 r29
      0x03de: PHI (r2v4 float) = (r2v2 float), (r2v3 float), (r2v2 float), (r2v2 float) binds: [B:106:0x03dc, B:51:0x0190, B:29:0x00e1, B:11:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x03de: PHI (r29v33 float) = (r29v30 float), (r29v3 float), (r29v3 float), (r29v3 float) binds: [B:106:0x03dc, B:51:0x0190, B:29:0x00e1, B:11:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:148:0x05c5 A[PHI: r24 r28
      0x05c5: PHI (r24v8 float) = (r24v2 float), (r24v2 float), (r24v4 float), (r24v2 float), (r24v2 float), (r24v2 float) binds: [B:146:0x05ae, B:140:0x0587, B:130:0x0508, B:116:0x0454, B:110:0x040f, B:95:0x0386] A[DONT_GENERATE, DONT_INLINE]
      0x05c5: PHI (r28v75 float) = (r28v3 float), (r28v4 float), (r28v7 float), (r28v10 float), (r28v14 float), (r28v76 float) binds: [B:146:0x05ae, B:140:0x0587, B:130:0x0508, B:116:0x0454, B:110:0x040f, B:95:0x0386] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:75:0x028a A[PHI: r14 r15
      0x028a: PHI (r14v5 float) = (r14v3 float), (r14v2 float) binds: [B:74:0x0288, B:8:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x028a: PHI (r15v5 float) = (r15v3 float), (r15v2 float) binds: [B:74:0x0288, B:8:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x031e A[PHI: r11
      0x031e: PHI (r11v4 float) = (r11v3 float), (r11v2 float), (r11v2 float) binds: [B:86:0x031c, B:14:0x008a, B:8:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e9, code lost:
    
        if (l.C2167.f7158 < 0) goto L18;
     */
    @Override // l.C13132, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        int iM2566;
        int i;
        int i2;
        int iM6981;
        int i3;
        int i4;
        int iM6982;
        int i5;
        int iM2567;
        int i6;
        int i7;
        int iM2568;
        float f3;
        int i8;
        C2447 c2447 = this;
        int i9 = C4075.f12947;
        int i10 = C0422.f1886;
        int iM2569 = (C0630.m2566("ۖ᩶") ^ i10) * (-55);
        int i11 = ((iM2569 ^ i9) * (-11661)) ^ (-1059843070);
        C14792 c14792 = null;
        int i12 = iM2569 ^ 642660651;
        float f4 = 0.0f;
        boolean z = false;
        int i13 = 0;
        int actionMasked = 0;
        int i14 = 0;
        boolean z2 = false;
        int i15 = 0;
        float y = 0.0f;
        float fM3498 = 0.0f;
        float f5 = 0.0f;
        float x = 0.0f;
        float y2 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        int i16 = 0;
        int actionMasked2 = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float y3 = 0.0f;
        int i17 = 1566537406;
        float f12 = 0.0f;
        while (true) {
            i17 = i12 ^ (i11 & (((i17 ^ i9) * (-29203)) >> 31));
            switch (i17) {
                case -2137297934:
                case -1894233384:
                    if (c2447.f7811) {
                        iM6982 = C2105.m6981("۬᩹") ^ i9;
                        i = ((iM6982 ^ i10) * 10895) ^ 991409794;
                        i5 = 1044616710;
                    } else {
                        iM6982 = (i10 - C2105.m6981("᩸ᩳ")) * (-103);
                        i = ((iM6982 ^ i9) * (-11947)) ^ (-1998353898);
                        i5 = -1428023615;
                    }
                    i12 = iM6982 ^ i5;
                    i11 = i;
                    break;
                case -2095843070:
                case 1133571139:
                    f = f12;
                    actionMasked2 = motionEvent.getActionMasked();
                    if (C7106.f21815 != 0) {
                        iM2568 = C0630.m2566("ۢ֡") ^ i10;
                        i11 = ((iM2568 ^ i9) * 27977) ^ (-921312162);
                        i7 = -1934196091;
                    } else {
                        iM2568 = C2105.m6981("ܽܶ") ^ i10;
                        i11 = ((iM2568 ^ i9) * 30299) ^ (-811652993);
                        i7 = -436077300;
                    }
                    f12 = f;
                    i12 = iM2568 ^ i7;
                    c2447 = this;
                    break;
                case -2087146451:
                case -466597379:
                    C1294.m4372();
                    if (C1005.m3501()) {
                        iM6982 = (i9 - C0630.m2566("ۢ᩻")) * (-123);
                        i = ((iM6982 ^ i10) * (-21639)) ^ (-1952281408);
                        i5 = 791408644;
                    } else {
                        iM6982 = C0630.m2566("᩷᩵") ^ i10;
                        i = ((iM6982 ^ i9) * (-9779)) ^ (-1110078848);
                        i5 = 196166422;
                    }
                    i12 = iM6982 ^ i5;
                    i11 = i;
                    break;
                case -2073638170:
                case 2086111703:
                    c2447.f7810 = i15;
                    c2447.scrollToPosition(i15);
                    iM6982 = (C0630.m2566("᩸ۛ") ^ i10) * 71;
                    i = ((iM6982 ^ i9) * 28969) ^ 2064782127;
                    i5 = -1651469718;
                    i12 = iM6982 ^ i5;
                    i11 = i;
                    break;
                case -2041360958:
                case -1844433578:
                    C4263.m12819();
                    if (C3663.f11553) {
                        iM6982 = C2105.m6981("ᩴ֫") ^ i10;
                        i = ((iM6982 ^ i9) * 8465) ^ (-613698146);
                        i5 = -52939957;
                        i12 = iM6982 ^ i5;
                        i11 = i;
                    }
                    f2 = f12;
                    iM2566 = C2105.m6981("ۙܳ") ^ i9;
                    i = ((iM2566 ^ i10) * (-23871)) ^ 1805775127;
                    i2 = 1970137870;
                    int i18 = iM2566 ^ i2;
                    f12 = f2;
                    i12 = i18;
                    i11 = i;
                    break;
                case -2009361568:
                case 774043665:
                    if (f5 > 1.0f) {
                        iM6982 = (i9 - C0630.m2566("ᩳ۠")) * (-123);
                        i = ((iM6982 ^ i10) * (-22073)) ^ (-717001509);
                        i5 = -391829974;
                    } else {
                        f11 = f5;
                        iM6982 = C0630.m2566("ᩴ᩻") ^ i9;
                        i = ((iM6982 ^ i10) * 8245) ^ (-1786447212);
                        i5 = -1320253120;
                    }
                    i12 = iM6982 ^ i5;
                    i11 = i;
                    break;
                case -1992869100:
                case -1837951934:
                    f11 = 0.0f;
                    iM6982 = C0630.m2566("ᩴ᩻") ^ i9;
                    i = ((iM6982 ^ i10) * 8245) ^ (-1786447212);
                    i5 = -1320253120;
                    i12 = iM6982 ^ i5;
                    i11 = i;
                    break;
                case -1890181514:
                case -78449541:
                    float f13 = y3;
                    f2 = f12;
                    c2447.f7812 = f13;
                    if (!c14792.m35177(c2447.f7807, f13)) {
                        y3 = f13;
                        iM2566 = (i10 - C2105.m6981("ۧܳ")) * 21;
                        i = ((iM2566 ^ i9) * 22451) ^ 388700514;
                        i2 = 1073362730;
                        int i19 = iM2566 ^ i2;
                        f12 = f2;
                        i12 = i19;
                        i11 = i;
                    } else {
                        iM6981 = (i10 - C2105.m6981("᩸ۨ")) * 17;
                        y3 = f13;
                        i11 = ((iM6981 ^ i9) * 4843) ^ (-901241981);
                        i3 = -2076572218;
                        i4 = iM6981 ^ i3;
                        f12 = f2;
                        i12 = i4;
                    }
                    break;
                case -1849576318:
                case 389723070:
                    fM3498 = C1005.m3498(this);
                    if (!C0798.f2919) {
                        iM6982 = C2105.m6981("᩻۫") ^ i9;
                        i = ((iM6982 ^ i10) * (-1613)) ^ 1237912367;
                        i5 = 889819279;
                        i12 = iM6982 ^ i5;
                        i11 = i;
                    }
                    f2 = f12;
                    iM2566 = C2105.m6981("ۙܳ") ^ i9;
                    i = ((iM2566 ^ i10) * (-23871)) ^ 1805775127;
                    i2 = 1970137870;
                    int i110 = iM2566 ^ i2;
                    f12 = f2;
                    i12 = i110;
                    i11 = i;
                    break;
                case -1805837445:
                case 822607859:
                    C3019.m9255();
                    if (C1005.f3721) {
                        iM6982 = (i9 - C2105.m6981("ܶ᩶")) * (-101);
                        i = ((iM6982 ^ i10) * 20559) ^ (-1550706029);
                        i5 = -1306011126;
                    } else {
                        iM6982 = C0630.m2566("᩷᩵") ^ i10;
                        i = ((iM6982 ^ i9) * (-9779)) ^ (-1110078848);
                        i5 = 196166422;
                    }
                    i12 = iM6982 ^ i5;
                    i11 = i;
                    break;
                case -1799807731:
                case 1978265924:
                    return z2;
                case -1787917411:
                case 726946364:
                    f11 = 1.0f;
                    iM6982 = C0630.m2566("ᩴ᩻") ^ i9;
                    i = ((iM6982 ^ i10) * 8245) ^ (-1786447212);
                    i5 = -1320253120;
                    i12 = iM6982 ^ i5;
                    i11 = i;
                    break;
                case -1757878859:
                case -680983004:
                    if (c2447.f7804) {
                        iM6982 = C0630.m2566("ܶۢ") ^ i10;
                        i = ((iM6982 ^ i9) * 5203) ^ (-1192518779);
                        i5 = -1737437537;
                    } else {
                        iM6982 = C2105.m6981("۬᩹") ^ i9;
                        i = ((iM6982 ^ i10) * 10895) ^ 991409794;
                        i5 = 1044616710;
                    }
                    i12 = iM6982 ^ i5;
                    i11 = i;
                    break;
                case -1490873072:
                case 449230481:
                    c2447.f7811 = z;
                    c2447.f7817 = C3537.m10751();
                    C0630.m2574(this);
                    return z2;
                case -1487858132:
                case 1250374696:
                    C1047.m3599();
                    if (C1047.m3599() >= 0) {
                        iM6982 = (i9 - C0630.m2566("ۢ᩻")) * (-123);
                        i = ((iM6982 ^ i10) * (-21639)) ^ (-1952281408);
                        i5 = 791408644;
                    } else {
                        iM6982 = C0630.m2566("ܶ֡") ^ i9;
                        i = ((iM6982 ^ i10) * 21417) ^ 1900395703;
                        i5 = 1810513653;
                    }
                    i12 = iM6982 ^ i5;
                    i11 = i;
                    break;
                case -1324645405:
                case -1118717305:
                    f5 = y / (fM3498 - c2447.f7805);
                    if (f5 < 0.0f) {
                        iM6982 = C0630.m2566("ܶ۬") ^ i9;
                        i = ((iM6982 ^ i10) * (-7287)) ^ 1901916657;
                        i5 = 438887404;
                    } else {
                        iM6982 = C2105.m6981("᩷ۤ") ^ i10;
                        i = ((iM6982 ^ i9) * (-24117)) ^ (-1945131219);
                        i5 = 919240797;
                    }
                    i12 = iM6982 ^ i5;
                    i11 = i;
                    break;
                case -1239910701:
                case 1082362685:
                    if (c2447.f7811) {
                        iM6982 = (i9 - C0630.m2566("֨۫")) * (-9);
                        i = ((iM6982 ^ i10) * 27759) ^ (-1513456513);
                        i5 = -75248813;
                        i12 = iM6982 ^ i5;
                        i11 = i;
                    }
                    f2 = f12;
                    iM2566 = (i10 - C2105.m6981("ۧܳ")) * 21;
                    i = ((iM2566 ^ i9) * 22451) ^ 388700514;
                    i2 = 1073362730;
                    int i111 = iM2566 ^ i2;
                    f12 = f2;
                    i12 = i111;
                    i11 = i;
                    break;
                case -1128431729:
                case 2102338869:
                    f2 = f12;
                    c2447.f7804 = z;
                    if (c2447.f7811) {
                        iM2566 = C0630.m2566("ۗ֡") ^ i9;
                        i = ((iM2566 ^ i10) * (-32433)) ^ (-1398187780);
                        i2 = 796450146;
                    } else {
                        iM2566 = (i10 - C2105.m6981("ۧܳ")) * 21;
                        i = ((iM2566 ^ i9) * 22451) ^ 388700514;
                        i2 = 1073362730;
                    }
                    int i112 = iM2566 ^ i2;
                    f12 = f2;
                    i12 = i112;
                    i11 = i;
                    break;
                case -993528057:
                case -431277002:
                    c2447.f7804 = z;
                    c2447.f7811 = z2;
                    f4 = c14792.f45166 - f6;
                    if (C0630.f2410 <= 0) {
                        iM6982 = (i9 - C0630.m2566("ۢ᩻")) * (-123);
                        i = ((iM6982 ^ i10) * (-21639)) ^ (-1952281408);
                        i5 = 791408644;
                    } else {
                        iM6982 = C2105.m6981("ܳۢ") ^ i10;
                        i = ((iM6982 ^ i9) * (-16599)) ^ (-558265996);
                        i5 = -284946447;
                    }
                    i12 = iM6982 ^ i5;
                    i11 = i;
                    break;
                case -970606756:
                case 1718739340:
                    f3 = f12;
                    c2447.f7804 = z;
                    i8 = actionMasked2;
                    int iM25610 = C0630.m2566("ۛۚ") ^ i9;
                    actionMasked2 = i8;
                    f12 = f3;
                    i11 = ((iM25610 ^ i10) * 27415) ^ (-25909319);
                    i12 = iM25610 ^ (-190259145);
                    c2447 = this;
                    break;
                case -946247313:
                case 28038965:
                    c2447.f7804 = z2;
                    f2 = f12;
                    iM2566 = (i10 - C2105.m6981("ۧܳ")) * 21;
                    i = ((iM2566 ^ i9) * 22451) ^ 388700514;
                    i2 = 1073362730;
                    int i113 = iM2566 ^ i2;
                    f12 = f2;
                    i12 = i113;
                    i11 = i;
                    break;
                case -833557342:
                case 885026131:
                    return super.onTouchEvent(motionEvent);
                case -816771952:
                case 443095281:
                    y = motionEvent.getY() + c2447.f7824;
                    if (C2272.f7362) {
                        iM6982 = (C0630.m2566("ܰ֫") ^ i10) * 47;
                        i = ((iM6982 ^ i9) * 22011) ^ 227732654;
                        i5 = 1184158082;
                    } else {
                        iM6982 = (C0630.m2566("᩵ܺ") + i10) * 85;
                        i = ((iM6982 ^ i9) * (-31071)) ^ 1142868730;
                        i5 = -689028260;
                    }
                    i12 = iM6982 ^ i5;
                    i11 = i;
                    break;
                case -795472733:
                case 707404586:
                    i15 = (int) (f10 * f11);
                    if (c2447.f7810 != i15) {
                        iM6982 = C2105.m6981("ᩴۡ") ^ i9;
                        i = ((iM6982 ^ i10) * 27119) ^ 1426775997;
                        i5 = -200301854;
                    } else {
                        iM6982 = (C0630.m2566("᩸ۛ") ^ i10) * 71;
                        i = ((iM6982 ^ i9) * 28969) ^ 2064782127;
                        i5 = -1651469718;
                    }
                    i12 = iM6982 ^ i5;
                    i11 = i;
                    break;
                case -751920085:
                case -18196076:
                    f3 = f12;
                    i13 = 3;
                    i8 = actionMasked2;
                    if (i8 != 3) {
                        z = false;
                        int iM25611 = C0630.m2566("ۛۚ") ^ i9;
                        actionMasked2 = i8;
                        f12 = f3;
                        i11 = ((iM25611 ^ i10) * 27415) ^ (-25909319);
                        i12 = iM25611 ^ (-190259145);
                        c2447 = this;
                    } else {
                        int iM6983 = (C2105.m6981("ۧ᩷") + i9) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        int i20 = ((iM6983 ^ i10) * (-23897)) ^ 1489737167;
                        i4 = iM6983 ^ 1458364484;
                        actionMasked2 = i8;
                        i11 = i20;
                        f12 = f3;
                        z = false;
                        i12 = i4;
                    }
                    break;
                case -736478888:
                case -46784084:
                    C3911.m11924();
                    RunnableC0588.m2441();
                    return false;
                case -707301660:
                case 461236224:
                    C1294.m4372();
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        f = f12;
                        iM2568 = C0630.m2566("ۢ֡") ^ i10;
                        i11 = ((iM2568 ^ i9) * 27977) ^ (-921312162);
                        i7 = -1934196091;
                        f12 = f;
                        i12 = iM2568 ^ i7;
                        c2447 = this;
                    } else {
                        f2 = f12;
                        iM2566 = C2105.m6981("ۙܳ") ^ i9;
                        i = ((iM2566 ^ i10) * (-23871)) ^ 1805775127;
                        i2 = 1970137870;
                        int i114 = iM2566 ^ i2;
                        f12 = f2;
                        i12 = i114;
                        i11 = i;
                    }
                    break;
                case -664361895:
                case 328726904:
                    f2 = f12;
                    actionMasked = motionEvent.getActionMasked();
                    i14 = -1;
                    c14792 = c2447.f7823;
                    z2 = true;
                    z2 = true;
                    if (actionMasked != 0) {
                        iM2566 = (i9 - C0630.m2566("ܽ᩻")) * 7;
                        i = ((iM2566 ^ i10) * (-9517)) ^ 2062722225;
                        i2 = -1234726916;
                    } else {
                        iM2566 = (C2105.m6981("ۛۢ") + i10) * (-85);
                        i = ((iM2566 ^ i9) * 26201) ^ 2057010257;
                        i2 = -477522206;
                    }
                    int i115 = iM2566 ^ i2;
                    f12 = f2;
                    i12 = i115;
                    i11 = i;
                    break;
                case -618618836:
                case 1001494907:
                    float f14 = c2447.f7812;
                    f7 = y2 - f14;
                    f8 = x * x;
                    if (C2520.f8000 < 0) {
                        f6 = f14;
                        iM6982 = C2105.m6981("ۖܰ") ^ i10;
                        i = ((iM6982 ^ i9) * (-32015)) ^ 1856000573;
                        i5 = 250751202;
                        i12 = iM6982 ^ i5;
                        i11 = i;
                    } else {
                        iM2567 = C0630.m2566("֡ۡ") ^ i10;
                        f6 = f14;
                        i11 = ((iM2567 ^ i9) * (-22115)) ^ (-1441732575);
                        i6 = 661289989;
                        i12 = iM2567 ^ i6;
                    }
                    break;
                case -612339605:
                case 1511027098:
                    f2 = f12;
                    c2447.f7807 = motionEvent.getX();
                    y3 = motionEvent.getY();
                    if (C3537.f11231 >= 0) {
                        iM2566 = C2105.m6981("ۙܳ") ^ i9;
                        i = ((iM2566 ^ i10) * (-23871)) ^ 1805775127;
                        i2 = 1970137870;
                    } else {
                        iM2566 = C0630.m2566("ܽܿ") ^ i9;
                        i = ((iM2566 ^ i10) * (-28283)) ^ (-115795478);
                        i2 = 1929970177;
                    }
                    int i116 = iM2566 ^ i2;
                    f12 = f2;
                    i12 = i116;
                    i11 = i;
                    break;
                case -474887674:
                case 1119392371:
                    if (C3019.m9255() > 0) {
                        iM6982 = C0630.m2566("᩷᩵") ^ i10;
                        i = ((iM6982 ^ i9) * (-9779)) ^ (-1110078848);
                        i5 = 196166422;
                    } else {
                        iM6982 = (C0630.m2566("ܰ֫") ^ i10) * 47;
                        i = ((iM6982 ^ i9) * 22011) ^ 227732654;
                        i5 = 1184158082;
                    }
                    i12 = iM6982 ^ i5;
                    i11 = i;
                    break;
                case -428771949:
                case 1293878944:
                    c2447.f7824 = f12;
                    c2447.f7810 = i14;
                    C0630.m2574(this);
                    return z2;
                case -414577131:
                case 1402624639:
                    C0483.m2121();
                    break;
                case -290231378:
                case 202452778:
                    f2 = f12;
                    if (actionMasked != z2) {
                        iM2566 = (C2105.m6981("ܿᩳ") ^ i9) * (-85);
                        i = ((iM2566 ^ i10) * 13537) ^ (-852368080);
                        i2 = -822104885;
                    } else {
                        iM2566 = (C2105.m6981("۬ܺ") ^ i10) * 69;
                        i = ((iM2566 ^ i9) * (-17165)) ^ (-1145339725);
                        i2 = -892409602;
                    }
                    int i117 = iM2566 ^ i2;
                    f12 = f2;
                    i12 = i117;
                    i11 = i;
                    break;
                case -200857062:
                case 2005182095:
                    float f15 = f12;
                    if (actionMasked == 2) {
                        f2 = f15;
                        iM2566 = (i10 - C0630.m2566("֡۫")) * (-21);
                        i = ((iM2566 ^ i9) * (-27437)) ^ (-1249311154);
                        i2 = 1677362984;
                        int i118 = iM2566 ^ i2;
                        f12 = f2;
                        i12 = i118;
                        i11 = i;
                    } else {
                        iM6981 = C0630.m2566("۬ۡ") ^ i9;
                        f2 = f15;
                        i11 = ((iM6981 ^ i10) * (-385)) ^ 1324113359;
                        i3 = -1970565628;
                        i4 = iM6981 ^ i3;
                        f12 = f2;
                        i12 = i4;
                    }
                    break;
                case -198003715:
                case 957797919:
                    float itemCount = getAdapter().getItemCount() - (z2 ? 1 : 0);
                    if (RunnableC0588.f2309 < 0) {
                        iM2567 = C2105.m6981("ۨۗ") ^ i10;
                        f10 = itemCount;
                        i11 = ((iM2567 ^ i9) * (-29283)) ^ (-1764173161);
                        i6 = -931294387;
                        i12 = iM2567 ^ i6;
                    } else {
                        f10 = itemCount;
                        iM6982 = C0630.m2566("ܶ֡") ^ i9;
                        i = ((iM6982 ^ i10) * 21417) ^ 1900395703;
                        i5 = 1810513653;
                        i12 = iM6982 ^ i5;
                        i11 = i;
                    }
                    break;
                case -135288065:
                case 1731494861:
                    c2447.f7824 = f4;
                    c2447.f7810 = i14;
                    C0630.m2574(this);
                    iM6982 = C2105.m6981("۬᩹") ^ i9;
                    i = ((iM6982 ^ i10) * 10895) ^ 991409794;
                    i5 = 1044616710;
                    i12 = iM6982 ^ i5;
                    i11 = i;
                    break;
                case -131595067:
                case 29798435:
                    if (f9 > i16 * i16) {
                        iM6982 = (C0630.m2566("ۛ֨") + i10) * (-109);
                        i = ((iM6982 ^ i9) * 4763) ^ (-1481675017);
                        i5 = -2059620516;
                    } else {
                        iM6982 = C2105.m6981("۬᩹") ^ i9;
                        i = ((iM6982 ^ i10) * 10895) ^ 991409794;
                        i5 = 1044616710;
                    }
                    i12 = iM6982 ^ i5;
                    i11 = i;
                    break;
                case 137322288:
                case 1065454180:
                    if (C3683.f11629 < 0) {
                        iM6982 = (C0630.m2566("ܰ֫") ^ i10) * 47;
                        i = ((iM6982 ^ i9) * 22011) ^ 227732654;
                        i5 = 1184158082;
                    } else {
                        iM6982 = (i9 - C2105.m6981("ܽ᩹")) * (-79);
                        i = ((iM6982 ^ i10) * 7061) ^ (-1709819003);
                        i5 = 1264844304;
                    }
                    i12 = iM6982 ^ i5;
                    i11 = i;
                    break;
                case 269700714:
                case 721250999:
                    c2447.f7811 = z2;
                    f12 = c14792.f45166 - c2447.f7812;
                    if (C0050.f910 >= 0) {
                        iM6982 = (i9 - C0630.m2566("ۢ᩻")) * (-123);
                        i = ((iM6982 ^ i10) * (-21639)) ^ (-1952281408);
                        i5 = 791408644;
                    } else {
                        iM6982 = (i10 - C2105.m6981("ܿۨ")) * (-57);
                        i = ((iM6982 ^ i9) * 8295) ^ 539905475;
                        i5 = -1784621093;
                    }
                    i12 = iM6982 ^ i5;
                    i11 = i;
                    break;
                case 324619977:
                case 950314194:
                    C3911.m11924();
                    C11340.m28031();
                    f2 = f12;
                    iM2566 = C2105.m6981("ۙܳ") ^ i9;
                    i = ((iM2566 ^ i10) * (-23871)) ^ 1805775127;
                    i2 = 1970137870;
                    int i119 = iM2566 ^ i2;
                    f12 = f2;
                    i12 = i119;
                    i11 = i;
                    break;
                case 370782457:
                case 718951511:
                    f9 = (f7 * f7) + f8;
                    int i21 = c2447.f7819;
                    if (!C4159.f13567) {
                        i16 = i21;
                        iM6982 = C0630.m2566("ܶ֡") ^ i9;
                        i = ((iM6982 ^ i10) * 21417) ^ 1900395703;
                        i5 = 1810513653;
                        i12 = iM6982 ^ i5;
                        i11 = i;
                    } else {
                        iM2567 = (C2105.m6981("ܽ᩷") + i9) * (-15);
                        i16 = i21;
                        i11 = ((iM2567 ^ i10) * (-18587)) ^ (-2070172647);
                        i6 = -88914601;
                        i12 = iM2567 ^ i6;
                    }
                    break;
                case 388235136:
                case 596193500:
                    f2 = f12;
                    if (c2447.f7815) {
                        iM2566 = C2105.m6981("ᩴᩴ") ^ i9;
                        i = ((iM2566 ^ i10) * (-8591)) ^ (-558175128);
                        i2 = 1346304769;
                    } else {
                        iM2566 = (i10 - C2105.m6981("ۧܳ")) * 21;
                        i = ((iM2566 ^ i9) * 22451) ^ 388700514;
                        i2 = 1073362730;
                    }
                    int i1110 = iM2566 ^ i2;
                    f12 = f2;
                    i12 = i1110;
                    i11 = i;
                    break;
                case 495692535:
                case 592610663:
                    f2 = f12;
                    if (c14792.m35178(c2447.f7807, c2447.f7812)) {
                        iM2566 = (i9 - C2105.m6981("֫ۛ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM2566 ^ i10) * 30359) ^ (-1707520174);
                        i2 = 1072759970;
                    } else {
                        iM2566 = (C2105.m6981("ۤ᩵") + i10) * (-41);
                        i = ((iM2566 ^ i9) * (-11359)) ^ (-122425380);
                        i2 = 58721579;
                    }
                    int i1111 = iM2566 ^ i2;
                    f12 = f2;
                    i12 = i1111;
                    i11 = i;
                    break;
                case 1271975939:
                case 2096310960:
                    f2 = f12;
                    if (c2447.f7809) {
                        iM2566 = C0630.m2566("ܶᩴ") ^ i10;
                        i = ((iM2566 ^ i9) * (-11673)) ^ 1291392493;
                        i2 = 264783231;
                    } else {
                        iM2566 = (i10 - C2105.m6981("ۧܳ")) * 21;
                        i = ((iM2566 ^ i9) * 22451) ^ 388700514;
                        i2 = 1073362730;
                    }
                    int i1112 = iM2566 ^ i2;
                    f12 = f2;
                    i12 = i1112;
                    i11 = i;
                    break;
                case 1347340119:
                case 2002373287:
                    x = motionEvent.getX() - c2447.f7807;
                    y2 = motionEvent.getY();
                    if (C3432.f10845 >= 0) {
                        iM6982 = (i9 - C2105.m6981("ܽ᩹")) * (-79);
                        i = ((iM6982 ^ i10) * 7061) ^ (-1709819003);
                        i5 = 1264844304;
                    } else {
                        iM6982 = (C2105.m6981("ۢۤ") + i9) * 79;
                        i = ((iM6982 ^ i10) * (-13257)) ^ 197717462;
                        i5 = -813770198;
                    }
                    i12 = iM6982 ^ i5;
                    i11 = i;
                    break;
                default:
                    if (actionMasked == i13) {
                        f2 = f12;
                        iM2566 = (C2105.m6981("۬ܺ") ^ i10) * 69;
                        i = ((iM2566 ^ i9) * (-17165)) ^ (-1145339725);
                        i2 = -892409602;
                        int i1113 = iM2566 ^ i2;
                        f12 = f2;
                        i12 = i1113;
                        i11 = i;
                    }
                    f2 = f12;
                    iM2566 = (i10 - C2105.m6981("ۧܳ")) * 21;
                    i = ((iM2566 ^ i9) * 22451) ^ 388700514;
                    i2 = 1073362730;
                    int i1114 = iM2566 ^ i2;
                    f12 = f2;
                    i12 = i1114;
                    i11 = i;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m7902() {
        int i = 582720052;
        int i2 = C22628.f73083;
        int i3 = RunnableC3474.f10992;
        int iM6981 = C2105.m6981("᩸ۡ") ^ i2;
        int i4 = ((iM6981 ^ i3) * (-25811)) ^ (-351763304);
        int i5 = 1819618803;
        while (true) {
            i = ((((i ^ i3) * (-23721)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2104155904:
                case 1018829776:
                    C3019.m9255();
                    if (!RunnableC1108.f4040) {
                        iM6981 = (C0630.m2566("ۘ۠") + i2) * (-29);
                        i4 = ((iM6981 ^ i3) * (-6183)) ^ 377280136;
                        i5 = 997000827;
                    } else {
                        iM6981 = C2105.m6981("ܶ֨") ^ i2;
                        i4 = ((iM6981 ^ i3) * 28271) ^ 1687472321;
                        i5 = 2132272218;
                    }
                    break;
                case -2044811701:
                case 287364145:
                    return true;
                case -2036182154:
                case -935308673:
                    if (C0714.m2805()) {
                        iM6981 = (C2105.m6981("۫ۜ") + i3) * (-9);
                        i4 = ((iM6981 ^ i2) * (-17139)) ^ (-755908824);
                        i5 = -1231049698;
                    } else {
                        iM6981 = C2105.m6981("ۡۘ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 9501) ^ 1241731571;
                        i5 = 524056406;
                    }
                    break;
                case -1926673375:
                case 950459129:
                    if (C3432.f10845 >= 0) {
                        iM6981 = C0630.m2566("ܺ۟") ^ i3;
                        i4 = ((iM6981 ^ i2) * 9769) ^ 1813022899;
                        i5 = -478213560;
                    } else {
                        iM6981 = C2105.m6981("᩻᩹") ^ i2;
                        i4 = ((iM6981 ^ i3) * 10723) ^ (-1901981042);
                        i5 = -1664764466;
                    }
                    break;
                case -1878750703:
                case 1118606532:
                    if (this.f7811) {
                        iM6981 = (i2 - C0630.m2566("۬۠")) * (-47);
                        i4 = ((iM6981 ^ i3) * 465) ^ 939336104;
                        i5 = 173715630;
                    } else {
                        iM6981 = (C2105.m6981("ۜۛ") + i2) * 79;
                        i4 = ((iM6981 ^ i3) * 2605) ^ (-1720809070);
                        i5 = 1131837001;
                    }
                    break;
                case -1457128333:
                case 335430861:
                    if (C3746.f11829 <= 0) {
                        iM6981 = C0630.m2566("ܺ۟") ^ i3;
                        i4 = ((iM6981 ^ i2) * 9769) ^ 1813022899;
                        i5 = -478213560;
                    } else {
                        iM6981 = C0630.m2566("۟ᩳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 4315) ^ (-276155419);
                        i5 = -802288127;
                    }
                    break;
                case -1343808126:
                case 484487187:
                    if (C2126.f7087) {
                        iM6981 = (C2105.m6981("۠۬") ^ i3) * (-63);
                        i4 = ((iM6981 ^ i2) * (-28311)) ^ 305043156;
                        i5 = -775758619;
                    } else {
                        iM6981 = (C2105.m6981("ۘ۫") ^ i3) * (-91);
                        i4 = ((iM6981 ^ i2) * 1055) ^ (-410034159);
                        i5 = 2071674067;
                    }
                    break;
                case -944683206:
                case 1502941305:
                    if (C0964.m3413()) {
                        iM6981 = C2105.m6981("ܿۗ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 21157) ^ 1357853674;
                        i5 = 445687666;
                    } else {
                        iM6981 = (C0630.m2566("ۘ۠") + i2) * (-29);
                        i4 = ((iM6981 ^ i3) * (-6183)) ^ 377280136;
                        i5 = 997000827;
                    }
                    break;
                case -891989174:
                case 1627456141:
                    if (C3663.m11168() >= 0) {
                        iM6981 = (C0630.m2566("ۘ۠") + i2) * (-29);
                        i4 = ((iM6981 ^ i3) * (-6183)) ^ 377280136;
                        i5 = 997000827;
                    } else {
                        iM6981 = (C2105.m6981("ۖ۠") ^ i2) * 29;
                        i4 = ((iM6981 ^ i3) * (-30107)) ^ 627926305;
                        i5 = -762338598;
                    }
                    break;
                case -834864756:
                case -796308863:
                    if (this.f7815) {
                        iM6981 = C2105.m6981("ۡۜ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-4403)) ^ 1963699140;
                        i5 = -236020825;
                    } else {
                        iM6981 = (C2105.m6981("ۜۛ") + i2) * 79;
                        i4 = ((iM6981 ^ i3) * 2605) ^ (-1720809070);
                        i5 = 1131837001;
                    }
                    break;
                case -676496126:
                case 916944260:
                    if (C7106.m19120() <= 0) {
                        iM6981 = C0630.m2566("ܺ۟") ^ i3;
                        i4 = ((iM6981 ^ i2) * 9769) ^ 1813022899;
                        i5 = -478213560;
                    } else {
                        iM6981 = (C0630.m2566("ۘ۠") + i2) * (-29);
                        i4 = ((iM6981 ^ i3) * (-6183)) ^ 377280136;
                        i5 = 997000827;
                    }
                    break;
                case -566071782:
                case -161077890:
                    C4159.m12565();
                    C3245.m9925();
                    return false;
                case -508381942:
                case 2127980268:
                    C0422.m1963();
                    C0483.m2121();
                    iM6981 = (C0630.m2566("ۘ۠") + i2) * (-29);
                    i4 = ((iM6981 ^ i3) * (-6183)) ^ 377280136;
                    i5 = 997000827;
                    break;
                case -500913545:
                case 1782642482:
                    return false;
                case -439490666:
                case 2085767661:
                    if (C1504.m5179()) {
                        iM6981 = (C2105.m6981("ܺ᩷") ^ i3) * (-115);
                        i4 = ((iM6981 ^ i2) * 1671) ^ (-251296076);
                        i5 = 1454140501;
                    } else {
                        iM6981 = C2105.m6981("ܶ֨") ^ i2;
                        i4 = ((iM6981 ^ i3) * 28271) ^ 1687472321;
                        i5 = 2132272218;
                    }
                    break;
                case -390769127:
                case 942231820:
                    if (C7811.m20844() != 0) {
                        iM6981 = (C0630.m2566("ۘ۠") + i2) * (-29);
                        i4 = ((iM6981 ^ i3) * (-6183)) ^ 377280136;
                        i5 = 997000827;
                    } else {
                        iM6981 = (C2105.m6981("ۨܺ") + i3) * 79;
                        i4 = ((iM6981 ^ i2) * 3465) ^ 1811919162;
                        i5 = -1164932976;
                    }
                    break;
                case 830960771:
                case 2071629223:
                    if (C2520.f8000 >= 0) {
                        iM6981 = (C0630.m2566("ۘ۠") + i2) * (-29);
                        i4 = ((iM6981 ^ i3) * (-6183)) ^ 377280136;
                        i5 = 997000827;
                    } else {
                        iM6981 = C0630.m2566("᩺ܳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-9597)) ^ (-905293214);
                        i5 = -13275568;
                    }
                    break;
                case 1020058836:
                case 1432650181:
                    if (C11340.f33930 >= 0) {
                        iM6981 = (C2105.m6981("۠۬") ^ i3) * (-63);
                        i4 = ((iM6981 ^ i2) * (-28311)) ^ 305043156;
                        i5 = -775758619;
                    } else {
                        iM6981 = C2105.m6981("۬᩶") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-26827)) ^ 772047237;
                        i5 = 688080890;
                    }
                    break;
                case 1257506699:
                case 1335140494:
                    C1128.m3851();
                    if (C1294.f4556 < 0) {
                        iM6981 = C2105.m6981("ۡۘ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 9501) ^ 1241731571;
                        i5 = 524056406;
                    } else {
                        iM6981 = (C0630.m2566("ۘ۠") + i2) * (-29);
                        i4 = ((iM6981 ^ i3) * (-6183)) ^ 377280136;
                        i5 = 997000827;
                    }
                    break;
                default:
                    if (this.f7809) {
                        iM6981 = C2105.m6981("ܽۖ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-31611)) ^ 697288414;
                        i5 = -1318887403;
                    } else {
                        iM6981 = (C2105.m6981("ۜۛ") + i2) * 79;
                        i4 = ((iM6981 ^ i3) * 2605) ^ (-1720809070);
                        i5 = 1131837001;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m7901() {
        return this.f7813;
    }
}
