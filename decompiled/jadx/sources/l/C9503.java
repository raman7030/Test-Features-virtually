package l;

import android.R;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.ec.custom.sec.SecP160R2Field;

/* JADX INFO: renamed from: l.ۢۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: J5HS */
/* JADX INFO: loaded from: classes3.dex */
public class C9503 extends ListView {

    /* JADX INFO: renamed from: ۟᩸᩺, reason: not valid java name and contains not printable characters */
    private static final short[] f28845 = {7772, 22400, 22412, 22414, 22477, 22400, 22402, 22414, 22406, 22415, 22477, 22417, 22422, 22413, 22423, 22410, 22414, 22406, 22477, 22445, 22402, 22423, 22410, 22421, 22406, 22438, 22413, 22404, 22410, 22413, 22406, 22414, 22423, 22427, 22477, 22445, 22402, 22423, 22410, 22421, 22406, 22436, 22422, 22402, 22417, 22407};

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public C14792 f28846;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public float f28847;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public float f28848;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f28849;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f28850;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f28851;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public boolean f28852;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f28853;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public int f28854;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public boolean f28855;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f28856;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f28857;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f28858;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f28859;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C13064 f28860;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f28861;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public AdapterView.OnItemLongClickListener f28862;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public int f28863;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final HandlerC6680 f28864;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public boolean f28865;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public boolean f28866;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public boolean f28867;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f28868;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public long f28869;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public View.OnTouchListener f28870;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final DataSetObserver f28871;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f28872;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public AbsListView.OnScrollListener f28873;

