package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.mt.plus.Main;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import moe.shizuku.server.IShizukuService;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.digests.WhirlpoolDigest;
import org.bouncycastle.math.Primes;
import org.bouncycastle.math.ec.rfc8032.Scalar25519;

/* JADX INFO: renamed from: l.᩵ܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05ZQ */
/* JADX INFO: loaded from: classes.dex */
public final class C19568 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f63245 = 0;

    /* JADX INFO: renamed from: ۛۜۜ, reason: not valid java name and contains not printable characters */
    private static final short[] f63246;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static String f63247;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final HashSet f63248;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final byte[] f63249;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final ExecutorService f63250;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final byte[] f63251;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final byte[] f63252;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static String f63253;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static native void m45012(C16560 c16560, InterfaceC17889 interfaceC17889);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static native void m45014(C16560 c16560, AbstractC15440 abstractC15440);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static native void m45016(C16560 c16560, AbstractC15440 abstractC15440);

    /* JADX WARN: Code duplicated, block: B:72:0x026c A[PHI: r10 r11 r16
      0x026c: PHI (r10v2 short[]) = (r10v1 short[]), (r10v1 short[]), (r10v1 short[]), (r10v3 short[]) binds: [B:15:0x0050, B:71:0x026a, B:67:0x024b, B:40:0x0124] A[DONT_GENERATE, DONT_INLINE]
      0x026c: PHI (r11v2 int) = (r11v1 int), (r11v1 int), (r11v1 int), (r11v3 int) binds: [B:15:0x0050, B:71:0x026a, B:67:0x024b, B:40:0x0124] A[DONT_GENERATE, DONT_INLINE]
      0x026c: PHI (r16v2 boolean) = (r16v1 boolean), (r16v1 boolean), (r16v1 boolean), (r16v3 boolean) binds: [B:15:0x0050, B:71:0x026a, B:67:0x024b, B:40:0x0124] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02a3 A[PHI: r7
      0x02a3: PHI (r7v2 short) = (r7v1 short), (r7v3 short) binds: [B:75:0x02a1, B:59:0x0209] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x02d7 A[PHI: r8
      0x02d7: PHI (r8v5 int) = (r8v1 int), (r8v2 int), (r8v1 int) binds: [B:79:0x02d5, B:55:0x01e8, B:10:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x0329 A[PHI: r6
      0x0329: PHI (r6v3 short[]) = (r6v1 short[]), (r6v1 short[]), (r6v2 short[]), (r6v1 short[]) binds: [B:87:0x0327, B:83:0x0307, B:63:0x022a, B:11:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44999(Intent intent, Class cls, AbstractC16891 abstractC16891) {
        int iM2566;
        int i;
        int i2;
        int iM2567;
        int i3;
        Intent intent2 = intent;
        String strM6311 = null;
        String strM24406 = null;
        String strM24407 = null;
        short[] sArr = null;
        short s = 0;
        int i4 = 0;
        int i5 = 0;
        short[] sArr2 = null;
        int i6 = 0;
        int i7 = 573476146;
        int i8 = C3911.f12484;
        int i9 = C1128.f4106;
        int iM2568 = (C0630.m2566("ܺ᩸") + i9) * (-27);
        int i10 = ((iM2568 ^ i8) * (-32127)) ^ 1766092754;
        int i11 = iM2568 ^ (-624998699);
        boolean z = false;
        while (true) {
            i7 = i11 ^ (i10 & (((i7 ^ i8) * 12375) >> 31));
            switch (i7) {
                case -2115917713:
                case 707737739:
                    strM24407 = C9523.m24406(((C5168) abstractC16891).m14826());
                    if (strM24407 == null) {
                        iM2567 = C2105.m6981("᩸᩹") ^ i8;
                        i10 = ((iM2567 ^ i9) * 28819) ^ 318466615;
                        i3 = -1030065478;
                        i11 = iM2567 ^ i3;
                        intent2 = intent;
                    } else {
                        iM2566 = C0630.m2566("ۙۗ") ^ i8;
                        i = ((iM2566 ^ i9) * (-27031)) ^ (-910037994);
                        i2 = 754111898;
                        int i12 = i;
                        i11 = iM2566 ^ i2;
                        i10 = i12;
                    }
                    break;
                case -1928582473:
                case 1241253351:
                    C1916.m6308();
                    C2958.m9034();
                    break;
                case -1778522287:
                case -1057481898:
                    strM24406 = C9523.m24406(((C10738) abstractC16891).m26937());
                    if (strM24406 == null) {
                        iM2567 = C2105.m6981("᩸᩹") ^ i8;
                        i10 = ((iM2567 ^ i9) * 28819) ^ 318466615;
                        i3 = -1030065478;
                        i11 = iM2567 ^ i3;
                        intent2 = intent;
                    } else {
                        iM2566 = (C2105.m6981("ۜۗ") + i9) * 115;
                        i = ((iM2566 ^ i8) * (-2877)) ^ 1664514616;
                        i2 = -1704715920;
                        int i13 = i;
                        i11 = iM2566 ^ i2;
                        i10 = i13;
                    }
                    break;
                case -1678490113:
                case 621481046:
                    s = sArr[170];
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2567 = (C2105.m6981("ᩳܺ") + i9) * (-95);
                        i10 = ((iM2567 ^ i8) * (-26391)) ^ (-2059337150);
                        i3 = 960387937;
                    } else {
                        iM2567 = (C2105.m6981("᩻ۘ") ^ i8) * (-89);
                        i10 = ((iM2567 ^ i9) * 41) ^ 586501485;
                        i3 = 341817998;
                    }
                    i11 = iM2567 ^ i3;
                    intent2 = intent;
                    break;
                case -1471542762:
                case 1642667179:
                    i4 = (s * s) + 119661721;
                    if (C2167.f7158 >= 0) {
                        iM2567 = C2105.m6981("ܿۗ") ^ i8;
                        i10 = ((iM2567 ^ i9) * 28077) ^ (-747260923);
                        i3 = -1530725936;
                    } else {
                        iM2567 = C2105.m6981("ܿۘ") ^ i8;
                        i10 = ((iM2567 ^ i9) * 16559) ^ 1084310177;
                        i3 = 635374976;
                    }
                    i11 = iM2567 ^ i3;
                    intent2 = intent;
                    break;
                case -1326264301:
                case -1045569721:
                    if (C3245.f10203 <= 0) {
                        iM2567 = (i8 - C2105.m6981("ۚۛ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i10 = ((iM2567 ^ i9) * (-12667)) ^ (-1198860699);
                        i3 = 1324565835;
                    } else {
                        iM2567 = (C0630.m2566("ۨۘ") ^ i8) * (-59);
                        i10 = ((iM2567 ^ i9) * 30677) ^ 930132425;
                        i3 = -1108940151;
                    }
                    i11 = iM2567 ^ i3;
                    intent2 = intent;
                    break;
                case -1265734912:
                case -332506671:
                    i5 = 16840;
                    iM2567 = (i9 - C0630.m2566("ۚ᩺")) * 75;
                    i10 = ((iM2567 ^ i8) * (-4251)) ^ (-1476018083);
                    i3 = -1070062341;
                    i11 = iM2567 ^ i3;
                    intent2 = intent;
                    break;
                case -1191059588:
                case -904845167:
                    C3663.m11172(intent2, strM6311, strM24407);
                    iM2567 = C2105.m6981("᩸᩹") ^ i8;
                    i10 = ((iM2567 ^ i9) * 28819) ^ 318466615;
                    i3 = -1030065478;
                    i11 = iM2567 ^ i3;
                    intent2 = intent;
                    break;
                case -1102024957:
                case -85979425:
                    if (cls == ActivityC16315.class) {
                        int iM6981 = (i9 - C2105.m6981("ܽ۬")) * (-115);
                        i11 = iM6981 ^ (-217694501);
                        i10 = ((iM6981 ^ i8) * 10263) ^ 963970815;
                    } else {
                        iM2567 = C2105.m6981("᩸᩹") ^ i8;
                        i10 = ((iM2567 ^ i9) * 28819) ^ 318466615;
                        i3 = -1030065478;
                        i11 = iM2567 ^ i3;
                    }
                    intent2 = intent;
                    break;
                case -1019425556:
                case 1761887313:
                    if (i4 - (s * 21878) < 0) {
                        iM2567 = (C2105.m6981("᩷ܺ") ^ i8) * 37;
                        i10 = ((iM2567 ^ i9) * 10981) ^ (-611164913);
                        i3 = -353755058;
                    } else {
                        iM2567 = (C2105.m6981("ۢۨ") + i9) * 119;
                        i10 = ((iM2567 ^ i8) * 1677) ^ 24093872;
                        i3 = -34107979;
                    }
                    i11 = iM2567 ^ i3;
                    intent2 = intent;
                    break;
                case -1018723253:
                case 2022845330:
                    if (C0964.m3413()) {
                        iM2567 = (i8 - C0630.m2566("᩸ۜ")) * (-81);
                        i10 = ((iM2567 ^ i9) * 22043) ^ 386808384;
                        i3 = 688397895;
                    } else {
                        iM2567 = (i9 - C2105.m6981("۠ܽ")) * 95;
                        i10 = ((iM2567 ^ i8) * 7475) ^ 1734855627;
                        i3 = 1325650482;
                    }
                    i11 = iM2567 ^ i3;
                    intent2 = intent;
                    break;
                case -1011024400:
                case -977791784:
                    sArr = f63246;
                    if (RunnableC1937.f6483 >= 0) {
                        iM2567 = (i9 - C2105.m6981("۠ܽ")) * 95;
                        i10 = ((iM2567 ^ i8) * 7475) ^ 1734855627;
                        i3 = 1325650482;
                    } else {
                        iM2567 = (C2105.m6981("᩶ۗ") ^ i9) * 7;
                        i10 = ((iM2567 ^ i8) * 4205) ^ (-360574421);
                        i3 = 515483145;
                    }
                    i11 = iM2567 ^ i3;
                    intent2 = intent;
                    break;
                case -898057083:
                case 339251902:
                    if (!(abstractC16891 instanceof C5168)) {
                        iM2567 = C2105.m6981("᩸᩹") ^ i8;
                        i10 = ((iM2567 ^ i9) * 28819) ^ 318466615;
                        i3 = -1030065478;
                        i11 = iM2567 ^ i3;
                        intent2 = intent;
                    } else {
                        iM2566 = (i9 - C0630.m2566("ܺ᩻")) * (-55);
                        i = ((iM2566 ^ i8) * (-9105)) ^ 467418706;
                        i2 = 32972084;
                        int i14 = i;
                        i11 = iM2566 ^ i2;
                        i10 = i14;
                    }
                    break;
                case -832175145:
                case 618159382:
                    C2126.m7040();
                    iM2566 = (i9 - C2105.m6981("᩹ۤ")) * (-31);
                    i = ((iM2566 ^ i8) * (-10457)) ^ (-1231874584);
                    i2 = -1315225222;
                    int i15 = i;
                    i11 = iM2566 ^ i2;
                    i10 = i15;
                    break;
                case -776735571:
                case 1897836915:
                    if (C2105.m6982() != 0) {
                        iM2567 = (C2105.m6981("ᩳܺ") + i9) * (-95);
                        i10 = ((iM2567 ^ i8) * (-26391)) ^ (-2059337150);
                        i3 = 960387937;
                    } else {
                        iM2567 = C0630.m2566("ۖᩴ") ^ i9;
                        i10 = ((iM2567 ^ i8) * 22627) ^ (-1876604675);
                        i3 = -920045871;
                    }
                    i11 = iM2567 ^ i3;
                    intent2 = intent;
                    break;
                case -634477640:
                case -107445195:
                    if (C7106.m19120() <= 0) {
                        iM2567 = (i9 - C2105.m6981("۠ܽ")) * 95;
                        i10 = ((iM2567 ^ i8) * 7475) ^ 1734855627;
                        i3 = 1325650482;
                    } else {
                        iM2567 = (i9 - C2105.m6981("۠ܳ")) * 41;
                        i10 = ((iM2567 ^ i8) * (-15167)) ^ 2042367807;
                        i3 = 783243460;
                    }
                    i11 = iM2567 ^ i3;
                    intent2 = intent;
                    break;
                case -622726599:
                case 1109473469:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2567 = (i8 - C2105.m6981("ۚۛ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i10 = ((iM2567 ^ i9) * (-12667)) ^ (-1198860699);
                        i3 = 1324565835;
                        i11 = iM2567 ^ i3;
                        intent2 = intent;
                    } else {
                        iM2566 = (i9 - C2105.m6981("᩹ۤ")) * (-31);
                        i = ((iM2566 ^ i8) * (-10457)) ^ (-1231874584);
                        i2 = -1315225222;
                        int i16 = i;
                        i11 = iM2566 ^ i2;
                        i10 = i16;
                    }
                    break;
                case -568436866:
                case 2137848145:
                    boolean z2 = abstractC16891 instanceof C10738;
                    sArr2 = f63246;
                    if (C4117.f13076 <= 0) {
                        z = z2;
                        i6 = 171;
                        iM2567 = (i8 - C2105.m6981("ۚۛ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i10 = ((iM2567 ^ i9) * (-12667)) ^ (-1198860699);
                        i3 = 1324565835;
                        i11 = iM2567 ^ i3;
                        intent2 = intent;
                    } else {
                        int iM2569 = (C0630.m2566("ۜ᩺") + i8) * (-81);
                        int i17 = ((iM2569 ^ i9) * 22703) ^ 1296674795;
                        i11 = iM2569 ^ (-1882166561);
                        z = z2;
                        i10 = i17;
                        i6 = 171;
                    }
                    break;
                case -492135987:
                case 611982254:
                    break;
                case -462702475:
                case 1238765161:
                    C1504.m5168(intent2, strM6311, strM24406);
                    break;
                case -319786450:
                case 746002566:
                    if (C0964.m3413()) {
                        iM2567 = (i9 - C2105.m6981("۠ܽ")) * 95;
                        i10 = ((iM2567 ^ i8) * 7475) ^ 1734855627;
                        i3 = 1325650482;
                        i11 = iM2567 ^ i3;
                        intent2 = intent;
                    }
                    iM2567 = C2105.m6981("ܿۗ") ^ i8;
                    i10 = ((iM2567 ^ i9) * 28077) ^ (-747260923);
                    i3 = -1530725936;
                    i11 = iM2567 ^ i3;
                    intent2 = intent;
                    break;
                case 137465655:
                case 1661901484:
                    i5 = 23026;
                    iM2567 = (i9 - C0630.m2566("ۚ᩺")) * 75;
                    i10 = ((iM2567 ^ i8) * (-4251)) ^ (-1476018083);
                    i3 = -1070062341;
                    i11 = iM2567 ^ i3;
                    intent2 = intent;
                    break;
                case 998094844:
                case 1955841968:
                    if (C1711.m5736() <= 0) {
                        iM2567 = (i8 - C2105.m6981("ۚۛ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i10 = ((iM2567 ^ i9) * (-12667)) ^ (-1198860699);
                        i3 = 1324565835;
                    } else {
                        iM2567 = (i9 - C2105.m6981("᩻ۨ")) * 3;
                        i10 = ((iM2567 ^ i8) * 7339) ^ 1067087460;
                        i3 = -633430527;
                    }
                    i11 = iM2567 ^ i3;
                    intent2 = intent;
                    break;
                case 1381918386:
                case 2114265090:
                    strM6311 = C1916.m6311(sArr2, i6, 12, i5);
                    if (z) {
                        iM2566 = C0630.m2566("ۧᩳ") ^ i8;
                        i = ((iM2566 ^ i9) * (-9753)) ^ 465159088;
                        i2 = 1931358504;
                    } else {
                        iM2566 = (C2105.m6981("ᩳ᩸") + i9) * 13;
                        i = ((iM2566 ^ i8) * 19627) ^ 996565327;
                        i2 = -1532502836;
                    }
                    int i18 = i;
                    i11 = iM2566 ^ i2;
                    i10 = i18;
                    break;
                case 1940827513:
                case 1987351534:
                    if (C4159.m12565() >= 0) {
                        iM2567 = C2105.m6981("ܿۗ") ^ i8;
                        i10 = ((iM2567 ^ i9) * 28077) ^ (-747260923);
                        i3 = -1530725936;
                    } else {
                        iM2567 = (C0630.m2566("ۜۘ") + i8) * (-71);
                        i10 = ((iM2567 ^ i9) * (-25767)) ^ (-1996660857);
                        i3 = -2015551046;
                    }
                    i11 = iM2567 ^ i3;
                    intent2 = intent;
                    break;
                default:
                    if (C1128.f4106 > 0) {
                        iM2567 = C2105.m6981("ܿۗ") ^ i8;
                        i10 = ((iM2567 ^ i9) * 28077) ^ (-747260923);
                        i3 = -1530725936;
                        i11 = iM2567 ^ i3;
                        intent2 = intent;
                    } else {
                        iM2566 = (i9 - C2105.m6981("᩹ۤ")) * (-31);
                        i = ((iM2566 ^ i8) * (-10457)) ^ (-1231874584);
                        i2 = -1315225222;
                        int i19 = i;
                        i11 = iM2566 ^ i2;
                        i10 = i19;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45007(C16560 c16560, InterfaceC17889 interfaceC17889, Class cls) {
        int i = 821884864;
        int i2 = C7811.f24123;
        int i3 = C4616.f14690;
        int iM6981 = C2105.m6981("ۜܽ") ^ i3;
        int i4 = ((iM6981 ^ i2) * 10739) ^ 158696665;
        int i5 = -1207223799;
        while (true) {
            i = ((((i ^ i2) * 6707) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -1632616664:
                case 695356707:
                    if (C1294.f4556 >= 0) {
                        iM6981 = (C2105.m6981("᩺۠") ^ i2) * 9;
                        i4 = ((iM6981 ^ i3) * (-9407)) ^ (-1770351344);
                        i5 = 528952564;
                    } else {
                        iM6981 = C0630.m2566("᩸ۛ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-3335)) ^ (-124814927);
                        i5 = 1427864613;
                    }
                    break;
                case -1546420167:
                case 448580740:
                    ServiceConnectionC3453.m10564();
                    if (C0422.f1886 > 0) {
                        iM6981 = (C2105.m6981("᩺۠") ^ i2) * 9;
                        i4 = ((iM6981 ^ i3) * (-9407)) ^ (-1770351344);
                        i5 = 528952564;
                    } else {
                        iM6981 = (C0630.m2566("۟ۤ") ^ i3) * 65;
                        i4 = ((iM6981 ^ i2) * (-28493)) ^ (-332768977);
                        i5 = -2007433669;
                    }
                    break;
                case -1432861596:
                case 1578424605:
                    if (C0422.f1886 > 0) {
                        iM6981 = (i3 - C2105.m6981("ۛܿ")) * 123;
                        i4 = ((iM6981 ^ i2) * (-28859)) ^ 144606200;
                        i5 = -1501315640;
                    } else {
                        iM6981 = (C0630.m2566("۟ۤ") ^ i3) * 65;
                        i4 = ((iM6981 ^ i2) * (-28493)) ^ (-332768977);
                        i5 = -2007433669;
                    }
                    break;
                case -1200134669:
                case 1940101510:
                    if (C0630.f2410 <= 0) {
                        iM6981 = (i3 - C2105.m6981("ۛܿ")) * 123;
                        i4 = ((iM6981 ^ i2) * (-28859)) ^ 144606200;
                        i5 = -1501315640;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ܽۚ")) * 97;
                        i4 = ((iM6981 ^ i3) * (-22349)) ^ (-2033012819);
                        i5 = -1976587787;
                    }
                    break;
                case -1125319240:
                case -476676617:
                    if (RunnableC1108.f4040) {
                        iM6981 = (C0630.m2566("ܿܰ") ^ i3) * 49;
                        i4 = ((iM6981 ^ i2) * (-25391)) ^ 293025780;
                        i5 = 2128866727;
                    } else {
                        iM6981 = C2105.m6981("ܰ᩷") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-18323)) ^ (-1427716227);
                        i5 = -2056738882;
                    }
                    break;
                case -1114237829:
                case 1029296860:
                    if (C7811.f24123 >= 0) {
                        iM6981 = (C0630.m2566("۟ۤ") ^ i3) * 65;
                        i4 = ((iM6981 ^ i2) * (-28493)) ^ (-332768977);
                        i5 = -2007433669;
                    } else {
                        iM6981 = C0630.m2566("ܳ۠") ^ i2;
                        i4 = ((iM6981 ^ i3) * 4037) ^ 481177461;
                        i5 = 1591366355;
                    }
                    break;
                case -531266334:
                case -229963525:
                    RunnableC1108.m3795(c16560, interfaceC17889, new C13011(cls, c16560, interfaceC17889));
                    break;
                case -506689473:
                case 445695084:
                    if (C0630.f2410 <= 0) {
                        iM6981 = (i3 - C2105.m6981("ۛܿ")) * 123;
                        i4 = ((iM6981 ^ i2) * (-28859)) ^ 144606200;
                        i5 = -1501315640;
                    } else {
                        iM6981 = (C0630.m2566("ۧ֨") ^ i2) * 75;
                        i4 = ((iM6981 ^ i3) * 12731) ^ 362637806;
                        i5 = 779755233;
                    }
                    break;
                case -423899863:
                case 2041937376:
                    if (C1504.f5354) {
                        iM6981 = (C0630.m2566("۟ۤ") ^ i3) * 65;
                        i4 = ((iM6981 ^ i2) * (-28493)) ^ (-332768977);
                        i5 = -2007433669;
                    } else {
                        iM6981 = C0630.m2566("᩺ܳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 14201) ^ (-492525513);
                        i5 = -1025470852;
                    }
                    break;
                case -282431079:
                case 315715550:
                    C0237.m1481();
                    break;
                case -200207372:
                case 389415398:
                    if (C1294.f4556 >= 0) {
                        iM6981 = (C0630.m2566("۟ۤ") ^ i3) * 65;
                        i4 = ((iM6981 ^ i2) * (-28493)) ^ (-332768977);
                        i5 = -2007433669;
                    } else {
                        iM6981 = C2105.m6981("᩵֡") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-24503)) ^ 783928372;
                        i5 = 1969755709;
                    }
                    break;
                case 253956995:
                case 931980091:
                    if (C0714.m2805()) {
                        iM6981 = (C0630.m2566("ܰۨ") + i3) * 25;
                        i4 = ((iM6981 ^ i2) * (-28467)) ^ 80980805;
                        i5 = -954421319;
                    } else {
                        iM6981 = C0630.m2566("ܳ۠") ^ i2;
                        i4 = ((iM6981 ^ i3) * 4037) ^ 481177461;
                        i5 = 1591366355;
                    }
                    break;
                case 259227649:
                case 1704965495:
                    if (C0422.f1886 <= 0) {
                        iM6981 = (C2105.m6981("᩺۠") ^ i2) * 9;
                        i4 = ((iM6981 ^ i3) * (-9407)) ^ (-1770351344);
                        i5 = 528952564;
                    } else {
                        iM6981 = (C0630.m2566("۬۫") ^ i2) * (-65);
                        i4 = ((iM6981 ^ i3) * (-12493)) ^ (-211525929);
                        i5 = 1860510832;
                    }
                    break;
                case 1406202161:
                case 1809619558:
                    if (C3537.f11231 >= 0) {
                        iM6981 = (i3 - C2105.m6981("ۛܿ")) * 123;
                        i4 = ((iM6981 ^ i2) * (-28859)) ^ 144606200;
                        i5 = -1501315640;
                    } else {
                        iM6981 = C2105.m6981("᩷ۗ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-5449)) ^ 1857086600;
                        i5 = -934902809;
                    }
                    break;
                case 1562685534:
                case 1617461687:
                    C5695.m16023();
                    iM6981 = C0630.m2566("ܳ۠") ^ i2;
                    i4 = ((iM6981 ^ i3) * 4037) ^ 481177461;
                    i5 = 1591366355;
                    break;
                default:
                    if (C1711.f5919) {
                        iM6981 = C2105.m6981("ܰ᩷") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-18323)) ^ (-1427716227);
                        i5 = -2056738882;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۧۛ")) * (-13);
                        i4 = ((iM6981 ^ i2) * (-1975)) ^ 1308172546;
                        i5 = -87298049;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:63:0x01d7 A[PHI: r22
      0x01d7: PHI (r22v49 int) = (r22v48 int), (r22v50 int) binds: [B:61:0x01bf, B:51:0x016f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m45018(C16560 c16560, AbstractC15440 abstractC15440) throws Throwable {
        int iM6981;
        int i;
        int i2;
        int iM2566;
        int i3;
        int i4;
        int iM2567;
        int i5;
        int i6;
        int iM2568;
        int i7;
        int iM6982;
        int i8;
        C16560 c16561 = c16560;
        int i9 = C1420.f5096;
        int i10 = C1047.f3863;
        int iM2569 = (C0630.m2566("ܶ֨") ^ i9) * 81;
        int i11 = ((iM2569 ^ i10) * (-7815)) ^ (-599356323);
        C11971 c11971M24094 = null;
        Throwable th = null;
        AbstractC16891 abstractC16891 = null;
        C9160 c9160 = null;
        short[] sArr = null;
        int i12 = iM2569 ^ (-2066456507);
        int size = 0;
        int i13 = 0;
        boolean z = false;
        boolean zM6437 = false;
        int i14 = 0;
        short s = 0;
        int i15 = 0;
        int i16 = 0;
        short s2 = 0;
        int i17 = 405713138;
        char c = 0;
        C9340 c9340M39016 = null;
        String strM12359 = null;
        while (true) {
            i17 = i12 ^ (i11 & (((i17 ^ i10) * 20177) >> 31));
            switch (i17) {
                case -2053735044:
                case -1263047710:
                    i15 = i15;
                    if (z) {
                        iM6982 = (C0630.m2566("ۜ᩵") + i10) * 57;
                        i = ((iM6982 ^ i9) * 24653) ^ 1583630124;
                        i8 = -198245144;
                    } else {
                        iM6982 = (C0630.m2566("᩵ۡ") ^ i10) * 19;
                        i = ((iM6982 ^ i9) * 13521) ^ 1800325461;
                        i8 = -1160842549;
                    }
                    int i18 = iM6982 ^ i8;
                    i15 = i15;
                    i12 = i18;
                    i11 = i;
                    break;
                case -2003697651:
                case -614586766:
                    C2167.m7155();
                    return;
                case -1991638364:
                case 415606258:
                    try {
                        i15 = i15;
                        try {
                            c9160.mo35230(C4616.m13542(f63246, 548, 1, i14));
                            c16560.m39016().m24060(c16561, i13, true);
                            iM6982 = (C2105.m6981("ܰ֨") + i9) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i = ((iM6982 ^ i10) * (-13677)) ^ 1627946867;
                            i8 = -1489132287;
                            int i19 = iM6982 ^ i8;
                            i15 = i15;
                            i12 = i19;
                            i11 = i;
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            iM2566 = C2105.m6981("ۧᩳ") ^ i10;
                            i3 = ((iM2566 ^ i9) * (-26967)) ^ (-1354239475);
                            i4 = 1542156125;
                            int i20 = i15;
                            i12 = iM2566 ^ i4;
                            i11 = i3;
                            i15 = i20;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        i15 = i15;
                    }
                    break;
                case -1950256102:
                case 48823960:
                    i15 = i15;
                    C9160 c9161 = (C9160) abstractC16891;
                    try {
                        zM6437 = ViewOnClickListenerC1958.m6437(strM12359, c9161.m23569());
                        int iM25610 = C0630.m2566("֫ۘ") ^ i9;
                        i15 = i15;
                        i12 = iM25610 ^ (-648100876);
                        i11 = ((iM25610 ^ i10) * (-28693)) ^ (-1298524004);
                        c9160 = c9161;
                    } catch (Throwable th4) {
                        th = th4;
                        c9160 = c9161;
                        iM2566 = C2105.m6981("ۧᩳ") ^ i10;
                        i3 = ((iM2566 ^ i9) * (-26967)) ^ (-1354239475);
                        i4 = 1542156125;
                        int i21 = i15;
                        i12 = iM2566 ^ i4;
                        i11 = i3;
                        i15 = i21;
                    }
                    break;
                case -1906626084:
                case -1134656467:
                    i15 = i15;
                    c = 547;
                    if (!C2126.f7087) {
                        iM2567 = C2105.m6981("᩸ܰ") ^ i9;
                        i5 = ((iM2567 ^ i10) * (-2571)) ^ (-875033276);
                        i6 = -1281124196;
                        int i22 = iM2567 ^ i6;
                        i15 = i15;
                        i12 = i22;
                        i11 = i5;
                        c16561 = c16560;
                    }
                    i15 = i15;
                    iM2568 = C0630.m2566("᩶ܺ") ^ i10;
                    i5 = ((iM2568 ^ i9) * 32051) ^ (-1415177955);
                    i7 = 1715433815;
                    i12 = iM2568 ^ i7;
                    i11 = i5;
                    c16561 = c16560;
                    break;
                case -1719382720:
                case -11350429:
                    i15 = i15;
                    AbstractC16891 abstractC16892 = (AbstractC16891) c11971M24094.get(i13);
                    try {
                        z = abstractC16892 instanceof C9160;
                        int iM25611 = (C0630.m2566("ܰۨ") + i9) * (-95);
                        i15 = i15;
                        i12 = iM25611 ^ 1674850094;
                        i11 = ((iM25611 ^ i10) * (-30245)) ^ 1491887033;
                        abstractC16891 = abstractC16892;
                    } catch (Throwable th5) {
                        th = th5;
                        abstractC16891 = abstractC16892;
                        iM2566 = C2105.m6981("ۧᩳ") ^ i10;
                        i3 = ((iM2566 ^ i9) * (-26967)) ^ (-1354239475);
                        i4 = 1542156125;
                        int i23 = i15;
                        i12 = iM2566 ^ i4;
                        i11 = i3;
                        i15 = i23;
                    }
                    break;
                case -1701531923:
                case -710747999:
                    i15 = i15;
                    if (zM6437) {
                        iM6982 = (C2105.m6981("ܿܶ") + i10) * (-123);
                        i = ((iM6982 ^ i9) * (-19947)) ^ (-1816075982);
                        i8 = 505653170;
                    } else {
                        iM6982 = (C0630.m2566("᩵ۡ") ^ i10) * 19;
                        i = ((iM6982 ^ i9) * 13521) ^ 1800325461;
                        i8 = -1160842549;
                    }
                    int i110 = iM6982 ^ i8;
                    i15 = i15;
                    i12 = i110;
                    i11 = i;
                    break;
                case -1610121479:
                case -460533014:
                    i15 = i15;
                    if (C22628.f73083 > 0) {
                        iM2567 = (C0630.m2566("ۘۘ") + i10) * (-3);
                        i5 = ((iM2567 ^ i9) * (-22999)) ^ 593615666;
                        i6 = -2702041;
                        int i24 = iM2567 ^ i6;
                        i15 = i15;
                        i12 = i24;
                        i11 = i5;
                        c16561 = c16560;
                    }
                    i15 = i15;
                    iM2568 = C0630.m2566("᩶ܺ") ^ i10;
                    i5 = ((iM2568 ^ i9) * 32051) ^ (-1415177955);
                    i7 = 1715433815;
                    i12 = iM2568 ^ i7;
                    i11 = i5;
                    c16561 = c16560;
                    break;
                case -1601008353:
                case -1341895538:
                    C4159.m12565();
                    if (RunnableC0588.m2441() >= 0) {
                        i15 = i15;
                        iM2567 = (C0630.m2566("᩸۠") ^ i10) * (-11);
                        i5 = ((iM2567 ^ i9) * (-5111)) ^ 1890569576;
                        i6 = -1771948919;
                        int i25 = iM2567 ^ i6;
                        i15 = i15;
                        i12 = i25;
                        i11 = i5;
                        c16561 = c16560;
                    } else {
                        i15 = i15;
                        iM2566 = C2105.m6981("ۢܺ") ^ i10;
                        i3 = ((iM2566 ^ i9) * 27287) ^ (-869196308);
                        i4 = 1445396355;
                        int i26 = i15;
                        i12 = iM2566 ^ i4;
                        i11 = i3;
                        i15 = i26;
                    }
                    break;
                case -1572062613:
                case -936908752:
                    i15 = i15;
                    c11971M24094 = c9340M39016.m24094();
                    c11971M24094.m29245();
                    iM2566 = C2105.m6981("ۘ֫") ^ i9;
                    i3 = ((iM2566 ^ i10) * (-31159)) ^ (-1275367226);
                    i4 = -1430997210;
                    int i27 = i15;
                    i12 = iM2566 ^ i4;
                    i11 = i3;
                    i15 = i27;
                    break;
                case -1471964190:
                case 625975081:
                    i15 = i15;
                    sArr = f63246;
                    if (C7106.f21815 != 0) {
                        iM2567 = (C2105.m6981("ۧ᩸") + i10) * (-63);
                        i5 = ((iM2567 ^ i9) * (-12867)) ^ 1796315804;
                        i6 = -424063084;
                    } else {
                        iM2567 = (C0630.m2566("ᩴ۬") + i9) * (-23);
                        i5 = ((iM2567 ^ i10) * (-25737)) ^ 1349097634;
                        i6 = 1411743041;
                    }
                    int i28 = iM2567 ^ i6;
                    i15 = i15;
                    i12 = i28;
                    i11 = i5;
                    c16561 = c16560;
                    break;
                case -1444828717:
                case 1263859565:
                    i15 = i15;
                    if (AbstractC2021.f6743 > 0) {
                        iM2567 = (C0630.m2566("᩻۬") + i9) * (-127);
                        i5 = ((iM2567 ^ i10) * 10773) ^ (-1933486993);
                        i6 = -1202801137;
                        int i29 = iM2567 ^ i6;
                        i15 = i15;
                        i12 = i29;
                        i11 = i5;
                        c16561 = c16560;
                    }
                    i15 = i15;
                    iM2568 = C0630.m2566("᩶ܺ") ^ i10;
                    i5 = ((iM2568 ^ i9) * 32051) ^ (-1415177955);
                    i7 = 1715433815;
                    i12 = iM2568 ^ i7;
                    i11 = i5;
                    c16561 = c16560;
                    break;
                case -1410926531:
                case 1829429540:
                    if (C22628.m50615() == 0) {
                        iM6982 = C2105.m6981("ۗ᩻") ^ i10;
                        i = ((iM6982 ^ i9) * 19853) ^ 1613747764;
                        i8 = 1031579491;
                        int i111 = iM6982 ^ i8;
                        i15 = i15;
                        i12 = i111;
                        i11 = i;
                    } else {
                        i15 = i15;
                        iM2566 = C0630.m2566("ۧ᩷") ^ i9;
                        i3 = ((iM2566 ^ i10) * 11175) ^ (-888300345);
                        i4 = 128956745;
                        int i210 = i15;
                        i12 = iM2566 ^ i4;
                        i11 = i3;
                        i15 = i210;
                    }
                    break;
                case -1401921363:
                case 2001484993:
                    C1047.m3591(c11971M24094);
                    return;
                case -1393166244:
                case 1079343689:
                    i14 = 33061;
                    iM2566 = C0630.m2566("ۖ᩵") ^ i10;
                    i3 = ((iM2566 ^ i9) * 25767) ^ (-1993933281);
                    i4 = 1034487084;
                    int i211 = i15;
                    i12 = iM2566 ^ i4;
                    i11 = i3;
                    i15 = i211;
                    break;
                case -1328419302:
                case 1221202347:
                    i15 = i15;
                    strM12359 = C4117.m12359(abstractC15440);
                    c9340M39016 = c16560.m39016();
                    if (C1711.f5919) {
                        iM2566 = C2105.m6981("ۢܺ") ^ i10;
                        i3 = ((iM2566 ^ i9) * 27287) ^ (-869196308);
                        i4 = 1445396355;
                    } else {
                        iM2566 = (i9 - C2105.m6981("۟۟")) * (-51);
                        i3 = ((iM2566 ^ i10) * 23773) ^ 690307618;
                        i4 = -594660017;
                    }
                    int i212 = i15;
                    i12 = iM2566 ^ i4;
                    i11 = i3;
                    i15 = i212;
                    break;
                case -1299125969:
                case -1137970415:
                    i13 = 0;
                    iM2566 = (i9 - C0630.m2566("᩺᩹")) * (-93);
                    i3 = ((iM2566 ^ i10) * (-2615)) ^ (-1210613867);
                    i4 = 281781147;
                    int i213 = i15;
                    i12 = iM2566 ^ i4;
                    i11 = i3;
                    i15 = i213;
                    break;
                case -1267603369:
                case 1660109423:
                    if (RunnableC0588.m2441() < 0) {
                        i15 = i15;
                        iM2567 = (C2105.m6981("ۧ᩸") + i10) * (-63);
                        i5 = ((iM2567 ^ i9) * (-12867)) ^ 1796315804;
                        i6 = -424063084;
                        int i214 = iM2567 ^ i6;
                        i15 = i15;
                        i12 = i214;
                        i11 = i5;
                        c16561 = c16560;
                    } else {
                        i15 = i15;
                        iM2566 = C2105.m6981("ۢܺ") ^ i10;
                        i3 = ((iM2566 ^ i9) * 27287) ^ (-869196308);
                        i4 = 1445396355;
                        int i215 = i15;
                        i12 = iM2566 ^ i4;
                        i11 = i3;
                        i15 = i215;
                    }
                    break;
                case -1232762180:
                case -91552689:
                    i14 = 63388;
                    iM2566 = C0630.m2566("ۖ᩵") ^ i10;
                    i3 = ((iM2566 ^ i9) * 25767) ^ (-1993933281);
                    i4 = 1034487084;
                    int i216 = i15;
                    i12 = iM2566 ^ i4;
                    i11 = i3;
                    i15 = i216;
                    break;
                case -1150148503:
                case -165039421:
                    i15 = i15;
                    if (C1711.f5919) {
                        iM2567 = (C0630.m2566("᩸۠") ^ i10) * (-11);
                        i5 = ((iM2567 ^ i9) * (-5111)) ^ 1890569576;
                        i6 = -1771948919;
                    } else {
                        iM2567 = (C0630.m2566("ۛ۟") ^ i10) * 27;
                        i5 = ((iM2567 ^ i9) * (-9661)) ^ 2084208031;
                        i6 = 1113506444;
                    }
                    int i217 = iM2567 ^ i6;
                    i15 = i15;
                    i12 = i217;
                    i11 = i5;
                    c16561 = c16560;
                    break;
                case -914214706:
                case -402519996:
                    C4616.m13552();
                    if (C4616.f14690 <= 0) {
                        iM6981 = C2105.m6981("᩵۟") ^ i9;
                        i = ((iM6981 ^ i10) * (-20049)) ^ 660237364;
                        i2 = 781689873;
                        i12 = iM6981 ^ i2;
                        i11 = i;
                    } else {
                        i15 = i15;
                        iM2566 = C2105.m6981("ۢܺ") ^ i10;
                        i3 = ((iM2566 ^ i9) * 27287) ^ (-869196308);
                        i4 = 1445396355;
                        int i218 = i15;
                        i12 = iM2566 ^ i4;
                        i11 = i3;
                        i15 = i218;
                    }
                    break;
                case -891384006:
                case 988500916:
                    i13++;
                    iM2566 = (i9 - C0630.m2566("᩺᩹")) * (-93);
                    i3 = ((iM2566 ^ i10) * (-2615)) ^ (-1210613867);
                    i4 = 281781147;
                    int i219 = i15;
                    i12 = iM2566 ^ i4;
                    i11 = i3;
                    i15 = i219;
                    break;
                case -712188948:
                case -694969768:
                    RunnableC1937.m6376(c11971M24094);
                    throw th;
                case -589589577:
                case 1883874948:
                    i15 = i15;
                    if (i13 < size) {
                        iM2566 = C2105.m6981("ܶ᩻") ^ i10;
                        i3 = ((iM2566 ^ i9) * 9069) ^ 976299707;
                        i4 = 352105004;
                    } else {
                        iM2566 = C0630.m2566("ۜ֨") ^ i9;
                        i3 = ((iM2566 ^ i10) * 3877) ^ 503357706;
                        i4 = 1505262846;
                    }
                    int i2110 = i15;
                    i12 = iM2566 ^ i4;
                    i11 = i3;
                    i15 = i2110;
                    break;
                case -377571999:
                case 1138615737:
                    i15 = i15;
                    try {
                        size = c11971M24094.size();
                        iM2566 = (C2105.m6981("ۧۚ") ^ i10) * 109;
                        i3 = ((iM2566 ^ i9) * (-1601)) ^ 347920612;
                        i4 = -1897636579;
                    } catch (Throwable th6) {
                        th = th6;
                        th = th;
                        iM2566 = C2105.m6981("ۧᩳ") ^ i10;
                        i3 = ((iM2566 ^ i9) * (-26967)) ^ (-1354239475);
                        i4 = 1542156125;
                    }
                    int i2111 = i15;
                    i12 = iM2566 ^ i4;
                    i11 = i3;
                    i15 = i2111;
                    break;
                case -347844678:
                case 1251908284:
                    if (C22628.f73083 <= 0) {
                        iM6981 = (i9 - C0630.m2566("ۡܺ")) * (-75);
                        i = ((iM6981 ^ i10) * 31121) ^ (-1086205594);
                        i2 = 1092682104;
                    } else {
                        iM6981 = (C0630.m2566("֫ᩳ") ^ i9) * 119;
                        i = ((iM6981 ^ i10) * (-31211)) ^ (-470142154);
                        i2 = -420695519;
                    }
                    i12 = iM6981 ^ i2;
                    i11 = i;
                    break;
                case -261457744:
                case 282329597:
                    s = sArr[c];
                    i15 = s * s;
                    if (RunnableC1937.f6483 >= 0) {
                        iM2568 = C0630.m2566("᩶ܺ") ^ i10;
                        i5 = ((iM2568 ^ i9) * 32051) ^ (-1415177955);
                        i7 = 1715433815;
                    } else {
                        iM2568 = (C2105.m6981("ܺ֡") ^ i10) * 13;
                        i5 = ((iM2568 ^ i9) * (-11167)) ^ 1287413206;
                        i7 = 501283636;
                    }
                    i12 = iM2568 ^ i7;
                    i11 = i5;
                    c16561 = c16560;
                    break;
                case 69910909:
                case 2111201660:
                    C3019.m9255();
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        i15 = i15;
                        iM2566 = C0630.m2566("ۧ᩷") ^ i9;
                        i3 = ((iM2566 ^ i10) * 11175) ^ (-888300345);
                        i4 = 128956745;
                        int i2112 = i15;
                        i12 = iM2566 ^ i4;
                        i11 = i3;
                        i15 = i2112;
                    } else {
                        i15 = i15;
                        iM2567 = (C2105.m6981("ۧ᩸") + i10) * (-63);
                        i5 = ((iM2567 ^ i9) * (-12867)) ^ 1796315804;
                        i6 = -424063084;
                        int i2113 = iM2567 ^ i6;
                        i15 = i15;
                        i12 = i2113;
                        i11 = i5;
                        c16561 = c16560;
                    }
                    break;
                case 155611016:
                case 485537783:
                    i15 = i15;
                    s2 = 16442;
                    if (C0050.f910 >= 0) {
                        iM2566 = C0630.m2566("ۧ᩷") ^ i9;
                        i3 = ((iM2566 ^ i10) * 11175) ^ (-888300345);
                        i4 = 128956745;
                    } else {
                        iM2566 = (C2105.m6981("᩺ۨ") ^ i9) * 75;
                        i3 = ((iM2566 ^ i10) * (-16635)) ^ (-1923103112);
                        i4 = 1447530278;
                    }
                    int i2114 = i15;
                    i12 = iM2566 ^ i4;
                    i11 = i3;
                    i15 = i2114;
                    break;
                case 443710758:
                case 1249104057:
                    C1047.m3591(c11971M24094);
                    if (C1128.f4106 > 0) {
                        C4263.m12821(new C18156(c16561, abstractC15440));
                        return;
                    }
                    iM6982 = C2105.m6981("ۗ᩻") ^ i10;
                    i = ((iM6982 ^ i9) * 19853) ^ 1613747764;
                    i8 = 1031579491;
                    int i112 = iM6982 ^ i8;
                    i15 = i15;
                    i12 = i112;
                    i11 = i;
                    break;
                case 685119842:
                case 1677888581:
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        iM6981 = (i9 - C0630.m2566("ۡܺ")) * (-75);
                        i = ((iM6981 ^ i10) * 31121) ^ (-1086205594);
                        i2 = 1092682104;
                    } else {
                        iM6981 = C2105.m6981("ᩴۘ") ^ i9;
                        i = ((iM6981 ^ i10) * 16041) ^ 1312930712;
                        i2 = -399566515;
                    }
                    i12 = iM6981 ^ i2;
                    i11 = i;
                    break;
                case 799068770:
                case 1834894479:
                    C2958.m9034();
                    C3663.m11168();
                    i15 = i15;
                    iM2566 = C2105.m6981("ۢܺ") ^ i10;
                    i3 = ((iM2566 ^ i9) * 27287) ^ (-869196308);
                    i4 = 1445396355;
                    int i2115 = i15;
                    i12 = iM2566 ^ i4;
                    i11 = i3;
                    i15 = i2115;
                    break;
                case 851677506:
                case 1736852022:
                    i15 = i15;
                    i16 = i15 + 67584841;
                    if (C0714.f2697 < 0) {
                        iM2566 = C0630.m2566("᩹ۖ") ^ i10;
                        i3 = ((iM2566 ^ i9) * (-5319)) ^ 2021540351;
                        i4 = -1853126173;
                        int i2116 = i15;
                        i12 = iM2566 ^ i4;
                        i11 = i3;
                        i15 = i2116;
                    } else {
                        iM2567 = (C0630.m2566("᩸۠") ^ i10) * (-11);
                        i5 = ((iM2567 ^ i9) * (-5111)) ^ 1890569576;
                        i6 = -1771948919;
                        int i2117 = iM2567 ^ i6;
                        i15 = i15;
                        i12 = i2117;
                        i11 = i5;
                        c16561 = c16560;
                    }
                    break;
                case 1147507373:
                case 1264976529:
                    C1128.m3851();
                    if (!C1711.f5919) {
                        i15 = i15;
                        iM2566 = C2105.m6981("ۢܺ") ^ i10;
                        i3 = ((iM2566 ^ i9) * 27287) ^ (-869196308);
                        i4 = 1445396355;
                        int i2118 = i15;
                        i12 = iM2566 ^ i4;
                        i11 = i3;
                        i15 = i2118;
                    } else {
                        iM6981 = (i9 - C0630.m2566("ۡܺ")) * (-75);
                        i = ((iM6981 ^ i10) * 31121) ^ (-1086205594);
                        i2 = 1092682104;
                        i12 = iM6981 ^ i2;
                        i11 = i;
                    }
                    break;
                default:
                    i15 = i15;
                    if (i16 - (s * s2) >= 0) {
                        iM2566 = (i9 - C2105.m6981("ۙᩳ")) * (-97);
                        i3 = ((iM2566 ^ i10) * (-6119)) ^ 1529656196;
                        i4 = -419902502;
                    } else {
                        iM2566 = (i10 - C0630.m2566("᩹ܳ")) * (-11);
                        i3 = ((iM2566 ^ i9) * (-6341)) ^ 4085792;
                        i4 = -1414648686;
                    }
                    int i2119 = i15;
                    i12 = iM2566 ^ i4;
                    i11 = i3;
                    i15 = i2119;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:37:0x010f A[PHI: r9 r13 r14
      0x010f: PHI (r9v4 java.lang.String) = 
      (r9v3 java.lang.String)
      (r9v2 java.lang.String)
      (r9v2 java.lang.String)
      (r9v2 java.lang.String)
      (r9v2 java.lang.String)
     binds: [B:36:0x010d, B:24:0x00b1, B:22:0x00ae, B:19:0x00a4, B:12:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r13v4 short[]) = (r13v3 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:36:0x010d, B:24:0x00b1, B:22:0x00ae, B:19:0x00a4, B:12:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r14v4 int) = (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:36:0x010d, B:24:0x00b1, B:22:0x00ae, B:19:0x00a4, B:12:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x0195  */
    /* JADX WARN: Code duplicated, block: B:75:0x02c2 A[PHI: r4 r8
      0x02c2: PHI (r4v4 java.util.Iterator) = 
      (r4v3 java.util.Iterator)
      (r4v2 java.util.Iterator)
      (r4v2 java.util.Iterator)
      (r4v2 java.util.Iterator)
      (r4v2 java.util.Iterator)
      (r4v2 java.util.Iterator)
     binds: [B:74:0x02bb, B:43:0x0165, B:42:0x015b, B:40:0x0143, B:30:0x00c3, B:28:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x02c2: PHI (r8v5 int) = (r8v3 int), (r8v2 int), (r8v4 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:74:0x02bb, B:43:0x0165, B:42:0x015b, B:40:0x0143, B:30:0x00c3, B:28:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x02e9 A[PHI: r2 r28
      0x02e9: PHI (r2v4 java.util.ArrayList) = (r2v3 java.util.ArrayList), (r2v2 java.util.ArrayList) binds: [B:77:0x02e7, B:16:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x02e9: PHI (r28v3 java.util.List) = (r28v2 java.util.List), (r28v1 java.util.List) binds: [B:77:0x02e7, B:16:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x0396 A[PHI: r20 r21
      0x0396: PHI (r20v3 short) = (r20v2 short), (r20v5 short) binds: [B:19:0x00a4, B:6:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0396: PHI (r21v3 short) = (r21v2 short), (r21v5 short) binds: [B:19:0x00a4, B:6:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:99:0x03ff A[PHI: r18
      0x03ff: PHI (r18v4 short[]) = (r18v3 short[]), (r18v2 short[]) binds: [B:98:0x03fd, B:9:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m45015(C16560 c16560, InterfaceC17889 interfaceC17889) {
        int iM6981;
        int i;
        int i2;
        int i3 = C0422.f1886;
        int i4 = C2958.f9394;
        int iM6982 = C2105.m6981("ܺܺ") ^ i4;
        int i5 = ((iM6982 ^ i3) * (-13217)) ^ 2047629641;
        List listM39014 = null;
        Class<Main> cls = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM6982 ^ 2069618441;
        ArrayList arrayList = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        C2608 c2608 = null;
        int i11 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i12 = 0;
        int i13 = 69681081;
        int i14 = 0;
        InterfaceC17889 interfaceC178810 = null;
        String strMo36971 = null;
        int i15 = 0;
        Iterator itM6374 = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i3) * (-19077)) >> 31));
            switch (i13) {
                case -2122170589:
                case 1718098422:
                    i7 = 43648;
                    iM6981 = (C2105.m6981("ۘ᩸") + i3) * 7;
                    i = ((iM6981 ^ i4) * (-8703)) ^ 42686534;
                    i2 = -1296229328;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -2028654932:
                case -80745515:
                    itM6374 = RunnableC1937.m6374(listM39014);
                    i15 = 0;
                    iM6981 = (C0630.m2566("ᩳ۫") + i4) * 39;
                    i = ((iM6981 ^ i3) * (-4387)) ^ (-754618311);
                    i2 = 2115990847;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -2017123153:
                case 916529430:
                    AbstractC2021.m6574();
                    if (C0798.f2919) {
                        iM6981 = C2105.m6981("᩸ܶ") ^ i4;
                        i = ((iM6981 ^ i3) * 28697) ^ (-346228291);
                        i2 = 834851521;
                    } else {
                        iM6981 = (i3 - C0630.m2566("᩻۬")) * (-77);
                        i = ((iM6981 ^ i4) * (-32181)) ^ (-1371139458);
                        i2 = 1751473875;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1943022855:
                case 2002381357:
                    if (interfaceC178810 != null) {
                        iM6981 = (C2105.m6981("᩻۠") + i4) * (-45);
                        i = ((iM6981 ^ i3) * 13995) ^ (-2003227149);
                        i2 = -626658282;
                    } else {
                        iM6981 = (C0630.m2566("ᩳ۫") + i4) * 39;
                        i = ((iM6981 ^ i3) * (-4387)) ^ (-754618311);
                        i2 = 2115990847;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1904614690:
                case -1535696131:
                    sArr = f63246;
                    if (C3432.f10845 >= 0) {
                        iM6981 = (C2105.m6981("ܰۙ") + i3) * 47;
                        i = ((iM6981 ^ i4) * (-10041)) ^ 329424326;
                        i2 = 747691230;
                    } else {
                        iM6981 = (C2105.m6981("ۙۤ") ^ i4) * 15;
                        i = ((iM6981 ^ i3) * 7761) ^ 289206707;
                        i2 = 444355752;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1828868052:
                case -1083997814:
                    ViewOnClickListenerC1958.m6429();
                    iM6981 = (i3 - C0630.m2566("᩻۬")) * (-77);
                    i = ((iM6981 ^ i4) * (-32181)) ^ (-1371139458);
                    i2 = 1751473875;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1571373343:
                case 482887511:
                    arrayList = new ArrayList();
                    listM39014 = c16560.m39014();
                    if (AbstractC2021.m6574()) {
                        iM6981 = C0630.m2566("ܶۘ") ^ i3;
                        i = ((iM6981 ^ i4) * (-24453)) ^ 514916229;
                        i2 = -1624342068;
                    } else {
                        iM6981 = (C0630.m2566("᩶ܺ") + i4) * (-21);
                        i = ((iM6981 ^ i3) * 9179) ^ 782213729;
                        i2 = 1693778277;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1496483306:
                case -876951427:
                    strMo36971 = interfaceC178810.mo36971();
                    sArr3 = f63246;
                    i10 = 539;
                    if (C0798.f2919) {
                        iM6981 = (i3 - C0630.m2566("᩻۬")) * (-77);
                        i = ((iM6981 ^ i4) * (-32181)) ^ (-1371139458);
                        i2 = 1751473875;
                    } else {
                        iM6981 = (i4 - C0630.m2566("᩸۬")) * 55;
                        i = ((iM6981 ^ i3) * (-6199)) ^ 887766602;
                        i2 = 1607078558;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1321331926:
                case 1345167972:
                    if (i12 - (i14 + i11) <= 0) {
                        iM6981 = C0630.m2566("۟ۚ") ^ i3;
                        i = ((iM6981 ^ i4) * (-2295)) ^ 856465437;
                        i2 = -596942354;
                    } else {
                        iM6981 = (C0630.m2566("ۜۢ") ^ i4) * 33;
                        i = ((iM6981 ^ i3) * (-9935)) ^ 978206693;
                        i2 = 417340434;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1087191396:
                case -998180556:
                    i7 = 56330;
                    iM6981 = (C2105.m6981("ۘ᩸") + i3) * 7;
                    i = ((iM6981 ^ i4) * (-8703)) ^ 42686534;
                    i2 = -1296229328;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1077171224:
                case 152954377:
                    if (C3746.m11369() >= 0) {
                        iM6981 = (i3 - C0630.m2566("᩻۬")) * (-77);
                        i = ((iM6981 ^ i4) * (-32181)) ^ (-1371139458);
                        i2 = 1751473875;
                    } else {
                        iM6981 = C2105.m6981("ۘ֨") ^ i4;
                        i = ((iM6981 ^ i3) * (-16657)) ^ (-1068762641);
                        i2 = 700334977;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -991743000:
                case -268132419:
                    C0964.m3413();
                    if (RunnableC1937.m6387() != 0) {
                        iM6981 = (i3 - C0630.m2566("᩻۬")) * (-77);
                        i = ((iM6981 ^ i4) * (-32181)) ^ (-1371139458);
                        i2 = 1751473875;
                    } else {
                        iM6981 = C2105.m6981("ܳܺ") ^ i4;
                        i = ((iM6981 ^ i3) * (-13169)) ^ (-938495431);
                        i2 = 1742703836;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -809267664:
                case -363820989:
                    C0382.m1848();
                    C4616.m13552();
                    break;
                case -663156432:
                case -143990232:
                    int iM10481 = C3432.m10481(arrayList);
                    C1916.m6307(arrayList, interfaceC178810);
                    i15 = iM10481;
                    iM6981 = (C0630.m2566("ᩳ۫") + i4) * 39;
                    i = ((iM6981 ^ i3) * (-4387)) ^ (-754618311);
                    i2 = 2115990847;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -593739578:
                case 8866931:
                    C1420.m4913();
                    if (C3683.f11629 < 0) {
                        iM6981 = C2105.m6981("ܳܺ") ^ i4;
                        i = ((iM6981 ^ i3) * (-13169)) ^ (-938495431);
                        i2 = 1742703836;
                    } else {
                        iM6981 = C0630.m2566("ܶۘ") ^ i3;
                        i = ((iM6981 ^ i4) * (-24453)) ^ 514916229;
                        i2 = -1624342068;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -568200199:
                case -518260286:
                    interfaceC178810 = (InterfaceC17889) C2272.m7513(itM6374);
                    if (interfaceC178810 == interfaceC17889) {
                        iM6981 = (C0630.m2566("ۘܿ") + i3) * 75;
                        i = ((iM6981 ^ i4) * 22183) ^ (-112432911);
                        i2 = -1789533880;
                    } else {
                        iM6981 = C2105.m6981("ۜ᩺") ^ i3;
                        i = ((iM6981 ^ i4) * (-31725)) ^ (-335555380);
                        i2 = 1873954354;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -551966572:
                case -9512689:
                    if (C7811.f24123 >= 0) {
                        iM6981 = C2105.m6981("ܳܺ") ^ i4;
                        i = ((iM6981 ^ i3) * (-13169)) ^ (-938495431);
                        i2 = 1742703836;
                    } else {
                        iM6981 = (C2105.m6981("ܰۙ") + i3) * 47;
                        i = ((iM6981 ^ i4) * (-10041)) ^ 329424326;
                        i2 = 747691230;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -431167642:
                case 1346029766:
                    AbstractC13921 abstractC13921Mo6020 = C2126.m7043(c16560).mo6020();
                    if (C3245.f10203 > 0) {
                        c2608 = new C2608(abstractC13921Mo6020, arrayList, i15);
                        cls = Main.class;
                        if (C1047.f3863 < 0) {
                            iM6981 = (C0630.m2566("ۢ᩷") + i4) * 9;
                            i = ((iM6981 ^ i3) * 16685) ^ (-1014983950);
                            i2 = -1147816059;
                            i6 = iM6981 ^ i2;
                            i5 = i;
                            break;
                        }
                    }
                    int iM2566 = (i3 - C0630.m2566("ۙܰ")) * (-81);
                    i6 = iM2566 ^ (-491002791);
                    i5 = ((iM2566 ^ i4) * 15067) ^ 1457753472;
                    c2608 = null;
                    break;
                case -382806957:
                case -289644534:
                    C2956.m9014(cls, c2608, C1916.m6311(sArr2, i8, i9, i7));
                    Main mainM50612 = C22628.m50612(c16560);
                    if (C2520.f8000 < 0) {
                        C22628.m50612(c16560).m116(c16560, new Intent(mainM50612, (Class<?>) ActivityC16012.class));
                    }
                    iM6981 = C2105.m6981("ܳܺ") ^ i4;
                    i = ((iM6981 ^ i3) * (-13169)) ^ (-938495431);
                    i2 = 1742703836;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -167697893:
                case 635032309:
                    if (C7811.m20838(strMo36971, C5695.m16034(sArr3, i10, 6, i7))) {
                        iM6981 = (i3 - C2105.m6981("ۗ᩸")) * (-73);
                        i = ((iM6981 ^ i4) * 5813) ^ (-1003481692);
                        i2 = -1013197311;
                    } else {
                        iM6981 = (C2105.m6981("ۜ۟") ^ i4) * 15;
                        i = ((iM6981 ^ i3) * 9909) ^ 116186018;
                        i2 = 52131152;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 342213135:
                case 1608869244:
                    if (C6554.m18062(interfaceC178810)) {
                        iM6981 = (i3 - C2105.m6981("ۗ᩸")) * (-73);
                        i = ((iM6981 ^ i4) * 5813) ^ (-1003481692);
                        i2 = -1013197311;
                    } else {
                        iM6981 = (C0630.m2566("ᩳ۫") + i4) * 39;
                        i = ((iM6981 ^ i3) * (-4387)) ^ (-754618311);
                        i2 = 2115990847;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 352926674:
                case 2140362339:
                    i12 = s * s2;
                    i14 = s * s;
                    i11 = 145926400;
                    if (!C2272.m7503()) {
                        iM6981 = (i3 - C0630.m2566("ۚ۠")) * (-35);
                        i = ((iM6981 ^ i4) * 17883) ^ 1877094;
                        i2 = 651018821;
                        i6 = iM6981 ^ i2;
                        i5 = i;
                    } else {
                        int iM2567 = (i3 - C0630.m2566("ۙܰ")) * (-81);
                        i6 = iM2567 ^ (-491002791);
                        i5 = ((iM2567 ^ i4) * 15067) ^ 1457753472;
                        c2608 = null;
                    }
                    break;
                case 634890825:
                case 1249939378:
                    sArr2 = f63246;
                    i9 = 20;
                    if (C0422.m1963()) {
                        int iM6983 = (C2105.m6981("ᩳ֨") ^ i3) * 21;
                        i6 = iM6983 ^ (-499328393);
                        i5 = ((iM6983 ^ i4) * (-22573)) ^ (-1881169712);
                        i8 = 519;
                    } else {
                        i8 = 519;
                        int iM2568 = (i3 - C0630.m2566("ۙܰ")) * (-81);
                        i6 = iM2568 ^ (-491002791);
                        i5 = ((iM2568 ^ i4) * 15067) ^ 1457753472;
                        c2608 = null;
                    }
                    break;
                case 649474433:
                case 1216352102:
                    C1916.m6307(arrayList, interfaceC178810);
                    iM6981 = (C0630.m2566("ᩳ۫") + i4) * 39;
                    i = ((iM6981 ^ i3) * (-4387)) ^ (-754618311);
                    i2 = 2115990847;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 651310806:
                case 1097416359:
                    if (C0483.m2123(itM6374)) {
                        iM6981 = C0630.m2566("ܳ֫") ^ i3;
                        i = ((iM6981 ^ i4) * 18449) ^ 1252345877;
                        i2 = -959818720;
                    } else {
                        iM6981 = C2105.m6981("ܿܰ") ^ i3;
                        i = ((iM6981 ^ i4) * 27547) ^ 1631486489;
                        i2 = 1732054332;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 664111734:
                case 854320578:
                    if (interfaceC178810.mo36969()) {
                        iM6981 = C0630.m2566("ۧ֡") ^ i3;
                        i = ((iM6981 ^ i4) * (-30429)) ^ (-1717059121);
                        i2 = -1104747891;
                    } else {
                        iM6981 = (C0630.m2566("ᩳ۫") + i4) * 39;
                        i = ((iM6981 ^ i3) * (-4387)) ^ (-754618311);
                        i2 = 2115990847;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 732260560:
                case 1594501129:
                    C7106.m19117(arrayList, interfaceC17889);
                    iM6981 = C2105.m6981("᩷ܰ") ^ i4;
                    i = ((iM6981 ^ i3) * (-31677)) ^ (-1543566771);
                    i2 = -1524946488;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 774834696:
                case 2144774636:
                    if (C3019.m9256(arrayList)) {
                        iM6981 = (C2105.m6981("ۘܽ") + i4) * 85;
                        i = ((iM6981 ^ i3) * (-7897)) ^ 1631457410;
                        i2 = 1003570341;
                    } else {
                        iM6981 = C2105.m6981("᩷ܰ") ^ i4;
                        i = ((iM6981 ^ i3) * (-31677)) ^ (-1543566771);
                        i2 = -1524946488;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 1182944940:
                case 1553039242:
                    c = 518;
                    if (!C1711.f5919) {
                        iM6981 = C2105.m6981("ۙ᩵") ^ i3;
                        i = ((iM6981 ^ i4) * (-2113)) ^ (-966869310);
                        i2 = 1720717615;
                        i6 = iM6981 ^ i2;
                        i5 = i;
                    } else {
                        int iM2569 = (i3 - C0630.m2566("ۙܰ")) * (-81);
                        i6 = iM2569 ^ (-491002791);
                        i5 = ((iM2569 ^ i4) * 15067) ^ 1457753472;
                        c2608 = null;
                    }
                    break;
                default:
                    s = sArr[c];
                    s2 = 24160;
                    if (C22628.f73083 <= 0) {
                        iM6981 = C2105.m6981("᩸ܶ") ^ i4;
                        i = ((iM6981 ^ i3) * 28697) ^ (-346228291);
                        i2 = 834851521;
                    } else {
                        iM6981 = (i4 - C0630.m2566("᩺ۢ")) * 15;
                        i = ((iM6981 ^ i3) * (-13349)) ^ 1201024177;
                        i2 = 591988322;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0182 A[PHI: r5 r6 r8 r9
      0x0182: PHI (r5v2 int) = (r5v1 int), (r5v1 int), (r5v6 int) binds: [B:33:0x00ed, B:10:0x0049, B:6:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0182: PHI (r6v2 short) = (r6v1 short), (r6v1 short), (r6v4 short) binds: [B:33:0x00ed, B:10:0x0049, B:6:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0182: PHI (r8v3 short[]) = (r8v2 short[]), (r8v1 short[]), (r8v1 short[]) binds: [B:33:0x00ed, B:10:0x0049, B:6:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0182: PHI (r9v3 int) = (r9v2 int), (r9v1 int), (r9v1 int) binds: [B:33:0x00ed, B:10:0x0049, B:6:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x01f9 A[PHI: r3 r4
      0x01f9: PHI (r3v4 short) = (r3v1 short), (r3v3 short), (r3v1 short) binds: [B:58:0x01f7, B:50:0x01b8, B:14:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x01f9: PHI (r4v3 int) = (r4v1 int), (r4v2 int), (r4v1 int) binds: [B:58:0x01f7, B:50:0x01b8, B:14:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0228 A[PHI: r1
      0x0228: PHI (r1v3 android.content.Intent) = (r1v1 android.content.Intent), (r1v2 android.content.Intent), (r1v1 android.content.Intent) binds: [B:62:0x0226, B:37:0x0113, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0258 A[PHI: r2
      0x0258: PHI (r2v3 short[]) = (r2v1 short[]), (r2v2 short[]), (r2v1 short[]) binds: [B:66:0x0256, B:54:0x01d8, B:29:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        if (l.C0798.m2998() == 0) goto L10;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m45001(Class cls, C16560 c16560, InterfaceC17889 interfaceC17889, AbstractC15440 abstractC15440) {
        int iM2566;
        int i;
        int i2;
        Intent intent = null;
        short[] sArr = null;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        short s2 = 0;
        int i5 = 0;
        short[] sArr2 = null;
        int i6 = 0;
        int i7 = -1653853941;
        int i8 = C1420.f5096;
        int i9 = AbstractC2021.f6743;
        int iM6981 = (C2105.m6981("ܺ᩶") ^ i8) * (-75);
        int i10 = ((iM6981 ^ i9) * (-22225)) ^ (-627922839);
        int i11 = iM6981 ^ 214455011;
        while (true) {
            i7 = ((((i7 ^ i9) * (-21277)) >> 31) & i10) ^ i11;
            switch (i7) {
                case -2097331091:
                case 1291556550:
                    int i12 = s + s2;
                    if ((i12 * i12) - i4 > 0) {
                        iM2566 = (C2105.m6981("ᩳۢ") + i9) * 59;
                        i = ((iM2566 ^ i8) * (-25419)) ^ (-1186273001);
                        i2 = -1995512743;
                    } else {
                        iM2566 = (i8 - C2105.m6981("֨ܽ")) * (-45);
                        i = ((iM2566 ^ i9) * (-11933)) ^ (-872954495);
                        i2 = 897669347;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -1832801105:
                case -212553336:
                    C5695.m16023();
                    iM2566 = C2105.m6981("ܽۧ") ^ i8;
                    i = ((iM2566 ^ i9) * 3699) ^ 1890960053;
                    i2 = 1672166775;
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -1801075963:
                case 553002958:
                    i5 = 27573;
                    iM2566 = C2105.m6981("ܽ᩻") ^ i8;
                    i = ((iM2566 ^ i9) * 21337) ^ (-743383680);
                    i2 = -1113382101;
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -1792999884:
                case 588281043:
                    C9340.m24035(interfaceC17889, 2000);
                    C4075.m12261(C21923.m49336(c16560), intent);
                    break;
                case -1641137406:
                case -635199938:
                    s = sArr[183];
                    i3 = s * s;
                    if (C2520.f8000 >= 0) {
                        iM2566 = C0630.m2566("֨᩺") ^ i8;
                        i = ((iM2566 ^ i9) * (-12921)) ^ 1729228484;
                        i2 = -1331780658;
                    } else {
                        iM2566 = C2105.m6981("۠ۤ") ^ i8;
                        i = ((iM2566 ^ i9) * (-32427)) ^ (-490135242);
                        i2 = -482246623;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -1483206094:
                case 1929594047:
                    i5 = 28576;
                    iM2566 = C2105.m6981("ܽ᩻") ^ i8;
                    i = ((iM2566 ^ i9) * 21337) ^ (-743383680);
                    i2 = -1113382101;
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -1408149884:
                case -576387620:
                    break;
                case -1403121295:
                case 1799377746:
                    sArr2 = f63246;
                    i6 = 184;
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = C2105.m6981("ܽۧ") ^ i8;
                        i = ((iM2566 ^ i9) * 3699) ^ 1890960053;
                        i2 = 1672166775;
                    } else {
                        iM2566 = C2105.m6981("᩶۠") ^ i9;
                        i = ((iM2566 ^ i8) * (-13231)) ^ 1410990935;
                        i2 = -1380916042;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -1386604810:
                case -1010415947:
                    sArr = f63246;
                    if (C0964.m3413()) {
                        iM2566 = (C2105.m6981("ۜܿ") + i8) * (-15);
                        i = ((iM2566 ^ i9) * (-25167)) ^ 132434808;
                        i2 = -1723958523;
                    } else {
                        iM2566 = (C0630.m2566("ᩴ᩸") ^ i8) * (-5);
                        i = ((iM2566 ^ i9) * 8015) ^ 2120973009;
                        i2 = -520946408;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -1259639845:
                case 543228329:
                    C1504.m5179();
                    break;
                case -486627709:
                case 1086517512:
                    intent.setData(abstractC15440.m36522());
                    m44999(intent, cls, C2126.m7043(c16560));
                    if (C1047.m3599() >= 0) {
                        iM2566 = C2105.m6981("᩵֫") ^ i9;
                        i = ((iM2566 ^ i8) * (-32221)) ^ (-1926803397);
                        i2 = -1962101879;
                    } else {
                        iM2566 = (C0630.m2566("ᩴܿ") + i9) * (-87);
                        i = ((iM2566 ^ i8) * (-21779)) ^ 975660229;
                        i2 = -1444911315;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -358731520:
                case -26672543:
                    intent = new Intent(C0382.m1842(), (Class<?>) cls);
                    if (C1128.f4106 <= 0) {
                        iM2566 = C0630.m2566("֨ۨ") ^ i9;
                        i = ((iM2566 ^ i8) * (-20493)) ^ 155965250;
                        i2 = -1466258576;
                    } else {
                        iM2566 = C2105.m6981("۫ᩳ") ^ i9;
                        i = ((iM2566 ^ i8) * 27887) ^ 2110512178;
                        i2 = 1038756921;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -239344984:
                case 772769033:
                    if (C3019.f9544 >= 0) {
                        iM2566 = C0630.m2566("֨᩺") ^ i8;
                        i = ((iM2566 ^ i9) * (-12921)) ^ 1729228484;
                        i2 = -1331780658;
                    } else {
                        iM2566 = C0630.m2566("ܿܶ") ^ i9;
                        i = ((iM2566 ^ i8) * (-9175)) ^ (-1112958589);
                        i2 = -1788072223;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -203675473:
                case 1923052272:
                    if (C4616.f14690 <= 0) {
                        iM2566 = C0630.m2566("֨ۨ") ^ i9;
                        i = ((iM2566 ^ i8) * (-20493)) ^ 155965250;
                        i2 = -1466258576;
                    } else {
                        iM2566 = (C0630.m2566("ۘ᩸") + i8) * 15;
                        i = ((iM2566 ^ i9) * 5757) ^ 976808562;
                        i2 = 155925412;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -82227169:
                case 1054776581:
                    intent.setAction(C3245.m9934(sArr2, i6, 26, i5));
                    if (C1128.f4106 <= 0) {
                        iM2566 = (C0630.m2566("ᩴ᩸") ^ i8) * (-5);
                        i = ((iM2566 ^ i9) * 8015) ^ 2120973009;
                        i2 = -520946408;
                    } else {
                        iM2566 = (i8 - C0630.m2566("ۛ۫")) * (-73);
                        i = ((iM2566 ^ i9) * 681) ^ (-1898944996);
                        i2 = 1234916159;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -55888633:
                case 788546539:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = (C0630.m2566("ᩴ᩸") ^ i8) * (-5);
                        i = ((iM2566 ^ i9) * 8015) ^ 2120973009;
                        i2 = -520946408;
                    } else {
                        iM2566 = (C0630.m2566("ۤ᩷") + i9) * (-19);
                        i = ((iM2566 ^ i8) * 22643) ^ 1599913825;
                        i2 = -472189650;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -30371149:
                case 1411519588:
                    if (C2105.f7037 != 0) {
                        iM2566 = C2105.m6981("᩵֫") ^ i9;
                        i = ((iM2566 ^ i8) * (-32221)) ^ (-1926803397);
                        i2 = -1962101879;
                        i11 = iM2566 ^ i2;
                        i10 = i;
                    }
                    iM2566 = C0630.m2566("֨᩺") ^ i8;
                    i = ((iM2566 ^ i9) * (-12921)) ^ 1729228484;
                    i2 = -1331780658;
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case 1306717096:
                case 1957421764:
                    C4117.m12364();
                    if (C7811.m20844() == 0) {
                        iM2566 = C0630.m2566("֨ۨ") ^ i9;
                        i = ((iM2566 ^ i8) * (-20493)) ^ 155965250;
                        i2 = -1466258576;
                        i11 = iM2566 ^ i2;
                        i10 = i;
                    }
                    iM2566 = C2105.m6981("ܽۧ") ^ i8;
                    i = ((iM2566 ^ i9) * 3699) ^ 1890960053;
                    i2 = 1672166775;
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                default:
                    int i13 = 22071204 + i3;
                    i4 = i13 + i13;
                    s2 = 4698;
                    if (C22628.f73083 <= 0) {
                        iM2566 = C2105.m6981("ܽۧ") ^ i8;
                        i = ((iM2566 ^ i9) * 3699) ^ 1890960053;
                        i2 = 1672166775;
                    } else {
                        iM2566 = (C2105.m6981("ۤ۠") + i9) * (-33);
                        i = ((iM2566 ^ i8) * 14969) ^ 1219558438;
                        i2 = -1625521433;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00a1 A[PHI: r3 r14 r16
      0x00a1: PHI (r3v4 java.util.concurrent.ExecutorService) = 
      (r3v2 java.util.concurrent.ExecutorService)
      (r3v1 java.util.concurrent.ExecutorService)
      (r3v1 java.util.concurrent.ExecutorService)
     binds: [B:34:0x0129, B:19:0x009f, B:15:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x00a1: PHI (r14v3 int) = (r14v1 int), (r14v1 int), (r14v4 int) binds: [B:34:0x0129, B:19:0x009f, B:15:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x00a1: PHI (r16v4 int) = (r16v1 int), (r16v2 int), (r16v1 int) binds: [B:34:0x0129, B:19:0x009f, B:15:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x0189 A[PHI: r2 r11 r12
      0x0189: PHI (r2v5 byte[]) = (r2v1 byte[]), (r2v4 byte[]), (r2v1 byte[]) binds: [B:44:0x0185, B:26:0x00d6, B:9:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0189: PHI (r11v2 int) = (r11v1 int), (r11v1 int), (r11v3 int) binds: [B:44:0x0185, B:26:0x00d6, B:9:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0189: PHI (r12v2 int) = (r12v1 int), (r12v1 int), (r12v3 int) binds: [B:44:0x0185, B:26:0x00d6, B:9:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0295 A[PHI: r7 r9 r10 r17
      0x0295: PHI (r7v74 int) = (r7v6 int), (r7v77 int) binds: [B:65:0x0293, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0295: PHI (r9v5 short) = (r9v3 short), (r9v7 short) binds: [B:65:0x0293, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0295: PHI (r10v4 int) = (r10v2 int), (r10v1 int) binds: [B:65:0x0293, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0295: PHI (r17v38 byte[]) = (r17v1 byte[]), (r17v40 byte[]) binds: [B:65:0x0293, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x02b6 A[PHI: r0 r4 r9 r10 r18
      0x02b6: PHI (r0v37 byte[]) = (r0v4 byte[]), (r0v4 byte[]), (r0v4 byte[]), (r0v27 byte[]), (r0v4 byte[]), (r0v38 byte[]) binds: [B:53:0x01d3, B:49:0x01ad, B:44:0x0185, B:31:0x00fc, B:23:0x00c0, B:66:0x0295] A[DONT_GENERATE, DONT_INLINE]
      0x02b6: PHI (r4v3 short[]) = (r4v2 short[]), (r4v1 short[]), (r4v1 short[]), (r4v1 short[]), (r4v1 short[]), (r4v1 short[]) binds: [B:53:0x01d3, B:49:0x01ad, B:44:0x0185, B:31:0x00fc, B:23:0x00c0, B:66:0x0295] A[DONT_GENERATE, DONT_INLINE]
      0x02b6: PHI (r9v4 short) = (r9v3 short), (r9v3 short), (r9v3 short), (r9v3 short), (r9v3 short), (r9v5 short) binds: [B:53:0x01d3, B:49:0x01ad, B:44:0x0185, B:31:0x00fc, B:23:0x00c0, B:66:0x0295] A[DONT_GENERATE, DONT_INLINE]
      0x02b6: PHI (r10v3 int) = (r10v1 int), (r10v1 int), (r10v1 int), (r10v1 int), (r10v1 int), (r10v4 int) binds: [B:53:0x01d3, B:49:0x01ad, B:44:0x0185, B:31:0x00fc, B:23:0x00c0, B:66:0x0295] A[DONT_GENERATE, DONT_INLINE]
      0x02b6: PHI (r18v21 int) = (r18v1 int), (r18v1 int), (r18v1 int), (r18v14 int), (r18v1 int), (r18v22 int) binds: [B:53:0x01d3, B:49:0x01ad, B:44:0x0185, B:31:0x00fc, B:23:0x00c0, B:66:0x0295] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        byte[] bArr;
        int i;
        int iM6981;
        int i2;
        int i3;
        int i4;
        ApplicationC12518.m30701(142);
        f63246 = new short[]{3642, 5138, 5142, 5130, 5142, 5247, 5149, 5150, 5148, 5140, 5130, 5135, 5205, 5646, -4233, -4307, -4296, -4309, -4233, -4307, -4296, -4309, -4233, -4290, -4317, -4233, -4307, -4296, -4317, -4233, -4307, -4290, -4317, -4233, -4307, -4296, -4309, -4233, -4319, -4317, -4233, -4307, -4319, -4317, -4233, -4307, -4296, -4309, -4233, -4317, -4310, -4307, -4233, -4307, -4296, -4309, -4233, -4317, -4310, -4307, -4291, -4233, -4307, -4296, -4309, -4233, -4293, -4317, -4245, -4233, -4307, -4293, -4317, -4245, -4233, -4307, -4293, -4317, -4233, -4307, -4296, -4309, -4233, -4299, -4317, -4243, -4233, -4317, -4304, -4311, -4239, -4250, -4304, -4240, -4239, -4250, -4310, -4240, -4233, -4237, -4347, -4233, -4239, -4317, -4304, -4311, -4347, -4233, -4239, -4250, -4253, -4247, -4247, -4350, -4248, -4236, -4256, -4348, -4315, -4247, -4350, -4248, -4236, -4256, -4348, -4350, -4247, -4236, -4256, -4348, -4315, -4350, -4248, -4236, -4256, -4348, -4350, -4247, -4236, -4256, -4348, -4318, -4245, -4316, -4240, -4315, -4317, -4239, -4250, -4253, -4247, -4350, -4248, -4236, -4256, -4348, -4315, -4350, -4248, -4236, -4256, -4348, -4350, -4247, -4236, -4256, -4348, -4238, -4240, -4240, 2955, 22913, 22931, 22916, 22935, 22957, 22931, 22913, 22957, 22914, 22931, 22918, 22938, 7133, 27604, 27611, 27601, 27591, 27610, 27612, 27601, 27547, 27612, 27611, 27585, 27600, 27611, 27585, 27547, 27604, 27606, 27585, 27612, 27610, 27611, 27547, 27619, 27644, 27632, 27618, 4477, 25171, 25180, 25174, 25152, 25181, 25179, 25174, 25116, 25179, 25180, 25158, 25175, 25180, 25158, 25116, 25171, 25169, 25158, 25179, 25181, 25180, 25116, 25188, 25211, 25207, 25189, 25171, 25162, 25183, 25182, 4458, 22412, -19648, -21102, -17021, 25771, 22355, 20697, -19733, 19645, 18262, 26092, 27266, 24171, 19522, -23437, -16506, -19257, -18921, 28632, -17115, -22543, -22253, 22431, 25936, 27007, -19866, -18978, -17391, 28105, -20335, 4428, -1611, -1602, -1617, 31634, -21107, 31168, -28498, -22798, -32090, -21040, -30700, -32554, -31229, 26806, 32491, 25837, -25556, -29565, -1609, -1612, -1608, -1606, -1609, -28750, -28246, 25944, -25916, 28333, -26932, 24955, 31315, -24848, -21202, 29599, 28728, -23783, -29055, -25791, 26842, 32227, -21357, 27855, -27004, 25830, -24951, -24207, -20939, -25408, -21168, 28492, -26633, -31745, -24113, -21569, 25335, -18716, 30888, -30635, -30697, 31834, 28252, -31341, 2011, 5228, 8159, 11852, -1800, -5979, -4790, 1785, 7265, -3058, 9209, 8087, -1087, -5409, -708, 7069, 32623, 8369, 31770, 31765, 31775, 31753, 31764, 31762, 31775, 31829, 31762, 31765, 31759, 31774, 31765, 31759, 31829, 31770, 31768, 31759, 31762, 31764, 31765, 31829, 31789, 31794, 31806, 31788, 31768, 31767, 31770, 31752, 31752, 7731, 7176, 2351, 21993, 21994, 21990, 21988, 21993, 22015, 21996, 22005, 21992, 21988, 22005, 22005, 21996, 21995, 21986, 22005, 21988, 22012, 21993, 21994, 21988, 21985, 21931, 21991, 21996, 21995, 21931, 21991, 21996, 21995, 21931, 22007, 21984, 21995, 21988, 21992, 21984, 21931, 21991, 21988, 21998, 21995, 21984, 22001, 21988, 22005, 22005, 21993, 21996, 21990, 21988, 22001, 21996, 21994, 21995, 21930, 21994, 21988, 22001, 13440, -12378, -13072, 10210, 12252, 8827, -11771, 12429, 14235, 8744, 14389, 12855, 21931, 21984, 21995, 21990, 22007, 22012, 22005, 22001, 1941, -4606, -4555, -4555, -4568, -4555, -4555, -4574, -4556, -4568, -4558, -4555, -4572, -4574, -4556, -4503, -4570, -4555, -4556, -4572, -4503, -4573, -4574, -4545, -18957, -18073, 27800, -19178, -16600, 27751, 27435, 26340, -26661, -4598, -4558, -4565, -4557, -4562, -4605, -4574, -4545, 31026, -25601, -27628, -25865, 32033, -26281, -32393, 27209, -18871, 5491, -13054, 9074, -9149, -9113, -9109, -9107, -9105, -9124, -9117, -9105, -9091, -9105, -9096, -9141, -9096, -9107, -9089, -9113, -9105, -9116, -9090, -9095, -9117, -9113, -9109, -9107, -9105, -9179, 7317, -8472, 6693, -2125, 7907, 15809, 15810, 15822, 15820, 15809};
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        byte[] bytes = null;
        ExecutorService executorServiceNewSingleThreadExecutor = null;
        short[] sArr = null;
        int i5 = RunnableC3474.f10992;
        int i6 = C11340.f33930;
        int iM2566 = (C0630.m2566("ܶᩳ") ^ i5) * 79;
        int i7 = ((iM2566 ^ i6) * 22719) ^ (-1470873242);
        int i8 = iM2566 ^ (-75966063);
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1076970903;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i14 = i8 ^ (i7 & (((i14 ^ i6) * (-10019)) >> 31));
            switch (i14) {
                case -1989230027:
                case 1864593182:
                    bArr = bArr2;
                    i = i16;
                    i9 = i15 + 73376356;
                    if (C2167.f7158 >= 0) {
                        i16 = i;
                        bArr2 = bArr;
                        iM6981 = C2105.m6981("ܶۨ") ^ i6;
                        i7 = ((iM6981 ^ i5) * 11869) ^ (-93847619);
                        i2 = 1601577749;
                    } else {
                        int iM6982 = C2105.m6981("ܿ᩻") ^ i5;
                        i7 = ((iM6982 ^ i6) * 4841) ^ (-432460258);
                        i16 = i;
                        iM6981 = iM6982;
                        bArr2 = bArr;
                        i2 = 326006295;
                    }
                    i8 = iM6981 ^ i2;
                    break;
                case -1956847013:
                case -131177071:
                    C7811.m20844();
                    C3537.m10746();
                    int iM6983 = (C2105.m6981("ۡܽ") ^ i6) * (-41);
                    i7 = ((iM6983 ^ i5) * o.a.c) ^ 1684222229;
                    i16 = i16;
                    iM6981 = iM6983;
                    bArr2 = bArr2;
                    i2 = -805481434;
                    i8 = iM6981 ^ i2;
                    break;
                case -1698526506:
                case 1072740638:
                    i3 = 7049;
                    int iM6984 = C2105.m6981("ۨ᩷") ^ i5;
                    i16 = i16;
                    iM6981 = iM6984;
                    i7 = ((iM6984 ^ i6) * (-127)) ^ 2086823287;
                    i12 = i3;
                    bArr2 = bArr2;
                    i2 = -1184642305;
                    i8 = iM6981 ^ i2;
                    break;
                case -1614981152:
                case -911927443:
                    f63251 = bArr2;
                    i4 = i16;
                    bArr3 = new byte[i4];
                    if (!C2167.m7155()) {
                        byte[] bArr4 = bArr2;
                        int iM2567 = (C0630.m2566("᩻ۨ") + i5) * 83;
                        i7 = ((iM2567 ^ i6) * (-8015)) ^ 556584750;
                        i16 = i4;
                        iM6981 = iM2567;
                        bArr2 = bArr4;
                        i2 = 1660400117;
                    } else {
                        int iM6985 = C2105.m6981("۫ܺ") ^ i6;
                        i16 = i4;
                        iM6981 = iM6985;
                        i7 = ((iM6985 ^ i5) * 24899) ^ (-1312066100);
                        bArr2 = bArr2;
                        i2 = -1537087231;
                    }
                    i8 = iM6981 ^ i2;
                    break;
                case -1562729605:
                case 1907592263:
                    // fill-array-data instruction
                    bArr3[0] = 55;
                    bArr3[1] = 122;
                    bArr3[2] = -68;
                    bArr3[3] = -81;
                    bArr3[4] = 39;
                    bArr3[5] = 28;
                    f63249 = bArr3;
                    sArr = f63246;
                    if (C1420.m4913()) {
                        iM6981 = C2105.m6981("ܶۨ") ^ i6;
                        i7 = ((iM6981 ^ i5) * 11869) ^ (-93847619);
                        i2 = 1601577749;
                    } else {
                        iM6981 = (C2105.m6981("ۜۨ") + i6) * 93;
                        i7 = ((iM6981 ^ i5) * (-1295)) ^ (-1963294107);
                        i2 = 259975876;
                    }
                    i8 = iM6981 ^ i2;
                    break;
                case -1480813212:
                case 1883968402:
                    ServiceConnectionC3453.m10564();
                    if (RunnableC1937.f6483 < 0) {
                        iM6981 = C2105.m6981("ܶۨ") ^ i6;
                        i7 = ((iM6981 ^ i5) * 11869) ^ (-93847619);
                        i2 = 1601577749;
                    } else {
                        iM6981 = (C2105.m6981("ܳ᩸") ^ i5) * (-95);
                        i7 = ((iM6981 ^ i6) * 18505) ^ (-683433256);
                        i2 = -1042436602;
                    }
                    i8 = iM6981 ^ i2;
                    break;
                case -1410619207:
                case 1046619778:
                    i3 = 5215;
                    int iM6986 = C2105.m6981("ۨ᩷") ^ i5;
                    i16 = i16;
                    iM6981 = iM6986;
                    i7 = ((iM6986 ^ i6) * (-127)) ^ 2086823287;
                    i12 = i3;
                    bArr2 = bArr2;
                    i2 = -1184642305;
                    i8 = iM6981 ^ i2;
                    break;
                case -1257387774:
                case 1808473870:
                    if (C3746.f11829 > 0) {
                        iM6981 = C2105.m6981("ۜۜ") ^ i5;
                        i7 = ((iM6981 ^ i6) * (-10685)) ^ (-1273500118);
                        i2 = 767212499;
                    } else {
                        iM6981 = C2105.m6981("ܶۨ") ^ i6;
                        i7 = ((iM6981 ^ i5) * 11869) ^ (-93847619);
                        i2 = 1601577749;
                    }
                    i8 = iM6981 ^ i2;
                    break;
                case -1050901313:
                case 1516787502:
                    if (i10 - (i11 * i11) >= 0) {
                        iM6981 = (i6 - C2105.m6981("ۡۖ")) * (-121);
                        i7 = ((iM6981 ^ i5) * 17259) ^ (-2024422353);
                        i2 = 328258088;
                    } else {
                        iM6981 = (C2105.m6981("᩸ۛ") + i5) * 13;
                        i7 = ((iM6981 ^ i6) * 17047) ^ (-1631063300);
                        i2 = -957952818;
                    }
                    i8 = iM6981 ^ i2;
                    break;
                case -891250970:
                case 827873716:
                    C0050.m940();
                    C7106.m19120();
                    throw new RuntimeException();
                case -772156406:
                case -689239563:
                    f63252 = bytes;
                    executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                    if (C21923.f70183 != 0) {
                        i4 = i16;
                        int iM6987 = C2105.m6981("۫ܺ") ^ i6;
                        i16 = i4;
                        iM6981 = iM6987;
                        i7 = ((iM6987 ^ i5) * 24899) ^ (-1312066100);
                        bArr2 = bArr2;
                        i2 = -1537087231;
                    } else {
                        iM6981 = C2105.m6981("᩶۠") ^ i5;
                        i7 = ((iM6981 ^ i6) * 20907) ^ 330423746;
                        i2 = 119835174;
                    }
                    i8 = iM6981 ^ i2;
                    break;
                case -662046755:
                case 1901631924:
                    byte[] bArr5 = {82, 97, 114, PublicSuffixDatabase.EXCEPTION_MARKER, 26, 7};
                    if (C0382.f1805) {
                        int iM6988 = C2105.m6981("ۧۙ") ^ i6;
                        i2 = 1268231182;
                        i16 = 6;
                        i7 = ((iM6988 ^ i5) * 8765) ^ (-2145807494);
                        bArr2 = bArr5;
                        iM6981 = iM6988;
                    } else {
                        bArr2 = bArr5;
                        i16 = 6;
                        iM6981 = C2105.m6981("ܶۨ") ^ i6;
                        i7 = ((iM6981 ^ i5) * 11869) ^ (-93847619);
                        i2 = 1601577749;
                    }
                    i8 = iM6981 ^ i2;
                    break;
                case -587292749:
                case 214557734:
                    bytes = C3537.m10748(sArr, i13, 12, i12).getBytes();
                    if (C2105.m6982() != 0) {
                        iM6981 = C2105.m6981("ۜۜ") ^ i5;
                        i7 = ((iM6981 ^ i6) * (-10685)) ^ (-1273500118);
                        i2 = 767212499;
                    } else {
                        iM6981 = (i5 - C2105.m6981("ۨ᩶")) * 29;
                        i7 = ((iM6981 ^ i6) * 18703) ^ 1970985678;
                        i2 = -1047198346;
                    }
                    i8 = iM6981 ^ i2;
                    break;
                case -251179353:
                case 1280355838:
                    if (C4263.m12819() < 0) {
                        int iM6989 = (C2105.m6981("ۡܽ") ^ i6) * (-41);
                        i7 = ((iM6989 ^ i5) * o.a.c) ^ 1684222229;
                        i16 = i16;
                        iM6981 = iM6989;
                        bArr2 = bArr2;
                        i2 = -805481434;
                    } else {
                        iM6981 = C2105.m6981("ܶۨ") ^ i6;
                        i7 = ((iM6981 ^ i5) * 11869) ^ (-93847619);
                        i2 = 1601577749;
                    }
                    i8 = iM6981 ^ i2;
                    break;
                case 59383860:
                case 1067225614:
                    i15 = s * s;
                    if (C0964.m3413()) {
                        iM6981 = (C2105.m6981("ۢۡ") ^ i6) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i7 = ((iM6981 ^ i5) * 19291) ^ 737802703;
                        i2 = 613951604;
                    } else {
                        i4 = i16;
                        int iM69810 = C2105.m6981("۫ܺ") ^ i6;
                        i16 = i4;
                        iM6981 = iM69810;
                        i7 = ((iM69810 ^ i5) * 24899) ^ (-1312066100);
                        bArr2 = bArr2;
                        i2 = -1537087231;
                    }
                    i8 = iM6981 ^ i2;
                    break;
                case 484370540:
                case 1102491580:
                    i13 = 1;
                    if (C7106.f21815 != 0) {
                        i4 = i16;
                        int iM69811 = C2105.m6981("۫ܺ") ^ i6;
                        i16 = i4;
                        iM6981 = iM69811;
                        i7 = ((iM69811 ^ i5) * 24899) ^ (-1312066100);
                        bArr2 = bArr2;
                        i2 = -1537087231;
                    } else {
                        iM6981 = C2105.m6981("᩷᩵") ^ i6;
                        i7 = ((iM6981 ^ i5) * (-26867)) ^ 750619286;
                        i2 = -656372284;
                    }
                    i8 = iM6981 ^ i2;
                    break;
                case 710271882:
                case 1724742817:
                    f63250 = executorServiceNewSingleThreadExecutor;
                    f63248 = new HashSet();
                    return;
                case 1921269926:
                case 2042007021:
                    i10 = i9 + i9;
                    i11 = s + 8566;
                    if (C1005.f3721) {
                        iM6981 = C2105.m6981("᩹ᩳ") ^ i6;
                        i7 = ((iM6981 ^ i5) * (-6283)) ^ 1819592214;
                        i2 = 360049817;
                    } else {
                        iM6981 = C2105.m6981("ۜۜ") ^ i5;
                        i7 = ((iM6981 ^ i6) * (-10685)) ^ (-1273500118);
                        i2 = 767212499;
                    }
                    i8 = iM6981 ^ i2;
                    break;
                default:
                    bArr = bArr2;
                    i = i16;
                    s = f63246[0];
                    if (RunnableC1108.f4040) {
                        int iM69812 = C2105.m6981("ۖܳ") ^ i5;
                        i7 = ((iM69812 ^ i6) * 17949) ^ 407328486;
                        i16 = i;
                        iM6981 = iM69812;
                        bArr2 = bArr;
                        i2 = 1584825534;
                    } else {
                        i16 = i;
                        bArr2 = bArr;
                        iM6981 = C2105.m6981("ܶۨ") ^ i6;
                        i7 = ((iM6981 ^ i5) * 11869) ^ (-93847619);
                        i2 = 1601577749;
                    }
                    i8 = iM6981 ^ i2;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45009(C16560 c16560, InterfaceC17889 interfaceC17889, InterfaceC18862 interfaceC18862) {
        AbstractC16891 abstractC16891M7043 = null;
        int i = -313274302;
        int i2 = C2167.f7158;
        int i3 = C0630.f2410;
        int iM6981 = (i3 - C2105.m6981("᩹֡")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
        int i4 = ((iM6981 ^ i2) * (-13665)) ^ (-940493895);
        int i5 = 2009174105;
        while (true) {
            i = ((((i ^ i2) * (-27883)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2124787162:
                case 111290447:
                    if (C4263.f13799 <= 0) {
                        iM6981 = C0630.m2566("ۗ᩺") ^ i3;
                        i4 = ((iM6981 ^ i2) * 10981) ^ 1434692612;
                        i5 = -630045719;
                    } else {
                        iM6981 = C0630.m2566("᩸ۜ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 21379) ^ 1888309773;
                        i5 = 1122383680;
                    }
                    break;
                case -2083070995:
                case -51519145:
                    if (RunnableC1108.f4040) {
                        iM6981 = C2105.m6981("ۨ᩺") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-15009)) ^ (-1447350655);
                        i5 = 1682728848;
                    } else {
                        iM6981 = (C0630.m2566("ܰۖ") ^ i3) * 99;
                        i4 = ((iM6981 ^ i2) * (-13035)) ^ (-1876992893);
                        i5 = -1883237007;
                    }
                    break;
                case -1897094172:
                case -404180990:
                    if (C4117.m12364() != 0) {
                        iM6981 = C2105.m6981("ۢۙ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 20697) ^ (-1949578378);
                        i5 = -1641803863;
                    } else {
                        iM6981 = (C2105.m6981("ܿ֨") ^ i2) * (-59);
                        i4 = ((iM6981 ^ i3) * 13369) ^ (-1180355700);
                        i5 = -2010552074;
                    }
                    break;
                case -1647042095:
                case 1820134828:
                    if (!C1711.f5919) {
                        iM6981 = C2105.m6981("ۢۙ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 20697) ^ (-1949578378);
                        i5 = -1641803863;
                    } else {
                        iM6981 = C0630.m2566("֨ۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 3469) ^ (-506603290);
                        i5 = -1557031762;
                    }
                    break;
                case -1522755823:
                case -996918056:
                    C1420.m4913();
                    C3019.m9255();
                    iM6981 = C0630.m2566("᩻ܿ") ^ i2;
                    i4 = ((iM6981 ^ i3) * (-10605)) ^ (-977723839);
                    i5 = 426068729;
                    break;
                case -1321343133:
                case 408281954:
                    if (C2126.f7087) {
                        iM6981 = C0630.m2566("᩻ܿ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-10605)) ^ (-977723839);
                        i5 = 426068729;
                    } else {
                        iM6981 = C2105.m6981("ܶۡ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-2315)) ^ 1288905206;
                        i5 = -1160349481;
                    }
                    break;
                case -1122362588:
                case -623307413:
                    if (C2520.f8000 >= 0) {
                        iM6981 = C0630.m2566("ۗ᩺") ^ i3;
                        i4 = ((iM6981 ^ i2) * 10981) ^ 1434692612;
                        i5 = -630045719;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۚۘ")) * (-51);
                        i4 = ((iM6981 ^ i2) * 24985) ^ 718068046;
                        i5 = 41960905;
                    }
                    break;
                case -1070531845:
                case 513632438:
                    C0050.m940();
                    C1773.m5908();
                    break;
                case -983796594:
                case 2053615304:
                    C4159.m12565();
                    if (C2958.f9394 < 0) {
                        iM6981 = C2105.m6981("ۢۙ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 20697) ^ (-1949578378);
                        i5 = -1641803863;
                    } else {
                        iM6981 = C0630.m2566("᩻ܿ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-10605)) ^ (-977723839);
                        i5 = 426068729;
                    }
                    break;
                case -738342970:
                case 1874435821:
                    if (C0483.f2088 >= 0) {
                        iM6981 = (C0630.m2566("ܰۖ") ^ i3) * 99;
                        i4 = ((iM6981 ^ i2) * (-13035)) ^ (-1876992893);
                        i5 = -1883237007;
                    } else {
                        iM6981 = (C2105.m6981("֫ۚ") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM6981 ^ i2) * (-31155)) ^ 2022079233;
                        i5 = 1586277356;
                    }
                    break;
                case -695753435:
                case 2019828572:
                    abstractC16891M7043.m39738(c16560, interfaceC17889, new C20068(interfaceC17889, interfaceC18862));
                    break;
                case -328448095:
                case 952763505:
                    if (C0714.m2805()) {
                        iM6981 = C0630.m2566("۬ܳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-26891)) ^ (-639149003);
                        i5 = -1118272893;
                    } else {
                        iM6981 = C0630.m2566("ۗ᩺") ^ i3;
                        i4 = ((iM6981 ^ i2) * 10981) ^ 1434692612;
                        i5 = -630045719;
                    }
                    break;
                case 356112107:
                case 1669337754:
                    if (C3019.m9255() <= 0) {
                        iM6981 = (C0630.m2566("ܰۖ") ^ i3) * 99;
                        i4 = ((iM6981 ^ i2) * (-13035)) ^ (-1876992893);
                        i5 = -1883237007;
                    } else {
                        iM6981 = C0630.m2566("ܳܿ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-28669)) ^ 221910543;
                        i5 = 179023244;
                    }
                    break;
                case 1599214727:
                case 1722662352:
                    abstractC16891M7043 = C2126.m7043(c16560);
                    if (C0382.f1805) {
                        iM6981 = C0630.m2566("᩺ۗ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 24243) ^ (-555116386);
                        i5 = -1590586137;
                    } else {
                        iM6981 = C0630.m2566("ۗ᩺") ^ i3;
                        i4 = ((iM6981 ^ i2) * 10981) ^ 1434692612;
                        i5 = -630045719;
                    }
                    break;
                case 1631326365:
                case 2047536660:
                    if (RunnableC1937.m6387() != 0) {
                        iM6981 = C0630.m2566("֨ۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 3469) ^ (-506603290);
                        i5 = -1557031762;
                    } else {
                        iM6981 = C0630.m2566("᩵ᩳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-1647)) ^ 1232253833;
                        i5 = 98678111;
                    }
                    break;
                default:
                    if (C2167.f7158 < 0) {
                        iM6981 = (C0630.m2566("ܰۖ") ^ i3) * 99;
                        i4 = ((iM6981 ^ i2) * (-13035)) ^ (-1876992893);
                        i5 = -1883237007;
                    } else {
                        iM6981 = C0630.m2566("֨ۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 3469) ^ (-506603290);
                        i5 = -1557031762;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45010(InterfaceC17889 interfaceC17889, InterfaceC18862 interfaceC18862, C10211 c10211) {
        c10211.m25619();
        AbstractC15440 abstractC15440M25622 = c10211.m25622();
        synchronized (C19568.class) {
            f63247 = C2958.m9025(abstractC15440M25622);
            f63253 = interfaceC17889.getPath();
        }
        interfaceC18862.mo6267(abstractC15440M25622);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m44997(String str) {
        synchronized (C19568.class) {
            if (!C1294.m4369(str, f63247)) {
                return str;
            }
            return f63253;
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0395 A[PHI: r8 r32 r34
      0x0395: PHI (r8v4 java.lang.String) = 
      (r8v2 java.lang.String)
      (r8v3 java.lang.String)
      (r8v2 java.lang.String)
      (r8v2 java.lang.String)
      (r8v2 java.lang.String)
      (r8v2 java.lang.String)
      (r8v2 java.lang.String)
      (r8v2 java.lang.String)
      (r8v2 java.lang.String)
      (r8v2 java.lang.String)
      (r8v2 java.lang.String)
      (r8v2 java.lang.String)
      (r8v2 java.lang.String)
     binds: [B:70:0x037e, B:63:0x035d, B:60:0x032d, B:57:0x0305, B:54:0x02db, B:51:0x02b3, B:48:0x028b, B:45:0x0261, B:42:0x0236, B:39:0x020d, B:36:0x01e4, B:33:0x01ba, B:29:0x018e] A[DONT_GENERATE, DONT_INLINE]
      0x0395: PHI (r32v105 int) = 
      (r32v93 int)
      (r32v94 int)
      (r32v95 int)
      (r32v96 int)
      (r32v97 int)
      (r32v98 int)
      (r32v99 int)
      (r32v100 int)
      (r32v101 int)
      (r32v102 int)
      (r32v103 int)
      (r32v104 int)
      (r32v106 int)
     binds: [B:70:0x037e, B:63:0x035d, B:60:0x032d, B:57:0x0305, B:54:0x02db, B:51:0x02b3, B:48:0x028b, B:45:0x0261, B:42:0x0236, B:39:0x020d, B:36:0x01e4, B:33:0x01ba, B:29:0x018e] A[DONT_GENERATE, DONT_INLINE]
      0x0395: PHI (r34v82 int) = 
      (r34v70 int)
      (r34v71 int)
      (r34v72 int)
      (r34v73 int)
      (r34v74 int)
      (r34v75 int)
      (r34v76 int)
      (r34v77 int)
      (r34v78 int)
      (r34v79 int)
      (r34v80 int)
      (r34v81 int)
      (r34v83 int)
     binds: [B:70:0x037e, B:63:0x035d, B:60:0x032d, B:57:0x0305, B:54:0x02db, B:51:0x02b3, B:48:0x028b, B:45:0x0261, B:42:0x0236, B:39:0x020d, B:36:0x01e4, B:33:0x01ba, B:29:0x018e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC4045 m44998(AbstractC15440 abstractC15440) throws Throwable {
        byte b;
        int i;
        byte[] bArr;
        Throwable th;
        int i2;
        int i3;
        int iM6981;
        int i4;
        int i5;
        int i6;
        int iM6982;
        int i7;
        int i8;
        int i9;
        int iM2566;
        int i10;
        int i11;
        int iM6983;
        int i12;
        int i13;
        int iM2567;
        int i14;
        int i15;
        int iM2568;
        int i16;
        int i17;
        int i18;
        InputStream inputStream;
        int i19;
        int iM6984;
        int i20;
        int i21;
        int iM2569;
        int i22;
        int i23;
        int i24 = C1047.f3863;
        int i25 = C3537.f11231;
        int iM6985 = C2105.m6981("ܶ۠") ^ i24;
        int i26 = ((iM6985 ^ i25) * (-841)) ^ (-1819296249);
        Throwable th2 = null;
        Object obj = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        String strM6378 = null;
        int i27 = iM6985 ^ (-1893380856);
        InputStream inputStreamM9930 = null;
        int i28 = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        byte b5 = 0;
        boolean z = false;
        int i33 = 0;
        int iM2127 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        byte b6 = 0;
        int i34 = -256948448;
        byte b7 = 0;
        byte[] bArr5 = null;
        int length = 0;
        while (true) {
            i34 = i27 ^ (i26 & (((i34 ^ i25) * 7883) >> 31));
            switch (i34) {
                case -2074086882:
                case -1267953121:
                    z2 = true;
                    iM6983 = C2105.m6981("۠ܳ") ^ i25;
                    i12 = ((iM6983 ^ i24) * (-28383)) ^ (-1121523449);
                    i13 = -1805173745;
                    i27 = iM6983 ^ i13;
                    i26 = i12;
                    b7 = b7;
                    i28 = i28;
                    th2 = th2;
                    bArr5 = bArr5;
                    iM2127 = iM2127;
                    length = length;
                    b6 = b6;
                    i30 = i30;
                    break;
                case -2070273508:
                case 971314138:
                    i29 = i29;
                    i30 = i30;
                    if (C3746.m11370(strM6378, RunnableC1937.m6385(f63246, 78, 8, i31))) {
                        iM2569 = (C0630.m2566("ܰᩴ") + i24) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i22 = ((iM2569 ^ i25) * 24517) ^ 574245079;
                        i23 = 1411003477;
                    } else {
                        iM2569 = (C0630.m2566("֡ۗ") ^ i24) * (-83);
                        i22 = ((iM2569 ^ i25) * (-31169)) ^ 2091449852;
                        i23 = 478328637;
                    }
                    int i35 = iM2569 ^ i23;
                    i30 = i30;
                    int i36 = i29;
                    i27 = i35;
                    i26 = i22;
                    i29 = i36;
                    break;
                case -2025886049:
                case 654023563:
                    i28++;
                    iM2569 = (i25 - C2105.m6981("ܿۘ")) * 89;
                    i22 = ((iM2569 ^ i24) * 20397) ^ 1354852731;
                    i23 = 1568585284;
                    int i37 = iM2569 ^ i23;
                    i30 = i30;
                    int i38 = i29;
                    i27 = i37;
                    i26 = i22;
                    i29 = i38;
                    break;
                case -1976931440:
                case 1119845708:
                    return EnumC4045.f12836;
                case -1943815225:
                case -148196255:
                    i30 = i30;
                    b6 = b6;
                    b = b7;
                    length = length;
                    i = iM2127;
                    bArr = bArr5;
                    th = th2;
                    i2 = i28;
                    try {
                        C2272.m7512(inputStreamM9930);
                        i9 = i;
                        iM2566 = C0630.m2566("ۗۛ") ^ i24;
                        i10 = ((iM2566 ^ i25) * 6323) ^ 287528165;
                        i11 = -1189632627;
                        int i39 = iM2566 ^ i11;
                        b7 = b;
                        i28 = i2;
                        th2 = th;
                        bArr5 = bArr;
                        iM2127 = i9;
                        i27 = i39;
                        i26 = i10;
                        length = length;
                        b6 = b6;
                        i30 = i30;
                    } catch (Throwable th3) {
                        int iM6986 = C2105.m6981("۟۟") ^ i24;
                        obj = th3;
                        i26 = ((iM6986 ^ i25) * (-30013)) ^ 1544173653;
                        b7 = b;
                        length = length;
                        b6 = b6;
                        i30 = i30;
                        i3 = i2;
                        th2 = th;
                        bArr5 = bArr;
                        iM2127 = i;
                        i27 = iM6986 ^ (-938492362);
                        i28 = i3;
                    }
                    break;
                case -1919988422:
                case -502688203:
                    i29 = i29;
                    i30 = i30;
                    if (C1128.m3850(strM6378, C0237.m1483(f63246, 40, 4, i31))) {
                        iM2569 = (C0630.m2566("ܰᩴ") + i24) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i22 = ((iM2569 ^ i25) * 24517) ^ 574245079;
                        i23 = 1411003477;
                    } else {
                        iM2569 = C0630.m2566("ܿ᩹") ^ i25;
                        i22 = ((iM2569 ^ i24) * 26859) ^ (-192049888);
                        i23 = 94988433;
                    }
                    int i310 = iM2569 ^ i23;
                    i30 = i30;
                    int i311 = i29;
                    i27 = i310;
                    i26 = i22;
                    i29 = i311;
                    break;
                case -1911963622:
                case 861295046:
                    return EnumC4045.f12832;
                case -1909619370:
                case -1267041555:
                    i29 = i29;
                    i30 = i30;
                    if (i28 < length) {
                        iM2569 = (C0630.m2566("ܳᩳ") ^ i25) * 45;
                        i22 = ((iM2569 ^ i24) * 11655) ^ 192632989;
                        i23 = 177640202;
                    } else {
                        iM2569 = (C0630.m2566("ᩳۜ") + i24) * (-113);
                        i22 = ((iM2569 ^ i25) * (-3049)) ^ 893919215;
                        i23 = 957729237;
                    }
                    int i312 = iM2569 ^ i23;
                    i30 = i30;
                    int i313 = i29;
                    i27 = i312;
                    i26 = i22;
                    i29 = i313;
                    break;
                case -1888840939:
                case -846517647:
                    i29 = i29;
                    i30 = i30;
                    if (C3746.m11370(strM6378, C1047.m3603(f63246, 29, 4, i31))) {
                        iM2569 = (C0630.m2566("ܰᩴ") + i24) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i22 = ((iM2569 ^ i25) * 24517) ^ 574245079;
                        i23 = 1411003477;
                    } else {
                        iM2569 = (i25 - C0630.m2566("ܿۖ")) * (-69);
                        i22 = ((iM2569 ^ i24) * (-27415)) ^ 510757734;
                        i23 = -1557422763;
                    }
                    int i314 = iM2569 ^ i23;
                    i30 = i30;
                    int i315 = i29;
                    i27 = i314;
                    i26 = i22;
                    i29 = i315;
                    break;
                case -1878626231:
                case 886306572:
                    return EnumC4045.f12835;
                case -1850131017:
                case 1285324685:
                    b7 = b7;
                    byte b8 = b6;
                    length = length;
                    int i40 = i30;
                    b6 = b8;
                    try {
                        bArr2 = f63251;
                        iM6981 = (C2105.m6981("᩷ۡ") ^ i24) * (-69);
                        i30 = i40;
                        i4 = ((iM6981 ^ i25) * 10271) ^ 1645082985;
                        i5 = 2129591127;
                        i27 = iM6981 ^ i5;
                        i26 = i4;
                        b7 = b7;
                        length = length;
                        b6 = b6;
                        i30 = i30;
                    } catch (Throwable th4) {
                        th = th4;
                        i30 = i40;
                        i28 = i28;
                        i18 = i33;
                        i17 = iM2127;
                        inputStream = inputStreamM9930;
                        int iM25610 = C0630.m2566("᩺᩸") ^ i25;
                        int i41 = ((iM25610 ^ i24) * (-27453)) ^ 100950350;
                        b7 = b7;
                        iM2127 = i17;
                        i27 = iM25610 ^ 666843940;
                        inputStreamM9930 = inputStream;
                        i33 = i18;
                        length = length;
                        b6 = b6;
                        i30 = i30;
                        i3 = i28;
                        th2 = th;
                        i26 = i41;
                        i28 = i3;
                    }
                    break;
                case -1841034307:
                case -1066025851:
                    i29 = i29;
                    i30 = i30;
                    if (C3746.m11370(strM6378, C7106.m19110(f63246, 74, 4, i31))) {
                        iM2569 = (C0630.m2566("ܰᩴ") + i24) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i22 = ((iM2569 ^ i25) * 24517) ^ 574245079;
                        i23 = 1411003477;
                    } else {
                        iM2569 = (i25 - C0630.m2566("֨֨")) * (-81);
                        i22 = ((iM2569 ^ i24) * 21377) ^ 1304076473;
                        i23 = 540427146;
                    }
                    int i316 = iM2569 ^ i23;
                    i30 = i30;
                    int i317 = i29;
                    i27 = i316;
                    i26 = i22;
                    i29 = i317;
                    break;
                case -1807809711:
                case 322854212:
                    i31 = 61273;
                    iM6982 = (C2105.m6981("ۙܰ") ^ i25) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i7 = ((iM6982 ^ i24) * (-5551)) ^ 746441616;
                    i8 = -713985244;
                    int i42 = iM6982 ^ i8;
                    b7 = b7;
                    i28 = i28;
                    th2 = th2;
                    bArr5 = bArr5;
                    iM2127 = iM2127;
                    i27 = i42;
                    i26 = i7;
                    inputStreamM9930 = inputStreamM9930;
                    i33 = i33;
                    length = length;
                    b6 = b6;
                    i30 = i30;
                    break;
                case -1714665582:
                case 41042189:
                    i30 = i30;
                    i17 = iM2127;
                    b6 = b6;
                    b7 = b7;
                    length = length;
                    byte[] bArr6 = bArr5;
                    i18 = i33;
                    Throwable th5 = th2;
                    i28 = i28;
                    try {
                        byte[] bArr7 = new byte[i18];
                        try {
                            C22194.m49844(inputStreamM9930, bArr7, i18);
                            inputStream = inputStreamM9930;
                            try {
                                iM2127 = C0483.m2127(0, bArr7);
                                int iM25611 = (C0630.m2566("ۚ۠") ^ i25) * 95;
                                i27 = iM25611 ^ (-1186298355);
                                i26 = ((iM25611 ^ i24) * 19505) ^ 653684759;
                                b7 = b7;
                                inputStreamM9930 = inputStream;
                                z = false;
                                i33 = i18;
                                length = length;
                                b6 = b6;
                                i30 = i30;
                                i3 = i28;
                                th2 = th5;
                                bArr5 = bArr7;
                            } catch (Throwable th6) {
                                th = th6;
                                bArr5 = bArr7;
                                z = false;
                                int iM25612 = C0630.m2566("᩺᩸") ^ i25;
                                int i43 = ((iM25612 ^ i24) * (-27453)) ^ 100950350;
                                b7 = b7;
                                iM2127 = i17;
                                i27 = iM25612 ^ 666843940;
                                inputStreamM9930 = inputStream;
                                i33 = i18;
                                length = length;
                                b6 = b6;
                                i30 = i30;
                                i3 = i28;
                                th2 = th;
                                i26 = i43;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            inputStream = inputStreamM9930;
                            bArr5 = bArr7;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        inputStream = inputStreamM9930;
                        bArr5 = bArr6;
                    }
                    i28 = i3;
                    break;
                case -1612770665:
                case 1619913721:
                    i29 = i29;
                    i30 = i30;
                    if (C1047.m3595(C1005.m3496(abstractC15440)).matches(C1005.m3502(f63246, 90, 80, i31))) {
                        iM2569 = C0630.m2566("۟᩻") ^ i24;
                        i22 = ((iM2569 ^ i25) * 32295) ^ (-263787352);
                        i23 = 600985502;
                    } else {
                        iM2569 = (C2105.m6981("ᩴۗ") + i25) * (-65);
                        i22 = ((iM2569 ^ i24) * (-16887)) ^ 308099983;
                        i23 = -1948116321;
                    }
                    int i318 = iM2569 ^ i23;
                    i30 = i30;
                    int i319 = i29;
                    i27 = i318;
                    i26 = i22;
                    i29 = i319;
                    break;
                case -1607452997:
                case 1469238119:
                    i29 = i29;
                    i30 = i30;
                    if (b5 != b2) {
                        iM2569 = C2105.m6981("֫᩻") ^ i24;
                        i22 = ((iM2569 ^ i25) * 23667) ^ 13561996;
                        i23 = -120659573;
                    } else {
                        iM2569 = (C0630.m2566("ܽۚ") + i25) * (-45);
                        i22 = ((iM2569 ^ i24) * 8613) ^ (-220834935);
                        i23 = 1728876687;
                    }
                    int i3110 = iM2569 ^ i23;
                    i30 = i30;
                    int i3111 = i29;
                    i27 = i3110;
                    i26 = i22;
                    i29 = i3111;
                    break;
                case -1588993210:
                case 1967984050:
                    i29 = i29;
                    i30 = i30;
                    if (C1128.m3850(RunnableC1937.m6378(C1005.m3496(abstractC15440)), C0483.m2128(f63246, 86, 4, i31))) {
                        iM2569 = (C0630.m2566("᩻ᩳ") + i24) * (-41);
                        i22 = ((iM2569 ^ i25) * 21121) ^ (-444670517);
                        i23 = -1232226996;
                    } else {
                        iM2569 = C0630.m2566("ᩳ۬") ^ i25;
                        i22 = ((iM2569 ^ i24) * (-13469)) ^ 1426435776;
                        i23 = 1315251204;
                    }
                    int i3112 = iM2569 ^ i23;
                    i30 = i30;
                    int i3113 = i29;
                    i27 = i3112;
                    i26 = i22;
                    i29 = i3113;
                    break;
                case -1557742650:
                case -191773654:
                    i19 = 0;
                    int iM25613 = (C0630.m2566("ܰ᩸") ^ i24) * (-25);
                    int i44 = i19;
                    i26 = ((iM25613 ^ i25) * 27273) ^ 1358505869;
                    b7 = b7;
                    i27 = iM25613 ^ (-1994817141);
                    length = length;
                    b6 = b6;
                    i30 = i44;
                    break;
                case -1553433477:
                case 405647034:
                    i29 = i29;
                    i30 = i30;
                    byte[] bArr8 = f63252;
                    try {
                        length = bArr8.length;
                        int iM25614 = C0630.m2566("᩹ܰ") ^ i25;
                        i6 = ((iM25614 ^ i24) * (-20207)) ^ 1455445322;
                        bArr4 = bArr8;
                        i29 = i29;
                        i27 = iM25614 ^ (-1469119675);
                        i26 = i6;
                        i30 = i30;
                    } catch (Throwable th9) {
                        th = th9;
                        bArr4 = bArr8;
                        b6 = b6;
                        i29 = i29;
                        b7 = b7;
                        length = length;
                        i18 = i33;
                        i17 = iM2127;
                        inputStream = inputStreamM9930;
                        int iM25615 = C0630.m2566("᩺᩸") ^ i25;
                        int i45 = ((iM25615 ^ i24) * (-27453)) ^ 100950350;
                        b7 = b7;
                        iM2127 = i17;
                        i27 = iM25615 ^ 666843940;
                        inputStreamM9930 = inputStream;
                        i33 = i18;
                        length = length;
                        b6 = b6;
                        i30 = i30;
                        i3 = i28;
                        th2 = th;
                        i26 = i45;
                        i28 = i3;
                    }
                    break;
                case -1540768225:
                case 1163698634:
                    i32++;
                    iM6981 = C0630.m2566("۬ۙ") ^ i25;
                    i4 = ((iM6981 ^ i24) * 12397) ^ (-903316179);
                    i5 = -1048486752;
                    i27 = iM6981 ^ i5;
                    i26 = i4;
                    b7 = b7;
                    length = length;
                    b6 = b6;
                    i30 = i30;
                    break;
                case -1517098671:
                case -283978203:
                    i32 = 0;
                    iM6981 = C0630.m2566("۬ۙ") ^ i25;
                    i4 = ((iM6981 ^ i24) * 12397) ^ (-903316179);
                    i5 = -1048486752;
                    i27 = iM6981 ^ i5;
                    i26 = i4;
                    b7 = b7;
                    length = length;
                    b6 = b6;
                    i30 = i30;
                    break;
                case -1506352820:
                case 1908260788:
                    int i46 = i30;
                    byte b9 = b6;
                    byte b10 = b7;
                    int i47 = length;
                    if (i46 < 6) {
                        iM6984 = C2105.m6981("ܰۜ") ^ i25;
                        i20 = ((iM6984 ^ i24) * (-20387)) ^ 484015263;
                        i21 = 2090427434;
                    } else {
                        iM6984 = (C2105.m6981("۠۠") + i25) * (-65);
                        i20 = ((iM6984 ^ i24) * (-26249)) ^ (-565996486);
                        i21 = -2024756673;
                    }
                    i27 = iM6984 ^ i21;
                    i26 = i20;
                    b7 = b10;
                    i29 = 6;
                    i30 = i46;
                    length = i47;
                    b6 = b9;
                    break;
                case -1451241824:
                case -1390375476:
                    i30 = i30;
                    b7 = b7;
                    length = length;
                    byte b11 = bArr5[i30];
                    try {
                        b7 = bArr2[i30];
                        int iM25616 = (i24 - C0630.m2566("᩷ᩴ")) * 109;
                        i27 = iM25616 ^ 1056325602;
                        i26 = ((iM25616 ^ i25) * (-10807)) ^ (-597143356);
                        i30 = i30;
                        b6 = b11;
                        length = length;
                    } catch (Throwable th10) {
                        th = th10;
                        b6 = b11;
                        i28 = i28;
                        i18 = i33;
                        i17 = iM2127;
                        inputStream = inputStreamM9930;
                        int iM25617 = C0630.m2566("᩺᩸") ^ i25;
                        int i48 = ((iM25617 ^ i24) * (-27453)) ^ 100950350;
                        b7 = b7;
                        iM2127 = i17;
                        i27 = iM25617 ^ 666843940;
                        inputStreamM9930 = inputStream;
                        i33 = i18;
                        length = length;
                        b6 = b6;
                        i30 = i30;
                        i3 = i28;
                        th2 = th;
                        i26 = i48;
                        i28 = i3;
                    }
                    break;
                case -1424717447:
                case 1777156169:
                    i29 = i29;
                    i30 = i30;
                    RunnableC1108.m3785(inputStreamM9930);
                    iM2569 = C2105.m6981("᩻᩵") ^ i25;
                    i22 = ((iM2569 ^ i24) * (-15089)) ^ (-1170602945);
                    i23 = 924785087;
                    int i3114 = iM2569 ^ i23;
                    i30 = i30;
                    int i3115 = i29;
                    i27 = i3114;
                    i26 = i22;
                    i29 = i3115;
                    break;
                case -1364548213:
                case -838823078:
                    return EnumC4045.f12834;
                case -1249025989:
                case 1250381416:
                    i29 = i29;
                    i30 = i30;
                    z6 = true;
                    iM2569 = C2105.m6981("ܺۜ") ^ i24;
                    i22 = ((iM2569 ^ i25) * (-31863)) ^ 1173479079;
                    i23 = -353649207;
                    int i3116 = iM2569 ^ i23;
                    i30 = i30;
                    int i3117 = i29;
                    i27 = i3116;
                    i26 = i22;
                    i29 = i3117;
                    break;
                case -1210045844:
                case 1179088382:
                    i31 = 63327;
                    iM6982 = (C2105.m6981("ۙܰ") ^ i25) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i7 = ((iM6982 ^ i24) * (-5551)) ^ 746441616;
                    i8 = -713985244;
                    int i49 = iM6982 ^ i8;
                    b7 = b7;
                    i28 = i28;
                    th2 = th2;
                    bArr5 = bArr5;
                    iM2127 = iM2127;
                    i27 = i49;
                    i26 = i7;
                    inputStreamM9930 = inputStreamM9930;
                    i33 = i33;
                    length = length;
                    b6 = b6;
                    i30 = i30;
                    break;
                case -1175736592:
                case 1770248312:
                    i29 = i29;
                    i30 = i30;
                    if (C1128.m3850(strM6378, C3432.m10488(f63246, 52, 9, i31))) {
                        iM2569 = (C0630.m2566("ܰᩴ") + i24) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i22 = ((iM2569 ^ i25) * 24517) ^ 574245079;
                        i23 = 1411003477;
                    } else {
                        iM2569 = (C2105.m6981("᩻ۜ") ^ i25) * (-67);
                        i22 = ((iM2569 ^ i24) * (-24921)) ^ (-645343462);
                        i23 = -461068123;
                    }
                    int i3118 = iM2569 ^ i23;
                    i30 = i30;
                    int i3119 = i29;
                    i27 = i3118;
                    i26 = i22;
                    i29 = i3119;
                    break;
                case -1116724063:
                case 804332637:
                    i30 = i30;
                    b6 = b6;
                    b7 = b7;
                    length = length;
                    try {
                        bArr3 = f63249;
                        iM6981 = (C2105.m6981("ۗۨ") + i25) * (-13);
                        i4 = ((iM6981 ^ i24) * 24349) ^ (-1459449412);
                        i5 = -65164464;
                        i27 = iM6981 ^ i5;
                        i26 = i4;
                        b7 = b7;
                        length = length;
                        b6 = b6;
                        i30 = i30;
                    } catch (Throwable th11) {
                        th = th11;
                        i28 = i28;
                        i18 = i33;
                        i17 = iM2127;
                        inputStream = inputStreamM9930;
                        int iM25618 = C0630.m2566("᩺᩸") ^ i25;
                        int i410 = ((iM25618 ^ i24) * (-27453)) ^ 100950350;
                        b7 = b7;
                        iM2127 = i17;
                        i27 = iM25618 ^ 666843940;
                        inputStreamM9930 = inputStream;
                        i33 = i18;
                        length = length;
                        b6 = b6;
                        i30 = i30;
                        i3 = i28;
                        th2 = th;
                        i26 = i410;
                        i28 = i3;
                    }
                    break;
                case -1017460710:
                case 949792521:
                    z4 = true;
                    iM6981 = (C0630.m2566("᩷ۢ") ^ i24) * 57;
                    i4 = ((iM6981 ^ i25) * 22275) ^ 484767092;
                    i5 = -1350438449;
                    i27 = iM6981 ^ i5;
                    i26 = i4;
                    b7 = b7;
                    length = length;
                    b6 = b6;
                    i30 = i30;
                    break;
                case -984606808:
                case 87961919:
                    return EnumC4045.f12831;
                case -882637380:
                case 71796350:
                    i30 = i30;
                    b6 = b6;
                    b7 = b7;
                    if (b6 != b7) {
                        iM6981 = (C0630.m2566("ۤ۫") + i25) * 3;
                        length = length;
                        i4 = ((iM6981 ^ i24) * 11251) ^ 90454292;
                        i5 = 1901299486;
                    } else {
                        length = length;
                        iM6981 = (i24 - C0630.m2566("ܽ֡")) * (-33);
                        i4 = ((iM6981 ^ i25) * 13343) ^ (-1592882901);
                        i5 = -405035725;
                    }
                    i27 = iM6981 ^ i5;
                    i26 = i4;
                    b7 = b7;
                    length = length;
                    b6 = b6;
                    i30 = i30;
                    break;
                case -857721460:
                case 612325064:
                    i19 = i30 + 1;
                    int iM25619 = (C0630.m2566("ܰ᩸") ^ i24) * (-25);
                    int i411 = i19;
                    i26 = ((iM25619 ^ i25) * 27273) ^ 1358505869;
                    b7 = b7;
                    i27 = iM25619 ^ (-1994817141);
                    length = length;
                    b6 = b6;
                    i30 = i411;
                    break;
                case -802497459:
                case -508372901:
                    return EnumC4045.f12834;
                case -789737294:
                case -737108031:
                    i29 = i29;
                    i30 = i30;
                    if (C1128.m3850(strM6378, C1420.m4902(f63246, 44, 8, i31))) {
                        iM2569 = (C0630.m2566("ܰᩴ") + i24) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i22 = ((iM2569 ^ i25) * 24517) ^ 574245079;
                        i23 = 1411003477;
                    } else {
                        iM2569 = (C2105.m6981("ۛۢ") + i24) * (-21);
                        i22 = ((iM2569 ^ i25) * (-21815)) ^ 937451138;
                        i23 = -587325440;
                    }
                    int i31110 = iM2569 ^ i23;
                    i30 = i30;
                    int i31111 = i29;
                    i27 = i31110;
                    i26 = i22;
                    i29 = i31111;
                    break;
                case -740650580:
                case 1737711170:
                    i29 = i29;
                    i30 = i30;
                    if (inputStreamM9930 != null) {
                        iM2569 = (C0630.m2566("۠ܰ") + i24) * 69;
                        i22 = ((iM2569 ^ i25) * 30407) ^ 345984081;
                        i23 = -1971298396;
                    } else {
                        iM2569 = C2105.m6981("᩻᩵") ^ i25;
                        i22 = ((iM2569 ^ i24) * (-15089)) ^ (-1170602945);
                        i23 = 924785087;
                    }
                    int i31112 = iM2569 ^ i23;
                    i30 = i30;
                    int i31113 = i29;
                    i27 = i31112;
                    i26 = i22;
                    i29 = i31113;
                    break;
                case -685332184:
                case 283409976:
                    i29 = i29;
                    i30 = i30;
                    try {
                        b4 = bArr5[i28];
                        b3 = bArr4[i28];
                        iM2569 = C0630.m2566("ۗۖ") ^ i24;
                        i22 = ((iM2569 ^ i25) * (-13411)) ^ (-1824856921);
                        i23 = -636067592;
                        int i31114 = iM2569 ^ i23;
                        i30 = i30;
                        int i31115 = i29;
                        i27 = i31114;
                        i26 = i22;
                        i29 = i31115;
                    } catch (Throwable th12) {
                        th = th12;
                        b6 = b6;
                        i29 = i29;
                        b7 = b7;
                        length = length;
                        i18 = i33;
                        i17 = iM2127;
                        inputStream = inputStreamM9930;
                        int iM256110 = C0630.m2566("᩺᩸") ^ i25;
                        int i412 = ((iM256110 ^ i24) * (-27453)) ^ 100950350;
                        b7 = b7;
                        iM2127 = i17;
                        i27 = iM256110 ^ 666843940;
                        inputStreamM9930 = inputStream;
                        i33 = i18;
                        length = length;
                        b6 = b6;
                        i30 = i30;
                        i3 = i28;
                        th2 = th;
                        i26 = i412;
                        i28 = i3;
                    }
                    break;
                case -684263133:
                case 39693835:
                    i30 = i30;
                    iM2127 = iM2127;
                    b6 = b6;
                    b7 = b7;
                    length = length;
                    bArr5 = bArr5;
                    i33 = i33;
                    th2 = th2;
                    inputStreamM9930 = inputStreamM9930;
                    i28 = i28;
                    short s = f63246[13];
                    int i50 = (s * 2) + 1;
                    int i51 = s + 1;
                    if ((i51 * i51) - i50 < 0) {
                        iM6982 = C0630.m2566("ۛۜ") ^ i25;
                        i7 = ((iM6982 ^ i24) * (-5723)) ^ (-1364211432);
                        i8 = -1744919851;
                    } else {
                        iM6982 = (i24 - C2105.m6981("ۨܶ")) * (-47);
                        i7 = ((iM6982 ^ i25) * (-8827)) ^ 1034057680;
                        i8 = 337772111;
                    }
                    int i413 = iM6982 ^ i8;
                    b7 = b7;
                    i28 = i28;
                    th2 = th2;
                    bArr5 = bArr5;
                    iM2127 = iM2127;
                    i27 = i413;
                    i26 = i7;
                    inputStreamM9930 = inputStreamM9930;
                    i33 = i33;
                    length = length;
                    b6 = b6;
                    i30 = i30;
                    break;
                case -634687398:
                case -121119174:
                    i29 = i29;
                    i30 = i30;
                    if (C1128.m3850(strM6378, C1005.m3502(f63246, 61, 8, i31))) {
                        iM2569 = (C0630.m2566("ܰᩴ") + i24) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i22 = ((iM2569 ^ i25) * 24517) ^ 574245079;
                        i23 = 1411003477;
                    } else {
                        iM2569 = C0630.m2566("۟֨") ^ i25;
                        i22 = ((iM2569 ^ i24) * 31747) ^ (-1225949369);
                        i23 = -1050069922;
                    }
                    int i31116 = iM2569 ^ i23;
                    i30 = i30;
                    int i31117 = i29;
                    i27 = i31116;
                    i26 = i22;
                    i29 = i31117;
                    break;
                case -629830028:
                case -515382630:
                    i29 = i29;
                    i30 = i30;
                    if (C3746.m11370(strM6378, ServiceConnectionC3453.m10568(f63246, 33, 7, i31))) {
                        iM2569 = (C0630.m2566("ܰᩴ") + i24) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i22 = ((iM2569 ^ i25) * 24517) ^ 574245079;
                        i23 = 1411003477;
                    } else {
                        iM2569 = C0630.m2566("ᩳۤ") ^ i24;
                        i22 = ((iM2569 ^ i25) * 18729) ^ 1416399053;
                        i23 = 1869785485;
                    }
                    int i31118 = iM2569 ^ i23;
                    i30 = i30;
                    int i31119 = i29;
                    i27 = i31118;
                    i26 = i22;
                    i29 = i31119;
                    break;
                case -562772208:
                case 105479647:
                    z5 = true;
                    iM6981 = (C2105.m6981("᩻᩶") ^ i25) * 75;
                    i4 = ((iM6981 ^ i24) * (-30303)) ^ (-1469095960);
                    i5 = -534210484;
                    i27 = iM6981 ^ i5;
                    i26 = i4;
                    b7 = b7;
                    length = length;
                    b6 = b6;
                    i30 = i30;
                    break;
                case -443424815:
                case 244407863:
                    i29 = i29;
                    i30 = i30;
                    if (z4) {
                        iM2569 = C2105.m6981("ۨᩳ") ^ i24;
                        i22 = ((iM2569 ^ i25) * (-7243)) ^ (-452667881);
                        i23 = -1388149927;
                    } else {
                        iM2569 = (C0630.m2566("ܽ۟") + i25) * 75;
                        i22 = ((iM2569 ^ i24) * 25473) ^ 54722789;
                        i23 = -1673000540;
                    }
                    int i311110 = iM2569 ^ i23;
                    i30 = i30;
                    int i311111 = i29;
                    i27 = i311110;
                    i26 = i22;
                    i29 = i311111;
                    break;
                case -425370961:
                case -172269433:
                    i29 = i29;
                    i30 = i30;
                    if (z2) {
                        iM2569 = C2105.m6981("ۙۡ") ^ i24;
                        i22 = ((iM2569 ^ i25) * (-21279)) ^ (-1202091243);
                        i23 = -524959331;
                    } else {
                        iM2569 = C0630.m2566("ܿܽ") ^ i25;
                        i22 = ((iM2569 ^ i24) * 24101) ^ (-526760580);
                        i23 = -340245817;
                    }
                    int i311112 = iM2569 ^ i23;
                    i30 = i30;
                    int i311113 = i29;
                    i27 = i311112;
                    i26 = i22;
                    i29 = i311113;
                    break;
                case -315468896:
                case 107507624:
                    i29 = i29;
                    i30 = i30;
                    if (z5) {
                        iM2569 = C2105.m6981("ܶۙ") ^ i25;
                        i22 = ((iM2569 ^ i24) * 21445) ^ 49344709;
                        i23 = -906274892;
                    } else {
                        iM2569 = C2105.m6981("ܰ᩵") ^ i24;
                        i22 = ((iM2569 ^ i25) * 23621) ^ 338787725;
                        i23 = 2013372353;
                    }
                    int i311114 = iM2569 ^ i23;
                    i30 = i30;
                    int i311115 = i29;
                    i27 = i311114;
                    i26 = i22;
                    i29 = i311115;
                    break;
                case -314301131:
                case 1029467310:
                    i29 = i29;
                    i30 = i30;
                    if (EnumC15915.m37676(abstractC15440)) {
                        iM2569 = C0630.m2566("۟᩵") ^ i25;
                        i22 = ((iM2569 ^ i24) * 3221) ^ (-741790226);
                        i23 = 350876820;
                    } else {
                        iM2569 = (C0630.m2566("ۨۚ") ^ i24) * (-59);
                        i22 = ((iM2569 ^ i25) * 12959) ^ 452998119;
                        i23 = 275305717;
                    }
                    int i311116 = iM2569 ^ i23;
                    i30 = i30;
                    int i311117 = i29;
                    i27 = i311116;
                    i26 = i22;
                    i29 = i311117;
                    break;
                case -242784557:
                case 1027509712:
                    i29 = i29;
                    i30 = i30;
                    strM6378 = RunnableC1937.m6378(C11340.m28023(abstractC15440));
                    if (C1128.m3850(strM6378, RunnableC1937.m6385(f63246, 14, 4, i31))) {
                        iM2569 = (C0630.m2566("ܰᩴ") + i24) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i22 = ((iM2569 ^ i25) * 24517) ^ 574245079;
                        i23 = 1411003477;
                    } else {
                        iM2569 = C0630.m2566("۫᩻") ^ i25;
                        i22 = ((iM2569 ^ i24) * 30899) ^ (-198978506);
                        i23 = -1111635126;
                    }
                    int i311118 = iM2569 ^ i23;
                    i30 = i30;
                    int i311119 = i29;
                    i27 = i311118;
                    i26 = i22;
                    i29 = i311119;
                    break;
                case -176593939:
                case 1407347998:
                    i29 = i29;
                    i30 = i30;
                    if (z6) {
                        iM2569 = (C0630.m2566("ܰᩴ") + i24) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i22 = ((iM2569 ^ i25) * 24517) ^ 574245079;
                        i23 = 1411003477;
                    } else {
                        iM2569 = C0630.m2566("ۘۛ") ^ i25;
                        i22 = ((iM2569 ^ i24) * (-229)) ^ (-903421341);
                        i23 = 540979610;
                    }
                    int i3111110 = iM2569 ^ i23;
                    i30 = i30;
                    int i3111111 = i29;
                    i27 = i3111110;
                    i26 = i22;
                    i29 = i3111111;
                    break;
                case -167413680:
                case 1113994505:
                    i30 = i30;
                    i9 = iM2127;
                    b6 = b6;
                    b = b7;
                    length = length;
                    bArr = bArr5;
                    th = th2;
                    i2 = i28;
                    if (inputStreamM9930 != null) {
                        iM2566 = C0630.m2566("ۙۚ") ^ i24;
                        i10 = ((iM2566 ^ i25) * 19977) ^ 734392756;
                        i11 = 22766991;
                    } else {
                        iM2566 = C0630.m2566("ۗۛ") ^ i24;
                        i10 = ((iM2566 ^ i25) * 6323) ^ 287528165;
                        i11 = -1189632627;
                    }
                    int i320 = iM2566 ^ i11;
                    b7 = b;
                    i28 = i2;
                    th2 = th;
                    bArr5 = bArr;
                    iM2127 = i9;
                    i27 = i320;
                    i26 = i10;
                    length = length;
                    b6 = b6;
                    i30 = i30;
                    break;
                case -60483614:
                case 19032727:
                    i29 = i29;
                    i30 = i30;
                    b5 = bArr5[i32];
                    b2 = bArr3[i32];
                    iM2569 = C0630.m2566("ܿܶ") ^ i24;
                    i22 = ((iM2569 ^ i25) * (-21733)) ^ (-1816145312);
                    i23 = 759747589;
                    int i3111112 = iM2569 ^ i23;
                    i30 = i30;
                    int i3111113 = i29;
                    i27 = i3111112;
                    i26 = i22;
                    i29 = i3111113;
                    break;
                case -56609551:
                case 1758019284:
                    i30 = i30;
                    b6 = b6;
                    b7 = b7;
                    length = length;
                    iM2127 = iM2127;
                    bArr5 = bArr5;
                    th2 = th2;
                    i28 = i28;
                    Object obj2 = obj;
                    if (iM2127 != 101010256) {
                        iM6983 = C2105.m6981("ۘ֡") ^ i24;
                        obj = obj2;
                        i12 = ((iM6983 ^ i25) * 2943) ^ 2065376500;
                        i13 = -1690469555;
                    } else {
                        obj = obj2;
                        iM6983 = (C2105.m6981("ܳᩴ") ^ i25) * (-111);
                        i12 = ((iM6983 ^ i24) * 26011) ^ 2010438919;
                        i13 = -1811829499;
                    }
                    i27 = iM6983 ^ i13;
                    i26 = i12;
                    b7 = b7;
                    i28 = i28;
                    th2 = th2;
                    bArr5 = bArr5;
                    iM2127 = iM2127;
                    length = length;
                    b6 = b6;
                    i30 = i30;
                    break;
                case 54561424:
                case 1214742223:
                    i29 = i29;
                    i30 = i30;
                    if (C3746.m11370(strM6378, C4263.m12817(f63246, 25, 4, i31))) {
                        iM2569 = (C0630.m2566("ܰᩴ") + i24) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i22 = ((iM2569 ^ i25) * 24517) ^ 574245079;
                        i23 = 1411003477;
                    } else {
                        iM2569 = C2105.m6981("ۚ۫") ^ i24;
                        i22 = ((iM2569 ^ i25) * (-14415)) ^ (-1194940490);
                        i23 = 34753837;
                    }
                    int i3111114 = iM2569 ^ i23;
                    i30 = i30;
                    int i3111115 = i29;
                    i27 = i3111114;
                    i26 = i22;
                    i29 = i3111115;
                    break;
                case 75382125:
                case 560449495:
                    z4 = false;
                    iM6981 = (C0630.m2566("᩷ۢ") ^ i24) * 57;
                    i4 = ((iM6981 ^ i25) * 22275) ^ 484767092;
                    i5 = -1350438449;
                    i27 = iM6981 ^ i5;
                    i26 = i4;
                    b7 = b7;
                    length = length;
                    b6 = b6;
                    i30 = i30;
                    break;
                case 95391333:
                case 1466875726:
                    i29 = i29;
                    i30 = i30;
                    if (b4 != b3) {
                        z6 = z;
                        iM2569 = C2105.m6981("ܺۜ") ^ i24;
                        i22 = ((iM2569 ^ i25) * (-31863)) ^ 1173479079;
                        i23 = -353649207;
                    } else {
                        iM2569 = (C0630.m2566("᩻۟") ^ i25) * 85;
                        i22 = ((iM2569 ^ i24) * (-18781)) ^ 563598425;
                        i23 = -2077234771;
                    }
                    int i3111116 = iM2569 ^ i23;
                    i30 = i30;
                    int i3111117 = i29;
                    i27 = i3111116;
                    i26 = i22;
                    i29 = i3111117;
                    break;
                case 205976988:
                case 272141703:
                    i30 = i30;
                    if (i32 < i29) {
                        iM2568 = C0630.m2566("ۘۤ") ^ i25;
                        i6 = ((iM2568 ^ i24) * 27345) ^ 100889386;
                        i16 = 769441956;
                    } else {
                        iM2568 = (i24 - C0630.m2566("ۜᩴ")) * (-125);
                        i6 = ((iM2568 ^ i25) * 15227) ^ 1909025729;
                        i16 = -1985605945;
                    }
                    i27 = iM2568 ^ i16;
                    i26 = i6;
                    i30 = i30;
                    break;
                case 282124989:
                case 1585565540:
                    i29 = i29;
                    i30 = i30;
                    if (C3746.m11370(strM6378, C1420.m4902(f63246, 69, 5, i31))) {
                        iM2569 = (C0630.m2566("ܰᩴ") + i24) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i22 = ((iM2569 ^ i25) * 24517) ^ 574245079;
                        i23 = 1411003477;
                    } else {
                        iM2569 = C2105.m6981("ܳ᩶") ^ i24;
                        i22 = ((iM2569 ^ i25) * 1863) ^ 1433175224;
                        i23 = 524089207;
                    }
                    int i3111118 = iM2569 ^ i23;
                    i30 = i30;
                    int i3111119 = i29;
                    i27 = i3111118;
                    i26 = i22;
                    i29 = i3111119;
                    break;
                case 294188641:
                case 1172237334:
                    i30 = i30;
                    b6 = b6;
                    b7 = b7;
                    length = length;
                    iM2127 = iM2127;
                    bArr5 = bArr5;
                    if (iM2127 == 1430352451) {
                        iM2567 = (C0630.m2566("۬ܿ") ^ i24) * 119;
                        i14 = ((iM2567 ^ i25) * (-12789)) ^ 1470319195;
                        i15 = 492337510;
                    } else {
                        iM2567 = C0630.m2566("ۡۚ") ^ i25;
                        i14 = ((iM2567 ^ i24) * 2889) ^ (-205355841);
                        i15 = -1562946138;
                    }
                    i27 = iM2567 ^ i15;
                    i26 = i14;
                    b7 = b7;
                    bArr5 = bArr5;
                    iM2127 = iM2127;
                    length = length;
                    b6 = b6;
                    i30 = i30;
                    break;
                case 339310502:
                case 2044015832:
                    i28 = 0;
                    iM2569 = (i25 - C2105.m6981("ܿۘ")) * 89;
                    i22 = ((iM2569 ^ i24) * 20397) ^ 1354852731;
                    i23 = 1568585284;
                    int i31111110 = iM2569 ^ i23;
                    i30 = i30;
                    int i31111111 = i29;
                    i27 = i31111110;
                    i26 = i22;
                    i29 = i31111111;
                    break;
                case 373663725:
                case 897462543:
                    i30 = i30;
                    b6 = b6;
                    b7 = b7;
                    length = length;
                    iM2127 = iM2127;
                    if (iM2127 != 101075792) {
                        iM2567 = (C0630.m2566("᩺ۢ") ^ i25) * (-51);
                        bArr5 = bArr5;
                        i14 = ((iM2567 ^ i24) * (-6847)) ^ (-2075624249);
                        i15 = 1918858063;
                        i27 = iM2567 ^ i15;
                        i26 = i14;
                        b7 = b7;
                        bArr5 = bArr5;
                        iM2127 = iM2127;
                        length = length;
                        b6 = b6;
                        i30 = i30;
                    } else {
                        bArr5 = bArr5;
                        th2 = th2;
                        i28 = i28;
                        iM6983 = (C2105.m6981("ܳᩴ") ^ i25) * (-111);
                        i12 = ((iM6983 ^ i24) * 26011) ^ 2010438919;
                        i13 = -1811829499;
                        i27 = iM6983 ^ i13;
                        i26 = i12;
                        b7 = b7;
                        i28 = i28;
                        th2 = th2;
                        bArr5 = bArr5;
                        iM2127 = iM2127;
                        length = length;
                        b6 = b6;
                        i30 = i30;
                    }
                    break;
                case 407027101:
                case 1534890264:
                    return EnumC4045.f12839;
                case 540702395:
                case 1591991140:
                    return EnumC4045.f12837;
                case 573412032:
                case 879720960:
                    throw th2;
                case 945662935:
                case 1974873810:
                    z3 = false;
                    iM2569 = C2105.m6981("۫ܺ") ^ i24;
                    i22 = ((iM2569 ^ i25) * 3765) ^ (-1779483587);
                    i23 = 772842685;
                    int i31111112 = iM2569 ^ i23;
                    i30 = i30;
                    int i31111113 = i29;
                    i27 = i31111112;
                    i26 = i22;
                    i29 = i31111113;
                    break;
                case 955870050:
                case 1842159580:
                    return EnumC4045.f12834;
                case 973187411:
                case 1196661950:
                    i29 = i29;
                    i30 = i30;
                    if (z3) {
                        iM2569 = C2105.m6981("ܽ۬") ^ i24;
                        i22 = ((iM2569 ^ i25) * (-20695)) ^ (-1010789744);
                        i23 = -1104235552;
                    } else {
                        iM2569 = (C2105.m6981("ۚ۟") ^ i25) * (-83);
                        i22 = ((iM2569 ^ i24) * 32151) ^ 123949888;
                        i23 = 237901844;
                    }
                    int i31111114 = iM2569 ^ i23;
                    i30 = i30;
                    int i31111115 = i29;
                    i27 = i31111114;
                    i26 = i22;
                    i29 = i31111115;
                    break;
                case 1074769686:
                case 1702630580:
                    z3 = true;
                    iM2569 = C2105.m6981("۫ܺ") ^ i24;
                    i22 = ((iM2569 ^ i25) * 3765) ^ (-1779483587);
                    i23 = 772842685;
                    int i31111116 = iM2569 ^ i23;
                    i30 = i30;
                    int i31111117 = i29;
                    i27 = i31111116;
                    i26 = i22;
                    i29 = i31111117;
                    break;
                case 1165451455:
                case 1224798307:
                    i30 = i30;
                    b6 = b6;
                    b = b7;
                    length = length;
                    i = iM2127;
                    bArr = bArr5;
                    th = th2;
                    i2 = i28;
                    C2167.m7154(th, obj);
                    i9 = i;
                    iM2566 = C0630.m2566("ۗۛ") ^ i24;
                    i10 = ((iM2566 ^ i25) * 6323) ^ 287528165;
                    i11 = -1189632627;
                    int i321 = iM2566 ^ i11;
                    b7 = b;
                    i28 = i2;
                    th2 = th;
                    bArr5 = bArr;
                    iM2127 = i9;
                    i27 = i321;
                    i26 = i10;
                    length = length;
                    b6 = b6;
                    i30 = i30;
                    break;
                case 1169796789:
                case 1619832353:
                    z2 = false;
                    iM6983 = C2105.m6981("۠ܳ") ^ i25;
                    i12 = ((iM6983 ^ i24) * (-28383)) ^ (-1121523449);
                    i13 = -1805173745;
                    i27 = iM6983 ^ i13;
                    i26 = i12;
                    b7 = b7;
                    i28 = i28;
                    th2 = th2;
                    bArr5 = bArr5;
                    iM2127 = iM2127;
                    length = length;
                    b6 = b6;
                    i30 = i30;
                    break;
                case 1182364361:
                case 1795861661:
                    i30 = i30;
                    i9 = iM2127;
                    b6 = b6;
                    b = b7;
                    length = length;
                    bArr = bArr5;
                    th = th2;
                    i2 = i28;
                    inputStreamM9930 = C3245.m9930(abstractC15440);
                    i33 = 12;
                    iM2566 = C0630.m2566("ۙ᩺") ^ i24;
                    i10 = ((iM2566 ^ i25) * (-7181)) ^ (-1888188647);
                    i11 = 347384890;
                    int i322 = iM2566 ^ i11;
                    b7 = b;
                    i28 = i2;
                    th2 = th;
                    bArr5 = bArr;
                    iM2127 = i9;
                    i27 = i322;
                    i26 = i10;
                    length = length;
                    b6 = b6;
                    i30 = i30;
                    break;
                case 1203980992:
                case 1936623093:
                    z5 = false;
                    iM6981 = (C2105.m6981("᩻᩶") ^ i25) * 75;
                    i4 = ((iM6981 ^ i24) * (-30303)) ^ (-1469095960);
                    i5 = -534210484;
                    i27 = iM6981 ^ i5;
                    i26 = i4;
                    b7 = b7;
                    length = length;
                    b6 = b6;
                    i30 = i30;
                    break;
                case 1352365391:
                case 1812215792:
                    i29 = i29;
                    i30 = i30;
                    if (C1128.m3850(strM6378, C3019.m9250(f63246, 18, 7, i31))) {
                        iM2569 = (C0630.m2566("ܰᩴ") + i24) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i22 = ((iM2569 ^ i25) * 24517) ^ 574245079;
                        i23 = 1411003477;
                    } else {
                        iM2569 = C2105.m6981("֫᩵") ^ i24;
                        i22 = ((iM2569 ^ i25) * 7471) ^ (-1316149256);
                        i23 = -987778676;
                    }
                    int i31111118 = iM2569 ^ i23;
                    i30 = i30;
                    int i31111119 = i29;
                    i27 = i31111118;
                    i26 = i22;
                    i29 = i31111119;
                    break;
                default:
                    i30 = i30;
                    b6 = b6;
                    b7 = b7;
                    length = length;
                    iM2127 = iM2127;
                    bArr5 = bArr5;
                    th2 = th2;
                    i28 = i28;
                    if (iM2127 != 67324752) {
                        iM6983 = C0630.m2566("ܶܰ") ^ i24;
                        i12 = ((iM6983 ^ i25) * 25231) ^ (-1704697262);
                        i13 = 1910036258;
                    } else {
                        iM6983 = (C2105.m6981("ܳᩴ") ^ i25) * (-111);
                        i12 = ((iM6983 ^ i24) * 26011) ^ 2010438919;
                        i13 = -1811829499;
                    }
                    i27 = iM6983 ^ i13;
                    i26 = i12;
                    b7 = b7;
                    i28 = i28;
                    th2 = th2;
                    bArr5 = bArr5;
                    iM2127 = iM2127;
                    length = length;
                    b6 = b6;
                    i30 = i30;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m45017(C16560 c16560, InterfaceC17889 interfaceC17889) {
        int i = 1223724383;
        int i2 = C4263.f13799;
        int i3 = C0714.f2697;
        int iM6981 = C2105.m6981("ᩴۧ") ^ i2;
        int i4 = ((iM6981 ^ i3) * (-6495)) ^ (-871312266);
        int i5 = 1248799147;
        while (true) {
            i = ((((i ^ i3) * (-28999)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2106908987:
                case -267272881:
                    C0964.m3413();
                    iM6981 = C2105.m6981("ۢܶ") ^ i3;
                    i4 = ((iM6981 ^ i2) * 1497) ^ 151838129;
                    i5 = -849280380;
                    break;
                case -1946811182:
                case -356723654:
                    C2167.m7155();
                    if (C0483.f2088 < 0) {
                        iM6981 = C0630.m2566("᩷ܽ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-29119)) ^ 1748636889;
                        i5 = -1001476159;
                    } else {
                        iM6981 = C2105.m6981("ۢܶ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 1497) ^ 151838129;
                        i5 = -849280380;
                    }
                    break;
                case -1914677924:
                case -1085210165:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = C0630.m2566("᩷ܽ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-29119)) ^ 1748636889;
                        i5 = -1001476159;
                    } else {
                        iM6981 = C0630.m2566("ۚܽ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 9447) ^ 1429062527;
                        i5 = -1062572316;
                    }
                    break;
                case -1603525321:
                case 1692337146:
                    ServiceConnectionC3453.m10564();
                    if (C3019.f9544 >= 0) {
                        iM6981 = (i3 - C2105.m6981("۫۟")) * (-99);
                        i4 = ((iM6981 ^ i2) * 29557) ^ 1392327481;
                        i5 = 486713983;
                    } else {
                        iM6981 = C0630.m2566("᩷ܽ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-29119)) ^ 1748636889;
                        i5 = -1001476159;
                    }
                    break;
                case -1148210303:
                case 1733304657:
                    C11340.m28031();
                    if (C21923.f70183 != 0) {
                        iM6981 = (i3 - C0630.m2566("۫֫")) * q.h;
                        i4 = ((iM6981 ^ i2) * (-25979)) ^ (-970856344);
                        i5 = 418072435;
                    } else {
                        iM6981 = C0630.m2566("᩷ܽ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-29119)) ^ 1748636889;
                        i5 = -1001476159;
                    }
                    break;
                case -1087164913:
                case -48312606:
                    if (C3746.f11829 <= 0) {
                        iM6981 = (i3 - C2105.m6981("۫۟")) * (-99);
                        i4 = ((iM6981 ^ i2) * 29557) ^ 1392327481;
                        i5 = 486713983;
                    } else {
                        iM6981 = C2105.m6981("ۤۢ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-32207)) ^ 1554529281;
                        i5 = -18484487;
                    }
                    break;
                case -1003622348:
                case 1457375652:
                    if (C1047.f3863 >= 0) {
                        iM6981 = C2105.m6981("ۢܶ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 1497) ^ 151838129;
                        i5 = -849280380;
                    } else {
                        iM6981 = C2105.m6981("ܳᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-18785)) ^ (-988532912);
                        i5 = -113423725;
                    }
                    break;
                case -784799872:
                case 2117089904:
                    if (C0798.f2919) {
                        iM6981 = C2105.m6981("ۢܶ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 1497) ^ 151838129;
                        i5 = -849280380;
                    } else {
                        iM6981 = C0630.m2566("ۨۛ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 17311) ^ (-1792065707);
                        i5 = 514539266;
                    }
                    break;
                case -547694392:
                case 711840668:
                    if (C2958.f9394 >= 0) {
                        iM6981 = (i3 - C2105.m6981("۫۟")) * (-99);
                        i4 = ((iM6981 ^ i2) * 29557) ^ 1392327481;
                        i5 = 486713983;
                    } else {
                        iM6981 = C0630.m2566("᩺᩷") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-26657)) ^ 1674417775;
                        i5 = -1178651831;
                    }
                    break;
                case -502535232:
                case 1890202778:
                    if (C3911.m11924() <= 0) {
                        iM6981 = (i3 - C2105.m6981("۫۟")) * (-99);
                        i4 = ((iM6981 ^ i2) * 29557) ^ 1392327481;
                        i5 = 486713983;
                    } else {
                        iM6981 = (C2105.m6981("ۖۘ") + i3) * (-57);
                        i4 = ((iM6981 ^ i2) * 32565) ^ 1930124849;
                        i5 = 2053089733;
                    }
                    break;
                case -185164689:
                case 359704650:
                    if (C3245.f10203 > 0) {
                        C4263.m12821(new C20979(c16560, interfaceC17889));
                    }
                    iM6981 = (C0630.m2566("۬֨") + i2) * (-109);
                    i4 = ((iM6981 ^ i3) * 9189) ^ (-583799611);
                    i5 = -751528643;
                    break;
                case 507838746:
                case 1295985158:
                    if (C22628.m50615() != 0) {
                        iM6981 = C0630.m2566("᩷ܽ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-29119)) ^ 1748636889;
                        i5 = -1001476159;
                    } else {
                        iM6981 = C0630.m2566("ܿܽ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-5829)) ^ (-2004824903);
                        i5 = 1652623186;
                    }
                    break;
                case 720882393:
                case 1979336822:
                    if (C2958.f9394 >= 0) {
                        iM6981 = (C0630.m2566("۬֨") + i2) * (-109);
                        i4 = ((iM6981 ^ i3) * 9189) ^ (-583799611);
                        i5 = -751528643;
                    } else {
                        iM6981 = (C2105.m6981("۫ۗ") ^ i3) * 83;
                        i4 = ((iM6981 ^ i2) * (-7231)) ^ 1415204023;
                        i5 = 1860351301;
                    }
                    break;
                case 1127138317:
                case 1421237701:
                    C5695.m16023();
                    break;
                default:
                    if (C1005.f3721) {
                        iM6981 = (C0630.m2566("۫ܿ") ^ i2) * 61;
                        i4 = ((iM6981 ^ i3) * (-19637)) ^ (-1359461706);
                        i5 = -988453085;
                    } else {
                        iM6981 = (i3 - C0630.m2566("۫֫")) * q.h;
                        i4 = ((iM6981 ^ i2) * (-25979)) ^ (-970856344);
                        i5 = 418072435;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45005(C16560 c16560, AbstractC15440 abstractC15440) throws Throwable {
        InputStream inputStreamM9930 = null;
        int i = 0;
        Exception e = null;
        Main mainM49336 = null;
        Object obj = null;
        Throwable th = null;
        Object th2 = null;
        int i2 = 332141937;
        int i3 = C0422.f1886;
        int i4 = C3432.f10845;
        int iM2566 = (i3 - C0630.m2566("᩻ۧ")) * (-19);
        int i5 = ((iM2566 ^ i4) * (-28039)) ^ 486539783;
        int i6 = -1594065136;
        while (true) {
            i2 = ((((i2 ^ i4) * 6703) >> 31) & i5) ^ (iM2566 ^ i6);
            switch (i2) {
                case -2144937695:
                case 361729497:
                    C2126.m7040();
                    C0237.m1481();
                    return;
                case -2051333409:
                case 891073128:
                    if (C2105.f7037 != 0) {
                        iM2566 = (C0630.m2566("ۗۢ") ^ i4) * (-127);
                        i5 = ((iM2566 ^ i3) * 3659) ^ (-1680016829);
                        i6 = -1963535325;
                    } else {
                        iM2566 = C2105.m6981("᩸ܽ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 9483) ^ 1221208709;
                        i6 = 1592777163;
                    }
                    break;
                case -2042951679:
                case -1158389001:
                    inputStreamM9930 = C3245.m9930(abstractC15440);
                    iM2566 = C0630.m2566("ᩳ۠") ^ i4;
                    i5 = ((iM2566 ^ i3) * 383) ^ (-1567185153);
                    i6 = 1530168380;
                    break;
                case -2022138614:
                case 632507508:
                    try {
                        C0714.m2815(th, th2);
                        iM2566 = C2105.m6981("᩶ۖ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-18483)) ^ (-2076987664);
                        i6 = 193427069;
                    } catch (Exception e2) {
                        e = e2;
                        iM2566 = C0630.m2566("ܰۖ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 3017) ^ 304390900;
                        i6 = 20011736;
                    }
                    break;
                case -1936169033:
                case 1891375613:
                    if (C11340.f33930 >= 0) {
                        iM2566 = C0630.m2566("ܰۨ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-2177)) ^ (-1829629188);
                        i6 = 661251301;
                    } else {
                        iM2566 = C0630.m2566("ۘۚ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 3589) ^ (-150831825);
                        i6 = 892492043;
                    }
                    break;
                case -1808670016:
                case 806681503:
                    C7811.m20844();
                    if (C2958.f9394 < 0) {
                        iM2566 = (C2105.m6981("ܽۨ") ^ i4) * 109;
                        i5 = ((iM2566 ^ i3) * 17881) ^ 259060562;
                        i6 = -1555777332;
                    } else {
                        iM2566 = C0630.m2566("ۜۤ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 389) ^ (-1719648785);
                        i6 = -1804337346;
                    }
                    break;
                case -1776458548:
                case 433781887:
                    mainM49336 = C21923.m49336(c16560);
                    obj = null;
                    if (C2272.f7362) {
                        iM2566 = (C0630.m2566("֫ۛ") + i3) * 49;
                        i5 = ((iM2566 ^ i4) * (-8913)) ^ 866022086;
                        i6 = -2098807603;
                    } else {
                        iM2566 = C2105.m6981("᩹ۖ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 24433) ^ (-390052198);
                        i6 = -560929088;
                    }
                    break;
                case -1744843152:
                case -1118099285:
                    if (C1294.f4556 < 0) {
                        iM2566 = C0630.m2566("ۜۤ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 389) ^ (-1719648785);
                        i6 = -1804337346;
                    } else {
                        iM2566 = C0630.m2566("ۘۚ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 3589) ^ (-150831825);
                        i6 = 892492043;
                    }
                    break;
                case -1665272177:
                case -1164931349:
                    C1504.m5179();
                    if (!C4159.f13567) {
                        iM2566 = (C2105.m6981("ܳۢ") ^ i4) * 31;
                        i5 = ((iM2566 ^ i3) * 24807) ^ 985416915;
                        i6 = 1356451602;
                    } else {
                        iM2566 = (C0630.m2566("ۗۢ") ^ i4) * (-127);
                        i5 = ((iM2566 ^ i3) * 3659) ^ (-1680016829);
                        i6 = -1963535325;
                    }
                    break;
                case -1608158112:
                case -387858827:
                    if (C2958.f9394 >= 0) {
                        iM2566 = C2105.m6981("ܽۘ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-12787)) ^ 793866917;
                        i6 = 682732595;
                    } else {
                        iM2566 = C0630.m2566("ۘۚ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 3589) ^ (-150831825);
                        i6 = 892492043;
                    }
                    break;
                case -1329196395:
                case 835707788:
                    if (C1294.f4556 >= 0) {
                        iM2566 = (C0630.m2566("ۗ᩻") + i4) * 49;
                        i5 = ((iM2566 ^ i3) * (-19653)) ^ 1356856080;
                        i6 = 1551981203;
                    } else {
                        iM2566 = C2105.m6981("۬ܳ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 8207) ^ (-1855425551);
                        i6 = 408177307;
                    }
                    break;
                case -1285365432:
                case 1852803371:
                    if (inputStreamM9930 != null) {
                        iM2566 = (C0630.m2566("ۚۘ") + i4) * 11;
                        i5 = ((iM2566 ^ i3) * (-3933)) ^ 1834122816;
                        i6 = 6280211;
                    } else {
                        iM2566 = C2105.m6981("ۘۖ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 6557) ^ 1915215903;
                        i6 = -778015542;
                    }
                    break;
                case -1179041832:
                case 515952231:
                    C4075.m12246(mainM49336, e, obj);
                    return;
                case -1150419106:
                case 12571741:
                    if (C3245.m9925() != 0) {
                        iM2566 = (C0630.m2566("ۗ᩻") + i4) * 49;
                        i5 = ((iM2566 ^ i3) * (-19653)) ^ 1356856080;
                        i6 = 1551981203;
                    } else {
                        iM2566 = C0630.m2566("᩶ܿ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-18891)) ^ (-2053189217);
                        i6 = -1411928378;
                    }
                    break;
                case -947309304:
                case -69421246:
                    if (RunnableC1937.m6387() != 0) {
                        iM2566 = (C2105.m6981("ܽۨ") ^ i4) * 109;
                        i5 = ((iM2566 ^ i3) * 17881) ^ 259060562;
                        i6 = -1555777332;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ۤۡ")) * (-53);
                        i5 = ((iM2566 ^ i4) * (-16969)) ^ 1590468075;
                        i6 = 1388569715;
                    }
                    break;
                case -944340367:
                case 1981387320:
                    RunnableC1108.m3785(inputStreamM9930);
                    iM2566 = C2105.m6981("ۘۖ") ^ i3;
                    i5 = ((iM2566 ^ i4) * 6557) ^ 1915215903;
                    i6 = -778015542;
                    break;
                case -920316602:
                case 811206665:
                    if (C1711.m5736() > 0) {
                        iM2566 = (C2105.m6981("ܳۢ") ^ i4) * 31;
                        i5 = ((iM2566 ^ i3) * 24807) ^ 985416915;
                        i6 = 1356451602;
                    } else {
                        iM2566 = C0630.m2566("ۜۤ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 389) ^ (-1719648785);
                        i6 = -1804337346;
                    }
                    break;
                case -917768907:
                case 344812017:
                    return;
                case -888537023:
                case -833700004:
                    if (C0050.f910 >= 0) {
                        iM2566 = (C0630.m2566("֫ۛ") + i3) * 49;
                        i5 = ((iM2566 ^ i4) * (-8913)) ^ 866022086;
                        i6 = -2098807603;
                    } else {
                        iM2566 = C2105.m6981("ۛ۠") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-10161)) ^ (-2118299287);
                        i6 = -21652794;
                    }
                    break;
                case -683030497:
                case -554864118:
                    try {
                        RunnableC1108.m3785(inputStreamM9930);
                        iM2566 = C2105.m6981("᩶ۖ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-18483)) ^ (-2076987664);
                        i6 = 193427069;
                    } catch (Throwable th3) {
                        th2 = th3;
                        iM2566 = (C0630.m2566("ۧۖ") + i3) * (-15);
                        i5 = ((iM2566 ^ i4) * 743) ^ 748171190;
                        i6 = -1348899164;
                    }
                    break;
                case -568327141:
                case 1804043925:
                    if (RunnableC1108.m3790()) {
                        iM2566 = C0630.m2566("ۜۤ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 389) ^ (-1719648785);
                        i6 = -1804337346;
                    } else {
                        iM2566 = (C0630.m2566("۬ۢ") + i3) * (-11);
                        i5 = ((iM2566 ^ i4) * (-26665)) ^ (-848510624);
                        i6 = 651205282;
                    }
                    break;
                case -478772191:
                case 1218620106:
                    if (C2105.f7037 != 0) {
                        iM2566 = C2105.m6981("ܽۘ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-12787)) ^ 793866917;
                        i6 = 682732595;
                    } else {
                        iM2566 = (C2105.m6981("᩶۟") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((iM2566 ^ i3) * (-4109)) ^ 183996824;
                        i6 = 468620655;
                    }
                    break;
                case -474576986:
                case 2142043834:
                    if (inputStreamM9930 != null) {
                        iM2566 = C2105.m6981("᩻᩶") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-2649)) ^ (-1367367861);
                        i6 = 1811572345;
                    } else {
                        iM2566 = C2105.m6981("᩶ۖ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-18483)) ^ (-2076987664);
                        i6 = 193427069;
                    }
                    break;
                case -299637287:
                case 9269306:
                    i = IShizukuService.Stub.TRANSACTION_isHidden;
                    iM2566 = (C0630.m2566("֨۬") ^ i4) * 17;
                    i5 = ((iM2566 ^ i3) * 1071) ^ 59633190;
                    i6 = -163919120;
                    break;
                case -262598948:
                case 1324967353:
                    try {
                        byte[] bArr = new byte[i];
                        C22194.m49857(inputStreamM9930, bArr, i);
                        m45003((AbstractActivityC3346) C22628.m50612(c16560), bArr);
                        iM2566 = (C0630.m2566("ܳܺ") + i4) * 101;
                        i5 = ((iM2566 ^ i3) * 8411) ^ (-1584747315);
                        i6 = 520967232;
                    } catch (Throwable th4) {
                        th = th4;
                        iM2566 = (C0630.m2566("۫۫") + i3) * 85;
                        i5 = ((iM2566 ^ i4) * (-4717)) ^ (-716074053);
                        i6 = -1513076845;
                    }
                    break;
                case -174963841:
                case -173141008:
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = (C0630.m2566("֫ۛ") + i3) * 49;
                        i5 = ((iM2566 ^ i4) * (-8913)) ^ 866022086;
                        i6 = -2098807603;
                    } else {
                        iM2566 = (C0630.m2566("ۗۢ") ^ i4) * (-127);
                        i5 = ((iM2566 ^ i3) * 3659) ^ (-1680016829);
                        i6 = -1963535325;
                    }
                    break;
                case -71901799:
                case 326045276:
                    throw th;
                case -10165937:
                case 1065501276:
                    RunnableC1108.m3790();
                    C2126.m7040();
                    iM2566 = C0630.m2566("ۘۚ") ^ i4;
                    i5 = ((iM2566 ^ i3) * 3589) ^ (-150831825);
                    i6 = 892492043;
                    break;
                case 1204582412:
                case 2146470413:
                    if (C1294.m4372() <= 0) {
                        iM2566 = C0630.m2566("ܰۨ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-2177)) ^ (-1829629188);
                        i6 = 661251301;
                    } else {
                        iM2566 = C0630.m2566("ܺ᩹") ^ i3;
                        i5 = ((iM2566 ^ i4) * 18309) ^ (-107779599);
                        i6 = -1931846722;
                    }
                    break;
                case 1268849291:
                case 1903505302:
                    if (C3245.f10203 <= 0) {
                        iM2566 = C0630.m2566("ܰۨ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-2177)) ^ (-1829629188);
                        i6 = 661251301;
                    } else {
                        iM2566 = (C2105.m6981("ۘ᩷") ^ i3) * 93;
                        i5 = ((iM2566 ^ i4) * (-32217)) ^ (-1490491383);
                        i6 = 1161607340;
                    }
                    break;
                default:
                    if (C2167.f7158 >= 0) {
                        iM2566 = C2105.m6981("ܽۘ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-12787)) ^ 793866917;
                        i6 = 682732595;
                    } else {
                        iM2566 = C0630.m2566("ܽܽ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 31499) ^ (-120636166);
                        i6 = 690243373;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x01bc A[PHI: r2 r3 r12 r13 r14
      0x01bc: PHI (r2v2 boolean) = (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v4 boolean) binds: [B:95:0x01bc, B:49:0x01ba, B:16:0x006e, B:13:0x0068, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x01bc: PHI (r3v3 boolean[]) = (r3v2 boolean[]), (r3v2 boolean[]), (r3v2 boolean[]), (r3v2 boolean[]), (r3v5 boolean[]) binds: [B:95:0x01bc, B:49:0x01ba, B:16:0x006e, B:13:0x0068, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x01bc: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:95:0x01bc, B:49:0x01ba, B:16:0x006e, B:13:0x0068, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x01bc: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:95:0x01bc, B:49:0x01ba, B:16:0x006e, B:13:0x0068, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x01bc: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:95:0x01bc, B:49:0x01ba, B:16:0x006e, B:13:0x0068, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x0210 A[PHI: r9 r10
      0x0210: PHI (r9v4 short) = (r9v3 short), (r9v2 short), (r9v2 short) binds: [B:57:0x020e, B:18:0x0072, B:16:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0210: PHI (r10v4 short) = (r10v3 short), (r10v2 short), (r10v2 short) binds: [B:57:0x020e, B:18:0x0072, B:16:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0264 A[PHI: r19
      0x0264: PHI (r19v7 short[]) = (r19v6 short[]), (r19v5 short[]) binds: [B:65:0x0262, B:13:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0294 A[PHI: r4 r5 r6 r7 r11 r22
      0x0294: PHI (r4v3 short[]) = (r4v2 short[]), (r4v1 short[]), (r4v1 short[]), (r4v1 short[]) binds: [B:34:0x00df, B:69:0x0292, B:61:0x0244, B:53:0x01ee] A[DONT_GENERATE, DONT_INLINE]
      0x0294: PHI (r5v5 java.lang.String[]) = (r5v3 java.lang.String[]), (r5v2 java.lang.String[]), (r5v2 java.lang.String[]), (r5v2 java.lang.String[]) binds: [B:34:0x00df, B:69:0x0292, B:61:0x0244, B:53:0x01ee] A[DONT_GENERATE, DONT_INLINE]
      0x0294: PHI (r6v4 l.ۙۡܳ) = (r6v3 l.ۙۡܳ), (r6v2 l.ۙۡܳ), (r6v2 l.ۙۡܳ), (r6v2 l.ۙۡܳ) binds: [B:34:0x00df, B:69:0x0292, B:61:0x0244, B:53:0x01ee] A[DONT_GENERATE, DONT_INLINE]
      0x0294: PHI (r7v8 int) = (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:34:0x00df, B:69:0x0292, B:61:0x0244, B:53:0x01ee] A[DONT_GENERATE, DONT_INLINE]
      0x0294: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v4 int) binds: [B:34:0x00df, B:69:0x0292, B:61:0x0244, B:53:0x01ee] A[DONT_GENERATE, DONT_INLINE]
      0x0294: PHI (r22v3 char) = (r22v1 char), (r22v1 char), (r22v2 char), (r22v1 char) binds: [B:34:0x00df, B:69:0x0292, B:61:0x0244, B:53:0x01ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m45019(C16560 c16560, InterfaceC17889 interfaceC17889) {
        int iM2566;
        int i;
        int i2;
        boolean z = false;
        int i3 = C4117.f13076;
        int i4 = C1773.f6144;
        int iM6981 = C2105.m6981("ܶܳ") ^ i4;
        int i5 = ((iM6981 ^ i3) * (-8335)) ^ (-1659751512);
        short[] sArr = null;
        int i6 = iM6981 ^ 814425033;
        RunnableC4545 runnableC4545 = null;
        int i7 = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1865257796;
        char c = 0;
        short[] sArr2 = null;
        String[] strArr = null;
        boolean[] zArr = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i3) * 12021) >> 31));
            switch (i13) {
                case -2122681239:
                case 853424618:
                    C0964.m3413();
                    iM2566 = C2105.m6981("ۢ᩷") ^ i3;
                    i = ((iM2566 ^ i4) * (-7469)) ^ (-8505266);
                    i2 = -375456418;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -2054676632:
                case -785643026:
                    c = 549;
                    if (C1128.m3851() <= 0) {
                        iM2566 = C0630.m2566("ۚܿ") ^ i4;
                        i = ((iM2566 ^ i3) * (-12533)) ^ 1588596870;
                        i2 = 1443369996;
                    } else {
                        iM2566 = C0630.m2566("ۖ᩹") ^ i3;
                        i = ((iM2566 ^ i4) * (-22007)) ^ 1624683961;
                        i2 = -595071469;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1974560041:
                case -697442900:
                    s = sArr2[c];
                    s2 = 17497;
                    if (C0964.f3626 != 0) {
                        iM2566 = C2105.m6981("ۢ᩷") ^ i3;
                        i = ((iM2566 ^ i4) * (-7469)) ^ (-8505266);
                        i2 = -375456418;
                    } else {
                        iM2566 = (C2105.m6981("ۡۜ") + i4) * 87;
                        i = ((iM2566 ^ i3) * 16449) ^ (-215654942);
                        i2 = 607310564;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1932908423:
                case 1924544679:
                    i12 = 15789;
                    iM2566 = (C0630.m2566("ۙܰ") ^ i3) * (-103);
                    i = ((iM2566 ^ i4) * 15467) ^ 1032977021;
                    i2 = -348835490;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1780003967:
                case -1227803374:
                    if (C4616.f14690 > 0) {
                        iM2566 = C2105.m6981("ۢ᩷") ^ i3;
                        i = ((iM2566 ^ i4) * (-7469)) ^ (-8505266);
                        i2 = -375456418;
                    } else {
                        iM2566 = (C0630.m2566("۟۬") ^ i4) * 115;
                        i = ((iM2566 ^ i3) * (-12103)) ^ (-215610027);
                        i2 = 2118184520;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1337893370:
                case 506897538:
                    if (C0050.f910 >= 0) {
                        iM2566 = C0630.m2566("ۚܿ") ^ i4;
                        i = ((iM2566 ^ i3) * (-12533)) ^ 1588596870;
                        i2 = 1443369996;
                    } else {
                        iM2566 = C0630.m2566("ۘ۠") ^ i4;
                        i = ((iM2566 ^ i3) * (-24563)) ^ (-1601134507);
                        i2 = -91970798;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1264857074:
                case 1095670865:
                    i12 = 52127;
                    iM2566 = (C0630.m2566("ۙܰ") ^ i3) * (-103);
                    i = ((iM2566 ^ i4) * 15467) ^ 1032977021;
                    i2 = -348835490;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1084782548:
                case -311639890:
                    C1420.m4913();
                    break;
                case -1019653835:
                case -955140172:
                    runnableC4545.run();
                    break;
                case -963263197:
                case 1188658593:
                    i8 = s + s2;
                    if (C0483.f2088 >= 0) {
                        iM2566 = C0630.m2566("ۚܿ") ^ i4;
                        i = ((iM2566 ^ i3) * (-12533)) ^ 1588596870;
                        i2 = 1443369996;
                    } else {
                        iM2566 = C2105.m6981("ܰۜ") ^ i3;
                        i = ((iM2566 ^ i4) * 3119) ^ (-2060868555);
                        i2 = -1431987840;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -742642450:
                case 161157317:
                    int i14 = i10 + i11;
                    if ((i14 + i14) - i9 >= 0) {
                        iM2566 = (C2105.m6981("֫ܰ") + i3) * 109;
                        i = ((iM2566 ^ i4) * 19021) ^ (-949807044);
                        i2 = 2028900581;
                    } else {
                        iM2566 = (i4 - C2105.m6981("ܶ۠")) * 5;
                        i = ((iM2566 ^ i3) * 13021) ^ 2146265104;
                        i2 = 1563802034;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -734455316:
                case -445776580:
                    sArr2 = f63246;
                    if (C0050.m940() <= 0) {
                        iM2566 = C2105.m6981("ۚܶ") ^ i3;
                        i = ((iM2566 ^ i4) * 9153) ^ (-1824604386);
                        i2 = -535268311;
                    } else {
                        iM2566 = (C2105.m6981("ܳ᩸") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM2566 ^ i4) * (-22855)) ^ (-194246014);
                        i2 = 1236636220;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -726988635:
                case 2025172575:
                    C2272.m7503();
                    if (!C1504.f5354) {
                        iM2566 = (C0630.m2566("۟۬") ^ i4) * 115;
                        i = ((iM2566 ^ i3) * (-12103)) ^ (-215610027);
                        i2 = 2118184520;
                        i6 = iM2566 ^ i2;
                        i5 = i;
                    } else {
                        int iM6982 = (i4 - C2105.m6981("֡ۨ")) * 17;
                        i6 = iM6982 ^ 311444406;
                        i5 = ((iM6982 ^ i3) * 23051) ^ 701576526;
                        runnableC4545 = null;
                    }
                    break;
                case -702720513:
                case 1214036642:
                    C4263.m12821(new C6867(c16560, interfaceC17889, zArr, strArr, runnableC4545));
                    break;
                case -637195240:
                case 1481129043:
                    strArr = new String[]{null};
                    if (C2272.f7362) {
                        int iM6983 = (i4 - C2105.m6981("֡ۨ")) * 17;
                        i6 = iM6983 ^ 311444406;
                        i5 = ((iM6983 ^ i3) * 23051) ^ 701576526;
                        runnableC4545 = null;
                    } else {
                        runnableC4545 = new RunnableC4545(interfaceC17889, c16560, strArr, zArr);
                        sArr = f63246;
                        if (C0483.f2088 >= 0) {
                            i7 = 550;
                            iM2566 = C0630.m2566("ۚܿ") ^ i4;
                            i = ((iM2566 ^ i3) * (-12533)) ^ 1588596870;
                            i2 = 1443369996;
                            i6 = iM2566 ^ i2;
                            i5 = i;
                        } else {
                            int iM6984 = C2105.m6981("ܺۜ") ^ i4;
                            i5 = ((iM6984 ^ i3) * 307) ^ (-903551424);
                            i6 = iM6984 ^ 1897427220;
                            i7 = 550;
                        }
                    }
                    break;
                case -423719447:
                case 1604711936:
                    if (C3746.m11356(c16560, C0050.m948(sArr, i7, 5, i12))) {
                        iM2566 = (C2105.m6981("ۢۡ") + i4) * (-65);
                        i = ((iM2566 ^ i3) * (-8551)) ^ 1703456529;
                        i2 = 1777241641;
                    } else {
                        iM2566 = C0630.m2566("۟۠") ^ i3;
                        i = ((iM2566 ^ i4) * 16563) ^ 1165376913;
                        i2 = -1779429261;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -142553395:
                case -59971957:
                    i9 = i8 * i8;
                    i10 = s * s;
                    i11 = 306145009;
                    if (C2272.f7362) {
                        iM2566 = (C0630.m2566("۟۬") ^ i4) * 115;
                        i = ((iM2566 ^ i3) * (-12103)) ^ (-215610027);
                        i2 = 2118184520;
                    } else {
                        iM2566 = C0630.m2566("ܽ᩻") ^ i4;
                        i = ((iM2566 ^ i3) * 13351) ^ 869954786;
                        i2 = -50219066;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 135739081:
                case 644890063:
                    if (C2272.f7362) {
                        iM2566 = (C0630.m2566("۟۬") ^ i4) * 115;
                        i = ((iM2566 ^ i3) * (-12103)) ^ (-215610027);
                        i2 = 2118184520;
                    } else {
                        iM2566 = C2105.m6981("ۚܶ") ^ i3;
                        i = ((iM2566 ^ i4) * 9153) ^ (-1824604386);
                        i2 = -535268311;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 1614955958:
                case 1904147866:
                    zArr[z ? 1 : 0] = z;
                    if (C3245.m9925() != 0) {
                        int iM6985 = (i4 - C2105.m6981("֡ۨ")) * 17;
                        i6 = iM6985 ^ 311444406;
                        i5 = ((iM6985 ^ i3) * 23051) ^ 701576526;
                        runnableC4545 = null;
                    } else {
                        int iM2567 = (C0630.m2566("ܳۡ") + i3) * (-81);
                        i5 = ((iM2567 ^ i4) * (-4721)) ^ 9841992;
                        i6 = iM2567 ^ 1407740579;
                    }
                    break;
                default:
                    zArr = new boolean[1];
                    z = false;
                    z = false;
                    if (C3746.m11369() >= 0) {
                        iM2566 = (C0630.m2566("۟۬") ^ i4) * 115;
                        i = ((iM2566 ^ i3) * (-12103)) ^ (-215610027);
                        i2 = 2118184520;
                    } else {
                        iM2566 = (C0630.m2566("ܳ᩵") + i4) * 59;
                        i = ((iM2566 ^ i3) * (-4291)) ^ (-1672429409);
                        i2 = -1516414530;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m45013(final C16560 c16560, final InterfaceC17889 interfaceC17889, final Class cls) {
        InterfaceC17889 interfaceC178810;
        int iM6981;
        int i;
        int i2;
        int i3;
        int i4;
        View view;
        int i5;
        short[] sArr;
        int iM2566;
        int i6;
        int i7;
        int iM6982;
        int i8;
        int i9;
        int iM2567;
        int i10;
        int i11;
        String[] strArr;
        ListView listView;
        short[] sArr2;
        View view2;
        Main main;
        int i12;
        int i13;
        ListView listView2;
        Main main2;
        View viewM10739;
        int i14;
        int i15;
        int iM2568;
        int i16;
        int i17;
        C10211 c10211 = null;
        int i18 = 0;
        String str = null;
        int iM6983 = 0;
        int i19 = 1385341986;
        int i20 = C0422.f1886;
        int i21 = C3019.f9544;
        int iM6984 = C2105.m6981("᩹ۖ") ^ i21;
        int i22 = ((iM6984 ^ i20) * 1369) ^ 255322710;
        int i23 = iM6984 ^ (-1772766200);
        String str2 = null;
        Iterator itM3596 = null;
        InterfaceC17889 interfaceC178811 = null;
        boolean[] zArr = null;
        Main main3 = null;
        View view3 = null;
        C19258 c19258 = null;
        short[] sArr3 = null;
        String str3 = null;
        int iM6985 = 0;
        int i24 = 0;
        boolean z = false;
        int i25 = 0;
        int i26 = 0;
        short s = 0;
        final ArrayList arrayList = null;
        String[] strArr2 = null;
        ListView listView3 = null;
        View view4 = null;
        C20438 c20438 = null;
        int i27 = 0;
        boolean z2 = false;
        DialogInterface.OnClickListener onClickListener = null;
        while (true) {
            i19 = i23 ^ (i22 & (((i19 ^ i20) * 24661) >> 31));
            switch (i19) {
                case -2096103672:
                case 1861623924:
                    i4 = i27;
                    view = view3;
                    i5 = iM6985;
                    sArr = sArr3;
                    listView3 = (ListView) C11340.m28028(view, C2105.m6981(RunnableC0588.m2436(sArr, 493, 3, i26)) ^ 2120952642);
                    C4915.m14284(listView3);
                    if (C2272.f7362) {
                        iM2566 = (C2105.m6981("ۜۧ") + i20) * (-59);
                        i6 = ((iM2566 ^ i21) * 9173) ^ 860536296;
                        i7 = -207679166;
                    } else {
                        iM2566 = (i21 - C0630.m2566("᩵ۨ")) * 9;
                        i6 = ((iM2566 ^ i20) * 31437) ^ 1308782270;
                        i7 = -444497686;
                    }
                    sArr3 = sArr;
                    i9 = i4;
                    i23 = iM2566 ^ i7;
                    i22 = i6;
                    iM6985 = i5;
                    view3 = view;
                    i27 = i9;
                    break;
                case -2050348788:
                case -1652908925:
                    String str4 = str3;
                    i27 = i27;
                    c19258 = c19258;
                    main3 = main3;
                    listView3 = listView3;
                    sArr3 = sArr3;
                    view3 = view3;
                    iM6985 = iM6985;
                    InterfaceC17889 interfaceC178812 = (InterfaceC17889) C2272.m7513(itM3596);
                    if (!interfaceC178812.mo36969()) {
                        str3 = str4;
                        interfaceC178811 = interfaceC178812;
                        int iM2569 = C0630.m2566("ܶۤ") ^ i21;
                        sArr3 = sArr3;
                        iM6985 = iM6985;
                        view3 = view3;
                        i27 = i27;
                        i23 = iM2569 ^ (-1558780401);
                        i22 = ((iM2569 ^ i20) * 7107) ^ (-489025746);
                        listView3 = listView3;
                        c19258 = c19258;
                        main3 = main3;
                    } else {
                        int iM25610 = (i20 - C0630.m2566("᩵ۜ")) * 51;
                        int i28 = ((iM25610 ^ i21) * 18823) ^ (-665587032);
                        sArr3 = sArr3;
                        iM6985 = iM6985;
                        view3 = view3;
                        i27 = i27;
                        i23 = iM25610 ^ 464492915;
                        str3 = str4;
                        listView3 = listView3;
                        main3 = main3;
                        interfaceC178811 = interfaceC178812;
                        i22 = i28;
                        c19258 = c19258;
                    }
                    break;
                case -2014436876:
                case -1933138701:
                    i26 = 10494;
                    iM2567 = (i21 - C2105.m6981("۬ۤ")) * (-27);
                    i10 = ((iM2567 ^ i20) * 17795) ^ (-1733206921);
                    i11 = -1584827727;
                    i17 = iM2567 ^ i11;
                    sArr3 = sArr3;
                    iM6985 = iM6985;
                    view3 = view3;
                    i27 = i27;
                    i23 = i17;
                    i22 = i10;
                    str3 = str3;
                    listView3 = listView3;
                    main3 = main3;
                    interfaceC178811 = interfaceC178811;
                    c19258 = c19258;
                    break;
                case -2008954070:
                case -185128012:
                    i25++;
                    strArr = strArr2;
                    int iM25611 = C0630.m2566("ᩴ۫") ^ i21;
                    iM6985 = iM6985;
                    view3 = view3;
                    i27 = i27;
                    strArr2 = strArr;
                    i23 = iM25611 ^ 83637682;
                    i22 = ((iM25611 ^ i20) * 6419) ^ (-178222967);
                    sArr3 = sArr3;
                    str3 = str3;
                    listView3 = listView3;
                    main3 = main3;
                    interfaceC178811 = interfaceC178811;
                    c19258 = c19258;
                    break;
                case -1887300965:
                case 902128269:
                    i27 = i27;
                    c19258 = c19258;
                    interfaceC178811 = interfaceC178811;
                    main3 = main3;
                    listView3 = listView3;
                    sArr3 = sArr3;
                    str3 = str3;
                    view3 = view3;
                    iM6985 = iM6985;
                    if (C3537.m10754(arrayList)) {
                        iM2567 = (C0630.m2566("ᩳۖ") ^ i21) * (-35);
                        i10 = ((iM2567 ^ i20) * (-4547)) ^ 195563319;
                        i11 = -298477983;
                    } else {
                        iM2567 = (C2105.m6981("֡᩷") + i21) * 59;
                        i10 = ((iM2567 ^ i20) * (-30479)) ^ 1840533107;
                        i11 = 1895601039;
                    }
                    i17 = iM2567 ^ i11;
                    sArr3 = sArr3;
                    iM6985 = iM6985;
                    view3 = view3;
                    i27 = i27;
                    i23 = i17;
                    i22 = i10;
                    str3 = str3;
                    listView3 = listView3;
                    main3 = main3;
                    interfaceC178811 = interfaceC178811;
                    c19258 = c19258;
                    break;
                case -1810477842:
                case 1252122672:
                    strArr2[i25] = C11340.m28015(strArr2[i25], z ? 1 : 0, i24);
                    iM2568 = C2105.m6981("᩷᩷") ^ i20;
                    i14 = ((iM2568 ^ i21) * 14291) ^ (-343209562);
                    i16 = 846998275;
                    i23 = iM2568 ^ i16;
                    i22 = i14;
                    break;
                case -1728565483:
                case 1367653865:
                    i27 = i27;
                    c19258 = c19258;
                    main3 = main3;
                    listView3 = listView3;
                    sArr3 = sArr3;
                    view3 = view3;
                    iM6985 = iM6985;
                    String name = interfaceC17889.getName();
                    String parent = interfaceC17889.getParent();
                    arrayList = new ArrayList();
                    itM3596 = C1047.m3596(c16560.m39028());
                    str2 = parent;
                    str3 = name;
                    int iM25612 = C0630.m2566("ܶۤ") ^ i21;
                    sArr3 = sArr3;
                    iM6985 = iM6985;
                    view3 = view3;
                    i27 = i27;
                    i23 = iM25612 ^ (-1558780401);
                    i22 = ((iM25612 ^ i20) * 7107) ^ (-489025746);
                    listView3 = listView3;
                    c19258 = c19258;
                    main3 = main3;
                    break;
                case -1725819301:
                case -845328463:
                    i27 = i27;
                    C1047.m3601((TextView) view4, C0382.m1840(f63246, 499, 8, i26));
                    Main mainM50612 = C22628.m50612(c16560);
                    if (C7811.f24123 >= 0) {
                        int iM6986 = (C2105.m6981("ܰۧ") + i21) * 37;
                        i = ((iM6986 ^ i20) * (-7799)) ^ 1975967972;
                        i3 = iM6986 ^ (-1822412362);
                        c20438 = null;
                        i9 = i27;
                        i23 = i3;
                        i22 = i;
                        i27 = i9;
                    } else {
                        c20438 = new C20438(mainM50612, zArr, strArr2);
                        ListView listView4 = listView3;
                        listView4.setAdapter((ListAdapter) c20438);
                        listView4.setOnItemClickListener(c20438);
                        C19258 c19258M2130 = C0483.m2130(C22628.m50612(c16560));
                        View view5 = view3;
                        C0798.m3013(c19258M2130, view5);
                        iM6985 = iM6985;
                        String strM9031 = C2958.m9031(f63246, 507, 3, i26);
                        if (C3746.f11829 <= 0) {
                            view3 = view5;
                            c19258 = c19258M2130;
                            main3 = main3;
                            sArr3 = sArr3;
                            listView3 = listView4;
                            str = strM9031;
                            interfaceC178811 = interfaceC178811;
                            str3 = str3;
                            iM2567 = (C2105.m6981("ܺ᩻") ^ i21) * (-77);
                            i10 = ((iM2567 ^ i20) * (-7623)) ^ (-2064482112);
                            i11 = -1752707084;
                            i17 = iM2567 ^ i11;
                            sArr3 = sArr3;
                            iM6985 = iM6985;
                            view3 = view3;
                            i27 = i27;
                            i23 = i17;
                            i22 = i10;
                            str3 = str3;
                            listView3 = listView3;
                            main3 = main3;
                            interfaceC178811 = interfaceC178811;
                            c19258 = c19258;
                        } else {
                            int iM6987 = C2105.m6981("᩵ۗ") ^ i20;
                            listView3 = listView4;
                            i22 = ((iM6987 ^ i21) * (-8871)) ^ (-1249189303);
                            view3 = view5;
                            i27 = i27;
                            i23 = iM6987 ^ (-2095090288);
                            iM6985 = iM6985;
                            str = strM9031;
                            c19258 = c19258M2130;
                        }
                    }
                    break;
                case -1678307949:
                case 81595297:
                    ViewOnClickListenerC1958.m6441(c19258, C0630.m2566(str) ^ 2102742746, onClickListener);
                    i27 = i27;
                    iM6983 = C2105.m6981(C1504.m5177(f63246, 510, 3, i26));
                    if (C21923.m49329()) {
                        iM6982 = (C0630.m2566("ۖܺ") + i21) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM6982 ^ i20) * 20481) ^ 285335824;
                        i8 = 492796346;
                    } else {
                        iM6982 = (C2105.m6981("ۤۡ") + i20) * 59;
                        i = ((iM6982 ^ i21) * 5233) ^ 222233652;
                        i8 = 2006378852;
                    }
                    i3 = iM6982 ^ i8;
                    i9 = i27;
                    i23 = i3;
                    i22 = i;
                    i27 = i9;
                    break;
                case -1538083795:
                case -1265268595:
                    i27 = i27;
                    c19258 = c19258;
                    interfaceC178811 = interfaceC178811;
                    main3 = main3;
                    listView3 = listView3;
                    sArr3 = sArr3;
                    str3 = str3;
                    view3 = view3;
                    iM6985 = iM6985;
                    z = false;
                    z = false;
                    z2 = true;
                    if (C0382.m1847(arrayList) == 1) {
                        iM2567 = C0630.m2566("ۛ᩷") ^ i21;
                        i10 = ((iM2567 ^ i20) * 6299) ^ 1804681677;
                        i11 = 893118723;
                    } else {
                        iM2567 = (i20 - C0630.m2566("᩺᩸")) * 17;
                        i10 = ((iM2567 ^ i21) * (-11069)) ^ 161628660;
                        i11 = 61045791;
                    }
                    i17 = iM2567 ^ i11;
                    sArr3 = sArr3;
                    iM6985 = iM6985;
                    view3 = view3;
                    i27 = i27;
                    i23 = i17;
                    i22 = i10;
                    str3 = str3;
                    listView3 = listView3;
                    main3 = main3;
                    interfaceC178811 = interfaceC178811;
                    c19258 = c19258;
                    break;
                case -1530637332:
                case 2107761233:
                    int iM1847 = C0382.m1847(arrayList);
                    strArr = new String[iM1847];
                    zArr = new boolean[iM1847];
                    i25 = 0;
                    int iM25613 = C0630.m2566("ᩴ۫") ^ i21;
                    iM6985 = iM6985;
                    view3 = view3;
                    i27 = i27;
                    strArr2 = strArr;
                    i23 = iM25613 ^ 83637682;
                    i22 = ((iM25613 ^ i20) * 6419) ^ (-178222967);
                    sArr3 = sArr3;
                    str3 = str3;
                    listView3 = listView3;
                    main3 = main3;
                    interfaceC178811 = interfaceC178811;
                    c19258 = c19258;
                    break;
                case -1350143984:
                case 756401219:
                    i12 = i27;
                    i13 = iM6985;
                    listView2 = listView3;
                    main2 = main3;
                    viewM10739 = C3537.m10739(main2, i18 ^ 2121158335);
                    sArr3 = f63246;
                    if (C3663.m11168() < 0) {
                        int iM25614 = C0630.m2566("ۘܿ") ^ i20;
                        i14 = ((iM25614 ^ i21) * 4939) ^ (-1309108338);
                        listView3 = listView2;
                        main3 = main2;
                        iM6985 = i13;
                        view3 = viewM10739;
                        i27 = i12;
                        i23 = iM25614 ^ (-1679530130);
                        i22 = i14;
                    } else {
                        int iM25615 = (C0630.m2566("᩺۠") ^ i21) * (-113);
                        ListView listView5 = listView2;
                        i22 = ((iM25615 ^ i20) * 24747) ^ (-1213640604);
                        i15 = iM25615 ^ 2137045215;
                        listView3 = listView5;
                        main3 = main2;
                        iM6985 = i13;
                        view3 = viewM10739;
                        i27 = i12;
                        i23 = i15;
                    }
                    break;
                case -1307843330:
                case 423597610:
                    C1916.m6308();
                    if (!C2272.f7362) {
                        main = main3;
                        listView = listView3;
                        sArr2 = sArr3;
                        view2 = view3;
                        int iM6988 = (C2105.m6981("ۚ۠") ^ i20) * (-55);
                        Main main4 = main;
                        i22 = ((iM6988 ^ i21) * (-10281)) ^ (-847901806);
                        sArr3 = sArr2;
                        View view6 = view2;
                        listView3 = listView;
                        main3 = main4;
                        i23 = iM6988 ^ (-2036668366);
                        view3 = view6;
                    } else {
                        i27 = i27;
                        iM6982 = (C0630.m2566("ۖܺ") + i21) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM6982 ^ i20) * 20481) ^ 285335824;
                        i8 = 492796346;
                        i3 = iM6982 ^ i8;
                        i9 = i27;
                        i23 = i3;
                        i22 = i;
                        i27 = i9;
                    }
                    break;
                case -1290887099:
                case 301435127:
                    if (C22628.f73083 > 0) {
                        iM2568 = (C0630.m2566("ۧ᩷") ^ i21) * 81;
                        i14 = ((iM2568 ^ i20) * 6025) ^ 495768419;
                        i16 = -1023188927;
                        i23 = iM2568 ^ i16;
                        i22 = i14;
                    } else {
                        i12 = i27;
                        viewM10739 = view3;
                        listView2 = listView3;
                        i13 = iM6985;
                        main2 = main3;
                        int iM25616 = (C0630.m2566("᩺۠") ^ i21) * (-113);
                        ListView listView6 = listView2;
                        i22 = ((iM25616 ^ i20) * 24747) ^ (-1213640604);
                        i15 = iM25616 ^ 2137045215;
                        listView3 = listView6;
                        main3 = main2;
                        iM6985 = i13;
                        view3 = viewM10739;
                        i27 = i12;
                        i23 = i15;
                    }
                    break;
                case -1194869018:
                case 1978481539:
                    i27 = i27;
                    sArr3 = sArr3;
                    View view7 = view3;
                    iM6985 = iM6985;
                    Main main5 = main3;
                    listView3 = listView3;
                    view3 = view7;
                    c19258 = c19258;
                    main3 = main5;
                    if (!C3746.m11370(RunnableC1937.m6378(interfaceC178811.getName()), C1005.m3502(f63246, 486, 4, i26))) {
                        int iM25617 = C0630.m2566("ܶۤ") ^ i21;
                        sArr3 = sArr3;
                        iM6985 = iM6985;
                        view3 = view3;
                        i27 = i27;
                        i23 = iM25617 ^ (-1558780401);
                        i22 = ((iM25617 ^ i20) * 7107) ^ (-489025746);
                        listView3 = listView3;
                        c19258 = c19258;
                        main3 = main3;
                    } else {
                        interfaceC178810 = interfaceC178811;
                        iM6981 = C0630.m2566("ۗܶ") ^ i21;
                        i = ((iM6981 ^ i20) * 337) ^ (-1872082927);
                        i2 = -1733167705;
                        i3 = iM6981 ^ i2;
                        interfaceC178811 = interfaceC178810;
                        sArr3 = sArr3;
                        iM6985 = iM6985;
                        view3 = view3;
                        c19258 = c19258;
                        listView3 = listView3;
                        main3 = main3;
                        i9 = i27;
                        i23 = i3;
                        i22 = i;
                        i27 = i9;
                    }
                    break;
                case -1194194955:
                case 1052414551:
                    i26 = 60999;
                    iM2567 = (i21 - C2105.m6981("۬ۤ")) * (-27);
                    i10 = ((iM2567 ^ i20) * 17795) ^ (-1733206921);
                    i11 = -1584827727;
                    i17 = iM2567 ^ i11;
                    sArr3 = sArr3;
                    iM6985 = iM6985;
                    view3 = view3;
                    i27 = i27;
                    i23 = i17;
                    i22 = i10;
                    str3 = str3;
                    listView3 = listView3;
                    main3 = main3;
                    interfaceC178811 = interfaceC178811;
                    c19258 = c19258;
                    break;
                case -1180265400:
                case -1116579344:
                    zArr[i25] = z2;
                    iM2568 = C2105.m6981("۟ۛ") ^ i21;
                    i14 = ((iM2568 ^ i20) * (-27777)) ^ 1524153549;
                    i16 = 1709218054;
                    i23 = iM2568 ^ i16;
                    i22 = i14;
                    break;
                case -1089387217:
                case -365463195:
                    i12 = i27;
                    viewM10739 = view3;
                    listView2 = listView3;
                    i13 = iM6985;
                    listView2.setDivider(null);
                    View viewM28028 = C11340.m28028(viewM10739, C0630.m2566(C4616.m13542(f63246, 496, 3, i26)) ^ 2098190836);
                    if (C3746.f11829 <= 0) {
                        view4 = viewM28028;
                        main2 = main3;
                        onClickListener = null;
                        int iM25618 = (C0630.m2566("᩺۠") ^ i21) * (-113);
                        ListView listView7 = listView2;
                        i22 = ((iM25618 ^ i20) * 24747) ^ (-1213640604);
                        i15 = iM25618 ^ 2137045215;
                        listView3 = listView7;
                        main3 = main2;
                        iM6985 = i13;
                    } else {
                        int iM25619 = (C0630.m2566("ۛ֡") + i21) * (-121);
                        int i29 = ((iM25619 ^ i20) * 29725) ^ (-57282971);
                        i15 = iM25619 ^ 924624833;
                        listView3 = listView2;
                        view4 = viewM28028;
                        i22 = i29;
                        iM6985 = i13;
                        onClickListener = null;
                    }
                    view3 = viewM10739;
                    i27 = i12;
                    i23 = i15;
                    break;
                case -1060284395:
                case -744282932:
                    i27 = i27;
                    c19258 = c19258;
                    interfaceC178810 = interfaceC178811;
                    main3 = main3;
                    listView3 = listView3;
                    sArr3 = sArr3;
                    view3 = view3;
                    iM6985 = iM6985;
                    if (C1294.m4369(interfaceC178810.getName(), str3)) {
                        iM6981 = C0630.m2566("ۗܶ") ^ i21;
                        i = ((iM6981 ^ i20) * 337) ^ (-1872082927);
                        i2 = -1733167705;
                    } else {
                        iM6981 = C2105.m6981("ᩴܳ") ^ i20;
                        i = ((iM6981 ^ i21) * 11983) ^ 1830227191;
                        i2 = 1829061565;
                    }
                    i3 = iM6981 ^ i2;
                    interfaceC178811 = interfaceC178810;
                    sArr3 = sArr3;
                    iM6985 = iM6985;
                    view3 = view3;
                    c19258 = c19258;
                    listView3 = listView3;
                    main3 = main3;
                    i9 = i27;
                    i23 = i3;
                    i22 = i;
                    i27 = i9;
                    break;
                case -1033400326:
                case -110702562:
                    if (!C1711.f5919) {
                        int iM25620 = (C0630.m2566("ܽۡ") + i20) * (-37);
                        i10 = ((iM25620 ^ i21) * (-27463)) ^ 168966528;
                        i17 = iM25620 ^ 1055446;
                        sArr3 = sArr3;
                        iM6985 = iM6985;
                        view3 = view3;
                        i27 = i27;
                        i23 = i17;
                        i22 = i10;
                        str3 = str3;
                        listView3 = listView3;
                        main3 = main3;
                        interfaceC178811 = interfaceC178811;
                        c19258 = c19258;
                    } else {
                        main = main3;
                        listView = listView3;
                        sArr2 = sArr3;
                        view2 = view3;
                        int iM6989 = (C2105.m6981("ۚ۠") ^ i20) * (-55);
                        Main main6 = main;
                        i22 = ((iM6989 ^ i21) * (-10281)) ^ (-847901806);
                        sArr3 = sArr2;
                        View view8 = view2;
                        listView3 = listView;
                        main3 = main6;
                        i23 = iM6989 ^ (-2036668366);
                        view3 = view8;
                    }
                    break;
                case -1001470947:
                case -660959729:
                    String strM3841 = C1128.m3841(f63246, 472, 14, i26);
                    String parent2 = interfaceC17889.getParent();
                    if (C7106.f21815 == 0) {
                        C7106.m19117(arrayList, new C10211(strM3841, parent2, z, z2));
                        C2126.m7043(c16560).mo6005(c16560, arrayList, new Runnable() { // from class: l.᩵ۡܳ

                            /* JADX INFO: renamed from: ܽܿܽ, reason: not valid java name and contains not printable characters */
                            private static final short[] f62682 = {7343, 28215, 28216, 28210, 28196, 28217, 28223, 28210, 28280, 28223, 28216, 28194, 28211, 28216, 28194, 28280, 28215, 28213, 28194, 28223, 28217, 28216, 28280, 28160, 28191, 28179, 28161, 28210, 28211, 28206, 28176, 28223, 28218, 28211, 28197, 28196, 28211, 28197, 28217, 28195, 28196, 28213, 28211, 28197, 28280, 28215, 28196, 28197, 28213};

                            {
                                int i30 = -551694220;
                                int i31 = C11340.f33930;
                                int i32 = C3245.f10203;
                                int iM69810 = C2105.m6981("᩻ܶ") ^ i32;
                                int i33 = ((iM69810 ^ i31) * (-27571)) ^ 2047160127;
                                int i34 = 215766306;
                                while (true) {
                                    i30 = ((((i30 ^ i31) * (-20587)) >> 31) & i33) ^ (iM69810 ^ i34);
                                    switch (i30) {
                                        case -2074395471:
                                        case 2125682719:
                                            RunnableC1108.m3790();
                                            iM69810 = C0630.m2566("ۖܰ") ^ i31;
                                            i33 = ((iM69810 ^ i32) * 2283) ^ 939715313;
                                            i34 = -1758669238;
                                            break;
                                        case -1839030383:
                                        case 1144527608:
                                            if (C0714.f2697 >= 0) {
                                                iM69810 = C2105.m6981("۬ۧ") ^ i31;
                                                i33 = ((iM69810 ^ i32) * 18879) ^ (-790349458);
                                                i34 = -1310451612;
                                            } else {
                                                iM69810 = (C0630.m2566("ۢۚ") ^ i31) * (-47);
                                                i33 = ((iM69810 ^ i32) * 20221) ^ 735786410;
                                                i34 = -1711381388;
                                            }
                                            break;
                                        case -1780117968:
                                        case 1475200742:
                                            if (C11340.f33930 >= 0) {
                                                iM69810 = C2105.m6981("ۜ۠") ^ i32;
                                                i33 = ((iM69810 ^ i31) * 19627) ^ (-1541098914);
                                                i34 = -1507672227;
                                            } else {
                                                iM69810 = (C2105.m6981("ᩴۗ") + i32) * 89;
                                                i33 = ((iM69810 ^ i31) * 5899) ^ 879364191;
                                                i34 = -285402189;
                                            }
                                            break;
                                        case -1616729012:
                                        case 456636250:
                                            if (C3663.f11553) {
                                                iM69810 = C2105.m6981("ۜ۠") ^ i32;
                                                i33 = ((iM69810 ^ i31) * 19627) ^ (-1541098914);
                                                i34 = -1507672227;
                                            } else {
                                                iM69810 = C2105.m6981("᩷ۢ") ^ i32;
                                                i33 = ((iM69810 ^ i31) * (-2375)) ^ 1903252721;
                                                i34 = 1371291140;
                                            }
                                            break;
                                        case -1420471483:
                                        case 1456244675:
                                            C5695.m16023();
                                            if (!C1916.f6442) {
                                                iM69810 = C2105.m6981("ۜ۠") ^ i32;
                                                i33 = ((iM69810 ^ i31) * 19627) ^ (-1541098914);
                                                i34 = -1507672227;
                                            } else {
                                                iM69810 = C2105.m6981("۬ۧ") ^ i31;
                                                i33 = ((iM69810 ^ i32) * 18879) ^ (-790349458);
                                                i34 = -1310451612;
                                            }
                                            break;
                                        case -1374485698:
                                        case 1985204858:
                                            if (C22628.f73083 <= 0) {
                                                iM69810 = C2105.m6981("ۧ֡") ^ i31;
                                                i33 = ((iM69810 ^ i32) * 25797) ^ (-953704960);
                                                i34 = -2098824347;
                                            } else {
                                                iM69810 = C0630.m2566("֫ܺ") ^ i31;
                                                i33 = ((iM69810 ^ i32) * (-8929)) ^ (-1172501651);
                                                i34 = 1783039472;
                                            }
                                            break;
                                        case -1356473895:
                                        case -29485229:
                                            C3683.m11222();
                                            if (!C3663.f11553) {
                                                iM69810 = C2105.m6981("ۜ۠") ^ i32;
                                                i33 = ((iM69810 ^ i31) * 19627) ^ (-1541098914);
                                                i34 = -1507672227;
                                            } else {
                                                iM69810 = C0630.m2566("ۖܰ") ^ i31;
                                                i33 = ((iM69810 ^ i32) * 2283) ^ 939715313;
                                                i34 = -1758669238;
                                            }
                                            break;
                                        case -1100114909:
                                        case 1541424107:
                                            if (C1504.m5179()) {
                                                iM69810 = C0630.m2566("֫ܶ") ^ i32;
                                                i33 = ((iM69810 ^ i31) * (-7769)) ^ 694147725;
                                                i34 = -781741241;
                                            } else {
                                                iM69810 = C2105.m6981("ۧ֡") ^ i31;
                                                i33 = ((iM69810 ^ i32) * 25797) ^ (-953704960);
                                                i34 = -2098824347;
                                            }
                                            break;
                                        case -1058110713:
                                        case 1124477548:
                                            C3245.m9925();
                                            C3683.m11222();
                                            throw new RuntimeException();
                                        case -976060475:
                                        case -477839894:
                                            return;
                                        case -216105532:
                                        case 1367072208:
                                            if (C0964.f3626 != 0) {
                                                iM69810 = C2105.m6981("۬ۧ") ^ i31;
                                                i33 = ((iM69810 ^ i32) * 18879) ^ (-790349458);
                                                i34 = -1310451612;
                                            } else {
                                                iM69810 = C0630.m2566("᩵᩸") ^ i31;
                                                i33 = ((iM69810 ^ i32) * 29007) ^ (-329750225);
                                                i34 = -820060475;
                                            }
                                            break;
                                        case -64870406:
                                        case 330444448:
                                            if (AbstractC2021.f6743 <= 0) {
                                                iM69810 = C2105.m6981("ۜ۠") ^ i32;
                                                i33 = ((iM69810 ^ i31) * 19627) ^ (-1541098914);
                                                i34 = -1507672227;
                                            } else {
                                                iM69810 = (C2105.m6981("ۧ֨") ^ i32) * 93;
                                                i33 = ((iM69810 ^ i31) * 32467) ^ (-974028711);
                                                i34 = -1879047240;
                                            }
                                            break;
                                        case 344961884:
                                        case 1708057123:
                                            if (C2520.f8000 >= 0) {
                                                iM69810 = C0630.m2566("ۖܰ") ^ i31;
                                                i33 = ((iM69810 ^ i32) * 2283) ^ 939715313;
                                                i34 = -1758669238;
                                            } else {
                                                iM69810 = C2105.m6981("ۗۙ") ^ i32;
                                                i33 = ((iM69810 ^ i31) * 30733) ^ (-419990348);
                                                i34 = -1923327149;
                                            }
                                            break;
                                        case 371516349:
                                        case 1005134367:
                                            if (C1916.f6442) {
                                                iM69810 = C2105.m6981("ۨ۟") ^ i31;
                                                i33 = ((iM69810 ^ i32) * (-17063)) ^ (-1726547836);
                                                i34 = 934168097;
                                            } else {
                                                iM69810 = C2105.m6981("ۧ֡") ^ i31;
                                                i33 = ((iM69810 ^ i32) * 25797) ^ (-953704960);
                                                i34 = -2098824347;
                                            }
                                            break;
                                        case 782643537:
                                        case 1830679725:
                                            if (C4616.f14690 <= 0) {
                                                iM69810 = C0630.m2566("ۖܰ") ^ i31;
                                                i33 = ((iM69810 ^ i32) * 2283) ^ 939715313;
                                                i34 = -1758669238;
                                            } else {
                                                iM69810 = C0630.m2566("᩷ᩴ") ^ i32;
                                                i33 = ((iM69810 ^ i31) * 13475) ^ (-950038657);
                                                i34 = 1412023503;
                                            }
                                            break;
                                        default:
                                            if (ViewOnClickListenerC1958.m6429() >= 0) {
                                                iM69810 = C2105.m6981("ۜ۠") ^ i32;
                                                i33 = ((iM69810 ^ i31) * 19627) ^ (-1541098914);
                                                i34 = -1507672227;
                                            } else {
                                                iM69810 = (C0630.m2566("ۡۙ") ^ i31) * (-5);
                                                i33 = ((iM69810 ^ i32) * (-19331)) ^ 1065231613;
                                                i34 = -1626275148;
                                            }
                                            break;
                                    }
                                }
                            }

                            /* JADX WARN: Code duplicated, block: B:71:0x02c9 A[PHI: r6 r8 r9 r13 r14 r16 r26 r27
                              0x02c9: PHI (r6v3 l.ܽۢܳ) = (r6v2 l.ܽۢܳ), (r6v2 l.ܽۢܳ), (r6v2 l.ܽۢܳ), (r6v2 l.ܽۢܳ), (r6v2 l.ܽۢܳ), (r6v4 l.ܽۢܳ) binds: [B:70:0x02c7, B:34:0x0141, B:28:0x010d, B:18:0x009e, B:16:0x009a, B:53:0x01fb] A[DONT_GENERATE, DONT_INLINE]
                              0x02c9: PHI (r8v5 l.ۤۢܳ) = (r8v2 l.ۤۢܳ), (r8v2 l.ۤۢܳ), (r8v4 l.ۤۢܳ), (r8v2 l.ۤۢܳ), (r8v2 l.ۤۢܳ), (r8v2 l.ۤۢܳ) binds: [B:70:0x02c7, B:34:0x0141, B:28:0x010d, B:18:0x009e, B:16:0x009a, B:53:0x01fb] A[DONT_GENERATE, DONT_INLINE]
                              0x02c9: PHI (r9v4 java.lang.String) = 
                              (r9v2 java.lang.String)
                              (r9v2 java.lang.String)
                              (r9v3 java.lang.String)
                              (r9v2 java.lang.String)
                              (r9v2 java.lang.String)
                              (r9v2 java.lang.String)
                             binds: [B:70:0x02c7, B:34:0x0141, B:28:0x010d, B:18:0x009e, B:16:0x009a, B:53:0x01fb] A[DONT_GENERATE, DONT_INLINE]
                              0x02c9: PHI (r13v4 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:70:0x02c7, B:34:0x0141, B:28:0x010d, B:18:0x009e, B:16:0x009a, B:53:0x01fb] A[DONT_GENERATE, DONT_INLINE]
                              0x02c9: PHI (r14v3 android.content.Intent) = 
                              (r14v2 android.content.Intent)
                              (r14v2 android.content.Intent)
                              (r14v2 android.content.Intent)
                              (r14v2 android.content.Intent)
                              (r14v2 android.content.Intent)
                              (r14v4 android.content.Intent)
                             binds: [B:70:0x02c7, B:34:0x0141, B:28:0x010d, B:18:0x009e, B:16:0x009a, B:53:0x01fb] A[DONT_GENERATE, DONT_INLINE]
                              0x02c9: PHI (r16v4 int) = (r16v3 int), (r16v2 int), (r16v2 int), (r16v2 int), (r16v2 int), (r16v2 int) binds: [B:70:0x02c7, B:34:0x0141, B:28:0x010d, B:18:0x009e, B:16:0x009a, B:53:0x01fb] A[DONT_GENERATE, DONT_INLINE]
                              0x02c9: PHI (r26v5 int) = (r26v4 int), (r26v3 int), (r26v3 int), (r26v3 int), (r26v3 int), (r26v3 int) binds: [B:70:0x02c7, B:34:0x0141, B:28:0x010d, B:18:0x009e, B:16:0x009a, B:53:0x01fb] A[DONT_GENERATE, DONT_INLINE]
                              0x02c9: PHI (r27v3 int) = (r27v2 int), (r27v1 int), (r27v1 int), (r27v1 int), (r27v1 int), (r27v1 int) binds: [B:70:0x02c7, B:34:0x0141, B:28:0x010d, B:18:0x009e, B:16:0x009a, B:53:0x01fb] A[DONT_GENERATE, DONT_INLINE]] */
                            /* JADX WARN: Code duplicated, block: B:75:0x02fe A[PHI: r7 r20 r21
                              0x02fe: PHI (r7v3 java.lang.String) = (r7v2 java.lang.String), (r7v2 java.lang.String), (r7v5 java.lang.String) binds: [B:74:0x02fc, B:42:0x018c, B:38:0x0169] A[DONT_GENERATE, DONT_INLINE]
                              0x02fe: PHI (r20v4 short) = (r20v3 short), (r20v2 short), (r20v2 short) binds: [B:74:0x02fc, B:42:0x018c, B:38:0x0169] A[DONT_GENERATE, DONT_INLINE]
                              0x02fe: PHI (r21v4 short) = (r21v3 short), (r21v2 short), (r21v2 short) binds: [B:74:0x02fc, B:42:0x018c, B:38:0x0169] A[DONT_GENERATE, DONT_INLINE]] */
                            /* JADX WARN: Code duplicated, block: B:77:0x032c A[PHI: r18 r19
                              0x032c: PHI (r18v5 short[]) = (r18v2 short[]), (r18v2 short[]), (r18v3 short[]), (r18v2 short[]) binds: [B:16:0x009a, B:12:0x007b, B:6:0x006c, B:104:0x032c] A[DONT_GENERATE, DONT_INLINE]
                              0x032c: PHI (r19v5 char) = (r19v2 char), (r19v2 char), (r19v3 char), (r19v2 char) binds: [B:16:0x009a, B:12:0x007b, B:6:0x006c, B:104:0x032c] A[DONT_GENERATE, DONT_INLINE]] */
                            @Override // java.lang.Runnable
                            public final void run() {
                                int iM25621;
                                int i30;
                                int i31;
                                int i32 = C2958.f9394;
                                int i33 = C0050.f910;
                                int iM25622 = (i33 - C0630.m2566("ۗܳ")) * (-111);
                                int i34 = ((iM25622 ^ i32) * (-5517)) ^ 1015732099;
                                ArrayList arrayList2 = null;
                                short[] sArr4 = null;
                                short[] sArr5 = null;
                                short[] sArr6 = null;
                                int i35 = iM25622 ^ 578821045;
                                C10130 c10130 = null;
                                int i36 = 0;
                                int i37 = 0;
                                int i38 = 0;
                                Intent intent = null;
                                int i39 = 0;
                                char c = 0;
                                short s2 = 0;
                                short s3 = 0;
                                int i40 = 1453403491;
                                int i41 = 0;
                                int i42 = 0;
                                String strM25626 = null;
                                C10211 c10212 = null;
                                String strM7507 = null;
                                C16560 c16561 = null;
                                int i43 = 0;
                                while (true) {
                                    i40 = i35 ^ (i34 & (((i40 ^ i32) * 12955) >> 31));
                                    switch (i40) {
                                        case -1693124738:
                                        case -725016486:
                                            if (C2958.f9394 >= 0) {
                                                iM25621 = (C0630.m2566("᩸ܿ") ^ i33) * 73;
                                                i30 = ((iM25621 ^ i32) * 22395) ^ (-1530152830);
                                                i31 = 553889281;
                                            } else {
                                                iM25621 = C2105.m6981("ۗۙ") ^ i32;
                                                i30 = ((iM25621 ^ i33) * (-11765)) ^ (-1038652356);
                                                i31 = -1026840676;
                                            }
                                            i35 = iM25621 ^ i31;
                                            i34 = i30;
                                            break;
                                        case -1679300204:
                                        case -438764190:
                                            i36 = 28246;
                                            iM25621 = (i33 - C0630.m2566("֫ᩳ")) * 19;
                                            i30 = ((iM25621 ^ i32) * (-17621)) ^ (-1843501046);
                                            i31 = -736926607;
                                            i35 = iM25621 ^ i31;
                                            i34 = i30;
                                            break;
                                        case -1328641909:
                                        case 936957458:
                                            C4263.m12819();
                                            C3683.m11222();
                                            break;
                                        case -1277223358:
                                        case -875013417:
                                            arrayList2 = arrayList;
                                            if (i43 < C3432.m10481(arrayList2)) {
                                                iM25621 = (i33 - C0630.m2566("ܽۜ")) * 83;
                                                i30 = ((iM25621 ^ i32) * 5117) ^ (-1780981652);
                                                i31 = -1087005143;
                                            } else {
                                                iM25621 = C2105.m6981("᩶ܽ") ^ i33;
                                                i30 = ((iM25621 ^ i32) * 15445) ^ (-875982924);
                                                i31 = -1264799225;
                                            }
                                            i35 = iM25621 ^ i31;
                                            i34 = i30;
                                            break;
                                        case -1048268606:
                                        case 1495273011:
                                            C9340.m24035(interfaceC17889, 2000);
                                            C4075.m12261(C22628.m50612(c16561), intent);
                                            break;
                                        case -1007228752:
                                        case 1411963379:
                                            i36 = 27254;
                                            iM25621 = (i33 - C0630.m2566("֫ᩳ")) * 19;
                                            i30 = ((iM25621 ^ i32) * (-17621)) ^ (-1843501046);
                                            i31 = -736926607;
                                            i35 = iM25621 ^ i31;
                                            i34 = i30;
                                            break;
                                        case -730605953:
                                        case 938059753:
                                            C3019.m9255();
                                            if (C3663.f11553) {
                                                iM25621 = C2105.m6981("᩻۬") ^ i33;
                                                i30 = ((iM25621 ^ i32) * 15831) ^ 698915186;
                                                i31 = -880873336;
                                            } else {
                                                iM25621 = (C0630.m2566("᩸ܿ") ^ i33) * 73;
                                                i30 = ((iM25621 ^ i32) * 22395) ^ (-1530152830);
                                                i31 = 553889281;
                                            }
                                            i35 = iM25621 ^ i31;
                                            i34 = i30;
                                            break;
                                        case -698861239:
                                        case 1195948700:
                                            c10212.m25619();
                                            c10130.m25439(C2958.m9025(c10212.m25622()));
                                            iM25621 = (C2105.m6981("ۡۘ") ^ i32) * (-77);
                                            i30 = ((iM25621 ^ i33) * 4069) ^ (-2090246823);
                                            i31 = 85224175;
                                            i35 = iM25621 ^ i31;
                                            i34 = i30;
                                            break;
                                        case -696402980:
                                        case 506993901:
                                            RunnableC0588.m2441();
                                            if (C0050.f910 >= 0) {
                                                int iM69810 = (C2105.m6981("ۖ۠") ^ i33) * 87;
                                                i35 = iM69810 ^ 144698509;
                                                i34 = ((iM69810 ^ i32) * (-11157)) ^ 275749860;
                                                intent = null;
                                            } else {
                                                iM25621 = (C0630.m2566("᩸ܿ") ^ i33) * 73;
                                                i30 = ((iM25621 ^ i32) * 22395) ^ (-1530152830);
                                                i31 = 553889281;
                                                i35 = iM25621 ^ i31;
                                                i34 = i30;
                                            }
                                            break;
                                        case -675412664:
                                        case 1211798731:
                                            c16561 = c16560;
                                            Main mainM50613 = C22628.m50612(c16561);
                                            Class cls2 = cls;
                                            if (C3432.f10845 < 0) {
                                                intent = new Intent(mainM50613, (Class<?>) cls2);
                                                C0798.m3009(intent, 268435456);
                                                if (C4263.f13799 <= 0) {
                                                    iM25621 = C2105.m6981("᩻۬") ^ i33;
                                                    i30 = ((iM25621 ^ i32) * 15831) ^ 698915186;
                                                    i31 = -880873336;
                                                } else {
                                                    iM25621 = (C0630.m2566("۟ۖ") + i33) * 5;
                                                    i30 = ((iM25621 ^ i32) * 22113) ^ (-1721760974);
                                                    i31 = 825354987;
                                                }
                                                i35 = iM25621 ^ i31;
                                                i34 = i30;
                                            } else {
                                                int iM69811 = (C2105.m6981("ۖ۠") ^ i33) * 87;
                                                i35 = iM69811 ^ 144698509;
                                                i34 = ((iM69811 ^ i32) * (-11157)) ^ 275749860;
                                                intent = null;
                                            }
                                            break;
                                        case -619690577:
                                        case 426832771:
                                            if (C1294.m4369(strM25626, C4075.m12252(sArr6, 35, 14, i36))) {
                                                iM25621 = (C2105.m6981("ۡۘ") ^ i32) * (-77);
                                                i30 = ((iM25621 ^ i33) * 4069) ^ (-2090246823);
                                                i31 = 85224175;
                                            } else {
                                                iM25621 = C2105.m6981("۫᩶") ^ i32;
                                                i30 = ((iM25621 ^ i33) * (-2069)) ^ 1866351528;
                                                i31 = 595202869;
                                            }
                                            i35 = iM25621 ^ i31;
                                            i34 = i30;
                                            break;
                                        case -590961146:
                                        case 1443371981:
                                            c10212 = (C10211) C3537.m10755(arrayList2, i43);
                                            strM25626 = c10212.m25626();
                                            sArr6 = f62682;
                                            if (C0964.m3413()) {
                                                iM25621 = C0630.m2566("ۤۚ") ^ i33;
                                                i30 = ((iM25621 ^ i32) * 25733) ^ 2074046846;
                                                i31 = -439012674;
                                            } else {
                                                iM25621 = C2105.m6981("᩻۬") ^ i33;
                                                i30 = ((iM25621 ^ i32) * 15831) ^ 698915186;
                                                i31 = -880873336;
                                            }
                                            i35 = iM25621 ^ i31;
                                            i34 = i30;
                                            break;
                                        case -569624767:
                                        case 358353006:
                                            sArr5 = f62682;
                                            i37 = 1;
                                            i38 = 26;
                                            if (C11340.f33930 < 0) {
                                                iM25621 = (i32 - C0630.m2566("֡ܰ")) * (-63);
                                                i30 = ((iM25621 ^ i33) * 15383) ^ 1584025206;
                                                i31 = 1109203460;
                                                i35 = iM25621 ^ i31;
                                                i34 = i30;
                                            } else {
                                                int iM69812 = (C2105.m6981("ۖ۠") ^ i33) * 87;
                                                i35 = iM69812 ^ 144698509;
                                                i34 = ((iM69812 ^ i32) * (-11157)) ^ 275749860;
                                                intent = null;
                                            }
                                            break;
                                        case -555708232:
                                        case 337727464:
                                            c10130 = new C10130();
                                            i43 = 0;
                                            iM25621 = C2105.m6981("֨ᩴ") ^ i32;
                                            i30 = ((iM25621 ^ i33) * 1295) ^ 1245144677;
                                            i31 = 1190989081;
                                            i35 = iM25621 ^ i31;
                                            i34 = i30;
                                            break;
                                        case -293211924:
                                        case 192204095:
                                            intent.setAction(C0422.m1955(sArr5, i37, i38, i36));
                                            if (C2105.f7037 != 0) {
                                                iM25621 = (i32 - C0630.m2566("ܶ۫")) * (-13);
                                                i30 = ((iM25621 ^ i33) * (-22021)) ^ (-1620420210);
                                                i31 = 1530601882;
                                            } else {
                                                iM25621 = C0630.m2566("ۙۗ") ^ i32;
                                                i30 = ((iM25621 ^ i33) * 19847) ^ (-1422884264);
                                                i31 = 19787256;
                                            }
                                            i35 = iM25621 ^ i31;
                                            i34 = i30;
                                            break;
                                        case -200283023:
                                        case -153490841:
                                            strM7507 = C2272.m7507(f62682, 27, 8, i36);
                                            if (C4263.f13799 <= 0) {
                                                iM25621 = (i32 - C0630.m2566("ܶ۫")) * (-13);
                                                i30 = ((iM25621 ^ i33) * (-22021)) ^ (-1620420210);
                                                i31 = 1530601882;
                                            } else {
                                                iM25621 = C2105.m6981("ۧ֫") ^ i33;
                                                i30 = ((iM25621 ^ i32) * (-17915)) ^ 1148356938;
                                                i31 = -1378699513;
                                            }
                                            i35 = iM25621 ^ i31;
                                            i34 = i30;
                                            break;
                                        case 542588979:
                                        case 1603416053:
                                            i41 = s2 * s3;
                                            i42 = s2 * s2;
                                            i39 = 1718721;
                                            if (C1294.f4556 >= 0) {
                                                iM25621 = C2105.m6981("᩻۬") ^ i33;
                                                i30 = ((iM25621 ^ i32) * 15831) ^ 698915186;
                                                i31 = -880873336;
                                            } else {
                                                iM25621 = (C0630.m2566("ۢۙ") + i33) * (-47);
                                                i30 = ((iM25621 ^ i32) * 21599) ^ 1847106272;
                                                i31 = -693823201;
                                            }
                                            i35 = iM25621 ^ i31;
                                            i34 = i30;
                                            break;
                                        case 678121842:
                                        case 1491492829:
                                            s2 = sArr4[c];
                                            s3 = 2622;
                                            if (C1005.f3721) {
                                                iM25621 = (C0630.m2566("ۖᩴ") + i33) * (-73);
                                                i30 = ((iM25621 ^ i32) * 22045) ^ (-737699778);
                                                i31 = -1422621894;
                                            } else {
                                                iM25621 = (i32 - C0630.m2566("ܶ۫")) * (-13);
                                                i30 = ((iM25621 ^ i33) * (-22021)) ^ (-1620420210);
                                                i31 = 1530601882;
                                            }
                                            i35 = iM25621 ^ i31;
                                            i34 = i30;
                                            break;
                                        case 685721338:
                                        case 1366782440:
                                            intent.putExtra(strM7507, c10130.m25428());
                                            if (C3019.m9255() <= 0) {
                                                iM25621 = C2105.m6981("᩻۬") ^ i33;
                                                i30 = ((iM25621 ^ i32) * 15831) ^ 698915186;
                                                i31 = -880873336;
                                            } else {
                                                iM25621 = (C0630.m2566("ܺۢ") ^ i32) * 5;
                                                i30 = ((iM25621 ^ i33) * (-21079)) ^ (-211581887);
                                                i31 = 137338553;
                                            }
                                            i35 = iM25621 ^ i31;
                                            i34 = i30;
                                            break;
                                        case 711152621:
                                        case 731590262:
                                            C3746.m11369();
                                            C0483.m2121();
                                            iM25621 = C2105.m6981("᩻۬") ^ i33;
                                            i30 = ((iM25621 ^ i32) * 15831) ^ 698915186;
                                            i31 = -880873336;
                                            i35 = iM25621 ^ i31;
                                            i34 = i30;
                                            break;
                                        case 1104175471:
                                        case 1570141345:
                                            i43++;
                                            iM25621 = C2105.m6981("֨ᩴ") ^ i32;
                                            i30 = ((iM25621 ^ i33) * 1295) ^ 1245144677;
                                            i31 = 1190989081;
                                            i35 = iM25621 ^ i31;
                                            i34 = i30;
                                            break;
                                        case 1260529725:
                                        case 1674800886:
                                            if ((i42 + i39) - i41 < 0) {
                                                iM25621 = C2105.m6981("᩶᩻") ^ i32;
                                                i30 = ((iM25621 ^ i33) * (-3713)) ^ 1667874084;
                                                i31 = 920091874;
                                            } else {
                                                iM25621 = C2105.m6981("ۧ᩻") ^ i32;
                                                i30 = ((iM25621 ^ i33) * (-28159)) ^ (-1851649186);
                                                i31 = 284874625;
                                            }
                                            i35 = iM25621 ^ i31;
                                            i34 = i30;
                                            break;
                                        default:
                                            sArr4 = f62682;
                                            c = 0;
                                            if (C0422.f1886 <= 0) {
                                                iM25621 = (C0630.m2566("᩸ܿ") ^ i33) * 73;
                                                i30 = ((iM25621 ^ i32) * 22395) ^ (-1530152830);
                                                i31 = 553889281;
                                            } else {
                                                iM25621 = (i32 - C2105.m6981("۟۟")) * 21;
                                                i30 = ((iM25621 ^ i33) * (-19151)) ^ 798188391;
                                                i31 = 1127201502;
                                            }
                                            i35 = iM25621 ^ i31;
                                            i34 = i30;
                                            break;
                                    }
                                    return;
                                }
                            }
                        });
                    }
                    int iM25621 = (C0630.m2566("ܽۡ") + i20) * (-37);
                    i10 = ((iM25621 ^ i21) * (-27463)) ^ 168966528;
                    i17 = iM25621 ^ 1055446;
                    sArr3 = sArr3;
                    iM6985 = iM6985;
                    view3 = view3;
                    i27 = i27;
                    i23 = i17;
                    i22 = i10;
                    str3 = str3;
                    listView3 = listView3;
                    main3 = main3;
                    interfaceC178811 = interfaceC178811;
                    c19258 = c19258;
                    break;
                case -906122386:
                case 280051200:
                    i27 = iM6983 ^ 2128238660;
                    iM6985 = 2124657121 ^ C2105.m6981(C3432.m10488(f63246, 513, 3, i26));
                    if (C0422.f1886 > 0) {
                        iM2568 = C0630.m2566("ۢۖ") ^ i21;
                        i14 = ((iM2568 ^ i20) * (-28771)) ^ 1195104617;
                        i16 = 643216596;
                        i23 = iM2568 ^ i16;
                        i22 = i14;
                    } else {
                        main = main3;
                        listView = listView3;
                        sArr2 = sArr3;
                        view2 = view3;
                        int iM69810 = (C2105.m6981("ۚ۠") ^ i20) * (-55);
                        Main main7 = main;
                        i22 = ((iM69810 ^ i21) * (-10281)) ^ (-847901806);
                        sArr3 = sArr2;
                        View view9 = view2;
                        listView3 = listView;
                        main3 = main7;
                        i23 = iM69810 ^ (-2036668366);
                        view3 = view9;
                    }
                    break;
                case -887483755:
                case 1307878979:
                    if (C21923.f70183 != 0) {
                        iM2568 = C2105.m6981("᩷ܿ") ^ i20;
                        i14 = ((iM2568 ^ i21) * 18425) ^ 769274229;
                        i16 = -628099245;
                        i23 = iM2568 ^ i16;
                        i22 = i14;
                    } else {
                        main = main3;
                        listView = listView3;
                        sArr2 = sArr3;
                        view2 = view3;
                        int iM69811 = (C2105.m6981("ۚ۠") ^ i20) * (-55);
                        Main main8 = main;
                        i22 = ((iM69811 ^ i21) * (-10281)) ^ (-847901806);
                        sArr3 = sArr2;
                        View view10 = view2;
                        listView3 = listView;
                        main3 = main8;
                        i23 = iM69811 ^ (-2036668366);
                        view3 = view10;
                    }
                    break;
                case -872947440:
                case 917453224:
                    final DialogInterfaceC0206 dialogInterfaceC0206M16343 = C5834.m16343(c19258, i27, onClickListener, iM6985, onClickListener);
                    final boolean[] zArr2 = zArr;
                    C4159.m12564(C22628.m50609(dialogInterfaceC0206M16343), new View.OnClickListener() { // from class: l.֡ۡܳ

                        /* JADX INFO: renamed from: ᩴ᩵ܽ, reason: not valid java name and contains not printable characters */
                        private static final short[] f1686 = {8140, 17367, -18135, 20283, 13717, 13698, 13716, 13704, 13714, 13717, 13700, 13698, 13716, 13769, 13702, 13717, 13716, 13700};

                        {
                            int i30 = 115074108;
                            int i31 = C1294.f4556;
                            int i32 = ServiceConnectionC3453.f10921;
                            int iM69812 = (C2105.m6981("ܶᩴ") ^ i32) * (-43);
                            int i33 = ((iM69812 ^ i31) * 5439) ^ 837480264;
                            int i34 = -1886798306;
                            while (true) {
                                i30 = ((((i30 ^ i31) * 23233) >> 31) & i33) ^ (iM69812 ^ i34);
                                switch (i30) {
                                    case -2082087188:
                                    case 1712143346:
                                        if (C1294.f4556 >= 0) {
                                            iM69812 = (C2105.m6981("᩻۠") ^ i31) * (-107);
                                            i33 = ((iM69812 ^ i32) * 22511) ^ (-610622732);
                                            i34 = -1873792511;
                                        } else {
                                            iM69812 = C2105.m6981("᩶᩻") ^ i31;
                                            i33 = ((iM69812 ^ i32) * (-27427)) ^ (-1533277875);
                                            i34 = -1898322283;
                                        }
                                        break;
                                    case -1886822623:
                                    case -471760088:
                                        if (C3746.f11829 <= 0) {
                                            iM69812 = (C0630.m2566("ۨܺ") ^ i31) * 73;
                                            i33 = ((iM69812 ^ i32) * 3989) ^ (-12787205);
                                            i34 = -1169756477;
                                        } else {
                                            iM69812 = (C0630.m2566("ܺ᩶") + i31) * (-21);
                                            i33 = ((iM69812 ^ i32) * 18239) ^ (-1020024057);
                                            i34 = -1735658673;
                                        }
                                        break;
                                    case -1123460552:
                                    case 2141517635:
                                        if (C0422.f1886 <= 0) {
                                            iM69812 = C2105.m6981("ۡܶ") ^ i32;
                                            i33 = ((iM69812 ^ i31) * (-25193)) ^ (-1416131490);
                                            i34 = 578475843;
                                        } else {
                                            iM69812 = (C2105.m6981("ܳۚ") ^ i32) * 47;
                                            i33 = ((iM69812 ^ i31) * 1357) ^ (-126940477);
                                            i34 = 248892920;
                                        }
                                        break;
                                    case -1020999420:
                                    case 863399149:
                                        if (C1420.f5096 <= 0) {
                                            iM69812 = (C0630.m2566("ۤܳ") + i32) * q.h;
                                            i33 = ((iM69812 ^ i31) * (-22173)) ^ (-831740173);
                                            i34 = 1249317023;
                                        } else {
                                            iM69812 = C0630.m2566("᩹ᩴ") ^ i32;
                                            i33 = ((iM69812 ^ i31) * 31759) ^ (-195341602);
                                            i34 = 1863410823;
                                        }
                                        break;
                                    case -932818179:
                                    case 1536472420:
                                        C7106.m19120();
                                        C1773.m5908();
                                        throw new RuntimeException();
                                    case -829555130:
                                    case 606234682:
                                        C4159.m12565();
                                        if (!C2126.f7087) {
                                            iM69812 = (C0630.m2566("ۨܺ") ^ i31) * 73;
                                            i33 = ((iM69812 ^ i32) * 3989) ^ (-12787205);
                                            i34 = -1169756477;
                                        } else {
                                            iM69812 = (C0630.m2566("ۤܳ") + i32) * q.h;
                                            i33 = ((iM69812 ^ i31) * (-22173)) ^ (-831740173);
                                            i34 = 1249317023;
                                        }
                                        break;
                                    case -721091859:
                                    case 533960904:
                                        if (RunnableC3474.f10992 <= 0) {
                                            iM69812 = C2105.m6981("ۡܶ") ^ i32;
                                            i33 = ((iM69812 ^ i31) * (-25193)) ^ (-1416131490);
                                            i34 = 578475843;
                                        } else {
                                            iM69812 = C0630.m2566("֨ۗ") ^ i32;
                                            i33 = ((iM69812 ^ i31) * (-11023)) ^ 151578558;
                                            i34 = -275430157;
                                        }
                                        break;
                                    case -543748528:
                                    case 567418491:
                                        if (C7106.f21815 != 0) {
                                            iM69812 = C2105.m6981("ۡܶ") ^ i32;
                                            i33 = ((iM69812 ^ i31) * (-25193)) ^ (-1416131490);
                                            i34 = 578475843;
                                        } else {
                                            iM69812 = (C2105.m6981("ܿ֨") + i32) * (-3);
                                            i33 = ((iM69812 ^ i31) * (-20373)) ^ (-579104942);
                                            i34 = -994694635;
                                        }
                                        break;
                                    case -509568762:
                                    case 1019179266:
                                        if (C2958.f9394 >= 0) {
                                            iM69812 = (C2105.m6981("᩻۠") ^ i31) * (-107);
                                            i33 = ((iM69812 ^ i32) * 22511) ^ (-610622732);
                                            i34 = -1873792511;
                                        } else {
                                            iM69812 = (C0630.m2566("᩵ۛ") ^ i31) * (-79);
                                            i33 = ((iM69812 ^ i32) * (-21397)) ^ 708206544;
                                            i34 = 1105915300;
                                        }
                                        break;
                                    case -162832073:
                                    case 1578026290:
                                        if (C3245.f10203 <= 0) {
                                            iM69812 = C2105.m6981("ۡܶ") ^ i32;
                                            i33 = ((iM69812 ^ i31) * (-25193)) ^ (-1416131490);
                                            i34 = 578475843;
                                        } else {
                                            iM69812 = C0630.m2566("᩸᩸") ^ i31;
                                            i33 = ((iM69812 ^ i32) * (-22793)) ^ 822179816;
                                            i34 = 2047802310;
                                        }
                                        break;
                                    case -39631168:
                                    case 1255399864:
                                        return;
                                    case -16140196:
                                    case 642254103:
                                        RunnableC3474.m10630();
                                        if (C7106.f21815 != 0) {
                                            iM69812 = (C0630.m2566("ۨܺ") ^ i31) * 73;
                                            i33 = ((iM69812 ^ i32) * 3989) ^ (-12787205);
                                            i34 = -1169756477;
                                        } else {
                                            iM69812 = (C0630.m2566("ܺ᩻") ^ i32) * 95;
                                            i33 = ((iM69812 ^ i31) * 25969) ^ (-1205376611);
                                            i34 = 667465874;
                                        }
                                        break;
                                    case 56756140:
                                    case 262980134:
                                        if (AbstractC2021.m6574()) {
                                            iM69812 = C2105.m6981("ۡܶ") ^ i32;
                                            i33 = ((iM69812 ^ i31) * (-25193)) ^ (-1416131490);
                                            i34 = 578475843;
                                        } else {
                                            iM69812 = (C2105.m6981("֨۫") ^ i31) * (-63);
                                            i33 = ((iM69812 ^ i32) * 18963) ^ 2047147809;
                                            i34 = -562984315;
                                        }
                                        break;
                                    case 1182506887:
                                    case 1209244377:
                                        C1504.m5179();
                                        iM69812 = (C0630.m2566("ܺ᩻") ^ i32) * 95;
                                        i33 = ((iM69812 ^ i31) * 25969) ^ (-1205376611);
                                        i34 = 667465874;
                                        break;
                                    case 1394625346:
                                    case 1833865724:
                                        if (!C2272.f7362) {
                                            iM69812 = (C0630.m2566("ܺ᩻") ^ i32) * 95;
                                            i33 = ((iM69812 ^ i31) * 25969) ^ (-1205376611);
                                            i34 = 667465874;
                                        } else {
                                            iM69812 = (C2105.m6981("᩻۠") ^ i31) * (-107);
                                            i33 = ((iM69812 ^ i32) * 22511) ^ (-610622732);
                                            i34 = -1873792511;
                                        }
                                        break;
                                    default:
                                        if (C2105.m6982() != 0) {
                                            iM69812 = (C0630.m2566("ۤܳ") + i32) * q.h;
                                            i33 = ((iM69812 ^ i31) * (-22173)) ^ (-831740173);
                                            i34 = 1249317023;
                                        } else {
                                            iM69812 = C2105.m6981("֡ۡ") ^ i32;
                                            i33 = ((iM69812 ^ i31) * 28921) ^ (-1208620186);
                                            i34 = 448536871;
                                        }
                                        break;
                                }
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:97:0x03bc A[PHI: r1 r3 r18 r19 r24
                          0x03bc: PHI (r1v15 int) = (r1v12 int), (r1v14 int), (r1v19 int) binds: [B:20:0x00a7, B:96:0x03ba, B:92:0x0396] A[DONT_GENERATE, DONT_INLINE]
                          0x03bc: PHI (r3v12 short) = (r3v10 short), (r3v11 short), (r3v14 short) binds: [B:20:0x00a7, B:96:0x03ba, B:92:0x0396] A[DONT_GENERATE, DONT_INLINE]
                          0x03bc: PHI (r18v4 short[]) = (r18v2 short[]), (r18v3 short[]), (r18v2 short[]) binds: [B:20:0x00a7, B:96:0x03ba, B:92:0x0396] A[DONT_GENERATE, DONT_INLINE]
                          0x03bc: PHI (r19v3 char) = (r19v2 char), (r19v2 char), (r19v5 char) binds: [B:20:0x00a7, B:96:0x03ba, B:92:0x0396] A[DONT_GENERATE, DONT_INLINE]
                          0x03bc: PHI (r24v10 java.util.ArrayList) = (r24v7 java.util.ArrayList), (r24v9 java.util.ArrayList), (r24v12 java.util.ArrayList) binds: [B:20:0x00a7, B:96:0x03ba, B:92:0x0396] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view11) {
                            int iM25622;
                            int i30;
                            int i31;
                            short s2;
                            int i32;
                            int iM25623;
                            int i33;
                            int i34;
                            int i35;
                            int i36;
                            int iM25624;
                            int i37;
                            int i38;
                            ArrayList arrayList2;
                            int i39;
                            short s3;
                            int iM69812;
                            int i40;
                            int i41;
                            int iM25625;
                            int i42;
                            ViewOnClickListenerC0311 viewOnClickListenerC0311 = this;
                            int i43 = 1010611830;
                            int i44 = C0714.f2697;
                            int i45 = C0630.f2410;
                            int iM25626 = C0630.m2566("ܺ۠") ^ i45;
                            int i46 = ((iM25626 ^ i44) * 28933) ^ (-2068717416);
                            int i47 = iM25626 ^ 1773976201;
                            final ArrayList arrayList3 = null;
                            short[] sArr4 = null;
                            boolean[] zArr3 = null;
                            boolean z3 = false;
                            int i48 = 0;
                            boolean z4 = false;
                            int i49 = 0;
                            int i50 = 0;
                            int i51 = 0;
                            C10211 c10212 = null;
                            int i52 = 0;
                            int i53 = 0;
                            char c = 0;
                            short s4 = 0;
                            short s5 = 0;
                            int length = 0;
                            short[] sArr5 = null;
                            String strM12252 = null;
                            final InterfaceC17889 interfaceC178813 = null;
                            int length2 = 0;
                            while (true) {
                                i43 = i47 ^ (i46 & (((i43 ^ i44) * (-18715)) >> 31));
                                switch (i43) {
                                    case -2134073114:
                                    case 107489236:
                                        boolean[] zArr4 = zArr2;
                                        length = zArr4.length;
                                        z3 = false;
                                        i48 = 0;
                                        zArr3 = zArr4;
                                        iM25622 = (i45 - C0630.m2566("ᩴᩴ")) * (-53);
                                        i30 = ((iM25622 ^ i44) * (-8179)) ^ 1707350484;
                                        i31 = 1717556413;
                                        int i54 = iM25622 ^ i31;
                                        arrayList3 = arrayList3;
                                        i47 = i54;
                                        i46 = i30;
                                        break;
                                    case -2031702119:
                                    case -497368204:
                                        arrayList3 = arrayList3;
                                        if (zArr3[i48]) {
                                            iM25622 = C0630.m2566("᩺ᩳ") ^ i45;
                                            i30 = ((iM25622 ^ i44) * 2361) ^ (-437537663);
                                            i31 = 1803704006;
                                        } else {
                                            iM25622 = C2105.m6981("ۙܰ") ^ i44;
                                            i30 = ((iM25622 ^ i45) * (-16923)) ^ (-1202801784);
                                            i31 = 558551711;
                                        }
                                        int i55 = iM25622 ^ i31;
                                        arrayList3 = arrayList3;
                                        i47 = i55;
                                        i46 = i30;
                                        break;
                                    case -1990126399:
                                    case -71420965:
                                        short[] sArr6 = f1686;
                                        if (C1773.f6144 > 0) {
                                            arrayList3 = arrayList3;
                                            String strM19110 = C7106.m19110(sArr6, 4, 14, i49);
                                            if (C3683.f11629 < 0) {
                                                interfaceC178813 = interfaceC17889;
                                                c10212 = new C10211(strM19110, interfaceC178813.getParent(), z3, z4);
                                                if (!C2272.f7362) {
                                                    iM25622 = (C0630.m2566("ܰ֡") + i44) * 61;
                                                    i30 = ((iM25622 ^ i45) * 26439) ^ (-2054457081);
                                                    i31 = -1688142664;
                                                    int i56 = iM25622 ^ i31;
                                                    arrayList3 = arrayList3;
                                                    i47 = i56;
                                                    i46 = i30;
                                                } else {
                                                    i36 = length;
                                                    iM25624 = (i45 - C0630.m2566("ۖ۫")) * (-105);
                                                    i37 = ((iM25624 ^ i44) * 4927) ^ (-895324932);
                                                    i38 = 60782280;
                                                    i35 = iM25624 ^ i38;
                                                    length = i36;
                                                    i46 = i37;
                                                    arrayList3 = arrayList3;
                                                    i47 = i35;
                                                    viewOnClickListenerC0311 = this;
                                                }
                                            } else {
                                                s2 = s4;
                                                i32 = length;
                                                int iM69813 = (C2105.m6981("ۖ֡") + i45) * 31;
                                                int i57 = ((iM69813 ^ i44) * 20047) ^ 2115044932;
                                                i35 = iM69813 ^ (-1061055932);
                                                length = i32;
                                                s4 = s2;
                                                i46 = i57;
                                                arrayList3 = arrayList3;
                                                c10212 = null;
                                                i47 = i35;
                                                viewOnClickListenerC0311 = this;
                                            }
                                        } else {
                                            arrayList2 = arrayList3;
                                            s3 = s4;
                                            i39 = length;
                                            int iM69814 = (i44 - C2105.m6981("ۜۢ")) * (-93);
                                            length = i39;
                                            s4 = s3;
                                            i46 = ((iM69814 ^ i45) * (-2675)) ^ (-1742263988);
                                            c10212 = null;
                                            ArrayList arrayList4 = arrayList2;
                                            i47 = iM69814 ^ (-372845233);
                                            arrayList3 = arrayList4;
                                        }
                                        break;
                                    case -1848312985:
                                    case -95405135:
                                        arrayList3.remove(length2);
                                        iM25625 = (C2105.m6981("ۢۧ") + i45) * 23;
                                        i30 = ((iM25625 ^ i44) * (-29951)) ^ 766760377;
                                        i42 = 220871550;
                                        i47 = iM25625 ^ i42;
                                        i46 = i30;
                                        break;
                                    case -1813022685:
                                    case 1636335558:
                                        i49 = 13799;
                                        iM69812 = (C2105.m6981("ۘۛ") ^ i44) * 17;
                                        i40 = ((iM69812 ^ i45) * 30657) ^ (-155285366);
                                        i41 = -209227240;
                                        int i58 = iM69812 ^ i41;
                                        length = length;
                                        i46 = i40;
                                        arrayList3 = arrayList3;
                                        i47 = i58;
                                        break;
                                    case -1710705686:
                                    case 825358009:
                                        C3663.m11167(dialogInterfaceC0206M16343);
                                        length2 = zArr3.length - 1;
                                        z4 = true;
                                        iM25622 = C0630.m2566("۬᩺") ^ i44;
                                        i30 = ((iM25622 ^ i45) * (-20533)) ^ 2119120643;
                                        i31 = 282696472;
                                        int i59 = iM25622 ^ i31;
                                        arrayList3 = arrayList3;
                                        i47 = i59;
                                        i46 = i30;
                                        break;
                                    case -1673134148:
                                    case -246532689:
                                        arrayList2 = arrayList3;
                                        i39 = length;
                                        i52 = s4 * s5;
                                        s3 = s4;
                                        int i60 = s3 + 383;
                                        if (C4263.f13799 <= 0) {
                                            i53 = i60;
                                            int iM69815 = (i44 - C2105.m6981("ۜۢ")) * (-93);
                                            length = i39;
                                            s4 = s3;
                                            i46 = ((iM69815 ^ i45) * (-2675)) ^ (-1742263988);
                                            c10212 = null;
                                            ArrayList arrayList5 = arrayList2;
                                            i47 = iM69815 ^ (-372845233);
                                            arrayList3 = arrayList5;
                                        } else {
                                            int iM25627 = C0630.m2566("᩸ܶ") ^ i44;
                                            int i61 = ((iM25627 ^ i45) * 26641) ^ 1995150801;
                                            int i62 = iM25627 ^ (-923004820);
                                            length = i39;
                                            s4 = s3;
                                            i46 = i61;
                                            viewOnClickListenerC0311 = this;
                                            i53 = i60;
                                            arrayList3 = arrayList2;
                                            i47 = i62;
                                        }
                                        break;
                                    case -1634308085:
                                    case -721367697:
                                        arrayList3 = arrayList;
                                        if (length2 >= 0) {
                                            iM25625 = C2105.m6981("ۨᩴ") ^ i45;
                                            i30 = ((iM25625 ^ i44) * 11197) ^ (-624726955);
                                            i42 = 987204042;
                                        } else {
                                            iM25625 = C0630.m2566("۠ۧ") ^ i45;
                                            i30 = ((iM25625 ^ i44) * 23309) ^ (-159913290);
                                            i42 = -1592917862;
                                        }
                                        i47 = iM25625 ^ i42;
                                        i46 = i30;
                                        break;
                                    case -1537894806:
                                    case 172953249:
                                        C4075.m12263();
                                        break;
                                    case -1469748959:
                                    case -1358621707:
                                        i48++;
                                        iM25622 = (i45 - C0630.m2566("ᩴᩴ")) * (-53);
                                        i30 = ((iM25622 ^ i44) * (-8179)) ^ 1707350484;
                                        i31 = 1717556413;
                                        int i510 = iM25622 ^ i31;
                                        arrayList3 = arrayList3;
                                        i47 = i510;
                                        i46 = i30;
                                        break;
                                    case -1394174226:
                                    case 1617401344:
                                        if (zArr3[length2]) {
                                            iM25625 = (C2105.m6981("ۢۧ") + i45) * 23;
                                            i30 = ((iM25625 ^ i44) * (-29951)) ^ 766760377;
                                            i42 = 220871550;
                                        } else {
                                            iM25625 = C2105.m6981("۬۫") ^ i44;
                                            i30 = ((iM25625 ^ i45) * 9585) ^ (-1897321678);
                                            i42 = 1948253395;
                                        }
                                        i47 = iM25625 ^ i42;
                                        i46 = i30;
                                        break;
                                    case -1378437543:
                                    case 1429744934:
                                        if (!C1504.f5354) {
                                            arrayList2 = arrayList3;
                                            s3 = s4;
                                            i39 = length;
                                            int iM69816 = (i44 - C2105.m6981("ۜۢ")) * (-93);
                                            length = i39;
                                            s4 = s3;
                                            i46 = ((iM69816 ^ i45) * (-2675)) ^ (-1742263988);
                                            c10212 = null;
                                            ArrayList arrayList6 = arrayList2;
                                            i47 = iM69816 ^ (-372845233);
                                            arrayList3 = arrayList6;
                                        } else {
                                            arrayList3 = arrayList3;
                                            s2 = s4;
                                            i32 = length;
                                            int iM69817 = (C2105.m6981("ۖ֡") + i45) * 31;
                                            int i511 = ((iM69817 ^ i44) * 20047) ^ 2115044932;
                                            i35 = iM69817 ^ (-1061055932);
                                            length = i32;
                                            s4 = s2;
                                            i46 = i511;
                                            arrayList3 = arrayList3;
                                            c10212 = null;
                                            i47 = i35;
                                            viewOnClickListenerC0311 = this;
                                        }
                                        break;
                                    case -1240250392:
                                    case 28615830:
                                        arrayList3 = arrayList3;
                                        s2 = s4;
                                        i32 = length;
                                        c = 0;
                                        if (C3245.f10203 <= 0) {
                                            int iM69818 = (C2105.m6981("ۖ֡") + i45) * 31;
                                            int i512 = ((iM69818 ^ i44) * 20047) ^ 2115044932;
                                            i35 = iM69818 ^ (-1061055932);
                                            length = i32;
                                            s4 = s2;
                                            i46 = i512;
                                            arrayList3 = arrayList3;
                                            c10212 = null;
                                        } else {
                                            iM25623 = (C2105.m6981("᩵֨") + i45) * 9;
                                            i33 = ((iM25623 ^ i44) * (-1071)) ^ (-514695474);
                                            i34 = 1690515102;
                                            i35 = iM25623 ^ i34;
                                            length = i32;
                                            s4 = s2;
                                            i46 = i33;
                                            arrayList3 = arrayList3;
                                        }
                                        i47 = i35;
                                        viewOnClickListenerC0311 = this;
                                        break;
                                    case -1000950955:
                                    case -833033361:
                                        C0382.m1848();
                                        if (C0630.f2410 > 0) {
                                            iM25625 = (i44 - C2105.m6981("ܽᩳ")) * 33;
                                            i30 = ((iM25625 ^ i45) * 499) ^ 1191714578;
                                            i42 = 651193145;
                                            i47 = iM25625 ^ i42;
                                            i46 = i30;
                                        } else {
                                            arrayList2 = arrayList3;
                                            s3 = s4;
                                            i39 = length;
                                            int iM69819 = (i44 - C2105.m6981("ۜۢ")) * (-93);
                                            length = i39;
                                            s4 = s3;
                                            i46 = ((iM69819 ^ i45) * (-2675)) ^ (-1742263988);
                                            c10212 = null;
                                            ArrayList arrayList7 = arrayList2;
                                            i47 = iM69819 ^ (-372845233);
                                            arrayList3 = arrayList7;
                                        }
                                        break;
                                    case -399994632:
                                    case 1548903359:
                                        arrayList3 = arrayList3;
                                        length = length;
                                        if (i48 < length) {
                                            iM69812 = C0630.m2566("᩸ۛ") ^ i45;
                                            i40 = ((iM69812 ^ i44) * 18909) ^ (-1850240331);
                                            i41 = -598377540;
                                        } else {
                                            iM69812 = (i44 - C2105.m6981("ۛᩴ")) * (-71);
                                            i40 = ((iM69812 ^ i45) * 28577) ^ (-95924250);
                                            i41 = -1985600231;
                                        }
                                        int i513 = iM69812 ^ i41;
                                        length = length;
                                        i46 = i40;
                                        arrayList3 = arrayList3;
                                        i47 = i513;
                                        break;
                                    case -393387733:
                                    case 1185952207:
                                        arrayList3 = arrayList3;
                                        length = length;
                                        if ((i53 * i53) - i52 < 0) {
                                            iM69812 = C0630.m2566("ᩳܺ") ^ i45;
                                            i40 = ((iM69812 ^ i44) * 31683) ^ (-831272241);
                                            i41 = 1886629933;
                                        } else {
                                            iM69812 = (i44 - C2105.m6981("᩶᩺")) * (-41);
                                            i40 = ((iM69812 ^ i45) * 563) ^ (-104410754);
                                            i41 = 1414795641;
                                        }
                                        int i514 = iM69812 ^ i41;
                                        length = length;
                                        i46 = i40;
                                        arrayList3 = arrayList3;
                                        i47 = i514;
                                        break;
                                    case -225123923:
                                    case 241612075:
                                        C1504.m5167(C0630.m2566(strM12252) ^ 2128558296);
                                        break;
                                    case -113963399:
                                    case 32779293:
                                        arrayList3 = arrayList3;
                                        sArr4 = f1686;
                                        i50 = 1;
                                        i51 = 3;
                                        if (ViewOnClickListenerC1958.f6529 > 0) {
                                            iM25622 = (i45 - C0630.m2566("ۢۡ")) * 53;
                                            i30 = ((iM25622 ^ i44) * (-10063)) ^ 2052847405;
                                            i31 = -1674475086;
                                            int i515 = iM25622 ^ i31;
                                            arrayList3 = arrayList3;
                                            i47 = i515;
                                            i46 = i30;
                                        } else {
                                            i36 = length;
                                            iM25624 = (i45 - C0630.m2566("ۖ۫")) * (-105);
                                            i37 = ((iM25624 ^ i44) * 4927) ^ (-895324932);
                                            i38 = 60782280;
                                            i35 = iM25624 ^ i38;
                                            length = i36;
                                            i46 = i37;
                                            arrayList3 = arrayList3;
                                            i47 = i35;
                                            viewOnClickListenerC0311 = this;
                                        }
                                        break;
                                    case 440630815:
                                    case 2126668574:
                                        if (C4263.m12819() < 0) {
                                            arrayList3 = arrayList3;
                                            iM25622 = (C2105.m6981("ᩴ᩵") + i45) * 39;
                                            i30 = ((iM25622 ^ i44) * (-2119)) ^ 1002520211;
                                            i31 = 2091114248;
                                            int i516 = iM25622 ^ i31;
                                            arrayList3 = arrayList3;
                                            i47 = i516;
                                            i46 = i30;
                                        } else {
                                            arrayList2 = arrayList3;
                                            s3 = s4;
                                            i39 = length;
                                            int iM698110 = (i44 - C2105.m6981("ۜۢ")) * (-93);
                                            length = i39;
                                            s4 = s3;
                                            i46 = ((iM698110 ^ i45) * (-2675)) ^ (-1742263988);
                                            c10212 = null;
                                            ArrayList arrayList8 = arrayList2;
                                            i47 = iM698110 ^ (-372845233);
                                            arrayList3 = arrayList8;
                                        }
                                        break;
                                    case 446037761:
                                    case 994493195:
                                        C3019.m9255();
                                        arrayList2 = arrayList3;
                                        s3 = s4;
                                        i39 = length;
                                        int iM698111 = (i44 - C2105.m6981("ۜۢ")) * (-93);
                                        length = i39;
                                        s4 = s3;
                                        i46 = ((iM698111 ^ i45) * (-2675)) ^ (-1742263988);
                                        c10212 = null;
                                        ArrayList arrayList9 = arrayList2;
                                        i47 = iM698111 ^ (-372845233);
                                        arrayList3 = arrayList9;
                                        break;
                                    case 668675481:
                                    case 1919900526:
                                        C1916.m6307(arrayList3, c10212);
                                        final C16560 c16561 = c16560;
                                        AbstractC16891 abstractC16891M12569 = C4159.m12569(c16561);
                                        if (!C2520.m8026()) {
                                            final Class cls2 = cls;
                                            abstractC16891M12569.mo6005(c16561, arrayList3, new Runnable() { // from class: l.֨ۡܳ

                                                /* JADX INFO: renamed from: ۤۜۤ, reason: not valid java name and contains not printable characters */
                                                private static final short[] f3746 = {4085, 10713, 10710, 10716, 10698, 10711, 10705, 10716, 10646, 10705, 10710, 10700, 10717, 10710, 10700, 10646, 10713, 10715, 10700, 10705, 10711, 10710, 10646, 10734, 10737, 10749, 10735, 10716, 10717, 10688, 10750, 10705, 10708, 10717, 10699, 10698, 10717, 10699, 10711, 10701, 10698, 10715, 10717, 10699, 10646, 10713, 10698, 10699, 10715};

                                                {
                                                    int i63 = 1464563313;
                                                    int i64 = C3019.f9544;
                                                    int i65 = C5695.f17556;
                                                    int iM25628 = (C0630.m2566("ᩳܳ") ^ i64) * 45;
                                                    int i66 = ((iM25628 ^ i65) * (-15669)) ^ 795266440;
                                                    int i67 = -2025210253;
                                                    while (true) {
                                                        i63 = ((((i63 ^ i65) * 6987) >> 31) & i66) ^ (iM25628 ^ i67);
                                                        switch (i63) {
                                                            case -1999164069:
                                                            case -1261736244:
                                                                return;
                                                            case -1995206505:
                                                            case -95408789:
                                                                if (C0964.m3413()) {
                                                                    iM25628 = (C2105.m6981("᩻۠") ^ i64) * 123;
                                                                    i66 = ((iM25628 ^ i65) * (-9417)) ^ (-1503203720);
                                                                    i67 = -1507732913;
                                                                } else {
                                                                    iM25628 = (i64 - C2105.m6981("᩻᩻")) * (-55);
                                                                    i66 = ((iM25628 ^ i65) * 30363) ^ 646304352;
                                                                    i67 = -1663303342;
                                                                }
                                                                break;
                                                            case -1970750846:
                                                            case -1285893496:
                                                                if (C0050.f910 >= 0) {
                                                                    iM25628 = (C2105.m6981("ۗܶ") ^ i65) * 75;
                                                                    i66 = ((iM25628 ^ i64) * 20643) ^ 161423101;
                                                                    i67 = -2009201165;
                                                                } else {
                                                                    iM25628 = C0630.m2566("ᩳۗ") ^ i65;
                                                                    i66 = ((iM25628 ^ i64) * 19041) ^ 1230714132;
                                                                    i67 = 1509913695;
                                                                }
                                                                break;
                                                            case -1962259144:
                                                            case 870436000:
                                                                if (C5695.f17556 >= 0) {
                                                                    iM25628 = (C2105.m6981("ۗܶ") ^ i65) * 75;
                                                                    i66 = ((iM25628 ^ i64) * 20643) ^ 161423101;
                                                                    i67 = -2009201165;
                                                                } else {
                                                                    iM25628 = C2105.m6981("ܳ۫") ^ i64;
                                                                    i66 = ((iM25628 ^ i65) * 2827) ^ 1110493759;
                                                                    i67 = 1730794858;
                                                                }
                                                                break;
                                                            case -1779192163:
                                                            case 1045993151:
                                                                C4263.m12819();
                                                                throw new RuntimeException();
                                                            case -866204139:
                                                            case 136487140:
                                                                if (AbstractC2021.f6743 <= 0) {
                                                                    iM25628 = (i64 - C2105.m6981("᩻᩻")) * (-55);
                                                                    i66 = ((iM25628 ^ i65) * 30363) ^ 646304352;
                                                                    i67 = -1663303342;
                                                                } else {
                                                                    iM25628 = (C2105.m6981("ۙۖ") + i65) * (-9);
                                                                    i66 = ((iM25628 ^ i64) * (-22747)) ^ (-1705348922);
                                                                    i67 = -314420129;
                                                                }
                                                                break;
                                                            case -783547479:
                                                            case 210990626:
                                                                if (C4159.f13567) {
                                                                    iM25628 = (i65 - C2105.m6981("۫ܳ")) * (-61);
                                                                    i66 = ((iM25628 ^ i64) * 12455) ^ (-1762197193);
                                                                    i67 = 354371539;
                                                                } else {
                                                                    iM25628 = C0630.m2566("ܿ᩷") ^ i64;
                                                                    i66 = ((iM25628 ^ i65) * (-17853)) ^ (-335850955);
                                                                    i67 = -88247320;
                                                                }
                                                                break;
                                                            case -565295825:
                                                            case 611493685:
                                                                if (C4616.m13552() != 0) {
                                                                    iM25628 = (i64 - C2105.m6981("᩻᩻")) * (-55);
                                                                    i66 = ((iM25628 ^ i65) * 30363) ^ 646304352;
                                                                    i67 = -1663303342;
                                                                } else {
                                                                    iM25628 = C0630.m2566("ᩴ۫") ^ i64;
                                                                    i66 = ((iM25628 ^ i65) * 9591) ^ 1041072059;
                                                                    i67 = -516831963;
                                                                }
                                                                break;
                                                            case -263176504:
                                                            case 387711232:
                                                                if (C2167.f7158 >= 0) {
                                                                    iM25628 = (i64 - C2105.m6981("᩻᩻")) * (-55);
                                                                    i66 = ((iM25628 ^ i65) * 30363) ^ 646304352;
                                                                    i67 = -1663303342;
                                                                } else {
                                                                    iM25628 = (C0630.m2566("ۨۘ") + i65) * 97;
                                                                    i66 = ((iM25628 ^ i64) * 22897) ^ 656383749;
                                                                    i67 = -596745896;
                                                                }
                                                                break;
                                                            case -145186165:
                                                            case 1301978350:
                                                                if (C3663.m11168() < 0) {
                                                                    iM25628 = C2105.m6981("ۤ᩸") ^ i65;
                                                                    i66 = ((iM25628 ^ i64) * 21471) ^ (-1759768097);
                                                                    i67 = -1423159373;
                                                                } else {
                                                                    iM25628 = (C0630.m2566("ۨۘ") + i65) * 97;
                                                                    i66 = ((iM25628 ^ i64) * 22897) ^ 656383749;
                                                                    i67 = -596745896;
                                                                }
                                                                break;
                                                            case 415954399:
                                                            case 1876781634:
                                                                C1773.m5908();
                                                                C1773.m5908();
                                                                iM25628 = (C0630.m2566("ۨۘ") + i65) * 97;
                                                                i66 = ((iM25628 ^ i64) * 22897) ^ 656383749;
                                                                i67 = -596745896;
                                                                break;
                                                            case 484228238:
                                                            case 611223437:
                                                                if (C0714.m2805()) {
                                                                    iM25628 = (C2105.m6981("᩶᩺") ^ i65) * (-121);
                                                                    i66 = ((iM25628 ^ i64) * 17649) ^ (-505881895);
                                                                    i67 = 409440750;
                                                                } else {
                                                                    iM25628 = C0630.m2566("ܿ᩷") ^ i64;
                                                                    i66 = ((iM25628 ^ i65) * (-17853)) ^ (-335850955);
                                                                    i67 = -88247320;
                                                                }
                                                                break;
                                                            case 764510585:
                                                            case 1145732275:
                                                                if (C2126.f7087) {
                                                                    iM25628 = (C2105.m6981("ۗܶ") ^ i65) * 75;
                                                                    i66 = ((iM25628 ^ i64) * 20643) ^ 161423101;
                                                                    i67 = -2009201165;
                                                                } else {
                                                                    iM25628 = (C0630.m2566("ܶۜ") + i64) * (-73);
                                                                    i66 = ((iM25628 ^ i65) * (-28967)) ^ (-2133041114);
                                                                    i67 = 544295924;
                                                                }
                                                                break;
                                                            case 1120981219:
                                                            case 1720866982:
                                                                if (RunnableC1108.f4040) {
                                                                    iM25628 = (i65 - C2105.m6981("ۚ֨")) * 65;
                                                                    i66 = ((iM25628 ^ i64) * (-30675)) ^ 485980255;
                                                                    i67 = -460743258;
                                                                } else {
                                                                    iM25628 = (i64 - C2105.m6981("᩻᩻")) * (-55);
                                                                    i66 = ((iM25628 ^ i65) * 30363) ^ 646304352;
                                                                    i67 = -1663303342;
                                                                }
                                                                break;
                                                            case 1539327202:
                                                            case 1863146398:
                                                                if (ViewOnClickListenerC1958.f6529 <= 0) {
                                                                    iM25628 = C2105.m6981("ۤ᩸") ^ i65;
                                                                    i66 = ((iM25628 ^ i64) * 21471) ^ (-1759768097);
                                                                    i67 = -1423159373;
                                                                } else {
                                                                    iM25628 = (C0630.m2566("ܳ۬") + i64) * (-29);
                                                                    i66 = ((iM25628 ^ i65) * (-18399)) ^ (-467172643);
                                                                    i67 = 482078239;
                                                                }
                                                                break;
                                                            default:
                                                                if (C3537.f11231 >= 0) {
                                                                    iM25628 = C0630.m2566("ܿ᩷") ^ i64;
                                                                    i66 = ((iM25628 ^ i65) * (-17853)) ^ (-335850955);
                                                                    i67 = -88247320;
                                                                } else {
                                                                    iM25628 = (C0630.m2566("ۨۘ") + i65) * 97;
                                                                    i66 = ((iM25628 ^ i64) * 22897) ^ 656383749;
                                                                    i67 = -596745896;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                }

                                                /* JADX WARN: Code duplicated, block: B:46:0x01aa A[PHI: r7 r10 r11 r13
                                                  0x01aa: PHI (r7v5 java.lang.String) = 
                                                  (r7v2 java.lang.String)
                                                  (r7v4 java.lang.String)
                                                  (r7v2 java.lang.String)
                                                  (r7v2 java.lang.String)
                                                  (r7v2 java.lang.String)
                                                 binds: [B:45:0x01a8, B:37:0x014d, B:17:0x0087, B:15:0x0083, B:12:0x007a] A[DONT_GENERATE, DONT_INLINE]
                                                  0x01aa: PHI (r10v4 short[]) = (r10v3 short[]), (r10v2 short[]), (r10v2 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:45:0x01a8, B:37:0x014d, B:17:0x0087, B:15:0x0083, B:12:0x007a] A[DONT_GENERATE, DONT_INLINE]
                                                  0x01aa: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:45:0x01a8, B:37:0x014d, B:17:0x0087, B:15:0x0083, B:12:0x007a] A[DONT_GENERATE, DONT_INLINE]
                                                  0x01aa: PHI (r13v4 int) = (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:45:0x01a8, B:37:0x014d, B:17:0x0087, B:15:0x0083, B:12:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
                                                /* JADX WARN: Code duplicated, block: B:71:0x02ea A[PHI: r19 r20 r25 r26
                                                  0x02ea: PHI (r19v5 short) = (r19v3 short), (r19v2 short), (r19v2 short), (r19v2 short), (r19v2 short) binds: [B:70:0x02e8, B:33:0x0123, B:12:0x007a, B:6:0x006b, B:103:0x02ea] A[DONT_GENERATE, DONT_INLINE]
                                                  0x02ea: PHI (r20v5 int) = (r20v2 int), (r20v2 int), (r20v2 int), (r20v3 int), (r20v2 int) binds: [B:70:0x02e8, B:33:0x0123, B:12:0x007a, B:6:0x006b, B:103:0x02ea] A[DONT_GENERATE, DONT_INLINE]
                                                  0x02ea: PHI (r25v6 short) = (r25v4 short), (r25v3 short), (r25v3 short), (r25v3 short), (r25v3 short) binds: [B:70:0x02e8, B:33:0x0123, B:12:0x007a, B:6:0x006b, B:103:0x02ea] A[DONT_GENERATE, DONT_INLINE]
                                                  0x02ea: PHI (r26v4 short) = (r26v1 short), (r26v1 short), (r26v1 short), (r26v2 short), (r26v1 short) binds: [B:70:0x02e8, B:33:0x0123, B:12:0x007a, B:6:0x006b, B:103:0x02ea] A[DONT_GENERATE, DONT_INLINE]] */
                                                /* JADX WARN: Code duplicated, block: B:75:0x0320 A[PHI: r8 r9 r14 r17 r18
                                                  0x0320: PHI (r8v5 l.ۤۢܳ) = (r8v2 l.ۤۢܳ), (r8v4 l.ۤۢܳ), (r8v2 l.ۤۢܳ) binds: [B:74:0x031e, B:27:0x00f1, B:15:0x0083] A[DONT_GENERATE, DONT_INLINE]
                                                  0x0320: PHI (r9v4 java.lang.String) = (r9v2 java.lang.String), (r9v3 java.lang.String), (r9v2 java.lang.String) binds: [B:74:0x031e, B:27:0x00f1, B:15:0x0083] A[DONT_GENERATE, DONT_INLINE]
                                                  0x0320: PHI (r14v4 short[]) = (r14v2 short[]), (r14v3 short[]), (r14v2 short[]) binds: [B:74:0x031e, B:27:0x00f1, B:15:0x0083] A[DONT_GENERATE, DONT_INLINE]
                                                  0x0320: PHI (r17v4 short[]) = (r17v3 short[]), (r17v2 short[]), (r17v2 short[]) binds: [B:74:0x031e, B:27:0x00f1, B:15:0x0083] A[DONT_GENERATE, DONT_INLINE]
                                                  0x0320: PHI (r18v4 char) = (r18v3 char), (r18v2 char), (r18v2 char) binds: [B:74:0x031e, B:27:0x00f1, B:15:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int iM25628;
                                                    int i63;
                                                    int i64;
                                                    int i65 = C2958.f9394;
                                                    int i66 = C0630.f2410;
                                                    int iM69820 = (i66 - C2105.m6981("ܳۧ")) * 93;
                                                    int i67 = ((iM69820 ^ i65) * (-9793)) ^ (-717932004);
                                                    ArrayList arrayList10 = null;
                                                    short[] sArr7 = null;
                                                    short[] sArr8 = null;
                                                    short[] sArr9 = null;
                                                    int i68 = iM69820 ^ 1573125358;
                                                    C10130 c10130 = null;
                                                    int i69 = 0;
                                                    int i70 = 0;
                                                    Intent intent = null;
                                                    int i71 = 0;
                                                    char c2 = 0;
                                                    short s6 = 0;
                                                    int i72 = 0;
                                                    int i73 = -1724215019;
                                                    short s7 = 0;
                                                    short s8 = 0;
                                                    String strM25626 = null;
                                                    C10211 c10213 = null;
                                                    String strM6573 = null;
                                                    C16560 c16562 = null;
                                                    int i74 = 0;
                                                    while (true) {
                                                        i73 = i68 ^ (i67 & (((i73 ^ i65) * 29271) >> 31));
                                                        switch (i73) {
                                                            case -2086281596:
                                                            case 1370333266:
                                                                c10213.m25619();
                                                                c10130.m25439(C4117.m12359(c10213.m25622()));
                                                                iM25628 = (C0630.m2566("ܰ֨") ^ i65) * 109;
                                                                i63 = ((iM25628 ^ i66) * 2299) ^ 400518393;
                                                                i64 = -1854613110;
                                                                i68 = iM25628 ^ i64;
                                                                i67 = i63;
                                                                break;
                                                            case -1848765796:
                                                            case 735727846:
                                                                C3911.m11924();
                                                                if (!C3663.f11553) {
                                                                    int iM25629 = (i65 - C0630.m2566("ܿܽ")) * (-47);
                                                                    i68 = iM25629 ^ (-1767055983);
                                                                    i67 = ((iM25629 ^ i66) * 31051) ^ (-449125790);
                                                                    intent = null;
                                                                } else {
                                                                    iM25628 = C2105.m6981("᩸ܰ") ^ i66;
                                                                    i63 = ((iM25628 ^ i65) * (-14765)) ^ (-1237049459);
                                                                    i64 = 136517408;
                                                                    i68 = iM25628 ^ i64;
                                                                    i67 = i63;
                                                                }
                                                                break;
                                                            case -1789371581:
                                                            case 286704362:
                                                                sArr8 = f3746;
                                                                i70 = 1;
                                                                i71 = 26;
                                                                if (C3432.f10845 >= 0) {
                                                                    iM25628 = (C0630.m2566("᩸ۢ") ^ i66) * (-111);
                                                                    i63 = ((iM25628 ^ i65) * (-2995)) ^ 1627692898;
                                                                    i64 = -1631667037;
                                                                } else {
                                                                    iM25628 = C0630.m2566("ۡۡ") ^ i65;
                                                                    i63 = ((iM25628 ^ i66) * (-10101)) ^ 137516106;
                                                                    i64 = -630890976;
                                                                }
                                                                i68 = iM25628 ^ i64;
                                                                i67 = i63;
                                                                break;
                                                            case -1695101089:
                                                            case 453097650:
                                                                arrayList10 = arrayList3;
                                                                if (i74 < C3432.m10481(arrayList10)) {
                                                                    iM25628 = (i66 - C0630.m2566("֨۟")) * (-73);
                                                                    i63 = ((iM25628 ^ i65) * 21497) ^ 1860665826;
                                                                    i64 = -570181132;
                                                                } else {
                                                                    iM25628 = C0630.m2566("᩶֨") ^ i66;
                                                                    i63 = ((iM25628 ^ i65) * 17709) ^ 1222381831;
                                                                    i64 = 743863583;
                                                                }
                                                                i68 = iM25628 ^ i64;
                                                                i67 = i63;
                                                                break;
                                                            case -1569999818:
                                                            case -1055000079:
                                                                if (i72 - (s7 * s8) < 0) {
                                                                    iM25628 = C0630.m2566("ܿۙ") ^ i65;
                                                                    i63 = ((iM25628 ^ i66) * 20175) ^ 1604810972;
                                                                    i64 = -1482354935;
                                                                } else {
                                                                    iM25628 = (C0630.m2566("ۤܳ") + i65) * (-9);
                                                                    i63 = ((iM25628 ^ i66) * (-11163)) ^ (-607542619);
                                                                    i64 = 2004273138;
                                                                }
                                                                i68 = iM25628 ^ i64;
                                                                i67 = i63;
                                                                break;
                                                            case -1406096444:
                                                            case -758815525:
                                                                sArr7 = f3746;
                                                                c2 = 0;
                                                                if (C7811.m20844() != 0) {
                                                                    iM25628 = C2105.m6981("ۘ۫") ^ i65;
                                                                    i63 = ((iM25628 ^ i66) * (-24937)) ^ 1239682585;
                                                                    i64 = -633966665;
                                                                } else {
                                                                    iM25628 = C0630.m2566("᩹᩷") ^ i66;
                                                                    i63 = ((iM25628 ^ i65) * (-13533)) ^ 1687730920;
                                                                    i64 = 1714868818;
                                                                }
                                                                i68 = iM25628 ^ i64;
                                                                i67 = i63;
                                                                break;
                                                            case -1167382609:
                                                            case 1015378442:
                                                                s7 = sArr7[c2];
                                                                s6 = 8765;
                                                                if (ViewOnClickListenerC1958.f6529 <= 0) {
                                                                    iM25628 = C2105.m6981("᩸ܰ") ^ i66;
                                                                    i63 = ((iM25628 ^ i65) * (-14765)) ^ (-1237049459);
                                                                    i64 = 136517408;
                                                                } else {
                                                                    iM25628 = (C2105.m6981("֡ۗ") ^ i65) * (-53);
                                                                    i63 = ((iM25628 ^ i66) * 9457) ^ (-1303661837);
                                                                    i64 = -307019704;
                                                                }
                                                                i68 = iM25628 ^ i64;
                                                                i67 = i63;
                                                                break;
                                                            case -1094174595:
                                                            case 1384592100:
                                                                i69 = 755;
                                                                iM25628 = (i66 - C2105.m6981("֡ۨ")) * (-27);
                                                                i63 = ((iM25628 ^ i65) * 185) ^ 762241609;
                                                                i64 = -1629259097;
                                                                i68 = iM25628 ^ i64;
                                                                i67 = i63;
                                                                break;
                                                            case -1071297313:
                                                            case 1751690648:
                                                                if (C0964.f3626 != 0) {
                                                                    iM25628 = (C0630.m2566("᩸ۢ") ^ i66) * (-111);
                                                                    i63 = ((iM25628 ^ i65) * (-2995)) ^ 1627692898;
                                                                    i64 = -1631667037;
                                                                } else {
                                                                    iM25628 = C2105.m6981("᩸ܰ") ^ i66;
                                                                    i63 = ((iM25628 ^ i65) * (-14765)) ^ (-1237049459);
                                                                    i64 = 136517408;
                                                                }
                                                                i68 = iM25628 ^ i64;
                                                                i67 = i63;
                                                                break;
                                                            case -944158702:
                                                            case -790464751:
                                                                if (C1294.m4369(strM25626, C4159.m12578(sArr9, 35, 14, i69))) {
                                                                    iM25628 = (C0630.m2566("ܰ֨") ^ i65) * 109;
                                                                    i63 = ((iM25628 ^ i66) * 2299) ^ 400518393;
                                                                    i64 = -1854613110;
                                                                } else {
                                                                    iM25628 = C0630.m2566("ۤۖ") ^ i66;
                                                                    i63 = ((iM25628 ^ i65) * 9499) ^ 306925031;
                                                                    i64 = -652874320;
                                                                }
                                                                i68 = iM25628 ^ i64;
                                                                i67 = i63;
                                                                break;
                                                            case -917242905:
                                                            case -342064526:
                                                                intent.putExtra(strM6573, c10130.m25428());
                                                                if (C0422.f1886 <= 0) {
                                                                    iM25628 = C2105.m6981("᩸ܰ") ^ i66;
                                                                    i63 = ((iM25628 ^ i65) * (-14765)) ^ (-1237049459);
                                                                    i64 = 136517408;
                                                                } else {
                                                                    iM25628 = (C0630.m2566("ۜ۟") + i65) * (-61);
                                                                    i63 = ((iM25628 ^ i66) * (-31921)) ^ (-361105736);
                                                                    i64 = 1856985856;
                                                                }
                                                                i68 = iM25628 ^ i64;
                                                                i67 = i63;
                                                                break;
                                                            case -889379957:
                                                            case 1994761131:
                                                                c16562 = c16561;
                                                                Main mainM49336 = C21923.m49336(c16562);
                                                                Class cls3 = cls2;
                                                                if (C4075.f12947 < 0) {
                                                                    intent = new Intent(mainM49336, (Class<?>) cls3);
                                                                    C1711.m5738(intent, 268435456);
                                                                    if (C4159.f13567) {
                                                                        iM25628 = C2105.m6981("ܿ᩸") ^ i66;
                                                                        i63 = ((iM25628 ^ i65) * 6637) ^ 1700032129;
                                                                        i64 = 1269225141;
                                                                        i68 = iM25628 ^ i64;
                                                                        i67 = i63;
                                                                        break;
                                                                    }
                                                                }
                                                                int iM256210 = (i65 - C0630.m2566("ܿܽ")) * (-47);
                                                                i68 = iM256210 ^ (-1767055983);
                                                                i67 = ((iM256210 ^ i66) * 31051) ^ (-449125790);
                                                                intent = null;
                                                                break;
                                                            case -824176055:
                                                            case -223573801:
                                                                i74++;
                                                                iM25628 = C2105.m6981("ۚܽ") ^ i65;
                                                                i63 = ((iM25628 ^ i66) * 1625) ^ (-94575025);
                                                                i64 = -299648634;
                                                                i68 = iM25628 ^ i64;
                                                                i67 = i63;
                                                                break;
                                                            case -367575464:
                                                            case 1385219038:
                                                                C0382.m1848();
                                                                if (C2520.f8000 < 0) {
                                                                    iM25628 = (C0630.m2566("᩸ۢ") ^ i66) * (-111);
                                                                    i63 = ((iM25628 ^ i65) * (-2995)) ^ 1627692898;
                                                                    i64 = -1631667037;
                                                                } else {
                                                                    iM25628 = C2105.m6981("ۘ۫") ^ i65;
                                                                    i63 = ((iM25628 ^ i66) * (-24937)) ^ 1239682585;
                                                                    i64 = -633966665;
                                                                }
                                                                i68 = iM25628 ^ i64;
                                                                i67 = i63;
                                                                break;
                                                            case -242573348:
                                                            case 1552239641:
                                                                c10130 = new C10130();
                                                                i74 = 0;
                                                                iM25628 = C2105.m6981("ۚܽ") ^ i65;
                                                                i63 = ((iM25628 ^ i66) * 1625) ^ (-94575025);
                                                                i64 = -299648634;
                                                                i68 = iM25628 ^ i64;
                                                                i67 = i63;
                                                                break;
                                                            case -215237746:
                                                            case -120405810:
                                                                C9340.m24035(interfaceC178813, 2000);
                                                                C4075.m12261(C21923.m49336(c16562), intent);
                                                                break;
                                                            case -38010035:
                                                            case 1444606993:
                                                                c10213 = (C10211) C3537.m10755(arrayList10, i74);
                                                                strM25626 = c10213.m25626();
                                                                sArr9 = f3746;
                                                                if (C1420.f5096 <= 0) {
                                                                    iM25628 = C2105.m6981("ۘ۫") ^ i65;
                                                                    i63 = ((iM25628 ^ i66) * (-24937)) ^ 1239682585;
                                                                    i64 = -633966665;
                                                                } else {
                                                                    iM25628 = C2105.m6981("ۛ᩷") ^ i65;
                                                                    i63 = ((iM25628 ^ i66) * 30123) ^ 1914226444;
                                                                    i64 = 849050745;
                                                                }
                                                                i68 = iM25628 ^ i64;
                                                                i67 = i63;
                                                                break;
                                                            case 382225048:
                                                            case 516735841:
                                                                i69 = 10680;
                                                                iM25628 = (i66 - C2105.m6981("֡ۨ")) * (-27);
                                                                i63 = ((iM25628 ^ i65) * 185) ^ 762241609;
                                                                i64 = -1629259097;
                                                                i68 = iM25628 ^ i64;
                                                                i67 = i63;
                                                                break;
                                                            case 789868083:
                                                            case 917827652:
                                                                C7106.m19120();
                                                                C11340.m28031();
                                                                iM25628 = (C0630.m2566("᩸ۢ") ^ i66) * (-111);
                                                                i63 = ((iM25628 ^ i65) * (-2995)) ^ 1627692898;
                                                                i64 = -1631667037;
                                                                i68 = iM25628 ^ i64;
                                                                i67 = i63;
                                                                break;
                                                            case 793204887:
                                                            case 1195528454:
                                                                intent.setAction(C3746.m11357(sArr8, i70, i71, i69));
                                                                if (RunnableC1937.f6483 >= 0) {
                                                                    iM25628 = (C0630.m2566("ܺۢ") + i66) * (-99);
                                                                    i63 = ((iM25628 ^ i65) * 16081) ^ 34084107;
                                                                    i64 = 2096381610;
                                                                } else {
                                                                    iM25628 = C0630.m2566("ۢ᩺") ^ i66;
                                                                    i63 = ((iM25628 ^ i65) * (-8801)) ^ (-1936393807);
                                                                    i64 = 1757467253;
                                                                }
                                                                i68 = iM25628 ^ i64;
                                                                i67 = i63;
                                                                break;
                                                            case 846254827:
                                                            case 1182931917:
                                                                strM6573 = AbstractC2021.m6573(f3746, 27, 8, i69);
                                                                if (C1294.m4372() <= 0) {
                                                                    iM25628 = (C0630.m2566("᩸ۢ") ^ i66) * (-111);
                                                                    i63 = ((iM25628 ^ i65) * (-2995)) ^ 1627692898;
                                                                    i64 = -1631667037;
                                                                } else {
                                                                    iM25628 = (C2105.m6981("ۢ۠") ^ i65) * (-115);
                                                                    i63 = ((iM25628 ^ i66) * (-6831)) ^ 1974808534;
                                                                    i64 = 170623079;
                                                                }
                                                                i68 = iM25628 ^ i64;
                                                                i67 = i63;
                                                                break;
                                                            case 851033167:
                                                            case 1503252946:
                                                                C2958.m9034();
                                                                break;
                                                            default:
                                                                int i75 = s7 + s6;
                                                                i72 = i75 * i75;
                                                                s8 = 35060;
                                                                if (RunnableC1937.f6483 >= 0) {
                                                                    iM25628 = C2105.m6981("᩸ܰ") ^ i66;
                                                                    i63 = ((iM25628 ^ i65) * (-14765)) ^ (-1237049459);
                                                                    i64 = 136517408;
                                                                } else {
                                                                    iM25628 = C0630.m2566("ᩴܽ") ^ i66;
                                                                    i63 = ((iM25628 ^ i65) * 28175) ^ (-21797073);
                                                                    i64 = -120037319;
                                                                }
                                                                i68 = iM25628 ^ i64;
                                                                i67 = i63;
                                                                break;
                                                        }
                                                        return;
                                                    }
                                                }
                                            });
                                        }
                                        arrayList2 = arrayList3;
                                        s3 = s4;
                                        i39 = length;
                                        int iM698112 = (i44 - C2105.m6981("ۜۢ")) * (-93);
                                        length = i39;
                                        s4 = s3;
                                        i46 = ((iM698112 ^ i45) * (-2675)) ^ (-1742263988);
                                        c10212 = null;
                                        ArrayList arrayList10 = arrayList2;
                                        i47 = iM698112 ^ (-372845233);
                                        arrayList3 = arrayList10;
                                        break;
                                    case 684945923:
                                    case 1392235738:
                                        length2--;
                                        iM25622 = C0630.m2566("۬᩺") ^ i44;
                                        i30 = ((iM25622 ^ i45) * (-20533)) ^ 2119120643;
                                        i31 = 282696472;
                                        int i517 = iM25622 ^ i31;
                                        arrayList3 = arrayList3;
                                        i47 = i517;
                                        i46 = i30;
                                        break;
                                    case 717251660:
                                    case 1467314935:
                                        i49 = 23424;
                                        iM69812 = (C2105.m6981("ۘۛ") ^ i44) * 17;
                                        i40 = ((iM69812 ^ i45) * 30657) ^ (-155285366);
                                        i41 = -209227240;
                                        int i518 = iM69812 ^ i41;
                                        length = length;
                                        i46 = i40;
                                        arrayList3 = arrayList3;
                                        i47 = i518;
                                        break;
                                    case 856470313:
                                    case 1997315072:
                                        arrayList3 = arrayList3;
                                        s2 = s4;
                                        i32 = length;
                                        sArr5 = f1686;
                                        if (C3537.f11231 >= 0) {
                                            int iM698113 = (C2105.m6981("ۖ֡") + i45) * 31;
                                            int i519 = ((iM698113 ^ i44) * 20047) ^ 2115044932;
                                            i35 = iM698113 ^ (-1061055932);
                                            length = i32;
                                            s4 = s2;
                                            i46 = i519;
                                            arrayList3 = arrayList3;
                                            c10212 = null;
                                        } else {
                                            iM25623 = C0630.m2566("ۨ᩺") ^ i44;
                                            i33 = ((iM25623 ^ i45) * (-19795)) ^ (-1959507541);
                                            i34 = 945597799;
                                            i35 = iM25623 ^ i34;
                                            length = i32;
                                            s4 = s2;
                                            i46 = i33;
                                            arrayList3 = arrayList3;
                                        }
                                        i47 = i35;
                                        viewOnClickListenerC0311 = this;
                                        break;
                                    case 1298491618:
                                    case 1514305985:
                                        arrayList3 = arrayList3;
                                        strM12252 = C4075.m12252(sArr4, i50, i51, i49);
                                        if (C21923.f70183 != 0) {
                                            iM25622 = (C2105.m6981("ᩴ᩵") + i45) * 39;
                                            i30 = ((iM25622 ^ i44) * (-2119)) ^ 1002520211;
                                            i31 = 2091114248;
                                        } else {
                                            iM25622 = C0630.m2566("֫᩺") ^ i44;
                                            i30 = ((iM25622 ^ i45) * (-17059)) ^ 1877796258;
                                            i31 = 2094739871;
                                        }
                                        int i5110 = iM25622 ^ i31;
                                        arrayList3 = arrayList3;
                                        i47 = i5110;
                                        i46 = i30;
                                        break;
                                    default:
                                        arrayList3 = arrayList3;
                                        i36 = length;
                                        s4 = sArr5[c];
                                        s5 = 1532;
                                        if (RunnableC1108.m3790()) {
                                            iM25624 = (i45 - C0630.m2566("ۖ۫")) * (-105);
                                            i37 = ((iM25624 ^ i44) * 4927) ^ (-895324932);
                                            i38 = 60782280;
                                        } else {
                                            iM25624 = (i45 - C2105.m6981("ۧᩳ")) * (-5);
                                            i37 = ((iM25624 ^ i44) * (-29765)) ^ 1217222402;
                                            i38 = -1495926270;
                                        }
                                        i35 = iM25624 ^ i38;
                                        length = i36;
                                        i46 = i37;
                                        arrayList3 = arrayList3;
                                        i47 = i35;
                                        viewOnClickListenerC0311 = this;
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    C4159.m12564(C4616.m13545(dialogInterfaceC0206M16343), new ViewOnClickListenerC8984(zArr, c20438));
                    break;
                case -861122177:
                case 2079788677:
                    i27 = i27;
                    c19258 = c19258;
                    interfaceC178811 = interfaceC178811;
                    main3 = main3;
                    listView3 = listView3;
                    sArr3 = sArr3;
                    str3 = str3;
                    view3 = view3;
                    iM6985 = iM6985;
                    s = f63246[466];
                    if (C4159.m12565() >= 0) {
                        iM2567 = (C2105.m6981("ܺ᩻") ^ i21) * (-77);
                        i10 = ((iM2567 ^ i20) * (-7623)) ^ (-2064482112);
                        i11 = -1752707084;
                    } else {
                        iM2567 = C0630.m2566("ۡ᩸") ^ i20;
                        i10 = ((iM2567 ^ i21) * (-31889)) ^ (-1067224172);
                        i11 = -1055334158;
                    }
                    i17 = iM2567 ^ i11;
                    sArr3 = sArr3;
                    iM6985 = iM6985;
                    view3 = view3;
                    i27 = i27;
                    i23 = i17;
                    i22 = i10;
                    str3 = str3;
                    listView3 = listView3;
                    main3 = main3;
                    interfaceC178811 = interfaceC178811;
                    c19258 = c19258;
                    break;
                case -817869909:
                case 1285472206:
                    C1916.m6308();
                    break;
                case -638366652:
                case 1063437450:
                    i27 = i27;
                    c19258 = c19258;
                    interfaceC178811 = interfaceC178811;
                    main3 = main3;
                    listView3 = listView3;
                    short s2 = s;
                    sArr3 = sArr3;
                    str3 = str3;
                    view3 = view3;
                    iM6985 = iM6985;
                    if (((s2 * s2) + 257827249) - (s2 * 32114) < 0) {
                        int iM25622 = C0630.m2566("ܶ᩶") ^ i20;
                        s = s2;
                        i22 = ((iM25622 ^ i21) * (-4449)) ^ 713815720;
                        sArr3 = sArr3;
                        iM6985 = iM6985;
                        view3 = view3;
                        i27 = i27;
                        i23 = iM25622 ^ (-1627023115);
                    } else {
                        s = s2;
                        iM2567 = C0630.m2566("ۜ۟") ^ i21;
                        i10 = ((iM2567 ^ i20) * (-32719)) ^ 1813824368;
                        i11 = 1433621894;
                        i17 = iM2567 ^ i11;
                        sArr3 = sArr3;
                        iM6985 = iM6985;
                        view3 = view3;
                        i27 = i27;
                        i23 = i17;
                        i22 = i10;
                    }
                    str3 = str3;
                    listView3 = listView3;
                    main3 = main3;
                    interfaceC178811 = interfaceC178811;
                    c19258 = c19258;
                    break;
                case -605758809:
                case -308932675:
                    i27 = i27;
                    c19258 = c19258;
                    interfaceC178811 = interfaceC178811;
                    main3 = main3;
                    listView3 = listView3;
                    sArr3 = sArr3;
                    str3 = str3;
                    view3 = view3;
                    iM6985 = iM6985;
                    String str5 = str2;
                    if (!C1294.m4369(interfaceC178811.getParent(), str5)) {
                        str2 = str5;
                        str3 = str3;
                        interfaceC178811 = interfaceC178811;
                        int iM256110 = C0630.m2566("ܶۤ") ^ i21;
                        sArr3 = sArr3;
                        iM6985 = iM6985;
                        view3 = view3;
                        i27 = i27;
                        i23 = iM256110 ^ (-1558780401);
                        i22 = ((iM256110 ^ i20) * 7107) ^ (-489025746);
                        listView3 = listView3;
                        c19258 = c19258;
                        main3 = main3;
                    } else {
                        iM2567 = (C2105.m6981("ۗ᩶") ^ i20) * 109;
                        str2 = str5;
                        i10 = ((iM2567 ^ i21) * (-27809)) ^ 842642995;
                        i11 = 1341913706;
                        i17 = iM2567 ^ i11;
                        sArr3 = sArr3;
                        iM6985 = iM6985;
                        view3 = view3;
                        i27 = i27;
                        i23 = i17;
                        i22 = i10;
                        str3 = str3;
                        listView3 = listView3;
                        main3 = main3;
                        interfaceC178811 = interfaceC178811;
                        c19258 = c19258;
                    }
                    break;
                case -584706753:
                case 1827935846:
                    RunnableC0588.m2440(C3537.m10748(f63246, 467, 5, i26));
                    break;
                case -379681099:
                case 1892902990:
                    i27 = i27;
                    c19258 = c19258;
                    interfaceC178810 = interfaceC178811;
                    main3 = main3;
                    listView3 = listView3;
                    sArr3 = sArr3;
                    view3 = view3;
                    iM6985 = iM6985;
                    if (i25 < C0382.m1847(arrayList)) {
                        iM6981 = (C0630.m2566("ۜۜ") + i21) * 39;
                        i = ((iM6981 ^ i20) * 14937) ^ (-1829405760);
                        i2 = 1555267036;
                    } else {
                        iM6981 = C0630.m2566("ۤ᩻") ^ i20;
                        i = ((iM6981 ^ i21) * 19687) ^ 48801840;
                        i2 = 1487008264;
                    }
                    i3 = iM6981 ^ i2;
                    interfaceC178811 = interfaceC178810;
                    sArr3 = sArr3;
                    iM6985 = iM6985;
                    view3 = view3;
                    c19258 = c19258;
                    listView3 = listView3;
                    main3 = main3;
                    i9 = i27;
                    i23 = i3;
                    i22 = i;
                    i27 = i9;
                    break;
                case -216788543:
                case 2031639723:
                    C1773.m5908();
                    if (C3245.m9925() == 0) {
                        i4 = i27;
                        view = view3;
                        sArr = sArr3;
                        i5 = iM6985;
                        iM2566 = (C2105.m6981("ۜۧ") + i20) * (-59);
                        i6 = ((iM2566 ^ i21) * 9173) ^ 860536296;
                        i7 = -207679166;
                        sArr3 = sArr;
                        i9 = i4;
                        i23 = iM2566 ^ i7;
                        i22 = i6;
                        iM6985 = i5;
                        view3 = view;
                        i27 = i9;
                    }
                    i27 = i27;
                    iM6982 = (C0630.m2566("ۖܺ") + i21) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i = ((iM6982 ^ i20) * 20481) ^ 285335824;
                    i8 = 492796346;
                    i3 = iM6982 ^ i8;
                    i9 = i27;
                    i23 = i3;
                    i22 = i;
                    i27 = i9;
                    break;
                case 66821975:
                case 1964025704:
                    i27 = i27;
                    c19258 = c19258;
                    main3 = main3;
                    listView3 = listView3;
                    sArr3 = sArr3;
                    view3 = view3;
                    iM6985 = iM6985;
                    C7106.m19117(arrayList, new C10211(interfaceC178811));
                    int iM256111 = C0630.m2566("ܶۤ") ^ i21;
                    sArr3 = sArr3;
                    iM6985 = iM6985;
                    view3 = view3;
                    i27 = i27;
                    i23 = iM256111 ^ (-1558780401);
                    i22 = ((iM256111 ^ i20) * 7107) ^ (-489025746);
                    listView3 = listView3;
                    c19258 = c19258;
                    main3 = main3;
                    break;
                case 106513570:
                case 1320651153:
                    i27 = i27;
                    c19258 = c19258;
                    interfaceC178811 = interfaceC178811;
                    main3 = main3;
                    listView3 = listView3;
                    sArr3 = sArr3;
                    str3 = str3;
                    view3 = view3;
                    iM6985 = iM6985;
                    if (C0483.m2123(itM3596)) {
                        iM2567 = (C2105.m6981("۠֫") + i20) * 77;
                        i10 = ((iM2567 ^ i21) * (-7391)) ^ 1064193187;
                        i11 = -495031585;
                    } else {
                        iM2567 = C0630.m2566("֫ۢ") ^ i20;
                        i10 = ((iM2567 ^ i21) * 1477) ^ (-1929852824);
                        i11 = -1754667251;
                    }
                    i17 = iM2567 ^ i11;
                    sArr3 = sArr3;
                    iM6985 = iM6985;
                    view3 = view3;
                    i27 = i27;
                    i23 = i17;
                    i22 = i10;
                    str3 = str3;
                    listView3 = listView3;
                    main3 = main3;
                    interfaceC178811 = interfaceC178811;
                    c19258 = c19258;
                    break;
                case 500532388:
                case 1078608158:
                    int i30 = i27;
                    View view11 = view3;
                    listView = listView3;
                    sArr2 = sArr3;
                    int i31 = iM6985;
                    Main mainM49336 = C21923.m49336(c16560);
                    view2 = view11;
                    int iM69812 = C2105.m6981(C0382.m1840(f63246, 490, 3, i26));
                    if (C11340.f33930 >= 0) {
                        iM6985 = i31;
                        i27 = i30;
                        i18 = iM69812;
                        main = mainM49336;
                        int iM69813 = (C2105.m6981("ۚ۠") ^ i20) * (-55);
                        Main main9 = main;
                        i22 = ((iM69813 ^ i21) * (-10281)) ^ (-847901806);
                        sArr3 = sArr2;
                        View view12 = view2;
                        listView3 = listView;
                        main3 = main9;
                        i23 = iM69813 ^ (-2036668366);
                        view3 = view12;
                    } else {
                        int iM69814 = (i21 - C2105.m6981("ܽ֨")) * (-119);
                        sArr3 = sArr2;
                        i18 = iM69812;
                        i22 = ((iM69814 ^ i20) * (-689)) ^ (-1616293785);
                        iM6985 = i31;
                        view3 = view2;
                        listView3 = listView;
                        main3 = mainM49336;
                        i23 = iM69814 ^ 634757277;
                        i27 = i30;
                    }
                    break;
                case 603496589:
                case 754915654:
                    C2126.m7040();
                    if (C0237.f1507 != 0) {
                        i12 = i27;
                        viewM10739 = view3;
                        listView2 = listView3;
                        i13 = iM6985;
                        main2 = main3;
                        int iM256112 = (C0630.m2566("᩺۠") ^ i21) * (-113);
                        ListView listView8 = listView2;
                        i22 = ((iM256112 ^ i20) * 24747) ^ (-1213640604);
                        i15 = iM256112 ^ 2137045215;
                        listView3 = listView8;
                        main3 = main2;
                        iM6985 = i13;
                        view3 = viewM10739;
                        i27 = i12;
                        i23 = i15;
                    } else {
                        i27 = i27;
                        iM6982 = (C0630.m2566("ۖܺ") + i21) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM6982 ^ i20) * 20481) ^ 285335824;
                        i8 = 492796346;
                        i3 = iM6982 ^ i8;
                        i9 = i27;
                        i23 = i3;
                        i22 = i;
                        i27 = i9;
                    }
                    break;
                case 714352354:
                case 937995847:
                    if (C1294.m4369(c10211.m25626(), str3)) {
                        iM2568 = (i20 - C0630.m2566("ۘۖ")) * (-25);
                        i14 = ((iM2568 ^ i21) * 23741) ^ 195864905;
                        i16 = 683492349;
                    } else {
                        iM2568 = C2105.m6981("۟ۛ") ^ i21;
                        i14 = ((iM2568 ^ i20) * (-27777)) ^ 1524153549;
                        i16 = 1709218054;
                    }
                    i23 = iM2568 ^ i16;
                    i22 = i14;
                    break;
                case 1280869422:
                case 1707998929:
                    C2272.m7503();
                    if (C2958.f9394 < 0) {
                        i27 = i27;
                        c19258 = c19258;
                        interfaceC178811 = interfaceC178811;
                        main3 = main3;
                        listView3 = listView3;
                        sArr3 = sArr3;
                        str3 = str3;
                        view3 = view3;
                        iM6985 = iM6985;
                        iM2567 = (C2105.m6981("ܺ᩻") ^ i21) * (-77);
                        i10 = ((iM2567 ^ i20) * (-7623)) ^ (-2064482112);
                        i11 = -1752707084;
                        i17 = iM2567 ^ i11;
                        sArr3 = sArr3;
                        iM6985 = iM6985;
                        view3 = view3;
                        i27 = i27;
                        i23 = i17;
                        i22 = i10;
                        str3 = str3;
                        listView3 = listView3;
                        main3 = main3;
                        interfaceC178811 = interfaceC178811;
                        c19258 = c19258;
                    } else {
                        iM2568 = (C0630.m2566("ۧ᩷") ^ i21) * 81;
                        i14 = ((iM2568 ^ i20) * 6025) ^ 495768419;
                        i16 = -1023188927;
                        i23 = iM2568 ^ i16;
                        i22 = i14;
                    }
                    break;
                case 1686736101:
                case 1863190988:
                    c10211 = (C10211) C3537.m10755(arrayList, i25);
                    String strM25626 = c10211.m25626();
                    strArr2[i25] = strM25626;
                    i24 = 100;
                    if (C1711.m5741(strM25626) > 100) {
                        iM2568 = C2105.m6981("᩶ۜ") ^ i20;
                        i14 = ((iM2568 ^ i21) * 4797) ^ (-1808857755);
                        i16 = -1929497399;
                    } else {
                        iM2568 = C2105.m6981("᩷᩷") ^ i20;
                        i14 = ((iM2568 ^ i21) * 14291) ^ (-343209562);
                        i16 = 846998275;
                    }
                    i23 = iM2568 ^ i16;
                    i22 = i14;
                    break;
                default:
                    C5695.m16023();
                    C0630.m2564();
                    i27 = i27;
                    iM6982 = (C0630.m2566("ۖܺ") + i21) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i = ((iM6982 ^ i20) * 20481) ^ 285335824;
                    i8 = 492796346;
                    i3 = iM6982 ^ i8;
                    i9 = i27;
                    i23 = i3;
                    i22 = i;
                    i27 = i9;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:119:0x03ff A[PHI: r16 r22 r23
      0x03ff: PHI (r16v4 int) = (r16v2 int), (r16v3 int), (r16v2 int) binds: [B:118:0x03fd, B:110:0x03ad, B:18:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x03ff: PHI (r22v29 short) = (r22v8 short), (r22v9 short), (r22v30 short) binds: [B:118:0x03fd, B:110:0x03ad, B:18:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x03ff: PHI (r23v5 char) = (r23v4 char), (r23v3 char), (r23v3 char) binds: [B:118:0x03fd, B:110:0x03ad, B:18:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:131:0x047b A[PHI: r17 r18 r22
      0x047b: PHI (r17v4 short) = (r17v2 short), (r17v2 short), (r17v2 short), (r17v3 short), (r17v2 short) binds: [B:11:0x007a, B:130:0x0479, B:122:0x0437, B:106:0x0389, B:79:0x023f] A[DONT_GENERATE, DONT_INLINE]
      0x047b: PHI (r18v4 short[]) = (r18v2 short[]), (r18v2 short[]), (r18v3 short[]), (r18v2 short[]), (r18v2 short[]) binds: [B:11:0x007a, B:130:0x0479, B:122:0x0437, B:106:0x0389, B:79:0x023f] A[DONT_GENERATE, DONT_INLINE]
      0x047b: PHI (r22v19 short) = (r22v4 short), (r22v5 short), (r22v7 short), (r22v10 short), (r22v20 short) binds: [B:11:0x007a, B:130:0x0479, B:122:0x0437, B:106:0x0389, B:79:0x023f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:65:0x01e5 A[PHI: r22
      0x01e5: PHI (r22v42 short) = (r22v41 short), (r22v43 short) binds: [B:63:0x01cf, B:53:0x017f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m45011(C16560 c16560, AbstractC15440 abstractC15440) throws Throwable {
        int iM2566;
        int i;
        int i2;
        int iM2567;
        int i3;
        int i4;
        int i5;
        int iM2568;
        int i6;
        C16560 c16561 = c16560;
        int i7 = C4263.f13799;
        int i8 = C2958.f9394;
        int iM2569 = C0630.m2566("۟ۙ") ^ i7;
        int i9 = ((iM2569 ^ i8) * (-19039)) ^ (-1552758248);
        C11971 c11971M24094 = null;
        Throwable th = null;
        AbstractC16891 abstractC16891 = null;
        C5168 c5168 = null;
        short[] sArr = null;
        int i10 = iM2569 ^ 747881376;
        int size = 0;
        int i11 = 0;
        boolean z = false;
        boolean zM4369 = false;
        int i12 = 0;
        short s = 0;
        short s2 = 0;
        int i13 = 0;
        short s3 = 0;
        int i14 = 1609162230;
        char c = 0;
        C9340 c9340M39016 = null;
        String strM9025 = null;
        while (true) {
            i14 = i10 ^ (i9 & (((i14 ^ i8) * 4187) >> 31));
            switch (i14) {
                case -2088393713:
                case 615151375:
                    s2 = s2;
                    int i15 = s + s2;
                    i13 = i15 * i15;
                    if (C3683.f11629 >= 0) {
                        iM2567 = (i8 - C2105.m6981("ۗܿ")) * (-31);
                        i3 = ((iM2567 ^ i7) * 30641) ^ 689256871;
                        i4 = 1626798007;
                    } else {
                        iM2567 = (i7 - C0630.m2566("ܺܳ")) * (-7);
                        i3 = ((iM2567 ^ i8) * (-10559)) ^ (-655392095);
                        i4 = 1760512877;
                    }
                    short s4 = s2;
                    i10 = iM2567 ^ i4;
                    i9 = i3;
                    s2 = s4;
                    break;
                case -1981634764:
                case 50682762:
                    s = sArr[c];
                    if (C1504.m5179()) {
                        int iM6981 = C2105.m6981("ۛܳ") ^ i7;
                        i10 = iM6981 ^ (-1210493281);
                        i9 = ((iM6981 ^ i8) * 1507) ^ (-1366658507);
                        s2 = 10770;
                    } else {
                        s2 = 10770;
                        int iM25610 = C0630.m2566("֫ܿ") ^ i7;
                        i5 = ((iM25610 ^ i8) * (-1699)) ^ (-942734998);
                        i10 = iM25610 ^ 2102990368;
                        i9 = i5;
                        c16561 = c16560;
                    }
                    break;
                case -1755553105:
                case 1914849102:
                    if (RunnableC0588.f2309 < 0) {
                        iM2566 = (C2105.m6981("ۚ᩺") + i7) * (-75);
                        i = ((iM2566 ^ i8) * 30341) ^ 1345213361;
                        i2 = 819587754;
                    } else {
                        iM2566 = (i8 - C2105.m6981("ۖ᩻")) * (-85);
                        i = ((iM2566 ^ i7) * (-12717)) ^ (-824341941);
                        i2 = 626875023;
                    }
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case -1738531070:
                case -517416696:
                    if (RunnableC0588.m2441() < 0) {
                        s2 = s2;
                        iM2567 = (i8 - C2105.m6981("ۗܿ")) * (-31);
                        i3 = ((iM2567 ^ i7) * 30641) ^ 689256871;
                        i4 = 1626798007;
                        short s5 = s2;
                        i10 = iM2567 ^ i4;
                        i9 = i3;
                        s2 = s5;
                    } else {
                        iM2566 = C0630.m2566("ܿ֡") ^ i7;
                        i = ((iM2566 ^ i8) * (-9493)) ^ (-1123235688);
                        i2 = 647510107;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                    }
                    break;
                case -1667085670:
                case 1429723938:
                    s2 = s2;
                    c = 384;
                    if (RunnableC3474.m10630()) {
                        iM2567 = (C2105.m6981("ܺ۬") ^ i8) * (-91);
                        i3 = ((iM2567 ^ i7) * 11375) ^ (-1005212543);
                        i4 = 1429614381;
                    } else {
                        iM2567 = (i8 - C2105.m6981("ۗܿ")) * (-31);
                        i3 = ((iM2567 ^ i7) * 30641) ^ 689256871;
                        i4 = 1626798007;
                    }
                    short s6 = s2;
                    i10 = iM2567 ^ i4;
                    i9 = i3;
                    s2 = s6;
                    break;
                case -1644743721:
                case -696452133:
                    s2 = s2;
                    if (i13 - (s * s3) < 0) {
                        iM2567 = (C0630.m2566("֡۫") + i8) * 99;
                        i3 = ((iM2567 ^ i7) * 6033) ^ (-371381938);
                        i4 = -1240623824;
                    } else {
                        iM2567 = (i7 - C2105.m6981("ۢۧ")) * 9;
                        i3 = ((iM2567 ^ i8) * 17205) ^ (-573936236);
                        i4 = -2140147018;
                    }
                    short s7 = s2;
                    i10 = iM2567 ^ i4;
                    i9 = i3;
                    s2 = s7;
                    break;
                case -1604322521:
                case 617694414:
                    s2 = s2;
                    c11971M24094 = c9340M39016.m24094();
                    c11971M24094.m29245();
                    iM2567 = (i7 - C0630.m2566("ۡܶ")) * 21;
                    i3 = ((iM2567 ^ i8) * (-26953)) ^ (-232683808);
                    i4 = -1739121830;
                    short s8 = s2;
                    i10 = iM2567 ^ i4;
                    i9 = i3;
                    s2 = s8;
                    break;
                case -1517076707:
                case -752201227:
                    s2 = s2;
                    try {
                        size = c11971M24094.size();
                        iM2567 = (i8 - C0630.m2566("۫ᩳ")) * 65;
                        i3 = ((iM2567 ^ i7) * (-21291)) ^ 2145484718;
                        i4 = 66104610;
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        iM2567 = (i8 - C0630.m2566("ܶܶ")) * (-111);
                        i3 = ((iM2567 ^ i7) * (-21377)) ^ 1513799763;
                        i4 = 1239355635;
                    }
                    short s9 = s2;
                    i10 = iM2567 ^ i4;
                    i9 = i3;
                    s2 = s9;
                    break;
                case -1512031355:
                case 1465532749:
                    i12 = 7207;
                    iM2567 = C2105.m6981("ۧܰ") ^ i7;
                    i3 = ((iM2567 ^ i8) * (-15369)) ^ 312906015;
                    i4 = -1986912297;
                    short s10 = s2;
                    i10 = iM2567 ^ i4;
                    i9 = i3;
                    s2 = s10;
                    break;
                case -1447109812:
                case 272626309:
                    RunnableC1937.m6376(c11971M24094);
                    return;
                case -1385740221:
                case 1235331455:
                    s2 = s2;
                    if (z) {
                        iM2568 = C0630.m2566("ۤۧ") ^ i7;
                        i = ((iM2568 ^ i8) * 32275) ^ 1971607890;
                        i6 = 1313190728;
                    } else {
                        iM2568 = C2105.m6981("ܺۚ") ^ i8;
                        i = ((iM2568 ^ i7) * (-32021)) ^ (-1494513712);
                        i6 = -981169460;
                    }
                    int i16 = iM2568 ^ i6;
                    s2 = s2;
                    i10 = i16;
                    i9 = i;
                    break;
                case -1242718992:
                case 1047328845:
                    i11 = 0;
                    iM2567 = C2105.m6981("᩻ۗ") ^ i7;
                    i3 = ((iM2567 ^ i8) * (-4681)) ^ (-468596042);
                    i4 = 598627904;
                    short s11 = s2;
                    i10 = iM2567 ^ i4;
                    i9 = i3;
                    s2 = s11;
                    break;
                case -1110512682:
                case 818761331:
                    s2 = s2;
                    strM9025 = C2958.m9025(abstractC15440);
                    c9340M39016 = c16560.m39016();
                    if (C2167.f7158 >= 0) {
                        iM2567 = C0630.m2566("᩺᩹") ^ i8;
                        i3 = ((iM2567 ^ i7) * (-20715)) ^ 5600522;
                        i4 = -962815298;
                    } else {
                        iM2567 = (i8 - C2105.m6981("᩸᩺")) * 63;
                        i3 = ((iM2567 ^ i7) * 9193) ^ (-1208881198);
                        i4 = -224615796;
                    }
                    short s12 = s2;
                    i10 = iM2567 ^ i4;
                    i9 = i3;
                    s2 = s12;
                    break;
                case -1092498967:
                case 1363503336:
                    if (C0422.f1886 <= 0) {
                        iM2566 = (C2105.m6981("ۚ᩺") + i7) * (-75);
                        i = ((iM2566 ^ i8) * 30341) ^ 1345213361;
                        i2 = 819587754;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                    } else {
                        s2 = s2;
                        iM2567 = (i8 - C2105.m6981("ۗܿ")) * (-31);
                        i3 = ((iM2567 ^ i7) * 30641) ^ 689256871;
                        i4 = 1626798007;
                        short s13 = s2;
                        i10 = iM2567 ^ i4;
                        i9 = i3;
                        s2 = s13;
                    }
                    break;
                case -641563446:
                case 143757806:
                    if (C3537.m10746() > 0) {
                        s2 = s2;
                        iM2567 = C0630.m2566("᩺᩹") ^ i8;
                        i3 = ((iM2567 ^ i7) * (-20715)) ^ 5600522;
                        i4 = -962815298;
                        short s14 = s2;
                        i10 = iM2567 ^ i4;
                        i9 = i3;
                        s2 = s14;
                    }
                    s2 = s2;
                    iM2567 = (i8 - C2105.m6981("ۗܿ")) * (-31);
                    i3 = ((iM2567 ^ i7) * 30641) ^ 689256871;
                    i4 = 1626798007;
                    short s15 = s2;
                    i10 = iM2567 ^ i4;
                    i9 = i3;
                    s2 = s15;
                    break;
                case -623105189:
                case -110200550:
                    s2 = s2;
                    s3 = 43080;
                    if (C4075.f12947 >= 0) {
                        iM2567 = (C2105.m6981("֫ܶ") + i8) * (-7);
                        i3 = ((iM2567 ^ i7) * 10961) ^ 663057180;
                        i4 = 386321200;
                    } else {
                        iM2567 = C2105.m6981("ۙ᩹") ^ i8;
                        i3 = ((iM2567 ^ i7) * 12881) ^ (-1860048093);
                        i4 = 593416076;
                    }
                    short s16 = s2;
                    i10 = iM2567 ^ i4;
                    i9 = i3;
                    s2 = s16;
                    break;
                case -418981816:
                case 952560408:
                    s2 = s2;
                    sArr = f63246;
                    if (C4616.f14690 <= 0) {
                        iM2567 = (C2105.m6981("֫ܶ") + i8) * (-7);
                        i3 = ((iM2567 ^ i7) * 10961) ^ 663057180;
                        i4 = 386321200;
                    } else {
                        iM2567 = C2105.m6981("ۜ֨") ^ i7;
                        i3 = ((iM2567 ^ i8) * 9735) ^ (-851925475);
                        i4 = -1459701250;
                    }
                    short s17 = s2;
                    i10 = iM2567 ^ i4;
                    i9 = i3;
                    s2 = s17;
                    break;
                case -72259912:
                case 148553588:
                    s2 = s2;
                    if (C1420.f5096 > 0) {
                        iM2567 = (C0630.m2566("᩶᩹") ^ i8) * (-101);
                        i3 = ((iM2567 ^ i7) * 12795) ^ (-879216788);
                        i4 = -1362713964;
                        short s18 = s2;
                        i10 = iM2567 ^ i4;
                        i9 = i3;
                        s2 = s18;
                    } else {
                        s2 = s2;
                        int iM25611 = C0630.m2566("֫ܿ") ^ i7;
                        i5 = ((iM25611 ^ i8) * (-1699)) ^ (-942734998);
                        i10 = iM25611 ^ 2102990368;
                        i9 = i5;
                        c16561 = c16560;
                    }
                    break;
                case -6793932:
                case 780012534:
                    C1047.m3591(c11971M24094);
                    throw th;
                case 20720591:
                case 416231762:
                    s2 = s2;
                    if (C2958.m9034() <= 0) {
                        s2 = s2;
                        int iM25612 = C0630.m2566("֫ܿ") ^ i7;
                        i5 = ((iM25612 ^ i8) * (-1699)) ^ (-942734998);
                        i10 = iM25612 ^ 2102990368;
                    } else {
                        int iM6982 = (C2105.m6981("ۡۛ") ^ i8) * 3;
                        i5 = ((iM6982 ^ i7) * (-19251)) ^ 1211131445;
                        s2 = s2;
                        i10 = iM6982 ^ (-652357928);
                    }
                    i9 = i5;
                    c16561 = c16560;
                    break;
                case 108391774:
                case 816232123:
                    i11++;
                    iM2567 = C2105.m6981("᩻ۗ") ^ i7;
                    i3 = ((iM2567 ^ i8) * (-4681)) ^ (-468596042);
                    i4 = 598627904;
                    short s19 = s2;
                    i10 = iM2567 ^ i4;
                    i9 = i3;
                    s2 = s19;
                    break;
                case 108780927:
                case 1517669321:
                    s2 = s2;
                    if (C7106.m19120() <= 0) {
                        iM2567 = (C2105.m6981("֫ܶ") + i8) * (-7);
                        i3 = ((iM2567 ^ i7) * 10961) ^ 663057180;
                        i4 = 386321200;
                    } else {
                        iM2567 = C0630.m2566("ᩳ᩸") ^ i7;
                        i3 = ((iM2567 ^ i8) * (-29631)) ^ (-712133226);
                        i4 = 1015404601;
                    }
                    short s110 = s2;
                    i10 = iM2567 ^ i4;
                    i9 = i3;
                    s2 = s110;
                    break;
                case 210597224:
                case 806675160:
                    C0382.m1848();
                    C2126.m7040();
                    iM2566 = C0630.m2566("ܿ֡") ^ i7;
                    i = ((iM2566 ^ i8) * (-9493)) ^ (-1123235688);
                    i2 = 647510107;
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case 314898225:
                case 1219665558:
                    C0964.m3413();
                    C1128.m3851();
                    return;
                case 389507795:
                case 1624778605:
                    if (C1047.f3863 < 0) {
                        iM2566 = C0630.m2566("ܿ֡") ^ i7;
                        i = ((iM2566 ^ i8) * (-9493)) ^ (-1123235688);
                        i2 = 647510107;
                    } else {
                        iM2566 = C0630.m2566("ۛ֨") ^ i8;
                        i = ((iM2566 ^ i7) * 13167) ^ (-494782033);
                        i2 = 1652449813;
                    }
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case 576845624:
                case 2017300259:
                    s2 = s2;
                    AbstractC16891 abstractC16892 = (AbstractC16891) c11971M24094.get(i11);
                    try {
                        z = abstractC16892 instanceof C5168;
                        int iM6983 = (i7 - C2105.m6981("ۚ۟")) * (-73);
                        s2 = s2;
                        i10 = iM6983 ^ 1482122042;
                        i9 = ((iM6983 ^ i8) * (-6097)) ^ (-979531854);
                        abstractC16891 = abstractC16892;
                    } catch (Throwable th3) {
                        th = th3;
                        abstractC16891 = abstractC16892;
                        iM2567 = (i8 - C0630.m2566("ܶܶ")) * (-111);
                        i3 = ((iM2567 ^ i7) * (-21377)) ^ 1513799763;
                        i4 = 1239355635;
                        short s111 = s2;
                        i10 = iM2567 ^ i4;
                        i9 = i3;
                        s2 = s111;
                    }
                    break;
                case 625183900:
                case 868028182:
                    C3746.m11369();
                    if (C0714.f2697 >= 0) {
                        iM2566 = C0630.m2566("֡᩹") ^ i7;
                        i = ((iM2566 ^ i8) * 29003) ^ 533395827;
                        i2 = 594250499;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                    } else {
                        s2 = s2;
                        iM2567 = (i8 - C2105.m6981("ۗܿ")) * (-31);
                        i3 = ((iM2567 ^ i7) * 30641) ^ 689256871;
                        i4 = 1626798007;
                        short s112 = s2;
                        i10 = iM2567 ^ i4;
                        i9 = i3;
                        s2 = s112;
                    }
                    break;
                case 731201419:
                case 1878078280:
                    try {
                        s2 = s2;
                        try {
                            c5168.mo35230(C0382.m1840(f63246, 385, 1, i12));
                            c16560.m39016().m24060(c16561, i11, true);
                            iM2568 = C0630.m2566("ܶ᩶") ^ i8;
                            i = ((iM2568 ^ i7) * (-10735)) ^ (-1841011098);
                            i6 = -451030510;
                            int i17 = iM2568 ^ i6;
                            s2 = s2;
                            i10 = i17;
                            i9 = i;
                        } catch (Throwable th4) {
                            th = th4;
                            th = th;
                            iM2567 = (i8 - C0630.m2566("ܶܶ")) * (-111);
                            i3 = ((iM2567 ^ i7) * (-21377)) ^ 1513799763;
                            i4 = 1239355635;
                            short s113 = s2;
                            i10 = iM2567 ^ i4;
                            i9 = i3;
                            s2 = s113;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        s2 = s2;
                    }
                    break;
                case 881396657:
                case 1992354383:
                    s2 = s2;
                    RunnableC1937.m6376(c11971M24094);
                    if (C3432.f10845 < 0) {
                        C4263.m12821(new C23800(abstractC15440, c16561, strM9025));
                        return;
                    }
                    iM2567 = (C2105.m6981("֫ܶ") + i8) * (-7);
                    i3 = ((iM2567 ^ i7) * 10961) ^ 663057180;
                    i4 = 386321200;
                    short s114 = s2;
                    i10 = iM2567 ^ i4;
                    i9 = i3;
                    s2 = s114;
                    break;
                    break;
                case 1225099772:
                case 1479579561:
                    if (C2105.f7037 == 0) {
                        s2 = s2;
                        iM2567 = (C2105.m6981("֫ܶ") + i8) * (-7);
                        i3 = ((iM2567 ^ i7) * 10961) ^ 663057180;
                        i4 = 386321200;
                        short s115 = s2;
                        i10 = iM2567 ^ i4;
                        i9 = i3;
                        s2 = s115;
                    } else {
                        iM2566 = C2105.m6981("۫ܰ") ^ i7;
                        i = ((iM2566 ^ i8) * 7557) ^ 9826470;
                        i2 = 1020093795;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                    }
                    break;
                case 1261519908:
                case 1526844994:
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = (i8 - C2105.m6981("ۖ᩻")) * (-85);
                        i = ((iM2566 ^ i7) * (-12717)) ^ (-824341941);
                        i2 = 626875023;
                    } else {
                        iM2566 = C2105.m6981("۫ܰ") ^ i7;
                        i = ((iM2566 ^ i8) * 7557) ^ 9826470;
                        i2 = 1020093795;
                    }
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case 1330002282:
                case 1617216647:
                    s2 = s2;
                    if (zM4369) {
                        iM2568 = (C2105.m6981("ᩴܺ") ^ i7) * (-39);
                        i = ((iM2568 ^ i8) * 15277) ^ 1568225526;
                        i6 = 1786053238;
                    } else {
                        iM2568 = C2105.m6981("ܺۚ") ^ i8;
                        i = ((iM2568 ^ i7) * (-32021)) ^ (-1494513712);
                        i6 = -981169460;
                    }
                    int i18 = iM2568 ^ i6;
                    s2 = s2;
                    i10 = i18;
                    i9 = i;
                    break;
                case 1902681190:
                case 2060264787:
                    i12 = 59457;
                    iM2567 = C2105.m6981("ۧܰ") ^ i7;
                    i3 = ((iM2567 ^ i8) * (-15369)) ^ 312906015;
                    i4 = -1986912297;
                    short s116 = s2;
                    i10 = iM2567 ^ i4;
                    i9 = i3;
                    s2 = s116;
                    break;
                case 2013271749:
                case 2048476899:
                    s2 = s2;
                    C5168 c5169 = (C5168) abstractC16891;
                    try {
                        zM4369 = C1294.m4369(strM9025, c5169.m14826());
                        int iM25613 = C0630.m2566("ᩳ۠") ^ i8;
                        s2 = s2;
                        i10 = iM25613 ^ (-1167599312);
                        i9 = ((iM25613 ^ i7) * 32237) ^ (-1544366745);
                        c5168 = c5169;
                    } catch (Throwable th6) {
                        th = th6;
                        c5168 = c5169;
                        iM2567 = (i8 - C0630.m2566("ܶܶ")) * (-111);
                        i3 = ((iM2567 ^ i7) * (-21377)) ^ 1513799763;
                        i4 = 1239355635;
                        short s117 = s2;
                        i10 = iM2567 ^ i4;
                        i9 = i3;
                        s2 = s117;
                    }
                    break;
                default:
                    s2 = s2;
                    if (i11 < size) {
                        iM2567 = (i8 - C2105.m6981("ۖ᩺")) * 67;
                        i3 = ((iM2567 ^ i7) * (-32469)) ^ (-886975520);
                        i4 = 92350049;
                    } else {
                        iM2567 = C0630.m2566("۫᩷") ^ i7;
                        i3 = ((iM2567 ^ i8) * (-31081)) ^ 1375176203;
                        i4 = 14013045;
                    }
                    short s118 = s2;
                    i10 = iM2567 ^ i4;
                    i9 = i3;
                    s2 = s118;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0480 A[PHI: r9 r12 r16 r17 r18 r19 r20
      0x0480: PHI (r9v3 l.ܶ᩵ܿ) = (r9v1 l.ܶ᩵ܿ), (r9v1 l.ܶ᩵ܿ), (r9v1 l.ܶ᩵ܿ), (r9v1 l.ܶ᩵ܿ), (r9v7 l.ܶ᩵ܿ) binds: [B:110:0x047e, B:106:0x045f, B:102:0x0441, B:98:0x0410, B:60:0x0211] A[DONT_GENERATE, DONT_INLINE]
      0x0480: PHI (r12v60 int) = (r12v40 int), (r12v41 int), (r12v42 int), (r12v43 int), (r12v61 int) binds: [B:110:0x047e, B:106:0x045f, B:102:0x0441, B:98:0x0410, B:60:0x0211] A[DONT_GENERATE, DONT_INLINE]
      0x0480: PHI (r16v5 short[]) = (r16v2 short[]), (r16v2 short[]), (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:110:0x047e, B:106:0x045f, B:102:0x0441, B:98:0x0410, B:60:0x0211] A[DONT_GENERATE, DONT_INLINE]
      0x0480: PHI (r17v5 char) = (r17v2 char), (r17v2 char), (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:110:0x047e, B:106:0x045f, B:102:0x0441, B:98:0x0410, B:60:0x0211] A[DONT_GENERATE, DONT_INLINE]
      0x0480: PHI (r18v8 int) = (r18v2 int), (r18v2 int), (r18v2 int), (r18v3 int), (r18v2 int) binds: [B:110:0x047e, B:106:0x045f, B:102:0x0441, B:98:0x0410, B:60:0x0211] A[DONT_GENERATE, DONT_INLINE]
      0x0480: PHI (r19v5 int) = (r19v2 int), (r19v2 int), (r19v2 int), (r19v3 int), (r19v2 int) binds: [B:110:0x047e, B:106:0x045f, B:102:0x0441, B:98:0x0410, B:60:0x0211] A[DONT_GENERATE, DONT_INLINE]
      0x0480: PHI (r20v7 short[]) = (r20v2 short[]), (r20v2 short[]), (r20v2 short[]), (r20v2 short[]), (r20v9 short[]) binds: [B:110:0x047e, B:106:0x045f, B:102:0x0441, B:98:0x0410, B:60:0x0211] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45002(List list, int i, C16560 c16560, Main main, InterfaceC17889 interfaceC17889) {
        int iM2566;
        int i2;
        int i3;
        int iM6981;
        int i4;
        short[] sArr;
        int i5;
        int iM6982;
        int i6;
        int i7;
        int iM2567;
        int i8;
        int i9;
        int i10;
        Class cls;
        list = list;
        int i11 = i;
        c16560 = c16560;
        boolean z = false;
        int i12 = 0;
        Intent intent = null;
        Class cls2 = null;
        AbstractC15440 abstractC15440M25622 = null;
        String strM2128 = null;
        int i13 = 0;
        int i14 = 1411170120;
        int i15 = C3432.f10845;
        int i16 = C4616.f14690;
        int iM2568 = (C0630.m2566("ۚ֡") ^ i16) * 63;
        int i17 = ((iM2568 ^ i15) * 22165) ^ 574098682;
        int i18 = iM2568 ^ (-613103826);
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i19 = 0;
        char c = 0;
        int i20 = 0;
        int i21 = 0;
        Iterator itM6374 = null;
        int i22 = 0;
        short[] sArr4 = null;
        int i23 = 0;
        while (true) {
            i14 = i18 ^ (i17 & (((i14 ^ i15) * 7395) >> 31));
            switch (i14) {
                case -2135962280:
                case 1509391479:
                    cls = ActivityC8259.class;
                    cls2 = cls;
                    iM2567 = (i16 - C2105.m6981("ᩳۡ")) * (-49);
                    i8 = ((iM2567 ^ i15) * 23413) ^ (-293656433);
                    i9 = -1462290804;
                    i18 = iM2567 ^ i9;
                    list = list;
                    i17 = i8;
                    i22 = i22;
                    c16560 = c16560;
                    break;
                case -2119824998:
                case 924285448:
                    short[] sArr5 = sArr2;
                    i5 = i22;
                    intent.setAction(C3683.m11225(sArr5, i5, i19, i13));
                    abstractC15440M25622 = ((C10211) C21923.m49339(list, i12)).m25622();
                    if (RunnableC1937.f6483 < 0) {
                        int iM2569 = C0630.m2566("֡ܳ") ^ i16;
                        i18 = iM2569 ^ (-1672170384);
                        i17 = ((iM2569 ^ i15) * 29603) ^ 686796472;
                        sArr2 = sArr5;
                        i22 = i5;
                        list = list;
                        c16560 = c16560;
                    } else {
                        sArr2 = sArr5;
                        iM6982 = C2105.m6981("᩸ۗ") ^ i16;
                        i6 = ((iM6982 ^ i15) * 28791) ^ (-1417385331);
                        i7 = -1090434782;
                        i18 = iM6982 ^ i7;
                        i17 = i6;
                        i22 = i5;
                        i11 = i;
                    }
                    break;
                case -2055750671:
                case -1200659308:
                    i22 = i22;
                    if (C1773.m5910(itM6374)) {
                        iM2567 = C0630.m2566("ܿ֨") ^ i15;
                        i8 = ((iM2567 ^ i16) * 30265) ^ 2115114878;
                        i9 = 1571366716;
                    } else {
                        iM2567 = C2105.m6981("᩹ۙ") ^ i15;
                        i8 = ((iM2567 ^ i16) * (-22921)) ^ (-1536333619);
                        i9 = 1315346693;
                    }
                    i18 = iM2567 ^ i9;
                    list = list;
                    i17 = i8;
                    i22 = i22;
                    c16560 = c16560;
                    break;
                case -1890494484:
                case 103907635:
                    cls = ActivityC19887.class;
                    cls2 = cls;
                    iM2567 = (i16 - C2105.m6981("ᩳۡ")) * (-49);
                    i8 = ((iM2567 ^ i15) * 23413) ^ (-293656433);
                    i9 = -1462290804;
                    i18 = iM2567 ^ i9;
                    list = list;
                    i17 = i8;
                    i22 = i22;
                    c16560 = c16560;
                    break;
                case -1871876296:
                case -1623996060:
                    sArr2 = f63246;
                    i22 = Primes.SMALL_FACTOR_LIMIT;
                    i19 = 26;
                    if (C2105.f7037 == 0) {
                        int iM25610 = C0630.m2566("۠ۢ") ^ i16;
                        i10 = ((iM25610 ^ i15) * 32567) ^ 251008212;
                        i18 = iM25610 ^ (-1491268776);
                        list = list;
                        i17 = i10;
                        c16560 = c16560;
                    } else {
                        int iM6983 = C2105.m6981("ۘᩴ") ^ i15;
                        i18 = iM6983 ^ (-40931155);
                        i17 = ((iM6983 ^ i16) * 23353) ^ (-1853012286);
                        i11 = i;
                    }
                    break;
                case -1828896057:
                case -1380718490:
                    i5 = i22;
                    if (C1128.f4106 <= 0) {
                        iM6982 = C2105.m6981("᩸ۗ") ^ i16;
                        i6 = ((iM6982 ^ i15) * 28791) ^ (-1417385331);
                        i7 = -1090434782;
                    } else {
                        iM6982 = (i16 - C2105.m6981("ᩴۙ")) * 43;
                        i6 = ((iM6982 ^ i15) * 16871) ^ (-684757638);
                        i7 = 1122659933;
                    }
                    i18 = iM6982 ^ i7;
                    i17 = i6;
                    i22 = i5;
                    i11 = i;
                    break;
                case -1715884867:
                case 176255265:
                    if (RunnableC0588.f2309 < 0) {
                        iM2566 = C0630.m2566("ۜۘ") ^ i16;
                        i2 = ((iM2566 ^ i15) * 7065) ^ (-1578150828);
                        i3 = -1085610389;
                        i18 = iM2566 ^ i3;
                        i17 = i2;
                    } else {
                        int iM6984 = C2105.m6981("ۘᩴ") ^ i15;
                        i18 = iM6984 ^ (-40931155);
                        i17 = ((iM6984 ^ i16) * 23353) ^ (-1853012286);
                        i11 = i;
                    }
                    break;
                case -1712200745:
                case -86534665:
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        int iM6985 = C2105.m6981("ۘᩴ") ^ i15;
                        i18 = iM6985 ^ (-40931155);
                        i17 = ((iM6985 ^ i16) * 23353) ^ (-1853012286);
                        i11 = i;
                    } else {
                        int iM25611 = C0630.m2566("ۗ۠") ^ i15;
                        i10 = ((iM25611 ^ i16) * (-24407)) ^ 182644413;
                        i18 = iM25611 ^ (-1081024509);
                        i17 = i10;
                        c16560 = c16560;
                    }
                    break;
                case -1668149519:
                case 729351656:
                    if (i11 != 3) {
                        iM2566 = (i16 - C2105.m6981("۬ۡ")) * 127;
                        i2 = ((iM2566 ^ i15) * 30515) ^ (-1621018982);
                        i3 = -109828916;
                    } else {
                        iM2566 = C0630.m2566("ܶۤ") ^ i16;
                        i2 = ((iM2566 ^ i15) * (-13231)) ^ 1860611085;
                        i3 = 1505476873;
                    }
                    i18 = iM2566 ^ i3;
                    i17 = i2;
                    break;
                case -1490286692:
                case -83154592:
                    i13 = 52462;
                    iM2567 = (i16 - C0630.m2566("ܶۡ")) * (-105);
                    i8 = ((iM2567 ^ i15) * 14777) ^ (-1224834139);
                    i9 = 1683509263;
                    i18 = iM2567 ^ i9;
                    list = list;
                    i17 = i8;
                    i22 = i22;
                    c16560 = c16560;
                    break;
                case -1450323613:
                case -538852032:
                    intent.putExtra(strM2128, z);
                    m44999(intent, cls2, C4159.m12569(c16560));
                    C9340.m24035(interfaceC17889, 2000);
                    ServiceConnectionC3453.m10570(main, intent);
                    return;
                case -1382381332:
                case 1496430869:
                    strM2128 = C0483.m2128(sArr3, i23, 4, i13);
                    if (!RunnableC3474.m10630()) {
                        int iM25612 = C0630.m2566("ۗ۠") ^ i15;
                        i10 = ((iM25612 ^ i16) * (-24407)) ^ 182644413;
                        i18 = iM25612 ^ (-1081024509);
                        i17 = i10;
                        c16560 = c16560;
                    } else {
                        iM6981 = C0630.m2566("۟ۚ") ^ i16;
                        i2 = ((iM6981 ^ i15) * 21597) ^ 1207034020;
                        i4 = -111493029;
                        i18 = iM6981 ^ i4;
                        c16560 = c16560;
                        i17 = i2;
                    }
                    break;
                case -1329792092:
                case -810450695:
                    if (i11 == 4) {
                        iM2566 = (C2105.m6981("ۢ᩵") + i16) * 83;
                        i2 = ((iM2566 ^ i15) * 7549) ^ 1731852428;
                        i3 = -870716761;
                    } else {
                        iM2566 = C2105.m6981("ۤۙ") ^ i15;
                        i2 = ((iM2566 ^ i16) * 17421) ^ (-1224070174);
                        i3 = 1108717018;
                    }
                    i18 = iM2566 ^ i3;
                    i17 = i2;
                    break;
                case -1323441293:
                case 1714538968:
                    if (C2105.f7037 != 0) {
                        int iM25613 = C0630.m2566("ۗ۠") ^ i15;
                        i10 = ((iM25613 ^ i16) * (-24407)) ^ 182644413;
                        i18 = iM25613 ^ (-1081024509);
                        i17 = i10;
                        c16560 = c16560;
                    } else {
                        iM2566 = (C0630.m2566("۠᩹") + i15) * 77;
                        i2 = ((iM2566 ^ i16) * (-23475)) ^ 866763620;
                        i3 = 1356029171;
                        i18 = iM2566 ^ i3;
                        i17 = i2;
                    }
                    break;
                case -1253612744:
                case -76416595:
                    i22 = i22;
                    z = true;
                    i12 = 0;
                    if (i11 != 0) {
                        iM2567 = C2105.m6981("ܽ᩺") ^ i15;
                        i8 = ((iM2567 ^ i16) * 15053) ^ 1956269237;
                        i9 = -1557044491;
                    } else {
                        iM2567 = (C2105.m6981("ۧܶ") + i16) * (-119);
                        i8 = ((iM2567 ^ i15) * 25569) ^ 1656328944;
                        i9 = -1043063156;
                    }
                    i18 = iM2567 ^ i9;
                    list = list;
                    i17 = i8;
                    i22 = i22;
                    c16560 = c16560;
                    break;
                case -1158684926:
                case 692340468:
                    intent.setData(abstractC15440M25622.m36522());
                    sArr3 = f63246;
                    i23 = 237;
                    if (C1294.f4556 < 0) {
                        iM6981 = (i15 - C2105.m6981("ۘ᩸")) * 97;
                        i2 = ((iM6981 ^ i16) * 17049) ^ (-2130958863);
                        i4 = -982669667;
                        i18 = iM6981 ^ i4;
                        c16560 = c16560;
                        i17 = i2;
                    } else {
                        sArr = sArr2;
                        i22 = i22;
                        iM2567 = (i16 - C0630.m2566("ۢۙ")) * (-59);
                        sArr2 = sArr;
                        i8 = ((iM2567 ^ i15) * (-19607)) ^ (-559391002);
                        i9 = -1543796450;
                        i18 = iM2567 ^ i9;
                        list = list;
                        i17 = i8;
                        i22 = i22;
                        c16560 = c16560;
                    }
                    break;
                case -1153181482:
                case 176447938:
                    ServiceConnectionC3453.m10564();
                    iM2566 = (C0630.m2566("۠᩹") + i15) * 77;
                    i2 = ((iM2566 ^ i16) * (-23475)) ^ 866763620;
                    i3 = 1356029171;
                    i18 = iM2566 ^ i3;
                    i17 = i2;
                    break;
                case -1082365805:
                case 1048553506:
                    sArr = sArr2;
                    i22 = i22;
                    intent = new Intent(main, (Class<?>) cls2);
                    C1711.m5738(intent, 268435456);
                    if (C2167.m7155()) {
                        iM2567 = (i16 - C0630.m2566("ۢۙ")) * (-59);
                        sArr2 = sArr;
                        i8 = ((iM2567 ^ i15) * (-19607)) ^ (-559391002);
                        i9 = -1543796450;
                    } else {
                        sArr2 = sArr;
                        iM2567 = (i15 - C2105.m6981("ۡ᩷")) * 31;
                        i8 = ((iM2567 ^ i16) * 13799) ^ (-1274883842);
                        i9 = 2100784630;
                    }
                    i18 = iM2567 ^ i9;
                    list = list;
                    i17 = i8;
                    i22 = i22;
                    c16560 = c16560;
                    break;
                case -1008079980:
                case 99072233:
                    i5 = i22;
                    sArr4 = f63246;
                    c = 210;
                    if (C0237.f1507 != 0) {
                        iM6982 = C2105.m6981("᩸ۗ") ^ i16;
                        i6 = ((iM6982 ^ i15) * 28791) ^ (-1417385331);
                        i7 = -1090434782;
                    } else {
                        iM6982 = C0630.m2566("ۘܽ") ^ i15;
                        i6 = ((iM6982 ^ i16) * (-12813)) ^ 464667421;
                        i7 = 1854605508;
                    }
                    i18 = iM6982 ^ i7;
                    i17 = i6;
                    i22 = i5;
                    i11 = i;
                    break;
                case -994196003:
                case -838908592:
                    i5 = i22;
                    if (C0483.f2088 >= 0) {
                        iM6982 = C2105.m6981("᩸ۗ") ^ i16;
                        i6 = ((iM6982 ^ i15) * 28791) ^ (-1417385331);
                        i7 = -1090434782;
                    } else {
                        iM6982 = C2105.m6981("֡ۖ") ^ i15;
                        i6 = ((iM6982 ^ i16) * 6603) ^ 148942974;
                        i7 = 669625530;
                    }
                    i18 = iM6982 ^ i7;
                    i17 = i6;
                    i22 = i5;
                    i11 = i;
                    break;
                case -826993272:
                case 1400040407:
                    i5 = i22;
                    if (C1128.m3851() > 0) {
                        iM6982 = C2105.m6981("ᩳ֫") ^ i16;
                        i6 = ((iM6982 ^ i15) * 18735) ^ 1462765597;
                        i7 = -502979963;
                        i18 = iM6982 ^ i7;
                        i17 = i6;
                        i22 = i5;
                        i11 = i;
                    } else {
                        i22 = i5;
                        int iM6986 = C2105.m6981("ۘᩴ") ^ i15;
                        i18 = iM6986 ^ (-40931155);
                        i17 = ((iM6986 ^ i16) * 23353) ^ (-1853012286);
                        i11 = i;
                    }
                    break;
                case -610301815:
                case -7511229:
                    i5 = i22;
                    short s = sArr4[c];
                    int i24 = s * 18188;
                    i21 = s * s;
                    if (C2105.m6982() == 0) {
                        int iM6987 = C2105.m6981("ۡ۠") ^ i16;
                        int i25 = ((iM6987 ^ i15) * (-7439)) ^ (-590473991);
                        i18 = iM6987 ^ 1772562391;
                        list = list;
                        i17 = i25;
                        i20 = i24;
                        i22 = i5;
                        i11 = i;
                        c16560 = c16560;
                    } else {
                        i20 = i24;
                        iM6982 = C2105.m6981("᩸ۗ") ^ i16;
                        i6 = ((iM6982 ^ i15) * 28791) ^ (-1417385331);
                        i7 = -1090434782;
                        i18 = iM6982 ^ i7;
                        i17 = i6;
                        i22 = i5;
                        i11 = i;
                    }
                    break;
                case -548694668:
                case 1066450283:
                    cls2 = ActivityC16315.class;
                    iM2567 = (i16 - C2105.m6981("ᩳۡ")) * (-49);
                    i8 = ((iM2567 ^ i15) * 23413) ^ (-293656433);
                    i9 = -1462290804;
                    i18 = iM2567 ^ i9;
                    list = list;
                    i17 = i8;
                    i22 = i22;
                    c16560 = c16560;
                    break;
                case -464016625:
                case 1218168089:
                    C0382.m1848();
                    if (C4159.m12565() >= 0) {
                        sArr = sArr2;
                        i22 = i22;
                        iM2567 = (i16 - C0630.m2566("ۢۙ")) * (-59);
                        sArr2 = sArr;
                        i8 = ((iM2567 ^ i15) * (-19607)) ^ (-559391002);
                        i9 = -1543796450;
                        i18 = iM2567 ^ i9;
                        list = list;
                        i17 = i8;
                        i22 = i22;
                        c16560 = c16560;
                    } else {
                        iM2566 = (C0630.m2566("۠᩹") + i15) * 77;
                        i2 = ((iM2566 ^ i16) * (-23475)) ^ 866763620;
                        i3 = 1356029171;
                        i18 = iM2566 ^ i3;
                        i17 = i2;
                    }
                    break;
                case -396718474:
                case 1327244552:
                    i22 = i22;
                    if (i20 - (i21 + 82700836) <= 0) {
                        iM2567 = C2105.m6981("ۤ᩵") ^ i15;
                        i8 = ((iM2567 ^ i16) * (-12621)) ^ (-35101803);
                        i9 = -768376415;
                    } else {
                        iM2567 = (C0630.m2566("۠ۛ") + i15) * (-87);
                        i8 = ((iM2567 ^ i16) * 4555) ^ (-357263019);
                        i9 = -1899926917;
                    }
                    i18 = iM2567 ^ i9;
                    list = list;
                    i17 = i8;
                    i22 = i22;
                    c16560 = c16560;
                    break;
                case -390227363:
                case 794225146:
                    ((C10211) C2272.m7513(itM6374)).m25619();
                    iM2567 = (i16 - C0630.m2566("ܽ۠")) * 67;
                    i8 = ((iM2567 ^ i15) * (-7383)) ^ (-835470574);
                    i9 = -1702780637;
                    i18 = iM2567 ^ i9;
                    list = list;
                    i17 = i8;
                    i22 = i22;
                    c16560 = c16560;
                    break;
                case -150918521:
                case 1404977564:
                    throw new RuntimeException();
                case 195104972:
                case 2130770343:
                    C8699.m22486(c16560, ((C10211) C21923.m49339(list, i12)).m25622());
                    return;
                case 371573504:
                case 1692750020:
                    i22 = i22;
                    if (i11 != z) {
                        iM2567 = (C0630.m2566("ۘ۫") ^ i15) * 83;
                        i8 = ((iM2567 ^ i16) * (-4265)) ^ (-1728331009);
                        i9 = -504561320;
                    } else {
                        iM2567 = (i15 - C2105.m6981("ۨۤ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = ((iM2567 ^ i16) * 32509) ^ (-1518577237);
                        i9 = 64780364;
                    }
                    i18 = iM2567 ^ i9;
                    list = list;
                    i17 = i8;
                    i22 = i22;
                    c16560 = c16560;
                    break;
                case 377060986:
                case 2030597420:
                    itM6374 = RunnableC1937.m6374(list);
                    iM2567 = (i16 - C0630.m2566("ܽ۠")) * 67;
                    i8 = ((iM2567 ^ i15) * (-7383)) ^ (-835470574);
                    i9 = -1702780637;
                    i18 = iM2567 ^ i9;
                    list = list;
                    i17 = i8;
                    i22 = i22;
                    c16560 = c16560;
                    break;
                case 666116350:
                case 1086761011:
                    C22628.m50615();
                    return;
                case 1127158542:
                case 1799822975:
                    C8699.m22485(c16560, ((C10211) C21923.m49339(list, i12)).m25622());
                    return;
                case 1684771350:
                case 1730620056:
                    i13 = 25138;
                    iM2567 = (i16 - C0630.m2566("ܶۡ")) * (-105);
                    i8 = ((iM2567 ^ i15) * 14777) ^ (-1224834139);
                    i9 = 1683509263;
                    i18 = iM2567 ^ i9;
                    list = list;
                    i17 = i8;
                    i22 = i22;
                    c16560 = c16560;
                    break;
                default:
                    if (i11 != 2) {
                        iM2566 = (i15 - C0630.m2566("ܶᩴ")) * 61;
                        i2 = ((iM2566 ^ i16) * 1527) ^ 1886375735;
                        i3 = 250028778;
                    } else {
                        iM2566 = C2105.m6981("ۡ᩻") ^ i16;
                        i2 = ((iM2566 ^ i15) * 21591) ^ 920706817;
                        i3 = 545960009;
                    }
                    i18 = iM2566 ^ i3;
                    i17 = i2;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0296 A[PHI: r4 r20 r21
      0x0296: PHI (r4v6 java.lang.String) = (r4v2 java.lang.String), (r4v3 java.lang.String), (r4v2 java.lang.String) binds: [B:62:0x0294, B:39:0x015b, B:15:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r20v26 bin.mt.plus.Main) = (r20v3 bin.mt.plus.Main), (r20v11 bin.mt.plus.Main), (r20v27 bin.mt.plus.Main) binds: [B:62:0x0294, B:39:0x015b, B:15:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r21v9 short) = (r21v4 short), (r21v3 short), (r21v3 short) binds: [B:62:0x0294, B:39:0x015b, B:15:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x02cc A[PHI: r5 r8 r14 r15 r16 r20
      0x02cc: PHI (r5v3 android.net.Uri) = (r5v2 android.net.Uri), (r5v2 android.net.Uri), (r5v2 android.net.Uri), (r5v4 android.net.Uri) binds: [B:66:0x02ca, B:34:0x011b, B:27:0x00cc, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x02cc: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:66:0x02ca, B:34:0x011b, B:27:0x00cc, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x02cc: PHI (r14v4 short[]) = (r14v2 short[]), (r14v3 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:66:0x02ca, B:34:0x011b, B:27:0x00cc, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x02cc: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:66:0x02ca, B:34:0x011b, B:27:0x00cc, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x02cc: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:66:0x02ca, B:34:0x011b, B:27:0x00cc, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x02cc: PHI (r20v21 bin.mt.plus.Main) = (r20v2 bin.mt.plus.Main), (r20v12 bin.mt.plus.Main), (r20v15 bin.mt.plus.Main), (r20v22 bin.mt.plus.Main) binds: [B:66:0x02ca, B:34:0x011b, B:27:0x00cc, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a3, code lost:
    
        if (l.C1420.f5096 <= 0) goto L15;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m45008(C16560 c16560, InterfaceC17889 interfaceC17889, AbstractC15440 abstractC15440) {
        int iM2566;
        int i;
        int i2;
        short s;
        Main main;
        int i3 = C3245.f10203;
        int i4 = C0483.f2088;
        int iM6981 = C2105.m6981("᩶۬") ^ i3;
        int i5 = ((iM6981 ^ i4) * 10113) ^ (-1399379309);
        String strM3603 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM6981 ^ (-702935226);
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = -11409739;
        short s2 = 0;
        Uri uriM36522 = null;
        short[] sArr3 = null;
        int i12 = 0;
        String strM11919 = null;
        Class<ActivityC16315> cls = null;
        Intent intent = null;
        Main mainM49336 = null;
        while (true) {
            i11 = i6 ^ (i5 & (((i11 ^ i4) * (-5653)) >> 31));
            switch (i11) {
                case -2144570222:
                case -1633395489:
                    i12 = 8136;
                    iM2566 = (i3 - C2105.m6981("ۛ۫")) * (-31);
                    i = ((iM2566 ^ i4) * (-11615)) ^ (-394050936);
                    i2 = -118375889;
                    main = mainM49336;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    mainM49336 = main;
                    break;
                case -1967238231:
                case -1795981753:
                    mainM49336 = mainM49336;
                    s2 = sArr[352];
                    if (C3683.m11222()) {
                        iM2566 = C2105.m6981("֫ۖ") ^ i4;
                        i = ((iM2566 ^ i3) * (-9323)) ^ (-1250492398);
                        i2 = -1419289950;
                    } else {
                        iM2566 = C0630.m2566("᩷ܺ") ^ i4;
                        i = ((iM2566 ^ i3) * (-14131)) ^ 1583787288;
                        i2 = 1045772886;
                    }
                    main = mainM49336;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    mainM49336 = main;
                    break;
                case -1869863827:
                case 253974789:
                    C3663.m11168();
                    if (C1504.f5354) {
                        mainM49336 = mainM49336;
                        s = s2;
                        int iM6982 = C2105.m6981("ۧ֫") ^ i3;
                        s2 = s;
                        i5 = ((iM6982 ^ i4) * 7233) ^ (-1376410782);
                        main = mainM49336;
                        i6 = iM6982 ^ 1071626125;
                        mainM49336 = main;
                    }
                    iM2566 = C2105.m6981("ᩳ᩺") ^ i3;
                    mainM49336 = mainM49336;
                    i = ((iM2566 ^ i4) * (-18519)) ^ (-2055848471);
                    i2 = 1899861853;
                    main = mainM49336;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    mainM49336 = main;
                    break;
                case -1829581475:
                case -1592738341:
                    mainM49336 = mainM49336;
                    if (i8 - (91298025 + i9) <= 0) {
                        iM2566 = (C0630.m2566("ᩴ᩷") ^ i3) * (-5);
                        i = ((iM2566 ^ i4) * 8899) ^ (-1949746562);
                        i2 = 1426345408;
                    } else {
                        iM2566 = (C2105.m6981("ۢۘ") ^ i4) * (-71);
                        i = ((iM2566 ^ i3) * 22649) ^ 544508976;
                        i2 = -1660362785;
                    }
                    main = mainM49336;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    mainM49336 = main;
                    break;
                case -1742307240:
                case 1950661162:
                    RunnableC1108.m3790();
                    C1294.m4372();
                    break;
                case -939016907:
                case -86485057:
                    mainM49336 = mainM49336;
                    C0798.m3009(intent, 268435456);
                    sArr3 = f63246;
                    if (C0964.f3626 != 0) {
                        mainM49336 = mainM49336;
                        iM2566 = C2105.m6981("ᩳ᩺") ^ i3;
                        mainM49336 = mainM49336;
                        i = ((iM2566 ^ i4) * (-18519)) ^ (-2055848471);
                        i2 = 1899861853;
                    } else {
                        iM2566 = C0630.m2566("۬ۧ") ^ i3;
                        i = ((iM2566 ^ i4) * 12187) ^ 1073661391;
                        i2 = 618731983;
                    }
                    main = mainM49336;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    mainM49336 = main;
                    break;
                case -851455883:
                case 2017564620:
                    C3663.m11168();
                    break;
                case -794967789:
                case 1101164537:
                    mainM49336 = mainM49336;
                    intent.setData(uriM36522);
                    sArr2 = f63246;
                    i10 = 379;
                    i7 = 5;
                    if (C2520.f8000 >= 0) {
                        iM2566 = (i4 - C0630.m2566("ܶܿ")) * (-115);
                        i = ((iM2566 ^ i3) * 31045) ^ 1787625194;
                        i2 = -861187593;
                    } else {
                        iM2566 = C0630.m2566("ܿ֫") ^ i3;
                        i = ((iM2566 ^ i4) * 16005) ^ 1992155276;
                        i2 = -100256702;
                    }
                    main = mainM49336;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    mainM49336 = main;
                    break;
                case -662730138:
                case 179725481:
                    mainM49336 = mainM49336;
                    strM3603 = C1047.m3603(sArr2, i10, i7, i12);
                    z = true;
                    if (C3911.f12484 < 0) {
                        iM2566 = C2105.m6981("ۘۢ") ^ i4;
                        i = ((iM2566 ^ i3) * (-22161)) ^ (-1216037022);
                        i2 = -2000149331;
                        main = mainM49336;
                        i6 = iM2566 ^ i2;
                        i5 = i;
                        mainM49336 = main;
                    }
                    s = s2;
                    int iM6983 = C2105.m6981("ۧ֫") ^ i3;
                    s2 = s;
                    i5 = ((iM6983 ^ i4) * 7233) ^ (-1376410782);
                    main = mainM49336;
                    i6 = iM6983 ^ 1071626125;
                    mainM49336 = main;
                    break;
                case -512403466:
                case -473977914:
                    mainM49336 = mainM49336;
                    s = s2;
                    i8 = s * 19110;
                    i9 = s * s;
                    if (C0714.f2697 >= 0) {
                        int iM6984 = C2105.m6981("ۧ֫") ^ i3;
                        s2 = s;
                        i5 = ((iM6984 ^ i4) * 7233) ^ (-1376410782);
                        main = mainM49336;
                        i6 = iM6984 ^ 1071626125;
                    } else {
                        s2 = s;
                        iM2566 = C0630.m2566("ܰ᩶") ^ i4;
                        i = ((iM2566 ^ i3) * 10209) ^ (-1149671157);
                        i2 = 1305567768;
                        main = mainM49336;
                        i6 = iM2566 ^ i2;
                        i5 = i;
                    }
                    mainM49336 = main;
                    break;
                case -348009596:
                case 731473879:
                    mainM49336 = C21923.m49336(c16560);
                    cls = ActivityC16315.class;
                    intent = new Intent(mainM49336, cls);
                    if (C3019.f9544 >= 0) {
                        iM2566 = C2105.m6981("ᩳ᩺") ^ i3;
                        mainM49336 = mainM49336;
                        i = ((iM2566 ^ i4) * (-18519)) ^ (-2055848471);
                        i2 = 1899861853;
                    } else {
                        iM2566 = (i4 - C2105.m6981("ᩴ۫")) * (-85);
                        mainM49336 = mainM49336;
                        i = ((iM2566 ^ i3) * 169) ^ 340018886;
                        i2 = 575715377;
                    }
                    main = mainM49336;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    mainM49336 = main;
                    break;
                case -215909716:
                case 497431617:
                    C3019.m9255();
                    if (C7811.m20844() != 0) {
                        mainM49336 = mainM49336;
                        iM2566 = C2105.m6981("֫ۖ") ^ i4;
                        i = ((iM2566 ^ i3) * (-9323)) ^ (-1250492398);
                        i2 = -1419289950;
                        main = mainM49336;
                        i6 = iM2566 ^ i2;
                        i5 = i;
                        mainM49336 = main;
                    } else {
                        int iM2567 = (C0630.m2566("ۚۤ") + i4) * 51;
                        i6 = iM2567 ^ (-1190526430);
                        i5 = ((iM2567 ^ i3) * (-19525)) ^ (-1322627396);
                    }
                    break;
                case -195007464:
                case 434260054:
                    mainM49336 = mainM49336;
                    sArr = f63246;
                    if (C1420.m4913()) {
                        iM2566 = (i4 - C0630.m2566("ܶܿ")) * (-115);
                        i = ((iM2566 ^ i3) * 31045) ^ 1787625194;
                        i2 = -861187593;
                    } else {
                        iM2566 = C0630.m2566("᩵ᩳ") ^ i3;
                        i = ((iM2566 ^ i4) * (-10757)) ^ 1993647321;
                        i2 = -1463532193;
                    }
                    main = mainM49336;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    mainM49336 = main;
                    break;
                case 64343913:
                case 110739625:
                    i12 = 31867;
                    iM2566 = (i3 - C2105.m6981("ۛ۫")) * (-31);
                    i = ((iM2566 ^ i4) * (-11615)) ^ (-394050936);
                    i2 = -118375889;
                    main = mainM49336;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    mainM49336 = main;
                    break;
                case 110664924:
                case 735830947:
                    mainM49336 = mainM49336;
                    strM11919 = C3911.m11919(sArr3, 353, 26, i12);
                    if (RunnableC1108.m3790()) {
                        iM2566 = C2105.m6981("֫ۖ") ^ i4;
                        i = ((iM2566 ^ i3) * (-9323)) ^ (-1250492398);
                        i2 = -1419289950;
                    } else {
                        iM2566 = C2105.m6981("ܺ֫") ^ i3;
                        i = ((iM2566 ^ i4) * 12673) ^ 1104640446;
                        i2 = 1832121329;
                    }
                    main = mainM49336;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    mainM49336 = main;
                    break;
                case 303128142:
                case 957899548:
                    C9340.m24035(interfaceC17889, 2000);
                    C4075.m12261(mainM49336, intent);
                    break;
                case 446064471:
                case 1397195090:
                    RunnableC3474.m10630();
                    mainM49336 = mainM49336;
                    iM2566 = C2105.m6981("֫ۖ") ^ i4;
                    i = ((iM2566 ^ i3) * (-9323)) ^ (-1250492398);
                    i2 = -1419289950;
                    main = mainM49336;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    mainM49336 = main;
                    break;
                case 464623817:
                case 1475062180:
                    intent.putExtra(strM3603, z);
                    m44999(intent, cls, C4159.m12569(c16560));
                    if (C1047.f3863 >= 0) {
                        mainM49336 = mainM49336;
                        iM2566 = (i4 - C0630.m2566("ܶܿ")) * (-115);
                        i = ((iM2566 ^ i3) * 31045) ^ 1787625194;
                        i2 = -861187593;
                    } else {
                        iM2566 = C0630.m2566("ܳ᩶") ^ i3;
                        mainM49336 = mainM49336;
                        i = ((iM2566 ^ i4) * (-3343)) ^ (-1574998502);
                        i2 = 459391703;
                    }
                    main = mainM49336;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    mainM49336 = main;
                    break;
                default:
                    mainM49336 = mainM49336;
                    intent.setAction(strM11919);
                    uriM36522 = abstractC15440.m36522();
                    if (C0382.m1848()) {
                        iM2566 = (i4 - C0630.m2566("ܶܿ")) * (-115);
                        i = ((iM2566 ^ i3) * 31045) ^ 1787625194;
                        i2 = -861187593;
                    } else {
                        iM2566 = C2105.m6981("ۗ۠") ^ i4;
                        i = ((iM2566 ^ i3) * (-13881)) ^ (-53678620);
                        i2 = 264130041;
                    }
                    main = mainM49336;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    mainM49336 = main;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x01ee  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x01c0, code lost:
    
        if (l.C4263.f13799 > 0) goto L20;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m45004(C16560 c16560, ArrayList arrayList, InterfaceC17889 interfaceC17889, DialogInterface dialogInterface, int i) {
        AbstractC13921 abstractC13921;
        int i2;
        String str;
        C19258 c19258;
        C19258 c19259;
        int i3;
        Main main;
        Main main2;
        int iM2566;
        int i4;
        short[] sArr;
        int i5;
        int i6;
        C19258 c192510;
        int i7;
        Main main3;
        short[] sArr2;
        Main main4;
        int i8;
        int i9;
        int iM6981;
        int i10;
        int iM2567;
        int i11;
        int i12;
        int iM6982;
        int i13;
        int i14;
        int iM2568;
        int i15;
        int i16;
        boolean z;
        String str2;
        C19258 c192511;
        short[] sArr3;
        int i17;
        int i18;
        C19258 c192512;
        int i19;
        int i20;
        Main main5;
        short[] sArr4;
        int iM6983;
        int iM6984;
        int i21;
        int i22;
        short[] sArr5;
        int i23;
        int i24;
        int i25;
        Main main6;
        short[] sArr6;
        int iM2569;
        int i26;
        int i27;
        boolean z2;
        short[] sArr7;
        int i28;
        int i29;
        int i30;
        Main main7;
        short[] sArr8;
        int iM25610;
        int i31;
        short[] sArr9;
        int iM6985;
        int i32;
        int i33;
        Main main8;
        short[] sArr10;
        int i34;
        C19258 c192513;
        short[] sArr11;
        int i35;
        int i36;
        Main main9;
        int i37;
        C19258 c192514;
        int iM6986;
        int i38;
        int i39;
        C19258 c192515;
        C19258 c192516;
        C19258 c192517;
        int iM6987;
        int i40;
        int i41;
        int iM25611;
        int i42;
        C16560 c16561 = c16560;
        boolean z3 = false;
        int i43 = 0;
        Object obj = null;
        int i44 = 0;
        int iM6988 = 0;
        int i45 = 0;
        int iM6989 = 0;
        int i46 = 0;
        int i47 = 0;
        int i48 = 0;
        int i49 = 0;
        int i50 = -473940687;
        int i51 = C3245.f10203;
        int i52 = C3683.f11629;
        int iM69810 = (i51 - C2105.m6981("۫ۨ")) * (-67);
        int i53 = ((iM69810 ^ i52) * 31653) ^ 711623127;
        int i54 = iM69810 ^ 1395232646;
        Integer num = null;
        String str3 = null;
        Main mainM50612 = null;
        C19258 c192518 = null;
        AbstractC13921 abstractC13921M39063 = null;
        C19258 c192519 = null;
        short[] sArr12 = null;
        short[] sArr13 = null;
        int iM69811 = 0;
        int iM69812 = 0;
        int i55 = 0;
        int i56 = 0;
        int iM69813 = 0;
        int i57 = 0;
        int i58 = 0;
        int i59 = 0;
        int i60 = 0;
        boolean zM11356 = false;
        short s = 0;
        int i61 = 0;
        int i62 = 0;
        int i63 = 0;
        Main main10 = null;
        int i64 = 0;
        Main mainM50613 = null;
        Main mainM50614 = null;
        while (true) {
            i50 = i54 ^ (i53 & (((i50 ^ i52) * 32671) >> 31));
            switch (i50) {
                case -2142770720:
                case 138779992:
                    if (C7106.f21815 != 0) {
                        iM25611 = (i52 - C2105.m6981("ۘ᩶")) * (-93);
                        i4 = ((iM25611 ^ i51) * (-11341)) ^ (-1699443458);
                        i42 = -1333316145;
                        i54 = iM25611 ^ i42;
                        i53 = i4;
                    } else {
                        i34 = i49;
                        c192513 = c192519;
                        i33 = i57;
                        main8 = mainM50612;
                        sArr10 = sArr13;
                        Main main11 = main10;
                        iM69813 = iM69813;
                        main4 = main11;
                        int iM25612 = C0630.m2566("ܽܶ") ^ i51;
                        int i65 = i34;
                        i8 = ((iM25612 ^ i52) * 23315) ^ (-1539519205);
                        i54 = iM25612 ^ 2063220037;
                        sArr13 = sArr10;
                        mainM50612 = main8;
                        i57 = i33;
                        abstractC13921M39063 = abstractC13921M39063;
                        i63 = i63;
                        i58 = i58;
                        c192519 = c192513;
                        i49 = i65;
                        c192518 = c192518;
                        str3 = str3;
                        i53 = i8;
                        int i66 = iM69813;
                        main10 = main4;
                        iM69813 = i66;
                    }
                    break;
                case -2013006872:
                case 688218960:
                    abstractC13921 = abstractC13921M39063;
                    i2 = iM69813;
                    Main main12 = main10;
                    str = str3;
                    c19258 = c192518;
                    c19259 = c192519;
                    i3 = i58;
                    int i67 = i57;
                    main = mainM50612;
                    mainM50613 = C22628.m50612(c16560);
                    if (!zM11356) {
                        main2 = main12;
                        iM2566 = i55;
                        int iM69814 = (i52 - C2105.m6981("ۛ۬")) * 11;
                        int i68 = iM2566;
                        int i69 = ((iM69814 ^ i51) * 2603) ^ 1229831923;
                        i54 = iM69814 ^ (-463003923);
                        i58 = i3;
                        mainM50612 = main;
                        c192519 = c19259;
                        i57 = i68;
                        c192518 = c19258;
                        str3 = str;
                        i53 = i69;
                        main10 = main2;
                        iM69813 = i2;
                        abstractC13921M39063 = abstractC13921;
                    } else {
                        int iM69815 = C2105.m6981("۠ۡ") ^ i51;
                        i4 = ((iM69815 ^ i52) * (-10879)) ^ 845299622;
                        i54 = iM69815 ^ (-1867469570);
                        main10 = main12;
                        mainM50612 = main;
                        i57 = i67;
                        i58 = i3;
                        iM69813 = i2;
                        c192519 = c19259;
                        abstractC13921M39063 = abstractC13921;
                        c192518 = c19258;
                        str3 = str;
                        i53 = i4;
                    }
                    break;
                case -1855917122:
                case -897984979:
                    C11340.m28031();
                    if (C0382.f1805) {
                        iM25611 = C2105.m6981("ۡۢ") ^ i51;
                        i4 = ((iM25611 ^ i52) * 27269) ^ 1928487564;
                        i42 = -1572966999;
                    } else {
                        iM25611 = (i52 - C2105.m6981("ۘ᩶")) * (-93);
                        i4 = ((iM25611 ^ i51) * (-11341)) ^ (-1699443458);
                        i42 = -1333316145;
                    }
                    i54 = iM25611 ^ i42;
                    i53 = i4;
                    break;
                case -1848163374:
                case 1295823461:
                    m45007(c16561, interfaceC17889, ActivityC21107.class);
                    break;
                case -1817351700:
                case -175888054:
                    abstractC13921M39063 = abstractC13921M39063;
                    boolean z4 = z3;
                    i56 = i56;
                    str3 = str3;
                    c192518 = c192518;
                    short[] sArr14 = sArr12;
                    int i70 = i61;
                    int i71 = i63;
                    C19258 c192520 = c192519;
                    int i72 = i58;
                    int i73 = i57;
                    Main main13 = mainM50612;
                    short[] sArr15 = sArr13;
                    Main main14 = main10;
                    iM69813 = iM69813;
                    main4 = main14;
                    short s2 = s;
                    int i74 = s2 + 16473;
                    int i75 = (s2 * s2) + 271359729;
                    if ((i74 * i74) - (i75 + i75) <= 0) {
                        int iM25613 = (C0630.m2566("ܿ۬") ^ i52) * (-19);
                        i53 = ((iM25613 ^ i51) * (-23683)) ^ (-455298284);
                        sArr13 = sArr15;
                        mainM50612 = main13;
                        i57 = i73;
                        i61 = i70;
                        i63 = i71;
                        sArr12 = sArr14;
                        s = s2;
                        c16561 = c16560;
                        i58 = i72;
                        i54 = iM25613 ^ (-710179024);
                        c192519 = c192520;
                        z3 = z4;
                    } else {
                        int iM69816 = (C2105.m6981("ܺ᩵") + i52) * (-21);
                        i53 = ((iM69816 ^ i51) * 32173) ^ (-445233396);
                        sArr13 = sArr15;
                        mainM50612 = main13;
                        i57 = i73;
                        i61 = i70;
                        i63 = i71;
                        sArr12 = sArr14;
                        z3 = z4;
                        s = s2;
                        i54 = iM69816 ^ (-1160334109);
                        i58 = i72;
                        c192519 = c192520;
                        c16561 = c16560;
                    }
                    c192518 = c192518;
                    str3 = str3;
                    i56 = i56;
                    abstractC13921M39063 = abstractC13921M39063;
                    int i610 = iM69813;
                    main10 = main4;
                    iM69813 = i610;
                    break;
                case -1794796545:
                case 641001747:
                    abstractC13921M39063 = abstractC13921M39063;
                    str3 = str3;
                    c192518 = c192518;
                    sArr7 = sArr12;
                    i28 = i61;
                    i29 = i63;
                    c192510 = c192519;
                    i58 = i58;
                    i30 = i57;
                    main7 = mainM50612;
                    sArr8 = sArr13;
                    Main main15 = main10;
                    iM69813 = iM69813;
                    main4 = main15;
                    z2 = z3;
                    if (i58 == (C0630.m2566(C1711.m5726(f63246, 299, 3, i64)) ^ 2123683670)) {
                        iM25610 = (C2105.m6981("ܰᩳ") + i52) * 19;
                        i21 = ((iM25610 ^ i51) * (-18415)) ^ (-151855049);
                        i31 = -272811694;
                    } else {
                        iM25610 = (C2105.m6981("ۤۨ") ^ i51) * (-23);
                        i21 = ((iM25610 ^ i52) * (-8943)) ^ 338470905;
                        i31 = -1145552905;
                    }
                    i54 = iM25610 ^ i31;
                    sArr13 = sArr8;
                    mainM50612 = main7;
                    i57 = i30;
                    i61 = i28;
                    i63 = i29;
                    sArr12 = sArr7;
                    z3 = z2;
                    i58 = i58;
                    c192519 = c192510;
                    c192518 = c192518;
                    str3 = str3;
                    i53 = i21;
                    abstractC13921M39063 = abstractC13921M39063;
                    int i611 = iM69813;
                    main10 = main4;
                    iM69813 = i611;
                    break;
                case -1769978521:
                case 1557910944:
                    C1916.m6295(c192519, i49 ^ 2119852203);
                    C1294.m4380(c192519, iM6988, new DialogInterfaceOnClickListenerC22370(c16561, interfaceC17889));
                    C2520.m8029(c192519, i44, obj);
                    RunnableC0588.m2438(c192519);
                    break;
                case -1761075269:
                case 1485013684:
                    C1420.m4913();
                    break;
                case -1736015704:
                case -1293150554:
                    C19258 c192521 = c192518;
                    C1916.m6295(c192521, i47 ^ i48);
                    C1294.m4380(c192521, iM6988, new DialogInterfaceOnClickListenerC15833(0, c16561, interfaceC17889));
                    C5695.m16035(c192521, i44, obj);
                    C3683.m11213(c192521);
                    break;
                case -1726989923:
                case -1272866292:
                    AbstractC13921 abstractC13922 = abstractC13921M39063;
                    int i76 = i57;
                    String str4 = str3;
                    C19258 c192522 = c192518;
                    c192514 = c192519;
                    Main main16 = mainM50612;
                    int i77 = i58;
                    int iM69817 = C2105.m6981(C1294.m4373(f63246, 314, 3, i64)) ^ 2100280201;
                    if (i77 == iM69817) {
                        iM6986 = (C0630.m2566("ܽ֡") + i51) * (-111);
                        i38 = ((iM6986 ^ i52) * 6625) ^ (-638932447);
                        i39 = -149980174;
                    } else {
                        iM6986 = C2105.m6981("᩶ᩳ") ^ i52;
                        i38 = ((iM6986 ^ i51) * 17767) ^ (-1763526748);
                        i39 = -1012031947;
                    }
                    i54 = iM6986 ^ i39;
                    i60 = iM69817;
                    abstractC13921M39063 = abstractC13922;
                    c192515 = c192522;
                    str3 = str4;
                    i53 = i38;
                    mainM50612 = main16;
                    i57 = i76;
                    i58 = i77;
                    c192519 = c192514;
                    c192518 = c192515;
                    break;
                case -1722676921:
                case 1243496347:
                    main4 = main10;
                    i64 = 14180;
                    iM2567 = (C0630.m2566("᩹ܺ") ^ i51) * 57;
                    i11 = ((iM2567 ^ i52) * (-23873)) ^ (-2008104516);
                    i12 = -47016979;
                    i54 = iM2567 ^ i12;
                    c16561 = c16560;
                    i53 = i11;
                    sArr13 = sArr13;
                    mainM50612 = mainM50612;
                    i57 = i57;
                    i61 = i61;
                    i63 = i63;
                    sArr12 = sArr12;
                    z3 = z3;
                    i58 = i58;
                    c192519 = c192519;
                    c192518 = c192518;
                    str3 = str3;
                    i56 = i56;
                    abstractC13921M39063 = abstractC13921M39063;
                    int i612 = iM69813;
                    main10 = main4;
                    iM69813 = i612;
                    break;
                case -1685976702:
                case -982974045:
                    C1005.m3501();
                    i34 = i49;
                    c192513 = c192519;
                    i33 = i57;
                    main8 = mainM50612;
                    sArr10 = sArr13;
                    Main main17 = main10;
                    iM69813 = iM69813;
                    main4 = main17;
                    int iM25614 = C0630.m2566("ܽܶ") ^ i51;
                    int i613 = i34;
                    i8 = ((iM25614 ^ i52) * 23315) ^ (-1539519205);
                    i54 = iM25614 ^ 2063220037;
                    sArr13 = sArr10;
                    mainM50612 = main8;
                    i57 = i33;
                    abstractC13921M39063 = abstractC13921M39063;
                    i63 = i63;
                    i58 = i58;
                    c192519 = c192513;
                    i49 = i613;
                    c192518 = c192518;
                    str3 = str3;
                    i53 = i8;
                    int i614 = iM69813;
                    main10 = main4;
                    iM69813 = i614;
                    break;
                case -1679118736:
                case 1072443497:
                    C19258 c19258M2130 = C0483.m2130(C22628.m50612(c16560));
                    C3432.m10490(c19258M2130, i60);
                    c192513 = c19258M2130;
                    int iM69818 = C2105.m6981(C1773.m5917(f63246, 326, 3, i64));
                    if (C7106.m19120() <= 0) {
                        i34 = iM69818;
                        i33 = i57;
                        main8 = mainM50612;
                        sArr10 = sArr13;
                        Main main18 = main10;
                        iM69813 = iM69813;
                        main4 = main18;
                        int iM25615 = C0630.m2566("ܽܶ") ^ i51;
                        int i615 = i34;
                        i8 = ((iM25615 ^ i52) * 23315) ^ (-1539519205);
                        i54 = iM25615 ^ 2063220037;
                        sArr13 = sArr10;
                        mainM50612 = main8;
                        i57 = i33;
                        abstractC13921M39063 = abstractC13921M39063;
                        i63 = i63;
                        i58 = i58;
                        c192519 = c192513;
                        i49 = i615;
                        c192518 = c192518;
                        str3 = str3;
                        i53 = i8;
                        int i616 = iM69813;
                        main10 = main4;
                        iM69813 = i616;
                    } else {
                        int iM69819 = (C2105.m6981("ܿᩳ") ^ i51) * 35;
                        i54 = iM69819 ^ (-361067436);
                        i49 = iM69818;
                        i53 = ((iM69819 ^ i52) * 23377) ^ 1813811758;
                        c192519 = c192513;
                    }
                    break;
                case -1622482780:
                case -369541475:
                    C4263.m12821(new C9690(c16561, abstractC13921M39063, interfaceC17889));
                    abstractC13921 = abstractC13921M39063;
                    str3 = str3;
                    c192518 = c192518;
                    c192510 = c192519;
                    i58 = i58;
                    iM6981 = (i51 - C2105.m6981("֫ܶ")) * (-115);
                    i9 = ((iM6981 ^ i52) * (-17247)) ^ (-1548841199);
                    i10 = -2007835776;
                    i54 = iM6981 ^ i10;
                    i58 = i58;
                    c192519 = c192510;
                    c192518 = c192518;
                    str3 = str3;
                    i53 = i9;
                    abstractC13921M39063 = abstractC13921;
                    break;
                case -1597288445:
                case -1061875461:
                    iM69812 = C2105.m6981(C4159.m12578(f63246, 332, 3, i64)) ^ 2098592815;
                    iM25611 = (C0630.m2566("ۖۘ") ^ i51) * (-67);
                    i4 = ((iM25611 ^ i52) * 5623) ^ 340343211;
                    i42 = 1549310440;
                    i54 = iM25611 ^ i42;
                    i53 = i4;
                    break;
                case -1571597188:
                case 1068268741:
                    abstractC13921M39063 = abstractC13921M39063;
                    str3 = str3;
                    c192518 = c192518;
                    sArr11 = sArr12;
                    i35 = i61;
                    c192510 = c192519;
                    i58 = i58;
                    i36 = i57;
                    main9 = mainM50612;
                    i37 = i62;
                    Main main19 = main10;
                    iM69813 = iM69813;
                    main4 = main19;
                    iM6988 = C2105.m6981(ViewOnClickListenerC1958.m6435(sArr11, i35, i37, i64)) ^ 2118268126;
                    sArr13 = f63246;
                    i63 = 308;
                    if (ViewOnClickListenerC1958.m6429() < 0) {
                        sArr9 = sArr11;
                        int iM25616 = C0630.m2566("۫ۖ") ^ i51;
                        i21 = ((iM25616 ^ i52) * (-28449)) ^ (-544832181);
                        i54 = iM25616 ^ (-1896210100);
                        i62 = i37;
                        mainM50612 = main9;
                        i57 = i36;
                        i61 = i35;
                        sArr12 = sArr9;
                        i58 = i58;
                        c192519 = c192510;
                        c192518 = c192518;
                        str3 = str3;
                        i53 = i21;
                        abstractC13921M39063 = abstractC13921M39063;
                        int i617 = iM69813;
                        main10 = main4;
                        iM69813 = i617;
                    }
                    int iM69820 = (C2105.m6981("ۡ᩷") + i51) * (-9);
                    sArr = sArr11;
                    i8 = ((iM69820 ^ i52) * (-7657)) ^ 1994029976;
                    i54 = iM69820 ^ (-119364434);
                    i61 = i35;
                    i62 = i37;
                    mainM50612 = main9;
                    i57 = i36;
                    abstractC13921M39063 = abstractC13921M39063;
                    sArr12 = sArr;
                    i58 = i58;
                    c192519 = c192510;
                    c192518 = c192518;
                    str3 = str3;
                    i53 = i8;
                    int i618 = iM69813;
                    main10 = main4;
                    iM69813 = i618;
                    break;
                case -1502981014:
                case -1198032936:
                    mainM50614.m10217(i43, iM69812, z3);
                    break;
                case -1453440103:
                case 1951957172:
                    abstractC13921M39063 = abstractC13921M39063;
                    z3 = z3;
                    i56 = i56;
                    str3 = str3;
                    c192518 = c192518;
                    sArr12 = sArr12;
                    i61 = i61;
                    i63 = i63;
                    c192519 = c192519;
                    i58 = i58;
                    i57 = i57;
                    mainM50612 = mainM50612;
                    sArr13 = sArr13;
                    Main main20 = main10;
                    iM69813 = iM69813;
                    main4 = main20;
                    s = f63246[272];
                    if (C22628.f73083 <= 0) {
                        iM2567 = (C2105.m6981("ۚ֫") ^ i52) * (-29);
                        i11 = ((iM2567 ^ i51) * 15787) ^ 1178097079;
                        i12 = 564790230;
                    } else {
                        iM2567 = (i51 - C0630.m2566("ۗ᩶")) * (-121);
                        i11 = ((iM2567 ^ i52) * 2387) ^ 652688;
                        i12 = 649632051;
                    }
                    i54 = iM2567 ^ i12;
                    c16561 = c16560;
                    i53 = i11;
                    sArr13 = sArr13;
                    mainM50612 = mainM50612;
                    i57 = i57;
                    i61 = i61;
                    i63 = i63;
                    sArr12 = sArr12;
                    z3 = z3;
                    i58 = i58;
                    c192519 = c192519;
                    c192518 = c192518;
                    str3 = str3;
                    i56 = i56;
                    abstractC13921M39063 = abstractC13921M39063;
                    int i619 = iM69813;
                    main10 = main4;
                    iM69813 = i619;
                    break;
                case -1441756304:
                case -937063396:
                    abstractC13921M39063 = abstractC13921M39063;
                    str3 = str3;
                    c192518 = c192518;
                    i63 = i63;
                    c192510 = c192519;
                    i58 = i58;
                    i33 = i57;
                    main8 = mainM50612;
                    sArr10 = sArr13;
                    Main main21 = main10;
                    iM69813 = iM69813;
                    main4 = main21;
                    i44 = i46 ^ 2103395357;
                    sArr12 = f63246;
                    i61 = 305;
                    i62 = 3;
                    if (C1294.f4556 < 0) {
                        int iM25617 = (C0630.m2566("᩺ۚ") + i52) * (-89);
                        i21 = ((iM25617 ^ i51) * 3675) ^ (-1872809480);
                        i54 = iM25617 ^ (-1006525122);
                        sArr13 = sArr10;
                        mainM50612 = main8;
                        i57 = i33;
                        i63 = i63;
                        i58 = i58;
                        c192519 = c192510;
                        c192518 = c192518;
                        str3 = str3;
                        i53 = i21;
                        abstractC13921M39063 = abstractC13921M39063;
                        int i6110 = iM69813;
                        main10 = main4;
                        iM69813 = i6110;
                    } else {
                        i34 = i49;
                        c192513 = c192510;
                        int iM25618 = C0630.m2566("ܽܶ") ^ i51;
                        int i6111 = i34;
                        i8 = ((iM25618 ^ i52) * 23315) ^ (-1539519205);
                        i54 = iM25618 ^ 2063220037;
                        sArr13 = sArr10;
                        mainM50612 = main8;
                        i57 = i33;
                        abstractC13921M39063 = abstractC13921M39063;
                        i63 = i63;
                        i58 = i58;
                        c192519 = c192513;
                        i49 = i6111;
                        c192518 = c192518;
                        str3 = str3;
                        i53 = i8;
                        int i6112 = iM69813;
                        main10 = main4;
                        iM69813 = i6112;
                    }
                    break;
                case -1400658833:
                case 2053566038:
                    abstractC13921M39063 = abstractC13921M39063;
                    int i78 = iM69813;
                    main4 = main10;
                    str3 = str3;
                    c192518 = c192518;
                    c192510 = c192519;
                    i58 = i58;
                    int i79 = i57;
                    Main main22 = mainM50612;
                    iM69813 = i78;
                    short[] sArr16 = sArr13;
                    int i80 = i63;
                    int iM69821 = C2105.m6981(C0382.m1840(sArr16, i80, 3, i64)) ^ 2121370267;
                    if (i58 != iM69821) {
                        int iM25619 = (C0630.m2566("᩺ۙ") ^ i51) * 71;
                        i63 = i80;
                        i21 = ((iM25619 ^ i52) * 6345) ^ 645861213;
                        i54 = iM25619 ^ 1003496333;
                        sArr13 = sArr16;
                        mainM50612 = main22;
                        i57 = i79;
                        i59 = iM69821;
                        i63 = i63;
                        i58 = i58;
                        c192519 = c192510;
                        c192518 = c192518;
                        str3 = str3;
                        i53 = i21;
                        abstractC13921M39063 = abstractC13921M39063;
                        int i6113 = iM69813;
                        main10 = main4;
                        iM69813 = i6113;
                    } else {
                        int iM69822 = C2105.m6981("ۘ᩹") ^ i51;
                        i8 = ((iM69822 ^ i52) * 4211) ^ (-1661344216);
                        i54 = iM69822 ^ 579187509;
                        i63 = i80;
                        sArr13 = sArr16;
                        mainM50612 = main22;
                        i57 = i79;
                        abstractC13921M39063 = abstractC13921M39063;
                        i59 = iM69821;
                        i58 = i58;
                        c192519 = c192510;
                        c192518 = c192518;
                        str3 = str3;
                        i53 = i8;
                        int i6114 = iM69813;
                        main10 = main4;
                        iM69813 = i6114;
                    }
                    break;
                case -1355024622:
                case -1250769362:
                    abstractC13921M39063 = abstractC13921M39063;
                    z2 = z3;
                    str3 = str3;
                    c192518 = c192518;
                    sArr7 = sArr12;
                    i28 = i61;
                    i29 = i63;
                    c192510 = c192519;
                    i58 = i58;
                    i30 = i57;
                    main7 = mainM50612;
                    sArr8 = sArr13;
                    Main main23 = main10;
                    iM69813 = iM69813;
                    main4 = main23;
                    if (i58 == (C0630.m2566(C3432.m10488(f63246, 296, 3, i64)) ^ 2128330784)) {
                        iM25610 = C2105.m6981("ۤᩴ") ^ i52;
                        i21 = ((iM25610 ^ i51) * (-26177)) ^ (-1202279011);
                        i31 = 851292901;
                    } else {
                        iM25610 = C0630.m2566("۠ۧ") ^ i51;
                        i21 = ((iM25610 ^ i52) * (-10129)) ^ (-833443406);
                        i31 = -1216604272;
                    }
                    i54 = iM25610 ^ i31;
                    sArr13 = sArr8;
                    mainM50612 = main7;
                    i57 = i30;
                    i61 = i28;
                    i63 = i29;
                    sArr12 = sArr7;
                    z3 = z2;
                    i58 = i58;
                    c192519 = c192510;
                    c192518 = c192518;
                    str3 = str3;
                    i53 = i21;
                    abstractC13921M39063 = abstractC13921M39063;
                    int i6115 = iM69813;
                    main10 = main4;
                    iM69813 = i6115;
                    break;
                case -1319617139:
                case 1219274265:
                    m45013(c16561, interfaceC17889, ActivityC17169.class);
                    break;
                case -1248188106:
                case 1461226294:
                    RunnableC1108.m3795(c16561, interfaceC17889, new C17245(0, c16561));
                    break;
                case -1242982401:
                case -1027135908:
                    abstractC13921M39063 = c16560.m39063();
                    if (abstractC13921M39063.mo7652()) {
                        iM25611 = (i52 - C0630.m2566("ۧۧ")) * 33;
                        i4 = ((iM25611 ^ i51) * 30813) ^ (-606594616);
                        i42 = -188333327;
                    } else {
                        iM25611 = (i52 - C0630.m2566("᩹᩶")) * (-59);
                        i4 = ((iM25611 ^ i51) * (-25475)) ^ (-274974047);
                        i42 = 976448180;
                    }
                    i54 = iM25611 ^ i42;
                    i53 = i4;
                    break;
                case -1223431802:
                case 1820689842:
                    C1916.m6308();
                    if (C3537.f11231 >= 0) {
                        abstractC13921M39063 = abstractC13921M39063;
                        z3 = z3;
                        i56 = i56;
                        str3 = str3;
                        c192518 = c192518;
                        sArr12 = sArr12;
                        i61 = i61;
                        i63 = i63;
                        c192519 = c192519;
                        i58 = i58;
                        i57 = i57;
                        mainM50612 = mainM50612;
                        sArr13 = sArr13;
                        Main main24 = main10;
                        iM69813 = iM69813;
                        main4 = main24;
                        iM2568 = (i52 - C2105.m6981("ܿۨ")) * (-105);
                        i15 = ((iM2568 ^ i51) * (-12987)) ^ (-1253356045);
                        i16 = 1421048273;
                        i54 = iM2568 ^ i16;
                        i53 = i15;
                        sArr13 = sArr13;
                        mainM50612 = mainM50612;
                        i57 = i57;
                        i61 = i61;
                        i63 = i63;
                        sArr12 = sArr12;
                        z3 = z3;
                        i58 = i58;
                        c192519 = c192519;
                        c192518 = c192518;
                        str3 = str3;
                        i56 = i56;
                        abstractC13921M39063 = abstractC13921M39063;
                        int i6116 = iM69813;
                        main10 = main4;
                        iM69813 = i6116;
                    }
                    i34 = i49;
                    c192513 = c192519;
                    i33 = i57;
                    main8 = mainM50612;
                    sArr10 = sArr13;
                    Main main110 = main10;
                    iM69813 = iM69813;
                    main4 = main110;
                    int iM256110 = C0630.m2566("ܽܶ") ^ i51;
                    int i6117 = i34;
                    i8 = ((iM256110 ^ i52) * 23315) ^ (-1539519205);
                    i54 = iM256110 ^ 2063220037;
                    sArr13 = sArr10;
                    mainM50612 = main8;
                    i57 = i33;
                    abstractC13921M39063 = abstractC13921M39063;
                    i63 = i63;
                    i58 = i58;
                    c192519 = c192513;
                    i49 = i6117;
                    c192518 = c192518;
                    str3 = str3;
                    i53 = i8;
                    int i6118 = iM69813;
                    main10 = main4;
                    iM69813 = i6118;
                    break;
                case -1080416490:
                case 1507961038:
                    c192516 = c192518;
                    c192517 = c192519;
                    mainM50612 = C22628.m50612(c16560);
                    if (zM11356) {
                        iM6987 = (i51 - C2105.m6981("֫ۙ")) * (-77);
                        i40 = ((iM6987 ^ i52) * (-9955)) ^ (-227227591);
                        i41 = 1718259701;
                    } else {
                        iM69811 = i55;
                        iM6987 = (i52 - C2105.m6981("ۛۢ")) * (-29);
                        i40 = ((iM6987 ^ i51) * (-2095)) ^ 701650922;
                        i41 = 700626128;
                    }
                    i54 = iM6987 ^ i41;
                    i53 = i40;
                    c192519 = c192517;
                    c192518 = c192516;
                    break;
                case -969243880:
                case 1966734766:
                    abstractC13921M39063 = abstractC13921M39063;
                    str3 = str3;
                    c192518 = c192518;
                    sArr9 = sArr12;
                    int i81 = i61;
                    int i82 = i63;
                    c192510 = c192519;
                    i58 = i58;
                    int i83 = i57;
                    Main main25 = mainM50612;
                    short[] sArr17 = sArr13;
                    Main main26 = main10;
                    iM69813 = iM69813;
                    main4 = main26;
                    if (C1128.m3839(c16561, str3)) {
                        iM6985 = C0630.m2566("᩷ܿ") ^ i52;
                        i21 = ((iM6985 ^ i51) * 87) ^ 157863768;
                        i32 = 179747176;
                    } else {
                        iM6985 = (C2105.m6981("ۧۚ") + i51) * (-115);
                        i21 = ((iM6985 ^ i52) * (-30819)) ^ 1643094578;
                        i32 = 186246551;
                    }
                    i54 = iM6985 ^ i32;
                    sArr13 = sArr17;
                    mainM50612 = main25;
                    i57 = i83;
                    i61 = i81;
                    i63 = i82;
                    sArr12 = sArr9;
                    i58 = i58;
                    c192519 = c192510;
                    c192518 = c192518;
                    str3 = str3;
                    i53 = i21;
                    abstractC13921M39063 = abstractC13921M39063;
                    int i6119 = iM69813;
                    main10 = main4;
                    iM69813 = i6119;
                    break;
                case -941760869:
                case 1976926069:
                    iM69811 = C2105.m6981(C3245.m9934(f63246, 329, 3, i64)) ^ 2129010812;
                    c192516 = c192518;
                    c192517 = c192519;
                    iM6987 = (i52 - C2105.m6981("ۛۢ")) * (-29);
                    i40 = ((iM6987 ^ i51) * (-2095)) ^ 701650922;
                    i41 = 700626128;
                    i54 = iM6987 ^ i41;
                    i53 = i40;
                    c192519 = c192517;
                    c192518 = c192516;
                    break;
                case -912728638:
                case 174649741:
                    m45013(c16561, interfaceC17889, ActivityC20212.class);
                    break;
                case -787514538:
                case 1572490493:
                    main10.m10217(i43, iM69813, z3);
                    break;
                case -711685098:
                case -150612956:
                    abstractC13921M39063 = abstractC13921M39063;
                    z2 = z3;
                    str3 = str3;
                    c192518 = c192518;
                    sArr7 = sArr12;
                    i28 = i61;
                    i29 = i63;
                    c192510 = c192519;
                    i58 = i58;
                    i30 = i57;
                    main7 = mainM50612;
                    sArr8 = sArr13;
                    Main main27 = main10;
                    iM69813 = iM69813;
                    main4 = main27;
                    if (C3746.m11356(c16561, str3)) {
                        iM25610 = C0630.m2566("֫ܿ") ^ i52;
                        i21 = ((iM25610 ^ i51) * (-30401)) ^ 570591183;
                        i31 = 1092443695;
                    } else {
                        iM25610 = C2105.m6981("֨۟") ^ i51;
                        i21 = ((iM25610 ^ i52) * 18643) ^ (-219800464);
                        i31 = 1126746100;
                    }
                    i54 = iM25610 ^ i31;
                    sArr13 = sArr8;
                    mainM50612 = main7;
                    i57 = i30;
                    i61 = i28;
                    i63 = i29;
                    sArr12 = sArr7;
                    z3 = z2;
                    i58 = i58;
                    c192519 = c192510;
                    c192518 = c192518;
                    str3 = str3;
                    i53 = i21;
                    abstractC13921M39063 = abstractC13921M39063;
                    int i61110 = iM69813;
                    main10 = main4;
                    iM69813 = i61110;
                    break;
                case -611715270:
                case -536668883:
                    break;
                case -610900428:
                case -455408517:
                    AbstractC13921 abstractC13923 = abstractC13921M39063;
                    boolean z5 = z3;
                    C19258 c192523 = c192518;
                    short[] sArr18 = sArr12;
                    int i84 = i61;
                    int i85 = i63;
                    C19258 c192524 = c192519;
                    int i86 = i58;
                    int i87 = i57;
                    Main main28 = mainM50612;
                    short[] sArr19 = sArr13;
                    Main main29 = main10;
                    iM69813 = iM69813;
                    main4 = main29;
                    i43 = iM6989 ^ 2101936001;
                    String strM2816 = C0714.m2816(f63246, 291, 5, i64);
                    int i88 = i56;
                    if (i86 == i88) {
                        iM2569 = C2105.m6981("ܰ۠") ^ i52;
                        i26 = ((iM2569 ^ i51) * 8465) ^ 913853623;
                        i27 = 554936395;
                    } else {
                        iM2569 = C0630.m2566("ۛ֫") ^ i51;
                        i26 = ((iM2569 ^ i52) * (-26057)) ^ (-68199201);
                        i27 = -1760869258;
                    }
                    i54 = iM2569 ^ i27;
                    i56 = i88;
                    sArr13 = sArr19;
                    mainM50612 = main28;
                    i57 = i87;
                    abstractC13921M39063 = abstractC13923;
                    i61 = i84;
                    i63 = i85;
                    sArr12 = sArr18;
                    i58 = i86;
                    c192519 = c192524;
                    c192518 = c192523;
                    str3 = strM2816;
                    i53 = i26;
                    z3 = z5;
                    int i61111 = iM69813;
                    main10 = main4;
                    iM69813 = i61111;
                    break;
                case -584987611:
                case 2137809707:
                    abstractC13921M39063 = abstractC13921M39063;
                    i56 = i56;
                    str3 = str3;
                    c192518 = c192518;
                    sArr5 = sArr12;
                    i23 = i61;
                    i24 = i63;
                    c192519 = c192519;
                    i58 = i58;
                    i25 = i57;
                    main6 = mainM50612;
                    sArr6 = sArr13;
                    Main main30 = main10;
                    iM69813 = iM69813;
                    main4 = main30;
                    int iM69823 = C2105.m6981(C4616.m13542(f63246, WhirlpoolDigest.REDUCTION_POLYNOMIAL, 3, i64));
                    if (RunnableC0588.m2441() >= 0) {
                        i45 = iM69823;
                        z3 = false;
                        int iM69824 = (C2105.m6981("ܿ۠") ^ i51) * (-93);
                        i54 = iM69824 ^ (-1684739268);
                        i53 = ((iM69824 ^ i52) * (-3903)) ^ 1765524386;
                        sArr13 = sArr6;
                        mainM50612 = main6;
                        i57 = i25;
                        i61 = i23;
                        i63 = i24;
                        sArr12 = sArr5;
                    } else {
                        int iM69825 = C2105.m6981("ۖ᩷") ^ i51;
                        i54 = iM69825 ^ 2239972;
                        i45 = iM69823;
                        i53 = ((iM69825 ^ i52) * (-26661)) ^ (-478885530);
                        sArr13 = sArr6;
                        mainM50612 = main6;
                        i57 = i25;
                        i61 = i23;
                        i63 = i24;
                        sArr12 = sArr5;
                        z3 = false;
                    }
                    i58 = i58;
                    c192519 = c192519;
                    c192518 = c192518;
                    str3 = str3;
                    i56 = i56;
                    abstractC13921M39063 = abstractC13921M39063;
                    int i61112 = iM69813;
                    main10 = main4;
                    iM69813 = i61112;
                    break;
                case -572255501:
                case -497966233:
                    C3537.m10746();
                    if (C4117.f13076 > 0) {
                        abstractC13921M39063 = abstractC13921M39063;
                        str3 = str3;
                        c192518 = c192518;
                        sArr11 = sArr12;
                        i35 = i61;
                        c192510 = c192519;
                        i58 = i58;
                        i36 = i57;
                        main9 = mainM50612;
                        i37 = i62;
                        Main main31 = main10;
                        iM69813 = iM69813;
                        main4 = main31;
                        int iM69826 = (C2105.m6981("ۡ᩷") + i51) * (-9);
                        sArr = sArr11;
                        i8 = ((iM69826 ^ i52) * (-7657)) ^ 1994029976;
                        i54 = iM69826 ^ (-119364434);
                        i61 = i35;
                        i62 = i37;
                        mainM50612 = main9;
                        i57 = i36;
                        abstractC13921M39063 = abstractC13921M39063;
                        sArr12 = sArr;
                        i58 = i58;
                        c192519 = c192510;
                        c192518 = c192518;
                        str3 = str3;
                        i53 = i8;
                        int i61113 = iM69813;
                        main10 = main4;
                        iM69813 = i61113;
                    }
                    abstractC13921M39063 = abstractC13921M39063;
                    z = z3;
                    iM6983 = i56;
                    str2 = str3;
                    c192511 = c192518;
                    sArr3 = sArr12;
                    i17 = i61;
                    i18 = i63;
                    c192512 = c192519;
                    i19 = i58;
                    i20 = i57;
                    main5 = mainM50612;
                    sArr4 = sArr13;
                    Main main32 = main10;
                    iM69813 = iM69813;
                    main4 = main32;
                    iM6984 = (i51 - C0630.m2566("ۧ᩹")) * (-125);
                    i21 = ((iM6984 ^ i52) * 1943) ^ 170142290;
                    i22 = 438353494;
                    i54 = iM6984 ^ i22;
                    sArr13 = sArr4;
                    mainM50612 = main5;
                    i57 = i20;
                    i61 = i17;
                    i63 = i18;
                    sArr12 = sArr3;
                    z3 = z;
                    i58 = i19;
                    c192519 = c192512;
                    c192518 = c192511;
                    str3 = str2;
                    i56 = iM6983;
                    i53 = i21;
                    abstractC13921M39063 = abstractC13921M39063;
                    int i61114 = iM69813;
                    main10 = main4;
                    iM69813 = i61114;
                    break;
                case -551917738:
                case 1568726536:
                    abstractC13921 = abstractC13921M39063;
                    str3 = str3;
                    c192518 = c192518;
                    c192510 = c192519;
                    i58 = i58;
                    i7 = i57;
                    main3 = mainM50612;
                    iM69813 = C2105.m6981(ServiceConnectionC3453.m10568(f63246, 311, 3, i64)) ^ 2099424796;
                    sArr = sArr12;
                    i5 = i61;
                    sArr2 = sArr13;
                    i6 = i63;
                    int iM69827 = (i51 - C2105.m6981("ᩳ᩸")) * 109;
                    i9 = ((iM69827 ^ i52) * (-15765)) ^ (-933411163);
                    i54 = iM69827 ^ 2102212625;
                    sArr13 = sArr2;
                    mainM50612 = main3;
                    i57 = i7;
                    i61 = i5;
                    i63 = i6;
                    sArr12 = sArr;
                    i58 = i58;
                    c192519 = c192510;
                    c192518 = c192518;
                    str3 = str3;
                    i53 = i9;
                    abstractC13921M39063 = abstractC13921;
                    break;
                case -495206239:
                case 1830541218:
                    C1504.m5179();
                    if (RunnableC3474.f10992 > 0) {
                        iM25611 = (i52 - C2105.m6981("ۘ᩶")) * (-93);
                        i4 = ((iM25611 ^ i51) * (-11341)) ^ (-1699443458);
                        i42 = -1333316145;
                    } else {
                        iM25611 = (i51 - C2105.m6981("۠ܽ")) * 9;
                        i4 = ((iM25611 ^ i52) * (-11635)) ^ 1351626498;
                        i42 = 1522129361;
                    }
                    i54 = iM25611 ^ i42;
                    i53 = i4;
                    break;
                case -414017531:
                case 1906689116:
                    C2272.m7514(c16561, interfaceC17889, new C23786(2, c16561));
                    break;
                case -412577474:
                case -30260435:
                    RunnableC1108.m3795(c16561, interfaceC17889, new C14422(c16561));
                    break;
                case -406575368:
                case 16516604:
                    abstractC13921 = abstractC13921M39063;
                    int i89 = i57;
                    Main main33 = mainM50613;
                    str = str3;
                    C19258 c192525 = c192518;
                    C19258 c192526 = c192519;
                    Main main34 = mainM50612;
                    int i90 = i58;
                    if (!C1128.m3839(c16561, str)) {
                        mainM50613 = main33;
                        int iM69828 = C2105.m6981("ۡᩴ") ^ i52;
                        i54 = iM69828 ^ (-1385789808);
                        i58 = i90;
                        c192519 = c192526;
                        c192518 = c192525;
                        str3 = str;
                        i53 = ((iM69828 ^ i51) * (-29935)) ^ 480552014;
                        mainM50612 = main34;
                        i57 = i89;
                        abstractC13921M39063 = abstractC13921;
                    } else {
                        int iM69829 = C2105.m6981("ۢ֫") ^ i52;
                        mainM50613 = main33;
                        i4 = ((iM69829 ^ i51) * 32205) ^ (-191068144);
                        i54 = iM69829 ^ (-1119160476);
                        i58 = i90;
                        mainM50612 = main34;
                        c192519 = c192526;
                        i57 = i89;
                        c192518 = c192525;
                        abstractC13921M39063 = abstractC13921;
                        str3 = str;
                        i53 = i4;
                    }
                    break;
                case -330365889:
                case 823493300:
                    C7811.m20844();
                    if (C0714.f2697 < 0) {
                        abstractC13921M39063 = abstractC13921M39063;
                        z3 = z3;
                        i56 = i56;
                        str3 = str3;
                        c192518 = c192518;
                        sArr12 = sArr12;
                        i61 = i61;
                        i63 = i63;
                        c192519 = c192519;
                        i58 = i58;
                        i57 = i57;
                        mainM50612 = mainM50612;
                        sArr13 = sArr13;
                        Main main35 = main10;
                        iM69813 = iM69813;
                        main4 = main35;
                        int iM25620 = (C0630.m2566("ۙ֨") ^ i52) * 83;
                        i54 = iM25620 ^ (-693355752);
                        i53 = ((iM25620 ^ i51) * 15943) ^ 1970546865;
                        sArr13 = sArr13;
                        mainM50612 = mainM50612;
                        i57 = i57;
                        i61 = i61;
                        i63 = i63;
                        sArr12 = sArr12;
                        z3 = z3;
                        c16561 = c16560;
                        i58 = i58;
                        c192519 = c192519;
                        c192518 = c192518;
                        str3 = str3;
                        i56 = i56;
                        abstractC13921M39063 = abstractC13921M39063;
                        int i61115 = iM69813;
                        main10 = main4;
                        iM69813 = i61115;
                    } else {
                        iM25611 = (i52 - C2105.m6981("ۘ᩶")) * (-93);
                        i4 = ((iM25611 ^ i51) * (-11341)) ^ (-1699443458);
                        i42 = -1333316145;
                        i54 = iM25611 ^ i42;
                        i53 = i4;
                    }
                    break;
                case -313998452:
                case 1238232448:
                    C19258 c19258M5912 = C1773.m5912(C22628.m50612(c16560));
                    int i91 = i59;
                    C3432.m10490(c19258M5912, i91);
                    c192519 = c192519;
                    int iM25621 = C0630.m2566(ViewOnClickListenerC1958.m6435(f63246, 323, 3, i64));
                    i48 = 2126428102;
                    if (C1294.m4372() <= 0) {
                        abstractC13921M39063 = abstractC13921M39063;
                        i56 = i56;
                        i58 = i58;
                        str3 = str3;
                        c192518 = c19258M5912;
                        i59 = i91;
                        sArr5 = sArr12;
                        i23 = i61;
                        i24 = i63;
                        i47 = iM25621;
                        i25 = i57;
                        main6 = mainM50612;
                        sArr6 = sArr13;
                        Main main36 = main10;
                        iM69813 = iM69813;
                        main4 = main36;
                        int iM698210 = (C2105.m6981("ܿ۠") ^ i51) * (-93);
                        i54 = iM698210 ^ (-1684739268);
                        i53 = ((iM698210 ^ i52) * (-3903)) ^ 1765524386;
                        sArr13 = sArr6;
                        mainM50612 = main6;
                        i57 = i25;
                        i61 = i23;
                        i63 = i24;
                        sArr12 = sArr5;
                        i58 = i58;
                        c192519 = c192519;
                        c192518 = c192518;
                        str3 = str3;
                        i56 = i56;
                        abstractC13921M39063 = abstractC13921M39063;
                        int i61116 = iM69813;
                        main10 = main4;
                        iM69813 = i61116;
                    } else {
                        int iM25622 = (i51 - C0630.m2566("᩹ܰ")) * (-25);
                        i54 = iM25622 ^ 278602609;
                        i47 = iM25621;
                        i53 = ((iM25622 ^ i52) * 29057) ^ 22166836;
                        c192519 = c192519;
                        c192518 = c19258M5912;
                        i59 = i91;
                    }
                    break;
                case -255525214:
                case 657959212:
                    mainM50614 = C22628.m50612(c16560);
                    if (zM11356) {
                        iM25611 = C0630.m2566("᩵ܰ") ^ i52;
                        i4 = ((iM25611 ^ i51) * (-25267)) ^ (-198155714);
                        i42 = 875686477;
                    } else {
                        iM69812 = i55;
                        iM25611 = (C0630.m2566("ۖۘ") ^ i51) * (-67);
                        i4 = ((iM25611 ^ i52) * 5623) ^ 340343211;
                        i42 = 1549310440;
                    }
                    i54 = iM25611 ^ i42;
                    i53 = i4;
                    break;
                case -68053794:
                case 436850270:
                    str = str3;
                    C19258 c192527 = c192518;
                    c192514 = c192519;
                    if (!C1128.m3839(c16561, str)) {
                        int iM69830 = C2105.m6981("ۧ֨") ^ i51;
                        i54 = iM69830 ^ 89008869;
                        c192515 = c192527;
                        str3 = str;
                        i53 = ((iM69830 ^ i52) * 14513) ^ (-1817129622);
                        c192519 = c192514;
                        c192518 = c192515;
                    } else {
                        int iM25623 = C0630.m2566("ۘ᩺") ^ i52;
                        c19258 = c192527;
                        i4 = ((iM25623 ^ i51) * 25709) ^ 1424320898;
                        i54 = iM25623 ^ 1869447487;
                        c192519 = c192514;
                        c192518 = c19258;
                        str3 = str;
                        i53 = i4;
                    }
                    break;
                case 194883417:
                case 480970236:
                    break;
                case 206807504:
                case 734818988:
                    main4 = main10;
                    i64 = 63963;
                    iM2567 = (C0630.m2566("᩹ܺ") ^ i51) * 57;
                    i11 = ((iM2567 ^ i52) * (-23873)) ^ (-2008104516);
                    i12 = -47016979;
                    i54 = iM2567 ^ i12;
                    c16561 = c16560;
                    i53 = i11;
                    sArr13 = sArr13;
                    mainM50612 = mainM50612;
                    i57 = i57;
                    i61 = i61;
                    i63 = i63;
                    sArr12 = sArr12;
                    z3 = z3;
                    i58 = i58;
                    c192519 = c192519;
                    c192518 = c192518;
                    str3 = str3;
                    i56 = i56;
                    abstractC13921M39063 = abstractC13921M39063;
                    int i61117 = iM69813;
                    main10 = main4;
                    iM69813 = i61117;
                    break;
                case 365787149:
                case 827445852:
                    C22628.m50615();
                    if (C21923.f70183 == 0) {
                        abstractC13921M39063 = abstractC13921M39063;
                        z3 = z3;
                        i56 = i56;
                        str3 = str3;
                        c192518 = c192518;
                        sArr12 = sArr12;
                        i61 = i61;
                        i63 = i63;
                        c192519 = c192519;
                        i58 = i58;
                        i57 = i57;
                        mainM50612 = mainM50612;
                        sArr13 = sArr13;
                        Main main37 = main10;
                        iM69813 = iM69813;
                        main4 = main37;
                        iM2567 = (C2105.m6981("ۚ֫") ^ i52) * (-29);
                        i11 = ((iM2567 ^ i51) * 15787) ^ 1178097079;
                        i12 = 564790230;
                        i54 = iM2567 ^ i12;
                        c16561 = c16560;
                        i53 = i11;
                        sArr13 = sArr13;
                        mainM50612 = mainM50612;
                        i57 = i57;
                        i61 = i61;
                        i63 = i63;
                        sArr12 = sArr12;
                        z3 = z3;
                        i58 = i58;
                        c192519 = c192519;
                        c192518 = c192518;
                        str3 = str3;
                        i56 = i56;
                        abstractC13921M39063 = abstractC13921M39063;
                        int i61118 = iM69813;
                        main10 = main4;
                        iM69813 = i61118;
                    }
                    abstractC13921M39063 = abstractC13921M39063;
                    z3 = z3;
                    i56 = i56;
                    str3 = str3;
                    c192518 = c192518;
                    sArr12 = sArr12;
                    i61 = i61;
                    i63 = i63;
                    c192519 = c192519;
                    i58 = i58;
                    i57 = i57;
                    mainM50612 = mainM50612;
                    sArr13 = sArr13;
                    Main main38 = main10;
                    iM69813 = iM69813;
                    main4 = main38;
                    int iM25624 = (C0630.m2566("ۙ֨") ^ i52) * 83;
                    i54 = iM25624 ^ (-693355752);
                    i53 = ((iM25624 ^ i51) * 15943) ^ 1970546865;
                    sArr13 = sArr13;
                    mainM50612 = mainM50612;
                    i57 = i57;
                    i61 = i61;
                    i63 = i63;
                    sArr12 = sArr12;
                    z3 = z3;
                    c16561 = c16560;
                    i58 = i58;
                    c192519 = c192519;
                    c192518 = c192518;
                    str3 = str3;
                    i56 = i56;
                    abstractC13921M39063 = abstractC13921M39063;
                    int i61119 = iM69813;
                    main10 = main4;
                    iM69813 = i61119;
                    break;
                case 474425554:
                case 1908266720:
                    abstractC13921M39063 = abstractC13921M39063;
                    boolean z6 = z3;
                    i56 = i56;
                    int i92 = i57;
                    str3 = str3;
                    c192518 = c192518;
                    short[] sArr20 = sArr12;
                    int i93 = i61;
                    int i94 = i63;
                    c192519 = c192519;
                    Main main39 = mainM50612;
                    short[] sArr21 = sArr13;
                    Main main40 = main10;
                    iM69813 = iM69813;
                    main4 = main40;
                    int iM942 = C0050.m942(num);
                    if (iM942 == (C0630.m2566(C3537.m10748(f63246, 276, 3, i64)) ^ 2128726026)) {
                        iM6982 = C2105.m6981("᩵۠") ^ i51;
                        i13 = ((iM6982 ^ i52) * (-12199)) ^ (-700024630);
                        i14 = 1792460154;
                    } else {
                        iM6982 = (C2105.m6981("ۛۧ") ^ i52) * (-87);
                        i13 = ((iM6982 ^ i51) * (-23257)) ^ 487814441;
                        i14 = -1028963283;
                    }
                    i54 = iM6982 ^ i14;
                    sArr13 = sArr21;
                    mainM50612 = main39;
                    i57 = i92;
                    i61 = i93;
                    i63 = i94;
                    sArr12 = sArr20;
                    z3 = z6;
                    i58 = iM942;
                    i53 = i13;
                    c192519 = c192519;
                    c192518 = c192518;
                    str3 = str3;
                    i56 = i56;
                    abstractC13921M39063 = abstractC13921M39063;
                    int i611110 = iM69813;
                    main10 = main4;
                    iM69813 = i611110;
                    break;
                case 576429037:
                case 1303076487:
                    abstractC13921M39063 = abstractC13921M39063;
                    z3 = z3;
                    i56 = i56;
                    String str5 = str3;
                    c192518 = c192518;
                    sArr12 = sArr12;
                    i61 = i61;
                    i63 = i63;
                    c192519 = c192519;
                    i58 = i58;
                    i57 = i57;
                    mainM50612 = mainM50612;
                    sArr13 = sArr13;
                    Main main41 = main10;
                    iM69813 = iM69813;
                    main4 = main41;
                    i55 = i45 ^ 2128612951;
                    str3 = str5;
                    iM6989 = C2105.m6981(ViewOnClickListenerC1958.m6435(f63246, 288, 3, i64));
                    if (C1420.m4913()) {
                        iM2568 = (i52 - C2105.m6981("ܿۨ")) * (-105);
                        i15 = ((iM2568 ^ i51) * (-12987)) ^ (-1253356045);
                        i16 = 1421048273;
                    } else {
                        iM2568 = (C2105.m6981("᩷ܳ") ^ i52) * (-47);
                        i15 = ((iM2568 ^ i51) * 14827) ^ 1161152492;
                        i16 = -1073716363;
                    }
                    i54 = iM2568 ^ i16;
                    i53 = i15;
                    sArr13 = sArr13;
                    mainM50612 = mainM50612;
                    i57 = i57;
                    i61 = i61;
                    i63 = i63;
                    sArr12 = sArr12;
                    z3 = z3;
                    i58 = i58;
                    c192519 = c192519;
                    c192518 = c192518;
                    str3 = str3;
                    i56 = i56;
                    abstractC13921M39063 = abstractC13921M39063;
                    int i611111 = iM69813;
                    main10 = main4;
                    iM69813 = i611111;
                    break;
                case 593259117:
                case 1632709035:
                    abstractC13921 = abstractC13921M39063;
                    iM69813 = iM69813;
                    str3 = str3;
                    c192518 = c192518;
                    sArr = sArr12;
                    i5 = i61;
                    i6 = i63;
                    c192510 = c192519;
                    i58 = i58;
                    i7 = i57;
                    main3 = mainM50612;
                    sArr2 = sArr13;
                    Main mainM50615 = C22628.m50612(c16560);
                    if (!zM11356) {
                        main10 = mainM50615;
                        iM69813 = i55;
                        int iM698211 = (i51 - C2105.m6981("ᩳ᩸")) * 109;
                        i9 = ((iM698211 ^ i52) * (-15765)) ^ (-933411163);
                        i54 = iM698211 ^ 2102212625;
                        sArr13 = sArr2;
                        mainM50612 = main3;
                        i57 = i7;
                        i61 = i5;
                        i63 = i6;
                        sArr12 = sArr;
                        i58 = i58;
                        c192519 = c192510;
                        c192518 = c192518;
                        str3 = str3;
                        i53 = i9;
                        abstractC13921M39063 = abstractC13921;
                    } else {
                        int iM69831 = (i52 - C2105.m6981("ۨۧ")) * 123;
                        main4 = mainM50615;
                        i8 = ((iM69831 ^ i51) * 6905) ^ 772932604;
                        i54 = iM69831 ^ (-1546282740);
                        sArr13 = sArr2;
                        mainM50612 = main3;
                        i57 = i7;
                        abstractC13921M39063 = abstractC13921;
                        i61 = i5;
                        i63 = i6;
                        sArr12 = sArr;
                        i58 = i58;
                        c192519 = c192510;
                        c192518 = c192518;
                        str3 = str3;
                        i53 = i8;
                        int i611112 = iM69813;
                        main10 = main4;
                        iM69813 = i611112;
                    }
                    break;
                case 616479236:
                case 1960441802:
                    abstractC13921M39063 = abstractC13921M39063;
                    z3 = z3;
                    i56 = i56;
                    str3 = str3;
                    c192518 = c192518;
                    sArr12 = sArr12;
                    i61 = i61;
                    i63 = i63;
                    c192519 = c192519;
                    i58 = i58;
                    i57 = i57;
                    mainM50612 = mainM50612;
                    sArr13 = sArr13;
                    Main main42 = main10;
                    iM69813 = iM69813;
                    main4 = main42;
                    if (i58 == (C2105.m6981(C5695.m16034(f63246, 279, 3, i64)) ^ 2122703658)) {
                        iM2568 = (C2105.m6981("ᩳۤ") ^ i51) * (-59);
                        i15 = ((iM2568 ^ i52) * (-21303)) ^ (-1526085241);
                        i16 = 1089965368;
                    } else {
                        iM2568 = C0630.m2566("ۗ֡") ^ i52;
                        i15 = ((iM2568 ^ i51) * (-9537)) ^ (-1050609003);
                        i16 = -750693060;
                    }
                    i54 = iM2568 ^ i16;
                    i53 = i15;
                    sArr13 = sArr13;
                    mainM50612 = mainM50612;
                    i57 = i57;
                    i61 = i61;
                    i63 = i63;
                    sArr12 = sArr12;
                    z3 = z3;
                    i58 = i58;
                    c192519 = c192519;
                    c192518 = c192518;
                    str3 = str3;
                    i56 = i56;
                    abstractC13921M39063 = abstractC13921M39063;
                    int i611113 = iM69813;
                    main10 = main4;
                    iM69813 = i611113;
                    break;
                case 667307387:
                case 1284267775:
                    abstractC13921M39063 = abstractC13921M39063;
                    z = z3;
                    str2 = str3;
                    c192511 = c192518;
                    sArr3 = sArr12;
                    i17 = i61;
                    i18 = i63;
                    c192512 = c192519;
                    i19 = i58;
                    i20 = i57;
                    main5 = mainM50612;
                    sArr4 = sArr13;
                    Main main43 = main10;
                    iM69813 = iM69813;
                    main4 = main43;
                    iM6983 = C2105.m6981(C1047.m3603(f63246, 282, 3, i64)) ^ 2119941361;
                    if (C21923.f70183 != 0) {
                        iM6984 = (i51 - C0630.m2566("ۧ᩹")) * (-125);
                        i21 = ((iM6984 ^ i52) * 1943) ^ 170142290;
                        i22 = 438353494;
                    } else {
                        iM6984 = (C2105.m6981("ۤ֡") + i52) * 11;
                        i21 = ((iM6984 ^ i51) * (-21225)) ^ (-2274332);
                        i22 = -21847067;
                    }
                    i54 = iM6984 ^ i22;
                    sArr13 = sArr4;
                    mainM50612 = main5;
                    i57 = i20;
                    i61 = i17;
                    i63 = i18;
                    sArr12 = sArr3;
                    z3 = z;
                    i58 = i19;
                    c192519 = c192512;
                    c192518 = c192511;
                    str3 = str2;
                    i56 = iM6983;
                    i53 = i21;
                    abstractC13921M39063 = abstractC13921M39063;
                    int i611114 = iM69813;
                    main10 = main4;
                    iM69813 = i611114;
                    break;
                case 925438309:
                case 1256720713:
                    str3 = str3;
                    c192518 = c192518;
                    c192510 = c192519;
                    abstractC13921 = abstractC13921M39063;
                    i58 = i58;
                    if (i58 == (C2105.m6981(C7106.m19110(f63246, 320, 3, i64)) ^ 2123652940)) {
                        iM6981 = C2105.m6981("ܿᩴ") ^ i52;
                        i9 = ((iM6981 ^ i51) * 12639) ^ 241865427;
                        i10 = 910171300;
                    } else {
                        iM6981 = (i51 - C2105.m6981("֫ܶ")) * (-115);
                        i9 = ((iM6981 ^ i52) * (-17247)) ^ (-1548841199);
                        i10 = -2007835776;
                    }
                    i54 = iM6981 ^ i10;
                    i58 = i58;
                    c192519 = c192510;
                    c192518 = c192518;
                    str3 = str3;
                    i53 = i9;
                    abstractC13921M39063 = abstractC13921;
                    break;
                case 1290976068:
                case 1349696108:
                    abstractC13921M39063 = abstractC13921M39063;
                    z3 = z3;
                    i56 = i56;
                    str3 = str3;
                    c192518 = c192518;
                    sArr12 = sArr12;
                    i61 = i61;
                    i63 = i63;
                    c192519 = c192519;
                    i58 = i58;
                    i57 = i57;
                    mainM50612 = mainM50612;
                    sArr13 = sArr13;
                    Main main44 = main10;
                    iM69813 = iM69813;
                    main4 = main44;
                    zM11356 = C3746.m11356(c16561, C0798.m3005(f63246, 273, 3, i64));
                    dialogInterface.dismiss();
                    num = (Integer) C3537.m10755(arrayList, i);
                    if (C3746.f11829 <= 0) {
                        int iM25625 = (C0630.m2566("ۙ֨") ^ i52) * 83;
                        i54 = iM25625 ^ (-693355752);
                        i53 = ((iM25625 ^ i51) * 15943) ^ 1970546865;
                        sArr13 = sArr13;
                        mainM50612 = mainM50612;
                        i57 = i57;
                        i61 = i61;
                        i63 = i63;
                        sArr12 = sArr12;
                        z3 = z3;
                        c16561 = c16560;
                    } else {
                        iM2567 = C0630.m2566("֨۫") ^ i51;
                        i11 = ((iM2567 ^ i52) * 30529) ^ (-750398092);
                        i12 = 1405368523;
                        i54 = iM2567 ^ i12;
                        c16561 = c16560;
                        i53 = i11;
                        sArr13 = sArr13;
                        mainM50612 = mainM50612;
                        i57 = i57;
                        i61 = i61;
                        i63 = i63;
                        sArr12 = sArr12;
                        z3 = z3;
                    }
                    i58 = i58;
                    c192519 = c192519;
                    c192518 = c192518;
                    str3 = str3;
                    i56 = i56;
                    abstractC13921M39063 = abstractC13921M39063;
                    int i611115 = iM69813;
                    main10 = main4;
                    iM69813 = i611115;
                    break;
                case 1453273182:
                case 1705834937:
                    mainM50613.m10217(i43, i57, z3);
                    break;
                case 1554854203:
                case 1928308979:
                    abstractC13921M39063 = abstractC13921M39063;
                    String str6 = str3;
                    c192518 = c192518;
                    sArr12 = sArr12;
                    i61 = i61;
                    i63 = i63;
                    c192519 = c192519;
                    i58 = i58;
                    i57 = i57;
                    mainM50612 = mainM50612;
                    sArr13 = sArr13;
                    Main main45 = main10;
                    iM69813 = iM69813;
                    main4 = main45;
                    int iM69832 = C2105.m6981(C4616.m13542(f63246, 302, 3, i64));
                    if (C1047.m3599() >= 0) {
                        i46 = iM69832;
                        z3 = z3;
                        i56 = i56;
                        obj = null;
                        str3 = str6;
                        iM2568 = (i52 - C2105.m6981("ܿۨ")) * (-105);
                        i15 = ((iM2568 ^ i51) * (-12987)) ^ (-1253356045);
                        i16 = 1421048273;
                        i54 = iM2568 ^ i16;
                        i53 = i15;
                        sArr13 = sArr13;
                        mainM50612 = mainM50612;
                        i57 = i57;
                        i61 = i61;
                        i63 = i63;
                        sArr12 = sArr12;
                        z3 = z3;
                        i58 = i58;
                        c192519 = c192519;
                        c192518 = c192518;
                        str3 = str3;
                        i56 = i56;
                        abstractC13921M39063 = abstractC13921M39063;
                    } else {
                        int iM25626 = C0630.m2566("ܶᩳ") ^ i52;
                        int i95 = ((iM25626 ^ i51) * 12339) ^ (-453595004);
                        i54 = iM25626 ^ 1587000160;
                        i46 = iM69832;
                        sArr13 = sArr13;
                        mainM50612 = mainM50612;
                        i57 = i57;
                        abstractC13921M39063 = abstractC13921M39063;
                        i61 = i61;
                        i63 = i63;
                        sArr12 = sArr12;
                        i58 = i58;
                        c192519 = c192519;
                        c192518 = c192518;
                        str3 = str6;
                        i53 = i95;
                        obj = null;
                    }
                    int i611116 = iM69813;
                    main10 = main4;
                    iM69813 = i611116;
                    break;
                case 1702188546:
                case 2123556402:
                    mainM50612.m10217(i43, iM69811, z3);
                    break;
                default:
                    abstractC13921 = abstractC13921M39063;
                    str = str3;
                    c19258 = c192518;
                    c19259 = c192519;
                    i3 = i58;
                    main = mainM50612;
                    iM2566 = C0630.m2566(RunnableC3474.m10633(f63246, 317, 3, i64)) ^ 2124213659;
                    i2 = iM69813;
                    main2 = main10;
                    int iM698110 = (i52 - C2105.m6981("ۛ۬")) * 11;
                    int i620 = iM2566;
                    int i621 = ((iM698110 ^ i51) * 2603) ^ 1229831923;
                    i54 = iM698110 ^ (-463003923);
                    i58 = i3;
                    mainM50612 = main;
                    c192519 = c19259;
                    i57 = i620;
                    c192518 = c19258;
                    str3 = str;
                    i53 = i621;
                    main10 = main2;
                    iM69813 = i2;
                    abstractC13921M39063 = abstractC13921;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45003(AbstractActivityC3346 abstractActivityC3346, byte[] bArr) {
        short[] sArr;
        TextView textView;
        String str;
        int iM2566;
        int i;
        int i2;
        View view;
        short[] sArr2;
        TextView textView2;
        String str2;
        int i3;
        short[] sArr3;
        int i4;
        short[] sArr4;
        int i5;
        int i6;
        int iM2567;
        int i7;
        int i8;
        int i9;
        View viewM10739;
        int i10;
        int iM6981;
        int i11;
        int iM2568;
        int i12;
        int i13;
        String str3 = null;
        int i14 = 483758826;
        int i15 = C1773.f6144;
        int i16 = C5695.f17556;
        int iM6982 = (i16 - C2105.m6981("۫۬")) * (-77);
        int i17 = ((iM6982 ^ i15) * 25517) ^ 237802952;
        int i18 = iM6982 ^ 1188459405;
        TextView textView3 = null;
        TextView textView4 = null;
        TextView textView5 = null;
        TextView textView6 = null;
        C19258 c19258M2130 = null;
        Object obj = null;
        String strM5726 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        int i19 = 0;
        View view2 = null;
        int i20 = 0;
        int iM31408 = 0;
        int iM6983 = 0;
        int iM6984 = 0;
        int iM6985 = 0;
        int iM2569 = 0;
        int iM25610 = 0;
        int iM6986 = 0;
        int i21 = 0;
        int iM25611 = 0;
        int i22 = 0;
        int iM6987 = 0;
        short s = 0;
        int i23 = 0;
        C12918 c12918 = null;
        int i24 = 0;
        String str4 = null;
        int i25 = 0;
        short[] sArr7 = null;
        while (true) {
            String strM1962 = str3;
            while (true) {
                sArr = sArr7;
                while (true) {
                    i14 = i18 ^ (i17 & (((i14 ^ i15) * (-25819)) >> 31));
                    switch (i14) {
                        case -2104327261:
                        case -528765041:
                            view = view2;
                            sArr2 = sArr;
                            textView2 = textView3;
                            str2 = strM1962;
                            i3 = i24;
                            sArr3 = sArr6;
                            i4 = i25;
                            sArr4 = sArr5;
                            short s2 = f63246[241];
                            int i26 = s2 + 261;
                            i23 = i26 * i26;
                            int iM6988 = (C2105.m6981("᩻᩸") + i15) * (-35);
                            i5 = ((iM6988 ^ i16) * (-28139)) ^ (-1681843783);
                            i6 = iM6988 ^ 687115371;
                            s = s2;
                            sArr5 = sArr4;
                            sArr6 = sArr3;
                            i25 = i4;
                            i24 = i3;
                            strM1962 = str2;
                            textView3 = textView2;
                            sArr = sArr2;
                            i18 = i6;
                            i17 = i5;
                            view2 = view;
                            break;
                        case -2049888088:
                        case 1703594834:
                            sArr = sArr;
                            textView = textView4;
                            str = strM1962;
                            C7811.m20840(textView, str);
                            sArr6 = f63246;
                            i20 = 3;
                            if (C0630.f2410 <= 0) {
                                i25 = 251;
                                int iM6989 = C2105.m6981("ۨۢ") ^ i15;
                                strM1962 = str;
                                sArr = sArr;
                                i18 = iM6989 ^ 1610938577;
                                TextView textView7 = textView;
                                i17 = ((iM6989 ^ i16) * (-16791)) ^ 714952891;
                                sArr6 = sArr6;
                                textView4 = textView7;
                            } else {
                                int iM25612 = C0630.m2566("ܺᩳ") ^ i16;
                                textView4 = textView;
                                i17 = ((iM25612 ^ i15) * 3913) ^ (-1676180528);
                                strM1962 = str;
                                sArr = sArr;
                                i25 = 251;
                                i18 = iM25612 ^ (-523232384);
                            }
                            break;
                        case -1621416142:
                        case -1375458035:
                            ViewOnClickListenerC1958.m6441(c19258M2130, iM6984, obj);
                            iM6985 = C2105.m6981(C2126.m7036(f63246, 269, 3, i19)) ^ 2129385567;
                            iM2568 = (C2105.m6981("۬ۤ") + i15) * 31;
                            i12 = ((iM2568 ^ i16) * (-8593)) ^ 1134436303;
                            i13 = -1648330423;
                            i18 = iM2568 ^ i13;
                            i17 = i12;
                            break;
                        case -1512863895:
                        case 378842144:
                            C4616.m13548((TextView) C1005.m3507(view2, iM6983), C0050.m935(c12918.m31421()));
                            c19258M2130 = C0483.m2130(abstractActivityC3346);
                            C0798.m3013(c19258M2130, view2);
                            sArr = f63246;
                            iM2568 = C2105.m6981("֡᩵") ^ i16;
                            i12 = ((iM2568 ^ i15) * 15183) ^ (-810806355);
                            i13 = 55656146;
                            i18 = iM2568 ^ i13;
                            i17 = i12;
                            break;
                        case -1483435523:
                        case 129835395:
                            sArr = sArr;
                            C4616.m13548((TextView) C11340.m28028(view2, iM25611 ^ i22), C0050.m935(c12918.m31396()));
                            if (C3683.f11629 < 0) {
                                iM2566 = (C0630.m2566("᩷ۙ") ^ i15) * (-83);
                                i = ((iM2566 ^ i16) * (-4985)) ^ (-1456024925);
                                i2 = -1814975693;
                                sArr7 = sArr;
                                i18 = iM2566 ^ i2;
                                i17 = i;
                            }
                            viewM10739 = view2;
                            textView3 = textView3;
                            strM1962 = strM1962;
                            sArr6 = sArr6;
                            i9 = i25;
                            int iM69810 = C2105.m6981("ܳܺ") ^ i16;
                            sArr5 = sArr5;
                            sArr6 = sArr6;
                            i25 = i9;
                            i24 = i24;
                            strM1962 = strM1962;
                            textView3 = textView3;
                            sArr = sArr;
                            i18 = iM69810 ^ 1491946541;
                            i17 = ((iM69810 ^ i15) * (-4257)) ^ (-1357115516);
                            view2 = viewM10739;
                            c12918 = null;
                            break;
                        case -1454200758:
                        case -152832002:
                            i19 = 16356;
                            iM2567 = (C0630.m2566("֡֡") ^ i15) * 59;
                            i17 = ((iM2567 ^ i16) * 27739) ^ (-79688813);
                            i7 = 213601063;
                            i8 = iM2567 ^ i7;
                            sArr5 = sArr5;
                            i25 = i25;
                            view2 = view2;
                            i24 = i24;
                            strM1962 = strM1962;
                            sArr = sArr;
                            i18 = i8;
                            sArr6 = sArr6;
                            textView3 = textView3;
                            break;
                        case -1286386228:
                        case 1348418757:
                            view2 = view2;
                            sArr = sArr;
                            textView3 = textView3;
                            strM1962 = strM1962;
                            i24 = i24;
                            sArr6 = sArr6;
                            i25 = i25;
                            sArr5 = sArr5;
                            int i27 = (s * s) + 68121;
                            if ((i27 + i27) - i23 >= 0) {
                                iM2567 = C2105.m6981("᩸ۙ") ^ i16;
                                i17 = ((iM2567 ^ i15) * 32187) ^ (-1444071948);
                                i7 = 467135688;
                            } else {
                                iM2567 = (C0630.m2566("ۚܺ") ^ i16) * 93;
                                i17 = ((iM2567 ^ i15) * (-25807)) ^ 106723989;
                                i7 = -888020156;
                            }
                            i8 = iM2567 ^ i7;
                            sArr5 = sArr5;
                            i25 = i25;
                            view2 = view2;
                            i24 = i24;
                            strM1962 = strM1962;
                            sArr = sArr;
                            i18 = i8;
                            sArr6 = sArr6;
                            textView3 = textView3;
                            break;
                        case -1276112218:
                        case 1965074778:
                            iM6983 = C2105.m6981(C1916.m6311(f63246, 263, 3, i19)) ^ 2101981974;
                            if (C3432.m10477() <= 0) {
                                iM2568 = C2105.m6981("ᩴᩳ") ^ i15;
                                i12 = ((iM2568 ^ i16) * (-22149)) ^ 764478265;
                                i13 = 2090562506;
                            } else {
                                iM2568 = C2105.m6981("᩺ۛ") ^ i15;
                                i12 = ((iM2568 ^ i16) * (-19769)) ^ (-1342767799);
                                i13 = -1955734210;
                            }
                            i18 = iM2568 ^ i13;
                            i17 = i12;
                            break;
                        case -1271009368:
                        case 1073013672:
                            sArr = sArr;
                            textView6 = (TextView) C11340.m28028(view2, iM6987 ^ 2130269910);
                            if (C0050.f910 < 0) {
                                iM2566 = C0630.m2566("᩸ۧ") ^ i15;
                                i = ((iM2566 ^ i16) * (-7129)) ^ (-305402638);
                                i2 = 258432683;
                                sArr7 = sArr;
                                i18 = iM2566 ^ i2;
                                i17 = i;
                            }
                            textView = textView4;
                            str = strM1962;
                            int iM69811 = C2105.m6981("ۨۢ") ^ i15;
                            strM1962 = str;
                            sArr = sArr;
                            i18 = iM69811 ^ 1610938577;
                            TextView textView8 = textView;
                            i17 = ((iM69811 ^ i16) * (-16791)) ^ 714952891;
                            sArr6 = sArr6;
                            textView4 = textView8;
                            break;
                        case -1243968995:
                        case 1100388835:
                            C1504.m5179();
                            if (C3019.f9544 >= 0) {
                                iM2568 = C2105.m6981("ᩴᩳ") ^ i15;
                                i12 = ((iM2568 ^ i16) * (-22149)) ^ 764478265;
                                i13 = 2090562506;
                                i18 = iM2568 ^ i13;
                                i17 = i12;
                            } else {
                                sArr = sArr;
                                textView = textView4;
                                str = strM1962;
                                int iM69812 = C2105.m6981("ۨۢ") ^ i15;
                                strM1962 = str;
                                sArr = sArr;
                                i18 = iM69812 ^ 1610938577;
                                TextView textView9 = textView;
                                i17 = ((iM69812 ^ i16) * (-16791)) ^ 714952891;
                                sArr6 = sArr6;
                                textView4 = textView9;
                            }
                            break;
                        case -1222818308:
                        case 315617391:
                            ViewOnClickListenerC1958.m6429();
                            if (C3663.m11168() >= 0) {
                                sArr = sArr;
                                iM2566 = (C0630.m2566("ۙۙ") + i16) * 25;
                                i = ((iM2566 ^ i15) * (-14771)) ^ 1305060685;
                                i2 = 1057633924;
                                sArr7 = sArr;
                                i18 = iM2566 ^ i2;
                                i17 = i;
                            }
                            sArr = sArr;
                            textView = textView4;
                            str = strM1962;
                            int iM69813 = C2105.m6981("ۨۢ") ^ i15;
                            strM1962 = str;
                            sArr = sArr;
                            i18 = iM69813 ^ 1610938577;
                            TextView textView10 = textView;
                            i17 = ((iM69813 ^ i16) * (-16791)) ^ 714952891;
                            sArr6 = sArr6;
                            textView4 = textView10;
                            break;
                        case -1101519287:
                        case 832991888:
                            sArr2 = sArr;
                            textView2 = textView3;
                            str2 = strM1962;
                            sArr3 = sArr6;
                            i4 = i25;
                            view = view2;
                            sArr4 = sArr5;
                            i10 = i24;
                            iM25610 = C0630.m2566(C0382.m1840(sArr4, i10, 3, i19));
                            if (C2126.f7087) {
                                iM6981 = C0630.m2566("ۚۤ") ^ i16;
                                i3 = i10;
                                i5 = ((iM6981 ^ i15) * (-17935)) ^ 22421416;
                                i11 = -521358;
                            } else {
                                i3 = i10;
                                iM6981 = C2105.m6981("֫ۙ") ^ i16;
                                i5 = ((iM6981 ^ i15) * 22749) ^ (-1627517767);
                                i11 = -418103539;
                            }
                            i6 = iM6981 ^ i11;
                            sArr5 = sArr4;
                            sArr6 = sArr3;
                            i25 = i4;
                            i24 = i3;
                            strM1962 = str2;
                            textView3 = textView2;
                            sArr = sArr2;
                            i18 = i6;
                            i17 = i5;
                            view2 = view;
                            break;
                        case -948309805:
                        case 748309990:
                            sArr = sArr;
                            textView3 = textView3;
                            strM1962 = strM1962;
                            sArr6 = sArr6;
                            C7811.m20840(textView3, str4);
                            i9 = i25;
                            iM6986 = C2105.m6981(C0714.m2816(f63246, 248, 3, i19));
                            i21 = 2126060006;
                            if (C3663.m11168() < 0) {
                                int iM25613 = (C0630.m2566("֡᩷") + i16) * (-73);
                                i17 = ((iM25613 ^ i15) * 9583) ^ 1022985523;
                                i8 = iM25613 ^ 2022559287;
                                i25 = i9;
                                strM1962 = strM1962;
                                sArr = sArr;
                                i18 = i8;
                                sArr6 = sArr6;
                                textView3 = textView3;
                            } else {
                                viewM10739 = view2;
                                int iM69814 = C2105.m6981("ܳܺ") ^ i16;
                                sArr5 = sArr5;
                                sArr6 = sArr6;
                                i25 = i9;
                                i24 = i24;
                                strM1962 = strM1962;
                                textView3 = textView3;
                                sArr = sArr;
                                i18 = iM69814 ^ 1491946541;
                                i17 = ((iM69814 ^ i15) * (-4257)) ^ (-1357115516);
                                view2 = viewM10739;
                                c12918 = null;
                            }
                            break;
                        case -914685067:
                        case -571531999:
                            view2 = view2;
                            sArr = sArr;
                            textView3 = textView3;
                            strM1962 = strM1962;
                            i24 = i24;
                            sArr6 = sArr6;
                            i25 = i25;
                            sArr5 = sArr5;
                            iM2569 = C0630.m2566(C1005.m3502(f63246, 242, 3, i19));
                            iM2567 = (C2105.m6981("ۜ۬") ^ i15) * 73;
                            i17 = ((iM2567 ^ i16) * 17897) ^ (-799305342);
                            i7 = 1728679071;
                            i8 = iM2567 ^ i7;
                            sArr5 = sArr5;
                            i25 = i25;
                            view2 = view2;
                            i24 = i24;
                            strM1962 = strM1962;
                            sArr = sArr;
                            i18 = i8;
                            sArr6 = sArr6;
                            textView3 = textView3;
                            break;
                        case -771699886:
                        case -603939936:
                            C7811.m20840((TextView) C1005.m3507(view2, C2105.m6981(strM5726) ^ 2117573493), C0422.m1962(c12918.m31400()));
                            iM2568 = C0630.m2566("۬᩷") ^ i16;
                            i12 = ((iM2568 ^ i15) * 5739) ^ 1626786034;
                            i13 = -1743292410;
                            i18 = iM2568 ^ i13;
                            i17 = i12;
                            break;
                        case -431526913:
                        case 1292326871:
                            i19 = 42754;
                            iM2567 = (C0630.m2566("֡֡") ^ i15) * 59;
                            i17 = ((iM2567 ^ i16) * 27739) ^ (-79688813);
                            i7 = 213601063;
                            i8 = iM2567 ^ i7;
                            sArr5 = sArr5;
                            i25 = i25;
                            view2 = view2;
                            i24 = i24;
                            strM1962 = strM1962;
                            sArr = sArr;
                            i18 = i8;
                            sArr6 = sArr6;
                            textView3 = textView3;
                            break;
                        case -295250319:
                        case 1689009639:
                            iM6984 = C2105.m6981(ViewOnClickListenerC1958.m6435(sArr, 266, 3, i19)) ^ 2118437210;
                            obj = null;
                            if (C22628.f73083 > 0) {
                                iM2568 = C2105.m6981("ܿܽ") ^ i16;
                                i12 = ((iM2568 ^ i15) * 26055) ^ (-2060939898);
                                i13 = 1919738043;
                                i18 = iM2568 ^ i13;
                                i17 = i12;
                            } else {
                                view = view2;
                                sArr2 = sArr;
                                textView2 = textView3;
                                str2 = strM1962;
                                i10 = i24;
                                sArr3 = sArr6;
                                i4 = i25;
                                sArr4 = sArr5;
                                iM6981 = C0630.m2566("ۚۤ") ^ i16;
                                i3 = i10;
                                i5 = ((iM6981 ^ i15) * (-17935)) ^ 22421416;
                                i11 = -521358;
                                i6 = iM6981 ^ i11;
                                sArr5 = sArr4;
                                sArr6 = sArr3;
                                i25 = i4;
                                i24 = i3;
                                strM1962 = str2;
                                textView3 = textView2;
                                sArr = sArr2;
                                i18 = i6;
                                i17 = i5;
                                view2 = view;
                            }
                            break;
                        case -238600946:
                        case 1138961758:
                            sArr = sArr;
                            C4616.m13548(textView5, C0050.m935(iM31408));
                            iM25611 = C0630.m2566(C5695.m16034(f63246, Scalar25519.TARGET_LENGTH, 3, i19));
                            i22 = 2121716547;
                            iM2566 = (i16 - C2105.m6981("ۢۜ")) * (-5);
                            i = ((iM2566 ^ i15) * 14785) ^ (-1612153305);
                            i2 = 1515031276;
                            sArr7 = sArr;
                            i18 = iM2566 ^ i2;
                            i17 = i;
                            break;
                        case -197241668:
                        case 595834684:
                            sArr = sArr;
                            textView4 = (TextView) C11340.m28028(view2, iM6986 ^ i21);
                            strM1962 = C0422.m1962(c12918.m31410());
                            iM2566 = (C0630.m2566("۟ᩳ") + i15) * 21;
                            i = ((iM2566 ^ i16) * 1475) ^ 1680438677;
                            i2 = 1347263770;
                            sArr7 = sArr;
                            i18 = iM2566 ^ i2;
                            i17 = i;
                            break;
                        case 120729342:
                        case 170109396:
                            break;
                        case 210879906:
                        case 567870514:
                            C7811.m20840(textView6, C0050.m935(c12918.m31423()));
                            sArr = sArr;
                            strM5726 = C1711.m5726(f63246, 260, 3, i19);
                            if (!AbstractC2021.m6574()) {
                                iM2566 = (C0630.m2566("ܳۤ") ^ i15) * 81;
                                i = ((iM2566 ^ i16) * (-8863)) ^ (-1357764430);
                                i2 = 469289797;
                                sArr7 = sArr;
                                i18 = iM2566 ^ i2;
                                i17 = i;
                            }
                            viewM10739 = view2;
                            textView3 = textView3;
                            strM1962 = strM1962;
                            sArr6 = sArr6;
                            i9 = i25;
                            int iM69815 = C2105.m6981("ܳܺ") ^ i16;
                            sArr5 = sArr5;
                            sArr6 = sArr6;
                            i25 = i9;
                            i24 = i24;
                            strM1962 = strM1962;
                            textView3 = textView3;
                            sArr = sArr;
                            i18 = iM69815 ^ 1491946541;
                            i17 = ((iM69815 ^ i15) * (-4257)) ^ (-1357115516);
                            view2 = viewM10739;
                            c12918 = null;
                            break;
                        case 233292206:
                        case 1918991078:
                            sArr = sArr;
                            textView5 = (TextView) C1005.m3507(view2, C2105.m6981(C0382.m1840(sArr6, i25, i20, i19)) ^ 2128237906);
                            iM31408 = c12918.m31408();
                            if (C2167.f7158 >= 0) {
                                iM2566 = (C0630.m2566("ۙۙ") + i16) * 25;
                                i = ((iM2566 ^ i15) * (-14771)) ^ 1305060685;
                                i2 = 1057633924;
                            } else {
                                iM2566 = C2105.m6981("ۢۛ") ^ i15;
                                i = ((iM2566 ^ i16) * 1109) ^ (-1520917720);
                                i2 = -545619775;
                            }
                            sArr7 = sArr;
                            i18 = iM2566 ^ i2;
                            i17 = i;
                            break;
                        case 325910837:
                        case 1320764893:
                            C3245.m9925();
                            ServiceConnectionC3453.m10564();
                            break;
                        case 360560667:
                        case 779625923:
                            C1047.m3599();
                            ServiceConnectionC3453.m10564();
                            sArr = sArr;
                            textView = textView4;
                            str = strM1962;
                            int iM69816 = C2105.m6981("ۨۢ") ^ i15;
                            strM1962 = str;
                            sArr = sArr;
                            i18 = iM69816 ^ 1610938577;
                            TextView textView11 = textView;
                            i17 = ((iM69816 ^ i16) * (-16791)) ^ 714952891;
                            sArr6 = sArr6;
                            textView4 = textView11;
                            break;
                        case 566391504:
                        case 1378180163:
                            C1711.m5736();
                            if (C0714.f2697 < 0) {
                                sArr = sArr;
                                iM2566 = (C0630.m2566("ۙۙ") + i16) * 25;
                                i = ((iM2566 ^ i15) * (-14771)) ^ 1305060685;
                                i2 = 1057633924;
                                sArr7 = sArr;
                                i18 = iM2566 ^ i2;
                                i17 = i;
                            }
                            view = view2;
                            sArr2 = sArr;
                            textView2 = textView3;
                            str2 = strM1962;
                            i10 = i24;
                            sArr3 = sArr6;
                            i4 = i25;
                            sArr4 = sArr5;
                            iM6981 = C0630.m2566("ۚۤ") ^ i16;
                            i3 = i10;
                            i5 = ((iM6981 ^ i15) * (-17935)) ^ 22421416;
                            i11 = -521358;
                            i6 = iM6981 ^ i11;
                            sArr5 = sArr4;
                            sArr6 = sArr3;
                            i25 = i4;
                            i24 = i3;
                            strM1962 = str2;
                            textView3 = textView2;
                            sArr = sArr2;
                            i18 = i6;
                            i17 = i5;
                            view2 = view;
                            break;
                        case 856927113:
                        case 1337468194:
                            sArr = sArr;
                            textView3 = textView3;
                            strM1962 = strM1962;
                            sArr6 = sArr6;
                            i9 = i25;
                            viewM10739 = C3537.m10739(abstractActivityC3346, iM2569 ^ 2123663398);
                            if (C1504.f5354) {
                                int iM69817 = C2105.m6981("ܳܺ") ^ i16;
                                sArr5 = sArr5;
                                sArr6 = sArr6;
                                i25 = i9;
                                i24 = i24;
                                strM1962 = strM1962;
                                textView3 = textView3;
                                sArr = sArr;
                                i18 = iM69817 ^ 1491946541;
                                i17 = ((iM69817 ^ i15) * (-4257)) ^ (-1357115516);
                                view2 = viewM10739;
                                c12918 = null;
                            } else {
                                C12918 c12919 = new C12918(bArr, 0, true);
                                sArr5 = f63246;
                                i24 = 245;
                                int iM69818 = C2105.m6981("֡ۛ") ^ i16;
                                sArr6 = sArr6;
                                textView3 = textView3;
                                c12918 = c12919;
                                i17 = ((iM69818 ^ i15) * (-12197)) ^ (-74952224);
                                i25 = i9;
                                strM1962 = strM1962;
                                sArr = sArr;
                                i18 = iM69818 ^ (-594417763);
                                view2 = viewM10739;
                            }
                            break;
                        case 885643035:
                        case 1058349823:
                            C2520.m8033(c19258M2130, iM6985, obj);
                            C4159.m12564(C7811.m20839(RunnableC0588.m2438(c19258M2130)), new ViewOnClickListenerC3420(view2, 2));
                            break;
                        default:
                            sArr = sArr;
                            iM6987 = C2105.m6981(RunnableC1937.m6385(f63246, 257, 3, i19));
                            iM2566 = C0630.m2566("ۡ᩷") ^ i16;
                            i = ((iM2566 ^ i15) * 12795) ^ (-813556851);
                            i2 = -758961079;
                            sArr7 = sArr;
                            i18 = iM2566 ^ i2;
                            i17 = i;
                            break;
                    }
                    return;
                }
            }
            short[] sArr8 = sArr6;
            short[] sArr9 = sArr;
            str3 = strM1962;
            int i28 = i25;
            TextView textView12 = (TextView) C1005.m3507(view2, iM25610 ^ 2130640431);
            String str5 = new String(bArr, 4, 3);
            int iM69819 = C2105.m6981("ܿۘ") ^ i15;
            sArr6 = sArr8;
            textView3 = textView12;
            str4 = str5;
            i17 = ((iM69819 ^ i16) * 8791) ^ 899997277;
            sArr7 = sArr9;
            i18 = iM69819 ^ 36162409;
            i25 = i28;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0221 A[PHI: r2
      0x0221: PHI (r2v23 java.lang.String) = (r2v17 java.lang.String), (r2v19 java.lang.String), (r2v24 java.lang.String) binds: [B:53:0x0207, B:50:0x01ff, B:29:0x00e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x025f A[PHI: r2
      0x025f: PHI (r2v18 java.lang.String) = (r2v16 java.lang.String), (r2v19 java.lang.String) binds: [B:57:0x0247, B:50:0x01ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45006(final C16560 c16560, InterfaceC17889 interfaceC17889) {
        int iM6981;
        int i;
        int i2;
        int iM2566;
        int i3;
        int i4;
        int i5;
        int iM6982;
        int i6;
        int i7;
        int iM2567;
        int i8;
        int i9;
        int iM2568;
        c16560 = c16560;
        final InterfaceC17889 interfaceC178810 = interfaceC17889;
        int i10 = -1503301754;
        int i11 = C4075.f12947;
        int i12 = C3432.f10845;
        int iM2569 = (i12 - C0630.m2566("ۡ᩶")) * (-69);
        int i13 = ((iM2569 ^ i11) * (-30685)) ^ 1373346556;
        int i14 = iM2569 ^ 1264201864;
        String strM10562 = null;
        String strM50602 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i15 = 0;
        int iM25610 = 0;
        int iM6983 = 0;
        int iM6984 = 0;
        short s = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        String strM10563 = null;
        String strM947 = null;
        ArrayList arrayList = null;
        String strM1959 = null;
        String strM3789 = null;
        StringBuilder sb = null;
        CharSequence[] charSequenceArr = null;
        C19258 c19258M5912 = null;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i11) * 25619) >> 31));
            switch (i10) {
                case -1986957812:
                case 292374744:
                    if (!C11340.m28031()) {
                        strM947 = strM947;
                        iM6981 = (i12 - C2105.m6981("ۖ۫")) * (-21);
                        i = ((iM6981 ^ i11) * 18409) ^ 999678972;
                        i2 = 956720631;
                        i14 = iM6981 ^ i2;
                        int i19 = i;
                        strM947 = strM947;
                        i13 = i19;
                    } else {
                        strM947 = strM947;
                        strM10562 = strM10562;
                        sArr = sArr;
                        i5 = i17;
                        i18 = i18;
                        iM6982 = (i11 - C2105.m6981("ۚ۟")) * 39;
                        i6 = ((iM6982 ^ i12) * 22279) ^ (-701246169);
                        i7 = 2047040071;
                        i14 = iM6982 ^ i7;
                        i18 = i18;
                        i17 = i5;
                        sArr = sArr;
                        strM947 = strM947;
                        strM10562 = strM10562;
                        i13 = i6;
                        interfaceC178810 = interfaceC17889;
                    }
                    break;
                case -1828133845:
                case 476060870:
                    C1504.m5179();
                    C0422.m1963();
                    break;
                case -1795016625:
                case -1038704570:
                    C1420.m4905(sb, strM3789);
                    strM947 = strM947;
                    C4117.m12352(sb, interfaceC17889.getTime());
                    C3245.m9923(sb, strM3789);
                    C4117.m12352(sb, interfaceC17889.getSize());
                    strM1959 = C0422.m1959(sb);
                    if (!(interfaceC178810 instanceof C12645)) {
                        strM947 = strM1959;
                        iM2566 = C2105.m6981("᩺᩻") ^ i12;
                        i3 = ((iM2566 ^ i11) * (-19639)) ^ (-72539682);
                        i4 = -1124952011;
                        i14 = iM2566 ^ i4;
                        i13 = i3;
                    } else {
                        iM6981 = C0630.m2566("ܿ᩻") ^ i11;
                        i = ((iM6981 ^ i12) * (-14835)) ^ 1465738874;
                        i2 = 1755011661;
                        i14 = iM6981 ^ i2;
                        int i110 = i;
                        strM947 = strM947;
                        i13 = i110;
                    }
                    break;
                case -1665084023:
                case -184466328:
                    strM947 = strM947;
                    sb = new StringBuilder();
                    C3245.m9923(sb, interfaceC17889.getPath());
                    sArr2 = f63246;
                    iM6981 = (i11 - C2105.m6981("ۖ֫")) * (-115);
                    i = ((iM6981 ^ i12) * 8781) ^ 1394088097;
                    i2 = 716724154;
                    i14 = iM6981 ^ i2;
                    int i111 = i;
                    strM947 = strM947;
                    i13 = i111;
                    break;
                case -1608349302:
                case -695603284:
                    i15 = 850;
                    iM6982 = (i12 - C2105.m6981("۬ۚ")) * (-87);
                    i5 = i17;
                    i6 = ((iM6982 ^ i11) * (-9109)) ^ (-149348155);
                    i7 = 1032441998;
                    i14 = iM6982 ^ i7;
                    i18 = i18;
                    i17 = i5;
                    sArr = sArr;
                    strM947 = strM947;
                    strM10562 = strM10562;
                    i13 = i6;
                    interfaceC178810 = interfaceC17889;
                    break;
                case -1455515015:
                case 1071888853:
                    if (C0714.f2697 < 0) {
                        strM947 = strM947;
                        strM10562 = strM10562;
                        iM2567 = (i12 - C0630.m2566("۬ܳ")) * 17;
                        i6 = ((iM2567 ^ i11) * 16547) ^ 502830927;
                        i8 = 388373417;
                        i14 = iM2567 ^ i8;
                        strM947 = strM947;
                        strM10562 = strM10562;
                        i13 = i6;
                        interfaceC178810 = interfaceC17889;
                    } else {
                        strM947 = strM947;
                        iM6981 = (i12 - C2105.m6981("ۖ۫")) * (-21);
                        i = ((iM6981 ^ i11) * 18409) ^ 999678972;
                        i2 = 956720631;
                        i14 = iM6981 ^ i2;
                        int i112 = i;
                        strM947 = strM947;
                        i13 = i112;
                    }
                    break;
                case -1408256497:
                case 1663359417:
                    strM947 = strM947;
                    if (interfaceC178810 instanceof C12645) {
                        iM6981 = C0630.m2566("᩵ۚ") ^ i12;
                        i = ((iM6981 ^ i11) * (-15669)) ^ 1430625177;
                        i2 = -2090563345;
                    } else {
                        iM6981 = (C2105.m6981("۫ۧ") + i11) * 41;
                        i = ((iM6981 ^ i12) * 13911) ^ (-1201719309);
                        i2 = 531879648;
                    }
                    i14 = iM6981 ^ i2;
                    int i113 = i;
                    strM947 = strM947;
                    i13 = i113;
                    break;
                case -1347210312:
                case 1574051367:
                    C0382.m1849(c19258M5912, 2102628217 ^ iM6984);
                    C3683.m11213(c19258M5912);
                    break;
                case -1289120172:
                case 1485613260:
                    strM947 = strM947;
                    C1916.m6307(arrayList, ServiceConnectionC3453.m10562(2126989253 ^ iM25610));
                    if (C3663.f11553) {
                        iM6981 = (i12 - C2105.m6981("ۖ۫")) * (-21);
                        i = ((iM6981 ^ i11) * 18409) ^ 999678972;
                        i2 = 956720631;
                    } else {
                        iM6981 = C2105.m6981("ۛ۟") ^ i12;
                        i = ((iM6981 ^ i11) * (-28641)) ^ 713758819;
                        i2 = -1097525084;
                    }
                    i14 = iM6981 ^ i2;
                    int i114 = i;
                    strM947 = strM947;
                    i13 = i114;
                    break;
                case -1208769250:
                case -1078130142:
                    C0964.m3413();
                    ServiceConnectionC3453.m10564();
                    strM947 = strM947;
                    iM6981 = (i12 - C2105.m6981("ۖ۫")) * (-21);
                    i = ((iM6981 ^ i11) * 18409) ^ 999678972;
                    i2 = 956720631;
                    i14 = iM6981 ^ i2;
                    int i115 = i;
                    strM947 = strM947;
                    i13 = i115;
                    break;
                case -1189001713:
                case -524242807:
                    StringBuilder sbM19190 = C7166.m19190(strM1959, strM3789);
                    C0050.m945(sbM19190, ((C12645) interfaceC178810).m30924().m10782());
                    strM947 = C0050.m947(sbM19190);
                    iM2566 = C2105.m6981("᩺᩻") ^ i12;
                    i3 = ((iM2566 ^ i11) * (-19639)) ^ (-72539682);
                    i4 = -1124952011;
                    i14 = iM2566 ^ i4;
                    i13 = i3;
                    break;
                case -1141085650:
                case 1623636587:
                    strM947 = strM947;
                    iM6984 = C2105.m6981(C0483.m2128(f63246, 348, 3, i15));
                    iM6981 = (C2105.m6981("ܿܶ") ^ i12) * (-127);
                    i = ((iM6981 ^ i11) * 13091) ^ 1949528650;
                    i2 = 2003051352;
                    i14 = iM6981 ^ i2;
                    int i116 = i;
                    strM947 = strM947;
                    i13 = i116;
                    break;
                case -1107599257:
                case 193042664:
                    strM947 = strM947;
                    iM6983 = C2105.m6981(C11340.m28025(f63246, 345, 3, i15));
                    iM6981 = (C2105.m6981("ܶ۫") + i11) * 97;
                    i = ((iM6981 ^ i12) * (-9693)) ^ 937690319;
                    i2 = 1771645650;
                    i14 = iM6981 ^ i2;
                    int i117 = i;
                    strM947 = strM947;
                    i13 = i117;
                    break;
                case -1096704761:
                case 386512306:
                    strM947 = strM947;
                    strM10562 = strM10562;
                    sArr = sArr;
                    i5 = i17;
                    i18 = i18;
                    if ((i16 * i16) - ((s * 2) + 1) < 0) {
                        iM6982 = C2105.m6981("ᩳ۫") ^ i11;
                        i6 = ((iM6982 ^ i12) * 22739) ^ (-1171958050);
                        i7 = 1590805676;
                    } else {
                        iM6982 = C2105.m6981("ۖܺ") ^ i11;
                        i6 = ((iM6982 ^ i12) * 5415) ^ 1774527329;
                        i7 = -769965415;
                    }
                    i14 = iM6982 ^ i7;
                    i18 = i18;
                    i17 = i5;
                    sArr = sArr;
                    strM947 = strM947;
                    strM10562 = strM10562;
                    i13 = i6;
                    interfaceC178810 = interfaceC17889;
                    break;
                case -1032149852:
                case 165004842:
                    f63250.submit(new RunnableC1928(c16560, interfaceC178810));
                    strM947 = strM947;
                    iM6981 = (C2105.m6981("۫ۧ") + i11) * 41;
                    i = ((iM6981 ^ i12) * 13911) ^ (-1201719309);
                    i2 = 531879648;
                    i14 = iM6981 ^ i2;
                    int i118 = i;
                    strM947 = strM947;
                    i13 = i118;
                    break;
                case -1019199489:
                case 735631263:
                    strM947 = strM947;
                    C1916.m6307(arrayList, ServiceConnectionC3453.m10562(2121929997 ^ iM6983));
                    if (interfaceC178810 instanceof C9555) {
                        iM6981 = C0630.m2566("᩵ۚ") ^ i12;
                        i = ((iM6981 ^ i11) * (-15669)) ^ 1430625177;
                        i2 = -2090563345;
                    } else {
                        iM6981 = C2105.m6981("ۜ۬") ^ i12;
                        i = ((iM6981 ^ i11) * 10305) ^ 817989334;
                        i2 = -701474559;
                    }
                    i14 = iM6981 ^ i2;
                    int i119 = i;
                    strM947 = strM947;
                    i13 = i119;
                    break;
                case -922052172:
                case 326217827:
                    strM947 = strM947;
                    c19258M5912 = C1773.m5912(C22628.m50612(c16560));
                    charSequenceArr = (CharSequence[]) arrayList.toArray(new String[0]);
                    if (C0050.f910 < 0) {
                        iM6981 = C0630.m2566("ۘ᩷") ^ i11;
                        i = ((iM6981 ^ i12) * 25425) ^ 249812848;
                        i2 = -612712635;
                        i14 = iM6981 ^ i2;
                        int i1110 = i;
                        strM947 = strM947;
                        i13 = i1110;
                    } else {
                        strM10562 = strM10562;
                        iM2567 = (i11 - C0630.m2566("֨ۜ")) * 63;
                        i6 = ((iM2567 ^ i12) * 1255) ^ (-1813090048);
                        i8 = 654448421;
                        i14 = iM2567 ^ i8;
                        strM947 = strM947;
                        strM10562 = strM10562;
                        i13 = i6;
                        interfaceC178810 = interfaceC17889;
                    }
                    break;
                case -520702242:
                case 2057190025:
                    strM947 = strM947;
                    strM10562 = strM10562;
                    sArr = sArr;
                    i5 = i17;
                    i18 = i18;
                    s = f63246[335];
                    i16 = s + 1;
                    if (C3663.f11553) {
                        iM6982 = (i11 - C2105.m6981("ۚ۟")) * 39;
                        i6 = ((iM6982 ^ i12) * 22279) ^ (-701246169);
                        i7 = 2047040071;
                    } else {
                        iM6982 = C2105.m6981("᩶ܿ") ^ i12;
                        i6 = ((iM6982 ^ i11) * (-6327)) ^ (-1440767436);
                        i7 = -1575037677;
                    }
                    i14 = iM6982 ^ i7;
                    i18 = i18;
                    i17 = i5;
                    sArr = sArr;
                    strM947 = strM947;
                    strM10562 = strM10562;
                    i13 = i6;
                    interfaceC178810 = interfaceC17889;
                    break;
                case -370161114:
                case 184123815:
                    strM947 = strM947;
                    strM10562 = strM10562;
                    short[] sArr3 = sArr;
                    int i20 = i17;
                    i18 = i18;
                    strM10563 = ServiceConnectionC3453.m10562(C2105.m6981(C2272.m7507(sArr3, i20, i18, i15)) ^ 2123137569);
                    if (C0714.f2697 >= 0) {
                        sArr = sArr3;
                        i5 = i20;
                        iM6982 = (i11 - C2105.m6981("ۚ۟")) * 39;
                        i6 = ((iM6982 ^ i12) * 22279) ^ (-701246169);
                        i7 = 2047040071;
                        i14 = iM6982 ^ i7;
                        i18 = i18;
                        i17 = i5;
                        sArr = sArr;
                        strM947 = strM947;
                        strM10562 = strM10562;
                        i13 = i6;
                        interfaceC178810 = interfaceC17889;
                    } else {
                        int iM25611 = (C0630.m2566("᩶᩷") + i12) * (-71);
                        int i21 = ((iM25611 ^ i11) * (-28343)) ^ 1254269561;
                        i14 = iM25611 ^ (-1131728576);
                        i17 = i20;
                        strM10562 = strM10562;
                        i18 = i18;
                        sArr = sArr3;
                        interfaceC178810 = interfaceC17889;
                        strM947 = strM947;
                        i13 = i21;
                        c16560 = c16560;
                    }
                    break;
                case -309317560:
                case 1514178661:
                    i15 = 32597;
                    iM6982 = (i12 - C2105.m6981("۬ۚ")) * (-87);
                    i5 = i17;
                    i6 = ((iM6982 ^ i11) * (-9109)) ^ (-149348155);
                    i7 = 1032441998;
                    i14 = iM6982 ^ i7;
                    i18 = i18;
                    i17 = i5;
                    sArr = sArr;
                    strM947 = strM947;
                    strM10562 = strM10562;
                    i13 = i6;
                    interfaceC178810 = interfaceC17889;
                    break;
                case 30359048:
                case 688014175:
                    strM947 = strM947;
                    strM10562 = strM10562;
                    C7106.m19117(arrayList, strM10562);
                    iM25610 = C0630.m2566(RunnableC0588.m2436(f63246, 342, 3, i15));
                    if (C4075.f12947 < 0) {
                        int iM6985 = (i11 - C2105.m6981("ۗۙ")) * 19;
                        i = ((iM6985 ^ i12) * (-21523)) ^ 1530686906;
                        i14 = iM6985 ^ 1178516622;
                        c16560 = c16560;
                        strM10562 = strM10562;
                        int i1111 = i;
                        strM947 = strM947;
                        i13 = i1111;
                    } else {
                        sArr = sArr;
                        i5 = i17;
                        i18 = i18;
                        iM6982 = (i11 - C2105.m6981("ۚ۟")) * 39;
                        i6 = ((iM6982 ^ i12) * 22279) ^ (-701246169);
                        i7 = 2047040071;
                        i14 = iM6982 ^ i7;
                        i18 = i18;
                        i17 = i5;
                        sArr = sArr;
                        strM947 = strM947;
                        strM10562 = strM10562;
                        i13 = i6;
                        interfaceC178810 = interfaceC17889;
                    }
                    break;
                case 166038620:
                case 1858064379:
                    if (!ServiceConnectionC3453.m10557(f63248, strM947)) {
                        strM947 = strM947;
                        iM6981 = (C2105.m6981("۫ۧ") + i11) * 41;
                        i = ((iM6981 ^ i12) * 13911) ^ (-1201719309);
                        i2 = 531879648;
                        i14 = iM6981 ^ i2;
                        int i1112 = i;
                        strM947 = strM947;
                        i13 = i1112;
                    } else {
                        iM2566 = C0630.m2566("۠۠") ^ i11;
                        i3 = ((iM2566 ^ i12) * (-2941)) ^ 1862901342;
                        i4 = -2121397262;
                        i14 = iM2566 ^ i4;
                        i13 = i3;
                    }
                    break;
                case 305824273:
                case 1884033362:
                    if (C0422.f1886 > 0) {
                        strM947 = strM947;
                        strM10562 = strM10562;
                        iM2567 = (i11 - C0630.m2566("֨ۜ")) * 63;
                        i6 = ((iM2567 ^ i12) * 1255) ^ (-1813090048);
                        i8 = 654448421;
                        i14 = iM2567 ^ i8;
                        strM947 = strM947;
                        strM10562 = strM10562;
                        i13 = i6;
                        interfaceC178810 = interfaceC17889;
                    }
                    strM947 = strM947;
                    strM10562 = strM10562;
                    sArr = sArr;
                    i5 = i17;
                    i18 = i18;
                    iM6982 = (i11 - C2105.m6981("ۚ۟")) * 39;
                    i6 = ((iM6982 ^ i12) * 22279) ^ (-701246169);
                    i7 = 2047040071;
                    i14 = iM6982 ^ i7;
                    i18 = i18;
                    i17 = i5;
                    sArr = sArr;
                    strM947 = strM947;
                    strM10562 = strM10562;
                    i13 = i6;
                    interfaceC178810 = interfaceC17889;
                    break;
                case 443358972:
                case 1177065102:
                    strM947 = strM947;
                    strM10562 = ServiceConnectionC3453.m10562(C2105.m6981(strM50602) ^ 2097301620);
                    if (C4616.m13552() != 0) {
                        iM2568 = (C0630.m2566("᩹ܽ") + i12) * (-41);
                        i3 = ((iM2568 ^ i11) * 30129) ^ 1385616463;
                        i9 = -318616315;
                    } else {
                        iM2568 = (i12 - C0630.m2566("ᩴᩳ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i3 = ((iM2568 ^ i11) * (-25941)) ^ 1977467716;
                        i9 = -1140016962;
                    }
                    i14 = iM2568 ^ i9;
                    c16560 = c16560;
                    strM947 = strM947;
                    i13 = i3;
                    break;
                case 913565890:
                case 2066969628:
                    strM947 = strM947;
                    if (C1711.m5729()) {
                        iM6981 = (i11 - C0630.m2566("᩺۟")) * (-37);
                        i = ((iM6981 ^ i12) * 14199) ^ (-901659570);
                        i2 = -1102098743;
                    } else {
                        iM6981 = (C2105.m6981("۫ۧ") + i11) * 41;
                        i = ((iM6981 ^ i12) * 13911) ^ (-1201719309);
                        i2 = 531879648;
                    }
                    i14 = iM6981 ^ i2;
                    int i1113 = i;
                    strM947 = strM947;
                    i13 = i1113;
                    break;
                case 1273599300:
                case 1443442183:
                    strM947 = strM947;
                    strM10562 = strM10562;
                    arrayList = new ArrayList(4);
                    sArr = f63246;
                    i17 = 336;
                    i18 = 3;
                    if (C2167.f7158 >= 0) {
                        iM2567 = (i12 - C0630.m2566("۬ܳ")) * 17;
                        i6 = ((iM2567 ^ i11) * 16547) ^ 502830927;
                        i8 = 388373417;
                    } else {
                        iM2567 = (C0630.m2566("᩹ۤ") + i11) * (-57);
                        i6 = ((iM2567 ^ i12) * 23673) ^ 975483124;
                        i8 = -1443281582;
                    }
                    i14 = iM2567 ^ i8;
                    strM947 = strM947;
                    strM10562 = strM10562;
                    i13 = i6;
                    interfaceC178810 = interfaceC17889;
                    break;
                case 1394688002:
                case 1863017325:
                    strM947 = strM947;
                    c19258M5912.m44429(charSequenceArr, -1, new DialogInterface.OnClickListener() { // from class: l.ܰۢܳ

                        /* JADX INFO: renamed from: ۛᩳ᩵, reason: not valid java name and contains not printable characters */
                        private static final short[] f41014 = {7579, 6519, 4048, 8079, 15834, 6222, 7340};

                        {
                            int i22 = -1129193524;
                            int i23 = C2520.f8000;
                            int i24 = C1420.f5096;
                            int iM6986 = (i24 - C2105.m6981("᩻֡")) * 15;
                            int i25 = ((iM6986 ^ i23) * (-30229)) ^ (-363660229);
                            int i26 = -123268133;
                            while (true) {
                                i22 = ((((i22 ^ i23) * (-10231)) >> 31) & i25) ^ (iM6986 ^ i26);
                                switch (i22) {
                                    case -2034299914:
                                    case 520092950:
                                        return;
                                    case -1357483080:
                                    case -842032200:
                                        if (C0422.m1963()) {
                                            iM6986 = (C2105.m6981("۬᩸") ^ i23) * (-65);
                                            i25 = ((iM6986 ^ i24) * (-32209)) ^ (-1830805788);
                                            i26 = -1783460418;
                                        } else {
                                            iM6986 = (C2105.m6981("ۖ֫") + i24) * (-83);
                                            i25 = ((iM6986 ^ i23) * 22137) ^ (-968319482);
                                            i26 = 319203001;
                                        }
                                        break;
                                    case -1130626301:
                                    case 1218634577:
                                        if (C1294.f4556 >= 0) {
                                            iM6986 = C2105.m6981("᩹ܺ") ^ i23;
                                            i25 = ((iM6986 ^ i24) * 12413) ^ 1189529496;
                                            i26 = 1722123439;
                                        } else {
                                            iM6986 = C0630.m2566("۟᩹") ^ i24;
                                            i25 = ((iM6986 ^ i23) * (-745)) ^ (-325756584);
                                            i26 = 1133595220;
                                        }
                                        break;
                                    case -1086449804:
                                    case 878741147:
                                        if (C3683.m11222()) {
                                            iM6986 = C2105.m6981("᩹ܺ") ^ i23;
                                            i25 = ((iM6986 ^ i24) * 12413) ^ 1189529496;
                                            i26 = 1722123439;
                                        } else {
                                            iM6986 = C2105.m6981("ܿۘ") ^ i23;
                                            i25 = ((iM6986 ^ i24) * (-21387)) ^ 63914853;
                                            i26 = -1618974009;
                                        }
                                        break;
                                    case -1072727191:
                                    case -567315250:
                                        if (C0483.f2088 >= 0) {
                                            iM6986 = (C2105.m6981("ۖ֫") + i24) * (-83);
                                            i25 = ((iM6986 ^ i23) * 22137) ^ (-968319482);
                                            i26 = 319203001;
                                        } else {
                                            iM6986 = (C0630.m2566("ܿۜ") + i23) * 57;
                                            i25 = ((iM6986 ^ i24) * (-8211)) ^ (-1613395277);
                                            i26 = 1108402835;
                                        }
                                        break;
                                    case -958134902:
                                    case -809242584:
                                        if (C3746.f11829 <= 0) {
                                            iM6986 = C0630.m2566("᩵ۤ") ^ i23;
                                            i25 = ((iM6986 ^ i24) * (-22573)) ^ (-1441755999);
                                            i26 = 2048761682;
                                        } else {
                                            iM6986 = C0630.m2566("᩷ۙ") ^ i23;
                                            i25 = ((iM6986 ^ i24) * 26433) ^ (-90717175);
                                            i26 = -1478154497;
                                        }
                                        break;
                                    case -419946020:
                                    case 661002253:
                                        if (C4117.m12364() != 0) {
                                            iM6986 = (C2105.m6981("ۖ֫") + i24) * (-83);
                                            i25 = ((iM6986 ^ i23) * 22137) ^ (-968319482);
                                            i26 = 319203001;
                                        } else {
                                            iM6986 = (i23 - C2105.m6981("۟۠")) * (-95);
                                            i25 = ((iM6986 ^ i24) * (-17669)) ^ 1660107698;
                                            i26 = 1176874330;
                                        }
                                        break;
                                    case -318605542:
                                    case -13207393:
                                        C3663.m11168();
                                        iM6986 = C0630.m2566("۟᩹") ^ i24;
                                        i25 = ((iM6986 ^ i23) * (-745)) ^ (-325756584);
                                        i26 = 1133595220;
                                        break;
                                    case -239440887:
                                    case 1700940597:
                                        C21923.m49329();
                                        if (C1773.f6144 <= 0) {
                                            iM6986 = C2105.m6981("᩹ܺ") ^ i23;
                                            i25 = ((iM6986 ^ i24) * 12413) ^ 1189529496;
                                            i26 = 1722123439;
                                        } else {
                                            iM6986 = C0630.m2566("ᩳۘ") ^ i24;
                                            i25 = ((iM6986 ^ i23) * 18643) ^ 297588557;
                                            i26 = 191562240;
                                        }
                                        break;
                                    case -139723216:
                                    case 1408009:
                                        if (C4263.f13799 <= 0) {
                                            iM6986 = C0630.m2566("۟᩹") ^ i24;
                                            i25 = ((iM6986 ^ i23) * (-745)) ^ (-325756584);
                                            i26 = 1133595220;
                                        } else {
                                            iM6986 = C0630.m2566("ۚۨ") ^ i24;
                                            i25 = ((iM6986 ^ i23) * (-25313)) ^ 1694280336;
                                            i26 = -1945505550;
                                        }
                                        break;
                                    case 5996218:
                                    case 1506582868:
                                        C0798.m2998();
                                        C1005.m3501();
                                        throw new RuntimeException();
                                    case 337921514:
                                    case 629285378:
                                        if (C0422.m1963()) {
                                            iM6986 = (C0630.m2566("ۛ᩺") + i24) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                            i25 = ((iM6986 ^ i23) * 32097) ^ 1929388952;
                                            i26 = 1111150000;
                                        } else {
                                            iM6986 = C2105.m6981("᩹ܺ") ^ i23;
                                            i25 = ((iM6986 ^ i24) * 12413) ^ 1189529496;
                                            i26 = 1722123439;
                                        }
                                        break;
                                    case 401794316:
                                    case 498452563:
                                        C1504.m5179();
                                        if (C2105.f7037 != 0) {
                                            iM6986 = C0630.m2566("᩵ۤ") ^ i23;
                                            i25 = ((iM6986 ^ i24) * (-22573)) ^ (-1441755999);
                                            i26 = 2048761682;
                                        } else {
                                            iM6986 = C2105.m6981("᩹ܺ") ^ i23;
                                            i25 = ((iM6986 ^ i24) * 12413) ^ 1189529496;
                                            i26 = 1722123439;
                                        }
                                        break;
                                    case 433489634:
                                    case 742577641:
                                        if (C1294.m4372() <= 0) {
                                            iM6986 = C0630.m2566("᩵ۤ") ^ i23;
                                            i25 = ((iM6986 ^ i24) * (-22573)) ^ (-1441755999);
                                            i26 = 2048761682;
                                        } else {
                                            iM6986 = C2105.m6981("۫᩷") ^ i24;
                                            i25 = ((iM6986 ^ i23) * (-18135)) ^ (-744505373);
                                            i26 = -51102708;
                                        }
                                        break;
                                    case 715050608:
                                    case 1442105114:
                                        if (RunnableC1108.f4040) {
                                            iM6986 = C2105.m6981("ۛۤ") ^ i24;
                                            i25 = ((iM6986 ^ i23) * 26213) ^ 1433495725;
                                            i26 = -321096891;
                                        } else {
                                            iM6986 = C0630.m2566("᩵ۤ") ^ i23;
                                            i25 = ((iM6986 ^ i24) * (-22573)) ^ (-1441755999);
                                            i26 = 2048761682;
                                        }
                                        break;
                                    default:
                                        if (C4075.f12947 >= 0) {
                                            iM6986 = (C2105.m6981("ۖ֫") + i24) * (-83);
                                            i25 = ((iM6986 ^ i23) * 22137) ^ (-968319482);
                                            i26 = 319203001;
                                        } else {
                                            iM6986 = C0630.m2566("۠֫") ^ i24;
                                            i25 = ((iM6986 ^ i23) * (-15755)) ^ (-607045728);
                                            i26 = -2084210122;
                                        }
                                        break;
                                }
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:119:0x0446 A[PHI: r21 r26
                          0x0446: PHI (r21v43 short[]) = (r21v27 short[]), (r21v2 short[]), (r21v2 short[]), (r21v2 short[]) binds: [B:118:0x0444, B:18:0x00a9, B:188:0x0446, B:187:0x0446] A[DONT_GENERATE, DONT_INLINE]
                          0x0446: PHI (r26v13 int) = (r26v8 int), (r26v1 int), (r26v1 int), (r26v1 int) binds: [B:118:0x0444, B:18:0x00a9, B:188:0x0446, B:187:0x0446] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:150:0x05c7 A[PHI: r11 r15 r17 r18 r20 r21
                          0x05c7: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v4 int) binds: [B:149:0x05c5, B:145:0x05a5, B:110:0x03da] A[DONT_GENERATE, DONT_INLINE]
                          0x05c7: PHI (r15v98 short[]) = (r15v5 short[]), (r15v6 short[]), (r15v99 short[]) binds: [B:149:0x05c5, B:145:0x05a5, B:110:0x03da] A[DONT_GENERATE, DONT_INLINE]
                          0x05c7: PHI (r17v4 short[]) = (r17v3 short[]), (r17v2 short[]), (r17v2 short[]) binds: [B:149:0x05c5, B:145:0x05a5, B:110:0x03da] A[DONT_GENERATE, DONT_INLINE]
                          0x05c7: PHI (r18v4 int) = (r18v2 int), (r18v3 int), (r18v2 int) binds: [B:149:0x05c5, B:145:0x05a5, B:110:0x03da] A[DONT_GENERATE, DONT_INLINE]
                          0x05c7: PHI (r20v4 short) = (r20v2 short), (r20v3 short), (r20v2 short) binds: [B:149:0x05c5, B:145:0x05a5, B:110:0x03da] A[DONT_GENERATE, DONT_INLINE]
                          0x05c7: PHI (r21v28 int) = (r21v4 int), (r21v5 int), (r21v29 int) binds: [B:149:0x05c5, B:145:0x05a5, B:110:0x03da] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:20:0x00ad  */
                        /* JADX WARN: Code restructure failed: missing block: B:33:0x00f4, code lost:
                        
                            if (l.C4616.f14690 <= 0) goto L34;
                         */
                        @Override // android.content.DialogInterface.OnClickListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void onClick(DialogInterface dialogInterface, int i22) {
                            int i23;
                            int iM25612;
                            int i24;
                            int i25;
                            C16560 c16561;
                            int iM25613;
                            C16560 c16562;
                            int i26;
                            int i27;
                            int iM6986;
                            int iM25614;
                            int i28;
                            int i29;
                            int i30;
                            int iM25615;
                            int i31;
                            int i32;
                            int i33 = 1286551286;
                            int i34 = C4075.f12947;
                            int i35 = C2520.f8000;
                            int iM6987 = (i34 - C2105.m6981("ܳܺ")) * 127;
                            int i36 = ((iM6987 ^ i35) * (-17089)) ^ 210150130;
                            int i37 = iM6987 ^ (-780158439);
                            final InterfaceC17889 interfaceC178811 = null;
                            Object obj = null;
                            short[] sArr4 = null;
                            short[] sArr5 = null;
                            int i38 = 0;
                            final C16560 c16563 = null;
                            int i39 = 0;
                            int iM25616 = 0;
                            int i40 = 0;
                            int i41 = 0;
                            int i42 = 0;
                            short s2 = 0;
                            int i43 = 0;
                            int i44 = 0;
                            short s3 = 0;
                            int i45 = 0;
                            InterfaceC15417 interfaceC15417 = null;
                            short[] sArr6 = null;
                            boolean z = false;
                            int i46 = 0;
                            while (true) {
                                i33 = i37 ^ (i36 & (((i33 ^ i35) * (-1385)) >> 31));
                                switch (i33) {
                                    case -2095020442:
                                    case -1010657207:
                                        C1504.m5167(iM25616);
                                        new ViewOnClickListenerC0059(C22628.m50612(c16563));
                                        break;
                                    case -1988259546:
                                    case 1803676618:
                                        C3746.m11369();
                                        if (RunnableC3474.f10992 > 0) {
                                            iM25615 = C2105.m6981("ۚ᩸") ^ i35;
                                            i31 = ((iM25615 ^ i34) * (-23623)) ^ 320714373;
                                            i32 = -1614801800;
                                        } else {
                                            iM25615 = (C2105.m6981("ܿᩴ") + i35) * 71;
                                            i31 = ((iM25615 ^ i34) * 23987) ^ (-1486797768);
                                            i32 = 1314412526;
                                        }
                                        i37 = iM25615 ^ i32;
                                        i36 = i31;
                                        break;
                                    case -1982765380:
                                    case 1190419414:
                                        C1005.m3501();
                                        C2520.m8026();
                                        sArr4 = sArr4;
                                        iM25612 = C2105.m6981("ۙ۬") ^ i34;
                                        i23 = i38;
                                        i24 = ((iM25612 ^ i35) * 12883) ^ 1055178212;
                                        i25 = 1089052288;
                                        i37 = iM25612 ^ i25;
                                        i36 = i24;
                                        i38 = i23;
                                        sArr4 = sArr4;
                                        break;
                                    case -1964957471:
                                    case 1853230225:
                                        if (C0798.m3001()) {
                                            iM25615 = C2105.m6981("۫۫") ^ i35;
                                            i31 = ((iM25615 ^ i34) * (-20819)) ^ (-677747147);
                                            i32 = 1139504421;
                                        } else {
                                            iM25615 = C2105.m6981("᩷ۗ") ^ i35;
                                            i31 = ((iM25615 ^ i34) * (-8093)) ^ 2022988489;
                                            i32 = 928505821;
                                        }
                                        i37 = iM25615 ^ i32;
                                        i36 = i31;
                                        break;
                                    case -1946262165:
                                    case 1494985730:
                                        i39 = i40 ^ i46;
                                        sArr5 = f41014;
                                        i38 = 4;
                                        i42 = 3;
                                        if (C1773.f6144 > 0) {
                                            iM25615 = C0630.m2566("ۧۚ") ^ i34;
                                            i31 = ((iM25615 ^ i35) * (-6707)) ^ 1220269630;
                                            i32 = -1302406456;
                                            i37 = iM25615 ^ i32;
                                            i36 = i31;
                                        } else {
                                            sArr4 = sArr4;
                                            iM25612 = C2105.m6981("ۙ۬") ^ i34;
                                            i23 = i38;
                                            i24 = ((iM25612 ^ i35) * 12883) ^ 1055178212;
                                            i25 = 1089052288;
                                            i37 = iM25612 ^ i25;
                                            i36 = i24;
                                            i38 = i23;
                                            sArr4 = sArr4;
                                        }
                                        break;
                                    case -1871149863:
                                    case -1817704931:
                                        sArr4 = sArr4;
                                        i23 = i38;
                                        s2 = 3156;
                                        if (C3663.f11553) {
                                            i38 = i23;
                                            iM25612 = C2105.m6981("ۙ۬") ^ i34;
                                            i23 = i38;
                                            i24 = ((iM25612 ^ i35) * 12883) ^ 1055178212;
                                            i25 = 1089052288;
                                        } else {
                                            iM25612 = (C0630.m2566("ۤ᩻") ^ i34) * (-85);
                                            i24 = ((iM25612 ^ i35) * (-23167)) ^ 796991132;
                                            i25 = -1188997580;
                                        }
                                        i37 = iM25612 ^ i25;
                                        i36 = i24;
                                        i38 = i23;
                                        sArr4 = sArr4;
                                        break;
                                    case -1869003646:
                                    case -1567546681:
                                        break;
                                    case -1806636069:
                                    case 1495874317:
                                        C2126.m7040();
                                        if (ServiceConnectionC3453.f10921 < 0) {
                                            iM25615 = (C0630.m2566("ۜۙ") ^ i34) * 49;
                                            i31 = ((iM25615 ^ i35) * (-25759)) ^ 918755169;
                                            i32 = 1771171734;
                                            i37 = iM25615 ^ i32;
                                            i36 = i31;
                                        } else {
                                            c16561 = c16563;
                                            sArr4 = sArr4;
                                            iM25613 = (C0630.m2566("᩹ۜ") ^ i35) * (-27);
                                            c16562 = c16561;
                                            i36 = ((iM25613 ^ i34) * 25193) ^ (-303510167);
                                            i26 = -862441745;
                                            i30 = iM25613 ^ i26;
                                            c16563 = c16562;
                                            i37 = i30;
                                            sArr4 = sArr4;
                                        }
                                        break;
                                    case -1786383664:
                                    case 417908676:
                                        if (C1711.m5729()) {
                                            iM25615 = (i34 - C0630.m2566("֫ۖ")) * 91;
                                            i31 = ((iM25615 ^ i35) * 32403) ^ (-1225386793);
                                            i32 = -302482120;
                                        } else {
                                            iM25615 = C0630.m2566("֡᩹") ^ i34;
                                            i31 = ((iM25615 ^ i35) * (-21363)) ^ (-529240024);
                                            i32 = -1189166323;
                                        }
                                        i37 = iM25615 ^ i32;
                                        i36 = i31;
                                        break;
                                    case -1782334185:
                                    case -356284993:
                                        if (C1047.m3602()) {
                                            iM25615 = (C0630.m2566("ܶۨ") ^ i35) * (-69);
                                            i31 = ((iM25615 ^ i34) * 17927) ^ (-669623390);
                                            i32 = -918913774;
                                        } else {
                                            iM25615 = (C2105.m6981("ۨܳ") + i34) * 5;
                                            i31 = ((iM25615 ^ i35) * 24441) ^ (-601720692);
                                            i32 = 1778988006;
                                        }
                                        i37 = iM25615 ^ i32;
                                        i36 = i31;
                                        break;
                                    case -1780086425:
                                    case -2655775:
                                        if (C9255.m23764(C21923.m49336(c16563))) {
                                            iM25615 = C0630.m2566("ۙ᩶") ^ i35;
                                            i31 = ((iM25615 ^ i34) * 17227) ^ 1577143925;
                                            i32 = -482835107;
                                        } else {
                                            iM25615 = C0630.m2566("᩶ۛ") ^ i35;
                                            i31 = ((iM25615 ^ i34) * (-21885)) ^ 1486168483;
                                            i32 = 987484442;
                                        }
                                        i37 = iM25615 ^ i32;
                                        i36 = i31;
                                        break;
                                    case -1739538371:
                                    case 2105302980:
                                        C19568.m45007(c16563, interfaceC178811, ActivityC0814.class);
                                        break;
                                    case -1727667955:
                                    case -743440389:
                                        C1128.m3851();
                                        if (C1294.f4556 >= 0) {
                                            iM25615 = (C0630.m2566("ۜۙ") ^ i34) * 49;
                                            i31 = ((iM25615 ^ i35) * (-25759)) ^ 918755169;
                                            i32 = 1771171734;
                                        } else {
                                            iM25615 = C2105.m6981("ۚ᩸") ^ i35;
                                            i31 = ((iM25615 ^ i34) * (-23623)) ^ 320714373;
                                            i32 = -1614801800;
                                        }
                                        i37 = iM25615 ^ i32;
                                        i36 = i31;
                                        break;
                                    case -1706033413:
                                    case -1210101835:
                                        RunnableC1108.m3795(c16563, interfaceC178811, new C2949(2, c16563));
                                        break;
                                    case -1572009130:
                                    case -828289232:
                                        if (i22 != 4) {
                                            iM25615 = C0630.m2566("ܺ۬") ^ i35;
                                            i31 = ((iM25615 ^ i34) * (-7993)) ^ 1043147237;
                                            i32 = 1473438075;
                                        } else {
                                            iM25615 = C2105.m6981("ܶۤ") ^ i35;
                                            i31 = ((iM25615 ^ i34) * (-20449)) ^ (-1704809200);
                                            i32 = 300667073;
                                        }
                                        i37 = iM25615 ^ i32;
                                        i36 = i31;
                                        break;
                                    case -1535598371:
                                    case -1091212334:
                                        i41 = 28569;
                                        iM25612 = C0630.m2566("۬ۢ") ^ i34;
                                        i23 = i38;
                                        i24 = ((iM25612 ^ i35) * (-12447)) ^ 1823196412;
                                        i25 = -1175987837;
                                        i37 = iM25612 ^ i25;
                                        i36 = i24;
                                        i38 = i23;
                                        sArr4 = sArr4;
                                        break;
                                    case -1368055011:
                                    case 1183337835:
                                        sArr4 = sArr4;
                                        i23 = i38;
                                        int i47 = i43 + 9960336;
                                        i44 = i47 + i47;
                                        if (C1128.f4106 <= 0) {
                                            iM25612 = (i34 - C0630.m2566("ܺᩴ")) * (-35);
                                            i24 = ((iM25612 ^ i35) * (-8475)) ^ (-1900642036);
                                            i25 = -1028968661;
                                        } else {
                                            iM25612 = (i34 - C2105.m6981("ۗ۬")) * (-3);
                                            i24 = ((iM25612 ^ i35) * (-21427)) ^ 1297135907;
                                            i25 = -178692790;
                                        }
                                        i37 = iM25612 ^ i25;
                                        i36 = i24;
                                        i38 = i23;
                                        sArr4 = sArr4;
                                        break;
                                    case -1317264789:
                                    case -5622349:
                                        interfaceC15417 = null;
                                        iM25615 = C0630.m2566("ܶ᩸") ^ i34;
                                        i31 = ((iM25615 ^ i35) * (-23765)) ^ 1000930323;
                                        i32 = -1206560573;
                                        i37 = iM25615 ^ i32;
                                        i36 = i31;
                                        break;
                                    case -1125110583:
                                    case 706101988:
                                        C22628.m50612(c16563).m10235(i39);
                                        break;
                                    case -1045752934:
                                    case 1755095988:
                                        RunnableC1108.m3795(c16563, interfaceC178811, new InterfaceC18862() { // from class: l.᩷ۡܳ
                                            @Override // l.InterfaceC18862
                                            /* JADX INFO: renamed from: ۧ */
                                            public final void mo6267(AbstractC15440 abstractC15440) {
                                                int i48 = -1014491148;
                                                int i49 = C4117.f13076;
                                                int i50 = C3746.f11829;
                                                int iM25617 = C0630.m2566("᩻ۨ") ^ i49;
                                                int i51 = ((iM25617 ^ i50) * 23583) ^ (-458432874);
                                                int i52 = -1407738493;
                                                while (true) {
                                                    i48 = ((((i48 ^ i50) * 23901) >> 31) & i51) ^ (iM25617 ^ i52);
                                                    switch (i48) {
                                                        case -1956710502:
                                                        case -981189915:
                                                            if (C0714.f2697 >= 0) {
                                                                iM25617 = (C0630.m2566("ۨ᩷") ^ i49) * (-5);
                                                                i51 = ((iM25617 ^ i50) * 21557) ^ 444704554;
                                                                i52 = -1036656244;
                                                            } else {
                                                                iM25617 = C0630.m2566("ۘۙ") ^ i49;
                                                                i51 = ((iM25617 ^ i50) * (-6813)) ^ (-11649273);
                                                                i52 = 258252461;
                                                            }
                                                            break;
                                                        case -1943728972:
                                                        case 177172831:
                                                            if (C21923.f70183 == 0) {
                                                                iM25617 = (C0630.m2566("ۗ֡") ^ i50) * 39;
                                                                i51 = ((iM25617 ^ i49) * 28137) ^ 939521104;
                                                                i52 = 2126655116;
                                                            } else {
                                                                iM25617 = C2105.m6981("֡֫") ^ i50;
                                                                i51 = ((iM25617 ^ i49) * (-8507)) ^ 1474556838;
                                                                i52 = 1227360001;
                                                            }
                                                            break;
                                                        case -1404606405:
                                                        case 2035550493:
                                                            if (C0050.f910 >= 0) {
                                                                iM25617 = C0630.m2566("ۖ۟") ^ i50;
                                                                i51 = ((iM25617 ^ i49) * (-12995)) ^ 1833448000;
                                                                i52 = 1182938117;
                                                            } else {
                                                                iM25617 = (i50 - C0630.m2566("۠ܺ")) * 57;
                                                                i51 = ((iM25617 ^ i49) * 29979) ^ 1972861778;
                                                                i52 = -296130936;
                                                            }
                                                            break;
                                                        case -1223231904:
                                                        case 804387790:
                                                            ServiceConnectionC3453.m10564();
                                                            C21923.m49329();
                                                            break;
                                                        case -1172976651:
                                                        case 141118587:
                                                            if (C0483.f2088 >= 0) {
                                                                iM25617 = (C0630.m2566("ۨ᩷") ^ i49) * (-5);
                                                                i51 = ((iM25617 ^ i50) * 21557) ^ 444704554;
                                                                i52 = -1036656244;
                                                            } else {
                                                                iM25617 = (C0630.m2566("ᩴ᩺") ^ i50) * (-5);
                                                                i51 = ((iM25617 ^ i49) * 24763) ^ (-1564266611);
                                                                i52 = 1994594187;
                                                            }
                                                            break;
                                                        case -877525592:
                                                        case 623984194:
                                                            if (C2105.f7037 != 0) {
                                                                iM25617 = (C0630.m2566("ۗ֡") ^ i50) * 39;
                                                                i51 = ((iM25617 ^ i49) * 28137) ^ 939521104;
                                                                i52 = 2126655116;
                                                            } else {
                                                                iM25617 = (C2105.m6981("᩵ܽ") ^ i49) * (-5);
                                                                i51 = ((iM25617 ^ i50) * 18805) ^ (-1255500550);
                                                                i52 = -309449985;
                                                            }
                                                            break;
                                                        case -796218492:
                                                        case -193147283:
                                                            if (C4117.m12364() != 0) {
                                                                iM25617 = (C0630.m2566("ۨ᩷") ^ i49) * (-5);
                                                                i51 = ((iM25617 ^ i50) * 21557) ^ 444704554;
                                                                i52 = -1036656244;
                                                            } else {
                                                                iM25617 = (i50 - C2105.m6981("᩹ۢ")) * (-25);
                                                                i51 = ((iM25617 ^ i49) * (-26357)) ^ 203428331;
                                                                i52 = -802583482;
                                                            }
                                                            break;
                                                        case -706278011:
                                                        case 94170251:
                                                            if (C3683.f11629 < 0) {
                                                                iM25617 = (C2105.m6981("֡ۘ") ^ i49) * (-17);
                                                                i51 = ((iM25617 ^ i50) * 20765) ^ (-367149882);
                                                                i52 = 955543600;
                                                            } else {
                                                                iM25617 = C2105.m6981("֡֫") ^ i50;
                                                                i51 = ((iM25617 ^ i49) * (-8507)) ^ 1474556838;
                                                                i52 = 1227360001;
                                                            }
                                                            break;
                                                        case -467055058:
                                                        case -86164247:
                                                            if (C1711.f5919) {
                                                                iM25617 = C2105.m6981("֡֫") ^ i50;
                                                                i51 = ((iM25617 ^ i49) * (-8507)) ^ 1474556838;
                                                                i52 = 1227360001;
                                                            } else {
                                                                iM25617 = (C0630.m2566("ܶ᩸") ^ i50) * (-9);
                                                                i51 = ((iM25617 ^ i49) * 6513) ^ (-93807563);
                                                                i52 = 89523239;
                                                            }
                                                            break;
                                                        case -455874521:
                                                        case 72851744:
                                                            C22628.m50615();
                                                            iM25617 = C2105.m6981("֡֫") ^ i50;
                                                            i51 = ((iM25617 ^ i49) * (-8507)) ^ 1474556838;
                                                            i52 = 1227360001;
                                                            break;
                                                        case -151257874:
                                                        case 1910891410:
                                                            if (C7106.f21815 == 0) {
                                                                C4263.m12821(new C11101(c16563, abstractC15440));
                                                            }
                                                            iM25617 = C0630.m2566("ۖ۟") ^ i50;
                                                            i51 = ((iM25617 ^ i49) * (-12995)) ^ 1833448000;
                                                            i52 = 1182938117;
                                                            break;
                                                        case -53109227:
                                                        case 1729016262:
                                                            if (C2958.m9034() <= 0) {
                                                                iM25617 = (C0630.m2566("ۗ֡") ^ i50) * 39;
                                                                i51 = ((iM25617 ^ i49) * 28137) ^ 939521104;
                                                                i52 = 2126655116;
                                                            } else {
                                                                iM25617 = C0630.m2566("᩺ۨ") ^ i49;
                                                                i51 = ((iM25617 ^ i50) * 39) ^ 2013185821;
                                                                i52 = -1565102236;
                                                            }
                                                            break;
                                                        case 252562550:
                                                        case 542877225:
                                                            if (C0237.m1481() >= 0) {
                                                                iM25617 = (C0630.m2566("ۨ᩷") ^ i49) * (-5);
                                                                i51 = ((iM25617 ^ i50) * 21557) ^ 444704554;
                                                                i52 = -1036656244;
                                                            } else {
                                                                iM25617 = (C2105.m6981("֡ۘ") ^ i49) * (-17);
                                                                i51 = ((iM25617 ^ i50) * 20765) ^ (-367149882);
                                                                i52 = 955543600;
                                                            }
                                                            break;
                                                        case 1138385893:
                                                        case 1504567051:
                                                            if (RunnableC1108.m3790()) {
                                                                iM25617 = (C0630.m2566("ۗ֡") ^ i50) * 39;
                                                                i51 = ((iM25617 ^ i49) * 28137) ^ 939521104;
                                                                i52 = 2126655116;
                                                            } else {
                                                                iM25617 = C2105.m6981("᩵۟") ^ i49;
                                                                i51 = ((iM25617 ^ i50) * 22019) ^ (-947391324);
                                                                i52 = 657408575;
                                                            }
                                                            break;
                                                        default:
                                                            if (C1916.m6308() >= 0) {
                                                                iM25617 = (C0630.m2566("ۨ᩷") ^ i49) * (-5);
                                                                i51 = ((iM25617 ^ i50) * 21557) ^ 444704554;
                                                                i52 = -1036656244;
                                                            } else {
                                                                iM25617 = C0630.m2566("ܶ᩵") ^ i49;
                                                                i51 = ((iM25617 ^ i50) * 7905) ^ (-163187141);
                                                                i52 = -91354269;
                                                            }
                                                            break;
                                                    }
                                                    return;
                                                }
                                            }
                                        });
                                        break;
                                    case -963159184:
                                    case 1973387178:
                                        z = true;
                                        if (i22 != 1) {
                                            iM25615 = C0630.m2566("۬᩺") ^ i34;
                                            i31 = ((iM25615 ^ i35) * 663) ^ (-1375970479);
                                            i32 = -2056581980;
                                        } else {
                                            iM25615 = (C0630.m2566("ᩳۙ") ^ i34) * (-23);
                                            i31 = ((iM25615 ^ i35) * 22659) ^ 1491263231;
                                            i32 = 263613936;
                                        }
                                        i37 = iM25615 ^ i32;
                                        i36 = i31;
                                        break;
                                    case -949302805:
                                    case -766513101:
                                        break;
                                    case -934489648:
                                    case -305719265:
                                        C21923.m49336(c16563).m10235(iM25616);
                                        break;
                                    case -934322159:
                                    case 471317848:
                                        RunnableC1108.m3795(c16563, interfaceC178811, new InterfaceC18862() { // from class: l.ۜۡܳ

                                            /* JADX INFO: renamed from: ܰۡ۟, reason: not valid java name and contains not printable characters */
                                            private static final short[] f20684 = {1616, -2950, -2955, -2945, -2967, -2956, -2958, -2945, -3019, -2958, -2955, -2961, -2946, -2955, -2961, -3019, -2950, -2952, -2961, -2958, -2956, -2955, -3019, -2995, -2990, -2978, -2996, -2950, -2967, -2968, -2952, -2979, -2958, -2953, -2946};

                                            {
                                                int i48 = -1999799650;
                                                int i49 = C11340.f33930;
                                                int i50 = C2958.f9394;
                                                int iM25617 = C0630.m2566("᩸ۙ") ^ i49;
                                                int i51 = ((iM25617 ^ i50) * 30279) ^ (-467413467);
                                                int i52 = 2059013212;
                                                while (true) {
                                                    i48 = ((((i48 ^ i50) * (-22965)) >> 31) & i51) ^ (iM25617 ^ i52);
                                                    switch (i48) {
                                                        case -2078739834:
                                                        case -1265477488:
                                                            C0050.m940();
                                                            iM25617 = (C0630.m2566("ۗ᩷") + i49) * q.h;
                                                            i51 = ((iM25617 ^ i50) * 29837) ^ (-1281138561);
                                                            i52 = 1882073691;
                                                            break;
                                                        case -1953067481:
                                                        case 1378561398:
                                                            if (C1711.f5919) {
                                                                iM25617 = (C0630.m2566("᩹ۛ") + i50) * 99;
                                                                i51 = ((iM25617 ^ i49) * 19811) ^ 1448510323;
                                                                i52 = 1235384621;
                                                            } else {
                                                                iM25617 = C2105.m6981("۟۟") ^ i50;
                                                                i51 = ((iM25617 ^ i49) * 2579) ^ (-439361806);
                                                                i52 = -1255708103;
                                                            }
                                                            break;
                                                        case -1704779318:
                                                        case 637725590:
                                                            if (C3245.m9925() != 0) {
                                                                iM25617 = C0630.m2566("֨۬") ^ i50;
                                                                i51 = ((iM25617 ^ i49) * 11253) ^ 943700515;
                                                                i52 = 1067282716;
                                                            } else {
                                                                iM25617 = (C0630.m2566("ۗ᩷") + i49) * q.h;
                                                                i51 = ((iM25617 ^ i50) * 29837) ^ (-1281138561);
                                                                i52 = 1882073691;
                                                            }
                                                            break;
                                                        case -1366093823:
                                                        case -581568478:
                                                            if (C3432.f10845 >= 0) {
                                                                iM25617 = C0630.m2566("֨۬") ^ i50;
                                                                i51 = ((iM25617 ^ i49) * 11253) ^ 943700515;
                                                                i52 = 1067282716;
                                                            } else {
                                                                iM25617 = (i49 - C2105.m6981("ۧۖ")) * (-77);
                                                                i51 = ((iM25617 ^ i50) * (-23935)) ^ (-1640958735);
                                                                i52 = -1543367920;
                                                            }
                                                            break;
                                                        case -953959041:
                                                        case 1458094469:
                                                            if (C4263.f13799 <= 0) {
                                                                iM25617 = (C2105.m6981("ۜܶ") ^ i49) * 43;
                                                                i51 = ((iM25617 ^ i50) * (-8659)) ^ 621204749;
                                                                i52 = -2059759308;
                                                            } else {
                                                                iM25617 = C0630.m2566("۬ۗ") ^ i50;
                                                                i51 = ((iM25617 ^ i49) * (-7309)) ^ (-949755466);
                                                                i52 = -443096934;
                                                            }
                                                            break;
                                                        case -893444657:
                                                        case -214861993:
                                                            C22628.m50615();
                                                            if (!C1711.f5919) {
                                                                iM25617 = (C0630.m2566("ۗ᩷") + i49) * q.h;
                                                                i51 = ((iM25617 ^ i50) * 29837) ^ (-1281138561);
                                                                i52 = 1882073691;
                                                            } else {
                                                                iM25617 = (C0630.m2566("᩹ۛ") + i50) * 99;
                                                                i51 = ((iM25617 ^ i49) * 19811) ^ 1448510323;
                                                                i52 = 1235384621;
                                                            }
                                                            break;
                                                        case -680482100:
                                                        case 987809203:
                                                            if (C0050.f910 >= 0) {
                                                                iM25617 = (C0630.m2566("᩹ۛ") + i50) * 99;
                                                                i51 = ((iM25617 ^ i49) * 19811) ^ 1448510323;
                                                                i52 = 1235384621;
                                                            } else {
                                                                iM25617 = (i50 - C2105.m6981("ܰᩴ")) * (-19);
                                                                i51 = ((iM25617 ^ i49) * (-7729)) ^ 297747238;
                                                                i52 = -795935233;
                                                            }
                                                            break;
                                                        case -625983477:
                                                        case 519224104:
                                                            if (C0630.m2564()) {
                                                                iM25617 = C0630.m2566("֨۬") ^ i50;
                                                                i51 = ((iM25617 ^ i49) * 11253) ^ 943700515;
                                                                i52 = 1067282716;
                                                            } else {
                                                                iM25617 = (C2105.m6981("ܿۜ") + i49) * 63;
                                                                i51 = ((iM25617 ^ i50) * 24835) ^ (-1019959436);
                                                                i52 = 1190494153;
                                                            }
                                                            break;
                                                        case -534930214:
                                                        case 664136763:
                                                            if (C1711.f5919) {
                                                                iM25617 = C0630.m2566("ۡ᩵") ^ i50;
                                                                i51 = ((iM25617 ^ i49) * (-14067)) ^ 2021117788;
                                                                i52 = 517661252;
                                                            } else {
                                                                iM25617 = (C0630.m2566("ۧ֨") ^ i49) * 81;
                                                                i51 = ((iM25617 ^ i50) * (-18517)) ^ (-1087815178);
                                                                i52 = 826954285;
                                                            }
                                                            break;
                                                        case -336013465:
                                                        case 1644911272:
                                                            C11340.m28031();
                                                            if (!C11340.m28031()) {
                                                                iM25617 = (C2105.m6981("ۜܶ") ^ i49) * 43;
                                                                i51 = ((iM25617 ^ i50) * (-8659)) ^ 621204749;
                                                                i52 = -2059759308;
                                                            } else {
                                                                iM25617 = (C0630.m2566("᩹ۛ") + i50) * 99;
                                                                i51 = ((iM25617 ^ i49) * 19811) ^ 1448510323;
                                                                i52 = 1235384621;
                                                            }
                                                            break;
                                                        case 280291174:
                                                        case 1026027664:
                                                            if (C2958.f9394 >= 0) {
                                                                iM25617 = C0630.m2566("֨۬") ^ i50;
                                                                i51 = ((iM25617 ^ i49) * 11253) ^ 943700515;
                                                                i52 = 1067282716;
                                                            } else {
                                                                iM25617 = (i50 - C2105.m6981("᩶᩹")) * (-35);
                                                                i51 = ((iM25617 ^ i49) * (-15309)) ^ (-1746231);
                                                                i52 = -1666023714;
                                                            }
                                                            break;
                                                        case 282312576:
                                                        case 431269832:
                                                            return;
                                                        case 450580290:
                                                        case 1185986467:
                                                            if (C4117.f13076 <= 0) {
                                                                iM25617 = C0630.m2566("֨۬") ^ i50;
                                                                i51 = ((iM25617 ^ i49) * 11253) ^ 943700515;
                                                                i52 = 1067282716;
                                                            } else {
                                                                iM25617 = C0630.m2566("ۘۚ") ^ i49;
                                                                i51 = ((iM25617 ^ i50) * (-11715)) ^ (-1972455622);
                                                                i52 = -288736883;
                                                            }
                                                            break;
                                                        case 1074096974:
                                                        case 1624469549:
                                                            if (C22628.f73083 <= 0) {
                                                                iM25617 = C0630.m2566("ۡ᩵") ^ i50;
                                                                i51 = ((iM25617 ^ i49) * (-14067)) ^ 2021117788;
                                                                i52 = 517661252;
                                                            } else {
                                                                iM25617 = C2105.m6981("ۨܿ") ^ i50;
                                                                i51 = ((iM25617 ^ i49) * (-3545)) ^ (-905656699);
                                                                i52 = -1282232221;
                                                            }
                                                            break;
                                                        case 1811978250:
                                                        case 1886249038:
                                                            if (C1294.m4372() <= 0) {
                                                                iM25617 = (C2105.m6981("ۜܶ") ^ i49) * 43;
                                                                i51 = ((iM25617 ^ i50) * (-8659)) ^ 621204749;
                                                                i52 = -2059759308;
                                                            } else {
                                                                iM25617 = C0630.m2566("᩹֡") ^ i49;
                                                                i51 = ((iM25617 ^ i50) * (-17159)) ^ (-1835637967);
                                                                i52 = 319463435;
                                                            }
                                                            break;
                                                        default:
                                                            RunnableC1108.m3790();
                                                            C0422.m1963();
                                                            throw new RuntimeException();
                                                    }
                                                }
                                            }

                                            /* JADX WARN: Code duplicated, block: B:47:0x016f A[PHI: r2 r4 r17
                                              0x016f: PHI (r2v4 l.ܽۢܳ) = (r2v3 l.ܽۢܳ), (r2v2 l.ܽۢܳ) binds: [B:46:0x016d, B:35:0x00f6] A[DONT_GENERATE, DONT_INLINE]
                                              0x016f: PHI (r4v4 android.content.Intent) = (r4v3 android.content.Intent), (r4v2 android.content.Intent) binds: [B:46:0x016d, B:35:0x00f6] A[DONT_GENERATE, DONT_INLINE]
                                              0x016f: PHI (r17v15 int) = (r17v13 int), (r17v16 int) binds: [B:46:0x016d, B:35:0x00f6] A[DONT_GENERATE, DONT_INLINE]] */
                                            /* JADX WARN: Code duplicated, block: B:58:0x0207 A[PHI: r3 r8 r9 r17
                                              0x0207: PHI (r3v6 java.lang.String) = (r3v2 java.lang.String), (r3v5 java.lang.String), (r3v2 java.lang.String), (r3v2 java.lang.String) binds: [B:57:0x0205, B:31:0x00cf, B:27:0x00a6, B:16:0x005a] A[DONT_GENERATE, DONT_INLINE]
                                              0x0207: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:57:0x0205, B:31:0x00cf, B:27:0x00a6, B:16:0x005a] A[DONT_GENERATE, DONT_INLINE]
                                              0x0207: PHI (r9v4 short) = (r9v3 short), (r9v2 short), (r9v2 short), (r9v2 short) binds: [B:57:0x0205, B:31:0x00cf, B:27:0x00a6, B:16:0x005a] A[DONT_GENERATE, DONT_INLINE]
                                              0x0207: PHI (r17v20 int) = (r17v8 int), (r17v17 int), (r17v18 int), (r17v21 int) binds: [B:57:0x0205, B:31:0x00cf, B:27:0x00a6, B:16:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
                                            /* JADX WARN: Code duplicated, block: B:67:0x0276 A[PHI: r5 r6 r7 r11 r12 r13 r17 r18
                                              0x0276: PHI (r5v3 char) = (r5v2 char), (r5v2 char), (r5v2 char), (r5v2 char), (r5v5 char) binds: [B:66:0x0274, B:61:0x023c, B:39:0x011a, B:12:0x004c, B:7:0x0040] A[DONT_GENERATE, DONT_INLINE]
                                              0x0276: PHI (r6v4 short) = (r6v2 short), (r6v3 short), (r6v2 short), (r6v2 short), (r6v2 short) binds: [B:66:0x0274, B:61:0x023c, B:39:0x011a, B:12:0x004c, B:7:0x0040] A[DONT_GENERATE, DONT_INLINE]
                                              0x0276: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:66:0x0274, B:61:0x023c, B:39:0x011a, B:12:0x004c, B:7:0x0040] A[DONT_GENERATE, DONT_INLINE]
                                              0x0276: PHI (r11v4 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v3 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:66:0x0274, B:61:0x023c, B:39:0x011a, B:12:0x004c, B:7:0x0040] A[DONT_GENERATE, DONT_INLINE]
                                              0x0276: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:66:0x0274, B:61:0x023c, B:39:0x011a, B:12:0x004c, B:7:0x0040] A[DONT_GENERATE, DONT_INLINE]
                                              0x0276: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:66:0x0274, B:61:0x023c, B:39:0x011a, B:12:0x004c, B:7:0x0040] A[DONT_GENERATE, DONT_INLINE]
                                              0x0276: PHI (r17v26 int) = (r17v6 int), (r17v7 int), (r17v14 int), (r17v25 int), (r17v29 int) binds: [B:66:0x0274, B:61:0x023c, B:39:0x011a, B:12:0x004c, B:7:0x0040] A[DONT_GENERATE, DONT_INLINE]
                                              0x0276: PHI (r18v6 short[]) = (r18v5 short[]), (r18v4 short[]), (r18v4 short[]), (r18v4 short[]), (r18v4 short[]) binds: [B:66:0x0274, B:61:0x023c, B:39:0x011a, B:12:0x004c, B:7:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
                                            @Override // l.InterfaceC18862
                                            /* JADX INFO: renamed from: ۧ */
                                            public final void mo6267(AbstractC15440 abstractC15440) {
                                                int i48;
                                                int iM25617;
                                                int i49;
                                                int i50;
                                                C16560 c16564 = null;
                                                String strM5177 = null;
                                                char c = 0;
                                                short s4 = 0;
                                                int i51 = 0;
                                                int i52 = 0;
                                                short s5 = 0;
                                                int i53 = 0;
                                                short[] sArr7 = null;
                                                int i54 = 0;
                                                int i55 = 0;
                                                int i56 = -73591311;
                                                int i57 = C0050.f910;
                                                int i58 = C7811.f24123;
                                                int iM6988 = C2105.m6981("ۘܿ") ^ i58;
                                                int i59 = ((iM6988 ^ i57) * (-16557)) ^ (-527134540);
                                                int i60 = iM6988 ^ (-438539060);
                                                short[] sArr8 = null;
                                                while (true) {
                                                    Intent intent = null;
                                                    while (true) {
                                                        i48 = i60 ^ (i59 & (((i56 ^ i57) * 803) >> 31));
                                                        switch (i48) {
                                                            case -1978428595:
                                                            case -1764625733:
                                                                i53 = 54178;
                                                                iM25617 = C2105.m6981("ۚܳ") ^ i58;
                                                                i49 = ((iM25617 ^ i57) * 9037) ^ 1457577530;
                                                                i50 = 1128603918;
                                                                int i61 = i48;
                                                                i60 = iM25617 ^ i50;
                                                                i59 = i49;
                                                                i56 = i61;
                                                                break;
                                                            case -1748507309:
                                                            case -313334855:
                                                                C1420.m4913();
                                                                if (C2126.m7040()) {
                                                                    i48 = i48;
                                                                }
                                                                iM25617 = (C2105.m6981("֨۬") ^ i58) * (-21);
                                                                i48 = i48;
                                                                i49 = ((iM25617 ^ i57) * (-30141)) ^ 1955414907;
                                                                i50 = 781000634;
                                                                int i62 = i48;
                                                                i60 = iM25617 ^ i50;
                                                                i59 = i49;
                                                                i56 = i62;
                                                                break;
                                                            case -1590526587:
                                                            case -641048993:
                                                                i53 = 62491;
                                                                iM25617 = C2105.m6981("ۚܳ") ^ i58;
                                                                i49 = ((iM25617 ^ i57) * 9037) ^ 1457577530;
                                                                i50 = 1128603918;
                                                                int i63 = i48;
                                                                i60 = iM25617 ^ i50;
                                                                i59 = i49;
                                                                i56 = i63;
                                                                break;
                                                            case -1193086325:
                                                            case 1262663101:
                                                                i48 = i48;
                                                                C3663.m11172(intent, strM5177, C4117.m12359(abstractC15440));
                                                                if (C2126.f7087) {
                                                                    iM25617 = C2105.m6981("۠ۜ") ^ i58;
                                                                    i49 = ((iM25617 ^ i57) * 25273) ^ 392478362;
                                                                    i50 = 641203176;
                                                                } else {
                                                                    iM25617 = (C0630.m2566("֡ܰ") ^ i57) * (-71);
                                                                    i49 = ((iM25617 ^ i58) * 31239) ^ 1833963309;
                                                                    i50 = -1324303351;
                                                                }
                                                                int i64 = i48;
                                                                i60 = iM25617 ^ i50;
                                                                i59 = i49;
                                                                i56 = i64;
                                                                break;
                                                            case -974588805:
                                                            case -470785204:
                                                                i48 = i48;
                                                                s4 = sArr8[c];
                                                                i51 = s4 * s4;
                                                                if (C3663.m11168() >= 0) {
                                                                    iM25617 = C2105.m6981("᩶۟") ^ i57;
                                                                    i49 = ((iM25617 ^ i58) * 32211) ^ (-192439668);
                                                                    i50 = 269491117;
                                                                } else {
                                                                    iM25617 = (i57 - C2105.m6981("᩻᩶")) * (-59);
                                                                    i49 = ((iM25617 ^ i58) * 25369) ^ 1245270941;
                                                                    i50 = -1301662727;
                                                                }
                                                                int i65 = i48;
                                                                i60 = iM25617 ^ i50;
                                                                i59 = i49;
                                                                i56 = i65;
                                                                break;
                                                            case -938929431:
                                                            case 1412199148:
                                                                i48 = i48;
                                                                sArr8 = f20684;
                                                                if (C4263.m12819() >= 0) {
                                                                    iM25617 = C2105.m6981("᩶۟") ^ i57;
                                                                    i49 = ((iM25617 ^ i58) * 32211) ^ (-192439668);
                                                                    i50 = 269491117;
                                                                } else {
                                                                    iM25617 = C0630.m2566("۫֫") ^ i58;
                                                                    i49 = ((iM25617 ^ i57) * 29559) ^ 1200556074;
                                                                    i50 = 171417987;
                                                                }
                                                                int i66 = i48;
                                                                i60 = iM25617 ^ i50;
                                                                i59 = i49;
                                                                i56 = i66;
                                                                break;
                                                            case -908727801:
                                                            case -20542047:
                                                                if (C4616.f14690 <= 0) {
                                                                    i48 = i48;
                                                                    iM25617 = C2105.m6981("᩶۟") ^ i57;
                                                                    i49 = ((iM25617 ^ i58) * 32211) ^ (-192439668);
                                                                    i50 = 269491117;
                                                                    int i67 = i48;
                                                                    i60 = iM25617 ^ i50;
                                                                    i59 = i49;
                                                                    i56 = i67;
                                                                } else {
                                                                    i48 = i48;
                                                                }
                                                                break;
                                                            case -736713954:
                                                            case 1238077307:
                                                                C4159.m12565();
                                                                break;
                                                            case -574496814:
                                                            case -299133070:
                                                                i48 = i48;
                                                                strM5177 = C1504.m5177(f20684, 27, 8, i53);
                                                                if (C21923.f70183 != 0) {
                                                                    iM25617 = C2105.m6981("۠ۜ") ^ i58;
                                                                    i49 = ((iM25617 ^ i57) * 25273) ^ 392478362;
                                                                    i50 = 641203176;
                                                                } else {
                                                                    iM25617 = (C0630.m2566("֨֡") + i58) * 95;
                                                                    i49 = ((iM25617 ^ i57) * 26521) ^ 210749221;
                                                                    i50 = -1333874869;
                                                                }
                                                                int i68 = i48;
                                                                i60 = iM25617 ^ i50;
                                                                i59 = i49;
                                                                i56 = i68;
                                                                break;
                                                            case -572294694:
                                                            case 2136125426:
                                                                i48 = i48;
                                                                sArr7 = f20684;
                                                                i54 = 1;
                                                                i55 = 26;
                                                                if (C3537.m10746() <= 0) {
                                                                    iM25617 = C2105.m6981("᩶۟") ^ i57;
                                                                    i49 = ((iM25617 ^ i58) * 32211) ^ (-192439668);
                                                                    i50 = 269491117;
                                                                } else {
                                                                    iM25617 = (i58 - C0630.m2566("᩹۠")) * 9;
                                                                    i49 = ((iM25617 ^ i57) * 30613) ^ 1997613456;
                                                                    i50 = 369796378;
                                                                }
                                                                int i69 = i48;
                                                                i60 = iM25617 ^ i50;
                                                                i59 = i49;
                                                                i56 = i69;
                                                                break;
                                                            case -559773604:
                                                            case 84546606:
                                                                C1711.m5736();
                                                                C0964.m3413();
                                                                iM25617 = (C2105.m6981("֨۬") ^ i58) * (-21);
                                                                i48 = i48;
                                                                i49 = ((iM25617 ^ i57) * (-30141)) ^ 1955414907;
                                                                i50 = 781000634;
                                                                int i610 = i48;
                                                                i60 = iM25617 ^ i50;
                                                                i59 = i49;
                                                                i56 = i610;
                                                                break;
                                                            case -323600945:
                                                            case 867692348:
                                                                C1711.m5736();
                                                                if (C2105.m6982() != 0) {
                                                                    iM25617 = (C2105.m6981("֨۬") ^ i58) * (-21);
                                                                    i48 = i48;
                                                                    i49 = ((iM25617 ^ i57) * (-30141)) ^ 1955414907;
                                                                    i50 = 781000634;
                                                                } else {
                                                                    i48 = i48;
                                                                    iM25617 = C2105.m6981("۠ۜ") ^ i58;
                                                                    i49 = ((iM25617 ^ i57) * 25273) ^ 392478362;
                                                                    i50 = 641203176;
                                                                }
                                                                int i611 = i48;
                                                                i60 = iM25617 ^ i50;
                                                                i59 = i49;
                                                                i56 = i611;
                                                                break;
                                                            case -223002672:
                                                            case 1180341051:
                                                                i48 = i48;
                                                                c16564 = c16563;
                                                                Main mainM49336 = C21923.m49336(c16564);
                                                                if (C2520.f8000 < 0) {
                                                                    intent = new Intent(mainM49336, (Class<?>) ActivityC17169.class);
                                                                    C0798.m3009(intent, 268435456);
                                                                    if (C1294.f4556 >= 0) {
                                                                        iM25617 = (C2105.m6981("֫ۚ") + i58) * (-99);
                                                                        i49 = ((iM25617 ^ i57) * (-12199)) ^ (-652085749);
                                                                        i50 = -782528097;
                                                                    } else {
                                                                        iM25617 = (i57 - C2105.m6981("֫ܳ")) * (-53);
                                                                        i49 = ((iM25617 ^ i58) * (-25661)) ^ 26429178;
                                                                        i50 = 1813361755;
                                                                    }
                                                                    int i612 = i48;
                                                                    i60 = iM25617 ^ i50;
                                                                    i59 = i49;
                                                                    i56 = i612;
                                                                }
                                                                break;
                                                            case 200840608:
                                                            case 253545893:
                                                                i48 = i48;
                                                                if ((s4 * s5) - i52 <= 0) {
                                                                    iM25617 = C0630.m2566("۟ᩳ") ^ i57;
                                                                    i49 = ((iM25617 ^ i58) * (-30767)) ^ (-1549618398);
                                                                    i50 = 628075616;
                                                                } else {
                                                                    iM25617 = C2105.m6981("᩸֨") ^ i58;
                                                                    i49 = ((iM25617 ^ i57) * (-5177)) ^ (-516386478);
                                                                    i50 = 656543180;
                                                                }
                                                                int i613 = i48;
                                                                i60 = iM25617 ^ i50;
                                                                i59 = i49;
                                                                i56 = i613;
                                                                break;
                                                            case 795244405:
                                                            case 1595839693:
                                                                C9340.m24035(interfaceC178811, 2000);
                                                                C4075.m12261(C22628.m50612(c16564), intent);
                                                                break;
                                                            case 906634413:
                                                            case 1465086682:
                                                                i48 = i48;
                                                                intent.setAction(C0964.m3396(sArr7, i54, i55, i53));
                                                                if (C4117.f13076 <= 0) {
                                                                    iM25617 = (C2105.m6981("֫ۚ") + i58) * (-99);
                                                                    i49 = ((iM25617 ^ i57) * (-12199)) ^ (-652085749);
                                                                    i50 = -782528097;
                                                                } else {
                                                                    iM25617 = C2105.m6981("۠ۖ") ^ i57;
                                                                    i49 = ((iM25617 ^ i58) * 21023) ^ (-1417951258);
                                                                    i50 = 311316943;
                                                                }
                                                                int i614 = i48;
                                                                i60 = iM25617 ^ i50;
                                                                i59 = i49;
                                                                i56 = i614;
                                                                break;
                                                            case 1282334923:
                                                            case 1960819273:
                                                                i48 = i48;
                                                                i52 = i51 + 78428736;
                                                                s5 = 17712;
                                                                if (C0798.m2998() != 0) {
                                                                    iM25617 = C2105.m6981("۠ۜ") ^ i58;
                                                                    i49 = ((iM25617 ^ i57) * 25273) ^ 392478362;
                                                                    i50 = 641203176;
                                                                } else {
                                                                    iM25617 = C0630.m2566("ܺܿ") ^ i58;
                                                                    i49 = ((iM25617 ^ i57) * 32689) ^ (-961437572);
                                                                    i50 = -1173833822;
                                                                }
                                                                int i615 = i48;
                                                                i60 = iM25617 ^ i50;
                                                                i59 = i49;
                                                                i56 = i615;
                                                                break;
                                                            default:
                                                                i48 = i48;
                                                                c = 0;
                                                                if (C3245.m9925() != 0) {
                                                                    iM25617 = C2105.m6981("᩶۟") ^ i57;
                                                                    i49 = ((iM25617 ^ i58) * 32211) ^ (-192439668);
                                                                    i50 = 269491117;
                                                                } else {
                                                                    iM25617 = (C0630.m2566("ۧ۠") ^ i57) * 3;
                                                                    i49 = ((iM25617 ^ i58) * 5635) ^ (-885543708);
                                                                    i50 = 369174522;
                                                                }
                                                                int i616 = i48;
                                                                i60 = iM25617 ^ i50;
                                                                i59 = i49;
                                                                i56 = i616;
                                                                break;
                                                        }
                                                        return;
                                                    }
                                                    int iM25618 = (i57 - C0630.m2566("ۘ᩹")) * (-103);
                                                    i56 = i48;
                                                    i60 = iM25618 ^ (-2024558138);
                                                    i59 = ((iM25618 ^ i58) * 3517) ^ (-1192856485);
                                                }
                                            }
                                        });
                                        break;
                                    case -927837077:
                                    case -329131934:
                                        C2105.m6982();
                                        C3432.m10477();
                                        break;
                                    case -811446850:
                                    case 470754831:
                                        C19568.m45007(c16563, interfaceC178811, ActivityC6604.class);
                                        break;
                                    case -786334518:
                                    case -596193315:
                                        break;
                                    case -728773430:
                                    case -345591496:
                                        sArr4 = sArr4;
                                        i23 = i38;
                                        sArr6 = f41014;
                                        if (C0422.f1886 <= 0) {
                                            iM25612 = C2105.m6981("᩶ܰ") ^ i34;
                                            i24 = ((iM25612 ^ i35) * (-8349)) ^ 326530510;
                                            i25 = -472268440;
                                        } else {
                                            iM25612 = C2105.m6981("۫ۨ") ^ i35;
                                            i24 = ((iM25612 ^ i34) * (-8305)) ^ 145183409;
                                            i25 = -1824834306;
                                        }
                                        i37 = iM25612 ^ i25;
                                        i36 = i24;
                                        i38 = i23;
                                        sArr4 = sArr4;
                                        break;
                                    case -692391893:
                                    case 1160377446:
                                        if (i22 != 3) {
                                            iM25615 = (C0630.m2566("֨֫") ^ i34) * 33;
                                            i31 = ((iM25615 ^ i35) * 23459) ^ (-1839327285);
                                            i32 = 832392045;
                                        } else {
                                            iM25615 = C2105.m6981("۠᩹") ^ i34;
                                            i31 = ((iM25615 ^ i35) * 28029) ^ (-492543511);
                                            i32 = 1654160382;
                                        }
                                        i37 = iM25615 ^ i32;
                                        i36 = i31;
                                        break;
                                    case -496340496:
                                    case -90342354:
                                        if (C1047.m3602()) {
                                            iM25615 = C0630.m2566("ۢۛ") ^ i35;
                                            i31 = ((iM25615 ^ i34) * 16627) ^ 1760069311;
                                            i32 = 21312652;
                                        } else {
                                            iM25615 = C2105.m6981("ܿ᩷") ^ i35;
                                            i31 = ((iM25615 ^ i34) * (-13465)) ^ (-319452093);
                                            i32 = 1717775187;
                                        }
                                        i37 = iM25615 ^ i32;
                                        i36 = i31;
                                        break;
                                    case -289744533:
                                    case 834409773:
                                        sArr4 = sArr4;
                                        dialogInterface.dismiss();
                                        c16561 = c16560;
                                        interfaceC178811 = interfaceC178810;
                                        if (C0237.m1481() >= 0) {
                                            iM25613 = (C0630.m2566("᩹ۜ") ^ i35) * (-27);
                                            c16562 = c16561;
                                            i36 = ((iM25613 ^ i34) * 25193) ^ (-303510167);
                                            i26 = -862441745;
                                        } else {
                                            iM25613 = (C0630.m2566("ۢۜ") ^ i35) * 63;
                                            c16562 = c16561;
                                            i36 = ((iM25613 ^ i34) * 3945) ^ (-1320221850);
                                            i26 = 1207653586;
                                        }
                                        i30 = iM25613 ^ i26;
                                        c16563 = c16562;
                                        i37 = i30;
                                        sArr4 = sArr4;
                                        break;
                                    case -266981936:
                                    case 810464025:
                                        try {
                                            C21769.m49100(C21923.m49336(c16563), interfaceC15417);
                                            iM25615 = C0630.m2566("֡ۗ") ^ i34;
                                            i31 = ((iM25615 ^ i35) * (-179)) ^ 558094922;
                                            i32 = 1328639333;
                                        } catch (Throwable th) {
                                            obj = th;
                                            iM25615 = C2105.m6981("ܰۗ") ^ i35;
                                            i31 = ((iM25615 ^ i34) * (-7965)) ^ (-1069737498);
                                            i32 = -1582623422;
                                        }
                                        i37 = iM25615 ^ i32;
                                        i36 = i31;
                                        break;
                                    case -261001541:
                                    case 771463524:
                                        i46 = 2128119886;
                                        if (C2105.f7037 == 0) {
                                            iM25615 = C2105.m6981("᩷֨") ^ i34;
                                            i31 = ((iM25615 ^ i35) * 17515) ^ 97329142;
                                            i32 = 61230754;
                                            i37 = iM25615 ^ i32;
                                            i36 = i31;
                                        } else {
                                            sArr4 = sArr4;
                                            i23 = i38;
                                            iM25612 = C2105.m6981("᩶ܰ") ^ i34;
                                            i24 = ((iM25612 ^ i35) * (-8349)) ^ 326530510;
                                            i25 = -472268440;
                                            i37 = iM25612 ^ i25;
                                            i36 = i24;
                                            i38 = i23;
                                            sArr4 = sArr4;
                                        }
                                        break;
                                    case -190749199:
                                    case 496922348:
                                        C4075.m12263();
                                        if (RunnableC1937.f6483 < 0) {
                                            sArr4 = sArr4;
                                            i23 = i38;
                                            iM25612 = (i35 - C2105.m6981("᩶֫")) * (-9);
                                            i24 = ((iM25612 ^ i34) * (-32021)) ^ 799720444;
                                            i25 = -2099927108;
                                            i37 = iM25612 ^ i25;
                                            i36 = i24;
                                            i38 = i23;
                                            sArr4 = sArr4;
                                        } else {
                                            iM25615 = (C0630.m2566("ۜۙ") ^ i34) * 49;
                                            i31 = ((iM25615 ^ i35) * (-25759)) ^ 918755169;
                                            i32 = 1771171734;
                                            i37 = iM25615 ^ i32;
                                            i36 = i31;
                                        }
                                        break;
                                    case -153123460:
                                    case 6246513:
                                        sArr4 = sArr4;
                                        i23 = i38;
                                        int i48 = s3 + s2;
                                        if (i44 - (i48 * i48) >= 0) {
                                            iM25612 = C2105.m6981("ۤᩳ") ^ i35;
                                            i24 = ((iM25612 ^ i34) * 11547) ^ 1555606750;
                                            i25 = 802986118;
                                        } else {
                                            iM25612 = C2105.m6981("۟ܶ") ^ i35;
                                            i24 = ((iM25612 ^ i34) * (-16563)) ^ (-1154348551);
                                            i25 = -1079518817;
                                        }
                                        i37 = iM25612 ^ i25;
                                        i36 = i24;
                                        i38 = i23;
                                        sArr4 = sArr4;
                                        break;
                                    case -115515507:
                                    case 221310066:
                                        if (i22 != 2) {
                                            iM25615 = C2105.m6981("ۧᩳ") ^ i35;
                                            i31 = ((iM25615 ^ i34) * (-12241)) ^ 1886237805;
                                            i32 = 1562298387;
                                        } else {
                                            iM25615 = (C2105.m6981("ۢܳ") + i34) * (-53);
                                            i31 = ((iM25615 ^ i35) * 10267) ^ (-2088541804);
                                            i32 = 1554474110;
                                        }
                                        i37 = iM25615 ^ i32;
                                        i36 = i31;
                                        break;
                                    case -59639238:
                                    case 872664572:
                                        i41 = 33606;
                                        iM25612 = C0630.m2566("۬ۢ") ^ i34;
                                        i23 = i38;
                                        i24 = ((iM25612 ^ i35) * (-12447)) ^ 1823196412;
                                        i25 = -1175987837;
                                        i37 = iM25612 ^ i25;
                                        i36 = i24;
                                        i38 = i23;
                                        sArr4 = sArr4;
                                        break;
                                    case 281662849:
                                    case 1975793430:
                                        sArr4 = sArr4;
                                        i23 = i38;
                                        if (C0714.f2697 >= 0) {
                                            iM25612 = (i35 - C2105.m6981("᩶֫")) * (-9);
                                            i24 = ((iM25612 ^ i34) * (-32021)) ^ 799720444;
                                            i25 = -2099927108;
                                        } else {
                                            iM25612 = (C0630.m2566("ۨ᩹") ^ i34) * (-31);
                                            i24 = ((iM25612 ^ i35) * (-10139)) ^ 1710662819;
                                            i25 = -1749481199;
                                        }
                                        i37 = iM25612 ^ i25;
                                        i36 = i24;
                                        i38 = i23;
                                        sArr4 = sArr4;
                                        break;
                                    case 342110962:
                                    case 724546613:
                                        if (C0964.f3626 == 0) {
                                            iM6986 = i40;
                                            sArr4 = sArr4;
                                            i27 = i45;
                                            iM25614 = C2105.m6981("ܺܽ") ^ i34;
                                            i28 = iM6986;
                                            i36 = ((iM25614 ^ i35) * 16171) ^ (-1322406637);
                                            i29 = 470490432;
                                            i30 = iM25614 ^ i29;
                                            i45 = i27;
                                            i40 = i28;
                                            i37 = i30;
                                            sArr4 = sArr4;
                                        }
                                        c16561 = c16563;
                                        sArr4 = sArr4;
                                        iM25613 = (C0630.m2566("᩹ۜ") ^ i35) * (-27);
                                        c16562 = c16561;
                                        i36 = ((iM25613 ^ i34) * 25193) ^ (-303510167);
                                        i26 = -862441745;
                                        i30 = iM25613 ^ i26;
                                        c16563 = c16562;
                                        i37 = i30;
                                        sArr4 = sArr4;
                                        break;
                                    case 413084151:
                                    case 1273808121:
                                        sArr4 = sArr4;
                                        i23 = i38;
                                        s3 = sArr6[0];
                                        i43 = s3 * s3;
                                        if (C2958.f9394 >= 0) {
                                            iM25612 = C2105.m6981("᩶ܰ") ^ i34;
                                            i24 = ((iM25612 ^ i35) * (-8349)) ^ 326530510;
                                            i25 = -472268440;
                                        } else {
                                            iM25612 = C2105.m6981("ۘ᩹") ^ i35;
                                            i24 = ((iM25612 ^ i34) * (-31349)) ^ 1693267993;
                                            i25 = -852726882;
                                        }
                                        i37 = iM25612 ^ i25;
                                        i36 = i24;
                                        i38 = i23;
                                        sArr4 = sArr4;
                                        break;
                                    case 446321600:
                                    case 2013036156:
                                        sArr4 = f41014;
                                        i45 = 1;
                                        if (C4117.f13076 <= 0) {
                                            iM25615 = (C0630.m2566("ۜۙ") ^ i34) * 49;
                                            i31 = ((iM25615 ^ i35) * (-25759)) ^ 918755169;
                                            i32 = 1771171734;
                                        } else {
                                            iM25615 = C0630.m2566("ۛ֨") ^ i34;
                                            i31 = ((iM25615 ^ i35) * (-209)) ^ (-607096561);
                                            i32 = -1302878121;
                                        }
                                        i37 = iM25615 ^ i32;
                                        i36 = i31;
                                        break;
                                    case 705640625:
                                    case 1241439094:
                                        ServiceConnectionC3453.m10561(C22628.m50612(c16563), obj, interfaceC15417);
                                        break;
                                    case 826612269:
                                    case 1358161633:
                                        C3663.m11161(i39);
                                        C11182.m27726(C21923.m49336(c16563), z);
                                        break;
                                    case 973412291:
                                    case 1058572782:
                                        iM25616 = 2119287958 ^ C0630.m2566(C3019.m9250(sArr5, i38, i42, i41));
                                        if (i22 != 0) {
                                            iM25615 = (i34 - C2105.m6981("۠ۢ")) * 33;
                                            i31 = ((iM25615 ^ i35) * 29763) ^ (-2116360676);
                                            i32 = 1429711846;
                                        } else {
                                            iM25615 = (C2105.m6981("ۤ֫") + i35) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                            i31 = ((iM25615 ^ i34) * (-3581)) ^ (-1237080121);
                                            i32 = 1182221979;
                                        }
                                        i37 = iM25615 ^ i32;
                                        i36 = i31;
                                        break;
                                    case 973890466:
                                    case 1561467682:
                                        sArr4 = sArr4;
                                        i27 = i45;
                                        iM6986 = C2105.m6981(C1504.m5177(sArr4, i27, 3, i41));
                                        if (C1005.f3721) {
                                            iM25614 = (C0630.m2566("ۨ᩶") + i35) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                            i28 = iM6986;
                                            i36 = ((iM25614 ^ i34) * (-21865)) ^ 411219069;
                                            i29 = 1941954322;
                                        } else {
                                            iM25614 = C2105.m6981("ܺܽ") ^ i34;
                                            i28 = iM6986;
                                            i36 = ((iM25614 ^ i35) * 16171) ^ (-1322406637);
                                            i29 = 470490432;
                                        }
                                        i30 = iM25614 ^ i29;
                                        i45 = i27;
                                        i40 = i28;
                                        i37 = i30;
                                        sArr4 = sArr4;
                                        break;
                                    case 984069187:
                                    case 1879057923:
                                        if (C0630.f2410 <= 0) {
                                            iM25615 = C2105.m6981("ۢۧ") ^ i35;
                                            i31 = ((iM25615 ^ i34) * (-27675)) ^ (-811470456);
                                            i32 = 457003155;
                                            i37 = iM25615 ^ i32;
                                            i36 = i31;
                                        } else {
                                            c16561 = c16563;
                                            sArr4 = sArr4;
                                            iM25613 = (C0630.m2566("᩹ۜ") ^ i35) * (-27);
                                            c16562 = c16561;
                                            i36 = ((iM25613 ^ i34) * 25193) ^ (-303510167);
                                            i26 = -862441745;
                                            i30 = iM25613 ^ i26;
                                            c16563 = c16562;
                                            i37 = i30;
                                            sArr4 = sArr4;
                                        }
                                        break;
                                    default:
                                        if (C4075.f12947 >= 0) {
                                            sArr4 = sArr4;
                                            i23 = i38;
                                            iM25612 = (i34 - C0630.m2566("ܺᩴ")) * (-35);
                                            i24 = ((iM25612 ^ i35) * (-8475)) ^ (-1900642036);
                                            i25 = -1028968661;
                                            i37 = iM25612 ^ i25;
                                            i36 = i24;
                                            i38 = i23;
                                            sArr4 = sArr4;
                                        }
                                        c16561 = c16563;
                                        sArr4 = sArr4;
                                        iM25613 = (C0630.m2566("᩹ۜ") ^ i35) * (-27);
                                        c16562 = c16561;
                                        i36 = ((iM25613 ^ i34) * 25193) ^ (-303510167);
                                        i26 = -862441745;
                                        i30 = iM25613 ^ i26;
                                        c16563 = c16562;
                                        i37 = i30;
                                        sArr4 = sArr4;
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        iM6981 = (C2105.m6981("ᩴۜ") + i12) * (-57);
                        i = ((iM6981 ^ i11) * 32177) ^ 302252909;
                        i2 = -847696869;
                        i14 = iM6981 ^ i2;
                        int i1114 = i;
                        strM947 = strM947;
                        i13 = i1114;
                    } else {
                        iM2568 = (C0630.m2566("᩹ܽ") + i12) * (-41);
                        i3 = ((iM2568 ^ i11) * 30129) ^ 1385616463;
                        i9 = -318616315;
                        i14 = iM2568 ^ i9;
                        c16560 = c16560;
                        strM947 = strM947;
                        i13 = i3;
                    }
                    break;
                case 1752155545:
                case 2061816097:
                    strM947 = strM947;
                    strM10562 = strM10562;
                    C7106.m19117(arrayList, strM10563);
                    strM50602 = C22628.m50602(f63246, 339, 3, i15);
                    if (C3537.m10746() <= 0) {
                        iM2567 = (i11 - C0630.m2566("֨ۜ")) * 63;
                        i6 = ((iM2567 ^ i12) * 1255) ^ (-1813090048);
                        i8 = 654448421;
                    } else {
                        iM2567 = (C0630.m2566("ܺ֫") ^ i11) * (-91);
                        i6 = ((iM2567 ^ i12) * (-26655)) ^ 1899496599;
                        i8 = -1656946607;
                    }
                    i14 = iM2567 ^ i8;
                    strM947 = strM947;
                    strM10562 = strM10562;
                    i13 = i6;
                    interfaceC178810 = interfaceC17889;
                    break;
                default:
                    strM947 = strM947;
                    strM3789 = RunnableC1108.m3789(sArr2, 351, 1, i15);
                    if (!C1711.f5919) {
                        iM6981 = C0630.m2566("᩷ᩳ") ^ i12;
                        i = ((iM6981 ^ i11) * (-29371)) ^ 143246293;
                        i2 = 1996600754;
                        i14 = iM6981 ^ i2;
                        int i1115 = i;
                        strM947 = strM947;
                        i13 = i1115;
                    } else {
                        iM2568 = (C0630.m2566("᩹ܽ") + i12) * (-41);
                        i3 = ((iM2568 ^ i11) * 30129) ^ 1385616463;
                        i9 = -318616315;
                        i14 = iM2568 ^ i9;
                        c16560 = c16560;
                        strM947 = strM947;
                        i13 = i3;
                    }
                    break;
            }
            return;
        }
    }
}
