package bin.mt.plus;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import l.AbstractActivityC3346;
import l.AbstractC15440;
import l.AbstractC2021;
import l.ActivityC0921;
import l.ActivityC15062;
import l.ActivityC16315;
import l.ActivityC2124;
import l.ActivityC23143;
import l.ActivityC7365;
import l.C0050;
import l.C0237;
import l.C0382;
import l.C0422;
import l.C0483;
import l.C0630;
import l.C0714;
import l.C0798;
import l.C0964;
import l.C1005;
import l.C1047;
import l.C1128;
import l.C11340;
import l.C1294;
import l.C13581;
import l.C1420;
import l.C1504;
import l.C16293;
import l.C16362;
import l.C16870;
import l.C1711;
import l.C1773;
import l.C1916;
import l.C19883;
import l.C2105;
import l.C2126;
import l.C2167;
import l.C21923;
import l.C22628;
import l.C2272;
import l.C2520;
import l.C2958;
import l.C3019;
import l.C3245;
import l.C3432;
import l.C3537;
import l.C3663;
import l.C3683;
import l.C3746;
import l.C3911;
import l.C4075;
import l.C4117;
import l.C4159;
import l.C4263;
import l.C4616;
import l.C4656;
import l.C5695;
import l.C7106;
import l.C7232;
import l.C7811;
import l.EnumC5983;
import l.RunnableC0588;
import l.RunnableC1108;
import l.RunnableC1937;
import l.RunnableC3474;
import l.RunnableC5974;
import l.ServiceConnectionC3453;
import l.ViewOnClickListenerC1958;
import l.ViewOnClickListenerC2040;
import l.ViewOnLayoutChangeListenerC7738;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.digests.WhirlpoolDigest;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: loaded from: classes2.dex */
public class ShortcutActivity extends ActivityC2124 {

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public static Boolean f66;

