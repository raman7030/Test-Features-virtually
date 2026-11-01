package p067l;

import android.content.DialogInterface;
import android.content.Intent;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.umeng.analytics.pro.C0719o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.digests.WhirlpoolDigest;

/* JADX INFO: renamed from: l.᩶ۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: D17I */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC21364 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰۛ۠, reason: not valid java name and contains not printable characters */
    private static final short[] f82967 = {2453, 3408, -1490, 7144, -5569, 4151, -5585, 8990, -5036, 3097, 5768, 1736, 9620, 5110, -6894, -7461, 1904, 7041, 7234, 11218, -8016, -4480, -62, 5439, 5748, -5488, 7425, -5078, 1689, 3286, 9375, 2517, -1827, 5067, 1308, -5681, -941, 32380, 32379, 32383, 32368, 32374, 32353, 32330, 32359, 32368, 32330, 32358, 32378, 32352, 32359, 32374, 32368, 32330, 32377, 32380, 32379, 32368, 32380, 32379, 32383, 32368, 32374, 32353, 32330, 32377, 32378, 32370, 32330, 32371, 32378, 32359, 32376, 32372, 32353, 32380, 32379, 32383, 32368, 32374, 32353, 32330, 32377, 32378, 32370, 32330, 32357, 32372, 32353, 32381, 4014, 7823, -2822, 32380, 32379, 32383, 32368, 32374, 32353, 32330, 32371, 32380, 32377, 32353, 32368, 32359, 32330, 5537, -31402, -31407, -31403, -31398, -31396, -31413, -31392, -31405, -31408, -31400, -31392, -31409, -31394, -31413, -31401, 7620, -21801, -21808, -21804, -21797, -21795, -21814, -21791, -21806, -21807, -21799, -21791, -21810, -21793, -21814, -21802, 9787, 3946, -3603, -2787, 11338, 7810, 3170, 6502, 11883, -1285, 2910, -30410, 26329, -31413, -31073, 19270, 31225, 5934, 5929, 5933, 5922, 5924, 5939, 5912, 5931, 5928, 5920, 5912, 5921, 5928, 5941, 5930, 5926, 5939, 5916, 5907, 5902, 5898, 5890, 5914, 5991, 5916, 5892, 5899, 5894, 5908, 5908, 5914, 5965, 5994, 6009, 5916, 5898, 5890, 5907, 5903, 5896, 5891, 5914, 5999, 5916, 5899, 5896, 5892, 5894, 5907, 5902, 5896, 5897, 5914, 5998, 5965, 5916, 5909, 5890, 5908, 5906, 5899, 5907, 5914, 5965, 5994, 5994, 5994, 5994, 5994, 5994, 5994, 5994, 5994, 5994, 5994, 5994, 5994, 5994, 5994, 5994, 5994, 5994, 5994, 5994, 5965, 32409, 18777, 28824, 29074, 17767, 27175, 28949, -27935, 30671, 20032, -31334, 19174, -25312, -29596, 16435, 31791, 31498, 31328, 32435, -31871, 29825, -25093, -25453, 31022, 5542, -12425, -12432, -12428, -12421, -12419, -12438, -12479, -12424, -12425, -12430, -12438, -12421, -12436, -12479, 7150, -5087, -5082, -5086, -5075, -5077, -5060, -5097, -5061, -5077, -5088, -5075, -5083, -5075, -24015, 31596, 30152, 950, 15390, 15371, 15375, 15459, 15381, 15441, 15450, 15437, 15450, 15361, 5748, -7956, 10064, -16153, -10961, 9795, -6031, -14419, 13441, -5019, -15673, -10071, -10442, 4359, 18596, 25716, 18246, -24192, 23305, 21467, 13078, 13073, 13077, 13082, 13084, 13067, 13088, 13075, 13072, 13080, 13088, 13071, 13086, 13067, 13079, 20918, -19816, 19452, -18884, -18642, -21099, 20995, 18539, 26994, 24845, 26541, 16580, 21484, 18854, 28246, -17733, 19103, 17267, 4869, -15976, -15973, -15981, -15993, -15909, -15953, -15964, -15947, -15945, -15937, -15947, -15949, -15951, -15959, -15911, -15953, -15968, -15939, -15943, -15951, -15959, -15910, -15976, -15973, -15981, -15909, -15953, -15961, -15952, -15945, -15947, -15962, -15952, -15959, 6215, 3855, 3848, 3852, 3843, 3845, 3858, 3897, 3861, 3845, 3854, 3843, 3851, 3843, 5180, -31885, 31301, -24516};

    /* JADX INFO: renamed from: ۗ */
    public C6414 f67347;

    /* JADX INFO: renamed from: ۙ */
    public final AbstractC17043 f67348;

    /* JADX INFO: renamed from: ۛ */
    public final Spinner f67349;

    /* JADX INFO: renamed from: ۤ */
    public final ArrayList f67350;

    /* JADX INFO: renamed from: ۨ */
    public final C18107 f67351;

    /* JADX INFO: renamed from: ۫ */
    public final C12096 f67352;

    /* JADX INFO: renamed from: ۬ */
    public final String f67353;

    /* JADX INFO: renamed from: ᩶ */
    public TreeSet f67354;

    /* JADX INFO: renamed from: ᩸ */
    public final Main f67355;

    /* JADX INFO: renamed from: ᩹ */
    public final C21438 f67356;

    /* JADX INFO: renamed from: ֫ */
    public static /* bridge */ /* synthetic */ void m48393(ViewOnClickListenerC21364 viewOnClickListenerC21364, C6414 c6414) {
        viewOnClickListenerC21364.f67347 = c6414;
    }

    /* JADX INFO: renamed from: ܳ */
    public static /* bridge */ /* synthetic */ String m48399(ViewOnClickListenerC21364 viewOnClickListenerC21364) {
        return viewOnClickListenerC21364.f67353;
    }

    /* JADX INFO: renamed from: ܿ */
    public static /* bridge */ /* synthetic */ AbstractC17043 m48402(ViewOnClickListenerC21364 viewOnClickListenerC21364) {
        return viewOnClickListenerC21364.f67348;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static /* bridge */ /* synthetic */ C18107 m48405(ViewOnClickListenerC21364 viewOnClickListenerC21364) {
        return viewOnClickListenerC21364.f67351;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m48388(ViewOnClickListenerC21364 viewOnClickListenerC21364) {
        int i;
        short[] sArr;
        int iM55979;
        int i2;
        int i3;
        int iM55680;
        int i4;
        int i5;
        int iM559710;
        int i6;
        int i7;
        int iM55681;
        int i8;
        int i9 = C0992.f81922;
        int i10 = C0967.f81910;
        int iM559711 = C0946.m55979("ᩴۘ") ^ i10;
        int i11 = ((iM559711 ^ i9) * (-1933)) ^ (-413435339);
        Main main = null;
        C20671 c20671M55654 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i12 = iM559711 ^ 971059026;
        SpannableString spannableStringM48396 = null;
        int iM559712 = 0;
        int i13 = 0;
        int iM55682 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        short s = 0;
        short s2 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = -84494969;
        int iM55683 = 0;
        View viewM56181 = null;
        short[] sArr4 = null;
        int i24 = 0;
        while (true) {
            i23 = i12 ^ (i11 & (((i23 ^ i9) * (-22283)) >> 31));
            switch (i23) {
                case -1860981086:
                case 1307792971:
                    C0892.m55749();
                    C0882.m55710();
                    break;
                case -1768079867:
                case -1190736982:
                    C1194.m56396();
                    if (C1024.m56209() >= 0) {
                        iM55683 = iM55683;
                        iM55681 = C0873.m55680("᩻ۨ") ^ i10;
                        i4 = ((iM55681 ^ i9) * 20175) ^ (-619430791);
                        i8 = -1743298898;
                        int i25 = iM55681 ^ i8;
                        iM55683 = iM55683;
                        i12 = i25;
                        i11 = i4;
                    }
                    iM55680 = (C0946.m55979("᩺᩵") + i9) * (-89);
                    i4 = ((iM55680 ^ i10) * 8649) ^ 487501300;
                    i5 = 2034387945;
                    i12 = iM55680 ^ i5;
                    i11 = i4;
                    break;
                case -1571486263:
                case 1793366597:
                    i21 = i21;
                    i = i22;
                    iM55683 = iM55683;
                    sArr = sArr4;
                    spannableStringM48396 = spannableStringM48396;
                    int i26 = i18 + i19;
                    i20 = i26 + i26;
                    s2 = 16195;
                    if (C1025.f81947 < 0) {
                        iM55979 = C0946.m55979("ۤۨ") ^ i9;
                        i2 = ((iM55979 ^ i10) * 21129) ^ (-1911012171);
                        i3 = -476446554;
                        int i27 = iM55979 ^ i3;
                        iM55683 = iM55683;
                        i12 = i27;
                        i11 = i2;
                        spannableStringM48396 = spannableStringM48396;
                        sArr4 = sArr;
                        i22 = i;
                        i21 = i21;
                    } else {
                        spannableStringM48396 = spannableStringM48396;
                        sArr4 = sArr;
                        i22 = i;
                        i21 = i21;
                        iM55681 = C0873.m55680("᩻ۨ") ^ i10;
                        i4 = ((iM55681 ^ i9) * 20175) ^ (-619430791);
                        i8 = -1743298898;
                        int i28 = iM55681 ^ i8;
                        iM55683 = iM55683;
                        i12 = i28;
                        i11 = i4;
                    }
                    break;
                case -1495636293:
                case -21621059:
                    iM55682 = C0873.m55680(ServiceConnectionC1013.m56161(sArr3, i16, 3, i24));
                    i14 = 2123756965;
                    if (!C1024.f81946) {
                        iM55680 = C0873.m55680("ۧۖ") ^ i9;
                        i4 = ((iM55680 ^ i10) * (-10311)) ^ 1738317691;
                        i5 = -1686324323;
                        i12 = iM55680 ^ i5;
                        i11 = i4;
                    } else {
                        i21 = i21;
                        i = i22;
                        sArr = sArr4;
                        spannableStringM48396 = spannableStringM48396;
                        int iM559713 = C0946.m55979("᩺ᩳ") ^ i10;
                        i2 = ((iM559713 ^ i9) * (-2543)) ^ (-1752896972);
                        i12 = iM559713 ^ 1737007094;
                        i11 = i2;
                        spannableStringM48396 = spannableStringM48396;
                        sArr4 = sArr;
                        i22 = i;
                        i21 = i21;
                    }
                    break;
                case -1339266647:
                case 330345783:
                    if (C0992.f81922 < 0) {
                        iM55680 = (C0946.m55979("᩺᩵") + i9) * (-89);
                        i4 = ((iM55680 ^ i10) * 8649) ^ 487501300;
                        i5 = 2034387945;
                        i12 = iM55680 ^ i5;
                        i11 = i4;
                    } else {
                        i21 = i21;
                        i = i22;
                        sArr = sArr4;
                        spannableStringM48396 = spannableStringM48396;
                        int iM559714 = C0946.m55979("᩺ᩳ") ^ i10;
                        i2 = ((iM559714 ^ i9) * (-2543)) ^ (-1752896972);
                        i12 = iM559714 ^ 1737007094;
                        i11 = i2;
                        spannableStringM48396 = spannableStringM48396;
                        sArr4 = sArr;
                        i22 = i;
                        i21 = i21;
                    }
                    break;
                case -1303978526:
                case -200082921:
                    i21 = i21;
                    i = i22;
                    iM55683 = iM55683;
                    sArr = sArr4;
                    spannableStringM48396 = spannableStringM48396;
                    s = f82967[139];
                    if (C1048.m56305() < 0) {
                        iM55979 = C0946.m55979("ܳۛ") ^ i9;
                        i2 = ((iM55979 ^ i10) * (-9899)) ^ 710042290;
                        i3 = -475618403;
                        int i29 = iM55979 ^ i3;
                        iM55683 = iM55683;
                        i12 = i29;
                        i11 = i2;
                        spannableStringM48396 = spannableStringM48396;
                        sArr4 = sArr;
                        i22 = i;
                        i21 = i21;
                    } else {
                        spannableStringM48396 = spannableStringM48396;
                        sArr4 = sArr;
                        i22 = i;
                        i21 = i21;
                        iM55681 = C0873.m55680("᩻ۨ") ^ i10;
                        i4 = ((iM55681 ^ i9) * 20175) ^ (-619430791);
                        i8 = -1743298898;
                        int i210 = iM55681 ^ i8;
                        iM55683 = iM55683;
                        i12 = i210;
                        i11 = i4;
                    }
                    break;
                case -1083680716:
                case 558499864:
                    sArr = sArr4;
                    i24 = 19145;
                    iM55979 = C0946.m55979("ۗ᩸") ^ i9;
                    i = i22;
                    i2 = ((iM55979 ^ i10) * (-17305)) ^ (-2084055609);
                    i3 = -469191911;
                    int i211 = iM55979 ^ i3;
                    iM55683 = iM55683;
                    i12 = i211;
                    i11 = i2;
                    spannableStringM48396 = spannableStringM48396;
                    sArr4 = sArr;
                    i22 = i;
                    i21 = i21;
                    break;
                case -1030099318:
                case 1994256034:
                    ViewOnClickListenerC0939.m55953(c20671M55654, iM55682 ^ i14, null);
                    RunnableC0871.m55669(c20671M55654);
                    break;
                case -889664820:
                case 1145996202:
                    iM559712 = C0946.m55979(C0866.m55652(sArr2, i17, i15, i24));
                    i13 = 2117157921;
                    if (C1036.f81953 >= 0) {
                        iM55680 = C0873.m55680("ܶܶ") ^ i9;
                        i4 = ((iM55680 ^ i10) * (-22425)) ^ 891292819;
                        i5 = 1420272794;
                    } else {
                        iM55680 = (C0873.m55680("ۜ᩵") + i10) * 37;
                        i4 = ((iM55680 ^ i9) * (-31913)) ^ 936979099;
                        i5 = 2081727609;
                    }
                    i12 = iM55680 ^ i5;
                    i11 = i4;
                    break;
                case -445233337:
                case 238769618:
                    i21 = i21;
                    i = i22;
                    iM55683 = iM55683;
                    sArr = sArr4;
                    spannableStringM48396 = spannableStringM48396;
                    int i30 = s + s2;
                    if (i20 - (i30 * i30) < 0) {
                        iM55979 = C0873.m55680("᩺᩸") ^ i10;
                        i2 = ((iM55979 ^ i9) * 13897) ^ (-1058212410);
                        i3 = 886038366;
                    } else {
                        iM55979 = (C0873.m55680("ܿ۬") ^ i10) * 61;
                        i2 = ((iM55979 ^ i9) * (-7103)) ^ 13194450;
                        i3 = 187285516;
                    }
                    int i212 = iM55979 ^ i3;
                    iM55683 = iM55683;
                    i12 = i212;
                    i11 = i2;
                    spannableStringM48396 = spannableStringM48396;
                    sArr4 = sArr;
                    i22 = i;
                    i21 = i21;
                    break;
                case -428152306:
                case 472978286:
                    short[] sArr5 = sArr4;
                    i21 = i21;
                    spannableStringM48396 = spannableStringM48396;
                    int i31 = i22;
                    iM55683 = C0873.m55680(RunnableC0871.m55667(sArr5, i21, i31, i24)) ^ 2127458183;
                    if (C0927.m55873() <= 0) {
                        sArr = sArr5;
                        i = i31;
                        int iM559715 = C0946.m55979("᩺ᩳ") ^ i10;
                        i2 = ((iM559715 ^ i9) * (-2543)) ^ (-1752896972);
                        i12 = iM559715 ^ 1737007094;
                        i11 = i2;
                        spannableStringM48396 = spannableStringM48396;
                        sArr4 = sArr;
                        i22 = i;
                        i21 = i21;
                    } else {
                        int iM559716 = C0946.m55979("ܰ᩹") ^ i9;
                        i11 = ((iM559716 ^ i10) * (-28067)) ^ (-1473409868);
                        i12 = iM559716 ^ (-570558646);
                        i21 = i21;
                        i22 = i31;
                        spannableStringM48396 = spannableStringM48396;
                        sArr4 = sArr5;
                    }
                    break;
                case -332457829:
                case -226548542:
                    C0845.m55584();
                    C1017.m56187();
                    i7 = iM55683;
                    iM559710 = (i10 - C0946.m55979("۟ۙ")) * (-33);
                    iM55683 = i7;
                    i11 = ((iM559710 ^ i9) * (-31117)) ^ 510301227;
                    i6 = -1305619955;
                    int i32 = iM559710 ^ i6;
                    iM55683 = iM55683;
                    i12 = i32;
                    break;
                case -291027259:
                case 47187103:
                    C0882.m55725(c20671M55654, viewM56181);
                    sArr3 = f82967;
                    i16 = 146;
                    if (C0906.f81862 < 0) {
                        iM55680 = C0946.m55979("۠۫") ^ i10;
                        i4 = ((iM55680 ^ i9) * 14001) ^ (-515334151);
                        i5 = 1964114658;
                        i12 = iM55680 ^ i5;
                        i11 = i4;
                    } else {
                        i7 = iM55683;
                        iM559710 = (i10 - C0946.m55979("۟ۙ")) * (-33);
                        iM55683 = i7;
                        i11 = ((iM559710 ^ i9) * (-31117)) ^ 510301227;
                        i6 = -1305619955;
                        int i33 = iM559710 ^ i6;
                        iM55683 = iM55683;
                        i12 = i33;
                    }
                    break;
                case 49238878:
                case 811370483:
                    i7 = iM55683;
                    viewM56181 = C1017.m56181(main, i7);
                    sArr2 = f82967;
                    i17 = 143;
                    i15 = 3;
                    if (C0863.f81833 > 0) {
                        iM55683 = i7;
                        iM55681 = C0873.m55680("۬ۤ") ^ i9;
                        i4 = ((iM55681 ^ i10) * 22143) ^ (-238227390);
                        i8 = 660184644;
                        int i213 = iM55681 ^ i8;
                        iM55683 = iM55683;
                        i12 = i213;
                        i11 = i4;
                    } else {
                        iM559710 = (i10 - C0946.m55979("۟ۙ")) * (-33);
                        iM55683 = i7;
                        i11 = ((iM559710 ^ i9) * (-31117)) ^ 510301227;
                        i6 = -1305619955;
                        int i34 = iM559710 ^ i6;
                        iM55683 = iM55683;
                        i12 = i34;
                    }
                    break;
                case 61710924:
                case 162124904:
                    iM55683 = iM55683;
                    spannableStringM48396 = m48396();
                    main = viewOnClickListenerC21364.f67355;
                    sArr4 = f82967;
                    i21 = 140;
                    i22 = 3;
                    if (C1012.f81938 < 0) {
                        iM559710 = C0946.m55979("ۙ֨") ^ i10;
                        i11 = ((iM559710 ^ i9) * 27091) ^ (-1739017807);
                        i6 = -1751842091;
                        int i35 = iM559710 ^ i6;
                        iM55683 = iM55683;
                        i12 = i35;
                    } else {
                        iM55681 = C0873.m55680("᩻ۨ") ^ i10;
                        i4 = ((iM55681 ^ i9) * 20175) ^ (-619430791);
                        i8 = -1743298898;
                        int i214 = iM55681 ^ i8;
                        iM55683 = iM55683;
                        i12 = i214;
                        i11 = i4;
                    }
                    break;
                case 235392101:
                case 654366411:
                    i21 = i21;
                    i = i22;
                    iM55683 = iM55683;
                    sArr = sArr4;
                    spannableStringM48396 = spannableStringM48396;
                    i18 = s * s;
                    i19 = 262278025;
                    if (C1025.f81947 < 0) {
                        iM55979 = C0946.m55979("ۨ֨") ^ i10;
                        i2 = ((iM55979 ^ i9) * (-19831)) ^ 725923848;
                        i3 = 703665757;
                        int i215 = iM55979 ^ i3;
                        iM55683 = iM55683;
                        i12 = i215;
                        i11 = i2;
                        spannableStringM48396 = spannableStringM48396;
                        sArr4 = sArr;
                        i22 = i;
                        i21 = i21;
                    } else {
                        iM55683 = iM55683;
                        int iM559717 = C0946.m55979("᩺ᩳ") ^ i10;
                        i2 = ((iM559717 ^ i9) * (-2543)) ^ (-1752896972);
                        i12 = iM559717 ^ 1737007094;
                        i11 = i2;
                        spannableStringM48396 = spannableStringM48396;
                        sArr4 = sArr;
                        i22 = i;
                        i21 = i21;
                    }
                    break;
                case 418565092:
                case 1656496369:
                    if (C1964.f83032 > 0) {
                        i21 = i21;
                        i = i22;
                        sArr = sArr4;
                        spannableStringM48396 = spannableStringM48396;
                        int iM559718 = C0946.m55979("᩺ᩳ") ^ i10;
                        i2 = ((iM559718 ^ i9) * (-2543)) ^ (-1752896972);
                        i12 = iM559718 ^ 1737007094;
                        i11 = i2;
                        spannableStringM48396 = spannableStringM48396;
                        sArr4 = sArr;
                        i22 = i;
                        i21 = i21;
                    } else {
                        i7 = iM55683;
                        iM559710 = (i10 - C0946.m55979("۟ۙ")) * (-33);
                        iM55683 = i7;
                        i11 = ((iM559710 ^ i9) * (-31117)) ^ 510301227;
                        i6 = -1305619955;
                        int i36 = iM559710 ^ i6;
                        iM55683 = iM55683;
                        i12 = i36;
                    }
                    break;
                case 877980804:
                case 1390880440:
                    RunnableC0938.m55928((TextView) C0892.m55755(viewM56181, iM559712 ^ i13), spannableStringM48396);
                    c20671M55654 = C0866.m55654(main);
                    if (C0930.f81879 > 0) {
                        iM55680 = C0873.m55680("ۙᩳ") ^ i9;
                        i4 = ((iM55680 ^ i10) * 2015) ^ (-355852424);
                        i5 = 50733455;
                        i12 = iM55680 ^ i5;
                        i11 = i4;
                    } else {
                        i7 = iM55683;
                        iM559710 = (i10 - C0946.m55979("۟ۙ")) * (-33);
                        iM55683 = i7;
                        i11 = ((iM559710 ^ i9) * (-31117)) ^ 510301227;
                        i6 = -1305619955;
                        int i37 = iM559710 ^ i6;
                        iM55683 = iM55683;
                        i12 = i37;
                    }
                    break;
                default:
                    sArr = sArr4;
                    i24 = 31994;
                    iM55979 = C0946.m55979("ۗ᩸") ^ i9;
                    i = i22;
                    i2 = ((iM55979 ^ i10) * (-17305)) ^ (-2084055609);
                    i3 = -469191911;
                    int i216 = iM55979 ^ i3;
                    iM55683 = iM55683;
                    i12 = i216;
                    i11 = i2;
                    spannableStringM48396 = spannableStringM48396;
                    sArr4 = sArr;
                    i22 = i;
                    i21 = i21;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0204 A[PHI: r7 r8 r14 r18
      0x0204: PHI (r7v4 short) = (r7v3 short), (r7v2 short), (r7v2 short) binds: [B:55:0x0202, B:35:0x0105, B:16:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0204: PHI (r8v4 short) = (r8v3 short), (r8v2 short), (r8v2 short) binds: [B:55:0x0202, B:35:0x0105, B:16:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0204: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:55:0x0202, B:35:0x0105, B:16:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0204: PHI (r18v22 l.۬ۤۡ) = (r18v6 l.۬ۤۡ), (r18v14 l.۬ۤۡ), (r18v25 l.۬ۤۡ) binds: [B:55:0x0202, B:35:0x0105, B:16:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x023b A[PHI: r6 r18 r19
      0x023b: PHI (r6v3 char) = (r6v2 char), (r6v4 char) binds: [B:63:0x025d, B:59:0x0239] A[DONT_GENERATE, DONT_INLINE]
      0x023b: PHI (r18v4 l.۬ۤۡ) = (r18v3 l.۬ۤۡ), (r18v5 l.۬ۤۡ) binds: [B:63:0x025d, B:59:0x0239] A[DONT_GENERATE, DONT_INLINE]
      0x023b: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]) binds: [B:63:0x025d, B:59:0x0239] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0294 A[PHI: r2 r11 r18
      0x0294: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v3 java.lang.String), (r2v2 java.lang.String) binds: [B:68:0x0292, B:32:0x00e1, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0294: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v5 int) binds: [B:68:0x0292, B:32:0x00e1, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0294: PHI (r18v26 l.۬ۤۡ) = (r18v2 l.۬ۤۡ), (r18v16 l.۬ۤۡ), (r18v29 l.۬ۤۡ) binds: [B:68:0x0292, B:32:0x00e1, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m48390(ViewOnClickListenerC21364 viewOnClickListenerC21364, String str) {
        int iM55680;
        int i;
        int i2;
        int i3 = ViewOnClickListenerC0939.f81888;
        int i4 = C0930.f81879;
        int iM55979 = (i4 - C0946.m55979("ۨ᩹")) * 89;
        int i5 = ((iM55979 ^ i3) * 4565) ^ (-1671984929);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM55979 ^ 1036486169;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 767316075;
        InterfaceC9768 interfaceC9768M55745 = null;
        String strM48631 = null;
        String strM56584 = null;
        InterfaceC14770 interfaceC14770M55950 = null;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i3) * 32439) >> 31));
            switch (i12) {
                case -2052140437:
                case 535281715:
                    strM48631 = C21466.m48631(strM56584, str);
                    interfaceC9768M55745 = C0892.m55745(viewOnClickListenerC21364.f67352);
                    if (C0861.f81831) {
                        int iM55681 = C0873.m55680("֡ܳ") ^ i3;
                        i5 = ((iM55681 ^ i4) * 11683) ^ (-1157082007);
                        i6 = iM55681 ^ (-1320413878);
                    } else {
                        interfaceC14770M55950 = interfaceC14770M55950;
                        iM55680 = (C0873.m55680("᩸ۚ") + i3) * 7;
                        i = ((iM55680 ^ i4) * (-27063)) ^ (-558073038);
                        i2 = -463890296;
                        InterfaceC14770 interfaceC14770 = interfaceC14770M55950;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                        interfaceC14770M55950 = interfaceC14770;
                    }
                    break;
                case -1919767391:
                case -29983855:
                    interfaceC14770M55950 = interfaceC14770M55950;
                    if ((i8 + i9) - i7 < 0) {
                        iM55680 = (i4 - C0946.m55979("᩸ᩴ")) * (-39);
                        i = ((iM55680 ^ i3) * 2929) ^ (-871465638);
                        i2 = -999939248;
                    } else {
                        iM55680 = C0873.m55680("ۡᩳ") ^ i3;
                        i = ((iM55680 ^ i4) * (-8221)) ^ (-897579496);
                        i2 = -1597196166;
                    }
                    InterfaceC14770 interfaceC14771 = interfaceC14770M55950;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    interfaceC14770M55950 = interfaceC14771;
                    break;
                case -1844411833:
                case 17708167:
                    interfaceC14770M55950 = interfaceC14770M55950;
                    c = 265;
                    if (C0863.f81833 <= 0) {
                        interfaceC14770M55950 = interfaceC14770M55950;
                        iM55680 = C0873.m55680("ۘ᩸") ^ i4;
                        interfaceC14770M55950 = interfaceC14770M55950;
                        i = ((iM55680 ^ i3) * (-30503)) ^ (-738240976);
                        i2 = 619731710;
                    } else {
                        iM55680 = (C0946.m55979("᩶ۖ") ^ i4) * 83;
                        i = ((iM55680 ^ i3) * (-10569)) ^ (-635388614);
                        i2 = 201801559;
                    }
                    InterfaceC14770 interfaceC14772 = interfaceC14770M55950;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    interfaceC14770M55950 = interfaceC14772;
                    break;
                case -1839529376:
                case 501667785:
                    interfaceC14770M55950 = interfaceC14770M55950;
                    i7 = s * s2;
                    i8 = s * s;
                    if (C0890.f81849 != 0) {
                        iM55680 = (C0873.m55680("᩸ۚ") + i3) * 7;
                        i = ((iM55680 ^ i4) * (-27063)) ^ (-558073038);
                        i2 = -463890296;
                    } else {
                        iM55680 = (C0873.m55680("ۗۢ") + i3) * (-41);
                        i = ((iM55680 ^ i4) * 18581) ^ 1183524919;
                        i2 = -831086990;
                    }
                    InterfaceC14770 interfaceC14773 = interfaceC14770M55950;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    interfaceC14770M55950 = interfaceC14773;
                    break;
                case -1566836307:
                case 1303294424:
                    interfaceC14770M55950 = interfaceC14770M55950;
                    i11 = 266;
                    if (C0863.f81833 <= 0) {
                        iM55680 = (i4 - C0946.m55979("᩵᩵")) * 13;
                        i = ((iM55680 ^ i3) * (-16177)) ^ 746764577;
                        i2 = -37995938;
                    } else {
                        iM55680 = (C0873.m55680("ۨܽ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM55680 ^ i4) * 20073) ^ (-298444391);
                        i2 = 849491398;
                    }
                    InterfaceC14770 interfaceC14774 = interfaceC14770M55950;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    interfaceC14770M55950 = interfaceC14774;
                    break;
                case -1563508480:
                case 1086168518:
                    if (C1025.f81947 >= 0) {
                        interfaceC14770M55950 = interfaceC14770M55950;
                        iM55680 = (C0873.m55680("᩸ۚ") + i3) * 7;
                        i = ((iM55680 ^ i4) * (-27063)) ^ (-558073038);
                        i2 = -463890296;
                        InterfaceC14770 interfaceC14775 = interfaceC14770M55950;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                        interfaceC14770M55950 = interfaceC14775;
                    } else {
                        int iM559710 = C0946.m55979("۬ܿ") ^ i4;
                        i6 = iM559710 ^ 260617611;
                        i5 = ((iM559710 ^ i3) * 9387) ^ (-1376298873);
                    }
                    break;
                case -1543358935:
                case 38070788:
                    interfaceC14770M55950 = interfaceC14770M55950;
                    if (C1194.f82045 != 0) {
                        iM55680 = C0873.m55680("ۖۚ") ^ i3;
                        i = ((iM55680 ^ i4) * 15981) ^ 280613325;
                        i2 = -1780911050;
                    } else {
                        iM55680 = C0873.m55680("᩶ۙ") ^ i3;
                        i = ((iM55680 ^ i4) * 29665) ^ 1517386541;
                        i2 = -1244480231;
                    }
                    InterfaceC14770 interfaceC14776 = interfaceC14770M55950;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    interfaceC14770M55950 = interfaceC14776;
                    break;
                case -1454799449:
                case -516734604:
                    C0877.m55696();
                    int iM559711 = C0946.m55979("۬ܿ") ^ i4;
                    i6 = iM559711 ^ 260617611;
                    i5 = ((iM559711 ^ i3) * 9387) ^ (-1376298873);
                    break;
                case -1444779251:
                case 895032786:
                    interfaceC14770M55950 = ViewOnClickListenerC0939.m55950(ApplicationC21448.f67649);
                    sArr2 = f82967;
                    if (C0845.f81821 >= 0) {
                        iM55680 = C0873.m55680("ۘ᩸") ^ i4;
                        interfaceC14770M55950 = interfaceC14770M55950;
                        i = ((iM55680 ^ i3) * (-30503)) ^ (-738240976);
                        i2 = 619731710;
                    } else {
                        iM55680 = (C0946.m55979("ۗۨ") + i3) * (-59);
                        interfaceC14770M55950 = interfaceC14770M55950;
                        i = ((iM55680 ^ i4) * 13973) ^ 1599602787;
                        i2 = -700973040;
                    }
                    InterfaceC14770 interfaceC14777 = interfaceC14770M55950;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    interfaceC14770M55950 = interfaceC14777;
                    break;
                case -1371615953:
                case 557124014:
                    C0854.m55595();
                    break;
                case -1336207446:
                case 720742425:
                    strM56584 = C1964.m56584(sArr2, i11, 14, i10);
                    if (C1929.f83011 != 0) {
                        interfaceC14770M55950 = interfaceC14770M55950;
                        iM55680 = C0873.m55680("ۖۚ") ^ i3;
                        i = ((iM55680 ^ i4) * 15981) ^ 280613325;
                        i2 = -1780911050;
                    } else {
                        iM55680 = C0946.m55979("۟᩵") ^ i4;
                        interfaceC14770M55950 = interfaceC14770M55950;
                        i = ((iM55680 ^ i3) * (-14891)) ^ 193482523;
                        i2 = 828001971;
                    }
                    InterfaceC14770 interfaceC14778 = interfaceC14770M55950;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    interfaceC14770M55950 = interfaceC14778;
                    break;
                case -1295875937:
                case -445709105:
                    C1194.m56383(C1025.m56231(interfaceC14770M55950, strM48631, C0845.m55591(interfaceC9768M55745)));
                    break;
                case -1040577851:
                case 1368764457:
                    RunnableC0897.m55784();
                    if (C1036.m56257() <= 0) {
                        iM55680 = C0873.m55680("ۘ᩸") ^ i4;
                        interfaceC14770M55950 = interfaceC14770M55950;
                        i = ((iM55680 ^ i3) * (-30503)) ^ (-738240976);
                        i2 = 619731710;
                        InterfaceC14770 interfaceC14779 = interfaceC14770M55950;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                        interfaceC14770M55950 = interfaceC14779;
                    } else {
                        int iM559712 = C0946.m55979("۬ܿ") ^ i4;
                        i6 = iM559712 ^ 260617611;
                        i5 = ((iM559712 ^ i3) * 9387) ^ (-1376298873);
                    }
                    break;
                case -981398836:
                case 732974133:
                    interfaceC14770M55950 = interfaceC14770M55950;
                    s = sArr[c];
                    s2 = 27948;
                    if (C1003.f81929 <= 0) {
                        iM55680 = (i4 - C0946.m55979("᩵᩵")) * 13;
                        i = ((iM55680 ^ i3) * (-16177)) ^ 746764577;
                        i2 = -37995938;
                    } else {
                        iM55680 = C0946.m55979("ܺ᩷") ^ i3;
                        i = ((iM55680 ^ i4) * 24841) ^ (-905204683);
                        i2 = -965190614;
                    }
                    InterfaceC14770 interfaceC147710 = interfaceC14770M55950;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    interfaceC14770M55950 = interfaceC147710;
                    break;
                case -504225267:
                case 98554754:
                    interfaceC14770M55950 = interfaceC14770M55950;
                    sArr = f82967;
                    if (C0937.f81884) {
                        iM55680 = C0873.m55680("֫ۚ") ^ i4;
                        i = ((iM55680 ^ i3) * 24201) ^ 1581051518;
                        i2 = -1129491138;
                    } else {
                        interfaceC14770M55950 = interfaceC14770M55950;
                        iM55680 = C0873.m55680("ۘ᩸") ^ i4;
                        interfaceC14770M55950 = interfaceC14770M55950;
                        i = ((iM55680 ^ i3) * (-30503)) ^ (-738240976);
                        i2 = 619731710;
                    }
                    InterfaceC14770 interfaceC147711 = interfaceC14770M55950;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    interfaceC14770M55950 = interfaceC147711;
                    break;
                case -185601025:
                case 1755915550:
                    i10 = 53022;
                    iM55680 = C0946.m55979("ۖ᩷") ^ i4;
                    i = ((iM55680 ^ i3) * (-32285)) ^ (-567855041);
                    i2 = -2023758694;
                    InterfaceC14770 interfaceC147712 = interfaceC14770M55950;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    interfaceC14770M55950 = interfaceC147712;
                    break;
                case 172873128:
                case 303025825:
                    C1053.m56327();
                    if (!C0882.f81846) {
                        interfaceC14770M55950 = interfaceC14770M55950;
                        iM55680 = (i4 - C0946.m55979("᩵᩵")) * 13;
                        i = ((iM55680 ^ i3) * (-16177)) ^ 746764577;
                        i2 = -37995938;
                        InterfaceC14770 interfaceC147713 = interfaceC14770M55950;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                        interfaceC14770M55950 = interfaceC147713;
                    }
                    interfaceC14770M55950 = interfaceC14770M55950;
                    iM55680 = (C0873.m55680("᩸ۚ") + i3) * 7;
                    i = ((iM55680 ^ i4) * (-27063)) ^ (-558073038);
                    i2 = -463890296;
                    InterfaceC14770 interfaceC147714 = interfaceC14770M55950;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    interfaceC14770M55950 = interfaceC147714;
                    break;
                case 633419962:
                case 974678637:
                    i10 = 25997;
                    iM55680 = C0946.m55979("ۖ᩷") ^ i4;
                    i = ((iM55680 ^ i3) * (-32285)) ^ (-567855041);
                    i2 = -2023758694;
                    InterfaceC14770 interfaceC147715 = interfaceC14770M55950;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    interfaceC14770M55950 = interfaceC147715;
                    break;
                default:
                    interfaceC14770M55950 = interfaceC14770M55950;
                    i9 = 195272676;
                    if (C1404.f82149 >= 0) {
                        iM55680 = C0873.m55680("ۖۚ") ^ i3;
                        i = ((iM55680 ^ i4) * 15981) ^ 280613325;
                        i2 = -1780911050;
                    } else {
                        iM55680 = C0946.m55979("֨֫") ^ i4;
                        i = ((iM55680 ^ i3) * 19251) ^ (-1422025834);
                        i2 = -1557170092;
                    }
                    InterfaceC14770 interfaceC147716 = interfaceC14770M55950;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    interfaceC14770M55950 = interfaceC147716;
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 32921. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public ViewOnClickListenerC21364(p067l.AbstractC17043 r65, p067l.C18107 r66, java.lang.String r67) {
        /*
            Method dump skipped, instruction units count: 3292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.ViewOnClickListenerC21364.<init>(l.ܶ᩵ܿ, l.ܽۢܳ, java.lang.String):void");
    }

    /* JADX INFO: renamed from: ۧ */
    public static SpannableString m48396() {
        int iM55979;
        int i;
        int i2;
        String str;
        int i3;
        String str2;
        short[] sArr;
        short[] sArr2;
        short[] sArr3;
        int i4;
        short[] sArr4;
        int i5;
        String str3;
        int iM55680;
        int i6;
        int i7;
        int iM559710;
        int i8;
        int i9;
        int i10;
        int iM55681;
        int i11;
        int i12;
        int i13;
        String strM56156;
        int iM559711;
        int i14;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1179059902;
        int i18 = AbstractC0942.f81890;
        int i19 = C1071.f81975;
        int iM559712 = C0946.m55979("᩸ܽ") ^ i18;
        int i20 = ((iM559712 ^ i19) * 30277) ^ (-2107390778);
        int i21 = iM559712 ^ 967479969;
        String[] strArr = null;
        String str4 = null;
        ForegroundColorSpan foregroundColorSpan = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        int i22 = 0;
        int i23 = 0;
        int iM56300 = 0;
        int i24 = 0;
        int i25 = 0;
        int iM55878 = 0;
        int i26 = 0;
        int iM55879 = 0;
        int i27 = 0;
        int iM559713 = 0;
        int i28 = 0;
        int iM559714 = 0;
        int iM55682 = 0;
        int i29 = 0;
        String strM56157 = null;
        short s = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        String strM56275 = null;
        String str5 = null;
        while (true) {
            SpannableString spannableString = null;
            while (true) {
                i17 = i21 ^ (i20 & (((i17 ^ i19) * 8973) >> 31));
                switch (i17) {
                    case -1820480778:
                    case 1632314578:
                        C0854.m55595();
                        C0877.m55696();
                        return null;
                    case -1816147486:
                    case -202386231:
                        foregroundColorSpan = new ForegroundColorSpan(C23223.f72980);
                        i25 = iM56300 + i24;
                        iM55878 = C0927.m55878(str4) + i24;
                        if (!C0882.f81846) {
                            iM55979 = (C0946.m55979("᩵ۖ") ^ i18) * 53;
                            i = ((iM55979 ^ i19) * 24381) ^ 687995832;
                            i2 = 853272892;
                            i21 = iM55979 ^ i2;
                            i20 = i;
                        } else {
                            spannableString = spannableString;
                            strM56156 = str5;
                            i3 = i29;
                            sArr = sArr7;
                            iM559711 = C0946.m55979("᩺֡") ^ i18;
                            str2 = strM56156;
                            i20 = ((iM559711 ^ i19) * (-19159)) ^ 774226756;
                            i14 = -805675816;
                            i21 = iM559711 ^ i14;
                            sArr7 = sArr;
                            str5 = str2;
                            i29 = i3;
                            spannableString = spannableString;
                        }
                        break;
                    case -1722554052:
                    case 989443772:
                        C1025.m56230();
                        if (C0992.m56107() > 0) {
                            spannableString = spannableString;
                            i3 = i29;
                            sArr2 = sArr7;
                            sArr3 = sArr5;
                            i4 = i30;
                            sArr4 = sArr6;
                            i5 = i31;
                            str3 = str5;
                            iM55680 = (i19 - C0873.m55680("ۜ᩵")) * (-53);
                            i6 = ((iM55680 ^ i18) * 26551) ^ (-217489579);
                            i7 = -797945437;
                            i13 = iM55680 ^ i7;
                            str5 = str3;
                            i31 = i5;
                            sArr7 = sArr2;
                            sArr6 = sArr4;
                            sArr5 = sArr3;
                            i30 = i4;
                            i21 = i13;
                            i20 = i6;
                            i29 = i3;
                            spannableString = spannableString;
                        } else {
                            iM55979 = (i19 - C0873.m55680("۫ܺ")) * (-55);
                            i = ((iM55979 ^ i18) * 25335) ^ 1602298482;
                            i2 = -862330485;
                            i21 = iM55979 ^ i2;
                            i20 = i;
                        }
                        break;
                    case -1681199428:
                    case 1621016463:
                        C0937.m55918();
                        iM55979 = (i19 - C0873.m55680("۫ܺ")) * (-55);
                        i = ((iM55979 ^ i18) * 25335) ^ 1602298482;
                        i2 = -862330485;
                        i21 = iM55979 ^ i2;
                        i20 = i;
                        break;
                    case -1651145802:
                    case 249742811:
                        C0937.m55918();
                        if (C0890.f81849 != 0) {
                            spannableString = spannableString;
                            i3 = i29;
                            sArr2 = sArr7;
                            sArr4 = sArr6;
                            i5 = i31;
                            str3 = str5;
                            iM55681 = (C0873.m55680("ۛܰ") + i18) * 47;
                            i11 = ((iM55681 ^ i19) * (-21025)) ^ 1713675339;
                            i12 = 1924284916;
                            i21 = iM55681 ^ i12;
                            i20 = i11;
                            str5 = str3;
                            i31 = i5;
                            sArr7 = sArr2;
                            sArr6 = sArr4;
                            i29 = i3;
                            spannableString = spannableString;
                        } else {
                            iM55979 = (i19 - C0873.m55680("۫ܺ")) * (-55);
                            i = ((iM55979 ^ i18) * 25335) ^ 1602298482;
                            i2 = -862330485;
                            i21 = iM55979 ^ i2;
                            i20 = i;
                        }
                        break;
                    case -1200922414:
                    case -261658142:
                        spannableString = spannableString;
                        i3 = i29;
                        short[] sArr8 = sArr6;
                        int i33 = i31;
                        str3 = str5;
                        int i34 = i32;
                        strM56275 = C1044.m56275(C0946.m55979(C1046.m56293(sArr8, i33, i34, i3)) ^ 2130575762);
                        sArr7 = f82967;
                        if (!C0892.f81851) {
                            sArr4 = sArr8;
                            i32 = i34;
                            sArr2 = sArr7;
                            sArr3 = sArr5;
                            i4 = i30;
                            i5 = i33;
                            iM55680 = (i19 - C0873.m55680("ۜ᩵")) * (-53);
                            i6 = ((iM55680 ^ i18) * 26551) ^ (-217489579);
                            i7 = -797945437;
                            i13 = iM55680 ^ i7;
                            str5 = str3;
                            i31 = i5;
                            sArr7 = sArr2;
                            sArr6 = sArr4;
                            sArr5 = sArr3;
                            i30 = i4;
                            i21 = i13;
                            i20 = i6;
                            i29 = i3;
                            spannableString = spannableString;
                        } else {
                            int iM559715 = (i18 - C0946.m55979("ۡۛ")) * (-117);
                            sArr4 = sArr8;
                            i20 = ((iM559715 ^ i19) * 9163) ^ (-621880489);
                            i21 = iM559715 ^ 1114963188;
                            i31 = i33;
                            i32 = i34;
                            str5 = str3;
                            sArr6 = sArr4;
                            i29 = i3;
                            spannableString = spannableString;
                        }
                        break;
                    case -1126470548:
                    case -1007044650:
                        i26 = 17;
                        spannableString.setSpan(foregroundColorSpan, i25, iM55878, 17);
                        if (C0845.f81821 < 0) {
                            spannableString.setSpan(new RelativeSizeSpan(0.85f), i25, C0882.m55719(str4) + i24, 17);
                            iM55879 = C0927.m55878(str4);
                            iM55979 = C0873.m55680("ۤ᩵") ^ i19;
                            i = ((iM55979 ^ i18) * (-16101)) ^ 2027703657;
                            i2 = 2111306777;
                            i21 = iM55979 ^ i2;
                            i20 = i;
                        } else {
                            spannableString = spannableString;
                            i3 = i29;
                            sArr2 = sArr7;
                            sArr3 = sArr5;
                            i4 = i30;
                            sArr4 = sArr6;
                            i5 = i31;
                            str3 = str5;
                            iM55680 = (i19 - C0873.m55680("ۜ᩵")) * (-53);
                            i6 = ((iM55680 ^ i18) * 26551) ^ (-217489579);
                            i7 = -797945437;
                            i13 = iM55680 ^ i7;
                            str5 = str3;
                            i31 = i5;
                            sArr7 = sArr2;
                            sArr6 = sArr4;
                            sArr5 = sArr3;
                            i30 = i4;
                            i21 = i13;
                            i20 = i6;
                            i29 = i3;
                            spannableString = spannableString;
                        }
                        break;
                    case -1102457604:
                    case 1616667049:
                        spannableString = spannableString;
                        i3 = i29;
                        short[] sArr9 = sArr7;
                        short[] sArr10 = sArr5;
                        int i35 = i30;
                        short[] sArr11 = sArr6;
                        int i36 = i31;
                        str2 = str5;
                        short s2 = s;
                        if ((i15 + i16) - (s2 * 27410) < 0) {
                            iM559710 = C0946.m55979("ۨ᩵") ^ i19;
                            i8 = ((iM559710 ^ i18) * (-10023)) ^ 1477888865;
                            i9 = 865842207;
                        } else {
                            iM559710 = (C0946.m55979("۫ۧ") + i19) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i8 = ((iM559710 ^ i18) * 2381) ^ (-1720668526);
                            i9 = -1476768093;
                        }
                        s = s2;
                        i31 = i36;
                        sArr7 = sArr9;
                        sArr6 = sArr11;
                        sArr5 = sArr10;
                        i30 = i35;
                        i21 = iM559710 ^ i9;
                        i20 = i8;
                        str5 = str2;
                        i29 = i3;
                        spannableString = spannableString;
                        break;
                    case -949792363:
                    case 627208359:
                        str4 = strArr[i23];
                        iM56300 = C1046.m56300(str4, 10) + 1;
                        if (iM56300 == 0) {
                            i27 = i24;
                            iM55979 = (i18 - C0873.m55680("ܿ᩷")) * (-45);
                            i = ((iM55979 ^ i19) * (-24415)) ^ (-83718054);
                            i2 = 1017477390;
                        } else {
                            iM55979 = C0946.m55979("ۛ۟") ^ i18;
                            i = ((iM55979 ^ i19) * 24217) ^ 191233636;
                            i2 = -988439291;
                        }
                        i21 = iM55979 ^ i2;
                        i20 = i;
                        break;
                    case -503596103:
                    case 725365710:
                        C0882.m55710();
                        if (C0949.f81897 < 0) {
                            i3 = i29;
                            str2 = str5;
                            sArr = sArr7;
                        }
                        iM55979 = (i19 - C0873.m55680("۫ܺ")) * (-55);
                        i = ((iM55979 ^ i18) * 25335) ^ 1602298482;
                        i2 = -862330485;
                        i21 = iM55979 ^ i2;
                        i20 = i;
                        break;
                    case -409985768:
                    case -78584882:
                        spannableString = spannableString;
                        i3 = i29;
                        sArr4 = sArr6;
                        str3 = str5;
                        short[] sArr12 = sArr7;
                        i5 = i31;
                        sArr2 = sArr12;
                        short[] sArr13 = sArr5;
                        int i37 = i30;
                        iM55682 = C0873.m55680(C0873.m55689(sArr13, i37, 3, i3)) ^ 2126411791;
                        if (C0894.f81854 >= 0) {
                            sArr3 = sArr13;
                            i4 = i37;
                            iM55680 = (i19 - C0873.m55680("ۜ᩵")) * (-53);
                            i6 = ((iM55680 ^ i18) * 26551) ^ (-217489579);
                            i7 = -797945437;
                            i13 = iM55680 ^ i7;
                            str5 = str3;
                            i31 = i5;
                            sArr7 = sArr2;
                            sArr6 = sArr4;
                            sArr5 = sArr3;
                            i30 = i4;
                        } else {
                            int iM559716 = (C0946.m55979("۠֨") ^ i19) * (-71);
                            i6 = ((iM559716 ^ i18) * (-9733)) ^ 1138169590;
                            i13 = iM559716 ^ (-1360924018);
                            i30 = i37;
                            str5 = str3;
                            i31 = i5;
                            sArr7 = sArr2;
                            sArr6 = sArr4;
                            sArr5 = sArr13;
                        }
                        i21 = i13;
                        i20 = i6;
                        i29 = i3;
                        spannableString = spannableString;
                        break;
                    case -389109857:
                    case 939497342:
                        i10 = 47558;
                        int iM559717 = C0946.m55979("ᩴ۟") ^ i18;
                        str5 = str5;
                        i31 = i31;
                        sArr7 = sArr7;
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        i30 = i30;
                        i29 = i10;
                        i21 = iM559717 ^ 322306327;
                        i20 = ((iM559717 ^ i19) * 29449) ^ 1844433650;
                        spannableString = spannableString;
                        break;
                    case -322956474:
                    case 1240511289:
                        spannableString = spannableString;
                        i3 = i29;
                        sArr = sArr7;
                        strM56156 = ServiceConnectionC1013.m56156(iM55682);
                        sArr6 = f82967;
                        i31 = 315;
                        i32 = 3;
                        if (C0877.m55696()) {
                            iM559711 = (C0946.m55979("ۙ᩵") ^ i18) * (-99);
                            str2 = strM56156;
                            i20 = ((iM559711 ^ i19) * (-5077)) ^ 1469094801;
                            i14 = -1938092735;
                        } else {
                            iM559711 = C0946.m55979("᩺֡") ^ i18;
                            str2 = strM56156;
                            i20 = ((iM559711 ^ i19) * (-19159)) ^ 774226756;
                            i14 = -805675816;
                        }
                        i21 = iM559711 ^ i14;
                        sArr7 = sArr;
                        str5 = str2;
                        i29 = i3;
                        spannableString = spannableString;
                        break;
                    case -289989977:
                    case 1082720574:
                        return spannableString;
                    case -124415937:
                    case 1191497460:
                        i23++;
                        i24 = i27;
                        str = strM56157;
                        iM55979 = (i19 - C0873.m55680("ܿ᩹")) * 77;
                        strM56157 = str;
                        i = ((iM55979 ^ i18) * (-17239)) ^ 763265651;
                        i2 = -1946144636;
                        i21 = iM55979 ^ i2;
                        i20 = i;
                        break;
                    case 354458194:
                    case 1889511085:
                        i10 = 26218;
                        int iM559718 = C0946.m55979("ᩴ۟") ^ i18;
                        str5 = str5;
                        i31 = i31;
                        sArr7 = sArr7;
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        i30 = i30;
                        i29 = i10;
                        i21 = iM559718 ^ 322306327;
                        i20 = ((iM559718 ^ i19) * 29449) ^ 1844433650;
                        spannableString = spannableString;
                        break;
                    case 527574629:
                    case 1168094335:
                        spannableString = spannableString;
                        i3 = i29;
                        sArr2 = sArr7;
                        sArr3 = sArr5;
                        sArr4 = sArr6;
                        i5 = i31;
                        str3 = str5;
                        i4 = i30;
                        iM559713 = C0946.m55979(C0930.m55893(f82967, 309, 3, i3));
                        i28 = 2121294470;
                        if (!RunnableC0897.f81856) {
                            sArr5 = sArr3;
                            i30 = i4;
                            iM55681 = (C0873.m55680("ۛܰ") + i18) * 47;
                            i11 = ((iM55681 ^ i19) * (-21025)) ^ 1713675339;
                            i12 = 1924284916;
                            i21 = iM55681 ^ i12;
                            i20 = i11;
                            str5 = str3;
                            i31 = i5;
                            sArr7 = sArr2;
                            sArr6 = sArr4;
                            i29 = i3;
                            spannableString = spannableString;
                        } else {
                            iM55680 = C0873.m55680("֨᩹") ^ i19;
                            i6 = ((iM55680 ^ i18) * 1035) ^ 220579571;
                            i7 = 1291773162;
                            i13 = iM55680 ^ i7;
                            str5 = str3;
                            i31 = i5;
                            sArr7 = sArr2;
                            sArr6 = sArr4;
                            sArr5 = sArr3;
                            i30 = i4;
                            i21 = i13;
                            i20 = i6;
                            i29 = i3;
                            spannableString = spannableString;
                        }
                        break;
                    case 581871852:
                    case 708200554:
                        if (i23 < 4) {
                            iM55979 = C0873.m55680("ۖ᩶") ^ i19;
                            i = ((iM55979 ^ i18) * (-127)) ^ (-2060252015);
                            i2 = -505913035;
                        } else {
                            iM55979 = (C0946.m55979("᩷ۧ") + i18) * (-41);
                            i = ((iM55979 ^ i19) * 17979) ^ 1717628910;
                            i2 = -258105710;
                        }
                        i21 = iM55979 ^ i2;
                        i20 = i;
                        break;
                    case 637926903:
                    case 1335639553:
                        spannableString = spannableString;
                        i3 = i29;
                        str2 = str5;
                        sArr = sArr7;
                        iM559714 = C0946.m55979(C0845.m55592(sArr, 318, 3, i3));
                        if (C1046.f81962 > 0) {
                            int iM559719 = C0946.m55979("᩺᩶") ^ i19;
                            i21 = iM559719 ^ (-1336211062);
                            i20 = ((iM559719 ^ i18) * 1885) ^ (-886122487);
                            sArr7 = sArr;
                            str5 = str2;
                            i29 = i3;
                            spannableString = spannableString;
                        }
                        break;
                    case 1486375431:
                    case 1533858504:
                        i22 = iM55879 + 3 + i24;
                        if (i22 < spannableString.length()) {
                            iM55979 = (i19 - C0946.m55979("ۢ۠")) * (-83);
                            i = ((iM55979 ^ i18) * (-15719)) ^ (-1477046620);
                            i2 = 23720069;
                        } else {
                            i27 = i22;
                            iM55979 = (i18 - C0873.m55680("ܿ᩷")) * (-45);
                            i = ((iM55979 ^ i19) * (-24415)) ^ (-83718054);
                            i2 = 1017477390;
                        }
                        i21 = iM55979 ^ i2;
                        i20 = i;
                        break;
                    case 1601214527:
                    case 1862477543:
                        spannableString = spannableString;
                        i3 = i29;
                        sArr2 = sArr7;
                        sArr3 = sArr5;
                        i4 = i30;
                        sArr4 = sArr6;
                        i5 = i31;
                        str3 = str5;
                        s = f82967[308];
                        i15 = s * s;
                        i16 = 187827025;
                        if (C1036.f81953 >= 0) {
                            iM55680 = (i19 - C0873.m55680("ۜ᩵")) * (-53);
                            i6 = ((iM55680 ^ i18) * 26551) ^ (-217489579);
                            i7 = -797945437;
                        } else {
                            iM55680 = (C0873.m55680("ܶۧ") + i18) * (-59);
                            i6 = ((iM55680 ^ i19) * (-15049)) ^ 404595593;
                            i7 = -1204681672;
                        }
                        i13 = iM55680 ^ i7;
                        str5 = str3;
                        i31 = i5;
                        sArr7 = sArr2;
                        sArr6 = sArr4;
                        sArr5 = sArr3;
                        i30 = i4;
                        i21 = i13;
                        i20 = i6;
                        i29 = i3;
                        spannableString = spannableString;
                        break;
                    case 1782969339:
                    case 1883497294:
                        spannableString = spannableString;
                        i3 = i29;
                        sArr2 = sArr7;
                        sArr4 = sArr6;
                        i5 = i31;
                        str3 = str5;
                        strM56157 = ServiceConnectionC1013.m56156(iM559713 ^ i28);
                        sArr5 = f82967;
                        i30 = 312;
                        if (C1012.f81938 >= 0) {
                            iM55681 = (C0873.m55680("ۛܰ") + i18) * 47;
                            i11 = ((iM55681 ^ i19) * (-21025)) ^ 1713675339;
                            i12 = 1924284916;
                        } else {
                            iM55681 = C0873.m55680("ۙ᩻") ^ i18;
                            i11 = ((iM55681 ^ i19) * 26151) ^ 968977521;
                            i12 = -1321567143;
                        }
                        i21 = iM55681 ^ i12;
                        i20 = i11;
                        str5 = str3;
                        i31 = i5;
                        sArr7 = sArr2;
                        sArr6 = sArr4;
                        i29 = i3;
                        spannableString = spannableString;
                        break;
                    case 1882709855:
                    case 1973393098:
                        spannableString.setSpan(new AbsoluteSizeSpan(C13076.m29941(6.0f)), i22 - 3, i22, i26);
                        i27 = i22;
                        iM55979 = (i18 - C0873.m55680("ܿ᩷")) * (-45);
                        i = ((iM55979 ^ i19) * (-24415)) ^ (-83718054);
                        i2 = 1017477390;
                        i21 = iM55979 ^ i2;
                        i20 = i;
                        break;
                    default:
                        str = strM56157;
                        String[] strArr2 = {str, str5, strM56275, ServiceConnectionC1013.m56156(iM559714 ^ 2127297364)};
                        if (C0930.f81879 > 0) {
                            spannableString = new SpannableString(C11567.m26627(strArr2));
                            strArr = strArr2;
                            i23 = 0;
                            i24 = 0;
                            iM55979 = (i19 - C0873.m55680("ܿ᩹")) * 77;
                            strM56157 = str;
                            i = ((iM55979 ^ i18) * (-17239)) ^ 763265651;
                            i2 = -1946144636;
                            i21 = iM55979 ^ i2;
                            i20 = i;
                        } else {
                            strArr = strArr2;
                            strM56157 = str;
                            i3 = i29;
                            str2 = str5;
                            sArr = sArr7;
                        }
                        break;
                }
            }
            int iM55683 = (C0873.m55680("ۘ᩷") + i18) * (-99);
            i21 = iM55683 ^ (-432293012);
            i20 = ((iM55683 ^ i19) * (-11449)) ^ 1691842907;
            sArr7 = sArr;
            str5 = str2;
            i29 = i3;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m48397(ViewOnClickListenerC21364 viewOnClickListenerC21364) {
        C12096 c12096 = null;
        InterfaceC9768 interfaceC9768M56467 = null;
        String strM55639 = null;
        int i = -1593054422;
        int i2 = C1071.f81975;
        int i3 = ServiceConnectionC1013.f81940;
        int iM55979 = (i3 - C0946.m55979("۬֡")) * (-7);
        int i4 = ((iM55979 ^ i2) * 12071) ^ (-1903046945);
        int i5 = 1132010624;
        while (true) {
            i = ((((i ^ i2) * (-22259)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2012346455:
                case 1591951679:
                    if (C1124.f82007 >= 0) {
                        iM55979 = C0946.m55979("ۚ᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-7769)) ^ (-640967038);
                        i5 = -639155317;
                    } else {
                        iM55979 = C0946.m55979("᩻᩶") ^ i3;
                        i4 = ((iM55979 ^ i2) * 3079) ^ (-2020311693);
                        i5 = 609534429;
                    }
                    break;
                case -1983187252:
                case -886589985:
                    C1929.m56553();
                    break;
                case -1910274196:
                case -1333781147:
                    interfaceC9768M56467 = C1404.m56467(c12096);
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = (C0873.m55680("ᩳܶ") + i3) * 101;
                        i4 = ((iM55979 ^ i2) * 22861) ^ 713777140;
                        i5 = 132703625;
                    } else {
                        iM55979 = (C0873.m55680("۫ܿ") ^ i3) * (-109);
                        i4 = ((iM55979 ^ i2) * 30793) ^ (-1617313329);
                        i5 = 2109827052;
                    }
                    break;
                case -1752007122:
                case -1295542868:
                    if (C0989.f81920 >= 0) {
                        iM55979 = C0946.m55979("ۚ᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-7769)) ^ (-640967038);
                        i5 = -639155317;
                    } else {
                        iM55979 = C0946.m55979("ۨۚ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-7865)) ^ (-138145977);
                        i5 = 1658105582;
                    }
                    break;
                case -1404376020:
                case -1327407640:
                    C0890.m55729(new C16668(viewOnClickListenerC21364, strM55639));
                    break;
                case -968403997:
                case 666927593:
                    c12096 = viewOnClickListenerC21364.f67352;
                    if (C0861.f81831) {
                        iM55979 = C0873.m55680("᩵ۨ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 25923) ^ (-356191547);
                        i5 = -836109221;
                    } else {
                        iM55979 = C0946.m55979("᩶᩸") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-7529)) ^ 618136887;
                        i5 = 1799918386;
                    }
                    break;
                case -929006602:
                case 265470184:
                    if (C1964.m56597() != 0) {
                        iM55979 = C0946.m55979("᩶᩸") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-7529)) ^ 618136887;
                        i5 = 1799918386;
                    } else {
                        iM55979 = (C0946.m55979("ܰܽ") + i2) * 11;
                        i4 = ((iM55979 ^ i3) * (-12841)) ^ (-1335884559);
                        i5 = -1377603595;
                    }
                    break;
                case -420611178:
                case 1086305525:
                    if (C0927.m55873() <= 0) {
                        iM55979 = C0946.m55979("ۚ᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-7769)) ^ (-640967038);
                        i5 = -639155317;
                    } else {
                        iM55979 = C0873.m55680("۟ۗ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 7775) ^ 621605033;
                        i5 = -1369975126;
                    }
                    break;
                case -329750188:
                case 584921656:
                    if (C0917.m55854()) {
                        iM55979 = C0946.m55979("ۖۘ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 19353) ^ (-722797503);
                        i5 = -1068040300;
                    } else {
                        iM55979 = C0946.m55979("ۙ᩺") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-27407)) ^ 1550695306;
                        i5 = 212326770;
                    }
                    break;
                case 134159162:
                case 326104482:
                    if (C1404.f82149 >= 0) {
                        iM55979 = (C0873.m55680("ᩳܶ") + i3) * 101;
                        i4 = ((iM55979 ^ i2) * 22861) ^ 713777140;
                        i5 = 132703625;
                    } else {
                        iM55979 = (i2 - C0873.m55680("ۘܿ")) * (-3);
                        i4 = ((iM55979 ^ i3) * 85) ^ 1622722475;
                        i5 = 475827163;
                    }
                    break;
                case 706537843:
                case 2022400408:
                    if (C0894.f81854 >= 0) {
                        iM55979 = C0946.m55979("᩶᩸") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-7529)) ^ 618136887;
                        i5 = 1799918386;
                    } else {
                        iM55979 = (C0873.m55680("ᩳܶ") + i3) * 101;
                        i4 = ((iM55979 ^ i2) * 22861) ^ 713777140;
                        i5 = 132703625;
                    }
                    break;
                case 890263589:
                case 1089977957:
                    C1964.m56597();
                    if (ViewOnClickListenerC0939.f81888 > 0) {
                        iM55979 = (C0873.m55680("ᩳܶ") + i3) * 101;
                        i4 = ((iM55979 ^ i2) * 22861) ^ 713777140;
                        i5 = 132703625;
                    } else {
                        iM55979 = C0946.m55979("ܿܶ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-10391)) ^ (-298970068);
                        i5 = -308507448;
                    }
                    break;
                case 1117845506:
                case 1897229875:
                    if (C1404.f82149 >= 0) {
                        iM55979 = C0946.m55979("᩶᩸") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-7529)) ^ 618136887;
                        i5 = 1799918386;
                    } else {
                        iM55979 = (i2 - C0946.m55979("ᩳۘ")) * 101;
                        i4 = ((iM55979 ^ i3) * (-24405)) ^ 606427883;
                        i5 = 406582072;
                    }
                    break;
                case 1307575088:
                case 1876524089:
                    ViewOnClickListenerC0939.m55941();
                    if (!C0882.f81846) {
                        iM55979 = C0946.m55979("ۚ᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-7769)) ^ (-640967038);
                        i5 = -639155317;
                    } else {
                        iM55979 = (C0873.m55680("ᩳܶ") + i3) * 101;
                        i4 = ((iM55979 ^ i2) * 22861) ^ 713777140;
                        i5 = 132703625;
                    }
                    break;
                case 1328905475:
                case 1728234336:
                    strM55639 = C0863.m55639(interfaceC9768M56467);
                    if (C1036.f81953 >= 0) {
                        iM55979 = C0946.m55979("ۙ᩺") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-27407)) ^ 1550695306;
                        i5 = 212326770;
                    } else {
                        iM55979 = C0873.m55680("ۧۛ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 10671) ^ (-2103996264);
                        i5 = -1963856328;
                    }
                    break;
                default:
                    C1024.m56209();
                    ServiceConnectionC1013.m56157();
                    iM55979 = C0946.m55979("ܿܶ") ^ i2;
                    i4 = ((iM55979 ^ i3) * (-10391)) ^ (-298970068);
                    i5 = -308507448;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:164:0x0b24 A[PHI: r103 r104 r105 r106
      0x0b24: PHI (r103v103 int) = (r103v95 int), (r103v97 int), (r103v104 int) binds: [B:160:0x0b04, B:153:0x0aac, B:146:0x0a24] A[DONT_GENERATE, DONT_INLINE]
      0x0b24: PHI (r104v99 int) = (r104v90 int), (r104v92 int), (r104v100 int) binds: [B:160:0x0b04, B:153:0x0aac, B:146:0x0a24] A[DONT_GENERATE, DONT_INLINE]
      0x0b24: PHI (r105v96 int) = (r105v88 int), (r105v90 int), (r105v97 int) binds: [B:160:0x0b04, B:153:0x0aac, B:146:0x0a24] A[DONT_GENERATE, DONT_INLINE]
      0x0b24: PHI (r106v98 int) = (r106v90 int), (r106v92 int), (r106v99 int) binds: [B:160:0x0b04, B:153:0x0aac, B:146:0x0a24] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0545 A[PHI: r2 r103 r104 r105 r106
      0x0545: PHI (r2v217 java.util.ArrayList) = (r2v203 java.util.ArrayList), (r2v210 java.util.ArrayList), (r2v218 java.util.ArrayList) binds: [B:63:0x052c, B:47:0x045d, B:37:0x0390] A[DONT_GENERATE, DONT_INLINE]
      0x0545: PHI (r103v157 int) = (r103v143 int), (r103v150 int), (r103v158 int) binds: [B:63:0x052c, B:47:0x045d, B:37:0x0390] A[DONT_GENERATE, DONT_INLINE]
      0x0545: PHI (r104v147 l.ᩴ᩺ܽ) = (r104v134 l.ᩴ᩺ܽ), (r104v140 l.ᩴ᩺ܽ), (r104v148 l.ᩴ᩺ܽ) binds: [B:63:0x052c, B:47:0x045d, B:37:0x0390] A[DONT_GENERATE, DONT_INLINE]
      0x0545: PHI (r105v149 int) = (r105v135 int), (r105v142 int), (r105v150 int) binds: [B:63:0x052c, B:47:0x045d, B:37:0x0390] A[DONT_GENERATE, DONT_INLINE]
      0x0545: PHI (r106v137 int) = (r106v123 int), (r106v130 int), (r106v138 int) binds: [B:63:0x052c, B:47:0x045d, B:37:0x0390] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:237:0x10ec. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x016e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r80v1 */
    /* JADX WARN: Type inference failed for: r80v2 */
    /* JADX WARN: Type inference failed for: r80v3 */
    /* JADX WARN: Type inference failed for: r80v4 */
    /* JADX WARN: Type inference failed for: r80v5 */
    /* JADX WARN: Type inference failed for: r80v6 */
    /* JADX INFO: renamed from: ֫ */
    public static void m48394(ViewOnClickListenerC21364 viewOnClickListenerC21364, C20765 c20765, C9952 c9952, C11108 c11108, boolean z, AtomicInteger atomicInteger) {
        AbstractC9476 abstractC9476;
        EnumC3167 enumC3167;
        int iM55979;
        int i;
        int iM55680;
        int i2;
        int i3;
        AbstractC9476 abstractC9477;
        AbstractC9476 abstractC9478;
        List list;
        AbstractC9476 abstractC9479;
        C3422 c3422;
        C20765 c20766;
        C20765 c20767;
        C20765 c20768;
        ArrayList arrayList;
        InterfaceC20568 interfaceC20568;
        int i4;
        int iM55681;
        int i5;
        int i6;
        int iM55682;
        int i7;
        int i8;
        int iM55683;
        int i9;
        int i10;
        ArrayList arrayList2;
        int i11;
        int iM55684;
        int i12;
        int i13;
        int i14;
        int iM55685;
        int i15;
        int i16;
        int iM55686;
        int i17;
        int i18;
        AtomicInteger atomicInteger2;
        List list2;
        int i19;
        int i20;
        int i21;
        String str;
        C20765 c20769;
        int i22;
        String str2;
        InterfaceC20568 interfaceC20569;
        int i23;
        int i24;
        EnumC3167 enumC3168;
        int i25;
        C20765 c207610;
        int i26;
        int iM55687;
        int i27;
        int i28;
        int iM559710;
        int i29;
        InterfaceC20568 interfaceC205610;
        ArrayList arrayList3;
        int i30;
        EnumC3167 enumC3169;
        C3422 c3423;
        InterfaceC20568 interfaceC205611;
        AbstractC9476 abstractC94710;
        List list3;
        int iM559711;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int iM559712;
        int i36;
        int i37;
        boolean z2;
        int i38;
        InterfaceC4059 interfaceC4059;
        int i39;
        int i40;
        C20765 c207611;
        int i41;
        C20765 c207612;
        int iM559713;
        int i42;
        int i43;
        int iM559714;
        int i44;
        int i45;
        boolean z3;
        int iM559715;
        int i46;
        int i47;
        int iM55688;
        int i48;
        int i49;
        int iM559716;
        int i50;
        int i51;
        int iM559717;
        int i52;
        int i53;
        int i54;
        int iM55689;
        int i55;
        int i56;
        ViewOnClickListenerC21364 viewOnClickListenerC21365 = viewOnClickListenerC21364;
        AtomicInteger atomicInteger3 = null;
        String str3 = null;
        int i57 = C1025.f81947;
        int i58 = C0873.f81841;
        int iM556810 = (i58 - C0873.m55680("ܺ֫")) * 83;
        int i59 = ((iM556810 ^ i57) * 14133) ^ (-2022423505);
        String strMo5033 = null;
        C20765 c207613 = null;
        InterfaceC20568 interfaceC20568Mo5857 = null;
        C3422 c3424 = null;
        List listMo6074 = null;
        String str4 = null;
        C20765 c207614 = null;
        C20765 c207615 = null;
        C20496 c20496M25581 = null;
        InterfaceC20568 interfaceC205612 = null;
        AbstractC9476 abstractC94711 = null;
        EnumC3167 enumC31610 = null;
        C20765 c207616 = null;
        C20765 c207617 = null;
        InterfaceC12777 interfaceC12777 = null;
        ArrayList arrayList4 = null;
        boolean[] zArr = null;
        int i60 = iM556810 ^ (-1637567552);
        int i61 = 0;
        int i62 = 0;
        int i63 = 0;
        int i64 = 0;
        int i65 = 4005169;
        int i66 = 0;
        ArrayList arrayList5 = null;
        char c = 0;
        boolean z4 = false;
        boolean z5 = false;
        int i67 = 0;
        int i68 = 0;
        int i69 = 0;
        int i70 = 0;
        boolean z6 = false;
        boolean z7 = false;
        int i71 = 0;
        boolean z8 = false;
        int i72 = 0;
        int i73 = 0;
        boolean z9 = false;
        int i74 = 0;
        char c2 = 0;
        boolean z10 = false;
        int i75 = 0;
        boolean z11 = false;
        boolean z12 = false;
        int i76 = 0;
        char c3 = 0;
        int i77 = 0;
        boolean z13 = false;
        ?? r80 = 0;
        int i78 = 0;
        int i79 = 0;
        boolean z14 = false;
        int i80 = 0;
        int i81 = 0;
        int i82 = 0;
        int i83 = 0;
        int i84 = 0;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        boolean z20 = false;
        int i85 = 0;
        int i86 = 0;
        ArrayList arrayList6 = null;
        Iterator itM56399 = null;
        Iterator itM563910 = null;
        Iterator itM563911 = null;
        C20765 c207618 = null;
        InterfaceC20568 interfaceC205613 = null;
        C20765 c207619 = null;
        InterfaceC4059 interfaceC40510 = null;
        Iterator itM56292 = null;
        int iM56023 = 0;
        int i87 = 0;
        char c4 = 0;
        String str5 = null;
        InterfaceC20568 interfaceC20568M46907 = null;
        ArrayList arrayListM14688 = null;
        C20765 c207620 = null;
        InterfaceC19897 interfaceC19897 = null;
        AbstractC9476 abstractC94712 = null;
        String strM55852 = null;
        boolean z21 = false;
        while (true) {
            i65 = i60 ^ (i59 & (((i65 ^ i57) * 25007) >> 31));
            switch (i65) {
                case -2146720528:
                case -910881589:
                    z19 = true;
                    iM55689 = (C0946.m55979("᩻᩸") + i57) * (-3);
                    i55 = ((iM55689 ^ i58) * 9135) ^ (-1792594002);
                    i56 = -1147978598;
                    i60 = iM55689 ^ i56;
                    i59 = i55;
                    i65 = i65;
                    c20496M25581 = c20496M25581;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case -2146265623:
                case 1569725053:
                    break;
                case -2145998134:
                case 738169400:
                    i79 = 2;
                    iM559716 = C0873.m55680("ᩴۚ") ^ i57;
                    i50 = ((iM559716 ^ i58) * (-14283)) ^ 1732658310;
                    i51 = 1224767946;
                    i60 = iM559716 ^ i51;
                    arrayList4 = arrayList4;
                    i65 = i65;
                    c20496M25581 = c20496M25581;
                    iM56023 = iM56023;
                    i59 = i50;
                    i62 = i62;
                    break;
                case -2142234405:
                case -1215498690:
                    z20 = true;
                    int iM559718 = C0946.m55979("֨ۡ") ^ i58;
                    i65 = i65;
                    i59 = ((iM559718 ^ i57) * (-7807)) ^ 1157149780;
                    i60 = iM559718 ^ 826104866;
                    i65 = i65;
                    break;
                case -2126094226:
                case -475012164:
                    i65 = i65;
                    iM56023 = iM56023;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i80 = i80;
                    EnumC3167 enumC31611 = enumC31610;
                    i83 = i83;
                    i85 = i85;
                    c207615 = c207615;
                    AbstractC9476 abstractC94713 = abstractC94712;
                    if (!viewOnClickListenerC21365.f67347.m14691(c207615, abstractC94713, c3424, i85)) {
                        enumC3167 = enumC31611;
                        abstractC9477 = abstractC94713;
                        i34 = i86;
                        abstractC94712 = abstractC9477;
                        i83 = i83;
                        z2 = z5;
                        i38 = i85;
                        z7 = z2;
                        c207617 = c207615;
                        i70 = i38;
                        c207616 = c207619;
                        z6 = z8;
                        int iM559719 = (C0946.m55979("ۢ᩶") ^ i58) * 77;
                        i67 = i67;
                        i85 = i85;
                        i86 = i34;
                        i80 = i80;
                        c207615 = c207615;
                        i87 = i87;
                        str3 = str3;
                        enumC31610 = enumC3167;
                        i74 = i74;
                        i69 = i69;
                        c3424 = c3424;
                        i65 = i65;
                        i62 = i62;
                        iM56023 = iM56023;
                        listMo6074 = listMo6074;
                        i60 = iM559719 ^ 1351575578;
                        i59 = ((iM559719 ^ i57) * 15081) ^ 1495919302;
                        i61 = i61;
                        viewOnClickListenerC21365 = viewOnClickListenerC21364;
                    } else {
                        int iM559720 = C0946.m55979("ۘ۠") ^ i58;
                        i2 = ((iM559720 ^ i57) * (-1275)) ^ (-1201179221);
                        i6 = iM559720 ^ 744263149;
                        i85 = i85;
                        abstractC94712 = abstractC94713;
                        i80 = i80;
                        c207615 = c207615;
                        str3 = str3;
                        i83 = i83;
                        enumC31610 = enumC31611;
                        i61 = i61;
                        i62 = i62;
                        iM56023 = iM56023;
                        i60 = i6;
                        i59 = i2;
                        i87 = i87;
                        i65 = i65;
                    }
                    break;
                case -2118102745:
                case 1995225507:
                    i65 = i65;
                    iM56023 = iM56023;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i80 = i80;
                    enumC31610 = enumC31610;
                    int i88 = i83;
                    i85 = i85;
                    c207615 = c207615;
                    i71 = i85 + 1;
                    if (atomicInteger3 != null) {
                        iM55682 = (C0873.m55680("۬ۗ") ^ i58) * 7;
                        i83 = i88;
                        i7 = ((iM55682 ^ i57) * 25293) ^ 1544713640;
                        i8 = 115970186;
                    } else {
                        i83 = i88;
                        i73 = i71;
                        iM55682 = C0873.m55680("ۧܰ") ^ i58;
                        i7 = ((iM55682 ^ i57) * 9315) ^ 22414319;
                        i8 = -1730089926;
                    }
                    i85 = i85;
                    enumC31610 = enumC31610;
                    i80 = i80;
                    c207615 = c207615;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    i65 = i65;
                    i62 = i62;
                    iM56023 = iM56023;
                    i60 = iM55682 ^ i8;
                    i59 = i7;
                    i61 = i61;
                    break;
                case -2090809764:
                case -267637917:
                    boolean[] zArr2 = new boolean[6];
                    zArr2[0] = z13;
                    zArr2[r80] = false;
                    zArr2[c2] = false;
                    zArr2[c] = false;
                    zArr2[c4] = false;
                    zArr2[c3] = false;
                    zArr = zArr2;
                    iM559716 = (C0946.m55979("ۡۘ") ^ i58) * (-29);
                    i50 = ((iM559716 ^ i57) * (-3311)) ^ 200545918;
                    i51 = -1957823272;
                    i60 = iM559716 ^ i51;
                    arrayList4 = arrayList4;
                    i65 = i65;
                    c20496M25581 = c20496M25581;
                    iM56023 = iM56023;
                    i59 = i50;
                    i62 = i62;
                    break;
                case -2077771059:
                case 160051468:
                    i65 = i65;
                    iM56023 = iM56023;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    InterfaceC20568 interfaceC205614 = interfaceC205612;
                    i69 = i69;
                    listMo6074 = listMo6074;
                    i74 = i74;
                    i80 = i80;
                    abstractC9476 = abstractC94712;
                    enumC3167 = enumC31610;
                    i83 = i83;
                    i85 = i85;
                    c207615 = c207615;
                    if (!(interfaceC205614 instanceof C3422)) {
                        interfaceC205612 = interfaceC205614;
                        list = listMo6074;
                        abstractC9479 = abstractC9476;
                        c3422 = c3424;
                        c20766 = c207615;
                        c20767 = c207613;
                        c20768 = c207619;
                        arrayList = arrayList6;
                        interfaceC20568 = interfaceC205612;
                        i4 = i86;
                        interfaceC205613 = interfaceC20568;
                        c207618 = c20766;
                        str4 = str5;
                        c207614 = c20768;
                        z4 = z21;
                        iM559710 = C0873.m55680("۬ۜ") ^ i57;
                        i59 = ((iM559710 ^ i58) * (-20423)) ^ (-168211287);
                        i29 = 836023951;
                        i28 = iM559710 ^ i29;
                        i85 = i85;
                        arrayList6 = arrayList;
                        i86 = i4;
                        i80 = i80;
                        c207615 = c207615;
                        i87 = i87;
                        str3 = str3;
                        i83 = i83;
                        enumC31610 = enumC3167;
                        i74 = i74;
                        c207613 = c20767;
                        abstractC94712 = abstractC9479;
                        c3424 = c3422;
                        i65 = i65;
                        i61 = i61;
                        i62 = i62;
                        iM56023 = iM56023;
                        i60 = i28;
                        i69 = i69;
                        listMo6074 = list;
                        viewOnClickListenerC21365 = viewOnClickListenerC21364;
                    } else {
                        iM55979 = (i57 - C0946.m55979("᩶ܺ")) * (-33);
                        interfaceC205612 = interfaceC205614;
                        i59 = ((iM55979 ^ i58) * 19377) ^ (-1198865396);
                        i = -1050781344;
                        listMo6074 = listMo6074;
                        i85 = i85;
                        abstractC94712 = abstractC9476;
                        i80 = i80;
                        c207615 = c207615;
                        str3 = str3;
                        i83 = i83;
                        enumC31610 = enumC3167;
                        i74 = i74;
                        i69 = i69;
                        i61 = i61;
                        i62 = i62;
                        iM56023 = iM56023;
                        viewOnClickListenerC21365 = viewOnClickListenerC21364;
                        i60 = iM55979 ^ i;
                        i87 = i87;
                        i65 = i65;
                    }
                    break;
                case -2057550924:
                case 1493426495:
                    InterfaceC5815 interfaceC5815 = (InterfaceC5815) RunnableC0897.m55785(itM56399);
                    C0937.m55917(arrayList5, c20765.m46905(interfaceC5815.mo10231(), interfaceC5815.getName(), interfaceC5815.getType(), interfaceC5815.mo13086(), interfaceC5815.mo13085(), interfaceC5815.getAnnotations(), interfaceC5815.mo13087()));
                    iM55686 = (i57 - C0873.m55680("᩶᩵")) * (-47);
                    i17 = ((iM55686 ^ i58) * 6243) ^ 337772467;
                    i18 = -371733746;
                    i86 = i86;
                    str3 = str3;
                    i85 = i85;
                    c207613 = c207613;
                    i60 = iM55686 ^ i18;
                    i66 = i66;
                    i59 = i17;
                    listMo6074 = listMo6074;
                    iM56023 = iM56023;
                    viewOnClickListenerC21365 = viewOnClickListenerC21364;
                    break;
                case -2054127893:
                case 1658555555:
                    i65 = i65;
                    iM56023 = iM56023;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    int i89 = i69;
                    listMo6074 = listMo6074;
                    i74 = i74;
                    i80 = i80;
                    abstractC9476 = abstractC94712;
                    enumC3167 = enumC31610;
                    i83 = i83;
                    i85 = i85;
                    c207615 = c207615;
                    if (i80 == i89) {
                        i69 = i89;
                        abstractC9478 = abstractC9476;
                        i80 = i80;
                        i35 = i86;
                        int iM556811 = (C0873.m55680("֡۬") + i57) * 41;
                        i85 = i85;
                        i67 = i67;
                        i86 = i35;
                        c207615 = c207615;
                        str3 = str3;
                        i83 = i83;
                        enumC31610 = enumC3167;
                        i74 = i74;
                        abstractC94712 = abstractC9478;
                        c3424 = c3424;
                        i61 = i61;
                        i62 = i62;
                        iM56023 = iM56023;
                        listMo6074 = listMo6074;
                        i60 = iM556811 ^ (-1334062428);
                        i59 = ((iM556811 ^ i58) * (-2799)) ^ (-1358178413);
                        i87 = i87;
                        i69 = i69;
                        i65 = i65;
                        viewOnClickListenerC21365 = viewOnClickListenerC21364;
                    } else {
                        iM55979 = (C0873.m55680("ܽ᩻") ^ i58) * (-103);
                        i69 = i89;
                        i59 = ((iM55979 ^ i57) * (-11321)) ^ (-321761077);
                        i = 1236781012;
                        listMo6074 = listMo6074;
                        i85 = i85;
                        abstractC94712 = abstractC9476;
                        i80 = i80;
                        c207615 = c207615;
                        str3 = str3;
                        i83 = i83;
                        enumC31610 = enumC3167;
                        i74 = i74;
                        i69 = i69;
                        i61 = i61;
                        i62 = i62;
                        iM56023 = iM56023;
                        viewOnClickListenerC21365 = viewOnClickListenerC21364;
                        i60 = iM55979 ^ i;
                        i87 = i87;
                        i65 = i65;
                    }
                    break;
                case -2011506142:
                case 666412239:
                    i39 = iM56023;
                    i41 = i62 + 1;
                    i63 = i77;
                    z12 = z14;
                    i40 = i85;
                    c207611 = c207615;
                    r80 = 1;
                    c207612 = c20765;
                    int iM556812 = (C0873.m55680("ᩳܿ") ^ i57) * (-61);
                    C20765 c207621 = c207612;
                    i59 = ((iM556812 ^ i58) * (-23609)) ^ (-1228770713);
                    i85 = i40;
                    i83 = i83;
                    enumC31610 = enumC31610;
                    c207615 = c207611;
                    i62 = i41;
                    i87 = i87;
                    c207620 = c207621;
                    i65 = i65;
                    i61 = i61;
                    iM56023 = i39;
                    i60 = iM556812 ^ (-1024520457);
                    str3 = str3;
                    break;
                case -2001039260:
                case 1851213779:
                    z3 = c20496M25581.f63291;
                    z11 = z3;
                    iM559714 = (C0946.m55979("ܽ۬") + i57) * (-123);
                    i44 = ((iM559714 ^ i58) * 9173) ^ (-1367224405);
                    i45 = -162852656;
                    i60 = iM559714 ^ i45;
                    i59 = i44;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case -1976634729:
                case 1145248221:
                    i65 = i65;
                    iM56023 = iM56023;
                    i61 = i61;
                    i22 = i87;
                    str2 = str3;
                    i62 = i62;
                    C20765 c207622 = c207613;
                    interfaceC205610 = interfaceC20568Mo5857;
                    arrayList3 = arrayList6;
                    list = listMo6074;
                    i23 = i74;
                    i24 = i80;
                    abstractC9479 = abstractC94712;
                    enumC3168 = enumC31610;
                    i25 = i83;
                    i30 = i85;
                    c207610 = c207615;
                    c3422 = c3424;
                    i26 = i86;
                    interfaceC20568M46907 = c207622.m46907(interfaceC205610);
                    i67 = 3;
                    if (atomicInteger3 != null) {
                        int iM559721 = C0946.m55979("֫۠") ^ i58;
                        int i90 = ((iM559721 ^ i57) * (-29991)) ^ 1502122070;
                        interfaceC20568Mo5857 = interfaceC205610;
                        i85 = i30;
                        arrayList6 = arrayList3;
                        i86 = i26;
                        i80 = i24;
                        c207615 = c207610;
                        i87 = i22;
                        str3 = str2;
                        i83 = i25;
                        enumC31610 = enumC3168;
                        i74 = i23;
                        i60 = iM559721 ^ (-84258770);
                        c207613 = c207622;
                        abstractC94712 = abstractC9479;
                        c3424 = c3422;
                        i65 = i65;
                        i61 = i61;
                        i62 = i62;
                        iM56023 = iM56023;
                        i64 = 5;
                        i69 = 6;
                        i59 = i90;
                    } else {
                        c20767 = c207622;
                        i64 = 5;
                        i69 = 6;
                        int iM556813 = (C0873.m55680("ܽۨ") + i58) * (-75);
                        interfaceC20569 = interfaceC205610;
                        i59 = ((iM556813 ^ i57) * (-24381)) ^ (-288434084);
                        i28 = iM556813 ^ (-1982714064);
                        i85 = i30;
                        arrayList6 = arrayList3;
                        i86 = i26;
                        i80 = i24;
                        c207615 = c207610;
                        i87 = i22;
                        str3 = str2;
                        i83 = i25;
                        enumC31610 = enumC3168;
                        i74 = i23;
                        interfaceC20568Mo5857 = interfaceC20569;
                        c207613 = c20767;
                        abstractC94712 = abstractC9479;
                        c3424 = c3422;
                        i65 = i65;
                        i61 = i61;
                        i62 = i62;
                        iM56023 = iM56023;
                        i60 = i28;
                        i69 = i69;
                    }
                    listMo6074 = list;
                    viewOnClickListenerC21365 = viewOnClickListenerC21364;
                    break;
                case -1975642542:
                case -651307157:
                    i65 = i65;
                    iM56023 = iM56023;
                    i61 = i61;
                    i62 = i62;
                    if (i62 == 0) {
                        iM559714 = C0946.m55979("ۛ᩷") ^ i58;
                        i44 = ((iM559714 ^ i57) * (-28685)) ^ 1528928152;
                        i45 = 33879412;
                    } else {
                        iM559714 = (C0873.m55680("۫ۤ") + i57) * (-9);
                        i44 = ((iM559714 ^ i58) * 29737) ^ (-107232839);
                        i45 = -1587184535;
                    }
                    i60 = iM559714 ^ i45;
                    i59 = i44;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case -1971095677:
                case 1146684825:
                    i65 = i65;
                    iM56023 = iM56023;
                    i61 = i61;
                    i62 = i62;
                    if (interfaceC40510 != null) {
                        iM559714 = C0873.m55680("᩺ܳ") ^ i58;
                        i44 = ((iM559714 ^ i57) * 16023) ^ (-821018932);
                        i45 = -1551863747;
                    } else {
                        i72 = i63;
                        z9 = z12;
                        iM559714 = C0946.m55979("᩺᩺") ^ i57;
                        i44 = ((iM559714 ^ i58) * (-29725)) ^ (-1295643270);
                        i45 = -933853601;
                    }
                    i60 = iM559714 ^ i45;
                    i59 = i44;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case -1946285984:
                case -979410757:
                    z17 = false;
                    iM559717 = (C0946.m55979("᩹ܽ") + i58) * (-11);
                    i52 = ((iM559717 ^ i57) * (-7513)) ^ 914155572;
                    i53 = -1134140030;
                    i60 = iM559717 ^ i53;
                    arrayList4 = arrayList4;
                    i59 = i52;
                    i65 = i65;
                    c20496M25581 = c20496M25581;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case -1922497956:
                case 717721215:
                    i65 = i65;
                    iM56023 = iM56023;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i69 = i69;
                    listMo6074 = listMo6074;
                    i80 = i80;
                    abstractC9476 = abstractC94712;
                    enumC3167 = enumC31610;
                    i83 = i83;
                    i85 = i85;
                    c207615 = c207615;
                    int i91 = i85 + 1;
                    if (i91 >= C0947.m55989(listMo6074)) {
                        i74 = i91;
                        int iM556814 = C0873.m55680("ᩴܰ") ^ i58;
                        i2 = ((iM556814 ^ i57) * 1667) ^ (-537189048);
                        i6 = iM556814 ^ 1121533382;
                        listMo6074 = listMo6074;
                        i85 = i85;
                        abstractC94712 = abstractC9476;
                        i80 = i80;
                        c207615 = c207615;
                        str3 = str3;
                        i83 = i83;
                        enumC31610 = enumC3167;
                        i69 = i69;
                        i61 = i61;
                        i62 = i62;
                        iM56023 = iM56023;
                        viewOnClickListenerC21365 = viewOnClickListenerC21364;
                        i60 = i6;
                        i59 = i2;
                        i87 = i87;
                        i65 = i65;
                    } else {
                        iM55979 = (C0873.m55680("۫᩻") + i58) * 3;
                        i74 = i91;
                        i59 = ((iM55979 ^ i57) * (-11557)) ^ 1886529695;
                        i = 278889431;
                        listMo6074 = listMo6074;
                        i85 = i85;
                        abstractC94712 = abstractC9476;
                        i80 = i80;
                        c207615 = c207615;
                        str3 = str3;
                        i83 = i83;
                        enumC31610 = enumC3167;
                        i74 = i74;
                        i69 = i69;
                        i61 = i61;
                        i62 = i62;
                        iM56023 = iM56023;
                        viewOnClickListenerC21365 = viewOnClickListenerC21364;
                        i60 = iM55979 ^ i;
                        i87 = i87;
                        i65 = i65;
                    }
                    break;
                case -1894858358:
                case 450791318:
                    i65 = i65;
                    iM56023 = iM56023;
                    i61 = i61;
                    i22 = i87;
                    str2 = str3;
                    i62 = i62;
                    i69 = i69;
                    list3 = listMo6074;
                    i23 = i74;
                    i24 = i80;
                    abstractC9479 = abstractC94712;
                    enumC3168 = enumC31610;
                    i25 = i83;
                    i30 = i85;
                    c207610 = c207615;
                    c3422 = c3424;
                    i26 = i86;
                    if (!C0866.m55647(itM563911)) {
                        list = list3;
                        c20767 = c207613;
                        interfaceC205610 = interfaceC20568Mo5857;
                        arrayList3 = arrayList6;
                        int iM556815 = (C0873.m55680("ܽۨ") + i58) * (-75);
                        interfaceC20569 = interfaceC205610;
                        i59 = ((iM556815 ^ i57) * (-24381)) ^ (-288434084);
                        i28 = iM556815 ^ (-1982714064);
                        i85 = i30;
                        arrayList6 = arrayList3;
                        i86 = i26;
                        i80 = i24;
                        c207615 = c207610;
                        i87 = i22;
                        str3 = str2;
                        i83 = i25;
                        enumC31610 = enumC3168;
                        i74 = i23;
                        interfaceC20568Mo5857 = interfaceC20569;
                        c207613 = c20767;
                        abstractC94712 = abstractC9479;
                        c3424 = c3422;
                        i65 = i65;
                        i61 = i61;
                        i62 = i62;
                        iM56023 = iM56023;
                        i60 = i28;
                        i69 = i69;
                        listMo6074 = list;
                        viewOnClickListenerC21365 = viewOnClickListenerC21364;
                    } else {
                        iM559711 = C0946.m55979("۠ۛ") ^ i58;
                        i31 = ((iM559711 ^ i57) * 31539) ^ 764813921;
                        i32 = -91894542;
                        i33 = iM559711 ^ i32;
                        i85 = i30;
                        i86 = i26;
                        i80 = i24;
                        c207615 = c207610;
                        i87 = i22;
                        str3 = str2;
                        i83 = i25;
                        enumC31610 = enumC3168;
                        i74 = i23;
                        abstractC94712 = abstractC9479;
                        c3424 = c3422;
                        i65 = i65;
                        i62 = i62;
                        iM56023 = iM56023;
                        listMo6074 = list3;
                        i60 = i33;
                        i59 = i31;
                        i69 = i69;
                        i61 = i61;
                        viewOnClickListenerC21365 = viewOnClickListenerC21364;
                    }
                    break;
                case -1851453581:
                case -847798919:
                    z18 = false;
                    iM55689 = C0873.m55680("֫ۗ") ^ i58;
                    i55 = ((iM55689 ^ i57) * 22871) ^ 270704586;
                    i56 = -1344192294;
                    i60 = iM55689 ^ i56;
                    i59 = i55;
                    i65 = i65;
                    c20496M25581 = c20496M25581;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case -1847501052:
                case -500117837:
                    i65 = i65;
                    iM56023 = iM56023;
                    i62 = i62;
                    c20496M25581 = c20496M25581;
                    arrayList4 = arrayList4;
                    if ((i76 & 4) != 0) {
                        iM559717 = C0873.m55680("ܺۖ") ^ i57;
                        i52 = ((iM559717 ^ i58) * (-487)) ^ (-885509726);
                        i53 = 1536446771;
                    } else {
                        iM559717 = (i58 - C0946.m55979("᩸ۚ")) * 127;
                        i52 = ((iM559717 ^ i57) * (-22017)) ^ 1631085268;
                        i53 = 2010265212;
                    }
                    i60 = iM559717 ^ i53;
                    arrayList4 = arrayList4;
                    i59 = i52;
                    i65 = i65;
                    c20496M25581 = c20496M25581;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case -1831709914:
                case 200533167:
                    i65 = i65;
                    iM56023 = iM56023;
                    i62 = i62;
                    c20496M25581 = c20496M25581;
                    arrayList4 = arrayList4;
                    i81 = i63 + 1;
                    ((C5073) C0992.m56115(arrayList4, 0)).m10803(c207620, c3424, i63);
                    if (atomicInteger3 != null) {
                        iM559717 = (C0873.m55680("۫ܰ") ^ i58) * 109;
                        i52 = ((iM559717 ^ i57) * 22359) ^ 520554494;
                        i53 = -694873943;
                    } else {
                        i54 = i84;
                        i84 = i81;
                        i82 = i84;
                        i84 = i54;
                        iM559717 = (C0873.m55680("ۗ᩷") + i58) * 7;
                        i52 = ((iM559717 ^ i57) * 24049) ^ (-1740939906);
                        i53 = -768879504;
                    }
                    i60 = iM559717 ^ i53;
                    arrayList4 = arrayList4;
                    i59 = i52;
                    i65 = i65;
                    c20496M25581 = c20496M25581;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case -1778308726:
                case -1761617761:
                    i65 = i65;
                    iM56023 = iM56023;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    int i92 = i68;
                    i69 = i69;
                    listMo6074 = listMo6074;
                    i74 = i74;
                    i80 = i80;
                    abstractC9476 = abstractC94712;
                    enumC3167 = enumC31610;
                    i83 = i83;
                    i85 = i85;
                    c207615 = c207615;
                    if (i80 == i92) {
                        i68 = i92;
                        abstractC9478 = abstractC9476;
                        i80 = i80;
                        i35 = i86;
                        int iM556816 = (C0873.m55680("֡۬") + i57) * 41;
                        i85 = i85;
                        i67 = i67;
                        i86 = i35;
                        c207615 = c207615;
                        str3 = str3;
                        i83 = i83;
                        enumC31610 = enumC3167;
                        i74 = i74;
                        abstractC94712 = abstractC9478;
                        c3424 = c3424;
                        i61 = i61;
                        i62 = i62;
                        iM56023 = iM56023;
                        listMo6074 = listMo6074;
                        i60 = iM556816 ^ (-1334062428);
                        i59 = ((iM556816 ^ i58) * (-2799)) ^ (-1358178413);
                        i87 = i87;
                        i69 = i69;
                        i65 = i65;
                        viewOnClickListenerC21365 = viewOnClickListenerC21364;
                    } else {
                        iM55979 = (i58 - C0946.m55979("᩸ۧ")) * (-97);
                        i68 = i92;
                        i59 = ((iM55979 ^ i57) * (-24695)) ^ (-264975924);
                        i = 566142306;
                        listMo6074 = listMo6074;
                        i85 = i85;
                        abstractC94712 = abstractC9476;
                        i80 = i80;
                        c207615 = c207615;
                        str3 = str3;
                        i83 = i83;
                        enumC31610 = enumC3167;
                        i74 = i74;
                        i69 = i69;
                        i61 = i61;
                        i62 = i62;
                        iM56023 = iM56023;
                        viewOnClickListenerC21365 = viewOnClickListenerC21364;
                        i60 = iM55979 ^ i;
                        i87 = i87;
                        i65 = i65;
                    }
                    break;
                case -1714556744:
                case 894042698:
                    i65 = i65;
                    if ((i76 & 32) != 0) {
                        iM55683 = (C0873.m55680("ᩳۤ") + i57) * (-91);
                        i9 = ((iM55683 ^ i58) * (-47)) ^ (-144736043);
                        i10 = -1525359032;
                    } else {
                        iM55683 = (C0873.m55680("ۤܺ") ^ i58) * 33;
                        i9 = ((iM55683 ^ i57) * (-23153)) ^ 1532733046;
                        i10 = -1535433793;
                    }
                    i60 = iM55683 ^ i10;
                    i59 = i9;
                    i65 = i65;
                    break;
                case -1699128655:
                case 409659836:
                    interfaceC4059 = null;
                    interfaceC40510 = interfaceC4059;
                    iM55682 = C0946.m55979("᩻ۡ") ^ i58;
                    i7 = ((iM55682 ^ i57) * 6951) ^ 2057608872;
                    i8 = 399542740;
                    i85 = i85;
                    enumC31610 = enumC31610;
                    i80 = i80;
                    c207615 = c207615;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    i65 = i65;
                    i62 = i62;
                    iM56023 = iM56023;
                    i60 = iM55682 ^ i8;
                    i59 = i7;
                    i61 = i61;
                    break;
                case -1679522788:
                case 1952191387:
                    i65 = i65;
                    iM56023 = iM56023;
                    i62 = i62;
                    c20496M25581 = c20496M25581;
                    arrayList4 = arrayList4;
                    C0937.m55917(arrayList4, (C5073) C1017.m56196(arrayListM14688, i87));
                    iM559717 = C0873.m55680("ۢܽ") ^ i58;
                    i52 = ((iM559717 ^ i57) * (-15883)) ^ (-498588589);
                    i53 = -1209738993;
                    i60 = iM559717 ^ i53;
                    arrayList4 = arrayList4;
                    i59 = i52;
                    i65 = i65;
                    c20496M25581 = c20496M25581;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case -1621855095:
                case 340084555:
                    i65 = i65;
                    iM56023 = iM56023;
                    i61 = i61;
                    i22 = i87;
                    str2 = str3;
                    i62 = i62;
                    c20767 = c207613;
                    interfaceC20569 = interfaceC20568Mo5857;
                    i69 = i69;
                    list = listMo6074;
                    i23 = i74;
                    i24 = i80;
                    abstractC9479 = abstractC94712;
                    enumC3168 = enumC31610;
                    i25 = i83;
                    int i93 = i85;
                    c207610 = c207615;
                    c3422 = c3424;
                    i26 = i86;
                    if (C0930.m55886(itM563910)) {
                        iM55687 = (i57 - C0946.m55979("֨ܰ")) * (-117);
                        i59 = ((iM55687 ^ i58) * 24217) ^ (-980892034);
                        i27 = 24202229;
                    } else {
                        iM55687 = C0873.m55680("ۡ۬") ^ i58;
                        i59 = ((iM55687 ^ i57) * 14203) ^ 1685687316;
                        i27 = 119548176;
                    }
                    i28 = iM55687 ^ i27;
                    i85 = i93;
                    i86 = i26;
                    i80 = i24;
                    c207615 = c207610;
                    i87 = i22;
                    str3 = str2;
                    i83 = i25;
                    enumC31610 = enumC3168;
                    i74 = i23;
                    interfaceC20568Mo5857 = interfaceC20569;
                    c207613 = c20767;
                    abstractC94712 = abstractC9479;
                    c3424 = c3422;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM56023 = iM56023;
                    i60 = i28;
                    i69 = i69;
                    listMo6074 = list;
                    viewOnClickListenerC21365 = viewOnClickListenerC21364;
                    break;
                case -1607075761:
                case 362845406:
                    i65 = i65;
                    iM56023 = iM56023;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i69 = i69;
                    listMo6074 = listMo6074;
                    i74 = i74;
                    abstractC9478 = abstractC94712;
                    enumC3167 = enumC31610;
                    i83 = i83;
                    i85 = i85;
                    c207615 = c207615;
                    c3424 = c3424;
                    i35 = i86;
                    int iMo10470 = ((InterfaceC9838) RunnableC0897.m55785(itM563911)).mo10470();
                    i67 = i67;
                    if (iMo10470 != i67) {
                        int iM559722 = (C0946.m55979("᩻᩷") ^ i58) * 29;
                        i80 = iMo10470;
                        i85 = i85;
                        i67 = i67;
                        i86 = i35;
                        i59 = ((iM559722 ^ i57) * 7781) ^ (-1334588370);
                        c207615 = c207615;
                        str3 = str3;
                        i83 = i83;
                        enumC31610 = enumC3167;
                        i74 = i74;
                        abstractC94712 = abstractC9478;
                        c3424 = c3424;
                        i61 = i61;
                        i62 = i62;
                        iM56023 = iM56023;
                        listMo6074 = listMo6074;
                        i60 = iM559722 ^ (-799536264);
                    } else {
                        i80 = iMo10470;
                        int iM556817 = (C0873.m55680("֡۬") + i57) * 41;
                        i85 = i85;
                        i67 = i67;
                        i86 = i35;
                        c207615 = c207615;
                        str3 = str3;
                        i83 = i83;
                        enumC31610 = enumC3167;
                        i74 = i74;
                        abstractC94712 = abstractC9478;
                        c3424 = c3424;
                        i61 = i61;
                        i62 = i62;
                        iM56023 = iM56023;
                        listMo6074 = listMo6074;
                        i60 = iM556817 ^ (-1334062428);
                        i59 = ((iM556817 ^ i58) * (-2799)) ^ (-1358178413);
                    }
                    i87 = i87;
                    i69 = i69;
                    i65 = i65;
                    viewOnClickListenerC21365 = viewOnClickListenerC21364;
                    break;
                case -1605760515:
                case -181280475:
                    abstractC94710 = abstractC94712;
                    itM563911 = C1229.m56399(interfaceC20568M46907.mo6069());
                    i68 = i64;
                    int iM556818 = C0873.m55680("ܳ᩵") ^ i57;
                    i37 = ((iM556818 ^ i58) * (-15405)) ^ (-602320521);
                    i85 = i85;
                    arrayList6 = arrayList6;
                    i86 = i86;
                    i80 = i80;
                    c207615 = c207615;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    enumC31610 = enumC31610;
                    i74 = i74;
                    abstractC94712 = abstractC94710;
                    c3424 = c3424;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM56023 = iM56023;
                    i60 = iM556818 ^ (-296108071);
                    i69 = i69;
                    listMo6074 = listMo6074;
                    i59 = i37;
                    viewOnClickListenerC21365 = viewOnClickListenerC21364;
                    break;
                case -1512107952:
                case 1407528161:
                    z19 = false;
                    iM55689 = (C0946.m55979("᩻᩸") + i57) * (-3);
                    i55 = ((iM55689 ^ i58) * 9135) ^ (-1792594002);
                    i56 = -1147978598;
                    i60 = iM55689 ^ i56;
                    i59 = i55;
                    i65 = i65;
                    c20496M25581 = c20496M25581;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case -1507573584:
                case 35554301:
                    i65 = i65;
                    iM56023 = iM56023;
                    i62 = i62;
                    c20496M25581 = c20496M25581;
                    arrayList4 = arrayList4;
                    if ((i76 & 8) != 0) {
                        iM559717 = (i58 - C0946.m55979("֫᩺")) * 95;
                        i52 = ((iM559717 ^ i57) * 32141) ^ 864483373;
                        i53 = -1961250026;
                    } else {
                        iM559717 = C0946.m55979("ۘ᩸") ^ i57;
                        i52 = ((iM559717 ^ i58) * (-11323)) ^ 418794365;
                        i53 = 972075572;
                    }
                    i60 = iM559717 ^ i53;
                    arrayList4 = arrayList4;
                    i59 = i52;
                    i65 = i65;
                    c20496M25581 = c20496M25581;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case -1482887636:
                case -1139711279:
                    abstractC94710 = abstractC94712;
                    i68 = 5;
                    int iM556819 = C0873.m55680("ܳ᩵") ^ i57;
                    i37 = ((iM556819 ^ i58) * (-15405)) ^ (-602320521);
                    i85 = i85;
                    arrayList6 = arrayList6;
                    i86 = i86;
                    i80 = i80;
                    c207615 = c207615;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    enumC31610 = enumC31610;
                    i74 = i74;
                    abstractC94712 = abstractC94710;
                    c3424 = c3424;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM56023 = iM56023;
                    i60 = iM556819 ^ (-296108071);
                    i69 = i69;
                    listMo6074 = listMo6074;
                    i59 = i37;
                    viewOnClickListenerC21365 = viewOnClickListenerC21364;
                    break;
                case -1477703496:
                case -977024863:
                    i65 = i65;
                    iM56023 = iM56023;
                    i61 = i61;
                    i22 = i87;
                    str2 = str3;
                    i62 = i62;
                    i69 = i69;
                    list3 = listMo6074;
                    i23 = i74;
                    i24 = i80;
                    abstractC9479 = abstractC94712;
                    enumC3168 = enumC31610;
                    i25 = i83;
                    i30 = i85;
                    c207610 = c207615;
                    c3422 = c3424;
                    i26 = i86;
                    interfaceC205612 = z5 ? c3422 : interfaceC20568M46907;
                    iM559711 = (C0873.m55680("᩶ۧ") + i58) * 7;
                    i31 = ((iM559711 ^ i57) * (-19315)) ^ 1046650237;
                    i32 = 1936136269;
                    i33 = iM559711 ^ i32;
                    i85 = i30;
                    i86 = i26;
                    i80 = i24;
                    c207615 = c207610;
                    i87 = i22;
                    str3 = str2;
                    i83 = i25;
                    enumC31610 = enumC3168;
                    i74 = i23;
                    abstractC94712 = abstractC9479;
                    c3424 = c3422;
                    i65 = i65;
                    i62 = i62;
                    iM56023 = iM56023;
                    listMo6074 = list3;
                    i60 = i33;
                    i59 = i31;
                    i69 = i69;
                    i61 = i61;
                    viewOnClickListenerC21365 = viewOnClickListenerC21364;
                    break;
                case -1460222950:
                case 827380339:
                    i65 = i65;
                    iM56023 = iM56023;
                    i62 = i62;
                    arrayList4 = arrayList4;
                    i78 = i82;
                    z14 = true;
                    iM559715 = (i57 - C0873.m55680("ܽۘ")) * 51;
                    i46 = ((iM559715 ^ i58) * (-1463)) ^ 1980738730;
                    i47 = -1423214458;
                    i60 = iM559715 ^ i47;
                    arrayList4 = arrayList4;
                    i59 = i46;
                    i65 = i65;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case -1449550509:
                case 1554391293:
                    i65 = i65;
                    iM56023 = iM56023;
                    i62 = i62;
                    StringBuilder sbM21133 = C9179.m21133(str3, strM55852);
                    C0845.m55589(sbM21133, C0877.m55708(atomicInteger3));
                    i61 = i61;
                    c3424.m6063(i63, new C14821(0, c20765.m46910(C0863.m55639(sbM21133)), null, null));
                    c3424.m6063(i63, new C23539(atomicInteger3.getAndIncrement()));
                    iM559714 = C0946.m55979("ۘ᩶") ^ i58;
                    i44 = ((iM559714 ^ i57) * 9005) ^ 1899680214;
                    i45 = -1434786537;
                    i60 = iM559714 ^ i45;
                    i59 = i44;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case -1427397844:
                case 1877871241:
                    i86 = 62902;
                    int iM556820 = C0873.m55680("ܶ۟") ^ i58;
                    i12 = ((iM556820 ^ i57) * (-2635)) ^ 639839296;
                    i14 = iM556820 ^ (-2108108655);
                    arrayList5 = arrayList5;
                    i80 = i80;
                    c207615 = c207615;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    enumC31610 = enumC31610;
                    i74 = i74;
                    i85 = i85;
                    interfaceC20568Mo5857 = interfaceC20568Mo5857;
                    c207613 = c207613;
                    abstractC94712 = abstractC94712;
                    c3424 = c3424;
                    i65 = i65;
                    i62 = i62;
                    iM56023 = iM56023;
                    i60 = i14;
                    i66 = i66;
                    i59 = i12;
                    i69 = i69;
                    listMo6074 = listMo6074;
                    i61 = i61;
                    viewOnClickListenerC21365 = viewOnClickListenerC21364;
                    break;
                case -1395186457:
                case -846691844:
                    i65 = i65;
                    iM56023 = iM56023;
                    i62 = i62;
                    c20496M25581 = c20496M25581;
                    arrayList4 = arrayList4;
                    if (i87 < iM56023) {
                        iM559716 = (C0873.m55680("᩵۠") ^ i57) * (-89);
                        i50 = ((iM559716 ^ i58) * (-13729)) ^ 1534345795;
                        i51 = -672432105;
                    } else {
                        iM559716 = (i58 - C0873.m55680("ۘۖ")) * (-63);
                        i50 = ((iM559716 ^ i57) * 8469) ^ 1009690140;
                        i51 = -1431533392;
                    }
                    i60 = iM559716 ^ i51;
                    arrayList4 = arrayList4;
                    i65 = i65;
                    c20496M25581 = c20496M25581;
                    iM56023 = iM56023;
                    i59 = i50;
                    i62 = i62;
                    break;
                case -1357679102:
                case -137698753:
                    z17 = true;
                    iM559717 = (C0946.m55979("᩹ܽ") + i58) * (-11);
                    i52 = ((iM559717 ^ i57) * (-7513)) ^ 914155572;
                    i53 = -1134140030;
                    i60 = iM559717 ^ i53;
                    arrayList4 = arrayList4;
                    i59 = i52;
                    i65 = i65;
                    c20496M25581 = c20496M25581;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case -1313169686:
                case 502721008:
                    i65 = i65;
                    iM56023 = iM56023;
                    i62 = i62;
                    arrayList4 = arrayList4;
                    if (z10) {
                        iM559715 = (i58 - C0873.m55680("ۨ۬")) * 41;
                        i46 = ((iM559715 ^ i57) * (-8183)) ^ (-486831085);
                        i47 = -693958235;
                    } else {
                        i77 = i78;
                        iM559715 = (C0946.m55979("۟ܺ") ^ i57) * (-13);
                        i46 = ((iM559715 ^ i58) * 2007) ^ (-228918767);
                        i47 = 490317312;
                    }
                    i60 = iM559715 ^ i47;
                    arrayList4 = arrayList4;
                    i59 = i46;
                    i65 = i65;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case -1251497127:
                case 1149678276:
                    i65 = i65;
                    iM56023 = iM56023;
                    i61 = i61;
                    i22 = i87;
                    str2 = str3;
                    i62 = i62;
                    i69 = i69;
                    list3 = listMo6074;
                    i23 = i74;
                    i24 = i80;
                    abstractC9479 = abstractC94712;
                    enumC3168 = enumC31610;
                    i25 = i83;
                    i30 = i85;
                    c207610 = c207615;
                    c3422 = c3424;
                    i26 = i86;
                    if (i30 < C1048.m56303(list3)) {
                        iM559711 = C0946.m55979("۬ܰ") ^ i57;
                        i31 = ((iM559711 ^ i58) * 18367) ^ (-842216046);
                        i32 = -31278161;
                    } else {
                        iM559711 = C0946.m55979("ۡۛ") ^ i58;
                        i31 = ((iM559711 ^ i57) * 23389) ^ 1337447764;
                        i32 = -44287004;
                    }
                    i33 = iM559711 ^ i32;
                    i85 = i30;
                    i86 = i26;
                    i80 = i24;
                    c207615 = c207610;
                    i87 = i22;
                    str3 = str2;
                    i83 = i25;
                    enumC31610 = enumC3168;
                    i74 = i23;
                    abstractC94712 = abstractC9479;
                    c3424 = c3422;
                    i65 = i65;
                    i62 = i62;
                    iM56023 = iM56023;
                    listMo6074 = list3;
                    i60 = i33;
                    i59 = i31;
                    i69 = i69;
                    i61 = i61;
                    viewOnClickListenerC21365 = viewOnClickListenerC21364;
                    break;
                case -1191395845:
                case -658026970:
                    i65 = i65;
                    iM56023 = iM56023;
                    i62 = i62;
                    c20496M25581 = c20496M25581;
                    arrayList4 = arrayList4;
                    if (C0861.m55625(arrayList4) <= 1) {
                        c20496M25581 = c20496M25581;
                        i78 = i63;
                        z14 = z12;
                        iM559715 = (i57 - C0873.m55680("ܽۘ")) * 51;
                        i46 = ((iM559715 ^ i58) * (-1463)) ^ 1980738730;
                        i47 = -1423214458;
                        i60 = iM559715 ^ i47;
                        arrayList4 = arrayList4;
                        i59 = i46;
                        i65 = i65;
                        i62 = i62;
                        iM56023 = iM56023;
                    } else {
                        iM559717 = (C0873.m55680("᩷֡") + i57) * (-35);
                        i52 = ((iM559717 ^ i58) * 4677) ^ (-698961941);
                        i53 = 1373253879;
                        i60 = iM559717 ^ i53;
                        arrayList4 = arrayList4;
                        i59 = i52;
                        i65 = i65;
                        c20496M25581 = c20496M25581;
                        i62 = i62;
                        iM56023 = iM56023;
                    }
                    break;
                case -1145768681:
                case -752222470:
                    i65 = i65;
                    iM56023 = iM56023;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    listMo6074 = listMo6074;
                    i74 = i74;
                    i80 = i80;
                    abstractC9476 = abstractC94712;
                    enumC3167 = enumC31610;
                    i83 = i83;
                    i85 = i85;
                    c207615 = c207615;
                    if (!z21) {
                        i69 = i69;
                        list = listMo6074;
                        abstractC9479 = abstractC9476;
                        c3422 = c3424;
                        c20766 = c207615;
                        c20767 = c207613;
                        c20768 = c207619;
                        arrayList = arrayList6;
                        interfaceC20568 = interfaceC205612;
                        i4 = i86;
                        interfaceC205613 = interfaceC20568;
                        c207618 = c20766;
                        str4 = str5;
                        c207614 = c20768;
                        z4 = z21;
                        iM559710 = C0873.m55680("۬ۜ") ^ i57;
                        i59 = ((iM559710 ^ i58) * (-20423)) ^ (-168211287);
                        i29 = 836023951;
                        i28 = iM559710 ^ i29;
                        i85 = i85;
                        arrayList6 = arrayList;
                        i86 = i4;
                        i80 = i80;
                        c207615 = c207615;
                        i87 = i87;
                        str3 = str3;
                        i83 = i83;
                        enumC31610 = enumC3167;
                        i74 = i74;
                        c207613 = c20767;
                        abstractC94712 = abstractC9479;
                        c3424 = c3422;
                        i65 = i65;
                        i61 = i61;
                        i62 = i62;
                        iM56023 = iM56023;
                        i60 = i28;
                        i69 = i69;
                        listMo6074 = list;
                        viewOnClickListenerC21365 = viewOnClickListenerC21364;
                    } else {
                        iM55681 = (i57 - C0873.m55680("᩻֨")) * (-73);
                        i2 = ((iM55681 ^ i58) * (-7493)) ^ (-538095810);
                        i5 = -1703082180;
                        i6 = iM55681 ^ i5;
                        listMo6074 = listMo6074;
                        i85 = i85;
                        abstractC94712 = abstractC9476;
                        i80 = i80;
                        c207615 = c207615;
                        str3 = str3;
                        i83 = i83;
                        enumC31610 = enumC3167;
                        i74 = i74;
                        i61 = i61;
                        i62 = i62;
                        iM56023 = iM56023;
                        viewOnClickListenerC21365 = viewOnClickListenerC21364;
                        i60 = i6;
                        i59 = i2;
                        i87 = i87;
                        i65 = i65;
                    }
                    break;
                case -1135461297:
                case -103044342:
                    z16 = true;
                    iM559716 = C0946.m55979("ܳ᩷") ^ i58;
                    i50 = ((iM559716 ^ i57) * 28363) ^ 1467902802;
                    i51 = -883865114;
                    i60 = iM559716 ^ i51;
                    arrayList4 = arrayList4;
                    i65 = i65;
                    c20496M25581 = c20496M25581;
                    iM56023 = iM56023;
                    i59 = i50;
                    i62 = i62;
                    break;
                case -1131214743:
                case 2129154053:
                    i65 = i65;
                    iM56023 = iM56023;
                    i61 = i61;
                    i62 = i62;
                    i75 = i63 + 1;
                    if (atomicInteger3 != null) {
                        iM559714 = (C0946.m55979("᩷ܺ") ^ i58) * 57;
                        i44 = ((iM559714 ^ i57) * 7545) ^ 299858750;
                        i45 = -1684800594;
                    } else {
                        iM559714 = C0946.m55979("ۘ᩶") ^ i58;
                        i44 = ((iM559714 ^ i57) * 9005) ^ 1899680214;
                        i45 = -1434786537;
                    }
                    i60 = iM559714 ^ i45;
                    i59 = i44;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case -1115389247:
                case 1989516726:
                    i65 = i65;
                    int i94 = iM56023;
                    i62 = i62;
                    arrayList4 = arrayList4;
                    iM56023 = i94;
                    i77 = i78 + i79;
                    iM559715 = (C0946.m55979("۟ܺ") ^ i57) * (-13);
                    i46 = ((iM559715 ^ i58) * 2007) ^ (-228918767);
                    i47 = 490317312;
                    i60 = iM559715 ^ i47;
                    arrayList4 = arrayList4;
                    i59 = i46;
                    i65 = i65;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case -1107513946:
                case 742682783:
                    z18 = true;
                    iM55689 = C0873.m55680("֫ۗ") ^ i58;
                    i55 = ((iM55689 ^ i57) * 22871) ^ 270704586;
                    i56 = -1344192294;
                    i60 = iM55689 ^ i56;
                    i59 = i55;
                    i65 = i65;
                    c20496M25581 = c20496M25581;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case -1092338360:
                case -255138609:
                    i65 = i65;
                    iM56023 = iM56023;
                    i62 = i62;
                    i61 = i61;
                    i72 = i75;
                    z9 = true;
                    iM559714 = C0946.m55979("᩺᩺") ^ i57;
                    i44 = ((iM559714 ^ i58) * (-29725)) ^ (-1295643270);
                    i45 = -933853601;
                    i60 = iM559714 ^ i45;
                    i59 = i44;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case -1068716796:
                case 677925079:
                    i65 = i65;
                    iM56023 = iM56023;
                    i61 = i61;
                    i62 = i62;
                    c2 = 2;
                    if (z10) {
                        iM559714 = C0946.m55979("᩷ۚ") ^ i57;
                        i44 = ((iM559714 ^ i58) * 25805) ^ 1051327871;
                        i45 = -1697399427;
                    } else {
                        iM559714 = (C0873.m55680("۬֨") + i57) * 91;
                        i44 = ((iM559714 ^ i58) * 27163) ^ (-518152232);
                        i45 = -1402680969;
                    }
                    i60 = iM559714 ^ i45;
                    i59 = i44;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case -1064286013:
                case 1488254158:
                    z10 = true;
                    iM559714 = (C0873.m55680("ܽ֡") + i57) * C0254q.f1218h;
                    i44 = ((iM559714 ^ i58) * (-4855)) ^ (-1531509872);
                    i45 = -1493783127;
                    i60 = iM559714 ^ i45;
                    i59 = i44;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case -1054491188:
                case 186730390:
                    arrayList4 = arrayList4;
                    itM56292 = C1046.m56292(arrayList4);
                    i61 = i63;
                    iM559717 = (i57 - C0873.m55680("᩺ۖ")) * (-127);
                    i52 = ((iM559717 ^ i58) * (-9241)) ^ (-1314425715);
                    i53 = -1373483370;
                    i60 = iM559717 ^ i53;
                    arrayList4 = arrayList4;
                    i59 = i52;
                    i65 = i65;
                    c20496M25581 = c20496M25581;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case -1034887595:
                case -18370820:
                    i65 = i65;
                    iM56023 = iM56023;
                    i61 = i61;
                    i62 = i62;
                    z2 = true;
                    i87 = i87;
                    str3 = str3;
                    i67 = i67;
                    i69 = i69;
                    listMo6074 = listMo6074;
                    i38 = i73;
                    i74 = i74;
                    i80 = i80;
                    enumC3167 = enumC31610;
                    i85 = i85;
                    c207615 = c207615;
                    c3424 = c3424;
                    i34 = i86;
                    z7 = z2;
                    c207617 = c207615;
                    i70 = i38;
                    c207616 = c207619;
                    z6 = z8;
                    int iM5597110 = (C0946.m55979("ۢ᩶") ^ i58) * 77;
                    i67 = i67;
                    i85 = i85;
                    i86 = i34;
                    i80 = i80;
                    c207615 = c207615;
                    i87 = i87;
                    str3 = str3;
                    enumC31610 = enumC3167;
                    i74 = i74;
                    i69 = i69;
                    c3424 = c3424;
                    i65 = i65;
                    i62 = i62;
                    iM56023 = iM56023;
                    listMo6074 = listMo6074;
                    i60 = iM5597110 ^ 1351575578;
                    i59 = ((iM5597110 ^ i57) * 15081) ^ 1495919302;
                    i61 = i61;
                    viewOnClickListenerC21365 = viewOnClickListenerC21364;
                    break;
                case -1001616134:
                case 184607750:
                    ((C5073) C0955.m56035(itM56292)).m10802(c207620, c3424, i61);
                    i61++;
                    arrayList4 = arrayList4;
                    iM559717 = (i57 - C0873.m55680("᩺ۖ")) * (-127);
                    i52 = ((iM559717 ^ i58) * (-9241)) ^ (-1314425715);
                    i53 = -1373483370;
                    i60 = iM559717 ^ i53;
                    arrayList4 = arrayList4;
                    i59 = i52;
                    i65 = i65;
                    c20496M25581 = c20496M25581;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case -984372718:
                case 2129280376:
                    i19 = i86;
                    C1194.m56393(arrayList6, c207618.m46901(interfaceC19897.mo5853(), C0930.m55894(interfaceC19897), interfaceC19897.getParameters(), interfaceC19897.mo5855(), interfaceC19897.mo5854(), interfaceC19897.getAnnotations(), interfaceC19897.mo5856(), interfaceC205613));
                    list2 = listMo6074;
                    str = str3;
                    i20 = i66;
                    z21 = z4;
                    str5 = str4;
                    i21 = i85;
                    c20769 = c207614;
                    int iM556821 = (C0873.m55680("۟ۙ") + i58) * (-67);
                    i60 = iM556821 ^ (-601644503);
                    i86 = i19;
                    i85 = i21;
                    str3 = str;
                    i66 = i20;
                    c207613 = c20769;
                    i59 = ((iM556821 ^ i57) * 15187) ^ 1931968309;
                    listMo6074 = list2;
                    iM56023 = iM56023;
                    viewOnClickListenerC21365 = viewOnClickListenerC21364;
                    break;
                case -967370013:
                case 1066687222:
                    z10 = false;
                    iM559714 = (C0873.m55680("ܽ֡") + i57) * C0254q.f1218h;
                    i44 = ((iM559714 ^ i58) * (-4855)) ^ (-1531509872);
                    i45 = -1493783127;
                    i60 = iM559714 ^ i45;
                    i59 = i44;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case -951545206:
                case 349013551:
                    z20 = false;
                    int iM5597111 = C0946.m55979("֨ۡ") ^ i58;
                    i65 = i65;
                    i59 = ((iM5597111 ^ i57) * (-7807)) ^ 1157149780;
                    i60 = iM5597111 ^ 826104866;
                    i65 = i65;
                    break;
                case -896497652:
                case -494017804:
                    i65 = i65;
                    iM56023 = iM56023;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i80 = i80;
                    enumC31610 = enumC31610;
                    i83 = i83;
                    i85 = i85;
                    c207615 = c207615;
                    if (i80 == 9) {
                        enumC3167 = enumC31610;
                        i80 = i80;
                        i69 = i69;
                        listMo6074 = listMo6074;
                        i74 = i74;
                        abstractC9478 = abstractC94712;
                        i35 = i86;
                        int iM5568110 = (C0873.m55680("֡۬") + i57) * 41;
                        i85 = i85;
                        i67 = i67;
                        i86 = i35;
                        c207615 = c207615;
                        str3 = str3;
                        i83 = i83;
                        enumC31610 = enumC3167;
                        i74 = i74;
                        abstractC94712 = abstractC9478;
                        c3424 = c3424;
                        i61 = i61;
                        i62 = i62;
                        iM56023 = iM56023;
                        listMo6074 = listMo6074;
                        i60 = iM5568110 ^ (-1334062428);
                        i59 = ((iM5568110 ^ i58) * (-2799)) ^ (-1358178413);
                        i87 = i87;
                        i69 = i69;
                        i65 = i65;
                        viewOnClickListenerC21365 = viewOnClickListenerC21364;
                    } else {
                        iM55682 = (C0873.m55680("ܳۧ") ^ i57) * 25;
                        i7 = ((iM55682 ^ i58) * (-5669)) ^ (-1625098662);
                        i8 = -1712781111;
                        i85 = i85;
                        enumC31610 = enumC31610;
                        i80 = i80;
                        c207615 = c207615;
                        i87 = i87;
                        str3 = str3;
                        i83 = i83;
                        i65 = i65;
                        i62 = i62;
                        iM56023 = iM56023;
                        i60 = iM55682 ^ i8;
                        i59 = i7;
                        i61 = i61;
                    }
                    break;
                case -877011989:
                case 739660025:
                    i65 = i65;
                    int iM55625 = i61 - C0861.m55625(arrayList4);
                    c20496M25581 = c20496M25581;
                    StringBuilder sbM21134 = C9179.m21133(str3, strM55852);
                    i62 = i62;
                    C0845.m55589(sbM21134, C0949.m56004(atomicInteger3));
                    iM56023 = iM56023;
                    c3424.m6063(iM55625, new C14821(0, c207620.m46910(C0863.m55639(sbM21134)), null, null));
                    c3424.m6063(i61 - C1012.m56137(arrayList4), new C23539(atomicInteger3.getAndIncrement()));
                    arrayList4 = arrayList4;
                    i82 = i84;
                    iM559717 = (C0873.m55680("ۗ᩷") + i58) * 7;
                    i52 = ((iM559717 ^ i57) * 24049) ^ (-1740939906);
                    i53 = -768879504;
                    i60 = iM559717 ^ i53;
                    arrayList4 = arrayList4;
                    i59 = i52;
                    i65 = i65;
                    c20496M25581 = c20496M25581;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case -856982132:
                case 1989669372:
                    i65 = i65;
                    iM56023 = iM56023;
                    i62 = i62;
                    arrayList4 = arrayList4;
                    if ((c20496M25581.f63293 & 1) != 0) {
                        iM559715 = (C0873.m55680("ܰܶ") ^ i58) * (-65);
                        i46 = ((iM559715 ^ i57) * (-27229)) ^ (-960557531);
                        i47 = 535269252;
                    } else {
                        iM559715 = (i57 - C0873.m55680("۟ۢ")) * 41;
                        i46 = ((iM559715 ^ i58) * (-17545)) ^ 949165130;
                        i47 = -976671078;
                    }
                    i60 = iM559715 ^ i47;
                    arrayList4 = arrayList4;
                    i59 = i46;
                    i65 = i65;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case -855696284:
                case 696636104:
                    i79 = 1;
                    iM559716 = C0873.m55680("ᩴۚ") ^ i57;
                    i50 = ((iM559716 ^ i58) * (-14283)) ^ 1732658310;
                    i51 = 1224767946;
                    i60 = iM559716 ^ i51;
                    arrayList4 = arrayList4;
                    i65 = i65;
                    c20496M25581 = c20496M25581;
                    iM56023 = iM56023;
                    i59 = i50;
                    i62 = i62;
                    break;
                case -792407981:
                case 1351738679:
                    i65 = i65;
                    iM56023 = iM56023;
                    i62 = i62;
                    c20496M25581 = c20496M25581;
                    arrayList4 = arrayList4;
                    if (interfaceC40510 != null) {
                        iM559716 = (i58 - C0946.m55979("᩹֫")) * (-103);
                        i50 = ((iM559716 ^ i57) * (-11043)) ^ (-1027756601);
                        i51 = -1344035860;
                    } else {
                        iM559716 = C0946.m55979("᩶ᩴ") ^ i57;
                        i50 = ((iM559716 ^ i58) * 13965) ^ 442996541;
                        i51 = 947622711;
                    }
                    i60 = iM559716 ^ i51;
                    arrayList4 = arrayList4;
                    i65 = i65;
                    c20496M25581 = c20496M25581;
                    iM56023 = iM56023;
                    i59 = i50;
                    i62 = i62;
                    break;
                case -767668374:
                case 707741213:
                    i65 = i65;
                    iM56023 = iM56023;
                    i62 = i62;
                    c20496M25581 = c20496M25581;
                    arrayList4 = arrayList4;
                    if (zArr[i87]) {
                        iM559717 = (C0946.m55979("᩹ܶ") + i57) * 17;
                        i52 = ((iM559717 ^ i58) * (-26031)) ^ (-231806793);
                        i53 = 1565381753;
                    } else {
                        iM559717 = C0873.m55680("ۢܽ") ^ i58;
                        i52 = ((iM559717 ^ i57) * (-15883)) ^ (-498588589);
                        i53 = -1209738993;
                    }
                    i60 = iM559717 ^ i53;
                    arrayList4 = arrayList4;
                    i59 = i52;
                    i65 = i65;
                    c20496M25581 = c20496M25581;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case -713080983:
                case 377439216:
                    i85 = i70 + 1;
                    enumC3169 = enumC31610;
                    c3423 = c3424;
                    interfaceC205611 = interfaceC20568M46907;
                    z8 = z6;
                    c207619 = c207616;
                    c207615 = c207617;
                    z5 = z7;
                    c3 = 5;
                    int iM556822 = C0873.m55680("ۛܽ") ^ i58;
                    interfaceC20568M46907 = interfaceC205611;
                    arrayList6 = arrayList6;
                    i86 = i86;
                    i80 = i80;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    enumC31610 = enumC3169;
                    i74 = i74;
                    abstractC94712 = abstractC94712;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM56023 = iM56023;
                    i60 = iM556822 ^ (-271081507);
                    c3424 = c3423;
                    i59 = ((iM556822 ^ i57) * 26915) ^ 883918790;
                    i69 = i69;
                    viewOnClickListenerC21365 = viewOnClickListenerC21364;
                    break;
                case -664636067:
                case -625542568:
                    int i95 = iM56023;
                    i61 = i61;
                    int i96 = i87;
                    String str6 = str3;
                    int i97 = i62;
                    ArrayList arrayList7 = arrayList5;
                    C20765 c207623 = c207613;
                    InterfaceC20568 interfaceC205615 = interfaceC20568Mo5857;
                    int i98 = i69;
                    List list4 = listMo6074;
                    int i99 = i74;
                    int i100 = i80;
                    AbstractC9476 abstractC94714 = abstractC94712;
                    EnumC3167 enumC31612 = enumC31610;
                    int i101 = i83;
                    int i102 = i85;
                    C20765 c207624 = c207615;
                    C3422 c3425 = c3424;
                    int i103 = i86;
                    if (z) {
                        iM55685 = (i57 - C0873.m55680("۟ۡ")) * (-45);
                        i15 = ((iM55685 ^ i58) * (-3397)) ^ 163054767;
                        i16 = -236692479;
                    } else {
                        iM55685 = (i58 - C0873.m55680("ۨ֨")) * (-125);
                        i15 = ((iM55685 ^ i57) * 10393) ^ (-424876991);
                        i16 = 1295136303;
                    }
                    int i104 = iM55685 ^ i16;
                    viewOnClickListenerC21365 = viewOnClickListenerC21364;
                    arrayList5 = arrayList7;
                    i86 = i103;
                    i80 = i100;
                    c207615 = c207624;
                    i87 = i96;
                    str3 = str6;
                    i83 = i101;
                    enumC31610 = enumC31612;
                    i74 = i99;
                    i85 = i102;
                    interfaceC20568Mo5857 = interfaceC205615;
                    c207613 = c207623;
                    abstractC94712 = abstractC94714;
                    c3424 = c3425;
                    i65 = i65;
                    i62 = i97;
                    iM56023 = i95;
                    i66 = 1;
                    i60 = i104;
                    i59 = i15;
                    i69 = i98;
                    listMo6074 = list4;
                    i61 = i61;
                    break;
                case -655828546:
                case 958099156:
                    arrayList5 = new ArrayList();
                    arrayList6 = new ArrayList();
                    strMo5033 = c9952.mo5033();
                    itM56399 = C1229.m56399(c9952.getFields());
                    iM55686 = (i57 - C0873.m55680("᩶᩵")) * (-47);
                    i17 = ((iM55686 ^ i58) * 6243) ^ 337772467;
                    i18 = -371733746;
                    i86 = i86;
                    str3 = str3;
                    i85 = i85;
                    c207613 = c207613;
                    i60 = iM55686 ^ i18;
                    i66 = i66;
                    i59 = i17;
                    listMo6074 = listMo6074;
                    iM56023 = iM56023;
                    viewOnClickListenerC21365 = viewOnClickListenerC21364;
                    break;
                case -648213942:
                case -559866806:
                    i65 = i65;
                    iM56023 = iM56023;
                    i61 = i61;
                    i22 = i87;
                    str2 = str3;
                    i62 = i62;
                    i69 = i69;
                    list3 = listMo6074;
                    i23 = i74;
                    i24 = i80;
                    enumC3168 = enumC31610;
                    i25 = i83;
                    i30 = i85;
                    c207610 = c207615;
                    boolean z22 = c20496M25581.f63288;
                    abstractC9479 = abstractC94712;
                    c3422 = c3424;
                    i26 = i86;
                    strM55852 = C0917.m55852(f82967, 307, 1, i26);
                    if (z22) {
                        iM559712 = C0946.m55979("᩵۟") ^ i57;
                        i31 = ((iM559712 ^ i58) * (-18791)) ^ 1481260396;
                        i36 = -1593219642;
                    } else {
                        iM559712 = C0946.m55979("ۘۡ") ^ i57;
                        i31 = ((iM559712 ^ i58) * 15057) ^ 1324921185;
                        i36 = -566192997;
                    }
                    i33 = iM559712 ^ i36;
                    i85 = i30;
                    i86 = i26;
                    i80 = i24;
                    c207615 = c207610;
                    i87 = i22;
                    str3 = str2;
                    i83 = i25;
                    enumC31610 = enumC3168;
                    i74 = i23;
                    abstractC94712 = abstractC9479;
                    c3424 = c3422;
                    i65 = i65;
                    i62 = i62;
                    iM56023 = iM56023;
                    listMo6074 = list3;
                    i60 = i33;
                    i59 = i31;
                    i69 = i69;
                    i61 = i61;
                    viewOnClickListenerC21365 = viewOnClickListenerC21364;
                    break;
                case -599235940:
                case 752922528:
                    i65 = i65;
                    iM56023 = iM56023;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i80 = i80;
                    i83 = i83;
                    i85 = i85;
                    c207615 = c207615;
                    C0937.m55920(atomicInteger);
                    enumC3167 = enumC31610;
                    c207618 = c207615;
                    str4 = str3;
                    c20767 = c207613;
                    c207614 = c207619;
                    arrayList = arrayList6;
                    interfaceC205613 = interfaceC205612;
                    i69 = i69;
                    list = listMo6074;
                    i74 = i74;
                    abstractC9479 = abstractC94712;
                    z4 = false;
                    c3422 = c3424;
                    i4 = i86;
                    iM559710 = C0873.m55680("۬ۜ") ^ i57;
                    i59 = ((iM559710 ^ i58) * (-20423)) ^ (-168211287);
                    i29 = 836023951;
                    i28 = iM559710 ^ i29;
                    i85 = i85;
                    arrayList6 = arrayList;
                    i86 = i4;
                    i80 = i80;
                    c207615 = c207615;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    enumC31610 = enumC3167;
                    i74 = i74;
                    c207613 = c20767;
                    abstractC94712 = abstractC9479;
                    c3424 = c3422;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM56023 = iM56023;
                    i60 = i28;
                    i69 = i69;
                    listMo6074 = list;
                    viewOnClickListenerC21365 = viewOnClickListenerC21364;
                    break;
                case -487540539:
                case 1274234931:
                    i86 = 15419;
                    int iM556823 = C0873.m55680("ܶ۟") ^ i58;
                    i12 = ((iM556823 ^ i57) * (-2635)) ^ 639839296;
                    i14 = iM556823 ^ (-2108108655);
                    arrayList5 = arrayList5;
                    i80 = i80;
                    c207615 = c207615;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    enumC31610 = enumC31610;
                    i74 = i74;
                    i85 = i85;
                    interfaceC20568Mo5857 = interfaceC20568Mo5857;
                    c207613 = c207613;
                    abstractC94712 = abstractC94712;
                    c3424 = c3424;
                    i65 = i65;
                    i62 = i62;
                    iM56023 = iM56023;
                    i60 = i14;
                    i66 = i66;
                    i59 = i12;
                    i69 = i69;
                    listMo6074 = listMo6074;
                    i61 = i61;
                    viewOnClickListenerC21365 = viewOnClickListenerC21364;
                    break;
                case -469404830:
                case 1427284425:
                    i65 = i65;
                    iM56023 = iM56023;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i80 = i80;
                    enumC31610 = enumC31610;
                    i83 = i83;
                    i85 = i85;
                    c207615 = c207615;
                    if (enumC31610 == EnumC3167.f5849) {
                        enumC31610 = enumC31610;
                        abstractC9476 = abstractC94712;
                        int iM559723 = (C0946.m55979("ܺܰ") + i57) * 77;
                        i2 = ((iM559723 ^ i58) * (-25987)) ^ 742959828;
                        i6 = iM559723 ^ (-731038336);
                        listMo6074 = listMo6074;
                        i85 = i85;
                        abstractC94712 = abstractC9476;
                        i80 = i80;
                        c207615 = c207615;
                        str3 = str3;
                        i83 = i83;
                        i74 = i74;
                        i61 = i61;
                        i62 = i62;
                        iM56023 = iM56023;
                        viewOnClickListenerC21365 = viewOnClickListenerC21364;
                        i60 = i6;
                        i59 = i2;
                        i87 = i87;
                        i65 = i65;
                    } else {
                        iM55682 = (i57 - C0873.m55680("ܿ۬")) * (-43);
                        i7 = ((iM55682 ^ i58) * (-4207)) ^ 526724948;
                        i8 = 109130622;
                        i85 = i85;
                        enumC31610 = enumC31610;
                        i80 = i80;
                        c207615 = c207615;
                        i87 = i87;
                        str3 = str3;
                        i83 = i83;
                        i65 = i65;
                        i62 = i62;
                        iM56023 = iM56023;
                        i60 = iM55682 ^ i8;
                        i59 = i7;
                        i61 = i61;
                    }
                    break;
                case -466350923:
                case 710058449:
                    enumC3169 = enumC31610;
                    interfaceC205611 = interfaceC20568M46907;
                    c3423 = new C3422(interfaceC205611);
                    listMo6074 = c3423.mo6074();
                    c207619 = c207613;
                    c207615 = c207619;
                    c = 3;
                    z5 = false;
                    z8 = true;
                    c3 = 5;
                    i85 = 0;
                    int iM556824 = C0873.m55680("ۛܽ") ^ i58;
                    interfaceC20568M46907 = interfaceC205611;
                    arrayList6 = arrayList6;
                    i86 = i86;
                    i80 = i80;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    enumC31610 = enumC3169;
                    i74 = i74;
                    abstractC94712 = abstractC94712;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM56023 = iM56023;
                    i60 = iM556824 ^ (-271081507);
                    c3424 = c3423;
                    i59 = ((iM556824 ^ i57) * 26915) ^ 883918790;
                    i69 = i69;
                    viewOnClickListenerC21365 = viewOnClickListenerC21364;
                    break;
                case -457429672:
                case -287821790:
                    i65 = i65;
                    iM56023 = iM56023;
                    i62 = i62;
                    arrayList4 = new ArrayList();
                    c4 = 4;
                    if (z10) {
                        iM55688 = C0946.m55979("ۙۢ") ^ i57;
                        i48 = ((iM55688 ^ i58) * (-25831)) ^ (-578384291);
                        i49 = -712132740;
                    } else {
                        iM55688 = C0873.m55680("ܳۡ") ^ i58;
                        i48 = ((iM55688 ^ i57) * WhirlpoolDigest.REDUCTION_POLYNOMIAL) ^ 1315361729;
                        i49 = 740817076;
                    }
                    i60 = iM55688 ^ i49;
                    i59 = i48;
                    i65 = i65;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case -438214037:
                case -226946688:
                    i65 = i65;
                    iM56023 = iM56023;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i66 = i66;
                    arrayList2 = arrayList5;
                    c207613 = c207613;
                    interfaceC20568Mo5857 = interfaceC20568Mo5857;
                    i69 = i69;
                    listMo6074 = listMo6074;
                    i74 = i74;
                    i80 = i80;
                    abstractC94712 = abstractC94712;
                    enumC31610 = enumC31610;
                    i83 = i83;
                    i85 = i85;
                    c207615 = c207615;
                    c3424 = c3424;
                    i11 = i86;
                    if (C0866.m55647(itM56399)) {
                        iM55684 = C0873.m55680("ᩴܽ") ^ i57;
                        i12 = ((iM55684 ^ i58) * 11003) ^ (-2064176611);
                        i13 = -1383654501;
                    } else {
                        iM55684 = C0873.m55680("ۙۨ") ^ i58;
                        i12 = ((iM55684 ^ i57) * 26297) ^ 815237985;
                        i13 = -2147037647;
                    }
                    i14 = iM55684 ^ i13;
                    arrayList5 = arrayList2;
                    i86 = i11;
                    i80 = i80;
                    c207615 = c207615;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    enumC31610 = enumC31610;
                    i74 = i74;
                    i85 = i85;
                    interfaceC20568Mo5857 = interfaceC20568Mo5857;
                    c207613 = c207613;
                    abstractC94712 = abstractC94712;
                    c3424 = c3424;
                    i65 = i65;
                    i62 = i62;
                    iM56023 = iM56023;
                    i60 = i14;
                    i66 = i66;
                    i59 = i12;
                    i69 = i69;
                    listMo6074 = listMo6074;
                    i61 = i61;
                    viewOnClickListenerC21365 = viewOnClickListenerC21364;
                    break;
                case -436890369:
                case -426507675:
                    list2 = listMo6074;
                    i19 = i86;
                    i20 = i66;
                    Object[] objArr = new Object[i20];
                    objArr[0] = C1003.m56129(C0877.m55708(atomicInteger));
                    i21 = i85;
                    str = String.format(C0930.m55893(f82967, 298, 9, i19), objArr);
                    z21 = z;
                    itM563910 = C1229.m56399(c9952.getMethods());
                    c20769 = c20765;
                    str5 = strMo5033;
                    int iM556825 = (C0873.m55680("۟ۙ") + i58) * (-67);
                    i60 = iM556825 ^ (-601644503);
                    i86 = i19;
                    i85 = i21;
                    str3 = str;
                    i66 = i20;
                    c207613 = c20769;
                    i59 = ((iM556825 ^ i57) * 15187) ^ 1931968309;
                    listMo6074 = list2;
                    iM56023 = iM56023;
                    viewOnClickListenerC21365 = viewOnClickListenerC21364;
                    break;
                case -425055932:
                case 246072774:
                    z13 = true;
                    iM559716 = (C0946.m55979("ۤۧ") ^ i57) * (-53);
                    i50 = ((iM559716 ^ i58) * 20747) ^ 1834771307;
                    i51 = -1878342823;
                    i60 = iM559716 ^ i51;
                    arrayList4 = arrayList4;
                    i65 = i65;
                    c20496M25581 = c20496M25581;
                    iM56023 = iM56023;
                    i59 = i50;
                    i62 = i62;
                    break;
                case -358666820:
                case 1016997807:
                    i65 = i65;
                    iM56023 = iM56023;
                    i62 = i62;
                    c20496M25581 = c20496M25581;
                    arrayList4 = arrayList4;
                    if ((i76 & 2) != 0) {
                        iM559716 = C0873.m55680("ۨ᩻") ^ i57;
                        i50 = ((iM559716 ^ i58) * (-27123)) ^ (-212168803);
                        i51 = 1221922097;
                    } else {
                        iM559716 = C0873.m55680("ۛۜ") ^ i58;
                        i50 = ((iM559716 ^ i57) * (-19231)) ^ 1063217899;
                        i51 = -1335125535;
                    }
                    i60 = iM559716 ^ i51;
                    arrayList4 = arrayList4;
                    i65 = i65;
                    c20496M25581 = c20496M25581;
                    iM56023 = iM56023;
                    i59 = i50;
                    i62 = i62;
                    break;
                case -354701882:
                case 1471400359:
                    z16 = false;
                    iM559716 = C0946.m55979("ܳ᩷") ^ i58;
                    i50 = ((iM559716 ^ i57) * 28363) ^ 1467902802;
                    i51 = -883865114;
                    i60 = iM559716 ^ i51;
                    arrayList4 = arrayList4;
                    i65 = i65;
                    c20496M25581 = c20496M25581;
                    iM56023 = iM56023;
                    i59 = i50;
                    i62 = i62;
                    break;
                case -338140514:
                case 1359395788:
                    i65 = i65;
                    iM56023 = iM56023;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i85 = i85;
                    c207615 = c207615;
                    EnumC3167 enumC31613 = enumC31610;
                    i83 = i83;
                    if (enumC31613 != EnumC3167.f5964) {
                        enumC3167 = enumC31613;
                        i69 = i69;
                        listMo6074 = listMo6074;
                        i80 = i80;
                        abstractC9476 = abstractC94712;
                        int iM5568111 = C0873.m55680("ᩴܰ") ^ i58;
                        i2 = ((iM5568111 ^ i57) * 1667) ^ (-537189048);
                        i6 = iM5568111 ^ 1121533382;
                        listMo6074 = listMo6074;
                        i85 = i85;
                        abstractC94712 = abstractC9476;
                        i80 = i80;
                        c207615 = c207615;
                        str3 = str3;
                        i83 = i83;
                        enumC31610 = enumC3167;
                        i69 = i69;
                        i61 = i61;
                        i62 = i62;
                        iM56023 = iM56023;
                        viewOnClickListenerC21365 = viewOnClickListenerC21364;
                        i60 = i6;
                        i59 = i2;
                        i87 = i87;
                        i65 = i65;
                    } else {
                        enumC31610 = enumC31613;
                        i80 = i80;
                        abstractC9476 = abstractC94712;
                        int iM559724 = (C0946.m55979("ܺܰ") + i57) * 77;
                        i2 = ((iM559724 ^ i58) * (-25987)) ^ 742959828;
                        i6 = iM559724 ^ (-731038336);
                        listMo6074 = listMo6074;
                        i85 = i85;
                        abstractC94712 = abstractC9476;
                        i80 = i80;
                        c207615 = c207615;
                        str3 = str3;
                        i83 = i83;
                        i74 = i74;
                        i61 = i61;
                        i62 = i62;
                        iM56023 = iM56023;
                        viewOnClickListenerC21365 = viewOnClickListenerC21364;
                        i60 = i6;
                        i59 = i2;
                        i87 = i87;
                        i65 = i65;
                    }
                    break;
                case -330041088:
                case -208812274:
                    z13 = false;
                    iM559716 = (C0946.m55979("ۤۧ") ^ i57) * (-53);
                    i50 = ((iM559716 ^ i58) * 20747) ^ 1834771307;
                    i51 = -1878342823;
                    i60 = iM559716 ^ i51;
                    arrayList4 = arrayList4;
                    i65 = i65;
                    c20496M25581 = c20496M25581;
                    iM56023 = iM56023;
                    i59 = i50;
                    i62 = i62;
                    break;
                case -314640651:
                case 1060536610:
                    i65 = i65;
                    iM56023 = iM56023;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    c20767 = c207613;
                    arrayList = arrayList6;
                    i69 = i69;
                    list = listMo6074;
                    i74 = i74;
                    i80 = i80;
                    abstractC9479 = abstractC94712;
                    enumC3167 = enumC31610;
                    i83 = i83;
                    i85 = i85;
                    c207615 = c207615;
                    c3422 = c3424;
                    i4 = i86;
                    interfaceC19897 = (InterfaceC19897) C0955.m56035(itM563910);
                    interfaceC20568Mo5857 = interfaceC19897.mo5857();
                    if (interfaceC20568Mo5857 != null) {
                        iM559710 = C0946.m55979("᩹ۖ") ^ i57;
                        i59 = ((iM559710 ^ i58) * 14913) ^ (-968758244);
                        i29 = 2125072391;
                    } else {
                        c20766 = c20767;
                        c20768 = c20766;
                        interfaceC20568 = interfaceC20568Mo5857;
                        interfaceC205613 = interfaceC20568;
                        c207618 = c20766;
                        str4 = str5;
                        c207614 = c20768;
                        z4 = z21;
                        iM559710 = C0873.m55680("۬ۜ") ^ i57;
                        i59 = ((iM559710 ^ i58) * (-20423)) ^ (-168211287);
                        i29 = 836023951;
                    }
                    i28 = iM559710 ^ i29;
                    i85 = i85;
                    arrayList6 = arrayList;
                    i86 = i4;
                    i80 = i80;
                    c207615 = c207615;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    enumC31610 = enumC3167;
                    i74 = i74;
                    c207613 = c20767;
                    abstractC94712 = abstractC9479;
                    c3424 = c3422;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM56023 = iM56023;
                    i60 = i28;
                    i69 = i69;
                    listMo6074 = list;
                    viewOnClickListenerC21365 = viewOnClickListenerC21364;
                    break;
                case -313201966:
                case -101959311:
                    iM56023 = iM56023;
                    i87++;
                    iM559717 = (C0873.m55680("ۡ᩹") ^ i57) * (-55);
                    i52 = ((iM559717 ^ i58) * 26191) ^ (-476967314);
                    i53 = -1149400511;
                    i60 = iM559717 ^ i53;
                    arrayList4 = arrayList4;
                    i59 = i52;
                    i65 = i65;
                    c20496M25581 = c20496M25581;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case -309244901:
                case -181124675:
                    i66 = i66;
                    atomicInteger2 = null;
                    atomicInteger3 = atomicInteger2;
                    iM55686 = C0946.m55979("ۘܽ") ^ i57;
                    i17 = ((iM55686 ^ i58) * 11323) ^ (-968582944);
                    i18 = 303241453;
                    i86 = i86;
                    str3 = str3;
                    i85 = i85;
                    c207613 = c207613;
                    i60 = iM55686 ^ i18;
                    i66 = i66;
                    i59 = i17;
                    listMo6074 = listMo6074;
                    iM56023 = iM56023;
                    viewOnClickListenerC21365 = viewOnClickListenerC21364;
                    break;
                case -292801397:
                case 476255047:
                    i65 = i65;
                    iM56023 = iM56023;
                    i62 = i62;
                    c20496M25581 = c20496M25581;
                    if (C0930.m55886(itM56292)) {
                        iM55689 = (C0873.m55680("ܺ᩸") ^ i58) * (-35);
                        i55 = ((iM55689 ^ i57) * 31277) ^ (-398315219);
                        i56 = -1829896866;
                    } else {
                        iM55689 = C0946.m55979("ۡ᩶") ^ i57;
                        i55 = ((iM55689 ^ i58) * 24385) ^ (-148792794);
                        i56 = -1950643615;
                    }
                    i60 = iM55689 ^ i56;
                    i59 = i55;
                    i65 = i65;
                    c20496M25581 = c20496M25581;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case -179234544:
                case 1840890523:
                    i65 = i65;
                    iM56023 = iM56023;
                    i62 = i62;
                    c20496M25581 = c20496M25581;
                    if ((i76 & 16) != 0) {
                        iM55689 = (C0946.m55979("᩸ܽ") + i57) * (-113);
                        i55 = ((iM55689 ^ i58) * 26675) ^ 1504161987;
                        i56 = -955053915;
                    } else {
                        iM55689 = (C0946.m55979("֨ܳ") ^ i57) * 53;
                        i55 = ((iM55689 ^ i58) * 14949) ^ (-1417062135);
                        i56 = -202468097;
                    }
                    i60 = iM55689 ^ i56;
                    i59 = i55;
                    i65 = i65;
                    c20496M25581 = c20496M25581;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case -173159408:
                case 1197247026:
                    i66 = i66;
                    atomicInteger2 = new AtomicInteger(i66);
                    atomicInteger3 = atomicInteger2;
                    iM55686 = C0946.m55979("ۘܽ") ^ i57;
                    i17 = ((iM55686 ^ i58) * 11323) ^ (-968582944);
                    i18 = 303241453;
                    i86 = i86;
                    str3 = str3;
                    i85 = i85;
                    c207613 = c207613;
                    i60 = iM55686 ^ i18;
                    i66 = i66;
                    i59 = i17;
                    listMo6074 = listMo6074;
                    iM56023 = iM56023;
                    viewOnClickListenerC21365 = viewOnClickListenerC21364;
                    break;
                case -154534614:
                case -109598577:
                    i65 = i65;
                    iM56023 = iM56023;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i66 = i66;
                    arrayList2 = arrayList5;
                    c207613 = c207613;
                    interfaceC20568Mo5857 = interfaceC20568Mo5857;
                    i69 = i69;
                    listMo6074 = listMo6074;
                    i74 = i74;
                    i80 = i80;
                    abstractC94712 = abstractC94712;
                    enumC31610 = enumC31610;
                    i83 = i83;
                    i85 = i85;
                    c207615 = c207615;
                    c3424 = c3424;
                    i11 = i86;
                    short s = f82967[297];
                    if ((s * 30328) - ((s * s) + 229946896) > 0) {
                        iM55684 = (i58 - C0873.m55680("ܺ۠")) * (-79);
                        i12 = ((iM55684 ^ i57) * 6679) ^ 1329861134;
                        i13 = 1816355049;
                    } else {
                        iM55684 = (C0873.m55680("۫ᩳ") ^ i57) * (-101);
                        i12 = ((iM55684 ^ i58) * 5425) ^ (-1701169273);
                        i13 = 1683558850;
                    }
                    i14 = iM55684 ^ i13;
                    arrayList5 = arrayList2;
                    i86 = i11;
                    i80 = i80;
                    c207615 = c207615;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    enumC31610 = enumC31610;
                    i74 = i74;
                    i85 = i85;
                    interfaceC20568Mo5857 = interfaceC20568Mo5857;
                    c207613 = c207613;
                    abstractC94712 = abstractC94712;
                    c3424 = c3424;
                    i65 = i65;
                    i62 = i62;
                    iM56023 = iM56023;
                    i60 = i14;
                    i66 = i66;
                    i59 = i12;
                    i69 = i69;
                    listMo6074 = listMo6074;
                    i61 = i61;
                    viewOnClickListenerC21365 = viewOnClickListenerC21364;
                    break;
                case -114056062:
                case 1807873296:
                    i65 = i65;
                    iM56023 = iM56023;
                    i61 = i61;
                    i62 = i62;
                    if (viewOnClickListenerC21365.f67347.m14690(c20765, interfaceC12777, interfaceC40510, c3424, i63)) {
                        iM559714 = (C0873.m55680("᩻ۚ") + i58) * 63;
                        i44 = ((iM559714 ^ i57) * (-25489)) ^ 1275995558;
                        i45 = -289038766;
                    } else {
                        i72 = i63;
                        z9 = z12;
                        iM559714 = C0946.m55979("᩺᩺") ^ i57;
                        i44 = ((iM559714 ^ i58) * (-29725)) ^ (-1295643270);
                        i45 = -933853601;
                    }
                    i60 = iM559714 ^ i45;
                    i59 = i44;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case 9053045:
                case 1262815103:
                    i65 = i65;
                    iM56023 = iM56023;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    listMo6074 = listMo6074;
                    int i105 = i74;
                    i80 = i80;
                    abstractC9476 = abstractC94712;
                    i83 = i83;
                    i85 = i85;
                    c207615 = c207615;
                    abstractC94711 = (AbstractC9476) C1964.m56587(listMo6074, i105);
                    EnumC3167 enumC3167M56210 = C1024.m56210(abstractC94711);
                    i74 = i105;
                    if (enumC3167M56210 == EnumC3167.f5865) {
                        enumC31610 = enumC3167M56210;
                        int iM559725 = (C0946.m55979("ܺܰ") + i57) * 77;
                        i2 = ((iM559725 ^ i58) * (-25987)) ^ 742959828;
                        i6 = iM559725 ^ (-731038336);
                        listMo6074 = listMo6074;
                        i85 = i85;
                        abstractC94712 = abstractC9476;
                        i80 = i80;
                        c207615 = c207615;
                        str3 = str3;
                        i83 = i83;
                        i74 = i74;
                        i61 = i61;
                        i62 = i62;
                        iM56023 = iM56023;
                        viewOnClickListenerC21365 = viewOnClickListenerC21364;
                        i60 = i6;
                        i59 = i2;
                        i87 = i87;
                        i65 = i65;
                    } else {
                        iM55681 = C0873.m55680("ܶ᩻") ^ i58;
                        enumC3167 = enumC3167M56210;
                        i2 = ((iM55681 ^ i57) * (-2789)) ^ 1218979569;
                        i5 = 262321290;
                        i6 = iM55681 ^ i5;
                        listMo6074 = listMo6074;
                        i85 = i85;
                        abstractC94712 = abstractC9476;
                        i80 = i80;
                        c207615 = c207615;
                        str3 = str3;
                        i83 = i83;
                        enumC31610 = enumC3167;
                        i74 = i74;
                        i61 = i61;
                        i62 = i62;
                        iM56023 = iM56023;
                        viewOnClickListenerC21365 = viewOnClickListenerC21364;
                        i60 = i6;
                        i59 = i2;
                        i87 = i87;
                        i65 = i65;
                    }
                    break;
                case 52937076:
                case 1435344673:
                    i65 = i65;
                    iM56023 = iM56023;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i69 = i69;
                    listMo6074 = listMo6074;
                    i74 = i74;
                    i80 = i80;
                    abstractC94712 = abstractC94712;
                    enumC3167 = enumC31610;
                    i83 = i83;
                    i85 = i85;
                    c207615 = c207615;
                    switch (C22705.f71594[C0917.m55848(C1024.m56210(abstractC94712))]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                            iM55680 = C0873.m55680("֡۠") ^ i57;
                            i2 = ((iM55680 ^ i58) * (-26247)) ^ (-258118765);
                            i3 = -793232373;
                            i6 = iM55680 ^ i3;
                            listMo6074 = listMo6074;
                            i85 = i85;
                            abstractC94712 = abstractC94712;
                            i80 = i80;
                            c207615 = c207615;
                            str3 = str3;
                            i83 = i83;
                            enumC31610 = enumC3167;
                            i74 = i74;
                            i69 = i69;
                            i61 = i61;
                            i62 = i62;
                            iM56023 = iM56023;
                            viewOnClickListenerC21365 = viewOnClickListenerC21364;
                            i60 = i6;
                            i59 = i2;
                            i87 = i87;
                            i65 = i65;
                            break;
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                            iM55680 = (C0946.m55979("ۧ᩵") + i57) * 21;
                            i2 = ((iM55680 ^ i58) * (-2491)) ^ (-1395873049);
                            i3 = -1905213159;
                            i6 = iM55680 ^ i3;
                            listMo6074 = listMo6074;
                            i85 = i85;
                            abstractC94712 = abstractC94712;
                            i80 = i80;
                            c207615 = c207615;
                            str3 = str3;
                            i83 = i83;
                            enumC31610 = enumC3167;
                            i74 = i74;
                            i69 = i69;
                            i61 = i61;
                            i62 = i62;
                            iM56023 = iM56023;
                            viewOnClickListenerC21365 = viewOnClickListenerC21364;
                            i60 = i6;
                            i59 = i2;
                            i87 = i87;
                            i65 = i65;
                            break;
                        default:
                            abstractC9477 = abstractC94712;
                            i67 = i67;
                            i34 = i86;
                            abstractC94712 = abstractC9477;
                            i83 = i83;
                            z2 = z5;
                            i38 = i85;
                            z7 = z2;
                            c207617 = c207615;
                            i70 = i38;
                            c207616 = c207619;
                            z6 = z8;
                            int iM5597112 = (C0946.m55979("ۢ᩶") ^ i58) * 77;
                            i67 = i67;
                            i85 = i85;
                            i86 = i34;
                            i80 = i80;
                            c207615 = c207615;
                            i87 = i87;
                            str3 = str3;
                            enumC31610 = enumC3167;
                            i74 = i74;
                            i69 = i69;
                            c3424 = c3424;
                            i65 = i65;
                            i62 = i62;
                            iM56023 = iM56023;
                            listMo6074 = listMo6074;
                            i60 = iM5597112 ^ 1351575578;
                            i59 = ((iM5597112 ^ i57) * 15081) ^ 1495919302;
                            i61 = i61;
                            viewOnClickListenerC21365 = viewOnClickListenerC21364;
                            break;
                    }
                    break;
                case 67217223:
                case 2084097969:
                    i65 = i65;
                    iM56023 = iM56023;
                    i61 = i61;
                    StringBuilder sbM21135 = C9179.m21133(str3, strM55852);
                    C0863.m55629(sbM21135, C0949.m56004(atomicInteger3));
                    c207615 = c207615;
                    i62 = i62;
                    i87 = i87;
                    i85 = i85;
                    c3424.m6063(i85, new C14821(0, c207615.m46910(C0863.m55639(sbM21135)), null, null));
                    c3424.m6063(i85, new C23539(atomicInteger3.getAndIncrement()));
                    str3 = str3;
                    i80 = i80;
                    enumC31610 = enumC31610;
                    i83 = i83;
                    i73 = i71;
                    iM55682 = C0873.m55680("ۧܰ") ^ i58;
                    i7 = ((iM55682 ^ i57) * 9315) ^ 22414319;
                    i8 = -1730089926;
                    i85 = i85;
                    enumC31610 = enumC31610;
                    i80 = i80;
                    c207615 = c207615;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    i65 = i65;
                    i62 = i62;
                    iM56023 = iM56023;
                    i60 = iM55682 ^ i8;
                    i59 = i7;
                    i61 = i61;
                    break;
                case 67603192:
                case 315456877:
                    i65 = i65;
                    iM56023 = iM56023;
                    i62 = i62;
                    c20496M25581 = c20496M25581;
                    arrayList4 = arrayList4;
                    if (C1012.m56137(arrayList4) == 1) {
                        iM559717 = C0946.m55979("ܳ֨") ^ i57;
                        i52 = ((iM559717 ^ i58) * (-21221)) ^ (-803588413);
                        i53 = -9125481;
                    } else {
                        iM559717 = (C0946.m55979("ۨ۫") ^ i58) * 63;
                        i52 = ((iM559717 ^ i57) * 19471) ^ (-1960629865);
                        i53 = -1986326307;
                    }
                    i60 = iM559717 ^ i53;
                    arrayList4 = arrayList4;
                    i59 = i52;
                    i65 = i65;
                    c20496M25581 = c20496M25581;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case 161901033:
                case 1020397810:
                    i65 = i65;
                    iM56023 = iM56023;
                    i61 = i61;
                    i62 = i62;
                    i70 = i72 - 1;
                    i87 = i87;
                    str3 = str3;
                    c207616 = c20765;
                    c207617 = c207616;
                    i67 = i67;
                    i69 = i69;
                    listMo6074 = listMo6074;
                    z7 = z9;
                    i74 = i74;
                    i80 = i80;
                    enumC3167 = enumC31610;
                    i85 = i85;
                    c207615 = c207615;
                    z6 = true;
                    c3424 = c3424;
                    i34 = i86;
                    int iM5597113 = (C0946.m55979("ۢ᩶") ^ i58) * 77;
                    i67 = i67;
                    i85 = i85;
                    i86 = i34;
                    i80 = i80;
                    c207615 = c207615;
                    i87 = i87;
                    str3 = str3;
                    enumC31610 = enumC3167;
                    i74 = i74;
                    i69 = i69;
                    c3424 = c3424;
                    i65 = i65;
                    i62 = i62;
                    iM56023 = iM56023;
                    listMo6074 = listMo6074;
                    i60 = iM5597113 ^ 1351575578;
                    i59 = ((iM5597113 ^ i57) * 15081) ^ 1495919302;
                    i61 = i61;
                    viewOnClickListenerC21365 = viewOnClickListenerC21364;
                    break;
                case 178628486:
                case 1194001093:
                    i65 = i65;
                    iM56023 = iM56023;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i67 = i67;
                    i69 = i69;
                    listMo6074 = listMo6074;
                    i74 = i74;
                    i80 = i80;
                    enumC3167 = enumC31610;
                    i83 = i83;
                    i85 = i85;
                    c207615 = c207615;
                    c3424 = c3424;
                    i34 = i86;
                    abstractC9477 = (AbstractC9476) C1929.m56563(listMo6074, i85);
                    c20496M25581 = c11108.m25581(abstractC9477);
                    if (c20496M25581 == null) {
                        abstractC94712 = abstractC9477;
                        i83 = i83;
                        z2 = z5;
                        i38 = i85;
                        z7 = z2;
                        c207617 = c207615;
                        i70 = i38;
                        c207616 = c207619;
                        z6 = z8;
                        int iM5597114 = (C0946.m55979("ۢ᩶") ^ i58) * 77;
                        i67 = i67;
                        i85 = i85;
                        i86 = i34;
                        i80 = i80;
                        c207615 = c207615;
                        i87 = i87;
                        str3 = str3;
                        enumC31610 = enumC3167;
                        i74 = i74;
                        i69 = i69;
                        c3424 = c3424;
                        i65 = i65;
                        i62 = i62;
                        iM56023 = iM56023;
                        listMo6074 = listMo6074;
                        i60 = iM5597114 ^ 1351575578;
                        i59 = ((iM5597114 ^ i57) * 15081) ^ 1495919302;
                    } else {
                        i67 = i67;
                        int iM559726 = C0946.m55979("ۙᩳ") ^ i57;
                        i59 = ((iM559726 ^ i58) * 8389) ^ 253033237;
                        i85 = i85;
                        i86 = i34;
                        i80 = i80;
                        c207615 = c207615;
                        i87 = i87;
                        str3 = str3;
                        i83 = i83;
                        enumC31610 = enumC3167;
                        i74 = i74;
                        i69 = i69;
                        abstractC94712 = abstractC9477;
                        c3424 = c3424;
                        i65 = i65;
                        i62 = i62;
                        iM56023 = iM56023;
                        listMo6074 = listMo6074;
                        i60 = iM559726 ^ 707146525;
                    }
                    i61 = i61;
                    viewOnClickListenerC21365 = viewOnClickListenerC21364;
                    break;
                case 194224366:
                case 1501028871:
                    interfaceC4059 = (InterfaceC4059) abstractC94711;
                    interfaceC40510 = interfaceC4059;
                    iM55682 = C0946.m55979("᩻ۡ") ^ i58;
                    i7 = ((iM55682 ^ i57) * 6951) ^ 2057608872;
                    i8 = 399542740;
                    i85 = i85;
                    enumC31610 = enumC31610;
                    i80 = i80;
                    c207615 = c207615;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    i65 = i65;
                    i62 = i62;
                    iM56023 = iM56023;
                    i60 = iM55682 ^ i8;
                    i59 = i7;
                    i61 = i61;
                    break;
                case 204570267:
                case 685099212:
                    z15 = false;
                    iM559716 = (C0873.m55680("۬ۤ") ^ i58) * (-69);
                    i50 = ((iM559716 ^ i57) * (-17271)) ^ 521165644;
                    i51 = -1306766619;
                    i60 = iM559716 ^ i51;
                    arrayList4 = arrayList4;
                    i65 = i65;
                    c20496M25581 = c20496M25581;
                    iM56023 = iM56023;
                    i59 = i50;
                    i62 = i62;
                    break;
                case 252328286:
                case 1794187135:
                    z15 = true;
                    iM559716 = (C0873.m55680("۬ۤ") ^ i58) * (-69);
                    i50 = ((iM559716 ^ i57) * (-17271)) ^ 521165644;
                    i51 = -1306766619;
                    i60 = iM559716 ^ i51;
                    arrayList4 = arrayList4;
                    i65 = i65;
                    c20496M25581 = c20496M25581;
                    iM56023 = iM56023;
                    i59 = i50;
                    i62 = i62;
                    break;
                case 276894000:
                case 2126466804:
                    iM56023 = iM56023;
                    int i106 = i61;
                    int i107 = i62;
                    if (i107 < 2) {
                        iM559713 = (i57 - C0873.m55680("ۚܶ")) * 91;
                        i42 = ((iM559713 ^ i58) * 1803) ^ 657341750;
                        i43 = 853412256;
                    } else {
                        iM559713 = C0946.m55979("۫֨") ^ i58;
                        i42 = ((iM559713 ^ i57) * (-22127)) ^ (-64771182);
                        i43 = 284342759;
                    }
                    i60 = iM559713 ^ i43;
                    i62 = i107;
                    i59 = i42;
                    i65 = i65;
                    i61 = i106;
                    iM56023 = iM56023;
                    break;
                case 320244823:
                case 554347960:
                    i65 = i65;
                    int i108 = iM56023;
                    i62 = i62;
                    ArrayList arrayList8 = arrayList4;
                    int i109 = c20496M25581.f63292;
                    if ((i109 & 1) != 0) {
                        int iM556826 = (C0873.m55680("֨ۢ") ^ i57) * (-63);
                        iM56023 = i108;
                        i59 = ((iM556826 ^ i58) * (-29979)) ^ 1671451988;
                        i60 = iM556826 ^ (-1202152088);
                        arrayList4 = arrayList8;
                        i76 = i109;
                    } else {
                        iM56023 = i108;
                        int iM556827 = (C0873.m55680("᩷᩺") ^ i58) * 127;
                        i60 = iM556827 ^ (-215200192);
                        arrayList4 = arrayList8;
                        i76 = i109;
                        i59 = ((iM556827 ^ i57) * 3107) ^ (-40291275);
                    }
                    i65 = i65;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case 475381304:
                case 1245874876:
                    i65 = i65;
                    iM56023 = iM56023;
                    i61 = i61;
                    i62 = i62;
                    if (c20496M25581.f63290) {
                        iM559714 = C0946.m55979("᩵ܿ") ^ i58;
                        i44 = ((iM559714 ^ i57) * 24485) ^ 1434375807;
                        i45 = 518705589;
                    } else {
                        i72 = i63;
                        z9 = z12;
                        iM559714 = C0946.m55979("᩺᩺") ^ i57;
                        i44 = ((iM559714 ^ i58) * (-29725)) ^ (-1295643270);
                        i45 = -933853601;
                    }
                    i60 = iM559714 ^ i45;
                    i59 = i44;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case 482694369:
                case 569765964:
                    i65 = i65;
                    iM56023 = iM56023;
                    i61 = i61;
                    i87 = i87;
                    i62 = i62;
                    i85 = i85;
                    c207615 = c207615;
                    StringBuilder sbM21136 = C9179.m21133(str3, strM55852);
                    C0863.m55629(sbM21136, C0877.m55708(atomicInteger3));
                    str3 = str3;
                    C14821 c14821 = new C14821(0, c207615.m46910(C0845.m55591(sbM21136)), null, null);
                    int i110 = i83;
                    c3424.m6063(i110, c14821);
                    c3424.m6063(i110, new C23539(atomicInteger3.getAndIncrement()));
                    i83 = i110;
                    i80 = i80;
                    enumC31610 = enumC31610;
                    i73 = i83;
                    iM55682 = C0873.m55680("ۧܰ") ^ i58;
                    i7 = ((iM55682 ^ i57) * 9315) ^ 22414319;
                    i8 = -1730089926;
                    i85 = i85;
                    enumC31610 = enumC31610;
                    i80 = i80;
                    c207615 = c207615;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    i65 = i65;
                    i62 = i62;
                    iM56023 = iM56023;
                    i60 = iM55682 ^ i8;
                    i59 = i7;
                    i61 = i61;
                    break;
                case 570393243:
                case 1804404061:
                    boolean[] zArr3 = new boolean[6];
                    zArr3[0] = z15;
                    zArr3[r80] = z16;
                    zArr3[c2] = z17;
                    zArr3[c] = z18;
                    zArr3[c4] = z19;
                    zArr3[c3] = z20;
                    zArr = zArr3;
                    iM559716 = (C0946.m55979("ۡۘ") ^ i58) * (-29);
                    i50 = ((iM559716 ^ i57) * (-3311)) ^ 200545918;
                    i51 = -1957823272;
                    i60 = iM559716 ^ i51;
                    arrayList4 = arrayList4;
                    i65 = i65;
                    c20496M25581 = c20496M25581;
                    iM56023 = iM56023;
                    i59 = i50;
                    i62 = i62;
                    break;
                case 601009224:
                case 1618415123:
                    i65 = i65;
                    iM56023 = iM56023;
                    i62 = i62;
                    c20496M25581 = c20496M25581;
                    arrayList4 = arrayList4;
                    if (((C5073) C1017.m56196(arrayListM14688, i87)).f11880 != -1) {
                        iM559717 = C0873.m55680("ۚۗ") ^ i57;
                        i52 = ((iM559717 ^ i58) * (-4091)) ^ 134675561;
                        i53 = -2133128885;
                    } else {
                        iM559717 = C0873.m55680("ۢܽ") ^ i58;
                        i52 = ((iM559717 ^ i57) * (-15883)) ^ (-498588589);
                        i53 = -1209738993;
                    }
                    i60 = iM559717 ^ i53;
                    arrayList4 = arrayList4;
                    i59 = i52;
                    i65 = i65;
                    c20496M25581 = c20496M25581;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case 608127161:
                case 741058942:
                    i65 = i65;
                    iM56023 = iM56023;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i80 = i80;
                    AbstractC9476 abstractC94715 = abstractC94712;
                    enumC3167 = enumC31610;
                    i85 = i85;
                    c207615 = c207615;
                    int i111 = i85 + 1;
                    if (!viewOnClickListenerC21365.f67347.m14689(c207615, abstractC94715, c3424, i111)) {
                        abstractC9477 = abstractC94715;
                        i83 = i111;
                        i34 = i86;
                        abstractC94712 = abstractC9477;
                        i83 = i83;
                        z2 = z5;
                        i38 = i85;
                        z7 = z2;
                        c207617 = c207615;
                        i70 = i38;
                        c207616 = c207619;
                        z6 = z8;
                        int iM5597115 = (C0946.m55979("ۢ᩶") ^ i58) * 77;
                        i67 = i67;
                        i85 = i85;
                        i86 = i34;
                        i80 = i80;
                        c207615 = c207615;
                        i87 = i87;
                        str3 = str3;
                        enumC31610 = enumC3167;
                        i74 = i74;
                        i69 = i69;
                        c3424 = c3424;
                        i65 = i65;
                        i62 = i62;
                        iM56023 = iM56023;
                        listMo6074 = listMo6074;
                        i60 = iM5597115 ^ 1351575578;
                        i59 = ((iM5597115 ^ i57) * 15081) ^ 1495919302;
                        i61 = i61;
                        viewOnClickListenerC21365 = viewOnClickListenerC21364;
                    } else {
                        int iM556828 = C0873.m55680("ܽۖ") ^ i57;
                        i37 = ((iM556828 ^ i58) * 15781) ^ (-1668016704);
                        i85 = i85;
                        abstractC94712 = abstractC94715;
                        i83 = i111;
                        i80 = i80;
                        c207615 = c207615;
                        i87 = i87;
                        str3 = str3;
                        enumC31610 = enumC3167;
                        i65 = i65;
                        i61 = i61;
                        i62 = i62;
                        iM56023 = iM56023;
                        i60 = iM556828 ^ (-1512445567);
                        i59 = i37;
                        viewOnClickListenerC21365 = viewOnClickListenerC21364;
                    }
                    break;
                case 740593253:
                case 1948098812:
                    i65 = i65;
                    iM56023 = iM56023;
                    i62 = i62;
                    arrayList4 = arrayList4;
                    if (z11) {
                        iM559715 = C0946.m55979("۫᩵") ^ i58;
                        i46 = ((iM559715 ^ i57) * (-4841)) ^ (-1948108371);
                        i47 = -1106496780;
                    } else {
                        i78 = i63;
                        z14 = z12;
                        iM559715 = (i57 - C0873.m55680("ܽۘ")) * 51;
                        i46 = ((iM559715 ^ i58) * (-1463)) ^ 1980738730;
                        i47 = -1423214458;
                    }
                    i60 = iM559715 ^ i47;
                    arrayList4 = arrayList4;
                    i59 = i46;
                    i65 = i65;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case 826790667:
                case 954231147:
                    i87 = 0;
                    iM56023 = C0955.m56023(zArr.length, C1012.m56137(arrayListM14688));
                    iM559717 = (C0873.m55680("ۡ᩹") ^ i57) * (-55);
                    i52 = ((iM559717 ^ i58) * 26191) ^ (-476967314);
                    i53 = -1149400511;
                    i60 = iM559717 ^ i53;
                    arrayList4 = arrayList4;
                    i59 = i52;
                    i65 = i65;
                    c20496M25581 = c20496M25581;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case 1073086823:
                case 1298357588:
                    i39 = iM56023;
                    i40 = i85;
                    c207611 = c207615;
                    InterfaceC12777 interfaceC12778 = (InterfaceC12777) abstractC94712;
                    i41 = 0;
                    arrayListM14688 = viewOnClickListenerC21365.f67347.m14688(interfaceC12778);
                    i63 = i40;
                    interfaceC12777 = interfaceC12778;
                    c207612 = c207611;
                    z12 = z5;
                    r80 = z8;
                    int iM5568112 = (C0873.m55680("ᩳܿ") ^ i57) * (-61);
                    C20765 c207625 = c207612;
                    i59 = ((iM5568112 ^ i58) * (-23609)) ^ (-1228770713);
                    i85 = i40;
                    i83 = i83;
                    enumC31610 = enumC31610;
                    c207615 = c207611;
                    i62 = i41;
                    i87 = i87;
                    c207620 = c207625;
                    i65 = i65;
                    i61 = i61;
                    iM56023 = i39;
                    i60 = iM5568112 ^ (-1024520457);
                    str3 = str3;
                    break;
                case 1089794532:
                case 1866308427:
                    z3 = c20496M25581.f63289;
                    z11 = z3;
                    iM559714 = (C0946.m55979("ܽ۬") + i57) * (-123);
                    i44 = ((iM559714 ^ i58) * 9173) ^ (-1367224405);
                    i45 = -162852656;
                    i60 = iM559714 ^ i45;
                    i59 = i44;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case 1267776014:
                case 2036277718:
                    i65 = i65;
                    iM56023 = iM56023;
                    i62 = i62;
                    c20496M25581 = c20496M25581;
                    arrayList4 = arrayList4;
                    StringBuilder sbM21137 = C9179.m21133(str3, strM55852);
                    C0845.m55589(sbM21137, C0877.m55708(atomicInteger3));
                    c3424.m6063(i63, new C14821(0, c207620.m46910(C0863.m55639(sbM21137)), null, null));
                    c3424.m6063(i63, new C23539(atomicInteger3.getAndIncrement()));
                    i54 = i84;
                    i84 = i81;
                    i82 = i84;
                    i84 = i54;
                    iM559717 = (C0873.m55680("ۗ᩷") + i58) * 7;
                    i52 = ((iM559717 ^ i57) * 24049) ^ (-1740939906);
                    i53 = -768879504;
                    i60 = iM559717 ^ i53;
                    arrayList4 = arrayList4;
                    i59 = i52;
                    i65 = i65;
                    c20496M25581 = c20496M25581;
                    i62 = i62;
                    iM56023 = iM56023;
                    break;
                case 1365167957:
                case 1496739727:
                    i65 = i65;
                    iM56023 = iM56023;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i80 = i80;
                    enumC31610 = enumC31610;
                    i83 = i83;
                    i85 = i85;
                    c207615 = c207615;
                    if (atomicInteger3 != null) {
                        iM55682 = C0946.m55979("ۙۜ") ^ i57;
                        i7 = ((iM55682 ^ i58) * (-15751)) ^ (-137578011);
                        i8 = -398307793;
                    } else {
                        i73 = i83;
                        iM55682 = C0873.m55680("ۧܰ") ^ i58;
                        i7 = ((iM55682 ^ i57) * 9315) ^ 22414319;
                        i8 = -1730089926;
                    }
                    i85 = i85;
                    enumC31610 = enumC31610;
                    i80 = i80;
                    c207615 = c207615;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    i65 = i65;
                    i62 = i62;
                    iM56023 = iM56023;
                    i60 = iM55682 ^ i8;
                    i59 = i7;
                    i61 = i61;
                    break;
                case 1585169263:
                case 2027679640:
                    i65 = i65;
                    iM56023 = iM56023;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i85 = i85;
                    c207615 = c207615;
                    i80 = i80;
                    i83 = i83;
                    enumC3167 = enumC31610;
                    if (i80 == 10) {
                        i80 = i80;
                        i69 = i69;
                        listMo6074 = listMo6074;
                        i74 = i74;
                        abstractC9478 = abstractC94712;
                        i35 = i86;
                        int iM5568113 = (C0873.m55680("֡۬") + i57) * 41;
                        i85 = i85;
                        i67 = i67;
                        i86 = i35;
                        c207615 = c207615;
                        str3 = str3;
                        i83 = i83;
                        enumC31610 = enumC3167;
                        i74 = i74;
                        abstractC94712 = abstractC9478;
                        c3424 = c3424;
                        i61 = i61;
                        i62 = i62;
                        iM56023 = iM56023;
                        listMo6074 = listMo6074;
                        i60 = iM5568113 ^ (-1334062428);
                        i59 = ((iM5568113 ^ i58) * (-2799)) ^ (-1358178413);
                        i87 = i87;
                        i69 = i69;
                        i65 = i65;
                        viewOnClickListenerC21365 = viewOnClickListenerC21364;
                    } else {
                        iM55680 = C0873.m55680("ܶᩳ") ^ i58;
                        i2 = ((iM55680 ^ i57) * (-29819)) ^ (-434823853);
                        i3 = -47384425;
                        i6 = iM55680 ^ i3;
                        listMo6074 = listMo6074;
                        i85 = i85;
                        abstractC94712 = abstractC94712;
                        i80 = i80;
                        c207615 = c207615;
                        str3 = str3;
                        i83 = i83;
                        enumC31610 = enumC3167;
                        i74 = i74;
                        i69 = i69;
                        i61 = i61;
                        i62 = i62;
                        iM56023 = iM56023;
                        viewOnClickListenerC21365 = viewOnClickListenerC21364;
                        i60 = i6;
                        i59 = i2;
                        i87 = i87;
                        i65 = i65;
                    }
                    break;
                case 1691292801:
                case 2134680633:
                    i65 = i65;
                    iM56023 = iM56023;
                    i62 = i62;
                    c20496M25581 = c20496M25581;
                    i84 = i61 + 1;
                    c3424.m6064(i61, new C3364(EnumC3167.f5826, 0, 0, 0, 0, 0, 0, c207620.f71621.m11620(viewOnClickListenerC21365.f67347.f16604)));
                    if (atomicInteger3 == null) {
                        arrayList4 = arrayList4;
                        i54 = i84;
                        i82 = i84;
                        i84 = i54;
                        iM559717 = (C0873.m55680("ۗ᩷") + i58) * 7;
                        i52 = ((iM559717 ^ i57) * 24049) ^ (-1740939906);
                        i53 = -768879504;
                        i60 = iM559717 ^ i53;
                        arrayList4 = arrayList4;
                        i59 = i52;
                        i65 = i65;
                        c20496M25581 = c20496M25581;
                        i62 = i62;
                        iM56023 = iM56023;
                    } else {
                        iM55689 = (C0873.m55680("᩻ܿ") ^ i58) * (-123);
                        i55 = ((iM55689 ^ i57) * 26357) ^ 1713167777;
                        i56 = 1200570131;
                        i60 = iM55689 ^ i56;
                        i59 = i55;
                        i65 = i65;
                        c20496M25581 = c20496M25581;
                        i62 = i62;
                        iM56023 = iM56023;
                    }
                    break;
                default:
                    i65 = i65;
                    iM56023 = iM56023;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i80 = i80;
                    enumC3167 = enumC31610;
                    i83 = i83;
                    i85 = i85;
                    c207615 = c207615;
                    itM563911.remove();
                    iM55680 = C0873.m55680("ܶᩳ") ^ i58;
                    i2 = ((iM55680 ^ i57) * (-29819)) ^ (-434823853);
                    i3 = -47384425;
                    i6 = iM55680 ^ i3;
                    listMo6074 = listMo6074;
                    i85 = i85;
                    abstractC94712 = abstractC94712;
                    i80 = i80;
                    c207615 = c207615;
                    str3 = str3;
                    i83 = i83;
                    enumC31610 = enumC3167;
                    i74 = i74;
                    i69 = i69;
                    i61 = i61;
                    i62 = i62;
                    iM56023 = iM56023;
                    viewOnClickListenerC21365 = viewOnClickListenerC21364;
                    i60 = i6;
                    i59 = i2;
                    i87 = i87;
                    i65 = i65;
                    break;
            }
            c20765.m46899(C1024.m56215(c9952), c9952.mo5039(), c9952.mo5034(), c9952.mo5038(), str5, c9952.getAnnotations(), arrayList5, arrayList6);
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ec, code lost:
    
        if (p067l.C0861.m55626() != false) goto L13;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m48389(ViewOnClickListenerC21364 viewOnClickListenerC21364, CheckBox checkBox) {
        int i;
        int iM55979;
        int i2;
        int i3;
        C12096 c12096;
        int iM559710;
        int i4;
        int i5;
        int iM559711;
        int i6;
        int i7;
        int i8;
        C12096 c12097;
        short[] sArr;
        short[] sArr2;
        int i9;
        short[] sArr3;
        int i10;
        int iM55680;
        int i11;
        int i12;
        int i13;
        short[] sArr4;
        short[] sArr5;
        C12096 c12098;
        short[] sArr6;
        int i14;
        int i15;
        C12096 c12099;
        short[] sArr7;
        short[] sArr8;
        int iM55681;
        int i16;
        int i17;
        final CheckBox checkBox2 = checkBox;
        int i18 = C1071.f81975;
        int i19 = C0930.f81879;
        int iM559712 = C0946.m55979("ܶܿ") ^ i18;
        int i20 = ((iM559712 ^ i19) * (-17065)) ^ (-334289212);
        C12096 c120910 = null;
        InterfaceC14100 interfaceC14100 = null;
        ViewOnClickListenerC11051 viewOnClickListenerC11051 = null;
        DialogInterface.OnClickListener onClickListener = null;
        String strM56029 = null;
        short[] sArr9 = null;
        short[] sArr10 = null;
        short[] sArr11 = null;
        short[] sArr12 = null;
        int i21 = iM559712 ^ (-656753093);
        Main main = null;
        int i22 = 0;
        int iM559713 = 0;
        int i23 = 0;
        short s = 0;
        int i24 = 0;
        int iM559714 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = -482149427;
        View viewM56111 = null;
        C20671 c20671M55888 = null;
        String str = null;
        short[] sArr13 = null;
        int iM559715 = 0;
        View view = null;
        DialogInterfaceOnClickListenerC6479 dialogInterfaceOnClickListenerC6479 = null;
        int i30 = 0;
        int iM559716 = 0;
        String strM55717 = null;
        short[] sArr14 = null;
        short[] sArr15 = null;
        while (true) {
            i29 = i21 ^ (i20 & (((i29 ^ i19) * 30871) >> 31));
            switch (i29) {
                case -1964364417:
                case -1886717671:
                    if (C1046.m56302() != 0) {
                        c120910 = c120910;
                        sArr15 = sArr15;
                        sArr13 = sArr13;
                        strM55717 = strM55717;
                        main = main;
                        int i31 = i26;
                        sArr10 = sArr10;
                        i25 = i25;
                        i = i31;
                        iM55979 = C0873.m55680("֫ܶ") ^ i19;
                        i20 = ((iM55979 ^ i18) * (-29261)) ^ (-1350860462);
                        i2 = 1159661504;
                        i3 = iM55979 ^ i2;
                        c120910 = c120910;
                        main = main;
                        strM55717 = strM55717;
                        interfaceC14100 = interfaceC14100;
                        sArr13 = sArr13;
                        sArr15 = sArr15;
                        sArr11 = sArr11;
                        i28 = i28;
                        i27 = i27;
                        i21 = i3;
                        checkBox2 = checkBox;
                        int i32 = i;
                        i25 = i25;
                        sArr10 = sArr10;
                        i26 = i32;
                    } else {
                        i15 = i27;
                        sArr8 = sArr11;
                        c12099 = c120910;
                        sArr7 = sArr15;
                        sArr4 = sArr13;
                        i14 = i28;
                        iM55681 = (C0873.m55680("ܽ۬") + i18) * (-81);
                        sArr5 = sArr8;
                        i16 = ((iM55681 ^ i19) * 10295) ^ (-2027609707);
                        i17 = -1826769571;
                        i21 = iM55681 ^ i17;
                        c120910 = c12099;
                        i27 = i15;
                        i20 = i16;
                        checkBox2 = checkBox;
                        short[] sArr16 = sArr5;
                        i28 = i14;
                        sArr13 = sArr4;
                        sArr15 = sArr7;
                        sArr11 = sArr16;
                    }
                    break;
                case -1955958747:
                case -1835017922:
                    int i33 = i26;
                    i27 = i27;
                    i28 = i28;
                    sArr11 = sArr11;
                    C12096 c120911 = c120910;
                    sArr10 = sArr10;
                    i25 = i25;
                    sArr15 = sArr15;
                    sArr13 = sArr13;
                    i = i33;
                    interfaceC14100 = interfaceC14100;
                    strM55717 = strM55717;
                    C1929.m56555(c120911, C1053.m56333(interfaceC14100, strM55717, C1046.m56293(f82967, 173, 68, i22)));
                    if (C0898.f81858 > 0) {
                        int iM559717 = (i19 - C0946.m55979("֨۠")) * 83;
                        c120910 = c120911;
                        i20 = ((iM559717 ^ i18) * (-19819)) ^ 690045135;
                        i3 = iM559717 ^ (-46938683);
                        strM55717 = strM55717;
                        c120910 = c120910;
                        sArr13 = sArr13;
                        sArr15 = sArr15;
                        interfaceC14100 = interfaceC14100;
                        sArr11 = sArr11;
                        i28 = i28;
                        i27 = i27;
                        i21 = i3;
                        checkBox2 = checkBox;
                        int i34 = i;
                        i25 = i25;
                        sArr10 = sArr10;
                        i26 = i34;
                    } else {
                        c120910 = c120911;
                        main = main;
                        iM55979 = (C0946.m55979("ۘᩳ") + i18) * (-69);
                        i20 = ((iM55979 ^ i19) * 14517) ^ (-1368804227);
                        i2 = 9854816;
                        i3 = iM55979 ^ i2;
                        c120910 = c120910;
                        main = main;
                        strM55717 = strM55717;
                        interfaceC14100 = interfaceC14100;
                        sArr13 = sArr13;
                        sArr15 = sArr15;
                        sArr11 = sArr11;
                        i28 = i28;
                        i27 = i27;
                        i21 = i3;
                        checkBox2 = checkBox;
                        int i35 = i;
                        i25 = i25;
                        sArr10 = sArr10;
                        i26 = i35;
                    }
                    break;
                case -1888771621:
                case 878744986:
                    sArr4 = sArr13;
                    sArr5 = sArr11;
                    c12098 = c120910;
                    sArr6 = f82967;
                    i27 = 250;
                    if (ViewOnClickListenerC0939.f81888 > 0) {
                        int iM55682 = C0873.m55680("۠ۡ") ^ i19;
                        i21 = iM55682 ^ 408316203;
                        c120910 = c12098;
                        i20 = ((iM55682 ^ i18) * 19275) ^ 369439584;
                        sArr13 = sArr4;
                        sArr11 = sArr5;
                        i28 = 3;
                        sArr15 = sArr6;
                        checkBox2 = checkBox;
                    } else {
                        i14 = 3;
                        int iM55683 = (i19 - C0873.m55680("ۗ֫")) * 87;
                        sArr7 = sArr6;
                        i16 = ((iM55683 ^ i18) * (-20385)) ^ 2091683928;
                        i21 = iM55683 ^ 523001164;
                        c120910 = c12098;
                        i20 = i16;
                        checkBox2 = checkBox;
                        short[] sArr17 = sArr5;
                        i28 = i14;
                        sArr13 = sArr4;
                        sArr15 = sArr7;
                        sArr11 = sArr17;
                    }
                    break;
                case -1474961175:
                case -1075442298:
                    C1124.m56363(c20671M55888, C0946.m55979(C0947.m55993(sArr12, i30, 3, i22)) ^ 2097684581, dialogInterfaceOnClickListenerC6479);
                    C1025.m56221(c20671M55888);
                    break;
                case -1467776721:
                case 2135821739:
                    i = i26;
                    i22 = 16499;
                    iM55979 = (C0946.m55979("ܺ۠") ^ i18) * (-63);
                    i20 = ((iM55979 ^ i19) * (-6573)) ^ (-1597634367);
                    i2 = 1964902842;
                    i3 = iM55979 ^ i2;
                    c120910 = c120910;
                    main = main;
                    strM55717 = strM55717;
                    interfaceC14100 = interfaceC14100;
                    sArr13 = sArr13;
                    sArr15 = sArr15;
                    sArr11 = sArr11;
                    i28 = i28;
                    i27 = i27;
                    i21 = i3;
                    checkBox2 = checkBox;
                    int i36 = i;
                    i25 = i25;
                    sArr10 = sArr10;
                    i26 = i36;
                    break;
                case -1312338182:
                case 1584552209:
                    short[] sArr18 = sArr10;
                    i8 = i26;
                    i27 = i27;
                    i28 = i28;
                    sArr11 = sArr11;
                    c12097 = c120910;
                    sArr = sArr15;
                    sArr2 = sArr13;
                    i9 = i25;
                    sArr3 = sArr18;
                    C1048.m56304(C0892.m55755(viewM56111, C0873.m55680(C0937.m55921(sArr18, i9, i8, i22)) ^ 2123575867), viewOnClickListenerC11051);
                    if (C0890.m55740()) {
                        i10 = i9;
                        iM55680 = C0873.m55680("᩹ܽ") ^ i18;
                        i11 = ((iM55680 ^ i19) * 28489) ^ (-1733713818);
                        i12 = 1997066243;
                    } else {
                        iM55680 = (C0946.m55979("᩹ۜ") + i18) * 93;
                        i10 = i9;
                        i11 = ((iM55680 ^ i19) * (-28447)) ^ 1449354754;
                        i12 = -941567474;
                    }
                    i13 = iM55680 ^ i12;
                    c120910 = c12097;
                    i20 = i11;
                    i25 = i10;
                    sArr10 = sArr3;
                    sArr13 = sArr2;
                    sArr15 = sArr;
                    i26 = i8;
                    sArr11 = sArr11;
                    i28 = i28;
                    i27 = i27;
                    i21 = i13;
                    checkBox2 = checkBox;
                    break;
                case -1100160842:
                case 1859905946:
                    interfaceC14100 = interfaceC14100;
                    i27 = i27;
                    i28 = i28;
                    sArr11 = sArr11;
                    c120910 = c120910;
                    sArr15 = sArr15;
                    sArr13 = sArr13;
                    strM55717 = strM55717;
                    int i37 = i26;
                    sArr10 = sArr10;
                    i25 = i25;
                    i = i37;
                    viewM56111 = C0992.m56111(main, iM559714);
                    main = main;
                    iM559713 = C0946.m55979(C0947.m55993(f82967, 153, 3, i22));
                    i23 = 2099580873;
                    if (C1048.f81963) {
                        iM55979 = C0873.m55680("ۧۢ") ^ i19;
                        i20 = ((iM55979 ^ i18) * 21799) ^ 707742903;
                        i2 = 1335963994;
                    } else {
                        iM55979 = (C0946.m55979("ۘᩳ") + i18) * (-69);
                        i20 = ((iM55979 ^ i19) * 14517) ^ (-1368804227);
                        i2 = 9854816;
                    }
                    i3 = iM55979 ^ i2;
                    c120910 = c120910;
                    main = main;
                    strM55717 = strM55717;
                    interfaceC14100 = interfaceC14100;
                    sArr13 = sArr13;
                    sArr15 = sArr15;
                    sArr11 = sArr11;
                    i28 = i28;
                    i27 = i27;
                    i21 = i3;
                    checkBox2 = checkBox;
                    int i38 = i;
                    i25 = i25;
                    sArr10 = sArr10;
                    i26 = i38;
                    break;
                case -739048083:
                case -593808321:
                    iM559716 = C0946.m55979(RunnableC0871.m55667(sArr14, 259, 3, i22)) ^ 2125604330;
                    if (!C1024.f81946) {
                        iM559711 = C0946.m55979("ܿۤ") ^ i19;
                        i6 = ((iM559711 ^ i18) * (-13665)) ^ (-639711968);
                        i7 = 644606856;
                        i21 = iM559711 ^ i7;
                        i20 = i6;
                    } else {
                        c120910 = c120910;
                        sArr15 = sArr15;
                        sArr13 = sArr13;
                        strM55717 = strM55717;
                        main = main;
                        int i39 = i26;
                        sArr10 = sArr10;
                        i25 = i25;
                        i = i39;
                        iM55979 = C0873.m55680("֫ܶ") ^ i19;
                        i20 = ((iM55979 ^ i18) * (-29261)) ^ (-1350860462);
                        i2 = 1159661504;
                        i3 = iM55979 ^ i2;
                        c120910 = c120910;
                        main = main;
                        strM55717 = strM55717;
                        interfaceC14100 = interfaceC14100;
                        sArr13 = sArr13;
                        sArr15 = sArr15;
                        sArr11 = sArr11;
                        i28 = i28;
                        i27 = i27;
                        i21 = i3;
                        checkBox2 = checkBox;
                        int i310 = i;
                        i25 = i25;
                        sArr10 = sArr10;
                        i26 = i310;
                    }
                    break;
                case -728999847:
                case -58288422:
                    C1071.m56343();
                    C0906.m55809();
                    sArr6 = sArr15;
                    c12098 = c120910;
                    sArr4 = sArr13;
                    i14 = i28;
                    sArr5 = sArr11;
                    int iM55684 = (i19 - C0873.m55680("ۗ֫")) * 87;
                    sArr7 = sArr6;
                    i16 = ((iM55684 ^ i18) * (-20385)) ^ 2091683928;
                    i21 = iM55684 ^ 523001164;
                    c120910 = c12098;
                    i20 = i16;
                    checkBox2 = checkBox;
                    short[] sArr19 = sArr5;
                    i28 = i14;
                    sArr13 = sArr4;
                    sArr15 = sArr7;
                    sArr11 = sArr19;
                    break;
                case -635933857:
                case 367842290:
                    i27 = i27;
                    i28 = i28;
                    sArr11 = sArr11;
                    c12096 = c120910;
                    sArr15 = sArr15;
                    sArr13 = sArr13;
                    c12096.mo27941(c12096.m32590());
                    viewOnClickListenerC11051 = new ViewOnClickListenerC11051(1, c12096);
                    sArr10 = f82967;
                    i25 = 241;
                    i26 = 3;
                    iM559710 = C0873.m55680("ܳ᩸") ^ i19;
                    i4 = ((iM559710 ^ i18) * 9031) ^ (-86590418);
                    i5 = -1619339607;
                    i13 = iM559710 ^ i5;
                    c120910 = c12096;
                    i20 = i4;
                    sArr13 = sArr13;
                    sArr15 = sArr15;
                    sArr11 = sArr11;
                    i28 = i28;
                    i27 = i27;
                    i21 = i13;
                    checkBox2 = checkBox;
                    break;
                case -415926149:
                case 1362750176:
                    C1048.m56304(view, viewOnClickListenerC11051);
                    c20671M55888 = C0930.m55888(main);
                    C0882.m55725(c20671M55888, viewM56111);
                    final C12096 c120912 = c120910;
                    onClickListener = new DialogInterface.OnClickListener() { // from class: l.ܺۛܽ

                        /* JADX INFO: renamed from: ۧܿ᩷, reason: not valid java name and contains not printable characters */
                        private static final short[] f82246 = {3084, 11149, 11228, 11219, 11214, 11210, 11202, 11226, 11175, 11228, 11204, 11211, 11206, 11220, 11220, 11226, 11149, 11178, 11193, 11228, 11210, 11202, 11219, 11215, 11208, 11203, 11226, 11183, 11228, 11211, 11208, 11204, 11206, 11219, 11214, 11208, 11209, 11226, 11182, 11149, 11228, 11221, 11202, 11220, 11218, 11211, 11219, 11226, 11149, 11178, 11178, 11178, 11178, 11178, 11178, 11178, 11178, 11178, 11178, 11178, 11178, 11178, 11178, 11178, 11178, 11178, 11178, 11178, 11178, 11149, 11246, 11241, 11245, 11234, 11236, 11251, 11224, 11243, 11240, 11232, 11224, 11233, 11240, 11253, 11242, 11238, 11251};

                        {
                            int i40 = -134126713;
                            int i41 = C1053.f81965;
                            int i42 = ServiceConnectionC1013.f81940;
                            int iM559718 = (C0946.m55979("᩶ۛ") + i41) * 19;
                            int i43 = ((iM559718 ^ i42) * (-10499)) ^ 1036981608;
                            int i44 = 1887277753;
                            while (true) {
                                i40 = ((((i40 ^ i42) * (-14221)) >> 31) & i43) ^ (iM559718 ^ i44);
                                switch (i40) {
                                    case -2135152480:
                                    case 1794512452:
                                        return;
                                    case -1821777138:
                                    case -826841907:
                                        if (C1929.f83011 != 0) {
                                            iM559718 = C0946.m55979("᩷᩻") ^ i41;
                                            i43 = ((iM559718 ^ i42) * 5575) ^ (-1932882109);
                                            i44 = 894901701;
                                        } else {
                                            iM559718 = (i41 - C0946.m55979("ۘ֡")) * 11;
                                            i43 = ((iM559718 ^ i42) * (-30267)) ^ (-728800736);
                                            i44 = 1285488504;
                                        }
                                        break;
                                    case -1744410859:
                                    case -1720708599:
                                        C1071.m56343();
                                        C0845.m55584();
                                        iM559718 = C0946.m55979("᩷᩻") ^ i41;
                                        i43 = ((iM559718 ^ i42) * 5575) ^ (-1932882109);
                                        i44 = 894901701;
                                        break;
                                    case -1732915096:
                                    case 1189461363:
                                        if (C0947.f81895) {
                                            iM559718 = C0946.m55979("ۨᩴ") ^ i41;
                                            i43 = ((iM559718 ^ i42) * (-14129)) ^ 326971072;
                                            i44 = -757291449;
                                        } else {
                                            iM559718 = (i42 - C0946.m55979("۬ܶ")) * 43;
                                            i43 = ((iM559718 ^ i41) * 1337) ^ (-1534183356);
                                            i44 = -1660270419;
                                        }
                                        break;
                                    case -1294890642:
                                    case 17332745:
                                        RunnableC0938.m55938();
                                        throw new RuntimeException();
                                    case -1038758441:
                                    case -139703616:
                                        if (C1025.m56230()) {
                                            iM559718 = C0946.m55979("ۨᩴ") ^ i41;
                                            i43 = ((iM559718 ^ i42) * (-14129)) ^ 326971072;
                                            i44 = -757291449;
                                        } else {
                                            iM559718 = C0873.m55680("᩹۬") ^ i41;
                                            i43 = ((iM559718 ^ i42) * (-29897)) ^ 412213496;
                                            i44 = 125756106;
                                        }
                                        break;
                                    case -936358843:
                                    case 50783637:
                                        if (C0892.f81851) {
                                            iM559718 = (C0946.m55979("֡֡") + i42) * (-31);
                                            i43 = ((iM559718 ^ i41) * (-30091)) ^ 1687431180;
                                            i44 = 263123294;
                                        } else {
                                            iM559718 = C0946.m55979("᩷᩻") ^ i41;
                                            i43 = ((iM559718 ^ i42) * 5575) ^ (-1932882109);
                                            i44 = 894901701;
                                        }
                                        break;
                                    case -719059121:
                                    case -276810065:
                                        if (C0877.m55696()) {
                                            iM559718 = C0873.m55680("ܶۜ") ^ i42;
                                            i43 = ((iM559718 ^ i41) * 31055) ^ 554990022;
                                            i44 = -2046753454;
                                        } else {
                                            iM559718 = C0946.m55979("ۨᩴ") ^ i41;
                                            i43 = ((iM559718 ^ i42) * (-14129)) ^ 326971072;
                                            i44 = -757291449;
                                        }
                                        break;
                                    case -427786269:
                                    case 895979087:
                                        if (!C0917.f81868) {
                                            iM559718 = C0946.m55979("᩷᩻") ^ i41;
                                            i43 = ((iM559718 ^ i42) * 5575) ^ (-1932882109);
                                            i44 = 894901701;
                                        } else {
                                            iM559718 = (i41 - C0873.m55680("ۚ۠")) * (-67);
                                            i43 = ((iM559718 ^ i42) * (-26145)) ^ (-1992083599);
                                            i44 = 11009926;
                                        }
                                        break;
                                    case 105328625:
                                    case 1351266383:
                                        if (RunnableC0897.f81856) {
                                            iM559718 = C0873.m55680("ۜ۠") ^ i42;
                                            i43 = ((iM559718 ^ i41) * 29401) ^ (-406837653);
                                            i44 = 786621219;
                                        } else {
                                            iM559718 = C0946.m55979("֨ۜ") ^ i42;
                                            i43 = ((iM559718 ^ i41) * 27037) ^ 938134850;
                                            i44 = -1879951177;
                                        }
                                        break;
                                    case 857862257:
                                    case 1911166228:
                                        if (C1036.m56257() <= 0) {
                                            iM559718 = C0946.m55979("ۨᩴ") ^ i41;
                                            i43 = ((iM559718 ^ i42) * (-14129)) ^ 326971072;
                                            i44 = -757291449;
                                        } else {
                                            iM559718 = C0946.m55979("ۛᩳ") ^ i41;
                                            i43 = ((iM559718 ^ i42) * 23639) ^ (-479650384);
                                            i44 = -59995243;
                                        }
                                        break;
                                    case 963744500:
                                    case 1936889453:
                                        if (C0906.f81862 >= 0) {
                                            iM559718 = (i41 - C0873.m55680("ۚ۠")) * (-67);
                                            i43 = ((iM559718 ^ i42) * (-26145)) ^ (-1992083599);
                                            i44 = 11009926;
                                        } else {
                                            iM559718 = C0946.m55979("᩺۬") ^ i42;
                                            i43 = ((iM559718 ^ i41) * 25169) ^ (-1010740942);
                                            i44 = -797781413;
                                        }
                                        break;
                                    case 1112377038:
                                    case 1209324762:
                                        if (C1024.f81946) {
                                            iM559718 = C0946.m55979("֨ۜ") ^ i42;
                                            i43 = ((iM559718 ^ i41) * 27037) ^ 938134850;
                                            i44 = -1879951177;
                                        } else {
                                            iM559718 = (i41 - C0873.m55680("֡֨")) * (-99);
                                            i43 = ((iM559718 ^ i42) * (-25655)) ^ (-154277899);
                                            i44 = 790754866;
                                        }
                                        break;
                                    case 1287479900:
                                    case 1817154363:
                                        C1012.m56134();
                                        if (!AbstractC0942.m55971()) {
                                            iM559718 = C0946.m55979("᩷᩻") ^ i41;
                                            i43 = ((iM559718 ^ i42) * 5575) ^ (-1932882109);
                                            i44 = 894901701;
                                        } else {
                                            iM559718 = C0946.m55979("֨ۜ") ^ i42;
                                            i43 = ((iM559718 ^ i41) * 27037) ^ 938134850;
                                            i44 = -1879951177;
                                        }
                                        break;
                                    case 1661303795:
                                    case 2066294413:
                                        C1048.m56305();
                                        if (C1044.m56286() > 0) {
                                            iM559718 = C0946.m55979("᩷᩻") ^ i41;
                                            i43 = ((iM559718 ^ i42) * 5575) ^ (-1932882109);
                                            i44 = 894901701;
                                        } else {
                                            iM559718 = C0873.m55680("᩸ۜ") ^ i42;
                                            i43 = ((iM559718 ^ i41) * (-26403)) ^ 1789479888;
                                            i44 = 1962060033;
                                        }
                                        break;
                                    default:
                                        if (C0906.f81862 >= 0) {
                                            iM559718 = C0946.m55979("᩷᩻") ^ i41;
                                            i43 = ((iM559718 ^ i42) * 5575) ^ (-1932882109);
                                            i44 = 894901701;
                                        } else {
                                            iM559718 = (C0946.m55979("ۖ۫") ^ i41) * (-71);
                                            i43 = ((iM559718 ^ i42) * 22069) ^ 655984690;
                                            i44 = -494041923;
                                        }
                                        break;
                                }
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:46:0x016b A[PHI: r12 r13 r14
                          0x016b: PHI (r12v4 short[]) = (r12v3 short[]), (r12v2 short[]) binds: [B:45:0x0169, B:10:0x005d] A[DONT_GENERATE, DONT_INLINE]
                          0x016b: PHI (r13v4 int) = (r13v3 int), (r13v2 int) binds: [B:45:0x0169, B:10:0x005d] A[DONT_GENERATE, DONT_INLINE]
                          0x016b: PHI (r14v4 int) = (r14v3 int), (r14v2 int) binds: [B:45:0x0169, B:10:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code restructure failed: missing block: B:7:0x0052, code lost:
                        
                            if (p067l.C0892.f81851 != false) goto L8;
                         */
                        @Override // android.content.DialogInterface.OnClickListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void onClick(DialogInterface dialogInterface, int i40) {
                            int iM55685;
                            int i41;
                            int i42;
                            String strM55852;
                            int iM55686;
                            int i43;
                            short[] sArr20;
                            int iM55687;
                            int i44;
                            int i45;
                            int i46;
                            DialogInterfaceOnClickListenerC17339 dialogInterfaceOnClickListenerC17339 = this;
                            int i47 = 134763994;
                            int i48 = C0912.f81867;
                            int i49 = C1071.f81975;
                            int iM559718 = C0946.m55979("ᩳۨ") ^ i48;
                            int i50 = ((iM559718 ^ i49) * 2121) ^ 1012791065;
                            int i51 = iM559718 ^ 2008876993;
                            String str2 = null;
                            short[] sArr21 = null;
                            short[] sArr22 = null;
                            short[] sArr23 = null;
                            int i52 = 0;
                            boolean z = false;
                            int i53 = 0;
                            short s2 = 0;
                            int i54 = 0;
                            int i55 = 0;
                            int i56 = 0;
                            String strM55863 = null;
                            InterfaceC14770 interfaceC14770M55950 = null;
                            String strM55773 = null;
                            String strM55639 = null;
                            while (true) {
                                i47 = i51 ^ (i50 & (((i47 ^ i49) * (-4993)) >> 31));
                                switch (i47) {
                                    case -2078280996:
                                    case 317738935:
                                        C0949.m56017(checkBox2, z);
                                        break;
                                    case -2063732729:
                                    case -1175915108:
                                        sArr22 = f82246;
                                        i55 = 1;
                                        i56 = 1;
                                        if (RunnableC0938.m55938() != 0) {
                                            iM55685 = (C0946.m55979("ᩳܺ") ^ i48) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                            i41 = ((iM55685 ^ i49) * 2973) ^ 834851996;
                                            i42 = 1686508378;
                                        } else {
                                            iM55685 = C0873.m55680("ۜۙ") ^ i48;
                                            i41 = ((iM55685 ^ i49) * 18189) ^ 477535272;
                                            i42 = -933214168;
                                        }
                                        i51 = iM55685 ^ i42;
                                        i50 = i41;
                                        break;
                                    case -1951774527:
                                    case 750351356:
                                        strM55773 = C0894.m55773(sArr22, i55, i56, i54);
                                        if (C0898.m55799(strM55639, strM55773)) {
                                            str2 = strM55639;
                                            iM55685 = C0946.m55979("ۚܶ") ^ i49;
                                            i41 = ((iM55685 ^ i48) * (-4807)) ^ 1415735921;
                                            i42 = -2086744430;
                                        } else {
                                            iM55685 = (i49 - C0873.m55680("ᩴ᩻")) * 3;
                                            i41 = ((iM55685 ^ i48) * 21203) ^ 425427039;
                                            i42 = -1054542518;
                                        }
                                        i51 = iM55685 ^ i42;
                                        i50 = i41;
                                        break;
                                    case -1823752082:
                                    case -611992920:
                                        i53 = 70;
                                        if (C0866.f81837 < 0) {
                                            iM55685 = C0873.m55680("֨᩶") ^ i49;
                                            i41 = ((iM55685 ^ i48) * (-3413)) ^ (-1567952334);
                                            i42 = 949799314;
                                            i51 = iM55685 ^ i42;
                                            i50 = i41;
                                        } else {
                                            sArr20 = sArr21;
                                            iM55687 = C0873.m55680("۫ۖ") ^ i49;
                                            i44 = ((iM55687 ^ i48) * 6809) ^ (-1562411520);
                                            i45 = -1136393650;
                                            i51 = iM55687 ^ i45;
                                            sArr21 = sArr20;
                                            i50 = i44;
                                            dialogInterfaceOnClickListenerC17339 = this;
                                        }
                                        break;
                                    case -1694563899:
                                    case 148713282:
                                        RunnableC0938.m55938();
                                        iM55685 = (C0946.m55979("᩹֨") ^ i48) * (-57);
                                        i41 = ((iM55685 ^ i49) * (-6587)) ^ (-314208697);
                                        i42 = -1135569979;
                                        i51 = iM55685 ^ i42;
                                        i50 = i41;
                                        break;
                                    case -1524249650:
                                    case -745118921:
                                        interfaceC14770M55950 = ViewOnClickListenerC0939.m55950(ApplicationC21448.f67649);
                                        sArr23 = f82246;
                                        if (C1044.m56286() > 0) {
                                            iM55685 = (C0873.m55680("᩺ܶ") + i48) * 109;
                                            i41 = ((iM55685 ^ i49) * 5611) ^ 176798966;
                                            i42 = 88453880;
                                            i51 = iM55685 ^ i42;
                                            i50 = i41;
                                        } else {
                                            iM55686 = C0946.m55979("ܳ᩸") ^ i49;
                                            i50 = ((iM55686 ^ i48) * 23471) ^ 1414688156;
                                            i43 = 1104902560;
                                            i51 = iM55686 ^ i43;
                                            dialogInterfaceOnClickListenerC17339 = this;
                                        }
                                        break;
                                    case -1408250186:
                                    case -738227947:
                                        if (C0930.m55885() <= 0) {
                                            iM55686 = C0946.m55979("ܳ᩸") ^ i49;
                                            i50 = ((iM55686 ^ i48) * 23471) ^ 1414688156;
                                            i43 = 1104902560;
                                        } else {
                                            iM55686 = (i48 - C0873.m55680("ᩳۚ")) * (-61);
                                            i50 = ((iM55686 ^ i49) * 6769) ^ (-1396880106);
                                            i43 = 801649304;
                                        }
                                        i51 = iM55686 ^ i43;
                                        dialogInterfaceOnClickListenerC17339 = this;
                                        break;
                                    case -1344523890:
                                    case 1415325176:
                                        C0992.m56107();
                                        break;
                                    case -1059885986:
                                    case -156852801:
                                        sArr20 = f82246;
                                        if (ServiceConnectionC1013.f81940 >= 0) {
                                            iM55687 = C0873.m55680("۫ۖ") ^ i49;
                                            i44 = ((iM55687 ^ i48) * 6809) ^ (-1562411520);
                                            i45 = -1136393650;
                                        } else {
                                            iM55687 = (i48 - C0873.m55680("᩵۫")) * 59;
                                            i44 = ((iM55687 ^ i49) * 25417) ^ 1060214411;
                                            i45 = 1458289646;
                                        }
                                        i51 = iM55687 ^ i45;
                                        sArr21 = sArr20;
                                        i50 = i44;
                                        dialogInterfaceOnClickListenerC17339 = this;
                                        break;
                                    case -971962269:
                                    case 1847925234:
                                        strM55639 = C0863.m55639(C1404.m56467(c120912));
                                        if (C1194.m56397(strM55639)) {
                                            iM55685 = (i48 - C0946.m55979("᩸۬")) * (-25);
                                            i41 = ((iM55685 ^ i49) * 24567) ^ 1847444161;
                                            i42 = -1422909306;
                                        } else {
                                            iM55685 = C0946.m55979("ܿ۫") ^ i49;
                                            i41 = ((iM55685 ^ i48) * (-13275)) ^ (-1166742365);
                                            i42 = -1621898032;
                                        }
                                        i51 = iM55685 ^ i42;
                                        i50 = i41;
                                        break;
                                    case -971542572:
                                    case -76522570:
                                        C1194.m56383(RunnableC0871.m55665(interfaceC14770M55950, strM55863, str2));
                                        z = true;
                                        if (C1124.m56367() < 0) {
                                            iM55685 = (C0873.m55680("ܽ۫") + i48) * (-29);
                                            i41 = ((iM55685 ^ i49) * 27217) ^ (-918126611);
                                            i42 = 1125819345;
                                            i51 = iM55685 ^ i42;
                                            i50 = i41;
                                        } else {
                                            sArr20 = sArr21;
                                            iM55687 = C0873.m55680("۫ۖ") ^ i49;
                                            i44 = ((iM55687 ^ i48) * 6809) ^ (-1562411520);
                                            i45 = -1136393650;
                                            i51 = iM55687 ^ i45;
                                            sArr21 = sArr20;
                                            i50 = i44;
                                            dialogInterfaceOnClickListenerC17339 = this;
                                        }
                                        break;
                                    case -907393308:
                                    case 120619765:
                                        s2 = sArr21[0];
                                        if (AbstractC0942.f81890 > 0) {
                                            iM55686 = (i49 - C0946.m55979("᩵᩺")) * 19;
                                            i50 = ((iM55686 ^ i48) * (-17399)) ^ (-256011476);
                                            i43 = -222252064;
                                            i51 = iM55686 ^ i43;
                                            dialogInterfaceOnClickListenerC17339 = this;
                                        } else {
                                            i46 = i52;
                                            int iM55688 = C0873.m55680("ۨᩳ") ^ i48;
                                            i41 = ((iM55688 ^ i49) * (-27649)) ^ (-1871456092);
                                            i51 = iM55688 ^ 1304942962;
                                            dialogInterfaceOnClickListenerC17339 = this;
                                            i52 = i46;
                                            i50 = i41;
                                        }
                                        break;
                                    case -894337946:
                                    case -888024505:
                                        strM55852 = C0917.m55852(f82246, 2, 68, i54);
                                        str2 = strM55852;
                                        iM55685 = C0946.m55979("ۚܶ") ^ i49;
                                        i41 = ((iM55685 ^ i48) * (-4807)) ^ 1415735921;
                                        i42 = -2086744430;
                                        i51 = iM55685 ^ i42;
                                        i50 = i41;
                                        break;
                                    case -286809882:
                                    case 1734368965:
                                        C0912.m55833();
                                        if (C0882.f81846) {
                                            iM55685 = (C0946.m55979("᩹֨") ^ i48) * (-57);
                                            i41 = ((iM55685 ^ i49) * (-6587)) ^ (-314208697);
                                            i42 = -1135569979;
                                        } else {
                                            iM55685 = (C0946.m55979("ᩳܺ") ^ i48) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                            i41 = ((iM55685 ^ i49) * 2973) ^ 834851996;
                                            i42 = 1686508378;
                                        }
                                        i51 = iM55685 ^ i42;
                                        i50 = i41;
                                        break;
                                    case 235795053:
                                    case 414047464:
                                        break;
                                    case 505929372:
                                    case 897454704:
                                        strM55863 = C0927.m55863(sArr23, i53, 17, i54);
                                        if (!C0949.m56012()) {
                                            iM55685 = (i49 - C0946.m55979("֡ۨ")) * 47;
                                            i41 = ((iM55685 ^ i48) * 10429) ^ 814880661;
                                            i42 = -416494367;
                                            i51 = iM55685 ^ i42;
                                            i50 = i41;
                                        }
                                        i46 = i52;
                                        int iM55689 = C0873.m55680("ۨᩳ") ^ i48;
                                        i41 = ((iM55689 ^ i49) * (-27649)) ^ (-1871456092);
                                        i51 = iM55689 ^ 1304942962;
                                        dialogInterfaceOnClickListenerC17339 = this;
                                        i52 = i46;
                                        i50 = i41;
                                        break;
                                    case 762446305:
                                    case 1509929200:
                                        i46 = (s2 * s2) + 349503025;
                                        if (!RunnableC1014.m56177()) {
                                            int iM556810 = C0873.m55680("ۨᩳ") ^ i48;
                                            i41 = ((iM556810 ^ i49) * (-27649)) ^ (-1871456092);
                                            i51 = iM556810 ^ 1304942962;
                                            dialogInterfaceOnClickListenerC17339 = this;
                                            i52 = i46;
                                            i50 = i41;
                                        } else {
                                            int iM559719 = (C0946.m55979("ܽ۬") ^ i48) * (-51);
                                            i51 = iM559719 ^ 746833218;
                                            i52 = i46;
                                            i50 = ((iM559719 ^ i49) * 27961) ^ (-1828044255);
                                            dialogInterfaceOnClickListenerC17339 = this;
                                        }
                                        break;
                                    case 793328121:
                                    case 1485694656:
                                        i54 = 38382;
                                        iM55685 = C0873.m55680("᩸᩷") ^ i49;
                                        i41 = ((iM55685 ^ i48) * (-18759)) ^ (-309505790);
                                        i42 = -525756324;
                                        i51 = iM55685 ^ i42;
                                        i50 = i41;
                                        break;
                                    case 837220747:
                                    case 2022671482:
                                        if (!C1048.f81963) {
                                            sArr20 = sArr21;
                                            iM55687 = C0873.m55680("۫ۖ") ^ i49;
                                            i44 = ((iM55687 ^ i48) * 6809) ^ (-1562411520);
                                            i45 = -1136393650;
                                            i51 = iM55687 ^ i45;
                                            sArr21 = sArr20;
                                            i50 = i44;
                                            dialogInterfaceOnClickListenerC17339 = this;
                                        } else {
                                            iM55685 = (C0946.m55979("᩹֨") ^ i48) * (-57);
                                            i41 = ((iM55685 ^ i49) * (-6587)) ^ (-314208697);
                                            i42 = -1135569979;
                                            i51 = iM55685 ^ i42;
                                            i50 = i41;
                                        }
                                        break;
                                    case 880076416:
                                    case 2008625744:
                                        if (!C0937.f81884) {
                                            i46 = i52;
                                            int iM556811 = C0873.m55680("ۨᩳ") ^ i48;
                                            i41 = ((iM556811 ^ i49) * (-27649)) ^ (-1871456092);
                                            i51 = iM556811 ^ 1304942962;
                                            dialogInterfaceOnClickListenerC17339 = this;
                                            i52 = i46;
                                            i50 = i41;
                                        } else {
                                            iM55686 = (C0873.m55680("ܰ֡") ^ i49) * 9;
                                            i50 = ((iM55686 ^ i48) * (-4649)) ^ 1118204136;
                                            i43 = -1888839380;
                                            i51 = iM55686 ^ i43;
                                            dialogInterfaceOnClickListenerC17339 = this;
                                        }
                                        break;
                                    case 1379280157:
                                    case 1793704795:
                                        if ((37390 * s2) - i52 > 0) {
                                            iM55685 = C0946.m55979("ܺۗ") ^ i48;
                                            i41 = ((iM55685 ^ i49) * (-13)) ^ (-1359762126);
                                            i42 = 457694089;
                                        } else {
                                            iM55685 = (i49 - C0873.m55680("᩵۟")) * 83;
                                            i41 = ((iM55685 ^ i48) * 19851) ^ 704791001;
                                            i42 = -649090747;
                                        }
                                        i51 = iM55685 ^ i42;
                                        i50 = i41;
                                        break;
                                    case 1418902855:
                                    case 1858939116:
                                        i54 = 11143;
                                        iM55685 = C0873.m55680("᩸᩷") ^ i49;
                                        i41 = ((iM55685 ^ i48) * (-18759)) ^ (-309505790);
                                        i42 = -525756324;
                                        i51 = iM55685 ^ i42;
                                        i50 = i41;
                                        break;
                                    default:
                                        strM55852 = C0989.m56096(strM55639, strM55773);
                                        str2 = strM55852;
                                        iM55685 = C0946.m55979("ۚܶ") ^ i49;
                                        i41 = ((iM55685 ^ i48) * (-4807)) ^ 1415735921;
                                        i42 = -2086744430;
                                        i51 = iM55685 ^ i42;
                                        i50 = i41;
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    sArr13 = f82967;
                    if (C1929.f83011 == 0) {
                        int iM55685 = (C0873.m55680("᩸ۛ") ^ i19) * (-119);
                        i21 = iM55685 ^ 701939971;
                        c120910 = c120912;
                        i20 = ((iM55685 ^ i18) * 7457) ^ 263142021;
                        checkBox2 = checkBox;
                    } else {
                        c120910 = c120912;
                        sArr15 = sArr15;
                        sArr13 = sArr13;
                        strM55717 = strM55717;
                        main = main;
                        int i311 = i26;
                        sArr10 = sArr10;
                        i25 = i25;
                        i = i311;
                        iM55979 = C0873.m55680("֫ܶ") ^ i19;
                        i20 = ((iM55979 ^ i18) * (-29261)) ^ (-1350860462);
                        i2 = 1159661504;
                        i3 = iM55979 ^ i2;
                        c120910 = c120910;
                        main = main;
                        strM55717 = strM55717;
                        interfaceC14100 = interfaceC14100;
                        sArr13 = sArr13;
                        sArr15 = sArr15;
                        sArr11 = sArr11;
                        i28 = i28;
                        i27 = i27;
                        i21 = i3;
                        checkBox2 = checkBox;
                        int i312 = i;
                        i25 = i25;
                        sArr10 = sArr10;
                        i26 = i312;
                    }
                    break;
                case -277490012:
                case 1795274504:
                    interfaceC14100 = interfaceC14100;
                    i27 = i27;
                    i28 = i28;
                    sArr11 = sArr11;
                    c120910 = c120910;
                    sArr15 = sArr15;
                    sArr13 = sArr13;
                    strM55717 = strM55717;
                    main = main;
                    int i40 = i26;
                    sArr10 = sArr10;
                    i25 = i25;
                    i = i40;
                    iM559714 = C0946.m55979(str) ^ 2104236697;
                    if (C1017.f81942 >= 0) {
                        iM55979 = C0873.m55680("֫ܶ") ^ i19;
                        i20 = ((iM55979 ^ i18) * (-29261)) ^ (-1350860462);
                        i2 = 1159661504;
                    } else {
                        iM55979 = (i19 - C0946.m55979("֫ۖ")) * (-87);
                        i20 = ((iM55979 ^ i18) * (-16723)) ^ 529438155;
                        i2 = -1551016427;
                    }
                    i3 = iM55979 ^ i2;
                    c120910 = c120910;
                    main = main;
                    strM55717 = strM55717;
                    interfaceC14100 = interfaceC14100;
                    sArr13 = sArr13;
                    sArr15 = sArr15;
                    sArr11 = sArr11;
                    i28 = i28;
                    i27 = i27;
                    i21 = i3;
                    checkBox2 = checkBox;
                    int i313 = i;
                    i25 = i25;
                    sArr10 = sArr10;
                    i26 = i313;
                    break;
                case -261499110:
                case 2038517039:
                    interfaceC14100 = interfaceC14100;
                    i27 = i27;
                    i28 = i28;
                    sArr11 = sArr11;
                    c120910 = c120910;
                    sArr15 = sArr15;
                    sArr13 = sArr13;
                    int i41 = i26;
                    sArr10 = sArr10;
                    i25 = i25;
                    i = i41;
                    short[] sArr20 = sArr9;
                    strM55717 = C0882.m55717(sArr20, 156, 17, i22);
                    if (C0877.f81843 < 0) {
                        int iM55686 = C0873.m55680("᩵ᩳ") ^ i18;
                        i20 = ((iM55686 ^ i19) * (-22763)) ^ (-1903377453);
                        i3 = iM55686 ^ (-1272493728);
                        sArr9 = sArr20;
                        c120910 = c120910;
                        sArr13 = sArr13;
                        sArr15 = sArr15;
                        interfaceC14100 = interfaceC14100;
                        sArr11 = sArr11;
                        i28 = i28;
                        i27 = i27;
                        i21 = i3;
                        checkBox2 = checkBox;
                        int i314 = i;
                        i25 = i25;
                        sArr10 = sArr10;
                        i26 = i314;
                    } else {
                        sArr9 = sArr20;
                        strM55717 = strM55717;
                        main = main;
                        iM55979 = (C0946.m55979("ۘᩳ") + i18) * (-69);
                        i20 = ((iM55979 ^ i19) * 14517) ^ (-1368804227);
                        i2 = 9854816;
                        i3 = iM55979 ^ i2;
                        c120910 = c120910;
                        main = main;
                        strM55717 = strM55717;
                        interfaceC14100 = interfaceC14100;
                        sArr13 = sArr13;
                        sArr15 = sArr15;
                        sArr11 = sArr11;
                        i28 = i28;
                        i27 = i27;
                        i21 = i3;
                        checkBox2 = checkBox;
                        int i315 = i;
                        i25 = i25;
                        sArr10 = sArr10;
                        i26 = i315;
                    }
                    break;
                case -46263518:
                case 2082788328:
                    C1964.m56597();
                    break;
                case -27163086:
                case 48789599:
                    int i42 = i27;
                    int i43 = i28;
                    short[] sArr21 = sArr11;
                    short[] sArr22 = sArr15;
                    short[] sArr23 = sArr13;
                    String str2 = strM55717;
                    short s2 = f82967[149];
                    int i44 = s2 + 10941;
                    i24 = i44 * i44;
                    int iM559718 = (i18 - C0946.m55979("ᩳۖ")) * (-63);
                    s = s2;
                    c120910 = c120910;
                    checkBox2 = checkBox;
                    interfaceC14100 = interfaceC14100;
                    i21 = iM559718 ^ 1829370461;
                    i20 = ((iM559718 ^ i19) * 29035) ^ 1927444286;
                    main = main;
                    strM55717 = str2;
                    sArr13 = sArr23;
                    sArr15 = sArr22;
                    sArr11 = sArr21;
                    i28 = i43;
                    i27 = i42;
                    i25 = i25;
                    sArr10 = sArr10;
                    i26 = i26;
                    break;
                case 49489692:
                case 1859041581:
                    int i45 = i27;
                    int i46 = i28;
                    short[] sArr24 = sArr11;
                    int i47 = i26;
                    sArr10 = sArr10;
                    i25 = i25;
                    i = i47;
                    Main main2 = viewOnClickListenerC21364.f67355;
                    String strM55936 = RunnableC0938.m55936(f82967, 150, 3, i22);
                    int iM559719 = C0946.m55979("ᩳۘ") ^ i18;
                    strM55717 = strM55717;
                    c120910 = c120910;
                    sArr13 = sArr13;
                    sArr15 = sArr15;
                    interfaceC14100 = interfaceC14100;
                    sArr11 = sArr24;
                    i28 = i46;
                    i27 = i45;
                    i21 = iM559719 ^ (-909299039);
                    i20 = ((iM559719 ^ i19) * (-22161)) ^ 497753841;
                    main = main2;
                    str = strM55936;
                    checkBox2 = checkBox;
                    int i316 = i;
                    i25 = i25;
                    sArr10 = sArr10;
                    i26 = i316;
                    break;
                case 148270587:
                case 1949564406:
                    C0967.m56076(c20671M55888, iM559716, null);
                    dialogInterfaceOnClickListenerC6479 = new DialogInterfaceOnClickListenerC6479(1, checkBox2);
                    sArr12 = f82967;
                    i30 = 262;
                    iM559711 = C0873.m55680("ۜܳ") ^ i18;
                    i6 = ((iM559711 ^ i19) * 32465) ^ (-1523780386);
                    i7 = -1901140482;
                    i21 = iM559711 ^ i7;
                    i20 = i6;
                    break;
                case 157833552:
                case 960059894:
                    int i48 = i27;
                    i28 = i28;
                    sArr11 = sArr11;
                    c12096 = c120910;
                    sArr15 = sArr15;
                    sArr13 = sArr13;
                    C1048.m56304(C0892.m55755(viewM56111, iM559715), viewOnClickListenerC11051);
                    i27 = i48;
                    strM56029 = C0955.m56029(f82967, 247, 3, i22);
                    if (!C0947.f81895) {
                        iM559710 = C0946.m55979("᩷᩻") ^ i19;
                        i4 = ((iM559710 ^ i18) * (-1565)) ^ (-978973789);
                        i5 = 156576841;
                        i13 = iM559710 ^ i5;
                        c120910 = c12096;
                        i20 = i4;
                        sArr13 = sArr13;
                        sArr15 = sArr15;
                        sArr11 = sArr11;
                        i28 = i28;
                        i27 = i27;
                        i21 = i13;
                        checkBox2 = checkBox;
                    } else {
                        interfaceC14100 = interfaceC14100;
                        strM55717 = strM55717;
                        c120910 = c12096;
                        main = main;
                        int i49 = i26;
                        sArr10 = sArr10;
                        i25 = i25;
                        i = i49;
                        iM55979 = (C0946.m55979("ۘᩳ") + i18) * (-69);
                        i20 = ((iM55979 ^ i19) * 14517) ^ (-1368804227);
                        i2 = 9854816;
                        i3 = iM55979 ^ i2;
                        c120910 = c120910;
                        main = main;
                        strM55717 = strM55717;
                        interfaceC14100 = interfaceC14100;
                        sArr13 = sArr13;
                        sArr15 = sArr15;
                        sArr11 = sArr11;
                        i28 = i28;
                        i27 = i27;
                        i21 = i3;
                        checkBox2 = checkBox;
                        int i317 = i;
                        i25 = i25;
                        sArr10 = sArr10;
                        i26 = i317;
                    }
                    break;
                case 297831908:
                case 2055160289:
                    short[] sArr25 = sArr11;
                    View viewM56465 = C1404.m56465(viewM56111, C0873.m55680(C0894.m55773(sArr25, 253, 3, i22)) ^ 2098243757);
                    int iM559720 = (C0946.m55979("۫ۨ") ^ i19) * 85;
                    i21 = iM559720 ^ 1674239164;
                    c120910 = c120910;
                    i20 = ((iM559720 ^ i18) * 21361) ^ 1707520140;
                    checkBox2 = checkBox;
                    sArr11 = sArr25;
                    view = viewM56465;
                    break;
                case 300263374:
                case 669713243:
                    short[] sArr26 = sArr15;
                    short[] sArr27 = sArr13;
                    C0947.m55996(C0892.m55755(viewM56111, C0946.m55979(strM56029) ^ 2124065925), viewOnClickListenerC11051);
                    int iM559721 = C0946.m55979("۠֨") ^ i18;
                    int i50 = ((iM559721 ^ i19) * (-16005)) ^ (-51229877);
                    i21 = iM559721 ^ 316379538;
                    checkBox2 = checkBox;
                    c120910 = c120910;
                    i20 = i50;
                    sArr13 = sArr27;
                    sArr15 = sArr26;
                    sArr11 = sArr11;
                    i28 = i28;
                    i27 = i27;
                    break;
                case 320154331:
                case 1629260919:
                    i27 = i27;
                    i28 = i28;
                    sArr11 = sArr11;
                    sArr15 = sArr15;
                    sArr13 = sArr13;
                    int i51 = i26;
                    sArr10 = sArr10;
                    i25 = i25;
                    i = i51;
                    c120910 = (C12096) C1404.m56465(viewM56111, iM559713 ^ i23);
                    interfaceC14100 = ApplicationC21448.f67649;
                    sArr9 = f82967;
                    int iM559722 = (i18 - C0946.m55979("ܶ᩶")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i20 = ((iM559722 ^ i19) * 21497) ^ 1966101043;
                    i3 = iM559722 ^ 1235013999;
                    strM55717 = strM55717;
                    sArr13 = sArr13;
                    sArr15 = sArr15;
                    sArr11 = sArr11;
                    i28 = i28;
                    i27 = i27;
                    i21 = i3;
                    checkBox2 = checkBox;
                    int i318 = i;
                    i25 = i25;
                    sArr10 = sArr10;
                    i26 = i318;
                    break;
                case 361127648:
                case 388675719:
                    interfaceC14100 = interfaceC14100;
                    i27 = i27;
                    i28 = i28;
                    sArr11 = sArr11;
                    c120910 = c120910;
                    sArr15 = sArr15;
                    sArr13 = sArr13;
                    strM55717 = strM55717;
                    main = main;
                    int i52 = i26;
                    sArr10 = sArr10;
                    i25 = i25;
                    i = i52;
                    int i53 = (s * s) + 119705481;
                    if (i24 - (i53 + i53) > 0) {
                        iM55979 = (C0873.m55680("᩷ۗ") ^ i19) * (-67);
                        i20 = ((iM55979 ^ i18) * (-6721)) ^ (-1848204442);
                        i2 = 1823327089;
                    } else {
                        iM55979 = C0946.m55979("᩸ۖ") ^ i19;
                        i20 = ((iM55979 ^ i18) * 17609) ^ 665517991;
                        i2 = -779410020;
                    }
                    i3 = iM55979 ^ i2;
                    c120910 = c120910;
                    main = main;
                    strM55717 = strM55717;
                    interfaceC14100 = interfaceC14100;
                    sArr13 = sArr13;
                    sArr15 = sArr15;
                    sArr11 = sArr11;
                    i28 = i28;
                    i27 = i27;
                    i21 = i3;
                    checkBox2 = checkBox;
                    int i319 = i;
                    i25 = i25;
                    sArr10 = sArr10;
                    i26 = i319;
                    break;
                case 404670881:
                case 921425116:
                    short[] sArr28 = sArr15;
                    i15 = i27;
                    c12099 = c120910;
                    sArr4 = sArr13;
                    i14 = i28;
                    sArr7 = sArr28;
                    C1048.m56304(C1404.m56465(viewM56111, C0946.m55979(C0927.m55863(sArr28, i15, i14, i22)) ^ 2120899672), viewOnClickListenerC11051);
                    sArr8 = f82967;
                    if (C1929.f83011 != 0) {
                        iM55681 = (C0873.m55680("ܽ۬") + i18) * (-81);
                        sArr5 = sArr8;
                        i16 = ((iM55681 ^ i19) * 10295) ^ (-2027609707);
                        i17 = -1826769571;
                    } else {
                        iM55681 = C0873.m55680("ܽ۟") ^ i18;
                        sArr5 = sArr8;
                        i16 = ((iM55681 ^ i19) * (-2113)) ^ (-1474287991);
                        i17 = 930853990;
                    }
                    i21 = iM55681 ^ i17;
                    c120910 = c12099;
                    i27 = i15;
                    i20 = i16;
                    checkBox2 = checkBox;
                    short[] sArr110 = sArr5;
                    i28 = i14;
                    sArr13 = sArr4;
                    sArr15 = sArr7;
                    sArr11 = sArr110;
                    break;
                case 554946312:
                case 1805832413:
                    break;
                case 760799260:
                case 1207053016:
                    C0898.m55800();
                    if (C1048.m56305() < 0) {
                        i8 = i26;
                        i27 = i27;
                        i28 = i28;
                        sArr11 = sArr11;
                        c12097 = c120910;
                        sArr3 = sArr10;
                        sArr = sArr15;
                        sArr2 = sArr13;
                        i9 = i25;
                        iM55680 = (C0946.m55979("᩹ۜ") + i18) * 93;
                        i10 = i9;
                        i11 = ((iM55680 ^ i19) * (-28447)) ^ 1449354754;
                        i12 = -941567474;
                        i13 = iM55680 ^ i12;
                        c120910 = c12097;
                        i20 = i11;
                        i25 = i10;
                        sArr10 = sArr3;
                        sArr13 = sArr2;
                        sArr15 = sArr;
                        i26 = i8;
                        sArr11 = sArr11;
                        i28 = i28;
                        i27 = i27;
                        i21 = i13;
                        checkBox2 = checkBox;
                    } else {
                        sArr6 = sArr15;
                        c12098 = c120910;
                        sArr4 = sArr13;
                        i14 = i28;
                        sArr5 = sArr11;
                        int iM55687 = (i19 - C0873.m55680("ۗ֫")) * 87;
                        sArr7 = sArr6;
                        i16 = ((iM55687 ^ i18) * (-20385)) ^ 2091683928;
                        i21 = iM55687 ^ 523001164;
                        c120910 = c12098;
                        i20 = i16;
                        checkBox2 = checkBox;
                        short[] sArr111 = sArr5;
                        i28 = i14;
                        sArr13 = sArr4;
                        sArr15 = sArr7;
                        sArr11 = sArr111;
                    }
                    break;
                case 1260760102:
                case 1817519550:
                    C0906.m55817(c20671M55888, C0873.m55680(C0912.m55822(sArr13, 256, 3, i22)) ^ 2125642984, onClickListener);
                    sArr14 = f82967;
                    iM559711 = C0946.m55979("۫ۗ") ^ i18;
                    i6 = ((iM559711 ^ i19) * (-31787)) ^ (-2142081840);
                    i7 = -98551885;
                    i21 = iM559711 ^ i7;
                    i20 = i6;
                    break;
                case 1370502439:
                case 1731229859:
                    i27 = i27;
                    i28 = i28;
                    sArr11 = sArr11;
                    c12096 = c120910;
                    sArr15 = sArr15;
                    sArr13 = sArr13;
                    iM559715 = C0946.m55979(C0947.m55993(f82967, 244, 3, i22)) ^ 2122740026;
                    iM559710 = C0873.m55680("ۡۨ") ^ i18;
                    i4 = ((iM559710 ^ i19) * 25417) ^ (-227487105);
                    i5 = 802380727;
                    i13 = iM559710 ^ i5;
                    c120910 = c12096;
                    i20 = i4;
                    sArr13 = sArr13;
                    sArr15 = sArr15;
                    sArr11 = sArr11;
                    i28 = i28;
                    i27 = i27;
                    i21 = i13;
                    checkBox2 = checkBox;
                    break;
                default:
                    i = i26;
                    i22 = 5959;
                    iM55979 = (C0946.m55979("ܺ۠") ^ i18) * (-63);
                    i20 = ((iM55979 ^ i19) * (-6573)) ^ (-1597634367);
                    i2 = 1964902842;
                    i3 = iM55979 ^ i2;
                    c120910 = c120910;
                    main = main;
                    strM55717 = strM55717;
                    interfaceC14100 = interfaceC14100;
                    sArr13 = sArr13;
                    sArr15 = sArr15;
                    sArr11 = sArr11;
                    i28 = i28;
                    i27 = i27;
                    i21 = i3;
                    checkBox2 = checkBox;
                    int i3110 = i;
                    i25 = i25;
                    sArr10 = sArr10;
                    i26 = i3110;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:87:0x038b A[PHI: r7 r8 r12 r19 r20 r21
      0x038b: PHI (r7v7 java.lang.String) = 
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
      (r7v3 java.lang.String)
      (r7v2 java.lang.String)
     binds: [B:86:0x0389, B:82:0x0368, B:78:0x0346, B:70:0x02e5, B:44:0x018e, B:13:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x038b: PHI (r8v5 java.lang.String) = 
      (r8v2 java.lang.String)
      (r8v2 java.lang.String)
      (r8v2 java.lang.String)
      (r8v2 java.lang.String)
      (r8v2 java.lang.String)
      (r8v6 java.lang.String)
     binds: [B:86:0x0389, B:82:0x0368, B:78:0x0346, B:70:0x02e5, B:44:0x018e, B:13:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x038b: PHI (r12v6 short) = (r12v2 short), (r12v2 short), (r12v2 short), (r12v3 short), (r12v2 short), (r12v2 short) binds: [B:86:0x0389, B:82:0x0368, B:78:0x0346, B:70:0x02e5, B:44:0x018e, B:13:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x038b: PHI (r19v38 l.ۡ᩺ܽ) = (r19v14 l.ۡ᩺ܽ), (r19v15 l.ۡ᩺ܽ), (r19v16 l.ۡ᩺ܽ), (r19v18 l.ۡ᩺ܽ), (r19v30 l.ۡ᩺ܽ), (r19v39 l.ۡ᩺ܽ) binds: [B:86:0x0389, B:82:0x0368, B:78:0x0346, B:70:0x02e5, B:44:0x018e, B:13:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x038b: PHI (r20v7 int) = (r20v3 int), (r20v3 int), (r20v3 int), (r20v4 int), (r20v3 int), (r20v3 int) binds: [B:86:0x0389, B:82:0x0368, B:78:0x0346, B:70:0x02e5, B:44:0x018e, B:13:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x038b: PHI (r21v31 bin.mt.plus.Main) = 
      (r21v2 bin.mt.plus.Main)
      (r21v3 bin.mt.plus.Main)
      (r21v4 bin.mt.plus.Main)
      (r21v6 bin.mt.plus.Main)
      (r21v21 bin.mt.plus.Main)
      (r21v32 bin.mt.plus.Main)
     binds: [B:86:0x0389, B:82:0x0368, B:78:0x0346, B:70:0x02e5, B:44:0x018e, B:13:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static void m48392(final ViewOnClickListenerC21364 viewOnClickListenerC21364, DialogInterfaceC2564 dialogInterfaceC2564, String str, final CheckBox checkBox) {
        int iM55979;
        int i;
        int i2;
        int iM559710;
        int i3;
        int i4;
        int iM559711;
        int i5;
        int i6;
        int i7 = C0873.f81841;
        int i8 = C1124.f82007;
        int iM559712 = (i7 - C0946.m55979("ۧ᩺")) * (-109);
        int i9 = ((iM559712 ^ i8) * 19645) ^ (-1758519183);
        String strM56403 = null;
        short[] sArr = null;
        int i10 = iM559712 ^ 713105545;
        short s = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -849856561;
        int i14 = 0;
        String str2 = null;
        String strM56252 = null;
        InterfaceC14770 interfaceC14770M55814 = null;
        final C11108 c11108M40435 = null;
        Exception exc = null;
        ArrayList arrayList = null;
        Main main = null;
        while (true) {
            i13 = i10 ^ (i9 & (((i13 ^ i8) * 5293) >> 31));
            switch (i13) {
                case -1939784428:
                case 177430708:
                    C1194.m56383(C1025.m56231(interfaceC14770M55814, strM56252, c11108M40435.f30809));
                    if (C1017.m56195(c11108M40435.f30810)) {
                        iM559711 = C0946.m55979("֫᩺") ^ i8;
                        c11108M40435 = c11108M40435;
                        i5 = ((iM559711 ^ i7) * 27845) ^ (-1858563587);
                        i6 = -1509171746;
                    } else {
                        c11108M40435 = c11108M40435;
                        iM559711 = (C0946.m55979("ܳܳ") ^ i8) * (-127);
                        i5 = ((iM559711 ^ i7) * 4435) ^ 1395984643;
                        i6 = -208993199;
                    }
                    C11108 c11108 = c11108M40435;
                    i10 = iM559711 ^ i6;
                    i9 = i5;
                    c11108M40435 = c11108;
                    break;
                case -1635167684:
                case 795490066:
                    main = main;
                    c11108M40435 = c11108M40435;
                    if (RunnableC0897.m55784()) {
                        iM559710 = (C0946.m55979("֨֡") ^ i8) * 53;
                        i3 = ((iM559710 ^ i7) * (-15463)) ^ (-1897979062);
                        i4 = 816224764;
                    } else {
                        iM559710 = (i7 - C0873.m55680("᩺ܰ")) * (-53);
                        i3 = ((iM559710 ^ i8) * (-2503)) ^ 661316101;
                        i4 = 327340333;
                    }
                    int i15 = iM559710 ^ i4;
                    c11108M40435 = c11108M40435;
                    i10 = i15;
                    i9 = i3;
                    main = main;
                    break;
                case -1610725392:
                case 740774394:
                    if (!C1929.m56553()) {
                        iM55979 = (C0873.m55680("ۢ۠") + i8) * (-9);
                        i = ((iM55979 ^ i7) * (-11253)) ^ (-237578772);
                        i2 = 1572804104;
                        i10 = iM55979 ^ i2;
                        i9 = i;
                    } else {
                        main = main;
                        c11108M40435 = c11108M40435;
                        iM559710 = (C0873.m55680("ۡܰ") ^ i7) * 67;
                        i3 = ((iM559710 ^ i8) * 29305) ^ 299117978;
                        i4 = 1707305884;
                        int i16 = iM559710 ^ i4;
                        c11108M40435 = c11108M40435;
                        i10 = i16;
                        i9 = i3;
                        main = main;
                    }
                    break;
                case -1562399002:
                case -229832250:
                    C0917.m55847(dialogInterfaceC2564);
                    String strM55591 = C0845.m55591(C1404.m56467(viewOnClickListenerC21364.f67352));
                    if (C0866.f81837 >= 0) {
                        str2 = strM55591;
                        main = main;
                        c11108M40435 = c11108M40435;
                        iM559710 = (C0946.m55979("֨֡") ^ i8) * 53;
                        i3 = ((iM559710 ^ i7) * (-15463)) ^ (-1897979062);
                        i4 = 816224764;
                        int i17 = iM559710 ^ i4;
                        c11108M40435 = c11108M40435;
                        i10 = i17;
                        i9 = i3;
                        main = main;
                    } else {
                        int iM559713 = C0946.m55979("ۤ᩹") ^ i7;
                        i9 = ((iM559713 ^ i8) * 485) ^ (-1807545092);
                        i10 = iM559713 ^ (-1639615218);
                        str2 = strM55591;
                    }
                    break;
                case -1441900144:
                case -189331253:
                    if (!C0955.m56025()) {
                        iM55979 = (C0873.m55680("֡ܶ") + i8) * 79;
                        i = ((iM55979 ^ i7) * 22567) ^ (-287056941);
                        i2 = -2134990542;
                        i10 = iM55979 ^ i2;
                        i9 = i;
                    } else {
                        main = main;
                        c11108M40435 = c11108M40435;
                        iM559710 = (C0873.m55680("ۡܰ") ^ i7) * 67;
                        i3 = ((iM559710 ^ i8) * 29305) ^ 299117978;
                        i4 = 1707305884;
                        int i18 = iM559710 ^ i4;
                        c11108M40435 = c11108M40435;
                        i10 = i18;
                        i9 = i3;
                        main = main;
                    }
                    break;
                case -1420653441:
                case 429229340:
                    ServiceConnectionC1013.m56155(main, exc, null);
                    break;
                case -1373101126:
                case 966250107:
                    i11 = 40879;
                    iM559710 = C0873.m55680("۫ۤ") ^ i8;
                    i3 = ((iM559710 ^ i7) * 18203) ^ (-1872229245);
                    i4 = -1292861720;
                    int i19 = iM559710 ^ i4;
                    c11108M40435 = c11108M40435;
                    i10 = i19;
                    i9 = i3;
                    main = main;
                    break;
                case -1266307962:
                case -1221282421:
                    C1017.m56187();
                    break;
                case -1034920646:
                case 995206030:
                    i11 = 60488;
                    iM559710 = C0873.m55680("۫ۤ") ^ i8;
                    i3 = ((iM559710 ^ i7) * 18203) ^ (-1872229245);
                    i4 = -1292861720;
                    int i110 = iM559710 ^ i4;
                    c11108M40435 = c11108M40435;
                    i10 = i110;
                    i9 = i3;
                    main = main;
                    break;
                case -990549411:
                case -477363147:
                    final InterfaceC1209 interfaceC1209M11626 = C5365.m11626(str2);
                    C11896.m27214(new InterfaceC14577(viewOnClickListenerC21364) { // from class: l.᩵ۛܽ

                        /* JADX INFO: renamed from: ᩸ */
                        public final /* synthetic */ ViewOnClickListenerC21364 f63898;

                        @Override // p067l.InterfaceC14577
                        public final /* synthetic */ void onCanceled() {
                        }

                        @Override // p067l.InterfaceC14577
                        /* JADX INFO: renamed from: ֫ */
                        public final /* synthetic */ boolean mo6050(Exception exc2) {
                            return false;
                        }

                        {
                            int i20 = -1075950784;
                            int i21 = C1124.f82007;
                            int i22 = RunnableC0871.f81839;
                            int iM559714 = C0946.m55979("֨ۗ") ^ i21;
                            int i23 = ((iM559714 ^ i22) * (-485)) ^ 1034206625;
                            int i24 = 1096734734;
                            while (true) {
                                i20 = ((((i20 ^ i22) * (-31799)) >> 31) & i23) ^ (iM559714 ^ i24);
                                switch (i20) {
                                    case -2140817220:
                                    case 1854603218:
                                        if (RunnableC0871.f81839 >= 0) {
                                            iM559714 = (C0946.m55979("ۡ᩻") ^ i21) * (-97);
                                            i23 = ((iM559714 ^ i22) * 25239) ^ (-1162144650);
                                            i24 = -865806934;
                                        } else {
                                            iM559714 = (C0873.m55680("᩻᩺") ^ i21) * 21;
                                            i23 = ((iM559714 ^ i22) * (-16801)) ^ (-1887191400);
                                            i24 = 1895249755;
                                        }
                                        break;
                                    case -2039714257:
                                    case 833492918:
                                        if (C0882.f81846) {
                                            iM559714 = (C0946.m55979("ۖ᩸") + i21) * (-87);
                                            i23 = ((iM559714 ^ i22) * 3061) ^ (-1688919146);
                                            i24 = 557582589;
                                        } else {
                                            iM559714 = C0873.m55680("ۚ۫") ^ i21;
                                            i23 = ((iM559714 ^ i22) * 16925) ^ 1008783916;
                                            i24 = -1742944185;
                                        }
                                        break;
                                    case -1881681311:
                                    case -292695828:
                                        if (C0866.m55645()) {
                                            iM559714 = C0946.m55979("ۤ֨") ^ i22;
                                            i23 = ((iM559714 ^ i21) * (-10791)) ^ (-1673427486);
                                            i24 = 1427491888;
                                        } else {
                                            iM559714 = C0873.m55680("ۚ۫") ^ i21;
                                            i23 = ((iM559714 ^ i22) * 16925) ^ 1008783916;
                                            i24 = -1742944185;
                                        }
                                        break;
                                    case -1747850978:
                                    case 1581260217:
                                        if (C1964.f83032 <= 0) {
                                            iM559714 = (C0946.m55979("᩷᩷") ^ i22) * 7;
                                            i23 = ((iM559714 ^ i21) * 11889) ^ (-1177567993);
                                            i24 = -1281313018;
                                        } else {
                                            iM559714 = (i21 - C0946.m55979("ۙۚ")) * (-115);
                                            i23 = ((iM559714 ^ i22) * 25683) ^ 608019461;
                                            i24 = 1501100860;
                                        }
                                        break;
                                    case -1654917048:
                                    case 1965765441:
                                        C1003.m56123();
                                        iM559714 = (i22 - C0946.m55979("۟ۙ")) * 71;
                                        i23 = ((iM559714 ^ i21) * (-18867)) ^ 1747447040;
                                        i24 = 1715185513;
                                        break;
                                    case -1402384778:
                                    case 695634042:
                                        this.f63898 = viewOnClickListenerC21364;
                                        if (AbstractC0942.f81890 <= 0) {
                                            iM559714 = C0873.m55680("ۚ۫") ^ i21;
                                            i23 = ((iM559714 ^ i22) * 16925) ^ 1008783916;
                                            i24 = -1742944185;
                                        } else {
                                            iM559714 = C0873.m55680("ܿ᩶") ^ i21;
                                            i23 = ((iM559714 ^ i22) * 22801) ^ (-1854927886);
                                            i24 = -2144990384;
                                        }
                                        break;
                                    case -1245906197:
                                    case -776019303:
                                        if (!C0917.f81868) {
                                            iM559714 = (i22 - C0946.m55979("۟ۙ")) * 71;
                                            i23 = ((iM559714 ^ i21) * (-18867)) ^ 1747447040;
                                            i24 = 1715185513;
                                        } else {
                                            iM559714 = (C0946.m55979("᩷᩷") ^ i22) * 7;
                                            i23 = ((iM559714 ^ i21) * 11889) ^ (-1177567993);
                                            i24 = -1281313018;
                                        }
                                        break;
                                    case -856758053:
                                    case -326434203:
                                        if (C1003.f81929 <= 0) {
                                            iM559714 = (i22 - C0946.m55979("۟ۙ")) * 71;
                                            i23 = ((iM559714 ^ i21) * (-18867)) ^ 1747447040;
                                            i24 = 1715185513;
                                        } else {
                                            iM559714 = C0873.m55680("᩶۬") ^ i22;
                                            i23 = ((iM559714 ^ i21) * (-22569)) ^ 987941996;
                                            i24 = 429751333;
                                        }
                                        break;
                                    case -761440390:
                                    case 1880966670:
                                        C0861.m55626();
                                        throw new RuntimeException();
                                    case 96087283:
                                    case 992822002:
                                        return;
                                    case 116007584:
                                    case 1178156734:
                                        if (C0912.m55833()) {
                                            iM559714 = (C0946.m55979("᩷᩷") ^ i22) * 7;
                                            i23 = ((iM559714 ^ i21) * 11889) ^ (-1177567993);
                                            i24 = -1281313018;
                                        } else {
                                            iM559714 = (C0873.m55680("ۜۜ") ^ i21) * (-17);
                                            i23 = ((iM559714 ^ i22) * 8655) ^ (-1753973689);
                                            i24 = -775580075;
                                        }
                                        break;
                                    case 406353324:
                                    case 1087305692:
                                        if (!C0947.m55997()) {
                                            iM559714 = C0873.m55680("ۚ۫") ^ i21;
                                            i23 = ((iM559714 ^ i22) * 16925) ^ 1008783916;
                                            i24 = -1742944185;
                                        } else {
                                            iM559714 = (i22 - C0946.m55979("۟ۙ")) * 71;
                                            i23 = ((iM559714 ^ i21) * (-18867)) ^ 1747447040;
                                            i24 = 1715185513;
                                        }
                                        break;
                                    case 450591020:
                                    case 1158760100:
                                        if (C0890.f81849 != 0) {
                                            iM559714 = (i22 - C0946.m55979("۟ۙ")) * 71;
                                            i23 = ((iM559714 ^ i21) * (-18867)) ^ 1747447040;
                                            i24 = 1715185513;
                                        } else {
                                            iM559714 = C0946.m55979("֨ܺ") ^ i22;
                                            i23 = ((iM559714 ^ i21) * (-30031)) ^ 1172105655;
                                            i24 = -1199839188;
                                        }
                                        break;
                                    case 621979908:
                                    case 702944130:
                                        if (C1012.f81938 >= 0) {
                                            iM559714 = (C0946.m55979("᩷᩷") ^ i22) * 7;
                                            i23 = ((iM559714 ^ i21) * 11889) ^ (-1177567993);
                                            i24 = -1281313018;
                                        } else {
                                            iM559714 = C0946.m55979("ܿ֡") ^ i22;
                                            i23 = ((iM559714 ^ i21) * (-29267)) ^ 1876839226;
                                            i24 = -2095030079;
                                        }
                                        break;
                                    case 1174688061:
                                    case 1829883920:
                                        if (C1124.m56367() >= 0) {
                                            iM559714 = (C0946.m55979("ۡ᩻") ^ i21) * (-97);
                                            i23 = ((iM559714 ^ i22) * 25239) ^ (-1162144650);
                                            i24 = -865806934;
                                        } else {
                                            iM559714 = (i22 - C0946.m55979("֫ܶ")) * 9;
                                            i23 = ((iM559714 ^ i21) * (-28243)) ^ 1256293712;
                                            i24 = 932549469;
                                        }
                                        break;
                                    default:
                                        if (C0873.f81841 <= 0) {
                                            iM559714 = C0873.m55680("ۚ۫") ^ i21;
                                            i23 = ((iM559714 ^ i22) * 16925) ^ 1008783916;
                                            i24 = -1742944185;
                                        } else {
                                            iM559714 = (C0873.m55680("᩷۬") + i21) * 119;
                                            i23 = ((iM559714 ^ i22) * 10013) ^ (-2027027887);
                                            i24 = 1087028820;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // p067l.InterfaceC14577
                        /* JADX INFO: renamed from: ֫ */
                        public final void mo6049(C13457 c13457, boolean z) {
                            CheckBox checkBox2 = null;
                            int i20 = -930724543;
                            int i21 = C0873.f81841;
                            int i22 = C0906.f81862;
                            int iM559714 = C0946.m55979("ᩳۢ") ^ i21;
                            int i23 = ((iM559714 ^ i22) * (-23601)) ^ 1806952337;
                            int i24 = -1672115401;
                            while (true) {
                                i20 = ((((i20 ^ i22) * (-1735)) >> 31) & i23) ^ (iM559714 ^ i24);
                                switch (i20) {
                                    case -2133432905:
                                    case -943083164:
                                        if (C0877.f81843 >= 0) {
                                            iM559714 = (i21 - C0873.m55680("۬ۗ")) * (-57);
                                            i23 = ((iM559714 ^ i22) * (-1411)) ^ (-259297354);
                                            i24 = 940638310;
                                        } else {
                                            iM559714 = (C0873.m55680("᩻ۡ") ^ i22) * (-99);
                                            i23 = ((iM559714 ^ i21) * (-2681)) ^ 1451977714;
                                            i24 = 842150144;
                                        }
                                        break;
                                    case -2080285336:
                                    case -1028659698:
                                        if (AbstractC0942.m55971()) {
                                            iM559714 = C0873.m55680("ۘۛ") ^ i21;
                                            i23 = ((iM559714 ^ i22) * (-25795)) ^ 233683323;
                                            i24 = -939220669;
                                        } else {
                                            iM559714 = (i22 - C0873.m55680("ۤ֡")) * (-67);
                                            i23 = ((iM559714 ^ i21) * (-25103)) ^ 951629174;
                                            i24 = 904331648;
                                        }
                                        break;
                                    case -1934792091:
                                    case 1938917411:
                                        if (C1036.m56257() <= 0) {
                                            iM559714 = C0873.m55680("ۘۛ") ^ i21;
                                            i23 = ((iM559714 ^ i22) * (-25795)) ^ 233683323;
                                            i24 = -939220669;
                                        } else {
                                            iM559714 = C0873.m55680("ۛۧ") ^ i22;
                                            i23 = ((iM559714 ^ i21) * (-7379)) ^ 229337598;
                                            i24 = 1757535267;
                                        }
                                        break;
                                    case -1833659130:
                                    case 1591247435:
                                        C0955.m56025();
                                        if (C1024.f81946) {
                                            iM559714 = C0946.m55979("ܿ֫") ^ i22;
                                            i23 = ((iM559714 ^ i21) * 3983) ^ 199333222;
                                            i24 = -815398123;
                                        } else {
                                            iM559714 = (C0946.m55979("۫ᩴ") ^ i21) * 83;
                                            i23 = ((iM559714 ^ i22) * (-11139)) ^ 2098701234;
                                            i24 = 2102329928;
                                        }
                                        break;
                                    case -957980994:
                                    case 839257297:
                                        if (C0967.f81910 >= 0) {
                                            iM559714 = C0873.m55680("ۘۛ") ^ i21;
                                            i23 = ((iM559714 ^ i22) * (-25795)) ^ 233683323;
                                            i24 = -939220669;
                                        } else {
                                            iM559714 = (i21 - C0873.m55680("᩹ۗ")) * 65;
                                            i23 = ((iM559714 ^ i22) * (-8395)) ^ 1393637561;
                                            i24 = -1967665235;
                                        }
                                        break;
                                    case -153287077:
                                    case 650059603:
                                        C0949.m56012();
                                        if (!C1048.f81963) {
                                            iM559714 = (C0946.m55979("۫ᩴ") ^ i21) * 83;
                                            i23 = ((iM559714 ^ i22) * (-11139)) ^ 2098701234;
                                            i24 = 2102329928;
                                        } else {
                                            iM559714 = C0873.m55680("ۘۛ") ^ i21;
                                            i23 = ((iM559714 ^ i22) * (-25795)) ^ 233683323;
                                            i24 = -939220669;
                                        }
                                        break;
                                    case -46552400:
                                    case 85373494:
                                        checkBox2 = checkBox;
                                        if (C0930.f81879 <= 0) {
                                            iM559714 = (C0946.m55979("۫ᩴ") ^ i21) * 83;
                                            i23 = ((iM559714 ^ i22) * (-11139)) ^ 2098701234;
                                            i24 = 2102329928;
                                        } else {
                                            iM559714 = (C0946.m55979("ۨۛ") ^ i21) * 99;
                                            i23 = ((iM559714 ^ i22) * 26287) ^ (-507072941);
                                            i24 = 2030420315;
                                        }
                                        break;
                                    case 92000539:
                                    case 1797668772:
                                        boolean zM56014 = C0949.m56014(checkBox2);
                                        if (!C0927.f81875) {
                                            ViewOnClickListenerC21364 viewOnClickListenerC21365 = this.f63898;
                                            C11108 c11109 = c11108M40435;
                                            InterfaceC1209 interfaceC1209 = interfaceC1209M11626;
                                            if (!C0912.m55833()) {
                                                C1053.m56329(new C9964(viewOnClickListenerC21365, c11109, c13457, z, interfaceC1209, zM56014));
                                            }
                                        }
                                        iM559714 = (i21 - C0873.m55680("۬ۗ")) * (-57);
                                        i23 = ((iM559714 ^ i22) * (-1411)) ^ (-259297354);
                                        i24 = 940638310;
                                        break;
                                    case 136432761:
                                    case 441796597:
                                        ServiceConnectionC1013.m56157();
                                        C1053.m56327();
                                        break;
                                    case 387967488:
                                    case 2106882608:
                                        C1028.m56247();
                                        C1071.m56343();
                                        iM559714 = (C0946.m55979("۫ᩴ") ^ i21) * 83;
                                        i23 = ((iM559714 ^ i22) * (-11139)) ^ 2098701234;
                                        i24 = 2102329928;
                                        break;
                                    case 496049906:
                                    case 2092575833:
                                        if (C0877.m55696()) {
                                            iM559714 = (C0873.m55680("ᩴܶ") + i21) * (-49);
                                            i23 = ((iM559714 ^ i22) * 2419) ^ (-341463493);
                                            i24 = -265036896;
                                        } else {
                                            iM559714 = (C0946.m55979("۫ᩴ") ^ i21) * 83;
                                            i23 = ((iM559714 ^ i22) * (-11139)) ^ 2098701234;
                                            i24 = 2102329928;
                                        }
                                        break;
                                    case 829124266:
                                    case 1404043352:
                                        if (C1025.f81947 >= 0) {
                                            iM559714 = (C0873.m55680("ۖ۫") + i22) * (-43);
                                            i23 = ((iM559714 ^ i21) * 21841) ^ 408890902;
                                            i24 = -453976272;
                                        } else {
                                            iM559714 = (C0946.m55979("ۧܺ") + i21) * 89;
                                            i23 = ((iM559714 ^ i22) * (-15077)) ^ (-1712011457);
                                            i24 = -872014729;
                                        }
                                        break;
                                    case 1617843058:
                                    case 2129294459:
                                        if (RunnableC0938.f81886 >= 0) {
                                            iM559714 = (C0873.m55680("ۖ۫") + i22) * (-43);
                                            i23 = ((iM559714 ^ i21) * 21841) ^ 408890902;
                                            i24 = -453976272;
                                        } else {
                                            iM559714 = (C0946.m55979("۫ᩴ") ^ i21) * 83;
                                            i23 = ((iM559714 ^ i22) * (-11139)) ^ 2098701234;
                                            i24 = 2102329928;
                                        }
                                        break;
                                    default:
                                        if (C0947.f81895) {
                                            iM559714 = (C0873.m55680("ۖ۫") + i22) * (-43);
                                            i23 = ((iM559714 ^ i21) * 21841) ^ 408890902;
                                            i24 = -453976272;
                                        } else {
                                            iM559714 = C0873.m55680("ۤܰ") ^ i22;
                                            i23 = ((iM559714 ^ i21) * 23121) ^ (-655205737);
                                            i24 = 1839697129;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    }, main, str);
                    break;
                case -864174521:
                case 2004118003:
                    main = main;
                    c11108M40435 = c11108M40435;
                    int i20 = s + s2;
                    if ((i20 * i20) - i14 < 0) {
                        iM559710 = (i7 - C0946.m55979("ۙ۠")) * 67;
                        i3 = ((iM559710 ^ i8) * (-6893)) ^ (-213496129);
                        i4 = 306014119;
                    } else {
                        iM559710 = (i8 - C0946.m55979("ۘۛ")) * 53;
                        i3 = ((iM559710 ^ i7) * (-16569)) ^ 772367578;
                        i4 = 661518826;
                    }
                    int i111 = iM559710 ^ i4;
                    c11108M40435 = c11108M40435;
                    i10 = i111;
                    i9 = i3;
                    main = main;
                    break;
                case -752004094:
                case 785807217:
                    C1024.m56202(C0873.m55680(strM56403) ^ 2116779955);
                    break;
                case -639760345:
                case -416082127:
                    C1964.m56597();
                    iM55979 = (C0873.m55680("֡ܶ") + i8) * 79;
                    i = ((iM55979 ^ i7) * 22567) ^ (-287056941);
                    i2 = -2134990542;
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -637706046:
                case 1716258038:
                    c11108M40435 = c11108M40435;
                    interfaceC14770M55814 = C0906.m55814(ApplicationC21448.f67649);
                    sArr = f82967;
                    i12 = 281;
                    if (C0906.m55809() > 0) {
                        iM559711 = (C0946.m55979("֨᩺") + i8) * 91;
                        i5 = ((iM559711 ^ i7) * 28299) ^ 76047319;
                        i6 = 1853405665;
                        C11108 c11109 = c11108M40435;
                        i10 = iM559711 ^ i6;
                        i9 = i5;
                        c11108M40435 = c11109;
                    } else {
                        main = main;
                        iM559710 = (C0873.m55680("ۡܰ") ^ i7) * 67;
                        i3 = ((iM559710 ^ i8) * 29305) ^ 299117978;
                        i4 = 1707305884;
                        int i112 = iM559710 ^ i4;
                        c11108M40435 = c11108M40435;
                        i10 = i112;
                        i9 = i3;
                        main = main;
                    }
                    break;
                case -514999712:
                case 1883376363:
                    main = main;
                    c11108M40435 = c11108M40435;
                    i14 = s * 34168;
                    s2 = 8542;
                    if (C1028.f81950 <= 0) {
                        iM559710 = (C0946.m55979("֨֡") ^ i8) * 53;
                        i3 = ((iM559710 ^ i7) * (-15463)) ^ (-1897979062);
                        i4 = 816224764;
                    } else {
                        iM559710 = C0873.m55680("᩹۟") ^ i7;
                        i3 = ((iM559710 ^ i8) * (-17667)) ^ (-1198671729);
                        i4 = 768064819;
                    }
                    int i113 = iM559710 ^ i4;
                    c11108M40435 = c11108M40435;
                    i10 = i113;
                    i9 = i3;
                    main = main;
                    break;
                case -350644499:
                case 1262237606:
                    strM56403 = C1229.m56403(f82967, 294, 3, i11);
                    if (C0898.f81858 > 0) {
                        iM55979 = C0946.m55979("ܺܳ") ^ i7;
                        i = ((iM55979 ^ i8) * (-6121)) ^ 748419307;
                        i2 = -1986175875;
                        i10 = iM55979 ^ i2;
                        i9 = i;
                    } else {
                        main = main;
                        c11108M40435 = c11108M40435;
                        iM559710 = (C0873.m55680("ۡܰ") ^ i7) * 67;
                        i3 = ((iM559710 ^ i8) * 29305) ^ 299117978;
                        i4 = 1707305884;
                        int i114 = iM559710 ^ i4;
                        c11108M40435 = c11108M40435;
                        i10 = i114;
                        i9 = i3;
                        main = main;
                    }
                    break;
                case 12815523:
                case 1724605412:
                    break;
                case 115275969:
                case 630916321:
                    c11108M40435 = c11108M40435;
                    try {
                        c11108M40435 = C17812.m40435((String) C0992.m56115(arrayList, viewOnClickListenerC21364.f67349.getSelectedItemPosition()));
                        int iM55680 = C0873.m55680("ܿܰ") ^ i7;
                        main = main;
                        i3 = ((iM55680 ^ i8) * (-14221)) ^ 1601972852;
                        i10 = iM55680 ^ 1023151201;
                    } catch (Exception e) {
                        main = main;
                        exc = e;
                        iM559710 = (C0873.m55680("֫ܶ") + i8) * 93;
                        i3 = ((iM559710 ^ i7) * (-15991)) ^ 98659583;
                        i4 = -2045002107;
                        int i115 = iM559710 ^ i4;
                        c11108M40435 = c11108M40435;
                        i10 = i115;
                    }
                    i9 = i3;
                    main = main;
                    break;
                case 116943874:
                case 1016628594:
                    c11108M40435 = c11108M40435;
                    strM56252 = C1036.m56252(sArr, i12, 13, i11);
                    if (C1071.f81975 > 0) {
                        iM559711 = C0946.m55979("֨۫") ^ i7;
                        i5 = ((iM559711 ^ i8) * (-11693)) ^ (-1343372234);
                        i6 = -690920431;
                        C11108 c111010 = c11108M40435;
                        i10 = iM559711 ^ i6;
                        i9 = i5;
                        c11108M40435 = c111010;
                    } else {
                        main = main;
                        iM559710 = (C0946.m55979("֨֡") ^ i8) * 53;
                        i3 = ((iM559710 ^ i7) * (-15463)) ^ (-1897979062);
                        i4 = 816224764;
                        int i116 = iM559710 ^ i4;
                        c11108M40435 = c11108M40435;
                        i10 = i116;
                        i9 = i3;
                        main = main;
                    }
                    break;
                case 520055549:
                case 1606910950:
                    c11108M40435 = c11108M40435;
                    main = viewOnClickListenerC21364.f67355;
                    arrayList = viewOnClickListenerC21364.f67350;
                    if (C0992.m56108(arrayList)) {
                        iM559711 = (i7 - C0873.m55680("ܺ᩵")) * (-99);
                        i5 = ((iM559711 ^ i8) * (-975)) ^ 1906058223;
                        i6 = -1958791525;
                    } else {
                        iM559711 = (C0946.m55979("ۗܳ") ^ i7) * 37;
                        i5 = ((iM559711 ^ i8) * (-17457)) ^ (-1911692229);
                        i6 = 1055691075;
                    }
                    C11108 c111011 = c11108M40435;
                    i10 = iM559711 ^ i6;
                    i9 = i5;
                    c11108M40435 = c111011;
                    break;
                case 696987997:
                case 2006356471:
                    main = main;
                    c11108M40435 = c11108M40435;
                    if (C0898.m55800() <= 0) {
                        iM559710 = (C0946.m55979("֨֡") ^ i8) * 53;
                        i3 = ((iM559710 ^ i7) * (-15463)) ^ (-1897979062);
                        i4 = 816224764;
                    } else {
                        iM559710 = C0873.m55680("۫ܶ") ^ i8;
                        i3 = ((iM559710 ^ i7) * (-25985)) ^ 1025123257;
                        i4 = -546929282;
                    }
                    int i117 = iM559710 ^ i4;
                    c11108M40435 = c11108M40435;
                    i10 = i117;
                    i9 = i3;
                    main = main;
                    break;
                case 844200066:
                case 902264189:
                    main = main;
                    c11108M40435 = c11108M40435;
                    s = f82967[280];
                    if (C1404.f82149 >= 0) {
                        iM559710 = (i8 - C0873.m55680("۫ۚ")) * 13;
                        i3 = ((iM559710 ^ i7) * 6403) ^ (-2065442910);
                        i4 = 1567151438;
                    } else {
                        iM559710 = (i8 - C0946.m55979("ܶܰ")) * (-13);
                        i3 = ((iM559710 ^ i7) * (-26215)) ^ (-192926894);
                        i4 = -2072176148;
                    }
                    int i118 = iM559710 ^ i4;
                    c11108M40435 = c11108M40435;
                    i10 = i118;
                    i9 = i3;
                    main = main;
                    break;
                case 1194836339:
                case 1986333161:
                    main = main;
                    c11108M40435 = c11108M40435;
                    if (C0927.f81875) {
                        iM559710 = (C0946.m55979("֨֡") ^ i8) * 53;
                        i3 = ((iM559710 ^ i7) * (-15463)) ^ (-1897979062);
                        i4 = 816224764;
                    } else {
                        iM559710 = (i7 - C0873.m55680("᩵᩻")) * 55;
                        i3 = ((iM559710 ^ i8) * 29415) ^ (-720914289);
                        i4 = 1411888498;
                    }
                    int i119 = iM559710 ^ i4;
                    c11108M40435 = c11108M40435;
                    i10 = i119;
                    i9 = i3;
                    main = main;
                    break;
                case 1234280608:
                case 1750623703:
                    main = main;
                    c11108M40435 = c11108M40435;
                    if (C1017.m56187() <= 0) {
                        iM559710 = (C0873.m55680("ۡܰ") ^ i7) * 67;
                        i3 = ((iM559710 ^ i8) * 29305) ^ 299117978;
                        i4 = 1707305884;
                    } else {
                        iM559710 = (C0946.m55979("ۜۚ") ^ i8) * (-81);
                        i3 = ((iM559710 ^ i7) * 13995) ^ 1242392305;
                        i4 = -1233237644;
                    }
                    int i1110 = iM559710 ^ i4;
                    c11108M40435 = c11108M40435;
                    i10 = i1110;
                    i9 = i3;
                    main = main;
                    break;
                case 1408065624:
                case 1434988467:
                    if (!C0947.f81895) {
                        main = main;
                        c11108M40435 = c11108M40435;
                        iM559710 = (C0946.m55979("֨֡") ^ i8) * 53;
                        i3 = ((iM559710 ^ i7) * (-15463)) ^ (-1897979062);
                        i4 = 816224764;
                        int i1111 = iM559710 ^ i4;
                        c11108M40435 = c11108M40435;
                        i10 = i1111;
                        i9 = i3;
                        main = main;
                    } else {
                        iM55979 = (C0873.m55680("ۢ۠") + i8) * (-9);
                        i = ((iM55979 ^ i7) * (-11253)) ^ (-237578772);
                        i2 = 1572804104;
                        i10 = iM55979 ^ i2;
                        i9 = i;
                    }
                    break;
                default:
                    C0912.m55833();
                    if (C1048.f81963) {
                        iM55979 = (C0873.m55680("֡ܶ") + i8) * 79;
                        i = ((iM55979 ^ i7) * 22567) ^ (-287056941);
                        i2 = -2134990542;
                    } else {
                        iM55979 = C0946.m55979("۫֫") ^ i7;
                        i = ((iM55979 ^ i8) * 7909) ^ 108439358;
                        i2 = 157111102;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00ae A[PHI: r2 r4
      0x00ae: PHI (r2v2 android.content.Intent) = (r2v1 android.content.Intent), (r2v1 android.content.Intent), (r2v3 android.content.Intent) binds: [B:18:0x0082, B:16:0x007f, B:26:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00ae: PHI (r4v3 bin.mt.plus.Main) = (r4v2 bin.mt.plus.Main), (r4v2 bin.mt.plus.Main), (r4v4 bin.mt.plus.Main) binds: [B:18:0x0082, B:16:0x007f, B:26:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x01cd A[PHI: r9 r10
      0x01cd: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:50:0x01b4, B:16:0x007f, B:6:0x0050, B:95:0x01cd] A[DONT_GENERATE, DONT_INLINE]
      0x01cd: PHI (r10v4 short) = (r10v3 short), (r10v2 short), (r10v2 short), (r10v2 short) binds: [B:50:0x01b4, B:16:0x007f, B:6:0x0050, B:95:0x01cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x026d A[PHI: r7 r8 r20
      0x026d: PHI (r7v3 short) = (r7v2 short), (r7v2 short), (r7v4 short) binds: [B:68:0x026b, B:64:0x0250, B:56:0x01fe] A[DONT_GENERATE, DONT_INLINE]
      0x026d: PHI (r8v3 int) = (r8v2 int), (r8v2 int), (r8v4 int) binds: [B:68:0x026b, B:64:0x0250, B:56:0x01fe] A[DONT_GENERATE, DONT_INLINE]
      0x026d: PHI (r20v3 short[]) = (r20v1 short[]), (r20v2 short[]), (r20v1 short[]) binds: [B:68:0x026b, B:64:0x0250, B:56:0x01fe] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iM55680;
        int i;
        int i2;
        int i3 = C1012.f81938;
        int i4 = ViewOnClickListenerC0939.f81888;
        int iM55979 = C0946.m55979("ۗۜ") ^ i4;
        int i5 = ((iM55979 ^ i3) * 19097) ^ 6391887;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM55979 ^ (-225091250);
        Intent intent = null;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1477456338;
        Main main = null;
        int iM55718 = 0;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i3) * (-19269)) >> 31));
            switch (i12) {
                case -2146895830:
                case -1562554051:
                    if (i8 - (s * s2) < 0) {
                        iM55680 = C0873.m55680("۫ܳ") ^ i3;
                        i = ((iM55680 ^ i4) * (-23353)) ^ 1860940751;
                        i2 = 1881142056;
                    } else {
                        iM55680 = C0873.m55680("ۚܿ") ^ i4;
                        i = ((iM55680 ^ i3) * (-27919)) ^ (-1088904440);
                        i2 = -368517229;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -2055470656:
                case 827510873:
                    C0992.m56107();
                    break;
                case -1978176202:
                case 513748105:
                    i11 = 3;
                    if (C0890.f81849 == 0) {
                        iM55680 = C0873.m55680("᩶ۡ") ^ i4;
                        i = ((iM55680 ^ i3) * 8513) ^ (-1772015748);
                        i2 = -135769159;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                    } else {
                        int iM559710 = (C0946.m55979("᩶ۖ") + i4) * (-57);
                        i6 = iM559710 ^ 1673318443;
                        i5 = ((iM559710 ^ i3) * (-10017)) ^ (-1591930290);
                        intent = null;
                    }
                    break;
                case -1959006531:
                case -597529522:
                    sArr = f82967;
                    if (C0917.f81868) {
                        iM55680 = (C0873.m55680("᩺ۡ") + i4) * (-25);
                        i = ((iM55680 ^ i3) * (-31721)) ^ (-1871096934);
                        i2 = 551134435;
                    } else {
                        iM55680 = (C0946.m55979("ܺۡ") ^ i3) * (-59);
                        i = ((iM55680 ^ i4) * (-1297)) ^ (-1127932069);
                        i2 = -1317642980;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1747943296:
                case -1193386148:
                    C1044.m56284(main, intent);
                    main.m12255(new RunnableC23375(this));
                    iM55680 = (i3 - C0946.m55979("ۙۤ")) * (-51);
                    i = ((iM55680 ^ i4) * 24475) ^ 400772548;
                    i2 = -798923956;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1547121499:
                case -837196051:
                    if (iM55718 == (C0873.m55680(C0906.m55810(sArr2, i10, i11, i9)) ^ 2125630620)) {
                        iM55680 = (i3 - C0946.m55979("᩵ܺ")) * (-111);
                        i = ((iM55680 ^ i4) * 22611) ^ (-21685012);
                        i2 = -1789949834;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ۙۤ")) * (-51);
                        i = ((iM55680 ^ i4) * 24475) ^ 400772548;
                        i2 = -798923956;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1498013796:
                case 741892537:
                    if (C0906.f81862 >= 0) {
                        iM55680 = (C0873.m55680("᩺ۡ") + i4) * (-25);
                        i = ((iM55680 ^ i3) * (-31721)) ^ (-1871096934);
                        i2 = 551134435;
                    } else {
                        iM55680 = (C0873.m55680("֨ۡ") ^ i4) * 43;
                        i = ((iM55680 ^ i3) * (-31095)) ^ 2072106737;
                        i2 = -1428166937;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1163002739:
                case -255087193:
                    C1028.m56247();
                    if (C0854.m55595() < 0) {
                        int iM559711 = (C0946.m55979("᩶ۖ") + i4) * (-57);
                        i6 = iM559711 ^ 1673318443;
                        i5 = ((iM559711 ^ i3) * (-10017)) ^ (-1591930290);
                        intent = null;
                    } else {
                        iM55680 = C0946.m55979("᩷֡") ^ i4;
                        i = ((iM55680 ^ i3) * 25175) ^ (-1655246850);
                        i2 = -1089008283;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                    }
                    break;
                case -1104437247:
                case 1376953363:
                    i9 = 62368;
                    iM55680 = (C0946.m55979("ۘۤ") + i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i = ((iM55680 ^ i4) * 11113) ^ (-1506683916);
                    i2 = -2011690554;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1034357939:
                case 1326069929:
                    s = sArr[c];
                    i7 = s * s;
                    if (C0892.f81851) {
                        iM55680 = C0873.m55680("ۙ֫") ^ i3;
                        i = ((iM55680 ^ i4) * (-7909)) ^ (-1887244757);
                        i2 = -1785804322;
                    } else {
                        iM55680 = (C0873.m55680("᩺ۡ") + i4) * (-25);
                        i = ((iM55680 ^ i3) * (-31721)) ^ (-1871096934);
                        i2 = 551134435;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -989104728:
                case -360514010:
                    i9 = 5689;
                    iM55680 = (C0946.m55979("ۘۤ") + i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i = ((iM55680 ^ i4) * 11113) ^ (-1506683916);
                    i2 = -2011690554;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -905938811:
                case -348679336:
                    C1071.m56343();
                    C1404.m56468();
                    iM55680 = C0873.m55680("֫ۖ") ^ i3;
                    i = ((iM55680 ^ i4) * (-7917)) ^ (-1323345819);
                    i2 = 812182627;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -388189691:
                case 750984933:
                    main = this.f67355;
                    if (!C0949.m56012()) {
                        intent = new Intent(main, (Class<?>) ActivityC18224.class);
                        if (C1024.f81946) {
                            iM55680 = C0873.m55680("֫ۖ") ^ i3;
                            i = ((iM55680 ^ i4) * (-7917)) ^ (-1323345819);
                            i2 = 812182627;
                        } else {
                            iM55680 = C0873.m55680("۬۬") ^ i4;
                            i = ((iM55680 ^ i3) * (-19681)) ^ (-1622310499);
                            i2 = -318953749;
                        }
                        i6 = iM55680 ^ i2;
                        i5 = i;
                    } else {
                        int iM559712 = (C0946.m55979("᩶ۖ") + i4) * (-57);
                        i6 = iM559712 ^ 1673318443;
                        i5 = ((iM559712 ^ i3) * (-10017)) ^ (-1591930290);
                        intent = null;
                    }
                    break;
                case -387086415:
                case -82088227:
                    C0845.m55584();
                    if (C0949.f81897 >= 0) {
                        iM55680 = C0873.m55680("۠ᩳ") ^ i3;
                        i = ((iM55680 ^ i4) * (-32397)) ^ (-1864324146);
                        i2 = 263800886;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                    } else {
                        int iM559713 = (C0946.m55979("᩶ۖ") + i4) * (-57);
                        i6 = iM559713 ^ 1673318443;
                        i5 = ((iM559713 ^ i3) * (-10017)) ^ (-1591930290);
                        intent = null;
                    }
                    break;
                case -292612587:
                case 867511141:
                    s2 = 5514;
                    if (C0877.f81843 >= 0) {
                        iM55680 = C0946.m55979("᩷֡") ^ i4;
                        i = ((iM55680 ^ i3) * 25175) ^ (-1655246850);
                        i2 = -1089008283;
                    } else {
                        iM55680 = C0946.m55979("ܿ᩹") ^ i4;
                        i = ((iM55680 ^ i3) * 19597) ^ 1118510038;
                        i2 = -151122416;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -231659139:
                case 522098514:
                    iM55718 = C0882.m55718(view);
                    sArr2 = f82967;
                    i10 = 411;
                    if (C0927.m55873() > 0) {
                        iM55680 = (C0946.m55979("ᩴۗ") ^ i4) * (-87);
                        i = ((iM55680 ^ i3) * 26083) ^ (-1485657941);
                        i2 = 1987389821;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                    } else {
                        int iM559714 = (C0946.m55979("᩶ۖ") + i4) * (-57);
                        i6 = iM559714 ^ 1673318443;
                        i5 = ((iM559714 ^ i3) * (-10017)) ^ (-1591930290);
                        intent = null;
                    }
                    break;
                case -179430313:
                case 723604936:
                    c = 410;
                    if (!C0927.f81875) {
                        iM55680 = C0946.m55979("ۚ᩵") ^ i4;
                        i = ((iM55680 ^ i3) * 23919) ^ 621161496;
                        i2 = -1770276447;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                    } else {
                        int iM559715 = (C0946.m55979("᩶ۖ") + i4) * (-57);
                        i6 = iM559715 ^ 1673318443;
                        i5 = ((iM559715 ^ i3) * (-10017)) ^ (-1591930290);
                        intent = null;
                    }
                    break;
                case 312699211:
                case 1031594965:
                    break;
                case 551851402:
                case 644920979:
                    if (C1048.f81963) {
                        iM55680 = C0873.m55680("֫ۖ") ^ i3;
                        i = ((iM55680 ^ i4) * (-7917)) ^ (-1323345819);
                        i2 = 812182627;
                    } else {
                        iM55680 = C0946.m55979("᩷֡") ^ i4;
                        i = ((iM55680 ^ i3) * 25175) ^ (-1655246850);
                        i2 = -1089008283;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                default:
                    i8 = i7 + 7601049;
                    if (C1024.f81946) {
                        iM55680 = C0946.m55979("᩷֡") ^ i4;
                        i = ((iM55680 ^ i3) * 25175) ^ (-1655246850);
                        i2 = -1089008283;
                    } else {
                        iM55680 = C0873.m55680("ᩳܽ") ^ i3;
                        i = ((iM55680 ^ i4) * 28571) ^ (-515900825);
                        i2 = 1536718359;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x00ad, code lost:
    
        if (p067l.C1053.f81965 <= 0) goto L8;
     */
    /* JADX INFO: renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m48398(ViewOnClickListenerC21364 viewOnClickListenerC21364, final CheckBox checkBox) {
        int iM55680;
        int i;
        InterfaceC14100 interfaceC14100;
        int iM55979;
        int i2;
        View.OnClickListener onClickListener;
        View view;
        int i3;
        int i4;
        Object obj;
        int i5;
        int i6;
        Object obj2;
        View view2;
        View.OnClickListener onClickListener2;
        int iM55681;
        int i7;
        int i8;
        int iM55682;
        int i9;
        int i10;
        int iM55683;
        int i11;
        checkBox = checkBox;
        int i12 = ServiceConnectionC1013.f81940;
        int i13 = C0894.f81854;
        int iM55684 = (C0873.m55680("᩷ۡ") + i13) * (-51);
        int i14 = ((iM55684 ^ i12) * 1401) ^ 1491004464;
        String strM48400 = null;
        View.OnClickListener onClickListener3 = null;
        DialogInterface.OnClickListener onClickListener4 = null;
        String strM56189 = null;
        String strM55592 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i15 = iM55684 ^ (-2116994892);
        int i16 = 0;
        short s = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = -4984009;
        int i23 = 0;
        InterfaceC14100 interfaceC14101 = null;
        Object obj3 = null;
        DialogInterfaceOnClickListenerC13498 dialogInterfaceOnClickListenerC13498 = null;
        String strM55597 = null;
        int i24 = 0;
        final C12096 c12096 = null;
        C20671 c20671M55654 = null;
        int i25 = 0;
        View viewM56181 = null;
        Main main = null;
        View view3 = null;
        short[] sArr4 = null;
        while (true) {
            i22 = i15 ^ (i14 & (((i22 ^ i12) * (-8849)) >> 31));
            switch (i22) {
                case -1976895364:
                case -1277608974:
                    C0947.m55997();
                    C0947.m55997();
                    break;
                case -1947332258:
                case -535210085:
                    obj3 = obj3;
                    interfaceC14101 = interfaceC14101;
                    onClickListener3 = onClickListener3;
                    view3 = view3;
                    i20 = i20;
                    i23 = i23;
                    viewM56181 = C1017.m56181(main, i18 ^ i19);
                    main = main;
                    strM56189 = C1017.m56189(f82967, 325, 3, i16);
                    if (C1036.f81953 >= 0) {
                        iM55680 = C0873.m55680("ܳ֫") ^ i13;
                        i14 = ((iM55680 ^ i12) * 27407) ^ (-1230102065);
                        i = 399637975;
                    } else {
                        iM55680 = (C0873.m55680("֨ܶ") + i13) * (-105);
                        i14 = ((iM55680 ^ i12) * (-8361)) ^ (-681807902);
                        i = 1144052311;
                    }
                    i6 = iM55680 ^ i;
                    main = main;
                    i23 = i23;
                    i20 = i20;
                    view3 = view3;
                    interfaceC14101 = interfaceC14101;
                    onClickListener3 = onClickListener3;
                    obj3 = obj3;
                    i15 = i6;
                    checkBox = checkBox;
                    break;
                case -1806489251:
                case 939842731:
                    strM48400 = m48400();
                    interfaceC14101 = interfaceC14101;
                    obj = obj3;
                    onClickListener = onClickListener3;
                    view = view3;
                    i3 = i20;
                    i4 = i23;
                    int iM559710 = (C0946.m55979("ۖۡ") + i12) * (-17);
                    i14 = ((iM559710 ^ i13) * 20455) ^ 1537513672;
                    i15 = iM559710 ^ 641610875;
                    i23 = i4;
                    i20 = i3;
                    view3 = view;
                    onClickListener3 = onClickListener;
                    obj3 = obj;
                    interfaceC14101 = interfaceC14101;
                    break;
                case -1789681270:
                case 405887611:
                    C1124.m56363(c20671M55654, C0873.m55680(C0877.m55707(sArr4, 358, 3, i16)) ^ 2097566276, onClickListener4);
                    C1025.m56221(c20671M55654);
                    break;
                case -1700193178:
                case -1458970650:
                    C0882.m55710();
                    C1003.m56123();
                    obj2 = obj3;
                    view2 = view3;
                    onClickListener2 = onClickListener3;
                    iM55681 = C0873.m55680("۫ۚ") ^ i12;
                    i7 = ((iM55681 ^ i13) * (-18421)) ^ (-711655108);
                    i8 = 1596855245;
                    i10 = iM55681 ^ i8;
                    view3 = view2;
                    onClickListener3 = onClickListener2;
                    obj3 = obj2;
                    checkBox = checkBox;
                    i15 = i10;
                    i14 = i7;
                    break;
                case -1641286695:
                case 1010345414:
                    onClickListener = onClickListener3;
                    view = view3;
                    i3 = i20;
                    i4 = i23;
                    interfaceC14101 = interfaceC14101;
                    String strM56333 = C1053.m56333(interfaceC14101, C0882.m55717(f82967, 328, 15, i16), null);
                    if (strM56333 == null) {
                        int iM559711 = C0946.m55979("ۤ۠") ^ i13;
                        i14 = ((iM559711 ^ i12) * (-27097)) ^ 943326357;
                        i15 = iM559711 ^ 422309960;
                        checkBox = checkBox;
                        interfaceC14101 = interfaceC14101;
                        i23 = i4;
                        i20 = i3;
                        view3 = view;
                        onClickListener3 = onClickListener;
                        obj3 = null;
                    } else {
                        strM48400 = strM56333;
                        obj = null;
                        int iM559712 = (C0946.m55979("ۖۡ") + i12) * (-17);
                        i14 = ((iM559712 ^ i13) * 20455) ^ 1537513672;
                        i15 = iM559712 ^ 641610875;
                        i23 = i4;
                        i20 = i3;
                        view3 = view;
                        onClickListener3 = onClickListener;
                        obj3 = obj;
                        interfaceC14101 = interfaceC14101;
                    }
                    break;
                case -1613524399:
                case 1894337561:
                    break;
                case -1374391166:
                case 1253440752:
                    obj3 = obj3;
                    int i26 = i20;
                    onClickListener3 = onClickListener3;
                    i23 = i23;
                    view3 = view3;
                    i20 = i26;
                    strM55597 = C0854.m55597(f82967, 343, 3, i16);
                    if (C1012.f81938 < 0) {
                        iM55979 = C0873.m55680("ܳۗ") ^ i13;
                        i14 = ((iM55979 ^ i12) * (-18375)) ^ 1710311082;
                        i2 = -1301232159;
                        i6 = iM55979 ^ i2;
                        i23 = i23;
                        i20 = i20;
                        view3 = view3;
                        onClickListener3 = onClickListener3;
                        obj3 = obj3;
                        i15 = i6;
                        checkBox = checkBox;
                    } else {
                        main = main;
                        iM55680 = C0873.m55680("֡֡") ^ i12;
                        i14 = ((iM55680 ^ i13) * (-29011)) ^ 494444985;
                        i = 729949234;
                        i6 = iM55680 ^ i;
                        main = main;
                        i23 = i23;
                        i20 = i20;
                        view3 = view3;
                        interfaceC14101 = interfaceC14101;
                        onClickListener3 = onClickListener3;
                        obj3 = obj3;
                        i15 = i6;
                        checkBox = checkBox;
                    }
                    break;
                case -1340067262:
                case 1698961518:
                    Object obj4 = obj3;
                    String str = strM48400;
                    C1929.m56555(c12096, str);
                    c12096.mo27941(c12096.m32590());
                    View.OnClickListener onClickListener5 = new View.OnClickListener() { // from class: l.֡ۛܽ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            TextView textView = null;
                            CharSequence charSequenceM56220 = null;
                            String strM55591 = null;
                            C12096 c12097 = null;
                            int iM56130 = 0;
                            int iM56078 = 0;
                            int iM55719 = 0;
                            int i27 = -1193065070;
                            int i28 = C0967.f81910;
                            int i29 = ServiceConnectionC1013.f81940;
                            int iM559713 = (i28 - C0946.m55979("᩷ᩴ")) * (-71);
                            int i30 = ((iM559713 ^ i29) * 19293) ^ (-121297618);
                            int i31 = -1054381705;
                            while (true) {
                                i27 = ((((i27 ^ i29) * 9) >> 31) & i30) ^ (iM559713 ^ i31);
                                switch (i27) {
                                    case -2028984696:
                                    case 25078101:
                                        if (C0877.m55696()) {
                                            iM559713 = C0873.m55680("ᩴᩴ") ^ i29;
                                            i30 = ((iM559713 ^ i28) * (-7757)) ^ (-37653584);
                                            i31 = -2016681582;
                                        } else {
                                            iM559713 = C0946.m55979("ܰ᩵") ^ i29;
                                            i30 = ((iM559713 ^ i28) * 30523) ^ 626865994;
                                            i31 = 261809825;
                                        }
                                        break;
                                    case -1958237925:
                                    case 2121464061:
                                        strM55591 = C0845.m55591(charSequenceM56220);
                                        c12097 = c12096;
                                        if (C0892.f81851) {
                                            iM559713 = (C0873.m55680("ܶۤ") ^ i29) * (-45);
                                            i30 = ((iM559713 ^ i28) * 20325) ^ (-742568206);
                                            i31 = -1930089086;
                                        } else {
                                            iM559713 = (C0946.m55979("ۗ᩵") ^ i29) * 67;
                                            i30 = ((iM559713 ^ i28) * (-20023)) ^ 27697757;
                                            i31 = 1375876819;
                                        }
                                        break;
                                    case -1789711267:
                                    case 848845410:
                                        textView = (TextView) view4;
                                        if (ServiceConnectionC1013.m56157() <= 0) {
                                            iM559713 = C0946.m55979("ܰ᩵") ^ i29;
                                            i30 = ((iM559713 ^ i28) * 30523) ^ 626865994;
                                            i31 = 261809825;
                                        } else {
                                            iM559713 = C0946.m55979("ܿܳ") ^ i29;
                                            i30 = ((iM559713 ^ i28) * 24495) ^ 1171780608;
                                            i31 = 905583864;
                                        }
                                        break;
                                    case -1330454134:
                                    case -542238898:
                                        c12097.mo27941(iM55719 + iM56130);
                                        break;
                                    case -1095783908:
                                    case 537663728:
                                        if (C1048.m56305() >= 0) {
                                            iM559713 = (C0873.m55680("᩺ܽ") ^ i28) * 115;
                                            i30 = ((iM559713 ^ i29) * 20715) ^ 2074230636;
                                            i31 = 2039238088;
                                        } else {
                                            iM559713 = (C0873.m55680("ۨ۠") + i28) * 31;
                                            i30 = ((iM559713 ^ i29) * (-6047)) ^ 1266580731;
                                            i31 = 2086414441;
                                        }
                                        break;
                                    case -973173027:
                                    case 890556166:
                                        if (C1929.f83011 != 0) {
                                            iM559713 = C0946.m55979("۟᩶") ^ i29;
                                            i30 = ((iM559713 ^ i28) * 28015) ^ 1808783786;
                                            i31 = 655079888;
                                        } else {
                                            iM559713 = (C0946.m55979("ۗ᩵") ^ i29) * 67;
                                            i30 = ((iM559713 ^ i28) * (-20023)) ^ 27697757;
                                            i31 = 1375876819;
                                        }
                                        break;
                                    case -959733430:
                                    case 1454252665:
                                        C1028.m56247();
                                        C0927.m55873();
                                        break;
                                    case -909076423:
                                    case 1355622865:
                                        iM55719 = C0882.m55719(strM55591);
                                        if (C0894.f81854 >= 0) {
                                            iM559713 = C0946.m55979("۟᩶") ^ i29;
                                            i30 = ((iM559713 ^ i28) * 28015) ^ 1808783786;
                                            i31 = 655079888;
                                        } else {
                                            iM559713 = C0873.m55680("ܳ֫") ^ i28;
                                            i30 = ((iM559713 ^ i29) * 7881) ^ (-1686284264);
                                            i31 = 991350022;
                                        }
                                        break;
                                    case -872635433:
                                    case -573115776:
                                        C1036.m56257();
                                        C0877.m55696();
                                        iM559713 = (C0946.m55979("ۗ᩵") ^ i29) * 67;
                                        i30 = ((iM559713 ^ i28) * (-20023)) ^ 27697757;
                                        i31 = 1375876819;
                                        break;
                                    case -731607496:
                                    case -675559892:
                                        iM56130 = C1003.m56130(c12097);
                                        iM56078 = C0967.m56078(c12097);
                                        if (iM56130 > iM56078) {
                                            iM56078 = iM56130;
                                            iM56130 = iM56078;
                                        }
                                        iM559713 = C0946.m55979("ۚ۠") ^ i28;
                                        i30 = ((iM559713 ^ i29) * 2673) ^ 1021821341;
                                        i31 = -1439916441;
                                        break;
                                    case -653455780:
                                    case 1548435532:
                                        charSequenceM56220 = C1025.m56220(textView);
                                        if (C0912.m55833()) {
                                            iM559713 = C0873.m55680("ۙ᩹") ^ i28;
                                            i30 = ((iM559713 ^ i29) * (-9417)) ^ (-1370117259);
                                            i31 = -541650060;
                                        } else {
                                            iM559713 = (C0873.m55680("᩸ۛ") ^ i28) * 71;
                                            i30 = ((iM559713 ^ i29) * (-7875)) ^ 858097739;
                                            i31 = 819191130;
                                        }
                                        break;
                                    case -479335788:
                                    case 111641733:
                                        C0947.m55997();
                                        if (C1025.f81947 < 0) {
                                            iM559713 = (C0873.m55680("᩺ܽ") ^ i28) * 115;
                                            i30 = ((iM559713 ^ i29) * 20715) ^ 2074230636;
                                            i31 = 2039238088;
                                        } else {
                                            iM559713 = (C0946.m55979("ۗ᩵") ^ i29) * 67;
                                            i30 = ((iM559713 ^ i28) * (-20023)) ^ 27697757;
                                            i31 = 1375876819;
                                        }
                                        break;
                                    case -373172610:
                                    case 1799314018:
                                        if (C1036.m56257() <= 0) {
                                            iM559713 = C0946.m55979("ܰ᩵") ^ i29;
                                            i30 = ((iM559713 ^ i28) * 30523) ^ 626865994;
                                            i31 = 261809825;
                                        } else {
                                            iM559713 = (C0873.m55680("ܺ۟") + i28) * (-115);
                                            i30 = ((iM559713 ^ i29) * 7313) ^ (-813085714);
                                            i31 = 1912525377;
                                        }
                                        break;
                                    case -282849431:
                                    case 1410545120:
                                        ViewOnClickListenerC0939.m55941();
                                        if (C0845.f81821 < 0) {
                                            iM559713 = C0946.m55979("ܰ᩵") ^ i29;
                                            i30 = ((iM559713 ^ i28) * 30523) ^ 626865994;
                                            i31 = 261809825;
                                        } else {
                                            iM559713 = (C0946.m55979("ۗ᩵") ^ i29) * 67;
                                            i30 = ((iM559713 ^ i28) * (-20023)) ^ 27697757;
                                            i31 = 1375876819;
                                        }
                                        break;
                                    case -26752598:
                                    case 562597237:
                                        C1404.m56467(c12097).replace(iM56130, iM56078, strM55591);
                                        if (C0873.f81841 <= 0) {
                                            iM559713 = C0946.m55979("۟᩶") ^ i29;
                                            i30 = ((iM559713 ^ i28) * 28015) ^ 1808783786;
                                            i31 = 655079888;
                                        } else {
                                            iM559713 = C0873.m55680("ۚ᩹") ^ i29;
                                            i30 = ((iM559713 ^ i28) * 21125) ^ 292435599;
                                            i31 = -1137036674;
                                        }
                                        break;
                                    case 896310052:
                                    case 2027160367:
                                        if (C0955.f81898) {
                                            iM559713 = (C0873.m55680("᩺ܽ") ^ i28) * 115;
                                            i30 = ((iM559713 ^ i29) * 20715) ^ 2074230636;
                                            i31 = 2039238088;
                                        } else {
                                            iM559713 = C0946.m55979("᩶֫") ^ i28;
                                            i30 = ((iM559713 ^ i29) * 19995) ^ 1790419220;
                                            i31 = -435672786;
                                        }
                                        break;
                                    default:
                                        if (C0930.f81879 <= 0) {
                                            iM559713 = (C0946.m55979("ۗ᩵") ^ i29) * 67;
                                            i30 = ((iM559713 ^ i28) * (-20023)) ^ 27697757;
                                            i31 = 1375876819;
                                        } else {
                                            iM559713 = (C0873.m55680("ۨۗ") + i29) * 115;
                                            i30 = ((iM559713 ^ i28) * 10655) ^ (-1676115637);
                                            i31 = -848745807;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    int iM559713 = (C0946.m55979("ۜۨ") ^ i12) * (-127);
                    int i27 = ((iM559713 ^ i13) * 3629) ^ (-1706518205);
                    i5 = iM559713 ^ 1005210636;
                    strM48400 = str;
                    i23 = i23;
                    i20 = i20;
                    view3 = view3;
                    onClickListener3 = onClickListener5;
                    i14 = i27;
                    obj3 = obj4;
                    i15 = i5;
                    break;
                case -1318620955:
                case -919598475:
                    obj2 = obj3;
                    view2 = view3;
                    onClickListener2 = onClickListener3;
                    C1048.m56304(view2, onClickListener2);
                    sArr2 = f82967;
                    i23 = 349;
                    if (C1046.m56302() != 0) {
                        iM55681 = C0873.m55680("۫ۚ") ^ i12;
                        i7 = ((iM55681 ^ i13) * (-18421)) ^ (-711655108);
                        i8 = 1596855245;
                    } else {
                        iM55681 = (C0873.m55680("֫ۚ") + i13) * (-13);
                        i7 = ((iM55681 ^ i12) * 13433) ^ (-897461618);
                        i8 = -83870063;
                    }
                    i10 = iM55681 ^ i8;
                    view3 = view2;
                    onClickListener3 = onClickListener2;
                    obj3 = obj2;
                    checkBox = checkBox;
                    i15 = i10;
                    i14 = i7;
                    break;
                case -1235305082:
                case 2013709427:
                    if (C0930.f81879 <= 0) {
                        obj3 = obj3;
                        interfaceC14101 = interfaceC14101;
                        onClickListener3 = onClickListener3;
                        main = main;
                        view3 = view3;
                        i20 = i20;
                        i23 = i23;
                        iM55680 = C0873.m55680("ܳ֫") ^ i13;
                        i14 = ((iM55680 ^ i12) * 27407) ^ (-1230102065);
                        i = 399637975;
                        i6 = iM55680 ^ i;
                        main = main;
                        i23 = i23;
                        i20 = i20;
                        view3 = view3;
                        interfaceC14101 = interfaceC14101;
                        onClickListener3 = onClickListener3;
                        obj3 = obj3;
                        i15 = i6;
                        checkBox = checkBox;
                    } else {
                        obj2 = obj3;
                        view2 = view3;
                        onClickListener2 = onClickListener3;
                        iM55681 = C0873.m55680("۫ۚ") ^ i12;
                        i7 = ((iM55681 ^ i13) * (-18421)) ^ (-711655108);
                        i8 = 1596855245;
                        i10 = iM55681 ^ i8;
                        view3 = view2;
                        onClickListener3 = onClickListener2;
                        obj3 = obj2;
                        checkBox = checkBox;
                        i15 = i10;
                        i14 = i7;
                    }
                    break;
                case -1119207962:
                case 1234185363:
                    obj3 = obj3;
                    onClickListener3 = onClickListener3;
                    view3 = view3;
                    i20 = i20;
                    i23 = i23;
                    c12096 = (C12096) C1404.m56465(viewM56181, C0946.m55979(strM56189) ^ 2101270353);
                    interfaceC14101 = ApplicationC21448.f67649;
                    iM55979 = (C0946.m55979("᩻ۧ") ^ i13) * 93;
                    i14 = ((iM55979 ^ i12) * (-4267)) ^ (-1707242550);
                    i2 = -68275672;
                    i6 = iM55979 ^ i2;
                    i23 = i23;
                    i20 = i20;
                    view3 = view3;
                    onClickListener3 = onClickListener3;
                    obj3 = obj3;
                    i15 = i6;
                    checkBox = checkBox;
                    break;
                case -1077079715:
                case 1563963385:
                    obj3 = obj3;
                    interfaceC14101 = interfaceC14101;
                    onClickListener3 = onClickListener3;
                    main = main;
                    view3 = view3;
                    i20 = i20;
                    i23 = i23;
                    int i28 = (s * s) + 167340096;
                    if ((i17 * i17) - (i28 + i28) > 0) {
                        iM55680 = (C0873.m55680("ۘ᩻") + i12) * (-55);
                        i14 = ((iM55680 ^ i13) * 19377) ^ (-1599781763);
                        i = -570715158;
                    } else {
                        iM55680 = (C0873.m55680("ۚܳ") ^ i12) * 79;
                        i14 = ((iM55680 ^ i13) * 30615) ^ (-355035610);
                        i = 794471323;
                    }
                    i6 = iM55680 ^ i;
                    main = main;
                    i23 = i23;
                    i20 = i20;
                    view3 = view3;
                    interfaceC14101 = interfaceC14101;
                    onClickListener3 = onClickListener3;
                    obj3 = obj3;
                    i15 = i6;
                    checkBox = checkBox;
                    break;
                case -1033846143:
                case 222541989:
                    C1124.m56374(c20671M55654, C0873.m55680(C0946.m55986(sArr3, i24, i25, i16)) ^ 2120991773, obj3);
                    iM55683 = C0873.m55680("ܿۗ") ^ i12;
                    i7 = ((iM55683 ^ i13) * 23949) ^ (-81068891);
                    i11 = -1183335375;
                    i15 = iM55683 ^ i11;
                    i14 = i7;
                    break;
                case -948607646:
                case -77431714:
                    C0912.m55833();
                    if (C0946.f81894 == 0) {
                        iM55683 = C0873.m55680("ᩳ۠") ^ i12;
                        i7 = ((iM55683 ^ i13) * (-29729)) ^ 1856615257;
                        i11 = -1796076594;
                        i15 = iM55683 ^ i11;
                        i14 = i7;
                    } else {
                        obj3 = obj3;
                        interfaceC14101 = interfaceC14101;
                        onClickListener3 = onClickListener3;
                        main = main;
                        view3 = view3;
                        i20 = i20;
                        i23 = i23;
                        iM55680 = C0873.m55680("ܳ֫") ^ i13;
                        i14 = ((iM55680 ^ i12) * 27407) ^ (-1230102065);
                        i = 399637975;
                        i6 = iM55680 ^ i;
                        main = main;
                        i23 = i23;
                        i20 = i20;
                        view3 = view3;
                        interfaceC14101 = interfaceC14101;
                        onClickListener3 = onClickListener3;
                        obj3 = obj3;
                        i15 = i6;
                        checkBox = checkBox;
                    }
                    break;
                case -880972799:
                case -445161058:
                    i16 = 9068;
                    iM55680 = (C0946.m55979("᩻ܳ") + i13) * 43;
                    i14 = ((iM55680 ^ i12) * 1607) ^ (-70843824);
                    i = -1467087031;
                    i6 = iM55680 ^ i;
                    main = main;
                    i23 = i23;
                    i20 = i20;
                    view3 = view3;
                    interfaceC14101 = interfaceC14101;
                    onClickListener3 = onClickListener3;
                    obj3 = obj3;
                    i15 = i6;
                    checkBox = checkBox;
                    break;
                case -644868226:
                case 1713258510:
                    obj2 = obj3;
                    c20671M55654 = C0866.m55654(main);
                    C0927.m55864(c20671M55654, viewM56181);
                    dialogInterfaceOnClickListenerC13498 = new DialogInterfaceOnClickListenerC13498(1, c12096, checkBox);
                    iM55682 = (C0873.m55680("ܰۨ") ^ i13) * 23;
                    i7 = ((iM55682 ^ i12) * (-9765)) ^ (-684064073);
                    i9 = -104041608;
                    i10 = iM55682 ^ i9;
                    obj3 = obj2;
                    i15 = i10;
                    i14 = i7;
                    break;
                case -587866400:
                case 1845568834:
                    obj3 = obj3;
                    View view4 = view3;
                    onClickListener3 = onClickListener3;
                    i23 = i23;
                    sArr = f82967;
                    i21 = 346;
                    if (C0890.f81849 == 0) {
                        int iM559714 = C0946.m55979("ۘ᩵") ^ i13;
                        i14 = ((iM559714 ^ i12) * 605) ^ (-82162299);
                        i5 = iM559714 ^ (-1748629573);
                        view3 = view4;
                        onClickListener3 = onClickListener3;
                        i23 = i23;
                        obj3 = obj3;
                        i20 = 3;
                        i15 = i5;
                    } else {
                        view3 = view4;
                        i20 = 3;
                        main = main;
                        iM55680 = C0873.m55680("֡֡") ^ i12;
                        i14 = ((iM55680 ^ i13) * (-29011)) ^ 494444985;
                        i = 729949234;
                        i6 = iM55680 ^ i;
                        main = main;
                        i23 = i23;
                        i20 = i20;
                        view3 = view3;
                        interfaceC14101 = interfaceC14101;
                        onClickListener3 = onClickListener3;
                        obj3 = obj3;
                        i15 = i6;
                        checkBox = checkBox;
                    }
                    break;
                case 103594885:
                case 1276133823:
                    obj2 = obj3;
                    strM55592 = C0845.m55592(f82967, 352, 3, i16);
                    if (C1046.m56302() == 0) {
                        iM55682 = C0873.m55680("᩶᩶") ^ i13;
                        i7 = ((iM55682 ^ i12) * (-24937)) ^ (-566785086);
                        i9 = -634770279;
                        i10 = iM55682 ^ i9;
                        obj3 = obj2;
                        i15 = i10;
                        i14 = i7;
                    }
                    view2 = view3;
                    onClickListener2 = onClickListener3;
                    iM55681 = C0873.m55680("۫ۚ") ^ i12;
                    i7 = ((iM55681 ^ i13) * (-18421)) ^ (-711655108);
                    i8 = 1596855245;
                    i10 = iM55681 ^ i8;
                    view3 = view2;
                    onClickListener3 = onClickListener2;
                    obj3 = obj2;
                    checkBox = checkBox;
                    i15 = i10;
                    i14 = i7;
                    break;
                case 253612668:
                case 1452490136:
                    i16 = 13183;
                    iM55680 = (C0946.m55979("᩻ܳ") + i13) * 43;
                    i14 = ((iM55680 ^ i12) * 1607) ^ (-70843824);
                    i = -1467087031;
                    i6 = iM55680 ^ i;
                    main = main;
                    i23 = i23;
                    i20 = i20;
                    view3 = view3;
                    interfaceC14101 = interfaceC14101;
                    onClickListener3 = onClickListener3;
                    obj3 = obj3;
                    i15 = i6;
                    checkBox = checkBox;
                    break;
                case 434393073:
                case 1434496569:
                    onClickListener4 = new DialogInterface.OnClickListener() { // from class: l.ۚۛܽ

                        /* JADX INFO: renamed from: ۠ۙۡ, reason: not valid java name and contains not printable characters */
                        private static final short[] f81990 = {1876, 1828, 1827, 1831, 1832, 1838, 1849, 1810, 1825, 1826, 1834, 1810, 1853, 1836, 1849, 1829};

                        /* JADX WARN: Code duplicated, block: B:59:0x01d8 A[PHI: r1 r5 r6 r9
                          0x01d8: PHI (r1v6 java.lang.String) = 
                          (r1v2 java.lang.String)
                          (r1v2 java.lang.String)
                          (r1v2 java.lang.String)
                          (r1v4 java.lang.String)
                          (r1v2 java.lang.String)
                         binds: [B:58:0x01d6, B:46:0x0176, B:31:0x00c4, B:27:0x00a4, B:10:0x003f] A[DONT_GENERATE, DONT_INLINE]
                          0x01d8: PHI (r5v6 int) = (r5v2 int), (r5v4 int), (r5v2 int), (r5v2 int), (r5v2 int) binds: [B:58:0x01d6, B:46:0x0176, B:31:0x00c4, B:27:0x00a4, B:10:0x003f] A[DONT_GENERATE, DONT_INLINE]
                          0x01d8: PHI (r6v5 short) = (r6v2 short), (r6v3 short), (r6v2 short), (r6v2 short), (r6v2 short) binds: [B:58:0x01d6, B:46:0x0176, B:31:0x00c4, B:27:0x00a4, B:10:0x003f] A[DONT_GENERATE, DONT_INLINE]
                          0x01d8: PHI (r9v5 int) = (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:58:0x01d6, B:46:0x0176, B:31:0x00c4, B:27:0x00a4, B:10:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:63:0x0207 A[PHI: r2 r3
                          0x0207: PHI (r2v5 boolean) = (r2v2 boolean), (r2v2 boolean), (r2v4 boolean), (r2v2 boolean) binds: [B:62:0x0205, B:54:0x01b8, B:23:0x0081, B:15:0x005e] A[DONT_GENERATE, DONT_INLINE]
                          0x0207: PHI (r3v4 short[]) = (r3v2 short[]), (r3v3 short[]), (r3v2 short[]), (r3v2 short[]) binds: [B:62:0x0205, B:54:0x01b8, B:23:0x0081, B:15:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:67:0x0239 A[PHI: r4
                          0x0239: PHI (r4v3 short) = (r4v2 short), (r4v5 short) binds: [B:66:0x0237, B:50:0x0195] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
                        
                            if (p067l.AbstractC0942.f81890 <= 0) goto L14;
                         */
                        @Override // android.content.DialogInterface.OnClickListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void onClick(DialogInterface dialogInterface, int i29) {
                            int iM55685;
                            int i30;
                            int i31;
                            InterfaceC14770 interfaceC14770M55950 = null;
                            String strM55750 = null;
                            boolean z = false;
                            short[] sArr5 = null;
                            short s2 = 0;
                            int i32 = 0;
                            short s3 = 0;
                            int i33 = 0;
                            short[] sArr6 = null;
                            int i34 = 0;
                            int i35 = -628213374;
                            int i36 = C0845.f81821;
                            int i37 = RunnableC0871.f81839;
                            int iM55686 = (C0873.m55680("ܰ֨") ^ i36) * 83;
                            int i38 = ((iM55686 ^ i37) * 10205) ^ (-505104967);
                            int i39 = -2088133603;
                            while (true) {
                                int i40 = iM55686 ^ i39;
                                while (true) {
                                    i35 = ((((i35 ^ i37) * 22273) >> 31) & i38) ^ i40;
                                    switch (i35) {
                                        case -2141421700:
                                        case -1263508818:
                                            C0930.m55885();
                                            if (ServiceConnectionC1013.f81940 < 0) {
                                            }
                                            iM55685 = C0946.m55979("ۖܰ") ^ i36;
                                            i30 = ((iM55685 ^ i37) * (-29587)) ^ 1431814325;
                                            i31 = 1197328680;
                                            i40 = iM55685 ^ i31;
                                            i38 = i30;
                                            break;
                                        case -1789024391:
                                        case -1022381158:
                                            interfaceC14770M55950 = ViewOnClickListenerC0939.m55950(ApplicationC21448.f67649);
                                            sArr6 = f81990;
                                            if (C0949.f81897 >= 0) {
                                                iM55685 = C0946.m55979("ۨۤ") ^ i37;
                                                i30 = ((iM55685 ^ i36) * 14665) ^ 383345561;
                                                i31 = -2063716223;
                                            } else {
                                                iM55685 = (i37 - C0946.m55979("ۢ۫")) * (-95);
                                                i30 = ((iM55685 ^ i36) * (-16485)) ^ 550205554;
                                                i31 = 592977586;
                                            }
                                            i40 = iM55685 ^ i31;
                                            i38 = i30;
                                            break;
                                        case -1783439969:
                                        case 831317836:
                                            i33 = 1869;
                                            iM55685 = C0873.m55680("ܶ֨") ^ i36;
                                            i30 = ((iM55685 ^ i37) * 31503) ^ 1209291625;
                                            i31 = 1068125155;
                                            i40 = iM55685 ^ i31;
                                            i38 = i30;
                                            break;
                                        case -1740657745:
                                        case 808946870:
                                            if (C0845.f81821 >= 0) {
                                                iM55685 = (C0946.m55979("֨۫") ^ i37) * C0254q.f1218h;
                                                i30 = ((iM55685 ^ i36) * 22579) ^ (-1047769399);
                                                i31 = 269599869;
                                                i40 = iM55685 ^ i31;
                                                i38 = i30;
                                            }
                                            iM55685 = C0946.m55979("ۨۤ") ^ i37;
                                            i30 = ((iM55685 ^ i36) * 14665) ^ 383345561;
                                            i31 = -2063716223;
                                            i40 = iM55685 ^ i31;
                                            i38 = i30;
                                            break;
                                        case -1736943894:
                                        case -1141371015:
                                            C0877.m55696();
                                            C0892.m55749();
                                            iM55685 = C0946.m55979("ۨۤ") ^ i37;
                                            i30 = ((iM55685 ^ i36) * 14665) ^ 383345561;
                                            i31 = -2063716223;
                                            i40 = iM55685 ^ i31;
                                            i38 = i30;
                                            break;
                                        case -1680969959:
                                        case -124402796:
                                            i34 = 1;
                                            if (C1404.m56468()) {
                                                iM55685 = (C0873.m55680("᩹᩵") + i36) * (-121);
                                                i30 = ((iM55685 ^ i37) * 615) ^ (-29073755);
                                                i31 = -1474856082;
                                            } else {
                                                iM55685 = C0946.m55979("ۖܰ") ^ i36;
                                                i30 = ((iM55685 ^ i37) * (-29587)) ^ 1431814325;
                                                i31 = 1197328680;
                                            }
                                            i40 = iM55685 ^ i31;
                                            i38 = i30;
                                            break;
                                        case -727300381:
                                        case 1995221386:
                                            int i41 = s2 + s3;
                                            if ((i41 * i41) - i32 >= 0) {
                                                iM55685 = C0946.m55979("᩺ۚ") ^ i36;
                                                i30 = ((iM55685 ^ i37) * (-21039)) ^ (-267162025);
                                                i31 = -852835929;
                                            } else {
                                                iM55685 = C0873.m55680("۬᩻") ^ i37;
                                                i30 = ((iM55685 ^ i36) * (-1159)) ^ 185681360;
                                                i31 = -1620563878;
                                            }
                                            i40 = iM55685 ^ i31;
                                            i38 = i30;
                                            break;
                                        case -612406447:
                                        case 981439072:
                                            i32 = 36444 * s2;
                                            s3 = 9111;
                                            if (C1028.f81950 <= 0) {
                                                iM55685 = C0946.m55979("ۖܰ") ^ i36;
                                                i30 = ((iM55685 ^ i37) * (-29587)) ^ 1431814325;
                                                i31 = 1197328680;
                                            } else {
                                                iM55685 = C0946.m55979("۫ۘ") ^ i37;
                                                i30 = ((iM55685 ^ i36) * 599) ^ (-1916003578);
                                                i31 = -283669656;
                                            }
                                            i40 = iM55685 ^ i31;
                                            i38 = i30;
                                            break;
                                        case -574815719:
                                        case -78412990:
                                            s2 = sArr5[0];
                                            if (C0967.f81910 >= 0) {
                                                iM55685 = C0946.m55979("ۡܶ") ^ i37;
                                                i30 = ((iM55685 ^ i36) * 30181) ^ (-1962270361);
                                                i31 = 759906676;
                                            } else {
                                                iM55685 = (C0873.m55680("᩷ۖ") ^ i36) * 13;
                                                i30 = ((iM55685 ^ i37) * (-11483)) ^ (-784568602);
                                                i31 = 252745909;
                                            }
                                            i40 = iM55685 ^ i31;
                                            i38 = i30;
                                            break;
                                        case -395346797:
                                        case 486872018:
                                            C1017.m56187();
                                            break;
                                        case -10494762:
                                        case 1993294961:
                                            C0937.m55912(interfaceC14770M55950.remove(strM55750));
                                            z = false;
                                            if (C1048.f81963) {
                                                iM55685 = C0873.m55680("᩻ۧ") ^ i36;
                                                i30 = ((iM55685 ^ i37) * 13193) ^ (-396495367);
                                                i31 = -1248213378;
                                            } else {
                                                iM55685 = (C0946.m55979("֨۫") ^ i37) * C0254q.f1218h;
                                                i30 = ((iM55685 ^ i36) * 22579) ^ (-1047769399);
                                                i31 = 269599869;
                                            }
                                            i40 = iM55685 ^ i31;
                                            i38 = i30;
                                            break;
                                        case 3607268:
                                        case 1931220075:
                                            if (C1048.f81963) {
                                                iM55685 = C0873.m55680("ܳ۠") ^ i36;
                                                i30 = ((iM55685 ^ i37) * 9013) ^ (-172925361);
                                                i31 = -1492491281;
                                            } else {
                                                iM55685 = C0946.m55979("ۖܰ") ^ i36;
                                                i30 = ((iM55685 ^ i37) * (-29587)) ^ 1431814325;
                                                i31 = 1197328680;
                                            }
                                            i40 = iM55685 ^ i31;
                                            i38 = i30;
                                            break;
                                        case 110307066:
                                        case 512864313:
                                            i33 = 16458;
                                            iM55685 = C0873.m55680("ܶ֨") ^ i36;
                                            i30 = ((iM55685 ^ i37) * 31503) ^ 1209291625;
                                            i31 = 1068125155;
                                            i40 = iM55685 ^ i31;
                                            i38 = i30;
                                            break;
                                        case 393188162:
                                        case 2020817499:
                                            if (C1046.f81962 <= 0) {
                                                iM55685 = (C0946.m55979("֨۫") ^ i37) * C0254q.f1218h;
                                                i30 = ((iM55685 ^ i36) * 22579) ^ (-1047769399);
                                                i31 = 269599869;
                                            } else {
                                                iM55685 = C0873.m55680("ۜۚ") ^ i36;
                                                i30 = ((iM55685 ^ i37) * 25883) ^ (-1367159887);
                                                i31 = -57488175;
                                            }
                                            i40 = iM55685 ^ i31;
                                            i38 = i30;
                                            break;
                                        case 1014216767:
                                        case 2075943080:
                                            strM55750 = C0892.m55750(sArr6, i34, 15, i33);
                                            if (C1028.f81950 <= 0) {
                                                iM55685 = C0946.m55979("ۖܰ") ^ i36;
                                                i30 = ((iM55685 ^ i37) * (-29587)) ^ 1431814325;
                                                i31 = 1197328680;
                                            } else {
                                                iM55685 = C0946.m55979("ܿ۟") ^ i37;
                                                i30 = ((iM55685 ^ i36) * (-25057)) ^ (-1044199493);
                                                i31 = 1722074361;
                                            }
                                            i40 = iM55685 ^ i31;
                                            i38 = i30;
                                            break;
                                        case 1067637825:
                                        case 1634561085:
                                            C1044.m56286();
                                            break;
                                        case 1520446691:
                                        case 1782994836:
                                            if (C0946.m55980() != 0) {
                                                iM55685 = C0946.m55979("ۡܶ") ^ i37;
                                                i30 = ((iM55685 ^ i36) * 30181) ^ (-1962270361);
                                                i31 = 759906676;
                                            } else {
                                                iM55685 = (i37 - C0873.m55680("۫ۗ")) * 85;
                                                i30 = ((iM55685 ^ i36) * (-8901)) ^ (-209454587);
                                                i31 = 1477529732;
                                            }
                                            i40 = iM55685 ^ i31;
                                            i38 = i30;
                                            break;
                                        case 1538234537:
                                        case 2033981915:
                                            sArr5 = f81990;
                                            if (C0989.m56095() <= 0) {
                                                iM55685 = (C0946.m55979("֨۫") ^ i37) * C0254q.f1218h;
                                                i30 = ((iM55685 ^ i36) * 22579) ^ (-1047769399);
                                                i31 = 269599869;
                                            } else {
                                                iM55685 = (C0946.m55979("᩶ܿ") ^ i37) * (-13);
                                                i30 = ((iM55685 ^ i36) * (-10015)) ^ 367467618;
                                                i31 = -720533168;
                                            }
                                            i40 = iM55685 ^ i31;
                                            i38 = i30;
                                            break;
                                        default:
                                            C0949.m56017(checkBox, z);
                                            break;
                                    }
                                    return;
                                }
                                iM55686 = C0946.m55979("ܺ᩵") ^ i36;
                                i38 = ((iM55686 ^ i37) * 15425) ^ 1654760262;
                                i39 = -862819450;
                            }
                        }
                    };
                    sArr4 = f82967;
                    if (C1003.f81929 > 0) {
                        iM55683 = (C0873.m55680("᩷᩷") ^ i13) * 41;
                        i7 = ((iM55683 ^ i12) * (-3017)) ^ (-840302266);
                        i11 = -1332854134;
                        i15 = iM55683 ^ i11;
                        i14 = i7;
                    } else {
                        obj3 = obj3;
                        interfaceC14101 = interfaceC14101;
                        onClickListener3 = onClickListener3;
                        main = main;
                        view3 = view3;
                        i20 = i20;
                        i23 = i23;
                        iM55680 = C0873.m55680("֡֡") ^ i12;
                        i14 = ((iM55680 ^ i13) * (-29011)) ^ 494444985;
                        i = 729949234;
                        i6 = iM55680 ^ i;
                        main = main;
                        i23 = i23;
                        i20 = i20;
                        view3 = view3;
                        interfaceC14101 = interfaceC14101;
                        onClickListener3 = onClickListener3;
                        obj3 = obj3;
                        i15 = i6;
                        checkBox = checkBox;
                    }
                    break;
                case 542811219:
                case 1057498764:
                    obj3 = obj3;
                    onClickListener3 = onClickListener3;
                    C1048.m56304(C0892.m55755(viewM56181, C0946.m55979(strM55597) ^ 2122911201), onClickListener3);
                    int iM559715 = (C0946.m55979("ۤܰ") ^ i12) * (-7);
                    sArr = sArr;
                    i14 = ((iM559715 ^ i13) * (-13867)) ^ 1841140283;
                    i6 = iM559715 ^ 1506280764;
                    i23 = i23;
                    view3 = view3;
                    i20 = i20;
                    onClickListener3 = onClickListener3;
                    obj3 = obj3;
                    i15 = i6;
                    checkBox = checkBox;
                    break;
                case 563319565:
                case 1464952624:
                    C0906.m55817(c20671M55654, C0946.m55979(strM55592) ^ 2119315473, dialogInterfaceOnClickListenerC13498);
                    sArr3 = f82967;
                    i24 = 355;
                    i25 = 3;
                    if (C0992.f81922 < 0) {
                        iM55683 = C0873.m55680("ۤ֨") ^ i12;
                        i7 = ((iM55683 ^ i13) * (-18295)) ^ 1045395169;
                        i11 = 781708469;
                        i15 = iM55683 ^ i11;
                        i14 = i7;
                    } else {
                        obj3 = obj3;
                        interfaceC14101 = interfaceC14101;
                        onClickListener3 = onClickListener3;
                        main = main;
                        view3 = view3;
                        i20 = i20;
                        i23 = i23;
                        iM55680 = C0873.m55680("֡֡") ^ i12;
                        i14 = ((iM55680 ^ i13) * (-29011)) ^ 494444985;
                        i = 729949234;
                        i6 = iM55680 ^ i;
                        main = main;
                        i23 = i23;
                        i20 = i20;
                        view3 = view3;
                        interfaceC14101 = interfaceC14101;
                        onClickListener3 = onClickListener3;
                        obj3 = obj3;
                        i15 = i6;
                        checkBox = checkBox;
                    }
                    break;
                case 593581071:
                case 1798965218:
                    obj3 = obj3;
                    interfaceC14100 = interfaceC14101;
                    onClickListener3 = onClickListener3;
                    view3 = view3;
                    i20 = i20;
                    i23 = i23;
                    Main main2 = viewOnClickListenerC21364.f67355;
                    int iM559716 = C0946.m55979(RunnableC0938.m55936(f82967, 322, 3, i16));
                    i19 = 2128015201;
                    if (ViewOnClickListenerC0939.m55941() >= 0) {
                        main = main2;
                        i18 = iM559716;
                        int iM559717 = (C0946.m55979("ۢ֡") + i13) * 61;
                        i14 = ((iM559717 ^ i12) * (-31367)) ^ (-441496144);
                        i6 = iM559717 ^ 706669209;
                        interfaceC14101 = interfaceC14100;
                        i23 = i23;
                        i20 = i20;
                        view3 = view3;
                        onClickListener3 = onClickListener3;
                        obj3 = obj3;
                        i15 = i6;
                    } else {
                        int iM55685 = C0873.m55680("ۧ۬") ^ i12;
                        interfaceC14101 = interfaceC14100;
                        i23 = i23;
                        i20 = i20;
                        view3 = view3;
                        onClickListener3 = onClickListener3;
                        obj3 = obj3;
                        i15 = iM55685 ^ 216956430;
                        i14 = ((iM55685 ^ i13) * (-29675)) ^ 1269548649;
                        main = main2;
                        i18 = iM559716;
                    }
                    checkBox = checkBox;
                    break;
                case 735988473:
                case 1015643183:
                    obj3 = obj3;
                    int i29 = i23;
                    onClickListener3 = onClickListener3;
                    C0947.m55996(C1404.m56465(viewM56181, C0873.m55680(C1012.m56144(sArr2, i29, 3, i16)) ^ 2121741828), onClickListener3);
                    if (C1404.f82149 >= 0) {
                        view3 = view3;
                        i20 = i20;
                        i23 = i29;
                        interfaceC14100 = interfaceC14101;
                        int iM559718 = (C0946.m55979("ۢ֡") + i13) * 61;
                        i14 = ((iM559718 ^ i12) * (-31367)) ^ (-441496144);
                        i6 = iM559718 ^ 706669209;
                        interfaceC14101 = interfaceC14100;
                        i23 = i23;
                        i20 = i20;
                        view3 = view3;
                        onClickListener3 = onClickListener3;
                        obj3 = obj3;
                        i15 = i6;
                    } else {
                        int iM559719 = C0946.m55979("ܿ۬") ^ i12;
                        i23 = i29;
                        onClickListener3 = onClickListener3;
                        obj3 = obj3;
                        i15 = iM559719 ^ 895944067;
                        i14 = ((iM559719 ^ i13) * (-10041)) ^ (-989699204);
                    }
                    checkBox = checkBox;
                    break;
                case 832913084:
                case 1369646307:
                    obj3 = obj3;
                    interfaceC14101 = interfaceC14101;
                    onClickListener3 = onClickListener3;
                    main = main;
                    view3 = view3;
                    i20 = i20;
                    i23 = i23;
                    short s2 = f82967[321];
                    int i30 = s2 + 12936;
                    if (C1003.m56123() == 0) {
                        int iM559720 = (C0946.m55979("ۢۙ") ^ i13) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        s = s2;
                        i17 = i30;
                        i23 = i23;
                        i20 = i20;
                        view3 = view3;
                        i14 = ((iM559720 ^ i12) * 23033) ^ 1799509558;
                        onClickListener3 = onClickListener3;
                        obj3 = obj3;
                        i15 = iM559720 ^ (-1230546133);
                        main = main;
                        interfaceC14101 = interfaceC14101;
                    } else {
                        s = s2;
                        i17 = i30;
                        iM55680 = C0873.m55680("֡֡") ^ i12;
                        i14 = ((iM55680 ^ i13) * (-29011)) ^ 494444985;
                        i = 729949234;
                        i6 = iM55680 ^ i;
                        main = main;
                        i23 = i23;
                        i20 = i20;
                        view3 = view3;
                        interfaceC14101 = interfaceC14101;
                        onClickListener3 = onClickListener3;
                        obj3 = obj3;
                        i15 = i6;
                        checkBox = checkBox;
                    }
                    break;
                default:
                    Object obj5 = obj3;
                    int i31 = i20;
                    short[] sArr5 = sArr;
                    int i32 = i21;
                    View.OnClickListener onClickListener6 = onClickListener3;
                    int i33 = i23;
                    View viewM56465 = C1404.m56465(viewM56181, C0946.m55979(RunnableC1014.m56180(sArr5, i32, i31, i16)) ^ 2098127059);
                    int iM55686 = C0873.m55680("ۛۖ") ^ i12;
                    int i34 = ((iM55686 ^ i13) * 27701) ^ (-525027782);
                    onClickListener3 = onClickListener6;
                    i23 = i33;
                    obj3 = obj5;
                    i20 = i31;
                    i15 = iM55686 ^ 633807966;
                    sArr = sArr5;
                    i14 = i34;
                    checkBox = checkBox;
                    view3 = viewM56465;
                    i21 = i32;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00d9 A[PHI: r4 r8 r12 r13 r17
      0x00d9: PHI (r4v4 char) = (r4v3 char), (r4v2 char), (r4v2 char) binds: [B:64:0x0275, B:52:0x01fd, B:28:0x00d7] A[DONT_GENERATE, DONT_INLINE]
      0x00d9: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:64:0x0275, B:52:0x01fd, B:28:0x00d7] A[DONT_GENERATE, DONT_INLINE]
      0x00d9: PHI (r12v3 int) = (r12v2 int), (r12v2 int), (r12v4 int) binds: [B:64:0x0275, B:52:0x01fd, B:28:0x00d7] A[DONT_GENERATE, DONT_INLINE]
      0x00d9: PHI (r13v3 int) = (r13v2 int), (r13v2 int), (r13v4 int) binds: [B:64:0x0275, B:52:0x01fd, B:28:0x00d7] A[DONT_GENERATE, DONT_INLINE]
      0x00d9: PHI (r17v16 l.۬ۤۡ) = (r17v4 l.۬ۤۡ), (r17v8 l.۬ۤۡ), (r17v17 l.۬ۤۡ) binds: [B:64:0x0275, B:52:0x01fd, B:28:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0243 A[PHI: r5 r6 r7 r17
      0x0243: PHI (r5v4 short) = (r5v3 short), (r5v2 short) binds: [B:60:0x0241, B:56:0x021f] A[DONT_GENERATE, DONT_INLINE]
      0x0243: PHI (r6v4 int) = (r6v3 int), (r6v2 int) binds: [B:60:0x0241, B:56:0x021f] A[DONT_GENERATE, DONT_INLINE]
      0x0243: PHI (r7v3 int) = (r7v2 int), (r7v4 int) binds: [B:60:0x0241, B:56:0x021f] A[DONT_GENERATE, DONT_INLINE]
      0x0243: PHI (r17v6 l.۬ۤۡ) = (r17v5 l.۬ۤۡ), (r17v7 l.۬ۤۡ) binds: [B:60:0x0241, B:56:0x021f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x02ce A[PHI: r17 r18
      0x02ce: PHI (r17v26 l.۬ۤۡ) = (r17v2 l.۬ۤۡ), (r17v3 l.۬ۤۡ), (r17v27 l.۬ۤۡ) binds: [B:73:0x02cc, B:69:0x02af, B:11:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x02ce: PHI (r18v6 short[]) = (r18v3 short[]), (r18v4 short[]), (r18v3 short[]) binds: [B:73:0x02cc, B:69:0x02af, B:11:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0083, code lost:
    
        if (p067l.C0861.f81831 != false) goto L15;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m48387(C12096 c12096, CheckBox checkBox) {
        int iM55680;
        int i;
        int i2;
        int i3 = C1404.f82149;
        int i4 = RunnableC1014.f81941;
        int iM55681 = C0873.m55680("ܺۧ") ^ i3;
        int i5 = ((iM55681 ^ i4) * (-20007)) ^ (-386308270);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM55681 ^ 1724595742;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -588678827;
        String strM48400 = null;
        InterfaceC14770 interfaceC14770M55814 = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * (-15399)) >> 31));
            switch (i13) {
                case -2142490755:
                case -438515140:
                    i10 = 53945;
                    iM55680 = (C0946.m55979("᩻ۙ") ^ i4) * (-123);
                    i = ((iM55680 ^ i3) * (-15219)) ^ (-1569182840);
                    i2 = -906739492;
                    InterfaceC14770 interfaceC14770 = interfaceC14770M55814;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    interfaceC14770M55814 = interfaceC14770;
                    break;
                case -2021090270:
                case -660210901:
                    interfaceC14770M55814 = interfaceC14770M55814;
                    sArr = f82967;
                    if (C1048.f81963) {
                        iM55680 = C0873.m55680("ܿ۟") ^ i3;
                        i = ((iM55680 ^ i4) * (-15523)) ^ (-1583751549);
                        i2 = -597836328;
                    } else {
                        iM55680 = C0946.m55979("ܶܽ") ^ i3;
                        i = ((iM55680 ^ i4) * 11769) ^ (-1279461007);
                        i2 = 122279302;
                    }
                    InterfaceC14770 interfaceC14771 = interfaceC14770M55814;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    interfaceC14770M55814 = interfaceC14771;
                    break;
                case -1996598287:
                case 1141064973:
                    interfaceC14770M55814 = interfaceC14770M55814;
                    int i14 = s + s2;
                    if (i9 - (i14 * i14) < 0) {
                        iM55680 = C0946.m55979("᩻ܽ") ^ i3;
                        i = ((iM55680 ^ i4) * 6897) ^ 1690020290;
                        i2 = 1415918691;
                    } else {
                        iM55680 = C0873.m55680("ۗ۟") ^ i4;
                        i = ((iM55680 ^ i3) * 13517) ^ (-1695681729);
                        i2 = -1890720093;
                    }
                    InterfaceC14770 interfaceC14772 = interfaceC14770M55814;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    interfaceC14770M55814 = interfaceC14772;
                    break;
                case -1931491235:
                case -316868350:
                    C1046.m56302();
                    C0861.m55626();
                    interfaceC14770M55814 = interfaceC14770M55814;
                    iM55680 = (i4 - C0946.m55979("ۧ۬")) * (-87);
                    i = ((iM55680 ^ i3) * (-20783)) ^ 832870893;
                    i2 = -922095865;
                    InterfaceC14770 interfaceC14773 = interfaceC14770M55814;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    interfaceC14770M55814 = interfaceC14773;
                    break;
                case -1847015039:
                case -1293811761:
                    interfaceC14770M55814 = interfaceC14770M55814;
                    if (C1028.f81950 <= 0) {
                        iM55680 = C0946.m55979("ܶܽ") ^ i3;
                        i = ((iM55680 ^ i4) * 11769) ^ (-1279461007);
                        i2 = 122279302;
                    } else {
                        iM55680 = C0873.m55680("᩺᩵") ^ i4;
                        i = ((iM55680 ^ i3) * 11271) ^ (-939534161);
                        i2 = -1186170435;
                    }
                    InterfaceC14770 interfaceC14774 = interfaceC14770M55814;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    interfaceC14770M55814 = interfaceC14774;
                    break;
                case -1638825442:
                case 2041949016:
                    interfaceC14770M55814 = interfaceC14770M55814;
                    i8 = 145853929;
                    if (C0894.f81854 >= 0) {
                        iM55680 = C0873.m55680("ۤۘ") ^ i3;
                        i = ((iM55680 ^ i4) * (-28077)) ^ 2059653819;
                        i2 = -1899670589;
                    } else {
                        iM55680 = C0946.m55979("ۤ֨") ^ i4;
                        i = ((iM55680 ^ i3) * 23875) ^ 749230915;
                        i2 = 96987206;
                    }
                    InterfaceC14770 interfaceC14775 = interfaceC14770M55814;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    interfaceC14770M55814 = interfaceC14775;
                    break;
                case -801005502:
                case 1558108830:
                    C0877.m55693(checkBox, true);
                    break;
                case -748481411:
                case -383192918:
                    C0937.m55918();
                    if (!C0890.m55740()) {
                        iM55680 = (C0873.m55680("ܿ᩺") ^ i4) * (-13);
                        interfaceC14770M55814 = interfaceC14770M55814;
                        i = ((iM55680 ^ i3) * (-15449)) ^ 1907321325;
                        i2 = -1950027617;
                        InterfaceC14770 interfaceC14776 = interfaceC14770M55814;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                        interfaceC14770M55814 = interfaceC14776;
                    }
                    interfaceC14770M55814 = interfaceC14770M55814;
                    iM55680 = (i4 - C0946.m55979("ۧ۬")) * (-87);
                    i = ((iM55680 ^ i3) * (-20783)) ^ 832870893;
                    i2 = -922095865;
                    InterfaceC14770 interfaceC14777 = interfaceC14770M55814;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    interfaceC14770M55814 = interfaceC14777;
                    break;
                case -661462292:
                case 452627882:
                    interfaceC14770M55814 = interfaceC14770M55814;
                    s2 = 12077;
                    if (C0882.m55710() != 0) {
                        iM55680 = (i4 - C0946.m55979("ۧ۬")) * (-87);
                        i = ((iM55680 ^ i3) * (-20783)) ^ 832870893;
                        i2 = -922095865;
                    } else {
                        iM55680 = C0946.m55979("ۖ᩺") ^ i3;
                        i = ((iM55680 ^ i4) * (-29851)) ^ 1048636757;
                        i2 = 1557437097;
                    }
                    InterfaceC14770 interfaceC14778 = interfaceC14770M55814;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    interfaceC14770M55814 = interfaceC14778;
                    break;
                case -627461037:
                case 1453951593:
                    strM48400 = m48400();
                    interfaceC14770M55814 = interfaceC14770M55814;
                    iM55680 = (C0873.m55680("ۛۘ") ^ i3) * (-55);
                    i = ((iM55680 ^ i4) * (-12743)) ^ (-896813513);
                    i2 = 919104028;
                    InterfaceC14770 interfaceC14779 = interfaceC14770M55814;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    interfaceC14770M55814 = interfaceC14779;
                    break;
                case -520788420:
                case -290983450:
                    i10 = 43710;
                    iM55680 = (C0946.m55979("᩻ۙ") ^ i4) * (-123);
                    i = ((iM55680 ^ i3) * (-15219)) ^ (-1569182840);
                    i2 = -906739492;
                    InterfaceC14770 interfaceC147710 = interfaceC14770M55814;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    interfaceC14770M55814 = interfaceC147710;
                    break;
                case -364310070:
                case 142048612:
                    interfaceC14770M55814 = interfaceC14770M55814;
                    c = '{';
                    if (C0873.f81841 <= 0) {
                        interfaceC14770M55814 = interfaceC14770M55814;
                        iM55680 = (C0873.m55680("ܿ᩺") ^ i4) * (-13);
                        interfaceC14770M55814 = interfaceC14770M55814;
                        i = ((iM55680 ^ i3) * (-15449)) ^ 1907321325;
                        i2 = -1950027617;
                    } else {
                        iM55680 = (C0873.m55680("֫᩻") ^ i4) * 81;
                        i = ((iM55680 ^ i3) * 22735) ^ 1044542831;
                        i2 = -1101960426;
                    }
                    InterfaceC14770 interfaceC147711 = interfaceC14770M55814;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    interfaceC14770M55814 = interfaceC147711;
                    break;
                case -292187034:
                case 1544269109:
                    interfaceC14770M55814 = C0906.m55814(ApplicationC21448.f67649);
                    sArr2 = f82967;
                    if (C0898.f81858 <= 0) {
                        iM55680 = (C0873.m55680("ܿ᩺") ^ i4) * (-13);
                        interfaceC14770M55814 = interfaceC14770M55814;
                        i = ((iM55680 ^ i3) * (-15449)) ^ 1907321325;
                        i2 = -1950027617;
                    } else {
                        iM55680 = C0873.m55680("᩺᩷") ^ i4;
                        interfaceC14770M55814 = interfaceC14770M55814;
                        i = ((iM55680 ^ i3) * 4839) ^ 1480660559;
                        i2 = -1773272233;
                    }
                    InterfaceC14770 interfaceC147712 = interfaceC14770M55814;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    interfaceC14770M55814 = interfaceC147712;
                    break;
                case -140017209:
                case 1792410044:
                    interfaceC14770M55814 = interfaceC14770M55814;
                    i11 = 124;
                    i12 = 15;
                    if (C1017.f81942 >= 0) {
                        interfaceC14770M55814 = interfaceC14770M55814;
                        iM55680 = (C0873.m55680("ܿ᩺") ^ i4) * (-13);
                        interfaceC14770M55814 = interfaceC14770M55814;
                        i = ((iM55680 ^ i3) * (-15449)) ^ 1907321325;
                        i2 = -1950027617;
                    } else {
                        iM55680 = C0946.m55979("ۗ֨") ^ i4;
                        i = ((iM55680 ^ i3) * 29401) ^ (-1750798131);
                        i2 = -761652016;
                    }
                    InterfaceC14770 interfaceC147713 = interfaceC14770M55814;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    interfaceC14770M55814 = interfaceC147713;
                    break;
                case 736284243:
                case 1680735919:
                    interfaceC14770M55814 = interfaceC14770M55814;
                    int i15 = i7 + i8;
                    i9 = i15 + i15;
                    if (C1046.f81962 <= 0) {
                        interfaceC14770M55814 = interfaceC14770M55814;
                        iM55680 = (C0873.m55680("ܿ᩺") ^ i4) * (-13);
                        interfaceC14770M55814 = interfaceC14770M55814;
                        i = ((iM55680 ^ i3) * (-15449)) ^ 1907321325;
                        i2 = -1950027617;
                    } else {
                        iM55680 = C0946.m55979("᩹ۨ") ^ i3;
                        i = ((iM55680 ^ i4) * (-2511)) ^ (-433605128);
                        i2 = -824995559;
                    }
                    InterfaceC14770 interfaceC147714 = interfaceC14770M55814;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    interfaceC14770M55814 = interfaceC147714;
                    break;
                case 753876471:
                case 2011077896:
                    C0912.m55833();
                    break;
                case 810244331:
                case 1163723707:
                    interfaceC14770M55814 = interfaceC14770M55814;
                    s = sArr[c];
                    i7 = s * s;
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = C0873.m55680("ۤۘ") ^ i3;
                        i = ((iM55680 ^ i4) * (-28077)) ^ 2059653819;
                        i2 = -1899670589;
                    } else {
                        iM55680 = C0873.m55680("᩹ܶ") ^ i3;
                        i = ((iM55680 ^ i4) * 24993) ^ 1703953802;
                        i2 = -1382238279;
                    }
                    InterfaceC14770 interfaceC147715 = interfaceC14770M55814;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    interfaceC14770M55814 = interfaceC147715;
                    break;
                case 1029866499:
                case 1572536204:
                    interfaceC14770M55814 = interfaceC14770M55814;
                    String strM55639 = C0863.m55639(C1404.m56467(c12096));
                    if (C0937.m55923(strM55639)) {
                        iM55680 = C0946.m55979("ᩴۚ") ^ i3;
                        i = ((iM55680 ^ i4) * 9229) ^ 1215458353;
                        i2 = -2105501773;
                    } else {
                        strM48400 = strM55639;
                        iM55680 = (C0873.m55680("ۛۘ") ^ i3) * (-55);
                        i = ((iM55680 ^ i4) * (-12743)) ^ (-896813513);
                        i2 = 919104028;
                    }
                    InterfaceC14770 interfaceC147716 = interfaceC14770M55814;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    interfaceC14770M55814 = interfaceC147716;
                    break;
                case 1157965718:
                case 1886831375:
                    C1028.m56247();
                    break;
                case 1525655691:
                case 1972837391:
                    C0930.m55885();
                    if (RunnableC0938.f81886 < 0) {
                        interfaceC14770M55814 = interfaceC14770M55814;
                        iM55680 = C0946.m55979("ܶܽ") ^ i3;
                        i = ((iM55680 ^ i4) * 11769) ^ (-1279461007);
                        i2 = 122279302;
                        InterfaceC14770 interfaceC147717 = interfaceC14770M55814;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                        interfaceC14770M55814 = interfaceC147717;
                    } else {
                        int iM55979 = C0946.m55979("᩷ۗ") ^ i4;
                        i6 = iM55979 ^ 1292290842;
                        i5 = ((iM55979 ^ i3) * (-9851)) ^ (-1024161174);
                    }
                    break;
                default:
                    C0937.m55912(C1025.m56231(interfaceC14770M55814, C1194.m56386(sArr2, i11, i12, i10), strM48400));
                    if (C0866.f81837 >= 0) {
                        interfaceC14770M55814 = interfaceC14770M55814;
                        iM55680 = C0946.m55979("ܶܽ") ^ i3;
                        i = ((iM55680 ^ i4) * 11769) ^ (-1279461007);
                        i2 = 122279302;
                    } else {
                        iM55680 = C0946.m55979("۟ܿ") ^ i3;
                        interfaceC14770M55814 = interfaceC14770M55814;
                        i = ((iM55680 ^ i4) * (-21435)) ^ 1716340873;
                        i2 = -1997266462;
                    }
                    InterfaceC14770 interfaceC147718 = interfaceC14770M55814;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    interfaceC14770M55814 = interfaceC147718;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x01b2 A[PHI: r5 r8 r9
      0x01b2: PHI (r5v4 short) = (r5v3 short), (r5v2 short), (r5v2 short), (r5v2 short) binds: [B:51:0x01b0, B:43:0x015e, B:12:0x005a, B:9:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x01b2: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:51:0x01b0, B:43:0x015e, B:12:0x005a, B:9:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x01b2: PHI (r9v4 short) = (r9v2 short), (r9v3 short), (r9v2 short), (r9v2 short) binds: [B:51:0x01b0, B:43:0x015e, B:12:0x005a, B:9:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x01fe A[PHI: r1 r11 r13
      0x01fe: PHI (r1v4 l.۫ۤۡ) = (r1v2 l.۫ۤۡ), (r1v2 l.۫ۤۡ), (r1v3 l.۫ۤۡ), (r1v2 l.۫ۤۡ), (r1v2 l.۫ۤۡ) binds: [B:59:0x01fc, B:55:0x01e0, B:32:0x00ea, B:27:0x00b4, B:15:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x01fe: PHI (r11v4 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v3 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:59:0x01fc, B:55:0x01e0, B:32:0x00ea, B:27:0x00b4, B:15:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x01fe: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:59:0x01fc, B:55:0x01e0, B:32:0x00ea, B:27:0x00b4, B:15:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x022b A[PHI: r12
      0x022b: PHI (r12v3 int) = (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v5 int) binds: [B:63:0x0229, B:17:0x0064, B:15:0x0060, B:12:0x005a, B:6:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x025f A[PHI: r4 r18
      0x025f: PHI (r4v4 char) = (r4v3 char), (r4v2 char) binds: [B:67:0x025d, B:9:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]) binds: [B:67:0x025d, B:9:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static String m48386() {
        int iM55680;
        int i;
        int i2;
        String strM56333;
        int i3 = C1124.f82007;
        int i4 = C1229.f82066;
        int iM55979 = C0946.m55979("ܿ۬") ^ i3;
        int i5 = ((iM55979 ^ i4) * 20241) ^ 1976194875;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM55979 ^ 847230544;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 2022008870;
        String str = null;
        InterfaceC14100 interfaceC14100 = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * 9183) >> 31));
            switch (i13) {
                case -2093695645:
                case 2033641822:
                    if (C1025.f81947 >= 0) {
                        iM55680 = C0946.m55979("ܺ᩹") ^ i4;
                        i = ((iM55680 ^ i3) * 6507) ^ 1260250950;
                        i2 = -898655460;
                    } else {
                        iM55680 = (C0873.m55680("ۛ۫") + i3) * (-87);
                        i = ((iM55680 ^ i4) * (-25431)) ^ (-1654793889);
                        i2 = -670248613;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1943263136:
                case 183056415:
                    i10 = 34111;
                    iM55680 = (C0946.m55979("ۖᩳ") + i4) * 109;
                    i = ((iM55680 ^ i3) * (-11789)) ^ 1015088054;
                    i2 = -272650781;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1927327377:
                case 675301131:
                    i10 = 55397;
                    iM55680 = (C0946.m55979("ۖᩳ") + i4) * 109;
                    i = ((iM55680 ^ i3) * (-11789)) ^ 1015088054;
                    i2 = -272650781;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1724216767:
                case -1299529437:
                    i9 = i7 + i8;
                    s2 = 31354;
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = (C0873.m55680("ᩳ᩸") + i3) * (-73);
                        i = ((iM55680 ^ i4) * 26951) ^ (-1205115645);
                        i2 = 2036266754;
                    } else {
                        iM55680 = (i4 - C0946.m55979("ۛۜ")) * (-45);
                        i = ((iM55680 ^ i3) * 28491) ^ 758081090;
                        i2 = -104918292;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1546324243:
                case 615686284:
                    AbstractC0942.m55971();
                    return null;
                case -1434423857:
                case 847791182:
                    if (C0894.f81854 >= 0) {
                        iM55680 = (C0873.m55680("ܰ֨") ^ i4) * (-83);
                        i = ((iM55680 ^ i3) * 28287) ^ (-1426532515);
                        i2 = 1805096991;
                    } else {
                        iM55680 = (C0946.m55979("ۖᩴ") ^ i4) * (-59);
                        i = ((iM55680 ^ i3) * (-24759)) ^ (-709750000);
                        i2 = -753407231;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1421373821:
                case -1175077372:
                    s = sArr[c];
                    if (C0992.f81922 >= 0) {
                        iM55680 = (C0873.m55680("ᩳ᩸") + i3) * (-73);
                        i = ((iM55680 ^ i4) * 26951) ^ (-1205115645);
                        i2 = 2036266754;
                    } else {
                        iM55680 = C0873.m55680("᩵ۙ") ^ i4;
                        i = ((iM55680 ^ i3) * (-1149)) ^ 371610775;
                        i2 = -480317065;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1221373828:
                case -165040638:
                    if (C1194.m56396() > 0) {
                        iM55680 = (C0873.m55680("ܰ֨") ^ i4) * (-83);
                        i = ((iM55680 ^ i3) * 28287) ^ (-1426532515);
                        i2 = 1805096991;
                    } else {
                        iM55680 = (C0873.m55680("ᩳ᩸") + i3) * (-73);
                        i = ((iM55680 ^ i4) * 26951) ^ (-1205115645);
                        i2 = 2036266754;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1161686568:
                case 743887159:
                    interfaceC14100 = ApplicationC21448.f67649;
                    sArr2 = f82967;
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = C0946.m55979("ܺ᩹") ^ i4;
                        i = ((iM55680 ^ i3) * 6507) ^ 1260250950;
                        i2 = -898655460;
                    } else {
                        iM55680 = C0946.m55979("۫ۨ") ^ i4;
                        i = ((iM55680 ^ i3) * 9735) ^ 1200460151;
                        i2 = -481735583;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -935546873:
                case -521607998:
                    strM56333 = C1053.m56333(interfaceC14100, C0949.m56016(sArr2, i11, i12, i10), null);
                    if (strM56333 == null) {
                        iM55680 = C0873.m55680("۠ܽ") ^ i3;
                        i = ((iM55680 ^ i4) * 7211) ^ 1447772253;
                        i2 = -875002941;
                    } else {
                        str = strM56333;
                        iM55680 = (i3 - C0946.m55979("ۘۧ")) * (-49);
                        i = ((iM55680 ^ i4) * 19761) ^ (-1998543990);
                        i2 = 1711456964;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -548900470:
                case 965196252:
                    sArr = f82967;
                    c = 'k';
                    if (C1017.f81942 >= 0) {
                        iM55680 = (i4 - C0946.m55979("۠ܰ")) * 63;
                        i = ((iM55680 ^ i3) * 11105) ^ 1908754336;
                        i2 = 1008990923;
                    } else {
                        iM55680 = C0873.m55680("۫۟") ^ i3;
                        i = ((iM55680 ^ i4) * (-9785)) ^ 1564625245;
                        i2 = -541083315;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -454288481:
                case 1387073332:
                    i7 = s * s;
                    i8 = 245768329;
                    if (C0967.f81910 >= 0) {
                        iM55680 = C0946.m55979("ۛ᩸") ^ i3;
                        i = ((iM55680 ^ i4) * (-12135)) ^ (-668539389);
                        i2 = -497359520;
                    } else {
                        iM55680 = C0946.m55979("ᩳۨ") ^ i3;
                        i = ((iM55680 ^ i4) * 14399) ^ (-824810983);
                        i2 = 1947111619;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -252705585:
                case 1395966029:
                    i12 = 15;
                    if (C1404.f82149 >= 0) {
                        iM55680 = C0946.m55979("ܺ᩹") ^ i4;
                        i = ((iM55680 ^ i3) * 6507) ^ 1260250950;
                        i2 = -898655460;
                    } else {
                        iM55680 = (C0946.m55979("ᩴ۬") + i4) * 35;
                        i = ((iM55680 ^ i3) * (-2113)) ^ (-1169162125);
                        i2 = -1263211425;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -135103124:
                case 258812874:
                    if (C0930.f81879 > 0) {
                        iM55680 = (C0873.m55680("ᩳ᩸") + i3) * (-73);
                        i = ((iM55680 ^ i4) * 26951) ^ (-1205115645);
                        i2 = 2036266754;
                    } else {
                        iM55680 = (i4 - C0946.m55979("۠ܰ")) * 63;
                        i = ((iM55680 ^ i3) * 11105) ^ 1908754336;
                        i2 = 1008990923;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -125853895:
                case -23166980:
                    return str;
                case 164215047:
                case 2074059812:
                    C1404.m56468();
                    C1229.m56410();
                    iM55680 = (C0873.m55680("ܰ֨") ^ i4) * (-83);
                    i = ((iM55680 ^ i3) * 28287) ^ (-1426532515);
                    i2 = 1805096991;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 587766630:
                case 767278544:
                    if (C1053.f81965 <= 0) {
                        iM55680 = (C0873.m55680("ܰ֨") ^ i4) * (-83);
                        i = ((iM55680 ^ i3) * 28287) ^ (-1426532515);
                        i2 = 1805096991;
                    } else {
                        iM55680 = C0946.m55979("ܺ᩹") ^ i4;
                        i = ((iM55680 ^ i3) * 6507) ^ 1260250950;
                        i2 = -898655460;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 653230025:
                case 790574203:
                    strM56333 = m48400();
                    str = strM56333;
                    iM55680 = (i3 - C0946.m55979("ۘۧ")) * (-49);
                    i = ((iM55680 ^ i4) * 19761) ^ (-1998543990);
                    i2 = 1711456964;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 783415868:
                case 1320027158:
                    if (C0937.f81884) {
                        iM55680 = C0873.m55680("۬ۢ") ^ i4;
                        i = ((iM55680 ^ i3) * (-10353)) ^ 289570503;
                        i2 = 851748178;
                    } else {
                        iM55680 = C0946.m55979("ܺ᩹") ^ i4;
                        i = ((iM55680 ^ i3) * 6507) ^ 1260250950;
                        i2 = -898655460;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 909896843:
                case 1097658494:
                    if ((s * s2) - i9 <= 0) {
                        iM55680 = C0946.m55979("ۨۚ") ^ i3;
                        i = ((iM55680 ^ i4) * 17907) ^ 1165020153;
                        i2 = 1629213893;
                    } else {
                        iM55680 = (C0946.m55979("ۗۖ") ^ i3) * 99;
                        i = ((iM55680 ^ i4) * 10111) ^ 856610501;
                        i2 = -1796889197;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                default:
                    i11 = 108;
                    if (C0992.f81922 >= 0) {
                        iM55680 = (C0873.m55680("ܰ֨") ^ i4) * (-83);
                        i = ((iM55680 ^ i3) * 28287) ^ (-1426532515);
                        i2 = 1805096991;
                    } else {
                        iM55680 = C0946.m55979("֫ۤ") ^ i3;
                        i = ((iM55680 ^ i4) * 4617) ^ (-450538157);
                        i2 = -1107077501;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006c, code lost:
    
        if (p067l.C0967.m56074() != false) goto L8;
     */
    /* JADX INFO: renamed from: ܽ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m48400() {
        int iM55680;
        int i;
        int i2;
        int iM55681;
        int i3;
        int i4;
        int i5 = C1071.f81975;
        int i6 = C0873.f81841;
        int iM55979 = (i5 - C0946.m55979("֫ۖ")) * 25;
        int i7 = ((iM55979 ^ i6) * (-32633)) ^ 845767125;
        String strM56297 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i8 = iM55979 ^ (-969682200);
        StringBuilder sb = null;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 273866646;
        int i15 = 0;
        String strM56086 = null;
        AbstractC17043 abstractC17043M55846 = null;
        AbstractC17043 abstractC17043M40542 = null;
        while (true) {
            i14 = i8 ^ (i7 & (((i14 ^ i6) * (-20015)) >> 31));
            switch (i14) {
                case -2060054287:
                case 1088786679:
                    if (!C0917.f81868) {
                        s = s;
                        iM55680 = (i5 - C0873.m55680("ۧۗ")) * (-65);
                        i = ((iM55680 ^ i6) * (-10855)) ^ 1015740902;
                        i2 = 781498269;
                        short s2 = s;
                        i8 = iM55680 ^ i2;
                        i7 = i;
                        s = s2;
                    } else {
                        iM55681 = (C0873.m55680("᩻ܽ") ^ i5) * C0254q.f1218h;
                        i3 = ((iM55681 ^ i6) * 26231) ^ (-1280489892);
                        i4 = 2053982861;
                        i8 = iM55681 ^ i4;
                        i7 = i3;
                    }
                    break;
                case -2023936892:
                case 1131589694:
                    if (!C0906.m55806(strM56086, strM56297)) {
                        iM55681 = C0873.m55680("ܺ۠") ^ i6;
                        i3 = ((iM55681 ^ i5) * 14651) ^ 1278122607;
                        i4 = 2035197080;
                        i8 = iM55681 ^ i4;
                        i7 = i3;
                    } else {
                        s = s;
                        iM55680 = (C0946.m55979("ܽۖ") + i6) * (-113);
                        i = ((iM55680 ^ i5) * (-23065)) ^ 1302749332;
                        i2 = -327747966;
                        short s3 = s;
                        i8 = iM55680 ^ i2;
                        i7 = i;
                        s = s3;
                    }
                    break;
                case -1889222406:
                case 201702240:
                    s = s;
                    i11 = 25;
                    if (C1404.f82149 >= 0) {
                        iM55680 = C0946.m55979("ۢ᩶") ^ i5;
                        i = ((iM55680 ^ i6) * (-13169)) ^ (-1648298982);
                        i2 = 893554423;
                    } else {
                        iM55680 = C0946.m55979("ۖۤ") ^ i5;
                        i = ((iM55680 ^ i6) * 21487) ^ (-1207756640);
                        i2 = -118333273;
                    }
                    short s4 = s;
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    s = s4;
                    break;
                case -1842642217:
                case 1703383695:
                    C0917.m55854();
                    if (C1404.m56468()) {
                        s = s;
                        iM55680 = C0946.m55979("ۢ᩶") ^ i5;
                        i = ((iM55680 ^ i6) * (-13169)) ^ (-1648298982);
                        i2 = 893554423;
                        short s5 = s;
                        i8 = iM55680 ^ i2;
                        i7 = i;
                        s = s5;
                    }
                    s = s;
                    iM55680 = C0946.m55979("ܶܽ") ^ i6;
                    i = ((iM55680 ^ i5) * (-8171)) ^ 509763522;
                    i2 = 1115859987;
                    short s6 = s;
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    s = s6;
                    break;
                case -1750192813:
                case 808261485:
                    i9 = 49652;
                    iM55680 = (i6 - C0873.m55680("ۜ۟")) * 57;
                    i = ((iM55680 ^ i5) * 31739) ^ 1080913040;
                    i2 = 1882433951;
                    short s7 = s;
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    s = s7;
                    break;
                case -1711181231:
                case 1663554431:
                    s = s;
                    C0912.m55825(sb, C0906.m55810(sArr2, i12, i13, i9));
                    if (C1229.m56404(strM56086, C0845.m55591(sb))) {
                        iM55680 = (C0946.m55979("ܽۖ") + i6) * (-113);
                        i = ((iM55680 ^ i5) * (-23065)) ^ 1302749332;
                        i2 = -327747966;
                    } else {
                        iM55680 = (C0873.m55680("ܶۧ") + i5) * (-51);
                        i = ((iM55680 ^ i6) * (-26429)) ^ (-672993013);
                        i2 = -818308167;
                    }
                    short s8 = s;
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    s = s8;
                    break;
                case -1270844923:
                case 405972370:
                    C1929.m56553();
                    s = s;
                    iM55680 = (i5 - C0873.m55680("ۧۗ")) * (-65);
                    i = ((iM55680 ^ i6) * (-10855)) ^ 1015740902;
                    i2 = 781498269;
                    short s9 = s;
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    s = s9;
                    break;
                case -1112808484:
                case 1339836547:
                    s = s;
                    if (i15 - ((s * s) + 119552356) <= 0) {
                        iM55680 = C0946.m55979("ۡ᩹") ^ i6;
                        i = ((iM55680 ^ i5) * (-18863)) ^ 1979735968;
                        i2 = -853660243;
                    } else {
                        iM55680 = (C0946.m55979("ۛ۫") + i5) * 25;
                        i = ((iM55680 ^ i6) * (-19961)) ^ 2123791067;
                        i2 = -126824571;
                    }
                    short s10 = s;
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    s = s10;
                    break;
                case -912440544:
                case 429541028:
                    s = s;
                    i12 = 387;
                    i13 = 1;
                    if (C0946.f81894 != 0) {
                        iM55680 = (i5 - C0873.m55680("ۧۗ")) * (-65);
                        i = ((iM55680 ^ i6) * (-10855)) ^ 1015740902;
                        i2 = 781498269;
                    } else {
                        iM55680 = C0946.m55979("ۤܶ") ^ i5;
                        i = ((iM55680 ^ i6) * 31985) ^ 1997126970;
                        i2 = 1167905133;
                    }
                    short s11 = s;
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    s = s11;
                    break;
                case -903644111:
                case -565615447:
                    s = s;
                    abstractC17043M55846 = C0917.m55846(abstractC17043M40542, C0894.m55773(sArr, i10, i11, i9));
                    if (C0894.f81854 < 0) {
                        iM55680 = (i6 - C0946.m55979("ۨ᩷")) * (-15);
                        i = ((iM55680 ^ i5) * 27321) ^ (-158202422);
                        i2 = -2103370455;
                        short s12 = s;
                        i8 = iM55680 ^ i2;
                        i7 = i;
                        s = s12;
                    } else {
                        s = s;
                        int iM55682 = C0873.m55680("᩹ۗ") ^ i6;
                        i8 = iM55682 ^ (-544881463);
                        i7 = ((iM55682 ^ i5) * 18391) ^ (-1609007538);
                        sb = null;
                    }
                    break;
                case -158921264:
                case 469149555:
                    short[] sArr3 = f82967;
                    s = s;
                    if (C0898.f81858 > 0) {
                        String strM55667 = RunnableC0871.m55667(sArr3, 388, 8, i9);
                        if (!C1025.m56230()) {
                            StringBuilder sb2 = new StringBuilder(strM55667);
                            C1003.m56121(sb2, C1012.m56135(strM56086, C0882.m55719(strM56297)));
                            return C0845.m55591(sb2);
                        }
                        s = s;
                        int iM55683 = C0873.m55680("᩹ۗ") ^ i6;
                        i8 = iM55683 ^ (-544881463);
                        i7 = ((iM55683 ^ i5) * 18391) ^ (-1609007538);
                        sb = null;
                    } else {
                        s = s;
                        iM55681 = (C0873.m55680("᩻ܽ") ^ i5) * C0254q.f1218h;
                        i3 = ((iM55681 ^ i6) * 26231) ^ (-1280489892);
                        i4 = 2053982861;
                        i8 = iM55681 ^ i4;
                        i7 = i3;
                    }
                    break;
                case 68171149:
                case 2020420109:
                    C1229.m56410();
                    C0906.m55809();
                    return null;
                case 242565061:
                case 1117362301:
                    s = f82967[361];
                    if (C0946.f81894 == 0) {
                        iM55681 = C0946.m55979("ۨۜ") ^ i6;
                        i3 = ((iM55681 ^ i5) * 15355) ^ 1608396237;
                        i4 = 593693572;
                        i8 = iM55681 ^ i4;
                        i7 = i3;
                    } else {
                        int iM55684 = C0873.m55680("᩹ۗ") ^ i6;
                        i8 = iM55684 ^ (-544881463);
                        i7 = ((iM55684 ^ i5) * 18391) ^ (-1609007538);
                        sb = null;
                    }
                    break;
                case 335134691:
                case 1866583095:
                    RunnableC0871.m55672();
                    break;
                case 651074509:
                case 1091031028:
                    s = s;
                    abstractC17043M40542 = C17853.m40542();
                    sArr = f82967;
                    i10 = 362;
                    if (C1964.f83032 <= 0) {
                        iM55680 = C0946.m55979("ܶܽ") ^ i6;
                        i = ((iM55680 ^ i5) * (-8171)) ^ 509763522;
                        i2 = 1115859987;
                    } else {
                        iM55680 = C0873.m55680("۠۟") ^ i5;
                        i = ((iM55680 ^ i6) * (-20729)) ^ 474110933;
                        i2 = 717143647;
                    }
                    short s13 = s;
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    s = s13;
                    break;
                case 756092526:
                case 925001515:
                    s = s;
                    strM56086 = C0989.m56086(abstractC17043M55846);
                    strM56297 = C1046.m56297(C17853.f53287);
                    if (!C0917.f81868) {
                        sb = new StringBuilder();
                        C1003.m56121(sb, strM56297);
                        sArr2 = f82967;
                        if (ViewOnClickListenerC0939.m55941() < 0) {
                            iM55680 = (C0873.m55680("᩺ۧ") + i6) * (-113);
                            i = ((iM55680 ^ i5) * (-24449)) ^ 1358925703;
                            i2 = 1071925661;
                            short s14 = s;
                            i8 = iM55680 ^ i2;
                            i7 = i;
                            s = s14;
                        } else {
                            s = s;
                            iM55681 = (C0873.m55680("᩻ܽ") ^ i5) * C0254q.f1218h;
                            i3 = ((iM55681 ^ i6) * 26231) ^ (-1280489892);
                            i4 = 2053982861;
                            i8 = iM55681 ^ i4;
                            i7 = i3;
                        }
                    } else {
                        s = s;
                        int iM55685 = C0873.m55680("᩹ۗ") ^ i6;
                        i8 = iM55685 ^ (-544881463);
                        i7 = ((iM55685 ^ i5) * 18391) ^ (-1609007538);
                        sb = null;
                    }
                    break;
                case 807330101:
                case 1786167892:
                    i9 = 35532;
                    iM55680 = (i6 - C0873.m55680("ۜ۟")) * 57;
                    i = ((iM55680 ^ i5) * 31739) ^ 1080913040;
                    i2 = 1882433951;
                    short s15 = s;
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    s = s15;
                    break;
                case 2036728125:
                case 2043885622:
                    int i16 = s * 21868;
                    if (RunnableC0897.f81856) {
                        int iM55686 = C0873.m55680("ۢ᩺") ^ i5;
                        i7 = ((iM55686 ^ i6) * (-21777)) ^ 538357405;
                        i15 = i16;
                        i8 = iM55686 ^ (-1693396284);
                    } else {
                        i15 = i16;
                        iM55681 = (C0873.m55680("᩻ܽ") ^ i5) * C0254q.f1218h;
                        i3 = ((iM55681 ^ i6) * 26231) ^ (-1280489892);
                        i4 = 2053982861;
                        i8 = iM55681 ^ i4;
                        i7 = i3;
                    }
                    break;
                default:
                    return strM56086;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00eb A[PHI: r7 r8
      0x00eb: PHI (r7v4 java.lang.String) = (r7v3 java.lang.String), (r7v2 java.lang.String) binds: [B:32:0x00d1, B:24:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x00eb: PHI (r8v4 int) = (r8v3 int), (r8v2 int) binds: [B:32:0x00d1, B:24:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x0146 A[PHI: r4 r5 r6 r11 r12
      0x0146: PHI (r4v4 l.۫ۤۡ) = (r4v3 l.۫ۤۡ), (r4v2 l.۫ۤۡ), (r4v2 l.۫ۤۡ), (r4v2 l.۫ۤۡ) binds: [B:42:0x0144, B:38:0x0123, B:12:0x0071, B:6:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0146: PHI (r5v3 java.lang.String) = (r5v2 java.lang.String), (r5v2 java.lang.String), (r5v2 java.lang.String), (r5v5 java.lang.String) binds: [B:42:0x0144, B:38:0x0123, B:12:0x0071, B:6:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0146: PHI (r6v3 java.lang.Object) = (r6v2 java.lang.Object), (r6v2 java.lang.Object), (r6v2 java.lang.Object), (r6v5 java.lang.Object) binds: [B:42:0x0144, B:38:0x0123, B:12:0x0071, B:6:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0146: PHI (r11v4 short[]) = (r11v2 short[]), (r11v3 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:42:0x0144, B:38:0x0123, B:12:0x0071, B:6:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0146: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:42:0x0144, B:38:0x0123, B:12:0x0071, B:6:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x022c A[PHI: r15 r24
      0x022c: PHI (r15v3 int) = (r15v2 int), (r15v4 int) binds: [B:65:0x022a, B:61:0x020d] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r24v5 int) = (r24v4 int), (r24v3 int) binds: [B:65:0x022a, B:61:0x020d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0260 A[PHI: r2 r13 r17
      0x0260: PHI (r2v4 android.widget.Spinner) = 
      (r2v2 android.widget.Spinner)
      (r2v3 android.widget.Spinner)
      (r2v2 android.widget.Spinner)
      (r2v2 android.widget.Spinner)
      (r2v2 android.widget.Spinner)
     binds: [B:69:0x025e, B:46:0x017a, B:15:0x0077, B:12:0x0071, B:9:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r13v4 short) = (r13v3 short), (r13v2 short), (r13v2 short), (r13v2 short), (r13v2 short) binds: [B:69:0x025e, B:46:0x017a, B:15:0x0077, B:12:0x0071, B:9:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r17v4 int) = (r17v2 int), (r17v3 int), (r17v2 int), (r17v2 int), (r17v2 int) binds: [B:69:0x025e, B:46:0x017a, B:15:0x0077, B:12:0x0071, B:9:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0291 A[PHI: r16 r19
      0x0291: PHI (r16v4 short) = (r16v2 short), (r16v3 short), (r16v2 short), (r16v2 short) binds: [B:73:0x028f, B:57:0x01ef, B:17:0x007b, B:15:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x0291: PHI (r19v4 char) = (r19v3 char), (r19v2 char), (r19v2 char), (r19v2 char) binds: [B:73:0x028f, B:57:0x01ef, B:17:0x007b, B:15:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x02c5 A[PHI: r18
      0x02c5: PHI (r18v4 short[]) = (r18v3 short[]), (r18v2 short[]) binds: [B:77:0x02c3, B:9:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩳ */
    private void m48404() {
        int iM55680;
        int i;
        int i2;
        int i3 = C1012.f81938;
        int i4 = C1124.f82007;
        int iM55681 = C0873.m55680("ܺۙ") ^ i4;
        int i5 = ((iM55681 ^ i3) * (-23331)) ^ (-1075731235);
        String strM55734 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM55681 ^ 1600724551;
        Spinner spinner = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        short s = 0;
        int i11 = 0;
        short s2 = 0;
        int selectedItemPosition = 0;
        char c = 0;
        int i12 = -1508432875;
        int i13 = 0;
        Object obj = null;
        String strM56233 = null;
        InterfaceC14100 interfaceC14100 = null;
        int i14 = 0;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i3) * 1625) >> 31));
            switch (i12) {
                case -2136632889:
                case 941139633:
                    i14 = 38343;
                    iM55680 = (C0946.m55979("ۢ۟") ^ i3) * 23;
                    i = ((iM55680 ^ i4) * 19183) ^ (-586387321);
                    i2 = 1575021151;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -2040801356:
                case 1168920113:
                    if (RunnableC0897.f81856) {
                        iM55680 = C0873.m55680("ܶ᩶") ^ i4;
                        i = ((iM55680 ^ i3) * (-14013)) ^ 496531374;
                        i2 = 507984352;
                    } else {
                        iM55680 = C0873.m55680("᩵᩻") ^ i3;
                        i = ((iM55680 ^ i4) * 24433) ^ 869604484;
                        i2 = -1135126545;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1998020352:
                case -961977609:
                    i11 = i13 + 1;
                    if (C1017.f81942 >= 0) {
                        iM55680 = C0946.m55979("ۘ᩸") ^ i4;
                        i = ((iM55680 ^ i3) * (-7063)) ^ (-1533907342);
                        i2 = -1667128868;
                    } else {
                        iM55680 = C0873.m55680("ܶ۬") ^ i4;
                        i = ((iM55680 ^ i3) * (-31235)) ^ 1843936312;
                        i2 = 382882817;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1894550079:
                case 4086560:
                    i13 = s * 2;
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = C0946.m55979("ۘ᩸") ^ i4;
                        i = ((iM55680 ^ i3) * (-7063)) ^ (-1533907342);
                        i2 = -1667128868;
                    } else {
                        iM55680 = (C0946.m55979("᩶᩷") + i4) * C0254q.f1218h;
                        i = ((iM55680 ^ i3) * (-919)) ^ 1624157159;
                        i2 = 320953423;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1767442493:
                case 276706350:
                    s = sArr[c];
                    if (C0892.f81851) {
                        iM55680 = C0873.m55680("۫᩹") ^ i3;
                        i = ((iM55680 ^ i4) * (-12295)) ^ 1677119976;
                        i2 = 973594119;
                    } else {
                        iM55680 = C0873.m55680("ܶ᩶") ^ i4;
                        i = ((iM55680 ^ i3) * (-14013)) ^ 496531374;
                        i2 = 507984352;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1758456530:
                case 1905684267:
                    if (C0955.f81898) {
                        iM55680 = (C0873.m55680("ۖ᩵") ^ i3) * 27;
                        i = ((iM55680 ^ i4) * C0719o.a.f2910p) ^ (-1622272825);
                        i2 = 1552117180;
                    } else {
                        iM55680 = C0873.m55680("ܶ᩶") ^ i4;
                        i = ((iM55680 ^ i3) * (-14013)) ^ 496531374;
                        i2 = 507984352;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1707585576:
                case -300877673:
                    interfaceC14100 = ApplicationC21448.f67649;
                    if (C0845.m55584() <= 0) {
                        iM55680 = C0873.m55680("᩵᩻") ^ i3;
                        i = ((iM55680 ^ i4) * 24433) ^ 869604484;
                        i2 = -1135126545;
                    } else {
                        iM55680 = C0873.m55680("۟֡") ^ i4;
                        i = ((iM55680 ^ i3) * 8557) ^ 123239837;
                        i2 = -630950839;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1634726108:
                case -210705481:
                    C0955.m56025();
                    iM55680 = (C0946.m55979("ۙۜ") ^ i3) * (-37);
                    i = ((iM55680 ^ i4) * (-32385)) ^ (-1712036592);
                    i2 = 400392474;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1454262424:
                case -627851164:
                    strM55734 = C0890.m55734(interfaceC14100, strM56233, obj);
                    i7 = -1;
                    if (strM55734 != null) {
                        iM55680 = (i4 - C0873.m55680("ܽۗ")) * (-65);
                        i = ((iM55680 ^ i3) * 31799) ^ (-391357246);
                        i2 = -1159035173;
                    } else {
                        i8 = selectedItemPosition;
                        iM55680 = (i3 - C0873.m55680("ۤ۫")) * 81;
                        i = ((iM55680 ^ i4) * 26021) ^ (-420263248);
                        i2 = -1979896621;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1302406961:
                case 1202122546:
                    sArr = f82967;
                    if (C0927.f81875) {
                        iM55680 = (C0873.m55680("ۖ᩵") ^ i3) * 27;
                        i = ((iM55680 ^ i4) * C0719o.a.f2910p) ^ (-1622272825);
                        i2 = 1552117180;
                    } else {
                        iM55680 = (C0873.m55680("ۧᩴ") ^ i4) * 33;
                        i = ((iM55680 ^ i3) * (-3035)) ^ (-1498962967);
                        i2 = -599395562;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1026147294:
                case 192523884:
                    if (i8 == i7) {
                        iM55680 = (C0946.m55979("ۢۜ") + i4) * 89;
                        i = ((iM55680 ^ i3) * 15301) ^ 105569732;
                        i2 = -1716469442;
                    } else {
                        i9 = i8;
                        iM55680 = (C0873.m55680("ܰ۟") ^ i3) * 67;
                        i = ((iM55680 ^ i4) * 28017) ^ 1313215709;
                        i2 = -1801931740;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1009451149:
                case 789537953:
                    C0927.m55873();
                    C0927.m55873();
                    break;
                case -617901860:
                case 900583319:
                    int i15 = s + s2;
                    if (i11 - (i15 * i15) <= 0) {
                        iM55680 = C0873.m55680("ۨ۬") ^ i4;
                        i = ((iM55680 ^ i3) * 1827) ^ 589707027;
                        i2 = -1584410600;
                    } else {
                        iM55680 = C0946.m55979("ܽ᩹") ^ i3;
                        i = ((iM55680 ^ i4) * 20159) ^ 725636587;
                        i2 = 900804659;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -531563954:
                case -252352143:
                    spinner.setSelection(i9);
                    break;
                case -525986516:
                case 155206241:
                    if (C0947.f81895) {
                        iM55680 = C0873.m55680("ܶ᩶") ^ i4;
                        i = ((iM55680 ^ i3) * (-14013)) ^ 496531374;
                        i2 = 507984352;
                    } else {
                        iM55680 = (C0946.m55979("ۙۜ") ^ i3) * (-37);
                        i = ((iM55680 ^ i4) * (-32385)) ^ (-1712036592);
                        i2 = 400392474;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -507113641:
                case 583926934:
                    i9 = 0;
                    iM55680 = (C0873.m55680("ܰ۟") ^ i3) * 67;
                    i = ((iM55680 ^ i4) * 28017) ^ 1313215709;
                    i2 = -1801931740;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -385161121:
                case 1215571052:
                    c = 396;
                    if (C1036.f81953 >= 0) {
                        iM55680 = (C0946.m55979("ۙۜ") ^ i3) * (-37);
                        i = ((iM55680 ^ i4) * (-32385)) ^ (-1712036592);
                        i2 = 400392474;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ܰᩴ")) * (-35);
                        i = ((iM55680 ^ i4) * 18811) ^ (-1394103524);
                        i2 = -1459656169;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -68840928:
                case 1756590333:
                    s2 = 1;
                    if (C0967.f81910 >= 0) {
                        iM55680 = (C0946.m55979("ۙۜ") ^ i3) * (-37);
                        i = ((iM55680 ^ i4) * (-32385)) ^ (-1712036592);
                        i2 = 400392474;
                    } else {
                        iM55680 = C0873.m55680("᩵ۚ") ^ i3;
                        i = ((iM55680 ^ i4) * (-8447)) ^ (-1051272911);
                        i2 = -2135248966;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 423151804:
                case 2027894327:
                    spinner = this.f67349;
                    selectedItemPosition = spinner.getSelectedItemPosition();
                    if (C0882.f81846) {
                        iM55680 = C0873.m55680("ܶ᩶") ^ i4;
                        i = ((iM55680 ^ i3) * (-14013)) ^ 496531374;
                        i2 = 507984352;
                    } else {
                        iM55680 = C0873.m55680("֨ܽ") ^ i4;
                        i = ((iM55680 ^ i3) * (-16543)) ^ 979381477;
                        i2 = 52915797;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 788699960:
                case 928222908:
                    sArr2 = f82967;
                    i10 = 397;
                    if (C0890.f81849 != 0) {
                        iM55680 = C0873.m55680("᩵᩻") ^ i3;
                        i = ((iM55680 ^ i4) * 24433) ^ 869604484;
                        i2 = -1135126545;
                    } else {
                        iM55680 = (C0946.m55979("۫ܽ") ^ i3) * 119;
                        i = ((iM55680 ^ i4) * 29927) ^ (-180617540);
                        i2 = 546327782;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 1287138635:
                case 1777534345:
                    i14 = 3942;
                    iM55680 = (C0946.m55979("ۢ۟") ^ i3) * 23;
                    i = ((iM55680 ^ i4) * 19183) ^ (-586387321);
                    i2 = 1575021151;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 2024376423:
                case 2144467320:
                    int iIndexOf = this.f67350.indexOf(strM55734);
                    if (iIndexOf == i7) {
                        i8 = selectedItemPosition;
                    } else {
                        i8 = iIndexOf;
                    }
                    iM55680 = (i3 - C0873.m55680("ۤ۫")) * 81;
                    i = ((iM55680 ^ i4) * 26021) ^ (-420263248);
                    i2 = -1979896621;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                default:
                    strM56233 = C1025.m56233(sArr2, i10, 13, i14);
                    obj = null;
                    if (C0946.f81894 != 0) {
                        iM55680 = C0873.m55680("᩵᩻") ^ i3;
                        i = ((iM55680 ^ i4) * 24433) ^ 869604484;
                        i2 = -1135126545;
                    } else {
                        iM55680 = (C0946.m55979("᩵ۙ") + i4) * 115;
                        i = ((iM55680 ^ i3) * 6497) ^ 1471514661;
                        i2 = 946257545;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public static void m48395(ViewOnClickListenerC21364 viewOnClickListenerC21364) {
        ArrayList arrayListM40432 = null;
        ArrayList arrayList = null;
        C21438 c21438 = null;
        int i = -2009356521;
        int i2 = C1404.f82149;
        int i3 = C0930.f81879;
        int iM55979 = (i2 - C0946.m55979("᩶ۡ")) * (-119);
        int i4 = ((iM55979 ^ i3) * 28035) ^ (-228878016);
        int i5 = 618068790;
        while (true) {
            i = ((((i ^ i3) * 30551) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2065993419:
                case -592772138:
                    if (C0992.f81922 >= 0) {
                        iM55979 = C0946.m55979("֨ܰ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 26809) ^ 439535323;
                        i5 = -1287638623;
                    } else {
                        iM55979 = (C0946.m55979("۟᩸") ^ i3) * (-79);
                        i4 = ((iM55979 ^ i2) * 26361) ^ (-1281863356);
                        i5 = 2034897254;
                    }
                    break;
                case -2034932473:
                case -1593509836:
                    C1012.m56134();
                    if (!C0955.m56025()) {
                        iM55979 = C0946.m55979("֨ܰ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 26809) ^ 439535323;
                        i5 = -1287638623;
                    } else {
                        iM55979 = C0946.m55979("֨ۙ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-8055)) ^ 476655068;
                        i5 = 884911876;
                    }
                    break;
                case -1951541036:
                case 604319642:
                    c21438.notifyDataSetChanged();
                    viewOnClickListenerC21364.m48404();
                    iM55979 = (C0873.m55680("ۗۙ") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i4 = ((iM55979 ^ i2) * (-21807)) ^ (-1759317026);
                    i5 = -1354442430;
                    break;
                case -1880122275:
                case 1846955879:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = C0946.m55979("ۘ᩵") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-12647)) ^ 41091276;
                        i5 = -1883670689;
                    } else {
                        iM55979 = (C0873.m55680("۬ۤ") ^ i2) * 71;
                        i4 = ((iM55979 ^ i3) * 32003) ^ (-1240731747);
                        i5 = 188771082;
                    }
                    break;
                case -1851759163:
                case -939461796:
                    C1048.m56305();
                    C1017.m56187();
                    break;
                case -1648416487:
                case -193766841:
                    if (C0882.f81846) {
                        iM55979 = C0946.m55979("ᩴ᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-4953)) ^ (-1135874291);
                        i5 = -1088533835;
                    } else {
                        iM55979 = C0946.m55979("ۚ۟") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-29545)) ^ 1528889564;
                        i5 = -360086437;
                    }
                    break;
                case -1405154948:
                case 1735041045:
                    C0882.m55710();
                    C0877.m55696();
                    iM55979 = C0946.m55979("ᩴ᩺") ^ i3;
                    i4 = ((iM55979 ^ i2) * (-4953)) ^ (-1135874291);
                    i5 = -1088533835;
                    break;
                case -1298487539:
                case 381148944:
                    c21438 = viewOnClickListenerC21364.f67356;
                    if (C1929.f83011 != 0) {
                        iM55979 = (C0873.m55680("᩸᩺") ^ i3) * (-9);
                        i4 = ((iM55979 ^ i2) * 6419) ^ 2001817857;
                        i5 = -1634171649;
                    } else {
                        iM55979 = C0873.m55680("ۢ۟") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-27323)) ^ (-2101382947);
                        i5 = -265300837;
                    }
                    break;
                case -1192643274:
                case 31523616:
                    break;
                case -976691821:
                case 787784546:
                    C0992.m56107();
                    if (!C0937.f81884) {
                        iM55979 = C0946.m55979("ᩴ᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-4953)) ^ (-1135874291);
                        i5 = -1088533835;
                    } else {
                        iM55979 = C0946.m55979("ۘ᩵") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-12647)) ^ 41091276;
                        i5 = -1883670689;
                    }
                    break;
                case -527155703:
                case -506624634:
                    C1964.m56597();
                    if (C1017.f81942 < 0) {
                        iM55979 = C0946.m55979("֨ܰ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 26809) ^ 439535323;
                        i5 = -1287638623;
                    } else {
                        iM55979 = C0946.m55979("ᩴ᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-4953)) ^ (-1135874291);
                        i5 = -1088533835;
                    }
                    break;
                case -358941663:
                case 155241961:
                    if (C0937.f81884) {
                        iM55979 = C0946.m55979("ܳ᩹") ^ i2;
                        i4 = ((iM55979 ^ i3) * 8039) ^ (-758789298);
                        i5 = 1539654343;
                    } else {
                        iM55979 = C0946.m55979("ۘ᩵") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-12647)) ^ 41091276;
                        i5 = -1883670689;
                    }
                    break;
                case -321672404:
                case 740206263:
                    if (C1025.m56230()) {
                        iM55979 = C0946.m55979("ۘ᩵") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-12647)) ^ 41091276;
                        i5 = -1883670689;
                    } else {
                        iM55979 = (i2 - C0946.m55979("ۜ᩺")) * (-123);
                        i4 = ((iM55979 ^ i3) * (-17081)) ^ 804878760;
                        i5 = -501209223;
                    }
                    break;
                case -320002635:
                case 1475548383:
                    RunnableC0938.m55934(arrayList);
                    arrayList.addAll(arrayListM40432);
                    if (C1404.m56468()) {
                        iM55979 = (C0873.m55680("ܳ۫") + i3) * (-109);
                        i4 = ((iM55979 ^ i2) * (-2583)) ^ (-826858437);
                        i5 = -1436420857;
                    } else {
                        iM55979 = C0946.m55979("֨ܰ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 26809) ^ 439535323;
                        i5 = -1287638623;
                    }
                    break;
                case -233689361:
                case 211781095:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55979 = C0946.m55979("ۘ᩵") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-12647)) ^ 41091276;
                        i5 = -1883670689;
                    } else {
                        iM55979 = (i3 - C0873.m55680("۫᩵")) * (-93);
                        i4 = ((iM55979 ^ i2) * (-12041)) ^ 1973056246;
                        i5 = -1741305923;
                    }
                    break;
                case 1050900514:
                case 2039176103:
                    if (C0947.m55997()) {
                        iM55979 = C0946.m55979("֨ۙ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-8055)) ^ 476655068;
                        i5 = 884911876;
                    } else {
                        iM55979 = C0873.m55680("ۙۢ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 31107) ^ 116140001;
                        i5 = 670922550;
                    }
                    break;
                case 1161740079:
                case 1859914274:
                    arrayListM40432 = C17812.m40432();
                    if (C1028.f81950 <= 0) {
                        iM55979 = (C0873.m55680("᩸᩺") ^ i3) * (-9);
                        i4 = ((iM55979 ^ i2) * 6419) ^ 2001817857;
                        i5 = -1634171649;
                    } else {
                        iM55979 = C0946.m55979("ۡۛ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 14085) ^ (-1208632437);
                        i5 = -1032972608;
                    }
                    break;
                default:
                    arrayList = viewOnClickListenerC21364.f67350;
                    if (ViewOnClickListenerC0939.m55949(arrayListM40432, arrayList)) {
                        iM55979 = (C0873.m55680("ۗۙ") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM55979 ^ i2) * (-21807)) ^ (-1759317026);
                        i5 = -1354442430;
                    } else {
                        iM55979 = (C0873.m55680("ۡܺ") + i2) * (-19);
                        i4 = ((iM55979 ^ i3) * 1885) ^ (-266445055);
                        i5 = 389918030;
                    }
                    break;
            }
            return;
        }
    }
}
