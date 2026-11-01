package p067l;

import android.R;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import com.umeng.analytics.pro.C0719o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.lang.ref.WeakReference;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۟ᩳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J3Z2 */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC9632 implements View.OnClickListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ۗۙۡ, reason: not valid java name and contains not printable characters */
    private static final short[] f82063 = {785, -13729, 13968, -7645, -5464, -8169, -11377, -10212, 15803, 11249, 6613, 12157, 12149, 12148, 18363, 24269, 21685, 29761, -16918, -18145, 32104, -18680, 24373, 31995, -20510, -23167, 5437, 26452, 26463, 26456, 26392, 26459, 26434, 26392, 26438, 26458, 26435, 26449, 26463, 26456, 26392, 26437, 26447, 26437, 26434, 26451, 26459, -1955, 2546, 12517};

    /* JADX INFO: renamed from: ۛ */
    public static WeakReference f26513;

    /* JADX INFO: renamed from: ۗ */
    public AbstractC17043 f26514;

    /* JADX INFO: renamed from: ۙ */
    public boolean f26515;

    /* JADX INFO: renamed from: ۤ */
    public C18107 f26516;

    /* JADX INFO: renamed from: ۫ */
    public C18249 f26517;

    /* JADX INFO: renamed from: ۬ */
    public C16317 f26518;

    /* JADX INFO: renamed from: ᩶ */
    public DialogInterfaceC2564 f26519;

    /* JADX INFO: renamed from: ᩸ */
    public AbstractActivityC5549 f26520;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f26521;

    public ViewOnClickListenerC9632(C18107 c18107) {
        this(C1964.m56594(c18107), c18107);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C18249 c18249 = null;
        int i = -781558447;
        int i2 = C0863.f81833;
        int i3 = C1046.f81962;
        int iM55979 = C0946.m55979("᩵᩷") ^ i3;
        int i4 = ((iM55979 ^ i2) * 8593) ^ 110675718;
        int i5 = 239849695;
        while (true) {
            i = ((((i ^ i2) * (-21235)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2099360168:
                case 1430417536:
                    C1012.m56134();
                    iM55979 = C0946.m55979("᩻ܶ") ^ i3;
                    i4 = ((iM55979 ^ i2) * (-8029)) ^ 665493166;
                    i5 = -1971523956;
                    break;
                case -1801244882:
                case 1918379310:
                    C0955.m56027(this.f26520);
                    iM55979 = (C0873.m55680("᩹᩹") + i2) * (-61);
                    i4 = ((iM55979 ^ i3) * (-20899)) ^ 564793428;
                    i5 = -800679903;
                    break;
                case -1768873909:
                case -1148975715:
                    C1044.m56286();
                    if (C0946.f81894 != 0) {
                        iM55979 = (C0873.m55680("ۚۘ") + i3) * 89;
                        i4 = ((iM55979 ^ i2) * (-27995)) ^ 1763076882;
                        i5 = 2035834672;
                    } else {
                        iM55979 = C0946.m55979("᩻ܶ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-8029)) ^ 665493166;
                        i5 = -1971523956;
                    }
                    break;
                case -1315400265:
                case 675798080:
                    if (C0967.f81910 >= 0) {
                        iM55979 = (C0873.m55680("᩷ۚ") + i3) * (-97);
                        i4 = ((iM55979 ^ i2) * 19705) ^ (-1659932857);
                        i5 = 1226867414;
                    } else {
                        iM55979 = (C0873.m55680("ۛۢ") + i3) * (-127);
                        i4 = ((iM55979 ^ i2) * (-32767)) ^ 386815419;
                        i5 = 580516549;
                    }
                    break;
                case -1188134610:
                case 923117194:
                    if (C1929.f83011 != 0) {
                        iM55979 = (C0873.m55680("᩷ۚ") + i3) * (-97);
                        i4 = ((iM55979 ^ i2) * 19705) ^ (-1659932857);
                        i5 = 1226867414;
                    } else {
                        iM55979 = (C0873.m55680("ۜܿ") ^ i2) * (-97);
                        i4 = ((iM55979 ^ i3) * C0719o.a.f2918x) ^ (-1165284963);
                        i5 = -380551878;
                    }
                    break;
                case -886116958:
                case -547244542:
                    break;
                case -882389352:
                case 1484850394:
                    if (C1028.m56247() >= 0) {
                        iM55979 = (C0946.m55979("ܶۘ") ^ i2) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM55979 ^ i3) * (-17993)) ^ 707313050;
                        i5 = -1149237970;
                    } else {
                        iM55979 = (i2 - C0946.m55979("۠᩻")) * 71;
                        i4 = ((iM55979 ^ i3) * 21169) ^ (-8875734);
                        i5 = 1499837693;
                    }
                    break;
                case -767597601:
                case 1094817508:
                    if (C0873.f81841 > 0) {
                        iM55979 = (C0873.m55680("᩷ۚ") + i3) * (-97);
                        i4 = ((iM55979 ^ i2) * 19705) ^ (-1659932857);
                        i5 = 1226867414;
                    } else {
                        iM55979 = C0946.m55979("᩻ܶ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-8029)) ^ 665493166;
                        i5 = -1971523956;
                    }
                    break;
                case -753494581:
                case 390360191:
                    if (C1012.f81938 >= 0) {
                        iM55979 = C0946.m55979("᩻ܶ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-8029)) ^ 665493166;
                        i5 = -1971523956;
                    } else {
                        iM55979 = C0946.m55979("᩵ܽ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-9237)) ^ (-2144692574);
                        i5 = 1363916252;
                    }
                    break;
                case -681643318:
                case -238351845:
                    if (C0967.f81910 >= 0) {
                        iM55979 = (C0873.m55680("᩷ۚ") + i3) * (-97);
                        i4 = ((iM55979 ^ i2) * 19705) ^ (-1659932857);
                        i5 = 1226867414;
                    } else {
                        iM55979 = (C0946.m55979("ܶᩴ") ^ i2) * 45;
                        i4 = ((iM55979 ^ i3) * (-28973)) ^ (-858904322);
                        i5 = 304463986;
                    }
                    break;
                case -592033744:
                case 2042720713:
                    C0877.m55696();
                    C0992.m56107();
                    break;
                case -562193800:
                case 1534262363:
                    c18249.m41525();
                    if (this.f26515) {
                        iM55979 = (C0873.m55680("᩹᩹") + i2) * (-61);
                        i4 = ((iM55979 ^ i3) * (-20899)) ^ 564793428;
                        i5 = -800679903;
                    } else {
                        iM55979 = (C0873.m55680("ܳ᩻") + i3) * (-27);
                        i4 = ((iM55979 ^ i2) * 13429) ^ (-1130843110);
                        i5 = 805471903;
                    }
                    break;
                case -524943688:
                case 889122632:
                    if (C0892.m55749()) {
                        iM55979 = C0873.m55680("ۗܰ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 4905) ^ 791789734;
                        i5 = -1493021819;
                    } else {
                        iM55979 = (C0946.m55979("ܶۘ") ^ i2) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM55979 ^ i3) * (-17993)) ^ 707313050;
                        i5 = -1149237970;
                    }
                    break;
                case -392110796:
                case -296573796:
                    if (this.f26516 == null) {
                        iM55979 = C0873.m55680("ۗ֨") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-7715)) ^ (-1280556837);
                        i5 = -1941391970;
                    } else {
                        iM55979 = (C0873.m55680("᩹᩹") + i2) * (-61);
                        i4 = ((iM55979 ^ i3) * (-20899)) ^ 564793428;
                        i5 = -800679903;
                    }
                    break;
                case -276278423:
                case 681898240:
                    if (C1929.f83011 != 0) {
                        iM55979 = (C0873.m55680("ۚۘ") + i3) * 89;
                        i4 = ((iM55979 ^ i2) * (-27995)) ^ 1763076882;
                        i5 = 2035834672;
                    } else {
                        iM55979 = C0946.m55979("ۜ۠") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-24451)) ^ (-1316660374);
                        i5 = -128031171;
                    }
                    break;
                case 450508301:
                case 1235471797:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = (C0873.m55680("᩷ۚ") + i3) * (-97);
                        i4 = ((iM55979 ^ i2) * 19705) ^ (-1659932857);
                        i5 = 1226867414;
                    } else {
                        iM55979 = C0946.m55979("ܺۧ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-30313)) ^ (-303310252);
                        i5 = 2121108810;
                    }
                    break;
                case 809825848:
                case 1743400804:
                    c18249 = this.f26517;
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = (C0946.m55979("ܶۘ") ^ i2) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM55979 ^ i3) * (-17993)) ^ 707313050;
                        i5 = -1149237970;
                    } else {
                        iM55979 = C0946.m55979("ܺۤ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 30357) ^ (-971720417);
                        i5 = 230391830;
                    }
                    break;
                case 1812657603:
                case 1934237345:
                    if (C0873.m55678()) {
                        iM55979 = (C0873.m55680("ۚۘ") + i3) * 89;
                        i4 = ((iM55979 ^ i2) * (-27995)) ^ 1763076882;
                        i5 = 2035834672;
                    } else {
                        iM55979 = C0873.m55680("ۛ᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * 1571) ^ (-170753905);
                        i5 = -270011018;
                    }
                    break;
                default:
                    C1194.m56396();
                    if (C0992.m56107() <= 0) {
                        iM55979 = C0946.m55979("᩻ܶ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-8029)) ^ 665493166;
                        i5 = -1971523956;
                    } else {
                        iM55979 = C0946.m55979("ۨ۬") ^ i2;
                        i4 = ((iM55979 ^ i3) * 11513) ^ 1151118505;
                        i5 = -892011046;
                    }
                    break;
            }
            return;
        }
    }

    public ViewOnClickListenerC9632(AbstractActivityC5549 abstractActivityC5549) {
        this(abstractActivityC5549, null);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0122 A[PHI: r11 r12
      0x0122: PHI (r11v4 int) = (r11v3 int), (r11v2 int) binds: [B:37:0x0120, B:17:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x0122: PHI (r12v4 int) = (r12v3 int), (r12v2 int) binds: [B:37:0x0120, B:17:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x01a7 A[PHI: r6
      0x01a7: PHI (r6v7 int) = (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:82:0x01a7, B:49:0x01a5, B:17:0x009a, B:90:0x01a7] A[DONT_GENERATE, DONT_INLINE]] */
    public ViewOnClickListenerC9632(AbstractActivityC5549 abstractActivityC5549, C18107 c18107) {
        short[] sArr;
        int i;
        short[] sArr2;
        C16317 c16317;
        short[] sArr3;
        int iM55979;
        int i2;
        int i3;
        int iM55680;
        int i4;
        ViewOnClickListenerC9632 viewOnClickListenerC9632 = this;
        int i5 = ServiceConnectionC1013.f81940;
        int i6 = C0949.f81897;
        short s = f82063[0];
        int i7 = (s * 2) + 1;
        int i8 = s + 1;
        int i9 = (i8 * i8) - i7 < 0 ? 18913 : 48046;
        int iM55681 = (C0873.m55680("ܽܰ") ^ i5) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
        int i10 = ((iM55681 ^ i6) * (-30451)) ^ (-258438204);
        Object obj = null;
        String strM56386 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        int i11 = iM55681 ^ 808238961;
        int i12 = 0;
        C20671 c20671M55888 = null;
        int i13 = 0;
        int iM55682 = 0;
        int iM559710 = 0;
        int iM559711 = 0;
        int i14 = 0;
        int i15 = 0;
        C16317 c16318 = null;
        int i16 = -1167273454;
        while (true) {
            i16 = i11 ^ (i10 & (((i16 ^ i6) * 8639) >> 31));
            switch (i16) {
                case -2117795250:
                case -517490912:
                    i13 = iM559710 ^ 2125408626;
                    if (C1036.m56257() <= 0) {
                        iM55680 = (C0873.m55680("ۡ᩷") + i6) * 3;
                        i = ((iM55680 ^ i5) * (-14505)) ^ 1671249054;
                        i4 = 268067606;
                    } else {
                        iM55680 = C0873.m55680("᩻᩺") ^ i5;
                        i = ((iM55680 ^ i6) * (-31193)) ^ (-1914242641);
                        i4 = 1760726307;
                    }
                    i11 = iM55680 ^ i4;
                    i10 = i;
                    break;
                case -2080632702:
                case -882032800:
                    C0967.m56074();
                    sArr = sArr6;
                    int iM559712 = (i5 - C0946.m55979("۫᩺")) * (-95);
                    i10 = ((iM559712 ^ i6) * 20717) ^ (-195482200);
                    sArr6 = sArr;
                    i11 = iM559712 ^ 445814718;
                    viewOnClickListenerC9632 = this;
                    break;
                case -2079967476:
                case -736804868:
                    obj = null;
                    ViewOnClickListenerC0939.m55953(c20671M55888, i13, null);
                    sArr5 = f82063;
                    if (RunnableC1014.f81941 > 0) {
                        iM55680 = C0873.m55680("ܳ᩸") ^ i6;
                        i = ((iM55680 ^ i5) * (-1423)) ^ (-750979813);
                        i4 = -1918622012;
                        i11 = iM55680 ^ i4;
                        i10 = i;
                    } else {
                        sArr2 = sArr6;
                        c16317 = c16318;
                        sArr3 = sArr4;
                        iM55979 = C0873.m55680("ۚ᩷") ^ i6;
                        c16318 = c16317;
                        i2 = ((iM55979 ^ i5) * (-29389)) ^ (-1789714540);
                        i3 = -644110041;
                        int i17 = iM55979 ^ i3;
                        sArr4 = sArr3;
                        i10 = i2;
                        sArr6 = sArr2;
                        i11 = i17;
                    }
                    break;
                case -1920766983:
                case 13487068:
                    if (C0890.f81849 != 0) {
                        sArr3 = sArr4;
                        iM55979 = (C0946.m55979("ܽܺ") + i5) * (-19);
                        sArr2 = sArr6;
                        i2 = ((iM55979 ^ i6) * (-25345)) ^ (-724058127);
                        i3 = 415848949;
                        int i18 = iM55979 ^ i3;
                        sArr4 = sArr3;
                        i10 = i2;
                        sArr6 = sArr2;
                        i11 = i18;
                    } else {
                        iM55680 = (C0873.m55680("ۡ᩷") + i6) * 3;
                        i = ((iM55680 ^ i5) * (-14505)) ^ 1671249054;
                        i4 = 268067606;
                        i11 = iM55680 ^ i4;
                        i10 = i;
                    }
                    break;
                case -1521639850:
                case -1512613808:
                    C0854.m55595();
                    if (C1071.f81975 <= 0) {
                        iM55680 = (C0873.m55680("ۡ᩷") + i6) * 3;
                        i = ((iM55680 ^ i5) * (-14505)) ^ 1671249054;
                        i4 = 268067606;
                        i11 = iM55680 ^ i4;
                        i10 = i;
                    } else {
                        sArr = sArr6;
                        int iM559713 = (i5 - C0946.m55979("۫᩺")) * (-95);
                        i10 = ((iM559713 ^ i6) * 20717) ^ (-195482200);
                        sArr6 = sArr;
                        i11 = iM559713 ^ 445814718;
                        viewOnClickListenerC9632 = this;
                    }
                    break;
                case -1421020209:
                case 1270366488:
                    C1124.m56374(c20671M55888, iM559711 ^ i14, obj);
                    sArr6 = f82063;
                    i12 = 7;
                    if (!C0955.f81898) {
                        iM55680 = C0946.m55979("ۧ᩺") ^ i6;
                        i = ((iM55680 ^ i5) * 15541) ^ 1942212023;
                        i4 = -1814160160;
                        i11 = iM55680 ^ i4;
                        i10 = i;
                    } else {
                        sArr3 = sArr4;
                        iM55979 = (C0946.m55979("ܽܺ") + i5) * (-19);
                        sArr2 = sArr6;
                        i2 = ((iM55979 ^ i6) * (-25345)) ^ (-724058127);
                        i3 = 415848949;
                        int i19 = iM55979 ^ i3;
                        sArr4 = sArr3;
                        i10 = i2;
                        sArr6 = sArr2;
                        i11 = i19;
                    }
                    break;
                case -1299201972:
                case 180863903:
                    C0861.m55626();
                    C1012.m56134();
                    throw new RuntimeException();
                case -979602968:
                case 235703212:
                    sArr3 = sArr4;
                    iM559710 = C0946.m55979(C1003.m56132(sArr3, i15, 3, i9));
                    if (C0877.f81843 >= 0) {
                        iM55979 = (C0946.m55979("ܽܺ") + i5) * (-19);
                        sArr2 = sArr6;
                        i2 = ((iM55979 ^ i6) * (-25345)) ^ (-724058127);
                        i3 = 415848949;
                    } else {
                        iM55979 = (C0946.m55979("֨ܰ") ^ i6) * (-53);
                        sArr2 = sArr6;
                        i2 = ((iM55979 ^ i5) * (-20223)) ^ 1928405988;
                        i3 = -2132747340;
                    }
                    int i110 = iM55979 ^ i3;
                    sArr4 = sArr3;
                    i10 = i2;
                    sArr6 = sArr2;
                    i11 = i110;
                    break;
                case -772161316:
                case 1900986876:
                    if (C0917.m55854()) {
                        iM55680 = (C0873.m55680("ۙ֡") + i6) * (-11);
                        i = ((iM55680 ^ i5) * 23899) ^ (-100844588);
                        i4 = 208864048;
                    } else {
                        iM55680 = (C0873.m55680("ۡ᩷") + i6) * 3;
                        i = ((iM55680 ^ i5) * (-14505)) ^ 1671249054;
                        i4 = 268067606;
                    }
                    i11 = iM55680 ^ i4;
                    i10 = i;
                    break;
                case -32436693:
                case 1250451637:
                    iM55682 = 2123697004 ^ C0873.m55680(C1046.m56293(sArr6, i12, 3, i9));
                    if (C1071.f81975 > 0) {
                        iM55680 = (i5 - C0946.m55979("ۖ۬")) * 33;
                        i = ((iM55680 ^ i6) * (-13447)) ^ (-474681152);
                        i4 = -1257495711;
                        i11 = iM55680 ^ i4;
                        i10 = i;
                    } else {
                        sArr3 = sArr4;
                        iM55979 = (C0946.m55979("ܽܺ") + i5) * (-19);
                        sArr2 = sArr6;
                        i2 = ((iM55979 ^ i6) * (-25345)) ^ (-724058127);
                        i3 = 415848949;
                        int i111 = iM55979 ^ i3;
                        sArr4 = sArr3;
                        i10 = i2;
                        sArr6 = sArr2;
                        i11 = i111;
                    }
                    break;
                case 78584423:
                case 1054232251:
                    C0967.m56080(c20671M55888, iM55682, obj);
                    c20671M55888.m46714(viewOnClickListenerC9632);
                    viewOnClickListenerC9632.f26519 = c20671M55888.m46709();
                    return;
                case 547354953:
                case 570062443:
                    sArr = sArr6;
                    C16317 c16319 = c16318;
                    C0927.m55864(c20671M55888, c16319.f47952);
                    sArr4 = f82063;
                    i15 = 1;
                    if (RunnableC1014.f81941 > 0) {
                        int iM55683 = (C0873.m55680("ۘ۟") + i5) * 43;
                        i = ((iM55683 ^ i6) * 12593) ^ (-786331217);
                        c16318 = c16319;
                        sArr6 = sArr;
                        i11 = iM55683 ^ 139948565;
                        i10 = i;
                    } else {
                        c16318 = c16319;
                        int iM559714 = (i5 - C0946.m55979("۫᩺")) * (-95);
                        i10 = ((iM559714 ^ i6) * 20717) ^ (-195482200);
                        sArr6 = sArr;
                        i11 = iM559714 ^ 445814718;
                        viewOnClickListenerC9632 = this;
                    }
                    break;
                case 969679496:
                case 1318509969:
                    sArr2 = sArr6;
                    c16317 = c16318;
                    sArr3 = sArr4;
                    viewOnClickListenerC9632.f26518 = c16317;
                    c20671M55888 = C0930.m55888(abstractActivityC5549);
                    if (C1124.f82007 >= 0) {
                        iM55979 = C0873.m55680("ۚ᩷") ^ i6;
                        c16318 = c16317;
                        i2 = ((iM55979 ^ i5) * (-29389)) ^ (-1789714540);
                        i3 = -644110041;
                        int i112 = iM55979 ^ i3;
                        sArr4 = sArr3;
                        i10 = i2;
                        sArr6 = sArr2;
                        i11 = i112;
                    } else {
                        c16318 = c16317;
                        int iM559715 = (C0946.m55979("ܶ᩵") + i5) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i10 = ((iM559715 ^ i6) * 30615) ^ 1503019899;
                        sArr4 = sArr3;
                        i11 = iM559715 ^ 2043814850;
                        sArr6 = sArr2;
                    }
                    break;
                case 1425167175:
                case 1686806303:
                    strM56386 = C1194.m56386(sArr5, 4, 3, i9);
                    if (C1017.f81942 < 0) {
                        iM55680 = (C0946.m55979("ܿ᩺") + i5) * 91;
                        i = ((iM55680 ^ i6) * 22007) ^ 2146147574;
                        i4 = 1574780966;
                        i11 = iM55680 ^ i4;
                        i10 = i;
                    } else {
                        sArr3 = sArr4;
                        iM55979 = (C0946.m55979("ܽܺ") + i5) * (-19);
                        sArr2 = sArr6;
                        i2 = ((iM55979 ^ i6) * (-25345)) ^ (-724058127);
                        i3 = 415848949;
                        int i113 = iM55979 ^ i3;
                        sArr4 = sArr3;
                        i10 = i2;
                        sArr6 = sArr2;
                        i11 = i113;
                    }
                    break;
                case 1637925199:
                case 2042515328:
                    iM559711 = C0946.m55979(strM56386);
                    i14 = 2116657232;
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = (C0873.m55680("ۙ֡") + i6) * (-11);
                        i = ((iM55680 ^ i5) * 23899) ^ (-100844588);
                        i4 = 208864048;
                    } else {
                        iM55680 = (C0946.m55979("ܽ֫") + i6) * (-49);
                        i = ((iM55680 ^ i5) * 25725) ^ (-1125512357);
                        i4 = 771450132;
                    }
                    i11 = iM55680 ^ i4;
                    i10 = i;
                    break;
                default:
                    short[] sArr7 = sArr4;
                    viewOnClickListenerC9632.f26520 = abstractActivityC5549;
                    sArr = sArr6;
                    viewOnClickListenerC9632.f26516 = c18107;
                    C16317 c163110 = new C16317(abstractActivityC5549);
                    if (C1229.f82066 >= 0) {
                        c16318 = c163110;
                        sArr4 = sArr7;
                        int iM559716 = (i5 - C0946.m55979("۫᩺")) * (-95);
                        i10 = ((iM559716 ^ i6) * 20717) ^ (-195482200);
                        sArr6 = sArr;
                        i11 = iM559716 ^ 445814718;
                        viewOnClickListenerC9632 = this;
                    } else {
                        int iM55684 = (C0873.m55680("᩶۫") + i6) * (-105);
                        i10 = ((iM55684 ^ i5) * (-22255)) ^ 1063280308;
                        sArr6 = sArr;
                        viewOnClickListenerC9632 = this;
                        i11 = iM55684 ^ (-471787227);
                        c16318 = c163110;
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
    
        if (p067l.C0912.m55833() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01ac, code lost:
    
        if (p067l.C1012.f81938 >= 0) goto L39;
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
        int iM55979;
        int i2;
        int i3;
        short[] sArr2;
        int iM55680;
        int i4;
        int i5;
        short[] sArr3;
        AbstractActivityC5549 abstractActivityC5549;
        int iM55681;
        int i6;
        int i7;
        int iM559710;
        int i8;
        short[] sArr4;
        String str;
        String str2;
        StringBuilder sb2;
        int i9;
        AbstractActivityC5549 abstractActivityC55410;
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
        int iM559711;
        int i13;
        int i14;
        short[] sArr8;
        short[] sArr9;
        int i15;
        int i16;
        String strM56325;
        String str6;
        int iM559712;
        int i17;
        int i18;
        short[] sArr10;
        int i19;
        StringBuilder sb4;
        String strM55591;
        int i20;
        String str7;
        String str8;
        int i21;
        int i22;
        short[] sArr11;
        int i23;
        StringBuilder sb5;
        String str9;
        C20671 c20671M55888;
        int iM559713;
        C20671 c20671;
        int i24;
        short[] sArr12;
        short[] sArr13;
        int iM559714;
        int i25;
        int i26;
        int iM559715;
        int i27;
        ViewOnClickListenerC9632 viewOnClickListenerC9632 = this;
        boolean z = false;
        String str10 = null;
        String strM55639 = null;
        String strM55635 = null;
        short s = 0;
        int i28 = 0;
        int i29 = -2136653081;
        int i30 = C0894.f81854;
        int i31 = C0949.f81897;
        int iM55682 = C0873.m55680("᩺ܽ") ^ i30;
        int i32 = ((iM55682 ^ i31) * 30981) ^ 1289192934;
        int i33 = iM55682 ^ 1499849770;
        C18107 c18107 = null;
        AbstractActivityC5549 abstractActivityC55411 = null;
        String str11 = null;
        String str12 = null;
        StringBuilder sbM21133 = null;
        String str13 = null;
        StringBuilder sbM21134 = null;
        Object[] objArr = null;
        short[] sArr14 = null;
        short[] sArr15 = null;
        short[] sArr16 = null;
        int i34 = 0;
        int iM559716 = 0;
        int i35 = 0;
        int i36 = 0;
        char c = 0;
        int i37 = 0;
        int iM41556 = 0;
        DialogInterfaceC2564 dialogInterfaceC2564 = null;
        char c2 = 0;
        Intent intent = null;
        short[] sArr17 = null;
        int i38 = 0;
        String str14 = null;
        int i39 = 0;
        Throwable th2 = null;
        C20671 c20672 = null;
        C18249 c18249M34303 = null;
        DialogInterfaceOnClickListenerC5138 dialogInterfaceOnClickListenerC5138 = null;
        while (true) {
            i29 = i33 ^ (i32 & (((i29 ^ i31) * 17437) >> 31));
            switch (i29) {
                case -2136324670:
                case -214823111:
                    sArr3 = sArr16;
                    abstractActivityC5549 = abstractActivityC55411;
                    int i40 = i37;
                    i34 = i34;
                    c18107 = c18107;
                    str14 = str14;
                    i = i40;
                    StringBuilder sb6 = sbM21133;
                    th2 = th2;
                    str11 = str11;
                    sb = sb6;
                    short[] sArr18 = sArr14;
                    str12 = str12;
                    sArr17 = sArr17;
                    sArr = sArr18;
                    Intent intent2 = new Intent(abstractActivityC5549, (Class<?>) ActivityC24364.class);
                    if (c18107 != null) {
                        intent = intent2;
                        iM55681 = C0873.m55680("᩵۫") ^ i30;
                        i6 = ((iM55681 ^ i31) * (-17179)) ^ 1793607742;
                        i7 = -866734511;
                        int i41 = iM55681 ^ i7;
                        abstractActivityC55411 = abstractActivityC5549;
                        sArr16 = sArr3;
                        i33 = i41;
                        i32 = i6;
                        String str15 = str14;
                        c18107 = c18107;
                        i34 = i34;
                        i37 = i;
                        str14 = str15;
                        StringBuilder sb7 = sb;
                        str11 = str11;
                        th2 = th2;
                        sbM21133 = sb7;
                        short[] sArr19 = sArr;
                        sArr17 = sArr17;
                        str12 = str12;
                        sArr14 = sArr19;
                    } else {
                        iM559710 = (C0946.m55979("᩶᩺") + i31) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        intent = intent2;
                        i32 = ((iM559710 ^ i30) * 11385) ^ (-2049759749);
                        i8 = 2039220461;
                        int i42 = iM559710 ^ i8;
                        abstractActivityC55411 = abstractActivityC5549;
                        sArr16 = sArr3;
                        i33 = i42;
                        String str16 = str14;
                        c18107 = c18107;
                        i34 = i34;
                        i37 = i;
                        str14 = str16;
                        StringBuilder sb8 = sb;
                        str11 = str11;
                        th2 = th2;
                        sbM21133 = sb8;
                        short[] sArr110 = sArr;
                        sArr17 = sArr17;
                        str12 = str12;
                        sArr14 = sArr110;
                    }
                    break;
                case -2064019042:
                case -880201771:
                    if (!C1929.m56553()) {
                        iM559715 = (i30 - C0873.m55680("ᩳ۬")) * 7;
                        i25 = ((iM559715 ^ i31) * 8175) ^ 1054128002;
                        i27 = -497631003;
                        i33 = iM559715 ^ i27;
                        i32 = i25;
                    }
                    sArr12 = sArr16;
                    sArr13 = sArr14;
                    iM559714 = (i31 - C0873.m55680("ۡ᩺")) * 73;
                    i25 = ((iM559714 ^ i30) * (-16111)) ^ 1486681890;
                    i26 = -554019951;
                    int i43 = iM559714 ^ i26;
                    sArr14 = sArr13;
                    sArr16 = sArr12;
                    i33 = i43;
                    i32 = i25;
                    break;
                case -1894686526:
                case -779746259:
                    i = i37;
                    sb = sbM21133;
                    sArr = sArr14;
                    i35 = 52448;
                    iM55979 = (C0946.m55979("֨ܺ") ^ i31) * 23;
                    i2 = ((iM55979 ^ i30) * 28029) ^ 1324631277;
                    i3 = -977910770;
                    i5 = iM55979 ^ i3;
                    abstractActivityC55411 = abstractActivityC55411;
                    sArr16 = sArr16;
                    i33 = i5;
                    i32 = i2;
                    viewOnClickListenerC9632 = this;
                    String str17 = str14;
                    c18107 = c18107;
                    i34 = i34;
                    i37 = i;
                    str14 = str17;
                    StringBuilder sb9 = sb;
                    str11 = str11;
                    th2 = th2;
                    sbM21133 = sb9;
                    short[] sArr111 = sArr;
                    sArr17 = sArr17;
                    str12 = str12;
                    sArr14 = sArr111;
                    break;
                case -1742198627:
                case 2051542494:
                    sArr7 = sArr16;
                    str4 = str14;
                    StringBuilder sb10 = sbM21133;
                    sArr5 = sArr17;
                    i11 = i37;
                    sArr6 = sArr14;
                    i12 = i34;
                    String strM41522 = c18249M34303.m41522();
                    String strM41523 = viewOnClickListenerC9632.f26517.m41522();
                    if (C0906.m55806(strM41522, strM41523)) {
                        int iM55683 = (C0873.m55680("᩹۬") + i30) * 49;
                        i32 = ((iM55683 ^ i31) * 5575) ^ 1726266166;
                        sArr14 = sArr6;
                        sArr17 = sArr5;
                        str12 = strM41523;
                        i34 = i12;
                        i37 = i11;
                        str14 = str4;
                        sbM21133 = sb10;
                        sArr16 = sArr7;
                        i33 = iM55683 ^ 339752446;
                        str11 = strM41522;
                    } else {
                        sb3 = sb10;
                        str3 = strM41523;
                        str5 = strM41522;
                        iM559711 = C0873.m55680("ۨܿ") ^ i30;
                        i13 = ((iM559711 ^ i31) * 3917) ^ 992223519;
                        i14 = 1637373130;
                        int i44 = iM559711 ^ i14;
                        sbM21133 = sb3;
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
                    StringBuilder sb11 = sbM21133;
                    th2 = th2;
                    str11 = str11;
                    sb = sb11;
                    short[] sArr21 = sArr14;
                    str12 = str12;
                    sArr17 = sArr17;
                    sArr = sArr21;
                    int iM55718 = C0882.m55718(view);
                    DialogInterfaceC2564 dialogInterfaceC2565 = viewOnClickListenerC9632.f26519;
                    c18107 = viewOnClickListenerC9632.f26516;
                    AbstractActivityC5549 abstractActivityC55412 = viewOnClickListenerC9632.f26520;
                    switch (iM55718) {
                        case R.id.button1:
                            iM55680 = C0873.m55680("ۨۡ") ^ i30;
                            i2 = ((iM55680 ^ i31) * (-26109)) ^ 2001192385;
                            i4 = -724630776;
                            break;
                        case R.id.button2:
                            iM55680 = (C0946.m55979("ܶۡ") ^ i31) * 75;
                            i2 = ((iM55680 ^ i30) * 7699) ^ 309744118;
                            i4 = -1058848138;
                            break;
                        case R.id.button3:
                            iM55680 = (C0873.m55680("֡۫") ^ i30) * 47;
                            i2 = ((iM55680 ^ i31) * (-12037)) ^ 1620705618;
                            i4 = 169500596;
                            break;
                        default:
                            iM55680 = (i31 - C0946.m55979("᩺ۧ")) * (-25);
                            i2 = ((iM55680 ^ i30) * (-3777)) ^ 2030081649;
                            i4 = 246678688;
                            break;
                    }
                    i5 = iM55680 ^ i4;
                    dialogInterfaceC2564 = dialogInterfaceC2565;
                    abstractActivityC55411 = abstractActivityC55412;
                    sArr16 = sArr16;
                    i33 = i5;
                    i32 = i2;
                    viewOnClickListenerC9632 = this;
                    String str18 = str14;
                    c18107 = c18107;
                    i34 = i34;
                    i37 = i;
                    str14 = str18;
                    StringBuilder sb12 = sb;
                    str11 = str11;
                    th2 = th2;
                    sbM21133 = sb12;
                    short[] sArr112 = sArr;
                    sArr17 = sArr17;
                    str12 = str12;
                    sArr14 = sArr112;
                    break;
                case -1566003615:
                case 118626319:
                    ViewOnClickListenerC0939.m55953(c20672, C0873.m55680(C0937.m55921(sArr15, i34, i36, i35)) ^ 2119531682, dialogInterfaceOnClickListenerC5138);
                    sArr16 = f82063;
                    i38 = 23;
                    i39 = 3;
                    if (C0992.f81922 >= 0) {
                        iM559715 = (C0946.m55979("֫ܿ") ^ i30) * (-53);
                        i25 = ((iM559715 ^ i31) * (-21655)) ^ (-281073816);
                        i27 = -395231854;
                    } else {
                        iM559715 = C0946.m55979("᩸᩹") ^ i31;
                        i25 = ((iM559715 ^ i30) * (-6371)) ^ 509002299;
                        i27 = -1332923704;
                    }
                    i33 = iM559715 ^ i27;
                    i32 = i25;
                    break;
                case -1487130918:
                case -736174784:
                    sArr16 = sArr16;
                    abstractActivityC55411 = abstractActivityC55411;
                    int i45 = i37;
                    i34 = i34;
                    c18107 = c18107;
                    str14 = str14;
                    i = i45;
                    StringBuilder sb13 = sbM21133;
                    th2 = th2;
                    str11 = str11;
                    sb = sb13;
                    short[] sArr22 = sArr14;
                    str12 = str12;
                    sArr17 = sArr17;
                    sArr = sArr22;
                    s = f82063[10];
                    i28 = s + 1;
                    if (C1404.f82149 < 0) {
                        iM55979 = (C0946.m55979("ۖ۬") ^ i31) * (-65);
                        i2 = ((iM55979 ^ i30) * (-15259)) ^ (-446392249);
                        i3 = 1080833138;
                        i5 = iM55979 ^ i3;
                        abstractActivityC55411 = abstractActivityC55411;
                        sArr16 = sArr16;
                        i33 = i5;
                        i32 = i2;
                        viewOnClickListenerC9632 = this;
                        String str19 = str14;
                        c18107 = c18107;
                        i34 = i34;
                        i37 = i;
                        str14 = str19;
                        StringBuilder sb14 = sb;
                        str11 = str11;
                        th2 = th2;
                        sbM21133 = sb14;
                        short[] sArr113 = sArr;
                        sArr17 = sArr17;
                        str12 = str12;
                        sArr14 = sArr113;
                    } else {
                        sArr2 = sArr17;
                        int iM559717 = (C0946.m55979("᩻֨") ^ i31) * (-89);
                        int i46 = ((iM559717 ^ i30) * (-11415)) ^ 494937566;
                        abstractActivityC55411 = abstractActivityC55411;
                        str12 = str12;
                        sArr16 = sArr16;
                        i33 = iM559717 ^ 764135687;
                        sArr14 = sArr;
                        viewOnClickListenerC9632 = this;
                        sArr17 = sArr2;
                        i32 = i46;
                        String str20 = str14;
                        c18107 = c18107;
                        i34 = i34;
                        i37 = i;
                        str14 = str20;
                        StringBuilder sb15 = sb;
                        str11 = str11;
                        th2 = th2;
                        sbM21133 = sb15;
                    }
                    break;
                case -1466670469:
                case 1505221272:
                    sArr3 = sArr16;
                    abstractActivityC5549 = abstractActivityC55411;
                    int i47 = i37;
                    i34 = i34;
                    c18107 = c18107;
                    str14 = str14;
                    i = i47;
                    StringBuilder sb16 = sbM21133;
                    th2 = th2;
                    str11 = str11;
                    sb = sb16;
                    short[] sArr23 = sArr14;
                    str12 = str12;
                    sArr17 = sArr17;
                    sArr = sArr23;
                    c2 = 0;
                    z = true;
                    iM55681 = C0873.m55680("ۧ۬") ^ i30;
                    i6 = ((iM55681 ^ i31) * (-5305)) ^ (-1847569546);
                    i7 = -961241877;
                    int i48 = iM55681 ^ i7;
                    abstractActivityC55411 = abstractActivityC5549;
                    sArr16 = sArr3;
                    i33 = i48;
                    i32 = i6;
                    String str110 = str14;
                    c18107 = c18107;
                    i34 = i34;
                    i37 = i;
                    str14 = str110;
                    StringBuilder sb17 = sb;
                    str11 = str11;
                    th2 = th2;
                    sbM21133 = sb17;
                    short[] sArr114 = sArr;
                    sArr17 = sArr17;
                    str12 = str12;
                    sArr14 = sArr114;
                    break;
                case -1430461029:
                case 207987430:
                    sArr7 = sArr16;
                    str4 = str14;
                    StringBuilder sb18 = sbM21133;
                    i11 = i37;
                    i12 = i34;
                    str5 = str11;
                    short[] sArr24 = sArr14;
                    str3 = str12;
                    sArr5 = sArr17;
                    sArr6 = sArr24;
                    if (c18249M34303 != null) {
                        iM559711 = C0946.m55979("ۚۨ") ^ i31;
                        sb3 = sb18;
                        i13 = ((iM559711 ^ i30) * 31881) ^ (-1629324342);
                        i14 = 1098809333;
                    } else {
                        sb3 = sb18;
                        iM559711 = C0873.m55680("ۨܿ") ^ i30;
                        i13 = ((iM559711 ^ i31) * 3917) ^ 992223519;
                        i14 = 1637373130;
                    }
                    int i49 = iM559711 ^ i14;
                    sbM21133 = sb3;
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
                    String strM55822 = C0912.m55822(sArr26, i19, 1, i35);
                    sArr6 = sArr14;
                    sb4 = sbM21133;
                    C0912.m55825(sb4, strM55822);
                    strM55591 = C0845.m55591(sb4);
                    i20 = i34;
                    str7 = str12;
                    sArr5 = sArr26;
                    str8 = str14;
                    sbM21134 = C9179.m21133(str7, str8);
                    iM41556 = viewOnClickListenerC9632.f26517.m41556();
                    if (C1012.m56134() <= 0) {
                        str13 = strM55822;
                        int iM559718 = (C0946.m55979("ۙ᩷") + i31) * 75;
                        str3 = str7;
                        i21 = ((iM559718 ^ i30) * (-29225)) ^ (-1360668844);
                        i22 = iM559718 ^ (-1637328759);
                    } else {
                        str3 = str7;
                        int iM559719 = (C0946.m55979("᩵᩹") + i30) * (-67);
                        i21 = ((iM559719 ^ i31) * 27203) ^ 197240338;
                        i22 = iM559719 ^ (-278521530);
                        str13 = strM55822;
                    }
                    str14 = str8;
                    sArr8 = sArr10;
                    i33 = i22;
                    i32 = i21;
                    i34 = i20;
                    i37 = i19;
                    str10 = strM55591;
                    sbM21133 = sb4;
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
                    strM56325 = C1053.m56325(f82063, 11, 2, i35);
                    str6 = str11;
                    sbM21133 = C9179.m21133(str6, strM56325);
                    if (C1053.m56327() >= 0) {
                        iM559712 = C0946.m55979("᩻ᩳ") ^ i30;
                        i17 = ((iM559712 ^ i31) * (-30389)) ^ (-179374543);
                        i18 = 1413633363;
                    } else {
                        iM559712 = C0946.m55979("ᩳܽ") ^ i30;
                        i17 = ((iM559712 ^ i31) * 12071) ^ 1044453605;
                        i18 = -2038151288;
                    }
                    int i50 = iM559712 ^ i18;
                    str11 = str6;
                    i34 = i16;
                    i37 = i15;
                    str14 = strM56325;
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
                    abstractActivityC5549 = abstractActivityC55411;
                    i34 = i34;
                    StringBuilder sb19 = sbM21133;
                    th2 = th2;
                    str11 = str11;
                    sb = sb19;
                    short[] sArr30 = sArr14;
                    str12 = str12;
                    sArr17 = sArr17;
                    sArr = sArr30;
                    c18107 = c18107;
                    C20966.m47311(c18107, viewOnClickListenerC9632.f26514);
                    str14 = str21;
                    iM55681 = C0946.m55979("᩺ۢ") ^ i31;
                    i6 = ((iM55681 ^ i30) * (-18407)) ^ 1996406497;
                    i7 = -752977738;
                    int i410 = iM55681 ^ i7;
                    abstractActivityC55411 = abstractActivityC5549;
                    sArr16 = sArr3;
                    i33 = i410;
                    i32 = i6;
                    String str111 = str14;
                    c18107 = c18107;
                    i34 = i34;
                    i37 = i;
                    str14 = str111;
                    StringBuilder sb110 = sb;
                    str11 = str11;
                    th2 = th2;
                    sbM21133 = sb110;
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
                    objArr[z ? 1 : 0] = strM55639;
                    iM559716 = C0946.m55979(C0845.m55592(f82063, 17, 3, i35)) ^ 2121947711;
                    if (C1053.f81965 > 0) {
                        iM559715 = (C0873.m55680("ۢ۠") + i30) * (-109);
                        i25 = ((iM559715 ^ i31) * (-29073)) ^ (-1631809433);
                        i27 = 1047930825;
                        i33 = iM559715 ^ i27;
                        i32 = i25;
                    } else {
                        sArr16 = sArr16;
                        sArr2 = sArr17;
                        abstractActivityC55411 = abstractActivityC55411;
                        sArr = sArr14;
                        str12 = str12;
                        int i51 = i37;
                        i34 = i34;
                        c18107 = c18107;
                        str14 = str14;
                        i = i51;
                        StringBuilder sb20 = sbM21133;
                        th2 = th2;
                        str11 = str11;
                        sb = sb20;
                        int iM5597110 = (C0946.m55979("᩻֨") ^ i31) * (-89);
                        int i411 = ((iM5597110 ^ i30) * (-11415)) ^ 494937566;
                        abstractActivityC55411 = abstractActivityC55411;
                        str12 = str12;
                        sArr16 = sArr16;
                        i33 = iM5597110 ^ 764135687;
                        sArr14 = sArr;
                        viewOnClickListenerC9632 = this;
                        sArr17 = sArr2;
                        i32 = i411;
                        String str22 = str14;
                        c18107 = c18107;
                        i34 = i34;
                        i37 = i;
                        str14 = str22;
                        StringBuilder sb111 = sb;
                        str11 = str11;
                        th2 = th2;
                        sbM21133 = sb111;
                    }
                    break;
                case -885872916:
                case -430805978:
                    C0946.m55980();
                    break;
                case -650567838:
                case 1310965486:
                    ServiceConnectionC1013.m56157();
                    break;
                case -552067373:
                case -320828172:
                    viewOnClickListenerC9632.f26515 = z;
                    C1024.m56208(dialogInterfaceC2564);
                    C0890.m55729(new C15666(viewOnClickListenerC9632));
                    break;
                case -479208241:
                case -141449385:
                    sArr4 = sArr16;
                    Throwable th3 = th2;
                    str = str11;
                    str2 = str14;
                    sb2 = sbM21133;
                    i9 = i37;
                    abstractActivityC55410 = abstractActivityC55411;
                    i10 = i34;
                    char c3 = c;
                    short[] sArr31 = sArr14;
                    str3 = str12;
                    sArr5 = sArr17;
                    sArr6 = sArr31;
                    if (c18107 == null) {
                        int iM55684 = (C0873.m55680("ۤᩳ") ^ i30) * (-39);
                        th = th3;
                        i32 = ((iM55684 ^ i31) * 28303) ^ 915891621;
                        abstractActivityC55411 = abstractActivityC55410;
                        sArr16 = sArr4;
                        i33 = iM55684 ^ (-2021733180);
                        c = c3;
                    } else {
                        th = th3;
                        c = c2;
                        int iM559720 = (i31 - C0946.m55979("ۜۘ")) * (-97);
                        abstractActivityC55411 = abstractActivityC55410;
                        sArr16 = sArr4;
                        i33 = iM559720 ^ (-990422711);
                        i32 = ((iM559720 ^ i30) * (-669)) ^ 830883931;
                    }
                    i34 = i10;
                    i37 = i9;
                    str14 = str2;
                    StringBuilder sb21 = sb2;
                    str11 = str;
                    th2 = th;
                    sbM21133 = sb21;
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
                    sb2 = sbM21133;
                    short[] sArr32 = sArr14;
                    str3 = str12;
                    sArr5 = sArr17;
                    sArr6 = sArr32;
                    th = th2;
                    abstractActivityC55410 = abstractActivityC55411;
                    c = 1;
                    str = str23;
                    int iM559721 = (i31 - C0946.m55979("ۜۘ")) * (-97);
                    abstractActivityC55411 = abstractActivityC55410;
                    sArr16 = sArr4;
                    i33 = iM559721 ^ (-990422711);
                    i32 = ((iM559721 ^ i30) * (-669)) ^ 830883931;
                    i34 = i10;
                    i37 = i9;
                    str14 = str2;
                    StringBuilder sb22 = sb2;
                    str11 = str;
                    th2 = th;
                    sbM21133 = sb22;
                    short[] sArr211 = sArr6;
                    sArr17 = sArr5;
                    str12 = str3;
                    sArr14 = sArr211;
                    break;
                case -34485204:
                case 64650182:
                    C1017.m56182(c20672, C0912.m55826(iM559716, objArr));
                    dialogInterfaceOnClickListenerC5138 = new DialogInterfaceOnClickListenerC5138(z ? 1 : 0, viewOnClickListenerC9632);
                    sArr15 = f82063;
                    i34 = 20;
                    i36 = 3;
                    if (!C0955.m56025()) {
                        iM559715 = (i31 - C0873.m55680("᩷֨")) * (-117);
                        i25 = ((iM559715 ^ i30) * (-909)) ^ 1658953508;
                        i27 = 239325702;
                        i33 = iM559715 ^ i27;
                        i32 = i25;
                    } else {
                        sArr10 = sArr16;
                        str7 = str12;
                        str8 = str14;
                        sb4 = sbM21133;
                        sArr5 = sArr17;
                        sArr6 = sArr14;
                        strM55591 = str10;
                        i19 = i37;
                        i20 = 20;
                        int iM5597111 = (C0946.m55979("ۙ᩷") + i31) * 75;
                        str3 = str7;
                        i21 = ((iM5597111 ^ i30) * (-29225)) ^ (-1360668844);
                        i22 = iM5597111 ^ (-1637328759);
                        str14 = str8;
                        sArr8 = sArr10;
                        i33 = i22;
                        i32 = i21;
                        i34 = i20;
                        i37 = i19;
                        str10 = strM55591;
                        sbM21133 = sb4;
                        sArr16 = sArr8;
                        short[] sArr212 = sArr6;
                        sArr17 = sArr5;
                        str12 = str3;
                        sArr14 = sArr212;
                    }
                    break;
                case 38092173:
                case 1093505070:
                    C1044.m56284(abstractActivityC55411, intent);
                    break;
                case 50911565:
                case 201292235:
                    sArr16 = sArr16;
                    i34 = i34;
                    String str24 = str14;
                    StringBuilder sb23 = sbM21133;
                    sArr = sArr14;
                    str12 = str12;
                    C0863.m55629(sb23, c18249M34303.m41556());
                    sArr2 = f82063;
                    if (C1048.f81963) {
                        int iM559722 = (i31 - C0946.m55979("ܺۗ")) * 69;
                        int i52 = ((iM559722 ^ i30) * 6195) ^ (-361717275);
                        sbM21133 = sb23;
                        str14 = str24;
                        sArr16 = sArr16;
                        i33 = iM559722 ^ 991528655;
                        str12 = str12;
                        sArr14 = sArr;
                        sArr17 = sArr2;
                        i32 = i52;
                        i34 = i34;
                        i37 = 13;
                    } else {
                        c18107 = c18107;
                        th2 = th2;
                        str11 = str11;
                        i = 13;
                        sb = sb23;
                        str14 = str24;
                        abstractActivityC55411 = abstractActivityC55411;
                        int iM5597112 = (C0946.m55979("᩻֨") ^ i31) * (-89);
                        int i412 = ((iM5597112 ^ i30) * (-11415)) ^ 494937566;
                        abstractActivityC55411 = abstractActivityC55411;
                        str12 = str12;
                        sArr16 = sArr16;
                        i33 = iM5597112 ^ 764135687;
                        sArr14 = sArr;
                        viewOnClickListenerC9632 = this;
                        sArr17 = sArr2;
                        i32 = i412;
                        String str25 = str14;
                        c18107 = c18107;
                        i34 = i34;
                        i37 = i;
                        str14 = str25;
                        StringBuilder sb112 = sb;
                        str11 = str11;
                        th2 = th2;
                        sbM21133 = sb112;
                    }
                    break;
                case 172740408:
                case 579924310:
                    C0917.m55847(dialogInterfaceC2564);
                    break;
                case 233198640:
                case 400497119:
                    sArr11 = sArr16;
                    i23 = iM41556;
                    sb5 = sbM21134;
                    C0845.m55589(sb5, i23);
                    str9 = str13;
                    C1003.m56121(sb5, str9);
                    strM55639 = C0863.m55639(sb5);
                    c20671M55888 = C0930.m55888(abstractActivityC55411);
                    sArr14 = f82063;
                    if (C0898.f81858 <= 0) {
                        iM559713 = C0873.m55680("۫ܳ") ^ i30;
                        c20671 = c20671M55888;
                        i32 = ((iM559713 ^ i31) * 8403) ^ 1487379238;
                        i24 = -945631549;
                    } else {
                        iM559713 = C0946.m55979("ۨᩳ") ^ i31;
                        c20671 = c20671M55888;
                        i32 = ((iM559713 ^ i30) * 14799) ^ 766340160;
                        i24 = -1875669706;
                    }
                    int i53 = iM559713 ^ i24;
                    sbM21134 = sb5;
                    C20671 c20673 = c20671;
                    iM41556 = i23;
                    sArr16 = sArr11;
                    i33 = i53;
                    str13 = str9;
                    c20672 = c20673;
                    break;
                case 242844839:
                case 1231417755:
                    sArr12 = sArr16;
                    sArr13 = sArr14;
                    strM55635 = C0863.m55635(sArr13, 14, 3, i35);
                    if (C1124.f82007 >= 0) {
                        iM559714 = (i31 - C0873.m55680("ۡ᩺")) * 73;
                        i25 = ((iM559714 ^ i30) * (-16111)) ^ 1486681890;
                        i26 = -554019951;
                    } else {
                        iM559714 = C0946.m55979("ۘ᩸") ^ i30;
                        i25 = ((iM559714 ^ i31) * 20353) ^ (-389523544);
                        i26 = -1646442177;
                    }
                    int i413 = iM559714 ^ i26;
                    sArr14 = sArr13;
                    sArr16 = sArr12;
                    i33 = i413;
                    i32 = i25;
                    break;
                case 279290614:
                case 1159255345:
                    C0861.m55627(c20672, C0946.m55979(strM55635) ^ 2122974985);
                    objArr = new Object[2];
                    objArr[c2] = str10;
                    if (C1024.f81946) {
                        iM559715 = (C0946.m55979("֫ܿ") ^ i30) * (-53);
                        i25 = ((iM559715 ^ i31) * (-21655)) ^ (-281073816);
                        i27 = -395231854;
                    } else {
                        iM559715 = (C0946.m55979("ۛܺ") + i31) * (-61);
                        i25 = ((iM559715 ^ i30) * (-9281)) ^ 1975738146;
                        i27 = 519273017;
                    }
                    i33 = iM559715 ^ i27;
                    i32 = i25;
                    break;
                case 398235908:
                case 1584655853:
                    C1046.m56302();
                    if (C0845.f81821 < 0) {
                        iM559715 = (C0946.m55979("ܽۛ") ^ i30) * 75;
                        i25 = ((iM559715 ^ i31) * 3093) ^ (-2048682067);
                        i27 = 1198781947;
                    } else {
                        iM559715 = (i31 - C0873.m55680("ܰᩴ")) * 41;
                        i25 = ((iM559715 ^ i30) * (-14627)) ^ 2126150084;
                        i27 = 1246566316;
                    }
                    i33 = iM559715 ^ i27;
                    i32 = i25;
                    break;
                case 430450375:
                case 1148838811:
                    sArr3 = sArr16;
                    String str26 = str14;
                    i = i37;
                    abstractActivityC5549 = abstractActivityC55411;
                    i34 = i34;
                    StringBuilder sb24 = sbM21133;
                    th2 = th2;
                    str11 = str11;
                    sb = sb24;
                    short[] sArr33 = sArr14;
                    str12 = str12;
                    sArr17 = sArr17;
                    sArr = sArr33;
                    C0882.m55721(intent, 268435456);
                    c18107 = c18107;
                    str14 = str26;
                    iM55681 = C0873.m55680("᩵۫") ^ i30;
                    i6 = ((iM55681 ^ i31) * (-17179)) ^ 1793607742;
                    i7 = -866734511;
                    int i414 = iM55681 ^ i7;
                    abstractActivityC55411 = abstractActivityC5549;
                    sArr16 = sArr3;
                    i33 = i414;
                    i32 = i6;
                    String str112 = str14;
                    c18107 = c18107;
                    i34 = i34;
                    i37 = i;
                    str14 = str112;
                    StringBuilder sb113 = sb;
                    str11 = str11;
                    th2 = th2;
                    sbM21133 = sb113;
                    short[] sArr116 = sArr;
                    sArr17 = sArr17;
                    str12 = str12;
                    sArr14 = sArr116;
                    break;
                case 539245978:
                case 663996548:
                    C0863.m55643();
                    C1003.m56123();
                    iM559715 = C0873.m55680("۟۫") ^ i30;
                    i25 = ((iM559715 ^ i31) * (-8547)) ^ 1410321725;
                    i27 = 1797960355;
                    i33 = iM559715 ^ i27;
                    i32 = i25;
                    break;
                case 852056133:
                case 1939214722:
                    if (C1017.f81942 < 0) {
                        sArr9 = sArr16;
                        strM56325 = str14;
                        i15 = i37;
                        i16 = i34;
                        str6 = str11;
                        short[] sArr34 = sArr14;
                        str3 = str12;
                        sArr5 = sArr17;
                        sArr6 = sArr34;
                        iM559712 = C0946.m55979("᩻ᩳ") ^ i30;
                        i17 = ((iM559712 ^ i31) * (-30389)) ^ (-179374543);
                        i18 = 1413633363;
                        int i54 = iM559712 ^ i18;
                        str11 = str6;
                        i34 = i16;
                        i37 = i15;
                        str14 = strM56325;
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
                        iM559714 = (i31 - C0873.m55680("ۡ᩺")) * 73;
                        i25 = ((iM559714 ^ i30) * (-16111)) ^ 1486681890;
                        i26 = -554019951;
                        int i415 = iM559714 ^ i26;
                        sArr14 = sArr13;
                        sArr16 = sArr12;
                        i33 = i415;
                        i32 = i25;
                    }
                    break;
                case 890878598:
                case 1440638812:
                    C0912.m55833();
                    break;
                case 918703901:
                case 1823631097:
                    sArr3 = sArr16;
                    abstractActivityC5549 = abstractActivityC55411;
                    int i55 = i37;
                    i34 = i34;
                    c18107 = c18107;
                    str14 = str14;
                    i = i55;
                    StringBuilder sb25 = sbM21133;
                    th2 = th2;
                    str11 = str11;
                    sb = sb25;
                    short[] sArr35 = sArr14;
                    str12 = str12;
                    sArr17 = sArr17;
                    sArr = sArr35;
                    if (c18107 != null) {
                        iM55681 = (i31 - C0873.m55680("ۨᩴ")) * 75;
                        i6 = ((iM55681 ^ i30) * (-14997)) ^ (-607228395);
                        i7 = 1761741629;
                    } else {
                        iM55681 = C0946.m55979("᩺ۢ") ^ i31;
                        i6 = ((iM55681 ^ i30) * (-18407)) ^ 1996406497;
                        i7 = -752977738;
                    }
                    int i416 = iM55681 ^ i7;
                    abstractActivityC55411 = abstractActivityC5549;
                    sArr16 = sArr3;
                    i33 = i416;
                    i32 = i6;
                    String str113 = str14;
                    c18107 = c18107;
                    i34 = i34;
                    i37 = i;
                    str14 = str113;
                    StringBuilder sb114 = sb;
                    str11 = str11;
                    th2 = th2;
                    sbM21133 = sb114;
                    short[] sArr117 = sArr;
                    sArr17 = sArr17;
                    str12 = str12;
                    sArr14 = sArr117;
                    break;
                case 931219586:
                case 1162136663:
                    i = i37;
                    sb = sbM21133;
                    sArr = sArr14;
                    i35 = 12125;
                    iM55979 = (C0946.m55979("֨ܺ") ^ i31) * 23;
                    i2 = ((iM55979 ^ i30) * 28029) ^ 1324631277;
                    i3 = -977910770;
                    i5 = iM55979 ^ i3;
                    abstractActivityC55411 = abstractActivityC55411;
                    sArr16 = sArr16;
                    i33 = i5;
                    i32 = i2;
                    viewOnClickListenerC9632 = this;
                    String str114 = str14;
                    c18107 = c18107;
                    i34 = i34;
                    i37 = i;
                    str14 = str114;
                    StringBuilder sb115 = sb;
                    str11 = str11;
                    th2 = th2;
                    sbM21133 = sb115;
                    short[] sArr118 = sArr;
                    sArr17 = sArr17;
                    str12 = str12;
                    sArr14 = sArr118;
                    break;
                case 1013401877:
                case 1615897181:
                    C1044.m56286();
                    if (C0845.f81821 < 0) {
                        sArr16 = sArr16;
                        sArr2 = sArr17;
                        abstractActivityC55411 = abstractActivityC55411;
                        sArr = sArr14;
                        str12 = str12;
                        int i56 = i37;
                        i34 = i34;
                        c18107 = c18107;
                        str14 = str14;
                        i = i56;
                        StringBuilder sb26 = sbM21133;
                        th2 = th2;
                        str11 = str11;
                        sb = sb26;
                        int iM5597113 = (C0946.m55979("᩻֨") ^ i31) * (-89);
                        int i417 = ((iM5597113 ^ i30) * (-11415)) ^ 494937566;
                        abstractActivityC55411 = abstractActivityC55411;
                        str12 = str12;
                        sArr16 = sArr16;
                        i33 = iM5597113 ^ 764135687;
                        sArr14 = sArr;
                        viewOnClickListenerC9632 = this;
                        sArr17 = sArr2;
                        i32 = i417;
                        String str27 = str14;
                        c18107 = c18107;
                        i34 = i34;
                        i37 = i;
                        str14 = str27;
                        StringBuilder sb116 = sb;
                        str11 = str11;
                        th2 = th2;
                        sbM21133 = sb116;
                    } else {
                        sArr11 = sArr16;
                        c20671M55888 = c20672;
                        str9 = str13;
                        i23 = iM41556;
                        sb5 = sbM21134;
                        iM559713 = C0873.m55680("۫ܳ") ^ i30;
                        c20671 = c20671M55888;
                        i32 = ((iM559713 ^ i31) * 8403) ^ 1487379238;
                        i24 = -945631549;
                        int i57 = iM559713 ^ i24;
                        sbM21134 = sb5;
                        C20671 c20674 = c20671;
                        iM41556 = i23;
                        sArr16 = sArr11;
                        i33 = i57;
                        str13 = str9;
                        c20672 = c20674;
                    }
                    break;
                case 1051809601:
                case 1255806466:
                    if (C1194.f82045 != 0) {
                        sArr10 = sArr16;
                        str8 = str14;
                        sb4 = sbM21133;
                        strM55591 = str10;
                        i19 = i37;
                        i20 = i34;
                        str7 = str12;
                        sArr5 = sArr17;
                        sArr6 = sArr14;
                        int iM5597114 = (C0946.m55979("ۙ᩷") + i31) * 75;
                        str3 = str7;
                        i21 = ((iM5597114 ^ i30) * (-29225)) ^ (-1360668844);
                        i22 = iM5597114 ^ (-1637328759);
                        str14 = str8;
                        sArr8 = sArr10;
                        i33 = i22;
                        i32 = i21;
                        i34 = i20;
                        i37 = i19;
                        str10 = strM55591;
                        sbM21133 = sb4;
                        sArr16 = sArr8;
                        short[] sArr214 = sArr6;
                        sArr17 = sArr5;
                        str12 = str3;
                        sArr14 = sArr214;
                    } else {
                        iM559715 = C0873.m55680("۟۫") ^ i30;
                        i25 = ((iM559715 ^ i31) * (-8547)) ^ 1410321725;
                        i27 = 1797960355;
                        i33 = iM559715 ^ i27;
                        i32 = i25;
                    }
                    break;
                case 1271678311:
                case 1375651383:
                    sArr3 = sArr16;
                    String str28 = str14;
                    i = i37;
                    abstractActivityC5549 = abstractActivityC55411;
                    i34 = i34;
                    c18107 = c18107;
                    StringBuilder sb27 = sbM21133;
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
                            c18249M34303 = C14976.m34303(viewOnClickListenerC9632.f26517, viewOnClickListenerC9632.f26521);
                            iM55681 = C0946.m55979("ۚܳ") ^ i31;
                            i6 = ((iM55681 ^ i30) * 23651) ^ (-1787316289);
                            i7 = 1944760868;
                            int i418 = iM55681 ^ i7;
                            abstractActivityC55411 = abstractActivityC5549;
                            sArr16 = sArr3;
                            i33 = i418;
                            i32 = i6;
                        } catch (Exception e) {
                            e = e;
                            iM559710 = C0873.m55680("۫ۧ") ^ i30;
                            th2 = e;
                            i32 = ((iM559710 ^ i31) * (-413)) ^ 633087681;
                            i8 = 1847002362;
                            int i419 = iM559710 ^ i8;
                            abstractActivityC55411 = abstractActivityC5549;
                            sArr16 = sArr3;
                            i33 = i419;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        str14 = str28;
                    }
                    String str115 = str14;
                    c18107 = c18107;
                    i34 = i34;
                    i37 = i;
                    str14 = str115;
                    StringBuilder sb117 = sb;
                    str11 = str11;
                    th2 = th2;
                    sbM21133 = sb117;
                    short[] sArr119 = sArr;
                    sArr17 = sArr17;
                    str12 = str12;
                    sArr14 = sArr119;
                    break;
                case 1555609482:
                case 1997942480:
                    C1048.m56305();
                    if (!C0861.f81831) {
                        sArr11 = sArr16;
                        c20671M55888 = c20672;
                        str9 = str13;
                        i23 = iM41556;
                        sb5 = sbM21134;
                        iM559713 = C0873.m55680("۫ܳ") ^ i30;
                        c20671 = c20671M55888;
                        i32 = ((iM559713 ^ i31) * 8403) ^ 1487379238;
                        i24 = -945631549;
                        int i58 = iM559713 ^ i24;
                        sbM21134 = sb5;
                        C20671 c20675 = c20671;
                        iM41556 = i23;
                        sArr16 = sArr11;
                        i33 = i58;
                        str13 = str9;
                        c20672 = c20675;
                    } else {
                        sArr12 = sArr16;
                        sArr13 = sArr14;
                        iM559714 = (i31 - C0873.m55680("ۡ᩺")) * 73;
                        i25 = ((iM559714 ^ i30) * (-16111)) ^ 1486681890;
                        i26 = -554019951;
                        int i4110 = iM559714 ^ i26;
                        sArr14 = sArr13;
                        sArr16 = sArr12;
                        i33 = i4110;
                        i32 = i25;
                    }
                    break;
                case 1652512479:
                case 2118802713:
                    abstractActivityC55411.m12260(th2, (boolean) c);
                    break;
                case 1734339330:
                case 1775825391:
                    C1124.m56374(c20672, C0946.m55979(C0845.m55592(sArr16, i38, i39, i35)) ^ 2119705981, null);
                    C1025.m56221(c20672);
                    break;
                default:
                    sArr16 = sArr16;
                    abstractActivityC55411 = abstractActivityC55411;
                    int i59 = i37;
                    i34 = i34;
                    c18107 = c18107;
                    str14 = str14;
                    i = i59;
                    StringBuilder sb28 = sbM21133;
                    th2 = th2;
                    str11 = str11;
                    sb = sb28;
                    short[] sArr37 = sArr14;
                    str12 = str12;
                    sArr17 = sArr17;
                    sArr = sArr37;
                    if ((i28 * i28) - ((s * 2) + 1) >= 0) {
                        iM55979 = C0873.m55680("᩶ܽ") ^ i30;
                        i2 = ((iM55979 ^ i31) * (-29389)) ^ 1326399757;
                        i3 = -1157990804;
                    } else {
                        iM55979 = (i30 - C0873.m55680("ۖ᩷")) * 5;
                        i2 = ((iM55979 ^ i31) * (-11257)) ^ (-255527539);
                        i3 = 315979525;
                    }
                    i5 = iM55979 ^ i3;
                    abstractActivityC55411 = abstractActivityC55411;
                    sArr16 = sArr16;
                    i33 = i5;
                    i32 = i2;
                    viewOnClickListenerC9632 = this;
                    String str116 = str14;
                    c18107 = c18107;
                    i34 = i34;
                    i37 = i;
                    str14 = str116;
                    StringBuilder sb118 = sb;
                    str11 = str11;
                    th2 = th2;
                    sbM21133 = sb118;
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
    /* JADX INFO: renamed from: ֫ */
    public final void m22417(AbstractC17043 abstractC17043, boolean z) {
        int iM55680;
        DialogInterfaceC2564 dialogInterfaceC2564;
        int i;
        DialogInterfaceC2564 dialogInterfaceC2565;
        short[] sArr;
        int iM55979;
        int i2;
        int i3;
        short[] sArr2;
        DialogInterfaceC2564 dialogInterfaceC2566;
        C18249 c18249;
        long j;
        C18249 c182410;
        short[] sArr3;
        Exception exc;
        C18107 c18107;
        int iM559710;
        C18107 c18108;
        int i4;
        int i5;
        int i6;
        int i7;
        Exception exc2;
        int i8;
        C18249 c182411;
        C18107 c18109;
        long jMo25101;
        C18249 c18249M34318;
        short[] sArr4;
        C18249 c182412;
        C18249 c182413;
        C18107 c181010;
        long j2;
        int iM559711;
        int i9;
        short[] sArr5;
        DialogInterfaceC2564 dialogInterfaceC2567;
        short[] sArr6;
        int iM55681;
        int i10;
        int i11;
        ViewOnClickListenerC9632 viewOnClickListenerC9632 = this;
        WeakReference weakReference = null;
        WeakReference weakReference2 = null;
        Button buttonM56567 = null;
        DialogInterfaceC2564 dialogInterfaceC2568 = null;
        Button buttonM3859 = null;
        boolean z2 = false;
        String strM56203 = null;
        short[] sArr7 = null;
        short s = 0;
        short s2 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = -746629083;
        int i16 = C0992.f81922;
        int i17 = C1071.f81975;
        int iM559712 = C0946.m55979("ۖ֨") ^ i17;
        int i18 = ((iM559712 ^ i16) * (-27)) ^ 873529088;
        int i19 = iM559712 ^ 1080794146;
        C18107 c181011 = null;
        Exception e = null;
        long j3 = 0;
        short[] sArr8 = null;
        short[] sArr9 = null;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        boolean z3 = false;
        C18249 c182414 = null;
        C18249 c182415 = null;
        int i23 = 0;
        DialogInterfaceC2564 dialogInterfaceC2569 = null;
        while (true) {
            i15 = i19 ^ ((((i15 ^ i16) * 26133) >> 31) & i18);
            switch (i15) {
                case -2107790445:
                case -171638097:
                    short[] sArr10 = sArr9;
                    DialogInterfaceC2564 dialogInterfaceC25610 = dialogInterfaceC2568;
                    C18249 c182416 = c182414;
                    j3 = j3;
                    c182415 = c182415;
                    short[] sArr11 = sArr8;
                    e = e;
                    i7 = i20;
                    C18107 c181012 = c181011;
                    try {
                        C18249 c18249M34302 = C14976.m34302(abstractC17043);
                        int iM559713 = C0946.m55979("۬ᩳ") ^ i17;
                        sArr8 = sArr11;
                        dialogInterfaceC2568 = dialogInterfaceC25610;
                        sArr9 = sArr10;
                        i19 = iM559713 ^ 678769730;
                        i18 = ((iM559713 ^ i16) * 24841) ^ 2070019524;
                        c181011 = c181012;
                        i20 = i7;
                        c182414 = c18249M34302;
                        e = e;
                        c182415 = c182415;
                    } catch (Exception e2) {
                        e = e2;
                        int iM559714 = (i17 - C0946.m55979("ܽ᩹")) * (-17);
                        sArr8 = sArr11;
                        c182415 = c182415;
                        sArr9 = sArr10;
                        i18 = ((iM559714 ^ i16) * (-26787)) ^ (-2066833609);
                        c181011 = c181012;
                        c182414 = c182416;
                        dialogInterfaceC2568 = dialogInterfaceC25610;
                        i19 = iM559714 ^ (-1316601534);
                        i20 = i7;
                    }
                    j3 = j3;
                    break;
                case -2041521917:
                case 1726981684:
                    sArr9 = sArr9;
                    dialogInterfaceC2568 = dialogInterfaceC2568;
                    c182414 = c182414;
                    j3 = j3;
                    c182415 = c182415;
                    sArr8 = sArr8;
                    e = e;
                    c181011 = c181011;
                    int i24 = i13 + i14;
                    if (i12 - (i24 + i24) > 0) {
                        iM55979 = C0873.m55680("֡ܰ") ^ i17;
                        i2 = ((iM55979 ^ i16) * (-27015)) ^ 2034808561;
                        i3 = 1208745889;
                    } else {
                        iM55979 = (i17 - C0946.m55979("ۘ᩻")) * 23;
                        i2 = ((iM55979 ^ i16) * (-23759)) ^ (-864543061);
                        i3 = 1382358194;
                    }
                    sArr8 = sArr8;
                    c181011 = c181011;
                    sArr9 = sArr9;
                    i18 = i2;
                    c182414 = c182414;
                    dialogInterfaceC2568 = dialogInterfaceC2568;
                    viewOnClickListenerC9632 = this;
                    i19 = iM55979 ^ i3;
                    e = e;
                    c182415 = c182415;
                    j3 = j3;
                    break;
                case -2007534747:
                case 646282969:
                    sArr9 = sArr9;
                    dialogInterfaceC2568 = dialogInterfaceC2568;
                    c182414 = c182414;
                    j3 = j3;
                    c182415 = c182415;
                    sArr8 = sArr8;
                    e = e;
                    c181011 = c181011;
                    s = sArr7[26];
                    s2 = 647;
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55979 = (i16 - C0946.m55979("ۖ᩻")) * (-35);
                        i2 = ((iM55979 ^ i17) * 22071) ^ (-1359422678);
                        i3 = -115105175;
                    } else {
                        iM55979 = C0946.m55979("ۘᩳ") ^ i16;
                        i2 = ((iM55979 ^ i17) * 18889) ^ (-1768700568);
                        i3 = 1155122241;
                    }
                    sArr8 = sArr8;
                    c181011 = c181011;
                    sArr9 = sArr9;
                    i18 = i2;
                    c182414 = c182414;
                    dialogInterfaceC2568 = dialogInterfaceC2568;
                    viewOnClickListenerC9632 = this;
                    i19 = iM55979 ^ i3;
                    e = e;
                    c182415 = c182415;
                    j3 = j3;
                    break;
                case -2003560137:
                case -486318754:
                    sArr9 = sArr9;
                    dialogInterfaceC2565 = dialogInterfaceC2568;
                    sArr4 = sArr8;
                    c182412 = c182414;
                    c182413 = c182415;
                    c181010 = c181011;
                    long j4 = j3;
                    i7 = i20;
                    j2 = j4;
                    viewOnClickListenerC9632.f26518.m37121(c182412, j2, c182413);
                    weakReference = f26513;
                    if (weakReference != null) {
                        int iM55682 = (C0873.m55680("۬ܿ") ^ i17) * 87;
                        sArr8 = sArr4;
                        i18 = ((iM55682 ^ i16) * (-24261)) ^ 175441603;
                        e = e;
                        c182415 = c182413;
                        weakReference = weakReference;
                        sArr9 = sArr9;
                        c182414 = c182412;
                        dialogInterfaceC2568 = dialogInterfaceC2565;
                        i19 = iM55682 ^ 1551186393;
                        c181011 = c181010;
                        i20 = i7;
                        j3 = j2;
                    } else {
                        int iM559715 = (i16 - C0946.m55979("ܰܽ")) * (-125);
                        j3 = j2;
                        int i25 = ((iM559715 ^ i17) * 27449) ^ (-567934169);
                        sArr8 = sArr4;
                        c181011 = c181010;
                        c182414 = c182412;
                        dialogInterfaceC2568 = dialogInterfaceC2565;
                        i19 = iM559715 ^ (-1096849205);
                        e = e;
                        c182415 = c182413;
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
                    iM55979 = (C0873.m55680("᩻ܽ") + i16) * (-41);
                    i2 = ((iM55979 ^ i17) * (-21993)) ^ (-2008889397);
                    i3 = 1828424974;
                    sArr8 = sArr8;
                    c181011 = c181011;
                    sArr9 = sArr9;
                    i18 = i2;
                    c182414 = c182414;
                    dialogInterfaceC2568 = dialogInterfaceC2568;
                    viewOnClickListenerC9632 = this;
                    i19 = iM55979 ^ i3;
                    e = e;
                    c182415 = c182415;
                    j3 = j3;
                    break;
                case -1946270265:
                case 1734661259:
                    sArr5 = sArr9;
                    dialogInterfaceC2567 = dialogInterfaceC2568;
                    sArr6 = sArr8;
                    C16907.m38472(C1012.m56144(sArr6, i21, i22, i20), null, e);
                    if (c181011 == null) {
                        z2 = z3;
                        iM55681 = C0873.m55680("ܰۤ") ^ i17;
                        i10 = ((iM55681 ^ i16) * (-28625)) ^ 58676869;
                        i11 = 1838269681;
                    } else {
                        iM55681 = (i17 - C0873.m55680("ۙۘ")) * (-109);
                        i10 = ((iM55681 ^ i16) * (-29285)) ^ 1892040959;
                        i11 = -742455107;
                    }
                    int i26 = iM55681 ^ i11;
                    sArr8 = sArr6;
                    DialogInterfaceC2564 dialogInterfaceC25611 = dialogInterfaceC2567;
                    i19 = i26;
                    sArr9 = sArr5;
                    i18 = i10;
                    dialogInterfaceC2568 = dialogInterfaceC25611;
                    break;
                case -1914476649:
                case -1188901257:
                    C0992.m56107();
                    break;
                case -1811732205:
                case 2023061528:
                    sArr = sArr9;
                    dialogInterfaceC2564 = dialogInterfaceC2568;
                    f26513 = weakReference2;
                    buttonM56567 = C1929.m56567(dialogInterfaceC2569);
                    if (C0989.f81920 >= 0) {
                        iM559711 = C0946.m55979("֨ۙ") ^ i16;
                        i6 = ((iM559711 ^ i17) * 8231) ^ 1885764329;
                        i9 = 822093643;
                    } else {
                        iM559711 = C0873.m55680("᩸ᩳ") ^ i16;
                        i6 = ((iM559711 ^ i17) * 31743) ^ (-939051678);
                        i9 = -1231873970;
                    }
                    int i27 = iM559711 ^ i9;
                    dialogInterfaceC2568 = dialogInterfaceC2564;
                    i19 = i27;
                    short[] sArr12 = sArr;
                    i18 = i6;
                    sArr9 = sArr12;
                    break;
                case -1670919664:
                case -67423447:
                    sArr2 = sArr9;
                    dialogInterfaceC2566 = dialogInterfaceC2568;
                    c18249 = c182414;
                    j = j3;
                    c182410 = c182415;
                    sArr3 = sArr8;
                    exc = e;
                    c18107 = viewOnClickListenerC9632.f26516;
                    viewOnClickListenerC9632.f26514 = abstractC17043;
                    viewOnClickListenerC9632.f26521 = z;
                    z3 = true;
                    if (C0955.m56025()) {
                        iM559710 = (C0946.m55979("ۢۧ") + i16) * 23;
                        c18108 = c18107;
                        i4 = ((iM559710 ^ i17) * (-3139)) ^ (-1815840251);
                        i5 = 592242609;
                    } else {
                        iM559710 = (C0946.m55979("ᩳܶ") + i17) * (-59);
                        c18108 = c18107;
                        i4 = ((iM559710 ^ i16) * 14859) ^ (-424669294);
                        i5 = 1017872548;
                    }
                    int i28 = iM559710 ^ i5;
                    sArr8 = sArr3;
                    c181011 = c18108;
                    sArr9 = sArr2;
                    i18 = i4;
                    e = exc;
                    c182415 = c182410;
                    j3 = j;
                    c182414 = c18249;
                    dialogInterfaceC2568 = dialogInterfaceC2566;
                    i19 = i28;
                    break;
                case -1662385242:
                case 659395610:
                    dialogInterfaceC2564 = dialogInterfaceC2568;
                    C0873.m55684(buttonM3859, C0873.m55680(strM56203) ^ 2104898404);
                    sArr = sArr9;
                    iM559711 = (C0946.m55979("᩵֫") ^ i16) * (-109);
                    i6 = ((iM559711 ^ i17) * 23629) ^ (-1378978004);
                    i9 = -1992246560;
                    int i29 = iM559711 ^ i9;
                    dialogInterfaceC2568 = dialogInterfaceC2564;
                    i19 = i29;
                    short[] sArr13 = sArr;
                    i18 = i6;
                    sArr9 = sArr13;
                    break;
                case -1592173981:
                case -760532239:
                    dialogInterfaceC2564 = dialogInterfaceC2568;
                    strM56203 = C1024.m56203(sArr9, i23, 3, i20);
                    if (C1036.f81953 < 0) {
                        iM55680 = C0946.m55979("᩶᩵") ^ i16;
                        i18 = ((iM55680 ^ i17) * (-24899)) ^ (-300370129);
                        i = -890285227;
                        int i30 = iM55680 ^ i;
                        dialogInterfaceC2568 = dialogInterfaceC2564;
                        i19 = i30;
                    } else {
                        sArr = sArr9;
                        iM559711 = (C0873.m55680("ۗ᩻") ^ i17) * (-79);
                        i6 = ((iM559711 ^ i16) * (-22481)) ^ 500006548;
                        i9 = 335699433;
                        int i210 = iM559711 ^ i9;
                        dialogInterfaceC2568 = dialogInterfaceC2564;
                        i19 = i210;
                        short[] sArr14 = sArr;
                        i18 = i6;
                        sArr9 = sArr14;
                    }
                    break;
                case -1451711702:
                case 688319489:
                    sArr9 = sArr9;
                    dialogInterfaceC2568 = dialogInterfaceC2568;
                    c182414 = c182414;
                    j3 = j3;
                    c182415 = c182415;
                    sArr8 = sArr8;
                    e = e;
                    c181011 = c181011;
                    int i31 = s + s2;
                    i12 = i31 * i31;
                    i13 = s * s;
                    i14 = 418609;
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = (i16 - C0946.m55979("ۖ᩻")) * (-35);
                        i2 = ((iM55979 ^ i17) * 22071) ^ (-1359422678);
                        i3 = -115105175;
                    } else {
                        iM55979 = (i16 - C0946.m55979("ۖ۠")) * (-51);
                        i2 = ((iM55979 ^ i17) * (-14643)) ^ 90021729;
                        i3 = -837632678;
                    }
                    sArr8 = sArr8;
                    c181011 = c181011;
                    sArr9 = sArr9;
                    i18 = i2;
                    c182414 = c182414;
                    dialogInterfaceC2568 = dialogInterfaceC2568;
                    viewOnClickListenerC9632 = this;
                    i19 = iM55979 ^ i3;
                    e = e;
                    c182415 = c182415;
                    j3 = j3;
                    break;
                case -1169324971:
                case -602891106:
                    sArr = sArr9;
                    dialogInterfaceC2564 = dialogInterfaceC2568;
                    sArr8 = f82063;
                    i21 = 27;
                    i22 = 20;
                    if (C0863.f81833 > 0) {
                        iM559711 = C0946.m55979("ۘۤ") ^ i16;
                        i6 = ((iM559711 ^ i17) * 10347) ^ (-426021800);
                        i9 = -1966766473;
                        int i211 = iM559711 ^ i9;
                        dialogInterfaceC2568 = dialogInterfaceC2564;
                        i19 = i211;
                        short[] sArr15 = sArr;
                        i18 = i6;
                        sArr9 = sArr15;
                    } else {
                        c182411 = c182414;
                        c18109 = c181011;
                        C18249 c182417 = c182415;
                        exc2 = e;
                        c18249M34318 = c182417;
                        long j5 = j3;
                        i8 = i20;
                        jMo25101 = j5;
                        int iM559716 = C0946.m55979("֫᩺") ^ i17;
                        Exception exc3 = exc2;
                        c182415 = c18249M34318;
                        e = exc3;
                        DialogInterfaceC2564 dialogInterfaceC25612 = dialogInterfaceC2564;
                        i19 = iM559716 ^ (-1420266632);
                        short[] sArr16 = sArr;
                        i18 = ((iM559716 ^ i16) * 7081) ^ (-673032297);
                        sArr9 = sArr16;
                        C18107 c181013 = c18109;
                        c182414 = c182411;
                        dialogInterfaceC2568 = dialogInterfaceC25612;
                        long j6 = jMo25101;
                        c181011 = c181013;
                        i20 = i8;
                        j3 = j6;
                    }
                    break;
                case -1039668975:
                case -673457408:
                    dialogInterfaceC2564 = dialogInterfaceC2568;
                    buttonM3859 = dialogInterfaceC2569.m3859();
                    sArr9 = f82063;
                    i23 = 47;
                    if (C0947.f81895) {
                        iM55680 = C0873.m55680("᩺ܰ") ^ i17;
                        i18 = ((iM55680 ^ i16) * 17933) ^ (-1477022287);
                        i = 262907623;
                    } else {
                        iM55680 = (i17 - C0873.m55680("ܺᩳ")) * 83;
                        i18 = ((iM55680 ^ i16) * 24561) ^ (-1341205705);
                        i = 797006182;
                    }
                    int i32 = iM55680 ^ i;
                    dialogInterfaceC2568 = dialogInterfaceC2564;
                    i19 = i32;
                    break;
                case -1029554722:
                case -83690880:
                    C1024.m56208(dialogInterfaceC2568);
                    dialogInterfaceC2565 = dialogInterfaceC2568;
                    c182412 = c182414;
                    c182413 = c182415;
                    sArr4 = sArr8;
                    c181010 = c181011;
                    long j7 = j3;
                    i7 = i20;
                    j2 = j7;
                    int iM559717 = (i16 - C0946.m55979("ܰܽ")) * (-125);
                    j3 = j2;
                    int i212 = ((iM559717 ^ i17) * 27449) ^ (-567934169);
                    sArr8 = sArr4;
                    c181011 = c181010;
                    c182414 = c182412;
                    dialogInterfaceC2568 = dialogInterfaceC2565;
                    i19 = iM559717 ^ (-1096849205);
                    e = e;
                    c182415 = c182413;
                    weakReference = weakReference;
                    sArr9 = sArr9;
                    i18 = i212;
                    i20 = i7;
                    j3 = j3;
                    break;
                case -957181798:
                case 1724947312:
                    sArr9 = sArr9;
                    dialogInterfaceC2568 = dialogInterfaceC2568;
                    c182414 = c182414;
                    j3 = j3;
                    c182415 = c182415;
                    sArr8 = sArr8;
                    e = e;
                    c181011 = c181011;
                    sArr7 = f82063;
                    if (C1048.f81963) {
                        iM55979 = C0946.m55979("᩸ۡ") ^ i17;
                        i2 = ((iM55979 ^ i16) * (-18107)) ^ 505383233;
                        i3 = -1360030004;
                    } else {
                        iM55979 = C0873.m55680("۠ۜ") ^ i16;
                        i2 = ((iM55979 ^ i17) * 8405) ^ (-1735181439);
                        i3 = -852308466;
                    }
                    sArr8 = sArr8;
                    c181011 = c181011;
                    sArr9 = sArr9;
                    i18 = i2;
                    c182414 = c182414;
                    dialogInterfaceC2568 = dialogInterfaceC2568;
                    viewOnClickListenerC9632 = this;
                    i19 = iM55979 ^ i3;
                    e = e;
                    c182415 = c182415;
                    j3 = j3;
                    break;
                case -903387880:
                case 1857066190:
                    i20 = 3544;
                    iM55979 = (C0873.m55680("᩻ܽ") + i16) * (-41);
                    i2 = ((iM55979 ^ i17) * (-21993)) ^ (-2008889397);
                    i3 = 1828424974;
                    sArr8 = sArr8;
                    c181011 = c181011;
                    sArr9 = sArr9;
                    i18 = i2;
                    c182414 = c182414;
                    dialogInterfaceC2568 = dialogInterfaceC2568;
                    viewOnClickListenerC9632 = this;
                    i19 = iM55979 ^ i3;
                    e = e;
                    c182415 = c182415;
                    j3 = j3;
                    break;
                case -890403730:
                case 689128401:
                    C0861.m55626();
                    if (C0912.f81867 > 0) {
                        sArr9 = sArr9;
                        dialogInterfaceC2568 = dialogInterfaceC2568;
                        c182414 = c182414;
                        j3 = j3;
                        c182415 = c182415;
                        sArr8 = sArr8;
                        e = e;
                        c181011 = c181011;
                        iM55979 = C0873.m55680("۠ۜ") ^ i16;
                        i2 = ((iM55979 ^ i17) * 8405) ^ (-1735181439);
                        i3 = -852308466;
                        sArr8 = sArr8;
                        c181011 = c181011;
                        sArr9 = sArr9;
                        i18 = i2;
                        c182414 = c182414;
                        dialogInterfaceC2568 = dialogInterfaceC2568;
                        viewOnClickListenerC9632 = this;
                        i19 = iM55979 ^ i3;
                        e = e;
                        c182415 = c182415;
                        j3 = j3;
                    } else {
                        sArr = sArr9;
                        dialogInterfaceC2564 = dialogInterfaceC2568;
                        c182411 = c182414;
                        c18109 = c181011;
                        C18249 c182418 = c182415;
                        exc2 = e;
                        c18249M34318 = c182418;
                        long j8 = j3;
                        i8 = i20;
                        jMo25101 = j8;
                        int iM559718 = C0946.m55979("֫᩺") ^ i17;
                        Exception exc4 = exc2;
                        c182415 = c18249M34318;
                        e = exc4;
                        DialogInterfaceC2564 dialogInterfaceC25613 = dialogInterfaceC2564;
                        i19 = iM559718 ^ (-1420266632);
                        short[] sArr17 = sArr;
                        i18 = ((iM559718 ^ i16) * 7081) ^ (-673032297);
                        sArr9 = sArr17;
                        C18107 c181014 = c18109;
                        c182414 = c182411;
                        dialogInterfaceC2568 = dialogInterfaceC25613;
                        long j9 = jMo25101;
                        c181011 = c181014;
                        i20 = i8;
                        j3 = j9;
                    }
                    break;
                case -833368046:
                case 1529995077:
                    sArr = sArr9;
                    dialogInterfaceC2564 = dialogInterfaceC2568;
                    C1048.m56304(buttonM56567, viewOnClickListenerC9632);
                    C0947.m55996(dialogInterfaceC2569.m3859(), viewOnClickListenerC9632);
                    C1048.m56304(C1229.m56405(dialogInterfaceC2569), viewOnClickListenerC9632);
                    if (c181011 == null) {
                        iM559711 = (C0873.m55680("ۚ᩻") + i16) * 25;
                        i6 = ((iM559711 ^ i17) * (-14519)) ^ (-1859157216);
                        i9 = -486140055;
                    } else {
                        iM559711 = (C0946.m55979("᩵֫") ^ i16) * (-109);
                        i6 = ((iM559711 ^ i17) * 23629) ^ (-1378978004);
                        i9 = -1992246560;
                    }
                    int i213 = iM559711 ^ i9;
                    dialogInterfaceC2568 = dialogInterfaceC2564;
                    i19 = i213;
                    short[] sArr18 = sArr;
                    i18 = i6;
                    sArr9 = sArr18;
                    break;
                case -744968388:
                case 1261109125:
                    viewOnClickListenerC9632.f26520.m12260(e, z2);
                    break;
                case -593422198:
                case -503380668:
                    if (RunnableC1014.f81941 > 0) {
                        dialogInterfaceC2564 = dialogInterfaceC2568;
                        iM55680 = C0873.m55680("᩺ܰ") ^ i17;
                        i18 = ((iM55680 ^ i16) * 17933) ^ (-1477022287);
                        i = 262907623;
                        int i33 = iM55680 ^ i;
                        dialogInterfaceC2568 = dialogInterfaceC2564;
                        i19 = i33;
                    } else {
                        sArr = sArr9;
                        dialogInterfaceC2564 = dialogInterfaceC2568;
                        c182411 = c182414;
                        c18109 = c181011;
                        C18249 c182419 = c182415;
                        exc2 = e;
                        c18249M34318 = c182419;
                        long j10 = j3;
                        i8 = i20;
                        jMo25101 = j10;
                        int iM559719 = C0946.m55979("֫᩺") ^ i17;
                        Exception exc5 = exc2;
                        c182415 = c18249M34318;
                        e = exc5;
                        DialogInterfaceC2564 dialogInterfaceC25614 = dialogInterfaceC2564;
                        i19 = iM559719 ^ (-1420266632);
                        short[] sArr19 = sArr;
                        i18 = ((iM559719 ^ i16) * 7081) ^ (-673032297);
                        sArr9 = sArr19;
                        C18107 c181015 = c18109;
                        c182414 = c182411;
                        dialogInterfaceC2568 = dialogInterfaceC25614;
                        long j11 = jMo25101;
                        c181011 = c181015;
                        i20 = i8;
                        j3 = j11;
                    }
                    break;
                case -583070940:
                case 1175491298:
                    sArr = sArr9;
                    dialogInterfaceC2564 = dialogInterfaceC2568;
                    dialogInterfaceC2569.m3862();
                    weakReference2 = new WeakReference(dialogInterfaceC2569);
                    if (RunnableC0871.f81839 >= 0) {
                        iM559711 = (C0873.m55680("ۗ᩻") ^ i17) * (-79);
                        i6 = ((iM559711 ^ i16) * (-22481)) ^ 500006548;
                        i9 = 335699433;
                    } else {
                        iM559711 = C0873.m55680("ۖۗ") ^ i17;
                        i6 = ((iM559711 ^ i16) * 17215) ^ 37310532;
                        i9 = 1580104729;
                    }
                    int i214 = iM559711 ^ i9;
                    dialogInterfaceC2568 = dialogInterfaceC2564;
                    i19 = i214;
                    short[] sArr110 = sArr;
                    i18 = i6;
                    sArr9 = sArr110;
                    break;
                case -439474123:
                case 2049513878:
                    if (!C0861.f81831) {
                        sArr = sArr9;
                        dialogInterfaceC2564 = dialogInterfaceC2568;
                        iM559711 = (C0873.m55680("ۗ᩻") ^ i17) * (-79);
                        i6 = ((iM559711 ^ i16) * (-22481)) ^ 500006548;
                        i9 = 335699433;
                        int i215 = iM559711 ^ i9;
                        dialogInterfaceC2568 = dialogInterfaceC2564;
                        i19 = i215;
                        short[] sArr111 = sArr;
                        i18 = i6;
                        sArr9 = sArr111;
                    } else {
                        sArr = sArr9;
                        dialogInterfaceC2564 = dialogInterfaceC2568;
                        c182411 = c182414;
                        c18109 = c181011;
                        C18249 c1824110 = c182415;
                        exc2 = e;
                        c18249M34318 = c1824110;
                        long j12 = j3;
                        i8 = i20;
                        jMo25101 = j12;
                        int iM5597110 = C0946.m55979("֫᩺") ^ i17;
                        Exception exc6 = exc2;
                        c182415 = c18249M34318;
                        e = exc6;
                        DialogInterfaceC2564 dialogInterfaceC25615 = dialogInterfaceC2564;
                        i19 = iM5597110 ^ (-1420266632);
                        short[] sArr112 = sArr;
                        i18 = ((iM5597110 ^ i16) * 7081) ^ (-673032297);
                        sArr9 = sArr112;
                        C18107 c181016 = c18109;
                        c182414 = c182411;
                        dialogInterfaceC2568 = dialogInterfaceC25615;
                        long j13 = jMo25101;
                        c181011 = c181016;
                        i20 = i8;
                        j3 = j13;
                    }
                    break;
                case -368210488:
                case 1979396780:
                    dialogInterfaceC2568 = (DialogInterfaceC2564) weakReference.get();
                    if (dialogInterfaceC2568 == null) {
                        dialogInterfaceC2565 = dialogInterfaceC2568;
                        c182412 = c182414;
                        c182413 = c182415;
                        sArr4 = sArr8;
                        c181010 = c181011;
                        long j14 = j3;
                        i7 = i20;
                        j2 = j14;
                        int iM5597111 = (i16 - C0946.m55979("ܰܽ")) * (-125);
                        j3 = j2;
                        int i216 = ((iM5597111 ^ i17) * 27449) ^ (-567934169);
                        sArr8 = sArr4;
                        c181011 = c181010;
                        c182414 = c182412;
                        dialogInterfaceC2568 = dialogInterfaceC2565;
                        i19 = iM5597111 ^ (-1096849205);
                        e = e;
                        c182415 = c182413;
                        weakReference = weakReference;
                        sArr9 = sArr9;
                        i18 = i216;
                        i20 = i7;
                        j3 = j3;
                    } else {
                        int iM55683 = (C0873.m55680("ۜ᩸") ^ i17) * (-117);
                        sArr = sArr9;
                        i6 = ((iM55683 ^ i16) * 14319) ^ 1565788089;
                        i19 = iM55683 ^ (-743962509);
                        short[] sArr113 = sArr;
                        i18 = i6;
                        sArr9 = sArr113;
                    }
                    break;
                case -156237249:
                case 546544642:
                    C0845.m55584();
                    sArr = sArr9;
                    dialogInterfaceC2564 = dialogInterfaceC2568;
                    c182411 = c182414;
                    c18109 = c181011;
                    C18249 c1824111 = c182415;
                    exc2 = e;
                    c18249M34318 = c1824111;
                    long j15 = j3;
                    i8 = i20;
                    jMo25101 = j15;
                    int iM5597112 = C0946.m55979("֫᩺") ^ i17;
                    Exception exc7 = exc2;
                    c182415 = c18249M34318;
                    e = exc7;
                    DialogInterfaceC2564 dialogInterfaceC25616 = dialogInterfaceC2564;
                    i19 = iM5597112 ^ (-1420266632);
                    short[] sArr114 = sArr;
                    i18 = ((iM5597112 ^ i16) * 7081) ^ (-673032297);
                    sArr9 = sArr114;
                    C18107 c181017 = c18109;
                    c182414 = c182411;
                    dialogInterfaceC2568 = dialogInterfaceC25616;
                    long j16 = jMo25101;
                    c181011 = c181017;
                    i20 = i8;
                    j3 = j16;
                    break;
                case 248388485:
                case 1229277358:
                    exc2 = e;
                    i8 = i20;
                    sArr = sArr9;
                    dialogInterfaceC2564 = dialogInterfaceC2568;
                    c182411 = c182414;
                    short[] sArr20 = sArr8;
                    c18109 = c181011;
                    viewOnClickListenerC9632.f26517 = c182411;
                    jMo25101 = abstractC17043.mo25101();
                    c18249M34318 = C14976.m34318(C0866.m55658(c182411));
                    if (C0898.m55800() <= 0) {
                        sArr8 = sArr20;
                        int iM5597113 = C0946.m55979("֫᩺") ^ i17;
                        Exception exc8 = exc2;
                        c182415 = c18249M34318;
                        e = exc8;
                        DialogInterfaceC2564 dialogInterfaceC25617 = dialogInterfaceC2564;
                        i19 = iM5597113 ^ (-1420266632);
                        short[] sArr115 = sArr;
                        i18 = ((iM5597113 ^ i16) * 7081) ^ (-673032297);
                        sArr9 = sArr115;
                        C18107 c181018 = c18109;
                        c182414 = c182411;
                        dialogInterfaceC2568 = dialogInterfaceC25617;
                        long j17 = jMo25101;
                        c181011 = c181018;
                        i20 = i8;
                        j3 = j17;
                    } else {
                        int iM55684 = C0873.m55680("᩺ۨ") ^ i16;
                        sArr8 = sArr20;
                        i18 = ((iM55684 ^ i17) * 19423) ^ 912303051;
                        e = exc2;
                        c182415 = c18249M34318;
                        i19 = iM55684 ^ 245493504;
                        sArr9 = sArr;
                        c182414 = c182411;
                        dialogInterfaceC2568 = dialogInterfaceC2564;
                        c181011 = c18109;
                        i20 = i8;
                        j3 = jMo25101;
                    }
                    break;
                case 406734573:
                case 1150886581:
                    if (C1964.f83032 <= 0) {
                        sArr2 = sArr9;
                        dialogInterfaceC2566 = dialogInterfaceC2568;
                        c18249 = c182414;
                        j = j3;
                        c182410 = c182415;
                        sArr3 = sArr8;
                        exc = e;
                        c18107 = c181011;
                        iM559710 = (C0946.m55979("ۢۧ") + i16) * 23;
                        c18108 = c18107;
                        i4 = ((iM559710 ^ i17) * (-3139)) ^ (-1815840251);
                        i5 = 592242609;
                        int i217 = iM559710 ^ i5;
                        sArr8 = sArr3;
                        c181011 = c18108;
                        sArr9 = sArr2;
                        i18 = i4;
                        e = exc;
                        c182415 = c182410;
                        j3 = j;
                        c182414 = c18249;
                        dialogInterfaceC2568 = dialogInterfaceC2566;
                        i19 = i217;
                    } else {
                        sArr = sArr9;
                        dialogInterfaceC2564 = dialogInterfaceC2568;
                        iM559711 = C0946.m55979("֨ۙ") ^ i16;
                        i6 = ((iM559711 ^ i17) * 8231) ^ 1885764329;
                        i9 = 822093643;
                        int i218 = iM559711 ^ i9;
                        dialogInterfaceC2568 = dialogInterfaceC2564;
                        i19 = i218;
                        short[] sArr116 = sArr;
                        i18 = i6;
                        sArr9 = sArr116;
                    }
                    break;
                case 761169931:
                case 924816012:
                    sArr = sArr9;
                    C18249 c182420 = c182415;
                    Exception exc9 = e;
                    dialogInterfaceC2569 = viewOnClickListenerC9632.f26519;
                    dialogInterfaceC2569.m3854(z ^ z3);
                    C7204.m16545(dialogInterfaceC2569);
                    int iM55685 = (C0873.m55680("ۡۘ") ^ i16) * 65;
                    i6 = ((iM55685 ^ i17) * (-10463)) ^ (-222488965);
                    sArr8 = sArr8;
                    c181011 = c181011;
                    c182414 = c182414;
                    dialogInterfaceC2568 = dialogInterfaceC2568;
                    i19 = iM55685 ^ (-676633548);
                    e = exc9;
                    c182415 = c182420;
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
                    dialogInterfaceC2567 = dialogInterfaceC2568;
                    sArr5 = sArr9;
                    sArr6 = sArr8;
                    z2 = false;
                    iM55681 = C0873.m55680("ܰۤ") ^ i17;
                    i10 = ((iM55681 ^ i16) * (-28625)) ^ 58676869;
                    i11 = 1838269681;
                    int i219 = iM55681 ^ i11;
                    sArr8 = sArr6;
                    DialogInterfaceC2564 dialogInterfaceC25618 = dialogInterfaceC2567;
                    i19 = i219;
                    sArr9 = sArr5;
                    i18 = i10;
                    dialogInterfaceC2568 = dialogInterfaceC25618;
                    break;
                case 1927460928:
                case 2061224306:
                    C0894.m55769();
                    if (C1012.f81938 < 0) {
                        sArr = sArr9;
                        dialogInterfaceC2564 = dialogInterfaceC2568;
                        iM559711 = C0946.m55979("֨ۙ") ^ i16;
                        i6 = ((iM559711 ^ i17) * 8231) ^ 1885764329;
                        i9 = 822093643;
                        int i2110 = iM559711 ^ i9;
                        dialogInterfaceC2568 = dialogInterfaceC2564;
                        i19 = i2110;
                        short[] sArr118 = sArr;
                        i18 = i6;
                        sArr9 = sArr118;
                    } else {
                        sArr9 = sArr9;
                        dialogInterfaceC2568 = dialogInterfaceC2568;
                        c182414 = c182414;
                        j3 = j3;
                        c182415 = c182415;
                        sArr8 = sArr8;
                        e = e;
                        c181011 = c181011;
                        iM55979 = C0873.m55680("۠ۜ") ^ i16;
                        i2 = ((iM55979 ^ i17) * 8405) ^ (-1735181439);
                        i3 = -852308466;
                        sArr8 = sArr8;
                        c181011 = c181011;
                        sArr9 = sArr9;
                        i18 = i2;
                        c182414 = c182414;
                        dialogInterfaceC2568 = dialogInterfaceC2568;
                        viewOnClickListenerC9632 = this;
                        i19 = iM55979 ^ i3;
                        e = e;
                        c182415 = c182415;
                        j3 = j3;
                    }
                    break;
                default:
                    if (!C0866.m55648(dialogInterfaceC2568)) {
                        dialogInterfaceC2565 = dialogInterfaceC2568;
                        c182412 = c182414;
                        c182413 = c182415;
                        sArr4 = sArr8;
                        c181010 = c181011;
                        long j18 = j3;
                        i7 = i20;
                        j2 = j18;
                        int iM5597114 = (i16 - C0946.m55979("ܰܽ")) * (-125);
                        j3 = j2;
                        int i2111 = ((iM5597114 ^ i17) * 27449) ^ (-567934169);
                        sArr8 = sArr4;
                        c181011 = c181010;
                        c182414 = c182412;
                        dialogInterfaceC2568 = dialogInterfaceC2565;
                        i19 = iM5597114 ^ (-1096849205);
                        e = e;
                        c182415 = c182413;
                        weakReference = weakReference;
                        sArr9 = sArr9;
                        i18 = i2111;
                        i20 = i7;
                        j3 = j3;
                    } else {
                        iM55680 = (C0873.m55680("ۘ᩹") + i16) * 115;
                        dialogInterfaceC2564 = dialogInterfaceC2568;
                        i18 = ((iM55680 ^ i17) * (-10039)) ^ 593948261;
                        i = 1157551011;
                        int i34 = iM55680 ^ i;
                        dialogInterfaceC2568 = dialogInterfaceC2564;
                        i19 = i34;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m22412(ViewOnClickListenerC9632 viewOnClickListenerC9632) {
        boolean z = false;
        DialogInterfaceC2564 dialogInterfaceC2564 = null;
        int i = -966708708;
        int i2 = ServiceConnectionC1013.f81940;
        int i3 = C0863.f81833;
        int iM55680 = (i3 - C0873.m55680("᩻ۜ")) * (-75);
        int i4 = ((iM55680 ^ i2) * (-30335)) ^ (-1629533302);
        int i5 = 2013340262;
        while (true) {
            i = ((((i ^ i2) * 5093) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2031008269:
                case -428184257:
                    dialogInterfaceC2564 = viewOnClickListenerC9632.f26519;
                    if (C0877.m55696()) {
                        iM55680 = C0873.m55680("ۙ۟") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-20479)) ^ (-489965931);
                        i5 = 1092058663;
                    } else {
                        iM55680 = C0873.m55680("ܳ֫") ^ i2;
                        i4 = ((iM55680 ^ i3) * 18537) ^ (-51889149);
                        i5 = -1143343182;
                    }
                    break;
                case -1954871887:
                case -174188438:
                    AbstractC0942.m55971();
                    C1024.m56209();
                    break;
                case -1714439332:
                case -460354153:
                    viewOnClickListenerC9632.f26515 = z;
                    if (C0873.m55678()) {
                        iM55680 = (C0873.m55680("ۡܶ") + i2) * 65;
                        i4 = ((iM55680 ^ i3) * 27711) ^ 936258823;
                        i5 = -558673073;
                    } else {
                        iM55680 = C0873.m55680("ܽᩳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-30067)) ^ 147461431;
                        i5 = 1778797141;
                    }
                    break;
                case -1429836350:
                case 1509746176:
                    C0917.m55847(dialogInterfaceC2564);
                    if (C0866.f81837 < 0) {
                        C1053.m56329(new C15666(viewOnClickListenerC9632));
                    }
                    iM55680 = (C0873.m55680("֫ܰ") ^ i3) * (-95);
                    i4 = ((iM55680 ^ i2) * 15075) ^ (-2020631744);
                    i5 = 961826662;
                    break;
                case -1178583867:
                case -770727778:
                    if (C0861.f81831) {
                        iM55680 = (C0946.m55979("֡ۡ") + i3) * 43;
                        i4 = ((iM55680 ^ i2) * 1095) ^ (-56794730);
                        i5 = -886229540;
                    } else {
                        iM55680 = C0873.m55680("ܳ֫") ^ i2;
                        i4 = ((iM55680 ^ i3) * 18537) ^ (-51889149);
                        i5 = -1143343182;
                    }
                    break;
                case -1122257592:
                case 1462691354:
                    C1194.m56396();
                    if (C1044.f81959 >= 0) {
                        iM55680 = (C0873.m55680("֫ܰ") ^ i3) * (-95);
                        i4 = ((iM55680 ^ i2) * 15075) ^ (-2020631744);
                        i5 = 961826662;
                    } else {
                        iM55680 = (C0873.m55680("ۡܶ") + i2) * 65;
                        i4 = ((iM55680 ^ i3) * 27711) ^ 936258823;
                        i5 = -558673073;
                    }
                    break;
                case -1104431223:
                case 842126147:
                    if (C1404.f82149 >= 0) {
                        iM55680 = C0873.m55680("ܳ֫") ^ i2;
                        i4 = ((iM55680 ^ i3) * 18537) ^ (-51889149);
                        i5 = -1143343182;
                    } else {
                        iM55680 = C0946.m55979("ۤۨ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-17735)) ^ (-1326048683);
                        i5 = 447500976;
                    }
                    break;
                case -1093228983:
                case -229786354:
                    if (C1053.f81965 <= 0) {
                        iM55680 = C0946.m55979("ۛ᩹") ^ i3;
                        i4 = ((iM55680 ^ i2) * 3135) ^ 1739796026;
                        i5 = 1322421133;
                    } else {
                        iM55680 = (C0946.m55979("᩶ܰ") ^ i2) * (-33);
                        i4 = ((iM55680 ^ i3) * 15519) ^ 253156308;
                        i5 = -1666327302;
                    }
                    break;
                case -872103386:
                case 418960540:
                    z = true;
                    if (C1012.m56134() <= 0) {
                        iM55680 = (i2 - C0873.m55680("۫ᩴ")) * 127;
                        i4 = ((iM55680 ^ i3) * 17951) ^ (-684831732);
                        i5 = -240440141;
                    } else {
                        iM55680 = (C0946.m55979("᩵᩸") ^ i2) * (-25);
                        i4 = ((iM55680 ^ i3) * 3733) ^ 1717050878;
                        i5 = -299336922;
                    }
                    break;
                case -388191156:
                case 1882158385:
                    if (C0992.f81922 >= 0) {
                        iM55680 = C0873.m55680("ܳ֫") ^ i2;
                        i4 = ((iM55680 ^ i3) * 18537) ^ (-51889149);
                        i5 = -1143343182;
                    } else {
                        iM55680 = (C0946.m55979("ۢۖ") ^ i2) * (-127);
                        i4 = ((iM55680 ^ i3) * 21661) ^ 1940014672;
                        i5 = 938947017;
                    }
                    break;
                case -113537278:
                case 2018086142:
                    C0967.m56074();
                    if (C0863.f81833 > 0) {
                        iM55680 = C0946.m55979("ۛ᩹") ^ i3;
                        i4 = ((iM55680 ^ i2) * 3135) ^ 1739796026;
                        i5 = 1322421133;
                    } else {
                        iM55680 = (i2 - C0873.m55680("۫ᩴ")) * 127;
                        i4 = ((iM55680 ^ i3) * 17951) ^ (-684831732);
                        i5 = -240440141;
                    }
                    break;
                case 38260021:
                case 301701741:
                    if (C0863.m55643()) {
                        iM55680 = (C0946.m55979("᩵᩻") + i3) * (-83);
                        i4 = ((iM55680 ^ i2) * 12011) ^ 793263294;
                        i5 = 1416650898;
                    } else {
                        iM55680 = (C0873.m55680("ۡܶ") + i2) * 65;
                        i4 = ((iM55680 ^ i3) * 27711) ^ 936258823;
                        i5 = -558673073;
                    }
                    break;
                case 808406862:
                case 2132808266:
                    C1028.m56247();
                    C0930.m55885();
                    iM55680 = (C0873.m55680("ۡܶ") + i2) * 65;
                    i4 = ((iM55680 ^ i3) * 27711) ^ 936258823;
                    i5 = -558673073;
                    break;
                case 1446585970:
                case 1454012281:
                    C0989.m56095();
                    if (!C0955.m56025()) {
                        iM55680 = (i2 - C0873.m55680("۫ᩴ")) * 127;
                        i4 = ((iM55680 ^ i3) * 17951) ^ (-684831732);
                        i5 = -240440141;
                    } else {
                        iM55680 = (C0873.m55680("ۡܶ") + i2) * 65;
                        i4 = ((iM55680 ^ i3) * 27711) ^ 936258823;
                        i5 = -558673073;
                    }
                    break;
                default:
                    if (RunnableC0897.f81856) {
                        iM55680 = C0873.m55680("ܽۙ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-17139)) ^ (-1746442830);
                        i5 = -891026269;
                    } else {
                        iM55680 = C0873.m55680("ܳ֫") ^ i2;
                        i4 = ((iM55680 ^ i3) * 18537) ^ (-51889149);
                        i5 = -1143343182;
                    }
                    break;
            }
            return;
        }
    }
}