    /* JADX INFO: renamed from: ۚ֡᩺, reason: not valid java name and contains not printable characters */
    private static final short[] f67 = {1472, -19843, -19866, -19871, -19844, -19846, -19859, -19845, -19846, -19843, 3640, -16683, 27073, -28435, -4094, -4071, -4071, -4070, -4005, -4071, -4090, -4077, -4092, -4073, -4094, -4065, -4071, -4072, -4093, -4090, -4078, -4073, -4094, -4077, -4038, -4073, -4076, -4077, -4070, -4073, -4075, -4075, -4077, -4072, -4094, -4043, -4071, -4070, -4071, -4092, -4033, -4075, -4071, -4072, -4080, -4071, -4070, -4078, -4077, -4092, -4043, -4071, -4070, -4071, -4092, -4033, -4075, -4071, -4072, 29493, 25477, -32410, 31428, 25434, -23127, -4065, -4091, -4046, -4065, -4092, 4328, -21754, -21735, -21748, -21733, -21752, -21731, -21760, -21754, -21753, -21735, -21752, -21731, -21759, -21731, -21754, -21754, -21755, -21692, -21748, -21743, -21731, -21733, -21752, -21750, -21731, -21692, -21752, -21735, -21758, -21748, -21747, -21760, -21731, -21692, -21731, -21748, -21743, -21731, -21731, -21754, -21754, -21755, -21692, -21752, -21735, -21758, -21692, -21756, -21750, -21735, -21731, -21754, -21754, -21755, -21692, -21756, -21732, -21734, -21760, -21750, -21692, -21735, -21755, -21752, -21744, -21748, -21733, -21735, -21733, -21748, -21729, -21760, -21748, -21730, -21692, -21759, -21731, -21756, -21755, -21754, -21735, -21748, -21753, -21692, -21753, -21734, -21755, -21754, -21750, -21752, -21731, -21748, -21692, -21750, -21755, -21760, -21750, -21758, -21731, -21754, -21754, -21755, -21692, -21750, -21754, -21755, -21754, -21733, -21692, -21735, -21760, -21750, -21758, -21748, -21733, -21755, -21754, -21750, -21752, -21731, -21748, -21731, -21754, -21754, -21755, -21692, -21731, -21748, -21733, -21756, -21760, -21753, -21752, -21755, -21731, -21754, -21754, -21755, -21692, -21734, -21760, -21746, -21753, -21752, -21731, -21732, -21733, -21748, -21692, -21758, -21748, -21744, -21731, -21754, -21754, -21755, -21692, -21752, -21750, -21731, -21760, -21729, -21760, -21731, -21744, -21692, -21733, -21748, -21750, -21754, -21733, -21747, -21746, -21754, -21731, -21754, -21692, -21754, -21733, -21692, -21755, -21754, -21750, -21752, -21731, -21748, -21731, -21754, -21754, -21755, -21692, -21735, -21755, -21732, -21746, -21760, -21753, -21692, -21756, -21752, -21753, -21752, -21746, -21748, -21731, -21754, -21754, -21755, -21692, -21734, -21731, -21733, -21748, -21752, -21756, -21692, -21756, -21748, -21747, -21760, -21752, -21746, -21754, -21731, -21754, -21731, -21754, -21754, -21755, -21692, -21734, -21756, -21752, -21755, -21760, -21692, -21736, -21732, -21748, -21733, -21744, -21748, -21743, -21748, -21750, -21692, -21734, -21750, -21733, -21760, -21735, -21731, -21731, -21754, -21754, -21755, -21692, -21731, -21732, -21731, -21754, -21733, -21760, -21752, -21755, -21731, -21754, -21754, -21755, -21692, -21733, -21748, -21756, -21754, -21731, -21748, -21692, -21735, -21752, -21744, -21755, -21754, -21752, -21747, -21731, -21754, -21754, -21755, -21692, -21733, -21748, -21756, -21754, -21731, -21748, -21692, -21756, -21752, -21753, -21752, -21746, -21748, -21731, -21754, -21754, -21755, -21692, -21750, -21754, -21756, -21756, -21754, -21753, -21692, -21735, -21752, -21734, -21734, -21730, -21754, -21733, -21747, -21734, -21731, -21754, -21754, -21755, -21692, -21733, -21748, -21750, -21744, -21750, -21755, -21748, -21692, -21749, -21760, -21753, -21731, -21754, -21754, -21755, -21692, -21752, -21735, -21735, -21692, -21735, -21733, -21754, -21731, -21748, -21750, -21731, -21731, -21754, -21754, -21755, -21692, -21731, -21748, -21743, -21731, -21692, -21748, -21747, -21760, -21731, -21754, -21733, -21752, -21753, -21747, -21733, -21754, -21760, -21747, -21689, -21760, -21753, -21731, -21748, -21753, -21731, -21689, -21752, -21750, -21731, -21760, -21754, -21753, -21689, -21697, -21728, -21716, -21698, -21734, -21759, -21754, -21733, -21731, -21750, -21732, -21731};

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public static final AbstractC15440 f68;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m137(String str, Bitmap bitmap) throws Throwable {
        BufferedOutputStream bufferedOutputStreamM36525 = null;
        Throwable th = null;
        Object th2 = null;
        int i = -1262495654;
        int i2 = C1294.f4556;
        int i3 = C1128.f4106;
        int iM2566 = C0630.m2566("ܿۘ") ^ i3;
        int i4 = ((iM2566 ^ i2) * (-17981)) ^ (-647761873);
        int i5 = 1915315473;
        while (true) {
            i = ((((i ^ i2) * 18465) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2125741405:
                case -1416232567:
                    try {
                        C3537.m10752(bufferedOutputStreamM36525);
                        iM2566 = C0630.m2566("ܿۚ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 17463) ^ 1492102325;
                        i5 = 28472737;
                    } catch (Throwable th3) {
                        th2 = th3;
                        iM2566 = (C2105.m6981("ۤۛ") + i2) * (-93);
                        i4 = ((iM2566 ^ i3) * (-21065)) ^ (-2002601149);
                        i5 = -2114750616;
                    }
                    break;
                case -2070561939:
                case -1850991938:
                    if (C11340.m28031()) {
                        iM2566 = (C2105.m6981("ۗ᩺") + i3) * 79;
                        i4 = ((iM2566 ^ i2) * 29137) ^ (-1910843726);
                        i5 = 4904827;
                    } else {
                        iM2566 = C2105.m6981("᩵ۢ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-18665)) ^ (-1567918190);
                        i5 = 715818834;
                    }
                    break;
                case -1929076575:
                case -355278915:
                    C4263.m12819();
                    if (!C1005.f3721) {
                        iM2566 = (C2105.m6981("᩺ܿ") + i2) * (-35);
                        i4 = ((iM2566 ^ i3) * (-17445)) ^ 1795391922;
                        i5 = -768215459;
                    } else {
                        iM2566 = C2105.m6981("᩵ۢ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-18665)) ^ (-1567918190);
                        i5 = 715818834;
                    }
                    break;
                case -1900765873:
                case -329788157:
                    C4117.m12364();
                    if (C0050.f910 < 0) {
                        iM2566 = (C2105.m6981("ۛ֫") ^ i2) * (-109);
                        i4 = ((iM2566 ^ i3) * 22257) ^ (-795689113);
                        i5 = -1404939048;
                    } else {
                        iM2566 = (i3 - C2105.m6981("֨ᩴ")) * 45;
                        i4 = ((iM2566 ^ i2) * 6881) ^ 527219867;
                        i5 = -1782367503;
                    }
                    break;
                case -1897524908:
                case -760369972:
                    if (C3663.f11553) {
                        iM2566 = C2105.m6981("ۗ۠") ^ i3;
                        i4 = ((iM2566 ^ i2) * 12995) ^ 1929691557;
                        i5 = -946306155;
                    } else {
                        iM2566 = (C2105.m6981("ۙۜ") + i2) * 65;
                        i4 = ((iM2566 ^ i3) * (-7589)) ^ 944802474;
                        i5 = 13681882;
                    }
                    break;
                case -1875206014:
                case -1589455266:
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = (i2 - C0630.m2566("ܶ᩷")) * 27;
                        i4 = ((iM2566 ^ i3) * 25285) ^ (-1290790379);
                        i5 = 501077238;
                    } else {
                        iM2566 = (C0630.m2566("ܺ᩺") + i3) * (-125);
                        i4 = ((iM2566 ^ i2) * (-25869)) ^ 1389265211;
                        i5 = -1724260441;
                    }
                    break;
                case -1612623513:
                case 573422487:
                    if (C4075.m12263() > 0) {
                        iM2566 = C0630.m2566("ۜ᩹") ^ i3;
                        i4 = ((iM2566 ^ i2) * 28435) ^ (-1701631198);
                        i5 = 605689376;
                    } else {
                        iM2566 = (C2105.m6981("ܶ᩹") + i3) * q.h;
                        i4 = ((iM2566 ^ i2) * 22057) ^ 1828385138;
                        i5 = 340853822;
                    }
                    break;
                case -1536862820:
                case 1908219924:
                    AbstractC15440 abstractC15440 = f68;
                    C1711.m5735(abstractC15440);
                    bufferedOutputStreamM36525 = C1504.m5171(abstractC15440, str).m36525();
                    try {
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, bufferedOutputStreamM36525);
                        C3537.m10752(bufferedOutputStreamM36525);
                        iM2566 = C0630.m2566("ۨۘ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-14385)) ^ 1151007632;
                        i5 = 73825912;
                    } catch (Throwable th4) {
                        th = th4;
                        iM2566 = C0630.m2566("᩻ۙ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-31179)) ^ 1645908075;
                        i5 = -1559151105;
                    }
                    break;
                case -1490513105:
                case -394867634:
                    try {
                        C2167.m7154(th, th2);
                        iM2566 = C0630.m2566("ܿۚ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 17463) ^ 1492102325;
                        i5 = 28472737;
                    } catch (Exception unused) {
                        iM2566 = C2105.m6981("֡ܳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-11705)) ^ 2122244240;
                        i5 = -1862248961;
                    }
                    break;
                case -1363532559:
                case -1334611220:
                    throw th;
                case -1329208433:
                case -820224332:
                    C2126.m7040();
                    if (C21923.f70183 == 0) {
                        iM2566 = (i2 - C0630.m2566("ܶ᩷")) * 27;
                        i4 = ((iM2566 ^ i3) * 25285) ^ (-1290790379);
                        i5 = 501077238;
                    } else {
                        iM2566 = C0630.m2566("ۜ᩹") ^ i3;
                        i4 = ((iM2566 ^ i2) * 28435) ^ (-1701631198);
                        i5 = 605689376;
                    }
                    break;
                case -1156096257:
                case -1140122038:
                    if (C0630.f2410 <= 0) {
                        iM2566 = (i2 - C0630.m2566("ܶ᩷")) * 27;
                        i4 = ((iM2566 ^ i3) * 25285) ^ (-1290790379);
                        i5 = 501077238;
                    } else {
                        iM2566 = C0630.m2566("ᩳܺ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-13277)) ^ (-1681146553);
                        i5 = -1190164146;
                    }
                    break;
                case -1016589011:
                case -894794249:
                    if (C2105.m6982() == 0) {
                        iM2566 = C2105.m6981("᩵ۢ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-18665)) ^ (-1567918190);
                        i5 = 715818834;
                    } else {
                        iM2566 = C0630.m2566("ۜ᩹") ^ i3;
                        i4 = ((iM2566 ^ i2) * 28435) ^ (-1701631198);
                        i5 = 605689376;
                    }
                    break;
                case -775131923:
                case 1312046463:
                    if (C2958.f9394 >= 0) {
                        iM2566 = (C2105.m6981("ۛ֫") ^ i2) * (-109);
                        i4 = ((iM2566 ^ i3) * 22257) ^ (-795689113);
                        i5 = -1404939048;
                    } else {
                        iM2566 = (C2105.m6981("ܳۗ") ^ i2) * (-91);
                        i4 = ((iM2566 ^ i3) * (-24761)) ^ 655871653;
                        i5 = 1819794418;
                    }
                    break;
                case -718558119:
                case 829868679:
                    C4263.m12819();
                    iM2566 = (C2105.m6981("ܶ᩹") + i3) * q.h;
                    i4 = ((iM2566 ^ i2) * 22057) ^ 1828385138;
                    i5 = 340853822;
                    break;
                case -641838329:
                case 1017177121:
                    C5695.m16023();
                    return;
                case -90768627:
                case 748617461:
                    if (!C0382.f1805) {
                        iM2566 = (C2105.m6981("ۛ֫") ^ i2) * (-109);
                        i4 = ((iM2566 ^ i3) * 22257) ^ (-795689113);
                        i5 = -1404939048;
                    } else {
                        iM2566 = (C2105.m6981("ܶ᩹") + i3) * q.h;
                        i4 = ((iM2566 ^ i2) * 22057) ^ 1828385138;
                        i5 = 340853822;
                    }
                    break;
                case 91603830:
                case 174666357:
                    if (C7811.f24123 >= 0) {
                        iM2566 = (C2105.m6981("ۛ֫") ^ i2) * (-109);
                        i4 = ((iM2566 ^ i3) * 22257) ^ (-795689113);
                        i5 = -1404939048;
                    } else {
                        iM2566 = (C0630.m2566("֡᩷") ^ i2) * (-117);
                        i4 = ((iM2566 ^ i3) * 29805) ^ (-418116898);
                        i5 = -1173792256;
                    }
                    break;
                case 216180032:
                case 2117773709:
                    return;
                case 259527297:
                case 1040733798:
                    return;
                case 271529153:
                case 2058192288:
                    if (C3537.f11231 >= 0) {
                        iM2566 = (C2105.m6981("᩺ܿ") + i2) * (-35);
                        i4 = ((iM2566 ^ i3) * (-17445)) ^ 1795391922;
                        i5 = -768215459;
                    } else {
                        iM2566 = (C0630.m2566("ۨۚ") ^ i2) * 59;
                        i4 = ((iM2566 ^ i3) * 25029) ^ (-161436700);
                        i5 = -765125778;
                    }
                    break;
                case 369361986:
                case 1304400329:
                    if (C3663.f11553) {
                        iM2566 = (i2 - C0630.m2566("ܺܽ")) * (-39);
                        i4 = ((iM2566 ^ i3) * 7065) ^ (-625719764);
                        i5 = -612636697;
                    } else {
                        iM2566 = C0630.m2566("ۛۨ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 2169) ^ (-864912232);
                        i5 = 1889817436;
                    }
                    break;
                case 551566975:
                case 2015399929:
                    if (C2520.f8000 >= 0) {
                        iM2566 = (C2105.m6981("ܶ᩹") + i3) * q.h;
                        i4 = ((iM2566 ^ i2) * 22057) ^ 1828385138;
                        i5 = 340853822;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ᩳᩴ")) * (-73);
                        i4 = ((iM2566 ^ i2) * 22381) ^ (-49490342);
                        i5 = 497889525;
                    }
                    break;
                case 888188979:
                case 1745685656:
                    if (C1128.m3851() > 0) {
                        iM2566 = (i2 - C0630.m2566("ܺܽ")) * (-39);
                        i4 = ((iM2566 ^ i3) * 7065) ^ (-625719764);
                        i5 = -612636697;
                    } else {
                        iM2566 = (C2105.m6981("᩺ܿ") + i2) * (-35);
                        i4 = ((iM2566 ^ i3) * (-17445)) ^ 1795391922;
                        i5 = -768215459;
                    }
                    break;
                default:
                    if (C5695.f17556 >= 0) {
                        iM2566 = (C2105.m6981("᩺ܿ") + i2) * (-35);
                        i4 = ((iM2566 ^ i3) * (-17445)) ^ 1795391922;
                        i5 = -768215459;
                    } else {
                        iM2566 = C2105.m6981("᩵ۛ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-12819)) ^ (-2010446334);
                        i5 = 234028984;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:205:0x076a. Please report as an issue. */
    @Override // l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        int iM6981;
        int i;
        int i2;
        int iM2566;
        int i3;
        int i4;
        int iM6982;
        int i5;
        ShortcutActivity shortcutActivity = this;
        String strM6570 = null;
        String strM6571 = null;
        int i6 = 0;
        Class<ActivityC16315> cls = null;
        boolean z = false;
        int i7 = 0;
        boolean zM4369 = false;
        boolean zM43610 = false;
        boolean zM6437 = false;
        boolean zM6438 = false;
        boolean zM43611 = false;
        boolean zM43612 = false;
        boolean zM43613 = false;
        boolean zM6439 = false;
        boolean zM43614 = false;
        boolean zM43615 = false;
        boolean zM64310 = false;
        boolean zM64311 = false;
        boolean zM64312 = false;
        boolean zM64313 = false;
        boolean zM64314 = false;
        boolean zM64315 = false;
        boolean zM43616 = false;
        boolean zM43617 = false;
        boolean zM43618 = false;
        boolean zM64316 = false;
        boolean zM43619 = false;
        boolean zM64317 = false;
        boolean zM43620 = false;
        boolean zM43621 = false;
        boolean zM43622 = false;
        boolean zM3403 = false;
        boolean zM3404 = false;
        boolean zM12824 = false;
        int i8 = -1399999414;
        int i9 = ViewOnClickListenerC1958.f6529;
        int i10 = C3683.f11629;
        int iM2567 = C0630.m2566("ۢᩴ") ^ i9;
        int i11 = ((iM2567 ^ i10) * 20065) ^ 1766643552;
        int i12 = iM2567 ^ (-1198241548);
        int i13 = 0;
        boolean zM3405 = false;
        Intent intent = null;
        int iM6983 = 0;
        while (true) {
            i8 = i12 ^ (i11 & (((i8 ^ i10) * 22487) >> 31));
            switch (i8) {
                case -2125038453:
                case 159811894:
                    str = strM6570;
                    zM4369 = zM4369;
                    if (!zM43613) {
                        strM6570 = str;
                        iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                        i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                        i3 = -1783980219;
                        i12 = iM2566 ^ i3;
                        shortcutActivity = this;
                        zM4369 = zM4369;
                    } else {
                        iM6981 = (i10 - C2105.m6981("᩺ۚ")) * 75;
                        i = ((iM6981 ^ i9) * (-12409)) ^ (-140950570);
                        i2 = -2072613783;
                        zM4369 = zM4369;
                        String str2 = str;
                        i12 = iM6981 ^ i2;
                        i11 = i;
                        strM6570 = str2;
                    }
                    break;
                case -2092367447:
                case 515171696:
                    str = strM6570;
                    zM4369 = zM4369;
                    Intent intent2 = new Intent(shortcutActivity, (Class<?>) ActivityC15062.class);
                    C0798.m3009(intent2, i7);
                    C21923.m49344(shortcutActivity, intent2);
                    strM6570 = str;
                    iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                    i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                    i3 = -1783980219;
                    i12 = iM2566 ^ i3;
                    shortcutActivity = this;
                    zM4369 = zM4369;
                    break;
                case -2080857596:
                case 926044287:
                    try {
                        Intent intent3 = new Intent(shortcutActivity, cls);
                        C1711.m5738(intent3, i7);
                        C0798.m3009(intent3, i6);
                        try {
                            str = strM6570;
                            zM4369 = zM4369;
                            try {
                                intent3.setAction(C5695.m16034(f67, 452, 26, i13));
                                intent3.setData(Uri.fromFile(new File(strM6571)));
                                intent3.putExtra(C3537.m10748(f67, 478, 8, i13), z);
                                C22628.m50617(shortcutActivity, intent3);
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                            str = strM6570;
                            zM4369 = zM4369;
                        }
                        strM6570 = str;
                    } catch (Exception unused3) {
                        zM4369 = zM4369;
                    }
                    iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                    i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                    i3 = -1783980219;
                    i12 = iM2566 ^ i3;
                    shortcutActivity = this;
                    zM4369 = zM4369;
                    break;
                case -2061842734:
                case -1185451889:
                    str = strM6570;
                    zM4369 = zM4369;
                    if (!zM3404) {
                        iM6981 = C2105.m6981("۫ۢ") ^ i10;
                        i = ((iM6981 ^ i9) * 1851) ^ (-1201541989);
                        i2 = -1912085532;
                        zM4369 = zM4369;
                        String str3 = str;
                        i12 = iM6981 ^ i2;
                        i11 = i;
                        strM6570 = str3;
                    } else {
                        strM6570 = str;
                        iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                        i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                        i3 = -1783980219;
                        i12 = iM2566 ^ i3;
                        shortcutActivity = this;
                        zM4369 = zM4369;
                    }
                    break;
                case -2053281415:
                case -323550447:
                    zM4369 = zM4369;
                    short s = f67[80];
                    int i14 = s * 9184;
                    int i15 = s + 2296;
                    if ((i15 * i15) - i14 >= 0) {
                        iM2566 = C2105.m6981("᩹ܺ") ^ i10;
                        i11 = ((iM2566 ^ i9) * 22153) ^ 2110614383;
                        i3 = 1478411637;
                    } else {
                        iM2566 = C0630.m2566("۟֡") ^ i9;
                        i11 = ((iM2566 ^ i10) * 4689) ^ (-1213645676);
                        i3 = -1623257890;
                    }
                    i12 = iM2566 ^ i3;
                    shortcutActivity = this;
                    zM4369 = zM4369;
                    break;
                case -2018025306:
                case -1959373366:
                    zM4369 = zM4369;
                    zM64312 = ViewOnClickListenerC1958.m6437(strM6570, C2167.m7159(f67, 253, 14, i13));
                    iM6982 = C0630.m2566("ۤܰ") ^ i10;
                    i4 = ((iM6982 ^ i9) * 30337) ^ 609081966;
                    i5 = 46303952;
                    i12 = iM6982 ^ i5;
                    i11 = i4;
                    zM4369 = zM4369;
                    break;
                case -1967332258:
                case -560006028:
                    str = strM6570;
                    zM4369 = zM4369;
                    throw new RuntimeException();
                case -1937897045:
                case 1860871846:
                    return;
                case -1912104158:
                case -868261494:
                    str = strM6570;
                    zM4369 = zM4369;
                    if (!zM4369) {
                        strM6570 = str;
                        iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                        i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                        i3 = -1783980219;
                        i12 = iM2566 ^ i3;
                        shortcutActivity = this;
                        zM4369 = zM4369;
                    } else {
                        iM6981 = (C2105.m6981("ۗۙ") ^ i9) * (-75);
                        i = ((iM6981 ^ i10) * (-21367)) ^ (-539106430);
                        i2 = -1615020454;
                        zM4369 = zM4369;
                        String str4 = str;
                        i12 = iM6981 ^ i2;
                        i11 = i;
                        strM6570 = str4;
                    }
                    break;
                case -1850485111:
                case 2112429997:
                    str = strM6570;
                    zM4369 = zM4369;
                    Intent intent4 = new Intent(shortcutActivity, (Class<?>) ActivityC23143.class);
                    C0798.m3009(intent4, i7);
                    C22628.m50617(shortcutActivity, intent4);
                    strM6570 = str;
                    iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                    i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                    i3 = -1783980219;
                    i12 = iM2566 ^ i3;
                    shortcutActivity = this;
                    zM4369 = zM4369;
                    break;
                case -1834020104:
                case -1280930772:
                    zM4369 = zM4369;
                    zM64316 = ViewOnClickListenerC1958.m6437(strM6570, C3019.m9250(f67, 346, 19, i13));
                    iM6982 = C2105.m6981("᩶֡") ^ i10;
                    i4 = ((iM6982 ^ i9) * (-22395)) ^ 2092230377;
                    i5 = 623729844;
                    i12 = iM6982 ^ i5;
                    i11 = i4;
                    zM4369 = zM4369;
                    break;
                case -1823514154:
                case 920652555:
                    zM4369 = zM4369;
                    zM43621 = C1294.m4369(strM6570, RunnableC3474.m10633(f67, 420, 16, i13));
                    iM6982 = (C2105.m6981("ۖܿ") ^ i9) * 39;
                    i4 = ((iM6982 ^ i10) * (-5739)) ^ 1226237528;
                    i5 = -1459797441;
                    i12 = iM6982 ^ i5;
                    i11 = i4;
                    zM4369 = zM4369;
                    break;
                case -1812859986:
                case -1499766387:
                    str = strM6570;
                    zM4369 = zM4369;
                    Intent intent5 = new Intent(shortcutActivity, cls);
                    C0798.m3009(intent5, i7);
                    C1711.m5738(intent5, i6);
                    C21923.m49344(shortcutActivity, intent5);
                    strM6570 = str;
                    iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                    i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                    i3 = -1783980219;
                    i12 = iM2566 ^ i3;
                    shortcutActivity = this;
                    zM4369 = zM4369;
                    break;
                case -1807228928:
                case -8742012:
                    zM4369 = zM4369;
                    zM64313 = ViewOnClickListenerC1958.m6437(strM6570, C3911.m11919(f67, 267, 18, i13));
                    iM6982 = C0630.m2566("۬ܰ") ^ i9;
                    i4 = ((iM6982 ^ i10) * (-26471)) ^ 223261289;
                    i5 = 624117963;
                    i12 = iM6982 ^ i5;
                    i11 = i4;
                    zM4369 = zM4369;
                    break;
                case -1799988559:
                case 10698945:
                    zM4369 = zM4369;
                    zM43620 = C1294.m4369(strM6570, C0237.m1483(f67, 404, 16, i13));
                    iM6982 = (C2105.m6981("ܽ᩻") + i10) * (-93);
                    i4 = ((iM6982 ^ i9) * 12993) ^ (-1702580724);
                    i5 = -479691095;
                    i12 = iM6982 ^ i5;
                    i11 = i4;
                    zM4369 = zM4369;
                    break;
                case -1791631486:
                case 939112536:
                    str = strM6570;
                    zM4369 = zM4369;
                    if (!zM64310) {
                        strM6570 = str;
                        iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                        i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                        i3 = -1783980219;
                        i12 = iM2566 ^ i3;
                        shortcutActivity = this;
                        zM4369 = zM4369;
                    } else {
                        iM6981 = C0630.m2566("ۙۖ") ^ i9;
                        i = ((iM6981 ^ i10) * (-12447)) ^ 30026317;
                        i2 = -1967291554;
                        zM4369 = zM4369;
                        String str5 = str;
                        i12 = iM6981 ^ i2;
                        i11 = i;
                        strM6570 = str5;
                    }
                    break;
                case -1776095903:
                case 1371093711:
                    zM4369 = zM4369;
                    zM64311 = ViewOnClickListenerC1958.m6437(strM6570, C0964.m3396(f67, 233, 20, i13));
                    iM6982 = (C2105.m6981("᩷ۧ") + i9) * (-41);
                    i4 = ((iM6982 ^ i10) * (-26649)) ^ (-996347349);
                    i5 = 940132996;
                    i12 = iM6982 ^ i5;
                    i11 = i4;
                    zM4369 = zM4369;
                    break;
                case -1678850600:
                case 793537324:
                    str = strM6570;
                    zM4369 = zM4369;
                    if (!zM64314) {
                        strM6570 = str;
                        iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                        i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                        i3 = -1783980219;
                        i12 = iM2566 ^ i3;
                        shortcutActivity = this;
                        zM4369 = zM4369;
                    } else {
                        iM6981 = C0630.m2566("ۙۖ") ^ i9;
                        i = ((iM6981 ^ i10) * (-12447)) ^ 30026317;
                        i2 = -1967291554;
                        zM4369 = zM4369;
                        String str6 = str;
                        i12 = iM6981 ^ i2;
                        i11 = i;
                        strM6570 = str6;
                    }
                    break;
                case -1638879990:
                case 437854608:
                    zM4369 = zM4369;
                    i6 = 67108864;
                    cls = ActivityC16315.class;
                    z = true;
                    i7 = 268435456;
                    switch (iM6983) {
                        case -2122614245:
                            iM6982 = C0630.m2566("֨᩵") ^ i10;
                            i4 = ((iM6982 ^ i9) * (-14779)) ^ (-1281155580);
                            i5 = -504788597;
                            i12 = iM6982 ^ i5;
                            i11 = i4;
                            break;
                        case -1912197360:
                            iM6982 = C0630.m2566("ۘ᩺") ^ i9;
                            i4 = ((iM6982 ^ i10) * 12695) ^ 1024597035;
                            i5 = -192428853;
                            i12 = iM6982 ^ i5;
                            i11 = i4;
                            break;
                        case -1756800204:
                            iM6982 = (C2105.m6981("ܿ֨") ^ i9) * 91;
                            i4 = ((iM6982 ^ i10) * (-9541)) ^ (-1293632409);
                            i5 = 725938478;
                            i12 = iM6982 ^ i5;
                            i11 = i4;
                            break;
                        case -1510480482:
                            iM6982 = (C2105.m6981("֨۬") ^ i10) * 97;
                            i4 = ((iM6982 ^ i9) * 12709) ^ 1382692262;
                            i5 = -629574061;
                            i12 = iM6982 ^ i5;
                            i11 = i4;
                            break;
                        case -1409195376:
                            iM6982 = C0630.m2566("᩶᩶") ^ i9;
                            i4 = ((iM6982 ^ i10) * (-28133)) ^ 21517439;
                            i5 = 789744573;
                            i12 = iM6982 ^ i5;
                            i11 = i4;
                            break;
                        case -1263242200:
                            iM6982 = C0630.m2566("ۜۤ") ^ i10;
                            i4 = ((iM6982 ^ i9) * 28171) ^ 964504223;
                            i5 = -1189706728;
                            i12 = iM6982 ^ i5;
                            i11 = i4;
                            break;
                        case -1212308659:
                            iM6982 = (C2105.m6981("ܰ۟") + i9) * (-87);
                            i4 = ((iM6982 ^ i10) * (-22037)) ^ (-1817407485);
                            i5 = 622534299;
                            i12 = iM6982 ^ i5;
                            i11 = i4;
                            break;
                        case -1119104947:
                            iM6982 = C0630.m2566("֡᩵") ^ i10;
                            i4 = ((iM6982 ^ i9) * 14371) ^ (-1948330828);
                            i5 = 929202793;
                            i12 = iM6982 ^ i5;
                            i11 = i4;
                            break;
                        case -1097461934:
                            iM6982 = (C2105.m6981("֨ۨ") ^ i10) * 123;
                            i4 = ((iM6982 ^ i9) * 15175) ^ 425053312;
                            i5 = 724002726;
                            i12 = iM6982 ^ i5;
                            i11 = i4;
                            break;
                        case -785778927:
                            iM6982 = C2105.m6981("ۙ᩹") ^ i9;
                            i4 = ((iM6982 ^ i10) * (-3691)) ^ 2048073441;
                            i5 = 773734703;
                            i12 = iM6982 ^ i5;
                            i11 = i4;
                            break;
                        case -667500459:
                            iM6982 = (C0630.m2566("᩷ܽ") ^ i10) * (-17);
                            i4 = ((iM6982 ^ i9) * 29477) ^ 213616152;
                            i5 = 853714140;
                            i12 = iM6982 ^ i5;
                            i11 = i4;
                            break;
                        case -593404262:
                            iM6982 = (C2105.m6981("ۨۖ") + i9) * (-73);
                            i4 = ((iM6982 ^ i10) * 31481) ^ (-1456489216);
                            i5 = 1345197756;
                            i12 = iM6982 ^ i5;
                            i11 = i4;
                            break;
                        case -560080238:
                            iM6982 = C2105.m6981("ܺ֫") ^ i9;
                            i4 = ((iM6982 ^ i10) * (-27363)) ^ 2088035955;
                            i5 = -552266676;
                            i12 = iM6982 ^ i5;
                            i11 = i4;
                            break;
                        case -474293814:
                            iM6982 = (C2105.m6981("ᩳ᩹") ^ i10) * (-65);
                            i4 = ((iM6982 ^ i9) * 32177) ^ 229136230;
                            i5 = 355276337;
                            i12 = iM6982 ^ i5;
                            i11 = i4;
                            break;
                        case -244759188:
                            iM6982 = (C2105.m6981("ۢۚ") ^ i10) * (-123);
                            i4 = ((iM6982 ^ i9) * (-20333)) ^ (-1206735655);
                            i5 = -1605160671;
                            i12 = iM6982 ^ i5;
                            i11 = i4;
                            break;
                        case 3178851:
                            iM6982 = (C2105.m6981("ۤ᩸") ^ i9) * (-121);
                            i4 = ((iM6982 ^ i10) * 757) ^ (-1604528231);
                            i5 = 1508005297;
                            i12 = iM6982 ^ i5;
                            i11 = i4;
                            break;
                        case 24954378:
                            iM6982 = (C0630.m2566("᩹֨") ^ i10) * 9;
                            i4 = ((iM6982 ^ i9) * (-23113)) ^ (-77666344);
                            i5 = 1303098102;
                            i12 = iM6982 ^ i5;
                            i11 = i4;
                            break;
                        case 35253639:
                            iM6982 = (i9 - C0630.m2566("֡ܰ")) * (-15);
                            i4 = ((iM6982 ^ i10) * 205) ^ (-1130473904);
                            i5 = -725857659;
                            i12 = iM6982 ^ i5;
                            i11 = i4;
                            break;
                        case 588746739:
                            iM6982 = (C2105.m6981("۠ܰ") + i9) * 25;
                            i4 = ((iM6982 ^ i10) * 2883) ^ (-602924272);
                            i5 = 1465725804;
                            i12 = iM6982 ^ i5;
                            i11 = i4;
                            break;
                        case 594671580:
                            iM6982 = C2105.m6981("۬ۙ") ^ i10;
                            i4 = ((iM6982 ^ i9) * 14201) ^ 1887633835;
                            i5 = 1193382060;
                            i12 = iM6982 ^ i5;
                            i11 = i4;
                            break;
                        case 1041335639:
                            iM6982 = C2105.m6981("۬᩺") ^ i9;
                            i4 = ((iM6982 ^ i10) * (-6607)) ^ (-1567042859);
                            i5 = 486757767;
                            i12 = iM6982 ^ i5;
                            i11 = i4;
                            break;
                        case 1634302827:
                            iM6982 = (C0630.m2566("ܺᩳ") ^ i10) * q.h;
                            i4 = ((iM6982 ^ i9) * (-19483)) ^ 824801079;
                            i5 = -612791715;
                            i12 = iM6982 ^ i5;
                            i11 = i4;
                            break;
                        case 1721154072:
                            iM6982 = C2105.m6981("ۡۢ") ^ i9;
                            i4 = ((iM6982 ^ i10) * (-10579)) ^ 484154095;
                            i5 = 1417689303;
                            i12 = iM6982 ^ i5;
                            i11 = i4;
                            break;
                        case 1841977966:
                            iM6982 = (C2105.m6981("ۜ֫") + i10) * 29;
                            i4 = ((iM6982 ^ i9) * 27405) ^ (-1031702174);
                            i5 = 540463898;
                            i12 = iM6982 ^ i5;
                            i11 = i4;
                            break;
                        case 2116182360:
                            iM6982 = (i9 - C0630.m2566("᩶۬")) * (-19);
                            i4 = ((iM6982 ^ i10) * (-14537)) ^ 429018252;
                            i5 = 718676938;
                            i12 = iM6982 ^ i5;
                            i11 = i4;
                            break;
                        default:
                            iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                            i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                            i3 = -1783980219;
                            i12 = iM2566 ^ i3;
                            shortcutActivity = this;
                            break;
                    }
                    zM4369 = zM4369;
                    break;
                case -1599828386:
                case -1569281603:
                    zM4369 = zM4369;
                    zM43610 = C1294.m4369(strM6570, C3537.m10748(f67, UMErrorCode.E_UM_BE_JSON_FAILED, 9, i13));
                    iM6982 = (C0630.m2566("۬۫") + i9) * (-73);
                    i4 = ((iM6982 ^ i10) * (-22069)) ^ 2005799910;
                    i5 = 743664611;
                    i12 = iM6982 ^ i5;
                    i11 = i4;
                    zM4369 = zM4369;
                    break;
                case -1498368102:
                case 1484177926:
                    zM4369 = zM4369;
                    Intent intentM12571 = C4159.m12571(this);
                    try {
                        strM6570 = AbstractC2021.m6570(intentM12571, C4075.m12252(f67, 81, 9, i13));
                        strM6571 = AbstractC2021.m6570(intentM12571, C0964.m3396(f67, 90, 4, i13));
                        zM3405 = C0964.m3403(strM6570);
                        int iM6984 = (C2105.m6981("۠ܶ") ^ i9) * 3;
                        i4 = ((iM6984 ^ i10) * 10731) ^ 815964005;
                        i12 = iM6984 ^ (-1117750751);
                        shortcutActivity = this;
                        intent = intentM12571;
                        i11 = i4;
                    } catch (Exception unused4) {
                        intent = intentM12571;
                        iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                        i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                        i3 = -1783980219;
                        i12 = iM2566 ^ i3;
                        shortcutActivity = this;
                    }
                    zM4369 = zM4369;
                    break;
                case -1434975315:
                case -850726128:
                    str = strM6570;
                    zM4369 = zM4369;
                    if (!zM64315) {
                        strM6570 = str;
                        iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                        i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                        i3 = -1783980219;
                        i12 = iM2566 ^ i3;
                        shortcutActivity = this;
                        zM4369 = zM4369;
                    } else {
                        iM6981 = (i10 - C2105.m6981("᩺ۚ")) * 75;
                        i = ((iM6981 ^ i9) * (-12409)) ^ (-140950570);
                        i2 = -2072613783;
                        zM4369 = zM4369;
                        String str7 = str;
                        i12 = iM6981 ^ i2;
                        i11 = i;
                        strM6570 = str7;
                    }
                    break;
                case -1399177351:
                case -496079995:
                    i13 = 43881;
                    iM2566 = C2105.m6981("ᩳ᩺") ^ i9;
                    i11 = ((iM2566 ^ i10) * (-9837)) ^ (-768453236);
                    i3 = 1183922457;
                    i12 = iM2566 ^ i3;
                    shortcutActivity = this;
                    zM4369 = zM4369;
                    break;
                case -1387268765:
                case -474209382:
                    str = strM6570;
                    zM4369 = zM4369;
                    Main.m62(shortcutActivity, intent.getExtras(), z);
                    strM6570 = str;
                    iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                    i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                    i3 = -1783980219;
                    i12 = iM2566 ^ i3;
                    shortcutActivity = this;
                    zM4369 = zM4369;
                    break;
                case -1312507355:
                case 1655664324:
                    zM4369 = zM4369;
                    zM64315 = ViewOnClickListenerC1958.m6437(strM6570, RunnableC1108.m3789(f67, 302, 4, i13));
                    iM6982 = (C2105.m6981("۫۬") + i9) * 109;
                    i4 = ((iM6982 ^ i10) * 25799) ^ 7215790;
                    i5 = 2045980181;
                    i12 = iM6982 ^ i5;
                    i11 = i4;
                    zM4369 = zM4369;
                    break;
                case -1279735403:
                case 1624096323:
                    zM4369 = zM4369;
                    zM43618 = C1294.m4369(strM6570, RunnableC1108.m3789(f67, 333, 13, i13));
                    iM6982 = (i9 - C2105.m6981("᩺ᩴ")) * 47;
                    i4 = ((iM6982 ^ i10) * (-4567)) ^ 112672281;
                    i5 = -1263581770;
                    i12 = iM6982 ^ i5;
                    i11 = i4;
                    zM4369 = zM4369;
                    break;
                case -1268850034:
                case -1008366736:
                    zM4369 = zM4369;
                    zM6439 = ViewOnClickListenerC1958.m6437(strM6570, C4263.m12817(f67, 179, 17, i13));
                    iM6982 = (C0630.m2566("᩸ۧ") ^ i10) * (-49);
                    i4 = ((iM6982 ^ i9) * (-14201)) ^ 397372870;
                    i5 = 1320230790;
                    i12 = iM6982 ^ i5;
                    i11 = i4;
                    zM4369 = zM4369;
                    break;
                case -1116627687:
                case 809829617:
                    zM4369 = zM4369;
                    zM64317 = ViewOnClickListenerC1958.m6437(strM6570, C0237.m1483(f67, 383, 21, i13));
                    iM6982 = (i9 - C2105.m6981("ۛۚ")) * 7;
                    i4 = ((iM6982 ^ i10) * 7623) ^ (-1254994571);
                    i5 = 1603640798;
                    i12 = iM6982 ^ i5;
                    i11 = i4;
                    zM4369 = zM4369;
                    break;
                case -1115113920:
                case -379006874:
                    try {
                        Main.m62(shortcutActivity, intent.getExtras(), z);
                        break;
                    } catch (Exception unused5) {
                    }
                    zM4369 = zM4369;
                    iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                    i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                    i3 = -1783980219;
                    i12 = iM2566 ^ i3;
                    shortcutActivity = this;
                    zM4369 = zM4369;
                    break;
                case -1110476315:
                case 1599470490:
                    str = strM6570;
                    zM4369 = zM4369;
                    if (!zM64311) {
                        strM6570 = str;
                        iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                        i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                        i3 = -1783980219;
                        i12 = iM2566 ^ i3;
                        shortcutActivity = this;
                        zM4369 = zM4369;
                    } else {
                        iM6981 = C0630.m2566("ۙۖ") ^ i9;
                        i = ((iM6981 ^ i10) * (-12447)) ^ 30026317;
                        i2 = -1967291554;
                        zM4369 = zM4369;
                        String str8 = str;
                        i12 = iM6981 ^ i2;
                        i11 = i;
                        strM6570 = str8;
                    }
                    break;
                case -1109043938:
                case 2039816109:
                    str = strM6570;
                    zM4369 = zM4369;
                    if (!zM43621) {
                        strM6570 = str;
                        iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                        i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                        i3 = -1783980219;
                        i12 = iM2566 ^ i3;
                        shortcutActivity = this;
                        zM4369 = zM4369;
                    } else {
                        iM6981 = (C2105.m6981("ۚ֡") + i9) * 27;
                        i = ((iM6981 ^ i10) * (-13309)) ^ 374951415;
                        i2 = -362932133;
                        zM4369 = zM4369;
                        String str9 = str;
                        i12 = iM6981 ^ i2;
                        i11 = i;
                        strM6570 = str9;
                    }
                    break;
                case -1098057557:
                case -347203801:
                    zM4369 = zM4369;
                    strM6570 = strM6570;
                    zM43622 = C1294.m4369(strM6570, C1294.m4373(f67, 436, 16, i13));
                    iM6982 = C0630.m2566("ۧۜ") ^ i10;
                    i4 = ((iM6982 ^ i9) * (-2975)) ^ 1968752971;
                    i5 = -855078381;
                    i12 = iM6982 ^ i5;
                    i11 = i4;
                    zM4369 = zM4369;
                    break;
                case -1010019356:
                case 1202539774:
                    zM4369 = zM4369;
                    zM6437 = ViewOnClickListenerC1958.m6437(strM6570, RunnableC3474.m10633(f67, 119, 12, i13));
                    iM6982 = (C2105.m6981("ۨۨ") ^ i10) * (-25);
                    i4 = ((iM6982 ^ i9) * 26765) ^ (-622996892);
                    i5 = -432738546;
                    i12 = iM6982 ^ i5;
                    i11 = i4;
                    zM4369 = zM4369;
                    break;
                case -1002971804:
                case 1301388925:
                    zM4369 = zM4369;
                    zM43612 = C1294.m4369(strM6570, C3537.m10748(f67, DHParameters.DEFAULT_MINIMUM_LENGTH, 7, i13));
                    iM6982 = C2105.m6981("᩶ۚ") ^ i9;
                    i4 = ((iM6982 ^ i10) * (-2733)) ^ 1876281673;
                    i5 = 590625507;
                    i12 = iM6982 ^ i5;
                    i11 = i4;
                    zM4369 = zM4369;
                    break;
                case -1000273732:
                case -985117555:
                    zM4369 = zM4369;
                    zM43617 = C1294.m4369(strM6570, C1294.m4373(f67, 322, 11, i13));
                    iM6982 = C2105.m6981("ۤܳ") ^ i10;
                    i4 = ((iM6982 ^ i9) * (-26691)) ^ (-1083775546);
                    i5 = 258962819;
                    i12 = iM6982 ^ i5;
                    i11 = i4;
                    zM4369 = zM4369;
                    break;
                case -994938478:
                case -985604155:
                    str = strM6570;
                    zM4369 = zM4369;
                    if (!zM43618) {
                        strM6570 = str;
                        iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                        i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                        i3 = -1783980219;
                        i12 = iM2566 ^ i3;
                        shortcutActivity = this;
                        zM4369 = zM4369;
                    } else {
                        iM6981 = C2105.m6981("᩻ᩳ") ^ i10;
                        i = ((iM6981 ^ i9) * (-287)) ^ 2037038235;
                        i2 = 2009960220;
                        zM4369 = zM4369;
                        String str10 = str;
                        i12 = iM6981 ^ i2;
                        i11 = i;
                        strM6570 = str10;
                    }
                    break;
                case -970626621:
                case -599556523:
                    str = strM6570;
                    zM4369 = zM4369;
                    Intent intent6 = new Intent(shortcutActivity, (Class<?>) ViewOnClickListenerC2040.class);
                    C1711.m5738(intent6, i7);
                    C22628.m50617(shortcutActivity, intent6);
                    strM6570 = str;
                    iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                    i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                    i3 = -1783980219;
                    i12 = iM2566 ^ i3;
                    shortcutActivity = this;
                    zM4369 = zM4369;
                    break;
                case -918874904:
                case 148965394:
                    str = strM6570;
                    zM4369 = zM4369;
                    if (!zM43620) {
                        strM6570 = str;
                        iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                        i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                        i3 = -1783980219;
                        i12 = iM2566 ^ i3;
                        shortcutActivity = this;
                        zM4369 = zM4369;
                    } else {
                        iM6981 = C0630.m2566("ۚ۬") ^ i9;
                        i = ((iM6981 ^ i10) * (-19493)) ^ (-1856782175);
                        i2 = -1214292737;
                        zM4369 = zM4369;
                        String str11 = str;
                        i12 = iM6981 ^ i2;
                        i11 = i;
                        strM6570 = str11;
                    }
                    break;
                case -913671624:
                case 648361190:
                    str = strM6570;
                    zM4369 = zM4369;
                    zM12824 = C4263.m12824(strM6571);
                    iM6981 = (C2105.m6981("ۙۤ") ^ i9) * (-3);
                    i = ((iM6981 ^ i10) * (-11459)) ^ (-1432120210);
                    i2 = 1530838659;
                    zM4369 = zM4369;
                    String str12 = str;
                    i12 = iM6981 ^ i2;
                    i11 = i;
                    strM6570 = str12;
                    break;
                case -887328181:
                case 354568743:
                    i13 = 32247;
                    iM2566 = C2105.m6981("ᩳ᩺") ^ i9;
                    i11 = ((iM2566 ^ i10) * (-9837)) ^ (-768453236);
                    i3 = 1183922457;
                    i12 = iM2566 ^ i3;
                    shortcutActivity = this;
                    zM4369 = zM4369;
                    break;
                case -828788726:
                case 2100109658:
                    zM4369 = zM4369;
                    zM6438 = ViewOnClickListenerC1958.m6437(strM6570, C2167.m7159(f67, 131, 17, i13));
                    iM6982 = C2105.m6981("ۨ۠") ^ i9;
                    i4 = ((iM6982 ^ i10) * 27301) ^ (-203114335);
                    i5 = 870337409;
                    i12 = iM6982 ^ i5;
                    i11 = i4;
                    zM4369 = zM4369;
                    break;
                case -792366782:
                case -611115981:
                    zM4369 = zM4369;
                    iM6983 = C2105.m6981(strM6570);
                    iM6982 = C2105.m6981("ۧۛ") ^ i10;
                    i4 = ((iM6982 ^ i9) * 15097) ^ 376219140;
                    i5 = -291619671;
                    i12 = iM6982 ^ i5;
                    i11 = i4;
                    zM4369 = zM4369;
                    break;
                case -791094353:
                case 737359238:
                    zM4369 = zM4369;
                    C2272.m7505(this);
                    iM6982 = C0630.m2566("ܿܳ") ^ i9;
                    i4 = ((iM6982 ^ i10) * 20221) ^ 10511579;
                    i5 = -664974776;
                    i12 = iM6982 ^ i5;
                    i11 = i4;
                    zM4369 = zM4369;
                    break;
                case -777411406:
                case 1113542446:
                    str = strM6570;
                    zM4369 = zM4369;
                    if (!zM64316) {
                        strM6570 = str;
                        iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                        i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                        i3 = -1783980219;
                        i12 = iM2566 ^ i3;
                        shortcutActivity = this;
                        zM4369 = zM4369;
                    } else {
                        iM6981 = C0630.m2566("ۚ۬") ^ i9;
                        i = ((iM6981 ^ i10) * (-19493)) ^ (-1856782175);
                        i2 = -1214292737;
                        zM4369 = zM4369;
                        String str13 = str;
                        i12 = iM6981 ^ i2;
                        i11 = i;
                        strM6570 = str13;
                    }
                    break;
                case -768392255:
                case 2084377240:
                    str = strM6570;
                    zM4369 = zM4369;
                    if (!zM6439) {
                        strM6570 = str;
                        iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                        i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                        i3 = -1783980219;
                        i12 = iM2566 ^ i3;
                        shortcutActivity = this;
                        zM4369 = zM4369;
                    } else {
                        iM6981 = C0630.m2566("ۙۖ") ^ i9;
                        i = ((iM6981 ^ i10) * (-12447)) ^ 30026317;
                        i2 = -1967291554;
                        zM4369 = zM4369;
                        String str14 = str;
                        i12 = iM6981 ^ i2;
                        i11 = i;
                        strM6570 = str14;
                    }
                    break;
                case -720934332:
                case 387395983:
                    zM4369 = zM4369;
                    zM43616 = C1294.m4369(strM6570, C3537.m10748(f67, 306, 16, i13));
                    iM6982 = (C2105.m6981("ۜۜ") + i10) * 119;
                    i4 = ((iM6982 ^ i9) * 19207) ^ 1912656778;
                    i5 = 1946076491;
                    i12 = iM6982 ^ i5;
                    i11 = i4;
                    zM4369 = zM4369;
                    break;
                case -662705952:
                case 834489390:
                    str = strM6570;
                    zM4369 = zM4369;
                    if (!zM43616) {
                        strM6570 = str;
                        iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                        i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                        i3 = -1783980219;
                        i12 = iM2566 ^ i3;
                        shortcutActivity = this;
                        zM4369 = zM4369;
                    } else {
                        iM6981 = C0630.m2566("ۙۖ") ^ i9;
                        i = ((iM6981 ^ i10) * (-12447)) ^ 30026317;
                        i2 = -1967291554;
                        zM4369 = zM4369;
                        String str15 = str;
                        i12 = iM6981 ^ i2;
                        i11 = i;
                        strM6570 = str15;
                    }
                    break;
                case -612024924:
                case 1297681637:
                    str = strM6570;
                    zM4369 = zM4369;
                    zM3403 = C0964.m3403(strM6571);
                    iM6981 = C0630.m2566("ܺܺ") ^ i10;
                    i = ((iM6981 ^ i9) * (-11241)) ^ 46484300;
                    i2 = -811404744;
                    zM4369 = zM4369;
                    String str16 = str;
                    i12 = iM6981 ^ i2;
                    i11 = i;
                    strM6570 = str16;
                    break;
                case -609196773:
                case 2050821080:
                    zM4369 = zM4369;
                    zM43615 = C1294.m4369(strM6570, C3911.m11919(f67, 202, 13, i13));
                    iM6982 = (C0630.m2566("᩷ܶ") + i9) * 101;
                    i4 = ((iM6982 ^ i10) * 18931) ^ 952393322;
                    i5 = 698738332;
                    i12 = iM6982 ^ i5;
                    i11 = i4;
                    zM4369 = zM4369;
                    break;
                case -495578079:
                case 1446111161:
                    zM4369 = zM4369;
                    zM43614 = C1294.m4369(strM6570, C3245.m9934(f67, 196, 6, i13));
                    iM6982 = (C2105.m6981("ۧۚ") ^ i9) * 35;
                    i4 = ((iM6982 ^ i10) * (-26185)) ^ 79776879;
                    i5 = -1530274984;
                    i12 = iM6982 ^ i5;
                    i11 = i4;
                    zM4369 = zM4369;
                    break;
                case -430745523:
                case -117783595:
                    str = strM6570;
                    zM4369 = zM4369;
                    if (!zM6437) {
                        strM6570 = str;
                        iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                        i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                        i3 = -1783980219;
                        i12 = iM2566 ^ i3;
                        shortcutActivity = this;
                        zM4369 = zM4369;
                    } else {
                        iM6981 = C0630.m2566("ۙۖ") ^ i9;
                        i = ((iM6981 ^ i10) * (-12447)) ^ 30026317;
                        i2 = -1967291554;
                        zM4369 = zM4369;
                        String str17 = str;
                        i12 = iM6981 ^ i2;
                        i11 = i;
                        strM6570 = str17;
                    }
                    break;
                case -415088250:
                case 1703767733:
                    RunnableC1108.m3781(this);
                    return;
                case -238434855:
                case 967554555:
                    zM4369 = zM4369;
                    zM64310 = ViewOnClickListenerC1958.m6437(strM6570, ServiceConnectionC3453.m10568(f67, 215, 18, i13));
                    iM6982 = C0630.m2566("ۤܶ") ^ i10;
                    i4 = ((iM6982 ^ i9) * (-29541)) ^ 1026031618;
                    i5 = 1639105213;
                    i12 = iM6982 ^ i5;
                    i11 = i4;
                    zM4369 = zM4369;
                    break;
                case -163211279:
                case 844703113:
                    str = strM6570;
                    zM4369 = zM4369;
                    if (!zM64312) {
                        strM6570 = str;
                        iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                        i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                        i3 = -1783980219;
                        i12 = iM2566 ^ i3;
                        shortcutActivity = this;
                        zM4369 = zM4369;
                    } else {
                        iM6981 = (i10 - C2105.m6981("᩺ۚ")) * 75;
                        i = ((iM6981 ^ i9) * (-12409)) ^ (-140950570);
                        i2 = -2072613783;
                        zM4369 = zM4369;
                        String str18 = str;
                        i12 = iM6981 ^ i2;
                        i11 = i;
                        strM6570 = str18;
                    }
                    break;
                case -129838142:
                case 767846649:
                    str = strM6570;
                    zM4369 = zM4369;
                    if (!zM43610) {
                        strM6570 = str;
                        iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                        i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                        i3 = -1783980219;
                        i12 = iM2566 ^ i3;
                        shortcutActivity = this;
                        zM4369 = zM4369;
                    } else {
                        iM6981 = C0630.m2566("ܽۧ") ^ i10;
                        i = ((iM6981 ^ i9) * 1561) ^ 503058769;
                        i2 = -1176622526;
                        zM4369 = zM4369;
                        String str19 = str;
                        i12 = iM6981 ^ i2;
                        i11 = i;
                        strM6570 = str19;
                    }
                    break;
                case -78040085:
                case 591895432:
                    zM4369 = zM4369;
                    zM64314 = ViewOnClickListenerC1958.m6437(strM6570, C0050.m948(f67, WhirlpoolDigest.REDUCTION_POLYNOMIAL, 17, i13));
                    iM6982 = (C2105.m6981("ۚܺ") + i10) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i4 = ((iM6982 ^ i9) * 29841) ^ 990962080;
                    i5 = 678443791;
                    i12 = iM6982 ^ i5;
                    i11 = i4;
                    zM4369 = zM4369;
                    break;
                case -68654943:
                case 1295878886:
                    str = strM6570;
                    zM4369 = zM4369;
                    if (!zM43617) {
                        strM6570 = str;
                        iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                        i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                        i3 = -1783980219;
                        i12 = iM2566 ^ i3;
                        shortcutActivity = this;
                        zM4369 = zM4369;
                    } else {
                        iM6981 = C0630.m2566("ۙۖ") ^ i9;
                        i = ((iM6981 ^ i10) * (-12447)) ^ 30026317;
                        i2 = -1967291554;
                        zM4369 = zM4369;
                        String str110 = str;
                        i12 = iM6981 ^ i2;
                        i11 = i;
                        strM6570 = str110;
                    }
                    break;
                case -34631965:
                case 1997841904:
                    str = strM6570;
                    zM4369 = zM4369;
                    if (!zM43612) {
                        strM6570 = str;
                        iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                        i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                        i3 = -1783980219;
                        i12 = iM2566 ^ i3;
                        shortcutActivity = this;
                        zM4369 = zM4369;
                    } else {
                        iM6981 = C0630.m2566("ۚ۬") ^ i9;
                        i = ((iM6981 ^ i10) * (-19493)) ^ (-1856782175);
                        i2 = -1214292737;
                        zM4369 = zM4369;
                        String str111 = str;
                        i12 = iM6981 ^ i2;
                        i11 = i;
                        strM6570 = str111;
                    }
                    break;
                case -5965861:
                case 1515706214:
                    str = strM6570;
                    zM4369 = zM4369;
                    if (!zM43619) {
                        strM6570 = str;
                        iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                        i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                        i3 = -1783980219;
                        i12 = iM2566 ^ i3;
                        shortcutActivity = this;
                        zM4369 = zM4369;
                    } else {
                        iM6981 = C0630.m2566("ۙۖ") ^ i9;
                        i = ((iM6981 ^ i10) * (-12447)) ^ 30026317;
                        i2 = -1967291554;
                        zM4369 = zM4369;
                        String str112 = str;
                        i12 = iM6981 ^ i2;
                        i11 = i;
                        strM6570 = str112;
                    }
                    break;
                case 131714975:
                case 1997811134:
                    str = strM6570;
                    zM4369 = zM4369;
                    zM3404 = C0964.m3403(strM6571);
                    iM6981 = C0630.m2566("ܶ᩹") ^ i10;
                    i = ((iM6981 ^ i9) * 7695) ^ (-2010284566);
                    i2 = 1305496417;
                    zM4369 = zM4369;
                    String str113 = str;
                    i12 = iM6981 ^ i2;
                    i11 = i;
                    strM6570 = str113;
                    break;
                case 148362306:
                case 313643849:
                    zM4369 = zM4369;
                    super.onCreate(bundle);
                    iM2566 = C2105.m6981("۬ܿ") ^ i10;
                    i11 = ((iM2566 ^ i9) * 24721) ^ 1015670917;
                    i3 = -1393435080;
                    i12 = iM2566 ^ i3;
                    shortcutActivity = this;
                    zM4369 = zM4369;
                    break;
                case 297131023:
                case 992334997:
                    str = strM6570;
                    zM4369 = zM4369;
                    if (!zM3403) {
                        iM6981 = (C0630.m2566("ܰۙ") + i9) * 27;
                        i = ((iM6981 ^ i10) * 19641) ^ (-1140017954);
                        i2 = 1545742500;
                        zM4369 = zM4369;
                        String str114 = str;
                        i12 = iM6981 ^ i2;
                        i11 = i;
                        strM6570 = str114;
                    } else {
                        strM6570 = str;
                        iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                        i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                        i3 = -1783980219;
                        i12 = iM2566 ^ i3;
                        shortcutActivity = this;
                        zM4369 = zM4369;
                    }
                    break;
                case 325509174:
                case 979244448:
                    str = strM6570;
                    zM4369 = zM4369;
                    if (!zM64317) {
                        strM6570 = str;
                        iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                        i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                        i3 = -1783980219;
                        i12 = iM2566 ^ i3;
                        shortcutActivity = this;
                        zM4369 = zM4369;
                    } else {
                        iM6981 = C0630.m2566("ۙۖ") ^ i9;
                        i = ((iM6981 ^ i10) * (-12447)) ^ 30026317;
                        i2 = -1967291554;
                        zM4369 = zM4369;
                        String str115 = str;
                        i12 = iM6981 ^ i2;
                        i11 = i;
                        strM6570 = str115;
                    }
                    break;
                case 359563691:
                case 1537782684:
                    zM4369 = C1294.m4369(strM6570, C0237.m1483(f67, 94, 16, i13));
                    int iM2568 = (i10 - C0630.m2566("ۖ֫")) * (-115);
                    i12 = iM2568 ^ (-1453180070);
                    i11 = ((iM2568 ^ i9) * (-16917)) ^ 1008581933;
                    break;
                case 452176370:
                case 1337611969:
                    str = strM6570;
                    zM4369 = zM4369;
                    if (!zM43615) {
                        strM6570 = str;
                        iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                        i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                        i3 = -1783980219;
                        i12 = iM2566 ^ i3;
                        shortcutActivity = this;
                        zM4369 = zM4369;
                    } else {
                        iM6981 = C0630.m2566("ᩳܳ") ^ i10;
                        i = ((iM6981 ^ i9) * 26287) ^ (-872096304);
                        i2 = -641712542;
                        zM4369 = zM4369;
                        String str116 = str;
                        i12 = iM6981 ^ i2;
                        i11 = i;
                        strM6570 = str116;
                    }
                    break;
                case 480643875:
                case 2093703798:
                    str = strM6570;
                    zM4369 = zM4369;
                    if (!zM43611) {
                        strM6570 = str;
                        iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                        i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                        i3 = -1783980219;
                        i12 = iM2566 ^ i3;
                        shortcutActivity = this;
                        zM4369 = zM4369;
                    } else {
                        iM6981 = C2105.m6981("ᩴ۟") ^ i10;
                        i = ((iM6981 ^ i9) * (-19115)) ^ 1046651492;
                        i2 = -211995495;
                        zM4369 = zM4369;
                        String str117 = str;
                        i12 = iM6981 ^ i2;
                        i11 = i;
                        strM6570 = str117;
                    }
                    break;
                case 605052020:
                case 1614675180:
                    str = strM6570;
                    zM4369 = zM4369;
                    if (!zM43614) {
                        strM6570 = str;
                        iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                        i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                        i3 = -1783980219;
                        i12 = iM2566 ^ i3;
                        shortcutActivity = this;
                        zM4369 = zM4369;
                    } else {
                        iM6981 = (i10 - C2105.m6981("᩺ۚ")) * 75;
                        i = ((iM6981 ^ i9) * (-12409)) ^ (-140950570);
                        i2 = -2072613783;
                        zM4369 = zM4369;
                        String str118 = str;
                        i12 = iM6981 ^ i2;
                        i11 = i;
                        strM6570 = str118;
                    }
                    break;
                case 720694533:
                case 1740845902:
                    str = strM6570;
                    zM4369 = zM4369;
                    if (!zM6438) {
                        strM6570 = str;
                        iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                        i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                        i3 = -1783980219;
                        i12 = iM2566 ^ i3;
                        shortcutActivity = this;
                        zM4369 = zM4369;
                    } else {
                        iM6981 = C0630.m2566("ۙۖ") ^ i9;
                        i = ((iM6981 ^ i10) * (-12447)) ^ 30026317;
                        i2 = -1967291554;
                        zM4369 = zM4369;
                        String str119 = str;
                        i12 = iM6981 ^ i2;
                        i11 = i;
                        strM6570 = str119;
                    }
                    break;
                case 759481519:
                case 1661047193:
                    str = strM6570;
                    zM4369 = zM4369;
                    Intent intent7 = new Intent(shortcutActivity, (Class<?>) ViewOnLayoutChangeListenerC7738.class);
                    C0798.m3009(intent7, i7);
                    C21923.m49344(shortcutActivity, intent7);
                    strM6570 = str;
                    iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                    i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                    i3 = -1783980219;
                    i12 = iM2566 ^ i3;
                    shortcutActivity = this;
                    zM4369 = zM4369;
                    break;
                case 865763197:
                case 1091179266:
                    zM4369 = zM4369;
                    if (zM3405) {
                        iM6982 = C2105.m6981("ۗۗ") ^ i9;
                        i4 = ((iM6982 ^ i10) * 213) ^ 1379464555;
                        i5 = 2144357201;
                    } else {
                        iM6982 = C2105.m6981("ۢܳ") ^ i10;
                        i4 = ((iM6982 ^ i9) * 26857) ^ 711290930;
                        i5 = 608332862;
                    }
                    i12 = iM6982 ^ i5;
                    i11 = i4;
                    zM4369 = zM4369;
                    break;
                case 898058449:
                case 1867304211:
                    str = strM6570;
                    zM4369 = zM4369;
                    Intent intent8 = new Intent(shortcutActivity, (Class<?>) ActivityC7365.class);
                    C1711.m5738(intent8, i7);
                    C21923.m49344(shortcutActivity, intent8);
                    strM6570 = str;
                    iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                    i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                    i3 = -1783980219;
                    i12 = iM2566 ^ i3;
                    shortcutActivity = this;
                    zM4369 = zM4369;
                    break;
                case 965711659:
                case 1768568015:
                    str = strM6570;
                    zM4369 = zM4369;
                    if (!zM43622) {
                        strM6570 = str;
                        iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                        i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                        i3 = -1783980219;
                        i12 = iM2566 ^ i3;
                        shortcutActivity = this;
                        zM4369 = zM4369;
                    } else {
                        iM6981 = C2105.m6981("ۛۢ") ^ i9;
                        i = ((iM6981 ^ i10) * 7283) ^ 464832708;
                        i2 = -942502658;
                        zM4369 = zM4369;
                        String str1110 = str;
                        i12 = iM6981 ^ i2;
                        i11 = i;
                        strM6570 = str1110;
                    }
                    break;
                case 1116617805:
                case 1178543719:
                    zM4369 = zM4369;
                    zM43613 = C1294.m4369(strM6570, ServiceConnectionC3453.m10568(f67, 167, 12, i13));
                    iM6982 = (C0630.m2566("ۢ۠") ^ i10) * 75;
                    i4 = ((iM6982 ^ i9) * 30473) ^ (-769048661);
                    i5 = -1441581593;
                    i12 = iM6982 ^ i5;
                    i11 = i4;
                    zM4369 = zM4369;
                    break;
                case 1172533434:
                case 2055274334:
                    ActivityC0921.m3283(shortcutActivity, strM6571);
                    zM4369 = zM4369;
                    iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                    i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                    i3 = -1783980219;
                    i12 = iM2566 ^ i3;
                    shortcutActivity = this;
                    zM4369 = zM4369;
                    break;
                case 1487617071:
                case 1536110908:
                    str = strM6570;
                    zM4369 = zM4369;
                    if (!zM12824) {
                        iM6981 = C2105.m6981("֨ۤ") ^ i9;
                        i = ((iM6981 ^ i10) * (-23657)) ^ (-1260517236);
                        i2 = -1119108499;
                        zM4369 = zM4369;
                        String str1111 = str;
                        i12 = iM6981 ^ i2;
                        i11 = i;
                        strM6570 = str1111;
                    } else {
                        strM6570 = str;
                        iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                        i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                        i3 = -1783980219;
                        i12 = iM2566 ^ i3;
                        shortcutActivity = this;
                        zM4369 = zM4369;
                    }
                    break;
                case 1734765195:
                case 2066899274:
                    zM4369 = zM4369;
                    zM43611 = C1294.m4369(strM6570, C7811.m20837(f67, 148, 12, i13));
                    iM6982 = C0630.m2566("ۚۢ") ^ i10;
                    i4 = ((iM6982 ^ i9) * (-5405)) ^ 702088739;
                    i5 = -2008254253;
                    i12 = iM6982 ^ i5;
                    i11 = i4;
                    zM4369 = zM4369;
                    break;
                case 1811634879:
                case 1896886584:
                    str = strM6570;
                    zM4369 = zM4369;
                    if (!zM64313) {
                        strM6570 = str;
                        iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                        i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                        i3 = -1783980219;
                        i12 = iM2566 ^ i3;
                        shortcutActivity = this;
                        zM4369 = zM4369;
                    } else {
                        iM6981 = C0630.m2566("ۧܰ") ^ i9;
                        i = ((iM6981 ^ i10) * 2097) ^ 152319911;
                        i2 = 701130419;
                        zM4369 = zM4369;
                        String str1112 = str;
                        i12 = iM6981 ^ i2;
                        i11 = i;
                        strM6570 = str1112;
                    }
                    break;
                default:
                    zM4369 = zM4369;
                    try {
                        zM43619 = C1294.m4369(strM6570, C3911.m11919(f67, 365, 18, i13));
                        iM6982 = C2105.m6981("۫ܶ") ^ i9;
                        i4 = ((iM6982 ^ i10) * 27473) ^ 147240572;
                        i5 = 242527994;
                        i12 = iM6982 ^ i5;
                        i11 = i4;
                    } catch (Exception unused6) {
                        iM2566 = (C0630.m2566("ۖۚ") + i10) * (-77);
                        i11 = ((iM2566 ^ i9) * (-16829)) ^ 859925231;
                        i3 = -1783980219;
                        i12 = iM2566 ^ i3;
                        shortcutActivity = this;
                    }
                    zM4369 = zM4369;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Bitmap m139(String str) throws Throwable {
        int iM2566;
        int i;
        AbstractC15440 abstractC15440 = null;
        AbstractC15440 abstractC15440M11176 = null;
        Bitmap bitmap = null;
        BufferedInputStream bufferedInputStreamM36518 = null;
        Bitmap bitmapDecodeStream = null;
        Throwable th = null;
        Object th2 = null;
        int i2 = -1098749178;
        int i3 = RunnableC0588.f2309;
        int i4 = C3537.f11231;
        int iM2567 = C0630.m2566("ᩳۨ") ^ i3;
        int i5 = ((iM2567 ^ i4) * 1459) ^ 1508239075;
        int i6 = -573128956;
        while (true) {
            int i7 = iM2567 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i4) * 28935) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2122170109:
                    case -1386214241:
                    case -738050540:
                    case 264199008:
                        return bitmap;
                    case -2013814880:
                    case -394098217:
                        try {
                            bufferedInputStreamM36518.close();
                            iM2567 = C2105.m6981("ۘ᩷") ^ i3;
                            i5 = ((iM2567 ^ i4) * 12159) ^ 136168323;
                            i6 = 1023220672;
                        } catch (Throwable th3) {
                            th2 = th3;
                            iM2567 = C0630.m2566("ۛ۬") ^ i4;
                            i5 = ((iM2567 ^ i3) * 2751) ^ (-1591781243);
                            i6 = -425789140;
                        }
                        break;
                    case -1993053587:
                    case -1608924269:
                        if (RunnableC1937.f6483 < 0) {
                            iM2567 = C0630.m2566("ۧۙ") ^ i3;
                            i5 = ((iM2567 ^ i4) * 3747) ^ (-1281192986);
                            i6 = 1149392461;
                            break;
                        }
                        iM2567 = (C0630.m2566("ܿ᩸") + i3) * 17;
                        i5 = ((iM2567 ^ i4) * (-30515)) ^ 1490658957;
                        i6 = 1911953257;
                        break;
                    case -1896607604:
                    case 1429692323:
                        if (C3019.m9255() > 0) {
                            iM2567 = C2105.m6981("ۛܽ") ^ i4;
                            i5 = ((iM2567 ^ i3) * EnumC5983.f18409) ^ (-486736345);
                            i6 = 1906316315;
                            break;
                        }
                        iM2567 = (i3 - C2105.m6981("ۗۧ")) * (-49);
                        i5 = ((iM2567 ^ i4) * 19685) ^ (-1867462712);
                        i6 = -2142409657;
                        break;
                    case -1801180969:
                    case -1631698669:
                        if (C3911.f12484 < 0) {
                            iM2567 = C2105.m6981("ܿܺ") ^ i3;
                            i5 = ((iM2567 ^ i4) * 11745) ^ (-1153031658);
                            i6 = 695756300;
                            break;
                        }
                        iM2567 = C0630.m2566("ۨ۬") ^ i4;
                        i5 = ((iM2567 ^ i3) * 21115) ^ (-839033141);
                        i6 = -101350614;
                        break;
                    case -1796331205:
                    case -238380170:
                        abstractC15440M11176 = C3663.m11176(abstractC15440, str);
                        if (C4263.f13799 > 0) {
                            iM2567 = (C2105.m6981("۬᩷") ^ i3) * 49;
                            i5 = ((iM2567 ^ i4) * (-2513)) ^ 440034511;
                            i6 = 1964180632;
                            break;
                        }
                        iM2567 = (C0630.m2566("ܿ᩸") + i3) * 17;
                        i5 = ((iM2567 ^ i4) * (-30515)) ^ 1490658957;
                        i6 = 1911953257;
                        break;
                        break;
                    case -1526330640:
                    case 1361956085:
                        throw th;
                    case -1333559688:
                    case 342354960:
                        if (C4159.m12565() < 0) {
                            iM2567 = (i3 - C2105.m6981("᩻۟")) * (-55);
                            i5 = ((iM2567 ^ i4) * 7749) ^ (-606172772);
                            i6 = 634504417;
                            break;
                        }
                        iM2567 = C2105.m6981("ۚۜ") ^ i4;
                        i5 = ((iM2567 ^ i3) * (-26523)) ^ 59696947;
                        i6 = -853416138;
                        break;
                    case -1192076057:
                    case -113340248:
                        return bitmapDecodeStream;
                    case -1126957058:
                    case 1402575042:
                        C1420.m4913();
                        RunnableC1937.m6387();
                        return null;
                    case -1098848530:
                    case 479735870:
                        if (!RunnableC1108.m3790()) {
                            iM2567 = C2105.m6981("᩹᩺") ^ i3;
                            i5 = ((iM2567 ^ i4) * 23201) ^ 1660876920;
                            i6 = -899602356;
                            break;
                        }
                        iM2567 = C0630.m2566("ۨ۬") ^ i4;
                        i5 = ((iM2567 ^ i3) * 21115) ^ (-839033141);
                        i6 = -101350614;
                        break;
                        break;
                    case -880780203:
                    case 1067176504:
                        C3019.m9255();
                        C0714.m2805();
                        iM2567 = C2105.m6981("᩹᩺") ^ i3;
                        i5 = ((iM2567 ^ i4) * 23201) ^ 1660876920;
                        i6 = -899602356;
                        break;
                        break;
                    case -832820126:
                    case -158097965:
                        if (C2105.f7037 == 0) {
                            iM2567 = (C2105.m6981("᩶ۢ") + i4) * 109;
                            i5 = ((iM2567 ^ i3) * (-1275)) ^ (-872920838);
                            i6 = 404566685;
                            break;
                        }
                        iM2567 = (C0630.m2566("ܿ᩸") + i3) * 17;
                        i5 = ((iM2567 ^ i4) * (-30515)) ^ 1490658957;
                        i6 = 1911953257;
                        break;
                        break;
                    case -813014215:
                    case 111188790:
                        if (AbstractC2021.f6743 <= 0) {
                            iM2567 = C2105.m6981("ۚۜ") ^ i4;
                            i5 = ((iM2567 ^ i3) * (-26523)) ^ 59696947;
                            i6 = -853416138;
                            break;
                            break;
                        }
                        iM2567 = C0630.m2566("ۨ۬") ^ i4;
                        i5 = ((iM2567 ^ i3) * 21115) ^ (-839033141);
                        i6 = -101350614;
                        break;
                        break;
                    case -796876564:
                    case 121113769:
                        bufferedInputStreamM36518 = abstractC15440M11176.m36518();
                        try {
                            bitmapDecodeStream = BitmapFactory.decodeStream(bufferedInputStreamM36518);
                            bufferedInputStreamM36518.close();
                            iM2567 = (C0630.m2566("۬ܿ") + i3) * 45;
                            i5 = ((iM2567 ^ i4) * 32607) ^ (-264163777);
                            i6 = -397639822;
                        } catch (Throwable th4) {
                            th = th4;
                            iM2567 = C0630.m2566("ᩳ᩹") ^ i4;
                            i5 = ((iM2567 ^ i3) * (-10457)) ^ 366802306;
                            i6 = 960023547;
                        }
                        break;
                    case -752484339:
                    case 1143896702:
                        abstractC15440 = f68;
                        if (!C1005.f3721) {
                            iM2567 = (C0630.m2566("ܿ᩸") + i3) * 17;
                            i5 = ((iM2567 ^ i4) * (-30515)) ^ 1490658957;
                            i6 = 1911953257;
                            break;
                            break;
                        }
                        iM2567 = C2105.m6981("ܳܰ") ^ i3;
                        i5 = ((iM2567 ^ i4) * (-1829)) ^ (-791574994);
                        i6 = -2007489083;
                        break;
                    case -389383938:
                    case 925314583:
                        try {
                            C2167.m7154(th, th2);
                            iM2567 = C2105.m6981("ۘ᩷") ^ i3;
                            i5 = ((iM2567 ^ i4) * 12159) ^ 136168323;
                            i6 = 1023220672;
                        } catch (Exception unused) {
                            iM2567 = C0630.m2566("᩹᩷") ^ i4;
                            i5 = ((iM2567 ^ i3) * 4575) ^ 934443822;
                            i6 = 2094682059;
                        }
                        break;
                    case -286124490:
                    case 1211805729:
                        if (C3537.f11231 >= 0) {
                            iM2567 = (i3 - C2105.m6981("ۗۧ")) * (-49);
                            i5 = ((iM2567 ^ i4) * 19685) ^ (-1867462712);
                            i6 = -2142409657;
                            break;
                            break;
                        }
                        iM2567 = C0630.m2566("ۖ᩸") ^ i3;
                        i5 = ((iM2567 ^ i4) * (-3175)) ^ 538461378;
                        i6 = -1503607819;
                        break;
                    case -141128145:
                    case 1415263521:
                        if (C0422.f1886 > 0) {
                            iM2567 = (C2105.m6981("᩷ۙ") ^ i4) * 59;
                            i5 = ((iM2567 ^ i3) * (-433)) ^ (-592487299);
                            i6 = -1051818481;
                            break;
                        }
                        iM2567 = (i3 - C2105.m6981("ۗۧ")) * (-49);
                        i5 = ((iM2567 ^ i4) * 19685) ^ (-1867462712);
                        i6 = -2142409657;
                        break;
                        break;
                    case -7928255:
                    case 203344380:
                        if (C1916.m6305(abstractC15440M11176)) {
                            iM2566 = (C0630.m2566("֡ۢ") ^ i3) * 51;
                            i5 = ((iM2566 ^ i4) * (-13891)) ^ 288899589;
                            i = -1439175773;
                        } else {
                            iM2566 = (C2105.m6981("۬ܽ") ^ i4) * 91;
                            i5 = ((iM2566 ^ i3) * (-14331)) ^ (-210911507);
                            i = -2102208135;
                        }
                        i7 = iM2566 ^ i;
                        bitmap = null;
                        break;
                    case 258053300:
                    case 676090468:
                        ViewOnClickListenerC1958.m6429();
                        if (C1294.f4556 >= 0) {
                            iM2567 = C0630.m2566("ۖ᩸") ^ i3;
                            i5 = ((iM2567 ^ i4) * (-3175)) ^ 538461378;
                            i6 = -1503607819;
                            break;
                            break;
                        }
                        iM2567 = C2105.m6981("᩹᩺") ^ i3;
                        i5 = ((iM2567 ^ i4) * 23201) ^ 1660876920;
                        i6 = -899602356;
                        break;
                        break;
                    case 295910455:
                    case 2124967537:
                        if (C1711.m5736() > 0) {
                            iM2567 = (i4 - C0630.m2566("᩵ۛ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                            i5 = ((iM2567 ^ i3) * 31473) ^ (-791800627);
                            i6 = 880543613;
                            break;
                        }
                        iM2567 = C0630.m2566("ۨ۬") ^ i4;
                        i5 = ((iM2567 ^ i3) * 21115) ^ (-839033141);
                        i6 = -101350614;
                        break;
                        break;
                    default:
                        if (!C0483.m2121()) {
                            iM2567 = (C0630.m2566("ܿ᩸") + i3) * 17;
                            i5 = ((iM2567 ^ i4) * (-30515)) ^ 1490658957;
                            i6 = 1911953257;
                            break;
                            break;
                        }
                        iM2567 = C0630.m2566("ۗܳ") ^ i4;
                        i5 = ((iM2567 ^ i3) * (-5877)) ^ 1275654174;
                        i6 = 544427008;
                        break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0425 A[PHI: r36
      0x0425: PHI (r36v7 java.lang.String) = (r36v2 java.lang.String), (r36v4 java.lang.String), (r36v1 java.lang.String), (r36v1 java.lang.String) binds: [B:65:0x0386, B:54:0x0305, B:45:0x02a9, B:6:0x00f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x04cc A[PHI: r33
      0x04cc: PHI (r33v3 java.lang.String) = (r33v1 java.lang.String), (r33v2 java.lang.String), (r33v4 java.lang.String) binds: [B:89:0x04b3, B:80:0x0441, B:72:0x03db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m138(AbstractActivityC3346 abstractActivityC3346, boolean z) {
        int iM6981;
        int i;
        int i2;
        int i3;
        short[] sArr;
        int i4;
        int iM2566;
        int i5;
        int iM6982;
        int i6;
        String str;
        int i7;
        short[] sArr2;
        short[] sArr3;
        int i8;
        int i9;
        short[] sArr4;
        int i10;
        String str2;
        ArrayList arrayList;
        int i11;
        int i12;
        String str3;
        int i13;
        short[] sArr5;
        int i14;
        short[] sArr6;
        short[] sArr7;
        int i15;
        int i16;
        short[] sArr8;
        int i17;
        String str4;
        String str5;
        int i18;
        String str6;
        int iM6983;
        int i19;
        int i20;
        String str7;
        int i21;
        int i22;
        short[] sArr9;
        int i23;
        short[] sArr10;
        ArrayList arrayList2;
        int i24;
        int i25;
        int i26;
        short[] sArr11;
        int i27;
        short[] sArr12;
        ArrayList arrayList3;
        int i28;
        String strM3502;
        String str8;
        String str9;
        int i29;
        boolean z2;
        int i30;
        String str10;
        String str11;
        int i31;
        String str12;
        int i32;
        String str13;
        ArrayList arrayList4;
        short[] sArr13;
        int i33;
        String strM28025;
        int iM2567;
        String str14;
        int i34;
        int i35;
        ArrayList arrayList5;
        String str15;
        String str16;
        String str17;
        int i36;
        int i37;
        String str18;
        String str19;
        int i38;
        short[] sArr14;
        int i39;
        String strM4373;
        int i40;
        int iM2568;
        int i41;
        String str20;
        int iM2569;
        int i42;
        int i43;
        String str21;
        int iM6984;
        int i44;
        int i45;
        int iM25610;
        int i46;
        int i47;
        int iM25611;
        int i48;
        int i49;
        String str22;
        int i50;
        String str23;
        int iM25612;
        int i51;
        int i52;
        String str24;
        int i53;
        Bitmap bitmapM16745;
        int iM25613;
        int i54;
        int i55;
        Bitmap bitmapM16746;
        Bitmap bitmap = null;
        Bitmap bitmap2 = null;
        Bitmap bitmapM139 = null;
        String strM6570 = null;
        String strM6571 = null;
        boolean z3 = false;
        Bitmap bitmap3 = null;
        int iM6985 = 0;
        int i56 = 0;
        short[] sArr15 = null;
        char c = 0;
        short s = 0;
        int i57 = 0;
        int i58 = 1000388227;
        int i59 = RunnableC0588.f2309;
        int i60 = C5695.f17556;
        int iM6986 = (C2105.m6981("۫۫") ^ i60) * (-43);
        int i61 = ((iM6986 ^ i59) * 6407) ^ (-344533176);
        int i62 = iM6986 ^ 87372094;
        Iterator itM6374 = null;
        C7232 c7232 = null;
        Intent intentM19333 = null;
        String strM10628 = null;
        Intent intentM19334 = null;
        String strM10629 = null;
        String strM39647 = null;
        CharSequence charSequence = null;
        C13581 c13581 = null;
        short[] sArr16 = null;
        short[] sArr17 = null;
        short[] sArr18 = null;
        short[] sArr19 = null;
        short[] sArr20 = null;
        short[] sArr21 = null;
        ArrayList arrayList6 = null;
        int iM45711 = 0;
        int i63 = 0;
        int i64 = 0;
        int i65 = 0;
        int iM25614 = 0;
        boolean z4 = false;
        int i66 = 0;
        int i67 = 0;
        int i68 = 0;
        int i69 = 0;
        int i70 = 0;
        int i71 = 0;
        int i72 = 0;
        int i73 = 0;
        int i74 = 0;
        int i75 = 0;
        String str25 = null;
        String str26 = null;
        String strM106210 = null;
        String strM106211 = null;
        boolean zM141 = false;
        String str27 = null;
        String str28 = null;
        CharSequence charSequenceM19334 = null;
        C7232 c7233 = null;
        boolean z5 = false;
        String str29 = null;
        Iterator itM12354 = null;
        boolean z6 = false;
        String strM5917 = null;
        int i76 = 0;
        while (true) {
            i58 = i62 ^ (i61 & (((i58 ^ i59) * 25805) >> 31));
            switch (i58) {
                case -2145971144:
                case 1641377406:
                    c13581.m32661(strM39647);
                    iM6981 = C2105.m6981("ᩴᩳ") ^ i60;
                    i = ((iM6981 ^ i59) * (-17669)) ^ 234308671;
                    i2 = -119202893;
                    i62 = iM6981 ^ i2;
                    i61 = i;
                    break;
                case -2127424767:
                case 473544122:
                    i53 = i65;
                    bitmapM16745 = null;
                    bitmap3 = bitmapM16745;
                    iM25613 = C2105.m6981("ܽܰ") ^ i59;
                    i65 = i53;
                    i54 = ((iM25613 ^ i60) * (-3707)) ^ 752470654;
                    i55 = -403231428;
                    i62 = iM25613 ^ i55;
                    i61 = i54;
                    i76 = i76;
                    str26 = str26;
                    strM39647 = strM39647;
                    z4 = z4;
                    break;
                case -2113443781:
                case -1282668150:
                    str29 = str29;
                    str27 = str27;
                    str26 = str26;
                    i64 = i64;
                    z4 = z4;
                    i67 = i67;
                    strM39647 = strM39647;
                    i76 = i76;
                    strM5917 = strM5917;
                    int iM45712 = C19883.m45711(strM106210);
                    if (iM45712 == i64) {
                        i63 = iM45712;
                        iM25610 = C2105.m6981("ۤ᩵") ^ i59;
                        i46 = ((iM25610 ^ i60) * 6309) ^ 216308987;
                        i47 = -1303747450;
                        i62 = iM25610 ^ i47;
                        i67 = i67;
                        i76 = i76;
                        str26 = str26;
                        strM39647 = strM39647;
                        str27 = str27;
                        i63 = i63;
                        z4 = z4;
                        strM5917 = strM5917;
                        i64 = i64;
                        i61 = i46;
                        str29 = str29;
                    } else {
                        int iM25615 = C0630.m2566("֨ܿ") ^ i59;
                        int i77 = ((iM25615 ^ i60) * (-11227)) ^ (-557299025);
                        i62 = iM25615 ^ 1699301996;
                        i67 = i67;
                        strM5917 = strM5917;
                        strM39647 = strM39647;
                        str27 = str27;
                        i64 = i64;
                        i61 = i77;
                        z4 = z4;
                        str29 = str29;
                        str20 = str26;
                        i63 = iM45712;
                        i76 = i76;
                        str26 = str20;
                    }
                    break;
                case -2086685134:
                case 1629884271:
                    if (bitmapM139 == null) {
                        iM6981 = C0630.m2566("ۢۡ") ^ i59;
                        i = ((iM6981 ^ i60) * (-32051)) ^ 724080996;
                        i2 = -448415422;
                    } else {
                        iM6981 = C2105.m6981("ܰۨ") ^ i60;
                        i = ((iM6981 ^ i59) * (-16657)) ^ (-1280749169);
                        i2 = -899708964;
                    }
                    i62 = iM6981 ^ i2;
                    i61 = i;
                    break;
                case -2070364394:
                case -1683959425:
                    C1711.m5728(i76);
                    break;
                case -2034131995:
                case 1875244348:
                    str7 = str27;
                    str25 = str25;
                    i64 = i64;
                    z4 = z4;
                    i21 = i67;
                    sArr9 = sArr21;
                    i23 = i75;
                    str2 = strM39647;
                    strM5917 = strM5917;
                    i63 = i63;
                    str26 = str26;
                    i76 = i76;
                    str28 = str28;
                    arrayList2 = arrayList6;
                    short[] sArr22 = sArr18;
                    int i78 = i71;
                    String strM6385 = RunnableC1937.m6385(sArr22, i78, 9, i21);
                    sArr19 = f67;
                    i72 = 28;
                    i73 = 11;
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        str29 = strM6385;
                        sArr18 = sArr22;
                        i71 = i78;
                        sArr10 = sArr17;
                        i22 = i69;
                        i24 = i70;
                        int iM6987 = C2105.m6981("ۙ᩷") ^ i59;
                        short[] sArr23 = sArr10;
                        i20 = ((iM6987 ^ i60) * (-265)) ^ (-1006887702);
                        i62 = iM6987 ^ (-1440591635);
                        i69 = i22;
                        i70 = i24;
                        i67 = i21;
                        arrayList6 = arrayList2;
                        str27 = str7;
                        sArr21 = sArr9;
                        i75 = i23;
                        sArr17 = sArr23;
                        i61 = i20;
                        str28 = str28;
                        i76 = i76;
                        str26 = str26;
                        strM39647 = str2;
                        i63 = i63;
                        z4 = z4;
                        strM5917 = strM5917;
                        i64 = i64;
                        str25 = str25;
                        str29 = str29;
                    } else {
                        int iM6988 = C2105.m6981("ᩳۡ") ^ i60;
                        i62 = iM6988 ^ 813995537;
                        sArr18 = sArr22;
                        i71 = i78;
                        i67 = i21;
                        arrayList6 = arrayList2;
                        str27 = str7;
                        sArr21 = sArr9;
                        i75 = i23;
                        i61 = ((iM6988 ^ i59) * (-26273)) ^ 1873982735;
                        str28 = str28;
                        i76 = i76;
                        str26 = str26;
                        strM39647 = str2;
                        i63 = i63;
                        z4 = z4;
                        strM5917 = strM5917;
                        i64 = i64;
                        str25 = str25;
                        str29 = strM6385;
                    }
                    break;
                case -2023006492:
                case 1241631269:
                    str29 = str29;
                    str27 = str27;
                    i64 = i64;
                    z4 = z4;
                    i67 = i67;
                    strM39647 = strM39647;
                    strM5917 = strM5917;
                    i63 = i63;
                    str26 = str26;
                    i76 = i76;
                    if (strM10629 != null) {
                        iM25611 = C2105.m6981("ۡܽ") ^ i59;
                        i48 = ((iM25611 ^ i60) * (-26167)) ^ 1626644402;
                        i49 = 1287087172;
                    } else {
                        iM25611 = C0630.m2566("᩺ܿ") ^ i60;
                        i48 = ((iM25611 ^ i59) * 26639) ^ (-1941513210);
                        i49 = -1023949373;
                    }
                    i62 = iM25611 ^ i49;
                    i67 = i67;
                    strM39647 = strM39647;
                    str29 = str29;
                    str27 = str27;
                    z4 = z4;
                    str24 = strM5917;
                    i64 = i64;
                    i61 = i48;
                    i76 = i76;
                    str26 = str26;
                    i63 = i63;
                    strM5917 = str24;
                    break;
                case -2020260419:
                case 1458138687:
                    String str30 = strM6570;
                    if (!C7811.m20838(str30, strM5917)) {
                        strM6570 = str30;
                        iM6981 = C2105.m6981("۠ۘ") ^ i59;
                        i = ((iM6981 ^ i60) * 13243) ^ (-1983388526);
                        i2 = -36026396;
                        i62 = iM6981 ^ i2;
                        i61 = i;
                    } else {
                        iM2566 = (C0630.m2566("ᩴۡ") ^ i59) * 87;
                        strM6570 = str30;
                        i61 = ((iM2566 ^ i60) * 28005) ^ 1798422876;
                        i5 = -2002157277;
                        i62 = iM2566 ^ i5;
                    }
                    break;
                case -1975380101:
                case -1335633496:
                    if (bitmap3 == null) {
                        iM2568 = C0630.m2566("ܰܰ") ^ i59;
                        i61 = ((iM2568 ^ i60) * (-17903)) ^ (-1434083759);
                        i41 = -694136245;
                        i62 = iM2568 ^ i41;
                        i67 = i67;
                        arrayList6 = arrayList6;
                        strM39647 = strM39647;
                        str27 = str27;
                        str28 = str28;
                        z4 = z4;
                        i76 = i76;
                        str26 = str26;
                        i63 = i63;
                        strM5917 = strM5917;
                        i64 = i64;
                        str25 = str25;
                        str29 = str29;
                    } else {
                        iM6981 = C2105.m6981("ۨۖ") ^ i60;
                        i = ((iM6981 ^ i59) * 9487) ^ 802098730;
                        i2 = -718211938;
                        i62 = iM6981 ^ i2;
                        i61 = i;
                    }
                    break;
                case -1949468409:
                case 1843083771:
                    i67 = 52565;
                    int iM6989 = (i59 - C2105.m6981("ۗۙ")) * (-75);
                    i61 = ((iM6989 ^ i60) * (-1229)) ^ 1334756511;
                    i62 = iM6989 ^ (-922927914);
                    i68 = i68;
                    arrayList6 = arrayList6;
                    strM39647 = strM39647;
                    str27 = str27;
                    sArr21 = sArr21;
                    i75 = i75;
                    i72 = i72;
                    sArr19 = sArr19;
                    i73 = i73;
                    sArr17 = sArr17;
                    sArr18 = sArr18;
                    i70 = i70;
                    sArr16 = sArr16;
                    str28 = str28;
                    z4 = z4;
                    i76 = i76;
                    str26 = str26;
                    i63 = i63;
                    strM5917 = strM5917;
                    i64 = i64;
                    str25 = str25;
                    str29 = str29;
                    break;
                case -1923443874:
                case 1153206335:
                    C1711.m5736();
                    if (!C1711.f5919) {
                        iM6981 = (C0630.m2566("֨᩵") ^ i60) * (-13);
                        i = ((iM6981 ^ i59) * 20723) ^ 705384529;
                        i2 = -1681329556;
                        i62 = iM6981 ^ i2;
                        i61 = i;
                    } else {
                        str29 = str29;
                        str27 = str27;
                        str25 = str25;
                        i64 = i64;
                        z4 = z4;
                        i3 = i67;
                        sArr = sArr16;
                        sArr17 = sArr17;
                        i70 = i70;
                        sArr18 = sArr18;
                        sArr19 = sArr19;
                        i72 = i72;
                        i73 = i73;
                        sArr21 = sArr21;
                        i75 = i75;
                        strM39647 = strM39647;
                        strM5917 = strM5917;
                        i63 = i63;
                        str26 = str26;
                        i76 = i76;
                        str28 = str28;
                        arrayList6 = arrayList6;
                        i4 = i68;
                        iM6982 = C0630.m2566("ܳܳ") ^ i60;
                        sArr16 = sArr;
                        i61 = ((iM6982 ^ i59) * (-10255)) ^ (-1927166748);
                        i6 = -2062920402;
                        i62 = iM6982 ^ i6;
                        i68 = i4;
                        i67 = i3;
                        arrayList6 = arrayList6;
                        strM39647 = strM39647;
                        str27 = str27;
                        sArr21 = sArr21;
                        i75 = i75;
                        i72 = i72;
                        sArr19 = sArr19;
                        i73 = i73;
                        sArr17 = sArr17;
                        sArr18 = sArr18;
                        i70 = i70;
                        sArr16 = sArr16;
                        str28 = str28;
                        z4 = z4;
                        i76 = i76;
                        str26 = str26;
                        i63 = i63;
                        strM5917 = strM5917;
                        i64 = i64;
                        str25 = str25;
                        str29 = str29;
                    }
                    break;
                case -1830886057:
                case 383139521:
                    strM6571 = AbstractC2021.m6570(intentM19333, str29);
                    if (strM6571 != null) {
                        iM6981 = (i59 - C2105.m6981("۠۬")) * (-55);
                        i = ((iM6981 ^ i60) * (-24135)) ^ (-747472846);
                        i2 = 2106817121;
                    } else {
                        charSequence = charSequenceM19334;
                        iM6981 = C2105.m6981("᩵۫") ^ i59;
                        i = ((iM6981 ^ i60) * 25609) ^ (-507663351);
                        i2 = 798979403;
                    }
                    i62 = iM6981 ^ i2;
                    i61 = i;
                    break;
                case -1801060316:
                case -467469230:
                    break;
                case -1797624245:
                case 65181721:
                    str29 = str29;
                    str27 = str27;
                    str25 = str25;
                    i64 = i64;
                    z4 = z4;
                    i3 = i67;
                    sArr16 = sArr16;
                    sArr17 = sArr17;
                    i70 = i70;
                    sArr18 = sArr18;
                    sArr19 = sArr19;
                    i72 = i72;
                    i73 = i73;
                    sArr21 = sArr21;
                    i75 = i75;
                    strM39647 = strM39647;
                    strM5917 = strM5917;
                    i63 = i63;
                    str26 = str26;
                    i76 = i76;
                    str28 = str28;
                    arrayList6 = arrayList6;
                    i4 = i68;
                    int i79 = (s * s) + 29095236;
                    if ((i79 + i79) - (i57 * i57) < 0) {
                        iM6982 = (C0630.m2566("᩺᩷") + i60) * 83;
                        i61 = ((iM6982 ^ i59) * (-25027)) ^ 157799483;
                        i6 = -2077682425;
                    } else {
                        iM6982 = (C0630.m2566("ۖۨ") + i59) * (-79);
                        i61 = ((iM6982 ^ i60) * (-11121)) ^ 218412222;
                        i6 = 1523108744;
                    }
                    i62 = iM6982 ^ i6;
                    i68 = i4;
                    i67 = i3;
                    arrayList6 = arrayList6;
                    strM39647 = strM39647;
                    str27 = str27;
                    sArr21 = sArr21;
                    i75 = i75;
                    i72 = i72;
                    sArr19 = sArr19;
                    i73 = i73;
                    sArr17 = sArr17;
                    sArr18 = sArr18;
                    i70 = i70;
                    sArr16 = sArr16;
                    str28 = str28;
                    z4 = z4;
                    i76 = i76;
                    str26 = str26;
                    i63 = i63;
                    strM5917 = strM5917;
                    i64 = i64;
                    str25 = str25;
                    str29 = str29;
                    break;
                case -1768411750:
                case 1420030692:
                    String str31 = strM6571;
                    if (!C4616.m13554(str31, strM5917)) {
                        strM6571 = str31;
                        charSequence = charSequenceM19334;
                        iM6981 = C2105.m6981("᩵۫") ^ i59;
                        i = ((iM6981 ^ i60) * 25609) ^ (-507663351);
                        i2 = 798979403;
                        i62 = iM6981 ^ i2;
                        i61 = i;
                    } else {
                        iM2566 = (C0630.m2566("ۡۙ") ^ i59) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        strM6571 = str31;
                        i61 = ((iM2566 ^ i60) * 20101) ^ (-1267762373);
                        i5 = -370857325;
                        i62 = iM2566 ^ i5;
                    }
                    break;
                case -1750026339:
                case 2025949913:
                    str29 = str29;
                    str27 = str27;
                    str25 = str25;
                    i64 = i64;
                    z4 = z4;
                    i67 = i67;
                    strM39647 = strM39647;
                    strM5917 = strM5917;
                    i63 = i63;
                    str26 = str26;
                    i76 = i76;
                    str28 = str28;
                    arrayList6 = arrayList6;
                    iM25614 = C0630.m2566(C1504.m5177(f67, 69, 3, i67)) ^ 2129466193;
                    if (z5) {
                        iM2568 = C2105.m6981("᩸ܰ") ^ i59;
                        i61 = ((iM2568 ^ i60) * (-1349)) ^ (-492280833);
                        i41 = -1751038252;
                    } else {
                        iM2568 = (C0630.m2566("ۜᩳ") ^ i59) * (-107);
                        i61 = ((iM2568 ^ i60) * 18749) ^ (-1246049444);
                        i41 = -1493216118;
                    }
                    i62 = iM2568 ^ i41;
                    i67 = i67;
                    arrayList6 = arrayList6;
                    strM39647 = strM39647;
                    str27 = str27;
                    str28 = str28;
                    z4 = z4;
                    i76 = i76;
                    str26 = str26;
                    i63 = i63;
                    strM5917 = strM5917;
                    i64 = i64;
                    str25 = str25;
                    str29 = str29;
                    break;
                case -1749350192:
                case -50644473:
                    C1916.m6308();
                    if (ServiceConnectionC3453.f10921 < 0) {
                        iM6981 = C2105.m6981("ۖᩳ") ^ i60;
                        i = ((iM6981 ^ i59) * (-21135)) ^ 257650633;
                        i2 = -753848046;
                        i62 = iM6981 ^ i2;
                        i61 = i;
                    } else {
                        str8 = str29;
                        str9 = str27;
                        z2 = z4;
                        i30 = i67;
                        sArr13 = sArr20;
                        str10 = strM39647;
                        strM28025 = str25;
                        i29 = i64;
                        str11 = strM5917;
                        i31 = i63;
                        str12 = str26;
                        i32 = i76;
                        str13 = str28;
                        arrayList4 = arrayList6;
                        i33 = i74;
                        iM2567 = (C2105.m6981("᩻ۗ") ^ i59) * 61;
                        str14 = strM28025;
                        i34 = ((iM2567 ^ i60) * 14067) ^ (-1659082600);
                        i35 = -1005278550;
                        i62 = iM2567 ^ i35;
                        sArr20 = sArr13;
                        i74 = i33;
                        i67 = i30;
                        arrayList6 = arrayList4;
                        str29 = str8;
                        str27 = str9;
                        i61 = i34;
                        str28 = str13;
                        i76 = i32;
                        str26 = str12;
                        strM39647 = str10;
                        i63 = i31;
                        z4 = z2;
                        strM5917 = str11;
                        i64 = i29;
                        str25 = str14;
                    }
                    break;
                case -1737237508:
                case 240747203:
                    str29 = str29;
                    str27 = str27;
                    i64 = i64;
                    z4 = z4;
                    i67 = i67;
                    strM39647 = strM39647;
                    strM5917 = strM5917;
                    i63 = i63;
                    str26 = str26;
                    i76 = i76;
                    if (!C16362.m38512(abstractActivityC3346, arrayList6)) {
                        iM25610 = (C2105.m6981("֡ܺ") ^ i59) * (-21);
                        i46 = ((iM25610 ^ i60) * (-14181)) ^ (-1674663967);
                        i47 = 89172572;
                        i62 = iM25610 ^ i47;
                        i67 = i67;
                        i76 = i76;
                        str26 = str26;
                        strM39647 = strM39647;
                        str27 = str27;
                        i63 = i63;
                        z4 = z4;
                        strM5917 = strM5917;
                        i64 = i64;
                        i61 = i46;
                        str29 = str29;
                    } else {
                        str25 = str25;
                        str28 = str28;
                        i64 = i64;
                        arrayList6 = arrayList6;
                        iM2568 = (C0630.m2566("ۜᩳ") ^ i59) * (-107);
                        i61 = ((iM2568 ^ i60) * 18749) ^ (-1246049444);
                        i41 = -1493216118;
                        i62 = iM2568 ^ i41;
                        i67 = i67;
                        arrayList6 = arrayList6;
                        strM39647 = strM39647;
                        str27 = str27;
                        str28 = str28;
                        z4 = z4;
                        i76 = i76;
                        str26 = str26;
                        i63 = i63;
                        strM5917 = strM5917;
                        i64 = i64;
                        str25 = str25;
                        str29 = str29;
                    }
                    break;
                case -1706289229:
                case 2055610702:
                    C0798.m3004(iM25614);
                    break;
                case -1698854966:
                case -1621653779:
                    strM6570 = AbstractC2021.m6570(intentM19334, str29);
                    if (strM6570 != null) {
                        iM6981 = (C2105.m6981("۟ۢ") + i59) * 33;
                        i = ((iM6981 ^ i60) * 5035) ^ (-416076459);
                        i2 = 1577912431;
                    } else {
                        iM6981 = C2105.m6981("۠ۘ") ^ i59;
                        i = ((iM6981 ^ i60) * 13243) ^ (-1983388526);
                        i2 = -36026396;
                    }
                    i62 = iM6981 ^ i2;
                    i61 = i;
                    break;
                case -1659477776:
                case -55442604:
                    z4 = z4;
                    str22 = str26;
                    i50 = i63;
                    Bitmap bitmapM16747 = RunnableC5974.m16745(C19883.f64184.mo7431(), i50, z4);
                    m137(str22, bitmapM16747);
                    bitmap2 = bitmapM16747;
                    int iM25616 = C0630.m2566("ᩴۤ") ^ i60;
                    int i80 = ((iM25616 ^ i59) * 12987) ^ (-2039121418);
                    i62 = iM25616 ^ (-2079293965);
                    i63 = i50;
                    i67 = i67;
                    i76 = i76;
                    strM5917 = strM5917;
                    str27 = str27;
                    str26 = str22;
                    i64 = i64;
                    i61 = i80;
                    strM39647 = strM39647;
                    str29 = str29;
                    z4 = z4;
                    break;
                case -1628825306:
                case 244678575:
                    i53 = i65;
                    bitmapM16745 = RunnableC5974.m16745(C19883.f64184.mo7431(), i53, z6);
                    bitmap3 = bitmapM16745;
                    iM25613 = C2105.m6981("ܽܰ") ^ i59;
                    i65 = i53;
                    i54 = ((iM25613 ^ i60) * (-3707)) ^ 752470654;
                    i55 = -403231428;
                    i62 = iM25613 ^ i55;
                    i61 = i54;
                    i76 = i76;
                    str26 = str26;
                    strM39647 = strM39647;
                    z4 = z4;
                    break;
                case -1594675728:
                case 1095907445:
                    str29 = str29;
                    str16 = str27;
                    int i81 = i64;
                    z4 = z4;
                    i37 = i67;
                    str18 = strM39647;
                    str15 = strM5917;
                    i36 = i63;
                    str19 = str26;
                    i38 = i76;
                    C1047.m3597(arrayList6);
                    i40 = i81;
                    str17 = str25;
                    strM4373 = str28;
                    sArr14 = sArr21;
                    arrayList5 = arrayList6;
                    i39 = i75;
                    int iM25617 = (C0630.m2566("ۡܿ") ^ i60) * 21;
                    String str32 = strM4373;
                    int i82 = ((iM25617 ^ i59) * 1189) ^ (-259460048);
                    i62 = iM25617 ^ (-2147479389);
                    sArr21 = sArr14;
                    i75 = i39;
                    i67 = i37;
                    i76 = i38;
                    arrayList6 = arrayList5;
                    str26 = str19;
                    str27 = str16;
                    i61 = i82;
                    i63 = i36;
                    str28 = str32;
                    strM5917 = str15;
                    strM39647 = str18;
                    i64 = i40;
                    str25 = str17;
                    z4 = z4;
                    str29 = str29;
                    break;
                case -1382209262:
                case -1346810166:
                    z5 = z3;
                    iM2568 = (i60 - C0630.m2566("ۢۛ")) * (-21);
                    i61 = ((iM2568 ^ i59) * (-7095)) ^ 788626953;
                    i41 = -1336943166;
                    i62 = iM2568 ^ i41;
                    i67 = i67;
                    arrayList6 = arrayList6;
                    strM39647 = strM39647;
                    str27 = str27;
                    str28 = str28;
                    z4 = z4;
                    i76 = i76;
                    str26 = str26;
                    i63 = i63;
                    strM5917 = strM5917;
                    i64 = i64;
                    str25 = str25;
                    str29 = str29;
                    break;
                case -1244288755:
                case -597867375:
                    C0382.m1848();
                    str8 = str29;
                    str9 = str27;
                    z2 = z4;
                    i30 = i67;
                    sArr13 = sArr20;
                    str10 = strM39647;
                    strM28025 = str25;
                    i29 = i64;
                    str11 = strM5917;
                    i31 = i63;
                    str12 = str26;
                    i32 = i76;
                    str13 = str28;
                    arrayList4 = arrayList6;
                    i33 = i74;
                    iM2567 = (C2105.m6981("᩻ۗ") ^ i59) * 61;
                    str14 = strM28025;
                    i34 = ((iM2567 ^ i60) * 14067) ^ (-1659082600);
                    i35 = -1005278550;
                    i62 = iM2567 ^ i35;
                    sArr20 = sArr13;
                    i74 = i33;
                    i67 = i30;
                    arrayList6 = arrayList4;
                    str29 = str8;
                    str27 = str9;
                    i61 = i34;
                    str28 = str13;
                    i76 = i32;
                    str26 = str12;
                    strM39647 = str10;
                    i63 = i31;
                    z4 = z2;
                    strM5917 = str11;
                    i64 = i29;
                    str25 = str14;
                    break;
                case -1234718222:
                case 124131749:
                    C13581 c13582 = new C13581(c7232);
                    c13582.m32661(charSequence);
                    c13582.m32662(C4656.m13628(bitmapM139));
                    C1916.m6307(arrayList6, c13582.m32659());
                    iM6981 = C0630.m2566("ۘۛ") ^ i59;
                    i = ((iM6981 ^ i60) * 12275) ^ 1354147993;
                    i2 = 910322278;
                    i62 = iM6981 ^ i2;
                    i61 = i;
                    break;
                case -1215322702:
                case -162098992:
                    C1916.m6307(arrayList6, c13581.m32659());
                    iM2568 = C0630.m2566("ܰܰ") ^ i59;
                    i61 = ((iM2568 ^ i60) * (-17903)) ^ (-1434083759);
                    i41 = -694136245;
                    i62 = iM2568 ^ i41;
                    i67 = i67;
                    arrayList6 = arrayList6;
                    strM39647 = strM39647;
                    str27 = str27;
                    str28 = str28;
                    z4 = z4;
                    i76 = i76;
                    str26 = str26;
                    i63 = i63;
                    strM5917 = strM5917;
                    i64 = i64;
                    str25 = str25;
                    str29 = str29;
                    break;
                case -1213619718:
                case 1576146127:
                    String str33 = strM39647;
                    str29 = str29;
                    String str34 = str27;
                    str25 = str25;
                    i64 = i64;
                    int i83 = i67;
                    strM5917 = strM5917;
                    i63 = i63;
                    String str35 = str26;
                    int i84 = i76;
                    String str36 = str28;
                    charSequenceM19334 = c7232.m19334();
                    strM106210 = RunnableC3474.m10628(intentM19333, str36);
                    strM10628 = RunnableC3474.m10628(intentM19333, str25);
                    if (strM106210 != null) {
                        iM2569 = C2105.m6981("ܰܺ") ^ i60;
                        i42 = ((iM2569 ^ i59) * 28887) ^ 1096149903;
                        i43 = 1589366743;
                    } else {
                        iM2569 = C0630.m2566("ܶ᩹") ^ i60;
                        i42 = ((iM2569 ^ i59) * (-8565)) ^ 409691439;
                        i43 = -585115917;
                    }
                    i62 = iM2569 ^ i43;
                    str28 = str36;
                    i67 = i83;
                    i61 = i42;
                    i76 = i84;
                    str26 = str35;
                    strM39647 = str33;
                    str27 = str34;
                    z4 = true;
                    i63 = i63;
                    strM5917 = strM5917;
                    i64 = i64;
                    str25 = str25;
                    str29 = str29;
                    break;
                case -1200720114:
                case 237117601:
                    str29 = str29;
                    str27 = str27;
                    i64 = i64;
                    z4 = z4;
                    i67 = i67;
                    strM39647 = strM39647;
                    strM5917 = strM5917;
                    i63 = i63;
                    str26 = str26;
                    i76 = i76;
                    C0798.m3004(C2105.m6981(C1047.m3603(f67, 72, 3, i67)) ^ 2097727287);
                    iM25610 = C2105.m6981("ۡܰ") ^ i60;
                    i46 = ((iM25610 ^ i59) * 2571) ^ (-1939017461);
                    i47 = 2039610396;
                    i62 = iM25610 ^ i47;
                    i67 = i67;
                    i76 = i76;
                    str26 = str26;
                    strM39647 = strM39647;
                    str27 = str27;
                    i63 = i63;
                    z4 = z4;
                    strM5917 = strM5917;
                    i64 = i64;
                    i61 = i46;
                    str29 = str29;
                    break;
                case -1095877643:
                case 1733854308:
                    str29 = str29;
                    str27 = str27;
                    i64 = i64;
                    z4 = z4;
                    i67 = i67;
                    strM39647 = strM39647;
                    strM5917 = strM5917;
                    i63 = i63;
                    str26 = str26;
                    i76 = i76;
                    if (!C16362.m38515(abstractActivityC3346, arrayList6)) {
                        iM25610 = C2105.m6981("ۧܺ") ^ i60;
                        i46 = ((iM25610 ^ i59) * (-18421)) ^ 556931673;
                        i47 = 191438309;
                        i62 = iM25610 ^ i47;
                        i67 = i67;
                        i76 = i76;
                        str26 = str26;
                        strM39647 = strM39647;
                        str27 = str27;
                        i63 = i63;
                        z4 = z4;
                        strM5917 = strM5917;
                        i64 = i64;
                        i61 = i46;
                        str29 = str29;
                    } else {
                        str25 = str25;
                        str21 = str28;
                        i64 = i64;
                        iM6984 = C2105.m6981("ܰ֨") ^ i59;
                        i61 = ((iM6984 ^ i60) * (-1947)) ^ 1393978373;
                        i44 = 956839463;
                        i62 = iM6984 ^ i44;
                        str28 = str21;
                        i67 = i67;
                        i76 = i76;
                        str26 = str26;
                        strM39647 = strM39647;
                        str27 = str27;
                        i63 = i63;
                        z4 = z4;
                        strM5917 = strM5917;
                        i64 = i64;
                        str25 = str25;
                        str29 = str29;
                    }
                    break;
                case -1031502180:
                case -39920643:
                    RunnableC0588.m2441();
                    if (C4263.f13799 > 0) {
                        str29 = str29;
                        strM3502 = str27;
                        str25 = str25;
                        i64 = i64;
                        z4 = z4;
                        i25 = i67;
                        i26 = i72;
                        sArr11 = sArr21;
                        i27 = i75;
                        str2 = strM39647;
                        strM5917 = strM5917;
                        i63 = i63;
                        sArr12 = sArr19;
                        str26 = str26;
                        i76 = i76;
                        str28 = str28;
                        arrayList3 = arrayList6;
                        i28 = i73;
                        int iM69810 = C2105.m6981("᩷᩺") ^ i59;
                        short[] sArr24 = sArr12;
                        i20 = ((iM69810 ^ i60) * (-19095)) ^ 1927260612;
                        i62 = iM69810 ^ 1694731083;
                        i72 = i26;
                        i73 = i28;
                        i67 = i25;
                        arrayList6 = arrayList3;
                        str27 = strM3502;
                        sArr21 = sArr11;
                        i75 = i27;
                        sArr19 = sArr24;
                        i61 = i20;
                        str28 = str28;
                        i76 = i76;
                        str26 = str26;
                        strM39647 = str2;
                        i63 = i63;
                        z4 = z4;
                        strM5917 = strM5917;
                        i64 = i64;
                        str25 = str25;
                        str29 = str29;
                    }
                    str29 = str29;
                    str3 = str27;
                    str25 = str25;
                    i64 = i64;
                    z4 = z4;
                    i13 = i67;
                    sArr5 = sArr17;
                    i14 = i70;
                    sArr6 = sArr18;
                    sArr7 = sArr19;
                    i15 = i72;
                    i16 = i73;
                    sArr8 = sArr21;
                    i17 = i75;
                    str4 = strM39647;
                    strM5917 = strM5917;
                    i63 = i63;
                    str5 = str26;
                    i18 = i76;
                    str6 = str28;
                    iM6983 = (C2105.m6981("ۡ᩶") ^ i60) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i61 = ((iM6983 ^ i59) * 25093) ^ 488338149;
                    i19 = -1226881317;
                    i62 = iM6983 ^ i19;
                    str28 = str6;
                    i67 = i13;
                    i76 = i18;
                    str26 = str5;
                    strM39647 = str4;
                    str27 = str3;
                    sArr21 = sArr8;
                    i75 = i17;
                    i72 = i15;
                    sArr19 = sArr7;
                    i73 = i16;
                    sArr17 = sArr5;
                    sArr18 = sArr6;
                    i70 = i14;
                    i63 = i63;
                    z4 = z4;
                    strM5917 = strM5917;
                    i64 = i64;
                    str25 = str25;
                    str29 = str29;
                    break;
                case -1023024885:
                case 1206251880:
                    C19883 c19883 = C19883.f64181;
                    bitmapM16746 = RunnableC5974.m16745(c19883.f64247.mo7431(), c19883.f64249.f70507, z6);
                    bitmap3 = bitmapM16746;
                    z4 = z4;
                    strM39647 = strM39647;
                    str26 = str26;
                    i76 = i76;
                    i53 = i65;
                    iM25613 = C2105.m6981("ܽܰ") ^ i59;
                    i65 = i53;
                    i54 = ((iM25613 ^ i60) * (-3707)) ^ 752470654;
                    i55 = -403231428;
                    i62 = iM25613 ^ i55;
                    i61 = i54;
                    i76 = i76;
                    str26 = str26;
                    strM39647 = strM39647;
                    z4 = z4;
                    break;
                case -886304543:
                case 374344683:
                    str29 = str29;
                    str27 = str27;
                    str25 = str25;
                    i64 = i64;
                    z4 = z4;
                    i67 = i67;
                    strM39647 = strM39647;
                    strM5917 = strM5917;
                    i63 = i63;
                    str26 = str26;
                    i76 = i76;
                    str21 = str28;
                    if (C3019.m9256(arrayList6)) {
                        iM6984 = C2105.m6981("ܰ֨") ^ i59;
                        i61 = ((iM6984 ^ i60) * (-1947)) ^ 1393978373;
                        i44 = 956839463;
                    } else {
                        iM6984 = C2105.m6981("ۘ᩵") ^ i59;
                        i61 = ((iM6984 ^ i60) * 1909) ^ 794487224;
                        i44 = -22833834;
                    }
                    i62 = iM6984 ^ i44;
                    str28 = str21;
                    i67 = i67;
                    i76 = i76;
                    str26 = str26;
                    strM39647 = strM39647;
                    str27 = str27;
                    i63 = i63;
                    z4 = z4;
                    strM5917 = strM5917;
                    i64 = i64;
                    str25 = str25;
                    str29 = str29;
                    break;
                case -827293458:
                case 1169432533:
                    i76 = i76;
                    str29 = str29;
                    strM3502 = str27;
                    str25 = str25;
                    str28 = str28;
                    i64 = i64;
                    z4 = z4;
                    i25 = i67;
                    str2 = strM39647;
                    strM5917 = strM5917;
                    i63 = i63;
                    c7232 = (C7232) RunnableC1108.m3791(itM12354);
                    String strM19332 = c7232.m19332();
                    intentM19333 = c7232.m19333();
                    if (C1128.f4106 > 0) {
                        int iM25618 = (i59 - C0630.m2566("ܰۛ")) * 13;
                        i62 = iM25618 ^ (-1942862085);
                        i61 = ((iM25618 ^ i60) * (-12189)) ^ (-1000007300);
                        i63 = i63;
                        i67 = i25;
                        strM5917 = strM5917;
                        strM39647 = str2;
                        str27 = strM3502;
                        z4 = z4;
                        i64 = i64;
                        str25 = str25;
                        str29 = str29;
                        str20 = strM19332;
                        str28 = str28;
                        i76 = i76;
                        str26 = str20;
                    } else {
                        str26 = strM19332;
                        arrayList3 = arrayList6;
                        sArr12 = sArr19;
                        i26 = i72;
                        i28 = i73;
                        sArr11 = sArr21;
                        i27 = i75;
                        int iM69811 = C2105.m6981("᩷᩺") ^ i59;
                        short[] sArr25 = sArr12;
                        i20 = ((iM69811 ^ i60) * (-19095)) ^ 1927260612;
                        i62 = iM69811 ^ 1694731083;
                        i72 = i26;
                        i73 = i28;
                        i67 = i25;
                        arrayList6 = arrayList3;
                        str27 = strM3502;
                        sArr21 = sArr11;
                        i75 = i27;
                        sArr19 = sArr25;
                        i61 = i20;
                        str28 = str28;
                        i76 = i76;
                        str26 = str26;
                        strM39647 = str2;
                        i63 = i63;
                        z4 = z4;
                        strM5917 = strM5917;
                        i64 = i64;
                        str25 = str25;
                        str29 = str29;
                    }
                    break;
                case -726290804:
                case 535543813:
                    c13581.m32662(C4656.m13628(bitmap3));
                    iM6981 = (i60 - C0630.m2566("ܶۘ")) * (-75);
                    i = ((iM6981 ^ i59) * (-14375)) ^ (-333040060);
                    i2 = 915579019;
                    i62 = iM6981 ^ i2;
                    i61 = i;
                    break;
                case -716421225:
                case 729579137:
                    z4 = z4;
                    strM39647 = strM39647;
                    str23 = str26;
                    i76 = i76;
                    iM45711 = C19883.m45711(strM10629);
                    i64 = i64;
                    if (iM45711 == i64) {
                        strM5917 = strM5917;
                        str29 = str29;
                        str27 = str27;
                        i67 = i67;
                        str26 = str23;
                        iM25611 = (C2105.m6981("ᩳۛ") + i59) * (-107);
                        i48 = ((iM25611 ^ i60) * 27907) ^ (-1490931065);
                        i49 = 593527618;
                        i62 = iM25611 ^ i49;
                        i67 = i67;
                        strM39647 = strM39647;
                        str29 = str29;
                        str27 = str27;
                        z4 = z4;
                        str24 = strM5917;
                        i64 = i64;
                        i61 = i48;
                        i76 = i76;
                        str26 = str26;
                        i63 = i63;
                        strM5917 = str24;
                    } else {
                        int iM69812 = C2105.m6981("᩹ۛ") ^ i60;
                        strM5917 = strM5917;
                        i51 = ((iM69812 ^ i59) * 5325) ^ 2105155275;
                        i62 = iM69812 ^ 215019608;
                        i76 = i76;
                        str26 = str23;
                        strM39647 = strM39647;
                        z4 = z4;
                        str24 = strM5917;
                        i64 = i64;
                        i61 = i51;
                        strM5917 = str24;
                    }
                    break;
                case -713502373:
                case 474539777:
                    if (strM39647 == null) {
                        iM6981 = (i60 - C2105.m6981("۠ܳ")) * 65;
                        i = ((iM6981 ^ i59) * 9111) ^ (-1401506546);
                        i2 = -1968923476;
                    } else {
                        iM6981 = C2105.m6981("ۨۖ") ^ i60;
                        i = ((iM6981 ^ i59) * 9487) ^ 802098730;
                        i2 = -718211938;
                    }
                    i62 = iM6981 ^ i2;
                    i61 = i;
                    break;
                case -653893827:
                case 1794920808:
                    str8 = str29;
                    str9 = str27;
                    i29 = i64;
                    z2 = z4;
                    i30 = i67;
                    str10 = strM39647;
                    str11 = strM5917;
                    i31 = i63;
                    str12 = str26;
                    i32 = i76;
                    str13 = str28;
                    arrayList4 = arrayList6;
                    sArr13 = sArr20;
                    i33 = i74;
                    strM28025 = C11340.m28025(sArr13, i33, 15, i30);
                    sArr21 = f67;
                    i75 = 54;
                    if (C3537.m10746() <= 0) {
                        iM2567 = (C2105.m6981("᩻ۗ") ^ i59) * 61;
                        str14 = strM28025;
                        i34 = ((iM2567 ^ i60) * 14067) ^ (-1659082600);
                        i35 = -1005278550;
                    } else {
                        iM2567 = C0630.m2566("ܿ᩹") ^ i59;
                        str14 = strM28025;
                        i34 = ((iM2567 ^ i60) * (-18635)) ^ (-1864022380);
                        i35 = -690666824;
                    }
                    i62 = iM2567 ^ i35;
                    sArr20 = sArr13;
                    i74 = i33;
                    i67 = i30;
                    arrayList6 = arrayList4;
                    str29 = str8;
                    str27 = str9;
                    i61 = i34;
                    str28 = str13;
                    i76 = i32;
                    str26 = str12;
                    strM39647 = str10;
                    i63 = i31;
                    z4 = z2;
                    strM5917 = str11;
                    i64 = i29;
                    str25 = str14;
                    break;
                case -636176411:
                case 1748865817:
                    if (!C2167.m7155()) {
                        iM6981 = C2105.m6981("ܳܰ") ^ i59;
                        i = ((iM6981 ^ i60) * 11811) ^ (-1789011218);
                        i2 = 1684390415;
                        i62 = iM6981 ^ i2;
                        i61 = i;
                    } else {
                        str29 = str29;
                        str3 = str27;
                        str25 = str25;
                        i64 = i64;
                        z4 = z4;
                        i13 = i67;
                        sArr5 = sArr17;
                        i14 = i70;
                        sArr6 = sArr18;
                        sArr7 = sArr19;
                        i15 = i72;
                        i16 = i73;
                        sArr8 = sArr21;
                        i17 = i75;
                        str4 = strM39647;
                        strM5917 = strM5917;
                        i63 = i63;
                        str5 = str26;
                        i18 = i76;
                        str6 = str28;
                        iM6983 = (C2105.m6981("ۡ᩶") ^ i60) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i61 = ((iM6983 ^ i59) * 25093) ^ 488338149;
                        i19 = -1226881317;
                        i62 = iM6983 ^ i19;
                        str28 = str6;
                        i67 = i13;
                        i76 = i18;
                        str26 = str5;
                        strM39647 = str4;
                        str27 = str3;
                        sArr21 = sArr8;
                        i75 = i17;
                        i72 = i15;
                        sArr19 = sArr7;
                        i73 = i16;
                        sArr17 = sArr5;
                        sArr18 = sArr6;
                        i70 = i14;
                        i63 = i63;
                        z4 = z4;
                        strM5917 = strM5917;
                        i64 = i64;
                        str25 = str25;
                        str29 = str29;
                    }
                    break;
                case -618493875:
                case -304430740:
                    strM39647 = C16870.m39647(strM6570);
                    iM6981 = (C2105.m6981("᩻ܶ") ^ i60) * (-91);
                    i = ((iM6981 ^ i59) * (-6739)) ^ 41331789;
                    i2 = -1305405443;
                    i62 = iM6981 ^ i2;
                    i61 = i;
                    break;
                case -576785159:
                case 366048667:
                    if (bitmap3 != null) {
                        iM6981 = C0630.m2566("ܺۛ") ^ i59;
                        i = ((iM6981 ^ i60) * 18217) ^ (-1814726008);
                        i2 = -2045716149;
                    } else {
                        iM6981 = (i60 - C0630.m2566("ܶۘ")) * (-75);
                        i = ((iM6981 ^ i59) * (-14375)) ^ (-333040060);
                        i2 = 915579019;
                    }
                    i62 = iM6981 ^ i2;
                    i61 = i;
                    break;
                case -575632248:
                case 32468109:
                    str29 = str29;
                    str25 = str25;
                    i64 = i64;
                    z4 = z4;
                    i25 = i67;
                    i26 = i72;
                    sArr11 = sArr21;
                    i27 = i75;
                    str2 = strM39647;
                    strM5917 = strM5917;
                    i63 = i63;
                    sArr12 = sArr19;
                    str26 = str26;
                    i76 = i76;
                    str28 = str28;
                    arrayList3 = arrayList6;
                    i28 = i73;
                    strM3502 = C1005.m3502(sArr12, i26, i28, i25);
                    sArr20 = f67;
                    i74 = 39;
                    if (!C2272.f7362) {
                        int iM69813 = (C2105.m6981("ۚۤ") + i60) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i61 = ((iM69813 ^ i59) * (-15167)) ^ (-878100303);
                        i62 = iM69813 ^ (-10456202);
                        i73 = i28;
                        i67 = i25;
                        arrayList6 = arrayList3;
                        strM39647 = str2;
                        str27 = strM3502;
                        sArr21 = sArr11;
                        i75 = i27;
                        i72 = i26;
                        sArr19 = sArr12;
                        str28 = str28;
                        z4 = z4;
                        i76 = i76;
                        str26 = str26;
                        i63 = i63;
                        strM5917 = strM5917;
                        i64 = i64;
                        str25 = str25;
                        str29 = str29;
                    }
                    int iM69814 = C2105.m6981("᩷᩺") ^ i59;
                    short[] sArr26 = sArr12;
                    i20 = ((iM69814 ^ i60) * (-19095)) ^ 1927260612;
                    i62 = iM69814 ^ 1694731083;
                    i72 = i26;
                    i73 = i28;
                    i67 = i25;
                    arrayList6 = arrayList3;
                    str27 = strM3502;
                    sArr21 = sArr11;
                    i75 = i27;
                    sArr19 = sArr26;
                    i61 = i20;
                    str28 = str28;
                    i76 = i76;
                    str26 = str26;
                    strM39647 = str2;
                    i63 = i63;
                    z4 = z4;
                    strM5917 = strM5917;
                    i64 = i64;
                    str25 = str25;
                    str29 = str29;
                    break;
                case -505091187:
                case 1422756084:
                    bitmapM16746 = RunnableC5974.m16745(C19883.f64212.mo7431(), iM45711, z6);
                    bitmap3 = bitmapM16746;
                    z4 = z4;
                    strM39647 = strM39647;
                    str26 = str26;
                    i76 = i76;
                    i53 = i65;
                    iM25613 = C2105.m6981("ܽܰ") ^ i59;
                    i65 = i53;
                    i54 = ((iM25613 ^ i60) * (-3707)) ^ 752470654;
                    i55 = -403231428;
                    i62 = iM25613 ^ i55;
                    i61 = i54;
                    i76 = i76;
                    str26 = str26;
                    strM39647 = strM39647;
                    z4 = z4;
                    break;
                case -467733015:
                case 2114729216:
                    if (intentM19334.getBooleanExtra(str27, z6)) {
                        iM6981 = (C2105.m6981("ܽ֫") ^ i60) * 11;
                        i = ((iM6981 ^ i59) * (-18361)) ^ 879434051;
                        i2 = -1372454082;
                    } else {
                        iM6981 = C2105.m6981("۠ۘ") ^ i59;
                        i = ((iM6981 ^ i60) * 13243) ^ (-1983388526);
                        i2 = -36026396;
                    }
                    i62 = iM6981 ^ i2;
                    i61 = i;
                    break;
                case -429989759:
                case 1687682145:
                    str29 = str29;
                    str27 = str27;
                    i64 = i64;
                    z4 = z4;
                    i67 = i67;
                    strM39647 = strM39647;
                    strM5917 = strM5917;
                    str23 = str26;
                    i76 = i76;
                    if (!z) {
                        i63 = i63;
                        str26 = str23;
                        iM25610 = C2105.m6981("ۡܰ") ^ i60;
                        i46 = ((iM25610 ^ i59) * 2571) ^ (-1939017461);
                        i47 = 2039610396;
                        i62 = iM25610 ^ i47;
                        i67 = i67;
                        i76 = i76;
                        str26 = str26;
                        strM39647 = strM39647;
                        str27 = str27;
                        i63 = i63;
                        z4 = z4;
                        strM5917 = strM5917;
                        i64 = i64;
                        i61 = i46;
                        str29 = str29;
                    } else {
                        iM25612 = C0630.m2566("ܰۧ") ^ i59;
                        i51 = ((iM25612 ^ i60) * 31485) ^ (-559470470);
                        i52 = 493069582;
                        i62 = iM25612 ^ i52;
                        i67 = i67;
                        i76 = i76;
                        str29 = str29;
                        str27 = str27;
                        str26 = str23;
                        strM39647 = strM39647;
                        z4 = z4;
                        str24 = strM5917;
                        i64 = i64;
                        i61 = i51;
                        strM5917 = str24;
                    }
                    break;
                case -393895012:
                case 869876220:
                    C4263.m12819();
                    if (C0237.f1507 == 0) {
                        str29 = str29;
                        str = str27;
                        str25 = str25;
                        i64 = i64;
                        z4 = z4;
                        i7 = i67;
                        sArr2 = sArr18;
                        sArr3 = sArr19;
                        i8 = i72;
                        i9 = i73;
                        sArr4 = sArr21;
                        i10 = i75;
                        str2 = strM39647;
                        i12 = i76;
                        strM5917 = strM5917;
                        str28 = str28;
                        i63 = i63;
                        arrayList = arrayList6;
                        str26 = str26;
                        i11 = i68;
                        int iM69815 = (i60 - C2105.m6981("ۖۛ")) * 115;
                        i76 = i12;
                        i62 = iM69815 ^ (-542269047);
                        i61 = ((iM69815 ^ i59) * 28065) ^ 1601447367;
                        i68 = i11;
                        i67 = i7;
                        arrayList6 = arrayList;
                        strM39647 = str2;
                        str27 = str;
                        sArr21 = sArr4;
                        i75 = i10;
                        i72 = i8;
                        sArr19 = sArr3;
                        i73 = i9;
                        sArr18 = sArr2;
                        sArr16 = sArr16;
                        str28 = str28;
                        z4 = z4;
                        i76 = i76;
                        str26 = str26;
                        i63 = i63;
                        strM5917 = strM5917;
                        i64 = i64;
                        str25 = str25;
                        str29 = str29;
                    }
                    str29 = str29;
                    str3 = str27;
                    str25 = str25;
                    i64 = i64;
                    z4 = z4;
                    i13 = i67;
                    sArr5 = sArr17;
                    i14 = i70;
                    sArr6 = sArr18;
                    sArr7 = sArr19;
                    i15 = i72;
                    i16 = i73;
                    sArr8 = sArr21;
                    i17 = i75;
                    str4 = strM39647;
                    strM5917 = strM5917;
                    i63 = i63;
                    str5 = str26;
                    i18 = i76;
                    str6 = str28;
                    iM6983 = (C2105.m6981("ۡ᩶") ^ i60) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i61 = ((iM6983 ^ i59) * 25093) ^ 488338149;
                    i19 = -1226881317;
                    i62 = iM6983 ^ i19;
                    str28 = str6;
                    i67 = i13;
                    i76 = i18;
                    str26 = str5;
                    strM39647 = str4;
                    str27 = str3;
                    sArr21 = sArr8;
                    i75 = i17;
                    i72 = i15;
                    sArr19 = sArr7;
                    i73 = i16;
                    sArr17 = sArr5;
                    sArr18 = sArr6;
                    i70 = i14;
                    i63 = i63;
                    z4 = z4;
                    strM5917 = strM5917;
                    i64 = i64;
                    str25 = str25;
                    str29 = str29;
                    break;
                case -353508631:
                case -210281071:
                    str29 = str29;
                    str27 = str27;
                    i64 = i64;
                    z4 = z4;
                    i67 = i67;
                    strM39647 = strM39647;
                    strM5917 = strM5917;
                    i63 = i63;
                    str26 = str26;
                    i76 = i76;
                    int iM45713 = C19883.m45711(strM106211);
                    if (iM45713 == i64) {
                        i65 = iM45713;
                        iM25611 = (C2105.m6981("ᩳۛ") + i59) * (-107);
                        i48 = ((iM25611 ^ i60) * 27907) ^ (-1490931065);
                        i49 = 593527618;
                        i62 = iM25611 ^ i49;
                        i67 = i67;
                        strM39647 = strM39647;
                        str29 = str29;
                        str27 = str27;
                        z4 = z4;
                        str24 = strM5917;
                        i64 = i64;
                        i61 = i48;
                        i76 = i76;
                        str26 = str26;
                        i63 = i63;
                        strM5917 = str24;
                    } else {
                        int iM69816 = (C2105.m6981("ۘᩴ") ^ i60) * 13;
                        i46 = ((iM69816 ^ i59) * 3779) ^ 1947648297;
                        i62 = iM69816 ^ 88145888;
                        i65 = iM45713;
                        i67 = i67;
                        i76 = i76;
                        str26 = str26;
                        strM39647 = strM39647;
                        str27 = str27;
                        i63 = i63;
                        z4 = z4;
                        strM5917 = strM5917;
                        i64 = i64;
                        i61 = i46;
                        str29 = str29;
                    }
                    break;
                case -280484284:
                case 801364369:
                    i64 = i64;
                    z4 = z4;
                    strM39647 = strM39647;
                    strM5917 = strM5917;
                    str23 = str26;
                    i76 = i76;
                    str29 = str29;
                    str27 = str27;
                    i67 = i67;
                    if (!intentM19334.getBooleanExtra(C4616.m13542(f67, 75, 5, i67), z6)) {
                        str26 = str23;
                        iM25611 = (C2105.m6981("ᩳۛ") + i59) * (-107);
                        i48 = ((iM25611 ^ i60) * 27907) ^ (-1490931065);
                        i49 = 593527618;
                        i62 = iM25611 ^ i49;
                        i67 = i67;
                        strM39647 = strM39647;
                        str29 = str29;
                        str27 = str27;
                        z4 = z4;
                        str24 = strM5917;
                        i64 = i64;
                        i61 = i48;
                        i76 = i76;
                        str26 = str26;
                        i63 = i63;
                        strM5917 = str24;
                    } else {
                        iM25612 = C2105.m6981("۬᩷") ^ i60;
                        i51 = ((iM25612 ^ i59) * (-29253)) ^ 485438178;
                        i52 = 775041111;
                        i62 = iM25612 ^ i52;
                        i67 = i67;
                        i76 = i76;
                        str29 = str29;
                        str27 = str27;
                        str26 = str23;
                        strM39647 = strM39647;
                        z4 = z4;
                        str24 = strM5917;
                        i64 = i64;
                        i61 = i51;
                        strM5917 = str24;
                    }
                    break;
                case -174604290:
                case 369932340:
                    itM12354 = C4117.m12354(C16362.m38507(abstractActivityC3346));
                    z5 = false;
                    iM2568 = (i60 - C0630.m2566("ۢۛ")) * (-21);
                    i61 = ((iM2568 ^ i59) * (-7095)) ^ 788626953;
                    i41 = -1336943166;
                    i62 = iM2568 ^ i41;
                    i67 = i67;
                    arrayList6 = arrayList6;
                    strM39647 = strM39647;
                    str27 = str27;
                    str28 = str28;
                    z4 = z4;
                    i76 = i76;
                    str26 = str26;
                    i63 = i63;
                    strM5917 = strM5917;
                    i64 = i64;
                    str25 = str25;
                    str29 = str29;
                    break;
                case -79154923:
                case 1794177009:
                    str29 = str29;
                    str27 = str27;
                    str25 = str25;
                    i64 = i64;
                    z4 = z4;
                    i3 = i67;
                    sArr17 = sArr17;
                    sArr19 = sArr19;
                    i72 = i72;
                    i73 = i73;
                    sArr21 = sArr21;
                    i75 = i75;
                    strM39647 = strM39647;
                    strM5917 = strM5917;
                    i63 = i63;
                    str26 = str26;
                    i76 = i76;
                    str28 = str28;
                    arrayList6 = arrayList6;
                    sArr18 = sArr18;
                    i70 = i70;
                    sArr = sArr16;
                    i4 = i68;
                    iM6985 = C2105.m6981(RunnableC1937.m6385(sArr, i4, 3, i3));
                    i56 = 2116560630;
                    if (C0714.f2697 >= 0) {
                        iM6982 = C0630.m2566("ܳܳ") ^ i60;
                        sArr16 = sArr;
                        i61 = ((iM6982 ^ i59) * (-10255)) ^ (-1927166748);
                        i6 = -2062920402;
                    } else {
                        sArr16 = sArr;
                        iM6982 = C2105.m6981("᩶ۡ") ^ i59;
                        i61 = ((iM6982 ^ i60) * (-31439)) ^ 1333089763;
                        i6 = -408421751;
                    }
                    i62 = iM6982 ^ i6;
                    i68 = i4;
                    i67 = i3;
                    arrayList6 = arrayList6;
                    strM39647 = strM39647;
                    str27 = str27;
                    sArr21 = sArr21;
                    i75 = i75;
                    i72 = i72;
                    sArr19 = sArr19;
                    i73 = i73;
                    sArr17 = sArr17;
                    sArr18 = sArr18;
                    i70 = i70;
                    sArr16 = sArr16;
                    str28 = str28;
                    z4 = z4;
                    i76 = i76;
                    str26 = str26;
                    i63 = i63;
                    strM5917 = strM5917;
                    i64 = i64;
                    str25 = str25;
                    str29 = str29;
                    break;
                case -54205068:
                case 2026263348:
                    str29 = str29;
                    str = str27;
                    str25 = str25;
                    i64 = i64;
                    z4 = z4;
                    i7 = i67;
                    sArr16 = sArr16;
                    short[] sArr27 = sArr17;
                    int i85 = i70;
                    sArr2 = sArr18;
                    sArr3 = sArr19;
                    i8 = i72;
                    i9 = i73;
                    sArr4 = sArr21;
                    i10 = i75;
                    str2 = strM39647;
                    strM5917 = strM5917;
                    i63 = i63;
                    str26 = str26;
                    int i86 = i76;
                    str28 = str28;
                    arrayList = arrayList6;
                    i11 = i68;
                    short s2 = sArr15[c];
                    int i87 = s2 + 5394;
                    if (C4159.f13567) {
                        int iM69817 = (i59 - C2105.m6981("ܽ֡")) * 75;
                        int i88 = ((iM69817 ^ i60) * 11437) ^ (-1987253276);
                        i62 = iM69817 ^ 527572224;
                        i68 = i11;
                        i67 = i7;
                        arrayList6 = arrayList;
                        s = s2;
                        str27 = str;
                        sArr21 = sArr4;
                        i75 = i10;
                        i72 = i8;
                        sArr19 = sArr3;
                        i73 = i9;
                        sArr17 = sArr27;
                        sArr18 = sArr2;
                        i70 = i85;
                        sArr16 = sArr16;
                        i57 = i87;
                        str28 = str28;
                        i76 = i86;
                        str26 = str26;
                        i61 = i88;
                        i63 = i63;
                        strM5917 = strM5917;
                        strM39647 = str2;
                        z4 = z4;
                    } else {
                        s = s2;
                        i57 = i87;
                        i12 = i86;
                        sArr17 = sArr27;
                        i70 = i85;
                        int iM69818 = (i60 - C2105.m6981("ۖۛ")) * 115;
                        i76 = i12;
                        i62 = iM69818 ^ (-542269047);
                        i61 = ((iM69818 ^ i59) * 28065) ^ 1601447367;
                        i68 = i11;
                        i67 = i7;
                        arrayList6 = arrayList;
                        strM39647 = str2;
                        str27 = str;
                        sArr21 = sArr4;
                        i75 = i10;
                        i72 = i8;
                        sArr19 = sArr3;
                        i73 = i9;
                        sArr18 = sArr2;
                        sArr16 = sArr16;
                        str28 = str28;
                        z4 = z4;
                        i76 = i76;
                        str26 = str26;
                        i63 = i63;
                        strM5917 = strM5917;
                    }
                    i64 = i64;
                    str25 = str25;
                    str29 = str29;
                    break;
                case 29803130:
                case 1763993428:
                    bitmap = bitmap2;
                    z3 = true;
                    iM25611 = (i59 - C2105.m6981("ۧ᩻")) * 53;
                    i48 = ((iM25611 ^ i60) * (-22621)) ^ (-189859973);
                    i49 = -1033453010;
                    i62 = iM25611 ^ i49;
                    i67 = i67;
                    strM39647 = strM39647;
                    str29 = str29;
                    str27 = str27;
                    z4 = z4;
                    str24 = strM5917;
                    i64 = i64;
                    i61 = i48;
                    i76 = i76;
                    str26 = str26;
                    i63 = i63;
                    strM5917 = str24;
                    break;
                case 49239954:
                case 540109853:
                    str29 = str29;
                    str27 = str27;
                    i64 = i64;
                    z4 = z4;
                    i67 = i67;
                    strM39647 = strM39647;
                    strM5917 = strM5917;
                    i63 = i63;
                    str26 = str26;
                    i76 = i76;
                    if (z) {
                        iM25610 = (C0630.m2566("ۙۙ") + i60) * (-67);
                        i46 = ((iM25610 ^ i59) * (-7499)) ^ 467901867;
                        i47 = 1379358933;
                    } else {
                        iM25610 = C2105.m6981("ۡܰ") ^ i60;
                        i46 = ((iM25610 ^ i59) * 2571) ^ (-1939017461);
                        i47 = 2039610396;
                    }
                    i62 = iM25610 ^ i47;
                    i67 = i67;
                    i76 = i76;
                    str26 = str26;
                    strM39647 = strM39647;
                    str27 = str27;
                    i63 = i63;
                    z4 = z4;
                    strM5917 = strM5917;
                    i64 = i64;
                    i61 = i46;
                    str29 = str29;
                    break;
                case 208198861:
                case 1331383268:
                    str29 = str29;
                    str27 = str27;
                    str25 = str25;
                    i64 = i64;
                    z4 = z4;
                    i67 = i67;
                    strM39647 = strM39647;
                    strM5917 = strM5917;
                    i63 = i63;
                    str26 = str26;
                    i76 = i76;
                    str28 = str28;
                    arrayList6 = arrayList6;
                    if (C0483.m2123(itM6374)) {
                        iM2568 = (i60 - C2105.m6981("ۡ֨")) * (-113);
                        i61 = ((iM2568 ^ i59) * 23799) ^ 1829794020;
                        i41 = 997093092;
                    } else {
                        iM2568 = (C2105.m6981("ۨ֨") ^ i60) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i61 = ((iM2568 ^ i59) * 4915) ^ 2075437792;
                        i41 = 1742090794;
                    }
                    i62 = iM2568 ^ i41;
                    i67 = i67;
                    arrayList6 = arrayList6;
                    strM39647 = strM39647;
                    str27 = str27;
                    str28 = str28;
                    z4 = z4;
                    i76 = i76;
                    str26 = str26;
                    i63 = i63;
                    strM5917 = strM5917;
                    i64 = i64;
                    str25 = str25;
                    str29 = str29;
                    break;
                case 352666369:
                case 1355604255:
                    C4263.m12819();
                    if (!C0714.m2805()) {
                        str8 = str29;
                        str9 = str27;
                        z2 = z4;
                        i30 = i67;
                        sArr13 = sArr20;
                        str10 = strM39647;
                        strM28025 = str25;
                        i29 = i64;
                        str11 = strM5917;
                        i31 = i63;
                        str12 = str26;
                        i32 = i76;
                        str13 = str28;
                        arrayList4 = arrayList6;
                        i33 = i74;
                        iM2567 = (C2105.m6981("᩻ۗ") ^ i59) * 61;
                        str14 = strM28025;
                        i34 = ((iM2567 ^ i60) * 14067) ^ (-1659082600);
                        i35 = -1005278550;
                        i62 = iM2567 ^ i35;
                        sArr20 = sArr13;
                        i74 = i33;
                        i67 = i30;
                        arrayList6 = arrayList4;
                        str29 = str8;
                        str27 = str9;
                        i61 = i34;
                        str28 = str13;
                        i76 = i32;
                        str26 = str12;
                        strM39647 = str10;
                        i63 = i31;
                        z4 = z2;
                        strM5917 = str11;
                        i64 = i29;
                        str25 = str14;
                    } else {
                        str29 = str29;
                        str27 = str27;
                        str25 = str25;
                        i64 = i64;
                        z4 = z4;
                        i3 = i67;
                        sArr16 = sArr16;
                        sArr17 = sArr17;
                        i70 = i70;
                        sArr18 = sArr18;
                        sArr19 = sArr19;
                        i72 = i72;
                        i73 = i73;
                        sArr21 = sArr21;
                        i75 = i75;
                        strM39647 = strM39647;
                        strM5917 = strM5917;
                        i63 = i63;
                        str26 = str26;
                        i76 = i76;
                        str28 = str28;
                        arrayList6 = arrayList6;
                        i4 = i68;
                        iM6982 = C0630.m2566("ܺۚ") ^ i59;
                        i61 = ((iM6982 ^ i60) * (-7949)) ^ (-1622070615);
                        i6 = 346130961;
                        i62 = iM6982 ^ i6;
                        i68 = i4;
                        i67 = i3;
                        arrayList6 = arrayList6;
                        strM39647 = strM39647;
                        str27 = str27;
                        sArr21 = sArr21;
                        i75 = i75;
                        i72 = i72;
                        sArr19 = sArr19;
                        i73 = i73;
                        sArr17 = sArr17;
                        sArr18 = sArr18;
                        i70 = i70;
                        sArr16 = sArr16;
                        str28 = str28;
                        z4 = z4;
                        i76 = i76;
                        str26 = str26;
                        i63 = i63;
                        strM5917 = strM5917;
                        i64 = i64;
                        str25 = str25;
                        str29 = str29;
                    }
                    break;
                case 387991720:
                case 1530021486:
                    str29 = str29;
                    str27 = str27;
                    i64 = i64;
                    z4 = z4;
                    i67 = i67;
                    strM39647 = strM39647;
                    strM5917 = strM5917;
                    i63 = i63;
                    str26 = str26;
                    i76 = i76;
                    if (!z) {
                        iM25610 = C2105.m6981("ۡܰ") ^ i60;
                        i46 = ((iM25610 ^ i59) * 2571) ^ (-1939017461);
                        i47 = 2039610396;
                        i62 = iM25610 ^ i47;
                        i67 = i67;
                        i76 = i76;
                        str26 = str26;
                        strM39647 = strM39647;
                        str27 = str27;
                        i63 = i63;
                        z4 = z4;
                        strM5917 = strM5917;
                        i64 = i64;
                        i61 = i46;
                        str29 = str29;
                    } else {
                        iM25611 = C2105.m6981("ۨۘ") ^ i60;
                        i48 = ((iM25611 ^ i59) * 6263) ^ (-1949032891);
                        i49 = -1749950999;
                        i62 = iM25611 ^ i49;
                        i67 = i67;
                        strM39647 = strM39647;
                        str29 = str29;
                        str27 = str27;
                        z4 = z4;
                        str24 = strM5917;
                        i64 = i64;
                        i61 = i48;
                        i76 = i76;
                        str26 = str26;
                        i63 = i63;
                        strM5917 = str24;
                    }
                    break;
                case 406088481:
                case 1679909811:
                    strM39647 = null;
                    iM6981 = (C2105.m6981("᩻ܶ") ^ i60) * (-91);
                    i = ((iM6981 ^ i59) * (-6739)) ^ 41331789;
                    i2 = -1305405443;
                    i62 = iM6981 ^ i2;
                    i61 = i;
                    break;
                case 454086720:
                case 1896920221:
                    str29 = str29;
                    str27 = str27;
                    i64 = i64;
                    z4 = z4;
                    i67 = i67;
                    strM39647 = strM39647;
                    strM5917 = strM5917;
                    String str37 = str26;
                    i63 = i63;
                    i76 = i76;
                    int iM45714 = C19883.m45711(strM10628);
                    if (iM45714 == i64) {
                        str26 = str37;
                        i66 = iM45714;
                        iM25610 = C2105.m6981("ۤ᩵") ^ i59;
                        i46 = ((iM25610 ^ i60) * 6309) ^ 216308987;
                        i47 = -1303747450;
                        i62 = iM25610 ^ i47;
                        i67 = i67;
                        i76 = i76;
                        str26 = str26;
                        strM39647 = strM39647;
                        str27 = str27;
                        i63 = i63;
                        z4 = z4;
                        strM5917 = strM5917;
                        i64 = i64;
                        i61 = i46;
                        str29 = str29;
                    } else {
                        int iM25619 = C0630.m2566("ۨۡ") ^ i59;
                        str26 = str37;
                        i45 = ((iM25619 ^ i60) * 22797) ^ (-114942123);
                        i62 = iM25619 ^ (-271574037);
                        i66 = iM45714;
                        i67 = i67;
                        i76 = i76;
                        str26 = str26;
                        str29 = str29;
                        str27 = str27;
                        i63 = i63;
                        strM5917 = strM5917;
                        i64 = i64;
                        i61 = i45;
                        strM39647 = strM39647;
                        z4 = z4;
                    }
                    break;
                case 477659540:
                case 1268535912:
                    bitmapM139 = m139(str26);
                    z4 = z4;
                    strM39647 = strM39647;
                    str26 = str26;
                    iM25613 = C0630.m2566("֡֡") ^ i60;
                    i54 = ((iM25613 ^ i59) * (-21613)) ^ (-752186283);
                    i55 = 1856512581;
                    i62 = iM25613 ^ i55;
                    i61 = i54;
                    i76 = i76;
                    str26 = str26;
                    strM39647 = strM39647;
                    z4 = z4;
                    break;
                case 479874393:
                case 1885681524:
                    str29 = str29;
                    str27 = str27;
                    i64 = i64;
                    z4 = z4;
                    i67 = i67;
                    strM39647 = strM39647;
                    strM5917 = strM5917;
                    i63 = i63;
                    str26 = str26;
                    i76 = i76;
                    c7233 = (C7232) RunnableC1108.m3791(itM6374);
                    intentM19334 = c7233.m19333();
                    str21 = str28;
                    strM106211 = RunnableC3474.m10628(intentM19334, str21);
                    str25 = str25;
                    strM10629 = RunnableC3474.m10628(intentM19334, str25);
                    if (strM106211 == null) {
                        iM6984 = (C2105.m6981("֨ۡ") ^ i60) * 99;
                        i64 = i64;
                        i61 = ((iM6984 ^ i59) * 18431) ^ (-122224614);
                        i44 = -159455569;
                        i62 = iM6984 ^ i44;
                        str28 = str21;
                        i67 = i67;
                        i76 = i76;
                        str26 = str26;
                        strM39647 = strM39647;
                        str27 = str27;
                        i63 = i63;
                        z4 = z4;
                        strM5917 = strM5917;
                        i64 = i64;
                        str25 = str25;
                        str29 = str29;
                    } else {
                        int iM25620 = C0630.m2566("᩶֫") ^ i59;
                        i45 = ((iM25620 ^ i60) * 10683) ^ (-2043699449);
                        i62 = iM25620 ^ 1930765491;
                        str28 = str21;
                        str25 = str25;
                        i67 = i67;
                        i76 = i76;
                        str26 = str26;
                        str29 = str29;
                        str27 = str27;
                        i63 = i63;
                        strM5917 = strM5917;
                        i64 = i64;
                        i61 = i45;
                        strM39647 = strM39647;
                        z4 = z4;
                    }
                    break;
                case 502166578:
                case 580773575:
                    String strM39648 = C16870.m39647(strM6571);
                    if (strM39648 != null) {
                        charSequence = strM39648;
                    } else {
                        charSequence = charSequenceM19334;
                    }
                    iM6981 = C2105.m6981("᩵۫") ^ i59;
                    i = ((iM6981 ^ i60) * 25609) ^ (-507663351);
                    i2 = 798979403;
                    i62 = iM6981 ^ i2;
                    i61 = i;
                    break;
                case 540039609:
                case 930083837:
                    i67 = 61558;
                    int iM69819 = (i59 - C2105.m6981("ۗۙ")) * (-75);
                    i61 = ((iM69819 ^ i60) * (-1229)) ^ 1334756511;
                    i62 = iM69819 ^ (-922927914);
                    i68 = i68;
                    arrayList6 = arrayList6;
                    strM39647 = strM39647;
                    str27 = str27;
                    sArr21 = sArr21;
                    i75 = i75;
                    i72 = i72;
                    sArr19 = sArr19;
                    i73 = i73;
                    sArr17 = sArr17;
                    sArr18 = sArr18;
                    i70 = i70;
                    sArr16 = sArr16;
                    str28 = str28;
                    z4 = z4;
                    i76 = i76;
                    str26 = str26;
                    i63 = i63;
                    strM5917 = strM5917;
                    i64 = i64;
                    str25 = str25;
                    str29 = str29;
                    break;
                case 580707609:
                case 1472806978:
                    z4 = z4;
                    strM39647 = strM39647;
                    str26 = str26;
                    if (bitmap == null) {
                        iM25613 = C0630.m2566("ܰܿ") ^ i59;
                        i76 = i76;
                        i54 = ((iM25613 ^ i60) * 30985) ^ (-176743597);
                        i55 = -764982328;
                    } else {
                        bitmapM139 = bitmap;
                        iM25613 = C0630.m2566("֡֡") ^ i60;
                        i54 = ((iM25613 ^ i59) * (-21613)) ^ (-752186283);
                        i55 = 1856512581;
                    }
                    i62 = iM25613 ^ i55;
                    i61 = i54;
                    i76 = i76;
                    str26 = str26;
                    strM39647 = strM39647;
                    z4 = z4;
                    break;
                case 581781245:
                case 617666369:
                    str29 = str29;
                    str27 = str27;
                    str25 = str25;
                    i64 = i64;
                    z4 = z4;
                    i3 = i67;
                    sArr16 = sArr16;
                    sArr17 = sArr17;
                    i70 = i70;
                    sArr18 = sArr18;
                    sArr19 = sArr19;
                    i72 = i72;
                    i73 = i73;
                    sArr21 = sArr21;
                    i75 = i75;
                    strM39647 = strM39647;
                    strM5917 = strM5917;
                    i63 = i63;
                    str26 = str26;
                    i76 = i76;
                    str28 = str28;
                    arrayList6 = arrayList6;
                    i4 = i68;
                    sArr15 = f67;
                    c = '\n';
                    if (C1005.m3501()) {
                        iM6982 = (C2105.m6981("ۗ֫") + i60) * 31;
                        i61 = ((iM6982 ^ i59) * 32407) ^ 1658753334;
                        i6 = -1056893855;
                    } else {
                        iM6982 = C0630.m2566("ܺۚ") ^ i59;
                        i61 = ((iM6982 ^ i60) * (-7949)) ^ (-1622070615);
                        i6 = 346130961;
                    }
                    i62 = iM6982 ^ i6;
                    i68 = i4;
                    i67 = i3;
                    arrayList6 = arrayList6;
                    strM39647 = strM39647;
                    str27 = str27;
                    sArr21 = sArr21;
                    i75 = i75;
                    i72 = i72;
                    sArr19 = sArr19;
                    i73 = i73;
                    sArr17 = sArr17;
                    sArr18 = sArr18;
                    i70 = i70;
                    sArr16 = sArr16;
                    str28 = str28;
                    z4 = z4;
                    i76 = i76;
                    str26 = str26;
                    i63 = i63;
                    strM5917 = strM5917;
                    i64 = i64;
                    str25 = str25;
                    str29 = str29;
                    break;
                case 678703187:
                case 1328432653:
                    arrayList5 = arrayList6;
                    str15 = strM5917;
                    str29 = str29;
                    str16 = str27;
                    str17 = str25;
                    i36 = i63;
                    z4 = z4;
                    i37 = i67;
                    str18 = strM39647;
                    str19 = str26;
                    i38 = i76;
                    sArr14 = sArr21;
                    i39 = i75;
                    strM4373 = C1294.m4373(sArr14, i39, 15, i37);
                    z6 = false;
                    if (!zM141) {
                        i40 = -1;
                        int iM256110 = (C0630.m2566("ۡܿ") ^ i60) * 21;
                        String str38 = strM4373;
                        int i89 = ((iM256110 ^ i59) * 1189) ^ (-259460048);
                        i62 = iM256110 ^ (-2147479389);
                        sArr21 = sArr14;
                        i75 = i39;
                        i67 = i37;
                        i76 = i38;
                        arrayList6 = arrayList5;
                        str26 = str19;
                        str27 = str16;
                        i61 = i89;
                        i63 = i36;
                        str28 = str38;
                        strM5917 = str15;
                        strM39647 = str18;
                        i64 = i40;
                        str25 = str17;
                        z4 = z4;
                        str29 = str29;
                    } else {
                        int iM25621 = C0630.m2566("ᩴ᩸") ^ i59;
                        i62 = iM25621 ^ (-1463585194);
                        sArr21 = sArr14;
                        i75 = i39;
                        i61 = ((iM25621 ^ i60) * 5861) ^ 529448271;
                        str25 = str17;
                        i67 = i37;
                        i76 = i38;
                        arrayList6 = arrayList5;
                        str26 = str19;
                        str29 = str29;
                        str27 = str16;
                        str28 = strM4373;
                        i63 = i36;
                        strM5917 = str15;
                        strM39647 = str18;
                        i64 = -1;
                        z4 = z4;
                    }
                    break;
                case 694123601:
                case 1647315621:
                    str29 = str29;
                    str7 = str27;
                    str25 = str25;
                    i63 = i63;
                    i64 = i64;
                    z4 = z4;
                    i21 = i67;
                    i22 = i69;
                    short[] sArr28 = sArr19;
                    int i90 = i72;
                    int i91 = i73;
                    sArr9 = sArr21;
                    i23 = i75;
                    str2 = strM39647;
                    str26 = str26;
                    sArr10 = sArr17;
                    i76 = i76;
                    str28 = str28;
                    arrayList2 = arrayList6;
                    i24 = i70;
                    strM5917 = C1773.m5917(sArr10, i22, i24, i21);
                    sArr18 = f67;
                    i71 = 19;
                    if (RunnableC0588.m2441() < 0) {
                        int iM69820 = (C2105.m6981("۫۟") ^ i59) * 61;
                        i61 = ((iM69820 ^ i60) * 17819) ^ (-1080212015);
                        i62 = iM69820 ^ 907464234;
                        i70 = i24;
                        i67 = i21;
                        arrayList6 = arrayList2;
                        strM39647 = str2;
                        str27 = str7;
                        sArr21 = sArr9;
                        i75 = i23;
                        i72 = i90;
                        sArr19 = sArr28;
                        i73 = i91;
                        sArr17 = sArr10;
                        i69 = i22;
                        str28 = str28;
                        z4 = z4;
                        i76 = i76;
                        str26 = str26;
                        i63 = i63;
                        strM5917 = strM5917;
                        i64 = i64;
                        str25 = str25;
                        str29 = str29;
                    } else {
                        i72 = i90;
                        sArr19 = sArr28;
                        i73 = i91;
                        int iM69821 = C2105.m6981("ۙ᩷") ^ i59;
                        short[] sArr29 = sArr10;
                        i20 = ((iM69821 ^ i60) * (-265)) ^ (-1006887702);
                        i62 = iM69821 ^ (-1440591635);
                        i69 = i22;
                        i70 = i24;
                        i67 = i21;
                        arrayList6 = arrayList2;
                        str27 = str7;
                        sArr21 = sArr9;
                        i75 = i23;
                        sArr17 = sArr29;
                        i61 = i20;
                        str28 = str28;
                        i76 = i76;
                        str26 = str26;
                        strM39647 = str2;
                        i63 = i63;
                        z4 = z4;
                        strM5917 = strM5917;
                        i64 = i64;
                        str25 = str25;
                        str29 = str29;
                    }
                    break;
                case 730925863:
                case 1890629546:
                    str29 = str29;
                    str3 = str27;
                    str25 = str25;
                    i64 = i64;
                    z4 = z4;
                    i13 = i67;
                    sArr5 = sArr17;
                    i14 = i70;
                    sArr6 = sArr18;
                    sArr7 = sArr19;
                    i15 = i72;
                    i16 = i73;
                    sArr8 = sArr21;
                    i17 = i75;
                    str4 = strM39647;
                    strM5917 = strM5917;
                    i63 = i63;
                    str5 = str26;
                    i18 = i76;
                    str6 = str28;
                    arrayList6 = new ArrayList();
                    zM141 = m141();
                    sArr16 = f67;
                    i68 = 11;
                    if (C1128.f4106 <= 0) {
                        iM6983 = (C2105.m6981("ۡ᩶") ^ i60) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i61 = ((iM6983 ^ i59) * 25093) ^ 488338149;
                        i19 = -1226881317;
                    } else {
                        iM6983 = C2105.m6981("֡᩷") ^ i60;
                        i61 = ((iM6983 ^ i59) * 3091) ^ (-1383950098);
                        i19 = 377477556;
                    }
                    i62 = iM6983 ^ i19;
                    str28 = str6;
                    i67 = i13;
                    i76 = i18;
                    str26 = str5;
                    strM39647 = str4;
                    str27 = str3;
                    sArr21 = sArr8;
                    i75 = i17;
                    i72 = i15;
                    sArr19 = sArr7;
                    i73 = i16;
                    sArr17 = sArr5;
                    sArr18 = sArr6;
                    i70 = i14;
                    i63 = i63;
                    z4 = z4;
                    strM5917 = strM5917;
                    i64 = i64;
                    str25 = str25;
                    str29 = str29;
                    break;
                case 733047608:
                case 1263357678:
                    bitmap = null;
                    z3 = z5;
                    iM25611 = (i59 - C2105.m6981("ۧ᩻")) * 53;
                    i48 = ((iM25611 ^ i60) * (-22621)) ^ (-189859973);
                    i49 = -1033453010;
                    i62 = iM25611 ^ i49;
                    i67 = i67;
                    strM39647 = strM39647;
                    str29 = str29;
                    str27 = str27;
                    z4 = z4;
                    str24 = strM5917;
                    i64 = i64;
                    i61 = i48;
                    i76 = i76;
                    str26 = str26;
                    i63 = i63;
                    strM5917 = str24;
                    break;
                case 807931047:
                case 1703813313:
                    str29 = str29;
                    str27 = str27;
                    i64 = i64;
                    z4 = z4;
                    i67 = i67;
                    strM39647 = strM39647;
                    strM5917 = strM5917;
                    i63 = i63;
                    str26 = str26;
                    i76 = i76;
                    if (strM10628 != null) {
                        iM25610 = C0630.m2566("ۙ᩸") ^ i60;
                        i46 = ((iM25610 ^ i59) * 26083) ^ 1249955880;
                        i47 = -165208408;
                    } else {
                        iM25610 = C2105.m6981("ۤ᩵") ^ i59;
                        i46 = ((iM25610 ^ i60) * 6309) ^ 216308987;
                        i47 = -1303747450;
                    }
                    i62 = iM25610 ^ i47;
                    i67 = i67;
                    i76 = i76;
                    str26 = str26;
                    strM39647 = strM39647;
                    str27 = str27;
                    i63 = i63;
                    z4 = z4;
                    strM5917 = strM5917;
                    i64 = i64;
                    i61 = i46;
                    str29 = str29;
                    break;
                case 826001277:
                case 2056827358:
                    itM6374 = RunnableC1937.m6374(C16362.m38519(abstractActivityC3346));
                    iM2568 = C0630.m2566("ܰܰ") ^ i59;
                    i61 = ((iM2568 ^ i60) * (-17903)) ^ (-1434083759);
                    i41 = -694136245;
                    i62 = iM2568 ^ i41;
                    i67 = i67;
                    arrayList6 = arrayList6;
                    strM39647 = strM39647;
                    str27 = str27;
                    str28 = str28;
                    z4 = z4;
                    i76 = i76;
                    str26 = str26;
                    i63 = i63;
                    strM5917 = strM5917;
                    i64 = i64;
                    str25 = str25;
                    str29 = str29;
                    break;
                case 939984935:
                case 1135499847:
                    c13581 = new C13581(c7233);
                    if (strM39647 != null) {
                        iM6981 = (C0630.m2566("ۧ᩹") ^ i60) * 97;
                        i = ((iM6981 ^ i59) * (-29637)) ^ 87212136;
                        i2 = -2081378181;
                    } else {
                        iM6981 = C2105.m6981("ᩴᩳ") ^ i60;
                        i = ((iM6981 ^ i59) * (-17669)) ^ 234308671;
                        i2 = -119202893;
                    }
                    i62 = iM6981 ^ i2;
                    i61 = i;
                    break;
                case 985904200:
                case 1835994828:
                    str29 = str29;
                    str27 = str27;
                    str25 = str25;
                    i64 = i64;
                    z4 = z4;
                    i67 = i67;
                    strM39647 = strM39647;
                    strM5917 = strM5917;
                    i63 = i63;
                    str26 = str26;
                    i76 = i76;
                    str28 = str28;
                    arrayList6 = arrayList6;
                    if (C0483.m2123(itM12354)) {
                        iM2568 = (i60 - C0630.m2566("ۚ۟")) * 19;
                        i61 = ((iM2568 ^ i59) * 14735) ^ 1914376748;
                        i41 = -558678141;
                    } else {
                        iM2568 = C0630.m2566("᩻ܽ") ^ i59;
                        i61 = ((iM2568 ^ i60) * 26781) ^ (-142708234);
                        i41 = -516339372;
                    }
                    i62 = iM2568 ^ i41;
                    i67 = i67;
                    arrayList6 = arrayList6;
                    strM39647 = strM39647;
                    str27 = str27;
                    str28 = str28;
                    z4 = z4;
                    i76 = i76;
                    str26 = str26;
                    i63 = i63;
                    strM5917 = strM5917;
                    i64 = i64;
                    str25 = str25;
                    str29 = str29;
                    break;
                case 1042743064:
                case 1802828292:
                    if (!C1504.f5354) {
                        str29 = str29;
                        str3 = str27;
                        str25 = str25;
                        i64 = i64;
                        z4 = z4;
                        i13 = i67;
                        sArr5 = sArr17;
                        i14 = i70;
                        sArr6 = sArr18;
                        sArr7 = sArr19;
                        i15 = i72;
                        i16 = i73;
                        sArr8 = sArr21;
                        i17 = i75;
                        str4 = strM39647;
                        strM5917 = strM5917;
                        i63 = i63;
                        str5 = str26;
                        i18 = i76;
                        str6 = str28;
                        iM6983 = (C2105.m6981("ۡ᩶") ^ i60) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i61 = ((iM6983 ^ i59) * 25093) ^ 488338149;
                        i19 = -1226881317;
                        i62 = iM6983 ^ i19;
                        str28 = str6;
                        i67 = i13;
                        i76 = i18;
                        str26 = str5;
                        strM39647 = str4;
                        str27 = str3;
                        sArr21 = sArr8;
                        i75 = i17;
                        i72 = i15;
                        sArr19 = sArr7;
                        i73 = i16;
                        sArr17 = sArr5;
                        sArr18 = sArr6;
                        i70 = i14;
                        i63 = i63;
                        z4 = z4;
                        strM5917 = strM5917;
                        i64 = i64;
                        str25 = str25;
                        str29 = str29;
                    } else {
                        str8 = str29;
                        str9 = str27;
                        z2 = z4;
                        i30 = i67;
                        sArr13 = sArr20;
                        str10 = strM39647;
                        strM28025 = str25;
                        i29 = i64;
                        str11 = strM5917;
                        i31 = i63;
                        str12 = str26;
                        i32 = i76;
                        str13 = str28;
                        arrayList4 = arrayList6;
                        i33 = i74;
                        iM2567 = (C2105.m6981("᩻ۗ") ^ i59) * 61;
                        str14 = strM28025;
                        i34 = ((iM2567 ^ i60) * 14067) ^ (-1659082600);
                        i35 = -1005278550;
                        i62 = iM2567 ^ i35;
                        sArr20 = sArr13;
                        i74 = i33;
                        i67 = i30;
                        arrayList6 = arrayList4;
                        str29 = str8;
                        str27 = str9;
                        i61 = i34;
                        str28 = str13;
                        i76 = i32;
                        str26 = str12;
                        strM39647 = str10;
                        i63 = i31;
                        z4 = z2;
                        strM5917 = str11;
                        i64 = i29;
                        str25 = str14;
                    }
                    break;
                case 1078040517:
                case 1951535661:
                    C2520.m8026();
                    ServiceConnectionC3453.m10564();
                    break;
                case 1240662157:
                case 2120171021:
                    str29 = str29;
                    str = str27;
                    str25 = str25;
                    str28 = str28;
                    i64 = i64;
                    z4 = z4;
                    i7 = i67;
                    short[] sArr30 = sArr18;
                    sArr3 = sArr19;
                    i8 = i72;
                    i9 = i73;
                    sArr4 = sArr21;
                    i10 = i75;
                    str2 = strM39647;
                    arrayList = arrayList6;
                    strM5917 = strM5917;
                    i63 = i63;
                    str26 = str26;
                    i12 = iM6985 ^ i56;
                    sArr17 = f67;
                    i69 = 14;
                    i70 = 5;
                    if (!RunnableC1108.f4040) {
                        sArr2 = sArr30;
                        i11 = i68;
                        int iM698110 = (i60 - C2105.m6981("ۖۛ")) * 115;
                        i76 = i12;
                        i62 = iM698110 ^ (-542269047);
                        i61 = ((iM698110 ^ i59) * 28065) ^ 1601447367;
                        i68 = i11;
                        i67 = i7;
                        arrayList6 = arrayList;
                        strM39647 = str2;
                        str27 = str;
                        sArr21 = sArr4;
                        i75 = i10;
                        i72 = i8;
                        sArr19 = sArr3;
                        i73 = i9;
                        sArr18 = sArr2;
                        sArr16 = sArr16;
                        str28 = str28;
                        z4 = z4;
                        i76 = i76;
                        str26 = str26;
                        i63 = i63;
                        strM5917 = strM5917;
                        i64 = i64;
                        str25 = str25;
                        str29 = str29;
                    } else {
                        int iM69822 = (i60 - C2105.m6981("᩷᩵")) * (-125);
                        i76 = i12;
                        i20 = ((iM69822 ^ i59) * (-12935)) ^ (-699209008);
                        i62 = iM69822 ^ 1333968206;
                        sArr18 = sArr30;
                        i67 = i7;
                        arrayList6 = arrayList;
                        str27 = str;
                        sArr21 = sArr4;
                        i75 = i10;
                        i72 = i8;
                        sArr19 = sArr3;
                        i73 = i9;
                        i61 = i20;
                        str28 = str28;
                        i76 = i76;
                        str26 = str26;
                        strM39647 = str2;
                        i63 = i63;
                        z4 = z4;
                        strM5917 = strM5917;
                        i64 = i64;
                        str25 = str25;
                        str29 = str29;
                    }
                    break;
                case 1242896365:
                case 2092866258:
                    iM6981 = C0630.m2566("ۘۛ") ^ i59;
                    i = ((iM6981 ^ i60) * 12275) ^ 1354147993;
                    i2 = 910322278;
                    i62 = iM6981 ^ i2;
                    i61 = i;
                    break;
                case 1416275941:
                case 1982544061:
                    z4 = z4;
                    Bitmap bitmapM16748 = RunnableC5974.m16745(C19883.f64212.mo7431(), i66, z4);
                    str22 = str26;
                    m137(str22, bitmapM16748);
                    bitmap2 = bitmapM16748;
                    i50 = i63;
                    int iM256111 = C0630.m2566("ᩴۤ") ^ i60;
                    int i810 = ((iM256111 ^ i59) * 12987) ^ (-2039121418);
                    i62 = iM256111 ^ (-2079293965);
                    i63 = i50;
                    i67 = i67;
                    i76 = i76;
                    strM5917 = strM5917;
                    str27 = str27;
                    str26 = str22;
                    i64 = i64;
                    i61 = i810;
                    strM39647 = strM39647;
                    str29 = str29;
                    z4 = z4;
                    break;
                case 1642405728:
                case 1877070146:
                    C3911.m11924();
                    if (C1047.f3863 < 0) {
                        str29 = str29;
                        str27 = str27;
                        str25 = str25;
                        i64 = i64;
                        z4 = z4;
                        i3 = i67;
                        sArr = sArr16;
                        sArr17 = sArr17;
                        i70 = i70;
                        sArr18 = sArr18;
                        sArr19 = sArr19;
                        i72 = i72;
                        i73 = i73;
                        sArr21 = sArr21;
                        i75 = i75;
                        strM39647 = strM39647;
                        strM5917 = strM5917;
                        i63 = i63;
                        str26 = str26;
                        i76 = i76;
                        str28 = str28;
                        arrayList6 = arrayList6;
                        i4 = i68;
                        iM6982 = C0630.m2566("ܳܳ") ^ i60;
                        sArr16 = sArr;
                        i61 = ((iM6982 ^ i59) * (-10255)) ^ (-1927166748);
                        i6 = -2062920402;
                        i62 = iM6982 ^ i6;
                        i68 = i4;
                        i67 = i3;
                        arrayList6 = arrayList6;
                        strM39647 = strM39647;
                        str27 = str27;
                        sArr21 = sArr21;
                        i75 = i75;
                        i72 = i72;
                        sArr19 = sArr19;
                        i73 = i73;
                        sArr17 = sArr17;
                        sArr18 = sArr18;
                        i70 = i70;
                        sArr16 = sArr16;
                        str28 = str28;
                        z4 = z4;
                        i76 = i76;
                        str26 = str26;
                        i63 = i63;
                        strM5917 = strM5917;
                        i64 = i64;
                        str25 = str25;
                        str29 = str29;
                    } else {
                        iM6981 = C2105.m6981("ۖᩳ") ^ i60;
                        i = ((iM6981 ^ i59) * (-21135)) ^ 257650633;
                        i2 = -753848046;
                        i62 = iM6981 ^ i2;
                        i61 = i;
                    }
                    break;
                default:
                    if (intentM19333.getBooleanExtra(str27, false)) {
                        iM6981 = (C0630.m2566("ۨᩳ") + i60) * (-119);
                        i = ((iM6981 ^ i59) * (-9729)) ^ (-1632074955);
                        i2 = -1406789581;
                    } else {
                        charSequence = charSequenceM19334;
                        iM6981 = C2105.m6981("᩵۫") ^ i59;
                        i = ((iM6981 ^ i60) * 25609) ^ (-507663351);
                        i2 = 798979403;
                    }
                    i62 = iM6981 ^ i2;
                    i61 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static boolean m141() {
        boolean zM38516 = false;
        int i = -14009840;
        int i2 = RunnableC0588.f2309;
        int i3 = C11340.f33930;
        int iM2566 = C0630.m2566("֫ۡ") ^ i2;
        int i4 = ((iM2566 ^ i3) * 27921) ^ 689170349;
        int i5 = -195916221;
        while (true) {
            i = ((((i ^ i3) * 29213) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2061906248:
                case -1335567817:
                    C1294.m4372();
                    if (C0630.f2410 <= 0) {
                        iM2566 = (C0630.m2566("ۚۛ") + i3) * 93;
                        i4 = ((iM2566 ^ i2) * 13359) ^ (-1623912127);
                        i5 = 351666955;
                    } else {
                        iM2566 = (C0630.m2566("۫ᩴ") ^ i2) * 55;
                        i4 = ((iM2566 ^ i3) * (-21161)) ^ 1826783791;
                        i5 = 139262113;
                    }
                    break;
                case -1968315757:
                case 1439040411:
                    if (C4075.f12947 >= 0) {
                        iM2566 = (C0630.m2566("۫ᩴ") ^ i2) * 55;
                        i4 = ((iM2566 ^ i3) * (-21161)) ^ 1826783791;
                        i5 = 139262113;
                    } else {
                        iM2566 = (C2105.m6981("ۧۚ") ^ i3) * 43;
                        i4 = ((iM2566 ^ i2) * 22875) ^ 1042707924;
                        i5 = 1296040515;
                    }
                    break;
                case -1659161010:
                case 260459624:
                    C2520.m8026();
                    if (C0964.f3626 != 0) {
                        iM2566 = C2105.m6981("۬֫") ^ i2;
                        i4 = ((iM2566 ^ i3) * 1501) ^ 884002217;
                        i5 = -917473087;
                    } else {
                        iM2566 = (C0630.m2566("ۚۛ") + i3) * 93;
                        i4 = ((iM2566 ^ i2) * 13359) ^ (-1623912127);
                        i5 = 351666955;
                    }
                    break;
                case -1287877277:
                case -340288020:
                    if (C0964.m3413()) {
                        iM2566 = C0630.m2566("ۖ᩺") ^ i3;
                        i4 = ((iM2566 ^ i2) * 24173) ^ (-327666372);
                        i5 = 517078616;
                    } else {
                        iM2566 = C2105.m6981("ۡ᩵") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-11647)) ^ 203338369;
                        i5 = -1770169229;
                    }
                    break;
                case -931955746:
                case 482128043:
                    C2167.m7155();
                    C2126.m7040();
                    return false;
                case -889506048:
                case -759162089:
                    f66 = C1420.m4911(zM38516);
                    iM2566 = C0630.m2566("֡ۤ") ^ i2;
                    i4 = ((iM2566 ^ i3) * (-15365)) ^ (-256963215);
                    i5 = -514736764;
                    break;
                case -640985828:
                case 1522940266:
                    zM38516 = C16362.m38516(C3432.m10479());
                    if (C3432.f10845 >= 0) {
                        iM2566 = C2105.m6981("۬֫") ^ i2;
                        i4 = ((iM2566 ^ i3) * 1501) ^ 884002217;
                        i5 = -917473087;
                    } else {
                        iM2566 = (i3 - C2105.m6981("۫᩺")) * 97;
                        i4 = ((iM2566 ^ i2) * (-365)) ^ 1847858364;
                        i5 = 707168845;
                    }
                    break;
                case -597145734:
                case 1236998496:
                    if (C7811.f24123 >= 0) {
                        iM2566 = (C2105.m6981("ᩴ۫") + i3) * 59;
                        i4 = ((iM2566 ^ i2) * 22787) ^ (-939373115);
                        i5 = 1668050809;
                    } else {
                        iM2566 = (C0630.m2566("۟᩷") ^ i2) * 23;
                        i4 = ((iM2566 ^ i3) * (-7337)) ^ 292630540;
                        i5 = -704791893;
                    }
                    break;
                case -580524019:
                case 1654128882:
                    if (C5695.f17556 >= 0) {
                        iM2566 = (C2105.m6981("ᩴ۫") + i3) * 59;
                        i4 = ((iM2566 ^ i2) * 22787) ^ (-939373115);
                        i5 = 1668050809;
                    } else {
                        iM2566 = (C2105.m6981("᩹ۙ") ^ i3) * 79;
                        i4 = ((iM2566 ^ i2) * (-18323)) ^ (-1741562681);
                        i5 = 761912735;
                    }
                    break;
                case -506738073:
                case 269784044:
                    if (C4159.m12565() >= 0) {
                        iM2566 = (C0630.m2566("۫ᩴ") ^ i2) * 55;
                        i4 = ((iM2566 ^ i3) * (-21161)) ^ 1826783791;
                        i5 = 139262113;
                    } else {
                        iM2566 = C2105.m6981("᩹ۢ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 14641) ^ 1007600296;
                        i5 = 743448060;
                    }
                    break;
                case -316579735:
                case 2024470344:
                    return C2958.m9032(f66);
                case -294104218:
                case 996352956:
                    if (C21923.f70183 != 0) {
                        iM2566 = C2105.m6981("۬֫") ^ i2;
                        i4 = ((iM2566 ^ i3) * 1501) ^ 884002217;
                        i5 = -917473087;
                    } else {
                        iM2566 = C0630.m2566("ܳܳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-26455)) ^ 713571505;
                        i5 = -442837029;
                    }
                    break;
                case -126287543:
                case 496599579:
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = (C0630.m2566("ۚۛ") + i3) * 93;
                        i4 = ((iM2566 ^ i2) * 13359) ^ (-1623912127);
                        i5 = 351666955;
                    } else {
                        iM2566 = (C0630.m2566("۠ᩴ") + i2) * q.h;
                        i4 = ((iM2566 ^ i3) * (-21473)) ^ 663480362;
                        i5 = -303744070;
                    }
                    break;
                case 124380258:
                case 624177529:
                    C2520.m8026();
                    iM2566 = (C0630.m2566("۫ᩴ") ^ i2) * 55;
                    i4 = ((iM2566 ^ i3) * (-21161)) ^ 1826783791;
                    i5 = 139262113;
                    break;
                case 191243470:
                case 2086784532:
                    if (C0483.m2121()) {
                        iM2566 = C0630.m2566("ܳܶ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-17693)) ^ (-1847706017);
                        i5 = 1917617184;
                    } else {
                        iM2566 = C2105.m6981("ۡ᩵") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-11647)) ^ 203338369;
                        i5 = -1770169229;
                    }
                    break;
                case 310005634:
                case 1839843194:
                    if (f66 == null) {
                        iM2566 = C0630.m2566("ܰܰ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-3429)) ^ 793359735;
                        i5 = 232887328;
                    } else {
                        iM2566 = C0630.m2566("֡ۤ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-15365)) ^ (-256963215);
                        i5 = -514736764;
                    }
                    break;
                case 647230084:
                case 1353407313:
                    C21923.m49329();
                    if (C0237.f1507 == 0) {
                        iM2566 = (C2105.m6981("ᩴ۫") + i3) * 59;
                        i4 = ((iM2566 ^ i2) * 22787) ^ (-939373115);
                        i5 = 1668050809;
                    } else {
                        iM2566 = (C0630.m2566("۫ᩴ") ^ i2) * 55;
                        i4 = ((iM2566 ^ i3) * (-21161)) ^ 1826783791;
                        i5 = 139262113;
                    }
                    break;
                default:
                    if (C0237.f1507 != 0) {
                        iM2566 = C2105.m6981("ۡ᩵") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-11647)) ^ 203338369;
                        i5 = -1770169229;
                    } else {
                        iM2566 = C2105.m6981("ۖۙ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-25853)) ^ (-2108280965);
                        i5 = 2016472843;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b7 A[PHI: r14
      0x00b7: PHI (r14v3 int) = (r14v2 int), (r14v1 int) binds: [B:26:0x00b5, B:18:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x015d A[PHI: r8 r9 r10 r15
      0x015d: PHI (r8v4 short) = (r8v1 short), (r8v1 short), (r8v2 short), (r8v1 short) binds: [B:40:0x013c, B:34:0x0102, B:13:0x0077, B:45:0x015b] A[DONT_GENERATE, DONT_INLINE]
      0x015d: PHI (r9v4 int) = (r9v1 int), (r9v2 int), (r9v1 int), (r9v1 int) binds: [B:40:0x013c, B:34:0x0102, B:13:0x0077, B:45:0x015b] A[DONT_GENERATE, DONT_INLINE]
      0x015d: PHI (r10v4 int) = (r10v1 int), (r10v2 int), (r10v1 int), (r10v1 int) binds: [B:40:0x013c, B:34:0x0102, B:13:0x0077, B:45:0x015b] A[DONT_GENERATE, DONT_INLINE]
      0x015d: PHI (r15v3 int) = (r15v1 int), (r15v1 int), (r15v1 int), (r15v5 int) binds: [B:40:0x013c, B:34:0x0102, B:13:0x0077, B:45:0x015b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x019b A[PHI: r1 r6
      0x019b: PHI (r1v3 short[]) = (r1v2 short[]), (r1v1 short[]), (r1v1 short[]) binds: [B:52:0x0199, B:23:0x00ae, B:18:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x019b: PHI (r6v5 l.ܶ᩵ܿ) = (r6v4 l.ܶ᩵ܿ), (r6v3 l.ܶ᩵ܿ), (r6v3 l.ܶ᩵ܿ) binds: [B:52:0x0199, B:23:0x00ae, B:18:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:65:0x0219 A[PHI: r0 r7
      0x0219: PHI (r0v6 short[]) = (r0v4 short[]), (r0v3 short[]) binds: [B:64:0x0217, B:49:0x0190] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r7v4 char) = (r7v2 char), (r7v1 char) binds: [B:64:0x0217, B:49:0x0190] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        int iM2566;
        int i;
        int i2;
        int i3;
        short[] sArr = null;
        short[] sArr2 = null;
        int i4 = RunnableC0588.f2309;
        int i5 = RunnableC1937.f6483;
        int iM2567 = C0630.m2566("۬᩻") ^ i5;
        int i6 = ((iM2567 ^ i4) * 14679) ^ 449336939;
        int i7 = iM2567 ^ 290205748;
        AbstractC15440 abstractC15440 = null;
        char c = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 419350082;
        int i14 = 0;
        while (true) {
            i13 = i7 ^ (i6 & (((i13 ^ i4) * (-19633)) >> 31));
            switch (i13) {
                case -2136007151:
                case -579754084:
                    sArr = f67;
                    c = 0;
                    if (C1420.m4913()) {
                        i2 = i14;
                        iM2566 = C2105.m6981("ۙ۟") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-3095)) ^ 954148749;
                        i14 = i2;
                        i = 2039868557;
                    } else {
                        iM2566 = C0630.m2566("۫ܶ") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-13999)) ^ 823782854;
                        i = 1387624723;
                    }
                    i7 = iM2566 ^ i;
                    break;
                case -2123904638:
                case 912284667:
                    f68 = C1504.m5171(abstractC15440, C1005.m3502(sArr2, i11, i12, i10));
                    return;
                case -1928518728:
                case 248493875:
                    C1420.m4913();
                    C5695.m16023();
                    iM2566 = C0630.m2566("ۘܺ") ^ i5;
                    i6 = ((iM2566 ^ i4) * 3885) ^ 1554259831;
                    i = -82471244;
                    i7 = iM2566 ^ i;
                    break;
                case -1810792421:
                case 1071774368:
                    i2 = i8 + i9;
                    s2 = 1264;
                    if (C11340.m28031()) {
                        iM2566 = (C0630.m2566("ۢᩳ") + i5) * 15;
                        i6 = ((iM2566 ^ i4) * 4633) ^ (-2126460502);
                        i14 = i2;
                        i = -72875283;
                    } else {
                        iM2566 = C2105.m6981("ۙ۟") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-3095)) ^ 954148749;
                        i14 = i2;
                        i = 2039868557;
                    }
                    i7 = iM2566 ^ i;
                    break;
                case -1626523697:
                case -1059423900:
                    abstractC15440 = C16293.f50117;
                    sArr2 = f67;
                    if (C7106.f21815 != 0) {
                        iM2566 = C2105.m6981("ۙۗ") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-15217)) ^ 691970846;
                        i = -1758162046;
                    } else {
                        iM2566 = (i5 - C0630.m2566("۠ۜ")) * (-35);
                        i6 = ((iM2566 ^ i4) * (-5159)) ^ (-1541988648);
                        i = 187284961;
                    }
                    i7 = iM2566 ^ i;
                    break;
                case -1572790085:
                case 1169264347:
                    C0422.m1963();
                    if (C0798.f2919) {
                        i2 = i14;
                        iM2566 = C2105.m6981("ۙ۟") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-3095)) ^ 954148749;
                        i14 = i2;
                        i = 2039868557;
                    } else {
                        iM2566 = C0630.m2566("ۘܺ") ^ i5;
                        i6 = ((iM2566 ^ i4) * 3885) ^ 1554259831;
                        i = -82471244;
                    }
                    i7 = iM2566 ^ i;
                    break;
                case -1523747698:
                case 1034659900:
                    if (C4263.m12819() >= 0) {
                        i12 = 9;
                        iM2566 = C2105.m6981("᩻ۗ") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-20999)) ^ (-1525952081);
                        i = -733999123;
                        i7 = iM2566 ^ i;
                    } else {
                        int iM6981 = (i4 - C2105.m6981("ܶᩳ")) * 25;
                        i6 = ((iM6981 ^ i5) * 27369) ^ 643193073;
                        i7 = iM6981 ^ 1071895961;
                        i12 = 9;
                    }
                    break;
                case -1310709431:
                case 1820240534:
                    if (C7811.m20844() != 0) {
                        iM2566 = C2105.m6981("᩻ۗ") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-20999)) ^ (-1525952081);
                        i = -733999123;
                    } else {
                        iM2566 = (C0630.m2566("ۛܰ") + i5) * 49;
                        i6 = ((iM2566 ^ i4) * (-20781)) ^ 841165583;
                        i = -1918002600;
                    }
                    i7 = iM2566 ^ i;
                    break;
                case -1186826258:
                case 148381608:
                    i3 = 54191;
                    int iM2568 = C0630.m2566("ۡۙ") ^ i4;
                    i10 = i3;
                    iM2566 = iM2568;
                    i6 = ((iM2568 ^ i5) * (-28039)) ^ 1217707678;
                    i = 1495358163;
                    i7 = iM2566 ^ i;
                    break;
                case -1155977864:
                case -726250226:
                    i8 = s * s;
                    i9 = 399424;
                    if (C1916.f6442) {
                        iM2566 = (C0630.m2566("ۜ᩶") ^ i4) * (-19);
                        i6 = ((iM2566 ^ i5) * (-15667)) ^ 1610284548;
                        i = 105661066;
                    } else {
                        iM2566 = C2105.m6981("᩻ۗ") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-20999)) ^ (-1525952081);
                        i = -733999123;
                    }
                    i7 = iM2566 ^ i;
                    break;
                case -1017742446:
                case -1009995814:
                    if (C3663.m11168() >= 0) {
                        iM2566 = C0630.m2566("ۘܺ") ^ i5;
                        i6 = ((iM2566 ^ i4) * 3885) ^ 1554259831;
                        i = -82471244;
                    } else {
                        iM2566 = C2105.m6981("ۡܿ") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-17517)) ^ (-695612059);
                        i = -46077688;
                    }
                    i7 = iM2566 ^ i;
                    break;
                case -946983746:
                case 115289431:
                    i11 = 1;
                    if (C3746.f11829 <= 0) {
                        iM2566 = C2105.m6981("᩶ܰ") ^ i5;
                        i6 = ((iM2566 ^ i4) * 11755) ^ (-750901131);
                        i = -732861813;
                    } else {
                        iM2566 = C2105.m6981("᩷ۢ") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-7969)) ^ 883270848;
                        i = -1538036520;
                    }
                    i7 = iM2566 ^ i;
                    break;
                case -916713641:
                case -394860415:
                    C2272.m7503();
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        iM2566 = C0630.m2566("ۘܺ") ^ i5;
                        i6 = ((iM2566 ^ i4) * 3885) ^ 1554259831;
                        i = -82471244;
                    } else {
                        iM2566 = C2105.m6981("ۙۗ") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-15217)) ^ 691970846;
                        i = -1758162046;
                    }
                    i7 = iM2566 ^ i;
                    break;
                case -713794288:
                case 1794544380:
                    C1128.m3851();
                    throw new RuntimeException();
                case -264575712:
                case 1303956478:
                    C3019.m9255();
                    if (C3245.f10203 > 0) {
                        iM2566 = C2105.m6981("ۙۗ") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-15217)) ^ 691970846;
                        i = -1758162046;
                    } else {
                        iM2566 = C2105.m6981("᩶ܰ") ^ i5;
                        i6 = ((iM2566 ^ i4) * 11755) ^ (-750901131);
                        i = -732861813;
                    }
                    i7 = iM2566 ^ i;
                    break;
                case -96337816:
                case 1105555206:
                    i3 = 45582;
                    int iM2569 = C0630.m2566("ۡۙ") ^ i4;
                    i10 = i3;
                    iM2566 = iM2569;
                    i6 = ((iM2569 ^ i5) * (-28039)) ^ 1217707678;
                    i = 1495358163;
                    i7 = iM2566 ^ i;
                    break;
                case 116905208:
                case 1634361079:
                    s = sArr[c];
                    if (C3911.f12484 >= 0) {
                        iM2566 = C2105.m6981("᩻ۗ") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-20999)) ^ (-1525952081);
                        i = -733999123;
                    } else {
                        iM2566 = (i5 - C0630.m2566("֫ۙ")) * (-107);
                        i6 = ((iM2566 ^ i4) * (-11655)) ^ 131888573;
                        i = -1122554956;
                    }
                    i7 = iM2566 ^ i;
                    break;
                case 1478204061:
                case 1690028761:
                    if (C0422.m1963()) {
                        iM2566 = C2105.m6981("ᩳۢ") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-30093)) ^ (-74436383);
                        i = 672721961;
                    } else {
                        iM2566 = C0630.m2566("ۘܺ") ^ i5;
                        i6 = ((iM2566 ^ i4) * 3885) ^ 1554259831;
                        i = -82471244;
                    }
                    i7 = iM2566 ^ i;
                    break;
                default:
                    if ((s * s2) - i14 <= 0) {
                        iM2566 = C2105.m6981("ۨۢ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 29165) ^ 1026736125;
                        i = 1673077565;
                    } else {
                        iM2566 = (i5 - C2105.m6981("ܺ۬")) * (-23);
                        i6 = ((iM2566 ^ i4) * (-8151)) ^ (-1151604055);
                        i = -331109040;
                    }
                    i7 = iM2566 ^ i;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m140(String str) {
        AbstractC2021.m6569(C1504.m5171(f68, str));
    }
}
