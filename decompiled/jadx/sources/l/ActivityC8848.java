package l;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.alipay.sdk.m.y.q;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.tabs.TabLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۡۧ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 72SJ */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC8848 extends AbstractActivityC3346 implements TextWatcher {

    /* JADX INFO: renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f26934 = 0;

    /* JADX INFO: renamed from: ᩶ۛ۟, reason: not valid java name and contains not printable characters */
    private static final short[] f26935 = {6389, -25664, 18663, 30064, 28545, 26703, 25240, 24709, -29111, -31852, 7771, 7751, 7774, 7756, 7746, 7749, 7778, 7759, 7749, 7754, 7750, 7758, 7778, 7749, 7775, 7758, 7749, 7775, 7691, 7758, 7769, 7769, 7748, 7769, -31743, -25096, 19069, -31904, 18565, 29243, 19778, 32461, -25135, 18591, 18674, -31768, ColorResourcesTableCreator.HEADER_TYPE_PACKAGE, -26334, 26629, -22311, 30616, -32160, -29744, 735, 2098, -5621, 12387, 5415, -1003, -6831, -2476, 2383, 3579, 28160, 28161, 28162, 7825, -16925, -16958, -16943, -16958, -16949, -16952, -16937, -16958, -16939, -16926, -16957, -16946, -16941, -16922, -16956, -16941, -16946, -16943, -16946, -16941, -16930};

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public boolean f26936;

    /* JADX INFO: renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public boolean f26937;

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public TabLayout f26938;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public long f26939;

    /* JADX INFO: renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public C0452 f26940;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f26941;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public View f26942;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public String f26943;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public View f26944;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = -1578413999;
        int i5 = C0483.f2088;
        int i6 = C1420.f5096;
        int iM2566 = C0630.m2566("ۜ۬") ^ i6;
        int i7 = ((iM2566 ^ i5) * (-25239)) ^ 1778870187;
        int i8 = 329252026;
        while (true) {
            i4 = ((((i4 ^ i5) * (-21177)) >> 31) & i7) ^ (iM2566 ^ i8);
            switch (i4) {
                case -1946502612:
                case 1823409060:
                    C22628.m50615();
                    break;
                case -1780686700:
                case -788814619:
                    if (C2520.m8026()) {
                        iM2566 = C0630.m2566("֫֫") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-24877)) ^ 491280790;
                        i8 = 1687857170;
                    } else {
                        iM2566 = (C0630.m2566("ۛۡ") ^ i5) * (-23);
                        i7 = ((iM2566 ^ i6) * (-30035)) ^ 1919676633;
                        i8 = -1401625109;
                    }
                    break;
                case -1685571594:
                case 444957920:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = (C2105.m6981("ۛ᩺") + i5) * (-103);
                        i7 = ((iM2566 ^ i6) * (-3767)) ^ 578487000;
                        i8 = -393463767;
                    } else {
                        iM2566 = C2105.m6981("᩹۬") ^ i5;
                        i7 = ((iM2566 ^ i6) * 2501) ^ 523673597;
                        i8 = 1901887144;
                    }
                    break;
                case -1585373470:
                case 845138644:
                    break;
                case -1367600328:
                case -1337017903:
                    if (C0483.m2121()) {
                        iM2566 = C0630.m2566("ۤᩳ") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-18379)) ^ 1980373879;
                        i8 = -1401037153;
                    } else {
                        iM2566 = C2105.m6981("ۢܰ") ^ i6;
                        i7 = ((iM2566 ^ i5) * 21889) ^ (-871429404);
                        i8 = -1170741976;
                    }
                    break;
                case -1291999922:
                case 1794172930:
                    if (C0630.f2410 <= 0) {
                        iM2566 = C2105.m6981("ۢܰ") ^ i6;
                        i7 = ((iM2566 ^ i5) * 21889) ^ (-871429404);
                        i8 = -1170741976;
                    } else {
                        iM2566 = (C0630.m2566("ۖ᩻") ^ i5) * (-67);
                        i7 = ((iM2566 ^ i6) * (-1533)) ^ (-1761424200);
                        i8 = -1409714278;
                    }
                    break;
                case -1131560369:
                case -100801998:
                    if (C4616.f14690 > 0) {
                        iM2566 = (C2105.m6981("ۛ᩺") + i5) * (-103);
                        i7 = ((iM2566 ^ i6) * (-3767)) ^ 578487000;
                        i8 = -393463767;
                    } else {
                        iM2566 = C2105.m6981("۬ܶ") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-11853)) ^ 104310671;
                        i8 = 795149818;
                    }
                    break;
                case -869130581:
                case 1649040002:
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = C2105.m6981("ۢܰ") ^ i6;
                        i7 = ((iM2566 ^ i5) * 21889) ^ (-871429404);
                        i8 = -1170741976;
                    } else {
                        iM2566 = (C0630.m2566("ܳۜ") + i6) * (-97);
                        i7 = ((iM2566 ^ i5) * 15969) ^ 122600217;
                        i8 = 1499745823;
                    }
                    break;
                case -790363109:
                case 1199461013:
                    C4159.m12565();
                    if (C7811.f24123 >= 0) {
                        iM2566 = C0630.m2566("֫֫") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-24877)) ^ 491280790;
                        i8 = 1687857170;
                    } else {
                        iM2566 = C0630.m2566("ᩳ᩷") ^ i5;
                        i7 = ((iM2566 ^ i6) * 17831) ^ 371258905;
                        i8 = 2137636645;
                    }
                    break;
                case -273156860:
                case 1220128267:
                    if (C1128.f4106 <= 0) {
                        iM2566 = C0630.m2566("֫֫") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-24877)) ^ 491280790;
                        i8 = 1687857170;
                    } else {
                        iM2566 = C2105.m6981("ۛۨ") ^ i5;
                        i7 = ((iM2566 ^ i6) * (-18917)) ^ 1921419871;
                        i8 = -1282450616;
                    }
                    break;
                case -173243110:
                case 1606069766:
                    if (C21923.f70183 != 0) {
                        iM2566 = C2105.m6981("۬ܶ") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-11853)) ^ 104310671;
                        i8 = 795149818;
                    } else {
                        iM2566 = C0630.m2566("ۧۨ") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-24875)) ^ (-1107548104);
                        i8 = 1498383253;
                    }
                    break;
                case 123581479:
                case 1823266342:
                    if (C1420.m4913()) {
                        iM2566 = C2105.m6981("۬ܶ") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-11853)) ^ 104310671;
                        i8 = 795149818;
                    } else {
                        iM2566 = C2105.m6981("ܰ᩵") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-19137)) ^ (-533236510);
                        i8 = 691718867;
                    }
                    break;
                case 380628380:
                case 1113281285:
                    if (C11340.f33930 >= 0) {
                        iM2566 = C0630.m2566("ᩳ᩷") ^ i5;
                        i7 = ((iM2566 ^ i6) * 17831) ^ 371258905;
                        i8 = 2137636645;
                    } else {
                        iM2566 = C2105.m6981("ۤ֫") ^ i6;
                        i7 = ((iM2566 ^ i5) * 14021) ^ (-1292309919);
                        i8 = -1825463242;
                    }
                    break;
                case 624756938:
                case 1347812542:
                    if (C0964.f3626 != 0) {
                        iM2566 = C2105.m6981("ۢܰ") ^ i6;
                        i7 = ((iM2566 ^ i5) * 21889) ^ (-871429404);
                        i8 = -1170741976;
                    } else {
                        iM2566 = (i5 - C2105.m6981("֫ۤ")) * (-19);
                        i7 = ((iM2566 ^ i6) * (-23557)) ^ 423469147;
                        i8 = 304378272;
                    }
                    break;
                case 659605222:
                case 913570533:
                    if (C11340.f33930 < 0) {
                        iM2566 = C0630.m2566("ᩳ᩷") ^ i5;
                        i7 = ((iM2566 ^ i6) * 17831) ^ 371258905;
                        i8 = 2137636645;
                    } else {
                        iM2566 = C2105.m6981("۬ܶ") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-11853)) ^ 104310671;
                        i8 = 795149818;
                    }
                    break;
                default:
                    C0714.m2805();
                    iM2566 = C2105.m6981("۬ܶ") ^ i6;
                    i7 = ((iM2566 ^ i5) * (-11853)) ^ 104310671;
                    i8 = 795149818;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i = 0;
        short s3 = 0;
        int i2 = 0;
        int i3 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = 850468707;
        int i6 = C1773.f6144;
        int i7 = C22628.f73083;
        int iM6981 = (C2105.m6981("۬᩸") ^ i6) * (-65);
        int i8 = ((iM6981 ^ i7) * 26087) ^ 2111015628;
        int i9 = -1500521073;
        while (true) {
            i5 = ((((i5 ^ i7) * 8217) >> 31) & i8) ^ (iM6981 ^ i9);
            switch (i5) {
                case -2129583117:
                case 1960224598:
                    i3 = 48551;
                    iM6981 = C0630.m2566("ᩳۧ") ^ i6;
                    i8 = ((iM6981 ^ i7) * 22875) ^ (-376648319);
                    i9 = 744987044;
                    break;
                case -2024674039:
                case -1825338906:
                    sArr = f26935;
                    if (C2105.f7037 != 0) {
                        iM6981 = (C2105.m6981("۫᩷") ^ i7) * (-31);
                        i8 = ((iM6981 ^ i6) * 27907) ^ 310489728;
                        i9 = -504499675;
                    } else {
                        iM6981 = (i7 - C2105.m6981("ۙ᩵")) * (-93);
                        i8 = ((iM6981 ^ i6) * 1353) ^ 2020134136;
                        i9 = -267663258;
                    }
                    break;
                case -1735866870:
                case -1373695487:
                    C3911.m11924();
                    C4117.m12364();
                    iM6981 = C0630.m2566("ܽ᩹") ^ i6;
                    i8 = ((iM6981 ^ i7) * 18465) ^ 693432282;
                    i9 = -233713588;
                    break;
                case -1690714602:
                case -938098749:
                    s = sArr[c];
                    s2 = 9880;
                    if (C0798.f2919) {
                        iM6981 = C2105.m6981("۟֫") ^ i6;
                        i8 = ((iM6981 ^ i7) * 3513) ^ 714401999;
                        i9 = 2023991209;
                    } else {
                        iM6981 = (C0630.m2566("֫֨") ^ i6) * 39;
                        i8 = ((iM6981 ^ i7) * 4273) ^ (-885305514);
                        i9 = 292147529;
                    }
                    break;
                case -1673219031:
                case 1451331866:
                    if (i - (i2 * i2) > 0) {
                        iM6981 = C0630.m2566("֫֡") ^ i7;
                        i8 = ((iM6981 ^ i6) * (-8615)) ^ (-354578185);
                        i9 = 839922078;
                    } else {
                        iM6981 = C2105.m6981("᩺᩶") ^ i6;
                        i8 = ((iM6981 ^ i7) * 27093) ^ 205307832;
                        i9 = 1516800412;
                    }
                    break;
                case -1663635021:
                case 730852784:
                    if (C1504.f5354) {
                        iM6981 = (C0630.m2566("۬ۖ") + i6) * 37;
                        i8 = ((iM6981 ^ i7) * (-19737)) ^ (-840174939);
                        i9 = -352592289;
                    } else {
                        iM6981 = C2105.m6981("᩸ۛ") ^ i6;
                        i8 = ((iM6981 ^ i7) * 17007) ^ 215693848;
                        i9 = 1980050749;
                    }
                    break;
                case -1208986288:
                case -572810525:
                    if (C2958.f9394 >= 0) {
                        iM6981 = C0630.m2566("ܺܳ") ^ i7;
                        i8 = ((iM6981 ^ i6) * (-4343)) ^ (-310941267);
                        i9 = 1755488063;
                    } else {
                        iM6981 = C2105.m6981("ۗ᩹") ^ i6;
                        i8 = ((iM6981 ^ i7) * 23447) ^ 101836430;
                        i9 = -945044249;
                    }
                    break;
                case -1154363750:
                case 1488680872:
                    if (C3683.f11629 >= 0) {
                        iM6981 = C2105.m6981("۟֫") ^ i6;
                        i8 = ((iM6981 ^ i7) * 3513) ^ 714401999;
                        i9 = 2023991209;
                    } else {
                        iM6981 = C2105.m6981("᩵ۛ") ^ i7;
                        i8 = ((iM6981 ^ i6) * (-27695)) ^ (-47195344);
                        i9 = -2112853835;
                    }
                    break;
                case -997744977:
                case 730134207:
                    if (C3245.f10203 > 0) {
                        iM6981 = (C2105.m6981("۫᩷") ^ i7) * (-31);
                        i8 = ((iM6981 ^ i6) * 27907) ^ 310489728;
                        i9 = -504499675;
                    } else {
                        iM6981 = C0630.m2566("ܽ᩹") ^ i6;
                        i8 = ((iM6981 ^ i7) * 18465) ^ 693432282;
                        i9 = -233713588;
                    }
                    break;
                case -996318308:
                case 47825542:
                    sArr2 = f26935;
                    i4 = 67;
                    if (C2958.f9394 >= 0) {
                        iM6981 = C2105.m6981("۟֫") ^ i6;
                        i8 = ((iM6981 ^ i7) * 3513) ^ 714401999;
                        i9 = 2023991209;
                    } else {
                        iM6981 = (C0630.m2566("ۨۙ") + i7) * (-53);
                        i8 = ((iM6981 ^ i6) * (-23691)) ^ (-313704526);
                        i9 = -1707619299;
                    }
                    break;
                case -697664939:
                case -592688282:
                    RunnableC0588.m2441();
                    return null;
                case -384414829:
                case 1353480204:
                    if (C2520.m8026()) {
                        iM6981 = C0630.m2566("ܺܳ") ^ i7;
                        i8 = ((iM6981 ^ i6) * (-4343)) ^ (-310941267);
                        i9 = 1755488063;
                    } else {
                        iM6981 = (i6 - C2105.m6981("֨۬")) * (-7);
                        i8 = ((iM6981 ^ i7) * 4835) ^ (-514378151);
                        i9 = -1548559612;
                    }
                    break;
                case -342652019:
                case 1444814067:
                    if (C7106.f21815 != 0) {
                        iM6981 = C0630.m2566("ܺܳ") ^ i7;
                        i8 = ((iM6981 ^ i6) * (-4343)) ^ (-310941267);
                        i9 = 1755488063;
                    } else {
                        iM6981 = C0630.m2566("ܽ᩹") ^ i6;
                        i8 = ((iM6981 ^ i7) * 18465) ^ 693432282;
                        i9 = -233713588;
                    }
                    break;
                case 19145111:
                case 133399083:
                    i3 = 31766;
                    iM6981 = C0630.m2566("ᩳۧ") ^ i6;
                    i8 = ((iM6981 ^ i7) * 22875) ^ (-376648319);
                    i9 = 744987044;
                    break;
                case 256476027:
                case 1624247064:
                    i2 = s + s3;
                    if (C0237.f1507 != 0) {
                        iM6981 = (C2105.m6981("۫᩷") ^ i7) * (-31);
                        i8 = ((iM6981 ^ i6) * 27907) ^ 310489728;
                        i9 = -504499675;
                    } else {
                        iM6981 = (i7 - C0630.m2566("ۤᩳ")) * (-127);
                        i8 = ((iM6981 ^ i6) * 8433) ^ 1675982897;
                        i9 = -661513987;
                    }
                    break;
                case 407418460:
                case 459642150:
                    c = 'B';
                    if (C1047.f3863 >= 0) {
                        iM6981 = (C2105.m6981("۫᩷") ^ i7) * (-31);
                        i8 = ((iM6981 ^ i6) * 27907) ^ 310489728;
                        i9 = -504499675;
                    } else {
                        iM6981 = C0630.m2566("ۘ᩵") ^ i7;
                        i8 = ((iM6981 ^ i6) * (-21325)) ^ 1322617805;
                        i9 = -34187331;
                    }
                    break;
                case 536445636:
                case 1564573413:
                    if (C1294.f4556 >= 0) {
                        iM6981 = (C0630.m2566("۬ۖ") + i6) * 37;
                        i8 = ((iM6981 ^ i7) * (-19737)) ^ (-840174939);
                        i9 = -352592289;
                    } else {
                        iM6981 = (C2105.m6981("۫᩷") ^ i7) * (-31);
                        i8 = ((iM6981 ^ i6) * 27907) ^ 310489728;
                        i9 = -504499675;
                    }
                    break;
                case 543066689:
                case 1306925313:
                    return C4616.m13542(sArr2, i4, 21, i3);
                default:
                    i = s * s2;
                    s3 = 2470;
                    if (C1128.m3851() <= 0) {
                        iM6981 = C2105.m6981("۟֫") ^ i6;
                        i8 = ((iM6981 ^ i7) * 3513) ^ 714401999;
                        i9 = 2023991209;
                    } else {
                        iM6981 = (C0630.m2566("᩸ۜ") + i7) * (-73);
                        i8 = ((iM6981 ^ i6) * (-23035)) ^ 248023920;
                        i9 = -1048112423;
                    }
                    break;
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = -1849641418;
        int i5 = C3245.f10203;
        int i6 = C22628.f73083;
        int iM6981 = (C2105.m6981("ۛ֫") ^ i5) * (-121);
        int i7 = ((iM6981 ^ i6) * (-6739)) ^ 1343699559;
        int i8 = 252631076;
        while (true) {
            i4 = ((((i4 ^ i6) * (-24299)) >> 31) & i7) ^ (iM6981 ^ i8);
            switch (i4) {
                case -2126271667:
                case 1917413019:
                    if (C0798.f2919) {
                        iM6981 = C2105.m6981("۟ܰ") ^ i5;
                        i7 = ((iM6981 ^ i6) * 4579) ^ 328538510;
                        i8 = -1172837243;
                    } else {
                        iM6981 = C2105.m6981("ۨܿ") ^ i6;
                        i7 = ((iM6981 ^ i5) * (-27465)) ^ 1478648742;
                        i8 = -71688119;
                    }
                    break;
                case -2106627900:
                case -1147159476:
                    if (C0237.m1481() >= 0) {
                        iM6981 = C0630.m2566("᩷ۛ") ^ i5;
                        i7 = ((iM6981 ^ i6) * 18663) ^ (-763807901);
                        i8 = -862720552;
                    } else {
                        iM6981 = (C2105.m6981("֫۟") ^ i6) * (-19);
                        i7 = ((iM6981 ^ i5) * 16049) ^ 1755236521;
                        i8 = 83540174;
                    }
                    break;
                case -1737594660:
                case -1152698948:
                    ServiceConnectionC3453.m10564();
                    C1711.m5736();
                    iM6981 = C0630.m2566("᩻ۖ") ^ i6;
                    i7 = ((iM6981 ^ i5) * 32765) ^ 1675954851;
                    i8 = 434038418;
                    break;
                case -1725902847:
                case -1566458090:
                    if (C3683.f11629 >= 0) {
                        iM6981 = C2105.m6981("۟ܰ") ^ i5;
                        i7 = ((iM6981 ^ i6) * 4579) ^ 328538510;
                        i8 = -1172837243;
                    } else {
                        iM6981 = C0630.m2566("᩶᩺") ^ i6;
                        i7 = ((iM6981 ^ i5) * (-7297)) ^ 1286230380;
                        i8 = 1462613694;
                    }
                    break;
                case -1516573630:
                case 361844172:
                    if (C2167.f7158 >= 0) {
                        iM6981 = C0630.m2566("᩻ۖ") ^ i6;
                        i7 = ((iM6981 ^ i5) * 32765) ^ 1675954851;
                        i8 = 434038418;
                    } else {
                        iM6981 = (C2105.m6981("ۤ᩷") ^ i6) * 3;
                        i7 = ((iM6981 ^ i5) * 14401) ^ 1429529254;
                        i8 = 561201532;
                    }
                    break;
                case -1491864160:
                case 2016387858:
                    if (C1047.f3863 >= 0) {
                        iM6981 = C0630.m2566("᩻ۖ") ^ i6;
                        i7 = ((iM6981 ^ i5) * 32765) ^ 1675954851;
                        i8 = 434038418;
                    } else {
                        iM6981 = C2105.m6981("ᩴ֨") ^ i6;
                        i7 = ((iM6981 ^ i5) * 5735) ^ 1587362191;
                        i8 = 1202280908;
                    }
                    break;
                case -1377898847:
                case 441468977:
                    this.f26937 = true;
                    break;
                case -832963587:
                case 967371295:
                    if (C5695.f17556 >= 0) {
                        iM6981 = C0630.m2566("᩷ۛ") ^ i5;
                        i7 = ((iM6981 ^ i6) * 18663) ^ (-763807901);
                        i8 = -862720552;
                    } else {
                        iM6981 = (i5 - C0630.m2566("۠ܳ")) * q.h;
                        i7 = ((iM6981 ^ i6) * 7109) ^ (-1677147356);
                        i8 = 1900968451;
                    }
                    break;
                case -286683404:
                case 1285401694:
                    AbstractC2021.m6574();
                    if (C0798.m2998() == 0) {
                        iM6981 = C0630.m2566("᩻ۖ") ^ i6;
                        i7 = ((iM6981 ^ i5) * 32765) ^ 1675954851;
                        i8 = 434038418;
                    } else {
                        iM6981 = C0630.m2566("ۤᩳ") ^ i6;
                        i7 = ((iM6981 ^ i5) * (-3455)) ^ (-1778398860);
                        i8 = -618972416;
                    }
                    break;
                case -285684244:
                case 341949468:
                    RunnableC1108.m3790();
                    if (!C1916.f6442) {
                        iM6981 = C0630.m2566("᩻ۖ") ^ i6;
                        i7 = ((iM6981 ^ i5) * 32765) ^ 1675954851;
                        i8 = 434038418;
                    } else {
                        iM6981 = C2105.m6981("۟ܰ") ^ i5;
                        i7 = ((iM6981 ^ i6) * 4579) ^ 328538510;
                        i8 = -1172837243;
                    }
                    break;
                case 82010085:
                case 1598808095:
                    if (C3746.f11829 <= 0) {
                        iM6981 = C2105.m6981("۟ܰ") ^ i5;
                        i7 = ((iM6981 ^ i6) * 4579) ^ 328538510;
                        i8 = -1172837243;
                    } else {
                        iM6981 = (C0630.m2566("۠ᩴ") ^ i5) * 5;
                        i7 = ((iM6981 ^ i6) * (-779)) ^ (-417007540);
                        i8 = 247539962;
                    }
                    break;
                case 302409976:
                case 1102180546:
                    if (C5695.m16023() >= 0) {
                        iM6981 = C0630.m2566("᩻ۖ") ^ i6;
                        i7 = ((iM6981 ^ i5) * 32765) ^ 1675954851;
                        i8 = 434038418;
                    } else {
                        iM6981 = (C2105.m6981("۬ܿ") ^ i5) * (-59);
                        i7 = ((iM6981 ^ i6) * 12581) ^ 1850649894;
                        i8 = -1427253177;
                    }
                    break;
                case 605028633:
                case 742317002:
                    C3683.m11222();
                    break;
                case 827620035:
                case 1312134304:
                    C1294.m4372();
                    if (C0483.f2088 < 0) {
                        iM6981 = C0630.m2566("᩷ۛ") ^ i5;
                        i7 = ((iM6981 ^ i6) * 18663) ^ (-763807901);
                        i8 = -862720552;
                    } else {
                        iM6981 = C2105.m6981("۟ܰ") ^ i5;
                        i7 = ((iM6981 ^ i6) * 4579) ^ 328538510;
                        i8 = -1172837243;
                    }
                    break;
                case 1657667225:
                case 1886489540:
                    if (C0050.m940() <= 0) {
                        iM6981 = C0630.m2566("᩷ۛ") ^ i5;
                        i7 = ((iM6981 ^ i6) * 18663) ^ (-763807901);
                        i8 = -862720552;
                    } else {
                        iM6981 = (C0630.m2566("ۘ֨") + i5) * (-127);
                        i7 = ((iM6981 ^ i6) * 27631) ^ 1439620431;
                        i8 = -1529813254;
                    }
                    break;
                default:
                    if (C3537.f11231 >= 0) {
                        iM6981 = C0630.m2566("ۚۢ") ^ i6;
                        i7 = ((iM6981 ^ i5) * 28213) ^ 924226876;
                        i8 = 2077640971;
                    } else {
                        iM6981 = C2105.m6981("ۗ᩸") ^ i5;
                        i7 = ((iM6981 ^ i6) * (-10945)) ^ 1693516518;
                        i8 = 942276312;
                    }
                    break;
            }
            return;
        }
    }

    public ActivityC8848() {
        ArrayList arrayList = null;
        int i = 1393180616;
        int i2 = RunnableC1937.f6483;
        int i3 = C0422.f1886;
        int iM2566 = (C0630.m2566("֫ܶ") + i3) * (-95);
        int i4 = ((iM2566 ^ i2) * (-16167)) ^ 102803346;
        int i5 = 1851003101;
        while (true) {
            i = ((((i ^ i2) * (-16563)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2065708290:
                case 1819082525:
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = (C0630.m2566("֨֫") + i2) * (-13);
                        i4 = ((iM2566 ^ i3) * (-243)) ^ (-521130185);
                        i5 = 1239590462;
                    } else {
                        iM2566 = C0630.m2566("᩹֫") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-14507)) ^ 1770228572;
                        i5 = -365942680;
                    }
                    break;
                case -2055359104:
                case -561586295:
                    C3245.m9925();
                    if (C11340.f33930 < 0) {
                        iM2566 = C0630.m2566("ۛۜ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 7945) ^ 1271218153;
                        i5 = -578655659;
                    } else {
                        iM2566 = C2105.m6981("֨ᩴ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 15915) ^ (-1874647562);
                        i5 = 657199721;
                    }
                    break;
                case -1895514387:
                case 1340710016:
                    C1916.m6308();
                    C2126.m7040();
                    iM2566 = C2105.m6981("֡۬") ^ i3;
                    i4 = ((iM2566 ^ i2) * 26043) ^ (-416976975);
                    i5 = -1044110871;
                    break;
                case -1815739504:
                case -1158665997:
                    if (C1047.f3863 >= 0) {
                        iM2566 = C2105.m6981("֨ᩴ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 15915) ^ (-1874647562);
                        i5 = 657199721;
                    } else {
                        iM2566 = (C2105.m6981("ۧܺ") + i3) * 65;
                        i4 = ((iM2566 ^ i2) * 31229) ^ (-1334148014);
                        i5 = -264757233;
                    }
                    break;
                case -1546908357:
                case 816643279:
                    if (C0714.f2697 >= 0) {
                        iM2566 = C2105.m6981("֡۬") ^ i3;
                        i4 = ((iM2566 ^ i2) * 26043) ^ (-416976975);
                        i5 = -1044110871;
                    } else {
                        iM2566 = (i2 - C0630.m2566("֡ۘ")) * (-105);
                        i4 = ((iM2566 ^ i3) * (-6339)) ^ 2102515489;
                        i5 = 958449410;
                    }
                    break;
                case -1498357089:
                case 1070045348:
                    if (C0237.f1507 == 0) {
                        iM2566 = (C0630.m2566("ۤۙ") + i2) * (-123);
                        i4 = ((iM2566 ^ i3) * (-5613)) ^ (-450689021);
                        i5 = 1746756726;
                    } else {
                        iM2566 = C2105.m6981("֡۬") ^ i3;
                        i4 = ((iM2566 ^ i2) * 26043) ^ (-416976975);
                        i5 = -1044110871;
                    }
                    break;
                case -1410942254:
                case 533996244:
                    if (C2272.f7362) {
                        iM2566 = (C0630.m2566("ۤۙ") + i2) * (-123);
                        i4 = ((iM2566 ^ i3) * (-5613)) ^ (-450689021);
                        i5 = 1746756726;
                    } else {
                        iM2566 = (C2105.m6981("ܺܺ") + i2) * (-69);
                        i4 = ((iM2566 ^ i3) * 15235) ^ 1416309294;
                        i5 = -1053132173;
                    }
                    break;
                case -1371909711:
                case 291725173:
                    arrayList = new ArrayList();
                    if (C0798.f2919) {
                        iM2566 = C2105.m6981("֡۬") ^ i3;
                        i4 = ((iM2566 ^ i2) * 26043) ^ (-416976975);
                        i5 = -1044110871;
                    } else {
                        iM2566 = (C2105.m6981("᩵֡") + i3) * (-117);
                        i4 = ((iM2566 ^ i2) * 20873) ^ 684078369;
                        i5 = -1014165748;
                    }
                    break;
                case -1008611217:
                case 1485699395:
                    if (C4159.f13567) {
                        iM2566 = (C0630.m2566("ܺ۟") + i2) * (-19);
                        i4 = ((iM2566 ^ i3) * (-31497)) ^ (-1214510968);
                        i5 = 1253432220;
                    } else {
                        iM2566 = C0630.m2566("ۛۜ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 7945) ^ 1271218153;
                        i5 = -578655659;
                    }
                    break;
                case -699914643:
                case 1281453598:
                    if (C3911.f12484 < 0) {
                        iM2566 = C2105.m6981("֨ᩴ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 15915) ^ (-1874647562);
                        i5 = 657199721;
                    } else {
                        iM2566 = C2105.m6981("֡۬") ^ i3;
                        i4 = ((iM2566 ^ i2) * 26043) ^ (-416976975);
                        i5 = -1044110871;
                    }
                    break;
                case -651176061:
                case 1865865714:
                    C4159.m12565();
                    throw new RuntimeException();
                case -220704453:
                case 1939246922:
                    this.f26941 = arrayList;
                    return;
                case 282281209:
                case 1722849151:
                    if (AbstractC2021.m6574()) {
                        iM2566 = C2105.m6981("֡۬") ^ i3;
                        i4 = ((iM2566 ^ i2) * 26043) ^ (-416976975);
                        i5 = -1044110871;
                    } else {
                        iM2566 = C0630.m2566("ۜ᩶") ^ i2;
                        i4 = ((iM2566 ^ i3) * 14299) ^ 600586888;
                        i5 = 722671811;
                    }
                    break;
                case 284368759:
                case 1592557298:
                    if (C3663.f11553) {
                        iM2566 = C2105.m6981("֡۬") ^ i3;
                        i4 = ((iM2566 ^ i2) * 26043) ^ (-416976975);
                        i5 = -1044110871;
                    } else {
                        iM2566 = C0630.m2566("ۖᩴ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 17395) ^ 1596874134;
                        i5 = 1979208014;
                    }
                    break;
                case 1830026257:
                case 2059724168:
                    if (C0422.m1963()) {
                        iM2566 = (C2105.m6981("۫۬") + i3) * (-13);
                        i4 = ((iM2566 ^ i2) * 22997) ^ 948250783;
                        i5 = -126612553;
                    } else {
                        iM2566 = C2105.m6981("֨ᩴ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 15915) ^ (-1874647562);
                        i5 = 657199721;
                    }
                    break;
                default:
                    if (C1711.f5919) {
                        iM2566 = C0630.m2566("ۛۜ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 7945) ^ 1271218153;
                        i5 = -578655659;
                    } else {
                        iM2566 = C2105.m6981("᩵۠") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-31613)) ^ (-936272538);
                        i5 = 973496051;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0089  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fd A[PHI: r8
      0x00fd: PHI (r8v3 java.lang.String) = (r8v2 java.lang.String), (r8v4 java.lang.String) binds: [B:37:0x00fb, B:29:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0137 A[PHI: r6 r7
      0x0137: PHI (r6v5 java.lang.String) = (r6v4 java.lang.String), (r6v2 java.lang.String), (r6v2 java.lang.String) binds: [B:41:0x0135, B:33:0x00dc, B:8:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x0137: PHI (r7v5 l.۟᩺ᩳ) = (r7v2 l.۟᩺ᩳ), (r7v4 l.۟᩺ᩳ), (r7v2 l.۟᩺ᩳ) binds: [B:41:0x0135, B:33:0x00dc, B:8:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x0196 A[PHI: r3 r5 r9 r15
      0x0196: PHI (r3v5 l.ۢۧ᩷) = (r3v4 l.ۢۧ᩷), (r3v2 l.ۢۧ᩷), (r3v2 l.ۢۧ᩷), (r3v2 l.ۢۧ᩷) binds: [B:52:0x0194, B:48:0x0174, B:21:0x0065, B:11:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0196: PHI (r5v4 l.ۤۤᩳ) = (r5v2 l.ۤۤᩳ), (r5v3 l.ۤۤᩳ), (r5v2 l.ۤۤᩳ), (r5v2 l.ۤۤᩳ) binds: [B:52:0x0194, B:48:0x0174, B:21:0x0065, B:11:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0196: PHI (r9v5 java.lang.String) = (r9v2 java.lang.String), (r9v2 java.lang.String), (r9v4 java.lang.String), (r9v2 java.lang.String) binds: [B:52:0x0194, B:48:0x0174, B:21:0x0065, B:11:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0196: PHI (r15v8 l.ۛᩳ᩷) = (r15v4 l.ۛᩳ᩷), (r15v5 l.ۛᩳ᩷), (r15v4 l.ۛᩳ᩷), (r15v4 l.ۛᩳ᩷) binds: [B:52:0x0194, B:48:0x0174, B:21:0x0065, B:11:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0280  */
    @Override // l.AbstractActivityC3346, l.ActivityC1252, l.ActivityC0737, android.app.Activity
    public final void onDestroy() {
        int iM6981;
        int i;
        C10465 c10465 = null;
        Iterator itM12354 = null;
        C9554 c9554 = null;
        C10235 c10235 = null;
        String strM947 = null;
        InterfaceC7785 interfaceC7785M3497 = null;
        String strM1959 = null;
        String strM6237 = null;
        int i2 = 2114559318;
        int i3 = C4263.f13799;
        int i4 = ServiceConnectionC3453.f10921;
        int iM6982 = C2105.m6981("ܽܶ") ^ i3;
        int i5 = ((iM6982 ^ i4) * (-19647)) ^ 1024713937;
        int i6 = -1270871362;
        while (true) {
            int i7 = iM6982 ^ i6;
            C6231 c6231 = null;
            while (true) {
                i2 = ((((i2 ^ i4) * (-9187)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2145598449:
                    case 1066287071:
                        super.onDestroy();
                        if (this.f26936) {
                            iM6981 = (C2105.m6981("᩵֨") + i4) * (-31);
                            i5 = ((iM6981 ^ i3) * (-24743)) ^ 1120198585;
                            i = 369185637;
                        } else {
                            iM6981 = (C2105.m6981("ܿ֫") ^ i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            i5 = ((iM6981 ^ i4) * (-10215)) ^ (-1519148140);
                            i = -1820819865;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -2038197202:
                    case 2014765987:
                        strM6237 = c9554.f28973.m6237();
                        if (C1711.f5919) {
                            iM6981 = (C0630.m2566("ܺۗ") + i3) * 37;
                            i5 = ((iM6981 ^ i4) * 9745) ^ (-1302052240);
                            i = -1051712081;
                        } else {
                            iM6981 = (C0630.m2566("ۚۜ") + i4) * q.h;
                            i5 = ((iM6981 ^ i3) * (-15817)) ^ (-1501001770);
                            i = 846537685;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -2029468353:
                    case -1401756601:
                        C3746.m11368(c10465.f31405, strM6237, c6231);
                        iM6981 = C2105.m6981("᩵ۜ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-18515)) ^ 225613667;
                        i = -1886800523;
                        i7 = iM6981 ^ i;
                        break;
                    case -1992001654:
                    case -1186984221:
                        C1128.m3851();
                        if (!C3663.f11553) {
                        }
                        iM6981 = (C0630.m2566("ܺۗ") + i3) * 37;
                        i5 = ((iM6981 ^ i4) * 9745) ^ (-1302052240);
                        i = -1051712081;
                        i7 = iM6981 ^ i;
                        break;
                    case -1786491835:
                    case 68708975:
                        c9554 = (C9554) RunnableC1108.m3791(itM12354);
                        if (C0714.f2697 >= 0) {
                            iM6981 = (C0630.m2566("ܺۗ") + i3) * 37;
                            i5 = ((iM6981 ^ i4) * 9745) ^ (-1302052240);
                            i = -1051712081;
                        } else {
                            iM6981 = C2105.m6981("ܰ᩵") ^ i4;
                            i5 = ((iM6981 ^ i3) * (-23203)) ^ (-96259582);
                            i = -1492048908;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -1663712015:
                    case -769671914:
                        c6231.m17156(strM947);
                        if (C7106.f21815 != 0) {
                            iM6981 = C0630.m2566("ۘ۫") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-469)) ^ (-1481053005);
                            i = -2062111221;
                        } else {
                            iM6981 = (C2105.m6981("ۜܰ") ^ i4) * 83;
                            i5 = ((iM6981 ^ i3) * 4185) ^ (-226787329);
                            i = 2006202878;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -1548736814:
                    case -589275575:
                        interfaceC7785M3497 = C1005.m3497(c9554.f28971);
                        if (C3245.f10203 <= 0) {
                            iM6981 = (C0630.m2566("ܰ֡") + i4) * 119;
                            i5 = ((iM6981 ^ i3) * (-24709)) ^ 705540012;
                            i = -1628616332;
                        } else {
                            iM6981 = (C0630.m2566("֫ۨ") ^ i3) * 85;
                            i5 = ((iM6981 ^ i4) * (-23371)) ^ 490126385;
                            i = 1268585084;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -1320526800:
                    case 408490778:
                        if (C4263.f13799 > 0) {
                            iM6981 = (i4 - C2105.m6981("᩶ۨ")) * (-5);
                            i5 = ((iM6981 ^ i3) * (-18225)) ^ (-1408292319);
                            i = 476553440;
                        } else {
                            iM6981 = (C0630.m2566("ܰ֡") + i4) * 119;
                            i5 = ((iM6981 ^ i3) * (-24709)) ^ 705540012;
                            i = -1628616332;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -1229158749:
                    case 650135735:
                        c10465 = new C10465();
                        if (!C3683.m11222()) {
                            iM6981 = C2105.m6981("ܺ᩵") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-31635)) ^ 2070747112;
                            i = 1072251018;
                            i7 = iM6981 ^ i;
                        }
                        break;
                    case -1143560358:
                    case -158436342:
                        if (C0483.m2123(itM12354)) {
                            iM6981 = (C0630.m2566("᩻ۘ") ^ i3) * 7;
                            i5 = ((iM6981 ^ i4) * (-30837)) ^ 168894955;
                            i = -81932714;
                        } else {
                            iM6981 = (C2105.m6981("ܽۗ") ^ i4) * (-99);
                            i5 = ((iM6981 ^ i3) * (-16043)) ^ (-1008830353);
                            i = 1290945932;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -1115343485:
                    case -599064698:
                        strM947 = C0050.m947(C11340.m28030(c10235));
                        if (C1916.m6308() >= 0) {
                            iM6981 = (C0630.m2566("ܰ֡") + i4) * 119;
                            i5 = ((iM6981 ^ i3) * (-24709)) ^ 705540012;
                            i = -1628616332;
                        } else {
                            iM6981 = (C2105.m6981("ۚۖ") + i4) * (-3);
                            i5 = ((iM6981 ^ i3) * (-8055)) ^ (-1459303277);
                            i = -351653654;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -797134696:
                    case 1753074683:
                        c6231.m17158(strM1959);
                        if (C3746.m11369() >= 0) {
                            iM6981 = (i4 - C2105.m6981("᩶ۨ")) * (-5);
                            i5 = ((iM6981 ^ i3) * (-18225)) ^ (-1408292319);
                            i = 476553440;
                        } else {
                            iM6981 = C0630.m2566("֡۟") ^ i4;
                            i5 = ((iM6981 ^ i3) * 32679) ^ (-1635906713);
                            i = 1786041344;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -466751681:
                    case 1344501014:
                        if (!C2126.m7040()) {
                        }
                        iM6981 = (i4 - C2105.m6981("᩶ۨ")) * (-5);
                        i5 = ((iM6981 ^ i3) * (-18225)) ^ (-1408292319);
                        i = 476553440;
                        i7 = iM6981 ^ i;
                        break;
                    case -283545983:
                    case 1977831610:
                        C0964.m3413();
                        break;
                    case -103743127:
                    case 693900645:
                        strM1959 = C0422.m1959(interfaceC7785M3497);
                        if (C0798.f2919) {
                            iM6981 = C0630.m2566("ۘ۫") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-469)) ^ (-1481053005);
                            i = -2062111221;
                        } else {
                            iM6981 = C0630.m2566("ܶᩳ") ^ i3;
                            i5 = ((iM6981 ^ i4) * 29035) ^ (-1557664876);
                            i = 1545673518;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case 196449241:
                    case 717147350:
                        itM12354 = C4117.m12354(this.f26941);
                        iM6981 = C2105.m6981("᩵ۜ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-18515)) ^ 225613667;
                        i = -1886800523;
                        i7 = iM6981 ^ i;
                        break;
                    case 426370659:
                    case 1907544235:
                        break;
                    case 452671660:
                    case 1536431494:
                        if (this.f26937) {
                            iM6981 = (i4 - C2105.m6981("ۢܺ")) * (-67);
                            i5 = ((iM6981 ^ i3) * (-5709)) ^ (-1821382684);
                            i = 1307113947;
                        } else {
                            iM6981 = (C2105.m6981("ܿ֫") ^ i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            i5 = ((iM6981 ^ i4) * (-10215)) ^ (-1519148140);
                            i = -1820819865;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case 1130363946:
                    case 2051217333:
                        C4159.m12565();
                        break;
                    case 1273376705:
                    case 1851666762:
                        if (!C3663.f11553) {
                            c6231 = new C6231();
                            c10235 = c9554.f28974;
                            if (RunnableC1108.f4040) {
                                iM6981 = C2105.m6981("᩻ܽ") ^ i3;
                                i5 = ((iM6981 ^ i4) * 20805) ^ (-1253781273);
                                i = -401216884;
                            } else {
                                iM6981 = (C0630.m2566("ܺۗ") + i3) * 37;
                                i5 = ((iM6981 ^ i4) * 9745) ^ (-1302052240);
                                i = -1051712081;
                            }
                            i7 = iM6981 ^ i;
                        }
                        break;
                    default:
                        C11876.m29003(this.f26943, c10465);
                        iM6981 = (C2105.m6981("ܿ֫") ^ i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM6981 ^ i4) * (-10215)) ^ (-1519148140);
                        i = -1820819865;
                        i7 = iM6981 ^ i;
                        break;
                }
                return;
            }
            iM6982 = (i3 - C0630.m2566("۠֫")) * (-79);
            i5 = ((iM6982 ^ i4) * 16963) ^ (-1796600884);
            i6 = 952877004;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0246 A[PHI: r1 r3 r6 r9
      0x0246: PHI (r1v115 android.view.View) = (r1v90 android.view.View), (r1v101 android.view.View), (r1v116 android.view.View) binds: [B:43:0x0244, B:30:0x0179, B:8:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x0246: PHI (r3v46 l.ᩴ۫ܳ) = (r3v32 l.ᩴ۫ܳ), (r3v38 l.ᩴ۫ܳ), (r3v47 l.ᩴ۫ܳ) binds: [B:43:0x0244, B:30:0x0179, B:8:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x0246: PHI (r6v10 int) = (r6v2 int), (r6v6 int), (r6v2 int) binds: [B:43:0x0244, B:30:0x0179, B:8:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x0246: PHI (r9v7 short[]) = (r9v3 short[]), (r9v2 short[]), (r9v2 short[]) binds: [B:43:0x0244, B:30:0x0179, B:8:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        View view;
        ViewOnClickListenerC18759 viewOnClickListenerC18759;
        int iM2566;
        int i;
        int i2;
        short[] sArr;
        int iM6981;
        int i3;
        View view2;
        View view3;
        short[] sArr2;
        Intent intent;
        ViewOnClickListenerC18759 viewOnClickListenerC187510;
        C9762 c9762;
        View view4;
        Intent intent2;
        ViewOnClickListenerC18759 viewOnClickListenerC187511;
        C9762 c9763;
        int i4;
        int i5;
        int i6;
        short[] sArr3;
        int iM2567;
        int i7;
        View view5;
        Intent intent3;
        int iM6982;
        int i8;
        View view6;
        final ActivityC8848 activityC8848 = this;
        int i9 = C3019.f9544;
        int i10 = C7811.f24123;
        int iM6983 = C2105.m6981("᩺ۤ") ^ i10;
        int i11 = ((iM6983 ^ i9) * (-5301)) ^ (-1966977678);
        Intent intentM7034 = null;
        View viewM12813 = null;
        ViewOnClickListenerC18759 viewOnClickListenerC187512 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        int i12 = iM6983 ^ 854202714;
        int i13 = 0;
        int i14 = 0;
        int iM6984 = 0;
        short s = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int iM2568 = 0;
        int i18 = 0;
        C9762 c9764 = null;
        int i19 = -413664177;
        String strM10628 = null;
        View view7 = null;
        short[] sArr9 = null;
        short[] sArr10 = null;
        int iM6985 = 0;
        int i20 = 0;
        int iM6986 = 0;
        while (true) {
            i19 = i12 ^ (i11 & (((i19 ^ i9) * 22341) >> 31));
            switch (i19) {
                case -2095454281:
                case 1102589626:
                    view7 = view7;
                    sArr10 = sArr10;
                    intentM7034 = intentM7034;
                    viewOnClickListenerC187512 = viewOnClickListenerC187512;
                    c9764 = c9764;
                    i13 = i13;
                    short[] sArr11 = sArr9;
                    i16 = i16;
                    i17 = i17;
                    sArr = sArr11;
                    short s2 = f26935[0];
                    int i21 = s2 + 16059;
                    if (C2958.m9034() <= 0) {
                        s = s2;
                        i15 = i21;
                        iM6981 = (C2105.m6981("ᩳ᩵") + i10) * (-77);
                        i11 = ((iM6981 ^ i9) * (-30211)) ^ 1332201347;
                        i3 = 1324892011;
                        int i22 = iM6981 ^ i3;
                        sArr10 = sArr10;
                        i13 = i13;
                        c9764 = c9764;
                        viewOnClickListenerC187512 = viewOnClickListenerC187512;
                        intentM7034 = intentM7034;
                        view7 = view7;
                        i12 = i22;
                        activityC8848 = this;
                        short[] sArr12 = sArr;
                        i17 = i17;
                        i16 = i16;
                        sArr9 = sArr12;
                    } else {
                        int iM2569 = C0630.m2566("ۚۖ") ^ i10;
                        s = s2;
                        i15 = i21;
                        sArr10 = sArr10;
                        i11 = ((iM2569 ^ i9) * 5157) ^ 1315680609;
                        activityC8848 = this;
                        i12 = iM2569 ^ (-1595536511);
                        i13 = i13;
                        c9764 = c9764;
                        viewOnClickListenerC187512 = viewOnClickListenerC187512;
                        intentM7034 = intentM7034;
                        view7 = view7;
                        i17 = i17;
                        i16 = i16;
                        sArr9 = sArr;
                    }
                    break;
                case -1993554533:
                case 1699029302:
                    View view8 = view7;
                    viewOnClickListenerC18759 = viewOnClickListenerC187512;
                    intent3 = intentM7034;
                    strM10628 = RunnableC3474.m10628(intent3, C4159.m12578(sArr5, 18, 4, i20));
                    if (activityC8848.f26943 == null) {
                        view6 = view8;
                        int iM25610 = C0630.m2566("᩹ܶ") ^ i10;
                        i = ((iM25610 ^ i9) * (-24073)) ^ (-1744204034);
                        intentM7034 = intent3;
                        view7 = view6;
                        i12 = iM25610 ^ 1656449983;
                        i11 = i;
                        viewOnClickListenerC187512 = viewOnClickListenerC18759;
                    } else {
                        iM6982 = (C2105.m6981("֨ۜ") + i10) * 43;
                        view5 = view8;
                        i11 = ((iM6982 ^ i9) * 14099) ^ (-905018566);
                        i8 = 166250401;
                        int i23 = iM6982 ^ i8;
                        intentM7034 = intent3;
                        view7 = view5;
                        i12 = i23;
                        viewOnClickListenerC187512 = viewOnClickListenerC18759;
                    }
                    break;
                case -1881416149:
                case 1385384651:
                    sArr = sArr9;
                    i20 = 7723;
                    iM6981 = C2105.m6981("ۖۨ") ^ i10;
                    i11 = ((iM6981 ^ i9) * 18095) ^ (-552899112);
                    i3 = 1585411442;
                    int i24 = iM6981 ^ i3;
                    sArr10 = sArr10;
                    i13 = i13;
                    c9764 = c9764;
                    viewOnClickListenerC187512 = viewOnClickListenerC187512;
                    intentM7034 = intentM7034;
                    view7 = view7;
                    i12 = i24;
                    activityC8848 = this;
                    short[] sArr13 = sArr;
                    i17 = i17;
                    i16 = i16;
                    sArr9 = sArr13;
                    break;
                case -1873005235:
                case -1268682197:
                    C4263.m12819();
                    if (RunnableC1937.f6483 < 0) {
                        view7 = view7;
                        sArr10 = sArr10;
                        intentM7034 = intentM7034;
                        viewOnClickListenerC187512 = viewOnClickListenerC187512;
                        c9764 = c9764;
                        i13 = i13;
                        short[] sArr14 = sArr9;
                        i16 = i16;
                        i17 = i17;
                        sArr = sArr14;
                        iM6981 = C0630.m2566("ۗ᩵") ^ i9;
                        i11 = ((iM6981 ^ i10) * 8755) ^ (-1901630053);
                        i3 = 1007775016;
                        int i25 = iM6981 ^ i3;
                        sArr10 = sArr10;
                        i13 = i13;
                        c9764 = c9764;
                        viewOnClickListenerC187512 = viewOnClickListenerC187512;
                        intentM7034 = intentM7034;
                        view7 = view7;
                        i12 = i25;
                        activityC8848 = this;
                        short[] sArr15 = sArr;
                        i17 = i17;
                        i16 = i16;
                        sArr9 = sArr15;
                    } else {
                        view = view7;
                        viewOnClickListenerC18759 = viewOnClickListenerC187512;
                        iM2566 = C2105.m6981("᩵֨") ^ i10;
                        i = ((iM2566 ^ i9) * (-479)) ^ (-97072457);
                        i2 = -189525711;
                        i12 = iM2566 ^ i2;
                        view7 = view;
                        i11 = i;
                        viewOnClickListenerC187512 = viewOnClickListenerC18759;
                    }
                    break;
                case -1738638647:
                case 317271296:
                    View view9 = view7;
                    ViewOnClickListenerC18759 viewOnClickListenerC187513 = viewOnClickListenerC187512;
                    Intent intent4 = intentM7034;
                    short[] sArr16 = sArr4;
                    activityC8848.f26943 = AbstractC2021.m6570(intent4, C0630.m2575(sArr16, 10, 8, i20));
                    short[] sArr17 = f26935;
                    int iM6987 = (C2105.m6981("۟ۨ") + i9) * (-79);
                    i11 = ((iM6987 ^ i10) * (-18969)) ^ (-510588465);
                    intentM7034 = intent4;
                    view7 = view9;
                    i12 = iM6987 ^ (-811093185);
                    viewOnClickListenerC187512 = viewOnClickListenerC187513;
                    sArr4 = sArr16;
                    sArr5 = sArr17;
                    break;
                case -1688892962:
                case -830247518:
                    view3 = view7;
                    sArr2 = sArr10;
                    intent = intentM7034;
                    viewOnClickListenerC187510 = viewOnClickListenerC187512;
                    c9762 = c9764;
                    int i26 = i13;
                    C0964.m3409(activityC8848, iM6986 ^ 2097980676);
                    sArr9 = f26935;
                    i17 = 4;
                    i16 = 3;
                    if (C1005.f3721) {
                        int iM25611 = C0630.m2566("ۧۗ") ^ i9;
                        i11 = ((iM25611 ^ i10) * (-1681)) ^ (-1540553933);
                        sArr10 = sArr2;
                        i13 = i26;
                        c9764 = c9762;
                        viewOnClickListenerC187512 = viewOnClickListenerC187510;
                        intentM7034 = intent;
                        view7 = view3;
                        i12 = iM25611 ^ (-314540011);
                    } else {
                        i13 = i26;
                        int iM6988 = (C2105.m6981("ᩴᩴ") ^ i10) * (-67);
                        sArr10 = sArr2;
                        c9764 = c9762;
                        viewOnClickListenerC187512 = viewOnClickListenerC187510;
                        intentM7034 = intent;
                        view7 = view3;
                        i12 = iM6988 ^ (-48341082);
                        i11 = ((iM6988 ^ i9) * 7487) ^ (-1393314365);
                    }
                    activityC8848 = this;
                    break;
                case -1660409872:
                case 1808753782:
                    break;
                case -1626793692:
                case -303418285:
                    C4117.m12364();
                    C1504.m5179();
                    view = view7;
                    viewOnClickListenerC18759 = viewOnClickListenerC187512;
                    iM2566 = C2105.m6981("᩵֨") ^ i10;
                    i = ((iM2566 ^ i9) * (-479)) ^ (-97072457);
                    i2 = -189525711;
                    i12 = iM2566 ^ i2;
                    view7 = view;
                    i11 = i;
                    viewOnClickListenerC187512 = viewOnClickListenerC18759;
                    break;
                case -1572896905:
                case 463326916:
                    view = view7;
                    viewOnClickListenerC18759 = viewOnClickListenerC187512;
                    viewM12813 = C4263.m12813(activityC8848, C0630.m2566(RunnableC0588.m2436(sArr6, 37, 3, i20)) ^ 2102617896);
                    iM2566 = (C2105.m6981("֫ܳ") + i9) * 69;
                    i = ((iM2566 ^ i10) * (-19563)) ^ (-1809836294);
                    i2 = 134178374;
                    i12 = iM2566 ^ i2;
                    view7 = view;
                    i11 = i;
                    viewOnClickListenerC187512 = viewOnClickListenerC18759;
                    break;
                case -1264268917:
                case 343988632:
                    C2126.m7039(view7, viewOnClickListenerC187512);
                    view = view7;
                    viewOnClickListenerC18759 = viewOnClickListenerC187512;
                    if (C1294.m4371() - activityC8848.f26939 < 300) {
                        iM2566 = C0630.m2566("ۜ۠") ^ i9;
                        i = ((iM2566 ^ i10) * 5595) ^ 1576322087;
                        i2 = -2039597566;
                    } else {
                        iM2566 = C2105.m6981("᩶ۧ") ^ i10;
                        i = ((iM2566 ^ i9) * (-2303)) ^ (-1158645005);
                        i2 = -2063220390;
                    }
                    i12 = iM2566 ^ i2;
                    view7 = view;
                    i11 = i;
                    viewOnClickListenerC187512 = viewOnClickListenerC18759;
                    break;
                case -1043465250:
                case 441302780:
                    view = view7;
                    viewOnClickListenerC18759 = viewOnClickListenerC187512;
                    activityC8848.f26942 = C0964.m3409(activityC8848, C0630.m2566(C4263.m12817(sArr7, i14, i13, i20)) ^ 2119130476);
                    sArr8 = f26935;
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        iM2566 = (C0630.m2566("᩵ۢ") ^ i9) * 81;
                        i = ((iM2566 ^ i10) * 6407) ^ 614846646;
                        i2 = 1241378915;
                        i12 = iM2566 ^ i2;
                        view7 = view;
                        i11 = i;
                        viewOnClickListenerC187512 = viewOnClickListenerC18759;
                    } else {
                        view7 = view;
                        c9764 = c9764;
                        intentM7034 = intentM7034;
                        viewOnClickListenerC187512 = viewOnClickListenerC18759;
                        short[] sArr18 = sArr9;
                        i16 = i16;
                        i17 = i17;
                        sArr = sArr18;
                        iM6981 = (C2105.m6981("ᩳ᩵") + i10) * (-77);
                        i11 = ((iM6981 ^ i9) * (-30211)) ^ 1332201347;
                        i3 = 1324892011;
                        int i27 = iM6981 ^ i3;
                        sArr10 = sArr10;
                        i13 = i13;
                        c9764 = c9764;
                        viewOnClickListenerC187512 = viewOnClickListenerC187512;
                        intentM7034 = intentM7034;
                        view7 = view7;
                        i12 = i27;
                        activityC8848 = this;
                        short[] sArr19 = sArr;
                        i17 = i17;
                        i16 = i16;
                        sArr9 = sArr19;
                    }
                    break;
                case -776992090:
                case 1693796150:
                    if (C1294.f4556 < 0) {
                        view7 = view7;
                        intentM7034 = intentM7034;
                        viewOnClickListenerC187512 = viewOnClickListenerC187512;
                        c9764 = c9764;
                        i13 = i13;
                        short[] sArr110 = sArr9;
                        i16 = i16;
                        i17 = i17;
                        sArr = sArr110;
                        iM6981 = (C2105.m6981("ᩳ᩵") + i10) * (-77);
                        i11 = ((iM6981 ^ i9) * (-30211)) ^ 1332201347;
                        i3 = 1324892011;
                        int i28 = iM6981 ^ i3;
                        sArr10 = sArr10;
                        i13 = i13;
                        c9764 = c9764;
                        viewOnClickListenerC187512 = viewOnClickListenerC187512;
                        intentM7034 = intentM7034;
                        view7 = view7;
                        i12 = i28;
                        activityC8848 = this;
                        short[] sArr111 = sArr;
                        i17 = i17;
                        i16 = i16;
                        sArr9 = sArr111;
                    } else {
                        view = view7;
                        viewOnClickListenerC18759 = viewOnClickListenerC187512;
                        iM2566 = C2105.m6981("᩵֨") ^ i10;
                        i = ((iM2566 ^ i9) * (-479)) ^ (-97072457);
                        i2 = -189525711;
                        i12 = iM2566 ^ i2;
                        view7 = view;
                        i11 = i;
                        viewOnClickListenerC187512 = viewOnClickListenerC18759;
                    }
                    break;
                case -771635607:
                case 1267920417:
                    view4 = view7;
                    ViewOnClickListenerC18759 viewOnClickListenerC187514 = viewOnClickListenerC187512;
                    c9763 = c9764;
                    intent2 = intentM7034;
                    i4 = i13;
                    viewOnClickListenerC187511 = viewOnClickListenerC187514;
                    sArr3 = sArr10;
                    iM2568 = C0630.m2566(C2105.m6988(sArr3, 7, 3, i20));
                    i18 = 2129109745;
                    if (C0237.f1507 != 0) {
                        iM2567 = (i9 - C2105.m6981("ۚ۬")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM2567 ^ i10) * (-1015)) ^ 1686425754;
                        i7 = -1750945882;
                    } else {
                        iM2567 = (C0630.m2566("ۨۖ") ^ i9) * (-13);
                        i5 = ((iM2567 ^ i10) * (-15375)) ^ (-1827574005);
                        i7 = -157889465;
                    }
                    i6 = iM2567 ^ i7;
                    sArr10 = sArr3;
                    view2 = view4;
                    i12 = i6;
                    i11 = i5;
                    i13 = i4;
                    c9764 = c9763;
                    viewOnClickListenerC187512 = viewOnClickListenerC187511;
                    intentM7034 = intent2;
                    view7 = view2;
                    break;
                case -750217947:
                case 838990493:
                    RunnableC0588.m2440(C1773.m5917(f26935, 22, 12, i20));
                    RunnableC1108.m3781(this);
                    break;
                case -655267335:
                case 1214431720:
                    view = view7;
                    viewOnClickListenerC18759 = viewOnClickListenerC187512;
                    C22628.m50606(activityC8848.f10584, strM10628);
                    iM6984 = C2105.m6981(C4616.m13542(f26935, 34, 3, i20));
                    if (C3245.f10203 > 0) {
                        iM2566 = (C2105.m6981("ۧᩳ") + i9) * 9;
                        i = ((iM2566 ^ i10) * 17551) ^ (-339521387);
                        i2 = 2140652307;
                        i12 = iM2566 ^ i2;
                        view7 = view;
                        i11 = i;
                        viewOnClickListenerC187512 = viewOnClickListenerC18759;
                    } else {
                        view3 = view;
                        c9762 = c9764;
                        intent = intentM7034;
                        viewOnClickListenerC187510 = viewOnClickListenerC18759;
                        sArr2 = sArr10;
                        int iM6989 = (C2105.m6981("ᩴᩴ") ^ i10) * (-67);
                        sArr10 = sArr2;
                        c9764 = c9762;
                        viewOnClickListenerC187512 = viewOnClickListenerC187510;
                        intentM7034 = intent;
                        view7 = view3;
                        i12 = iM6989 ^ (-48341082);
                        i11 = ((iM6989 ^ i9) * 7487) ^ (-1393314365);
                        activityC8848 = this;
                    }
                    break;
                case -624625495:
                case -362317304:
                    view = view7;
                    viewOnClickListenerC18759 = viewOnClickListenerC187512;
                    if (strM10628 != null) {
                        iM2566 = (i9 - C0630.m2566("ۜᩴ")) * (-95);
                        i = ((iM2566 ^ i10) * (-28519)) ^ 1759351574;
                        i2 = 160948257;
                        i12 = iM2566 ^ i2;
                        view7 = view;
                        i11 = i;
                        viewOnClickListenerC187512 = viewOnClickListenerC18759;
                    } else {
                        view6 = view;
                        intent3 = intentM7034;
                        int iM25612 = C0630.m2566("᩹ܶ") ^ i10;
                        i = ((iM25612 ^ i9) * (-24073)) ^ (-1744204034);
                        intentM7034 = intent3;
                        view7 = view6;
                        i12 = iM25612 ^ 1656449983;
                        i11 = i;
                        viewOnClickListenerC187512 = viewOnClickListenerC18759;
                    }
                    break;
                case -431737329:
                case 622956079:
                    view = view7;
                    viewOnClickListenerC18759 = viewOnClickListenerC187512;
                    activityC8848.f26938 = (TabLayout) C4263.m12813(activityC8848, 2102986541 ^ iM6984);
                    sArr6 = f26935;
                    if (C2126.f7087) {
                        iM2566 = C2105.m6981("᩵֨") ^ i10;
                        i = ((iM2566 ^ i9) * (-479)) ^ (-97072457);
                        i2 = -189525711;
                    } else {
                        iM2566 = (C0630.m2566("ۖۤ") + i10) * 81;
                        i = ((iM2566 ^ i9) * (-28629)) ^ (-1220906252);
                        i2 = -280176174;
                    }
                    i12 = iM2566 ^ i2;
                    view7 = view;
                    i11 = i;
                    viewOnClickListenerC187512 = viewOnClickListenerC18759;
                    break;
                case -408698708:
                case 929966400:
                    if (!RunnableC1108.f4040) {
                        view = view7;
                        viewOnClickListenerC18759 = viewOnClickListenerC187512;
                        iM2566 = C2105.m6981("᩵֨") ^ i10;
                        i = ((iM2566 ^ i9) * (-479)) ^ (-97072457);
                        i2 = -189525711;
                        i12 = iM2566 ^ i2;
                        view7 = view;
                        i11 = i;
                        viewOnClickListenerC187512 = viewOnClickListenerC18759;
                    } else {
                        view4 = view7;
                        sArr3 = sArr10;
                        intent2 = intentM7034;
                        viewOnClickListenerC187511 = viewOnClickListenerC187512;
                        c9763 = c9764;
                        i4 = i13;
                        iM2567 = (i9 - C2105.m6981("ۚ۬")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM2567 ^ i10) * (-1015)) ^ 1686425754;
                        i7 = -1750945882;
                        i6 = iM2567 ^ i7;
                        sArr10 = sArr3;
                        view2 = view4;
                        i12 = i6;
                        i11 = i5;
                        i13 = i4;
                        c9764 = c9763;
                        viewOnClickListenerC187512 = viewOnClickListenerC187511;
                        intentM7034 = intent2;
                        view7 = view2;
                    }
                    break;
                case -388208756:
                case 286660090:
                    view7 = view7;
                    sArr10 = sArr10;
                    intentM7034 = intentM7034;
                    viewOnClickListenerC187512 = viewOnClickListenerC187512;
                    c9764 = c9764;
                    i13 = i13;
                    short[] sArr20 = sArr9;
                    i16 = i16;
                    i17 = i17;
                    sArr = sArr20;
                    int i29 = (s * s) + 257891481;
                    if ((i29 + i29) - (i15 * i15) < 0) {
                        iM6981 = C2105.m6981("۫᩸") ^ i9;
                        i11 = ((iM6981 ^ i10) * 17351) ^ (-828323575);
                        i3 = 1525597318;
                    } else {
                        iM6981 = (C2105.m6981("ۧ۟") + i9) * (-59);
                        i11 = ((iM6981 ^ i10) * (-1673)) ^ 2135636665;
                        i3 = -1270246973;
                    }
                    int i210 = iM6981 ^ i3;
                    sArr10 = sArr10;
                    i13 = i13;
                    c9764 = c9764;
                    viewOnClickListenerC187512 = viewOnClickListenerC187512;
                    intentM7034 = intentM7034;
                    view7 = view7;
                    i12 = i210;
                    activityC8848 = this;
                    short[] sArr112 = sArr;
                    i17 = i17;
                    i16 = i16;
                    sArr9 = sArr112;
                    break;
                case -275813657:
                case 1516333620:
                    view7 = view7;
                    int i30 = i16;
                    i17 = i17;
                    sArr10 = sArr10;
                    intentM7034 = intentM7034;
                    viewOnClickListenerC187512 = viewOnClickListenerC187512;
                    sArr = sArr9;
                    c9764 = c9764;
                    i13 = i13;
                    super.onCreate(bundle);
                    m10214();
                    i16 = i30;
                    iM6986 = C2105.m6981(C0798.m3005(f26935, 1, 3, i20));
                    if (C4616.f14690 <= 0) {
                        iM6981 = C0630.m2566("ۗ᩵") ^ i9;
                        i11 = ((iM6981 ^ i10) * 8755) ^ (-1901630053);
                        i3 = 1007775016;
                    } else {
                        iM6981 = C2105.m6981("ۡ᩻") ^ i10;
                        i11 = ((iM6981 ^ i9) * (-16039)) ^ 1419221241;
                        i3 = 715498275;
                    }
                    int i211 = iM6981 ^ i3;
                    sArr10 = sArr10;
                    i13 = i13;
                    c9764 = c9764;
                    viewOnClickListenerC187512 = viewOnClickListenerC187512;
                    intentM7034 = intentM7034;
                    view7 = view7;
                    i12 = i211;
                    activityC8848 = this;
                    short[] sArr113 = sArr;
                    i17 = i17;
                    i16 = i16;
                    sArr9 = sArr113;
                    break;
                case -132610983:
                case 888553260:
                    activityC8848.f26939 = ViewOnClickListenerC1958.m6432();
                    C4263.m12821(new C6731(activityC8848));
                    break;
                case -82228369:
                case 189013118:
                    view = view7;
                    viewOnClickListenerC18759 = viewOnClickListenerC187512;
                    activityC8848.f26940 = (C0452) viewM12813;
                    sArr7 = f26935;
                    i14 = 40;
                    i13 = 3;
                    if (C3746.f11829 > 0) {
                        iM2566 = (C2105.m6981("ܶۨ") ^ i10) * (-41);
                        i = ((iM2566 ^ i9) * 30927) ^ 167721695;
                        i2 = -1698176385;
                        i12 = iM2566 ^ i2;
                        view7 = view;
                        i11 = i;
                        viewOnClickListenerC187512 = viewOnClickListenerC18759;
                    } else {
                        view3 = view;
                        c9762 = c9764;
                        intent = intentM7034;
                        viewOnClickListenerC187510 = viewOnClickListenerC18759;
                        sArr2 = sArr10;
                        int iM69810 = (C2105.m6981("ᩴᩴ") ^ i10) * (-67);
                        sArr10 = sArr2;
                        c9764 = c9762;
                        viewOnClickListenerC187512 = viewOnClickListenerC187510;
                        intentM7034 = intent;
                        view7 = view3;
                        i12 = iM69810 ^ (-48341082);
                        i11 = ((iM69810 ^ i9) * 7487) ^ (-1393314365);
                        activityC8848 = this;
                    }
                    break;
                case -20480266:
                case 1162341797:
                    C2520.m8026();
                    break;
                case 14800181:
                case 1755717039:
                    view4 = view7;
                    int i31 = i16;
                    short[] sArr21 = sArr9;
                    intent2 = intentM7034;
                    viewOnClickListenerC187511 = viewOnClickListenerC187512;
                    c9763 = c9764;
                    i4 = i13;
                    int i32 = i17;
                    C4263.m12813(activityC8848, C0630.m2566(C3432.m10488(sArr21, i32, i31, i20)) ^ 2125169591);
                    sArr10 = f26935;
                    int iM69811 = (i10 - C2105.m6981("ۙ᩻")) * (-69);
                    i5 = ((iM69811 ^ i9) * (-29799)) ^ (-1886772169);
                    i6 = iM69811 ^ 1103740934;
                    sArr9 = sArr21;
                    i17 = i32;
                    i16 = i31;
                    view2 = view4;
                    i12 = i6;
                    i11 = i5;
                    i13 = i4;
                    c9764 = c9763;
                    viewOnClickListenerC187512 = viewOnClickListenerC187511;
                    intentM7034 = intent2;
                    view7 = view2;
                    break;
                case 110762748:
                case 382671327:
                    view7 = view7;
                    viewOnClickListenerC18759 = viewOnClickListenerC187512;
                    c9764 = c9764;
                    AbstractC2021.m6559(c9764, new View.OnClickListener() { // from class: l.ᩳۧ᩷
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view10) {
                            int i33 = 1193358940;
                            int i34 = C1128.f4106;
                            int i35 = RunnableC3474.f10992;
                            int iM69812 = C2105.m6981("᩷ۙ") ^ i34;
                            int i36 = ((iM69812 ^ i35) * 16865) ^ 1775406039;
                            int i37 = 837476735;
                            while (true) {
                                i33 = ((((i33 ^ i35) * 10425) >> 31) & i36) ^ (iM69812 ^ i37);
                                switch (i33) {
                                    case -1993209566:
                                    case -697951689:
                                        if (C3019.f9544 >= 0) {
                                            iM69812 = C0630.m2566("ᩴ۫") ^ i34;
                                            i36 = ((iM69812 ^ i35) * 2765) ^ (-2047355907);
                                            i37 = 555213353;
                                        } else {
                                            iM69812 = (i35 - C0630.m2566("ܿ۬")) * (-117);
                                            i36 = ((iM69812 ^ i34) * (-7703)) ^ (-1218817681);
                                            i37 = -476812136;
                                        }
                                        break;
                                    case -1961616263:
                                    case -238605276:
                                        if (C21923.f70183 != 0) {
                                            iM69812 = C0630.m2566("᩶ۖ") ^ i35;
                                            i36 = ((iM69812 ^ i34) * (-8537)) ^ (-36089548);
                                            i37 = 229557144;
                                        } else {
                                            iM69812 = C0630.m2566("۟ۡ") ^ i34;
                                            i36 = ((iM69812 ^ i35) * 28397) ^ 271700829;
                                            i37 = 767009176;
                                        }
                                        break;
                                    case -1896435738:
                                    case -900037935:
                                        C1005.m3501();
                                        C1047.m3599();
                                        break;
                                    case -1605410856:
                                    case 718433393:
                                        if (C4117.m12364() != 0) {
                                            iM69812 = C0630.m2566("᩶ۖ") ^ i35;
                                            i36 = ((iM69812 ^ i34) * (-8537)) ^ (-36089548);
                                            i37 = 229557144;
                                        } else {
                                            iM69812 = C2105.m6981("᩶᩹") ^ i35;
                                            i36 = ((iM69812 ^ i34) * (-13883)) ^ (-485205533);
                                            i37 = -352477417;
                                        }
                                        break;
                                    case -1550991368:
                                    case -298722689:
                                        if (C4263.m12819() >= 0) {
                                            iM69812 = (i34 - C0630.m2566("ۛᩴ")) * (-119);
                                            i36 = ((iM69812 ^ i35) * (-24565)) ^ 895184825;
                                            i37 = -1051331306;
                                        } else {
                                            iM69812 = C2105.m6981("ۜۚ") ^ i34;
                                            i36 = ((iM69812 ^ i35) * (-16983)) ^ (-1199235551);
                                            i37 = 1582117875;
                                        }
                                        break;
                                    case -1519413136:
                                    case -458054490:
                                        if (RunnableC3474.f10992 <= 0) {
                                            iM69812 = C2105.m6981("ܽ᩵") ^ i35;
                                            i36 = ((iM69812 ^ i34) * (-187)) ^ 210360635;
                                            i37 = -1521609547;
                                        } else {
                                            iM69812 = (C0630.m2566("ۤ᩺") + i34) * (-53);
                                            i36 = ((iM69812 ^ i35) * 19751) ^ (-361159286);
                                            i37 = 1134878262;
                                        }
                                        break;
                                    case -1120707038:
                                    case 1816605973:
                                        AbstractC2021.m6574();
                                        C2126.m7040();
                                        iM69812 = (i34 - C0630.m2566("ۛᩴ")) * (-119);
                                        i36 = ((iM69812 ^ i35) * (-24565)) ^ 895184825;
                                        i37 = -1051331306;
                                        break;
                                    case -1016820635:
                                    case 963501557:
                                        if (C4616.f14690 <= 0) {
                                            iM69812 = C0630.m2566("ᩴ۫") ^ i34;
                                            i36 = ((iM69812 ^ i35) * 2765) ^ (-2047355907);
                                            i37 = 555213353;
                                        } else {
                                            iM69812 = (C0630.m2566("᩹᩹") + i35) * 87;
                                            i36 = ((iM69812 ^ i34) * (-1323)) ^ 1476347442;
                                            i37 = 282719830;
                                        }
                                        break;
                                    case -995875904:
                                    case 883924746:
                                        if (C1420.f5096 > 0) {
                                            iM69812 = C0630.m2566("ᩴ۫") ^ i34;
                                            i36 = ((iM69812 ^ i35) * 2765) ^ (-2047355907);
                                            i37 = 555213353;
                                        } else {
                                            iM69812 = C0630.m2566("᩶ۖ") ^ i35;
                                            i36 = ((iM69812 ^ i34) * (-8537)) ^ (-36089548);
                                            i37 = 229557144;
                                        }
                                        break;
                                    case -747858668:
                                    case 624131506:
                                        if (C1047.f3863 >= 0) {
                                            iM69812 = (i34 - C0630.m2566("ۛᩴ")) * (-119);
                                            i36 = ((iM69812 ^ i35) * (-24565)) ^ 895184825;
                                            i37 = -1051331306;
                                        } else {
                                            iM69812 = (i34 - C2105.m6981("ۧۘ")) * (-123);
                                            i36 = ((iM69812 ^ i35) * 22625) ^ (-60517077);
                                            i37 = 1050427748;
                                        }
                                        break;
                                    case -701378178:
                                    case -308141652:
                                        if (ServiceConnectionC3453.f10921 >= 0) {
                                            iM69812 = C2105.m6981("ܽ᩵") ^ i35;
                                            i36 = ((iM69812 ^ i34) * (-187)) ^ 210360635;
                                            i37 = -1521609547;
                                        } else {
                                            iM69812 = C0630.m2566("ᩴ۫") ^ i34;
                                            i36 = ((iM69812 ^ i35) * 2765) ^ (-2047355907);
                                            i37 = 555213353;
                                        }
                                        break;
                                    case -581167417:
                                    case 2145153340:
                                        if (C5695.m16023() >= 0) {
                                            iM69812 = C0630.m2566("᩺ܽ") ^ i34;
                                            i36 = ((iM69812 ^ i35) * (-26491)) ^ 563372588;
                                            i37 = -558437707;
                                        } else {
                                            iM69812 = (C0630.m2566("᩷ܰ") ^ i35) * 101;
                                            i36 = ((iM69812 ^ i34) * 31265) ^ (-1303890587);
                                            i37 = 16874844;
                                        }
                                        break;
                                    case 336090113:
                                    case 697360150:
                                        C4075.m12263();
                                        if (!C0798.f2919) {
                                            iM69812 = (i34 - C0630.m2566("ۛᩴ")) * (-119);
                                            i36 = ((iM69812 ^ i35) * (-24565)) ^ 895184825;
                                            i37 = -1051331306;
                                        } else {
                                            iM69812 = C0630.m2566("᩶ۖ") ^ i35;
                                            i36 = ((iM69812 ^ i34) * (-8537)) ^ (-36089548);
                                            i37 = 229557144;
                                        }
                                        break;
                                    case 627296439:
                                    case 1456074565:
                                        int i38 = ActivityC8848.f26934;
                                        if (C1420.m4913()) {
                                            iM69812 = C0630.m2566("᩺ܽ") ^ i34;
                                            i36 = ((iM69812 ^ i35) * (-26491)) ^ 563372588;
                                            i37 = -558437707;
                                        } else {
                                            iM69812 = (C0630.m2566("ᩴۨ") + i35) * (-127);
                                            i36 = ((iM69812 ^ i34) * (-10677)) ^ 392823493;
                                            i37 = 312634773;
                                        }
                                        break;
                                    case 1462910973:
                                    case 2046631824:
                                        if (AbstractC2021.f6743 <= 0) {
                                            iM69812 = C0630.m2566("᩺ܽ") ^ i34;
                                            i36 = ((iM69812 ^ i35) * (-26491)) ^ 563372588;
                                            i37 = -558437707;
                                        } else {
                                            iM69812 = (i34 - C0630.m2566("᩵᩹")) * 71;
                                            i36 = ((iM69812 ^ i35) * 31939) ^ (-1756183451);
                                            i37 = -1090388902;
                                        }
                                        break;
                                    default:
                                        RunnableC1108.m3781(this.f56193);
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    intentM7034 = C2126.m7034(this);
                    sArr4 = f26935;
                    if (C0050.f910 < 0) {
                        int iM25613 = (i10 - C0630.m2566("ۖۜ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        c9764 = c9764;
                        viewOnClickListenerC187512 = viewOnClickListenerC18759;
                        view2 = view7;
                        i12 = iM25613 ^ 143457273;
                        i11 = ((iM25613 ^ i9) * 14975) ^ (-314279746);
                        view7 = view2;
                    } else {
                        intentM7034 = intentM7034;
                        viewOnClickListenerC187512 = viewOnClickListenerC18759;
                        short[] sArr114 = sArr9;
                        i16 = i16;
                        i17 = i17;
                        sArr = sArr114;
                        iM6981 = (C2105.m6981("ᩳ᩵") + i10) * (-77);
                        i11 = ((iM6981 ^ i9) * (-30211)) ^ 1332201347;
                        i3 = 1324892011;
                        int i212 = iM6981 ^ i3;
                        sArr10 = sArr10;
                        i13 = i13;
                        c9764 = c9764;
                        viewOnClickListenerC187512 = viewOnClickListenerC187512;
                        intentM7034 = intentM7034;
                        view7 = view7;
                        i12 = i212;
                        activityC8848 = this;
                        short[] sArr115 = sArr;
                        i17 = i17;
                        i16 = i16;
                        sArr9 = sArr115;
                    }
                    break;
                case 408445245:
                case 1101043291:
                    view5 = view7;
                    viewOnClickListenerC18759 = viewOnClickListenerC187512;
                    intent3 = intentM7034;
                    C9762 c9765 = (C9762) C0964.m3409(activityC8848, iM2568 ^ i18);
                    activityC8848.f10584 = c9765;
                    RunnableC1108.m3780(activityC8848, c9765);
                    C0483.m2125(this);
                    C9762 c9766 = activityC8848.f10584;
                    iM6982 = (i9 - C2105.m6981("֨ᩳ")) * 87;
                    c9764 = c9766;
                    i11 = ((iM6982 ^ i10) * 19273) ^ (-84645289);
                    i8 = -952412561;
                    int i213 = iM6982 ^ i8;
                    intentM7034 = intent3;
                    view7 = view5;
                    i12 = i213;
                    viewOnClickListenerC187512 = viewOnClickListenerC18759;
                    break;
                case 1409126366:
                case 2038911598:
                    view = view7;
                    viewOnClickListenerC18759 = viewOnClickListenerC187512;
                    iM6985 = C2105.m6981(C7811.m20837(sArr8, 43, 3, i20)) ^ 2119866715;
                    if (C2958.f9394 >= 0) {
                        iM2566 = C2105.m6981("᩵֨") ^ i10;
                        i = ((iM2566 ^ i9) * (-479)) ^ (-97072457);
                        i2 = -189525711;
                    } else {
                        iM2566 = (i10 - C2105.m6981("۠ܳ")) * (-103);
                        i = ((iM2566 ^ i9) * 25859) ^ 121621578;
                        i2 = 385175427;
                    }
                    i12 = iM2566 ^ i2;
                    view7 = view;
                    i11 = i;
                    viewOnClickListenerC187512 = viewOnClickListenerC18759;
                    break;
                case 1671913073:
                case 2123106903:
                    activityC8848.f26944 = C0964.m3409(activityC8848, iM6985);
                    view7 = activityC8848.f26942;
                    viewOnClickListenerC187512 = new ViewOnClickListenerC18759(2, activityC8848);
                    int iM69812 = (i9 - C2105.m6981("ܰۘ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i12 = iM69812 ^ (-144156080);
                    i11 = ((iM69812 ^ i10) * 16317) ^ 896358528;
                    break;
                default:
                    sArr = sArr9;
                    i20 = 4313;
                    iM6981 = C2105.m6981("ۖۨ") ^ i10;
                    i11 = ((iM6981 ^ i9) * 18095) ^ (-552899112);
                    i3 = 1585411442;
                    int i214 = iM6981 ^ i3;
                    sArr10 = sArr10;
                    i13 = i13;
                    c9764 = c9764;
                    viewOnClickListenerC187512 = viewOnClickListenerC187512;
                    intentM7034 = intentM7034;
                    view7 = view7;
                    i12 = i214;
                    activityC8848 = this;
                    short[] sArr116 = sArr;
                    i17 = i17;
                    i16 = i16;
                    sArr9 = sArr116;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0157 A[PHI: r2 r3 r5 r6 r7 r8 r21
      0x0157: PHI (r2v3 android.view.MenuItem) = (r2v2 android.view.MenuItem), (r2v2 android.view.MenuItem), (r2v4 android.view.MenuItem) binds: [B:40:0x0155, B:36:0x0131, B:33:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x0157: PHI (r3v4 int) = (r3v2 int), (r3v3 int), (r3v2 int) binds: [B:40:0x0155, B:36:0x0131, B:33:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x0157: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v5 int) binds: [B:40:0x0155, B:36:0x0131, B:33:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x0157: PHI (r6v4 int) = (r6v2 int), (r6v2 int), (r6v5 int) binds: [B:40:0x0155, B:36:0x0131, B:33:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x0157: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:40:0x0155, B:36:0x0131, B:33:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x0157: PHI (r8v3 short[]) = (r8v2 short[]), (r8v2 short[]), (r8v4 short[]) binds: [B:40:0x0155, B:36:0x0131, B:33:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x0157: PHI (r21v13 int) = (r21v11 int), (r21v12 int), (r21v14 int) binds: [B:40:0x0155, B:36:0x0131, B:33:0x0106] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0275 A[PHI: r11 r12 r17 r21
      0x0275: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:62:0x0273, B:54:0x0214, B:9:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x0275: PHI (r12v4 short) = (r12v2 short), (r12v3 short), (r12v2 short) binds: [B:62:0x0273, B:54:0x0214, B:9:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x0275: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:62:0x0273, B:54:0x0214, B:9:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x0275: PHI (r21v18 int) = (r21v5 int), (r21v7 int), (r21v20 int) binds: [B:62:0x0273, B:54:0x0214, B:9:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        int iM6981;
        int i;
        int i2;
        int iM2566;
        int i3;
        int i4;
        int i5 = C4117.f13076;
        int i6 = C11340.f33930;
        int iM6982 = (C2105.m6981("ۜۛ") + i5) * 21;
        int i7 = ((iM6982 ^ i6) * 14019) ^ 1844062414;
        MenuItem menuItemM6974 = null;
        String strM19110 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i8 = iM6982 ^ (-1716805331);
        int i9 = 0;
        int iM6983 = 0;
        int iM2567 = 0;
        int i10 = 0;
        short s = 0;
        int i11 = 0;
        short s2 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        int i14 = 1196865125;
        int i15 = 0;
        short[] sArr3 = null;
        int i16 = 0;
        while (true) {
            i14 = i8 ^ (i7 & (((i14 ^ i6) * 4055) >> 31));
            switch (i14) {
                case -2144100036:
                case -989612275:
                    i9 = i9;
                    i11 = i15 + 306460036;
                    s2 = 35012;
                    if (C4263.f13799 <= 0) {
                        iM2566 = (C0630.m2566("᩵ۨ") + i6) * 123;
                        i3 = ((iM2566 ^ i5) * 25141) ^ 1326314772;
                        i4 = 2110082131;
                    } else {
                        iM2566 = (C2105.m6981("ܿ᩵") ^ i6) * 93;
                        i3 = ((iM2566 ^ i5) * 25991) ^ 1209713888;
                        i4 = -1960079168;
                    }
                    int i17 = i9;
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    i9 = i17;
                    break;
                case -2026893261:
                case 808107803:
                    i9 = i9;
                    sArr3 = f26935;
                    if (RunnableC0588.f2309 >= 0) {
                        i9 = i9;
                        iM2566 = C2105.m6981("ۚ᩺") ^ i6;
                        i9 = i9;
                        i3 = ((iM2566 ^ i5) * (-7535)) ^ 1946043615;
                        i4 = -1664369063;
                    } else {
                        iM2566 = C0630.m2566("۟֫") ^ i6;
                        i3 = ((iM2566 ^ i5) * 8885) ^ 1910461896;
                        i4 = 527031611;
                    }
                    int i18 = i9;
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    i9 = i18;
                    break;
                case -2005123028:
                case -1940332947:
                    if (C0050.f910 < 0) {
                        iM2566 = C2105.m6981("ۚ᩺") ^ i6;
                        i9 = i9;
                        i3 = ((iM2566 ^ i5) * (-7535)) ^ 1946043615;
                        i4 = -1664369063;
                        int i19 = i9;
                        i8 = iM2566 ^ i4;
                        i7 = i3;
                        i9 = i19;
                    } else {
                        iM6981 = C2105.m6981("۠ۖ") ^ i6;
                        i = ((iM6981 ^ i5) * (-26359)) ^ (-316406050);
                        i2 = -388731491;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    }
                    break;
                case -1948278395:
                case 1930305307:
                    strM19110 = C7106.m19110(sArr2, 50, 3, i12);
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = C2105.m6981("۠ۖ") ^ i6;
                        i = ((iM6981 ^ i5) * (-26359)) ^ (-316406050);
                        i2 = -388731491;
                    } else {
                        iM6981 = C2105.m6981("ᩳۙ") ^ i5;
                        i = ((iM6981 ^ i6) * 2221) ^ (-2119799884);
                        i2 = -929718847;
                    }
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -1945405530:
                case 1129532232:
                    if (RunnableC0588.f2309 >= 0) {
                        i9 = i9;
                        iM2566 = (i5 - C2105.m6981("ܽۡ")) * (-13);
                        i3 = ((iM2566 ^ i6) * (-10577)) ^ (-448876822);
                        i4 = 531801045;
                        int i110 = i9;
                        i8 = iM2566 ^ i4;
                        i7 = i3;
                        i9 = i110;
                    }
                    iM2566 = C2105.m6981("ۚ᩺") ^ i6;
                    i9 = i9;
                    i3 = ((iM2566 ^ i5) * (-7535)) ^ 1946043615;
                    i4 = -1664369063;
                    int i111 = i9;
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    i9 = i111;
                    break;
                case -1809883330:
                case -693455131:
                    i9 = i9;
                    s = sArr3[c];
                    i15 = s * s;
                    if (C0798.f2919) {
                        iM2566 = (i5 - C2105.m6981("ܽۡ")) * (-13);
                        i3 = ((iM2566 ^ i6) * (-10577)) ^ (-448876822);
                        i4 = 531801045;
                    } else {
                        iM2566 = (i5 - C0630.m2566("ۢ۠")) * (-41);
                        i3 = ((iM2566 ^ i6) * (-5299)) ^ (-1332120954);
                        i4 = -1712709613;
                    }
                    int i112 = i9;
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    i9 = i112;
                    break;
                case -1732613246:
                case -1600497759:
                    i9 = i9;
                    if (i11 - (s * s2) < 0) {
                        iM2566 = C0630.m2566("ܺ֨") ^ i5;
                        i3 = ((iM2566 ^ i6) * (-22553)) ^ 1493657583;
                        i4 = -1246641141;
                    } else {
                        iM2566 = C2105.m6981("᩸ۨ") ^ i6;
                        i3 = ((iM2566 ^ i5) * 15931) ^ 682999618;
                        i4 = -1089732454;
                    }
                    int i113 = i9;
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    i9 = i113;
                    break;
                case -1637925472:
                case 1779382221:
                    iM2567 = C0630.m2566(strM19110);
                    i16 = 2097908396;
                    if (!C0798.f2919) {
                        iM6981 = (C2105.m6981("ۛ۟") ^ i5) * (-113);
                        i = ((iM6981 ^ i6) * 28431) ^ 1646061576;
                        i2 = 1887725567;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    } else {
                        i9 = i9;
                        iM2566 = C2105.m6981("ۢۗ") ^ i5;
                        i3 = ((iM2566 ^ i6) * 27273) ^ 1601517566;
                        i4 = 2004682144;
                        int i114 = i9;
                        i8 = iM2566 ^ i4;
                        i7 = i3;
                        i9 = i114;
                    }
                    break;
                case -1428465590:
                case 803399138:
                    sArr = f26935;
                    i13 = 47;
                    if (RunnableC1937.f6483 >= 0) {
                        i9 = 0;
                        iM2566 = C2105.m6981("ۚ᩺") ^ i6;
                        i9 = i9;
                        i3 = ((iM2566 ^ i5) * (-7535)) ^ 1946043615;
                        i4 = -1664369063;
                        int i115 = i9;
                        i8 = iM2566 ^ i4;
                        i7 = i3;
                        i9 = i115;
                    } else {
                        int iM6984 = (i5 - C2105.m6981("ۧۜ")) * 69;
                        i8 = iM6984 ^ (-725838551);
                        i7 = ((iM6984 ^ i6) * 9627) ^ 1180203206;
                        i9 = 0;
                    }
                    break;
                case -1331184461:
                case 841881847:
                    i9 = i9;
                    i10 = 3;
                    if (C2167.m7155()) {
                        iM2566 = C2105.m6981("ۢۗ") ^ i5;
                        i3 = ((iM2566 ^ i6) * 27273) ^ 1601517566;
                        i4 = 2004682144;
                    } else {
                        iM2566 = C2105.m6981("᩵۟") ^ i6;
                        i3 = ((iM2566 ^ i5) * (-8831)) ^ (-879920280);
                        i4 = 1018275752;
                    }
                    int i116 = i9;
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    i9 = i116;
                    break;
                case -1045586158:
                case 989121317:
                    C2520.m8019(menuItemM6974, iM2567 ^ i16);
                    menuItemM6974.setShowAsAction(2);
                    return true;
                case -906190403:
                case 1797594326:
                    i12 = 61965;
                    iM2566 = (C0630.m2566("᩸ۙ") + i6) * 31;
                    i3 = ((iM2566 ^ i5) * 4763) ^ (-1264186908);
                    i4 = -1633938207;
                    int i117 = i9;
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    i9 = i117;
                    break;
                case -904779428:
                case 1023316311:
                    C3663.m11168();
                    C2105.m6982();
                    return false;
                case -884793173:
                case 81867392:
                    i9 = i9;
                    c = '.';
                    if (C3746.f11829 <= 0) {
                        iM2566 = (C0630.m2566("᩵ۨ") + i6) * 123;
                        i3 = ((iM2566 ^ i5) * 25141) ^ 1326314772;
                        i4 = 2110082131;
                    } else {
                        iM2566 = (C2105.m6981("᩹ۡ") ^ i5) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i3 = ((iM2566 ^ i6) * (-24087)) ^ (-581745184);
                        i4 = -1713663142;
                    }
                    int i118 = i9;
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    i9 = i118;
                    break;
                case -814125238:
                case 799984497:
                    int i20 = 2125944633 ^ iM6983;
                    menuItemM6974 = C2105.m6974(menu, i9, i20, i9, i20);
                    sArr2 = f26935;
                    if (C0483.f2088 >= 0) {
                        i9 = i9;
                        iM2566 = C2105.m6981("ۢۗ") ^ i5;
                        i3 = ((iM2566 ^ i6) * 27273) ^ 1601517566;
                        i4 = 2004682144;
                    } else {
                        iM2566 = (i6 - C0630.m2566("ۙ۫")) * (-17);
                        i9 = i9;
                        i3 = ((iM2566 ^ i5) * 17613) ^ 1689347939;
                        i4 = -1706038195;
                    }
                    int i119 = i9;
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    i9 = i119;
                    break;
                case -392643682:
                case 1671970023:
                    i9 = i9;
                    iM6983 = C2105.m6981(C3663.m11162(sArr, i13, i10, i12));
                    if (C1294.f4556 >= 0) {
                        iM2566 = C2105.m6981("ۢۗ") ^ i5;
                        i3 = ((iM2566 ^ i6) * 27273) ^ 1601517566;
                        i4 = 2004682144;
                    } else {
                        iM2566 = (C0630.m2566("ۤۤ") ^ i5) * 123;
                        i3 = ((iM2566 ^ i6) * (-21897)) ^ (-1895915828);
                        i4 = 2110643191;
                    }
                    int i1110 = i9;
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    i9 = i1110;
                    break;
                case 565461810:
                case 1289758418:
                    if (C2126.f7087) {
                        i9 = i9;
                        iM2566 = (C0630.m2566("᩵ۨ") + i6) * 123;
                        i3 = ((iM2566 ^ i5) * 25141) ^ 1326314772;
                        i4 = 2110082131;
                        int i1111 = i9;
                        i8 = iM2566 ^ i4;
                        i7 = i3;
                        i9 = i1111;
                    }
                    iM2566 = C2105.m6981("ۚ᩺") ^ i6;
                    i9 = i9;
                    i3 = ((iM2566 ^ i5) * (-7535)) ^ 1946043615;
                    i4 = -1664369063;
                    int i1112 = i9;
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    i9 = i1112;
                    break;
                case 1172762097:
                case 1222735749:
                    C4616.m13552();
                    C1916.m6308();
                    iM6981 = C2105.m6981("۠ۖ") ^ i6;
                    i = ((iM6981 ^ i5) * (-26359)) ^ (-316406050);
                    i2 = -388731491;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                default:
                    i12 = 31356;
                    iM2566 = (C0630.m2566("᩸ۙ") + i6) * 31;
                    i3 = ((iM2566 ^ i5) * 4763) ^ (-1264186908);
                    i4 = -1633938207;
                    int i1113 = i9;
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    i9 = i1113;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22857(ActivityC8848 activityC8848) {
        long jM6432 = 0;
        long j = 0;
        int i = 1480523896;
        int i2 = C0483.f2088;
        int i3 = C1773.f6144;
        int iM6981 = (C2105.m6981("ۚ᩻") ^ i3) * 97;
        int i4 = ((iM6981 ^ i2) * (-29135)) ^ (-370430360);
        int i5 = -255656769;
        while (true) {
            i = ((((i ^ i2) * (-13645)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2015696903:
                case -324573052:
                    RunnableC1937.m6387();
                    if (!RunnableC3474.m10630()) {
                        iM6981 = C0630.m2566("ۗ᩸") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-9305)) ^ (-226654081);
                        i5 = 1881336355;
                    } else {
                        iM6981 = (C2105.m6981("ۙ֨") ^ i2) * 61;
                        i4 = ((iM6981 ^ i3) * 29259) ^ (-1548785207);
                        i5 = 1172669686;
                    }
                    break;
                case -1875986432:
                case 656404417:
                    if (jM6432 - j < 300) {
                        iM6981 = C2105.m6981("ᩴ᩹") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-12125)) ^ (-1093301435);
                        i5 = 1889954156;
                    } else {
                        iM6981 = (i3 - C2105.m6981("᩵ۢ")) * 95;
                        i4 = ((iM6981 ^ i2) * (-28701)) ^ 281436909;
                        i5 = 879092149;
                    }
                    break;
                case -1832700533:
                case 321671177:
                    if (C0050.f910 >= 0) {
                        iM6981 = (C2105.m6981("ۙ֨") ^ i2) * 61;
                        i4 = ((iM6981 ^ i3) * 29259) ^ (-1548785207);
                        i5 = 1172669686;
                    } else {
                        iM6981 = (C2105.m6981("ܳۢ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM6981 ^ i3) * 29747) ^ 1932099959;
                        i5 = -1788137733;
                    }
                    break;
                case -1763052738:
                case 673820229:
                    if (C0483.m2121()) {
                        iM6981 = C2105.m6981("ۢ֫") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-7705)) ^ 1112023775;
                        i5 = -1794593611;
                    } else {
                        iM6981 = C0630.m2566("ۗ᩸") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-9305)) ^ (-226654081);
                        i5 = 1881336355;
                    }
                    break;
                case -1350143510:
                case 1093445887:
                    break;
                case -1233442994:
                case 281549335:
                    if (C1420.f5096 <= 0) {
                        iM6981 = (i3 - C2105.m6981("ۚܶ")) * 63;
                        i4 = ((iM6981 ^ i2) * (-4979)) ^ 777385259;
                        i5 = 1353242776;
                    } else {
                        iM6981 = (C0630.m2566("ۚۨ") ^ i3) * 65;
                        i4 = ((iM6981 ^ i2) * 16061) ^ (-2127780496);
                        i5 = -600396271;
                    }
                    break;
                case -1145760182:
                case 1044932593:
                    if (C1711.f5919) {
                        iM6981 = (i3 - C2105.m6981("ۚܶ")) * 63;
                        i4 = ((iM6981 ^ i2) * (-4979)) ^ 777385259;
                        i5 = 1353242776;
                    } else {
                        iM6981 = (C2105.m6981("᩸ܰ") + i2) * 61;
                        i4 = ((iM6981 ^ i3) * (-26909)) ^ 164347081;
                        i5 = 1058859398;
                    }
                    break;
                case -1065685484:
                case 1158793992:
                    jM6432 = ViewOnClickListenerC1958.m6432();
                    if (C1420.f5096 <= 0) {
                        iM6981 = (C2105.m6981("ۙ֨") ^ i2) * 61;
                        i4 = ((iM6981 ^ i3) * 29259) ^ (-1548785207);
                        i5 = 1172669686;
                    } else {
                        iM6981 = (C0630.m2566("۟ܶ") + i2) * (-83);
                        i4 = ((iM6981 ^ i3) * 5117) ^ (-1569765488);
                        i5 = 1161822375;
                    }
                    break;
                case -975370235:
                case 362472061:
                    j = activityC8848.f26939;
                    if (C2105.m6982() != 0) {
                        iM6981 = (C2105.m6981("֨۫") + i3) * (-41);
                        i4 = ((iM6981 ^ i2) * (-14293)) ^ (-1034513527);
                        i5 = 1864988251;
                    } else {
                        iM6981 = C2105.m6981("᩵᩻") ^ i2;
                        i4 = ((iM6981 ^ i3) * 7503) ^ (-781746084);
                        i5 = -130025628;
                    }
                    break;
                case -961160403:
                case 1855770570:
                    C0483.m2121();
                    if (C1420.f5096 > 0) {
                        iM6981 = (C0630.m2566("᩺᩸") + i2) * (-27);
                        i4 = ((iM6981 ^ i3) * 27769) ^ 1249759818;
                        i5 = 860359672;
                    } else {
                        iM6981 = C0630.m2566("ۗ᩸") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-9305)) ^ (-226654081);
                        i5 = 1881336355;
                    }
                    break;
                case -791820098:
                case 44139508:
                    C3911.m11924();
                    C0630.m2564();
                    iM6981 = C0630.m2566("ۗ᩸") ^ i3;
                    i4 = ((iM6981 ^ i2) * (-9305)) ^ (-226654081);
                    i5 = 1881336355;
                    break;
                case -770903375:
                case 1103744239:
                    if (C2520.f8000 < 0) {
                        C0964.m3402(new C6731(activityC8848));
                    }
                    iM6981 = (C2105.m6981("֨۫") + i3) * (-41);
                    i4 = ((iM6981 ^ i2) * (-14293)) ^ (-1034513527);
                    i5 = 1864988251;
                    break;
                case -503072875:
                case 178666417:
                    if (C1005.f3721) {
                        iM6981 = (C2105.m6981("۠֫") ^ i3) * (-63);
                        i4 = ((iM6981 ^ i2) * (-32539)) ^ 501983565;
                        i5 = 1466385848;
                    } else {
                        iM6981 = (C0630.m2566("᩺᩸") + i2) * (-27);
                        i4 = ((iM6981 ^ i3) * 27769) ^ 1249759818;
                        i5 = 860359672;
                    }
                    break;
                case 56236019:
                case 1668387266:
                    activityC8848.f26939 = ViewOnClickListenerC1958.m6432();
                    if (C0630.f2410 <= 0) {
                        iM6981 = (C2105.m6981("ۙ֨") ^ i2) * 61;
                        i4 = ((iM6981 ^ i3) * 29259) ^ (-1548785207);
                        i5 = 1172669686;
                    } else {
                        iM6981 = (C2105.m6981("ܽ᩻") ^ i2) * (-79);
                        i4 = ((iM6981 ^ i3) * (-15315)) ^ (-1238877695);
                        i5 = 1647602466;
                    }
                    break;
                case 97581959:
                case 1587504468:
                    RunnableC0588.m2441();
                    C1294.m4372();
                    break;
                case 1168415197:
                case 1581254956:
                    if (!C2126.m7040()) {
                        iM6981 = C0630.m2566("ۗ᩸") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-9305)) ^ (-226654081);
                        i5 = 1881336355;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ۚܶ")) * 63;
                        i4 = ((iM6981 ^ i2) * (-4979)) ^ 777385259;
                        i5 = 1353242776;
                    }
                    break;
                default:
                    if (C0050.f910 >= 0) {
                        iM6981 = (C2105.m6981("֨۫") + i3) * (-41);
                        i4 = ((iM6981 ^ i2) * (-14293)) ^ (-1034513527);
                        i5 = 1864988251;
                    } else {
                        iM6981 = C0630.m2566("ۗ֡") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-8613)) ^ 395442109;
                        i5 = -345984935;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int iM2566;
        int i;
        int i2;
        C9554 c9554;
        C9554 c9555;
        int i3;
        int iM7041;
        int iM2567;
        int i4;
        int i5;
        int iM6981;
        int i6;
        int i7;
        int iM6982;
        int i8;
        int i9;
        int iM6983;
        int i10;
        int i11;
        int iM6984;
        int i12;
        int i13;
        int i14;
        int i15;
        int iM6985;
        int iM2568;
        int i16;
        int iM6986;
        int i17;
        int iM2569;
        int i18;
        int i19;
        int i20;
        int iM25610;
        int i21;
        int i22;
        int i23;
        short s = 0;
        int i24 = 830010960;
        int i25 = C1773.f6144;
        int i26 = C0422.f1886;
        int iM6987 = C2105.m6981("۬ۘ") ^ i26;
        int i27 = ((iM6987 ^ i25) * 26557) ^ (-2093739273);
        int i28 = iM6987 ^ 1085291671;
        String str = null;
        C9554 c9556 = null;
        JSONException jSONException = null;
        C9554 c9557 = null;
        C9554 c9558 = null;
        String strM6237 = null;
        String strM6988 = null;
        String strM12578 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        boolean z = false;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        boolean zM6313 = false;
        int i32 = 0;
        int iM6988 = 0;
        int i33 = 0;
        char c = 0;
        boolean zM5910 = false;
        short s2 = 0;
        int i34 = 0;
        int i35 = 0;
        C10235 c10235 = null;
        JSONObject jSONObject = null;
        Iterator itM9029 = null;
        String strM6573 = null;
        int i36 = 0;
        boolean zM6314 = false;
        ArrayList arrayList = null;
        JSONObject jSONObject2 = null;
        String strM1959 = null;
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            i24 = i28 ^ (i27 & (((i24 ^ i25) * (-13463)) >> 31));
            switch (i24) {
                case -2125165180:
                case 1101909939:
                    c9558 = c9558;
                    strM1959 = strM1959;
                    i32 = i32;
                    c9556 = c9556;
                    sArr3 = sArr3;
                    i35 = i35;
                    c9557 = c9557;
                    iM7041 = C2126.m7041(menuItem);
                    sArr2 = f26935;
                    i34 = 54;
                    if (C0714.f2697 >= 0) {
                        iM2567 = C0630.m2566("ۗ᩺") ^ i25;
                        i4 = ((iM2567 ^ i26) * (-29927)) ^ 1006850946;
                        i5 = -714665898;
                    } else {
                        iM2567 = (C0630.m2566("ۧܿ") + i26) * (-79);
                        i4 = ((iM2567 ^ i25) * (-5455)) ^ (-1568442413);
                        i5 = 1807180143;
                    }
                    i28 = iM2567 ^ i5;
                    i35 = i35;
                    c9558 = c9558;
                    sArr3 = sArr3;
                    i32 = i32;
                    i31 = iM7041;
                    i27 = i4;
                    c9557 = c9557;
                    c9556 = c9556;
                    strM1959 = strM1959;
                    break;
                case -2039370977:
                case -901865972:
                    c9558 = c9558;
                    strM1959 = strM1959;
                    c9556 = c9556;
                    sArr3 = sArr3;
                    c9557 = c9557;
                    i32 = i32;
                    i35 = i35;
                    jSONObject2 = new JSONObject();
                    jSONObject = new JSONObject();
                    iM6983 = (i25 - C0630.m2566("ۡۛ")) * (-37);
                    i10 = ((iM6983 ^ i26) * (-15799)) ^ (-1644866643);
                    i11 = -417222731;
                    i28 = iM6983 ^ i11;
                    i27 = i10;
                    i35 = i35;
                    c9558 = c9558;
                    sArr3 = sArr3;
                    i32 = i32;
                    c9557 = c9557;
                    c9556 = c9556;
                    strM1959 = strM1959;
                    break;
                case -2036411990:
                case 289937807:
                    if (C1420.f5096 <= 0) {
                        c9558 = c9558;
                        strM1959 = strM1959;
                        iM7041 = i31;
                        i32 = i32;
                        c9556 = c9556;
                        sArr3 = sArr3;
                        i35 = i35;
                        c9557 = c9557;
                        iM2567 = C0630.m2566("ۗ᩺") ^ i25;
                        i4 = ((iM2567 ^ i26) * (-29927)) ^ 1006850946;
                        i5 = -714665898;
                        i28 = iM2567 ^ i5;
                        i35 = i35;
                        c9558 = c9558;
                        sArr3 = sArr3;
                        i32 = i32;
                        i31 = iM7041;
                        i27 = i4;
                        c9557 = c9557;
                        c9556 = c9556;
                        strM1959 = strM1959;
                    } else {
                        c9558 = c9558;
                        strM1959 = strM1959;
                        i32 = i32;
                        c9556 = c9556;
                        sArr3 = sArr3;
                        i35 = i35;
                        c9557 = c9557;
                        i20 = i34;
                        iM25610 = (i26 - C0630.m2566("᩵ܰ")) * 19;
                        i21 = ((iM25610 ^ i25) * (-32471)) ^ (-490409037);
                        i22 = 345859802;
                        i34 = i20;
                        i35 = i35;
                        c9557 = c9557;
                        sArr3 = sArr3;
                        sArr2 = sArr2;
                        s2 = s2;
                        i28 = iM25610 ^ i22;
                        i27 = i21;
                        c9556 = c9556;
                        i32 = i32;
                        strM1959 = strM1959;
                        i31 = i31;
                        c9558 = c9558;
                    }
                    break;
                case -1846028963:
                case -813392577:
                    strM1959 = strM1959;
                    c9556 = c9556;
                    if (C4075.m12247(C11340.m28030(c9556.f28971)) == 0) {
                        c9557 = c9557;
                        c9558 = c9558;
                        i32 = i32;
                        sArr3 = sArr3;
                        i35 = i35;
                        iM6983 = (C2105.m6981("ۖܺ") + i26) * 99;
                        i10 = ((iM6983 ^ i25) * (-24183)) ^ (-1315462375);
                        i11 = -580213128;
                        i28 = iM6983 ^ i11;
                        i27 = i10;
                        i35 = i35;
                        c9558 = c9558;
                        sArr3 = sArr3;
                        i32 = i32;
                        c9557 = c9557;
                        c9556 = c9556;
                        strM1959 = strM1959;
                    } else {
                        iM2568 = (i25 - C2105.m6981("ۤ֫")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        c9557 = c9557;
                        i4 = ((iM2568 ^ i26) * (-1497)) ^ 2123399078;
                        i16 = -1508681750;
                        i28 = iM2568 ^ i16;
                        i27 = i4;
                        c9557 = c9557;
                        c9556 = c9556;
                        strM1959 = strM1959;
                    }
                    break;
                case -1785478526:
                case 1917473401:
                    strM1959 = strM1959;
                    c9556 = c9556;
                    c9557 = c9557;
                    if (zM5910) {
                        iM2568 = (C2105.m6981("᩶᩹") ^ i26) * (-77);
                        i4 = ((iM2568 ^ i25) * (-29813)) ^ (-474157992);
                        i16 = -827172568;
                    } else {
                        iM2568 = (C2105.m6981("᩵۠") + i26) * (-37);
                        i4 = ((iM2568 ^ i25) * (-32419)) ^ 1382658952;
                        i16 = 767387014;
                    }
                    i28 = iM2568 ^ i16;
                    i27 = i4;
                    c9557 = c9557;
                    c9556 = c9556;
                    strM1959 = strM1959;
                    break;
                case -1780660566:
                case -548911118:
                    ServiceConnectionC3453.m10564();
                    if (C0714.f2697 >= 0) {
                        iM2566 = C0630.m2566("᩶ۡ") ^ i25;
                        i = ((iM2566 ^ i26) * 32015) ^ 812588771;
                        i2 = 515412675;
                        i28 = iM2566 ^ i2;
                        i27 = i;
                    } else {
                        c9558 = c9558;
                        strM1959 = strM1959;
                        i32 = i32;
                        c9556 = c9556;
                        sArr3 = sArr3;
                        i35 = i35;
                        c9557 = c9557;
                        i20 = i34;
                        iM25610 = (i26 - C0630.m2566("᩵ܰ")) * 19;
                        i21 = ((iM25610 ^ i25) * (-32471)) ^ (-490409037);
                        i22 = 345859802;
                        i34 = i20;
                        i35 = i35;
                        c9557 = c9557;
                        sArr3 = sArr3;
                        sArr2 = sArr2;
                        s2 = s2;
                        i28 = iM25610 ^ i22;
                        i27 = i21;
                        c9556 = c9556;
                        i32 = i32;
                        strM1959 = strM1959;
                        i31 = i31;
                        c9558 = c9558;
                    }
                    break;
                case -1776656599:
                case 213314968:
                    c9558 = c9558;
                    strM1959 = strM1959;
                    c9556 = c9556;
                    sArr3 = sArr3;
                    c9557 = c9557;
                    i32 = i32;
                    i35 = i35;
                    str = null;
                    if (i32 < C3432.m10481(arrayList)) {
                        iM6983 = (i26 - C2105.m6981("ۖۘ")) * 83;
                        i10 = ((iM6983 ^ i25) * (-16287)) ^ (-1423371672);
                        i11 = 942751599;
                    } else {
                        iM6983 = C2105.m6981("᩻֫") ^ i25;
                        i10 = ((iM6983 ^ i26) * 11635) ^ 298525782;
                        i11 = -1462767495;
                    }
                    i28 = iM6983 ^ i11;
                    i27 = i10;
                    i35 = i35;
                    c9558 = c9558;
                    sArr3 = sArr3;
                    i32 = i32;
                    c9557 = c9557;
                    c9556 = c9556;
                    strM1959 = strM1959;
                    break;
                case -1772822338:
                case -1462395918:
                    C4159.m12565();
                    if (!C1504.f5354) {
                        strM1959 = strM1959;
                        iM6986 = C0630.m2566("ۤܽ") ^ i25;
                        i12 = ((iM6986 ^ i26) * (-7793)) ^ 1174839703;
                        i17 = 1073063072;
                        i28 = iM6986 ^ i17;
                        i27 = i12;
                        strM1959 = strM1959;
                    }
                    c9558 = c9558;
                    strM1959 = strM1959;
                    iM7041 = i31;
                    i32 = i32;
                    c9556 = c9556;
                    sArr3 = sArr3;
                    i35 = i35;
                    c9557 = c9557;
                    iM2567 = C0630.m2566("ۗ᩺") ^ i25;
                    i4 = ((iM2567 ^ i26) * (-29927)) ^ 1006850946;
                    i5 = -714665898;
                    i28 = iM2567 ^ i5;
                    i35 = i35;
                    c9558 = c9558;
                    sArr3 = sArr3;
                    i32 = i32;
                    i31 = iM7041;
                    i27 = i4;
                    c9557 = c9557;
                    c9556 = c9556;
                    strM1959 = strM1959;
                    break;
                case -1731587121:
                case 962910590:
                    try {
                        strM1959 = strM1959;
                        try {
                            strM6988 = C2105.m6988(f26935, 63, 3, i30);
                            iM2569 = (C2105.m6981("ۡܳ") ^ i25) * (-5);
                            i18 = ((iM2569 ^ i26) * (-28193)) ^ 1898487933;
                            i19 = 102990665;
                            i28 = iM2569 ^ i19;
                            i27 = i18;
                        } catch (JSONException e) {
                            e = e;
                            jSONException = e;
                            c9556 = c9556;
                            c9557 = c9557;
                            i35 = i35;
                            iM6983 = C0630.m2566("ܶۤ") ^ i26;
                            c9558 = c9558;
                            i10 = ((iM6983 ^ i25) * (-20945)) ^ 1196819846;
                            i11 = 1548746634;
                            i28 = iM6983 ^ i11;
                            i27 = i10;
                            i35 = i35;
                            c9558 = c9558;
                            sArr3 = sArr3;
                            i32 = i32;
                            c9557 = c9557;
                            c9556 = c9556;
                        }
                    } catch (JSONException e2) {
                        e = e2;
                        strM1959 = strM1959;
                    }
                    strM1959 = strM1959;
                    break;
                case -1673568498:
                case 1630354997:
                    i23 = 0;
                    int iM6989 = (C2105.m6981("᩻ᩴ") ^ i25) * 5;
                    int i37 = ((iM6989 ^ i26) * 2895) ^ 412521991;
                    i28 = iM6989 ^ 2142025282;
                    i35 = i35;
                    c9557 = c9557;
                    sArr3 = sArr3;
                    i32 = i23;
                    i27 = i37;
                    c9556 = c9556;
                    strM1959 = strM1959;
                    c9558 = c9558;
                    break;
                case -1535260014:
                case -247342999:
                    i30 = 28260;
                    iM6981 = C2105.m6981("۟ܶ") ^ i25;
                    i6 = ((iM6981 ^ i26) * (-6005)) ^ (-1717366665);
                    i7 = 1863348850;
                    i28 = iM6981 ^ i7;
                    i27 = i6;
                    i34 = i34;
                    i35 = i35;
                    c9557 = c9557;
                    sArr3 = sArr3;
                    sArr2 = sArr2;
                    c9556 = c9556;
                    i32 = i32;
                    strM1959 = strM1959;
                    i31 = i31;
                    c9558 = c9558;
                    break;
                case -1402268978:
                case 1108019779:
                    strM1959 = strM1959;
                    iM6988 = C2105.m6981(C4075.m12252(sArr4, i36, i29, i30));
                    i33 = 2103060884;
                    if (C22628.m50615() != 0) {
                        iM2569 = C2105.m6981("ۚᩳ") ^ i26;
                        i18 = ((iM2569 ^ i25) * 32595) ^ 1234522753;
                        i19 = -564193596;
                    } else {
                        iM2569 = (C0630.m2566("ᩴܺ") ^ i26) * 19;
                        i18 = ((iM2569 ^ i25) * 2981) ^ 702405534;
                        i19 = 1843230344;
                    }
                    i28 = iM2569 ^ i19;
                    i27 = i18;
                    strM1959 = strM1959;
                    break;
                case -1297390868:
                case 1034109274:
                    if (C1047.f3863 >= 0) {
                        iM2566 = C0630.m2566("᩶ܶ") ^ i26;
                        i = ((iM2566 ^ i25) * 23449) ^ (-2039939501);
                        i2 = -1900242881;
                        i28 = iM2566 ^ i2;
                        i27 = i;
                    } else {
                        c9554 = c9558;
                        strM1959 = strM1959;
                        c9556 = c9556;
                        c9555 = c9557;
                        i3 = i32;
                        iM6985 = (C2105.m6981("ۤ᩷") ^ i26) * (-61);
                        i15 = ((iM6985 ^ i25) * (-2237)) ^ (-212382464);
                        i14 = -765314289;
                        i28 = iM6985 ^ i14;
                        i32 = i3;
                        i27 = i15;
                        c9557 = c9555;
                        c9558 = c9554;
                        c9556 = c9556;
                        strM1959 = strM1959;
                    }
                    break;
                case -1264739379:
                case 641146892:
                    strM1959 = strM1959;
                    C1711.m5728(iM6988 ^ i33);
                    c9557 = (C9554) C3537.m10755(arrayList, z2 ? 1 : 0);
                    if (!C0798.f2919) {
                        iM2569 = (i25 - C0630.m2566("֡ۛ")) * (-97);
                        i18 = ((iM2569 ^ i26) * (-18671)) ^ (-1955374707);
                        i19 = 1184879667;
                        i28 = iM2569 ^ i19;
                        i27 = i18;
                        strM1959 = strM1959;
                    } else {
                        iM6986 = C0630.m2566("ۤܽ") ^ i25;
                        i12 = ((iM6986 ^ i26) * (-7793)) ^ 1174839703;
                        i17 = 1073063072;
                        i28 = iM6986 ^ i17;
                        i27 = i12;
                        strM1959 = strM1959;
                    }
                    break;
                case -1262717855:
                case 479268737:
                    z3 = false;
                    iM6983 = C2105.m6981("ۨܳ") ^ i26;
                    i10 = ((iM6983 ^ i25) * 3785) ^ (-1856408665);
                    i11 = 2043060351;
                    i28 = iM6983 ^ i11;
                    i27 = i10;
                    i35 = i35;
                    c9558 = c9558;
                    sArr3 = sArr3;
                    i32 = i32;
                    c9557 = c9557;
                    c9556 = c9556;
                    strM1959 = strM1959;
                    break;
                case -1124779751:
                case 805750814:
                    C3663.m11168();
                    c9558 = c9558;
                    strM1959 = strM1959;
                    i32 = i32;
                    c9556 = c9556;
                    sArr3 = sArr3;
                    i35 = i35;
                    c9557 = c9557;
                    i20 = i34;
                    iM25610 = (i26 - C0630.m2566("᩵ܰ")) * 19;
                    i21 = ((iM25610 ^ i25) * (-32471)) ^ (-490409037);
                    i22 = 345859802;
                    i34 = i20;
                    i35 = i35;
                    c9557 = c9557;
                    sArr3 = sArr3;
                    sArr2 = sArr2;
                    s2 = s2;
                    i28 = iM25610 ^ i22;
                    i27 = i21;
                    c9556 = c9556;
                    i32 = i32;
                    strM1959 = strM1959;
                    i31 = i31;
                    c9558 = c9558;
                    break;
                case -1097149158:
                case 687626136:
                    if (!zM6314) {
                        iM2566 = C0630.m2566("۟ۜ") ^ i25;
                        i = ((iM2566 ^ i26) * 3527) ^ 1510254799;
                        i2 = 680274758;
                        i28 = iM2566 ^ i2;
                        i27 = i;
                    } else {
                        c9558 = c9558;
                        strM1959 = strM1959;
                        c9556 = c9556;
                        sArr3 = sArr3;
                        c9557 = c9557;
                        i32 = i32;
                        i35 = i35;
                        iM6983 = (i26 - C2105.m6981("᩸ۜ")) * (-27);
                        i10 = ((iM6983 ^ i25) * 2607) ^ 716600692;
                        i11 = 18661438;
                        i28 = iM6983 ^ i11;
                        i27 = i10;
                        i35 = i35;
                        c9558 = c9558;
                        sArr3 = sArr3;
                        i32 = i32;
                        c9557 = c9557;
                        c9556 = c9556;
                        strM1959 = strM1959;
                    }
                    break;
                case -1004800229:
                case -166922689:
                    c9558 = c9558;
                    strM1959 = strM1959;
                    c9556 = c9556;
                    sArr3 = sArr3;
                    c9557 = c9557;
                    i32 = i32;
                    i35 = i35;
                    z = true;
                    if (C4075.m12247(C1005.m3497(c10235)) != 0) {
                        iM6983 = C0630.m2566("ۜ᩵") ^ i25;
                        i10 = ((iM6983 ^ i26) * (-12445)) ^ 582647704;
                        i11 = 1842656942;
                    } else {
                        iM6983 = (C2105.m6981("ᩳᩳ") ^ i26) * (-27);
                        i10 = ((iM6983 ^ i25) * 21259) ^ (-426486831);
                        i11 = -348462428;
                    }
                    i28 = iM6983 ^ i11;
                    i27 = i10;
                    i35 = i35;
                    c9558 = c9558;
                    sArr3 = sArr3;
                    i32 = i32;
                    c9557 = c9557;
                    c9556 = c9556;
                    strM1959 = strM1959;
                    break;
                case -998399390:
                case 1482400506:
                    c9558 = c9558;
                    strM1959 = strM1959;
                    i31 = i31;
                    i32 = i32;
                    c9556 = c9556;
                    s2 = s2;
                    sArr2 = sArr2;
                    sArr3 = sArr3;
                    i35 = i35;
                    c9557 = c9557;
                    i20 = i34;
                    sArr = f26935;
                    c = '5';
                    if (C3911.f12484 >= 0) {
                        iM25610 = (i26 - C0630.m2566("᩵ܰ")) * 19;
                        i21 = ((iM25610 ^ i25) * (-32471)) ^ (-490409037);
                        i22 = 345859802;
                    } else {
                        iM25610 = C0630.m2566("۫᩵") ^ i26;
                        i21 = ((iM25610 ^ i25) * 8699) ^ (-1865393157);
                        i22 = 172306791;
                    }
                    i34 = i20;
                    i35 = i35;
                    c9557 = c9557;
                    sArr3 = sArr3;
                    sArr2 = sArr2;
                    s2 = s2;
                    i28 = iM25610 ^ i22;
                    i27 = i21;
                    c9556 = c9556;
                    i32 = i32;
                    strM1959 = strM1959;
                    i31 = i31;
                    c9558 = c9558;
                    break;
                case -970299166:
                case 1096733535:
                    i30 = 38762;
                    iM6981 = C2105.m6981("۟ܶ") ^ i25;
                    i6 = ((iM6981 ^ i26) * (-6005)) ^ (-1717366665);
                    i7 = 1863348850;
                    i28 = iM6981 ^ i7;
                    i27 = i6;
                    i34 = i34;
                    i35 = i35;
                    c9557 = c9557;
                    sArr3 = sArr3;
                    sArr2 = sArr2;
                    c9556 = c9556;
                    i32 = i32;
                    strM1959 = strM1959;
                    i31 = i31;
                    c9558 = c9558;
                    break;
                case -961234148:
                case 575597943:
                    if (C4616.f14690 <= 0) {
                        iM2566 = C0630.m2566("۟۫") ^ i25;
                        i = ((iM2566 ^ i26) * (-25337)) ^ 1426291979;
                        i2 = -1676224266;
                        i28 = iM2566 ^ i2;
                        i27 = i;
                    } else {
                        c9558 = c9558;
                        strM1959 = strM1959;
                        i32 = i32;
                        c9556 = c9556;
                        sArr3 = sArr3;
                        i35 = i35;
                        c9557 = c9557;
                        i20 = i34;
                        iM25610 = (i26 - C0630.m2566("᩵ܰ")) * 19;
                        i21 = ((iM25610 ^ i25) * (-32471)) ^ (-490409037);
                        i22 = 345859802;
                        i34 = i20;
                        i35 = i35;
                        c9557 = c9557;
                        sArr3 = sArr3;
                        sArr2 = sArr2;
                        s2 = s2;
                        i28 = iM25610 ^ i22;
                        i27 = i21;
                        c9556 = c9556;
                        i32 = i32;
                        strM1959 = strM1959;
                        i31 = i31;
                        c9558 = c9558;
                    }
                    break;
                case -844761208:
                case 494086783:
                    C11340.m28031();
                    return false;
                case -834840465:
                case 203246807:
                    C1711.m5740(c9557.f28971);
                    c9557.f28971.m30477(str);
                    return z;
                case -724791943:
                case -575377479:
                    C1005.m3501();
                    if (C1916.m6308() < 0) {
                        c9558 = c9558;
                        strM1959 = strM1959;
                        i31 = i31;
                        i32 = i32;
                        c9556 = c9556;
                        sArr2 = sArr2;
                        sArr3 = sArr3;
                        i35 = i35;
                        c9557 = c9557;
                        i34 = i34;
                        iM6981 = (i25 - C2105.m6981("֡ᩳ")) * (-127);
                        i6 = ((iM6981 ^ i26) * (-12543)) ^ 1192451677;
                        i7 = 255348982;
                        i28 = iM6981 ^ i7;
                        i27 = i6;
                        i34 = i34;
                        i35 = i35;
                        c9557 = c9557;
                        sArr3 = sArr3;
                        sArr2 = sArr2;
                        c9556 = c9556;
                        i32 = i32;
                        strM1959 = strM1959;
                        i31 = i31;
                        c9558 = c9558;
                    } else {
                        iM2566 = C0630.m2566("᩶ۡ") ^ i25;
                        i = ((iM2566 ^ i26) * 32015) ^ 812588771;
                        i2 = 515412675;
                        i28 = iM2566 ^ i2;
                        i27 = i;
                    }
                    break;
                case -639563647:
                case 86730289:
                    c9558 = c9558;
                    strM1959 = strM1959;
                    c9556 = c9556;
                    sArr3 = sArr3;
                    c9557 = c9557;
                    i32 = i32;
                    i35 = i35;
                    try {
                        itM9029 = C2958.m9029(arrayList);
                        iM6983 = (i26 - C2105.m6981("᩸ۜ")) * (-27);
                        i10 = ((iM6983 ^ i25) * 2607) ^ 716600692;
                        i11 = 18661438;
                    } catch (JSONException e3) {
                        jSONException = e3;
                        c9558 = c9558;
                        iM6983 = C0630.m2566("ܶۤ") ^ i26;
                        c9558 = c9558;
                        i10 = ((iM6983 ^ i25) * (-20945)) ^ 1196819846;
                        i11 = 1548746634;
                    }
                    i28 = iM6983 ^ i11;
                    i27 = i10;
                    i35 = i35;
                    c9558 = c9558;
                    sArr3 = sArr3;
                    i32 = i32;
                    c9557 = c9557;
                    c9556 = c9556;
                    strM1959 = strM1959;
                    break;
                case -621545892:
                case 1185435241:
                    strM1959 = strM1959;
                    c9556 = c9556;
                    c9557 = c9557;
                    c9558 = c9558;
                    short[] sArr5 = sArr3;
                    int i38 = i35;
                    strM12578 = C4159.m12578(sArr5, i38, 3, i30);
                    if (C2272.m7503()) {
                        sArr3 = sArr5;
                        iM7041 = i31;
                        i32 = i32;
                        i35 = i38;
                        iM2567 = C0630.m2566("ۗ᩺") ^ i25;
                        i4 = ((iM2567 ^ i26) * (-29927)) ^ 1006850946;
                        i5 = -714665898;
                        i28 = iM2567 ^ i5;
                        i35 = i35;
                        c9558 = c9558;
                        sArr3 = sArr3;
                        i32 = i32;
                        i31 = iM7041;
                        i27 = i4;
                        c9557 = c9557;
                    } else {
                        int iM69810 = (C2105.m6981("᩸ܽ") + i25) * (-109);
                        i28 = iM69810 ^ 84556856;
                        i27 = ((iM69810 ^ i26) * 30013) ^ 1917383600;
                        i35 = i38;
                        c9557 = c9557;
                        c9558 = c9558;
                        sArr3 = sArr5;
                    }
                    c9556 = c9556;
                    strM1959 = strM1959;
                    break;
                case -607759450:
                case 1283556750:
                    strM1959 = strM1959;
                    try {
                        C9554 c9559 = (C9554) C2272.m7513(itM9029);
                        try {
                            strM6237 = c9559.f28973.m6237();
                            zM6313 = C1916.m6313(strM6237);
                            int iM69811 = (i26 - C2105.m6981("ۧۤ")) * 15;
                            i28 = iM69811 ^ (-606248077);
                            i27 = ((iM69811 ^ i25) * (-5639)) ^ (-264025297);
                            c9558 = c9559;
                        } catch (JSONException e4) {
                            jSONException = e4;
                            c9558 = c9559;
                            c9556 = c9556;
                            c9557 = c9557;
                            i35 = i35;
                            iM6983 = C0630.m2566("ܶۤ") ^ i26;
                            c9558 = c9558;
                            i10 = ((iM6983 ^ i25) * (-20945)) ^ 1196819846;
                            i11 = 1548746634;
                            i28 = iM6983 ^ i11;
                            i27 = i10;
                            i35 = i35;
                            c9558 = c9558;
                            sArr3 = sArr3;
                            i32 = i32;
                            c9557 = c9557;
                            c9556 = c9556;
                        }
                    } catch (JSONException e5) {
                        e = e5;
                        jSONException = e;
                        c9556 = c9556;
                        c9557 = c9557;
                        i35 = i35;
                        iM6983 = C0630.m2566("ܶۤ") ^ i26;
                        c9558 = c9558;
                        i10 = ((iM6983 ^ i25) * (-20945)) ^ 1196819846;
                        i11 = 1548746634;
                        i28 = iM6983 ^ i11;
                        i27 = i10;
                        i35 = i35;
                        c9558 = c9558;
                        sArr3 = sArr3;
                        i32 = i32;
                        c9557 = c9557;
                        c9556 = c9556;
                        strM1959 = strM1959;
                        break;
                    }
                    strM1959 = strM1959;
                    break;
                case -316088192:
                case 649082554:
                    strM1959 = strM1959;
                    JSONException jSONException2 = jSONException;
                    c9556 = c9556;
                    c9557 = c9557;
                    if (i32 != 0) {
                        int iM25611 = C0630.m2566("֫۟") ^ i25;
                        jSONException = jSONException2;
                        i27 = ((iM25611 ^ i26) * (-29267)) ^ (-1918204539);
                        i28 = iM25611 ^ (-516339107);
                    } else {
                        jSONException = jSONException2;
                        c9558 = c9558;
                        i32 = i32;
                        sArr3 = sArr3;
                        i35 = i35;
                        iM6983 = (C2105.m6981("ۖܺ") + i26) * 99;
                        i10 = ((iM6983 ^ i25) * (-24183)) ^ (-1315462375);
                        i11 = -580213128;
                        i28 = iM6983 ^ i11;
                        i27 = i10;
                        i35 = i35;
                        c9558 = c9558;
                        sArr3 = sArr3;
                        i32 = i32;
                    }
                    c9557 = c9557;
                    c9556 = c9556;
                    strM1959 = strM1959;
                    break;
                case -303275617:
                case 565875654:
                    c9558 = c9558;
                    strM1959 = strM1959;
                    i31 = i31;
                    i32 = i32;
                    c9556 = c9556;
                    short s3 = s2;
                    sArr2 = sArr2;
                    sArr3 = sArr3;
                    i35 = i35;
                    c9557 = c9557;
                    i20 = i34;
                    int i39 = s3 + s;
                    if ((i39 * i39) - (s3 * 8488) >= 0) {
                        iM25610 = C0630.m2566("ۢ᩸") ^ i25;
                        s2 = s3;
                        i21 = ((iM25610 ^ i26) * 27839) ^ 2087773540;
                        i22 = -1967110990;
                    } else {
                        s2 = s3;
                        iM25610 = (C2105.m6981("ܳ᩻") + i26) * q.h;
                        i21 = ((iM25610 ^ i25) * (-9873)) ^ 739542624;
                        i22 = -311167385;
                    }
                    i34 = i20;
                    i35 = i35;
                    c9557 = c9557;
                    sArr3 = sArr3;
                    sArr2 = sArr2;
                    s2 = s2;
                    i28 = iM25610 ^ i22;
                    i27 = i21;
                    c9556 = c9556;
                    i32 = i32;
                    strM1959 = strM1959;
                    i31 = i31;
                    c9558 = c9558;
                    break;
                case -300861767:
                case 457865961:
                    C9554 c95510 = c9558;
                    strM1959 = strM1959;
                    c9556 = c9556;
                    short[] sArr6 = sArr3;
                    c9557 = c9557;
                    i32 = i32;
                    int i40 = i35;
                    int i41 = i31;
                    if (i41 == (C2105.m6981(strM6573) ^ 2122488396)) {
                        iM6982 = (C0630.m2566("۟ۙ") + i26) * (-35);
                        i8 = ((iM6982 ^ i25) * 6347) ^ (-1820679678);
                        i9 = -1320285716;
                    } else {
                        iM6982 = (C2105.m6981("ۡۨ") ^ i25) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = ((iM6982 ^ i26) * (-17251)) ^ (-1297678301);
                        i9 = 1129913803;
                    }
                    i28 = iM6982 ^ i9;
                    i27 = i8;
                    i31 = i41;
                    i35 = i40;
                    c9558 = c95510;
                    sArr3 = sArr6;
                    z2 = false;
                    i32 = i32;
                    c9557 = c9557;
                    c9556 = c9556;
                    strM1959 = strM1959;
                    break;
                case -193468412:
                case 103911789:
                    try {
                        jSONObject.put(strM6988, strM1959);
                        c9558 = c9558;
                        strM1959 = strM1959;
                        c9556 = c9556;
                        sArr3 = sArr3;
                        c9557 = c9557;
                        i32 = i32;
                        i35 = i35;
                        iM6983 = (i26 - C2105.m6981("᩸ۜ")) * (-27);
                        i10 = ((iM6983 ^ i25) * 2607) ^ 716600692;
                        i11 = 18661438;
                    } catch (JSONException e6) {
                        jSONException = e6;
                        strM1959 = strM1959;
                        c9556 = c9556;
                        c9557 = c9557;
                        i35 = i35;
                        iM6983 = C0630.m2566("ܶۤ") ^ i26;
                        c9558 = c9558;
                        i10 = ((iM6983 ^ i25) * (-20945)) ^ 1196819846;
                        i11 = 1548746634;
                    }
                    i28 = iM6983 ^ i11;
                    i27 = i10;
                    i35 = i35;
                    c9558 = c9558;
                    sArr3 = sArr3;
                    i32 = i32;
                    c9557 = c9557;
                    c9556 = c9556;
                    strM1959 = strM1959;
                    break;
                case -96806383:
                case 1819871649:
                    strM1959 = strM1959;
                    this.f26940.m2043(z2 ? 1 : 0);
                    sArr4 = f26935;
                    i36 = 60;
                    i29 = 3;
                    if (C2105.m6982() != 0) {
                        iM6986 = C0630.m2566("ۤܽ") ^ i25;
                        i12 = ((iM6986 ^ i26) * (-7793)) ^ 1174839703;
                        i17 = 1073063072;
                    } else {
                        iM6986 = (i25 - C2105.m6981("ۛۙ")) * 43;
                        i12 = ((iM6986 ^ i26) * (-17167)) ^ (-1625789324);
                        i17 = 1975617862;
                    }
                    i28 = iM6986 ^ i17;
                    i27 = i12;
                    strM1959 = strM1959;
                    break;
                case -95721960:
                case 313426572:
                    c9558 = c9558;
                    strM1959 = strM1959;
                    i31 = i31;
                    i32 = i32;
                    c9556 = c9556;
                    sArr2 = sArr2;
                    sArr3 = sArr3;
                    i35 = i35;
                    c9557 = c9557;
                    i34 = i34;
                    s2 = sArr[c];
                    s = 2122;
                    if (C3663.f11553) {
                        iM6981 = (i25 - C2105.m6981("֡ᩳ")) * (-127);
                        i6 = ((iM6981 ^ i26) * (-12543)) ^ 1192451677;
                        i7 = 255348982;
                    } else {
                        iM6981 = (C0630.m2566("۫ܰ") + i25) * (-113);
                        i6 = ((iM6981 ^ i26) * (-10485)) ^ 510928133;
                        i7 = 2143256403;
                    }
                    i28 = iM6981 ^ i7;
                    i27 = i6;
                    i34 = i34;
                    i35 = i35;
                    c9557 = c9557;
                    sArr3 = sArr3;
                    sArr2 = sArr2;
                    c9556 = c9556;
                    i32 = i32;
                    strM1959 = strM1959;
                    i31 = i31;
                    c9558 = c9558;
                    break;
                case -69558493:
                case 1691434997:
                    if (C2958.f9394 >= 0) {
                        iM2566 = C0630.m2566("᩶ۡ") ^ i25;
                        i = ((iM2566 ^ i26) * 32015) ^ 812588771;
                        i2 = 515412675;
                    } else {
                        iM2566 = C0630.m2566("ۡۚ") ^ i26;
                        i = ((iM2566 ^ i25) * 13651) ^ (-1410570015);
                        i2 = 1759559419;
                    }
                    i28 = iM2566 ^ i2;
                    i27 = i;
                    break;
                case 119296084:
                case 795324049:
                    return z2;
                case 133452499:
                case 1130969153:
                    z3 = true;
                    iM6983 = C2105.m6981("ۨܳ") ^ i26;
                    i10 = ((iM6983 ^ i25) * 3785) ^ (-1856408665);
                    i11 = 2043060351;
                    i28 = iM6983 ^ i11;
                    i27 = i10;
                    i35 = i35;
                    c9558 = c9558;
                    sArr3 = sArr3;
                    i32 = i32;
                    c9557 = c9557;
                    c9556 = c9556;
                    strM1959 = strM1959;
                    break;
                case 171632337:
                case 734982914:
                    C9554 c95511 = c9557;
                    C9554 c95512 = c9558;
                    strM1959 = strM1959;
                    int i42 = i32;
                    short[] sArr7 = sArr3;
                    int i43 = i35;
                    C9554 c95513 = (C9554) C3019.m9263(arrayList, i42);
                    if (ServiceConnectionC3453.m10554(C1005.m3497(c95513.f28974)) == 0) {
                        iM6984 = (C2105.m6981("ۢۖ") ^ i25) * 73;
                        i12 = ((iM6984 ^ i26) * (-24109)) ^ 2051475948;
                        i13 = 81916422;
                    } else {
                        iM6984 = C2105.m6981("ۖۡ") ^ i26;
                        i12 = ((iM6984 ^ i25) * 4423) ^ (-43514368);
                        i13 = 667363446;
                    }
                    i28 = iM6984 ^ i13;
                    i35 = i43;
                    c9558 = c95512;
                    sArr3 = sArr7;
                    i32 = i42;
                    c9557 = c95511;
                    c9556 = c95513;
                    i27 = i12;
                    strM1959 = strM1959;
                    break;
                case 250037138:
                case 653902307:
                    c9558 = c9558;
                    strM1959 = strM1959;
                    c9556 = c9556;
                    sArr3 = sArr3;
                    c9557 = c9557;
                    i32 = i32;
                    i35 = i35;
                    arrayList = this.f26941;
                    C10235 c10236 = ((C9554) C3019.m9263(arrayList, z2 ? 1 : 0)).f28971;
                    if (!C0798.f2919) {
                        int iM25612 = C0630.m2566("ܶܶ") ^ i25;
                        c10235 = c10236;
                        i27 = ((iM25612 ^ i26) * 14263) ^ 1312363893;
                        i28 = iM25612 ^ (-659459831);
                        i35 = i35;
                        c9558 = c9558;
                        sArr3 = sArr3;
                        i32 = i32;
                        c9557 = c9557;
                        c9556 = c9556;
                        strM1959 = strM1959;
                    } else {
                        c10235 = c10236;
                        i32 = i32;
                        i20 = i34;
                        iM25610 = (i26 - C0630.m2566("᩵ܰ")) * 19;
                        i21 = ((iM25610 ^ i25) * (-32471)) ^ (-490409037);
                        i22 = 345859802;
                        i34 = i20;
                        i35 = i35;
                        c9557 = c9557;
                        sArr3 = sArr3;
                        sArr2 = sArr2;
                        s2 = s2;
                        i28 = iM25610 ^ i22;
                        i27 = i21;
                        c9556 = c9556;
                        i32 = i32;
                        strM1959 = strM1959;
                        i31 = i31;
                        c9558 = c9558;
                    }
                    break;
                case 275304229:
                case 939344811:
                    jSONObject2.put(strM6988, C0050.m947(C11340.m28030(c9558.f28974)));
                    strM1959 = C0422.m1959(C1005.m3497(c9558.f28971));
                    zM6314 = C1916.m6313(strM1959);
                    iM2566 = C0630.m2566("᩻ܺ") ^ i26;
                    i = ((iM2566 ^ i25) * (-26611)) ^ (-1146956982);
                    i2 = 806627462;
                    i28 = iM2566 ^ i2;
                    i27 = i;
                    break;
                case 295755823:
                case 2116357687:
                    i23 = i32 + 1;
                    int iM69812 = (C2105.m6981("᩻ᩴ") ^ i25) * 5;
                    int i310 = ((iM69812 ^ i26) * 2895) ^ 412521991;
                    i28 = iM69812 ^ 2142025282;
                    i35 = i35;
                    c9557 = c9557;
                    sArr3 = sArr3;
                    i32 = i23;
                    i27 = i310;
                    c9556 = c9556;
                    strM1959 = strM1959;
                    c9558 = c9558;
                    break;
                case 318171993:
                case 1070604809:
                    C0798.m3004(C0630.m2566(strM12578) ^ 2129852984);
                    C0798.m3010(c9556.f28974);
                    return z;
                case 450781976:
                case 1059893692:
                    c9558 = c9558;
                    strM1959 = strM1959;
                    c9556 = c9556;
                    sArr3 = sArr3;
                    int i44 = i35;
                    c9557 = c9557;
                    i32 = i32;
                    if (z3) {
                        i35 = i44;
                        iM6983 = (C2105.m6981("ۖܺ") + i26) * 99;
                        i10 = ((iM6983 ^ i25) * (-24183)) ^ (-1315462375);
                        i11 = -580213128;
                    } else {
                        iM6983 = C0630.m2566("ᩴ᩶") ^ i25;
                        i35 = i44;
                        i10 = ((iM6983 ^ i26) * 31237) ^ 247608947;
                        i11 = -1013526540;
                    }
                    i28 = iM6983 ^ i11;
                    i27 = i10;
                    i35 = i35;
                    c9558 = c9558;
                    sArr3 = sArr3;
                    i32 = i32;
                    c9557 = c9557;
                    c9556 = c9556;
                    strM1959 = strM1959;
                    break;
                case 469967825:
                case 1358622292:
                    c9554 = c9558;
                    strM1959 = strM1959;
                    c9556 = c9556;
                    c9555 = c9557;
                    i3 = i32;
                    this.f26940.m2043(i3);
                    sArr3 = f26935;
                    i35 = 57;
                    if (C1047.m3599() >= 0) {
                        iM6985 = (C2105.m6981("ۤ᩷") ^ i26) * (-61);
                        i15 = ((iM6985 ^ i25) * (-2237)) ^ (-212382464);
                        i14 = -765314289;
                    } else {
                        iM6985 = (i26 - C0630.m2566("֡᩺")) * (-25);
                        i15 = ((iM6985 ^ i25) * (-31791)) ^ 804683291;
                        i14 = -676177071;
                    }
                    i28 = iM6985 ^ i14;
                    i32 = i3;
                    i27 = i15;
                    c9557 = c9555;
                    c9558 = c9554;
                    c9556 = c9556;
                    strM1959 = strM1959;
                    break;
                case 544426464:
                case 1211805122:
                    C0964.m3402(new C20843(this, jSONObject2, jSONObject));
                    return z;
                case 613773062:
                case 1303550522:
                    c9558 = c9558;
                    strM1959 = strM1959;
                    i31 = i31;
                    c9556 = c9556;
                    sArr3 = sArr3;
                    c9557 = c9557;
                    int i45 = i32;
                    i35 = i35;
                    i32 = i45;
                    short[] sArr8 = sArr2;
                    i34 = i34;
                    strM6573 = AbstractC2021.m6573(sArr8, i34, 3, i30);
                    if (C1128.f4106 > 0) {
                        iM6981 = C2105.m6981("᩸֫") ^ i26;
                        sArr2 = sArr8;
                        i6 = ((iM6981 ^ i25) * (-7569)) ^ 1621461164;
                        i7 = -151433333;
                        i28 = iM6981 ^ i7;
                        i27 = i6;
                        i34 = i34;
                        i35 = i35;
                        c9557 = c9557;
                        sArr3 = sArr3;
                        sArr2 = sArr2;
                        c9556 = c9556;
                        i32 = i32;
                        strM1959 = strM1959;
                        i31 = i31;
                        c9558 = c9558;
                    } else {
                        sArr2 = sArr8;
                        i34 = i34;
                        iM7041 = i31;
                        iM2567 = C0630.m2566("ۗ᩺") ^ i25;
                        i4 = ((iM2567 ^ i26) * (-29927)) ^ 1006850946;
                        i5 = -714665898;
                        i28 = iM2567 ^ i5;
                        i35 = i35;
                        c9558 = c9558;
                        sArr3 = sArr3;
                        i32 = i32;
                        i31 = iM7041;
                        i27 = i4;
                        c9557 = c9557;
                        c9556 = c9556;
                        strM1959 = strM1959;
                    }
                    break;
                case 755452276:
                case 1151621861:
                    ServiceConnectionC3453.m10561(this, jSONException, str);
                    return z;
                case 1587278415:
                case 1691688178:
                    strM1959 = strM1959;
                    c9556 = c9556;
                    c9557 = c9557;
                    try {
                        zM5910 = C1773.m5910(itM9029);
                        iM2568 = (i25 - C0630.m2566("ᩴۜ")) * 7;
                        i4 = ((iM2568 ^ i26) * (-8383)) ^ 1068218584;
                        i16 = 895304475;
                        i28 = iM2568 ^ i16;
                        i27 = i4;
                    } catch (JSONException e7) {
                        jSONException = e7;
                        i35 = i35;
                        iM6983 = C0630.m2566("ܶۤ") ^ i26;
                        c9558 = c9558;
                        i10 = ((iM6983 ^ i25) * (-20945)) ^ 1196819846;
                        i11 = 1548746634;
                        i28 = iM6983 ^ i11;
                        i27 = i10;
                        i35 = i35;
                        c9558 = c9558;
                        sArr3 = sArr3;
                        i32 = i32;
                    }
                    c9557 = c9557;
                    c9556 = c9556;
                    strM1959 = strM1959;
                    break;
                case 1879777763:
                case 2065474600:
                    C1128.m3851();
                    if (C1420.f5096 > 0) {
                        c9554 = c9558;
                        strM1959 = strM1959;
                        c9556 = c9556;
                        c9555 = c9557;
                        i3 = i32;
                        iM6985 = (C2105.m6981("ۤ᩷") ^ i26) * (-61);
                        i15 = ((iM6985 ^ i25) * (-2237)) ^ (-212382464);
                        i14 = -765314289;
                        i28 = iM6985 ^ i14;
                        i32 = i3;
                        i27 = i15;
                        c9557 = c9555;
                        c9558 = c9554;
                        c9556 = c9556;
                        strM1959 = strM1959;
                    } else {
                        iM2566 = C0630.m2566("᩶ۡ") ^ i25;
                        i = ((iM2566 ^ i26) * 32015) ^ 812588771;
                        i2 = 515412675;
                        i28 = iM2566 ^ i2;
                        i27 = i;
                    }
                    break;
                default:
                    strM1959 = strM1959;
                    if (zM6313) {
                        iM2569 = C2105.m6981("ۨۗ") ^ i26;
                        i18 = ((iM2569 ^ i25) * (-17321)) ^ (-37801831);
                        i19 = 563037840;
                    } else {
                        strM6988 = strM6237;
                        iM2569 = (C2105.m6981("ۡܳ") ^ i25) * (-5);
                        i18 = ((iM2569 ^ i26) * (-28193)) ^ 1898487933;
                        i19 = 102990665;
                    }
                    i28 = iM2569 ^ i19;
                    i27 = i18;
                    strM1959 = strM1959;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m22865(ActivityC8848 activityC8848) {
        String str = null;
        C10465 c10465M29005 = null;
        Iterator itM12354 = null;
        C9554 c9554 = null;
        C1893 c1893 = null;
        String strM6237 = null;
        C6231 c6231 = null;
        C10235 c10235 = null;
        String strM17155 = null;
        int i = -2017668281;
        int i2 = C4117.f13076;
        int i3 = C3432.f10845;
        int iM6981 = (C2105.m6981("ۚܶ") ^ i3) * 123;
        int i4 = ((iM6981 ^ i2) * (-24757)) ^ (-1082402259);
        int i5 = 1522354683;
        while (true) {
            i = ((((i ^ i2) * 23245) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2108424218:
                case 1119279774:
                    c10235 = c9554.f28974;
                    strM17155 = c6231.m17155();
                    if (C0798.f2919) {
                        iM6981 = C2105.m6981("᩶᩻") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-21819)) ^ (-1611730892);
                        i5 = 1968568318;
                    } else {
                        iM6981 = (C2105.m6981("۫ۛ") + i2) * (-47);
                        i4 = ((iM6981 ^ i3) * (-19559)) ^ 1354686498;
                        i5 = 1127501219;
                    }
                    break;
                case -2105324701:
                case -678623671:
                    if (C1916.f6442) {
                        iM6981 = (i3 - C0630.m2566("᩶᩷")) * (-17);
                        i4 = ((iM6981 ^ i2) * (-15421)) ^ (-1539899705);
                        i5 = -2040888793;
                    } else {
                        iM6981 = C2105.m6981("᩶᩻") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-21819)) ^ (-1611730892);
                        i5 = 1968568318;
                    }
                    break;
                case -2060096726:
                case 1240202586:
                    if (C21923.f70183 != 0) {
                        iM6981 = (C2105.m6981("ᩴ۟") + i3) * (-85);
                        i4 = ((iM6981 ^ i2) * (-28765)) ^ (-1525225590);
                        i5 = -300560288;
                    } else {
                        iM6981 = (C2105.m6981("ۜۙ") + i3) * (-125);
                        i4 = ((iM6981 ^ i2) * 5209) ^ 1059326996;
                        i5 = -322684055;
                    }
                    break;
                case -1704109224:
                case -1401949129:
                    if (C1773.m5910(itM12354)) {
                        iM6981 = (C0630.m2566("֡ܳ") + i2) * 73;
                        i4 = ((iM6981 ^ i3) * (-1139)) ^ 538253796;
                        i5 = -135576829;
                    } else {
                        iM6981 = (C0630.m2566("۠ۢ") + i3) * (-51);
                        i4 = ((iM6981 ^ i2) * (-27219)) ^ (-569249545);
                        i5 = -1609491510;
                    }
                    break;
                case -1531803618:
                case 1611780037:
                    c1893 = c9554.f28973;
                    if (C1128.m3851() <= 0) {
                        iM6981 = (C2105.m6981("ᩴ۟") + i3) * (-85);
                        i4 = ((iM6981 ^ i2) * (-28765)) ^ (-1525225590);
                        i5 = -300560288;
                    } else {
                        iM6981 = (C0630.m2566("۟ܽ") + i3) * (-73);
                        i4 = ((iM6981 ^ i2) * (-13815)) ^ (-1659094230);
                        i5 = 2104530268;
                    }
                    break;
                case -1522971138:
                case 1289165160:
                    activityC8848.f26937 = true;
                    break;
                case -1403978099:
                case -772434346:
                    if (C4117.f13076 > 0) {
                        iM6981 = C2105.m6981("᩶᩻") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-21819)) ^ (-1611730892);
                        i5 = 1968568318;
                    } else {
                        iM6981 = (C2105.m6981("ᩴ۟") + i3) * (-85);
                        i4 = ((iM6981 ^ i2) * (-28765)) ^ (-1525225590);
                        i5 = -300560288;
                    }
                    break;
                case -1291796141:
                case 1374589606:
                    c6231 = (C6231) C0964.m3410(c10465M29005.f31405, strM6237);
                    if (c6231 != null) {
                        iM6981 = (C0630.m2566("ܽ᩸") + i2) * (-31);
                        i4 = ((iM6981 ^ i3) * 8867) ^ 371815430;
                        i5 = -14411100;
                    } else {
                        iM6981 = C2105.m6981("ۢۖ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-16855)) ^ 1253909404;
                        i5 = -89738588;
                    }
                    break;
                case -1145891336:
                case 1004362179:
                    if (C4159.f13567) {
                        iM6981 = C2105.m6981("ᩴۗ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 31411) ^ (-843773522);
                        i5 = 932457128;
                    } else {
                        iM6981 = (C2105.m6981("᩹ۛ") + i2) * (-5);
                        i4 = ((iM6981 ^ i3) * 8375) ^ (-848335656);
                        i5 = -2017929833;
                    }
                    break;
                case -901315420:
                case 1720414513:
                    if (RunnableC0588.m2441() >= 0) {
                        iM6981 = (C0630.m2566("֨ܿ") ^ i3) * 31;
                        i4 = ((iM6981 ^ i2) * 2807) ^ 1150059921;
                        i5 = 1014848631;
                    } else {
                        iM6981 = (C2105.m6981("ᩴ۟") + i3) * (-85);
                        i4 = ((iM6981 ^ i2) * (-28765)) ^ (-1525225590);
                        i5 = -300560288;
                    }
                    break;
                case -848005453:
                case 1213966946:
                    c9554 = (C9554) RunnableC1108.m3791(itM12354);
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = (C2105.m6981("ᩴ۟") + i3) * (-85);
                        i4 = ((iM6981 ^ i2) * (-28765)) ^ (-1525225590);
                        i5 = -300560288;
                    } else {
                        iM6981 = (C0630.m2566("ۗۢ") + i2) * (-65);
                        i4 = ((iM6981 ^ i3) * (-18865)) ^ (-15293247);
                        i5 = 1378528752;
                    }
                    break;
                case -813340429:
                case -258054560:
                    if (C7106.f21815 != 0) {
                        iM6981 = (C2105.m6981("᩹ۛ") + i2) * (-5);
                        i4 = ((iM6981 ^ i3) * 8375) ^ (-848335656);
                        i5 = -2017929833;
                    } else {
                        iM6981 = (C0630.m2566("֨ܿ") ^ i3) * 31;
                        i4 = ((iM6981 ^ i2) * 2807) ^ 1150059921;
                        i5 = 1014848631;
                    }
                    break;
                case -323433341:
                case 1516543879:
                    str = activityC8848.f26943;
                    if (C2958.f9394 >= 0) {
                        iM6981 = (C2105.m6981("᩹ۛ") + i2) * (-5);
                        i4 = ((iM6981 ^ i3) * 8375) ^ (-848335656);
                        i5 = -2017929833;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ۤ᩷")) * (-29);
                        i4 = ((iM6981 ^ i3) * 16737) ^ 1207355364;
                        i5 = 1655656550;
                    }
                    break;
                case -16162908:
                case 1159321598:
                    break;
                case 187854929:
                case 1407693828:
                    C21923.m49331(c10235, strM17155);
                    if (C4159.f13567) {
                        iM6981 = (i3 - C2105.m6981("ۡܰ")) * (-81);
                        i4 = ((iM6981 ^ i2) * (-21859)) ^ (-1616882175);
                        i5 = -771075214;
                    } else {
                        iM6981 = C2105.m6981("᩶᩻") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-21819)) ^ (-1611730892);
                        i5 = 1968568318;
                    }
                    break;
                case 562276022:
                case 1086728233:
                    strM6237 = c1893.m6237();
                    if (C0630.f2410 <= 0) {
                        iM6981 = C0630.m2566("ܽ᩻") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-27441)) ^ (-708328212);
                        i5 = -1504246247;
                    } else {
                        iM6981 = (i3 - C0630.m2566("᩷ܳ")) * (-103);
                        i4 = ((iM6981 ^ i2) * (-10297)) ^ (-1783872904);
                        i5 = -1793290241;
                    }
                    break;
                case 597631900:
                case 709932122:
                    C1047.m3599();
                    RunnableC0588.m2441();
                    iM6981 = (C2105.m6981("ᩴ۟") + i3) * (-85);
                    i4 = ((iM6981 ^ i2) * (-28765)) ^ (-1525225590);
                    i5 = -300560288;
                    break;
                case 788797273:
                case 826211281:
                    C2126.m7040();
                    break;
                case 984394388:
                case 1725871109:
                    C21923.m49331(c9554.f28971, c6231.m17157());
                    iM6981 = C2105.m6981("ۢۖ") ^ i2;
                    i4 = ((iM6981 ^ i3) * (-16855)) ^ 1253909404;
                    i5 = -89738588;
                    break;
                case 1675733731:
                case 2139401998:
                    c10465M29005 = C11876.m29005(str);
                    if (c10465M29005 == null) {
                        iM6981 = (C0630.m2566("֡᩵") + i3) * (-21);
                        i4 = ((iM6981 ^ i2) * 27775) ^ (-1219005897);
                        i5 = -632465904;
                    } else {
                        iM6981 = C0630.m2566("֫᩵") ^ i2;
                        i4 = ((iM6981 ^ i3) * 10317) ^ 1543893838;
                        i5 = -2144023347;
                    }
                    break;
                case 1800609434:
                case 2019584518:
                    if (C4263.m12819() >= 0) {
                        iM6981 = C0630.m2566("ܽ᩻") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-27441)) ^ (-708328212);
                        i5 = -1504246247;
                    } else {
                        iM6981 = (C2105.m6981("ܶܶ") ^ i2) * 5;
                        i4 = ((iM6981 ^ i3) * 1637) ^ 1513404364;
                        i5 = 173833211;
                    }
                    break;
                default:
                    itM12354 = C4117.m12354(activityC8848.f26941);
                    iM6981 = C2105.m6981("ۢۖ") ^ i2;
                    i4 = ((iM6981 ^ i3) * (-16855)) ^ 1253909404;
                    i5 = -89738588;
                    break;
            }
            return;
        }
    }
}
