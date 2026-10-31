package l;

import android.R;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

/* JADX INFO: renamed from: l.۫ᩳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: L2RS */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC12581 extends AbstractActivityC3346 {

    /* JADX INFO: renamed from: ۠ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f37925 = 0;

    /* JADX INFO: renamed from: ᩴ᩵᩻, reason: not valid java name and contains not printable characters */
    private static final short[] f37926 = {8913, 25947, 25927, 25950, 25932, 25922, 25925, 25972, 25922, 25928, 25924, 25925, 25947, 25927, 25950, 25932, 25922, 25925, 25954, 25935, 25945, 25934, 25927, 25924, 25930, 25935, 25954, 25928, 25924, 25925, 25933, 25945, 25924, 25926, 25967, 25934, 25949, 25934, 25927, 25924, 25947, 25934, 25945, 25959, 25922, 25944, 25951, 9620, 23723, -24065, -18516, 12990, 12989, 13054, 13031, 13027, 5203, -14983, -6097, -3436, 4565, 831, -4419, 8073, 3377, -2785, 5327, -30175, -27845, -32530, 4009, 28019, -29084, -24103, 26303, -31408, -20193, -28735, 25764, -20454, 26890, 27809, -20027, -4131, -4159, -4136, -4150, -4156, -4157, -4124, -4151, -4129, -4152, -4159, -4158, -4148, -4151, -4124, -4146, -4158, -4157, -4160, -4135, -4131, -4159, -4136, -4150, -4156, -4157, 29596, 31451, -19381, 26136, 32664, 29323, 28256, -18399, -19946, -28717, -28601, -19775, 28992, -28089, -31810, -28240, 29744, -24680, 30834, -17646, -20146, -19239, 31009, 30604, -27165, -26854, -27867, 32358, 27395, 31357, -17588, -28803, -29010, -29733, -19892, 26210, -25092, 26814, -24477, -4131, -4159, -4136, -4150, -4156, -4157, -4110, -4156, -4146, -4158, -4157, 7892, 30307, -18804, 30701, -16798, -27079, 25904, 3281, 27898, -30515, 22114, -25559, 25213, -30009, 25909, -27012, -25309, -29039, -32116, -32155, -31371, -31979, 23955, 2626, 2654, 2631, 2645, 2651, 2652, 2683, 2646, -26165, 27980, 31048, 17586, 30560, 20794, -31794, 25532, 20970, 27523, 32437, 22049, 4987, -32740, -32736, -32711, -32725, -32731, -32734, -32763, -32734, -32726, -32733, -32755, -32721, -32712, -32731, -32710, -32731, -32712, -32715};

    /* JADX INFO: renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public boolean f37927;

    /* JADX INFO: renamed from: ֨ۧ, reason: not valid java name and contains not printable characters */
    public TextView f37928;

    /* JADX INFO: renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public C19099 f37929;

    /* JADX INFO: renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public String f37930;

    /* JADX INFO: renamed from: ۚۧ, reason: not valid java name and contains not printable characters */
    public TextView f37931;

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public ImageView f37932;

    /* JADX INFO: renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public final C8817 f37933 = C8817.m22788();

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public TextView f37934;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public TextView f37935;

    /* JADX INFO: renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public View f37936;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public TextView f37937;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public TextView f37938;

    /* JADX INFO: renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public TextView f37939;

    /* JADX INFO: renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public TextView f37940;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public Button f37941;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public ViewGroup f37942;

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = -851013009;
        int i7 = RunnableC0588.f2309;
        int i8 = AbstractC2021.f6743;
        int iM6981 = (C2105.m6981("ۨۜ") ^ i8) * (-55);
        int i9 = ((iM6981 ^ i7) * 29375) ^ 423593767;
        int i10 = 1227540142;
        while (true) {
            i6 = ((((i6 ^ i7) * (-19307)) >> 31) & i9) ^ (iM6981 ^ i10);
            switch (i6) {
                case -2012201022:
                case -648312773:
                    i4 = 54943;
                    iM6981 = C2105.m6981("ۢᩴ") ^ i8;
                    i9 = ((iM6981 ^ i7) * 12029) ^ (-620470318);
                    i10 = -568858467;
                    break;
                case -2000844596:
                case -573369064:
                    sArr2 = f37926;
                    i5 = 203;
                    if (C1047.m3599() >= 0) {
                        iM6981 = C2105.m6981("ۡܿ") ^ i8;
                        i9 = ((iM6981 ^ i7) * 9819) ^ (-78541768);
                        i10 = 2111454150;
                    } else {
                        iM6981 = C2105.m6981("ۨܳ") ^ i7;
                        i9 = ((iM6981 ^ i8) * (-26855)) ^ (-504921515);
                        i10 = -963505474;
                    }
                    break;
                case -1561819114:
                case 1925919065:
                    C2958.m9034();
                    if (C2167.f7158 >= 0) {
                        iM6981 = C2105.m6981("ܽ᩷") ^ i8;
                        i9 = ((iM6981 ^ i7) * (-20705)) ^ 245114060;
                        i10 = -805636617;
                    } else {
                        iM6981 = C2105.m6981("᩸۫") ^ i8;
                        i9 = ((iM6981 ^ i7) * (-16221)) ^ (-1972207886);
                        i10 = 1696285755;
                    }
                    break;
                case -1421494944:
                case 2139435062:
                    i = s * s2;
                    i2 = s * s;
                    if (C1005.f3721) {
                        iM6981 = C2105.m6981("֡۠") ^ i8;
                        i9 = ((iM6981 ^ i7) * 2215) ^ (-2144309326);
                        i10 = 301047194;
                    } else {
                        iM6981 = C2105.m6981("ܽ᩷") ^ i8;
                        i9 = ((iM6981 ^ i7) * (-20705)) ^ 245114060;
                        i10 = -805636617;
                    }
                    break;
                case -1417622057:
                case -1201640572:
                    C3683.m11222();
                    if (!C21923.m49329()) {
                        iM6981 = (C0630.m2566("᩵֨") ^ i7) * 65;
                        i9 = ((iM6981 ^ i8) * (-26407)) ^ (-68410520);
                        i10 = 1793152037;
                    } else {
                        iM6981 = C2105.m6981("ܽ᩷") ^ i8;
                        i9 = ((iM6981 ^ i7) * (-20705)) ^ 245114060;
                        i10 = -805636617;
                    }
                    break;
                case -1347820908:
                case 165971736:
                    i4 = 32844;
                    iM6981 = C2105.m6981("ۢᩴ") ^ i8;
                    i9 = ((iM6981 ^ i7) * 12029) ^ (-620470318);
                    i10 = -568858467;
                    break;
                case -1004598013:
                case 1230153855:
                    if (C4075.m12263() <= 0) {
                        iM6981 = C2105.m6981("᩸۫") ^ i8;
                        i9 = ((iM6981 ^ i7) * (-16221)) ^ (-1972207886);
                        i10 = 1696285755;
                    } else {
                        iM6981 = (C2105.m6981("ᩴۚ") ^ i7) * (-89);
                        i9 = ((iM6981 ^ i8) * 32157) ^ 839964079;
                        i10 = -1963654430;
                    }
                    break;
                case -929220909:
                case 771792285:
                    s = sArr[c];
                    s2 = 5758;
                    if (C3746.f11829 <= 0) {
                        iM6981 = C2105.m6981("ۡܿ") ^ i8;
                        i9 = ((iM6981 ^ i7) * 9819) ^ (-78541768);
                        i10 = 2111454150;
                    } else {
                        iM6981 = C0630.m2566("۬ᩳ") ^ i7;
                        i9 = ((iM6981 ^ i8) * 15745) ^ 924438781;
                        i10 = -427934050;
                    }
                    break;
                case -830088628:
                case 1921591529:
                    if (C5695.f17556 >= 0) {
                        iM6981 = C2105.m6981("۫᩵") ^ i7;
                        i9 = ((iM6981 ^ i8) * 3643) ^ 791881713;
                        i10 = 563832001;
                    } else {
                        iM6981 = (C0630.m2566("ܰ֫") + i7) * 53;
                        i9 = ((iM6981 ^ i8) * (-14325)) ^ 1491529089;
                        i10 = -611725473;
                    }
                    break;
                case -754385007:
                case 1707669697:
                    if (C2958.f9394 >= 0) {
                        iM6981 = C2105.m6981("۫᩵") ^ i7;
                        i9 = ((iM6981 ^ i8) * 3643) ^ 791881713;
                        i10 = 563832001;
                    } else {
                        iM6981 = C2105.m6981("ۘܶ") ^ i7;
                        i9 = ((iM6981 ^ i8) * 15575) ^ (-863497790);
                        i10 = 1575234034;
                    }
                    break;
                case -682708156:
                case 867365067:
                    C0964.m3413();
                    return null;
                case -227120259:
                case 90928638:
                    c = 202;
                    if (C3019.f9544 >= 0) {
                        iM6981 = C2105.m6981("۫᩵") ^ i7;
                        i9 = ((iM6981 ^ i8) * 3643) ^ 791881713;
                        i10 = 563832001;
                    } else {
                        iM6981 = (C2105.m6981("ۘ᩺") ^ i8) * (-77);
                        i9 = ((iM6981 ^ i7) * (-19995)) ^ (-2071045790);
                        i10 = 643694528;
                    }
                    break;
                case 5505536:
                case 1600729178:
                    return C0237.m1483(sArr2, i5, 18, i4);
                case 29198629:
                case 728787003:
                    if (!C1711.f5919) {
                        iM6981 = (C0630.m2566("᩵֨") ^ i7) * 65;
                        i9 = ((iM6981 ^ i8) * (-26407)) ^ (-68410520);
                        i10 = 1793152037;
                    } else {
                        iM6981 = C2105.m6981("۫᩵") ^ i7;
                        i9 = ((iM6981 ^ i8) * 3643) ^ 791881713;
                        i10 = 563832001;
                    }
                    break;
                case 199798513:
                case 1197188934:
                    i3 = 8288641;
                    if (C2272.m7503()) {
                        iM6981 = C2105.m6981("ܽ᩷") ^ i8;
                        i9 = ((iM6981 ^ i7) * (-20705)) ^ 245114060;
                        i10 = -805636617;
                    } else {
                        iM6981 = (i8 - C2105.m6981("ۖ᩻")) * (-117);
                        i9 = ((iM6981 ^ i7) * 13883) ^ (-1309025822);
                        i10 = 1402836608;
                    }
                    break;
                case 675469249:
                case 1741549990:
                    sArr = f37926;
                    if (C0483.m2121()) {
                        iM6981 = (i8 - C0630.m2566("ۛ᩷")) * 19;
                        i9 = ((iM6981 ^ i7) * 4931) ^ 1713683419;
                        i10 = -1609355191;
                    } else {
                        iM6981 = C2105.m6981("ۡܿ") ^ i8;
                        i9 = ((iM6981 ^ i7) * 9819) ^ (-78541768);
                        i10 = 2111454150;
                    }
                    break;
                case 937741258:
                case 2104150767:
                    if (i - (i2 + i3) > 0) {
                        iM6981 = (i7 - C0630.m2566("ᩴ᩷")) * (-61);
                        i9 = ((iM6981 ^ i8) * 32535) ^ (-1676120744);
                        i10 = -944900282;
                    } else {
                        iM6981 = (C2105.m6981("ۘܳ") ^ i7) * (-55);
                        i9 = ((iM6981 ^ i8) * (-13631)) ^ 1139921627;
                        i10 = 1151528192;
                    }
                    break;
                case 986903533:
                case 1780213111:
                    if (C1128.f4106 <= 0) {
                        iM6981 = C2105.m6981("ۡܿ") ^ i8;
                        i9 = ((iM6981 ^ i7) * 9819) ^ (-78541768);
                        i10 = 2111454150;
                    } else {
                        iM6981 = C0630.m2566("֡᩵") ^ i8;
                        i9 = ((iM6981 ^ i7) * (-8305)) ^ (-216895496);
                        i10 = 862109622;
                    }
                    break;
                default:
                    C1773.m5908();
                    iM6981 = C2105.m6981("᩸۫") ^ i8;
                    i9 = ((iM6981 ^ i7) * (-16221)) ^ (-1972207886);
                    i10 = 1696285755;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0251 A[PHI: r2 r7 r16
      0x0251: PHI (r2v4 short[]) = (r2v3 short[]), (r2v2 short[]), (r2v2 short[]) binds: [B:70:0x024f, B:55:0x0191, B:12:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r7v4 short) = (r7v2 short), (r7v3 short), (r7v2 short) binds: [B:70:0x024f, B:55:0x0191, B:12:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r16v27 int) = (r16v5 int), (r16v8 int), (r16v28 int) binds: [B:70:0x024f, B:55:0x0191, B:12:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30838(ActivityC12581 activityC12581) {
        int iM6981;
        int i;
        int iM6982;
        int i2;
        int i3;
        int iM6983 = 0;
        String strM11225 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i4 = 0;
        int i5 = 0;
        short s2 = 0;
        int i6 = 0;
        short[] sArr2 = null;
        int i7 = 0;
        int i8 = -2104995584;
        int i9 = C4075.f12947;
        int i10 = C0483.f2088;
        int iM6984 = C2105.m6981("ۗۨ") ^ i10;
        int i11 = ((iM6984 ^ i9) * (-12391)) ^ (-1387715311);
        int i12 = 1972015870;
        while (true) {
            int i13 = iM6984 ^ i12;
            while (true) {
                i8 = ((((i8 ^ i9) * 23151) >> 31) & i11) ^ i13;
                switch (i8) {
                    case -2131264452:
                    case 1057749619:
                        iM6983 = C2105.m6981(strM11225) ^ 2097405077;
                        if (C4263.f13799 > 0) {
                            iM6984 = C2105.m6981("ۗۢ") ^ i10;
                            i11 = ((iM6984 ^ i9) * 22975) ^ (-347836433);
                            i12 = 509389335;
                        }
                        iM6982 = (C2105.m6981("۫ᩴ") + i10) * (-87);
                        iM6983 = iM6983;
                        i2 = ((iM6982 ^ i9) * 8083) ^ 1605002592;
                        i3 = 5735162;
                        i13 = iM6982 ^ i3;
                        i11 = i2;
                        iM6983 = iM6983;
                        break;
                    case -2071059935:
                    case 1340702234:
                        i7 = 67;
                        if (C1916.f6442) {
                            iM6984 = C0630.m2566("᩶ܰ") ^ i9;
                            i11 = ((iM6984 ^ i10) * (-30453)) ^ (-395183189);
                            i12 = 487194823;
                        }
                        iM6983 = iM6983;
                        iM6981 = C0630.m2566("ܿ֨") ^ i10;
                        i11 = ((iM6981 ^ i9) * 1927) ^ 652746098;
                        i = -1173261010;
                        i13 = iM6981 ^ i;
                        iM6983 = iM6983;
                        break;
                    case -1830799034:
                    case 733885561:
                        C0050.m940();
                        break;
                    case -1789777307:
                    case 645681701:
                        strM11225 = C3683.m11225(sArr2, i7, 3, i6);
                        if (RunnableC0588.f2309 < 0) {
                            iM6984 = C2105.m6981("ۙ۫") ^ i10;
                            i11 = ((iM6984 ^ i9) * 25545) ^ (-308425794);
                            i12 = -534218942;
                        }
                        iM6983 = iM6983;
                        iM6981 = C0630.m2566("ܿ֨") ^ i10;
                        i11 = ((iM6981 ^ i9) * 1927) ^ 652746098;
                        i = -1173261010;
                        i13 = iM6981 ^ i;
                        iM6983 = iM6983;
                        break;
                    case -1765080887:
                    case 1641082996:
                        i6 = 627;
                        iM6981 = C2105.m6981("ۚۨ") ^ i10;
                        i11 = ((iM6981 ^ i9) * 28521) ^ 1077589500;
                        i = 234422226;
                        i13 = iM6981 ^ i;
                        iM6983 = iM6983;
                        break;
                    case -1431757300:
                    case 920706823:
                        iM6983 = iM6983;
                        sArr = f37926;
                        if (C2272.f7362) {
                            iM6981 = C2105.m6981("֡᩹") ^ i9;
                            i11 = ((iM6981 ^ i10) * (-18283)) ^ (-1179157920);
                            i = 448520294;
                        } else {
                            iM6981 = C2105.m6981("᩹᩹") ^ i9;
                            i11 = ((iM6981 ^ i10) * (-5729)) ^ (-428334633);
                            i = -884742694;
                        }
                        i13 = iM6981 ^ i;
                        iM6983 = iM6983;
                        break;
                    case -1120619633:
                    case 1677347576:
                        iM6983 = iM6983;
                        s2 = 32690;
                        if (C2126.f7087) {
                            iM6981 = C2105.m6981("֡᩹") ^ i9;
                            i11 = ((iM6981 ^ i10) * (-18283)) ^ (-1179157920);
                            i = 448520294;
                        } else {
                            iM6981 = C2105.m6981("᩶᩺") ^ i9;
                            i11 = ((iM6981 ^ i10) * 28853) ^ (-1890959034);
                            i = -349147542;
                        }
                        i13 = iM6981 ^ i;
                        iM6983 = iM6983;
                        break;
                    case -1094904962:
                    case -757370209:
                        C13265.m32217(activityC12581.f37930);
                        if (C5695.f17556 < 0) {
                            iM6982 = (C2105.m6981("۬ᩳ") + i10) * 109;
                            iM6983 = iM6983;
                            i2 = ((iM6982 ^ i9) * 4469) ^ 743754593;
                            i3 = 45212510;
                            i13 = iM6982 ^ i3;
                            i11 = i2;
                            iM6983 = iM6983;
                        }
                        iM6983 = iM6983;
                        iM6981 = C2105.m6981("֡᩹") ^ i9;
                        i11 = ((iM6981 ^ i10) * (-18283)) ^ (-1179157920);
                        i = 448520294;
                        i13 = iM6981 ^ i;
                        iM6983 = iM6983;
                        break;
                    case -1048631553:
                    case 463060928:
                        C1504.m5167(iM6983);
                        C2272.m7505(activityC12581);
                        break;
                    case -927166166:
                    case 721184566:
                        if (C2958.f9394 < 0) {
                            iM6984 = C0630.m2566("ܶ۬") ^ i9;
                            i11 = ((iM6984 ^ i10) * 25301) ^ 1068201060;
                            i12 = -1813459854;
                        }
                        iM6983 = iM6983;
                        iM6981 = C2105.m6981("֡᩹") ^ i9;
                        i11 = ((iM6981 ^ i10) * (-18283)) ^ (-1179157920);
                        i = 448520294;
                        i13 = iM6981 ^ i;
                        iM6983 = iM6983;
                        break;
                    case -864186081:
                    case 12835868:
                        sArr2 = f37926;
                        if (C11340.f33930 < 0) {
                            iM6984 = C0630.m2566("ܽ᩸") ^ i9;
                            i11 = ((iM6984 ^ i10) * 11591) ^ (-1328400581);
                            i12 = -944597735;
                        } else {
                            iM6984 = C0630.m2566("ܶ۬") ^ i9;
                            i11 = ((iM6984 ^ i10) * 25301) ^ 1068201060;
                            i12 = -1813459854;
                        }
                        break;
                    case -782569143:
                    case 464731100:
                        C2520.m8026();
                        iM6983 = iM6983;
                        iM6981 = C2105.m6981("֡᩹") ^ i9;
                        i11 = ((iM6981 ^ i10) * (-18283)) ^ (-1179157920);
                        i = 448520294;
                        i13 = iM6981 ^ i;
                        iM6983 = iM6983;
                        break;
                    case -530732638:
                    case 923931503:
                        if (C5695.f17556 >= 0) {
                            iM6984 = C0630.m2566("ܶ۬") ^ i9;
                            i11 = ((iM6984 ^ i10) * 25301) ^ 1068201060;
                            i12 = -1813459854;
                        }
                        iM6982 = (C2105.m6981("۫ᩴ") + i10) * (-87);
                        iM6983 = iM6983;
                        i2 = ((iM6982 ^ i9) * 8083) ^ 1605002592;
                        i3 = 5735162;
                        i13 = iM6982 ^ i3;
                        i11 = i2;
                        iM6983 = iM6983;
                        break;
                    case -486564848:
                    case 1125890850:
                        iM6983 = iM6983;
                        c = 'B';
                        if (C0630.f2410 > 0) {
                            iM6981 = (C0630.m2566("ܽ֫") ^ i10) * (-29);
                            i11 = ((iM6981 ^ i9) * (-9631)) ^ (-603922862);
                            i = 1308399797;
                            i13 = iM6981 ^ i;
                            iM6983 = iM6983;
                        } else {
                            iM6983 = iM6983;
                            iM6982 = (C2105.m6981("۫ᩴ") + i10) * (-87);
                            iM6983 = iM6983;
                            i2 = ((iM6982 ^ i9) * 8083) ^ 1605002592;
                            i3 = 5735162;
                            i13 = iM6982 ^ i3;
                            i11 = i2;
                            iM6983 = iM6983;
                        }
                        break;
                    case 115712190:
                    case 1938695205:
                        iM6983 = iM6983;
                        i5 = i4 + 267159025;
                        if (C1128.f4106 <= 0) {
                            iM6981 = C2105.m6981("᩺᩸") ^ i9;
                            i11 = ((iM6981 ^ i10) * 16631) ^ (-22974914);
                            i = -1085649527;
                        } else {
                            iM6981 = C2105.m6981("ۢۖ") ^ i10;
                            i11 = ((iM6981 ^ i9) * (-26313)) ^ (-1696420306);
                            i = 1645689272;
                        }
                        i13 = iM6981 ^ i;
                        iM6983 = iM6983;
                        break;
                    case 785574376:
                    case 1697826148:
                        C3911.m11924();
                        if (C4616.f14690 > 0) {
                            iM6983 = iM6983;
                            iM6981 = C2105.m6981("᩺᩸") ^ i9;
                            i11 = ((iM6981 ^ i10) * 16631) ^ (-22974914);
                            i = -1085649527;
                            i13 = iM6981 ^ i;
                            iM6983 = iM6983;
                        }
                        iM6983 = iM6983;
                        iM6981 = C2105.m6981("֡᩹") ^ i9;
                        i11 = ((iM6981 ^ i10) * (-18283)) ^ (-1179157920);
                        i = 448520294;
                        i13 = iM6981 ^ i;
                        iM6983 = iM6983;
                        break;
                    case 1104769755:
                    case 1667772790:
                        iM6983 = iM6983;
                        if ((s * s2) - i5 <= 0) {
                            iM6981 = (i10 - C2105.m6981("᩷ܶ")) * 83;
                            i11 = ((iM6981 ^ i9) * (-3581)) ^ 1036318625;
                            i = -1046245723;
                        } else {
                            iM6981 = C2105.m6981("ܽ֡") ^ i9;
                            i11 = ((iM6981 ^ i10) * 181) ^ (-770135965);
                            i = -861570891;
                        }
                        i13 = iM6981 ^ i;
                        iM6983 = iM6983;
                        break;
                    case 1157533545:
                    case 1319916961:
                        i6 = 36674;
                        iM6981 = C2105.m6981("ۚۨ") ^ i10;
                        i11 = ((iM6981 ^ i9) * 28521) ^ 1077589500;
                        i = 234422226;
                        i13 = iM6981 ^ i;
                        iM6983 = iM6983;
                        break;
                    default:
                        iM6983 = iM6983;
                        s = sArr[c];
                        i4 = s * s;
                        if (ViewOnClickListenerC1958.f6529 <= 0) {
                            iM6981 = C0630.m2566("ܿ֨") ^ i10;
                            i11 = ((iM6981 ^ i9) * 1927) ^ 652746098;
                            i = -1173261010;
                        } else {
                            iM6981 = (C0630.m2566("ۚ֡") ^ i9) * (-27);
                            i11 = ((iM6981 ^ i10) * 6921) ^ 570988963;
                            i = -304129186;
                        }
                        i13 = iM6981 ^ i;
                        iM6983 = iM6983;
                        break;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30825(ActivityC12581 activityC12581, View view, C21610 c21610) {
        C11007 c11007M48815 = null;
        C11007 c11007M48816 = null;
        int i = 0;
        C11007 c11007M48817 = null;
        ViewGroup viewGroup = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = -1965334743;
        int i5 = C3683.f11629;
        int i6 = C4117.f13076;
        int iM6981 = C2105.m6981("᩷ۜ") ^ i6;
        int i7 = ((iM6981 ^ i5) * 18133) ^ 238100071;
        int i8 = 1295507716;
        while (true) {
            i4 = ((((i4 ^ i5) * (-4529)) >> 31) & i7) ^ (iM6981 ^ i8);
            switch (i4) {
                case -2135854342:
                case 2104069101:
                    if (C4159.m12565() >= 0) {
                        iM6981 = C0630.m2566("ܺۙ") ^ i5;
                        i7 = ((iM6981 ^ i6) * (-25089)) ^ (-1086082770);
                        i8 = 1115192925;
                    } else {
                        iM6981 = (C0630.m2566("ۨۖ") ^ i5) * (-113);
                        i7 = ((iM6981 ^ i6) * (-19843)) ^ (-1644627872);
                        i8 = 2094950399;
                    }
                    break;
                case -1970815002:
                case 154166626:
                    C11340.m28031();
                    iM6981 = C0630.m2566("ܺۙ") ^ i5;
                    i7 = ((iM6981 ^ i6) * (-25089)) ^ (-1086082770);
                    i8 = 1115192925;
                    break;
                case -1914850108:
                case 453174723:
                    viewGroup = activityC12581.f37942;
                    i2 = c11007M48815.f33111;
                    i3 = 0;
                    if (C21923.f70183 != 0) {
                        iM6981 = (C2105.m6981("ۤܳ") ^ i6) * (-119);
                        i7 = ((iM6981 ^ i5) * 1301) ^ (-162207699);
                        i8 = 586676814;
                    } else {
                        iM6981 = (i6 - C0630.m2566("ۖܳ")) * 91;
                        i7 = ((iM6981 ^ i5) * 25253) ^ 2106008648;
                        i8 = -2129624869;
                    }
                    break;
                case -1835222574:
                case 1481414357:
                    viewGroup.setPadding(i3, i2, i3, i3);
                    if (C0483.f2088 >= 0) {
                        iM6981 = (C0630.m2566("ۨ᩵") + i5) * 87;
                        i7 = ((iM6981 ^ i6) * 24331) ^ 936436517;
                        i8 = -354652724;
                    } else {
                        iM6981 = C0630.m2566("ܽ۬") ^ i5;
                        i7 = ((iM6981 ^ i6) * (-17463)) ^ (-1259504319);
                        i8 = -1885948144;
                    }
                    break;
                case -1593496879:
                case 1559593671:
                    if (C0483.f2088 >= 0) {
                        iM6981 = (i6 - C2105.m6981("᩵ۘ")) * 37;
                        i7 = ((iM6981 ^ i5) * (-13209)) ^ (-252696675);
                        i8 = -56403474;
                    } else {
                        iM6981 = C2105.m6981("ᩳܽ") ^ i5;
                        i7 = ((iM6981 ^ i6) * 31265) ^ (-1996079482);
                        i8 = -404874907;
                    }
                    break;
                case -1391455773:
                case 1156578857:
                    c11007M48817 = c21610.m48815(i);
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = (i6 - C2105.m6981("᩵ۘ")) * 37;
                        i7 = ((iM6981 ^ i5) * (-13209)) ^ (-252696675);
                        i8 = -56403474;
                    } else {
                        iM6981 = C0630.m2566("ܶܳ") ^ i5;
                        i7 = ((iM6981 ^ i6) * 4487) ^ 1157416262;
                        i8 = -276446573;
                    }
                    break;
                case -1224779409:
                case 815976490:
                    C4263.m12819();
                    C0483.m2121();
                    break;
                case -895668854:
                case 418271518:
                    if (C4616.m13552() != 0) {
                        iM6981 = C0630.m2566("ܺۙ") ^ i5;
                        i7 = ((iM6981 ^ i6) * (-25089)) ^ (-1086082770);
                        i8 = 1115192925;
                    } else {
                        iM6981 = (C0630.m2566("᩹᩸") + i6) * (-9);
                        i7 = ((iM6981 ^ i5) * 18881) ^ (-1812025552);
                        i8 = 1920645872;
                    }
                    break;
                case -343830833:
                case 589353265:
                    c11007M48816 = c21610.m48815(2);
                    i = 8;
                    if (C5695.f17556 >= 0) {
                        iM6981 = (i6 - C2105.m6981("᩵ۘ")) * 37;
                        i7 = ((iM6981 ^ i5) * (-13209)) ^ (-252696675);
                        i8 = -56403474;
                    } else {
                        iM6981 = C0630.m2566("ۜᩳ") ^ i6;
                        i7 = ((iM6981 ^ i5) * 16783) ^ 1279111993;
                        i8 = 304515993;
                    }
                    break;
                case -257373510:
                case 1097473892:
                    if (C4075.m12263() > 0) {
                        iM6981 = (C2105.m6981("ۤܳ") ^ i6) * (-119);
                        i7 = ((iM6981 ^ i5) * 1301) ^ (-162207699);
                        i8 = 586676814;
                    } else {
                        iM6981 = C0630.m2566("ܺۙ") ^ i5;
                        i7 = ((iM6981 ^ i6) * (-25089)) ^ (-1086082770);
                        i8 = 1115192925;
                    }
                    break;
                case -120018402:
                case 2064748978:
                    view.setPadding(i3, i3, i3, C3911.m11932(c11007M48816.f33108, c11007M48817.f33108));
                    break;
                case 324723618:
                case 1371271492:
                    c11007M48815 = c21610.m48815(1);
                    if (C0483.m2121()) {
                        iM6981 = (C2105.m6981("ۖۚ") + i6) * 49;
                        i7 = ((iM6981 ^ i5) * 13779) ^ 83193436;
                        i8 = 2000811956;
                    } else {
                        iM6981 = C2105.m6981("۬᩺") ^ i6;
                        i7 = ((iM6981 ^ i5) * (-15619)) ^ 1484558489;
                        i8 = 85105403;
                    }
                    break;
                case 469582054:
                case 661215482:
                    if (C3911.m11924() <= 0) {
                        iM6981 = (C0630.m2566("ۨ᩵") + i5) * 87;
                        i7 = ((iM6981 ^ i6) * 24331) ^ 936436517;
                        i8 = -354652724;
                    } else {
                        iM6981 = (C0630.m2566("᩶ᩴ") + i5) * 51;
                        i7 = ((iM6981 ^ i6) * 8367) ^ 207718654;
                        i8 = -1353055473;
                    }
                    break;
                case 764271056:
                case 1820481106:
                    if (C4616.f14690 <= 0) {
                        iM6981 = (C0630.m2566("ۨ᩵") + i5) * 87;
                        i7 = ((iM6981 ^ i6) * 24331) ^ 936436517;
                        i8 = -354652724;
                    } else {
                        iM6981 = C2105.m6981("֫ۨ") ^ i6;
                        i7 = ((iM6981 ^ i5) * 31331) ^ (-1674651597);
                        i8 = 171749117;
                    }
                    break;
                case 1228216328:
                case 1980271450:
                    if (C1773.f6144 <= 0) {
                        iM6981 = C2105.m6981("۬᩺") ^ i6;
                        i7 = ((iM6981 ^ i5) * (-15619)) ^ 1484558489;
                        i8 = 85105403;
                    } else {
                        iM6981 = (C2105.m6981("ۤܳ") ^ i6) * (-119);
                        i7 = ((iM6981 ^ i5) * 1301) ^ (-162207699);
                        i8 = 586676814;
                    }
                    break;
                default:
                    RunnableC3474.m10630();
                    if (C1047.m3599() < 0) {
                        iM6981 = (C0630.m2566("ۨ᩵") + i5) * 87;
                        i7 = ((iM6981 ^ i6) * 24331) ^ 936436517;
                        i8 = -354652724;
                    } else {
                        iM6981 = (C2105.m6981("ۤܳ") ^ i6) * (-119);
                        i7 = ((iM6981 ^ i5) * 1301) ^ (-162207699);
                        i8 = 586676814;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x02e0 A[PHI: r2 r16
      0x02e0: PHI (r2v5 java.lang.String) = (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v4 java.lang.String), (r2v2 java.lang.String) binds: [B:69:0x02de, B:61:0x0282, B:42:0x0190, B:12:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x02e0: PHI (r16v19 int) = (r16v4 int), (r16v6 int), (r16v13 int), (r16v20 int) binds: [B:69:0x02de, B:61:0x0282, B:42:0x0190, B:12:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0316 A[PHI: r6 r7 r16
      0x0316: PHI (r6v7 int) = (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:73:0x0314, B:53:0x0222, B:38:0x015e, B:9:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x0316: PHI (r7v7 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:73:0x0314, B:53:0x0222, B:38:0x015e, B:9:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x0316: PHI (r16v26 int) = (r16v3 int), (r16v8 int), (r16v14 int), (r16v27 int) binds: [B:73:0x0314, B:53:0x0222, B:38:0x015e, B:9:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30822(AbstractActivityC3346 abstractActivityC3346, String str, Drawable drawable, boolean z, String str2) {
        int iM2566;
        int i;
        int i2;
        int i3;
        int iM2567;
        int i4;
        AbstractActivityC3346 abstractActivityC3347 = abstractActivityC3346;
        String str3 = str2;
        String strM12355 = null;
        Intent intent = null;
        short[] sArr = null;
        char c = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i8 = 173891931;
        int i9 = C0483.f2088;
        int i10 = ViewOnClickListenerC1958.f6529;
        int iM6981 = (C2105.m6981("ۗۧ") + i9) * (-77);
        int i11 = ((iM6981 ^ i10) * (-6723)) ^ 51201404;
        int i12 = -1662043962;
        while (true) {
            int i13 = iM6981 ^ i12;
            while (true) {
                i8 = ((((i8 ^ i10) * 21507) >> 31) & i11) ^ i13;
                switch (i8) {
                    case -2126152310:
                    case 1774170017:
                        i7 = 13808;
                        iM2566 = C2105.m6981("ᩴܺ") ^ i10;
                        i = ((iM2566 ^ i9) * (-5205)) ^ 1168732981;
                        i2 = -328607821;
                        i13 = iM2566 ^ i2;
                        i11 = i;
                        i8 = i8;
                        abstractActivityC3347 = abstractActivityC3346;
                        str3 = str2;
                        break;
                    case -1918226700:
                    case 410333450:
                        i3 = i8;
                        intent.putExtra(C2105.m6988(sArr3, 20, 10, i7), z);
                        if (str3 != null) {
                            iM2567 = (i9 - C0630.m2566("ۘܿ")) * 119;
                            i11 = ((iM2567 ^ i10) * 8173) ^ 1561408919;
                            i4 = -1016453551;
                        } else {
                            iM2567 = C0630.m2566("ۚۘ") ^ i10;
                            i11 = ((iM2567 ^ i9) * (-19933)) ^ 1967395603;
                            i4 = 677217142;
                        }
                        i13 = iM2567 ^ i4;
                        i8 = i3;
                        break;
                    case -1876418153:
                    case 98372296:
                        i8 = i8;
                        if (C2272.f7362) {
                            iM2566 = C0630.m2566("ۖۖ") ^ i10;
                            i = ((iM2566 ^ i9) * 19459) ^ (-334567850);
                            i2 = 2087883547;
                        } else {
                            iM2566 = (i9 - C2105.m6981("ۤܰ")) * 59;
                            i = ((iM2566 ^ i10) * (-16343)) ^ 152324544;
                            i2 = -789956767;
                        }
                        i13 = iM2566 ^ i2;
                        i11 = i;
                        i8 = i8;
                        abstractActivityC3347 = abstractActivityC3346;
                        str3 = str2;
                        break;
                    case -1753521411:
                    case 822294329:
                        i8 = i8;
                        if ((6927424 + i6) - i5 >= 0) {
                            iM2566 = C0630.m2566("᩵۠") ^ i10;
                            i = ((iM2566 ^ i9) * 30643) ^ 1097482478;
                            i2 = -1013922693;
                        } else {
                            iM2566 = C0630.m2566("᩷᩵") ^ i9;
                            i = ((iM2566 ^ i10) * 5287) ^ 315119245;
                            i2 = 1583703383;
                        }
                        i13 = iM2566 ^ i2;
                        i11 = i;
                        i8 = i8;
                        abstractActivityC3347 = abstractActivityC3346;
                        str3 = str2;
                        break;
                    case -1753274187:
                    case 2129821231:
                        i8 = i8;
                        if (C1420.f5096 <= 0) {
                            iM2566 = (i10 - C0630.m2566("᩸᩻")) * (-19);
                            i = ((iM2566 ^ i9) * 3103) ^ (-1593703227);
                            i2 = 2040891524;
                        } else {
                            iM2566 = C0630.m2566("ۙۡ") ^ i10;
                            i = ((iM2566 ^ i9) * (-6903)) ^ (-1276078251);
                            i2 = -147092926;
                        }
                        i13 = iM2566 ^ i2;
                        i11 = i;
                        i8 = i8;
                        abstractActivityC3347 = abstractActivityC3346;
                        str3 = str2;
                        break;
                    case -1750049977:
                    case 552082340:
                        i7 = 25899;
                        iM2566 = C2105.m6981("ᩴܺ") ^ i10;
                        i = ((iM2566 ^ i9) * (-5205)) ^ 1168732981;
                        i2 = -328607821;
                        i13 = iM2566 ^ i2;
                        i11 = i;
                        i8 = i8;
                        abstractActivityC3347 = abstractActivityC3346;
                        str3 = str2;
                        break;
                    case -1558645411:
                    case -834461708:
                        i8 = i8;
                        if (C4159.f13567) {
                            iM2566 = (C0630.m2566("ܰۧ") + i9) * 43;
                            i = ((iM2566 ^ i10) * 2429) ^ (-536423066);
                            i2 = -1871439926;
                        } else {
                            iM2566 = C0630.m2566("ۖۖ") ^ i10;
                            i = ((iM2566 ^ i9) * 19459) ^ (-334567850);
                            i2 = 2087883547;
                        }
                        i13 = iM2566 ^ i2;
                        i11 = i;
                        i8 = i8;
                        abstractActivityC3347 = abstractActivityC3346;
                        str3 = str2;
                        break;
                    case -1204017760:
                    case 1700011228:
                        C4075.m12263();
                        if (C1294.f4556 < 0) {
                            i8 = i8;
                            iM2566 = C2105.m6981("᩶ۖ") ^ i9;
                            i = ((iM2566 ^ i10) * 10659) ^ (-1048418889);
                            i2 = 814619231;
                            i13 = iM2566 ^ i2;
                            i11 = i;
                            i8 = i8;
                            abstractActivityC3347 = abstractActivityC3346;
                            str3 = str2;
                        }
                        i8 = i8;
                        iM2566 = C0630.m2566("ۖۖ") ^ i10;
                        i = ((iM2566 ^ i9) * 19459) ^ (-334567850);
                        i2 = 2087883547;
                        i13 = iM2566 ^ i2;
                        i11 = i;
                        i8 = i8;
                        abstractActivityC3347 = abstractActivityC3346;
                        str3 = str2;
                        break;
                    case -1203156798:
                    case 1910574801:
                        i8 = i8;
                        strM12355 = C4117.m12355(f37926, 1, 11, i7);
                        if (C3537.m10746() <= 0) {
                            iM2566 = C0630.m2566("ۖۖ") ^ i10;
                            i = ((iM2566 ^ i9) * 19459) ^ (-334567850);
                            i2 = 2087883547;
                        } else {
                            iM2566 = C2105.m6981("֨ᩴ") ^ i9;
                            i = ((iM2566 ^ i10) * 29863) ^ (-422033290);
                            i2 = -1053846418;
                        }
                        i13 = iM2566 ^ i2;
                        i11 = i;
                        i8 = i8;
                        abstractActivityC3347 = abstractActivityC3346;
                        str3 = str2;
                        break;
                    case -1139025716:
                    case 868747942:
                        i8 = i8;
                        sArr = f37926;
                        c = 0;
                        if (C4616.f14690 <= 0) {
                            iM2566 = C2105.m6981("᩶ۖ") ^ i9;
                            i = ((iM2566 ^ i10) * 10659) ^ (-1048418889);
                            i2 = 814619231;
                        } else {
                            iM2566 = (C2105.m6981("ۜ۫") + i10) * 33;
                            i = ((iM2566 ^ i9) * (-6801)) ^ (-791920343);
                            i2 = 905265113;
                        }
                        i13 = iM2566 ^ i2;
                        i11 = i;
                        i8 = i8;
                        abstractActivityC3347 = abstractActivityC3346;
                        str3 = str2;
                        break;
                    case -921466764:
                    case 1325087174:
                        i8 = i8;
                        C1504.m5168(intent, C1420.m4902(sArr2, 12, 8, i7), str);
                        sArr3 = f37926;
                        if (C3245.m9925() != 0) {
                            iM2566 = C2105.m6981("᩶ۖ") ^ i9;
                            i = ((iM2566 ^ i10) * 10659) ^ (-1048418889);
                            i2 = 814619231;
                            i13 = iM2566 ^ i2;
                            i11 = i;
                            i8 = i8;
                            abstractActivityC3347 = abstractActivityC3346;
                        } else {
                            int iM2568 = (i9 - C0630.m2566("ۘ֨")) * (-61);
                            i13 = iM2568 ^ (-860006701);
                            i8 = i8;
                            i11 = ((iM2568 ^ i10) * (-32215)) ^ 244064992;
                        }
                        str3 = str2;
                        break;
                    case -532550733:
                    case 1093678749:
                        C3432.m10477();
                        i8 = i8;
                        iM2566 = C0630.m2566("ۖۖ") ^ i10;
                        i = ((iM2566 ^ i9) * 19459) ^ (-334567850);
                        i2 = 2087883547;
                        i13 = iM2566 ^ i2;
                        i11 = i;
                        i8 = i8;
                        abstractActivityC3347 = abstractActivityC3346;
                        str3 = str2;
                        break;
                    case -345890828:
                    case -81421321:
                        i8 = i8;
                        if (C0714.m2805()) {
                            iM2566 = C0630.m2566("۟ۨ") ^ i10;
                            i = ((iM2566 ^ i9) * (-14693)) ^ (-1972867696);
                            i2 = 1375630614;
                        } else {
                            iM2566 = C0630.m2566("ۨۖ") ^ i9;
                            i = ((iM2566 ^ i10) * 11945) ^ 1947803526;
                            i2 = 875612698;
                        }
                        i13 = iM2566 ^ i2;
                        i11 = i;
                        i8 = i8;
                        abstractActivityC3347 = abstractActivityC3346;
                        str3 = str2;
                        break;
                    case -314488993:
                    case 1697129181:
                        i8 = i8;
                        short s = sArr[c];
                        i5 = s * 5264;
                        i6 = s * s;
                        if (C1420.m4913()) {
                            iM2566 = (i10 - C0630.m2566("᩸᩻")) * (-19);
                            i = ((iM2566 ^ i9) * 3103) ^ (-1593703227);
                            i2 = 2040891524;
                        } else {
                            iM2566 = (C0630.m2566("ۚۚ") + i9) * 119;
                            i = ((iM2566 ^ i10) * 21925) ^ (-786965922);
                            i2 = 782861528;
                        }
                        i13 = iM2566 ^ i2;
                        i11 = i;
                        i8 = i8;
                        abstractActivityC3347 = abstractActivityC3346;
                        str3 = str2;
                        break;
                    case -273778820:
                    case 816916855:
                        if (C1916.m6308() < 0) {
                        }
                        i8 = i8;
                        iM2566 = C0630.m2566("ۖۖ") ^ i10;
                        i = ((iM2566 ^ i9) * 19459) ^ (-334567850);
                        i2 = 2087883547;
                        i13 = iM2566 ^ i2;
                        i11 = i;
                        i8 = i8;
                        abstractActivityC3347 = abstractActivityC3346;
                        str3 = str2;
                        break;
                    case -37847246:
                    case 2088696959:
                        ServiceConnectionC3453.m10570(abstractActivityC3347, intent);
                        break;
                    case 317742868:
                    case 1696491185:
                        i8 = i8;
                        intent = new Intent(abstractActivityC3347, (Class<?>) ActivityC12581.class);
                        sArr2 = f37926;
                        if (C5695.m16023() >= 0) {
                            iM2566 = C0630.m2566("ۨۖ") ^ i9;
                            i = ((iM2566 ^ i10) * 11945) ^ 1947803526;
                            i2 = 875612698;
                            i13 = iM2566 ^ i2;
                            i11 = i;
                            i8 = i8;
                            abstractActivityC3347 = abstractActivityC3346;
                        } else {
                            int iM2569 = (C0630.m2566("ܰۗ") ^ i9) * q.h;
                            i11 = ((iM2569 ^ i10) * 11793) ^ (-110739743);
                            i13 = iM2569 ^ 1031618400;
                            i8 = i8;
                        }
                        str3 = str2;
                        break;
                    case 504105889:
                    case 814169375:
                        i8 = i8;
                        C2956.m9014(RunnableC3474.m10618(abstractActivityC3346), drawable, strM12355);
                        if (C3663.f11553) {
                            iM2566 = (i10 - C0630.m2566("᩸᩻")) * (-19);
                            i = ((iM2566 ^ i9) * 3103) ^ (-1593703227);
                            i2 = 2040891524;
                            i13 = iM2566 ^ i2;
                            i11 = i;
                        } else {
                            int iM25610 = C0630.m2566("۟ۤ") ^ i10;
                            i11 = ((iM25610 ^ i9) * 8989) ^ (-1286441464);
                            i13 = iM25610 ^ 826087779;
                        }
                        i8 = i8;
                        abstractActivityC3347 = abstractActivityC3346;
                        str3 = str2;
                        break;
                    case 676457964:
                    case 1769464166:
                        C4616.m13552();
                        C21923.m49329();
                        break;
                    case 921520629:
                    case 2053953749:
                        i3 = i8;
                        C1504.m5168(intent, RunnableC1108.m3789(f37926, 30, 17, i7), str3);
                        iM2567 = C0630.m2566("ۚۘ") ^ i10;
                        i11 = ((iM2567 ^ i9) * (-19933)) ^ 1967395603;
                        i4 = 677217142;
                        i13 = iM2567 ^ i4;
                        i8 = i3;
                        break;
                    default:
                        if (C3537.f11231 < 0) {
                            i8 = i8;
                            iM2566 = (i10 - C0630.m2566("᩸᩻")) * (-19);
                            i = ((iM2566 ^ i9) * 3103) ^ (-1593703227);
                            i2 = 2040891524;
                            i13 = iM2566 ^ i2;
                            i11 = i;
                            i8 = i8;
                            abstractActivityC3347 = abstractActivityC3346;
                            str3 = str2;
                        }
                        break;
                }
                return;
            }
            iM6981 = C2105.m6981("ܿܳ") ^ i10;
            i11 = ((iM6981 ^ i9) * 11387) ^ 1841094542;
            i12 = -1268602800;
        }
    }

    @Override // l.AbstractActivityC3346, l.ActivityC0737, android.app.Activity
    public final void onResume() {
        TextView textView = null;
        int i = 0;
        int i2 = 1078578236;
        int i3 = C22628.f73083;
        int i4 = C0630.f2410;
        int iM2566 = C0630.m2566("ۖܿ") ^ i3;
        int i5 = ((iM2566 ^ i4) * 10389) ^ 2135793769;
        int i6 = 694601724;
        while (true) {
            int i7 = iM2566 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i4) * 1409) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1548600366:
                    case -960495358:
                        C5695.m16023();
                        iM2566 = (i4 - C0630.m2566("ۜۨ")) * (-75);
                        i5 = ((iM2566 ^ i3) * 14221) ^ (-1510537913);
                        i6 = 2079054853;
                    case -1466240733:
                    case 478485046:
                        super.onResume();
                        if (C2167.f7158 < 0) {
                            iM2566 = C2105.m6981("ۨ᩺") ^ i4;
                            i5 = ((iM2566 ^ i3) * (-5779)) ^ (-1551450028);
                            i6 = -1410492349;
                        } else {
                            iM2566 = (i4 - C0630.m2566("ۜۨ")) * (-75);
                            i5 = ((iM2566 ^ i3) * 14221) ^ (-1510537913);
                            i6 = 2079054853;
                        }
                        break;
                    case -1437777756:
                    case 30103663:
                        if (this.f37936.getVisibility() != i) {
                            iM2566 = (C2105.m6981("ۢ۫") ^ i4) * (-35);
                            i5 = ((iM2566 ^ i3) * (-14455)) ^ (-848949696);
                            i6 = -532493049;
                        } else {
                            iM2566 = (C2105.m6981("ܽۜ") ^ i3) * 89;
                            i5 = ((iM2566 ^ i4) * 26905) ^ 148985935;
                            i6 = 2062015810;
                        }
                        break;
                    case -1267903862:
                    case -294810551:
                        if (C0237.f1507 != 0) {
                            iM2566 = C0630.m2566("ܺۤ") ^ i4;
                            i5 = ((iM2566 ^ i3) * (-1167)) ^ (-1008390515);
                            i6 = 768898783;
                        } else {
                            iM2566 = C0630.m2566("ܶ֨") ^ i4;
                            i5 = ((iM2566 ^ i3) * 21559) ^ (-1756810991);
                            i6 = 649228696;
                        }
                        break;
                    case -1142994719:
                    case 604543624:
                        if (!C1711.f5919) {
                            iM2566 = C0630.m2566("ۖۧ") ^ i3;
                            i5 = ((iM2566 ^ i4) * 23265) ^ 879693903;
                            i6 = 946231394;
                        } else {
                            iM2566 = (i4 - C0630.m2566("ۜۨ")) * (-75);
                            i5 = ((iM2566 ^ i3) * 14221) ^ (-1510537913);
                            i6 = 2079054853;
                        }
                        break;
                    case -1111061336:
                    case -245528681:
                        if (C22628.m50615() == 0) {
                            iM2566 = (i3 - C2105.m6981("᩵᩺")) * (-23);
                            i5 = ((iM2566 ^ i4) * (-6463)) ^ 1146968324;
                            i6 = 425772658;
                        } else {
                            iM2566 = C0630.m2566("ۖۖ") ^ i3;
                            i5 = ((iM2566 ^ i4) * (-19893)) ^ 650474055;
                            i6 = -1773017103;
                        }
                        break;
                    case -1045296500:
                    case 2080537580:
                        C1420.m4913();
                        if (C1420.f5096 <= 0) {
                            iM2566 = C0630.m2566("ۖۖ") ^ i3;
                            i5 = ((iM2566 ^ i4) * (-19893)) ^ 650474055;
                            i6 = -1773017103;
                            break;
                        }
                        iM2566 = (i4 - C0630.m2566("ۜۨ")) * (-75);
                        i5 = ((iM2566 ^ i3) * 14221) ^ (-1510537913);
                        i6 = 2079054853;
                        break;
                    case -958506946:
                    case 297937371:
                        m30835();
                        iM2566 = (C2105.m6981("ۢ۫") ^ i4) * (-35);
                        i5 = ((iM2566 ^ i3) * (-14455)) ^ (-848949696);
                        i6 = -532493049;
                        break;
                    case -948199482:
                    case -220549478:
                        if (!C0798.f2919) {
                            iM2566 = C0630.m2566("ᩳۖ") ^ i4;
                            i5 = ((iM2566 ^ i3) * 19239) ^ 1849272770;
                            i6 = 1625155909;
                        } else {
                            iM2566 = (i3 - C0630.m2566("֡ᩴ")) * (-11);
                            i5 = ((iM2566 ^ i4) * (-7877)) ^ (-359411855);
                            i6 = 1093327609;
                        }
                        break;
                    case -549715173:
                    case 689707645:
                        if (!C1916.f6442) {
                            iM2566 = C0630.m2566("ۖۖ") ^ i3;
                            i5 = ((iM2566 ^ i4) * (-19893)) ^ 650474055;
                            i6 = -1773017103;
                            break;
                        }
                        iM2566 = C0630.m2566("ۛ᩹") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-15975)) ^ 745615679;
                        i6 = -952547705;
                        break;
                    case -148999350:
                    case 917359796:
                        if (textView.getVisibility() != 8) {
                            i = 8;
                            iM2566 = (C2105.m6981("ۢ۫") ^ i4) * (-35);
                            i5 = ((iM2566 ^ i3) * (-14455)) ^ (-848949696);
                            i6 = -532493049;
                        }
                        int iM2567 = C0630.m2566("ܳܽ") ^ i3;
                        i5 = ((iM2567 ^ i4) * 12441) ^ (-1340253572);
                        i7 = iM2567 ^ 875084006;
                        i = 8;
                        break;
                        break;
                    case -144145528:
                    case 980303040:
                        if (C7106.f21815 == 0) {
                            iM2566 = (i3 - C2105.m6981("ᩴ۟")) * (-103);
                            i5 = ((iM2566 ^ i4) * 5571) ^ (-1339905240);
                            i6 = 824811777;
                        } else {
                            iM2566 = C0630.m2566("ܶ֨") ^ i4;
                            i5 = ((iM2566 ^ i3) * 21559) ^ (-1756810991);
                            i6 = 649228696;
                        }
                        break;
                    case 204034283:
                    case 1675447865:
                        if (C7106.f21815 == 0) {
                            iM2566 = (C2105.m6981("᩺۠") + i4) * 109;
                            i5 = ((iM2566 ^ i3) * 30277) ^ (-434870606);
                            i6 = -1161896716;
                        } else {
                            iM2566 = (i4 - C0630.m2566("ۜۨ")) * (-75);
                            i5 = ((iM2566 ^ i3) * 14221) ^ (-1510537913);
                            i6 = 2079054853;
                        }
                        break;
                    case 226853968:
                    case 568169707:
                        if (!C0382.f1805) {
                            iM2566 = C0630.m2566("ܺۤ") ^ i4;
                            i5 = ((iM2566 ^ i3) * (-1167)) ^ (-1008390515);
                            i6 = 768898783;
                            break;
                        }
                        iM2566 = C2105.m6981("᩵ۧ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 22187) ^ (-1821691582);
                        i6 = -1197759360;
                        break;
                    case 311264816:
                    case 830911516:
                        if (!C4159.f13567) {
                            iM2566 = C0630.m2566("ܶ֨") ^ i4;
                            i5 = ((iM2566 ^ i3) * 21559) ^ (-1756810991);
                            i6 = 649228696;
                            break;
                        }
                        iM2566 = C2105.m6981("۠ۙ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 20899) ^ (-1027066382);
                        i6 = -2054408284;
                        break;
                    case 360834183:
                    case 1451807661:
                        C2167.m7155();
                        C2167.m7155();
                        break;
                    case 819750689:
                    case 2003074931:
                        C2167.m7155();
                        if (!RunnableC3474.m10630()) {
                            iM2566 = C0630.m2566("ۖۖ") ^ i3;
                            i5 = ((iM2566 ^ i4) * (-19893)) ^ 650474055;
                            i6 = -1773017103;
                            break;
                        }
                        iM2566 = C0630.m2566("ܶ֨") ^ i4;
                        i5 = ((iM2566 ^ i3) * 21559) ^ (-1756810991);
                        i6 = 649228696;
                        break;
                    case 1646808356:
                    case 2041301492:
                        break;
                    default:
                        textView = this.f37935;
                        if (!C2126.f7087) {
                            iM2566 = C0630.m2566("᩵ۤ") ^ i3;
                            i5 = ((iM2566 ^ i4) * (-15631)) ^ (-106784268);
                            i6 = 55439704;
                        } else {
                            iM2566 = (i3 - C0630.m2566("֡ᩴ")) * (-11);
                            i5 = ((iM2566 ^ i4) * (-7877)) ^ (-359411855);
                            i6 = 1093327609;
                        }
                        break;
                }
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0336 A[PHI: r12 r26
      0x0336: PHI (r12v6 android.widget.Button) = (r12v5 android.widget.Button), (r12v2 android.widget.Button), (r12v2 android.widget.Button) binds: [B:59:0x0334, B:40:0x01b4, B:22:0x00c8] A[DONT_GENERATE, DONT_INLINE]
      0x0336: PHI (r26v23 android.graphics.drawable.Drawable) = 
      (r26v13 android.graphics.drawable.Drawable)
      (r26v17 android.graphics.drawable.Drawable)
      (r26v24 android.graphics.drawable.Drawable)
     binds: [B:59:0x0334, B:40:0x01b4, B:22:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x03bb A[PHI: r2 r19 r20 r26
      0x03bb: PHI (r2v6 short[]) = (r2v5 short[]), (r2v2 short[]), (r2v2 short[]), (r2v2 short[]) binds: [B:67:0x03b9, B:47:0x0238, B:43:0x01e9, B:23:0x00cc] A[DONT_GENERATE, DONT_INLINE]
      0x03bb: PHI (r19v4 int) = (r19v2 int), (r19v2 int), (r19v3 int), (r19v2 int) binds: [B:67:0x03b9, B:47:0x0238, B:43:0x01e9, B:23:0x00cc] A[DONT_GENERATE, DONT_INLINE]
      0x03bb: PHI (r20v4 int) = (r20v2 int), (r20v2 int), (r20v3 int), (r20v2 int) binds: [B:67:0x03b9, B:47:0x0238, B:43:0x01e9, B:23:0x00cc] A[DONT_GENERATE, DONT_INLINE]
      0x03bb: PHI (r26v22 android.graphics.drawable.Drawable) = 
      (r26v11 android.graphics.drawable.Drawable)
      (r26v16 android.graphics.drawable.Drawable)
      (r26v17 android.graphics.drawable.Drawable)
      (r26v25 android.graphics.drawable.Drawable)
     binds: [B:67:0x03b9, B:47:0x0238, B:43:0x01e9, B:23:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x0432 A[PHI: r11 r26
      0x0432: PHI (r11v4 java.lang.String) = (r11v3 java.lang.String), (r11v2 java.lang.String) binds: [B:78:0x041b, B:71:0x03ed] A[DONT_GENERATE, DONT_INLINE]
      0x0432: PHI (r26v9 android.graphics.drawable.Drawable) = (r26v6 android.graphics.drawable.Drawable), (r26v10 android.graphics.drawable.Drawable) binds: [B:78:0x041b, B:71:0x03ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x0541 A[PHI: r7 r13 r26 r27
      0x0541: PHI (r7v6 boolean) = (r7v3 boolean), (r7v2 boolean), (r7v2 boolean), (r7v2 boolean) binds: [B:94:0x053f, B:63:0x037f, B:55:0x02e5, B:10:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x0541: PHI (r13v7 android.view.View) = (r13v2 android.view.View), (r13v2 android.view.View), (r13v4 android.view.View), (r13v2 android.view.View) binds: [B:94:0x053f, B:63:0x037f, B:55:0x02e5, B:10:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x0541: PHI (r26v37 android.graphics.drawable.Drawable) = 
      (r26v4 android.graphics.drawable.Drawable)
      (r26v12 android.graphics.drawable.Drawable)
      (r26v14 android.graphics.drawable.Drawable)
      (r26v38 android.graphics.drawable.Drawable)
     binds: [B:94:0x053f, B:63:0x037f, B:55:0x02e5, B:10:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x0541: PHI (r27v8 android.view.View) = (r27v5 android.view.View), (r27v3 android.view.View), (r27v3 android.view.View), (r27v3 android.view.View) binds: [B:94:0x053f, B:63:0x037f, B:55:0x02e5, B:10:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d4, code lost:
    
        if (l.C1504.m5179() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x006f, code lost:
    
        if (l.C5695.f17556 < 0) goto L27;
     */
    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        int iM6981;
        int i;
        int i2;
        View view;
        int iM2566;
        int i3;
        int iM2567;
        int i4;
        int i5;
        int i6;
        short[] sArr;
        int iM6982;
        int i7;
        int i8;
        int iM2568;
        int i9;
        int i10;
        Drawable drawable;
        int i11 = C22628.f73083;
        int i12 = C2520.f8000;
        int iM2569 = (i12 - C0630.m2566("ۜۖ")) * (-29);
        int i13 = ((iM2569 ^ i11) * 18265) ^ (-1759167327);
        Window windowM19115 = null;
        View decorView = null;
        View viewFindViewById = null;
        Drawable drawable2 = null;
        short[] sArr2 = null;
        int i14 = iM2569 ^ (-1006960391);
        boolean z = false;
        int i15 = 0;
        boolean z2 = false;
        int i16 = 0;
        int i17 = 0;
        int iM6983 = 0;
        int i18 = 0;
        int iM6984 = 0;
        int i19 = 0;
        int iM6985 = 0;
        int i20 = 0;
        int i21 = -6993878;
        View viewM12813 = null;
        Button button = null;
        String str = null;
        Uri data = null;
        Intent intentM7034 = null;
        while (true) {
            i21 = i14 ^ (i13 & (((i21 ^ i11) * (-31241)) >> 31));
            switch (i21) {
                case -2135102285:
                case 433603965:
                    drawable2 = drawable2;
                    viewFindViewById = viewFindViewById;
                    windowM19115 = C7106.m19115(this);
                    i20 = i20;
                    if (i20 >= 28) {
                        int iM25610 = (C0630.m2566("᩵ۖ") + i12) * (-113);
                        viewFindViewById = viewFindViewById;
                        i20 = i20;
                        drawable2 = drawable2;
                        i14 = iM25610 ^ (-1237256043);
                        i13 = ((iM25610 ^ i11) * 8613) ^ (-1459781975);
                        z = true;
                    } else {
                        z = true;
                        int iM25611 = (i12 - C0630.m2566("ܳۖ")) * 59;
                        sArr2 = sArr2;
                        i4 = ((iM25611 ^ i11) * 7755) ^ (-1158982631);
                        i6 = iM25611 ^ 1646183219;
                        viewFindViewById = viewFindViewById;
                        drawable = drawable2;
                        i14 = i6;
                        i13 = i4;
                        sArr2 = sArr2;
                        i20 = i20;
                        drawable2 = drawable;
                    }
                    break;
                case -2047653508:
                case 860259493:
                    sArr = sArr2;
                    drawable2 = drawable2;
                    view = viewFindViewById;
                    this.f10584 = (C9762) C0964.m3409(this, iM6985 ^ i17);
                    this.f37942 = (ViewGroup) C4263.m12813(this, C2105.m6981(C0382.m1840(f37926, 77, 3, i16)) ^ 2121345395);
                    C2272.m7515(this, this.f10584);
                    i20 = Build.VERSION.SDK_INT;
                    if (i20 >= 23) {
                        iM6982 = C2105.m6981("ۙۖ") ^ i12;
                        i7 = ((iM6982 ^ i11) * 12313) ^ 519862011;
                        i8 = 1078523812;
                    } else {
                        iM6982 = C2105.m6981("᩹᩷") ^ i11;
                        i7 = ((iM6982 ^ i12) * (-6951)) ^ 1351075215;
                        i8 = 741870720;
                    }
                    int i22 = iM6982 ^ i8;
                    viewFindViewById = view;
                    short[] sArr3 = sArr;
                    i20 = i20;
                    i13 = i7;
                    drawable2 = drawable2;
                    i14 = i22;
                    sArr2 = sArr3;
                    break;
                case -1996086976:
                case -820947377:
                    drawable2 = drawable2;
                    view = viewFindViewById;
                    C17648.m41310(view, new InterfaceC16610() { // from class: l.۠ᩳ᩷
                        @Override // l.InterfaceC16610
                        public final C21610 onApplyWindowInsets(View view2, C21610 c21610) {
                            int i23 = 279308333;
                            int i24 = C0630.f2410;
                            int i25 = C0483.f2088;
                            int iM25612 = (C0630.m2566("ܽܿ") + i25) * 29;
                            int i26 = ((iM25612 ^ i24) * 19033) ^ 202718000;
                            int i27 = 219231944;
                            while (true) {
                                i23 = ((((i23 ^ i24) * 11709) >> 31) & i26) ^ (iM25612 ^ i27);
                                switch (i23) {
                                    case -2140429672:
                                    case -1771498666:
                                        ActivityC12581.m30825(this.f25573, view2, c21610);
                                        return c21610;
                                    case -1486724872:
                                    case -670927684:
                                        if (C4263.f13799 <= 0) {
                                            iM25612 = (i24 - C2105.m6981("۫ܿ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                            i26 = ((iM25612 ^ i25) * 9521) ^ (-165255227);
                                            i27 = 1963009391;
                                        } else {
                                            iM25612 = (C0630.m2566("ۨۚ") ^ i25) * 87;
                                            i26 = ((iM25612 ^ i24) * 18181) ^ 300147733;
                                            i27 = 2062033484;
                                        }
                                        break;
                                    case -1342433877:
                                    case 944968603:
                                        if (C3537.f11231 >= 0) {
                                            iM25612 = (i25 - C2105.m6981("ۛ᩺")) * (-89);
                                            i26 = ((iM25612 ^ i24) * 27317) ^ (-1832572822);
                                            i27 = 385741906;
                                        } else {
                                            iM25612 = (C0630.m2566("ܺܰ") + i24) * (-41);
                                            i26 = ((iM25612 ^ i25) * (-30503)) ^ (-841633664);
                                            i27 = 134340018;
                                        }
                                        break;
                                    case -1335597869:
                                    case 48918724:
                                        if (RunnableC0588.f2309 >= 0) {
                                            iM25612 = (i25 - C2105.m6981("ۛ᩺")) * (-89);
                                            i26 = ((iM25612 ^ i24) * 27317) ^ (-1832572822);
                                            i27 = 385741906;
                                        } else {
                                            iM25612 = (i24 - C2105.m6981("ܿۗ")) * (-117);
                                            i26 = ((iM25612 ^ i25) * 7603) ^ 39737046;
                                            i27 = -509878486;
                                        }
                                        break;
                                    case -1163976992:
                                    case 2137216856:
                                        C2167.m7155();
                                        if (C2105.m6982() == 0) {
                                            iM25612 = (C2105.m6981("ۢۖ") + i25) * 81;
                                            i26 = ((iM25612 ^ i24) * (-12501)) ^ 1965766182;
                                            i27 = -2412197;
                                        } else {
                                            iM25612 = (i25 - C2105.m6981("ۛ᩺")) * (-89);
                                            i26 = ((iM25612 ^ i24) * 27317) ^ (-1832572822);
                                            i27 = 385741906;
                                        }
                                        break;
                                    case -1005605726:
                                    case 700945766:
                                        if (C1047.f3863 >= 0) {
                                            iM25612 = (i25 - C2105.m6981("ۛ᩺")) * (-89);
                                            i26 = ((iM25612 ^ i24) * 27317) ^ (-1832572822);
                                            i27 = 385741906;
                                        } else {
                                            iM25612 = C2105.m6981("۟֨") ^ i25;
                                            i26 = ((iM25612 ^ i24) * (-11221)) ^ (-2107476167);
                                            i27 = 107663545;
                                        }
                                        break;
                                    case -943934563:
                                    case 1813492208:
                                        if (C0964.m3413()) {
                                            iM25612 = (C2105.m6981("۬ۡ") + i25) * 3;
                                            i26 = ((iM25612 ^ i24) * (-28155)) ^ 1402245538;
                                            i27 = 1164898004;
                                        } else {
                                            iM25612 = (i25 - C2105.m6981("ۛ᩺")) * (-89);
                                            i26 = ((iM25612 ^ i24) * 27317) ^ (-1832572822);
                                            i27 = 385741906;
                                        }
                                        break;
                                    case -649503725:
                                    case 1102975886:
                                        if (RunnableC0588.f2309 >= 0) {
                                            iM25612 = (C2105.m6981("ۢۖ") + i25) * 81;
                                            i26 = ((iM25612 ^ i24) * (-12501)) ^ 1965766182;
                                            i27 = -2412197;
                                        } else {
                                            iM25612 = C2105.m6981("᩸᩸") ^ i24;
                                            i26 = ((iM25612 ^ i25) * 7933) ^ (-135201959);
                                            i27 = 879393158;
                                        }
                                        break;
                                    case -503441948:
                                    case 500951115:
                                        C2958.m9034();
                                        iM25612 = (i25 - C2105.m6981("ۛ᩺")) * (-89);
                                        i26 = ((iM25612 ^ i24) * 27317) ^ (-1832572822);
                                        i27 = 385741906;
                                        break;
                                    case 468933777:
                                    case 1705562684:
                                        C3683.m11222();
                                        if (C0050.m940() <= 0) {
                                            iM25612 = (i24 - C2105.m6981("۫ܿ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                            i26 = ((iM25612 ^ i25) * 9521) ^ (-165255227);
                                            i27 = 1963009391;
                                        } else {
                                            iM25612 = C0630.m2566("֫᩹") ^ i24;
                                            i26 = ((iM25612 ^ i25) * (-28965)) ^ 1738271526;
                                            i27 = 1198247203;
                                        }
                                        break;
                                    case 932741657:
                                    case 1904573334:
                                        if (C0050.m940() <= 0) {
                                            iM25612 = (i25 - C2105.m6981("ۛ᩺")) * (-89);
                                            i26 = ((iM25612 ^ i24) * 27317) ^ (-1832572822);
                                            i27 = 385741906;
                                        } else {
                                            iM25612 = (i25 - C2105.m6981("᩸֡")) * (-5);
                                            i26 = ((iM25612 ^ i24) * (-953)) ^ 1689032862;
                                            i27 = 41751217;
                                        }
                                        break;
                                    case 1009670550:
                                    case 1242287481:
                                        if (C2958.f9394 >= 0) {
                                            iM25612 = C0630.m2566("֫᩹") ^ i24;
                                            i26 = ((iM25612 ^ i25) * (-28965)) ^ 1738271526;
                                            i27 = 1198247203;
                                        } else {
                                            iM25612 = C2105.m6981("ᩴۨ") ^ i24;
                                            i26 = ((iM25612 ^ i25) * (-22385)) ^ 62688795;
                                            i27 = 1936998612;
                                        }
                                        break;
                                    case 1406561670:
                                    case 2079841230:
                                        C1504.m5179();
                                        C3245.m9925();
                                        return null;
                                    case 1681283752:
                                    case 1859770816:
                                        if (C0483.f2088 >= 0) {
                                            iM25612 = (i25 - C2105.m6981("ۛ᩺")) * (-89);
                                            i26 = ((iM25612 ^ i24) * 27317) ^ (-1832572822);
                                            i27 = 385741906;
                                        } else {
                                            iM25612 = (C2105.m6981("ۚܳ") + i25) * (-39);
                                            i26 = ((iM25612 ^ i24) * (-5485)) ^ (-1838247911);
                                            i27 = 60162552;
                                        }
                                        break;
                                    case 1791283833:
                                    case 1924588573:
                                        if (C22628.f73083 > 0) {
                                            iM25612 = C0630.m2566("֫᩹") ^ i24;
                                            i26 = ((iM25612 ^ i25) * (-28965)) ^ 1738271526;
                                            i27 = 1198247203;
                                        } else {
                                            iM25612 = (i25 - C2105.m6981("ۛ᩺")) * (-89);
                                            i26 = ((iM25612 ^ i24) * 27317) ^ (-1832572822);
                                            i27 = 385741906;
                                        }
                                        break;
                                    default:
                                        if (C3663.f11553) {
                                            iM25612 = (C2105.m6981("ۤۛ") ^ i24) * 115;
                                            i26 = ((iM25612 ^ i25) * (-6455)) ^ (-1497630536);
                                            i27 = -1035622309;
                                        } else {
                                            iM25612 = (C2105.m6981("۠۟") ^ i24) * (-93);
                                            i26 = ((iM25612 ^ i25) * 25045) ^ 1058612646;
                                            i27 = -1919452589;
                                        }
                                        break;
                                }
                            }
                        }
                    });
                    C0483.m2125(this);
                    RunnableC3474.m10625(this.f10584, new View.OnClickListener() { // from class: l.ܶᩳ᩷
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i23 = 1151678541;
                            int i24 = C3911.f12484;
                            int i25 = C3245.f10203;
                            int iM25612 = (C0630.m2566("ۡ۫") + i24) * (-91);
                            int i26 = ((iM25612 ^ i25) * (-22121)) ^ 136405715;
                            int i27 = -1401672648;
                            while (true) {
                                i23 = ((((i23 ^ i25) * (-20607)) >> 31) & i26) ^ (iM25612 ^ i27);
                                switch (i23) {
                                    case -2142213595:
                                    case 1082597283:
                                        if (C0714.f2697 >= 0) {
                                            iM25612 = C0630.m2566("ۛܿ") ^ i25;
                                            i26 = ((iM25612 ^ i24) * (-7517)) ^ 1977498220;
                                            i27 = 887264057;
                                        } else {
                                            iM25612 = C2105.m6981("֡ۗ") ^ i25;
                                            i26 = ((iM25612 ^ i24) * (-22207)) ^ 884013357;
                                            i27 = -338421553;
                                        }
                                        break;
                                    case -2133556184:
                                    case 1404090401:
                                        if (RunnableC1108.f4040) {
                                            iM25612 = (C2105.m6981("֡ܰ") + i24) * 59;
                                            i26 = ((iM25612 ^ i25) * (-11641)) ^ 1263386523;
                                            i27 = 786813518;
                                        } else {
                                            iM25612 = (C2105.m6981("ᩳۛ") + i24) * 31;
                                            i26 = ((iM25612 ^ i25) * 31595) ^ (-1194498022);
                                            i27 = -435303278;
                                        }
                                        break;
                                    case -1996581708:
                                    case 1031821520:
                                        int i28 = ActivityC12581.f37925;
                                        if (C3911.f12484 >= 0) {
                                            iM25612 = (C2105.m6981("ۢۗ") ^ i24) * 65;
                                            i26 = ((iM25612 ^ i25) * (-28201)) ^ (-244728913);
                                            i27 = -1826722289;
                                        } else {
                                            iM25612 = C2105.m6981("۟᩵") ^ i25;
                                            i26 = ((iM25612 ^ i24) * 10725) ^ 666760737;
                                            i27 = -2026181909;
                                        }
                                        break;
                                    case -1792385187:
                                    case -172744588:
                                        if (C1916.f6442) {
                                            iM25612 = C2105.m6981("ܳۗ") ^ i25;
                                            i26 = ((iM25612 ^ i24) * (-2951)) ^ 2122864952;
                                            i27 = 1908999757;
                                        } else {
                                            iM25612 = (C2105.m6981("ۢۗ") ^ i24) * 65;
                                            i26 = ((iM25612 ^ i25) * (-28201)) ^ (-244728913);
                                            i27 = -1826722289;
                                        }
                                        break;
                                    case -1613879970:
                                    case 1960912837:
                                        if (!C3663.f11553) {
                                            iM25612 = (C2105.m6981("ᩳۛ") + i24) * 31;
                                            i26 = ((iM25612 ^ i25) * 31595) ^ (-1194498022);
                                            i27 = -435303278;
                                        } else {
                                            iM25612 = (C2105.m6981("᩶᩻") ^ i25) * 43;
                                            i26 = ((iM25612 ^ i24) * (-27131)) ^ (-862897654);
                                            i27 = -639477506;
                                        }
                                        break;
                                    case -1522311691:
                                    case 494938627:
                                        C2272.m7505(this.f47157);
                                        break;
                                    case -1518332379:
                                    case 409367650:
                                        if (C0483.f2088 >= 0) {
                                            iM25612 = (C2105.m6981("ᩳۛ") + i24) * 31;
                                            i26 = ((iM25612 ^ i25) * 31595) ^ (-1194498022);
                                            i27 = -435303278;
                                        } else {
                                            iM25612 = C2105.m6981("᩻ۡ") ^ i25;
                                            i26 = ((iM25612 ^ i24) * 21269) ^ (-601196132);
                                            i27 = 600753065;
                                        }
                                        break;
                                    case -1386417097:
                                    case -911346191:
                                        if (C0422.f1886 <= 0) {
                                            iM25612 = (C2105.m6981("ۢۗ") ^ i24) * 65;
                                            i26 = ((iM25612 ^ i25) * (-28201)) ^ (-244728913);
                                            i27 = -1826722289;
                                        } else {
                                            iM25612 = C0630.m2566("ܺۗ") ^ i24;
                                            i26 = ((iM25612 ^ i25) * (-14421)) ^ 883442523;
                                            i27 = -124808794;
                                        }
                                        break;
                                    case -846446379:
                                    case 510415214:
                                        if (C1773.m5908() <= 0) {
                                            iM25612 = (C2105.m6981("᩶᩻") ^ i25) * 43;
                                            i26 = ((iM25612 ^ i24) * (-27131)) ^ (-862897654);
                                            i27 = -639477506;
                                        } else {
                                            iM25612 = (C0630.m2566("֡ܶ") ^ i24) * 5;
                                            i26 = ((iM25612 ^ i25) * 22531) ^ (-2135125519);
                                            i27 = 2009449044;
                                        }
                                        break;
                                    case -731908046:
                                    case 334001745:
                                        C3746.m11369();
                                        C3245.m9925();
                                        break;
                                    case 28614663:
                                    case 263225548:
                                        if (C1420.m4913()) {
                                            iM25612 = C2105.m6981("᩺֡") ^ i24;
                                            i26 = ((iM25612 ^ i25) * (-10287)) ^ 504851873;
                                            i27 = 2033072428;
                                        } else {
                                            iM25612 = C2105.m6981("᩻ۘ") ^ i24;
                                            i26 = ((iM25612 ^ i25) * 23475) ^ (-833552242);
                                            i27 = -1298748320;
                                        }
                                        break;
                                    case 217902127:
                                    case 1470778872:
                                        if (C3432.m10477() > 0) {
                                            iM25612 = C2105.m6981("᩺֡") ^ i24;
                                            i26 = ((iM25612 ^ i25) * (-10287)) ^ 504851873;
                                            i27 = 2033072428;
                                        } else {
                                            iM25612 = (C2105.m6981("᩶᩻") ^ i25) * 43;
                                            i26 = ((iM25612 ^ i24) * (-27131)) ^ (-862897654);
                                            i27 = -639477506;
                                        }
                                        break;
                                    case 325294065:
                                    case 916153465:
                                        if (C7811.f24123 < 0) {
                                            iM25612 = C0630.m2566("ۛܿ") ^ i25;
                                            i26 = ((iM25612 ^ i24) * (-7517)) ^ 1977498220;
                                            i27 = 887264057;
                                        } else {
                                            iM25612 = (C2105.m6981("ᩳۛ") + i24) * 31;
                                            i26 = ((iM25612 ^ i25) * 31595) ^ (-1194498022);
                                            i27 = -435303278;
                                        }
                                        break;
                                    case 379261077:
                                    case 1817115698:
                                        C2167.m7155();
                                        C3911.m11924();
                                        iM25612 = (C2105.m6981("ᩳۛ") + i24) * 31;
                                        i26 = ((iM25612 ^ i25) * 31595) ^ (-1194498022);
                                        i27 = -435303278;
                                        break;
                                    case 1417064904:
                                    case 1758508038:
                                        if (C3911.f12484 >= 0) {
                                            iM25612 = C0630.m2566("ۛܿ") ^ i25;
                                            i26 = ((iM25612 ^ i24) * (-7517)) ^ 1977498220;
                                            i27 = 887264057;
                                        } else {
                                            iM25612 = (C2105.m6981("ۙ֫") + i25) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i26 = ((iM25612 ^ i24) * (-17925)) ^ (-407775888);
                                            i27 = -1282038222;
                                        }
                                        break;
                                    default:
                                        if (C1504.f5354) {
                                            iM25612 = (C2105.m6981("ۢۗ") ^ i24) * 65;
                                            i26 = ((iM25612 ^ i25) * (-28201)) ^ (-244728913);
                                            i27 = -1826722289;
                                        } else {
                                            iM25612 = C0630.m2566("᩵ۛ") ^ i24;
                                            i26 = ((iM25612 ^ i25) * 9441) ^ (-318402177);
                                            i27 = -614447677;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    intentM7034 = C2126.m7034(this);
                    data = intentM7034.getData();
                    if (data != null) {
                        iM2568 = (C2105.m6981("᩵ۜ") + i11) * 83;
                        i9 = ((iM2568 ^ i12) * 14729) ^ 1534728461;
                        i10 = 1579886877;
                    } else {
                        iM2568 = C2105.m6981("ۙᩴ") ^ i12;
                        i9 = ((iM2568 ^ i11) * (-24993)) ^ 535399859;
                        i10 = -1586634043;
                    }
                    int i23 = iM2568 ^ i10;
                    viewFindViewById = view;
                    drawable = drawable2;
                    i14 = i23;
                    i13 = i9;
                    drawable2 = drawable;
                    break;
                case -1824769024:
                case -820053698:
                    RunnableC0588.m2441();
                    C1711.m5736();
                    break;
                case -1726256729:
                case 810966587:
                    drawable2 = drawable2;
                    this.f37940 = (TextView) C0964.m3409(this, C2105.m6981(C1128.m3841(sArr2, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 3, i16)) ^ 2099052601);
                    if (C11340.f33930 >= 0) {
                        iM6981 = (i12 - C0630.m2566("᩵ۧ")) * (-109);
                        i = ((iM6981 ^ i11) * (-11999)) ^ 237718939;
                        i2 = 1671133876;
                    } else {
                        iM6981 = (C0630.m2566("۬۬") + i11) * 85;
                        i = ((iM6981 ^ i12) * 14873) ^ (-1320600260);
                        i2 = 910442989;
                    }
                    int i24 = iM6981 ^ i2;
                    drawable2 = drawable2;
                    i14 = i24;
                    i13 = i;
                    break;
                case -1683275623:
                case 1289481112:
                    drawable2 = drawable2;
                    z2 = false;
                    C4948.m14388(windowM19115, false);
                    windowM19115.setStatusBarColor(0);
                    viewFindViewById = findViewById(C2105.m6981(C2167.m7159(f37926, 80, 3, i16)) ^ 2097395504);
                    if (RunnableC3474.f10992 <= 0) {
                        iM6981 = (i12 - C0630.m2566("᩵ۧ")) * (-109);
                        i = ((iM6981 ^ i11) * (-11999)) ^ 237718939;
                        i2 = 1671133876;
                    } else {
                        iM6981 = (i11 - C2105.m6981("ۘۡ")) * (-37);
                        i = ((iM6981 ^ i12) * 18827) ^ 2073414849;
                        i2 = -1085700034;
                    }
                    int i25 = iM6981 ^ i2;
                    drawable2 = drawable2;
                    i14 = i25;
                    i13 = i;
                    break;
                case -1598349929:
                case 636774073:
                    C3911.m11924();
                    if (C0050.f910 < 0) {
                        drawable2 = drawable2;
                        i20 = i20;
                        viewFindViewById = viewFindViewById;
                        sArr2 = sArr2;
                        windowM19115 = windowM19115;
                        iM2567 = C0630.m2566("᩷֫") ^ i12;
                        i4 = ((iM2567 ^ i11) * 11115) ^ 433622753;
                        i5 = -179355775;
                        i6 = iM2567 ^ i5;
                        windowM19115 = windowM19115;
                        viewFindViewById = viewFindViewById;
                        drawable = drawable2;
                        i14 = i6;
                        i13 = i4;
                        sArr2 = sArr2;
                        i20 = i20;
                        drawable2 = drawable;
                    } else {
                        iM2566 = (C0630.m2566("۫᩹") + i11) * (-39);
                        i = ((iM2566 ^ i12) * 6519) ^ 1565667314;
                        i3 = 114767066;
                        i14 = iM2566 ^ i3;
                        i13 = i;
                    }
                    break;
                case -1509760839:
                case 858433851:
                    RunnableC1108.m3781(this);
                    break;
                case -1347531348:
                case 1068333451:
                    drawable2 = drawable2;
                    this.f37937 = (TextView) C4263.m12813(this, iM6983 ^ i18);
                    this.f37934 = (TextView) C0964.m3409(this, C0630.m2566(RunnableC1108.m3789(f37926, 133, 3, i16)) ^ 2127576031);
                    this.f37940.setTextIsSelectable(z);
                    this.f37939.setTextIsSelectable(z);
                    this.f37938.setTextIsSelectable(z);
                    if (C0237.f1507 != 0) {
                        iM6981 = (C2105.m6981("ᩳ᩺") + i11) * 75;
                        i = ((iM6981 ^ i12) * (-13151)) ^ 329919628;
                        i2 = -766419297;
                    } else {
                        iM6981 = C0630.m2566("᩺᩺") ^ i11;
                        i = ((iM6981 ^ i12) * o.a.p) ^ 1301643749;
                        i2 = -495724786;
                    }
                    int i26 = iM6981 ^ i2;
                    drawable2 = drawable2;
                    i14 = i26;
                    i13 = i;
                    break;
                case -1334135983:
                case 849160607:
                    this.f37930 = data.getHost();
                    this.f37927 = z;
                    iM6981 = (i11 - C0630.m2566("ܿᩳ")) * (-43);
                    i = ((iM6981 ^ i12) * (-14609)) ^ 316296200;
                    i2 = -631481992;
                    int i27 = iM6981 ^ i2;
                    drawable2 = drawable2;
                    i14 = i27;
                    i13 = i;
                    break;
                case -1198545686:
                case 693394755:
                    drawable2 = drawable2;
                    str = this.f37930;
                    if (str != null) {
                        iM6981 = C2105.m6981("֡᩺") ^ i12;
                        i = ((iM6981 ^ i11) * (-12857)) ^ 377969505;
                        i2 = -1224606218;
                    } else {
                        iM6981 = (C0630.m2566("ܰ᩸") + i11) * 11;
                        i = ((iM6981 ^ i12) * 19341) ^ 518723627;
                        i2 = 1676060898;
                    }
                    int i28 = iM6981 ^ i2;
                    drawable2 = drawable2;
                    i14 = i28;
                    i13 = i;
                    break;
                case -1055929549:
                case -308991049:
                    drawable2 = drawable2;
                    i20 = i20;
                    viewFindViewById = viewFindViewById;
                    sArr2 = sArr2;
                    windowM19115 = windowM19115;
                    short s = f37926[70];
                    int i29 = s + 1;
                    if (((s * 2) + 1) - (i29 * i29) > 0) {
                        iM2567 = C0630.m2566("᩷ۛ") ^ i12;
                        i4 = ((iM2567 ^ i11) * (-563)) ^ 1742514254;
                        i5 = -1937526696;
                    } else {
                        iM2567 = C0630.m2566("۟᩵") ^ i11;
                        i4 = ((iM2567 ^ i12) * (-21415)) ^ (-963455580);
                        i5 = 1271021224;
                    }
                    i6 = iM2567 ^ i5;
                    windowM19115 = windowM19115;
                    viewFindViewById = viewFindViewById;
                    drawable = drawable2;
                    i14 = i6;
                    i13 = i4;
                    sArr2 = sArr2;
                    i20 = i20;
                    drawable2 = drawable;
                    break;
                case -942595347:
                case -255409372:
                    drawable2 = drawable2;
                    i20 = i20;
                    viewFindViewById = viewFindViewById;
                    sArr2 = sArr2;
                    super.onCreate(bundle);
                    m10214();
                    windowM19115 = windowM19115;
                    C4263.m12813(this, C0630.m2566(C1128.m3841(f37926, 71, 3, i16)) ^ 2130340118);
                    setTitle((CharSequence) null);
                    iM6985 = C2105.m6981(RunnableC1937.m6385(f37926, 74, 3, i16));
                    i17 = 2097535453;
                    if (C2958.f9394 >= 0) {
                        iM2567 = C0630.m2566("᩷֫") ^ i12;
                        i4 = ((iM2567 ^ i11) * 11115) ^ 433622753;
                        i5 = -179355775;
                    } else {
                        iM2567 = (C0630.m2566("ܿۙ") + i11) * 31;
                        i4 = ((iM2567 ^ i12) * (-21569)) ^ 774362352;
                        i5 = 57316415;
                    }
                    i6 = iM2567 ^ i5;
                    windowM19115 = windowM19115;
                    viewFindViewById = viewFindViewById;
                    drawable = drawable2;
                    i14 = i6;
                    i13 = i4;
                    sArr2 = sArr2;
                    i20 = i20;
                    drawable2 = drawable;
                    break;
                case -895351245:
                case 185500638:
                    drawable2 = drawable2;
                    this.f37931 = (TextView) viewM12813;
                    this.f37928 = (TextView) C0964.m3409(this, C0630.m2566(C21923.m49334(f37926, 127, 3, i16)) ^ 2102310987);
                    iM6983 = C2105.m6981(C7106.m19110(f37926, 130, 3, i16));
                    i18 = 2120229057;
                    if (C1005.f3721) {
                        iM6981 = (C0630.m2566("ᩴۢ") + i12) * 61;
                        i = ((iM6981 ^ i11) * (-25125)) ^ (-1270344444);
                        i2 = -391738602;
                    } else {
                        iM6981 = (i12 - C2105.m6981("֡ۡ")) * (-89);
                        i = ((iM6981 ^ i11) * (-9251)) ^ 2027318617;
                        i2 = 213535729;
                    }
                    int i210 = iM6981 ^ i2;
                    drawable2 = drawable2;
                    i14 = i210;
                    i13 = i;
                    break;
                case -873667347:
                case 1007710092:
                    drawable2 = drawable2;
                    view = viewFindViewById;
                    decorView = C1916.m6300(this).getDecorView();
                    int systemUiVisibility = decorView.getSystemUiVisibility();
                    i15 = systemUiVisibility & (-8193);
                    if (systemUiVisibility == i15) {
                        sArr = sArr2;
                        iM6982 = C2105.m6981("᩹᩷") ^ i11;
                        i7 = ((iM6982 ^ i12) * (-6951)) ^ 1351075215;
                        i8 = 741870720;
                        int i211 = iM6982 ^ i8;
                        viewFindViewById = view;
                        short[] sArr4 = sArr;
                        i20 = i20;
                        i13 = i7;
                        drawable2 = drawable2;
                        i14 = i211;
                        sArr2 = sArr4;
                    } else {
                        iM2568 = (i11 - C0630.m2566("ۜۢ")) * (-9);
                        i9 = ((iM2568 ^ i12) * 13219) ^ (-96471881);
                        i10 = 1957026575;
                        int i212 = iM2568 ^ i10;
                        viewFindViewById = view;
                        drawable = drawable2;
                        i14 = i212;
                        i13 = i9;
                        drawable2 = drawable;
                    }
                    break;
                case -862843917:
                case 552952858:
                    RunnableC1108.m3790();
                    drawable2 = drawable2;
                    iM6981 = (C0630.m2566("᩵ۡ") + i12) * (-5);
                    i = ((iM6981 ^ i11) * (-10821)) ^ (-1763588785);
                    i2 = -1968630242;
                    int i213 = iM6981 ^ i2;
                    drawable2 = drawable2;
                    i14 = i213;
                    i13 = i;
                    break;
                case -757296613:
                case 829619829:
                    this.f37936 = C0964.m3409(this, iM6984 ^ i19);
                    C3746.m11360(C4263.m12813(this, C2105.m6981(RunnableC0588.m2436(f37926, 145, 3, i16)) ^ 2125975395), 4);
                    drawable2 = (Drawable) C2956.m9013(C2958.m9031(f37926, 148, 11, i16));
                    if (drawable2 != null) {
                        iM2566 = C0630.m2566("ۖۚ") ^ i11;
                        i = ((iM2566 ^ i12) * (-27315)) ^ (-474330159);
                        i3 = 661747215;
                    } else {
                        iM2566 = (C0630.m2566("ۗ۠") ^ i12) * 119;
                        i = ((iM2566 ^ i11) * 27267) ^ 52110409;
                        i3 = -2051768359;
                    }
                    i14 = iM2566 ^ i3;
                    i13 = i;
                    break;
                case -756116174:
                case 1769992093:
                    drawable2 = drawable2;
                    this.f37939 = (TextView) C4263.m12813(this, C2105.m6981(C2126.m7036(f37926, 115, 3, i16)) ^ 2130198018);
                    button = (Button) C4263.m12813(this, C2105.m6981(RunnableC1108.m3789(f37926, 118, 3, i16)) ^ 2121273691);
                    if (C0483.f2088 >= 0) {
                        iM6981 = (C0630.m2566("᩵ۡ") + i12) * (-5);
                        i = ((iM6981 ^ i11) * (-10821)) ^ (-1763588785);
                        i2 = -1968630242;
                    } else {
                        iM6981 = (C2105.m6981("ܽۡ") ^ i12) * (-13);
                        i = ((iM6981 ^ i11) * (-19511)) ^ (-1022277596);
                        i2 = -1766840646;
                    }
                    int i214 = iM6981 ^ i2;
                    drawable2 = drawable2;
                    i14 = i214;
                    i13 = i;
                    break;
                case -681959489:
                case -325681170:
                    drawable2 = drawable2;
                    WindowManager.LayoutParams attributes = windowM19115.getAttributes();
                    attributes.layoutInDisplayCutoutMode = z ? 1 : 0;
                    windowM19115.setAttributes(attributes);
                    i20 = i20;
                    viewFindViewById = viewFindViewById;
                    int iM25612 = (i12 - C0630.m2566("ܳۖ")) * 59;
                    sArr2 = sArr2;
                    i4 = ((iM25612 ^ i11) * 7755) ^ (-1158982631);
                    i6 = iM25612 ^ 1646183219;
                    viewFindViewById = viewFindViewById;
                    drawable = drawable2;
                    i14 = i6;
                    i13 = i4;
                    sArr2 = sArr2;
                    i20 = i20;
                    drawable2 = drawable;
                    break;
                case -678933319:
                case 1132798984:
                    drawable2 = drawable2;
                    this.f37932 = (ImageView) C4263.m12813(this, C0630.m2566(C2167.m7159(f37926, 109, 3, i16)) ^ 2102840153);
                    sArr2 = f37926;
                    if (C3746.f11829 <= 0) {
                        iM6981 = (C2105.m6981("ᩳ᩺") + i11) * 75;
                        i = ((iM6981 ^ i12) * (-13151)) ^ 329919628;
                        i2 = -766419297;
                    } else {
                        iM6981 = C2105.m6981("֡ۗ") ^ i11;
                        i = ((iM6981 ^ i12) * (-10855)) ^ 531040741;
                        i2 = 95808910;
                    }
                    int i215 = iM6981 ^ i2;
                    drawable2 = drawable2;
                    i14 = i215;
                    i13 = i;
                    break;
                case -678191443:
                case -638455909:
                    this.f37931.setTextIsSelectable(z);
                    this.f37934.setTextIsSelectable(z);
                    C14624.m34922(this.f10584).setImageTintList(this.f37940.getTextColors());
                    drawable2 = drawable2;
                    View viewM3409 = C0964.m3409(this, C0630.m2566(AbstractC2021.m6573(f37926, 136, 3, i16)) ^ 2100949162);
                    if (C11340.f33930 >= 0) {
                        iM6981 = (C0630.m2566("᩵ۡ") + i12) * (-5);
                        i = ((iM6981 ^ i11) * (-10821)) ^ (-1763588785);
                        i2 = -1968630242;
                    } else {
                        C2126.m7039(viewM3409, new ViewOnClickListenerC9841(5, this));
                        this.f37935 = (TextView) C0964.m3409(this, C0630.m2566(C5695.m16034(f37926, 139, 3, i16)) ^ 2118171461);
                        iM6984 = C2105.m6981(C2126.m7036(f37926, 142, 3, i16));
                        i19 = 2123302369;
                        if (C4616.f14690 <= 0) {
                            iM6981 = (C2105.m6981("ᩳ᩺") + i11) * 75;
                            i = ((iM6981 ^ i12) * (-13151)) ^ 329919628;
                            i2 = -766419297;
                        } else {
                            iM6981 = C0630.m2566("᩸ۘ") ^ i12;
                            i = ((iM6981 ^ i11) * (-23797)) ^ (-66512557);
                            i2 = -1160442559;
                        }
                    }
                    int i216 = iM6981 ^ i2;
                    drawable2 = drawable2;
                    i14 = i216;
                    i13 = i;
                    break;
                case -640874293:
                case 92194121:
                    if (C3746.f11829 > 0) {
                        iM2566 = (i11 - C2105.m6981("ۙ֡")) * (-93);
                        i = ((iM2566 ^ i12) * 10763) ^ 251366553;
                        i3 = -865159866;
                        i14 = iM2566 ^ i3;
                        i13 = i;
                    }
                    drawable2 = drawable2;
                    iM6981 = (i12 - C0630.m2566("᩵ۧ")) * (-109);
                    i = ((iM6981 ^ i11) * (-11999)) ^ 237718939;
                    i2 = 1671133876;
                    int i217 = iM6981 ^ i2;
                    drawable2 = drawable2;
                    i14 = i217;
                    i13 = i;
                    break;
                case -388564328:
                case 1017511259:
                    drawable2 = drawable2;
                    if (C1916.m6313(str)) {
                        iM6981 = (C0630.m2566("ܰ᩸") + i11) * 11;
                        i = ((iM6981 ^ i12) * 19341) ^ 518723627;
                        i2 = 1676060898;
                    } else {
                        iM6981 = (C0630.m2566("ܺۢ") ^ i12) * (-103);
                        i = ((iM6981 ^ i11) * 28163) ^ 367909004;
                        i2 = -1821108652;
                    }
                    int i218 = iM6981 ^ i2;
                    drawable2 = drawable2;
                    i14 = i218;
                    i13 = i;
                    break;
                case -290459247:
                case 119817032:
                    i16 = 41773;
                    iM2567 = (i12 - C0630.m2566("᩸᩺")) * 47;
                    i4 = ((iM2567 ^ i11) * 8279) ^ 132796738;
                    i5 = 1382253866;
                    i6 = iM2567 ^ i5;
                    windowM19115 = windowM19115;
                    viewFindViewById = viewFindViewById;
                    drawable = drawable2;
                    i14 = i6;
                    i13 = i4;
                    sArr2 = sArr2;
                    i20 = i20;
                    drawable2 = drawable;
                    break;
                case -273833902:
                case 1353358444:
                    if (!RunnableC1108.f4040) {
                        drawable2 = drawable2;
                        iM6981 = (C2105.m6981("ᩳ᩺") + i11) * 75;
                        i = ((iM6981 ^ i12) * (-13151)) ^ 329919628;
                        i2 = -766419297;
                        int i219 = iM6981 ^ i2;
                        drawable2 = drawable2;
                        i14 = i219;
                        i13 = i;
                    }
                    drawable2 = drawable2;
                    iM6981 = (C0630.m2566("᩵ۡ") + i12) * (-5);
                    i = ((iM6981 ^ i11) * (-10821)) ^ (-1763588785);
                    i2 = -1968630242;
                    int i2110 = iM6981 ^ i2;
                    drawable2 = drawable2;
                    i14 = i2110;
                    i13 = i;
                    break;
                case -234165755:
                case 2115615370:
                    drawable2 = drawable2;
                    this.f37941 = button;
                    this.f37938 = (TextView) C4263.m12813(this, C2105.m6981(AbstractC2021.m6573(f37926, UMErrorCode.E_UM_BE_EMPTY_URL_PATH, 3, i16)) ^ 2104377899);
                    viewM12813 = C4263.m12813(this, C0630.m2566(C3245.m9934(f37926, 124, 3, i16)) ^ 2129048947);
                    if (C3663.f11553) {
                        iM6981 = (i12 - C0630.m2566("᩵ۧ")) * (-109);
                        i = ((iM6981 ^ i11) * (-11999)) ^ 237718939;
                        i2 = 1671133876;
                    } else {
                        iM6981 = (C0630.m2566("ۜۨ") ^ i11) * (-109);
                        i = ((iM6981 ^ i12) * (-26553)) ^ 563238002;
                        i2 = 116667491;
                    }
                    int i2111 = iM6981 ^ i2;
                    drawable2 = drawable2;
                    i14 = i2111;
                    i13 = i;
                    break;
                case 311601704:
                case 1962800238:
                    this.f37932.setImageDrawable(drawable2);
                    iM2566 = (C0630.m2566("ۗ۠") ^ i12) * 119;
                    i = ((iM2566 ^ i11) * 27267) ^ 52110409;
                    i3 = -2051768359;
                    i14 = iM2566 ^ i3;
                    i13 = i;
                    break;
                case 405512753:
                case 1115490183:
                    break;
                case 592297518:
                case 1873388212:
                    drawable2 = drawable2;
                    decorView.setSystemUiVisibility(i15);
                    view = viewFindViewById;
                    sArr = sArr2;
                    iM6982 = C2105.m6981("᩹᩷") ^ i11;
                    i7 = ((iM6982 ^ i12) * (-6951)) ^ 1351075215;
                    i8 = 741870720;
                    int i2112 = iM6982 ^ i8;
                    viewFindViewById = view;
                    short[] sArr5 = sArr;
                    i20 = i20;
                    i13 = i7;
                    drawable2 = drawable2;
                    i14 = i2112;
                    sArr2 = sArr5;
                    break;
                case 663517123:
                case 746989332:
                    drawable2 = drawable2;
                    if (!C1294.m4369(C1005.m3502(f37926, 101, 8, i16), data.getScheme())) {
                        view = viewFindViewById;
                        iM2568 = C2105.m6981("ۙᩴ") ^ i12;
                        i9 = ((iM2568 ^ i11) * (-24993)) ^ 535399859;
                        i10 = -1586634043;
                        int i2113 = iM2568 ^ i10;
                        viewFindViewById = view;
                        drawable = drawable2;
                        i14 = i2113;
                        i13 = i9;
                        drawable2 = drawable;
                    } else {
                        iM6981 = C2105.m6981("ۙۡ") ^ i12;
                        i = ((iM6981 ^ i11) * (-30389)) ^ 824309339;
                        i2 = -1187431709;
                        int i2114 = iM6981 ^ i2;
                        drawable2 = drawable2;
                        i14 = i2114;
                        i13 = i;
                    }
                    break;
                case 717866026:
                case 1459619309:
                    this.f37930 = AbstractC2021.m6570(intentM7034, C0630.m2575(f37926, 83, 8, i16));
                    this.f37927 = intentM7034.getBooleanExtra(C0483.m2128(f37926, 91, 10, i16), z2);
                    iM6981 = (i11 - C0630.m2566("ܿᩳ")) * (-43);
                    i = ((iM6981 ^ i12) * (-14609)) ^ 316296200;
                    i2 = -631481992;
                    int i2115 = iM6981 ^ i2;
                    drawable2 = drawable2;
                    i14 = i2115;
                    i13 = i;
                    break;
                case 904793059:
                case 1827719682:
                    m30821(this.f37932, this.f37941, this.f37942);
                    C0964.m3402(new C20343(this));
                    C4159.m12564(this.f37935, new ViewOnClickListenerC21754(this, 0));
                    break;
                case 1152177463:
                case 2135892701:
                    if (RunnableC1937.m6387() == 0) {
                        iM2566 = C2105.m6981("֫۟") ^ i11;
                        i = ((iM2566 ^ i12) * (-1481)) ^ (-398839801);
                        i3 = 815625534;
                        i14 = iM2566 ^ i3;
                        i13 = i;
                    }
                    drawable2 = drawable2;
                    iM6981 = (i12 - C0630.m2566("᩵ۧ")) * (-109);
                    i = ((iM6981 ^ i11) * (-11999)) ^ 237718939;
                    i2 = 1671133876;
                    int i2116 = iM6981 ^ i2;
                    drawable2 = drawable2;
                    i14 = i2116;
                    i13 = i;
                    break;
                case 1997826688:
                case 2116147005:
                    i16 = 61357;
                    iM2567 = (i12 - C0630.m2566("᩸᩺")) * 47;
                    i4 = ((iM2567 ^ i11) * 8279) ^ 132796738;
                    i5 = 1382253866;
                    i6 = iM2567 ^ i5;
                    windowM19115 = windowM19115;
                    viewFindViewById = viewFindViewById;
                    drawable = drawable2;
                    i14 = i6;
                    i13 = i4;
                    sArr2 = sArr2;
                    i20 = i20;
                    drawable2 = drawable;
                    break;
                default:
                    C3432.m10477();
                    break;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:44:0x0150 A[PHI: r3 r4 r5 r11 r12
      0x0150: PHI (r3v4 android.widget.Button) = 
      (r3v3 android.widget.Button)
      (r3v1 android.widget.Button)
      (r3v1 android.widget.Button)
      (r3v1 android.widget.Button)
      (r3v1 android.widget.Button)
     binds: [B:43:0x014e, B:33:0x00fa, B:19:0x0084, B:122:0x0150, B:13:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0150: PHI (r4v4 android.widget.Button) = 
      (r4v1 android.widget.Button)
      (r4v3 android.widget.Button)
      (r4v1 android.widget.Button)
      (r4v1 android.widget.Button)
      (r4v1 android.widget.Button)
     binds: [B:43:0x014e, B:33:0x00fa, B:19:0x0084, B:122:0x0150, B:13:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0150: PHI (r5v3 int) = (r5v1 int), (r5v2 int), (r5v1 int), (r5v1 int), (r5v1 int) binds: [B:43:0x014e, B:33:0x00fa, B:19:0x0084, B:122:0x0150, B:13:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0150: PHI (r11v4 short[]) = (r11v3 short[]), (r11v2 short[]), (r11v2 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:43:0x014e, B:33:0x00fa, B:19:0x0084, B:122:0x0150, B:13:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0150: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:43:0x014e, B:33:0x00fa, B:19:0x0084, B:122:0x0150, B:13:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x01ba A[PHI: r2 r15 r25
      0x01ba: PHI (r2v45 android.widget.Button) = (r2v39 android.widget.Button), (r2v1 android.widget.Button), (r2v1 android.widget.Button) binds: [B:53:0x01b8, B:13:0x0074, B:121:0x01ba] A[DONT_GENERATE, DONT_INLINE]
      0x01ba: PHI (r15v4 short[]) = (r15v2 short[]), (r15v1 short[]), (r15v1 short[]) binds: [B:53:0x01b8, B:13:0x0074, B:121:0x01ba] A[DONT_GENERATE, DONT_INLINE]
      0x01ba: PHI (r25v26 int) = (r25v24 int), (r25v3 int), (r25v3 int) binds: [B:53:0x01b8, B:13:0x0074, B:121:0x01ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x029c A[PHI: r10 r23 r24
      0x029c: PHI (r10v16 int) = (r10v14 int), (r10v17 int) binds: [B:67:0x0283, B:58:0x01f8] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r23v16 android.widget.Button) = (r23v14 android.widget.Button), (r23v17 android.widget.Button) binds: [B:67:0x0283, B:58:0x01f8] A[DONT_GENERATE, DONT_INLINE]
      0x029c: PHI (r24v3 l.ܽܳ᩷) = (r24v2 l.ܽܳ᩷), (r24v1 l.ܽܳ᩷) binds: [B:67:0x0283, B:58:0x01f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void m30835() {
        int iM2566;
        int i;
        int i2;
        int iM2567;
        int i3;
        int i4;
        Button button;
        short s;
        int iM2568;
        int i5;
        int iM2569;
        int i6;
        int i7;
        ActivityC12581 activityC12581 = this;
        Button button2 = null;
        Button button3 = null;
        Button button4 = null;
        int i8 = 0;
        Button button5 = null;
        String strM1955 = null;
        String strM49334 = null;
        int iM6981 = 0;
        int i9 = 0;
        short[] sArr = null;
        int i10 = 2072682010;
        int i11 = C3683.f11629;
        int i12 = C0483.f2088;
        int iM25610 = (i12 - C0630.m2566("ۘᩳ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
        int i13 = ((iM25610 ^ i11) * 24453) ^ (-678152756);
        int i14 = iM25610 ^ 316398975;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i15 = 0;
        char c = 0;
        short s2 = 0;
        short s3 = 0;
        C16709 c16709M32219 = null;
        int i16 = 0;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i11) * (-22245)) >> 31));
            switch (i10) {
                case -2048747259:
                case 582137952:
                    RunnableC1937.m6387();
                    iM2566 = C2105.m6981("ܽۜ") ^ i12;
                    i = ((iM2566 ^ i11) * (-12509)) ^ (-270868504);
                    i2 = -1723486911;
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    break;
                case -2047591026:
                case 991232470:
                    button2 = activityC12581.f37941;
                    sArr = f37926;
                    i16 = 57;
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = (C2105.m6981("ۗ᩸") ^ i11) * (-47);
                        i = ((iM2566 ^ i12) * (-7897)) ^ (-1031834723);
                        i2 = -1768952287;
                    } else {
                        iM2566 = C0630.m2566("᩻۬") ^ i11;
                        i = ((iM2566 ^ i12) * 31687) ^ (-670062003);
                        i2 = -1560067870;
                    }
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    break;
                case -1918786291:
                case 145233849:
                    if (!C2272.f7362) {
                        button = button2;
                        i16 = i16;
                        iM2569 = C2105.m6981("۟ܶ") ^ i11;
                        i13 = ((iM2569 ^ i12) * (-19101)) ^ 419487886;
                        i6 = -701127238;
                        i7 = iM2569 ^ i6;
                        i16 = i16;
                        button2 = button;
                        i14 = i7;
                        activityC12581 = this;
                    } else {
                        iM2566 = C2105.m6981("ܽۜ") ^ i12;
                        i = ((iM2566 ^ i11) * (-12509)) ^ (-270868504);
                        i2 = -1723486911;
                        i14 = iM2566 ^ i2;
                        i13 = i;
                    }
                    break;
                case -1891705284:
                case -1419202223:
                    C2105.m6978(button5, 2099088798 ^ iM6981);
                    break;
                case -1702039038:
                case 768653844:
                    if (C22628.f73083 > 0) {
                        iM2566 = C2105.m6981("ܽۜ") ^ i12;
                        i = ((iM2566 ^ i11) * (-12509)) ^ (-270868504);
                        i2 = -1723486911;
                    } else {
                        iM2566 = (C2105.m6981("ۗ᩸") ^ i11) * (-47);
                        i = ((iM2566 ^ i12) * (-7897)) ^ (-1031834723);
                        i2 = -1768952287;
                    }
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    break;
                case -1691295051:
                case -453359412:
                    strM49334 = C21923.m49334(sArr3, i15, 3, i9);
                    if (!C0422.m1963()) {
                        button = button2;
                        s = s2;
                        i16 = i16;
                        iM2568 = C0630.m2566("ܰ᩵") ^ i12;
                        i13 = ((iM2568 ^ i11) * (-13489)) ^ (-611780653);
                        i5 = -218950318;
                        i7 = iM2568 ^ i5;
                        s2 = s;
                        i16 = i16;
                        button2 = button;
                        i14 = i7;
                        activityC12581 = this;
                    } else {
                        iM2566 = C0630.m2566("ۤܶ") ^ i11;
                        i = ((iM2566 ^ i12) * (-11899)) ^ 807903790;
                        i2 = -345468731;
                        i14 = iM2566 ^ i2;
                        i13 = i;
                    }
                    break;
                case -1584089180:
                case 19057141:
                    iM6981 = C2105.m6981(C2105.m6988(sArr4, 63, 3, i9));
                    if (C3019.m9255() > 0) {
                        iM2566 = (C0630.m2566("ܿ۬") + i11) * (-105);
                        i = ((iM2566 ^ i12) * (-10455)) ^ (-909587632);
                        i2 = 412798375;
                        i14 = iM2566 ^ i2;
                        i13 = i;
                    } else {
                        button2 = button2;
                        i16 = i16;
                        iM2567 = (C2105.m6981("ۜ᩸") ^ i11) * (-95);
                        i3 = ((iM2567 ^ i12) * (-2809)) ^ (-1311910623);
                        i4 = -1090083106;
                        int i17 = iM2567 ^ i4;
                        i16 = i16;
                        Button button6 = button2;
                        i14 = i17;
                        i13 = i3;
                        button2 = button6;
                    }
                    break;
                case -1388102152:
                case 535793146:
                    C2105.m6978(button3, C0630.m2566(strM49334) ^ 2097840028);
                    break;
                case -1140911587:
                case -747958628:
                    i9 = 38930;
                    iM2567 = (C0630.m2566("ᩳ᩻") + i12) * 19;
                    i3 = ((iM2567 ^ i11) * (-19901)) ^ 1961432152;
                    i4 = -759412379;
                    int i18 = iM2567 ^ i4;
                    i16 = i16;
                    Button button7 = button2;
                    i14 = i18;
                    i13 = i3;
                    button2 = button7;
                    break;
                case -1036587959:
                case -985965141:
                    C22628.m50613(activityC12581.f37941, false);
                    button4 = activityC12581.f37941;
                    i8 = -855638017;
                    if (C3245.m9925() != 0) {
                        iM2566 = C2105.m6981("ܽۜ") ^ i12;
                        i = ((iM2566 ^ i11) * (-12509)) ^ (-270868504);
                        i2 = -1723486911;
                    } else {
                        iM2566 = (C2105.m6981("۟᩻") + i11) * (-17);
                        i = ((iM2566 ^ i12) * 30375) ^ (-953239733);
                        i2 = 823746091;
                    }
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    break;
                case -934197241:
                case -787538258:
                    button2 = button2;
                    i16 = i16;
                    if (c16709M32219.m39320() >= activityC12581.f37929.m44017()) {
                        iM2567 = C0630.m2566("֡ۙ") ^ i12;
                        i3 = ((iM2567 ^ i11) * 24115) ^ (-243527776);
                        i4 = 437829360;
                    } else {
                        iM2567 = (i11 - C2105.m6981("ۨᩳ")) * (-65);
                        i3 = ((iM2567 ^ i12) * (-16863)) ^ (-1439542534);
                        i4 = -286610045;
                    }
                    int i19 = iM2567 ^ i4;
                    i16 = i16;
                    Button button8 = button2;
                    i14 = i19;
                    i13 = i3;
                    button2 = button8;
                    break;
                case -917587048:
                case 1566734996:
                    button2 = button2;
                    i16 = i16;
                    c16709M32219 = C13265.m32219(activityC12581.f37930);
                    if (c16709M32219 != null) {
                        iM2567 = (C0630.m2566("۟ۤ") + i11) * (-11);
                        i3 = ((iM2567 ^ i12) * (-16009)) ^ 1486951702;
                        i4 = -1355929260;
                    } else {
                        iM2567 = (i11 - C2105.m6981("ۨᩳ")) * (-65);
                        i3 = ((iM2567 ^ i12) * (-16863)) ^ (-1439542534);
                        i4 = -286610045;
                    }
                    int i110 = iM2567 ^ i4;
                    i16 = i16;
                    Button button9 = button2;
                    i14 = i110;
                    i13 = i3;
                    button2 = button9;
                    break;
                case -900109418:
                case -157936443:
                    button = button2;
                    i16 = i16;
                    s2 = sArr2[c];
                    s3 = 6166;
                    if (C0630.f2410 <= 0) {
                        iM2569 = C2105.m6981("۟ܶ") ^ i11;
                        i13 = ((iM2569 ^ i12) * (-19101)) ^ 419487886;
                        i6 = -701127238;
                    } else {
                        iM2569 = C0630.m2566("ܽ֨") ^ i11;
                        i13 = ((iM2569 ^ i12) * (-30281)) ^ (-631565028);
                        i6 = -2100717016;
                    }
                    i7 = iM2569 ^ i6;
                    i16 = i16;
                    button2 = button;
                    i14 = i7;
                    activityC12581 = this;
                    break;
                case -731928570:
                case 1181097085:
                    C3683.m11222();
                    C3537.m10746();
                    break;
                case -649564806:
                case 722650000:
                    C0630.m2570(button2, C2105.m6981(strM1955) ^ 2122232870);
                    break;
                case -258918038:
                case 1468512990:
                    i16 = i16;
                    strM1955 = C0422.m1955(sArr, i16, 3, i9);
                    if (C3019.f9544 < 0) {
                        iM2567 = (C0630.m2566("ۢۨ") + i12) * 91;
                        button2 = button2;
                        i3 = ((iM2567 ^ i11) * 20989) ^ 533589836;
                        i4 = -2003455351;
                        int i111 = iM2567 ^ i4;
                        i16 = i16;
                        Button button10 = button2;
                        i14 = i111;
                        i13 = i3;
                        button2 = button10;
                    } else {
                        button = button2;
                        iM2569 = C2105.m6981("۟ܶ") ^ i11;
                        i13 = ((iM2569 ^ i12) * (-19101)) ^ 419487886;
                        i6 = -701127238;
                        i7 = iM2569 ^ i6;
                        i16 = i16;
                        button2 = button;
                        i14 = i7;
                        activityC12581 = this;
                    }
                    break;
                case -243405680:
                case -19713457:
                    if (RunnableC3474.f10992 > 0) {
                        button = button2;
                        s = s2;
                        i16 = i16;
                        iM2568 = C0630.m2566("ܰ᩵") ^ i12;
                        i13 = ((iM2568 ^ i11) * (-13489)) ^ (-611780653);
                        i5 = -218950318;
                        i7 = iM2568 ^ i5;
                        s2 = s;
                        i16 = i16;
                        button2 = button;
                        i14 = i7;
                        activityC12581 = this;
                    } else {
                        iM2566 = (C2105.m6981("ۗ᩸") ^ i11) * (-47);
                        i = ((iM2566 ^ i12) * (-7897)) ^ (-1031834723);
                        i2 = -1768952287;
                        i14 = iM2566 ^ i2;
                        i13 = i;
                    }
                    break;
                case -202021332:
                case 1004359163:
                    C1420.m4908(button4, i8);
                    button5 = activityC12581.f37941;
                    sArr4 = f37926;
                    if (C0630.f2410 > 0) {
                        iM2566 = (C0630.m2566("ܽ᩸") ^ i12) * (-71);
                        i = ((iM2566 ^ i11) * (-18147)) ^ 1480502160;
                        i2 = 473553389;
                        i14 = iM2566 ^ i2;
                        i13 = i;
                    } else {
                        button2 = button2;
                        i16 = i16;
                        iM2567 = (C2105.m6981("ۜ᩸") ^ i11) * (-95);
                        i3 = ((iM2567 ^ i12) * (-2809)) ^ (-1311910623);
                        i4 = -1090083106;
                        int i112 = iM2567 ^ i4;
                        i16 = i16;
                        Button button11 = button2;
                        i14 = i112;
                        i13 = i3;
                        button2 = button11;
                    }
                    break;
                case 788508354:
                case 1704541527:
                    button = button2;
                    s = s2;
                    i16 = i16;
                    sArr2 = f37926;
                    c = '8';
                    if (C7811.f24123 >= 0) {
                        iM2568 = C0630.m2566("ܰ᩵") ^ i12;
                        i13 = ((iM2568 ^ i11) * (-13489)) ^ (-611780653);
                        i5 = -218950318;
                    } else {
                        iM2568 = C0630.m2566("ܶ۟") ^ i12;
                        i13 = ((iM2568 ^ i11) * 8653) ^ 429797192;
                        i5 = 699770031;
                    }
                    i7 = iM2568 ^ i5;
                    s2 = s;
                    i16 = i16;
                    button2 = button;
                    i14 = i7;
                    activityC12581 = this;
                    break;
                case 1094403244:
                case 1885904817:
                    button2 = button2;
                    i16 = i16;
                    C1420.m4908(activityC12581.f37941, -1);
                    if (c16709M32219 != null) {
                        iM2567 = C2105.m6981("֨ۤ") ^ i11;
                        i3 = ((iM2567 ^ i12) * 25311) ^ (-66939245);
                        i4 = -1778924052;
                    } else {
                        iM2567 = (C2105.m6981("۠ᩳ") + i12) * (-93);
                        i3 = ((iM2567 ^ i11) * 14587) ^ (-1044419699);
                        i4 = -725108396;
                    }
                    int i113 = iM2567 ^ i4;
                    i16 = i16;
                    Button button12 = button2;
                    i14 = i113;
                    i13 = i3;
                    button2 = button12;
                    break;
                case 1167719744:
                case 1634775613:
                    button3 = activityC12581.f37941;
                    sArr3 = f37926;
                    i15 = 60;
                    if (C3746.m11369() >= 0) {
                        iM2566 = C2105.m6981("ܽۜ") ^ i12;
                        i = ((iM2566 ^ i11) * (-12509)) ^ (-270868504);
                        i2 = -1723486911;
                    } else {
                        iM2566 = C2105.m6981("ۛ֡") ^ i12;
                        i = ((iM2566 ^ i11) * 21495) ^ 527714689;
                        i2 = 1004127465;
                    }
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    break;
                case 1785051678:
                case 1892742018:
                    i9 = 9585;
                    iM2567 = (C0630.m2566("ᩳ᩻") + i12) * 19;
                    i3 = ((iM2567 ^ i11) * (-19901)) ^ 1961432152;
                    i4 = -759412379;
                    int i114 = iM2567 ^ i4;
                    i16 = i16;
                    Button button13 = button2;
                    i14 = i114;
                    i13 = i3;
                    button2 = button13;
                    break;
                case 1838047073:
                case 1984871886:
                    button = button2;
                    i16 = i16;
                    int i20 = s2 + s3;
                    s = s2;
                    if ((i20 * i20) - (s * 24664) < 0) {
                        iM2568 = (C2105.m6981("ۗ᩻") + i12) * (-41);
                        i13 = ((iM2568 ^ i11) * 16061) ^ (-51350592);
                        i5 = 693419135;
                    } else {
                        iM2568 = C2105.m6981("ۚ᩻") ^ i11;
                        i13 = ((iM2568 ^ i12) * 28863) ^ (-331809104);
                        i5 = 669786512;
                    }
                    i7 = iM2568 ^ i5;
                    s2 = s;
                    i16 = i16;
                    button2 = button;
                    i14 = i7;
                    activityC12581 = this;
                    break;
                default:
                    button2 = button2;
                    i16 = i16;
                    C22628.m50613(activityC12581.f37941, true);
                    if (C1005.f3721) {
                        iM2567 = (i12 - C0630.m2566("֡᩵")) * 15;
                        i3 = ((iM2567 ^ i11) * (-17493)) ^ (-1977124583);
                        i4 = 1379731277;
                    } else {
                        iM2567 = (C2105.m6981("ۜ᩸") ^ i11) * (-95);
                        i3 = ((iM2567 ^ i12) * (-2809)) ^ (-1311910623);
                        i4 = -1090083106;
                    }
                    int i115 = iM2567 ^ i4;
                    i16 = i16;
                    Button button14 = button2;
                    i14 = i115;
                    i13 = i3;
                    button2 = button14;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x028e  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30821(ImageView imageView, Button button, ViewGroup viewGroup) {
        int iM6981;
        int i;
        int i2;
        Bitmap bitmap;
        Bitmap.Config config;
        C11579 c11579;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C11579 c115710;
        int i10;
        int i11;
        Rect rect;
        int iM6982;
        int i12;
        int i13;
        C11579 c115711;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        C11579 c115712;
        int i21;
        int i22;
        int i23;
        int i24;
        Bitmap.Config config2;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        C11579 c115713;
        Bitmap.Config config3;
        C11579 c115714;
        int iM2566;
        int i36;
        int i37;
        int iM6983;
        int i38;
        int i39;
        C11579 c115715;
        int iM6984;
        int i40;
        int i41;
        int iM6985;
        int i42;
        int i43;
        int i44;
        int i45;
        int pixel;
        int i46;
        int i47;
        int i48;
        int i49;
        int i50;
        C11579 c115716;
        int i51;
        int i52;
        int i53;
        int i54;
        int i55;
        int i56;
        int i57;
        int i58;
        int iM2567;
        int i59;
        int i60;
        int iM6986;
        int i61;
        int i62;
        int i63;
        int iM2568;
        int i64;
        int i65;
        Rect rect2;
        int iM6987;
        int i66;
        int i67;
        int i68;
        int iM2569;
        int i69;
        int i70;
        int iM6988;
        int i71;
        int i72;
        int iM6989;
        int i73;
        int i74;
        int i75;
        int iM25610;
        int i76;
        int i77;
        int iM25611;
        int i78;
        int iM25612;
        int i79;
        int i80 = C3746.f11829;
        int i81 = C4263.f13799;
        int iM69810 = C2105.m6981("᩷ۙ") ^ i81;
        int i82 = ((iM69810 ^ i80) * 23213) ^ (-597436475);
        Bitmap.Config config4 = null;
        C11579 c115717 = null;
        C5934 c5934M28465 = null;
        C5934 c5934M28466 = null;
        int[] iArr = null;
        double d = 0.0d;
        Bitmap bitmapCreateBitmap = null;
        C5934 c5934M28467 = null;
        float[] fArr = null;
        int i83 = iM69810 ^ 1797034946;
        int i84 = 0;
        int i85 = 0;
        int i86 = 0;
        int i87 = 0;
        int i88 = 0;
        int iM28467 = 0;
        int i89 = 0;
        int i90 = 0;
        int intrinsicWidth = 0;
        int intrinsicHeight = 0;
        int iM16662 = 0;
        int i91 = 0;
        int i92 = 0;
        int iRed = 0;
        int i93 = 0;
        int iGreen = 0;
        int i94 = 0;
        int iBlue = 0;
        int i95 = 0;
        int iRgb = 0;
        int iM28468 = 0;
        int i96 = 0;
        int iRgb2 = 0;
        int i97 = 0;
        int i98 = 0;
        int i99 = 0;
        int pixel2 = 0;
        int iRed2 = 0;
        int iGreen2 = 0;
        int iBlue2 = 0;
        int i100 = 0;
        char c = 0;
        boolean z = false;
        boolean z2 = false;
        int i101 = 0;
        int iM16663 = 0;
        int i102 = 0;
        int iRgb3 = 0;
        int iM16664 = 0;
        int pixel3 = 0;
        int width = 0;
        int height = 0;
        int i103 = 0;
        int i104 = 0;
        int i105 = 0;
        int iM3783 = 0;
        int i106 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        int i107 = 1530271717;
        int i108 = 0;
        Canvas canvas = null;
        C5934 c5934M28468 = null;
        double dM20001 = 0.0d;
        C11579 c115718 = null;
        C5934 c5934M28469 = null;
        int i109 = 0;
        int pixel4 = 0;
        Drawable drawable = null;
        Rect rect3 = null;
        Bitmap bitmapCreateBitmap2 = null;
        int i110 = 0;
        int i111 = 0;
        while (true) {
            i107 = i83 ^ (i82 & (((i107 ^ i80) * 32413) >> 31));
            switch (i107) {
                case -2144120280:
                case -248705149:
                    bitmapCreateBitmap.setPixel(i84, i110, bitmapCreateBitmap2.getPixel(width + i84, i103 + i110));
                    i110++;
                    iM6989 = C0630.m2566("ۛۚ") ^ i80;
                    i73 = ((iM6989 ^ i81) * 16659) ^ (-600790819);
                    i74 = 351210099;
                    int i112 = iM6989 ^ i74;
                    c115718 = c115718;
                    i50 = i88;
                    i83 = i112;
                    i82 = i73;
                    i88 = i50;
                    break;
                case -2099718467:
                case 81785671:
                    i110 = 0;
                    iM6989 = C0630.m2566("ۛۚ") ^ i80;
                    i73 = ((iM6989 ^ i81) * 16659) ^ (-600790819);
                    i74 = 351210099;
                    int i113 = iM6989 ^ i74;
                    c115718 = c115718;
                    i50 = i88;
                    i83 = i113;
                    i82 = i73;
                    i88 = i50;
                    break;
                case -2088685874:
                case 1598259624:
                    bitmap = bitmapCreateBitmap;
                    i88 = i88;
                    config = config4;
                    c11579 = c115717;
                    i3 = pixel2;
                    i4 = pixel4;
                    i5 = iM3783;
                    i6 = i108;
                    i84 = i84;
                    i7 = i85;
                    i8 = i97;
                    i9 = pixel3;
                    c115710 = c115718;
                    i110 = i110;
                    i10 = i92;
                    i11 = i105;
                    drawable = imageView.getDrawable();
                    rect = new Rect(drawable.getBounds());
                    intrinsicWidth = drawable.getIntrinsicWidth();
                    intrinsicHeight = drawable.getIntrinsicHeight();
                    if (C2272.f7362) {
                        iM6982 = (i80 - C2105.m6981("᩻ۢ")) * (-75);
                        i12 = ((iM6982 ^ i81) * (-6137)) ^ (-260767005);
                        i13 = -2060227504;
                    } else {
                        iM6982 = C2105.m6981("۫᩸") ^ i81;
                        i12 = ((iM6982 ^ i80) * (-32419)) ^ (-1037972490);
                        i13 = -1497631198;
                    }
                    int i114 = iM6982 ^ i13;
                    i105 = i11;
                    i92 = i10;
                    i97 = i8;
                    pixel4 = i4;
                    Bitmap bitmap2 = bitmap;
                    rect3 = rect;
                    i82 = i12;
                    i84 = i84;
                    i88 = i88;
                    i83 = i114;
                    i110 = i110;
                    c115718 = c115710;
                    pixel3 = i9;
                    i85 = i7;
                    i108 = i6;
                    iM3783 = i5;
                    pixel2 = i3;
                    c115717 = c11579;
                    config4 = config;
                    bitmapCreateBitmap = bitmap2;
                    break;
                case -2070954630:
                case 1292560623:
                    i88 = i88;
                    c115718 = c115718;
                    i108 = i108;
                    i110 = i110;
                    i84 = i84;
                    i85 = i85;
                    drawable = drawable;
                    rect3 = rect3;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    iM3783 = RunnableC1108.m3783((i93 * 5) / 4, i90);
                    i98 = i94 * 5;
                    i99 = 4;
                    if (C2105.f7037 == 0) {
                        iM6986 = (C2105.m6981("ܰ۫") ^ i80) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i61 = ((iM6986 ^ i81) * 12167) ^ 1139299351;
                        i62 = 1158113045;
                        int i115 = iM6986 ^ i62;
                        i108 = i108;
                        i82 = i61;
                        i85 = i85;
                        i110 = i110;
                        c115718 = c115718;
                        rect2 = rect3;
                        drawable = drawable;
                        i84 = i84;
                        i88 = i88;
                        i83 = i115;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect3 = rect2;
                    } else {
                        i54 = i85;
                        i55 = iM3783;
                        i56 = i108;
                        int iM69811 = (C2105.m6981("ۙۢ") + i81) * 109;
                        i57 = ((iM69811 ^ i80) * (-15059)) ^ (-387382326);
                        i58 = iM69811 ^ 715698527;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect3 = rect3;
                        drawable = drawable;
                        i84 = i84;
                        i88 = i88;
                        i83 = i58;
                        i82 = i57;
                        i110 = i110;
                        c115718 = c115718;
                        int i116 = i56;
                        iM3783 = i55;
                        i85 = i54;
                        i108 = i116;
                    }
                    break;
                case -2060915070:
                case -198005411:
                    c115715 = c115718;
                    iM16662 = c5934M28465.m16662();
                    iM6984 = C2105.m6981("᩵᩸") ^ i81;
                    i40 = ((iM6984 ^ i80) * (-20987)) ^ 1045356013;
                    i41 = -1783469643;
                    int i117 = iM6984 ^ i41;
                    i105 = i105;
                    i92 = i92;
                    i97 = i97;
                    pixel4 = pixel4;
                    int i118 = i88;
                    i83 = i117;
                    i82 = i40;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect3 = rect3;
                    drawable = drawable;
                    i84 = i84;
                    i88 = i118;
                    int i119 = pixel2;
                    c115717 = c115717;
                    i110 = i110;
                    c115718 = c115715;
                    pixel3 = pixel3;
                    i85 = i85;
                    i108 = i108;
                    iM3783 = iM3783;
                    pixel2 = i119;
                    break;
                case -2021678575:
                case -1332476320:
                    int i120 = i108;
                    int i121 = iArr[i106];
                    iRed += Color.red(i121);
                    iGreen += Color.green(i121);
                    iBlue += Color.blue(i121);
                    i106++;
                    i85 = i85;
                    pixel2 = pixel2;
                    pixel3 = pixel3;
                    iM3783 = iM3783;
                    i108 = i120;
                    c115718 = c115718;
                    i47 = i97;
                    i49 = pixel4;
                    i48 = i92;
                    int iM69812 = C2105.m6981("ۢۚ") ^ i80;
                    int i122 = i47;
                    i82 = ((iM69812 ^ i81) * 15983) ^ 1530578909;
                    i63 = iM69812 ^ 1359531923;
                    i105 = i105;
                    i92 = i48;
                    i97 = i122;
                    pixel4 = i49;
                    i50 = i88;
                    i83 = i63;
                    i110 = i110;
                    c115718 = c115718;
                    pixel3 = pixel3;
                    i85 = i85;
                    i108 = i108;
                    iM3783 = iM3783;
                    pixel2 = pixel2;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect3 = rect3;
                    drawable = drawable;
                    i84 = i84;
                    i88 = i50;
                    break;
                case -1987456885:
                case 1732330237:
                    int i123 = height / 2;
                    int width2 = bitmapCreateBitmap2.getWidth() - width;
                    int height2 = bitmapCreateBitmap2.getHeight() - i123;
                    bitmapCreateBitmap = Bitmap.createBitmap(width2, height2, Bitmap.Config.ARGB_8888);
                    i103 = i123;
                    i85 = width2;
                    i87 = height2;
                    i84 = 0;
                    int iM25613 = (C0630.m2566("ܽ᩷") + i80) * 79;
                    i88 = i88;
                    i83 = iM25613 ^ (-1867642869);
                    i82 = ((iM25613 ^ i81) * 4871) ^ 727911565;
                    i110 = i110;
                    c115718 = c115718;
                    break;
                case -1970688933:
                case 747971572:
                    i25 = i88;
                    i26 = pixel4;
                    i84 = i84;
                    i27 = i97;
                    drawable = drawable;
                    i28 = i92;
                    i29 = i105;
                    rect3 = rect3;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    C11579 c115719 = c115718;
                    i30 = i110;
                    C11579 c115720 = c115717;
                    i31 = pixel2;
                    i32 = iM3783;
                    i33 = i108;
                    i34 = i85;
                    i35 = pixel3;
                    c115713 = c115719;
                    config3 = config4;
                    bitmapCreateBitmap2 = Bitmap.createBitmap(100, 100, config3);
                    canvas = new Canvas(bitmapCreateBitmap2);
                    c115714 = c115720;
                    drawable.setBounds(-16, -16, 116, 116);
                    drawable.draw(canvas);
                    if (C2958.m9034() <= 0) {
                        iM2566 = C0630.m2566("۟۫") ^ i80;
                        i36 = ((iM2566 ^ i81) * (-2007)) ^ (-295599371);
                        i37 = 525328202;
                    } else {
                        iM2566 = (i80 - C0630.m2566("ܶ֨")) * (-17);
                        i36 = ((iM2566 ^ i81) * (-27201)) ^ 1145019847;
                        i37 = -2106384098;
                    }
                    int i124 = iM2566 ^ i37;
                    i105 = i29;
                    i92 = i28;
                    i97 = i27;
                    pixel4 = i26;
                    i50 = i25;
                    i83 = i124;
                    i82 = i36;
                    i110 = i30;
                    c115718 = c115713;
                    pixel3 = i35;
                    i85 = i34;
                    i108 = i33;
                    iM3783 = i32;
                    pixel2 = i31;
                    c115717 = c115714;
                    config4 = config3;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect3 = rect3;
                    drawable = drawable;
                    i84 = i84;
                    i88 = i50;
                    break;
                case -1953607481:
                case -1764128455:
                    i84++;
                    int iM25614 = (C0630.m2566("ܽ᩷") + i80) * 79;
                    i88 = i88;
                    i83 = iM25614 ^ (-1867642869);
                    i82 = ((iM25614 ^ i81) * 4871) ^ 727911565;
                    i110 = i110;
                    c115718 = c115718;
                    break;
                case -1919807435:
                case -266828750:
                    canvas.drawColor(Color.argb(i86, i90, i90, i90));
                    i110 = i110;
                    i84 = i84;
                    iM6987 = (i81 - C2105.m6981("ᩴۨ")) * 115;
                    i66 = ((iM6987 ^ i80) * (-29015)) ^ (-494726357);
                    i67 = 959589248;
                    i72 = iM6987 ^ i67;
                    i110 = i110;
                    c115718 = c115718;
                    i50 = i88;
                    i83 = i72;
                    i82 = i66;
                    i84 = i84;
                    i88 = i50;
                    break;
                case -1888128367:
                case -1429449777:
                    fArr[c] = f - f2;
                    iM25610 = C2105.m6981("ܳܽ") ^ i80;
                    i76 = ((iM25610 ^ i81) * (-29767)) ^ (-1697787327);
                    i77 = 1123562748;
                    int i125 = iM25610 ^ i77;
                    i88 = i88;
                    i83 = i125;
                    i82 = i76;
                    break;
                case -1830342681:
                case -415220559:
                    i88 = i88;
                    c115711 = c115717;
                    i14 = pixel2;
                    i15 = pixel4;
                    i16 = iM3783;
                    i17 = i108;
                    i84 = i84;
                    i18 = i85;
                    i19 = i97;
                    i20 = pixel3;
                    c115712 = c115718;
                    drawable = drawable;
                    i110 = i110;
                    i21 = i92;
                    i22 = i105;
                    rect3 = rect3;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    Bitmap.Config config5 = Bitmap.Config.ARGB_8888;
                    i23 = intrinsicWidth;
                    i24 = intrinsicHeight;
                    Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(i23, i24, config5);
                    config2 = config5;
                    drawable.draw(new Canvas(bitmapCreateBitmap3));
                    int iM20003 = C7466.m20003(bitmapCreateBitmap3);
                    bitmapCreateBitmap3.recycle();
                    if (RunnableC0588.f2309 >= 0) {
                        i111 = iM20003;
                        int iM25615 = (C0630.m2566("᩺᩶") + i80) * 59;
                        int i126 = i23;
                        i105 = i22;
                        i92 = i21;
                        i97 = i19;
                        pixel4 = i15;
                        i50 = i88;
                        i83 = iM25615 ^ (-2055180330);
                        i82 = ((iM25615 ^ i81) * (-29941)) ^ (-249184372);
                        i110 = i110;
                        c115718 = c115712;
                        pixel3 = i20;
                        i85 = i18;
                        i108 = i17;
                        iM3783 = i16;
                        pixel2 = i14;
                        c115717 = c115711;
                        config4 = config2;
                        intrinsicWidth = i126;
                        intrinsicHeight = i24;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect3 = rect3;
                        drawable = drawable;
                        i84 = i84;
                        i88 = i50;
                    } else {
                        int iM69813 = (i80 - C2105.m6981("۟۟")) * (-13);
                        i105 = i22;
                        i92 = i21;
                        i97 = i19;
                        pixel4 = i15;
                        i111 = iM20003;
                        i82 = ((iM69813 ^ i81) * (-21137)) ^ 1257370326;
                        i83 = iM69813 ^ (-342403765);
                        i110 = i110;
                        c115718 = c115712;
                        pixel3 = i20;
                        i85 = i18;
                        i108 = i17;
                        iM3783 = i16;
                        pixel2 = i14;
                        c115717 = c115711;
                        config4 = config2;
                        intrinsicWidth = i23;
                        intrinsicHeight = i24;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect3 = rect3;
                        drawable = drawable;
                        i84 = i84;
                        i88 = i88;
                    }
                    break;
                case -1826520489:
                case -1209093553:
                    i88 = i88;
                    pixel4 = pixel4;
                    i84 = i84;
                    i97 = i97;
                    drawable = drawable;
                    i92 = i92;
                    i105 = i105;
                    rect3 = rect3;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    pixel2 = pixel2;
                    iM3783 = iM3783;
                    i108 = i108;
                    i85 = i85;
                    pixel3 = pixel3;
                    c115718 = c115718;
                    i110 = i110;
                    i90 = 255;
                    if (iM28468 != 0) {
                        iM6985 = C0630.m2566("ۘۗ") ^ i81;
                        i42 = ((iM6985 ^ i80) * 16759) ^ (-70207556);
                        i43 = 1580761774;
                    } else {
                        iM6985 = C0630.m2566("ᩴܳ") ^ i81;
                        i42 = ((iM6985 ^ i80) * 33) ^ (-799696350);
                        i43 = 2117524240;
                    }
                    int i127 = iM6985 ^ i43;
                    i105 = i105;
                    i92 = i92;
                    i97 = i97;
                    pixel4 = pixel4;
                    i50 = i88;
                    i83 = i127;
                    i82 = i42;
                    i110 = i110;
                    c115718 = c115718;
                    pixel3 = pixel3;
                    i85 = i85;
                    i108 = i108;
                    iM3783 = iM3783;
                    pixel2 = pixel2;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect3 = rect3;
                    drawable = drawable;
                    i84 = i84;
                    i88 = i50;
                    break;
                case -1804753672:
                case 544822730:
                    int i128 = i88;
                    C11579 c115721 = c115718;
                    int i129 = i110;
                    int i130 = i84;
                    int i131 = i105;
                    Drawable drawable2 = drawable;
                    Rect rect4 = rect3;
                    Bitmap bitmap3 = bitmapCreateBitmap;
                    int i132 = i108;
                    i54 = i85;
                    i55 = iM3783;
                    i56 = i132;
                    float[] fArr2 = new float[3];
                    int i133 = i92;
                    C7466.m20004(i133, fArr2);
                    if (fArr2[2] < 0.33f) {
                        iM2567 = (i81 - C2105.m6981("ۚܶ")) * 83;
                        i59 = ((iM2567 ^ i80) * (-7365)) ^ 1035316430;
                        i60 = -177836838;
                    } else {
                        iM2567 = C0630.m2566("ܶܿ") ^ i80;
                        i59 = ((iM2567 ^ i81) * (-32695)) ^ 2130841250;
                        i60 = -229114369;
                    }
                    int i134 = iM2567 ^ i60;
                    i105 = i131;
                    i92 = i133;
                    bitmapCreateBitmap = bitmap3;
                    i110 = i129;
                    rect3 = rect4;
                    drawable = drawable2;
                    c115718 = c115721;
                    i84 = i130;
                    i88 = i128;
                    i83 = i134;
                    i82 = i59;
                    i89 = 3;
                    int i1110 = i56;
                    iM3783 = i55;
                    i85 = i54;
                    i108 = i1110;
                    break;
                case -1802611757:
                case 790486357:
                    z = false;
                    iM6986 = (i80 - C0630.m2566("۠֫")) * 89;
                    i61 = ((iM6986 ^ i81) * (-8327)) ^ (-700864898);
                    i62 = -1206887563;
                    int i1111 = iM6986 ^ i62;
                    i108 = i108;
                    i82 = i61;
                    i85 = i85;
                    i110 = i110;
                    c115718 = c115718;
                    rect2 = rect3;
                    drawable = drawable;
                    i84 = i84;
                    i88 = i88;
                    i83 = i1111;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect3 = rect2;
                    break;
                case -1797974475:
                case 640361542:
                    z2 = true;
                    iM2568 = (C0630.m2566("᩺ۡ") ^ i81) * (-93);
                    i64 = ((iM2568 ^ i80) * 24295) ^ (-390728748);
                    i65 = -1195159897;
                    int i135 = iM2568 ^ i65;
                    i108 = i108;
                    i82 = i64;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect3 = rect3;
                    drawable = drawable;
                    i84 = i84;
                    i88 = i88;
                    i83 = i135;
                    i110 = i110;
                    c115718 = c115718;
                    break;
                case -1792680268:
                case -488744457:
                    i88 = i88;
                    c115718 = c115718;
                    i108 = i108;
                    i110 = i110;
                    i84 = i84;
                    drawable = drawable;
                    rect3 = rect3;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    c = 2;
                    i85 = i85;
                    if (((int) Math.sqrt((iBlue2 * iBlue2) + (iGreen2 * iGreen2) + i100)) < 70) {
                        iM6986 = C0630.m2566("۫ۛ") ^ i80;
                        i61 = ((iM6986 ^ i81) * 23741) ^ 1316657562;
                        i62 = 1089647091;
                    } else {
                        iM6986 = C2105.m6981("᩹ܶ") ^ i81;
                        i61 = ((iM6986 ^ i80) * (-21161)) ^ 1036393359;
                        i62 = -720783165;
                    }
                    int i1112 = iM6986 ^ i62;
                    i108 = i108;
                    i82 = i61;
                    i85 = i85;
                    i110 = i110;
                    c115718 = c115718;
                    rect2 = rect3;
                    drawable = drawable;
                    i84 = i84;
                    i88 = i88;
                    i83 = i1112;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect3 = rect2;
                    break;
                case -1651062918:
                case 1113981957:
                    iM16664 = c5934M28466.m16662();
                    iM6985 = C2105.m6981("ܳۙ") ^ i81;
                    i42 = ((iM6985 ^ i80) * (-2095)) ^ (-1980593757);
                    i43 = -1484960391;
                    int i1210 = iM6985 ^ i43;
                    i105 = i105;
                    i92 = i92;
                    i97 = i97;
                    pixel4 = pixel4;
                    i50 = i88;
                    i83 = i1210;
                    i82 = i42;
                    i110 = i110;
                    c115718 = c115718;
                    pixel3 = pixel3;
                    i85 = i85;
                    i108 = i108;
                    iM3783 = iM3783;
                    pixel2 = pixel2;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect3 = rect3;
                    drawable = drawable;
                    i84 = i84;
                    i88 = i50;
                    break;
                case -1641971665:
                case 851606000:
                    c115715 = c115718;
                    iM16663 = 0;
                    iM6984 = C0630.m2566("۟ۛ") ^ i81;
                    i40 = ((iM6984 ^ i80) * (-28969)) ^ 1109208629;
                    i41 = -2048610524;
                    int i1113 = iM6984 ^ i41;
                    i105 = i105;
                    i92 = i92;
                    i97 = i97;
                    pixel4 = pixel4;
                    int i1114 = i88;
                    i83 = i1113;
                    i82 = i40;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect3 = rect3;
                    drawable = drawable;
                    i84 = i84;
                    i88 = i1114;
                    int i1115 = pixel2;
                    c115717 = c115717;
                    i110 = i110;
                    c115718 = c115715;
                    pixel3 = pixel3;
                    i85 = i85;
                    i108 = i108;
                    iM3783 = iM3783;
                    pixel2 = i1115;
                    break;
                case -1636955649:
                case 2039893059:
                    if (C2167.f7158 < 0) {
                        iM25612 = C0630.m2566("ᩴۡ") ^ i81;
                        i76 = ((iM25612 ^ i80) * (-28247)) ^ (-713602761);
                        i79 = 1034869852;
                    } else {
                        iM25612 = C0630.m2566("ۨۢ") ^ i81;
                        i76 = ((iM25612 ^ i80) * 19939) ^ 1384667428;
                        i79 = -158865510;
                    }
                    i83 = iM25612 ^ i79;
                    i82 = i76;
                    break;
                case -1624202095:
                case 225795026:
                    c115715 = c115718;
                    iM16662 = 0;
                    iM6984 = C2105.m6981("᩵᩸") ^ i81;
                    i40 = ((iM6984 ^ i80) * (-20987)) ^ 1045356013;
                    i41 = -1783469643;
                    int i1116 = iM6984 ^ i41;
                    i105 = i105;
                    i92 = i92;
                    i97 = i97;
                    pixel4 = pixel4;
                    int i1117 = i88;
                    i83 = i1116;
                    i82 = i40;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect3 = rect3;
                    drawable = drawable;
                    i84 = i84;
                    i88 = i1117;
                    int i1118 = pixel2;
                    c115717 = c115717;
                    i110 = i110;
                    c115718 = c115715;
                    pixel3 = pixel3;
                    i85 = i85;
                    i108 = i108;
                    iM3783 = iM3783;
                    pixel2 = i1118;
                    break;
                case -1601239241:
                case 1658435225:
                    break;
                case -1595548983:
                case -514414026:
                    z2 = false;
                    iM2568 = (C0630.m2566("᩺ۡ") ^ i81) * (-93);
                    i64 = ((iM2568 ^ i80) * 24295) ^ (-390728748);
                    i65 = -1195159897;
                    int i136 = iM2568 ^ i65;
                    i108 = i108;
                    i82 = i64;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect3 = rect3;
                    drawable = drawable;
                    i84 = i84;
                    i88 = i88;
                    i83 = i136;
                    i110 = i110;
                    c115718 = c115718;
                    break;
                case -1578299842:
                case 1053713141:
                    i88 = i88;
                    pixel4 = pixel4;
                    i84 = i84;
                    i97 = i97;
                    drawable = drawable;
                    i92 = i92;
                    i105 = i105;
                    rect3 = rect3;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    C11579 c115722 = c115718;
                    i110 = i110;
                    c115717 = c115717;
                    pixel2 = pixel2;
                    iM3783 = iM3783;
                    i108 = i108;
                    i85 = i85;
                    pixel3 = pixel3;
                    c115715 = c115722;
                    c5934M28468 = c115717.m28465(C22867.f73783);
                    if (c5934M28468 != null) {
                        iM6984 = C0630.m2566("ۢ֨") ^ i81;
                        i40 = ((iM6984 ^ i80) * 17697) ^ 393647586;
                        i41 = 1836495177;
                    } else {
                        iM6984 = C2105.m6981("֡ۙ") ^ i80;
                        i40 = ((iM6984 ^ i81) * 8325) ^ 922347702;
                        i41 = -117932654;
                    }
                    int i1119 = iM6984 ^ i41;
                    i105 = i105;
                    i92 = i92;
                    i97 = i97;
                    pixel4 = pixel4;
                    int i11110 = i88;
                    i83 = i1119;
                    i82 = i40;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect3 = rect3;
                    drawable = drawable;
                    i84 = i84;
                    i88 = i11110;
                    int i11111 = pixel2;
                    c115717 = c115717;
                    i110 = i110;
                    c115718 = c115715;
                    pixel3 = pixel3;
                    i85 = i85;
                    i108 = i108;
                    iM3783 = iM3783;
                    pixel2 = i11111;
                    break;
                case -1552498240:
                case 1864459070:
                    i88 = i88;
                    c115718 = c115718;
                    float[] fArr3 = new float[i89];
                    C7466.m20004(i111, fArr3);
                    float f3 = fArr3[c];
                    C7466.m20004(iM28467, fArr3);
                    i110 = i110;
                    i84 = i84;
                    int i137 = (int) (((d - dM20001) / d) * 32.0d);
                    if (f3 < fArr3[c]) {
                        iM6988 = (C2105.m6981("۫۫") + i80) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i66 = ((iM6988 ^ i81) * 7487) ^ (-1819428212);
                        i71 = 277743272;
                    } else {
                        iM6988 = C2105.m6981("֨ۘ") ^ i81;
                        i66 = ((iM6988 ^ i80) * 18867) ^ (-189785306);
                        i71 = 1122176572;
                    }
                    i72 = iM6988 ^ i71;
                    i86 = i137;
                    i110 = i110;
                    c115718 = c115718;
                    i50 = i88;
                    i83 = i72;
                    i82 = i66;
                    i84 = i84;
                    i88 = i50;
                    break;
                case -1445838845:
                case -316185265:
                    int i138 = i88;
                    int i139 = pixel2;
                    int i140 = pixel4;
                    int i141 = iM3783;
                    int i142 = i108;
                    int i143 = i84;
                    int i144 = i85;
                    int i145 = i97;
                    int i146 = pixel3;
                    C11579 c115723 = c115718;
                    Drawable drawable3 = drawable;
                    int i147 = i110;
                    int i148 = i92;
                    int i149 = i105;
                    Rect rect5 = rect3;
                    Bitmap bitmap4 = bitmapCreateBitmap;
                    C11579 c11579M29816 = new C12284(bitmapCreateBitmap2).m29816();
                    iM28468 = c11579M29816.m28467();
                    c5934M28465 = c11579M29816.m28465(C22867.f73780);
                    i109 = 0;
                    if (c5934M28465 != null) {
                        iM6983 = (C2105.m6981("֡ۤ") + i80) * 71;
                        i38 = ((iM6983 ^ i81) * 28355) ^ (-283491921);
                        i39 = 56454010;
                    } else {
                        iM6983 = (i81 - C2105.m6981("ܺ۟")) * (-85);
                        i38 = ((iM6983 ^ i80) * (-3735)) ^ 1563885191;
                        i39 = -1865964525;
                    }
                    int i150 = iM6983 ^ i39;
                    i105 = i149;
                    i92 = i148;
                    i97 = i145;
                    pixel4 = i140;
                    c115717 = c11579M29816;
                    i82 = i38;
                    bitmapCreateBitmap = bitmap4;
                    rect3 = rect5;
                    drawable = drawable3;
                    i84 = i143;
                    i88 = i138;
                    i83 = i150;
                    i110 = i147;
                    c115718 = c115723;
                    pixel3 = i146;
                    i85 = i144;
                    i108 = i142;
                    iM3783 = i141;
                    pixel2 = i139;
                    break;
                case -1388328477:
                case -1373384644:
                    int i151 = i104;
                    int i152 = i108;
                    i85 = i85;
                    int i153 = iM3783;
                    i108 = i152;
                    int pixel5 = bitmapCreateBitmap2.getPixel(i151, i151);
                    i47 = i97;
                    i48 = i92;
                    pixel2 = pixel2;
                    iM3783 = i153;
                    pixel3 = pixel3;
                    c115718 = c115718;
                    i49 = pixel4;
                    iRed = 0;
                    iGreen = 0;
                    iBlue = 0;
                    iArr = new int[]{i47, pixel2, pixel3, i49, pixel5};
                    i106 = 0;
                    int iM69814 = C2105.m6981("ۢۚ") ^ i80;
                    int i1211 = i47;
                    i82 = ((iM69814 ^ i81) * 15983) ^ 1530578909;
                    i63 = iM69814 ^ 1359531923;
                    i105 = i105;
                    i92 = i48;
                    i97 = i1211;
                    pixel4 = i49;
                    i50 = i88;
                    i83 = i63;
                    i110 = i110;
                    c115718 = c115718;
                    pixel3 = pixel3;
                    i85 = i85;
                    i108 = i108;
                    iM3783 = iM3783;
                    pixel2 = pixel2;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect3 = rect3;
                    drawable = drawable;
                    i84 = i84;
                    i88 = i50;
                    break;
                case -1333782908:
                case 1959535936:
                    i88 = i88;
                    if (c5934M28469 != null) {
                        iM25610 = (C0630.m2566("᩶۠") + i81) * 53;
                        i76 = ((iM25610 ^ i80) * 29371) ^ 1233821815;
                        i77 = -245805220;
                    } else {
                        iM25610 = C2105.m6981("۬ᩴ") ^ i80;
                        i76 = ((iM25610 ^ i81) * 17999) ^ 1050360677;
                        i77 = 67112820;
                    }
                    int i1212 = iM25610 ^ i77;
                    i88 = i88;
                    i83 = i1212;
                    i82 = i76;
                    break;
                case -1313317424:
                case 852935074:
                    i88 = i88;
                    pixel4 = pixel4;
                    i84 = i84;
                    i97 = i97;
                    drawable = drawable;
                    i92 = i92;
                    i105 = i105;
                    rect3 = rect3;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    int i154 = pixel2;
                    iM3783 = iM3783;
                    i108 = i108;
                    i85 = i85;
                    pixel3 = pixel3;
                    c115715 = c115718;
                    i110 = i110;
                    c115717 = c115717;
                    c5934M28466 = c115717.m28465(C22867.f73781);
                    if (c5934M28466 != null) {
                        iM6984 = (C2105.m6981("۫֨") ^ i80) * 127;
                        pixel2 = i154;
                        i40 = ((iM6984 ^ i81) * 30633) ^ (-1055641505);
                        i41 = -1738137486;
                    } else {
                        pixel2 = i154;
                        iM6984 = (C0630.m2566("᩶ܰ") ^ i80) * 115;
                        i40 = ((iM6984 ^ i81) * 24765) ^ (-1218812441);
                        i41 = -995195074;
                    }
                    int i11112 = iM6984 ^ i41;
                    i105 = i105;
                    i92 = i92;
                    i97 = i97;
                    pixel4 = pixel4;
                    int i11113 = i88;
                    i83 = i11112;
                    i82 = i40;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect3 = rect3;
                    drawable = drawable;
                    i84 = i84;
                    i88 = i11113;
                    int i11114 = pixel2;
                    c115717 = c115717;
                    i110 = i110;
                    c115718 = c115715;
                    pixel3 = pixel3;
                    i85 = i85;
                    i108 = i108;
                    iM3783 = iM3783;
                    pixel2 = i11114;
                    break;
                case -1169302590:
                case 1916180937:
                    i88 = i88;
                    if (i110 < i87) {
                        iM25610 = C2105.m6981("᩸ۘ") ^ i81;
                        i76 = ((iM25610 ^ i80) * (-30209)) ^ (-827081992);
                        i77 = -982377013;
                    } else {
                        iM25610 = (C2105.m6981("ۚۛ") ^ i80) * 123;
                        i76 = ((iM25610 ^ i81) * (-1637)) ^ (-1884755470);
                        i77 = -519586037;
                    }
                    int i1213 = iM25610 ^ i77;
                    i88 = i88;
                    i83 = i1213;
                    i82 = i76;
                    break;
                case -1161745700:
                case 743731414:
                    i88 = i88;
                    c115718 = c115718;
                    i110 = i110;
                    i84 = i84;
                    viewGroup.setBackground(new BitmapDrawable(imageView.getResources(), bitmapCreateBitmap2));
                    width = (bitmapCreateBitmap2.getWidth() / 4) * 3;
                    height = bitmapCreateBitmap2.getHeight();
                    if (!C0382.f1805) {
                        rect = rect3;
                        bitmap = bitmapCreateBitmap;
                        config = config4;
                        c11579 = c115717;
                        i3 = pixel2;
                        i5 = iM3783;
                        i6 = i108;
                        i7 = i85;
                        i9 = pixel3;
                        c115710 = c115718;
                        i4 = pixel4;
                        i8 = i97;
                        i10 = i92;
                        i11 = i105;
                        iM6982 = (i80 - C2105.m6981("᩻ۢ")) * (-75);
                        i12 = ((iM6982 ^ i81) * (-6137)) ^ (-260767005);
                        i13 = -2060227504;
                        int i1120 = iM6982 ^ i13;
                        i105 = i11;
                        i92 = i10;
                        i97 = i8;
                        pixel4 = i4;
                        Bitmap bitmap5 = bitmap;
                        rect3 = rect;
                        i82 = i12;
                        i84 = i84;
                        i88 = i88;
                        i83 = i1120;
                        i110 = i110;
                        c115718 = c115710;
                        pixel3 = i9;
                        i85 = i7;
                        i108 = i6;
                        iM3783 = i5;
                        pixel2 = i3;
                        c115717 = c11579;
                        config4 = config;
                        bitmapCreateBitmap = bitmap5;
                    } else {
                        iM6987 = C0630.m2566("᩷֨") ^ i80;
                        i66 = ((iM6987 ^ i81) * (-30511)) ^ (-1972810518);
                        i67 = -279731585;
                        i72 = iM6987 ^ i67;
                        i110 = i110;
                        c115718 = c115718;
                        i50 = i88;
                        i83 = i72;
                        i82 = i66;
                        i84 = i84;
                        i88 = i50;
                    }
                    break;
                case -1056608005:
                case 1784967545:
                    i88 = i88;
                    c115716 = c115718;
                    i110 = i110;
                    i84 = i84;
                    drawable = drawable;
                    rect3 = rect3;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    int i155 = i92;
                    i105 = i105;
                    int i156 = i108;
                    i85 = i85;
                    i51 = iM3783;
                    i108 = i156;
                    if (iM16662 != 0) {
                        i52 = iM16662;
                        i53 = iM28468;
                        i101 = iM16663;
                        iRgb3 = iM16664;
                        int iM25616 = C0630.m2566("ۘۢ") ^ i80;
                        int i157 = i53;
                        i82 = ((iM25616 ^ i81) * 2451) ^ (-1571828105);
                        iM3783 = i51;
                        i85 = i85;
                        i108 = i52;
                        i110 = i110;
                        c115718 = c115716;
                        Rect rect6 = rect3;
                        drawable = drawable;
                        i84 = i84;
                        i88 = i88;
                        i83 = iM25616 ^ (-223070441);
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect3 = rect6;
                        i105 = i105;
                        i92 = i157;
                    } else {
                        int i158 = i97;
                        i92 = i155;
                        pixel2 = pixel2;
                        iM3783 = i51;
                        pixel3 = pixel3;
                        c115718 = c115716;
                        pixel4 = pixel4;
                        i97 = i158;
                        iM6985 = C0630.m2566("ᩴܳ") ^ i81;
                        i42 = ((iM6985 ^ i80) * 33) ^ (-799696350);
                        i43 = 2117524240;
                        int i1214 = iM6985 ^ i43;
                        i105 = i105;
                        i92 = i92;
                        i97 = i97;
                        pixel4 = pixel4;
                        i50 = i88;
                        i83 = i1214;
                        i82 = i42;
                        i110 = i110;
                        c115718 = c115718;
                        pixel3 = pixel3;
                        i85 = i85;
                        i108 = i108;
                        iM3783 = iM3783;
                        pixel2 = pixel2;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect3 = rect3;
                        drawable = drawable;
                        i84 = i84;
                        i88 = i50;
                    }
                    break;
                case -1025830328:
                case -153937495:
                    if (C7811.f24123 < 0) {
                        i88 = i88;
                        c115718 = c115718;
                        i110 = i110;
                        i84 = i84;
                        drawable = drawable;
                        rect3 = rect3;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        int i159 = i108;
                        i54 = i85;
                        i55 = iM3783;
                        i56 = i159;
                        int iM69815 = (C2105.m6981("ۙۢ") + i81) * 109;
                        i57 = ((iM69815 ^ i80) * (-15059)) ^ (-387382326);
                        i58 = iM69815 ^ 715698527;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect3 = rect3;
                        drawable = drawable;
                        i84 = i84;
                        i88 = i88;
                        i83 = i58;
                        i82 = i57;
                        i110 = i110;
                        c115718 = c115718;
                        int i11115 = i56;
                        iM3783 = i55;
                        i85 = i54;
                        i108 = i11115;
                    } else {
                        i88 = i88;
                        i15 = pixel4;
                        i84 = i84;
                        i19 = i97;
                        drawable = drawable;
                        i21 = i92;
                        i22 = i105;
                        rect3 = rect3;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        i24 = intrinsicHeight;
                        C11579 c115724 = c115718;
                        i110 = i110;
                        i23 = intrinsicWidth;
                        config2 = config4;
                        c115711 = c115717;
                        i14 = pixel2;
                        i16 = iM3783;
                        i17 = i108;
                        i18 = i85;
                        i20 = pixel3;
                        c115712 = c115724;
                        int iM25617 = (C0630.m2566("᩺᩶") + i80) * 59;
                        int i1215 = i23;
                        i105 = i22;
                        i92 = i21;
                        i97 = i19;
                        pixel4 = i15;
                        i50 = i88;
                        i83 = iM25617 ^ (-2055180330);
                        i82 = ((iM25617 ^ i81) * (-29941)) ^ (-249184372);
                        i110 = i110;
                        c115718 = c115712;
                        pixel3 = i20;
                        i85 = i18;
                        i108 = i17;
                        iM3783 = i16;
                        pixel2 = i14;
                        c115717 = c115711;
                        config4 = config2;
                        intrinsicWidth = i1215;
                        intrinsicHeight = i24;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect3 = rect3;
                        drawable = drawable;
                        i84 = i84;
                        i88 = i50;
                    }
                    break;
                case -910797499:
                case -259033261:
                    iM16664 = 0;
                    iM6985 = C2105.m6981("ܳۙ") ^ i81;
                    i42 = ((iM6985 ^ i80) * (-2095)) ^ (-1980593757);
                    i43 = -1484960391;
                    int i1216 = iM6985 ^ i43;
                    i105 = i105;
                    i92 = i92;
                    i97 = i97;
                    pixel4 = pixel4;
                    i50 = i88;
                    i83 = i1216;
                    i82 = i42;
                    i110 = i110;
                    c115718 = c115718;
                    pixel3 = pixel3;
                    i85 = i85;
                    i108 = i108;
                    iM3783 = iM3783;
                    pixel2 = pixel2;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect3 = rect3;
                    drawable = drawable;
                    i84 = i84;
                    i88 = i50;
                    break;
                case -810728356:
                case 1297657303:
                    i84 = i84;
                    c115718 = c115718;
                    i110 = i110;
                    i68 = 687865855;
                    i102 = iRgb3;
                    iM2569 = C0630.m2566("ܿܶ") ^ i80;
                    i69 = i68;
                    i82 = ((iM2569 ^ i81) * 21375) ^ 1562511139;
                    i70 = 507063844;
                    i110 = i110;
                    c115718 = c115718;
                    i50 = i69;
                    i83 = iM2569 ^ i70;
                    i84 = i84;
                    i88 = i50;
                    break;
                case -776226306:
                case 322294120:
                    RunnableC1937.m6387();
                    if (C4263.f13799 <= 0) {
                        iM25612 = C0630.m2566("ᩴۡ") ^ i81;
                        i76 = ((iM25612 ^ i80) * (-28247)) ^ (-713602761);
                        i79 = 1034869852;
                    } else {
                        iM25612 = C0630.m2566("ܳܳ") ^ i81;
                        i76 = ((iM25612 ^ i80) * 28015) ^ (-1224382644);
                        i79 = -630526584;
                    }
                    i83 = iM25612 ^ i79;
                    i82 = i76;
                    break;
                case -751717310:
                case -601301670:
                    i88 = i88;
                    c115718 = c115718;
                    i110 = i110;
                    i84 = i84;
                    if (z2) {
                        iM6987 = (i80 - C0630.m2566("ۢ֫")) * (-95);
                        i66 = ((iM6987 ^ i81) * (-14623)) ^ (-1274219722);
                        i67 = -1619780468;
                    } else {
                        iM6987 = C2105.m6981("ܿ۟") ^ i81;
                        i66 = ((iM6987 ^ i80) * (-22107)) ^ 1552186747;
                        i67 = -939055663;
                    }
                    i72 = iM6987 ^ i67;
                    i110 = i110;
                    c115718 = c115718;
                    i50 = i88;
                    i83 = i72;
                    i82 = i66;
                    i84 = i84;
                    i88 = i50;
                    break;
                case -695288752:
                case 1630693154:
                    C21923.m49329();
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        i88 = i88;
                        c115718 = c115718;
                        i108 = i108;
                        i110 = i110;
                        i84 = i84;
                        i85 = i85;
                        drawable = drawable;
                        rect3 = rect3;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        iM6986 = (i80 - C2105.m6981("ܰ۠")) * (-119);
                        i61 = ((iM6986 ^ i81) * 10835) ^ 1096564857;
                        i62 = -523084893;
                        int i11116 = iM6986 ^ i62;
                        i108 = i108;
                        i82 = i61;
                        i85 = i85;
                        i110 = i110;
                        c115718 = c115718;
                        rect2 = rect3;
                        drawable = drawable;
                        i84 = i84;
                        i88 = i88;
                        i83 = i11116;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect3 = rect2;
                    } else {
                        iM25612 = C0630.m2566("ܳܳ") ^ i81;
                        i76 = ((iM25612 ^ i80) * 28015) ^ (-1224382644);
                        i79 = -630526584;
                        i83 = iM25612 ^ i79;
                        i82 = i76;
                    }
                    break;
                case -556903755:
                case 619679521:
                    RunnableC1937.m6387();
                    if (C4263.f13799 > 0) {
                        i25 = i88;
                        i26 = pixel4;
                        i84 = i84;
                        i27 = i97;
                        drawable = drawable;
                        i28 = i92;
                        i29 = i105;
                        rect3 = rect3;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        config3 = config4;
                        c115714 = c115717;
                        i31 = pixel2;
                        i32 = iM3783;
                        i33 = i108;
                        i34 = i85;
                        i35 = pixel3;
                        c115713 = c115718;
                        i30 = i110;
                        iM2566 = C0630.m2566("۟۫") ^ i80;
                        i36 = ((iM2566 ^ i81) * (-2007)) ^ (-295599371);
                        i37 = 525328202;
                        int i1217 = iM2566 ^ i37;
                        i105 = i29;
                        i92 = i28;
                        i97 = i27;
                        pixel4 = i26;
                        i50 = i25;
                        i83 = i1217;
                        i82 = i36;
                        i110 = i30;
                        c115718 = c115713;
                        pixel3 = i35;
                        i85 = i34;
                        i108 = i33;
                        iM3783 = i32;
                        pixel2 = i31;
                        c115717 = c115714;
                        config4 = config3;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect3 = rect3;
                        drawable = drawable;
                        i84 = i84;
                        i88 = i50;
                    }
                    i88 = i88;
                    i15 = pixel4;
                    i84 = i84;
                    i19 = i97;
                    drawable = drawable;
                    i21 = i92;
                    i22 = i105;
                    rect3 = rect3;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    i24 = intrinsicHeight;
                    C11579 c115725 = c115718;
                    i110 = i110;
                    i23 = intrinsicWidth;
                    config2 = config4;
                    c115711 = c115717;
                    i14 = pixel2;
                    i16 = iM3783;
                    i17 = i108;
                    i18 = i85;
                    i20 = pixel3;
                    c115712 = c115725;
                    int iM25618 = (C0630.m2566("᩺᩶") + i80) * 59;
                    int i1218 = i23;
                    i105 = i22;
                    i92 = i21;
                    i97 = i19;
                    pixel4 = i15;
                    i50 = i88;
                    i83 = iM25618 ^ (-2055180330);
                    i82 = ((iM25618 ^ i81) * (-29941)) ^ (-249184372);
                    i110 = i110;
                    c115718 = c115712;
                    pixel3 = i20;
                    i85 = i18;
                    i108 = i17;
                    iM3783 = i16;
                    pixel2 = i14;
                    c115717 = c115711;
                    config4 = config2;
                    intrinsicWidth = i1218;
                    intrinsicHeight = i24;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect3 = rect3;
                    drawable = drawable;
                    i84 = i84;
                    i88 = i50;
                    break;
                case -523690578:
                case 1495941991:
                    c115715 = c115718;
                    iM16663 = c5934M28468.m16662();
                    iM6984 = C0630.m2566("۟ۛ") ^ i81;
                    i40 = ((iM6984 ^ i80) * (-28969)) ^ 1109208629;
                    i41 = -2048610524;
                    int i11117 = iM6984 ^ i41;
                    i105 = i105;
                    i92 = i92;
                    i97 = i97;
                    pixel4 = pixel4;
                    int i11118 = i88;
                    i83 = i11117;
                    i82 = i40;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect3 = rect3;
                    drawable = drawable;
                    i84 = i84;
                    i88 = i11118;
                    int i11119 = pixel2;
                    c115717 = c115717;
                    i110 = i110;
                    c115718 = c115715;
                    pixel3 = pixel3;
                    i85 = i85;
                    i108 = i108;
                    iM3783 = iM3783;
                    pixel2 = i11119;
                    break;
                case -465299949:
                case 2033065087:
                    i88 = i88;
                    c115718 = c115718;
                    i108 = i108;
                    i110 = i110;
                    i84 = i84;
                    i85 = i85;
                    drawable = drawable;
                    rect3 = rect3;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    iRed2 = Color.red(i92) - Color.red(i108);
                    iGreen2 = Color.green(i92) - Color.green(i108);
                    if (C0630.f2410 > 0) {
                        iM6986 = C0630.m2566("ۢۧ") ^ i81;
                        i61 = ((iM6986 ^ i80) * 31681) ^ 759828582;
                        i62 = 695639084;
                        int i111110 = iM6986 ^ i62;
                        i108 = i108;
                        i82 = i61;
                        i85 = i85;
                        i110 = i110;
                        c115718 = c115718;
                        rect2 = rect3;
                        drawable = drawable;
                        i84 = i84;
                        i88 = i88;
                        i83 = i111110;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect3 = rect2;
                    } else {
                        i18 = i85;
                        i23 = intrinsicWidth;
                        i24 = intrinsicHeight;
                        config2 = config4;
                        c115711 = c115717;
                        i14 = pixel2;
                        i20 = pixel3;
                        i16 = iM3783;
                        i17 = i108;
                        c115712 = c115718;
                        i15 = pixel4;
                        i19 = i97;
                        i21 = i92;
                        i22 = i105;
                        int iM25619 = (C0630.m2566("᩺᩶") + i80) * 59;
                        int i1219 = i23;
                        i105 = i22;
                        i92 = i21;
                        i97 = i19;
                        pixel4 = i15;
                        i50 = i88;
                        i83 = iM25619 ^ (-2055180330);
                        i82 = ((iM25619 ^ i81) * (-29941)) ^ (-249184372);
                        i110 = i110;
                        c115718 = c115712;
                        pixel3 = i20;
                        i85 = i18;
                        i108 = i17;
                        iM3783 = i16;
                        pixel2 = i14;
                        c115717 = c115711;
                        config4 = config2;
                        intrinsicWidth = i1219;
                        intrinsicHeight = i24;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect3 = rect3;
                        drawable = drawable;
                        i84 = i84;
                        i88 = i50;
                    }
                    break;
                case -441856370:
                case 166842265:
                    C0798.m2998();
                    C2520.m8026();
                    break;
                case -392943625:
                case 34747330:
                    i88 = i88;
                    c5934M28467 = c115718.m28465(C22867.f73781);
                    iM25610 = C0630.m2566("᩻ۛ") ^ i80;
                    i76 = ((iM25610 ^ i81) * 11781) ^ (-126903190);
                    i77 = 1352851375;
                    int i12110 = iM25610 ^ i77;
                    i88 = i88;
                    i83 = i12110;
                    i82 = i76;
                    break;
                case -381230069:
                case -269647871:
                    i88 = i88;
                    c115718 = c115718;
                    i110 = i110;
                    i84 = i84;
                    iM28467 = new C12284(bitmapCreateBitmap2).m29816().m28467();
                    dM20001 = C7466.m20001(i111, iM28467);
                    d = 10.0d;
                    if (dM20001 < 10.0d) {
                        iM6987 = (C0630.m2566("ۧۙ") + i81) * 61;
                        i66 = ((iM6987 ^ i80) * (-22917)) ^ (-1571353133);
                        i67 = 353046444;
                    } else {
                        iM6987 = (i81 - C2105.m6981("ᩴۨ")) * 115;
                        i66 = ((iM6987 ^ i80) * (-29015)) ^ (-494726357);
                        i67 = 959589248;
                    }
                    i72 = iM6987 ^ i67;
                    i110 = i110;
                    c115718 = c115718;
                    i50 = i88;
                    i83 = i72;
                    i82 = i66;
                    i84 = i84;
                    i88 = i50;
                    break;
                case -298442048:
                case -73844593:
                    if (C3245.f10203 > 0) {
                        i88 = i88;
                        i15 = pixel4;
                        i84 = i84;
                        i19 = i97;
                        drawable = drawable;
                        i21 = i92;
                        i22 = i105;
                        rect3 = rect3;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        i24 = intrinsicHeight;
                        C11579 c115726 = c115718;
                        i110 = i110;
                        i23 = intrinsicWidth;
                        config2 = config4;
                        c115711 = c115717;
                        i14 = pixel2;
                        i16 = iM3783;
                        i17 = i108;
                        i18 = i85;
                        i20 = pixel3;
                        c115712 = c115726;
                        int iM256110 = (C0630.m2566("᩺᩶") + i80) * 59;
                        int i12111 = i23;
                        i105 = i22;
                        i92 = i21;
                        i97 = i19;
                        pixel4 = i15;
                        i50 = i88;
                        i83 = iM256110 ^ (-2055180330);
                        i82 = ((iM256110 ^ i81) * (-29941)) ^ (-249184372);
                        i110 = i110;
                        c115718 = c115712;
                        pixel3 = i20;
                        i85 = i18;
                        i108 = i17;
                        iM3783 = i16;
                        pixel2 = i14;
                        c115717 = c115711;
                        config4 = config2;
                        intrinsicWidth = i12111;
                        intrinsicHeight = i24;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect3 = rect3;
                        drawable = drawable;
                        i84 = i84;
                        i88 = i50;
                    } else {
                        iM25612 = C0630.m2566("ᩴۡ") ^ i81;
                        i76 = ((iM25612 ^ i80) * (-28247)) ^ (-713602761);
                        i79 = 1034869852;
                        i83 = iM25612 ^ i79;
                        i82 = i76;
                    }
                    break;
                case -168495066:
                case 1102384298:
                    i88 = i88;
                    c115718 = c115718;
                    i108 = i108;
                    i110 = i110;
                    i84 = i84;
                    canvas.drawColor(i108);
                    drawable = drawable;
                    drawable.draw(canvas);
                    Rect rect7 = rect3;
                    drawable.setBounds(rect7);
                    if (!z) {
                        rect3 = rect7;
                        iM2568 = C2105.m6981("ۡۙ") ^ i80;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        i64 = ((iM2568 ^ i81) * (-15439)) ^ 1059395165;
                        i65 = -1243078465;
                        int i1310 = iM2568 ^ i65;
                        i108 = i108;
                        i82 = i64;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect3 = rect3;
                        drawable = drawable;
                        i84 = i84;
                        i88 = i88;
                        i83 = i1310;
                        i110 = i110;
                        c115718 = c115718;
                    } else {
                        int iM69816 = (i81 - C2105.m6981("᩷ܺ")) * (-109);
                        i108 = i108;
                        i82 = ((iM69816 ^ i80) * 9331) ^ 829504445;
                        i110 = i110;
                        c115718 = c115718;
                        rect2 = rect7;
                        drawable = drawable;
                        i84 = i84;
                        i88 = i88;
                        i83 = iM69816 ^ (-1804484808);
                        rect3 = rect2;
                    }
                    break;
                case -165363358:
                case 1963483693:
                    fArr[c] = f + f2;
                    iM25610 = C2105.m6981("ܳܽ") ^ i80;
                    i76 = ((iM25610 ^ i81) * (-29767)) ^ (-1697787327);
                    i77 = 1123562748;
                    int i12112 = iM25610 ^ i77;
                    i88 = i88;
                    i83 = i12112;
                    i82 = i76;
                    break;
                case -143429289:
                case 1517896806:
                    C0714.m2805();
                    if (!C1420.m4913()) {
                        i88 = i88;
                        c115718 = c115718;
                        i108 = i108;
                        i110 = i110;
                        i84 = i84;
                        i85 = i85;
                        drawable = drawable;
                        rect3 = rect3;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        iM6986 = (i80 - C2105.m6981("ܰ۠")) * (-119);
                        i61 = ((iM6986 ^ i81) * 10835) ^ 1096564857;
                        i62 = -523084893;
                        int i111111 = iM6986 ^ i62;
                        i108 = i108;
                        i82 = i61;
                        i85 = i85;
                        i110 = i110;
                        c115718 = c115718;
                        rect2 = rect3;
                        drawable = drawable;
                        i84 = i84;
                        i88 = i88;
                        i83 = i111111;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect3 = rect2;
                    } else {
                        i88 = i88;
                        pixel = i97;
                        i84 = i84;
                        i44 = i92;
                        i45 = i105;
                        drawable = drawable;
                        rect3 = rect3;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        pixel2 = pixel2;
                        iM3783 = iM3783;
                        i108 = i108;
                        i85 = i85;
                        pixel3 = pixel3;
                        c115718 = c115718;
                        i110 = i110;
                        int iM25620 = C0630.m2566("۠ᩴ") ^ i81;
                        int i160 = ((iM25620 ^ i80) * (-19987)) ^ (-728331023);
                        i63 = iM25620 ^ (-359492599);
                        i105 = i45;
                        i92 = i44;
                        i97 = pixel;
                        i82 = i160;
                        i50 = i88;
                        i83 = i63;
                        i110 = i110;
                        c115718 = c115718;
                        pixel3 = pixel3;
                        i85 = i85;
                        i108 = i108;
                        iM3783 = iM3783;
                        pixel2 = pixel2;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect3 = rect3;
                        drawable = drawable;
                        i84 = i84;
                        i88 = i50;
                    }
                    break;
                case -61084807:
                case 1874129571:
                    i68 = 520093696;
                    i102 = i101;
                    iM2569 = C0630.m2566("ܿܶ") ^ i80;
                    i69 = i68;
                    i82 = ((iM2569 ^ i81) * 21375) ^ 1562511139;
                    i70 = 507063844;
                    i110 = i110;
                    c115718 = c115718;
                    i50 = i69;
                    i83 = iM2569 ^ i70;
                    i84 = i84;
                    i88 = i50;
                    break;
                case -4554172:
                case 1513162985:
                    if (ServiceConnectionC3453.f10921 < 0) {
                        i88 = i88;
                        i4 = pixel4;
                        rect = rect3;
                        i84 = i84;
                        bitmap = bitmapCreateBitmap;
                        config = config4;
                        c11579 = c115717;
                        i8 = i97;
                        i3 = pixel2;
                        i5 = iM3783;
                        i6 = i108;
                        i7 = i85;
                        i10 = i92;
                        i9 = pixel3;
                        i11 = i105;
                        c115710 = c115718;
                        i110 = i110;
                        iM6982 = (i80 - C2105.m6981("᩻ۢ")) * (-75);
                        i12 = ((iM6982 ^ i81) * (-6137)) ^ (-260767005);
                        i13 = -2060227504;
                        int i1121 = iM6982 ^ i13;
                        i105 = i11;
                        i92 = i10;
                        i97 = i8;
                        pixel4 = i4;
                        Bitmap bitmap6 = bitmap;
                        rect3 = rect;
                        i82 = i12;
                        i84 = i84;
                        i88 = i88;
                        i83 = i1121;
                        i110 = i110;
                        c115718 = c115710;
                        pixel3 = i9;
                        i85 = i7;
                        i108 = i6;
                        iM3783 = i5;
                        pixel2 = i3;
                        c115717 = c11579;
                        config4 = config;
                        bitmapCreateBitmap = bitmap6;
                    } else {
                        i88 = i88;
                        i15 = pixel4;
                        i84 = i84;
                        i19 = i97;
                        drawable = drawable;
                        i21 = i92;
                        i22 = i105;
                        rect3 = rect3;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        i24 = intrinsicHeight;
                        C11579 c115727 = c115718;
                        i110 = i110;
                        i23 = intrinsicWidth;
                        config2 = config4;
                        c115711 = c115717;
                        i14 = pixel2;
                        i16 = iM3783;
                        i17 = i108;
                        i18 = i85;
                        i20 = pixel3;
                        c115712 = c115727;
                        int iM256111 = (C0630.m2566("᩺᩶") + i80) * 59;
                        int i12113 = i23;
                        i105 = i22;
                        i92 = i21;
                        i97 = i19;
                        pixel4 = i15;
                        i50 = i88;
                        i83 = iM256111 ^ (-2055180330);
                        i82 = ((iM256111 ^ i81) * (-29941)) ^ (-249184372);
                        i110 = i110;
                        c115718 = c115712;
                        pixel3 = i20;
                        i85 = i18;
                        i108 = i17;
                        iM3783 = i16;
                        pixel2 = i14;
                        c115717 = c115711;
                        config4 = config2;
                        intrinsicWidth = i12113;
                        intrinsicHeight = i24;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect3 = rect3;
                        drawable = drawable;
                        i84 = i84;
                        i88 = i50;
                    }
                    break;
                case 217860286:
                case 544637131:
                    z = true;
                    iM6986 = (i80 - C0630.m2566("۠֫")) * 89;
                    i61 = ((iM6986 ^ i81) * (-8327)) ^ (-700864898);
                    i62 = -1206887563;
                    int i111112 = iM6986 ^ i62;
                    i108 = i108;
                    i82 = i61;
                    i85 = i85;
                    i110 = i110;
                    c115718 = c115718;
                    rect2 = rect3;
                    drawable = drawable;
                    i84 = i84;
                    i88 = i88;
                    i83 = i111112;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect3 = rect2;
                    break;
                case 249112737:
                case 913878154:
                    i88 = i88;
                    c115718 = c115718;
                    if (c5934M28467 == null) {
                        iM6989 = (i80 - C0630.m2566("ܿۛ")) * 13;
                        i73 = ((iM6989 ^ i81) * 27455) ^ 1067792952;
                        i74 = 309809762;
                    } else {
                        c5934M28469 = c5934M28467;
                        iM6989 = C0630.m2566("۠ۗ") ^ i81;
                        i73 = ((iM6989 ^ i80) * (-28051)) ^ 1755802998;
                        i74 = -2065898405;
                    }
                    int i1122 = iM6989 ^ i74;
                    c115718 = c115718;
                    i50 = i88;
                    i83 = i1122;
                    i82 = i73;
                    i88 = i50;
                    break;
                case 469245639:
                case 1643183648:
                    i88 = i88;
                    c115718 = c115718;
                    i110 = i110;
                    i84 = i84;
                    canvas.drawColor(855638016);
                    iM6987 = C0630.m2566("ܳ۬") ^ i81;
                    i66 = ((iM6987 ^ i80) * (-3831)) ^ 353844862;
                    i67 = -585487558;
                    i72 = iM6987 ^ i67;
                    i110 = i110;
                    c115718 = c115718;
                    i50 = i88;
                    i83 = i72;
                    i82 = i66;
                    i84 = i84;
                    i88 = i50;
                    break;
                case 489318721:
                case 1216627375:
                    i88 = i88;
                    c115718 = c115718;
                    i108 = i108;
                    i110 = i110;
                    i84 = i84;
                    i85 = i85;
                    drawable = drawable;
                    rect3 = rect3;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    iBlue2 = Color.blue(i92) - Color.blue(i108);
                    i100 = iRed2 * iRed2;
                    if (C0798.f2919) {
                        iM6986 = (i80 - C2105.m6981("ܰ۠")) * (-119);
                        i61 = ((iM6986 ^ i81) * 10835) ^ 1096564857;
                        i62 = -523084893;
                    } else {
                        iM6986 = (C2105.m6981("ܿۗ") + i80) * (-55);
                        i61 = ((iM6986 ^ i81) * (-10949)) ^ 651670812;
                        i62 = 96585202;
                    }
                    int i111113 = iM6986 ^ i62;
                    i108 = i108;
                    i82 = i61;
                    i85 = i85;
                    i110 = i110;
                    c115718 = c115718;
                    rect2 = rect3;
                    drawable = drawable;
                    i84 = i84;
                    i88 = i88;
                    i83 = i111113;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect3 = rect2;
                    break;
                case 527790803:
                case 2027979030:
                    int i161 = i88;
                    c115718 = c115718;
                    i110 = i110;
                    i84 = i84;
                    canvas.drawColor(i102 & 1157627903);
                    C2093.m6875(bitmapCreateBitmap2);
                    canvas.drawColor(i161);
                    if (!C21943.m49431()) {
                        i88 = i161;
                        iM6987 = C0630.m2566("ܳ۬") ^ i81;
                        i66 = ((iM6987 ^ i80) * (-3831)) ^ 353844862;
                        i67 = -585487558;
                        i72 = iM6987 ^ i67;
                        i110 = i110;
                        c115718 = c115718;
                        i50 = i88;
                        i83 = i72;
                        i82 = i66;
                        i84 = i84;
                        i88 = i50;
                    } else {
                        iM2569 = (C0630.m2566("ۚܽ") ^ i80) * (-59);
                        i69 = i161;
                        i82 = ((iM2569 ^ i81) * (-20659)) ^ (-502608359);
                        i70 = 1344475161;
                        i110 = i110;
                        c115718 = c115718;
                        i50 = i69;
                        i83 = iM2569 ^ i70;
                        i84 = i84;
                        i88 = i50;
                    }
                    break;
                case 575889767:
                case 1360299860:
                    i88 = i88;
                    c115718 = c115718;
                    i110 = i110;
                    i84 = i84;
                    if (z2) {
                        iM6987 = C0630.m2566("֨ܳ") ^ i80;
                        i66 = ((iM6987 ^ i81) * (-29551)) ^ (-1699291347);
                        i67 = 729895865;
                    } else {
                        iM6987 = (C0630.m2566("ۢܿ") ^ i81) * (-119);
                        i66 = ((iM6987 ^ i80) * 11799) ^ 797398402;
                        i67 = -931866304;
                    }
                    i72 = iM6987 ^ i67;
                    i110 = i110;
                    c115718 = c115718;
                    i50 = i88;
                    i83 = i72;
                    i82 = i66;
                    i84 = i84;
                    i88 = i50;
                    break;
                case 606182003:
                case 630455453:
                    i88 = i88;
                    fArr[1] = Math.min(1.0f, fArr[1] * 1.2f);
                    button.getBackground().setColorFilter(Color.HSVToColor(fArr), PorterDuff.Mode.SRC_IN);
                    iM25610 = C2105.m6981("۬ᩴ") ^ i80;
                    i76 = ((iM25610 ^ i81) * 17999) ^ 1050360677;
                    i77 = 67112820;
                    int i12114 = iM25610 ^ i77;
                    i88 = i88;
                    i83 = i12114;
                    i82 = i76;
                    break;
                case 613656519:
                case 2022947590:
                    i88 = i88;
                    c115716 = c115718;
                    i110 = i110;
                    i84 = i84;
                    int i162 = i85;
                    drawable = drawable;
                    rect3 = rect3;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    i51 = iM3783;
                    iRgb3 = Color.rgb(i51, RunnableC1108.m3783(i98 / i99, i90), RunnableC1108.m3783((i95 * 5) / 4, i90));
                    i85 = i162;
                    i53 = iRgb;
                    i52 = i53;
                    i101 = iRgb2;
                    i105 = i105;
                    int iM256112 = C0630.m2566("ۘۢ") ^ i80;
                    int i1510 = i53;
                    i82 = ((iM256112 ^ i81) * 2451) ^ (-1571828105);
                    iM3783 = i51;
                    i85 = i85;
                    i108 = i52;
                    i110 = i110;
                    c115718 = c115716;
                    Rect rect8 = rect3;
                    drawable = drawable;
                    i84 = i84;
                    i88 = i88;
                    i83 = iM256112 ^ (-223070441);
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect3 = rect8;
                    i105 = i105;
                    i92 = i1510;
                    break;
                case 652643238:
                case 790758260:
                    i88 = i88;
                    float[] fArr4 = new float[i89];
                    C7466.m20004(c5934M28469.m16662(), fArr4);
                    f = fArr4[c];
                    f2 = 0.08f;
                    if (f < 0.7f) {
                        iM25611 = (C2105.m6981("ۙ۟") ^ i80) * 123;
                        i75 = ((iM25611 ^ i81) * (-32355)) ^ (-1877151078);
                        i78 = 528587932;
                    } else {
                        iM25611 = (C0630.m2566("ۖۤ") ^ i81) * (-89);
                        i75 = ((iM25611 ^ i80) * 3579) ^ 841727243;
                        i78 = 1633904325;
                    }
                    i46 = iM25611 ^ i78;
                    fArr = fArr4;
                    i82 = i75;
                    i88 = i88;
                    i83 = i46;
                    break;
                case 713793591:
                case 1115543756:
                    i88 = i88;
                    c5934M28469 = c115718.m28468();
                    c115718 = c115718;
                    iM6989 = C0630.m2566("۠ۗ") ^ i81;
                    i73 = ((iM6989 ^ i80) * (-28051)) ^ 1755802998;
                    i74 = -2065898405;
                    int i1123 = iM6989 ^ i74;
                    c115718 = c115718;
                    i50 = i88;
                    i83 = i1123;
                    i82 = i73;
                    i88 = i50;
                    break;
                case 758646128:
                case 827809869:
                    C3019.m9255();
                    C4075.m12263();
                    iM25612 = C0630.m2566("ᩴۡ") ^ i81;
                    i76 = ((iM25612 ^ i80) * (-28247)) ^ (-713602761);
                    i79 = 1034869852;
                    i83 = iM25612 ^ i79;
                    i82 = i76;
                    break;
                case 771026938:
                case 1176379800:
                    i88 = i88;
                    c115718 = c115718;
                    if (i84 < i85) {
                        iM6989 = C2105.m6981("ۜ֨") ^ i81;
                        i73 = ((iM6989 ^ i80) * 28079) ^ (-599375915);
                        i74 = 813891619;
                    } else {
                        iM6989 = C2105.m6981("᩺᩹") ^ i81;
                        i73 = ((iM6989 ^ i80) * 26767) ^ (-971497945);
                        i74 = 73105902;
                    }
                    int i1124 = iM6989 ^ i74;
                    c115718 = c115718;
                    i50 = i88;
                    i83 = i1124;
                    i82 = i73;
                    i88 = i50;
                    break;
                case 805627897:
                case 1780117744:
                    i88 = i88;
                    C2093.m6875(bitmapCreateBitmap);
                    C11579 c11579M29817 = new C12284(bitmapCreateBitmap).m29816();
                    C5934 c5934M284610 = c11579M29817.m28465(C22867.f73785);
                    if (c5934M284610 != null) {
                        c115718 = c11579M29817;
                        c5934M28467 = c5934M284610;
                        iM25610 = C0630.m2566("᩻ۛ") ^ i80;
                        i76 = ((iM25610 ^ i81) * 11781) ^ (-126903190);
                        i77 = 1352851375;
                        int i12115 = iM25610 ^ i77;
                        i88 = i88;
                        i83 = i12115;
                        i82 = i76;
                    } else {
                        int iM25621 = (i81 - C0630.m2566("ۡ֡")) * (-65);
                        i75 = ((iM25621 ^ i80) * 12021) ^ 1797801524;
                        i46 = iM25621 ^ (-1228723078);
                        c115718 = c11579M29817;
                        i82 = i75;
                        i88 = i88;
                        i83 = i46;
                    }
                    break;
                case 901763351:
                case 1623003549:
                    i84 = i84;
                    c115718 = c115718;
                    i110 = i110;
                    i68 = 553648127;
                    i102 = i108;
                    iM2569 = C0630.m2566("ܿܶ") ^ i80;
                    i69 = i68;
                    i82 = ((iM2569 ^ i81) * 21375) ^ 1562511139;
                    i70 = 507063844;
                    i110 = i110;
                    c115718 = c115718;
                    i50 = i69;
                    i83 = iM2569 ^ i70;
                    i84 = i84;
                    i88 = i50;
                    break;
                case 936467278:
                case 1192570792:
                    i88 = i88;
                    c115718 = c115718;
                    i110 = i110;
                    i84 = i84;
                    int i163 = i105;
                    drawable = drawable;
                    rect3 = rect3;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    int i164 = i92;
                    int i165 = i108;
                    i54 = i85;
                    i55 = iM3783;
                    i56 = i165;
                    int i166 = i106;
                    if (i166 < 5) {
                        int iM25622 = C0630.m2566("ۙۗ") ^ i81;
                        i82 = ((iM25622 ^ i80) * (-14781)) ^ 2068296520;
                        i106 = i166;
                        i105 = i163;
                        i110 = i110;
                        i92 = i164;
                        c115718 = c115718;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect3 = rect3;
                        drawable = drawable;
                        i84 = i84;
                        i88 = i88;
                        i83 = iM25622 ^ (-1289531353);
                        i91 = 5;
                    } else {
                        int iM69817 = C2105.m6981("᩺ܽ") ^ i81;
                        i106 = i166;
                        i57 = ((iM69817 ^ i80) * 20223) ^ 2067462220;
                        i58 = iM69817 ^ 191830709;
                        i105 = i163;
                        i91 = 5;
                        i92 = i164;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect3 = rect3;
                        drawable = drawable;
                        i84 = i84;
                        i88 = i88;
                        i83 = i58;
                        i82 = i57;
                        i110 = i110;
                        c115718 = c115718;
                    }
                    int i111114 = i56;
                    iM3783 = i55;
                    i85 = i54;
                    i108 = i111114;
                    break;
                case 963504663:
                case 1248446727:
                    i88 = i88;
                    i44 = i92;
                    i45 = i105;
                    iM3783 = iM3783;
                    c115718 = c115718;
                    i108 = i108;
                    i110 = i110;
                    i84 = i84;
                    i85 = i85;
                    drawable = drawable;
                    rect3 = rect3;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    pixel = bitmapCreateBitmap2.getPixel(i109, i109);
                    pixel2 = bitmapCreateBitmap2.getPixel(i109, 99);
                    pixel3 = bitmapCreateBitmap2.getPixel(50, 50);
                    pixel4 = bitmapCreateBitmap2.getPixel(99, i109);
                    if (C4263.f13799 > 0) {
                        int iM25623 = (i80 - C0630.m2566("ۗۘ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        int i167 = ((iM25623 ^ i81) * (-32243)) ^ (-507542765);
                        i46 = iM25623 ^ (-1362520088);
                        i105 = i45;
                        i92 = i44;
                        i104 = 99;
                        i97 = pixel;
                        i82 = i167;
                        i110 = i110;
                        c115718 = c115718;
                        pixel3 = pixel3;
                        i85 = i85;
                        i108 = i108;
                        iM3783 = iM3783;
                        pixel2 = pixel2;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect3 = rect3;
                        drawable = drawable;
                        i84 = i84;
                        i88 = i88;
                        i83 = i46;
                    } else {
                        i104 = 99;
                        int iM25624 = C0630.m2566("۠ᩴ") ^ i81;
                        int i168 = ((iM25624 ^ i80) * (-19987)) ^ (-728331023);
                        i63 = iM25624 ^ (-359492599);
                        i105 = i45;
                        i92 = i44;
                        i97 = pixel;
                        i82 = i168;
                        i50 = i88;
                        i83 = i63;
                        i110 = i110;
                        c115718 = c115718;
                        pixel3 = pixel3;
                        i85 = i85;
                        i108 = i108;
                        iM3783 = iM3783;
                        pixel2 = pixel2;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect3 = rect3;
                        drawable = drawable;
                        i84 = i84;
                        i88 = i50;
                    }
                    break;
                case 1060114334:
                case 1617347552:
                    i88 = i88;
                    c115718 = c115718;
                    i110 = i110;
                    i84 = i84;
                    drawable = drawable;
                    rect3 = rect3;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    int i169 = i108;
                    i54 = i85;
                    i55 = iM3783;
                    i56 = i169;
                    int i170 = iRed / i91;
                    int i171 = iGreen / i91;
                    int i172 = iBlue / i91;
                    iRgb = Color.rgb(i170, i171, i172);
                    i105 = (i170 * 3) / 4;
                    i96 = 3;
                    if (C0483.f2088 >= 0) {
                        i93 = i170;
                        i94 = i171;
                        i95 = i172;
                        int iM69818 = (C2105.m6981("ۙۢ") + i81) * 109;
                        i57 = ((iM69818 ^ i80) * (-15059)) ^ (-387382326);
                        i58 = iM69818 ^ 715698527;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect3 = rect3;
                        drawable = drawable;
                        i84 = i84;
                        i88 = i88;
                        i83 = i58;
                        i82 = i57;
                    } else {
                        int iM25625 = (i80 - C0630.m2566("ܽۜ")) * (-117);
                        i82 = ((iM25625 ^ i81) * 5599) ^ 505690535;
                        i95 = i172;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect3 = rect3;
                        drawable = drawable;
                        i84 = i84;
                        i88 = i88;
                        i83 = iM25625 ^ (-1305206754);
                        i93 = i170;
                        i94 = i171;
                    }
                    i110 = i110;
                    c115718 = c115718;
                    int i111115 = i56;
                    iM3783 = i55;
                    i85 = i54;
                    i108 = i111115;
                    break;
                case 1255876560:
                case 2057517842:
                    i68 = 939524096;
                    i102 = i101;
                    iM2569 = C0630.m2566("ܿܶ") ^ i80;
                    i69 = i68;
                    i82 = ((iM2569 ^ i81) * 21375) ^ 1562511139;
                    i70 = 507063844;
                    i110 = i110;
                    c115718 = c115718;
                    i50 = i69;
                    i83 = iM2569 ^ i70;
                    i84 = i84;
                    i88 = i50;
                    break;
                case 1545773285:
                case 1992266020:
                    canvas.drawColor(Color.argb(i86, i109, i109, i109));
                    i110 = i110;
                    i84 = i84;
                    iM6987 = (i81 - C2105.m6981("ᩴۨ")) * 115;
                    i66 = ((iM6987 ^ i80) * (-29015)) ^ (-494726357);
                    i67 = 959589248;
                    i72 = iM6987 ^ i67;
                    i110 = i110;
                    c115718 = c115718;
                    i50 = i88;
                    i83 = i72;
                    i82 = i66;
                    i84 = i84;
                    i88 = i50;
                    break;
                default:
                    int i173 = i88;
                    C11579 c115728 = c115718;
                    int i174 = i108;
                    int i175 = i110;
                    int i176 = i84;
                    int i177 = i85;
                    int i178 = iM3783;
                    Drawable drawable4 = drawable;
                    Rect rect9 = rect3;
                    Bitmap bitmap7 = bitmapCreateBitmap;
                    int i179 = i105;
                    iRgb2 = Color.rgb(i179, (i94 * i96) / 4, (i95 * 3) / 4);
                    if (RunnableC3474.f10992 <= 0) {
                        iM6981 = (C2105.m6981("᩸ۗ") ^ i80) * 95;
                        i = ((iM6981 ^ i81) * (-31275)) ^ (-1205286421);
                        i2 = 1898052335;
                    } else {
                        iM6981 = C2105.m6981("۠֨") ^ i81;
                        i = ((iM6981 ^ i80) * (-23655)) ^ 1971233128;
                        i2 = 2035686159;
                    }
                    int i180 = iM6981 ^ i2;
                    i105 = i179;
                    i110 = i175;
                    c115718 = c115728;
                    i83 = i180;
                    i82 = i;
                    bitmapCreateBitmap = bitmap7;
                    rect3 = rect9;
                    drawable = drawable4;
                    i84 = i176;
                    i88 = i173;
                    iM3783 = i178;
                    i85 = i177;
                    i108 = i174;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x010f A[PHI: r5 r7 r14 r15 r20
      0x010f: PHI (r5v4 int) = (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:33:0x010d, B:29:0x00e7, B:26:0x00be] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:33:0x010d, B:29:0x00e7, B:26:0x00be] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r14v4 short[]) = (r14v2 short[]), (r14v3 short[]), (r14v2 short[]) binds: [B:33:0x010d, B:29:0x00e7, B:26:0x00be] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:33:0x010d, B:29:0x00e7, B:26:0x00be] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r20v17 l.ܶ᩵ܿ) = (r20v15 l.ܶ᩵ܿ), (r20v16 l.ܶ᩵ܿ), (r20v19 l.ܶ᩵ܿ) binds: [B:33:0x010d, B:29:0x00e7, B:26:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0286 A[PHI: r20
      0x0286: PHI (r20v9 l.ܶ᩵ܿ) = (r20v7 l.ܶ᩵ܿ), (r20v10 l.ܶ᩵ܿ) binds: [B:63:0x026e, B:53:0x0211] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0306 A[PHI: r10 r11 r13 r20
      0x0306: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:73:0x0304, B:41:0x0187, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0306: PHI (r11v4 short) = (r11v3 short), (r11v2 short), (r11v2 short) binds: [B:73:0x0304, B:41:0x0187, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0306: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]) binds: [B:73:0x0304, B:41:0x0187, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0306: PHI (r20v21 l.ܶ᩵ܿ) = (r20v4 l.ܶ᩵ܿ), (r20v13 l.ܶ᩵ܿ), (r20v22 l.ܶ᩵ܿ) binds: [B:73:0x0304, B:41:0x0187, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x037a A[PHI: r6 r16 r20
      0x037a: PHI (r6v5 java.lang.String) = (r6v2 java.lang.String), (r6v4 java.lang.String), (r6v2 java.lang.String) binds: [B:82:0x0378, B:59:0x0249, B:8:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x037a: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:82:0x0378, B:59:0x0249, B:8:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x037a: PHI (r20v25 l.ܶ᩵ܿ) = (r20v2 l.ܶ᩵ܿ), (r20v8 l.ܶ᩵ܿ), (r20v26 l.ܶ᩵ܿ) binds: [B:82:0x0378, B:59:0x0249, B:8:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007b, code lost:
    
        if (l.C7811.m20844() != 0) goto L12;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m30823(AbstractActivityC3346 abstractActivityC3346, C19099 c19099, Runnable runnable) {
        int iM6981;
        int i;
        int i2;
        int i3 = RunnableC0588.f2309;
        int i4 = C0422.f1886;
        int iM2566 = C0630.m2566("֡᩶") ^ i4;
        int i5 = ((iM2566 ^ i3) * 29093) ^ 1184592327;
        String strM11357 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2566 ^ 1406895323;
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 195382848;
        int i11 = 0;
        String strM7033 = null;
        String strM3603 = null;
        short[] sArr3 = null;
        int iM44017 = 0;
        int i12 = 0;
        StringBuilder sb = null;
        AbstractC15440 abstractC15440 = null;
        while (true) {
            i10 = i6 ^ (i5 & (((i10 ^ i3) * (-11489)) >> 31));
            switch (i10) {
                case -2128135605:
                case 527190570:
                    abstractC15440 = abstractC15440;
                    strM3603 = C1047.m3603(f37926, 48, 3, i12);
                    if (C4159.m12565() >= 0) {
                        iM6981 = C2105.m6981("ۗ۟") ^ i3;
                        i = ((iM6981 ^ i4) * (-31469)) ^ 524464262;
                        i2 = -114069014;
                    } else {
                        iM6981 = (C0630.m2566("᩹֨") ^ i3) * (-41);
                        i = ((iM6981 ^ i4) * 2643) ^ 27753897;
                        i2 = 1407798056;
                    }
                    AbstractC15440 abstractC15441 = abstractC15440;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    abstractC15440 = abstractC15441;
                    break;
                case -2045418180:
                case 219128218:
                    abstractC15440 = abstractC15440;
                    C1420.m4905(sb, strM7033);
                    sArr3 = f37926;
                    if (C2520.f8000 >= 0) {
                        iM6981 = C0630.m2566("֡ۢ") ^ i4;
                        i = ((iM6981 ^ i3) * 6271) ^ (-2050076406);
                        i2 = 840309257;
                    } else {
                        iM6981 = C2105.m6981("ۡ۠") ^ i3;
                        i = ((iM6981 ^ i4) * 2789) ^ (-1286454915);
                        i2 = 1844743564;
                    }
                    AbstractC15440 abstractC15442 = abstractC15440;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    abstractC15440 = abstractC15442;
                    break;
                case -1721608658:
                case 1966579821:
                    break;
                case -1656160545:
                case -885222483:
                    abstractC15440 = C16293.f50111;
                    sb = new StringBuilder();
                    strM7033 = C2126.m7033(c19099);
                    if (C4616.f14690 <= 0) {
                        iM6981 = C2105.m6981("֫ۡ") ^ i4;
                        abstractC15440 = abstractC15440;
                        i = ((iM6981 ^ i3) * (-25831)) ^ 553095905;
                        i2 = 1682206605;
                    } else {
                        iM6981 = C2105.m6981("ۚ᩻") ^ i3;
                        abstractC15440 = abstractC15440;
                        i = ((iM6981 ^ i4) * (-25401)) ^ 2022955983;
                        i2 = 535721074;
                    }
                    AbstractC15440 abstractC15443 = abstractC15440;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    abstractC15440 = abstractC15443;
                    break;
                case -1506396240:
                case 667399754:
                    abstractC15440 = abstractC15440;
                    s = sArr[47];
                    i11 = s * s;
                    if (C3245.f10203 <= 0) {
                        abstractC15440 = abstractC15440;
                        iM6981 = C2105.m6981("֫ۡ") ^ i4;
                        abstractC15440 = abstractC15440;
                        i = ((iM6981 ^ i3) * (-25831)) ^ 553095905;
                        i2 = 1682206605;
                    } else {
                        iM6981 = C0630.m2566("᩹ܳ") ^ i3;
                        i = ((iM6981 ^ i4) * 3415) ^ (-1962657465);
                        i2 = -1603694449;
                    }
                    AbstractC15440 abstractC15444 = abstractC15440;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    abstractC15440 = abstractC15444;
                    break;
                case -1367809375:
                case 1582610305:
                    abstractC15440 = abstractC15440;
                    C3245.m9923(sb, strM11357);
                    iM44017 = c19099.m44017();
                    if (C7106.f21815 != 0) {
                        iM6981 = (i4 - C0630.m2566("ۤ᩹")) * 93;
                        i = ((iM6981 ^ i3) * (-20887)) ^ 1194781471;
                        i2 = -437555965;
                    } else {
                        iM6981 = (C0630.m2566("ۢܺ") ^ i4) * (-11);
                        i = ((iM6981 ^ i3) * 14141) ^ 1954720295;
                        i2 = -649701205;
                    }
                    AbstractC15440 abstractC15445 = abstractC15440;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    abstractC15440 = abstractC15445;
                    break;
                case -862383847:
                case 1623741613:
                    C7811.m20844();
                    C7106.m19120();
                    abstractC15440 = abstractC15440;
                    iM6981 = C0630.m2566("֡ۢ") ^ i4;
                    i = ((iM6981 ^ i3) * 6271) ^ (-2050076406);
                    i2 = 840309257;
                    AbstractC15440 abstractC15446 = abstractC15440;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    abstractC15440 = abstractC15446;
                    break;
                case -708782507:
                case 206905967:
                    abstractC15440 = abstractC15440;
                    if (c19099.m44013() > Build.VERSION.SDK_INT) {
                        iM6981 = (i4 - C0630.m2566("ܽܽ")) * 3;
                        i = ((iM6981 ^ i3) * 22549) ^ 126570849;
                        i2 = 1060311607;
                    } else {
                        iM6981 = C2105.m6981("᩺ۖ") ^ i4;
                        i = ((iM6981 ^ i3) * (-7593)) ^ (-977307508);
                        i2 = -741020880;
                    }
                    AbstractC15440 abstractC15447 = abstractC15440;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    abstractC15440 = abstractC15447;
                    break;
                case -677871477:
                case -98639646:
                    abstractC15440 = abstractC15440;
                    int i13 = s + s2;
                    if ((i13 * i13) - i8 > 0) {
                        iM6981 = (i3 - C2105.m6981("᩷᩵")) * (-105);
                        i = ((iM6981 ^ i4) * 13221) ^ (-123288599);
                        i2 = -94818185;
                    } else {
                        iM6981 = (C0630.m2566("ۘ᩶") ^ i3) * 115;
                        i = ((iM6981 ^ i4) * 24363) ^ 1157799579;
                        i2 = 1764473030;
                    }
                    AbstractC15440 abstractC15448 = abstractC15440;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    abstractC15440 = abstractC15448;
                    break;
                case -419504677:
                case 883326150:
                    abstractC15440 = abstractC15440;
                    C0422.m1944(sb, iM44017);
                    sArr2 = f37926;
                    i9 = 52;
                    i7 = 4;
                    if (C0483.f2088 >= 0) {
                        iM6981 = (i4 - C0630.m2566("ۤ᩹")) * 93;
                        i = ((iM6981 ^ i3) * (-20887)) ^ 1194781471;
                        i2 = -437555965;
                    } else {
                        iM6981 = C2105.m6981("ۗܶ") ^ i3;
                        i = ((iM6981 ^ i4) * (-31799)) ^ 1162246003;
                        i2 = -1426916905;
                    }
                    AbstractC15440 abstractC15449 = abstractC15440;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    abstractC15440 = abstractC15449;
                    break;
                case -389320001:
                case 261441643:
                    if (C2520.f8000 < 0) {
                        iM6981 = C2105.m6981("֫ۡ") ^ i4;
                        abstractC15440 = abstractC15440;
                        i = ((iM6981 ^ i3) * (-25831)) ^ 553095905;
                        i2 = 1682206605;
                        AbstractC15440 abstractC154410 = abstractC15440;
                        i6 = iM6981 ^ i2;
                        i5 = i;
                        abstractC15440 = abstractC154410;
                    }
                    abstractC15440 = abstractC15440;
                    iM6981 = C2105.m6981("ۗ۟") ^ i3;
                    i = ((iM6981 ^ i4) * (-31469)) ^ 524464262;
                    i2 = -114069014;
                    AbstractC15440 abstractC154411 = abstractC15440;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    abstractC15440 = abstractC154411;
                    break;
                case -255868495:
                case 351152828:
                    C4263.m12821(new C13286(abstractActivityC3346, C3663.m11176(abstractC15440, C0422.m1959(sb)), c19099, runnable));
                    break;
                case -200298948:
                case 1345357588:
                    abstractC15440 = abstractC15440;
                    strM11357 = C3746.m11357(sArr3, 51, 1, i12);
                    if (C0714.m2805()) {
                        iM6981 = C0630.m2566("ۧ֫") ^ i4;
                        i = ((iM6981 ^ i3) * 8263) ^ 675383014;
                        i2 = -1231848956;
                    } else {
                        iM6981 = C0630.m2566("ۗܺ") ^ i3;
                        i = ((iM6981 ^ i4) * (-27427)) ^ (-1828434470);
                        i2 = 10056386;
                    }
                    AbstractC15440 abstractC154412 = abstractC15440;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    abstractC15440 = abstractC154412;
                    break;
                case 79758344:
                case 2144354578:
                    C1711.m5728(C0630.m2566(strM3603) ^ 2124552429);
                    break;
                case 242308551:
                case 581323312:
                    i12 = 26518;
                    iM6981 = C2105.m6981("ۛ᩻") ^ i4;
                    i = ((iM6981 ^ i3) * 28835) ^ 211190044;
                    i2 = 886366678;
                    AbstractC15440 abstractC154413 = abstractC15440;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    abstractC15440 = abstractC154413;
                    break;
                case 342605871:
                case 554604683:
                    abstractC15440 = abstractC15440;
                    if (c19099.m44010() > 26101061) {
                        iM6981 = C0630.m2566("ܽۙ") ^ i4;
                        i = ((iM6981 ^ i3) * 24817) ^ 1022854163;
                        i2 = 126348823;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ۗ֨")) * 101;
                        i = ((iM6981 ^ i4) * 13823) ^ 984952819;
                        i2 = -868163751;
                    }
                    AbstractC15440 abstractC154414 = abstractC15440;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    abstractC15440 = abstractC154414;
                    break;
                case 449900419:
                case 2091883034:
                    if (C0237.f1507 == 0) {
                        abstractC15440 = abstractC15440;
                        iM6981 = C0630.m2566("ۗܺ") ^ i3;
                        i = ((iM6981 ^ i4) * (-27427)) ^ (-1828434470);
                        i2 = 10056386;
                        AbstractC15440 abstractC154415 = abstractC15440;
                        i6 = iM6981 ^ i2;
                        i5 = i;
                        abstractC15440 = abstractC154415;
                    }
                    abstractC15440 = abstractC15440;
                    iM6981 = C0630.m2566("֡ۢ") ^ i4;
                    i = ((iM6981 ^ i3) * 6271) ^ (-2050076406);
                    i2 = 840309257;
                    AbstractC15440 abstractC154416 = abstractC15440;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    abstractC15440 = abstractC154416;
                    break;
                case 620767725:
                case 856284487:
                    C1420.m4905(sb, C1128.m3841(sArr2, i9, i7, i12));
                    if (C1005.m3501()) {
                        iM6981 = C2105.m6981("۬᩸") ^ i3;
                        abstractC15440 = abstractC15440;
                        i = ((iM6981 ^ i4) * (-24149)) ^ (-851093957);
                        i2 = -1927994337;
                    } else {
                        abstractC15440 = abstractC15440;
                        iM6981 = (i4 - C0630.m2566("ۤ᩹")) * 93;
                        i = ((iM6981 ^ i3) * (-20887)) ^ 1194781471;
                        i2 = -437555965;
                    }
                    AbstractC15440 abstractC154417 = abstractC15440;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    abstractC15440 = abstractC154417;
                    break;
                case 684980434:
                case 721284201:
                    C3537.m10746();
                    C5695.m16023();
                    break;
                case 742346199:
                case 1923656449:
                    abstractC15440 = abstractC15440;
                    if (c19099.m43999() <= 3) {
                        iM6981 = C0630.m2566("᩶ۗ") ^ i4;
                        i = ((iM6981 ^ i3) * 21441) ^ (-1849043093);
                        i2 = 971432107;
                    } else {
                        iM6981 = C0630.m2566("ܽۙ") ^ i4;
                        i = ((iM6981 ^ i3) * 24817) ^ 1022854163;
                        i2 = 126348823;
                    }
                    AbstractC15440 abstractC154418 = abstractC15440;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    abstractC15440 = abstractC154418;
                    break;
                case 965825786:
                case 1763082705:
                    abstractC15440 = abstractC15440;
                    int i14 = i11 + 109662784;
                    i8 = i14 + i14;
                    s2 = 10472;
                    if (C3537.f11231 >= 0) {
                        iM6981 = C0630.m2566("֡ۢ") ^ i4;
                        i = ((iM6981 ^ i3) * 6271) ^ (-2050076406);
                        i2 = 840309257;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ۙ᩸")) * 51;
                        i = ((iM6981 ^ i3) * 22499) ^ (-2087613934);
                        i2 = 212871620;
                    }
                    AbstractC15440 abstractC154419 = abstractC15440;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    abstractC15440 = abstractC154419;
                    break;
                case 1261440815:
                case 2136758095:
                    abstractC15440 = abstractC15440;
                    sArr = f37926;
                    if (C1005.f3721) {
                        iM6981 = (C2105.m6981("ۧ۫") ^ i4) * q.h;
                        i = ((iM6981 ^ i3) * 13069) ^ (-970217316);
                        i2 = 214607003;
                    } else {
                        iM6981 = C2105.m6981("ۗ۟") ^ i3;
                        i = ((iM6981 ^ i4) * (-31469)) ^ 524464262;
                        i2 = -114069014;
                    }
                    AbstractC15440 abstractC1544110 = abstractC15440;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    abstractC15440 = abstractC1544110;
                    break;
                case 1950928137:
                case 1972109332:
                    C21374.m48464(C13265.m32201(c19099.m44013()));
                    break;
                default:
                    i12 = 12947;
                    iM6981 = C2105.m6981("ۛ᩻") ^ i4;
                    i = ((iM6981 ^ i3) * 28835) ^ 211190044;
                    i2 = 886366678;
                    AbstractC15440 abstractC1544111 = abstractC15440;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    abstractC15440 = abstractC1544111;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00f7 A[PHI: r3
      0x00f7: PHI (r3v5 android.view.MenuItem) = (r3v4 android.view.MenuItem), (r3v2 android.view.MenuItem) binds: [B:29:0x00f5, B:16:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x012e A[PHI: r4 r9
      0x012e: PHI (r4v3 android.graphics.drawable.Drawable) = (r4v2 android.graphics.drawable.Drawable), (r4v5 android.graphics.drawable.Drawable) binds: [B:33:0x012c, B:6:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x012e: PHI (r9v4 java.lang.String) = (r9v3 java.lang.String), (r9v2 java.lang.String) binds: [B:33:0x012c, B:6:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x01c6 A[PHI: r2 r5 r6 r11 r15 r24
      0x01c6: PHI (r2v4 android.view.MenuInflater) = 
      (r2v2 android.view.MenuInflater)
      (r2v3 android.view.MenuInflater)
      (r2v2 android.view.MenuInflater)
      (r2v2 android.view.MenuInflater)
      (r2v2 android.view.MenuInflater)
     binds: [B:93:0x01c6, B:45:0x01c4, B:102:0x01c6, B:18:0x0091, B:16:0x008d] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r5v4 android.graphics.drawable.Drawable) = 
      (r5v2 android.graphics.drawable.Drawable)
      (r5v2 android.graphics.drawable.Drawable)
      (r5v3 android.graphics.drawable.Drawable)
      (r5v2 android.graphics.drawable.Drawable)
      (r5v2 android.graphics.drawable.Drawable)
     binds: [B:93:0x01c6, B:45:0x01c4, B:102:0x01c6, B:18:0x0091, B:16:0x008d] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r6v5 android.content.res.ColorStateList) = 
      (r6v2 android.content.res.ColorStateList)
      (r6v2 android.content.res.ColorStateList)
      (r6v4 android.content.res.ColorStateList)
      (r6v2 android.content.res.ColorStateList)
      (r6v2 android.content.res.ColorStateList)
     binds: [B:93:0x01c6, B:45:0x01c4, B:102:0x01c6, B:18:0x0091, B:16:0x008d] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:93:0x01c6, B:45:0x01c4, B:102:0x01c6, B:18:0x0091, B:16:0x008d] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r15v4 short[]) = (r15v2 short[]), (r15v3 short[]), (r15v2 short[]), (r15v2 short[]), (r15v2 short[]) binds: [B:93:0x01c6, B:45:0x01c4, B:102:0x01c6, B:18:0x0091, B:16:0x008d] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r24v5 int) = (r24v3 int), (r24v4 int), (r24v3 int), (r24v3 int), (r24v3 int) binds: [B:93:0x01c6, B:45:0x01c4, B:102:0x01c6, B:18:0x0091, B:16:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        int iM6981;
        int i;
        int i2;
        short s;
        int i3;
        int iM2566;
        int i4;
        short s2;
        int iM2567;
        int i5;
        int i6;
        Menu menu2 = menu;
        int i7 = C5695.f17556;
        int i8 = RunnableC3474.f10992;
        int iM6982 = (i7 - C2105.m6981("ۘ᩵")) * 29;
        int i9 = ((iM6982 ^ i8) * 31167) ^ 2026085076;
        ColorStateList textColors = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i10 = iM6982 ^ (-77913983);
        int iM2568 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        short s3 = 0;
        short s4 = 0;
        int i14 = 645490250;
        int i15 = 0;
        Drawable drawableMutate = null;
        String strM28025 = null;
        int i16 = 0;
        Drawable icon = null;
        MenuItem menuItemM19118 = null;
        MenuInflater menuInflater = null;
        while (true) {
            i14 = i10 ^ (i9 & (((i14 ^ i8) * (-6271)) >> 31));
            switch (i14) {
                case -2047368512:
                case 1099518657:
                    ServiceConnectionC3453.m10564();
                    C22628.m50615();
                    return false;
                case -1927674105:
                case 617541084:
                    RunnableC1108.m3790();
                    iM6981 = C0630.m2566("ۗ۬") ^ i8;
                    i = ((iM6981 ^ i7) * 7737) ^ (-1916013482);
                    i2 = -467815016;
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -1640222432:
                case 1539474960:
                    if (C3746.m11369() < 0) {
                        iM6981 = C0630.m2566("ۗ۬") ^ i8;
                        i = ((iM6981 ^ i7) * 7737) ^ (-1916013482);
                        i2 = -467815016;
                    } else {
                        iM6981 = C2105.m6981("ܶۧ") ^ i8;
                        i = ((iM6981 ^ i7) * 997) ^ 822681228;
                        i2 = 1160037888;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -1352363519:
                case -533356365:
                    int i17 = s3 + s4;
                    s = s3;
                    i3 = i15;
                    if ((i17 * i17) - (s * 18652) < 0) {
                        iM2566 = C0630.m2566("ۖۨ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-15263)) ^ 250723893;
                        i4 = -1198007641;
                    } else {
                        iM2566 = (i7 - C0630.m2566("ۗۛ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i9 = ((iM2566 ^ i8) * 32017) ^ 1497580513;
                        i4 = -918537156;
                    }
                    i10 = iM2566 ^ i4;
                    menu2 = menu;
                    i15 = i3;
                    s3 = s;
                    break;
                case -1263595517:
                case 1314809761:
                    i3 = i15;
                    s2 = sArr[c];
                    s4 = 4663;
                    if (C0964.m3413()) {
                        iM2567 = C0630.m2566("᩵ۡ") ^ i8;
                        i5 = ((iM2567 ^ i7) * 15193) ^ 441605940;
                        i6 = -2116266478;
                    } else {
                        iM2567 = (C2105.m6981("᩸ۛ") + i7) * (-95);
                        i5 = ((iM2567 ^ i8) * (-30901)) ^ 2083575117;
                        i6 = 1768670426;
                    }
                    i10 = iM2567 ^ i6;
                    i9 = i5;
                    i15 = i3;
                    s3 = s2;
                    menu2 = menu;
                    break;
                case -1258569930:
                case 347520125:
                    menuInflater.inflate(iM2568 ^ i16, menu2);
                    sArr3 = f37926;
                    i12 = 163;
                    if (C2167.f7158 < 0) {
                        iM6981 = C2105.m6981("֡ܶ") ^ i8;
                        i = ((iM6981 ^ i7) * (-30035)) ^ (-1315468773);
                        i2 = 506147362;
                        i10 = iM6981 ^ i2;
                        i9 = i;
                    } else {
                        s2 = s3;
                        i3 = i15;
                        iM2567 = (C2105.m6981("᩸ۛ") + i7) * (-95);
                        i5 = ((iM2567 ^ i8) * (-30901)) ^ 2083575117;
                        i6 = 1768670426;
                        i10 = iM2567 ^ i6;
                        i9 = i5;
                        i15 = i3;
                        s3 = s2;
                        menu2 = menu;
                    }
                    break;
                case -1100684240:
                case -1095293845:
                    drawableMutate.setTintList(textColors);
                    menuItemM19118.setIcon(drawableMutate);
                    return true;
                case -985259846:
                case -60962325:
                    drawableMutate = icon.mutate();
                    textColors = this.f37940.getTextColors();
                    if (C7106.f21815 != 0) {
                        iM6981 = C0630.m2566("ۗ۬") ^ i8;
                        i = ((iM6981 ^ i7) * 7737) ^ (-1916013482);
                        i2 = -467815016;
                        i10 = iM6981 ^ i2;
                        i9 = i;
                    } else {
                        int iM6983 = C2105.m6981("ۜ᩹") ^ i7;
                        i9 = ((iM6983 ^ i8) * 14893) ^ (-716040000);
                        i10 = iM6983 ^ 1397959546;
                    }
                    break;
                case -835245589:
                case 256010432:
                    menuInflater = getMenuInflater();
                    sArr2 = f37926;
                    i15 = DHParameters.DEFAULT_MINIMUM_LENGTH;
                    i11 = 3;
                    if (C2126.f7087) {
                        iM6981 = C0630.m2566("ۗ۬") ^ i8;
                        i = ((iM6981 ^ i7) * 7737) ^ (-1916013482);
                        i2 = -467815016;
                    } else {
                        iM6981 = C2105.m6981("֫֡") ^ i8;
                        i = ((iM6981 ^ i7) * (-16843)) ^ (-1408918346);
                        i2 = 569835200;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -775364743:
                case 1309513342:
                    menuItemM19118 = C7106.m19118(menu2, C2105.m6981(strM28025) ^ 2120311280);
                    if (C3746.f11829 <= 0) {
                        iM6981 = C2105.m6981("ܶۧ") ^ i8;
                        i = ((iM6981 ^ i7) * 997) ^ 822681228;
                        i2 = 1160037888;
                    } else {
                        iM6981 = (i7 - C2105.m6981("ۖۗ")) * 23;
                        i = ((iM6981 ^ i8) * (-14031)) ^ (-1858405743);
                        i2 = 575940342;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -761217338:
                case 611877523:
                    s = s3;
                    i3 = i15;
                    sArr = f37926;
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = (C2105.m6981("۬ܶ") + i7) * 81;
                        i9 = ((iM2566 ^ i8) * 6547) ^ (-296707369);
                        i4 = 219190519;
                    } else {
                        iM2566 = C0630.m2566("ۚ۠") ^ i7;
                        i9 = ((iM2566 ^ i8) * 6259) ^ (-1182299297);
                        i4 = 906483227;
                    }
                    i10 = iM2566 ^ i4;
                    menu2 = menu;
                    i15 = i3;
                    s3 = s;
                    break;
                case -646066728:
                case 1365833157:
                    i13 = 22886;
                    int iM6984 = C2105.m6981("ۛ֨") ^ i7;
                    i10 = iM6984 ^ (-495611206);
                    i15 = i15;
                    i9 = ((iM6984 ^ i8) * (-17959)) ^ (-864881388);
                    menu2 = menu;
                    break;
                case -617599734:
                case 1714851873:
                    s = s3;
                    i3 = i15;
                    c = 159;
                    if (!C1504.f5354) {
                        iM2566 = (C2105.m6981("ۙۜ") ^ i8) * 23;
                        i9 = ((iM2566 ^ i7) * 23017) ^ (-871195329);
                        i4 = -2108268189;
                        i10 = iM2566 ^ i4;
                        menu2 = menu;
                        i15 = i3;
                        s3 = s;
                    } else {
                        s2 = s;
                        iM2567 = (C2105.m6981("᩸ۛ") + i7) * (-95);
                        i5 = ((iM2567 ^ i8) * (-30901)) ^ 2083575117;
                        i6 = 1768670426;
                        i10 = iM2567 ^ i6;
                        i9 = i5;
                        i15 = i3;
                        s3 = s2;
                        menu2 = menu;
                    }
                    break;
                case -457800894:
                case 2143373882:
                    strM28025 = C11340.m28025(sArr3, i12, 3, i13);
                    if (C1047.f3863 >= 0) {
                        iM6981 = (i8 - C2105.m6981("ۨܳ")) * 9;
                        i = ((iM6981 ^ i7) * 25229) ^ 2045821260;
                        i2 = 1339303048;
                    } else {
                        iM6981 = C2105.m6981("ۘܿ") ^ i7;
                        i = ((iM6981 ^ i8) * (-11755)) ^ 1368395238;
                        i2 = 1023353929;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -185722607:
                case 1075611195:
                    int i18 = i15;
                    iM2568 = C0630.m2566(C3683.m11225(sArr2, i18, i11, i13));
                    if (C4117.f13076 <= 0) {
                        s = s3;
                        i16 = 2100735670;
                        i3 = i18;
                        iM2566 = (C2105.m6981("۬ܶ") + i7) * 81;
                        i9 = ((iM2566 ^ i8) * 6547) ^ (-296707369);
                        i4 = 219190519;
                        i10 = iM2566 ^ i4;
                        menu2 = menu;
                        i15 = i3;
                        s3 = s;
                    } else {
                        int iM6985 = (C2105.m6981("ۧܺ") + i7) * (-19);
                        i15 = i18;
                        i9 = ((iM6985 ^ i8) * 6367) ^ (-320108806);
                        i10 = iM6985 ^ 1886294719;
                        i16 = 2100735670;
                    }
                    break;
                case -99623163:
                case 61340806:
                    C4159.m12565();
                    if (!C0798.f2919) {
                        s2 = s3;
                        i3 = i15;
                        iM2567 = (C2105.m6981("᩸ۛ") + i7) * (-95);
                        i5 = ((iM2567 ^ i8) * (-30901)) ^ 2083575117;
                        i6 = 1768670426;
                        i10 = iM2567 ^ i6;
                        i9 = i5;
                        i15 = i3;
                        s3 = s2;
                        menu2 = menu;
                    } else {
                        iM6981 = C0630.m2566("ۗ۬") ^ i8;
                        i = ((iM6981 ^ i7) * 7737) ^ (-1916013482);
                        i2 = -467815016;
                        i10 = iM6981 ^ i2;
                        i9 = i;
                    }
                    break;
                case -78054544:
                case 331882721:
                    i13 = 57991;
                    int iM6986 = C2105.m6981("ۛ֨") ^ i7;
                    i10 = iM6986 ^ (-495611206);
                    i15 = i15;
                    i9 = ((iM6986 ^ i8) * (-17959)) ^ (-864881388);
                    menu2 = menu;
                    break;
                case 682255319:
                case 1055741946:
                    C21923.m49329();
                    if (C0422.f1886 <= 0) {
                        s = s3;
                        i3 = i15;
                        iM2566 = (C2105.m6981("۬ܶ") + i7) * 81;
                        i9 = ((iM2566 ^ i8) * 6547) ^ (-296707369);
                        i4 = 219190519;
                        i10 = iM2566 ^ i4;
                        menu2 = menu;
                        i15 = i3;
                        s3 = s;
                    } else {
                        s2 = s3;
                        i3 = i15;
                        iM2567 = (C2105.m6981("᩸ۛ") + i7) * (-95);
                        i5 = ((iM2567 ^ i8) * (-30901)) ^ 2083575117;
                        i6 = 1768670426;
                        i10 = iM2567 ^ i6;
                        i9 = i5;
                        i15 = i3;
                        s3 = s2;
                        menu2 = menu;
                    }
                    break;
                default:
                    icon = menuItemM19118.getIcon();
                    C3019.m9257(icon);
                    if (C0630.m2564()) {
                        iM6981 = (i8 - C2105.m6981("ۨܳ")) * 9;
                        i = ((iM6981 ^ i7) * 25229) ^ 2045821260;
                        i2 = 1339303048;
                    } else {
                        iM6981 = (C0630.m2566("᩹֨") + i8) * 77;
                        i = ((iM6981 ^ i7) * (-23453)) ^ 1215525024;
                        i2 = -1310833034;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x018c A[PHI: r5 r9 r11 r12
      0x018c: PHI (r5v76 l.ۡ᩹ܽ) = (r5v70 l.ۡ᩹ܽ), (r5v2 l.ۡ᩹ܽ), (r5v2 l.ۡ᩹ܽ) binds: [B:35:0x018a, B:12:0x00cc, B:183:0x018c] A[DONT_GENERATE, DONT_INLINE]
      0x018c: PHI (r9v5 short[]) = (r9v3 short[]), (r9v2 short[]), (r9v2 short[]) binds: [B:35:0x018a, B:12:0x00cc, B:183:0x018c] A[DONT_GENERATE, DONT_INLINE]
      0x018c: PHI (r11v5 int) = (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:35:0x018a, B:12:0x00cc, B:183:0x018c] A[DONT_GENERATE, DONT_INLINE]
      0x018c: PHI (r12v5 int) = (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:35:0x018a, B:12:0x00cc, B:183:0x018c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        String strM39302;
        int iM2566;
        int i;
        int i2;
        C19258 c19258;
        short[] sArr;
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        int iM2567;
        int i7;
        int i8;
        DialogInterfaceOnClickListenerC9175 dialogInterfaceOnClickListenerC9175;
        C19258 c19259;
        short[] sArr2;
        int i9;
        int i10;
        String str2;
        int i11;
        int i12;
        int iM6981;
        int i13;
        ?? r7;
        boolean z;
        int iM6982;
        int i14;
        int i15;
        DialogInterfaceOnClickListenerC9175 dialogInterfaceOnClickListenerC9176;
        int i16;
        C19258 c192510;
        boolean z2;
        short[] sArr3;
        int i17;
        int i18;
        String str3;
        int i19;
        int i20;
        int iM2568;
        int i21;
        ?? r8;
        int i22;
        String str4;
        C19258 c192511;
        int i23;
        int i24;
        short[] sArr4;
        C19258 c192512;
        int iM2569;
        int i25;
        int i26;
        boolean z3;
        boolean z4;
        DialogInterfaceOnClickListenerC9175 dialogInterfaceOnClickListenerC9177;
        int i27;
        short[] sArr5;
        boolean z5;
        int i28;
        boolean z6;
        int iM25610;
        int i29;
        int i30;
        ActivityC12581 activityC12581 = this;
        int i31 = 1242644555;
        int i32 = C5695.f17556;
        int i33 = C4616.f14690;
        int iM25611 = (i33 - C0630.m2566("ܿ۠")) * (-67);
        int i34 = ((iM25611 ^ i32) * (-23219)) ^ 949027192;
        int i35 = iM25611 ^ (-528743906);
        MenuItem menuItemM6301 = null;
        C19099 c19099 = null;
        String strM10566 = null;
        DialogInterfaceOnClickListenerC9175 dialogInterfaceOnClickListenerC9178 = null;
        String str5 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        int i36 = 0;
        boolean z7 = false;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = 0;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        boolean z8 = false;
        boolean z9 = false;
        int i46 = 0;
        int i47 = 0;
        int i48 = 0;
        int i49 = 0;
        SubMenu subMenu = null;
        C19258 c192513 = null;
        MenuItem menuItemM6302 = null;
        String str6 = null;
        short[] sArr9 = null;
        int i50 = 0;
        int i51 = 0;
        C19258 c192514 = null;
        while (true) {
            i31 = i35 ^ (i34 & (((i31 ^ i32) * (-961)) >> 31));
            switch (i31) {
                case -1809177011:
                case 457202087:
                    i6 = i45;
                    z3 = true;
                    int iM25612 = (C0630.m2566("ۗᩳ") + i33) * (-15);
                    int i52 = ((iM25612 ^ i32) * 19625) ^ (-1544465189);
                    i35 = iM25612 ^ (-595832145);
                    z9 = z9 ? 1 : 0;
                    strM10566 = strM10566;
                    dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9178;
                    z8 = z3;
                    i34 = i52;
                    i50 = i50;
                    int i53 = i6;
                    i44 = i44;
                    sArr8 = sArr8;
                    i45 = i53;
                    break;
                case -1799593406:
                case 2009827478:
                    dialogInterfaceOnClickListenerC9177 = dialogInterfaceOnClickListenerC9178;
                    i27 = i45;
                    z8 = z8;
                    z5 = true;
                    sArr5 = sArr8;
                    int iM25613 = C0630.m2566("ᩴᩳ") ^ i32;
                    i28 = ((iM25613 ^ i33) * 18953) ^ 1334540627;
                    i35 = iM25613 ^ 2074950654;
                    z6 = z5;
                    sArr8 = sArr5;
                    dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9177;
                    i45 = i27;
                    i34 = i28;
                    strM10566 = strM10566;
                    z9 = z6;
                    z8 = z8;
                    break;
                case -1768335914:
                case 1747084461:
                    menuItemM6302.setEnabled(z9 ? 1 : 0);
                    return i50;
                case -1700637013:
                case 845634170:
                    dialogInterfaceOnClickListenerC9175 = dialogInterfaceOnClickListenerC9178;
                    z7 = z7 ? 1 : 0;
                    int i54 = i41;
                    c19259 = c192513;
                    z8 = z8;
                    short[] sArr10 = sArr6;
                    sArr2 = sArr7;
                    i9 = i48;
                    i10 = i49;
                    str2 = strM10566;
                    i11 = i36;
                    int i55 = i46;
                    int i56 = i47;
                    int i57 = i45;
                    sArr8 = sArr8;
                    i44 = i44;
                    i6 = i57;
                    int i58 = i42 ^ i43;
                    i12 = i54;
                    String strM11225 = C3683.m11225(f37926, 170, 3, i38);
                    if (!RunnableC1108.f4040) {
                        i46 = i55;
                        i47 = i56;
                        sArr6 = sArr10;
                        i40 = i58;
                        str5 = strM11225;
                        iM6981 = i6;
                        int iM25614 = C0630.m2566("ۢܶ") ^ i33;
                        i44 = i44;
                        i49 = i10;
                        i48 = i9;
                        i36 = i11;
                        sArr8 = sArr8;
                        dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9175;
                        c192513 = c19259;
                        z7 = z7;
                        sArr7 = sArr2;
                        i41 = i12;
                        i45 = iM6981;
                        i35 = iM25614 ^ (-1927359767);
                        i34 = ((iM25614 ^ i32) * (-10363)) ^ 1075770008;
                        strM10566 = str2;
                        activityC12581 = this;
                        z9 = z9;
                        z8 = z8;
                    } else {
                        int iM25615 = C0630.m2566("ܿۗ") ^ i32;
                        i46 = i55;
                        i47 = i56;
                        i49 = i10;
                        sArr6 = sArr10;
                        i48 = i9;
                        i40 = i58;
                        i36 = i11;
                        strM10566 = str2;
                        dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9175;
                        c192513 = c19259;
                        sArr7 = sArr2;
                        i41 = i12;
                        str5 = strM11225;
                        i35 = iM25615 ^ 1886444548;
                        i34 = ((iM25615 ^ i33) * (-20623)) ^ (-613187097);
                        z8 = z8;
                        z7 = z7;
                        r8 = i50;
                        activityC12581 = this;
                        i50 = r8;
                        z9 = z9;
                        int i59 = i6;
                        i44 = i44;
                        sArr8 = sArr8;
                        i45 = i59;
                    }
                    break;
                case -1681727893:
                case 1720953811:
                    dialogInterfaceOnClickListenerC9177 = dialogInterfaceOnClickListenerC9178;
                    z8 = z8;
                    boolean z10 = z9 ? 1 : 0;
                    menuItemM6301.setEnabled(z8);
                    i27 = i45;
                    sArr5 = sArr8;
                    menuItemM6302 = C1916.m6301(subMenu, i27);
                    if (C13265.m32219(activityC12581.f37930) != null) {
                        int iM6983 = C2105.m6981("ۤܶ") ^ i32;
                        strM10566 = strM10566;
                        i28 = ((iM6983 ^ i33) * (-881)) ^ 1640626783;
                        i35 = iM6983 ^ 2039193287;
                        z6 = z10 ? 1 : 0;
                    } else {
                        z5 = z7 ? 1 : 0;
                        int iM25616 = C0630.m2566("ᩴᩳ") ^ i32;
                        i28 = ((iM25616 ^ i33) * 18953) ^ 1334540627;
                        i35 = iM25616 ^ 2074950654;
                        z6 = z5;
                    }
                    sArr8 = sArr5;
                    dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9177;
                    i45 = i27;
                    i34 = i28;
                    strM10566 = strM10566;
                    z9 = z6;
                    z8 = z8;
                    break;
                case -1675628036:
                case 1056886143:
                    C1294.m4380(c192514, C2105.m6981(RunnableC1937.m6385(sArr9, i51, i39, i38)) ^ 2097223692, dialogInterfaceOnClickListenerC9178);
                    if (C7106.f21815 != 0) {
                        iM25610 = C2105.m6981("ᩴۤ") ^ i33;
                        i29 = ((iM25610 ^ i32) * 15907) ^ (-1987287045);
                        i30 = -391669246;
                    } else {
                        iM25610 = C0630.m2566("᩻ܰ") ^ i33;
                        i29 = ((iM25610 ^ i32) * (-20189)) ^ 204574332;
                        i30 = 1538098236;
                    }
                    i35 = iM25610 ^ i30;
                    i34 = i29;
                    break;
                case -1656284373:
                case -1030338125:
                    sArr8 = sArr8;
                    dialogInterfaceOnClickListenerC9175 = dialogInterfaceOnClickListenerC9178;
                    z7 = z7 ? 1 : 0;
                    int i60 = i40;
                    int i61 = i41;
                    c19259 = c192513;
                    i44 = i44;
                    z8 = z8;
                    sArr2 = sArr7;
                    i9 = i48;
                    i10 = i49;
                    str2 = strM10566;
                    i11 = i36;
                    iM6981 = C2105.m6981(str5) ^ 2102042227;
                    sArr6 = f37926;
                    i46 = 173;
                    i47 = 3;
                    if (C1047.f3863 < 0) {
                        int iM6984 = C2105.m6981("᩻ܳ") ^ i33;
                        int i62 = ((iM6984 ^ i32) * (-14775)) ^ (-614875186);
                        i35 = iM6984 ^ (-947085179);
                        i44 = i44;
                        i49 = i10;
                        i40 = i60;
                        i48 = i9;
                        sArr8 = sArr8;
                        strM10566 = str2;
                        dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9175;
                        z7 = z7 ? 1 : 0;
                        sArr7 = sArr2;
                        i45 = iM6981;
                        i41 = i61;
                        i34 = i62;
                        z8 = z8;
                        i36 = i11;
                        c192513 = c19259;
                        activityC12581 = this;
                    } else {
                        i12 = i61;
                        i40 = i60;
                        int iM25617 = C0630.m2566("ۢܶ") ^ i33;
                        i44 = i44;
                        i49 = i10;
                        i48 = i9;
                        i36 = i11;
                        sArr8 = sArr8;
                        dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9175;
                        c192513 = c19259;
                        z7 = z7;
                        sArr7 = sArr2;
                        i41 = i12;
                        i45 = iM6981;
                        i35 = iM25617 ^ (-1927359767);
                        i34 = ((iM25617 ^ i32) * (-10363)) ^ 1075770008;
                        strM10566 = str2;
                        activityC12581 = this;
                        z9 = z9;
                        z8 = z8;
                    }
                    break;
                case -1521839298:
                case 1802957161:
                    i3 = i36;
                    dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9178;
                    z8 = z8;
                    str = strM10566;
                    int i63 = i45;
                    sArr8 = sArr8;
                    i44 = i44;
                    i6 = i63;
                    int i64 = DialogInterfaceC0206.f1451;
                    C19258 c192515 = new C19258(activityC12581);
                    sArr7 = f37926;
                    i48 = 179;
                    i49 = 3;
                    if (C1420.f5096 <= 0) {
                        c19258 = c192515;
                        z7 = z7 ? 1 : 0;
                        i40 = i40;
                        i41 = i41;
                        sArr = sArr6;
                        i4 = i46;
                        i5 = i47;
                        int iM25618 = (C0630.m2566("֫᩸") ^ i32) * (-123);
                        i34 = ((iM25618 ^ i33) * 10073) ^ (-1829533953);
                        i8 = iM25618 ^ (-635463406);
                        i46 = i4;
                        i47 = i5;
                        sArr6 = sArr;
                        i36 = i3;
                        strM10566 = str;
                        dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9178;
                        c192513 = c19258;
                        i41 = i41;
                        i35 = i8;
                        i40 = i40;
                        z8 = z8;
                        z7 = z7;
                        r8 = i50;
                        activityC12581 = this;
                        i50 = r8;
                        z9 = z9;
                        int i510 = i6;
                        i44 = i44;
                        sArr8 = sArr8;
                        i45 = i510;
                    } else {
                        int iM25619 = C0630.m2566("᩷ۛ") ^ i33;
                        int i65 = ((iM25619 ^ i32) * (-29645)) ^ (-1315421403);
                        i35 = iM25619 ^ (-1911993816);
                        strM10566 = str;
                        dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9178;
                        z8 = z8;
                        c192513 = c192515;
                        i34 = i65;
                        i36 = i3;
                        i44 = i44;
                        sArr8 = sArr8;
                        i45 = i6;
                    }
                    break;
                case -1512041814:
                case -1415196483:
                    C21923.m49329();
                    iM25610 = C0630.m2566("ܺܺ") ^ i32;
                    i29 = ((iM25610 ^ i33) * 11481) ^ (-1793865679);
                    i30 = 557223764;
                    i35 = iM25610 ^ i30;
                    i34 = i29;
                    break;
                case -1464750164:
                case 1898520960:
                    dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9178;
                    z = z8;
                    short[] sArr11 = sArr7;
                    i22 = i49;
                    str4 = strM10566;
                    c192511 = c192513;
                    i23 = i36;
                    i24 = i48;
                    int i66 = i45;
                    sArr8 = sArr8;
                    i44 = i44;
                    i6 = i66;
                    sArr4 = sArr11;
                    C3432.m10490(c192511, C0630.m2566(ViewOnClickListenerC1958.m6435(sArr11, i24, i22, i38)) ^ 2100874117);
                    if (C0630.m2564()) {
                        iM2569 = (i33 - C2105.m6981("᩷᩶")) * (-63);
                        c192512 = c192511;
                        i25 = ((iM2569 ^ i32) * 26021) ^ 1091484471;
                        i26 = 606216244;
                    } else {
                        c192512 = c192511;
                        iM2569 = C0630.m2566("᩶۫") ^ i32;
                        i25 = ((iM2569 ^ i33) * 5551) ^ 418196294;
                        i26 = -112146219;
                    }
                    i35 = iM2569 ^ i26;
                    i34 = i25;
                    i48 = i24;
                    i49 = i22;
                    i36 = i23;
                    strM10566 = str4;
                    dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9178;
                    c192513 = c192512;
                    sArr7 = sArr4;
                    z4 = z9;
                    z8 = z;
                    i50 = i50;
                    z9 = z4;
                    int i511 = i6;
                    i44 = i44;
                    sArr8 = sArr8;
                    i45 = i511;
                    break;
                case -1394634105:
                case 105854303:
                    Object[] objArr = new Object[i50];
                    objArr[z7 ? 1 : 0] = str6;
                    dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9178;
                    strM10566 = ServiceConnectionC3453.m10566(activityC12581, C0630.m2566(RunnableC1937.m6385(f37926, 193, 3, i38)) ^ 2116304070, objArr);
                    if (C1294.f4556 < 0) {
                        iM2566 = C2105.m6981("ܺ᩺") ^ i32;
                        i = ((iM2566 ^ i33) * (-4499)) ^ (-279949676);
                        i2 = -1692631246;
                        i35 = iM2566 ^ i2;
                        i34 = i;
                        z9 = z9;
                        dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9178;
                    } else {
                        z7 = z7 ? 1 : 0;
                        i40 = i40;
                        i41 = i41;
                        c19258 = c192513;
                        z8 = z8;
                        sArr = sArr6;
                        str = strM10566;
                        i3 = i36;
                        i4 = i46;
                        i5 = i47;
                        int i67 = i45;
                        sArr8 = sArr8;
                        i44 = i44;
                        i6 = i67;
                        int iM256110 = (C0630.m2566("֫᩸") ^ i32) * (-123);
                        i34 = ((iM256110 ^ i33) * 10073) ^ (-1829533953);
                        i8 = iM256110 ^ (-635463406);
                        i46 = i4;
                        i47 = i5;
                        sArr6 = sArr;
                        i36 = i3;
                        strM10566 = str;
                        dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9178;
                        c192513 = c19258;
                        i41 = i41;
                        i35 = i8;
                        i40 = i40;
                        z8 = z8;
                        z7 = z7;
                        r8 = i50;
                        activityC12581 = this;
                        i50 = r8;
                        z9 = z9;
                        int i512 = i6;
                        i44 = i44;
                        sArr8 = sArr8;
                        i45 = i512;
                    }
                    break;
                case -1093732506:
                case -252455085:
                    if (C7106.f21815 == 0) {
                        iM25610 = C2105.m6981("ᩴۤ") ^ i33;
                        i29 = ((iM25610 ^ i32) * 15907) ^ (-1987287045);
                        i30 = -391669246;
                        i35 = iM25610 ^ i30;
                        i34 = i29;
                    } else {
                        dialogInterfaceOnClickListenerC9175 = dialogInterfaceOnClickListenerC9178;
                        z7 = z7 ? 1 : 0;
                        i12 = i41;
                        c19259 = c192513;
                        iM6981 = i45;
                        z8 = z8;
                        sArr2 = sArr7;
                        i9 = i48;
                        i10 = i49;
                        sArr8 = sArr8;
                        str2 = strM10566;
                        i11 = i36;
                        i44 = i44;
                        int iM256111 = C0630.m2566("ۢܶ") ^ i33;
                        i44 = i44;
                        i49 = i10;
                        i48 = i9;
                        i36 = i11;
                        sArr8 = sArr8;
                        dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9175;
                        c192513 = c19259;
                        z7 = z7;
                        sArr7 = sArr2;
                        i41 = i12;
                        i45 = iM6981;
                        i35 = iM256111 ^ (-1927359767);
                        i34 = ((iM256111 ^ i32) * (-10363)) ^ 1075770008;
                        strM10566 = str2;
                        activityC12581 = this;
                        z9 = z9;
                        z8 = z8;
                    }
                    break;
                case -1033388011:
                case 1995329700:
                    DialogInterfaceOnClickListenerC9175 dialogInterfaceOnClickListenerC9179 = dialogInterfaceOnClickListenerC9178;
                    i6 = i45;
                    z = z8;
                    boolean z11 = z9 ? 1 : 0;
                    sArr8 = sArr8;
                    String str7 = strM10566;
                    i44 = i44;
                    if (i44 == i6) {
                        int iM25620 = C0630.m2566("۬᩻") ^ i33;
                        i34 = ((iM25620 ^ i32) * (-31531)) ^ 1176603692;
                        i35 = iM25620 ^ 994703989;
                    } else {
                        int iM6985 = (C2105.m6981("۫ۛ") ^ i32) * (-125);
                        i35 = iM6985 ^ 2046893299;
                        i34 = ((iM6985 ^ i33) * 24967) ^ (-1173545369);
                    }
                    z4 = z11 ? 1 : 0;
                    strM10566 = str7;
                    dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9179;
                    z8 = z;
                    i50 = i50;
                    z9 = z4;
                    int i513 = i6;
                    i44 = i44;
                    sArr8 = sArr8;
                    i45 = i513;
                    break;
                case -954180787:
                case -872331197:
                    C2272.m7503();
                    C2958.m9034();
                    return false;
                case -836796878:
                case -508832292:
                    if (C4616.f14690 <= 0) {
                        dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9178;
                        iM2566 = (i32 - C0630.m2566("ۚܿ")) * (-101);
                        i = ((iM2566 ^ i33) * 26417) ^ (-2125982312);
                        i2 = 1500709002;
                        i35 = iM2566 ^ i2;
                        i34 = i;
                        z9 = z9;
                        dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9178;
                    } else {
                        iM25610 = C0630.m2566("ܺܺ") ^ i32;
                        i29 = ((iM25610 ^ i33) * 11481) ^ (-1793865679);
                        i30 = 557223764;
                        i35 = iM25610 ^ i30;
                        i34 = i29;
                    }
                    break;
                case -697791455:
                case 1030572189:
                    dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9178;
                    z7 = z7 ? 1 : 0;
                    i40 = i40;
                    i41 = i41;
                    c192513 = c192513;
                    z8 = z8;
                    sArr6 = sArr6;
                    sArr7 = sArr7;
                    i48 = i48;
                    i49 = i49;
                    strM10566 = strM10566;
                    i36 = i36;
                    i46 = i46;
                    i47 = i47;
                    int i68 = i45;
                    sArr8 = sArr8;
                    i44 = i44;
                    i6 = i68;
                    short s = f37926[166];
                    if ((s * 396) - ((s * s) + 39204) <= 0) {
                        iM2567 = (C0630.m2566("ܽ֫") + i32) * 63;
                        i34 = ((iM2567 ^ i33) * (-6933)) ^ (-1348508307);
                        i7 = -1794839398;
                    } else {
                        iM2567 = C0630.m2566("۠᩻") ^ i33;
                        i34 = ((iM2567 ^ i32) * 21773) ^ (-1535483218);
                        i7 = 1831716952;
                    }
                    i8 = iM2567 ^ i7;
                    i46 = i46;
                    i47 = i47;
                    i49 = i49;
                    sArr6 = sArr6;
                    i48 = i48;
                    i36 = i36;
                    strM10566 = strM10566;
                    dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9178;
                    c192513 = c192513;
                    sArr7 = sArr7;
                    i41 = i41;
                    i35 = i8;
                    i40 = i40;
                    z8 = z8;
                    z7 = z7;
                    r8 = i50;
                    activityC12581 = this;
                    i50 = r8;
                    z9 = z9;
                    int i514 = i6;
                    i44 = i44;
                    sArr8 = sArr8;
                    i45 = i514;
                    break;
                case -668466962:
                case 502453690:
                    dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9178;
                    MenuItem menuItem2 = menuItemM6302;
                    boolean z12 = z9 ? 1 : 0;
                    c19099 = activityC12581.f37929;
                    if (c19099 != null) {
                        int iM25621 = C0630.m2566("۫ܽ") ^ i33;
                        menuItemM6302 = menuItem2;
                        i34 = ((iM25621 ^ i32) * (-6337)) ^ (-1718543803);
                        i35 = iM25621 ^ (-2100263279);
                        z9 = z12 ? 1 : 0;
                    } else {
                        menuItemM6302 = menuItem2;
                        int iM25622 = (i33 - C0630.m2566("ۢᩴ")) * 25;
                        i35 = iM25622 ^ (-290008921);
                        z9 = z12 ? 1 : 0;
                        i34 = ((iM25622 ^ i32) * (-5085)) ^ (-994458693);
                    }
                    dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9178;
                    break;
                case -635987688:
                case 1900255491:
                    dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9178;
                    int i69 = DialogInterfaceC0206.f1451;
                    c192514 = new C19258(activityC12581);
                    sArr8 = f37926;
                    i36 = 190;
                    i37 = 3;
                    if (C5695.f17556 >= 0) {
                        iM2566 = (i32 - C0630.m2566("ۚܿ")) * (-101);
                        i = ((iM2566 ^ i33) * 26417) ^ (-2125982312);
                        i2 = 1500709002;
                    } else {
                        iM2566 = (C2105.m6981("᩺ۖ") + i32) * 55;
                        i = ((iM2566 ^ i33) * 5761) ^ (-1882903594);
                        i2 = 470493103;
                    }
                    i35 = iM2566 ^ i2;
                    i34 = i;
                    z9 = z9;
                    dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9178;
                    break;
                case -599929232:
                case -141111331:
                    C1504.m5179();
                    if (C4616.m13552() == 0) {
                        dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9178;
                        z = z8;
                        sArr4 = sArr7;
                        i22 = i49;
                        str4 = strM10566;
                        c192511 = c192513;
                        i23 = i36;
                        i24 = i48;
                        int i70 = i45;
                        sArr8 = sArr8;
                        i44 = i44;
                        i6 = i70;
                        iM2569 = (i33 - C2105.m6981("᩷᩶")) * (-63);
                        c192512 = c192511;
                        i25 = ((iM2569 ^ i32) * 26021) ^ 1091484471;
                        i26 = 606216244;
                        i35 = iM2569 ^ i26;
                        i34 = i25;
                        i48 = i24;
                        i49 = i22;
                        i36 = i23;
                        strM10566 = str4;
                        dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9178;
                        c192513 = c192512;
                        sArr7 = sArr4;
                        z4 = z9;
                        z8 = z;
                        i50 = i50;
                        z9 = z4;
                        int i515 = i6;
                        i44 = i44;
                        sArr8 = sArr8;
                        i45 = i515;
                    } else {
                        iM25610 = C0630.m2566("ۛۡ") ^ i32;
                        i29 = ((iM25610 ^ i33) * (-9923)) ^ 1755345752;
                        i30 = 1408830551;
                        i35 = iM25610 ^ i30;
                        i34 = i29;
                    }
                    break;
                case -582556359:
                case -343742822:
                    dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9178;
                    C0382.m1849(c192514, C2105.m6981(C3683.m11225(sArr8, i36, i37, i38)) ^ 2099936782);
                    if (C2520.f8000 < 0) {
                        iM2566 = (C0630.m2566("ܰ᩻") ^ i33) * (-55);
                        i = ((iM2566 ^ i32) * (-14965)) ^ 2131773988;
                        i2 = -1417300868;
                        i35 = iM2566 ^ i2;
                        i34 = i;
                        z9 = z9;
                        dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9178;
                    } else {
                        z = z8;
                        sArr4 = sArr7;
                        i22 = i49;
                        str4 = strM10566;
                        c192511 = c192513;
                        i23 = i36;
                        i24 = i48;
                        int i71 = i45;
                        sArr8 = sArr8;
                        i44 = i44;
                        i6 = i71;
                        iM2569 = (i33 - C2105.m6981("᩷᩶")) * (-63);
                        c192512 = c192511;
                        i25 = ((iM2569 ^ i32) * 26021) ^ 1091484471;
                        i26 = 606216244;
                        i35 = iM2569 ^ i26;
                        i34 = i25;
                        i48 = i24;
                        i49 = i22;
                        i36 = i23;
                        strM10566 = str4;
                        dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9178;
                        c192513 = c192512;
                        sArr7 = sArr4;
                        z4 = z9;
                        z8 = z;
                        i50 = i50;
                        z9 = z4;
                        int i516 = i6;
                        i44 = i44;
                        sArr8 = sArr8;
                        i45 = i516;
                    }
                    break;
                case -516668835:
                case 1132980564:
                    DialogInterfaceOnClickListenerC9175 dialogInterfaceOnClickListenerC91710 = dialogInterfaceOnClickListenerC9178;
                    C19258 c192516 = c192513;
                    boolean z13 = z8;
                    short[] sArr12 = sArr6;
                    short[] sArr13 = sArr7;
                    int i72 = i48;
                    int i73 = i49;
                    String str8 = strM10566;
                    int i74 = i36;
                    int i75 = i46;
                    int i76 = i47;
                    int i77 = i45;
                    sArr8 = sArr8;
                    i44 = i44;
                    i6 = i77;
                    int iM6986 = C2105.m6981(C3245.m9934(sArr12, i75, i76, i38)) ^ 2126401159;
                    int i78 = i40;
                    if (i44 == i78) {
                        int iM6987 = (C2105.m6981("᩷۬") + i33) * (-37);
                        int i79 = ((iM6987 ^ i32) * 6463) ^ 966826405;
                        sArr6 = sArr12;
                        i46 = i75;
                        i47 = i76;
                        i49 = i73;
                        i35 = iM6987 ^ (-1799238199);
                        i48 = i72;
                        i36 = i74;
                        strM10566 = str8;
                        dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC91710;
                        c192513 = c192516;
                        sArr7 = sArr13;
                        activityC12581 = this;
                        i41 = iM6986;
                        i40 = i78;
                        i34 = i79;
                        z8 = z13;
                        z7 = false;
                        i50 = 1;
                        z9 = z9;
                    } else {
                        int iM6988 = (C2105.m6981("֡᩻") + i32) * (-119);
                        i13 = ((iM6988 ^ i33) * (-4197)) ^ 1734458304;
                        i46 = i75;
                        i47 = i76;
                        i49 = i73;
                        i35 = iM6988 ^ (-1671609398);
                        sArr6 = sArr12;
                        i48 = i72;
                        i36 = i74;
                        strM10566 = str8;
                        dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC91710;
                        c192513 = c192516;
                        sArr7 = sArr13;
                        r7 = 1;
                        i41 = iM6986;
                        i40 = i78;
                        z8 = z13;
                        z7 = false;
                        i34 = i13;
                        r8 = r7;
                        activityC12581 = this;
                        i50 = r8;
                        z9 = z9;
                    }
                    int i517 = i6;
                    i44 = i44;
                    sArr8 = sArr8;
                    i45 = i517;
                    break;
                case -339065102:
                case 820372812:
                    AbstractC2021.m6574();
                    if (C4075.m12263() > 0) {
                        dialogInterfaceOnClickListenerC9175 = dialogInterfaceOnClickListenerC9178;
                        z7 = z7 ? 1 : 0;
                        i12 = i41;
                        c19259 = c192513;
                        iM6981 = i45;
                        z8 = z8;
                        sArr2 = sArr7;
                        i9 = i48;
                        i10 = i49;
                        sArr8 = sArr8;
                        str2 = strM10566;
                        i11 = i36;
                        i44 = i44;
                        int iM256112 = C0630.m2566("ۢܶ") ^ i33;
                        i44 = i44;
                        i49 = i10;
                        i48 = i9;
                        i36 = i11;
                        sArr8 = sArr8;
                        dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9175;
                        c192513 = c19259;
                        z7 = z7;
                        sArr7 = sArr2;
                        i41 = i12;
                        i45 = iM6981;
                        i35 = iM256112 ^ (-1927359767);
                        i34 = ((iM256112 ^ i32) * (-10363)) ^ 1075770008;
                        strM10566 = str2;
                        activityC12581 = this;
                        z9 = z9;
                        z8 = z8;
                    } else {
                        iM25610 = C0630.m2566("ܺܺ") ^ i32;
                        i29 = ((iM25610 ^ i33) * 11481) ^ (-1793865679);
                        i30 = 557223764;
                        i35 = iM25610 ^ i30;
                        i34 = i29;
                    }
                    break;
                case -224331970:
                case 2043298811:
                    dialogInterfaceOnClickListenerC9176 = dialogInterfaceOnClickListenerC9178;
                    i16 = i41;
                    c192510 = c192513;
                    z2 = z8;
                    sArr3 = sArr7;
                    i17 = i48;
                    i18 = i49;
                    str3 = strM10566;
                    i19 = i36;
                    int i80 = i45;
                    sArr8 = sArr8;
                    i44 = i44;
                    i6 = i80;
                    SubMenu subMenu2 = menuItem.getSubMenu();
                    C3019.m9257(subMenu2);
                    menuItemM6301 = C1916.m6301(subMenu2, i16);
                    if (activityC12581.f37929 == null) {
                        int iM6989 = (C2105.m6981("ۤ۟") + i32) * 35;
                        i20 = ((iM6989 ^ i33) * (-3685)) ^ 1074541649;
                        i35 = iM6989 ^ 1813287832;
                        activityC12581 = this;
                        subMenu = subMenu2;
                        i49 = i18;
                        i48 = i17;
                        strM10566 = str3;
                        dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9176;
                        sArr7 = sArr3;
                        i41 = i16;
                        i34 = i20;
                        z8 = z2;
                        i36 = i19;
                        c192513 = c192510;
                        i50 = i50;
                        z9 = z9;
                        int i518 = i6;
                        i44 = i44;
                        sArr8 = sArr8;
                        i45 = i518;
                    } else {
                        int iM69810 = C2105.m6981("ۗ֨") ^ i33;
                        i13 = ((iM69810 ^ i32) * 13841) ^ (-1678056852);
                        i35 = iM69810 ^ 1039883990;
                        subMenu = subMenu2;
                        i49 = i18;
                        i48 = i17;
                        i36 = i19;
                        strM10566 = str3;
                        dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9176;
                        c192513 = c192510;
                        sArr7 = sArr3;
                        i41 = i16;
                        z8 = z2;
                        r7 = i50;
                        i34 = i13;
                        r8 = r7;
                        activityC12581 = this;
                        i50 = r8;
                        z9 = z9;
                        int i519 = i6;
                        i44 = i44;
                        sArr8 = sArr8;
                        i45 = i519;
                    }
                    break;
                case -171082175:
                case 1892348901:
                    i6 = i45;
                    i38 = 2610;
                    iM2567 = C2105.m6981("ۖ᩹") ^ i33;
                    i34 = ((iM2567 ^ i32) * (-8097)) ^ 699238619;
                    i7 = 1078536191;
                    i8 = iM2567 ^ i7;
                    i46 = i46;
                    i47 = i47;
                    i49 = i49;
                    sArr6 = sArr6;
                    i48 = i48;
                    i36 = i36;
                    strM10566 = strM10566;
                    dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9178;
                    c192513 = c192513;
                    sArr7 = sArr7;
                    i41 = i41;
                    i35 = i8;
                    i40 = i40;
                    z8 = z8;
                    z7 = z7;
                    r8 = i50;
                    activityC12581 = this;
                    i50 = r8;
                    z9 = z9;
                    int i5110 = i6;
                    i44 = i44;
                    sArr8 = sArr8;
                    i45 = i5110;
                    break;
                case -17327281:
                case 342152119:
                    C19258 c192517 = c192513;
                    C3537.m10741(c192517, activityC12581.f37930);
                    TextView textView = (TextView) RunnableC0588.m2438(c192517).m1433(R.id.message);
                    C19890.m45744(textView);
                    C4159.m12564(textView, new ViewOnClickListenerC20955());
                    return i50;
                case 45286190:
                case 1110810637:
                    i6 = i45;
                    z3 = false;
                    int iM256113 = (C0630.m2566("ۗᩳ") + i33) * (-15);
                    int i520 = ((iM256113 ^ i32) * 19625) ^ (-1544465189);
                    i35 = iM256113 ^ (-595832145);
                    z9 = z9 ? 1 : 0;
                    strM10566 = strM10566;
                    dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9178;
                    z8 = z3;
                    i34 = i520;
                    i50 = i50;
                    int i5111 = i6;
                    i44 = i44;
                    sArr8 = sArr8;
                    i45 = i5111;
                    break;
                case 109416787:
                case 2098554601:
                    C2520.m8029(c192514, C0630.m2566(C0964.m3396(f37926, 199, 3, i38)) ^ 2121216131, null);
                    C3683.m11213(c192514);
                    return i50;
                case 321121746:
                case 1369993062:
                    return z7;
                case 396464940:
                case 1555478421:
                    AbstractC2021.m6574();
                    if (C1047.m3599() >= 0) {
                        iM25610 = C0630.m2566("ܺܺ") ^ i32;
                        i29 = ((iM25610 ^ i33) * 11481) ^ (-1793865679);
                        i30 = 557223764;
                    } else {
                        iM25610 = C0630.m2566("ۛۡ") ^ i32;
                        i29 = ((iM25610 ^ i33) * (-9923)) ^ 1755345752;
                        i30 = 1408830551;
                    }
                    i35 = iM25610 ^ i30;
                    i34 = i29;
                    break;
                case 637275945:
                case 1173835820:
                    String str9 = activityC12581.f37930;
                    Intent intent = new Intent(activityC12581, (Class<?>) ActivityC1292.class);
                    C1504.m5168(intent, C1128.m3841(f37926, 182, 8, i38), str9);
                    C4075.m12261(activityC12581, intent);
                    return i50;
                case 653755801:
                case 1011588985:
                    C16709 c16709M32219 = C13265.m32219(activityC12581.f37930);
                    C3019.m9257(c16709M32219);
                    strM39302 = c16709M32219.m39302();
                    str6 = strM39302;
                    iM2566 = (C0630.m2566("ܳۧ") + i32) * 55;
                    i = ((iM2566 ^ i33) * (-25679)) ^ (-590121162);
                    i2 = -2041906690;
                    i35 = iM2566 ^ i2;
                    i34 = i;
                    z9 = z9;
                    dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9178;
                    break;
                case 660588691:
                case 1891228144:
                    DialogInterfaceOnClickListenerC9175 dialogInterfaceOnClickListenerC91711 = dialogInterfaceOnClickListenerC9178;
                    int i81 = i41;
                    C19258 c192518 = c192513;
                    z = z8;
                    short[] sArr14 = sArr7;
                    int i82 = i48;
                    int i83 = i49;
                    String str10 = strM10566;
                    int i84 = i36;
                    int i85 = i45;
                    sArr8 = sArr8;
                    i44 = i44;
                    i6 = i85;
                    if (i44 == (C0630.m2566(C0964.m3396(f37926, PicnicEngine.MAX_AUX_BYTES, 3, i38)) ^ 2097740890)) {
                        iM6982 = (C2105.m6981("ۢ۫") + i33) * 29;
                        i14 = ((iM6982 ^ i32) * (-4125)) ^ (-1324915487);
                        i15 = -970218693;
                    } else {
                        iM6982 = C2105.m6981("ۢ۬") ^ i32;
                        i14 = ((iM6982 ^ i33) * 15663) ^ (-1190387314);
                        i15 = -733133811;
                    }
                    i35 = iM6982 ^ i15;
                    activityC12581 = this;
                    i49 = i83;
                    i48 = i82;
                    i36 = i84;
                    dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC91711;
                    c192513 = c192518;
                    sArr7 = sArr14;
                    i41 = i81;
                    i34 = i14;
                    strM10566 = str10;
                    z4 = z9;
                    z8 = z;
                    i50 = i50;
                    z9 = z4;
                    int i5112 = i6;
                    i44 = i44;
                    sArr8 = sArr8;
                    i45 = i5112;
                    break;
                case 942228017:
                case 1268185347:
                    i6 = i45;
                    i38 = 20408;
                    iM2567 = C2105.m6981("ۖ᩹") ^ i33;
                    i34 = ((iM2567 ^ i32) * (-8097)) ^ 699238619;
                    i7 = 1078536191;
                    i8 = iM2567 ^ i7;
                    i46 = i46;
                    i47 = i47;
                    i49 = i49;
                    sArr6 = sArr6;
                    i48 = i48;
                    i36 = i36;
                    strM10566 = strM10566;
                    dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9178;
                    c192513 = c192513;
                    sArr7 = sArr7;
                    i41 = i41;
                    i35 = i8;
                    i40 = i40;
                    z8 = z8;
                    z7 = z7;
                    r8 = i50;
                    activityC12581 = this;
                    i50 = r8;
                    z9 = z9;
                    int i5113 = i6;
                    i44 = i44;
                    sArr8 = sArr8;
                    i45 = i5113;
                    break;
                case 964343824:
                case 1132434957:
                    dialogInterfaceOnClickListenerC9176 = dialogInterfaceOnClickListenerC9178;
                    i16 = i41;
                    c192510 = c192513;
                    z2 = z8;
                    sArr3 = sArr7;
                    i18 = i49;
                    str3 = strM10566;
                    i19 = i36;
                    i17 = i48;
                    int i86 = i45;
                    sArr8 = sArr8;
                    i44 = i44;
                    i6 = i86;
                    if (i44 == i16) {
                        iM2568 = C2105.m6981("۠᩸") ^ i33;
                        i20 = ((iM2568 ^ i32) * 21839) ^ 837312932;
                        i21 = 1665950068;
                    } else {
                        iM2568 = C0630.m2566("᩷ᩳ") ^ i32;
                        i20 = ((iM2568 ^ i33) * 12653) ^ (-1738147234);
                        i21 = 794013342;
                    }
                    i35 = iM2568 ^ i21;
                    i49 = i18;
                    i48 = i17;
                    strM10566 = str3;
                    dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9176;
                    sArr7 = sArr3;
                    i41 = i16;
                    i34 = i20;
                    z8 = z2;
                    i36 = i19;
                    c192513 = c192510;
                    i50 = i50;
                    z9 = z9;
                    int i5114 = i6;
                    i44 = i44;
                    sArr8 = sArr8;
                    i45 = i5114;
                    break;
                case 1233409291:
                case 1727141724:
                    dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9178;
                    z7 = z7 ? 1 : 0;
                    i40 = i40;
                    i41 = i41;
                    c19258 = c192513;
                    i6 = i45;
                    z8 = z8;
                    sArr = sArr6;
                    short[] sArr15 = sArr7;
                    int i87 = i48;
                    int i88 = i49;
                    sArr8 = sArr8;
                    str = strM10566;
                    i3 = i36;
                    i4 = i46;
                    i5 = i47;
                    int iM7041 = C2126.m7041(menuItem);
                    int iM69811 = C2105.m6981(C0798.m3005(f37926, 167, 3, i38));
                    i43 = 2123894359;
                    if (C3432.f10845 < 0) {
                        int iM25623 = C0630.m2566("ۧۗ") ^ i32;
                        i46 = i4;
                        i47 = i5;
                        i49 = i88;
                        sArr6 = sArr;
                        i48 = i87;
                        i36 = i3;
                        strM10566 = str;
                        dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9178;
                        c192513 = c19258;
                        sArr7 = sArr15;
                        i41 = i41;
                        i35 = iM25623 ^ 2006297132;
                        i34 = ((iM25623 ^ i33) * 7201) ^ 940909558;
                        i40 = i40;
                        z8 = z8;
                        sArr8 = sArr8;
                        z7 = z7 ? 1 : 0;
                        i45 = i6;
                        i44 = iM7041;
                        i42 = iM69811;
                        activityC12581 = this;
                    } else {
                        i49 = i88;
                        i48 = i87;
                        i44 = iM7041;
                        sArr7 = sArr15;
                        i42 = iM69811;
                        int iM256114 = (C0630.m2566("֫᩸") ^ i32) * (-123);
                        i34 = ((iM256114 ^ i33) * 10073) ^ (-1829533953);
                        i8 = iM256114 ^ (-635463406);
                        i46 = i4;
                        i47 = i5;
                        sArr6 = sArr;
                        i36 = i3;
                        strM10566 = str;
                        dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9178;
                        c192513 = c19258;
                        i41 = i41;
                        i35 = i8;
                        i40 = i40;
                        z8 = z8;
                        z7 = z7;
                        r8 = i50;
                        activityC12581 = this;
                        i50 = r8;
                        z9 = z9;
                        int i5115 = i6;
                        i44 = i44;
                        sArr8 = sArr8;
                        i45 = i5115;
                    }
                    break;
                case 1261434042:
                case 1982572005:
                    C3537.m10741(c192514, strM10566);
                    dialogInterfaceOnClickListenerC9178 = new DialogInterfaceOnClickListenerC9175(activityC12581, i50);
                    sArr9 = f37926;
                    i51 = 196;
                    i39 = 3;
                    if (C3683.m11222()) {
                        iM25610 = C0630.m2566("ۛۡ") ^ i32;
                        i29 = ((iM25610 ^ i33) * (-9923)) ^ 1755345752;
                        i30 = 1408830551;
                    } else {
                        iM25610 = C0630.m2566("ۡۘ") ^ i33;
                        i29 = ((iM25610 ^ i32) * 21223) ^ 744561923;
                        i30 = 407228328;
                    }
                    i35 = iM25610 ^ i30;
                    i34 = i29;
                    break;
                default:
                    strM39302 = c19099.m44004();
                    str6 = strM39302;
                    iM2566 = (C0630.m2566("ܳۧ") + i32) * 55;
                    i = ((iM2566 ^ i33) * (-25679)) ^ (-590121162);
                    i2 = -2041906690;
                    i35 = iM2566 ^ i2;
                    i34 = i;
                    z9 = z9;
                    dialogInterfaceOnClickListenerC9178 = dialogInterfaceOnClickListenerC9178;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static void m30820(ActivityC12581 activityC12581) {
        C8817 c8817 = null;
        int i = 1455493972;
        int i2 = C1128.f4106;
        int i3 = C4616.f14690;
        int iM6981 = C2105.m6981("ۜ֨") ^ i2;
        int i4 = ((iM6981 ^ i3) * (-32389)) ^ (-136854772);
        int i5 = -2029925318;
        while (true) {
            i = ((((i ^ i3) * 27497) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2028986878:
                case 133289787:
                    if (C22628.m50615() != 0) {
                        iM6981 = C2105.m6981("֫᩸") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-3167)) ^ (-580753909);
                        i5 = -1189543053;
                    } else {
                        iM6981 = C2105.m6981("ܶᩴ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 16113) ^ (-791136754);
                        i5 = 503849523;
                    }
                    break;
                case -1906493331:
                case -353310179:
                    C1420.m4913();
                    break;
                case -1776702258:
                case -69356659:
                    C11340.m28031();
                    if (C5695.f17556 >= 0) {
                        iM6981 = C2105.m6981("֫᩸") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-3167)) ^ (-580753909);
                        i5 = -1189543053;
                    } else {
                        iM6981 = C0630.m2566("ۛۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 14469) ^ (-1410405635);
                        i5 = -2032540476;
                    }
                    break;
                case -1694886645:
                case 2064420670:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = (C2105.m6981("ܺۡ") ^ i2) * (-111);
                        i4 = ((iM6981 ^ i3) * 29595) ^ 1713434888;
                        i5 = -1359702244;
                    } else {
                        iM6981 = (i3 - C0630.m2566("᩵᩶")) * (-99);
                        i4 = ((iM6981 ^ i2) * (-3337)) ^ 1357781253;
                        i5 = 1102567888;
                    }
                    break;
                case -1616767074:
                case -1552787248:
                    C0422.m1963();
                    iM6981 = C0630.m2566("ۛۜ") ^ i2;
                    i4 = ((iM6981 ^ i3) * 14469) ^ (-1410405635);
                    i5 = -2032540476;
                    break;
                case -1435535352:
                case 253492431:
                    break;
                case -1208703474:
                case -526988413:
                    if (!C1504.f5354) {
                        iM6981 = C0630.m2566("ۛۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 14469) ^ (-1410405635);
                        i5 = -2032540476;
                    } else {
                        iM6981 = (C2105.m6981("᩻ۗ") + i3) * (-57);
                        i4 = ((iM6981 ^ i2) * (-26299)) ^ 628020255;
                        i5 = -1532057111;
                    }
                    break;
                case -1095644661:
                case 1192730067:
                    if (C2958.m9034() <= 0) {
                        iM6981 = (C2105.m6981("ܺۡ") ^ i2) * (-111);
                        i4 = ((iM6981 ^ i3) * 29595) ^ 1713434888;
                        i5 = -1359702244;
                    } else {
                        iM6981 = (C0630.m2566("ۖۤ") + i3) * 75;
                        i4 = ((iM6981 ^ i2) * 20063) ^ (-1148774825);
                        i5 = 1589349281;
                    }
                    break;
                case -1002086497:
                case 1262398677:
                    if (C1420.f5096 <= 0) {
                        iM6981 = C2105.m6981("֫᩸") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-3167)) ^ (-580753909);
                        i5 = -1189543053;
                    } else {
                        iM6981 = C0630.m2566("ܳۙ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 9185) ^ 1329786190;
                        i5 = -655834717;
                    }
                    break;
                case -820964490:
                case 1406005494:
                    C19099 c19099 = activityC12581.f37929;
                    if (C1294.m4372() <= 0) {
                        iM6981 = (C2105.m6981("᩻ۗ") + i3) * (-57);
                        i4 = ((iM6981 ^ i2) * (-26299)) ^ 628020255;
                        i5 = -1532057111;
                    } else {
                        int i6 = 2;
                        if (C2105.m6982() != 0) {
                            iM6981 = C2105.m6981("᩹ۜ") ^ i2;
                            i4 = ((iM6981 ^ i3) * (-6349)) ^ 1498797895;
                            i5 = -507666839;
                        } else {
                            m30823(activityC12581, c19099, new RunnableC1000(i6, activityC12581));
                            iM6981 = (C0630.m2566("ܽۖ") + i2) * 43;
                            i4 = ((iM6981 ^ i3) * (-23347)) ^ (-1932475416);
                            i5 = -1002742493;
                        }
                    }
                    break;
                case -573085565:
                case -88105199:
                    if (C1128.f4106 <= 0) {
                        iM6981 = C0630.m2566("ۛۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 14469) ^ (-1410405635);
                        i5 = -2032540476;
                    } else {
                        iM6981 = C0630.m2566("᩶ܿ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-26781)) ^ (-442779069);
                        i5 = 852485810;
                    }
                    break;
                case -382033374:
                case -194053164:
                    RunnableC1937.m6387();
                    if (C2167.f7158 >= 0) {
                        iM6981 = (C2105.m6981("ܺۡ") ^ i2) * (-111);
                        i4 = ((iM6981 ^ i3) * 29595) ^ 1713434888;
                        i5 = -1359702244;
                    } else {
                        iM6981 = C0630.m2566("ۛۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 14469) ^ (-1410405635);
                        i5 = -2032540476;
                    }
                    break;
                case -98287259:
                case -28051099:
                    if (C3432.f10845 >= 0) {
                        iM6981 = (C2105.m6981("ܺۡ") ^ i2) * (-111);
                        i4 = ((iM6981 ^ i3) * 29595) ^ 1713434888;
                        i5 = -1359702244;
                    } else {
                        iM6981 = C2105.m6981("۫ܽ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-26149)) ^ 308986508;
                        i5 = -603677597;
                    }
                    break;
                case 356348317:
                case 378330117:
                    if (C0382.f1805) {
                        iM6981 = (i2 - C2105.m6981("ܶܰ")) * (-57);
                        i4 = ((iM6981 ^ i3) * (-15027)) ^ 1874280048;
                        i5 = 1374883639;
                    } else {
                        iM6981 = C2105.m6981("֫᩸") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-3167)) ^ (-580753909);
                        i5 = -1189543053;
                    }
                    break;
                case 930598483:
                case 977853171:
                    if (c8817.m22791()) {
                        iM6981 = C2105.m6981("ᩴ᩵") ^ i3;
                        i4 = ((iM6981 ^ i2) * 18197) ^ 69439165;
                        i5 = 1970626743;
                    } else {
                        iM6981 = (C0630.m2566("ܽۖ") + i2) * 43;
                        i4 = ((iM6981 ^ i3) * (-23347)) ^ (-1932475416);
                        i5 = -1002742493;
                    }
                    break;
                default:
                    c8817 = activityC12581.f37933;
                    if (C0630.m2564()) {
                        iM6981 = C0630.m2566("ۛۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 14469) ^ (-1410405635);
                        i5 = -2032540476;
                    } else {
                        iM6981 = (C2105.m6981("ܳ֡") ^ i2) * 35;
                        i4 = ((iM6981 ^ i3) * 23655) ^ (-93873653);
                        i5 = 1361544940;
                    }
                    break;
            }
            return;
        }
    }
}
