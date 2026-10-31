package l;

import android.R;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.lang.ref.WeakReference;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۟ᩳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J3Z2 */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC7642 implements View.OnClickListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ۗۙۡ, reason: not valid java name and contains not printable characters */
    private static final short[] f23598 = {785, -13729, 13968, -7645, -5464, -8169, -11377, -10212, 15803, 11249, 6613, 12157, 12149, 12148, 18363, 24269, 21685, 29761, -16918, -18145, 32104, -18680, 24373, 31995, -20510, -23167, 5437, 26452, 26463, 26456, 26392, 26459, 26434, 26392, 26438, 26458, 26435, 26449, 26463, 26456, 26392, 26437, 26447, 26437, 26434, 26451, 26459, -1955, 2546, 12517};

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static WeakReference f23599;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f23600;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f23601;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C16560 f23602;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C16709 f23603;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C14676 f23604;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f23605;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractActivityC3346 f23606;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f23607;

    public ViewOnClickListenerC7642(C16560 c16560) {
        this(C22628.m50612(c16560), c16560);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C16709 c16709 = null;
        int i = -781558447;
        int i2 = C0422.f1886;
        int i3 = C4117.f13076;
        int iM6981 = C2105.m6981("᩵᩷") ^ i3;
        int i4 = ((iM6981 ^ i2) * 8593) ^ 110675718;
        int i5 = 239849695;
        while (true) {
            i = ((((i ^ i2) * (-21235)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2099360168:
                case 1430417536:
                    C3432.m10477();
                    iM6981 = C2105.m6981("᩻ܶ") ^ i3;
                    i4 = ((iM6981 ^ i2) * (-8029)) ^ 665493166;
                    i5 = -1971523956;
                    break;
                case -1801244882:
                case 1918379310:
                    C2272.m7505(this.f23606);
                    iM6981 = (C0630.m2566("᩹᩹") + i2) * (-61);
                    i4 = ((iM6981 ^ i3) * (-20899)) ^ 564793428;
                    i5 = -800679903;
                    break;
                case -1768873909:
                case -1148975715:
                    C4075.m12263();
                    if (C2105.f7037 != 0) {
                        iM6981 = (C0630.m2566("ۚۘ") + i3) * 89;
                        i4 = ((iM6981 ^ i2) * (-27995)) ^ 1763076882;
                        i5 = 2035834672;
                    } else {
                        iM6981 = C2105.m6981("᩻ܶ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-8029)) ^ 665493166;
                        i5 = -1971523956;
                    }
                    break;
                case -1315400265:
                case 675798080:
                    if (C2520.f8000 >= 0) {
                        iM6981 = (C0630.m2566("᩷ۚ") + i3) * (-97);
                        i4 = ((iM6981 ^ i2) * 19705) ^ (-1659932857);
                        i5 = 1226867414;
                    } else {
                        iM6981 = (C0630.m2566("ۛۢ") + i3) * (-127);
                        i4 = ((iM6981 ^ i2) * (-32767)) ^ 386815419;
                        i5 = 580516549;
                    }
                    break;
                case -1188134610:
                case 923117194:
                    if (C21923.f70183 != 0) {
                        iM6981 = (C0630.m2566("᩷ۚ") + i3) * (-97);
                        i4 = ((iM6981 ^ i2) * 19705) ^ (-1659932857);
                        i5 = 1226867414;
                    } else {
                        iM6981 = (C0630.m2566("ۜܿ") ^ i2) * (-97);
                        i4 = ((iM6981 ^ i3) * o.a.x) ^ (-1165284963);
                        i5 = -380551878;
                    }
                    break;
                case -886116958:
                case -547244542:
                    break;
                case -882389352:
                case 1484850394:
                    if (C3746.m11369() >= 0) {
                        iM6981 = (C2105.m6981("ܶۘ") ^ i2) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM6981 ^ i3) * (-17993)) ^ 707313050;
                        i5 = -1149237970;
                    } else {
                        iM6981 = (i2 - C2105.m6981("۠᩻")) * 71;
                        i4 = ((iM6981 ^ i3) * 21169) ^ (-8875734);
                        i5 = 1499837693;
                    }
                    break;
                case -767597601:
                case 1094817508:
                    if (C0630.f2410 > 0) {
                        iM6981 = (C0630.m2566("᩷ۚ") + i3) * (-97);
                        i4 = ((iM6981 ^ i2) * 19705) ^ (-1659932857);
                        i5 = 1226867414;
                    } else {
                        iM6981 = C2105.m6981("᩻ܶ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-8029)) ^ 665493166;
                        i5 = -1971523956;
                    }
                    break;
                case -753494581:
                case 390360191:
                    if (C3432.f10845 >= 0) {
                        iM6981 = C2105.m6981("᩻ܶ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-8029)) ^ 665493166;
                        i5 = -1971523956;
                    } else {
                        iM6981 = C2105.m6981("᩵ܽ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-9237)) ^ (-2144692574);
                        i5 = 1363916252;
                    }
                    break;
                case -681643318:
                case -238351845:
                    if (C2520.f8000 >= 0) {
                        iM6981 = (C0630.m2566("᩷ۚ") + i3) * (-97);
                        i4 = ((iM6981 ^ i2) * 19705) ^ (-1659932857);
                        i5 = 1226867414;
                    } else {
                        iM6981 = (C2105.m6981("ܶᩴ") ^ i2) * 45;
                        i4 = ((iM6981 ^ i3) * (-28973)) ^ (-858904322);
                        i5 = 304463986;
                    }
                    break;
                case -592033744:
                case 2042720713:
                    C0714.m2805();
                    C3019.m9255();
                    break;
                case -562193800:
                case 1534262363:
                    c16709.m39289();
                    if (this.f23601) {
                        iM6981 = (C0630.m2566("᩹᩹") + i2) * (-61);
                        i4 = ((iM6981 ^ i3) * (-20899)) ^ 564793428;
                        i5 = -800679903;
                    } else {
                        iM6981 = (C0630.m2566("ܳ᩻") + i3) * (-27);
                        i4 = ((iM6981 ^ i2) * 13429) ^ (-1130843110);
                        i5 = 805471903;
                    }
                    break;
                case -524943688:
                case 889122632:
                    if (C1005.m3501()) {
                        iM6981 = C0630.m2566("ۗܰ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 4905) ^ 791789734;
                        i5 = -1493021819;
                    } else {
                        iM6981 = (C2105.m6981("ܶۘ") ^ i2) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM6981 ^ i3) * (-17993)) ^ 707313050;
                        i5 = -1149237970;
                    }
                    break;
                case -392110796:
                case -296573796:
                    if (this.f23602 == null) {
                        iM6981 = C0630.m2566("ۗ֨") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-7715)) ^ (-1280556837);
                        i5 = -1941391970;
                    } else {
                        iM6981 = (C0630.m2566("᩹᩹") + i2) * (-61);
                        i4 = ((iM6981 ^ i3) * (-20899)) ^ 564793428;
                        i5 = -800679903;
                    }
                    break;
                case -276278423:
                case 681898240:
                    if (C21923.f70183 != 0) {
                        iM6981 = (C0630.m2566("ۚۘ") + i3) * 89;
                        i4 = ((iM6981 ^ i2) * (-27995)) ^ 1763076882;
                        i5 = 2035834672;
                    } else {
                        iM6981 = C2105.m6981("ۜ۠") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-24451)) ^ (-1316660374);
                        i5 = -128031171;
                    }
                    break;
                case 450508301:
                case 1235471797:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = (C0630.m2566("᩷ۚ") + i3) * (-97);
                        i4 = ((iM6981 ^ i2) * 19705) ^ (-1659932857);
                        i5 = 1226867414;
                    } else {
                        iM6981 = C2105.m6981("ܺۧ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-30313)) ^ (-303310252);
                        i5 = 2121108810;
                    }
                    break;
                case 809825848:
                case 1743400804:
                    c16709 = this.f23603;
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = (C2105.m6981("ܶۘ") ^ i2) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM6981 ^ i3) * (-17993)) ^ 707313050;
                        i5 = -1149237970;
                    } else {
                        iM6981 = C2105.m6981("ܺۤ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 30357) ^ (-971720417);
                        i5 = 230391830;
                    }
                    break;
                case 1812657603:
                case 1934237345:
                    if (C0630.m2564()) {
                        iM6981 = (C0630.m2566("ۚۘ") + i3) * 89;
                        i4 = ((iM6981 ^ i2) * (-27995)) ^ 1763076882;
                        i5 = 2035834672;
                    } else {
                        iM6981 = C0630.m2566("ۛ᩺") ^ i3;
                        i4 = ((iM6981 ^ i2) * 1571) ^ (-170753905);
                        i5 = -270011018;
                    }
                    break;
                default:
                    C7106.m19120();
                    if (C3019.m9255() <= 0) {
                        iM6981 = C2105.m6981("᩻ܶ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-8029)) ^ 665493166;
                        i5 = -1971523956;
                    } else {
                        iM6981 = C2105.m6981("ۨ۬") ^ i2;
                        i4 = ((iM6981 ^ i3) * 11513) ^ 1151118505;
                        i5 = -892011046;
                    }
                    break;
            }
            return;
        }
    }

    public ViewOnClickListenerC7642(AbstractActivityC3346 abstractActivityC3346) {
        this(abstractActivityC3346, null);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0122 A[PHI: r11 r12
      0x0122: PHI (r11v4 int) = (r11v3 int), (r11v2 int) binds: [B:37:0x0120, B:17:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x0122: PHI (r12v4 int) = (r12v3 int), (r12v2 int) binds: [B:37:0x0120, B:17:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x01a7 A[PHI: r6
      0x01a7: PHI (r6v7 int) = (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:82:0x01a7, B:49:0x01a5, B:17:0x009a, B:90:0x01a7] A[DONT_GENERATE, DONT_INLINE]] */
    public ViewOnClickListenerC7642(AbstractActivityC3346 abstractActivityC3346, C16560 c16560) {
        short[] sArr;
        int i;
        short[] sArr2;
        C14676 c14676;
        short[] sArr3;
        int iM6981;
        int i2;
        int i3;
        int iM2566;
        int i4;
        ViewOnClickListenerC7642 viewOnClickListenerC7642 = this;
        int i5 = ServiceConnectionC3453.f10921;
        int i6 = C2167.f7158;
        short s = f23598[0];
        int i7 = (s * 2) + 1;
        int i8 = s + 1;
        int i9 = (i8 * i8) - i7 < 0 ? 18913 : 48046;
        int iM2567 = (C0630.m2566("ܽܰ") ^ i5) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
        int i10 = ((iM2567 ^ i6) * (-30451)) ^ (-258438204);
        Object obj = null;
        String strM19110 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        int i11 = iM2567 ^ 808238961;
        int i12 = 0;
        C19258 c19258M5912 = null;
        int i13 = 0;
        int iM2568 = 0;
        int iM6982 = 0;
        int iM6983 = 0;
        int i14 = 0;
        int i15 = 0;
        C14676 c14677 = null;
        int i16 = -1167273454;
        while (true) {
            i16 = i11 ^ (i10 & (((i16 ^ i6) * 8639) >> 31));
            switch (i16) {
                case -2117795250:
                case -517490912:
                    i13 = iM6982 ^ 2125408626;
                    if (C3911.m11924() <= 0) {
                        iM2566 = (C0630.m2566("ۡ᩷") + i6) * 3;
                        i = ((iM2566 ^ i5) * (-14505)) ^ 1671249054;
                        i4 = 268067606;
                    } else {
                        iM2566 = C0630.m2566("᩻᩺") ^ i5;
                        i = ((iM2566 ^ i6) * (-31193)) ^ (-1914242641);
                        i4 = 1760726307;
                    }
                    i11 = iM2566 ^ i4;
                    i10 = i;
                    break;
                case -2080632702:
                case -882032800:
                    C2520.m8026();
                    sArr = sArr6;
                    int iM6984 = (i5 - C2105.m6981("۫᩺")) * (-95);
                    i10 = ((iM6984 ^ i6) * 20717) ^ (-195482200);
                    sArr6 = sArr;
                    i11 = iM6984 ^ 445814718;
                    viewOnClickListenerC7642 = this;
                    break;
                case -2079967476:
                case -736804868:
                    obj = null;
                    ViewOnClickListenerC1958.m6441(c19258M5912, i13, null);
                    sArr5 = f23598;
                    if (RunnableC3474.f10992 > 0) {
                        iM2566 = C0630.m2566("ܳ᩸") ^ i6;
                        i = ((iM2566 ^ i5) * (-1423)) ^ (-750979813);
                        i4 = -1918622012;
                        i11 = iM2566 ^ i4;
                        i10 = i;
                    } else {
                        sArr2 = sArr6;
                        c14676 = c14677;
                        sArr3 = sArr4;
                        iM6981 = C0630.m2566("ۚ᩷") ^ i6;
                        c14677 = c14676;
                        i2 = ((iM6981 ^ i5) * (-29389)) ^ (-1789714540);
                        i3 = -644110041;
                        int i17 = iM6981 ^ i3;
                        sArr4 = sArr3;
                        i10 = i2;
                        sArr6 = sArr2;
                        i11 = i17;
                    }
                    break;
                case -1920766983:
                case 13487068:
                    if (C0964.f3626 != 0) {
                        sArr3 = sArr4;
                        iM6981 = (C2105.m6981("ܽܺ") + i5) * (-19);
                        sArr2 = sArr6;
                        i2 = ((iM6981 ^ i6) * (-25345)) ^ (-724058127);
                        i3 = 415848949;
                        int i18 = iM6981 ^ i3;
                        sArr4 = sArr3;
                        i10 = i2;
                        sArr6 = sArr2;
                        i11 = i18;
                    } else {
                        iM2566 = (C0630.m2566("ۡ᩷") + i6) * 3;
                        i = ((iM2566 ^ i5) * (-14505)) ^ 1671249054;
                        i4 = 268067606;
                        i11 = iM2566 ^ i4;
                        i10 = i;
                    }
                    break;
                case -1521639850:
                case -1512613808:
                    C0237.m1481();
                    if (C4616.f14690 <= 0) {
                        iM2566 = (C0630.m2566("ۡ᩷") + i6) * 3;
                        i = ((iM2566 ^ i5) * (-14505)) ^ 1671249054;
                        i4 = 268067606;
                        i11 = iM2566 ^ i4;
                        i10 = i;
                    } else {
                        sArr = sArr6;
                        int iM6985 = (i5 - C2105.m6981("۫᩺")) * (-95);
                        i10 = ((iM6985 ^ i6) * 20717) ^ (-195482200);
                        sArr6 = sArr;
                        i11 = iM6985 ^ 445814718;
                        viewOnClickListenerC7642 = this;
                    }
                    break;
                case -1421020209:
                case 1270366488:
                    C5695.m16035(c19258M5912, iM6983 ^ i14, obj);
                    sArr6 = f23598;
                    i12 = 7;
                    if (!C2272.f7362) {
                        iM2566 = C2105.m6981("ۧ᩺") ^ i6;
                        i = ((iM2566 ^ i5) * 15541) ^ 1942212023;
                        i4 = -1814160160;
                        i11 = iM2566 ^ i4;
                        i10 = i;
                    } else {
                        sArr3 = sArr4;
                        iM6981 = (C2105.m6981("ܽܺ") + i5) * (-19);
                        sArr2 = sArr6;
                        i2 = ((iM6981 ^ i6) * (-25345)) ^ (-724058127);
                        i3 = 415848949;
                        int i19 = iM6981 ^ i3;
                        sArr4 = sArr3;
                        i10 = i2;
                        sArr6 = sArr2;
                        i11 = i19;
                    }
                    break;
                case -1299201972:
                case 180863903:
                    C0382.m1848();
                    C3432.m10477();
                    throw new RuntimeException();
                case -979602968:
                case 235703212:
                    sArr3 = sArr4;
                    iM6982 = C2105.m6981(C3245.m9934(sArr3, i15, 3, i9));
                    if (C0714.f2697 >= 0) {
                        iM6981 = (C2105.m6981("ܽܺ") + i5) * (-19);
                        sArr2 = sArr6;
                        i2 = ((iM6981 ^ i6) * (-25345)) ^ (-724058127);
                        i3 = 415848949;
                    } else {
                        iM6981 = (C2105.m6981("֨ܰ") ^ i6) * (-53);
                        sArr2 = sArr6;
                        i2 = ((iM6981 ^ i5) * (-20223)) ^ 1928405988;
                        i3 = -2132747340;
                    }
                    int i110 = iM6981 ^ i3;
                    sArr4 = sArr3;
                    i10 = i2;
                    sArr6 = sArr2;
                    i11 = i110;
                    break;
                case -772161316:
                case 1900986876:
                    if (C1504.m5179()) {
                        iM2566 = (C0630.m2566("ۙ֡") + i6) * (-11);
                        i = ((iM2566 ^ i5) * 23899) ^ (-100844588);
                        i4 = 208864048;
                    } else {
                        iM2566 = (C0630.m2566("ۡ᩷") + i6) * 3;
                        i = ((iM2566 ^ i5) * (-14505)) ^ 1671249054;
                        i4 = 268067606;
                    }
                    i11 = iM2566 ^ i4;
                    i10 = i;
                    break;
                case -32436693:
                case 1250451637:
                    iM2568 = 2123697004 ^ C0630.m2566(C4117.m12355(sArr6, i12, 3, i9));
                    if (C4616.f14690 > 0) {
                        iM2566 = (i5 - C2105.m6981("ۖ۬")) * 33;
                        i = ((iM2566 ^ i6) * (-13447)) ^ (-474681152);
                        i4 = -1257495711;
                        i11 = iM2566 ^ i4;
                        i10 = i;
                    } else {
                        sArr3 = sArr4;
                        iM6981 = (C2105.m6981("ܽܺ") + i5) * (-19);
                        sArr2 = sArr6;
                        i2 = ((iM6981 ^ i6) * (-25345)) ^ (-724058127);
                        i3 = 415848949;
                        int i111 = iM6981 ^ i3;
                        sArr4 = sArr3;
                        i10 = i2;
                        sArr6 = sArr2;
                        i11 = i111;
                    }
                    break;
                case 78584423:
                case 1054232251:
                    C2520.m8033(c19258M5912, iM2568, obj);
                    c19258M5912.m44420(viewOnClickListenerC7642);
                    viewOnClickListenerC7642.f23605 = c19258M5912.m44415();
                    return;
                case 547354953:
                case 570062443:
                    sArr = sArr6;
                    C14676 c14678 = c14677;
                    C1711.m5727(c19258M5912, c14678.f44837);
                    sArr4 = f23598;
                    i15 = 1;
                    if (RunnableC3474.f10992 > 0) {
                        int iM2569 = (C0630.m2566("ۘ۟") + i5) * 43;
                        i = ((iM2569 ^ i6) * 12593) ^ (-786331217);
                        c14677 = c14678;
                        sArr6 = sArr;
                        i11 = iM2569 ^ 139948565;
                        i10 = i;
                    } else {
                        c14677 = c14678;
                        int iM6986 = (i5 - C2105.m6981("۫᩺")) * (-95);
                        i10 = ((iM6986 ^ i6) * 20717) ^ (-195482200);
                        sArr6 = sArr;
                        i11 = iM6986 ^ 445814718;
                        viewOnClickListenerC7642 = this;
                    }
                    break;
                case 969679496:
                case 1318509969:
                    sArr2 = sArr6;
                    c14676 = c14677;
                    sArr3 = sArr4;
                    viewOnClickListenerC7642.f23604 = c14676;
                    c19258M5912 = C1773.m5912(abstractActivityC3346);
                    if (C5695.f17556 >= 0) {
                        iM6981 = C0630.m2566("ۚ᩷") ^ i6;
                        c14677 = c14676;
                        i2 = ((iM6981 ^ i5) * (-29389)) ^ (-1789714540);
                        i3 = -644110041;
                        int i112 = iM6981 ^ i3;
                        sArr4 = sArr3;
                        i10 = i2;
                        sArr6 = sArr2;
                        i11 = i112;
                    } else {
                        c14677 = c14676;
                        int iM6987 = (C2105.m6981("ܶ᩵") + i5) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i10 = ((iM6987 ^ i6) * 30615) ^ 1503019899;
                        sArr4 = sArr3;
                        i11 = iM6987 ^ 2043814850;
                        sArr6 = sArr2;
                    }
                    break;
                case 1425167175:
                case 1686806303:
                    strM19110 = C7106.m19110(sArr5, 4, 3, i9);
                    if (C3537.f11231 < 0) {
                        iM2566 = (C2105.m6981("ܿ᩺") + i5) * 91;
                        i = ((iM2566 ^ i6) * 22007) ^ 2146147574;
                        i4 = 1574780966;
                        i11 = iM2566 ^ i4;
                        i10 = i;
                    } else {
                        sArr3 = sArr4;
                        iM6981 = (C2105.m6981("ܽܺ") + i5) * (-19);
                        sArr2 = sArr6;
                        i2 = ((iM6981 ^ i6) * (-25345)) ^ (-724058127);
                        i3 = 415848949;
                        int i113 = iM6981 ^ i3;
                        sArr4 = sArr3;
                        i10 = i2;
                        sArr6 = sArr2;
                        i11 = i113;
                    }
                    break;
                case 1637925199:
                case 2042515328:
                    iM6983 = C2105.m6981(strM19110);
                    i14 = 2116657232;
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = (C0630.m2566("ۙ֡") + i6) * (-11);
                        i = ((iM2566 ^ i5) * 23899) ^ (-100844588);
                        i4 = 208864048;
                    } else {
                        iM2566 = (C2105.m6981("ܽ֫") + i6) * (-49);
                        i = ((iM2566 ^ i5) * 25725) ^ (-1125512357);
                        i4 = 771450132;
                    }
                    i11 = iM2566 ^ i4;
                    i10 = i;
                    break;
                default:
                    short[] sArr7 = sArr4;
                    viewOnClickListenerC7642.f23606 = abstractActivityC3346;
                    sArr = sArr6;
                    viewOnClickListenerC7642.f23602 = c16560;
                    C14676 c14679 = new C14676(abstractActivityC3346);
                    if (C7811.f24123 >= 0) {
                        c14677 = c14679;
                        sArr4 = sArr7;
                        int iM6988 = (i5 - C2105.m6981("۫᩺")) * (-95);
                        i10 = ((iM6988 ^ i6) * 20717) ^ (-195482200);
                        sArr6 = sArr;
                        i11 = iM6988 ^ 445814718;
                        viewOnClickListenerC7642 = this;
                    } else {
                        int iM25610 = (C0630.m2566("᩶۫") + i6) * (-105);
                        i10 = ((iM25610 ^ i5) * (-22255)) ^ 1063280308;
                        sArr6 = sArr;
                        viewOnClickListenerC7642 = this;
                        i11 = iM25610 ^ (-471787227);
                        c14677 = c14679;
                        sArr4 = sArr7;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x029a A[PHI: r2 r6 r9 r12
      0x029a: PHI (r2v55 short[]) = (r2v2 short[]), (r2v57 short[]) binds: [B:57:0x0298, B:45:0x01f9] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r6v3 int) = (r6v2 int), (r6v4 int) binds: [B:57:0x0298, B:45:0x01f9] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r9v4 java.lang.Object[]) = (r9v3 java.lang.Object[]), (r9v2 java.lang.Object[]) binds: [B:57:0x0298, B:45:0x01f9] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r12v3 int) = (r12v2 int), (r12v4 int) binds: [B:57:0x0298, B:45:0x01f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x018b, code lost:
    
        if (l.C1420.m4913() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01ac, code lost:
    
        if (l.C3432.f10845 >= 0) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int i;
        StringBuilder sb;
        short[] sArr;
        int iM6981;
        int i2;
        int i3;
        short[] sArr2;
        int iM2566;
        int i4;
        int i5;
        short[] sArr3;
        AbstractActivityC3346 abstractActivityC3346;
        int iM2567;
        int i6;
        int i7;
        int iM6982;
        int i8;
        short[] sArr4;
        String str;
        String str2;
        StringBuilder sb2;
        int i9;
        AbstractActivityC3346 abstractActivityC3347;
        int i10;
        String str3;
        short[] sArr5;
        short[] sArr6;
        Throwable th;
        short[] sArr7;
        String str4;
        int i11;
        int i12;
        String str5;
        StringBuilder sb3;
        int iM6983;
        int i13;
        int i14;
        short[] sArr8;
        short[] sArr9;
        int i15;
        int i16;
        String strM12817;
        String str6;
        int iM6984;
        int i17;
        int i18;
        short[] sArr10;
        int i19;
        StringBuilder sb4;
        String strM947;
        int i20;
        String str7;
        String str8;
        int i21;
        int i22;
        short[] sArr11;
        int i23;
        StringBuilder sb5;
        String str9;
        C19258 c19258M5912;
        int iM6985;
        C19258 c19258;
        int i24;
        short[] sArr12;
        short[] sArr13;
        int iM6986;
        int i25;
        int i26;
        int iM6987;
        int i27;
        ViewOnClickListenerC7642 viewOnClickListenerC7642 = this;
        boolean z = false;
        String str10 = null;
        String strM1959 = null;
        String strM1955 = null;
        short s = 0;
        int i28 = 0;
        int i29 = -2136653081;
        int i30 = C1047.f3863;
        int i31 = C2167.f7158;
        int iM2568 = C0630.m2566("᩺ܽ") ^ i30;
        int i32 = ((iM2568 ^ i31) * 30981) ^ 1289192934;
        int i33 = iM2568 ^ 1499849770;
        C16560 c16560 = null;
        AbstractActivityC3346 abstractActivityC3348 = null;
        String str11 = null;
        String str12 = null;
        StringBuilder sbM19190 = null;
        String str13 = null;
        StringBuilder sbM19191 = null;
        Object[] objArr = null;
        short[] sArr14 = null;
        short[] sArr15 = null;
        short[] sArr16 = null;
        int i34 = 0;
        int iM6988 = 0;
        int i35 = 0;
        int i36 = 0;
        char c = 0;
        int i37 = 0;
        int iM39320 = 0;
        DialogInterfaceC0206 dialogInterfaceC0206 = null;
        char c2 = 0;
        Intent intent = null;
        short[] sArr17 = null;
        int i38 = 0;
        String str14 = null;
        int i39 = 0;
        Throwable th2 = null;
        C19258 c19259 = null;
        C16709 c16709M32204 = null;
        DialogInterfaceOnClickListenerC2914 dialogInterfaceOnClickListenerC2914 = null;
        while (true) {
            i29 = i33 ^ (i32 & (((i29 ^ i31) * 17437) >> 31));
            switch (i29) {
                case -2136324670:
                case -214823111:
                    sArr3 = sArr16;
                    abstractActivityC3346 = abstractActivityC3348;
                    int i40 = i37;
                    i34 = i34;
                    c16560 = c16560;
                    str14 = str14;
                    i = i40;
                    StringBuilder sb6 = sbM19190;
                    th2 = th2;
                    str11 = str11;
                    sb = sb6;
                    short[] sArr18 = sArr14;
                    str12 = str12;
                    sArr17 = sArr17;
                    sArr = sArr18;
                    Intent intent2 = new Intent(abstractActivityC3346, (Class<?>) ActivityC23143.class);
                    if (c16560 != null) {
                        intent = intent2;
                        iM2567 = C0630.m2566("᩵۫") ^ i30;
                        i6 = ((iM2567 ^ i31) * (-17179)) ^ 1793607742;
                        i7 = -866734511;
                        int i41 = iM2567 ^ i7;
                        abstractActivityC3348 = abstractActivityC3346;
                        sArr16 = sArr3;
                        i33 = i41;
                        i32 = i6;
                        String str15 = str14;
                        c16560 = c16560;
                        i34 = i34;
                        i37 = i;
                        str14 = str15;
                        StringBuilder sb7 = sb;
                        str11 = str11;
                        th2 = th2;
                        sbM19190 = sb7;
                        short[] sArr19 = sArr;
                        sArr17 = sArr17;
                        str12 = str12;
                        sArr14 = sArr19;
                    } else {
                        iM6982 = (C2105.m6981("᩶᩺") + i31) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        intent = intent2;
                        i32 = ((iM6982 ^ i30) * 11385) ^ (-2049759749);
                        i8 = 2039220461;
                        int i42 = iM6982 ^ i8;
                        abstractActivityC3348 = abstractActivityC3346;
                        sArr16 = sArr3;
                        i33 = i42;
                        String str16 = str14;
                        c16560 = c16560;
                        i34 = i34;
                        i37 = i;
                        str14 = str16;
                        StringBuilder sb8 = sb;
                        str11 = str11;
                        th2 = th2;
                        sbM19190 = sb8;
                        short[] sArr110 = sArr;
                        sArr17 = sArr17;
                        str12 = str12;
                        sArr14 = sArr110;
                    }
                    break;
                case -2064019042:
                case -880201771:
                    if (!C21923.m49329()) {
                        iM6987 = (i30 - C0630.m2566("ᩳ۬")) * 7;
                        i25 = ((iM6987 ^ i31) * 8175) ^ 1054128002;
                        i27 = -497631003;
                        i33 = iM6987 ^ i27;
                        i32 = i25;
                    }
                    sArr12 = sArr16;
                    sArr13 = sArr14;
                    iM6986 = (i31 - C0630.m2566("ۡ᩺")) * 73;
                    i25 = ((iM6986 ^ i30) * (-16111)) ^ 1486681890;
                    i26 = -554019951;
                    int i43 = iM6986 ^ i26;
                    sArr14 = sArr13;
                    sArr16 = sArr12;
                    i33 = i43;
                    i32 = i25;
                    break;
                case -1894686526:
                case -779746259:
                    i = i37;
                    sb = sbM19190;
                    sArr = sArr14;
                    i35 = 52448;
                    iM6981 = (C2105.m6981("֨ܺ") ^ i31) * 23;
                    i2 = ((iM6981 ^ i30) * 28029) ^ 1324631277;
                    i3 = -977910770;
                    i5 = iM6981 ^ i3;
                    abstractActivityC3348 = abstractActivityC3348;
                    sArr16 = sArr16;
                    i33 = i5;
                    i32 = i2;
                    viewOnClickListenerC7642 = this;
                    String str17 = str14;
                    c16560 = c16560;
                    i34 = i34;
                    i37 = i;
                    str14 = str17;
                    StringBuilder sb9 = sb;
                    str11 = str11;
                    th2 = th2;
                    sbM19190 = sb9;
                    short[] sArr111 = sArr;
                    sArr17 = sArr17;
                    str12 = str12;
                    sArr14 = sArr111;
                    break;
                case -1742198627:
                case 2051542494:
                    sArr7 = sArr16;
                    str4 = str14;
                    StringBuilder sb10 = sbM19190;
                    sArr5 = sArr17;
                    i11 = i37;
                    sArr6 = sArr14;
                    i12 = i34;
                    String strM39286 = c16709M32204.m39286();
                    String strM39287 = viewOnClickListenerC7642.f23603.m39286();
                    if (C1294.m4369(strM39286, strM39287)) {
                        int iM2569 = (C0630.m2566("᩹۬") + i30) * 49;
                        i32 = ((iM2569 ^ i31) * 5575) ^ 1726266166;
                        sArr14 = sArr6;
                        sArr17 = sArr5;
                        str12 = strM39287;
                        i34 = i12;
                        i37 = i11;
                        str14 = str4;
                        sbM19190 = sb10;
                        sArr16 = sArr7;
                        i33 = iM2569 ^ 339752446;
                        str11 = strM39286;
                    } else {
                        sb3 = sb10;
                        str3 = strM39287;
                        str5 = strM39286;
                        iM6983 = C0630.m2566("ۨܿ") ^ i30;
                        i13 = ((iM6983 ^ i31) * 3917) ^ 992223519;
                        i14 = 1637373130;
                        int i44 = iM6983 ^ i14;
                        sbM19190 = sb3;
                        str11 = str5;
                        i34 = i12;
                        i37 = i11;
                        str14 = str4;
                        sArr8 = sArr7;
                        i33 = i44;
                        i32 = i13;
                        sArr16 = sArr8;
                        short[] sArr20 = sArr6;
                        sArr17 = sArr5;
                        str12 = str3;
                        sArr14 = sArr20;
                    }
                    break;
                case -1710391426:
                case 1124663842:
                    sArr16 = sArr16;
                    str14 = str14;
                    i = i37;
                    i34 = i34;
                    StringBuilder sb11 = sbM19190;
                    th2 = th2;
                    str11 = str11;
                    sb = sb11;
                    short[] sArr21 = sArr14;
                    str12 = str12;
                    sArr17 = sArr17;
                    sArr = sArr21;
                    int iM3006 = C0798.m3006(view);
                    DialogInterfaceC0206 dialogInterfaceC0207 = viewOnClickListenerC7642.f23605;
                    c16560 = viewOnClickListenerC7642.f23602;
                    AbstractActivityC3346 abstractActivityC3349 = viewOnClickListenerC7642.f23606;
                    switch (iM3006) {
                        case R.id.button1:
                            iM2566 = C0630.m2566("ۨۡ") ^ i30;
                            i2 = ((iM2566 ^ i31) * (-26109)) ^ 2001192385;
                            i4 = -724630776;
                            break;
                        case R.id.button2:
                            iM2566 = (C2105.m6981("ܶۡ") ^ i31) * 75;
                            i2 = ((iM2566 ^ i30) * 7699) ^ 309744118;
                            i4 = -1058848138;
                            break;
                        case R.id.button3:
                            iM2566 = (C0630.m2566("֡۫") ^ i30) * 47;
                            i2 = ((iM2566 ^ i31) * (-12037)) ^ 1620705618;
                            i4 = 169500596;
                            break;
                        default:
                            iM2566 = (i31 - C2105.m6981("᩺ۧ")) * (-25);
                            i2 = ((iM2566 ^ i30) * (-3777)) ^ 2030081649;
                            i4 = 246678688;
                            break;
                    }
                    i5 = iM2566 ^ i4;
                    dialogInterfaceC0206 = dialogInterfaceC0207;
                    abstractActivityC3348 = abstractActivityC3349;
                    sArr16 = sArr16;
                    i33 = i5;
                    i32 = i2;
                    viewOnClickListenerC7642 = this;
                    String str18 = str14;
                    c16560 = c16560;
                    i34 = i34;
                    i37 = i;
                    str14 = str18;
                    StringBuilder sb12 = sb;
                    str11 = str11;
                    th2 = th2;
                    sbM19190 = sb12;
                    short[] sArr112 = sArr;
                    sArr17 = sArr17;
                    str12 = str12;
                    sArr14 = sArr112;
                    break;
                case -1566003615:
                case 118626319:
                    ViewOnClickListenerC1958.m6441(c19259, C0630.m2566(C1916.m6311(sArr15, i34, i36, i35)) ^ 2119531682, dialogInterfaceOnClickListenerC2914);
                    sArr16 = f23598;
                    i38 = 23;
                    i39 = 3;
                    if (C3019.f9544 >= 0) {
                        iM6987 = (C2105.m6981("֫ܿ") ^ i30) * (-53);
                        i25 = ((iM6987 ^ i31) * (-21655)) ^ (-281073816);
                        i27 = -395231854;
                    } else {
                        iM6987 = C2105.m6981("᩸᩹") ^ i31;
                        i25 = ((iM6987 ^ i30) * (-6371)) ^ 509002299;
                        i27 = -1332923704;
                    }
                    i33 = iM6987 ^ i27;
                    i32 = i25;
                    break;
                case -1487130918:
                case -736174784:
                    sArr16 = sArr16;
                    abstractActivityC3348 = abstractActivityC3348;
                    int i45 = i37;
                    i34 = i34;
                    c16560 = c16560;
                    str14 = str14;
                    i = i45;
                    StringBuilder sb13 = sbM19190;
                    th2 = th2;
                    str11 = str11;
                    sb = sb13;
                    short[] sArr22 = sArr14;
                    str12 = str12;
                    sArr17 = sArr17;
                    sArr = sArr22;
                    s = f23598[10];
                    i28 = s + 1;
                    if (C11340.f33930 < 0) {
                        iM6981 = (C2105.m6981("ۖ۬") ^ i31) * (-65);
                        i2 = ((iM6981 ^ i30) * (-15259)) ^ (-446392249);
                        i3 = 1080833138;
                        i5 = iM6981 ^ i3;
                        abstractActivityC3348 = abstractActivityC3348;
                        sArr16 = sArr16;
                        i33 = i5;
                        i32 = i2;
                        viewOnClickListenerC7642 = this;
                        String str19 = str14;
                        c16560 = c16560;
                        i34 = i34;
                        i37 = i;
                        str14 = str19;
                        StringBuilder sb14 = sb;
                        str11 = str11;
                        th2 = th2;
                        sbM19190 = sb14;
                        short[] sArr113 = sArr;
                        sArr17 = sArr17;
                        str12 = str12;
                        sArr14 = sArr113;
                    } else {
                        sArr2 = sArr17;
                        int iM6989 = (C2105.m6981("᩻֨") ^ i31) * (-89);
                        int i46 = ((iM6989 ^ i30) * (-11415)) ^ 494937566;
                        abstractActivityC3348 = abstractActivityC3348;
                        str12 = str12;
                        sArr16 = sArr16;
                        i33 = iM6989 ^ 764135687;
                        sArr14 = sArr;
                        viewOnClickListenerC7642 = this;
                        sArr17 = sArr2;
                        i32 = i46;
                        String str20 = str14;
                        c16560 = c16560;
                        i34 = i34;
                        i37 = i;
                        str14 = str20;
                        StringBuilder sb15 = sb;
                        str11 = str11;
                        th2 = th2;
                        sbM19190 = sb15;
                    }
                    break;
                case -1466670469:
                case 1505221272:
                    sArr3 = sArr16;
                    abstractActivityC3346 = abstractActivityC3348;
                    int i47 = i37;
                    i34 = i34;
                    c16560 = c16560;
                    str14 = str14;
                    i = i47;
                    StringBuilder sb16 = sbM19190;
                    th2 = th2;
                    str11 = str11;
                    sb = sb16;
                    short[] sArr23 = sArr14;
                    str12 = str12;
                    sArr17 = sArr17;
                    sArr = sArr23;
                    c2 = 0;
                    z = true;
                    iM2567 = C0630.m2566("ۧ۬") ^ i30;
                    i6 = ((iM2567 ^ i31) * (-5305)) ^ (-1847569546);
                    i7 = -961241877;
                    int i48 = iM2567 ^ i7;
                    abstractActivityC3348 = abstractActivityC3346;
                    sArr16 = sArr3;
                    i33 = i48;
                    i32 = i6;
                    String str110 = str14;
                    c16560 = c16560;
                    i34 = i34;
                    i37 = i;
                    str14 = str110;
                    StringBuilder sb17 = sb;
                    str11 = str11;
                    th2 = th2;
                    sbM19190 = sb17;
                    short[] sArr114 = sArr;
                    sArr17 = sArr17;
                    str12 = str12;
                    sArr14 = sArr114;
                    break;
                case -1430461029:
                case 207987430:
                    sArr7 = sArr16;
                    str4 = str14;
                    StringBuilder sb18 = sbM19190;
                    i11 = i37;
                    i12 = i34;
                    str5 = str11;
                    short[] sArr24 = sArr14;
                    str3 = str12;
                    sArr5 = sArr17;
                    sArr6 = sArr24;
                    if (c16709M32204 != null) {
                        iM6983 = C2105.m6981("ۚۨ") ^ i31;
                        sb3 = sb18;
                        i13 = ((iM6983 ^ i30) * 31881) ^ (-1629324342);
                        i14 = 1098809333;
                    } else {
                        sb3 = sb18;
                        iM6983 = C0630.m2566("ۨܿ") ^ i30;
                        i13 = ((iM6983 ^ i31) * 3917) ^ 992223519;
                        i14 = 1637373130;
                    }
                    int i49 = iM6983 ^ i14;
                    sbM19190 = sb3;
                    str11 = str5;
                    i34 = i12;
                    i37 = i11;
                    str14 = str4;
                    sArr8 = sArr7;
                    i33 = i49;
                    i32 = i13;
                    sArr16 = sArr8;
                    short[] sArr25 = sArr6;
                    sArr17 = sArr5;
                    str12 = str3;
                    sArr14 = sArr25;
                    break;
                case -1358165406:
                case 281049483:
                    sArr10 = sArr16;
                    short[] sArr26 = sArr17;
                    i19 = i37;
                    String strM4902 = C1420.m4902(sArr26, i19, 1, i35);
                    sArr6 = sArr14;
                    sb4 = sbM19190;
                    C1420.m4905(sb4, strM4902);
                    strM947 = C0050.m947(sb4);
                    i20 = i34;
                    str7 = str12;
                    sArr5 = sArr26;
                    str8 = str14;
                    sbM19191 = C7166.m19190(str7, str8);
                    iM39320 = viewOnClickListenerC7642.f23603.m39320();
                    if (C3432.m10477() <= 0) {
                        str13 = strM4902;
                        int iM69810 = (C2105.m6981("ۙ᩷") + i31) * 75;
                        str3 = str7;
                        i21 = ((iM69810 ^ i30) * (-29225)) ^ (-1360668844);
                        i22 = iM69810 ^ (-1637328759);
                    } else {
                        str3 = str7;
                        int iM69811 = (C2105.m6981("᩵᩹") + i30) * (-67);
                        i21 = ((iM69811 ^ i31) * 27203) ^ 197240338;
                        i22 = iM69811 ^ (-278521530);
                        str13 = strM4902;
                    }
                    str14 = str8;
                    sArr8 = sArr10;
                    i33 = i22;
                    i32 = i21;
                    i34 = i20;
                    i37 = i19;
                    str10 = strM947;
                    sbM19190 = sb4;
                    sArr16 = sArr8;
                    short[] sArr27 = sArr6;
                    sArr17 = sArr5;
                    str12 = str3;
                    sArr14 = sArr27;
                    break;
                case -1119165246:
                case 14108098:
                    sArr9 = sArr16;
                    i15 = i37;
                    i16 = i34;
                    short[] sArr28 = sArr14;
                    str3 = str12;
                    sArr5 = sArr17;
                    sArr6 = sArr28;
                    strM12817 = C4263.m12817(f23598, 11, 2, i35);
                    str6 = str11;
                    sbM19190 = C7166.m19190(str6, strM12817);
                    if (C4263.m12819() >= 0) {
                        iM6984 = C2105.m6981("᩻ᩳ") ^ i30;
                        i17 = ((iM6984 ^ i31) * (-30389)) ^ (-179374543);
                        i18 = 1413633363;
                    } else {
                        iM6984 = C2105.m6981("ᩳܽ") ^ i30;
                        i17 = ((iM6984 ^ i31) * 12071) ^ 1044453605;
                        i18 = -2038151288;
                    }
                    int i50 = iM6984 ^ i18;
                    str11 = str6;
                    i34 = i16;
                    i37 = i15;
                    str14 = strM12817;
                    i32 = i17;
                    sArr8 = sArr9;
                    i33 = i50;
                    sArr16 = sArr8;
                    short[] sArr29 = sArr6;
                    sArr17 = sArr5;
                    str12 = str3;
                    sArr14 = sArr29;
                    break;
                case -988373725:
                case -323107189:
                    sArr3 = sArr16;
                    String str21 = str14;
                    i = i37;
                    abstractActivityC3346 = abstractActivityC3348;
                    i34 = i34;
                    StringBuilder sb19 = sbM19190;
                    th2 = th2;
                    str11 = str11;
                    sb = sb19;
                    short[] sArr30 = sArr14;
                    str12 = str12;
                    sArr17 = sArr17;
                    sArr = sArr30;
                    c16560 = c16560;
                    C19568.m45016(c16560, viewOnClickListenerC7642.f23600);
                    str14 = str21;
                    iM2567 = C2105.m6981("᩺ۢ") ^ i31;
                    i6 = ((iM2567 ^ i30) * (-18407)) ^ 1996406497;
                    i7 = -752977738;
                    int i410 = iM2567 ^ i7;
                    abstractActivityC3348 = abstractActivityC3346;
                    sArr16 = sArr3;
                    i33 = i410;
                    i32 = i6;
                    String str111 = str14;
                    c16560 = c16560;
                    i34 = i34;
                    i37 = i;
                    str14 = str111;
                    StringBuilder sb110 = sb;
                    str11 = str11;
                    th2 = th2;
                    sbM19190 = sb110;
                    short[] sArr115 = sArr;
                    sArr17 = sArr17;
                    str12 = str12;
                    sArr14 = sArr115;
                    break;
                case -932634481:
                case 1104781508:
                    break;
                case -900976626:
                case 685720662:
                    objArr[z ? 1 : 0] = strM1959;
                    iM6988 = C2105.m6981(C0050.m948(f23598, 17, 3, i35)) ^ 2121947711;
                    if (C4263.f13799 > 0) {
                        iM6987 = (C0630.m2566("ۢ۠") + i30) * (-109);
                        i25 = ((iM6987 ^ i31) * (-29073)) ^ (-1631809433);
                        i27 = 1047930825;
                        i33 = iM6987 ^ i27;
                        i32 = i25;
                    } else {
                        sArr16 = sArr16;
                        sArr2 = sArr17;
                        abstractActivityC3348 = abstractActivityC3348;
                        sArr = sArr14;
                        str12 = str12;
                        int i51 = i37;
                        i34 = i34;
                        c16560 = c16560;
                        str14 = str14;
                        i = i51;
                        StringBuilder sb20 = sbM19190;
                        th2 = th2;
                        str11 = str11;
                        sb = sb20;
                        int iM69812 = (C2105.m6981("᩻֨") ^ i31) * (-89);
                        int i411 = ((iM69812 ^ i30) * (-11415)) ^ 494937566;
                        abstractActivityC3348 = abstractActivityC3348;
                        str12 = str12;
                        sArr16 = sArr16;
                        i33 = iM69812 ^ 764135687;
                        sArr14 = sArr;
                        viewOnClickListenerC7642 = this;
                        sArr17 = sArr2;
                        i32 = i411;
                        String str22 = str14;
                        c16560 = c16560;
                        i34 = i34;
                        i37 = i;
                        str14 = str22;
                        StringBuilder sb111 = sb;
                        str11 = str11;
                        th2 = th2;
                        sbM19190 = sb111;
                    }
                    break;
                case -885872916:
                case -430805978:
                    C2105.m6982();
                    break;
                case -650567838:
                case 1310965486:
                    ServiceConnectionC3453.m10564();
                    break;
                case -552067373:
                case -320828172:
                    viewOnClickListenerC7642.f23601 = z;
                    C3663.m11167(dialogInterfaceC0206);
                    C0964.m3402(new C13991(viewOnClickListenerC7642));
                    break;
                case -479208241:
                case -141449385:
                    sArr4 = sArr16;
                    Throwable th3 = th2;
                    str = str11;
                    str2 = str14;
                    sb2 = sbM19190;
                    i9 = i37;
                    abstractActivityC3347 = abstractActivityC3348;
                    i10 = i34;
                    char c3 = c;
                    short[] sArr31 = sArr14;
                    str3 = str12;
                    sArr5 = sArr17;
                    sArr6 = sArr31;
                    if (c16560 == null) {
                        int iM25610 = (C0630.m2566("ۤᩳ") ^ i30) * (-39);
                        th = th3;
                        i32 = ((iM25610 ^ i31) * 28303) ^ 915891621;
                        abstractActivityC3348 = abstractActivityC3347;
                        sArr16 = sArr4;
                        i33 = iM25610 ^ (-2021733180);
                        c = c3;
                    } else {
                        th = th3;
                        c = c2;
                        int iM69813 = (i31 - C2105.m6981("ۜۘ")) * (-97);
                        abstractActivityC3348 = abstractActivityC3347;
                        sArr16 = sArr4;
                        i33 = iM69813 ^ (-990422711);
                        i32 = ((iM69813 ^ i30) * (-669)) ^ 830883931;
                    }
                    i34 = i10;
                    i37 = i9;
                    str14 = str2;
                    StringBuilder sb21 = sb2;
                    str11 = str;
                    th2 = th;
                    sbM19190 = sb21;
                    short[] sArr210 = sArr6;
                    sArr17 = sArr5;
                    str12 = str3;
                    sArr14 = sArr210;
                    break;
                case -225624153:
                case -169061966:
                    sArr4 = sArr16;
                    str2 = str14;
                    i9 = i37;
                    i10 = i34;
                    String str23 = str11;
                    sb2 = sbM19190;
                    short[] sArr32 = sArr14;
                    str3 = str12;
                    sArr5 = sArr17;
                    sArr6 = sArr32;
                    th = th2;
                    abstractActivityC3347 = abstractActivityC3348;
                    c = 1;
                    str = str23;
                    int iM69814 = (i31 - C2105.m6981("ۜۘ")) * (-97);
                    abstractActivityC3348 = abstractActivityC3347;
                    sArr16 = sArr4;
                    i33 = iM69814 ^ (-990422711);
                    i32 = ((iM69814 ^ i30) * (-669)) ^ 830883931;
                    i34 = i10;
                    i37 = i9;
                    str14 = str2;
                    StringBuilder sb22 = sb2;
                    str11 = str;
                    th2 = th;
                    sbM19190 = sb22;
                    short[] sArr211 = sArr6;
                    sArr17 = sArr5;
                    str12 = str3;
                    sArr14 = sArr211;
                    break;
                case -34485204:
                case 64650182:
                    C3537.m10741(c19259, C1420.m4906(iM6988, objArr));
                    dialogInterfaceOnClickListenerC2914 = new DialogInterfaceOnClickListenerC2914(z ? 1 : 0, viewOnClickListenerC7642);
                    sArr15 = f23598;
                    i34 = 20;
                    i36 = 3;
                    if (!C2272.m7503()) {
                        iM6987 = (i31 - C0630.m2566("᩷֨")) * (-117);
                        i25 = ((iM6987 ^ i30) * (-909)) ^ 1658953508;
                        i27 = 239325702;
                        i33 = iM6987 ^ i27;
                        i32 = i25;
                    } else {
                        sArr10 = sArr16;
                        str7 = str12;
                        str8 = str14;
                        sb4 = sbM19190;
                        sArr5 = sArr17;
                        sArr6 = sArr14;
                        strM947 = str10;
                        i19 = i37;
                        i20 = 20;
                        int iM69815 = (C2105.m6981("ۙ᩷") + i31) * 75;
                        str3 = str7;
                        i21 = ((iM69815 ^ i30) * (-29225)) ^ (-1360668844);
                        i22 = iM69815 ^ (-1637328759);
                        str14 = str8;
                        sArr8 = sArr10;
                        i33 = i22;
                        i32 = i21;
                        i34 = i20;
                        i37 = i19;
                        str10 = strM947;
                        sbM19190 = sb4;
                        sArr16 = sArr8;
                        short[] sArr212 = sArr6;
                        sArr17 = sArr5;
                        str12 = str3;
                        sArr14 = sArr212;
                    }
                    break;
                case 38092173:
                case 1093505070:
                    C4075.m12261(abstractActivityC3348, intent);
                    break;
                case 50911565:
                case 201292235:
                    sArr16 = sArr16;
                    i34 = i34;
                    String str24 = str14;
                    StringBuilder sb23 = sbM19190;
                    sArr = sArr14;
                    str12 = str12;
                    C0422.m1944(sb23, c16709M32204.m39320());
                    sArr2 = f23598;
                    if (C4159.f13567) {
                        int iM69816 = (i31 - C2105.m6981("ܺۗ")) * 69;
                        int i52 = ((iM69816 ^ i30) * 6195) ^ (-361717275);
                        sbM19190 = sb23;
                        str14 = str24;
                        sArr16 = sArr16;
                        i33 = iM69816 ^ 991528655;
                        str12 = str12;
                        sArr14 = sArr;
                        sArr17 = sArr2;
                        i32 = i52;
                        i34 = i34;
                        i37 = 13;
                    } else {
                        c16560 = c16560;
                        th2 = th2;
                        str11 = str11;
                        i = 13;
                        sb = sb23;
                        str14 = str24;
                        abstractActivityC3348 = abstractActivityC3348;
                        int iM69817 = (C2105.m6981("᩻֨") ^ i31) * (-89);
                        int i412 = ((iM69817 ^ i30) * (-11415)) ^ 494937566;
                        abstractActivityC3348 = abstractActivityC3348;
                        str12 = str12;
                        sArr16 = sArr16;
                        i33 = iM69817 ^ 764135687;
                        sArr14 = sArr;
                        viewOnClickListenerC7642 = this;
                        sArr17 = sArr2;
                        i32 = i412;
                        String str25 = str14;
                        c16560 = c16560;
                        i34 = i34;
                        i37 = i;
                        str14 = str25;
                        StringBuilder sb112 = sb;
                        str11 = str11;
                        th2 = th2;
                        sbM19190 = sb112;
                    }
                    break;
                case 172740408:
                case 579924310:
                    C1504.m5172(dialogInterfaceC0206);
                    break;
                case 233198640:
                case 400497119:
                    sArr11 = sArr16;
                    i23 = iM39320;
                    sb5 = sbM19191;
                    C0050.m945(sb5, i23);
                    str9 = str13;
                    C3245.m9923(sb5, str9);
                    strM1959 = C0422.m1959(sb5);
                    c19258M5912 = C1773.m5912(abstractActivityC3348);
                    sArr14 = f23598;
                    if (C1128.f4106 <= 0) {
                        iM6985 = C0630.m2566("۫ܳ") ^ i30;
                        c19258 = c19258M5912;
                        i32 = ((iM6985 ^ i31) * 8403) ^ 1487379238;
                        i24 = -945631549;
                    } else {
                        iM6985 = C2105.m6981("ۨᩳ") ^ i31;
                        c19258 = c19258M5912;
                        i32 = ((iM6985 ^ i30) * 14799) ^ 766340160;
                        i24 = -1875669706;
                    }
                    int i53 = iM6985 ^ i24;
                    sbM19191 = sb5;
                    C19258 c192510 = c19258;
                    iM39320 = i23;
                    sArr16 = sArr11;
                    i33 = i53;
                    str13 = str9;
                    c19259 = c192510;
                    break;
                case 242844839:
                case 1231417755:
                    sArr12 = sArr16;
                    sArr13 = sArr14;
                    strM1955 = C0422.m1955(sArr13, 14, 3, i35);
                    if (C5695.f17556 >= 0) {
                        iM6986 = (i31 - C0630.m2566("ۡ᩺")) * 73;
                        i25 = ((iM6986 ^ i30) * (-16111)) ^ 1486681890;
                        i26 = -554019951;
                    } else {
                        iM6986 = C2105.m6981("ۘ᩸") ^ i30;
                        i25 = ((iM6986 ^ i31) * 20353) ^ (-389523544);
                        i26 = -1646442177;
                    }
                    int i413 = iM6986 ^ i26;
                    sArr14 = sArr13;
                    sArr16 = sArr12;
                    i33 = i413;
                    i32 = i25;
                    break;
                case 279290614:
                case 1159255345:
                    C0382.m1849(c19259, C2105.m6981(strM1955) ^ 2122974985);
                    objArr = new Object[2];
                    objArr[c2] = str10;
                    if (C3663.f11553) {
                        iM6987 = (C2105.m6981("֫ܿ") ^ i30) * (-53);
                        i25 = ((iM6987 ^ i31) * (-21655)) ^ (-281073816);
                        i27 = -395231854;
                    } else {
                        iM6987 = (C2105.m6981("ۛܺ") + i31) * (-61);
                        i25 = ((iM6987 ^ i30) * (-9281)) ^ 1975738146;
                        i27 = 519273017;
                    }
                    i33 = iM6987 ^ i27;
                    i32 = i25;
                    break;
                case 398235908:
                case 1584655853:
                    C4117.m12364();
                    if (C0050.f910 < 0) {
                        iM6987 = (C2105.m6981("ܽۛ") ^ i30) * 75;
                        i25 = ((iM6987 ^ i31) * 3093) ^ (-2048682067);
                        i27 = 1198781947;
                    } else {
                        iM6987 = (i31 - C0630.m2566("ܰᩴ")) * 41;
                        i25 = ((iM6987 ^ i30) * (-14627)) ^ 2126150084;
                        i27 = 1246566316;
                    }
                    i33 = iM6987 ^ i27;
                    i32 = i25;
                    break;
                case 430450375:
                case 1148838811:
                    sArr3 = sArr16;
                    String str26 = str14;
                    i = i37;
                    abstractActivityC3346 = abstractActivityC3348;
                    i34 = i34;
                    StringBuilder sb24 = sbM19190;
                    th2 = th2;
                    str11 = str11;
                    sb = sb24;
                    short[] sArr33 = sArr14;
                    str12 = str12;
                    sArr17 = sArr17;
                    sArr = sArr33;
                    C0798.m3009(intent, 268435456);
                    c16560 = c16560;
                    str14 = str26;
                    iM2567 = C0630.m2566("᩵۫") ^ i30;
                    i6 = ((iM2567 ^ i31) * (-17179)) ^ 1793607742;
                    i7 = -866734511;
                    int i414 = iM2567 ^ i7;
                    abstractActivityC3348 = abstractActivityC3346;
                    sArr16 = sArr3;
                    i33 = i414;
                    i32 = i6;
                    String str112 = str14;
                    c16560 = c16560;
                    i34 = i34;
                    i37 = i;
                    str14 = str112;
                    StringBuilder sb113 = sb;
                    str11 = str11;
                    th2 = th2;
                    sbM19190 = sb113;
                    short[] sArr116 = sArr;
                    sArr17 = sArr17;
                    str12 = str12;
                    sArr14 = sArr116;
                    break;
                case 539245978:
                case 663996548:
                    C0422.m1963();
                    C3245.m9925();
                    iM6987 = C0630.m2566("۟۫") ^ i30;
                    i25 = ((iM6987 ^ i31) * (-8547)) ^ 1410321725;
                    i27 = 1797960355;
                    i33 = iM6987 ^ i27;
                    i32 = i25;
                    break;
                case 852056133:
                case 1939214722:
                    if (C3537.f11231 < 0) {
                        sArr9 = sArr16;
                        strM12817 = str14;
                        i15 = i37;
                        i16 = i34;
                        str6 = str11;
                        short[] sArr34 = sArr14;
                        str3 = str12;
                        sArr5 = sArr17;
                        sArr6 = sArr34;
                        iM6984 = C2105.m6981("᩻ᩳ") ^ i30;
                        i17 = ((iM6984 ^ i31) * (-30389)) ^ (-179374543);
                        i18 = 1413633363;
                        int i54 = iM6984 ^ i18;
                        str11 = str6;
                        i34 = i16;
                        i37 = i15;
                        str14 = strM12817;
                        i32 = i17;
                        sArr8 = sArr9;
                        i33 = i54;
                        sArr16 = sArr8;
                        short[] sArr213 = sArr6;
                        sArr17 = sArr5;
                        str12 = str3;
                        sArr14 = sArr213;
                    } else {
                        sArr12 = sArr16;
                        sArr13 = sArr14;
                        iM6986 = (i31 - C0630.m2566("ۡ᩺")) * 73;
                        i25 = ((iM6986 ^ i30) * (-16111)) ^ 1486681890;
                        i26 = -554019951;
                        int i415 = iM6986 ^ i26;
                        sArr14 = sArr13;
                        sArr16 = sArr12;
                        i33 = i415;
                        i32 = i25;
                    }
                    break;
                case 890878598:
                case 1440638812:
                    C1420.m4913();
                    break;
                case 918703901:
                case 1823631097:
                    sArr3 = sArr16;
                    abstractActivityC3346 = abstractActivityC3348;
                    int i55 = i37;
                    i34 = i34;
                    c16560 = c16560;
                    str14 = str14;
                    i = i55;
                    StringBuilder sb25 = sbM19190;
                    th2 = th2;
                    str11 = str11;
                    sb = sb25;
                    short[] sArr35 = sArr14;
                    str12 = str12;
                    sArr17 = sArr17;
                    sArr = sArr35;
                    if (c16560 != null) {
                        iM2567 = (i31 - C0630.m2566("ۨᩴ")) * 75;
                        i6 = ((iM2567 ^ i30) * (-14997)) ^ (-607228395);
                        i7 = 1761741629;
                    } else {
                        iM2567 = C2105.m6981("᩺ۢ") ^ i31;
                        i6 = ((iM2567 ^ i30) * (-18407)) ^ 1996406497;
                        i7 = -752977738;
                    }
                    int i416 = iM2567 ^ i7;
                    abstractActivityC3348 = abstractActivityC3346;
                    sArr16 = sArr3;
                    i33 = i416;
                    i32 = i6;
                    String str113 = str14;
                    c16560 = c16560;
                    i34 = i34;
                    i37 = i;
                    str14 = str113;
                    StringBuilder sb114 = sb;
                    str11 = str11;
                    th2 = th2;
                    sbM19190 = sb114;
                    short[] sArr117 = sArr;
                    sArr17 = sArr17;
                    str12 = str12;
                    sArr14 = sArr117;
                    break;
                case 931219586:
                case 1162136663:
                    i = i37;
                    sb = sbM19190;
                    sArr = sArr14;
                    i35 = 12125;
                    iM6981 = (C2105.m6981("֨ܺ") ^ i31) * 23;
                    i2 = ((iM6981 ^ i30) * 28029) ^ 1324631277;
                    i3 = -977910770;
                    i5 = iM6981 ^ i3;
                    abstractActivityC3348 = abstractActivityC3348;
                    sArr16 = sArr16;
                    i33 = i5;
                    i32 = i2;
                    viewOnClickListenerC7642 = this;
                    String str114 = str14;
                    c16560 = c16560;
                    i34 = i34;
                    i37 = i;
                    str14 = str114;
                    StringBuilder sb115 = sb;
                    str11 = str11;
                    th2 = th2;
                    sbM19190 = sb115;
                    short[] sArr118 = sArr;
                    sArr17 = sArr17;
                    str12 = str12;
                    sArr14 = sArr118;
                    break;
                case 1013401877:
                case 1615897181:
                    C4075.m12263();
                    if (C0050.f910 < 0) {
                        sArr16 = sArr16;
                        sArr2 = sArr17;
                        abstractActivityC3348 = abstractActivityC3348;
                        sArr = sArr14;
                        str12 = str12;
                        int i56 = i37;
                        i34 = i34;
                        c16560 = c16560;
                        str14 = str14;
                        i = i56;
                        StringBuilder sb26 = sbM19190;
                        th2 = th2;
                        str11 = str11;
                        sb = sb26;
                        int iM69818 = (C2105.m6981("᩻֨") ^ i31) * (-89);
                        int i417 = ((iM69818 ^ i30) * (-11415)) ^ 494937566;
                        abstractActivityC3348 = abstractActivityC3348;
                        str12 = str12;
                        sArr16 = sArr16;
                        i33 = iM69818 ^ 764135687;
                        sArr14 = sArr;
                        viewOnClickListenerC7642 = this;
                        sArr17 = sArr2;
                        i32 = i417;
                        String str27 = str14;
                        c16560 = c16560;
                        i34 = i34;
                        i37 = i;
                        str14 = str27;
                        StringBuilder sb116 = sb;
                        str11 = str11;
                        th2 = th2;
                        sbM19190 = sb116;
                    } else {
                        sArr11 = sArr16;
                        c19258M5912 = c19259;
                        str9 = str13;
                        i23 = iM39320;
                        sb5 = sbM19191;
                        iM6985 = C0630.m2566("۫ܳ") ^ i30;
                        c19258 = c19258M5912;
                        i32 = ((iM6985 ^ i31) * 8403) ^ 1487379238;
                        i24 = -945631549;
                        int i57 = iM6985 ^ i24;
                        sbM19191 = sb5;
                        C19258 c192511 = c19258;
                        iM39320 = i23;
                        sArr16 = sArr11;
                        i33 = i57;
                        str13 = str9;
                        c19259 = c192511;
                    }
                    break;
                case 1051809601:
                case 1255806466:
                    if (C7106.f21815 != 0) {
                        sArr10 = sArr16;
                        str8 = str14;
                        sb4 = sbM19190;
                        strM947 = str10;
                        i19 = i37;
                        i20 = i34;
                        str7 = str12;
                        sArr5 = sArr17;
                        sArr6 = sArr14;
                        int iM69819 = (C2105.m6981("ۙ᩷") + i31) * 75;
                        str3 = str7;
                        i21 = ((iM69819 ^ i30) * (-29225)) ^ (-1360668844);
                        i22 = iM69819 ^ (-1637328759);
                        str14 = str8;
                        sArr8 = sArr10;
                        i33 = i22;
                        i32 = i21;
                        i34 = i20;
                        i37 = i19;
                        str10 = strM947;
                        sbM19190 = sb4;
                        sArr16 = sArr8;
                        short[] sArr214 = sArr6;
                        sArr17 = sArr5;
                        str12 = str3;
                        sArr14 = sArr214;
                    } else {
                        iM6987 = C0630.m2566("۟۫") ^ i30;
                        i25 = ((iM6987 ^ i31) * (-8547)) ^ 1410321725;
                        i27 = 1797960355;
                        i33 = iM6987 ^ i27;
                        i32 = i25;
                    }
                    break;
                case 1271678311:
                case 1375651383:
                    sArr3 = sArr16;
                    String str28 = str14;
                    i = i37;
                    abstractActivityC3346 = abstractActivityC3348;
                    i34 = i34;
                    c16560 = c16560;
                    StringBuilder sb27 = sbM19190;
                    th2 = th2;
                    str11 = str11;
                    sb = sb27;
                    short[] sArr36 = sArr14;
                    str12 = str12;
                    sArr17 = sArr17;
                    sArr = sArr36;
                    try {
                        str14 = str28;
                        try {
                            c16709M32204 = C13265.m32204(viewOnClickListenerC7642.f23603, viewOnClickListenerC7642.f23607);
                            iM2567 = C2105.m6981("ۚܳ") ^ i31;
                            i6 = ((iM2567 ^ i30) * 23651) ^ (-1787316289);
                            i7 = 1944760868;
                            int i418 = iM2567 ^ i7;
                            abstractActivityC3348 = abstractActivityC3346;
                            sArr16 = sArr3;
                            i33 = i418;
                            i32 = i6;
                        } catch (Exception e) {
                            e = e;
                            iM6982 = C0630.m2566("۫ۧ") ^ i30;
                            th2 = e;
                            i32 = ((iM6982 ^ i31) * (-413)) ^ 633087681;
                            i8 = 1847002362;
                            int i419 = iM6982 ^ i8;
                            abstractActivityC3348 = abstractActivityC3346;
                            sArr16 = sArr3;
                            i33 = i419;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        str14 = str28;
                    }
                    String str115 = str14;
                    c16560 = c16560;
                    i34 = i34;
                    i37 = i;
                    str14 = str115;
                    StringBuilder sb117 = sb;
                    str11 = str11;
                    th2 = th2;
                    sbM19190 = sb117;
                    short[] sArr119 = sArr;
                    sArr17 = sArr17;
                    str12 = str12;
                    sArr14 = sArr119;
                    break;
                case 1555609482:
                case 1997942480:
                    C4159.m12565();
                    if (!C0382.f1805) {
                        sArr11 = sArr16;
                        c19258M5912 = c19259;
                        str9 = str13;
                        i23 = iM39320;
                        sb5 = sbM19191;
                        iM6985 = C0630.m2566("۫ܳ") ^ i30;
                        c19258 = c19258M5912;
                        i32 = ((iM6985 ^ i31) * 8403) ^ 1487379238;
                        i24 = -945631549;
                        int i58 = iM6985 ^ i24;
                        sbM19191 = sb5;
                        C19258 c192512 = c19258;
                        iM39320 = i23;
                        sArr16 = sArr11;
                        i33 = i58;
                        str13 = str9;
                        c19259 = c192512;
                    } else {
                        sArr12 = sArr16;
                        sArr13 = sArr14;
                        iM6986 = (i31 - C0630.m2566("ۡ᩺")) * 73;
                        i25 = ((iM6986 ^ i30) * (-16111)) ^ 1486681890;
                        i26 = -554019951;
                        int i4110 = iM6986 ^ i26;
                        sArr14 = sArr13;
                        sArr16 = sArr12;
                        i33 = i4110;
                        i32 = i25;
                    }
                    break;
                case 1652512479:
                case 2118802713:
                    abstractActivityC3348.m10224(th2, (boolean) c);
                    break;
                case 1734339330:
                case 1775825391:
                    C5695.m16035(c19259, C2105.m6981(C0050.m948(sArr16, i38, i39, i35)) ^ 2119705981, null);
                    C3683.m11213(c19259);
                    break;
                default:
                    sArr16 = sArr16;
                    abstractActivityC3348 = abstractActivityC3348;
                    int i59 = i37;
                    i34 = i34;
                    c16560 = c16560;
                    str14 = str14;
                    i = i59;
                    StringBuilder sb28 = sbM19190;
                    th2 = th2;
                    str11 = str11;
                    sb = sb28;
                    short[] sArr37 = sArr14;
                    str12 = str12;
                    sArr17 = sArr17;
                    sArr = sArr37;
                    if ((i28 * i28) - ((s * 2) + 1) >= 0) {
                        iM6981 = C0630.m2566("᩶ܽ") ^ i30;
                        i2 = ((iM6981 ^ i31) * (-29389)) ^ 1326399757;
                        i3 = -1157990804;
                    } else {
                        iM6981 = (i30 - C0630.m2566("ۖ᩷")) * 5;
                        i2 = ((iM6981 ^ i31) * (-11257)) ^ (-255527539);
                        i3 = 315979525;
                    }
                    i5 = iM6981 ^ i3;
                    abstractActivityC3348 = abstractActivityC3348;
                    sArr16 = sArr16;
                    i33 = i5;
                    i32 = i2;
                    viewOnClickListenerC7642 = this;
                    String str116 = str14;
                    c16560 = c16560;
                    i34 = i34;
                    i37 = i;
                    str14 = str116;
                    StringBuilder sb118 = sb;
                    str11 = str11;
                    th2 = th2;
                    sbM19190 = sb118;
                    short[] sArr1110 = sArr;
                    sArr17 = sArr17;
                    str12 = str12;
                    sArr14 = sArr1110;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0618 A[PHI: r4 r13 r18 r19 r20 r21 r22 r24 r26 r27 r32 r33 r34
      0x0618: PHI (r4v28 short[]) = (r4v27 short[]), (r4v29 short[]) binds: [B:109:0x0616, B:105:0x05df] A[DONT_GENERATE, DONT_INLINE]
      0x0618: PHI (r13v18 l.ܽܳ᩷) = (r13v17 l.ܽܳ᩷), (r13v19 l.ܽܳ᩷) binds: [B:109:0x0616, B:105:0x05df] A[DONT_GENERATE, DONT_INLINE]
      0x0618: PHI (r18v3 short) = (r18v2 short), (r18v1 short) binds: [B:109:0x0616, B:105:0x05df] A[DONT_GENERATE, DONT_INLINE]
      0x0618: PHI (r19v3 short) = (r19v2 short), (r19v1 short) binds: [B:109:0x0616, B:105:0x05df] A[DONT_GENERATE, DONT_INLINE]
      0x0618: PHI (r20v2 int) = (r20v1 int), (r20v3 int) binds: [B:109:0x0616, B:105:0x05df] A[DONT_GENERATE, DONT_INLINE]
      0x0618: PHI (r21v2 int) = (r21v1 int), (r21v3 int) binds: [B:109:0x0616, B:105:0x05df] A[DONT_GENERATE, DONT_INLINE]
      0x0618: PHI (r22v2 int) = (r22v1 int), (r22v3 int) binds: [B:109:0x0616, B:105:0x05df] A[DONT_GENERATE, DONT_INLINE]
      0x0618: PHI (r24v5 l.ܽۢܳ) = (r24v4 l.ܽۢܳ), (r24v6 l.ܽۢܳ) binds: [B:109:0x0616, B:105:0x05df] A[DONT_GENERATE, DONT_INLINE]
      0x0618: PHI (r26v3 l.ܽܳ᩷) = (r26v2 l.ܽܳ᩷), (r26v4 l.ܽܳ᩷) binds: [B:109:0x0616, B:105:0x05df] A[DONT_GENERATE, DONT_INLINE]
      0x0618: PHI (r27v5 'e' java.lang.Exception) = (r27v4 'e' java.lang.Exception), (r27v6 'e' java.lang.Exception) binds: [B:109:0x0616, B:105:0x05df] A[DONT_GENERATE, DONT_INLINE]
      0x0618: PHI (r32v15 l.֡ۚۢ) = (r32v14 l.֡ۚۢ), (r32v16 l.֡ۚۢ) binds: [B:109:0x0616, B:105:0x05df] A[DONT_GENERATE, DONT_INLINE]
      0x0618: PHI (r33v17 short[]) = (r33v16 short[]), (r33v18 short[]) binds: [B:109:0x0616, B:105:0x05df] A[DONT_GENERATE, DONT_INLINE]
      0x0618: PHI (r34v4 long) = (r34v3 long), (r34v5 long) binds: [B:109:0x0616, B:105:0x05df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20438(AbstractC15440 abstractC15440, boolean z) {
        int iM2566;
        DialogInterfaceC0206 dialogInterfaceC0206;
        int i;
        DialogInterfaceC0206 dialogInterfaceC0207;
        short[] sArr;
        int iM6981;
        int i2;
        int i3;
        short[] sArr2;
        DialogInterfaceC0206 dialogInterfaceC0208;
        C16709 c16709;
        long j;
        C16709 c167010;
        short[] sArr3;
        Exception exc;
        C16560 c16560;
        int iM6982;
        C16560 c16561;
        int i4;
        int i5;
        int i6;
        int i7;
        Exception exc2;
        int i8;
        C16709 c167011;
        C16560 c16562;
        long jMo23127;
        C16709 c16709M32219;
        short[] sArr4;
        C16709 c167012;
        C16709 c167013;
        C16560 c16563;
        long j2;
        int iM6983;
        int i9;
        short[] sArr5;
        DialogInterfaceC0206 dialogInterfaceC0209;
        short[] sArr6;
        int iM2567;
        int i10;
        int i11;
        ViewOnClickListenerC7642 viewOnClickListenerC7642 = this;
        WeakReference weakReference = null;
        WeakReference weakReference2 = null;
        Button buttonM49343 = null;
        DialogInterfaceC0206 dialogInterfaceC02010 = null;
        Button buttonM1446 = null;
        boolean z2 = false;
        String strM11162 = null;
        short[] sArr7 = null;
        short s = 0;
        short s2 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = -746629083;
        int i16 = C3019.f9544;
        int i17 = C4616.f14690;
        int iM6984 = C2105.m6981("ۖ֨") ^ i17;
        int i18 = ((iM6984 ^ i16) * (-27)) ^ 873529088;
        int i19 = iM6984 ^ 1080794146;
        C16560 c16564 = null;
        Exception e = null;
        long j3 = 0;
        short[] sArr8 = null;
        short[] sArr9 = null;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        boolean z3 = false;
        C16709 c167014 = null;
        C16709 c167015 = null;
        int i23 = 0;
        DialogInterfaceC0206 dialogInterfaceC02011 = null;
        while (true) {
            i15 = i19 ^ ((((i15 ^ i16) * 26133) >> 31) & i18);
            switch (i15) {
                case -2107790445:
                case -171638097:
                    short[] sArr10 = sArr9;
                    DialogInterfaceC0206 dialogInterfaceC02012 = dialogInterfaceC02010;
                    C16709 c167016 = c167014;
                    j3 = j3;
                    c167015 = c167015;
                    short[] sArr11 = sArr8;
                    e = e;
                    i7 = i20;
                    C16560 c16565 = c16564;
                    try {
                        C16709 c16709M32203 = C13265.m32203(abstractC15440);
                        int iM6985 = C2105.m6981("۬ᩳ") ^ i17;
                        sArr8 = sArr11;
                        dialogInterfaceC02010 = dialogInterfaceC02012;
                        sArr9 = sArr10;
                        i19 = iM6985 ^ 678769730;
                        i18 = ((iM6985 ^ i16) * 24841) ^ 2070019524;
                        c16564 = c16565;
                        i20 = i7;
                        c167014 = c16709M32203;
                        e = e;
                        c167015 = c167015;
                    } catch (Exception e2) {
                        e = e2;
                        int iM6986 = (i17 - C2105.m6981("ܽ᩹")) * (-17);
                        sArr8 = sArr11;
                        c167015 = c167015;
                        sArr9 = sArr10;
                        i18 = ((iM6986 ^ i16) * (-26787)) ^ (-2066833609);
                        c16564 = c16565;
                        c167014 = c167016;
                        dialogInterfaceC02010 = dialogInterfaceC02012;
                        i19 = iM6986 ^ (-1316601534);
                        i20 = i7;
                    }
                    j3 = j3;
                    break;
                case -2041521917:
                case 1726981684:
                    sArr9 = sArr9;
                    dialogInterfaceC02010 = dialogInterfaceC02010;
                    c167014 = c167014;
                    j3 = j3;
                    c167015 = c167015;
                    sArr8 = sArr8;
                    e = e;
                    c16564 = c16564;
                    int i24 = i13 + i14;
                    if (i12 - (i24 + i24) > 0) {
                        iM6981 = C0630.m2566("֡ܰ") ^ i17;
                        i2 = ((iM6981 ^ i16) * (-27015)) ^ 2034808561;
                        i3 = 1208745889;
                    } else {
                        iM6981 = (i17 - C2105.m6981("ۘ᩻")) * 23;
                        i2 = ((iM6981 ^ i16) * (-23759)) ^ (-864543061);
                        i3 = 1382358194;
                    }
                    sArr8 = sArr8;
                    c16564 = c16564;
                    sArr9 = sArr9;
                    i18 = i2;
                    c167014 = c167014;
                    dialogInterfaceC02010 = dialogInterfaceC02010;
                    viewOnClickListenerC7642 = this;
                    i19 = iM6981 ^ i3;
                    e = e;
                    c167015 = c167015;
                    j3 = j3;
                    break;
                case -2007534747:
                case 646282969:
                    sArr9 = sArr9;
                    dialogInterfaceC02010 = dialogInterfaceC02010;
                    c167014 = c167014;
                    j3 = j3;
                    c167015 = c167015;
                    sArr8 = sArr8;
                    e = e;
                    c16564 = c16564;
                    s = sArr7[26];
                    s2 = 647;
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = (i16 - C2105.m6981("ۖ᩻")) * (-35);
                        i2 = ((iM6981 ^ i17) * 22071) ^ (-1359422678);
                        i3 = -115105175;
                    } else {
                        iM6981 = C2105.m6981("ۘᩳ") ^ i16;
                        i2 = ((iM6981 ^ i17) * 18889) ^ (-1768700568);
                        i3 = 1155122241;
                    }
                    sArr8 = sArr8;
                    c16564 = c16564;
                    sArr9 = sArr9;
                    i18 = i2;
                    c167014 = c167014;
                    dialogInterfaceC02010 = dialogInterfaceC02010;
                    viewOnClickListenerC7642 = this;
                    i19 = iM6981 ^ i3;
                    e = e;
                    c167015 = c167015;
                    j3 = j3;
                    break;
                case -2003560137:
                case -486318754:
                    sArr9 = sArr9;
                    dialogInterfaceC0207 = dialogInterfaceC02010;
                    sArr4 = sArr8;
                    c167012 = c167014;
                    c167013 = c167015;
                    c16563 = c16564;
                    long j4 = j3;
                    i7 = i20;
                    j2 = j4;
                    viewOnClickListenerC7642.f23604.m34974(c167012, j2, c167013);
                    weakReference = f23599;
                    if (weakReference != null) {
                        int iM2568 = (C0630.m2566("۬ܿ") ^ i17) * 87;
                        sArr8 = sArr4;
                        i18 = ((iM2568 ^ i16) * (-24261)) ^ 175441603;
                        e = e;
                        c167015 = c167013;
                        weakReference = weakReference;
                        sArr9 = sArr9;
                        c167014 = c167012;
                        dialogInterfaceC02010 = dialogInterfaceC0207;
                        i19 = iM2568 ^ 1551186393;
                        c16564 = c16563;
                        i20 = i7;
                        j3 = j2;
                    } else {
                        int iM6987 = (i16 - C2105.m6981("ܰܽ")) * (-125);
                        j3 = j2;
                        int i25 = ((iM6987 ^ i17) * 27449) ^ (-567934169);
                        sArr8 = sArr4;
                        c16564 = c16563;
                        c167014 = c167012;
                        dialogInterfaceC02010 = dialogInterfaceC0207;
                        i19 = iM6987 ^ (-1096849205);
                        e = e;
                        c167015 = c167013;
                        weakReference = weakReference;
                        sArr9 = sArr9;
                        i18 = i25;
                        i20 = i7;
                        j3 = j3;
                    }
                    break;
                case -1953500935:
                case 682528297:
                    i20 = 26422;
                    iM6981 = (C0630.m2566("᩻ܽ") + i16) * (-41);
                    i2 = ((iM6981 ^ i17) * (-21993)) ^ (-2008889397);
                    i3 = 1828424974;
                    sArr8 = sArr8;
                    c16564 = c16564;
                    sArr9 = sArr9;
                    i18 = i2;
                    c167014 = c167014;
                    dialogInterfaceC02010 = dialogInterfaceC02010;
                    viewOnClickListenerC7642 = this;
                    i19 = iM6981 ^ i3;
                    e = e;
                    c167015 = c167015;
                    j3 = j3;
                    break;
                case -1946270265:
                case 1734661259:
                    sArr5 = sArr9;
                    dialogInterfaceC0209 = dialogInterfaceC02010;
                    sArr6 = sArr8;
                    C15297.m36311(C3432.m10488(sArr6, i21, i22, i20), null, e);
                    if (c16564 == null) {
                        z2 = z3;
                        iM2567 = C0630.m2566("ܰۤ") ^ i17;
                        i10 = ((iM2567 ^ i16) * (-28625)) ^ 58676869;
                        i11 = 1838269681;
                    } else {
                        iM2567 = (i17 - C0630.m2566("ۙۘ")) * (-109);
                        i10 = ((iM2567 ^ i16) * (-29285)) ^ 1892040959;
                        i11 = -742455107;
                    }
                    int i26 = iM2567 ^ i11;
                    sArr8 = sArr6;
                    DialogInterfaceC0206 dialogInterfaceC02013 = dialogInterfaceC0209;
                    i19 = i26;
                    sArr9 = sArr5;
                    i18 = i10;
                    dialogInterfaceC02010 = dialogInterfaceC02013;
                    break;
                case -1914476649:
                case -1188901257:
                    C3019.m9255();
                    break;
                case -1811732205:
                case 2023061528:
                    sArr = sArr9;
                    dialogInterfaceC0206 = dialogInterfaceC02010;
                    f23599 = weakReference2;
                    buttonM49343 = C21923.m49343(dialogInterfaceC02011);
                    if (C2958.f9394 >= 0) {
                        iM6983 = C2105.m6981("֨ۙ") ^ i16;
                        i6 = ((iM6983 ^ i17) * 8231) ^ 1885764329;
                        i9 = 822093643;
                    } else {
                        iM6983 = C0630.m2566("᩸ᩳ") ^ i16;
                        i6 = ((iM6983 ^ i17) * 31743) ^ (-939051678);
                        i9 = -1231873970;
                    }
                    int i27 = iM6983 ^ i9;
                    dialogInterfaceC02010 = dialogInterfaceC0206;
                    i19 = i27;
                    short[] sArr12 = sArr;
                    i18 = i6;
                    sArr9 = sArr12;
                    break;
                case -1670919664:
                case -67423447:
                    sArr2 = sArr9;
                    dialogInterfaceC0208 = dialogInterfaceC02010;
                    c16709 = c167014;
                    j = j3;
                    c167010 = c167015;
                    sArr3 = sArr8;
                    exc = e;
                    c16560 = viewOnClickListenerC7642.f23602;
                    viewOnClickListenerC7642.f23600 = abstractC15440;
                    viewOnClickListenerC7642.f23607 = z;
                    z3 = true;
                    if (C2272.m7503()) {
                        iM6982 = (C2105.m6981("ۢۧ") + i16) * 23;
                        c16561 = c16560;
                        i4 = ((iM6982 ^ i17) * (-3139)) ^ (-1815840251);
                        i5 = 592242609;
                    } else {
                        iM6982 = (C2105.m6981("ᩳܶ") + i17) * (-59);
                        c16561 = c16560;
                        i4 = ((iM6982 ^ i16) * 14859) ^ (-424669294);
                        i5 = 1017872548;
                    }
                    int i28 = iM6982 ^ i5;
                    sArr8 = sArr3;
                    c16564 = c16561;
                    sArr9 = sArr2;
                    i18 = i4;
                    e = exc;
                    c167015 = c167010;
                    j3 = j;
                    c167014 = c16709;
                    dialogInterfaceC02010 = dialogInterfaceC0208;
                    i19 = i28;
                    break;
                case -1662385242:
                case 659395610:
                    dialogInterfaceC0206 = dialogInterfaceC02010;
                    C0630.m2570(buttonM1446, C0630.m2566(strM11162) ^ 2104898404);
                    sArr = sArr9;
                    iM6983 = (C2105.m6981("᩵֫") ^ i16) * (-109);
                    i6 = ((iM6983 ^ i17) * 23629) ^ (-1378978004);
                    i9 = -1992246560;
                    int i29 = iM6983 ^ i9;
                    dialogInterfaceC02010 = dialogInterfaceC0206;
                    i19 = i29;
                    short[] sArr13 = sArr;
                    i18 = i6;
                    sArr9 = sArr13;
                    break;
                case -1592173981:
                case -760532239:
                    dialogInterfaceC0206 = dialogInterfaceC02010;
                    strM11162 = C3663.m11162(sArr9, i23, 3, i20);
                    if (C3911.f12484 < 0) {
                        iM2566 = C2105.m6981("᩶᩵") ^ i16;
                        i18 = ((iM2566 ^ i17) * (-24899)) ^ (-300370129);
                        i = -890285227;
                        int i30 = iM2566 ^ i;
                        dialogInterfaceC02010 = dialogInterfaceC0206;
                        i19 = i30;
                    } else {
                        sArr = sArr9;
                        iM6983 = (C0630.m2566("ۗ᩻") ^ i17) * (-79);
                        i6 = ((iM6983 ^ i16) * (-22481)) ^ 500006548;
                        i9 = 335699433;
                        int i210 = iM6983 ^ i9;
                        dialogInterfaceC02010 = dialogInterfaceC0206;
                        i19 = i210;
                        short[] sArr14 = sArr;
                        i18 = i6;
                        sArr9 = sArr14;
                    }
                    break;
                case -1451711702:
                case 688319489:
                    sArr9 = sArr9;
                    dialogInterfaceC02010 = dialogInterfaceC02010;
                    c167014 = c167014;
                    j3 = j3;
                    c167015 = c167015;
                    sArr8 = sArr8;
                    e = e;
                    c16564 = c16564;
                    int i31 = s + s2;
                    i12 = i31 * i31;
                    i13 = s * s;
                    i14 = 418609;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = (i16 - C2105.m6981("ۖ᩻")) * (-35);
                        i2 = ((iM6981 ^ i17) * 22071) ^ (-1359422678);
                        i3 = -115105175;
                    } else {
                        iM6981 = (i16 - C2105.m6981("ۖ۠")) * (-51);
                        i2 = ((iM6981 ^ i17) * (-14643)) ^ 90021729;
                        i3 = -837632678;
                    }
                    sArr8 = sArr8;
                    c16564 = c16564;
                    sArr9 = sArr9;
                    i18 = i2;
                    c167014 = c167014;
                    dialogInterfaceC02010 = dialogInterfaceC02010;
                    viewOnClickListenerC7642 = this;
                    i19 = iM6981 ^ i3;
                    e = e;
                    c167015 = c167015;
                    j3 = j3;
                    break;
                case -1169324971:
                case -602891106:
                    sArr = sArr9;
                    dialogInterfaceC0206 = dialogInterfaceC02010;
                    sArr8 = f23598;
                    i21 = 27;
                    i22 = 20;
                    if (C0422.f1886 > 0) {
                        iM6983 = C2105.m6981("ۘۤ") ^ i16;
                        i6 = ((iM6983 ^ i17) * 10347) ^ (-426021800);
                        i9 = -1966766473;
                        int i211 = iM6983 ^ i9;
                        dialogInterfaceC02010 = dialogInterfaceC0206;
                        i19 = i211;
                        short[] sArr15 = sArr;
                        i18 = i6;
                        sArr9 = sArr15;
                    } else {
                        c167011 = c167014;
                        c16562 = c16564;
                        C16709 c167017 = c167015;
                        exc2 = e;
                        c16709M32219 = c167017;
                        long j5 = j3;
                        i8 = i20;
                        jMo23127 = j5;
                        int iM6988 = C2105.m6981("֫᩺") ^ i17;
                        Exception exc3 = exc2;
                        c167015 = c16709M32219;
                        e = exc3;
                        DialogInterfaceC0206 dialogInterfaceC02014 = dialogInterfaceC0206;
                        i19 = iM6988 ^ (-1420266632);
                        short[] sArr16 = sArr;
                        i18 = ((iM6988 ^ i16) * 7081) ^ (-673032297);
                        sArr9 = sArr16;
                        C16560 c16566 = c16562;
                        c167014 = c167011;
                        dialogInterfaceC02010 = dialogInterfaceC02014;
                        long j6 = jMo23127;
                        c16564 = c16566;
                        i20 = i8;
                        j3 = j6;
                    }
                    break;
                case -1039668975:
                case -673457408:
                    dialogInterfaceC0206 = dialogInterfaceC02010;
                    buttonM1446 = dialogInterfaceC02011.m1446();
                    sArr9 = f23598;
                    i23 = 47;
                    if (C2126.f7087) {
                        iM2566 = C0630.m2566("᩺ܰ") ^ i17;
                        i18 = ((iM2566 ^ i16) * 17933) ^ (-1477022287);
                        i = 262907623;
                    } else {
                        iM2566 = (i17 - C0630.m2566("ܺᩳ")) * 83;
                        i18 = ((iM2566 ^ i16) * 24561) ^ (-1341205705);
                        i = 797006182;
                    }
                    int i32 = iM2566 ^ i;
                    dialogInterfaceC02010 = dialogInterfaceC0206;
                    i19 = i32;
                    break;
                case -1029554722:
                case -83690880:
                    C3663.m11167(dialogInterfaceC02010);
                    dialogInterfaceC0207 = dialogInterfaceC02010;
                    c167012 = c167014;
                    c167013 = c167015;
                    sArr4 = sArr8;
                    c16563 = c16564;
                    long j7 = j3;
                    i7 = i20;
                    j2 = j7;
                    int iM6989 = (i16 - C2105.m6981("ܰܽ")) * (-125);
                    j3 = j2;
                    int i212 = ((iM6989 ^ i17) * 27449) ^ (-567934169);
                    sArr8 = sArr4;
                    c16564 = c16563;
                    c167014 = c167012;
                    dialogInterfaceC02010 = dialogInterfaceC0207;
                    i19 = iM6989 ^ (-1096849205);
                    e = e;
                    c167015 = c167013;
                    weakReference = weakReference;
                    sArr9 = sArr9;
                    i18 = i212;
                    i20 = i7;
                    j3 = j3;
                    break;
                case -957181798:
                case 1724947312:
                    sArr9 = sArr9;
                    dialogInterfaceC02010 = dialogInterfaceC02010;
                    c167014 = c167014;
                    j3 = j3;
                    c167015 = c167015;
                    sArr8 = sArr8;
                    e = e;
                    c16564 = c16564;
                    sArr7 = f23598;
                    if (C4159.f13567) {
                        iM6981 = C2105.m6981("᩸ۡ") ^ i17;
                        i2 = ((iM6981 ^ i16) * (-18107)) ^ 505383233;
                        i3 = -1360030004;
                    } else {
                        iM6981 = C0630.m2566("۠ۜ") ^ i16;
                        i2 = ((iM6981 ^ i17) * 8405) ^ (-1735181439);
                        i3 = -852308466;
                    }
                    sArr8 = sArr8;
                    c16564 = c16564;
                    sArr9 = sArr9;
                    i18 = i2;
                    c167014 = c167014;
                    dialogInterfaceC02010 = dialogInterfaceC02010;
                    viewOnClickListenerC7642 = this;
                    i19 = iM6981 ^ i3;
                    e = e;
                    c167015 = c167015;
                    j3 = j3;
                    break;
                case -903387880:
                case 1857066190:
                    i20 = 3544;
                    iM6981 = (C0630.m2566("᩻ܽ") + i16) * (-41);
                    i2 = ((iM6981 ^ i17) * (-21993)) ^ (-2008889397);
                    i3 = 1828424974;
                    sArr8 = sArr8;
                    c16564 = c16564;
                    sArr9 = sArr9;
                    i18 = i2;
                    c167014 = c167014;
                    dialogInterfaceC02010 = dialogInterfaceC02010;
                    viewOnClickListenerC7642 = this;
                    i19 = iM6981 ^ i3;
                    e = e;
                    c167015 = c167015;
                    j3 = j3;
                    break;
                case -890403730:
                case 689128401:
                    C0382.m1848();
                    if (C1420.f5096 > 0) {
                        sArr9 = sArr9;
                        dialogInterfaceC02010 = dialogInterfaceC02010;
                        c167014 = c167014;
                        j3 = j3;
                        c167015 = c167015;
                        sArr8 = sArr8;
                        e = e;
                        c16564 = c16564;
                        iM6981 = C0630.m2566("۠ۜ") ^ i16;
                        i2 = ((iM6981 ^ i17) * 8405) ^ (-1735181439);
                        i3 = -852308466;
                        sArr8 = sArr8;
                        c16564 = c16564;
                        sArr9 = sArr9;
                        i18 = i2;
                        c167014 = c167014;
                        dialogInterfaceC02010 = dialogInterfaceC02010;
                        viewOnClickListenerC7642 = this;
                        i19 = iM6981 ^ i3;
                        e = e;
                        c167015 = c167015;
                        j3 = j3;
                    } else {
                        sArr = sArr9;
                        dialogInterfaceC0206 = dialogInterfaceC02010;
                        c167011 = c167014;
                        c16562 = c16564;
                        C16709 c167018 = c167015;
                        exc2 = e;
                        c16709M32219 = c167018;
                        long j8 = j3;
                        i8 = i20;
                        jMo23127 = j8;
                        int iM69810 = C2105.m6981("֫᩺") ^ i17;
                        Exception exc4 = exc2;
                        c167015 = c16709M32219;
                        e = exc4;
                        DialogInterfaceC0206 dialogInterfaceC02015 = dialogInterfaceC0206;
                        i19 = iM69810 ^ (-1420266632);
                        short[] sArr17 = sArr;
                        i18 = ((iM69810 ^ i16) * 7081) ^ (-673032297);
                        sArr9 = sArr17;
                        C16560 c16567 = c16562;
                        c167014 = c167011;
                        dialogInterfaceC02010 = dialogInterfaceC02015;
                        long j9 = jMo23127;
                        c16564 = c16567;
                        i20 = i8;
                        j3 = j9;
                    }
                    break;
                case -833368046:
                case 1529995077:
                    sArr = sArr9;
                    dialogInterfaceC0206 = dialogInterfaceC02010;
                    C4159.m12564(buttonM49343, viewOnClickListenerC7642);
                    C2126.m7039(dialogInterfaceC02011.m1446(), viewOnClickListenerC7642);
                    C4159.m12564(C7811.m20839(dialogInterfaceC02011), viewOnClickListenerC7642);
                    if (c16564 == null) {
                        iM6983 = (C0630.m2566("ۚ᩻") + i16) * 25;
                        i6 = ((iM6983 ^ i17) * (-14519)) ^ (-1859157216);
                        i9 = -486140055;
                    } else {
                        iM6983 = (C2105.m6981("᩵֫") ^ i16) * (-109);
                        i6 = ((iM6983 ^ i17) * 23629) ^ (-1378978004);
                        i9 = -1992246560;
                    }
                    int i213 = iM6983 ^ i9;
                    dialogInterfaceC02010 = dialogInterfaceC0206;
                    i19 = i213;
                    short[] sArr18 = sArr;
                    i18 = i6;
                    sArr9 = sArr18;
                    break;
                case -744968388:
                case 1261109125:
                    viewOnClickListenerC7642.f23606.m10224(e, z2);
                    break;
                case -593422198:
                case -503380668:
                    if (RunnableC3474.f10992 > 0) {
                        dialogInterfaceC0206 = dialogInterfaceC02010;
                        iM2566 = C0630.m2566("᩺ܰ") ^ i17;
                        i18 = ((iM2566 ^ i16) * 17933) ^ (-1477022287);
                        i = 262907623;
                        int i33 = iM2566 ^ i;
                        dialogInterfaceC02010 = dialogInterfaceC0206;
                        i19 = i33;
                    } else {
                        sArr = sArr9;
                        dialogInterfaceC0206 = dialogInterfaceC02010;
                        c167011 = c167014;
                        c16562 = c16564;
                        C16709 c167019 = c167015;
                        exc2 = e;
                        c16709M32219 = c167019;
                        long j10 = j3;
                        i8 = i20;
                        jMo23127 = j10;
                        int iM69811 = C2105.m6981("֫᩺") ^ i17;
                        Exception exc5 = exc2;
                        c167015 = c16709M32219;
                        e = exc5;
                        DialogInterfaceC0206 dialogInterfaceC02016 = dialogInterfaceC0206;
                        i19 = iM69811 ^ (-1420266632);
                        short[] sArr19 = sArr;
                        i18 = ((iM69811 ^ i16) * 7081) ^ (-673032297);
                        sArr9 = sArr19;
                        C16560 c16568 = c16562;
                        c167014 = c167011;
                        dialogInterfaceC02010 = dialogInterfaceC02016;
                        long j11 = jMo23127;
                        c16564 = c16568;
                        i20 = i8;
                        j3 = j11;
                    }
                    break;
                case -583070940:
                case 1175491298:
                    sArr = sArr9;
                    dialogInterfaceC0206 = dialogInterfaceC02010;
                    dialogInterfaceC02011.m1449();
                    weakReference2 = new WeakReference(dialogInterfaceC02011);
                    if (RunnableC0588.f2309 >= 0) {
                        iM6983 = (C0630.m2566("ۗ᩻") ^ i17) * (-79);
                        i6 = ((iM6983 ^ i16) * (-22481)) ^ 500006548;
                        i9 = 335699433;
                    } else {
                        iM6983 = C0630.m2566("ۖۗ") ^ i17;
                        i6 = ((iM6983 ^ i16) * 17215) ^ 37310532;
                        i9 = 1580104729;
                    }
                    int i214 = iM6983 ^ i9;
                    dialogInterfaceC02010 = dialogInterfaceC0206;
                    i19 = i214;
                    short[] sArr110 = sArr;
                    i18 = i6;
                    sArr9 = sArr110;
                    break;
                case -439474123:
                case 2049513878:
                    if (!C0382.f1805) {
                        sArr = sArr9;
                        dialogInterfaceC0206 = dialogInterfaceC02010;
                        iM6983 = (C0630.m2566("ۗ᩻") ^ i17) * (-79);
                        i6 = ((iM6983 ^ i16) * (-22481)) ^ 500006548;
                        i9 = 335699433;
                        int i215 = iM6983 ^ i9;
                        dialogInterfaceC02010 = dialogInterfaceC0206;
                        i19 = i215;
                        short[] sArr111 = sArr;
                        i18 = i6;
                        sArr9 = sArr111;
                    } else {
                        sArr = sArr9;
                        dialogInterfaceC0206 = dialogInterfaceC02010;
                        c167011 = c167014;
                        c16562 = c16564;
                        C16709 c1670110 = c167015;
                        exc2 = e;
                        c16709M32219 = c1670110;
                        long j12 = j3;
                        i8 = i20;
                        jMo23127 = j12;
                        int iM69812 = C2105.m6981("֫᩺") ^ i17;
                        Exception exc6 = exc2;
                        c167015 = c16709M32219;
                        e = exc6;
                        DialogInterfaceC0206 dialogInterfaceC02017 = dialogInterfaceC0206;
                        i19 = iM69812 ^ (-1420266632);
                        short[] sArr112 = sArr;
                        i18 = ((iM69812 ^ i16) * 7081) ^ (-673032297);
                        sArr9 = sArr112;
                        C16560 c16569 = c16562;
                        c167014 = c167011;
                        dialogInterfaceC02010 = dialogInterfaceC02017;
                        long j13 = jMo23127;
                        c16564 = c16569;
                        i20 = i8;
                        j3 = j13;
                    }
                    break;
                case -368210488:
                case 1979396780:
                    dialogInterfaceC02010 = (DialogInterfaceC0206) weakReference.get();
                    if (dialogInterfaceC02010 == null) {
                        dialogInterfaceC0207 = dialogInterfaceC02010;
                        c167012 = c167014;
                        c167013 = c167015;
                        sArr4 = sArr8;
                        c16563 = c16564;
                        long j14 = j3;
                        i7 = i20;
                        j2 = j14;
                        int iM69813 = (i16 - C2105.m6981("ܰܽ")) * (-125);
                        j3 = j2;
                        int i216 = ((iM69813 ^ i17) * 27449) ^ (-567934169);
                        sArr8 = sArr4;
                        c16564 = c16563;
                        c167014 = c167012;
                        dialogInterfaceC02010 = dialogInterfaceC0207;
                        i19 = iM69813 ^ (-1096849205);
                        e = e;
                        c167015 = c167013;
                        weakReference = weakReference;
                        sArr9 = sArr9;
                        i18 = i216;
                        i20 = i7;
                        j3 = j3;
                    } else {
                        int iM2569 = (C0630.m2566("ۜ᩸") ^ i17) * (-117);
                        sArr = sArr9;
                        i6 = ((iM2569 ^ i16) * 14319) ^ 1565788089;
                        i19 = iM2569 ^ (-743962509);
                        short[] sArr113 = sArr;
                        i18 = i6;
                        sArr9 = sArr113;
                    }
                    break;
                case -156237249:
                case 546544642:
                    C0050.m940();
                    sArr = sArr9;
                    dialogInterfaceC0206 = dialogInterfaceC02010;
                    c167011 = c167014;
                    c16562 = c16564;
                    C16709 c1670111 = c167015;
                    exc2 = e;
                    c16709M32219 = c1670111;
                    long j15 = j3;
                    i8 = i20;
                    jMo23127 = j15;
                    int iM69814 = C2105.m6981("֫᩺") ^ i17;
                    Exception exc7 = exc2;
                    c167015 = c16709M32219;
                    e = exc7;
                    DialogInterfaceC0206 dialogInterfaceC02018 = dialogInterfaceC0206;
                    i19 = iM69814 ^ (-1420266632);
                    short[] sArr114 = sArr;
                    i18 = ((iM69814 ^ i16) * 7081) ^ (-673032297);
                    sArr9 = sArr114;
                    C16560 c165610 = c16562;
                    c167014 = c167011;
                    dialogInterfaceC02010 = dialogInterfaceC02018;
                    long j16 = jMo23127;
                    c16564 = c165610;
                    i20 = i8;
                    j3 = j16;
                    break;
                case 248388485:
                case 1229277358:
                    exc2 = e;
                    i8 = i20;
                    sArr = sArr9;
                    dialogInterfaceC0206 = dialogInterfaceC02010;
                    c167011 = c167014;
                    short[] sArr20 = sArr8;
                    c16562 = c16564;
                    viewOnClickListenerC7642.f23603 = c167011;
                    jMo23127 = abstractC15440.mo23127();
                    c16709M32219 = C13265.m32219(C0483.m2134(c167011));
                    if (C1128.m3851() <= 0) {
                        sArr8 = sArr20;
                        int iM69815 = C2105.m6981("֫᩺") ^ i17;
                        Exception exc8 = exc2;
                        c167015 = c16709M32219;
                        e = exc8;
                        DialogInterfaceC0206 dialogInterfaceC02019 = dialogInterfaceC0206;
                        i19 = iM69815 ^ (-1420266632);
                        short[] sArr115 = sArr;
                        i18 = ((iM69815 ^ i16) * 7081) ^ (-673032297);
                        sArr9 = sArr115;
                        C16560 c165611 = c16562;
                        c167014 = c167011;
                        dialogInterfaceC02010 = dialogInterfaceC02019;
                        long j17 = jMo23127;
                        c16564 = c165611;
                        i20 = i8;
                        j3 = j17;
                    } else {
                        int iM25610 = C0630.m2566("᩺ۨ") ^ i16;
                        sArr8 = sArr20;
                        i18 = ((iM25610 ^ i17) * 19423) ^ 912303051;
                        e = exc2;
                        c167015 = c16709M32219;
                        i19 = iM25610 ^ 245493504;
                        sArr9 = sArr;
                        c167014 = c167011;
                        dialogInterfaceC02010 = dialogInterfaceC0206;
                        c16564 = c16562;
                        i20 = i8;
                        j3 = jMo23127;
                    }
                    break;
                case 406734573:
                case 1150886581:
                    if (C22628.f73083 <= 0) {
                        sArr2 = sArr9;
                        dialogInterfaceC0208 = dialogInterfaceC02010;
                        c16709 = c167014;
                        j = j3;
                        c167010 = c167015;
                        sArr3 = sArr8;
                        exc = e;
                        c16560 = c16564;
                        iM6982 = (C2105.m6981("ۢۧ") + i16) * 23;
                        c16561 = c16560;
                        i4 = ((iM6982 ^ i17) * (-3139)) ^ (-1815840251);
                        i5 = 592242609;
                        int i217 = iM6982 ^ i5;
                        sArr8 = sArr3;
                        c16564 = c16561;
                        sArr9 = sArr2;
                        i18 = i4;
                        e = exc;
                        c167015 = c167010;
                        j3 = j;
                        c167014 = c16709;
                        dialogInterfaceC02010 = dialogInterfaceC0208;
                        i19 = i217;
                    } else {
                        sArr = sArr9;
                        dialogInterfaceC0206 = dialogInterfaceC02010;
                        iM6983 = C2105.m6981("֨ۙ") ^ i16;
                        i6 = ((iM6983 ^ i17) * 8231) ^ 1885764329;
                        i9 = 822093643;
                        int i218 = iM6983 ^ i9;
                        dialogInterfaceC02010 = dialogInterfaceC0206;
                        i19 = i218;
                        short[] sArr116 = sArr;
                        i18 = i6;
                        sArr9 = sArr116;
                    }
                    break;
                case 761169931:
                case 924816012:
                    sArr = sArr9;
                    C16709 c167020 = c167015;
                    Exception exc9 = e;
                    dialogInterfaceC02011 = viewOnClickListenerC7642.f23605;
                    dialogInterfaceC02011.m1441(z ^ z3);
                    C5088.m14637(dialogInterfaceC02011);
                    int iM25611 = (C0630.m2566("ۡۘ") ^ i16) * 65;
                    i6 = ((iM25611 ^ i17) * (-10463)) ^ (-222488965);
                    sArr8 = sArr8;
                    c16564 = c16564;
                    c167014 = c167014;
                    dialogInterfaceC02010 = dialogInterfaceC02010;
                    i19 = iM25611 ^ (-676633548);
                    e = exc9;
                    c167015 = c167020;
                    j3 = j3;
                    short[] sArr117 = sArr;
                    i18 = i6;
                    sArr9 = sArr117;
                    break;
                case 1175279732:
                case 1492796722:
                    break;
                case 1373666510:
                case 1655150944:
                    dialogInterfaceC0209 = dialogInterfaceC02010;
                    sArr5 = sArr9;
                    sArr6 = sArr8;
                    z2 = false;
                    iM2567 = C0630.m2566("ܰۤ") ^ i17;
                    i10 = ((iM2567 ^ i16) * (-28625)) ^ 58676869;
                    i11 = 1838269681;
                    int i219 = iM2567 ^ i11;
                    sArr8 = sArr6;
                    DialogInterfaceC0206 dialogInterfaceC020110 = dialogInterfaceC0209;
                    i19 = i219;
                    sArr9 = sArr5;
                    i18 = i10;
                    dialogInterfaceC02010 = dialogInterfaceC020110;
                    break;
                case 1927460928:
                case 2061224306:
                    C1047.m3599();
                    if (C3432.f10845 < 0) {
                        sArr = sArr9;
                        dialogInterfaceC0206 = dialogInterfaceC02010;
                        iM6983 = C2105.m6981("֨ۙ") ^ i16;
                        i6 = ((iM6983 ^ i17) * 8231) ^ 1885764329;
                        i9 = 822093643;
                        int i2110 = iM6983 ^ i9;
                        dialogInterfaceC02010 = dialogInterfaceC0206;
                        i19 = i2110;
                        short[] sArr118 = sArr;
                        i18 = i6;
                        sArr9 = sArr118;
                    } else {
                        sArr9 = sArr9;
                        dialogInterfaceC02010 = dialogInterfaceC02010;
                        c167014 = c167014;
                        j3 = j3;
                        c167015 = c167015;
                        sArr8 = sArr8;
                        e = e;
                        c16564 = c16564;
                        iM6981 = C0630.m2566("۠ۜ") ^ i16;
                        i2 = ((iM6981 ^ i17) * 8405) ^ (-1735181439);
                        i3 = -852308466;
                        sArr8 = sArr8;
                        c16564 = c16564;
                        sArr9 = sArr9;
                        i18 = i2;
                        c167014 = c167014;
                        dialogInterfaceC02010 = dialogInterfaceC02010;
                        viewOnClickListenerC7642 = this;
                        i19 = iM6981 ^ i3;
                        e = e;
                        c167015 = c167015;
                        j3 = j3;
                    }
                    break;
                default:
                    if (!C0483.m2124(dialogInterfaceC02010)) {
                        dialogInterfaceC0207 = dialogInterfaceC02010;
                        c167012 = c167014;
                        c167013 = c167015;
                        sArr4 = sArr8;
                        c16563 = c16564;
                        long j18 = j3;
                        i7 = i20;
                        j2 = j18;
                        int iM69816 = (i16 - C2105.m6981("ܰܽ")) * (-125);
                        j3 = j2;
                        int i2111 = ((iM69816 ^ i17) * 27449) ^ (-567934169);
                        sArr8 = sArr4;
                        c16564 = c16563;
                        c167014 = c167012;
                        dialogInterfaceC02010 = dialogInterfaceC0207;
                        i19 = iM69816 ^ (-1096849205);
                        e = e;
                        c167015 = c167013;
                        weakReference = weakReference;
                        sArr9 = sArr9;
                        i18 = i2111;
                        i20 = i7;
                        j3 = j3;
                    } else {
                        iM2566 = (C0630.m2566("ۘ᩹") + i16) * 115;
                        dialogInterfaceC0206 = dialogInterfaceC02010;
                        i18 = ((iM2566 ^ i17) * (-10039)) ^ 593948261;
                        i = 1157551011;
                        int i34 = iM2566 ^ i;
                        dialogInterfaceC02010 = dialogInterfaceC0206;
                        i19 = i34;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20433(ViewOnClickListenerC7642 viewOnClickListenerC7642) {
        boolean z = false;
        DialogInterfaceC0206 dialogInterfaceC0206 = null;
        int i = -966708708;
        int i2 = ServiceConnectionC3453.f10921;
        int i3 = C0422.f1886;
        int iM2566 = (i3 - C0630.m2566("᩻ۜ")) * (-75);
        int i4 = ((iM2566 ^ i2) * (-30335)) ^ (-1629533302);
        int i5 = 2013340262;
        while (true) {
            i = ((((i ^ i2) * 5093) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2031008269:
                case -428184257:
                    dialogInterfaceC0206 = viewOnClickListenerC7642.f23605;
                    if (C0714.m2805()) {
                        iM2566 = C0630.m2566("ۙ۟") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-20479)) ^ (-489965931);
                        i5 = 1092058663;
                    } else {
                        iM2566 = C0630.m2566("ܳ֫") ^ i2;
                        i4 = ((iM2566 ^ i3) * 18537) ^ (-51889149);
                        i5 = -1143343182;
                    }
                    break;
                case -1954871887:
                case -174188438:
                    AbstractC2021.m6574();
                    C3663.m11168();
                    break;
                case -1714439332:
                case -460354153:
                    viewOnClickListenerC7642.f23601 = z;
                    if (C0630.m2564()) {
                        iM2566 = (C0630.m2566("ۡܶ") + i2) * 65;
                        i4 = ((iM2566 ^ i3) * 27711) ^ 936258823;
                        i5 = -558673073;
                    } else {
                        iM2566 = C0630.m2566("ܽᩳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-30067)) ^ 147461431;
                        i5 = 1778797141;
                    }
                    break;
                case -1429836350:
                case 1509746176:
                    C1504.m5172(dialogInterfaceC0206);
                    if (C0483.f2088 < 0) {
                        C4263.m12821(new C13991(viewOnClickListenerC7642));
                    }
                    iM2566 = (C0630.m2566("֫ܰ") ^ i3) * (-95);
                    i4 = ((iM2566 ^ i2) * 15075) ^ (-2020631744);
                    i5 = 961826662;
                    break;
                case -1178583867:
                case -770727778:
                    if (C0382.f1805) {
                        iM2566 = (C2105.m6981("֡ۡ") + i3) * 43;
                        i4 = ((iM2566 ^ i2) * 1095) ^ (-56794730);
                        i5 = -886229540;
                    } else {
                        iM2566 = C0630.m2566("ܳ֫") ^ i2;
                        i4 = ((iM2566 ^ i3) * 18537) ^ (-51889149);
                        i5 = -1143343182;
                    }
                    break;
                case -1122257592:
                case 1462691354:
                    C7106.m19120();
                    if (C4075.f12947 >= 0) {
                        iM2566 = (C0630.m2566("֫ܰ") ^ i3) * (-95);
                        i4 = ((iM2566 ^ i2) * 15075) ^ (-2020631744);
                        i5 = 961826662;
                    } else {
                        iM2566 = (C0630.m2566("ۡܶ") + i2) * 65;
                        i4 = ((iM2566 ^ i3) * 27711) ^ 936258823;
                        i5 = -558673073;
                    }
                    break;
                case -1104431223:
                case 842126147:
                    if (C11340.f33930 >= 0) {
                        iM2566 = C0630.m2566("ܳ֫") ^ i2;
                        i4 = ((iM2566 ^ i3) * 18537) ^ (-51889149);
                        i5 = -1143343182;
                    } else {
                        iM2566 = C2105.m6981("ۤۨ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-17735)) ^ (-1326048683);
                        i5 = 447500976;
                    }
                    break;
                case -1093228983:
                case -229786354:
                    if (C4263.f13799 <= 0) {
                        iM2566 = C2105.m6981("ۛ᩹") ^ i3;
                        i4 = ((iM2566 ^ i2) * 3135) ^ 1739796026;
                        i5 = 1322421133;
                    } else {
                        iM2566 = (C2105.m6981("᩶ܰ") ^ i2) * (-33);
                        i4 = ((iM2566 ^ i3) * 15519) ^ 253156308;
                        i5 = -1666327302;
                    }
                    break;
                case -872103386:
                case 418960540:
                    z = true;
                    if (C3432.m10477() <= 0) {
                        iM2566 = (i2 - C0630.m2566("۫ᩴ")) * 127;
                        i4 = ((iM2566 ^ i3) * 17951) ^ (-684831732);
                        i5 = -240440141;
                    } else {
                        iM2566 = (C2105.m6981("᩵᩸") ^ i2) * (-25);
                        i4 = ((iM2566 ^ i3) * 3733) ^ 1717050878;
                        i5 = -299336922;
                    }
                    break;
                case -388191156:
                case 1882158385:
                    if (C3019.f9544 >= 0) {
                        iM2566 = C0630.m2566("ܳ֫") ^ i2;
                        i4 = ((iM2566 ^ i3) * 18537) ^ (-51889149);
                        i5 = -1143343182;
                    } else {
                        iM2566 = (C2105.m6981("ۢۖ") ^ i2) * (-127);
                        i4 = ((iM2566 ^ i3) * 21661) ^ 1940014672;
                        i5 = 938947017;
                    }
                    break;
                case -113537278:
                case 2018086142:
                    C2520.m8026();
                    if (C0422.f1886 > 0) {
                        iM2566 = C2105.m6981("ۛ᩹") ^ i3;
                        i4 = ((iM2566 ^ i2) * 3135) ^ 1739796026;
                        i5 = 1322421133;
                    } else {
                        iM2566 = (i2 - C0630.m2566("۫ᩴ")) * 127;
                        i4 = ((iM2566 ^ i3) * 17951) ^ (-684831732);
                        i5 = -240440141;
                    }
                    break;
                case 38260021:
                case 301701741:
                    if (C0422.m1963()) {
                        iM2566 = (C2105.m6981("᩵᩻") + i3) * (-83);
                        i4 = ((iM2566 ^ i2) * 12011) ^ 793263294;
                        i5 = 1416650898;
                    } else {
                        iM2566 = (C0630.m2566("ۡܶ") + i2) * 65;
                        i4 = ((iM2566 ^ i3) * 27711) ^ 936258823;
                        i5 = -558673073;
                    }
                    break;
                case 808406862:
                case 2132808266:
                    C3746.m11369();
                    C1773.m5908();
                    iM2566 = (C0630.m2566("ۡܶ") + i2) * 65;
                    i4 = ((iM2566 ^ i3) * 27711) ^ 936258823;
                    i5 = -558673073;
                    break;
                case 1446585970:
                case 1454012281:
                    C2958.m9034();
                    if (!C2272.m7503()) {
                        iM2566 = (i2 - C0630.m2566("۫ᩴ")) * 127;
                        i4 = ((iM2566 ^ i3) * 17951) ^ (-684831732);
                        i5 = -240440141;
                    } else {
                        iM2566 = (C0630.m2566("ۡܶ") + i2) * 65;
                        i4 = ((iM2566 ^ i3) * 27711) ^ 936258823;
                        i5 = -558673073;
                    }
                    break;
                default:
                    if (RunnableC1108.f4040) {
                        iM2566 = C0630.m2566("ܽۙ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-17139)) ^ (-1746442830);
                        i5 = -891026269;
                    } else {
                        iM2566 = C0630.m2566("ܳ֫") ^ i2;
                        i4 = ((iM2566 ^ i3) * 18537) ^ (-51889149);
                        i5 = -1143343182;
                    }
                    break;
            }
            return;
        }
    }
}
