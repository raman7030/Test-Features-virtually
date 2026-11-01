package p067l;

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
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.analytics.pro.C0719o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

/* JADX INFO: renamed from: l.۫ᩳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: L2RS */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC14326 extends AbstractActivityC5549 {

    /* JADX INFO: renamed from: ۠ۧ */
    public static final /* synthetic */ int f40954 = 0;

    /* JADX INFO: renamed from: ᩴ᩵᩻, reason: not valid java name and contains not printable characters */
    private static final short[] f82177 = {8913, 25947, 25927, 25950, 25932, 25922, 25925, 25972, 25922, 25928, 25924, 25925, 25947, 25927, 25950, 25932, 25922, 25925, 25954, 25935, 25945, 25934, 25927, 25924, 25930, 25935, 25954, 25928, 25924, 25925, 25933, 25945, 25924, 25926, 25967, 25934, 25949, 25934, 25927, 25924, 25947, 25934, 25945, 25959, 25922, 25944, 25951, 9620, 23723, -24065, -18516, 12990, 12989, 13054, 13031, 13027, 5203, -14983, -6097, -3436, 4565, 831, -4419, 8073, 3377, -2785, 5327, -30175, -27845, -32530, 4009, 28019, -29084, -24103, 26303, -31408, -20193, -28735, 25764, -20454, 26890, 27809, -20027, -4131, -4159, -4136, -4150, -4156, -4157, -4124, -4151, -4129, -4152, -4159, -4158, -4148, -4151, -4124, -4146, -4158, -4157, -4160, -4135, -4131, -4159, -4136, -4150, -4156, -4157, 29596, 31451, -19381, 26136, 32664, 29323, 28256, -18399, -19946, -28717, -28601, -19775, 28992, -28089, -31810, -28240, 29744, -24680, 30834, -17646, -20146, -19239, 31009, 30604, -27165, -26854, -27867, 32358, 27395, 31357, -17588, -28803, -29010, -29733, -19892, 26210, -25092, 26814, -24477, -4131, -4159, -4136, -4150, -4156, -4157, -4110, -4156, -4146, -4158, -4157, 7892, 30307, -18804, 30701, -16798, -27079, 25904, 3281, 27898, -30515, 22114, -25559, 25213, -30009, 25909, -27012, -25309, -29039, -32116, -32155, -31371, -31979, 23955, 2626, 2654, 2631, 2645, 2651, 2652, 2683, 2646, -26165, 27980, 31048, 17586, 30560, 20794, -31794, 25532, 20970, 27523, 32437, 22049, 4987, -32740, -32736, -32711, -32725, -32731, -32734, -32763, -32734, -32726, -32733, -32755, -32721, -32712, -32731, -32710, -32731, -32712, -32715};

    /* JADX INFO: renamed from: ֡ۧ */
    public boolean f40955;

    /* JADX INFO: renamed from: ֨ۧ */
    public TextView f40956;

    /* JADX INFO: renamed from: ۖۧ */
    public C20521 f40957;

    /* JADX INFO: renamed from: ۘۧ */
    public String f40958;

    /* JADX INFO: renamed from: ۚۧ */
    public TextView f40959;

    /* JADX INFO: renamed from: ۜۧ */
    public ImageView f40960;

    /* JADX INFO: renamed from: ۡۧ */
    public final C10748 f40961 = C10748.m24758();

    /* JADX INFO: renamed from: ۢۧ */
    public TextView f40962;

    /* JADX INFO: renamed from: ܳۧ */
    public TextView f40963;

    /* JADX INFO: renamed from: ܺۧ */
    public View f40964;

    /* JADX INFO: renamed from: ܿۧ */
    public TextView f40965;

    /* JADX INFO: renamed from: ᩳۧ */
    public TextView f40966;

    /* JADX INFO: renamed from: ᩴۧ */
    public TextView f40967;

    /* JADX INFO: renamed from: ᩵ۧ */
    public TextView f40968;

    /* JADX INFO: renamed from: ᩷ۧ */
    public Button f40969;

    /* JADX INFO: renamed from: ᩻ۧ */
    public ViewGroup f40970;

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
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
        int i7 = RunnableC0871.f81839;
        int i8 = AbstractC0942.f81890;
        int iM55979 = (C0946.m55979("ۨۜ") ^ i8) * (-55);
        int i9 = ((iM55979 ^ i7) * 29375) ^ 423593767;
        int i10 = 1227540142;
        while (true) {
            i6 = ((((i6 ^ i7) * (-19307)) >> 31) & i9) ^ (iM55979 ^ i10);
            switch (i6) {
                case -2012201022:
                case -648312773:
                    i4 = 54943;
                    iM55979 = C0946.m55979("ۢᩴ") ^ i8;
                    i9 = ((iM55979 ^ i7) * 12029) ^ (-620470318);
                    i10 = -568858467;
                    break;
                case -2000844596:
                case -573369064:
                    sArr2 = f82177;
                    i5 = 203;
                    if (C0894.m55769() >= 0) {
                        iM55979 = C0946.m55979("ۡܿ") ^ i8;
                        i9 = ((iM55979 ^ i7) * 9819) ^ (-78541768);
                        i10 = 2111454150;
                    } else {
                        iM55979 = C0946.m55979("ۨܳ") ^ i7;
                        i9 = ((iM55979 ^ i8) * (-26855)) ^ (-504921515);
                        i10 = -963505474;
                    }
                    break;
                case -1561819114:
                case 1925919065:
                    C0989.m56095();
                    if (C0949.f81897 >= 0) {
                        iM55979 = C0946.m55979("ܽ᩷") ^ i8;
                        i9 = ((iM55979 ^ i7) * (-20705)) ^ 245114060;
                        i10 = -805636617;
                    } else {
                        iM55979 = C0946.m55979("᩸۫") ^ i8;
                        i9 = ((iM55979 ^ i7) * (-16221)) ^ (-1972207886);
                        i10 = 1696285755;
                    }
                    break;
                case -1421494944:
                case 2139435062:
                    i = s * s2;
                    i2 = s * s;
                    if (C0892.f81851) {
                        iM55979 = C0946.m55979("֡۠") ^ i8;
                        i9 = ((iM55979 ^ i7) * 2215) ^ (-2144309326);
                        i10 = 301047194;
                    } else {
                        iM55979 = C0946.m55979("ܽ᩷") ^ i8;
                        i9 = ((iM55979 ^ i7) * (-20705)) ^ 245114060;
                        i10 = -805636617;
                    }
                    break;
                case -1417622057:
                case -1201640572:
                    C1025.m56230();
                    if (!C1929.m56553()) {
                        iM55979 = (C0873.m55680("᩵֨") ^ i7) * 65;
                        i9 = ((iM55979 ^ i8) * (-26407)) ^ (-68410520);
                        i10 = 1793152037;
                    } else {
                        iM55979 = C0946.m55979("ܽ᩷") ^ i8;
                        i9 = ((iM55979 ^ i7) * (-20705)) ^ 245114060;
                        i10 = -805636617;
                    }
                    break;
                case -1347820908:
                case 165971736:
                    i4 = 32844;
                    iM55979 = C0946.m55979("ۢᩴ") ^ i8;
                    i9 = ((iM55979 ^ i7) * 12029) ^ (-620470318);
                    i10 = -568858467;
                    break;
                case -1004598013:
                case 1230153855:
                    if (C1044.m56286() <= 0) {
                        iM55979 = C0946.m55979("᩸۫") ^ i8;
                        i9 = ((iM55979 ^ i7) * (-16221)) ^ (-1972207886);
                        i10 = 1696285755;
                    } else {
                        iM55979 = (C0946.m55979("ᩴۚ") ^ i7) * (-89);
                        i9 = ((iM55979 ^ i8) * 32157) ^ 839964079;
                        i10 = -1963654430;
                    }
                    break;
                case -929220909:
                case 771792285:
                    s = sArr[c];
                    s2 = 5758;
                    if (C1028.f81950 <= 0) {
                        iM55979 = C0946.m55979("ۡܿ") ^ i8;
                        i9 = ((iM55979 ^ i7) * 9819) ^ (-78541768);
                        i10 = 2111454150;
                    } else {
                        iM55979 = C0873.m55680("۬ᩳ") ^ i7;
                        i9 = ((iM55979 ^ i8) * 15745) ^ 924438781;
                        i10 = -427934050;
                    }
                    break;
                case -830088628:
                case 1921591529:
                    if (C1124.f82007 >= 0) {
                        iM55979 = C0946.m55979("۫᩵") ^ i7;
                        i9 = ((iM55979 ^ i8) * 3643) ^ 791881713;
                        i10 = 563832001;
                    } else {
                        iM55979 = (C0873.m55680("ܰ֫") + i7) * 53;
                        i9 = ((iM55979 ^ i8) * (-14325)) ^ 1491529089;
                        i10 = -611725473;
                    }
                    break;
                case -754385007:
                case 1707669697:
                    if (C0989.f81920 >= 0) {
                        iM55979 = C0946.m55979("۫᩵") ^ i7;
                        i9 = ((iM55979 ^ i8) * 3643) ^ 791881713;
                        i10 = 563832001;
                    } else {
                        iM55979 = C0946.m55979("ۘܶ") ^ i7;
                        i9 = ((iM55979 ^ i8) * 15575) ^ (-863497790);
                        i10 = 1575234034;
                    }
                    break;
                case -682708156:
                case 867365067:
                    C0890.m55740();
                    return null;
                case -227120259:
                case 90928638:
                    c = 202;
                    if (C0992.f81922 >= 0) {
                        iM55979 = C0946.m55979("۫᩵") ^ i7;
                        i9 = ((iM55979 ^ i8) * 3643) ^ 791881713;
                        i10 = 563832001;
                    } else {
                        iM55979 = (C0946.m55979("ۘ᩺") ^ i8) * (-77);
                        i9 = ((iM55979 ^ i7) * (-19995)) ^ (-2071045790);
                        i10 = 643694528;
                    }
                    break;
                case 5505536:
                case 1600729178:
                    return C0854.m55597(sArr2, i5, 18, i4);
                case 29198629:
                case 728787003:
                    if (!C0927.f81875) {
                        iM55979 = (C0873.m55680("᩵֨") ^ i7) * 65;
                        i9 = ((iM55979 ^ i8) * (-26407)) ^ (-68410520);
                        i10 = 1793152037;
                    } else {
                        iM55979 = C0946.m55979("۫᩵") ^ i7;
                        i9 = ((iM55979 ^ i8) * 3643) ^ 791881713;
                        i10 = 563832001;
                    }
                    break;
                case 199798513:
                case 1197188934:
                    i3 = 8288641;
                    if (C0955.m56025()) {
                        iM55979 = C0946.m55979("ܽ᩷") ^ i8;
                        i9 = ((iM55979 ^ i7) * (-20705)) ^ 245114060;
                        i10 = -805636617;
                    } else {
                        iM55979 = (i8 - C0946.m55979("ۖ᩻")) * (-117);
                        i9 = ((iM55979 ^ i7) * 13883) ^ (-1309025822);
                        i10 = 1402836608;
                    }
                    break;
                case 675469249:
                case 1741549990:
                    sArr = f82177;
                    if (C0866.m55645()) {
                        iM55979 = (i8 - C0873.m55680("ۛ᩷")) * 19;
                        i9 = ((iM55979 ^ i7) * 4931) ^ 1713683419;
                        i10 = -1609355191;
                    } else {
                        iM55979 = C0946.m55979("ۡܿ") ^ i8;
                        i9 = ((iM55979 ^ i7) * 9819) ^ (-78541768);
                        i10 = 2111454150;
                    }
                    break;
                case 937741258:
                case 2104150767:
                    if (i - (i2 + i3) > 0) {
                        iM55979 = (i7 - C0873.m55680("ᩴ᩷")) * (-61);
                        i9 = ((iM55979 ^ i8) * 32535) ^ (-1676120744);
                        i10 = -944900282;
                    } else {
                        iM55979 = (C0946.m55979("ۘܳ") ^ i7) * (-55);
                        i9 = ((iM55979 ^ i8) * (-13631)) ^ 1139921627;
                        i10 = 1151528192;
                    }
                    break;
                case 986903533:
                case 1780213111:
                    if (C0898.f81858 <= 0) {
                        iM55979 = C0946.m55979("ۡܿ") ^ i8;
                        i9 = ((iM55979 ^ i7) * 9819) ^ (-78541768);
                        i10 = 2111454150;
                    } else {
                        iM55979 = C0873.m55680("֡᩵") ^ i8;
                        i9 = ((iM55979 ^ i7) * (-8305)) ^ (-216895496);
                        i10 = 862109622;
                    }
                    break;
                default:
                    C0930.m55885();
                    iM55979 = C0946.m55979("᩸۫") ^ i8;
                    i9 = ((iM55979 ^ i7) * (-16221)) ^ (-1972207886);
                    i10 = 1696285755;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0251 A[PHI: r2 r7 r16
      0x0251: PHI (r2v4 short[]) = (r2v3 short[]), (r2v2 short[]), (r2v2 short[]) binds: [B:70:0x024f, B:55:0x0191, B:12:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r7v4 short) = (r7v2 short), (r7v3 short), (r7v2 short) binds: [B:70:0x024f, B:55:0x0191, B:12:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r16v27 int) = (r16v5 int), (r16v8 int), (r16v28 int) binds: [B:70:0x024f, B:55:0x0191, B:12:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܽ */
    public static /* synthetic */ void m32915(ActivityC14326 activityC14326) {
        int iM55979;
        int i;
        int iM559710;
        int i2;
        int i3;
        int iM559711 = 0;
        String strM56233 = null;
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
        int i9 = C1044.f81959;
        int i10 = C0866.f81837;
        int iM559712 = C0946.m55979("ۗۨ") ^ i10;
        int i11 = ((iM559712 ^ i9) * (-12391)) ^ (-1387715311);
        int i12 = 1972015870;
        while (true) {
            int i13 = iM559712 ^ i12;
            while (true) {
                i8 = ((((i8 ^ i9) * 23151) >> 31) & i11) ^ i13;
                switch (i8) {
                    case -2131264452:
                    case 1057749619:
                        iM559711 = C0946.m55979(strM56233) ^ 2097405077;
                        if (C1053.f81965 > 0) {
                            iM559712 = C0946.m55979("ۗۢ") ^ i10;
                            i11 = ((iM559712 ^ i9) * 22975) ^ (-347836433);
                            i12 = 509389335;
                        }
                        iM559710 = (C0946.m55979("۫ᩴ") + i10) * (-87);
                        iM559711 = iM559711;
                        i2 = ((iM559710 ^ i9) * 8083) ^ 1605002592;
                        i3 = 5735162;
                        i13 = iM559710 ^ i3;
                        i11 = i2;
                        iM559711 = iM559711;
                        break;
                    case -2071059935:
                    case 1340702234:
                        i7 = 67;
                        if (C0937.f81884) {
                            iM559712 = C0873.m55680("᩶ܰ") ^ i9;
                            i11 = ((iM559712 ^ i10) * (-30453)) ^ (-395183189);
                            i12 = 487194823;
                        }
                        iM559711 = iM559711;
                        iM55979 = C0873.m55680("ܿ֨") ^ i10;
                        i11 = ((iM55979 ^ i9) * 1927) ^ 652746098;
                        i = -1173261010;
                        i13 = iM55979 ^ i;
                        iM559711 = iM559711;
                        break;
                    case -1830799034:
                    case 733885561:
                        C0845.m55584();
                        break;
                    case -1789777307:
                    case 645681701:
                        strM56233 = C1025.m56233(sArr2, i7, 3, i6);
                        if (RunnableC0871.f81839 < 0) {
                            iM559712 = C0946.m55979("ۙ۫") ^ i10;
                            i11 = ((iM559712 ^ i9) * 25545) ^ (-308425794);
                            i12 = -534218942;
                        }
                        iM559711 = iM559711;
                        iM55979 = C0873.m55680("ܿ֨") ^ i10;
                        i11 = ((iM55979 ^ i9) * 1927) ^ 652746098;
                        i = -1173261010;
                        i13 = iM55979 ^ i;
                        iM559711 = iM559711;
                        break;
                    case -1765080887:
                    case 1641082996:
                        i6 = 627;
                        iM55979 = C0946.m55979("ۚۨ") ^ i10;
                        i11 = ((iM55979 ^ i9) * 28521) ^ 1077589500;
                        i = 234422226;
                        i13 = iM55979 ^ i;
                        iM559711 = iM559711;
                        break;
                    case -1431757300:
                    case 920706823:
                        iM559711 = iM559711;
                        sArr = f82177;
                        if (C0955.f81898) {
                            iM55979 = C0946.m55979("֡᩹") ^ i9;
                            i11 = ((iM55979 ^ i10) * (-18283)) ^ (-1179157920);
                            i = 448520294;
                        } else {
                            iM55979 = C0946.m55979("᩹᩹") ^ i9;
                            i11 = ((iM55979 ^ i10) * (-5729)) ^ (-428334633);
                            i = -884742694;
                        }
                        i13 = iM55979 ^ i;
                        iM559711 = iM559711;
                        break;
                    case -1120619633:
                    case 1677347576:
                        iM559711 = iM559711;
                        s2 = 32690;
                        if (C0947.f81895) {
                            iM55979 = C0946.m55979("֡᩹") ^ i9;
                            i11 = ((iM55979 ^ i10) * (-18283)) ^ (-1179157920);
                            i = 448520294;
                        } else {
                            iM55979 = C0946.m55979("᩶᩺") ^ i9;
                            i11 = ((iM55979 ^ i10) * 28853) ^ (-1890959034);
                            i = -349147542;
                        }
                        i13 = iM55979 ^ i;
                        iM559711 = iM559711;
                        break;
                    case -1094904962:
                    case -757370209:
                        C14976.m34316(activityC14326.f40958);
                        if (C1124.f82007 < 0) {
                            iM559710 = (C0946.m55979("۬ᩳ") + i10) * 109;
                            iM559711 = iM559711;
                            i2 = ((iM559710 ^ i9) * 4469) ^ 743754593;
                            i3 = 45212510;
                            i13 = iM559710 ^ i3;
                            i11 = i2;
                            iM559711 = iM559711;
                        }
                        iM559711 = iM559711;
                        iM55979 = C0946.m55979("֡᩹") ^ i9;
                        i11 = ((iM55979 ^ i10) * (-18283)) ^ (-1179157920);
                        i = 448520294;
                        i13 = iM55979 ^ i;
                        iM559711 = iM559711;
                        break;
                    case -1048631553:
                    case 463060928:
                        C0917.m55842(iM559711);
                        C0955.m56027(activityC14326);
                        break;
                    case -927166166:
                    case 721184566:
                        if (C0989.f81920 < 0) {
                            iM559712 = C0873.m55680("ܶ۬") ^ i9;
                            i11 = ((iM559712 ^ i10) * 25301) ^ 1068201060;
                            i12 = -1813459854;
                        }
                        iM559711 = iM559711;
                        iM55979 = C0946.m55979("֡᩹") ^ i9;
                        i11 = ((iM55979 ^ i10) * (-18283)) ^ (-1179157920);
                        i = 448520294;
                        i13 = iM55979 ^ i;
                        iM559711 = iM559711;
                        break;
                    case -864186081:
                    case 12835868:
                        sArr2 = f82177;
                        if (C1404.f82149 < 0) {
                            iM559712 = C0873.m55680("ܽ᩸") ^ i9;
                            i11 = ((iM559712 ^ i10) * 11591) ^ (-1328400581);
                            i12 = -944597735;
                        } else {
                            iM559712 = C0873.m55680("ܶ۬") ^ i9;
                            i11 = ((iM559712 ^ i10) * 25301) ^ 1068201060;
                            i12 = -1813459854;
                        }
                        break;
                    case -782569143:
                    case 464731100:
                        C0967.m56074();
                        iM559711 = iM559711;
                        iM55979 = C0946.m55979("֡᩹") ^ i9;
                        i11 = ((iM55979 ^ i10) * (-18283)) ^ (-1179157920);
                        i = 448520294;
                        i13 = iM55979 ^ i;
                        iM559711 = iM559711;
                        break;
                    case -530732638:
                    case 923931503:
                        if (C1124.f82007 >= 0) {
                            iM559712 = C0873.m55680("ܶ۬") ^ i9;
                            i11 = ((iM559712 ^ i10) * 25301) ^ 1068201060;
                            i12 = -1813459854;
                        }
                        iM559710 = (C0946.m55979("۫ᩴ") + i10) * (-87);
                        iM559711 = iM559711;
                        i2 = ((iM559710 ^ i9) * 8083) ^ 1605002592;
                        i3 = 5735162;
                        i13 = iM559710 ^ i3;
                        i11 = i2;
                        iM559711 = iM559711;
                        break;
                    case -486564848:
                    case 1125890850:
                        iM559711 = iM559711;
                        c = 'B';
                        if (C0873.f81841 > 0) {
                            iM55979 = (C0873.m55680("ܽ֫") ^ i10) * (-29);
                            i11 = ((iM55979 ^ i9) * (-9631)) ^ (-603922862);
                            i = 1308399797;
                            i13 = iM55979 ^ i;
                            iM559711 = iM559711;
                        } else {
                            iM559711 = iM559711;
                            iM559710 = (C0946.m55979("۫ᩴ") + i10) * (-87);
                            iM559711 = iM559711;
                            i2 = ((iM559710 ^ i9) * 8083) ^ 1605002592;
                            i3 = 5735162;
                            i13 = iM559710 ^ i3;
                            i11 = i2;
                            iM559711 = iM559711;
                        }
                        break;
                    case 115712190:
                    case 1938695205:
                        iM559711 = iM559711;
                        i5 = i4 + 267159025;
                        if (C0898.f81858 <= 0) {
                            iM55979 = C0946.m55979("᩺᩸") ^ i9;
                            i11 = ((iM55979 ^ i10) * 16631) ^ (-22974914);
                            i = -1085649527;
                        } else {
                            iM55979 = C0946.m55979("ۢۖ") ^ i10;
                            i11 = ((iM55979 ^ i9) * (-26313)) ^ (-1696420306);
                            i = 1645689272;
                        }
                        i13 = iM55979 ^ i;
                        iM559711 = iM559711;
                        break;
                    case 785574376:
                    case 1697826148:
                        C1036.m56257();
                        if (C1071.f81975 > 0) {
                            iM559711 = iM559711;
                            iM55979 = C0946.m55979("᩺᩸") ^ i9;
                            i11 = ((iM55979 ^ i10) * 16631) ^ (-22974914);
                            i = -1085649527;
                            i13 = iM55979 ^ i;
                            iM559711 = iM559711;
                        }
                        iM559711 = iM559711;
                        iM55979 = C0946.m55979("֡᩹") ^ i9;
                        i11 = ((iM55979 ^ i10) * (-18283)) ^ (-1179157920);
                        i = 448520294;
                        i13 = iM55979 ^ i;
                        iM559711 = iM559711;
                        break;
                    case 1104769755:
                    case 1667772790:
                        iM559711 = iM559711;
                        if ((s * s2) - i5 <= 0) {
                            iM55979 = (i10 - C0946.m55979("᩷ܶ")) * 83;
                            i11 = ((iM55979 ^ i9) * (-3581)) ^ 1036318625;
                            i = -1046245723;
                        } else {
                            iM55979 = C0946.m55979("ܽ֡") ^ i9;
                            i11 = ((iM55979 ^ i10) * 181) ^ (-770135965);
                            i = -861570891;
                        }
                        i13 = iM55979 ^ i;
                        iM559711 = iM559711;
                        break;
                    case 1157533545:
                    case 1319916961:
                        i6 = 36674;
                        iM55979 = C0946.m55979("ۚۨ") ^ i10;
                        i11 = ((iM55979 ^ i9) * 28521) ^ 1077589500;
                        i = 234422226;
                        i13 = iM55979 ^ i;
                        iM559711 = iM559711;
                        break;
                    default:
                        iM559711 = iM559711;
                        s = sArr[c];
                        i4 = s * s;
                        if (ViewOnClickListenerC0939.f81888 <= 0) {
                            iM55979 = C0873.m55680("ܿ֨") ^ i10;
                            i11 = ((iM55979 ^ i9) * 1927) ^ 652746098;
                            i = -1173261010;
                        } else {
                            iM55979 = (C0873.m55680("ۚ֡") ^ i9) * (-27);
                            i11 = ((iM55979 ^ i10) * 6921) ^ 570988963;
                            i = -304129186;
                        }
                        i13 = iM55979 ^ i;
                        iM559711 = iM559711;
                        break;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m32902(ActivityC14326 activityC14326, View view, C1914 c1914) {
        C1388 c1388M51163 = null;
        C1388 c1388M51164 = null;
        int i = 0;
        C1388 c1388M51165 = null;
        ViewGroup viewGroup = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = -1965334743;
        int i5 = C1025.f81947;
        int i6 = C1046.f81962;
        int iM55979 = C0946.m55979("᩷ۜ") ^ i6;
        int i7 = ((iM55979 ^ i5) * 18133) ^ 238100071;
        int i8 = 1295507716;
        while (true) {
            i4 = ((((i4 ^ i5) * (-4529)) >> 31) & i7) ^ (iM55979 ^ i8);
            switch (i4) {
                case -2135854342:
                case 2104069101:
                    if (C1048.m56305() >= 0) {
                        iM55979 = C0873.m55680("ܺۙ") ^ i5;
                        i7 = ((iM55979 ^ i6) * (-25089)) ^ (-1086082770);
                        i8 = 1115192925;
                    } else {
                        iM55979 = (C0873.m55680("ۨۖ") ^ i5) * (-113);
                        i7 = ((iM55979 ^ i6) * (-19843)) ^ (-1644627872);
                        i8 = 2094950399;
                    }
                    break;
                case -1970815002:
                case 154166626:
                    C1404.m56468();
                    iM55979 = C0873.m55680("ܺۙ") ^ i5;
                    i7 = ((iM55979 ^ i6) * (-25089)) ^ (-1086082770);
                    i8 = 1115192925;
                    break;
                case -1914850108:
                case 453174723:
                    viewGroup = activityC14326.f40970;
                    i2 = c1388M51163.f36105;
                    i3 = 0;
                    if (C1929.f83011 != 0) {
                        iM55979 = (C0946.m55979("ۤܳ") ^ i6) * (-119);
                        i7 = ((iM55979 ^ i5) * 1301) ^ (-162207699);
                        i8 = 586676814;
                    } else {
                        iM55979 = (i6 - C0873.m55680("ۖܳ")) * 91;
                        i7 = ((iM55979 ^ i5) * 25253) ^ 2106008648;
                        i8 = -2129624869;
                    }
                    break;
                case -1835222574:
                case 1481414357:
                    viewGroup.setPadding(i3, i2, i3, i3);
                    if (C0866.f81837 >= 0) {
                        iM55979 = (C0873.m55680("ۨ᩵") + i5) * 87;
                        i7 = ((iM55979 ^ i6) * 24331) ^ 936436517;
                        i8 = -354652724;
                    } else {
                        iM55979 = C0873.m55680("ܽ۬") ^ i5;
                        i7 = ((iM55979 ^ i6) * (-17463)) ^ (-1259504319);
                        i8 = -1885948144;
                    }
                    break;
                case -1593496879:
                case 1559593671:
                    if (C0866.f81837 >= 0) {
                        iM55979 = (i6 - C0946.m55979("᩵ۘ")) * 37;
                        i7 = ((iM55979 ^ i5) * (-13209)) ^ (-252696675);
                        i8 = -56403474;
                    } else {
                        iM55979 = C0946.m55979("ᩳܽ") ^ i5;
                        i7 = ((iM55979 ^ i6) * 31265) ^ (-1996079482);
                        i8 = -404874907;
                    }
                    break;
                case -1391455773:
                case 1156578857:
                    c1388M51165 = c1914.m51163(i);
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = (i6 - C0946.m55979("᩵ۘ")) * 37;
                        i7 = ((iM55979 ^ i5) * (-13209)) ^ (-252696675);
                        i8 = -56403474;
                    } else {
                        iM55979 = C0873.m55680("ܶܳ") ^ i5;
                        i7 = ((iM55979 ^ i6) * 4487) ^ 1157416262;
                        i8 = -276446573;
                    }
                    break;
                case -1224779409:
                case 815976490:
                    C1053.m56327();
                    C0866.m55645();
                    break;
                case -895668854:
                case 418271518:
                    if (C1071.m56343() != 0) {
                        iM55979 = C0873.m55680("ܺۙ") ^ i5;
                        i7 = ((iM55979 ^ i6) * (-25089)) ^ (-1086082770);
                        i8 = 1115192925;
                    } else {
                        iM55979 = (C0873.m55680("᩹᩸") + i6) * (-9);
                        i7 = ((iM55979 ^ i5) * 18881) ^ (-1812025552);
                        i8 = 1920645872;
                    }
                    break;
                case -343830833:
                case 589353265:
                    c1388M51164 = c1914.m51163(2);
                    i = 8;
                    if (C1124.f82007 >= 0) {
                        iM55979 = (i6 - C0946.m55979("᩵ۘ")) * 37;
                        i7 = ((iM55979 ^ i5) * (-13209)) ^ (-252696675);
                        i8 = -56403474;
                    } else {
                        iM55979 = C0873.m55680("ۜᩳ") ^ i6;
                        i7 = ((iM55979 ^ i5) * 16783) ^ 1279111993;
                        i8 = 304515993;
                    }
                    break;
                case -257373510:
                case 1097473892:
                    if (C1044.m56286() > 0) {
                        iM55979 = (C0946.m55979("ۤܳ") ^ i6) * (-119);
                        i7 = ((iM55979 ^ i5) * 1301) ^ (-162207699);
                        i8 = 586676814;
                    } else {
                        iM55979 = C0873.m55680("ܺۙ") ^ i5;
                        i7 = ((iM55979 ^ i6) * (-25089)) ^ (-1086082770);
                        i8 = 1115192925;
                    }
                    break;
                case -120018402:
                case 2064748978:
                    view.setPadding(i3, i3, i3, C1036.m56265(c1388M51164.f36102, c1388M51165.f36102));
                    break;
                case 324723618:
                case 1371271492:
                    c1388M51163 = c1914.m51163(1);
                    if (C0866.m55645()) {
                        iM55979 = (C0946.m55979("ۖۚ") + i6) * 49;
                        i7 = ((iM55979 ^ i5) * 13779) ^ 83193436;
                        i8 = 2000811956;
                    } else {
                        iM55979 = C0946.m55979("۬᩺") ^ i6;
                        i7 = ((iM55979 ^ i5) * (-15619)) ^ 1484558489;
                        i8 = 85105403;
                    }
                    break;
                case 469582054:
                case 661215482:
                    if (C1036.m56257() <= 0) {
                        iM55979 = (C0873.m55680("ۨ᩵") + i5) * 87;
                        i7 = ((iM55979 ^ i6) * 24331) ^ 936436517;
                        i8 = -354652724;
                    } else {
                        iM55979 = (C0873.m55680("᩶ᩴ") + i5) * 51;
                        i7 = ((iM55979 ^ i6) * 8367) ^ 207718654;
                        i8 = -1353055473;
                    }
                    break;
                case 764271056:
                case 1820481106:
                    if (C1071.f81975 <= 0) {
                        iM55979 = (C0873.m55680("ۨ᩵") + i5) * 87;
                        i7 = ((iM55979 ^ i6) * 24331) ^ 936436517;
                        i8 = -354652724;
                    } else {
                        iM55979 = C0946.m55979("֫ۨ") ^ i6;
                        i7 = ((iM55979 ^ i5) * 31331) ^ (-1674651597);
                        i8 = 171749117;
                    }
                    break;
                case 1228216328:
                case 1980271450:
                    if (C0930.f81879 <= 0) {
                        iM55979 = C0946.m55979("۬᩺") ^ i6;
                        i7 = ((iM55979 ^ i5) * (-15619)) ^ 1484558489;
                        i8 = 85105403;
                    } else {
                        iM55979 = (C0946.m55979("ۤܳ") ^ i6) * (-119);
                        i7 = ((iM55979 ^ i5) * 1301) ^ (-162207699);
                        i8 = 586676814;
                    }
                    break;
                default:
                    RunnableC1014.m56177();
                    if (C0894.m55769() < 0) {
                        iM55979 = (C0873.m55680("ۨ᩵") + i5) * 87;
                        i7 = ((iM55979 ^ i6) * 24331) ^ 936436517;
                        i8 = -354652724;
                    } else {
                        iM55979 = (C0946.m55979("ۤܳ") ^ i6) * (-119);
                        i7 = ((iM55979 ^ i5) * 1301) ^ (-162207699);
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
    /* JADX INFO: renamed from: ֫ */
    public static void m32899(AbstractActivityC5549 abstractActivityC5549, String str, Drawable drawable, boolean z, String str2) {
        int iM55680;
        int i;
        int i2;
        int i3;
        int iM55681;
        int i4;
        AbstractActivityC5549 abstractActivityC55410 = abstractActivityC5549;
        String str3 = str2;
        String strM56293 = null;
        Intent intent = null;
        short[] sArr = null;
        char c = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i8 = 173891931;
        int i9 = C0866.f81837;
        int i10 = ViewOnClickListenerC0939.f81888;
        int iM55979 = (C0946.m55979("ۗۧ") + i9) * (-77);
        int i11 = ((iM55979 ^ i10) * (-6723)) ^ 51201404;
        int i12 = -1662043962;
        while (true) {
            int i13 = iM55979 ^ i12;
            while (true) {
                i8 = ((((i8 ^ i10) * 21507) >> 31) & i11) ^ i13;
                switch (i8) {
                    case -2126152310:
                    case 1774170017:
                        i7 = 13808;
                        iM55680 = C0946.m55979("ᩴܺ") ^ i10;
                        i = ((iM55680 ^ i9) * (-5205)) ^ 1168732981;
                        i2 = -328607821;
                        i13 = iM55680 ^ i2;
                        i11 = i;
                        i8 = i8;
                        abstractActivityC55410 = abstractActivityC5549;
                        str3 = str2;
                        break;
                    case -1918226700:
                    case 410333450:
                        i3 = i8;
                        intent.putExtra(C0946.m55986(sArr3, 20, 10, i7), z);
                        if (str3 != null) {
                            iM55681 = (i9 - C0873.m55680("ۘܿ")) * 119;
                            i11 = ((iM55681 ^ i10) * 8173) ^ 1561408919;
                            i4 = -1016453551;
                        } else {
                            iM55681 = C0873.m55680("ۚۘ") ^ i10;
                            i11 = ((iM55681 ^ i9) * (-19933)) ^ 1967395603;
                            i4 = 677217142;
                        }
                        i13 = iM55681 ^ i4;
                        i8 = i3;
                        break;
                    case -1876418153:
                    case 98372296:
                        i8 = i8;
                        if (C0955.f81898) {
                            iM55680 = C0873.m55680("ۖۖ") ^ i10;
                            i = ((iM55680 ^ i9) * 19459) ^ (-334567850);
                            i2 = 2087883547;
                        } else {
                            iM55680 = (i9 - C0946.m55979("ۤܰ")) * 59;
                            i = ((iM55680 ^ i10) * (-16343)) ^ 152324544;
                            i2 = -789956767;
                        }
                        i13 = iM55680 ^ i2;
                        i11 = i;
                        i8 = i8;
                        abstractActivityC55410 = abstractActivityC5549;
                        str3 = str2;
                        break;
                    case -1753521411:
                    case 822294329:
                        i8 = i8;
                        if ((6927424 + i6) - i5 >= 0) {
                            iM55680 = C0873.m55680("᩵۠") ^ i10;
                            i = ((iM55680 ^ i9) * 30643) ^ 1097482478;
                            i2 = -1013922693;
                        } else {
                            iM55680 = C0873.m55680("᩷᩵") ^ i9;
                            i = ((iM55680 ^ i10) * 5287) ^ 315119245;
                            i2 = 1583703383;
                        }
                        i13 = iM55680 ^ i2;
                        i11 = i;
                        i8 = i8;
                        abstractActivityC55410 = abstractActivityC5549;
                        str3 = str2;
                        break;
                    case -1753274187:
                    case 2129821231:
                        i8 = i8;
                        if (C0912.f81867 <= 0) {
                            iM55680 = (i10 - C0873.m55680("᩸᩻")) * (-19);
                            i = ((iM55680 ^ i9) * 3103) ^ (-1593703227);
                            i2 = 2040891524;
                        } else {
                            iM55680 = C0873.m55680("ۙۡ") ^ i10;
                            i = ((iM55680 ^ i9) * (-6903)) ^ (-1276078251);
                            i2 = -147092926;
                        }
                        i13 = iM55680 ^ i2;
                        i11 = i;
                        i8 = i8;
                        abstractActivityC55410 = abstractActivityC5549;
                        str3 = str2;
                        break;
                    case -1750049977:
                    case 552082340:
                        i7 = 25899;
                        iM55680 = C0946.m55979("ᩴܺ") ^ i10;
                        i = ((iM55680 ^ i9) * (-5205)) ^ 1168732981;
                        i2 = -328607821;
                        i13 = iM55680 ^ i2;
                        i11 = i;
                        i8 = i8;
                        abstractActivityC55410 = abstractActivityC5549;
                        str3 = str2;
                        break;
                    case -1558645411:
                    case -834461708:
                        i8 = i8;
                        if (C1048.f81963) {
                            iM55680 = (C0873.m55680("ܰۧ") + i9) * 43;
                            i = ((iM55680 ^ i10) * 2429) ^ (-536423066);
                            i2 = -1871439926;
                        } else {
                            iM55680 = C0873.m55680("ۖۖ") ^ i10;
                            i = ((iM55680 ^ i9) * 19459) ^ (-334567850);
                            i2 = 2087883547;
                        }
                        i13 = iM55680 ^ i2;
                        i11 = i;
                        i8 = i8;
                        abstractActivityC55410 = abstractActivityC5549;
                        str3 = str2;
                        break;
                    case -1204017760:
                    case 1700011228:
                        C1044.m56286();
                        if (C0906.f81862 < 0) {
                            i8 = i8;
                            iM55680 = C0946.m55979("᩶ۖ") ^ i9;
                            i = ((iM55680 ^ i10) * 10659) ^ (-1048418889);
                            i2 = 814619231;
                            i13 = iM55680 ^ i2;
                            i11 = i;
                            i8 = i8;
                            abstractActivityC55410 = abstractActivityC5549;
                            str3 = str2;
                        }
                        i8 = i8;
                        iM55680 = C0873.m55680("ۖۖ") ^ i10;
                        i = ((iM55680 ^ i9) * 19459) ^ (-334567850);
                        i2 = 2087883547;
                        i13 = iM55680 ^ i2;
                        i11 = i;
                        i8 = i8;
                        abstractActivityC55410 = abstractActivityC5549;
                        str3 = str2;
                        break;
                    case -1203156798:
                    case 1910574801:
                        i8 = i8;
                        strM56293 = C1046.m56293(f82177, 1, 11, i7);
                        if (C1017.m56187() <= 0) {
                            iM55680 = C0873.m55680("ۖۖ") ^ i10;
                            i = ((iM55680 ^ i9) * 19459) ^ (-334567850);
                            i2 = 2087883547;
                        } else {
                            iM55680 = C0946.m55979("֨ᩴ") ^ i9;
                            i = ((iM55680 ^ i10) * 29863) ^ (-422033290);
                            i2 = -1053846418;
                        }
                        i13 = iM55680 ^ i2;
                        i11 = i;
                        i8 = i8;
                        abstractActivityC55410 = abstractActivityC5549;
                        str3 = str2;
                        break;
                    case -1139025716:
                    case 868747942:
                        i8 = i8;
                        sArr = f82177;
                        c = 0;
                        if (C1071.f81975 <= 0) {
                            iM55680 = C0946.m55979("᩶ۖ") ^ i9;
                            i = ((iM55680 ^ i10) * 10659) ^ (-1048418889);
                            i2 = 814619231;
                        } else {
                            iM55680 = (C0946.m55979("ۜ۫") + i10) * 33;
                            i = ((iM55680 ^ i9) * (-6801)) ^ (-791920343);
                            i2 = 905265113;
                        }
                        i13 = iM55680 ^ i2;
                        i11 = i;
                        i8 = i8;
                        abstractActivityC55410 = abstractActivityC5549;
                        str3 = str2;
                        break;
                    case -921466764:
                    case 1325087174:
                        i8 = i8;
                        C0917.m55843(intent, C0912.m55822(sArr2, 12, 8, i7), str);
                        sArr3 = f82177;
                        if (C1003.m56123() != 0) {
                            iM55680 = C0946.m55979("᩶ۖ") ^ i9;
                            i = ((iM55680 ^ i10) * 10659) ^ (-1048418889);
                            i2 = 814619231;
                            i13 = iM55680 ^ i2;
                            i11 = i;
                            i8 = i8;
                            abstractActivityC55410 = abstractActivityC5549;
                        } else {
                            int iM55682 = (i9 - C0873.m55680("ۘ֨")) * (-61);
                            i13 = iM55682 ^ (-860006701);
                            i8 = i8;
                            i11 = ((iM55682 ^ i10) * (-32215)) ^ 244064992;
                        }
                        str3 = str2;
                        break;
                    case -532550733:
                    case 1093678749:
                        C1012.m56134();
                        i8 = i8;
                        iM55680 = C0873.m55680("ۖۖ") ^ i10;
                        i = ((iM55680 ^ i9) * 19459) ^ (-334567850);
                        i2 = 2087883547;
                        i13 = iM55680 ^ i2;
                        i11 = i;
                        i8 = i8;
                        abstractActivityC55410 = abstractActivityC5549;
                        str3 = str2;
                        break;
                    case -345890828:
                    case -81421321:
                        i8 = i8;
                        if (C0877.m55696()) {
                            iM55680 = C0873.m55680("۟ۨ") ^ i10;
                            i = ((iM55680 ^ i9) * (-14693)) ^ (-1972867696);
                            i2 = 1375630614;
                        } else {
                            iM55680 = C0873.m55680("ۨۖ") ^ i9;
                            i = ((iM55680 ^ i10) * 11945) ^ 1947803526;
                            i2 = 875612698;
                        }
                        i13 = iM55680 ^ i2;
                        i11 = i;
                        i8 = i8;
                        abstractActivityC55410 = abstractActivityC5549;
                        str3 = str2;
                        break;
                    case -314488993:
                    case 1697129181:
                        i8 = i8;
                        short s = sArr[c];
                        i5 = s * 5264;
                        i6 = s * s;
                        if (C0912.m55833()) {
                            iM55680 = (i10 - C0873.m55680("᩸᩻")) * (-19);
                            i = ((iM55680 ^ i9) * 3103) ^ (-1593703227);
                            i2 = 2040891524;
                        } else {
                            iM55680 = (C0873.m55680("ۚۚ") + i9) * 119;
                            i = ((iM55680 ^ i10) * 21925) ^ (-786965922);
                            i2 = 782861528;
                        }
                        i13 = iM55680 ^ i2;
                        i11 = i;
                        i8 = i8;
                        abstractActivityC55410 = abstractActivityC5549;
                        str3 = str2;
                        break;
                    case -273778820:
                    case 816916855:
                        if (C0937.m55918() < 0) {
                        }
                        i8 = i8;
                        iM55680 = C0873.m55680("ۖۖ") ^ i10;
                        i = ((iM55680 ^ i9) * 19459) ^ (-334567850);
                        i2 = 2087883547;
                        i13 = iM55680 ^ i2;
                        i11 = i;
                        i8 = i8;
                        abstractActivityC55410 = abstractActivityC5549;
                        str3 = str2;
                        break;
                    case -37847246:
                    case 2088696959:
                        ServiceConnectionC1013.m56163(abstractActivityC55410, intent);
                        break;
                    case 317742868:
                    case 1696491185:
                        i8 = i8;
                        intent = new Intent(abstractActivityC55410, (Class<?>) ActivityC14326.class);
                        sArr2 = f82177;
                        if (C1124.m56367() >= 0) {
                            iM55680 = C0873.m55680("ۨۖ") ^ i9;
                            i = ((iM55680 ^ i10) * 11945) ^ 1947803526;
                            i2 = 875612698;
                            i13 = iM55680 ^ i2;
                            i11 = i;
                            i8 = i8;
                            abstractActivityC55410 = abstractActivityC5549;
                        } else {
                            int iM55683 = (C0873.m55680("ܰۗ") ^ i9) * C0254q.f1218h;
                            i11 = ((iM55683 ^ i10) * 11793) ^ (-110739743);
                            i13 = iM55683 ^ 1031618400;
                            i8 = i8;
                        }
                        str3 = str2;
                        break;
                    case 504105889:
                    case 814169375:
                        i8 = i8;
                        C5178.m11082(RunnableC1014.m56165(abstractActivityC5549), drawable, strM56293);
                        if (C1024.f81946) {
                            iM55680 = (i10 - C0873.m55680("᩸᩻")) * (-19);
                            i = ((iM55680 ^ i9) * 3103) ^ (-1593703227);
                            i2 = 2040891524;
                            i13 = iM55680 ^ i2;
                            i11 = i;
                        } else {
                            int iM55684 = C0873.m55680("۟ۤ") ^ i10;
                            i11 = ((iM55684 ^ i9) * 8989) ^ (-1286441464);
                            i13 = iM55684 ^ 826087779;
                        }
                        i8 = i8;
                        abstractActivityC55410 = abstractActivityC5549;
                        str3 = str2;
                        break;
                    case 676457964:
                    case 1769464166:
                        C1071.m56343();
                        C1929.m56553();
                        break;
                    case 921520629:
                    case 2053953749:
                        i3 = i8;
                        C0917.m55843(intent, RunnableC0897.m55783(f82177, 30, 17, i7), str3);
                        iM55681 = C0873.m55680("ۚۘ") ^ i10;
                        i11 = ((iM55681 ^ i9) * (-19933)) ^ 1967395603;
                        i4 = 677217142;
                        i13 = iM55681 ^ i4;
                        i8 = i3;
                        break;
                    default:
                        if (C1017.f81942 < 0) {
                            i8 = i8;
                            iM55680 = (i10 - C0873.m55680("᩸᩻")) * (-19);
                            i = ((iM55680 ^ i9) * 3103) ^ (-1593703227);
                            i2 = 2040891524;
                            i13 = iM55680 ^ i2;
                            i11 = i;
                            i8 = i8;
                            abstractActivityC55410 = abstractActivityC5549;
                            str3 = str2;
                        }
                        break;
                }
                return;
            }
            iM55979 = C0946.m55979("ܿܳ") ^ i10;
            i11 = ((iM55979 ^ i9) * 11387) ^ 1841094542;
            i12 = -1268602800;
        }
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC3069, android.app.Activity
    public final void onResume() {
        TextView textView = null;
        int i = 0;
        int i2 = 1078578236;
        int i3 = C1964.f83032;
        int i4 = C0873.f81841;
        int iM55680 = C0873.m55680("ۖܿ") ^ i3;
        int i5 = ((iM55680 ^ i4) * 10389) ^ 2135793769;
        int i6 = 694601724;
        while (true) {
            int i7 = iM55680 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i4) * 1409) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1548600366:
                    case -960495358:
                        C1124.m56367();
                        iM55680 = (i4 - C0873.m55680("ۜۨ")) * (-75);
                        i5 = ((iM55680 ^ i3) * 14221) ^ (-1510537913);
                        i6 = 2079054853;
                    case -1466240733:
                    case 478485046:
                        super.onResume();
                        if (C0949.f81897 < 0) {
                            iM55680 = C0946.m55979("ۨ᩺") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-5779)) ^ (-1551450028);
                            i6 = -1410492349;
                        } else {
                            iM55680 = (i4 - C0873.m55680("ۜۨ")) * (-75);
                            i5 = ((iM55680 ^ i3) * 14221) ^ (-1510537913);
                            i6 = 2079054853;
                        }
                        break;
                    case -1437777756:
                    case 30103663:
                        if (this.f40964.getVisibility() != i) {
                            iM55680 = (C0946.m55979("ۢ۫") ^ i4) * (-35);
                            i5 = ((iM55680 ^ i3) * (-14455)) ^ (-848949696);
                            i6 = -532493049;
                        } else {
                            iM55680 = (C0946.m55979("ܽۜ") ^ i3) * 89;
                            i5 = ((iM55680 ^ i4) * 26905) ^ 148985935;
                            i6 = 2062015810;
                        }
                        break;
                    case -1267903862:
                    case -294810551:
                        if (C0854.f81826 != 0) {
                            iM55680 = C0873.m55680("ܺۤ") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-1167)) ^ (-1008390515);
                            i6 = 768898783;
                        } else {
                            iM55680 = C0873.m55680("ܶ֨") ^ i4;
                            i5 = ((iM55680 ^ i3) * 21559) ^ (-1756810991);
                            i6 = 649228696;
                        }
                        break;
                    case -1142994719:
                    case 604543624:
                        if (!C0927.f81875) {
                            iM55680 = C0873.m55680("ۖۧ") ^ i3;
                            i5 = ((iM55680 ^ i4) * 23265) ^ 879693903;
                            i6 = 946231394;
                        } else {
                            iM55680 = (i4 - C0873.m55680("ۜۨ")) * (-75);
                            i5 = ((iM55680 ^ i3) * 14221) ^ (-1510537913);
                            i6 = 2079054853;
                        }
                        break;
                    case -1111061336:
                    case -245528681:
                        if (C1964.m56597() == 0) {
                            iM55680 = (i3 - C0946.m55979("᩵᩺")) * (-23);
                            i5 = ((iM55680 ^ i4) * (-6463)) ^ 1146968324;
                            i6 = 425772658;
                        } else {
                            iM55680 = C0873.m55680("ۖۖ") ^ i3;
                            i5 = ((iM55680 ^ i4) * (-19893)) ^ 650474055;
                            i6 = -1773017103;
                        }
                        break;
                    case -1045296500:
                    case 2080537580:
                        C0912.m55833();
                        if (C0912.f81867 <= 0) {
                            iM55680 = C0873.m55680("ۖۖ") ^ i3;
                            i5 = ((iM55680 ^ i4) * (-19893)) ^ 650474055;
                            i6 = -1773017103;
                            break;
                        }
                        iM55680 = (i4 - C0873.m55680("ۜۨ")) * (-75);
                        i5 = ((iM55680 ^ i3) * 14221) ^ (-1510537913);
                        i6 = 2079054853;
                        break;
                    case -958506946:
                    case 297937371:
                        m32912();
                        iM55680 = (C0946.m55979("ۢ۫") ^ i4) * (-35);
                        i5 = ((iM55680 ^ i3) * (-14455)) ^ (-848949696);
                        i6 = -532493049;
                        break;
                    case -948199482:
                    case -220549478:
                        if (!C0882.f81846) {
                            iM55680 = C0873.m55680("ᩳۖ") ^ i4;
                            i5 = ((iM55680 ^ i3) * 19239) ^ 1849272770;
                            i6 = 1625155909;
                        } else {
                            iM55680 = (i3 - C0873.m55680("֡ᩴ")) * (-11);
                            i5 = ((iM55680 ^ i4) * (-7877)) ^ (-359411855);
                            i6 = 1093327609;
                        }
                        break;
                    case -549715173:
                    case 689707645:
                        if (!C0937.f81884) {
                            iM55680 = C0873.m55680("ۖۖ") ^ i3;
                            i5 = ((iM55680 ^ i4) * (-19893)) ^ 650474055;
                            i6 = -1773017103;
                            break;
                        }
                        iM55680 = C0873.m55680("ۛ᩹") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-15975)) ^ 745615679;
                        i6 = -952547705;
                        break;
                    case -148999350:
                    case 917359796:
                        if (textView.getVisibility() != 8) {
                            i = 8;
                            iM55680 = (C0946.m55979("ۢ۫") ^ i4) * (-35);
                            i5 = ((iM55680 ^ i3) * (-14455)) ^ (-848949696);
                            i6 = -532493049;
                        }
                        int iM55681 = C0873.m55680("ܳܽ") ^ i3;
                        i5 = ((iM55681 ^ i4) * 12441) ^ (-1340253572);
                        i7 = iM55681 ^ 875084006;
                        i = 8;
                        break;
                        break;
                    case -144145528:
                    case 980303040:
                        if (C1194.f82045 == 0) {
                            iM55680 = (i3 - C0946.m55979("ᩴ۟")) * (-103);
                            i5 = ((iM55680 ^ i4) * 5571) ^ (-1339905240);
                            i6 = 824811777;
                        } else {
                            iM55680 = C0873.m55680("ܶ֨") ^ i4;
                            i5 = ((iM55680 ^ i3) * 21559) ^ (-1756810991);
                            i6 = 649228696;
                        }
                        break;
                    case 204034283:
                    case 1675447865:
                        if (C1194.f82045 == 0) {
                            iM55680 = (C0946.m55979("᩺۠") + i4) * 109;
                            i5 = ((iM55680 ^ i3) * 30277) ^ (-434870606);
                            i6 = -1161896716;
                        } else {
                            iM55680 = (i4 - C0873.m55680("ۜۨ")) * (-75);
                            i5 = ((iM55680 ^ i3) * 14221) ^ (-1510537913);
                            i6 = 2079054853;
                        }
                        break;
                    case 226853968:
                    case 568169707:
                        if (!C0861.f81831) {
                            iM55680 = C0873.m55680("ܺۤ") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-1167)) ^ (-1008390515);
                            i6 = 768898783;
                            break;
                        }
                        iM55680 = C0946.m55979("᩵ۧ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 22187) ^ (-1821691582);
                        i6 = -1197759360;
                        break;
                    case 311264816:
                    case 830911516:
                        if (!C1048.f81963) {
                            iM55680 = C0873.m55680("ܶ֨") ^ i4;
                            i5 = ((iM55680 ^ i3) * 21559) ^ (-1756810991);
                            i6 = 649228696;
                            break;
                        }
                        iM55680 = C0946.m55979("۠ۙ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 20899) ^ (-1027066382);
                        i6 = -2054408284;
                        break;
                    case 360834183:
                    case 1451807661:
                        C0949.m56012();
                        C0949.m56012();
                        break;
                    case 819750689:
                    case 2003074931:
                        C0949.m56012();
                        if (!RunnableC1014.m56177()) {
                            iM55680 = C0873.m55680("ۖۖ") ^ i3;
                            i5 = ((iM55680 ^ i4) * (-19893)) ^ 650474055;
                            i6 = -1773017103;
                            break;
                        }
                        iM55680 = C0873.m55680("ܶ֨") ^ i4;
                        i5 = ((iM55680 ^ i3) * 21559) ^ (-1756810991);
                        i6 = 649228696;
                        break;
                    case 1646808356:
                    case 2041301492:
                        break;
                    default:
                        textView = this.f40963;
                        if (!C0947.f81895) {
                            iM55680 = C0873.m55680("᩵ۤ") ^ i3;
                            i5 = ((iM55680 ^ i4) * (-15631)) ^ (-106784268);
                            i6 = 55439704;
                        } else {
                            iM55680 = (i3 - C0873.m55680("֡ᩴ")) * (-11);
                            i5 = ((iM55680 ^ i4) * (-7877)) ^ (-359411855);
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
    
        if (p067l.C0917.m55854() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x006f, code lost:
    
        if (p067l.C1124.f82007 < 0) goto L27;
     */
    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        int iM55979;
        int i;
        int i2;
        View view;
        int iM55680;
        int i3;
        int iM55681;
        int i4;
        int i5;
        int i6;
        short[] sArr;
        int iM559710;
        int i7;
        int i8;
        int iM55682;
        int i9;
        int i10;
        Drawable drawable;
        int i11 = C1964.f83032;
        int i12 = C0967.f81910;
        int iM55683 = (i12 - C0873.m55680("ۜۖ")) * (-29);
        int i13 = ((iM55683 ^ i11) * 18265) ^ (-1759167327);
        Window windowM56391 = null;
        View decorView = null;
        View viewFindViewById = null;
        Drawable drawable2 = null;
        short[] sArr2 = null;
        int i14 = iM55683 ^ (-1006960391);
        boolean z = false;
        int i15 = 0;
        boolean z2 = false;
        int i16 = 0;
        int i17 = 0;
        int iM559711 = 0;
        int i18 = 0;
        int iM559712 = 0;
        int i19 = 0;
        int iM559713 = 0;
        int i20 = 0;
        int i21 = -6993878;
        View viewM56321 = null;
        Button button = null;
        String str = null;
        Uri data = null;
        Intent intentM55991 = null;
        while (true) {
            i21 = i14 ^ (i13 & (((i21 ^ i11) * (-31241)) >> 31));
            switch (i21) {
                case -2135102285:
                case 433603965:
                    drawable2 = drawable2;
                    viewFindViewById = viewFindViewById;
                    windowM56391 = C1194.m56391(this);
                    i20 = i20;
                    if (i20 >= 28) {
                        int iM55684 = (C0873.m55680("᩵ۖ") + i12) * (-113);
                        viewFindViewById = viewFindViewById;
                        i20 = i20;
                        drawable2 = drawable2;
                        i14 = iM55684 ^ (-1237256043);
                        i13 = ((iM55684 ^ i11) * 8613) ^ (-1459781975);
                        z = true;
                    } else {
                        z = true;
                        int iM55685 = (i12 - C0873.m55680("ܳۖ")) * 59;
                        sArr2 = sArr2;
                        i4 = ((iM55685 ^ i11) * 7755) ^ (-1158982631);
                        i6 = iM55685 ^ 1646183219;
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
                    this.f13392 = (C1326) C0890.m55736(this, iM559713 ^ i17);
                    this.f40970 = (ViewGroup) C1053.m56321(this, C0946.m55979(C0861.m55618(f82177, 77, 3, i16)) ^ 2121345395);
                    C0955.m56037(this, this.f13392);
                    i20 = Build.VERSION.SDK_INT;
                    if (i20 >= 23) {
                        iM559710 = C0946.m55979("ۙۖ") ^ i12;
                        i7 = ((iM559710 ^ i11) * 12313) ^ 519862011;
                        i8 = 1078523812;
                    } else {
                        iM559710 = C0946.m55979("᩹᩷") ^ i11;
                        i7 = ((iM559710 ^ i12) * (-6951)) ^ 1351075215;
                        i8 = 741870720;
                    }
                    int i22 = iM559710 ^ i8;
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
                    C1717.m43556(view, new InterfaceC1666() { // from class: l.۠ᩳ᩷
                        @Override // p067l.InterfaceC1666
                        public final C1914 onApplyWindowInsets(View view2, C1914 c1914) {
                            int i23 = 279308333;
                            int i24 = C0873.f81841;
                            int i25 = C0866.f81837;
                            int iM55686 = (C0873.m55680("ܽܿ") + i25) * 29;
                            int i26 = ((iM55686 ^ i24) * 19033) ^ 202718000;
                            int i27 = 219231944;
                            while (true) {
                                i23 = ((((i23 ^ i24) * 11709) >> 31) & i26) ^ (iM55686 ^ i27);
                                switch (i23) {
                                    case -2140429672:
                                    case -1771498666:
                                        ActivityC14326.m32902(this.f28487, view2, c1914);
                                        return c1914;
                                    case -1486724872:
                                    case -670927684:
                                        if (C1053.f81965 <= 0) {
                                            iM55686 = (i24 - C0946.m55979("۫ܿ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                            i26 = ((iM55686 ^ i25) * 9521) ^ (-165255227);
                                            i27 = 1963009391;
                                        } else {
                                            iM55686 = (C0873.m55680("ۨۚ") ^ i25) * 87;
                                            i26 = ((iM55686 ^ i24) * 18181) ^ 300147733;
                                            i27 = 2062033484;
                                        }
                                        break;
                                    case -1342433877:
                                    case 944968603:
                                        if (C1017.f81942 >= 0) {
                                            iM55686 = (i25 - C0946.m55979("ۛ᩺")) * (-89);
                                            i26 = ((iM55686 ^ i24) * 27317) ^ (-1832572822);
                                            i27 = 385741906;
                                        } else {
                                            iM55686 = (C0873.m55680("ܺܰ") + i24) * (-41);
                                            i26 = ((iM55686 ^ i25) * (-30503)) ^ (-841633664);
                                            i27 = 134340018;
                                        }
                                        break;
                                    case -1335597869:
                                    case 48918724:
                                        if (RunnableC0871.f81839 >= 0) {
                                            iM55686 = (i25 - C0946.m55979("ۛ᩺")) * (-89);
                                            i26 = ((iM55686 ^ i24) * 27317) ^ (-1832572822);
                                            i27 = 385741906;
                                        } else {
                                            iM55686 = (i24 - C0946.m55979("ܿۗ")) * (-117);
                                            i26 = ((iM55686 ^ i25) * 7603) ^ 39737046;
                                            i27 = -509878486;
                                        }
                                        break;
                                    case -1163976992:
                                    case 2137216856:
                                        C0949.m56012();
                                        if (C0946.m55980() == 0) {
                                            iM55686 = (C0946.m55979("ۢۖ") + i25) * 81;
                                            i26 = ((iM55686 ^ i24) * (-12501)) ^ 1965766182;
                                            i27 = -2412197;
                                        } else {
                                            iM55686 = (i25 - C0946.m55979("ۛ᩺")) * (-89);
                                            i26 = ((iM55686 ^ i24) * 27317) ^ (-1832572822);
                                            i27 = 385741906;
                                        }
                                        break;
                                    case -1005605726:
                                    case 700945766:
                                        if (C0894.f81854 >= 0) {
                                            iM55686 = (i25 - C0946.m55979("ۛ᩺")) * (-89);
                                            i26 = ((iM55686 ^ i24) * 27317) ^ (-1832572822);
                                            i27 = 385741906;
                                        } else {
                                            iM55686 = C0946.m55979("۟֨") ^ i25;
                                            i26 = ((iM55686 ^ i24) * (-11221)) ^ (-2107476167);
                                            i27 = 107663545;
                                        }
                                        break;
                                    case -943934563:
                                    case 1813492208:
                                        if (C0890.m55740()) {
                                            iM55686 = (C0946.m55979("۬ۡ") + i25) * 3;
                                            i26 = ((iM55686 ^ i24) * (-28155)) ^ 1402245538;
                                            i27 = 1164898004;
                                        } else {
                                            iM55686 = (i25 - C0946.m55979("ۛ᩺")) * (-89);
                                            i26 = ((iM55686 ^ i24) * 27317) ^ (-1832572822);
                                            i27 = 385741906;
                                        }
                                        break;
                                    case -649503725:
                                    case 1102975886:
                                        if (RunnableC0871.f81839 >= 0) {
                                            iM55686 = (C0946.m55979("ۢۖ") + i25) * 81;
                                            i26 = ((iM55686 ^ i24) * (-12501)) ^ 1965766182;
                                            i27 = -2412197;
                                        } else {
                                            iM55686 = C0946.m55979("᩸᩸") ^ i24;
                                            i26 = ((iM55686 ^ i25) * 7933) ^ (-135201959);
                                            i27 = 879393158;
                                        }
                                        break;
                                    case -503441948:
                                    case 500951115:
                                        C0989.m56095();
                                        iM55686 = (i25 - C0946.m55979("ۛ᩺")) * (-89);
                                        i26 = ((iM55686 ^ i24) * 27317) ^ (-1832572822);
                                        i27 = 385741906;
                                        break;
                                    case 468933777:
                                    case 1705562684:
                                        C1025.m56230();
                                        if (C0845.m55584() <= 0) {
                                            iM55686 = (i24 - C0946.m55979("۫ܿ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                            i26 = ((iM55686 ^ i25) * 9521) ^ (-165255227);
                                            i27 = 1963009391;
                                        } else {
                                            iM55686 = C0873.m55680("֫᩹") ^ i24;
                                            i26 = ((iM55686 ^ i25) * (-28965)) ^ 1738271526;
                                            i27 = 1198247203;
                                        }
                                        break;
                                    case 932741657:
                                    case 1904573334:
                                        if (C0845.m55584() <= 0) {
                                            iM55686 = (i25 - C0946.m55979("ۛ᩺")) * (-89);
                                            i26 = ((iM55686 ^ i24) * 27317) ^ (-1832572822);
                                            i27 = 385741906;
                                        } else {
                                            iM55686 = (i25 - C0946.m55979("᩸֡")) * (-5);
                                            i26 = ((iM55686 ^ i24) * (-953)) ^ 1689032862;
                                            i27 = 41751217;
                                        }
                                        break;
                                    case 1009670550:
                                    case 1242287481:
                                        if (C0989.f81920 >= 0) {
                                            iM55686 = C0873.m55680("֫᩹") ^ i24;
                                            i26 = ((iM55686 ^ i25) * (-28965)) ^ 1738271526;
                                            i27 = 1198247203;
                                        } else {
                                            iM55686 = C0946.m55979("ᩴۨ") ^ i24;
                                            i26 = ((iM55686 ^ i25) * (-22385)) ^ 62688795;
                                            i27 = 1936998612;
                                        }
                                        break;
                                    case 1406561670:
                                    case 2079841230:
                                        C0917.m55854();
                                        C1003.m56123();
                                        return null;
                                    case 1681283752:
                                    case 1859770816:
                                        if (C0866.f81837 >= 0) {
                                            iM55686 = (i25 - C0946.m55979("ۛ᩺")) * (-89);
                                            i26 = ((iM55686 ^ i24) * 27317) ^ (-1832572822);
                                            i27 = 385741906;
                                        } else {
                                            iM55686 = (C0946.m55979("ۚܳ") + i25) * (-39);
                                            i26 = ((iM55686 ^ i24) * (-5485)) ^ (-1838247911);
                                            i27 = 60162552;
                                        }
                                        break;
                                    case 1791283833:
                                    case 1924588573:
                                        if (C1964.f83032 > 0) {
                                            iM55686 = C0873.m55680("֫᩹") ^ i24;
                                            i26 = ((iM55686 ^ i25) * (-28965)) ^ 1738271526;
                                            i27 = 1198247203;
                                        } else {
                                            iM55686 = (i25 - C0946.m55979("ۛ᩺")) * (-89);
                                            i26 = ((iM55686 ^ i24) * 27317) ^ (-1832572822);
                                            i27 = 385741906;
                                        }
                                        break;
                                    default:
                                        if (C1024.f81946) {
                                            iM55686 = (C0946.m55979("ۤۛ") ^ i24) * 115;
                                            i26 = ((iM55686 ^ i25) * (-6455)) ^ (-1497630536);
                                            i27 = -1035622309;
                                        } else {
                                            iM55686 = (C0946.m55979("۠۟") ^ i24) * (-93);
                                            i26 = ((iM55686 ^ i25) * 25045) ^ 1058612646;
                                            i27 = -1919452589;
                                        }
                                        break;
                                }
                            }
                        }
                    });
                    C0866.m55649(this);
                    RunnableC1014.m56172(this.f13392, new View.OnClickListener() { // from class: l.ܶᩳ᩷
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i23 = 1151678541;
                            int i24 = C1036.f81953;
                            int i25 = C1003.f81929;
                            int iM55686 = (C0873.m55680("ۡ۫") + i24) * (-91);
                            int i26 = ((iM55686 ^ i25) * (-22121)) ^ 136405715;
                            int i27 = -1401672648;
                            while (true) {
                                i23 = ((((i23 ^ i25) * (-20607)) >> 31) & i26) ^ (iM55686 ^ i27);
                                switch (i23) {
                                    case -2142213595:
                                    case 1082597283:
                                        if (C0877.f81843 >= 0) {
                                            iM55686 = C0873.m55680("ۛܿ") ^ i25;
                                            i26 = ((iM55686 ^ i24) * (-7517)) ^ 1977498220;
                                            i27 = 887264057;
                                        } else {
                                            iM55686 = C0946.m55979("֡ۗ") ^ i25;
                                            i26 = ((iM55686 ^ i24) * (-22207)) ^ 884013357;
                                            i27 = -338421553;
                                        }
                                        break;
                                    case -2133556184:
                                    case 1404090401:
                                        if (RunnableC0897.f81856) {
                                            iM55686 = (C0946.m55979("֡ܰ") + i24) * 59;
                                            i26 = ((iM55686 ^ i25) * (-11641)) ^ 1263386523;
                                            i27 = 786813518;
                                        } else {
                                            iM55686 = (C0946.m55979("ᩳۛ") + i24) * 31;
                                            i26 = ((iM55686 ^ i25) * 31595) ^ (-1194498022);
                                            i27 = -435303278;
                                        }
                                        break;
                                    case -1996581708:
                                    case 1031821520:
                                        int i28 = ActivityC14326.f40954;
                                        if (C1036.f81953 >= 0) {
                                            iM55686 = (C0946.m55979("ۢۗ") ^ i24) * 65;
                                            i26 = ((iM55686 ^ i25) * (-28201)) ^ (-244728913);
                                            i27 = -1826722289;
                                        } else {
                                            iM55686 = C0946.m55979("۟᩵") ^ i25;
                                            i26 = ((iM55686 ^ i24) * 10725) ^ 666760737;
                                            i27 = -2026181909;
                                        }
                                        break;
                                    case -1792385187:
                                    case -172744588:
                                        if (C0937.f81884) {
                                            iM55686 = C0946.m55979("ܳۗ") ^ i25;
                                            i26 = ((iM55686 ^ i24) * (-2951)) ^ 2122864952;
                                            i27 = 1908999757;
                                        } else {
                                            iM55686 = (C0946.m55979("ۢۗ") ^ i24) * 65;
                                            i26 = ((iM55686 ^ i25) * (-28201)) ^ (-244728913);
                                            i27 = -1826722289;
                                        }
                                        break;
                                    case -1613879970:
                                    case 1960912837:
                                        if (!C1024.f81946) {
                                            iM55686 = (C0946.m55979("ᩳۛ") + i24) * 31;
                                            i26 = ((iM55686 ^ i25) * 31595) ^ (-1194498022);
                                            i27 = -435303278;
                                        } else {
                                            iM55686 = (C0946.m55979("᩶᩻") ^ i25) * 43;
                                            i26 = ((iM55686 ^ i24) * (-27131)) ^ (-862897654);
                                            i27 = -639477506;
                                        }
                                        break;
                                    case -1522311691:
                                    case 494938627:
                                        C0955.m56027(this.f50287);
                                        break;
                                    case -1518332379:
                                    case 409367650:
                                        if (C0866.f81837 >= 0) {
                                            iM55686 = (C0946.m55979("ᩳۛ") + i24) * 31;
                                            i26 = ((iM55686 ^ i25) * 31595) ^ (-1194498022);
                                            i27 = -435303278;
                                        } else {
                                            iM55686 = C0946.m55979("᩻ۡ") ^ i25;
                                            i26 = ((iM55686 ^ i24) * 21269) ^ (-601196132);
                                            i27 = 600753065;
                                        }
                                        break;
                                    case -1386417097:
                                    case -911346191:
                                        if (C0863.f81833 <= 0) {
                                            iM55686 = (C0946.m55979("ۢۗ") ^ i24) * 65;
                                            i26 = ((iM55686 ^ i25) * (-28201)) ^ (-244728913);
                                            i27 = -1826722289;
                                        } else {
                                            iM55686 = C0873.m55680("ܺۗ") ^ i24;
                                            i26 = ((iM55686 ^ i25) * (-14421)) ^ 883442523;
                                            i27 = -124808794;
                                        }
                                        break;
                                    case -846446379:
                                    case 510415214:
                                        if (C0930.m55885() <= 0) {
                                            iM55686 = (C0946.m55979("᩶᩻") ^ i25) * 43;
                                            i26 = ((iM55686 ^ i24) * (-27131)) ^ (-862897654);
                                            i27 = -639477506;
                                        } else {
                                            iM55686 = (C0873.m55680("֡ܶ") ^ i24) * 5;
                                            i26 = ((iM55686 ^ i25) * 22531) ^ (-2135125519);
                                            i27 = 2009449044;
                                        }
                                        break;
                                    case -731908046:
                                    case 334001745:
                                        C1028.m56247();
                                        C1003.m56123();
                                        break;
                                    case 28614663:
                                    case 263225548:
                                        if (C0912.m55833()) {
                                            iM55686 = C0946.m55979("᩺֡") ^ i24;
                                            i26 = ((iM55686 ^ i25) * (-10287)) ^ 504851873;
                                            i27 = 2033072428;
                                        } else {
                                            iM55686 = C0946.m55979("᩻ۘ") ^ i24;
                                            i26 = ((iM55686 ^ i25) * 23475) ^ (-833552242);
                                            i27 = -1298748320;
                                        }
                                        break;
                                    case 217902127:
                                    case 1470778872:
                                        if (C1012.m56134() > 0) {
                                            iM55686 = C0946.m55979("᩺֡") ^ i24;
                                            i26 = ((iM55686 ^ i25) * (-10287)) ^ 504851873;
                                            i27 = 2033072428;
                                        } else {
                                            iM55686 = (C0946.m55979("᩶᩻") ^ i25) * 43;
                                            i26 = ((iM55686 ^ i24) * (-27131)) ^ (-862897654);
                                            i27 = -639477506;
                                        }
                                        break;
                                    case 325294065:
                                    case 916153465:
                                        if (C1229.f82066 < 0) {
                                            iM55686 = C0873.m55680("ۛܿ") ^ i25;
                                            i26 = ((iM55686 ^ i24) * (-7517)) ^ 1977498220;
                                            i27 = 887264057;
                                        } else {
                                            iM55686 = (C0946.m55979("ᩳۛ") + i24) * 31;
                                            i26 = ((iM55686 ^ i25) * 31595) ^ (-1194498022);
                                            i27 = -435303278;
                                        }
                                        break;
                                    case 379261077:
                                    case 1817115698:
                                        C0949.m56012();
                                        C1036.m56257();
                                        iM55686 = (C0946.m55979("ᩳۛ") + i24) * 31;
                                        i26 = ((iM55686 ^ i25) * 31595) ^ (-1194498022);
                                        i27 = -435303278;
                                        break;
                                    case 1417064904:
                                    case 1758508038:
                                        if (C1036.f81953 >= 0) {
                                            iM55686 = C0873.m55680("ۛܿ") ^ i25;
                                            i26 = ((iM55686 ^ i24) * (-7517)) ^ 1977498220;
                                            i27 = 887264057;
                                        } else {
                                            iM55686 = (C0946.m55979("ۙ֫") + i25) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i26 = ((iM55686 ^ i24) * (-17925)) ^ (-407775888);
                                            i27 = -1282038222;
                                        }
                                        break;
                                    default:
                                        if (C0917.f81868) {
                                            iM55686 = (C0946.m55979("ۢۗ") ^ i24) * 65;
                                            i26 = ((iM55686 ^ i25) * (-28201)) ^ (-244728913);
                                            i27 = -1826722289;
                                        } else {
                                            iM55686 = C0873.m55680("᩵ۛ") ^ i24;
                                            i26 = ((iM55686 ^ i25) * 9441) ^ (-318402177);
                                            i27 = -614447677;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    intentM55991 = C0947.m55991(this);
                    data = intentM55991.getData();
                    if (data != null) {
                        iM55682 = (C0946.m55979("᩵ۜ") + i11) * 83;
                        i9 = ((iM55682 ^ i12) * 14729) ^ 1534728461;
                        i10 = 1579886877;
                    } else {
                        iM55682 = C0946.m55979("ۙᩴ") ^ i12;
                        i9 = ((iM55682 ^ i11) * (-24993)) ^ 535399859;
                        i10 = -1586634043;
                    }
                    int i23 = iM55682 ^ i10;
                    viewFindViewById = view;
                    drawable = drawable2;
                    i14 = i23;
                    i13 = i9;
                    drawable2 = drawable;
                    break;
                case -1824769024:
                case -820053698:
                    RunnableC0871.m55672();
                    C0927.m55873();
                    break;
                case -1726256729:
                case 810966587:
                    drawable2 = drawable2;
                    this.f40968 = (TextView) C0890.m55736(this, C0946.m55979(C0898.m55792(sArr2, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 3, i16)) ^ 2099052601);
                    if (C1404.f82149 >= 0) {
                        iM55979 = (i12 - C0873.m55680("᩵ۧ")) * (-109);
                        i = ((iM55979 ^ i11) * (-11999)) ^ 237718939;
                        i2 = 1671133876;
                    } else {
                        iM55979 = (C0873.m55680("۬۬") + i11) * 85;
                        i = ((iM55979 ^ i12) * 14873) ^ (-1320600260);
                        i2 = 910442989;
                    }
                    int i24 = iM55979 ^ i2;
                    drawable2 = drawable2;
                    i14 = i24;
                    i13 = i;
                    break;
                case -1683275623:
                case 1289481112:
                    drawable2 = drawable2;
                    z2 = false;
                    C1087.m16291(windowM56391, false);
                    windowM56391.setStatusBarColor(0);
                    viewFindViewById = findViewById(C0946.m55979(C0949.m56016(f82177, 80, 3, i16)) ^ 2097395504);
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = (i12 - C0873.m55680("᩵ۧ")) * (-109);
                        i = ((iM55979 ^ i11) * (-11999)) ^ 237718939;
                        i2 = 1671133876;
                    } else {
                        iM55979 = (i11 - C0946.m55979("ۘۡ")) * (-37);
                        i = ((iM55979 ^ i12) * 18827) ^ 2073414849;
                        i2 = -1085700034;
                    }
                    int i25 = iM55979 ^ i2;
                    drawable2 = drawable2;
                    i14 = i25;
                    i13 = i;
                    break;
                case -1598349929:
                case 636774073:
                    C1036.m56257();
                    if (C0845.f81821 < 0) {
                        drawable2 = drawable2;
                        i20 = i20;
                        viewFindViewById = viewFindViewById;
                        sArr2 = sArr2;
                        windowM56391 = windowM56391;
                        iM55681 = C0873.m55680("᩷֫") ^ i12;
                        i4 = ((iM55681 ^ i11) * 11115) ^ 433622753;
                        i5 = -179355775;
                        i6 = iM55681 ^ i5;
                        windowM56391 = windowM56391;
                        viewFindViewById = viewFindViewById;
                        drawable = drawable2;
                        i14 = i6;
                        i13 = i4;
                        sArr2 = sArr2;
                        i20 = i20;
                        drawable2 = drawable;
                    } else {
                        iM55680 = (C0873.m55680("۫᩹") + i11) * (-39);
                        i = ((iM55680 ^ i12) * 6519) ^ 1565667314;
                        i3 = 114767066;
                        i14 = iM55680 ^ i3;
                        i13 = i;
                    }
                    break;
                case -1509760839:
                case 858433851:
                    RunnableC0897.m55775(this);
                    break;
                case -1347531348:
                case 1068333451:
                    drawable2 = drawable2;
                    this.f40965 = (TextView) C1053.m56321(this, iM559711 ^ i18);
                    this.f40962 = (TextView) C0890.m55736(this, C0873.m55680(RunnableC0897.m55783(f82177, 133, 3, i16)) ^ 2127576031);
                    this.f40968.setTextIsSelectable(z);
                    this.f40967.setTextIsSelectable(z);
                    this.f40966.setTextIsSelectable(z);
                    if (C0854.f81826 != 0) {
                        iM55979 = (C0946.m55979("ᩳ᩺") + i11) * 75;
                        i = ((iM55979 ^ i12) * (-13151)) ^ 329919628;
                        i2 = -766419297;
                    } else {
                        iM55979 = C0873.m55680("᩺᩺") ^ i11;
                        i = ((iM55979 ^ i12) * C0719o.a.f2910p) ^ 1301643749;
                        i2 = -495724786;
                    }
                    int i26 = iM55979 ^ i2;
                    drawable2 = drawable2;
                    i14 = i26;
                    i13 = i;
                    break;
                case -1334135983:
                case 849160607:
                    this.f40958 = data.getHost();
                    this.f40955 = z;
                    iM55979 = (i11 - C0873.m55680("ܿᩳ")) * (-43);
                    i = ((iM55979 ^ i12) * (-14609)) ^ 316296200;
                    i2 = -631481992;
                    int i27 = iM55979 ^ i2;
                    drawable2 = drawable2;
                    i14 = i27;
                    i13 = i;
                    break;
                case -1198545686:
                case 693394755:
                    drawable2 = drawable2;
                    str = this.f40958;
                    if (str != null) {
                        iM55979 = C0946.m55979("֡᩺") ^ i12;
                        i = ((iM55979 ^ i11) * (-12857)) ^ 377969505;
                        i2 = -1224606218;
                    } else {
                        iM55979 = (C0873.m55680("ܰ᩸") + i11) * 11;
                        i = ((iM55979 ^ i12) * 19341) ^ 518723627;
                        i2 = 1676060898;
                    }
                    int i28 = iM55979 ^ i2;
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
                    windowM56391 = windowM56391;
                    short s = f82177[70];
                    int i29 = s + 1;
                    if (((s * 2) + 1) - (i29 * i29) > 0) {
                        iM55681 = C0873.m55680("᩷ۛ") ^ i12;
                        i4 = ((iM55681 ^ i11) * (-563)) ^ 1742514254;
                        i5 = -1937526696;
                    } else {
                        iM55681 = C0873.m55680("۟᩵") ^ i11;
                        i4 = ((iM55681 ^ i12) * (-21415)) ^ (-963455580);
                        i5 = 1271021224;
                    }
                    i6 = iM55681 ^ i5;
                    windowM56391 = windowM56391;
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
                    m12250();
                    windowM56391 = windowM56391;
                    C1053.m56321(this, C0873.m55680(C0898.m55792(f82177, 71, 3, i16)) ^ 2130340118);
                    setTitle((CharSequence) null);
                    iM559713 = C0946.m55979(RunnableC0938.m55936(f82177, 74, 3, i16));
                    i17 = 2097535453;
                    if (C0989.f81920 >= 0) {
                        iM55681 = C0873.m55680("᩷֫") ^ i12;
                        i4 = ((iM55681 ^ i11) * 11115) ^ 433622753;
                        i5 = -179355775;
                    } else {
                        iM55681 = (C0873.m55680("ܿۙ") + i11) * 31;
                        i4 = ((iM55681 ^ i12) * (-21569)) ^ 774362352;
                        i5 = 57316415;
                    }
                    i6 = iM55681 ^ i5;
                    windowM56391 = windowM56391;
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
                    this.f40959 = (TextView) viewM56321;
                    this.f40956 = (TextView) C0890.m55736(this, C0873.m55680(C1929.m56558(f82177, 127, 3, i16)) ^ 2102310987);
                    iM559711 = C0946.m55979(C1194.m56386(f82177, 130, 3, i16));
                    i18 = 2120229057;
                    if (C0892.f81851) {
                        iM55979 = (C0873.m55680("ᩴۢ") + i12) * 61;
                        i = ((iM55979 ^ i11) * (-25125)) ^ (-1270344444);
                        i2 = -391738602;
                    } else {
                        iM55979 = (i12 - C0946.m55979("֡ۡ")) * (-89);
                        i = ((iM55979 ^ i11) * (-9251)) ^ 2027318617;
                        i2 = 213535729;
                    }
                    int i210 = iM55979 ^ i2;
                    drawable2 = drawable2;
                    i14 = i210;
                    i13 = i;
                    break;
                case -873667347:
                case 1007710092:
                    drawable2 = drawable2;
                    view = viewFindViewById;
                    decorView = C0937.m55910(this).getDecorView();
                    int systemUiVisibility = decorView.getSystemUiVisibility();
                    i15 = systemUiVisibility & (-8193);
                    if (systemUiVisibility == i15) {
                        sArr = sArr2;
                        iM559710 = C0946.m55979("᩹᩷") ^ i11;
                        i7 = ((iM559710 ^ i12) * (-6951)) ^ 1351075215;
                        i8 = 741870720;
                        int i211 = iM559710 ^ i8;
                        viewFindViewById = view;
                        short[] sArr4 = sArr;
                        i20 = i20;
                        i13 = i7;
                        drawable2 = drawable2;
                        i14 = i211;
                        sArr2 = sArr4;
                    } else {
                        iM55682 = (i11 - C0873.m55680("ۜۢ")) * (-9);
                        i9 = ((iM55682 ^ i12) * 13219) ^ (-96471881);
                        i10 = 1957026575;
                        int i212 = iM55682 ^ i10;
                        viewFindViewById = view;
                        drawable = drawable2;
                        i14 = i212;
                        i13 = i9;
                        drawable2 = drawable;
                    }
                    break;
                case -862843917:
                case 552952858:
                    RunnableC0897.m55784();
                    drawable2 = drawable2;
                    iM55979 = (C0873.m55680("᩵ۡ") + i12) * (-5);
                    i = ((iM55979 ^ i11) * (-10821)) ^ (-1763588785);
                    i2 = -1968630242;
                    int i213 = iM55979 ^ i2;
                    drawable2 = drawable2;
                    i14 = i213;
                    i13 = i;
                    break;
                case -757296613:
                case 829619829:
                    this.f40964 = C0890.m55736(this, iM559712 ^ i19);
                    C1028.m56238(C1053.m56321(this, C0946.m55979(RunnableC0871.m55667(f82177, 145, 3, i16)) ^ 2125975395), 4);
                    drawable2 = (Drawable) C5178.m11081(C0989.m56092(f82177, 148, 11, i16));
                    if (drawable2 != null) {
                        iM55680 = C0873.m55680("ۖۚ") ^ i11;
                        i = ((iM55680 ^ i12) * (-27315)) ^ (-474330159);
                        i3 = 661747215;
                    } else {
                        iM55680 = (C0873.m55680("ۗ۠") ^ i12) * 119;
                        i = ((iM55680 ^ i11) * 27267) ^ 52110409;
                        i3 = -2051768359;
                    }
                    i14 = iM55680 ^ i3;
                    i13 = i;
                    break;
                case -756116174:
                case 1769992093:
                    drawable2 = drawable2;
                    this.f40967 = (TextView) C1053.m56321(this, C0946.m55979(C0947.m55993(f82177, 115, 3, i16)) ^ 2130198018);
                    button = (Button) C1053.m56321(this, C0946.m55979(RunnableC0897.m55783(f82177, 118, 3, i16)) ^ 2121273691);
                    if (C0866.f81837 >= 0) {
                        iM55979 = (C0873.m55680("᩵ۡ") + i12) * (-5);
                        i = ((iM55979 ^ i11) * (-10821)) ^ (-1763588785);
                        i2 = -1968630242;
                    } else {
                        iM55979 = (C0946.m55979("ܽۡ") ^ i12) * (-13);
                        i = ((iM55979 ^ i11) * (-19511)) ^ (-1022277596);
                        i2 = -1766840646;
                    }
                    int i214 = iM55979 ^ i2;
                    drawable2 = drawable2;
                    i14 = i214;
                    i13 = i;
                    break;
                case -681959489:
                case -325681170:
                    drawable2 = drawable2;
                    WindowManager.LayoutParams attributes = windowM56391.getAttributes();
                    attributes.layoutInDisplayCutoutMode = z ? 1 : 0;
                    windowM56391.setAttributes(attributes);
                    i20 = i20;
                    viewFindViewById = viewFindViewById;
                    int iM55686 = (i12 - C0873.m55680("ܳۖ")) * 59;
                    sArr2 = sArr2;
                    i4 = ((iM55686 ^ i11) * 7755) ^ (-1158982631);
                    i6 = iM55686 ^ 1646183219;
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
                    this.f40960 = (ImageView) C1053.m56321(this, C0873.m55680(C0949.m56016(f82177, 109, 3, i16)) ^ 2102840153);
                    sArr2 = f82177;
                    if (C1028.f81950 <= 0) {
                        iM55979 = (C0946.m55979("ᩳ᩺") + i11) * 75;
                        i = ((iM55979 ^ i12) * (-13151)) ^ 329919628;
                        i2 = -766419297;
                    } else {
                        iM55979 = C0946.m55979("֡ۗ") ^ i11;
                        i = ((iM55979 ^ i12) * (-10855)) ^ 531040741;
                        i2 = 95808910;
                    }
                    int i215 = iM55979 ^ i2;
                    drawable2 = drawable2;
                    i14 = i215;
                    i13 = i;
                    break;
                case -678191443:
                case -638455909:
                    this.f40959.setTextIsSelectable(z);
                    this.f40962.setTextIsSelectable(z);
                    C16267.m37069(this.f13392).setImageTintList(this.f40968.getTextColors());
                    drawable2 = drawable2;
                    View viewM55736 = C0890.m55736(this, C0873.m55680(AbstractC0942.m55970(f82177, 136, 3, i16)) ^ 2100949162);
                    if (C1404.f82149 >= 0) {
                        iM55979 = (C0873.m55680("᩵ۡ") + i12) * (-5);
                        i = ((iM55979 ^ i11) * (-10821)) ^ (-1763588785);
                        i2 = -1968630242;
                    } else {
                        C0947.m55996(viewM55736, new ViewOnClickListenerC11722(5, this));
                        this.f40963 = (TextView) C0890.m55736(this, C0873.m55680(C1124.m56373(f82177, 139, 3, i16)) ^ 2118171461);
                        iM559712 = C0946.m55979(C0947.m55993(f82177, 142, 3, i16));
                        i19 = 2123302369;
                        if (C1071.f81975 <= 0) {
                            iM55979 = (C0946.m55979("ᩳ᩺") + i11) * 75;
                            i = ((iM55979 ^ i12) * (-13151)) ^ 329919628;
                            i2 = -766419297;
                        } else {
                            iM55979 = C0873.m55680("᩸ۘ") ^ i12;
                            i = ((iM55979 ^ i11) * (-23797)) ^ (-66512557);
                            i2 = -1160442559;
                        }
                    }
                    int i216 = iM55979 ^ i2;
                    drawable2 = drawable2;
                    i14 = i216;
                    i13 = i;
                    break;
                case -640874293:
                case 92194121:
                    if (C1028.f81950 > 0) {
                        iM55680 = (i11 - C0946.m55979("ۙ֡")) * (-93);
                        i = ((iM55680 ^ i12) * 10763) ^ 251366553;
                        i3 = -865159866;
                        i14 = iM55680 ^ i3;
                        i13 = i;
                    }
                    drawable2 = drawable2;
                    iM55979 = (i12 - C0873.m55680("᩵ۧ")) * (-109);
                    i = ((iM55979 ^ i11) * (-11999)) ^ 237718939;
                    i2 = 1671133876;
                    int i217 = iM55979 ^ i2;
                    drawable2 = drawable2;
                    i14 = i217;
                    i13 = i;
                    break;
                case -388564328:
                case 1017511259:
                    drawable2 = drawable2;
                    if (C0937.m55923(str)) {
                        iM55979 = (C0873.m55680("ܰ᩸") + i11) * 11;
                        i = ((iM55979 ^ i12) * 19341) ^ 518723627;
                        i2 = 1676060898;
                    } else {
                        iM55979 = (C0873.m55680("ܺۢ") ^ i12) * (-103);
                        i = ((iM55979 ^ i11) * 28163) ^ 367909004;
                        i2 = -1821108652;
                    }
                    int i218 = iM55979 ^ i2;
                    drawable2 = drawable2;
                    i14 = i218;
                    i13 = i;
                    break;
                case -290459247:
                case 119817032:
                    i16 = 41773;
                    iM55681 = (i12 - C0873.m55680("᩸᩺")) * 47;
                    i4 = ((iM55681 ^ i11) * 8279) ^ 132796738;
                    i5 = 1382253866;
                    i6 = iM55681 ^ i5;
                    windowM56391 = windowM56391;
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
                    if (!RunnableC0897.f81856) {
                        drawable2 = drawable2;
                        iM55979 = (C0946.m55979("ᩳ᩺") + i11) * 75;
                        i = ((iM55979 ^ i12) * (-13151)) ^ 329919628;
                        i2 = -766419297;
                        int i219 = iM55979 ^ i2;
                        drawable2 = drawable2;
                        i14 = i219;
                        i13 = i;
                    }
                    drawable2 = drawable2;
                    iM55979 = (C0873.m55680("᩵ۡ") + i12) * (-5);
                    i = ((iM55979 ^ i11) * (-10821)) ^ (-1763588785);
                    i2 = -1968630242;
                    int i2110 = iM55979 ^ i2;
                    drawable2 = drawable2;
                    i14 = i2110;
                    i13 = i;
                    break;
                case -234165755:
                case 2115615370:
                    drawable2 = drawable2;
                    this.f40969 = button;
                    this.f40966 = (TextView) C1053.m56321(this, C0946.m55979(AbstractC0942.m55970(f82177, UMErrorCode.E_UM_BE_EMPTY_URL_PATH, 3, i16)) ^ 2104377899);
                    viewM56321 = C1053.m56321(this, C0873.m55680(C1003.m56132(f82177, 124, 3, i16)) ^ 2129048947);
                    if (C1024.f81946) {
                        iM55979 = (i12 - C0873.m55680("᩵ۧ")) * (-109);
                        i = ((iM55979 ^ i11) * (-11999)) ^ 237718939;
                        i2 = 1671133876;
                    } else {
                        iM55979 = (C0873.m55680("ۜۨ") ^ i11) * (-109);
                        i = ((iM55979 ^ i12) * (-26553)) ^ 563238002;
                        i2 = 116667491;
                    }
                    int i2111 = iM55979 ^ i2;
                    drawable2 = drawable2;
                    i14 = i2111;
                    i13 = i;
                    break;
                case 311601704:
                case 1962800238:
                    this.f40960.setImageDrawable(drawable2);
                    iM55680 = (C0873.m55680("ۗ۠") ^ i12) * 119;
                    i = ((iM55680 ^ i11) * 27267) ^ 52110409;
                    i3 = -2051768359;
                    i14 = iM55680 ^ i3;
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
                    iM559710 = C0946.m55979("᩹᩷") ^ i11;
                    i7 = ((iM559710 ^ i12) * (-6951)) ^ 1351075215;
                    i8 = 741870720;
                    int i2112 = iM559710 ^ i8;
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
                    if (!C0906.m55806(C0892.m55750(f82177, 101, 8, i16), data.getScheme())) {
                        view = viewFindViewById;
                        iM55682 = C0946.m55979("ۙᩴ") ^ i12;
                        i9 = ((iM55682 ^ i11) * (-24993)) ^ 535399859;
                        i10 = -1586634043;
                        int i2113 = iM55682 ^ i10;
                        viewFindViewById = view;
                        drawable = drawable2;
                        i14 = i2113;
                        i13 = i9;
                        drawable2 = drawable;
                    } else {
                        iM55979 = C0946.m55979("ۙۡ") ^ i12;
                        i = ((iM55979 ^ i11) * (-30389)) ^ 824309339;
                        i2 = -1187431709;
                        int i2114 = iM55979 ^ i2;
                        drawable2 = drawable2;
                        i14 = i2114;
                        i13 = i;
                    }
                    break;
                case 717866026:
                case 1459619309:
                    this.f40958 = AbstractC0942.m55967(intentM55991, C0873.m55689(f82177, 83, 8, i16));
                    this.f40955 = intentM55991.getBooleanExtra(C0866.m55652(f82177, 91, 10, i16), z2);
                    iM55979 = (i11 - C0873.m55680("ܿᩳ")) * (-43);
                    i = ((iM55979 ^ i12) * (-14609)) ^ 316296200;
                    i2 = -631481992;
                    int i2115 = iM55979 ^ i2;
                    drawable2 = drawable2;
                    i14 = i2115;
                    i13 = i;
                    break;
                case 904793059:
                case 1827719682:
                    m32898(this.f40960, this.f40969, this.f40970);
                    C0890.m55729(new C21703(this));
                    C1048.m56304(this.f40963, new ViewOnClickListenerC23044(this, 0));
                    break;
                case 1152177463:
                case 2135892701:
                    if (RunnableC0938.m55938() == 0) {
                        iM55680 = C0946.m55979("֫۟") ^ i11;
                        i = ((iM55680 ^ i12) * (-1481)) ^ (-398839801);
                        i3 = 815625534;
                        i14 = iM55680 ^ i3;
                        i13 = i;
                    }
                    drawable2 = drawable2;
                    iM55979 = (i12 - C0873.m55680("᩵ۧ")) * (-109);
                    i = ((iM55979 ^ i11) * (-11999)) ^ 237718939;
                    i2 = 1671133876;
                    int i2116 = iM55979 ^ i2;
                    drawable2 = drawable2;
                    i14 = i2116;
                    i13 = i;
                    break;
                case 1997826688:
                case 2116147005:
                    i16 = 61357;
                    iM55681 = (i12 - C0873.m55680("᩸᩺")) * 47;
                    i4 = ((iM55681 ^ i11) * 8279) ^ 132796738;
                    i5 = 1382253866;
                    i6 = iM55681 ^ i5;
                    windowM56391 = windowM56391;
                    viewFindViewById = viewFindViewById;
                    drawable = drawable2;
                    i14 = i6;
                    i13 = i4;
                    sArr2 = sArr2;
                    i20 = i20;
                    drawable2 = drawable;
                    break;
                default:
                    C1012.m56134();
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
    /* JADX INFO: renamed from: ۨ */
    public void m32912() {
        int iM55680;
        int i;
        int i2;
        int iM55681;
        int i3;
        int i4;
        Button button;
        short s;
        int iM55682;
        int i5;
        int iM55683;
        int i6;
        int i7;
        ActivityC14326 activityC14326 = this;
        Button button2 = null;
        Button button3 = null;
        Button button4 = null;
        int i8 = 0;
        Button button5 = null;
        String strM55635 = null;
        String strM56558 = null;
        int iM55979 = 0;
        int i9 = 0;
        short[] sArr = null;
        int i10 = 2072682010;
        int i11 = C1025.f81947;
        int i12 = C0866.f81837;
        int iM55684 = (i12 - C0873.m55680("ۘᩳ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
        int i13 = ((iM55684 ^ i11) * 24453) ^ (-678152756);
        int i14 = iM55684 ^ 316398975;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i15 = 0;
        char c = 0;
        short s2 = 0;
        short s3 = 0;
        C18249 c18249M34318 = null;
        int i16 = 0;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i11) * (-22245)) >> 31));
            switch (i10) {
                case -2048747259:
                case 582137952:
                    RunnableC0938.m55938();
                    iM55680 = C0946.m55979("ܽۜ") ^ i12;
                    i = ((iM55680 ^ i11) * (-12509)) ^ (-270868504);
                    i2 = -1723486911;
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case -2047591026:
                case 991232470:
                    button2 = activityC14326.f40969;
                    sArr = f82177;
                    i16 = 57;
                    if (AbstractC0942.f81890 <= 0) {
                        iM55680 = (C0946.m55979("ۗ᩸") ^ i11) * (-47);
                        i = ((iM55680 ^ i12) * (-7897)) ^ (-1031834723);
                        i2 = -1768952287;
                    } else {
                        iM55680 = C0873.m55680("᩻۬") ^ i11;
                        i = ((iM55680 ^ i12) * 31687) ^ (-670062003);
                        i2 = -1560067870;
                    }
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case -1918786291:
                case 145233849:
                    if (!C0955.f81898) {
                        button = button2;
                        i16 = i16;
                        iM55683 = C0946.m55979("۟ܶ") ^ i11;
                        i13 = ((iM55683 ^ i12) * (-19101)) ^ 419487886;
                        i6 = -701127238;
                        i7 = iM55683 ^ i6;
                        i16 = i16;
                        button2 = button;
                        i14 = i7;
                        activityC14326 = this;
                    } else {
                        iM55680 = C0946.m55979("ܽۜ") ^ i12;
                        i = ((iM55680 ^ i11) * (-12509)) ^ (-270868504);
                        i2 = -1723486911;
                        i14 = iM55680 ^ i2;
                        i13 = i;
                    }
                    break;
                case -1891705284:
                case -1419202223:
                    C0946.m55976(button5, 2099088798 ^ iM55979);
                    break;
                case -1702039038:
                case 768653844:
                    if (C1964.f83032 > 0) {
                        iM55680 = C0946.m55979("ܽۜ") ^ i12;
                        i = ((iM55680 ^ i11) * (-12509)) ^ (-270868504);
                        i2 = -1723486911;
                    } else {
                        iM55680 = (C0946.m55979("ۗ᩸") ^ i11) * (-47);
                        i = ((iM55680 ^ i12) * (-7897)) ^ (-1031834723);
                        i2 = -1768952287;
                    }
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case -1691295051:
                case -453359412:
                    strM56558 = C1929.m56558(sArr3, i15, 3, i9);
                    if (!C0863.m55643()) {
                        button = button2;
                        s = s2;
                        i16 = i16;
                        iM55682 = C0873.m55680("ܰ᩵") ^ i12;
                        i13 = ((iM55682 ^ i11) * (-13489)) ^ (-611780653);
                        i5 = -218950318;
                        i7 = iM55682 ^ i5;
                        s2 = s;
                        i16 = i16;
                        button2 = button;
                        i14 = i7;
                        activityC14326 = this;
                    } else {
                        iM55680 = C0873.m55680("ۤܶ") ^ i11;
                        i = ((iM55680 ^ i12) * (-11899)) ^ 807903790;
                        i2 = -345468731;
                        i14 = iM55680 ^ i2;
                        i13 = i;
                    }
                    break;
                case -1584089180:
                case 19057141:
                    iM55979 = C0946.m55979(C0946.m55986(sArr4, 63, 3, i9));
                    if (C0992.m56107() > 0) {
                        iM55680 = (C0873.m55680("ܿ۬") + i11) * (-105);
                        i = ((iM55680 ^ i12) * (-10455)) ^ (-909587632);
                        i2 = 412798375;
                        i14 = iM55680 ^ i2;
                        i13 = i;
                    } else {
                        button2 = button2;
                        i16 = i16;
                        iM55681 = (C0946.m55979("ۜ᩸") ^ i11) * (-95);
                        i3 = ((iM55681 ^ i12) * (-2809)) ^ (-1311910623);
                        i4 = -1090083106;
                        int i17 = iM55681 ^ i4;
                        i16 = i16;
                        Button button6 = button2;
                        i14 = i17;
                        i13 = i3;
                        button2 = button6;
                    }
                    break;
                case -1388102152:
                case 535793146:
                    C0946.m55976(button3, C0873.m55680(strM56558) ^ 2097840028);
                    break;
                case -1140911587:
                case -747958628:
                    i9 = 38930;
                    iM55681 = (C0873.m55680("ᩳ᩻") + i12) * 19;
                    i3 = ((iM55681 ^ i11) * (-19901)) ^ 1961432152;
                    i4 = -759412379;
                    int i18 = iM55681 ^ i4;
                    i16 = i16;
                    Button button7 = button2;
                    i14 = i18;
                    i13 = i3;
                    button2 = button7;
                    break;
                case -1036587959:
                case -985965141:
                    C1964.m56595(activityC14326.f40969, false);
                    button4 = activityC14326.f40969;
                    i8 = -855638017;
                    if (C1003.m56123() != 0) {
                        iM55680 = C0946.m55979("ܽۜ") ^ i12;
                        i = ((iM55680 ^ i11) * (-12509)) ^ (-270868504);
                        i2 = -1723486911;
                    } else {
                        iM55680 = (C0946.m55979("۟᩻") + i11) * (-17);
                        i = ((iM55680 ^ i12) * 30375) ^ (-953239733);
                        i2 = 823746091;
                    }
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case -934197241:
                case -787538258:
                    button2 = button2;
                    i16 = i16;
                    if (c18249M34318.m41556() >= activityC14326.f40957.m46311()) {
                        iM55681 = C0873.m55680("֡ۙ") ^ i12;
                        i3 = ((iM55681 ^ i11) * 24115) ^ (-243527776);
                        i4 = 437829360;
                    } else {
                        iM55681 = (i11 - C0946.m55979("ۨᩳ")) * (-65);
                        i3 = ((iM55681 ^ i12) * (-16863)) ^ (-1439542534);
                        i4 = -286610045;
                    }
                    int i19 = iM55681 ^ i4;
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
                    c18249M34318 = C14976.m34318(activityC14326.f40958);
                    if (c18249M34318 != null) {
                        iM55681 = (C0873.m55680("۟ۤ") + i11) * (-11);
                        i3 = ((iM55681 ^ i12) * (-16009)) ^ 1486951702;
                        i4 = -1355929260;
                    } else {
                        iM55681 = (i11 - C0946.m55979("ۨᩳ")) * (-65);
                        i3 = ((iM55681 ^ i12) * (-16863)) ^ (-1439542534);
                        i4 = -286610045;
                    }
                    int i110 = iM55681 ^ i4;
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
                    if (C0873.f81841 <= 0) {
                        iM55683 = C0946.m55979("۟ܶ") ^ i11;
                        i13 = ((iM55683 ^ i12) * (-19101)) ^ 419487886;
                        i6 = -701127238;
                    } else {
                        iM55683 = C0873.m55680("ܽ֨") ^ i11;
                        i13 = ((iM55683 ^ i12) * (-30281)) ^ (-631565028);
                        i6 = -2100717016;
                    }
                    i7 = iM55683 ^ i6;
                    i16 = i16;
                    button2 = button;
                    i14 = i7;
                    activityC14326 = this;
                    break;
                case -731928570:
                case 1181097085:
                    C1025.m56230();
                    C1017.m56187();
                    break;
                case -649564806:
                case 722650000:
                    C0873.m55684(button2, C0946.m55979(strM55635) ^ 2122232870);
                    break;
                case -258918038:
                case 1468512990:
                    i16 = i16;
                    strM55635 = C0863.m55635(sArr, i16, 3, i9);
                    if (C0992.f81922 < 0) {
                        iM55681 = (C0873.m55680("ۢۨ") + i12) * 91;
                        button2 = button2;
                        i3 = ((iM55681 ^ i11) * 20989) ^ 533589836;
                        i4 = -2003455351;
                        int i111 = iM55681 ^ i4;
                        i16 = i16;
                        Button button10 = button2;
                        i14 = i111;
                        i13 = i3;
                        button2 = button10;
                    } else {
                        button = button2;
                        iM55683 = C0946.m55979("۟ܶ") ^ i11;
                        i13 = ((iM55683 ^ i12) * (-19101)) ^ 419487886;
                        i6 = -701127238;
                        i7 = iM55683 ^ i6;
                        i16 = i16;
                        button2 = button;
                        i14 = i7;
                        activityC14326 = this;
                    }
                    break;
                case -243405680:
                case -19713457:
                    if (RunnableC1014.f81941 > 0) {
                        button = button2;
                        s = s2;
                        i16 = i16;
                        iM55682 = C0873.m55680("ܰ᩵") ^ i12;
                        i13 = ((iM55682 ^ i11) * (-13489)) ^ (-611780653);
                        i5 = -218950318;
                        i7 = iM55682 ^ i5;
                        s2 = s;
                        i16 = i16;
                        button2 = button;
                        i14 = i7;
                        activityC14326 = this;
                    } else {
                        iM55680 = (C0946.m55979("ۗ᩸") ^ i11) * (-47);
                        i = ((iM55680 ^ i12) * (-7897)) ^ (-1031834723);
                        i2 = -1768952287;
                        i14 = iM55680 ^ i2;
                        i13 = i;
                    }
                    break;
                case -202021332:
                case 1004359163:
                    C0912.m55828(button4, i8);
                    button5 = activityC14326.f40969;
                    sArr4 = f82177;
                    if (C0873.f81841 > 0) {
                        iM55680 = (C0873.m55680("ܽ᩸") ^ i12) * (-71);
                        i = ((iM55680 ^ i11) * (-18147)) ^ 1480502160;
                        i2 = 473553389;
                        i14 = iM55680 ^ i2;
                        i13 = i;
                    } else {
                        button2 = button2;
                        i16 = i16;
                        iM55681 = (C0946.m55979("ۜ᩸") ^ i11) * (-95);
                        i3 = ((iM55681 ^ i12) * (-2809)) ^ (-1311910623);
                        i4 = -1090083106;
                        int i112 = iM55681 ^ i4;
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
                    sArr2 = f82177;
                    c = '8';
                    if (C1229.f82066 >= 0) {
                        iM55682 = C0873.m55680("ܰ᩵") ^ i12;
                        i13 = ((iM55682 ^ i11) * (-13489)) ^ (-611780653);
                        i5 = -218950318;
                    } else {
                        iM55682 = C0873.m55680("ܶ۟") ^ i12;
                        i13 = ((iM55682 ^ i11) * 8653) ^ 429797192;
                        i5 = 699770031;
                    }
                    i7 = iM55682 ^ i5;
                    s2 = s;
                    i16 = i16;
                    button2 = button;
                    i14 = i7;
                    activityC14326 = this;
                    break;
                case 1094403244:
                case 1885904817:
                    button2 = button2;
                    i16 = i16;
                    C0912.m55828(activityC14326.f40969, -1);
                    if (c18249M34318 != null) {
                        iM55681 = C0946.m55979("֨ۤ") ^ i11;
                        i3 = ((iM55681 ^ i12) * 25311) ^ (-66939245);
                        i4 = -1778924052;
                    } else {
                        iM55681 = (C0946.m55979("۠ᩳ") + i12) * (-93);
                        i3 = ((iM55681 ^ i11) * 14587) ^ (-1044419699);
                        i4 = -725108396;
                    }
                    int i113 = iM55681 ^ i4;
                    i16 = i16;
                    Button button12 = button2;
                    i14 = i113;
                    i13 = i3;
                    button2 = button12;
                    break;
                case 1167719744:
                case 1634775613:
                    button3 = activityC14326.f40969;
                    sArr3 = f82177;
                    i15 = 60;
                    if (C1028.m56247() >= 0) {
                        iM55680 = C0946.m55979("ܽۜ") ^ i12;
                        i = ((iM55680 ^ i11) * (-12509)) ^ (-270868504);
                        i2 = -1723486911;
                    } else {
                        iM55680 = C0946.m55979("ۛ֡") ^ i12;
                        i = ((iM55680 ^ i11) * 21495) ^ 527714689;
                        i2 = 1004127465;
                    }
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case 1785051678:
                case 1892742018:
                    i9 = 9585;
                    iM55681 = (C0873.m55680("ᩳ᩻") + i12) * 19;
                    i3 = ((iM55681 ^ i11) * (-19901)) ^ 1961432152;
                    i4 = -759412379;
                    int i114 = iM55681 ^ i4;
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
                        iM55682 = (C0946.m55979("ۗ᩻") + i12) * (-41);
                        i13 = ((iM55682 ^ i11) * 16061) ^ (-51350592);
                        i5 = 693419135;
                    } else {
                        iM55682 = C0946.m55979("ۚ᩻") ^ i11;
                        i13 = ((iM55682 ^ i12) * 28863) ^ (-331809104);
                        i5 = 669786512;
                    }
                    i7 = iM55682 ^ i5;
                    s2 = s;
                    i16 = i16;
                    button2 = button;
                    i14 = i7;
                    activityC14326 = this;
                    break;
                default:
                    button2 = button2;
                    i16 = i16;
                    C1964.m56595(activityC14326.f40969, true);
                    if (C0892.f81851) {
                        iM55681 = (i12 - C0873.m55680("֡᩵")) * 15;
                        i3 = ((iM55681 ^ i11) * (-17493)) ^ (-1977124583);
                        i4 = 1379731277;
                    } else {
                        iM55681 = (C0946.m55979("ۜ᩸") ^ i11) * (-95);
                        i3 = ((iM55681 ^ i12) * (-2809)) ^ (-1311910623);
                        i4 = -1090083106;
                    }
                    int i115 = iM55681 ^ i4;
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
    /* JADX INFO: renamed from: ֫ */
    public static void m32898(ImageView imageView, Button button, ViewGroup viewGroup) {
        int iM55979;
        int i;
        int i2;
        Bitmap bitmap;
        Bitmap.Config config;
        C13373 c13373;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C13373 c13374;
        int i10;
        int i11;
        Rect rect;
        int iM559710;
        int i12;
        int i13;
        C13373 c13375;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        C13373 c13376;
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
        C13373 c13377;
        Bitmap.Config config3;
        C13373 c13378;
        int iM55680;
        int i36;
        int i37;
        int iM559711;
        int i38;
        int i39;
        C13373 c13379;
        int iM559712;
        int i40;
        int i41;
        int iM559713;
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
        C13373 c133710;
        int i51;
        int i52;
        int i53;
        int i54;
        int i55;
        int i56;
        int i57;
        int i58;
        int iM55681;
        int i59;
        int i60;
        int iM559714;
        int i61;
        int i62;
        int i63;
        int iM55682;
        int i64;
        int i65;
        Rect rect2;
        int iM559715;
        int i66;
        int i67;
        int i68;
        int iM55683;
        int i69;
        int i70;
        int iM559716;
        int i71;
        int i72;
        int iM559717;
        int i73;
        int i74;
        int i75;
        int iM55684;
        int i76;
        int i77;
        int iM55685;
        int i78;
        int iM55686;
        int i79;
        int i80 = C1028.f81950;
        int i81 = C1053.f81965;
        int iM559718 = C0946.m55979("᩷ۙ") ^ i81;
        int i82 = ((iM559718 ^ i80) * 23213) ^ (-597436475);
        Bitmap.Config config4 = null;
        C13373 c133711 = null;
        C8008 c8008M30511 = null;
        C8008 c8008M30512 = null;
        int[] iArr = null;
        double d = 0.0d;
        Bitmap bitmapCreateBitmap = null;
        C8008 c8008M30513 = null;
        float[] fArr = null;
        int i83 = iM559718 ^ 1797034946;
        int i84 = 0;
        int i85 = 0;
        int i86 = 0;
        int i87 = 0;
        int i88 = 0;
        int iM30513 = 0;
        int i89 = 0;
        int i90 = 0;
        int intrinsicWidth = 0;
        int intrinsicHeight = 0;
        int iM18588 = 0;
        int i91 = 0;
        int i92 = 0;
        int iRed = 0;
        int i93 = 0;
        int iGreen = 0;
        int i94 = 0;
        int iBlue = 0;
        int i95 = 0;
        int iRgb = 0;
        int iM30514 = 0;
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
        int iM18589 = 0;
        int i102 = 0;
        int iRgb3 = 0;
        int iM185810 = 0;
        int pixel3 = 0;
        int width = 0;
        int height = 0;
        int i103 = 0;
        int i104 = 0;
        int i105 = 0;
        int iM55777 = 0;
        int i106 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        int i107 = 1530271717;
        int i108 = 0;
        Canvas canvas = null;
        C8008 c8008M30514 = null;
        double dM21976 = 0.0d;
        C13373 c133712 = null;
        C8008 c8008M30515 = null;
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
                    iM559717 = C0873.m55680("ۛۚ") ^ i80;
                    i73 = ((iM559717 ^ i81) * 16659) ^ (-600790819);
                    i74 = 351210099;
                    int i112 = iM559717 ^ i74;
                    c133712 = c133712;
                    i50 = i88;
                    i83 = i112;
                    i82 = i73;
                    i88 = i50;
                    break;
                case -2099718467:
                case 81785671:
                    i110 = 0;
                    iM559717 = C0873.m55680("ۛۚ") ^ i80;
                    i73 = ((iM559717 ^ i81) * 16659) ^ (-600790819);
                    i74 = 351210099;
                    int i113 = iM559717 ^ i74;
                    c133712 = c133712;
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
                    c13373 = c133711;
                    i3 = pixel2;
                    i4 = pixel4;
                    i5 = iM55777;
                    i6 = i108;
                    i84 = i84;
                    i7 = i85;
                    i8 = i97;
                    i9 = pixel3;
                    c13374 = c133712;
                    i110 = i110;
                    i10 = i92;
                    i11 = i105;
                    drawable = imageView.getDrawable();
                    rect = new Rect(drawable.getBounds());
                    intrinsicWidth = drawable.getIntrinsicWidth();
                    intrinsicHeight = drawable.getIntrinsicHeight();
                    if (C0955.f81898) {
                        iM559710 = (i80 - C0946.m55979("᩻ۢ")) * (-75);
                        i12 = ((iM559710 ^ i81) * (-6137)) ^ (-260767005);
                        i13 = -2060227504;
                    } else {
                        iM559710 = C0946.m55979("۫᩸") ^ i81;
                        i12 = ((iM559710 ^ i80) * (-32419)) ^ (-1037972490);
                        i13 = -1497631198;
                    }
                    int i114 = iM559710 ^ i13;
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
                    c133712 = c13374;
                    pixel3 = i9;
                    i85 = i7;
                    i108 = i6;
                    iM55777 = i5;
                    pixel2 = i3;
                    c133711 = c13373;
                    config4 = config;
                    bitmapCreateBitmap = bitmap2;
                    break;
                case -2070954630:
                case 1292560623:
                    i88 = i88;
                    c133712 = c133712;
                    i108 = i108;
                    i110 = i110;
                    i84 = i84;
                    i85 = i85;
                    drawable = drawable;
                    rect3 = rect3;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    iM55777 = RunnableC0897.m55777((i93 * 5) / 4, i90);
                    i98 = i94 * 5;
                    i99 = 4;
                    if (C0946.f81894 == 0) {
                        iM559714 = (C0946.m55979("ܰ۫") ^ i80) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i61 = ((iM559714 ^ i81) * 12167) ^ 1139299351;
                        i62 = 1158113045;
                        int i115 = iM559714 ^ i62;
                        i108 = i108;
                        i82 = i61;
                        i85 = i85;
                        i110 = i110;
                        c133712 = c133712;
                        rect2 = rect3;
                        drawable = drawable;
                        i84 = i84;
                        i88 = i88;
                        i83 = i115;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect3 = rect2;
                    } else {
                        i54 = i85;
                        i55 = iM55777;
                        i56 = i108;
                        int iM559719 = (C0946.m55979("ۙۢ") + i81) * 109;
                        i57 = ((iM559719 ^ i80) * (-15059)) ^ (-387382326);
                        i58 = iM559719 ^ 715698527;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect3 = rect3;
                        drawable = drawable;
                        i84 = i84;
                        i88 = i88;
                        i83 = i58;
                        i82 = i57;
                        i110 = i110;
                        c133712 = c133712;
                        int i116 = i56;
                        iM55777 = i55;
                        i85 = i54;
                        i108 = i116;
                    }
                    break;
                case -2060915070:
                case -198005411:
                    c13379 = c133712;
                    iM18588 = c8008M30511.m18588();
                    iM559712 = C0946.m55979("᩵᩸") ^ i81;
                    i40 = ((iM559712 ^ i80) * (-20987)) ^ 1045356013;
                    i41 = -1783469643;
                    int i117 = iM559712 ^ i41;
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
                    c133711 = c133711;
                    i110 = i110;
                    c133712 = c13379;
                    pixel3 = pixel3;
                    i85 = i85;
                    i108 = i108;
                    iM55777 = iM55777;
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
                    iM55777 = iM55777;
                    i108 = i120;
                    c133712 = c133712;
                    i47 = i97;
                    i49 = pixel4;
                    i48 = i92;
                    int iM559720 = C0946.m55979("ۢۚ") ^ i80;
                    int i122 = i47;
                    i82 = ((iM559720 ^ i81) * 15983) ^ 1530578909;
                    i63 = iM559720 ^ 1359531923;
                    i105 = i105;
                    i92 = i48;
                    i97 = i122;
                    pixel4 = i49;
                    i50 = i88;
                    i83 = i63;
                    i110 = i110;
                    c133712 = c133712;
                    pixel3 = pixel3;
                    i85 = i85;
                    i108 = i108;
                    iM55777 = iM55777;
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
                    int iM55687 = (C0873.m55680("ܽ᩷") + i80) * 79;
                    i88 = i88;
                    i83 = iM55687 ^ (-1867642869);
                    i82 = ((iM55687 ^ i81) * 4871) ^ 727911565;
                    i110 = i110;
                    c133712 = c133712;
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
                    C13373 c133713 = c133712;
                    i30 = i110;
                    C13373 c133714 = c133711;
                    i31 = pixel2;
                    i32 = iM55777;
                    i33 = i108;
                    i34 = i85;
                    i35 = pixel3;
                    c13377 = c133713;
                    config3 = config4;
                    bitmapCreateBitmap2 = Bitmap.createBitmap(100, 100, config3);
                    canvas = new Canvas(bitmapCreateBitmap2);
                    c13378 = c133714;
                    drawable.setBounds(-16, -16, 116, 116);
                    drawable.draw(canvas);
                    if (C0989.m56095() <= 0) {
                        iM55680 = C0873.m55680("۟۫") ^ i80;
                        i36 = ((iM55680 ^ i81) * (-2007)) ^ (-295599371);
                        i37 = 525328202;
                    } else {
                        iM55680 = (i80 - C0873.m55680("ܶ֨")) * (-17);
                        i36 = ((iM55680 ^ i81) * (-27201)) ^ 1145019847;
                        i37 = -2106384098;
                    }
                    int i124 = iM55680 ^ i37;
                    i105 = i29;
                    i92 = i28;
                    i97 = i27;
                    pixel4 = i26;
                    i50 = i25;
                    i83 = i124;
                    i82 = i36;
                    i110 = i30;
                    c133712 = c13377;
                    pixel3 = i35;
                    i85 = i34;
                    i108 = i33;
                    iM55777 = i32;
                    pixel2 = i31;
                    c133711 = c13378;
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
                    int iM55688 = (C0873.m55680("ܽ᩷") + i80) * 79;
                    i88 = i88;
                    i83 = iM55688 ^ (-1867642869);
                    i82 = ((iM55688 ^ i81) * 4871) ^ 727911565;
                    i110 = i110;
                    c133712 = c133712;
                    break;
                case -1919807435:
                case -266828750:
                    canvas.drawColor(Color.argb(i86, i90, i90, i90));
                    i110 = i110;
                    i84 = i84;
                    iM559715 = (i81 - C0946.m55979("ᩴۨ")) * 115;
                    i66 = ((iM559715 ^ i80) * (-29015)) ^ (-494726357);
                    i67 = 959589248;
                    i72 = iM559715 ^ i67;
                    i110 = i110;
                    c133712 = c133712;
                    i50 = i88;
                    i83 = i72;
                    i82 = i66;
                    i84 = i84;
                    i88 = i50;
                    break;
                case -1888128367:
                case -1429449777:
                    fArr[c] = f - f2;
                    iM55684 = C0946.m55979("ܳܽ") ^ i80;
                    i76 = ((iM55684 ^ i81) * (-29767)) ^ (-1697787327);
                    i77 = 1123562748;
                    int i125 = iM55684 ^ i77;
                    i88 = i88;
                    i83 = i125;
                    i82 = i76;
                    break;
                case -1830342681:
                case -415220559:
                    i88 = i88;
                    c13375 = c133711;
                    i14 = pixel2;
                    i15 = pixel4;
                    i16 = iM55777;
                    i17 = i108;
                    i84 = i84;
                    i18 = i85;
                    i19 = i97;
                    i20 = pixel3;
                    c13376 = c133712;
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
                    int iM21978 = C9464.m21978(bitmapCreateBitmap3);
                    bitmapCreateBitmap3.recycle();
                    if (RunnableC0871.f81839 >= 0) {
                        i111 = iM21978;
                        int iM55689 = (C0873.m55680("᩺᩶") + i80) * 59;
                        int i126 = i23;
                        i105 = i22;
                        i92 = i21;
                        i97 = i19;
                        pixel4 = i15;
                        i50 = i88;
                        i83 = iM55689 ^ (-2055180330);
                        i82 = ((iM55689 ^ i81) * (-29941)) ^ (-249184372);
                        i110 = i110;
                        c133712 = c13376;
                        pixel3 = i20;
                        i85 = i18;
                        i108 = i17;
                        iM55777 = i16;
                        pixel2 = i14;
                        c133711 = c13375;
                        config4 = config2;
                        intrinsicWidth = i126;
                        intrinsicHeight = i24;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect3 = rect3;
                        drawable = drawable;
                        i84 = i84;
                        i88 = i50;
                    } else {
                        int iM559721 = (i80 - C0946.m55979("۟۟")) * (-13);
                        i105 = i22;
                        i92 = i21;
                        i97 = i19;
                        pixel4 = i15;
                        i111 = iM21978;
                        i82 = ((iM559721 ^ i81) * (-21137)) ^ 1257370326;
                        i83 = iM559721 ^ (-342403765);
                        i110 = i110;
                        c133712 = c13376;
                        pixel3 = i20;
                        i85 = i18;
                        i108 = i17;
                        iM55777 = i16;
                        pixel2 = i14;
                        c133711 = c13375;
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
                    iM55777 = iM55777;
                    i108 = i108;
                    i85 = i85;
                    pixel3 = pixel3;
                    c133712 = c133712;
                    i110 = i110;
                    i90 = 255;
                    if (iM30514 != 0) {
                        iM559713 = C0873.m55680("ۘۗ") ^ i81;
                        i42 = ((iM559713 ^ i80) * 16759) ^ (-70207556);
                        i43 = 1580761774;
                    } else {
                        iM559713 = C0873.m55680("ᩴܳ") ^ i81;
                        i42 = ((iM559713 ^ i80) * 33) ^ (-799696350);
                        i43 = 2117524240;
                    }
                    int i127 = iM559713 ^ i43;
                    i105 = i105;
                    i92 = i92;
                    i97 = i97;
                    pixel4 = pixel4;
                    i50 = i88;
                    i83 = i127;
                    i82 = i42;
                    i110 = i110;
                    c133712 = c133712;
                    pixel3 = pixel3;
                    i85 = i85;
                    i108 = i108;
                    iM55777 = iM55777;
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
                    C13373 c133715 = c133712;
                    int i129 = i110;
                    int i130 = i84;
                    int i131 = i105;
                    Drawable drawable2 = drawable;
                    Rect rect4 = rect3;
                    Bitmap bitmap3 = bitmapCreateBitmap;
                    int i132 = i108;
                    i54 = i85;
                    i55 = iM55777;
                    i56 = i132;
                    float[] fArr2 = new float[3];
                    int i133 = i92;
                    C9464.m21979(i133, fArr2);
                    if (fArr2[2] < 0.33f) {
                        iM55681 = (i81 - C0946.m55979("ۚܶ")) * 83;
                        i59 = ((iM55681 ^ i80) * (-7365)) ^ 1035316430;
                        i60 = -177836838;
                    } else {
                        iM55681 = C0873.m55680("ܶܿ") ^ i80;
                        i59 = ((iM55681 ^ i81) * (-32695)) ^ 2130841250;
                        i60 = -229114369;
                    }
                    int i134 = iM55681 ^ i60;
                    i105 = i131;
                    i92 = i133;
                    bitmapCreateBitmap = bitmap3;
                    i110 = i129;
                    rect3 = rect4;
                    drawable = drawable2;
                    c133712 = c133715;
                    i84 = i130;
                    i88 = i128;
                    i83 = i134;
                    i82 = i59;
                    i89 = 3;
                    int i1110 = i56;
                    iM55777 = i55;
                    i85 = i54;
                    i108 = i1110;
                    break;
                case -1802611757:
                case 790486357:
                    z = false;
                    iM559714 = (i80 - C0873.m55680("۠֫")) * 89;
                    i61 = ((iM559714 ^ i81) * (-8327)) ^ (-700864898);
                    i62 = -1206887563;
                    int i1111 = iM559714 ^ i62;
                    i108 = i108;
                    i82 = i61;
                    i85 = i85;
                    i110 = i110;
                    c133712 = c133712;
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
                    iM55682 = (C0873.m55680("᩺ۡ") ^ i81) * (-93);
                    i64 = ((iM55682 ^ i80) * 24295) ^ (-390728748);
                    i65 = -1195159897;
                    int i135 = iM55682 ^ i65;
                    i108 = i108;
                    i82 = i64;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect3 = rect3;
                    drawable = drawable;
                    i84 = i84;
                    i88 = i88;
                    i83 = i135;
                    i110 = i110;
                    c133712 = c133712;
                    break;
                case -1792680268:
                case -488744457:
                    i88 = i88;
                    c133712 = c133712;
                    i108 = i108;
                    i110 = i110;
                    i84 = i84;
                    drawable = drawable;
                    rect3 = rect3;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    c = 2;
                    i85 = i85;
                    if (((int) Math.sqrt((iBlue2 * iBlue2) + (iGreen2 * iGreen2) + i100)) < 70) {
                        iM559714 = C0873.m55680("۫ۛ") ^ i80;
                        i61 = ((iM559714 ^ i81) * 23741) ^ 1316657562;
                        i62 = 1089647091;
                    } else {
                        iM559714 = C0946.m55979("᩹ܶ") ^ i81;
                        i61 = ((iM559714 ^ i80) * (-21161)) ^ 1036393359;
                        i62 = -720783165;
                    }
                    int i1112 = iM559714 ^ i62;
                    i108 = i108;
                    i82 = i61;
                    i85 = i85;
                    i110 = i110;
                    c133712 = c133712;
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
                    iM185810 = c8008M30512.m18588();
                    iM559713 = C0946.m55979("ܳۙ") ^ i81;
                    i42 = ((iM559713 ^ i80) * (-2095)) ^ (-1980593757);
                    i43 = -1484960391;
                    int i1210 = iM559713 ^ i43;
                    i105 = i105;
                    i92 = i92;
                    i97 = i97;
                    pixel4 = pixel4;
                    i50 = i88;
                    i83 = i1210;
                    i82 = i42;
                    i110 = i110;
                    c133712 = c133712;
                    pixel3 = pixel3;
                    i85 = i85;
                    i108 = i108;
                    iM55777 = iM55777;
                    pixel2 = pixel2;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect3 = rect3;
                    drawable = drawable;
                    i84 = i84;
                    i88 = i50;
                    break;
                case -1641971665:
                case 851606000:
                    c13379 = c133712;
                    iM18589 = 0;
                    iM559712 = C0873.m55680("۟ۛ") ^ i81;
                    i40 = ((iM559712 ^ i80) * (-28969)) ^ 1109208629;
                    i41 = -2048610524;
                    int i1113 = iM559712 ^ i41;
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
                    c133711 = c133711;
                    i110 = i110;
                    c133712 = c13379;
                    pixel3 = pixel3;
                    i85 = i85;
                    i108 = i108;
                    iM55777 = iM55777;
                    pixel2 = i1115;
                    break;
                case -1636955649:
                case 2039893059:
                    if (C0949.f81897 < 0) {
                        iM55686 = C0873.m55680("ᩴۡ") ^ i81;
                        i76 = ((iM55686 ^ i80) * (-28247)) ^ (-713602761);
                        i79 = 1034869852;
                    } else {
                        iM55686 = C0873.m55680("ۨۢ") ^ i81;
                        i76 = ((iM55686 ^ i80) * 19939) ^ 1384667428;
                        i79 = -158865510;
                    }
                    i83 = iM55686 ^ i79;
                    i82 = i76;
                    break;
                case -1624202095:
                case 225795026:
                    c13379 = c133712;
                    iM18588 = 0;
                    iM559712 = C0946.m55979("᩵᩸") ^ i81;
                    i40 = ((iM559712 ^ i80) * (-20987)) ^ 1045356013;
                    i41 = -1783469643;
                    int i1116 = iM559712 ^ i41;
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
                    c133711 = c133711;
                    i110 = i110;
                    c133712 = c13379;
                    pixel3 = pixel3;
                    i85 = i85;
                    i108 = i108;
                    iM55777 = iM55777;
                    pixel2 = i1118;
                    break;
                case -1601239241:
                case 1658435225:
                    break;
                case -1595548983:
                case -514414026:
                    z2 = false;
                    iM55682 = (C0873.m55680("᩺ۡ") ^ i81) * (-93);
                    i64 = ((iM55682 ^ i80) * 24295) ^ (-390728748);
                    i65 = -1195159897;
                    int i136 = iM55682 ^ i65;
                    i108 = i108;
                    i82 = i64;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect3 = rect3;
                    drawable = drawable;
                    i84 = i84;
                    i88 = i88;
                    i83 = i136;
                    i110 = i110;
                    c133712 = c133712;
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
                    C13373 c133716 = c133712;
                    i110 = i110;
                    c133711 = c133711;
                    pixel2 = pixel2;
                    iM55777 = iM55777;
                    i108 = i108;
                    i85 = i85;
                    pixel3 = pixel3;
                    c13379 = c133716;
                    c8008M30514 = c133711.m30511(C24101.f76514);
                    if (c8008M30514 != null) {
                        iM559712 = C0873.m55680("ۢ֨") ^ i81;
                        i40 = ((iM559712 ^ i80) * 17697) ^ 393647586;
                        i41 = 1836495177;
                    } else {
                        iM559712 = C0946.m55979("֡ۙ") ^ i80;
                        i40 = ((iM559712 ^ i81) * 8325) ^ 922347702;
                        i41 = -117932654;
                    }
                    int i1119 = iM559712 ^ i41;
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
                    c133711 = c133711;
                    i110 = i110;
                    c133712 = c13379;
                    pixel3 = pixel3;
                    i85 = i85;
                    i108 = i108;
                    iM55777 = iM55777;
                    pixel2 = i11111;
                    break;
                case -1552498240:
                case 1864459070:
                    i88 = i88;
                    c133712 = c133712;
                    float[] fArr3 = new float[i89];
                    C9464.m21979(i111, fArr3);
                    float f3 = fArr3[c];
                    C9464.m21979(iM30513, fArr3);
                    i110 = i110;
                    i84 = i84;
                    int i137 = (int) (((d - dM21976) / d) * 32.0d);
                    if (f3 < fArr3[c]) {
                        iM559716 = (C0946.m55979("۫۫") + i80) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i66 = ((iM559716 ^ i81) * 7487) ^ (-1819428212);
                        i71 = 277743272;
                    } else {
                        iM559716 = C0946.m55979("֨ۘ") ^ i81;
                        i66 = ((iM559716 ^ i80) * 18867) ^ (-189785306);
                        i71 = 1122176572;
                    }
                    i72 = iM559716 ^ i71;
                    i86 = i137;
                    i110 = i110;
                    c133712 = c133712;
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
                    int i141 = iM55777;
                    int i142 = i108;
                    int i143 = i84;
                    int i144 = i85;
                    int i145 = i97;
                    int i146 = pixel3;
                    C13373 c133717 = c133712;
                    Drawable drawable3 = drawable;
                    int i147 = i110;
                    int i148 = i92;
                    int i149 = i105;
                    Rect rect5 = rect3;
                    Bitmap bitmap4 = bitmapCreateBitmap;
                    C13373 c13373M31878 = new C14043(bitmapCreateBitmap2).m31878();
                    iM30514 = c13373M31878.m30513();
                    c8008M30511 = c13373M31878.m30511(C24101.f76511);
                    i109 = 0;
                    if (c8008M30511 != null) {
                        iM559711 = (C0946.m55979("֡ۤ") + i80) * 71;
                        i38 = ((iM559711 ^ i81) * 28355) ^ (-283491921);
                        i39 = 56454010;
                    } else {
                        iM559711 = (i81 - C0946.m55979("ܺ۟")) * (-85);
                        i38 = ((iM559711 ^ i80) * (-3735)) ^ 1563885191;
                        i39 = -1865964525;
                    }
                    int i150 = iM559711 ^ i39;
                    i105 = i149;
                    i92 = i148;
                    i97 = i145;
                    pixel4 = i140;
                    c133711 = c13373M31878;
                    i82 = i38;
                    bitmapCreateBitmap = bitmap4;
                    rect3 = rect5;
                    drawable = drawable3;
                    i84 = i143;
                    i88 = i138;
                    i83 = i150;
                    i110 = i147;
                    c133712 = c133717;
                    pixel3 = i146;
                    i85 = i144;
                    i108 = i142;
                    iM55777 = i141;
                    pixel2 = i139;
                    break;
                case -1388328477:
                case -1373384644:
                    int i151 = i104;
                    int i152 = i108;
                    i85 = i85;
                    int i153 = iM55777;
                    i108 = i152;
                    int pixel5 = bitmapCreateBitmap2.getPixel(i151, i151);
                    i47 = i97;
                    i48 = i92;
                    pixel2 = pixel2;
                    iM55777 = i153;
                    pixel3 = pixel3;
                    c133712 = c133712;
                    i49 = pixel4;
                    iRed = 0;
                    iGreen = 0;
                    iBlue = 0;
                    iArr = new int[]{i47, pixel2, pixel3, i49, pixel5};
                    i106 = 0;
                    int iM559722 = C0946.m55979("ۢۚ") ^ i80;
                    int i1211 = i47;
                    i82 = ((iM559722 ^ i81) * 15983) ^ 1530578909;
                    i63 = iM559722 ^ 1359531923;
                    i105 = i105;
                    i92 = i48;
                    i97 = i1211;
                    pixel4 = i49;
                    i50 = i88;
                    i83 = i63;
                    i110 = i110;
                    c133712 = c133712;
                    pixel3 = pixel3;
                    i85 = i85;
                    i108 = i108;
                    iM55777 = iM55777;
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
                    if (c8008M30515 != null) {
                        iM55684 = (C0873.m55680("᩶۠") + i81) * 53;
                        i76 = ((iM55684 ^ i80) * 29371) ^ 1233821815;
                        i77 = -245805220;
                    } else {
                        iM55684 = C0946.m55979("۬ᩴ") ^ i80;
                        i76 = ((iM55684 ^ i81) * 17999) ^ 1050360677;
                        i77 = 67112820;
                    }
                    int i1212 = iM55684 ^ i77;
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
                    iM55777 = iM55777;
                    i108 = i108;
                    i85 = i85;
                    pixel3 = pixel3;
                    c13379 = c133712;
                    i110 = i110;
                    c133711 = c133711;
                    c8008M30512 = c133711.m30511(C24101.f76512);
                    if (c8008M30512 != null) {
                        iM559712 = (C0946.m55979("۫֨") ^ i80) * 127;
                        pixel2 = i154;
                        i40 = ((iM559712 ^ i81) * 30633) ^ (-1055641505);
                        i41 = -1738137486;
                    } else {
                        pixel2 = i154;
                        iM559712 = (C0873.m55680("᩶ܰ") ^ i80) * 115;
                        i40 = ((iM559712 ^ i81) * 24765) ^ (-1218812441);
                        i41 = -995195074;
                    }
                    int i11112 = iM559712 ^ i41;
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
                    c133711 = c133711;
                    i110 = i110;
                    c133712 = c13379;
                    pixel3 = pixel3;
                    i85 = i85;
                    i108 = i108;
                    iM55777 = iM55777;
                    pixel2 = i11114;
                    break;
                case -1169302590:
                case 1916180937:
                    i88 = i88;
                    if (i110 < i87) {
                        iM55684 = C0946.m55979("᩸ۘ") ^ i81;
                        i76 = ((iM55684 ^ i80) * (-30209)) ^ (-827081992);
                        i77 = -982377013;
                    } else {
                        iM55684 = (C0946.m55979("ۚۛ") ^ i80) * 123;
                        i76 = ((iM55684 ^ i81) * (-1637)) ^ (-1884755470);
                        i77 = -519586037;
                    }
                    int i1213 = iM55684 ^ i77;
                    i88 = i88;
                    i83 = i1213;
                    i82 = i76;
                    break;
                case -1161745700:
                case 743731414:
                    i88 = i88;
                    c133712 = c133712;
                    i110 = i110;
                    i84 = i84;
                    viewGroup.setBackground(new BitmapDrawable(imageView.getResources(), bitmapCreateBitmap2));
                    width = (bitmapCreateBitmap2.getWidth() / 4) * 3;
                    height = bitmapCreateBitmap2.getHeight();
                    if (!C0861.f81831) {
                        rect = rect3;
                        bitmap = bitmapCreateBitmap;
                        config = config4;
                        c13373 = c133711;
                        i3 = pixel2;
                        i5 = iM55777;
                        i6 = i108;
                        i7 = i85;
                        i9 = pixel3;
                        c13374 = c133712;
                        i4 = pixel4;
                        i8 = i97;
                        i10 = i92;
                        i11 = i105;
                        iM559710 = (i80 - C0946.m55979("᩻ۢ")) * (-75);
                        i12 = ((iM559710 ^ i81) * (-6137)) ^ (-260767005);
                        i13 = -2060227504;
                        int i1120 = iM559710 ^ i13;
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
                        c133712 = c13374;
                        pixel3 = i9;
                        i85 = i7;
                        i108 = i6;
                        iM55777 = i5;
                        pixel2 = i3;
                        c133711 = c13373;
                        config4 = config;
                        bitmapCreateBitmap = bitmap5;
                    } else {
                        iM559715 = C0873.m55680("᩷֨") ^ i80;
                        i66 = ((iM559715 ^ i81) * (-30511)) ^ (-1972810518);
                        i67 = -279731585;
                        i72 = iM559715 ^ i67;
                        i110 = i110;
                        c133712 = c133712;
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
                    c133710 = c133712;
                    i110 = i110;
                    i84 = i84;
                    drawable = drawable;
                    rect3 = rect3;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    int i155 = i92;
                    i105 = i105;
                    int i156 = i108;
                    i85 = i85;
                    i51 = iM55777;
                    i108 = i156;
                    if (iM18588 != 0) {
                        i52 = iM18588;
                        i53 = iM30514;
                        i101 = iM18589;
                        iRgb3 = iM185810;
                        int iM556810 = C0873.m55680("ۘۢ") ^ i80;
                        int i157 = i53;
                        i82 = ((iM556810 ^ i81) * 2451) ^ (-1571828105);
                        iM55777 = i51;
                        i85 = i85;
                        i108 = i52;
                        i110 = i110;
                        c133712 = c133710;
                        Rect rect6 = rect3;
                        drawable = drawable;
                        i84 = i84;
                        i88 = i88;
                        i83 = iM556810 ^ (-223070441);
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect3 = rect6;
                        i105 = i105;
                        i92 = i157;
                    } else {
                        int i158 = i97;
                        i92 = i155;
                        pixel2 = pixel2;
                        iM55777 = i51;
                        pixel3 = pixel3;
                        c133712 = c133710;
                        pixel4 = pixel4;
                        i97 = i158;
                        iM559713 = C0873.m55680("ᩴܳ") ^ i81;
                        i42 = ((iM559713 ^ i80) * 33) ^ (-799696350);
                        i43 = 2117524240;
                        int i1214 = iM559713 ^ i43;
                        i105 = i105;
                        i92 = i92;
                        i97 = i97;
                        pixel4 = pixel4;
                        i50 = i88;
                        i83 = i1214;
                        i82 = i42;
                        i110 = i110;
                        c133712 = c133712;
                        pixel3 = pixel3;
                        i85 = i85;
                        i108 = i108;
                        iM55777 = iM55777;
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
                    if (C1229.f82066 < 0) {
                        i88 = i88;
                        c133712 = c133712;
                        i110 = i110;
                        i84 = i84;
                        drawable = drawable;
                        rect3 = rect3;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        int i159 = i108;
                        i54 = i85;
                        i55 = iM55777;
                        i56 = i159;
                        int iM5597110 = (C0946.m55979("ۙۢ") + i81) * 109;
                        i57 = ((iM5597110 ^ i80) * (-15059)) ^ (-387382326);
                        i58 = iM5597110 ^ 715698527;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect3 = rect3;
                        drawable = drawable;
                        i84 = i84;
                        i88 = i88;
                        i83 = i58;
                        i82 = i57;
                        i110 = i110;
                        c133712 = c133712;
                        int i11115 = i56;
                        iM55777 = i55;
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
                        C13373 c133718 = c133712;
                        i110 = i110;
                        i23 = intrinsicWidth;
                        config2 = config4;
                        c13375 = c133711;
                        i14 = pixel2;
                        i16 = iM55777;
                        i17 = i108;
                        i18 = i85;
                        i20 = pixel3;
                        c13376 = c133718;
                        int iM556811 = (C0873.m55680("᩺᩶") + i80) * 59;
                        int i1215 = i23;
                        i105 = i22;
                        i92 = i21;
                        i97 = i19;
                        pixel4 = i15;
                        i50 = i88;
                        i83 = iM556811 ^ (-2055180330);
                        i82 = ((iM556811 ^ i81) * (-29941)) ^ (-249184372);
                        i110 = i110;
                        c133712 = c13376;
                        pixel3 = i20;
                        i85 = i18;
                        i108 = i17;
                        iM55777 = i16;
                        pixel2 = i14;
                        c133711 = c13375;
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
                    iM185810 = 0;
                    iM559713 = C0946.m55979("ܳۙ") ^ i81;
                    i42 = ((iM559713 ^ i80) * (-2095)) ^ (-1980593757);
                    i43 = -1484960391;
                    int i1216 = iM559713 ^ i43;
                    i105 = i105;
                    i92 = i92;
                    i97 = i97;
                    pixel4 = pixel4;
                    i50 = i88;
                    i83 = i1216;
                    i82 = i42;
                    i110 = i110;
                    c133712 = c133712;
                    pixel3 = pixel3;
                    i85 = i85;
                    i108 = i108;
                    iM55777 = iM55777;
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
                    c133712 = c133712;
                    i110 = i110;
                    i68 = 687865855;
                    i102 = iRgb3;
                    iM55683 = C0873.m55680("ܿܶ") ^ i80;
                    i69 = i68;
                    i82 = ((iM55683 ^ i81) * 21375) ^ 1562511139;
                    i70 = 507063844;
                    i110 = i110;
                    c133712 = c133712;
                    i50 = i69;
                    i83 = iM55683 ^ i70;
                    i84 = i84;
                    i88 = i50;
                    break;
                case -776226306:
                case 322294120:
                    RunnableC0938.m55938();
                    if (C1053.f81965 <= 0) {
                        iM55686 = C0873.m55680("ᩴۡ") ^ i81;
                        i76 = ((iM55686 ^ i80) * (-28247)) ^ (-713602761);
                        i79 = 1034869852;
                    } else {
                        iM55686 = C0873.m55680("ܳܳ") ^ i81;
                        i76 = ((iM55686 ^ i80) * 28015) ^ (-1224382644);
                        i79 = -630526584;
                    }
                    i83 = iM55686 ^ i79;
                    i82 = i76;
                    break;
                case -751717310:
                case -601301670:
                    i88 = i88;
                    c133712 = c133712;
                    i110 = i110;
                    i84 = i84;
                    if (z2) {
                        iM559715 = (i80 - C0873.m55680("ۢ֫")) * (-95);
                        i66 = ((iM559715 ^ i81) * (-14623)) ^ (-1274219722);
                        i67 = -1619780468;
                    } else {
                        iM559715 = C0946.m55979("ܿ۟") ^ i81;
                        i66 = ((iM559715 ^ i80) * (-22107)) ^ 1552186747;
                        i67 = -939055663;
                    }
                    i72 = iM559715 ^ i67;
                    i110 = i110;
                    c133712 = c133712;
                    i50 = i88;
                    i83 = i72;
                    i82 = i66;
                    i84 = i84;
                    i88 = i50;
                    break;
                case -695288752:
                case 1630693154:
                    C1929.m56553();
                    if (ViewOnClickListenerC0939.f81888 > 0) {
                        i88 = i88;
                        c133712 = c133712;
                        i108 = i108;
                        i110 = i110;
                        i84 = i84;
                        i85 = i85;
                        drawable = drawable;
                        rect3 = rect3;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        iM559714 = (i80 - C0946.m55979("ܰ۠")) * (-119);
                        i61 = ((iM559714 ^ i81) * 10835) ^ 1096564857;
                        i62 = -523084893;
                        int i11116 = iM559714 ^ i62;
                        i108 = i108;
                        i82 = i61;
                        i85 = i85;
                        i110 = i110;
                        c133712 = c133712;
                        rect2 = rect3;
                        drawable = drawable;
                        i84 = i84;
                        i88 = i88;
                        i83 = i11116;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect3 = rect2;
                    } else {
                        iM55686 = C0873.m55680("ܳܳ") ^ i81;
                        i76 = ((iM55686 ^ i80) * 28015) ^ (-1224382644);
                        i79 = -630526584;
                        i83 = iM55686 ^ i79;
                        i82 = i76;
                    }
                    break;
                case -556903755:
                case 619679521:
                    RunnableC0938.m55938();
                    if (C1053.f81965 > 0) {
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
                        c13378 = c133711;
                        i31 = pixel2;
                        i32 = iM55777;
                        i33 = i108;
                        i34 = i85;
                        i35 = pixel3;
                        c13377 = c133712;
                        i30 = i110;
                        iM55680 = C0873.m55680("۟۫") ^ i80;
                        i36 = ((iM55680 ^ i81) * (-2007)) ^ (-295599371);
                        i37 = 525328202;
                        int i1217 = iM55680 ^ i37;
                        i105 = i29;
                        i92 = i28;
                        i97 = i27;
                        pixel4 = i26;
                        i50 = i25;
                        i83 = i1217;
                        i82 = i36;
                        i110 = i30;
                        c133712 = c13377;
                        pixel3 = i35;
                        i85 = i34;
                        i108 = i33;
                        iM55777 = i32;
                        pixel2 = i31;
                        c133711 = c13378;
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
                    C13373 c133719 = c133712;
                    i110 = i110;
                    i23 = intrinsicWidth;
                    config2 = config4;
                    c13375 = c133711;
                    i14 = pixel2;
                    i16 = iM55777;
                    i17 = i108;
                    i18 = i85;
                    i20 = pixel3;
                    c13376 = c133719;
                    int iM556812 = (C0873.m55680("᩺᩶") + i80) * 59;
                    int i1218 = i23;
                    i105 = i22;
                    i92 = i21;
                    i97 = i19;
                    pixel4 = i15;
                    i50 = i88;
                    i83 = iM556812 ^ (-2055180330);
                    i82 = ((iM556812 ^ i81) * (-29941)) ^ (-249184372);
                    i110 = i110;
                    c133712 = c13376;
                    pixel3 = i20;
                    i85 = i18;
                    i108 = i17;
                    iM55777 = i16;
                    pixel2 = i14;
                    c133711 = c13375;
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
                    c13379 = c133712;
                    iM18589 = c8008M30514.m18588();
                    iM559712 = C0873.m55680("۟ۛ") ^ i81;
                    i40 = ((iM559712 ^ i80) * (-28969)) ^ 1109208629;
                    i41 = -2048610524;
                    int i11117 = iM559712 ^ i41;
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
                    c133711 = c133711;
                    i110 = i110;
                    c133712 = c13379;
                    pixel3 = pixel3;
                    i85 = i85;
                    i108 = i108;
                    iM55777 = iM55777;
                    pixel2 = i11119;
                    break;
                case -465299949:
                case 2033065087:
                    i88 = i88;
                    c133712 = c133712;
                    i108 = i108;
                    i110 = i110;
                    i84 = i84;
                    i85 = i85;
                    drawable = drawable;
                    rect3 = rect3;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    iRed2 = Color.red(i92) - Color.red(i108);
                    iGreen2 = Color.green(i92) - Color.green(i108);
                    if (C0873.f81841 > 0) {
                        iM559714 = C0873.m55680("ۢۧ") ^ i81;
                        i61 = ((iM559714 ^ i80) * 31681) ^ 759828582;
                        i62 = 695639084;
                        int i111110 = iM559714 ^ i62;
                        i108 = i108;
                        i82 = i61;
                        i85 = i85;
                        i110 = i110;
                        c133712 = c133712;
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
                        c13375 = c133711;
                        i14 = pixel2;
                        i20 = pixel3;
                        i16 = iM55777;
                        i17 = i108;
                        c13376 = c133712;
                        i15 = pixel4;
                        i19 = i97;
                        i21 = i92;
                        i22 = i105;
                        int iM556813 = (C0873.m55680("᩺᩶") + i80) * 59;
                        int i1219 = i23;
                        i105 = i22;
                        i92 = i21;
                        i97 = i19;
                        pixel4 = i15;
                        i50 = i88;
                        i83 = iM556813 ^ (-2055180330);
                        i82 = ((iM556813 ^ i81) * (-29941)) ^ (-249184372);
                        i110 = i110;
                        c133712 = c13376;
                        pixel3 = i20;
                        i85 = i18;
                        i108 = i17;
                        iM55777 = i16;
                        pixel2 = i14;
                        c133711 = c13375;
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
                    C0882.m55710();
                    C0967.m56074();
                    break;
                case -392943625:
                case 34747330:
                    i88 = i88;
                    c8008M30513 = c133712.m30511(C24101.f76512);
                    iM55684 = C0873.m55680("᩻ۛ") ^ i80;
                    i76 = ((iM55684 ^ i81) * 11781) ^ (-126903190);
                    i77 = 1352851375;
                    int i12110 = iM55684 ^ i77;
                    i88 = i88;
                    i83 = i12110;
                    i82 = i76;
                    break;
                case -381230069:
                case -269647871:
                    i88 = i88;
                    c133712 = c133712;
                    i110 = i110;
                    i84 = i84;
                    iM30513 = new C14043(bitmapCreateBitmap2).m31878().m30513();
                    dM21976 = C9464.m21976(i111, iM30513);
                    d = 10.0d;
                    if (dM21976 < 10.0d) {
                        iM559715 = (C0873.m55680("ۧۙ") + i81) * 61;
                        i66 = ((iM559715 ^ i80) * (-22917)) ^ (-1571353133);
                        i67 = 353046444;
                    } else {
                        iM559715 = (i81 - C0946.m55979("ᩴۨ")) * 115;
                        i66 = ((iM559715 ^ i80) * (-29015)) ^ (-494726357);
                        i67 = 959589248;
                    }
                    i72 = iM559715 ^ i67;
                    i110 = i110;
                    c133712 = c133712;
                    i50 = i88;
                    i83 = i72;
                    i82 = i66;
                    i84 = i84;
                    i88 = i50;
                    break;
                case -298442048:
                case -73844593:
                    if (C1003.f81929 > 0) {
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
                        C13373 c1337110 = c133712;
                        i110 = i110;
                        i23 = intrinsicWidth;
                        config2 = config4;
                        c13375 = c133711;
                        i14 = pixel2;
                        i16 = iM55777;
                        i17 = i108;
                        i18 = i85;
                        i20 = pixel3;
                        c13376 = c1337110;
                        int iM556814 = (C0873.m55680("᩺᩶") + i80) * 59;
                        int i12111 = i23;
                        i105 = i22;
                        i92 = i21;
                        i97 = i19;
                        pixel4 = i15;
                        i50 = i88;
                        i83 = iM556814 ^ (-2055180330);
                        i82 = ((iM556814 ^ i81) * (-29941)) ^ (-249184372);
                        i110 = i110;
                        c133712 = c13376;
                        pixel3 = i20;
                        i85 = i18;
                        i108 = i17;
                        iM55777 = i16;
                        pixel2 = i14;
                        c133711 = c13375;
                        config4 = config2;
                        intrinsicWidth = i12111;
                        intrinsicHeight = i24;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect3 = rect3;
                        drawable = drawable;
                        i84 = i84;
                        i88 = i50;
                    } else {
                        iM55686 = C0873.m55680("ᩴۡ") ^ i81;
                        i76 = ((iM55686 ^ i80) * (-28247)) ^ (-713602761);
                        i79 = 1034869852;
                        i83 = iM55686 ^ i79;
                        i82 = i76;
                    }
                    break;
                case -168495066:
                case 1102384298:
                    i88 = i88;
                    c133712 = c133712;
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
                        iM55682 = C0946.m55979("ۡۙ") ^ i80;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        i64 = ((iM55682 ^ i81) * (-15439)) ^ 1059395165;
                        i65 = -1243078465;
                        int i1310 = iM55682 ^ i65;
                        i108 = i108;
                        i82 = i64;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect3 = rect3;
                        drawable = drawable;
                        i84 = i84;
                        i88 = i88;
                        i83 = i1310;
                        i110 = i110;
                        c133712 = c133712;
                    } else {
                        int iM559723 = (i81 - C0946.m55979("᩷ܺ")) * (-109);
                        i108 = i108;
                        i82 = ((iM559723 ^ i80) * 9331) ^ 829504445;
                        i110 = i110;
                        c133712 = c133712;
                        rect2 = rect7;
                        drawable = drawable;
                        i84 = i84;
                        i88 = i88;
                        i83 = iM559723 ^ (-1804484808);
                        rect3 = rect2;
                    }
                    break;
                case -165363358:
                case 1963483693:
                    fArr[c] = f + f2;
                    iM55684 = C0946.m55979("ܳܽ") ^ i80;
                    i76 = ((iM55684 ^ i81) * (-29767)) ^ (-1697787327);
                    i77 = 1123562748;
                    int i12112 = iM55684 ^ i77;
                    i88 = i88;
                    i83 = i12112;
                    i82 = i76;
                    break;
                case -143429289:
                case 1517896806:
                    C0877.m55696();
                    if (!C0912.m55833()) {
                        i88 = i88;
                        c133712 = c133712;
                        i108 = i108;
                        i110 = i110;
                        i84 = i84;
                        i85 = i85;
                        drawable = drawable;
                        rect3 = rect3;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        iM559714 = (i80 - C0946.m55979("ܰ۠")) * (-119);
                        i61 = ((iM559714 ^ i81) * 10835) ^ 1096564857;
                        i62 = -523084893;
                        int i111111 = iM559714 ^ i62;
                        i108 = i108;
                        i82 = i61;
                        i85 = i85;
                        i110 = i110;
                        c133712 = c133712;
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
                        iM55777 = iM55777;
                        i108 = i108;
                        i85 = i85;
                        pixel3 = pixel3;
                        c133712 = c133712;
                        i110 = i110;
                        int iM556815 = C0873.m55680("۠ᩴ") ^ i81;
                        int i160 = ((iM556815 ^ i80) * (-19987)) ^ (-728331023);
                        i63 = iM556815 ^ (-359492599);
                        i105 = i45;
                        i92 = i44;
                        i97 = pixel;
                        i82 = i160;
                        i50 = i88;
                        i83 = i63;
                        i110 = i110;
                        c133712 = c133712;
                        pixel3 = pixel3;
                        i85 = i85;
                        i108 = i108;
                        iM55777 = iM55777;
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
                    iM55683 = C0873.m55680("ܿܶ") ^ i80;
                    i69 = i68;
                    i82 = ((iM55683 ^ i81) * 21375) ^ 1562511139;
                    i70 = 507063844;
                    i110 = i110;
                    c133712 = c133712;
                    i50 = i69;
                    i83 = iM55683 ^ i70;
                    i84 = i84;
                    i88 = i50;
                    break;
                case -4554172:
                case 1513162985:
                    if (ServiceConnectionC1013.f81940 < 0) {
                        i88 = i88;
                        i4 = pixel4;
                        rect = rect3;
                        i84 = i84;
                        bitmap = bitmapCreateBitmap;
                        config = config4;
                        c13373 = c133711;
                        i8 = i97;
                        i3 = pixel2;
                        i5 = iM55777;
                        i6 = i108;
                        i7 = i85;
                        i10 = i92;
                        i9 = pixel3;
                        i11 = i105;
                        c13374 = c133712;
                        i110 = i110;
                        iM559710 = (i80 - C0946.m55979("᩻ۢ")) * (-75);
                        i12 = ((iM559710 ^ i81) * (-6137)) ^ (-260767005);
                        i13 = -2060227504;
                        int i1121 = iM559710 ^ i13;
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
                        c133712 = c13374;
                        pixel3 = i9;
                        i85 = i7;
                        i108 = i6;
                        iM55777 = i5;
                        pixel2 = i3;
                        c133711 = c13373;
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
                        C13373 c1337111 = c133712;
                        i110 = i110;
                        i23 = intrinsicWidth;
                        config2 = config4;
                        c13375 = c133711;
                        i14 = pixel2;
                        i16 = iM55777;
                        i17 = i108;
                        i18 = i85;
                        i20 = pixel3;
                        c13376 = c1337111;
                        int iM556816 = (C0873.m55680("᩺᩶") + i80) * 59;
                        int i12113 = i23;
                        i105 = i22;
                        i92 = i21;
                        i97 = i19;
                        pixel4 = i15;
                        i50 = i88;
                        i83 = iM556816 ^ (-2055180330);
                        i82 = ((iM556816 ^ i81) * (-29941)) ^ (-249184372);
                        i110 = i110;
                        c133712 = c13376;
                        pixel3 = i20;
                        i85 = i18;
                        i108 = i17;
                        iM55777 = i16;
                        pixel2 = i14;
                        c133711 = c13375;
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
                    iM559714 = (i80 - C0873.m55680("۠֫")) * 89;
                    i61 = ((iM559714 ^ i81) * (-8327)) ^ (-700864898);
                    i62 = -1206887563;
                    int i111112 = iM559714 ^ i62;
                    i108 = i108;
                    i82 = i61;
                    i85 = i85;
                    i110 = i110;
                    c133712 = c133712;
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
                    c133712 = c133712;
                    if (c8008M30513 == null) {
                        iM559717 = (i80 - C0873.m55680("ܿۛ")) * 13;
                        i73 = ((iM559717 ^ i81) * 27455) ^ 1067792952;
                        i74 = 309809762;
                    } else {
                        c8008M30515 = c8008M30513;
                        iM559717 = C0873.m55680("۠ۗ") ^ i81;
                        i73 = ((iM559717 ^ i80) * (-28051)) ^ 1755802998;
                        i74 = -2065898405;
                    }
                    int i1122 = iM559717 ^ i74;
                    c133712 = c133712;
                    i50 = i88;
                    i83 = i1122;
                    i82 = i73;
                    i88 = i50;
                    break;
                case 469245639:
                case 1643183648:
                    i88 = i88;
                    c133712 = c133712;
                    i110 = i110;
                    i84 = i84;
                    canvas.drawColor(855638016);
                    iM559715 = C0873.m55680("ܳ۬") ^ i81;
                    i66 = ((iM559715 ^ i80) * (-3831)) ^ 353844862;
                    i67 = -585487558;
                    i72 = iM559715 ^ i67;
                    i110 = i110;
                    c133712 = c133712;
                    i50 = i88;
                    i83 = i72;
                    i82 = i66;
                    i84 = i84;
                    i88 = i50;
                    break;
                case 489318721:
                case 1216627375:
                    i88 = i88;
                    c133712 = c133712;
                    i108 = i108;
                    i110 = i110;
                    i84 = i84;
                    i85 = i85;
                    drawable = drawable;
                    rect3 = rect3;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    iBlue2 = Color.blue(i92) - Color.blue(i108);
                    i100 = iRed2 * iRed2;
                    if (C0882.f81846) {
                        iM559714 = (i80 - C0946.m55979("ܰ۠")) * (-119);
                        i61 = ((iM559714 ^ i81) * 10835) ^ 1096564857;
                        i62 = -523084893;
                    } else {
                        iM559714 = (C0946.m55979("ܿۗ") + i80) * (-55);
                        i61 = ((iM559714 ^ i81) * (-10949)) ^ 651670812;
                        i62 = 96585202;
                    }
                    int i111113 = iM559714 ^ i62;
                    i108 = i108;
                    i82 = i61;
                    i85 = i85;
                    i110 = i110;
                    c133712 = c133712;
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
                    c133712 = c133712;
                    i110 = i110;
                    i84 = i84;
                    canvas.drawColor(i102 & 1157627903);
                    C4358.m9001(bitmapCreateBitmap2);
                    canvas.drawColor(i161);
                    if (!C23223.m51768()) {
                        i88 = i161;
                        iM559715 = C0873.m55680("ܳ۬") ^ i81;
                        i66 = ((iM559715 ^ i80) * (-3831)) ^ 353844862;
                        i67 = -585487558;
                        i72 = iM559715 ^ i67;
                        i110 = i110;
                        c133712 = c133712;
                        i50 = i88;
                        i83 = i72;
                        i82 = i66;
                        i84 = i84;
                        i88 = i50;
                    } else {
                        iM55683 = (C0873.m55680("ۚܽ") ^ i80) * (-59);
                        i69 = i161;
                        i82 = ((iM55683 ^ i81) * (-20659)) ^ (-502608359);
                        i70 = 1344475161;
                        i110 = i110;
                        c133712 = c133712;
                        i50 = i69;
                        i83 = iM55683 ^ i70;
                        i84 = i84;
                        i88 = i50;
                    }
                    break;
                case 575889767:
                case 1360299860:
                    i88 = i88;
                    c133712 = c133712;
                    i110 = i110;
                    i84 = i84;
                    if (z2) {
                        iM559715 = C0873.m55680("֨ܳ") ^ i80;
                        i66 = ((iM559715 ^ i81) * (-29551)) ^ (-1699291347);
                        i67 = 729895865;
                    } else {
                        iM559715 = (C0873.m55680("ۢܿ") ^ i81) * (-119);
                        i66 = ((iM559715 ^ i80) * 11799) ^ 797398402;
                        i67 = -931866304;
                    }
                    i72 = iM559715 ^ i67;
                    i110 = i110;
                    c133712 = c133712;
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
                    iM55684 = C0946.m55979("۬ᩴ") ^ i80;
                    i76 = ((iM55684 ^ i81) * 17999) ^ 1050360677;
                    i77 = 67112820;
                    int i12114 = iM55684 ^ i77;
                    i88 = i88;
                    i83 = i12114;
                    i82 = i76;
                    break;
                case 613656519:
                case 2022947590:
                    i88 = i88;
                    c133710 = c133712;
                    i110 = i110;
                    i84 = i84;
                    int i162 = i85;
                    drawable = drawable;
                    rect3 = rect3;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    i51 = iM55777;
                    iRgb3 = Color.rgb(i51, RunnableC0897.m55777(i98 / i99, i90), RunnableC0897.m55777((i95 * 5) / 4, i90));
                    i85 = i162;
                    i53 = iRgb;
                    i52 = i53;
                    i101 = iRgb2;
                    i105 = i105;
                    int iM556817 = C0873.m55680("ۘۢ") ^ i80;
                    int i1510 = i53;
                    i82 = ((iM556817 ^ i81) * 2451) ^ (-1571828105);
                    iM55777 = i51;
                    i85 = i85;
                    i108 = i52;
                    i110 = i110;
                    c133712 = c133710;
                    Rect rect8 = rect3;
                    drawable = drawable;
                    i84 = i84;
                    i88 = i88;
                    i83 = iM556817 ^ (-223070441);
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    rect3 = rect8;
                    i105 = i105;
                    i92 = i1510;
                    break;
                case 652643238:
                case 790758260:
                    i88 = i88;
                    float[] fArr4 = new float[i89];
                    C9464.m21979(c8008M30515.m18588(), fArr4);
                    f = fArr4[c];
                    f2 = 0.08f;
                    if (f < 0.7f) {
                        iM55685 = (C0946.m55979("ۙ۟") ^ i80) * 123;
                        i75 = ((iM55685 ^ i81) * (-32355)) ^ (-1877151078);
                        i78 = 528587932;
                    } else {
                        iM55685 = (C0873.m55680("ۖۤ") ^ i81) * (-89);
                        i75 = ((iM55685 ^ i80) * 3579) ^ 841727243;
                        i78 = 1633904325;
                    }
                    i46 = iM55685 ^ i78;
                    fArr = fArr4;
                    i82 = i75;
                    i88 = i88;
                    i83 = i46;
                    break;
                case 713793591:
                case 1115543756:
                    i88 = i88;
                    c8008M30515 = c133712.m30514();
                    c133712 = c133712;
                    iM559717 = C0873.m55680("۠ۗ") ^ i81;
                    i73 = ((iM559717 ^ i80) * (-28051)) ^ 1755802998;
                    i74 = -2065898405;
                    int i1123 = iM559717 ^ i74;
                    c133712 = c133712;
                    i50 = i88;
                    i83 = i1123;
                    i82 = i73;
                    i88 = i50;
                    break;
                case 758646128:
                case 827809869:
                    C0992.m56107();
                    C1044.m56286();
                    iM55686 = C0873.m55680("ᩴۡ") ^ i81;
                    i76 = ((iM55686 ^ i80) * (-28247)) ^ (-713602761);
                    i79 = 1034869852;
                    i83 = iM55686 ^ i79;
                    i82 = i76;
                    break;
                case 771026938:
                case 1176379800:
                    i88 = i88;
                    c133712 = c133712;
                    if (i84 < i85) {
                        iM559717 = C0946.m55979("ۜ֨") ^ i81;
                        i73 = ((iM559717 ^ i80) * 28079) ^ (-599375915);
                        i74 = 813891619;
                    } else {
                        iM559717 = C0946.m55979("᩺᩹") ^ i81;
                        i73 = ((iM559717 ^ i80) * 26767) ^ (-971497945);
                        i74 = 73105902;
                    }
                    int i1124 = iM559717 ^ i74;
                    c133712 = c133712;
                    i50 = i88;
                    i83 = i1124;
                    i82 = i73;
                    i88 = i50;
                    break;
                case 805627897:
                case 1780117744:
                    i88 = i88;
                    C4358.m9001(bitmapCreateBitmap);
                    C13373 c13373M31879 = new C14043(bitmapCreateBitmap).m31878();
                    C8008 c8008M30516 = c13373M31879.m30511(C24101.f76516);
                    if (c8008M30516 != null) {
                        c133712 = c13373M31879;
                        c8008M30513 = c8008M30516;
                        iM55684 = C0873.m55680("᩻ۛ") ^ i80;
                        i76 = ((iM55684 ^ i81) * 11781) ^ (-126903190);
                        i77 = 1352851375;
                        int i12115 = iM55684 ^ i77;
                        i88 = i88;
                        i83 = i12115;
                        i82 = i76;
                    } else {
                        int iM556818 = (i81 - C0873.m55680("ۡ֡")) * (-65);
                        i75 = ((iM556818 ^ i80) * 12021) ^ 1797801524;
                        i46 = iM556818 ^ (-1228723078);
                        c133712 = c13373M31879;
                        i82 = i75;
                        i88 = i88;
                        i83 = i46;
                    }
                    break;
                case 901763351:
                case 1623003549:
                    i84 = i84;
                    c133712 = c133712;
                    i110 = i110;
                    i68 = 553648127;
                    i102 = i108;
                    iM55683 = C0873.m55680("ܿܶ") ^ i80;
                    i69 = i68;
                    i82 = ((iM55683 ^ i81) * 21375) ^ 1562511139;
                    i70 = 507063844;
                    i110 = i110;
                    c133712 = c133712;
                    i50 = i69;
                    i83 = iM55683 ^ i70;
                    i84 = i84;
                    i88 = i50;
                    break;
                case 936467278:
                case 1192570792:
                    i88 = i88;
                    c133712 = c133712;
                    i110 = i110;
                    i84 = i84;
                    int i163 = i105;
                    drawable = drawable;
                    rect3 = rect3;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    int i164 = i92;
                    int i165 = i108;
                    i54 = i85;
                    i55 = iM55777;
                    i56 = i165;
                    int i166 = i106;
                    if (i166 < 5) {
                        int iM556819 = C0873.m55680("ۙۗ") ^ i81;
                        i82 = ((iM556819 ^ i80) * (-14781)) ^ 2068296520;
                        i106 = i166;
                        i105 = i163;
                        i110 = i110;
                        i92 = i164;
                        c133712 = c133712;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect3 = rect3;
                        drawable = drawable;
                        i84 = i84;
                        i88 = i88;
                        i83 = iM556819 ^ (-1289531353);
                        i91 = 5;
                    } else {
                        int iM559724 = C0946.m55979("᩺ܽ") ^ i81;
                        i106 = i166;
                        i57 = ((iM559724 ^ i80) * 20223) ^ 2067462220;
                        i58 = iM559724 ^ 191830709;
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
                        c133712 = c133712;
                    }
                    int i111114 = i56;
                    iM55777 = i55;
                    i85 = i54;
                    i108 = i111114;
                    break;
                case 963504663:
                case 1248446727:
                    i88 = i88;
                    i44 = i92;
                    i45 = i105;
                    iM55777 = iM55777;
                    c133712 = c133712;
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
                    if (C1053.f81965 > 0) {
                        int iM556820 = (i80 - C0873.m55680("ۗۘ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        int i167 = ((iM556820 ^ i81) * (-32243)) ^ (-507542765);
                        i46 = iM556820 ^ (-1362520088);
                        i105 = i45;
                        i92 = i44;
                        i104 = 99;
                        i97 = pixel;
                        i82 = i167;
                        i110 = i110;
                        c133712 = c133712;
                        pixel3 = pixel3;
                        i85 = i85;
                        i108 = i108;
                        iM55777 = iM55777;
                        pixel2 = pixel2;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect3 = rect3;
                        drawable = drawable;
                        i84 = i84;
                        i88 = i88;
                        i83 = i46;
                    } else {
                        i104 = 99;
                        int iM5568110 = C0873.m55680("۠ᩴ") ^ i81;
                        int i168 = ((iM5568110 ^ i80) * (-19987)) ^ (-728331023);
                        i63 = iM5568110 ^ (-359492599);
                        i105 = i45;
                        i92 = i44;
                        i97 = pixel;
                        i82 = i168;
                        i50 = i88;
                        i83 = i63;
                        i110 = i110;
                        c133712 = c133712;
                        pixel3 = pixel3;
                        i85 = i85;
                        i108 = i108;
                        iM55777 = iM55777;
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
                    c133712 = c133712;
                    i110 = i110;
                    i84 = i84;
                    drawable = drawable;
                    rect3 = rect3;
                    bitmapCreateBitmap = bitmapCreateBitmap;
                    int i169 = i108;
                    i54 = i85;
                    i55 = iM55777;
                    i56 = i169;
                    int i170 = iRed / i91;
                    int i171 = iGreen / i91;
                    int i172 = iBlue / i91;
                    iRgb = Color.rgb(i170, i171, i172);
                    i105 = (i170 * 3) / 4;
                    i96 = 3;
                    if (C0866.f81837 >= 0) {
                        i93 = i170;
                        i94 = i171;
                        i95 = i172;
                        int iM5597111 = (C0946.m55979("ۙۢ") + i81) * 109;
                        i57 = ((iM5597111 ^ i80) * (-15059)) ^ (-387382326);
                        i58 = iM5597111 ^ 715698527;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect3 = rect3;
                        drawable = drawable;
                        i84 = i84;
                        i88 = i88;
                        i83 = i58;
                        i82 = i57;
                    } else {
                        int iM556821 = (i80 - C0873.m55680("ܽۜ")) * (-117);
                        i82 = ((iM556821 ^ i81) * 5599) ^ 505690535;
                        i95 = i172;
                        bitmapCreateBitmap = bitmapCreateBitmap;
                        rect3 = rect3;
                        drawable = drawable;
                        i84 = i84;
                        i88 = i88;
                        i83 = iM556821 ^ (-1305206754);
                        i93 = i170;
                        i94 = i171;
                    }
                    i110 = i110;
                    c133712 = c133712;
                    int i111115 = i56;
                    iM55777 = i55;
                    i85 = i54;
                    i108 = i111115;
                    break;
                case 1255876560:
                case 2057517842:
                    i68 = 939524096;
                    i102 = i101;
                    iM55683 = C0873.m55680("ܿܶ") ^ i80;
                    i69 = i68;
                    i82 = ((iM55683 ^ i81) * 21375) ^ 1562511139;
                    i70 = 507063844;
                    i110 = i110;
                    c133712 = c133712;
                    i50 = i69;
                    i83 = iM55683 ^ i70;
                    i84 = i84;
                    i88 = i50;
                    break;
                case 1545773285:
                case 1992266020:
                    canvas.drawColor(Color.argb(i86, i109, i109, i109));
                    i110 = i110;
                    i84 = i84;
                    iM559715 = (i81 - C0946.m55979("ᩴۨ")) * 115;
                    i66 = ((iM559715 ^ i80) * (-29015)) ^ (-494726357);
                    i67 = 959589248;
                    i72 = iM559715 ^ i67;
                    i110 = i110;
                    c133712 = c133712;
                    i50 = i88;
                    i83 = i72;
                    i82 = i66;
                    i84 = i84;
                    i88 = i50;
                    break;
                default:
                    int i173 = i88;
                    C13373 c133720 = c133712;
                    int i174 = i108;
                    int i175 = i110;
                    int i176 = i84;
                    int i177 = i85;
                    int i178 = iM55777;
                    Drawable drawable4 = drawable;
                    Rect rect9 = rect3;
                    Bitmap bitmap7 = bitmapCreateBitmap;
                    int i179 = i105;
                    iRgb2 = Color.rgb(i179, (i94 * i96) / 4, (i95 * 3) / 4);
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = (C0946.m55979("᩸ۗ") ^ i80) * 95;
                        i = ((iM55979 ^ i81) * (-31275)) ^ (-1205286421);
                        i2 = 1898052335;
                    } else {
                        iM55979 = C0946.m55979("۠֨") ^ i81;
                        i = ((iM55979 ^ i80) * (-23655)) ^ 1971233128;
                        i2 = 2035686159;
                    }
                    int i180 = iM55979 ^ i2;
                    i105 = i179;
                    i110 = i175;
                    c133712 = c133720;
                    i83 = i180;
                    i82 = i;
                    bitmapCreateBitmap = bitmap7;
                    rect3 = rect9;
                    drawable = drawable4;
                    i84 = i176;
                    i88 = i173;
                    iM55777 = i178;
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
    
        if (p067l.C1229.m56410() != 0) goto L12;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m32900(AbstractActivityC5549 abstractActivityC5549, C20521 c20521, Runnable runnable) {
        int iM55979;
        int i;
        int i2;
        int i3 = RunnableC0871.f81839;
        int i4 = C0863.f81833;
        int iM55680 = C0873.m55680("֡᩶") ^ i4;
        int i5 = ((iM55680 ^ i3) * 29093) ^ 1184592327;
        String strM56235 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM55680 ^ 1406895323;
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 195382848;
        int i11 = 0;
        String strM55990 = null;
        String strM55773 = null;
        short[] sArr3 = null;
        int iM46311 = 0;
        int i12 = 0;
        StringBuilder sb = null;
        AbstractC17043 abstractC17043 = null;
        while (true) {
            i10 = i6 ^ (i5 & (((i10 ^ i3) * (-11489)) >> 31));
            switch (i10) {
                case -2128135605:
                case 527190570:
                    abstractC17043 = abstractC17043;
                    strM55773 = C0894.m55773(f82177, 48, 3, i12);
                    if (C1048.m56305() >= 0) {
                        iM55979 = C0946.m55979("ۗ۟") ^ i3;
                        i = ((iM55979 ^ i4) * (-31469)) ^ 524464262;
                        i2 = -114069014;
                    } else {
                        iM55979 = (C0873.m55680("᩹֨") ^ i3) * (-41);
                        i = ((iM55979 ^ i4) * 2643) ^ 27753897;
                        i2 = 1407798056;
                    }
                    AbstractC17043 abstractC17044 = abstractC17043;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    abstractC17043 = abstractC17044;
                    break;
                case -2045418180:
                case 219128218:
                    abstractC17043 = abstractC17043;
                    C0912.m55825(sb, strM55990);
                    sArr3 = f82177;
                    if (C0967.f81910 >= 0) {
                        iM55979 = C0873.m55680("֡ۢ") ^ i4;
                        i = ((iM55979 ^ i3) * 6271) ^ (-2050076406);
                        i2 = 840309257;
                    } else {
                        iM55979 = C0946.m55979("ۡ۠") ^ i3;
                        i = ((iM55979 ^ i4) * 2789) ^ (-1286454915);
                        i2 = 1844743564;
                    }
                    AbstractC17043 abstractC17045 = abstractC17043;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    abstractC17043 = abstractC17045;
                    break;
                case -1721608658:
                case 1966579821:
                    break;
                case -1656160545:
                case -885222483:
                    abstractC17043 = C17853.f53278;
                    sb = new StringBuilder();
                    strM55990 = C0947.m55990(c20521);
                    if (C1071.f81975 <= 0) {
                        iM55979 = C0946.m55979("֫ۡ") ^ i4;
                        abstractC17043 = abstractC17043;
                        i = ((iM55979 ^ i3) * (-25831)) ^ 553095905;
                        i2 = 1682206605;
                    } else {
                        iM55979 = C0946.m55979("ۚ᩻") ^ i3;
                        abstractC17043 = abstractC17043;
                        i = ((iM55979 ^ i4) * (-25401)) ^ 2022955983;
                        i2 = 535721074;
                    }
                    AbstractC17043 abstractC17046 = abstractC17043;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    abstractC17043 = abstractC17046;
                    break;
                case -1506396240:
                case 667399754:
                    abstractC17043 = abstractC17043;
                    s = sArr[47];
                    i11 = s * s;
                    if (C1003.f81929 <= 0) {
                        abstractC17043 = abstractC17043;
                        iM55979 = C0946.m55979("֫ۡ") ^ i4;
                        abstractC17043 = abstractC17043;
                        i = ((iM55979 ^ i3) * (-25831)) ^ 553095905;
                        i2 = 1682206605;
                    } else {
                        iM55979 = C0873.m55680("᩹ܳ") ^ i3;
                        i = ((iM55979 ^ i4) * 3415) ^ (-1962657465);
                        i2 = -1603694449;
                    }
                    AbstractC17043 abstractC17047 = abstractC17043;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    abstractC17043 = abstractC17047;
                    break;
                case -1367809375:
                case 1582610305:
                    abstractC17043 = abstractC17043;
                    C1003.m56121(sb, strM56235);
                    iM46311 = c20521.m46311();
                    if (C1194.f82045 != 0) {
                        iM55979 = (i4 - C0873.m55680("ۤ᩹")) * 93;
                        i = ((iM55979 ^ i3) * (-20887)) ^ 1194781471;
                        i2 = -437555965;
                    } else {
                        iM55979 = (C0873.m55680("ۢܺ") ^ i4) * (-11);
                        i = ((iM55979 ^ i3) * 14141) ^ 1954720295;
                        i2 = -649701205;
                    }
                    AbstractC17043 abstractC17048 = abstractC17043;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    abstractC17043 = abstractC17048;
                    break;
                case -862383847:
                case 1623741613:
                    C1229.m56410();
                    C1194.m56396();
                    abstractC17043 = abstractC17043;
                    iM55979 = C0873.m55680("֡ۢ") ^ i4;
                    i = ((iM55979 ^ i3) * 6271) ^ (-2050076406);
                    i2 = 840309257;
                    AbstractC17043 abstractC17049 = abstractC17043;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    abstractC17043 = abstractC17049;
                    break;
                case -708782507:
                case 206905967:
                    abstractC17043 = abstractC17043;
                    if (c20521.m46307() > Build.VERSION.SDK_INT) {
                        iM55979 = (i4 - C0873.m55680("ܽܽ")) * 3;
                        i = ((iM55979 ^ i3) * 22549) ^ 126570849;
                        i2 = 1060311607;
                    } else {
                        iM55979 = C0946.m55979("᩺ۖ") ^ i4;
                        i = ((iM55979 ^ i3) * (-7593)) ^ (-977307508);
                        i2 = -741020880;
                    }
                    AbstractC17043 abstractC170410 = abstractC17043;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    abstractC17043 = abstractC170410;
                    break;
                case -677871477:
                case -98639646:
                    abstractC17043 = abstractC17043;
                    int i13 = s + s2;
                    if ((i13 * i13) - i8 > 0) {
                        iM55979 = (i3 - C0946.m55979("᩷᩵")) * (-105);
                        i = ((iM55979 ^ i4) * 13221) ^ (-123288599);
                        i2 = -94818185;
                    } else {
                        iM55979 = (C0873.m55680("ۘ᩶") ^ i3) * 115;
                        i = ((iM55979 ^ i4) * 24363) ^ 1157799579;
                        i2 = 1764473030;
                    }
                    AbstractC17043 abstractC170411 = abstractC17043;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    abstractC17043 = abstractC170411;
                    break;
                case -419504677:
                case 883326150:
                    abstractC17043 = abstractC17043;
                    C0863.m55629(sb, iM46311);
                    sArr2 = f82177;
                    i9 = 52;
                    i7 = 4;
                    if (C0866.f81837 >= 0) {
                        iM55979 = (i4 - C0873.m55680("ۤ᩹")) * 93;
                        i = ((iM55979 ^ i3) * (-20887)) ^ 1194781471;
                        i2 = -437555965;
                    } else {
                        iM55979 = C0946.m55979("ۗܶ") ^ i3;
                        i = ((iM55979 ^ i4) * (-31799)) ^ 1162246003;
                        i2 = -1426916905;
                    }
                    AbstractC17043 abstractC170412 = abstractC17043;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    abstractC17043 = abstractC170412;
                    break;
                case -389320001:
                case 261441643:
                    if (C0967.f81910 < 0) {
                        iM55979 = C0946.m55979("֫ۡ") ^ i4;
                        abstractC17043 = abstractC17043;
                        i = ((iM55979 ^ i3) * (-25831)) ^ 553095905;
                        i2 = 1682206605;
                        AbstractC17043 abstractC170413 = abstractC17043;
                        i6 = iM55979 ^ i2;
                        i5 = i;
                        abstractC17043 = abstractC170413;
                    }
                    abstractC17043 = abstractC17043;
                    iM55979 = C0946.m55979("ۗ۟") ^ i3;
                    i = ((iM55979 ^ i4) * (-31469)) ^ 524464262;
                    i2 = -114069014;
                    AbstractC17043 abstractC170414 = abstractC17043;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    abstractC17043 = abstractC170414;
                    break;
                case -255868495:
                case 351152828:
                    C1053.m56329(new C14996(abstractActivityC5549, C1024.m56217(abstractC17043, C0863.m55639(sb)), c20521, runnable));
                    break;
                case -200298948:
                case 1345357588:
                    abstractC17043 = abstractC17043;
                    strM56235 = C1028.m56235(sArr3, 51, 1, i12);
                    if (C0877.m55696()) {
                        iM55979 = C0873.m55680("ۧ֫") ^ i4;
                        i = ((iM55979 ^ i3) * 8263) ^ 675383014;
                        i2 = -1231848956;
                    } else {
                        iM55979 = C0873.m55680("ۗܺ") ^ i3;
                        i = ((iM55979 ^ i4) * (-27427)) ^ (-1828434470);
                        i2 = 10056386;
                    }
                    AbstractC17043 abstractC170415 = abstractC17043;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    abstractC17043 = abstractC170415;
                    break;
                case 79758344:
                case 2144354578:
                    C0927.m55865(C0873.m55680(strM55773) ^ 2124552429);
                    break;
                case 242308551:
                case 581323312:
                    i12 = 26518;
                    iM55979 = C0946.m55979("ۛ᩻") ^ i4;
                    i = ((iM55979 ^ i3) * 28835) ^ 211190044;
                    i2 = 886366678;
                    AbstractC17043 abstractC170416 = abstractC17043;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    abstractC17043 = abstractC170416;
                    break;
                case 342605871:
                case 554604683:
                    abstractC17043 = abstractC17043;
                    if (c20521.m46304() > 26101061) {
                        iM55979 = C0873.m55680("ܽۙ") ^ i4;
                        i = ((iM55979 ^ i3) * 24817) ^ 1022854163;
                        i2 = 126348823;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ۗ֨")) * 101;
                        i = ((iM55979 ^ i4) * 13823) ^ 984952819;
                        i2 = -868163751;
                    }
                    AbstractC17043 abstractC170417 = abstractC17043;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    abstractC17043 = abstractC170417;
                    break;
                case 449900419:
                case 2091883034:
                    if (C0854.f81826 == 0) {
                        abstractC17043 = abstractC17043;
                        iM55979 = C0873.m55680("ۗܺ") ^ i3;
                        i = ((iM55979 ^ i4) * (-27427)) ^ (-1828434470);
                        i2 = 10056386;
                        AbstractC17043 abstractC170418 = abstractC17043;
                        i6 = iM55979 ^ i2;
                        i5 = i;
                        abstractC17043 = abstractC170418;
                    }
                    abstractC17043 = abstractC17043;
                    iM55979 = C0873.m55680("֡ۢ") ^ i4;
                    i = ((iM55979 ^ i3) * 6271) ^ (-2050076406);
                    i2 = 840309257;
                    AbstractC17043 abstractC170419 = abstractC17043;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    abstractC17043 = abstractC170419;
                    break;
                case 620767725:
                case 856284487:
                    C0912.m55825(sb, C0898.m55792(sArr2, i9, i7, i12));
                    if (C0892.m55749()) {
                        iM55979 = C0946.m55979("۬᩸") ^ i3;
                        abstractC17043 = abstractC17043;
                        i = ((iM55979 ^ i4) * (-24149)) ^ (-851093957);
                        i2 = -1927994337;
                    } else {
                        abstractC17043 = abstractC17043;
                        iM55979 = (i4 - C0873.m55680("ۤ᩹")) * 93;
                        i = ((iM55979 ^ i3) * (-20887)) ^ 1194781471;
                        i2 = -437555965;
                    }
                    AbstractC17043 abstractC1704110 = abstractC17043;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    abstractC17043 = abstractC1704110;
                    break;
                case 684980434:
                case 721284201:
                    C1017.m56187();
                    C1124.m56367();
                    break;
                case 742346199:
                case 1923656449:
                    abstractC17043 = abstractC17043;
                    if (c20521.m46293() <= 3) {
                        iM55979 = C0873.m55680("᩶ۗ") ^ i4;
                        i = ((iM55979 ^ i3) * 21441) ^ (-1849043093);
                        i2 = 971432107;
                    } else {
                        iM55979 = C0873.m55680("ܽۙ") ^ i4;
                        i = ((iM55979 ^ i3) * 24817) ^ 1022854163;
                        i2 = 126348823;
                    }
                    AbstractC17043 abstractC1704111 = abstractC17043;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    abstractC17043 = abstractC1704111;
                    break;
                case 965825786:
                case 1763082705:
                    abstractC17043 = abstractC17043;
                    int i14 = i11 + 109662784;
                    i8 = i14 + i14;
                    s2 = 10472;
                    if (C1017.f81942 >= 0) {
                        iM55979 = C0873.m55680("֡ۢ") ^ i4;
                        i = ((iM55979 ^ i3) * 6271) ^ (-2050076406);
                        i2 = 840309257;
                    } else {
                        iM55979 = (i4 - C0946.m55979("ۙ᩸")) * 51;
                        i = ((iM55979 ^ i3) * 22499) ^ (-2087613934);
                        i2 = 212871620;
                    }
                    AbstractC17043 abstractC1704112 = abstractC17043;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    abstractC17043 = abstractC1704112;
                    break;
                case 1261440815:
                case 2136758095:
                    abstractC17043 = abstractC17043;
                    sArr = f82177;
                    if (C0892.f81851) {
                        iM55979 = (C0946.m55979("ۧ۫") ^ i4) * C0254q.f1218h;
                        i = ((iM55979 ^ i3) * 13069) ^ (-970217316);
                        i2 = 214607003;
                    } else {
                        iM55979 = C0946.m55979("ۗ۟") ^ i3;
                        i = ((iM55979 ^ i4) * (-31469)) ^ 524464262;
                        i2 = -114069014;
                    }
                    AbstractC17043 abstractC1704113 = abstractC17043;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    abstractC17043 = abstractC1704113;
                    break;
                case 1950928137:
                case 1972109332:
                    C22682.m50800(C14976.m34300(c20521.m46307()));
                    break;
                default:
                    i12 = 12947;
                    iM55979 = C0946.m55979("ۛ᩻") ^ i4;
                    i = ((iM55979 ^ i3) * 28835) ^ 211190044;
                    i2 = 886366678;
                    AbstractC17043 abstractC1704114 = abstractC17043;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    abstractC17043 = abstractC1704114;
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
        int iM55979;
        int i;
        int i2;
        short s;
        int i3;
        int iM55680;
        int i4;
        short s2;
        int iM55681;
        int i5;
        int i6;
        Menu menu2 = menu;
        int i7 = C1124.f82007;
        int i8 = RunnableC1014.f81941;
        int iM559710 = (i7 - C0946.m55979("ۘ᩵")) * 29;
        int i9 = ((iM559710 ^ i8) * 31167) ^ 2026085076;
        ColorStateList textColors = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i10 = iM559710 ^ (-77913983);
        int iM55682 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        short s3 = 0;
        short s4 = 0;
        int i14 = 645490250;
        int i15 = 0;
        Drawable drawableMutate = null;
        String strM56462 = null;
        int i16 = 0;
        Drawable icon = null;
        MenuItem menuItemM56394 = null;
        MenuInflater menuInflater = null;
        while (true) {
            i14 = i10 ^ (i9 & (((i14 ^ i8) * (-6271)) >> 31));
            switch (i14) {
                case -2047368512:
                case 1099518657:
                    ServiceConnectionC1013.m56157();
                    C1964.m56597();
                    return false;
                case -1927674105:
                case 617541084:
                    RunnableC0897.m55784();
                    iM55979 = C0873.m55680("ۗ۬") ^ i8;
                    i = ((iM55979 ^ i7) * 7737) ^ (-1916013482);
                    i2 = -467815016;
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -1640222432:
                case 1539474960:
                    if (C1028.m56247() < 0) {
                        iM55979 = C0873.m55680("ۗ۬") ^ i8;
                        i = ((iM55979 ^ i7) * 7737) ^ (-1916013482);
                        i2 = -467815016;
                    } else {
                        iM55979 = C0946.m55979("ܶۧ") ^ i8;
                        i = ((iM55979 ^ i7) * 997) ^ 822681228;
                        i2 = 1160037888;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -1352363519:
                case -533356365:
                    int i17 = s3 + s4;
                    s = s3;
                    i3 = i15;
                    if ((i17 * i17) - (s * 18652) < 0) {
                        iM55680 = C0873.m55680("ۖۨ") ^ i8;
                        i9 = ((iM55680 ^ i7) * (-15263)) ^ 250723893;
                        i4 = -1198007641;
                    } else {
                        iM55680 = (i7 - C0873.m55680("ۗۛ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i9 = ((iM55680 ^ i8) * 32017) ^ 1497580513;
                        i4 = -918537156;
                    }
                    i10 = iM55680 ^ i4;
                    menu2 = menu;
                    i15 = i3;
                    s3 = s;
                    break;
                case -1263595517:
                case 1314809761:
                    i3 = i15;
                    s2 = sArr[c];
                    s4 = 4663;
                    if (C0890.m55740()) {
                        iM55681 = C0873.m55680("᩵ۡ") ^ i8;
                        i5 = ((iM55681 ^ i7) * 15193) ^ 441605940;
                        i6 = -2116266478;
                    } else {
                        iM55681 = (C0946.m55979("᩸ۛ") + i7) * (-95);
                        i5 = ((iM55681 ^ i8) * (-30901)) ^ 2083575117;
                        i6 = 1768670426;
                    }
                    i10 = iM55681 ^ i6;
                    i9 = i5;
                    i15 = i3;
                    s3 = s2;
                    menu2 = menu;
                    break;
                case -1258569930:
                case 347520125:
                    menuInflater.inflate(iM55682 ^ i16, menu2);
                    sArr3 = f82177;
                    i12 = 163;
                    if (C0949.f81897 < 0) {
                        iM55979 = C0946.m55979("֡ܶ") ^ i8;
                        i = ((iM55979 ^ i7) * (-30035)) ^ (-1315468773);
                        i2 = 506147362;
                        i10 = iM55979 ^ i2;
                        i9 = i;
                    } else {
                        s2 = s3;
                        i3 = i15;
                        iM55681 = (C0946.m55979("᩸ۛ") + i7) * (-95);
                        i5 = ((iM55681 ^ i8) * (-30901)) ^ 2083575117;
                        i6 = 1768670426;
                        i10 = iM55681 ^ i6;
                        i9 = i5;
                        i15 = i3;
                        s3 = s2;
                        menu2 = menu;
                    }
                    break;
                case -1100684240:
                case -1095293845:
                    drawableMutate.setTintList(textColors);
                    menuItemM56394.setIcon(drawableMutate);
                    return true;
                case -985259846:
                case -60962325:
                    drawableMutate = icon.mutate();
                    textColors = this.f40968.getTextColors();
                    if (C1194.f82045 != 0) {
                        iM55979 = C0873.m55680("ۗ۬") ^ i8;
                        i = ((iM55979 ^ i7) * 7737) ^ (-1916013482);
                        i2 = -467815016;
                        i10 = iM55979 ^ i2;
                        i9 = i;
                    } else {
                        int iM559711 = C0946.m55979("ۜ᩹") ^ i7;
                        i9 = ((iM559711 ^ i8) * 14893) ^ (-716040000);
                        i10 = iM559711 ^ 1397959546;
                    }
                    break;
                case -835245589:
                case 256010432:
                    menuInflater = getMenuInflater();
                    sArr2 = f82177;
                    i15 = DHParameters.DEFAULT_MINIMUM_LENGTH;
                    i11 = 3;
                    if (C0947.f81895) {
                        iM55979 = C0873.m55680("ۗ۬") ^ i8;
                        i = ((iM55979 ^ i7) * 7737) ^ (-1916013482);
                        i2 = -467815016;
                    } else {
                        iM55979 = C0946.m55979("֫֡") ^ i8;
                        i = ((iM55979 ^ i7) * (-16843)) ^ (-1408918346);
                        i2 = 569835200;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -775364743:
                case 1309513342:
                    menuItemM56394 = C1194.m56394(menu2, C0946.m55979(strM56462) ^ 2120311280);
                    if (C1028.f81950 <= 0) {
                        iM55979 = C0946.m55979("ܶۧ") ^ i8;
                        i = ((iM55979 ^ i7) * 997) ^ 822681228;
                        i2 = 1160037888;
                    } else {
                        iM55979 = (i7 - C0946.m55979("ۖۗ")) * 23;
                        i = ((iM55979 ^ i8) * (-14031)) ^ (-1858405743);
                        i2 = 575940342;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -761217338:
                case 611877523:
                    s = s3;
                    i3 = i15;
                    sArr = f82177;
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = (C0946.m55979("۬ܶ") + i7) * 81;
                        i9 = ((iM55680 ^ i8) * 6547) ^ (-296707369);
                        i4 = 219190519;
                    } else {
                        iM55680 = C0873.m55680("ۚ۠") ^ i7;
                        i9 = ((iM55680 ^ i8) * 6259) ^ (-1182299297);
                        i4 = 906483227;
                    }
                    i10 = iM55680 ^ i4;
                    menu2 = menu;
                    i15 = i3;
                    s3 = s;
                    break;
                case -646066728:
                case 1365833157:
                    i13 = 22886;
                    int iM559712 = C0946.m55979("ۛ֨") ^ i7;
                    i10 = iM559712 ^ (-495611206);
                    i15 = i15;
                    i9 = ((iM559712 ^ i8) * (-17959)) ^ (-864881388);
                    menu2 = menu;
                    break;
                case -617599734:
                case 1714851873:
                    s = s3;
                    i3 = i15;
                    c = 159;
                    if (!C0917.f81868) {
                        iM55680 = (C0946.m55979("ۙۜ") ^ i8) * 23;
                        i9 = ((iM55680 ^ i7) * 23017) ^ (-871195329);
                        i4 = -2108268189;
                        i10 = iM55680 ^ i4;
                        menu2 = menu;
                        i15 = i3;
                        s3 = s;
                    } else {
                        s2 = s;
                        iM55681 = (C0946.m55979("᩸ۛ") + i7) * (-95);
                        i5 = ((iM55681 ^ i8) * (-30901)) ^ 2083575117;
                        i6 = 1768670426;
                        i10 = iM55681 ^ i6;
                        i9 = i5;
                        i15 = i3;
                        s3 = s2;
                        menu2 = menu;
                    }
                    break;
                case -457800894:
                case 2143373882:
                    strM56462 = C1404.m56462(sArr3, i12, 3, i13);
                    if (C0894.f81854 >= 0) {
                        iM55979 = (i8 - C0946.m55979("ۨܳ")) * 9;
                        i = ((iM55979 ^ i7) * 25229) ^ 2045821260;
                        i2 = 1339303048;
                    } else {
                        iM55979 = C0946.m55979("ۘܿ") ^ i7;
                        i = ((iM55979 ^ i8) * (-11755)) ^ 1368395238;
                        i2 = 1023353929;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -185722607:
                case 1075611195:
                    int i18 = i15;
                    iM55682 = C0873.m55680(C1025.m56233(sArr2, i18, i11, i13));
                    if (C1046.f81962 <= 0) {
                        s = s3;
                        i16 = 2100735670;
                        i3 = i18;
                        iM55680 = (C0946.m55979("۬ܶ") + i7) * 81;
                        i9 = ((iM55680 ^ i8) * 6547) ^ (-296707369);
                        i4 = 219190519;
                        i10 = iM55680 ^ i4;
                        menu2 = menu;
                        i15 = i3;
                        s3 = s;
                    } else {
                        int iM559713 = (C0946.m55979("ۧܺ") + i7) * (-19);
                        i15 = i18;
                        i9 = ((iM559713 ^ i8) * 6367) ^ (-320108806);
                        i10 = iM559713 ^ 1886294719;
                        i16 = 2100735670;
                    }
                    break;
                case -99623163:
                case 61340806:
                    C1048.m56305();
                    if (!C0882.f81846) {
                        s2 = s3;
                        i3 = i15;
                        iM55681 = (C0946.m55979("᩸ۛ") + i7) * (-95);
                        i5 = ((iM55681 ^ i8) * (-30901)) ^ 2083575117;
                        i6 = 1768670426;
                        i10 = iM55681 ^ i6;
                        i9 = i5;
                        i15 = i3;
                        s3 = s2;
                        menu2 = menu;
                    } else {
                        iM55979 = C0873.m55680("ۗ۬") ^ i8;
                        i = ((iM55979 ^ i7) * 7737) ^ (-1916013482);
                        i2 = -467815016;
                        i10 = iM55979 ^ i2;
                        i9 = i;
                    }
                    break;
                case -78054544:
                case 331882721:
                    i13 = 57991;
                    int iM559714 = C0946.m55979("ۛ֨") ^ i7;
                    i10 = iM559714 ^ (-495611206);
                    i15 = i15;
                    i9 = ((iM559714 ^ i8) * (-17959)) ^ (-864881388);
                    menu2 = menu;
                    break;
                case 682255319:
                case 1055741946:
                    C1929.m56553();
                    if (C0863.f81833 <= 0) {
                        s = s3;
                        i3 = i15;
                        iM55680 = (C0946.m55979("۬ܶ") + i7) * 81;
                        i9 = ((iM55680 ^ i8) * 6547) ^ (-296707369);
                        i4 = 219190519;
                        i10 = iM55680 ^ i4;
                        menu2 = menu;
                        i15 = i3;
                        s3 = s;
                    } else {
                        s2 = s3;
                        i3 = i15;
                        iM55681 = (C0946.m55979("᩸ۛ") + i7) * (-95);
                        i5 = ((iM55681 ^ i8) * (-30901)) ^ 2083575117;
                        i6 = 1768670426;
                        i10 = iM55681 ^ i6;
                        i9 = i5;
                        i15 = i3;
                        s3 = s2;
                        menu2 = menu;
                    }
                    break;
                default:
                    icon = menuItemM56394.getIcon();
                    C0992.m56109(icon);
                    if (C0873.m55678()) {
                        iM55979 = (i8 - C0946.m55979("ۨܳ")) * 9;
                        i = ((iM55979 ^ i7) * 25229) ^ 2045821260;
                        i2 = 1339303048;
                    } else {
                        iM55979 = (C0873.m55680("᩹֨") + i8) * 77;
                        i = ((iM55979 ^ i7) * (-23453)) ^ 1215525024;
                        i2 = -1310833034;
                    }
                    i10 = iM55979 ^ i2;
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
        String strM41538;
        int iM55680;
        int i;
        int i2;
        C20671 c20671;
        short[] sArr;
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        int iM55681;
        int i7;
        int i8;
        DialogInterfaceOnClickListenerC11089 dialogInterfaceOnClickListenerC11089;
        C20671 c20672;
        short[] sArr2;
        int i9;
        int i10;
        String str2;
        int i11;
        int i12;
        int iM55979;
        int i13;
        ?? r7;
        boolean z;
        int iM559710;
        int i14;
        int i15;
        DialogInterfaceOnClickListenerC11089 dialogInterfaceOnClickListenerC110810;
        int i16;
        C20671 c20673;
        boolean z2;
        short[] sArr3;
        int i17;
        int i18;
        String str3;
        int i19;
        int i20;
        int iM55682;
        int i21;
        ?? r8;
        int i22;
        String str4;
        C20671 c20674;
        int i23;
        int i24;
        short[] sArr4;
        C20671 c20675;
        int iM55683;
        int i25;
        int i26;
        boolean z3;
        boolean z4;
        DialogInterfaceOnClickListenerC11089 dialogInterfaceOnClickListenerC110811;
        int i27;
        short[] sArr5;
        boolean z5;
        int i28;
        boolean z6;
        int iM55684;
        int i29;
        int i30;
        ActivityC14326 activityC14326 = this;
        int i31 = 1242644555;
        int i32 = C1124.f82007;
        int i33 = C1071.f81975;
        int iM55685 = (i33 - C0873.m55680("ܿ۠")) * (-67);
        int i34 = ((iM55685 ^ i32) * (-23219)) ^ 949027192;
        int i35 = iM55685 ^ (-528743906);
        MenuItem menuItemM55911 = null;
        C20521 c20521 = null;
        String strM56159 = null;
        DialogInterfaceOnClickListenerC11089 dialogInterfaceOnClickListenerC110812 = null;
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
        C20671 c20676 = null;
        MenuItem menuItemM55912 = null;
        String str6 = null;
        short[] sArr9 = null;
        int i50 = 0;
        int i51 = 0;
        C20671 c20677 = null;
        while (true) {
            i31 = i35 ^ (i34 & (((i31 ^ i32) * (-961)) >> 31));
            switch (i31) {
                case -1809177011:
                case 457202087:
                    i6 = i45;
                    z3 = true;
                    int iM55686 = (C0873.m55680("ۗᩳ") + i33) * (-15);
                    int i52 = ((iM55686 ^ i32) * 19625) ^ (-1544465189);
                    i35 = iM55686 ^ (-595832145);
                    z9 = z9 ? 1 : 0;
                    strM56159 = strM56159;
                    dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC110812;
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
                    dialogInterfaceOnClickListenerC110811 = dialogInterfaceOnClickListenerC110812;
                    i27 = i45;
                    z8 = z8;
                    z5 = true;
                    sArr5 = sArr8;
                    int iM55687 = C0873.m55680("ᩴᩳ") ^ i32;
                    i28 = ((iM55687 ^ i33) * 18953) ^ 1334540627;
                    i35 = iM55687 ^ 2074950654;
                    z6 = z5;
                    sArr8 = sArr5;
                    dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC110811;
                    i45 = i27;
                    i34 = i28;
                    strM56159 = strM56159;
                    z9 = z6;
                    z8 = z8;
                    break;
                case -1768335914:
                case 1747084461:
                    menuItemM55912.setEnabled(z9 ? 1 : 0);
                    return i50;
                case -1700637013:
                case 845634170:
                    dialogInterfaceOnClickListenerC11089 = dialogInterfaceOnClickListenerC110812;
                    z7 = z7 ? 1 : 0;
                    int i54 = i41;
                    c20672 = c20676;
                    z8 = z8;
                    short[] sArr10 = sArr6;
                    sArr2 = sArr7;
                    i9 = i48;
                    i10 = i49;
                    str2 = strM56159;
                    i11 = i36;
                    int i55 = i46;
                    int i56 = i47;
                    int i57 = i45;
                    sArr8 = sArr8;
                    i44 = i44;
                    i6 = i57;
                    int i58 = i42 ^ i43;
                    i12 = i54;
                    String strM56233 = C1025.m56233(f82177, 170, 3, i38);
                    if (!RunnableC0897.f81856) {
                        i46 = i55;
                        i47 = i56;
                        sArr6 = sArr10;
                        i40 = i58;
                        str5 = strM56233;
                        iM55979 = i6;
                        int iM55688 = C0873.m55680("ۢܶ") ^ i33;
                        i44 = i44;
                        i49 = i10;
                        i48 = i9;
                        i36 = i11;
                        sArr8 = sArr8;
                        dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC11089;
                        c20676 = c20672;
                        z7 = z7;
                        sArr7 = sArr2;
                        i41 = i12;
                        i45 = iM55979;
                        i35 = iM55688 ^ (-1927359767);
                        i34 = ((iM55688 ^ i32) * (-10363)) ^ 1075770008;
                        strM56159 = str2;
                        activityC14326 = this;
                        z9 = z9;
                        z8 = z8;
                    } else {
                        int iM55689 = C0873.m55680("ܿۗ") ^ i32;
                        i46 = i55;
                        i47 = i56;
                        i49 = i10;
                        sArr6 = sArr10;
                        i48 = i9;
                        i40 = i58;
                        i36 = i11;
                        strM56159 = str2;
                        dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC11089;
                        c20676 = c20672;
                        sArr7 = sArr2;
                        i41 = i12;
                        str5 = strM56233;
                        i35 = iM55689 ^ 1886444548;
                        i34 = ((iM55689 ^ i33) * (-20623)) ^ (-613187097);
                        z8 = z8;
                        z7 = z7;
                        r8 = i50;
                        activityC14326 = this;
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
                    dialogInterfaceOnClickListenerC110811 = dialogInterfaceOnClickListenerC110812;
                    z8 = z8;
                    boolean z10 = z9 ? 1 : 0;
                    menuItemM55911.setEnabled(z8);
                    i27 = i45;
                    sArr5 = sArr8;
                    menuItemM55912 = C0937.m55911(subMenu, i27);
                    if (C14976.m34318(activityC14326.f40958) != null) {
                        int iM559711 = C0946.m55979("ۤܶ") ^ i32;
                        strM56159 = strM56159;
                        i28 = ((iM559711 ^ i33) * (-881)) ^ 1640626783;
                        i35 = iM559711 ^ 2039193287;
                        z6 = z10 ? 1 : 0;
                    } else {
                        z5 = z7 ? 1 : 0;
                        int iM556810 = C0873.m55680("ᩴᩳ") ^ i32;
                        i28 = ((iM556810 ^ i33) * 18953) ^ 1334540627;
                        i35 = iM556810 ^ 2074950654;
                        z6 = z5;
                    }
                    sArr8 = sArr5;
                    dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC110811;
                    i45 = i27;
                    i34 = i28;
                    strM56159 = strM56159;
                    z9 = z6;
                    z8 = z8;
                    break;
                case -1675628036:
                case 1056886143:
                    C0906.m55817(c20677, C0946.m55979(RunnableC0938.m55936(sArr9, i51, i39, i38)) ^ 2097223692, dialogInterfaceOnClickListenerC110812);
                    if (C1194.f82045 != 0) {
                        iM55684 = C0946.m55979("ᩴۤ") ^ i33;
                        i29 = ((iM55684 ^ i32) * 15907) ^ (-1987287045);
                        i30 = -391669246;
                    } else {
                        iM55684 = C0873.m55680("᩻ܰ") ^ i33;
                        i29 = ((iM55684 ^ i32) * (-20189)) ^ 204574332;
                        i30 = 1538098236;
                    }
                    i35 = iM55684 ^ i30;
                    i34 = i29;
                    break;
                case -1656284373:
                case -1030338125:
                    sArr8 = sArr8;
                    dialogInterfaceOnClickListenerC11089 = dialogInterfaceOnClickListenerC110812;
                    z7 = z7 ? 1 : 0;
                    int i60 = i40;
                    int i61 = i41;
                    c20672 = c20676;
                    i44 = i44;
                    z8 = z8;
                    sArr2 = sArr7;
                    i9 = i48;
                    i10 = i49;
                    str2 = strM56159;
                    i11 = i36;
                    iM55979 = C0946.m55979(str5) ^ 2102042227;
                    sArr6 = f82177;
                    i46 = 173;
                    i47 = 3;
                    if (C0894.f81854 < 0) {
                        int iM559712 = C0946.m55979("᩻ܳ") ^ i33;
                        int i62 = ((iM559712 ^ i32) * (-14775)) ^ (-614875186);
                        i35 = iM559712 ^ (-947085179);
                        i44 = i44;
                        i49 = i10;
                        i40 = i60;
                        i48 = i9;
                        sArr8 = sArr8;
                        strM56159 = str2;
                        dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC11089;
                        z7 = z7 ? 1 : 0;
                        sArr7 = sArr2;
                        i45 = iM55979;
                        i41 = i61;
                        i34 = i62;
                        z8 = z8;
                        i36 = i11;
                        c20676 = c20672;
                        activityC14326 = this;
                    } else {
                        i12 = i61;
                        i40 = i60;
                        int iM556811 = C0873.m55680("ۢܶ") ^ i33;
                        i44 = i44;
                        i49 = i10;
                        i48 = i9;
                        i36 = i11;
                        sArr8 = sArr8;
                        dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC11089;
                        c20676 = c20672;
                        z7 = z7;
                        sArr7 = sArr2;
                        i41 = i12;
                        i45 = iM55979;
                        i35 = iM556811 ^ (-1927359767);
                        i34 = ((iM556811 ^ i32) * (-10363)) ^ 1075770008;
                        strM56159 = str2;
                        activityC14326 = this;
                        z9 = z9;
                        z8 = z8;
                    }
                    break;
                case -1521839298:
                case 1802957161:
                    i3 = i36;
                    dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC110812;
                    z8 = z8;
                    str = strM56159;
                    int i63 = i45;
                    sArr8 = sArr8;
                    i44 = i44;
                    i6 = i63;
                    int i64 = DialogInterfaceC2564.f4230;
                    C20671 c20678 = new C20671(activityC14326);
                    sArr7 = f82177;
                    i48 = 179;
                    i49 = 3;
                    if (C0912.f81867 <= 0) {
                        c20671 = c20678;
                        z7 = z7 ? 1 : 0;
                        i40 = i40;
                        i41 = i41;
                        sArr = sArr6;
                        i4 = i46;
                        i5 = i47;
                        int iM556812 = (C0873.m55680("֫᩸") ^ i32) * (-123);
                        i34 = ((iM556812 ^ i33) * 10073) ^ (-1829533953);
                        i8 = iM556812 ^ (-635463406);
                        i46 = i4;
                        i47 = i5;
                        sArr6 = sArr;
                        i36 = i3;
                        strM56159 = str;
                        dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC110812;
                        c20676 = c20671;
                        i41 = i41;
                        i35 = i8;
                        i40 = i40;
                        z8 = z8;
                        z7 = z7;
                        r8 = i50;
                        activityC14326 = this;
                        i50 = r8;
                        z9 = z9;
                        int i510 = i6;
                        i44 = i44;
                        sArr8 = sArr8;
                        i45 = i510;
                    } else {
                        int iM556813 = C0873.m55680("᩷ۛ") ^ i33;
                        int i65 = ((iM556813 ^ i32) * (-29645)) ^ (-1315421403);
                        i35 = iM556813 ^ (-1911993816);
                        strM56159 = str;
                        dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC110812;
                        z8 = z8;
                        c20676 = c20678;
                        i34 = i65;
                        i36 = i3;
                        i44 = i44;
                        sArr8 = sArr8;
                        i45 = i6;
                    }
                    break;
                case -1512041814:
                case -1415196483:
                    C1929.m56553();
                    iM55684 = C0873.m55680("ܺܺ") ^ i32;
                    i29 = ((iM55684 ^ i33) * 11481) ^ (-1793865679);
                    i30 = 557223764;
                    i35 = iM55684 ^ i30;
                    i34 = i29;
                    break;
                case -1464750164:
                case 1898520960:
                    dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC110812;
                    z = z8;
                    short[] sArr11 = sArr7;
                    i22 = i49;
                    str4 = strM56159;
                    c20674 = c20676;
                    i23 = i36;
                    i24 = i48;
                    int i66 = i45;
                    sArr8 = sArr8;
                    i44 = i44;
                    i6 = i66;
                    sArr4 = sArr11;
                    C1012.m56146(c20674, C0873.m55680(ViewOnClickListenerC0939.m55947(sArr11, i24, i22, i38)) ^ 2100874117);
                    if (C0873.m55678()) {
                        iM55683 = (i33 - C0946.m55979("᩷᩶")) * (-63);
                        c20675 = c20674;
                        i25 = ((iM55683 ^ i32) * 26021) ^ 1091484471;
                        i26 = 606216244;
                    } else {
                        c20675 = c20674;
                        iM55683 = C0873.m55680("᩶۫") ^ i32;
                        i25 = ((iM55683 ^ i33) * 5551) ^ 418196294;
                        i26 = -112146219;
                    }
                    i35 = iM55683 ^ i26;
                    i34 = i25;
                    i48 = i24;
                    i49 = i22;
                    i36 = i23;
                    strM56159 = str4;
                    dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC110812;
                    c20676 = c20675;
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
                    dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC110812;
                    strM56159 = ServiceConnectionC1013.m56159(activityC14326, C0873.m55680(RunnableC0938.m55936(f82177, 193, 3, i38)) ^ 2116304070, objArr);
                    if (C0906.f81862 < 0) {
                        iM55680 = C0946.m55979("ܺ᩺") ^ i32;
                        i = ((iM55680 ^ i33) * (-4499)) ^ (-279949676);
                        i2 = -1692631246;
                        i35 = iM55680 ^ i2;
                        i34 = i;
                        z9 = z9;
                        dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC110812;
                    } else {
                        z7 = z7 ? 1 : 0;
                        i40 = i40;
                        i41 = i41;
                        c20671 = c20676;
                        z8 = z8;
                        sArr = sArr6;
                        str = strM56159;
                        i3 = i36;
                        i4 = i46;
                        i5 = i47;
                        int i67 = i45;
                        sArr8 = sArr8;
                        i44 = i44;
                        i6 = i67;
                        int iM556814 = (C0873.m55680("֫᩸") ^ i32) * (-123);
                        i34 = ((iM556814 ^ i33) * 10073) ^ (-1829533953);
                        i8 = iM556814 ^ (-635463406);
                        i46 = i4;
                        i47 = i5;
                        sArr6 = sArr;
                        i36 = i3;
                        strM56159 = str;
                        dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC110812;
                        c20676 = c20671;
                        i41 = i41;
                        i35 = i8;
                        i40 = i40;
                        z8 = z8;
                        z7 = z7;
                        r8 = i50;
                        activityC14326 = this;
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
                    if (C1194.f82045 == 0) {
                        iM55684 = C0946.m55979("ᩴۤ") ^ i33;
                        i29 = ((iM55684 ^ i32) * 15907) ^ (-1987287045);
                        i30 = -391669246;
                        i35 = iM55684 ^ i30;
                        i34 = i29;
                    } else {
                        dialogInterfaceOnClickListenerC11089 = dialogInterfaceOnClickListenerC110812;
                        z7 = z7 ? 1 : 0;
                        i12 = i41;
                        c20672 = c20676;
                        iM55979 = i45;
                        z8 = z8;
                        sArr2 = sArr7;
                        i9 = i48;
                        i10 = i49;
                        sArr8 = sArr8;
                        str2 = strM56159;
                        i11 = i36;
                        i44 = i44;
                        int iM556815 = C0873.m55680("ۢܶ") ^ i33;
                        i44 = i44;
                        i49 = i10;
                        i48 = i9;
                        i36 = i11;
                        sArr8 = sArr8;
                        dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC11089;
                        c20676 = c20672;
                        z7 = z7;
                        sArr7 = sArr2;
                        i41 = i12;
                        i45 = iM55979;
                        i35 = iM556815 ^ (-1927359767);
                        i34 = ((iM556815 ^ i32) * (-10363)) ^ 1075770008;
                        strM56159 = str2;
                        activityC14326 = this;
                        z9 = z9;
                        z8 = z8;
                    }
                    break;
                case -1033388011:
                case 1995329700:
                    DialogInterfaceOnClickListenerC11089 dialogInterfaceOnClickListenerC110813 = dialogInterfaceOnClickListenerC110812;
                    i6 = i45;
                    z = z8;
                    boolean z11 = z9 ? 1 : 0;
                    sArr8 = sArr8;
                    String str7 = strM56159;
                    i44 = i44;
                    if (i44 == i6) {
                        int iM556816 = C0873.m55680("۬᩻") ^ i33;
                        i34 = ((iM556816 ^ i32) * (-31531)) ^ 1176603692;
                        i35 = iM556816 ^ 994703989;
                    } else {
                        int iM559713 = (C0946.m55979("۫ۛ") ^ i32) * (-125);
                        i35 = iM559713 ^ 2046893299;
                        i34 = ((iM559713 ^ i33) * 24967) ^ (-1173545369);
                    }
                    z4 = z11 ? 1 : 0;
                    strM56159 = str7;
                    dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC110813;
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
                    C0955.m56025();
                    C0989.m56095();
                    return false;
                case -836796878:
                case -508832292:
                    if (C1071.f81975 <= 0) {
                        dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC110812;
                        iM55680 = (i32 - C0873.m55680("ۚܿ")) * (-101);
                        i = ((iM55680 ^ i33) * 26417) ^ (-2125982312);
                        i2 = 1500709002;
                        i35 = iM55680 ^ i2;
                        i34 = i;
                        z9 = z9;
                        dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC110812;
                    } else {
                        iM55684 = C0873.m55680("ܺܺ") ^ i32;
                        i29 = ((iM55684 ^ i33) * 11481) ^ (-1793865679);
                        i30 = 557223764;
                        i35 = iM55684 ^ i30;
                        i34 = i29;
                    }
                    break;
                case -697791455:
                case 1030572189:
                    dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC110812;
                    z7 = z7 ? 1 : 0;
                    i40 = i40;
                    i41 = i41;
                    c20676 = c20676;
                    z8 = z8;
                    sArr6 = sArr6;
                    sArr7 = sArr7;
                    i48 = i48;
                    i49 = i49;
                    strM56159 = strM56159;
                    i36 = i36;
                    i46 = i46;
                    i47 = i47;
                    int i68 = i45;
                    sArr8 = sArr8;
                    i44 = i44;
                    i6 = i68;
                    short s = f82177[166];
                    if ((s * 396) - ((s * s) + 39204) <= 0) {
                        iM55681 = (C0873.m55680("ܽ֫") + i32) * 63;
                        i34 = ((iM55681 ^ i33) * (-6933)) ^ (-1348508307);
                        i7 = -1794839398;
                    } else {
                        iM55681 = C0873.m55680("۠᩻") ^ i33;
                        i34 = ((iM55681 ^ i32) * 21773) ^ (-1535483218);
                        i7 = 1831716952;
                    }
                    i8 = iM55681 ^ i7;
                    i46 = i46;
                    i47 = i47;
                    i49 = i49;
                    sArr6 = sArr6;
                    i48 = i48;
                    i36 = i36;
                    strM56159 = strM56159;
                    dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC110812;
                    c20676 = c20676;
                    sArr7 = sArr7;
                    i41 = i41;
                    i35 = i8;
                    i40 = i40;
                    z8 = z8;
                    z7 = z7;
                    r8 = i50;
                    activityC14326 = this;
                    i50 = r8;
                    z9 = z9;
                    int i514 = i6;
                    i44 = i44;
                    sArr8 = sArr8;
                    i45 = i514;
                    break;
                case -668466962:
                case 502453690:
                    dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC110812;
                    MenuItem menuItem2 = menuItemM55912;
                    boolean z12 = z9 ? 1 : 0;
                    c20521 = activityC14326.f40957;
                    if (c20521 != null) {
                        int iM556817 = C0873.m55680("۫ܽ") ^ i33;
                        menuItemM55912 = menuItem2;
                        i34 = ((iM556817 ^ i32) * (-6337)) ^ (-1718543803);
                        i35 = iM556817 ^ (-2100263279);
                        z9 = z12 ? 1 : 0;
                    } else {
                        menuItemM55912 = menuItem2;
                        int iM556818 = (i33 - C0873.m55680("ۢᩴ")) * 25;
                        i35 = iM556818 ^ (-290008921);
                        z9 = z12 ? 1 : 0;
                        i34 = ((iM556818 ^ i32) * (-5085)) ^ (-994458693);
                    }
                    dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC110812;
                    break;
                case -635987688:
                case 1900255491:
                    dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC110812;
                    int i69 = DialogInterfaceC2564.f4230;
                    c20677 = new C20671(activityC14326);
                    sArr8 = f82177;
                    i36 = 190;
                    i37 = 3;
                    if (C1124.f82007 >= 0) {
                        iM55680 = (i32 - C0873.m55680("ۚܿ")) * (-101);
                        i = ((iM55680 ^ i33) * 26417) ^ (-2125982312);
                        i2 = 1500709002;
                    } else {
                        iM55680 = (C0946.m55979("᩺ۖ") + i32) * 55;
                        i = ((iM55680 ^ i33) * 5761) ^ (-1882903594);
                        i2 = 470493103;
                    }
                    i35 = iM55680 ^ i2;
                    i34 = i;
                    z9 = z9;
                    dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC110812;
                    break;
                case -599929232:
                case -141111331:
                    C0917.m55854();
                    if (C1071.m56343() == 0) {
                        dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC110812;
                        z = z8;
                        sArr4 = sArr7;
                        i22 = i49;
                        str4 = strM56159;
                        c20674 = c20676;
                        i23 = i36;
                        i24 = i48;
                        int i70 = i45;
                        sArr8 = sArr8;
                        i44 = i44;
                        i6 = i70;
                        iM55683 = (i33 - C0946.m55979("᩷᩶")) * (-63);
                        c20675 = c20674;
                        i25 = ((iM55683 ^ i32) * 26021) ^ 1091484471;
                        i26 = 606216244;
                        i35 = iM55683 ^ i26;
                        i34 = i25;
                        i48 = i24;
                        i49 = i22;
                        i36 = i23;
                        strM56159 = str4;
                        dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC110812;
                        c20676 = c20675;
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
                        iM55684 = C0873.m55680("ۛۡ") ^ i32;
                        i29 = ((iM55684 ^ i33) * (-9923)) ^ 1755345752;
                        i30 = 1408830551;
                        i35 = iM55684 ^ i30;
                        i34 = i29;
                    }
                    break;
                case -582556359:
                case -343742822:
                    dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC110812;
                    C0861.m55627(c20677, C0946.m55979(C1025.m56233(sArr8, i36, i37, i38)) ^ 2099936782);
                    if (C0967.f81910 < 0) {
                        iM55680 = (C0873.m55680("ܰ᩻") ^ i33) * (-55);
                        i = ((iM55680 ^ i32) * (-14965)) ^ 2131773988;
                        i2 = -1417300868;
                        i35 = iM55680 ^ i2;
                        i34 = i;
                        z9 = z9;
                        dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC110812;
                    } else {
                        z = z8;
                        sArr4 = sArr7;
                        i22 = i49;
                        str4 = strM56159;
                        c20674 = c20676;
                        i23 = i36;
                        i24 = i48;
                        int i71 = i45;
                        sArr8 = sArr8;
                        i44 = i44;
                        i6 = i71;
                        iM55683 = (i33 - C0946.m55979("᩷᩶")) * (-63);
                        c20675 = c20674;
                        i25 = ((iM55683 ^ i32) * 26021) ^ 1091484471;
                        i26 = 606216244;
                        i35 = iM55683 ^ i26;
                        i34 = i25;
                        i48 = i24;
                        i49 = i22;
                        i36 = i23;
                        strM56159 = str4;
                        dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC110812;
                        c20676 = c20675;
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
                    DialogInterfaceOnClickListenerC11089 dialogInterfaceOnClickListenerC110814 = dialogInterfaceOnClickListenerC110812;
                    C20671 c20679 = c20676;
                    boolean z13 = z8;
                    short[] sArr12 = sArr6;
                    short[] sArr13 = sArr7;
                    int i72 = i48;
                    int i73 = i49;
                    String str8 = strM56159;
                    int i74 = i36;
                    int i75 = i46;
                    int i76 = i47;
                    int i77 = i45;
                    sArr8 = sArr8;
                    i44 = i44;
                    i6 = i77;
                    int iM559714 = C0946.m55979(C1003.m56132(sArr12, i75, i76, i38)) ^ 2126401159;
                    int i78 = i40;
                    if (i44 == i78) {
                        int iM559715 = (C0946.m55979("᩷۬") + i33) * (-37);
                        int i79 = ((iM559715 ^ i32) * 6463) ^ 966826405;
                        sArr6 = sArr12;
                        i46 = i75;
                        i47 = i76;
                        i49 = i73;
                        i35 = iM559715 ^ (-1799238199);
                        i48 = i72;
                        i36 = i74;
                        strM56159 = str8;
                        dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC110814;
                        c20676 = c20679;
                        sArr7 = sArr13;
                        activityC14326 = this;
                        i41 = iM559714;
                        i40 = i78;
                        i34 = i79;
                        z8 = z13;
                        z7 = false;
                        i50 = 1;
                        z9 = z9;
                    } else {
                        int iM559716 = (C0946.m55979("֡᩻") + i32) * (-119);
                        i13 = ((iM559716 ^ i33) * (-4197)) ^ 1734458304;
                        i46 = i75;
                        i47 = i76;
                        i49 = i73;
                        i35 = iM559716 ^ (-1671609398);
                        sArr6 = sArr12;
                        i48 = i72;
                        i36 = i74;
                        strM56159 = str8;
                        dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC110814;
                        c20676 = c20679;
                        sArr7 = sArr13;
                        r7 = 1;
                        i41 = iM559714;
                        i40 = i78;
                        z8 = z13;
                        z7 = false;
                        i34 = i13;
                        r8 = r7;
                        activityC14326 = this;
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
                    AbstractC0942.m55971();
                    if (C1044.m56286() > 0) {
                        dialogInterfaceOnClickListenerC11089 = dialogInterfaceOnClickListenerC110812;
                        z7 = z7 ? 1 : 0;
                        i12 = i41;
                        c20672 = c20676;
                        iM55979 = i45;
                        z8 = z8;
                        sArr2 = sArr7;
                        i9 = i48;
                        i10 = i49;
                        sArr8 = sArr8;
                        str2 = strM56159;
                        i11 = i36;
                        i44 = i44;
                        int iM556819 = C0873.m55680("ۢܶ") ^ i33;
                        i44 = i44;
                        i49 = i10;
                        i48 = i9;
                        i36 = i11;
                        sArr8 = sArr8;
                        dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC11089;
                        c20676 = c20672;
                        z7 = z7;
                        sArr7 = sArr2;
                        i41 = i12;
                        i45 = iM55979;
                        i35 = iM556819 ^ (-1927359767);
                        i34 = ((iM556819 ^ i32) * (-10363)) ^ 1075770008;
                        strM56159 = str2;
                        activityC14326 = this;
                        z9 = z9;
                        z8 = z8;
                    } else {
                        iM55684 = C0873.m55680("ܺܺ") ^ i32;
                        i29 = ((iM55684 ^ i33) * 11481) ^ (-1793865679);
                        i30 = 557223764;
                        i35 = iM55684 ^ i30;
                        i34 = i29;
                    }
                    break;
                case -224331970:
                case 2043298811:
                    dialogInterfaceOnClickListenerC110810 = dialogInterfaceOnClickListenerC110812;
                    i16 = i41;
                    c20673 = c20676;
                    z2 = z8;
                    sArr3 = sArr7;
                    i17 = i48;
                    i18 = i49;
                    str3 = strM56159;
                    i19 = i36;
                    int i80 = i45;
                    sArr8 = sArr8;
                    i44 = i44;
                    i6 = i80;
                    SubMenu subMenu2 = menuItem.getSubMenu();
                    C0992.m56109(subMenu2);
                    menuItemM55911 = C0937.m55911(subMenu2, i16);
                    if (activityC14326.f40957 == null) {
                        int iM559717 = (C0946.m55979("ۤ۟") + i32) * 35;
                        i20 = ((iM559717 ^ i33) * (-3685)) ^ 1074541649;
                        i35 = iM559717 ^ 1813287832;
                        activityC14326 = this;
                        subMenu = subMenu2;
                        i49 = i18;
                        i48 = i17;
                        strM56159 = str3;
                        dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC110810;
                        sArr7 = sArr3;
                        i41 = i16;
                        i34 = i20;
                        z8 = z2;
                        i36 = i19;
                        c20676 = c20673;
                        i50 = i50;
                        z9 = z9;
                        int i518 = i6;
                        i44 = i44;
                        sArr8 = sArr8;
                        i45 = i518;
                    } else {
                        int iM559718 = C0946.m55979("ۗ֨") ^ i33;
                        i13 = ((iM559718 ^ i32) * 13841) ^ (-1678056852);
                        i35 = iM559718 ^ 1039883990;
                        subMenu = subMenu2;
                        i49 = i18;
                        i48 = i17;
                        i36 = i19;
                        strM56159 = str3;
                        dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC110810;
                        c20676 = c20673;
                        sArr7 = sArr3;
                        i41 = i16;
                        z8 = z2;
                        r7 = i50;
                        i34 = i13;
                        r8 = r7;
                        activityC14326 = this;
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
                    iM55681 = C0946.m55979("ۖ᩹") ^ i33;
                    i34 = ((iM55681 ^ i32) * (-8097)) ^ 699238619;
                    i7 = 1078536191;
                    i8 = iM55681 ^ i7;
                    i46 = i46;
                    i47 = i47;
                    i49 = i49;
                    sArr6 = sArr6;
                    i48 = i48;
                    i36 = i36;
                    strM56159 = strM56159;
                    dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC110812;
                    c20676 = c20676;
                    sArr7 = sArr7;
                    i41 = i41;
                    i35 = i8;
                    i40 = i40;
                    z8 = z8;
                    z7 = z7;
                    r8 = i50;
                    activityC14326 = this;
                    i50 = r8;
                    z9 = z9;
                    int i5110 = i6;
                    i44 = i44;
                    sArr8 = sArr8;
                    i45 = i5110;
                    break;
                case -17327281:
                case 342152119:
                    C20671 c206710 = c20676;
                    C1017.m56182(c206710, activityC14326.f40958);
                    TextView textView = (TextView) RunnableC0871.m55669(c206710).m3846(R.id.message);
                    C21272.m48055(textView);
                    C1048.m56304(textView, new ViewOnClickListenerC22284());
                    return i50;
                case 45286190:
                case 1110810637:
                    i6 = i45;
                    z3 = false;
                    int iM556820 = (C0873.m55680("ۗᩳ") + i33) * (-15);
                    int i520 = ((iM556820 ^ i32) * 19625) ^ (-1544465189);
                    i35 = iM556820 ^ (-595832145);
                    z9 = z9 ? 1 : 0;
                    strM56159 = strM56159;
                    dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC110812;
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
                    C0967.m56076(c20677, C0873.m55680(C0890.m55726(f82177, 199, 3, i38)) ^ 2121216131, null);
                    C1025.m56221(c20677);
                    return i50;
                case 321121746:
                case 1369993062:
                    return z7;
                case 396464940:
                case 1555478421:
                    AbstractC0942.m55971();
                    if (C0894.m55769() >= 0) {
                        iM55684 = C0873.m55680("ܺܺ") ^ i32;
                        i29 = ((iM55684 ^ i33) * 11481) ^ (-1793865679);
                        i30 = 557223764;
                    } else {
                        iM55684 = C0873.m55680("ۛۡ") ^ i32;
                        i29 = ((iM55684 ^ i33) * (-9923)) ^ 1755345752;
                        i30 = 1408830551;
                    }
                    i35 = iM55684 ^ i30;
                    i34 = i29;
                    break;
                case 637275945:
                case 1173835820:
                    String str9 = activityC14326.f40958;
                    Intent intent = new Intent(activityC14326, (Class<?>) ActivityC3597.class);
                    C0917.m55843(intent, C0898.m55792(f82177, 182, 8, i38), str9);
                    C1044.m56284(activityC14326, intent);
                    return i50;
                case 653755801:
                case 1011588985:
                    C18249 c18249M34318 = C14976.m34318(activityC14326.f40958);
                    C0992.m56109(c18249M34318);
                    strM41538 = c18249M34318.m41538();
                    str6 = strM41538;
                    iM55680 = (C0873.m55680("ܳۧ") + i32) * 55;
                    i = ((iM55680 ^ i33) * (-25679)) ^ (-590121162);
                    i2 = -2041906690;
                    i35 = iM55680 ^ i2;
                    i34 = i;
                    z9 = z9;
                    dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC110812;
                    break;
                case 660588691:
                case 1891228144:
                    DialogInterfaceOnClickListenerC11089 dialogInterfaceOnClickListenerC110815 = dialogInterfaceOnClickListenerC110812;
                    int i81 = i41;
                    C20671 c206711 = c20676;
                    z = z8;
                    short[] sArr14 = sArr7;
                    int i82 = i48;
                    int i83 = i49;
                    String str10 = strM56159;
                    int i84 = i36;
                    int i85 = i45;
                    sArr8 = sArr8;
                    i44 = i44;
                    i6 = i85;
                    if (i44 == (C0873.m55680(C0890.m55726(f82177, PicnicEngine.MAX_AUX_BYTES, 3, i38)) ^ 2097740890)) {
                        iM559710 = (C0946.m55979("ۢ۫") + i33) * 29;
                        i14 = ((iM559710 ^ i32) * (-4125)) ^ (-1324915487);
                        i15 = -970218693;
                    } else {
                        iM559710 = C0946.m55979("ۢ۬") ^ i32;
                        i14 = ((iM559710 ^ i33) * 15663) ^ (-1190387314);
                        i15 = -733133811;
                    }
                    i35 = iM559710 ^ i15;
                    activityC14326 = this;
                    i49 = i83;
                    i48 = i82;
                    i36 = i84;
                    dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC110815;
                    c20676 = c206711;
                    sArr7 = sArr14;
                    i41 = i81;
                    i34 = i14;
                    strM56159 = str10;
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
                    iM55681 = C0946.m55979("ۖ᩹") ^ i33;
                    i34 = ((iM55681 ^ i32) * (-8097)) ^ 699238619;
                    i7 = 1078536191;
                    i8 = iM55681 ^ i7;
                    i46 = i46;
                    i47 = i47;
                    i49 = i49;
                    sArr6 = sArr6;
                    i48 = i48;
                    i36 = i36;
                    strM56159 = strM56159;
                    dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC110812;
                    c20676 = c20676;
                    sArr7 = sArr7;
                    i41 = i41;
                    i35 = i8;
                    i40 = i40;
                    z8 = z8;
                    z7 = z7;
                    r8 = i50;
                    activityC14326 = this;
                    i50 = r8;
                    z9 = z9;
                    int i5113 = i6;
                    i44 = i44;
                    sArr8 = sArr8;
                    i45 = i5113;
                    break;
                case 964343824:
                case 1132434957:
                    dialogInterfaceOnClickListenerC110810 = dialogInterfaceOnClickListenerC110812;
                    i16 = i41;
                    c20673 = c20676;
                    z2 = z8;
                    sArr3 = sArr7;
                    i18 = i49;
                    str3 = strM56159;
                    i19 = i36;
                    i17 = i48;
                    int i86 = i45;
                    sArr8 = sArr8;
                    i44 = i44;
                    i6 = i86;
                    if (i44 == i16) {
                        iM55682 = C0946.m55979("۠᩸") ^ i33;
                        i20 = ((iM55682 ^ i32) * 21839) ^ 837312932;
                        i21 = 1665950068;
                    } else {
                        iM55682 = C0873.m55680("᩷ᩳ") ^ i32;
                        i20 = ((iM55682 ^ i33) * 12653) ^ (-1738147234);
                        i21 = 794013342;
                    }
                    i35 = iM55682 ^ i21;
                    i49 = i18;
                    i48 = i17;
                    strM56159 = str3;
                    dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC110810;
                    sArr7 = sArr3;
                    i41 = i16;
                    i34 = i20;
                    z8 = z2;
                    i36 = i19;
                    c20676 = c20673;
                    i50 = i50;
                    z9 = z9;
                    int i5114 = i6;
                    i44 = i44;
                    sArr8 = sArr8;
                    i45 = i5114;
                    break;
                case 1233409291:
                case 1727141724:
                    dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC110812;
                    z7 = z7 ? 1 : 0;
                    i40 = i40;
                    i41 = i41;
                    c20671 = c20676;
                    i6 = i45;
                    z8 = z8;
                    sArr = sArr6;
                    short[] sArr15 = sArr7;
                    int i87 = i48;
                    int i88 = i49;
                    sArr8 = sArr8;
                    str = strM56159;
                    i3 = i36;
                    i4 = i46;
                    i5 = i47;
                    int iM55998 = C0947.m55998(menuItem);
                    int iM559719 = C0946.m55979(C0882.m55717(f82177, 167, 3, i38));
                    i43 = 2123894359;
                    if (C1012.f81938 < 0) {
                        int iM556821 = C0873.m55680("ۧۗ") ^ i32;
                        i46 = i4;
                        i47 = i5;
                        i49 = i88;
                        sArr6 = sArr;
                        i48 = i87;
                        i36 = i3;
                        strM56159 = str;
                        dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC110812;
                        c20676 = c20671;
                        sArr7 = sArr15;
                        i41 = i41;
                        i35 = iM556821 ^ 2006297132;
                        i34 = ((iM556821 ^ i33) * 7201) ^ 940909558;
                        i40 = i40;
                        z8 = z8;
                        sArr8 = sArr8;
                        z7 = z7 ? 1 : 0;
                        i45 = i6;
                        i44 = iM55998;
                        i42 = iM559719;
                        activityC14326 = this;
                    } else {
                        i49 = i88;
                        i48 = i87;
                        i44 = iM55998;
                        sArr7 = sArr15;
                        i42 = iM559719;
                        int iM5568110 = (C0873.m55680("֫᩸") ^ i32) * (-123);
                        i34 = ((iM5568110 ^ i33) * 10073) ^ (-1829533953);
                        i8 = iM5568110 ^ (-635463406);
                        i46 = i4;
                        i47 = i5;
                        sArr6 = sArr;
                        i36 = i3;
                        strM56159 = str;
                        dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC110812;
                        c20676 = c20671;
                        i41 = i41;
                        i35 = i8;
                        i40 = i40;
                        z8 = z8;
                        z7 = z7;
                        r8 = i50;
                        activityC14326 = this;
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
                    C1017.m56182(c20677, strM56159);
                    dialogInterfaceOnClickListenerC110812 = new DialogInterfaceOnClickListenerC11089(activityC14326, i50);
                    sArr9 = f82177;
                    i51 = 196;
                    i39 = 3;
                    if (C1025.m56230()) {
                        iM55684 = C0873.m55680("ۛۡ") ^ i32;
                        i29 = ((iM55684 ^ i33) * (-9923)) ^ 1755345752;
                        i30 = 1408830551;
                    } else {
                        iM55684 = C0873.m55680("ۡۘ") ^ i33;
                        i29 = ((iM55684 ^ i32) * 21223) ^ 744561923;
                        i30 = 407228328;
                    }
                    i35 = iM55684 ^ i30;
                    i34 = i29;
                    break;
                default:
                    strM41538 = c20521.m46298();
                    str6 = strM41538;
                    iM55680 = (C0873.m55680("ܳۧ") + i32) * 55;
                    i = ((iM55680 ^ i33) * (-25679)) ^ (-590121162);
                    i2 = -2041906690;
                    i35 = iM55680 ^ i2;
                    i34 = i;
                    z9 = z9;
                    dialogInterfaceOnClickListenerC110812 = dialogInterfaceOnClickListenerC110812;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֨ */
    public static void m32897(ActivityC14326 activityC14326) {
        C10748 c10748 = null;
        int i = 1455493972;
        int i2 = C0898.f81858;
        int i3 = C1071.f81975;
        int iM55979 = C0946.m55979("ۜ֨") ^ i2;
        int i4 = ((iM55979 ^ i3) * (-32389)) ^ (-136854772);
        int i5 = -2029925318;
        while (true) {
            i = ((((i ^ i3) * 27497) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2028986878:
                case 133289787:
                    if (C1964.m56597() != 0) {
                        iM55979 = C0946.m55979("֫᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-3167)) ^ (-580753909);
                        i5 = -1189543053;
                    } else {
                        iM55979 = C0946.m55979("ܶᩴ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 16113) ^ (-791136754);
                        i5 = 503849523;
                    }
                    break;
                case -1906493331:
                case -353310179:
                    C0912.m55833();
                    break;
                case -1776702258:
                case -69356659:
                    C1404.m56468();
                    if (C1124.f82007 >= 0) {
                        iM55979 = C0946.m55979("֫᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-3167)) ^ (-580753909);
                        i5 = -1189543053;
                    } else {
                        iM55979 = C0873.m55680("ۛۜ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 14469) ^ (-1410405635);
                        i5 = -2032540476;
                    }
                    break;
                case -1694886645:
                case 2064420670:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = (C0946.m55979("ܺۡ") ^ i2) * (-111);
                        i4 = ((iM55979 ^ i3) * 29595) ^ 1713434888;
                        i5 = -1359702244;
                    } else {
                        iM55979 = (i3 - C0873.m55680("᩵᩶")) * (-99);
                        i4 = ((iM55979 ^ i2) * (-3337)) ^ 1357781253;
                        i5 = 1102567888;
                    }
                    break;
                case -1616767074:
                case -1552787248:
                    C0863.m55643();
                    iM55979 = C0873.m55680("ۛۜ") ^ i2;
                    i4 = ((iM55979 ^ i3) * 14469) ^ (-1410405635);
                    i5 = -2032540476;
                    break;
                case -1435535352:
                case 253492431:
                    break;
                case -1208703474:
                case -526988413:
                    if (!C0917.f81868) {
                        iM55979 = C0873.m55680("ۛۜ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 14469) ^ (-1410405635);
                        i5 = -2032540476;
                    } else {
                        iM55979 = (C0946.m55979("᩻ۗ") + i3) * (-57);
                        i4 = ((iM55979 ^ i2) * (-26299)) ^ 628020255;
                        i5 = -1532057111;
                    }
                    break;
                case -1095644661:
                case 1192730067:
                    if (C0989.m56095() <= 0) {
                        iM55979 = (C0946.m55979("ܺۡ") ^ i2) * (-111);
                        i4 = ((iM55979 ^ i3) * 29595) ^ 1713434888;
                        i5 = -1359702244;
                    } else {
                        iM55979 = (C0873.m55680("ۖۤ") + i3) * 75;
                        i4 = ((iM55979 ^ i2) * 20063) ^ (-1148774825);
                        i5 = 1589349281;
                    }
                    break;
                case -1002086497:
                case 1262398677:
                    if (C0912.f81867 <= 0) {
                        iM55979 = C0946.m55979("֫᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-3167)) ^ (-580753909);
                        i5 = -1189543053;
                    } else {
                        iM55979 = C0873.m55680("ܳۙ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 9185) ^ 1329786190;
                        i5 = -655834717;
                    }
                    break;
                case -820964490:
                case 1406005494:
                    C20521 c20521 = activityC14326.f40957;
                    if (C0906.m55809() <= 0) {
                        iM55979 = (C0946.m55979("᩻ۗ") + i3) * (-57);
                        i4 = ((iM55979 ^ i2) * (-26299)) ^ 628020255;
                        i5 = -1532057111;
                    } else {
                        int i6 = 2;
                        if (C0946.m55980() != 0) {
                            iM55979 = C0946.m55979("᩹ۜ") ^ i2;
                            i4 = ((iM55979 ^ i3) * (-6349)) ^ 1498797895;
                            i5 = -507666839;
                        } else {
                            m32900(activityC14326, c20521, new RunnableC3319(i6, activityC14326));
                            iM55979 = (C0873.m55680("ܽۖ") + i2) * 43;
                            i4 = ((iM55979 ^ i3) * (-23347)) ^ (-1932475416);
                            i5 = -1002742493;
                        }
                    }
                    break;
                case -573085565:
                case -88105199:
                    if (C0898.f81858 <= 0) {
                        iM55979 = C0873.m55680("ۛۜ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 14469) ^ (-1410405635);
                        i5 = -2032540476;
                    } else {
                        iM55979 = C0873.m55680("᩶ܿ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-26781)) ^ (-442779069);
                        i5 = 852485810;
                    }
                    break;
                case -382033374:
                case -194053164:
                    RunnableC0938.m55938();
                    if (C0949.f81897 >= 0) {
                        iM55979 = (C0946.m55979("ܺۡ") ^ i2) * (-111);
                        i4 = ((iM55979 ^ i3) * 29595) ^ 1713434888;
                        i5 = -1359702244;
                    } else {
                        iM55979 = C0873.m55680("ۛۜ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 14469) ^ (-1410405635);
                        i5 = -2032540476;
                    }
                    break;
                case -98287259:
                case -28051099:
                    if (C1012.f81938 >= 0) {
                        iM55979 = (C0946.m55979("ܺۡ") ^ i2) * (-111);
                        i4 = ((iM55979 ^ i3) * 29595) ^ 1713434888;
                        i5 = -1359702244;
                    } else {
                        iM55979 = C0946.m55979("۫ܽ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-26149)) ^ 308986508;
                        i5 = -603677597;
                    }
                    break;
                case 356348317:
                case 378330117:
                    if (C0861.f81831) {
                        iM55979 = (i2 - C0946.m55979("ܶܰ")) * (-57);
                        i4 = ((iM55979 ^ i3) * (-15027)) ^ 1874280048;
                        i5 = 1374883639;
                    } else {
                        iM55979 = C0946.m55979("֫᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-3167)) ^ (-580753909);
                        i5 = -1189543053;
                    }
                    break;
                case 930598483:
                case 977853171:
                    if (c10748.m24761()) {
                        iM55979 = C0946.m55979("ᩴ᩵") ^ i3;
                        i4 = ((iM55979 ^ i2) * 18197) ^ 69439165;
                        i5 = 1970626743;
                    } else {
                        iM55979 = (C0873.m55680("ܽۖ") + i2) * 43;
                        i4 = ((iM55979 ^ i3) * (-23347)) ^ (-1932475416);
                        i5 = -1002742493;
                    }
                    break;
                default:
                    c10748 = activityC14326.f40961;
                    if (C0873.m55678()) {
                        iM55979 = C0873.m55680("ۛۜ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 14469) ^ (-1410405635);
                        i5 = -2032540476;
                    } else {
                        iM55979 = (C0946.m55979("ܳ֡") ^ i2) * 35;
                        i4 = ((iM55979 ^ i3) * 23655) ^ (-93873653);
                        i5 = 1361544940;
                    }
                    break;
            }
            return;
        }
    }
}
