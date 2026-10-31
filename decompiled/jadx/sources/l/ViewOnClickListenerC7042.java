package l;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.method.DigitsKeyListener;
import android.text.style.UnderlineSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.Space;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۜ᩸᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 12B7 */
/* JADX INFO: loaded from: classes3.dex */
public class ViewOnClickListenerC7042 extends AbstractActivityC3346 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public static final int[] f21691;

    /* JADX INFO: renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f21692 = 0;

    /* JADX INFO: renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public static final int[] f21693;

    /* JADX INFO: renamed from: ᩶ᩳ֨, reason: not valid java name and contains not printable characters */
    private static final short[] f21694 = {4519, -15672, -6920, -15671, -6920, 32121, 32012, -16887, 611, -6674, -1004, 4479, 8632, -30950, -32752, -31510, -1121, 9313, 14244, 12263, 9853, -8334, -11682, 12011, 4855, -30332, -28688, -28488, 27132, -31806, 26872, 5187, 5213, 5755, 26889, 25605, 28075, 28400, 18388, 29326, -31767, -30393, 27804, 20377, 17028, 25368, 25417, -25157, -32088, -32144, 27414, -26712, 16885, 29738, -32433, 32662, -32682, 22014, 20242, 24582, 16982, -31086, 31305, -32027, 27993, 17554, 19252, 32584, 26352, 30395, -31278, 26911, -27223, 26746, 30932, -25199, 7558, -20953, -16612, 18119, -24450, -16690, -17812, -14244, -14245, -14267, -14272, -14271, -14230, -14248, -14256, -14271, -14243, -14246, -14255, 7518, 9763, -4591, 15731, 15128, -14636, -12433, 13464, 9743, -6176, -16141, -8177, 13550, 16338, 12484, 14026, -12345, 14397, -12665, 15560, -2515, -15414, -10012, -5364, 11132, 10082, 16381, 11550, 9512, -14737, -15249, 9868, -4780, 14578, 13306, 8819, -8000, -18224, -18223, -18218, -18217, -18220, -18219, -18214, -18213, -18269, -18272, -18271, -18266, -18265, -18268, -18267, -18262, -18264, -18263, -18258, -18257, -18260, -18254, -18253, -18256, -18255, -18250, -18249, -18252, -18251, -18246, -18245, -18248, -18301, -18304, -18303, -18298, -18297, -18300, -18299, -18294, -18296, -18295, -18290, -18289, -18292, -18286, -18285, -18288, -18287, -18282, -18281, -18284, -18283, -18278, -18277, -18280, -15182, -11698, -5080, -18200, 14299, -14211, 8927, -18288, -18297, -18300, -18297, -18288, -18288, -18301, -18290, -18271, -18291, -18298, -18297, 4435, -21719, -21698, -21699, -21698, -21719, -21719, -21702, -21705, -21736, -21708, -21697, -21698, 9542, 25874, 25901, 25912, 25907, 25867, 25908, 25901, 25884, 25918, 25897, 25908, 25899, 25908, 25897, 25892, 4615, 20464, 23609, -18529, -8228, -8267, -8268, -8269, -8270, -8271, -8272, -8257, -8258, -8250, -8278, -8241, -8243, -8278, -8247, -8233, -8278, -8227, -8230, -8196, -8266, -8267, -8198, 16898, -30272, -23316, -8307, -22696, 18488, -21905, -17240, -20385, 16854, 20246, -23642, -17487, -32767, -24312, 21480, 18393, -16579, -30565, -8254, -8203, -8203, -8216, -8203, -8282, -24241, -21780, 21475, 5591, -10034, 6419, 2484, 3707, -7316, 3772, -6583, 1550, -4520, -7331, -2274, -14550};

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public C17625 f21695;

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f21696;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public boolean f21697;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public boolean f21698;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C8817 f21699;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public TextView f21700;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public boolean f21701;

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = -362181309;
        int i7 = C3019.f9544;
        int i8 = C3537.f11231;
        int iM2566 = C0630.m2566("ۘۧ") ^ i7;
        int i9 = ((iM2566 ^ i8) * (-15415)) ^ 263291248;
        int i10 = 1178603357;
        while (true) {
            i6 = ((((i6 ^ i8) * 21657) >> 31) & i9) ^ (iM2566 ^ i10);
            switch (i6) {
                case -2065318559:
                case 525914068:
                    if (!C1005.f3721) {
                        iM2566 = (C0630.m2566("ۡܰ") + i8) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i9 = ((iM2566 ^ i7) * 3925) ^ 1126924958;
                        i10 = -1454884471;
                    } else {
                        iM2566 = C0630.m2566("ܿۢ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-14777)) ^ (-386462446);
                        i10 = 1624064582;
                    }
                    break;
                case -2016011081:
                case 136891914:
                    i3 = s * s2;
                    if (C11340.f33930 >= 0) {
                        iM2566 = (C0630.m2566("ۡܰ") + i8) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i9 = ((iM2566 ^ i7) * 3925) ^ 1126924958;
                        i10 = -1454884471;
                    } else {
                        iM2566 = C2105.m6981("᩸᩹") ^ i7;
                        i9 = ((iM2566 ^ i8) * 11243) ^ 512031134;
                        i10 = -2006641646;
                    }
                    break;
                case -1634553788:
                case -977304019:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = C0630.m2566("ܿۢ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-14777)) ^ (-386462446);
                        i10 = 1624064582;
                    } else {
                        iM2566 = C2105.m6981("᩹ܶ") ^ i7;
                        i9 = ((iM2566 ^ i8) * 31515) ^ (-799796335);
                        i10 = -395845549;
                    }
                    break;
                case -1546409516:
                case 1707594467:
                    if ((i3 + 1) - i2 <= 0) {
                        iM2566 = (C0630.m2566("۫ܿ") ^ i8) * 101;
                        i9 = ((iM2566 ^ i7) * (-11291)) ^ (-278340439);
                        i10 = -1010147097;
                    } else {
                        iM2566 = C0630.m2566("᩻ᩳ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-24439)) ^ (-2043631583);
                        i10 = -1405387337;
                    }
                    break;
                case -1505447693:
                case -614388536:
                    return C3683.m11225(sArr2, i5, 15, i4);
                case -1408742808:
                case 2139934291:
                    if (C1773.f6144 > 0) {
                        iM2566 = C0630.m2566("᩻ܽ") ^ i7;
                        i9 = ((iM2566 ^ i8) * 5885) ^ (-607141088);
                        i10 = -1657434411;
                    } else {
                        iM2566 = C0630.m2566("ܿۢ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-14777)) ^ (-386462446);
                        i10 = 1624064582;
                    }
                    break;
                case -1317754481:
                case 2097280850:
                    C1128.m3851();
                    return null;
                case -1305288780:
                case 1761176057:
                    C4159.m12565();
                    if (!C1916.f6442) {
                        iM2566 = (C0630.m2566("۟ܽ") + i7) * 127;
                        i9 = ((iM2566 ^ i8) * 14365) ^ 1413934989;
                        i10 = 1735724467;
                    } else {
                        iM2566 = C0630.m2566("᩻ܽ") ^ i7;
                        i9 = ((iM2566 ^ i8) * 5885) ^ (-607141088);
                        i10 = -1657434411;
                    }
                    break;
                case -1276985599:
                case -392352543:
                    if (C2520.f8000 >= 0) {
                        iM2566 = C0630.m2566("ܿۢ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-14777)) ^ (-386462446);
                        i10 = 1624064582;
                    } else {
                        iM2566 = C2105.m6981("۠᩹") ^ i8;
                        i9 = ((iM2566 ^ i7) * 14655) ^ 1653530612;
                        i10 = 335963646;
                    }
                    break;
                case -1122625946:
                case 2105915857:
                    i4 = 25949;
                    iM2566 = C2105.m6981("֫ۨ") ^ i7;
                    i9 = ((iM2566 ^ i8) * 17329) ^ 908620091;
                    i10 = 442734239;
                    break;
                case -997326351:
                case 507314970:
                    i2 = i * i;
                    s2 = 2;
                    if (C11340.m28031()) {
                        iM2566 = C0630.m2566("֡֡") ^ i7;
                        i9 = ((iM2566 ^ i8) * 41) ^ 270607127;
                        i10 = 1786192231;
                    } else {
                        iM2566 = C0630.m2566("᩻ܽ") ^ i7;
                        i9 = ((iM2566 ^ i8) * 5885) ^ (-607141088);
                        i10 = -1657434411;
                    }
                    break;
                case -758362621:
                case 46819995:
                    s = sArr[c];
                    if (C2958.f9394 >= 0) {
                        iM2566 = (i8 - C0630.m2566("ۗۛ")) * (-7);
                        i9 = ((iM2566 ^ i7) * (-6563)) ^ (-1608939357);
                        i10 = 722456527;
                    } else {
                        iM2566 = (C0630.m2566("ۧ۠") + i7) * (-97);
                        i9 = ((iM2566 ^ i8) * 32235) ^ 1898027941;
                        i10 = -1381143368;
                    }
                    break;
                case -138237454:
                case 603212350:
                    sArr2 = f21694;
                    i5 = 221;
                    if (C7106.m19120() <= 0) {
                        iM2566 = (i8 - C0630.m2566("ۗۛ")) * (-7);
                        i9 = ((iM2566 ^ i7) * (-6563)) ^ (-1608939357);
                        i10 = 722456527;
                    } else {
                        iM2566 = (i7 - C0630.m2566("᩶ۤ")) * (-9);
                        i9 = ((iM2566 ^ i8) * 15703) ^ (-1025885497);
                        i10 = 2114852838;
                    }
                    break;
                case -55505722:
                case 373714518:
                    if (C0050.f910 >= 0) {
                        iM2566 = (C0630.m2566("۟ܽ") + i7) * 127;
                        i9 = ((iM2566 ^ i8) * 14365) ^ 1413934989;
                        i10 = 1735724467;
                    } else {
                        iM2566 = (i7 - C2105.m6981("ۘ᩻")) * (-29);
                        i9 = ((iM2566 ^ i8) * 9363) ^ 1994380439;
                        i10 = -1490233530;
                    }
                    break;
                case 96817790:
                case 2130300978:
                    c = 220;
                    if (RunnableC1937.m6387() != 0) {
                        iM2566 = C0630.m2566("᩻ܽ") ^ i7;
                        i9 = ((iM2566 ^ i8) * 5885) ^ (-607141088);
                        i10 = -1657434411;
                    } else {
                        iM2566 = (C0630.m2566("ۘۢ") + i8) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i9 = ((iM2566 ^ i7) * 4147) ^ 910585500;
                        i10 = 2055208479;
                    }
                    break;
                case 1165706358:
                case 2105622181:
                    i4 = 17399;
                    iM2566 = C2105.m6981("֫ۨ") ^ i7;
                    i9 = ((iM2566 ^ i8) * 17329) ^ 908620091;
                    i10 = 442734239;
                    break;
                case 1490706799:
                case 1981734613:
                    i = s + 1;
                    if (C11340.f33930 >= 0) {
                        iM2566 = (i8 - C0630.m2566("ۗۛ")) * (-7);
                        i9 = ((iM2566 ^ i7) * (-6563)) ^ (-1608939357);
                        i10 = 722456527;
                    } else {
                        iM2566 = C2105.m6981("᩻ۘ") ^ i8;
                        i9 = ((iM2566 ^ i7) * 18665) ^ 1476587188;
                        i10 = -813222675;
                    }
                    break;
                case 1644266271:
                case 1888959239:
                    C3663.m11168();
                    iM2566 = C0630.m2566("ܿۢ") ^ i8;
                    i9 = ((iM2566 ^ i7) * (-14777)) ^ (-386462446);
                    i10 = 1624064582;
                    break;
                default:
                    sArr = f21694;
                    if (C2126.m7040()) {
                        iM2566 = (i8 - C0630.m2566("ۗۛ")) * (-7);
                        i9 = ((iM2566 ^ i7) * (-6563)) ^ (-1608939357);
                        i10 = 722456527;
                    } else {
                        iM2566 = C0630.m2566("ۗᩴ") ^ i8;
                        i9 = ((iM2566 ^ i7) * 30925) ^ 2028270795;
                        i10 = 755560177;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00db  */
    /* JADX WARN: Code duplicated, block: B:62:0x01aa  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m19011(AbstractActivityC3346 abstractActivityC3346, boolean z) {
        int iM2566;
        int i;
        int i2 = -486218073;
        int i3 = C4263.f13799;
        int i4 = C2520.f8000;
        int iM2567 = (i4 - C0630.m2566("۟᩵")) * (-105);
        int i5 = ((iM2567 ^ i3) * 27487) ^ (-1904540044);
        int i6 = -2104304663;
        while (true) {
            int i7 = iM2567 ^ i6;
            RunnableC22375 runnableC22375 = null;
            while (true) {
                i2 = ((((i2 ^ i3) * (-30651)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2080624218:
                    case 1024636130:
                        if (C1916.f6442) {
                            iM2566 = (C2105.m6981("֨֫") + i4) * 81;
                            i5 = ((iM2566 ^ i3) * (-19197)) ^ 1123265878;
                            i = -2055399545;
                        } else {
                            iM2566 = C0630.m2566("᩹᩻") ^ i4;
                            i5 = ((iM2566 ^ i3) * (-8697)) ^ (-2090583904);
                            i = -1669107772;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -2075258940:
                    case 321245548:
                        if (!C1005.f3721) {
                        }
                        iM2566 = C0630.m2566("ܶ֡") ^ i4;
                        i5 = ((iM2566 ^ i3) * 27461) ^ 18131154;
                        i = 2000176963;
                        i7 = iM2566 ^ i;
                        break;
                        break;
                    case -2063150175:
                    case 112651468:
                        C3683.m11222();
                        if (C7811.f24123 >= 0) {
                        }
                        iM2566 = C2105.m6981("᩻ۚ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-8559)) ^ (-2084102429);
                        i = 1875695403;
                        i7 = iM2566 ^ i;
                        break;
                    case -1811660689:
                    case 1856379749:
                        int i8 = 0;
                        if (!C4159.f13567) {
                        }
                        runnableC22375 = new RunnableC22375(i8, abstractActivityC3346);
                        if (C1294.m4372() > 0) {
                            iM2566 = (C2105.m6981("ܺۧ") + i4) * 93;
                            i5 = ((iM2566 ^ i3) * 10351) ^ 1781567158;
                            i = 283656356;
                            i7 = iM2566 ^ i;
                        }
                        break;
                        break;
                        break;
                    case -1709094243:
                    case -56858052:
                        if (C0050.f910 >= 0) {
                            iM2566 = C0630.m2566("ۙۙ") ^ i4;
                            i5 = ((iM2566 ^ i3) * 17437) ^ 758067969;
                            i = -1928134728;
                        } else {
                            iM2566 = C2105.m6981("᩷ۤ") ^ i3;
                            i5 = ((iM2566 ^ i4) * 22251) ^ 1771259327;
                            i = -1214045245;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -1627310610:
                    case 1316999362:
                        C0483.m2121();
                        C0382.m1848();
                        iM2566 = C2105.m6981("᩻ۚ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-8559)) ^ (-2084102429);
                        i = 1875695403;
                        i7 = iM2566 ^ i;
                        break;
                    case -1440628992:
                    case -1009692069:
                        if (C3537.m10746() <= 0) {
                            iM2566 = C0630.m2566("᩹᩻") ^ i4;
                            i5 = ((iM2566 ^ i3) * (-8697)) ^ (-2090583904);
                            i = -1669107772;
                        } else {
                            ServiceConnectionC3453.m10570(abstractActivityC3346, new Intent(abstractActivityC3346, (Class<?>) ViewOnClickListenerC7042.class));
                            if (z) {
                                iM2566 = (C2105.m6981("᩸֨") + i3) * (-59);
                                i5 = ((iM2566 ^ i4) * (-18133)) ^ (-1927175506);
                                i = -2136866339;
                            } else {
                                iM2566 = C2105.m6981("ۙ᩺") ^ i3;
                                i5 = ((iM2566 ^ i4) * 11017) ^ (-966666256);
                                i = -663253083;
                            }
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -1411847623:
                    case -448198668:
                        C1294.m4383(runnableC22375, 300L);
                        iM2566 = C2105.m6981("ۙ᩺") ^ i3;
                        i5 = ((iM2566 ^ i4) * 11017) ^ (-966666256);
                        i = -663253083;
                        i7 = iM2566 ^ i;
                        break;
                    case -1058976935:
                    case -929345811:
                        C0798.m2998();
                        if (C0630.f2410 <= 0) {
                            iM2566 = C2105.m6981("᩻ۚ") ^ i4;
                            i5 = ((iM2566 ^ i3) * (-8559)) ^ (-2084102429);
                            i = 1875695403;
                        } else {
                            iM2566 = C0630.m2566("ۘۚ") ^ i3;
                            i5 = ((iM2566 ^ i4) * 15859) ^ (-1880002890);
                            i = -1419917372;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -977126322:
                    case 2146945841:
                        if (C5695.m16023() < 0) {
                            iM2566 = C0630.m2566("۬ܶ") ^ i4;
                            i5 = ((iM2566 ^ i3) * (-7631)) ^ (-1457455271);
                            i = 1407192032;
                            i7 = iM2566 ^ i;
                        }
                        break;
                    case -704467983:
                    case -666624386:
                        if (C2105.f7037 != 0) {
                            iM2566 = C0630.m2566("ۘۚ") ^ i3;
                            i5 = ((iM2566 ^ i4) * 15859) ^ (-1880002890);
                            i = -1419917372;
                        } else {
                            iM2566 = C2105.m6981("᩸ۗ") ^ i3;
                            i5 = ((iM2566 ^ i4) * (-19569)) ^ (-361133019);
                            i = -1341055565;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -462740288:
                    case 758462544:
                        AbstractC2021.m6574();
                        C21923.m49329();
                        break;
                    case -332707764:
                    case 1075303193:
                        break;
                    case 388294834:
                    case 1190762624:
                        C0483.m2121();
                        if (C21923.f70183 != 0) {
                        }
                        iM2566 = C0630.m2566("ۙۙ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 17437) ^ 758067969;
                        i = -1928134728;
                        i7 = iM2566 ^ i;
                        break;
                    case 996071195:
                    case 2104883337:
                        if (AbstractC2021.f6743 <= 0) {
                            iM2566 = C0630.m2566("ۘۚ") ^ i3;
                            i5 = ((iM2566 ^ i4) * 15859) ^ (-1880002890);
                            i = -1419917372;
                        } else {
                            iM2566 = C0630.m2566("֫۠") ^ i4;
                            i5 = ((iM2566 ^ i3) * (-3115)) ^ (-1618928369);
                            i = -1839477755;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    default:
                        if (C3537.f11231 < 0) {
                            iM2566 = (i3 - C2105.m6981("᩻֫")) * (-57);
                            i5 = ((iM2566 ^ i4) * (-23489)) ^ (-1588424197);
                            i = 667233049;
                            i7 = iM2566 ^ i;
                        }
                        break;
                }
                return;
            }
            iM2567 = C2105.m6981("֨۟") ^ i3;
            i5 = ((iM2567 ^ i4) * 30229) ^ 1071758995;
            i6 = -188885946;
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x023b A[PHI: r1 r6 r16
      0x023b: PHI (r1v4 short[]) = (r1v3 short[]), (r1v2 short[]), (r1v2 short[]) binds: [B:64:0x0239, B:48:0x0193, B:11:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x023b: PHI (r6v4 short) = (r6v2 short), (r6v3 short), (r6v2 short) binds: [B:64:0x0239, B:48:0x0193, B:11:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x023b: PHI (r16v22 l.ܿ᩸᩷) = (r16v5 l.ܿ᩸᩷), (r16v9 l.ܿ᩸᩷), (r16v23 l.ܿ᩸᩷) binds: [B:64:0x0239, B:48:0x0193, B:11:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x02bc A[PHI: r3 r4 r5 r8 r9 r16
      0x02bc: PHI (r3v4 short) = (r3v2 short), (r3v2 short), (r3v3 short), (r3v2 short), (r3v2 short) binds: [B:74:0x02ba, B:68:0x0270, B:56:0x01dd, B:52:0x01b8, B:30:0x00c6] A[DONT_GENERATE, DONT_INLINE]
      0x02bc: PHI (r4v4 short) = (r4v2 short), (r4v2 short), (r4v3 short), (r4v2 short), (r4v2 short) binds: [B:74:0x02ba, B:68:0x0270, B:56:0x01dd, B:52:0x01b8, B:30:0x00c6] A[DONT_GENERATE, DONT_INLINE]
      0x02bc: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:74:0x02ba, B:68:0x0270, B:56:0x01dd, B:52:0x01b8, B:30:0x00c6] A[DONT_GENERATE, DONT_INLINE]
      0x02bc: PHI (r8v3 short[]) = (r8v2 short[]), (r8v2 short[]), (r8v2 short[]), (r8v2 short[]), (r8v4 short[]) binds: [B:74:0x02ba, B:68:0x0270, B:56:0x01dd, B:52:0x01b8, B:30:0x00c6] A[DONT_GENERATE, DONT_INLINE]
      0x02bc: PHI (r9v3 int) = (r9v2 int), (r9v2 int), (r9v2 int), (r9v2 int), (r9v4 int) binds: [B:74:0x02ba, B:68:0x0270, B:56:0x01dd, B:52:0x01b8, B:30:0x00c6] A[DONT_GENERATE, DONT_INLINE]
      0x02bc: PHI (r16v14 l.ܿ᩸᩷) = (r16v3 l.ܿ᩸᩷), (r16v4 l.ܿ᩸᩷), (r16v7 l.ܿ᩸᩷), (r16v8 l.ܿ᩸᩷), (r16v15 l.ܿ᩸᩷) binds: [B:74:0x02ba, B:68:0x0270, B:56:0x01dd, B:52:0x01b8, B:30:0x00c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
    
        if (l.RunnableC3474.f10992 <= 0) goto L15;
     */
    @Override // l.ActivityC23809, l.ActivityC4927, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSaveInstanceState(Bundle bundle) {
        int iM6981;
        int i;
        int iM2566;
        int i2;
        C17625 c17625;
        C17625 c17626 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i3 = 0;
        short s3 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1892271295;
        int i8 = C0483.f2088;
        int i9 = C3746.f11829;
        int iM2567 = (C0630.m2566("ۤ֫") + i8) * (-87);
        int i10 = ((iM2567 ^ i9) * (-31057)) ^ (-1710212371);
        int i11 = -975743484;
        while (true) {
            int i12 = iM2567 ^ i11;
            while (true) {
                i7 = ((((i7 ^ i9) * (-15967)) >> 31) & i10) ^ i12;
                switch (i7) {
                    case -1940070176:
                    case -1671551292:
                        i4 = 32183;
                        iM6981 = C0630.m2566("ܺۗ") ^ i8;
                        i10 = ((iM6981 ^ i9) * 20397) ^ (-99175840);
                        i = 639301388;
                        i12 = iM6981 ^ i;
                        c17626 = c17626;
                        break;
                    case -1821817106:
                    case -426645626:
                        C1711.m5736();
                        break;
                    case -1635562971:
                    case -1397410363:
                        C3245.m9925();
                        c17626 = c17626;
                        iM6981 = C2105.m6981("֡֨") ^ i9;
                        i10 = ((iM6981 ^ i8) * 11757) ^ 1223467205;
                        i = -172967380;
                        i12 = iM6981 ^ i;
                        c17626 = c17626;
                        break;
                    case -1629197708:
                    case -520738776:
                        C0382.m1848();
                        break;
                    case -1060087956:
                    case 1211030497:
                        if (C4117.f13076 <= 0) {
                        }
                        c17626 = c17626;
                        iM6981 = (C0630.m2566("۠ۖ") ^ i9) * 101;
                        i10 = ((iM6981 ^ i8) * (-28881)) ^ 2070050084;
                        i = 1063400378;
                        i12 = iM6981 ^ i;
                        c17626 = c17626;
                        break;
                    case -950748349:
                    case -609449689:
                        c17626 = c17626;
                        sArr2 = f21694;
                        i5 = 208;
                        if (C4117.f13076 > 0) {
                            iM2566 = (C0630.m2566("ܺۜ") ^ i9) * (-83);
                            i10 = ((iM2566 ^ i8) * 24933) ^ (-1413900264);
                            i2 = -1954083780;
                            i12 = iM2566 ^ i2;
                            c17626 = c17626;
                        } else {
                            iM6981 = C2105.m6981("ܰᩳ") ^ i8;
                            i10 = ((iM6981 ^ i9) * 21791) ^ 1555388790;
                            i = 536082476;
                            i12 = iM6981 ^ i;
                            c17626 = c17626;
                        }
                        break;
                    case -892576684:
                    case 658457370:
                        c17626 = c17626;
                        s = sArr[c];
                        s2 = 4651;
                        if (C0798.f2919) {
                            iM6981 = C2105.m6981("ܰᩳ") ^ i8;
                            i10 = ((iM6981 ^ i9) * 21791) ^ 1555388790;
                            i = 536082476;
                        } else {
                            iM6981 = (i9 - C0630.m2566("ۡܺ")) * (-101);
                            i10 = ((iM6981 ^ i8) * 25619) ^ 1404144970;
                            i = -1269781154;
                        }
                        i12 = iM6981 ^ i;
                        c17626 = c17626;
                        break;
                    case -851130843:
                    case 721513190:
                        c17626 = c17626;
                        if (RunnableC1937.f6483 >= 0) {
                            iM6981 = C2105.m6981("ܰᩳ") ^ i8;
                            i10 = ((iM6981 ^ i9) * 21791) ^ 1555388790;
                            i = 536082476;
                        } else {
                            iM6981 = (C0630.m2566("᩶ۘ") + i9) * 79;
                            i10 = ((iM6981 ^ i8) * (-17167)) ^ (-958113763);
                            i = -2070846496;
                        }
                        i12 = iM6981 ^ i;
                        c17626 = c17626;
                        break;
                    case -657615814:
                    case 836409813:
                        c17626 = c17626;
                        int i13 = s + s2;
                        i3 = i13 * i13;
                        if (C2105.f7037 != 0) {
                            iM6981 = C2105.m6981("ܰᩳ") ^ i8;
                            i10 = ((iM6981 ^ i9) * 21791) ^ 1555388790;
                            i = 536082476;
                        } else {
                            iM6981 = (C2105.m6981("᩶ۗ") ^ i8) * (-57);
                            i10 = ((iM6981 ^ i9) * 18217) ^ 409873975;
                            i = 981762379;
                        }
                        i12 = iM6981 ^ i;
                        c17626 = c17626;
                        break;
                    case -278631970:
                    case 176631074:
                        c17626 = c17626;
                        if (C4117.f13076 <= 0) {
                            iM6981 = C2105.m6981("ܰᩳ") ^ i8;
                            i10 = ((iM6981 ^ i9) * 21791) ^ 1555388790;
                            i = 536082476;
                        } else {
                            iM6981 = (C2105.m6981("۠ᩴ") + i8) * (-13);
                            i10 = ((iM6981 ^ i9) * (-22221)) ^ 1432609470;
                            i = 62054494;
                        }
                        i12 = iM6981 ^ i;
                        c17626 = c17626;
                        break;
                    case -135136621:
                    case 2146182662:
                        bundle.putString(C3911.m11919(sArr2, i5, i6, i4), c17626.f53845);
                        c17625 = c17626;
                        int iM2568 = (i9 - C0630.m2566("֨֡")) * (-73);
                        c17626 = c17625;
                        i12 = iM2568 ^ (-1110241957);
                        i10 = ((iM2568 ^ i8) * (-24103)) ^ 1841096913;
                        c17626 = c17626;
                        break;
                    case -113686574:
                    case 572260717:
                        C17625 c17627 = this.f21695;
                        if (c17627 != null) {
                            int iM6982 = C2105.m6981("ܽۛ") ^ i8;
                            i12 = iM6982 ^ 76494874;
                            i10 = ((iM6982 ^ i9) * (-14183)) ^ 1553997948;
                            c17626 = c17627;
                        } else {
                            c17625 = c17627;
                            int iM2569 = (i9 - C0630.m2566("֨֡")) * (-73);
                            c17626 = c17625;
                            i12 = iM2569 ^ (-1110241957);
                            i10 = ((iM2569 ^ i8) * (-24103)) ^ 1841096913;
                            c17626 = c17626;
                        }
                        break;
                    case 4218166:
                    case 19837639:
                        c17626 = c17626;
                        if (i3 - (s * s3) < 0) {
                            iM6981 = C2105.m6981("ۡۤ") ^ i8;
                            i10 = ((iM6981 ^ i9) * (-29433)) ^ 1616777799;
                            i = 1400859328;
                        } else {
                            iM6981 = C2105.m6981("ܽۙ") ^ i9;
                            i10 = ((iM6981 ^ i8) * (-23153)) ^ (-1706727159);
                            i = 1855186183;
                        }
                        i12 = iM6981 ^ i;
                        c17626 = c17626;
                        break;
                    case 68885700:
                    case 643788708:
                        c17626 = c17626;
                        c = 207;
                        if (C1504.f5354) {
                            iM6981 = C0630.m2566("ۖ᩺") ^ i8;
                            i10 = ((iM6981 ^ i9) * (-23871)) ^ 1875760222;
                            i = 1070960719;
                        } else {
                            iM6981 = (C0630.m2566("ۧᩴ") ^ i8) * (-107);
                            i10 = ((iM6981 ^ i9) * (-613)) ^ (-599468225);
                            i = -1691995364;
                        }
                        i12 = iM6981 ^ i;
                        c17626 = c17626;
                        break;
                    case 108547131:
                    case 811389741:
                        C4616.m13552();
                        if (C1128.f4106 > 0) {
                            c17626 = c17626;
                            iM6981 = C0630.m2566("ۖ᩺") ^ i8;
                            i10 = ((iM6981 ^ i9) * (-23871)) ^ 1875760222;
                            i = 1070960719;
                            i12 = iM6981 ^ i;
                            c17626 = c17626;
                        }
                        c17626 = c17626;
                        iM6981 = C2105.m6981("֡֨") ^ i9;
                        i10 = ((iM6981 ^ i8) * 11757) ^ 1223467205;
                        i = -172967380;
                        i12 = iM6981 ^ i;
                        c17626 = c17626;
                        break;
                    case 139086558:
                    case 1047408913:
                        i4 = 43867;
                        iM6981 = C0630.m2566("ܺۗ") ^ i8;
                        i10 = ((iM6981 ^ i9) * 20397) ^ (-99175840);
                        i = 639301388;
                        i12 = iM6981 ^ i;
                        c17626 = c17626;
                        break;
                    case 300866799:
                    case 1020663073:
                        super.onSaveInstanceState(bundle);
                        break;
                    case 412404305:
                    case 1799565861:
                        c17626 = c17626;
                        s3 = 18604;
                        if (C1128.f4106 <= 0) {
                            iM6981 = (C0630.m2566("۠ۖ") ^ i9) * 101;
                            i10 = ((iM6981 ^ i8) * (-28881)) ^ 2070050084;
                            i = 1063400378;
                        } else {
                            iM6981 = (C0630.m2566("ᩴᩳ") ^ i9) * 57;
                            i10 = ((iM6981 ^ i8) * 29709) ^ 602767940;
                            i = -408565107;
                        }
                        i12 = iM6981 ^ i;
                        c17626 = c17626;
                        break;
                    case 753639303:
                    case 909229575:
                        c17626 = c17626;
                        i6 = 12;
                        if (C5695.f17556 < 0) {
                            iM2566 = (i8 - C0630.m2566("ۙᩳ")) * 55;
                            i10 = ((iM2566 ^ i9) * (-20073)) ^ (-104939213);
                            i2 = 127257148;
                            i12 = iM2566 ^ i2;
                            c17626 = c17626;
                        } else {
                            iM6981 = C0630.m2566("ۖ᩺") ^ i8;
                            i10 = ((iM6981 ^ i9) * (-23871)) ^ 1875760222;
                            i = 1070960719;
                            i12 = iM6981 ^ i;
                            c17626 = c17626;
                        }
                        break;
                    case 941089374:
                    case 983424457:
                        c17626 = c17626;
                        sArr = f21694;
                        if (C0422.m1963()) {
                            iM6981 = (i8 - C2105.m6981("ۡۗ")) * 65;
                            i10 = ((iM6981 ^ i9) * (-12541)) ^ 2008908344;
                            i = -2120246647;
                        } else {
                            iM6981 = (C0630.m2566("۠ۖ") ^ i9) * 101;
                            i10 = ((iM6981 ^ i8) * (-28881)) ^ 2070050084;
                            i = 1063400378;
                        }
                        i12 = iM6981 ^ i;
                        c17626 = c17626;
                        break;
                    default:
                        c17626 = c17626;
                        if (C0483.f2088 >= 0) {
                            iM6981 = C2105.m6981("֡֨") ^ i9;
                            i10 = ((iM6981 ^ i8) * 11757) ^ 1223467205;
                            i = -172967380;
                        } else {
                            iM6981 = (i9 - C0630.m2566("ۚܺ")) * (-85);
                            i10 = ((iM6981 ^ i8) * 16945) ^ (-724888297);
                            i = 392658482;
                        }
                        i12 = iM6981 ^ i;
                        c17626 = c17626;
                        break;
                }
                return;
            }
            iM2567 = (C0630.m2566("֫ܶ") ^ i9) * (-101);
            i10 = ((iM2567 ^ i8) * 22021) ^ (-1045684917);
            i11 = 1537349463;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:76:0x0355 A[PHI: r8 r21 r33
      0x0355: PHI (r8v4 android.view.View) = (r8v3 android.view.View), (r8v1 android.view.View), (r8v1 android.view.View) binds: [B:74:0x033e, B:70:0x0304, B:57:0x026d] A[DONT_GENERATE, DONT_INLINE]
      0x0355: PHI (r21v6 l.ܿ᩸᩷) = (r21v1 l.ܿ᩸᩷), (r21v2 l.ܿ᩸᩷), (r21v1 l.ܿ᩸᩷) binds: [B:74:0x033e, B:70:0x0304, B:57:0x026d] A[DONT_GENERATE, DONT_INLINE]
      0x0355: PHI (r33v55 int) = (r33v50 int), (r33v52 int), (r33v57 int) binds: [B:74:0x033e, B:70:0x0304, B:57:0x026d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public void m19021() {
        int iM6981;
        int i;
        int i2;
        String str;
        int iM6982;
        int i3;
        int iM2566;
        int i4;
        int i5;
        int i6;
        short[] sArr;
        int i7;
        View view;
        int i8;
        int iM6983;
        int i9;
        int i10;
        String strM10562;
        View view2;
        int i11;
        Resources resourcesM14338;
        int iM6984;
        int i12;
        int i13;
        int iM2567;
        int i14;
        ViewOnClickListenerC7042 viewOnClickListenerC7042 = this;
        TextView textView = null;
        String str2 = null;
        View viewM3409 = null;
        int i15 = 0;
        C17625 c17625 = null;
        String strM2128 = null;
        int iM6985 = 0;
        int iM6986 = 0;
        int i16 = 0;
        short s = 0;
        short s2 = 0;
        int i17 = -57951308;
        int i18 = C3911.f12484;
        int i19 = C1047.f3863;
        int iM2568 = C0630.m2566("۟۫") ^ i18;
        int i20 = ((iM2568 ^ i19) * 27439) ^ 313620870;
        int i21 = iM2568 ^ 2013093083;
        TextView textView2 = null;
        Resources resources = null;
        Long lM12360 = null;
        Button button = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        boolean zM51456 = false;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        Object[] objArr = null;
        View viewM34010 = null;
        View viewM12813 = null;
        String strM51461 = null;
        View viewM12814 = null;
        View viewM34011 = null;
        long jM51466 = 0;
        int i31 = 0;
        while (true) {
            i17 = i21 ^ (i20 & (((i17 ^ i19) * (-21781)) >> 31));
            switch (i17) {
                case -2146905951:
                case -737948908:
                    i22 = i22;
                    i23 = i23;
                    resources = resources;
                    i26 = i26;
                    sArr2 = sArr2;
                    i28 = i28;
                    sArr3 = sArr3;
                    i29 = i29;
                    viewM12813 = viewM12813;
                    String str3 = strM51461;
                    textView2 = textView2;
                    str = str3;
                    if (((s * s) + 18593344) - (s * s2) < 0) {
                        iM6982 = (C2105.m6981("ۗۙ") + i18) * (-99);
                        i20 = ((iM6982 ^ i19) * (-16037)) ^ (-1785544415);
                        i3 = 1011123234;
                    } else {
                        iM6982 = C0630.m2566("۫᩷") ^ i18;
                        i20 = ((iM6982 ^ i19) * 17265) ^ 1859438698;
                        i3 = -1414328852;
                    }
                    i21 = iM6982 ^ i3;
                    viewOnClickListenerC7042 = this;
                    i28 = i28;
                    viewM12813 = viewM12813;
                    i29 = i29;
                    sArr3 = sArr3;
                    i22 = i22;
                    sArr2 = sArr2;
                    resources = resources;
                    i26 = i26;
                    i23 = i23;
                    TextView textView3 = textView2;
                    strM51461 = str;
                    textView2 = textView3;
                    break;
                case -2099943830:
                case -1985134281:
                    i22 = 0;
                    iM2567 = (i18 - C2105.m6981("᩺ۙ")) * (-69);
                    i12 = ((iM2567 ^ i19) * (-26641)) ^ 1571829757;
                    i14 = -856971478;
                    i21 = iM2567 ^ i14;
                    i20 = i12;
                    i23 = i23;
                    break;
                case -2032791558:
                case 1059378662:
                    resources = resources;
                    i8 = i26;
                    strM10562 = ServiceConnectionC3453.m10562(C2105.m6981(C4117.m12355(f21694, 46, 3, i25)) ^ 2127017537);
                    str2 = strM10562;
                    iM6983 = C0630.m2566("ۙ᩷") ^ i19;
                    i9 = ((iM6983 ^ i18) * 16111) ^ (-1189111328);
                    i10 = 445090378;
                    i21 = iM6983 ^ i10;
                    i20 = i9;
                    i26 = i8;
                    viewM12813 = viewM12813;
                    resources = resources;
                    i23 = i23;
                    break;
                case -1986583463:
                case -77473250:
                    str = strM51461;
                    i25 = 28792;
                    iM6982 = C2105.m6981("᩸۫") ^ i19;
                    i20 = ((iM6982 ^ i18) * 1285) ^ (-422148924);
                    i3 = -426411462;
                    i21 = iM6982 ^ i3;
                    viewOnClickListenerC7042 = this;
                    i28 = i28;
                    viewM12813 = viewM12813;
                    i29 = i29;
                    sArr3 = sArr3;
                    i22 = i22;
                    sArr2 = sArr2;
                    resources = resources;
                    i26 = i26;
                    i23 = i23;
                    TextView textView4 = textView2;
                    strM51461 = str;
                    textView2 = textView4;
                    break;
                case -1883656265:
                case 745845853:
                    if (zM51456) {
                        iM6981 = (i19 - C0630.m2566("ۛᩳ")) * (-77);
                        i = ((iM6981 ^ i18) * (-22837)) ^ 573176502;
                        i2 = -1644944983;
                    } else {
                        iM6981 = (C0630.m2566("ۨۗ") + i18) * 77;
                        i = ((iM6981 ^ i19) * 16377) ^ 1475881617;
                        i2 = -618407029;
                    }
                    i21 = iM6981 ^ i2;
                    i20 = i;
                    break;
                case -1869230373:
                case -1792607122:
                    i23 = i23;
                    resources = resources;
                    i26 = i26;
                    sArr3 = sArr3;
                    i29 = i29;
                    viewM12813 = viewM12813;
                    String str4 = strM51461;
                    textView2 = textView2;
                    str = str4;
                    i22 = i22;
                    short[] sArr4 = sArr2;
                    i28 = i28;
                    iM6985 = C2105.m6981(C22628.m50602(sArr4, i28, 3, i25));
                    if (RunnableC0588.f2309 < 0) {
                        iM2566 = C0630.m2566("ܰ᩻") ^ i19;
                        sArr2 = sArr4;
                        i4 = ((iM2566 ^ i18) * 8733) ^ 1790687560;
                        i5 = 302480218;
                        i21 = iM2566 ^ i5;
                        i20 = i4;
                        i28 = i28;
                        viewM12813 = viewM12813;
                        i29 = i29;
                        sArr3 = sArr3;
                        i22 = i22;
                        sArr2 = sArr2;
                        resources = resources;
                        i26 = i26;
                        i23 = i23;
                        TextView textView5 = textView2;
                        strM51461 = str;
                        textView2 = textView5;
                    } else {
                        sArr2 = sArr4;
                        iM6982 = C0630.m2566("ܶۧ") ^ i19;
                        i20 = ((iM6982 ^ i18) * 29657) ^ (-1935966285);
                        i3 = -1976982222;
                        i21 = iM6982 ^ i3;
                        viewOnClickListenerC7042 = this;
                        i28 = i28;
                        viewM12813 = viewM12813;
                        i29 = i29;
                        sArr3 = sArr3;
                        i22 = i22;
                        sArr2 = sArr2;
                        resources = resources;
                        i26 = i26;
                        i23 = i23;
                        TextView textView6 = textView2;
                        strM51461 = str;
                        textView2 = textView6;
                    }
                    break;
                case -1860263646:
                case 1898515156:
                    i22 = i22;
                    i23 = i23;
                    resources = resources;
                    i26 = i26;
                    sArr2 = sArr2;
                    i28 = i28;
                    sArr3 = sArr3;
                    i29 = i29;
                    viewM12813 = viewM12813;
                    String str5 = strM51461;
                    textView2 = textView2;
                    str = str5;
                    s = f21694[33];
                    s2 = 8624;
                    if (!C0382.f1805) {
                        i29 = i29;
                        sArr3 = sArr3;
                        int iM6987 = C2105.m6981("᩸֫") ^ i18;
                        i20 = ((iM6987 ^ i19) * 1047) ^ 793078888;
                        i21 = iM6987 ^ 1704353179;
                        viewOnClickListenerC7042 = this;
                        i28 = i28;
                        i26 = i26;
                        viewM12813 = viewM12813;
                        i22 = i22;
                        sArr2 = sArr2;
                        resources = resources;
                        i23 = i23;
                        TextView textView7 = textView2;
                        strM51461 = str;
                        textView2 = textView7;
                    } else {
                        iM6982 = (i19 - C2105.m6981("᩺ܽ")) * 81;
                        i20 = ((iM6982 ^ i18) * 5441) ^ 474044582;
                        i3 = 1106995687;
                        i21 = iM6982 ^ i3;
                        viewOnClickListenerC7042 = this;
                        i28 = i28;
                        viewM12813 = viewM12813;
                        i29 = i29;
                        sArr3 = sArr3;
                        i22 = i22;
                        sArr2 = sArr2;
                        resources = resources;
                        i26 = i26;
                        i23 = i23;
                        TextView textView8 = textView2;
                        strM51461 = str;
                        textView2 = textView8;
                    }
                    break;
                case -1845587723:
                case -760414565:
                    i22 = 8;
                    iM2567 = (i18 - C2105.m6981("᩺ۙ")) * (-69);
                    i12 = ((iM2567 ^ i19) * (-26641)) ^ 1571829757;
                    i14 = -856971478;
                    i21 = iM2567 ^ i14;
                    i20 = i12;
                    i23 = i23;
                    break;
                case -1814410224:
                case -449822252:
                    i23 = i23;
                    if (c17625.f53846) {
                        i24 = i27;
                        iM2567 = (i18 - C2105.m6981("ܺ᩺")) * (-57);
                        i12 = ((iM2567 ^ i19) * 19901) ^ (-788488632);
                        i14 = 1877122727;
                    } else {
                        iM2567 = C2105.m6981("ۛۘ") ^ i19;
                        i12 = ((iM2567 ^ i18) * 5959) ^ 211977356;
                        i14 = -453918907;
                    }
                    i21 = iM2567 ^ i14;
                    i20 = i12;
                    i23 = i23;
                    break;
                case -1762927683:
                case 1089376276:
                    if (!C4159.f13567) {
                        iM6981 = C2105.m6981("ۗ᩸") ^ i18;
                        i = ((iM6981 ^ i19) * 889) ^ 1253543393;
                        i2 = 1247157115;
                        i21 = iM6981 ^ i2;
                        i20 = i;
                    } else {
                        i23 = i23;
                        resources = resources;
                        i26 = i26;
                        sArr2 = sArr2;
                        i28 = i28;
                        sArr3 = sArr3;
                        i29 = i29;
                        viewM12813 = viewM12813;
                        String str6 = strM51461;
                        textView2 = textView2;
                        str = str6;
                        iM2566 = C0630.m2566("ۖܶ") ^ i18;
                        i4 = ((iM2566 ^ i19) * (-12741)) ^ (-1560399347);
                        i5 = -961673558;
                        i21 = iM2566 ^ i5;
                        i20 = i4;
                        i28 = i28;
                        viewM12813 = viewM12813;
                        i29 = i29;
                        sArr3 = sArr3;
                        i22 = i22;
                        sArr2 = sArr2;
                        resources = resources;
                        i26 = i26;
                        i23 = i23;
                        TextView textView9 = textView2;
                        strM51461 = str;
                        textView2 = textView9;
                    }
                    break;
                case -1744871011:
                case 480963683:
                    i23 = i23;
                    C1047.m3601(textView, str2);
                    viewM3409 = C0964.m3409(viewOnClickListenerC7042, C0630.m2566(C7811.m20837(f21694, 52, 3, i25)) ^ 2120897410);
                    if (zM51456) {
                        iM2567 = (i19 - C2105.m6981("ۙܽ")) * (-13);
                        i12 = ((iM2567 ^ i18) * (-12181)) ^ (-2045599158);
                        i14 = -146408991;
                    } else {
                        iM2567 = C0630.m2566("ۤᩳ") ^ i18;
                        i12 = ((iM2567 ^ i19) * 6369) ^ (-914145816);
                        i14 = -1009665136;
                    }
                    i21 = iM2567 ^ i14;
                    i20 = i12;
                    i23 = i23;
                    break;
                case -1708201611:
                case 880051335:
                    if (!C1711.f5919) {
                        iM6981 = (C2105.m6981("ᩴ᩶") + i19) * (-37);
                        i = ((iM6981 ^ i18) * (-23249)) ^ 1838827050;
                        i2 = -1703119617;
                        i21 = iM6981 ^ i2;
                        i20 = i;
                    } else {
                        i6 = i22;
                        i23 = i23;
                        resources = resources;
                        i26 = i26;
                        sArr = sArr3;
                        i7 = i29;
                        view = viewM12813;
                        int iM6988 = (i19 - C2105.m6981("ۘᩳ")) * (-27);
                        i21 = iM6988 ^ (-2103753733);
                        i20 = ((iM6988 ^ i18) * (-12835)) ^ 749047566;
                        viewM12813 = view;
                        i29 = i7;
                        sArr3 = sArr;
                        i22 = i6;
                        resources = resources;
                        i26 = i26;
                        i23 = i23;
                    }
                    break;
                case -1705313389:
                case 354031940:
                    C2105.m6978(button, C2105.m6981(C3019.m9250(f21694, 73, 3, i25)) ^ 2125233322);
                    iM2567 = C2105.m6981("᩻᩶") ^ i18;
                    i12 = ((iM2567 ^ i19) * 14275) ^ 396089695;
                    i14 = -896213741;
                    i21 = iM2567 ^ i14;
                    i20 = i12;
                    i23 = i23;
                    break;
                case -1688152806:
                case 666314430:
                    i15 = 8;
                    iM2567 = C2105.m6981("᩺᩶") ^ i18;
                    i12 = ((iM2567 ^ i19) * 13623) ^ 340209856;
                    i14 = -1424265159;
                    i21 = iM2567 ^ i14;
                    i20 = i12;
                    i23 = i23;
                    break;
                case -1622670417:
                case 1810777120:
                    i22 = i22;
                    i23 = i23;
                    resources = resources;
                    i26 = i26;
                    sArr2 = sArr2;
                    i28 = i28;
                    sArr3 = sArr3;
                    i29 = i29;
                    viewM12813 = viewM12813;
                    String str7 = strM51461;
                    textView2 = textView2;
                    str = str7;
                    zM51456 = C23196.m51456();
                    strM2128 = C0483.m2128(f21694, 34, 3, i25);
                    if (C0964.f3626 != 0) {
                        iM6982 = C0630.m2566("ܶۧ") ^ i19;
                        i20 = ((iM6982 ^ i18) * 29657) ^ (-1935966285);
                        i3 = -1976982222;
                    } else {
                        iM6982 = C2105.m6981("ۚܽ") ^ i18;
                        i20 = ((iM6982 ^ i19) * (-12011)) ^ 977146775;
                        i3 = 1411505670;
                    }
                    i21 = iM6982 ^ i3;
                    viewOnClickListenerC7042 = this;
                    i28 = i28;
                    viewM12813 = viewM12813;
                    i29 = i29;
                    sArr3 = sArr3;
                    i22 = i22;
                    sArr2 = sArr2;
                    resources = resources;
                    i26 = i26;
                    i23 = i23;
                    TextView textView10 = textView2;
                    strM51461 = str;
                    textView2 = textView10;
                    break;
                case -1619032200:
                case 375863307:
                    i23 = i23;
                    resources = resources;
                    i26 = i26;
                    sArr = sArr3;
                    i7 = i29;
                    view = viewM12813;
                    textView2 = (TextView) C4263.m12813(viewOnClickListenerC7042, iM6985 ^ 2127116202);
                    strM51461 = C23196.m51461();
                    if (RunnableC0588.f2309 >= 0) {
                        i6 = i22;
                        int iM6989 = (i19 - C2105.m6981("ۘᩳ")) * (-27);
                        i21 = iM6989 ^ (-2103753733);
                        i20 = ((iM6989 ^ i18) * (-12835)) ^ 749047566;
                        viewM12813 = view;
                        i29 = i7;
                        sArr3 = sArr;
                        i22 = i6;
                    } else {
                        int iM69810 = (C2105.m6981("֨ۗ") ^ i18) * (-13);
                        i21 = iM69810 ^ 1159087155;
                        i20 = ((iM69810 ^ i19) * 16393) ^ (-374726771);
                        viewM12813 = view;
                        i29 = i7;
                        sArr3 = sArr;
                    }
                    resources = resources;
                    i26 = i26;
                    i23 = i23;
                    break;
                case -1538240667:
                case -1524965514:
                    i23 = i23;
                    if (C1711.m5729()) {
                        iM2567 = (C2105.m6981("ܶܶ") + i19) * 53;
                        i12 = ((iM2567 ^ i18) * 23027) ^ (-1793109393);
                        i14 = -799924242;
                    } else {
                        iM2567 = (C2105.m6981("᩶۟") ^ i18) * 21;
                        i12 = ((iM2567 ^ i19) * 12075) ^ (-525920971);
                        i14 = -2043484867;
                    }
                    i21 = iM2567 ^ i14;
                    i20 = i12;
                    i23 = i23;
                    break;
                case -1526092793:
                case -1522862605:
                    i23 = i23;
                    resources = resources;
                    i26 = i26;
                    short[] sArr5 = sArr3;
                    int i32 = i30;
                    View view3 = viewM12813;
                    int i33 = i29;
                    TextView textView11 = (TextView) C0964.m3409(viewOnClickListenerC7042, C2105.m6981(C2167.m7159(sArr5, i33, i32, i25)) ^ 2101797075);
                    i27 = 0;
                    if (!C23196.m51456()) {
                        int iM69811 = (C2105.m6981("ᩳۛ") ^ i19) * 69;
                        i21 = iM69811 ^ 1281956499;
                        i20 = ((iM69811 ^ i18) * (-4603)) ^ 1258389468;
                        i30 = i32;
                        viewM12813 = view3;
                        i29 = i33;
                        sArr3 = sArr5;
                        textView = textView11;
                        resources = resources;
                        i26 = i26;
                        i23 = i23;
                    } else {
                        int iM2569 = (i18 - C0630.m2566("ܺۜ")) * (-93);
                        i20 = ((iM2569 ^ i19) * 28925) ^ (-600591559);
                        i21 = iM2569 ^ 90568597;
                        i29 = i33;
                        i30 = i32;
                        i26 = i26;
                        viewM12813 = view3;
                        sArr3 = sArr5;
                        textView = textView11;
                        resources = resources;
                        i23 = i23;
                    }
                    break;
                case -1486150152:
                case 391162870:
                    C4075.m12263();
                    if (C0630.f2410 > 0) {
                        i23 = i23;
                        resourcesM14338 = resources;
                        i11 = i26;
                        view2 = viewM12813;
                        iM6984 = C0630.m2566("᩻ۢ") ^ i19;
                        i12 = ((iM6984 ^ i18) * (-8581)) ^ 1605163475;
                        i13 = -1638419861;
                        i21 = iM6984 ^ i13;
                        i26 = i11;
                        viewM12813 = view2;
                        resources = resourcesM14338;
                        i20 = i12;
                        i23 = i23;
                    } else {
                        i23 = i23;
                        resources = resources;
                        i26 = i26;
                        sArr2 = sArr2;
                        i28 = i28;
                        sArr3 = sArr3;
                        i29 = i29;
                        viewM12813 = viewM12813;
                        String str8 = strM51461;
                        textView2 = textView2;
                        str = str8;
                        iM2566 = C0630.m2566("ۖܶ") ^ i18;
                        i4 = ((iM2566 ^ i19) * (-12741)) ^ (-1560399347);
                        i5 = -961673558;
                        i21 = iM2566 ^ i5;
                        i20 = i4;
                        i28 = i28;
                        viewM12813 = viewM12813;
                        i29 = i29;
                        sArr3 = sArr3;
                        i22 = i22;
                        sArr2 = sArr2;
                        resources = resources;
                        i26 = i26;
                        i23 = i23;
                        TextView textView12 = textView2;
                        strM51461 = str;
                        textView2 = textView12;
                    }
                    break;
                case -1447611457:
                case -980165797:
                    i23 = -14540254;
                    iM6981 = (C2105.m6981("ۢۜ") ^ i19) * 85;
                    i = ((iM6981 ^ i18) * 933) ^ 151276587;
                    i2 = 411938488;
                    i21 = iM6981 ^ i2;
                    i20 = i;
                    break;
                case -1397369873:
                case 1443630491:
                    C1504.m5179();
                    break;
                case -1295899728:
                case -1176090260:
                    i22 = i22;
                    i23 = i23;
                    resources = resources;
                    i26 = i26;
                    sArr2 = sArr2;
                    i28 = i28;
                    sArr3 = sArr3;
                    i29 = i29;
                    viewM12813 = viewM12813;
                    String str9 = strM51461;
                    textView2 = textView2;
                    str = str9;
                    viewM34010 = C0964.m3409(viewOnClickListenerC7042, C0630.m2566(strM2128) ^ 2125806386);
                    if (C7106.f21815 != 0) {
                        iM2566 = C0630.m2566("ۖܶ") ^ i18;
                        i4 = ((iM2566 ^ i19) * (-12741)) ^ (-1560399347);
                        i5 = -961673558;
                    } else {
                        iM2566 = C0630.m2566("֡ۚ") ^ i19;
                        i4 = ((iM2566 ^ i18) * 9305) ^ (-1868996244);
                        i5 = -2090202338;
                    }
                    i21 = iM2566 ^ i5;
                    i20 = i4;
                    i28 = i28;
                    viewM12813 = viewM12813;
                    i29 = i29;
                    sArr3 = sArr3;
                    i22 = i22;
                    sArr2 = sArr2;
                    resources = resources;
                    i26 = i26;
                    i23 = i23;
                    TextView textView13 = textView2;
                    strM51461 = str;
                    textView2 = textView13;
                    break;
                case -1284274946:
                case -1124957204:
                    i23 = i23;
                    C17625 c17626 = viewOnClickListenerC7042.f21695;
                    if (c17626 != null) {
                        int iM69812 = (C2105.m6981("᩺֫") ^ i18) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i21 = iM69812 ^ 1633466464;
                        c17625 = c17626;
                        i20 = ((iM69812 ^ i19) * 443) ^ (-1044668501);
                    } else {
                        c17625 = c17626;
                        iM2567 = C2105.m6981("ۛۘ") ^ i19;
                        i12 = ((iM2567 ^ i18) * 5959) ^ 211977356;
                        i14 = -453918907;
                        i21 = iM2567 ^ i14;
                        i20 = i12;
                    }
                    i23 = i23;
                    break;
                case -1175171941:
                case 529318804:
                    i23 = i23;
                    C1128.m3853(viewM12814, i31);
                    viewM34011 = C0964.m3409(viewOnClickListenerC7042, C0630.m2566(C0630.m2575(f21694, 61, 3, i25)) ^ 2102501683);
                    if (zM51456) {
                        iM2567 = C2105.m6981("ۛۘ") ^ i19;
                        i12 = ((iM2567 ^ i18) * 5959) ^ 211977356;
                        i14 = -453918907;
                    } else {
                        iM2567 = C0630.m2566("ۖ֫") ^ i18;
                        i12 = ((iM2567 ^ i19) * 3375) ^ (-1562254635);
                        i14 = 1511095404;
                    }
                    i21 = iM2567 ^ i14;
                    i20 = i12;
                    i23 = i23;
                    break;
                case -1153112420:
                case 122766890:
                    C21923.m49329();
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = C2105.m6981("۬᩹") ^ i18;
                        i = ((iM6981 ^ i19) * 14299) ^ 651763801;
                        i2 = -761834593;
                        i21 = iM6981 ^ i2;
                        i20 = i;
                    } else {
                        i23 = i23;
                        resources = resources;
                        viewM12813 = viewM12813;
                        int iM25610 = C0630.m2566("۬֫") ^ i18;
                        i21 = iM25610 ^ (-1674251185);
                        i20 = ((iM25610 ^ i19) * (-10159)) ^ (-1114687640);
                        viewM12813 = viewM12813;
                        resources = resources;
                        i23 = i23;
                    }
                    break;
                case -1096340006:
                case 1770611057:
                    i23 = i23;
                    i24 = 8;
                    iM2567 = (i18 - C2105.m6981("ܺ᩺")) * (-57);
                    i12 = ((iM2567 ^ i19) * 19901) ^ (-788488632);
                    i14 = 1877122727;
                    i21 = iM2567 ^ i14;
                    i20 = i12;
                    i23 = i23;
                    break;
                case -1015615375:
                case 624061834:
                    i15 = 0;
                    iM2567 = C2105.m6981("᩺᩶") ^ i18;
                    i12 = ((iM2567 ^ i19) * 13623) ^ 340209856;
                    i14 = -1424265159;
                    i21 = iM2567 ^ i14;
                    i20 = i12;
                    i23 = i23;
                    break;
                case -983218971:
                case -344779809:
                    i31 = 8;
                    iM2567 = C0630.m2566("۬۟") ^ i18;
                    i12 = ((iM2567 ^ i19) * (-13677)) ^ 1149450130;
                    i14 = 1595389949;
                    i21 = iM2567 ^ i14;
                    i20 = i12;
                    i23 = i23;
                    break;
                case -888799129:
                case 101914897:
                    AbstractC2021.m6574();
                    if (!C0422.m1963()) {
                        i23 = i23;
                        resources = resources;
                        viewM12813 = viewM12813;
                        int iM25611 = C0630.m2566("۬֫") ^ i18;
                        i21 = iM25611 ^ (-1674251185);
                        i20 = ((iM25611 ^ i19) * (-10159)) ^ (-1114687640);
                        viewM12813 = viewM12813;
                        resources = resources;
                        i23 = i23;
                    } else {
                        i23 = i23;
                        resources = resources;
                        i26 = i26;
                        sArr2 = sArr2;
                        i28 = i28;
                        sArr3 = sArr3;
                        i29 = i29;
                        viewM12813 = viewM12813;
                        String str10 = strM51461;
                        textView2 = textView2;
                        str = str10;
                        iM2566 = C0630.m2566("ۖܶ") ^ i18;
                        i4 = ((iM2566 ^ i19) * (-12741)) ^ (-1560399347);
                        i5 = -961673558;
                        i21 = iM2566 ^ i5;
                        i20 = i4;
                        i28 = i28;
                        viewM12813 = viewM12813;
                        i29 = i29;
                        sArr3 = sArr3;
                        i22 = i22;
                        sArr2 = sArr2;
                        resources = resources;
                        i26 = i26;
                        i23 = i23;
                        TextView textView14 = textView2;
                        strM51461 = str;
                        textView2 = textView14;
                    }
                    break;
                case -753292283:
                case 447413740:
                    resources = resources;
                    i8 = i26;
                    strM10562 = ServiceConnectionC3453.m10562(C2105.m6981(C7106.m19110(f21694, 43, 3, i25)) ^ 2119851831);
                    str2 = strM10562;
                    iM6983 = C0630.m2566("ۙ᩷") ^ i19;
                    i9 = ((iM6983 ^ i18) * 16111) ^ (-1189111328);
                    i10 = 445090378;
                    i21 = iM6983 ^ i10;
                    i20 = i9;
                    i26 = i8;
                    viewM12813 = viewM12813;
                    resources = resources;
                    i23 = i23;
                    break;
                case -725631841:
                case 236108590:
                    i6 = i22;
                    i23 = i23;
                    resources = resources;
                    i26 = i26;
                    sArr = sArr3;
                    i7 = i29;
                    view = viewM12813;
                    String str11 = strM51461;
                    textView2 = textView2;
                    str = str11;
                    C1047.m3601((TextView) viewM34010, AbstractC2021.m6567());
                    sArr2 = f21694;
                    i28 = 37;
                    if (C11340.f33930 < 0) {
                        int iM25612 = C0630.m2566("֨ۘ") ^ i18;
                        i21 = iM25612 ^ 1942318155;
                        i20 = ((iM25612 ^ i19) * 5575) ^ 1820555425;
                        viewM12813 = view;
                        i29 = i7;
                        sArr3 = sArr;
                        i22 = i6;
                        resources = resources;
                        i26 = i26;
                        i23 = i23;
                        TextView textView15 = textView2;
                        strM51461 = str;
                        textView2 = textView15;
                    } else {
                        strM51461 = str;
                        textView2 = textView2;
                        int iM69813 = (i19 - C2105.m6981("ۘᩳ")) * (-27);
                        i21 = iM69813 ^ (-2103753733);
                        i20 = ((iM69813 ^ i18) * (-12835)) ^ 749047566;
                        viewM12813 = view;
                        i29 = i7;
                        sArr3 = sArr;
                        i22 = i6;
                        resources = resources;
                        i26 = i26;
                        i23 = i23;
                    }
                    break;
                case -725381978:
                case 541981599:
                    C3683.m11222();
                    C3019.m9255();
                    iM6981 = C2105.m6981("ۗ᩸") ^ i18;
                    i = ((iM6981 ^ i19) * 889) ^ 1253543393;
                    i2 = 1247157115;
                    i21 = iM6981 ^ i2;
                    i20 = i;
                    break;
                case -680844354:
                case 1515656831:
                    i23 = i23;
                    button = (Button) C4263.m12813(viewOnClickListenerC7042, iM6986 ^ i16);
                    C22628.m50613(button, !zM51456);
                    if (zM51456) {
                        iM2567 = C0630.m2566("ܳۗ") ^ i19;
                        i12 = ((iM2567 ^ i18) * (-27547)) ^ 1237390669;
                        i14 = 1844362211;
                    } else {
                        iM2567 = C2105.m6981("ۡۛ") ^ i19;
                        i12 = ((iM2567 ^ i18) * (-11561)) ^ 1498790585;
                        i14 = 690525718;
                    }
                    i21 = iM2567 ^ i14;
                    i20 = i12;
                    i23 = i23;
                    break;
                case -527017842:
                case 342951323:
                    C0630.m2570(button, C0630.m2566(C3019.m9250(f21694, 67, 3, i25)) ^ 2124113917);
                    iM2567 = C2105.m6981("᩻᩶") ^ i18;
                    i12 = ((iM2567 ^ i19) * 14275) ^ 396089695;
                    i14 = -896213741;
                    i21 = iM2567 ^ i14;
                    i20 = i12;
                    i23 = i23;
                    break;
                case -508721609:
                case 692976990:
                    C3245.m9918(button, i23);
                    break;
                case -494770018:
                case 844304388:
                    objArr[i27] = lM12360;
                    resources = resources;
                    i8 = i26;
                    strM10562 = resources.getQuantityString(C2105.m6981(C7811.m20837(f21694, 49, 3, i25)) ^ 2103435539, i8, objArr);
                    str2 = strM10562;
                    iM6983 = C0630.m2566("ۙ᩷") ^ i19;
                    i9 = ((iM6983 ^ i18) * 16111) ^ (-1189111328);
                    i10 = 445090378;
                    i21 = iM6983 ^ i10;
                    i20 = i9;
                    i26 = i8;
                    viewM12813 = viewM12813;
                    resources = resources;
                    i23 = i23;
                    break;
                case -287678038:
                case 1594862702:
                    i23 = -12303292;
                    iM6981 = (C2105.m6981("ۢۜ") ^ i19) * 85;
                    i = ((iM6981 ^ i18) * 933) ^ 151276587;
                    i2 = 411938488;
                    i21 = iM6981 ^ i2;
                    i20 = i;
                    break;
                case -174807024:
                case 1308301584:
                    i23 = i23;
                    C3746.m11360(viewM3409, i15);
                    viewM12813 = C4263.m12813(viewOnClickListenerC7042, C0630.m2566(C1773.m5917(f21694, 55, 3, i25)) ^ 2122734366);
                    if (zM51456) {
                        iM2567 = C0630.m2566("ۤۡ") ^ i19;
                        i12 = ((iM2567 ^ i18) * (-20621)) ^ (-1204399587);
                        i14 = 1607739279;
                    } else {
                        iM2567 = C2105.m6981("ᩴᩳ") ^ i18;
                        i12 = ((iM2567 ^ i19) * 14723) ^ (-197307180);
                        i14 = 1867327837;
                    }
                    i21 = iM2567 ^ i14;
                    i20 = i12;
                    i23 = i23;
                    break;
                case -129575564:
                case 823286382:
                    i23 = i23;
                    C1128.m3853(viewM34011, i24);
                    iM6986 = C2105.m6981(C3911.m11919(f21694, 64, 3, i25));
                    i16 = 2126739713;
                    if (!C1711.f5919) {
                        iM2567 = C0630.m2566("ۚۗ") ^ i19;
                        i12 = ((iM2567 ^ i18) * (-169)) ^ 2067081430;
                        i14 = 1511259626;
                        i21 = iM2567 ^ i14;
                        i20 = i12;
                        i23 = i23;
                    } else {
                        resources = resources;
                        i26 = i26;
                        sArr2 = sArr2;
                        i28 = i28;
                        sArr3 = sArr3;
                        i29 = i29;
                        viewM12813 = viewM12813;
                        String str12 = strM51461;
                        textView2 = textView2;
                        str = str12;
                        iM2566 = C0630.m2566("ۖܶ") ^ i18;
                        i4 = ((iM2566 ^ i19) * (-12741)) ^ (-1560399347);
                        i5 = -961673558;
                        i21 = iM2566 ^ i5;
                        i20 = i4;
                        i28 = i28;
                        viewM12813 = viewM12813;
                        i29 = i29;
                        sArr3 = sArr3;
                        i22 = i22;
                        sArr2 = sArr2;
                        resources = resources;
                        i26 = i26;
                        i23 = i23;
                        TextView textView16 = textView2;
                        strM51461 = str;
                        textView2 = textView16;
                    }
                    break;
                case 57141565:
                case 1740463407:
                    i23 = i23;
                    TextView textView17 = textView2;
                    resources = resources;
                    i26 = i26;
                    viewM12813 = viewM12813;
                    String str13 = strM51461;
                    C1047.m3601(textView17, str13);
                    sArr3 = f21694;
                    i29 = 40;
                    i30 = 3;
                    if (C4117.m12364() == 0) {
                        int iM69814 = (C2105.m6981("۠ۜ") + i19) * (-11);
                        i20 = ((iM69814 ^ i18) * 22743) ^ (-1312027120);
                        i21 = iM69814 ^ 1321729198;
                        i26 = i26;
                        textView2 = textView17;
                        strM51461 = str13;
                        viewM12813 = viewM12813;
                        resources = resources;
                        i23 = i23;
                    } else {
                        textView2 = textView17;
                        str = str13;
                        i22 = i22;
                        sArr2 = sArr2;
                        i28 = i28;
                        int iM69815 = C2105.m6981("᩸֫") ^ i18;
                        i20 = ((iM69815 ^ i19) * 1047) ^ 793078888;
                        i21 = iM69815 ^ 1704353179;
                        viewOnClickListenerC7042 = this;
                        i28 = i28;
                        i26 = i26;
                        viewM12813 = viewM12813;
                        i22 = i22;
                        sArr2 = sArr2;
                        resources = resources;
                        i23 = i23;
                        TextView textView18 = textView2;
                        strM51461 = str;
                        textView2 = textView18;
                    }
                    break;
                case 156133656:
                case 1515640848:
                    i23 = i23;
                    C3746.m11360(viewM12813, i22);
                    viewM12814 = C4263.m12813(viewOnClickListenerC7042, C0630.m2566(C11340.m28025(f21694, 58, 3, i25)) ^ 2118413478);
                    if (zM51456) {
                        iM2567 = C2105.m6981("᩷ۢ") ^ i19;
                        i12 = ((iM2567 ^ i18) * (-4245)) ^ (-253747001);
                        i14 = 1209957063;
                    } else {
                        iM2567 = (C0630.m2566("۟ۤ") ^ i19) * 119;
                        i12 = ((iM2567 ^ i18) * (-2765)) ^ (-242032272);
                        i14 = -750557392;
                    }
                    i21 = iM2567 ^ i14;
                    i20 = i12;
                    i23 = i23;
                    break;
                case 275518500:
                case 569577831:
                    i31 = 0;
                    iM2567 = C0630.m2566("۬۟") ^ i18;
                    i12 = ((iM2567 ^ i19) * (-13677)) ^ 1149450130;
                    i14 = 1595389949;
                    i21 = iM2567 ^ i14;
                    i20 = i12;
                    i23 = i23;
                    break;
                case 286571778:
                case 1071448793:
                    view2 = viewM12813;
                    i23 = i23;
                    i11 = i26;
                    jM51466 = (C23196.m51466() - ViewOnClickListenerC1958.m6432()) / 86400000;
                    resourcesM14338 = C4925.m14338();
                    if (C1128.f4106 <= 0) {
                        iM6984 = C0630.m2566("᩻ۢ") ^ i19;
                        i12 = ((iM6984 ^ i18) * (-8581)) ^ 1605163475;
                        i13 = -1638419861;
                    } else {
                        iM6984 = C2105.m6981("ۤܺ") ^ i18;
                        i12 = ((iM6984 ^ i19) * 10589) ^ 1632804776;
                        i13 = -678761948;
                    }
                    i21 = iM6984 ^ i13;
                    i26 = i11;
                    viewM12813 = view2;
                    resources = resourcesM14338;
                    i20 = i12;
                    i23 = i23;
                    break;
                case 321686725:
                case 843800271:
                    if (C2958.f9394 < 0) {
                        i22 = i22;
                        i23 = i23;
                        resources = resources;
                        i26 = i26;
                        sArr2 = sArr2;
                        i28 = i28;
                        viewM12813 = viewM12813;
                        String str14 = strM51461;
                        textView2 = textView2;
                        str = str14;
                        int iM69816 = C2105.m6981("᩸֫") ^ i18;
                        i20 = ((iM69816 ^ i19) * 1047) ^ 793078888;
                        i21 = iM69816 ^ 1704353179;
                        viewOnClickListenerC7042 = this;
                        i28 = i28;
                        i26 = i26;
                        viewM12813 = viewM12813;
                        i22 = i22;
                        sArr2 = sArr2;
                        resources = resources;
                        i23 = i23;
                        TextView textView19 = textView2;
                        strM51461 = str;
                        textView2 = textView19;
                    } else {
                        i6 = i22;
                        i23 = i23;
                        resources = resources;
                        i26 = i26;
                        sArr = sArr3;
                        i7 = i29;
                        view = viewM12813;
                        int iM69817 = (i19 - C2105.m6981("ۘᩳ")) * (-27);
                        i21 = iM69817 ^ (-2103753733);
                        i20 = ((iM69817 ^ i18) * (-12835)) ^ 749047566;
                        viewM12813 = view;
                        i29 = i7;
                        sArr3 = sArr;
                        i22 = i6;
                        resources = resources;
                        i26 = i26;
                        i23 = i23;
                    }
                    break;
                case 828969191:
                case 1134925197:
                    i23 = i23;
                    resources = resources;
                    viewM12813 = viewM12813;
                    long j = jM51466;
                    i26 = (int) j;
                    lM12360 = C4117.m12360(j);
                    Object[] objArr2 = new Object[1];
                    if (C11340.f33930 < 0) {
                        int iM69818 = (C2105.m6981("ܺ۬") + i19) * (-7);
                        i20 = ((iM69818 ^ i18) * (-22649)) ^ (-1923216768);
                        i21 = iM69818 ^ 333617543;
                        viewM12813 = viewM12813;
                        objArr = objArr2;
                        resources = resources;
                        i26 = i26;
                        i23 = i23;
                    } else {
                        objArr = objArr2;
                        i26 = i26;
                        int iM25613 = C0630.m2566("۬֫") ^ i18;
                        i21 = iM25613 ^ (-1674251185);
                        i20 = ((iM25613 ^ i19) * (-10159)) ^ (-1114687640);
                        viewM12813 = viewM12813;
                        resources = resources;
                        i23 = i23;
                    }
                    break;
                case 1297144597:
                case 1805844975:
                    str = strM51461;
                    i25 = 7149;
                    iM6982 = C2105.m6981("᩸۫") ^ i19;
                    i20 = ((iM6982 ^ i18) * 1285) ^ (-422148924);
                    i3 = -426411462;
                    i21 = iM6982 ^ i3;
                    viewOnClickListenerC7042 = this;
                    i28 = i28;
                    viewM12813 = viewM12813;
                    i29 = i29;
                    sArr3 = sArr3;
                    i22 = i22;
                    sArr2 = sArr2;
                    resources = resources;
                    i26 = i26;
                    i23 = i23;
                    TextView textView110 = textView2;
                    strM51461 = str;
                    textView2 = textView110;
                    break;
                case 1305556147:
                case 1984987345:
                    C0630.m2570(button, C2105.m6981(C3911.m11919(f21694, 70, 3, i25)) ^ 2104656853);
                    iM2567 = C2105.m6981("᩻᩶") ^ i18;
                    i12 = ((iM2567 ^ i19) * 14275) ^ 396089695;
                    i14 = -896213741;
                    i21 = iM2567 ^ i14;
                    i20 = i12;
                    i23 = i23;
                    break;
                case 1466917146:
                case 1850817782:
                    i23 = i23;
                    resources = resources;
                    i8 = i26;
                    viewM12813 = viewM12813;
                    if (C1711.m5729()) {
                        iM6983 = (i18 - C0630.m2566("ۨ᩵")) * (-85);
                        i9 = ((iM6983 ^ i19) * (-3417)) ^ (-1722788180);
                        i10 = 1206944986;
                    } else {
                        iM6983 = (i19 - C2105.m6981("ܿ᩸")) * (-75);
                        i9 = ((iM6983 ^ i18) * (-19909)) ^ (-1629186373);
                        i10 = 147453290;
                    }
                    i21 = iM6983 ^ i10;
                    i20 = i9;
                    i26 = i8;
                    viewM12813 = viewM12813;
                    resources = resources;
                    i23 = i23;
                    break;
                case 1797354814:
                case 2060914277:
                    if (!AbstractC2021.m6574()) {
                        i6 = i22;
                        i23 = i23;
                        resources = resources;
                        i26 = i26;
                        sArr = sArr3;
                        i7 = i29;
                        view = viewM12813;
                        int iM69819 = (i19 - C2105.m6981("ۘᩳ")) * (-27);
                        i21 = iM69819 ^ (-2103753733);
                        i20 = ((iM69819 ^ i18) * (-12835)) ^ 749047566;
                        viewM12813 = view;
                        i29 = i7;
                        sArr3 = sArr;
                        i22 = i6;
                        resources = resources;
                        i26 = i26;
                        i23 = i23;
                    } else {
                        i23 = i23;
                        resources = resources;
                        i26 = i26;
                        sArr2 = sArr2;
                        i28 = i28;
                        sArr3 = sArr3;
                        i29 = i29;
                        viewM12813 = viewM12813;
                        String str15 = strM51461;
                        textView2 = textView2;
                        str = str15;
                        iM2566 = C0630.m2566("ۖܶ") ^ i18;
                        i4 = ((iM2566 ^ i19) * (-12741)) ^ (-1560399347);
                        i5 = -961673558;
                        i21 = iM2566 ^ i5;
                        i20 = i4;
                        i28 = i28;
                        viewM12813 = viewM12813;
                        i29 = i29;
                        sArr3 = sArr3;
                        i22 = i22;
                        sArr2 = sArr2;
                        resources = resources;
                        i26 = i26;
                        i23 = i23;
                        TextView textView111 = textView2;
                        strM51461 = str;
                        textView2 = textView111;
                    }
                    break;
                default:
                    if (C0422.f1886 > 0) {
                        iM6981 = C2105.m6981("ۗ᩸") ^ i18;
                        i = ((iM6981 ^ i19) * 889) ^ 1253543393;
                        i2 = 1247157115;
                    } else {
                        iM6981 = C0630.m2566("ۙܰ") ^ i19;
                        i = ((iM6981 ^ i18) * (-26905)) ^ 1209883291;
                        i2 = 1182719609;
                    }
                    i21 = iM6981 ^ i2;
                    i20 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m19020(ViewOnClickListenerC7042 viewOnClickListenerC7042) {
        TextView textView = null;
        boolean z = false;
        CharSequence charSequenceM19010 = null;
        boolean z2 = false;
        int i = -1068169039;
        int i2 = C3746.f11829;
        int i3 = C3019.f9544;
        int iM6981 = (i2 - C2105.m6981("ܺۨ")) * 115;
        int i4 = ((iM6981 ^ i3) * 12113) ^ 1147317652;
        int i5 = 157100116;
        while (true) {
            i = ((((i ^ i3) * (-32331)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2144594599:
                case -1470925540:
                    if (C2520.f8000 < 0) {
                        iM6981 = C0630.m2566("ۜۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-20271)) ^ (-1694381389);
                        i5 = -1152476378;
                    } else {
                        iM6981 = C0630.m2566("ᩳۡ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 31351) ^ 1623629848;
                        i5 = -1194238097;
                    }
                    break;
                case -2010558728:
                case 1786168422:
                    if (C7106.f21815 == 0) {
                        iM6981 = (i3 - C0630.m2566("᩷ۧ")) * (-5);
                        i4 = ((iM6981 ^ i2) * 2707) ^ 667791002;
                        i5 = -607886407;
                    } else {
                        iM6981 = C0630.m2566("ᩴ֨") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-11239)) ^ (-87766188);
                        i5 = -739200432;
                    }
                    break;
                case -1980500353:
                case -852877697:
                    if (C0483.f2088 >= 0) {
                        iM6981 = (i3 - C0630.m2566("᩷ۧ")) * (-5);
                        i4 = ((iM6981 ^ i2) * 2707) ^ 667791002;
                        i5 = -607886407;
                    } else {
                        iM6981 = C2105.m6981("ܳ۫") ^ i2;
                        i4 = ((iM6981 ^ i3) * 23799) ^ (-647334486);
                        i5 = 1391387595;
                    }
                    break;
                case -1928504983:
                case -1885913632:
                    if (C3245.f10203 <= 0) {
                        iM6981 = (i3 - C0630.m2566("᩷ۧ")) * (-5);
                        i4 = ((iM6981 ^ i2) * 2707) ^ 667791002;
                        i5 = -607886407;
                    } else {
                        iM6981 = C2105.m6981("᩷ᩳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-15097)) ^ 730125405;
                        i5 = -1882805317;
                    }
                    break;
                case -1801067872:
                case -383996542:
                    if (C1128.m3851() <= 0) {
                        iM6981 = (i3 - C0630.m2566("ܿۖ")) * (-51);
                        i4 = ((iM6981 ^ i2) * 28585) ^ 350837662;
                        i5 = -1031182973;
                    } else {
                        iM6981 = (C0630.m2566("᩶᩹") + i3) * 3;
                        i4 = ((iM6981 ^ i2) * 8905) ^ 964215538;
                        i5 = -1753395828;
                    }
                    break;
                case -1798745351:
                case 1045561876:
                    ServiceConnectionC3453.m10564();
                    break;
                case -1622970208:
                case 979970465:
                    textView = viewOnClickListenerC7042.f21700;
                    if (C4263.f13799 <= 0) {
                        iM6981 = C0630.m2566("ᩴ֨") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-11239)) ^ (-87766188);
                        i5 = -739200432;
                    } else {
                        iM6981 = C0630.m2566("᩻ܶ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 21905) ^ 450475800;
                        i5 = 2097912653;
                    }
                    break;
                case -1474486729:
                case 1249707904:
                    charSequenceM19010 = m19010(z);
                    if (C3537.f11231 >= 0) {
                        iM6981 = (i3 - C0630.m2566("ܿۖ")) * (-51);
                        i4 = ((iM6981 ^ i2) * 28585) ^ 350837662;
                        i5 = -1031182973;
                    } else {
                        iM6981 = (C2105.m6981("ۗ᩹") ^ i3) * 123;
                        i4 = ((iM6981 ^ i2) * (-1821)) ^ (-922559275);
                        i5 = -192208306;
                    }
                    break;
                case -718537768:
                case 109888884:
                    break;
                case -670592632:
                case 727831892:
                    RunnableC1937.m6377(textView, charSequenceM19010);
                    z2 = false;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = (i3 - C0630.m2566("ܿۖ")) * (-51);
                        i4 = ((iM6981 ^ i2) * 28585) ^ 350837662;
                        i5 = -1031182973;
                    } else {
                        iM6981 = C2105.m6981("ۜ֡") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-27011)) ^ (-204482072);
                        i5 = -1119130463;
                    }
                    break;
                case -611123711:
                case 1980436985:
                    viewOnClickListenerC7042.f21698 = z2;
                    if (viewOnClickListenerC7042.f21697) {
                        iM6981 = (i3 - C0630.m2566("ۡᩴ")) * 75;
                        i4 = ((iM6981 ^ i2) * 32419) ^ (-490900378);
                        i5 = 1934821996;
                    } else {
                        iM6981 = (C2105.m6981("֫۠") + i2) * (-87);
                        i4 = ((iM6981 ^ i3) * 12797) ^ (-1063528386);
                        i5 = -557722030;
                    }
                    break;
                case -577304509:
                case 304734549:
                    C0422.m1963();
                    if (C2958.f9394 < 0) {
                        iM6981 = C0630.m2566("ᩳۡ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 31351) ^ 1623629848;
                        i5 = -1194238097;
                    } else {
                        iM6981 = C0630.m2566("ᩴ֨") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-11239)) ^ (-87766188);
                        i5 = -739200432;
                    }
                    break;
                case -312597069:
                case -168881093:
                    viewOnClickListenerC7042.f21697 = z2;
                    viewOnClickListenerC7042.m19025();
                    iM6981 = (C2105.m6981("֫۠") + i2) * (-87);
                    i4 = ((iM6981 ^ i3) * 12797) ^ (-1063528386);
                    i5 = -557722030;
                    break;
                case 466743219:
                case 758620741:
                    if (C3432.f10845 >= 0) {
                        iM6981 = C0630.m2566("ۜۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-20271)) ^ (-1694381389);
                        i5 = -1152476378;
                    } else {
                        iM6981 = C2105.m6981("ۖ֫") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-31373)) ^ (-1163117108);
                        i5 = -617548627;
                    }
                    break;
                case 876039478:
                case 1403740439:
                    z = true;
                    if (C1294.f4556 >= 0) {
                        iM6981 = C0630.m2566("ᩴ֨") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-11239)) ^ (-87766188);
                        i5 = -739200432;
                    } else {
                        iM6981 = C2105.m6981("ܶ۬") ^ i3;
                        i4 = ((iM6981 ^ i2) * 27973) ^ 575135000;
                        i5 = 1169977777;
                    }
                    break;
                case 915514568:
                case 2131761284:
                    if (C1773.f6144 <= 0) {
                        iM6981 = C0630.m2566("ᩴ֨") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-11239)) ^ (-87766188);
                        i5 = -739200432;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ܺۖ")) * (-115);
                        i4 = ((iM6981 ^ i2) * 28515) ^ (-1499304822);
                        i5 = -841226387;
                    }
                    break;
                case 1464240827:
                case 1603520405:
                    if (C1128.m3851() <= 0) {
                        iM6981 = C0630.m2566("ۜۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-20271)) ^ (-1694381389);
                        i5 = -1152476378;
                    } else {
                        iM6981 = C0630.m2566("ᩴۛ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-5317)) ^ (-1120805178);
                        i5 = -1410306947;
                    }
                    break;
                default:
                    C2167.m7155();
                    iM6981 = C0630.m2566("ᩴ֨") ^ i3;
                    i4 = ((iM6981 ^ i2) * (-11239)) ^ (-87766188);
                    i5 = -739200432;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
    
        if (l.C1047.f3863 < 0) goto L15;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CharSequence m19010(boolean z) {
        int iM6981;
        int i;
        int i2;
        int i3;
        int iM2566;
        int i4;
        int i5;
        int iM2567;
        int i6;
        int i7;
        UnderlineSpan underlineSpan = null;
        int length = 0;
        int i8 = 0;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        short s2 = 0;
        int i12 = 0;
        int i13 = -1192325519;
        int i14 = C0050.f910;
        int i15 = RunnableC0588.f2309;
        int iM2568 = (C0630.m2566("֨᩵") + i15) * 93;
        int i16 = ((iM2568 ^ i14) * (-16503)) ^ 552269242;
        int i17 = iM2568 ^ (-43481184);
        while (true) {
            SpannableString spannableString = null;
            while (true) {
                i13 = i17 ^ (i16 & (((i13 ^ i14) * 24557) >> 31));
                switch (i13) {
                    case -1797853162:
                    case 789515583:
                        return spannableString.subSequence(i8, spannableString.length());
                    case -1670139493:
                    case -1605971512:
                        C0422.m1963();
                        if (C0050.f910 >= 0) {
                            underlineSpan = underlineSpan;
                            length = length;
                            i8 = i8;
                            iM2567 = C0630.m2566("۠ۤ") ^ i15;
                            i6 = ((iM2567 ^ i14) * 30813) ^ 1679812669;
                            i7 = 83177526;
                            i17 = iM2567 ^ i7;
                            i16 = i6;
                            underlineSpan = underlineSpan;
                            length = length;
                            i8 = i8;
                        }
                        underlineSpan = underlineSpan;
                        length = length;
                        i8 = i8;
                        iM2567 = (i15 - C0630.m2566("ܺۤ")) * 83;
                        i6 = ((iM2567 ^ i14) * (-5679)) ^ 1238944836;
                        i7 = -470156146;
                        i17 = iM2567 ^ i7;
                        i16 = i6;
                        underlineSpan = underlineSpan;
                        length = length;
                        i8 = i8;
                        break;
                    case -1660021859:
                    case -106681152:
                        C1773.m5908();
                        underlineSpan = underlineSpan;
                        length = length;
                        i8 = i8;
                        iM2567 = (i15 - C0630.m2566("ܺۤ")) * 83;
                        i6 = ((iM2567 ^ i14) * (-5679)) ^ 1238944836;
                        i7 = -470156146;
                        i17 = iM2567 ^ i7;
                        i16 = i6;
                        underlineSpan = underlineSpan;
                        length = length;
                        i8 = i8;
                        break;
                    case -1528415515:
                    case 684253077:
                        spannableString = spannableString;
                        length = spannableString.length();
                        if (C1773.f6144 <= 0) {
                            underlineSpan = underlineSpan;
                            i8 = i8;
                            int iM2569 = C0630.m2566("ۢۚ") ^ i15;
                            i = ((iM2569 ^ i14) * (-10205)) ^ 323085499;
                            i3 = iM2569 ^ 1136152013;
                            i8 = i8;
                        } else {
                            int iM6982 = (C2105.m6981("֨۟") ^ i14) * 41;
                            underlineSpan = underlineSpan;
                            i = ((iM6982 ^ i15) * (-24253)) ^ 77250875;
                            i3 = iM6982 ^ (-1543304017);
                        }
                        SpannableString spannableString2 = spannableString;
                        i17 = i3;
                        i16 = i;
                        underlineSpan = underlineSpan;
                        spannableString = spannableString2;
                        break;
                    case -1430942504:
                    case -89523129:
                        underlineSpan = underlineSpan;
                        String strM10633 = z ? RunnableC3474.m10633(f21694, 3, 2, i12) : C4117.m12355(f21694, 1, 2, i12);
                        short[] sArr2 = f21694;
                        if (C0237.f1507 != 0) {
                            i8 = i8;
                            iM2567 = C0630.m2566("۠ۤ") ^ i15;
                            i6 = ((iM2567 ^ i14) * 30813) ^ 1679812669;
                            i7 = 83177526;
                            i17 = iM2567 ^ i7;
                            i16 = i6;
                            underlineSpan = underlineSpan;
                        } else {
                            i8 = i8;
                            int iM25610 = C0630.m2566(RunnableC1108.m3789(sArr2, 5, 3, i12));
                            if (ServiceConnectionC3453.f10921 >= 0) {
                                iM2567 = (i15 - C0630.m2566("ܺۤ")) * 83;
                                i6 = ((iM2567 ^ i14) * (-5679)) ^ 1238944836;
                                i7 = -470156146;
                                i17 = iM2567 ^ i7;
                                i16 = i6;
                                underlineSpan = underlineSpan;
                            } else {
                                String strM12251 = C4075.m12251(iM25610 ^ 2101459884);
                                if (C0798.f2919) {
                                    iM2567 = (C2105.m6981("ۖۙ") + i14) * (-63);
                                    i6 = ((iM2567 ^ i15) * (-6463)) ^ 720791986;
                                    i7 = 1935746374;
                                    i17 = iM2567 ^ i7;
                                    i16 = i6;
                                    underlineSpan = underlineSpan;
                                } else {
                                    String strM9035 = C2958.m9035(strM10633, strM12251);
                                    if (C4159.f13567) {
                                        SpannableString spannableString3 = new SpannableString(strM9035);
                                        underlineSpan = new UnderlineSpan();
                                        if (!C0798.f2919) {
                                            int iM25611 = (i14 - C0630.m2566("ܳܽ")) * 83;
                                            i17 = 1306259478 ^ iM25611;
                                            spannableString = spannableString3;
                                            i16 = ((iM25611 ^ i15) * 1321) ^ 1659351756;
                                            length = length;
                                            i8 = i8;
                                            break;
                                        }
                                    } else {
                                        underlineSpan = underlineSpan;
                                    }
                                    int iM25612 = C0630.m2566("᩺ܽ") ^ i14;
                                    i17 = iM25612 ^ 730774763;
                                    i16 = ((iM25612 ^ i15) * 27021) ^ (-1138113906);
                                }
                            }
                        }
                        length = length;
                        i8 = i8;
                        break;
                    case -1168550934:
                    case 1184131391:
                        i12 = 58584;
                        iM6981 = (C0630.m2566("֫ۤ") + i15) * (-73);
                        i = ((iM6981 ^ i14) * (-26607)) ^ (-1379036164);
                        i2 = -329647809;
                        i3 = iM6981 ^ i2;
                        length = length;
                        i8 = i8;
                        SpannableString spannableString4 = spannableString;
                        i17 = i3;
                        i16 = i;
                        underlineSpan = underlineSpan;
                        spannableString = spannableString4;
                        break;
                    case -1155834952:
                    case 2005400989:
                        i12 = 8041;
                        iM6981 = (C0630.m2566("֫ۤ") + i15) * (-73);
                        i = ((iM6981 ^ i14) * (-26607)) ^ (-1379036164);
                        i2 = -329647809;
                        i3 = iM6981 ^ i2;
                        length = length;
                        i8 = i8;
                        SpannableString spannableString5 = spannableString;
                        i17 = i3;
                        i16 = i;
                        underlineSpan = underlineSpan;
                        spannableString = spannableString5;
                        break;
                    case -762611085:
                    case 489355089:
                        SpannableString spannableString6 = spannableString;
                        spannableString6.setSpan(underlineSpan, 2, length, 17);
                        if (C23196.m51456()) {
                            iM2566 = (C2105.m6981("ᩳᩴ") + i14) * (-5);
                            i4 = ((iM2566 ^ i15) * (-5491)) ^ 1377737510;
                            i5 = -2073881166;
                        } else {
                            iM2566 = C0630.m2566("֨ᩴ") ^ i15;
                            i4 = ((iM2566 ^ i14) * (-1879)) ^ (-258630851);
                            i5 = -1939783246;
                        }
                        spannableString = spannableString6;
                        i17 = iM2566 ^ i5;
                        i16 = i4;
                        i8 = 2;
                        break;
                    case -685204061:
                    case 1042406166:
                        C11340.m28031();
                        if (C3746.f11829 <= 0) {
                            i8 = i8;
                            spannableString = spannableString;
                            underlineSpan = underlineSpan;
                            int iM25613 = C0630.m2566("ۢۚ") ^ i15;
                            i = ((iM25613 ^ i14) * (-10205)) ^ 323085499;
                            i3 = iM25613 ^ 1136152013;
                            i8 = i8;
                            SpannableString spannableString7 = spannableString;
                            i17 = i3;
                            i16 = i;
                            underlineSpan = underlineSpan;
                            spannableString = spannableString7;
                        } else {
                            underlineSpan = underlineSpan;
                            length = length;
                            i8 = i8;
                            iM2567 = (C2105.m6981("ۖۙ") + i14) * (-63);
                            i6 = ((iM2567 ^ i15) * (-6463)) ^ 720791986;
                            i7 = 1935746374;
                            i17 = iM2567 ^ i7;
                            i16 = i6;
                            underlineSpan = underlineSpan;
                            length = length;
                            i8 = i8;
                        }
                        break;
                    case -633115046:
                    case -351096075:
                        C3683.m11222();
                        break;
                    case -112017455:
                    case 1223041193:
                        length = length;
                        i8 = i8;
                        spannableString = spannableString;
                        underlineSpan = underlineSpan;
                        s = sArr[c];
                        if (ViewOnClickListenerC1958.m6429() < 0) {
                            iM6981 = C0630.m2566("ۤ᩶") ^ i15;
                            i = ((iM6981 ^ i14) * (-7645)) ^ 764603801;
                            i2 = 1147815277;
                            i3 = iM6981 ^ i2;
                            length = length;
                            i8 = i8;
                            SpannableString spannableString8 = spannableString;
                            i17 = i3;
                            i16 = i;
                            underlineSpan = underlineSpan;
                            spannableString = spannableString8;
                        } else {
                            iM2567 = C0630.m2566("۠ۤ") ^ i15;
                            i6 = ((iM2567 ^ i14) * 30813) ^ 1679812669;
                            i7 = 83177526;
                            i17 = iM2567 ^ i7;
                            i16 = i6;
                            underlineSpan = underlineSpan;
                            length = length;
                            i8 = i8;
                        }
                        break;
                    case 23004649:
                    case 230536620:
                        length = length;
                        i8 = i8;
                        spannableString = spannableString;
                        underlineSpan = underlineSpan;
                        sArr = f21694;
                        c = 0;
                        if (C22628.f73083 > 0) {
                            iM6981 = C2105.m6981("ܶ֡") ^ i14;
                            i = ((iM6981 ^ i15) * (-8069)) ^ 1116176141;
                            i2 = 100091825;
                            i3 = iM6981 ^ i2;
                            length = length;
                            i8 = i8;
                            SpannableString spannableString9 = spannableString;
                            i17 = i3;
                            i16 = i;
                            underlineSpan = underlineSpan;
                            spannableString = spannableString9;
                        }
                        length = length;
                        int iM25614 = C0630.m2566("ۢۚ") ^ i15;
                        i = ((iM25614 ^ i14) * (-10205)) ^ 323085499;
                        i3 = iM25614 ^ 1136152013;
                        i8 = i8;
                        SpannableString spannableString10 = spannableString;
                        i17 = i3;
                        i16 = i;
                        underlineSpan = underlineSpan;
                        spannableString = spannableString10;
                        break;
                    case 261159761:
                    case 645288385:
                        C2272.m7503();
                        return null;
                    case 362444753:
                    case 484364676:
                        return spannableString;
                    case 567064282:
                    case 918203211:
                        length = length;
                        i8 = i8;
                        spannableString = spannableString;
                        underlineSpan = underlineSpan;
                        int i18 = s + s2;
                        if (i11 - (i18 * i18) < 0) {
                            iM6981 = (C2105.m6981("۟ᩴ") ^ i15) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i = ((iM6981 ^ i14) * (-30927)) ^ 1941778308;
                            i2 = 1288252290;
                        } else {
                            iM6981 = C2105.m6981("᩶ۛ") ^ i14;
                            i = ((iM6981 ^ i15) * (-22055)) ^ (-79575220);
                            i2 = 1191146884;
                        }
                        i3 = iM6981 ^ i2;
                        length = length;
                        i8 = i8;
                        SpannableString spannableString11 = spannableString;
                        i17 = i3;
                        i16 = i;
                        underlineSpan = underlineSpan;
                        spannableString = spannableString11;
                        break;
                    case 844714426:
                    case 1651717331:
                        length = length;
                        i8 = i8;
                        spannableString = spannableString;
                        underlineSpan = underlineSpan;
                        int i19 = i9 + i10;
                        i11 = i19 + i19;
                        s2 = 9279;
                        if (C0050.f910 < 0) {
                            iM6981 = (i15 - C0630.m2566("᩹ۛ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i = ((iM6981 ^ i14) * 25567) ^ 623618935;
                            i2 = 1745552346;
                            i3 = iM6981 ^ i2;
                            length = length;
                            i8 = i8;
                            SpannableString spannableString12 = spannableString;
                            i17 = i3;
                            i16 = i;
                            underlineSpan = underlineSpan;
                            spannableString = spannableString12;
                        }
                        length = length;
                        int iM25615 = C0630.m2566("ۢۚ") ^ i15;
                        i = ((iM25615 ^ i14) * (-10205)) ^ 323085499;
                        i3 = iM25615 ^ 1136152013;
                        i8 = i8;
                        SpannableString spannableString13 = spannableString;
                        i17 = i3;
                        i16 = i;
                        underlineSpan = underlineSpan;
                        spannableString = spannableString13;
                        break;
                    default:
                        length = length;
                        i8 = i8;
                        spannableString = spannableString;
                        underlineSpan = underlineSpan;
                        i9 = s * s;
                        i10 = 86099841;
                        if (!C3663.f11553) {
                            iM6981 = C0630.m2566("֡֡") ^ i14;
                            i = ((iM6981 ^ i15) * (-23031)) ^ 905593229;
                            i2 = -822282031;
                            i3 = iM6981 ^ i2;
                            length = length;
                            i8 = i8;
                            SpannableString spannableString14 = spannableString;
                            i17 = i3;
                            i16 = i;
                            underlineSpan = underlineSpan;
                            spannableString = spannableString14;
                        } else {
                            iM2567 = (i15 - C0630.m2566("ܺۤ")) * 83;
                            i6 = ((iM2567 ^ i14) * (-5679)) ^ 1238944836;
                            i7 = -470156146;
                            i17 = iM2567 ^ i7;
                            i16 = i6;
                            underlineSpan = underlineSpan;
                            length = length;
                            i8 = i8;
                        }
                        break;
                }
            }
        }
    }

    public ViewOnClickListenerC7042() {
        ArrayList arrayList = null;
        int i = -1383198745;
        int i2 = AbstractC2021.f6743;
        int i3 = C0050.f910;
        int iM2566 = (C0630.m2566("᩶᩵") + i2) * 93;
        int i4 = ((iM2566 ^ i3) * 17519) ^ (-2147449830);
        int i5 = 1381429849;
        while (true) {
            i = ((((i ^ i3) * 10077) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2125069737:
                case 1427222859:
                    if (C1773.m5908() <= 0) {
                        iM2566 = (C2105.m6981("ۖۘ") ^ i2) * (-125);
                        i4 = ((iM2566 ^ i3) * (-22575)) ^ 921140454;
                        i5 = -1157559588;
                    } else {
                        iM2566 = C2105.m6981("ᩳܽ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-16587)) ^ 492739530;
                        i5 = 918480734;
                    }
                    break;
                case -2005962696:
                case -1691978024:
                    if (C0714.f2697 >= 0) {
                        iM2566 = C2105.m6981("۫ܶ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-2045)) ^ 1113806701;
                        i5 = -1565553726;
                    } else {
                        iM2566 = C2105.m6981("۠᩹") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-25077)) ^ 1482142093;
                        i5 = 1479993899;
                    }
                    break;
                case -1701504785:
                case 80617277:
                    if (C11340.f33930 >= 0) {
                        iM2566 = C2105.m6981("۫ܶ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-2045)) ^ 1113806701;
                        i5 = -1565553726;
                    } else {
                        iM2566 = C2105.m6981("ᩴۘ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-14755)) ^ (-424316808);
                        i5 = 1463597351;
                    }
                    break;
                case -1670002417:
                case -1533863687:
                    if (RunnableC1108.f4040) {
                        iM2566 = (C0630.m2566("ܽ֨") + i3) * 7;
                        i4 = ((iM2566 ^ i2) * 2121) ^ 174876236;
                        i5 = 194518467;
                    } else {
                        iM2566 = C2105.m6981("۫ܶ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-2045)) ^ 1113806701;
                        i5 = -1565553726;
                    }
                    break;
                case -1324941897:
                case 1764080795:
                    C1916.m6308();
                    iM2566 = C2105.m6981("۫ܶ") ^ i2;
                    i4 = ((iM2566 ^ i3) * (-2045)) ^ 1113806701;
                    i5 = -1565553726;
                    break;
                case -1320026201:
                case 516180234:
                    if (C1504.f5354) {
                        iM2566 = C2105.m6981("᩻ۖ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-31433)) ^ (-1418893415);
                        i5 = 1302387527;
                    } else {
                        iM2566 = C2105.m6981("᩶۬") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-6931)) ^ (-546952390);
                        i5 = 62391806;
                    }
                    break;
                case -1113565245:
                case -1113118613:
                    C3911.m11924();
                    if (C2520.f8000 < 0) {
                        iM2566 = C2105.m6981("᩻ۖ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-31433)) ^ (-1418893415);
                        i5 = 1302387527;
                    } else {
                        iM2566 = C2105.m6981("۫ܶ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-2045)) ^ 1113806701;
                        i5 = -1565553726;
                    }
                    break;
                case -878204442:
                case 956322522:
                    this.f21699 = C8817.m22788();
                    return;
                case -844101135:
                case 366302623:
                    ViewOnClickListenerC1958.m6429();
                    if (!C0798.f2919) {
                        iM2566 = C2105.m6981("᩻ۖ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-31433)) ^ (-1418893415);
                        i5 = 1302387527;
                    } else {
                        iM2566 = (C2105.m6981("᩹ۙ") + i3) * (-93);
                        i4 = ((iM2566 ^ i2) * (-22647)) ^ 481579386;
                        i5 = -1955075710;
                    }
                    break;
                case -714329804:
                case -485356903:
                    this.f21696 = arrayList;
                    if (C0483.f2088 >= 0) {
                        iM2566 = C2105.m6981("᩸ۨ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 21273) ^ (-1545440427);
                        i5 = 1613518787;
                    } else {
                        iM2566 = C2105.m6981("۟ܿ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 6321) ^ (-246024396);
                        i5 = -1660028379;
                    }
                    break;
                case -200943126:
                case 903108782:
                    C1047.m3599();
                    throw new RuntimeException();
                case 26545216:
                case 257909700:
                    if (C1916.f6442) {
                        iM2566 = (C2105.m6981("ۙ᩶") ^ i3) * (-67);
                        i4 = ((iM2566 ^ i2) * (-18543)) ^ 2101124390;
                        i5 = -425272112;
                    } else {
                        iM2566 = C2105.m6981("᩸ۨ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 21273) ^ (-1545440427);
                        i5 = 1613518787;
                    }
                    break;
                case 104331854:
                case 1335550725:
                    if (C7106.m19120() <= 0) {
                        iM2566 = (C2105.m6981("᩹ۙ") + i3) * (-93);
                        i4 = ((iM2566 ^ i2) * (-22647)) ^ 481579386;
                        i5 = -1955075710;
                    } else {
                        iM2566 = C2105.m6981("ܺ֡") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-11613)) ^ (-1825956019);
                        i5 = -557508068;
                    }
                    break;
                case 589605533:
                case 914744112:
                    if (!C2272.f7362) {
                        iM2566 = (C2105.m6981("ۖۘ") ^ i2) * (-125);
                        i4 = ((iM2566 ^ i3) * (-22575)) ^ 921140454;
                        i5 = -1157559588;
                    } else {
                        iM2566 = (C2105.m6981("᩹ۙ") + i3) * (-93);
                        i4 = ((iM2566 ^ i2) * (-22647)) ^ 481579386;
                        i5 = -1955075710;
                    }
                    break;
                case 701987590:
                case 796872611:
                    arrayList = new ArrayList();
                    if (C21923.f70183 != 0) {
                        iM2566 = C2105.m6981("۫ܶ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-2045)) ^ 1113806701;
                        i5 = -1565553726;
                    } else {
                        iM2566 = (C0630.m2566("ܺۧ") ^ i3) * 39;
                        i4 = ((iM2566 ^ i2) * (-21901)) ^ (-2086340122);
                        i5 = -870798867;
                    }
                    break;
                default:
                    if (C11340.m28031()) {
                        iM2566 = C2105.m6981("۬᩶") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-21507)) ^ 1800219496;
                        i5 = -868260250;
                    } else {
                        iM2566 = C2105.m6981("۫ܶ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-2045)) ^ 1113806701;
                        i5 = -1565553726;
                    }
                    break;
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Iterator itM9029 = null;
        C11077 c11077 = null;
        boolean z = false;
        int i = 1199114931;
        int i2 = C2520.f8000;
        int i3 = C4075.f12947;
        int iM6981 = (i3 - C2105.m6981("۬۠")) * 119;
        int i4 = ((iM6981 ^ i2) * 27479) ^ 1634742885;
        int i5 = -1117414774;
        while (true) {
            i = ((((i ^ i2) * 4489) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2051820055:
                case -874247308:
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = (i3 - C2105.m6981("ۙۗ")) * 41;
                        i4 = ((iM6981 ^ i2) * 16419) ^ 523126380;
                        i5 = 182877998;
                    } else {
                        iM6981 = C0630.m2566("ܽۛ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 17113) ^ (-1258838975);
                        i5 = 2035208562;
                    }
                    break;
                case -1938722299:
                case -1332788651:
                    c11077 = (C11077) RunnableC1108.m3791(itM9029);
                    if (c11077 == view) {
                        iM6981 = C2105.m6981("᩵۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * 20711) ^ 151156197;
                        i5 = -688168499;
                    } else {
                        iM6981 = C0630.m2566("ۢ᩵") ^ i2;
                        i4 = ((iM6981 ^ i3) * 23213) ^ (-1552740939);
                        i5 = -326509720;
                    }
                    break;
                case -1790923746:
                case 1512112412:
                    break;
                case -1770739935:
                case -1589686715:
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = (i3 - C2105.m6981("ۙۗ")) * 41;
                        i4 = ((iM6981 ^ i2) * 16419) ^ 523126380;
                        i5 = 182877998;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ۡۛ")) * 83;
                        i4 = ((iM6981 ^ i3) * (-10005)) ^ (-2023936081);
                        i5 = -1916691014;
                    }
                    break;
                case -1599784367:
                case 846292284:
                    if (C1711.m5736() <= 0) {
                        iM6981 = (i3 - C2105.m6981("ۙۗ")) * 41;
                        i4 = ((iM6981 ^ i2) * 16419) ^ 523126380;
                        i5 = 182877998;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ܿۨ")) * 43;
                        i4 = ((iM6981 ^ i3) * (-22349)) ^ 1315406609;
                        i5 = -605872916;
                    }
                    break;
                case -1523091277:
                case -156847760:
                    if (C0483.m2123(itM9029)) {
                        iM6981 = (i3 - C0630.m2566("֡ۜ")) * (-77);
                        i4 = ((iM6981 ^ i2) * (-8705)) ^ (-2130156643);
                        i5 = 1281190962;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۗ᩶")) * 65;
                        i4 = ((iM6981 ^ i2) * (-6547)) ^ 582340427;
                        i5 = 195188103;
                    }
                    break;
                case -1463036567:
                case 1731067119:
                    z = false;
                    iM6981 = (C0630.m2566("֡᩻") ^ i3) * 31;
                    i4 = ((iM6981 ^ i2) * (-291)) ^ 2028808887;
                    i5 = -666207969;
                    break;
                case -1352278283:
                case 1867704855:
                    if (C4263.m12819() >= 0) {
                        iM6981 = (C2105.m6981("᩵۠") ^ i3) * 47;
                        i4 = ((iM6981 ^ i2) * 4337) ^ 1653120214;
                        i5 = 320664189;
                    } else {
                        iM6981 = (C0630.m2566("᩵ܶ") ^ i3) * 119;
                        i4 = ((iM6981 ^ i2) * 3617) ^ (-1122039185);
                        i5 = -1044081222;
                    }
                    break;
                case -1326836160:
                case -672998615:
                    if (C4263.f13799 <= 0) {
                        iM6981 = C0630.m2566("ܿ۟") ^ i3;
                        i4 = ((iM6981 ^ i2) * 5877) ^ (-1218514797);
                        i5 = -2120692291;
                    } else {
                        iM6981 = C0630.m2566("ᩳۢ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 27077) ^ 902282935;
                        i5 = 1542783168;
                    }
                    break;
                case -1185172437:
                case -450925254:
                    if (C1773.f6144 <= 0) {
                        iM6981 = C0630.m2566("ܿ۟") ^ i3;
                        i4 = ((iM6981 ^ i2) * 5877) ^ (-1218514797);
                        i5 = -2120692291;
                    } else {
                        iM6981 = (i3 - C2105.m6981("᩹ۜ")) * (-83);
                        i4 = ((iM6981 ^ i2) * (-3809)) ^ (-1076914128);
                        i5 = -1546511110;
                    }
                    break;
                case -1042334729:
                case -845890458:
                    C11340.m28031();
                    if (C4075.f12947 < 0) {
                        iM6981 = (C2105.m6981("᩷᩹") + i2) * 3;
                        i4 = ((iM6981 ^ i3) * 12821) ^ 93851171;
                        i5 = -1820052864;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ۙۗ")) * 41;
                        i4 = ((iM6981 ^ i2) * 16419) ^ 523126380;
                        i5 = 182877998;
                    }
                    break;
                case -878403172:
                case 1566347923:
                    z = true;
                    iM6981 = (C0630.m2566("֡᩻") ^ i3) * 31;
                    i4 = ((iM6981 ^ i2) * (-291)) ^ 2028808887;
                    i5 = -666207969;
                    break;
                case -799870373:
                case 792990051:
                    if (C2520.f8000 >= 0) {
                        iM6981 = (i3 - C2105.m6981("ۙۗ")) * 41;
                        i4 = ((iM6981 ^ i2) * 16419) ^ 523126380;
                        i5 = 182877998;
                    } else {
                        iM6981 = C2105.m6981("۠ᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-10081)) ^ 499519775;
                        i5 = 1965387195;
                    }
                    break;
                case -594820874:
                case 2006290699:
                    if (C3663.f11553) {
                        iM6981 = (C2105.m6981("᩷᩹") + i2) * 3;
                        i4 = ((iM6981 ^ i3) * 12821) ^ 93851171;
                        i5 = -1820052864;
                    } else {
                        iM6981 = (i3 - C2105.m6981("᩵ۖ")) * 23;
                        i4 = ((iM6981 ^ i2) * 24359) ^ (-169524818);
                        i5 = -1623099648;
                    }
                    break;
                case -250271852:
                case 1952746295:
                    if (C1047.f3863 >= 0) {
                        iM6981 = (C2105.m6981("᩷᩹") + i2) * 3;
                        i4 = ((iM6981 ^ i3) * 12821) ^ 93851171;
                        i5 = -1820052864;
                    } else {
                        iM6981 = (i2 - C2105.m6981("۬ۢ")) * (-101);
                        i4 = ((iM6981 ^ i3) * 131) ^ 1087995263;
                        i5 = 1488863274;
                    }
                    break;
                case -42036233:
                case 2075548160:
                    if (C4616.f14690 <= 0) {
                        iM6981 = (C2105.m6981("᩵۠") ^ i3) * 47;
                        i4 = ((iM6981 ^ i2) * 4337) ^ 1653120214;
                        i5 = 320664189;
                    } else {
                        iM6981 = (C0630.m2566("ۢۤ") + i2) * (-37);
                        i4 = ((iM6981 ^ i3) * 22993) ^ 1933023419;
                        i5 = 1750368889;
                    }
                    break;
                case -24736433:
                case 456339136:
                    if (C2520.f8000 >= 0) {
                        iM6981 = (i3 - C2105.m6981("ۙۗ")) * 41;
                        i4 = ((iM6981 ^ i2) * 16419) ^ 523126380;
                        i5 = 182877998;
                    } else {
                        iM6981 = C0630.m2566("᩹᩺") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-2367)) ^ 801198588;
                        i5 = 1177762579;
                    }
                    break;
                case 121096640:
                case 1750572683:
                    itM9029 = C2958.m9029(this.f21696);
                    iM6981 = C2105.m6981("۟ۤ") ^ i2;
                    i4 = ((iM6981 ^ i3) * (-1601)) ^ 1369449620;
                    i5 = 781413122;
                    break;
                case 163789797:
                case 2080809482:
                    RunnableC0588.m2441();
                    if (C4263.f13799 > 0) {
                        iM6981 = (C2105.m6981("᩵۠") ^ i3) * 47;
                        i4 = ((iM6981 ^ i2) * 4337) ^ 1653120214;
                        i5 = 320664189;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ۙۗ")) * 41;
                        i4 = ((iM6981 ^ i2) * 16419) ^ 523126380;
                        i5 = 182877998;
                    }
                    break;
                case 828496468:
                case 1532310017:
                    c11077.m27475(z);
                    iM6981 = C2105.m6981("۟ۤ") ^ i2;
                    i4 = ((iM6981 ^ i3) * (-1601)) ^ 1369449620;
                    i5 = 781413122;
                    break;
                case 830240546:
                case 1359067907:
                    C1294.m4372();
                    C3245.m9925();
                    iM6981 = (i3 - C2105.m6981("ۙۗ")) * 41;
                    i4 = ((iM6981 ^ i2) * 16419) ^ 523126380;
                    i5 = 182877998;
                    break;
                default:
                    C2958.m9034();
                    break;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public void m19017() {
        int iM2566;
        int i;
        int iM2567;
        int i2;
        int i3;
        int iM6981;
        int i4;
        int iM6982;
        int i5;
        int i6;
        int i7;
        ViewOnClickListenerC7042 viewOnClickListenerC7042 = this;
        int i8 = RunnableC0588.f2309;
        int i9 = RunnableC3474.f10992;
        int iM6983 = C2105.m6981("ۜܽ") ^ i9;
        int i10 = ((iM6983 ^ i8) * 18987) ^ (-530381670);
        ArrayList arrayList = null;
        Iterator itM6374 = null;
        C14802 c14802 = null;
        StringBuilder sb = null;
        String str = null;
        String strM1483 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i11 = iM6983 ^ (-723220209);
        LinearLayout linearLayout = null;
        int iM4384 = 0;
        boolean z = false;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        short s = 0;
        int i15 = 0;
        boolean z2 = false;
        int iM6984 = 0;
        boolean z3 = false;
        int i16 = -785129455;
        C11077 c11077 = null;
        int i17 = 0;
        while (true) {
            i16 = i11 ^ (i10 & (((i16 ^ i8) * 23701) >> 31));
            switch (i16) {
                case -2111776090:
                case 767757638:
                    str = str;
                    sArr = sArr;
                    strM1483 = C0237.m1483(sArr, 28, 3, i14);
                    if (C2105.f7037 == 0) {
                        iM2567 = (i8 - C0630.m2566("ܶ֨")) * 63;
                        i2 = ((iM2567 ^ i9) * 13775) ^ 2027752637;
                        i3 = -1566043160;
                        i6 = iM2567 ^ i3;
                        sArr = sArr;
                        str = str;
                        i11 = i6;
                        i10 = i2;
                    } else {
                        iM2566 = C0630.m2566("֡ۤ") ^ i9;
                        i10 = ((iM2566 ^ i8) * (-9147)) ^ 1677448329;
                        i = 478847048;
                        i7 = iM2566 ^ i;
                        sArr = sArr;
                        str = str;
                        i11 = i7;
                        viewOnClickListenerC7042 = this;
                    }
                    break;
                case -1998708263:
                case -1708421474:
                    str = str;
                    sArr = sArr;
                    i12 = 0;
                    if (C0483.m2123(itM6374)) {
                        iM2567 = (i9 - C0630.m2566("ۧ֫")) * 93;
                        i2 = ((iM2567 ^ i8) * (-19979)) ^ (-1726066021);
                        i3 = -1029546393;
                    } else {
                        iM2567 = C0630.m2566("᩹ۖ") ^ i8;
                        i2 = ((iM2567 ^ i9) * (-23579)) ^ 1158759348;
                        i3 = -571564412;
                    }
                    i6 = iM2567 ^ i3;
                    sArr = sArr;
                    str = str;
                    i11 = i6;
                    i10 = i2;
                    break;
                case -1931547875:
                case -1608412278:
                    z2 = false;
                    iM6981 = (C0630.m2566("۫֡") ^ i8) * (-67);
                    i2 = ((iM6981 ^ i9) * 22379) ^ (-1775737659);
                    i4 = 1099236369;
                    i6 = iM6981 ^ i4;
                    str = str;
                    i11 = i6;
                    i10 = i2;
                    break;
                case -1913619208:
                case -1257332925:
                    str = str;
                    sArr = sArr;
                    short s2 = f21694[24];
                    int i18 = s2 + 7568;
                    if (C0714.m2805()) {
                        int iM6985 = (C2105.m6981("ᩴۤ") ^ i9) * (-21);
                        s = s2;
                        i15 = i18;
                        sArr = sArr;
                        str = str;
                        i10 = ((iM6985 ^ i8) * 4441) ^ (-1507552326);
                        i11 = iM6985 ^ 2030362243;
                    } else {
                        s = s2;
                        i15 = i18;
                        iM2566 = C0630.m2566("֡ۤ") ^ i9;
                        i10 = ((iM2566 ^ i8) * (-9147)) ^ 1677448329;
                        i = 478847048;
                        i7 = iM2566 ^ i;
                        sArr = sArr;
                        str = str;
                        i11 = i7;
                    }
                    viewOnClickListenerC7042 = this;
                    break;
                case -1899336740:
                case -227670762:
                    str = str;
                    sArr = sArr;
                    int i19 = (s * s) + 57274624;
                    if ((i19 + i19) - (i15 * i15) >= 0) {
                        iM2566 = C0630.m2566("᩵ۗ") ^ i8;
                        i10 = ((iM2566 ^ i9) * (-5645)) ^ (-397207674);
                        i = 735338383;
                    } else {
                        iM2566 = C0630.m2566("ۤۨ") ^ i9;
                        i10 = ((iM2566 ^ i8) * (-3195)) ^ (-1471185966);
                        i = -60086638;
                    }
                    i7 = iM2566 ^ i;
                    sArr = sArr;
                    str = str;
                    i11 = i7;
                    viewOnClickListenerC7042 = this;
                    break;
                case -1856525257:
                case 728716644:
                    if (C0630.f2410 <= 0) {
                        str = str;
                        sArr = sArr;
                        iM2567 = C2105.m6981("ᩴܿ") ^ i9;
                        i2 = ((iM2567 ^ i8) * 23853) ^ 1357120381;
                        i3 = 237572947;
                        i6 = iM2567 ^ i3;
                        sArr = sArr;
                        str = str;
                        i11 = i6;
                        i10 = i2;
                    } else {
                        str = str;
                        int iM6986 = (C2105.m6981("֫᩵") + i8) * 93;
                        i10 = ((iM6986 ^ i9) * 11945) ^ 307889310;
                        i7 = iM6986 ^ (-968825459);
                        str = str;
                        i11 = i7;
                        viewOnClickListenerC7042 = this;
                    }
                    break;
                case -1844562011:
                case 1250794766:
                    str = str;
                    sArr = sArr;
                    arrayList = viewOnClickListenerC7042.f21696;
                    RunnableC1937.m6383(arrayList);
                    linearLayout.removeAllViews();
                    iM4384 = C1294.m4384(16.0f);
                    if (C0630.f2410 <= 0) {
                        iM2567 = C2105.m6981("ᩴܿ") ^ i9;
                        i2 = ((iM2567 ^ i8) * 23853) ^ 1357120381;
                        i3 = 237572947;
                    } else {
                        iM2567 = C0630.m2566("۫ۜ") ^ i9;
                        i2 = ((iM2567 ^ i8) * 26003) ^ (-592512624);
                        i3 = -974192510;
                    }
                    i6 = iM2567 ^ i3;
                    sArr = sArr;
                    str = str;
                    i11 = i6;
                    i10 = i2;
                    break;
                case -1678767267:
                case 1979534625:
                    c11077.m27482(str);
                    c11077.m27478(c14802.f45196);
                    c11077.m27479(c14802.f45193);
                    C0964.m3404(c11077, c14802);
                    if (C3911.f12484 < 0) {
                        C3663.m11165(linearLayout, c11077, new LinearLayout.LayoutParams(i12, -2, 1.0f));
                        C1916.m6307(arrayList, c11077);
                        C2126.m7039(c11077, viewOnClickListenerC7042);
                        z3 = z2;
                        iM2567 = C2105.m6981("ᩳ᩶") ^ i8;
                        i2 = ((iM2567 ^ i9) * 10129) ^ 1100912310;
                        i3 = 64175954;
                        i6 = iM2567 ^ i3;
                        sArr = sArr;
                        str = str;
                        i11 = i6;
                        i10 = i2;
                    }
                    str = str;
                    sArr = sArr;
                    iM2567 = C2105.m6981("ᩴܿ") ^ i9;
                    i2 = ((iM2567 ^ i8) * 23853) ^ 1357120381;
                    i3 = 237572947;
                    i6 = iM2567 ^ i3;
                    sArr = sArr;
                    str = str;
                    i11 = i6;
                    i10 = i2;
                    break;
                case -1652475973:
                case -839233033:
                    i14 = 47820;
                    iM2566 = (C2105.m6981("֫᩹") + i8) * 67;
                    i10 = ((iM2566 ^ i9) * (-23959)) ^ (-1662136484);
                    i = -245304166;
                    i7 = iM2566 ^ i;
                    sArr = sArr;
                    str = str;
                    i11 = i7;
                    viewOnClickListenerC7042 = this;
                    break;
                case -1543171970:
                case -49036729:
                    itM6374 = RunnableC1937.m6374(viewOnClickListenerC7042.f21695.f53844);
                    z = true;
                    z3 = true;
                    iM2567 = C2105.m6981("ᩳ᩶") ^ i8;
                    i2 = ((iM2567 ^ i9) * 10129) ^ 1100912310;
                    i3 = 64175954;
                    i6 = iM2567 ^ i3;
                    sArr = sArr;
                    str = str;
                    i11 = i6;
                    i10 = i2;
                    break;
                case -1264533916:
                case 1180931883:
                    RunnableC1937.m6377((TextView) C4263.m12813(viewOnClickListenerC7042, C0630.m2566(strM1483) ^ 2128623737), viewOnClickListenerC7042.f21695.f53843);
                    break;
                case -1246887349:
                case 1398715170:
                    str = str;
                    c14802 = (C14802) C2272.m7513(itM6374);
                    if (z3) {
                        iM6981 = C0630.m2566("ܶۗ") ^ i9;
                        i2 = ((iM6981 ^ i8) * 1793) ^ 1478488564;
                        i4 = -315309871;
                    } else {
                        iM6981 = C2105.m6981("ܰ᩺") ^ i8;
                        i2 = ((iM6981 ^ i9) * (-11279)) ^ 1197218893;
                        i4 = 1992851211;
                    }
                    i6 = iM6981 ^ i4;
                    str = str;
                    i11 = i6;
                    i10 = i2;
                    break;
                case -1136123827:
                case 920930331:
                    str = str;
                    sArr = sArr;
                    m19021();
                    iM6984 = C2105.m6981(RunnableC0588.m2436(f21694, 25, 3, i14));
                    if (C3911.f12484 < 0) {
                        iM2566 = C0630.m2566("۠۫") ^ i8;
                        i10 = ((iM2566 ^ i9) * 20077) ^ 99003041;
                        i = 1163023139;
                        i7 = iM2566 ^ i;
                        sArr = sArr;
                        str = str;
                        i11 = i7;
                        viewOnClickListenerC7042 = this;
                    } else {
                        sArr = sArr;
                        int iM6987 = (C2105.m6981("֫᩵") + i8) * 93;
                        i10 = ((iM6987 ^ i9) * 11945) ^ 307889310;
                        i7 = iM6987 ^ (-968825459);
                        str = str;
                        i11 = i7;
                        viewOnClickListenerC7042 = this;
                    }
                    break;
                case -1066675349:
                case -281839122:
                    linearLayout.addView(new Space(viewOnClickListenerC7042), iM4384, z ? 1 : 0);
                    z2 = z3;
                    iM6981 = (C0630.m2566("۫֡") ^ i8) * (-67);
                    i2 = ((iM6981 ^ i9) * 22379) ^ (-1775737659);
                    i4 = 1099236369;
                    i6 = iM6981 ^ i4;
                    str = str;
                    i11 = i6;
                    i10 = i2;
                    break;
                case -1008180187:
                case 1770145089:
                    C3245.m9923(sb, C0422.m1955(sArr2, i17, 2, i14));
                    c11077.m27474(C0422.m1959(sb));
                    str = c14802.f45195;
                    if (RunnableC0588.f2309 < 0) {
                        iM6982 = C0630.m2566("ۗۧ") ^ i8;
                        i2 = ((iM6982 ^ i9) * 1763) ^ (-1923449622);
                        i5 = -335124354;
                        i11 = iM6982 ^ i5;
                        i10 = i2;
                    } else {
                        str = str;
                        sArr = sArr;
                        iM2566 = C0630.m2566("֡ۤ") ^ i9;
                        i10 = ((iM2566 ^ i8) * (-9147)) ^ 1677448329;
                        i = 478847048;
                        i7 = iM2566 ^ i;
                        sArr = sArr;
                        str = str;
                        i11 = i7;
                        viewOnClickListenerC7042 = this;
                    }
                    break;
                case -936829399:
                case -222256508:
                    str = str;
                    c11077 = new C11077(viewOnClickListenerC7042);
                    sb = new StringBuilder();
                    i13 = c14802.f45194;
                    if (!C1711.f5919) {
                        iM6981 = C0630.m2566("۫ܺ") ^ i9;
                        i2 = ((iM6981 ^ i8) * (-29991)) ^ 1191151191;
                        i4 = 711410268;
                        i6 = iM6981 ^ i4;
                        str = str;
                        i11 = i6;
                        i10 = i2;
                    }
                    sArr = sArr;
                    iM2567 = C2105.m6981("ᩴܿ") ^ i9;
                    i2 = ((iM2567 ^ i8) * 23853) ^ 1357120381;
                    i3 = 237572947;
                    i6 = iM2567 ^ i3;
                    sArr = sArr;
                    str = str;
                    i11 = i6;
                    i10 = i2;
                    break;
                case -815346189:
                case -592875385:
                    str = str;
                    sArr = sArr;
                    linearLayout = (LinearLayout) C0964.m3409(viewOnClickListenerC7042, iM6984 ^ 2104369360);
                    if (C5695.f17556 >= 0) {
                        iM2567 = C2105.m6981("ۤ֫") ^ i9;
                        i2 = ((iM2567 ^ i8) * (-12285)) ^ (-740457748);
                        i3 = 846543295;
                    } else {
                        iM2567 = (i9 - C0630.m2566("ܺۚ")) * (-11);
                        i2 = ((iM2567 ^ i8) * (-2331)) ^ 894179837;
                        i3 = 1492984468;
                    }
                    i6 = iM2567 ^ i3;
                    sArr = sArr;
                    str = str;
                    i11 = i6;
                    i10 = i2;
                    break;
                case 205153910:
                case 1402941269:
                    if (C0964.m3413()) {
                        iM6982 = (C2105.m6981("ۚۘ") ^ i8) * 19;
                        i2 = ((iM6982 ^ i9) * 13329) ^ 130773789;
                        i5 = -51111180;
                        i11 = iM6982 ^ i5;
                        i10 = i2;
                    }
                    str = str;
                    sArr = sArr;
                    iM2567 = C2105.m6981("ᩴܿ") ^ i9;
                    i2 = ((iM2567 ^ i8) * 23853) ^ 1357120381;
                    i3 = 237572947;
                    i6 = iM2567 ^ i3;
                    sArr = sArr;
                    str = str;
                    i11 = i6;
                    i10 = i2;
                    break;
                case 264814508:
                case 1267552862:
                    str = str;
                    C0422.m1944(sb, i13);
                    sArr2 = f21694;
                    i17 = 31;
                    if (RunnableC1937.f6483 < 0) {
                        iM6981 = C2105.m6981("ۚ᩻") ^ i9;
                        i2 = ((iM6981 ^ i8) * (-19755)) ^ 1608892347;
                        i4 = -1576908951;
                        i6 = iM6981 ^ i4;
                        str = str;
                        i11 = i6;
                        i10 = i2;
                    } else {
                        sArr = sArr;
                        iM2566 = C0630.m2566("֡ۤ") ^ i9;
                        i10 = ((iM2566 ^ i8) * (-9147)) ^ 1677448329;
                        i = 478847048;
                        i7 = iM2566 ^ i;
                        sArr = sArr;
                        str = str;
                        i11 = i7;
                        viewOnClickListenerC7042 = this;
                    }
                    break;
                case 397393949:
                case 1874912693:
                    C22628.m50615();
                    str = str;
                    int iM6988 = (C2105.m6981("֫᩵") + i8) * 93;
                    i10 = ((iM6988 ^ i9) * 11945) ^ 307889310;
                    i7 = iM6988 ^ (-968825459);
                    str = str;
                    i11 = i7;
                    viewOnClickListenerC7042 = this;
                    break;
                case 915781208:
                case 1974902782:
                    C2958.m9034();
                    C3432.m10477();
                    break;
                case 1142315606:
                case 1537753721:
                    str = str;
                    ((C11077) C3537.m10755(arrayList, i12)).m27475(z);
                    m19014();
                    sArr = f21694;
                    if (C1047.f3863 < 0) {
                        iM6981 = C2105.m6981("ܶᩳ") ^ i9;
                        i2 = ((iM6981 ^ i8) * 25349) ^ 366956315;
                        i4 = -473239818;
                        i6 = iM6981 ^ i4;
                        str = str;
                        i11 = i6;
                        i10 = i2;
                    } else {
                        int iM6989 = (C2105.m6981("֫᩵") + i8) * 93;
                        i10 = ((iM6989 ^ i9) * 11945) ^ 307889310;
                        i7 = iM6989 ^ (-968825459);
                        str = str;
                        i11 = i7;
                        viewOnClickListenerC7042 = this;
                    }
                    break;
                case 2067060010:
                case 2103498886:
                    C3911.m11924();
                    if (C0630.f2410 > 0) {
                        str = str;
                        sArr = sArr;
                        iM2567 = C2105.m6981("ۤ֫") ^ i9;
                        i2 = ((iM2567 ^ i8) * (-12285)) ^ (-740457748);
                        i3 = 846543295;
                        i6 = iM2567 ^ i3;
                        sArr = sArr;
                        str = str;
                        i11 = i6;
                        i10 = i2;
                    }
                    str = str;
                    sArr = sArr;
                    iM2567 = C2105.m6981("ᩴܿ") ^ i9;
                    i2 = ((iM2567 ^ i8) * 23853) ^ 1357120381;
                    i3 = 237572947;
                    i6 = iM2567 ^ i3;
                    sArr = sArr;
                    str = str;
                    i11 = i6;
                    i10 = i2;
                    break;
                default:
                    i14 = 5229;
                    iM2566 = (C2105.m6981("֫᩹") + i8) * 67;
                    i10 = ((iM2566 ^ i9) * (-23959)) ^ (-1662136484);
                    i = -245304166;
                    i7 = iM2566 ^ i;
                    sArr = sArr;
                    str = str;
                    i11 = i7;
                    viewOnClickListenerC7042 = this;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C17625 c17625;
        int i;
        CharSequence charSequence;
        View view;
        boolean z;
        short[] sArr;
        int i2;
        short[] sArr2;
        int i3;
        TextView textView;
        int i4;
        View view2;
        int i5;
        boolean z2;
        int iM6981;
        int i6;
        int iM2566;
        int i7;
        short[] sArr3;
        boolean z3;
        View view3;
        boolean z4;
        int i8;
        short[] sArr4;
        int i9;
        View view4;
        int iM2567;
        int iM2568;
        int i10;
        int i11;
        boolean z5;
        boolean z6;
        int i12;
        int iM6982;
        int i13;
        int i14;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        C13132 c13132;
        int i15;
        boolean z13;
        int iM2569;
        int i16;
        int i17;
        boolean z14;
        int i18;
        int iM25610;
        int i19;
        int i20;
        bundle = bundle;
        int i21 = -1923526399;
        int i22 = C2167.f7158;
        int i23 = C3683.f11629;
        int iM25611 = C0630.m2566("۟ۖ") ^ i23;
        int i24 = ((iM25611 ^ i22) * 16879) ^ 134286764;
        int i25 = iM25611 ^ (-1406440867);
        C13132 c13133 = null;
        View viewM12813 = null;
        C17625 c17626 = null;
        EditText editText = null;
        String str = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        short[] sArr10 = null;
        int i26 = 0;
        int i27 = 0;
        View viewM12814 = null;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        boolean z15 = false;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        View.OnClickListener onClickListener = null;
        View viewM3409 = null;
        CharSequence charSequence2 = null;
        View view5 = null;
        View view6 = null;
        TextView textView2 = null;
        StringBuilder sb = null;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        TextView textView3 = null;
        InputFilter.AllCaps allCaps = null;
        int i38 = 0;
        DigitsKeyListener digitsKeyListener = null;
        int i39 = 0;
        while (true) {
            i21 = i25 ^ (i24 & (((i21 ^ i22) * (-19241)) >> 31));
            switch (i21) {
                case -2073227705:
                case 1997919931:
                    int i40 = i38;
                    c17626.f53845 = bundle.getString(C1128.m3841(f21694, 195, 12, i27), "");
                    c13133 = c13133;
                    i38 = i40;
                    i35 = i35;
                    i28 = i28;
                    view6 = view6;
                    i12 = i30;
                    i3 = i36;
                    iM6982 = C2105.m6981("ۘܰ") ^ i23;
                    i13 = ((iM6982 ^ i22) * (-23109)) ^ 1036365965;
                    i14 = -458914508;
                    i25 = iM6982 ^ i14;
                    i30 = i12;
                    i24 = i13;
                    i36 = i3;
                    i35 = i35;
                    z11 = z15;
                    view6 = view6;
                    i28 = i28;
                    z5 = z11;
                    c13133 = c13133;
                    z15 = z5;
                    i38 = i38;
                    break;
                case -2035024639:
                case -307404022:
                    int i41 = i35;
                    int i42 = i39;
                    C13132 c13134 = c13133;
                    boolean z16 = z15 ? 1 : 0;
                    int i43 = i28;
                    View view7 = view6;
                    int i44 = i36;
                    TextView textView4 = (TextView) C4263.m12813(this, i42);
                    this.f21700 = textView4;
                    C2126.m7039(textView4, new ViewOnClickListenerC18869(this, 3));
                    TextView textView5 = this.f21700;
                    CharSequence charSequenceM19010 = m19010(z16);
                    int iM6983 = (i23 - C2105.m6981("۠֫")) * (-3);
                    i25 = iM6983 ^ 2017579063;
                    i39 = i42;
                    i24 = ((iM6983 ^ i22) * (-1223)) ^ (-906587551);
                    sArr8 = sArr8;
                    c17626 = c17626;
                    sArr7 = sArr7;
                    i34 = i34;
                    z15 = z16 ? 1 : 0;
                    i30 = i30;
                    view5 = view5;
                    bundle = bundle;
                    textView3 = textView5;
                    charSequence2 = charSequenceM19010;
                    i36 = i44;
                    i35 = i41;
                    view6 = view7;
                    i28 = i43;
                    c13133 = c13134;
                    i38 = 3;
                    break;
                case -1988666338:
                case -1115697324:
                    C4159.m12565();
                    break;
                case -1945851244:
                case -862718609:
                    i35 = i35;
                    i38 = i38;
                    c13133 = c13133;
                    int i45 = i30;
                    i28 = i28;
                    view6 = view6;
                    i3 = i36;
                    viewM12813 = C4263.m12813(this, C2105.m6981(C2958.m9031(f21694, 123, 3, i27)) ^ 2104108733);
                    if (C11340.f33930 < 0) {
                        int iM6984 = (C2105.m6981("۫ܺ") + i23) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i24 = ((iM6984 ^ i22) * (-17455)) ^ (-624154261);
                        i25 = iM6984 ^ (-1540548932);
                        bundle = bundle;
                        i30 = i45;
                        i36 = i3;
                        i35 = i35;
                        z11 = z15;
                        view6 = view6;
                        i28 = i28;
                        z5 = z11;
                        c13133 = c13133;
                        z15 = z5;
                        i38 = i38;
                    } else {
                        i4 = i45;
                        c17625 = c17626;
                        view2 = viewM3409;
                        i = i39;
                        textView = textView3;
                        charSequence = charSequence2;
                        view = view5;
                        z = z15 ? 1 : 0;
                        sArr = sArr7;
                        i2 = i34;
                        sArr2 = sArr8;
                        int iM6985 = (i22 - C2105.m6981("ۘ᩺")) * (-57);
                        int i46 = i4;
                        i24 = ((iM6985 ^ i23) * (-20487)) ^ 2108797258;
                        i25 = iM6985 ^ 605942988;
                        bundle = bundle;
                        textView3 = textView;
                        sArr8 = sArr2;
                        i36 = i3;
                        sArr7 = sArr;
                        i34 = i2;
                        z15 = z;
                        view5 = view;
                        view6 = view6;
                        i28 = i28;
                        i39 = i;
                        charSequence2 = charSequence;
                        c13133 = c13133;
                        c17626 = c17625;
                        i38 = i38;
                        i30 = i46;
                        viewM3409 = view2;
                        i35 = i35;
                    }
                    break;
                case -1910495343:
                case -1065232582:
                    i8 = i35;
                    i38 = i38;
                    c13133 = c13133;
                    boolean z17 = z15 ? 1 : 0;
                    sArr4 = sArr7;
                    i9 = i34;
                    i28 = i28;
                    view6 = view6;
                    i36 = i36;
                    textView3 = textView3;
                    i30 = i30;
                    c17626 = c17626;
                    charSequence2 = charSequence2;
                    view4 = view5;
                    short[] sArr11 = sArr8;
                    m19021();
                    short[] sArr12 = f21694;
                    boolean z18 = z17 ? 1 : 0;
                    iM2567 = C0630.m2566(C0237.m1483(sArr12, 108, 3, i27)) ^ 2097578876;
                    if (C3746.m11369() < 0) {
                        int iM25612 = (C0630.m2566("᩷ᩴ") + i22) * (-9);
                        i25 = iM25612 ^ (-1233506321);
                        i24 = ((iM25612 ^ i23) * 16861) ^ (-1488561693);
                        sArr8 = sArr11;
                        sArr7 = sArr4;
                        i35 = i8;
                        i34 = i9;
                        z3 = z18 ? 1 : 0;
                        view5 = view4;
                        i39 = iM2567;
                        charSequence2 = charSequence2;
                        c17626 = c17626;
                        bundle = bundle;
                        z12 = z3;
                        i30 = i30;
                        z10 = z12;
                        textView3 = textView3;
                        i36 = i36;
                        z11 = z10;
                        view6 = view6;
                        i28 = i28;
                        z5 = z11;
                        c13133 = c13133;
                        z15 = z5;
                        i38 = i38;
                    } else {
                        sArr8 = sArr11;
                        z6 = z18;
                        int iM6986 = C2105.m6981("ۗ۟") ^ i23;
                        i25 = iM6986 ^ 1536467466;
                        i24 = ((iM6986 ^ i22) * (-629)) ^ 112068334;
                        view5 = view4;
                        sArr7 = sArr4;
                        i35 = i8;
                        i34 = i9;
                        charSequence2 = charSequence2;
                        z10 = z6;
                        c17626 = c17626;
                        i39 = iM2567;
                        i30 = i30;
                        bundle = bundle;
                        textView3 = textView3;
                        i36 = i36;
                        z11 = z10;
                        view6 = view6;
                        i28 = i28;
                        z5 = z11;
                        c13133 = c13133;
                        z15 = z5;
                        i38 = i38;
                    }
                    break;
                case -1889927702:
                case -558849697:
                    int i47 = i35;
                    short[] sArr13 = sArr6;
                    int i48 = i32;
                    int i49 = i33;
                    textView3 = textView3;
                    i30 = i30;
                    charSequence2 = charSequence2;
                    view3 = view5;
                    C4159.m12564(C4263.m12813(this, C2105.m6981(C1773.m5917(sArr13, i48, i49, i27)) ^ 2126776409), new ViewOnClickListenerC20259(0, this));
                    int iM25613 = C0630.m2566("֨ܽ") ^ i23;
                    i24 = ((iM25613 ^ i22) * (-32059)) ^ (-1501570051);
                    i25 = iM25613 ^ 872849474;
                    sArr8 = sArr8;
                    sArr7 = sArr7;
                    i35 = i47;
                    i34 = i34;
                    i39 = i39;
                    i33 = i49;
                    sArr6 = sArr13;
                    i32 = i48;
                    z4 = false;
                    view5 = view3;
                    z9 = z4;
                    charSequence2 = charSequence2;
                    c17626 = c17626;
                    z12 = z9;
                    i30 = i30;
                    z10 = z12;
                    textView3 = textView3;
                    i36 = i36;
                    z11 = z10;
                    view6 = view6;
                    i28 = i28;
                    z5 = z11;
                    c13133 = c13133;
                    z15 = z5;
                    i38 = i38;
                    break;
                case -1548855354:
                case 1298352771:
                    i35 = i35;
                    c17625 = c17626;
                    i38 = i38;
                    i = i39;
                    charSequence = charSequence2;
                    view = view5;
                    c13133 = c13133;
                    z = z15 ? 1 : 0;
                    sArr = sArr7;
                    i2 = i34;
                    sArr2 = sArr8;
                    i28 = i28;
                    view6 = view6;
                    i3 = i36;
                    textView = textView3;
                    i4 = 1;
                    view2 = viewM3409;
                    C4159.m12564(view2, new ViewOnClickListenerC2641(this, i4));
                    sArr6 = f21694;
                    i32 = IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i33 = 3;
                    if (C0483.f2088 < 0) {
                        int iM25614 = (C0630.m2566("ۘ۬") ^ i22) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i24 = ((iM25614 ^ i23) * 14567) ^ 1565864384;
                        i25 = iM25614 ^ (-488673295);
                        bundle = bundle;
                        viewM3409 = view2;
                        textView3 = textView;
                        sArr8 = sArr2;
                        i36 = i3;
                        sArr7 = sArr;
                        i35 = i35;
                        i34 = i2;
                        z15 = z ? 1 : 0;
                        view5 = view;
                        view6 = view6;
                        i28 = i28;
                        i39 = i;
                        charSequence2 = charSequence;
                        c13133 = c13133;
                        c17626 = c17625;
                        i30 = 1;
                        i38 = i38;
                    } else {
                        int iM6987 = (i22 - C2105.m6981("ۘ᩺")) * (-57);
                        int i410 = i4;
                        i24 = ((iM6987 ^ i23) * (-20487)) ^ 2108797258;
                        i25 = iM6987 ^ 605942988;
                        bundle = bundle;
                        textView3 = textView;
                        sArr8 = sArr2;
                        i36 = i3;
                        sArr7 = sArr;
                        i34 = i2;
                        z15 = z;
                        view5 = view;
                        view6 = view6;
                        i28 = i28;
                        i39 = i;
                        charSequence2 = charSequence;
                        c13133 = c13133;
                        c17626 = c17625;
                        i38 = i38;
                        i30 = i410;
                        viewM3409 = view2;
                        i35 = i35;
                    }
                    break;
                case -1543450381:
                case -1074652848:
                    C1711.m5736();
                    C4263.m12819();
                    i35 = i35;
                    i38 = i38;
                    i39 = i39;
                    c13133 = c13133;
                    z7 = z15 ? 1 : 0;
                    sArr3 = sArr5;
                    i31 = i31;
                    sArr6 = sArr6;
                    i32 = i32;
                    i33 = i33;
                    sArr7 = sArr7;
                    i34 = i34;
                    i28 = i28;
                    view6 = view6;
                    i36 = i36;
                    textView3 = textView3;
                    i30 = i30;
                    c17626 = c17626;
                    charSequence2 = charSequence2;
                    view5 = view5;
                    sArr8 = sArr8;
                    iM6981 = C0630.m2566("ۤ᩻") ^ i23;
                    sArr5 = sArr3;
                    i24 = ((iM6981 ^ i22) * (-31285)) ^ (-1156560322);
                    i6 = 1241054894;
                    z8 = z7;
                    i31 = i31;
                    sArr8 = sArr8;
                    sArr7 = sArr7;
                    i35 = i35;
                    i34 = i34;
                    i33 = i33;
                    sArr6 = sArr6;
                    i32 = i32;
                    sArr5 = sArr5;
                    i25 = iM6981 ^ i6;
                    z9 = z8;
                    view5 = view5;
                    i39 = i39;
                    bundle = bundle;
                    charSequence2 = charSequence2;
                    c17626 = c17626;
                    z12 = z9;
                    i30 = i30;
                    z10 = z12;
                    textView3 = textView3;
                    i36 = i36;
                    z11 = z10;
                    view6 = view6;
                    i28 = i28;
                    z5 = z11;
                    c13133 = c13133;
                    z15 = z5;
                    i38 = i38;
                    break;
                case -1438817944:
                case -232501790:
                    if (C4263.f13799 > 0) {
                        i35 = i35;
                        i38 = i38;
                        iM2569 = C0630.m2566("ۙۛ") ^ i22;
                        i16 = ((iM2569 ^ i23) * 21067) ^ (-334406765);
                        i17 = 1968285376;
                        i25 = iM2569 ^ i17;
                        i24 = i16;
                        z14 = z15;
                        i38 = i38;
                        z15 = z14;
                        i35 = i35;
                    } else {
                        i35 = i35;
                        i38 = i38;
                        i39 = i39;
                        c13133 = c13133;
                        z7 = z15 ? 1 : 0;
                        sArr3 = sArr5;
                        i31 = i31;
                        sArr6 = sArr6;
                        i32 = i32;
                        i33 = i33;
                        sArr7 = sArr7;
                        i34 = i34;
                        i28 = i28;
                        view6 = view6;
                        i36 = i36;
                        textView3 = textView3;
                        i30 = i30;
                        c17626 = c17626;
                        charSequence2 = charSequence2;
                        view5 = view5;
                        sArr8 = sArr8;
                        iM6981 = C0630.m2566("ۤ᩻") ^ i23;
                        sArr5 = sArr3;
                        i24 = ((iM6981 ^ i22) * (-31285)) ^ (-1156560322);
                        i6 = 1241054894;
                        z8 = z7;
                        i31 = i31;
                        sArr8 = sArr8;
                        sArr7 = sArr7;
                        i35 = i35;
                        i34 = i34;
                        i33 = i33;
                        sArr6 = sArr6;
                        i32 = i32;
                        sArr5 = sArr5;
                        i25 = iM6981 ^ i6;
                        z9 = z8;
                        view5 = view5;
                        i39 = i39;
                        bundle = bundle;
                        charSequence2 = charSequence2;
                        c17626 = c17626;
                        z12 = z9;
                        i30 = i30;
                        z10 = z12;
                        textView3 = textView3;
                        i36 = i36;
                        z11 = z10;
                        view6 = view6;
                        i28 = i28;
                        z5 = z11;
                        c13133 = c13133;
                        z15 = z5;
                        i38 = i38;
                    }
                    break;
                case -1408765500:
                case -827624940:
                    if (C0630.f2410 <= 0) {
                        i8 = i35;
                        i38 = i38;
                        iM2567 = i39;
                        c13133 = c13133;
                        z6 = z15 ? 1 : 0;
                        sArr4 = sArr7;
                        i9 = i34;
                        i28 = i28;
                        view6 = view6;
                        i36 = i36;
                        textView3 = textView3;
                        i30 = i30;
                        c17626 = c17626;
                        charSequence2 = charSequence2;
                        view4 = view5;
                        int iM6988 = C2105.m6981("ۗ۟") ^ i23;
                        i25 = iM6988 ^ 1536467466;
                        i24 = ((iM6988 ^ i22) * (-629)) ^ 112068334;
                        view5 = view4;
                        sArr7 = sArr4;
                        i35 = i8;
                        i34 = i9;
                        charSequence2 = charSequence2;
                        z10 = z6;
                        c17626 = c17626;
                        i39 = iM2567;
                        i30 = i30;
                        bundle = bundle;
                        textView3 = textView3;
                        i36 = i36;
                        z11 = z10;
                        view6 = view6;
                        i28 = i28;
                        z5 = z11;
                        c13133 = c13133;
                        z15 = z5;
                        i38 = i38;
                    }
                    i35 = i35;
                    i38 = i38;
                    i39 = i39;
                    c13133 = c13133;
                    z7 = z15 ? 1 : 0;
                    sArr3 = sArr5;
                    i31 = i31;
                    sArr6 = sArr6;
                    i32 = i32;
                    i33 = i33;
                    sArr7 = sArr7;
                    i34 = i34;
                    i28 = i28;
                    view6 = view6;
                    i36 = i36;
                    textView3 = textView3;
                    i30 = i30;
                    c17626 = c17626;
                    charSequence2 = charSequence2;
                    view5 = view5;
                    sArr8 = sArr8;
                    iM6981 = C0630.m2566("ۤ᩻") ^ i23;
                    sArr5 = sArr3;
                    i24 = ((iM6981 ^ i22) * (-31285)) ^ (-1156560322);
                    i6 = 1241054894;
                    z8 = z7;
                    i31 = i31;
                    sArr8 = sArr8;
                    sArr7 = sArr7;
                    i35 = i35;
                    i34 = i34;
                    i33 = i33;
                    sArr6 = sArr6;
                    i32 = i32;
                    sArr5 = sArr5;
                    i25 = iM6981 ^ i6;
                    z9 = z8;
                    view5 = view5;
                    i39 = i39;
                    bundle = bundle;
                    charSequence2 = charSequence2;
                    c17626 = c17626;
                    z12 = z9;
                    i30 = i30;
                    z10 = z12;
                    textView3 = textView3;
                    i36 = i36;
                    z11 = z10;
                    view6 = view6;
                    i28 = i28;
                    z5 = z11;
                    c13133 = c13133;
                    z15 = z5;
                    i38 = i38;
                    break;
                case -1385873937:
                case 1487695975:
                    i35 = i35;
                    i38 = i38;
                    i39 = i39;
                    c13133 = c13133;
                    boolean z19 = z15 ? 1 : 0;
                    sArr5 = sArr5;
                    i31 = i31;
                    sArr6 = sArr6;
                    i32 = i32;
                    i33 = i33;
                    sArr7 = sArr7;
                    i34 = i34;
                    i28 = i28;
                    view6 = view6;
                    i36 = i36;
                    textView3 = textView3;
                    i30 = i30;
                    c17626 = c17626;
                    charSequence2 = charSequence2;
                    view5 = view5;
                    sArr8 = sArr8;
                    short s = f21694[95];
                    int i50 = 69708 * s;
                    int i51 = s + 17427;
                    if ((i51 * i51) - i50 < 0) {
                        iM6981 = C0630.m2566("᩻ܰ") ^ i22;
                        i24 = ((iM6981 ^ i23) * (-30047)) ^ 418761542;
                        i6 = 1663445360;
                        z8 = z19;
                    } else {
                        iM6981 = C2105.m6981("֡ۨ") ^ i23;
                        i24 = ((iM6981 ^ i22) * 13097) ^ 973149304;
                        i6 = 320232554;
                        z8 = z19;
                    }
                    i31 = i31;
                    sArr8 = sArr8;
                    sArr7 = sArr7;
                    i35 = i35;
                    i34 = i34;
                    i33 = i33;
                    sArr6 = sArr6;
                    i32 = i32;
                    sArr5 = sArr5;
                    i25 = iM6981 ^ i6;
                    z9 = z8;
                    view5 = view5;
                    i39 = i39;
                    bundle = bundle;
                    charSequence2 = charSequence2;
                    c17626 = c17626;
                    z12 = z9;
                    i30 = i30;
                    z10 = z12;
                    textView3 = textView3;
                    i36 = i36;
                    z11 = z10;
                    view6 = view6;
                    i28 = i28;
                    z5 = z11;
                    c13133 = c13133;
                    z15 = z5;
                    i38 = i38;
                    break;
                case -1357661937:
                case -977659680:
                    C3683.m11222();
                    if (C1128.m3851() <= 0) {
                        i35 = i35;
                        i38 = i38;
                        view2 = viewM3409;
                        i = i39;
                        c13133 = c13133;
                        i4 = i30;
                        z = z15 ? 1 : 0;
                        sArr = sArr7;
                        i2 = i34;
                        c17625 = c17626;
                        charSequence = charSequence2;
                        view = view5;
                        i28 = i28;
                        view6 = view6;
                        sArr2 = sArr8;
                        i3 = i36;
                        textView = textView3;
                        int iM6989 = (i22 - C2105.m6981("ۘ᩺")) * (-57);
                        int i411 = i4;
                        i24 = ((iM6989 ^ i23) * (-20487)) ^ 2108797258;
                        i25 = iM6989 ^ 605942988;
                        bundle = bundle;
                        textView3 = textView;
                        sArr8 = sArr2;
                        i36 = i3;
                        sArr7 = sArr;
                        i34 = i2;
                        z15 = z;
                        view5 = view;
                        view6 = view6;
                        i28 = i28;
                        i39 = i;
                        charSequence2 = charSequence;
                        c13133 = c13133;
                        c17626 = c17625;
                        i38 = i38;
                        i30 = i411;
                        viewM3409 = view2;
                        i35 = i35;
                    } else {
                        i35 = i35;
                        i38 = i38;
                        i39 = i39;
                        c13133 = c13133;
                        z7 = z15 ? 1 : 0;
                        sArr3 = sArr5;
                        i31 = i31;
                        sArr6 = sArr6;
                        i32 = i32;
                        i33 = i33;
                        sArr7 = sArr7;
                        i34 = i34;
                        i28 = i28;
                        view6 = view6;
                        i36 = i36;
                        textView3 = textView3;
                        i30 = i30;
                        c17626 = c17626;
                        charSequence2 = charSequence2;
                        view5 = view5;
                        sArr8 = sArr8;
                        iM6981 = C0630.m2566("ۤ᩻") ^ i23;
                        sArr5 = sArr3;
                        i24 = ((iM6981 ^ i22) * (-31285)) ^ (-1156560322);
                        i6 = 1241054894;
                        z8 = z7;
                        i31 = i31;
                        sArr8 = sArr8;
                        sArr7 = sArr7;
                        i35 = i35;
                        i34 = i34;
                        i33 = i33;
                        sArr6 = sArr6;
                        i32 = i32;
                        sArr5 = sArr5;
                        i25 = iM6981 ^ i6;
                        z9 = z8;
                        view5 = view5;
                        i39 = i39;
                        bundle = bundle;
                        charSequence2 = charSequence2;
                        c17626 = c17626;
                        z12 = z9;
                        i30 = i30;
                        z10 = z12;
                        textView3 = textView3;
                        i36 = i36;
                        z11 = z10;
                        view6 = view6;
                        i28 = i28;
                        z5 = z11;
                        c13133 = c13133;
                        z15 = z5;
                        i38 = i38;
                    }
                    break;
                case -1317067721:
                case 1674086794:
                    C4263.m12821(new C13907(this, (C20765) C2958.m9023(this)));
                    break;
                case -1166829245:
                case 1918573211:
                    i27 = 41501;
                    iM6981 = C2105.m6981("ܽۤ") ^ i23;
                    i24 = ((iM6981 ^ i22) * (-6527)) ^ 2123178172;
                    i6 = 1059340574;
                    z8 = z15;
                    i31 = i31;
                    sArr8 = sArr8;
                    sArr7 = sArr7;
                    i35 = i35;
                    i34 = i34;
                    i33 = i33;
                    sArr6 = sArr6;
                    i32 = i32;
                    sArr5 = sArr5;
                    i25 = iM6981 ^ i6;
                    z9 = z8;
                    view5 = view5;
                    i39 = i39;
                    bundle = bundle;
                    charSequence2 = charSequence2;
                    c17626 = c17626;
                    z12 = z9;
                    i30 = i30;
                    z10 = z12;
                    textView3 = textView3;
                    i36 = i36;
                    z11 = z10;
                    view6 = view6;
                    i28 = i28;
                    z5 = z11;
                    c13133 = c13133;
                    z15 = z5;
                    i38 = i38;
                    break;
                case -1135726123:
                case 1910833299:
                    i38 = i38;
                    i35 = i35;
                    digitsKeyListener = DigitsKeyListener.getInstance(C1005.m3502(f21694, 132, 56, i27));
                    allCaps = new InputFilter.AllCaps();
                    if (C0237.m1481() >= 0) {
                        iM2569 = C0630.m2566("ۙۛ") ^ i22;
                        i16 = ((iM2569 ^ i23) * 21067) ^ (-334406765);
                        i17 = 1968285376;
                    } else {
                        iM2569 = C0630.m2566("ۚ֡") ^ i23;
                        i16 = ((iM2569 ^ i22) * (-27101)) ^ (-649089744);
                        i17 = -1368230211;
                    }
                    i25 = iM2569 ^ i17;
                    i24 = i16;
                    z14 = z15;
                    i38 = i38;
                    z15 = z14;
                    i35 = i35;
                    break;
                case -1114330397:
                case 1159690833:
                    i18 = i38;
                    textView2 = (TextView) C4263.m12813(this, C0630.m2566(C2126.m7036(sArr9, i35, i36, i27)) ^ 2127946595);
                    sb = new StringBuilder(C0714.m2816(f21694, 191, 1, i27));
                    sArr10 = f21694;
                    i37 = 192;
                    i26 = 3;
                    if (C1773.f6144 > 0) {
                        iM25610 = (C0630.m2566("ۜۢ") + i23) * (-41);
                        i19 = ((iM25610 ^ i22) * 32565) ^ (-289309424);
                        i20 = -807025901;
                        i25 = iM25610 ^ i20;
                        i24 = i19;
                        i38 = i18;
                    } else {
                        i38 = i18;
                        i35 = i35;
                        iM2569 = C0630.m2566("ۙۛ") ^ i22;
                        i16 = ((iM2569 ^ i23) * 21067) ^ (-334406765);
                        i17 = 1968285376;
                        i25 = iM2569 ^ i17;
                        i24 = i16;
                        z14 = z15;
                        i38 = i38;
                        z15 = z14;
                        i35 = i35;
                    }
                    break;
                case -924251697:
                case 1315477254:
                    int i52 = i36;
                    c13132 = c13133;
                    boolean z20 = z15 ? 1 : 0;
                    C17648.m41314(c13132, z20 ? 1 : 0, i29);
                    View viewM12815 = C4263.m12813(this, C2105.m6981(C3432.m10488(f21694, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, 3, i27)) ^ 2104342097);
                    int iM25615 = (i22 - C0630.m2566("ۗ᩺")) * (-69);
                    i15 = ((iM25615 ^ i23) * (-19339)) ^ 1152750295;
                    i25 = iM25615 ^ (-1484818818);
                    z13 = z20 ? 1 : 0;
                    i36 = i52;
                    i28 = i28;
                    view6 = viewM12815;
                    i24 = i15;
                    c13133 = c13132;
                    c17626 = c17626;
                    i30 = i30;
                    z14 = z13;
                    i38 = i38;
                    z15 = z14;
                    i35 = i35;
                    break;
                case -878483532:
                case 2121990020:
                    i35 = i35;
                    i38 = i38;
                    i39 = i39;
                    c13133 = c13133;
                    boolean z21 = z15 ? 1 : 0;
                    sArr5 = sArr5;
                    i31 = i31;
                    sArr6 = sArr6;
                    i32 = i32;
                    i33 = i33;
                    sArr7 = sArr7;
                    i34 = i34;
                    i28 = i28;
                    view6 = view6;
                    i36 = i36;
                    textView3 = textView3;
                    i30 = i30;
                    c17626 = c17626;
                    charSequence2 = charSequence2;
                    view5 = view5;
                    sArr8 = sArr8;
                    super.onCreate(bundle);
                    if (RunnableC1937.m6373()) {
                        iM6981 = C0630.m2566("ܳ۟") ^ i22;
                        i24 = ((iM6981 ^ i23) * (-13701)) ^ (-640305654);
                        i6 = -1010278287;
                        z8 = z21;
                    } else {
                        iM6981 = (i22 - C0630.m2566("᩹ۤ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i24 = ((iM6981 ^ i23) * 15485) ^ 1941856155;
                        i6 = 176772894;
                        z8 = z21;
                    }
                    i31 = i31;
                    sArr8 = sArr8;
                    sArr7 = sArr7;
                    i35 = i35;
                    i34 = i34;
                    i33 = i33;
                    sArr6 = sArr6;
                    i32 = i32;
                    sArr5 = sArr5;
                    i25 = iM6981 ^ i6;
                    z9 = z8;
                    view5 = view5;
                    i39 = i39;
                    bundle = bundle;
                    charSequence2 = charSequence2;
                    c17626 = c17626;
                    z12 = z9;
                    i30 = i30;
                    z10 = z12;
                    textView3 = textView3;
                    i36 = i36;
                    z11 = z10;
                    view6 = view6;
                    i28 = i28;
                    z5 = z11;
                    c13133 = c13133;
                    z15 = z5;
                    i38 = i38;
                    break;
                case -629828755:
                case 270704513:
                    i35 = i35;
                    i38 = i38;
                    editText = (EditText) C4263.m12813(this, C0630.m2566(C1773.m5917(f21694, 129, 3, i27)) ^ 2098671687);
                    iM2569 = C0630.m2566("ۨۘ") ^ i22;
                    i16 = ((iM2569 ^ i23) * (-25117)) ^ 1476577047;
                    i17 = 1696096515;
                    i25 = iM2569 ^ i17;
                    i24 = i16;
                    z14 = z15;
                    i38 = i38;
                    z15 = z14;
                    i35 = i35;
                    break;
                case -547625001:
                case -505866536:
                    C3663.m11161(C0630.m2566(AbstractC2021.m6573(f21694, 126, 3, i27)) ^ 2102369119);
                    C2272.m7505(this);
                    break;
                case -409917216:
                case -155505900:
                    i27 = 47330;
                    iM6981 = C2105.m6981("ܽۤ") ^ i23;
                    i24 = ((iM6981 ^ i22) * (-6527)) ^ 2123178172;
                    i6 = 1059340574;
                    z8 = z15;
                    i31 = i31;
                    sArr8 = sArr8;
                    sArr7 = sArr7;
                    i35 = i35;
                    i34 = i34;
                    i33 = i33;
                    sArr6 = sArr6;
                    i32 = i32;
                    sArr5 = sArr5;
                    i25 = iM6981 ^ i6;
                    z9 = z8;
                    view5 = view5;
                    i39 = i39;
                    bundle = bundle;
                    charSequence2 = charSequence2;
                    c17626 = c17626;
                    z12 = z9;
                    i30 = i30;
                    z10 = z12;
                    textView3 = textView3;
                    i36 = i36;
                    z11 = z10;
                    view6 = view6;
                    i28 = i28;
                    z5 = z11;
                    c13133 = c13133;
                    z15 = z5;
                    i38 = i38;
                    break;
                case -280118443:
                case 2131766387:
                    c13132 = c13133;
                    boolean z22 = z15 ? 1 : 0;
                    int i53 = i28;
                    View view8 = view6;
                    int i54 = i36;
                    short[] sArr14 = sArr7;
                    int i55 = i34;
                    View viewM12816 = C4263.m12813(this, C0630.m2566(C0714.m2816(sArr14, i55, 3, i27)) ^ 2126861256);
                    String strM6435 = ViewOnClickListenerC1958.m6435(f21694, 114, 3, i27);
                    int iM25616 = (i23 - C0630.m2566("ᩳ۠")) * 55;
                    i15 = ((iM25616 ^ i22) * (-28691)) ^ 987139990;
                    i25 = iM25616 ^ (-1164450477);
                    sArr8 = sArr8;
                    i36 = i54;
                    sArr7 = sArr14;
                    i34 = i55;
                    z13 = z22 ? 1 : 0;
                    view5 = viewM12816;
                    view6 = view8;
                    i28 = i53;
                    str = strM6435;
                    i24 = i15;
                    c13133 = c13132;
                    c17626 = c17626;
                    i30 = i30;
                    z14 = z13;
                    i38 = i38;
                    z15 = z14;
                    i35 = i35;
                    break;
                case -214863719:
                case 435882886:
                    i18 = i38;
                    C3245.m9923(sb, C0050.m946(this, C0630.m2566(C0382.m1840(sArr10, i37, i26, i27)) ^ 2100684167));
                    RunnableC1937.m6377(textView2, C0050.m947(sb));
                    C3245.m9918(textView2, C21943.f70293);
                    editText.addTextChangedListener(new C11792(this));
                    if (this.f21695.f53844 == null) {
                        iM25610 = (i23 - C0630.m2566("֨ۤ")) * (-51);
                        i19 = ((iM25610 ^ i22) * (-17229)) ^ (-157865764);
                        i20 = 718283319;
                    } else {
                        iM25610 = C0630.m2566("ܶܳ") ^ i22;
                        i19 = ((iM25610 ^ i23) * (-26043)) ^ (-569366896);
                        i20 = -710775329;
                    }
                    i25 = iM25610 ^ i20;
                    i24 = i19;
                    i38 = i18;
                    break;
                case -109606781:
                case 1526033751:
                    InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(12);
                    i38 = i38;
                    InputFilter[] inputFilterArr = new InputFilter[i38];
                    inputFilterArr[z15 ? 1 : 0] = digitsKeyListener;
                    inputFilterArr[i30] = allCaps;
                    inputFilterArr[i29] = lengthFilter;
                    editText.setFilters(inputFilterArr);
                    C1047.m3601(editText, this.f21695.f53845);
                    sArr9 = f21694;
                    i35 = 188;
                    i36 = 3;
                    if (C3537.m10746() > 0) {
                        int iM25617 = C0630.m2566("ۤܶ") ^ i22;
                        i5 = ((iM25617 ^ i23) * 28455) ^ 542974333;
                        i25 = iM25617 ^ (-1672926555);
                        z2 = z15;
                        i24 = i5;
                        z15 = z2;
                        i38 = i38;
                    } else {
                        i39 = i39;
                        textView3 = textView3;
                        c13133 = c13133;
                        i30 = i30;
                        z7 = z15 ? 1 : 0;
                        sArr3 = sArr5;
                        i31 = i31;
                        sArr6 = sArr6;
                        i32 = i32;
                        i33 = i33;
                        sArr7 = sArr7;
                        i34 = i34;
                        i35 = 188;
                        c17626 = c17626;
                        charSequence2 = charSequence2;
                        view5 = view5;
                        i28 = i28;
                        view6 = view6;
                        sArr8 = sArr8;
                        i36 = 3;
                        iM6981 = C0630.m2566("ۤ᩻") ^ i23;
                        sArr5 = sArr3;
                        i24 = ((iM6981 ^ i22) * (-31285)) ^ (-1156560322);
                        i6 = 1241054894;
                        z8 = z7;
                        i31 = i31;
                        sArr8 = sArr8;
                        sArr7 = sArr7;
                        i35 = i35;
                        i34 = i34;
                        i33 = i33;
                        sArr6 = sArr6;
                        i32 = i32;
                        sArr5 = sArr5;
                        i25 = iM6981 ^ i6;
                        z9 = z8;
                        view5 = view5;
                        i39 = i39;
                        bundle = bundle;
                        charSequence2 = charSequence2;
                        c17626 = c17626;
                        z12 = z9;
                        i30 = i30;
                        z10 = z12;
                        textView3 = textView3;
                        i36 = i36;
                        z11 = z10;
                        view6 = view6;
                        i28 = i28;
                        z5 = z11;
                        c13133 = c13133;
                        z15 = z5;
                        i38 = i38;
                    }
                    break;
                case 46907362:
                case 756629961:
                    i35 = i35;
                    i38 = i38;
                    i28 = i28;
                    view6 = view6;
                    int i56 = i30;
                    boolean z23 = z15 ? 1 : 0;
                    i3 = i36;
                    c17625 = c17626;
                    short[] sArr15 = sArr8;
                    C13132 c13135 = (C13132) C0964.m3409(this, C0630.m2566(C0422.m1955(sArr15, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 3, i27)) ^ 2121873264);
                    c13135.setLayoutManager(new C21354((Context) this, i38));
                    ViewOnClickListenerC1958.m6442(c13135, new C18331(this, this));
                    C4915.m14286(c13135);
                    i29 = 2;
                    if (C0237.f1507 == 0) {
                        int iM25618 = C0630.m2566("᩸ܿ") ^ i23;
                        i5 = ((iM25618 ^ i22) * (-1717)) ^ 770694989;
                        i25 = iM25618 ^ (-1158910676);
                        z2 = z23 ? 1 : 0;
                        sArr8 = sArr15;
                        i36 = i3;
                        c17626 = c17625;
                        bundle = bundle;
                        i30 = i56;
                        view6 = view6;
                        i28 = i28;
                        i35 = i35;
                        c13133 = c13135;
                        i24 = i5;
                        z15 = z2;
                        i38 = i38;
                    } else {
                        c13133 = c13135;
                        i4 = i56;
                        view2 = viewM3409;
                        i = i39;
                        textView = textView3;
                        sArr = sArr7;
                        i2 = i34;
                        z = z23 ? 1 : 0;
                        View view9 = view5;
                        sArr2 = sArr15;
                        charSequence = charSequence2;
                        view = view9;
                        int iM69810 = (i22 - C2105.m6981("ۘ᩺")) * (-57);
                        int i412 = i4;
                        i24 = ((iM69810 ^ i23) * (-20487)) ^ 2108797258;
                        i25 = iM69810 ^ 605942988;
                        bundle = bundle;
                        textView3 = textView;
                        sArr8 = sArr2;
                        i36 = i3;
                        sArr7 = sArr;
                        i34 = i2;
                        z15 = z;
                        view5 = view;
                        view6 = view6;
                        i28 = i28;
                        i39 = i;
                        charSequence2 = charSequence;
                        c13133 = c13133;
                        c17626 = c17625;
                        i38 = i38;
                        i30 = i412;
                        viewM3409 = view2;
                        i35 = i35;
                    }
                    break;
                case 181023436:
                case 446564955:
                    C4263.m12813(this, C0630.m2566(C1047.m3603(f21694, 96, 3, i27)) ^ 2102656835);
                    sArr5 = f21694;
                    i31 = 99;
                    iM2566 = (C0630.m2566("ܶۗ") + i22) * (-107);
                    i24 = ((iM2566 ^ i23) * (-17331)) ^ 677879875;
                    i7 = 1398878478;
                    i25 = iM2566 ^ i7;
                    bundle = bundle;
                    sArr8 = sArr8;
                    sArr7 = sArr7;
                    i35 = i35;
                    i34 = i34;
                    i33 = i33;
                    sArr6 = sArr6;
                    i32 = i32;
                    z9 = z15 ? 1 : 0;
                    view5 = view5;
                    i39 = i39;
                    charSequence2 = charSequence2;
                    c17626 = c17626;
                    z12 = z9;
                    i30 = i30;
                    z10 = z12;
                    textView3 = textView3;
                    i36 = i36;
                    z11 = z10;
                    view6 = view6;
                    i28 = i28;
                    z5 = z11;
                    c13133 = c13133;
                    z15 = z5;
                    i38 = i38;
                    break;
                case 217319236:
                case 500568858:
                    m19017();
                    break;
                case 610954603:
                case 854516403:
                    i8 = i35;
                    i38 = i38;
                    view6 = view6;
                    c13133 = c13133;
                    int i57 = i30;
                    boolean z24 = z15 ? 1 : 0;
                    i36 = i36;
                    c17626 = c17626;
                    int iM69811 = C2105.m6981(str) ^ 2129667345;
                    View viewFindViewById = findViewById(iM69811);
                    i28 = iM69811;
                    View view10 = view5;
                    C17648.m41310(viewFindViewById, new C4736(z24 ? 1 : 0, view10));
                    sArr8 = f21694;
                    if (C1773.f6144 <= 0) {
                        textView3 = textView3;
                        charSequence2 = charSequence2;
                        sArr4 = sArr7;
                        i9 = i34;
                        view4 = view10;
                        i30 = i57;
                        int i58 = i39;
                        z6 = z24 ? 1 : 0;
                        iM2567 = i58;
                        int iM69812 = C2105.m6981("ۗ۟") ^ i23;
                        i25 = iM69812 ^ 1536467466;
                        i24 = ((iM69812 ^ i22) * (-629)) ^ 112068334;
                        view5 = view4;
                        sArr7 = sArr4;
                        i35 = i8;
                        i34 = i9;
                        charSequence2 = charSequence2;
                        z10 = z6;
                        c17626 = c17626;
                        i39 = iM2567;
                        i30 = i30;
                        bundle = bundle;
                        textView3 = textView3;
                        i36 = i36;
                        z11 = z10;
                        view6 = view6;
                        i28 = i28;
                        z5 = z11;
                    } else {
                        int iM69813 = C2105.m6981("ۢܿ") ^ i22;
                        i25 = iM69813 ^ (-610406567);
                        z5 = z24 ? 1 : 0;
                        view5 = view10;
                        i24 = ((iM69813 ^ i23) * (-29033)) ^ (-1674144879);
                        i36 = i36;
                        c17626 = c17626;
                        bundle = bundle;
                        i30 = i57;
                        view6 = view6;
                        i28 = i28;
                        i35 = i8;
                    }
                    c13133 = c13133;
                    z15 = z5;
                    i38 = i38;
                    break;
                case 671324944:
                case 1512741549:
                    int i59 = i35;
                    View view11 = view5;
                    i30 = i30;
                    boolean z25 = z15 ? 1 : 0;
                    short[] sArr16 = sArr8;
                    charSequence2 = charSequence2;
                    textView3 = textView3;
                    RunnableC1937.m6377(textView3, charSequence2);
                    view3 = view11;
                    this.f21698 = (C23196.m51456() ? 1 : 0) ^ i30;
                    C20988.m47796(this);
                    sArr7 = f21694;
                    i34 = UMErrorCode.E_UM_BE_CREATE_FAILED;
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        iM2568 = C0630.m2566("᩶۟") ^ i22;
                        i10 = ((iM2568 ^ i23) * (-25877)) ^ 1825323516;
                        i11 = 1936250471;
                    } else {
                        iM2568 = (C0630.m2566("᩵ۗ") ^ i22) * 89;
                        i10 = ((iM2568 ^ i23) * 20143) ^ 61091041;
                        i11 = -237205513;
                    }
                    i25 = iM2568 ^ i11;
                    z4 = z25 ? 1 : 0;
                    i24 = i10;
                    sArr8 = sArr16;
                    i35 = i59;
                    view5 = view3;
                    z9 = z4;
                    charSequence2 = charSequence2;
                    c17626 = c17626;
                    z12 = z9;
                    i30 = i30;
                    z10 = z12;
                    textView3 = textView3;
                    i36 = i36;
                    z11 = z10;
                    view6 = view6;
                    i28 = i28;
                    z5 = z11;
                    c13133 = c13133;
                    z15 = z5;
                    i38 = i38;
                    break;
                case 963886392:
                case 2064781469:
                    i35 = i35;
                    i38 = i38;
                    i39 = i39;
                    c13133 = c13133;
                    boolean z26 = z15 ? 1 : 0;
                    sArr6 = sArr6;
                    i32 = i32;
                    i33 = i33;
                    sArr7 = sArr7;
                    i34 = i34;
                    i28 = i28;
                    view6 = view6;
                    i36 = i36;
                    textView3 = textView3;
                    i30 = i30;
                    c17626 = c17626;
                    charSequence2 = charSequence2;
                    view5 = view5;
                    sArr8 = sArr8;
                    sArr3 = sArr5;
                    i31 = i31;
                    viewM12814 = C4263.m12813(this, C2105.m6981(C4159.m12578(sArr3, i31, 3, i27)) ^ 2129996947);
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: l.֡ܶ᩷
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view12) {
                            int i60 = -1915491923;
                            int i61 = C1420.f5096;
                            int i62 = C0483.f2088;
                            int iM25619 = (C0630.m2566("᩵۫") ^ i62) * 29;
                            int i63 = ((iM25619 ^ i61) * (-14383)) ^ 305965544;
                            int i64 = 1889497455;
                            while (true) {
                                i60 = ((((i60 ^ i61) * 2683) >> 31) & i63) ^ (iM25619 ^ i64);
                                switch (i60) {
                                    case -2081046643:
                                    case 1856242778:
                                        if (C0483.f2088 >= 0) {
                                            iM25619 = (C2105.m6981("۟ۡ") + i61) * 95;
                                            i63 = ((iM25619 ^ i62) * (-7447)) ^ (-340516983);
                                            i64 = 783210458;
                                        } else {
                                            iM25619 = (C2105.m6981("ۙܳ") + i62) * 43;
                                            i63 = ((iM25619 ^ i61) * 9433) ^ (-695771074);
                                            i64 = -1494666910;
                                        }
                                        break;
                                    case -1963932656:
                                    case -570589539:
                                        if (ViewOnClickListenerC1958.f6529 <= 0) {
                                            iM25619 = C0630.m2566("ۛۧ") ^ i62;
                                            i63 = ((iM25619 ^ i61) * 32117) ^ 116681269;
                                            i64 = -867719764;
                                        } else {
                                            iM25619 = C2105.m6981("۬֫") ^ i61;
                                            i63 = ((iM25619 ^ i62) * (-3235)) ^ 759577777;
                                            i64 = -717521859;
                                        }
                                        break;
                                    case -1762559082:
                                    case -1674943185:
                                        if (C2958.f9394 >= 0) {
                                            iM25619 = (C2105.m6981("۟ۡ") + i61) * 95;
                                            i63 = ((iM25619 ^ i62) * (-7447)) ^ (-340516983);
                                            i64 = 783210458;
                                        } else {
                                            iM25619 = (i62 - C0630.m2566("᩺᩵")) * (-51);
                                            i63 = ((iM25619 ^ i61) * 18981) ^ 1863343278;
                                            i64 = -354621153;
                                        }
                                        break;
                                    case -1309198109:
                                    case 909322766:
                                        if (RunnableC3474.f10992 <= 0) {
                                            iM25619 = (C2105.m6981("۟ۡ") + i61) * 95;
                                            i63 = ((iM25619 ^ i62) * (-7447)) ^ (-340516983);
                                            i64 = 783210458;
                                        } else {
                                            iM25619 = (i61 - C2105.m6981("ᩴ᩹")) * (-47);
                                            i63 = ((iM25619 ^ i62) * (-167)) ^ 587582585;
                                            i64 = -913846548;
                                        }
                                        break;
                                    case -1304208266:
                                    case 1205523667:
                                        if (ServiceConnectionC3453.f10921 >= 0) {
                                            iM25619 = (C0630.m2566("ܿ᩶") + i61) * (-83);
                                            i63 = ((iM25619 ^ i62) * (-9749)) ^ 1836831024;
                                            i64 = 1191392727;
                                        } else {
                                            iM25619 = C2105.m6981("ۗܿ") ^ i62;
                                            i63 = ((iM25619 ^ i61) * 24349) ^ 2137607939;
                                            i64 = 363213432;
                                        }
                                        break;
                                    case -1282601663:
                                    case 325331139:
                                        if (!C2126.f7087) {
                                            iM25619 = (i62 - C0630.m2566("֫᩵")) * (-123);
                                            i63 = ((iM25619 ^ i61) * 2991) ^ (-2086098707);
                                            i64 = 233458444;
                                        } else {
                                            iM25619 = (C2105.m6981("۟ۡ") + i61) * 95;
                                            i63 = ((iM25619 ^ i62) * (-7447)) ^ (-340516983);
                                            i64 = 783210458;
                                        }
                                        break;
                                    case -978380965:
                                    case -947092047:
                                        RunnableC1108.m3790();
                                        C2520.m8026();
                                        iM25619 = (C2105.m6981("۟ۡ") + i61) * 95;
                                        i63 = ((iM25619 ^ i62) * (-7447)) ^ (-340516983);
                                        i64 = 783210458;
                                        break;
                                    case -897204429:
                                    case -397973389:
                                        if (C0422.f1886 <= 0) {
                                            iM25619 = C0630.m2566("ۛۧ") ^ i62;
                                            i63 = ((iM25619 ^ i61) * 32117) ^ 116681269;
                                            i64 = -867719764;
                                        } else {
                                            iM25619 = C0630.m2566("᩷۠") ^ i61;
                                            i63 = ((iM25619 ^ i62) * 27243) ^ 679731485;
                                            i64 = -1069785264;
                                        }
                                        break;
                                    case -755010444:
                                    case 32141166:
                                        if (C0714.f2697 >= 0) {
                                            iM25619 = (C0630.m2566("ܿ᩶") + i61) * (-83);
                                            i63 = ((iM25619 ^ i62) * (-9749)) ^ 1836831024;
                                            i64 = 1191392727;
                                        } else {
                                            iM25619 = (i61 - C0630.m2566("ۧ۠")) * (-115);
                                            i63 = ((iM25619 ^ i62) * (-8999)) ^ 595089562;
                                            i64 = -1750998787;
                                        }
                                        break;
                                    case -715637500:
                                    case 467890434:
                                        int i65 = ViewOnClickListenerC7042.f21692;
                                        if (C3019.f9544 >= 0) {
                                            iM25619 = (C0630.m2566("ᩳᩴ") ^ i61) * 81;
                                            i63 = ((iM25619 ^ i62) * 29969) ^ (-1657464808);
                                            i64 = -2041461578;
                                        } else {
                                            iM25619 = (C0630.m2566("֨֡") ^ i62) * (-7);
                                            i63 = ((iM25619 ^ i61) * 11033) ^ 914426669;
                                            i64 = 118586461;
                                        }
                                        break;
                                    case -609960212:
                                    case 1139430232:
                                        if (!AbstractC2021.m6574()) {
                                            iM25619 = C0630.m2566("ۛۧ") ^ i62;
                                            i63 = ((iM25619 ^ i61) * 32117) ^ 116681269;
                                            i64 = -867719764;
                                        } else {
                                            iM25619 = (C2105.m6981("۟ۡ") + i61) * 95;
                                            i63 = ((iM25619 ^ i62) * (-7447)) ^ (-340516983);
                                            i64 = 783210458;
                                        }
                                        break;
                                    case -518670473:
                                    case 444281044:
                                        C2272.m7505(this.f2130);
                                        break;
                                    case -191252941:
                                    case 1843528909:
                                        if (!C1005.f3721) {
                                            iM25619 = (i62 - C0630.m2566("֫᩵")) * (-123);
                                            i63 = ((iM25619 ^ i61) * 2991) ^ (-2086098707);
                                            i64 = 233458444;
                                        } else {
                                            iM25619 = (C0630.m2566("ܿ᩶") + i61) * (-83);
                                            i63 = ((iM25619 ^ i62) * (-9749)) ^ 1836831024;
                                            i64 = 1191392727;
                                        }
                                        break;
                                    case 104317712:
                                    case 1227941480:
                                        C0798.m2998();
                                        break;
                                    case 1715621687:
                                    case 1792841653:
                                        if (C7811.m20844() != 0) {
                                            iM25619 = (C0630.m2566("ܿ᩶") + i61) * (-83);
                                            i63 = ((iM25619 ^ i62) * (-9749)) ^ 1836831024;
                                            i64 = 1191392727;
                                        } else {
                                            iM25619 = (C2105.m6981("ܿۛ") ^ i61) * 31;
                                            i63 = ((iM25619 ^ i62) * (-11307)) ^ 1947832193;
                                            i64 = 1336878441;
                                        }
                                        break;
                                    default:
                                        if (RunnableC1937.f6483 >= 0) {
                                            iM25619 = C0630.m2566("ۛۧ") ^ i62;
                                            i63 = ((iM25619 ^ i61) * 32117) ^ 116681269;
                                            i64 = -867719764;
                                        } else {
                                            iM25619 = C0630.m2566("᩶֡") ^ i62;
                                            i63 = ((iM25619 ^ i61) * (-745)) ^ (-1947346882);
                                            i64 = 232725404;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    if (ServiceConnectionC3453.f10921 < 0) {
                        int iM25619 = (C0630.m2566("ۚ᩵") ^ i23) * (-23);
                        onClickListener = onClickListener2;
                        i31 = i31;
                        sArr8 = sArr8;
                        sArr7 = sArr7;
                        i35 = i35;
                        i34 = i34;
                        i33 = i33;
                        sArr6 = sArr6;
                        i32 = i32;
                        sArr5 = sArr3;
                        i25 = iM25619 ^ (-922055293);
                        z3 = z26 ? 1 : 0;
                        view5 = view5;
                        i39 = i39;
                        i24 = ((iM25619 ^ i22) * (-24651)) ^ (-1720527460);
                        charSequence2 = charSequence2;
                        c17626 = c17626;
                        bundle = bundle;
                        z12 = z3;
                        i30 = i30;
                        z10 = z12;
                        textView3 = textView3;
                        i36 = i36;
                        z11 = z10;
                        view6 = view6;
                        i28 = i28;
                        z5 = z11;
                        c13133 = c13133;
                        z15 = z5;
                        i38 = i38;
                    } else {
                        onClickListener = onClickListener2;
                        z7 = z26;
                        iM6981 = C0630.m2566("ۤ᩻") ^ i23;
                        sArr5 = sArr3;
                        i24 = ((iM6981 ^ i22) * (-31285)) ^ (-1156560322);
                        i6 = 1241054894;
                        z8 = z7;
                        i31 = i31;
                        sArr8 = sArr8;
                        sArr7 = sArr7;
                        i35 = i35;
                        i34 = i34;
                        i33 = i33;
                        sArr6 = sArr6;
                        i32 = i32;
                        sArr5 = sArr5;
                        i25 = iM6981 ^ i6;
                        z9 = z8;
                        view5 = view5;
                        i39 = i39;
                        bundle = bundle;
                        charSequence2 = charSequence2;
                        c17626 = c17626;
                        z12 = z9;
                        i30 = i30;
                        z10 = z12;
                        textView3 = textView3;
                        i36 = i36;
                        z11 = z10;
                        view6 = view6;
                        i28 = i28;
                        z5 = z11;
                        c13133 = c13133;
                        z15 = z5;
                        i38 = i38;
                    }
                    break;
                case 1415800160:
                case 1590023441:
                    i35 = i35;
                    i38 = i38;
                    View view12 = view6;
                    c13133 = c13133;
                    i12 = i30;
                    i3 = i36;
                    final RunnableC3737 runnableC3737 = new RunnableC3737(c13133, view12, viewM12813, i12);
                    int i60 = i28;
                    i28 = i60;
                    view6 = view12;
                    C0964.m3409(this, i60).getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.ۗܶ᩷
                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                        public final void onGlobalLayout() {
                            runnableC3737.run();
                        }
                    });
                    c13133.addOnScrollListener(new C6147(runnableC3737));
                    c17626 = (C17625) new C4741(this).m13885(C17625.class);
                    this.f21695 = c17626;
                    if (bundle != null) {
                        iM6982 = (C2105.m6981("᩹ۧ") + i22) * 127;
                        i13 = ((iM6982 ^ i23) * (-14387)) ^ (-1031059951);
                        i14 = 1474763787;
                    } else {
                        iM6982 = C2105.m6981("ۘܰ") ^ i23;
                        i13 = ((iM6982 ^ i22) * (-23109)) ^ 1036365965;
                        i14 = -458914508;
                    }
                    i25 = iM6982 ^ i14;
                    i30 = i12;
                    i24 = i13;
                    i36 = i3;
                    i35 = i35;
                    z11 = z15;
                    view6 = view6;
                    i28 = i28;
                    z5 = z11;
                    c13133 = c13133;
                    z15 = z5;
                    i38 = i38;
                    break;
                default:
                    C4159.m12564(viewM12814, onClickListener);
                    viewM3409 = C0964.m3409(this, C0630.m2566(C3537.m10748(f21694, IShizukuService.Stub.TRANSACTION_attachUserService, 3, i27)) ^ 2099834944);
                    iM2566 = C2105.m6981("᩺᩺") ^ i23;
                    i24 = ((iM2566 ^ i22) * 8177) ^ 2144216222;
                    i7 = -1175993298;
                    i25 = iM2566 ^ i7;
                    bundle = bundle;
                    sArr8 = sArr8;
                    sArr7 = sArr7;
                    i35 = i35;
                    i34 = i34;
                    i33 = i33;
                    sArr6 = sArr6;
                    i32 = i32;
                    z9 = z15 ? 1 : 0;
                    view5 = view5;
                    i39 = i39;
                    charSequence2 = charSequence2;
                    c17626 = c17626;
                    z12 = z9;
                    i30 = i30;
                    z10 = z12;
                    textView3 = textView3;
                    i36 = i36;
                    z11 = z10;
                    view6 = view6;
                    i28 = i28;
                    z5 = z11;
                    c13133 = c13133;
                    z15 = z5;
                    i38 = i38;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0144 A[PHI: r3 r4 r5 r6
      0x0144: PHI (r3v4 int) = (r3v3 int), (r3v2 int), (r3v2 int), (r3v2 int) binds: [B:35:0x0142, B:27:0x00f4, B:19:0x00b1, B:12:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0144: PHI (r4v4 l.۬ܶ᩷) = (r4v2 l.۬ܶ᩷), (r4v3 l.۬ܶ᩷), (r4v2 l.۬ܶ᩷), (r4v2 l.۬ܶ᩷) binds: [B:35:0x0142, B:27:0x00f4, B:19:0x00b1, B:12:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0144: PHI (r5v4 l.᩻۟ܳ) = (r5v2 l.᩻۟ܳ), (r5v3 l.᩻۟ܳ), (r5v2 l.᩻۟ܳ), (r5v2 l.᩻۟ܳ) binds: [B:35:0x0142, B:27:0x00f4, B:19:0x00b1, B:12:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0144: PHI (r6v5 int) = (r6v2 int), (r6v2 int), (r6v4 int), (r6v2 int) binds: [B:35:0x0142, B:27:0x00f4, B:19:0x00b1, B:12:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x01b3 A[PHI: r7 r8 r15 r24
      0x01b3: PHI (r7v5 int) = (r7v4 int), (r7v2 int), (r7v2 int) binds: [B:40:0x0183, B:43:0x01b1, B:9:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x01b3: PHI (r8v8 int) = (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:40:0x0183, B:43:0x01b1, B:9:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x01b3: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:40:0x0183, B:43:0x01b1, B:9:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x01b3: PHI (r24v28 int) = (r24v4 int), (r24v23 int), (r24v3 int) binds: [B:40:0x0183, B:43:0x01b1, B:9:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0087, code lost:
    
        if (l.RunnableC0588.f2309 < 0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0060, code lost:
    
        if (l.ServiceConnectionC3453.f10921 < 0) goto L7;
     */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m19016(ViewOnClickListenerC7042 viewOnClickListenerC7042) {
        int iM2566;
        int i;
        int i2;
        int iM6981;
        int i3;
        int i4 = C3911.f12484;
        int i5 = AbstractC2021.f6743;
        int iM6982 = (C2105.m6981("ᩳ᩶") ^ i5) * (-113);
        int i6 = ((iM6982 ^ i4) * 15401) ^ 1409695663;
        ViewOnLongClickListenerC23553 viewOnLongClickListenerC23553 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i7 = iM6982 ^ (-1059467564);
        C2103 c2103 = null;
        int iM2567 = 0;
        int iM6983 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i12 = -800763191;
        int i13 = 0;
        ViewOnClickListenerC13202 viewOnClickListenerC13202 = null;
        short[] sArr3 = null;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i12 = i7 ^ (i6 & (((i12 ^ i4) * 23225) >> 31));
            switch (i12) {
                case -2024714741:
                case 559689256:
                    break;
                case -1942619413:
                case 756855303:
                    i10 = 36202;
                    iM2566 = C2105.m6981("᩸ۘ") ^ i5;
                    i = ((iM2566 ^ i4) * (-25179)) ^ 1628286499;
                    i2 = -260139168;
                    int i16 = iM2566 ^ i2;
                    i13 = i13;
                    i7 = i16;
                    i6 = i;
                    break;
                case -1878498622:
                case -509943275:
                    c2103.m31247(iM2567, viewOnClickListenerC13202, viewOnLongClickListenerC23553);
                    c2103.m31266(false);
                    i13 = i13;
                    iM2566 = (i4 - C2105.m6981("ᩴᩴ")) * (-33);
                    i = ((iM2566 ^ i5) * 26833) ^ (-1844890389);
                    i2 = -1166771264;
                    int i17 = iM2566 ^ i2;
                    i13 = i13;
                    i7 = i17;
                    i6 = i;
                    break;
                case -1777498385:
                case -1011971213:
                    RunnableC1108.m3790();
                    C0422.m1963();
                    break;
                case -1637831164:
                case 990812129:
                    i11 = 18;
                    i13 = 3;
                    if (RunnableC0588.m2441() >= 0) {
                        iM6981 = C2105.m6981("ۚ᩷") ^ i5;
                        i = ((iM6981 ^ i4) * 27817) ^ (-1480668473);
                        i3 = 14931692;
                    } else {
                        iM6981 = (C2105.m6981("ۜܰ") + i4) * (-13);
                        i = ((iM6981 ^ i5) * (-1055)) ^ (-1938877938);
                        i3 = -1624913195;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i;
                    break;
                case -1595252352:
                case 2011640530:
                    sArr2 = f21694;
                    i8 = 21;
                    i9 = 3;
                    if (C2105.f7037 == 0) {
                        iM6981 = C0630.m2566("۬᩻") ^ i4;
                        i = ((iM6981 ^ i5) * (-12553)) ^ 1457591028;
                        i3 = 453502767;
                        i7 = iM6981 ^ i3;
                        i6 = i;
                    }
                    i13 = i13;
                    iM2566 = (C2105.m6981("ۗܳ") ^ i4) * 75;
                    i = ((iM2566 ^ i5) * 629) ^ (-1087705042);
                    i2 = -2024604620;
                    int i18 = iM2566 ^ i2;
                    i13 = i13;
                    i7 = i18;
                    i6 = i;
                    break;
                case -1495850109:
                case 249633582:
                    i13 = i13;
                    if (viewOnClickListenerC7042.f21699.m22791()) {
                        iM2566 = C0630.m2566("ܿ᩹") ^ i5;
                        i = ((iM2566 ^ i4) * 27189) ^ (-1823484067);
                        i2 = 114594537;
                    } else {
                        iM2566 = (i4 - C2105.m6981("ᩴᩴ")) * (-33);
                        i = ((iM2566 ^ i5) * 26833) ^ (-1844890389);
                        i2 = -1166771264;
                    }
                    int i19 = iM2566 ^ i2;
                    i13 = i13;
                    i7 = i19;
                    i6 = i;
                    break;
                case -1479504808:
                case -649187842:
                    int i20 = i13;
                    iM6983 = C2105.m6981(C3432.m10488(sArr, i11, i20, i10));
                    if (C4159.m12565() >= 0) {
                        i13 = i20;
                        i15 = 2124104245;
                        iM6981 = C2105.m6981("ۚ᩷") ^ i5;
                        i = ((iM6981 ^ i4) * 27817) ^ (-1480668473);
                        i3 = 14931692;
                        i7 = iM6981 ^ i3;
                        i6 = i;
                    } else {
                        int iM6984 = C2105.m6981("۬ۚ") ^ i5;
                        i13 = i20;
                        i6 = ((iM6984 ^ i4) * (-14471)) ^ 1403741883;
                        i7 = iM6984 ^ (-1791299934);
                        i15 = 2124104245;
                    }
                    break;
                case -1013924785:
                case 1737935820:
                    c2103.m31258(iM6983 ^ i15);
                    c2103.m31254();
                    i14 = 6;
                    if (C3245.m9925() != 0) {
                        iM6981 = (C2105.m6981("ܺܳ") ^ i5) * (-77);
                        i = ((iM6981 ^ i4) * (-12485)) ^ (-1945860686);
                        i3 = 892128599;
                    } else {
                        iM6981 = (C0630.m2566("ۜᩳ") + i5) * (-109);
                        i = ((iM6981 ^ i4) * 32485) ^ (-1994964248);
                        i3 = -459625322;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i;
                    break;
                case -872408071:
                case 1999932037:
                    C2105.m6982();
                    break;
                case -741389298:
                case 2044530951:
                    i10 = 21306;
                    iM2566 = C2105.m6981("᩸ۘ") ^ i5;
                    i = ((iM2566 ^ i4) * (-25179)) ^ 1628286499;
                    i2 = -260139168;
                    int i110 = iM2566 ^ i2;
                    i13 = i13;
                    i7 = i110;
                    i6 = i;
                    break;
                case -611168935:
                case 1465701842:
                    C0050.m940();
                    C5695.m16023();
                    i13 = i13;
                    iM2566 = C0630.m2566("۬᩵") ^ i5;
                    i = ((iM2566 ^ i4) * 9043) ^ 2068215057;
                    i2 = -1794836999;
                    int i111 = iM2566 ^ i2;
                    i13 = i13;
                    i7 = i111;
                    i6 = i;
                    break;
                case -243261123:
                case 1007335035:
                    i13 = i13;
                    int i21 = s + s2;
                    if ((38336 * s) - (i21 * i21) > 0) {
                        iM2566 = C0630.m2566("᩷᩵") ^ i4;
                        i = ((iM2566 ^ i5) * (-9511)) ^ (-268430108);
                        i2 = 1792381472;
                    } else {
                        iM2566 = C0630.m2566("ۙ᩹") ^ i5;
                        i = ((iM2566 ^ i4) * 32525) ^ (-468839337);
                        i2 = 796356676;
                    }
                    int i112 = iM2566 ^ i2;
                    i13 = i13;
                    i7 = i112;
                    i6 = i;
                    break;
                case -183118751:
                case 1744434131:
                    i13 = i13;
                    s = sArr3[c];
                    s2 = 9584;
                    if (RunnableC1108.f4040) {
                        iM2566 = C0630.m2566("ۧ᩶") ^ i5;
                        i = ((iM2566 ^ i4) * 32285) ^ (-551737229);
                        i2 = 1788922263;
                    } else {
                        iM2566 = C0630.m2566("۬᩵") ^ i5;
                        i = ((iM2566 ^ i4) * 9043) ^ 2068215057;
                        i2 = -1794836999;
                    }
                    int i113 = iM2566 ^ i2;
                    i13 = i13;
                    i7 = i113;
                    i6 = i;
                    break;
                case -60705544:
                case 1325832215:
                    c2103.m31279(i14);
                    c2103.m31244();
                    if (C5695.m16023() < 0) {
                        iM6981 = (i4 - C0630.m2566("ܺܺ")) * 49;
                        i = ((iM6981 ^ i5) * (-31837)) ^ (-1128314375);
                        i3 = 1221724733;
                        i7 = iM6981 ^ i3;
                        i6 = i;
                    }
                    i13 = i13;
                    iM2566 = (C2105.m6981("ۗܳ") ^ i4) * 75;
                    i = ((iM2566 ^ i5) * 629) ^ (-1087705042);
                    i2 = -2024604620;
                    int i114 = iM2566 ^ i2;
                    i13 = i13;
                    i7 = i114;
                    i6 = i;
                    break;
                case -35377099:
                case 1752415070:
                    iM2567 = 2097988199 ^ C0630.m2566(C0483.m2128(sArr2, i8, i9, i10));
                    if (C1420.f5096 <= 0) {
                        iM6981 = (C2105.m6981("ܺܳ") ^ i5) * (-77);
                        i = ((iM6981 ^ i4) * (-12485)) ^ (-1945860686);
                        i3 = 892128599;
                    } else {
                        iM6981 = C0630.m2566("֨ܶ") ^ i4;
                        i = ((iM6981 ^ i5) * 19513) ^ (-2079224689);
                        i3 = 1995174489;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i;
                    break;
                case 358222233:
                case 597284663:
                    if (C2167.m7155()) {
                        iM6981 = C0630.m2566("᩶֡") ^ i4;
                        i = ((iM6981 ^ i5) * 17257) ^ 1766943545;
                        i3 = 719324167;
                    } else {
                        iM6981 = C2105.m6981("ۚ᩷") ^ i5;
                        i = ((iM6981 ^ i4) * 27817) ^ (-1480668473);
                        i3 = 14931692;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i;
                    break;
                case 409812945:
                case 1350493808:
                    int i22 = i13;
                    c2103 = new C2103(viewOnClickListenerC7042, viewOnClickListenerC7042);
                    sArr = f21694;
                    if (C4616.f14690 <= 0) {
                        i13 = i22;
                        iM2566 = C0630.m2566("۬᩵") ^ i5;
                        i = ((iM2566 ^ i4) * 9043) ^ 2068215057;
                        i2 = -1794836999;
                        int i115 = iM2566 ^ i2;
                        i13 = i13;
                        i7 = i115;
                        i6 = i;
                    } else {
                        int iM6985 = C2105.m6981("ܽᩳ") ^ i4;
                        i6 = ((iM6985 ^ i5) * 15067) ^ (-822571483);
                        i13 = i22;
                        i7 = iM6985 ^ (-571651294);
                    }
                    break;
                case 452776742:
                case 2143855348:
                    i13 = i13;
                    sArr3 = f21694;
                    c = 17;
                    if (C2958.m9034() <= 0) {
                        iM2566 = (C2105.m6981("ۗܳ") ^ i4) * 75;
                        i = ((iM2566 ^ i5) * 629) ^ (-1087705042);
                        i2 = -2024604620;
                    } else {
                        iM2566 = (C0630.m2566("ۤܺ") + i4) * 101;
                        i = ((iM2566 ^ i5) * 11535) ^ 934619582;
                        i2 = 1879889252;
                    }
                    int i116 = iM2566 ^ i2;
                    i13 = i13;
                    i7 = i116;
                    i6 = i;
                    break;
                case 1247771795:
                case 2040270072:
                    viewOnClickListenerC13202 = new ViewOnClickListenerC13202(viewOnClickListenerC7042, 0);
                    viewOnLongClickListenerC23553 = null;
                    if (C7811.f24123 >= 0) {
                        iM6981 = (C2105.m6981("ܺܳ") ^ i5) * (-77);
                        i = ((iM6981 ^ i4) * (-12485)) ^ (-1945860686);
                        i3 = 892128599;
                    } else {
                        iM6981 = C2105.m6981("۠ۢ") ^ i5;
                        i = ((iM6981 ^ i4) * (-21813)) ^ (-875702514);
                        i3 = -163565055;
                    }
                    i7 = iM6981 ^ i3;
                    i6 = i;
                    break;
                default:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:33:0x0104 A[PHI: r8
      0x0104: PHI (r8v6 java.lang.String) = (r8v4 java.lang.String), (r8v2 java.lang.String), (r8v2 java.lang.String) binds: [B:32:0x0102, B:15:0x0095, B:124:0x0104] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0165 A[PHI: r11
      0x0165: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:40:0x0163, B:18:0x009a, B:12:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x01d8 A[PHI: r6 r7 r9
      0x01d8: PHI (r6v4 int) = (r6v3 int), (r6v2 int), (r6v2 int), (r6v2 int) binds: [B:48:0x01be, B:28:0x00cd, B:6:0x0064, B:125:0x01d8] A[DONT_GENERATE, DONT_INLINE]
      0x01d8: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:48:0x01be, B:28:0x00cd, B:6:0x0064, B:125:0x01d8] A[DONT_GENERATE, DONT_INLINE]
      0x01d8: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:48:0x01be, B:28:0x00cd, B:6:0x0064, B:125:0x01d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x01fa A[PHI: r4 r5
      0x01fa: PHI (r4v4 float) = (r4v3 float), (r4v2 float) binds: [B:52:0x01f8, B:12:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x01fa: PHI (r5v4 float) = (r5v3 float), (r5v2 float) binds: [B:52:0x01f8, B:12:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x036c A[PHI: r17 r24
      0x036c: PHI (r17v6 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:88:0x036a, B:67:0x0299, B:107:0x036c] A[DONT_GENERATE, DONT_INLINE]
      0x036c: PHI (r24v7 java.lang.String) = (r24v3 java.lang.String), (r24v4 java.lang.String), (r24v3 java.lang.String) binds: [B:88:0x036a, B:67:0x0299, B:107:0x036c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x039c A[PHI: r3 r13 r14 r15 r16 r18 r19
      0x039c: PHI (r3v4 int[]) = (r3v2 int[]), (r3v2 int[]), (r3v3 int[]), (r3v2 int[]), (r3v2 int[]) binds: [B:92:0x039a, B:84:0x034b, B:111:0x039c, B:110:0x039c, B:109:0x039c] A[DONT_GENERATE, DONT_INLINE]
      0x039c: PHI (r13v4 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v2 short[]), (r13v3 short[]), (r13v2 short[]) binds: [B:92:0x039a, B:84:0x034b, B:111:0x039c, B:110:0x039c, B:109:0x039c] A[DONT_GENERATE, DONT_INLINE]
      0x039c: PHI (r14v4 int) = (r14v2 int), (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:92:0x039a, B:84:0x034b, B:111:0x039c, B:110:0x039c, B:109:0x039c] A[DONT_GENERATE, DONT_INLINE]
      0x039c: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:92:0x039a, B:84:0x034b, B:111:0x039c, B:110:0x039c, B:109:0x039c] A[DONT_GENERATE, DONT_INLINE]
      0x039c: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:92:0x039a, B:84:0x034b, B:111:0x039c, B:110:0x039c, B:109:0x039c] A[DONT_GENERATE, DONT_INLINE]
      0x039c: PHI (r18v4 short) = (r18v2 short), (r18v3 short), (r18v2 short), (r18v2 short), (r18v2 short) binds: [B:92:0x039a, B:84:0x034b, B:111:0x039c, B:110:0x039c, B:109:0x039c] A[DONT_GENERATE, DONT_INLINE]
      0x039c: PHI (r19v4 short) = (r19v2 short), (r19v3 short), (r19v2 short), (r19v2 short), (r19v2 short) binds: [B:92:0x039a, B:84:0x034b, B:111:0x039c, B:110:0x039c, B:109:0x039c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int iM2566;
        int i;
        int i2;
        int iM6981;
        int i3;
        ViewOnClickListenerC7042 viewOnClickListenerC7042 = this;
        int i4 = C3432.f10845;
        int i5 = C4263.f13799;
        int iM2567 = C0630.m2566("᩺֫") ^ i4;
        int i6 = ((iM2567 ^ i5) * (-6547)) ^ 1927097568;
        int[] iArr = null;
        String strM3502 = null;
        String strM4902 = null;
        short[] sArr = null;
        int i7 = iM2567 ^ (-1926865026);
        View viewFindViewById = null;
        float rawX = 0.0f;
        float rawY = 0.0f;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i14 = -899712291;
        short[] sArr2 = null;
        int iM6982 = 0;
        while (true) {
            i14 = i7 ^ (i6 & (((i14 ^ i5) * (-25643)) >> 31));
            switch (i14) {
                case -2111334112:
                case -1319180299:
                    i10 = iArr[1];
                    if (rawY >= i10) {
                        iM2566 = (i5 - C0630.m2566("ۜ۫")) * 89;
                        i = ((iM2566 ^ i4) * 22661) ^ 1071719549;
                        i2 = -1765509416;
                    } else {
                        iM2566 = C0630.m2566("ܽۗ") ^ i5;
                        i = ((iM2566 ^ i4) * 14097) ^ (-1645142973);
                        i2 = -830235908;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -2107922349:
                case 408786940:
                    i11 = 45259;
                    iM6981 = C2105.m6981("۬ۧ") ^ i4;
                    i6 = ((iM6981 ^ i5) * 1485) ^ 953427881;
                    i3 = 1377897127;
                    i7 = iM6981 ^ i3;
                    viewOnClickListenerC7042 = this;
                    break;
                case -2003881424:
                case 223577118:
                    i11 = 51253;
                    iM6981 = C2105.m6981("۬ۧ") ^ i4;
                    i6 = ((iM6981 ^ i5) * 1485) ^ 953427881;
                    i3 = 1377897127;
                    i7 = iM6981 ^ i3;
                    viewOnClickListenerC7042 = this;
                    break;
                case -1981055760:
                case -562482095:
                    rawX = motionEvent.getRawX();
                    rawY = motionEvent.getRawY();
                    if (C0422.f1886 <= 0) {
                        iM2566 = (i4 - C2105.m6981("᩻ۗ")) * (-93);
                        i = ((iM2566 ^ i5) * 28125) ^ 1298506563;
                        i2 = 463236688;
                    } else {
                        iM2566 = C0630.m2566("᩹ᩴ") ^ i4;
                        i = ((iM2566 ^ i5) * (-20319)) ^ 1269870184;
                        i2 = -1102518487;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1970734004:
                case 1197481018:
                    if (!viewFindViewById.hasFocus()) {
                        iM6981 = (i4 - C0630.m2566("ܺ֫")) * (-23);
                        i6 = ((iM6981 ^ i5) * (-24891)) ^ (-1352733898);
                        i3 = -1567998999;
                        i7 = iM6981 ^ i3;
                        viewOnClickListenerC7042 = this;
                    } else {
                        iM2566 = C0630.m2566("ܺۤ") ^ i4;
                        i = ((iM2566 ^ i5) * 19619) ^ 1987207004;
                        i2 = 705427671;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    }
                    break;
                case -1915248503:
                case 190837530:
                    i8 = 0;
                    i9 = iArr[0];
                    if (rawX >= i9) {
                        iM2566 = (C2105.m6981("᩻᩵") ^ i4) * (-121);
                        i = ((iM2566 ^ i5) * 19041) ^ 343779549;
                        i2 = 245733681;
                    } else {
                        iM2566 = C0630.m2566("ܽۗ") ^ i5;
                        i = ((iM2566 ^ i4) * 14097) ^ (-1645142973);
                        i2 = -830235908;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1789278487:
                case 1766518333:
                    strM4902 = C1420.m4902(f21694, 77, 3, i11);
                    if (C22628.f73083 <= 0) {
                        iM6981 = (C0630.m2566("ۧ۠") + i5) * (-113);
                        i6 = ((iM6981 ^ i4) * 19481) ^ 489215026;
                        i3 = 1524045213;
                    } else {
                        iM6981 = C0630.m2566("ۖ֨") ^ i5;
                        i6 = ((iM6981 ^ i4) * 31863) ^ (-218398837);
                        i3 = 1332410579;
                    }
                    i7 = iM6981 ^ i3;
                    viewOnClickListenerC7042 = this;
                    break;
                case -1700096849:
                case 1734669972:
                    strM3502 = C1005.m3502(f21694, 83, 12, i11);
                    if (C7106.f21815 != 0) {
                        iM2566 = C0630.m2566("ۧܺ") ^ i4;
                        i = ((iM2566 ^ i5) * 26519) ^ 1220824042;
                        i2 = -532307029;
                    } else {
                        iM2566 = C2105.m6981("ۤ᩻") ^ i5;
                        i = ((iM2566 ^ i4) * (-3165)) ^ 1054791366;
                        i2 = 1998230179;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1647726001:
                case 1431381424:
                    if (C3663.f11553) {
                        iM2566 = C0630.m2566("ۛ֨") ^ i4;
                        i = ((iM2566 ^ i5) * (-4541)) ^ (-769512215);
                        i2 = -1231766606;
                    } else {
                        iM2566 = C2105.m6981("ܽۘ") ^ i5;
                        i = ((iM2566 ^ i4) * 27301) ^ (-514041526);
                        i2 = -631871848;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1625340651:
                case 872501943:
                    iArr = new int[2];
                    viewFindViewById.getLocationOnScreen(iArr);
                    if (C2958.f9394 < 0) {
                        iM2566 = (i5 - C2105.m6981("֡ۧ")) * (-19);
                        i = ((iM2566 ^ i4) * (-30411)) ^ (-1096893061);
                        i2 = -1018209077;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    } else {
                        iM6981 = (C0630.m2566("ܽܶ") + i4) * (-31);
                        i6 = ((iM6981 ^ i5) * (-1507)) ^ 1729467708;
                        i3 = -1335083566;
                        i7 = iM6981 ^ i3;
                        viewOnClickListenerC7042 = this;
                    }
                    break;
                case -1577003149:
                case -337268022:
                    ServiceConnectionC3453.m10564();
                    if (C0050.f910 < 0) {
                        iM6981 = (C0630.m2566("ۧ۠") + i5) * (-113);
                        i6 = ((iM6981 ^ i4) * 19481) ^ 489215026;
                        i3 = 1524045213;
                        i7 = iM6981 ^ i3;
                        viewOnClickListenerC7042 = this;
                    } else {
                        iM2566 = C0630.m2566("ۧܺ") ^ i4;
                        i = ((iM2566 ^ i5) * 26519) ^ 1220824042;
                        i2 = -532307029;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    }
                    break;
                case -1518760727:
                case -551952023:
                    if (rawY < C1005.m3498(viewFindViewById) + i10) {
                        iM6981 = (i4 - C0630.m2566("ܺ֫")) * (-23);
                        i6 = ((iM6981 ^ i5) * (-24891)) ^ (-1352733898);
                        i3 = -1567998999;
                        i7 = iM6981 ^ i3;
                        viewOnClickListenerC7042 = this;
                    } else {
                        iM2566 = C0630.m2566("ܽۗ") ^ i5;
                        i = ((iM2566 ^ i4) * 14097) ^ (-1645142973);
                        i2 = -830235908;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    }
                    break;
                case -1205384174:
                case -486388113:
                    C4159.m12565();
                    if (C7106.f21815 == 0) {
                        iM2566 = C2105.m6981("ܽۘ") ^ i5;
                        i = ((iM2566 ^ i4) * 27301) ^ (-514041526);
                        i2 = -631871848;
                    } else {
                        iM2566 = (i4 - C2105.m6981("᩻ۗ")) * (-93);
                        i = ((iM2566 ^ i5) * 28125) ^ 1298506563;
                        i2 = 463236688;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1037103300:
                case 2067138665:
                    viewFindViewById = viewOnClickListenerC7042.findViewById(C0630.m2566(strM4902) ^ 2122588917);
                    if (viewFindViewById == null) {
                        iM6981 = (i4 - C0630.m2566("ܺ֫")) * (-23);
                        i6 = ((iM6981 ^ i5) * (-24891)) ^ (-1352733898);
                        i3 = -1567998999;
                        i7 = iM6981 ^ i3;
                        viewOnClickListenerC7042 = this;
                    } else {
                        iM2566 = (C0630.m2566("֨֫") + i4) * 79;
                        i = ((iM2566 ^ i5) * (-18373)) ^ (-966021783);
                        i2 = 1811349769;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    }
                    break;
                case -735554709:
                case 1825739873:
                    s = sArr2[c];
                    s2 = 39316;
                    if (C1773.m5908() <= 0) {
                        iM6981 = (C0630.m2566("ܽܶ") + i4) * (-31);
                        i6 = ((iM6981 ^ i5) * (-1507)) ^ 1729467708;
                        i3 = -1335083566;
                    } else {
                        iM6981 = (C0630.m2566("ܿܳ") + i5) * 115;
                        i6 = ((iM6981 ^ i4) * 15999) ^ 1185188042;
                        i3 = -1822333794;
                    }
                    i7 = iM6981 ^ i3;
                    viewOnClickListenerC7042 = this;
                    break;
                case -683735420:
                case 1072167746:
                    c = 'L';
                    if (C3663.m11168() >= 0) {
                        iM6981 = (C0630.m2566("ۧ۠") + i5) * (-113);
                        i6 = ((iM6981 ^ i4) * 19481) ^ 489215026;
                        i3 = 1524045213;
                    } else {
                        iM6981 = C2105.m6981("ۨ᩵") ^ i4;
                        i6 = ((iM6981 ^ i5) * 17205) ^ 114764091;
                        i3 = -641318972;
                    }
                    i7 = iM6981 ^ i3;
                    viewOnClickListenerC7042 = this;
                    break;
                case -552127233:
                case 1128680348:
                    ((InputMethodManager) C2272.m7509(viewOnClickListenerC7042, strM3502)).hideSoftInputFromWindow(viewFindViewById.getWindowToken(), i8);
                    iM6981 = (i4 - C0630.m2566("ܺ֫")) * (-23);
                    i6 = ((iM6981 ^ i5) * (-24891)) ^ (-1352733898);
                    i3 = -1567998999;
                    i7 = iM6981 ^ i3;
                    viewOnClickListenerC7042 = this;
                    break;
                case -415920908:
                case 759187234:
                    if (motionEvent.getActionMasked() == 0) {
                        iM6981 = C0630.m2566("֫᩻") ^ i5;
                        i6 = ((iM6981 ^ i4) * (-15393)) ^ (-1234818812);
                        i3 = 1561726245;
                    } else {
                        iM6981 = (i4 - C0630.m2566("ܺ֫")) * (-23);
                        i6 = ((iM6981 ^ i5) * (-24891)) ^ (-1352733898);
                        i3 = -1567998999;
                    }
                    i7 = iM6981 ^ i3;
                    viewOnClickListenerC7042 = this;
                    break;
                case -301291381:
                case 1858366662:
                    C1420.m4913();
                    iM2566 = C0630.m2566("ۛ֨") ^ i4;
                    i = ((iM2566 ^ i5) * (-4541)) ^ (-769512215);
                    i2 = -1231766606;
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -213890349:
                case 432687526:
                    return super.dispatchTouchEvent(motionEvent);
                case -86027026:
                case 1255085687:
                    sArr = f21694;
                    i12 = 80;
                    i13 = 3;
                    if (!C2520.m8026()) {
                        iM2566 = (i5 - C0630.m2566("ۖۡ")) * 9;
                        i = ((iM2566 ^ i4) * 23347) ^ 1560623642;
                        i2 = -631084065;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    } else {
                        iM6981 = (C0630.m2566("ܽܶ") + i4) * (-31);
                        i6 = ((iM6981 ^ i5) * (-1507)) ^ 1729467708;
                        i3 = -1335083566;
                        i7 = iM6981 ^ i3;
                        viewOnClickListenerC7042 = this;
                    }
                    break;
                case 58735287:
                case 1804783513:
                    C0422.m1963();
                    return false;
                case 83583523:
                case 809196997:
                    C1711.m5740(C0964.m3409(viewOnClickListenerC7042, 2124177083 ^ iM6982));
                    if (!C3663.f11553) {
                        iM2566 = (i4 - C0630.m2566("ۧ֨")) * (-89);
                        i = ((iM2566 ^ i5) * (-26323)) ^ (-2062467010);
                        i2 = 1801215109;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    } else {
                        iM6981 = (C0630.m2566("ܽܶ") + i4) * (-31);
                        i6 = ((iM6981 ^ i5) * (-1507)) ^ 1729467708;
                        i3 = -1335083566;
                        i7 = iM6981 ^ i3;
                        viewOnClickListenerC7042 = this;
                    }
                    break;
                case 223849114:
                case 784601655:
                    iM6982 = C2105.m6981(C0630.m2575(sArr, i12, i13, i11));
                    if (C2520.f8000 >= 0) {
                        iM2566 = C2105.m6981("ܽۘ") ^ i5;
                        i = ((iM2566 ^ i4) * 27301) ^ (-514041526);
                        i2 = -631871848;
                    } else {
                        iM2566 = (C2105.m6981("ۧۜ") ^ i4) * 11;
                        i = ((iM2566 ^ i5) * 19609) ^ 553552505;
                        i2 = -1021659652;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case 356488836:
                case 380618154:
                    if ((s * s2) - ((s * s) + 386436964) <= 0) {
                        iM6981 = (C2105.m6981("ۚܽ") + i4) * (-105);
                        i6 = ((iM6981 ^ i5) * (-4905)) ^ (-2020121587);
                        i3 = -1222704477;
                    } else {
                        iM6981 = C2105.m6981("᩹ܳ") ^ i5;
                        i6 = ((iM6981 ^ i4) * 20749) ^ (-113867331);
                        i3 = -1241204063;
                    }
                    i7 = iM6981 ^ i3;
                    viewOnClickListenerC7042 = this;
                    break;
                case 593230740:
                case 1608305515:
                    C4263.m12819();
                    if (C2126.f7087) {
                        iM2566 = C0630.m2566("ۧܺ") ^ i4;
                        i = ((iM2566 ^ i5) * 26519) ^ 1220824042;
                        i2 = -532307029;
                    } else {
                        iM2566 = C0630.m2566("ۛ֨") ^ i4;
                        i = ((iM2566 ^ i5) * (-4541)) ^ (-769512215);
                        i2 = -1231766606;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case 761154778:
                case 942751271:
                    sArr2 = f21694;
                    if (C3019.f9544 >= 0) {
                        iM6981 = (C0630.m2566("ܽܶ") + i4) * (-31);
                        i6 = ((iM6981 ^ i5) * (-1507)) ^ 1729467708;
                        i3 = -1335083566;
                    } else {
                        iM6981 = (C2105.m6981("᩸᩷") ^ i5) * (-71);
                        i6 = ((iM6981 ^ i4) * 11529) ^ (-516527383);
                        i3 = -1363855909;
                    }
                    i7 = iM6981 ^ i3;
                    viewOnClickListenerC7042 = this;
                    break;
                default:
                    if (rawX < C0237.m1480(viewFindViewById) + i9) {
                        iM2566 = (i5 - C0630.m2566("ᩴۢ")) * 39;
                        i = ((iM2566 ^ i4) * (-20003)) ^ 46356627;
                        i2 = 1221766435;
                    } else {
                        iM2566 = C0630.m2566("ܽۗ") ^ i5;
                        i = ((iM2566 ^ i4) * 14097) ^ (-1645142973);
                        i2 = -830235908;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x05fa A[PHI: r1 r10 r19 r28 r30
      0x05fa: PHI (r1v26 android.widget.EditText) = (r1v20 android.widget.EditText), (r1v22 android.widget.EditText), (r1v27 android.widget.EditText) binds: [B:122:0x05e1, B:110:0x0546, B:90:0x0401] A[DONT_GENERATE, DONT_INLINE]
      0x05fa: PHI (r10v21 java.lang.StringBuilder) = (r10v13 java.lang.StringBuilder), (r10v15 java.lang.StringBuilder), (r10v22 java.lang.StringBuilder) binds: [B:122:0x05e1, B:110:0x0546, B:90:0x0401] A[DONT_GENERATE, DONT_INLINE]
      0x05fa: PHI (r19v18 int) = (r19v12 int), (r19v14 int), (r19v19 int) binds: [B:122:0x05e1, B:110:0x0546, B:90:0x0401] A[DONT_GENERATE, DONT_INLINE]
      0x05fa: PHI (r28v21 int) = (r28v15 int), (r28v17 int), (r28v22 int) binds: [B:122:0x05e1, B:110:0x0546, B:90:0x0401] A[DONT_GENERATE, DONT_INLINE]
      0x05fa: PHI (r30v20 boolean) = (r30v11 boolean), (r30v17 boolean), (r30v21 boolean) binds: [B:122:0x05e1, B:110:0x0546, B:90:0x0401] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0150 A[PHI: r2
      0x0150: PHI (r2v199 int) = (r2v2 int), (r2v190 int), (r2v2 int), (r2v2 int) binds: [B:182:0x0150, B:41:0x014e, B:28:0x00e4, B:205:0x0150] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0323 A[PHI: r12 r13 r14 r28
      0x0323: PHI (r12v6 int) = (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:71:0x0321, B:50:0x01d0, B:14:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x0323: PHI (r13v6 android.widget.PopupWindow) = (r13v3 android.widget.PopupWindow), (r13v2 android.widget.PopupWindow), (r13v2 android.widget.PopupWindow) binds: [B:71:0x0321, B:50:0x01d0, B:14:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x0323: PHI (r14v6 android.view.View) = (r14v3 android.view.View), (r14v2 android.view.View), (r14v2 android.view.View) binds: [B:71:0x0321, B:50:0x01d0, B:14:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x0323: PHI (r28v72 int) = (r28v52 int), (r28v60 int), (r28v78 int) binds: [B:71:0x0321, B:50:0x01d0, B:14:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0113, code lost:
    
        if (l.C1420.m4913() == false) goto L9;
     */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m19025() {
        int iM2566;
        int i;
        int i2;
        String upperCase;
        int iM2567;
        int i3;
        int i4;
        int iM6981;
        int i5;
        int i6;
        int iM6982;
        int i7;
        int i8;
        int i9;
        int iM2568;
        int i10;
        int i11;
        int iM6983;
        int i12;
        int i13;
        C14802 c14802;
        int i14;
        int i15 = 0;
        int i16 = 0;
        int i17 = -589988970;
        int i18 = C4263.f13799;
        int i19 = RunnableC1937.f6483;
        int iM6984 = C2105.m6981("֫ۜ") ^ i19;
        int i20 = ((iM6984 ^ i18) * (-18413)) ^ 1539854106;
        int i21 = iM6984 ^ (-2104384040);
        final String str = null;
        View viewM12813 = null;
        TextView textView = null;
        Iterator itM9029 = null;
        C11077 c11077 = null;
        C14802 c14803 = null;
        View.OnClickListener onClickListener = null;
        View viewM3507 = null;
        int iM2569 = 0;
        int i22 = 0;
        boolean z = false;
        int iM6985 = 0;
        int iM6986 = 0;
        int i23 = 0;
        EditText editText = null;
        int iM6987 = 0;
        int i24 = 0;
        short s = 0;
        StringBuilder sb = null;
        View viewM10739 = null;
        final PopupWindow popupWindow = null;
        final int i25 = 0;
        while (true) {
            i17 = i21 ^ (i20 & (((i17 ^ i18) * (-26001)) >> 31));
            switch (i17) {
                case -2086749407:
                case 535969154:
                    iM2569 = iM2569;
                    editText = editText;
                    StringBuilder sb2 = sb;
                    i22 = i22;
                    z = true;
                    if (this.f21698) {
                        iM2567 = (C2105.m6981("ܺۘ") ^ i19) * (-87);
                        i = ((iM2567 ^ i18) * (-9741)) ^ (-1489800652);
                        i3 = 1421897111;
                    } else {
                        iM2567 = (i18 - C0630.m2566("᩷ۛ")) * 67;
                        i = ((iM2567 ^ i19) * 9923) ^ (-1486340930);
                        i3 = 613294945;
                    }
                    i4 = iM2567 ^ i3;
                    sb = sb2;
                    int i26 = i22;
                    editText = editText;
                    i20 = i;
                    i22 = i26;
                    int i27 = iM2569;
                    i21 = i4;
                    iM2569 = i27;
                    break;
                case -2051459046:
                case -1450171991:
                    C5695.m16023();
                    if (C7106.m19120() <= 0) {
                        iM2569 = iM2569;
                        z = z;
                        editText = editText;
                        sb = sb;
                        i22 = i22;
                        iM2566 = (i18 - C0630.m2566("ۡۜ")) * (-89);
                        i = ((iM2566 ^ i19) * (-3421)) ^ (-204853315);
                        i2 = -710769603;
                        i4 = iM2566 ^ i2;
                        sb = sb;
                        z = z;
                        int i28 = i22;
                        editText = editText;
                        i20 = i;
                        i22 = i28;
                        int i29 = iM2569;
                        i21 = i4;
                        iM2569 = i29;
                    } else {
                        iM6981 = (i19 - C2105.m6981("ۘܺ")) * 67;
                        i5 = ((iM6981 ^ i18) * 21779) ^ 470485884;
                        i6 = -1207789834;
                        i21 = iM6981 ^ i6;
                        i20 = i5;
                    }
                    break;
                case -1948875369:
                case -1700421562:
                    iM2569 = iM2569;
                    z = z;
                    EditText editText2 = editText;
                    StringBuilder sb3 = sb;
                    int i30 = i22;
                    int i31 = i15 + i16;
                    short s2 = s;
                    int i32 = s2 + 14637;
                    if ((i32 * i32) - (i31 + i31) > 0) {
                        iM6982 = (C2105.m6981("ܳۤ") ^ i18) * 41;
                        i7 = ((iM6982 ^ i19) * 7131) ^ (-1832867588);
                        i8 = -1921983376;
                    } else {
                        iM6982 = (C2105.m6981("᩸᩺") + i19) * (-55);
                        i7 = ((iM6982 ^ i18) * (-7823)) ^ 64673245;
                        i8 = -992901935;
                    }
                    i9 = iM6982 ^ i8;
                    s = s2;
                    sb = sb3;
                    i22 = i30;
                    editText = editText2;
                    i20 = i7;
                    z = z;
                    i14 = iM2569;
                    i21 = i9;
                    iM2569 = i14;
                    break;
                case -1946384317:
                case 1057432451:
                    this.f21697 = z;
                    m19026();
                    break;
                case -1872443151:
                case 578070182:
                    c14802 = (C14802) c11077.getTag();
                    c14803 = c14802;
                    iM6983 = C0630.m2566("ۙۨ") ^ i18;
                    i12 = ((iM6983 ^ i19) * 24651) ^ 111311333;
                    i13 = -1577212971;
                    i14 = iM2569;
                    i21 = iM6983 ^ i13;
                    i20 = i12;
                    iM2569 = i14;
                    break;
                case -1808202028:
                case -743161821:
                    editText = editText;
                    upperCase = "";
                    str = upperCase;
                    iM2566 = (i19 - C0630.m2566("ᩳᩴ")) * 13;
                    i = ((iM2566 ^ i18) * 2819) ^ (-512341291);
                    i2 = 570664671;
                    i4 = iM2566 ^ i2;
                    sb = sb;
                    z = z;
                    int i210 = i22;
                    editText = editText;
                    i20 = i;
                    i22 = i210;
                    int i211 = iM2569;
                    i21 = i4;
                    iM2569 = i211;
                    break;
                case -1784589870:
                case -1393544168:
                    iM2569 = iM2569;
                    if (c14803 == null) {
                        iM6983 = C0630.m2566("۫۬") ^ i19;
                        i12 = ((iM6983 ^ i18) * (-10531)) ^ 1012253640;
                        i13 = 1419826156;
                    } else {
                        iM6983 = (C2105.m6981("᩸ۖ") ^ i19) * (-29);
                        i12 = ((iM6983 ^ i18) * (-27791)) ^ (-1927600854);
                        i13 = -1917139162;
                    }
                    i14 = iM2569;
                    i21 = iM6983 ^ i13;
                    i20 = i12;
                    iM2569 = i14;
                    break;
                case -1780913509:
                case 1103229603:
                    iM2569 = iM2569;
                    onClickListener = new View.OnClickListener(this) { // from class: l.ۤܶ᩷

                        /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ ViewOnClickListenerC7042 f31217;

                        {
                            int i33 = 1586809905;
                            int i34 = C0050.f910;
                            int i35 = C2167.f7158;
                            int iM6988 = C2105.m6981("ܽۙ") ^ i35;
                            int i36 = ((iM6988 ^ i34) * (-28133)) ^ (-1281935831);
                            int i37 = -1925778074;
                            while (true) {
                                i33 = ((((i33 ^ i34) * 13797) >> 31) & i36) ^ (iM6988 ^ i37);
                                switch (i33) {
                                    case -2078210850:
                                    case 1415618172:
                                        this.f31217 = this;
                                        if (C2105.m6982() != 0) {
                                            iM6988 = C2105.m6981("ۡۜ") ^ i34;
                                            i36 = ((iM6988 ^ i35) * (-29371)) ^ (-318234777);
                                            i37 = 1771514893;
                                        } else {
                                            iM6988 = (i35 - C0630.m2566("۠ۡ")) * (-49);
                                            i36 = ((iM6988 ^ i34) * (-26731)) ^ 836806054;
                                            i37 = 1078009421;
                                        }
                                        break;
                                    case -1791824547:
                                    case -1761792780:
                                        C1773.m5908();
                                        C1047.m3599();
                                        iM6988 = C2105.m6981("ۤ۬") ^ i35;
                                        i36 = ((iM6988 ^ i34) * 7209) ^ (-334501414);
                                        i37 = -2072802371;
                                        break;
                                    case -1730335252:
                                    case 2061608933:
                                        if (AbstractC2021.f6743 <= 0) {
                                            iM6988 = C0630.m2566("ۗܶ") ^ i35;
                                            i36 = ((iM6988 ^ i34) * (-14609)) ^ (-1558120355);
                                            i37 = -839037520;
                                        } else {
                                            iM6988 = C0630.m2566("۬᩵") ^ i34;
                                            i36 = ((iM6988 ^ i35) * (-1245)) ^ 2116544924;
                                            i37 = -490084605;
                                        }
                                        break;
                                    case -1584997931:
                                    case 576438008:
                                        return;
                                    case -1129716108:
                                    case 1620121680:
                                        if (C5695.f17556 >= 0) {
                                            iM6988 = C2105.m6981("ۤ۬") ^ i35;
                                            i36 = ((iM6988 ^ i34) * 7209) ^ (-334501414);
                                            i37 = -2072802371;
                                        } else {
                                            iM6988 = C0630.m2566("ᩴ᩻") ^ i35;
                                            i36 = ((iM6988 ^ i34) * (-9461)) ^ 1438828643;
                                            i37 = -1828052224;
                                        }
                                        break;
                                    case -815668020:
                                    case 1247797665:
                                        if (AbstractC2021.m6574()) {
                                            iM6988 = (i35 - C2105.m6981("ۖܳ")) * (-59);
                                            i36 = ((iM6988 ^ i34) * (-8095)) ^ (-2034943260);
                                            i37 = 269260976;
                                        } else {
                                            iM6988 = (i35 - C2105.m6981("᩺᩺")) * 37;
                                            i36 = ((iM6988 ^ i34) * 26901) ^ 1643613668;
                                            i37 = 864016913;
                                        }
                                        break;
                                    case -635708065:
                                    case -112416163:
                                        if (C0050.f910 >= 0) {
                                            iM6988 = (i34 - C2105.m6981("ۙۡ")) * (-89);
                                            i36 = ((iM6988 ^ i35) * (-31119)) ^ (-1089568884);
                                            i37 = -886823423;
                                        } else {
                                            iM6988 = C2105.m6981("ۤ۬") ^ i35;
                                            i36 = ((iM6988 ^ i34) * 7209) ^ (-334501414);
                                            i37 = -2072802371;
                                        }
                                        break;
                                    case -572230322:
                                    case 1606497402:
                                        if (C2105.f7037 != 0) {
                                            iM6988 = (i34 - C2105.m6981("ۙۡ")) * (-89);
                                            i36 = ((iM6988 ^ i35) * (-31119)) ^ (-1089568884);
                                            i37 = -886823423;
                                        } else {
                                            iM6988 = C2105.m6981("۬۬") ^ i34;
                                            i36 = ((iM6988 ^ i35) * (-18957)) ^ 1649437651;
                                            i37 = 1074538175;
                                        }
                                        break;
                                    case -292401668:
                                    case 82699256:
                                        if (C1504.f5354) {
                                            iM6988 = (i35 - C2105.m6981("ۖܳ")) * (-59);
                                            i36 = ((iM6988 ^ i34) * (-8095)) ^ (-2034943260);
                                            i37 = 269260976;
                                        } else {
                                            iM6988 = C0630.m2566("ᩳܺ") ^ i35;
                                            i36 = ((iM6988 ^ i34) * 8715) ^ 1976151847;
                                            i37 = 1099471597;
                                        }
                                        break;
                                    case -121623430:
                                    case 346757801:
                                        if (!C1005.f3721) {
                                            iM6988 = C2105.m6981("ۤ۬") ^ i35;
                                            i36 = ((iM6988 ^ i34) * 7209) ^ (-334501414);
                                            i37 = -2072802371;
                                        } else {
                                            iM6988 = (i35 - C2105.m6981("ۖܳ")) * (-59);
                                            i36 = ((iM6988 ^ i34) * (-8095)) ^ (-2034943260);
                                            i37 = 269260976;
                                        }
                                        break;
                                    case 22460260:
                                    case 1562762003:
                                        C2167.m7155();
                                        throw new RuntimeException();
                                    case 254794609:
                                    case 510397249:
                                        if (C2126.f7087) {
                                            iM6988 = (i34 - C2105.m6981("ۙۡ")) * (-89);
                                            i36 = ((iM6988 ^ i35) * (-31119)) ^ (-1089568884);
                                            i37 = -886823423;
                                        } else {
                                            iM6988 = C0630.m2566("֡᩺") ^ i35;
                                            i36 = ((iM6988 ^ i34) * (-17393)) ^ 391360152;
                                            i37 = -2036895579;
                                        }
                                        break;
                                    case 315082016:
                                    case 651712166:
                                        if (C0237.f1507 != 0) {
                                            iM6988 = C2105.m6981("ۡۜ") ^ i34;
                                            i36 = ((iM6988 ^ i35) * (-29371)) ^ (-318234777);
                                            i37 = 1771514893;
                                        } else {
                                            iM6988 = (C0630.m2566("ۤ᩹") ^ i34) * 7;
                                            i36 = ((iM6988 ^ i35) * (-31303)) ^ 430739356;
                                            i37 = -1175898668;
                                        }
                                        break;
                                    case 911510610:
                                    case 1517819695:
                                        if (C0050.f910 >= 0) {
                                            iM6988 = C0630.m2566("ۗܶ") ^ i35;
                                            i36 = ((iM6988 ^ i34) * (-14609)) ^ (-1558120355);
                                            i37 = -839037520;
                                        } else {
                                            iM6988 = (C0630.m2566("ᩳۢ") ^ i34) * 5;
                                            i36 = ((iM6988 ^ i35) * 20819) ^ 553406875;
                                            i37 = -848987284;
                                        }
                                        break;
                                    case 964225230:
                                    case 1365264454:
                                        if (C0050.f910 >= 0) {
                                            iM6988 = C2105.m6981("ۤ۬") ^ i35;
                                            i36 = ((iM6988 ^ i34) * 7209) ^ (-334501414);
                                            i37 = -2072802371;
                                        } else {
                                            iM6988 = C0630.m2566("ۡۢ") ^ i34;
                                            i36 = ((iM6988 ^ i35) * (-13885)) ^ 1221010144;
                                            i37 = 305630358;
                                        }
                                        break;
                                    default:
                                        C1047.m3599();
                                        if (ViewOnClickListenerC1958.f6529 <= 0) {
                                            iM6988 = C2105.m6981("ۡۜ") ^ i34;
                                            i36 = ((iM6988 ^ i35) * (-29371)) ^ (-318234777);
                                            i37 = 1771514893;
                                        } else {
                                            iM6988 = C2105.m6981("ۤ۬") ^ i35;
                                            i36 = ((iM6988 ^ i34) * 7209) ^ (-334501414);
                                            i37 = -2072802371;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i33 = 0;
                            String str2 = null;
                            int i34 = 1062150606;
                            int i35 = C4616.f14690;
                            int i36 = C3537.f11231;
                            int iM6988 = (i36 - C2105.m6981("ۗ۠")) * (-5);
                            int i37 = ((iM6988 ^ i35) * 9449) ^ (-694426017);
                            int i38 = 1944896818;
                            while (true) {
                                i34 = ((((i34 ^ i35) * 5991) >> 31) & i37) ^ (iM6988 ^ i38);
                                switch (i34) {
                                    case -2118064523:
                                    case -1468920301:
                                        if (C0964.f3626 != 0) {
                                            iM6988 = (C2105.m6981("ۤۙ") + i36) * (-99);
                                            i37 = ((iM6988 ^ i35) * (-971)) ^ 1182899379;
                                            i38 = -1439704538;
                                        } else {
                                            iM6988 = (i35 - C2105.m6981("ۧ֫")) * 95;
                                            i37 = ((iM6988 ^ i36) * 18713) ^ 892522511;
                                            i38 = -169725601;
                                        }
                                        break;
                                    case -2034890746:
                                    case 1272785923:
                                        i33 = i25;
                                        if (RunnableC1108.f4040) {
                                            iM6988 = C2105.m6981("ܺ᩸") ^ i36;
                                            i37 = ((iM6988 ^ i35) * (-27791)) ^ 1793641550;
                                            i38 = 646695264;
                                        } else {
                                            iM6988 = C0630.m2566("ۚۛ") ^ i36;
                                            i37 = ((iM6988 ^ i35) * (-5635)) ^ (-1798743885);
                                            i38 = -1651018618;
                                        }
                                        break;
                                    case -1947031818:
                                    case 1306881922:
                                        if (AbstractC2021.f6743 <= 0) {
                                            iM6988 = C0630.m2566("ۚۛ") ^ i36;
                                            i37 = ((iM6988 ^ i35) * (-5635)) ^ (-1798743885);
                                            i38 = -1651018618;
                                        } else {
                                            iM6988 = (C2105.m6981("ܶۡ") + i35) * (-59);
                                            i37 = ((iM6988 ^ i36) * (-13169)) ^ 1625607226;
                                            i38 = -469915247;
                                        }
                                        break;
                                    case -1802777559:
                                    case -1035245531:
                                        if (C3683.m11222()) {
                                            iM6988 = (C0630.m2566("ܿ᩻") + i35) * 23;
                                            i37 = ((iM6988 ^ i36) * (-27941)) ^ (-1508944800);
                                            i38 = 1662522064;
                                        } else {
                                            iM6988 = (C0630.m2566("ۧ᩹") ^ i36) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i37 = ((iM6988 ^ i35) * 24723) ^ 817973710;
                                            i38 = -1591160819;
                                        }
                                        break;
                                    case -1793284875:
                                    case 354374306:
                                        C1711.m5736();
                                        if (!C1916.f6442) {
                                            iM6988 = (C0630.m2566("ܿ᩻") + i35) * 23;
                                            i37 = ((iM6988 ^ i36) * (-27941)) ^ (-1508944800);
                                            i38 = 1662522064;
                                        } else {
                                            iM6988 = C0630.m2566("ۚۛ") ^ i36;
                                            i37 = ((iM6988 ^ i35) * (-5635)) ^ (-1798743885);
                                            i38 = -1651018618;
                                        }
                                        break;
                                    case -1434184133:
                                    case 145593162:
                                        if (C1047.f3863 >= 0) {
                                            iM6988 = (C2105.m6981("ۤۙ") + i36) * (-99);
                                            i37 = ((iM6988 ^ i35) * (-971)) ^ 1182899379;
                                            i38 = -1439704538;
                                        } else {
                                            iM6988 = C2105.m6981("᩶᩻") ^ i36;
                                            i37 = ((iM6988 ^ i35) * 9091) ^ (-621425954);
                                            i38 = 982801485;
                                        }
                                        break;
                                    case -1410863010:
                                    case -541235577:
                                        if (RunnableC1937.m6387() != 0) {
                                            iM6988 = (C0630.m2566("ۨܶ") + i36) * (-103);
                                            i37 = ((iM6988 ^ i35) * (-31113)) ^ (-1513049992);
                                            i38 = 1115559093;
                                        } else {
                                            iM6988 = C2105.m6981("۟ܳ") ^ i35;
                                            i37 = ((iM6988 ^ i36) * 1823) ^ 986570503;
                                            i38 = 1835413239;
                                        }
                                        break;
                                    case -1343611535:
                                    case -349299006:
                                        if (ServiceConnectionC3453.f10921 >= 0) {
                                            iM6988 = C0630.m2566("ۚۛ") ^ i36;
                                            i37 = ((iM6988 ^ i35) * (-5635)) ^ (-1798743885);
                                            i38 = -1651018618;
                                        } else {
                                            iM6988 = C0630.m2566("ۛܽ") ^ i35;
                                            i37 = ((iM6988 ^ i36) * (-26393)) ^ (-922298740);
                                            i38 = 1801349760;
                                        }
                                        break;
                                    case -598927507:
                                    case -136515267:
                                        C4263.m12819();
                                        if (C3683.f11629 < 0) {
                                            iM6988 = (C2105.m6981("ۤۙ") + i36) * (-99);
                                            i37 = ((iM6988 ^ i35) * (-971)) ^ 1182899379;
                                            i38 = -1439704538;
                                        } else {
                                            iM6988 = (C0630.m2566("ܿ᩻") + i35) * 23;
                                            i37 = ((iM6988 ^ i36) * (-27941)) ^ (-1508944800);
                                            i38 = 1662522064;
                                        }
                                        break;
                                    case -243063162:
                                    case 1151637071:
                                        if (RunnableC3474.m10630()) {
                                            iM6988 = C2105.m6981("ۖ᩺") ^ i36;
                                            i37 = ((iM6988 ^ i35) * 29293) ^ 1184498693;
                                            i38 = -1471316786;
                                        } else {
                                            iM6988 = C2105.m6981("ۘۙ") ^ i35;
                                            i37 = ((iM6988 ^ i36) * 3523) ^ (-1056266826);
                                            i38 = -1280859852;
                                        }
                                        break;
                                    case -235553327:
                                    case 1978488590:
                                        ViewOnClickListenerC7042.m19013(this.f31217, popupWindow, i33, str2, view);
                                        break;
                                    case -227739063:
                                    case 1328882693:
                                        if (C1916.m6308() >= 0) {
                                            iM6988 = C2105.m6981("ۘۙ") ^ i35;
                                            i37 = ((iM6988 ^ i36) * 3523) ^ (-1056266826);
                                            i38 = -1280859852;
                                        } else {
                                            iM6988 = C0630.m2566("ۚۛ") ^ i36;
                                            i37 = ((iM6988 ^ i35) * (-5635)) ^ (-1798743885);
                                            i38 = -1651018618;
                                        }
                                        break;
                                    case 343635891:
                                    case 2046074592:
                                        if (C0630.f2410 <= 0) {
                                            iM6988 = C2105.m6981("ۘۙ") ^ i35;
                                            i37 = ((iM6988 ^ i36) * 3523) ^ (-1056266826);
                                            i38 = -1280859852;
                                        } else {
                                            iM6988 = (C2105.m6981("ۛۢ") + i36) * (-25);
                                            i37 = ((iM6988 ^ i35) * 14091) ^ 793622468;
                                            i38 = 792702953;
                                        }
                                        break;
                                    case 435126292:
                                    case 2076199694:
                                        C7106.m19120();
                                        break;
                                    case 918916001:
                                    case 1278124941:
                                        ViewOnClickListenerC1958.m6429();
                                        iM6988 = (C0630.m2566("ܿ᩻") + i35) * 23;
                                        i37 = ((iM6988 ^ i36) * (-27941)) ^ (-1508944800);
                                        i38 = 1662522064;
                                        break;
                                    default:
                                        str2 = str;
                                        if (C3245.f10203 <= 0) {
                                            iM6988 = (C0630.m2566("ۨܶ") + i36) * (-103);
                                            i37 = ((iM6988 ^ i35) * (-31113)) ^ (-1513049992);
                                            i38 = 1115559093;
                                        } else {
                                            iM6988 = (C0630.m2566("ܳۢ") ^ i35) * (-53);
                                            i37 = ((iM6988 ^ i36) * 29735) ^ (-460244682);
                                            i38 = 180912372;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    iM6985 = C2105.m6981(C4159.m12578(f21694, 273, 3, i23)) ^ 2099519263;
                    if (C3537.f11231 >= 0) {
                        iM6983 = (C2105.m6981("ܽ֡") + i18) * (-29);
                        i12 = ((iM6983 ^ i19) * (-16383)) ^ (-1456786316);
                        i13 = -1025055581;
                    } else {
                        iM6983 = C0630.m2566("ۨ᩸") ^ i19;
                        i12 = ((iM6983 ^ i18) * 1459) ^ 185066375;
                        i13 = -1262125294;
                    }
                    i14 = iM2569;
                    i21 = iM6983 ^ i13;
                    i20 = i12;
                    iM2569 = i14;
                    break;
                case -1778801778:
                case 694953973:
                    iM2569 = iM2569;
                    z = z;
                    editText = editText;
                    sb = sb;
                    i22 = i22;
                    viewM12813 = C4263.m12813(this, C0630.m2566(C0630.m2575(f21694, 263, 3, i23)) ^ 2102409924);
                    if (C2126.f7087) {
                        iM2566 = (i18 - C0630.m2566("ۡۜ")) * (-89);
                        i = ((iM2566 ^ i19) * (-3421)) ^ (-204853315);
                        i2 = -710769603;
                    } else {
                        iM2566 = (C2105.m6981("᩻ܺ") ^ i19) * 47;
                        i = ((iM2566 ^ i18) * (-4005)) ^ (-1055196896);
                        i2 = 1783510834;
                    }
                    i4 = iM2566 ^ i2;
                    sb = sb;
                    z = z;
                    int i212 = i22;
                    editText = editText;
                    i20 = i;
                    i22 = i212;
                    int i213 = iM2569;
                    i21 = i4;
                    iM2569 = i213;
                    break;
                case -1771344978:
                case 1541903490:
                    C4075.m12263();
                    if (C0798.m2998() == 0) {
                        iM2569 = iM2569;
                        z = z;
                        editText = editText;
                        i22 = i22;
                        int iM6988 = C2105.m6981("۫۫") ^ i18;
                        i = ((iM6988 ^ i19) * (-14311)) ^ (-926397374);
                        i4 = iM6988 ^ (-2006832318);
                        z = z;
                        sb = null;
                        int i214 = i22;
                        editText = editText;
                        i20 = i;
                        i22 = i214;
                        int i215 = iM2569;
                        i21 = i4;
                        iM2569 = i215;
                    } else {
                        iM6981 = (C0630.m2566("ۨۤ") ^ i19) * (-69);
                        i5 = ((iM6981 ^ i18) * (-15013)) ^ 199339155;
                        i6 = 2004771818;
                        i21 = iM6981 ^ i6;
                        i20 = i5;
                    }
                    break;
                case -1748475443:
                case -920077215:
                    iM2569 = iM2569;
                    itM9029 = C2958.m9029(this.f21696);
                    int iM25610 = C0630.m2566("᩷֨") ^ i18;
                    int i33 = ((iM25610 ^ i19) * (-10529)) ^ 1653961831;
                    i9 = iM25610 ^ (-2075002018);
                    editText = editText;
                    i20 = i33;
                    i14 = iM2569;
                    i21 = i9;
                    iM2569 = i14;
                    break;
                case -1739776841:
                case 2114364791:
                    iM2569 = iM2569;
                    C2126.m7039(viewM3507, onClickListener);
                    boolean zM24407 = C9523.m24407();
                    iM6986 = 2101478683 ^ C2105.m6981(C1047.m3603(f21694, 279, 3, i23));
                    if (zM24407) {
                        iM6983 = C2105.m6981("ۨ᩺") ^ i19;
                        i12 = ((iM6983 ^ i18) * 10553) ^ 1511549041;
                        i13 = 679838859;
                    } else {
                        iM6983 = C2105.m6981("᩸᩹") ^ i18;
                        i12 = ((iM6983 ^ i19) * (-16145)) ^ 1566825441;
                        i13 = 1434821019;
                    }
                    i14 = iM2569;
                    i21 = iM6983 ^ i13;
                    i20 = i12;
                    iM2569 = i14;
                    break;
                case -1729610697:
                case 260263676:
                    iM2569 = iM2569;
                    i22 = i22;
                    z = z;
                    sb = sb;
                    editText = (EditText) C0964.m3409(this, C2105.m6981(C2958.m9031(f21694, 237, 3, i23)) ^ 2099555935);
                    if (this.f21695.f53846) {
                        iM2566 = C2105.m6981("᩺᩺") ^ i19;
                        i = ((iM2566 ^ i18) * (-25315)) ^ (-1182878375);
                        i2 = 1098618988;
                    } else {
                        iM2566 = C2105.m6981("֨ܶ") ^ i18;
                        i = ((iM2566 ^ i19) * (-22129)) ^ (-781697853);
                        i2 = -404168827;
                    }
                    i4 = iM2566 ^ i2;
                    sb = sb;
                    z = z;
                    int i216 = i22;
                    editText = editText;
                    i20 = i;
                    i22 = i216;
                    int i217 = iM2569;
                    i21 = i4;
                    iM2569 = i217;
                    break;
                case -1671809620:
                case -72274910:
                    C1047.m3599();
                    iM2569 = iM2569;
                    z = z;
                    editText = editText;
                    i22 = i22;
                    int iM6989 = C2105.m6981("᩶᩻") ^ i19;
                    i = ((iM6989 ^ i18) * (-14789)) ^ 1099177338;
                    i4 = iM6989 ^ 1461776138;
                    z = z;
                    int i218 = i22;
                    editText = editText;
                    i20 = i;
                    i22 = i218;
                    int i219 = iM2569;
                    i21 = i4;
                    iM2569 = i219;
                    break;
                case -1662302894:
                case -1184453837:
                    C3746.m11360(C1005.m3507(viewM10739, iM6986), 8);
                    iM6983 = C2105.m6981("ۢ֡") ^ i18;
                    i12 = ((iM6983 ^ i19) * 31881) ^ (-37375656);
                    i13 = -1866460502;
                    i14 = iM2569;
                    i21 = iM6983 ^ i13;
                    i20 = i12;
                    iM2569 = i14;
                    break;
                case -1603039235:
                case -745296729:
                    C3432.m10477();
                    if (!RunnableC3474.m10630()) {
                        iM2569 = iM2569;
                        z = z;
                        editText = editText;
                        i22 = i22;
                        int iM69810 = C2105.m6981("᩶᩻") ^ i19;
                        i = ((iM69810 ^ i18) * (-14789)) ^ 1099177338;
                        i4 = iM69810 ^ 1461776138;
                        z = z;
                        int i2110 = i22;
                        editText = editText;
                        i20 = i;
                        i22 = i2110;
                        int i2111 = iM2569;
                        i21 = i4;
                        iM2569 = i2111;
                    } else {
                        iM2569 = iM2569;
                        iM6983 = (C2105.m6981("ܶܳ") + i18) * (-103);
                        i12 = ((iM6983 ^ i19) * (-23829)) ^ (-1433045597);
                        i13 = 1324824739;
                        i14 = iM2569;
                        i21 = iM6983 ^ i13;
                        i20 = i12;
                        iM2569 = i14;
                    }
                    break;
                case -1602641282:
                case -747483040:
                    C21923.m49329();
                    if (C11340.f33930 < 0) {
                        iM2569 = iM2569;
                        iM6983 = C2105.m6981("ۨ᩷") ^ i19;
                        i12 = ((iM6983 ^ i18) * (-16043)) ^ 704208994;
                        i13 = 341448639;
                        i14 = iM2569;
                        i21 = iM6983 ^ i13;
                        i20 = i12;
                        iM2569 = i14;
                    } else {
                        iM6981 = (C0630.m2566("ۨۤ") ^ i19) * (-69);
                        i5 = ((iM6981 ^ i18) * (-15013)) ^ 199339155;
                        i6 = 2004771818;
                        i21 = iM6981 ^ i6;
                        i20 = i5;
                    }
                    break;
                case -1576566391:
                case 581693928:
                    iM2569 = iM2569;
                    editText = editText;
                    textView = (TextView) viewM12813;
                    i22 = i22;
                    z = z;
                    String strM10568 = ServiceConnectionC3453.m10568(f21694, 266, 1, i23);
                    if (C3245.f10203 <= 0) {
                        int iM69811 = C2105.m6981("۫۫") ^ i18;
                        i = ((iM69811 ^ i19) * (-14311)) ^ (-926397374);
                        i4 = iM69811 ^ (-2006832318);
                        z = z;
                        sb = null;
                        int i2112 = i22;
                        editText = editText;
                        i20 = i;
                        i22 = i2112;
                        int i2113 = iM2569;
                        i21 = i4;
                        iM2569 = i2113;
                    } else {
                        StringBuilder sb4 = new StringBuilder(strM10568);
                        iM6987 = C2105.m6981(C3432.m10488(f21694, 267, 3, i23));
                        i24 = 2127205592;
                        if (C0422.f1886 <= 0) {
                            sb = sb4;
                            int iM69812 = C2105.m6981("᩶᩻") ^ i19;
                            i = ((iM69812 ^ i18) * (-14789)) ^ 1099177338;
                            i4 = iM69812 ^ 1461776138;
                            z = z;
                            int i2114 = i22;
                            editText = editText;
                            i20 = i;
                            i22 = i2114;
                            int i2115 = iM2569;
                            i21 = i4;
                            iM2569 = i2115;
                        } else {
                            int iM69813 = (C2105.m6981("᩵ۤ") ^ i18) * (-63);
                            int i34 = ((iM69813 ^ i19) * 15405) ^ (-1031114900);
                            sb = sb4;
                            iM2569 = iM2569;
                            i21 = iM69813 ^ 606104081;
                            i22 = i22;
                            editText = editText;
                            i20 = i34;
                            z = z;
                        }
                    }
                    break;
                case -1554396379:
                case -795146234:
                    editText = editText;
                    upperCase = C4159.m12570(C0050.m947(C4117.m12350(editText))).toUpperCase(Locale.ROOT);
                    str = upperCase;
                    iM2566 = (i19 - C0630.m2566("ᩳᩴ")) * 13;
                    i = ((iM2566 ^ i18) * 2819) ^ (-512341291);
                    i2 = 570664671;
                    i4 = iM2566 ^ i2;
                    sb = sb;
                    z = z;
                    int i2116 = i22;
                    editText = editText;
                    i20 = i;
                    i22 = i2116;
                    int i2117 = iM2569;
                    i21 = i4;
                    iM2569 = i2117;
                    break;
                case -1533222531:
                case 339791680:
                    WindowManager.LayoutParams attributes = C7106.m19115(this).getAttributes();
                    attributes.alpha = 0.7f;
                    iM2569 = iM2569;
                    C1916.m6300(this).addFlags(2);
                    C7106.m19115(this).setAttributes(attributes);
                    if (C3537.f11231 >= 0) {
                        iM6983 = C2105.m6981("ۨ᩷") ^ i19;
                        i12 = ((iM6983 ^ i18) * (-16043)) ^ 704208994;
                        i13 = 341448639;
                    } else {
                        iM6983 = C2105.m6981("ܺ᩻") ^ i18;
                        i12 = ((iM6983 ^ i19) * (-19487)) ^ (-541302634);
                        i13 = 746760695;
                    }
                    i14 = iM2569;
                    i21 = iM6983 ^ i13;
                    i20 = i12;
                    iM2569 = i14;
                    break;
                case -1532710915:
                case -606988279:
                    iM2569 = iM2569;
                    z = z;
                    editText = editText;
                    sb = sb;
                    i22 = i22;
                    if (this.f21695.f53846) {
                        iM2566 = (i19 - C2105.m6981("ۛۡ")) * (-51);
                        i = ((iM2566 ^ i18) * 32349) ^ 1171229545;
                        i2 = 1009833524;
                    } else {
                        iM2566 = C0630.m2566("᩺ܰ") ^ i18;
                        i = ((iM2566 ^ i19) * (-23771)) ^ (-1055611161);
                        i2 = 732770140;
                    }
                    i4 = iM2566 ^ i2;
                    sb = sb;
                    z = z;
                    int i2118 = i22;
                    editText = editText;
                    i20 = i;
                    i22 = i2118;
                    int i2119 = iM2569;
                    i21 = i4;
                    iM2569 = i2119;
                    break;
                case -1463608092:
                case 1669632093:
                    i23 = 57223;
                    iM2566 = (i19 - C2105.m6981("ۗۖ")) * 87;
                    i = ((iM2566 ^ i18) * 613) ^ (-745249470);
                    i2 = 214845770;
                    i4 = iM2566 ^ i2;
                    sb = sb;
                    z = z;
                    int i21110 = i22;
                    editText = editText;
                    i20 = i;
                    i22 = i21110;
                    int i21111 = iM2569;
                    i21 = i4;
                    iM2569 = i21111;
                    break;
                case -1341200281:
                case -1218364787:
                    iM2569 = iM2569;
                    if (C0483.m2123(itM9029)) {
                        iM6983 = C0630.m2566("ܿ᩵") ^ i18;
                        i12 = ((iM6983 ^ i19) * (-3693)) ^ (-1050484702);
                        i13 = -1054467678;
                    } else {
                        iM6983 = (C2105.m6981("֨ۤ") + i19) * (-121);
                        i12 = ((iM6983 ^ i18) * (-17277)) ^ 1010291783;
                        i13 = -462357182;
                    }
                    i14 = iM2569;
                    i21 = iM6983 ^ i13;
                    i20 = i12;
                    iM2569 = i14;
                    break;
                case -1336482402:
                case 1641727922:
                    C4159.m12564(C1005.m3507(viewM10739, iM6986), onClickListener);
                    iM6983 = C2105.m6981("ۢ֡") ^ i18;
                    i12 = ((iM6983 ^ i19) * 31881) ^ (-37375656);
                    i13 = -1866460502;
                    i14 = iM2569;
                    i21 = iM6983 ^ i13;
                    i20 = i12;
                    iM2569 = i14;
                    break;
                case -1315716807:
                case 623268008:
                    iM2569 = iM2569;
                    C4159.m12564(C1005.m3507(viewM10739, iM6985), onClickListener);
                    viewM3507 = C1005.m3507(viewM10739, C2105.m6981(C3683.m11225(f21694, 276, 3, i23)) ^ 2122085978);
                    if (C2272.f7362) {
                        iM6983 = (C2105.m6981("ܶܳ") + i18) * (-103);
                        i12 = ((iM6983 ^ i19) * (-23829)) ^ (-1433045597);
                        i13 = 1324824739;
                    } else {
                        iM6983 = (i18 - C2105.m6981("ۨ۬")) * 35;
                        i12 = ((iM6983 ^ i19) * (-18993)) ^ (-1293013286);
                        i13 = -1338608549;
                    }
                    i14 = iM2569;
                    i21 = iM6983 ^ i13;
                    i20 = i12;
                    iM2569 = i14;
                    break;
                case -1258624621:
                case 951771766:
                    StringBuilder sb5 = sb;
                    C1420.m4905(sb5, C0050.m946(this, iM6987 ^ i24));
                    String strM947 = C0050.m947(sb5);
                    TextView textView2 = textView;
                    RunnableC1937.m6377(textView2, strM947);
                    C1128.m3853(textView2, i22);
                    C0798.m3010(editText);
                    break;
                case -1136730358:
                case 719019994:
                    C0798.m2998();
                    if (C0237.f1507 != 0) {
                        iM6981 = C2105.m6981("ܿۘ") ^ i19;
                        i5 = ((iM6981 ^ i18) * 29999) ^ 1050958904;
                        i6 = 1989682378;
                    } else {
                        iM6981 = (C0630.m2566("ۨۤ") ^ i19) * (-69);
                        i5 = ((iM6981 ^ i18) * (-15013)) ^ 199339155;
                        i6 = 2004771818;
                    }
                    i21 = iM6981 ^ i6;
                    i20 = i5;
                    break;
                case -1079033270:
                case 1536120537:
                    iM2569 = iM2569;
                    editText = editText;
                    RunnableC1937.m6377(editText, str);
                    i22 = i22;
                    z = z;
                    sb = sb;
                    iM2566 = C0630.m2566("᩺ܰ") ^ i18;
                    i = ((iM2566 ^ i19) * (-23771)) ^ (-1055611161);
                    i2 = 732770140;
                    i4 = iM2566 ^ i2;
                    sb = sb;
                    z = z;
                    int i21112 = i22;
                    editText = editText;
                    i20 = i;
                    i22 = i21112;
                    int i21113 = iM2569;
                    i21 = i4;
                    iM2569 = i21113;
                    break;
                case -985411161:
                case 1107043352:
                    C3683.m11220(C7811.m20837(f21694, 282, 6, i23));
                    break;
                case -949886012:
                case -273814447:
                    i23 = 49409;
                    iM2566 = (i19 - C2105.m6981("ۗۖ")) * 87;
                    i = ((iM2566 ^ i18) * 613) ^ (-745249470);
                    i2 = 214845770;
                    i4 = iM2566 ^ i2;
                    sb = sb;
                    z = z;
                    int i21114 = i22;
                    editText = editText;
                    i20 = i;
                    i22 = i21114;
                    int i21115 = iM2569;
                    i21 = i4;
                    iM2569 = i21115;
                    break;
                case -892631191:
                case -293232760:
                    c14802 = null;
                    c14803 = c14802;
                    iM6983 = C0630.m2566("ۙۨ") ^ i18;
                    i12 = ((iM6983 ^ i19) * 24651) ^ 111311333;
                    i13 = -1577212971;
                    i14 = iM2569;
                    i21 = iM6983 ^ i13;
                    i20 = i12;
                    iM2569 = i14;
                    break;
                case -877465200:
                case 326290531:
                    iM2569 = iM2569;
                    z = z;
                    editText = editText;
                    sb = sb;
                    i22 = i22;
                    s = f21694[236];
                    i15 = s * s;
                    i16 = 214241769;
                    if (C4117.f13076 <= 0) {
                        iM2566 = C0630.m2566("ۜۗ") ^ i18;
                        i = ((iM2566 ^ i19) * 8669) ^ (-586300421);
                        i2 = -1475950593;
                    } else {
                        iM2566 = C2105.m6981("ᩳ᩹") ^ i18;
                        i = ((iM2566 ^ i19) * (-16997)) ^ (-462267043);
                        i2 = -1081482535;
                    }
                    i4 = iM2566 ^ i2;
                    sb = sb;
                    z = z;
                    int i21116 = i22;
                    editText = editText;
                    i20 = i;
                    i22 = i21116;
                    int i21117 = iM2569;
                    i21 = i4;
                    iM2569 = i21117;
                    break;
                case -823624254:
                case -176501860:
                    iM2569 = iM2569;
                    c11077 = (C11077) RunnableC1108.m3791(itM9029);
                    if (!c11077.m27476()) {
                        int iM25611 = C0630.m2566("᩷֨") ^ i18;
                        int i35 = ((iM25611 ^ i19) * (-10529)) ^ 1653961831;
                        i9 = iM25611 ^ (-2075002018);
                        editText = editText;
                        i20 = i35;
                        i14 = iM2569;
                        i21 = i9;
                        iM2569 = i14;
                    } else {
                        iM6983 = (C2105.m6981("֫᩺") ^ i19) * (-39);
                        i12 = ((iM6983 ^ i18) * 2639) ^ (-1518408404);
                        i13 = -468489573;
                        i14 = iM2569;
                        i21 = iM6983 ^ i13;
                        i20 = i12;
                        iM2569 = i14;
                    }
                    break;
                case -738793024:
                case 134477637:
                    iM2569 = iM2569;
                    z = z;
                    editText = editText;
                    sb = sb;
                    i22 = i22;
                    if (str.contentEquals(C2958.m9028(editText))) {
                        iM2566 = C0630.m2566("᩺ܰ") ^ i18;
                        i = ((iM2566 ^ i19) * (-23771)) ^ (-1055611161);
                        i2 = 732770140;
                    } else {
                        iM2566 = C0630.m2566("ۙ᩵") ^ i19;
                        i = ((iM2566 ^ i18) * 7751) ^ (-1194970079);
                        i2 = -898865329;
                    }
                    i4 = iM2566 ^ i2;
                    sb = sb;
                    z = z;
                    int i21118 = i22;
                    editText = editText;
                    i20 = i;
                    i22 = i21118;
                    int i21119 = iM2569;
                    i21 = i4;
                    iM2569 = i21119;
                    break;
                case -625896264:
                case 1377423221:
                    if (!C0630.m2564()) {
                        iM2569 = iM2569;
                        z = z;
                        editText = editText;
                        sb = sb;
                        i22 = i22;
                        iM2566 = C0630.m2566("ۜۗ") ^ i18;
                        i = ((iM2566 ^ i19) * 8669) ^ (-586300421);
                        i2 = -1475950593;
                        i4 = iM2566 ^ i2;
                        sb = sb;
                        z = z;
                        int i211110 = i22;
                        editText = editText;
                        i20 = i;
                        i22 = i211110;
                        int i211111 = iM2569;
                        i21 = i4;
                        iM2569 = i211111;
                    } else {
                        iM6981 = C2105.m6981("ܿۘ") ^ i19;
                        i5 = ((iM6981 ^ i18) * 29999) ^ 1050958904;
                        i6 = 1989682378;
                        i21 = iM6981 ^ i6;
                        i20 = i5;
                    }
                    break;
                case -411362151:
                case 416164916:
                    break;
                case -247168277:
                case 417233502:
                    popupWindow.setWidth(-1);
                    popupWindow.setHeight(-2);
                    popupWindow.setFocusable(z);
                    popupWindow.setBackgroundDrawable(new ColorDrawable(i22));
                    if (!C2126.f7087) {
                        iM6981 = C2105.m6981("ܺ۠") ^ i19;
                        i5 = ((iM6981 ^ i18) * 24139) ^ 1468735959;
                        i6 = 1714105647;
                        i21 = iM6981 ^ i6;
                        i20 = i5;
                    } else {
                        iM2569 = iM2569;
                        iM6983 = (C2105.m6981("ܽ֡") + i18) * (-29);
                        i12 = ((iM6983 ^ i19) * (-16383)) ^ (-1456786316);
                        i13 = -1025055581;
                        i14 = iM2569;
                        i21 = iM6983 ^ i13;
                        i20 = i12;
                        iM2569 = i14;
                    }
                    break;
                case -197338630:
                case 173552228:
                    iM2569 = iM2569;
                    i25 = c14803.f45192;
                    popupWindow = new PopupWindow(this);
                    viewM10739 = C3537.m10739(this, C2105.m6981(C11340.m28025(f21694, BottomAppBarTopEdgeTreatment.ANGLE_UP, 3, i23)) ^ 2123332998);
                    if (C7106.f21815 != 0) {
                        iM6983 = C2105.m6981("ۨ᩷") ^ i19;
                        i12 = ((iM6983 ^ i18) * (-16043)) ^ 704208994;
                        i13 = 341448639;
                    } else {
                        iM6983 = C2105.m6981("᩵᩵") ^ i18;
                        i12 = ((iM6983 ^ i19) * (-27041)) ^ (-2003965914);
                        i13 = -1585050349;
                    }
                    i14 = iM2569;
                    i21 = iM6983 ^ i13;
                    i20 = i12;
                    iM2569 = i14;
                    break;
                case -137882397:
                case 393125880:
                    popupWindow.setOutsideTouchable(z);
                    popupWindow.setContentView(viewM10739);
                    iM2569 = 2130292905 ^ C0630.m2566(C0798.m3005(f21694, 288, 3, i23));
                    if (C0964.f3626 != 0) {
                        iM6981 = (C0630.m2566("ۨۤ") ^ i19) * (-69);
                        i5 = ((iM6981 ^ i18) * (-15013)) ^ 199339155;
                        i6 = 2004771818;
                    } else {
                        iM6981 = C0630.m2566("ᩳۘ") ^ i18;
                        i5 = ((iM6981 ^ i19) * (-3099)) ^ (-1361663630);
                        i6 = 1808482524;
                    }
                    i21 = iM6981 ^ i6;
                    i20 = i5;
                    break;
                case 162934376:
                case 1248132330:
                    iM2569 = iM2569;
                    z = z;
                    editText = editText;
                    sb = sb;
                    i22 = 0;
                    if (C7106.m19121(str)) {
                        iM2568 = (i18 - C0630.m2566("᩵ᩳ")) * (-65);
                        i10 = ((iM2568 ^ i19) * 14051) ^ (-82962976);
                        i11 = 1856150271;
                    } else {
                        iM2568 = C0630.m2566("᩹֡") ^ i19;
                        i10 = ((iM2568 ^ i18) * 7417) ^ (-136427166);
                        i11 = -482140167;
                    }
                    i9 = iM2568 ^ i11;
                    editText = editText;
                    i20 = i10;
                    sb = sb;
                    z = z;
                    i14 = iM2569;
                    i21 = i9;
                    iM2569 = i14;
                    break;
                case 434156102:
                case 696237416:
                    C3019.m9255();
                    if (RunnableC0588.m2441() < 0) {
                        iM6981 = (i19 - C2105.m6981("ۘܺ")) * 67;
                        i5 = ((iM6981 ^ i18) * 21779) ^ 470485884;
                        i6 = -1207789834;
                        i21 = iM6981 ^ i6;
                        i20 = i5;
                    } else {
                        iM2569 = iM2569;
                        z = z;
                        editText = editText;
                        i22 = i22;
                        int iM69814 = C2105.m6981("᩶᩻") ^ i19;
                        i = ((iM69814 ^ i18) * (-14789)) ^ 1099177338;
                        i4 = iM69814 ^ 1461776138;
                        z = z;
                        int i211112 = i22;
                        editText = editText;
                        i20 = i;
                        i22 = i211112;
                        int i211113 = iM2569;
                        i21 = i4;
                        iM2569 = i211113;
                    }
                    break;
                case 1514137920:
                case 1603556145:
                    popupWindow.setAnimationStyle(iM2569);
                    popupWindow.showAtLocation(C7106.m19115(this).getDecorView(), 81, i22, i22);
                    popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.ۚܶ᩷
                        @Override // android.widget.PopupWindow.OnDismissListener
                        public final void onDismiss() {
                            ViewOnClickListenerC7042 viewOnClickListenerC7042 = null;
                            Window windowM6300 = null;
                            WindowManager.LayoutParams attributes2 = null;
                            float f = 0.0f;
                            Window windowM6301 = null;
                            int i36 = 0;
                            int i37 = 1344291589;
                            int i38 = C2958.f9394;
                            int i39 = C11340.f33930;
                            int iM69815 = (i38 - C2105.m6981("ᩴ᩹")) * (-111);
                            int i40 = ((iM69815 ^ i39) * 29999) ^ (-1104464808);
                            int i41 = 603812881;
                            while (true) {
                                i37 = ((((i37 ^ i39) * (-24433)) >> 31) & i40) ^ (iM69815 ^ i41);
                                switch (i37) {
                                    case -2123464279:
                                    case 2099294502:
                                        C0422.m1963();
                                        if (C0483.f2088 < 0) {
                                            iM69815 = (C0630.m2566("ۖ᩸") ^ i39) * (-5);
                                            i40 = ((iM69815 ^ i38) * 28469) ^ (-1617144958);
                                            i41 = -983497112;
                                        } else {
                                            iM69815 = C2105.m6981("ᩳۢ") ^ i38;
                                            i40 = ((iM69815 ^ i39) * (-19563)) ^ (-799987686);
                                            i41 = -1523835817;
                                        }
                                        break;
                                    case -2114313982:
                                    case -2037760221:
                                        if (C3432.f10845 >= 0) {
                                            iM69815 = (C0630.m2566("ۖ᩸") ^ i39) * (-5);
                                            i40 = ((iM69815 ^ i38) * 28469) ^ (-1617144958);
                                            i41 = -983497112;
                                        } else {
                                            iM69815 = (C0630.m2566("۫ۢ") ^ i38) * 37;
                                            i40 = ((iM69815 ^ i39) * (-9201)) ^ (-1806179385);
                                            i41 = 1351042468;
                                        }
                                        break;
                                    case -1885515133:
                                    case -1080368855:
                                        C21923.m49329();
                                        break;
                                    case -1829976177:
                                    case -231215347:
                                        if (C4117.f13076 <= 0) {
                                            iM69815 = (C0630.m2566("ۖ᩸") ^ i39) * (-5);
                                            i40 = ((iM69815 ^ i38) * 28469) ^ (-1617144958);
                                            i41 = -983497112;
                                        } else {
                                            iM69815 = (C0630.m2566("᩵᩺") + i38) * 55;
                                            i40 = ((iM69815 ^ i39) * 3143) ^ 1824006601;
                                            i41 = 767091911;
                                        }
                                        break;
                                    case -1800458205:
                                    case 1658556905:
                                        int i42 = ViewOnClickListenerC7042.f21692;
                                        if (C3911.f12484 >= 0) {
                                            iM69815 = C0630.m2566("ܶᩴ") ^ i39;
                                            i40 = ((iM69815 ^ i38) * (-12693)) ^ 226919981;
                                            i41 = 1538755649;
                                        } else {
                                            iM69815 = (i39 - C0630.m2566("ܰܶ")) * 83;
                                            i40 = ((iM69815 ^ i38) * 6245) ^ 1446609030;
                                            i41 = -1201068800;
                                        }
                                        break;
                                    case -1596437974:
                                    case -76210431:
                                        windowM6300 = C1916.m6300(viewOnClickListenerC7042);
                                        if (C0237.f1507 != 0) {
                                            iM69815 = (C2105.m6981("ܰ᩹") ^ i38) * 65;
                                            i40 = ((iM69815 ^ i39) * (-17957)) ^ 349690647;
                                            i41 = -817004177;
                                        } else {
                                            iM69815 = (C0630.m2566("᩷ۨ") ^ i38) * (-121);
                                            i40 = ((iM69815 ^ i39) * 12365) ^ (-246873513);
                                            i41 = -2131148638;
                                        }
                                        break;
                                    case -1576728120:
                                    case 543376449:
                                        attributes2 = windowM6300.getAttributes();
                                        f = 1.0f;
                                        if (C1916.f6442) {
                                            iM69815 = C0630.m2566("ܳܽ") ^ i39;
                                            i40 = ((iM69815 ^ i38) * (-19687)) ^ (-1332566151);
                                            i41 = -2060806859;
                                        } else {
                                            iM69815 = C0630.m2566("ܽܺ") ^ i38;
                                            i40 = ((iM69815 ^ i39) * 21023) ^ 1680754693;
                                            i41 = 1951186083;
                                        }
                                        break;
                                    case -637639199:
                                    case 508237634:
                                        if (C0422.f1886 > 0) {
                                            iM69815 = C2105.m6981("ᩳۢ") ^ i38;
                                            i40 = ((iM69815 ^ i39) * (-19563)) ^ (-799987686);
                                            i41 = -1523835817;
                                        } else {
                                            iM69815 = C0630.m2566("ܶᩴ") ^ i39;
                                            i40 = ((iM69815 ^ i38) * (-12693)) ^ 226919981;
                                            i41 = 1538755649;
                                        }
                                        break;
                                    case -540041257:
                                    case 1569784090:
                                        i36 = 2;
                                        if (C1773.f6144 <= 0) {
                                            iM69815 = C0630.m2566("ܽܺ") ^ i38;
                                            i40 = ((iM69815 ^ i39) * 21023) ^ 1680754693;
                                            i41 = 1951186083;
                                        } else {
                                            iM69815 = C0630.m2566("ۚ᩸") ^ i38;
                                            i40 = ((iM69815 ^ i39) * 14513) ^ (-2033375511);
                                            i41 = 913919862;
                                        }
                                        break;
                                    case -219768271:
                                    case 268318960:
                                        C0382.m1848();
                                        C0798.m2998();
                                        iM69815 = C0630.m2566("ܶᩴ") ^ i39;
                                        i40 = ((iM69815 ^ i38) * (-12693)) ^ 226919981;
                                        i41 = 1538755649;
                                        break;
                                    case 521227623:
                                    case 1030511460:
                                        viewOnClickListenerC7042 = this.f16943;
                                        if (C2520.f8000 >= 0) {
                                            iM69815 = C0630.m2566("ܶᩴ") ^ i39;
                                            i40 = ((iM69815 ^ i38) * (-12693)) ^ 226919981;
                                            i41 = 1538755649;
                                        } else {
                                            iM69815 = C0630.m2566("ܰۨ") ^ i39;
                                            i40 = ((iM69815 ^ i38) * 23917) ^ 1520202300;
                                            i41 = 794811781;
                                        }
                                        break;
                                    case 685988803:
                                    case 1358976099:
                                        attributes2.alpha = f;
                                        windowM6301 = C1916.m6300(viewOnClickListenerC7042);
                                        if (C1294.m4372() <= 0) {
                                            iM69815 = C0630.m2566("ܽܺ") ^ i38;
                                            i40 = ((iM69815 ^ i39) * 21023) ^ 1680754693;
                                            i41 = 1951186083;
                                        } else {
                                            iM69815 = C0630.m2566("۬᩺") ^ i39;
                                            i40 = ((iM69815 ^ i38) * 16825) ^ 1750701808;
                                            i41 = 199576037;
                                        }
                                        break;
                                    case 695252813:
                                    case 1896415618:
                                        if (C0422.f1886 <= 0) {
                                            iM69815 = C0630.m2566("ܽܺ") ^ i38;
                                            i40 = ((iM69815 ^ i39) * 21023) ^ 1680754693;
                                            i41 = 1951186083;
                                        } else {
                                            iM69815 = (i38 - C2105.m6981("ܳ᩻")) * 63;
                                            i40 = ((iM69815 ^ i39) * (-20837)) ^ 519762666;
                                            i41 = 689188825;
                                        }
                                        break;
                                    case 817704225:
                                    case 1343093775:
                                        if (!C2126.f7087) {
                                            iM69815 = (C2105.m6981("ܰ᩹") ^ i38) * 65;
                                            i40 = ((iM69815 ^ i39) * (-17957)) ^ 349690647;
                                            i41 = -817004177;
                                        } else {
                                            iM69815 = C0630.m2566("ܶᩴ") ^ i39;
                                            i40 = ((iM69815 ^ i38) * (-12693)) ^ 226919981;
                                            i41 = 1538755649;
                                        }
                                        break;
                                    case 1286787997:
                                    case 2051175688:
                                        if (C3432.f10845 >= 0) {
                                            iM69815 = C0630.m2566("ܽܺ") ^ i38;
                                            i40 = ((iM69815 ^ i39) * 21023) ^ 1680754693;
                                            i41 = 1951186083;
                                        } else {
                                            iM69815 = C2105.m6981("᩻۫") ^ i39;
                                            i40 = ((iM69815 ^ i38) * 13839) ^ 190167991;
                                            i41 = 639562721;
                                        }
                                        break;
                                    default:
                                        windowM6301.clearFlags(i36);
                                        C1916.m6300(viewOnClickListenerC7042).setAttributes(attributes2);
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    break;
                case 1602713603:
                case 1923349147:
                    iM2569 = iM2569;
                    z = z;
                    editText = editText;
                    sb = sb;
                    i22 = i22;
                    if (!str.matches(C5695.m16034(f21694, 240, 23, i23))) {
                        iM2566 = (C0630.m2566("ܿ᩷") + i18) * (-37);
                        i = ((iM2566 ^ i19) * (-18463)) ^ (-2060905263);
                        i2 = -76521138;
                        i4 = iM2566 ^ i2;
                        sb = sb;
                        z = z;
                        int i211114 = i22;
                        editText = editText;
                        i20 = i;
                        i22 = i211114;
                        int i211115 = iM2569;
                        i21 = i4;
                        iM2569 = i211115;
                    } else {
                        i22 = i22;
                        iM2568 = (i18 - C0630.m2566("᩵ᩳ")) * (-65);
                        i10 = ((iM2568 ^ i19) * 14051) ^ (-82962976);
                        i11 = 1856150271;
                        i9 = iM2568 ^ i11;
                        editText = editText;
                        i20 = i10;
                        sb = sb;
                        z = z;
                        i14 = iM2569;
                        i21 = i9;
                        iM2569 = i14;
                    }
                    break;
                default:
                    C0483.m2121();
                    break;
            }
            return;
        }
    }

    static {
        int i = 0;
        int[] iArr = null;
        int i2 = -693102926;
        int i3 = C4616.f14690;
        int i4 = C11340.f33930;
        int iM2566 = C0630.m2566("ܶ᩶") ^ i3;
        int i5 = ((iM2566 ^ i4) * (-15411)) ^ 838407631;
        int i6 = -1544986423;
        while (true) {
            i2 = ((((i2 ^ i4) * 13525) >> 31) & i5) ^ (iM2566 ^ i6);
            switch (i2) {
                case -1954149709:
                case -1171226194:
                    if (C4263.f13799 <= 0) {
                        iM2566 = (C0630.m2566("᩻ܺ") ^ i4) * (-31);
                        i5 = ((iM2566 ^ i3) * 18885) ^ (-1603494133);
                        i6 = 1539592346;
                    } else {
                        iM2566 = C0630.m2566("ᩴ֨") ^ i4;
                        i5 = ((iM2566 ^ i3) * 14005) ^ 126788045;
                        i6 = -1977874438;
                    }
                    break;
                case -1862775359:
                case -1419544011:
                    if (C0050.m940() > 0) {
                        iM2566 = (C0630.m2566("ۢۘ") ^ i4) * (-109);
                        i5 = ((iM2566 ^ i3) * 11005) ^ (-939986402);
                        i6 = -1244578088;
                    } else {
                        iM2566 = (i3 - C0630.m2566("֨ᩴ")) * 33;
                        i5 = ((iM2566 ^ i4) * (-31735)) ^ (-2008773705);
                        i6 = 215230106;
                    }
                    break;
                case -1544208975:
                case -208448103:
                    if (C1916.f6442) {
                        iM2566 = (C0630.m2566("᩸᩸") + i3) * (-31);
                        i5 = ((iM2566 ^ i4) * 21635) ^ 269004265;
                        i6 = -983597197;
                    } else {
                        iM2566 = (i3 - C0630.m2566("֨ᩴ")) * 33;
                        i5 = ((iM2566 ^ i4) * (-31735)) ^ (-2008773705);
                        i6 = 215230106;
                    }
                    break;
                case -1527114410:
                case 1482874629:
                    if (AbstractC2021.m6574()) {
                        iM2566 = C0630.m2566("۬ۡ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-23741)) ^ (-2043894785);
                        i6 = 160882884;
                    } else {
                        iM2566 = (C0630.m2566("ۨۢ") + i4) * (-113);
                        i5 = ((iM2566 ^ i3) * 24431) ^ 1446496606;
                        i6 = -84534885;
                    }
                    break;
                case -1387632611:
                case -75921191:
                    if (C21923.f70183 != 0) {
                        iM2566 = (i3 - C2105.m6981("᩻᩶")) * (-119);
                        i5 = ((iM2566 ^ i4) * (-12331)) ^ 579670335;
                        i6 = 1390135031;
                    } else {
                        iM2566 = C0630.m2566("ۚܿ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-18637)) ^ 210156776;
                        i6 = -1941429348;
                    }
                    break;
                case -1347405398:
                case 1125971810:
                    int[] iArr2 = new int[i];
                    // fill-array-data instruction
                    iArr2[0] = 2131888995;
                    iArr2[1] = 2131889001;
                    iArr2[2] = 2131889002;
                    iArr2[3] = 2131889003;
                    iArr2[4] = 2131889004;
                    iArr2[5] = 2131889005;
                    iArr2[6] = 2131889006;
                    iArr2[7] = 2131889007;
                    iArr2[8] = 2131889008;
                    iArr2[9] = 2131888996;
                    iArr2[10] = 2131888997;
                    iArr2[11] = 2131888998;
                    iArr2[12] = 2131888999;
                    iArr2[13] = 2131889000;
                    iArr2[14] = 2131889009;
                    f21691 = iArr2;
                    return;
                case -962547532:
                case -611820916:
                    f21693 = iArr;
                    if (C7811.f24123 >= 0) {
                        iM2566 = (i3 - C2105.m6981("᩻᩶")) * (-119);
                        i5 = ((iM2566 ^ i4) * (-12331)) ^ 579670335;
                        i6 = 1390135031;
                    } else {
                        iM2566 = C2105.m6981("᩸ܰ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-19395)) ^ (-673131268);
                        i6 = 1705251354;
                    }
                    break;
                case -610022961:
                case 63218837:
                    C4616.m13552();
                    throw new RuntimeException();
                case -357807919:
                case -221669906:
                    if (C3245.f10203 <= 0) {
                        iM2566 = (C0630.m2566("᩻ܺ") ^ i4) * (-31);
                        i5 = ((iM2566 ^ i3) * 18885) ^ (-1603494133);
                        i6 = 1539592346;
                    } else {
                        iM2566 = C2105.m6981("ܶۚ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 28161) ^ (-1773993278);
                        i6 = -672242227;
                    }
                    break;
                case 113245440:
                case 1391369978:
                    RunnableC1108.m3790();
                    if (C4159.f13567) {
                        iM2566 = (i3 - C0630.m2566("֨ᩴ")) * 33;
                        i5 = ((iM2566 ^ i4) * (-31735)) ^ (-2008773705);
                        i6 = 215230106;
                    } else {
                        iM2566 = C2105.m6981("ܶۚ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 28161) ^ (-1773993278);
                        i6 = -672242227;
                    }
                    break;
                case 228338172:
                case 683959675:
                    if (C7106.m19120() <= 0) {
                        iM2566 = (C0630.m2566("᩻ܺ") ^ i4) * (-31);
                        i5 = ((iM2566 ^ i3) * 18885) ^ (-1603494133);
                        i6 = 1539592346;
                    } else {
                        iM2566 = (C2105.m6981("ۗܿ") ^ i3) * 9;
                        i5 = ((iM2566 ^ i4) * (-4951)) ^ (-134340384);
                        i6 = -865371127;
                    }
                    break;
                case 269103870:
                case 476193382:
                    // fill-array-data instruction
                    iArr[0] = 2131231440;
                    iArr[1] = 2131231446;
                    iArr[2] = 2131231447;
                    iArr[3] = 2131231448;
                    iArr[4] = 2131231449;
                    iArr[5] = 2131231450;
                    iArr[6] = 2131231451;
                    iArr[7] = 2131231452;
                    iArr[8] = 2131231453;
                    iArr[9] = 2131231441;
                    iArr[10] = 2131231442;
                    iArr[11] = 2131231443;
                    iArr[12] = 2131231444;
                    iArr[13] = 2131231445;
                    iArr[14] = 2131231454;
                    if (C2958.f9394 >= 0) {
                        iM2566 = (i3 - C0630.m2566("֨ᩴ")) * 33;
                        i5 = ((iM2566 ^ i4) * (-31735)) ^ (-2008773705);
                        i6 = 215230106;
                    } else {
                        iM2566 = C0630.m2566("۠ۛ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 7219) ^ 797598045;
                        i6 = 311053427;
                    }
                    break;
                case 348251737:
                case 528718877:
                    if (C22628.f73083 > 0) {
                        iM2566 = C0630.m2566("۬ۡ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-23741)) ^ (-2043894785);
                        i6 = 160882884;
                    } else {
                        iM2566 = C2105.m6981("ܶۚ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 28161) ^ (-1773993278);
                        i6 = -672242227;
                    }
                    break;
                case 791536497:
                case 1756858965:
                    C1005.m3501();
                    iM2566 = C2105.m6981("ܶۚ") ^ i4;
                    i5 = ((iM2566 ^ i3) * 28161) ^ (-1773993278);
                    i6 = -672242227;
                    break;
                case 803904087:
                case 1580538226:
                    if (C2520.m8026()) {
                        iM2566 = (C0630.m2566("᩻ܺ") ^ i4) * (-31);
                        i5 = ((iM2566 ^ i3) * 18885) ^ (-1603494133);
                        i6 = 1539592346;
                    } else {
                        iM2566 = C0630.m2566("᩻֨") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-25073)) ^ 579894552;
                        i6 = 723832241;
                    }
                    break;
                default:
                    i = 15;
                    iArr = new int[15];
                    if (C11340.f33930 >= 0) {
                        iM2566 = (C0630.m2566("᩻ܺ") ^ i4) * (-31);
                        i5 = ((iM2566 ^ i3) * 18885) ^ (-1603494133);
                        i6 = 1539592346;
                    } else {
                        iM2566 = C2105.m6981("ۘۜ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-13563)) ^ (-424954340);
                        i6 = -1947111975;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x028e A[PHI: r16
      0x028e: PHI (r16v27 int) = (r16v6 int), (r16v7 int), (r16v28 int) binds: [B:66:0x028c, B:62:0x026c, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x02e2 A[PHI: r5 r6 r16
      0x02e2: PHI (r5v3 short[]) = (r5v2 short[]), (r5v4 short[]) binds: [B:74:0x02e0, B:54:0x0217] A[DONT_GENERATE, DONT_INLINE]
      0x02e2: PHI (r6v3 char) = (r6v2 char), (r6v4 char) binds: [B:74:0x02e0, B:54:0x0217] A[DONT_GENERATE, DONT_INLINE]
      0x02e2: PHI (r16v9 int) = (r16v4 int), (r16v10 int) binds: [B:74:0x02e0, B:54:0x0217] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x0317 A[PHI: r4 r10 r11 r12 r16
      0x0317: PHI (r4v4 int) = (r4v2 int), (r4v3 int), (r4v2 int) binds: [B:78:0x0315, B:39:0x016c, B:13:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0317: PHI (r10v4 short[]) = (r10v2 short[]), (r10v3 short[]), (r10v2 short[]) binds: [B:78:0x0315, B:39:0x016c, B:13:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0317: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:78:0x0315, B:39:0x016c, B:13:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0317: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:78:0x0315, B:39:0x016c, B:13:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0317: PHI (r16v21 int) = (r16v3 int), (r16v16 int), (r16v22 int) binds: [B:78:0x0315, B:39:0x016c, B:13:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x034c A[PHI: r7 r8 r16
      0x034c: PHI (r7v4 short) = (r7v2 short), (r7v2 short), (r7v3 short), (r7v2 short) binds: [B:82:0x034a, B:70:0x02c1, B:50:0x01f2, B:10:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x034c: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:82:0x034a, B:70:0x02c1, B:50:0x01f2, B:10:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x034c: PHI (r16v23 int) = (r16v2 int), (r16v5 int), (r16v11 int), (r16v29 int) binds: [B:82:0x034a, B:70:0x02c1, B:50:0x01f2, B:10:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006c, code lost:
    
        if (l.C1504.m5179() == false) goto L13;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m19013(ViewOnClickListenerC7042 viewOnClickListenerC7042, final PopupWindow popupWindow, int i, String str, View view) {
        int iM6981;
        int i2;
        int i3;
        int iM2566;
        int i4;
        int i5;
        final ViewOnClickListenerC7042 viewOnClickListenerC7043 = viewOnClickListenerC7042;
        int i6 = C0630.f2410;
        int i7 = C4075.f12947;
        int iM2567 = (C0630.m2566("ۖۤ") + i6) * 63;
        int i8 = ((iM2567 ^ i7) * 4795) ^ 1974736719;
        short[] sArr = null;
        short[] sArr2 = null;
        int i9 = iM2567 ^ 604365668;
        int iM5737 = 0;
        char c = 0;
        short s = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 2146785721;
        while (true) {
            int i15 = i9 ^ (i8 & (((i14 ^ i7) * (-8945)) >> 31));
            switch (i15) {
                case -1885487901:
                case 939935795:
                    i15 = i15;
                    if (C2126.m7040()) {
                        iM6981 = C2105.m6981("᩹۟") ^ i7;
                        i8 = ((iM6981 ^ i6) * (-14223)) ^ 1855790229;
                        i2 = -1342041423;
                    } else {
                        iM6981 = C2105.m6981("ۧۡ") ^ i7;
                        i8 = ((iM6981 ^ i6) * (-17337)) ^ (-1382508381);
                        i2 = -1722414151;
                    }
                    i14 = i15;
                    i9 = iM6981 ^ i2;
                    viewOnClickListenerC7043 = viewOnClickListenerC7042;
                    break;
                case -1812269817:
                case -253013013:
                    i15 = i15;
                    if (C3746.f11829 <= 0) {
                        iM6981 = C0630.m2566("ۨᩳ") ^ i6;
                        i8 = ((iM6981 ^ i7) * 21323) ^ 177305817;
                        i2 = 829681988;
                    } else {
                        iM6981 = (C0630.m2566("ۜ᩸") + i6) * 119;
                        i8 = ((iM6981 ^ i7) * 13741) ^ 2018422631;
                        i2 = 1680774875;
                    }
                    i14 = i15;
                    i9 = iM6981 ^ i2;
                    viewOnClickListenerC7043 = viewOnClickListenerC7042;
                    break;
                case -1664034632:
                case 1620492457:
                    C22628.m50608(viewOnClickListenerC7043, C23986.m52807(i, ""));
                    break;
                case -1440090218:
                case 1678848092:
                    i15 = i15;
                    s = sArr[c];
                    i10 = (s * s) + 263347984;
                    if (C4159.f13567) {
                        iM6981 = (C2105.m6981("ۖ֫") ^ i6) * 3;
                        i8 = ((iM6981 ^ i7) * 24245) ^ 2064548309;
                        i2 = -76300514;
                    } else {
                        iM6981 = C0630.m2566("᩵ܶ") ^ i7;
                        i8 = ((iM6981 ^ i6) * 31357) ^ (-1140351238);
                        i2 = -214839566;
                    }
                    i14 = i15;
                    i9 = iM6981 ^ i2;
                    viewOnClickListenerC7043 = viewOnClickListenerC7042;
                    break;
                case -1342615574:
                case -506721544:
                    if (C1916.m6313(str)) {
                        iM2566 = (C0630.m2566("ᩴۗ") ^ i7) * (-15);
                        i3 = i15;
                        i4 = ((iM2566 ^ i6) * (-21609)) ^ (-1804134406);
                        i5 = 1648604962;
                    } else {
                        i3 = i15;
                        iM2566 = C2105.m6981("᩶ۖ") ^ i7;
                        i4 = ((iM2566 ^ i6) * 26629) ^ (-296877437);
                        i5 = 426489334;
                    }
                    int i16 = i3;
                    i9 = iM2566 ^ i5;
                    i8 = i4;
                    i14 = i16;
                    break;
                case -1311112781:
                case 1984072795:
                    C11340.m28031();
                    if (C1294.f4556 < 0) {
                        i15 = i15;
                        iM6981 = C2105.m6981("᩹۟") ^ i7;
                        i8 = ((iM6981 ^ i6) * (-14223)) ^ 1855790229;
                        i2 = -1342041423;
                        i14 = i15;
                        i9 = iM6981 ^ i2;
                        viewOnClickListenerC7043 = viewOnClickListenerC7042;
                    }
                    i15 = i15;
                    iM6981 = C2105.m6981("ۗ᩷") ^ i6;
                    i8 = ((iM6981 ^ i7) * 743) ^ 250238974;
                    i2 = -1176761786;
                    i14 = i15;
                    i9 = iM6981 ^ i2;
                    viewOnClickListenerC7043 = viewOnClickListenerC7042;
                    break;
                case -1286629916:
                case 1672993070:
                    C22470.m50418(viewOnClickListenerC7043, iM5737, i, str, new InterfaceC2123(viewOnClickListenerC7043) { // from class: l.֨ܶ᩷

                        /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ ViewOnClickListenerC7042 f4355;

                        {
                            int i17 = -1768590851;
                            int i18 = C1420.f5096;
                            int i19 = C1773.f6144;
                            int iM2568 = C0630.m2566("ᩴᩴ") ^ i18;
                            int i20 = ((iM2568 ^ i19) * 29443) ^ 1718977729;
                            int i21 = -838257219;
                            while (true) {
                                i17 = ((((i17 ^ i19) * (-27455)) >> 31) & i20) ^ (iM2568 ^ i21);
                                switch (i17) {
                                    case -2107662282:
                                    case -49227544:
                                        if (C2520.f8000 >= 0) {
                                            iM2568 = C2105.m6981("ۗܿ") ^ i19;
                                            i20 = ((iM2568 ^ i18) * (-30401)) ^ (-242263680);
                                            i21 = 2065509794;
                                        } else {
                                            iM2568 = (C2105.m6981("ܰܳ") ^ i18) * 55;
                                            i20 = ((iM2568 ^ i19) * 3265) ^ (-1014230566);
                                            i21 = -391501185;
                                        }
                                        break;
                                    case -2014172213:
                                    case -1868955783:
                                        C3911.m11924();
                                        C1504.m5179();
                                        iM2568 = (C2105.m6981("ܰܳ") ^ i18) * 55;
                                        i20 = ((iM2568 ^ i19) * 3265) ^ (-1014230566);
                                        i21 = -391501185;
                                        break;
                                    case -1916755799:
                                    case 970277070:
                                        this.f4355 = viewOnClickListenerC7043;
                                        if (C1420.f5096 <= 0) {
                                            iM2568 = (C2105.m6981("ܰܳ") ^ i18) * 55;
                                            i20 = ((iM2568 ^ i19) * 3265) ^ (-1014230566);
                                            i21 = -391501185;
                                        } else {
                                            iM2568 = C0630.m2566("ᩴ֨") ^ i18;
                                            i20 = ((iM2568 ^ i19) * 12945) ^ 1564200446;
                                            i21 = 555997659;
                                        }
                                        break;
                                    case -1715082284:
                                    case -1277725685:
                                        if (C2958.f9394 >= 0) {
                                            iM2568 = C0630.m2566("۠ۛ") ^ i18;
                                            i20 = ((iM2568 ^ i19) * 6485) ^ 2120491027;
                                            i21 = -1092953977;
                                        } else {
                                            iM2568 = (C0630.m2566("֫ᩴ") ^ i19) * (-103);
                                            i20 = ((iM2568 ^ i18) * (-10071)) ^ 16282429;
                                            i21 = -1901291281;
                                        }
                                        break;
                                    case -1379663943:
                                    case -351403076:
                                        return;
                                    case -1127572475:
                                    case 463765196:
                                        if (C2167.f7158 >= 0) {
                                            iM2568 = (C0630.m2566("ۖۙ") ^ i19) * q.h;
                                            i20 = ((iM2568 ^ i18) * (-14305)) ^ 760477795;
                                            i21 = -1380547856;
                                        } else {
                                            iM2568 = C2105.m6981("᩻ۚ") ^ i18;
                                            i20 = ((iM2568 ^ i19) * 3769) ^ (-1837605341);
                                            i21 = -1999008297;
                                        }
                                        break;
                                    case -1090305624:
                                    case 63363038:
                                        if (C3663.f11553) {
                                            iM2568 = C2105.m6981("ۗܿ") ^ i19;
                                            i20 = ((iM2568 ^ i18) * (-30401)) ^ (-242263680);
                                            i21 = 2065509794;
                                        } else {
                                            iM2568 = (i18 - C2105.m6981("ۤܰ")) * (-67);
                                            i20 = ((iM2568 ^ i19) * (-3405)) ^ 1298303134;
                                            i21 = 515306655;
                                        }
                                        break;
                                    case -702960182:
                                    case 1436587804:
                                        if (C3537.f11231 >= 0) {
                                            iM2568 = (C0630.m2566("ᩳܽ") + i19) * 19;
                                            i20 = ((iM2568 ^ i18) * 25589) ^ 356289334;
                                            i21 = -4619605;
                                        } else {
                                            iM2568 = (C2105.m6981("ܰܳ") ^ i18) * 55;
                                            i20 = ((iM2568 ^ i19) * 3265) ^ (-1014230566);
                                            i21 = -391501185;
                                        }
                                        break;
                                    case -584922280:
                                    case 1279768742:
                                        if (C1294.m4372() <= 0) {
                                            iM2568 = (C0630.m2566("ۖۙ") ^ i19) * q.h;
                                            i20 = ((iM2568 ^ i18) * (-14305)) ^ 760477795;
                                            i21 = -1380547856;
                                        } else {
                                            iM2568 = (i19 - C0630.m2566("֡᩹")) * (-83);
                                            i20 = ((iM2568 ^ i18) * (-1795)) ^ (-11035793);
                                            i21 = 1964612127;
                                        }
                                        break;
                                    case -431675824:
                                    case 1532842225:
                                        if (AbstractC2021.m6574()) {
                                            iM2568 = (C0630.m2566("ᩳܽ") + i19) * 19;
                                            i20 = ((iM2568 ^ i18) * 25589) ^ 356289334;
                                            i21 = -4619605;
                                        } else {
                                            iM2568 = C2105.m6981("᩻۫") ^ i19;
                                            i20 = ((iM2568 ^ i18) * 11203) ^ 1458131551;
                                            i21 = 890905834;
                                        }
                                        break;
                                    case -9466317:
                                    case 1659517947:
                                        if (C3663.f11553) {
                                            iM2568 = C2105.m6981("ۗܿ") ^ i19;
                                            i20 = ((iM2568 ^ i18) * (-30401)) ^ (-242263680);
                                            i21 = 2065509794;
                                        } else {
                                            iM2568 = (C2105.m6981("᩺᩻") + i19) * (-97);
                                            i20 = ((iM2568 ^ i18) * (-5907)) ^ (-305293992);
                                            i21 = -1363542919;
                                        }
                                        break;
                                    case 490751572:
                                    case 1361029649:
                                        if (C0798.m2998() != 0) {
                                            iM2568 = C0630.m2566("۠ۛ") ^ i18;
                                            i20 = ((iM2568 ^ i19) * 6485) ^ 2120491027;
                                            i21 = -1092953977;
                                        } else {
                                            iM2568 = (C0630.m2566("ܺܺ") + i18) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                            i20 = ((iM2568 ^ i19) * (-16499)) ^ 918238604;
                                            i21 = 180149226;
                                        }
                                        break;
                                    case 794787859:
                                    case 1553245495:
                                        if (C21923.f70183 != 0) {
                                            iM2568 = C2105.m6981("ۗܿ") ^ i19;
                                            i20 = ((iM2568 ^ i18) * (-30401)) ^ (-242263680);
                                            i21 = 2065509794;
                                        } else {
                                            iM2568 = (C2105.m6981("ܰܰ") + i19) * (-35);
                                            i20 = ((iM2568 ^ i18) * (-25599)) ^ 759162511;
                                            i21 = -2034471158;
                                        }
                                        break;
                                    case 929509721:
                                    case 2131946001:
                                        RunnableC0588.m2441();
                                        if (RunnableC1937.f6483 < 0) {
                                            iM2568 = C0630.m2566("۠ۛ") ^ i18;
                                            i20 = ((iM2568 ^ i19) * 6485) ^ 2120491027;
                                            i21 = -1092953977;
                                        } else {
                                            iM2568 = (C2105.m6981("ܰܳ") ^ i18) * 55;
                                            i20 = ((iM2568 ^ i19) * 3265) ^ (-1014230566);
                                            i21 = -391501185;
                                        }
                                        break;
                                    case 1048941331:
                                    case 2027491598:
                                        C3663.m11168();
                                        throw new RuntimeException();
                                    default:
                                        if (RunnableC1108.m3790()) {
                                            iM2568 = (C2105.m6981("ܰܳ") ^ i18) * 55;
                                            i20 = ((iM2568 ^ i19) * 3265) ^ (-1014230566);
                                            i21 = -391501185;
                                        } else {
                                            iM2568 = C2105.m6981("ۤ᩶") ^ i18;
                                            i20 = ((iM2568 ^ i19) * (-14131)) ^ (-1171487633);
                                            i21 = -636501934;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // l.InterfaceC2123
                        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                        public final Object mo4049() {
                            PopupWindow popupWindow2 = null;
                            C5242 c5242 = null;
                            Object obj = null;
                            ViewOnClickListenerC7042 viewOnClickListenerC7044 = null;
                            int i17 = 1324649006;
                            int i18 = C11340.f33930;
                            int i19 = RunnableC1937.f6483;
                            int iM6982 = C2105.m6981("۫ۡ") ^ i19;
                            int i20 = ((iM6982 ^ i18) * 3269) ^ 1766271162;
                            int i21 = 1064921767;
                            while (true) {
                                i17 = ((((i17 ^ i18) * (-21633)) >> 31) & i20) ^ (iM6982 ^ i21);
                                switch (i17) {
                                    case -2125763207:
                                    case -202724635:
                                        if (C7811.m20844() != 0) {
                                            iM6982 = (i18 - C0630.m2566("᩷ۛ")) * 23;
                                            i20 = ((iM6982 ^ i19) * 7711) ^ 1766876445;
                                            i21 = 1518121745;
                                        } else {
                                            iM6982 = C0630.m2566("ۜܿ") ^ i19;
                                            i20 = ((iM6982 ^ i18) * (-7347)) ^ 1789365266;
                                            i21 = -1087604509;
                                        }
                                        break;
                                    case -1897325454:
                                    case -240655854:
                                        if (C0964.f3626 != 0) {
                                            iM6982 = (i18 - C0630.m2566("᩷ܽ")) * (-107);
                                            i20 = ((iM6982 ^ i19) * (-4927)) ^ (-278407688);
                                            i21 = -1605295445;
                                        } else {
                                            iM6982 = (C0630.m2566("᩶ܺ") + i19) * 73;
                                            i20 = ((iM6982 ^ i18) * 14377) ^ 365096011;
                                            i21 = 1102126908;
                                        }
                                        break;
                                    case -1528299878:
                                    case 1426292825:
                                        C1711.m5736();
                                        C0382.m1848();
                                        iM6982 = C0630.m2566("ۜܿ") ^ i19;
                                        i20 = ((iM6982 ^ i18) * (-7347)) ^ 1789365266;
                                        i21 = -1087604509;
                                        break;
                                    case -1499935461:
                                    case -615021406:
                                        popupWindow2 = popupWindow;
                                        if (C3537.f11231 >= 0) {
                                            iM6982 = (i18 - C0630.m2566("᩷ܽ")) * (-107);
                                            i20 = ((iM6982 ^ i19) * (-4927)) ^ (-278407688);
                                            i21 = -1605295445;
                                        } else {
                                            iM6982 = C2105.m6981("۬ۙ") ^ i18;
                                            i20 = ((iM6982 ^ i19) * 29329) ^ 458246397;
                                            i21 = -1951477860;
                                        }
                                        break;
                                    case -1459752157:
                                    case 1874678766:
                                        if (C7106.f21815 == 0) {
                                            iM6982 = (i18 - C0630.m2566("᩷ܽ")) * (-107);
                                            i20 = ((iM6982 ^ i19) * (-4927)) ^ (-278407688);
                                            i21 = -1605295445;
                                        } else {
                                            iM6982 = (i18 - C0630.m2566("᩷ۛ")) * 23;
                                            i20 = ((iM6982 ^ i19) * 7711) ^ 1766876445;
                                            i21 = 1518121745;
                                        }
                                        break;
                                    case -1365612325:
                                    case -430577119:
                                        int i22 = ViewOnClickListenerC7042.f21692;
                                        if (C11340.m28031()) {
                                            iM6982 = (C2105.m6981("۟ܶ") + i19) * (-41);
                                            i20 = ((iM6982 ^ i18) * 29379) ^ (-452245350);
                                            i21 = -1522936353;
                                        } else {
                                            iM6982 = (i18 - C0630.m2566("᩷ۛ")) * 23;
                                            i20 = ((iM6982 ^ i19) * 7711) ^ 1766876445;
                                            i21 = 1518121745;
                                        }
                                        break;
                                    case -1175874334:
                                    case -1116297906:
                                        c5242 = C22470.f72770;
                                        obj = null;
                                        if (C4616.f14690 <= 0) {
                                            iM6982 = C0630.m2566("᩸ܿ") ^ i19;
                                            i20 = ((iM6982 ^ i18) * 16841) ^ (-2136248108);
                                            i21 = 958207950;
                                        } else {
                                            iM6982 = (C0630.m2566("֡۠") ^ i19) * (-69);
                                            i20 = ((iM6982 ^ i18) * (-21011)) ^ (-265994914);
                                            i21 = 2028843875;
                                        }
                                        break;
                                    case -715522796:
                                    case 519629093:
                                        c5242.mo1669(obj);
                                        if (C1916.f6442) {
                                            iM6982 = (C2105.m6981("ۢ۬") + i19) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i20 = ((iM6982 ^ i18) * 26801) ^ 1492718401;
                                            i21 = 1705777797;
                                        } else {
                                            iM6982 = (C0630.m2566("ۛ۠") ^ i19) * 41;
                                            i20 = ((iM6982 ^ i18) * 29411) ^ (-1831573599);
                                            i21 = -1514554857;
                                        }
                                        break;
                                    case -119403856:
                                    case 520755552:
                                        if (C3746.f11829 > 0) {
                                            iM6982 = C0630.m2566("᩸ܿ") ^ i19;
                                            i20 = ((iM6982 ^ i18) * 16841) ^ (-2136248108);
                                            i21 = 958207950;
                                        } else {
                                            iM6982 = (i18 - C0630.m2566("᩷ۛ")) * 23;
                                            i20 = ((iM6982 ^ i19) * 7711) ^ 1766876445;
                                            i21 = 1518121745;
                                        }
                                        break;
                                    case 124004520:
                                    case 2129644819:
                                        if (ServiceConnectionC3453.f10921 >= 0) {
                                            iM6982 = C0630.m2566("ۜܿ") ^ i19;
                                            i20 = ((iM6982 ^ i18) * (-7347)) ^ 1789365266;
                                            i21 = -1087604509;
                                        } else {
                                            iM6982 = C2105.m6981("۬ܶ") ^ i18;
                                            i20 = ((iM6982 ^ i19) * 5743) ^ (-197743612);
                                            i21 = 1522787972;
                                        }
                                        break;
                                    case 140098212:
                                    case 628430304:
                                        if (C5695.f17556 < 0) {
                                            int i23 = 1;
                                            if (!C2126.f7087) {
                                                C2272.m7508(c5242, viewOnClickListenerC7044, new C16045(i23, viewOnClickListenerC7044));
                                                return C8058.f24861;
                                            }
                                            iM6982 = (i18 - C0630.m2566("᩷ۛ")) * 23;
                                            i20 = ((iM6982 ^ i19) * 7711) ^ 1766876445;
                                            i21 = 1518121745;
                                        } else {
                                            iM6982 = C0630.m2566("ۜܿ") ^ i19;
                                            i20 = ((iM6982 ^ i18) * (-7347)) ^ 1789365266;
                                            i21 = -1087604509;
                                        }
                                        break;
                                    case 785349674:
                                    case 1879441289:
                                        C5695.m16023();
                                        C4159.m12565();
                                        return null;
                                    case 1565228443:
                                    case 1602500045:
                                        popupWindow2.dismiss();
                                        if (C1005.f3721) {
                                            iM6982 = C2105.m6981("ۖ᩸") ^ i18;
                                            i20 = ((iM6982 ^ i19) * 17917) ^ 777471240;
                                            i21 = 1767664656;
                                        } else {
                                            iM6982 = C0630.m2566("ۜܿ") ^ i19;
                                            i20 = ((iM6982 ^ i18) * (-7347)) ^ 1789365266;
                                            i21 = -1087604509;
                                        }
                                        break;
                                    default:
                                        viewOnClickListenerC7044 = this.f4355;
                                        c5242.m1667((InterfaceC23586) viewOnClickListenerC7044);
                                        if (C1128.f4106 <= 0) {
                                            iM6982 = (i18 - C0630.m2566("᩷ۛ")) * 23;
                                            i20 = ((iM6982 ^ i19) * 7711) ^ 1766876445;
                                            i21 = 1518121745;
                                        } else {
                                            iM6982 = C2105.m6981("۫֫") ^ i18;
                                            i20 = ((iM6982 ^ i19) * 3751) ^ (-1424147330);
                                            i21 = -596426312;
                                        }
                                        break;
                                }
                            }
                        }
                    });
                    break;
                case -1232523580:
                case 286115515:
                    i15 = i15;
                    sArr = f21694;
                    c = '\b';
                    if (C4616.f14690 <= 0) {
                        iM6981 = C0630.m2566("ۨᩳ") ^ i6;
                        i8 = ((iM6981 ^ i7) * 21323) ^ 177305817;
                        i2 = 829681988;
                    } else {
                        iM6981 = (C0630.m2566("ۗ۬") + i6) * 87;
                        i8 = ((iM6981 ^ i7) * (-31453)) ^ 1008787669;
                        i2 = 2017611163;
                    }
                    i14 = i15;
                    i9 = iM6981 ^ i2;
                    viewOnClickListenerC7043 = viewOnClickListenerC7042;
                    break;
                case -1171007444:
                case 1283508565:
                    i15 = i15;
                    if (C2520.f8000 >= 0) {
                        iM6981 = C0630.m2566("᩵ܶ") ^ i7;
                        i8 = ((iM6981 ^ i6) * 31357) ^ (-1140351238);
                        i2 = -214839566;
                    } else {
                        iM6981 = C0630.m2566("ۛܽ") ^ i7;
                        i8 = ((iM6981 ^ i6) * (-1735)) ^ (-1089573166);
                        i2 = -1674936959;
                    }
                    i14 = i15;
                    i9 = iM6981 ^ i2;
                    viewOnClickListenerC7043 = viewOnClickListenerC7042;
                    break;
                case -1087186699:
                case -304477248:
                    i15 = i15;
                    iM5737 = C1711.m5737(view);
                    sArr2 = f21694;
                    i12 = 9;
                    i13 = 3;
                    if (C7811.f24123 >= 0) {
                        iM6981 = C2105.m6981("ۗ᩷") ^ i6;
                        i8 = ((iM6981 ^ i7) * 743) ^ 250238974;
                        i2 = -1176761786;
                    } else {
                        iM6981 = C0630.m2566("ۜۚ") ^ i6;
                        i8 = ((iM6981 ^ i7) * 14355) ^ (-553336730);
                        i2 = -1564576908;
                    }
                    i14 = i15;
                    i9 = iM6981 ^ i2;
                    viewOnClickListenerC7043 = viewOnClickListenerC7042;
                    break;
                case -1008643412:
                case 1200586478:
                    break;
                case -977429652:
                case -479458432:
                    C2126.m7040();
                    break;
                case -889916407:
                case -736565747:
                    i11 = 30831;
                    iM6981 = (C2105.m6981("ܳۘ") ^ i6) * (-119);
                    i8 = ((iM6981 ^ i7) * 12127) ^ (-708625112);
                    i2 = 905034267;
                    i14 = i15;
                    i9 = iM6981 ^ i2;
                    viewOnClickListenerC7043 = viewOnClickListenerC7042;
                    break;
                case -489738474:
                case 1394701589:
                    i15 = i15;
                    if (C2126.f7087) {
                        iM6981 = C0630.m2566("᩶᩹") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-21967)) ^ (-187560411);
                        i2 = 754003422;
                    } else {
                        iM6981 = C0630.m2566("ܳۚ") ^ i6;
                        i8 = ((iM6981 ^ i7) * 26711) ^ (-1736935633);
                        i2 = 1656111474;
                    }
                    i14 = i15;
                    i9 = iM6981 ^ i2;
                    viewOnClickListenerC7043 = viewOnClickListenerC7042;
                    break;
                case -422643653:
                case 1975867784:
                    i15 = i15;
                    if (C11340.m28031()) {
                        iM6981 = (C2105.m6981("᩸ۧ") + i7) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = ((iM6981 ^ i6) * 30105) ^ (-59373168);
                        i2 = -952834191;
                    } else {
                        iM6981 = C0630.m2566("᩵ܶ") ^ i7;
                        i8 = ((iM6981 ^ i6) * 31357) ^ (-1140351238);
                        i2 = -214839566;
                    }
                    i14 = i15;
                    i9 = iM6981 ^ i2;
                    viewOnClickListenerC7043 = viewOnClickListenerC7042;
                    break;
                case -405313864:
                case 650445151:
                    i15 = i15;
                    if (RunnableC3474.m10630()) {
                        iM6981 = (i6 - C2105.m6981("۫ܶ")) * (-109);
                        i8 = ((iM6981 ^ i7) * 24149) ^ (-1291886367);
                        i2 = -252546042;
                    } else {
                        iM6981 = C2105.m6981("ۗ᩷") ^ i6;
                        i8 = ((iM6981 ^ i7) * 743) ^ 250238974;
                        i2 = -1176761786;
                    }
                    i14 = i15;
                    i9 = iM6981 ^ i2;
                    viewOnClickListenerC7043 = viewOnClickListenerC7042;
                    break;
                case -363523481:
                case -345826457:
                    i15 = i15;
                    if ((s * 32456) - i10 > 0) {
                        iM6981 = (i7 - C0630.m2566("ۖ۠")) * 87;
                        i8 = ((iM6981 ^ i6) * 20069) ^ 1795020420;
                        i2 = 746442904;
                    } else {
                        iM6981 = C2105.m6981("ۘۗ") ^ i7;
                        i8 = ((iM6981 ^ i6) * (-10301)) ^ 514146023;
                        i2 = 1118781230;
                    }
                    i14 = i15;
                    i9 = iM6981 ^ i2;
                    viewOnClickListenerC7043 = viewOnClickListenerC7042;
                    break;
                case -133281972:
                case 817252490:
                    i15 = i15;
                    if (iM5737 == (C0630.m2566(C7106.m19110(sArr2, i12, i13, i11)) ^ 2102769325)) {
                        int iM2568 = (i7 - C0630.m2566("ۘۖ")) * 67;
                        i14 = i15;
                        i9 = iM2568 ^ (-454392295);
                        i8 = ((iM2568 ^ i6) * (-24335)) ^ 1737003678;
                    } else {
                        iM6981 = (C2105.m6981("۬᩹") ^ i7) * 19;
                        i8 = ((iM6981 ^ i6) * 29381) ^ 1030481831;
                        i2 = -1382139349;
                        i14 = i15;
                        i9 = iM6981 ^ i2;
                    }
                    viewOnClickListenerC7043 = viewOnClickListenerC7042;
                    break;
                case 342996891:
                case 589960245:
                    i15 = i15;
                    if (C4117.m12364() != 0) {
                        iM6981 = C0630.m2566("᩶᩹") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-21967)) ^ (-187560411);
                        i2 = 754003422;
                    } else {
                        iM6981 = (i7 - C2105.m6981("ۢۨ")) * 85;
                        i8 = ((iM6981 ^ i6) * 14041) ^ 403851999;
                        i2 = 382909551;
                    }
                    i14 = i15;
                    i9 = iM6981 ^ i2;
                    viewOnClickListenerC7043 = viewOnClickListenerC7042;
                    break;
                case 554130890:
                case 2060805466:
                    i11 = 24978;
                    iM6981 = (C2105.m6981("ܳۘ") ^ i6) * (-119);
                    i8 = ((iM6981 ^ i7) * 12127) ^ (-708625112);
                    i2 = 905034267;
                    i14 = i15;
                    i9 = iM6981 ^ i2;
                    viewOnClickListenerC7043 = viewOnClickListenerC7042;
                    break;
                case 663025729:
                case 1266081047:
                    i3 = i15;
                    popupWindow.dismiss();
                    if (viewOnClickListenerC7043.f21701) {
                        iM2566 = (i6 - C0630.m2566("ܿۖ")) * (-41);
                        i4 = ((iM2566 ^ i7) * (-8789)) ^ 1818180585;
                        i5 = 1044496695;
                    } else {
                        iM2566 = C0630.m2566("ܳۢ") ^ i6;
                        i4 = ((iM2566 ^ i7) * (-13831)) ^ (-363398373);
                        i5 = -179747165;
                    }
                    int i17 = i3;
                    i9 = iM2566 ^ i5;
                    i8 = i4;
                    i14 = i17;
                    break;
                case 761940274:
                case 2070537291:
                    C1504.m5179();
                    break;
                case 945436911:
                case 2070322146:
                    C4616.m13552();
                    C1711.m5736();
                    i15 = i15;
                    iM6981 = C2105.m6981("ۗ᩷") ^ i6;
                    i8 = ((iM6981 ^ i7) * 743) ^ 250238974;
                    i2 = -1176761786;
                    i14 = i15;
                    i9 = iM6981 ^ i2;
                    viewOnClickListenerC7043 = viewOnClickListenerC7042;
                    break;
                case 1631549815:
                case 1808002697:
                    if (C7811.f24123 >= 0) {
                        i15 = i15;
                        iM6981 = C0630.m2566("᩵ܶ") ^ i7;
                        i8 = ((iM6981 ^ i6) * 31357) ^ (-1140351238);
                        i2 = -214839566;
                        i14 = i15;
                        i9 = iM6981 ^ i2;
                        viewOnClickListenerC7043 = viewOnClickListenerC7042;
                    }
                    i15 = i15;
                    iM6981 = C0630.m2566("᩶᩹") ^ i6;
                    i8 = ((iM6981 ^ i7) * (-21967)) ^ (-187560411);
                    i2 = 754003422;
                    i14 = i15;
                    i9 = iM6981 ^ i2;
                    viewOnClickListenerC7043 = viewOnClickListenerC7042;
                    break;
                default:
                    viewOnClickListenerC7043.f21701 = true;
                    C4263.m12821(new C11276(viewOnClickListenerC7043, str, AbstractC2021.m6567(), i));
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0179 A[PHI: r2 r8 r9 r15
      0x0179: PHI (r2v4 int) = (r2v1 int), (r2v2 int), (r2v1 int), (r2v1 int) binds: [B:94:0x0179, B:39:0x0177, B:19:0x008d, B:99:0x0179] A[DONT_GENERATE, DONT_INLINE]
      0x0179: PHI (r8v6 int) = (r8v2 int), (r8v2 int), (r8v4 int), (r8v2 int) binds: [B:94:0x0179, B:39:0x0177, B:19:0x008d, B:99:0x0179] A[DONT_GENERATE, DONT_INLINE]
      0x0179: PHI (r9v6 android.content.DialogInterface$OnClickListener) = 
      (r9v2 android.content.DialogInterface$OnClickListener)
      (r9v4 android.content.DialogInterface$OnClickListener)
      (r9v2 android.content.DialogInterface$OnClickListener)
      (r9v2 android.content.DialogInterface$OnClickListener)
     binds: [B:94:0x0179, B:39:0x0177, B:19:0x008d, B:99:0x0179] A[DONT_GENERATE, DONT_INLINE]
      0x0179: PHI (r15v5 short[]) = (r15v2 short[]), (r15v3 short[]), (r15v2 short[]), (r15v2 short[]) binds: [B:94:0x0179, B:39:0x0177, B:19:0x008d, B:99:0x0179] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x023e A[PHI: r3 r7 r12 r13 r14
      0x023e: PHI (r3v4 l.᩵ۚۢ) = (r3v3 l.᩵ۚۢ), (r3v2 l.᩵ۚۢ), (r3v2 l.᩵ۚۢ) binds: [B:55:0x023c, B:47:0x01d7, B:43:0x01b0] A[DONT_GENERATE, DONT_INLINE]
      0x023e: PHI (r7v3 java.lang.String) = (r7v2 java.lang.String), (r7v2 java.lang.String), (r7v5 java.lang.String) binds: [B:55:0x023c, B:47:0x01d7, B:43:0x01b0] A[DONT_GENERATE, DONT_INLINE]
      0x023e: PHI (r12v4 short[]) = (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:55:0x023c, B:47:0x01d7, B:43:0x01b0] A[DONT_GENERATE, DONT_INLINE]
      0x023e: PHI (r13v4 int) = (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:55:0x023c, B:47:0x01d7, B:43:0x01b0] A[DONT_GENERATE, DONT_INLINE]
      0x023e: PHI (r14v4 short[]) = (r14v2 short[]), (r14v3 short[]), (r14v2 short[]) binds: [B:55:0x023c, B:47:0x01d7, B:43:0x01b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m19026() {
        int iM6981;
        int i;
        int i2;
        int iM6982;
        int i3;
        int iM2566;
        int i4;
        final ViewOnClickListenerC7042 viewOnClickListenerC7042 = this;
        int i5 = ViewOnClickListenerC1958.f6529;
        int i6 = C2520.f8000;
        int iM6983 = C2105.m6981("ᩳ֫") ^ i6;
        int i7 = ((iM6983 ^ i5) * (-13063)) ^ 1626658493;
        TextView textView = null;
        String strM4902 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i8 = iM6983 ^ (-32205908);
        int i9 = 0;
        int iM6984 = 0;
        int iM6985 = 0;
        DialogInterface.OnClickListener onClickListener = null;
        int i10 = 0;
        int i11 = -1395575252;
        short s = 0;
        int i12 = 0;
        DialogInterfaceC0206 dialogInterfaceC0206M2438 = null;
        short[] sArr3 = null;
        C19258 c19258 = null;
        int i13 = 0;
        while (true) {
            i11 = i8 ^ (i7 & (((i11 ^ i5) * 27269) >> 31));
            switch (i11) {
                case -2072343491:
                case -946038485:
                    C4117.m12364();
                    C1773.m5908();
                    iM6982 = C2105.m6981("ۨ֫") ^ i6;
                    i7 = ((iM6982 ^ i5) * (-28761)) ^ (-966518387);
                    i3 = -409520538;
                    i8 = iM6982 ^ i3;
                    viewOnClickListenerC7042 = this;
                    break;
                case -1928606488:
                case 824040451:
                    strM4902 = C1420.m4902(sArr3, 295, 3, i10);
                    if (C1005.m3501()) {
                        iM6981 = (i5 - C0630.m2566("ۜᩳ")) * (-95);
                        i = ((iM6981 ^ i6) * (-29941)) ^ (-2121520362);
                        i2 = 421059926;
                    } else {
                        iM6981 = (i5 - C0630.m2566("۟ܰ")) * 5;
                        i = ((iM6981 ^ i6) * (-17615)) ^ (-1623159295);
                        i2 = 1644829929;
                    }
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -1925387543:
                case -591713494:
                    i10 = 35043;
                    iM6981 = (C2105.m6981("۠᩸") + i5) * (-29);
                    i = ((iM6981 ^ i6) * (-15995)) ^ 195802446;
                    i2 = -1328978426;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -1828253186:
                case 1974690400:
                    s = f21694[291];
                    i12 = s * s;
                    if (RunnableC3474.m10630()) {
                        iM6982 = (i5 - C2105.m6981("ۢ᩻")) * 5;
                        i7 = ((iM6982 ^ i6) * 29359) ^ 1237595013;
                        i3 = -989028905;
                    } else {
                        iM6982 = C2105.m6981("ۨ֫") ^ i6;
                        i7 = ((iM6982 ^ i5) * (-28761)) ^ (-966518387);
                        i3 = -409520538;
                    }
                    i8 = iM6982 ^ i3;
                    viewOnClickListenerC7042 = this;
                    break;
                case -1810876228:
                case 1803088896:
                    C0382.m1849(c19258, 2116889894 ^ iM6984);
                    sArr3 = f21694;
                    if (C1047.f3863 >= 0) {
                        iM6981 = (i5 - C0630.m2566("۟ܰ")) * 5;
                        i = ((iM6981 ^ i6) * (-17615)) ^ (-1623159295);
                        i2 = 1644829929;
                    } else {
                        iM6981 = C0630.m2566("ۡ۟") ^ i6;
                        i = ((iM6981 ^ i5) * (-29871)) ^ 173254246;
                        i2 = 112187554;
                    }
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -1757541472:
                case -74362206:
                    InterfaceC9103 interfaceC9103M38086 = AbstractC16157.m38086(dialogInterfaceC0206M2438.m1432());
                    if (C4616.f14690 > 0) {
                        interfaceC9103M38086.mo8505(new C16919(true).m46968());
                        interfaceC9103M38086.build().mo38090(textView, C0422.m1959(RunnableC0588.m2442(textView)));
                    }
                    int iM6986 = (C2105.m6981("᩹ܺ") ^ i6) * 79;
                    i8 = iM6986 ^ (-532531602);
                    i7 = ((iM6986 ^ i5) * (-20847)) ^ (-1796769879);
                    onClickListener = null;
                    break;
                case -1399604537:
                case 2146208111:
                    C1294.m4380(c19258, C0630.m2566(C21923.m49334(sArr2, i9, 3, i10)) ^ 2124621458, onClickListener);
                    if (viewOnClickListenerC7042.f21698) {
                        iM6981 = (C0630.m2566("ۙۖ") + i6) * (-107);
                        i = ((iM6981 ^ i5) * 1873) ^ 1808149861;
                        i2 = -1947525730;
                    } else {
                        iM6981 = C2105.m6981("᩸ܽ") ^ i6;
                        i = ((iM6981 ^ i5) * (-3643)) ^ 1179516903;
                        i2 = -876464040;
                    }
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -962071305:
                case -756267300:
                    if (C2520.f8000 >= 0) {
                        int iM6987 = (C2105.m6981("᩹ܺ") ^ i6) * 79;
                        i8 = iM6987 ^ (-532531602);
                        i7 = ((iM6987 ^ i5) * (-20847)) ^ (-1796769879);
                        onClickListener = null;
                    } else {
                        iM6981 = C0630.m2566("ۢܶ") ^ i5;
                        i = ((iM6981 ^ i6) * 17957) ^ 719718565;
                        i2 = -799411042;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    }
                    break;
                case -955111541:
                case 133145720:
                    int i14 = DialogInterfaceC0206.f1451;
                    c19258 = new C19258(viewOnClickListenerC7042);
                    sArr = f21694;
                    i13 = 292;
                    if (C1773.f6144 <= 0) {
                        iM6981 = (i5 - C0630.m2566("۟ܰ")) * 5;
                        i = ((iM6981 ^ i6) * (-17615)) ^ (-1623159295);
                        i2 = 1644829929;
                    } else {
                        iM6981 = C0630.m2566("֫ܰ") ^ i6;
                        i = ((iM6981 ^ i5) * (-23519)) ^ 230059225;
                        i2 = 1895188818;
                    }
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -747152192:
                case 901707222:
                    i10 = 29937;
                    iM6981 = (C2105.m6981("۠᩸") + i5) * (-29);
                    i = ((iM6981 ^ i6) * (-15995)) ^ 195802446;
                    i2 = -1328978426;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -570026890:
                case 383661212:
                    C1916.m6295(c19258, C2105.m6981(strM4902) ^ 2098513467);
                    if (C7811.m20844() == 0) {
                        onClickListener = new DialogInterface.OnClickListener() { // from class: l.۫ܶ᩷
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i15) {
                                int i16 = -1664506326;
                                int i17 = C2167.f7158;
                                int i18 = RunnableC0588.f2309;
                                int iM6988 = (i18 - C2105.m6981("᩹ۜ")) * 109;
                                int i19 = ((iM6988 ^ i17) * 5305) ^ (-1673425014);
                                int i20 = -639711278;
                                while (true) {
                                    i16 = ((((i16 ^ i17) * 15529) >> 31) & i19) ^ (iM6988 ^ i20);
                                    switch (i16) {
                                        case -2015393597:
                                        case 972935087:
                                            C1504.m5179();
                                            C4263.m12819();
                                            break;
                                        case -1870851083:
                                        case 1142717554:
                                            if (C3683.f11629 >= 0) {
                                                iM6988 = C2105.m6981("֡ܶ") ^ i17;
                                                i19 = ((iM6988 ^ i18) * (-1131)) ^ (-26774656);
                                                i20 = -525601220;
                                            } else {
                                                iM6988 = (i17 - C0630.m2566("᩶ܰ")) * 45;
                                                i19 = ((iM6988 ^ i18) * 1639) ^ (-439536306);
                                                i20 = 1567040346;
                                            }
                                            break;
                                        case -1818639721:
                                        case 1998756030:
                                            if (C4616.m13552() != 0) {
                                                iM6988 = C2105.m6981("֡ܶ") ^ i17;
                                                i19 = ((iM6988 ^ i18) * (-1131)) ^ (-26774656);
                                                i20 = -525601220;
                                            } else {
                                                iM6988 = C2105.m6981("ۢۨ") ^ i18;
                                                i19 = ((iM6988 ^ i17) * (-17721)) ^ (-1230827681);
                                                i20 = 2087585526;
                                            }
                                            break;
                                        case -1681447511:
                                        case -443210465:
                                            if (C11340.f33930 < 0) {
                                                iM6988 = C2105.m6981("֡ܶ") ^ i17;
                                                i19 = ((iM6988 ^ i18) * (-1131)) ^ (-26774656);
                                                i20 = -525601220;
                                            } else {
                                                iM6988 = (C0630.m2566("᩵ۚ") ^ i18) * 27;
                                                i19 = ((iM6988 ^ i17) * (-5337)) ^ 1705749701;
                                                i20 = 1428938237;
                                            }
                                            break;
                                        case -1532117609:
                                        case 1907986893:
                                            ViewOnClickListenerC1958.m6429();
                                            if (C2958.m9034() <= 0) {
                                                iM6988 = C0630.m2566("᩺ۨ") ^ i17;
                                                i19 = ((iM6988 ^ i18) * (-10593)) ^ 1892888592;
                                                i20 = -1367920842;
                                            } else {
                                                iM6988 = C2105.m6981("֡ܶ") ^ i17;
                                                i19 = ((iM6988 ^ i18) * (-1131)) ^ (-26774656);
                                                i20 = -525601220;
                                            }
                                            break;
                                        case -1280490869:
                                        case 548723563:
                                            if (C3683.f11629 >= 0) {
                                                iM6988 = C0630.m2566("֫ۖ") ^ i17;
                                                i19 = ((iM6988 ^ i18) * 6719) ^ 1171358500;
                                                i20 = -1460688032;
                                            } else {
                                                iM6988 = C0630.m2566("۟۟") ^ i18;
                                                i19 = ((iM6988 ^ i17) * (-23605)) ^ (-404289084);
                                                i20 = -572041155;
                                            }
                                            break;
                                        case -727137244:
                                        case -91577894:
                                            if (C1711.f5919) {
                                                iM6988 = C0630.m2566("֫ۖ") ^ i17;
                                                i19 = ((iM6988 ^ i18) * 6719) ^ 1171358500;
                                                i20 = -1460688032;
                                            } else {
                                                iM6988 = C0630.m2566("ܽ᩻") ^ i17;
                                                i19 = ((iM6988 ^ i18) * 18041) ^ 1713506515;
                                                i20 = -1325155321;
                                            }
                                            break;
                                        case -652465032:
                                        case 178980545:
                                            if (C21923.m49329()) {
                                                iM6988 = C0630.m2566("֫ۖ") ^ i17;
                                                i19 = ((iM6988 ^ i18) * 6719) ^ 1171358500;
                                                i20 = -1460688032;
                                            } else {
                                                iM6988 = (C0630.m2566("ۢܳ") + i18) * (-77);
                                                i19 = ((iM6988 ^ i17) * (-24885)) ^ (-73869572);
                                                i20 = 1900677528;
                                            }
                                            break;
                                        case -541341352:
                                        case -233115194:
                                            ViewOnClickListenerC7042.m19020(this.f37534);
                                            break;
                                        case -419135570:
                                        case 1463107950:
                                            if (C11340.f33930 >= 0) {
                                                iM6988 = C2105.m6981("֡ܶ") ^ i17;
                                                i19 = ((iM6988 ^ i18) * (-1131)) ^ (-26774656);
                                                i20 = -525601220;
                                            } else {
                                                iM6988 = (C0630.m2566("ۡۜ") ^ i18) * 13;
                                                i19 = ((iM6988 ^ i17) * (-6841)) ^ 621851473;
                                                i20 = -2123644409;
                                            }
                                            break;
                                        case -263917572:
                                        case 1353388579:
                                            if (C2272.f7362) {
                                                iM6988 = C0630.m2566("᩺ۨ") ^ i17;
                                                i19 = ((iM6988 ^ i18) * (-10593)) ^ 1892888592;
                                                i20 = -1367920842;
                                            } else {
                                                iM6988 = C0630.m2566("ۙۖ") ^ i17;
                                                i19 = ((iM6988 ^ i18) * (-2691)) ^ 852633759;
                                                i20 = -1051168168;
                                            }
                                            break;
                                        case -225116575:
                                        case 1972195112:
                                            if (RunnableC3474.f10992 <= 0) {
                                                iM6988 = C0630.m2566("᩺ۨ") ^ i17;
                                                i19 = ((iM6988 ^ i18) * (-10593)) ^ 1892888592;
                                                i20 = -1367920842;
                                            } else {
                                                iM6988 = (C2105.m6981("ᩳۚ") + i17) * 109;
                                                i19 = ((iM6988 ^ i18) * 7945) ^ (-477684785);
                                                i20 = -2121092056;
                                            }
                                            break;
                                        case 199521843:
                                        case 1750452991:
                                            if (C0483.f2088 >= 0) {
                                                iM6988 = C0630.m2566("֫ۖ") ^ i17;
                                                i19 = ((iM6988 ^ i18) * 6719) ^ 1171358500;
                                                i20 = -1460688032;
                                            } else {
                                                iM6988 = (C0630.m2566("ᩴ᩹") ^ i18) * (-5);
                                                i19 = ((iM6988 ^ i17) * (-21521)) ^ 1886079025;
                                                i20 = 212890703;
                                            }
                                            break;
                                        case 463790510:
                                        case 1746362387:
                                            C3911.m11924();
                                            iM6988 = C2105.m6981("֡ܶ") ^ i17;
                                            i19 = ((iM6988 ^ i18) * (-1131)) ^ (-26774656);
                                            i20 = -525601220;
                                            break;
                                        case 1308687373:
                                        case 1858211174:
                                            if (C3245.m9925() != 0) {
                                                iM6988 = C2105.m6981("֡ܶ") ^ i17;
                                                i19 = ((iM6988 ^ i18) * (-1131)) ^ (-26774656);
                                                i20 = -525601220;
                                            } else {
                                                iM6988 = C0630.m2566("ۨ᩵") ^ i18;
                                                i19 = ((iM6988 ^ i17) * 9165) ^ (-1376185398);
                                                i20 = 1297337094;
                                            }
                                            break;
                                        default:
                                            if (C0964.m3413()) {
                                                iM6988 = C0630.m2566("ᩳᩴ") ^ i17;
                                                i19 = ((iM6988 ^ i18) * 29843) ^ (-1962723880);
                                                i20 = -102688468;
                                            } else {
                                                iM6988 = C0630.m2566("֫ۖ") ^ i17;
                                                i19 = ((iM6988 ^ i18) * 6719) ^ 1171358500;
                                                i20 = -1460688032;
                                            }
                                            break;
                                    }
                                    return;
                                }
                            }
                        };
                        sArr2 = f21694;
                        i9 = 298;
                        if (C4159.f13567) {
                            iM6981 = C0630.m2566("ᩳ۬") ^ i5;
                            i = ((iM6981 ^ i6) * (-2581)) ^ (-1380012778);
                            i2 = 734795649;
                        } else {
                            iM6981 = C0630.m2566("ۢܶ") ^ i5;
                            i = ((iM6981 ^ i6) * 17957) ^ 719718565;
                            i2 = -799411042;
                        }
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    } else {
                        int iM6988 = (C2105.m6981("᩹ܺ") ^ i6) * 79;
                        i8 = iM6988 ^ (-532531602);
                        i7 = ((iM6988 ^ i5) * (-20847)) ^ (-1796769879);
                        onClickListener = null;
                    }
                    break;
                case -175299273:
                case 1287949892:
                    C2520.m8029(c19258, 2125873908 ^ iM6985, null);
                    iM6981 = C2105.m6981("᩸ܽ") ^ i6;
                    i = ((iM6981 ^ i5) * (-3643)) ^ 1179516903;
                    i2 = -876464040;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -124386635:
                case 666634416:
                    C7106.m19120();
                    if (!C3683.m11222()) {
                        iM6982 = C2105.m6981("ۨ֫") ^ i6;
                        i7 = ((iM6982 ^ i5) * (-28761)) ^ (-966518387);
                        i3 = -409520538;
                        i8 = iM6982 ^ i3;
                        viewOnClickListenerC7042 = this;
                    } else {
                        iM6981 = C2105.m6981("֡ۢ") ^ i6;
                        i = ((iM6981 ^ i5) * 10563) ^ (-1639549198);
                        i2 = 246203023;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    }
                    break;
                case -78497821:
                case 186603644:
                    iM6984 = C2105.m6981(C22628.m50602(sArr, i13, 3, i10));
                    if (C1773.f6144 > 0) {
                        iM6981 = (C2105.m6981("ۡ᩶") + i5) * 47;
                        i = ((iM6981 ^ i6) * 22427) ^ 1866493116;
                        i2 = -425258776;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    } else {
                        int iM6989 = (C2105.m6981("᩹ܺ") ^ i6) * 79;
                        i8 = iM6989 ^ (-532531602);
                        i7 = ((iM6989 ^ i5) * (-20847)) ^ (-1796769879);
                        onClickListener = null;
                    }
                    break;
                case 707768923:
                case 1585969836:
                    iM6985 = C2105.m6981(RunnableC1108.m3789(f21694, 301, 3, i10));
                    if (C11340.f33930 >= 0) {
                        iM6981 = C0630.m2566("ۢܶ") ^ i5;
                        i = ((iM6981 ^ i6) * 17957) ^ 719718565;
                        i2 = -799411042;
                    } else {
                        iM6981 = (C0630.m2566("᩶ۚ") + i5) * (-97);
                        i = ((iM6981 ^ i6) * 31657) ^ 1194021258;
                        i2 = 1367462081;
                    }
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case 966560912:
                case 1080413129:
                    dialogInterfaceC0206M2438 = RunnableC0588.m2438(c19258);
                    C8960.m23095(dialogInterfaceC0206M2438);
                    textView = (TextView) dialogInterfaceC0206M2438.m1433(R.id.message);
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = C2105.m6981("֡ۢ") ^ i6;
                        i = ((iM6981 ^ i5) * 10563) ^ (-1639549198);
                        i2 = 246203023;
                    } else {
                        iM6981 = (C2105.m6981("ܽۘ") + i5) * (-45);
                        i = ((iM6981 ^ i6) * 28337) ^ 412014848;
                        i2 = -838717868;
                    }
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case 1126962460:
                case 1815291377:
                    C22628.m50615();
                    C0714.m2805();
                    break;
                case 1637947393:
                case 1673196634:
                    short s2 = s;
                    if ((i12 + 19562929) - (s2 * 8846) < 0) {
                        iM2566 = (C0630.m2566("ۖᩳ") + i6) * (-13);
                        i7 = ((iM2566 ^ i5) * 11327) ^ 1528805082;
                        i4 = -584364843;
                    } else {
                        iM2566 = C0630.m2566("۠ۧ") ^ i6;
                        i7 = ((iM2566 ^ i5) * 13561) ^ (-1421270905);
                        i4 = 1461665657;
                    }
                    i8 = iM2566 ^ i4;
                    viewOnClickListenerC7042 = this;
                    s = s2;
                    break;
                default:
                    if (C2520.f8000 < 0) {
                        iM6981 = C0630.m2566("ۢܶ") ^ i5;
                        i = ((iM6981 ^ i6) * 17957) ^ 719718565;
                        i2 = -799411042;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    } else {
                        iM6982 = C2105.m6981("ۨ֫") ^ i6;
                        i7 = ((iM6982 ^ i5) * (-28761)) ^ (-966518387);
                        i3 = -409520538;
                        i8 = iM6982 ^ i3;
                        viewOnClickListenerC7042 = this;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 20901. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public void m19014() {
        /*
            Method dump skipped, instruction units count: 2090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC7042.m19014():void");
    }
}
