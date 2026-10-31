package l;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.google.android.material.slider.BaseSlider;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.ec.rfc8032.Scalar25519;

/* JADX INFO: renamed from: l.ܽۜۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51KR */
/* JADX INFO: loaded from: classes.dex */
public class C16475 extends AbstractC14346 implements InterfaceC0440, InterfaceC20834, InterfaceC3900 {

    /* JADX INFO: renamed from: ᩵᩷᩺, reason: not valid java name and contains not printable characters */
    private static final short[] f50637;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f50638;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f50639;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f50640;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f50641;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public TextView f50642;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public TextView f50643;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public boolean f50644;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public String f50645;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C15545 f50646;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f50647;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f50648;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C12392 f50649;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C12366 f50650;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C15893 f50651;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public boolean f50652;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public C3764 f50653;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public AbstractC7548 f50654;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC20313 f50655;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public View f50656;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public C12230 f50657;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C18786 f50658;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public int f50659;

    static {
        ApplicationC12518.m30701(123);
        f50637 = new short[]{165, -18540, -27298, -27999, 6217, 24192, 2205, 3320, 4274, 24311, 5962, -18094, -18093, -18098, -18071, -18094, -18093, -18091, -18087, -18085, -18106, -18081, -18086, -18093, -18071, -18093, -18088, -18095, -18081, -18088, -18093, -18154, -18149, -18154, -18170, -18085, -18107, -18116, -18151, -18151, -18116, -18116, -18151, -18148, -18154, -18154, -18148, -18151, -18116, -18151, -18151, -18116, -18151, -18151, -18154, -18062, -18093, -18091, -18087, -18085, -18106, -18081, -18086, -18093, -18094, -18154, -18092, -18097, -18154, 3295, 28367, 28366, 28371, 28404, 28367, 28366, 28360, 28356, 28358, 28379, 28354, 28359, 28366, 28404, 28366, 28357, 28364, 28354, 28357, 28366, 6393, 26811, 26810, 26791, 26752, 26811, 26810, 26812, 26800, 26802, 26799, 26806, 26803, 26810, 26752, 26810, 26801, 26808, 26806, 26801, 26810, 26802, 26810, 26795, 26807, 26800, 26811, 26762, 26801, 26804, 26801, 26800, 26792, 26801, 26879, 26810, 26797, 26797, 26800, 26797, -466, 4138, -256, 26780, 26814, 26801, 26879, 26801, 26800, 26795, 26879, 26809, 26806, 26801, 26811, 26879, 26802, 26810, 26795, 26807, 26800, 26811, 26853, 26879, 26864, 26864, 26837, 26864, 26864, 26879, 26779, 26810, 26812, 26800, 26802, 26799, 26806, 26803, 26810, 26811, 26879, 26813, 26790, 26879, 26879, 26866, 26879, 26802, 26796, 26837, 26864, 26864, 26837, 26837, 26864, 26869, 26879, 26879, 26869, 26864, 26837, 1364, -13184, -5726, -13184, -13170, -13170, -13170, -13184, -13176, -13175, 44, -16531, -22428, 22164, -32554, -29613, -19142, 454, -6461, 15374, -10469, 9893, 24744, 24865, -27544, 32735, -18143, -19839, -7726, -7718, -7733, -7721, -7728, -7717, -24946, -18329, -28968, 26843, -31624, -17232, 27322, -31195, -17832, -29206, -17926, 28749, 28999, -32467, -28397, -7791, -7723, -7714, -7735, -7714, 31959, 28811, -20256, -17435, 25578, 31134, -19110, -26619, -30577, -19251, 29767, 29870, 26666, -28595, -30441, 1289, 32241, 30476, 17406, 24285, -21010, -20290, -22574, 21606, 20030, 31300, 20877, 20435, 20099, 29653, 22502, 8483, 8482, 8495, 8498, 8473, 8497, 8489, 8500, 8482, 8473, 8497, 8500, 8487, 8502, 8473, 8492, 8487, 8496, 8487, 9931, 31345, 31358, 31347, 31329, 31329, 31330, 31347, 31334, 31354, 9293, -30008, -30026, -29961, -30029, -30018, -30029, -30026, -29961, -30002, -30029, -30039, -30029, -30026, -29984, 3128, -23753, -23752, -23755, -23769, -23769, -23772, -23755, -23776, -23748, -23751, -23759, -23776, -23748, -23749, -23760, -23769, -23759, -23752, -23759, -23753, -23776, -23759, -23760, -23779, -23750, -23750, -23759, -23770, -23785, -23752, -23755, -23769, -23769, -23759, -23769, 9606, -11820, -11838, -11829, -11838, -11836, -11821, -11838, -11837, -11794, -11831, -11831, -11838, -11819, -11804, -11829, -11834, -11820, -11820, -11838, -11820, 7621, 3328, 3350, 3359, 3350, 3344, 3335, 3350, 3351, 3386, 3357, 3357, 3350, 3329, 3376, 3359, 3346, 3328, 3328, 3350, 3328, 4225, 13307, 13258, 13271, 13275, 13199, 13276, 13275, 13248, 13277, 13262, 13256, 13258, 13199, 13254, 13276, 13199, 13276, 13275, 13254, 13251, 13251, 13199, 13251, 13248, 13262, 13259, 13254, 13249, 13256, 5049, 25664, -24133, 21756, 5334, -18383, -18375, -18392, -18380, -18381, -18376, -18318, -18378, -18371, -18390, -18371, -18318};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public native String m38807();

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ֡ */
    public final boolean mo14418() {
        return true;
    }

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ᩵ */
    public final boolean mo17432() {
        return true;
    }

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ܳ */
    public final int mo14420() {
        String strM49334 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = 0;
        int i6 = 814506763;
        int i7 = C3911.f12484;
        int i8 = ServiceConnectionC3453.f10921;
        int iM2566 = C0630.m2566("ۗ۟") ^ i8;
        int i9 = ((iM2566 ^ i7) * (-24221)) ^ (-613580610);
        int i10 = -2068701957;
        while (true) {
            i6 = ((((i6 ^ i7) * (-23319)) >> 31) & i9) ^ (iM2566 ^ i10);
            switch (i6) {
                case -2083063855:
                case 415915706:
                    c = 428;
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = C2105.m6981("ۛ֫") ^ i8;
                        i9 = ((iM2566 ^ i7) * 8535) ^ (-1733267429);
                        i10 = 1184672937;
                    } else {
                        iM2566 = (i8 - C0630.m2566("۠ۛ")) * 33;
                        i9 = ((iM2566 ^ i7) * 5955) ^ 1401059904;
                        i10 = -402145477;
                    }
                    break;
                case -1900656786:
                case 1675491118:
                    s = sArr[c];
                    if (C1504.f5354) {
                        iM2566 = C2105.m6981("ۛ֫") ^ i8;
                        i9 = ((iM2566 ^ i7) * 8535) ^ (-1733267429);
                        i10 = 1184672937;
                    } else {
                        iM2566 = (C2105.m6981("᩷ܰ") ^ i7) * (-127);
                        i9 = ((iM2566 ^ i8) * 23313) ^ 894137608;
                        i10 = 90448466;
                    }
                    break;
                case -1668662723:
                case 2060293129:
                    int i11 = s + s2;
                    if (i2 - (i11 * i11) <= 0) {
                        iM2566 = (i8 - C0630.m2566("ۗ᩺")) * 85;
                        i9 = ((iM2566 ^ i7) * (-18409)) ^ (-1351802881);
                        i10 = -1620585753;
                    } else {
                        iM2566 = (C2105.m6981("᩸᩺") ^ i8) * (-111);
                        i9 = ((iM2566 ^ i7) * (-3111)) ^ 744147404;
                        i10 = 76668718;
                    }
                    break;
                case -1487573642:
                case -182929006:
                    if (C0050.f910 < 0) {
                        iM2566 = C0630.m2566("᩸ᩳ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-4201)) ^ (-430862765);
                        i10 = -1486030522;
                    } else {
                        iM2566 = (C0630.m2566("᩻۠") + i7) * 25;
                        i9 = ((iM2566 ^ i8) * (-31889)) ^ (-875061589);
                        i10 = 1771417776;
                    }
                    break;
                case -1435794455:
                case 819516177:
                    C0964.m3413();
                    C22628.m50615();
                    return 0;
                case -1159584581:
                case 1778973777:
                    if (!C0382.m1848()) {
                        iM2566 = C2105.m6981("ۛ֫") ^ i8;
                        i9 = ((iM2566 ^ i7) * 8535) ^ (-1733267429);
                        i10 = 1184672937;
                    } else {
                        iM2566 = (C0630.m2566("᩻۠") + i7) * 25;
                        i9 = ((iM2566 ^ i8) * (-31889)) ^ (-875061589);
                        i10 = 1771417776;
                    }
                    break;
                case -1099012502:
                case 1941272030:
                    i = s * 2;
                    if (C3537.f11231 >= 0) {
                        iM2566 = (i7 - C2105.m6981("ۗۢ")) * (-53);
                        i9 = ((iM2566 ^ i8) * 9015) ^ (-378089802);
                        i10 = -968963620;
                    } else {
                        iM2566 = (C2105.m6981("ۘ᩸") + i7) * 31;
                        i9 = ((iM2566 ^ i8) * 2103) ^ (-1822137457);
                        i10 = -162323268;
                    }
                    break;
                case -1035670621:
                case -744945098:
                    return C0630.m2566(strM49334) ^ 2120465126;
                case -1025114053:
                case 1412176459:
                    s2 = 1;
                    if (C1916.f6442) {
                        iM2566 = C0630.m2566("۬᩵") ^ i7;
                        i9 = ((iM2566 ^ i8) * 26219) ^ (-630799088);
                        i10 = -1674689771;
                    } else {
                        iM2566 = C0630.m2566("᩸ᩳ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-4201)) ^ (-430862765);
                        i10 = -1486030522;
                    }
                    break;
                case -987959974:
                case 1749365603:
                    sArr = f50637;
                    if (C1420.f5096 <= 0) {
                        iM2566 = (C0630.m2566("᩻۠") + i7) * 25;
                        i9 = ((iM2566 ^ i8) * (-31889)) ^ (-875061589);
                        i10 = 1771417776;
                    } else {
                        iM2566 = C0630.m2566("ܰ᩻") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-437)) ^ 355268133;
                        i10 = -926778098;
                    }
                    break;
                case -809519444:
                case 1268269773:
                    if (C11340.m28031()) {
                        iM2566 = (C0630.m2566("᩻۠") + i7) * 25;
                        i9 = ((iM2566 ^ i8) * (-31889)) ^ (-875061589);
                        i10 = 1771417776;
                    } else {
                        iM2566 = C0630.m2566("ܰ۫") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-7195)) ^ 1765226108;
                        i10 = -2030048102;
                    }
                    break;
                case -437633286:
                case 423607415:
                    C0483.m2121();
                    C0382.m1848();
                    iM2566 = C2105.m6981("ۛ֫") ^ i8;
                    i9 = ((iM2566 ^ i7) * 8535) ^ (-1733267429);
                    i10 = 1184672937;
                    break;
                case -412660961:
                case 1165162428:
                    i3 = 1877;
                    iM2566 = C2105.m6981("ܿܶ") ^ i7;
                    i9 = ((iM2566 ^ i8) * (-31089)) ^ 456921912;
                    i10 = -20245390;
                    break;
                case -91588502:
                case 607482165:
                    if (C0237.f1507 != 0) {
                        iM2566 = C0630.m2566("᩸ᩳ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-4201)) ^ (-430862765);
                        i10 = -1486030522;
                    } else {
                        iM2566 = (i7 - C2105.m6981("֫ۡ")) * (-57);
                        i9 = ((iM2566 ^ i8) * (-5873)) ^ (-1037755732);
                        i10 = -1889570301;
                    }
                    break;
                case 54025702:
                case 405329328:
                    sArr2 = f50637;
                    i4 = 429;
                    if (C2105.m6982() != 0) {
                        iM2566 = (C0630.m2566("᩻۠") + i7) * 25;
                        i9 = ((iM2566 ^ i8) * (-31889)) ^ (-875061589);
                        i10 = 1771417776;
                    } else {
                        iM2566 = C2105.m6981("ܽܶ") ^ i8;
                        i9 = ((iM2566 ^ i7) * 20019) ^ 233644604;
                        i10 = -1435655823;
                    }
                    break;
                case 63808855:
                case 1373971349:
                    i2 = i + 1;
                    if (C5695.f17556 >= 0) {
                        iM2566 = C0630.m2566("᩸ᩳ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-4201)) ^ (-430862765);
                        i10 = -1486030522;
                    } else {
                        iM2566 = C2105.m6981("᩷᩺") ^ i8;
                        i9 = ((iM2566 ^ i7) * 22059) ^ 908616690;
                        i10 = 772979624;
                    }
                    break;
                case 549123349:
                case 828546646:
                    i3 = 16364;
                    iM2566 = C2105.m6981("ܿܶ") ^ i7;
                    i9 = ((iM2566 ^ i8) * (-31089)) ^ 456921912;
                    i10 = -20245390;
                    break;
                case 1184543640:
                case 1633470352:
                    i5 = 3;
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = C2105.m6981("ۛ֫") ^ i8;
                        i9 = ((iM2566 ^ i7) * 8535) ^ (-1733267429);
                        i10 = 1184672937;
                    } else {
                        iM2566 = C0630.m2566("᩻ᩳ") ^ i7;
                        i9 = ((iM2566 ^ i8) * 29639) ^ 2060183971;
                        i10 = -2097061801;
                    }
                    break;
                default:
                    strM49334 = C21923.m49334(sArr2, i4, i5, i3);
                    if (C7811.f24123 >= 0) {
                        iM2566 = C2105.m6981("ۛ֫") ^ i8;
                        i9 = ((iM2566 ^ i7) * 8535) ^ (-1733267429);
                        i10 = 1184672937;
                    } else {
                        iM2566 = C0630.m2566("ۘܰ") ^ i7;
                        i9 = ((iM2566 ^ i8) * 19733) ^ (-876419180);
                        i10 = 897251195;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m38819() {
        Bundle bundleM9254 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = 0;
        int i6 = 131036358;
        int i7 = C0714.f2697;
        int i8 = C5695.f17556;
        int iM2566 = C0630.m2566("᩹֨") ^ i7;
        int i9 = ((iM2566 ^ i8) * 26157) ^ 2094749739;
        int i10 = -485013894;
        while (true) {
            i6 = ((((i6 ^ i8) * 23409) >> 31) & i9) ^ (iM2566 ^ i10);
            switch (i6) {
                case -2092028779:
                case 1505519718:
                    i2 = 30536676 + i;
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = (C0630.m2566("ۖۤ") + i8) * (-107);
                        i9 = ((iM2566 ^ i7) * 6869) ^ 875059556;
                        i10 = -1056427081;
                    } else {
                        iM2566 = (C2105.m6981("ۡᩳ") ^ i8) * (-3);
                        i9 = ((iM2566 ^ i7) * 21563) ^ 1385750765;
                        i10 = 1218981424;
                    }
                    break;
                case -1895309808:
                case -1131126965:
                    C3746.m11369();
                    return null;
                case -1834643192:
                case 1894825569:
                    s2 = 11052;
                    if (C3537.f11231 >= 0) {
                        iM2566 = C2105.m6981("ܽ۟") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-23985)) ^ 1982590829;
                        i10 = 1146771355;
                    } else {
                        iM2566 = (C0630.m2566("ۜܶ") + i7) * (-9);
                        i9 = ((iM2566 ^ i8) * 25779) ^ 861794966;
                        i10 = 1193476214;
                    }
                    break;
                case -1779906178:
                case 412234814:
                    C1294.m4372();
                    iM2566 = (i8 - C0630.m2566("ᩴ᩷")) * 17;
                    i9 = ((iM2566 ^ i7) * (-3635)) ^ (-632803218);
                    i10 = 1333211396;
                    break;
                case -1752251775:
                case 1709723883:
                    c = 295;
                    if (C1047.f3863 >= 0) {
                        iM2566 = (i8 - C0630.m2566("ᩴ᩷")) * 17;
                        i9 = ((iM2566 ^ i7) * (-3635)) ^ (-632803218);
                        i10 = 1333211396;
                    } else {
                        iM2566 = (C0630.m2566("ᩴܿ") + i8) * (-125);
                        i9 = ((iM2566 ^ i7) * (-16091)) ^ (-1023869836);
                        i10 = 158858706;
                    }
                    break;
                case -1206691289:
                case 229245571:
                    if ((s * s2) - i2 > 0) {
                        iM2566 = C0630.m2566("ܳ᩹") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-9933)) ^ 1684343870;
                        i10 = 680771699;
                    } else {
                        iM2566 = C0630.m2566("᩺᩶") ^ i8;
                        i9 = ((iM2566 ^ i7) * 18227) ^ (-349163384);
                        i10 = 1382841323;
                    }
                    break;
                case -1142990893:
                case -591641744:
                    i5 = 9;
                    if (C1504.f5354) {
                        iM2566 = (C0630.m2566("ۖۤ") + i8) * (-107);
                        i9 = ((iM2566 ^ i7) * 6869) ^ 875059556;
                        i10 = -1056427081;
                    } else {
                        iM2566 = (C2105.m6981("ᩳᩴ") + i7) * 87;
                        i9 = ((iM2566 ^ i8) * 5603) ^ 262919080;
                        i10 = 703006189;
                    }
                    break;
                case -1084746624:
                case 1531184266:
                    i3 = 31250;
                    iM2566 = C0630.m2566("۟ۧ") ^ i7;
                    i9 = ((iM2566 ^ i8) * (-9069)) ^ 367681515;
                    i10 = -2041754665;
                    break;
                case -1062356796:
                case -486662287:
                    AbstractC2021.m6574();
                    if (C2958.m9034() <= 0) {
                        iM2566 = C0630.m2566("᩵ۧ") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-2767)) ^ (-166261594);
                        i10 = -474938683;
                    } else {
                        iM2566 = (C0630.m2566("ۖۤ") + i8) * (-107);
                        i9 = ((iM2566 ^ i7) * 6869) ^ 875059556;
                        i10 = -1056427081;
                    }
                    break;
                case -904549692:
                case -316866351:
                    if (C2105.m6982() == 0) {
                        iM2566 = (C0630.m2566("᩵ۢ") ^ i8) * 43;
                        i9 = ((iM2566 ^ i7) * 3415) ^ (-1693650512);
                        i10 = 893290351;
                    } else {
                        iM2566 = C0630.m2566("᩵ۧ") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-2767)) ^ (-166261594);
                        i10 = -474938683;
                    }
                    break;
                case -781825692:
                case 1947482154:
                    i4 = 296;
                    if (C2167.f7158 >= 0) {
                        iM2566 = (i8 - C0630.m2566("ᩴ᩷")) * 17;
                        i9 = ((iM2566 ^ i7) * (-3635)) ^ (-632803218);
                        i10 = 1333211396;
                    } else {
                        iM2566 = C0630.m2566("᩵᩶") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-17461)) ^ (-83801094);
                        i10 = 1458256165;
                    }
                    break;
                case -648989967:
                case 176344071:
                    if (C3245.m9925() != 0) {
                        iM2566 = (C0630.m2566("ۖۤ") + i8) * (-107);
                        i9 = ((iM2566 ^ i7) * 6869) ^ 875059556;
                        i10 = -1056427081;
                    } else {
                        iM2566 = C0630.m2566("᩸᩸") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-1599)) ^ 1987737854;
                        i10 = -454272013;
                    }
                    break;
                case -528733552:
                case 165164196:
                    if (C11340.f33930 >= 0) {
                        iM2566 = (C0630.m2566("᩵ۢ") ^ i8) * 43;
                        i9 = ((iM2566 ^ i7) * 3415) ^ (-1693650512);
                        i10 = 893290351;
                    } else {
                        iM2566 = (C2105.m6981("ۛ᩸") + i7) * 51;
                        i9 = ((iM2566 ^ i8) * (-17603)) ^ (-2031075905);
                        i10 = -830532945;
                    }
                    break;
                case -398539257:
                case 603372596:
                    s = sArr[c];
                    i = s * s;
                    if (C1128.f4106 <= 0) {
                        iM2566 = C2105.m6981("ܽ۟") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-23985)) ^ 1982590829;
                        i10 = 1146771355;
                    } else {
                        iM2566 = (C0630.m2566("ܶ᩺") ^ i7) * 13;
                        i9 = ((iM2566 ^ i8) * (-19435)) ^ 1922218633;
                        i10 = -1186968112;
                    }
                    break;
                case 54926799:
                case 134384162:
                    bundleM9254 = C3019.m9254(this);
                    sArr2 = f50637;
                    if (C7811.f24123 >= 0) {
                        iM2566 = (i8 - C0630.m2566("ᩴ᩷")) * 17;
                        i9 = ((iM2566 ^ i7) * (-3635)) ^ (-632803218);
                        i10 = 1333211396;
                    } else {
                        iM2566 = (C2105.m6981("ۧۡ") + i7) * (-101);
                        i9 = ((iM2566 ^ i8) * 14813) ^ (-1528871044);
                        i10 = -1368938329;
                    }
                    break;
                case 478826616:
                case 2011596607:
                    String strM19112 = C7106.m19112(bundleM9254, C2167.m7159(sArr2, i4, i5, i3));
                    C3537.m10749(strM19112);
                    return strM19112;
                case 1519802036:
                case 1845306314:
                    C0382.m1848();
                    if (C0964.f3626 != 0) {
                        iM2566 = (C0630.m2566("ۖۤ") + i8) * (-107);
                        i9 = ((iM2566 ^ i7) * 6869) ^ 875059556;
                        i10 = -1056427081;
                    } else {
                        iM2566 = (i8 - C0630.m2566("ᩴ᩷")) * 17;
                        i9 = ((iM2566 ^ i7) * (-3635)) ^ (-632803218);
                        i10 = 1333211396;
                    }
                    break;
                case 1834706472:
                case 1864417506:
                    sArr = f50637;
                    if (C7811.m20844() != 0) {
                        iM2566 = C0630.m2566("᩵ۧ") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-2767)) ^ (-166261594);
                        i10 = -474938683;
                    } else {
                        iM2566 = (C2105.m6981("ۡ᩸") ^ i7) * (-19);
                        i9 = ((iM2566 ^ i8) * 7527) ^ 1815424165;
                        i10 = -1455294829;
                    }
                    break;
                default:
                    i3 = 26232;
                    iM2566 = C0630.m2566("۟ۧ") ^ i7;
                    i9 = ((iM2566 ^ i8) * (-9069)) ^ 367681515;
                    i10 = -2041754665;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0262 A[PHI: r1
      0x0262: PHI (r1v62 short) = (r1v6 short), (r1v51 short), (r1v65 short) binds: [B:65:0x024a, B:19:0x0079, B:6:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02b4 A[PHI: r1 r4 r12 r13 r14
      0x02b4: PHI (r1v42 short) = (r1v4 short), (r1v5 short), (r1v43 short) binds: [B:75:0x02b2, B:71:0x0294, B:36:0x00fc] A[DONT_GENERATE, DONT_INLINE]
      0x02b4: PHI (r4v3 android.os.Bundle) = (r4v2 android.os.Bundle), (r4v2 android.os.Bundle), (r4v4 android.os.Bundle) binds: [B:75:0x02b2, B:71:0x0294, B:36:0x00fc] A[DONT_GENERATE, DONT_INLINE]
      0x02b4: PHI (r12v3 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v4 short[]) binds: [B:75:0x02b2, B:71:0x0294, B:36:0x00fc] A[DONT_GENERATE, DONT_INLINE]
      0x02b4: PHI (r13v3 int) = (r13v2 int), (r13v2 int), (r13v4 int) binds: [B:75:0x02b2, B:71:0x0294, B:36:0x00fc] A[DONT_GENERATE, DONT_INLINE]
      0x02b4: PHI (r14v3 int) = (r14v2 int), (r14v2 int), (r14v4 int) binds: [B:75:0x02b2, B:71:0x0294, B:36:0x00fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0075, code lost:
    
        if (l.C11340.f33930 < 0) goto L18;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m38820(String str, String str2, List list) {
        short s;
        int iM6981;
        int i;
        int iM2566;
        int i2;
        int iM2567;
        int i3;
        C16475 c16475 = this;
        int i4 = C4117.f13076;
        int i5 = C1773.f6144;
        int iM2568 = C0630.m2566("᩺ܳ") ^ i4;
        int i6 = ((iM2568 ^ i5) * (-28017)) ^ 51000322;
        ArrayList<String> arrayList = null;
        short[] sArr = null;
        int i7 = iM2568 ^ (-734880497);
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -1431104682;
        short s2 = 0;
        Bundle bundleM9254 = null;
        short[] sArr2 = null;
        int i13 = 0;
        Bundle bundleM9255 = null;
        Bundle bundleM9256 = null;
        while (true) {
            i12 = i7 ^ (i6 & (((i12 ^ i5) * (-28267)) >> 31));
            switch (i12) {
                case -2120897446:
                case -1375550802:
                    C7106.m19120();
                    if (C4263.f13799 <= 0) {
                        iM2567 = C0630.m2566("᩷ۢ") ^ i5;
                        i6 = ((iM2567 ^ i4) * 6403) ^ 104946047;
                        i3 = 114238577;
                        i7 = iM2567 ^ i3;
                    }
                    iM2566 = (C2105.m6981("ۜۚ") ^ i4) * 61;
                    i6 = 1205147274 ^ ((iM2566 ^ i5) * (-14193));
                    i2 = -584200351;
                    i7 = iM2566 ^ i2;
                    c16475 = this;
                    break;
                case -2106119228:
                case -1540362491:
                    i13 = 3114;
                    iM2567 = C0630.m2566("ᩴۖ") ^ i4;
                    i6 = ((iM2567 ^ i5) * (-12501)) ^ 1592897183;
                    i3 = 610887746;
                    i7 = iM2567 ^ i3;
                    break;
                case -2097660847:
                case 1475241355:
                    s = s2;
                    if (C3019.f9544 >= 0) {
                        iM6981 = (i4 - C2105.m6981("ۚۖ")) * 75;
                        i6 = ((iM6981 ^ i5) * (-9041)) ^ 735164501;
                        i = -314198013;
                    } else {
                        iM6981 = C2105.m6981("۬ۡ") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-1221)) ^ (-1039976633);
                        i = 1677495049;
                    }
                    i7 = iM6981 ^ i;
                    c16475 = this;
                    s2 = s;
                    break;
                case -1993282096:
                case 892718299:
                    s = s2;
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = (i4 - C2105.m6981("ۚۖ")) * 75;
                        i6 = ((iM6981 ^ i5) * (-9041)) ^ 735164501;
                        i = -314198013;
                    } else {
                        iM6981 = C0630.m2566("᩻ܿ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-5773)) ^ 393708041;
                        i = -1035907365;
                    }
                    i7 = iM6981 ^ i;
                    c16475 = this;
                    s2 = s;
                    break;
                case -1769382837:
                case 1225579956:
                    i13 = 41812;
                    iM2567 = C0630.m2566("ᩴۖ") ^ i4;
                    i6 = ((iM2567 ^ i5) * (-12501)) ^ 1592897183;
                    i3 = 610887746;
                    i7 = iM2567 ^ i3;
                    break;
                case -1372589848:
                case 1593392424:
                    s2 = f50637[320];
                    if (C4263.m12819() >= 0) {
                        iM2566 = (C2105.m6981("ۜۚ") ^ i4) * 61;
                        i6 = 1205147274 ^ ((iM2566 ^ i5) * (-14193));
                        i2 = -584200351;
                    } else {
                        iM2566 = (C0630.m2566("ۗۖ") ^ i4) * 99;
                        i6 = 392051133 ^ ((iM2566 ^ i5) * (-15345));
                        i2 = 562989142;
                    }
                    i7 = iM2566 ^ i2;
                    c16475 = this;
                    break;
                case -1369610690:
                case 852639169:
                    s = s2;
                    i8 = s * 13492;
                    i9 = s * s;
                    if (C0382.f1805) {
                        iM6981 = C2105.m6981("֨ۤ") ^ i5;
                        i6 = ((iM6981 ^ i4) * 28411) ^ 1819653005;
                        i = 1458316940;
                        i7 = iM6981 ^ i;
                        c16475 = this;
                        s2 = s;
                    }
                    int iM2569 = C0630.m2566("ۢۖ") ^ i4;
                    i7 = iM2569 ^ 1246015643;
                    i6 = ((iM2569 ^ i5) * 26407) ^ (-652148934);
                    s2 = s;
                    c16475 = this;
                    break;
                case -1282457819:
                case -1059260521:
                    bundleM9256.putString(RunnableC0588.m2436(sArr2, 321, 9, i13), str);
                    if (C1916.f6442) {
                        iM2567 = (C2105.m6981("᩻ۢ") ^ i5) * 67;
                        i6 = ((iM2567 ^ i4) * (-973)) ^ 1664064240;
                        i3 = -553774623;
                        i7 = iM2567 ^ i3;
                    }
                    s = s2;
                    iM6981 = (i4 - C2105.m6981("ۚۖ")) * 75;
                    i6 = ((iM6981 ^ i5) * (-9041)) ^ 735164501;
                    i = -314198013;
                    i7 = iM6981 ^ i;
                    c16475 = this;
                    s2 = s;
                    break;
                case -1040415491:
                case 156568515:
                    bundleM9256 = C3019.m9254(this);
                    sArr2 = f50637;
                    if (C1504.m5179()) {
                        iM2567 = C0630.m2566("۬ۖ") ^ i4;
                        i6 = ((iM2567 ^ i5) * (-22839)) ^ (-829255967);
                        i3 = -448366360;
                    } else {
                        iM2567 = C0630.m2566("᩷ۢ") ^ i5;
                        i6 = ((iM2567 ^ i4) * 6403) ^ 104946047;
                        i3 = 114238577;
                    }
                    i7 = iM2567 ^ i3;
                    break;
                case -1021368093:
                case -359249281:
                    bundleM9254.putStringArrayList(C2167.m7159(f50637, 336, 20, i13), arrayList);
                    break;
                case -903939427:
                case 302464143:
                    bundleM9255.putString(C0237.m1483(sArr, i10, i11, i13), str2);
                    bundleM9254 = C3019.m9254(this);
                    arrayList = list == 0 ? new ArrayList<>() : new ArrayList<>(list);
                    int iM25610 = C0630.m2566("۠ܰ") ^ i5;
                    i7 = iM25610 ^ (-308112059);
                    i6 = ((iM25610 ^ i4) * (-12359)) ^ (-101606363);
                    break;
                case -802772399:
                case 479065608:
                    break;
                case -708489661:
                case -363904448:
                    C5695.m16023();
                    break;
                case -574204194:
                case -449869006:
                    bundleM9255 = C3019.m9254(this);
                    sArr = f50637;
                    i10 = 330;
                    i11 = 6;
                    if (ServiceConnectionC3453.f10921 < 0) {
                        iM2567 = C0630.m2566("ۚۢ") ^ i4;
                        i6 = ((iM2567 ^ i5) * (-12759)) ^ 1145930771;
                        i3 = -1663583374;
                        i7 = iM2567 ^ i3;
                    }
                    s = s2;
                    iM6981 = (i4 - C2105.m6981("ۚۖ")) * 75;
                    i6 = ((iM6981 ^ i5) * (-9041)) ^ 735164501;
                    i = -314198013;
                    i7 = iM6981 ^ i;
                    c16475 = this;
                    s2 = s;
                    break;
                case -389193961:
                case 714425850:
                    s = s2;
                    if (C7811.f24123 >= 0) {
                        iM6981 = C2105.m6981("ᩳ֡") ^ i5;
                        i6 = ((iM6981 ^ i4) * 8985) ^ 484214980;
                        i = -990832072;
                    } else {
                        iM6981 = C0630.m2566("᩹ᩳ") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-21997)) ^ 1250419281;
                        i = 137619605;
                    }
                    i7 = iM6981 ^ i;
                    c16475 = this;
                    s2 = s;
                    break;
                case 124321044:
                case 2018636102:
                    if (i8 - (45508516 + i9) <= 0) {
                        iM2567 = C0630.m2566("ۢ᩶") ^ i5;
                        i6 = ((iM2567 ^ i4) * 22827) ^ 1227108008;
                        i3 = 1739674518;
                    } else {
                        iM2567 = C0630.m2566("ܿۨ") ^ i4;
                        i6 = ((iM2567 ^ i5) * (-2941)) ^ 340289097;
                        i3 = -725723414;
                    }
                    i7 = iM2567 ^ i3;
                    break;
                case 125392179:
                case 1893302228:
                    C3911.m11924();
                    s = s2;
                    iM6981 = C2105.m6981("ᩳ֡") ^ i5;
                    i6 = ((iM6981 ^ i4) * 8985) ^ 484214980;
                    i = -990832072;
                    i7 = iM6981 ^ i;
                    c16475 = this;
                    s2 = s;
                    break;
                case 678526668:
                case 890891773:
                    C7811.m20844();
                    if (C7106.f21815 != 0) {
                        s = s2;
                        int iM25611 = C0630.m2566("ۢۖ") ^ i4;
                        i7 = iM25611 ^ 1246015643;
                        i6 = ((iM25611 ^ i5) * 26407) ^ (-652148934);
                        s2 = s;
                        c16475 = this;
                    }
                    iM2566 = (C2105.m6981("ۜۚ") ^ i4) * 61;
                    i6 = 1205147274 ^ ((iM2566 ^ i5) * (-14193));
                    i2 = -584200351;
                    i7 = iM2566 ^ i2;
                    c16475 = this;
                    break;
                case 1923336199:
                case 2086150281:
                    c16475.m34234((String) null);
                    c16475.f50645 = null;
                    if (C3911.f12484 < 0) {
                        iM2567 = C0630.m2566("᩸ۘ") ^ i5;
                        i6 = ((iM2567 ^ i4) * 25157) ^ (-2022703093);
                        i3 = -280830357;
                        i7 = iM2567 ^ i3;
                    }
                    s = s2;
                    iM6981 = C2105.m6981("ᩳ֡") ^ i5;
                    i6 = ((iM6981 ^ i4) * 8985) ^ 484214980;
                    i = -990832072;
                    i7 = iM6981 ^ i;
                    c16475 = this;
                    s2 = s;
                    break;
                default:
                    s = s2;
                    if (C4159.m12565() >= 0) {
                        iM6981 = C2105.m6981("ᩳ֡") ^ i5;
                        i6 = ((iM6981 ^ i4) * 8985) ^ 484214980;
                        i = -990832072;
                    } else {
                        iM6981 = (C0630.m2566("ᩳۤ") ^ i5) * 89;
                        i6 = ((iM6981 ^ i4) * (-32665)) ^ (-488575755);
                        i = 1790506357;
                    }
                    i7 = iM6981 ^ i;
                    c16475 = this;
                    s2 = s;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC14346, l.ComponentCallbacksC9205
    public final void onResume() {
        ActivityC0737 activityC0737M11214 = null;
        ActivityC17169 activityC17169 = null;
        CharSequence charSequence = null;
        C15545 c15545 = null;
        int i = -413185852;
        int i2 = C3746.f11829;
        int i3 = C4075.f12947;
        int iM6981 = C2105.m6981("֫۟") ^ i3;
        int i4 = ((iM6981 ^ i2) * (-17223)) ^ 714273455;
        int i5 = -475727473;
        while (true) {
            i = ((((i ^ i2) * 32135) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2071784356:
                case -3301904:
                    activityC17169.m40340(charSequence);
                    c15545 = this.f50646;
                    if (c15545 != null) {
                        iM6981 = C2105.m6981("۬۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-30525)) ^ 1010829072;
                        i5 = -1226395997;
                    } else {
                        iM6981 = (C2105.m6981("ۤܽ") ^ i3) * 11;
                        i4 = ((iM6981 ^ i2) * 23549) ^ (-2011948780);
                        i5 = -1272711430;
                    }
                    break;
                case -2034939196:
                case 1040330037:
                    activityC0737M11214.setTitle(mo14422());
                    if (C3432.f10845 >= 0) {
                        iM6981 = (i3 - C0630.m2566("ۘ֡")) * 97;
                        i4 = ((iM6981 ^ i2) * 28817) ^ (-615664098);
                        i5 = 1689585413;
                    } else {
                        iM6981 = (i2 - C2105.m6981("᩶᩵")) * (-43);
                        i4 = ((iM6981 ^ i3) * (-31037)) ^ (-1085337940);
                        i5 = 744063807;
                    }
                    break;
                case -1827075249:
                case -801162443:
                    c15545.m36684();
                    iM6981 = (C2105.m6981("ۤܽ") ^ i3) * 11;
                    i4 = ((iM6981 ^ i2) * 23549) ^ (-2011948780);
                    i5 = -1272711430;
                    break;
                case -1772652383:
                case 1288986975:
                    activityC17169 = (ActivityC17169) RunnableC0588.m2429(this);
                    if (C11340.f33930 >= 0) {
                        iM6981 = (i2 - C2105.m6981("ۛܿ")) * 29;
                        i4 = ((iM6981 ^ i3) * (-2101)) ^ (-1472559999);
                        i5 = 1628054447;
                    } else {
                        iM6981 = C0630.m2566("ܶۗ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-22411)) ^ (-1669586940);
                        i5 = 2034853811;
                    }
                    break;
                case -1598156545:
                case 332956887:
                    if (C0237.m1481() >= 0) {
                        iM6981 = (i3 - C0630.m2566("ۘ֡")) * 97;
                        i4 = ((iM6981 ^ i2) * 28817) ^ (-615664098);
                        i5 = 1689585413;
                    } else {
                        iM6981 = (C0630.m2566("᩷֨") + i3) * 45;
                        i4 = ((iM6981 ^ i2) * (-6041)) ^ (-855684607);
                        i5 = 595461302;
                    }
                    break;
                case -1409620430:
                case -605203645:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = (i3 - C0630.m2566("ۘ֡")) * 97;
                        i4 = ((iM6981 ^ i2) * 28817) ^ (-615664098);
                        i5 = 1689585413;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ۢᩳ")) * (-29);
                        i4 = ((iM6981 ^ i3) * (-30125)) ^ (-232688222);
                        i5 = 1884223599;
                    }
                    break;
                case -1097215789:
                case 1876048369:
                    break;
                case -1002991855:
                case 45880906:
                    C1128.m3851();
                    if (C0714.f2697 < 0) {
                        iM6981 = (i3 - C2105.m6981("ܽۙ")) * 57;
                        i4 = ((iM6981 ^ i2) * (-10833)) ^ (-1935918672);
                        i5 = 856709212;
                    } else {
                        iM6981 = C0630.m2566("᩸ۚ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-23673)) ^ 639292646;
                        i5 = -1984130444;
                    }
                    break;
                case -948310836:
                case 1570920628:
                    if (C3911.f12484 >= 0) {
                        iM6981 = C0630.m2566("᩸ۚ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-23673)) ^ 639292646;
                        i5 = -1984130444;
                    } else {
                        iM6981 = C0630.m2566("۠ܶ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 11185) ^ 946803952;
                        i5 = -1696542425;
                    }
                    break;
                case -946962670:
                case 1055730052:
                    C1128.m3851();
                    break;
                case -711204531:
                case 1811898051:
                    super.onResume();
                    if (C2105.f7037 != 0) {
                        iM6981 = (i3 - C2105.m6981("ܽۙ")) * 57;
                        i4 = ((iM6981 ^ i2) * (-10833)) ^ (-1935918672);
                        i5 = 856709212;
                    } else {
                        iM6981 = C0630.m2566("ܽ֫") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-20173)) ^ (-1737634303);
                        i5 = -966279660;
                    }
                    break;
                case -621688697:
                case 1862477024:
                    if (C3432.f10845 < 0) {
                        iM6981 = C0630.m2566("᩸ۚ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-23673)) ^ 639292646;
                        i5 = -1984130444;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ۛܿ")) * 29;
                        i4 = ((iM6981 ^ i3) * (-2101)) ^ (-1472559999);
                        i5 = 1628054447;
                    }
                    break;
                case -494915279:
                case 31766734:
                    C2272.m7503();
                    C4263.m12819();
                    iM6981 = (i2 - C2105.m6981("ۛܿ")) * 29;
                    i4 = ((iM6981 ^ i3) * (-2101)) ^ (-1472559999);
                    i5 = 1628054447;
                    break;
                case -250441718:
                case 1654088962:
                    charSequence = null;
                    if (C4263.f13799 <= 0) {
                        iM6981 = C0630.m2566("֫᩸") ^ i2;
                        i4 = ((iM6981 ^ i3) * 13471) ^ 1853034411;
                        i5 = -1561457191;
                    } else {
                        iM6981 = C0630.m2566("ۨۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 3613) ^ 1397414213;
                        i5 = -497385031;
                    }
                    break;
                case -26001502:
                case 314252457:
                    if (C1128.f4106 <= 0) {
                        iM6981 = (i2 - C2105.m6981("ۛܿ")) * 29;
                        i4 = ((iM6981 ^ i3) * (-2101)) ^ (-1472559999);
                        i5 = 1628054447;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ۧ᩵")) * (-121);
                        i4 = ((iM6981 ^ i3) * (-7261)) ^ 1718697663;
                        i5 = 1840170890;
                    }
                    break;
                case 62694941:
                case 691212499:
                    if (C0714.f2697 >= 0) {
                        iM6981 = C0630.m2566("᩸ۚ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-23673)) ^ 639292646;
                        i5 = -1984130444;
                    } else {
                        iM6981 = (C0630.m2566("֡ۡ") + i3) * (-3);
                        i4 = ((iM6981 ^ i2) * 10331) ^ (-464612009);
                        i5 = 995029740;
                    }
                    break;
                case 235989067:
                case 1384931871:
                    activityC0737M11214 = C3683.m11214(this);
                    if (C1916.f6442) {
                        iM6981 = (i3 - C2105.m6981("ᩳۙ")) * 115;
                        i4 = ((iM6981 ^ i2) * (-26663)) ^ (-1485322230);
                        i5 = -1178544174;
                    } else {
                        iM6981 = C0630.m2566("᩸ۚ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-23673)) ^ 639292646;
                        i5 = -1984130444;
                    }
                    break;
                default:
                    if (C3019.m9255() <= 0) {
                        iM6981 = C0630.m2566("֫᩸") ^ i2;
                        i4 = ((iM6981 ^ i3) * 13471) ^ 1853034411;
                        i5 = -1561457191;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ۛܿ")) * 29;
                        i4 = ((iM6981 ^ i3) * (-2101)) ^ (-1472559999);
                        i5 = 1628054447;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.InterfaceC3900
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo11876(C12366 c12366) {
        String strM38819 = null;
        int i = 557205538;
        int i2 = C1773.f6144;
        int i3 = C0050.f910;
        int iM6981 = (C2105.m6981("᩻ۧ") + i2) * (-75);
        int i4 = ((iM6981 ^ i3) * (-31175)) ^ (-1787903447);
        int i5 = -1631360781;
        while (true) {
            i = ((((i ^ i3) * 20663) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2105919622:
                case 906509557:
                    if (C0237.f1507 != 0) {
                        iM6981 = C0630.m2566("ۤ۫") ^ i2;
                        i4 = ((iM6981 ^ i3) * 13341) ^ 1952509014;
                        i5 = 92156873;
                    } else {
                        iM6981 = (C0630.m2566("᩻ۙ") ^ i2) * (-43);
                        i4 = ((iM6981 ^ i3) * 4863) ^ 1173700354;
                        i5 = 918581331;
                    }
                    break;
                case -1981011989:
                case 1767455398:
                    if (C2167.m7155()) {
                        iM6981 = C0630.m2566("ܶۢ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 32257) ^ (-492218138);
                        i5 = 1664054043;
                    } else {
                        iM6981 = C2105.m6981("ۨ᩹") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-4893)) ^ (-727527285);
                        i5 = 2128599712;
                    }
                    break;
                case -1872052935:
                case 394966356:
                    if (C3663.m11168() >= 0) {
                        iM6981 = (C2105.m6981("ܿܽ") + i3) * 5;
                        i4 = ((iM6981 ^ i2) * 8909) ^ 309589052;
                        i5 = 1199629214;
                    } else {
                        iM6981 = C2105.m6981("ۗ۬") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-32157)) ^ 1090663608;
                        i5 = 1454015964;
                    }
                    break;
                case -1829335940:
                case 734236344:
                    C0483.m2121();
                    iM6981 = C0630.m2566("ܶۢ") ^ i3;
                    i4 = ((iM6981 ^ i2) * 32257) ^ (-492218138);
                    i5 = 1664054043;
                    break;
                case -1821857781:
                case -1618311108:
                    C0630.m2564();
                    C3432.m10477();
                    return false;
                case -1812950645:
                case 54466112:
                    strM38819 = m38819();
                    if (C2520.f8000 >= 0) {
                        iM6981 = (C0630.m2566("ᩴۚ") ^ i3) * 31;
                        i4 = ((iM6981 ^ i2) * (-28817)) ^ 1427331180;
                        i5 = 558576959;
                    } else {
                        iM6981 = C0630.m2566("᩹ܿ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-22643)) ^ 730160233;
                        i5 = 1843000419;
                    }
                    break;
                case -1489943353:
                case -1307060396:
                    if (C2272.f7362) {
                        iM6981 = C2105.m6981("ܺ᩶") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-5263)) ^ (-1064074088);
                        i5 = -122185032;
                    } else {
                        iM6981 = C0630.m2566("ۨܿ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-1965)) ^ (-1743871127);
                        i5 = -2012610055;
                    }
                    break;
                case -1463879085:
                case -688778416:
                    if (!C1916.f6442) {
                        iM6981 = C0630.m2566("ۤ۫") ^ i2;
                        i4 = ((iM6981 ^ i3) * 13341) ^ 1952509014;
                        i5 = 92156873;
                    } else {
                        iM6981 = C0630.m2566("ܶۢ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 32257) ^ (-492218138);
                        i5 = 1664054043;
                    }
                    break;
                case -1441840542:
                case -155342078:
                    if (C2105.f7037 != 0) {
                        iM6981 = C0630.m2566("ۤ۫") ^ i2;
                        i4 = ((iM6981 ^ i3) * 13341) ^ 1952509014;
                        i5 = 92156873;
                    } else {
                        iM6981 = C2105.m6981("᩵᩺") ^ i2;
                        i4 = ((iM6981 ^ i3) * 26307) ^ 1891528119;
                        i5 = 2037790269;
                    }
                    break;
                case -1352916069:
                case -703987406:
                    if (C22628.f73083 <= 0) {
                        iM6981 = (C2105.m6981("ܿܽ") + i3) * 5;
                        i4 = ((iM6981 ^ i2) * 8909) ^ 309589052;
                        i5 = 1199629214;
                    } else {
                        iM6981 = C0630.m2566("ۤ۫") ^ i2;
                        i4 = ((iM6981 ^ i3) * 13341) ^ 1952509014;
                        i5 = 92156873;
                    }
                    break;
                case -1270068142:
                case 1957675493:
                    if (C7811.m20844() != 0) {
                        iM6981 = (C2105.m6981("ܿܽ") + i3) * 5;
                        i4 = ((iM6981 ^ i2) * 8909) ^ 309589052;
                        i5 = 1199629214;
                    } else {
                        iM6981 = C0630.m2566("᩹ᩴ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-21367)) ^ 1663645339;
                        i5 = 1206326347;
                    }
                    break;
                case -1185548084:
                case 508543371:
                    C0714.m2805();
                    if (C22628.f73083 > 0) {
                        iM6981 = C2105.m6981("ܺ᩶") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-5263)) ^ (-1064074088);
                        i5 = -122185032;
                    } else {
                        iM6981 = (C2105.m6981("ܿܽ") + i3) * 5;
                        i4 = ((iM6981 ^ i2) * 8909) ^ 309589052;
                        i5 = 1199629214;
                    }
                    break;
                case -941962095:
                case 1472731502:
                    if (C7811.f24123 >= 0) {
                        iM6981 = C0630.m2566("ۤ۫") ^ i2;
                        i4 = ((iM6981 ^ i3) * 13341) ^ 1952509014;
                        i5 = 92156873;
                    } else {
                        iM6981 = C0630.m2566("۬᩵") ^ i3;
                        i4 = ((iM6981 ^ i2) * 30139) ^ 545079735;
                        i5 = -6620670;
                    }
                    break;
                case 281454011:
                case 410241764:
                    if (C0237.f1507 != 0) {
                        iM6981 = C0630.m2566("ۤ۫") ^ i2;
                        i4 = ((iM6981 ^ i3) * 13341) ^ 1952509014;
                        i5 = 92156873;
                    } else {
                        iM6981 = C0630.m2566("֫ܳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-8623)) ^ (-1457999224);
                        i5 = -349233417;
                    }
                    break;
                case 1130868339:
                case 1440045061:
                    return !c12366.m30058(strM38819);
                default:
                    if (C1773.f6144 <= 0) {
                        iM6981 = C2105.m6981("ܺ᩶") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-5263)) ^ (-1064074088);
                        i5 = -122185032;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ۨ᩸")) * 97;
                        i4 = ((iM6981 ^ i3) * 11643) ^ (-196404404);
                        i5 = 307737441;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c9 A[PHI: r12 r16
      0x00c9: PHI (r12v3 int) = (r12v2 int), (r12v4 int) binds: [B:63:0x022b, B:30:0x00c7] A[DONT_GENERATE, DONT_INLINE]
      0x00c9: PHI (r16v15 android.os.Bundle) = (r16v4 android.os.Bundle), (r16v16 android.os.Bundle) binds: [B:63:0x022b, B:30:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01bc A[PHI: r6 r7 r8 r16
      0x01bc: PHI (r6v4 int) = (r6v3 int), (r6v2 int) binds: [B:51:0x01ba, B:47:0x0197] A[DONT_GENERATE, DONT_INLINE]
      0x01bc: PHI (r7v4 int) = (r7v3 int), (r7v2 int) binds: [B:51:0x01ba, B:47:0x0197] A[DONT_GENERATE, DONT_INLINE]
      0x01bc: PHI (r8v3 int) = (r8v2 int), (r8v4 int) binds: [B:51:0x01ba, B:47:0x0197] A[DONT_GENERATE, DONT_INLINE]
      0x01bc: PHI (r16v8 android.os.Bundle) = (r16v7 android.os.Bundle), (r16v9 android.os.Bundle) binds: [B:51:0x01ba, B:47:0x0197] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x022f A[PHI: r1 r11 r12
      0x022f: PHI (r1v50 android.os.Bundle) = (r1v36 android.os.Bundle), (r1v40 android.os.Bundle), (r1v2 android.os.Bundle), (r1v2 android.os.Bundle) binds: [B:34:0x00ec, B:31:0x00c9, B:18:0x006c, B:16:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r11v4 short[]) = (r11v3 short[]), (r11v2 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:34:0x00ec, B:31:0x00c9, B:18:0x006c, B:16:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r12v5 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:34:0x00ec, B:31:0x00c9, B:18:0x006c, B:16:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0260 A[PHI: r4 r16
      0x0260: PHI (r4v4 char) = (r4v2 char), (r4v3 char), (r4v2 char) binds: [B:68:0x025e, B:59:0x020d, B:14:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r16v20 android.os.Bundle) = (r16v3 android.os.Bundle), (r16v5 android.os.Bundle), (r16v21 android.os.Bundle) binds: [B:68:0x025e, B:59:0x020d, B:14:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0295 A[PHI: r3 r5 r16
      0x0295: PHI (r3v4 short[]) = (r3v3 short[]), (r3v2 short[]), (r3v2 short[]) binds: [B:72:0x0293, B:55:0x01ee, B:11:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0295: PHI (r5v4 short) = (r5v2 short), (r5v3 short), (r5v2 short) binds: [B:72:0x0293, B:55:0x01ee, B:11:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0295: PHI (r16v22 android.os.Bundle) = (r16v2 android.os.Bundle), (r16v6 android.os.Bundle), (r16v24 android.os.Bundle) binds: [B:72:0x0293, B:55:0x01ee, B:11:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
    
        if (l.RunnableC0588.f2309 < 0) goto L14;
     */
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList m38822() {
        int iM2566;
        int i;
        int i2;
        int i3 = C3019.f9544;
        int i4 = C1294.f4556;
        int iM6981 = C2105.m6981("᩻ۨ") ^ i3;
        int i5 = ((iM6981 ^ i4) * 20167) ^ (-25739678);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM6981 ^ 50385067;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 45451213;
        ArrayList<String> stringArrayList = null;
        Bundle bundleM9254 = null;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i4) * 26367) >> 31));
            switch (i12) {
                case -2138937751:
                case 1087602546:
                    return new ArrayList(stringArrayList);
                case -2072544546:
                case 617717951:
                    C2520.m8026();
                    iM2566 = C0630.m2566("ۤ᩹") ^ i4;
                    bundleM9254 = bundleM9254;
                    i = ((iM2566 ^ i3) * 20485) ^ 1792855596;
                    i2 = -1282525211;
                    Bundle bundle = bundleM9254;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    bundleM9254 = bundle;
                    break;
                case -2040753638:
                case 1613181944:
                    bundleM9254 = bundleM9254;
                    i11 = 378;
                    if (C1711.f5919) {
                        bundleM9254 = bundleM9254;
                        iM2566 = C0630.m2566("ۤ᩹") ^ i4;
                        bundleM9254 = bundleM9254;
                        i = ((iM2566 ^ i3) * 20485) ^ 1792855596;
                        i2 = -1282525211;
                    } else {
                        iM2566 = (C0630.m2566("᩵۟") ^ i4) * (-15);
                        i = ((iM2566 ^ i3) * 21543) ^ 234701149;
                        i2 = 99333796;
                    }
                    Bundle bundle2 = bundleM9254;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    bundleM9254 = bundle2;
                    break;
                case -2028796543:
                case 224732575:
                    bundleM9254 = C3019.m9254(this);
                    sArr2 = f50637;
                    if (C0964.f3626 != 0) {
                        iM2566 = C0630.m2566("ۤ᩹") ^ i4;
                        bundleM9254 = bundleM9254;
                        i = ((iM2566 ^ i3) * 20485) ^ 1792855596;
                        i2 = -1282525211;
                    } else {
                        iM2566 = C0630.m2566("᩷۫") ^ i4;
                        bundleM9254 = bundleM9254;
                        i = ((iM2566 ^ i3) * (-19017)) ^ 1044970715;
                        i2 = 693575525;
                    }
                    Bundle bundle3 = bundleM9254;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    bundleM9254 = bundle3;
                    break;
                case -1916378730:
                case 1537222425:
                    i10 = 56392;
                    iM2566 = (C2105.m6981("᩻ۤ") ^ i3) * (-113);
                    i = ((iM2566 ^ i4) * 29719) ^ (-937839430);
                    i2 = 373977416;
                    Bundle bundle4 = bundleM9254;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    bundleM9254 = bundle4;
                    break;
                case -1884111378:
                case -291347818:
                    bundleM9254 = bundleM9254;
                    sArr = f50637;
                    if (C2105.f7037 != 0) {
                        iM2566 = C0630.m2566("ۖ۠") ^ i4;
                        i = ((iM2566 ^ i3) * (-22755)) ^ (-2093645045);
                        i2 = 1549218374;
                    } else {
                        iM2566 = (C0630.m2566("ۢ᩹") ^ i3) * (-43);
                        i = ((iM2566 ^ i4) * 16863) ^ (-189968935);
                        i2 = 1814713239;
                    }
                    Bundle bundle5 = bundleM9254;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    bundleM9254 = bundle5;
                    break;
                case -1291426761:
                case 459060174:
                    bundleM9254 = bundleM9254;
                    c = 377;
                    if (C1005.f3721) {
                        iM2566 = (C2105.m6981("ܳܽ") ^ i4) * (-79);
                        i = ((iM2566 ^ i3) * (-10977)) ^ 1985313015;
                        i2 = -1013044581;
                    } else {
                        iM2566 = (C0630.m2566("ۤ֨") + i4) * (-3);
                        i = ((iM2566 ^ i3) * (-23685)) ^ 1680221520;
                        i2 = 1989423469;
                    }
                    Bundle bundle6 = bundleM9254;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    bundleM9254 = bundle6;
                    break;
                case -1272196210:
                case 1882973182:
                    C2520.m8026();
                    if (RunnableC0588.f2309 < 0) {
                        bundleM9254 = bundleM9254;
                        iM2566 = C0630.m2566("ۖ۠") ^ i4;
                        i = ((iM2566 ^ i3) * (-22755)) ^ (-2093645045);
                        i2 = 1549218374;
                        Bundle bundle7 = bundleM9254;
                        i6 = iM2566 ^ i2;
                        i5 = i;
                        bundleM9254 = bundle7;
                    }
                    bundleM9254 = bundleM9254;
                    iM2566 = C0630.m2566("᩹᩷") ^ i3;
                    i = ((iM2566 ^ i4) * (-28641)) ^ 1266328982;
                    i2 = 1452684593;
                    Bundle bundle8 = bundleM9254;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    bundleM9254 = bundle8;
                    break;
                case -1154157601:
                case 1896030610:
                    if (C0237.m1481() >= 0) {
                        iM2566 = C0630.m2566("ۤ᩹") ^ i4;
                        bundleM9254 = bundleM9254;
                        i = ((iM2566 ^ i3) * 20485) ^ 1792855596;
                        i2 = -1282525211;
                    } else {
                        bundleM9254 = bundleM9254;
                        iM2566 = (C0630.m2566("ۤ֨") + i4) * (-3);
                        i = ((iM2566 ^ i3) * (-23685)) ^ 1680221520;
                        i2 = 1989423469;
                    }
                    Bundle bundle9 = bundleM9254;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    bundleM9254 = bundle9;
                    break;
                case -1145500235:
                case 553310383:
                    stringArrayList = bundleM9254.getStringArrayList(ViewOnClickListenerC1958.m6435(sArr2, i11, 20, i10));
                    if (stringArrayList == null) {
                        iM2566 = (C0630.m2566("ܰܳ") + i3) * (-11);
                        bundleM9254 = bundleM9254;
                        i = ((iM2566 ^ i4) * (-14331)) ^ (-1969438198);
                        i2 = 324091173;
                    } else {
                        bundleM9254 = bundleM9254;
                        iM2566 = C2105.m6981("ܽ֡") ^ i3;
                        i = ((iM2566 ^ i4) * 9699) ^ 1766355622;
                        i2 = -1385033594;
                    }
                    Bundle bundle10 = bundleM9254;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    bundleM9254 = bundle10;
                    break;
                case -722345803:
                case 2041179389:
                    bundleM9254 = bundleM9254;
                    int i13 = s + s2;
                    if (i9 - (i13 * i13) < 0) {
                        iM2566 = (C0630.m2566("ۖۗ") ^ i3) * (-117);
                        i = ((iM2566 ^ i4) * 11207) ^ (-1000904097);
                        i2 = 1055186306;
                    } else {
                        iM2566 = (C0630.m2566("۠ܽ") ^ i4) * (-73);
                        i = ((iM2566 ^ i3) * 30639) ^ (-1274246173);
                        i2 = 771900000;
                    }
                    Bundle bundle11 = bundleM9254;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    bundleM9254 = bundle11;
                    break;
                case -648802902:
                case 1342639764:
                    return new ArrayList();
                case -211853657:
                case 217502785:
                    break;
                case -137352547:
                case 605383480:
                    bundleM9254 = bundleM9254;
                    if (C1005.f3721) {
                        iM2566 = C2105.m6981("ۛۜ") ^ i3;
                        i = ((iM2566 ^ i4) * 16823) ^ 1658809615;
                        i2 = 1588016806;
                    } else {
                        bundleM9254 = bundleM9254;
                        iM2566 = C0630.m2566("ۤ᩹") ^ i4;
                        bundleM9254 = bundleM9254;
                        i = ((iM2566 ^ i3) * 20485) ^ 1792855596;
                        i2 = -1282525211;
                    }
                    Bundle bundle12 = bundleM9254;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    bundleM9254 = bundle12;
                    break;
                case -73969876:
                case 194144339:
                    bundleM9254 = bundleM9254;
                    i7 = s * s;
                    i8 = 245925124;
                    if (C2105.f7037 != 0) {
                        iM2566 = (C0630.m2566("ۢۤ") ^ i3) * (-17);
                        i = ((iM2566 ^ i4) * 17089) ^ (-824166731);
                        i2 = 1215474896;
                    } else {
                        iM2566 = C2105.m6981("᩹᩶") ^ i3;
                        i = ((iM2566 ^ i4) * (-13357)) ^ (-1874035763);
                        i2 = -1794337044;
                    }
                    Bundle bundle13 = bundleM9254;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    bundleM9254 = bundle13;
                    break;
                case 463858325:
                case 2043249892:
                    bundleM9254 = bundleM9254;
                    if (C1005.f3721) {
                        iM2566 = (i4 - C0630.m2566("ۚۤ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM2566 ^ i3) * (-10843)) ^ 730899326;
                        i2 = -1066234697;
                    } else {
                        iM2566 = (C0630.m2566("ۤ֨") + i4) * (-3);
                        i = ((iM2566 ^ i3) * (-23685)) ^ 1680221520;
                        i2 = 1989423469;
                    }
                    Bundle bundle14 = bundleM9254;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    bundleM9254 = bundle14;
                    break;
                case 478573019:
                case 672911601:
                    C0050.m940();
                    C2167.m7155();
                    return null;
                case 949741114:
                case 1412845807:
                    i10 = 3443;
                    iM2566 = (C2105.m6981("᩻ۤ") ^ i3) * (-113);
                    i = ((iM2566 ^ i4) * 29719) ^ (-937839430);
                    i2 = 373977416;
                    Bundle bundle15 = bundleM9254;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    bundleM9254 = bundle15;
                    break;
                case 965020290:
                case 1072763242:
                    bundleM9254 = bundleM9254;
                    s = sArr[c];
                    if (C0798.f2919) {
                        iM2566 = C0630.m2566("ۖ۠") ^ i4;
                        i = ((iM2566 ^ i3) * (-22755)) ^ (-2093645045);
                        i2 = 1549218374;
                    } else {
                        iM2566 = C2105.m6981("֡ܿ") ^ i4;
                        i = ((iM2566 ^ i3) * (-14975)) ^ 1955353242;
                        i2 = 1419726009;
                    }
                    Bundle bundle16 = bundleM9254;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    bundleM9254 = bundle16;
                    break;
                case 1103355646:
                case 2024689665:
                    bundleM9254 = bundleM9254;
                    int i14 = i7 + i8;
                    i9 = i14 + i14;
                    if (C22628.f73083 <= 0) {
                        iM2566 = (C0630.m2566("ۢۤ") ^ i3) * (-17);
                        i = ((iM2566 ^ i4) * 17089) ^ (-824166731);
                        i2 = 1215474896;
                    } else {
                        iM2566 = (C0630.m2566("۫۟") ^ i3) * (-97);
                        i = ((iM2566 ^ i4) * (-10471)) ^ (-1334161701);
                        i2 = 1110315087;
                    }
                    Bundle bundle17 = bundleM9254;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    bundleM9254 = bundle17;
                    break;
                default:
                    bundleM9254 = bundleM9254;
                    s2 = 15682;
                    if (C2167.f7158 >= 0) {
                        iM2566 = C0630.m2566("᩹᩷") ^ i3;
                        i = ((iM2566 ^ i4) * (-28641)) ^ 1266328982;
                        i2 = 1452684593;
                    } else {
                        iM2566 = C2105.m6981("۠᩷") ^ i4;
                        i = ((iM2566 ^ i3) * 31413) ^ (-1576242700);
                        i2 = -694045375;
                    }
                    Bundle bundle18 = bundleM9254;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    bundleM9254 = bundle18;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00ca A[PHI: r9 r10
      0x00ca: PHI (r9v7 java.lang.String) = (r9v3 java.lang.String), (r9v2 java.lang.String) binds: [B:22:0x00c8, B:13:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x00ca: PHI (r10v7 l.۫ۨᩳ) = (r10v3 l.۫ۨᩳ), (r10v2 l.۫ۨᩳ) binds: [B:22:0x00c8, B:13:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0154 A[PHI: r3 r6 r12 r14 r15
      0x0154: PHI (r3v54 int) = (r3v2 int), (r3v2 int), (r3v48 int), (r3v2 int), (r3v2 int), (r3v2 int) binds: [B:102:0x0154, B:101:0x0154, B:34:0x0152, B:30:0x012f, B:16:0x009d, B:13:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x0154: PHI (r6v4 java.lang.String) = 
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
      (r6v3 java.lang.String)
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
     binds: [B:102:0x0154, B:101:0x0154, B:34:0x0152, B:30:0x012f, B:16:0x009d, B:13:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x0154: PHI (r12v4 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:102:0x0154, B:101:0x0154, B:34:0x0152, B:30:0x012f, B:16:0x009d, B:13:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x0154: PHI (r14v4 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v3 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:102:0x0154, B:101:0x0154, B:34:0x0152, B:30:0x012f, B:16:0x009d, B:13:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x0154: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:102:0x0154, B:101:0x0154, B:34:0x0152, B:30:0x012f, B:16:0x009d, B:13:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0243 A[PHI: r4 r24 r29 r30
      0x0243: PHI (r4v19 l.۫ۤۡ) = (r4v7 l.۫ۤۡ), (r4v18 l.۫ۤۡ), (r4v22 l.۫ۤۡ) binds: [B:15:0x0095, B:56:0x0241, B:47:0x01e9] A[DONT_GENERATE, DONT_INLINE]
      0x0243: PHI (r24v18 int) = (r24v6 int), (r24v17 int), (r24v22 int) binds: [B:15:0x0095, B:56:0x0241, B:47:0x01e9] A[DONT_GENERATE, DONT_INLINE]
      0x0243: PHI (r29v19 short[]) = (r29v7 short[]), (r29v18 short[]), (r29v23 short[]) binds: [B:15:0x0095, B:56:0x0241, B:47:0x01e9] A[DONT_GENERATE, DONT_INLINE]
      0x0243: PHI (r30v4 byte) = (r30v3 byte), (r30v3 byte), (r30v7 byte) binds: [B:15:0x0095, B:56:0x0241, B:47:0x01e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38787(C16475 c16475, final Exception exc) {
        int i;
        int i2;
        int i3;
        int iM6981;
        int i4;
        InterfaceC12344 interfaceC12344;
        short[] sArr;
        int i5;
        int iM2566;
        int i6;
        int iM6982;
        int i7;
        String strM1959;
        final C16475 c16476 = c16475;
        int i8 = C7811.f24123;
        int i9 = C3432.f10845;
        int iM6983 = (C2105.m6981("ۚۖ") ^ i8) * 79;
        int i10 = ((iM6983 ^ i9) * (-27925)) ^ (-1126148273);
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i11 = iM6983 ^ (-1269665644);
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        char c = 0;
        short s = 0;
        int i17 = 0;
        int i18 = 0;
        InterfaceC12344 interfaceC12345 = null;
        int i19 = 0;
        int i20 = -1847860137;
        byte bMo18251 = 0;
        short[] sArr5 = null;
        short[] sArr6 = null;
        C12392 c12392 = null;
        String strM46306 = null;
        String str = null;
        String strM50602 = null;
        String strM10633 = null;
        String str2 = null;
        while (true) {
            i20 = i11 ^ (i10 & (((i20 ^ i9) * 12021) >> 31));
            switch (i20) {
                case -2083509169:
                case 723231809:
                    interfaceC12345 = interfaceC12345;
                    sArr5 = sArr5;
                    i12 = i12;
                    int i21 = i15 + i16;
                    if (i18 - (i21 + i21) <= 0) {
                        iM6981 = (i8 - C2105.m6981("ܺܽ")) * (-83);
                        i2 = ((iM6981 ^ i9) * (-18373)) ^ (-841070533);
                        i4 = 247059613;
                    } else {
                        iM6981 = C0630.m2566("ۡᩳ") ^ i8;
                        i2 = ((iM6981 ^ i9) * (-587)) ^ 316802221;
                        i4 = 878498531;
                    }
                    i3 = iM6981 ^ i4;
                    interfaceC12345 = interfaceC12345;
                    short[] sArr7 = sArr5;
                    i11 = i3;
                    i10 = i2;
                    i12 = i12;
                    sArr5 = sArr7;
                    break;
                case -2056545740:
                case 1488551810:
                    short[] sArr8 = sArr5;
                    i12 = i12;
                    String strM5726 = C1711.m5726(sArr8, i19, 20, i13);
                    sArr5 = sArr8;
                    interfaceC12345 = interfaceC12345;
                    bMo18251 = interfaceC12345.mo18251((byte) 0, strM5726);
                    if (RunnableC1108.f4040) {
                        iM6981 = C0630.m2566("ۜۧ") ^ i9;
                        i2 = ((iM6981 ^ i8) * (-21455)) ^ (-1427695288);
                        i4 = -1341837280;
                    } else {
                        iM6981 = (C0630.m2566("۟֡") ^ i9) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i2 = ((iM6981 ^ i8) * (-10065)) ^ (-748524451);
                        i4 = 1455457356;
                    }
                    i3 = iM6981 ^ i4;
                    interfaceC12345 = interfaceC12345;
                    short[] sArr9 = sArr5;
                    i11 = i3;
                    i10 = i2;
                    i12 = i12;
                    sArr5 = sArr9;
                    break;
                case -2052261866:
                case 1600132858:
                    i13 = 57908;
                    iM6981 = C2105.m6981("᩻ᩳ") ^ i9;
                    i2 = ((iM6981 ^ i8) * 15499) ^ 1837138584;
                    i4 = 241052420;
                    i3 = iM6981 ^ i4;
                    interfaceC12345 = interfaceC12345;
                    short[] sArr10 = sArr5;
                    i11 = i3;
                    i10 = i2;
                    i12 = i12;
                    sArr5 = sArr10;
                    break;
                case -1975570353:
                case 1784077028:
                    strM1959 = C0422.m1959(exc);
                    str = strM1959;
                    iM6982 = C0630.m2566("ۗ᩺") ^ i8;
                    i = ((iM6982 ^ i9) * 3181) ^ 1128609749;
                    i7 = -147876493;
                    i11 = iM6982 ^ i7;
                    i10 = i;
                    break;
                case -1854067068:
                case 1332154393:
                    i12 = i12;
                    interfaceC12345 = ApplicationC20075.f65008;
                    short[] sArr11 = f50637;
                    i19 = 11;
                    if (C2105.f7037 == 0) {
                        int iM6984 = (C2105.m6981("۟᩸") ^ i8) * (-73);
                        i = ((iM6984 ^ i9) * 27389) ^ (-1572730332);
                        i11 = iM6984 ^ 440044496;
                        i12 = i12;
                        sArr5 = sArr11;
                        i10 = i;
                    } else {
                        sArr5 = sArr11;
                        int iM6985 = (C2105.m6981("ۛ֫") ^ i8) * 53;
                        i2 = ((iM6985 ^ i9) * (-18731)) ^ (-734520999);
                        i3 = iM6985 ^ (-2037459980);
                        short[] sArr12 = sArr5;
                        i11 = i3;
                        i10 = i2;
                        i12 = i12;
                        sArr5 = sArr12;
                    }
                    break;
                case -1774586763:
                case -1007451491:
                    strM50602 = C22628.m50602(sArr3, 45, 4, i13);
                    sArr4 = f50637;
                    if (C3911.m11924() > 0) {
                        iM6982 = (i8 - C2105.m6981("ۖ᩸")) * (-33);
                        i = ((iM6982 ^ i9) * (-16113)) ^ (-1277838735);
                        i7 = 495284274;
                        i11 = iM6982 ^ i7;
                        i10 = i;
                    } else {
                        interfaceC12344 = interfaceC12345;
                        sArr = sArr5;
                        i5 = i12;
                        iM2566 = C0630.m2566("۬ۢ") ^ i9;
                        i10 = ((iM2566 ^ i8) * 23933) ^ 1386481277;
                        i6 = 1221962701;
                        int i22 = iM2566 ^ i6;
                        interfaceC12345 = interfaceC12344;
                        i12 = i5;
                        sArr5 = sArr;
                        i11 = i22;
                        c16476 = c16475;
                    }
                    break;
                case -1679048499:
                case 774233325:
                    strM1959 = C4616.m13559(exc);
                    str = strM1959;
                    iM6982 = C0630.m2566("ۗ᩺") ^ i8;
                    i = ((iM6982 ^ i9) * 3181) ^ 1128609749;
                    i7 = -147876493;
                    i11 = iM6982 ^ i7;
                    i10 = i;
                    break;
                case -1594886646:
                case 262118288:
                    C22628.m50616(c12392, strM46306);
                    c16476.m34227(new Consumer() { // from class: l.ۗ᩻ۢ
                        @Override // java.util.function.Consumer
                        /* JADX INFO: renamed from: accept */
                        public final void n(Object obj) {
                            C16475.m38788(this.f11314, exc, (ActivityC17169) obj);
                        }

                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C23517.$default$andThen(this, consumer);
                        }
                    });
                    break;
                case -1502030291:
                case -619231236:
                    interfaceC12345 = interfaceC12345;
                    sArr5 = sArr5;
                    i12 = i12;
                    c16476.f50648 = true;
                    c16476.f50653.m11384((Throwable) exc);
                    if (C0483.f2088 >= 0) {
                        iM6981 = (C0630.m2566("۟֡") ^ i9) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i2 = ((iM6981 ^ i8) * (-10065)) ^ (-748524451);
                        i4 = 1455457356;
                    } else {
                        iM6981 = (C0630.m2566("ܰۚ") ^ i9) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i2 = ((iM6981 ^ i8) * (-12979)) ^ 843136384;
                        i4 = -523456433;
                    }
                    i3 = iM6981 ^ i4;
                    interfaceC12345 = interfaceC12345;
                    short[] sArr13 = sArr5;
                    i11 = i3;
                    i10 = i2;
                    i12 = i12;
                    sArr5 = sArr13;
                    break;
                case -1489749649:
                case 85045379:
                    str2 = C2405.f7665[bMo18251];
                    if (exc instanceof C1637) {
                        iM6982 = C2105.m6981("᩶ۤ") ^ i9;
                        i = ((iM6982 ^ i8) * (-49)) ^ (-1167637841);
                        i7 = 788308171;
                    } else {
                        iM6982 = C2105.m6981("᩷ܽ") ^ i9;
                        i = ((iM6982 ^ i8) * 13377) ^ (-1407973726);
                        i7 = -549340566;
                    }
                    i11 = iM6982 ^ i7;
                    i10 = i;
                    break;
                case -1395689328:
                case -1294217640:
                    ServiceConnectionC3453.m10564();
                    C2105.m6982();
                    break;
                case -1215756550:
                case 2051014053:
                    interfaceC12345 = interfaceC12345;
                    sArr5 = sArr5;
                    i12 = i12;
                    i18 = i17 * i17;
                    i15 = s * s;
                    i16 = 221563225;
                    if (RunnableC1108.f4040) {
                        iM6981 = (i9 - C2105.m6981("᩻۬")) * (-119);
                        i2 = ((iM6981 ^ i8) * (-29597)) ^ (-539867562);
                        i4 = -32388402;
                        i3 = iM6981 ^ i4;
                        interfaceC12345 = interfaceC12345;
                        short[] sArr14 = sArr5;
                        i11 = i3;
                        i10 = i2;
                        i12 = i12;
                        sArr5 = sArr14;
                    }
                    interfaceC12345 = interfaceC12345;
                    int iM6986 = (C2105.m6981("ۛ֫") ^ i8) * 53;
                    i2 = ((iM6986 ^ i9) * (-18731)) ^ (-734520999);
                    i3 = iM6986 ^ (-2037459980);
                    short[] sArr15 = sArr5;
                    i11 = i3;
                    i10 = i2;
                    i12 = i12;
                    sArr5 = sArr15;
                    break;
                case -1152827532:
                case 674152753:
                    interfaceC12345 = interfaceC12345;
                    sArr5 = sArr5;
                    i12 = i12;
                    if (c16476.f50644) {
                        iM6981 = C2105.m6981("ܽۡ") ^ i8;
                        i2 = ((iM6981 ^ i9) * (-28749)) ^ (-282382400);
                        i4 = 1793549823;
                    } else {
                        iM6981 = C2105.m6981("ۗۙ") ^ i8;
                        i2 = ((iM6981 ^ i9) * (-30371)) ^ 1932128761;
                        i4 = 2029213011;
                    }
                    i3 = iM6981 ^ i4;
                    interfaceC12345 = interfaceC12345;
                    short[] sArr16 = sArr5;
                    i11 = i3;
                    i10 = i2;
                    i12 = i12;
                    sArr5 = sArr16;
                    break;
                case -922531082:
                case 287696694:
                    break;
                case -820663010:
                case 1189068471:
                    sArr2 = f50637;
                    i14 = 31;
                    i12 = 14;
                    if (C2520.m8026()) {
                        iM6982 = C2105.m6981("ۚۙ") ^ i8;
                        i = ((iM6982 ^ i9) * (-13257)) ^ (-1327361288);
                        i7 = 490694376;
                    } else {
                        iM6982 = C2105.m6981("ۙܽ") ^ i8;
                        i = ((iM6982 ^ i9) * 32373) ^ 344149176;
                        i7 = 1309934920;
                    }
                    i11 = iM6982 ^ i7;
                    i10 = i;
                    break;
                case -669550875:
                case 227556425:
                    strM46306 = C20087.m46306(C0422.m1955(sArr4, 49, 20, i13), str2, strM10633, str, strM50602);
                    c12392 = c16476.f50649;
                    if (C0714.f2697 >= 0) {
                        iM6982 = C0630.m2566("ۚ֨") ^ i9;
                        i = ((iM6982 ^ i8) * 19987) ^ 621482316;
                        i7 = -472892310;
                    } else {
                        iM6982 = (C2105.m6981("ۚۗ") + i9) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM6982 ^ i8) * (-12691)) ^ 1622536824;
                        i7 = -446908057;
                    }
                    i11 = iM6982 ^ i7;
                    i10 = i;
                    break;
                case -631525146:
                case 1099092009:
                    i13 = 47414;
                    iM6981 = C2105.m6981("᩻ᩳ") ^ i9;
                    i2 = ((iM6981 ^ i8) * 15499) ^ 1837138584;
                    i4 = 241052420;
                    i3 = iM6981 ^ i4;
                    interfaceC12345 = interfaceC12345;
                    short[] sArr17 = sArr5;
                    i11 = i3;
                    i10 = i2;
                    i12 = i12;
                    sArr5 = sArr17;
                    break;
                case -525208613:
                case -37671533:
                    RunnableC3474.m10630();
                    if (!C11340.m28031()) {
                        sArr5 = sArr5;
                        i12 = i12;
                        int iM6987 = (C2105.m6981("ۛ֫") ^ i8) * 53;
                        i2 = ((iM6987 ^ i9) * (-18731)) ^ (-734520999);
                        i3 = iM6987 ^ (-2037459980);
                        short[] sArr18 = sArr5;
                        i11 = i3;
                        i10 = i2;
                        i12 = i12;
                        sArr5 = sArr18;
                    } else {
                        iM6982 = C2105.m6981("ۚۙ") ^ i8;
                        i = ((iM6982 ^ i9) * (-13257)) ^ (-1327361288);
                        i7 = 490694376;
                        i11 = iM6982 ^ i7;
                        i10 = i;
                    }
                    break;
                case -112025374:
                case 2021444344:
                    C7106.m19120();
                    ServiceConnectionC3453.m10564();
                    iM6982 = C2105.m6981("ۚۙ") ^ i8;
                    i = ((iM6982 ^ i9) * (-13257)) ^ (-1327361288);
                    i7 = 490694376;
                    i11 = iM6982 ^ i7;
                    i10 = i;
                    break;
                case -1827957:
                case 2111490388:
                    strM10633 = RunnableC3474.m10633(sArr2, i14, i12, i13);
                    sArr3 = f50637;
                    if (C3432.f10845 >= 0) {
                        iM6982 = C2105.m6981("ۚۙ") ^ i8;
                        i = ((iM6982 ^ i9) * (-13257)) ^ (-1327361288);
                        i7 = 490694376;
                    } else {
                        iM6982 = C2105.m6981("ۤ᩵") ^ i9;
                        i = ((iM6982 ^ i8) * (-26761)) ^ (-1055401862);
                        i7 = 1994860964;
                    }
                    i11 = iM6982 ^ i7;
                    i10 = i;
                    break;
                case 399230728:
                case 801488170:
                    interfaceC12345 = interfaceC12345;
                    sArr5 = sArr5;
                    i12 = i12;
                    short s2 = sArr6[c];
                    int i23 = s2 + 14885;
                    if (C22628.f73083 > 0) {
                        int iM6988 = (C2105.m6981("۟᩺") + i8) * 29;
                        int i24 = ((iM6988 ^ i9) * (-27449)) ^ 921404001;
                        i17 = i23;
                        interfaceC12345 = interfaceC12345;
                        i12 = i12;
                        sArr5 = sArr5;
                        i11 = iM6988 ^ 1381925983;
                        s = s2;
                        i10 = i24;
                        c16476 = c16475;
                    } else {
                        s = s2;
                        i17 = i23;
                        interfaceC12345 = interfaceC12345;
                        int iM6989 = (C2105.m6981("ۛ֫") ^ i8) * 53;
                        i2 = ((iM6989 ^ i9) * (-18731)) ^ (-734520999);
                        i3 = iM6989 ^ (-2037459980);
                        short[] sArr19 = sArr5;
                        i11 = i3;
                        i10 = i2;
                        i12 = i12;
                        sArr5 = sArr19;
                    }
                    break;
                case 777300209:
                case 1565202273:
                    interfaceC12344 = interfaceC12345;
                    sArr = sArr5;
                    i5 = i12;
                    sArr6 = f50637;
                    c = '\n';
                    if (C5695.f17556 >= 0) {
                        iM2566 = C0630.m2566("۬ۢ") ^ i9;
                        i10 = ((iM2566 ^ i8) * 23933) ^ 1386481277;
                        i6 = 1221962701;
                    } else {
                        iM2566 = (i9 - C0630.m2566("ܶ֨")) * 123;
                        i10 = ((iM2566 ^ i8) * 18705) ^ 587675367;
                        i6 = 395471418;
                    }
                    int i25 = iM2566 ^ i6;
                    interfaceC12345 = interfaceC12344;
                    i12 = i5;
                    sArr5 = sArr;
                    i11 = i25;
                    c16476 = c16475;
                    break;
                case 1345867863:
                case 1474671785:
                    if (RunnableC1108.f4040) {
                        iM6982 = C0630.m2566("ۚ֨") ^ i9;
                        i = ((iM6982 ^ i8) * 19987) ^ 621482316;
                        i7 = -472892310;
                    } else {
                        iM6982 = C2105.m6981("ۚۙ") ^ i8;
                        i = ((iM6982 ^ i9) * (-13257)) ^ (-1327361288);
                        i7 = 490694376;
                    }
                    i11 = iM6982 ^ i7;
                    i10 = i;
                    break;
                default:
                    if (C7811.f24123 < 0) {
                        interfaceC12345 = interfaceC12345;
                        sArr5 = sArr5;
                        i12 = i12;
                        iM6981 = (C0630.m2566("۟֡") ^ i9) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i2 = ((iM6981 ^ i8) * (-10065)) ^ (-748524451);
                        i4 = 1455457356;
                        i3 = iM6981 ^ i4;
                        interfaceC12345 = interfaceC12345;
                        short[] sArr110 = sArr5;
                        i11 = i3;
                        i10 = i2;
                        i12 = i12;
                        sArr5 = sArr110;
                    } else {
                        iM6982 = C2105.m6981("ۚۙ") ^ i8;
                        i = ((iM6982 ^ i9) * (-13257)) ^ (-1327361288);
                        i7 = 490694376;
                        i11 = iM6982 ^ i7;
                        i10 = i;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C16475() {
        boolean z = false;
        int i = 1732038271;
        int i2 = C3245.f10203;
        int i3 = C22628.f73083;
        short s = f50637[0];
        int i4 = s + 11590;
        int i5 = (s * s) + 134328100;
        super(C0630.m2566(C0483.m2128(f50637, 1, 3, (i4 * i4) - (i5 + i5) > 0 ? 25504 : 60975)) ^ 2121090672);
        int iM6981 = (i3 - C2105.m6981("᩹ܿ")) * (-69);
        int i6 = ((iM6981 ^ i2) * 22525) ^ 1823917936;
        int i7 = -1959123449;
        while (true) {
            i = ((((i ^ i2) * 17323) >> 31) & i6) ^ (iM6981 ^ i7);
            switch (i) {
                case -2075486325:
                case 1216533492:
                    if (C1128.f4106 <= 0) {
                        iM6981 = C0630.m2566("ܳۛ") ^ i2;
                        i6 = ((iM6981 ^ i3) * (-23201)) ^ (-1127262760);
                        i7 = -830248902;
                    } else {
                        iM6981 = C0630.m2566("֨᩺") ^ i2;
                        i6 = ((iM6981 ^ i3) * 2943) ^ (-917035978);
                        i7 = 1359670955;
                    }
                    break;
                case -1998311117:
                case -836146334:
                    if (C1504.f5354) {
                        iM6981 = (C2105.m6981("ۤ᩸") ^ i3) * (-9);
                        i6 = ((iM6981 ^ i2) * (-2685)) ^ (-563993017);
                        i7 = 142340307;
                    } else {
                        iM6981 = C0630.m2566("ۛ᩵") ^ i2;
                        i6 = ((iM6981 ^ i3) * (-10929)) ^ 1674796798;
                        i7 = 747503576;
                    }
                    break;
                case -1830394849:
                case -319105446:
                    if (C0483.f2088 < 0) {
                        iM6981 = (C2105.m6981("ܶۗ") + i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i6 = ((iM6981 ^ i2) * (-27817)) ^ (-1711680205);
                        i7 = -1117245212;
                    } else {
                        iM6981 = (C0630.m2566("ۨܳ") + i2) * (-31);
                        i6 = ((iM6981 ^ i3) * (-27619)) ^ 1892559215;
                        i7 = 533975639;
                    }
                    break;
                case -1736393244:
                case -1126615702:
                    if (C1773.f6144 <= 0) {
                        iM6981 = (C2105.m6981("ۤ᩸") ^ i3) * (-9);
                        i6 = ((iM6981 ^ i2) * (-2685)) ^ (-563993017);
                        i7 = 142340307;
                    } else {
                        iM6981 = (C0630.m2566("ۘܺ") + i2) * (-95);
                        i6 = ((iM6981 ^ i3) * (-21649)) ^ (-1246831218);
                        i7 = -2052404654;
                    }
                    break;
                case -1324613032:
                case 1530103249:
                    if (C2520.m8026()) {
                        iM6981 = (C0630.m2566("۫ܽ") + i3) * (-63);
                        i6 = ((iM6981 ^ i2) * 3695) ^ (-348139718);
                        i7 = 1807340498;
                    } else {
                        iM6981 = C0630.m2566("ۖ᩹") ^ i3;
                        i6 = ((iM6981 ^ i2) * (-24341)) ^ 1358201082;
                        i7 = -917318505;
                    }
                    break;
                case -911936363:
                case 2100433910:
                    if (C2105.f7037 != 0) {
                        iM6981 = C0630.m2566("ܳۛ") ^ i2;
                        i6 = ((iM6981 ^ i3) * (-23201)) ^ (-1127262760);
                        i7 = -830248902;
                    } else {
                        iM6981 = (C2105.m6981("᩶᩷") ^ i2) * (-101);
                        i6 = ((iM6981 ^ i3) * 23091) ^ (-736763668);
                        i7 = -1180252572;
                    }
                    break;
                case -682398585:
                case -458605874:
                    C1294.m4372();
                    if (!C3683.m11222()) {
                        iM6981 = C0630.m2566("ܳۛ") ^ i2;
                        i6 = ((iM6981 ^ i3) * (-23201)) ^ (-1127262760);
                        i7 = -830248902;
                    } else {
                        iM6981 = (C2105.m6981("ۤ᩸") ^ i3) * (-9);
                        i6 = ((iM6981 ^ i2) * (-2685)) ^ (-563993017);
                        i7 = 142340307;
                    }
                    break;
                case -596391625:
                case -229775413:
                    if (C3746.m11369() >= 0) {
                        iM6981 = (C2105.m6981("ܶۗ") + i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i6 = ((iM6981 ^ i2) * (-27817)) ^ (-1711680205);
                        i7 = -1117245212;
                    } else {
                        iM6981 = C2105.m6981("ۤۨ") ^ i3;
                        i6 = ((iM6981 ^ i2) * 30695) ^ 1062632065;
                        i7 = 2029246934;
                    }
                    break;
                case -535448832:
                case 1936949009:
                    if (C1916.m6308() >= 0) {
                        iM6981 = (C0630.m2566("۫ܽ") + i3) * (-63);
                        i6 = ((iM6981 ^ i2) * 3695) ^ (-348139718);
                        i7 = 1807340498;
                    } else {
                        iM6981 = (C0630.m2566("۬ۧ") ^ i3) * (-29);
                        i6 = ((iM6981 ^ i2) * 29867) ^ 1983831918;
                        i7 = 2108727852;
                    }
                    break;
                case -241930296:
                case 2125372339:
                    z = true;
                    if (C5695.m16023() >= 0) {
                        iM6981 = (C0630.m2566("ۨܳ") + i2) * (-31);
                        i6 = ((iM6981 ^ i3) * (-27619)) ^ 1892559215;
                        i7 = 533975639;
                    } else {
                        iM6981 = (C2105.m6981("ۙ᩸") ^ i3) * 73;
                        i6 = ((iM6981 ^ i2) * (-24225)) ^ (-120160689);
                        i7 = -1806059863;
                    }
                    break;
                case -129252626:
                case 310878594:
                    C1773.m5908();
                    ServiceConnectionC3453.m10564();
                    throw new RuntimeException();
                case -55493609:
                case 82630677:
                    setHasOptionsMenu(z);
                    return;
                case 250890570:
                case 540958827:
                    if (C2126.f7087) {
                        iM6981 = (C2105.m6981("ܶۗ") + i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i6 = ((iM6981 ^ i2) * (-27817)) ^ (-1711680205);
                        i7 = -1117245212;
                    } else {
                        iM6981 = C2105.m6981("᩺ۚ") ^ i3;
                        i6 = ((iM6981 ^ i2) * 18957) ^ 1187042640;
                        i7 = 2103635639;
                    }
                    break;
                case 474169584:
                case 538207207:
                    if (C11340.f33930 >= 0) {
                        iM6981 = (C0630.m2566("ۨܳ") + i2) * (-31);
                        i6 = ((iM6981 ^ i3) * (-27619)) ^ 1892559215;
                        i7 = 533975639;
                    } else {
                        iM6981 = (C2105.m6981("ۤ᩸") ^ i3) * (-9);
                        i6 = ((iM6981 ^ i2) * (-2685)) ^ (-563993017);
                        i7 = 142340307;
                    }
                    break;
                case 1292895153:
                case 1822830009:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = (C0630.m2566("۫ܽ") + i3) * (-63);
                        i6 = ((iM6981 ^ i2) * 3695) ^ (-348139718);
                        i7 = 1807340498;
                    } else {
                        iM6981 = (C0630.m2566("֡۟") + i2) * 85;
                        i6 = ((iM6981 ^ i3) * (-31351)) ^ 568257684;
                        i7 = -1129317924;
                    }
                    break;
                default:
                    C2958.m9034();
                    iM6981 = (C2105.m6981("ۤ᩸") ^ i3) * (-9);
                    i6 = ((iM6981 ^ i2) * (-2685)) ^ (-563993017);
                    i7 = 142340307;
                    break;
            }
        }
    }

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ܺ */
    public final String mo14421() {
        return mo14422();
    }

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ᩴ */
    public final void mo34241() {
        C1659 c1659 = null;
        int i = 1492688802;
        int i2 = ServiceConnectionC3453.f10921;
        int i3 = C2167.f7158;
        int iM6981 = C2105.m6981("ۨ᩵") ^ i2;
        int i4 = ((iM6981 ^ i3) * (-16269)) ^ 1169954450;
        int i5 = 1314088264;
        while (true) {
            i = ((((i ^ i3) * (-1235)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2028704994:
                case 1862034693:
                    if (C2272.f7362) {
                        iM6981 = (i2 - C0630.m2566("᩶᩻")) * 5;
                        i4 = ((iM6981 ^ i3) * 7209) ^ 1236943879;
                        i5 = -698263759;
                    } else {
                        iM6981 = (C2105.m6981("ۖ۠") ^ i3) * 35;
                        i4 = ((iM6981 ^ i2) * (-24913)) ^ (-669195851);
                        i5 = -1816632460;
                    }
                    break;
                case -2018632696:
                case -1016116379:
                    c1659 = new C1659(this);
                    if (C0422.m1963()) {
                        iM6981 = (C0630.m2566("᩵֡") ^ i3) * 79;
                        i4 = ((iM6981 ^ i2) * (-32263)) ^ (-1899162244);
                        i5 = -2078458959;
                    } else {
                        iM6981 = C0630.m2566("᩸᩺") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-1763)) ^ (-1199706192);
                        i5 = -2026570316;
                    }
                    break;
                case -1934582332:
                case -1737546012:
                    break;
                case -1917152247:
                case 628457776:
                    if (C4075.f12947 >= 0) {
                        iM6981 = C0630.m2566("᩸᩺") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-1763)) ^ (-1199706192);
                        i5 = -2026570316;
                    } else {
                        iM6981 = C0630.m2566("ۡۙ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-10119)) ^ (-1902832904);
                        i5 = -1839492550;
                    }
                    break;
                case -1787946873:
                case -1270563347:
                    if (C4159.m12565() >= 0) {
                        iM6981 = C0630.m2566("᩸᩺") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-1763)) ^ (-1199706192);
                        i5 = -2026570316;
                    } else {
                        iM6981 = (C2105.m6981("ᩴۜ") + i2) * 127;
                        i4 = ((iM6981 ^ i3) * 28173) ^ 1883417018;
                        i5 = 2092013231;
                    }
                    break;
                case -1676265038:
                case 1408462892:
                    C1773.m5908();
                    if (C3746.f11829 <= 0) {
                        iM6981 = C2105.m6981("ܿ֡") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-23225)) ^ (-1517398450);
                        i5 = 1011554434;
                    } else {
                        iM6981 = (i2 - C0630.m2566("᩶᩻")) * 5;
                        i4 = ((iM6981 ^ i3) * 7209) ^ 1236943879;
                        i5 = -698263759;
                    }
                    break;
                case -1566285643:
                case 1375886150:
                    if (this.f50652) {
                        iM6981 = (C2105.m6981("ܿܶ") ^ i2) * (-81);
                        i4 = ((iM6981 ^ i3) * 7541) ^ (-1139809356);
                        i5 = 1361649134;
                    } else {
                        iM6981 = C2105.m6981("᩷᩷") ^ i3;
                        i4 = ((iM6981 ^ i2) * 15155) ^ 116895842;
                        i5 = 1094378530;
                    }
                    break;
                case -769549780:
                case 181024192:
                    if (this.f50644) {
                        iM6981 = C0630.m2566("ܽۜ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-32353)) ^ 1695161178;
                        i5 = 1593341713;
                    } else {
                        iM6981 = C2105.m6981("᩷᩷") ^ i3;
                        i4 = ((iM6981 ^ i2) * 15155) ^ 116895842;
                        i5 = 1094378530;
                    }
                    break;
                case -693980960:
                case 1809882596:
                    C4263.m12821(c1659);
                    iM6981 = C2105.m6981("᩷᩷") ^ i3;
                    i4 = ((iM6981 ^ i2) * 15155) ^ 116895842;
                    i5 = 1094378530;
                    break;
                case -682933728:
                case 1840490348:
                    if (C1005.f3721) {
                        iM6981 = C2105.m6981("ۢܶ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-18467)) ^ 1778305294;
                        i5 = -846562112;
                    } else {
                        iM6981 = (C2105.m6981("۟᩹") + i3) * 25;
                        i4 = ((iM6981 ^ i2) * 21009) ^ 140706842;
                        i5 = -994301820;
                    }
                    break;
                case -623363346:
                case -46712284:
                    C4616.m13552();
                    if (C22628.m50615() != 0) {
                        iM6981 = C0630.m2566("᩸᩺") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-1763)) ^ (-1199706192);
                        i5 = -2026570316;
                    } else {
                        iM6981 = (i2 - C0630.m2566("᩶᩻")) * 5;
                        i4 = ((iM6981 ^ i3) * 7209) ^ 1236943879;
                        i5 = -698263759;
                    }
                    break;
                case -451054874:
                case 752100900:
                    C0964.m3413();
                    RunnableC1108.m3790();
                    iM6981 = (i2 - C0630.m2566("᩶᩻")) * 5;
                    i4 = ((iM6981 ^ i3) * 7209) ^ 1236943879;
                    i5 = -698263759;
                    break;
                case -408201100:
                case 2125249362:
                    if (C2105.f7037 != 0) {
                        iM6981 = (C2105.m6981("۟᩹") + i3) * 25;
                        i4 = ((iM6981 ^ i2) * 21009) ^ 140706842;
                        i5 = -994301820;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۗۢ")) * 91;
                        i4 = ((iM6981 ^ i2) * (-26579)) ^ 231145634;
                        i5 = 204800146;
                    }
                    break;
                case -351023652:
                case 1296105323:
                    if (C2958.f9394 >= 0) {
                        iM6981 = C2105.m6981("ܿ֡") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-23225)) ^ (-1517398450);
                        i5 = 1011554434;
                    } else {
                        iM6981 = C2105.m6981("ܰۘ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-1145)) ^ (-1697630530);
                        i5 = 1002197752;
                    }
                    break;
                case -332567289:
                case 583586443:
                    if (C0964.m3413()) {
                        iM6981 = C2105.m6981("ۧ۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * 21545) ^ (-1352014782);
                        i5 = -1589312978;
                    } else {
                        iM6981 = (i2 - C0630.m2566("᩶᩻")) * 5;
                        i4 = ((iM6981 ^ i3) * 7209) ^ 1236943879;
                        i5 = -698263759;
                    }
                    break;
                case 35272104:
                case 1425671367:
                    if (this.f50647) {
                        iM6981 = C2105.m6981("᩷᩷") ^ i3;
                        i4 = ((iM6981 ^ i2) * 15155) ^ 116895842;
                        i5 = 1094378530;
                    } else {
                        iM6981 = C2105.m6981("۬ᩳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 17123) ^ (-343183809);
                        i5 = 1054252635;
                    }
                    break;
                case 1439568248:
                case 1990596198:
                    C0798.m2998();
                    C3432.m10477();
                    break;
                case 1807763398:
                case 1885238258:
                    if (C0382.f1805) {
                        iM6981 = C2105.m6981("ܿ֡") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-23225)) ^ (-1517398450);
                        i5 = 1011554434;
                    } else {
                        iM6981 = (C0630.m2566("ᩳ۬") ^ i3) * (-31);
                        i4 = ((iM6981 ^ i2) * (-1735)) ^ 647161897;
                        i5 = 847834797;
                    }
                    break;
                case 1984747892:
                case 2014532305:
                    if (C2126.m7040()) {
                        iM6981 = (C2105.m6981("۟᩹") + i3) * 25;
                        i4 = ((iM6981 ^ i2) * 21009) ^ 140706842;
                        i5 = -994301820;
                    } else {
                        iM6981 = C0630.m2566("ܽ᩻") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-1899)) ^ (-1022541773);
                        i5 = 1810064560;
                    }
                    break;
                default:
                    if (C1711.f5919) {
                        iM6981 = (C2105.m6981("۟᩹") + i3) * 25;
                        i4 = ((iM6981 ^ i2) * 21009) ^ 140706842;
                        i5 = -994301820;
                    } else {
                        iM6981 = (i3 - C0630.m2566("۬ۖ")) * 63;
                        i4 = ((iM6981 ^ i2) * (-1297)) ^ 1249287816;
                        i5 = 402038176;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ۜ */
    public final String mo14419() {
        return C6554.m18061(150, m38819());
    }

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ֫ */
    public final void mo17423(C3764 c3764) {
        c3764.m11383(m38819());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00af, code lost:
    
        if (l.C4117.f13076 > 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00a5, code lost:
    
        if (l.C3911.f12484 >= 0) goto L10;
     */
    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ᩷ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String mo14422() {
        int iM2566;
        int i;
        int i2;
        short[] sArr;
        int i3;
        int iM2567;
        int i4;
        int i5;
        int iM12362;
        C16475 c16475 = this;
        int i6 = RunnableC1937.f6483;
        int i7 = RunnableC0588.f2309;
        int iM2568 = C0630.m2566("ܺۨ") ^ i7;
        int i8 = ((iM2568 ^ i6) * (-11185)) ^ (-1965792823);
        String str = null;
        StringBuilder sb = null;
        String strM28015 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i9 = iM2568 ^ 538763125;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        short s = 0;
        short s2 = 0;
        Bundle bundleM10747 = null;
        int i17 = 0;
        int i18 = 0;
        int i19 = 2013695953;
        String strM34210 = null;
        StringBuilder sb2 = null;
        int i20 = 0;
        while (true) {
            i19 = i9 ^ (i8 & (((i19 ^ i6) * (-9615)) >> 31));
            switch (i19) {
                case -2111275876:
                case 1525878795:
                    c16475.f50645 = C6554.m18061(i20, C0422.m1959(sb2));
                    bundleM10747 = bundleM10747;
                    i17 = i17;
                    i18 = i18;
                    sArr2 = sArr2;
                    sArr4 = sArr4;
                    iM2566 = (C0630.m2566("ۢۢ") ^ i7) * (-81);
                    i = ((iM2566 ^ i6) * 19157) ^ 755055730;
                    i2 = -70189342;
                    int i21 = iM2566 ^ i2;
                    sArr2 = sArr2;
                    bundleM10747 = bundleM10747;
                    i9 = i21;
                    i17 = i17;
                    c16475 = this;
                    short[] sArr5 = sArr4;
                    i18 = i18;
                    i8 = i;
                    sArr4 = sArr5;
                    break;
                case -1988600399:
                case 810350648:
                    C3245.m9923(sb2, C3537.m10748(sArr3, i13, 5, i14));
                    if (AbstractC2021.m6574()) {
                        iM2567 = (i7 - C2105.m6981("᩸ۗ")) * 49;
                        i4 = ((iM2567 ^ i6) * 10991) ^ (-415970960);
                        i5 = 1647972236;
                    } else {
                        iM2567 = (i6 - C2105.m6981("֨ܺ")) * (-27);
                        i4 = ((iM2567 ^ i7) * (-21217)) ^ (-2045189858);
                        i5 = -939939853;
                    }
                    i9 = iM2567 ^ i5;
                    i8 = i4;
                    break;
                case -1968344736:
                case 421453700:
                    i14 = 47196;
                    iM2566 = C0630.m2566("ۢ۫") ^ i7;
                    i = ((iM2566 ^ i6) * 6747) ^ (-1056405235);
                    i2 = -2081621182;
                    int i22 = iM2566 ^ i2;
                    sArr2 = sArr2;
                    bundleM10747 = bundleM10747;
                    i9 = i22;
                    i17 = i17;
                    c16475 = this;
                    short[] sArr6 = sArr4;
                    i18 = i18;
                    i8 = i;
                    sArr4 = sArr6;
                    break;
                case -1768511544:
                case 867820097:
                    sb2 = new StringBuilder();
                    strM34210 = C14336.m34210(m38819());
                    if (C0050.m940() > 0) {
                        iM2567 = C0630.m2566("֨ۖ") ^ i6;
                        i4 = ((iM2567 ^ i7) * (-31621)) ^ (-1182849699);
                        i5 = -1395627057;
                        i9 = iM2567 ^ i5;
                        i8 = i4;
                    } else {
                        bundleM10747 = bundleM10747;
                        i17 = i17;
                        i18 = i18;
                        sArr2 = sArr2;
                        int iM6981 = (C2105.m6981("ۢ᩷") + i6) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        int i23 = i18;
                        i8 = ((iM6981 ^ i7) * (-30389)) ^ (-773896891);
                        i18 = i23;
                        sArr2 = sArr2;
                        bundleM10747 = bundleM10747;
                        i9 = iM6981 ^ 1122495790;
                        i17 = i17;
                        c16475 = this;
                    }
                    break;
                case -1623538165:
                case 349612203:
                    RunnableC1937.m6387();
                    if (C1294.f4556 >= 0) {
                        iM2567 = C2105.m6981("۟֡") ^ i7;
                        i4 = ((iM2567 ^ i6) * 24255) ^ 628742065;
                        i5 = 1095222070;
                        i9 = iM2567 ^ i5;
                        i8 = i4;
                    } else {
                        bundleM10747 = bundleM10747;
                        i17 = i17;
                        i18 = i18;
                        sArr2 = sArr2;
                        sArr4 = sArr4;
                        iM2566 = (C2105.m6981("ܳ۟") + i7) * 51;
                        i = ((iM2566 ^ i6) * (-2133)) ^ 749967798;
                        i2 = -1318221803;
                        int i24 = iM2566 ^ i2;
                        sArr2 = sArr2;
                        bundleM10747 = bundleM10747;
                        i9 = i24;
                        i17 = i17;
                        c16475 = this;
                        short[] sArr7 = sArr4;
                        i18 = i18;
                        i8 = i;
                        sArr4 = sArr7;
                    }
                    break;
                case -1518067486:
                case 1431352652:
                    C3245.m9923(sb, strM28015);
                    c16475.f50645 = C6554.m18061(i20, C0050.m947(sb));
                    bundleM10747 = bundleM10747;
                    i17 = i17;
                    i18 = i18;
                    sArr2 = sArr2;
                    sArr4 = sArr4;
                    iM2566 = (C0630.m2566("ۢۢ") ^ i7) * (-81);
                    i = ((iM2566 ^ i6) * 19157) ^ 755055730;
                    i2 = -70189342;
                    int i25 = iM2566 ^ i2;
                    sArr2 = sArr2;
                    bundleM10747 = bundleM10747;
                    i9 = i25;
                    i17 = i17;
                    c16475 = this;
                    short[] sArr8 = sArr4;
                    i18 = i18;
                    i8 = i;
                    sArr4 = sArr8;
                    break;
                case -1483653840:
                case 289952529:
                    bundleM10747 = bundleM10747;
                    i17 = i17;
                    i18 = i18;
                    sArr2 = sArr2;
                    sArr4 = sArr4;
                    int i26 = s + s2;
                    if ((i26 * i26) - i16 < 0) {
                        iM2566 = C2105.m6981("۠ᩳ") ^ i6;
                        i = ((iM2566 ^ i7) * (-691)) ^ 487605952;
                        i2 = 1887560824;
                    } else {
                        iM2566 = (i7 - C2105.m6981("ܺ᩷")) * (-61);
                        i = ((iM2566 ^ i6) * 24751) ^ 1269720032;
                        i2 = -981290378;
                    }
                    int i27 = iM2566 ^ i2;
                    sArr2 = sArr2;
                    bundleM10747 = bundleM10747;
                    i9 = i27;
                    i17 = i17;
                    c16475 = this;
                    short[] sArr9 = sArr4;
                    i18 = i18;
                    i8 = i;
                    sArr4 = sArr9;
                    break;
                case -1463947993:
                case -1004509844:
                    bundleM10747 = bundleM10747;
                    i17 = i17;
                    i18 = i18;
                    sArr2 = sArr2;
                    sArr4 = sArr4;
                    i15 = s * 2;
                    if (C2105.f7037 != 0) {
                        iM2566 = (C2105.m6981("ܳ۟") + i7) * 51;
                        i = ((iM2566 ^ i6) * (-2133)) ^ 749967798;
                        i2 = -1318221803;
                    } else {
                        iM2566 = C0630.m2566("ۤ᩶") ^ i6;
                        i = ((iM2566 ^ i7) * (-3935)) ^ 254739735;
                        i2 = 996056392;
                    }
                    int i28 = iM2566 ^ i2;
                    sArr2 = sArr2;
                    bundleM10747 = bundleM10747;
                    i9 = i28;
                    i17 = i17;
                    c16475 = this;
                    short[] sArr10 = sArr4;
                    i18 = i18;
                    i8 = i;
                    sArr4 = sArr10;
                    break;
                case -1430408592:
                case 788728208:
                    bundleM10747 = bundleM10747;
                    i17 = i17;
                    i18 = i18;
                    sArr2 = sArr2;
                    sArr4 = sArr4;
                    i16 = i15 + 1;
                    s2 = 1;
                    if (C7811.f24123 < 0) {
                        iM2566 = C0630.m2566("ܶ᩹") ^ i6;
                        i = ((iM2566 ^ i7) * 17443) ^ 61347443;
                        i2 = -2136246728;
                        int i29 = iM2566 ^ i2;
                        sArr2 = sArr2;
                        bundleM10747 = bundleM10747;
                        i9 = i29;
                        i17 = i17;
                        c16475 = this;
                        short[] sArr11 = sArr4;
                        i18 = i18;
                        i8 = i;
                        sArr4 = sArr11;
                    } else {
                        sArr4 = sArr4;
                        int iM6982 = (C2105.m6981("ۢ᩷") + i6) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        int i210 = i18;
                        i8 = ((iM6982 ^ i7) * (-30389)) ^ (-773896891);
                        i18 = i210;
                        sArr2 = sArr2;
                        bundleM10747 = bundleM10747;
                        i9 = iM6982 ^ 1122495790;
                        i17 = i17;
                        c16475 = this;
                    }
                    break;
                case -1346356451:
                case 2041788087:
                    sb = new StringBuilder();
                    C1420.m4905(sb, C14336.m34210(m38819()));
                    if (C2520.f8000 < 0) {
                        iM2567 = C2105.m6981("۠ۙ") ^ i7;
                        i4 = ((iM2567 ^ i6) * (-8041)) ^ (-578966945);
                        i5 = -1397925365;
                        i9 = iM2567 ^ i5;
                        i8 = i4;
                    }
                    i3 = i18;
                    sArr = sArr4;
                    int iM6983 = (i6 - C2105.m6981("۟᩸")) * 93;
                    i4 = ((iM6983 ^ i7) * 17551) ^ (-1519766370);
                    i9 = iM6983 ^ 1615582534;
                    sArr4 = sArr;
                    i18 = i3;
                    i8 = i4;
                    break;
                case -1315846867:
                case 437770404:
                    bundleM10747 = bundleM10747;
                    i17 = i17;
                    i18 = i18;
                    sArr2 = sArr2;
                    sArr4 = sArr4;
                    if (c16475.f50645 != null) {
                        iM2566 = (C0630.m2566("ۢۢ") ^ i7) * (-81);
                        i = ((iM2566 ^ i6) * 19157) ^ 755055730;
                        i2 = -70189342;
                        int i211 = iM2566 ^ i2;
                        sArr2 = sArr2;
                        bundleM10747 = bundleM10747;
                        i9 = i211;
                        i17 = i17;
                        c16475 = this;
                        short[] sArr12 = sArr4;
                        i18 = i18;
                        i8 = i;
                        sArr4 = sArr12;
                    } else {
                        int iM2569 = (C0630.m2566("᩺ᩳ") ^ i6) * 123;
                        int i30 = ((iM2569 ^ i7) * 24695) ^ (-369259597);
                        sArr2 = sArr2;
                        bundleM10747 = bundleM10747;
                        i9 = iM2569 ^ (-465124557);
                        i17 = i17;
                        sArr4 = sArr4;
                        i18 = i18;
                        i8 = i30;
                        c16475 = this;
                    }
                    break;
                case -1175992780:
                case 247034104:
                    bundleM10747 = bundleM10747;
                    i17 = i17;
                    i18 = i18;
                    sArr2 = sArr2;
                    sArr4 = sArr4;
                    s = f50637[432];
                    if (C0422.f1886 <= 0) {
                        sArr4 = sArr4;
                        int iM6984 = (C2105.m6981("ۢ᩷") + i6) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        int i212 = i18;
                        i8 = ((iM6984 ^ i7) * (-30389)) ^ (-773896891);
                        i18 = i212;
                        sArr2 = sArr2;
                        bundleM10747 = bundleM10747;
                        i9 = iM6984 ^ 1122495790;
                        i17 = i17;
                    } else {
                        int iM25610 = (C0630.m2566("ۨۜ") ^ i7) * (-9);
                        i8 = ((iM25610 ^ i6) * 26977) ^ 1797127372;
                        sArr2 = sArr2;
                        sArr4 = sArr4;
                        i17 = i17;
                        i18 = i18;
                        bundleM10747 = bundleM10747;
                        i9 = iM25610 ^ 1376494753;
                    }
                    c16475 = this;
                    break;
                case -1159466257:
                case 667159155:
                    iM12362 = C0798.m3007(str);
                    i10 = iM12362;
                    iM2567 = C0630.m2566("ۜ֨") ^ i6;
                    i4 = ((iM2567 ^ i7) * (-14625)) ^ (-1299978563);
                    i5 = 1042497147;
                    i9 = iM2567 ^ i5;
                    i8 = i4;
                    break;
                case -1134993533:
                case -1102798442:
                    return c16475.f50645;
                case -877017965:
                case -658708933:
                    C0714.m2805();
                    bundleM10747 = bundleM10747;
                    i17 = i17;
                    i18 = i18;
                    sArr2 = sArr2;
                    sArr4 = sArr4;
                    iM2566 = (C2105.m6981("ܳ۟") + i7) * 51;
                    i = ((iM2566 ^ i6) * (-2133)) ^ 749967798;
                    i2 = -1318221803;
                    int i213 = iM2566 ^ i2;
                    sArr2 = sArr2;
                    bundleM10747 = bundleM10747;
                    i9 = i213;
                    i17 = i17;
                    c16475 = this;
                    short[] sArr13 = sArr4;
                    i18 = i18;
                    i8 = i;
                    sArr4 = sArr13;
                    break;
                case -646212193:
                case -513616703:
                    i14 = 48256;
                    iM2566 = C0630.m2566("ۢ۫") ^ i7;
                    i = ((iM2566 ^ i6) * 6747) ^ (-1056405235);
                    i2 = -2081621182;
                    int i214 = iM2566 ^ i2;
                    sArr2 = sArr2;
                    bundleM10747 = bundleM10747;
                    i9 = i214;
                    i17 = i17;
                    c16475 = this;
                    short[] sArr14 = sArr4;
                    i18 = i18;
                    i8 = i;
                    sArr4 = sArr14;
                    break;
                case -414295909:
                case 470568020:
                    C0237.m1481();
                    C2105.m6982();
                    return null;
                case -224134638:
                case 178126243:
                    sArr = sArr4;
                    bundleM10747 = C3537.m10747(this);
                    sArr2 = f50637;
                    i17 = 433;
                    i3 = 6;
                    if (C4117.m12364() != 0) {
                        int iM6985 = (i6 - C2105.m6981("۟᩸")) * 93;
                        i4 = ((iM6985 ^ i7) * 17551) ^ (-1519766370);
                        i9 = iM6985 ^ 1615582534;
                        sArr4 = sArr;
                        i18 = i3;
                        i8 = i4;
                    } else {
                        int iM6986 = (C2105.m6981("ۖۚ") ^ i6) * (-61);
                        i9 = iM6986 ^ (-536200441);
                        i8 = ((iM6986 ^ i7) * 13887) ^ 1460358533;
                        sArr4 = sArr;
                        i18 = 6;
                    }
                    break;
                case -36689124:
                case 186911556:
                    iM12362 = C4117.m12362(str, 40);
                    if (iM12362 == -1) {
                        iM2567 = C2105.m6981("ۨۖ") ^ i6;
                        i4 = ((iM2567 ^ i7) * (-28259)) ^ (-1127772157);
                        i5 = -1238955593;
                    } else {
                        i10 = iM12362;
                        iM2567 = C0630.m2566("ۜ֨") ^ i6;
                        i4 = ((iM2567 ^ i7) * (-14625)) ^ (-1299978563);
                        i5 = 1042497147;
                    }
                    i9 = iM2567 ^ i5;
                    i8 = i4;
                    break;
                case 13774271:
                case 1460395472:
                    break;
                case 447192284:
                case 1223048266:
                    break;
                case 894860893:
                case 1332150822:
                    sArr4 = f50637;
                    i11 = 444;
                    i12 = 1;
                    if (C3245.f10203 > 0) {
                        iM2567 = C0630.m2566("֨ۜ") ^ i6;
                        i4 = ((iM2567 ^ i7) * 20389) ^ (-1066010059);
                        i5 = -172100205;
                        i9 = iM2567 ^ i5;
                        i8 = i4;
                    } else {
                        bundleM10747 = bundleM10747;
                        i17 = i17;
                        i18 = i18;
                        sArr2 = sArr2;
                        int iM6987 = (C2105.m6981("ۢ᩷") + i6) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        int i215 = i18;
                        i8 = ((iM6987 ^ i7) * (-30389)) ^ (-773896891);
                        i18 = i215;
                        sArr2 = sArr2;
                        bundleM10747 = bundleM10747;
                        i9 = iM6987 ^ 1122495790;
                        i17 = i17;
                        c16475 = this;
                    }
                    break;
                case 1026753227:
                case 2124003263:
                    C1420.m4905(sb2, strM34210);
                    sArr3 = f50637;
                    i13 = 439;
                    if (C4616.f14690 > 0) {
                        iM2567 = C2105.m6981("ۜܳ") ^ i7;
                        i4 = ((iM2567 ^ i6) * (-10115)) ^ (-1244052861);
                        i5 = -1447568320;
                        i9 = iM2567 ^ i5;
                        i8 = i4;
                    }
                    i3 = i18;
                    sArr = sArr4;
                    int iM6988 = (i6 - C2105.m6981("۟᩸")) * 93;
                    i4 = ((iM6988 ^ i7) * 17551) ^ (-1519766370);
                    i9 = iM6988 ^ 1615582534;
                    sArr4 = sArr;
                    i18 = i3;
                    i8 = i4;
                    break;
                case 1683922061:
                case 1785911725:
                    C3245.m9923(sb, C7106.m19110(sArr4, i11, i12, i14));
                    strM28015 = C11340.m28015(str, 0, i10);
                    if (C1504.f5354) {
                        iM2567 = C2105.m6981("۟֡") ^ i7;
                        i4 = ((iM2567 ^ i6) * 24255) ^ 628742065;
                        i5 = 1095222070;
                    } else {
                        iM2567 = (i7 - C0630.m2566("ܰۨ")) * 109;
                        i4 = ((iM2567 ^ i6) * 20445) ^ 86780275;
                        i5 = 711864009;
                    }
                    i9 = iM2567 ^ i5;
                    i8 = i4;
                    break;
                default:
                    i17 = i17;
                    int i31 = i18;
                    short[] sArr15 = sArr2;
                    String strM2575 = C0630.m2575(sArr15, i17, i31, i14);
                    sArr2 = sArr15;
                    Bundle bundle = bundleM10747;
                    String strM19112 = C7106.m19112(bundle, strM2575);
                    if (strM19112 != null) {
                        int iM25611 = (i7 - C0630.m2566("᩻ۗ")) * 11;
                        i8 = ((iM25611 ^ i6) * 24219) ^ (-1005339327);
                        bundleM10747 = bundle;
                        i9 = iM25611 ^ (-1768660939);
                    } else {
                        int iM25612 = (C0630.m2566("ۙۖ") ^ i7) * 101;
                        bundleM10747 = bundle;
                        i9 = iM25612 ^ 1451482610;
                        i8 = ((iM25612 ^ i6) * 6719) ^ (-1655080071);
                        sArr4 = sArr4;
                    }
                    i18 = i31;
                    str = strM19112;
                    i20 = 80;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38789(C16475 c16475, List list, List list2, List list3, List list4) {
        int i = -2035967329;
        int i2 = C7811.f24123;
        int i3 = AbstractC2021.f6743;
        int iM2566 = C0630.m2566("ۧ᩺") ^ i3;
        int i4 = ((iM2566 ^ i2) * 32011) ^ 766458590;
        int i5 = 379193850;
        while (true) {
            i = ((((i ^ i2) * (-17729)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -1981448636:
                case 934002069:
                    if (C4263.f13799 > 0) {
                        iM2566 = (i3 - C0630.m2566("۬ܿ")) * (-5);
                        i4 = ((iM2566 ^ i2) * 9845) ^ (-9316856);
                        i5 = -421480162;
                    } else {
                        iM2566 = C0630.m2566("ܳ᩻") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-16399)) ^ (-201170487);
                        i5 = -834365519;
                    }
                    break;
                case -1924423995:
                case -1471201650:
                    C2105.m6982();
                    if (!C11340.m28031()) {
                        iM2566 = (C2105.m6981("ۤۘ") ^ i3) * (-19);
                        i4 = ((iM2566 ^ i2) * (-11663)) ^ (-563843303);
                        i5 = 1636837459;
                    } else {
                        iM2566 = (C2105.m6981("۬ۧ") ^ i2) * (-89);
                        i4 = ((iM2566 ^ i3) * (-547)) ^ (-543745508);
                        i5 = 1809235018;
                    }
                    break;
                case -1811170890:
                case 911422386:
                    c16475.f50655.m46590(list, list3, list2, list4);
                    iM2566 = C0630.m2566("ܶ᩻") ^ i2;
                    i4 = ((iM2566 ^ i3) * 5413) ^ (-1092688447);
                    i5 = -870668837;
                    break;
                case -1663942500:
                case 900255921:
                    if (RunnableC3474.m10630()) {
                        iM2566 = (C0630.m2566("᩸ۡ") ^ i3) * (-127);
                        i4 = ((iM2566 ^ i2) * 27567) ^ (-1413390610);
                        i5 = 1281202000;
                    } else {
                        iM2566 = C0630.m2566("ۧ᩹") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-5951)) ^ 1470853351;
                        i5 = 940919665;
                    }
                    break;
                case -1618152755:
                case -255070984:
                    RunnableC1108.m3790();
                    break;
                case -1134514016:
                case 1949523492:
                    if (C1916.f6442) {
                        iM2566 = C2105.m6981("ܽܽ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 25651) ^ 1452943956;
                        i5 = 1665329746;
                    } else {
                        iM2566 = (C2105.m6981("۬ۧ") ^ i2) * (-89);
                        i4 = ((iM2566 ^ i3) * (-547)) ^ (-543745508);
                        i5 = 1809235018;
                    }
                    break;
                case -1134421363:
                case -439811693:
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = (i3 - C0630.m2566("۬ܿ")) * (-5);
                        i4 = ((iM2566 ^ i2) * 9845) ^ (-9316856);
                        i5 = -421480162;
                    } else {
                        iM2566 = C0630.m2566("᩷᩸") ^ i3;
                        i4 = ((iM2566 ^ i2) * 32371) ^ 526120632;
                        i5 = -1749877030;
                    }
                    break;
                case -1055178824:
                case 1665653663:
                    if (C0382.f1805) {
                        iM2566 = (i2 - C0630.m2566("۬᩻")) * 43;
                        i4 = ((iM2566 ^ i3) * 21887) ^ (-100023880);
                        i5 = -689932839;
                    } else {
                        iM2566 = (C2105.m6981("۬ۧ") ^ i2) * (-89);
                        i4 = ((iM2566 ^ i3) * (-547)) ^ (-543745508);
                        i5 = 1809235018;
                    }
                    break;
                case -760035147:
                case 115570701:
                    if (C3683.f11629 >= 0) {
                        iM2566 = (C2105.m6981("۬ۧ") ^ i2) * (-89);
                        i4 = ((iM2566 ^ i3) * (-547)) ^ (-543745508);
                        i5 = 1809235018;
                    } else {
                        iM2566 = (C2105.m6981("᩺ۗ") ^ i3) * 57;
                        i4 = ((iM2566 ^ i2) * 11367) ^ (-1878677748);
                        i5 = 379574751;
                    }
                    break;
                case -539927273:
                case 1301457082:
                    if (c16475.f50644) {
                        iM2566 = C0630.m2566("᩷ۖ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-9457)) ^ 43838641;
                        i5 = 1627031310;
                    } else {
                        iM2566 = C0630.m2566("ܶ᩻") ^ i2;
                        i4 = ((iM2566 ^ i3) * 5413) ^ (-1092688447);
                        i5 = -870668837;
                    }
                    break;
                case -514071537:
                case 1852686556:
                    if (C2105.f7037 != 0) {
                        iM2566 = (i3 - C0630.m2566("۬ܿ")) * (-5);
                        i4 = ((iM2566 ^ i2) * 9845) ^ (-9316856);
                        i5 = -421480162;
                    } else {
                        iM2566 = (C2105.m6981("ܰ۬") + i3) * (-95);
                        i4 = ((iM2566 ^ i2) * (-29629)) ^ 1265135116;
                        i5 = -1569971269;
                    }
                    break;
                case -342752263:
                case 599983707:
                    if (C21923.f70183 != 0) {
                        iM2566 = (i3 - C0630.m2566("۬ܿ")) * (-5);
                        i4 = ((iM2566 ^ i2) * 9845) ^ (-9316856);
                        i5 = -421480162;
                    } else {
                        iM2566 = C0630.m2566("ۢܶ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-17859)) ^ (-733096509);
                        i5 = 1353448924;
                    }
                    break;
                case 598679485:
                case 2112527001:
                    break;
                case 928903769:
                case 1213280110:
                    C3245.m9925();
                    iM2566 = (C2105.m6981("ۤۘ") ^ i3) * (-19);
                    i4 = ((iM2566 ^ i2) * (-11663)) ^ (-563843303);
                    i5 = 1636837459;
                    break;
                case 1076917770:
                case 1401826313:
                    if (C3432.m10477() <= 0) {
                        iM2566 = (C2105.m6981("۬ۧ") ^ i2) * (-89);
                        i4 = ((iM2566 ^ i3) * (-547)) ^ (-543745508);
                        i5 = 1809235018;
                    } else {
                        iM2566 = C0630.m2566("ۧܽ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 1965) ^ (-316408079);
                        i5 = 340216001;
                    }
                    break;
                case 1122835060:
                case 2108598287:
                    if (C1128.m3851() <= 0) {
                        iM2566 = (C2105.m6981("ۤۘ") ^ i3) * (-19);
                        i4 = ((iM2566 ^ i2) * (-11663)) ^ (-563843303);
                        i5 = 1636837459;
                    } else {
                        iM2566 = (i2 - C0630.m2566("ۜܶ")) * 19;
                        i4 = ((iM2566 ^ i3) * (-10875)) ^ (-452413114);
                        i5 = 386749772;
                    }
                    break;
                case 1331869243:
                case 2142546782:
                    if (C7106.f21815 == 0) {
                        iM2566 = (i3 - C0630.m2566("۬ܿ")) * (-5);
                        i4 = ((iM2566 ^ i2) * 9845) ^ (-9316856);
                        i5 = -421480162;
                    } else {
                        iM2566 = (C2105.m6981("۬ۧ") ^ i2) * (-89);
                        i4 = ((iM2566 ^ i3) * (-547)) ^ (-543745508);
                        i5 = 1809235018;
                    }
                    break;
                default:
                    if (C3746.f11829 <= 0) {
                        iM2566 = (C2105.m6981("ۤۘ") ^ i3) * (-19);
                        i4 = ((iM2566 ^ i2) * (-11663)) ^ (-563843303);
                        i5 = 1636837459;
                    } else {
                        iM2566 = C2105.m6981("۬ۡ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-20547)) ^ 2051663795;
                        i5 = 1413028257;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38790(C16475 c16475, AtomicBoolean atomicBoolean, EnumC13610 enumC13610) {
        int i = 501705783;
        int i2 = RunnableC3474.f10992;
        int i3 = C4616.f14690;
        int iM6981 = (C2105.m6981("᩵۟") + i3) * (-33);
        int i4 = ((iM6981 ^ i2) * (-6115)) ^ 1126662068;
        int i5 = 31108811;
        while (true) {
            i = ((((i ^ i2) * (-22669)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2147155258:
                case 8847933:
                    if (C4263.f13799 <= 0) {
                        iM6981 = C0630.m2566("ܶ۫") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-31533)) ^ 129186550;
                        i5 = 818218000;
                    } else {
                        iM6981 = C2105.m6981("ۨۤ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 15097) ^ 1359369311;
                        i5 = 555015464;
                    }
                    break;
                case -2036558829:
                case -927852110:
                    if (enumC13610.m32728()) {
                        iM6981 = C2105.m6981("۬ܿ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 19199) ^ 747856625;
                        i5 = 283359031;
                    } else {
                        iM6981 = C2105.m6981("᩻۬") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-14993)) ^ 1767919112;
                        i5 = 237019453;
                    }
                    break;
                case -1803572835:
                case 675608265:
                    if (C1420.f5096 <= 0) {
                        iM6981 = C0630.m2566("ܶ۫") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-31533)) ^ 129186550;
                        i5 = 818218000;
                    } else {
                        iM6981 = (C0630.m2566("ۛۜ") ^ i2) * (-103);
                        i4 = ((iM6981 ^ i3) * 8925) ^ (-886602806);
                        i5 = -837911800;
                    }
                    break;
                case -1713017387:
                case -414183027:
                    C11340.m28031();
                    C4263.m12819();
                    iM6981 = C0630.m2566("֡᩷") ^ i2;
                    i4 = ((iM6981 ^ i3) * 19329) ^ (-23976172);
                    i5 = -1743741135;
                    break;
                case -1687368813:
                case 457991000:
                    C0964.m3402(new C1659(c16475));
                    iM6981 = C2105.m6981("᩻۬") ^ i2;
                    i4 = ((iM6981 ^ i3) * (-14993)) ^ 1767919112;
                    i5 = 237019453;
                    break;
                case -1633792212:
                case 1341933296:
                    if (C5695.f17556 >= 0) {
                        iM6981 = C0630.m2566("֡᩷") ^ i2;
                        i4 = ((iM6981 ^ i3) * 19329) ^ (-23976172);
                        i5 = -1743741135;
                    } else {
                        iM6981 = (i2 - C0630.m2566("᩵֡")) * (-7);
                        i4 = ((iM6981 ^ i3) * 10447) ^ (-2132664644);
                        i5 = -315577389;
                    }
                    break;
                case -1627999613:
                case -803984076:
                    C4263.m12819();
                    if (ServiceConnectionC3453.f10921 < 0) {
                        iM6981 = C0630.m2566("ܶ۫") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-31533)) ^ 129186550;
                        i5 = 818218000;
                    } else {
                        iM6981 = C2105.m6981("ۡۛ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 18167) ^ 1344063881;
                        i5 = -1084330225;
                    }
                    break;
                case -1570374781:
                case -931125062:
                    if (C22628.m50615() != 0) {
                        iM6981 = (C2105.m6981("᩺۠") ^ i3) * (-115);
                        i4 = ((iM6981 ^ i2) * (-5265)) ^ (-140327814);
                        i5 = 1256513050;
                    } else {
                        iM6981 = (C0630.m2566("ۤ᩵") ^ i2) * (-83);
                        i4 = ((iM6981 ^ i3) * (-1145)) ^ 1927754162;
                        i5 = -283607636;
                    }
                    break;
                case -1374322272:
                case -22221434:
                    if (atomicBoolean.compareAndSet(true, false)) {
                        iM6981 = C2105.m6981("᩻۬") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-14993)) ^ 1767919112;
                        i5 = 237019453;
                    } else {
                        iM6981 = C2105.m6981("᩶۟") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-25577)) ^ 512328637;
                        i5 = -1608224262;
                    }
                    break;
                case -1223904383:
                case -1080402166:
                    if (C4159.f13567) {
                        iM6981 = C2105.m6981("ܺۚ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 2421) ^ 493824281;
                        i5 = 1211104863;
                    } else {
                        iM6981 = (C2105.m6981("᩺۠") ^ i3) * (-115);
                        i4 = ((iM6981 ^ i2) * (-5265)) ^ (-140327814);
                        i5 = 1256513050;
                    }
                    break;
                case -589302658:
                case 1658059112:
                    C0382.m1848();
                    if (C21923.f70183 != 0) {
                        iM6981 = C2105.m6981("ۡۛ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 18167) ^ 1344063881;
                        i5 = -1084330225;
                    } else {
                        iM6981 = C0630.m2566("֡᩷") ^ i2;
                        i4 = ((iM6981 ^ i3) * 19329) ^ (-23976172);
                        i5 = -1743741135;
                    }
                    break;
                case -318853275:
                case -101016982:
                    C1504.m5179();
                    C1916.m6308();
                    break;
                case -307945734:
                case 1896458057:
                    if (c16475.f50648) {
                        iM6981 = C0630.m2566("ۜ᩵") ^ i3;
                        i4 = ((iM6981 ^ i2) * 3169) ^ 577348606;
                        i5 = -699834226;
                    } else {
                        iM6981 = C2105.m6981("᩻۬") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-14993)) ^ 1767919112;
                        i5 = 237019453;
                    }
                    break;
                case -252554921:
                case 259908957:
                    if (c16475.f50644) {
                        iM6981 = C0630.m2566("᩻ۜ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 16667) ^ (-505585937);
                        i5 = -1110167918;
                    } else {
                        iM6981 = C2105.m6981("᩻۬") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-14993)) ^ 1767919112;
                        i5 = 237019453;
                    }
                    break;
                case -74101555:
                case 1875466049:
                    break;
                case 166510871:
                case 1855243903:
                    if (C3537.f11231 >= 0) {
                        iM6981 = C2105.m6981("ۡۛ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 18167) ^ 1344063881;
                        i5 = -1084330225;
                    } else {
                        iM6981 = (C0630.m2566("۫ۛ") ^ i3) * 127;
                        i4 = ((iM6981 ^ i2) * (-12043)) ^ 1101648824;
                        i5 = -28906294;
                    }
                    break;
                case 562817639:
                case 921433528:
                    if (C2272.m7503()) {
                        iM6981 = C0630.m2566("֡᩷") ^ i2;
                        i4 = ((iM6981 ^ i3) * 19329) ^ (-23976172);
                        i5 = -1743741135;
                    } else {
                        iM6981 = (i3 - C0630.m2566("᩺᩺")) * 77;
                        i4 = ((iM6981 ^ i2) * (-6059)) ^ (-167783003);
                        i5 = -1916281015;
                    }
                    break;
                case 933407487:
                case 1289029155:
                    if (RunnableC1937.m6387() != 0) {
                        iM6981 = C0630.m2566("֡᩷") ^ i2;
                        i4 = ((iM6981 ^ i3) * 19329) ^ (-23976172);
                        i5 = -1743741135;
                    } else {
                        iM6981 = (C0630.m2566("ۛ᩻") ^ i2) * (-13);
                        i4 = ((iM6981 ^ i3) * (-14505)) ^ 422340142;
                        i5 = 838322319;
                    }
                    break;
                case 1128888310:
                case 1362046920:
                    ServiceConnectionC3453.m10564();
                    if (C2105.f7037 == 0) {
                        iM6981 = C2105.m6981("ۡۛ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 18167) ^ 1344063881;
                        i5 = -1084330225;
                    } else {
                        iM6981 = (C0630.m2566("ܽ֫") ^ i2) * (-95);
                        i4 = ((iM6981 ^ i3) * (-16301)) ^ (-1435072337);
                        i5 = -926271509;
                    }
                    break;
                case 1423878372:
                case 2144542162:
                    if (C3911.m11924() <= 0) {
                        iM6981 = (C2105.m6981("᩺۠") ^ i3) * (-115);
                        i4 = ((iM6981 ^ i2) * (-5265)) ^ (-140327814);
                        i5 = 1256513050;
                    } else {
                        iM6981 = C0630.m2566("ܽۤ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 29153) ^ 179055414;
                        i5 = -1205504341;
                    }
                    break;
                default:
                    if (C4075.f12947 >= 0) {
                        iM6981 = C0630.m2566("ܶ۫") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-31533)) ^ 129186550;
                        i5 = 818218000;
                    } else {
                        iM6981 = C0630.m2566("ۘ᩷") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-9911)) ^ (-1547296546);
                        i5 = 286890656;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0300 A[PHI: r4 r6 r8 r17 r20 r25 r26
      0x0300: PHI (r4v7 l.᩺ᩳۢ) = (r4v2 l.᩺ᩳۢ), (r4v2 l.᩺ᩳۢ), (r4v3 l.᩺ᩳۢ), (r4v2 l.᩺ᩳۢ) binds: [B:78:0x02fe, B:70:0x02a3, B:40:0x014a, B:18:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x0300: PHI (r6v7 l.ۗۜ) = (r6v2 l.ۗۜ), (r6v2 l.ۗۜ), (r6v3 l.ۗۜ), (r6v2 l.ۗۜ) binds: [B:78:0x02fe, B:70:0x02a3, B:40:0x014a, B:18:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x0300: PHI (r8v27 short[]) = (r8v2 short[]), (r8v2 short[]), (r8v6 short[]), (r8v2 short[]) binds: [B:78:0x02fe, B:70:0x02a3, B:40:0x014a, B:18:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x0300: PHI (r17v7 char) = (r17v4 char), (r17v3 char), (r17v3 char), (r17v3 char) binds: [B:78:0x02fe, B:70:0x02a3, B:40:0x014a, B:18:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x0300: PHI (r20v7 int) = (r20v3 int), (r20v4 int), (r20v3 int), (r20v3 int) binds: [B:78:0x02fe, B:70:0x02a3, B:40:0x014a, B:18:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x0300: PHI (r25v8 int) = (r25v4 int), (r25v5 int), (r25v4 int), (r25v4 int) binds: [B:78:0x02fe, B:70:0x02a3, B:40:0x014a, B:18:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x0300: PHI (r26v6 int) = (r26v2 int), (r26v3 int), (r26v2 int), (r26v2 int) binds: [B:78:0x02fe, B:70:0x02a3, B:40:0x014a, B:18:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38786(C16475 c16475, View view) {
        int iM6981;
        int i;
        int iM2566;
        int i2;
        int i3;
        short[] sArr;
        int iM2567;
        int i4;
        int i5;
        String strM38819;
        final C16475 c16476 = c16475;
        boolean z = false;
        String strM46589 = null;
        final C23155 c23155 = null;
        String str = null;
        C3060 c3060M48304 = null;
        int iM2568 = 0;
        int i6 = 0;
        int i7 = -2018943975;
        int i8 = C3432.f10845;
        int i9 = C7811.f24123;
        int iM2569 = (C0630.m2566("ᩳܺ") ^ i9) * q.h;
        int i10 = ((iM2569 ^ i8) * 7173) ^ 1046768088;
        int i11 = iM2569 ^ 1882362210;
        short[] sArr2 = null;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        C21282 c21282 = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        short[] sArr3 = null;
        short[] sArr4 = null;
        while (true) {
            short[] sArr5 = sArr3;
            while (true) {
                i7 = i11 ^ (i10 & (((i7 ^ i8) * 8795) >> 31));
                switch (i7) {
                    case -2044717814:
                    case 92057934:
                        i15 = s * s2;
                        i16 = s * s;
                        i17 = 316590849;
                        if (C0422.f1886 <= 0) {
                            iM6981 = C2105.m6981("ᩴۜ") ^ i8;
                            i10 = ((iM6981 ^ i9) * (-15917)) ^ 497866353;
                            i = 1007686001;
                        } else {
                            iM6981 = (C2105.m6981("ۡۤ") + i8) * 83;
                            i10 = ((iM6981 ^ i9) * 23767) ^ (-389870883);
                            i = 2061161197;
                        }
                        i11 = iM6981 ^ i;
                        c16476 = c16475;
                        break;
                    case -2027392931:
                    case -1615802624:
                        s = sArr4[c];
                        s2 = 35586;
                        if (C1128.m3851() <= 0) {
                            iM6981 = C0630.m2566("ۧۜ") ^ i9;
                            i10 = ((iM6981 ^ i8) * 23493) ^ (-60632485);
                            i = -827448960;
                        } else {
                            iM6981 = (C0630.m2566("۫ۤ") + i9) * (-99);
                            i10 = ((iM6981 ^ i8) * 11047) ^ (-197947780);
                            i = -1448212182;
                        }
                        i11 = iM6981 ^ i;
                        c16476 = c16475;
                        break;
                    case -2021189876:
                    case 904996351:
                        sArr = sArr5;
                        int i18 = 2119978475 ^ iM2568;
                        C0630.m2573(c3060M48304, z ? 1 : 0, i18, z ? 1 : 0, i18);
                        if (C2958.f9394 < 0) {
                            c21282.m48302(new InterfaceC14930() { // from class: l.ۙ᩻ۢ
                                @Override // l.InterfaceC14930
                                public final boolean onMenuItemClick(MenuItem menuItem) {
                                    C16475.m38794(this.f15671, c23155, menuItem);
                                    return true;
                                }
                            });
                            c21282.m48305();
                        }
                        sArr5 = sArr;
                        iM6981 = C0630.m2566("ۧۜ") ^ i9;
                        i10 = ((iM6981 ^ i8) * 23493) ^ (-60632485);
                        i = -827448960;
                        i11 = iM6981 ^ i;
                        c16476 = c16475;
                        break;
                    case -1983305630:
                    case 926331885:
                        Context contextRequireContext = c16475.requireContext();
                        z = false;
                        if (AbstractC2021.f6743 <= 0) {
                            int iM25610 = (i9 - C0630.m2566("ۛۘ")) * 99;
                            i11 = iM25610 ^ 539530376;
                            i10 = ((iM25610 ^ i8) * 8507) ^ (-1978903884);
                            c21282 = null;
                        } else {
                            c21282 = new C21282(contextRequireContext, view, 0);
                            strM46589 = c16476.f50655.m46589();
                            if (strM46589 != null) {
                                int iM6982 = C2105.m6981("ۛۨ") ^ i8;
                                i11 = iM6982 ^ (-1643287656);
                                i10 = ((iM6982 ^ i9) * (-31311)) ^ (-1769655719);
                                z = false;
                            } else {
                                z = false;
                                int iM25611 = (C0630.m2566("۬ۡ") ^ i8) * 73;
                                i11 = iM25611 ^ 1224462808;
                                i10 = ((iM25611 ^ i9) * (-8843)) ^ 1247677104;
                                c16476 = c16475;
                            }
                        }
                        break;
                    case -1942090290:
                    case -1851712347:
                        strM38819 = C15472.m36561(1, 1, strM46589);
                        str = strM38819;
                        iM2566 = (i9 - C0630.m2566("۬ۤ")) * 97;
                        i2 = ((iM2566 ^ i8) * (-32119)) ^ 1149230292;
                        i3 = -228337141;
                        i11 = iM2566 ^ i3;
                        i10 = i2;
                        break;
                    case -1901096428:
                    case 833267872:
                        c = 4;
                        if (C2105.f7037 != 0) {
                            iM6981 = C2105.m6981("ᩴۜ") ^ i8;
                            i10 = ((iM6981 ^ i9) * (-15917)) ^ 497866353;
                            i = 1007686001;
                        } else {
                            iM6981 = C2105.m6981("ܺ᩶") ^ i9;
                            i10 = ((iM6981 ^ i8) * 17591) ^ 826288840;
                            i = 920145766;
                        }
                        i11 = iM6981 ^ i;
                        c16476 = c16475;
                        break;
                    case -1884200400:
                    case -151288486:
                        if (C0714.f2697 < 0) {
                            iM2566 = C0630.m2566("᩻ܿ") ^ i8;
                            i2 = ((iM2566 ^ i9) * (-25813)) ^ 1061086161;
                            i3 = -1999555646;
                            i11 = iM2566 ^ i3;
                            i10 = i2;
                        } else {
                            int iM25612 = (i9 - C0630.m2566("ۛۘ")) * 99;
                            i11 = iM25612 ^ 539530376;
                            i10 = ((iM25612 ^ i8) * 8507) ^ (-1978903884);
                            c21282 = null;
                        }
                        break;
                    case -1810782846:
                    case 205177522:
                        sArr4 = f50637;
                        if (C3911.f12484 >= 0) {
                            iM6981 = C2105.m6981("۬֫") ^ i9;
                            i10 = ((iM6981 ^ i8) * (-7271)) ^ 1772254906;
                            i = 1191943202;
                        } else {
                            iM6981 = (C2105.m6981("֡᩺") + i8) * 33;
                            i10 = ((iM6981 ^ i9) * (-6201)) ^ 1751847710;
                            i = -652854699;
                        }
                        i11 = iM6981 ^ i;
                        c16476 = c16475;
                        break;
                    case -1794551220:
                    case -66073855:
                        sArr = sArr5;
                        if (!C3746.m11370(strM46589, C3911.m11919(f50637, 9, 1, i6))) {
                            sArr5 = sArr;
                            int iM25613 = (C0630.m2566("۬ۡ") ^ i8) * 73;
                            i11 = iM25613 ^ 1224462808;
                            i10 = ((iM25613 ^ i9) * (-8843)) ^ 1247677104;
                            c16476 = c16475;
                        } else {
                            iM2567 = (i8 - C2105.m6981("ܶۘ")) * 87;
                            i4 = ((iM2567 ^ i9) * 7697) ^ 1849655734;
                            i5 = 406696943;
                        }
                        break;
                    case -1789192600:
                    case -1030473736:
                        if (!C4616.m13554(strM46589, C2520.m8030(sArr5, i12, i13, i6))) {
                            int iM25614 = (C0630.m2566("۬ۡ") ^ i8) * 73;
                            i11 = iM25614 ^ 1224462808;
                            i10 = ((iM25614 ^ i9) * (-8843)) ^ 1247677104;
                            c16476 = c16475;
                        } else {
                            iM2566 = C0630.m2566("۫ۙ") ^ i9;
                            i2 = ((iM2566 ^ i8) * (-1705)) ^ 45772922;
                            i3 = 620317253;
                            i11 = iM2566 ^ i3;
                            i10 = i2;
                        }
                        break;
                    case -1719333020:
                    case 809361999:
                        sArr = sArr5;
                        c23155 = new C23155(c21282, str, z);
                        c3060M48304 = c21282.m48304();
                        if (C3019.f9544 < 0) {
                            iM2567 = (C0630.m2566("ۤۤ") ^ i8) * 3;
                            i4 = ((iM2567 ^ i9) * 14709) ^ (-1447809961);
                            i5 = 1662795856;
                        } else {
                            sArr5 = sArr;
                            iM6981 = C2105.m6981("ᩴۜ") ^ i8;
                            i10 = ((iM6981 ^ i9) * (-15917)) ^ 497866353;
                            i = 1007686001;
                            i11 = iM6981 ^ i;
                            c16476 = c16475;
                        }
                        break;
                    case -1397690286:
                    case 1071851284:
                        sArr = sArr5;
                        iM2568 = C0630.m2566(C1294.m4373(sArr2, i14, 3, i6));
                        if (C4159.f13567) {
                            iM2567 = C0630.m2566("ۖۡ") ^ i8;
                            i4 = ((iM2567 ^ i9) * 18873) ^ 318663799;
                            i5 = 848533231;
                        }
                        sArr5 = sArr;
                        iM6981 = C0630.m2566("ۧۜ") ^ i9;
                        i10 = ((iM6981 ^ i8) * 23493) ^ (-60632485);
                        i = -827448960;
                        i11 = iM6981 ^ i;
                        c16476 = c16475;
                        break;
                    case -1053255579:
                    case 888778908:
                        i6 = 24268;
                        iM6981 = (C2105.m6981("ۗۛ") ^ i9) * 25;
                        i10 = ((iM6981 ^ i8) * (-11613)) ^ (-298655066);
                        i = 1464182022;
                        i11 = iM6981 ^ i;
                        c16476 = c16475;
                        break;
                    case -818266180:
                    case 268478235:
                        if (i15 - (i16 + i17) > 0) {
                            iM6981 = (i8 - C2105.m6981("֫ܺ")) * 39;
                            i10 = ((iM6981 ^ i9) * (-12869)) ^ 1329989271;
                            i = -897143963;
                        } else {
                            iM6981 = (C2105.m6981("֨ۜ") ^ i9) * q.h;
                            i10 = ((iM6981 ^ i8) * (-31431)) ^ 292068014;
                            i = 592496450;
                        }
                        i11 = iM6981 ^ i;
                        c16476 = c16475;
                        break;
                    case -498634608:
                    case -269491722:
                        C3245.m9925();
                        C5695.m16023();
                        iM6981 = C2105.m6981("ᩴۜ") ^ i8;
                        i10 = ((iM6981 ^ i9) * (-15917)) ^ 497866353;
                        i = 1007686001;
                        i11 = iM6981 ^ i;
                        c16476 = c16475;
                        break;
                    case -366902947:
                    case 1334009927:
                        strM38819 = c16475.m38819();
                        str = strM38819;
                        iM2566 = (i9 - C0630.m2566("۬ۤ")) * 97;
                        i2 = ((iM2566 ^ i8) * (-32119)) ^ 1149230292;
                        i3 = -228337141;
                        i11 = iM2566 ^ i3;
                        i10 = i2;
                        break;
                    case 154606054:
                    case 723119069:
                        sArr5 = f50637;
                        i12 = 5;
                        i13 = 1;
                        if (C0483.f2088 < 0) {
                            iM2566 = (C0630.m2566("֨ᩳ") ^ i9) * 77;
                            i2 = ((iM2566 ^ i8) * (-10997)) ^ 1032004780;
                            i3 = 1202188772;
                            i11 = iM2566 ^ i3;
                            i10 = i2;
                        } else {
                            int iM25615 = (i9 - C0630.m2566("ۛۘ")) * 99;
                            i11 = iM25615 ^ 539530376;
                            i10 = ((iM25615 ^ i8) * 8507) ^ (-1978903884);
                            c21282 = null;
                        }
                        break;
                    case 1036408014:
                    case 1830296710:
                        C1711.m5736();
                        if (!C1005.m3501()) {
                            iM6981 = C2105.m6981("ᩴۜ") ^ i8;
                            i10 = ((iM6981 ^ i9) * (-15917)) ^ 497866353;
                            i = 1007686001;
                            i11 = iM6981 ^ i;
                            c16476 = c16475;
                        } else {
                            int iM25616 = (i9 - C0630.m2566("ۛۘ")) * 99;
                            i11 = iM25616 ^ 539530376;
                            i10 = ((iM25616 ^ i8) * 8507) ^ (-1978903884);
                            c21282 = null;
                        }
                        break;
                    case 1323906996:
                    case 2082592424:
                        sArr = sArr5;
                        sArr2 = f50637;
                        i14 = 6;
                        if (C1916.m6308() < 0) {
                            iM2567 = C0630.m2566("۟۟") ^ i9;
                            i4 = ((iM2567 ^ i8) * 11311) ^ (-1299280377);
                            i5 = -1911342669;
                        } else {
                            sArr5 = sArr;
                            iM6981 = C2105.m6981("۬֫") ^ i9;
                            i10 = ((iM6981 ^ i8) * (-7271)) ^ 1772254906;
                            i = 1191943202;
                            i11 = iM6981 ^ i;
                            c16476 = c16475;
                        }
                        break;
                    case 1601744842:
                    case 1981334821:
                        i6 = 2809;
                        iM6981 = (C2105.m6981("ۗۛ") ^ i9) * 25;
                        i10 = ((iM6981 ^ i8) * (-11613)) ^ (-298655066);
                        i = 1464182022;
                        i11 = iM6981 ^ i;
                        c16476 = c16475;
                        break;
                    case 1684249963:
                    case 2136881170:
                        if (!C1504.f5354) {
                            int iM25617 = (i9 - C0630.m2566("ۛۘ")) * 99;
                            i11 = iM25617 ^ 539530376;
                            i10 = ((iM25617 ^ i8) * 8507) ^ (-1978903884);
                            c21282 = null;
                        } else {
                            iM6981 = C2105.m6981("۬֫") ^ i9;
                            i10 = ((iM6981 ^ i8) * (-7271)) ^ 1772254906;
                            i = 1191943202;
                            i11 = iM6981 ^ i;
                            c16476 = c16475;
                        }
                        break;
                    default:
                        C2272.m7503();
                        C1128.m3851();
                        break;
                }
                return;
            }
            sArr3 = sArr;
            i11 = iM2567 ^ i5;
            i10 = i4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d3 A[PHI: r3 r4 r12
      0x00d3: PHI (r3v5 java.lang.Class<l.۫ۛ᩷>) = (r3v4 java.lang.Class<l.۫ۛ᩷>), (r3v2 java.lang.Class<l.۫ۛ᩷>), (r3v2 java.lang.Class<l.۫ۛ᩷>) binds: [B:39:0x00d1, B:32:0x00a5, B:13:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x00d3: PHI (r4v4 l.ۚܺ֫) = (r4v2 l.ۚܺ֫), (r4v3 l.ۚܺ֫), (r4v2 l.ۚܺ֫) binds: [B:39:0x00d1, B:32:0x00a5, B:13:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x00d3: PHI (r12v5 l.ۙܺ֫) = (r12v2 l.ۙܺ֫), (r12v1 l.ۙܺ֫), (r12v1 l.ۙܺ֫) binds: [B:39:0x00d1, B:32:0x00a5, B:13:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x010c A[PHI: r1
      0x010c: PHI (r1v7 l.ۘۛ᩷) = (r1v5 l.ۘۛ᩷), (r1v2 l.ۘۛ᩷), (r1v2 l.ۘۛ᩷), (r1v2 l.ۘۛ᩷), (r1v2 l.ۘۛ᩷) binds: [B:43:0x010a, B:18:0x004b, B:13:0x0041, B:10:0x0039, B:78:0x010c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x0176  */
    @Override // l.AbstractC14346, l.ComponentCallbacksC9205
    public final void onCreate(Bundle bundle) {
        int iM6981;
        int i;
        C3764 c3764 = null;
        Class<C12230> cls = null;
        AbstractC5447 abstractC5447M13885 = null;
        C16146 c16146 = null;
        int i2 = 1147523704;
        int i3 = C2520.f8000;
        int i4 = C7811.f24123;
        int iM2566 = (C0630.m2566("ۢᩴ") + i3) * 61;
        int i5 = ((iM2566 ^ i4) * 24133) ^ (-1912143379);
        int i6 = iM2566 ^ 183044035;
        C4741 c4741 = null;
        while (true) {
            C4741 c4742 = null;
            while (true) {
                i2 = ((((i2 ^ i4) * (-18249)) >> 31) & i5) ^ i6;
                switch (i2) {
                    case -1904943512:
                    case -416931818:
                        C4117.m12364();
                        C11340.m28031();
                        iM6981 = C0630.m2566("᩻ܺ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-2715)) ^ 1412207748;
                        i = 1541718846;
                        i6 = iM6981 ^ i;
                        break;
                    case -1853509880:
                    case 1171707118:
                        this.f50653 = c3764;
                        if (C7106.f21815 == 0) {
                            c4742 = new C4741(C3683.m11214(this));
                            cls = C12230.class;
                            if (C2958.f9394 >= 0) {
                                iM6981 = (C2105.m6981("᩶ܰ") + i3) * 81;
                                i5 = ((iM6981 ^ i4) * 19327) ^ (-124834477);
                                i = -1683470740;
                            } else {
                                iM6981 = (i3 - C2105.m6981("۟۬")) * 73;
                                i5 = ((iM6981 ^ i4) * (-2399)) ^ (-1679607263);
                                i = -759001194;
                            }
                            i6 = iM6981 ^ i;
                        }
                        break;
                    case -1778281515:
                    case -853012729:
                        if (!C1711.f5919) {
                            c4741 = new C4741(RunnableC0588.m2429(this));
                            if (C5695.m16023() < 0) {
                                iM6981 = C2105.m6981("᩸ۤ") ^ i3;
                                i5 = ((iM6981 ^ i4) * (-16735)) ^ (-950567126);
                                i = 856603413;
                                i6 = iM6981 ^ i;
                                break;
                            }
                        }
                        int iM6982 = (C2105.m6981("֨᩸") + i3) * (-39);
                        i5 = ((iM6982 ^ i4) * 30613) ^ 1931246849;
                        i6 = iM6982 ^ 1591778450;
                        c4741 = null;
                        break;
                    case -1417579966:
                    case 399956230:
                        if (!C4159.f13567) {
                            iM6981 = C0630.m2566("᩻ܺ") ^ i4;
                            i5 = ((iM6981 ^ i3) * (-2715)) ^ 1412207748;
                            i = 1541718846;
                            i6 = iM6981 ^ i;
                        } else {
                            int iM6983 = (C2105.m6981("֨᩸") + i3) * (-39);
                            i5 = ((iM6983 ^ i4) * 30613) ^ 1931246849;
                            i6 = iM6983 ^ 1591778450;
                            c4741 = null;
                        }
                        break;
                    case -1366125845:
                    case -756321971:
                        c16146 = new C16146(7, this);
                        if (!C2272.f7362) {
                            iM6981 = C2105.m6981("ۚۢ") ^ i4;
                            i5 = ((iM6981 ^ i3) * (-18091)) ^ (-1027081728);
                            i = -628136608;
                            i6 = iM6981 ^ i;
                        } else {
                            int iM6984 = (C2105.m6981("֨᩸") + i3) * (-39);
                            i5 = ((iM6984 ^ i4) * 30613) ^ 1931246849;
                            i6 = iM6984 ^ 1591778450;
                            c4741 = null;
                        }
                        break;
                    case -1196865491:
                    case 1261613272:
                        c3764 = (C3764) c4741.m13885(C3764.class);
                        if (C4263.f13799 <= 0) {
                            iM6981 = C0630.m2566("᩻ܺ") ^ i4;
                            i5 = ((iM6981 ^ i3) * (-2715)) ^ 1412207748;
                            i = 1541718846;
                        } else {
                            iM6981 = (i4 - C0630.m2566("ۛᩴ")) * 127;
                            i5 = ((iM6981 ^ i3) * (-20487)) ^ (-1345746352);
                            i = -729874502;
                        }
                        i6 = iM6981 ^ i;
                        break;
                    case -911738223:
                    case 1816332253:
                        if (C7811.f24123 < 0) {
                            iM6981 = C0630.m2566("᩻ܺ") ^ i4;
                            i5 = ((iM6981 ^ i3) * (-2715)) ^ 1412207748;
                            i = 1541718846;
                        } else {
                            iM6981 = C0630.m2566("ܽܺ") ^ i4;
                            i5 = ((iM6981 ^ i3) * (-22737)) ^ (-1211487743);
                            i = -978348537;
                        }
                        i6 = iM6981 ^ i;
                        break;
                    case -775108128:
                    case 1051525307:
                        this.f50657 = (C12230) abstractC5447M13885;
                        if (!C2126.m7040()) {
                            iM6981 = C2105.m6981("۫᩶") ^ i3;
                            i5 = ((iM6981 ^ i4) * 12185) ^ 185971358;
                            i = 1498368498;
                            i6 = iM6981 ^ i;
                        }
                        break;
                    case -430008336:
                    case 58517193:
                        abstractC5447M13885 = c4742.m13885(cls);
                        if (C4117.f13076 <= 0) {
                            iM6981 = (C2105.m6981("᩶ܰ") + i3) * 81;
                            i5 = ((iM6981 ^ i4) * 19327) ^ (-124834477);
                            i = -1683470740;
                        } else {
                            iM6981 = C2105.m6981("ۡۖ") ^ i4;
                            i5 = ((iM6981 ^ i3) * 10815) ^ (-1437883103);
                            i = 1614598322;
                        }
                        i6 = iM6981 ^ i;
                        break;
                    case -367576474:
                    case -76448930:
                        C1773.m5908();
                        break;
                    case -326471027:
                    case 1284892365:
                        if (C0798.m2998() == 0) {
                            iM6981 = C2105.m6981("ۗۧ") ^ i4;
                            i5 = ((iM6981 ^ i3) * 6401) ^ 1437653608;
                            i = -1722140725;
                            i6 = iM6981 ^ i;
                        }
                        break;
                    case -207737650:
                    case 1952429277:
                        if (C0483.m2121()) {
                            iM6981 = (C2105.m6981("᩶ܰ") + i3) * 81;
                            i5 = ((iM6981 ^ i4) * 19327) ^ (-124834477);
                            i = -1683470740;
                        } else {
                            iM6981 = C0630.m2566("᩻ܺ") ^ i4;
                            i5 = ((iM6981 ^ i3) * (-2715)) ^ 1412207748;
                            i = 1541718846;
                        }
                        i6 = iM6981 ^ i;
                        break;
                    case 1803516783:
                    case 2131717720:
                        this.f50658 = C19492.m44903(this, c16146);
                        break;
                    default:
                        super.onCreate(bundle);
                        if (C0798.f2919) {
                            iM6981 = C0630.m2566("ܽܺ") ^ i4;
                            i5 = ((iM6981 ^ i3) * (-22737)) ^ (-1211487743);
                            i = -978348537;
                        } else {
                            iM6981 = C0630.m2566("᩻᩸") ^ i3;
                            i5 = ((iM6981 ^ i4) * 24543) ^ 1756639008;
                            i = 1183811598;
                        }
                        i6 = iM6981 ^ i;
                        break;
                }
                return;
            }
            int iM2567 = (C0630.m2566("ۗۙ") + i4) * q.h;
            i5 = ((iM2567 ^ i3) * 12229) ^ 332723225;
            i6 = iM2567 ^ (-1900530728);
        }
    }

    @Override // l.AbstractC14346, l.ComponentCallbacksC9205
    public final void onSaveInstanceState(Bundle bundle) {
        InterfaceC18581 interfaceC18581Mo17431 = null;
        int i = 2052675248;
        int i2 = C4616.f14690;
        int i3 = C3746.f11829;
        int iM2566 = C0630.m2566("ۘ᩷") ^ i3;
        int i4 = ((iM2566 ^ i2) * 10515) ^ (-1226446582);
        int i5 = -2109095806;
        while (true) {
            i = ((((i ^ i2) * (-13093)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -1917452126:
                case 566898917:
                    break;
                case -1761873310:
                case 1634785537:
                    C10832 c10832 = (C10832) interfaceC18581Mo17431;
                    c10832.mo9498();
                    c10832.mo9497();
                    iM2566 = (i2 - C0630.m2566("ۛܳ")) * 15;
                    i4 = ((iM2566 ^ i3) * 6577) ^ 1524803274;
                    i5 = -918344230;
                    break;
                case -1727063746:
                case 994821326:
                    if (C4616.f14690 <= 0) {
                        iM2566 = C0630.m2566("᩵ۘ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 32631) ^ 445120315;
                        i5 = 1759381837;
                    } else {
                        iM2566 = (i2 - C0630.m2566("ܰۖ")) * (-29);
                        i4 = ((iM2566 ^ i3) * (-17071)) ^ (-294613898);
                        i5 = -1611319440;
                    }
                    break;
                case -1615143651:
                case -144054081:
                    if (RunnableC1108.f4040) {
                        iM2566 = C2105.m6981("᩸ۡ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-12517)) ^ (-692763978);
                        i5 = 909594639;
                    } else {
                        iM2566 = (i3 - C2105.m6981("۫۬")) * (-51);
                        i4 = ((iM2566 ^ i2) * (-23573)) ^ (-567462822);
                        i5 = -18419867;
                    }
                    break;
                case -1224483485:
                case 1507384535:
                    if (C3432.f10845 >= 0) {
                        iM2566 = (i3 - C2105.m6981("ۜ۟")) * 59;
                        i4 = ((iM2566 ^ i2) * (-1989)) ^ 81289336;
                        i5 = -1621003318;
                    } else {
                        iM2566 = (C0630.m2566("᩹ۖ") + i2) * (-15);
                        i4 = ((iM2566 ^ i3) * (-11461)) ^ 1827705001;
                        i5 = -300757102;
                    }
                    break;
                case -1128158474:
                case 746604124:
                    C1294.m4372();
                    ViewOnClickListenerC1958.m6429();
                    iM2566 = C0630.m2566("ܺܶ") ^ i2;
                    i4 = ((iM2566 ^ i3) * (-11279)) ^ 1254613200;
                    i5 = -579637611;
                    break;
                case -1052205972:
                case 1149482804:
                    RunnableC0588.m2441();
                    if (C7811.m20844() != 0) {
                        iM2566 = C0630.m2566("᩵ۘ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 32631) ^ 445120315;
                        i5 = 1759381837;
                    } else {
                        iM2566 = C0630.m2566("ܺܶ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-11279)) ^ 1254613200;
                        i5 = -579637611;
                    }
                    break;
                case -809337865:
                case 2080668625:
                    if (C22628.f73083 <= 0) {
                        iM2566 = C0630.m2566("ܺܶ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-11279)) ^ 1254613200;
                        i5 = -579637611;
                    } else {
                        iM2566 = C0630.m2566("۠᩻") ^ i2;
                        i4 = ((iM2566 ^ i3) * 17031) ^ (-761658262);
                        i5 = -403460809;
                    }
                    break;
                case -568636396:
                case 277853606:
                    super.onSaveInstanceState(bundle);
                    interfaceC18581Mo17431 = mo17431();
                    if (interfaceC18581Mo17431 != null) {
                        iM2566 = (i3 - C0630.m2566("ۡۗ")) * (-51);
                        i4 = ((iM2566 ^ i2) * (-17743)) ^ (-768878736);
                        i5 = -476935230;
                    } else {
                        iM2566 = (i2 - C0630.m2566("ۛܳ")) * 15;
                        i4 = ((iM2566 ^ i3) * 6577) ^ 1524803274;
                        i5 = -918344230;
                    }
                    break;
                case -556715972:
                case -460298504:
                    if (RunnableC0588.m2441() >= 0) {
                        iM2566 = (i3 - C2105.m6981("ۜ۟")) * 59;
                        i4 = ((iM2566 ^ i2) * (-1989)) ^ 81289336;
                        i5 = -1621003318;
                    } else {
                        iM2566 = C0630.m2566("ܺۡ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-6325)) ^ 710087988;
                        i5 = 1465119425;
                    }
                    break;
                case -101416826:
                case 1808622079:
                    if (C1128.m3851() <= 0) {
                        iM2566 = (i3 - C2105.m6981("۫۬")) * (-51);
                        i4 = ((iM2566 ^ i2) * (-23573)) ^ (-567462822);
                        i5 = -18419867;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ܿۖ")) * 101;
                        i4 = ((iM2566 ^ i2) * 8227) ^ (-51866352);
                        i5 = 216313211;
                    }
                    break;
                case -70756503:
                case -3890128:
                    C1420.m4913();
                    break;
                case 52756350:
                case 262617683:
                    if (C1711.m5736() <= 0) {
                        iM2566 = C0630.m2566("᩵ۘ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 32631) ^ 445120315;
                        i5 = 1759381837;
                    } else {
                        iM2566 = C2105.m6981("۟ܿ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 15) ^ 1476115090;
                        i5 = -1624435677;
                    }
                    break;
                case 173721352:
                case 1665918117:
                    if (RunnableC1108.f4040) {
                        iM2566 = C0630.m2566("ܳᩳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 16283) ^ (-1756390025);
                        i5 = -1078706594;
                    } else {
                        iM2566 = C0630.m2566("᩵ۘ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 32631) ^ 445120315;
                        i5 = 1759381837;
                    }
                    break;
                case 235174571:
                case 1993265978:
                    C3746.m11369();
                    if (RunnableC0588.m2441() < 0) {
                        iM2566 = (i3 - C2105.m6981("ۜ۟")) * 59;
                        i4 = ((iM2566 ^ i2) * (-1989)) ^ 81289336;
                        i5 = -1621003318;
                    } else {
                        iM2566 = C0630.m2566("ܺܶ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-11279)) ^ 1254613200;
                        i5 = -579637611;
                    }
                    break;
                case 786999354:
                case 1483914559:
                    if (C2958.f9394 >= 0) {
                        iM2566 = C0630.m2566("᩵ۘ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 32631) ^ 445120315;
                        i5 = 1759381837;
                    } else {
                        iM2566 = C0630.m2566("᩺ۙ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 1205) ^ 1658298159;
                        i5 = 1820374130;
                    }
                    break;
                case 1685047556:
                case 1911081702:
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = C0630.m2566("ܺܶ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-11279)) ^ 1254613200;
                        i5 = -579637611;
                    } else {
                        iM2566 = C2105.m6981("᩸ۧ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-9903)) ^ (-1822781474);
                        i5 = 1057140573;
                    }
                    break;
                default:
                    if (C1047.f3863 >= 0) {
                        iM2566 = C0630.m2566("ܺܶ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-11279)) ^ 1254613200;
                        i5 = -579637611;
                    } else {
                        iM2566 = C2105.m6981("ᩴ۫") ^ i3;
                        i4 = ((iM2566 ^ i2) * 7371) ^ (-893315197);
                        i5 = 1051250477;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x02b2 A[PHI: r20
      0x02b2: PHI (r20v18 short) = (r20v12 short), (r20v13 short), (r20v19 short) binds: [B:73:0x02b0, B:69:0x0293, B:9:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.ComponentCallbacksC9205
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int iM6981;
        int i;
        int i2;
        View viewM40367;
        short s;
        int iM6982;
        int i3;
        int iM6983;
        int i4;
        short s2;
        int i5;
        final C16475 c16475 = this;
        int i6 = C3537.f11231;
        int i7 = C5695.f17556;
        int iM2566 = (i6 - C0630.m2566("ۖᩴ")) * (-49);
        int i8 = ((iM2566 ^ i7) * (-8115)) ^ 1559758390;
        View view = null;
        short[] sArr = null;
        int i9 = iM2566 ^ 85298813;
        int i10 = 0;
        final AtomicBoolean atomicBoolean = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 882797369;
        short s3 = 0;
        int i15 = 0;
        InterfaceC23586 viewLifecycleOwner = null;
        RunnableC14240 runnableC14240 = null;
        C5242 c5242 = null;
        ActivityC17169 activityC17169 = null;
        long j = 0;
        while (true) {
            i14 = i9 ^ (i8 & (((i14 ^ i7) * 19181) >> 31));
            switch (i14) {
                case -1959728419:
                case -700497463:
                    runnableC14240 = new RunnableC14240(2, c16475);
                    j = 600;
                    if (ServiceConnectionC3453.f10921 < 0) {
                        iM6981 = C0630.m2566("᩹ܰ") ^ i7;
                        i = ((iM6981 ^ i6) * (-22203)) ^ 2048533737;
                        i2 = 503670679;
                        i9 = iM6981 ^ i2;
                        i8 = i;
                    } else {
                        s = s3;
                        int iM2567 = (i7 - C0630.m2566("ܿۤ")) * 73;
                        i8 = ((iM2567 ^ i6) * 11699) ^ (-1346518131);
                        i5 = iM2567 ^ (-736257941);
                        atomicBoolean = null;
                        s3 = s;
                        i9 = i5;
                        c16475 = this;
                    }
                    break;
                case -1700439660:
                case 1703319381:
                    activityC17169 = (ActivityC17169) C3683.m11214(this);
                    sArr = f50637;
                    if (C3019.m9255() > 0) {
                        iM6981 = (i7 - C2105.m6981("ۤܳ")) * (-63);
                        i = ((iM6981 ^ i6) * (-27311)) ^ (-271268230);
                        i2 = -350093307;
                        i9 = iM6981 ^ i2;
                        i8 = i;
                    } else {
                        iM6983 = C2105.m6981("ۡۚ") ^ i6;
                        i8 = ((iM6983 ^ i7) * 1893) ^ 572616574;
                        i4 = 1852263719;
                        i9 = iM6983 ^ i4;
                        c16475 = this;
                    }
                    break;
                case -1604849143:
                case 1300175806:
                    s3 = f50637[208];
                    if (RunnableC1937.m6387() != 0) {
                        iM6983 = C2105.m6981("ۡۚ") ^ i6;
                        i8 = ((iM6983 ^ i7) * 1893) ^ 572616574;
                        i4 = 1852263719;
                    } else {
                        iM6983 = (C2105.m6981("ᩳܺ") + i6) * (-101);
                        i8 = ((iM6983 ^ i7) * (-28283)) ^ (-2005017927);
                        i4 = 1512096553;
                    }
                    i9 = iM6983 ^ i4;
                    c16475 = this;
                    break;
                case -1529503267:
                case -961800260:
                    i12 = 47574;
                    iM6981 = C0630.m2566("ܺۛ") ^ i6;
                    i = ((iM6981 ^ i7) * 6603) ^ 137256725;
                    i2 = 1260172095;
                    i9 = iM6981 ^ i2;
                    i8 = i;
                    break;
                case -1495157275:
                case 1204042681:
                    i12 = 53338;
                    iM6981 = C0630.m2566("ܺۛ") ^ i6;
                    i = ((iM6981 ^ i7) * 6603) ^ 137256725;
                    i2 = 1260172095;
                    i9 = iM6981 ^ i2;
                    i8 = i;
                    break;
                case -1455947049:
                case 446108482:
                    s2 = s3;
                    int i16 = s2 * 30928;
                    i11 = s2 * s2;
                    if (!C2126.f7087) {
                        int iM6984 = (i7 - C2105.m6981("۬֫")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        s = s2;
                        i8 = ((iM6984 ^ i6) * (-17209)) ^ 1284625408;
                        i5 = iM6984 ^ (-634110732);
                        i15 = i16;
                        s3 = s;
                        i9 = i5;
                        c16475 = this;
                    } else {
                        i15 = i16;
                        int iM2568 = C0630.m2566("᩸ۜ") ^ i7;
                        i9 = iM2568 ^ 428498702;
                        s3 = s2;
                        i8 = ((iM2568 ^ i6) * 17701) ^ (-2114088866);
                        c16475 = this;
                    }
                    break;
                case -1428072100:
                case 1230425074:
                    if ((239135296 + i11) - i15 < 0) {
                        iM6981 = C0630.m2566("᩸ۢ") ^ i7;
                        i = ((iM6981 ^ i6) * 25595) ^ 256674033;
                        i2 = -1427103612;
                    } else {
                        iM6981 = C2105.m6981("۬᩹") ^ i6;
                        i = ((iM6981 ^ i7) * 30995) ^ 1735347793;
                        i2 = 1970035866;
                    }
                    i9 = iM6981 ^ i2;
                    i8 = i;
                    break;
                case -1292118754:
                case -188857283:
                    C2272.m7503();
                    C3911.m11924();
                    iM6981 = C0630.m2566("ۙۢ") ^ i6;
                    i = ((iM6981 ^ i7) * (-2525)) ^ (-1448197710);
                    i2 = -516866932;
                    i9 = iM6981 ^ i2;
                    i8 = i;
                    break;
                case -1090834304:
                case 630690758:
                    ServiceConnectionC3453.m10564();
                    if (C3432.f10845 < 0) {
                        s = s3;
                        int iM2569 = (i7 - C0630.m2566("ܿۤ")) * 73;
                        i8 = ((iM2569 ^ i6) * 11699) ^ (-1346518131);
                        i5 = iM2569 ^ (-736257941);
                        atomicBoolean = null;
                        s3 = s;
                        i9 = i5;
                        c16475 = this;
                    } else {
                        iM6981 = C0630.m2566("ۙۢ") ^ i6;
                        i = ((iM6981 ^ i7) * (-2525)) ^ (-1448197710);
                        i2 = -516866932;
                        i9 = iM6981 ^ i2;
                        i8 = i;
                    }
                    break;
                case -1075929740:
                case 1359691678:
                    C3245.m9925();
                    if (!C2126.f7087) {
                        s = s3;
                        iM6982 = (C0630.m2566("᩸ᩳ") ^ i6) * 97;
                        i8 = ((iM6982 ^ i7) * 21465) ^ (-113039088);
                        i3 = -915901039;
                        i5 = iM6982 ^ i3;
                        s3 = s;
                        i9 = i5;
                        c16475 = this;
                    }
                    s2 = s3;
                    int iM25610 = C0630.m2566("᩸ۜ") ^ i7;
                    i9 = iM25610 ^ 428498702;
                    s3 = s2;
                    i8 = ((iM25610 ^ i6) * 17701) ^ (-2114088866);
                    c16475 = this;
                    break;
                case -1049222600:
                case 1172990679:
                    s = s3;
                    if (C21923.f70183 != 0) {
                        iM6982 = (C0630.m2566("᩸ᩳ") ^ i6) * 97;
                        i8 = ((iM6982 ^ i7) * 21465) ^ (-113039088);
                        i3 = -915901039;
                    } else {
                        iM6982 = (C0630.m2566("ܶ᩻") + i6) * 57;
                        i8 = ((iM6982 ^ i7) * 19183) ^ 1221734601;
                        i3 = -1606956599;
                    }
                    i5 = iM6982 ^ i3;
                    s3 = s;
                    i9 = i5;
                    c16475 = this;
                    break;
                case -673539188:
                case -214860777:
                    C1294.m4383(runnableC14240, j);
                    if (!C4159.f13567) {
                        s = s3;
                        int iM25611 = (i7 - C0630.m2566("ܿۤ")) * 73;
                        i8 = ((iM25611 ^ i6) * 11699) ^ (-1346518131);
                        i5 = iM25611 ^ (-736257941);
                        atomicBoolean = null;
                        s3 = s;
                        i9 = i5;
                        c16475 = this;
                    } else {
                        atomicBoolean = new AtomicBoolean(true);
                        c5242 = C7261.f22281;
                        viewLifecycleOwner = getViewLifecycleOwner();
                        if (ServiceConnectionC3453.f10921 < 0) {
                            iM6981 = C0630.m2566("ܽܶ") ^ i6;
                            i = ((iM6981 ^ i7) * 5765) ^ 651549849;
                            i2 = -1789275248;
                            i9 = iM6981 ^ i2;
                            i8 = i;
                        } else {
                            iM6983 = C2105.m6981("ۡۚ") ^ i6;
                            i8 = ((iM6983 ^ i7) * 1893) ^ 572616574;
                            i4 = 1852263719;
                            i9 = iM6983 ^ i4;
                            c16475 = this;
                        }
                    }
                    break;
                case -644286642:
                case 1155545155:
                    RunnableC1108.m3788(c5242, viewLifecycleOwner, new InterfaceC1008() { // from class: l.᩹᩻ۢ
                        @Override // l.InterfaceC1008
                        /* JADX INFO: renamed from: ֫ */
                        public final void mo1617(Object obj) {
                            C16475.m38790(this.f73064, atomicBoolean, (EnumC13610) obj);
                        }
                    });
                    return view;
                case -556282967:
                case 1496376824:
                    s = s3;
                    if (C4075.f12947 >= 0) {
                        iM6982 = (C0630.m2566("᩸ᩳ") ^ i6) * 97;
                        i8 = ((iM6982 ^ i7) * 21465) ^ (-113039088);
                        i3 = -915901039;
                    } else {
                        iM6982 = C2105.m6981("۬֡") ^ i7;
                        i8 = ((iM6982 ^ i6) * 10331) ^ 1489622743;
                        i3 = 742514266;
                    }
                    i5 = iM6982 ^ i3;
                    s3 = s;
                    i9 = i5;
                    c16475 = this;
                    break;
                case -378871081:
                case 308063838:
                    s = s3;
                    if (C0050.f910 >= 0) {
                        int iM25612 = (i7 - C0630.m2566("ܿۤ")) * 73;
                        i8 = ((iM25612 ^ i6) * 11699) ^ (-1346518131);
                        i5 = iM25612 ^ (-736257941);
                        atomicBoolean = null;
                    } else {
                        iM6982 = (i7 - C2105.m6981("᩷ۧ")) * 71;
                        i8 = ((iM6982 ^ i6) * (-27605)) ^ 1521482462;
                        i3 = 1764980472;
                        i5 = iM6982 ^ i3;
                    }
                    s3 = s;
                    i9 = i5;
                    c16475 = this;
                    break;
                case -202974114:
                case 709010661:
                    viewM40367 = activityC17169.m40367(C2105.m6981(ViewOnClickListenerC1958.m6435(sArr, i13, i10, i12)) ^ 2121830786);
                    if (viewM40367 == null) {
                        iM6981 = C0630.m2566("ᩴۧ") ^ i7;
                        i = ((iM6981 ^ i6) * 3889) ^ 1103801588;
                        i2 = -1174924801;
                    } else {
                        view = viewM40367;
                        iM6981 = (C2105.m6981("ᩳ᩵") + i6) * (-71);
                        i = ((iM6981 ^ i7) * (-26863)) ^ (-1462819873);
                        i2 = 1609707665;
                    }
                    i9 = iM6981 ^ i2;
                    i8 = i;
                    break;
                case 298607228:
                case 1886104457:
                    C3019.m9255();
                    if (C1711.m5736() > 0) {
                        s2 = s3;
                        int iM25613 = C0630.m2566("᩸ۜ") ^ i7;
                        i9 = iM25613 ^ 428498702;
                        s3 = s2;
                        i8 = ((iM25613 ^ i6) * 17701) ^ (-2114088866);
                        c16475 = this;
                    } else {
                        iM6981 = C0630.m2566("ۙۢ") ^ i6;
                        i = ((iM6981 ^ i7) * (-2525)) ^ (-1448197710);
                        i2 = -516866932;
                        i9 = iM6981 ^ i2;
                        i8 = i;
                    }
                    break;
                case 684027457:
                case 814279663:
                    C1711.m5736();
                    return null;
                case 1313670037:
                case 1955029389:
                    i13 = 209;
                    i10 = 3;
                    if (!C0798.f2919) {
                        iM6981 = C0630.m2566("۬ۤ") ^ i6;
                        i = ((iM6981 ^ i7) * (-21735)) ^ (-1435799194);
                        i2 = 576654700;
                        i9 = iM6981 ^ i2;
                        i8 = i;
                    } else {
                        s2 = s3;
                        int iM25614 = C0630.m2566("᩸ۜ") ^ i7;
                        i9 = iM25614 ^ 428498702;
                        s3 = s2;
                        i8 = ((iM25614 ^ i6) * 17701) ^ (-2114088866);
                        c16475 = this;
                    }
                    break;
                default:
                    viewM40367 = super.onCreateView(layoutInflater, viewGroup, bundle);
                    C3537.m10749(viewM40367);
                    view = viewM40367;
                    iM6981 = (C2105.m6981("ᩳ᩵") + i6) * (-71);
                    i = ((iM6981 ^ i7) * (-26863)) ^ (-1462819873);
                    i2 = 1609707665;
                    i9 = iM6981 ^ i2;
                    i8 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x00bb, code lost:
    
        if (l.C3537.f11231 < 0) goto L8;
     */
    @Override // l.ComponentCallbacksC9205
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        TextView textView;
        short[] sArr;
        int i5;
        int i6;
        int i7;
        TextView textView2;
        int i8;
        int i9;
        short[] sArr2;
        int i10;
        short[] sArr3;
        int i11;
        int i12;
        int i13;
        int iM2566;
        int i14;
        short[] sArr4;
        int i15;
        int i16;
        int iM2567;
        int i17;
        int i18;
        short[] sArr5;
        int iM6981;
        int i19;
        int iM2568;
        int i20;
        int iM6982;
        int i21;
        final C16475 c16475 = this;
        int i22 = -1300767678;
        int i23 = C2958.f9394;
        int i24 = C1294.f4556;
        int iM6983 = C2105.m6981("᩸ܳ") ^ i24;
        int i25 = ((iM6983 ^ i23) * 28631) ^ 269014507;
        int i26 = iM6983 ^ (-1984409282);
        TextView textView3 = null;
        String strM34210 = null;
        TextView textView4 = null;
        ViewOnClickListenerC19197 viewOnClickListenerC19197 = null;
        String strM7159 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        View viewM3507 = null;
        int iM6984 = 0;
        int i27 = 0;
        short s = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        View viewM28028 = null;
        View viewM28029 = null;
        ActivityC17169 activityC17169 = null;
        InterfaceC8035 interfaceC8035 = null;
        TextView textView5 = null;
        String strM16034 = null;
        int i34 = 0;
        boolean z = false;
        int iM2569 = 0;
        int i35 = 0;
        C12392 c12392 = null;
        C9170 c9170M23579 = null;
        String str2 = null;
        C15545 c15545 = null;
        C15893 c15893 = null;
        while (true) {
            i22 = i26 ^ ((((i22 ^ i23) * (-7881)) >> 31) & i25);
            switch (i22) {
                case -1962234051:
                case 622483223:
                    str = strM34210;
                    int i36 = i35;
                    i2 = i29;
                    short[] sArr9 = sArr7;
                    int i37 = i31;
                    TextView textView6 = textView5;
                    int i38 = i32;
                    viewM28028 = C11340.m28028(view, C2105.m6981(C1916.m6311(sArr9, i37, i38, i2)) ^ 2120858903);
                    int iM25610 = (C0630.m2566("ᩳܰ") ^ i23) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i6 = ((iM25610 ^ i24) * 5011) ^ (-1737776870);
                    i26 = iM25610 ^ 662805158;
                    i32 = i38;
                    textView5 = textView6;
                    i34 = i34;
                    i35 = i36;
                    i33 = i33;
                    i31 = i37;
                    sArr7 = sArr9;
                    i29 = i2;
                    i25 = i6;
                    strM34210 = str;
                    break;
                case -1945082094:
                case -1397879315:
                    C4159.m12564(textView4, viewOnClickListenerC19197);
                    c16475.f50644 = z;
                    RunnableC1108.m3788(c16475.f50653.m11419(), getViewLifecycleOwner(), new InterfaceC1008() { // from class: l.ۛ᩻ۢ
                        @Override // l.InterfaceC1008
                        /* JADX INFO: renamed from: ֫ */
                        public final void mo1617(Object obj) {
                            C16475.m38793(this.f19763, (C12366) obj);
                        }
                    });
                    break;
                case -1936707309:
                case -691354309:
                    i18 = 8518;
                    int iM6985 = C2105.m6981("᩵ܶ") ^ i23;
                    i25 = ((iM6985 ^ i24) * 24481) ^ 1085645630;
                    i30 = i30;
                    textView5 = textView5;
                    i34 = i34;
                    strM34210 = strM34210;
                    i35 = i35;
                    i33 = i33;
                    i31 = i31;
                    sArr7 = sArr7;
                    i32 = i32;
                    sArr6 = sArr6;
                    i29 = i18;
                    i26 = iM6985 ^ (-1363325676);
                    c16475 = this;
                    break;
                case -1931804438:
                case 2099580714:
                    textView3 = c16475.f50643;
                    strM34210 = C14336.m34210(m38819());
                    i34 = 80;
                    iM6982 = C2105.m6981("ۘᩳ") ^ i23;
                    i25 = ((iM6982 ^ i24) * (-6505)) ^ 898781958;
                    i21 = 1315142526;
                    i26 = iM6982 ^ i21;
                    break;
                case -1879370079:
                case 661920622:
                    str = strM34210;
                    i = i35;
                    i2 = i29;
                    sArr = sArr6;
                    sArr4 = sArr7;
                    i15 = i31;
                    i16 = i32;
                    i3 = i33;
                    i4 = i34;
                    textView = textView5;
                    i5 = i30;
                    if (i28 - ((s * 2) + 1) >= 0) {
                        iM2567 = (C0630.m2566("֫᩻") ^ i24) * 93;
                        i8 = ((iM2567 ^ i23) * (-31401)) ^ (-1123886400);
                        i17 = 1088409844;
                    } else {
                        iM2567 = (C2105.m6981("ۢ۬") ^ i23) * (-7);
                        i8 = ((iM2567 ^ i24) * 13349) ^ (-636902455);
                        i17 = 801911788;
                    }
                    int i39 = iM2567 ^ i17;
                    i30 = i5;
                    textView5 = textView;
                    i34 = i4;
                    strM34210 = str;
                    i35 = i;
                    i33 = i3;
                    i31 = i15;
                    sArr7 = sArr4;
                    i32 = i16;
                    sArr6 = sArr;
                    i26 = i39;
                    i29 = i2;
                    c16475 = this;
                    i25 = i8;
                    break;
                case -1818535261:
                case -850341869:
                    c16475.f50649.m30328(new C23322(c16475));
                    c12392 = c16475.f50649;
                    interfaceC8035 = new InterfaceC8035() { // from class: l.۬᩻ۢ
                        @Override // l.InterfaceC8035
                        /* JADX INFO: renamed from: ֫ */
                        public final void mo1646(int i40, int i41) {
                            C16475.m38785(this.f40167, i40, i41);
                        }
                    };
                    if (C3537.f11231 < 0) {
                        iM6982 = (C2105.m6981("ܽᩳ") ^ i23) * 101;
                        i25 = ((iM6982 ^ i24) * 31685) ^ 701312775;
                        i21 = -645153508;
                        i26 = iM6982 ^ i21;
                    } else {
                        str = strM34210;
                        i13 = i35;
                        i2 = i29;
                        sArr2 = sArr6;
                        sArr3 = sArr7;
                        i11 = i31;
                        i12 = i32;
                        i9 = i33;
                        i7 = i34;
                        textView2 = textView5;
                        i10 = i30;
                        iM6981 = C0630.m2566("ᩳܽ") ^ i24;
                        sArr5 = sArr2;
                        i6 = ((iM6981 ^ i23) * (-9889)) ^ (-1960528677);
                        i19 = 1655764456;
                        i30 = i10;
                        textView5 = textView2;
                        i34 = i7;
                        i35 = i13;
                        i33 = i9;
                        i31 = i11;
                        sArr7 = sArr3;
                        i32 = i12;
                        sArr6 = sArr5;
                        i26 = iM6981 ^ i19;
                        i29 = i2;
                        i25 = i6;
                        strM34210 = str;
                    }
                    break;
                case -1815144796:
                case 649321646:
                    str = strM34210;
                    i = i35;
                    i2 = i29;
                    sArr = sArr6;
                    sArr4 = sArr7;
                    i15 = i31;
                    i16 = i32;
                    i3 = i33;
                    i4 = i34;
                    textView = textView5;
                    i5 = i30;
                    s = f50637[260];
                    iM2567 = C0630.m2566("᩸ۚ") ^ i24;
                    i8 = ((iM2567 ^ i23) * (-22969)) ^ 616941468;
                    i17 = -279798159;
                    int i310 = iM2567 ^ i17;
                    i30 = i5;
                    textView5 = textView;
                    i34 = i4;
                    strM34210 = str;
                    i35 = i;
                    i33 = i3;
                    i31 = i15;
                    sArr7 = sArr4;
                    i32 = i16;
                    sArr6 = sArr;
                    i26 = i310;
                    i29 = i2;
                    c16475 = this;
                    i25 = i8;
                    break;
                case -1701964505:
                case 1743899410:
                    String str3 = strM34210;
                    int i40 = i35;
                    i2 = i29;
                    C3746.m11360(viewM28029, i40);
                    c16475.f50649.m30407(true);
                    c16475.f50649.m30449();
                    activityC17169 = (ActivityC17169) RunnableC0588.m2429(this);
                    int iM6986 = C2105.m6981("۫ܰ") ^ i23;
                    i8 = ((iM6986 ^ i24) * 15219) ^ 1400823822;
                    i26 = iM6986 ^ (-1457294874);
                    i35 = i40;
                    i34 = i34;
                    strM34210 = str3;
                    z = true;
                    i29 = i2;
                    i25 = i8;
                    break;
                case -1409062782:
                case -1208473911:
                    C21923.m49329();
                    if (C22628.f73083 <= 0) {
                        str = strM34210;
                        i = i35;
                        i2 = i29;
                        sArr = sArr6;
                        i3 = i33;
                        i4 = i34;
                        textView = textView5;
                        i5 = i30;
                        int iM25611 = C0630.m2566("᩵֫") ^ i24;
                        i8 = ((iM25611 ^ i23) * 73) ^ (-750168459);
                        i26 = iM25611 ^ (-1028669340);
                        c16475 = this;
                        i30 = i5;
                        textView5 = textView;
                        i34 = i4;
                        strM34210 = str;
                        i35 = i;
                        i33 = i3;
                        sArr6 = sArr;
                        c15893 = null;
                        i29 = i2;
                        i25 = i8;
                    } else {
                        str = strM34210;
                        i13 = i35;
                        i2 = i29;
                        sArr2 = sArr6;
                        sArr3 = sArr7;
                        i11 = i31;
                        i12 = i32;
                        i9 = i33;
                        i7 = i34;
                        textView2 = textView5;
                        i10 = i30;
                        iM6981 = C0630.m2566("ᩳܽ") ^ i24;
                        sArr5 = sArr2;
                        i6 = ((iM6981 ^ i23) * (-9889)) ^ (-1960528677);
                        i19 = 1655764456;
                        i30 = i10;
                        textView5 = textView2;
                        i34 = i7;
                        i35 = i13;
                        i33 = i9;
                        i31 = i11;
                        sArr7 = sArr3;
                        i32 = i12;
                        sArr6 = sArr5;
                        i26 = iM6981 ^ i19;
                        i29 = i2;
                        i25 = i6;
                        strM34210 = str;
                    }
                    break;
                case -1385948356:
                case 1465296773:
                    str = strM34210;
                    c16475.f50642 = (TextView) viewM28028;
                    sArr8 = f50637;
                    i33 = 273;
                    int iM6987 = (C2105.m6981("ܺۖ") ^ i24) * 31;
                    i26 = iM6987 ^ (-1919106298);
                    i34 = i34;
                    i29 = i29;
                    i25 = ((iM6987 ^ i23) * 12847) ^ (-1382824361);
                    textView5 = textView5;
                    i35 = i35;
                    strM34210 = str;
                    break;
                case -1258575352:
                case -298944466:
                    String str4 = strM34210;
                    int i41 = iM2569;
                    int i42 = i35;
                    c16475.f50649 = (C12392) C11340.m28028(view, i41);
                    sArr6 = f50637;
                    i30 = 267;
                    int iM6988 = C2105.m6981("֨ۚ") ^ i24;
                    iM2569 = i41;
                    i34 = i34;
                    strM34210 = str4;
                    i33 = i33;
                    i31 = i31;
                    sArr7 = sArr7;
                    i32 = i32;
                    i26 = iM6988 ^ (-1940764315);
                    i29 = i29;
                    i25 = ((iM6988 ^ i23) * (-20039)) ^ (-1718213885);
                    textView5 = textView5;
                    i35 = i42;
                    break;
                case -1153347726:
                case 1393152885:
                    RunnableC1937.m6377(textView3, C6554.m18061(i34, strM34210));
                    C2126.m7039(c16475.f50643, new View.OnClickListener() { // from class: l.۫᩻ۢ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            C16475.m38786(this.f38308, view2);
                        }
                    });
                    textView5 = c16475.f50643;
                    if (C22628.f73083 > 0) {
                        iM6982 = (i24 - C2105.m6981("֡ۤ")) * (-95);
                        i25 = ((iM6982 ^ i23) * (-13035)) ^ 885927024;
                        i21 = -381038164;
                        i26 = iM6982 ^ i21;
                    } else {
                        str = strM34210;
                        i13 = i35;
                        i2 = i29;
                        sArr2 = sArr6;
                        sArr3 = sArr7;
                        i11 = i31;
                        i12 = i32;
                        i9 = i33;
                        i7 = i34;
                        textView2 = textView5;
                        i10 = i30;
                        iM6981 = C0630.m2566("ᩳܽ") ^ i24;
                        sArr5 = sArr2;
                        i6 = ((iM6981 ^ i23) * (-9889)) ^ (-1960528677);
                        i19 = 1655764456;
                        i30 = i10;
                        textView5 = textView2;
                        i34 = i7;
                        i35 = i13;
                        i33 = i9;
                        i31 = i11;
                        sArr7 = sArr3;
                        i32 = i12;
                        sArr6 = sArr5;
                        i26 = iM6981 ^ i19;
                        i29 = i2;
                        i25 = i6;
                        strM34210 = str;
                    }
                    break;
                case -1080226065:
                case 2013865114:
                    str = strM34210;
                    i2 = i29;
                    i7 = i34;
                    textView2 = textView5;
                    short[] sArr10 = sArr8;
                    int i43 = i33;
                    viewM28029 = C11340.m28028(view, C2105.m6981(C1420.m4902(sArr10, i43, 3, i2)) ^ 2124680558);
                    if (RunnableC1937.f6483 < 0) {
                        int iM6989 = C2105.m6981("ۙۡ") ^ i24;
                        i8 = ((iM6989 ^ i23) * 28375) ^ (-373417095);
                        i26 = iM6989 ^ (-923163119);
                        sArr8 = sArr10;
                        i33 = i43;
                        textView5 = textView2;
                        i34 = i7;
                        strM34210 = str;
                        i35 = 8;
                        i29 = i2;
                        i25 = i8;
                    } else {
                        sArr8 = sArr10;
                        i9 = i43;
                        sArr2 = sArr6;
                        i10 = i30;
                        sArr3 = sArr7;
                        i11 = i31;
                        i12 = i32;
                        i13 = 8;
                        iM6981 = C0630.m2566("ᩳܽ") ^ i24;
                        sArr5 = sArr2;
                        i6 = ((iM6981 ^ i23) * (-9889)) ^ (-1960528677);
                        i19 = 1655764456;
                        i30 = i10;
                        textView5 = textView2;
                        i34 = i7;
                        i35 = i13;
                        i33 = i9;
                        i31 = i11;
                        sArr7 = sArr3;
                        i32 = i12;
                        sArr6 = sArr5;
                        i26 = iM6981 ^ i19;
                        i29 = i2;
                        i25 = i6;
                        strM34210 = str;
                    }
                    break;
                case -1058211369:
                case 1737132907:
                    str = strM34210;
                    i = i35;
                    i2 = i29;
                    sArr = sArr6;
                    sArr4 = sArr7;
                    i15 = i31;
                    i16 = i32;
                    i3 = i33;
                    i4 = i34;
                    textView = textView5;
                    i5 = i30;
                    c16475.f50656 = viewM3507;
                    strM7159 = C2167.m7159(f50637, 264, 3, i2);
                    iM2567 = C0630.m2566("۬ۛ") ^ i24;
                    i8 = ((iM2567 ^ i23) * (-3677)) ^ (-454081525);
                    i17 = -2078012036;
                    int i311 = iM2567 ^ i17;
                    i30 = i5;
                    textView5 = textView;
                    i34 = i4;
                    strM34210 = str;
                    i35 = i;
                    i33 = i3;
                    i31 = i15;
                    sArr7 = sArr4;
                    i32 = i16;
                    sArr6 = sArr;
                    i26 = i311;
                    i29 = i2;
                    c16475 = this;
                    i25 = i8;
                    break;
                case -856942293:
                case 1740254259:
                    str = strM34210;
                    c15545.m36678(str2, false);
                    if (C2105.f7037 == 0) {
                        c15893 = new C15893(new C21040());
                        c16475.f50651 = c15893;
                        c9170M23579 = C9170.m23579(getViewLifecycleOwner());
                        iM2566 = C0630.m2566("᩶᩵") ^ i24;
                        i25 = ((iM2566 ^ i23) * 24119) ^ 1707433661;
                        i14 = -953634109;
                        i26 = iM2566 ^ i14;
                        strM34210 = str;
                    } else {
                        i = i35;
                        i2 = i29;
                        sArr = sArr6;
                        i3 = i33;
                        i4 = i34;
                        textView = textView5;
                        i5 = i30;
                        int iM25612 = C0630.m2566("᩵֫") ^ i24;
                        i8 = ((iM25612 ^ i23) * 73) ^ (-750168459);
                        i26 = iM25612 ^ (-1028669340);
                        c16475 = this;
                        i30 = i5;
                        textView5 = textView;
                        i34 = i4;
                        strM34210 = str;
                        i35 = i;
                        i33 = i3;
                        sArr6 = sArr;
                        c15893 = null;
                        i29 = i2;
                        i25 = i8;
                    }
                    break;
                case -843351831:
                case 1851812504:
                    C2272.m7503();
                    C1711.m5736();
                    break;
                case -447847324:
                case 727875039:
                    textView5.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ۤ᩻ۢ
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view2) {
                            C16475 c16476 = this.f31904;
                            String strM38819 = c16476.m38819();
                            C19258 c19258BuildDialog = ((ActivityC17169) c16476.requireActivity()).buildDialog();
                            c19258BuildDialog.m44424(strM38819);
                            c19258BuildDialog.m44438();
                            return true;
                        }
                    });
                    m38817();
                    textView4 = c16475.f50642;
                    viewOnClickListenerC19197 = new ViewOnClickListenerC19197(2, c16475);
                    iM6982 = (C2105.m6981("ۛۤ") ^ i23) * (-115);
                    i25 = ((iM6982 ^ i24) * (-30479)) ^ (-318898686);
                    i21 = 1293358859;
                    i26 = iM6982 ^ i21;
                    break;
                case -403110221:
                case -83819227:
                    C3432.m10477();
                    break;
                case -256421124:
                case 522201196:
                    C1420.m4913();
                    C3019.m9255();
                    str = strM34210;
                    i13 = i35;
                    i2 = i29;
                    sArr2 = sArr6;
                    sArr3 = sArr7;
                    i11 = i31;
                    i12 = i32;
                    i9 = i33;
                    i7 = i34;
                    textView2 = textView5;
                    i10 = i30;
                    iM6981 = C0630.m2566("ᩳܽ") ^ i24;
                    sArr5 = sArr2;
                    i6 = ((iM6981 ^ i23) * (-9889)) ^ (-1960528677);
                    i19 = 1655764456;
                    i30 = i10;
                    textView5 = textView2;
                    i34 = i7;
                    i35 = i13;
                    i33 = i9;
                    i31 = i11;
                    sArr7 = sArr3;
                    i32 = i12;
                    sArr6 = sArr5;
                    i26 = iM6981 ^ i19;
                    i29 = i2;
                    i25 = i6;
                    strM34210 = str;
                    break;
                case -182135856:
                case 1166392955:
                    str = strM34210;
                    i = i35;
                    i2 = i29;
                    sArr = sArr6;
                    sArr4 = sArr7;
                    i15 = i31;
                    i16 = i32;
                    i3 = i33;
                    i4 = i34;
                    textView = textView5;
                    i5 = i30;
                    viewM3507 = C1005.m3507(view, C0630.m2566(strM16034) ^ 2121065024);
                    if (C0714.f2697 < 0) {
                        iM2567 = (C2105.m6981("᩵᩷") ^ i23) * (-13);
                        i8 = ((iM2567 ^ i24) * (-9767)) ^ 293928312;
                        i17 = 1302823064;
                        int i312 = iM2567 ^ i17;
                        i30 = i5;
                        textView5 = textView;
                        i34 = i4;
                        strM34210 = str;
                        i35 = i;
                        i33 = i3;
                        i31 = i15;
                        sArr7 = sArr4;
                        i32 = i16;
                        sArr6 = sArr;
                        i26 = i312;
                        i29 = i2;
                        c16475 = this;
                        i25 = i8;
                    } else {
                        i31 = i15;
                        sArr7 = sArr4;
                        i32 = i16;
                        int iM25613 = C0630.m2566("᩵֫") ^ i24;
                        i8 = ((iM25613 ^ i23) * 73) ^ (-750168459);
                        i26 = iM25613 ^ (-1028669340);
                        c16475 = this;
                        i30 = i5;
                        textView5 = textView;
                        i34 = i4;
                        strM34210 = str;
                        i35 = i;
                        i33 = i3;
                        sArr6 = sArr;
                        c15893 = null;
                        i29 = i2;
                        i25 = i8;
                    }
                    break;
                case -103621263:
                case 1405122463:
                    c16475.f50646 = c15545;
                    int i44 = i29;
                    String strM5726 = C1711.m5726(f50637, 276, 19, i44);
                    int iM69810 = C2105.m6981("᩹֡") ^ i23;
                    i26 = iM69810 ^ (-1835283220);
                    i25 = ((iM69810 ^ i24) * (-26745)) ^ 1014297524;
                    i29 = i44;
                    strM34210 = strM34210;
                    str2 = strM5726;
                    break;
                case 186925782:
                case 1839484825:
                    C2272.m7503();
                    if (!C3683.m11222()) {
                        str = strM34210;
                        i13 = i35;
                        i2 = i29;
                        sArr2 = sArr6;
                        sArr3 = sArr7;
                        i11 = i31;
                        i12 = i32;
                        i9 = i33;
                        i7 = i34;
                        textView2 = textView5;
                        i10 = i30;
                        iM6981 = C0630.m2566("ᩳܽ") ^ i24;
                        sArr5 = sArr2;
                        i6 = ((iM6981 ^ i23) * (-9889)) ^ (-1960528677);
                        i19 = 1655764456;
                        i30 = i10;
                        textView5 = textView2;
                        i34 = i7;
                        i35 = i13;
                        i33 = i9;
                        i31 = i11;
                        sArr7 = sArr3;
                        i32 = i12;
                        sArr6 = sArr5;
                        i26 = iM6981 ^ i19;
                        i29 = i2;
                        i25 = i6;
                        strM34210 = str;
                    } else {
                        iM6982 = C0630.m2566("ᩴ֡") ^ i23;
                        i25 = ((iM6982 ^ i24) * 8733) ^ 1550687869;
                        i21 = 93761990;
                        i26 = iM6982 ^ i21;
                    }
                    break;
                case 280120097:
                case 1536994530:
                    str = strM34210;
                    i = i35;
                    i2 = i29;
                    sArr = sArr6;
                    sArr4 = sArr7;
                    i15 = i31;
                    i16 = i32;
                    i3 = i33;
                    i4 = i34;
                    textView = textView5;
                    i5 = i30;
                    super.onViewCreated(view, bundle);
                    strM16034 = C5695.m16034(f50637, 261, 3, i2);
                    iM2567 = (i24 - C0630.m2566("ᩳܿ")) * 93;
                    i8 = ((iM2567 ^ i23) * (-26775)) ^ (-849594113);
                    i17 = 1641643379;
                    int i313 = iM2567 ^ i17;
                    i30 = i5;
                    textView5 = textView;
                    i34 = i4;
                    strM34210 = str;
                    i35 = i;
                    i33 = i3;
                    i31 = i15;
                    sArr7 = sArr4;
                    i32 = i16;
                    sArr6 = sArr;
                    i26 = i313;
                    i29 = i2;
                    c16475 = this;
                    i25 = i8;
                    break;
                case 593119612:
                case 1430942945:
                    str = strM34210;
                    i13 = i35;
                    i2 = i29;
                    sArr3 = sArr7;
                    i11 = i31;
                    i9 = i33;
                    i7 = i34;
                    textView2 = textView5;
                    i12 = i32;
                    sArr2 = sArr6;
                    i10 = i30;
                    iM6984 = C2105.m6981(C2520.m8030(sArr2, i10, 3, i2));
                    i27 = 2098056509;
                    if (C0382.f1805) {
                        sArr5 = sArr2;
                        iM6981 = (i23 - C2105.m6981("᩶ۗ")) * 51;
                        i6 = ((iM6981 ^ i24) * 31921) ^ (-1615577720);
                        i19 = -1302316103;
                    } else {
                        iM6981 = C0630.m2566("ᩳܽ") ^ i24;
                        sArr5 = sArr2;
                        i6 = ((iM6981 ^ i23) * (-9889)) ^ (-1960528677);
                        i19 = 1655764456;
                    }
                    i30 = i10;
                    textView5 = textView2;
                    i34 = i7;
                    i35 = i13;
                    i33 = i9;
                    i31 = i11;
                    sArr7 = sArr3;
                    i32 = i12;
                    sArr6 = sArr5;
                    i26 = iM6981 ^ i19;
                    i29 = i2;
                    i25 = i6;
                    strM34210 = str;
                    break;
                case 654376554:
                case 724330040:
                    str = strM34210;
                    i13 = i35;
                    i2 = i29;
                    sArr5 = sArr6;
                    sArr3 = sArr7;
                    i11 = i31;
                    i12 = i32;
                    i9 = i33;
                    i7 = i34;
                    textView2 = textView5;
                    i10 = i30;
                    iM2569 = C0630.m2566(strM7159) ^ 2130352440;
                    if (C4159.m12565() >= 0) {
                        iM6981 = C2105.m6981("᩻᩸") ^ i24;
                        i6 = ((iM6981 ^ i23) * 11573) ^ (-30821154);
                        i19 = 418635711;
                    } else {
                        iM6981 = (i23 - C2105.m6981("ᩳۚ")) * 47;
                        i6 = ((iM6981 ^ i24) * 25081) ^ 157940837;
                        i19 = -1271530184;
                    }
                    i30 = i10;
                    textView5 = textView2;
                    i34 = i7;
                    i35 = i13;
                    i33 = i9;
                    i31 = i11;
                    sArr7 = sArr3;
                    i32 = i12;
                    sArr6 = sArr5;
                    i26 = iM6981 ^ i19;
                    i29 = i2;
                    i25 = i6;
                    strM34210 = str;
                    break;
                case 1186720454:
                case 1675492377:
                    i18 = 18526;
                    int iM69811 = C2105.m6981("᩵ܶ") ^ i23;
                    i25 = ((iM69811 ^ i24) * 24481) ^ 1085645630;
                    i30 = i30;
                    textView5 = textView5;
                    i34 = i34;
                    strM34210 = strM34210;
                    i35 = i35;
                    i33 = i33;
                    i31 = i31;
                    sArr7 = sArr7;
                    i32 = i32;
                    sArr6 = sArr6;
                    i29 = i18;
                    i26 = iM69811 ^ (-1363325676);
                    c16475 = this;
                    break;
                case 1212538986:
                case 1731002171:
                    str = strM34210;
                    i = i35;
                    i2 = i29;
                    i3 = i33;
                    i4 = i34;
                    textView = textView5;
                    c16475.f50643 = (TextView) C1005.m3507(view, iM6984 ^ i27);
                    sArr7 = f50637;
                    i31 = BottomAppBarTopEdgeTreatment.ANGLE_UP;
                    i32 = 3;
                    if (C1128.f4106 > 0) {
                        int iM25614 = C0630.m2566("ܺ᩹") ^ i24;
                        i6 = ((iM25614 ^ i23) * 20991) ^ (-468769001);
                        i26 = iM25614 ^ 604169065;
                        textView5 = textView;
                        i34 = i4;
                        i35 = i;
                        i33 = i3;
                        i29 = i2;
                        i25 = i6;
                        strM34210 = str;
                    } else {
                        sArr = sArr6;
                        i5 = i30;
                        int iM25615 = C0630.m2566("᩵֫") ^ i24;
                        i8 = ((iM25615 ^ i23) * 73) ^ (-750168459);
                        i26 = iM25615 ^ (-1028669340);
                        c16475 = this;
                        i30 = i5;
                        textView5 = textView;
                        i34 = i4;
                        strM34210 = str;
                        i35 = i;
                        i33 = i3;
                        sArr6 = sArr;
                        c15893 = null;
                        i29 = i2;
                        i25 = i8;
                    }
                    break;
                case 1484900321:
                case 1543599828:
                    str = strM34210;
                    activityC17169.m10236(c16475.f50649);
                    i2 = i29;
                    int i45 = i34;
                    c15545 = new C15545((ActivityC17169) C3683.m11214(this), c16475.f50649, view);
                    if (C1773.m5908() <= 0) {
                        iM2568 = (i23 - C0630.m2566("᩶ܶ")) * (-123);
                        i6 = ((iM2568 ^ i24) * (-24155)) ^ (-2102123602);
                        i20 = -566785728;
                    } else {
                        iM2568 = C0630.m2566("᩸֡") ^ i24;
                        i6 = ((iM2568 ^ i23) * (-29891)) ^ 1028989551;
                        i20 = 1457082739;
                    }
                    i26 = iM2568 ^ i20;
                    i34 = i45;
                    i29 = i2;
                    i25 = i6;
                    strM34210 = str;
                    break;
                case 1747143255:
                case 1958050895:
                    c15893.mo7982(c9170M23579);
                    C12392 c12393 = c16475.f50649;
                    if (C1005.f3721) {
                        str = strM34210;
                        c16475.f50655 = new ViewOnClickListenerC20313(c16475, c12393, c16475.f50651);
                        c16475.f50651.mo7981(new C7516(3, c16475));
                        iM2566 = C2105.m6981("۟ۜ") ^ i23;
                        i25 = ((iM2566 ^ i24) * 4977) ^ (-1497584031);
                        i14 = 1723423721;
                        i26 = iM2566 ^ i14;
                        strM34210 = str;
                    }
                    str = strM34210;
                    i13 = i35;
                    i2 = i29;
                    sArr5 = sArr6;
                    sArr3 = sArr7;
                    i11 = i31;
                    i12 = i32;
                    i9 = i33;
                    i7 = i34;
                    textView2 = textView5;
                    i10 = i30;
                    iM6981 = C2105.m6981("᩻᩸") ^ i24;
                    i6 = ((iM6981 ^ i23) * 11573) ^ (-30821154);
                    i19 = 418635711;
                    i30 = i10;
                    textView5 = textView2;
                    i34 = i7;
                    i35 = i13;
                    i33 = i9;
                    i31 = i11;
                    sArr7 = sArr3;
                    i32 = i12;
                    sArr6 = sArr5;
                    i26 = iM6981 ^ i19;
                    i29 = i2;
                    i25 = i6;
                    strM34210 = str;
                    break;
                case 1766529528:
                case 1878852793:
                    c12392.m30330(interfaceC8035);
                    c16475.f50649.m30334(new C14149(c16475));
                    iM6982 = C0630.m2566("᩸ᩴ") ^ i24;
                    i25 = ((iM6982 ^ i23) * 14603) ^ (-107301120);
                    i21 = 600897597;
                    i26 = iM6982 ^ i21;
                    break;
                default:
                    str = strM34210;
                    i = i35;
                    i2 = i29;
                    sArr = sArr6;
                    sArr4 = sArr7;
                    i15 = i31;
                    i16 = i32;
                    i3 = i33;
                    i4 = i34;
                    textView = textView5;
                    i5 = i30;
                    int i46 = s + 1;
                    i28 = i46 * i46;
                    iM2567 = (C2105.m6981("ۨ᩵") + i23) * 109;
                    i8 = ((iM2567 ^ i24) * 23955) ^ 758599202;
                    i17 = 1195992378;
                    int i314 = iM2567 ^ i17;
                    i30 = i5;
                    textView5 = textView;
                    i34 = i4;
                    strM34210 = str;
                    i35 = i;
                    i33 = i3;
                    i31 = i15;
                    sArr7 = sArr4;
                    i32 = i16;
                    sArr6 = sArr;
                    i26 = i314;
                    i29 = i2;
                    c16475 = this;
                    i25 = i8;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x0227  */
    /* JADX WARN: Code duplicated, block: B:74:0x02aa A[PHI: r4 r5
      0x02aa: PHI (r4v3 int) = (r4v1 int), (r4v1 int), (r4v1 int), (r4v8 int) binds: [B:73:0x02a8, B:57:0x0207, B:11:0x0056, B:31:0x00dd] A[DONT_GENERATE, DONT_INLINE]
      0x02aa: PHI (r5v3 int) = (r5v1 int), (r5v1 int), (r5v1 int), (r5v6 int) binds: [B:73:0x02a8, B:57:0x0207, B:11:0x0056, B:31:0x00dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x02d8  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
    
        if (l.C3245.m9925() != 0) goto L14;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m38788(C16475 c16475, Exception exc, ActivityC17169 activityC17169) {
        int iM6981;
        int i;
        int i2;
        C1783 c1783 = null;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        C19287 c19287M44466 = null;
        String strM5935 = null;
        int i7 = -332823158;
        int i8 = C1773.f6144;
        int i9 = C5695.f17556;
        int iM2566 = (i8 - C0630.m2566("ۜܽ")) * 33;
        int i10 = ((iM2566 ^ i9) * 1525) ^ 1536021025;
        int i11 = iM2566 ^ (-189315567);
        while (true) {
            i7 = ((((i7 ^ i9) * (-10745)) >> 31) & i10) ^ i11;
            switch (i7) {
                case -2126179406:
                case -37760014:
                    C0964.m3413();
                    break;
                case -2080241005:
                case -1450054719:
                    if (C22628.m50615() != 0) {
                        iM6981 = (i8 - C2105.m6981("ܰ᩻")) * 21;
                        i = ((iM6981 ^ i9) * (-3943)) ^ 69972191;
                        i2 = 204830403;
                    } else {
                        iM6981 = (C2105.m6981("ۧ᩻") + i9) * 67;
                        i = ((iM6981 ^ i8) * (-30821)) ^ 986626079;
                        i2 = -2061437188;
                    }
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case -1987902914:
                case -37882421:
                    if (C4159.f13567) {
                        iM6981 = C2105.m6981("֡ۜ") ^ i8;
                        i = ((iM6981 ^ i9) * (-31627)) ^ 575356688;
                        i2 = -2027143316;
                    } else {
                        iM6981 = (C0630.m2566("۫᩹") + i9) * (-101);
                        i = ((iM6981 ^ i8) * 23887) ^ 298201007;
                        i2 = 25918162;
                    }
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case -1869835299:
                case 306603247:
                    if (C4263.f13799 <= 0) {
                        iM6981 = C0630.m2566("ۧۘ") ^ i9;
                        i = ((iM6981 ^ i8) * 11961) ^ (-1398263278);
                        i2 = 2054939103;
                    } else {
                        iM6981 = C2105.m6981("ܶۛ") ^ i9;
                        i = ((iM6981 ^ i8) * (-15327)) ^ 1884016130;
                        i2 = 757067084;
                    }
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case -1836033382:
                case 1030552771:
                    c19287M44466 = C19287.m44466(i5, i6);
                    strM5935 = c16475.m38819();
                    iM6981 = C2105.m6981("᩶ᩴ") ^ i9;
                    i = ((iM6981 ^ i8) * 3457) ^ 1781563455;
                    i2 = 938499154;
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case -1756619431:
                case 210881211:
                    if (C2126.f7087) {
                        iM6981 = (i8 - C2105.m6981("ܰ᩻")) * 21;
                        i = ((iM6981 ^ i9) * (-3943)) ^ 69972191;
                        i2 = 204830403;
                        i11 = iM6981 ^ i2;
                        i10 = i;
                    }
                    iM6981 = (C0630.m2566("۫᩹") + i9) * (-101);
                    i = ((iM6981 ^ i8) * 23887) ^ 298201007;
                    i2 = 25918162;
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case -1506840124:
                case -253533689:
                    c1783 = (C1783) exc;
                    i3 = c1783.f6159;
                    i4 = c1783.f6160;
                    if (C11340.m28031()) {
                        iM6981 = (C0630.m2566("ܿᩴ") ^ i8) * 49;
                        i = ((iM6981 ^ i9) * (-20109)) ^ (-140873189);
                        i2 = 1492224248;
                    } else {
                        iM6981 = C0630.m2566("᩹ܳ") ^ i8;
                        i = ((iM6981 ^ i9) * 16705) ^ (-1504777956);
                        i2 = 1474058844;
                    }
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case -1430573685:
                case 879619260:
                    c19287M44466 = C19287.m44466(i3, i4);
                    strM5935 = c1783.m5935();
                    iM6981 = C2105.m6981("᩶ᩴ") ^ i9;
                    i = ((iM6981 ^ i8) * 3457) ^ 1781563455;
                    i2 = 938499154;
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case -1200052789:
                case -649994044:
                    C22628.m50615();
                    C2167.m7155();
                    iM6981 = (C0630.m2566("۫᩹") + i9) * (-101);
                    i = ((iM6981 ^ i8) * 23887) ^ 298201007;
                    i2 = 25918162;
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case -1071109250:
                case 99505464:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = C0630.m2566("ۡ᩷") ^ i8;
                        i = ((iM6981 ^ i9) * (-31863)) ^ (-1831915761);
                        i2 = -754819662;
                    } else {
                        iM6981 = C0630.m2566("֨ܿ") ^ i8;
                        i = ((iM6981 ^ i9) * (-13471)) ^ 466594697;
                        i2 = 536481467;
                    }
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case -1050931934:
                case 1374971274:
                    c19287M44466 = null;
                    strM5935 = null;
                    iM6981 = C2105.m6981("᩶ᩴ") ^ i9;
                    i = ((iM6981 ^ i8) * 3457) ^ 1781563455;
                    i2 = 938499154;
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case -1048328815:
                case -382619028:
                    if (exc instanceof C1783) {
                        iM6981 = C0630.m2566("ۧۢ") ^ i9;
                        i = ((iM6981 ^ i8) * 7705) ^ 3260201;
                        i2 = 500473483;
                    } else {
                        iM6981 = C0630.m2566("ۨܽ") ^ i8;
                        i = ((iM6981 ^ i9) * (-18731)) ^ (-1440555195);
                        i2 = 1922904999;
                    }
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case -853441765:
                case -624676165:
                    if (c19287M44466 != null) {
                        iM6981 = (C2105.m6981("᩵ۗ") ^ i9) * 101;
                        i = ((iM6981 ^ i8) * 25377) ^ 606666364;
                        i2 = -1696840725;
                    } else {
                        iM6981 = C0630.m2566("ܳ᩵") ^ i8;
                        i = ((iM6981 ^ i9) * 25685) ^ (-996836354);
                        i2 = 86831554;
                    }
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case -758394663:
                case 213163294:
                    if (C0237.f1507 != 0) {
                        iM6981 = C0630.m2566("ۡ᩷") ^ i8;
                        i = ((iM6981 ^ i9) * (-31863)) ^ (-1831915761);
                        i2 = -754819662;
                    } else {
                        iM6981 = C0630.m2566("ܺ۠") ^ i8;
                        i = ((iM6981 ^ i9) * (-22405)) ^ 1042481384;
                        i2 = -754945317;
                    }
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case -218493276:
                case 1766135503:
                    if (C0050.f910 >= 0) {
                        iM6981 = (i8 - C2105.m6981("ܰ᩻")) * 21;
                        i = ((iM6981 ^ i9) * (-3943)) ^ 69972191;
                        i2 = 204830403;
                    } else {
                        iM6981 = (C2105.m6981("֫᩶") ^ i9) * (-85);
                        i = ((iM6981 ^ i8) * (-25091)) ^ (-1754439331);
                        i2 = 819706314;
                    }
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case -202090857:
                case 730950038:
                    break;
                case -32749312:
                case 50602321:
                    if (C3683.f11629 >= 0) {
                        iM6981 = C0630.m2566("ۧۘ") ^ i9;
                        i = ((iM6981 ^ i8) * 11961) ^ (-1398263278);
                        i2 = 2054939103;
                    } else {
                        iM6981 = C2105.m6981("ܰ᩶") ^ i9;
                        i = ((iM6981 ^ i8) * (-18279)) ^ (-246022670);
                        i2 = 750001280;
                    }
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case 401606499:
                case 956742604:
                    C14658 c14658 = (C14658) exc;
                    int i12 = c14658.f44794;
                    int i13 = c14658.f44798;
                    if (C3537.m10746() <= 0) {
                        i6 = i13;
                        i5 = i12;
                        iM6981 = C0630.m2566("ۡ᩷") ^ i8;
                        i = ((iM6981 ^ i9) * (-31863)) ^ (-1831915761);
                        i2 = -754819662;
                        i11 = iM6981 ^ i2;
                        i10 = i;
                    } else {
                        int iM6982 = (C2105.m6981("ۙۡ") ^ i9) * 91;
                        i11 = iM6982 ^ 1871354598;
                        i10 = ((iM6982 ^ i8) * 22339) ^ (-729323680);
                        i6 = i13;
                        i5 = i12;
                    }
                    break;
                case 826792410:
                case 2029063973:
                    if (C0483.f2088 >= 0) {
                        iM6981 = (i8 - C2105.m6981("ܰ᩻")) * 21;
                        i = ((iM6981 ^ i9) * (-3943)) ^ 69972191;
                        i2 = 204830403;
                    } else {
                        iM6981 = C0630.m2566("ۧۚ") ^ i8;
                        i = ((iM6981 ^ i9) * (-30831)) ^ (-1072684093);
                        i2 = 767138932;
                    }
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case 1179620517:
                case 1768576277:
                    C4616.m13552();
                    break;
                case 1361952087:
                case 2036465776:
                    if (C3245.f10203 <= 0) {
                        iM6981 = C0630.m2566("ۡ᩷") ^ i8;
                        i = ((iM6981 ^ i9) * (-31863)) ^ (-1831915761);
                        i2 = -754819662;
                        i11 = iM6981 ^ i2;
                        i10 = i;
                    }
                    iM6981 = C0630.m2566("ۧۘ") ^ i9;
                    i = ((iM6981 ^ i8) * 11961) ^ (-1398263278);
                    i2 = 2054939103;
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case 1458855749:
                case 1545637636:
                    if (exc instanceof C14658) {
                        iM6981 = C0630.m2566("֫۟") ^ i8;
                        i = ((iM6981 ^ i9) * (-24463)) ^ 492143306;
                        i2 = 398159022;
                    } else {
                        iM6981 = (C0630.m2566("ᩳۜ") + i9) * 35;
                        i = ((iM6981 ^ i8) * 13811) ^ 705949898;
                        i2 = -1348044734;
                    }
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                case 1868727221:
                case 1967573815:
                    c19287M44466.f60678 = false;
                    c16475.f50647 = false;
                    activityC17169.m40343(strM5935, c19287M44466);
                    iM6981 = C0630.m2566("ܳ᩵") ^ i8;
                    i = ((iM6981 ^ i9) * 25685) ^ (-996836354);
                    i2 = 86831554;
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
                default:
                    if (strM5935 != null) {
                        iM6981 = (C0630.m2566("ᩴ᩵") + i8) * (-87);
                        i = ((iM6981 ^ i9) * 16689) ^ (-632540966);
                        i2 = 1774374072;
                    } else {
                        iM6981 = C0630.m2566("ܳ᩵") ^ i8;
                        i = ((iM6981 ^ i9) * 25685) ^ (-996836354);
                        i2 = 86831554;
                    }
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38785(C16475 c16475, int i, int i2) {
        C15893 c15893 = null;
        int i3 = 789082495;
        int i4 = RunnableC3474.f10992;
        int i5 = C3911.f12484;
        int iM6981 = (C2105.m6981("᩶۟") ^ i5) * (-41);
        int i6 = ((iM6981 ^ i4) * 1155) ^ 1869719278;
        int i7 = 110065916;
        while (true) {
            i3 = ((((i3 ^ i4) * (-12429)) >> 31) & i6) ^ (iM6981 ^ i7);
            switch (i3) {
                case -2129739760:
                case -1245228026:
                    if (!C2520.m8026()) {
                        iM6981 = C2105.m6981("᩵ܶ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-9571)) ^ (-1851156516);
                        i7 = 558461201;
                    } else {
                        iM6981 = C0630.m2566("᩵ܰ") ^ i4;
                        i6 = ((iM6981 ^ i5) * 29397) ^ (-434024060);
                        i7 = -1143351678;
                    }
                    break;
                case -1970530708:
                case 548083405:
                    if (C1504.m5179()) {
                        iM6981 = C0630.m2566("ۢ᩹") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-16071)) ^ 738269093;
                        i7 = -811408501;
                    } else {
                        iM6981 = (i4 - C0630.m2566("᩵᩶")) * 59;
                        i6 = ((iM6981 ^ i5) * (-22931)) ^ (-1846933091);
                        i7 = 613413399;
                    }
                    break;
                case -1728851539:
                case 9709976:
                    if (C2958.f9394 >= 0) {
                        iM6981 = (i4 - C0630.m2566("᩵᩶")) * 59;
                        i6 = ((iM6981 ^ i5) * (-22931)) ^ (-1846933091);
                        i7 = 613413399;
                    } else {
                        iM6981 = (C2105.m6981("᩶֨") + i4) * (-7);
                        i6 = ((iM6981 ^ i5) * (-5321)) ^ 1855799455;
                        i7 = 1926683754;
                    }
                    break;
                case -1507706149:
                case -783321882:
                    if (C0422.m1963()) {
                        iM6981 = (i4 - C2105.m6981("ۙۘ")) * 15;
                        i6 = ((iM6981 ^ i5) * 5803) ^ (-157273858);
                        i7 = -127471739;
                    } else {
                        iM6981 = C2105.m6981("۬ܽ") ^ i4;
                        i6 = ((iM6981 ^ i5) * (-17079)) ^ 749378791;
                        i7 = -521875348;
                    }
                    break;
                case -1342626103:
                case 1179571333:
                    break;
                case -1261062701:
                case 1169463219:
                    C1294.m4372();
                    C2167.m7155();
                    iM6981 = C2105.m6981("᩺ܳ") ^ i5;
                    i6 = ((iM6981 ^ i4) * (-12275)) ^ (-27749705);
                    i7 = 1952290442;
                    break;
                case -1160520450:
                case -717700207:
                    if (C3432.f10845 >= 0) {
                        iM6981 = C2105.m6981("᩵ܶ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-9571)) ^ (-1851156516);
                        i7 = 558461201;
                    } else {
                        iM6981 = C2105.m6981("᩹ܶ") ^ i5;
                        i6 = ((iM6981 ^ i4) * 28375) ^ (-1916491881);
                        i7 = -1133252736;
                    }
                    break;
                case -945197979:
                case 1621173420:
                    C4159.m12565();
                    if (C7106.f21815 == 0) {
                        iM6981 = (i4 - C0630.m2566("᩵᩶")) * 59;
                        i6 = ((iM6981 ^ i5) * (-22931)) ^ (-1846933091);
                        i7 = 613413399;
                    } else {
                        iM6981 = C2105.m6981("᩺ܳ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-12275)) ^ (-27749705);
                        i7 = 1952290442;
                    }
                    break;
                case -822607431:
                case 1562408782:
                    if (C0422.m1963()) {
                        iM6981 = (i5 - C0630.m2566("ۡ۬")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM6981 ^ i4) * (-5705)) ^ 871155436;
                        i7 = 1831216986;
                    } else {
                        iM6981 = (i4 - C0630.m2566("᩵᩶")) * 59;
                        i6 = ((iM6981 ^ i5) * (-22931)) ^ (-1846933091);
                        i7 = 613413399;
                    }
                    break;
                case -654885108:
                case 1519645256:
                    if (C1294.f4556 >= 0) {
                        iM6981 = C2105.m6981("᩵ܶ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-9571)) ^ (-1851156516);
                        i7 = 558461201;
                    } else {
                        iM6981 = (C0630.m2566("ܺۜ") ^ i4) * 51;
                        i6 = ((iM6981 ^ i5) * 21127) ^ 1222830377;
                        i7 = -1923559731;
                    }
                    break;
                case -634380172:
                case 286626607:
                    if (C1773.f6144 <= 0) {
                        iM6981 = C2105.m6981("᩵ܶ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-9571)) ^ (-1851156516);
                        i7 = 558461201;
                    } else {
                        iM6981 = (i4 - C0630.m2566("᩵᩶")) * 59;
                        i6 = ((iM6981 ^ i5) * (-22931)) ^ (-1846933091);
                        i7 = 613413399;
                    }
                    break;
                case -576022949:
                case 692136521:
                    if (C1420.f5096 <= 0) {
                        iM6981 = C0630.m2566("᩵ܰ") ^ i4;
                        i6 = ((iM6981 ^ i5) * 29397) ^ (-434024060);
                        i7 = -1143351678;
                    } else {
                        iM6981 = C2105.m6981("ܽܿ") ^ i4;
                        i6 = ((iM6981 ^ i5) * 29111) ^ 370628193;
                        i7 = 1019895105;
                    }
                    break;
                case -19442239:
                case 218001008:
                    if (C2520.f8000 >= 0) {
                        iM6981 = C2105.m6981("᩺ܳ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-12275)) ^ (-27749705);
                        i7 = 1952290442;
                    } else {
                        iM6981 = (C2105.m6981("֫ܺ") + i5) * 115;
                        i6 = ((iM6981 ^ i4) * 5059) ^ 377521630;
                        i7 = 1762868266;
                    }
                    break;
                case 244387908:
                case 1154734551:
                    c15893 = c16475.f50651;
                    if (c15893 != null) {
                        iM6981 = (i5 - C0630.m2566("᩻ܽ")) * 91;
                        i6 = ((iM6981 ^ i4) * (-16159)) ^ 444153;
                        i7 = 835728878;
                    } else {
                        iM6981 = (C0630.m2566("ܺ֡") + i4) * 57;
                        i6 = ((iM6981 ^ i5) * (-17995)) ^ (-973823079);
                        i7 = -1959511759;
                    }
                    break;
                case 322185941:
                case 365613507:
                    if (C1128.f4106 <= 0) {
                        iM6981 = C2105.m6981("᩺ܳ") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-12275)) ^ (-27749705);
                        i7 = 1952290442;
                    } else {
                        iM6981 = (C0630.m2566("ۖܽ") + i4) * (-13);
                        i6 = ((iM6981 ^ i5) * (-22213)) ^ 1967422492;
                        i7 = -768561491;
                    }
                    break;
                case 541596815:
                case 998690106:
                    c15893.mo7980(i, i2, c16475);
                    iM6981 = (C0630.m2566("ܺ֡") + i4) * 57;
                    i6 = ((iM6981 ^ i5) * (-17995)) ^ (-973823079);
                    i7 = -1959511759;
                    break;
                case 1314851661:
                case 1899506476:
                    if (C5695.m16023() >= 0) {
                        iM6981 = (i4 - C0630.m2566("᩵᩶")) * 59;
                        i6 = ((iM6981 ^ i5) * (-22931)) ^ (-1846933091);
                        i7 = 613413399;
                    } else {
                        iM6981 = (C2105.m6981("ۧ᩸") ^ i5) * 67;
                        i6 = ((iM6981 ^ i4) * 973) ^ (-1160397733);
                        i7 = 2123708153;
                    }
                    break;
                default:
                    C0630.m2564();
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0134, code lost:
    
        if (l.C3019.m9255() > 0) goto L22;
     */
    @Override // l.ComponentCallbacksC9205
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int iM2566;
        int i;
        int i2;
        short[] sArr;
        int iM6981;
        int i3;
        int i4;
        int i5;
        int iM2567;
        int i6;
        int i7;
        int i8;
        int iM2568;
        int i9;
        short[] sArr2;
        int i10;
        C19258 c19258;
        int iM2569;
        int i11;
        int i12;
        int i13;
        int iM6982;
        int i14;
        int iM25610;
        int i15;
        final C16475 c16475 = this;
        int i16 = C4616.f14690;
        int i17 = ViewOnClickListenerC1958.f6529;
        int iM25611 = C0630.m2566("ܶۢ") ^ i16;
        int i18 = ((iM25611 ^ i17) * (-5565)) ^ (-126700358);
        String strM38819 = null;
        String strM34210 = null;
        C19258 c19259 = null;
        DialogInterface.OnClickListener onClickListener = null;
        String strM7036 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i19 = iM25611 ^ (-589179239);
        int iM12567 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int iM25612 = 0;
        int i25 = 0;
        short s = 0;
        int i26 = 0;
        int i27 = 0;
        int iM25613 = 0;
        int i28 = 163830585;
        int i29 = 0;
        ActivityC17169 activityC17169 = null;
        Bundle bundleM9254 = null;
        String strM3509 = null;
        short[] sArr6 = null;
        boolean z = false;
        int i30 = 0;
        StringBuilder sb = null;
        C18786 c18786 = null;
        while (true) {
            i28 = i19 ^ (i18 & (((i28 ^ i17) * 7511) >> 31));
            switch (i28) {
                case -2104511548:
                case -1074008274:
                    sArr6 = sArr6;
                    c19259 = c19259;
                    i5 = i21;
                    C3432.m10490(c19259, iM25613);
                    int i31 = c16475.f50641;
                    c16475.f50659 = i31;
                    int i32 = 2;
                    if (!C4159.f13567) {
                        i13 = i27;
                        iM6982 = (C2105.m6981("᩶۠") ^ i17) * 91;
                        sArr4 = sArr4;
                        i6 = ((iM6982 ^ i16) * (-9627)) ^ (-897302719);
                        i14 = -1299168613;
                        i8 = iM6982 ^ i14;
                        i27 = i13;
                        i21 = i5;
                        c19259 = c19259;
                        sArr = sArr6;
                        i19 = i8;
                        i18 = i6;
                        sArr6 = sArr;
                    } else {
                        c19259.m44429(C2405.f7665, i31, new DialogInterfaceOnClickListenerC0145(i32, c16475));
                        onClickListener = null;
                        if (C7106.f21815 != 0) {
                            iM2568 = C2105.m6981("ۗۨ") ^ i16;
                            i6 = ((iM2568 ^ i17) * (-6291)) ^ 1255160545;
                            i9 = -947430651;
                        } else {
                            iM2568 = C0630.m2566("ܰۗ") ^ i17;
                            i6 = ((iM2568 ^ i16) * (-6457)) ^ 1792425508;
                            i9 = -2027848885;
                        }
                        i8 = iM2568 ^ i9;
                        i21 = i5;
                        c19259 = c19259;
                        sArr = sArr6;
                        i19 = i8;
                        i18 = i6;
                        sArr6 = sArr;
                    }
                    break;
                case -2058278156:
                case -1645313190:
                    C1420.m4905(sb, C1294.m4373(sArr5, i24, 5, i20));
                    c18786.m43440(C0050.m947(sb));
                    return z;
                case -2016131835:
                case 1880849414:
                    sArr6 = sArr6;
                    c19259 = c19259;
                    i21 = i21;
                    i30 = i30;
                    sArr3 = sArr3;
                    z = z;
                    if (c16475.f50647) {
                        iM6981 = (C2105.m6981("ۡܰ") ^ i17) * 5;
                        i3 = ((iM6981 ^ i16) * (-27149)) ^ 1791766018;
                        i4 = 932551329;
                    } else {
                        iM6981 = C2105.m6981("ۙ֫") ^ i17;
                        i3 = ((iM6981 ^ i16) * (-19687)) ^ 124070430;
                        i4 = -18880075;
                    }
                    int i33 = iM6981 ^ i4;
                    sArr6 = sArr6;
                    i19 = i33;
                    i18 = i3;
                    z = z;
                    sArr3 = sArr3;
                    i30 = i30;
                    i21 = i21;
                    c19259 = c19259;
                    break;
                case -1992227524:
                case -1885062870:
                    i20 = 57791;
                    iM6981 = (C0630.m2566("ۧܿ") ^ i17) * (-79);
                    i3 = ((iM6981 ^ i16) * 20049) ^ 1171654476;
                    i4 = -1898323622;
                    int i34 = iM6981 ^ i4;
                    sArr6 = sArr6;
                    i19 = i34;
                    i18 = i3;
                    z = z;
                    sArr3 = sArr3;
                    i30 = i30;
                    i21 = i21;
                    c19259 = c19259;
                    break;
                case -1935214624:
                case -1680805528:
                    sArr6 = sArr6;
                    c19259 = c19259;
                    i21 = i21;
                    i30 = i30;
                    sArr3 = sArr3;
                    z = z;
                    int i35 = (s * s) + 90878089;
                    if ((i35 + i35) - (i26 * i26) >= 0) {
                        iM6981 = (C2105.m6981("ܶۤ") ^ i17) * (-83);
                        i3 = ((iM6981 ^ i16) * (-2971)) ^ 1640419663;
                        i4 = 835745817;
                    } else {
                        iM6981 = C2105.m6981("ᩳ᩺") ^ i16;
                        i3 = ((iM6981 ^ i17) * (-20455)) ^ (-707337553);
                        i4 = -1133582350;
                    }
                    int i36 = iM6981 ^ i4;
                    sArr6 = sArr6;
                    i19 = i36;
                    i18 = i3;
                    z = z;
                    sArr3 = sArr3;
                    i30 = i30;
                    i21 = i21;
                    c19259 = c19259;
                    break;
                case -1906634655:
                case 1510841216:
                    sArr6 = sArr6;
                    c19259 = c19259;
                    i5 = i21;
                    strM34210 = C14336.m34210(m38819());
                    i22 = 80;
                    if (C0798.m3007(strM34210) > 80) {
                        iM2568 = C2105.m6981("ۘۤ") ^ i17;
                        i6 = ((iM2568 ^ i16) * 20095) ^ (-1129275593);
                        i9 = 1881774275;
                    } else {
                        strM3509 = strM34210;
                        iM2568 = C0630.m2566("ۙۛ") ^ i17;
                        i6 = ((iM2568 ^ i16) * 2305) ^ (-2135674407);
                        i9 = -1955941191;
                    }
                    i8 = iM2568 ^ i9;
                    i21 = i5;
                    c19259 = c19259;
                    sArr = sArr6;
                    i19 = i8;
                    i18 = i6;
                    sArr6 = sArr;
                    break;
                case -1884097036:
                case -194747113:
                    sArr6 = sArr6;
                    if (iM12567 == (C2105.m6981(C0964.m3396(f50637, 248, 3, i20)) ^ 2120847302)) {
                        iM25610 = C2105.m6981("֡᩺") ^ i17;
                        i6 = ((iM25610 ^ i16) * (-25079)) ^ (-1365132578);
                        i15 = 1980650424;
                    } else {
                        iM25610 = C0630.m2566("ۨ᩻") ^ i16;
                        i6 = ((iM25610 ^ i17) * (-8143)) ^ 1497131700;
                        i15 = -387727092;
                    }
                    i8 = iM25610 ^ i15;
                    sArr = sArr6;
                    i19 = i8;
                    i18 = i6;
                    sArr6 = sArr;
                    break;
                case -1883970400:
                case -548811860:
                    sArr6 = sArr6;
                    c18786 = c16475.f50658;
                    sb = new StringBuilder();
                    C1420.m4905(sb, strM3509);
                    sArr5 = f50637;
                    i24 = 240;
                    if (!C3683.m11222()) {
                        iM25610 = (C0630.m2566("ۛۚ") + i16) * (-127);
                        i6 = ((iM25610 ^ i17) * 1367) ^ (-2100434250);
                        i15 = 1292796011;
                        i8 = iM25610 ^ i15;
                        sArr = sArr6;
                        i19 = i8;
                        i18 = i6;
                        sArr6 = sArr;
                    } else {
                        c19259 = c19259;
                        i21 = i21;
                        i30 = i30;
                        sArr3 = sArr3;
                        z = z;
                        iM6981 = (i16 - C0630.m2566("ۢܳ")) * (-101);
                        i3 = ((iM6981 ^ i17) * (-27597)) ^ 677901428;
                        i4 = -742530547;
                        int i37 = iM6981 ^ i4;
                        sArr6 = sArr6;
                        i19 = i37;
                        i18 = i3;
                        z = z;
                        sArr3 = sArr3;
                        i30 = i30;
                        i21 = i21;
                        c19259 = c19259;
                    }
                    break;
                case -1842388140:
                case 1756337049:
                    c16475.f50646.m36697();
                    return z;
                case -1826307303:
                case -256408589:
                    return super.onOptionsItemSelected(menuItem);
                case -1807676774:
                case 1872368244:
                    c16475.mo17428((ActivityC17169) C3683.m11214(this));
                    return z;
                case -1758731146:
                case -821547152:
                    C4117.m12364();
                    if (!C1005.f3721) {
                        c19259 = c19259;
                        int iM6983 = (i16 - C2105.m6981("ᩳۧ")) * 13;
                        i19 = iM6983 ^ (-2103097458);
                        i18 = ((iM6983 ^ i17) * 8013) ^ (-355483416);
                        sArr6 = sArr6;
                        c19259 = c19259;
                    } else {
                        sArr2 = sArr6;
                        c19258 = c19259;
                        i10 = i21;
                        iM2569 = C2105.m6981("ۢۧ") ^ i17;
                        i11 = ((iM2569 ^ i16) * (-26845)) ^ 859048293;
                        i12 = 1745847270;
                        sArr = sArr2;
                        i19 = iM2569 ^ i12;
                        i18 = i11;
                        i21 = i10;
                        c19259 = c19258;
                        sArr6 = sArr;
                    }
                    break;
                case -1744648458:
                case 646839615:
                    c19259 = c19259;
                    DialogInterface.OnClickListener onClickListener2 = onClickListener;
                    i29 = iM25612 ^ i25;
                    short[] sArr7 = f50637;
                    i23 = 3;
                    if (C2105.f7037 != 0) {
                        onClickListener = onClickListener2;
                        i21 = 237;
                        sArr6 = sArr7;
                        int iM6984 = (i16 - C2105.m6981("ᩳۧ")) * 13;
                        i19 = iM6984 ^ (-2103097458);
                        i18 = ((iM6984 ^ i17) * 8013) ^ (-355483416);
                        sArr6 = sArr6;
                        c19259 = c19259;
                    } else {
                        int iM25614 = C0630.m2566("ۘ᩻") ^ i16;
                        int i38 = ((iM25614 ^ i17) * (-10209)) ^ (-1848346664);
                        i19 = iM25614 ^ (-1679543575);
                        onClickListener = onClickListener2;
                        c19259 = c19259;
                        sArr6 = sArr7;
                        i18 = i38;
                        i21 = 237;
                    }
                    break;
                case -1704226555:
                case 141767606:
                    return super.onOptionsItemSelected(menuItem);
                case -1697220779:
                case -4474902:
                    i20 = 11930;
                    iM6981 = (C0630.m2566("ۧܿ") ^ i17) * (-79);
                    i3 = ((iM6981 ^ i16) * 20049) ^ 1171654476;
                    i4 = -1898323622;
                    int i39 = iM6981 ^ i4;
                    sArr6 = sArr6;
                    i19 = i39;
                    i18 = i3;
                    z = z;
                    sArr3 = sArr3;
                    i30 = i30;
                    i21 = i21;
                    c19259 = c19259;
                    break;
                case -1679290040:
                case -1323517522:
                    C0050.m940();
                    if (C1047.f3863 < 0) {
                        sArr6 = sArr6;
                        c19259 = c19259;
                        i21 = i21;
                        i30 = i30;
                        sArr3 = sArr3;
                        z = z;
                        iM6981 = (i16 - C0630.m2566("ۢܳ")) * (-101);
                        i3 = ((iM6981 ^ i17) * (-27597)) ^ 677901428;
                        i4 = -742530547;
                        int i310 = iM6981 ^ i4;
                        sArr6 = sArr6;
                        i19 = i310;
                        i18 = i3;
                        z = z;
                        sArr3 = sArr3;
                        i30 = i30;
                        i21 = i21;
                        c19259 = c19259;
                    }
                    c19259 = c19259;
                    int iM6985 = (i16 - C2105.m6981("ᩳۧ")) * 13;
                    i19 = iM6985 ^ (-2103097458);
                    i18 = ((iM6985 ^ i17) * 8013) ^ (-355483416);
                    sArr6 = sArr6;
                    c19259 = c19259;
                    break;
                case -1651904657:
                case 343016751:
                    sArr2 = sArr6;
                    i10 = i21;
                    ActivityC0737 activityC0737M2429 = RunnableC0588.m2429(this);
                    int i40 = DialogInterfaceC0206.f1451;
                    c19258 = new C19258(activityC0737M2429);
                    sArr4 = f50637;
                    i27 = 231;
                    if (C3245.f10203 <= 0) {
                        iM2569 = C2105.m6981("ۢۧ") ^ i17;
                        i11 = ((iM2569 ^ i16) * (-26845)) ^ 859048293;
                        i12 = 1745847270;
                    } else {
                        iM2569 = (C0630.m2566("ܿ᩸") ^ i17) * (-27);
                        i11 = ((iM2569 ^ i16) * (-2459)) ^ (-568234072);
                        i12 = -499289550;
                    }
                    sArr = sArr2;
                    i19 = iM2569 ^ i12;
                    i18 = i11;
                    i21 = i10;
                    c19259 = c19258;
                    sArr6 = sArr;
                    break;
                case -1525545584:
                case -157522143:
                    sArr6 = sArr6;
                    c19259 = c19259;
                    i5 = i21;
                    int i41 = i30;
                    short[] sArr8 = sArr3;
                    z = true;
                    if (iM12567 == (C2105.m6981(strM7036) ^ 2130617149)) {
                        iM2567 = (C2105.m6981("ᩴۧ") ^ i16) * 69;
                        i6 = ((iM2567 ^ i17) * 14957) ^ 1059390933;
                        i7 = -1556853610;
                    } else {
                        iM2567 = (i16 - C0630.m2566("ۙۙ")) * 89;
                        i6 = ((iM2567 ^ i17) * 29639) ^ 1886075671;
                        i7 = 1592516721;
                    }
                    i8 = iM2567 ^ i7;
                    sArr3 = sArr8;
                    i30 = i41;
                    i21 = i5;
                    c19259 = c19259;
                    sArr = sArr6;
                    i19 = i8;
                    i18 = i6;
                    sArr6 = sArr;
                    break;
                case -1523924560:
                case -763488593:
                    sArr6 = sArr6;
                    if (iM12567 == (C0630.m2566(C4263.m12817(f50637, Scalar25519.TARGET_LENGTH, 3, i20)) ^ 2119793875)) {
                        iM25610 = C0630.m2566("֫᩵") ^ i17;
                        i6 = ((iM25610 ^ i16) * (-843)) ^ (-1469830580);
                        i15 = 62204797;
                    } else {
                        iM25610 = C2105.m6981("ۚ֨") ^ i16;
                        i6 = ((iM25610 ^ i17) * (-5963)) ^ 525062696;
                        i15 = -796022336;
                    }
                    i8 = iM25610 ^ i15;
                    sArr = sArr6;
                    i19 = i8;
                    i18 = i6;
                    sArr6 = sArr;
                    break;
                case -1426287504:
                case -364456941:
                    sArr6 = sArr6;
                    c19259 = c19259;
                    i21 = i21;
                    i30 = i30;
                    sArr3 = sArr3;
                    z = z;
                    iM12567 = C4159.m12567(menuItem);
                    strM7036 = C2126.m7036(f50637, 213, 3, i20);
                    if (C0422.m1963()) {
                        iM6981 = (C2105.m6981("۫ᩳ") + i16) * 47;
                        i3 = ((iM6981 ^ i17) * (-9165)) ^ 1183626796;
                        i4 = -365528839;
                    } else {
                        iM6981 = (i16 - C0630.m2566("ۢܳ")) * (-101);
                        i3 = ((iM6981 ^ i17) * (-27597)) ^ 677901428;
                        i4 = -742530547;
                    }
                    int i311 = iM6981 ^ i4;
                    sArr6 = sArr6;
                    i19 = i311;
                    i18 = i3;
                    z = z;
                    sArr3 = sArr3;
                    i30 = i30;
                    i21 = i21;
                    c19259 = c19259;
                    break;
                case -1377601718:
                case 1332656665:
                    C0714.m2805();
                    sArr2 = sArr6;
                    c19258 = c19259;
                    i10 = i21;
                    iM2569 = C2105.m6981("ۢۧ") ^ i17;
                    i11 = ((iM2569 ^ i16) * (-26845)) ^ 859048293;
                    i12 = 1745847270;
                    sArr = sArr2;
                    i19 = iM2569 ^ i12;
                    i18 = i11;
                    i21 = i10;
                    c19259 = c19258;
                    sArr6 = sArr;
                    break;
                case -1117846902:
                case 633840510:
                    int iM25615 = C0630.m2566(C1128.m3841(sArr6, i21, i23, i20)) ^ 2101236312;
                    DialogInterface.OnClickListener onClickListener3 = onClickListener;
                    final DialogInterfaceC0206 dialogInterfaceC0206M19253 = C7187.m19253(c19259, iM25615, onClickListener3, i29, onClickListener3);
                    C2126.m7039(C21923.m49343(dialogInterfaceC0206M19253), new View.OnClickListener() { // from class: l.ۨ᩻ۢ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C16475.m38791(this.f36002, dialogInterfaceC0206M19253);
                        }
                    });
                    return z;
                case -1081474540:
                case -857617111:
                    sArr6 = sArr6;
                    c19259 = c19259;
                    i5 = i21;
                    activityC17169 = (ActivityC17169) C3683.m11214(this);
                    strM38819 = m38819();
                    bundleM9254 = C3019.m9254(this);
                    sArr3 = f50637;
                    i30 = 219;
                    if (C0382.f1805) {
                        iM2568 = C0630.m2566("ۛۜ") ^ i17;
                        i6 = ((iM2568 ^ i16) * 27133) ^ (-158703210);
                        i9 = 150098030;
                    } else {
                        iM2568 = C2105.m6981("ۜ۬") ^ i16;
                        i6 = ((iM2568 ^ i17) * (-10195)) ^ (-1458468280);
                        i9 = -1957137894;
                    }
                    i8 = iM2568 ^ i9;
                    i21 = i5;
                    c19259 = c19259;
                    sArr = sArr6;
                    i19 = i8;
                    i18 = i6;
                    sArr6 = sArr;
                    break;
                case -1032223724:
                case -682963710:
                    sArr6 = sArr6;
                    c19259 = c19259;
                    i5 = i21;
                    sArr4 = sArr4;
                    i13 = i27;
                    iM25613 = C0630.m2566(C3663.m11162(sArr4, i13, 3, i20)) ^ 2097465187;
                    if (AbstractC2021.f6743 <= 0) {
                        iM6982 = (C2105.m6981("᩶۠") ^ i17) * 91;
                        sArr4 = sArr4;
                        i6 = ((iM6982 ^ i16) * (-9627)) ^ (-897302719);
                        i14 = -1299168613;
                    } else {
                        sArr4 = sArr4;
                        iM6982 = C2105.m6981("ܽ֫") ^ i16;
                        i6 = ((iM6982 ^ i17) * (-20257)) ^ 479637517;
                        i14 = -1540060406;
                    }
                    i8 = iM6982 ^ i14;
                    i27 = i13;
                    i21 = i5;
                    c19259 = c19259;
                    sArr = sArr6;
                    i19 = i8;
                    i18 = i6;
                    sArr6 = sArr;
                    break;
                case -1012355766:
                case 604694520:
                    sArr6 = sArr6;
                    strM3509 = C1005.m3509(strM34210, 0, i22);
                    c19259 = c19259;
                    i5 = i21;
                    iM2568 = C0630.m2566("ۙۛ") ^ i17;
                    i6 = ((iM2568 ^ i16) * 2305) ^ (-2135674407);
                    i9 = -1955941191;
                    i8 = iM2568 ^ i9;
                    i21 = i5;
                    c19259 = c19259;
                    sArr = sArr6;
                    i19 = i8;
                    i18 = i6;
                    sArr6 = sArr;
                    break;
                case -963253012:
                case 1868059282:
                    break;
                case -916912747:
                case 1975850354:
                    if (AbstractC2021.f6743 > 0) {
                        sArr6 = sArr6;
                        c19259 = c19259;
                        i5 = i21;
                        i13 = i27;
                        iM6982 = (C2105.m6981("᩶۠") ^ i17) * 91;
                        sArr4 = sArr4;
                        i6 = ((iM6982 ^ i16) * (-9627)) ^ (-897302719);
                        i14 = -1299168613;
                        i8 = iM6982 ^ i14;
                        i27 = i13;
                        i21 = i5;
                        c19259 = c19259;
                        sArr = sArr6;
                        i19 = i8;
                        i18 = i6;
                        sArr6 = sArr;
                    }
                    sArr6 = sArr6;
                    c19259 = c19259;
                    i5 = i21;
                    iM2568 = C2105.m6981("ۜ۬") ^ i16;
                    i6 = ((iM2568 ^ i17) * (-10195)) ^ (-1458468280);
                    i9 = -1957137894;
                    i8 = iM2568 ^ i9;
                    i21 = i5;
                    c19259 = c19259;
                    sArr = sArr6;
                    i19 = i8;
                    i18 = i6;
                    sArr6 = sArr;
                    break;
                case -833032353:
                case 1249999055:
                    sArr6 = sArr6;
                    if (iM12567 == (C2105.m6981(C1128.m3841(f50637, 251, 3, i20)) ^ 2118636906)) {
                        iM25610 = C2105.m6981("ܰۘ") ^ i17;
                        i6 = ((iM25610 ^ i16) * (-16729)) ^ (-1818075113);
                        i15 = -1067300091;
                    } else {
                        iM25610 = (C2105.m6981("ۧۚ") + i16) * 75;
                        i6 = ((iM25610 ^ i17) * (-22659)) ^ (-1730528367);
                        i15 = -1959468354;
                    }
                    i8 = iM25610 ^ i15;
                    sArr = sArr6;
                    i19 = i8;
                    i18 = i6;
                    sArr6 = sArr;
                    break;
                case -796949963:
                case -690801201:
                    sArr6 = sArr6;
                    if (iM12567 == (C2105.m6981(C1916.m6311(f50637, 245, 3, i20)) ^ 2104150345)) {
                        iM25610 = C2105.m6981("ᩴۚ") ^ i16;
                        i6 = ((iM25610 ^ i17) * 24965) ^ (-1485944552);
                        i15 = -1265137806;
                    } else {
                        iM25610 = C0630.m2566("ܰ֫") ^ i17;
                        i6 = ((iM25610 ^ i16) * (-643)) ^ 1367299775;
                        i15 = -611207752;
                    }
                    i8 = iM25610 ^ i15;
                    sArr = sArr6;
                    i19 = i8;
                    i18 = i6;
                    sArr6 = sArr;
                    break;
                case -754828581:
                case 765572047:
                    c19259 = c19259;
                    sArr6 = sArr6;
                    i5 = i21;
                    iM25612 = C0630.m2566(C4616.m13542(f50637, 234, 3, i20));
                    i25 = 2125720636;
                    if (C4263.f13799 > 0) {
                        iM2568 = (i16 - C2105.m6981("ۛۙ")) * (-31);
                        i6 = ((iM2568 ^ i17) * (-3239)) ^ (-620393852);
                        i9 = 1775725085;
                        i8 = iM2568 ^ i9;
                        i21 = i5;
                        c19259 = c19259;
                        sArr = sArr6;
                        i19 = i8;
                        i18 = i6;
                        sArr6 = sArr;
                    } else {
                        i21 = i5;
                        sArr6 = sArr6;
                        int iM6986 = (i16 - C2105.m6981("ᩳۧ")) * 13;
                        i19 = iM6986 ^ (-2103097458);
                        i18 = ((iM6986 ^ i17) * 8013) ^ (-355483416);
                        sArr6 = sArr6;
                        c19259 = c19259;
                    }
                    break;
                case -516137164:
                case 1220012379:
                    if (C2105.f7037 != 0) {
                        iM2566 = (C2105.m6981("᩹ۡ") ^ i17) * 115;
                        i = ((iM2566 ^ i16) * (-31103)) ^ (-857195637);
                        i2 = 95415741;
                    } else {
                        iM2566 = (C2105.m6981("۟ۖ") ^ i17) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM2566 ^ i16) * (-6361)) ^ 69945926;
                        i2 = -1321311256;
                    }
                    i19 = iM2566 ^ i2;
                    i18 = i;
                    break;
                case -497815522:
                case -94704075:
                    sArr6 = sArr6;
                    c19259 = c19259;
                    i21 = i21;
                    i30 = i30;
                    sArr3 = sArr3;
                    z = z;
                    short s2 = f50637[212];
                    int i42 = s2 + 9533;
                    if (C0630.f2410 > 0) {
                        int iM6987 = (i16 - C2105.m6981("ۗۖ")) * (-101);
                        s = s2;
                        i26 = i42;
                        z = z;
                        sArr3 = sArr3;
                        i18 = ((iM6987 ^ i17) * 16077) ^ 243866388;
                        i30 = i30;
                        i21 = i21;
                        c16475 = this;
                        c19259 = c19259;
                        sArr = sArr6;
                        i19 = iM6987 ^ 602376531;
                        sArr6 = sArr;
                    } else {
                        s = s2;
                        i26 = i42;
                        iM6981 = (i16 - C0630.m2566("ۢܳ")) * (-101);
                        i3 = ((iM6981 ^ i17) * (-27597)) ^ 677901428;
                        i4 = -742530547;
                        int i312 = iM6981 ^ i4;
                        sArr6 = sArr6;
                        i19 = i312;
                        i18 = i3;
                        z = z;
                        sArr3 = sArr3;
                        i30 = i30;
                        i21 = i21;
                        c19259 = c19259;
                    }
                    break;
                case -489865311:
                case 602570242:
                    sArr6 = sArr6;
                    c19259 = c19259;
                    i5 = i21;
                    if (iM12567 == (C0630.m2566(C1128.m3841(f50637, 228, 3, i20)) ^ 2098885616)) {
                        iM2568 = (C0630.m2566("۬۬") + i17) * (-23);
                        i6 = ((iM2568 ^ i16) * 13993) ^ 1004965664;
                        i9 = -1744853642;
                    } else {
                        iM2568 = (i16 - C0630.m2566("ۚܳ")) * (-29);
                        i6 = ((iM2568 ^ i17) * (-6213)) ^ 148706220;
                        i9 = 1286547104;
                    }
                    i8 = iM2568 ^ i9;
                    i21 = i5;
                    c19259 = c19259;
                    sArr = sArr6;
                    i19 = i8;
                    i18 = i6;
                    sArr6 = sArr;
                    break;
                case -414712327:
                case 1510549246:
                    c16475.f50646.mo11728();
                    return z;
                case -164188914:
                case 1605306155:
                    sArr6 = sArr6;
                    if (iM12567 == (C0630.m2566(C0237.m1483(f50637, 257, 3, i20)) ^ 2098769601)) {
                        iM25610 = C2105.m6981("᩸ܰ") ^ i16;
                        i6 = ((iM25610 ^ i17) * 19835) ^ (-1786266608);
                        i15 = 141488659;
                    } else {
                        iM25610 = C2105.m6981("۠᩶") ^ i17;
                        i6 = ((iM25610 ^ i16) * (-21283)) ^ 1319993870;
                        i15 = -834086236;
                    }
                    i8 = iM25610 ^ i15;
                    sArr = sArr6;
                    i19 = i8;
                    i18 = i6;
                    sArr6 = sArr;
                    break;
                case 356882123:
                case 1987047813:
                    sArr6 = sArr6;
                    c19259 = c19259;
                    i5 = i21;
                    if (iM12567 == (C2105.m6981(C0714.m2816(f50637, HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS, 3, i20)) ^ 2128790537)) {
                        iM2568 = (i16 - C2105.m6981("ۗᩳ")) * (-79);
                        i6 = ((iM2568 ^ i17) * 25731) ^ 684648793;
                        i9 = -1849281429;
                    } else {
                        iM2568 = C0630.m2566("֫᩸") ^ i17;
                        i6 = ((iM2568 ^ i16) * (-17715)) ^ (-1026735311);
                        i9 = 2009665560;
                    }
                    i8 = iM2568 ^ i9;
                    i21 = i5;
                    c19259 = c19259;
                    sArr = sArr6;
                    i19 = i8;
                    i18 = i6;
                    sArr6 = sArr;
                    break;
                case 421432743:
                case 703570641:
                    sArr6 = sArr6;
                    short[] sArr9 = sArr3;
                    c19259 = c19259;
                    i21 = i21;
                    i30 = i30;
                    z = z;
                    sArr3 = sArr9;
                    if (iM12567 == (C0630.m2566(C2167.m7159(f50637, 216, 3, i20)) ^ 2102892541)) {
                        iM6981 = C0630.m2566("ۤۙ") ^ i17;
                        i3 = ((iM6981 ^ i16) * (-8405)) ^ 1182514743;
                        i4 = -629643229;
                    } else {
                        iM6981 = (i16 - C0630.m2566("᩻᩶")) * (-101);
                        i3 = ((iM6981 ^ i17) * (-30585)) ^ 1616175166;
                        i4 = -1402274836;
                    }
                    int i313 = iM6981 ^ i4;
                    sArr6 = sArr6;
                    i19 = i313;
                    i18 = i3;
                    z = z;
                    sArr3 = sArr3;
                    i30 = i30;
                    i21 = i21;
                    c19259 = c19259;
                    break;
                case 532177878:
                case 573390710:
                    c16475.f50646.m36676(ActivityC2953.class);
                    return z;
                case 785782635:
                case 2020378766:
                    c16475.f50646.m36696();
                    return z;
                case 797847338:
                case 1803927928:
                    RunnableC3474.m10630();
                    if (C3746.m11369() < 0) {
                        iM2566 = (C2105.m6981("᩹ۡ") ^ i17) * 115;
                        i = ((iM2566 ^ i16) * (-31103)) ^ (-857195637);
                        i2 = 95415741;
                        i19 = iM2566 ^ i2;
                        i18 = i;
                    } else {
                        sArr6 = sArr6;
                        c19259 = c19259;
                        i5 = i21;
                        iM2568 = C2105.m6981("ۜ۬") ^ i16;
                        i6 = ((iM2568 ^ i17) * (-10195)) ^ (-1458468280);
                        i9 = -1957137894;
                        i8 = iM2568 ^ i9;
                        i21 = i5;
                        c19259 = c19259;
                        sArr = sArr6;
                        i19 = i8;
                        i18 = i6;
                        sArr6 = sArr;
                    }
                    break;
                case 1426640340:
                case 1801388542:
                    C0964.m3413();
                    if (C4616.f14690 > 0) {
                        iM2566 = C0630.m2566("ۨۗ") ^ i16;
                        i = ((iM2566 ^ i17) * 18787) ^ 1906879798;
                        i2 = -533795133;
                        i19 = iM2566 ^ i2;
                        i18 = i;
                    } else {
                        sArr2 = sArr6;
                        c19258 = c19259;
                        i10 = i21;
                        iM2569 = C2105.m6981("ۢۧ") ^ i17;
                        i11 = ((iM2569 ^ i16) * (-26845)) ^ 859048293;
                        i12 = 1745847270;
                        sArr = sArr2;
                        i19 = iM2569 ^ i12;
                        i18 = i11;
                        i21 = i10;
                        c19259 = c19258;
                        sArr6 = sArr;
                    }
                    break;
                case 1469465952:
                case 1556346733:
                    c16475.f50655.m46591();
                    return z;
                case 1557212984:
                case 1900378512:
                    activityC17169.m40342(strM38819, C7106.m19112(bundleM9254, C4616.m13542(sArr3, i30, 6, i20)), m38822(), z);
                    return z;
                default:
                    C0714.m2805();
                    C7106.m19120();
                    return false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x0185 A[PHI: r8 r9
      0x0185: PHI (r8v4 java.lang.Integer) = (r8v3 java.lang.Integer), (r8v2 java.lang.Integer), (r8v2 java.lang.Integer) binds: [B:44:0x0183, B:16:0x0094, B:14:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x0185: PHI (r9v4 l.۫ۨᩳ) = (r9v3 l.۫ۨᩳ), (r9v2 l.۫ۨᩳ), (r9v2 l.۫ۨᩳ) binds: [B:44:0x0183, B:16:0x0094, B:14:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0209 A[PHI: r5
      0x0209: PHI (r5v4 int) = (r5v3 int), (r5v2 int) binds: [B:54:0x01f1, B:23:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x023c  */
    /* JADX WARN: Code duplicated, block: B:73:0x02e3 A[PHI: r12 r16 r17
      0x02e3: PHI (r12v4 char) = (r12v2 char), (r12v3 char), (r12v2 char) binds: [B:72:0x02e1, B:32:0x0117, B:7:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x02e3: PHI (r16v4 int) = (r16v3 int), (r16v2 int), (r16v2 int) binds: [B:72:0x02e1, B:32:0x0117, B:7:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x02e3: PHI (r17v4 short) = (r17v3 short), (r17v2 short), (r17v2 short) binds: [B:72:0x02e1, B:32:0x0117, B:7:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x0339 A[PHI: r10 r18 r19 r24
      0x0339: PHI (r10v4 java.lang.Integer) = 
      (r10v2 java.lang.Integer)
      (r10v2 java.lang.Integer)
      (r10v3 java.lang.Integer)
      (r10v2 java.lang.Integer)
      (r10v2 java.lang.Integer)
     binds: [B:80:0x0337, B:76:0x0319, B:40:0x015f, B:14:0x0090, B:10:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0339: PHI (r18v4 short[]) = (r18v3 short[]), (r18v2 short[]), (r18v2 short[]), (r18v2 short[]), (r18v2 short[]) binds: [B:80:0x0337, B:76:0x0319, B:40:0x015f, B:14:0x0090, B:10:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0339: PHI (r19v4 int) = (r19v2 int), (r19v3 int), (r19v2 int), (r19v2 int), (r19v2 int) binds: [B:80:0x0337, B:76:0x0319, B:40:0x015f, B:14:0x0090, B:10:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0339: PHI (r24v5 short) = (r24v3 short), (r24v4 short), (r24v3 short), (r24v3 short), (r24v3 short) binds: [B:80:0x0337, B:76:0x0319, B:40:0x015f, B:14:0x0090, B:10:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x0369 A[PHI: r6 r7 r11 r15
      0x0369: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:84:0x0367, B:48:0x01be, B:36:0x0136, B:28:0x00f3] A[DONT_GENERATE, DONT_INLINE]
      0x0369: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:84:0x0367, B:48:0x01be, B:36:0x0136, B:28:0x00f3] A[DONT_GENERATE, DONT_INLINE]
      0x0369: PHI (r11v4 java.lang.Object[]) = (r11v2 java.lang.Object[]), (r11v2 java.lang.Object[]), (r11v3 java.lang.Object[]), (r11v2 java.lang.Object[]) binds: [B:84:0x0367, B:48:0x01be, B:36:0x0136, B:28:0x00f3] A[DONT_GENERATE, DONT_INLINE]
      0x0369: PHI (r15v3 short[]) = (r15v2 short[]), (r15v2 short[]), (r15v2 short[]), (r15v4 short[]) binds: [B:84:0x0367, B:48:0x01be, B:36:0x0136, B:28:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.InterfaceC20834
    /* JADX INFO: renamed from: ֫ */
    public final void mo17422(int i, int i2, String str) {
        int iM2566;
        int i3;
        int i4;
        int i5 = C2167.f7158;
        int i6 = ServiceConnectionC3453.f10921;
        int iM2567 = (C0630.m2566("ۚ᩷") + i5) * 71;
        int i7 = ((iM2567 ^ i6) * (-5287)) ^ (-1028078076);
        Object[] objArr = null;
        short[] sArr = null;
        int i8 = iM2567 ^ (-102675917);
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        short s = 0;
        int i13 = 0;
        int i14 = 1022506720;
        short s2 = 0;
        Integer numM4916 = null;
        short[] sArr2 = null;
        char c = 0;
        C12392 c12392 = null;
        Integer numM4917 = null;
        int iM30420 = 0;
        while (true) {
            i14 = i8 ^ (i7 & (((i14 ^ i6) * 20013) >> 31));
            switch (i14) {
                case -2102158542:
                case 1625763982:
                    this.f50639 = String.format(C0630.m2575(sArr, 306, 14, i11), objArr);
                    iM2566 = (i6 - C2105.m6981("ۖ᩹")) * 57;
                    i3 = ((iM2566 ^ i5) * (-14695)) ^ (-524812171);
                    i4 = 1949860883;
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    break;
                case -2035928113:
                case 1423804883:
                    i11 = 35475;
                    iM2566 = C0630.m2566("᩹ܳ") ^ i5;
                    i3 = ((iM2566 ^ i6) * 4925) ^ 2127341229;
                    i4 = 1029658692;
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    break;
                case -2026491253:
                case -171910418:
                    break;
                case -1824229758:
                case -1334865274:
                    s2 = sArr2[305];
                    i13 = s2 * s2;
                    if (AbstractC2021.m6574()) {
                        iM2566 = (i6 - C2105.m6981("ۛܽ")) * 109;
                        i3 = ((iM2566 ^ i5) * 26047) ^ 1574756989;
                        i4 = -567967247;
                    } else {
                        iM2566 = (i5 - C2105.m6981("ۙ۠")) * (-107);
                        i3 = ((iM2566 ^ i6) * (-18167)) ^ (-1805797682);
                        i4 = -939463892;
                    }
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    break;
                case -1738495771:
                case -5418765:
                    numM4917 = C1420.m4916(iM30420);
                    c12392 = this.f50649;
                    if (C0964.f3626 != 0) {
                        iM2566 = C2105.m6981("ܽ᩸") ^ i5;
                        i3 = ((iM2566 ^ i6) * 14153) ^ 536484526;
                        i4 = -169809184;
                    } else {
                        iM2566 = (C2105.m6981("ۢ۠") ^ i5) * (-5);
                        i3 = ((iM2566 ^ i6) * 19583) ^ (-1324843718);
                        i4 = -1348785469;
                    }
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    break;
                case -1652498497:
                case 1665278086:
                    C0714.m2805();
                    if (C11340.f33930 >= 0) {
                        iM2566 = (C0630.m2566("֡᩹") ^ i5) * 59;
                        i3 = ((iM2566 ^ i6) * (-28225)) ^ (-1940322704);
                        i4 = -1199795873;
                    } else {
                        iM2566 = C2105.m6981("ᩴۧ") ^ i6;
                        i3 = ((iM2566 ^ i5) * 20515) ^ (-860197333);
                        i4 = 558342873;
                    }
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    break;
                case -1495938625:
                case -1096656922:
                    if (C3432.f10845 >= 0) {
                        iM2566 = C0630.m2566("ۧۘ") ^ i6;
                        i3 = ((iM2566 ^ i5) * (-13159)) ^ (-918651242);
                        i4 = 1903687198;
                    } else {
                        iM2566 = (C0630.m2566("ᩳۖ") + i5) * (-35);
                        i3 = ((iM2566 ^ i6) * 21127) ^ 1429700042;
                        i4 = 477483397;
                    }
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    break;
                case -1472764481:
                case 1152457605:
                    objArr[c] = str;
                    sArr = f50637;
                    if (C0798.m2998() != 0) {
                        iM2566 = C0630.m2566("ۧۘ") ^ i6;
                        i3 = ((iM2566 ^ i5) * (-13159)) ^ (-918651242);
                        i4 = 1903687198;
                    } else {
                        iM2566 = (C0630.m2566("ܺ֡") ^ i5) * (-65);
                        i3 = ((iM2566 ^ i6) * (-31293)) ^ 1290894225;
                        i4 = -1310193999;
                    }
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    break;
                case -1365422475:
                case -655828189:
                    if (C3537.f11231 >= 0) {
                        iM2566 = C2105.m6981("ܽ᩸") ^ i5;
                        i3 = ((iM2566 ^ i6) * 14153) ^ 536484526;
                        i4 = -169809184;
                    } else {
                        iM2566 = (i6 - C2105.m6981("ۛܽ")) * 109;
                        i3 = ((iM2566 ^ i5) * 26047) ^ 1574756989;
                        i4 = -567967247;
                    }
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    break;
                case -1258390489:
                case 653882166:
                    if (i2 == i9) {
                        iM2566 = (i5 - C2105.m6981("ܽܽ")) * 87;
                        i3 = ((iM2566 ^ i6) * 2579) ^ 673411404;
                        i4 = -578047288;
                    } else {
                        iM2566 = (C2105.m6981("ܺۜ") ^ i6) * 63;
                        i3 = ((iM2566 ^ i5) * 30425) ^ (-1647188208);
                        i4 = 1254103159;
                    }
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    break;
                case -1246109255:
                case 1422663584:
                    sArr2 = f50637;
                    if (C2126.f7087) {
                        iM2566 = (i6 - C2105.m6981("ۛܽ")) * 109;
                        i3 = ((iM2566 ^ i5) * 26047) ^ 1574756989;
                        i4 = -567967247;
                    } else {
                        iM2566 = C0630.m2566("۫᩸") ^ i6;
                        i3 = ((iM2566 ^ i5) * 26335) ^ 935108577;
                        i4 = 2142466847;
                    }
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    break;
                case -1221061130:
                case 1832488456:
                    m38817();
                    break;
                case -1209747079:
                case 1858815307:
                    numM4916 = C1420.m4916(c12392.m30420(i2) + i10);
                    if (C1916.m6308() >= 0) {
                        iM2566 = (i6 - C2105.m6981("ۛܽ")) * 109;
                        i3 = ((iM2566 ^ i5) * 26047) ^ 1574756989;
                        i4 = -567967247;
                    } else {
                        iM2566 = (C0630.m2566("ۤ᩻") ^ i6) * 13;
                        i3 = ((iM2566 ^ i5) * 12877) ^ 951784945;
                        i4 = 1977927331;
                    }
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    break;
                case -1082479750:
                case -516952505:
                    int i15 = i13 + 54287424;
                    i12 = i15 + i15;
                    s = 7368;
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = C2105.m6981("ᩴۧ") ^ i6;
                        i3 = ((iM2566 ^ i5) * 20515) ^ (-860197333);
                        i4 = 558342873;
                    } else {
                        iM2566 = C2105.m6981("ۡۜ") ^ i6;
                        i3 = ((iM2566 ^ i5) * 11957) ^ (-148343420);
                        i4 = 227501155;
                    }
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    break;
                case -1056494004:
                case 976243706:
                    if (i == 0) {
                        iM2566 = (C2105.m6981("ܶ᩷") ^ i5) * 67;
                        i3 = ((iM2566 ^ i6) * 9847) ^ 649573460;
                        i4 = -577291895;
                    } else {
                        iM2566 = C2105.m6981("۫ۚ") ^ i5;
                        i3 = ((iM2566 ^ i6) * (-19149)) ^ (-386443351);
                        i4 = -1933503491;
                    }
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    break;
                case -961938943:
                case 437110937:
                    i10 = 1;
                    iM30420 = this.f50649.m30420(i) + 1;
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = C0630.m2566("ۧۘ") ^ i6;
                        i3 = ((iM2566 ^ i5) * (-13159)) ^ (-918651242);
                        i4 = 1903687198;
                    } else {
                        iM2566 = C0630.m2566("۠ۙ") ^ i6;
                        i3 = ((iM2566 ^ i5) * 19163) ^ (-41862749);
                        i4 = 324697722;
                    }
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    break;
                case -855064448:
                case 26303298:
                    this.f50639 = str;
                    iM2566 = (i6 - C2105.m6981("ۖ᩹")) * 57;
                    i3 = ((iM2566 ^ i5) * (-14695)) ^ (-524812171);
                    i4 = 1949860883;
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    break;
                case -853718906:
                case 750165021:
                    C1005.m3501();
                    break;
                case -843879078:
                case 190565630:
                    if (C4263.m12819() < 0) {
                        iM2566 = (i6 - C2105.m6981("ۛܽ")) * 109;
                        i3 = ((iM2566 ^ i5) * 26047) ^ 1574756989;
                        i4 = -567967247;
                    } else {
                        iM2566 = (C0630.m2566("֡᩹") ^ i5) * 59;
                        i3 = ((iM2566 ^ i6) * (-28225)) ^ (-1940322704);
                        i4 = -1199795873;
                    }
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    break;
                case -525496835:
                case -512209656:
                    int i16 = s2 + s;
                    if ((i16 * i16) - i12 <= 0) {
                        iM2566 = (C0630.m2566("ܳۚ") + i6) * (-93);
                        i3 = ((iM2566 ^ i5) * 6053) ^ (-619692461);
                        i4 = 1866364426;
                    } else {
                        iM2566 = C0630.m2566("ܳ֡") ^ i5;
                        i3 = ((iM2566 ^ i6) * 10193) ^ 979133477;
                        i4 = 282543998;
                    }
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    break;
                case -469045320:
                case 1214019145:
                    if (this.f50644) {
                        iM2566 = C2105.m6981("ܰ᩹") ^ i6;
                        i3 = ((iM2566 ^ i5) * (-24097)) ^ 840204215;
                        i4 = -691583037;
                    } else {
                        iM2566 = (C0630.m2566("۫ᩴ") + i6) * 57;
                        i3 = ((iM2566 ^ i5) * 20589) ^ 148673102;
                        i4 = 1146977114;
                    }
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    break;
                case -381663034:
                case 1435976340:
                    i9 = -1;
                    if (i == -1) {
                        iM2566 = C2105.m6981("᩵۫") ^ i6;
                        i3 = ((iM2566 ^ i5) * 32345) ^ 268666705;
                        i4 = 1477096001;
                    } else {
                        iM2566 = (C2105.m6981("ܺۜ") ^ i6) * 63;
                        i3 = ((iM2566 ^ i5) * 30425) ^ (-1647188208);
                        i4 = 1254103159;
                    }
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    break;
                case -37435191:
                case 1460090698:
                    this.f50639 = null;
                    iM2566 = (i6 - C2105.m6981("ۖ᩹")) * 57;
                    i3 = ((iM2566 ^ i5) * (-14695)) ^ (-524812171);
                    i4 = 1949860883;
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    break;
                case 542375172:
                case 2082480895:
                    objArr[0] = numM4917;
                    objArr[i10] = numM4916;
                    c = 2;
                    if (C21923.f70183 != 0) {
                        iM2566 = C2105.m6981("ᩴۧ") ^ i6;
                        i3 = ((iM2566 ^ i5) * 20515) ^ (-860197333);
                        i4 = 558342873;
                    } else {
                        iM2566 = C0630.m2566("ۧ֨") ^ i6;
                        i3 = ((iM2566 ^ i5) * (-8667)) ^ (-1540243063);
                        i4 = 1153452910;
                    }
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    break;
                case 579107914:
                case 990932711:
                    C1711.m5736();
                    C21923.m49329();
                    iM2566 = C2105.m6981("ܽ᩸") ^ i5;
                    i3 = ((iM2566 ^ i6) * 14153) ^ 536484526;
                    i4 = -169809184;
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    break;
                case 888922576:
                case 2104459416:
                    objArr = new Object[3];
                    if (C21923.f70183 != 0) {
                        iM2566 = C0630.m2566("ۧۘ") ^ i6;
                        i3 = ((iM2566 ^ i5) * (-13159)) ^ (-918651242);
                        i4 = 1903687198;
                    } else {
                        iM2566 = (C2105.m6981("֡ܽ") + i5) * 19;
                        i3 = ((iM2566 ^ i6) * 7669) ^ (-1912764971);
                        i4 = 19537602;
                    }
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    break;
                case 1002216699:
                case 1010292156:
                    if (i2 == 0) {
                        iM2566 = C0630.m2566("ۙ۫") ^ i5;
                        i3 = ((iM2566 ^ i6) * (-3657)) ^ 1959053055;
                        i4 = -1907269538;
                    } else {
                        iM2566 = C2105.m6981("۫ۚ") ^ i5;
                        i3 = ((iM2566 ^ i6) * (-19149)) ^ (-386443351);
                        i4 = -1933503491;
                    }
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    break;
                default:
                    i11 = 51953;
                    iM2566 = C0630.m2566("᩹ܳ") ^ i5;
                    i3 = ((iM2566 ^ i6) * 4925) ^ 2127341229;
                    i4 = 1029658692;
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38794(C16475 c16475, C23155 c23155, MenuItem menuItem) {
        int i = -1420998186;
        int i2 = C5695.f17556;
        int i3 = C1047.f3863;
        int iM6981 = (i2 - C2105.m6981("᩺ۗ")) * 69;
        int i4 = ((iM6981 ^ i3) * (-151)) ^ 613032470;
        int i5 = -1122672444;
        while (true) {
            i = ((((i ^ i3) * 2803) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2016943755:
                case -1626988848:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = (C2105.m6981("ܰ᩵") ^ i2) * (-55);
                        i4 = ((iM6981 ^ i3) * 24567) ^ (-1864063185);
                        i5 = 1344556133;
                    } else {
                        iM6981 = C0630.m2566("ܶۡ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 10655) ^ 873585272;
                        i5 = 603417517;
                    }
                    break;
                case -1941158390:
                case -1273730275:
                    RunnableC0588.m2441();
                    C4117.m12364();
                    iM6981 = (C2105.m6981("ܰ᩵") ^ i2) * (-55);
                    i4 = ((iM6981 ^ i3) * 24567) ^ (-1864063185);
                    i5 = 1344556133;
                    break;
                case -1798680820:
                case 705681781:
                    if (C3746.f11829 <= 0) {
                        iM6981 = C2105.m6981("᩷ۧ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 11449) ^ (-1924945634);
                        i5 = -31033428;
                    } else {
                        iM6981 = C2105.m6981("ۡۚ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 4659) ^ (-442193232);
                        i5 = -864621912;
                    }
                    break;
                case -1698317298:
                case -893203368:
                    break;
                case -1530271895:
                case 2076266299:
                    if (C0382.f1805) {
                        iM6981 = C0630.m2566("֫ᩴ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-13723)) ^ (-1442878997);
                        i5 = -1543128221;
                    } else {
                        iM6981 = (C2105.m6981("ܰ᩵") ^ i2) * (-55);
                        i4 = ((iM6981 ^ i3) * 24567) ^ (-1864063185);
                        i5 = 1344556133;
                    }
                    break;
                case -1323191499:
                case 1495535943:
                    ViewOnClickListenerC1958.m6429();
                    break;
                case -1265704752:
                case -1049790565:
                    if (C0422.f1886 <= 0) {
                        iM6981 = C2105.m6981("᩷ۧ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 11449) ^ (-1924945634);
                        i5 = -31033428;
                    } else {
                        iM6981 = C2105.m6981("ܿܺ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-22423)) ^ 2020749039;
                        i5 = -1231698683;
                    }
                    break;
                case -1029931701:
                case 199826659:
                    if (C2105.f7037 == 0) {
                        iM6981 = (C2105.m6981("᩷֡") + i3) * 55;
                        i4 = ((iM6981 ^ i2) * 30257) ^ (-387177131);
                        i5 = -781268312;
                    } else {
                        iM6981 = (C2105.m6981("ܰ᩵") ^ i2) * (-55);
                        i4 = ((iM6981 ^ i3) * 24567) ^ (-1864063185);
                        i5 = 1344556133;
                    }
                    break;
                case -1009302811:
                case 1228034333:
                    if (C5695.f17556 >= 0) {
                        iM6981 = C2105.m6981("۬ۚ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-11973)) ^ (-1935614462);
                        i5 = -944920639;
                    } else {
                        iM6981 = (C0630.m2566("ۡᩴ") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM6981 ^ i2) * 20975) ^ 506502112;
                        i5 = -312332404;
                    }
                    break;
                case -976456558:
                case -563884561:
                    if (C4117.f13076 <= 0) {
                        iM6981 = (C2105.m6981("ܰ᩵") ^ i2) * (-55);
                        i4 = ((iM6981 ^ i3) * 24567) ^ (-1864063185);
                        i5 = 1344556133;
                    } else {
                        iM6981 = C2105.m6981("۫֡") ^ i2;
                        i4 = ((iM6981 ^ i3) * 23419) ^ 221804609;
                        i5 = 2046669645;
                    }
                    break;
                case -826233455:
                case 1828952354:
                    if (C11340.m28031()) {
                        iM6981 = (C0630.m2566("᩵ۨ") + i2) * 93;
                        i4 = ((iM6981 ^ i3) * 31337) ^ (-1161520856);
                        i5 = -1698835118;
                    } else {
                        iM6981 = (C2105.m6981("ܰ᩵") ^ i2) * (-55);
                        i4 = ((iM6981 ^ i3) * 24567) ^ (-1864063185);
                        i5 = 1344556133;
                    }
                    break;
                case -268036501:
                case 932628237:
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = C2105.m6981("᩷ۧ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 11449) ^ (-1924945634);
                        i5 = -31033428;
                    } else {
                        iM6981 = C2105.m6981("ۧܶ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 16017) ^ (-252696868);
                        i5 = 861155479;
                    }
                    break;
                case 319974571:
                case 846012619:
                    if (C1128.m3851() > 0) {
                        iM6981 = C2105.m6981("۬ۚ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-11973)) ^ (-1935614462);
                        i5 = -944920639;
                    } else {
                        iM6981 = C2105.m6981("֨᩷") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-8553)) ^ (-119955057);
                        i5 = -2037264315;
                    }
                    break;
                case 636292746:
                case 714758904:
                    if (C0630.f2410 <= 0) {
                        iM6981 = C2105.m6981("֨᩷") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-8553)) ^ (-119955057);
                        i5 = -2037264315;
                    } else {
                        iM6981 = (C2105.m6981("ܰ᩵") ^ i2) * (-55);
                        i4 = ((iM6981 ^ i3) * 24567) ^ (-1864063185);
                        i5 = 1344556133;
                    }
                    break;
                case 1000360499:
                case 1407829734:
                    if (C1047.f3863 >= 0) {
                        iM6981 = (C2105.m6981("᩷֡") + i3) * 55;
                        i4 = ((iM6981 ^ i2) * 30257) ^ (-387177131);
                        i5 = -781268312;
                    } else {
                        iM6981 = (C2105.m6981("᩹ۤ") + i3) * (-101);
                        i4 = ((iM6981 ^ i2) * (-4497)) ^ (-1497357949);
                        i5 = 432642225;
                    }
                    break;
                case 1005397943:
                case 1445412533:
                    if (c23155.m51333(menuItem)) {
                        iM6981 = C0630.m2566("ۨܺ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 21857) ^ 1540328634;
                        i5 = 1203377251;
                    } else {
                        iM6981 = C0630.m2566("ܺۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-361)) ^ (-1338912676);
                        i5 = -1037002574;
                    }
                    break;
                case 1091449816:
                case 1809447341:
                    if (C3537.m10746() <= 0) {
                        iM6981 = (C2105.m6981("᩷֡") + i3) * 55;
                        i4 = ((iM6981 ^ i2) * 30257) ^ (-387177131);
                        i5 = -781268312;
                    } else {
                        iM6981 = C0630.m2566("֨֡") ^ i3;
                        i4 = ((iM6981 ^ i2) * 28591) ^ (-1986963365);
                        i5 = 699487993;
                    }
                    break;
                default:
                    c16475.f50653.m11383(c16475.m38819());
                    iM6981 = C0630.m2566("ۨܺ") ^ i3;
                    i4 = ((iM6981 ^ i2) * 21857) ^ 1540328634;
                    i5 = 1203377251;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:66:0x0251 A[PHI: r11 r12 r13
      0x0251: PHI (r11v5 int) = (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:65:0x024f, B:61:0x022b, B:11:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r12v5 short) = (r12v3 short), (r12v2 short), (r12v2 short) binds: [B:65:0x024f, B:61:0x022b, B:11:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r13v5 int) = (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:65:0x024f, B:61:0x022b, B:11:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x02df A[PHI: r4 r5 r6 r16
      0x02df: PHI (r4v4 boolean) = (r4v2 boolean), (r4v2 boolean), (r4v5 boolean) binds: [B:77:0x02dd, B:73:0x02bf, B:17:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x02df: PHI (r5v4 boolean) = (r5v2 boolean), (r5v2 boolean), (r5v5 boolean) binds: [B:77:0x02dd, B:73:0x02bf, B:17:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x02df: PHI (r6v4 android.os.Bundle) = (r6v2 android.os.Bundle), (r6v2 android.os.Bundle), (r6v5 android.os.Bundle) binds: [B:77:0x02dd, B:73:0x02bf, B:17:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x02df: PHI (r16v4 short[]) = (r16v2 short[]), (r16v3 short[]), (r16v2 short[]) binds: [B:77:0x02dd, B:73:0x02bf, B:17:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
    
        if (l.C0630.f2410 <= 0) goto L17;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m38821(List list, boolean z) {
        int iM2566;
        int i;
        int i2;
        int iM2567;
        int i3;
        C16475 c16475 = this;
        int i4 = RunnableC1937.f6483;
        int i5 = C2520.f8000;
        int iM2568 = (C0630.m2566("ۧۛ") ^ i4) * (-103);
        int i6 = ((iM2568 ^ i5) * 6951) ^ 1194445517;
        ArrayList arrayListM38822 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i7 = iM2568 ^ (-693946585);
        ArrayList arrayList = null;
        boolean zM6437 = false;
        int i8 = 0;
        short s = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -168742697;
        short s3 = 0;
        ArrayList<String> arrayList2 = null;
        Bundle bundleM10747 = null;
        boolean z2 = false;
        while (true) {
            i12 = i7 ^ (i6 & (((i12 ^ i5) * 6625) >> 31));
            switch (i12) {
                case -2121265775:
                case -1620189357:
                    arrayList2 = new ArrayList<>(arrayList);
                    sArr2 = f50637;
                    if (C0237.f1507 == 0) {
                        iM2567 = C0630.m2566("᩸᩵") ^ i5;
                        i = ((iM2567 ^ i4) * (-19743)) ^ 727228129;
                        i3 = 1716424549;
                        i7 = iM2567 ^ i3;
                        i6 = i;
                    } else {
                        int iM6981 = (C2105.m6981("᩹ܳ") + i5) * 31;
                        i7 = iM6981 ^ 1067321980;
                        i6 = ((iM6981 ^ i4) * (-1855)) ^ 312097543;
                        c16475 = this;
                    }
                    break;
                case -1971830564:
                case -1330216969:
                    if (C11340.f33930 < 0) {
                        iM2566 = C0630.m2566("᩶۬") ^ i5;
                        i = ((iM2566 ^ i4) * 24087) ^ (-1630123699);
                        i2 = -1050822089;
                        i7 = iM2566 ^ i2;
                        c16475 = this;
                        i6 = i;
                    } else {
                        int iM6982 = (C2105.m6981("᩹ܳ") + i5) * 31;
                        i7 = iM6982 ^ 1067321980;
                        i6 = ((iM6982 ^ i4) * (-1855)) ^ 312097543;
                        c16475 = this;
                    }
                    break;
                case -1831162243:
                case 680827891:
                    C3245.m9925();
                    return false;
                case -1693821975:
                case 1097994322:
                    if (C3663.m11168() >= 0) {
                        iM2566 = (C0630.m2566("۟᩷") ^ i5) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM2566 ^ i4) * (-6323)) ^ (-260813152);
                        i2 = -1840501327;
                    } else {
                        iM2566 = C0630.m2566("ۜۚ") ^ i4;
                        i = ((iM2566 ^ i5) * (-29301)) ^ 1902410813;
                        i2 = -2101263072;
                    }
                    i7 = iM2566 ^ i2;
                    c16475 = this;
                    i6 = i;
                    break;
                case -1642372323:
                case -1268015320:
                    RunnableC1937.m6387();
                    iM2566 = (C0630.m2566("۟᩷") ^ i5) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i = ((iM2566 ^ i4) * (-6323)) ^ (-260813152);
                    i2 = -1840501327;
                    i7 = iM2566 ^ i2;
                    c16475 = this;
                    i6 = i;
                    break;
                case -1337038240:
                case 1257916757:
                    C1047.m3599();
                    if (C3746.m11369() >= 0) {
                        int iM6983 = (C2105.m6981("᩹ܳ") + i5) * 31;
                        i7 = iM6983 ^ 1067321980;
                        i6 = ((iM6983 ^ i4) * (-1855)) ^ 312097543;
                        c16475 = this;
                    } else {
                        iM2567 = (C2105.m6981("ܳۛ") ^ i4) * 75;
                        i = ((iM2567 ^ i5) * 9539) ^ (-1012396973);
                        i3 = 596303851;
                        i7 = iM2567 ^ i3;
                        i6 = i;
                    }
                    break;
                case -1330249606:
                case 855203198:
                    i11 = 21747;
                    iM2566 = (C0630.m2566("۬۠") ^ i5) * (-95);
                    i = ((iM2566 ^ i4) * 31831) ^ (-2101351673);
                    i2 = -972042635;
                    i7 = iM2566 ^ i2;
                    c16475 = this;
                    i6 = i;
                    break;
                case -1131264968:
                case 2002132329:
                    return z2;
                case -1058788741:
                case 202825522:
                    i10 = s * s2;
                    if (C7811.f24123 >= 0) {
                        iM2566 = C0630.m2566("᩶۬") ^ i5;
                        i = ((iM2566 ^ i4) * 24087) ^ (-1630123699);
                        i2 = -1050822089;
                    } else {
                        iM2566 = (i5 - C2105.m6981("ᩴۖ")) * 9;
                        i = ((iM2566 ^ i4) * (-1169)) ^ 1617304723;
                        i2 = -1617827251;
                    }
                    i7 = iM2566 ^ i2;
                    c16475 = this;
                    i6 = i;
                    break;
                case -769005274:
                case -669819897:
                    if (z) {
                        iM2567 = (C0630.m2566("ܽۜ") ^ i4) * 43;
                        i = ((iM2567 ^ i5) * 19919) ^ 1370647306;
                        i3 = -1898989553;
                    } else {
                        iM2567 = C0630.m2566("ۜ֨") ^ i5;
                        i = ((iM2567 ^ i4) * (-20149)) ^ 1075488422;
                        i3 = -1403083314;
                    }
                    i7 = iM2567 ^ i3;
                    i6 = i;
                    break;
                case -691631122:
                case -300935087:
                    break;
                case -432524627:
                case 164762510:
                    int i13 = s + s3;
                    i9 = i13 * i13;
                    s2 = 2;
                    if (C3663.f11553) {
                        iM2566 = C0630.m2566("᩶۬") ^ i5;
                        i = ((iM2566 ^ i4) * 24087) ^ (-1630123699);
                        i2 = -1050822089;
                    } else {
                        iM2566 = (C0630.m2566("۠ᩳ") + i4) * (-55);
                        i = ((iM2566 ^ i5) * (-19689)) ^ (-2019076306);
                        i2 = 1731444510;
                    }
                    i7 = iM2566 ^ i2;
                    c16475 = this;
                    i6 = i;
                    break;
                case -401348779:
                case 1367701812:
                    arrayList = new ArrayList(list);
                    arrayListM38822 = m38822();
                    if (C1773.f6144 > 0) {
                        iM2566 = C0630.m2566("ۧ᩷") ^ i5;
                        i = ((iM2566 ^ i4) * 31107) ^ 496472744;
                        i2 = -107328507;
                        i7 = iM2566 ^ i2;
                        c16475 = this;
                        i6 = i;
                    } else {
                        int iM6984 = (C2105.m6981("᩹ܳ") + i5) * 31;
                        i7 = iM6984 ^ 1067321980;
                        i6 = ((iM6984 ^ i4) * (-1855)) ^ 312097543;
                        c16475 = this;
                    }
                    break;
                case -313082154:
                case 670742486:
                    if (c16475.f50648) {
                        iM2567 = (C0630.m2566("ܽۜ") ^ i4) * 43;
                        i = ((iM2567 ^ i5) * 19919) ^ 1370647306;
                        i3 = -1898989553;
                    } else {
                        iM2567 = C2105.m6981("ۗۢ") ^ i4;
                        i = ((iM2567 ^ i5) * 5057) ^ (-274705148);
                        i3 = -424339288;
                    }
                    i7 = iM2567 ^ i3;
                    i6 = i;
                    break;
                case 10456302:
                case 2023388866:
                    s = sArr[356];
                    s3 = 1;
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = (C2105.m6981("֫᩸") ^ i4) * (-3);
                        i = ((iM2566 ^ i5) * 20839) ^ (-1477718798);
                        i2 = -1070694345;
                    } else {
                        iM2566 = C0630.m2566("۫᩶") ^ i5;
                        i = ((iM2566 ^ i4) * 12813) ^ (-1895039566);
                        i2 = 1838942738;
                    }
                    i7 = iM2566 ^ i2;
                    c16475 = this;
                    i6 = i;
                    break;
                case 11091107:
                case 1916695585:
                    zM6437 = ViewOnClickListenerC1958.m6437(arrayListM38822, arrayList);
                    if (C3746.f11829 > 0) {
                        iM2567 = C0630.m2566("ۤ᩸") ^ i4;
                        i = ((iM2567 ^ i5) * (-31219)) ^ 734790622;
                        i3 = -421607375;
                        i7 = iM2567 ^ i3;
                        i6 = i;
                    }
                    iM2566 = (C0630.m2566("۟᩷") ^ i5) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i = ((iM2566 ^ i4) * (-6323)) ^ (-260813152);
                    i2 = -1840501327;
                    i7 = iM2566 ^ i2;
                    c16475 = this;
                    i6 = i;
                    break;
                case 91868292:
                case 2000425807:
                    if (i9 - (i10 + 1) >= 0) {
                        iM2566 = (C0630.m2566("ᩳۤ") + i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM2566 ^ i5) * (-25159)) ^ (-36777803);
                        i2 = 8514096;
                    } else {
                        iM2566 = (C0630.m2566("᩸ۘ") ^ i4) * 69;
                        i = ((iM2566 ^ i5) * 19329) ^ 1132042658;
                        i2 = -517240952;
                    }
                    i7 = iM2566 ^ i2;
                    c16475 = this;
                    i6 = i;
                    break;
                case 266720136:
                case 785077791:
                    c16475.f50652 = true;
                    return z2;
                case 304656809:
                case 1736678907:
                    i11 = 53671;
                    iM2566 = (C0630.m2566("۬۠") ^ i5) * (-95);
                    i = ((iM2566 ^ i4) * 31831) ^ (-2101351673);
                    i2 = -972042635;
                    i7 = iM2566 ^ i2;
                    c16475 = this;
                    i6 = i;
                    break;
                case 321012084:
                case 1712453961:
                    sArr = f50637;
                    if (C0714.m2805()) {
                        iM2566 = C0630.m2566("᩷ۡ") ^ i5;
                        i = ((iM2566 ^ i4) * (-14443)) ^ 1674828904;
                        i2 = -214071844;
                    } else {
                        iM2566 = (C0630.m2566("۟᩷") ^ i5) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM2566 ^ i4) * (-6323)) ^ (-260813152);
                        i2 = -1840501327;
                    }
                    i7 = iM2566 ^ i2;
                    c16475 = this;
                    i6 = i;
                    break;
                case 1163694305:
                case 1862252302:
                    bundleM10747.putStringArrayList(C0483.m2128(sArr2, i8, 20, i11), arrayList2);
                    if (zM6437) {
                        iM2567 = C2105.m6981("۬᩵") ^ i4;
                        i = ((iM2567 ^ i5) * (-29339)) ^ 468501202;
                        i3 = 1137362693;
                    } else {
                        iM2567 = (C0630.m2566("ܽۜ") ^ i4) * 43;
                        i = ((iM2567 ^ i5) * 19919) ^ 1370647306;
                        i3 = -1898989553;
                    }
                    i7 = iM2567 ^ i3;
                    i6 = i;
                    break;
                case 1303369907:
                case 2000545551:
                    z2 = !zM6437;
                    bundleM10747 = C3537.m10747(this);
                    if (!C3663.f11553) {
                        iM2567 = C2105.m6981("ۨۛ") ^ i4;
                        i = ((iM2567 ^ i5) * (-21557)) ^ 514147597;
                        i3 = 244243594;
                        i7 = iM2567 ^ i3;
                        i6 = i;
                    }
                    iM2566 = (C0630.m2566("۟᩷") ^ i5) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i = ((iM2566 ^ i4) * (-6323)) ^ (-260813152);
                    i2 = -1840501327;
                    i7 = iM2566 ^ i2;
                    c16475 = this;
                    i6 = i;
                    break;
                default:
                    i8 = 357;
                    if (C7811.m20844() == 0) {
                        iM2567 = C2105.m6981("ۛᩳ") ^ i5;
                        i = ((iM2567 ^ i4) * (-10757)) ^ (-2046098547);
                        i3 = -446983774;
                        i7 = iM2567 ^ i3;
                        i6 = i;
                    } else {
                        int iM6985 = (C2105.m6981("᩹ܳ") + i5) * 31;
                        i7 = iM6985 ^ 1067321980;
                        i6 = ((iM6985 ^ i4) * (-1855)) ^ 312097543;
                        c16475 = this;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38793(C16475 c16475, C12366 c12366) {
        int i = 154566185;
        int i2 = RunnableC1937.f6483;
        int i3 = C3245.f10203;
        int iM6981 = C2105.m6981("᩺ۗ") ^ i3;
        int i4 = ((iM6981 ^ i2) * 3643) ^ (-178511406);
        int i5 = 2146318643;
        while (true) {
            i = ((((i ^ i2) * (-31895)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2136794202:
                case 854003635:
                    C22628.m50615();
                    if (RunnableC1937.f6483 < 0) {
                        iM6981 = C0630.m2566("᩸۬") ^ i3;
                        i4 = ((iM6981 ^ i2) * 8937) ^ 937246295;
                        i5 = 1600099249;
                    } else {
                        iM6981 = C0630.m2566("ۢ᩹") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-4001)) ^ 1684249178;
                        i5 = 596613858;
                    }
                    break;
                case -2038980187:
                case 77849844:
                    C0964.m3402(new C7800(c16475));
                    break;
                case -1811565546:
                case 182558553:
                    if (C0422.f1886 > 0) {
                        iM6981 = C2105.m6981("ۚܺ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-19703)) ^ 1345936871;
                        i5 = 278826107;
                    } else {
                        iM6981 = C0630.m2566("᩸۬") ^ i3;
                        i4 = ((iM6981 ^ i2) * 8937) ^ 937246295;
                        i5 = 1600099249;
                    }
                    break;
                case -1583434514:
                case 1871638949:
                    if (C0964.m3413()) {
                        iM6981 = C0630.m2566("۬֨") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-25429)) ^ 1607424864;
                        i5 = 1839727037;
                    } else {
                        iM6981 = C0630.m2566("ۢ᩹") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-4001)) ^ 1684249178;
                        i5 = 596613858;
                    }
                    break;
                case -1563459074:
                case -622621602:
                    if (C2167.f7158 >= 0) {
                        iM6981 = (C2105.m6981("ܺۨ") + i2) * 99;
                        i4 = ((iM6981 ^ i3) * 21635) ^ 1896444463;
                        i5 = 1637418001;
                    } else {
                        iM6981 = C2105.m6981("ᩳۢ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 19753) ^ 1968731152;
                        i5 = 1316614671;
                    }
                    break;
                case -1543985655:
                case -640724241:
                    c16475.f50650 = c12366;
                    if (c16475.f50644) {
                        iM6981 = (C0630.m2566("ۡۖ") ^ i3) * 91;
                        i4 = ((iM6981 ^ i2) * 26011) ^ (-1334469994);
                        i5 = 1167195291;
                    } else {
                        iM6981 = C0630.m2566("֡ۡ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-4861)) ^ (-1375379640);
                        i5 = 660080610;
                    }
                    break;
                case -1440803886:
                case 1196782759:
                    if (C1420.m4913()) {
                        iM6981 = C0630.m2566("ۢ᩹") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-4001)) ^ 1684249178;
                        i5 = 596613858;
                    } else {
                        iM6981 = C0630.m2566("᩻֡") ^ i2;
                        i4 = ((iM6981 ^ i3) * 18607) ^ 288932829;
                        i5 = 1138949391;
                    }
                    break;
                case -1424771108:
                case 2099638445:
                    C3537.m10746();
                    iM6981 = C0630.m2566("ۢ᩹") ^ i2;
                    i4 = ((iM6981 ^ i3) * (-4001)) ^ 1684249178;
                    i5 = 596613858;
                    break;
                case -1421931448:
                case 1769251617:
                    if (C1504.m5179()) {
                        iM6981 = C0630.m2566("ۧۛ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 733) ^ (-1897367243);
                        i5 = -26348965;
                    } else {
                        iM6981 = (C2105.m6981("ܺۨ") + i2) * 99;
                        i4 = ((iM6981 ^ i3) * 21635) ^ 1896444463;
                        i5 = 1637418001;
                    }
                    break;
                case -1314381178:
                case -1229230680:
                    c16475.f50638 = true;
                    break;
                case -1301501409:
                case 701255438:
                    C0237.m1481();
                    break;
                case -1158153635:
                case 1682225221:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = C0630.m2566("᩸۬") ^ i3;
                        i4 = ((iM6981 ^ i2) * 8937) ^ 937246295;
                        i5 = 1600099249;
                    } else {
                        iM6981 = C0630.m2566("ۗܿ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 17757) ^ (-1580323838);
                        i5 = 858555804;
                    }
                    break;
                case -1136444509:
                case 1339131369:
                    if (C3683.m11222()) {
                        iM6981 = C2105.m6981("ۚܺ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-19703)) ^ 1345936871;
                        i5 = 278826107;
                    } else {
                        iM6981 = (C2105.m6981("ۚۤ") + i2) * 87;
                        i4 = ((iM6981 ^ i3) * 28477) ^ 1442682586;
                        i5 = 1093525933;
                    }
                    break;
                case -711541567:
                case 739035119:
                    if (C4263.f13799 <= 0) {
                        iM6981 = C0630.m2566("᩸۬") ^ i3;
                        i4 = ((iM6981 ^ i2) * 8937) ^ 937246295;
                        i5 = 1600099249;
                    } else {
                        iM6981 = (C2105.m6981("᩸ۖ") + i3) * (-9);
                        i4 = ((iM6981 ^ i2) * 20943) ^ (-1053246728);
                        i5 = 1936274519;
                    }
                    break;
                case -563498322:
                case 845950791:
                    ViewOnClickListenerC1958.m6429();
                    if (C4075.f12947 < 0) {
                        iM6981 = (C2105.m6981("ܺۨ") + i2) * 99;
                        i4 = ((iM6981 ^ i3) * 21635) ^ 1896444463;
                        i5 = 1637418001;
                    } else {
                        iM6981 = C2105.m6981("ۚܺ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-19703)) ^ 1345936871;
                        i5 = 278826107;
                    }
                    break;
                case 418979885:
                case 1812172968:
                    if (C0422.f1886 <= 0) {
                        iM6981 = (C0630.m2566("ۗۖ") ^ i3) * 81;
                        i4 = ((iM6981 ^ i2) * 21827) ^ (-836219058);
                        i5 = -635538272;
                    } else {
                        iM6981 = C0630.m2566("ܶ۫") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-145)) ^ 1069095743;
                        i5 = 840671062;
                    }
                    break;
                case 1570003654:
                case 1678426737:
                    if (C0237.f1507 != 0) {
                        iM6981 = C0630.m2566("ۢ᩹") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-4001)) ^ 1684249178;
                        i5 = 596613858;
                    } else {
                        iM6981 = (C2105.m6981("ܳᩳ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM6981 ^ i2) * 2755) ^ 464103379;
                        i5 = 1894063599;
                    }
                    break;
                default:
                    if (C1916.f6442) {
                        iM6981 = C0630.m2566("ܿۤ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 15663) ^ 2916576;
                        i5 = -1991855195;
                    } else {
                        iM6981 = C0630.m2566("ۢ᩹") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-4001)) ^ 1684249178;
                        i5 = 596613858;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.InterfaceC0440
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo1996() {
        C15545 c15545 = null;
        int i = 652310495;
        int i2 = C1420.f5096;
        int i3 = C3683.f11629;
        int iM6981 = (C2105.m6981("ܳۘ") ^ i2) * (-103);
        int i4 = ((iM6981 ^ i3) * 10927) ^ 191359271;
        int i5 = -379924353;
        while (true) {
            i = ((((i ^ i3) * (-24809)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2109188058:
                case -392237708:
                    if (C1005.f3721) {
                        iM6981 = C0630.m2566("ܰۘ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 22699) ^ (-411102138);
                        i5 = 274188318;
                    } else {
                        iM6981 = (i2 - C0630.m2566("᩷ۧ")) * 97;
                        i4 = ((iM6981 ^ i3) * 15609) ^ (-2101157992);
                        i5 = 1333078914;
                    }
                    break;
                case -2055763753:
                case -451657337:
                    if (C2167.f7158 >= 0) {
                        iM6981 = (i2 - C0630.m2566("᩷ۧ")) * 97;
                        i4 = ((iM6981 ^ i3) * 15609) ^ (-2101157992);
                        i5 = 1333078914;
                    } else {
                        iM6981 = (C0630.m2566("᩺ۢ") + i3) * 61;
                        i4 = ((iM6981 ^ i2) * (-28045)) ^ 378337813;
                        i5 = -856305307;
                    }
                    break;
                case -2026505441:
                case 1230911236:
                    if (C0483.f2088 >= 0) {
                        iM6981 = (i2 - C2105.m6981("᩶ܰ")) * (-117);
                        i4 = ((iM6981 ^ i3) * 9007) ^ (-85751347);
                        i5 = -2135663415;
                    } else {
                        iM6981 = C0630.m2566("ۜܰ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 22601) ^ 1595701326;
                        i5 = 434096529;
                    }
                    break;
                case -1981039132:
                case 897875870:
                    C3911.m11924();
                    iM6981 = (C2105.m6981("ۗܰ") + i2) * (-37);
                    i4 = ((iM6981 ^ i3) * 25593) ^ 1847065113;
                    i5 = -904642709;
                    break;
                case -1903307169:
                case -906331187:
                    if (C2272.f7362) {
                        iM6981 = (C0630.m2566("ۖܰ") + i3) * (-113);
                        i4 = ((iM6981 ^ i2) * (-22907)) ^ (-507644498);
                        i5 = 2032490051;
                    } else {
                        iM6981 = C2105.m6981("ܶ۠") ^ i2;
                        i4 = ((iM6981 ^ i3) * 18601) ^ 573055260;
                        i5 = 16545140;
                    }
                    break;
                case -1881941218:
                case 1950009562:
                    this.f50646.m36693();
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = (C2105.m6981("ۗܰ") + i2) * (-37);
                        i4 = ((iM6981 ^ i3) * 25593) ^ 1847065113;
                        i5 = -904642709;
                    } else {
                        iM6981 = C2105.m6981("᩸ۗ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-14885)) ^ (-1725754200);
                        i5 = -150343784;
                    }
                    break;
                case -1870747363:
                case 1127630986:
                    if (RunnableC1108.f4040) {
                        iM6981 = (i3 - C2105.m6981("ܽۡ")) * (-125);
                        i4 = ((iM6981 ^ i2) * 21747) ^ (-2142479473);
                        i5 = 1924781583;
                    } else {
                        iM6981 = (C0630.m2566("᩺ۢ") + i3) * 61;
                        i4 = ((iM6981 ^ i2) * (-28045)) ^ 378337813;
                        i5 = -856305307;
                    }
                    break;
                case -1868496198:
                case -991252900:
                    if (C2520.f8000 >= 0) {
                        iM6981 = (C0630.m2566("᩺ۢ") + i3) * 61;
                        i4 = ((iM6981 ^ i2) * (-28045)) ^ 378337813;
                        i5 = -856305307;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ܰۛ")) * (-121);
                        i4 = ((iM6981 ^ i2) * (-31191)) ^ 107736312;
                        i5 = -489934191;
                    }
                    break;
                case -1548394225:
                case -107304140:
                    C7811.m20844();
                    C3911.m11924();
                    return false;
                case -1262481581:
                case -472808839:
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = (i2 - C2105.m6981("᩶ܰ")) * (-117);
                        i4 = ((iM6981 ^ i3) * 9007) ^ (-85751347);
                        i5 = -2135663415;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ۖᩴ")) * 59;
                        i4 = ((iM6981 ^ i3) * 21675) ^ (-201938898);
                        i5 = 414994541;
                    }
                    break;
                case -506031546:
                case 1521890879:
                    if (C2958.f9394 >= 0) {
                        iM6981 = (C0630.m2566("᩺ۢ") + i3) * 61;
                        i4 = ((iM6981 ^ i2) * (-28045)) ^ 378337813;
                        i5 = -856305307;
                    } else {
                        iM6981 = (C2105.m6981("ۗܰ") + i2) * (-37);
                        i4 = ((iM6981 ^ i3) * 25593) ^ 1847065113;
                        i5 = -904642709;
                    }
                    break;
                case -312945752:
                case 1308301747:
                    if (C0964.f3626 != 0) {
                        iM6981 = (i2 - C2105.m6981("᩶ܰ")) * (-117);
                        i4 = ((iM6981 ^ i3) * 9007) ^ (-85751347);
                        i5 = -2135663415;
                    } else {
                        iM6981 = (C2105.m6981("۠ۡ") + i2) * (-25);
                        i4 = ((iM6981 ^ i3) * (-25551)) ^ 873555416;
                        i5 = -239464247;
                    }
                    break;
                case -158687499:
                case 1989671338:
                    if (C0630.f2410 > 0) {
                        iM6981 = (i2 - C2105.m6981("᩶ܰ")) * (-117);
                        i4 = ((iM6981 ^ i3) * 9007) ^ (-85751347);
                        i5 = -2135663415;
                    } else {
                        iM6981 = (C2105.m6981("ۗܰ") + i2) * (-37);
                        i4 = ((iM6981 ^ i3) * 25593) ^ 1847065113;
                        i5 = -904642709;
                    }
                    break;
                case 40083640:
                case 1702910256:
                    if (c15545.m36691()) {
                        iM6981 = C2105.m6981("ۨܶ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 18149) ^ (-958059017);
                        i5 = -2135042951;
                    } else {
                        iM6981 = C2105.m6981("ۗ۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-17669)) ^ 764157461;
                        i5 = -1181283433;
                    }
                    break;
                case 369648566:
                case 1292898451:
                    return false;
                case 538483458:
                case 1960823606:
                    if (C2126.f7087) {
                        iM6981 = (C0630.m2566("ۖܰ") + i3) * (-113);
                        i4 = ((iM6981 ^ i2) * (-22907)) ^ (-507644498);
                        i5 = 2032490051;
                    } else {
                        iM6981 = C0630.m2566("ۧ᩻") ^ i3;
                        i4 = ((iM6981 ^ i2) * 29495) ^ 389445277;
                        i5 = -856195198;
                    }
                    break;
                case 946884123:
                case 1319577421:
                    return true;
                case 1358686934:
                case 2034428045:
                    c15545 = this.f50646;
                    if (c15545 != null) {
                        iM6981 = C0630.m2566("ۖᩳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-32525)) ^ 1661945764;
                        i5 = 642411769;
                    } else {
                        iM6981 = C2105.m6981("ۗ۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-17669)) ^ 764157461;
                        i5 = -1181283433;
                    }
                    break;
                default:
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = (C2105.m6981("ۗܰ") + i2) * (-37);
                        i4 = ((iM6981 ^ i3) * 25593) ^ 1847065113;
                        i5 = -904642709;
                    } else {
                        iM6981 = C0630.m2566("ۢ᩺") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-1437)) ^ 1537435511;
                        i5 = -2141657853;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC18581 mo17431() {
        C12366 c12366 = null;
        C11005 c11005M34233 = null;
        C12392 c12392 = null;
        C15545 c15545 = null;
        int i = -655707638;
        int i2 = C3432.f10845;
        int i3 = ViewOnClickListenerC1958.f6529;
        int iM2566 = (C0630.m2566("ۡܳ") ^ i2) * 35;
        int i4 = ((iM2566 ^ i3) * (-10649)) ^ (-1730317437);
        int i5 = 930339316;
        while (true) {
            i = ((((i ^ i3) * (-497)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2134656243:
                case 1858035228:
                    if (C0422.f1886 <= 0) {
                        iM2566 = C0630.m2566("᩵᩺") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-16921)) ^ 635713074;
                        i5 = 482544946;
                    } else {
                        iM2566 = (C2105.m6981("֨ۛ") + i2) * 21;
                        i4 = ((iM2566 ^ i3) * (-4979)) ^ (-1377383531);
                        i5 = 542322539;
                    }
                    break;
                case -2036321755:
                case 2003232547:
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = C2105.m6981("᩵ᩴ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 6253) ^ (-1218774131);
                        i5 = -816612381;
                    } else {
                        iM2566 = C0630.m2566("᩵᩺") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-16921)) ^ 635713074;
                        i5 = 482544946;
                    }
                    break;
                case -1939128824:
                case -475160729:
                    if (C0798.f2919) {
                        iM2566 = C2105.m6981("ۢۨ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-13219)) ^ (-577414927);
                        i5 = -1824434610;
                    } else {
                        iM2566 = (C2105.m6981("ܳۨ") + i2) * (-39);
                        i4 = ((iM2566 ^ i3) * (-17055)) ^ 1262555987;
                        i5 = 125587881;
                    }
                    break;
                case -1705620584:
                case 806156980:
                    if (C1773.f6144 <= 0) {
                        iM2566 = C0630.m2566("᩵᩺") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-16921)) ^ 635713074;
                        i5 = 482544946;
                    } else {
                        iM2566 = C0630.m2566("ۛܳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 14609) ^ (-463433071);
                        i5 = 386814069;
                    }
                    break;
                case -1575300891:
                case 2108218467:
                    if (C3663.f11553) {
                        iM2566 = C2105.m6981("ۢܳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-2821)) ^ (-1866735734);
                        i5 = -1246973296;
                    } else {
                        iM2566 = C2105.m6981("ۨۜ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-14781)) ^ 2110812011;
                        i5 = 42136399;
                    }
                    break;
                case -1521888848:
                case 1075015438:
                    if (C2167.m7155()) {
                        iM2566 = C2105.m6981("ۢۨ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-13219)) ^ (-577414927);
                        i5 = -1824434610;
                    } else {
                        iM2566 = (C2105.m6981("֨֨") ^ i3) * 23;
                        i4 = ((iM2566 ^ i2) * 9751) ^ (-1437181936);
                        i5 = 55424505;
                    }
                    break;
                case -1419321703:
                case 12072233:
                    if (RunnableC0588.f2309 < 0) {
                        iM2566 = (C0630.m2566("᩸᩺") ^ i3) * 15;
                        i4 = ((iM2566 ^ i2) * (-12467)) ^ 203576913;
                        i5 = -1702154440;
                    } else {
                        iM2566 = C0630.m2566("᩵᩺") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-16921)) ^ 635713074;
                        i5 = 482544946;
                    }
                    break;
                case -1414298854:
                case 1899191998:
                    c11005M34233 = m34233(c12366.m36268());
                    if (C22628.m50615() != 0) {
                        iM2566 = (C0630.m2566("᩸᩺") ^ i3) * 15;
                        i4 = ((iM2566 ^ i2) * (-12467)) ^ 203576913;
                        i5 = -1702154440;
                    } else {
                        iM2566 = C0630.m2566("۬ۙ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 27121) ^ 1056835892;
                        i5 = 1600677062;
                    }
                    break;
                case -1224159613:
                case 387495851:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = (C0630.m2566("᩸᩺") ^ i3) * 15;
                        i4 = ((iM2566 ^ i2) * (-12467)) ^ 203576913;
                        i5 = -1702154440;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ۢۗ")) * (-101);
                        i4 = ((iM2566 ^ i2) * 19561) ^ (-936511579);
                        i5 = -245834716;
                    }
                    break;
                case -1192157959:
                case 1059048210:
                    if (C0483.f2088 >= 0) {
                        iM2566 = C2105.m6981("ۢܳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-2821)) ^ (-1866735734);
                        i5 = -1246973296;
                    } else {
                        iM2566 = (i2 - C2105.m6981("ܿۗ")) * 27;
                        i4 = ((iM2566 ^ i3) * 24399) ^ (-1308789595);
                        i5 = 687982884;
                    }
                    break;
                case -805190711:
                case -85376228:
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = C2105.m6981("᩵ᩴ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 6253) ^ (-1218774131);
                        i5 = -816612381;
                    } else {
                        iM2566 = C0630.m2566("֫ۗ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-17255)) ^ 1248826867;
                        i5 = 1127982352;
                    }
                    break;
                case -749375078:
                case -646463986:
                    if (this.f50647) {
                        iM2566 = (i2 - C0630.m2566("ۖۧ")) * (-115);
                        i4 = ((iM2566 ^ i3) * 32257) ^ (-2072859068);
                        i5 = -824875056;
                    } else {
                        iM2566 = (C0630.m2566("۟֫") + i2) * (-105);
                        i4 = ((iM2566 ^ i3) * (-30755)) ^ (-1651072526);
                        i5 = 1257615849;
                    }
                    break;
                case -569780829:
                case 1726496571:
                    return null;
                case -360914301:
                case 1988805861:
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = C2105.m6981("᩵ᩴ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 6253) ^ (-1218774131);
                        i5 = -816612381;
                    } else {
                        iM2566 = C0630.m2566("ܺ۫") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-24467)) ^ (-538544920);
                        i5 = 338701768;
                    }
                    break;
                case -256287259:
                case 1371704312:
                    if (this.f50644) {
                        iM2566 = C0630.m2566("᩻ۙ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 21339) ^ (-217922145);
                        i5 = 622051639;
                    } else {
                        iM2566 = (i2 - C0630.m2566("ۖۧ")) * (-115);
                        i4 = ((iM2566 ^ i3) * 32257) ^ (-2072859068);
                        i5 = -824875056;
                    }
                    break;
                case -165123448:
                case 1631065940:
                    return new C10832(this, c12392, c15545, c11005M34233);
                case -155363142:
                case 69472918:
                    c12366 = this.f50650;
                    if (c12366 != null) {
                        iM2566 = (i3 - C2105.m6981("ܽܺ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM2566 ^ i2) * (-2933)) ^ (-1897584238);
                        i5 = -268415392;
                    } else {
                        iM2566 = (i2 - C0630.m2566("ۖۧ")) * (-115);
                        i4 = ((iM2566 ^ i3) * 32257) ^ (-2072859068);
                        i5 = -824875056;
                    }
                    break;
                case 17785156:
                case 1222895520:
                    C3432.m10477();
                    iM2566 = C2105.m6981("ۢۨ") ^ i2;
                    i4 = ((iM2566 ^ i3) * (-13219)) ^ (-577414927);
                    i5 = -1824434610;
                    break;
                case 420283993:
                case 2051305044:
                    C0714.m2805();
                    if (!C4159.f13567) {
                        iM2566 = C0630.m2566("᩵᩺") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-16921)) ^ 635713074;
                        i5 = 482544946;
                    } else {
                        iM2566 = C2105.m6981("ۢۨ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-13219)) ^ (-577414927);
                        i5 = -1824434610;
                    }
                    break;
                case 643158304:
                case 1712933508:
                    C1504.m5179();
                    return null;
                case 1231749138:
                case 1262118608:
                    throw new RuntimeException();
                case 1453427596:
                case 1480248422:
                    c12392 = this.f50649;
                    c15545 = this.f50646;
                    if (c12392 != null) {
                        iM2566 = (i3 - C0630.m2566("ۡ۬")) * (-91);
                        i4 = ((iM2566 ^ i2) * 2119) ^ 122928764;
                        i5 = -1759807022;
                    } else {
                        iM2566 = C0630.m2566("۠ܺ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-21249)) ^ 1007164281;
                        i5 = -30482014;
                    }
                    break;
                default:
                    if (c15545 != null) {
                        iM2566 = C2105.m6981("᩹᩹") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-14817)) ^ (-1033671555);
                        i5 = 890829891;
                    } else {
                        iM2566 = C0630.m2566("۠ܺ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-21249)) ^ 1007164281;
                        i5 = -30482014;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00bd A[PHI: r7 r8 r10 r15
      0x00bd: PHI (r7v6 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:86:0x00bd, B:27:0x00bb, B:23:0x009a, B:97:0x00bd] A[DONT_GENERATE, DONT_INLINE]
      0x00bd: PHI (r8v6 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:86:0x00bd, B:27:0x00bb, B:23:0x009a, B:97:0x00bd] A[DONT_GENERATE, DONT_INLINE]
      0x00bd: PHI (r10v6 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:86:0x00bd, B:27:0x00bb, B:23:0x009a, B:97:0x00bd] A[DONT_GENERATE, DONT_INLINE]
      0x00bd: PHI (r15v6 short[]) = (r15v2 short[]), (r15v3 short[]), (r15v2 short[]), (r15v2 short[]) binds: [B:86:0x00bd, B:27:0x00bb, B:23:0x009a, B:97:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.ComponentCallbacksC9205
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        InterfaceMenuC23000 interfaceMenuC23000;
        short s;
        int iM6981;
        int i;
        int i2;
        int iM2566;
        int i3;
        int iM6982;
        int i4;
        int iM2567;
        int i5;
        int i6;
        Menu menu2 = menu;
        int i7 = C2520.f8000;
        int i8 = C3911.f12484;
        int iM6983 = C2105.m6981("᩺ۚ") ^ i7;
        int i9 = ((iM6983 ^ i8) * 20553) ^ 289838864;
        String strM11919 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i10 = iM6983 ^ (-403689772);
        int iM6984 = 0;
        int i11 = 0;
        int iM2568 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 790249932;
        short s2 = 0;
        C15545 c15545 = null;
        InterfaceMenuC23000 interfaceMenuC23001 = null;
        while (true) {
            i18 = i10 ^ (i9 & (((i18 ^ i8) * 10315) >> 31));
            switch (i18) {
                case -2046870879:
                case -1075787043:
                    sArr2 = f50637;
                    i15 = 202;
                    i16 = 3;
                    if (!C1005.f3721) {
                        interfaceMenuC23000 = interfaceMenuC23001;
                        s = s2;
                        iM6981 = C2105.m6981("֫ۚ") ^ i8;
                        i = ((iM6981 ^ i7) * 9631) ^ (-1983271641);
                        i2 = 2070091451;
                        int i19 = iM6981 ^ i2;
                        s2 = s;
                        menu2 = menu;
                        InterfaceMenuC23000 interfaceMenuC23002 = interfaceMenuC23000;
                        i10 = i19;
                        i9 = i;
                        interfaceMenuC23001 = interfaceMenuC23002;
                    } else {
                        iM2566 = C0630.m2566("ۨۜ") ^ i8;
                        i9 = ((iM2566 ^ i7) * o.a.g) ^ (-229155079);
                        i3 = 764858112;
                        i10 = iM2566 ^ i3;
                        menu2 = menu;
                    }
                    break;
                case -1926870336:
                case -660632334:
                    if (!C0798.f2919) {
                        iM2567 = C0630.m2566("ᩴۢ") ^ i8;
                        i5 = ((iM2567 ^ i7) * (-1639)) ^ 877510120;
                        i6 = -1111440891;
                        i10 = iM2567 ^ i6;
                        i9 = i5;
                    } else {
                        interfaceMenuC23000 = interfaceMenuC23001;
                        s = s2;
                        iM6981 = (i7 - C2105.m6981("ܳۜ")) * (-31);
                        i = ((iM6981 ^ i8) * (-7137)) ^ (-2094005256);
                        i2 = 1322104229;
                        int i110 = iM6981 ^ i2;
                        s2 = s;
                        menu2 = menu;
                        InterfaceMenuC23000 interfaceMenuC23003 = interfaceMenuC23000;
                        i10 = i110;
                        i9 = i;
                        interfaceMenuC23001 = interfaceMenuC23003;
                    }
                    break;
                case -1847658195:
                case -1343896783:
                    interfaceMenuC23000 = interfaceMenuC23001;
                    s = s2;
                    sArr = f50637;
                    if (!C1711.f5919) {
                        iM6981 = (C2105.m6981("ۤۡ") ^ i8) * (-69);
                        i = ((iM6981 ^ i7) * 18733) ^ (-1576545164);
                        i2 = -1407367705;
                        int i111 = iM6981 ^ i2;
                        s2 = s;
                        menu2 = menu;
                        InterfaceMenuC23000 interfaceMenuC23004 = interfaceMenuC23000;
                        i10 = i111;
                        i9 = i;
                        interfaceMenuC23001 = interfaceMenuC23004;
                    } else {
                        s2 = s;
                        iM6982 = (i7 - C2105.m6981("ۧۘ")) * 119;
                        i9 = ((iM6982 ^ i8) * 17925) ^ (-622085758);
                        i4 = 833484055;
                        int i20 = iM6982 ^ i4;
                        interfaceMenuC23001 = interfaceMenuC23000;
                        i10 = i20;
                        menu2 = menu;
                    }
                    break;
                case -1775512301:
                case 318825396:
                    iM2568 = C0630.m2566(C3245.m9934(sArr3, i12, i13, i14));
                    if (C3432.f10845 >= 0) {
                        iM2567 = C0630.m2566("ᩴۢ") ^ i8;
                        i5 = ((iM2567 ^ i7) * (-1639)) ^ 877510120;
                        i6 = -1111440891;
                    } else {
                        iM2567 = (C0630.m2566("ᩴ᩵") + i8) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM2567 ^ i7) * 30983) ^ (-1943174674);
                        i6 = -912350376;
                    }
                    i10 = iM2567 ^ i6;
                    i9 = i5;
                    break;
                case -1685523452:
                case 1219230368:
                    interfaceMenuC23000 = interfaceMenuC23001;
                    s = s2;
                    i17 = (s * s) + 198669025;
                    if (RunnableC3474.f10992 <= 0) {
                        iM6981 = C2105.m6981("֫ۚ") ^ i8;
                        i = ((iM6981 ^ i7) * 9631) ^ (-1983271641);
                        i2 = 2070091451;
                    } else {
                        iM6981 = (i7 - C0630.m2566("ۛۧ")) * 115;
                        i = ((iM6981 ^ i8) * (-30153)) ^ (-216772643);
                        i2 = 2125313438;
                    }
                    int i112 = iM6981 ^ i2;
                    s2 = s;
                    menu2 = menu;
                    InterfaceMenuC23000 interfaceMenuC23005 = interfaceMenuC23000;
                    i10 = i112;
                    i9 = i;
                    interfaceMenuC23001 = interfaceMenuC23005;
                    break;
                case -1652521439:
                case 996984564:
                    if (C4616.f14690 > 0) {
                        interfaceMenuC23000 = interfaceMenuC23001;
                        iM6982 = (i7 - C2105.m6981("ۧۘ")) * 119;
                        i9 = ((iM6982 ^ i8) * 17925) ^ (-622085758);
                        i4 = 833484055;
                        int i21 = iM6982 ^ i4;
                        interfaceMenuC23001 = interfaceMenuC23000;
                        i10 = i21;
                        menu2 = menu;
                    } else {
                        iM2567 = C0630.m2566("ᩴۢ") ^ i8;
                        i5 = ((iM2567 ^ i7) * (-1639)) ^ 877510120;
                        i6 = -1111440891;
                        i10 = iM2567 ^ i6;
                        i9 = i5;
                    }
                    break;
                case -1372781170:
                case 2098950878:
                    c15545.m36675(C7106.m19118(interfaceMenuC23001, 2117414805 ^ iM2568));
                    break;
                case -1342405328:
                case -237308105:
                    i14 = 41165;
                    iM2566 = C2105.m6981("ۗۙ") ^ i7;
                    i9 = ((iM2566 ^ i8) * 9009) ^ (-1664308145);
                    i3 = 876927083;
                    i10 = iM2566 ^ i3;
                    menu2 = menu;
                    break;
                case -1325882716:
                case -278312102:
                    iM6984 = C2105.m6981(strM11919);
                    i11 = 2124570427;
                    if (RunnableC1937.f6483 < 0) {
                        iM2566 = (C2105.m6981("۫֨") + i7) * 57;
                        i9 = ((iM2566 ^ i8) * (-19065)) ^ (-156794130);
                        i3 = -853684091;
                        i10 = iM2566 ^ i3;
                        menu2 = menu;
                    } else {
                        interfaceMenuC23000 = interfaceMenuC23001;
                        s = s2;
                        iM6981 = C2105.m6981("֫ۚ") ^ i8;
                        i = ((iM6981 ^ i7) * 9631) ^ (-1983271641);
                        i2 = 2070091451;
                        int i113 = iM6981 ^ i2;
                        s2 = s;
                        menu2 = menu;
                        InterfaceMenuC23000 interfaceMenuC23006 = interfaceMenuC23000;
                        i10 = i113;
                        i9 = i;
                        interfaceMenuC23001 = interfaceMenuC23006;
                    }
                    break;
                case -1005659738:
                case 411412432:
                    s = s2;
                    if ((s * 28190) - i17 <= 0) {
                        iM6981 = (C2105.m6981("ۗ۫") ^ i7) * 13;
                        interfaceMenuC23000 = interfaceMenuC23001;
                        i = ((iM6981 ^ i8) * 5189) ^ (-982469280);
                        i2 = 643958058;
                    } else {
                        interfaceMenuC23000 = interfaceMenuC23001;
                        iM6981 = C0630.m2566("ᩴۚ") ^ i8;
                        i = ((iM6981 ^ i7) * (-10205)) ^ 1896384722;
                        i2 = 1226611139;
                    }
                    int i114 = iM6981 ^ i2;
                    s2 = s;
                    menu2 = menu;
                    InterfaceMenuC23000 interfaceMenuC23007 = interfaceMenuC23000;
                    i10 = i114;
                    i9 = i;
                    interfaceMenuC23001 = interfaceMenuC23007;
                    break;
                case -881510943:
                case 1228921323:
                    strM11919 = C3911.m11919(sArr2, i15, i16, i14);
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        iM2566 = C2105.m6981("᩻۫") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-20263)) ^ 1124752919;
                        i3 = 1444462433;
                        i10 = iM2566 ^ i3;
                        menu2 = menu;
                    } else {
                        interfaceMenuC23000 = interfaceMenuC23001;
                        s = s2;
                        iM6981 = (i7 - C2105.m6981("ܳۜ")) * (-31);
                        i = ((iM6981 ^ i8) * (-7137)) ^ (-2094005256);
                        i2 = 1322104229;
                        int i115 = iM6981 ^ i2;
                        s2 = s;
                        menu2 = menu;
                        InterfaceMenuC23000 interfaceMenuC23008 = interfaceMenuC23000;
                        i10 = i115;
                        i9 = i;
                        interfaceMenuC23001 = interfaceMenuC23008;
                    }
                    break;
                case -875557639:
                case -85093488:
                    sArr3 = f50637;
                    i12 = 205;
                    i13 = 3;
                    if (C0483.f2088 >= 0) {
                        iM2567 = C0630.m2566("ᩴۢ") ^ i8;
                        i5 = ((iM2567 ^ i7) * (-1639)) ^ 877510120;
                        i6 = -1111440891;
                    } else {
                        iM2567 = (C0630.m2566("᩹᩵") ^ i8) * 29;
                        i5 = ((iM2567 ^ i7) * (-22215)) ^ (-1807155282);
                        i6 = -1321192682;
                    }
                    i10 = iM2567 ^ i6;
                    i9 = i5;
                    break;
                case -697956583:
                case 1817697568:
                    interfaceMenuC23000 = interfaceMenuC23001;
                    s = s2;
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = (i7 - C2105.m6981("ܳۜ")) * (-31);
                        i = ((iM6981 ^ i8) * (-7137)) ^ (-2094005256);
                        i2 = 1322104229;
                    } else {
                        iM6981 = (i7 - C2105.m6981("֡ۚ")) * 25;
                        i = ((iM6981 ^ i8) * 24835) ^ 1767043550;
                        i2 = 216013234;
                    }
                    int i116 = iM6981 ^ i2;
                    s2 = s;
                    menu2 = menu;
                    InterfaceMenuC23000 interfaceMenuC23009 = interfaceMenuC23000;
                    i10 = i116;
                    i9 = i;
                    interfaceMenuC23001 = interfaceMenuC23009;
                    break;
                case -620999252:
                case 1741547494:
                    menuInflater.inflate(iM6984 ^ i11, menu2);
                    interfaceMenuC23001 = (InterfaceMenuC23000) menu2;
                    c15545 = this.f50646;
                    if (C7106.f21815 != 0) {
                        int iM6985 = C2105.m6981("ܽۤ") ^ i7;
                        int i22 = ((iM6985 ^ i8) * 8509) ^ 585880017;
                        i10 = iM6985 ^ (-1817948403);
                        i9 = i22;
                    } else {
                        iM2566 = (i7 - C2105.m6981("ܰۘ")) * (-101);
                        i9 = ((iM2566 ^ i8) * (-31467)) ^ 1392681580;
                        i3 = 596090589;
                        i10 = iM2566 ^ i3;
                    }
                    menu2 = menu;
                    break;
                case 54472833:
                case 1528880894:
                    C1916.m6308();
                    C4263.m12819();
                    interfaceMenuC23000 = interfaceMenuC23001;
                    s = s2;
                    iM6981 = (i7 - C2105.m6981("ܳۜ")) * (-31);
                    i = ((iM6981 ^ i8) * (-7137)) ^ (-2094005256);
                    i2 = 1322104229;
                    int i117 = iM6981 ^ i2;
                    s2 = s;
                    menu2 = menu;
                    InterfaceMenuC23000 interfaceMenuC230010 = interfaceMenuC23000;
                    i10 = i117;
                    i9 = i;
                    interfaceMenuC23001 = interfaceMenuC230010;
                    break;
                case 150822305:
                case 402677790:
                    if (!C1711.f5919) {
                        interfaceMenuC23000 = interfaceMenuC23001;
                        s = s2;
                        iM6981 = C2105.m6981("֫ۚ") ^ i8;
                        i = ((iM6981 ^ i7) * 9631) ^ (-1983271641);
                        i2 = 2070091451;
                        int i118 = iM6981 ^ i2;
                        s2 = s;
                        menu2 = menu;
                        InterfaceMenuC23000 interfaceMenuC230011 = interfaceMenuC23000;
                        i10 = i118;
                        i9 = i;
                        interfaceMenuC23001 = interfaceMenuC230011;
                    } else {
                        interfaceMenuC23000 = interfaceMenuC23001;
                        iM6982 = (i7 - C2105.m6981("ۧۘ")) * 119;
                        i9 = ((iM6982 ^ i8) * 17925) ^ (-622085758);
                        i4 = 833484055;
                        int i23 = iM6982 ^ i4;
                        interfaceMenuC23001 = interfaceMenuC23000;
                        i10 = i23;
                        menu2 = menu;
                    }
                    break;
                case 825685770:
                case 2003178531:
                    i14 = 53566;
                    iM2566 = C2105.m6981("ۗۙ") ^ i7;
                    i9 = ((iM2566 ^ i8) * 9009) ^ (-1664308145);
                    i3 = 876927083;
                    i10 = iM2566 ^ i3;
                    menu2 = menu;
                    break;
                case 1754317855:
                case 2060775255:
                    interfaceMenuC23000 = interfaceMenuC23001;
                    s2 = sArr[201];
                    if (C3663.f11553) {
                        iM6982 = (i7 - C2105.m6981("ۧۘ")) * 119;
                        i9 = ((iM6982 ^ i8) * 17925) ^ (-622085758);
                        i4 = 833484055;
                    } else {
                        iM6982 = C2105.m6981("ܶۘ") ^ i8;
                        i9 = ((iM6982 ^ i7) * 25709) ^ (-1789973437);
                        i4 = -1370998057;
                    }
                    int i24 = iM6982 ^ i4;
                    interfaceMenuC23001 = interfaceMenuC23000;
                    i10 = i24;
                    menu2 = menu;
                    break;
                default:
                    RunnableC1937.m6387();
                    C2958.m9034();
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC14346
    /* JADX INFO: renamed from: ۡ */
    public final C12392 mo17427() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = -568252524;
        int i6 = C0714.f2697;
        int i7 = C4117.f13076;
        int iM6981 = (i6 - C2105.m6981("ᩳܳ")) * (-17);
        int i8 = ((iM6981 ^ i7) * (-28597)) ^ 192420378;
        int i9 = 589431156;
        while (true) {
            i5 = ((((i5 ^ i7) * 6929) >> 31) & i8) ^ (iM6981 ^ i9);
            switch (i5) {
                case -2027755298:
                case 289603273:
                    short[] sArr2 = f50637;
                    if (C0050.f910 < 0 && C11340.f33930 < 0) {
                        throw new IllegalStateException(C21923.m49334(sArr2, 399, 29, i4));
                    }
                    iM6981 = C0630.m2566("ۧܰ") ^ i7;
                    i8 = ((iM6981 ^ i6) * (-20121)) ^ 564169715;
                    i9 = -544622550;
                    break;
                case -1992228956:
                case 265239922:
                    if (C0964.f3626 == 0) {
                        iM6981 = (C2105.m6981("᩸᩻") + i6) * (-41);
                        i8 = ((iM6981 ^ i7) * 20983) ^ 322372741;
                        i9 = -2030538352;
                    } else {
                        iM6981 = (i7 - C0630.m2566("ۧ᩶")) * (-73);
                        i8 = ((iM6981 ^ i6) * (-23277)) ^ 2142472011;
                        i9 = -497464146;
                    }
                    break;
                case -1873732532:
                case -305429605:
                    if (C11340.f33930 >= 0) {
                        iM6981 = C0630.m2566("ۧܰ") ^ i7;
                        i8 = ((iM6981 ^ i6) * (-20121)) ^ 564169715;
                        i9 = -544622550;
                    } else {
                        iM6981 = (i7 - C2105.m6981("۬֫")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i8 = ((iM6981 ^ i6) * (-23659)) ^ (-1850772221);
                        i9 = -1065523482;
                    }
                    break;
                case -1763304051:
                case 386166570:
                    s = sArr[c];
                    s2 = 30250;
                    if (C5695.f17556 >= 0) {
                        iM6981 = C2105.m6981("ۢ۬") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-32379)) ^ (-430370666);
                        i9 = 2100565329;
                    } else {
                        iM6981 = (C0630.m2566("ۚۧ") ^ i6) * (-13);
                        i8 = ((iM6981 ^ i7) * (-6539)) ^ (-1244007940);
                        i9 = 718482828;
                    }
                    break;
                case -1649075207:
                case 653005439:
                    return this.f50649;
                case -1589622186:
                case 931216136:
                    i4 = 13231;
                    iM6981 = (i6 - C2105.m6981("᩺۬")) * (-45);
                    i8 = ((iM6981 ^ i7) * (-3625)) ^ (-79082875);
                    i9 = 1243796670;
                    break;
                case -1566688602:
                case 144257890:
                    C0964.m3413();
                    return null;
                case -1371526028:
                case -1305126800:
                    RunnableC1937.m6387();
                    C3432.m10477();
                    iM6981 = (i7 - C0630.m2566("ۧ᩶")) * (-73);
                    i8 = ((iM6981 ^ i6) * (-23277)) ^ 2142472011;
                    i9 = -497464146;
                    break;
                case -1345048505:
                case -1321554431:
                    sArr = f50637;
                    if (C0630.f2410 <= 0) {
                        iM6981 = C2105.m6981("ۢ۬") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-32379)) ^ (-430370666);
                        i9 = 2100565329;
                    } else {
                        iM6981 = C2105.m6981("ۜ᩺") ^ i7;
                        i8 = ((iM6981 ^ i6) * 18617) ^ (-1475981514);
                        i9 = 176798071;
                    }
                    break;
                case -1248485992:
                case -618514651:
                    if ((i2 + i3) - i < 0) {
                        iM6981 = C2105.m6981("᩹ܿ") ^ i7;
                        i8 = ((iM6981 ^ i6) * (-3169)) ^ 1043062193;
                        i9 = 939931166;
                    } else {
                        iM6981 = (i6 - C2105.m6981("۟᩵")) * 53;
                        i8 = ((iM6981 ^ i7) * (-25309)) ^ (-1700731838);
                        i9 = -680616251;
                    }
                    break;
                case -1232391281:
                case 577755120:
                    if (this.f50647) {
                        iM6981 = C2105.m6981("᩸ۖ") ^ i7;
                        i8 = ((iM6981 ^ i6) * (-24695)) ^ (-1526710509);
                        i9 = 1200119600;
                    } else {
                        iM6981 = (C2105.m6981("֨ۖ") ^ i6) * (-115);
                        i8 = ((iM6981 ^ i7) * 29179) ^ (-101146436);
                        i9 = -682650538;
                    }
                    break;
                case -1127592324:
                case 1547750606:
                    if (C7106.f21815 != 0) {
                        iM6981 = (i7 - C0630.m2566("ۧ᩶")) * (-73);
                        i8 = ((iM6981 ^ i6) * (-23277)) ^ 2142472011;
                        i9 = -497464146;
                    } else {
                        iM6981 = C0630.m2566("ܰۙ") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-27725)) ^ 1366624926;
                        i9 = 1669626927;
                    }
                    break;
                case -1064174816:
                case -209988858:
                    if (!C1005.f3721) {
                        iM6981 = (i6 - C2105.m6981("᩹۫")) * 71;
                        i8 = ((iM6981 ^ i7) * (-25151)) ^ (-842087862);
                        i9 = 70767946;
                    } else {
                        iM6981 = (i7 - C0630.m2566("ۧ᩶")) * (-73);
                        i8 = ((iM6981 ^ i6) * (-23277)) ^ 2142472011;
                        i9 = -497464146;
                    }
                    break;
                case -996369970:
                case 2075445780:
                    if (C1128.m3851() <= 0) {
                        iM6981 = (i6 - C2105.m6981("᩹۫")) * 71;
                        i8 = ((iM6981 ^ i7) * (-25151)) ^ (-842087862);
                        i9 = 70767946;
                    } else {
                        iM6981 = C0630.m2566("ۛܺ") ^ i6;
                        i8 = ((iM6981 ^ i7) * 31389) ^ (-528801236);
                        i9 = 1154840414;
                    }
                    break;
                case -895830276:
                case -81289023:
                    c = 398;
                    if (C3432.f10845 >= 0) {
                        iM6981 = (i7 - C0630.m2566("ۧ᩶")) * (-73);
                        i8 = ((iM6981 ^ i6) * (-23277)) ^ 2142472011;
                        i9 = -497464146;
                    } else {
                        iM6981 = C0630.m2566("ۤᩳ") ^ i7;
                        i8 = ((iM6981 ^ i6) * (-21915)) ^ (-1026565170);
                        i9 = -1070631131;
                    }
                    break;
                case -529729334:
                case 1858901855:
                    i4 = 13631;
                    iM6981 = (i6 - C2105.m6981("᩺۬")) * (-45);
                    i8 = ((iM6981 ^ i7) * (-3625)) ^ (-79082875);
                    i9 = 1243796670;
                    break;
                case -461734969:
                case -230780680:
                    i3 = 228765625;
                    if (C1128.f4106 <= 0) {
                        iM6981 = (C2105.m6981("᩸᩻") + i6) * (-41);
                        i8 = ((iM6981 ^ i7) * 20983) ^ 322372741;
                        i9 = -2030538352;
                    } else {
                        iM6981 = (i7 - C2105.m6981("ᩴܶ")) * 33;
                        i8 = ((iM6981 ^ i6) * (-5113)) ^ 1290063893;
                        i9 = -1710763619;
                    }
                    break;
                case -348366357:
                case 509423969:
                    if (this.f50644) {
                        iM6981 = C0630.m2566("ܰܳ") ^ i7;
                        i8 = ((iM6981 ^ i6) * 19709) ^ 1477146963;
                        i9 = 1881501403;
                    } else {
                        iM6981 = (C2105.m6981("֨ܳ") ^ i6) * 47;
                        i8 = ((iM6981 ^ i7) * 20195) ^ 72629500;
                        i9 = 1882693675;
                    }
                    break;
                case -283114628:
                case 159016771:
                    i = s * s2;
                    i2 = s * s;
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = (C2105.m6981("᩸᩻") + i6) * (-41);
                        i8 = ((iM6981 ^ i7) * 20983) ^ 322372741;
                        i9 = -2030538352;
                    } else {
                        iM6981 = (i6 - C2105.m6981("ۛۚ")) * 11;
                        i8 = ((iM6981 ^ i7) * (-29273)) ^ 1532164036;
                        i9 = -114898451;
                    }
                    break;
                case 1125461031:
                case 1933405639:
                    if (C1128.f4106 <= 0) {
                        iM6981 = C0630.m2566("ۧܰ") ^ i7;
                        i8 = ((iM6981 ^ i6) * (-20121)) ^ 564169715;
                        i9 = -544622550;
                    } else {
                        iM6981 = (i7 - C0630.m2566("ۧ᩶")) * (-73);
                        i8 = ((iM6981 ^ i6) * (-23277)) ^ 2142472011;
                        i9 = -497464146;
                    }
                    break;
                case 1352077217:
                case 1505685434:
                    return null;
                default:
                    if (this.f50640 == 0) {
                        iM6981 = (C2105.m6981("ۚۜ") ^ i7) * 91;
                        i8 = ((iM6981 ^ i6) * 22669) ^ (-853714504);
                        i9 = 850802060;
                    } else {
                        iM6981 = C2105.m6981("᩸ۖ") ^ i7;
                        i8 = ((iM6981 ^ i6) * (-24695)) ^ (-1526710509);
                        i9 = 1200119600;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6928 m38781(C16475 c16475, C12951 c12951, C12392 c12392, C15545 c15545) throws Throwable {
        int i = 0;
        Throwable th = null;
        boolean zM31490 = false;
        boolean zMo1607 = false;
        C6928 c6928 = null;
        int i2 = -1853945104;
        int i3 = C3911.f12484;
        int i4 = C3537.f11231;
        int iM2566 = C0630.m2566("ۤۛ") ^ i4;
        int i5 = ((iM2566 ^ i3) * (-1919)) ^ (-874931586);
        int i6 = -1633209420;
        while (true) {
            i2 = ((((i2 ^ i3) * (-12553)) >> 31) & i5) ^ (iM2566 ^ i6);
            switch (i2) {
                case -2069814356:
                case -1767607196:
                    C1128.m3851();
                    return null;
                case -1981565985:
                case 1327424393:
                    if (C2105.f7037 != 0) {
                        iM2566 = (i3 - C2105.m6981("ۜ᩵")) * 31;
                        i5 = ((iM2566 ^ i4) * (-16385)) ^ 1302565482;
                        i6 = -130576727;
                    } else {
                        iM2566 = (C0630.m2566("ܳᩳ") + i4) * (-61);
                        i5 = ((iM2566 ^ i3) * (-32703)) ^ 1321106763;
                        i6 = -308249566;
                    }
                    break;
                case -1877315521:
                case 1760785950:
                    zMo1607 = C1005.m3497(c12392).mo1607();
                    iM2566 = C2105.m6981("ۜ᩷") ^ i4;
                    i5 = ((iM2566 ^ i3) * (-1429)) ^ (-408720178);
                    i6 = -1993336852;
                    break;
                case -1707428346:
                case 190748438:
                    c6928 = new C6928(AbstractC5206.m14983(c12951.m31504()));
                    iM2566 = C0630.m2566("ܽۚ") ^ i3;
                    i5 = ((iM2566 ^ i4) * (-17029)) ^ 738790967;
                    i6 = -1911507146;
                    break;
                case -1698855604:
                case -667426892:
                    if (C0630.f2410 <= 0) {
                        iM2566 = (C0630.m2566("᩷ۜ") ^ i3) * (-115);
                        i5 = ((iM2566 ^ i4) * (-22495)) ^ 421564405;
                        i6 = -43172691;
                    } else {
                        iM2566 = C0630.m2566("ۡܺ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 17385) ^ (-1515714927);
                        i6 = -1436426766;
                    }
                    break;
                case -1697195004:
                case 861237462:
                    if (C21923.f70183 != 0) {
                        iM2566 = (C0630.m2566("᩷ۜ") ^ i3) * (-115);
                        i5 = ((iM2566 ^ i4) * (-22495)) ^ 421564405;
                        i6 = -43172691;
                    } else {
                        iM2566 = (C0630.m2566("֡᩷") + i3) * (-95);
                        i5 = ((iM2566 ^ i4) * (-12959)) ^ 1095484064;
                        i6 = 513649891;
                    }
                    break;
                case -1680416090:
                case 840875370:
                    c12392.m30435();
                    return c6928;
                case -1619763786:
                case -578555607:
                    RunnableC3474.m10630();
                    if (C22628.f73083 <= 0) {
                        iM2566 = C2105.m6981("ۜ۠") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-25147)) ^ 1308402774;
                        i6 = -1249206817;
                    } else {
                        iM2566 = C0630.m2566("ᩳ۬") ^ i4;
                        i5 = ((iM2566 ^ i3) * 26595) ^ 2030905318;
                        i6 = -1747839602;
                    }
                    break;
                case -1586203076:
                case 1440282887:
                    try {
                        c12392.m30336(c16475.m34236(c16475.f50650.m36268()).m27340());
                        iM2566 = C0630.m2566("ۗᩴ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 12173) ^ (-1899488394);
                        i6 = 2100636366;
                    } catch (Throwable th2) {
                        th = th2;
                        iM2566 = C2105.m6981("᩻ۛ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-10569)) ^ 1965246605;
                        i6 = 474727595;
                    }
                    break;
                case -1535300939:
                case -314137528:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = (i3 - C2105.m6981("ۜ᩵")) * 31;
                        i5 = ((iM2566 ^ i4) * (-16385)) ^ 1302565482;
                        i6 = -130576727;
                    } else {
                        iM2566 = (C0630.m2566("᩵ۨ") + i3) * 85;
                        i5 = ((iM2566 ^ i4) * (-29043)) ^ (-1388276524);
                        i6 = -863041128;
                    }
                    break;
                case -1494960149:
                case -482965528:
                    C0483.m2121();
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = (i4 - C0630.m2566("ܽܿ")) * 87;
                        i5 = ((iM2566 ^ i3) * 20837) ^ (-1792555859);
                        i6 = 1354511635;
                    } else {
                        iM2566 = (C0630.m2566("ۙ۠") ^ i4) * 29;
                        i5 = ((iM2566 ^ i3) * (-17331)) ^ (-1868112061);
                        i6 = 529438320;
                    }
                    break;
                case -1481061346:
                case 1727089616:
                    c12392.m30412(true);
                    i = 1382253410;
                    iM2566 = C2105.m6981("ۜ֫") ^ i4;
                    i5 = ((iM2566 ^ i3) * (-32475)) ^ (-142911522);
                    i6 = 1837083876;
                    break;
                case -1464733841:
                case -1127843103:
                    C22124.m49722((InterfaceC20008) c12951, i);
                    c16475.f50641 = C1916.m6304(c12951);
                    c16475.f50648 = C0964.m3406(c12951);
                    C22124.m49722((InterfaceC20008) c12951, i);
                    c12392.mo25896(c12951);
                    C22124.m49722((InterfaceC20008) c12951, i);
                    c15545.m36689(c12951);
                    C22124.m49722((InterfaceC20008) c12951, i);
                    c15545.m36682(c12951);
                    zM31490 = c12951.m31490(1382256833);
                    iM2566 = (C2105.m6981("᩵᩵") ^ i3) * 23;
                    i5 = ((iM2566 ^ i4) * (-13981)) ^ (-1218267107);
                    i6 = -597452141;
                    break;
                case -1309011537:
                case 431663091:
                    C3537.m10746();
                    if (C0630.f2410 > 0) {
                        iM2566 = (C2105.m6981("ۘ֨") + i3) * (-121);
                        i5 = ((iM2566 ^ i4) * (-24949)) ^ 2061954487;
                        i6 = 515834769;
                    } else {
                        iM2566 = (i4 - C0630.m2566("ܽܿ")) * 87;
                        i5 = ((iM2566 ^ i3) * 20837) ^ (-1792555859);
                        i6 = 1354511635;
                    }
                    break;
                case -1270879811:
                case 246379218:
                    if (C3683.f11629 >= 0) {
                        iM2566 = C0630.m2566("ᩳ۬") ^ i4;
                        i5 = ((iM2566 ^ i3) * 26595) ^ 2030905318;
                        i6 = -1747839602;
                    } else {
                        iM2566 = (C0630.m2566("۟᩵") ^ i4) * (-123);
                        i5 = ((iM2566 ^ i3) * 4661) ^ 673170949;
                        i6 = -1089539712;
                    }
                    break;
                case -1236822871:
                case 1341646344:
                    if (C1916.f6442) {
                        iM2566 = C2105.m6981("ܿۤ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 17997) ^ 940825706;
                        i6 = 1054088740;
                    } else {
                        iM2566 = (C2105.m6981("ۘ֨") + i3) * (-121);
                        i5 = ((iM2566 ^ i4) * (-24949)) ^ 2061954487;
                        i6 = 515834769;
                    }
                    break;
                case -1196321762:
                case 591730869:
                    c6928 = null;
                    iM2566 = C0630.m2566("ܽۚ") ^ i3;
                    i5 = ((iM2566 ^ i4) * (-17029)) ^ 738790967;
                    i6 = -1911507146;
                    break;
                case -1171224463:
                case -477669211:
                    if (C3746.f11829 <= 0) {
                        iM2566 = C0630.m2566("ۗ᩻") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-14947)) ^ 1117679948;
                        i6 = 1074233210;
                    } else {
                        iM2566 = (C2105.m6981("۫᩺") ^ i3) * (-87);
                        i5 = ((iM2566 ^ i4) * (-26185)) ^ 1131049536;
                        i6 = -1433301859;
                    }
                    break;
                case -1116060897:
                case 1485436093:
                    if (zMo1607) {
                        iM2566 = C0630.m2566("ۗᩴ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 12173) ^ (-1899488394);
                        i6 = 2100636366;
                    } else {
                        iM2566 = C2105.m6981("ۢܽ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 32287) ^ (-1915431289);
                        i6 = -1287978103;
                    }
                    break;
                case -1105924676:
                case -351474916:
                    if (C1047.m3599() >= 0) {
                        iM2566 = C0630.m2566("ᩳ۬") ^ i4;
                        i5 = ((iM2566 ^ i3) * 26595) ^ 2030905318;
                        i6 = -1747839602;
                    } else {
                        iM2566 = (i3 - C2105.m6981("֫ۜ")) * 3;
                        i5 = ((iM2566 ^ i4) * 30133) ^ (-1156806089);
                        i6 = -1275081771;
                    }
                    break;
                case -1084922489:
                case 354959371:
                    C1504.m5179();
                    if (C3245.f10203 <= 0) {
                        iM2566 = (C0630.m2566("᩷ۜ") ^ i3) * (-115);
                        i5 = ((iM2566 ^ i4) * (-22495)) ^ 421564405;
                        i6 = -43172691;
                    } else {
                        iM2566 = C0630.m2566("ᩳ۬") ^ i4;
                        i5 = ((iM2566 ^ i3) * 26595) ^ 2030905318;
                        i6 = -1747839602;
                    }
                    break;
                case -1065152686:
                case 963066502:
                    if (!RunnableC1108.f4040) {
                        iM2566 = (i4 - C0630.m2566("ܽܿ")) * 87;
                        i5 = ((iM2566 ^ i3) * 20837) ^ (-1792555859);
                        i6 = 1354511635;
                    } else {
                        iM2566 = C0630.m2566("ᩳ۬") ^ i4;
                        i5 = ((iM2566 ^ i3) * 26595) ^ 2030905318;
                        i6 = -1747839602;
                    }
                    break;
                case -688221143:
                case 1181229853:
                    RunnableC0588.m2441();
                    iM2566 = (C0630.m2566("۟᩵") ^ i4) * (-123);
                    i5 = ((iM2566 ^ i3) * 4661) ^ 673170949;
                    i6 = -1089539712;
                    break;
                case -297406010:
                case 2077756865:
                    if (C1005.f3721) {
                        iM2566 = C2105.m6981("֫ۘ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-9417)) ^ (-1837463606);
                        i6 = 1804153526;
                    } else {
                        iM2566 = (C0630.m2566("۟᩵") ^ i4) * (-123);
                        i5 = ((iM2566 ^ i3) * 4661) ^ 673170949;
                        i6 = -1089539712;
                    }
                    break;
                case -289555312:
                case 123241817:
                    if (C4117.f13076 <= 0) {
                        iM2566 = C2105.m6981("ۜ۠") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-25147)) ^ 1308402774;
                        i6 = -1249206817;
                    } else {
                        iM2566 = (C0630.m2566("ۤۚ") + i4) * (-127);
                        i5 = ((iM2566 ^ i3) * 1439) ^ (-1359801447);
                        i6 = 1846760644;
                    }
                    break;
                case -89400962:
                case 2085557082:
                    c12392.m30412(false);
                    throw th;
                case 223553069:
                case 824078197:
                    if (C5695.f17556 < 0) {
                        iM2566 = C0630.m2566("ۗ᩻") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-14947)) ^ 1117679948;
                        i6 = 1074233210;
                    } else {
                        iM2566 = C0630.m2566("ܽᩳ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 20483) ^ (-1350830137);
                        i6 = -10912976;
                    }
                    break;
                case 570457495:
                case 1593984791:
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = (C2105.m6981("ۘ֨") + i3) * (-121);
                        i5 = ((iM2566 ^ i4) * (-24949)) ^ 2061954487;
                        i6 = 515834769;
                    } else {
                        iM2566 = (C0630.m2566("ܿܿ") ^ i4) * (-35);
                        i5 = ((iM2566 ^ i3) * 24585) ^ 484187762;
                        i6 = -1093508214;
                    }
                    break;
                case 1153139392:
                case 1681082897:
                    if (!C2272.f7362) {
                        iM2566 = C0630.m2566("ܽᩳ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 20483) ^ (-1350830137);
                        i6 = -10912976;
                    } else {
                        iM2566 = (C0630.m2566("۟᩵") ^ i4) * (-123);
                        i5 = ((iM2566 ^ i3) * 4661) ^ 673170949;
                        i6 = -1089539712;
                    }
                    break;
                default:
                    if (zM31490) {
                        iM2566 = (C0630.m2566("ۧ᩸") + i4) * 9;
                        i5 = ((iM2566 ^ i3) * (-13475)) ^ (-797079618);
                        i6 = 1423406469;
                    } else {
                        iM2566 = (i4 - C0630.m2566("֫ۖ")) * (-99);
                        i5 = ((iM2566 ^ i3) * (-11917)) ^ 598146537;
                        i6 = 1560757053;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.View, android.widget.TextView, l.۫ۨᩳ, l.ܶ᩺ᩳ, l.ܺۧۢ, l.᩶ܿۢ] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // l.ComponentCallbacksC9205
    public final void onDestroyView() {
        boolean z = false;
        C15893 c15893 = null;
        C12392 c12392 = null;
        C15545 c15545 = null;
        ActivityC17169 activityC17169 = null;
        ?? r5 = 0;
        int i = 1193368632;
        int i2 = C1294.f4556;
        int i3 = C0630.f2410;
        int iM2566 = (i2 - C0630.m2566("۠ۜ")) * 83;
        int i4 = ((iM2566 ^ i3) * (-20981)) ^ 2137999156;
        int i5 = 1246117532;
        while (true) {
            i = ((((i ^ i3) * (-27787)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2129036815:
                case -992016649:
                    c12392 = this.f50649;
                    if (c12392 != null) {
                        iM2566 = (i2 - C2105.m6981("᩵ۧ")) * (-117);
                        i4 = ((iM2566 ^ i3) * 10681) ^ 433631137;
                        i5 = 1020902961;
                    } else {
                        iM2566 = (C0630.m2566("ۙ֨") ^ i3) * (-51);
                        i4 = ((iM2566 ^ i2) * 6851) ^ 949948526;
                        i5 = -219948286;
                    }
                    break;
                case -2120026390:
                case 1085740400:
                    if (C3911.m11924() <= 0) {
                        iM2566 = C0630.m2566("ۚ֡") ^ i3;
                        i4 = ((iM2566 ^ i2) * 28811) ^ 9371696;
                        i5 = -213432793;
                    } else {
                        iM2566 = (C0630.m2566("ۤ۟") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM2566 ^ i2) * (-319)) ^ (-375324149);
                        i5 = 1499468078;
                    }
                    break;
                case -2077743365:
                case -870899570:
                    z = false;
                    if (C3432.f10845 >= 0) {
                        iM2566 = (C2105.m6981("֡ۧ") + i2) * (-15);
                        i4 = ((iM2566 ^ i3) * 32501) ^ (-742254588);
                        i5 = -917785390;
                    } else {
                        iM2566 = (C0630.m2566("ۛۡ") + i2) * (-51);
                        i4 = ((iM2566 ^ i3) * (-10427)) ^ 1478493924;
                        i5 = 1362909679;
                    }
                    break;
                case -2041509372:
                case 1836504092:
                    this.f50651 = r5;
                    if (C3746.f11829 <= 0) {
                        iM2566 = (i3 - C0630.m2566("ܶᩴ")) * (-111);
                        i4 = ((iM2566 ^ i2) * 16451) ^ 1401176432;
                        i5 = -1629132093;
                    } else {
                        iM2566 = (C0630.m2566("᩸ۛ") ^ i2) * 33;
                        i4 = ((iM2566 ^ i3) * 19591) ^ (-1344298719);
                        i5 = -704801735;
                    }
                    break;
                case -1915369000:
                case -1443400858:
                    C3911.m11924();
                    break;
                case -1638361349:
                case -163978246:
                    c15893.close();
                    iM2566 = (C2105.m6981("ۚ᩺") ^ i2) * (-13);
                    i4 = ((iM2566 ^ i3) * (-19079)) ^ (-16488775);
                    i5 = -1651899328;
                    break;
                case -1438219535:
                case 1655278959:
                    C0237.m1481();
                    if (!C2272.m7503()) {
                        iM2566 = (C2105.m6981("֡ۧ") + i2) * (-15);
                        i4 = ((iM2566 ^ i3) * 32501) ^ (-742254588);
                        i5 = -917785390;
                    } else {
                        iM2566 = C0630.m2566("᩻ۜ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 10115) ^ (-1499729562);
                        i5 = -386356936;
                    }
                    break;
                case -1417451600:
                case 1207117010:
                    C3537.m10746();
                    C3537.m10746();
                    iM2566 = C0630.m2566("ۚ֡") ^ i3;
                    i4 = ((iM2566 ^ i2) * 28811) ^ 9371696;
                    i5 = -213432793;
                    break;
                case -948642176:
                case -90014777:
                    activityC17169 = (ActivityC17169) C3683.m11214(this);
                    if (C3537.f11231 >= 0) {
                        iM2566 = (i3 - C0630.m2566("ܶᩴ")) * (-111);
                        i4 = ((iM2566 ^ i2) * 16451) ^ 1401176432;
                        i5 = -1629132093;
                    } else {
                        iM2566 = (i3 - C0630.m2566("᩺ۗ")) * (-41);
                        i4 = ((iM2566 ^ i2) * (-12871)) ^ 1164087735;
                        i5 = 634426748;
                    }
                    break;
                case -589006318:
                case 860999435:
                    C3537.m10746();
                    if (C22628.f73083 <= 0) {
                        iM2566 = (C0630.m2566("֨֨") ^ i3) * 95;
                        i4 = ((iM2566 ^ i2) * 4181) ^ (-1511907845);
                        i5 = -975637867;
                    } else {
                        iM2566 = C0630.m2566("ۚ֡") ^ i3;
                        i4 = ((iM2566 ^ i2) * 28811) ^ 9371696;
                        i5 = -213432793;
                    }
                    break;
                case -173915247:
                case 1697100905:
                    this.f50646 = r5;
                    this.f50655 = r5;
                    if (C1773.m5908() <= 0) {
                        iM2566 = C0630.m2566("᩻ۜ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 10115) ^ (-1499729562);
                        i5 = -386356936;
                    } else {
                        iM2566 = C0630.m2566("֡۠") ^ i3;
                        i4 = ((iM2566 ^ i2) * 9331) ^ (-2005992338);
                        i5 = -589213667;
                    }
                    break;
                case -171080799:
                case 1401151964:
                    super.onDestroyView();
                    if (C3663.m11168() >= 0) {
                        iM2566 = (C2105.m6981("֡ۧ") + i2) * (-15);
                        i4 = ((iM2566 ^ i3) * 32501) ^ (-742254588);
                        i5 = -917785390;
                    } else {
                        iM2566 = (C2105.m6981("ۢۙ") ^ i3) * 21;
                        i4 = ((iM2566 ^ i2) * 9663) ^ 381265173;
                        i5 = 545023256;
                    }
                    break;
                case -130690470:
                case 1342725469:
                    if (RunnableC0588.m2441() >= 0) {
                        iM2566 = (C2105.m6981("֡ۧ") + i2) * (-15);
                        i4 = ((iM2566 ^ i3) * 32501) ^ (-742254588);
                        i5 = -917785390;
                    } else {
                        iM2566 = (C2105.m6981("᩶۬") ^ i2) * (-61);
                        i4 = ((iM2566 ^ i3) * 25139) ^ (-2140967751);
                        i5 = -878864643;
                    }
                    break;
                case 103712618:
                case 469931004:
                    c15545.m36695();
                    iM2566 = (i2 - C2105.m6981("۟᩺")) * (-63);
                    i4 = ((iM2566 ^ i3) * 10111) ^ (-1231365555);
                    i5 = 711115824;
                    break;
                case 470206295:
                case 2143321795:
                    c15545 = this.f50646;
                    if (c15545 != null) {
                        iM2566 = C2105.m6981("᩸᩸") ^ i3;
                        i4 = ((iM2566 ^ i2) * 5481) ^ 952055587;
                        i5 = 1553803052;
                    } else {
                        iM2566 = (i2 - C2105.m6981("۟᩺")) * (-63);
                        i4 = ((iM2566 ^ i3) * 10111) ^ (-1231365555);
                        i5 = 711115824;
                    }
                    break;
                case 522343662:
                case 1051132834:
                    c12392.m30386();
                    iM2566 = (C0630.m2566("ۙ֨") ^ i3) * (-51);
                    i4 = ((iM2566 ^ i2) * 6851) ^ 949948526;
                    i5 = -219948286;
                    break;
                case 739370508:
                case 769635315:
                    r5 = 0;
                    r5 = 0;
                    if (C0422.f1886 <= 0) {
                        iM2566 = C0630.m2566("᩻ۜ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 10115) ^ (-1499729562);
                        i5 = -386356936;
                    } else {
                        iM2566 = (C2105.m6981("ܿܰ") ^ i2) * 73;
                        i4 = ((iM2566 ^ i3) * 5845) ^ 1627467265;
                        i5 = -1798982041;
                    }
                    break;
                case 1020309284:
                case 2000225875:
                    C1128.m3851();
                    if (C0237.f1507 == 0) {
                        iM2566 = C0630.m2566("᩻ۜ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 10115) ^ (-1499729562);
                        i5 = -386356936;
                    } else {
                        iM2566 = C0630.m2566("ۚ֡") ^ i3;
                        i4 = ((iM2566 ^ i2) * 28811) ^ 9371696;
                        i5 = -213432793;
                    }
                    break;
                case 1084614016:
                case 1610525843:
                    activityC17169.m10234();
                    if (C1128.f4106 <= 0) {
                        iM2566 = (C0630.m2566("֨֨") ^ i3) * 95;
                        i4 = ((iM2566 ^ i2) * 4181) ^ (-1511907845);
                        i5 = -975637867;
                    } else {
                        iM2566 = (C0630.m2566("֨᩸") + i3) * 85;
                        i4 = ((iM2566 ^ i2) * (-11421)) ^ (-197969424);
                        i5 = 819840957;
                    }
                    break;
                case 1342633168:
                case 2107299373:
                    this.f50656 = r5;
                    this.f50649 = r5;
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = (i3 - C0630.m2566("ܶᩴ")) * (-111);
                        i4 = ((iM2566 ^ i2) * 16451) ^ 1401176432;
                        i5 = -1629132093;
                    } else {
                        iM2566 = (C2105.m6981("᩵ۖ") + i2) * (-47);
                        i4 = ((iM2566 ^ i3) * (-6441)) ^ (-1884181442);
                        i5 = 695008125;
                    }
                    break;
                case 1849077649:
                case 1881430514:
                    this.f50644 = z;
                    c15893 = this.f50651;
                    if (c15893 != null) {
                        iM2566 = C0630.m2566("᩸᩵") ^ i3;
                        i4 = ((iM2566 ^ i2) * 29129) ^ (-315792111);
                        i5 = -1400225215;
                    } else {
                        iM2566 = (C2105.m6981("ۚ᩺") ^ i2) * (-13);
                        i4 = ((iM2566 ^ i3) * (-19079)) ^ (-16488775);
                        i5 = -1651899328;
                    }
                    break;
                default:
                    this.f50643 = r5;
                    this.f50642 = r5;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00f9 A[PHI: r4
      0x00f9: PHI (r4v4 byte) = (r4v3 byte), (r4v2 byte) binds: [B:33:0x00f7, B:13:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x0135 A[PHI: r2 r3
      0x0135: PHI (r2v4 l.۬ۤۡ) = (r2v3 l.۬ۤۡ), (r2v2 l.۬ۤۡ), (r2v2 l.۬ۤۡ), (r2v2 l.۬ۤۡ) binds: [B:37:0x0133, B:18:0x0086, B:16:0x0082, B:13:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0135: PHI (r3v4 int) = (r3v3 int), (r3v2 int), (r3v2 int), (r3v2 int) binds: [B:37:0x0133, B:18:0x0086, B:16:0x0082, B:13:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x016a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0274 A[PHI: r5 r8 r9 r14 r15 r20
      0x0274: PHI (r5v3 l.۬ۤۡ) = (r5v2 l.۬ۤۡ), (r5v2 l.۬ۤۡ), (r5v2 l.۬ۤۡ), (r5v2 l.۬ۤۡ), (r5v2 l.۬ۤۡ), (r5v5 l.۬ۤۡ) binds: [B:68:0x0272, B:60:0x0237, B:29:0x00d8, B:16:0x0082, B:9:0x005e, B:6:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r8v4 short) = (r8v2 short), (r8v3 short), (r8v2 short), (r8v2 short), (r8v2 short), (r8v2 short) binds: [B:68:0x0272, B:60:0x0237, B:29:0x00d8, B:16:0x0082, B:9:0x005e, B:6:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r9v4 short) = (r9v2 short), (r9v3 short), (r9v2 short), (r9v2 short), (r9v2 short), (r9v2 short) binds: [B:68:0x0272, B:60:0x0237, B:29:0x00d8, B:16:0x0082, B:9:0x005e, B:6:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r14v4 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v3 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:68:0x0272, B:60:0x0237, B:29:0x00d8, B:16:0x0082, B:9:0x005e, B:6:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:68:0x0272, B:60:0x0237, B:29:0x00d8, B:16:0x0082, B:9:0x005e, B:6:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:68:0x0272, B:60:0x0237, B:29:0x00d8, B:16:0x0082, B:9:0x005e, B:6:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x02a2 A[PHI: r7 r10 r11 r12
      0x02a2: PHI (r7v4 char) = (r7v2 char), (r7v3 char), (r7v2 char), (r7v2 char) binds: [B:72:0x02a0, B:64:0x0256, B:56:0x0216, B:52:0x01f8] A[DONT_GENERATE, DONT_INLINE]
      0x02a2: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:72:0x02a0, B:64:0x0256, B:56:0x0216, B:52:0x01f8] A[DONT_GENERATE, DONT_INLINE]
      0x02a2: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v4 int) binds: [B:72:0x02a0, B:64:0x0256, B:56:0x0216, B:52:0x01f8] A[DONT_GENERATE, DONT_INLINE]
      0x02a2: PHI (r12v3 int) = (r12v2 int), (r12v2 int), (r12v2 int), (r12v4 int) binds: [B:72:0x02a0, B:64:0x0256, B:56:0x0216, B:52:0x01f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38791(C16475 c16475, DialogInterfaceC0206 dialogInterfaceC0206) {
        int iM2566;
        int i;
        int i2;
        int i3 = C2958.f9394;
        int i4 = C1047.f3863;
        int iM2567 = C0630.m2566("ۗ᩷") ^ i3;
        int i5 = ((iM2567 ^ i4) * 13999) ^ 676101584;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2567 ^ 1383081480;
        InterfaceC13049 interfaceC13049M6438 = null;
        int i7 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 989915440;
        InterfaceC13049 interfaceC13049Mo25852 = null;
        byte b = 0;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * 9843) >> 31));
            switch (i13) {
                case -1877721268:
                case 875405504:
                    sArr = f50637;
                    if (C1711.f5919) {
                        iM2566 = C2105.m6981("ۜ᩶") ^ i3;
                        i = ((iM2566 ^ i4) * 31929) ^ 270510134;
                        i2 = 1811647307;
                    } else {
                        iM2566 = C0630.m2566("֡ܿ") ^ i3;
                        i = ((iM2566 ^ i4) * (-7781)) ^ (-1668020236);
                        i2 = -493472710;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1638319787:
                case 1034198743:
                    i11 = 34118;
                    iM2566 = (i4 - C2105.m6981("۠ܽ")) * (-3);
                    i = ((iM2566 ^ i3) * (-15717)) ^ (-1529808669);
                    i2 = -1861073032;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1629897018:
                case 639488564:
                    C3683.m11222();
                    C1773.m5908();
                    iM2566 = C2105.m6981("֡۫") ^ i4;
                    i = ((iM2566 ^ i3) * (-17959)) ^ 201091359;
                    i2 = 1803119048;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1487793633:
                case -1023015187:
                    if (C0422.f1886 <= 0) {
                        iM2566 = C0630.m2566("ۘ۠") ^ i3;
                        i = ((iM2566 ^ i4) * (-20291)) ^ (-152707678);
                        i2 = -1901019344;
                    } else {
                        iM2566 = (i4 - C0630.m2566("ܳ֨")) * 77;
                        i = ((iM2566 ^ i3) * (-11637)) ^ (-1533080099);
                        i2 = -1191613372;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1195531512:
                case 1812862388:
                    interfaceC13049M6438 = ViewOnClickListenerC1958.m6438(ApplicationC20075.f65008);
                    i7 = c16475.f50659;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = C2105.m6981("֡۫") ^ i4;
                        i = ((iM2566 ^ i3) * (-17959)) ^ 201091359;
                        i2 = 1803119048;
                    } else {
                        iM2566 = C2105.m6981("ܰ۟") ^ i3;
                        i = ((iM2566 ^ i4) * (-22743)) ^ 1108472097;
                        i2 = 850545914;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1145794975:
                case -529074976:
                    if (C7106.m19120() > 0) {
                        iM2566 = C2105.m6981("֡۫") ^ i4;
                        i = ((iM2566 ^ i3) * (-17959)) ^ 201091359;
                        i2 = 1803119048;
                    } else {
                        iM2566 = C2105.m6981("ۜ᩶") ^ i3;
                        i = ((iM2566 ^ i4) * 31929) ^ 270510134;
                        i2 = 1811647307;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1131227602:
                case -964115548:
                    C3663.m11167(dialogInterfaceC0206);
                    if (c16475.f50641 == c16475.f50659) {
                        iM2566 = (C2105.m6981("ۤ᩶") ^ i3) * (-83);
                        i = ((iM2566 ^ i4) * (-12729)) ^ (-1651915302);
                        i2 = -1546723417;
                    } else {
                        iM2566 = (C0630.m2566("ᩴ۟") ^ i3) * 3;
                        i = ((iM2566 ^ i4) * (-17753)) ^ (-1564109225);
                        i2 = -1284787008;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1105640748:
                case -503849328:
                    if ((i10 + 1) - i9 > 0) {
                        iM2566 = (C0630.m2566("ۡ֡") ^ i4) * (-11);
                        i = ((iM2566 ^ i3) * (-31963)) ^ 2102193008;
                        i2 = 1972853832;
                    } else {
                        iM2566 = (C2105.m6981("ܶ۫") ^ i3) * (-57);
                        i = ((iM2566 ^ i4) * 28505) ^ (-485502858);
                        i2 = 1762469963;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1014663573:
                case 1403269820:
                    C1916.m6302(interfaceC13049Mo25852);
                    if (c16475.f50644) {
                        iM2566 = C0630.m2566("ܿ᩺") ^ i4;
                        i = ((iM2566 ^ i3) * 21365) ^ (-413029288);
                        i2 = -1770761250;
                    } else {
                        iM2566 = (C2105.m6981("ۤ᩶") ^ i3) * (-83);
                        i = ((iM2566 ^ i4) * (-12729)) ^ (-1651915302);
                        i2 = -1546723417;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -951838115:
                case 453815724:
                    C4263.m12821(new C1659(c16475));
                    break;
                case -946834494:
                case 1840033562:
                    b = (byte) i7;
                    if (C0714.f2697 >= 0) {
                        iM2566 = (C2105.m6981("֨֫") ^ i4) * (-101);
                        i = ((iM2566 ^ i3) * 273) ^ (-456442936);
                        i2 = -1797855153;
                    } else {
                        iM2566 = (i4 - C2105.m6981("ܰܶ")) * 81;
                        i = ((iM2566 ^ i3) * 18289) ^ (-609500008);
                        i2 = 310248536;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -791746037:
                case 525240343:
                    sArr2 = f50637;
                    i12 = 70;
                    if (C2958.f9394 >= 0) {
                        iM2566 = C2105.m6981("ۜ᩶") ^ i3;
                        i = ((iM2566 ^ i4) * 31929) ^ 270510134;
                        i2 = 1811647307;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ۖ۟")) * 3;
                        i = ((iM2566 ^ i4) * (-28879)) ^ 1430242843;
                        i2 = 1670750675;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -764644841:
                case 1855714204:
                    i8 = s + s2;
                    if (C1047.f3863 >= 0) {
                        iM2566 = C0630.m2566("ۘ۠") ^ i3;
                        i = ((iM2566 ^ i4) * (-20291)) ^ (-152707678);
                        i2 = -1901019344;
                    } else {
                        iM2566 = (C0630.m2566("ܽܽ") + i4) * (-33);
                        i = ((iM2566 ^ i3) * (-22275)) ^ (-151867297);
                        i2 = -1999364751;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -727542236:
                case 639822150:
                    break;
                case -436086325:
                case 485030816:
                    C4263.m12819();
                    break;
                case 40720869:
                case 2017487804:
                    i11 = 28331;
                    iM2566 = (i4 - C2105.m6981("۠ܽ")) * (-3);
                    i = ((iM2566 ^ i3) * (-15717)) ^ (-1529808669);
                    i2 = -1861073032;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 397695763:
                case 1623246887:
                    c = 'E';
                    if (C1294.m4372() <= 0) {
                        iM2566 = C0630.m2566("ۘ۠") ^ i3;
                        i = ((iM2566 ^ i4) * (-20291)) ^ (-152707678);
                        i2 = -1901019344;
                    } else {
                        iM2566 = C0630.m2566("ܿܿ") ^ i4;
                        i = ((iM2566 ^ i3) * 25141) ^ 2054366418;
                        i2 = -271756034;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 413524665:
                case 1270705318:
                    i9 = i8 * i8;
                    i10 = s * 2;
                    if (C1711.f5919) {
                        iM2566 = C0630.m2566("ۘ۠") ^ i3;
                        i = ((iM2566 ^ i4) * (-20291)) ^ (-152707678);
                        i2 = -1901019344;
                    } else {
                        iM2566 = C0630.m2566("ۖ۬") ^ i3;
                        i = ((iM2566 ^ i4) * (-6251)) ^ 504005644;
                        i2 = 1262174869;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 415293145:
                case 981907383:
                    if (C2272.f7362) {
                        iM2566 = C2105.m6981("֡۫") ^ i4;
                        i = ((iM2566 ^ i3) * (-17959)) ^ 201091359;
                        i2 = 1803119048;
                    } else {
                        iM2566 = (C2105.m6981("֨֫") ^ i4) * (-101);
                        i = ((iM2566 ^ i3) * 273) ^ (-456442936);
                        i2 = -1797855153;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 899656339:
                case 2073214639:
                    if (C0798.f2919) {
                        iM2566 = C2105.m6981("ۜ᩶") ^ i3;
                        i = ((iM2566 ^ i4) * 31929) ^ 270510134;
                        i2 = 1811647307;
                    } else {
                        iM2566 = C2105.m6981("ۤܿ") ^ i3;
                        i = ((iM2566 ^ i4) * 24511) ^ 269843189;
                        i2 = -811290117;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 1656075895:
                case 1827637395:
                    s = sArr[c];
                    s2 = 1;
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = C2105.m6981("ۜ᩶") ^ i3;
                        i = ((iM2566 ^ i4) * 31929) ^ 270510134;
                        i2 = 1811647307;
                    } else {
                        iM2566 = C0630.m2566("ۧܺ") ^ i3;
                        i = ((iM2566 ^ i4) * 3535) ^ 1578839368;
                        i2 = -1682312136;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                default:
                    interfaceC13049Mo25852 = interfaceC13049M6438.mo25852(b, C11340.m28025(sArr2, i12, 20, i11));
                    if (C2105.f7037 != 0) {
                        iM2566 = C2105.m6981("ۜ᩶") ^ i3;
                        i = ((iM2566 ^ i4) * 31929) ^ 270510134;
                        i2 = 1811647307;
                    } else {
                        iM2566 = (C2105.m6981("ܶ᩶") + i4) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM2566 ^ i3) * (-13965)) ^ (-771764919);
                        i2 = -68646847;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m38802(C16475 c16475) {
        C12366 c12366 = null;
        C12230 c12230 = null;
        C11005 c11005M36268 = null;
        C11005 c11005M34233 = null;
        byte[] bArrM27337 = null;
        C12951 c12951M31485 = null;
        int i = 0;
        C11005 c11005M36269 = null;
        int i2 = 0;
        int i3 = 1688917208;
        int i4 = C2520.f8000;
        int i5 = C7811.f24123;
        int iM2566 = (C0630.m2566("ۢ᩶") + i5) * (-27);
        int i6 = ((iM2566 ^ i4) * (-8047)) ^ (-874447301);
        int i7 = 1943313902;
        while (true) {
            i3 = ((((i3 ^ i4) * (-2697)) >> 31) & i6) ^ (iM2566 ^ i7);
            switch (i3) {
                case -2049299893:
                case -622393334:
                    C0382.m1848();
                    return null;
                case -2022591009:
                case -944569951:
                    i2 = 0;
                    iM2566 = C2105.m6981("ᩳۤ") ^ i5;
                    i6 = ((iM2566 ^ i4) * (-16013)) ^ (-71505979);
                    i7 = 251216540;
                    break;
                case -1939832969:
                case 1875424078:
                    C4616.m13552();
                    if (!C1916.f6442) {
                        iM2566 = C2105.m6981("ۧۛ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 6667) ^ (-1825501005);
                        i7 = -90972124;
                    } else {
                        iM2566 = C2105.m6981("۬ۙ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 20615) ^ (-1985272928);
                        i7 = 349588031;
                    }
                    break;
                case -1683824972:
                case 1151524416:
                    c12951M31485.skipBytes(2);
                    if (C4616.f14690 <= 0) {
                        iM2566 = C2105.m6981("ᩳۘ") ^ i5;
                        i6 = ((iM2566 ^ i4) * 7845) ^ 829086935;
                        i7 = -566539060;
                    } else {
                        iM2566 = (C0630.m2566("ۜܽ") + i5) * (-127);
                        i6 = ((iM2566 ^ i4) * 15605) ^ (-259523452);
                        i7 = -818524583;
                    }
                    break;
                case -1661637935:
                case 1213561801:
                    c12366 = c16475.f50650;
                    if (C3663.f11553) {
                        iM2566 = C2105.m6981("᩷֫") ^ i5;
                        i6 = ((iM2566 ^ i4) * 29523) ^ 1220795908;
                        i7 = 1796536153;
                    } else {
                        iM2566 = C2105.m6981("ۙۢ") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-25489)) ^ 1477313563;
                        i7 = -906251285;
                    }
                    break;
                case -1619894522:
                case 1429745364:
                    C7106.m19120();
                    if (!C3663.f11553) {
                        iM2566 = C2105.m6981("ۧۛ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 6667) ^ (-1825501005);
                        i7 = -90972124;
                    } else {
                        iM2566 = C2105.m6981("᩷֫") ^ i5;
                        i6 = ((iM2566 ^ i4) * 29523) ^ 1220795908;
                        i7 = 1796536153;
                    }
                    break;
                case -1438545636:
                case 408274481:
                    c12230.m29734();
                    c11005M36268 = c12366.m36268();
                    if (C2958.f9394 >= 0) {
                        iM2566 = C2105.m6981("ᩳۘ") ^ i5;
                        i6 = ((iM2566 ^ i4) * 7845) ^ 829086935;
                        i7 = -566539060;
                    } else {
                        iM2566 = C0630.m2566("۟ۚ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 9027) ^ 650184481;
                        i7 = -2008632887;
                    }
                    break;
                case -1250343255:
                case -530686790:
                    C0714.m2805();
                    if (C22628.f73083 <= 0) {
                        iM2566 = C2105.m6981("ᩳۘ") ^ i5;
                        i6 = ((iM2566 ^ i4) * 7845) ^ 829086935;
                        i7 = -566539060;
                    } else {
                        iM2566 = C2105.m6981("ۧۛ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 6667) ^ (-1825501005);
                        i7 = -90972124;
                    }
                    break;
                case -1131223220:
                case -386561850:
                    c11005M36269 = c12366.m36268();
                    if (C3019.f9544 >= 0) {
                        iM2566 = C2105.m6981("᩷֫") ^ i5;
                        i6 = ((iM2566 ^ i4) * 29523) ^ 1220795908;
                        i7 = 1796536153;
                    } else {
                        iM2566 = C0630.m2566("᩸᩺") ^ i5;
                        i6 = ((iM2566 ^ i4) * 25191) ^ (-941841085);
                        i7 = 1657043412;
                    }
                    break;
                case -1119087465:
                case 1334768330:
                    SystemClock.sleep(100L);
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = C2105.m6981("۬ۙ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 20615) ^ (-1985272928);
                        i7 = 349588031;
                    } else {
                        iM2566 = C0630.m2566("۟᩹") ^ i5;
                        i6 = ((iM2566 ^ i4) * 11287) ^ 459307495;
                        i7 = 1753873549;
                    }
                    break;
                case -1089815286:
                case -87878423:
                    if (i2 < 50) {
                        iM2566 = (C0630.m2566("֫ۤ") + i4) * 37;
                        i6 = ((iM2566 ^ i5) * 3037) ^ (-159253840);
                        i7 = 1590195158;
                    } else {
                        iM2566 = (i4 - C2105.m6981("ܺۤ")) * (-117);
                        i6 = ((iM2566 ^ i5) * (-23631)) ^ 1586294433;
                        i7 = -341651639;
                    }
                    break;
                case -1066961633:
                case -190238570:
                    RunnableC0588.m2441();
                    if (C1047.f3863 >= 0) {
                        iM2566 = C2105.m6981("ۧۛ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 6667) ^ (-1825501005);
                        i7 = -90972124;
                    } else {
                        iM2566 = C2105.m6981("ۢܺ") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-32313)) ^ 383644702;
                        i7 = 1054691941;
                    }
                    break;
                case -977586745:
                case 1328467871:
                    if (c16475.f50644) {
                        iM2566 = C0630.m2566("֫᩺") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-17039)) ^ 1945419360;
                        i7 = 1540147119;
                    } else {
                        iM2566 = C2105.m6981("᩻ۨ") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-13225)) ^ (-1368735137);
                        i7 = -1448724293;
                    }
                    break;
                case -751307887:
                case -192069627:
                    return C6748.m18370(c12951M31485, c16475.m34236(c11005M36269).m27340());
                case -646326608:
                case 378784824:
                    i2++;
                    iM2566 = C2105.m6981("ᩳۤ") ^ i5;
                    i6 = ((iM2566 ^ i4) * (-16013)) ^ (-71505979);
                    i7 = 251216540;
                    break;
                case -626325368:
                case 538060264:
                    return C0050.m947(C11340.m28030(c16475.f50649));
                case -365115193:
                case 378489819:
                    if (c16475.f50638) {
                        iM2566 = (C0630.m2566("ۘᩳ") + i4) * (-33);
                        i6 = ((iM2566 ^ i5) * 5557) ^ (-993842674);
                        i7 = -542028071;
                    } else {
                        iM2566 = C2105.m6981("᩻ۨ") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-13225)) ^ (-1368735137);
                        i7 = -1448724293;
                    }
                    break;
                case -122541249:
                case 65184326:
                    c11005M34233 = c16475.m34233(c11005M36268);
                    if (C0964.f3626 != 0) {
                        iM2566 = C2105.m6981("ᩳۘ") ^ i5;
                        i6 = ((iM2566 ^ i4) * 7845) ^ 829086935;
                        i7 = -566539060;
                    } else {
                        iM2566 = C0630.m2566("᩶ۨ") ^ i5;
                        i6 = ((iM2566 ^ i4) * 19921) ^ (-1352116572);
                        i7 = -1368823429;
                    }
                    break;
                case -50995814:
                case 1899492516:
                    C7811.m20844();
                    iM2566 = C2105.m6981("᩷֫") ^ i5;
                    i6 = ((iM2566 ^ i4) * 29523) ^ 1220795908;
                    i7 = 1796536153;
                    break;
                case 119509688:
                case 2014031237:
                    c12230 = c16475.f50657;
                    if (c16475.f50644) {
                        iM2566 = (C2105.m6981("᩻ۧ") ^ i4) * (-105);
                        i6 = ((iM2566 ^ i5) * (-8199)) ^ 921096449;
                        i7 = -930273258;
                    } else {
                        iM2566 = (i4 - C2105.m6981("ܺۤ")) * (-117);
                        i6 = ((iM2566 ^ i5) * (-23631)) ^ 1586294433;
                        i7 = -341651639;
                    }
                    break;
                case 204931337:
                case 1881353111:
                    if (c16475.f50638) {
                        iM2566 = (i4 - C2105.m6981("ܺۤ")) * (-117);
                        i6 = ((iM2566 ^ i5) * (-23631)) ^ 1586294433;
                        i7 = -341651639;
                    } else {
                        iM2566 = C0630.m2566("۠᩹") ^ i4;
                        i6 = ((iM2566 ^ i5) * 1263) ^ 973815947;
                        i7 = -1003825913;
                    }
                    break;
                case 530224910:
                case 1820974171:
                    bArrM27337 = c11005M34233.m27337();
                    if (C2126.m7040()) {
                        iM2566 = (C2105.m6981("ۤۚ") ^ i5) * (-59);
                        i6 = ((iM2566 ^ i4) * (-18827)) ^ (-1806472100);
                        i7 = 151191843;
                    } else {
                        iM2566 = C0630.m2566("ۜۢ") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-6959)) ^ (-9871816);
                        i7 = 1929847576;
                    }
                    break;
                case 756099376:
                case 1752738550:
                    C22124.m49722((InterfaceC20008) c12951M31485, i);
                    if (C22628.f73083 <= 0) {
                        iM2566 = (C2105.m6981("ۤۚ") ^ i5) * (-59);
                        i6 = ((iM2566 ^ i4) * (-18827)) ^ (-1806472100);
                        i7 = 151191843;
                    } else {
                        iM2566 = (C2105.m6981("ᩴۚ") ^ i4) * 119;
                        i6 = ((iM2566 ^ i5) * (-15055)) ^ 1510265181;
                        i7 = -1347219714;
                    }
                    break;
                case 759039680:
                case 1804500926:
                    if (C10975.m27285()) {
                        iM2566 = (i4 - C2105.m6981("ܺۤ")) * (-117);
                        i6 = ((iM2566 ^ i5) * (-23631)) ^ 1586294433;
                        i7 = -341651639;
                    } else {
                        iM2566 = C0630.m2566("᩷۬") ^ i5;
                        i6 = ((iM2566 ^ i4) * 24499) ^ 1759271052;
                        i7 = 1983971251;
                    }
                    break;
                case 853520473:
                case 1981236081:
                    C22124.m49722((InterfaceC20008) c12951M31485, i);
                    if (C4616.m13552() != 0) {
                        iM2566 = (C2105.m6981("ۤۚ") ^ i5) * (-59);
                        i6 = ((iM2566 ^ i4) * (-18827)) ^ (-1806472100);
                        i7 = 151191843;
                    } else {
                        iM2566 = C2105.m6981("ܺ֨") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-9565)) ^ (-572305955);
                        i7 = 1666295100;
                    }
                    break;
                case 1182251976:
                case 1888501438:
                    if (c16475.f50638) {
                        iM2566 = (i4 - C2105.m6981("ܺۤ")) * (-117);
                        i6 = ((iM2566 ^ i5) * (-23631)) ^ 1586294433;
                        i7 = -341651639;
                    } else {
                        iM2566 = (C0630.m2566("۟ۙ") ^ i4) * 47;
                        i6 = ((iM2566 ^ i5) * (-2739)) ^ 801269231;
                        i7 = -1910402606;
                    }
                    break;
                default:
                    c12951M31485 = C12951.m31485(bArrM27337);
                    i = 1382253410;
                    if (C0382.f1805) {
                        iM2566 = C2105.m6981("᩹ۜ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 21797) ^ 651243798;
                        i7 = -471901919;
                    } else {
                        iM2566 = (C2105.m6981("ۤۚ") ^ i5) * (-59);
                        i6 = ((iM2566 ^ i4) * (-18827)) ^ (-1806472100);
                        i7 = 151191843;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00e7 A[PHI: r11
      0x00e7: PHI (r11v63 int) = (r11v2 int), (r11v57 int), (r11v2 int), (r11v2 int) binds: [B:101:0x00e7, B:24:0x00e5, B:19:0x00bb, B:16:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m38817() {
        int iM2566;
        int i;
        int i2;
        int iM6981;
        int i3;
        int i4;
        int i5;
        Point point;
        int i6;
        int i7;
        int iM2567;
        int i8;
        int i9 = C3911.f12484;
        int i10 = C1294.f4556;
        int iM2568 = (C0630.m2566("֨۬") ^ i9) * (-65);
        int i11 = ((iM2568 ^ i10) * 10097) ^ (-1183877051);
        StringBuilder sb = null;
        Point point2 = null;
        String strM1483 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i12 = iM2568 ^ 457659291;
        int iM4915 = 0;
        int iM8031 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        char c = 0;
        short s = 0;
        int i17 = 0;
        C12392 c12392 = null;
        int i18 = 1369520039;
        int i19 = 0;
        String str = null;
        short[] sArr3 = null;
        int iAbs = 0;
        String str2 = null;
        while (true) {
            i18 = i12 ^ (i11 & (((i18 ^ i10) * (-863)) >> 31));
            switch (i18) {
                case -2138522671:
                case -866593354:
                    iAbs = iAbs;
                    C1420.m4905(sb, C0237.m1483(sArr, i15, i16, i14));
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = C0630.m2566("ۢ۫") ^ i9;
                        i = ((iM2566 ^ i10) * 14679) ^ (-1750050439);
                        i2 = 341621578;
                    } else {
                        iM2566 = (C0630.m2566("ᩴ֡") ^ i10) * (-113);
                        i = ((iM2566 ^ i9) * 30755) ^ (-1154483802);
                        i2 = 229629762;
                    }
                    int i20 = iM2566 ^ i2;
                    iAbs = iAbs;
                    i12 = i20;
                    i11 = i;
                    break;
                case -1940574889:
                case 1768192301:
                    iAbs = iAbs;
                    str = (String) C11003.requireNonNullElse(str2, C1711.m5726(sArr2, i13, 3, i14));
                    if (!C2126.f7087) {
                        iM2566 = (i9 - C0630.m2566("ۙۡ")) * (-53);
                        i = ((iM2566 ^ i10) * 6353) ^ 2118077295;
                        i2 = -584981971;
                        int i21 = iM2566 ^ i2;
                        iAbs = iAbs;
                        i12 = i21;
                        i11 = i;
                    } else {
                        c12392 = c12392;
                        point2 = point2;
                        i19 = i19;
                        sArr2 = sArr2;
                        iM6981 = (C2105.m6981("᩸ۧ") + i9) * (-69);
                        i3 = ((iM6981 ^ i10) * (-1543)) ^ (-1833539522);
                        i4 = -673507689;
                        int i22 = iM6981 ^ i4;
                        c12392 = c12392;
                        i11 = i3;
                        iAbs = iAbs;
                        i12 = i22;
                        sArr2 = sArr2;
                        i19 = i19;
                        point2 = point2;
                    }
                    break;
                case -1907743974:
                case 1500054477:
                    C1420.m4905(sb, strM1483);
                    iAbs = Math.abs(iM8031 - iM4915);
                    if (C7811.f24123 >= 0) {
                        iM2567 = (C0630.m2566("۟ۖ") ^ i9) * (-55);
                        i = ((iM2567 ^ i10) * (-10583)) ^ 1879399175;
                        i8 = -1787830707;
                    } else {
                        iM2567 = C0630.m2566("ܶ۠") ^ i10;
                        i = ((iM2567 ^ i9) * 32055) ^ 1947336664;
                        i8 = -339100693;
                    }
                    i12 = iM2567 ^ i8;
                    i11 = i;
                    break;
                case -1870102201:
                case 2024392962:
                    if (C11340.f33930 < 0) {
                        iAbs = iAbs;
                        c12392 = c12392;
                        point2 = point2;
                        i19 = i19;
                        sArr2 = sArr2;
                        iM6981 = (C2105.m6981("᩸ۧ") + i9) * (-69);
                        i3 = ((iM6981 ^ i10) * (-1543)) ^ (-1833539522);
                        i4 = -673507689;
                        int i23 = iM6981 ^ i4;
                        c12392 = c12392;
                        i11 = i3;
                        iAbs = iAbs;
                        i12 = i23;
                        sArr2 = sArr2;
                        i19 = i19;
                        point2 = point2;
                    } else {
                        iM2567 = (C0630.m2566("۟ۖ") ^ i9) * (-55);
                        i = ((iM2567 ^ i10) * (-10583)) ^ 1879399175;
                        i8 = -1787830707;
                        i12 = iM2567 ^ i8;
                        i11 = i;
                    }
                    break;
                case -1821033713:
                case -457074430:
                    i5 = iAbs;
                    int i24 = i19;
                    C0422.m1944(sb, i24);
                    C2105.m6979(sb, ':');
                    point = point2;
                    C0050.m945(sb, point.y);
                    if (iM4915 != iM8031) {
                        int iM6982 = (C2105.m6981("ܺ۟") + i9) * 53;
                        i11 = ((iM6982 ^ i10) * 19189) ^ (-838819518);
                        i19 = i24;
                        point2 = point;
                        i7 = i5;
                        i12 = iM6982 ^ (-1600288305);
                    } else {
                        i6 = i24;
                        int iM6983 = (C2105.m6981("᩸᩺") ^ i9) * (-71);
                        i19 = i6;
                        point2 = point;
                        i7 = i5;
                        i12 = iM6983 ^ (-2033998215);
                        i11 = ((iM6983 ^ i10) * 31607) ^ (-67392827);
                    }
                    iAbs = i7;
                    break;
                case -1473953161:
                case 2027737510:
                    i14 = 52384;
                    iM6981 = C2105.m6981("ۖ᩸") ^ i9;
                    i3 = ((iM6981 ^ i10) * 29863) ^ (-610915924);
                    i4 = -1936009044;
                    int i25 = iM6981 ^ i4;
                    c12392 = c12392;
                    i11 = i3;
                    iAbs = iAbs;
                    i12 = i25;
                    sArr2 = sArr2;
                    i19 = i19;
                    point2 = point2;
                    break;
                case -1458471982:
                case 1162878642:
                    iAbs = iAbs;
                    c12392 = c12392;
                    point2 = point2;
                    i19 = i19;
                    sArr2 = sArr2;
                    s = sArr3[c];
                    i17 = s * s;
                    if (C1047.m3599() < 0) {
                        iM6981 = C2105.m6981("۟ۚ") ^ i9;
                        i3 = ((iM6981 ^ i10) * 7223) ^ (-1482836557);
                        i4 = -1713894033;
                        int i26 = iM6981 ^ i4;
                        c12392 = c12392;
                        i11 = i3;
                        iAbs = iAbs;
                        i12 = i26;
                        sArr2 = sArr2;
                        i19 = i19;
                        point2 = point2;
                    } else {
                        sArr2 = sArr2;
                        i19 = i19;
                        point2 = point2;
                        int iM2569 = C0630.m2566("ۢ۟") ^ i10;
                        c12392 = c12392;
                        i11 = ((iM2569 ^ i9) * (-12551)) ^ 421859502;
                        iAbs = iAbs;
                        i12 = iM2569 ^ 1065413457;
                    }
                    break;
                case -1236632936:
                case -926380429:
                    iAbs = iAbs;
                    str2 = this.f50639;
                    sArr2 = f50637;
                    i13 = 195;
                    if (C0422.f1886 > 0) {
                        iM2566 = C2105.m6981("᩵ۧ") ^ i10;
                        i = ((iM2566 ^ i9) * (-4103)) ^ (-1967012426);
                        i2 = -965741548;
                        int i27 = iM2566 ^ i2;
                        iAbs = iAbs;
                        i12 = i27;
                        i11 = i;
                    } else {
                        c12392 = c12392;
                        int iM25610 = C0630.m2566("ۢ۟") ^ i10;
                        c12392 = c12392;
                        i11 = ((iM25610 ^ i9) * (-12551)) ^ 421859502;
                        iAbs = iAbs;
                        i12 = iM25610 ^ 1065413457;
                    }
                    break;
                case -946425905:
                case 538593850:
                    C1294.m4372();
                    iM2567 = (C0630.m2566("۟ۖ") ^ i9) * (-55);
                    i = ((iM2567 ^ i10) * (-10583)) ^ 1879399175;
                    i8 = -1787830707;
                    i12 = iM2567 ^ i8;
                    i11 = i;
                    break;
                case -925682439:
                case -261380833:
                    C21923.m49329();
                    break;
                case -840129007:
                case 2359151:
                    i14 = 4092;
                    iM6981 = C2105.m6981("ۖ᩸") ^ i9;
                    i3 = ((iM6981 ^ i10) * 29863) ^ (-610915924);
                    i4 = -1936009044;
                    int i28 = iM6981 ^ i4;
                    c12392 = c12392;
                    i11 = i3;
                    iAbs = iAbs;
                    i12 = i28;
                    sArr2 = sArr2;
                    i19 = i19;
                    point2 = point2;
                    break;
                case -692519392:
                case 387645807:
                    iAbs = iAbs;
                    c12392 = c12392;
                    point2 = point2;
                    i19 = i19;
                    sArr2 = sArr2;
                    sb = new StringBuilder();
                    iM4915 = C1420.m4915(c12392);
                    iM8031 = C2520.m8031(c12392);
                    if (C3019.m9255() <= 0) {
                        iM6981 = (C2105.m6981("᩸ۧ") + i9) * (-69);
                        i3 = ((iM6981 ^ i10) * (-1543)) ^ (-1833539522);
                        i4 = -673507689;
                    } else {
                        iM6981 = (C2105.m6981("ۛܺ") ^ i9) * (-55);
                        i3 = ((iM6981 ^ i10) * (-13891)) ^ 665997422;
                        i4 = 661644129;
                    }
                    int i29 = iM6981 ^ i4;
                    c12392 = c12392;
                    i11 = i3;
                    iAbs = iAbs;
                    i12 = i29;
                    sArr2 = sArr2;
                    i19 = i19;
                    point2 = point2;
                    break;
                case -403545314:
                case -222346986:
                    C3911.m11924();
                    if (C2520.m8026()) {
                        iM2567 = (C0630.m2566("۟ۖ") ^ i9) * (-55);
                        i = ((iM2567 ^ i10) * (-10583)) ^ 1879399175;
                        i8 = -1787830707;
                    } else {
                        iM2567 = (C0630.m2566("ۜۚ") ^ i10) * 5;
                        i = ((iM2567 ^ i9) * (-5587)) ^ 1113671929;
                        i8 = -1396929178;
                    }
                    i12 = iM2567 ^ i8;
                    i11 = i;
                    break;
                case -359832450:
                case 1153559466:
                    C0422.m1944(sb, iAbs);
                    i5 = iAbs;
                    C3245.m9923(sb, C3432.m10488(f50637, 200, 1, i14));
                    point = point2;
                    i6 = i19;
                    int iM6984 = (C2105.m6981("᩸᩺") ^ i9) * (-71);
                    i19 = i6;
                    point2 = point;
                    i7 = i5;
                    i12 = iM6984 ^ (-2033998215);
                    i11 = ((iM6984 ^ i10) * 31607) ^ (-67392827);
                    iAbs = i7;
                    break;
                case -303725366:
                case 339517947:
                    RunnableC0588.m2441();
                    if (C1294.f4556 >= 0) {
                        iAbs = iAbs;
                        iM2566 = C0630.m2566("ۢ۫") ^ i9;
                        i = ((iM2566 ^ i10) * 14679) ^ (-1750050439);
                        i2 = 341621578;
                        int i210 = iM2566 ^ i2;
                        iAbs = iAbs;
                        i12 = i210;
                        i11 = i;
                    }
                    iM2567 = (C0630.m2566("ۜۚ") ^ i10) * 5;
                    i = ((iM2567 ^ i9) * (-5587)) ^ 1113671929;
                    i8 = -1396929178;
                    i12 = iM2567 ^ i8;
                    i11 = i;
                    break;
                case -293502536:
                case 1114333979:
                    iAbs = iAbs;
                    c12392 = c12392;
                    Point pointM30472 = c12392.m30472(iM4915);
                    int i30 = pointM30472.x;
                    if (C2105.m6982() != 0) {
                        point2 = pointM30472;
                        i19 = i30;
                        int iM25611 = C0630.m2566("ۢ۟") ^ i10;
                        c12392 = c12392;
                        i11 = ((iM25611 ^ i9) * (-12551)) ^ 421859502;
                        iAbs = iAbs;
                        i12 = iM25611 ^ 1065413457;
                    } else {
                        int iM6985 = (i10 - C2105.m6981("᩺ܿ")) * (-97);
                        short[] sArr4 = sArr2;
                        int i31 = ((iM6985 ^ i9) * 28327) ^ (-989346748);
                        int i32 = iM6985 ^ 1244475032;
                        point2 = pointM30472;
                        c12392 = c12392;
                        i11 = i31;
                        sArr2 = sArr4;
                        i19 = i30;
                        iAbs = iAbs;
                        i12 = i32;
                    }
                    break;
                case -127995014:
                case 498580183:
                    break;
                case 44684687:
                case 1895922918:
                    iAbs = iAbs;
                    sArr = f50637;
                    i15 = 192;
                    i16 = 3;
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        iM2566 = (i9 - C0630.m2566("ᩴ۬")) * (-101);
                        i = ((iM2566 ^ i10) * (-15927)) ^ (-1117771357);
                        i2 = 636545081;
                        int i211 = iM2566 ^ i2;
                        iAbs = iAbs;
                        i12 = i211;
                        i11 = i;
                    } else {
                        c12392 = c12392;
                        int iM25612 = C0630.m2566("ۢ۟") ^ i10;
                        c12392 = c12392;
                        i11 = ((iM25612 ^ i9) * (-12551)) ^ 421859502;
                        iAbs = iAbs;
                        i12 = iM25612 ^ 1065413457;
                    }
                    break;
                case 716072885:
                case 2071922932:
                    iAbs = iAbs;
                    c12392 = c12392;
                    point2 = point2;
                    i19 = i19;
                    sArr2 = sArr2;
                    sArr3 = f50637;
                    c = 191;
                    if (C5695.f17556 < 0) {
                        iM6981 = C2105.m6981("ܰ֡") ^ i10;
                        i3 = ((iM6981 ^ i9) * 23903) ^ 467777841;
                        i4 = 102312328;
                        int i212 = iM6981 ^ i4;
                        c12392 = c12392;
                        i11 = i3;
                        iAbs = iAbs;
                        i12 = i212;
                        sArr2 = sArr2;
                        i19 = i19;
                        point2 = point2;
                    } else {
                        sArr2 = sArr2;
                        i19 = i19;
                        point2 = point2;
                        int iM25613 = C0630.m2566("ۢ۟") ^ i10;
                        c12392 = c12392;
                        i11 = ((iM25613 ^ i9) * (-12551)) ^ 421859502;
                        iAbs = iAbs;
                        i12 = iM25613 ^ 1065413457;
                    }
                    break;
                case 1165762337:
                case 2134634657:
                    iAbs = iAbs;
                    c12392 = c12392;
                    point2 = point2;
                    i19 = i19;
                    sArr2 = sArr2;
                    if ((i17 + 327718609) - (36206 * s) >= 0) {
                        iM6981 = (C2105.m6981("ܺܰ") ^ i9) * (-99);
                        i3 = ((iM6981 ^ i10) * 989) ^ 913230781;
                        i4 = 499715328;
                    } else {
                        iM6981 = C0630.m2566("ܺ֡") ^ i10;
                        i3 = ((iM6981 ^ i9) * 28967) ^ (-66573775);
                        i4 = -1356092189;
                    }
                    int i213 = iM6981 ^ i4;
                    c12392 = c12392;
                    i11 = i3;
                    iAbs = iAbs;
                    i12 = i213;
                    sArr2 = sArr2;
                    i19 = i19;
                    point2 = point2;
                    break;
                case 1531421362:
                case 1839932941:
                    iAbs = iAbs;
                    strM1483 = C0237.m1483(f50637, 198, 2, i14);
                    if (C0422.f1886 > 0) {
                        iM2566 = C2105.m6981("᩺ۙ") ^ i10;
                        i = ((iM2566 ^ i9) * 5001) ^ 90434814;
                        i2 = -161313159;
                        int i214 = iM2566 ^ i2;
                        iAbs = iAbs;
                        i12 = i214;
                        i11 = i;
                    } else {
                        c12392 = c12392;
                        int iM25614 = C0630.m2566("ۢ۟") ^ i10;
                        c12392 = c12392;
                        i11 = ((iM25614 ^ i9) * (-12551)) ^ 421859502;
                        iAbs = iAbs;
                        i12 = iM25614 ^ 1065413457;
                    }
                    break;
                case 1544431475:
                case 1786319067:
                    iAbs = iAbs;
                    point2 = point2;
                    i19 = i19;
                    sArr2 = sArr2;
                    c12392 = this.f50649;
                    if (c12392 == null) {
                        c12392 = c12392;
                        int iM6986 = C2105.m6981("ᩴۢ") ^ i10;
                        iAbs = iAbs;
                        i12 = iM6986 ^ (-1296288238);
                        i11 = ((iM6986 ^ i9) * (-8899)) ^ 687802941;
                        sArr2 = sArr2;
                        i19 = i19;
                        point2 = point2;
                    } else {
                        iM6981 = C0630.m2566("۠ۜ") ^ i10;
                        i3 = ((iM6981 ^ i9) * (-32621)) ^ 228097833;
                        i4 = 2041615351;
                        int i215 = iM6981 ^ i4;
                        c12392 = c12392;
                        i11 = i3;
                        iAbs = iAbs;
                        i12 = i215;
                        sArr2 = sArr2;
                        i19 = i19;
                        point2 = point2;
                    }
                    break;
                default:
                    iAbs = iAbs;
                    C3245.m9923(sb, str);
                    C1047.m3601(this.f50642, C0050.m947(sb));
                    point2 = point2;
                    i19 = i19;
                    sArr2 = sArr2;
                    int iM6987 = C2105.m6981("ᩴۢ") ^ i10;
                    iAbs = iAbs;
                    i12 = iM6987 ^ (-1296288238);
                    i11 = ((iM6987 ^ i9) * (-8899)) ^ 687802941;
                    sArr2 = sArr2;
                    i19 = i19;
                    point2 = point2;
                    break;
            }
            return;
        }
    }
}