    static {
        boolean z = false;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        int i4 = -327625971;
        int i5 = RunnableC3474.f10992;
        int i6 = C1294.f4556;
        int iM2566 = C0630.m2566("ۖܺ") ^ i6;
        int i7 = ((iM2566 ^ i5) * 12325) ^ 1209353895;
        int i8 = -1612059910;
        while (true) {
            i4 = ((((i4 ^ i5) * 10579) >> 31) & i7) ^ (iM2566 ^ i8);
            switch (i4) {
                case -2091426825:
                case 1863345686:
                    i = s + 14445;
                    if (C1005.m3501()) {
                        iM2566 = C0630.m2566("ۙ᩹") ^ i6;
                        i7 = ((iM2566 ^ i5) * 23587) ^ (-294305636);
                        i8 = 408853188;
                    } else {
                        iM2566 = C0630.m2566("᩶֨") ^ i5;
                        i7 = ((iM2566 ^ i6) * (-8565)) ^ (-529903244);
                        i8 = 1237028394;
                    }
                    break;
                case -2067968034:
                case -63228898:
                    if (C7106.f21815 != 0) {
                        iM2566 = (C0630.m2566("ۡۙ") ^ i6) * (-17);
                        i7 = ((iM2566 ^ i5) * 25101) ^ 396749907;
                        i8 = 180115376;
                    } else {
                        iM2566 = C0630.m2566("ۘ֡") ^ i5;
                        i7 = ((iM2566 ^ i6) * (-19077)) ^ 866737814;
                        i8 = 1017717017;
                    }
                    break;
                case -1804781598:
                case 1302626535:
                    C2520.m8026();
                    iM2566 = (C2105.m6981("᩵ܳ") ^ i6) * 87;
                    i7 = ((iM2566 ^ i5) * (-3013)) ^ 414271211;
                    i8 = 430872320;
                    break;
                case -1764378576:
                case -1693925751:
                    if (C0964.m3413()) {
                        iM2566 = (i6 - C2105.m6981("᩺ۘ")) * (-7);
                        i7 = ((iM2566 ^ i5) * 30791) ^ (-1561127113);
                        i8 = 1994696181;
                    } else {
                        iM2566 = C0630.m2566("᩷ۤ") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-29473)) ^ (-1943603487);
                        i8 = 1642683197;
                    }
                    break;
                case -1630438231:
                case -1573096088:
                    if (C2167.m7155()) {
                        iM2566 = C0630.m2566("᩷ۤ") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-29473)) ^ (-1943603487);
                        i8 = 1642683197;
                    } else {
                        iM2566 = C2105.m6981("᩷۫") ^ i5;
                        i7 = ((iM2566 ^ i6) * (-14131)) ^ 1793589664;
                        i8 = 716937120;
                    }
                    break;
                case -1589409795:
                case 676493941:
                    C1773.m5908();
                    if (!C3663.f11553) {
                        iM2566 = (C2105.m6981("ܰۡ") ^ i5) * 77;
                        i7 = ((iM2566 ^ i6) * (-24151)) ^ (-1312367398);
                        i8 = 1053462667;
                    } else {
                        iM2566 = C0630.m2566("᩷ۤ") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-29473)) ^ (-1943603487);
                        i8 = 1642683197;
                    }
                    break;
                case -1530564620:
                case -1412024844:
                    return;
                case -1495993852:
                case 1160888055:
                    i3 = 22499;
                    iM2566 = C2105.m6981("᩶᩸") ^ i6;
                    i7 = ((iM2566 ^ i5) * 18915) ^ 893112088;
                    i8 = 1224316359;
                    break;
                case -1419475361:
                case 1077740496:
                    s = sArr[c];
                    if (C3683.f11629 >= 0) {
                        iM2566 = C0630.m2566("᩷ۤ") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-29473)) ^ (-1943603487);
                        i8 = 1642683197;
                    } else {
                        iM2566 = (C0630.m2566("ۙ᩸") + i5) * (-53);
                        i7 = ((iM2566 ^ i6) * 6203) ^ (-1357976556);
                        i8 = 963028563;
                    }
                    break;
                case -1219050961:
                case -272887263:
                    i2 = i * i;
                    s2 = 57780;
                    if (C1916.f6442) {
                        iM2566 = (i5 - C0630.m2566("ۧۡ")) * 71;
                        i7 = ((iM2566 ^ i6) * (-30675)) ^ (-2088224838);
                        i8 = 37421359;
                    } else {
                        iM2566 = (C2105.m6981("᩵ܳ") ^ i6) * 87;
                        i7 = ((iM2566 ^ i5) * (-3013)) ^ 414271211;
                        i8 = 430872320;
                    }
                    break;
                case -823994789:
                case 1713329263:
                    C2126.m7040();
                    if (C3537.m10746() <= 0) {
                        iM2566 = (i5 - C0630.m2566("ܰ֡")) * (-59);
                        i7 = ((iM2566 ^ i6) * (-20393)) ^ (-1310453579);
                        i8 = 1734327434;
                    } else {
                        iM2566 = (C2105.m6981("᩵ܳ") ^ i6) * 87;
                        i7 = ((iM2566 ^ i5) * (-3013)) ^ 414271211;
                        i8 = 430872320;
                    }
                    break;
                case -699796878:
                case 138970022:
                    RunnableC0588.m2441();
                    if (C7106.f21815 == 0) {
                        iM2566 = (C0630.m2566("ۡۙ") ^ i6) * (-17);
                        i7 = ((iM2566 ^ i5) * 25101) ^ 396749907;
                        i8 = 180115376;
                    } else {
                        iM2566 = (C2105.m6981("ܰۡ") ^ i5) * 77;
                        i7 = ((iM2566 ^ i6) * (-24151)) ^ (-1312367398);
                        i8 = 1053462667;
                    }
                    break;
                case -438241022:
                case 1706386102:
                    if (C4263.f13799 > 0) {
                        iM2566 = (C2105.m6981("ܰۡ") ^ i5) * 77;
                        i7 = ((iM2566 ^ i6) * (-24151)) ^ (-1312367398);
                        i8 = 1053462667;
                    } else {
                        iM2566 = (C2105.m6981("᩵ܳ") ^ i6) * 87;
                        i7 = ((iM2566 ^ i5) * (-3013)) ^ 414271211;
                        i8 = 430872320;
                    }
                    break;
                case -403542738:
                case 2066431354:
                    z = true;
                    iM2566 = (C2105.m6981("֡ۛ") + i5) * 89;
                    i7 = ((iM2566 ^ i6) * 9385) ^ 1619482946;
                    i8 = 1000949392;
                    break;
                case -6433252:
                case 2038328744:
                    i3 = 57946;
                    iM2566 = C2105.m6981("᩶᩸") ^ i6;
                    i7 = ((iM2566 ^ i5) * 18915) ^ 893112088;
                    i8 = 1224316359;
                    break;
                case 156837495:
                case 1243154734:
                    try {
                        Class.forName(C0483.m2128(f28845, 31, 15, i3));
                        C2568.f8121 = z;
                        break;
                    } catch (Exception unused) {
                    }
                    iM2566 = C0630.m2566("ۙۚ") ^ i6;
                    i7 = ((iM2566 ^ i5) * (-13405)) ^ (-1071977131);
                    i8 = 197985022;
                    break;
                case 265188273:
                case 1046533277:
                    C1504.m5179();
                    if (C0630.f2410 > 0) {
                        iM2566 = (C2105.m6981("ܰۡ") ^ i5) * 77;
                        i7 = ((iM2566 ^ i6) * (-24151)) ^ (-1312367398);
                        i8 = 1053462667;
                    } else {
                        iM2566 = C2105.m6981("ᩳۡ") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-18475)) ^ 1704481628;
                        i8 = 1256945127;
                    }
                    break;
                case 472602168:
                case 820086773:
                    sArr = f28845;
                    c = 0;
                    if (C21923.m49329()) {
                        iM2566 = (i5 - C0630.m2566("ܰ֡")) * (-59);
                        i7 = ((iM2566 ^ i6) * (-20393)) ^ (-1310453579);
                        i8 = 1734327434;
                    } else {
                        iM2566 = (C0630.m2566("֫᩹") + i6) * (-41);
                        i7 = ((iM2566 ^ i5) * 30815) ^ (-1959578769);
                        i8 = 1430652119;
                    }
                    break;
                case 635095978:
                case 952870534:
                    if ((s * s2) - i2 > 0) {
                        iM2566 = C2105.m6981("ܶܿ") ^ i6;
                        i7 = ((iM2566 ^ i5) * 19521) ^ 1222565563;
                        i8 = 1351976702;
                    } else {
                        iM2566 = (i5 - C0630.m2566("ۗ֫")) * (-115);
                        i7 = ((iM2566 ^ i6) * (-31881)) ^ (-1451025551);
                        i8 = -1523346143;
                    }
                    break;
                case 799380850:
                case 1698923971:
                    C0483.m2121();
                    C1916.m6308();
                    throw new RuntimeException();
                case 826919935:
                case 2137668953:
                    try {
                        Class.forName(AbstractC2021.m6573(f28845, 1, 30, i3));
                        C2568.f8121 = z;
                        break;
                    } catch (Exception unused2) {
                    }
                    iM2566 = C2105.m6981("ܿۨ") ^ i5;
                    i7 = ((iM2566 ^ i6) * (-7257)) ^ 157693328;
                    i8 = 1756564563;
                    break;
                case 1166579923:
                case 1263690073:
                    if (C3245.f10203 <= 0) {
                        iM2566 = C0630.m2566("᩷ۤ") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-29473)) ^ (-1943603487);
                        i8 = 1642683197;
                    } else {
                        iM2566 = (C0630.m2566("ۖ֡") ^ i6) * 49;
                        i7 = ((iM2566 ^ i5) * (-29295)) ^ (-2021344355);
                        i8 = 69210750;
                    }
                    break;
                case 1550638094:
                case 1791796525:
                    if (C0798.m2998() != 0) {
                        iM2566 = (C0630.m2566("ܶۨ") + i5) * (-99);
                        i7 = ((iM2566 ^ i6) * 475) ^ (-836091116);
                        i8 = 532253854;
                    } else {
                        iM2566 = (C2105.m6981("ܰۡ") ^ i5) * 77;
                        i7 = ((iM2566 ^ i6) * (-24151)) ^ (-1312367398);
                        i8 = 1053462667;
                    }
                    break;
                case 1564685693:
                case 1874640158:
                    if (C0237.f1507 != 0) {
                        iM2566 = (C0630.m2566("ܶۨ") + i5) * (-99);
                        i7 = ((iM2566 ^ i6) * 475) ^ (-836091116);
                        i8 = 532253854;
                    } else {
                        iM2566 = (i6 - C2105.m6981("ܽܰ")) * (-57);
                        i7 = ((iM2566 ^ i5) * 25179) ^ 1270543102;
                        i8 = -1657401151;
                    }
                    break;
                default:
                    if (C7106.f21815 != 0) {
                        iM2566 = (i5 - C0630.m2566("ܰ֡")) * (-59);
                        i7 = ((iM2566 ^ i6) * (-20393)) ^ (-1310453579);
                        i8 = 1734327434;
                    } else {
                        iM2566 = (i5 - C2105.m6981("֫ۢ")) * (-53);
                        i7 = ((iM2566 ^ i6) * 23409) ^ (-2045477136);
                        i8 = 562136827;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m24348(C9503 c9503) {
        long jM10751 = 0;
        long j = 0;
        int i = 1477706038;
        int i2 = C0422.f1886;
        int i3 = C3019.f9544;
        int iM2566 = C0630.m2566("᩶ۙ") ^ i2;
        int i4 = ((iM2566 ^ i3) * 2155) ^ (-1959490423);
        int i5 = -731574931;
        while (true) {
            i = ((((i ^ i3) * (-14299)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2018395753:
                case 1823665726:
                    c9503.f28868 = jM10751 + j;
                    break;
                case -1897085109:
                case 848003044:
                    C1047.m3599();
                    if (C3911.m11924() > 0) {
                        iM2566 = C0630.m2566("᩷ۧ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 29185) ^ (-1878604279);
                        i5 = 368422130;
                    } else {
                        iM2566 = (C0630.m2566("۬᩹") + i3) * (-95);
                        i4 = ((iM2566 ^ i2) * 17115) ^ (-943047746);
                        i5 = -2069070935;
                    }
                    break;
                case -1862160990:
                case -1112597614:
                    if (C3746.m11369() >= 0) {
                        iM2566 = (i3 - C0630.m2566("ۧ۟")) * (-105);
                        i4 = ((iM2566 ^ i2) * 29869) ^ 1476705755;
                        i5 = 1624440906;
                    } else {
                        iM2566 = (C2105.m6981("᩶۟") + i3) * (-107);
                        i4 = ((iM2566 ^ i2) * (-31213)) ^ (-1997258977);
                        i5 = 1347930;
                    }
                    break;
                case -1831904512:
                case -863144625:
                    jM10751 = C3537.m10751();
                    if (C7811.f24123 >= 0) {
                        iM2566 = (i3 - C0630.m2566("ۧ۟")) * (-105);
                        i4 = ((iM2566 ^ i2) * 29869) ^ 1476705755;
                        i5 = 1624440906;
                    } else {
                        iM2566 = (C0630.m2566("ܿۜ") + i2) * 37;
                        i4 = ((iM2566 ^ i3) * (-18159)) ^ (-204680847);
                        i5 = 867190298;
                    }
                    break;
                case -1715959380:
                case -1405808681:
                    j = 500;
                    if (C1916.m6308() >= 0) {
                        iM2566 = (C0630.m2566("ܶ᩶") ^ i3) * (-97);
                        i4 = ((iM2566 ^ i2) * (-15545)) ^ (-483731944);
                        i5 = 2067780955;
                    } else {
                        iM2566 = C0630.m2566("۫۫") ^ i2;
                        i4 = ((iM2566 ^ i3) * 19421) ^ (-1629584252);
                        i5 = -1621481482;
                    }
                    break;
                case -1658551533:
                case -235132184:
                    if (C4263.f13799 <= 0) {
                        iM2566 = (i3 - C0630.m2566("ۧ۟")) * (-105);
                        i4 = ((iM2566 ^ i2) * 29869) ^ 1476705755;
                        i5 = 1624440906;
                    } else {
                        iM2566 = C0630.m2566("ۙܽ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 30611) ^ (-604062206);
                        i5 = -1088762628;
                    }
                    break;
                case -1630285981:
                case -623625136:
                    RunnableC1937.m6387();
                    C0964.m3413();
                    break;
                case -1617864663:
                case -1025096361:
                    if (C2958.m9034() <= 0) {
                        iM2566 = (C0630.m2566("۬᩹") + i3) * (-95);
                        i4 = ((iM2566 ^ i2) * 17115) ^ (-943047746);
                        i5 = -2069070935;
                    } else {
                        iM2566 = (i2 - C2105.m6981("ܺ۬")) * (-73);
                        i4 = ((iM2566 ^ i3) * 22997) ^ 191905165;
                        i5 = 1948914203;
                    }
                    break;
                case -1477356423:
                case 1001030484:
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = C0630.m2566("᩷ۧ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 29185) ^ (-1878604279);
                        i5 = 368422130;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ۜܺ")) * (-33);
                        i4 = ((iM2566 ^ i2) * (-22891)) ^ 1531013078;
                        i5 = 366287964;
                    }
                    break;
                case -1450024404:
                case 819073915:
                    if (C3746.f11829 <= 0) {
                        iM2566 = (C0630.m2566("ܶ᩶") ^ i3) * (-97);
                        i4 = ((iM2566 ^ i2) * (-15545)) ^ (-483731944);
                        i5 = 2067780955;
                    } else {
                        iM2566 = (C0630.m2566("ۧۙ") ^ i3) * (-33);
                        i4 = ((iM2566 ^ i2) * (-21597)) ^ (-1831657274);
                        i5 = -1345835914;
                    }
                    break;
                case -679480052:
                case -372637342:
                    C3683.m11222();
                    if (RunnableC3474.f10992 > 0) {
                        iM2566 = (C0630.m2566("۬᩹") + i3) * (-95);
                        i4 = ((iM2566 ^ i2) * 17115) ^ (-943047746);
                        i5 = -2069070935;
                    } else {
                        iM2566 = C2105.m6981("֫ۧ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-3315)) ^ (-395232326);
                        i5 = -2043135234;
                    }
                    break;
                case -266964993:
                case 1268552690:
                    if (C0798.f2919) {
                        iM2566 = (C0630.m2566("۬᩹") + i3) * (-95);
                        i4 = ((iM2566 ^ i2) * 17115) ^ (-943047746);
                        i5 = -2069070935;
                    } else {
                        iM2566 = (i2 - C0630.m2566("᩶ᩳ")) * 15;
                        i4 = ((iM2566 ^ i3) * 1969) ^ (-1882505349);
                        i5 = -1866519936;
                    }
                    break;
                case 220058787:
                case 2147004683:
                    C1504.m5179();
                    if (!C0382.f1805) {
                        iM2566 = (i3 - C0630.m2566("ۧ۟")) * (-105);
                        i4 = ((iM2566 ^ i2) * 29869) ^ 1476705755;
                        i5 = 1624440906;
                    } else {
                        iM2566 = C2105.m6981("֫ۧ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-3315)) ^ (-395232326);
                        i5 = -2043135234;
                    }
                    break;
                case 1410869172:
                case 2092353790:
                    C3746.m11369();
                    ServiceConnectionC3453.m10564();
                    iM2566 = C2105.m6981("֫ۧ") ^ i2;
                    i4 = ((iM2566 ^ i3) * (-3315)) ^ (-395232326);
                    i5 = -2043135234;
                    break;
                case 1463981191:
                case 2140338764:
                    if (C1128.f4106 <= 0) {
                        iM2566 = C2105.m6981("֫ۧ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-3315)) ^ (-395232326);
                        i5 = -2043135234;
                    } else {
                        iM2566 = (C0630.m2566("ܶۨ") ^ i3) * (-81);
                        i4 = ((iM2566 ^ i2) * 2747) ^ 1244957083;
                        i5 = 219017865;
                    }
                    break;
                default:
                    if (C1294.f4556 >= 0) {
                        iM2566 = (i3 - C0630.m2566("ۧ۟")) * (-105);
                        i4 = ((iM2566 ^ i2) * 29869) ^ 1476705755;
                        i5 = 1624440906;
                    } else {
                        iM2566 = C2105.m6981("ۨܳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-8167)) ^ (-1718255647);
                        i5 = -1842106633;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m24350() {
        C14792 c14792 = null;
        float f = 0.0f;
        int count = 0;
        int iM11358 = 0;
        float f2 = 0.0f;
        int iM24354 = 0;
        float f3 = 0.0f;
        int i = 953255409;
        int i2 = ViewOnClickListenerC1958.f6529;
        int i3 = RunnableC0588.f2309;
        int iM6981 = C2105.m6981("۠᩷") ^ i3;
        int i4 = ((iM6981 ^ i2) * 28777) ^ 1047149493;
        int i5 = 1829522185;
        while (true) {
            i = ((((i ^ i2) * (-1883)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2132246929:
                case 1795968384:
                    if (C11340.f33930 >= 0) {
                        iM6981 = (i3 - C0630.m2566("ܰۛ")) * 7;
                        i4 = ((iM6981 ^ i2) * 26759) ^ (-130209480);
                        i5 = 1620410254;
                    } else {
                        iM6981 = (C2105.m6981("ܶ᩷") ^ i3) * 47;
                        i4 = ((iM6981 ^ i2) * (-7143)) ^ (-826871493);
                        i5 = 442022763;
                    }
                    break;
                case -1870558451:
                case 937201411:
                    if (C0237.f1507 == 0) {
                        iM6981 = (C0630.m2566("ۨ֡") + i2) * (-113);
                        i4 = ((iM6981 ^ i3) * 7867) ^ (-1518117434);
                        i5 = -1651909000;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ܰۛ")) * 7;
                        i4 = ((iM6981 ^ i2) * 26759) ^ (-130209480);
                        i5 = 1620410254;
                    }
                    break;
                case -1838027201:
                case -742424308:
                    return false;
                case -1823408529:
                case 1602690300:
                    if (this.f28867) {
                        iM6981 = (C0630.m2566("᩺᩵") + i3) * 37;
                        i4 = ((iM6981 ^ i2) * (-16145)) ^ (-1512971444);
                        i5 = 879121675;
                    } else {
                        iM6981 = (C0630.m2566("ۙ᩹") + i3) * (-105);
                        i4 = ((iM6981 ^ i2) * 30949) ^ 73085619;
                        i5 = -1545607798;
                    }
                    break;
                case -1773637113:
                case -1380196615:
                    if (C22628.f73083 <= 0) {
                        iM6981 = (i3 - C0630.m2566("ܰۛ")) * 7;
                        i4 = ((iM6981 ^ i2) * 26759) ^ (-130209480);
                        i5 = 1620410254;
                    } else {
                        iM6981 = (C0630.m2566("֨֨") + i2) * (-29);
                        i4 = ((iM6981 ^ i3) * 31813) ^ 968132733;
                        i5 = 485337413;
                    }
                    break;
                case -1508946865:
                case 1341913085:
                    f3 = iM24354;
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = C0630.m2566("᩺۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * 12287) ^ (-1976585344);
                        i5 = -525315334;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ᩴۙ")) * 19;
                        i4 = ((iM6981 ^ i2) * (-19563)) ^ (-959219565);
                        i5 = 1867573414;
                    }
                    break;
                case -1487463759:
                case 2034800371:
                    if (C1005.f3721) {
                        iM6981 = C0630.m2566("ۙܺ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-25899)) ^ 430314019;
                        i5 = -422143979;
                    } else {
                        iM6981 = (C2105.m6981("ۤۗ") + i2) * (-111);
                        i4 = ((iM6981 ^ i3) * (-4719)) ^ 1147166651;
                        i5 = 346930503;
                    }
                    break;
                case -1162165480:
                case 1968032118:
                    if (this.f28867) {
                        iM6981 = (C2105.m6981("۠ᩴ") + i3) * (-53);
                        i4 = ((iM6981 ^ i2) * 1647) ^ 379546700;
                        i5 = 629461427;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ᩴ᩸")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM6981 ^ i3) * (-6611)) ^ 26894805;
                        i5 = 271739703;
                    }
                    break;
                case -1122165115:
                case -351402650:
                    if (c14792.f45162 > c14792.f45166) {
                        iM6981 = (i3 - C2105.m6981("ۤۛ")) * 13;
                        i4 = ((iM6981 ^ i2) * (-24283)) ^ 1495726502;
                        i5 = -1235963930;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ۤۤ")) * (-73);
                        i4 = ((iM6981 ^ i3) * 3115) ^ 625123609;
                        i5 = -777351715;
                    }
                    break;
                case -974155477:
                case 1181374824:
                    C1294.m4372();
                    if (!C2272.f7362) {
                        iM6981 = C0630.m2566("ۚ۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * 5423) ^ 2000820430;
                        i5 = 1917810057;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ܰۛ")) * 7;
                        i4 = ((iM6981 ^ i2) * 26759) ^ (-130209480);
                        i5 = 1620410254;
                    }
                    break;
                case -895374061:
                case 1737778750:
                    count = getCount();
                    iM11358 = C3746.m11358(this);
                    if (iM11358 > 0) {
                        iM6981 = (C2105.m6981("᩻ۜ") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM6981 ^ i2) * (-30797)) ^ (-1301241055);
                        i5 = 181781805;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ۤۤ")) * (-73);
                        i4 = ((iM6981 ^ i3) * 3115) ^ 625123609;
                        i5 = -777351715;
                    }
                    break;
                case -623757183:
                case -225858810:
                    RunnableC3474.m10630();
                    if (C0382.m1848()) {
                        iM6981 = C0630.m2566("۫ۛ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-32151)) ^ (-314983119);
                        i5 = -1588235672;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ܰۛ")) * 7;
                        i4 = ((iM6981 ^ i2) * 26759) ^ (-130209480);
                        i5 = 1620410254;
                    }
                    break;
                case -595600474:
                case 644614907:
                    C0798.m2998();
                    return false;
                case -560605433:
                case 1318974542:
                    if (RunnableC3474.m10630()) {
                        iM6981 = C0630.m2566("ۗ᩹") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-24347)) ^ 36204911;
                        i5 = 1175436822;
                    } else {
                        iM6981 = C0630.m2566("᩺۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * 12287) ^ (-1976585344);
                        i5 = -525315334;
                    }
                    break;
                case -469176846:
                case 559492463:
                    if (C3245.f10203 <= 0) {
                        iM6981 = (i3 - C0630.m2566("ܰۛ")) * 7;
                        i4 = ((iM6981 ^ i2) * 26759) ^ (-130209480);
                        i5 = 1620410254;
                    } else {
                        iM6981 = C2105.m6981("ܰۙ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 141) ^ (-261561420);
                        i5 = -681120184;
                    }
                    break;
                case -397624555:
                case 967949030:
                    f2 = count;
                    iM24354 = m24354();
                    if (C4616.f14690 <= 0) {
                        iM6981 = (C2105.m6981("ܽ֨") + i2) * (-35);
                        i4 = ((iM6981 ^ i3) * 7877) ^ 242510318;
                        i5 = -1512890245;
                    } else {
                        iM6981 = C2105.m6981("۠ۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-9377)) ^ (-247625042);
                        i5 = -231984252;
                    }
                    break;
                case -311031423:
                case 1379875354:
                    c14792 = this.f28846;
                    f = c14792.f45167;
                    if (RunnableC1937.m6387() != 0) {
                        iM6981 = (i3 - C0630.m2566("ܰۛ")) * 7;
                        i4 = ((iM6981 ^ i2) * 26759) ^ (-130209480);
                        i5 = 1620410254;
                    } else {
                        iM6981 = C0630.m2566("ۙ֫") ^ i2;
                        i4 = ((iM6981 ^ i3) * 27797) ^ 839466228;
                        i5 = 983169472;
                    }
                    break;
                case -185115855:
                case -164296029:
                    if (this.f28866) {
                        iM6981 = C2105.m6981("ۙ۬") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-20845)) ^ 1699884970;
                        i5 = -876339578;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ۤۤ")) * (-73);
                        i4 = ((iM6981 ^ i3) * 3115) ^ 625123609;
                        i5 = -777351715;
                    }
                    break;
                case -104673937:
                case 1340286593:
                    if (count - iM11358 > 0) {
                        iM6981 = (C0630.m2566("᩺ܽ") + i2) * 17;
                        i4 = ((iM6981 ^ i3) * (-27009)) ^ 1772201573;
                        i5 = 741220546;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ۤۤ")) * (-73);
                        i4 = ((iM6981 ^ i3) * 3115) ^ 625123609;
                        i5 = -777351715;
                    }
                    break;
                case 36074072:
                case 2119049014:
                    if (f2 / f3 <= 3.5f) {
                        iM6981 = (i2 - C2105.m6981("ۤۤ")) * (-73);
                        i4 = ((iM6981 ^ i3) * 3115) ^ 625123609;
                        i5 = -777351715;
                    } else {
                        iM6981 = (C2105.m6981("۠ᩴ") + i3) * (-53);
                        i4 = ((iM6981 ^ i2) * 1647) ^ 379546700;
                        i5 = 629461427;
                    }
                    break;
                case 250557870:
                case 950947991:
                    C21923.m49329();
                    if (!C1005.m3501()) {
                        iM6981 = (C2105.m6981("ۤۗ") + i2) * (-111);
                        i4 = ((iM6981 ^ i3) * (-4719)) ^ 1147166651;
                        i5 = 346930503;
                    } else {
                        iM6981 = (C0630.m2566("ۨ֡") + i2) * (-113);
                        i4 = ((iM6981 ^ i3) * 7867) ^ (-1518117434);
                        i5 = -1651909000;
                    }
                    break;
                case 497350835:
                case 627432934:
                    if (f > c14792.f45163) {
                        iM6981 = (C2105.m6981("ܶۖ") ^ i2) * (-51);
                        i4 = ((iM6981 ^ i3) * (-29495)) ^ (-606307897);
                        i5 = -671625779;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ۤۤ")) * (-73);
                        i4 = ((iM6981 ^ i3) * 3115) ^ 625123609;
                        i5 = -777351715;
                    }
                    break;
                case 824985222:
                case 1956499955:
                    if (!this.f28852) {
                        iM6981 = (i2 - C2105.m6981("ۤۤ")) * (-73);
                        i4 = ((iM6981 ^ i3) * 3115) ^ 625123609;
                        i5 = -777351715;
                    } else {
                        iM6981 = (C0630.m2566("᩺᩵") + i3) * 37;
                        i4 = ((iM6981 ^ i2) * (-16145)) ^ (-1512971444);
                        i5 = 879121675;
                    }
                    break;
                case 855208798:
                case 1971335897:
                    return true;
                case 992388754:
                case 1954857044:
                    if (this.f28857) {
                        iM6981 = (C0630.m2566("᩺᩵") + i3) * 37;
                        i4 = ((iM6981 ^ i2) * (-16145)) ^ (-1512971444);
                        i5 = 879121675;
                    } else {
                        iM6981 = (C0630.m2566("ܽۗ") + i2) * (-79);
                        i4 = ((iM6981 ^ i3) * (-11287)) ^ (-1585837907);
                        i5 = -1679292850;
                    }
                    break;
                case 1227418631:
                case 1430833554:
                    C22628.m50615();
                    iM6981 = C0630.m2566("ۚ۟") ^ i2;
                    i4 = ((iM6981 ^ i3) * 5423) ^ 2000820430;
                    i5 = 1917810057;
                    break;
                case 1591264671:
                case 1598992793:
                    if (C1504.f5354) {
                        iM6981 = (i3 - C0630.m2566("ܰۛ")) * 7;
                        i4 = ((iM6981 ^ i2) * 26759) ^ (-130209480);
                        i5 = 1620410254;
                    } else {
                        iM6981 = (C0630.m2566("ۗۛ") + i2) * (-101);
                        i4 = ((iM6981 ^ i3) * 30767) ^ (-1165915977);
                        i5 = -322898122;
                    }
                    break;
                case 1687367893:
                case 2133703739:
                    if (!C1916.f6442) {
                        iM6981 = (C2105.m6981("ۤۗ") + i2) * (-111);
                        i4 = ((iM6981 ^ i3) * (-4719)) ^ 1147166651;
                        i5 = 346930503;
                    } else {
                        iM6981 = (C2105.m6981("ܽ֨") + i2) * (-35);
                        i4 = ((iM6981 ^ i3) * 7877) ^ 242510318;
                        i5 = -1512890245;
                    }
                    break;
                case 1857717253:
                case 2059085635:
                    if (C2272.f7362) {
                        iM6981 = (i3 - C0630.m2566("ܰۛ")) * 7;
                        i4 = ((iM6981 ^ i2) * 26759) ^ (-130209480);
                        i5 = 1620410254;
                    } else {
                        iM6981 = C2105.m6981("ۘۗ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 24863) ^ (-842260857);
                        i5 = 876673961;
                    }
                    break;
                default:
                    if (C21923.f70183 != 0) {
                        iM6981 = C0630.m2566("᩺۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * 12287) ^ (-1976585344);
                        i5 = -525315334;
                    } else {
                        iM6981 = C0630.m2566("ᩳ۫") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-2455)) ^ (-437303787);
                        i5 = -2074329660;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean m24347() {
        long jM9262 = 0;
        long j = 0;
        long j2 = 0;
        int i = -2052326021;
        int i2 = C4117.f13076;
        int i3 = C2520.f8000;
        int iM6981 = (C2105.m6981("ۜܽ") ^ i3) * (-95);
        int i4 = ((iM6981 ^ i2) * 20861) ^ (-1005483446);
        int i5 = -719305113;
        while (true) {
            i = ((((i ^ i2) * (-24725)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -1831418231:
                case -235721924:
                    if (!C1504.f5354) {
                        iM6981 = C0630.m2566("۠ܿ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 15093) ^ 1230780684;
                        i5 = 1976769920;
                    } else {
                        iM6981 = C0630.m2566("ᩳܶ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-32157)) ^ (-632181662);
                        i5 = 572048206;
                    }
                    break;
                case -1694367183:
                case -567520335:
                    if (C3537.m10746() <= 0) {
                        iM6981 = C0630.m2566("ۡۛ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-29569)) ^ 1472052258;
                        i5 = -1004568524;
                    } else {
                        iM6981 = (i2 - C2105.m6981("᩻᩵")) * (-19);
                        i4 = ((iM6981 ^ i3) * (-1167)) ^ (-2029034356);
                        i5 = 1310072274;
                    }
                    break;
                case -1625975140:
                case 1623342054:
                    j2 = jM9262 - j;
                    if (C1128.m3851() <= 0) {
                        iM6981 = C0630.m2566("ۡۛ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-29569)) ^ 1472052258;
                        i5 = -1004568524;
                    } else {
                        iM6981 = (C2105.m6981("ᩴᩳ") ^ i2) * (-105);
                        i4 = ((iM6981 ^ i3) * (-22185)) ^ 535439461;
                        i5 = -914985248;
                    }
                    break;
                case -1592237944:
                case -1367104302:
                    jM9262 = C3019.m9262();
                    j = this.f28853;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = C0630.m2566("۠ܿ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 15093) ^ 1230780684;
                        i5 = 1976769920;
                    } else {
                        iM6981 = (i3 - C0630.m2566("᩸᩷")) * 127;
                        i4 = ((iM6981 ^ i2) * 5947) ^ 1802977088;
                        i5 = 1686650181;
                    }
                    break;
                case -1447088071:
                case 980424491:
                    if (C7811.f24123 >= 0) {
                        iM6981 = (C0630.m2566("֡ۢ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM6981 ^ i3) * 18599) ^ 399971580;
                        i5 = 871001605;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ܿۛ")) * (-89);
                        i4 = ((iM6981 ^ i2) * 7741) ^ 1608750812;
                        i5 = 1846411566;
                    }
                    break;
                case -1346839160:
                case -820213623:
                    if (j2 < 500) {
                        iM6981 = C2105.m6981("ۚ᩹") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-8157)) ^ 709568448;
                        i5 = -585782335;
                    } else {
                        iM6981 = C2105.m6981("ܽ֫") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-23679)) ^ (-1369020428);
                        i5 = -1244973099;
                    }
                    break;
                case -1050774373:
                case -887317286:
                    if (C4075.m12263() <= 0) {
                        iM6981 = C0630.m2566("ᩳܶ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-32157)) ^ (-632181662);
                        i5 = 572048206;
                    } else {
                        iM6981 = C2105.m6981("᩵ۧ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 12115) ^ (-1748265342);
                        i5 = -1367091875;
                    }
                    break;
                case -747001399:
                case 436786630:
                    C1047.m3599();
                    ServiceConnectionC3453.m10564();
                    iM6981 = C0630.m2566("۠ܿ") ^ i2;
                    i4 = ((iM6981 ^ i3) * 15093) ^ 1230780684;
                    i5 = 1976769920;
                    break;
                case -715027264:
                case 2995142:
                    if (C2272.f7362) {
                        iM6981 = (C0630.m2566("֡ۢ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM6981 ^ i3) * 18599) ^ 399971580;
                        i5 = 871001605;
                    } else {
                        iM6981 = C0630.m2566("ۘ۟") ^ i3;
                        i4 = ((iM6981 ^ i2) * 6691) ^ (-1708455642);
                        i5 = 347178447;
                    }
                    break;
                case -697638680:
                case 588929912:
                    C0382.m1848();
                    AbstractC2021.m6574();
                    return false;
                case -652716369:
                case 1035069409:
                    C1916.m6308();
                    if (!C0798.f2919) {
                        iM6981 = C0630.m2566("۠ܿ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 15093) ^ 1230780684;
                        i5 = 1976769920;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ܿۛ")) * (-89);
                        i4 = ((iM6981 ^ i2) * 7741) ^ 1608750812;
                        i5 = 1846411566;
                    }
                    break;
                case -486388868:
                case -185833739:
                    return false;
                case -226389874:
                case 1454476618:
                    return true;
                case -212177491:
                case -85627251:
                    if (C4263.f13799 <= 0) {
                        iM6981 = (i3 - C0630.m2566("ܿۛ")) * (-89);
                        i4 = ((iM6981 ^ i2) * 7741) ^ 1608750812;
                        i5 = 1846411566;
                    } else {
                        iM6981 = (C2105.m6981("֫᩸") + i3) * 85;
                        i4 = ((iM6981 ^ i2) * (-10743)) ^ 394569333;
                        i5 = 1630483815;
                    }
                    break;
                case -79894094:
                case 1227442514:
                    if (this.f28861) {
                        iM6981 = C2105.m6981("ۧۘ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-21157)) ^ 1061635148;
                        i5 = 716993549;
                    } else {
                        iM6981 = C2105.m6981("ܽ֫") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-23679)) ^ (-1369020428);
                        i5 = -1244973099;
                    }
                    break;
                case 404101441:
                case 1825729348:
                    if (C0050.m940() <= 0) {
                        iM6981 = (i3 - C0630.m2566("ܿۛ")) * (-89);
                        i4 = ((iM6981 ^ i2) * 7741) ^ 1608750812;
                        i5 = 1846411566;
                    } else {
                        iM6981 = (C0630.m2566("ܳۜ") + i2) * (-41);
                        i4 = ((iM6981 ^ i3) * 14349) ^ 595695252;
                        i5 = -355791235;
                    }
                    break;
                case 563285102:
                case 873672298:
                    if (C3432.f10845 >= 0) {
                        iM6981 = C0630.m2566("۠ܿ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 15093) ^ 1230780684;
                        i5 = 1976769920;
                    } else {
                        iM6981 = C2105.m6981("ۗܳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-25823)) ^ 384715055;
                        i5 = -1998253526;
                    }
                    break;
                case 1020694962:
                case 1361136069:
                    if (C0714.m2805()) {
                        iM6981 = (C0630.m2566("᩻ܳ") + i2) * (-51);
                        i4 = ((iM6981 ^ i3) * 16149) ^ (-646697291);
                        i5 = -1256422347;
                    } else {
                        iM6981 = C0630.m2566("ۡۛ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-29569)) ^ 1472052258;
                        i5 = -1004568524;
                    }
                    break;
                default:
                    if (C1773.f6144 <= 0) {
                        iM6981 = (i3 - C0630.m2566("ܿۛ")) * (-89);
                        i4 = ((iM6981 ^ i2) * 7741) ^ 1608750812;
                        i5 = 1846411566;
                    } else {
                        iM6981 = C2105.m6981("᩵۬") ^ i3;
                        i4 = ((iM6981 ^ i2) * 8325) ^ (-1554124431);
                        i5 = -411723769;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m24354() {
        int iM11358 = 0;
        int i = 0;
        int iM1484 = 0;
        int iM28026 = 0;
        int i2 = -1925793783;
        int i3 = C1047.f3863;
        int i4 = C1420.f5096;
        int iM6981 = (C2105.m6981("ܰܰ") ^ i4) * 41;
        int i5 = ((iM6981 ^ i3) * 30833) ^ (-970565610);
        int i6 = 298268495;
        while (true) {
            i2 = ((((i2 ^ i3) * 8085) >> 31) & i5) ^ (iM6981 ^ i6);
            switch (i2) {
                case -2105519759:
                case -234381390:
                    if (C3746.m11369() >= 0) {
                        iM6981 = C2105.m6981("ܿܿ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-21137)) ^ 358838797;
                        i6 = -648484760;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ܺܺ")) * 17;
                        i5 = ((iM6981 ^ i3) * (-12993)) ^ (-911845747);
                        i6 = -1597887119;
                    }
                    break;
                case -2031507356:
                case 1546311657:
                    i = 1;
                    if (iM11358 >= 1) {
                        iM6981 = C2105.m6981("ۨ᩶") ^ i4;
                        i5 = ((iM6981 ^ i3) * 13293) ^ 1470911217;
                        i6 = -269080995;
                    } else {
                        iM1484 = iM11358;
                        iM6981 = (C2105.m6981("ۙۧ") ^ i3) * 65;
                        i5 = ((iM6981 ^ i4) * (-29237)) ^ (-442526714);
                        i6 = 907701910;
                    }
                    break;
                case -1928496062:
                case -1536701583:
                    C4263.m12819();
                    return 0;
                case -1870256527:
                case -1790446369:
                    iM1484 = C0237.m1484(iM11358, C1005.m3498(this) / iM28026);
                    iM6981 = (C2105.m6981("ۙۧ") ^ i3) * 65;
                    i5 = ((iM6981 ^ i4) * (-29237)) ^ (-442526714);
                    i6 = 907701910;
                    break;
                case -1756810036:
                case 1835261465:
                    return this.f28863;
                case -1750825222:
                case 1866747311:
                    C3746.m11369();
                    if (C2520.f8000 < 0) {
                        iM6981 = (C0630.m2566("᩵ۙ") + i3) * 29;
                        i5 = ((iM6981 ^ i4) * (-13249)) ^ (-1275938200);
                        i6 = -48146271;
                    } else {
                        iM6981 = C2105.m6981("ܿܿ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-21137)) ^ 358838797;
                        i6 = -648484760;
                    }
                    break;
                case -1443066097:
                case -1373857231:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = C2105.m6981("ܿܿ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-21137)) ^ 358838797;
                        i6 = -648484760;
                    } else {
                        iM6981 = (C2105.m6981("ܽۤ") ^ i4) * 93;
                        i5 = ((iM6981 ^ i3) * 12041) ^ (-1445796776);
                        i6 = 1406128040;
                    }
                    break;
                case -1405350585:
                case 564508353:
                    iM28026 = C11340.m28026(C2958.m9024(this, 0));
                    if (iM28026 > i) {
                        iM6981 = (C0630.m2566("۠᩸") + i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM6981 ^ i4) * (-23411)) ^ 360556071;
                        i6 = 1265383846;
                    } else {
                        iM1484 = iM11358;
                        iM6981 = (C2105.m6981("ۙۧ") ^ i3) * 65;
                        i5 = ((iM6981 ^ i4) * (-29237)) ^ (-442526714);
                        i6 = 907701910;
                    }
                    break;
                case -1305968517:
                case -64037210:
                    if (C2126.f7087) {
                        iM6981 = (C0630.m2566("᩵ۙ") + i3) * 29;
                        i5 = ((iM6981 ^ i4) * (-13249)) ^ (-1275938200);
                        i6 = -48146271;
                    } else {
                        iM6981 = C2105.m6981("᩶᩷") ^ i3;
                        i5 = ((iM6981 ^ i4) * 21569) ^ (-1346931236);
                        i6 = -1748435869;
                    }
                    break;
                case -1071846039:
                case -206055665:
                    if (C3245.m9925() != 0) {
                        iM6981 = (C0630.m2566("᩵ۙ") + i3) * 29;
                        i5 = ((iM6981 ^ i4) * (-13249)) ^ (-1275938200);
                        i6 = -48146271;
                    } else {
                        iM6981 = (C0630.m2566("᩹֫") + i3) * 33;
                        i5 = ((iM6981 ^ i4) * 18507) ^ (-1464581229);
                        i6 = -1000423037;
                    }
                    break;
                case -922843430:
                case 1192180843:
                    C3019.m9255();
                    iM6981 = C0630.m2566("ۧۗ") ^ i4;
                    i5 = ((iM6981 ^ i3) * (-691)) ^ 1022269370;
                    i6 = -408040395;
                    break;
                case -895161349:
                case 484995424:
                    iM11358 = C3746.m11358(this);
                    if (C0798.m2998() != 0) {
                        iM6981 = (C0630.m2566("᩵ۙ") + i3) * 29;
                        i5 = ((iM6981 ^ i4) * (-13249)) ^ (-1275938200);
                        i6 = -48146271;
                    } else {
                        iM6981 = (C0630.m2566("ܺ֫") ^ i3) * 33;
                        i5 = ((iM6981 ^ i4) * 15931) ^ (-2088623728);
                        i6 = 1697417181;
                    }
                    break;
                case -691629534:
                case 971194171:
                    if (C0237.f1507 != 0) {
                        iM6981 = C2105.m6981("ܿܿ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-21137)) ^ 358838797;
                        i6 = -648484760;
                    } else {
                        iM6981 = (C2105.m6981("ۧ᩻") + i4) * (-121);
                        i5 = ((iM6981 ^ i3) * (-28023)) ^ (-1801632636);
                        i6 = 1183060035;
                    }
                    break;
                case -576053615:
                case 1174834694:
                    if (iM1484 > this.f28863) {
                        iM6981 = (C0630.m2566("ۗܳ") ^ i4) * (-29);
                        i5 = ((iM6981 ^ i3) * (-26421)) ^ (-96770599);
                        i6 = 1546391153;
                    } else {
                        iM6981 = C2105.m6981("᩶ܳ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-24549)) ^ (-325460395);
                        i6 = 439487192;
                    }
                    break;
                case -214558237:
                case -69790472:
                    C3019.m9255();
                    if (C22628.f73083 <= 0) {
                        iM6981 = C2105.m6981("ܿܿ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-21137)) ^ 358838797;
                        i6 = -648484760;
                    } else {
                        iM6981 = (i3 - C0630.m2566("֡ܶ")) * (-49);
                        i5 = ((iM6981 ^ i4) * (-10291)) ^ (-501832055);
                        i6 = 618084438;
                    }
                    break;
                case -121768296:
                case 1540960494:
                    if (C7811.f24123 >= 0) {
                        iM6981 = C0630.m2566("ۧۗ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-691)) ^ 1022269370;
                        i6 = -408040395;
                    } else {
                        iM6981 = C2105.m6981("ۚܶ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-26839)) ^ (-110379376);
                        i6 = 1539198167;
                    }
                    break;
                case -54950895:
                case 1505262597:
                    if (C1420.f5096 <= 0) {
                        iM6981 = (C2105.m6981("ۙۙ") ^ i4) * (-29);
                        i5 = ((iM6981 ^ i3) * (-2033)) ^ 526488334;
                        i6 = 1029285427;
                    } else {
                        iM6981 = C2105.m6981("᩸᩸") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-25265)) ^ 448209709;
                        i6 = -365618277;
                    }
                    break;
                case 191728939:
                case 447985611:
                    if (C0237.m1481() >= 0) {
                        iM6981 = C0630.m2566("ۧۗ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-691)) ^ 1022269370;
                        i6 = -408040395;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ۡܶ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM6981 ^ i3) * (-3729)) ^ 450419737;
                        i6 = 1856622046;
                    }
                    break;
                case 238150281:
                case 1256704683:
                    this.f28863 = iM1484;
                    iM6981 = C2105.m6981("᩶ܳ") ^ i3;
                    i5 = ((iM6981 ^ i4) * (-24549)) ^ (-325460395);
                    i6 = 439487192;
                    break;
                case 548082917:
                case 555407659:
                    if (C4263.m12819() >= 0) {
                        iM6981 = (C2105.m6981("ۙۙ") ^ i4) * (-29);
                        i5 = ((iM6981 ^ i3) * (-2033)) ^ 526488334;
                        i6 = 1029285427;
                    } else {
                        iM6981 = C0630.m2566("ۢۗ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-1477)) ^ (-1405711467);
                        i6 = 194081080;
                    }
                    break;
                default:
                    C21923.m49329();
                    if (C3537.m10746() <= 0) {
                        iM6981 = (i3 - C0630.m2566("֡ܶ")) * (-49);
                        i5 = ((iM6981 ^ i4) * (-10291)) ^ (-501832055);
                        i6 = 618084438;
                    } else {
                        iM6981 = C0630.m2566("ۧۗ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-691)) ^ 1022269370;
                        i6 = -408040395;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24340(MotionEvent motionEvent) {
        float x = 0.0f;
        boolean z = false;
        boolean z2 = false;
        C13064 c13064 = null;
        float f = 0.0f;
        float f2 = 0.0f;
        int i = -274826791;
        int i2 = C0422.f1886;
        int i3 = C1294.f4556;
        int iM2566 = (C0630.m2566("ܽ۫") + i3) * 63;
        int i4 = ((iM2566 ^ i2) * (-14673)) ^ 1315120023;
        int i5 = -1777022522;
        while (true) {
            i = ((((i ^ i2) * (-8075)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2058811135:
                case 1824723660:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = (C2105.m6981("᩺ۜ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2566 ^ i2) * (-30215)) ^ (-17779537);
                        i5 = 221648463;
                    } else {
                        iM2566 = (i3 - C0630.m2566("۟֨")) * 15;
                        i4 = ((iM2566 ^ i2) * (-32489)) ^ 15499767;
                        i5 = -1183938776;
                    }
                    break;
                case -2049785441:
                case -2024925765:
                    RunnableC3474.m10630();
                    if (!C2272.m7503()) {
                        iM2566 = C2105.m6981("ᩴ֫") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-13261)) ^ 959604684;
                        i5 = -263776243;
                    } else {
                        iM2566 = (i3 - C2105.m6981("᩺۫")) * (-53);
                        i4 = ((iM2566 ^ i2) * (-19757)) ^ (-1096972124);
                        i5 = -1703521765;
                    }
                    break;
                case -1757218956:
                case 1664477641:
                    break;
                case -1596355240:
                case 1243484170:
                    this.f28847 = f - f2;
                    if (C3911.m11924() <= 0) {
                        iM2566 = C2105.m6981("ᩴ֫") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-13261)) ^ 959604684;
                        i5 = -263776243;
                    } else {
                        iM2566 = (C0630.m2566("᩻᩸") + i2) * (-9);
                        i4 = ((iM2566 ^ i3) * 15831) ^ (-1958828383);
                        i5 = -292052007;
                    }
                    break;
                case -1582599883:
                case 964453693:
                    this.f28852 = z;
                    if (C3663.f11553) {
                        iM2566 = C2105.m6981("ᩴ֫") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-13261)) ^ 959604684;
                        i5 = -263776243;
                    } else {
                        iM2566 = (C2105.m6981("۟ܰ") ^ i2) * (-27);
                        i4 = ((iM2566 ^ i3) * (-32153)) ^ (-1653615669);
                        i5 = 1779328911;
                    }
                    break;
                case -1541549907:
                case 1273474479:
                    this.f28848 = motionEvent.getY();
                    if (C1420.f5096 <= 0) {
                        iM2566 = (C2105.m6981("᩺ۜ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2566 ^ i2) * (-30215)) ^ (-17779537);
                        i5 = 221648463;
                    } else {
                        iM2566 = C0630.m2566("ᩳۢ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-16079)) ^ (-749268857);
                        i5 = -1283617032;
                    }
                    break;
                case -1528321016:
                case -132424778:
                    x = motionEvent.getX();
                    if (C7106.f21815 != 0) {
                        iM2566 = (C2105.m6981("ܳ᩹") ^ i3) * (-49);
                        i4 = ((iM2566 ^ i2) * 3445) ^ (-29345842);
                        i5 = -131673160;
                    } else {
                        iM2566 = (C0630.m2566("ۜۨ") ^ i2) * (-87);
                        i4 = ((iM2566 ^ i3) * 29359) ^ (-804363681);
                        i5 = 1892888675;
                    }
                    break;
                case -1523171477:
                case 200121911:
                    C1294.m4372();
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = (C2105.m6981("ܳ᩹") ^ i3) * (-49);
                        i4 = ((iM2566 ^ i2) * 3445) ^ (-29345842);
                        i5 = -131673160;
                    } else {
                        iM2566 = (i3 - C2105.m6981("᩺۫")) * (-53);
                        i4 = ((iM2566 ^ i2) * (-19757)) ^ (-1096972124);
                        i5 = -1703521765;
                    }
                    break;
                case -1093424926:
                case -17518201:
                    c13064.m31648(z2 ? 1 : 0, this.f28859);
                    iM2566 = C0630.m2566("᩶᩵") ^ i3;
                    i4 = ((iM2566 ^ i2) * (-10403)) ^ (-1972194071);
                    i5 = -693849531;
                    break;
                case -1025666802:
                case 1860986827:
                    C0630.m2574(this);
                    if (getParent() != null) {
                        iM2566 = C0630.m2566("۟ۛ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-30943)) ^ 314121487;
                        i5 = -283887713;
                    } else {
                        iM2566 = (C2105.m6981("۬֨") + i2) * (-81);
                        i4 = ((iM2566 ^ i3) * 28289) ^ (-1926964955);
                        i5 = -1979127097;
                    }
                    break;
                case -911330900:
                case 1270616489:
                    f2 = this.f28848;
                    if (C0630.f2410 <= 0) {
                        iM2566 = C2105.m6981("ۖᩳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-31253)) ^ 26454113;
                        i5 = -1109552585;
                    } else {
                        iM2566 = C2105.m6981("ܿۖ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-25169)) ^ 249039809;
                        i5 = 265411588;
                    }
                    break;
                case -793610571:
                case -250906261:
                    this.f28869 = C3019.m9262();
                    if (C3432.f10845 >= 0) {
                        iM2566 = (i3 - C2105.m6981("᩺۫")) * (-53);
                        i4 = ((iM2566 ^ i2) * (-19757)) ^ (-1096972124);
                        i5 = -1703521765;
                    } else {
                        iM2566 = C0630.m2566("ۧܽ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-13729)) ^ (-18608991);
                        i5 = 1842739731;
                    }
                    break;
                case -391159109:
                case 698735152:
                    C1711.m5736();
                    RunnableC0588.m2441();
                    break;
                case -147056522:
                case 1040101963:
                    this.f28850 = x;
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = (C2105.m6981("ܳ᩹") ^ i3) * (-49);
                        i4 = ((iM2566 ^ i2) * 3445) ^ (-29345842);
                        i5 = -131673160;
                    } else {
                        iM2566 = C0630.m2566("ۧۜ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 21407) ^ 860798819;
                        i5 = -1124708487;
                    }
                    break;
                case 28541137:
                case 1075599976:
                    getParent().requestDisallowInterceptTouchEvent(z2);
                    iM2566 = (C2105.m6981("۬֨") + i2) * (-81);
                    i4 = ((iM2566 ^ i3) * 28289) ^ (-1926964955);
                    i5 = -1979127097;
                    break;
                case 301956430:
                case 477495836:
                    m24346(motionEvent);
                    z = false;
                    if (C0422.f1886 <= 0) {
                        iM2566 = (C2105.m6981("ܳ᩹") ^ i3) * (-49);
                        i4 = ((iM2566 ^ i2) * 3445) ^ (-29345842);
                        i5 = -131673160;
                    } else {
                        iM2566 = C0630.m2566("ۤ۠") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-2067)) ^ (-670160234);
                        i5 = 245570402;
                    }
                    break;
                case 345157228:
                case 1504442021:
                    C0714.m2805();
                    iM2566 = C2105.m6981("ᩴ֫") ^ i2;
                    i4 = ((iM2566 ^ i3) * (-13261)) ^ 959604684;
                    i5 = -263776243;
                    break;
                case 362201769:
                case 891835007:
                    z2 = true;
                    z2 = true;
                    this.f28867 = true;
                    c13064 = this.f28860;
                    if (c13064 != null) {
                        iM2566 = C0630.m2566("۬ۗ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 21969) ^ (-856265868);
                        i5 = -1506265464;
                    } else {
                        iM2566 = C0630.m2566("᩶᩵") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-10403)) ^ (-1972194071);
                        i5 = -693849531;
                    }
                    break;
                case 1027913241:
                case 2041531089:
                    f = this.f28846.f45166;
                    if (C0382.f1805) {
                        iM2566 = (i2 - C2105.m6981("ܳ۠")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2566 ^ i3) * (-1275)) ^ (-1429629890);
                        i5 = -242347592;
                    } else {
                        iM2566 = (C2105.m6981("᩺ۜ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2566 ^ i2) * (-30215)) ^ (-17779537);
                        i5 = 221648463;
                    }
                    break;
                default:
                    if (C4117.f13076 > 0) {
                        iM2566 = C2105.m6981("ۖᩳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-31253)) ^ 26454113;
                        i5 = -1109552585;
                    } else {
                        iM2566 = (i3 - C2105.m6981("᩺۫")) * (-53);
                        i4 = ((iM2566 ^ i2) * (-19757)) ^ (-1096972124);
                        i5 = -1703521765;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m24358() {
        int i = 608116836;
        int i2 = C1294.f4556;
        int i3 = C3537.f11231;
        int iM2566 = C0630.m2566("ۖۧ") ^ i2;
        int i4 = ((iM2566 ^ i3) * (-31745)) ^ R.id.four;
        int i5 = 1255688806;
        while (true) {
            i = ((((i ^ i3) * 10533) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2137579883:
                case 1189362614:
                    if (this.f28867) {
                        iM2566 = (C0630.m2566("ۚ֨") ^ i3) * 35;
                        i4 = ((iM2566 ^ i2) * 28129) ^ 949910752;
                        i5 = 985816089;
                    } else {
                        iM2566 = (C0630.m2566("ۗ᩷") ^ i3) * 61;
                        i4 = ((iM2566 ^ i2) * 11177) ^ (-16695693);
                        i5 = -765455471;
                    }
                    break;
                case -2023324879:
                case 724244915:
                    return false;
                case -1847372379:
                case -1596411616:
                    if (C11340.f33930 >= 0) {
                        iM2566 = (C0630.m2566("۬֫") + i2) * 9;
                        i4 = ((iM2566 ^ i3) * 22055) ^ (-1650131943);
                        i5 = -1171912631;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ۨۨ")) * (-21);
                        i4 = ((iM2566 ^ i2) * (-22679)) ^ 133000664;
                        i5 = 2122841835;
                    }
                    break;
                case -1767237803:
                case -367527630:
                    return true;
                case -1697317163:
                case 711792286:
                    if (C0382.m1848()) {
                        iM2566 = (i2 - C0630.m2566("֡ۡ")) * (-11);
                        i4 = ((iM2566 ^ i3) * (-17599)) ^ (-86972938);
                        i5 = -1706872872;
                    } else {
                        iM2566 = (C2105.m6981("ۛ᩺") ^ i2) * 87;
                        i4 = ((iM2566 ^ i3) * (-25177)) ^ 461036335;
                        i5 = -365599319;
                    }
                    break;
                case -1653592589:
                case -162344326:
                    C4117.m12364();
                    C3683.m11222();
                    return false;
                case -1526716885:
                case -1315656502:
                    C3911.m11924();
                    if (ServiceConnectionC3453.m10564() > 0) {
                        iM2566 = C2105.m6981("᩹ۜ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 2019) ^ 1979568502;
                        i5 = 427362959;
                    } else {
                        iM2566 = (C0630.m2566("۬֫") + i2) * 9;
                        i4 = ((iM2566 ^ i3) * 22055) ^ (-1650131943);
                        i5 = -1171912631;
                    }
                    break;
                case -1501011087:
                case 361619540:
                    if (C4117.f13076 <= 0) {
                        iM2566 = (i3 - C0630.m2566("ۡ᩵")) * 57;
                        i4 = ((iM2566 ^ i2) * 12799) ^ 241865810;
                        i5 = 7008684;
                    } else {
                        iM2566 = C2105.m6981("᩹ۜ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 2019) ^ 1979568502;
                        i5 = 427362959;
                    }
                    break;
                case -1413721380:
                case 1964377281:
                    if (m24347()) {
                        iM2566 = (C0630.m2566("ۚ֨") ^ i3) * 35;
                        i4 = ((iM2566 ^ i2) * 28129) ^ 949910752;
                        i5 = 985816089;
                    } else {
                        iM2566 = (C0630.m2566("۬ۛ") + i2) * 25;
                        i4 = ((iM2566 ^ i3) * (-12501)) ^ 8636899;
                        i5 = -1753713505;
                    }
                    break;
                case -1393936880:
                case -1251745787:
                    if (C11340.f33930 >= 0) {
                        iM2566 = (i2 - C0630.m2566("֡ۡ")) * (-11);
                        i4 = ((iM2566 ^ i3) * (-17599)) ^ (-86972938);
                        i5 = -1706872872;
                    } else {
                        iM2566 = (C2105.m6981("ۨ᩸") ^ i2) * 49;
                        i4 = ((iM2566 ^ i3) * 3173) ^ (-1501917615);
                        i5 = -957578792;
                    }
                    break;
                case -1234008281:
                case -94826697:
                    C21923.m49329();
                    iM2566 = (C0630.m2566("۬֫") + i2) * 9;
                    i4 = ((iM2566 ^ i3) * 22055) ^ (-1650131943);
                    i5 = -1171912631;
                    break;
                case -957302545:
                case 35943081:
                    if (C2167.m7155()) {
                        iM2566 = (i2 - C0630.m2566("֡ۡ")) * (-11);
                        i4 = ((iM2566 ^ i3) * (-17599)) ^ (-86972938);
                        i5 = -1706872872;
                    } else {
                        iM2566 = C2105.m6981("᩷ۜ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 6943) ^ (-174704319);
                        i5 = 79159218;
                    }
                    break;
                case -715136214:
                case 315642469:
                    if (C4159.m12565() >= 0) {
                        iM2566 = (i3 - C0630.m2566("᩷۬")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2566 ^ i2) * 21687) ^ 1507745887;
                        i5 = -1524967668;
                    } else {
                        iM2566 = C0630.m2566("ܳۜ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 20157) ^ 1472995982;
                        i5 = -744646422;
                    }
                    break;
                case -521873249:
                case 50790436:
                    C3245.m9925();
                    if (!C0798.f2919) {
                        iM2566 = (i3 - C0630.m2566("᩷۬")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2566 ^ i2) * 21687) ^ 1507745887;
                        i5 = -1524967668;
                    } else {
                        iM2566 = (C0630.m2566("۬֫") + i2) * 9;
                        i4 = ((iM2566 ^ i3) * 22055) ^ (-1650131943);
                        i5 = -1171912631;
                    }
                    break;
                case -439343460:
                case 1923840756:
                    if (C21923.f70183 != 0) {
                        iM2566 = C2105.m6981("᩹ۜ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 2019) ^ 1979568502;
                        i5 = 427362959;
                    } else {
                        iM2566 = (C2105.m6981("ᩴ᩷") + i2) * 59;
                        i4 = ((iM2566 ^ i3) * (-13617)) ^ (-155908423);
                        i5 = 2007494919;
                    }
                    break;
                case -53399129:
                case 1182337043:
                    if (C7106.f21815 != 0) {
                        iM2566 = (i3 - C0630.m2566("ۡ᩵")) * 57;
                        i4 = ((iM2566 ^ i2) * 12799) ^ 241865810;
                        i5 = 7008684;
                    } else {
                        iM2566 = C0630.m2566("᩸᩺") ^ i3;
                        i4 = ((iM2566 ^ i2) * 5705) ^ 1167182452;
                        i5 = 82157666;
                    }
                    break;
                case 276114086:
                case 1159904505:
                    if (C3746.f11829 <= 0) {
                        iM2566 = C2105.m6981("᩹ۜ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 2019) ^ 1979568502;
                        i5 = 427362959;
                    } else {
                        iM2566 = C2105.m6981("᩸᩵") ^ i3;
                        i4 = ((iM2566 ^ i2) * 3275) ^ 1424357334;
                        i5 = 559225709;
                    }
                    break;
                case 543352093:
                case 1205938964:
                    if (C4075.f12947 >= 0) {
                        iM2566 = (i2 - C0630.m2566("֡ۡ")) * (-11);
                        i4 = ((iM2566 ^ i3) * (-17599)) ^ (-86972938);
                        i5 = -1706872872;
                    } else {
                        iM2566 = (C0630.m2566("ܰ᩷") + i3) * 47;
                        i4 = ((iM2566 ^ i2) * 32349) ^ 345077307;
                        i5 = -1006257818;
                    }
                    break;
                default:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = (i3 - C0630.m2566("ۡ᩵")) * 57;
                        i4 = ((iM2566 ^ i2) * 12799) ^ 241865810;
                        i5 = 7008684;
                    } else {
                        iM2566 = C0630.m2566("᩹ۛ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 22121) ^ 1583374416;
                        i5 = 903836540;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24355(View.OnTouchListener onTouchListener) {
        ArrayList arrayList = null;
        int i = 400667209;
        int i2 = ServiceConnectionC3453.f10921;
        int i3 = C4616.f14690;
        int iM2566 = C0630.m2566("۫᩸") ^ i3;
        int i4 = ((iM2566 ^ i2) * (-23649)) ^ (-656465364);
        int i5 = 196757645;
        while (true) {
            i = ((((i ^ i2) * (-2995)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2026750717:
                case 1896958298:
                    if (this.f28849 == null) {
                        iM2566 = (C0630.m2566("ۚ֨") ^ i2) * (-85);
                        i4 = ((iM2566 ^ i3) * (-12659)) ^ 1552637268;
                        i5 = -251136449;
                    } else {
                        iM2566 = (i3 - C2105.m6981("۟᩻")) * (-99);
                        i4 = ((iM2566 ^ i2) * (-26445)) ^ (-20521563);
                        i5 = -426342839;
                    }
                    break;
                case -1909292613:
                case -569166247:
                    if (!C2126.f7087) {
                        iM2566 = C2105.m6981("ᩳ᩸") ^ i3;
                        i4 = ((iM2566 ^ i2) * 12739) ^ 1367741324;
                        i5 = -734785237;
                    } else {
                        iM2566 = C0630.m2566("ۗܶ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 14523) ^ 1914766422;
                        i5 = 1667753330;
                    }
                    break;
                case -1886336195:
                case 1734528798:
                    RunnableC3474.m10630();
                    C3245.m9925();
                    iM2566 = C2105.m6981("ᩳ᩸") ^ i3;
                    i4 = ((iM2566 ^ i2) * 12739) ^ 1367741324;
                    i5 = -734785237;
                    break;
                case -1872366090:
                case 1367051597:
                    if (C7106.m19120() <= 0) {
                        iM2566 = (C0630.m2566("֨۟") ^ i3) * 37;
                        i4 = ((iM2566 ^ i2) * (-7165)) ^ (-43384917);
                        i5 = 388278792;
                    } else {
                        iM2566 = C2105.m6981("᩺ܽ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 21161) ^ 292997409;
                        i5 = 475076148;
                    }
                    break;
                case -1816162163:
                case 1593061580:
                    C3663.m11168();
                    if (C21923.f70183 == 0) {
                        iM2566 = C0630.m2566("ۗܶ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 14523) ^ 1914766422;
                        i5 = 1667753330;
                    } else {
                        iM2566 = C0630.m2566("֨᩹") ^ i2;
                        i4 = ((iM2566 ^ i3) * 26857) ^ (-145704486);
                        i5 = 650609337;
                    }
                    break;
                case -1635173199:
                case 1589058315:
                    if (C0237.f1507 != 0) {
                        iM2566 = (C0630.m2566("֨۟") ^ i3) * 37;
                        i4 = ((iM2566 ^ i2) * (-7165)) ^ (-43384917);
                        i5 = 388278792;
                    } else {
                        iM2566 = C0630.m2566("۟ۛ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 3057) ^ (-577232592);
                        i5 = 534920185;
                    }
                    break;
                case -1595224811:
                case 1033207203:
                    arrayList = new ArrayList();
                    if (C1773.f6144 <= 0) {
                        iM2566 = (C0630.m2566("֨۟") ^ i3) * 37;
                        i4 = ((iM2566 ^ i2) * (-7165)) ^ (-43384917);
                        i5 = 388278792;
                    } else {
                        iM2566 = C2105.m6981("۫ۘ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-27575)) ^ (-1900268723);
                        i5 = 742223650;
                    }
                    break;
                case -1283068473:
                case 176581807:
                    this.f28849 = arrayList;
                    if (C2520.f8000 >= 0) {
                        iM2566 = (C0630.m2566("ۡ֨") ^ i2) * 33;
                        i4 = ((iM2566 ^ i3) * (-32677)) ^ (-401869492);
                        i5 = -718728517;
                    } else {
                        iM2566 = (i2 - C2105.m6981("ۧۤ")) * 23;
                        i4 = ((iM2566 ^ i3) * (-12267)) ^ 239173787;
                        i5 = 718030616;
                    }
                    break;
                case -1205735445:
                case 840988156:
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = (C0630.m2566("֨۟") ^ i3) * 37;
                        i4 = ((iM2566 ^ i2) * (-7165)) ^ (-43384917);
                        i5 = 388278792;
                    } else {
                        iM2566 = C0630.m2566("۟᩹") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-4743)) ^ (-399278140);
                        i5 = 720469912;
                    }
                    break;
                case -979689684:
                case -972659310:
                    if (C1420.f5096 <= 0) {
                        iM2566 = (C0630.m2566("֨۟") ^ i3) * 37;
                        i4 = ((iM2566 ^ i2) * (-7165)) ^ (-43384917);
                        i5 = 388278792;
                    } else {
                        iM2566 = (C2105.m6981("ܽۚ") ^ i3) * (-115);
                        i4 = ((iM2566 ^ i2) * (-20955)) ^ (-2111628386);
                        i5 = 1725107882;
                    }
                    break;
                case -934099203:
                case 988411127:
                    if (C5695.f17556 >= 0) {
                        iM2566 = (C0630.m2566("ۡ֨") ^ i2) * 33;
                        i4 = ((iM2566 ^ i3) * (-32677)) ^ (-401869492);
                        i5 = -718728517;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ۚ᩶")) * 25;
                        i4 = ((iM2566 ^ i2) * (-15017)) ^ (-285726789);
                        i5 = -94299976;
                    }
                    break;
                case -902775272:
                case 1720808843:
                    if (AbstractC2021.f6743 > 0) {
                        iM2566 = (C0630.m2566("֨۟") ^ i3) * 37;
                        i4 = ((iM2566 ^ i2) * (-7165)) ^ (-43384917);
                        i5 = 388278792;
                    } else {
                        iM2566 = C2105.m6981("ᩳ᩸") ^ i3;
                        i4 = ((iM2566 ^ i2) * 12739) ^ 1367741324;
                        i5 = -734785237;
                    }
                    break;
                case -484180227:
                case 303342420:
                    C1916.m6307(this.f28849, onTouchListener);
                    break;
                case -296759863:
                case -216722091:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = C0630.m2566("ۗܶ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 14523) ^ 1914766422;
                        i5 = 1667753330;
                    } else {
                        iM2566 = C0630.m2566("ۖۖ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-16101)) ^ (-1481859477);
                        i5 = -1114856707;
                    }
                    break;
                case -269302723:
                case -225672818:
                    C4263.m12819();
                    break;
                case 755066528:
                case 1339371855:
                    if (C1773.f6144 <= 0) {
                        iM2566 = (C0630.m2566("֨۟") ^ i3) * 37;
                        i4 = ((iM2566 ^ i2) * (-7165)) ^ (-43384917);
                        i5 = 388278792;
                    } else {
                        iM2566 = C2105.m6981("ܿܺ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-23975)) ^ (-509747063);
                        i5 = -1204681302;
                    }
                    break;
                case 1413716399:
                case 1627353645:
                    super.setOnTouchListener(new View.OnTouchListener() { // from class: l.ܿۢۡ
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            return C9503.m24343(this.f52915, view, motionEvent);
                        }
                    });
                    iM2566 = (i3 - C2105.m6981("۟᩻")) * (-99);
                    i4 = ((iM2566 ^ i2) * (-26445)) ^ (-20521563);
                    i5 = -426342839;
                    break;
                default:
                    if (C4159.f13567) {
                        iM2566 = C2105.m6981("۬ᩳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 27341) ^ 607755986;
                        i5 = 1808087412;
                    } else {
                        iM2566 = (C0630.m2566("֨۟") ^ i3) * 37;
                        i4 = ((iM2566 ^ i2) * (-7165)) ^ (-43384917);
                        i5 = 388278792;
                    }
                    break;
            }
            return;
        }
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.ViewParent
    public final boolean showContextMenuForChild(View view, float f, float f2) {
        boolean zShowContextMenuForChild = false;
        int i = 340712551;
        int i2 = ViewOnClickListenerC1958.f6529;
        int i3 = C3746.f11829;
        int iM2566 = (C0630.m2566("ܳۧ") + i2) * 43;
        int i4 = ((iM2566 ^ i3) * 5077) ^ 40794622;
        int i5 = 829770647;
        while (true) {
            i = ((((i ^ i3) * (-26865)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -1949577789:
                case -600893721:
                    if (C0964.f3626 != 0) {
                        iM2566 = (C2105.m6981("ᩳۛ") + i2) * 75;
                        i4 = ((iM2566 ^ i3) * (-453)) ^ (-409635374);
                        i5 = 1166320023;
                    } else {
                        iM2566 = (i2 - C2105.m6981("۠ܳ")) * (-7);
                        i4 = ((iM2566 ^ i3) * 4421) ^ 660135537;
                        i5 = 1471860074;
                    }
                    break;
                case -1895984935:
                case 1978069588:
                    return zShowContextMenuForChild;
                case -1854893202:
                case -804883703:
                    C3663.m11168();
                    if (C7106.m19120() <= 0) {
                        iM2566 = (C2105.m6981("ᩳۛ") + i2) * 75;
                        i4 = ((iM2566 ^ i3) * (-453)) ^ (-409635374);
                        i5 = 1166320023;
                    } else {
                        iM2566 = C0630.m2566("ᩴ֨") ^ i3;
                        i4 = ((iM2566 ^ i2) * 14641) ^ 1511123123;
                        i5 = 1155013170;
                    }
                    break;
                case -1688336593:
                case 1331568981:
                    if (C4117.f13076 <= 0) {
                        iM2566 = C2105.m6981("ᩴۤ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 22733) ^ (-1850541103);
                        i5 = 524787219;
                    } else {
                        iM2566 = C0630.m2566("᩶ۡ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-6289)) ^ (-459574436);
                        i5 = -631007961;
                    }
                    break;
                case -1248811366:
                case -650173813:
                    if (C2520.f8000 >= 0) {
                        iM2566 = C2105.m6981("ᩴۤ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 22733) ^ (-1850541103);
                        i5 = 524787219;
                    } else {
                        iM2566 = C0630.m2566("ۧۡ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-7181)) ^ 1941957157;
                        i5 = 520293772;
                    }
                    break;
                case -1238101462:
                case 1078976491:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = (i3 - C2105.m6981("۫ܰ")) * (-101);
                        i4 = ((iM2566 ^ i2) * 11283) ^ (-1587562702);
                        i5 = -1130636087;
                    } else {
                        iM2566 = C2105.m6981("ᩳ᩻") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-27589)) ^ 1724564829;
                        i5 = 1923336133;
                    }
                    break;
                case -1128667415:
                case -333461950:
                    zShowContextMenuForChild = super.showContextMenuForChild(view, f, f2);
                    if (zShowContextMenuForChild) {
                        iM2566 = C0630.m2566("ۘ֫") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-7777)) ^ (-186676000);
                        i5 = 887212492;
                    } else {
                        iM2566 = C2105.m6981("ܳۗ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-2619)) ^ (-2132261341);
                        i5 = 322919605;
                    }
                    break;
                case -924388265:
                case 1623372840:
                    this.f28865 = true;
                    this.f28852 = false;
                    iM2566 = C2105.m6981("ܳۗ") ^ i3;
                    i4 = ((iM2566 ^ i2) * (-2619)) ^ (-2132261341);
                    i5 = 322919605;
                    break;
                case -867996697:
                case 879548600:
                    if (C7106.f21815 != 0) {
                        iM2566 = (C2105.m6981("ᩳۛ") + i2) * 75;
                        i4 = ((iM2566 ^ i3) * (-453)) ^ (-409635374);
                        i5 = 1166320023;
                    } else {
                        iM2566 = C2105.m6981("ᩳܰ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 25999) ^ 1008468121;
                        i5 = 1896148476;
                    }
                    break;
                case -488114910:
                case 886662784:
                    C3245.m9925();
                    if (C1128.f4106 <= 0) {
                        iM2566 = (C0630.m2566("ۜ᩸") + i2) * (-89);
                        i4 = ((iM2566 ^ i3) * (-32297)) ^ (-308426065);
                        i5 = -1261233421;
                    } else {
                        iM2566 = C0630.m2566("ᩴ֨") ^ i3;
                        i4 = ((iM2566 ^ i2) * 14641) ^ 1511123123;
                        i5 = 1155013170;
                    }
                    break;
                case -457816658:
                case 397435450:
                    if (C0630.f2410 <= 0) {
                        iM2566 = (C2105.m6981("ᩳۛ") + i2) * 75;
                        i4 = ((iM2566 ^ i3) * (-453)) ^ (-409635374);
                        i5 = 1166320023;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ܽۡ")) * 75;
                        i4 = ((iM2566 ^ i2) * 28959) ^ 1579504187;
                        i5 = 352862867;
                    }
                    break;
                case -338133540:
                case 324432142:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = (C0630.m2566("ۜ᩸") + i2) * (-89);
                        i4 = ((iM2566 ^ i3) * (-32297)) ^ (-308426065);
                        i5 = -1261233421;
                    } else {
                        iM2566 = (C2105.m6981("ۛܽ") + i2) * (-11);
                        i4 = ((iM2566 ^ i3) * 18851) ^ 93531881;
                        i5 = -1152277818;
                    }
                    break;
                case 107994126:
                case 2044369331:
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = (C0630.m2566("ۜ᩸") + i2) * (-89);
                        i4 = ((iM2566 ^ i3) * (-32297)) ^ (-308426065);
                        i5 = -1261233421;
                    } else {
                        iM2566 = C0630.m2566("᩺᩵") ^ i2;
                        i4 = ((iM2566 ^ i3) * 10313) ^ 2092427440;
                        i5 = 342832359;
                    }
                    break;
                case 194761430:
                case 1817573689:
                    C1420.m4913();
                    iM2566 = C0630.m2566("ᩴ֨") ^ i3;
                    i4 = ((iM2566 ^ i2) * 14641) ^ 1511123123;
                    i5 = 1155013170;
                    break;
                case 311182830:
                case 623145686:
                    if (C0630.f2410 <= 0) {
                        iM2566 = C2105.m6981("ᩴۤ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 22733) ^ (-1850541103);
                        i5 = 524787219;
                    } else {
                        iM2566 = C2105.m6981("ܽܰ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-26297)) ^ 1557257853;
                        i5 = 461202161;
                    }
                    break;
                case 440798550:
                case 570583907:
                    C3911.m11924();
                    return false;
                case 1265041620:
                case 1769591359:
                    C3911.m11924();
                    if (AbstractC2021.f6743 > 0) {
                        iM2566 = (i3 - C2105.m6981("۫ܰ")) * (-101);
                        i4 = ((iM2566 ^ i2) * 11283) ^ (-1587562702);
                        i5 = -1130636087;
                    } else {
                        iM2566 = (C2105.m6981("ᩳۛ") + i2) * 75;
                        i4 = ((iM2566 ^ i3) * (-453)) ^ (-409635374);
                        i5 = 1166320023;
                    }
                    break;
                default:
                    if (C3245.f10203 <= 0) {
                        iM2566 = (i3 - C2105.m6981("۫ܰ")) * (-101);
                        i4 = ((iM2566 ^ i2) * 11283) ^ (-1587562702);
                        i5 = -1130636087;
                    } else {
                        iM2566 = (C0630.m2566("ۚ۫") ^ i3) * 49;
                        i4 = ((iM2566 ^ i2) * 26375) ^ 1924581105;
                        i5 = 1938445203;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9503(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        int i = 134756822;
        int i2 = C2958.f9394;
        int i3 = C3245.f10203;
        int iM2566 = C0630.m2566("ܺ֨") ^ i3;
        int i4 = ((iM2566 ^ i2) * (-9507)) ^ 1422230643;
        int i5 = -1839619287;
        while (true) {
            i = (iM2566 ^ i5) ^ (i4 & (((i ^ i2) * (-8563)) >> 31));
            switch (i) {
                case -1973131757:
                case -1148304264:
                    C7811.m20844();
                    if (C1294.f4556 < 0) {
                        iM2566 = C0630.m2566("ܰۗ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 31253) ^ (-1494323195);
                        i5 = -55000705;
                    }
                    break;
                case -1340072209:
                case -1133006735:
                    if (C4075.f12947 >= 0) {
                        iM2566 = C2105.m6981("ۗۗ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-20681)) ^ (-1632001456);
                        i5 = 765305297;
                    } else {
                        iM2566 = C0630.m2566("ᩳ֡") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-4263)) ^ 1578682670;
                        i5 = -1668837515;
                        continue;
                    }
                    break;
                case -1090654573:
                case 428052212:
                    return;
                case -857497952:
                case 266609497:
                    ServiceConnectionC3453.m10564();
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = (C0630.m2566("ۜ֡") + i2) * (-123);
                        i4 = ((iM2566 ^ i3) * (-17871)) ^ 976089743;
                        i5 = -1111720865;
                    }
                    break;
                case 32982461:
                case 1204650363:
                    C5695.m16023();
                    C11340.m28031();
                    throw new RuntimeException();
                case 1262989996:
                case 1872846592:
                    C3683.m11222();
                    C1294.m4372();
                    break;
                default:
                    C4075.m12263();
                    if (C11340.f33930 < 0) {
                        iM2566 = (i3 - C2105.m6981("᩻ܳ")) * 47;
                        i4 = ((iM2566 ^ i2) * (-19521)) ^ (-1310025803);
                        i5 = 417890332;
                    }
                    break;
            }
            iM2566 = C0630.m2566("ۚܺ") ^ i2;
            i4 = ((iM2566 ^ i3) * 7303) ^ (-926400033);
            i5 = -187349878;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m24357() {
        return this.f28867;
    }

    @Override // android.widget.ListView, android.widget.AdapterView
    public final void setSelection(int i) {
        int i2 = -600464008;
        int i3 = C22628.f73083;
        int i4 = C3911.f12484;
        int iM2566 = (C0630.m2566("᩺ܽ") + i4) * 43;
        int i5 = ((iM2566 ^ i3) * 13811) ^ (-651726585);
        int i6 = 2108026463;
        while (true) {
            i2 = ((((i2 ^ i3) * 15865) >> 31) & i5) ^ (iM2566 ^ i6);
            switch (i2) {
                case -2097519943:
                case -1664282700:
                    if (C1047.f3863 >= 0) {
                        iM2566 = (C0630.m2566("ᩴۗ") ^ i4) * 65;
                        i5 = ((iM2566 ^ i3) * (-14859)) ^ 1181353310;
                        i6 = -1463531608;
                    } else {
                        iM2566 = (C2105.m6981("ۛۘ") + i3) * 75;
                        i5 = ((iM2566 ^ i4) * (-2419)) ^ 1298702360;
                        i6 = 1912884897;
                    }
                    break;
                case -1980783348:
                case -653969197:
                    if (C0630.f2410 <= 0) {
                        iM2566 = (C0630.m2566("ᩴۗ") ^ i4) * 65;
                        i5 = ((iM2566 ^ i3) * (-14859)) ^ 1181353310;
                        i6 = -1463531608;
                    } else {
                        iM2566 = C0630.m2566("ᩴۖ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-13385)) ^ (-652813665);
                        i6 = -166297449;
                    }
                    break;
                case -1256745897:
                case 1057414977:
                    if (C0714.f2697 >= 0) {
                        iM2566 = (C0630.m2566("ᩴۗ") ^ i4) * 65;
                        i5 = ((iM2566 ^ i3) * (-14859)) ^ 1181353310;
                        i6 = -1463531608;
                    } else {
                        iM2566 = (C0630.m2566("ۛ۫") ^ i4) * (-83);
                        i5 = ((iM2566 ^ i3) * (-14673)) ^ 1043796403;
                        i6 = -1494304008;
                    }
                    break;
                case -1149437264:
                case 1516465677:
                    if (C1420.f5096 <= 0) {
                        iM2566 = (C2105.m6981("᩶ܶ") ^ i3) * (-67);
                        i5 = ((iM2566 ^ i4) * 1745) ^ (-81172252);
                        i6 = -723506863;
                    } else {
                        iM2566 = (C0630.m2566("ۧܿ") ^ i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM2566 ^ i3) * (-31955)) ^ (-2144211277);
                        i6 = -59652936;
                    }
                    break;
                case -1144584607:
                case 1176969000:
                    if (C21923.m49329()) {
                        iM2566 = C0630.m2566("֫֡") ^ i3;
                        i5 = ((iM2566 ^ i4) * 31307) ^ 1990917220;
                        i6 = 1417469219;
                    } else {
                        iM2566 = C0630.m2566("֨֡") ^ i4;
                        i5 = ((iM2566 ^ i3) * 15075) ^ 1810117266;
                        i6 = 1863071712;
                    }
                    break;
                case -1127591975:
                case 103029490:
                    if (C1420.f5096 <= 0) {
                        iM2566 = (C0630.m2566("ᩴۗ") ^ i4) * 65;
                        i5 = ((iM2566 ^ i3) * (-14859)) ^ 1181353310;
                        i6 = -1463531608;
                    } else {
                        iM2566 = (i4 - C2105.m6981("ܿ᩷")) * (-117);
                        i5 = ((iM2566 ^ i3) * (-17293)) ^ (-593154871);
                        i6 = 549532754;
                    }
                    break;
                case -1007240042:
                case 674358853:
                    if (C3683.f11629 >= 0) {
                        iM2566 = (i4 - C0630.m2566("ܺۡ")) * 59;
                        i5 = ((iM2566 ^ i3) * 18123) ^ 1156383954;
                        i6 = -960108157;
                    } else {
                        iM2566 = (C0630.m2566("ۧܰ") + i3) * 9;
                        i5 = ((iM2566 ^ i4) * 5397) ^ 249075142;
                        i6 = -483975522;
                    }
                    break;
                case -830085280:
                case -575636227:
                    if (C3245.f10203 <= 0) {
                        iM2566 = (C0630.m2566("ᩴۗ") ^ i4) * 65;
                        i5 = ((iM2566 ^ i3) * (-14859)) ^ 1181353310;
                        i6 = -1463531608;
                    } else {
                        iM2566 = (C0630.m2566("᩻ܶ") + i3) * (-127);
                        i5 = ((iM2566 ^ i4) * 13809) ^ 946981251;
                        i6 = 1099635587;
                    }
                    break;
                case -643867879:
                case 908271070:
                    if (C1005.f3721) {
                        iM2566 = (C2105.m6981("᩶ܶ") ^ i3) * (-67);
                        i5 = ((iM2566 ^ i4) * 1745) ^ (-81172252);
                        i6 = -723506863;
                    } else {
                        iM2566 = (C0630.m2566("ܳۙ") ^ i4) * 67;
                        i5 = ((iM2566 ^ i3) * (-867)) ^ 1363828338;
                        i6 = 1163430551;
                    }
                    break;
                case -253663719:
                case 987593272:
                    C0422.m1963();
                    C1711.m5736();
                    break;
                case -149485371:
                case 55564413:
                    if (C2126.f7087) {
                        iM2566 = (C2105.m6981("᩶ܶ") ^ i3) * (-67);
                        i5 = ((iM2566 ^ i4) * 1745) ^ (-81172252);
                        i6 = -723506863;
                    } else {
                        iM2566 = (C0630.m2566("ۨᩳ") ^ i4) * (-15);
                        i5 = ((iM2566 ^ i3) * (-8627)) ^ (-1216636394);
                        i6 = 1640679860;
                    }
                    break;
                case 256870162:
                case 1637838486:
                    C1504.m5179();
                    iM2566 = (i4 - C0630.m2566("ܺۡ")) * 59;
                    i5 = ((iM2566 ^ i3) * 18123) ^ 1156383954;
                    i6 = -960108157;
                    break;
                case 422687214:
                case 683921006:
                    if (C3019.f9544 < 0) {
                        iM2566 = (C2105.m6981("᩶ܶ") ^ i3) * (-67);
                        i5 = ((iM2566 ^ i4) * 1745) ^ (-81172252);
                        i6 = -723506863;
                    } else {
                        iM2566 = (i4 - C0630.m2566("ܺۡ")) * 59;
                        i5 = ((iM2566 ^ i3) * 18123) ^ 1156383954;
                        i6 = -960108157;
                    }
                    break;
                case 850380358:
                case 1346406400:
                    if (C2105.f7037 != 0) {
                        iM2566 = C0630.m2566("֫֡") ^ i3;
                        i5 = ((iM2566 ^ i4) * 31307) ^ 1990917220;
                        i6 = 1417469219;
                    } else {
                        iM2566 = (i4 - C0630.m2566("ܺۡ")) * 59;
                        i5 = ((iM2566 ^ i3) * 18123) ^ 1156383954;
                        i6 = -960108157;
                    }
                    break;
                case 1062676324:
                case 1198654392:
                    this.f28861 = false;
                    break;
                default:
                    super.setSelection(i);
                    if (C3911.f12484 >= 0) {
                        iM2566 = (C0630.m2566("ᩴۗ") ^ i4) * 65;
                        i5 = ((iM2566 ^ i3) * (-14859)) ^ 1181353310;
                        i6 = -1463531608;
                    } else {
                        iM2566 = (C2105.m6981("ۛ᩸") + i3) * (-95);
                        i5 = ((iM2566 ^ i4) * (-6959)) ^ (-788023335);
                        i6 = 1192608344;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m24353(C9503 c9503) {
        long j = 0;
        boolean z = false;
        long j2 = 0;
        int i = -1220378456;
        int i2 = RunnableC3474.f10992;
        int i3 = C4117.f13076;
        int iM2566 = C0630.m2566("ۗۧ") ^ i2;
        int i4 = ((iM2566 ^ i3) * 3105) ^ (-268484259);
        int i5 = -1265703610;
        while (true) {
            i = ((((i ^ i3) * 21101) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -1867854647:
                case 62780701:
                    z = true;
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = C0630.m2566("ܺ᩸") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-10691)) ^ (-812218391);
                        i5 = -789710536;
                    } else {
                        iM2566 = C0630.m2566("᩺᩶") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-11057)) ^ 786008705;
                        i5 = 1051639007;
                    }
                    break;
                case -1770869792:
                case 942171919:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = (i2 - C2105.m6981("᩵ۛ")) * (-65);
                        i4 = ((iM2566 ^ i3) * (-12179)) ^ 1524169609;
                        i5 = -493119881;
                    } else {
                        iM2566 = C0630.m2566("ۧ᩵") ^ i3;
                        i4 = ((iM2566 ^ i2) * 25957) ^ 1091323808;
                        i5 = -966547968;
                    }
                    break;
                case -1710936441:
                case -934791900:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = C0630.m2566("ܺ᩸") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-10691)) ^ (-812218391);
                        i5 = -789710536;
                    } else {
                        iM2566 = (i2 - C0630.m2566("ᩳ᩹")) * (-91);
                        i4 = ((iM2566 ^ i3) * 20551) ^ (-1595226221);
                        i5 = 1407900059;
                    }
                    break;
                case -1616056063:
                case -962046482:
                    C0237.m1481();
                    return false;
                case -1571954083:
                case -16818552:
                    C21923.m49329();
                    if (C0714.f2697 < 0) {
                        iM2566 = (C2105.m6981("۫᩵") + i3) * (-47);
                        i4 = ((iM2566 ^ i2) * 23163) ^ 1199042295;
                        i5 = 508597281;
                    } else {
                        iM2566 = (i2 - C2105.m6981("᩵ۛ")) * (-65);
                        i4 = ((iM2566 ^ i3) * (-12179)) ^ 1524169609;
                        i5 = -493119881;
                    }
                    break;
                case -1396584593:
                case -87192647:
                    if (C11340.m28031()) {
                        iM2566 = C2105.m6981("ۗۨ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 22121) ^ 332957300;
                        i5 = -1328308512;
                    } else {
                        iM2566 = (i2 - C2105.m6981("᩵ۛ")) * (-65);
                        i4 = ((iM2566 ^ i3) * (-12179)) ^ 1524169609;
                        i5 = -493119881;
                    }
                    break;
                case -1324888341:
                case 932840870:
                    if (!C0798.f2919) {
                        iM2566 = (C2105.m6981("۫᩵") + i3) * (-47);
                        i4 = ((iM2566 ^ i2) * 23163) ^ 1199042295;
                        i5 = 508597281;
                    } else {
                        iM2566 = (C0630.m2566("ۜۚ") ^ i3) * (-37);
                        i4 = ((iM2566 ^ i2) * 19495) ^ 1399171255;
                        i5 = -1144616309;
                    }
                    break;
                case -818941656:
                case -774455875:
                    ViewOnClickListenerC1958.m6429();
                    if (C1420.f5096 > 0) {
                        iM2566 = (C2105.m6981("۫᩵") + i3) * (-47);
                        i4 = ((iM2566 ^ i2) * 23163) ^ 1199042295;
                        i5 = 508597281;
                    } else {
                        iM2566 = (C0630.m2566("ۘ۠") ^ i2) * 97;
                        i4 = ((iM2566 ^ i3) * (-26857)) ^ (-135204901);
                        i5 = -1140885800;
                    }
                    break;
                case -715384785:
                case 1747654898:
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = C0630.m2566("ܺ᩸") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-10691)) ^ (-812218391);
                        i5 = -789710536;
                    } else {
                        iM2566 = (i3 - C2105.m6981("֡ۗ")) * (-55);
                        i4 = ((iM2566 ^ i2) * (-17249)) ^ (-378895889);
                        i5 = -1835102531;
                    }
                    break;
                case -714804709:
                case -56183172:
                    j = c9503.f28868;
                    if (C21923.f70183 != 0) {
                        iM2566 = (i2 - C2105.m6981("᩵ۛ")) * (-65);
                        i4 = ((iM2566 ^ i3) * (-12179)) ^ 1524169609;
                        i5 = -493119881;
                    } else {
                        iM2566 = (i2 - C0630.m2566("ܽۙ")) * (-111);
                        i4 = ((iM2566 ^ i3) * (-22369)) ^ (-49255220);
                        i5 = 659872366;
                    }
                    break;
                case -659702218:
                case 133482691:
                    if (C2520.f8000 >= 0) {
                        iM2566 = (C0630.m2566("ۜۚ") ^ i3) * (-37);
                        i4 = ((iM2566 ^ i2) * 19495) ^ 1399171255;
                        i5 = -1144616309;
                    } else {
                        iM2566 = C0630.m2566("᩻۫") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-27179)) ^ (-1622231040);
                        i5 = -778228594;
                    }
                    break;
                case -434446666:
                case 2055591217:
                    if (RunnableC1108.f4040) {
                        iM2566 = C2105.m6981("ۛ۟") ^ i3;
                        i4 = ((iM2566 ^ i2) * 11977) ^ 1903980715;
                        i5 = -1905983499;
                    } else {
                        iM2566 = C0630.m2566("ܺ᩸") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-10691)) ^ (-812218391);
                        i5 = -789710536;
                    }
                    break;
                case -366394434:
                case 475852265:
                    return z;
                case -167185241:
                case 1317390768:
                    return false;
                case 243332160:
                case 1102848947:
                    C1128.m3851();
                    C0714.m2805();
                    iM2566 = (i2 - C2105.m6981("᩵ۛ")) * (-65);
                    i4 = ((iM2566 ^ i3) * (-12179)) ^ 1524169609;
                    i5 = -493119881;
                    break;
                case 1032769315:
                case 1205208329:
                    if (C3019.m9262() > j) {
                        iM2566 = C2105.m6981("᩸ۡ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-29171)) ^ 1775105317;
                        i5 = 364113127;
                    } else {
                        iM2566 = C0630.m2566("᩹ۗ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 11473) ^ 747718563;
                        i5 = -1597876866;
                    }
                    break;
                case 1106674689:
                case 1952061987:
                    c9503.f28868 = j2;
                    return z;
                case 1598504526:
                case 2136276837:
                    j2 = 0;
                    if (j == 0) {
                        iM2566 = C0630.m2566("ۖ۟") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-14091)) ^ 141667784;
                        i5 = -1950133030;
                    } else {
                        iM2566 = C0630.m2566("᩷ܺ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 10585) ^ 569646571;
                        i5 = 287089677;
                    }
                    break;
                case 1633622104:
                case 2058962807:
                    if (C2958.f9394 >= 0) {
                        iM2566 = (C2105.m6981("۫᩵") + i3) * (-47);
                        i4 = ((iM2566 ^ i2) * 23163) ^ 1199042295;
                        i5 = 508597281;
                    } else {
                        iM2566 = (C2105.m6981("֡ᩳ") + i3) * (-123);
                        i4 = ((iM2566 ^ i2) * 32507) ^ (-941068513);
                        i5 = 1961509490;
                    }
                    break;
                default:
                    if (C7106.f21815 != 0) {
                        iM2566 = (C2105.m6981("۫᩵") + i3) * (-47);
                        i4 = ((iM2566 ^ i2) * 23163) ^ 1199042295;
                        i5 = 508597281;
                    } else {
                        iM2566 = C2105.m6981("ۚۗ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-15659)) ^ (-102148322);
                        i5 = -1263137089;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9503(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        long j = 0;
        boolean z = false;
        C23613 c23613 = null;
        boolean z2 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = 878599085;
        int i3 = ViewOnClickListenerC1958.f6529;
        int i4 = C0714.f2697;
        int iM2566 = C0630.m2566("֡᩶") ^ i4;
        int i5 = ((iM2566 ^ i3) * 28399) ^ (-1081499500);
        int i6 = -1616220422;
        while (true) {
            i2 = (iM2566 ^ i6) ^ (i5 & (((i2 ^ i3) * (-27731)) >> 31));
            switch (i2) {
                case -2122969624:
                case -1469565830:
                    C11340.m28031();
                    if (C1047.f3863 >= 0) {
                        iM2566 = (C2105.m6981("ۧۖ") + i4) * (-45);
                        i5 = ((iM2566 ^ i3) * (-2891)) ^ (-827985408);
                        i6 = 1473004942;
                    } else {
                        iM2566 = C2105.m6981("֫ۧ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-18457)) ^ 1854127833;
                        i6 = -38355983;
                    }
                    break;
                case -2039720514:
                case 894500113:
                    this.f28868 = j;
                    c23613 = new C23613(this);
                    if (C3663.m11168() >= 0) {
                        iM2566 = C0630.m2566("ۜ᩶") ^ i4;
                        i5 = ((iM2566 ^ i3) * 6565) ^ 1480229734;
                        i6 = 1445033003;
                    } else {
                        iM2566 = (C0630.m2566("֨۠") ^ i4) * 13;
                        i5 = ((iM2566 ^ i3) * 7671) ^ 316656336;
                        i6 = 394180848;
                    }
                    break;
                case -1880497735:
                case -1449809574:
                    C1773.m5908();
                    C2126.m7040();
                    throw new RuntimeException();
                case -1683556137:
                case -1077447223:
                    super.setFastScrollEnabled(z);
                    if (isInEditMode()) {
                        iM2566 = C2105.m6981("ܶۙ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-16813)) ^ (-410026299);
                        i6 = -907554004;
                    } else {
                        iM2566 = C2105.m6981("۫ۙ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-8177)) ^ 1394647132;
                        i6 = 326379209;
                    }
                    break;
                case -1674273012:
                case 1164052756:
                    this.f28856 = -579373193;
                    if (C0050.f910 >= 0) {
                        iM2566 = C0630.m2566("ܶ᩷") ^ i3;
                        i5 = ((iM2566 ^ i4) * 7715) ^ (-1512807821);
                        i6 = -62166452;
                    } else {
                        iM2566 = C2105.m6981("ܶ۫") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-14811)) ^ (-322825729);
                        i6 = 771011893;
                    }
                    break;
                case -1657020006:
                case -235531494:
                    setSelector(new C20792(this));
                    iM2566 = C2105.m6981("ܶۙ") ^ i4;
                    i5 = ((iM2566 ^ i3) * (-16813)) ^ (-410026299);
                    i6 = -907554004;
                    break;
                case -1548007075:
                case 1255827225:
                    this.f28872 = 964130679;
                    f2 = 8.0f;
                    if (C3245.m9925() != 0) {
                        iM2566 = C0630.m2566("ܶ᩷") ^ i3;
                        i5 = ((iM2566 ^ i4) * 7715) ^ (-1512807821);
                        i6 = -62166452;
                    } else {
                        iM2566 = C0630.m2566("ܳ֨") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-5489)) ^ 1713658242;
                        i6 = -1709868189;
                    }
                    break;
                case -1405231862:
                case 374647173:
                    C4075.m12263();
                    iM2566 = C2105.m6981("֫ۧ") ^ i3;
                    i5 = ((iM2566 ^ i4) * (-18457)) ^ 1854127833;
                    i6 = -38355983;
                    break;
                case -1202435405:
                case 1619400217:
                    C3537.m10746();
                    if (RunnableC0588.f2309 < 0) {
                        iM2566 = C0630.m2566("ۜ᩶") ^ i4;
                        i5 = ((iM2566 ^ i3) * 6565) ^ 1480229734;
                        i6 = 1445033003;
                    } else {
                        iM2566 = C2105.m6981("֫ۧ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-18457)) ^ 1854127833;
                        i6 = -38355983;
                    }
                    break;
                case -1159238824:
                case 488759709:
                    this.f28851 = f3;
                    this.f28854 = ViewConfiguration.get(context).getScaledTouchSlop();
                    return;
                case -942242396:
                case 1249166288:
                    this.f28866 = z2;
                    iM2566 = (C0630.m2566("᩻ۨ") ^ i3) * 57;
                    i5 = ((iM2566 ^ i4) * (-2053)) ^ (-1225114253);
                    i6 = 551904893;
                    break;
                case -835306623:
                case 447121522:
                    this.f28858 = f * f2;
                    f3 = f * 48.0f;
                    if (C2520.f8000 >= 0) {
                        iM2566 = (C2105.m6981("ۧۖ") + i4) * (-45);
                        i5 = ((iM2566 ^ i3) * (-2891)) ^ (-827985408);
                        i6 = 1473004942;
                    } else {
                        iM2566 = (i4 - C0630.m2566("ܶܿ")) * 23;
                        i5 = ((iM2566 ^ i3) * (-15103)) ^ (-1361799810);
                        i6 = -735609583;
                    }
                    break;
                case -663846612:
                case -605421126:
                    if (C3683.f11629 >= 0) {
                        iM2566 = C0630.m2566("ܶ᩷") ^ i3;
                        i5 = ((iM2566 ^ i4) * 7715) ^ (-1512807821);
                        i6 = -62166452;
                    } else {
                        iM2566 = (C2105.m6981("ۧۖ") + i4) * (-45);
                        i5 = ((iM2566 ^ i3) * (-2891)) ^ (-827985408);
                        i6 = 1473004942;
                    }
                    break;
                case -621735497:
                case 1550903121:
                    this.f28864 = new HandlerC6680(this);
                    if (C0483.f2088 >= 0) {
                        iM2566 = (C2105.m6981("ۧۖ") + i4) * (-45);
                        i5 = ((iM2566 ^ i3) * (-2891)) ^ (-827985408);
                        i6 = 1473004942;
                    } else {
                        iM2566 = C2105.m6981("֨ܰ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 17649) ^ 1821867488;
                        i6 = -247336793;
                    }
                    break;
                case -332077893:
                case 762643729:
                    this.f28871 = c23613;
                    z2 = true;
                    z2 = true;
                    if (C3683.f11629 >= 0) {
                        iM2566 = (i3 - C2105.m6981("ۛۢ")) * (-39);
                        i5 = ((iM2566 ^ i4) * (-989)) ^ (-932696019);
                        i6 = -1763237149;
                    } else {
                        iM2566 = (C2105.m6981("ᩳᩳ") + i4) * (-81);
                        i5 = ((iM2566 ^ i3) * (-5349)) ^ (-1933910699);
                        i6 = 520552163;
                    }
                    break;
                case -21905588:
                case 1183743764:
                    super.setOnScrollListener(new C14440(this));
                    if (super.isFastScrollEnabled()) {
                        iM2566 = C0630.m2566("ۚۜ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 5439) ^ 693910252;
                        i6 = -1812596015;
                    } else {
                        iM2566 = (C0630.m2566("᩻ۨ") ^ i3) * 57;
                        i5 = ((iM2566 ^ i4) * (-2053)) ^ (-1225114253);
                        i6 = 551904893;
                    }
                    break;
                case 300268562:
                case 674943159:
                    j = 0;
                    this.f28869 = 0L;
                    if (C2105.f7037 != 0) {
                        iM2566 = C0630.m2566("ۜ᩶") ^ i4;
                        i5 = ((iM2566 ^ i3) * 6565) ^ 1480229734;
                        i6 = 1445033003;
                    } else {
                        this.f28846 = new C14792(3);
                        if (C3432.f10845 >= 0) {
                            iM2566 = C2105.m6981("֫ۧ") ^ i3;
                            i5 = ((iM2566 ^ i4) * (-18457)) ^ 1854127833;
                            i6 = -38355983;
                        } else {
                            iM2566 = (C2105.m6981("ۗۨ") + i3) * 33;
                            i5 = ((iM2566 ^ i4) * (-32145)) ^ 1751929885;
                            i6 = 38106527;
                        }
                    }
                    break;
                case 991117539:
                case 1272498164:
                    setDefaultFocusHighlightEnabled(z);
                    iM2566 = (C2105.m6981("ܰᩳ") + i3) * 13;
                    i5 = ((iM2566 ^ i4) * 2345) ^ 1859689439;
                    i6 = 55935014;
                    break;
                case 1113983312:
                case 2131647538:
                    z = false;
                    this.f28861 = false;
                    if (C1294.m4372() <= 0) {
                        iM2566 = (i3 - C2105.m6981("ۛۢ")) * (-39);
                        i5 = ((iM2566 ^ i4) * (-989)) ^ (-932696019);
                        i6 = -1763237149;
                    } else {
                        iM2566 = C2105.m6981("ܺۧ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 9933) ^ 1321994740;
                        i6 = -766568604;
                    }
                    break;
                case 1115331644:
                case 1202204498:
                    f = context.getResources().getDisplayMetrics().density;
                    if (C4117.f13076 <= 0) {
                        iM2566 = (C2105.m6981("ۧۖ") + i4) * (-45);
                        i5 = ((iM2566 ^ i3) * (-2891)) ^ (-827985408);
                        i6 = 1473004942;
                    } else {
                        iM2566 = C2105.m6981("ۖ᩸") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-9511)) ^ (-927741168);
                        i6 = -937962151;
                    }
                    break;
                default:
                    this.f28863 = z2 ? 1 : 0;
                    setHorizontalScrollBarEnabled(z);
                    setVerticalScrollBarEnabled(z);
                    if (Build.VERSION.SDK_INT >= 26) {
                        iM2566 = C0630.m2566("ܿ᩷") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-11591)) ^ 319062581;
                        i6 = -1252220442;
                    } else {
                        iM2566 = (C2105.m6981("ܰᩳ") + i3) * 13;
                        i5 = ((iM2566 ^ i4) * 2345) ^ 1859689439;
                        i6 = 55935014;
                    }
                    break;
            }
        }
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.ViewParent
    public final boolean showContextMenuForChild(View view) {
        boolean zShowContextMenuForChild = false;
        int i = 1759469738;
        int i2 = C3432.f10845;
        int i3 = C1420.f5096;
        int iM6981 = (C2105.m6981("֨ᩴ") ^ i3) * (-77);
        int i4 = ((iM6981 ^ i2) * (-29427)) ^ (-715168861);
        int i5 = 2136874858;
        while (true) {
            i = ((((i ^ i2) * 19193) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2059008468:
                case -1346455333:
                    this.f28852 = false;
                    iM6981 = (i3 - C0630.m2566("᩸᩺")) * (-67);
                    i4 = ((iM6981 ^ i2) * (-11409)) ^ (-1985907179);
                    i5 = 634559643;
                    break;
                case -2007156115:
                case -1344113184:
                    C1294.m4372();
                    if (C0050.m940() <= 0) {
                        iM6981 = C0630.m2566("ۧ᩸") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-1285)) ^ 1793739011;
                        i5 = 2901909;
                    } else {
                        iM6981 = C2105.m6981("ܿܽ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-27789)) ^ 1534387482;
                        i5 = 997213282;
                    }
                    break;
                case -1907084115:
                case -423032779:
                    if (C3432.m10477() <= 0) {
                        iM6981 = C2105.m6981("ܿܽ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-27789)) ^ 1534387482;
                        i5 = 997213282;
                    } else {
                        iM6981 = C2105.m6981("ۧۖ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-12097)) ^ (-393074714);
                        i5 = -126017430;
                    }
                    break;
                case -1905985388:
                case -420238712:
                    C2105.m6982();
                    C1420.m4913();
                    iM6981 = C2105.m6981("ۚᩴ") ^ i3;
                    i4 = ((iM6981 ^ i2) * 5103) ^ 1514448616;
                    i5 = -398494754;
                    break;
                case -1814784372:
                case 798003971:
                    if (C11340.f33930 >= 0) {
                        iM6981 = C2105.m6981("ܿܽ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-27789)) ^ 1534387482;
                        i5 = 997213282;
                    } else {
                        iM6981 = C0630.m2566("ܶ᩶") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-12683)) ^ (-2129962709);
                        i5 = -1795078484;
                    }
                    break;
                case -1737128262:
                case 1729407313:
                    return zShowContextMenuForChild;
                case -1409988976:
                case 174801730:
                    C0630.m2564();
                    RunnableC0588.m2441();
                    return false;
                case -1313111605:
                case -1238132370:
                    if (C3746.f11829 <= 0) {
                        iM6981 = C0630.m2566("ۧ᩸") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-1285)) ^ 1793739011;
                        i5 = 2901909;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ܿܰ")) * 29;
                        i4 = ((iM6981 ^ i2) * 11107) ^ (-380349032);
                        i5 = -1116164230;
                    }
                    break;
                case -1309410493:
                case 1878744049:
                    if (C0714.m2805()) {
                        iM6981 = (C2105.m6981("ܺܶ") + i3) * 3;
                        i4 = ((iM6981 ^ i2) * 29371) ^ (-606317369);
                        i5 = 1488445180;
                    } else {
                        iM6981 = C0630.m2566("ۧ᩸") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-1285)) ^ 1793739011;
                        i5 = 2901909;
                    }
                    break;
                case -1254560564:
                case 178351920:
                    if (C4075.m12263() > 0) {
                        iM6981 = C0630.m2566("ۚۨ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 31217) ^ 1039610439;
                        i5 = -1386949613;
                    } else {
                        iM6981 = C2105.m6981("ܿܽ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-27789)) ^ 1534387482;
                        i5 = 997213282;
                    }
                    break;
                case -1145624783:
                case 766798106:
                    if (C3245.f10203 <= 0) {
                        iM6981 = C2105.m6981("ۚᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 5103) ^ 1514448616;
                        i5 = -398494754;
                    } else {
                        iM6981 = C0630.m2566("ۢܳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-21799)) ^ 1368237207;
                        i5 = -621814712;
                    }
                    break;
                case -1102590150:
                case 100856675:
                    this.f28865 = true;
                    if (C2272.m7503()) {
                        iM6981 = (i3 - C2105.m6981("ۖ᩺")) * (-41);
                        i4 = ((iM6981 ^ i2) * (-587)) ^ (-177640619);
                        i5 = -1393280707;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ܺ᩹")) * 119;
                        i4 = ((iM6981 ^ i2) * 16639) ^ (-1580592670);
                        i5 = 126985967;
                    }
                    break;
                case -1043354065:
                case 822667534:
                    zShowContextMenuForChild = super.showContextMenuForChild(view);
                    if (zShowContextMenuForChild) {
                        iM6981 = (i2 - C2105.m6981("᩻֡")) * 47;
                        i4 = ((iM6981 ^ i3) * 26589) ^ 1068819483;
                        i5 = -2140982652;
                    } else {
                        iM6981 = (i3 - C0630.m2566("᩸᩺")) * (-67);
                        i4 = ((iM6981 ^ i2) * (-11409)) ^ (-1985907179);
                        i5 = 634559643;
                    }
                    break;
                case -691312840:
                case 141910527:
                    if (C2272.f7362) {
                        iM6981 = C0630.m2566("ۧ᩸") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-1285)) ^ 1793739011;
                        i5 = 2901909;
                    } else {
                        iM6981 = (C0630.m2566("᩷ᩳ") + i2) * (-97);
                        i4 = ((iM6981 ^ i3) * (-31905)) ^ (-1583396931);
                        i5 = -734327534;
                    }
                    break;
                case -479828766:
                case 1923927905:
                    if (C4616.f14690 <= 0) {
                        iM6981 = C0630.m2566("ۚۨ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 31217) ^ 1039610439;
                        i5 = -1386949613;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ᩴۨ")) * (-77);
                        i4 = ((iM6981 ^ i3) * (-19253)) ^ 412961536;
                        i5 = 1863342185;
                    }
                    break;
                case -291580727:
                case 1403000412:
                    C3019.m9255();
                    if (ServiceConnectionC3453.f10921 < 0) {
                        iM6981 = C2105.m6981("ܿܽ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-27789)) ^ 1534387482;
                        i5 = 997213282;
                    } else {
                        iM6981 = C2105.m6981("ۚᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 5103) ^ 1514448616;
                        i5 = -398494754;
                    }
                    break;
                case 278409837:
                case 976836776:
                    if (C0382.f1805) {
                        iM6981 = (i2 - C2105.m6981("ۘᩴ")) * 21;
                        i4 = ((iM6981 ^ i3) * 5977) ^ (-1296906921);
                        i5 = 107489804;
                    } else {
                        iM6981 = C2105.m6981("ۚᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 5103) ^ 1514448616;
                        i5 = -398494754;
                    }
                    break;
                default:
                    if (C3019.f9544 >= 0) {
                        iM6981 = C2105.m6981("ܿܽ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-27789)) ^ 1534387482;
                        i5 = 997213282;
                    } else {
                        iM6981 = C2105.m6981("ۛۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-19759)) ^ 994574464;
                        i5 = 1960521322;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00fe A[PHI: r5
      0x00fe: PHI (r5v65 float) = (r5v58 float), (r5v2 float), (r5v2 float), (r5v2 float), (r5v2 float), (r5v2 float) binds: [B:38:0x00fc, B:27:0x00b9, B:25:0x00b6, B:13:0x006f, B:152:0x00fe, B:151:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x0190 A[PHI: r13 r14
      0x0190: PHI (r13v4 float) = (r13v3 float), (r13v2 float), (r13v2 float), (r13v2 float) binds: [B:50:0x018e, B:34:0x00d8, B:25:0x00b6, B:150:0x0190] A[DONT_GENERATE, DONT_INLINE]
      0x0190: PHI (r14v4 int) = (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:50:0x018e, B:34:0x00d8, B:25:0x00b6, B:150:0x0190] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x020c A[PHI: r9 r11 r12
      0x020c: PHI (r9v4 float) = (r9v3 float), (r9v2 float) binds: [B:62:0x020a, B:54:0x01c8] A[DONT_GENERATE, DONT_INLINE]
      0x020c: PHI (r11v3 float) = (r11v2 float), (r11v4 float) binds: [B:62:0x020a, B:54:0x01c8] A[DONT_GENERATE, DONT_INLINE]
      0x020c: PHI (r12v3 float) = (r12v2 float), (r12v4 float) binds: [B:62:0x020a, B:54:0x01c8] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.AbsListView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        int i;
        int iM6981;
        int i2;
        int i3;
        float f2;
        int iM2566;
        int i4;
        int i5;
        int iM2567;
        int i6;
        int i7 = C0630.f2410;
        int i8 = C7811.f24123;
        int iM2568 = (C0630.m2566("ۢܽ") ^ i7) * 93;
        int i9 = ((iM2568 ^ i8) * 27265) ^ (-103852317);
        C14792 c14792 = null;
        C13064 c13064 = null;
        int i10 = iM2568 ^ (-525935926);
        boolean z = false;
        float f3 = 0.0f;
        boolean z2 = false;
        float x = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float y = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        int i11 = 0;
        float y2 = 0.0f;
        int i12 = -714488875;
        int actionMasked = 0;
        while (true) {
            i12 = i10 ^ (i9 & (((i12 ^ i8) * (-25997)) >> 31));
            switch (i12) {
                case -1926423156:
                case 1247947278:
                    return super.onInterceptTouchEvent(motionEvent);
                case -1868373357:
                case -677345715:
                    c13064.m31648(z ? 1 : 0, this.f28859);
                    iM2567 = C0630.m2566("᩶ۛ") ^ i8;
                    i4 = ((iM2567 ^ i7) * 4953) ^ (-946940346);
                    i6 = 1536263507;
                    i10 = iM2567 ^ i6;
                    i9 = i4;
                    break;
                case -1828071418:
                case 364425260:
                    float f9 = f3;
                    actionMasked = motionEvent.getActionMasked();
                    c14792 = this.f28846;
                    if (actionMasked != 0) {
                        iM2566 = C2105.m6981("ܿۨ") ^ i7;
                        i4 = ((iM2566 ^ i8) * 6015) ^ 1528427642;
                        i5 = -1387227131;
                    } else {
                        iM2566 = (C0630.m2566("۫ۖ") + i8) * (-69);
                        i4 = ((iM2566 ^ i7) * (-24509)) ^ 1996974101;
                        i5 = 1989115168;
                    }
                    int i13 = iM2566 ^ i5;
                    f3 = f9;
                    i10 = i13;
                    i9 = i4;
                    break;
                case -1826636178:
                case 312741251:
                    f = f3;
                    i = actionMasked;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = C2105.m6981("᩷ܰ") ^ i7;
                        i2 = ((iM6981 ^ i8) * 28061) ^ (-114140534);
                        i3 = 1931442493;
                    } else {
                        iM6981 = (C2105.m6981("ۡۙ") + i7) * 69;
                        i2 = ((iM6981 ^ i8) * 30461) ^ 1570851932;
                        i3 = -301201423;
                    }
                    int i14 = iM6981 ^ i3;
                    actionMasked = i;
                    f2 = f;
                    i10 = i14;
                    i9 = i2;
                    f3 = f2;
                    break;
                case -1807795146:
                case -1612195929:
                    f = f3;
                    i = actionMasked;
                    z = true;
                    z = true;
                    if (this.f28867) {
                        iM6981 = (C2105.m6981("᩻ܰ") ^ i7) * 61;
                        i2 = ((iM6981 ^ i8) * 467) ^ 38431505;
                        i3 = -906686771;
                    } else {
                        iM6981 = (C2105.m6981("ۘۛ") + i8) * 63;
                        i2 = ((iM6981 ^ i7) * 14469) ^ (-609368872);
                        i3 = 1700294858;
                    }
                    int i15 = iM6981 ^ i3;
                    actionMasked = i;
                    f2 = f;
                    i10 = i15;
                    i9 = i2;
                    f3 = f2;
                    break;
                case -1749583524:
                case -845065841:
                    C5695.m16023();
                    return false;
                case -1731611036:
                case -703812443:
                    f = f3;
                    i = actionMasked;
                    if (c14792.m35178(this.f28850, this.f28848)) {
                        iM6981 = (C2105.m6981("ۡܽ") + i7) * (-51);
                        i2 = ((iM6981 ^ i8) * 9885) ^ 570061102;
                        i3 = -397710175;
                    } else {
                        iM6981 = C0630.m2566("ܳۡ") ^ i8;
                        i2 = ((iM6981 ^ i7) * 11149) ^ 1021023853;
                        i3 = 1422994908;
                    }
                    int i16 = iM6981 ^ i3;
                    actionMasked = i;
                    f2 = f;
                    i10 = i16;
                    i9 = i2;
                    f3 = f2;
                    break;
                case -1669448661:
                case 1302268774:
                    f6 = y - this.f28848;
                    f7 = f5 * f5;
                    if (C0798.f2919) {
                        iM2567 = (C2105.m6981("᩶᩺") ^ i8) * 101;
                        i4 = ((iM2567 ^ i7) * (-15311)) ^ (-2025279083);
                        i6 = 388951859;
                    } else {
                        iM2567 = (i8 - C2105.m6981("᩸ۢ")) * 75;
                        i4 = ((iM2567 ^ i7) * 24669) ^ (-1239048713);
                        i6 = -189581825;
                    }
                    i10 = iM2567 ^ i6;
                    i9 = i4;
                    break;
                case -1391693381:
                case -450818411:
                    f = f3;
                    i = actionMasked;
                    this.f28852 = z;
                    iM6981 = (C2105.m6981("᩷᩺") + i8) * 71;
                    i2 = ((iM6981 ^ i7) * 10545) ^ (-68471454);
                    i3 = 282312104;
                    int i17 = iM6981 ^ i3;
                    actionMasked = i;
                    f2 = f;
                    i10 = i17;
                    i9 = i2;
                    f3 = f2;
                    break;
                case -1355939076:
                case -584872684:
                    f = f3;
                    i = actionMasked;
                    if (m24350()) {
                        iM6981 = C2105.m6981("۬ܿ") ^ i8;
                        i2 = ((iM6981 ^ i7) * 29779) ^ 820701500;
                        i3 = 586793106;
                    } else {
                        iM6981 = C2105.m6981("۟ۚ") ^ i7;
                        i2 = ((iM6981 ^ i8) * (-26563)) ^ (-363282582);
                        i3 = 636647058;
                    }
                    int i18 = iM6981 ^ i3;
                    actionMasked = i;
                    f2 = f;
                    i10 = i18;
                    i9 = i2;
                    f3 = f2;
                    break;
                case -1352598709:
                case -614086970:
                    this.f28847 = f3;
                    if (AbstractC2021.f6743 <= 0) {
                        iM2567 = (i7 - C2105.m6981("۬᩺")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM2567 ^ i8) * (-1277)) ^ 459011421;
                        i6 = 1687572862;
                    } else {
                        iM2567 = (C2105.m6981("ܽۢ") ^ i8) * 35;
                        i4 = ((iM2567 ^ i7) * 3833) ^ 459429887;
                        i6 = -1079266467;
                    }
                    i10 = iM2567 ^ i6;
                    i9 = i4;
                    break;
                case -1223550420:
                case -706496170:
                    f = f3;
                    i = actionMasked;
                    if (i != 2) {
                        iM6981 = C0630.m2566("᩹ᩴ") ^ i8;
                        i2 = ((iM6981 ^ i7) * (-25183)) ^ 2045487157;
                        i3 = -879576395;
                    } else {
                        iM6981 = (i8 - C0630.m2566("֨ۧ")) * 21;
                        i2 = ((iM6981 ^ i7) * (-513)) ^ (-735329931);
                        i3 = 1535087393;
                    }
                    int i19 = iM6981 ^ i3;
                    actionMasked = i;
                    f2 = f;
                    i10 = i19;
                    i9 = i2;
                    f3 = f2;
                    break;
                case -1217289045:
                case -926045928:
                    y = motionEvent.getY();
                    if (C3432.m10477() > 0) {
                        iM2567 = (i7 - C2105.m6981("ۢ֫")) * (-3);
                        i4 = ((iM2567 ^ i8) * 2829) ^ (-852172805);
                        i6 = -1569667025;
                        i10 = iM2567 ^ i6;
                        i9 = i4;
                    } else {
                        f = f3;
                        i = actionMasked;
                        iM6981 = C2105.m6981("᩷ܰ") ^ i7;
                        i2 = ((iM6981 ^ i8) * 28061) ^ (-114140534);
                        i3 = 1931442493;
                        int i110 = iM6981 ^ i3;
                        actionMasked = i;
                        f2 = f;
                        i10 = i110;
                        i9 = i2;
                        f3 = f2;
                    }
                    break;
                case -1054567985:
                case 1164654519:
                    this.f28852 = z2;
                    this.f28867 = z;
                    m24346(motionEvent);
                    c13064 = this.f28860;
                    if (c13064 != null) {
                        iM2567 = C2105.m6981("᩹ۗ") ^ i7;
                        i4 = ((iM2567 ^ i8) * (-7953)) ^ 107942223;
                        i6 = -1928113547;
                    } else {
                        iM2567 = C0630.m2566("᩶ۛ") ^ i8;
                        i4 = ((iM2567 ^ i7) * 4953) ^ (-946940346);
                        i6 = 1536263507;
                    }
                    i10 = iM2567 ^ i6;
                    i9 = i4;
                    break;
                case -1009866615:
                case 766584558:
                    i = actionMasked;
                    if (this.f28852) {
                        iM6981 = (C0630.m2566("ܽۘ") + i7) * 31;
                        f = f3;
                        i2 = ((iM6981 ^ i8) * 9159) ^ 110289237;
                        i3 = -2006402811;
                    } else {
                        f = f3;
                        iM6981 = (C2105.m6981("᩷᩺") + i8) * 71;
                        i2 = ((iM6981 ^ i7) * 10545) ^ (-68471454);
                        i3 = 282312104;
                    }
                    int i111 = iM6981 ^ i3;
                    actionMasked = i;
                    f2 = f;
                    i10 = i111;
                    i9 = i2;
                    f3 = f2;
                    break;
                case -982430764:
                case 726750587:
                    if (C1005.f3721) {
                        iM2567 = (i7 - C2105.m6981("۬᩺")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM2567 ^ i8) * (-1277)) ^ 459011421;
                        i6 = 1687572862;
                    } else {
                        iM2567 = (i8 - C2105.m6981("ۤ۟")) * 59;
                        i4 = ((iM2567 ^ i7) * 18847) ^ (-132408787);
                        i6 = -1778524584;
                    }
                    i10 = iM2567 ^ i6;
                    i9 = i4;
                    break;
                case -735816128:
                case 1463442882:
                    f8 = (f6 * f6) + f7;
                    i11 = this.f28854;
                    if (C4263.f13799 <= 0) {
                        iM2567 = (i7 - C2105.m6981("۬᩺")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM2567 ^ i8) * (-1277)) ^ 459011421;
                        i6 = 1687572862;
                    } else {
                        iM2567 = (C0630.m2566("ۙ֡") ^ i7) * 63;
                        i4 = ((iM2567 ^ i8) * 32221) ^ (-684271905);
                        i6 = 934531466;
                    }
                    i10 = iM2567 ^ i6;
                    i9 = i4;
                    break;
                case -631223706:
                case 500387125:
                    C3019.m9255();
                    if (C5695.f17556 < 0) {
                        f = f3;
                        i = actionMasked;
                        iM6981 = C2105.m6981("᩷ܰ") ^ i7;
                        i2 = ((iM6981 ^ i8) * 28061) ^ (-114140534);
                        i3 = 1931442493;
                        int i112 = iM6981 ^ i3;
                        actionMasked = i;
                        f2 = f;
                        i10 = i112;
                        i9 = i2;
                        f3 = f2;
                    } else {
                        iM2567 = (i8 - C2105.m6981("ۤ۟")) * 59;
                        i4 = ((iM2567 ^ i7) * 18847) ^ (-132408787);
                        i6 = -1778524584;
                        i10 = iM2567 ^ i6;
                        i9 = i4;
                    }
                    break;
                case -559694732:
                case -329143212:
                    f5 = x - f4;
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2567 = (C2105.m6981("᩶᩺") ^ i8) * 101;
                        i4 = ((iM2567 ^ i7) * (-15311)) ^ (-2025279083);
                        i6 = 388951859;
                    } else {
                        iM2567 = C0630.m2566("᩺ۙ") ^ i7;
                        i4 = ((iM2567 ^ i8) * 31225) ^ (-130818787);
                        i6 = -1837204031;
                    }
                    i10 = iM2567 ^ i6;
                    i9 = i4;
                    break;
                case -501417771:
                case 637575122:
                    f = f3;
                    i = actionMasked;
                    this.f28852 = z2;
                    iM6981 = (C2105.m6981("᩷᩺") + i8) * 71;
                    i2 = ((iM6981 ^ i7) * 10545) ^ (-68471454);
                    i3 = 282312104;
                    int i113 = iM6981 ^ i3;
                    actionMasked = i;
                    f2 = f;
                    i10 = i113;
                    i9 = i2;
                    f3 = f2;
                    break;
                case -461426288:
                case 574154140:
                    C0714.m2805();
                    if (C3911.f12484 >= 0) {
                        f = f3;
                        i = actionMasked;
                        iM6981 = (C2105.m6981("᩷֨") + i7) * 23;
                        i2 = ((iM6981 ^ i8) * 12979) ^ (-1568684336);
                        i3 = 1722479501;
                        int i114 = iM6981 ^ i3;
                        actionMasked = i;
                        f2 = f;
                        i10 = i114;
                        i9 = i2;
                        f3 = f2;
                    } else {
                        iM2567 = (i7 - C2105.m6981("۬᩺")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM2567 ^ i8) * (-1277)) ^ 459011421;
                        i6 = 1687572862;
                        i10 = iM2567 ^ i6;
                        i9 = i4;
                    }
                    break;
                case -438532557:
                case 2135970694:
                    f = f3;
                    i = actionMasked;
                    this.f28850 = motionEvent.getX();
                    if (C0483.f2088 >= 0) {
                        iM6981 = (i8 - C0630.m2566("ۙۤ")) * (-75);
                        i2 = ((iM6981 ^ i7) * (-3051)) ^ 1746571261;
                        i3 = 466035224;
                    } else {
                        iM6981 = (C2105.m6981("ᩳ۬") + i8) * (-23);
                        i2 = ((iM6981 ^ i7) * 13581) ^ 232050937;
                        i3 = 148146295;
                    }
                    int i115 = iM6981 ^ i3;
                    actionMasked = i;
                    f2 = f;
                    i10 = i115;
                    i9 = i2;
                    f3 = f2;
                    break;
                case -423420026:
                case 2053189865:
                    i = actionMasked;
                    if (i == 3) {
                        f = f3;
                        iM6981 = (C0630.m2566("ۜܶ") + i8) * (-115);
                        i2 = ((iM6981 ^ i7) * (-21001)) ^ (-1226843590);
                        i3 = 913572351;
                        int i116 = iM6981 ^ i3;
                        actionMasked = i;
                        f2 = f;
                        i10 = i116;
                        i9 = i2;
                        f3 = f2;
                    }
                    f = f3;
                    iM6981 = (C2105.m6981("᩷᩺") + i8) * 71;
                    i2 = ((iM6981 ^ i7) * 10545) ^ (-68471454);
                    i3 = 282312104;
                    int i117 = iM6981 ^ i3;
                    actionMasked = i;
                    f2 = f;
                    i10 = i117;
                    i9 = i2;
                    f3 = f2;
                    break;
                case -377877261:
                case -362644687:
                    f3 = c14792.f45166 - this.f28848;
                    if (C4263.f13799 <= 0) {
                        iM2567 = (i8 - C2105.m6981("ۤ۟")) * 59;
                        i4 = ((iM2567 ^ i7) * 18847) ^ (-132408787);
                        i6 = -1778524584;
                    } else {
                        iM2567 = C2105.m6981("ۛ᩹") ^ i7;
                        i4 = ((iM2567 ^ i8) * 2975) ^ (-1850445076);
                        i6 = -170853645;
                    }
                    i10 = iM2567 ^ i6;
                    i9 = i4;
                    break;
                case -327215845:
                case 1771324388:
                    C2105.m6984(this);
                    getParent().requestDisallowInterceptTouchEvent(z);
                    return z;
                case -136277814:
                case 727993032:
                    f = f3;
                    i = actionMasked;
                    z2 = false;
                    if (i != z) {
                        iM6981 = C0630.m2566("ۖۛ") ^ i7;
                        i2 = ((iM6981 ^ i8) * 27287) ^ (-1005680410);
                        i3 = -308138065;
                    } else {
                        iM6981 = (C0630.m2566("ۜܶ") + i8) * (-115);
                        i2 = ((iM6981 ^ i7) * (-21001)) ^ (-1226843590);
                        i3 = 913572351;
                    }
                    int i118 = iM6981 ^ i3;
                    actionMasked = i;
                    f2 = f;
                    i10 = i118;
                    i9 = i2;
                    f3 = f2;
                    break;
                case -10669052:
                case 1863104579:
                    f = f3;
                    float f10 = y2;
                    i = actionMasked;
                    this.f28848 = f10;
                    if (c14792.m35177(this.f28850, f10)) {
                        int iM2569 = C0630.m2566("ᩳ֡") ^ i7;
                        y2 = f10;
                        i9 = ((iM2569 ^ i8) * 31921) ^ 1746719518;
                        actionMasked = i;
                        f2 = f;
                        i10 = iM2569 ^ (-1933608339);
                    } else {
                        y2 = f10;
                        iM6981 = (C2105.m6981("᩷᩺") + i8) * 71;
                        i2 = ((iM6981 ^ i7) * 10545) ^ (-68471454);
                        i3 = 282312104;
                        int i119 = iM6981 ^ i3;
                        actionMasked = i;
                        f2 = f;
                        i10 = i119;
                        i9 = i2;
                    }
                    f3 = f2;
                    break;
                case 100758864:
                case 699182562:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        f = f3;
                        i = actionMasked;
                        iM6981 = (i8 - C0630.m2566("ۙۤ")) * (-75);
                        i2 = ((iM6981 ^ i7) * (-3051)) ^ 1746571261;
                        i3 = 466035224;
                        int i1110 = iM6981 ^ i3;
                        actionMasked = i;
                        f2 = f;
                        i10 = i1110;
                        i9 = i2;
                        f3 = f2;
                    } else {
                        iM2567 = (i8 - C2105.m6981("ۤ۟")) * 59;
                        i4 = ((iM2567 ^ i7) * 18847) ^ (-132408787);
                        i6 = -1778524584;
                        i10 = iM2567 ^ i6;
                        i9 = i4;
                    }
                    break;
                case 115279099:
                case 1431637276:
                    m24340(motionEvent);
                    this.f28855 = z;
                    return z;
                case 197621079:
                case 1443145856:
                    f = f3;
                    i = actionMasked;
                    y2 = motionEvent.getY();
                    if (C4263.m12819() >= 0) {
                        iM6981 = (C2105.m6981("᩷֨") + i7) * 23;
                        i2 = ((iM6981 ^ i8) * 12979) ^ (-1568684336);
                        i3 = 1722479501;
                    } else {
                        iM6981 = (i7 - C0630.m2566("۬᩵")) * (-119);
                        i2 = ((iM6981 ^ i8) * 16679) ^ 1908481065;
                        i3 = 661513633;
                    }
                    int i1111 = iM6981 ^ i3;
                    actionMasked = i;
                    f2 = f;
                    i10 = i1111;
                    i9 = i2;
                    f3 = f2;
                    break;
                case 649753127:
                case 1944076442:
                    x = motionEvent.getX();
                    f4 = this.f28850;
                    if (!C0483.m2121()) {
                        f = f3;
                        i = actionMasked;
                        iM6981 = C2105.m6981("᩷ܰ") ^ i7;
                        i2 = ((iM6981 ^ i8) * 28061) ^ (-114140534);
                        i3 = 1931442493;
                        int i1112 = iM6981 ^ i3;
                        actionMasked = i;
                        f2 = f;
                        i10 = i1112;
                        i9 = i2;
                        f3 = f2;
                    } else {
                        iM2567 = (C0630.m2566("᩶֡") + i8) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM2567 ^ i7) * 11481) ^ 167220616;
                        i6 = -160949542;
                        i10 = iM2567 ^ i6;
                        i9 = i4;
                    }
                    break;
                case 898353563:
                case 1428968458:
                    return z;
                case 925605486:
                case 1082475868:
                    C1047.m3599();
                    if (C0050.f910 < 0) {
                        iM2567 = (i8 - C2105.m6981("ۤ۟")) * 59;
                        i4 = ((iM2567 ^ i7) * 18847) ^ (-132408787);
                        i6 = -1778524584;
                    } else {
                        iM2567 = (C2105.m6981("᩹ۤ") + i8) * 21;
                        i4 = ((iM2567 ^ i7) * (-6069)) ^ 567946100;
                        i6 = 2132195160;
                    }
                    i10 = iM2567 ^ i6;
                    i9 = i4;
                    break;
                case 958655895:
                case 2135048719:
                    return super.onInterceptTouchEvent(motionEvent);
                case 993620582:
                case 1664706502:
                    C0422.m1963();
                    iM2567 = (i8 - C2105.m6981("ۤ۟")) * 59;
                    i4 = ((iM2567 ^ i7) * 18847) ^ (-132408787);
                    i6 = -1778524584;
                    i10 = iM2567 ^ i6;
                    i9 = i4;
                    break;
                case 1726915928:
                case 1953529126:
                    if (f8 <= i11 * i11) {
                        f = f3;
                        i = actionMasked;
                        iM6981 = (C2105.m6981("᩷᩺") + i8) * 71;
                        i2 = ((iM6981 ^ i7) * 10545) ^ (-68471454);
                        i3 = 282312104;
                        int i1113 = iM6981 ^ i3;
                        actionMasked = i;
                        f2 = f;
                        i10 = i1113;
                        i9 = i2;
                        f3 = f2;
                    } else {
                        iM2567 = C0630.m2566("۠᩸") ^ i8;
                        i4 = ((iM2567 ^ i7) * 13927) ^ (-722312969);
                        i6 = 1892989712;
                        i10 = iM2567 ^ i6;
                        i9 = i4;
                    }
                    break;
                default:
                    if (!C0382.f1805) {
                        iM2567 = C2105.m6981("᩹ۚ") ^ i7;
                        i4 = ((iM2567 ^ i8) * 25161) ^ 90307283;
                        i6 = -2133614943;
                        i10 = iM2567 ^ i6;
                        i9 = i4;
                    } else {
                        f = f3;
                        i = actionMasked;
                        iM6981 = (i8 - C0630.m2566("ۙۤ")) * (-75);
                        i2 = ((iM6981 ^ i7) * (-3051)) ^ 1746571261;
                        i3 = 466035224;
                        int i1114 = iM6981 ^ i3;
                        actionMasked = i;
                        f2 = f;
                        i10 = i1114;
                        i9 = i2;
                        f3 = f2;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m24349(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = null;
        Iterator itM12354 = null;
        int i = 1885255865;
        int i2 = ServiceConnectionC3453.f10921;
        int i3 = C22628.f73083;
        int iM2566 = C0630.m2566("ܿܽ") ^ i3;
        int i4 = ((iM2566 ^ i2) * (-32569)) ^ (-266845621);
        int i5 = 185243005;
        while (true) {
            i = ((((i ^ i2) * (-15749)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -1749254822:
                case 902333181:
                    if (C1916.m6308() >= 0) {
                        iM2566 = (C2105.m6981("᩶ܽ") ^ i2) * (-61);
                        i4 = ((iM2566 ^ i3) * (-1909)) ^ 2111513114;
                        i5 = -504067260;
                    } else {
                        iM2566 = C0630.m2566("ۘۗ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-1327)) ^ 1183829553;
                        i5 = -1779497952;
                    }
                    break;
                case -1671536411:
                case -1182927937:
                    if (C4075.f12947 >= 0) {
                        iM2566 = (C0630.m2566("ᩴۨ") + i3) * (-25);
                        i4 = ((iM2566 ^ i2) * (-24681)) ^ (-2094569930);
                        i5 = -1931128110;
                    } else {
                        iM2566 = (i2 - C2105.m6981("ܿۜ")) * (-29);
                        i4 = ((iM2566 ^ i3) * (-167)) ^ (-2087638483);
                        i5 = -1813596367;
                    }
                    break;
                case -1609770948:
                case 654204705:
                    if (C0050.f910 >= 0) {
                        iM2566 = C0630.m2566("ܳᩴ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-23451)) ^ (-765818087);
                        i5 = -1244494562;
                    } else {
                        iM2566 = C0630.m2566("۫۫") ^ i3;
                        i4 = ((iM2566 ^ i2) * 7003) ^ 113847272;
                        i5 = 2080301551;
                    }
                    break;
                case -1586750020:
                case 21652374:
                    if (this.f28849 == null) {
                        iM2566 = (C0630.m2566("ۘ᩶") + i3) * 41;
                        i4 = ((iM2566 ^ i2) * (-21033)) ^ 1755476359;
                        i5 = 1720739098;
                    } else {
                        iM2566 = (C0630.m2566("۫᩸") + i2) * (-39);
                        i4 = ((iM2566 ^ i3) * 8433) ^ (-774088578);
                        i5 = -1508741747;
                    }
                    break;
                case -1422005066:
                case -552254140:
                    if (C0483.m2123(itM12354)) {
                        iM2566 = (C2105.m6981("ۤۛ") ^ i3) * (-29);
                        i4 = ((iM2566 ^ i2) * (-15301)) ^ 1436775330;
                        i5 = 763384609;
                    } else {
                        iM2566 = (C0630.m2566("ۘ᩶") + i3) * 41;
                        i4 = ((iM2566 ^ i2) * (-21033)) ^ 1755476359;
                        i5 = 1720739098;
                    }
                    break;
                case -1216116730:
                case 1447356732:
                    onTouchListener.onTouch(this, motionEvent);
                    iM2566 = (C2105.m6981("ۧܿ") + i3) * (-59);
                    i4 = ((iM2566 ^ i2) * (-22087)) ^ (-154736647);
                    i5 = -1098155791;
                    break;
                case -1158908177:
                case -1142563768:
                    if (RunnableC1108.f4040) {
                        iM2566 = C0630.m2566("ܺ᩵") ^ i3;
                        i4 = ((iM2566 ^ i2) * 8553) ^ (-1130537345);
                        i5 = -927741133;
                    } else {
                        iM2566 = (C0630.m2566("ᩴۨ") + i3) * (-25);
                        i4 = ((iM2566 ^ i2) * (-24681)) ^ (-2094569930);
                        i5 = -1931128110;
                    }
                    break;
                case -1049283356:
                case 1939121188:
                    if (C11340.m28031()) {
                        iM2566 = C0630.m2566("۠ܽ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-11091)) ^ (-1743251055);
                        i5 = 2068534391;
                    } else {
                        iM2566 = C0630.m2566("ܳᩴ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-23451)) ^ (-765818087);
                        i5 = -1244494562;
                    }
                    break;
                case -955108173:
                case 1189827083:
                    return false;
                case -927961571:
                case -217430981:
                    if (((View.OnTouchListener) RunnableC1108.m3791(itM12354)).onTouch(this, motionEvent)) {
                        iM2566 = C0630.m2566("ܳ۫") ^ i2;
                        i4 = ((iM2566 ^ i3) * 22399) ^ 1325797997;
                        i5 = -974927338;
                    } else {
                        iM2566 = C2105.m6981("ۤۗ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-1821)) ^ (-1353721262);
                        i5 = 870476871;
                    }
                    break;
                case -662320834:
                case 270874002:
                    if (C1047.f3863 >= 0) {
                        iM2566 = (C2105.m6981("᩶ܽ") ^ i2) * (-61);
                        i4 = ((iM2566 ^ i3) * (-1909)) ^ 2111513114;
                        i5 = -504067260;
                    } else {
                        iM2566 = (i2 - C0630.m2566("֫֡")) * (-51);
                        i4 = ((iM2566 ^ i3) * 6949) ^ (-1067405687);
                        i5 = -77648873;
                    }
                    break;
                case -541879812:
                case -45074517:
                    if (isEnabled()) {
                        iM2566 = (C0630.m2566("᩻֡") ^ i2) * (-83);
                        i4 = ((iM2566 ^ i3) * 27455) ^ (-681361847);
                        i5 = 770371752;
                    } else {
                        iM2566 = (C0630.m2566("ۘ᩶") + i3) * 41;
                        i4 = ((iM2566 ^ i2) * (-21033)) ^ 1755476359;
                        i5 = 1720739098;
                    }
                    break;
                case -497408026:
                case 689232254:
                    return true;
                case -365521854:
                case 812040403:
                    C0050.m940();
                    if (!C1504.m5179()) {
                        iM2566 = (C2105.m6981("᩶ܽ") ^ i2) * (-61);
                        i4 = ((iM2566 ^ i3) * (-1909)) ^ 2111513114;
                        i5 = -504067260;
                    } else {
                        iM2566 = C0630.m2566("ܳᩴ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-23451)) ^ (-765818087);
                        i5 = -1244494562;
                    }
                    break;
                case -96399508:
                case 1495632335:
                    if (C3683.f11629 >= 0) {
                        iM2566 = (C2105.m6981("ۛۖ") ^ i3) * (-109);
                        i4 = ((iM2566 ^ i2) * (-27559)) ^ (-1208915768);
                        i5 = 665806632;
                    } else {
                        iM2566 = (C2105.m6981("֫᩷") ^ i3) * 17;
                        i4 = ((iM2566 ^ i2) * (-1133)) ^ 313239774;
                        i5 = -2056658182;
                    }
                    break;
                case -80348935:
                case 1751000161:
                    C1294.m4372();
                    C3245.m9925();
                    iM2566 = (C2105.m6981("֫᩷") ^ i3) * 17;
                    i4 = ((iM2566 ^ i2) * (-1133)) ^ 313239774;
                    i5 = -2056658182;
                    break;
                case 66339045:
                case 1310538348:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = (C0630.m2566("ᩴۨ") + i3) * (-25);
                        i4 = ((iM2566 ^ i2) * (-24681)) ^ (-2094569930);
                        i5 = -1931128110;
                    } else {
                        iM2566 = (i2 - C0630.m2566("ۢܽ")) * (-51);
                        i4 = ((iM2566 ^ i3) * (-9963)) ^ 1818755328;
                        i5 = 1452830068;
                    }
                    break;
                case 290028357:
                case 762428486:
                    C3537.m10746();
                    return false;
                case 425398768:
                case 1074170456:
                    onTouchListener = this.f28870;
                    if (onTouchListener != null) {
                        iM2566 = C0630.m2566("֡֡") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-22297)) ^ 157305791;
                        i5 = 1671912447;
                    } else {
                        iM2566 = (C2105.m6981("ۧܿ") + i3) * (-59);
                        i4 = ((iM2566 ^ i2) * (-22087)) ^ (-154736647);
                        i5 = -1098155791;
                    }
                    break;
                case 537188017:
                case 1432245523:
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = (C2105.m6981("ۛۖ") ^ i3) * (-109);
                        i4 = ((iM2566 ^ i2) * (-27559)) ^ (-1208915768);
                        i5 = 665806632;
                    } else {
                        iM2566 = C0630.m2566("۠ۖ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-11907)) ^ (-2083663107);
                        i5 = 879945656;
                    }
                    break;
                case 593156592:
                case 720442678:
                    itM12354 = C4117.m12354(this.f28849);
                    iM2566 = C2105.m6981("ۤۗ") ^ i2;
                    i4 = ((iM2566 ^ i3) * (-1821)) ^ (-1353721262);
                    i5 = 870476871;
                    break;
                case 836835013:
                case 1280534105:
                    if (C3537.m10746() <= 0) {
                        iM2566 = (C2105.m6981("֫᩷") ^ i3) * 17;
                        i4 = ((iM2566 ^ i2) * (-1133)) ^ 313239774;
                        i5 = -2056658182;
                    } else {
                        iM2566 = C2105.m6981("ᩳܺ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 9325) ^ 1975014500;
                        i5 = -191559392;
                    }
                    break;
                case 1055487040:
                case 2055500240:
                    if (C1047.f3863 >= 0) {
                        iM2566 = (C0630.m2566("ᩴۨ") + i3) * (-25);
                        i4 = ((iM2566 ^ i2) * (-24681)) ^ (-2094569930);
                        i5 = -1931128110;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ۡ᩸")) * 115;
                        i4 = ((iM2566 ^ i2) * 11425) ^ (-1658872426);
                        i5 = 345292405;
                    }
                    break;
                default:
                    if (C0714.f2697 >= 0) {
                        iM2566 = (C2105.m6981("᩶ܽ") ^ i2) * (-61);
                        i4 = ((iM2566 ^ i3) * (-1909)) ^ 2111513114;
                        i5 = -504067260;
                    } else {
                        iM2566 = (C2105.m6981("֫᩷") ^ i3) * 17;
                        i4 = ((iM2566 ^ i2) * (-1133)) ^ 313239774;
                        i5 = -2056658182;
                    }
                    break;
            }
        }
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        ListAdapter adapter = null;
        DataSetObserver dataSetObserver = null;
        int i = -1261886129;
        int i2 = RunnableC1937.f6483;
        int i3 = C4075.f12947;
        int iM2566 = (i3 - C0630.m2566("ۜۧ")) * 61;
        int i4 = ((iM2566 ^ i2) * (-8761)) ^ (-1104671112);
        int i5 = -1537370830;
        while (true) {
            i = ((((i ^ i2) * 17451) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2046574994:
                case 1519586963:
                    if (C2958.f9394 >= 0) {
                        iM2566 = C0630.m2566("ܰܽ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 29947) ^ (-559913282);
                        i5 = 401475859;
                    } else {
                        iM2566 = C0630.m2566("۟ۙ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 18591) ^ 858996190;
                        i5 = 2116002154;
                    }
                    break;
                case -2045956044:
                case -225515377:
                    C7106.m19120();
                    break;
                case -2008153839:
                case -1108940242:
                    if (RunnableC0588.m2441() >= 0) {
                        iM2566 = C0630.m2566("ܺܺ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 30957) ^ 1174153084;
                        i5 = -2043559411;
                    } else {
                        iM2566 = (i2 - C2105.m6981("᩷ۙ")) * (-77);
                        i4 = ((iM2566 ^ i3) * (-6131)) ^ 1087812287;
                        i5 = -844599285;
                    }
                    break;
                case -1873190547:
                case -706457486:
                    adapter = getAdapter();
                    dataSetObserver = this.f28871;
                    if (adapter != null) {
                        iM2566 = C0630.m2566("ܰۚ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 24243) ^ 1481564650;
                        i5 = 1214651098;
                    } else {
                        iM2566 = (C0630.m2566("᩺ۚ") + i2) * (-101);
                        i4 = ((iM2566 ^ i3) * 11737) ^ (-888440620);
                        i5 = 119135243;
                    }
                    break;
                case -1783433361:
                case -424811548:
                    break;
                case -1507752383:
                case -771524377:
                    ViewOnClickListenerC1958.m6429();
                    C1047.m3599();
                    iM2566 = C0630.m2566("ܰܽ") ^ i2;
                    i4 = ((iM2566 ^ i3) * 29947) ^ (-559913282);
                    i5 = 401475859;
                    break;
                case -1387316125:
                case -1252388790:
                    C0714.m2805();
                    if (C2958.m9034() <= 0) {
                        iM2566 = C0630.m2566("ܺܺ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 30957) ^ 1174153084;
                        i5 = -2043559411;
                    } else {
                        iM2566 = C0630.m2566("ܰܽ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 29947) ^ (-559913282);
                        i5 = 401475859;
                    }
                    break;
                case -1069683032:
                case 63148490:
                    adapter.unregisterDataSetObserver(dataSetObserver);
                    iM2566 = (C0630.m2566("᩺ۚ") + i2) * (-101);
                    i4 = ((iM2566 ^ i3) * 11737) ^ (-888440620);
                    i5 = 119135243;
                    break;
                case -851816777:
                case 1758179909:
                    super.setAdapter(listAdapter);
                    if (listAdapter != null) {
                        iM2566 = (C0630.m2566("᩵ᩴ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM2566 ^ i3) * 28409) ^ 931871785;
                        i5 = -1013779133;
                    } else {
                        iM2566 = (C0630.m2566("ۡ᩸") ^ i3) * (-61);
                        i4 = ((iM2566 ^ i2) * 4935) ^ (-1691482150);
                        i5 = 1689893993;
                    }
                    break;
                case -758725837:
                case 878982380:
                    if (C3245.m9925() != 0) {
                        iM2566 = (C2105.m6981("ۢ᩵") ^ i2) * 41;
                        i4 = ((iM2566 ^ i3) * (-30769)) ^ 51608382;
                        i5 = -398932053;
                    } else {
                        iM2566 = C0630.m2566("ۚᩴ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 11447) ^ (-1407128319);
                        i5 = 991645190;
                    }
                    break;
                case -651991701:
                case 397951606:
                    if (C0714.m2805()) {
                        iM2566 = C2105.m6981("۬᩸") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-15599)) ^ (-1078274518);
                        i5 = -5456435;
                    } else {
                        iM2566 = C0630.m2566("ܰܽ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 29947) ^ (-559913282);
                        i5 = 401475859;
                    }
                    break;
                case -418689568:
                case 1266985602:
                    if (C2272.m7503()) {
                        iM2566 = (C2105.m6981("᩺ܰ") + i3) * (-99);
                        i4 = ((iM2566 ^ i2) * (-24545)) ^ (-1397269393);
                        i5 = 345800114;
                    } else {
                        iM2566 = (C0630.m2566("۟ۚ") ^ i2) * 65;
                        i4 = ((iM2566 ^ i3) * 20981) ^ 1666127586;
                        i5 = -1694687140;
                    }
                    break;
                case -352782064:
                case 1042365586:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = C0630.m2566("ܰܽ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 29947) ^ (-559913282);
                        i5 = 401475859;
                    } else {
                        iM2566 = C0630.m2566("ۨ᩹") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-22161)) ^ (-676687030);
                        i5 = -1857456864;
                    }
                    break;
                case -163288216:
                case 2050962798:
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = (C2105.m6981("᩺ܰ") + i3) * (-99);
                        i4 = ((iM2566 ^ i2) * (-24545)) ^ (-1397269393);
                        i5 = 345800114;
                    } else {
                        iM2566 = (C0630.m2566("ۘܺ") + i2) * (-101);
                        i4 = ((iM2566 ^ i3) * 359) ^ 1274006982;
                        i5 = 1323522646;
                    }
                    break;
                case 11164315:
                case 1588571708:
                    if (C0050.f910 >= 0) {
                        iM2566 = C2105.m6981("ܶܿ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-19629)) ^ (-2034650489);
                        i5 = 779776336;
                    } else {
                        iM2566 = (C0630.m2566("֡᩵") ^ i3) * 99;
                        i4 = ((iM2566 ^ i2) * 18735) ^ 73365581;
                        i5 = 107091498;
                    }
                    break;
                case 241841301:
                case 1755060771:
                    if (!RunnableC1108.f4040) {
                        iM2566 = C2105.m6981("ܶܿ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-19629)) ^ (-2034650489);
                        i5 = 779776336;
                    } else {
                        iM2566 = C0630.m2566("ܰܽ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 29947) ^ (-559913282);
                        i5 = 401475859;
                    }
                    break;
                case 470416415:
                case 1850708971:
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = C0630.m2566("ܰܽ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 29947) ^ (-559913282);
                        i5 = 401475859;
                    } else {
                        iM2566 = C2105.m6981("ۚۗ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-8595)) ^ 1558936542;
                        i5 = 240678027;
                    }
                    break;
                case 504942991:
                case 1461425380:
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = (C2105.m6981("ۢ᩵") ^ i2) * 41;
                        i4 = ((iM2566 ^ i3) * (-30769)) ^ 51608382;
                        i5 = -398932053;
                    } else {
                        iM2566 = C0630.m2566("ܺܺ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 30957) ^ 1174153084;
                        i5 = -2043559411;
                    }
                    break;
                case 1489548298:
                case 1925737104:
                    listAdapter.registerDataSetObserver(dataSetObserver);
                    iM2566 = (C0630.m2566("ۡ᩸") ^ i3) * (-61);
                    i4 = ((iM2566 ^ i2) * 4935) ^ (-1691482150);
                    i5 = 1689893993;
                    break;
                default:
                    if (C3245.f10203 <= 0) {
                        iM2566 = (C2105.m6981("᩺ܰ") + i3) * (-99);
                        i4 = ((iM2566 ^ i2) * (-24545)) ^ (-1397269393);
                        i5 = 345800114;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ۗܺ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM2566 ^ i2) * (-26521)) ^ (-2078370475);
                        i5 = 1419313177;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m24359() {
        this.f28872 = 0;
    }

    @Override // android.widget.AbsListView
    public final boolean isFastScrollEnabled() {
        return this.f28866;
    }

    @Override // android.widget.AbsListView
    public final void setFastScrollEnabled(boolean z) {
        this.f28866 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24356(C13064 c13064) {
        int i = -142583831;
        int i2 = C0630.f2410;
        int i3 = C3746.f11829;
        int iM2566 = (i3 - C0630.m2566("۟ۡ")) * 99;
        int i4 = ((iM2566 ^ i2) * 13175) ^ 343544013;
        int i5 = 1729523972;
        while (true) {
            i = ((((i ^ i2) * SecP160R2Field.PInv33) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -1887217817:
                case -1008794719:
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = C2105.m6981("ۗ۫") ^ i3;
                        i4 = ((iM2566 ^ i2) * 14893) ^ 900652378;
                        i5 = 898229632;
                    } else {
                        iM2566 = (C2105.m6981("ۤ۬") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM2566 ^ i3) * 3455) ^ (-1936596951);
                        i5 = -767813431;
                    }
                    break;
                case -1585562129:
                case -1321105541:
                    if (C4075.f12947 >= 0) {
                        iM2566 = C0630.m2566("ۚ᩺") ^ i3;
                        i4 = ((iM2566 ^ i2) * o.a.c) ^ 255275168;
                        i5 = -2044917025;
                    } else {
                        iM2566 = (C0630.m2566("ܶ᩷") + i3) * (-19);
                        i4 = ((iM2566 ^ i2) * 59) ^ (-1641575409);
                        i5 = 620179749;
                    }
                    break;
                case -1566287571:
                case -824469383:
                    if (C2126.f7087) {
                        iM2566 = C2105.m6981("ۗ۫") ^ i3;
                        i4 = ((iM2566 ^ i2) * 14893) ^ 900652378;
                        i5 = 898229632;
                    } else {
                        iM2566 = C0630.m2566("ܶ᩵") ^ i3;
                        i4 = ((iM2566 ^ i2) * 28627) ^ 916389138;
                        i5 = -379918723;
                    }
                    break;
                case -1507616845:
                case -523981606:
                    C4263.m12819();
                    if (C2126.f7087) {
                        iM2566 = (C2105.m6981("᩵ܿ") ^ i3) * (-43);
                        i4 = ((iM2566 ^ i2) * (-29169)) ^ (-1321596504);
                        i5 = -1113428265;
                    } else {
                        iM2566 = (C2105.m6981("᩷ۙ") + i2) * 7;
                        i4 = ((iM2566 ^ i3) * (-12243)) ^ (-1505416665);
                        i5 = 539484883;
                    }
                    break;
                case -1430431784:
                case -1403932503:
                    C2520.m8026();
                    iM2566 = C2105.m6981("ۗ۫") ^ i3;
                    i4 = ((iM2566 ^ i2) * 14893) ^ 900652378;
                    i5 = 898229632;
                    break;
                case -1159878525:
                case 2067468888:
                    if (C2167.f7158 >= 0) {
                        iM2566 = (i2 - C0630.m2566("᩹᩵")) * (-59);
                        i4 = ((iM2566 ^ i3) * 24415) ^ 199813528;
                        i5 = -1246910725;
                    } else {
                        iM2566 = (i3 - C2105.m6981("᩺֫")) * q.h;
                        i4 = ((iM2566 ^ i2) * (-19957)) ^ 51399721;
                        i5 = -66195001;
                    }
                    break;
                case -957053410:
                case 45679758:
                    if (C4117.f13076 <= 0) {
                        iM2566 = C0630.m2566("ۚ᩺") ^ i3;
                        i4 = ((iM2566 ^ i2) * o.a.c) ^ 255275168;
                        i5 = -2044917025;
                    } else {
                        iM2566 = C2105.m6981("ۚܶ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-3355)) ^ 1212220186;
                        i5 = 99517413;
                    }
                    break;
                case -896991389:
                case -219845636:
                    if (C0050.f910 >= 0) {
                        iM2566 = C2105.m6981("ۗ۫") ^ i3;
                        i4 = ((iM2566 ^ i2) * 14893) ^ 900652378;
                        i5 = 898229632;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ۢ֫")) * (-81);
                        i4 = ((iM2566 ^ i2) * 32569) ^ (-227072766);
                        i5 = 2000435690;
                    }
                    break;
                case -562279403:
                case 1523239787:
                    if (C0714.f2697 < 0) {
                        iM2566 = (i2 - C0630.m2566("᩹᩵")) * (-59);
                        i4 = ((iM2566 ^ i3) * 24415) ^ 199813528;
                        i5 = -1246910725;
                    } else {
                        iM2566 = C2105.m6981("ۗ۫") ^ i3;
                        i4 = ((iM2566 ^ i2) * 14893) ^ 900652378;
                        i5 = 898229632;
                    }
                    break;
                case -502393728:
                case 1397782417:
                    RunnableC1108.m3790();
                    C1005.m3501();
                    break;
                case -10503709:
                case 850185444:
                    this.f28859 = 8388613;
                    break;
                case 158043533:
                case 1904028945:
                    if (C0483.f2088 >= 0) {
                        iM2566 = (i2 - C0630.m2566("᩹᩵")) * (-59);
                        i4 = ((iM2566 ^ i3) * 24415) ^ 199813528;
                        i5 = -1246910725;
                    } else {
                        iM2566 = (i2 - C0630.m2566("᩻۬")) * 89;
                        i4 = ((iM2566 ^ i3) * (-4111)) ^ (-209433581);
                        i5 = 1019136814;
                    }
                    break;
                case 812405660:
                case 1783656064:
                    this.f28860 = c13064;
                    if (C7811.f24123 >= 0) {
                        iM2566 = C0630.m2566("ۚ᩺") ^ i3;
                        i4 = ((iM2566 ^ i2) * o.a.c) ^ 255275168;
                        i5 = -2044917025;
                    } else {
                        iM2566 = C2105.m6981("ۢ۟") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-31151)) ^ 361080313;
                        i5 = -1719259845;
                    }
                    break;
                case 1385105022:
                case 1600042815:
                    if (C3911.f12484 >= 0) {
                        iM2566 = C2105.m6981("ۗ۫") ^ i3;
                        i4 = ((iM2566 ^ i2) * 14893) ^ 900652378;
                        i5 = 898229632;
                    } else {
                        iM2566 = C0630.m2566("ᩳۨ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 10139) ^ (-2001310354);
                        i5 = 1793033743;
                    }
                    break;
                case 1561974396:
                case 2033859019:
                    if (C0964.f3626 != 0) {
                        iM2566 = (i2 - C0630.m2566("᩹᩵")) * (-59);
                        i4 = ((iM2566 ^ i3) * 24415) ^ 199813528;
                        i5 = -1246910725;
                    } else {
                        iM2566 = C0630.m2566("ۧۨ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-30733)) ^ 80440634;
                        i5 = 1406909994;
                    }
                    break;
                default:
                    if (!C2167.m7155()) {
                        iM2566 = (i2 - C0630.m2566("᩹᩵")) * (-59);
                        i4 = ((iM2566 ^ i3) * 24415) ^ 199813528;
                        i5 = -1246910725;
                    } else {
                        iM2566 = (C2105.m6981("᩷ۙ") + i2) * 7;
                        i4 = ((iM2566 ^ i3) * (-12243)) ^ (-1505416665);
                        i5 = 539484883;
                    }
                    break;
            }
            return;
        }
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = -951700338;
        int i6 = C1294.f4556;
        int i7 = C1773.f6144;
        int iM6981 = (C2105.m6981("۫֫") + i7) * (-37);
        int i8 = ((iM6981 ^ i6) * (-25779)) ^ 242514595;
        int i9 = 1290948574;
        while (true) {
            i5 = ((((i5 ^ i6) * (-31533)) >> 31) & i8) ^ (iM6981 ^ i9);
            switch (i5) {
                case -1769449874:
                case -406357320:
                    if (C3432.m10477() <= 0) {
                        iM6981 = C2105.m6981("۠ۤ") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-20997)) ^ (-1584781277);
                        i9 = 154396194;
                    } else {
                        iM6981 = C0630.m2566("ᩳ᩸") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-23145)) ^ 667103529;
                        i9 = 138204510;
                    }
                    break;
                case -1764646755:
                case -1258445092:
                    if (C0422.f1886 <= 0) {
                        iM6981 = C0630.m2566("ۨܳ") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-12787)) ^ 241972372;
                        i9 = -273679878;
                    } else {
                        iM6981 = C2105.m6981("ۖۨ") ^ i7;
                        i8 = ((iM6981 ^ i6) * (-23565)) ^ 1792063701;
                        i9 = 270205726;
                    }
                    break;
                case -1506046963:
                case 2115692269:
                    C0964.m3413();
                    iM6981 = C0630.m2566("֫᩷") ^ i7;
                    i8 = ((iM6981 ^ i6) * 13521) ^ 1474034829;
                    i9 = -2087887366;
                    break;
                case -1489556208:
                case 451174321:
                    if (C0422.f1886 <= 0) {
                        iM6981 = (C0630.m2566("ܿܶ") ^ i7) * (-99);
                        i8 = ((iM6981 ^ i6) * (-27071)) ^ (-1816404985);
                        i9 = -1253889221;
                    } else {
                        iM6981 = C2105.m6981("ۛ᩵") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-12043)) ^ (-1250226260);
                        i9 = -730519944;
                    }
                    break;
                case -1389300192:
                case 1410953068:
                    C3911.m11924();
                    C5695.m16023();
                    break;
                case -1223048430:
                case 2056326817:
                    if (RunnableC1108.f4040) {
                        iM6981 = C2105.m6981("ܿ᩻") ^ i7;
                        i8 = ((iM6981 ^ i6) * (-7489)) ^ (-1463696450);
                        i9 = -1707066314;
                    } else {
                        iM6981 = C0630.m2566("ۨܳ") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-12787)) ^ 241972372;
                        i9 = -273679878;
                    }
                    break;
                case -373419178:
                case 2071821993:
                    if (C21923.m49329()) {
                        iM6981 = C0630.m2566("֫᩷") ^ i7;
                        i8 = ((iM6981 ^ i6) * 13521) ^ 1474034829;
                        i9 = -2087887366;
                    } else {
                        iM6981 = (C0630.m2566("᩷ۗ") + i7) * 109;
                        i8 = ((iM6981 ^ i6) * (-17441)) ^ 116405565;
                        i9 = -1241918927;
                    }
                    break;
                case -363464088:
                case 303477190:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = C2105.m6981("ܳ᩸") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-19391)) ^ 503946966;
                        i9 = -1654837084;
                    } else {
                        iM6981 = (i7 - C2105.m6981("ۘۙ")) * (-53);
                        i8 = ((iM6981 ^ i6) * 23163) ^ 2000955652;
                        i9 = -206509737;
                    }
                    break;
                case 157928836:
                case 844463914:
                    C21923.m49329();
                    if (C2958.f9394 < 0) {
                        iM6981 = C0630.m2566("ۨܳ") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-12787)) ^ 241972372;
                        i9 = -273679878;
                    } else {
                        iM6981 = C0630.m2566("֫᩷") ^ i7;
                        i8 = ((iM6981 ^ i6) * 13521) ^ 1474034829;
                        i9 = -2087887366;
                    }
                    break;
                case 225112786:
                case 1051113530:
                    if (C1420.m4913()) {
                        iM6981 = C2105.m6981("۠ۤ") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-20997)) ^ (-1584781277);
                        i9 = 154396194;
                    } else {
                        iM6981 = C0630.m2566("ۛۘ") ^ i6;
                        i8 = ((iM6981 ^ i7) * 18205) ^ (-1474589890);
                        i9 = -311536211;
                    }
                    break;
                case 226777445:
                case 1113995483:
                    if (C0714.m2805()) {
                        iM6981 = C2105.m6981("᩵ۡ") ^ i7;
                        i8 = ((iM6981 ^ i6) * 22243) ^ 160243589;
                        i9 = -1204417388;
                    } else {
                        iM6981 = (C0630.m2566("ܿܶ") ^ i7) * (-99);
                        i8 = ((iM6981 ^ i6) * (-27071)) ^ (-1816404985);
                        i9 = -1253889221;
                    }
                    break;
                case 261148234:
                case 1920157964:
                    if (C3663.f11553) {
                        iM6981 = C0630.m2566("֫᩷") ^ i7;
                        i8 = ((iM6981 ^ i6) * 13521) ^ 1474034829;
                        i9 = -2087887366;
                    } else {
                        iM6981 = (C0630.m2566("ۧܿ") + i6) * 39;
                        i8 = ((iM6981 ^ i7) * 20499) ^ (-1405599126);
                        i9 = 493664007;
                    }
                    break;
                case 599169380:
                case 1012771199:
                    break;
                case 1084723866:
                case 1961597840:
                    if (C22628.f73083 > 0) {
                        iM6981 = (C0630.m2566("ܿܶ") ^ i7) * (-99);
                        i8 = ((iM6981 ^ i6) * (-27071)) ^ (-1816404985);
                        i9 = -1253889221;
                    } else {
                        iM6981 = C0630.m2566("֫᩷") ^ i7;
                        i8 = ((iM6981 ^ i6) * 13521) ^ 1474034829;
                        i9 = -2087887366;
                    }
                    break;
                case 1157958759:
                case 2107436533:
                    this.f28863 = 1;
                    iM6981 = (C2105.m6981("ܳۧ") + i7) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i8 = ((iM6981 ^ i6) * 10789) ^ 1760051982;
                    i9 = 274081125;
                    break;
                case 1288101753:
                case 1576746447:
                    if (C22628.f73083 <= 0) {
                        iM6981 = C2105.m6981("ܳ᩸") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-19391)) ^ 503946966;
                        i9 = -1654837084;
                    } else {
                        iM6981 = (i6 - C2105.m6981("ۢ᩺")) * q.h;
                        i8 = ((iM6981 ^ i7) * 9711) ^ 1193008337;
                        i9 = 1692231489;
                    }
                    break;
                case 1509296646:
                case 2027525783:
                    if (C4616.f14690 <= 0) {
                        iM6981 = C2105.m6981("۠ۤ") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-20997)) ^ (-1584781277);
                        i9 = 154396194;
                    } else {
                        iM6981 = C0630.m2566("֫᩷") ^ i7;
                        i8 = ((iM6981 ^ i6) * 13521) ^ 1474034829;
                        i9 = -2087887366;
                    }
                    break;
                default:
                    super.onLayout(z, i, i2, i3, i4);
                    if (z) {
                        iM6981 = C0630.m2566("ۘ᩷") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-29461)) ^ (-873445884);
                        i9 = -368225069;
                    } else {
                        iM6981 = (C2105.m6981("ܳۧ") + i7) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i8 = ((iM6981 ^ i6) * 10789) ^ 1760051982;
                        i9 = 274081125;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m24344(C9503 c9503, AdapterView adapterView, View view, int i, long j) {
        AdapterView.OnItemLongClickListener onItemLongClickListener = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = -475506809;
        int i3 = C3245.f10203;
        int i4 = C0422.f1886;
        int iM6981 = (C2105.m6981("ۧ۠") + i4) * 89;
        int i5 = ((iM6981 ^ i3) * (-139)) ^ (-1309964664);
        int i6 = -780135050;
        while (true) {
            i2 = ((((i2 ^ i3) * (-7595)) >> 31) & i5) ^ (iM6981 ^ i6);
            switch (i2) {
                case -2118190794:
                case 1971735714:
                    return z3;
                case -1946809831:
                case -1793331597:
                    if (RunnableC1108.f4040) {
                        iM6981 = (C2105.m6981("᩷ۜ") + i3) * (-47);
                        i5 = ((iM6981 ^ i4) * 18433) ^ (-1355682401);
                        i6 = -4574510;
                    } else {
                        iM6981 = (i3 - C2105.m6981("۟۟")) * (-127);
                        i5 = ((iM6981 ^ i4) * 13061) ^ 1428965810;
                        i6 = -1208736653;
                    }
                    break;
                case -1942208960:
                case 1528081505:
                    if (C1504.f5354) {
                        iM6981 = (C0630.m2566("ۤۚ") ^ i3) * 19;
                        i5 = ((iM6981 ^ i4) * (-14335)) ^ 302572072;
                        i6 = -427009270;
                    } else {
                        iM6981 = C0630.m2566("ۗᩳ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-25275)) ^ (-99644491);
                        i6 = -989395042;
                    }
                    break;
                case -1320033820:
                case 1372462331:
                    C0483.m2121();
                    C3683.m11222();
                    iM6981 = (i4 - C2105.m6981("ۧܳ")) * (-115);
                    i5 = ((iM6981 ^ i3) * 15125) ^ (-1077153741);
                    i6 = 2092674258;
                    break;
                case -1307579005:
                case -1134089955:
                    C1128.m3851();
                    C1916.m6308();
                    return false;
                case -1167955685:
                case 825420736:
                    if (C0422.f1886 <= 0) {
                        iM6981 = (i4 - C0630.m2566("ۗ᩶")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM6981 ^ i3) * 10621) ^ 1221409379;
                        i6 = 1817219638;
                    } else {
                        iM6981 = (C0630.m2566("ۧۢ") ^ i3) * 51;
                        i5 = ((iM6981 ^ i4) * (-2857)) ^ (-1408333088);
                        i6 = -1014958842;
                    }
                    break;
                case -1120940298:
                case -199822633:
                    C3432.m10477();
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = (i3 - C2105.m6981("۟۟")) * (-127);
                        i5 = ((iM6981 ^ i4) * 13061) ^ 1428965810;
                        i6 = -1208736653;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ۧܳ")) * (-115);
                        i5 = ((iM6981 ^ i3) * 15125) ^ (-1077153741);
                        i6 = 2092674258;
                    }
                    break;
                case -700525304:
                case 1909375848:
                    if (C3746.m11369() >= 0) {
                        iM6981 = (C2105.m6981("ܽܺ") ^ i3) * (-121);
                        i5 = ((iM6981 ^ i4) * 14201) ^ (-2008574077);
                        i6 = 1080211428;
                    } else {
                        iM6981 = C2105.m6981("ۢ֫") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-6587)) ^ 349039644;
                        i6 = -273037790;
                    }
                    break;
                case -532254598:
                case -333792674:
                    if (onItemLongClickListener.onItemLongClick(adapterView, view, i, j)) {
                        iM6981 = (C0630.m2566("ᩳᩳ") + i4) * (-105);
                        i5 = ((iM6981 ^ i3) * (-19819)) ^ (-301773862);
                        i6 = -831728931;
                    } else {
                        iM6981 = C0630.m2566("ۘܰ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-8893)) ^ (-790093568);
                        i6 = -150956933;
                    }
                    break;
                case -411127414:
                case -375007850:
                    onItemLongClickListener = c9503.f28862;
                    z = false;
                    z2 = true;
                    if (onItemLongClickListener != null) {
                        iM6981 = C0630.m2566("ۖۤ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-16113)) ^ 1554904557;
                        i6 = -1035996452;
                    } else {
                        iM6981 = C0630.m2566("ۘܰ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-8893)) ^ (-790093568);
                        i6 = -150956933;
                    }
                    break;
                case -269808606:
                case 2065872113:
                    z3 = false;
                    iM6981 = C2105.m6981("۬ۡ") ^ i3;
                    i5 = ((iM6981 ^ i4) * 12207) ^ (-759743670);
                    i6 = 1639412259;
                    break;
                case -145596886:
                case 26979286:
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = (C2105.m6981("ܽܺ") ^ i3) * (-121);
                        i5 = ((iM6981 ^ i4) * 14201) ^ (-2008574077);
                        i6 = 1080211428;
                    } else {
                        iM6981 = (C0630.m2566("᩺ܺ") + i4) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM6981 ^ i3) * 31445) ^ 532151481;
                        i6 = 1517485852;
                    }
                    break;
                case 58178636:
                case 1419432431:
                    if (C1294.f4556 >= 0) {
                        iM6981 = (C2105.m6981("ܽܺ") ^ i3) * (-121);
                        i5 = ((iM6981 ^ i4) * 14201) ^ (-2008574077);
                        i6 = 1080211428;
                    } else {
                        iM6981 = (C2105.m6981("֨ۡ") ^ i4) * 77;
                        i5 = ((iM6981 ^ i3) * 5199) ^ 659599243;
                        i6 = -996497213;
                    }
                    break;
                case 100274625:
                case 817840575:
                    c9503.f28865 = z2;
                    c9503.f28852 = z;
                    iM6981 = (C2105.m6981("ܽ۬") ^ i4) * (-101);
                    i5 = ((iM6981 ^ i3) * 25755) ^ (-37837518);
                    i6 = -1430858740;
                    break;
                case 139103722:
                case 291085947:
                    z3 = true;
                    iM6981 = C2105.m6981("۬ۡ") ^ i3;
                    i5 = ((iM6981 ^ i4) * 12207) ^ (-759743670);
                    i6 = 1639412259;
                    break;
                case 190395376:
                case 852758255:
                    if (C21923.f70183 != 0) {
                        iM6981 = (i3 - C2105.m6981("۟۟")) * (-127);
                        i5 = ((iM6981 ^ i4) * 13061) ^ 1428965810;
                        i6 = -1208736653;
                    } else {
                        iM6981 = (C0630.m2566("᩺ܶ") ^ i4) * (-107);
                        i5 = ((iM6981 ^ i3) * (-9167)) ^ 909638515;
                        i6 = -1595279075;
                    }
                    break;
                case 498440879:
                case 734310743:
                    if (C4263.f13799 <= 0) {
                        iM6981 = (C2105.m6981("ܽܺ") ^ i3) * (-121);
                        i5 = ((iM6981 ^ i4) * 14201) ^ (-2008574077);
                        i6 = 1080211428;
                    } else {
                        iM6981 = (i4 - C0630.m2566("ۜܽ")) * 79;
                        i5 = ((iM6981 ^ i3) * 19693) ^ 1534332361;
                        i6 = -348029311;
                    }
                    break;
                case 643955518:
                case 2073495484:
                    if (C1128.f4106 <= 0) {
                        iM6981 = (C0630.m2566("ۤۚ") ^ i3) * 19;
                        i5 = ((iM6981 ^ i4) * (-14335)) ^ 302572072;
                        i6 = -427009270;
                    } else {
                        iM6981 = (C0630.m2566("ۤۡ") + i3) * 115;
                        i5 = ((iM6981 ^ i4) * (-8117)) ^ (-1182174955);
                        i6 = 1311886384;
                    }
                    break;
                case 909940572:
                case 1565783542:
                    if (C1128.f4106 <= 0) {
                        iM6981 = (i3 - C2105.m6981("۟۟")) * (-127);
                        i5 = ((iM6981 ^ i4) * 13061) ^ 1428965810;
                        i6 = -1208736653;
                    } else {
                        iM6981 = C0630.m2566("᩸ܳ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 31197) ^ (-2143518422);
                        i6 = 1404346555;
                    }
                    break;
                case 1137637182:
                case 1842175312:
                    if (z3) {
                        iM6981 = (C0630.m2566("۟ۗ") + i3) * (-123);
                        i5 = ((iM6981 ^ i4) * 23903) ^ (-328917151);
                        i6 = 1790112897;
                    } else {
                        iM6981 = (C2105.m6981("ܽ۬") ^ i4) * (-101);
                        i5 = ((iM6981 ^ i3) * 25755) ^ (-37837518);
                        i6 = -1430858740;
                    }
                    break;
                case 1250611747:
                case 1770558768:
                    if (C7106.m19120() > 0) {
                        iM6981 = (i4 - C0630.m2566("ۗ᩶")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM6981 ^ i3) * 10621) ^ 1221409379;
                        i6 = 1817219638;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ۧܳ")) * (-115);
                        i5 = ((iM6981 ^ i3) * 15125) ^ (-1077153741);
                        i6 = 2092674258;
                    }
                    break;
                default:
                    RunnableC1937.m6387();
                    if (!C2272.m7503()) {
                        iM6981 = (C2105.m6981("ܽܺ") ^ i3) * (-121);
                        i5 = ((iM6981 ^ i4) * 14201) ^ (-2008574077);
                        i6 = 1080211428;
                    } else {
                        iM6981 = (i3 - C2105.m6981("۟۟")) * (-127);
                        i5 = ((iM6981 ^ i4) * 13061) ^ 1428965810;
                        i6 = -1208736653;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:154:0x0828 A[PHI: r3 r5 r9 r11 r12 r13 r14 r16 r23 r37 r39 r40
      0x0828: PHI (r3v34 int) = (r3v27 int), (r3v28 int), (r3v35 int) binds: [B:152:0x080f, B:144:0x07ae, B:121:0x062a] A[DONT_GENERATE, DONT_INLINE]
      0x0828: PHI (r5v4 float) = (r5v3 float), (r5v2 float), (r5v2 float) binds: [B:152:0x080f, B:144:0x07ae, B:121:0x062a] A[DONT_GENERATE, DONT_INLINE]
      0x0828: PHI (r9v57 int) = (r9v50 int), (r9v51 int), (r9v58 int) binds: [B:152:0x080f, B:144:0x07ae, B:121:0x062a] A[DONT_GENERATE, DONT_INLINE]
      0x0828: PHI (r11v44 int) = (r11v37 int), (r11v38 int), (r11v45 int) binds: [B:152:0x080f, B:144:0x07ae, B:121:0x062a] A[DONT_GENERATE, DONT_INLINE]
      0x0828: PHI (r12v40 int) = (r12v31 int), (r12v32 int), (r12v41 int) binds: [B:152:0x080f, B:144:0x07ae, B:121:0x062a] A[DONT_GENERATE, DONT_INLINE]
      0x0828: PHI (r13v32 boolean) = (r13v20 boolean), (r13v21 boolean), (r13v34 boolean) binds: [B:152:0x080f, B:144:0x07ae, B:121:0x062a] A[DONT_GENERATE, DONT_INLINE]
      0x0828: PHI (r14v23 float) = (r14v13 float), (r14v14 float), (r14v24 float) binds: [B:152:0x080f, B:144:0x07ae, B:121:0x062a] A[DONT_GENERATE, DONT_INLINE]
      0x0828: PHI (r16v22 int) = (r16v13 int), (r16v14 int), (r16v23 int) binds: [B:152:0x080f, B:144:0x07ae, B:121:0x062a] A[DONT_GENERATE, DONT_INLINE]
      0x0828: PHI (r23v4 float) = (r23v3 float), (r23v2 float), (r23v2 float) binds: [B:152:0x080f, B:144:0x07ae, B:121:0x062a] A[DONT_GENERATE, DONT_INLINE]
      0x0828: PHI (r37v36 int) = (r37v28 int), (r37v29 int), (r37v37 int) binds: [B:152:0x080f, B:144:0x07ae, B:121:0x062a] A[DONT_GENERATE, DONT_INLINE]
      0x0828: PHI (r39v28 float) = (r39v21 float), (r39v22 float), (r39v29 float) binds: [B:152:0x080f, B:144:0x07ae, B:121:0x062a] A[DONT_GENERATE, DONT_INLINE]
      0x0828: PHI (r40v24 l.ܳ᩸ۡ) = (r40v17 l.ܳ᩸ۡ), (r40v18 l.ܳ᩸ۡ), (r40v25 l.ܳ᩸ۡ) binds: [B:152:0x080f, B:144:0x07ae, B:121:0x062a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0169, code lost:
    
        if (l.C4263.f13799 > 0) goto L26;
     */
    @Override // android.widget.AbsListView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        C14792 c14792;
        int iM2566;
        int i7;
        int i8;
        boolean z;
        int iM2567;
        int i9;
        int i10;
        int i11;
        int iM2568;
        int i12;
        int i13;
        C14792 c14793;
        int i14;
        int i15;
        int i16;
        Paint paint;
        int iM6981;
        int i17;
        int i18;
        int i19;
        boolean z2;
        C14792 c14794;
        int i20;
        boolean z3;
        int i21;
        int iM2569;
        int i22;
        int i23;
        int i24;
        int i25;
        int iM6982;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int iM6983;
        int i31;
        int i32;
        int i33;
        Paint paint2;
        int iM25610;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int iM6984;
        int i39;
        int i40;
        int iM6985;
        int i41;
        int i42;
        int i43 = C0714.f2697;
        int i44 = C4616.f14690;
        int iM25611 = (C0630.m2566("֫֨") + i43) * 29;
        int i45 = ((iM25611 ^ i44) * (-15271)) ^ 505649267;
        C14792 c14795 = null;
        Paint paint3 = null;
        int i46 = iM25611 ^ (-1849444597);
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int count = 0;
        int i47 = 0;
        float fM3783 = 0.0f;
        int firstVisiblePosition = 0;
        int i48 = 0;
        int iM28026 = 0;
        int iM11931 = 0;
        int i49 = -684834502;
        int i50 = 0;
        int i51 = 0;
        int i52 = 0;
        int i53 = 0;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        int i54 = 0;
        int i55 = 0;
        int i56 = 0;
        int i57 = 0;
        boolean z4 = false;
        float f11 = 0.0f;
        float f12 = 0.0f;
        int i58 = 0;
        int iM24354 = 0;
        int i59 = 0;
        while (true) {
            int i60 = i46 ^ (i45 & (((i49 ^ i44) * 14053) >> 31));
            switch (i60) {
                case -2047024185:
                case -121971173:
                    i60 = i60;
                    C4075.m12263();
                    if (C1916.m6308() >= 0) {
                        int iM25612 = C0630.m2566("۠۟") ^ i43;
                        i49 = i60;
                        i46 = iM25612 ^ (-690513431);
                        i45 = ((iM25612 ^ i44) * 6223) ^ 332281433;
                    } else {
                        c14795 = c14795;
                        fM3783 = fM3783;
                        i48 = i48;
                        i2 = iM28026;
                        i21 = iM11931;
                        i30 = i59;
                        iM6985 = (i43 - C2105.m6981("ۤۜ")) * 7;
                        i41 = ((iM6985 ^ i44) * (-22169)) ^ (-1458744155);
                        i42 = 806674408;
                        i33 = iM6985 ^ i42;
                        iM11931 = i21;
                        i59 = i30;
                        i45 = i41;
                        i49 = i60;
                        iM28026 = i2;
                        i46 = i33;
                        fM3783 = fM3783;
                        i48 = i48;
                        c14795 = c14795;
                    }
                    break;
                case -2010038979:
                case -834893187:
                    i60 = i60;
                    c14795 = c14795;
                    fM3783 = fM3783;
                    i48 = i48;
                    i2 = iM28026;
                    i4 = iM11931;
                    z = z4;
                    i5 = i58;
                    i6 = i59;
                    f = f2;
                    count = getCount();
                    int iM3848 = C1128.m3848(this);
                    i47 = count - iM3848;
                    iM24354 = m24354();
                    if (iM3848 > 0) {
                        iM2567 = (i44 - C0630.m2566("᩻֫")) * (-125);
                        i9 = ((iM2567 ^ i43) * (-11789)) ^ 1614976812;
                        i10 = -2085581655;
                    } else {
                        iM2567 = (C2105.m6981("᩷۠") ^ i43) * (-107);
                        i9 = ((iM2567 ^ i44) * (-4787)) ^ (-410197006);
                        i10 = -2081635000;
                    }
                    i28 = iM2567 ^ i10;
                    i59 = i6;
                    i58 = i5;
                    z4 = z;
                    i48 = i48;
                    iM28026 = i2;
                    fM3783 = fM3783;
                    c14795 = c14795;
                    i36 = i60;
                    i46 = i28;
                    i45 = i9;
                    f2 = f;
                    iM11931 = i4;
                    i49 = i36;
                    break;
                case -1963293701:
                case -109634933:
                    i60 = i60;
                    if (!C1504.m5179()) {
                        c14795 = c14795;
                        fM3783 = fM3783;
                        i48 = i48;
                        i2 = iM28026;
                        i3 = iM11931;
                        iM6983 = C0630.m2566("ۙۛ") ^ i44;
                        i31 = ((iM6983 ^ i43) * (-26203)) ^ (-1287607074);
                        i32 = -1063488941;
                        i = iM6983 ^ i32;
                        iM11931 = i3;
                        iM28026 = i2;
                        i45 = i31;
                        i49 = i60;
                        fM3783 = fM3783;
                        i48 = i48;
                        i46 = i;
                        c14795 = c14795;
                    } else {
                        c14793 = c14795;
                        fM3783 = fM3783;
                        i14 = i48;
                        i15 = iM28026;
                        i16 = iM11931;
                        paint = paint3;
                        iM6981 = (i44 - C2105.m6981("ܽۗ")) * 123;
                        i17 = ((iM6981 ^ i43) * 28143) ^ (-1860821257);
                        i18 = -420923025;
                        i19 = iM6981 ^ i18;
                        iM11931 = i16;
                        i48 = i14;
                        i45 = i17;
                        i49 = i60;
                        c14795 = c14793;
                        iM28026 = i15;
                        paint3 = paint;
                        i46 = i19;
                        fM3783 = fM3783;
                    }
                    break;
                case -1899415591:
                case -327691288:
                    i60 = i60;
                    fM3783 = fM3783;
                    i48 = i48;
                    i2 = iM28026;
                    i4 = iM11931;
                    i5 = i58;
                    i6 = i59;
                    f = f2;
                    super.draw(canvas);
                    boolean z5 = this.f28866;
                    z4 = false;
                    c14792 = this.f28846;
                    if (z5) {
                        iM2566 = (C0630.m2566("᩵ܳ") + i43) * 39;
                        i7 = ((iM2566 ^ i44) * (-12471)) ^ 2034679806;
                        i8 = -1874198903;
                    } else {
                        iM2566 = (i44 - C2105.m6981("ۤ᩵")) * 57;
                        i7 = ((iM2566 ^ i43) * (-29039)) ^ 393391547;
                        i8 = -601765598;
                    }
                    int i61 = iM2566 ^ i8;
                    i59 = i6;
                    i58 = i5;
                    i48 = i48;
                    c14795 = c14792;
                    f2 = f;
                    iM11931 = i4;
                    i49 = i60;
                    i46 = i61;
                    i45 = i7;
                    iM28026 = i2;
                    fM3783 = fM3783;
                    break;
                case -1895637014:
                case 772050115:
                    i60 = i60;
                    c14795 = c14795;
                    fM3783 = fM3783;
                    i48 = i48;
                    i24 = i58;
                    i25 = i59;
                    paint3 = new Paint();
                    iM11931 = C3911.m11931(this);
                    iM28026 = C11340.m28026(this);
                    if (this.f28867) {
                        iM6982 = C0630.m2566("ۖۜ") ^ i43;
                        i26 = ((iM6982 ^ i44) * (-2261)) ^ (-1400267984);
                        i27 = -1204083454;
                    } else {
                        iM6982 = (C2105.m6981("᩶ۚ") ^ i43) * (-91);
                        i26 = ((iM6982 ^ i44) * 31339) ^ 2072060181;
                        i27 = 1768522991;
                    }
                    int i62 = iM6982 ^ i27;
                    i59 = i25;
                    i58 = i24;
                    i49 = i60;
                    i46 = i62;
                    i48 = i48;
                    i45 = i26;
                    fM3783 = fM3783;
                    c14795 = c14795;
                    break;
                case -1805166535:
                case 1241899970:
                    i60 = i60;
                    c14795 = c14795;
                    fM3783 = fM3783;
                    i48 = i48;
                    i2 = iM28026;
                    i21 = iM11931;
                    i5 = i58;
                    i6 = i59;
                    if (i47 <= 0) {
                        i4 = i21;
                        f = f2;
                        z = z4;
                        iM2567 = (C2105.m6981("᩷۠") ^ i43) * (-107);
                        i9 = ((iM2567 ^ i44) * (-4787)) ^ (-410197006);
                        i10 = -2081635000;
                        i28 = iM2567 ^ i10;
                        i59 = i6;
                        i58 = i5;
                        z4 = z;
                        i48 = i48;
                        iM28026 = i2;
                        fM3783 = fM3783;
                        c14795 = c14795;
                        i36 = i60;
                        i46 = i28;
                        i45 = i9;
                        f2 = f;
                        iM11931 = i4;
                        i49 = i36;
                    } else {
                        iM2569 = (i43 - C0630.m2566("ܺᩴ")) * (-37);
                        i22 = ((iM2569 ^ i44) * 9729) ^ (-675501416);
                        i23 = 1085399474;
                        i29 = iM2569 ^ i23;
                        i59 = i6;
                        i58 = i5;
                        i49 = i60;
                        i48 = i48;
                        i46 = i29;
                        c14795 = c14795;
                        iM28026 = i2;
                        fM3783 = fM3783;
                        int i63 = i22;
                        iM11931 = i21;
                        i45 = i63;
                    }
                    break;
                case -1602493766:
                case 734749076:
                    i60 = i60;
                    c14795 = c14795;
                    fM3783 = fM3783;
                    i48 = i48;
                    i2 = iM28026;
                    i21 = iM11931;
                    i5 = i58;
                    i6 = i59;
                    if (this.f28857) {
                        iM2569 = C0630.m2566("᩻۬") ^ i44;
                        i22 = ((iM2569 ^ i43) * (-7977)) ^ 522923934;
                        i23 = 1898092484;
                    } else {
                        iM2569 = (C2105.m6981("ۗܺ") ^ i43) * (-49);
                        i22 = ((iM2569 ^ i44) * (-11681)) ^ 1758853359;
                        i23 = 415881842;
                    }
                    i29 = iM2569 ^ i23;
                    i59 = i6;
                    i58 = i5;
                    i49 = i60;
                    i48 = i48;
                    i46 = i29;
                    c14795 = c14795;
                    iM28026 = i2;
                    fM3783 = fM3783;
                    int i64 = i22;
                    iM11931 = i21;
                    i45 = i64;
                    break;
                case -1596658081:
                case 1469739733:
                    i60 = i60;
                    c14795 = c14795;
                    fM3783 = fM3783;
                    i48 = i48;
                    i2 = iM28026;
                    i21 = iM11931;
                    i6 = i59;
                    postInvalidateOnAnimation();
                    i5 = i58;
                    iM2569 = (C2105.m6981("ۗܺ") ^ i43) * (-49);
                    i22 = ((iM2569 ^ i44) * (-11681)) ^ 1758853359;
                    i23 = 415881842;
                    i29 = iM2569 ^ i23;
                    i59 = i6;
                    i58 = i5;
                    i49 = i60;
                    i48 = i48;
                    i46 = i29;
                    c14795 = c14795;
                    iM28026 = i2;
                    fM3783 = fM3783;
                    int i65 = i22;
                    iM11931 = i21;
                    i45 = i65;
                    break;
                case -1504038735:
                case 2038663760:
                    i60 = i60;
                    c14795 = c14795;
                    fM3783 = fM3783;
                    i48 = i48;
                    i2 = iM28026;
                    i4 = iM11931;
                    z = z4;
                    i5 = i58;
                    i6 = i59;
                    f = f2;
                    if (f5 > f8) {
                        iM2567 = C0630.m2566("᩵֨") ^ i43;
                        i9 = ((iM2567 ^ i44) * 30247) ^ 1247917666;
                        i10 = 1081125299;
                        i28 = iM2567 ^ i10;
                        i59 = i6;
                        i58 = i5;
                        z4 = z;
                        i48 = i48;
                        iM28026 = i2;
                        fM3783 = fM3783;
                        c14795 = c14795;
                        i36 = i60;
                        i46 = i28;
                        i45 = i9;
                        f2 = f;
                        iM11931 = i4;
                        i49 = i36;
                    } else {
                        z4 = z;
                        c14792 = c14795;
                        iM2566 = (i44 - C2105.m6981("ۤ᩵")) * 57;
                        i7 = ((iM2566 ^ i43) * (-29039)) ^ 393391547;
                        i8 = -601765598;
                        int i66 = iM2566 ^ i8;
                        i59 = i6;
                        i58 = i5;
                        i48 = i48;
                        c14795 = c14792;
                        f2 = f;
                        iM11931 = i4;
                        i49 = i60;
                        i46 = i66;
                        i45 = i7;
                        iM28026 = i2;
                        fM3783 = fM3783;
                    }
                    break;
                case -1459023423:
                case 242413214:
                    C3245.m9925();
                    ServiceConnectionC3453.m10564();
                    break;
                case -1446135834:
                case -859569403:
                    i60 = i60;
                    c14795 = c14795;
                    fM3783 = fM3783;
                    i48 = i48;
                    i2 = iM28026;
                    i21 = iM11931;
                    i5 = i58;
                    i6 = i59;
                    if (i5 > 1500) {
                        iM2569 = C2105.m6981("᩹ܺ") ^ i44;
                        i22 = ((iM2569 ^ i43) * (-15327)) ^ 251374676;
                        i23 = -1636454567;
                        i29 = iM2569 ^ i23;
                        i59 = i6;
                        i58 = i5;
                        i49 = i60;
                        i48 = i48;
                        i46 = i29;
                        c14795 = c14795;
                        iM28026 = i2;
                        fM3783 = fM3783;
                        int i67 = i22;
                        iM11931 = i21;
                        i45 = i67;
                    } else {
                        i4 = i21;
                        f = f2;
                        z = z4;
                        f5 = f4;
                        iM2567 = C0630.m2566("ۨܳ") ^ i44;
                        i9 = ((iM2567 ^ i43) * 19385) ^ 1144837511;
                        i10 = 1597540827;
                        i28 = iM2567 ^ i10;
                        i59 = i6;
                        i58 = i5;
                        z4 = z;
                        i48 = i48;
                        iM28026 = i2;
                        fM3783 = fM3783;
                        c14795 = c14795;
                        i36 = i60;
                        i46 = i28;
                        i45 = i9;
                        f2 = f;
                        iM11931 = i4;
                        i49 = i36;
                    }
                    break;
                case -1238483347:
                case 515232424:
                    i60 = i60;
                    c14795 = c14795;
                    fM3783 = fM3783;
                    i48 = i48;
                    i2 = iM28026;
                    i3 = iM11931;
                    Paint paint4 = paint3;
                    float f13 = this.f28858;
                    f7 = f13 * f5;
                    if (C2105.m6982() == 0) {
                        int iM6986 = C2105.m6981("֡ۛ") ^ i44;
                        int i68 = ((iM6986 ^ i43) * 16437) ^ (-880992102);
                        i33 = iM6986 ^ 1133854977;
                        iM11931 = i3;
                        f6 = f13;
                        i45 = i68;
                        i49 = i60;
                        paint3 = paint4;
                        iM28026 = i2;
                        i46 = i33;
                        fM3783 = fM3783;
                        i48 = i48;
                        c14795 = c14795;
                    } else {
                        f6 = f13;
                        paint3 = paint4;
                        iM6983 = C0630.m2566("֨ۨ") ^ i43;
                        i31 = ((iM6983 ^ i44) * (-4339)) ^ 725679497;
                        i32 = 78983078;
                        i = iM6983 ^ i32;
                        iM11931 = i3;
                        iM28026 = i2;
                        i45 = i31;
                        i49 = i60;
                        fM3783 = fM3783;
                        i48 = i48;
                        i46 = i;
                        c14795 = c14795;
                    }
                    break;
                case -1196537102:
                case 1697524379:
                    c14795 = c14795;
                    float f14 = fM3783;
                    i48 = i48;
                    int i69 = iM28026;
                    int i70 = iM11931;
                    f3 = i70;
                    f9 = f3 - f7;
                    f10 = i69;
                    paint2 = paint3;
                    canvas.drawRect(f9, 0.0f, f3, f10, paint2);
                    if (this.f28867) {
                        iM25610 = (i43 - C0630.m2566("۫᩶")) * (-115);
                        i34 = ((iM25610 ^ i44) * 30515) ^ 1538122266;
                        i35 = 619611811;
                    } else {
                        iM25610 = (C0630.m2566("ܳᩳ") ^ i43) * (-31);
                        i34 = ((iM25610 ^ i44) * 16401) ^ 1006463626;
                        i35 = -885101409;
                    }
                    i = iM25610 ^ i35;
                    iM11931 = i70;
                    iM28026 = i69;
                    i45 = i34;
                    i49 = i60;
                    fM3783 = f14;
                    paint3 = paint2;
                    i48 = i48;
                    i46 = i;
                    c14795 = c14795;
                    break;
                case -1194505608:
                case 504574096:
                    i60 = i60;
                    c14795 = c14795;
                    fM3783 = fM3783;
                    i2 = iM28026;
                    i21 = iM11931;
                    i6 = i59;
                    i5 = i58;
                    i48 = i5 - 1500;
                    if (i48 >= 300) {
                        i4 = i21;
                        f = f2;
                        i58 = i5;
                        z2 = z4;
                        i48 = i48;
                        int iM25613 = (C0630.m2566("ۙܿ") + i43) * (-95);
                        i9 = ((iM25613 ^ i44) * (-18593)) ^ 1999462179;
                        i28 = iM25613 ^ 1268294579;
                        i59 = i6;
                        z4 = z2;
                        c14795 = c14795;
                        iM28026 = i2;
                        fM3783 = fM3783;
                        i36 = i60;
                        i46 = i28;
                        i45 = i9;
                        f2 = f;
                        iM11931 = i4;
                        i49 = i36;
                    } else {
                        iM2569 = C0630.m2566("᩻֡") ^ i44;
                        i22 = ((iM2569 ^ i43) * 12001) ^ (-219495951);
                        i23 = 69612646;
                        i29 = iM2569 ^ i23;
                        i59 = i6;
                        i58 = i5;
                        i49 = i60;
                        i48 = i48;
                        i46 = i29;
                        c14795 = c14795;
                        iM28026 = i2;
                        fM3783 = fM3783;
                        int i610 = i22;
                        iM11931 = i21;
                        i45 = i610;
                    }
                    break;
                case -1042352598:
                case 580833312:
                    i60 = i60;
                    c14795 = c14795;
                    fM3783 = fM3783;
                    i48 = i48;
                    int i71 = iM28026;
                    f5 = f4 - (i48 / 300.0f);
                    i4 = iM11931;
                    f = f2;
                    z = z4;
                    i5 = i58;
                    i6 = i59;
                    i2 = i71;
                    iM2567 = C0630.m2566("ۨܳ") ^ i44;
                    i9 = ((iM2567 ^ i43) * 19385) ^ 1144837511;
                    i10 = 1597540827;
                    i28 = iM2567 ^ i10;
                    i59 = i6;
                    i58 = i5;
                    z4 = z;
                    i48 = i48;
                    iM28026 = i2;
                    fM3783 = fM3783;
                    c14795 = c14795;
                    i36 = i60;
                    i46 = i28;
                    i45 = i9;
                    f2 = f;
                    iM11931 = i4;
                    i49 = i36;
                    break;
                case -857631094:
                case 96654508:
                    c14794 = c14795;
                    i20 = iM28026;
                    z3 = z4;
                    this.f28857 = z3;
                    c14794.m35174();
                    int iM6987 = C2105.m6981("ܳ۠") ^ i44;
                    i4 = iM11931;
                    i45 = ((iM6987 ^ i43) * 13105) ^ 1914346238;
                    i59 = i59;
                    i58 = i58;
                    z4 = z3;
                    i48 = i48;
                    iM28026 = i20;
                    fM3783 = fM3783;
                    c14795 = c14794;
                    i36 = i60;
                    i46 = iM6987 ^ (-2034181513);
                    iM11931 = i4;
                    i49 = i36;
                    break;
                case -846573939:
                case 906885161:
                    i11 = C21943.f70257;
                    i54 = i11;
                    iM2568 = (C2105.m6981("ۛܺ") ^ i44) * (-9);
                    i12 = ((iM2568 ^ i43) * (-10753)) ^ 1634126462;
                    i13 = -801020623;
                    i19 = iM2568 ^ i13;
                    iM11931 = iM11931;
                    i48 = i48;
                    i45 = i12;
                    i49 = i60;
                    c14795 = c14795;
                    iM28026 = iM28026;
                    i46 = i19;
                    fM3783 = fM3783;
                    break;
                case -734564245:
                case 32368699:
                    i60 = i60;
                    break;
                case -630053008:
                case 654817121:
                    break;
                case -474971478:
                case 1932372920:
                    i60 = i60;
                    c14795 = c14795;
                    fM3783 = fM3783;
                    i48 = i48;
                    iM28026 = iM28026;
                    iM11931 = iM11931;
                    i55 = i54 & i51;
                    i56 = i54 >>> 24;
                    i57 = 255;
                    if (C2126.f7087) {
                        iM2568 = (C0630.m2566("ۨ᩵") ^ i44) * 35;
                        i12 = ((iM2568 ^ i43) * (-26095)) ^ (-644283018);
                        i13 = 1541400167;
                    } else {
                        iM2568 = C0630.m2566("֡᩸") ^ i43;
                        i12 = ((iM2568 ^ i44) * (-12203)) ^ 1902497674;
                        i13 = -828574793;
                    }
                    i19 = iM2568 ^ i13;
                    iM11931 = iM11931;
                    i48 = i48;
                    i45 = i12;
                    i49 = i60;
                    c14795 = c14795;
                    iM28026 = iM28026;
                    i46 = i19;
                    fM3783 = fM3783;
                    break;
                case -460160774:
                case 1854890671:
                    i60 = i60;
                    c14795 = c14795;
                    fM3783 = fM3783;
                    i48 = i48;
                    i2 = iM28026;
                    i3 = iM11931;
                    i52 = i50 & i51;
                    i59 = i50 >>> 24;
                    if (AbstractC2021.m6574()) {
                        iM6983 = C0630.m2566("֨ۨ") ^ i43;
                        i31 = ((iM6983 ^ i44) * (-4339)) ^ 725679497;
                        i32 = 78983078;
                    } else {
                        iM6983 = (C2105.m6981("ۨܰ") ^ i43) * (-53);
                        i31 = ((iM6983 ^ i44) * (-14979)) ^ (-427205692);
                        i32 = 1906542133;
                    }
                    i = iM6983 ^ i32;
                    iM11931 = i3;
                    iM28026 = i2;
                    i45 = i31;
                    i49 = i60;
                    fM3783 = fM3783;
                    i48 = i48;
                    i46 = i;
                    c14795 = c14795;
                    break;
                case -433621071:
                case -115417804:
                    i60 = i60;
                    AbstractC2021.m6574();
                    if (C1420.f5096 > 0) {
                        c14795 = c14795;
                        fM3783 = fM3783;
                        i48 = i48;
                        i2 = iM28026;
                        i21 = iM11931;
                        i30 = i59;
                        iM6985 = (i43 - C2105.m6981("ۤۜ")) * 7;
                        i41 = ((iM6985 ^ i44) * (-22169)) ^ (-1458744155);
                        i42 = 806674408;
                        i33 = iM6985 ^ i42;
                        iM11931 = i21;
                        i59 = i30;
                        i45 = i41;
                        i49 = i60;
                        iM28026 = i2;
                        i46 = i33;
                        fM3783 = fM3783;
                        i48 = i48;
                        c14795 = c14795;
                    } else {
                        c14795 = c14795;
                        fM3783 = fM3783;
                        i48 = i48;
                        iM28026 = iM28026;
                        iM11931 = iM11931;
                        iM2568 = C2105.m6981("ۜۡ") ^ i44;
                        i12 = ((iM2568 ^ i43) * 7579) ^ 1411386647;
                        i13 = -1884154748;
                        i19 = iM2568 ^ i13;
                        iM11931 = iM11931;
                        i48 = i48;
                        i45 = i12;
                        i49 = i60;
                        c14795 = c14795;
                        iM28026 = iM28026;
                        i46 = i19;
                        fM3783 = fM3783;
                    }
                    break;
                case -411046508:
                case 2095103212:
                    i60 = i60;
                    if (C1294.f4556 < 0) {
                        c14795 = c14795;
                        i48 = i48;
                        i37 = iM28026;
                        i38 = iM11931;
                        paint2 = paint3;
                        iM6984 = C2105.m6981("ܿ۬") ^ i44;
                        i39 = ((iM6984 ^ i43) * (-16459)) ^ 182688332;
                        i40 = -570300586;
                        i = iM6984 ^ i40;
                        iM11931 = i38;
                        i45 = i39;
                        i49 = i60;
                        iM28026 = i37;
                        paint3 = paint2;
                        i48 = i48;
                        i46 = i;
                        c14795 = c14795;
                    } else {
                        int iM25614 = C0630.m2566("۠۟") ^ i43;
                        i49 = i60;
                        i46 = iM25614 ^ (-690513431);
                        i45 = ((iM25614 ^ i44) * 6223) ^ 332281433;
                    }
                    break;
                case -120046254:
                case 1742029597:
                    i60 = i60;
                    c14795 = c14795;
                    fM3783 = fM3783;
                    i48 = i48;
                    i2 = iM28026;
                    i21 = iM11931;
                    i30 = i59;
                    int i72 = (int) ((i30 & 255) * f5);
                    if (C4616.m13552() == 0) {
                        int iM25615 = C0630.m2566("ۗۧ") ^ i44;
                        i22 = ((iM25615 ^ i43) * (-5749)) ^ 518259223;
                        i29 = iM25615 ^ (-645888410);
                        i59 = i30;
                        i53 = i72;
                        i49 = i60;
                        i48 = i48;
                        i46 = i29;
                        c14795 = c14795;
                        iM28026 = i2;
                        fM3783 = fM3783;
                        int i611 = i22;
                        iM11931 = i21;
                        i45 = i611;
                    } else {
                        i53 = i72;
                        iM6985 = (i44 - C0630.m2566("۬ᩳ")) * (-85);
                        i41 = ((iM6985 ^ i43) * 29123) ^ 2107451986;
                        i42 = 1594862975;
                        i33 = iM6985 ^ i42;
                        iM11931 = i21;
                        i59 = i30;
                        i45 = i41;
                        i49 = i60;
                        iM28026 = i2;
                        i46 = i33;
                        fM3783 = fM3783;
                        i48 = i48;
                        c14795 = c14795;
                    }
                    break;
                case -42887094:
                case 218158694:
                    i60 = i60;
                    RunnableC0588.m2441();
                    if (C1294.f4556 >= 0) {
                        c14795 = c14795;
                        fM3783 = fM3783;
                        i48 = i48;
                        i2 = iM28026;
                        i21 = iM11931;
                        i30 = i59;
                        iM6985 = (i44 - C0630.m2566("۬ᩳ")) * (-85);
                        i41 = ((iM6985 ^ i43) * 29123) ^ 2107451986;
                        i42 = 1594862975;
                        i33 = iM6985 ^ i42;
                        iM11931 = i21;
                        i59 = i30;
                        i45 = i41;
                        i49 = i60;
                        iM28026 = i2;
                        i46 = i33;
                        fM3783 = fM3783;
                        i48 = i48;
                        c14795 = c14795;
                    } else {
                        int iM25616 = C0630.m2566("۠۟") ^ i43;
                        i49 = i60;
                        i46 = iM25616 ^ (-690513431);
                        i45 = ((iM25616 ^ i44) * 6223) ^ 332281433;
                    }
                    break;
                case -12877226:
                case 738842414:
                    i60 = i60;
                    c14795 = c14795;
                    fM3783 = fM3783;
                    i48 = i48;
                    i2 = iM28026;
                    i3 = iM11931;
                    paint3.setColor((i53 << 24) | i52);
                    if (C2126.f7087) {
                        iM6983 = C0630.m2566("ۙۛ") ^ i44;
                        i31 = ((iM6983 ^ i43) * (-26203)) ^ (-1287607074);
                        i32 = -1063488941;
                    } else {
                        iM6983 = (C2105.m6981("۫ᩳ") ^ i43) * 33;
                        i31 = ((iM6983 ^ i44) * (-13701)) ^ 1410673426;
                        i32 = -295471112;
                    }
                    i = iM6983 ^ i32;
                    iM11931 = i3;
                    iM28026 = i2;
                    i45 = i31;
                    i49 = i60;
                    fM3783 = fM3783;
                    i48 = i48;
                    i46 = i;
                    c14795 = c14795;
                    break;
                case 2449558:
                case 738931541:
                    float f15 = (int) fM3783;
                    float f16 = f15 + f11;
                    c14795.m35175(f3 - f6, f15, f3, f16);
                    c14794 = c14795;
                    int i73 = iM28026;
                    Paint paint5 = paint3;
                    canvas.drawRect(f9, f15, f3, f16, paint5);
                    z3 = z4;
                    i20 = i73;
                    paint3 = paint5;
                    int iM6988 = C2105.m6981("ܳ۠") ^ i44;
                    i4 = iM11931;
                    i45 = ((iM6988 ^ i43) * 13105) ^ 1914346238;
                    i59 = i59;
                    i58 = i58;
                    z4 = z3;
                    i48 = i48;
                    iM28026 = i20;
                    fM3783 = fM3783;
                    c14795 = c14794;
                    i36 = i60;
                    i46 = iM6988 ^ (-2034181513);
                    iM11931 = i4;
                    i49 = i36;
                    break;
                case 24616661:
                case 1575887872:
                    i60 = i60;
                    c14795 = c14795;
                    fM3783 = fM3783;
                    i48 = i48;
                    i2 = iM28026;
                    i4 = iM11931;
                    z2 = z4;
                    i6 = i59;
                    f = f2;
                    int iM10751 = (int) (C3537.m10751() - this.f28869);
                    if (iM10751 < 0) {
                        i58 = iM10751;
                        i48 = i48;
                        int iM25617 = (C0630.m2566("ۙܿ") + i43) * (-95);
                        i9 = ((iM25617 ^ i44) * (-18593)) ^ 1999462179;
                        i28 = iM25617 ^ 1268294579;
                        i59 = i6;
                        z4 = z2;
                        c14795 = c14795;
                        iM28026 = i2;
                        fM3783 = fM3783;
                        i36 = i60;
                        i46 = i28;
                        i45 = i9;
                        f2 = f;
                        iM11931 = i4;
                        i49 = i36;
                    } else {
                        int iM25618 = (C0630.m2566("ۧܿ") ^ i44) * (-111);
                        i58 = iM10751;
                        i59 = i6;
                        z4 = z2;
                        f2 = f;
                        iM11931 = i4;
                        i49 = i60;
                        i46 = iM25618 ^ (-131251075);
                        iM28026 = i2;
                        i45 = ((iM25618 ^ i43) * (-30135)) ^ (-278026450);
                        fM3783 = fM3783;
                        i48 = i48;
                        c14795 = c14795;
                    }
                    break;
                case 60404818:
                case 1803343224:
                    i60 = i60;
                    c14795 = c14795;
                    fM3783 = fM3783;
                    i48 = i48;
                    int i74 = iM28026;
                    int i75 = iM11931;
                    int i76 = iM24354;
                    if (count / i76 <= 3.5f) {
                        i4 = i75;
                        iM24354 = i76;
                        z = z4;
                        i5 = i58;
                        i6 = i59;
                        i2 = i74;
                        f = f2;
                        iM2567 = (C2105.m6981("᩷۠") ^ i43) * (-107);
                        i9 = ((iM2567 ^ i44) * (-4787)) ^ (-410197006);
                        i10 = -2081635000;
                        i28 = iM2567 ^ i10;
                        i59 = i6;
                        i58 = i5;
                        z4 = z;
                        i48 = i48;
                        iM28026 = i2;
                        fM3783 = fM3783;
                        c14795 = c14795;
                        i36 = i60;
                        i46 = i28;
                        i45 = i9;
                        f2 = f;
                        iM11931 = i4;
                        i49 = i36;
                    } else {
                        iM24354 = i76;
                        i24 = i58;
                        i25 = i59;
                        iM28026 = i74;
                        iM11931 = i75;
                        iM6982 = C0630.m2566("ۖۜ") ^ i43;
                        i26 = ((iM6982 ^ i44) * (-2261)) ^ (-1400267984);
                        i27 = -1204083454;
                        int i612 = iM6982 ^ i27;
                        i59 = i25;
                        i58 = i24;
                        i49 = i60;
                        i46 = i612;
                        i48 = i48;
                        i45 = i26;
                        fM3783 = fM3783;
                        c14795 = c14795;
                    }
                    break;
                case 237186788:
                case 1136586197:
                    this.f28857 = z4;
                    c14795.m35174();
                    break;
                case 273199840:
                case 1037724588:
                    if (C0714.f2697 >= 0) {
                        i60 = i60;
                        c14795 = c14795;
                        fM3783 = fM3783;
                        i48 = i48;
                        i2 = iM28026;
                        i3 = iM11931;
                        iM6983 = C0630.m2566("֨ۨ") ^ i43;
                        i31 = ((iM6983 ^ i44) * (-4339)) ^ 725679497;
                        i32 = 78983078;
                        i = iM6983 ^ i32;
                        iM11931 = i3;
                        iM28026 = i2;
                        i45 = i31;
                        i49 = i60;
                        fM3783 = fM3783;
                        i48 = i48;
                        i46 = i;
                        c14795 = c14795;
                    } else {
                        int iM25619 = (C0630.m2566("۬ۢ") + i43) * (-21);
                        i45 = ((iM25619 ^ i44) * (-7361)) ^ 31842083;
                        i49 = i60;
                        i46 = iM25619 ^ 1584424599;
                    }
                    break;
                case 502870965:
                case 888300280:
                    i60 = i60;
                    c14795 = c14795;
                    fM3783 = fM3783;
                    i48 = i48;
                    iM28026 = iM28026;
                    iM11931 = iM11931;
                    paint3.setColor(i55 | (((int) f2) << 24));
                    float f17 = this.f28851;
                    if (C3911.f12484 < 0) {
                        int iM6989 = (i44 - C2105.m6981("ܶۡ")) * 65;
                        int i77 = ((iM6989 ^ i43) * 2809) ^ (-1390939339);
                        i = iM6989 ^ (-1291692762);
                        iM11931 = iM11931;
                        f11 = f17;
                        i45 = i77;
                        i49 = i60;
                        fM3783 = fM3783;
                        iM28026 = iM28026;
                        i48 = i48;
                        i46 = i;
                        c14795 = c14795;
                    } else {
                        f11 = f17;
                        iM2568 = (C0630.m2566("ۨ᩵") ^ i44) * 35;
                        i12 = ((iM2568 ^ i43) * (-26095)) ^ (-644283018);
                        i13 = 1541400167;
                        i19 = iM2568 ^ i13;
                        iM11931 = iM11931;
                        i48 = i48;
                        i45 = i12;
                        i49 = i60;
                        c14795 = c14795;
                        iM28026 = iM28026;
                        i46 = i19;
                        fM3783 = fM3783;
                    }
                    break;
                case 535075022:
                case 1719359667:
                    i60 = i60;
                    c14793 = c14795;
                    fM3783 = fM3783;
                    i14 = i48;
                    i15 = iM28026;
                    i16 = iM11931;
                    paint = paint3;
                    f12 = (f10 - f11) / i47;
                    firstVisiblePosition = getFirstVisiblePosition();
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = (i44 - C2105.m6981("ܽۗ")) * 123;
                        i17 = ((iM6981 ^ i43) * 28143) ^ (-1860821257);
                        i18 = -420923025;
                    } else {
                        iM6981 = C2105.m6981("۠ۘ") ^ i43;
                        i17 = ((iM6981 ^ i44) * 21035) ^ (-430592472);
                        i18 = -711379033;
                    }
                    i19 = iM6981 ^ i18;
                    iM11931 = i16;
                    i48 = i14;
                    i45 = i17;
                    i49 = i60;
                    c14795 = c14793;
                    iM28026 = i15;
                    paint3 = paint;
                    i46 = i19;
                    fM3783 = fM3783;
                    break;
                case 796413277:
                case 1540814402:
                    i60 = i60;
                    c14795 = c14795;
                    i48 = i48;
                    i37 = iM28026;
                    i38 = iM11931;
                    paint2 = paint3;
                    fM3783 = RunnableC1108.m3783(i47, firstVisiblePosition) * f12;
                    if (C3683.f11629 >= 0) {
                        iM6984 = C2105.m6981("ܿ۬") ^ i44;
                        i39 = ((iM6984 ^ i43) * (-16459)) ^ 182688332;
                        i40 = -570300586;
                    } else {
                        iM6984 = (i43 - C2105.m6981("᩸᩵")) * 91;
                        i39 = ((iM6984 ^ i44) * (-19155)) ^ 1212157411;
                        i40 = -1798023946;
                    }
                    i = iM6984 ^ i40;
                    iM11931 = i38;
                    i45 = i39;
                    i49 = i60;
                    iM28026 = i37;
                    paint3 = paint2;
                    i48 = i48;
                    i46 = i;
                    c14795 = c14795;
                    break;
                case 913630681:
                case 1359963488:
                    i60 = i60;
                    c14795 = c14795;
                    fM3783 = fM3783;
                    i48 = i48;
                    i2 = iM28026;
                    i21 = iM11931;
                    i30 = i59;
                    this.f28857 = true;
                    int i78 = this.f28872;
                    i51 = 16777215;
                    if (!C1504.m5179()) {
                        i50 = i78;
                        iM6985 = (i43 - C2105.m6981("ۤۜ")) * 7;
                        i41 = ((iM6985 ^ i44) * (-22169)) ^ (-1458744155);
                        i42 = 806674408;
                        i33 = iM6985 ^ i42;
                        iM11931 = i21;
                        i59 = i30;
                        i45 = i41;
                        i49 = i60;
                        iM28026 = i2;
                        i46 = i33;
                        fM3783 = fM3783;
                        i48 = i48;
                        c14795 = c14795;
                    } else {
                        int iM25620 = C0630.m2566("᩹۟") ^ i44;
                        i22 = ((iM25620 ^ i43) * (-12493)) ^ (-1147496844);
                        i29 = iM25620 ^ (-1037408836);
                        i59 = i30;
                        i50 = i78;
                        i49 = i60;
                        i48 = i48;
                        i46 = i29;
                        c14795 = c14795;
                        iM28026 = i2;
                        fM3783 = fM3783;
                        int i613 = i22;
                        iM11931 = i21;
                        i45 = i613;
                    }
                    break;
                case 1013968239:
                case 1052965684:
                    i60 = i60;
                    c14795 = c14795;
                    fM3783 = fM3783;
                    i48 = i48;
                    i2 = iM28026;
                    i4 = iM11931;
                    z = z4;
                    i5 = i58;
                    i6 = i59;
                    f = f2;
                    f8 = 0.0f;
                    f4 = 1.0f;
                    if (this.f28867) {
                        f5 = f4;
                        iM2567 = C0630.m2566("ۨܳ") ^ i44;
                        i9 = ((iM2567 ^ i43) * 19385) ^ 1144837511;
                        i10 = 1597540827;
                    } else {
                        iM2567 = (C0630.m2566("ۧܺ") + i43) * (-123);
                        i9 = ((iM2567 ^ i44) * 27667) ^ (-1687531454);
                        i10 = -1055772051;
                    }
                    i28 = iM2567 ^ i10;
                    i59 = i6;
                    i58 = i5;
                    z4 = z;
                    i48 = i48;
                    iM28026 = i2;
                    fM3783 = fM3783;
                    c14795 = c14795;
                    i36 = i60;
                    i46 = i28;
                    i45 = i9;
                    f2 = f;
                    iM11931 = i4;
                    i49 = i36;
                    break;
                case 1025832271:
                case 1585848061:
                    i60 = i60;
                    c14795 = c14795;
                    fM3783 = fM3783;
                    i48 = i48;
                    i2 = iM28026;
                    i4 = iM11931;
                    z = z4;
                    i5 = i58;
                    i6 = i59;
                    f = f2;
                    if (m24347()) {
                        f5 = f4;
                        iM2567 = C0630.m2566("ۨܳ") ^ i44;
                        i9 = ((iM2567 ^ i43) * 19385) ^ 1144837511;
                        i10 = 1597540827;
                    } else {
                        iM2567 = C2105.m6981("ܶ֨") ^ i44;
                        i9 = ((iM2567 ^ i43) * (-23347)) ^ (-741018954);
                        i10 = 667723047;
                    }
                    i28 = iM2567 ^ i10;
                    i59 = i6;
                    i58 = i5;
                    z4 = z;
                    i48 = i48;
                    iM28026 = i2;
                    fM3783 = fM3783;
                    c14795 = c14795;
                    i36 = i60;
                    i46 = i28;
                    i45 = i9;
                    f2 = f;
                    iM11931 = i4;
                    i49 = i36;
                    break;
                case 1087578461:
                case 1735837477:
                    i60 = i60;
                    c14795 = c14795;
                    fM3783 = fM3783;
                    i48 = i48;
                    iM28026 = iM28026;
                    iM11931 = iM11931;
                    f2 = (i56 & i57) * f5;
                    if (C11340.f33930 >= 0) {
                        iM2568 = C2105.m6981("ۜۡ") ^ i44;
                        i12 = ((iM2568 ^ i43) * 7579) ^ 1411386647;
                        i13 = -1884154748;
                    } else {
                        iM2568 = C2105.m6981("ܺۖ") ^ i44;
                        i12 = ((iM2568 ^ i43) * 17983) ^ 2087449970;
                        i13 = 994184105;
                    }
                    i19 = iM2568 ^ i13;
                    iM11931 = iM11931;
                    i48 = i48;
                    i45 = i12;
                    i49 = i60;
                    c14795 = c14795;
                    iM28026 = iM28026;
                    i46 = i19;
                    fM3783 = fM3783;
                    break;
                case 1293329708:
                case 1486379019:
                    i60 = i60;
                    if (C3663.m11168() >= 0) {
                        c14795 = c14795;
                        fM3783 = fM3783;
                        i48 = i48;
                        i2 = iM28026;
                        i3 = iM11931;
                        iM6983 = C0630.m2566("֨ۨ") ^ i43;
                        i31 = ((iM6983 ^ i44) * (-4339)) ^ 725679497;
                        i32 = 78983078;
                        i = iM6983 ^ i32;
                        iM11931 = i3;
                        iM28026 = i2;
                        i45 = i31;
                        i49 = i60;
                        fM3783 = fM3783;
                        i48 = i48;
                        i46 = i;
                        c14795 = c14795;
                    } else {
                        c14795 = c14795;
                        fM3783 = fM3783;
                        i48 = i48;
                        iM28026 = iM28026;
                        iM11931 = iM11931;
                        iM2568 = C2105.m6981("ۜۡ") ^ i44;
                        i12 = ((iM2568 ^ i43) * 7579) ^ 1411386647;
                        i13 = -1884154748;
                        i19 = iM2568 ^ i13;
                        iM11931 = iM11931;
                        i48 = i48;
                        i45 = i12;
                        i49 = i60;
                        c14795 = c14795;
                        iM28026 = iM28026;
                        i46 = i19;
                        fM3783 = fM3783;
                    }
                    break;
                case 1521947598:
                case 2076932912:
                    i60 = i60;
                    c14795 = c14795;
                    fM3783 = fM3783;
                    i48 = i48;
                    i2 = iM28026;
                    i5 = i58;
                    i6 = i59;
                    f5 = 0.0f;
                    i4 = iM11931;
                    f = f2;
                    z = z4;
                    iM2567 = C0630.m2566("ۨܳ") ^ i44;
                    i9 = ((iM2567 ^ i43) * 19385) ^ 1144837511;
                    i10 = 1597540827;
                    i28 = iM2567 ^ i10;
                    i59 = i6;
                    i58 = i5;
                    z4 = z;
                    i48 = i48;
                    iM28026 = i2;
                    fM3783 = fM3783;
                    c14795 = c14795;
                    i36 = i60;
                    i46 = i28;
                    i45 = i9;
                    f2 = f;
                    iM11931 = i4;
                    i49 = i36;
                    break;
                case 2027350123:
                case 2101203981:
                    i60 = i60;
                    C1773.m5908();
                    c14795 = c14795;
                    fM3783 = fM3783;
                    i48 = i48;
                    iM28026 = iM28026;
                    iM11931 = iM11931;
                    iM2568 = C2105.m6981("ۜۡ") ^ i44;
                    i12 = ((iM2568 ^ i43) * 7579) ^ 1411386647;
                    i13 = -1884154748;
                    i19 = iM2568 ^ i13;
                    iM11931 = iM11931;
                    i48 = i48;
                    i45 = i12;
                    i49 = i60;
                    c14795 = c14795;
                    iM28026 = iM28026;
                    i46 = i19;
                    fM3783 = fM3783;
                    break;
                default:
                    i11 = this.f28856;
                    i54 = i11;
                    iM2568 = (C2105.m6981("ۛܺ") ^ i44) * (-9);
                    i12 = ((iM2568 ^ i43) * (-10753)) ^ 1634126462;
                    i13 = -801020623;
                    i19 = iM2568 ^ i13;
                    iM11931 = iM11931;
                    i48 = i48;
                    i45 = i12;
                    i49 = i60;
                    c14795 = c14795;
                    iM28026 = iM28026;
                    i46 = i19;
                    fM3783 = fM3783;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m24346(MotionEvent motionEvent) {
        boolean z = false;
        int iM3848 = 0;
        int i = 0;
        MotionEvent motionEventObtain = null;
        int actionIndex = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1523835526;
        int i6 = ServiceConnectionC3453.f10921;
        int i7 = C1294.f4556;
        int iM6981 = C2105.m6981("۬ܿ") ^ i7;
        int i8 = ((iM6981 ^ i6) * 1077) ^ 1502666650;
        int i9 = -10275337;
        while (true) {
            i5 = ((((i5 ^ i6) * 22185) >> 31) & i8) ^ (iM6981 ^ i9);
            switch (i5) {
                case -2037182726:
                case 1677942870:
                    if (!C2272.f7362) {
                        iM6981 = (i6 - C2105.m6981("֫᩸")) * 75;
                        i8 = ((iM6981 ^ i7) * (-21379)) ^ (-776940384);
                        i9 = 144281451;
                    } else {
                        iM6981 = (C0630.m2566("ܺۨ") + i7) * 109;
                        i8 = ((iM6981 ^ i6) * 32047) ^ 843856075;
                        i9 = 873697513;
                    }
                    break;
                case -1951705375:
                case 1226885772:
                    C2272.m7503();
                    C3537.m10746();
                    break;
                case -1950879178:
                case 1264211389:
                    C2958.m9024(this, i).setPressed(z);
                    if (C1916.f6442) {
                        iM6981 = C0630.m2566("᩺᩺") ^ i6;
                        i8 = ((iM6981 ^ i7) * 18713) ^ (-1657465973);
                        i9 = -1945870939;
                    } else {
                        iM6981 = C2105.m6981("ܿۤ") ^ i6;
                        i8 = ((iM6981 ^ i7) * 24847) ^ 1004710318;
                        i9 = -1997245789;
                    }
                    break;
                case -1787247268:
                case -1331887900:
                    motionEventObtain = MotionEvent.obtain(motionEvent);
                    actionIndex = motionEvent.getActionIndex();
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = (C2105.m6981("᩺ۢ") ^ i7) * (-47);
                        i8 = ((iM6981 ^ i6) * (-6125)) ^ (-1450952492);
                        i9 = -1782460801;
                    } else {
                        iM6981 = C2105.m6981("֫ܶ") ^ i6;
                        i8 = ((iM6981 ^ i7) * 30555) ^ 1796200442;
                        i9 = 1458162606;
                    }
                    break;
                case -1292072599:
                case -979240230:
                    z = false;
                    if (C7106.f21815 != 0) {
                        iM6981 = C2105.m6981("ܿۤ") ^ i6;
                        i8 = ((iM6981 ^ i7) * 24847) ^ 1004710318;
                        i9 = -1997245789;
                    } else {
                        iM6981 = C2105.m6981("ۨۤ") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-29927)) ^ (-1499378429);
                        i9 = -678479588;
                    }
                    break;
                case -1291553972:
                case -1207797348:
                    if (!C0964.m3413()) {
                        iM6981 = (i6 - C2105.m6981("֫᩸")) * 75;
                        i8 = ((iM6981 ^ i7) * (-21379)) ^ (-776940384);
                        i9 = 144281451;
                    } else {
                        iM6981 = (C2105.m6981("᩺ۢ") ^ i7) * (-47);
                        i8 = ((iM6981 ^ i6) * (-6125)) ^ (-1450952492);
                        i9 = -1782460801;
                    }
                    break;
                case -1177806376:
                case 1249957323:
                    if (C2272.f7362) {
                        iM6981 = (i7 - C2105.m6981("ۧܽ")) * 75;
                        i8 = ((iM6981 ^ i6) * (-1287)) ^ 620748483;
                        i9 = 410417791;
                    } else {
                        iM6981 = C0630.m2566("ᩴᩴ") ^ i7;
                        i8 = ((iM6981 ^ i6) * (-11417)) ^ 1281411794;
                        i9 = -1146810139;
                    }
                    break;
                case -1172404171:
                case -165643681:
                    i2 = 8;
                    if (C3663.f11553) {
                        iM6981 = (i7 - C2105.m6981("ۧܽ")) * 75;
                        i8 = ((iM6981 ^ i6) * (-1287)) ^ 620748483;
                        i9 = 410417791;
                    } else {
                        iM6981 = (i6 - C0630.m2566("ܿۡ")) * (-91);
                        i8 = ((iM6981 ^ i7) * 13653) ^ 2066492328;
                        i9 = 355592769;
                    }
                    break;
                case -924330912:
                case 976197063:
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    break;
                case -739552268:
                case 2082453564:
                    motionEventObtain.setAction(i3 | i4);
                    if (C2958.m9034() <= 0) {
                        iM6981 = (i7 - C2105.m6981("ۧܽ")) * 75;
                        i8 = ((iM6981 ^ i6) * (-1287)) ^ 620748483;
                        i9 = 410417791;
                    } else {
                        iM6981 = (C2105.m6981("ۙ᩻") + i6) * 11;
                        i8 = ((iM6981 ^ i7) * (-801)) ^ (-395895052);
                        i9 = 345922529;
                    }
                    break;
                case -541115772:
                case 1597699512:
                    C3663.m11168();
                    if (C3683.f11629 >= 0) {
                        iM6981 = C2105.m6981("ܿۤ") ^ i6;
                        i8 = ((iM6981 ^ i7) * 24847) ^ 1004710318;
                        i9 = -1997245789;
                    } else {
                        iM6981 = (C0630.m2566("ܺۨ") + i7) * 109;
                        i8 = ((iM6981 ^ i6) * 32047) ^ 843856075;
                        i9 = 873697513;
                    }
                    break;
                case -516248407:
                case 1065112497:
                    if (i < iM3848) {
                        iM6981 = (C0630.m2566("᩸۠") ^ i7) * (-111);
                        i8 = ((iM6981 ^ i6) * (-27911)) ^ 705923296;
                        i9 = 1386736206;
                    } else {
                        iM6981 = C2105.m6981("᩻ۡ") ^ i7;
                        i8 = ((iM6981 ^ i6) * (-9731)) ^ (-1614377583);
                        i9 = 980633777;
                    }
                    break;
                case 347007054:
                case 1395930753:
                    cancelLongPress();
                    if (C0483.f2088 >= 0) {
                        iM6981 = C2105.m6981("ܿۤ") ^ i6;
                        i8 = ((iM6981 ^ i7) * 24847) ^ 1004710318;
                        i9 = -1997245789;
                    } else {
                        iM6981 = C0630.m2566("ۤ֨") ^ i6;
                        i8 = ((iM6981 ^ i7) * 10131) ^ (-1934859906);
                        i9 = 1577822045;
                    }
                    break;
                case 463369149:
                case 1349213711:
                    if (RunnableC3474.f10992 <= 0) {
                        iM6981 = (C2105.m6981("᩺ۢ") ^ i7) * (-47);
                        i8 = ((iM6981 ^ i6) * (-6125)) ^ (-1450952492);
                        i9 = -1782460801;
                    } else {
                        iM6981 = (C0630.m2566("۬۟") + i6) * 97;
                        i8 = ((iM6981 ^ i7) * 30581) ^ 447630159;
                        i9 = -1733688015;
                    }
                    break;
                case 997724304:
                case 1378228700:
                    setPressed(z);
                    iM3848 = C1128.m3848(this);
                    i = 0;
                    iM6981 = (C2105.m6981("ۖۚ") ^ i7) * 49;
                    i8 = ((iM6981 ^ i6) * 9957) ^ 985870387;
                    i9 = 1638298902;
                    break;
                case 1022646792:
                case 1693459402:
                    C0050.m940();
                    iM6981 = (C2105.m6981("᩺ۢ") ^ i7) * (-47);
                    i8 = ((iM6981 ^ i6) * (-6125)) ^ (-1450952492);
                    i9 = -1782460801;
                    break;
                case 1391324466:
                case 2051606069:
                    if (C1005.f3721) {
                        iM6981 = C2105.m6981("ܽۜ") ^ i7;
                        i8 = ((iM6981 ^ i6) * (-20731)) ^ (-2085200409);
                        i9 = 381962444;
                    } else {
                        iM6981 = (C0630.m2566("ܺۨ") + i7) * 109;
                        i8 = ((iM6981 ^ i6) * 32047) ^ 843856075;
                        i9 = 873697513;
                    }
                    break;
                case 1626400661:
                case 2127893949:
                    i++;
                    iM6981 = (C2105.m6981("ۖۚ") ^ i7) * 49;
                    i8 = ((iM6981 ^ i6) * 9957) ^ 985870387;
                    i9 = 1638298902;
                    break;
                default:
                    i3 = actionIndex << i2;
                    i4 = 3;
                    if (C1711.m5736() <= 0) {
                        iM6981 = (i7 - C2105.m6981("ۧܽ")) * 75;
                        i8 = ((iM6981 ^ i6) * (-1287)) ^ 620748483;
                        i9 = 410417791;
                    } else {
                        iM6981 = (i7 - C2105.m6981("۟۫")) * 85;
                        i8 = ((iM6981 ^ i6) * (-18755)) ^ 1894166695;
                        i9 = 1636093655;
                    }
                    break;
            }
            return;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int iM6981;
        int i;
        int actionMasked = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        float x = 0.0f;
        float y = 0.0f;
        boolean zOnTouchEvent = false;
        int i3 = -345692787;
        int i4 = C1128.f4106;
        int i5 = C3019.f9544;
        int iM6982 = C2105.m6981("ۛᩴ") ^ i5;
        int i6 = ((iM6982 ^ i4) * (-27699)) ^ 1326867703;
        int i7 = 133365660;
        while (true) {
            int i8 = iM6982 ^ i7;
            while (true) {
                i3 = ((((i3 ^ i4) * (-3255)) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2128765816:
                    case -1279080039:
                        if (actionMasked != i2) {
                            iM6982 = C0630.m2566("ܰᩴ") ^ i4;
                            i6 = ((iM6982 ^ i5) * 13217) ^ (-1339916079);
                            i7 = 1537505154;
                            break;
                        }
                        iM6982 = C0630.m2566("֡᩶") ^ i4;
                        i6 = ((iM6982 ^ i5) * (-19047)) ^ 601013102;
                        i7 = -1252063181;
                        break;
                    case -1960656411:
                    case -1675835262:
                        if (actionMasked != i2) {
                            iM6982 = C0630.m2566("ܿܿ") ^ i5;
                            i6 = ((iM6982 ^ i4) * (-30243)) ^ (-385947560);
                            i7 = -175032037;
                            break;
                        }
                        iM6982 = C2105.m6981("ۡۜ") ^ i5;
                        i6 = ((iM6982 ^ i4) * (-3065)) ^ (-257735972);
                        i7 = -1582199264;
                        break;
                    case -1945736978:
                    case 1242294262:
                        if (!this.f28865) {
                            iM6982 = (C0630.m2566("᩸ۧ") ^ i4) * 19;
                            i6 = ((iM6982 ^ i5) * 10929) ^ 806103882;
                            i7 = -1429098819;
                            break;
                        }
                        iM6982 = C2105.m6981("᩺ܶ") ^ i5;
                        i6 = ((iM6982 ^ i4) * 19885) ^ 907044262;
                        i7 = -1261737433;
                        break;
                    case -1925363821:
                    case -1078729289:
                        C1504.m5179();
                        if (RunnableC0588.f2309 >= 0) {
                            iM6982 = C2105.m6981("᩷ۢ") ^ i4;
                            i6 = ((iM6982 ^ i5) * (-6185)) ^ 1014681927;
                            i7 = -779595851;
                            break;
                        }
                        iM6982 = C2105.m6981("᩵ۧ") ^ i5;
                        i6 = ((iM6982 ^ i4) * 5923) ^ (-1611833580);
                        i7 = -166953080;
                        break;
                    case -1916778987:
                    case 1513600517:
                        this.f28855 = z;
                        return z2;
                    case -1875962570:
                    case -637492359:
                        if (!RunnableC3474.m10630()) {
                            iM6982 = C2105.m6981("ᩴۚ") ^ i4;
                            i6 = ((iM6982 ^ i5) * (-15771)) ^ (-706056539);
                            i7 = 1269706177;
                            break;
                        }
                        iM6982 = (i5 - C0630.m2566("᩻᩵")) * 73;
                        i6 = ((iM6982 ^ i4) * (-29125)) ^ (-557953934);
                        i7 = -1974848570;
                        break;
                    case -1866436668:
                    case -930886675:
                        if (!C21923.m49329()) {
                            iM6982 = (i4 - C2105.m6981("᩻ۜ")) * (-97);
                            i6 = ((iM6982 ^ i5) * (-14275)) ^ (-1166000630);
                            i7 = 1461560431;
                            break;
                        }
                        iM6982 = (C0630.m2566("۫ܳ") + i4) * (-97);
                        i6 = ((iM6982 ^ i5) * 21255) ^ 111920062;
                        i7 = -2135425871;
                        break;
                    case -1854467969:
                    case 1658277558:
                        m24352(motionEvent);
                        this.f28855 = z;
                        if (!m24350()) {
                            iM6982 = (C0630.m2566("᩸ۧ") ^ i4) * 19;
                            i6 = ((iM6982 ^ i5) * 10929) ^ 806103882;
                            i7 = -1429098819;
                            break;
                            break;
                        }
                        iM6982 = C0630.m2566("֨ܿ") ^ i4;
                        i6 = ((iM6982 ^ i5) * 28369) ^ (-284674105);
                        i7 = -885706772;
                        break;
                    case -1853995402:
                    case -1603131604:
                        C5695.m16023();
                        if (C1420.f5096 <= 0) {
                            iM6982 = C0630.m2566("ۚ۟") ^ i5;
                            i6 = ((iM6982 ^ i4) * 7793) ^ (-419957750);
                            i7 = -22950651;
                            break;
                        }
                        iM6982 = C2105.m6981("ۢ֨") ^ i4;
                        i6 = ((iM6982 ^ i5) * (-2999)) ^ 1113818040;
                        i7 = -697820531;
                        break;
                    case -1719648795:
                    case -1109670130:
                        m24352(motionEvent);
                        return z2;
                    case -1676339305:
                    case 148385496:
                        return super.dispatchTouchEvent(motionEvent);
                    case -1653764396:
                    case -1552205256:
                        if (actionMasked == z2) {
                            iM6982 = C2105.m6981("ۙ᩷") ^ i5;
                            i6 = ((iM6982 ^ i4) * 29179) ^ (-55101070);
                            i7 = -1214852789;
                            break;
                        }
                        iM6982 = (C0630.m2566("ܽܿ") + i4) * (-63);
                        i6 = ((iM6982 ^ i5) * 28575) ^ (-1732003574);
                        i7 = 689536045;
                        break;
                    case -1646901205:
                    case 405821195:
                        return zOnTouchEvent;
                    case -1417402565:
                    case 241881125:
                        this.f28855 = z2;
                        m24340(motionEvent);
                        return z2;
                    case -1395657652:
                    case -854647551:
                        if (!C0382.f1805) {
                            iM6982 = (C0630.m2566("ۖۧ") ^ i5) * 15;
                            i6 = ((iM6982 ^ i4) * (-29207)) ^ (-1743265055);
                            i7 = -2114563766;
                            break;
                        }
                        iM6982 = C2105.m6981("᩵ۧ") ^ i5;
                        i6 = ((iM6982 ^ i4) * 5923) ^ (-1611833580);
                        i7 = -166953080;
                        break;
                        break;
                    case -1202200590:
                    case -470576403:
                        z = false;
                        z2 = true;
                        if (actionMasked != 0) {
                            iM6982 = C0630.m2566("ۘܿ") ^ i5;
                            i6 = ((iM6982 ^ i4) * 21801) ^ 893088433;
                            i7 = 542850422;
                            break;
                        }
                        iM6982 = C0630.m2566("ۗܿ") ^ i4;
                        i6 = ((iM6982 ^ i5) * 14143) ^ (-1708439463);
                        i7 = 1783861814;
                        break;
                    case -1085110526:
                    case -11593986:
                        if (C3245.f10203 > 0) {
                            iM6982 = (i5 - C0630.m2566("ۙ۫")) * 79;
                            i6 = ((iM6982 ^ i4) * 19907) ^ (-1527717974);
                            i7 = 1193334646;
                            break;
                        }
                        iM6982 = C2105.m6981("᩵ۧ") ^ i5;
                        i6 = ((iM6982 ^ i4) * 5923) ^ (-1611833580);
                        i7 = -166953080;
                        break;
                        break;
                    case -1011769677:
                    case 1023922603:
                        x = motionEvent.getX();
                        y = motionEvent.getY();
                        if (C2167.f7158 < 0) {
                            iM6982 = C0630.m2566("ܿ᩶") ^ i5;
                            i6 = ((iM6982 ^ i4) * (-1817)) ^ (-930045949);
                            i7 = -488980040;
                            break;
                        }
                        iM6982 = C2105.m6981("᩵ۧ") ^ i5;
                        i6 = ((iM6982 ^ i4) * 5923) ^ (-1611833580);
                        i7 = -166953080;
                        break;
                        break;
                    case -839225375:
                    case -527291801:
                        if (this.f28855) {
                            iM6981 = (C0630.m2566("ۗۛ") + i5) * (-63);
                            i6 = ((iM6981 ^ i4) * 25845) ^ 785413114;
                            i = 1871433714;
                        } else {
                            iM6981 = C2105.m6981("ܽ᩹") ^ i5;
                            i6 = ((iM6981 ^ i4) * 19717) ^ 2079216492;
                            i = -1481992998;
                        }
                        i8 = iM6981 ^ i;
                        i2 = 3;
                        break;
                    case -833591097:
                    case -201062165:
                        if (actionMasked != i2) {
                            iM6982 = C0630.m2566("ܰᩴ") ^ i4;
                            i6 = ((iM6982 ^ i5) * 13217) ^ (-1339916079);
                            i7 = 1537505154;
                            break;
                            break;
                        }
                        iM6982 = C2105.m6981("ۙ᩷") ^ i5;
                        i6 = ((iM6982 ^ i4) * 29179) ^ (-55101070);
                        i7 = -1214852789;
                        break;
                        break;
                    case -698122689:
                    case 1158868001:
                        if (C1128.f4106 > 0) {
                            iM6982 = C2105.m6981("ᩴۚ") ^ i4;
                            i6 = ((iM6982 ^ i5) * (-15771)) ^ (-706056539);
                            i7 = 1269706177;
                            break;
                            break;
                        }
                        iM6982 = (C0630.m2566("ۖۧ") ^ i5) * 15;
                        i6 = ((iM6982 ^ i4) * (-29207)) ^ (-1743265055);
                        i7 = -2114563766;
                        break;
                        break;
                    case -653298890:
                    case 1321175780:
                        if (C4117.f13076 <= 0) {
                            iM6982 = (C0630.m2566("᩸ܿ") ^ i5) * 35;
                            i6 = ((iM6982 ^ i4) * 2605) ^ (-1735915324);
                            i7 = -772691511;
                            break;
                        }
                        iM6982 = C0630.m2566("ۚ۟") ^ i5;
                        i6 = ((iM6982 ^ i4) * 7793) ^ (-419957750);
                        i7 = -22950651;
                        break;
                        break;
                    case -554908093:
                    case 187245397:
                        C4159.m12565();
                        return false;
                    case -363620203:
                    case 838447599:
                        if (C2167.f7158 < 0) {
                            iM6982 = (C2105.m6981("᩷᩷") + i4) * (-93);
                            i6 = ((iM6982 ^ i5) * 29707) ^ 1187637976;
                            i7 = -1411468531;
                            break;
                        }
                        iM6982 = (C2105.m6981("ܰۘ") + i5) * (-23);
                        i6 = ((iM6982 ^ i4) * (-6071)) ^ 1302902068;
                        i7 = 433331439;
                        break;
                    case -360521690:
                    case 1603322128:
                        if (!m24349(motionEvent)) {
                            iM6982 = (i4 - C2105.m6981("᩹ܽ")) * 71;
                            i6 = ((iM6982 ^ i5) * 11019) ^ (-595023321);
                            i7 = 2058652164;
                            break;
                        }
                        iM6982 = (C0630.m2566("᩷ۡ") + i5) * (-109);
                        i6 = ((iM6982 ^ i4) * (-4753)) ^ (-976157706);
                        i7 = 1303742618;
                        break;
                    case -91738149:
                    case 554436152:
                        zOnTouchEvent = onTouchEvent(motionEvent);
                        if (actionMasked == z2) {
                            iM6982 = C2105.m6981("ۡۜ") ^ i5;
                            i6 = ((iM6982 ^ i4) * (-3065)) ^ (-257735972);
                            i7 = -1582199264;
                            break;
                            break;
                        }
                        iM6982 = C2105.m6981("᩹ۙ") ^ i4;
                        i6 = ((iM6982 ^ i5) * (-25471)) ^ 1320925407;
                        i7 = -2086273619;
                        break;
                    case -90541509:
                    case 1837469605:
                        C3911.m11924();
                        if (C1047.f3863 >= 0) {
                            iM6982 = C2105.m6981("ۖܿ") ^ i4;
                            i6 = ((iM6982 ^ i5) * (-753)) ^ (-868439643);
                            i7 = -1711629673;
                            break;
                        }
                        iM6982 = C2105.m6981("ۢ֨") ^ i4;
                        i6 = ((iM6982 ^ i5) * (-2999)) ^ 1113818040;
                        i7 = -697820531;
                        break;
                        break;
                    case -48083137:
                    case 987823170:
                        if (RunnableC1937.f6483 < 0) {
                            iM6982 = C2105.m6981("۬ۖ") ^ i5;
                            i6 = ((iM6982 ^ i4) * (-31527)) ^ 482739520;
                            i7 = -1104828707;
                            break;
                        }
                        iM6982 = (C2105.m6981("ܰۘ") + i5) * (-23);
                        i6 = ((iM6982 ^ i4) * (-6071)) ^ 1302902068;
                        i7 = 433331439;
                        break;
                        break;
                    case 259765087:
                    case 1590187573:
                        if (!this.f28846.m35178(x, y)) {
                            iM6982 = (C0630.m2566("᩸ۧ") ^ i4) * 19;
                            i6 = ((iM6982 ^ i5) * 10929) ^ 806103882;
                            i7 = -1429098819;
                            break;
                            break;
                        }
                        iM6982 = C0630.m2566("֫᩸") ^ i4;
                        i6 = ((iM6982 ^ i5) * (-24631)) ^ (-2004702504);
                        i7 = 1067636380;
                        break;
                    case 279803129:
                    case 1500108843:
                        if (actionMasked == z2) {
                            iM6982 = C0630.m2566("֡᩶") ^ i4;
                            i6 = ((iM6982 ^ i5) * (-19047)) ^ 601013102;
                            i7 = -1252063181;
                            break;
                            break;
                        }
                        iM6982 = C2105.m6981("ۧ᩶") ^ i5;
                        i6 = ((iM6982 ^ i4) * (-25833)) ^ (-111586368);
                        i7 = 1824318743;
                        break;
                    case 318807984:
                    case 1887963543:
                        C2126.m7040();
                        C3432.m10477();
                        iM6982 = C2105.m6981("ۢ֨") ^ i4;
                        i6 = ((iM6982 ^ i5) * (-2999)) ^ 1113818040;
                        i7 = -697820531;
                        break;
                        break;
                    case 330644436:
                    case 842061760:
                        actionMasked = motionEvent.getActionMasked();
                        if (!RunnableC1108.m3790()) {
                            iM6982 = C2105.m6981("۟۠") ^ i4;
                            i6 = ((iM6982 ^ i5) * (-329)) ^ (-660545280);
                            i7 = -1328348197;
                            break;
                        }
                        iM6982 = (C2105.m6981("ܰۘ") + i5) * (-23);
                        i6 = ((iM6982 ^ i4) * (-6071)) ^ 1302902068;
                        i7 = 433331439;
                        break;
                        break;
                    case 405205621:
                    case 1292580853:
                        if (!C1711.f5919) {
                            iM6982 = (C0630.m2566("ۨۗ") ^ i5) * 65;
                            i6 = ((iM6982 ^ i4) * (-15373)) ^ (-1558837080);
                            i7 = -1462447136;
                            break;
                        }
                        iM6982 = C2105.m6981("᩷ۢ") ^ i4;
                        i6 = ((iM6982 ^ i5) * (-6185)) ^ 1014681927;
                        i7 = -779595851;
                        break;
                        break;
                    case 464440682:
                    case 1255282880:
                        if (C0630.f2410 <= 0) {
                            iM6982 = (C0630.m2566("۫ܳ") + i4) * (-97);
                            i6 = ((iM6982 ^ i5) * 21255) ^ 111920062;
                            i7 = -2135425871;
                            break;
                            break;
                        }
                        iM6982 = C2105.m6981("ᩴۚ") ^ i4;
                        i6 = ((iM6982 ^ i5) * (-15771)) ^ (-706056539);
                        i7 = 1269706177;
                        break;
                        break;
                    case 925244281:
                    case 1959972572:
                        if (!m24349(motionEvent)) {
                            iM6982 = (C0630.m2566("ۡۙ") + i5) * (-31);
                            i6 = ((iM6982 ^ i4) * (-27441)) ^ 1916235358;
                            i7 = 926905645;
                            break;
                        }
                        iM6982 = C0630.m2566("ܰᩴ") ^ i4;
                        i6 = ((iM6982 ^ i5) * 13217) ^ (-1339916079);
                        i7 = 1537505154;
                        break;
                        break;
                    case 949486562:
                    case 1276173259:
                        this.f28855 = z;
                        return zOnTouchEvent;
                    case 1213499136:
                    case 1526842184:
                        if (!C0382.m1848()) {
                            iM6982 = (i4 - C0630.m2566("᩹᩹")) * 43;
                            i6 = ((iM6982 ^ i5) * (-24641)) ^ (-1158770236);
                            i7 = -758283462;
                            break;
                        }
                        iM6982 = C0630.m2566("ۚ۟") ^ i5;
                        i6 = ((iM6982 ^ i4) * 7793) ^ (-419957750);
                        i7 = -22950651;
                        break;
                        break;
                    case 1394641166:
                    case 1885327651:
                        return z2;
                    case 1401221703:
                    case 1728388997:
                        if (C1047.f3863 < 0) {
                            iM6982 = C0630.m2566("ۧܺ") ^ i4;
                            i6 = ((iM6982 ^ i5) * (-9013)) ^ 749267344;
                            i7 = -1073278698;
                            break;
                        }
                        iM6982 = C2105.m6981("ۖܿ") ^ i4;
                        i6 = ((iM6982 ^ i5) * (-753)) ^ (-868439643);
                        i7 = -1711629673;
                        break;
                        break;
                    default:
                        C4616.m13552();
                        if (C4075.f12947 >= 0) {
                            iM6982 = (C0630.m2566("ۖۧ") ^ i5) * 15;
                            i6 = ((iM6982 ^ i4) * (-29207)) ^ (-1743265055);
                            i7 = -2114563766;
                            break;
                            break;
                        }
                        iM6982 = C2105.m6981("ۖܿ") ^ i4;
                        i6 = ((iM6982 ^ i5) * (-753)) ^ (-868439643);
                        i7 = -1711629673;
                        break;
                        break;
                }
            }
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    public final void layoutChildren() {
        int i = -1832634337;
        int i2 = C3911.f12484;
        int i3 = C1773.f6144;
        int iM6981 = (C2105.m6981("ۡۡ") + i2) * 47;
        int i4 = ((iM6981 ^ i3) * (-30067)) ^ (-1219716308);
        int i5 = -233073010;
        while (true) {
            i = ((((i ^ i3) * 8025) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2091899185:
                case -424788975:
                    if (C0483.f2088 >= 0) {
                        iM6981 = C0630.m2566("ܳܿ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-2163)) ^ 1658859970;
                        i5 = -666421950;
                    } else {
                        iM6981 = C0630.m2566("ܶ֡") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-21713)) ^ (-535176187);
                        i5 = 474069346;
                    }
                    break;
                case -1930317430:
                case -1673948868:
                    C7106.m19120();
                    if (C4616.f14690 <= 0) {
                        iM6981 = (C0630.m2566("ۘ۟") + i3) * (-39);
                        i4 = ((iM6981 ^ i2) * (-28619)) ^ 2001757099;
                        i5 = 282994235;
                    } else {
                        iM6981 = C2105.m6981("۟᩻") ^ i2;
                        i4 = ((iM6981 ^ i3) * 24971) ^ (-1130568254);
                        i5 = 1436414638;
                    }
                    break;
                case -1849167563:
                case -1023176592:
                    if (C0422.f1886 <= 0) {
                        iM6981 = C2105.m6981("ۗ᩻") ^ i2;
                        i4 = ((iM6981 ^ i3) * 21293) ^ (-111670099);
                        i5 = 2061130157;
                    } else {
                        iM6981 = (C0630.m2566("֡ܳ") ^ i2) * 49;
                        i4 = ((iM6981 ^ i3) * (-331)) ^ (-1866621854);
                        i5 = -1550518182;
                    }
                    break;
                case -1843676499:
                case -1467311238:
                    if (C4263.f13799 <= 0) {
                        iM6981 = C0630.m2566("᩻ۖ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-18889)) ^ (-357937185);
                        i5 = 623252716;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ۢ᩺")) * 23;
                        i4 = ((iM6981 ^ i2) * (-29279)) ^ (-159206278);
                        i5 = -1936184734;
                    }
                    break;
                case -1498737840:
                case -1283572793:
                    C0630.m2564();
                    C0382.m1848();
                    break;
                case -1099724760:
                case 614260982:
                    if (C0483.f2088 >= 0) {
                        iM6981 = (C0630.m2566("ۘ۟") + i3) * (-39);
                        i4 = ((iM6981 ^ i2) * (-28619)) ^ 2001757099;
                        i5 = 282994235;
                    } else {
                        iM6981 = C0630.m2566("۫֨") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-27471)) ^ (-94066624);
                        i5 = 5096985;
                    }
                    break;
                case -1099535664:
                case 530863277:
                    if (RunnableC3474.m10630()) {
                        iM6981 = (i2 - C2105.m6981("᩵ᩴ")) * 115;
                        i4 = ((iM6981 ^ i3) * (-20849)) ^ 2218131;
                        i5 = -553860409;
                    } else {
                        iM6981 = C2105.m6981("ۗ᩻") ^ i2;
                        i4 = ((iM6981 ^ i3) * 21293) ^ (-111670099);
                        i5 = 2061130157;
                    }
                    break;
                case -1066619621:
                case -61780618:
                    try {
                        super.layoutChildren();
                        break;
                    } catch (Throwable unused) {
                    }
                    iM6981 = (C0630.m2566("ۛ۫") + i3) * (-13);
                    i4 = ((iM6981 ^ i2) * 9263) ^ (-1946202636);
                    i5 = 1577457204;
                    break;
                case -1010431678:
                case 793247861:
                    C0237.m1481();
                    iM6981 = C2105.m6981("۟᩻") ^ i2;
                    i4 = ((iM6981 ^ i3) * 24971) ^ (-1130568254);
                    i5 = 1436414638;
                    break;
                case -721587707:
                case -237333682:
                    C0714.m2805();
                    if (!C1916.f6442) {
                        iM6981 = C2105.m6981("۟᩻") ^ i2;
                        i4 = ((iM6981 ^ i3) * 24971) ^ (-1130568254);
                        i5 = 1436414638;
                    } else {
                        iM6981 = C0630.m2566("᩻ۖ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-18889)) ^ (-357937185);
                        i5 = 623252716;
                    }
                    break;
                case -199090832:
                case 866895081:
                    if (C2520.f8000 >= 0) {
                        iM6981 = C0630.m2566("ܳܿ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-2163)) ^ 1658859970;
                        i5 = -666421950;
                    } else {
                        iM6981 = (C0630.m2566("ۚܰ") + i3) * (-45);
                        i4 = ((iM6981 ^ i2) * 28019) ^ (-433977426);
                        i5 = 149128063;
                    }
                    break;
                case -90015140:
                case 1206443233:
                    if (C4263.f13799 <= 0) {
                        iM6981 = C0630.m2566("᩻ۖ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-18889)) ^ (-357937185);
                        i5 = 623252716;
                    } else {
                        iM6981 = C0630.m2566("ܺܿ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 8285) ^ (-1190116966);
                        i5 = 250921232;
                    }
                    break;
                case -28248090:
                case -19393637:
                    break;
                case 72037658:
                case 1752238277:
                    if (C0964.f3626 != 0) {
                        iM6981 = C0630.m2566("᩻ۖ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-18889)) ^ (-357937185);
                        i5 = 623252716;
                    } else {
                        iM6981 = (C2105.m6981("ۤܳ") + i3) * (-127);
                        i4 = ((iM6981 ^ i2) * (-20267)) ^ 1116519654;
                        i5 = -1153567480;
                    }
                    break;
                case 120330871:
                case 541673379:
                    if (RunnableC3474.m10630()) {
                        iM6981 = C2105.m6981("۠۬") ^ i2;
                        i4 = ((iM6981 ^ i3) * 8097) ^ (-1075061802);
                        i5 = 314697577;
                    } else {
                        iM6981 = (C0630.m2566("ۘ۟") + i3) * (-39);
                        i4 = ((iM6981 ^ i2) * (-28619)) ^ 2001757099;
                        i5 = 282994235;
                    }
                    break;
                case 297259323:
                case 1956849997:
                    if (C11340.m28031()) {
                        iM6981 = C2105.m6981("ۡ۟") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-20147)) ^ (-2000768825);
                        i5 = -1865534016;
                    } else {
                        iM6981 = (C0630.m2566("ۘ۟") + i3) * (-39);
                        i4 = ((iM6981 ^ i2) * (-28619)) ^ 2001757099;
                        i5 = 282994235;
                    }
                    break;
                default:
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = C2105.m6981("ۗ᩻") ^ i2;
                        i4 = ((iM6981 ^ i3) * 21293) ^ (-111670099);
                        i5 = 2061130157;
                    } else {
                        iM6981 = C0630.m2566("᩻ۖ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-18889)) ^ (-357937185);
                        i5 = 623252716;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m24352(MotionEvent motionEvent) {
        int actionMasked = 0;
        int i = 775941694;
        int i2 = C3432.f10845;
        int i3 = C11340.f33930;
        int iM6981 = C2105.m6981("֫ۙ") ^ i3;
        int i4 = ((iM6981 ^ i2) * 25331) ^ 616660496;
        int i5 = -740923493;
        while (true) {
            i = ((((i ^ i2) * (-9157)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2125965614:
                case -2057968922:
                    if (C3537.m10746() <= 0) {
                        iM6981 = C2105.m6981("ۖۤ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-5367)) ^ 417439681;
                        i5 = 1228324818;
                    } else {
                        iM6981 = (C2105.m6981("᩵ۖ") + i3) * (-125);
                        i4 = ((iM6981 ^ i2) * (-26915)) ^ 1341246598;
                        i5 = -775448431;
                    }
                    break;
                case -1695004209:
                case -87824142:
                    if (actionMasked == 3) {
                        iM6981 = C0630.m2566("ܶۙ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-14609)) ^ (-744082492);
                        i5 = -356305627;
                    } else {
                        iM6981 = C0630.m2566("ܳᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 10373) ^ 381298448;
                        i5 = -1218764262;
                    }
                    break;
                case -1659092448:
                case -1031920053:
                    C1420.m4913();
                    if (C3746.m11369() >= 0) {
                        iM6981 = C0630.m2566("۠ܺ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-3025)) ^ 1922044619;
                        i5 = -270851136;
                    } else {
                        iM6981 = (C2105.m6981("᩵ܿ") ^ i2) * 35;
                        i4 = ((iM6981 ^ i3) * 6355) ^ 141342725;
                        i5 = -701068533;
                    }
                    break;
                case -1649800156:
                case 382423270:
                    C3663.m11168();
                    iM6981 = (C2105.m6981("᩵ܿ") ^ i2) * 35;
                    i4 = ((iM6981 ^ i3) * 6355) ^ 141342725;
                    i5 = -701068533;
                    break;
                case -1550185409:
                case 1005705382:
                    C0714.m2805();
                    if (C1916.f6442) {
                        iM6981 = C2105.m6981("ܽ᩵") ^ i2;
                        i4 = ((iM6981 ^ i3) * 30023) ^ (-814382284);
                        i5 = -1457852682;
                    } else {
                        iM6981 = (C2105.m6981("᩵ܿ") ^ i2) * 35;
                        i4 = ((iM6981 ^ i3) * 6355) ^ 141342725;
                        i5 = -701068533;
                    }
                    break;
                case -1535749741:
                case 72539778:
                    if (C0798.f2919) {
                        iM6981 = C2105.m6981("ۖۤ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-5367)) ^ 417439681;
                        i5 = 1228324818;
                    } else {
                        iM6981 = C0630.m2566("ᩳۖ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-30431)) ^ 884408891;
                        i5 = 1210232823;
                    }
                    break;
                case -1248167310:
                case 834762915:
                    if (RunnableC1108.f4040) {
                        iM6981 = (C0630.m2566("֨۬") ^ i2) * (-21);
                        i4 = ((iM6981 ^ i3) * 19739) ^ (-1106898400);
                        i5 = 1273986152;
                    } else {
                        iM6981 = C2105.m6981("ۖۤ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-5367)) ^ 417439681;
                        i5 = 1228324818;
                    }
                    break;
                case -981795696:
                case -46805476:
                    if (C1420.f5096 <= 0) {
                        iM6981 = (C2105.m6981("᩵ܿ") ^ i2) * 35;
                        i4 = ((iM6981 ^ i3) * 6355) ^ 141342725;
                        i5 = -701068533;
                    } else {
                        iM6981 = C2105.m6981("ܽۤ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 3681) ^ (-1278526520);
                        i5 = 1347002866;
                    }
                    break;
                case -814031388:
                case 1856502348:
                    if (C0798.f2919) {
                        iM6981 = C2105.m6981("ۖۧ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 22827) ^ (-1763582763);
                        i5 = -1025397493;
                    } else {
                        iM6981 = C0630.m2566("ܳܽ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 14233) ^ (-617543995);
                        i5 = -1985993147;
                    }
                    break;
                case -773032850:
                case 707087028:
                    if (actionMasked != 1) {
                        iM6981 = C2105.m6981("᩵ᩳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-30833)) ^ 74948651;
                        i5 = 1339358532;
                    } else {
                        iM6981 = C0630.m2566("ܶۙ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-14609)) ^ (-744082492);
                        i5 = -356305627;
                    }
                    break;
                case -551635757:
                case -108182873:
                    if (AbstractC2021.m6574()) {
                        iM6981 = C0630.m2566("۠ܺ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-3025)) ^ 1922044619;
                        i5 = -270851136;
                    } else {
                        iM6981 = C2105.m6981("ܽۧ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 6981) ^ 1578589020;
                        i5 = -1190629705;
                    }
                    break;
                case -478724149:
                case 1830989505:
                    if (C4075.f12947 >= 0) {
                        iM6981 = C2105.m6981("ۖۤ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-5367)) ^ 417439681;
                        i5 = 1228324818;
                    } else {
                        iM6981 = (C0630.m2566("۠᩻") ^ i2) * (-79);
                        i4 = ((iM6981 ^ i3) * (-25869)) ^ 1609563100;
                        i5 = 794641504;
                    }
                    break;
                case -446882403:
                case 329335334:
                    if (C7106.f21815 != 0) {
                        iM6981 = C2105.m6981("ۖۧ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 22827) ^ (-1763582763);
                        i5 = -1025397493;
                    } else {
                        iM6981 = (C0630.m2566("ܿܰ") ^ i3) * (-53);
                        i4 = ((iM6981 ^ i2) * 31353) ^ (-1405577349);
                        i5 = -868697540;
                    }
                    break;
                case 134018601:
                case 2064960535:
                    if (C1420.f5096 <= 0) {
                        iM6981 = C2105.m6981("ۖۧ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 22827) ^ (-1763582763);
                        i5 = -1025397493;
                    } else {
                        iM6981 = C0630.m2566("᩷ۙ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-2915)) ^ 1662531759;
                        i5 = -797195524;
                    }
                    break;
                case 335847949:
                case 1799435206:
                    RunnableC1108.m3790();
                    C1128.m3851();
                    break;
                case 369263795:
                case 1607960686:
                    this.f28865 = false;
                    break;
                case 388007576:
                case 1569384211:
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = (C2105.m6981("᩵ܿ") ^ i2) * 35;
                        i4 = ((iM6981 ^ i3) * 6355) ^ 141342725;
                        i5 = -701068533;
                    } else {
                        iM6981 = (C2105.m6981("᩺ܿ") + i2) * (-81);
                        i4 = ((iM6981 ^ i3) * (-7287)) ^ (-105828797);
                        i5 = 851541009;
                    }
                    break;
                case 470699782:
                case 1485394598:
                    C4075.m12263();
                    if (C22628.f73083 <= 0) {
                        iM6981 = C2105.m6981("ۖۧ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 22827) ^ (-1763582763);
                        i5 = -1025397493;
                    } else {
                        iM6981 = (C2105.m6981("᩵ܿ") ^ i2) * 35;
                        i4 = ((iM6981 ^ i3) * 6355) ^ 141342725;
                        i5 = -701068533;
                    }
                    break;
                case 1066689694:
                case 1668414599:
                    break;
                default:
                    actionMasked = motionEvent.getActionMasked();
                    if (actionMasked != 0) {
                        iM6981 = (C0630.m2566("۠ۤ") ^ i3) * 67;
                        i4 = ((iM6981 ^ i2) * (-5013)) ^ 1907867482;
                        i5 = 1456720838;
                    } else {
                        iM6981 = C0630.m2566("ܶۙ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-14609)) ^ (-744082492);
                        i5 = -356305627;
                    }
                    break;
            }
            return;
        }
    }

    @Override // android.widget.AdapterView
    public final void setOnItemLongClickListener(AdapterView.OnItemLongClickListener onItemLongClickListener) {
        int i = -1691089973;
        int i2 = C3911.f12484;
        int i3 = C3019.f9544;
        int iM2566 = (C0630.m2566("ᩴ᩺") + i2) * 13;
        int i4 = ((iM2566 ^ i3) * (-17237)) ^ 499972788;
        int i5 = -1090022347;
        while (true) {
            i = ((((i ^ i3) * (-755)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2023868495:
                case 303990941:
                    if (C3432.m10477() <= 0) {
                        iM2566 = (i2 - C0630.m2566("۬ܳ")) * 127;
                        i4 = ((iM2566 ^ i3) * (-21975)) ^ (-1706064140);
                        i5 = -630795210;
                    } else {
                        iM2566 = C0630.m2566("ۙܽ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 31681) ^ 680102998;
                        i5 = -1761167941;
                    }
                    break;
                case -1994128950:
                case 1209684064:
                    if (C2272.f7362) {
                        iM2566 = (C2105.m6981("ۨ֨") + i2) * 37;
                        i4 = ((iM2566 ^ i3) * 20539) ^ (-63731754);
                        i5 = 782447513;
                    } else {
                        iM2566 = C2105.m6981("۠ۡ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 3593) ^ (-1706954513);
                        i5 = 230183375;
                    }
                    break;
                case -1879752222:
                case 1344735876:
                    C0483.m2121();
                    C2272.m7503();
                    iM2566 = C0630.m2566("ۙܽ") ^ i3;
                    i4 = ((iM2566 ^ i2) * 31681) ^ 680102998;
                    i5 = -1761167941;
                    break;
                case -1479063492:
                case 1712789106:
                    super.setOnItemLongClickListener(null);
                    break;
                case -1460954479:
                case 1020122901:
                    if (C0798.f2919) {
                        iM2566 = (C2105.m6981("ۨ֨") + i2) * 37;
                        i4 = ((iM2566 ^ i3) * 20539) ^ (-63731754);
                        i5 = 782447513;
                    } else {
                        iM2566 = (C0630.m2566("ۚ֡") + i3) * 65;
                        i4 = ((iM2566 ^ i2) * (-15171)) ^ 534559536;
                        i5 = -551591811;
                    }
                    break;
                case -1349280603:
                case 1884778576:
                    if (C2958.f9394 < 0) {
                        iM2566 = (C0630.m2566("ܿ᩺") ^ i3) * 33;
                        i4 = ((iM2566 ^ i2) * (-20215)) ^ 902633570;
                        i5 = -1278125866;
                    } else {
                        iM2566 = (i2 - C0630.m2566("۬ܳ")) * 127;
                        i4 = ((iM2566 ^ i3) * (-21975)) ^ (-1706064140);
                        i5 = -630795210;
                    }
                    break;
                case -1141665346:
                case 2145699196:
                    C7106.m19120();
                    if (C1128.f4106 <= 0) {
                        iM2566 = (C2105.m6981("ۨ֨") + i2) * 37;
                        i4 = ((iM2566 ^ i3) * 20539) ^ (-63731754);
                        i5 = 782447513;
                    } else {
                        iM2566 = (i2 - C0630.m2566("۬ܳ")) * 127;
                        i4 = ((iM2566 ^ i3) * (-21975)) ^ (-1706064140);
                        i5 = -630795210;
                    }
                    break;
                case -903020561:
                case 1306277953:
                    super.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: l.ᩳۢۡ
                        @Override // android.widget.AdapterView.OnItemLongClickListener
                        public final boolean onItemLongClick(AdapterView adapterView, View view, int i6, long j) {
                            return C9503.m24344(this.f56040, adapterView, view, i6, j);
                        }
                    });
                    break;
                case -693654031:
                case 2096648281:
                    if (C1128.m3851() <= 0) {
                        iM2566 = C0630.m2566("ᩴ᩵") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-31421)) ^ (-1897552402);
                        i5 = -1727746584;
                    } else {
                        iM2566 = (C0630.m2566("֫ۜ") + i3) * 9;
                        i4 = ((iM2566 ^ i2) * (-17751)) ^ (-1021133991);
                        i5 = 852327512;
                    }
                    break;
                case -605883532:
                case 1752774865:
                    if (C0382.m1848()) {
                        iM2566 = (C2105.m6981("ۨ֨") + i2) * 37;
                        i4 = ((iM2566 ^ i3) * 20539) ^ (-63731754);
                        i5 = 782447513;
                    } else {
                        iM2566 = C2105.m6981("᩸ۨ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 8685) ^ (-510541851);
                        i5 = -1619013075;
                    }
                    break;
                case -346313765:
                case 1991692336:
                    if (C1005.f3721) {
                        iM2566 = C0630.m2566("᩷ۡ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 16585) ^ (-1562776606);
                        i5 = 418983628;
                    } else {
                        iM2566 = (C0630.m2566("ܿ᩺") ^ i3) * 33;
                        i4 = ((iM2566 ^ i2) * (-20215)) ^ 902633570;
                        i5 = -1278125866;
                    }
                    break;
                case -178545546:
                case 1814760179:
                    if (C11340.f33930 >= 0) {
                        iM2566 = C0630.m2566("ᩴ᩵") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-31421)) ^ (-1897552402);
                        i5 = -1727746584;
                    } else {
                        iM2566 = C0630.m2566("ۘ֡") ^ i3;
                        i4 = ((iM2566 ^ i2) * 29221) ^ (-542707456);
                        i5 = 1830986603;
                    }
                    break;
                case 112492522:
                case 1565236283:
                    if (C0630.f2410 <= 0) {
                        iM2566 = C0630.m2566("ᩴ᩵") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-31421)) ^ (-1897552402);
                        i5 = -1727746584;
                    } else {
                        iM2566 = C0630.m2566("ۧᩴ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 2105) ^ 15059148;
                        i5 = 1309166825;
                    }
                    break;
                case 165922887:
                case 1987584338:
                    if (C11340.f33930 >= 0) {
                        iM2566 = C0630.m2566("ۙܽ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 31681) ^ 680102998;
                        i5 = -1761167941;
                    } else {
                        iM2566 = C0630.m2566("ۡ֡") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-19053)) ^ 1421821815;
                        i5 = -1709462356;
                    }
                    break;
                case 171237254:
                case 226644375:
                    this.f28862 = onItemLongClickListener;
                    if (onItemLongClickListener == null) {
                        iM2566 = (C2105.m6981("۫ۖ") + i2) * 99;
                        i4 = ((iM2566 ^ i3) * 18367) ^ (-860644738);
                        i5 = 742021202;
                    } else {
                        iM2566 = C2105.m6981("ܽۨ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-6605)) ^ 86116612;
                        i5 = -1602398470;
                    }
                    break;
                case 959067064:
                case 2057824207:
                    C1294.m4372();
                    C0382.m1848();
                    break;
                case 1205056092:
                case 2040516424:
                    if (C1504.f5354) {
                        iM2566 = C0630.m2566("ᩴ᩵") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-31421)) ^ (-1897552402);
                        i5 = -1727746584;
                    } else {
                        iM2566 = (C2105.m6981("۟۬") ^ i3) * 99;
                        i4 = ((iM2566 ^ i2) * (-30859)) ^ 866721435;
                        i5 = -279568719;
                    }
                    break;
                default:
                    if (C4159.m12565() >= 0) {
                        iM2566 = (C2105.m6981("ۨ֨") + i2) * 37;
                        i4 = ((iM2566 ^ i3) * 20539) ^ (-63731754);
                        i5 = 782447513;
                    } else {
                        iM2566 = C0630.m2566("ۚܶ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 22139) ^ (-1013615306);
                        i5 = -285198898;
                    }
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 25481. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r35) {
        /*
            Method dump skipped, instruction units count: 2548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9503.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.AbsListView
    public final void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.f28873 = onScrollListener;
    }

    @Override // android.view.View
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f28870 = onTouchListener;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m24343(C9503 c9503, View view, MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = null;
        Iterator itM9029 = null;
        int i = 456800605;
        int i2 = C0483.f2088;
        int i3 = C3537.f11231;
        int iM6981 = C2105.m6981("᩹ܶ") ^ i2;
        int i4 = ((iM6981 ^ i3) * (-12019)) ^ 1853771215;
        int i5 = 1158421921;
        while (true) {
            i = ((((i ^ i3) * 19525) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -1910315673:
                case 864463736:
                    C1420.m4913();
                    RunnableC0588.m2441();
                    iM6981 = (C0630.m2566("ۗۜ") + i2) * (-67);
                    i4 = ((iM6981 ^ i3) * 30793) ^ (-1278073355);
                    i5 = -1206765189;
                    break;
                case -1897021541:
                case -1546999723:
                    if (C1773.m5910(itM9029)) {
                        iM6981 = C0630.m2566("ܶ᩹") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-6257)) ^ (-1817160549);
                        i5 = 354219253;
                    } else {
                        iM6981 = (C2105.m6981("֫᩻") ^ i2) * 45;
                        i4 = ((iM6981 ^ i3) * (-575)) ^ (-331847899);
                        i5 = 1057500542;
                    }
                    break;
                case -1888773803:
                case -146138783:
                    if (C3432.f10845 >= 0) {
                        iM6981 = (i2 - C2105.m6981("᩻ۙ")) * (-3);
                        i4 = ((iM6981 ^ i3) * 18757) ^ (-154636014);
                        i5 = 683458107;
                    } else {
                        iM6981 = C0630.m2566("۠۫") ^ i3;
                        i4 = ((iM6981 ^ i2) * 25673) ^ (-590840070);
                        i5 = -1544923804;
                    }
                    break;
                case -1856671802:
                case 286232815:
                    if (C7811.f24123 >= 0) {
                        iM6981 = (i2 - C2105.m6981("᩻ۙ")) * (-3);
                        i4 = ((iM6981 ^ i3) * 18757) ^ (-154636014);
                        i5 = 683458107;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ۜ֫")) * (-83);
                        i4 = ((iM6981 ^ i3) * 17247) ^ 499464806;
                        i5 = 1352400325;
                    }
                    break;
                case -1708363649:
                case 1619916084:
                    if (C3911.m11924() <= 0) {
                        iM6981 = (C2105.m6981("ܶ᩶") ^ i3) * 119;
                        i4 = ((iM6981 ^ i2) * (-17201)) ^ (-796312140);
                        i5 = 1324865310;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۖܽ")) * (-97);
                        i4 = ((iM6981 ^ i2) * 9503) ^ 116958019;
                        i5 = -442138044;
                    }
                    break;
                case -1454889173:
                case 799114959:
                    C1504.m5179();
                    if (C4263.f13799 <= 0) {
                        iM6981 = (i2 - C2105.m6981("᩻ۙ")) * (-3);
                        i4 = ((iM6981 ^ i3) * 18757) ^ (-154636014);
                        i5 = 683458107;
                    } else {
                        iM6981 = C0630.m2566("᩺᩻") ^ i3;
                        i4 = ((iM6981 ^ i2) * 9511) ^ (-790225246);
                        i5 = 589236332;
                    }
                    break;
                case -1429329923:
                case -268615135:
                    return true;
                case -1230369148:
                case 1552081625:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = C0630.m2566("᩺᩻") ^ i3;
                        i4 = ((iM6981 ^ i2) * 9511) ^ (-790225246);
                        i5 = 589236332;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ᩳۧ")) * 115;
                        i4 = ((iM6981 ^ i2) * (-3109)) ^ (-929279246);
                        i5 = -1510443068;
                    }
                    break;
                case -1165010007:
                case -169965202:
                    if (C3663.f11553) {
                        iM6981 = (C0630.m2566("ۗۜ") + i2) * (-67);
                        i4 = ((iM6981 ^ i3) * 30793) ^ (-1278073355);
                        i5 = -1206765189;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ܰ᩸")) * 37;
                        i4 = ((iM6981 ^ i2) * (-12791)) ^ 453177147;
                        i5 = -1333121208;
                    }
                    break;
                case -925403464:
                case 1821434873:
                    if (C0422.f1886 <= 0) {
                        iM6981 = C2105.m6981("ܽۧ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 11565) ^ 1116037475;
                        i5 = -259901562;
                    } else {
                        iM6981 = (C0630.m2566("ۛۤ") + i2) * 79;
                        i4 = ((iM6981 ^ i3) * (-20005)) ^ (-1669253129);
                        i5 = 1786859216;
                    }
                    break;
                case -901818123:
                case 1463239480:
                    if (((View.OnTouchListener) C2272.m7513(itM9029)).onTouch(view, motionEvent)) {
                        iM6981 = (C0630.m2566("᩶ۤ") + i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM6981 ^ i2) * 16607) ^ (-520750567);
                        i5 = 1908575781;
                    } else {
                        iM6981 = (C0630.m2566("ۢ᩶") + i3) * 25;
                        i4 = ((iM6981 ^ i2) * 7125) ^ (-1928512513);
                        i5 = -171695755;
                    }
                    break;
                case -594457347:
                case -224677813:
                    if (C0630.m2564()) {
                        iM6981 = C0630.m2566("᩺᩻") ^ i3;
                        i4 = ((iM6981 ^ i2) * 9511) ^ (-790225246);
                        i5 = 589236332;
                    } else {
                        iM6981 = C0630.m2566("ܿۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 14419) ^ (-1838101341);
                        i5 = -1579467531;
                    }
                    break;
                case -376284353:
                case 1243811594:
                    C1916.m6308();
                    if (C4159.m12565() >= 0) {
                        iM6981 = C0630.m2566("᩺᩻") ^ i3;
                        i4 = ((iM6981 ^ i2) * 9511) ^ (-790225246);
                        i5 = 589236332;
                    } else {
                        iM6981 = (C2105.m6981("ܶ᩶") ^ i3) * 119;
                        i4 = ((iM6981 ^ i2) * (-17201)) ^ (-796312140);
                        i5 = 1324865310;
                    }
                    break;
                case -224048281:
                case 2065631741:
                    C3911.m11924();
                    if (C3911.f12484 >= 0) {
                        iM6981 = (C2105.m6981("ܶ᩶") ^ i3) * 119;
                        i4 = ((iM6981 ^ i2) * (-17201)) ^ (-796312140);
                        i5 = 1324865310;
                    } else {
                        iM6981 = (C0630.m2566("ۗۜ") + i2) * (-67);
                        i4 = ((iM6981 ^ i3) * 30793) ^ (-1278073355);
                        i5 = -1206765189;
                    }
                    break;
                case -213969891:
                case 608462678:
                    itM9029 = C2958.m9029(c9503.f28849);
                    iM6981 = (C0630.m2566("ۢ᩶") + i3) * 25;
                    i4 = ((iM6981 ^ i2) * 7125) ^ (-1928512513);
                    i5 = -171695755;
                    break;
                case -15691774:
                case 585797288:
                    if (C1504.m5179()) {
                        iM6981 = (i2 - C2105.m6981("᩶ۘ")) * (-39);
                        i4 = ((iM6981 ^ i3) * (-13669)) ^ 1286183516;
                        i5 = -690642771;
                    } else {
                        iM6981 = C2105.m6981("ܽۧ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 11565) ^ 1116037475;
                        i5 = -259901562;
                    }
                    break;
                case 105535881:
                case 1499066833:
                    return false;
                case 563415603:
                case 1427097684:
                    C1128.m3851();
                    C0483.m2121();
                    return false;
                case 672787213:
                case 1918076197:
                    if (C0714.f2697 >= 0) {
                        iM6981 = (i2 - C2105.m6981("᩻ۙ")) * (-3);
                        i4 = ((iM6981 ^ i3) * 18757) ^ (-154636014);
                        i5 = 683458107;
                    } else {
                        iM6981 = (C2105.m6981("᩶᩵") + i2) * 13;
                        i4 = ((iM6981 ^ i3) * 1681) ^ 1943825958;
                        i5 = -1502745199;
                    }
                    break;
                case 1749306615:
                case 1778431151:
                    onTouchListener.onTouch(view, motionEvent);
                    iM6981 = C0630.m2566("۠ۤ") ^ i2;
                    i4 = ((iM6981 ^ i3) * 17179) ^ 738796116;
                    i5 = 740072986;
                    break;
                case 2030499572:
                case 2130218379:
                    if (C0714.m2805()) {
                        iM6981 = (C2105.m6981("ۜ۠") + i3) * (-105);
                        i4 = ((iM6981 ^ i2) * 9163) ^ 261510540;
                        i5 = 1076934443;
                    } else {
                        iM6981 = (i2 - C2105.m6981("᩻ۙ")) * (-3);
                        i4 = ((iM6981 ^ i3) * 18757) ^ (-154636014);
                        i5 = 683458107;
                    }
                    break;
                default:
                    onTouchListener = c9503.f28870;
                    if (onTouchListener != null) {
                        iM6981 = (i3 - C2105.m6981("᩻ۧ")) * 69;
                        i4 = ((iM6981 ^ i2) * 3579) ^ 642229871;
                        i5 = -335444647;
                    } else {
                        iM6981 = C0630.m2566("۠ۤ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 17179) ^ 738796116;
                        i5 = 740072986;
                    }
                    break;
            }
        }
    }
}
