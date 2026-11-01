package p067l;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.analytics.pro.C0719o;
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
import org.bouncycastle.math.p080ec.rfc8032.Scalar25519;

/* JADX INFO: renamed from: l.᩵ܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05ZQ */
/* JADX INFO: loaded from: classes.dex */
public final class C20966 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f65864 = 0;

    /* JADX INFO: renamed from: ۛۜۜ, reason: not valid java name and contains not printable characters */
    private static final short[] f82953;

    /* JADX INFO: renamed from: ۜ */
    public static String f65865;

    /* JADX INFO: renamed from: ۧ */
    public static final HashSet f65866;

    /* JADX INFO: renamed from: ܳ */
    public static final byte[] f65867;

    /* JADX INFO: renamed from: ܽ */
    public static final ExecutorService f65868;

    /* JADX INFO: renamed from: ܿ */
    public static final byte[] f65869;

    /* JADX INFO: renamed from: ᩳ */
    public static final byte[] f65870;

    /* JADX INFO: renamed from: ᩻ */
    public static String f65871;

    /* JADX INFO: renamed from: ۧ */
    public static native void m47307(C18107 c18107, InterfaceC19370 interfaceC19370);

    /* JADX INFO: renamed from: ܽ */
    public static native void m47309(C18107 c18107, AbstractC17043 abstractC17043);

    /* JADX INFO: renamed from: ܿ */
    public static native void m47311(C18107 c18107, AbstractC17043 abstractC17043);

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
    /* JADX INFO: renamed from: ֫ */
    public static void m47294(Intent intent, Class cls, AbstractC18422 abstractC18422) {
        int iM55680;
        int i;
        int i2;
        int iM55681;
        int i3;
        Intent intent2 = intent;
        String strM55921 = null;
        String strM26416 = null;
        String strM26417 = null;
        short[] sArr = null;
        short s = 0;
        int i4 = 0;
        int i5 = 0;
        short[] sArr2 = null;
        int i6 = 0;
        int i7 = 573476146;
        int i8 = C1036.f81953;
        int i9 = C0898.f81858;
        int iM55682 = (C0873.m55680("ܺ᩸") + i9) * (-27);
        int i10 = ((iM55682 ^ i8) * (-32127)) ^ 1766092754;
        int i11 = iM55682 ^ (-624998699);
        boolean z = false;
        while (true) {
            i7 = i11 ^ (i10 & (((i7 ^ i8) * 12375) >> 31));
            switch (i7) {
                case -2115917713:
                case 707737739:
                    strM26417 = C11419.m26416(((C7280) abstractC18422).m16734());
                    if (strM26417 == null) {
                        iM55681 = C0946.m55979("᩸᩹") ^ i8;
                        i10 = ((iM55681 ^ i9) * 28819) ^ 318466615;
                        i3 = -1030065478;
                        i11 = iM55681 ^ i3;
                        intent2 = intent;
                    } else {
                        iM55680 = C0873.m55680("ۙۗ") ^ i8;
                        i = ((iM55680 ^ i9) * (-27031)) ^ (-910037994);
                        i2 = 754111898;
                        int i12 = i;
                        i11 = iM55680 ^ i2;
                        i10 = i12;
                    }
                    break;
                case -1928582473:
                case 1241253351:
                    C0937.m55918();
                    C0989.m56095();
                    break;
                case -1778522287:
                case -1057481898:
                    strM26416 = C11419.m26416(((C12574) abstractC18422).m28981());
                    if (strM26416 == null) {
                        iM55681 = C0946.m55979("᩸᩹") ^ i8;
                        i10 = ((iM55681 ^ i9) * 28819) ^ 318466615;
                        i3 = -1030065478;
                        i11 = iM55681 ^ i3;
                        intent2 = intent;
                    } else {
                        iM55680 = (C0946.m55979("ۜۗ") + i9) * 115;
                        i = ((iM55680 ^ i8) * (-2877)) ^ 1664514616;
                        i2 = -1704715920;
                        int i13 = i;
                        i11 = iM55680 ^ i2;
                        i10 = i13;
                    }
                    break;
                case -1678490113:
                case 621481046:
                    s = sArr[170];
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55681 = (C0946.m55979("ᩳܺ") + i9) * (-95);
                        i10 = ((iM55681 ^ i8) * (-26391)) ^ (-2059337150);
                        i3 = 960387937;
                    } else {
                        iM55681 = (C0946.m55979("᩻ۘ") ^ i8) * (-89);
                        i10 = ((iM55681 ^ i9) * 41) ^ 586501485;
                        i3 = 341817998;
                    }
                    i11 = iM55681 ^ i3;
                    intent2 = intent;
                    break;
                case -1471542762:
                case 1642667179:
                    i4 = (s * s) + 119661721;
                    if (C0949.f81897 >= 0) {
                        iM55681 = C0946.m55979("ܿۗ") ^ i8;
                        i10 = ((iM55681 ^ i9) * 28077) ^ (-747260923);
                        i3 = -1530725936;
                    } else {
                        iM55681 = C0946.m55979("ܿۘ") ^ i8;
                        i10 = ((iM55681 ^ i9) * 16559) ^ 1084310177;
                        i3 = 635374976;
                    }
                    i11 = iM55681 ^ i3;
                    intent2 = intent;
                    break;
                case -1326264301:
                case -1045569721:
                    if (C1003.f81929 <= 0) {
                        iM55681 = (i8 - C0946.m55979("ۚۛ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i10 = ((iM55681 ^ i9) * (-12667)) ^ (-1198860699);
                        i3 = 1324565835;
                    } else {
                        iM55681 = (C0873.m55680("ۨۘ") ^ i8) * (-59);
                        i10 = ((iM55681 ^ i9) * 30677) ^ 930132425;
                        i3 = -1108940151;
                    }
                    i11 = iM55681 ^ i3;
                    intent2 = intent;
                    break;
                case -1265734912:
                case -332506671:
                    i5 = 16840;
                    iM55681 = (i9 - C0873.m55680("ۚ᩺")) * 75;
                    i10 = ((iM55681 ^ i8) * (-4251)) ^ (-1476018083);
                    i3 = -1070062341;
                    i11 = iM55681 ^ i3;
                    intent2 = intent;
                    break;
                case -1191059588:
                case -904845167:
                    C1024.m56213(intent2, strM55921, strM26417);
                    iM55681 = C0946.m55979("᩸᩹") ^ i8;
                    i10 = ((iM55681 ^ i9) * 28819) ^ 318466615;
                    i3 = -1030065478;
                    i11 = iM55681 ^ i3;
                    intent2 = intent;
                    break;
                case -1102024957:
                case -85979425:
                    if (cls == ActivityC17874.class) {
                        int iM55979 = (i9 - C0946.m55979("ܽ۬")) * (-115);
                        i11 = iM55979 ^ (-217694501);
                        i10 = ((iM55979 ^ i8) * 10263) ^ 963970815;
                    } else {
                        iM55681 = C0946.m55979("᩸᩹") ^ i8;
                        i10 = ((iM55681 ^ i9) * 28819) ^ 318466615;
                        i3 = -1030065478;
                        i11 = iM55681 ^ i3;
                    }
                    intent2 = intent;
                    break;
                case -1019425556:
                case 1761887313:
                    if (i4 - (s * 21878) < 0) {
                        iM55681 = (C0946.m55979("᩷ܺ") ^ i8) * 37;
                        i10 = ((iM55681 ^ i9) * 10981) ^ (-611164913);
                        i3 = -353755058;
                    } else {
                        iM55681 = (C0946.m55979("ۢۨ") + i9) * 119;
                        i10 = ((iM55681 ^ i8) * 1677) ^ 24093872;
                        i3 = -34107979;
                    }
                    i11 = iM55681 ^ i3;
                    intent2 = intent;
                    break;
                case -1018723253:
                case 2022845330:
                    if (C0890.m55740()) {
                        iM55681 = (i8 - C0873.m55680("᩸ۜ")) * (-81);
                        i10 = ((iM55681 ^ i9) * 22043) ^ 386808384;
                        i3 = 688397895;
                    } else {
                        iM55681 = (i9 - C0946.m55979("۠ܽ")) * 95;
                        i10 = ((iM55681 ^ i8) * 7475) ^ 1734855627;
                        i3 = 1325650482;
                    }
                    i11 = iM55681 ^ i3;
                    intent2 = intent;
                    break;
                case -1011024400:
                case -977791784:
                    sArr = f82953;
                    if (RunnableC0938.f81886 >= 0) {
                        iM55681 = (i9 - C0946.m55979("۠ܽ")) * 95;
                        i10 = ((iM55681 ^ i8) * 7475) ^ 1734855627;
                        i3 = 1325650482;
                    } else {
                        iM55681 = (C0946.m55979("᩶ۗ") ^ i9) * 7;
                        i10 = ((iM55681 ^ i8) * 4205) ^ (-360574421);
                        i3 = 515483145;
                    }
                    i11 = iM55681 ^ i3;
                    intent2 = intent;
                    break;
                case -898057083:
                case 339251902:
                    if (!(abstractC18422 instanceof C7280)) {
                        iM55681 = C0946.m55979("᩸᩹") ^ i8;
                        i10 = ((iM55681 ^ i9) * 28819) ^ 318466615;
                        i3 = -1030065478;
                        i11 = iM55681 ^ i3;
                        intent2 = intent;
                    } else {
                        iM55680 = (i9 - C0873.m55680("ܺ᩻")) * (-55);
                        i = ((iM55680 ^ i8) * (-9105)) ^ 467418706;
                        i2 = 32972084;
                        int i14 = i;
                        i11 = iM55680 ^ i2;
                        i10 = i14;
                    }
                    break;
                case -832175145:
                case 618159382:
                    C0947.m55997();
                    iM55680 = (i9 - C0946.m55979("᩹ۤ")) * (-31);
                    i = ((iM55680 ^ i8) * (-10457)) ^ (-1231874584);
                    i2 = -1315225222;
                    int i15 = i;
                    i11 = iM55680 ^ i2;
                    i10 = i15;
                    break;
                case -776735571:
                case 1897836915:
                    if (C0946.m55980() != 0) {
                        iM55681 = (C0946.m55979("ᩳܺ") + i9) * (-95);
                        i10 = ((iM55681 ^ i8) * (-26391)) ^ (-2059337150);
                        i3 = 960387937;
                    } else {
                        iM55681 = C0873.m55680("ۖᩴ") ^ i9;
                        i10 = ((iM55681 ^ i8) * 22627) ^ (-1876604675);
                        i3 = -920045871;
                    }
                    i11 = iM55681 ^ i3;
                    intent2 = intent;
                    break;
                case -634477640:
                case -107445195:
                    if (C1194.m56396() <= 0) {
                        iM55681 = (i9 - C0946.m55979("۠ܽ")) * 95;
                        i10 = ((iM55681 ^ i8) * 7475) ^ 1734855627;
                        i3 = 1325650482;
                    } else {
                        iM55681 = (i9 - C0946.m55979("۠ܳ")) * 41;
                        i10 = ((iM55681 ^ i8) * (-15167)) ^ 2042367807;
                        i3 = 783243460;
                    }
                    i11 = iM55681 ^ i3;
                    intent2 = intent;
                    break;
                case -622726599:
                case 1109473469:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55681 = (i8 - C0946.m55979("ۚۛ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i10 = ((iM55681 ^ i9) * (-12667)) ^ (-1198860699);
                        i3 = 1324565835;
                        i11 = iM55681 ^ i3;
                        intent2 = intent;
                    } else {
                        iM55680 = (i9 - C0946.m55979("᩹ۤ")) * (-31);
                        i = ((iM55680 ^ i8) * (-10457)) ^ (-1231874584);
                        i2 = -1315225222;
                        int i16 = i;
                        i11 = iM55680 ^ i2;
                        i10 = i16;
                    }
                    break;
                case -568436866:
                case 2137848145:
                    boolean z2 = abstractC18422 instanceof C12574;
                    sArr2 = f82953;
                    if (C1046.f81962 <= 0) {
                        z = z2;
                        i6 = 171;
                        iM55681 = (i8 - C0946.m55979("ۚۛ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i10 = ((iM55681 ^ i9) * (-12667)) ^ (-1198860699);
                        i3 = 1324565835;
                        i11 = iM55681 ^ i3;
                        intent2 = intent;
                    } else {
                        int iM55683 = (C0873.m55680("ۜ᩺") + i8) * (-81);
                        int i17 = ((iM55683 ^ i9) * 22703) ^ 1296674795;
                        i11 = iM55683 ^ (-1882166561);
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
                    C0917.m55843(intent2, strM55921, strM26416);
                    break;
                case -319786450:
                case 746002566:
                    if (C0890.m55740()) {
                        iM55681 = (i9 - C0946.m55979("۠ܽ")) * 95;
                        i10 = ((iM55681 ^ i8) * 7475) ^ 1734855627;
                        i3 = 1325650482;
                        i11 = iM55681 ^ i3;
                        intent2 = intent;
                    }
                    iM55681 = C0946.m55979("ܿۗ") ^ i8;
                    i10 = ((iM55681 ^ i9) * 28077) ^ (-747260923);
                    i3 = -1530725936;
                    i11 = iM55681 ^ i3;
                    intent2 = intent;
                    break;
                case 137465655:
                case 1661901484:
                    i5 = 23026;
                    iM55681 = (i9 - C0873.m55680("ۚ᩺")) * 75;
                    i10 = ((iM55681 ^ i8) * (-4251)) ^ (-1476018083);
                    i3 = -1070062341;
                    i11 = iM55681 ^ i3;
                    intent2 = intent;
                    break;
                case 998094844:
                case 1955841968:
                    if (C0927.m55873() <= 0) {
                        iM55681 = (i8 - C0946.m55979("ۚۛ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i10 = ((iM55681 ^ i9) * (-12667)) ^ (-1198860699);
                        i3 = 1324565835;
                    } else {
                        iM55681 = (i9 - C0946.m55979("᩻ۨ")) * 3;
                        i10 = ((iM55681 ^ i8) * 7339) ^ 1067087460;
                        i3 = -633430527;
                    }
                    i11 = iM55681 ^ i3;
                    intent2 = intent;
                    break;
                case 1381918386:
                case 2114265090:
                    strM55921 = C0937.m55921(sArr2, i6, 12, i5);
                    if (z) {
                        iM55680 = C0873.m55680("ۧᩳ") ^ i8;
                        i = ((iM55680 ^ i9) * (-9753)) ^ 465159088;
                        i2 = 1931358504;
                    } else {
                        iM55680 = (C0946.m55979("ᩳ᩸") + i9) * 13;
                        i = ((iM55680 ^ i8) * 19627) ^ 996565327;
                        i2 = -1532502836;
                    }
                    int i18 = i;
                    i11 = iM55680 ^ i2;
                    i10 = i18;
                    break;
                case 1940827513:
                case 1987351534:
                    if (C1048.m56305() >= 0) {
                        iM55681 = C0946.m55979("ܿۗ") ^ i8;
                        i10 = ((iM55681 ^ i9) * 28077) ^ (-747260923);
                        i3 = -1530725936;
                    } else {
                        iM55681 = (C0873.m55680("ۜۘ") + i8) * (-71);
                        i10 = ((iM55681 ^ i9) * (-25767)) ^ (-1996660857);
                        i3 = -2015551046;
                    }
                    i11 = iM55681 ^ i3;
                    intent2 = intent;
                    break;
                default:
                    if (C0898.f81858 > 0) {
                        iM55681 = C0946.m55979("ܿۗ") ^ i8;
                        i10 = ((iM55681 ^ i9) * 28077) ^ (-747260923);
                        i3 = -1530725936;
                        i11 = iM55681 ^ i3;
                        intent2 = intent;
                    } else {
                        iM55680 = (i9 - C0946.m55979("᩹ۤ")) * (-31);
                        i = ((iM55680 ^ i8) * (-10457)) ^ (-1231874584);
                        i2 = -1315225222;
                        int i19 = i;
                        i11 = iM55680 ^ i2;
                        i10 = i19;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m47302(C18107 c18107, InterfaceC19370 interfaceC19370, Class cls) {
        int i = 821884864;
        int i2 = C1229.f82066;
        int i3 = C1071.f81975;
        int iM55979 = C0946.m55979("ۜܽ") ^ i3;
        int i4 = ((iM55979 ^ i2) * 10739) ^ 158696665;
        int i5 = -1207223799;
        while (true) {
            i = ((((i ^ i2) * 6707) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1632616664:
                case 695356707:
                    if (C0906.f81862 >= 0) {
                        iM55979 = (C0946.m55979("᩺۠") ^ i2) * 9;
                        i4 = ((iM55979 ^ i3) * (-9407)) ^ (-1770351344);
                        i5 = 528952564;
                    } else {
                        iM55979 = C0873.m55680("᩸ۛ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-3335)) ^ (-124814927);
                        i5 = 1427864613;
                    }
                    break;
                case -1546420167:
                case 448580740:
                    ServiceConnectionC1013.m56157();
                    if (C0863.f81833 > 0) {
                        iM55979 = (C0946.m55979("᩺۠") ^ i2) * 9;
                        i4 = ((iM55979 ^ i3) * (-9407)) ^ (-1770351344);
                        i5 = 528952564;
                    } else {
                        iM55979 = (C0873.m55680("۟ۤ") ^ i3) * 65;
                        i4 = ((iM55979 ^ i2) * (-28493)) ^ (-332768977);
                        i5 = -2007433669;
                    }
                    break;
                case -1432861596:
                case 1578424605:
                    if (C0863.f81833 > 0) {
                        iM55979 = (i3 - C0946.m55979("ۛܿ")) * 123;
                        i4 = ((iM55979 ^ i2) * (-28859)) ^ 144606200;
                        i5 = -1501315640;
                    } else {
                        iM55979 = (C0873.m55680("۟ۤ") ^ i3) * 65;
                        i4 = ((iM55979 ^ i2) * (-28493)) ^ (-332768977);
                        i5 = -2007433669;
                    }
                    break;
                case -1200134669:
                case 1940101510:
                    if (C0873.f81841 <= 0) {
                        iM55979 = (i3 - C0946.m55979("ۛܿ")) * 123;
                        i4 = ((iM55979 ^ i2) * (-28859)) ^ 144606200;
                        i5 = -1501315640;
                    } else {
                        iM55979 = (i2 - C0946.m55979("ܽۚ")) * 97;
                        i4 = ((iM55979 ^ i3) * (-22349)) ^ (-2033012819);
                        i5 = -1976587787;
                    }
                    break;
                case -1125319240:
                case -476676617:
                    if (RunnableC0897.f81856) {
                        iM55979 = (C0873.m55680("ܿܰ") ^ i3) * 49;
                        i4 = ((iM55979 ^ i2) * (-25391)) ^ 293025780;
                        i5 = 2128866727;
                    } else {
                        iM55979 = C0946.m55979("ܰ᩷") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-18323)) ^ (-1427716227);
                        i5 = -2056738882;
                    }
                    break;
                case -1114237829:
                case 1029296860:
                    if (C1229.f82066 >= 0) {
                        iM55979 = (C0873.m55680("۟ۤ") ^ i3) * 65;
                        i4 = ((iM55979 ^ i2) * (-28493)) ^ (-332768977);
                        i5 = -2007433669;
                    } else {
                        iM55979 = C0873.m55680("ܳ۠") ^ i2;
                        i4 = ((iM55979 ^ i3) * 4037) ^ 481177461;
                        i5 = 1591366355;
                    }
                    break;
                case -531266334:
                case -229963525:
                    RunnableC0897.m55789(c18107, interfaceC19370, new C14734(cls, c18107, interfaceC19370));
                    break;
                case -506689473:
                case 445695084:
                    if (C0873.f81841 <= 0) {
                        iM55979 = (i3 - C0946.m55979("ۛܿ")) * 123;
                        i4 = ((iM55979 ^ i2) * (-28859)) ^ 144606200;
                        i5 = -1501315640;
                    } else {
                        iM55979 = (C0873.m55680("ۧ֨") ^ i2) * 75;
                        i4 = ((iM55979 ^ i3) * 12731) ^ 362637806;
                        i5 = 779755233;
                    }
                    break;
                case -423899863:
                case 2041937376:
                    if (C0917.f81868) {
                        iM55979 = (C0873.m55680("۟ۤ") ^ i3) * 65;
                        i4 = ((iM55979 ^ i2) * (-28493)) ^ (-332768977);
                        i5 = -2007433669;
                    } else {
                        iM55979 = C0873.m55680("᩺ܳ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 14201) ^ (-492525513);
                        i5 = -1025470852;
                    }
                    break;
                case -282431079:
                case 315715550:
                    C0854.m55595();
                    break;
                case -200207372:
                case 389415398:
                    if (C0906.f81862 >= 0) {
                        iM55979 = (C0873.m55680("۟ۤ") ^ i3) * 65;
                        i4 = ((iM55979 ^ i2) * (-28493)) ^ (-332768977);
                        i5 = -2007433669;
                    } else {
                        iM55979 = C0946.m55979("᩵֡") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-24503)) ^ 783928372;
                        i5 = 1969755709;
                    }
                    break;
                case 253956995:
                case 931980091:
                    if (C0877.m55696()) {
                        iM55979 = (C0873.m55680("ܰۨ") + i3) * 25;
                        i4 = ((iM55979 ^ i2) * (-28467)) ^ 80980805;
                        i5 = -954421319;
                    } else {
                        iM55979 = C0873.m55680("ܳ۠") ^ i2;
                        i4 = ((iM55979 ^ i3) * 4037) ^ 481177461;
                        i5 = 1591366355;
                    }
                    break;
                case 259227649:
                case 1704965495:
                    if (C0863.f81833 <= 0) {
                        iM55979 = (C0946.m55979("᩺۠") ^ i2) * 9;
                        i4 = ((iM55979 ^ i3) * (-9407)) ^ (-1770351344);
                        i5 = 528952564;
                    } else {
                        iM55979 = (C0873.m55680("۬۫") ^ i2) * (-65);
                        i4 = ((iM55979 ^ i3) * (-12493)) ^ (-211525929);
                        i5 = 1860510832;
                    }
                    break;
                case 1406202161:
                case 1809619558:
                    if (C1017.f81942 >= 0) {
                        iM55979 = (i3 - C0946.m55979("ۛܿ")) * 123;
                        i4 = ((iM55979 ^ i2) * (-28859)) ^ 144606200;
                        i5 = -1501315640;
                    } else {
                        iM55979 = C0946.m55979("᩷ۗ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-5449)) ^ 1857086600;
                        i5 = -934902809;
                    }
                    break;
                case 1562685534:
                case 1617461687:
                    C1124.m56367();
                    iM55979 = C0873.m55680("ܳ۠") ^ i2;
                    i4 = ((iM55979 ^ i3) * 4037) ^ 481177461;
                    i5 = 1591366355;
                    break;
                default:
                    if (C0927.f81875) {
                        iM55979 = C0946.m55979("ܰ᩷") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-18323)) ^ (-1427716227);
                        i5 = -2056738882;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ۧۛ")) * (-13);
                        i4 = ((iM55979 ^ i2) * (-1975)) ^ 1308172546;
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
    /* JADX INFO: renamed from: ᩳ */
    public static void m47313(C18107 c18107, AbstractC17043 abstractC17043) throws Throwable {
        int iM55979;
        int i;
        int i2;
        int iM55680;
        int i3;
        int i4;
        int iM55681;
        int i5;
        int i6;
        int iM55682;
        int i7;
        int iM559710;
        int i8;
        C18107 c18108 = c18107;
        int i9 = C0912.f81867;
        int i10 = C0894.f81854;
        int iM55683 = (C0873.m55680("ܶ֨") ^ i9) * 81;
        int i11 = ((iM55683 ^ i10) * (-7815)) ^ (-599356323);
        C13746 c13746M26103 = null;
        Throwable th = null;
        AbstractC18422 abstractC18422 = null;
        C11075 c11075 = null;
        short[] sArr = null;
        int i12 = iM55683 ^ (-2066456507);
        int size = 0;
        int i13 = 0;
        boolean z = false;
        boolean zM55949 = false;
        int i14 = 0;
        short s = 0;
        int i15 = 0;
        int i16 = 0;
        short s2 = 0;
        int i17 = 405713138;
        char c = 0;
        C11245 c11245M41242 = null;
        String strM56297 = null;
        while (true) {
            i17 = i12 ^ (i11 & (((i17 ^ i10) * 20177) >> 31));
            switch (i17) {
                case -2053735044:
                case -1263047710:
                    i15 = i15;
                    if (z) {
                        iM559710 = (C0873.m55680("ۜ᩵") + i10) * 57;
                        i = ((iM559710 ^ i9) * 24653) ^ 1583630124;
                        i8 = -198245144;
                    } else {
                        iM559710 = (C0873.m55680("᩵ۡ") ^ i10) * 19;
                        i = ((iM559710 ^ i9) * 13521) ^ 1800325461;
                        i8 = -1160842549;
                    }
                    int i18 = iM559710 ^ i8;
                    i15 = i15;
                    i12 = i18;
                    i11 = i;
                    break;
                case -2003697651:
                case -614586766:
                    C0949.m56012();
                    return;
                case -1991638364:
                case 415606258:
                    try {
                        i15 = i15;
                        try {
                            c11075.mo37385(C1071.m56336(f82953, 548, 1, i14));
                            c18107.m41242().m26069(c18108, i13, true);
                            iM559710 = (C0946.m55979("ܰ֨") + i9) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i = ((iM559710 ^ i10) * (-13677)) ^ 1627946867;
                            i8 = -1489132287;
                            int i19 = iM559710 ^ i8;
                            i15 = i15;
                            i12 = i19;
                            i11 = i;
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            iM55680 = C0946.m55979("ۧᩳ") ^ i10;
                            i3 = ((iM55680 ^ i9) * (-26967)) ^ (-1354239475);
                            i4 = 1542156125;
                            int i20 = i15;
                            i12 = iM55680 ^ i4;
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
                    C11075 c11076 = (C11075) abstractC18422;
                    try {
                        zM55949 = ViewOnClickListenerC0939.m55949(strM56297, c11076.m25520());
                        int iM55684 = C0873.m55680("֫ۘ") ^ i9;
                        i15 = i15;
                        i12 = iM55684 ^ (-648100876);
                        i11 = ((iM55684 ^ i10) * (-28693)) ^ (-1298524004);
                        c11075 = c11076;
                    } catch (Throwable th4) {
                        th = th4;
                        c11075 = c11076;
                        iM55680 = C0946.m55979("ۧᩳ") ^ i10;
                        i3 = ((iM55680 ^ i9) * (-26967)) ^ (-1354239475);
                        i4 = 1542156125;
                        int i21 = i15;
                        i12 = iM55680 ^ i4;
                        i11 = i3;
                        i15 = i21;
                    }
                    break;
                case -1906626084:
                case -1134656467:
                    i15 = i15;
                    c = 547;
                    if (!C0947.f81895) {
                        iM55681 = C0946.m55979("᩸ܰ") ^ i9;
                        i5 = ((iM55681 ^ i10) * (-2571)) ^ (-875033276);
                        i6 = -1281124196;
                        int i22 = iM55681 ^ i6;
                        i15 = i15;
                        i12 = i22;
                        i11 = i5;
                        c18108 = c18107;
                    }
                    i15 = i15;
                    iM55682 = C0873.m55680("᩶ܺ") ^ i10;
                    i5 = ((iM55682 ^ i9) * 32051) ^ (-1415177955);
                    i7 = 1715433815;
                    i12 = iM55682 ^ i7;
                    i11 = i5;
                    c18108 = c18107;
                    break;
                case -1719382720:
                case -11350429:
                    i15 = i15;
                    AbstractC18422 abstractC18423 = (AbstractC18422) c13746M26103.get(i13);
                    try {
                        z = abstractC18423 instanceof C11075;
                        int iM55685 = (C0873.m55680("ܰۨ") + i9) * (-95);
                        i15 = i15;
                        i12 = iM55685 ^ 1674850094;
                        i11 = ((iM55685 ^ i10) * (-30245)) ^ 1491887033;
                        abstractC18422 = abstractC18423;
                    } catch (Throwable th5) {
                        th = th5;
                        abstractC18422 = abstractC18423;
                        iM55680 = C0946.m55979("ۧᩳ") ^ i10;
                        i3 = ((iM55680 ^ i9) * (-26967)) ^ (-1354239475);
                        i4 = 1542156125;
                        int i23 = i15;
                        i12 = iM55680 ^ i4;
                        i11 = i3;
                        i15 = i23;
                    }
                    break;
                case -1701531923:
                case -710747999:
                    i15 = i15;
                    if (zM55949) {
                        iM559710 = (C0946.m55979("ܿܶ") + i10) * (-123);
                        i = ((iM559710 ^ i9) * (-19947)) ^ (-1816075982);
                        i8 = 505653170;
                    } else {
                        iM559710 = (C0873.m55680("᩵ۡ") ^ i10) * 19;
                        i = ((iM559710 ^ i9) * 13521) ^ 1800325461;
                        i8 = -1160842549;
                    }
                    int i110 = iM559710 ^ i8;
                    i15 = i15;
                    i12 = i110;
                    i11 = i;
                    break;
                case -1610121479:
                case -460533014:
                    i15 = i15;
                    if (C1964.f83032 > 0) {
                        iM55681 = (C0873.m55680("ۘۘ") + i10) * (-3);
                        i5 = ((iM55681 ^ i9) * (-22999)) ^ 593615666;
                        i6 = -2702041;
                        int i24 = iM55681 ^ i6;
                        i15 = i15;
                        i12 = i24;
                        i11 = i5;
                        c18108 = c18107;
                    }
                    i15 = i15;
                    iM55682 = C0873.m55680("᩶ܺ") ^ i10;
                    i5 = ((iM55682 ^ i9) * 32051) ^ (-1415177955);
                    i7 = 1715433815;
                    i12 = iM55682 ^ i7;
                    i11 = i5;
                    c18108 = c18107;
                    break;
                case -1601008353:
                case -1341895538:
                    C1048.m56305();
                    if (RunnableC0871.m55672() >= 0) {
                        i15 = i15;
                        iM55681 = (C0873.m55680("᩸۠") ^ i10) * (-11);
                        i5 = ((iM55681 ^ i9) * (-5111)) ^ 1890569576;
                        i6 = -1771948919;
                        int i25 = iM55681 ^ i6;
                        i15 = i15;
                        i12 = i25;
                        i11 = i5;
                        c18108 = c18107;
                    } else {
                        i15 = i15;
                        iM55680 = C0946.m55979("ۢܺ") ^ i10;
                        i3 = ((iM55680 ^ i9) * 27287) ^ (-869196308);
                        i4 = 1445396355;
                        int i26 = i15;
                        i12 = iM55680 ^ i4;
                        i11 = i3;
                        i15 = i26;
                    }
                    break;
                case -1572062613:
                case -936908752:
                    i15 = i15;
                    c13746M26103 = c11245M41242.m26103();
                    c13746M26103.m31299();
                    iM55680 = C0946.m55979("ۘ֫") ^ i9;
                    i3 = ((iM55680 ^ i10) * (-31159)) ^ (-1275367226);
                    i4 = -1430997210;
                    int i27 = i15;
                    i12 = iM55680 ^ i4;
                    i11 = i3;
                    i15 = i27;
                    break;
                case -1471964190:
                case 625975081:
                    i15 = i15;
                    sArr = f82953;
                    if (C1194.f82045 != 0) {
                        iM55681 = (C0946.m55979("ۧ᩸") + i10) * (-63);
                        i5 = ((iM55681 ^ i9) * (-12867)) ^ 1796315804;
                        i6 = -424063084;
                    } else {
                        iM55681 = (C0873.m55680("ᩴ۬") + i9) * (-23);
                        i5 = ((iM55681 ^ i10) * (-25737)) ^ 1349097634;
                        i6 = 1411743041;
                    }
                    int i28 = iM55681 ^ i6;
                    i15 = i15;
                    i12 = i28;
                    i11 = i5;
                    c18108 = c18107;
                    break;
                case -1444828717:
                case 1263859565:
                    i15 = i15;
                    if (AbstractC0942.f81890 > 0) {
                        iM55681 = (C0873.m55680("᩻۬") + i9) * (-127);
                        i5 = ((iM55681 ^ i10) * 10773) ^ (-1933486993);
                        i6 = -1202801137;
                        int i29 = iM55681 ^ i6;
                        i15 = i15;
                        i12 = i29;
                        i11 = i5;
                        c18108 = c18107;
                    }
                    i15 = i15;
                    iM55682 = C0873.m55680("᩶ܺ") ^ i10;
                    i5 = ((iM55682 ^ i9) * 32051) ^ (-1415177955);
                    i7 = 1715433815;
                    i12 = iM55682 ^ i7;
                    i11 = i5;
                    c18108 = c18107;
                    break;
                case -1410926531:
                case 1829429540:
                    if (C1964.m56597() == 0) {
                        iM559710 = C0946.m55979("ۗ᩻") ^ i10;
                        i = ((iM559710 ^ i9) * 19853) ^ 1613747764;
                        i8 = 1031579491;
                        int i111 = iM559710 ^ i8;
                        i15 = i15;
                        i12 = i111;
                        i11 = i;
                    } else {
                        i15 = i15;
                        iM55680 = C0873.m55680("ۧ᩷") ^ i9;
                        i3 = ((iM55680 ^ i10) * 11175) ^ (-888300345);
                        i4 = 128956745;
                        int i210 = i15;
                        i12 = iM55680 ^ i4;
                        i11 = i3;
                        i15 = i210;
                    }
                    break;
                case -1401921363:
                case 2001484993:
                    C0894.m55761(c13746M26103);
                    return;
                case -1393166244:
                case 1079343689:
                    i14 = 33061;
                    iM55680 = C0873.m55680("ۖ᩵") ^ i10;
                    i3 = ((iM55680 ^ i9) * 25767) ^ (-1993933281);
                    i4 = 1034487084;
                    int i211 = i15;
                    i12 = iM55680 ^ i4;
                    i11 = i3;
                    i15 = i211;
                    break;
                case -1328419302:
                case 1221202347:
                    i15 = i15;
                    strM56297 = C1046.m56297(abstractC17043);
                    c11245M41242 = c18107.m41242();
                    if (C0927.f81875) {
                        iM55680 = C0946.m55979("ۢܺ") ^ i10;
                        i3 = ((iM55680 ^ i9) * 27287) ^ (-869196308);
                        i4 = 1445396355;
                    } else {
                        iM55680 = (i9 - C0946.m55979("۟۟")) * (-51);
                        i3 = ((iM55680 ^ i10) * 23773) ^ 690307618;
                        i4 = -594660017;
                    }
                    int i212 = i15;
                    i12 = iM55680 ^ i4;
                    i11 = i3;
                    i15 = i212;
                    break;
                case -1299125969:
                case -1137970415:
                    i13 = 0;
                    iM55680 = (i9 - C0873.m55680("᩺᩹")) * (-93);
                    i3 = ((iM55680 ^ i10) * (-2615)) ^ (-1210613867);
                    i4 = 281781147;
                    int i213 = i15;
                    i12 = iM55680 ^ i4;
                    i11 = i3;
                    i15 = i213;
                    break;
                case -1267603369:
                case 1660109423:
                    if (RunnableC0871.m55672() < 0) {
                        i15 = i15;
                        iM55681 = (C0946.m55979("ۧ᩸") + i10) * (-63);
                        i5 = ((iM55681 ^ i9) * (-12867)) ^ 1796315804;
                        i6 = -424063084;
                        int i214 = iM55681 ^ i6;
                        i15 = i15;
                        i12 = i214;
                        i11 = i5;
                        c18108 = c18107;
                    } else {
                        i15 = i15;
                        iM55680 = C0946.m55979("ۢܺ") ^ i10;
                        i3 = ((iM55680 ^ i9) * 27287) ^ (-869196308);
                        i4 = 1445396355;
                        int i215 = i15;
                        i12 = iM55680 ^ i4;
                        i11 = i3;
                        i15 = i215;
                    }
                    break;
                case -1232762180:
                case -91552689:
                    i14 = 63388;
                    iM55680 = C0873.m55680("ۖ᩵") ^ i10;
                    i3 = ((iM55680 ^ i9) * 25767) ^ (-1993933281);
                    i4 = 1034487084;
                    int i216 = i15;
                    i12 = iM55680 ^ i4;
                    i11 = i3;
                    i15 = i216;
                    break;
                case -1150148503:
                case -165039421:
                    i15 = i15;
                    if (C0927.f81875) {
                        iM55681 = (C0873.m55680("᩸۠") ^ i10) * (-11);
                        i5 = ((iM55681 ^ i9) * (-5111)) ^ 1890569576;
                        i6 = -1771948919;
                    } else {
                        iM55681 = (C0873.m55680("ۛ۟") ^ i10) * 27;
                        i5 = ((iM55681 ^ i9) * (-9661)) ^ 2084208031;
                        i6 = 1113506444;
                    }
                    int i217 = iM55681 ^ i6;
                    i15 = i15;
                    i12 = i217;
                    i11 = i5;
                    c18108 = c18107;
                    break;
                case -914214706:
                case -402519996:
                    C1071.m56343();
                    if (C1071.f81975 <= 0) {
                        iM55979 = C0946.m55979("᩵۟") ^ i9;
                        i = ((iM55979 ^ i10) * (-20049)) ^ 660237364;
                        i2 = 781689873;
                        i12 = iM55979 ^ i2;
                        i11 = i;
                    } else {
                        i15 = i15;
                        iM55680 = C0946.m55979("ۢܺ") ^ i10;
                        i3 = ((iM55680 ^ i9) * 27287) ^ (-869196308);
                        i4 = 1445396355;
                        int i218 = i15;
                        i12 = iM55680 ^ i4;
                        i11 = i3;
                        i15 = i218;
                    }
                    break;
                case -891384006:
                case 988500916:
                    i13++;
                    iM55680 = (i9 - C0873.m55680("᩺᩹")) * (-93);
                    i3 = ((iM55680 ^ i10) * (-2615)) ^ (-1210613867);
                    i4 = 281781147;
                    int i219 = i15;
                    i12 = iM55680 ^ i4;
                    i11 = i3;
                    i15 = i219;
                    break;
                case -712188948:
                case -694969768:
                    RunnableC0938.m55927(c13746M26103);
                    throw th;
                case -589589577:
                case 1883874948:
                    i15 = i15;
                    if (i13 < size) {
                        iM55680 = C0946.m55979("ܶ᩻") ^ i10;
                        i3 = ((iM55680 ^ i9) * 9069) ^ 976299707;
                        i4 = 352105004;
                    } else {
                        iM55680 = C0873.m55680("ۜ֨") ^ i9;
                        i3 = ((iM55680 ^ i10) * 3877) ^ 503357706;
                        i4 = 1505262846;
                    }
                    int i2110 = i15;
                    i12 = iM55680 ^ i4;
                    i11 = i3;
                    i15 = i2110;
                    break;
                case -377571999:
                case 1138615737:
                    i15 = i15;
                    try {
                        size = c13746M26103.size();
                        iM55680 = (C0946.m55979("ۧۚ") ^ i10) * 109;
                        i3 = ((iM55680 ^ i9) * (-1601)) ^ 347920612;
                        i4 = -1897636579;
                    } catch (Throwable th6) {
                        th = th6;
                        th = th;
                        iM55680 = C0946.m55979("ۧᩳ") ^ i10;
                        i3 = ((iM55680 ^ i9) * (-26967)) ^ (-1354239475);
                        i4 = 1542156125;
                    }
                    int i2111 = i15;
                    i12 = iM55680 ^ i4;
                    i11 = i3;
                    i15 = i2111;
                    break;
                case -347844678:
                case 1251908284:
                    if (C1964.f83032 <= 0) {
                        iM55979 = (i9 - C0873.m55680("ۡܺ")) * (-75);
                        i = ((iM55979 ^ i10) * 31121) ^ (-1086205594);
                        i2 = 1092682104;
                    } else {
                        iM55979 = (C0873.m55680("֫ᩳ") ^ i9) * 119;
                        i = ((iM55979 ^ i10) * (-31211)) ^ (-470142154);
                        i2 = -420695519;
                    }
                    i12 = iM55979 ^ i2;
                    i11 = i;
                    break;
                case -261457744:
                case 282329597:
                    s = sArr[c];
                    i15 = s * s;
                    if (RunnableC0938.f81886 >= 0) {
                        iM55682 = C0873.m55680("᩶ܺ") ^ i10;
                        i5 = ((iM55682 ^ i9) * 32051) ^ (-1415177955);
                        i7 = 1715433815;
                    } else {
                        iM55682 = (C0946.m55979("ܺ֡") ^ i10) * 13;
                        i5 = ((iM55682 ^ i9) * (-11167)) ^ 1287413206;
                        i7 = 501283636;
                    }
                    i12 = iM55682 ^ i7;
                    i11 = i5;
                    c18108 = c18107;
                    break;
                case 69910909:
                case 2111201660:
                    C0992.m56107();
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        i15 = i15;
                        iM55680 = C0873.m55680("ۧ᩷") ^ i9;
                        i3 = ((iM55680 ^ i10) * 11175) ^ (-888300345);
                        i4 = 128956745;
                        int i2112 = i15;
                        i12 = iM55680 ^ i4;
                        i11 = i3;
                        i15 = i2112;
                    } else {
                        i15 = i15;
                        iM55681 = (C0946.m55979("ۧ᩸") + i10) * (-63);
                        i5 = ((iM55681 ^ i9) * (-12867)) ^ 1796315804;
                        i6 = -424063084;
                        int i2113 = iM55681 ^ i6;
                        i15 = i15;
                        i12 = i2113;
                        i11 = i5;
                        c18108 = c18107;
                    }
                    break;
                case 155611016:
                case 485537783:
                    i15 = i15;
                    s2 = 16442;
                    if (C0845.f81821 >= 0) {
                        iM55680 = C0873.m55680("ۧ᩷") ^ i9;
                        i3 = ((iM55680 ^ i10) * 11175) ^ (-888300345);
                        i4 = 128956745;
                    } else {
                        iM55680 = (C0946.m55979("᩺ۨ") ^ i9) * 75;
                        i3 = ((iM55680 ^ i10) * (-16635)) ^ (-1923103112);
                        i4 = 1447530278;
                    }
                    int i2114 = i15;
                    i12 = iM55680 ^ i4;
                    i11 = i3;
                    i15 = i2114;
                    break;
                case 443710758:
                case 1249104057:
                    C0894.m55761(c13746M26103);
                    if (C0898.f81858 > 0) {
                        C1053.m56329(new C19624(c18108, abstractC17043));
                        return;
                    }
                    iM559710 = C0946.m55979("ۗ᩻") ^ i10;
                    i = ((iM559710 ^ i9) * 19853) ^ 1613747764;
                    i8 = 1031579491;
                    int i112 = iM559710 ^ i8;
                    i15 = i15;
                    i12 = i112;
                    i11 = i;
                    break;
                case 685119842:
                case 1677888581:
                    if (ViewOnClickListenerC0939.f81888 > 0) {
                        iM55979 = (i9 - C0873.m55680("ۡܺ")) * (-75);
                        i = ((iM55979 ^ i10) * 31121) ^ (-1086205594);
                        i2 = 1092682104;
                    } else {
                        iM55979 = C0946.m55979("ᩴۘ") ^ i9;
                        i = ((iM55979 ^ i10) * 16041) ^ 1312930712;
                        i2 = -399566515;
                    }
                    i12 = iM55979 ^ i2;
                    i11 = i;
                    break;
                case 799068770:
                case 1834894479:
                    C0989.m56095();
                    C1024.m56209();
                    i15 = i15;
                    iM55680 = C0946.m55979("ۢܺ") ^ i10;
                    i3 = ((iM55680 ^ i9) * 27287) ^ (-869196308);
                    i4 = 1445396355;
                    int i2115 = i15;
                    i12 = iM55680 ^ i4;
                    i11 = i3;
                    i15 = i2115;
                    break;
                case 851677506:
                case 1736852022:
                    i15 = i15;
                    i16 = i15 + 67584841;
                    if (C0877.f81843 < 0) {
                        iM55680 = C0873.m55680("᩹ۖ") ^ i10;
                        i3 = ((iM55680 ^ i9) * (-5319)) ^ 2021540351;
                        i4 = -1853126173;
                        int i2116 = i15;
                        i12 = iM55680 ^ i4;
                        i11 = i3;
                        i15 = i2116;
                    } else {
                        iM55681 = (C0873.m55680("᩸۠") ^ i10) * (-11);
                        i5 = ((iM55681 ^ i9) * (-5111)) ^ 1890569576;
                        i6 = -1771948919;
                        int i2117 = iM55681 ^ i6;
                        i15 = i15;
                        i12 = i2117;
                        i11 = i5;
                        c18108 = c18107;
                    }
                    break;
                case 1147507373:
                case 1264976529:
                    C0898.m55800();
                    if (!C0927.f81875) {
                        i15 = i15;
                        iM55680 = C0946.m55979("ۢܺ") ^ i10;
                        i3 = ((iM55680 ^ i9) * 27287) ^ (-869196308);
                        i4 = 1445396355;
                        int i2118 = i15;
                        i12 = iM55680 ^ i4;
                        i11 = i3;
                        i15 = i2118;
                    } else {
                        iM55979 = (i9 - C0873.m55680("ۡܺ")) * (-75);
                        i = ((iM55979 ^ i10) * 31121) ^ (-1086205594);
                        i2 = 1092682104;
                        i12 = iM55979 ^ i2;
                        i11 = i;
                    }
                    break;
                default:
                    i15 = i15;
                    if (i16 - (s * s2) >= 0) {
                        iM55680 = (i9 - C0946.m55979("ۙᩳ")) * (-97);
                        i3 = ((iM55680 ^ i10) * (-6119)) ^ 1529656196;
                        i4 = -419902502;
                    } else {
                        iM55680 = (i10 - C0873.m55680("᩹ܳ")) * (-11);
                        i3 = ((iM55680 ^ i9) * (-6341)) ^ 4085792;
                        i4 = -1414648686;
                    }
                    int i2119 = i15;
                    i12 = iM55680 ^ i4;
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
    /* JADX INFO: renamed from: ܽ */
    public static void m47310(C18107 c18107, InterfaceC19370 interfaceC19370) {
        int iM55979;
        int i;
        int i2;
        int i3 = C0863.f81833;
        int i4 = C0989.f81920;
        int iM559710 = C0946.m55979("ܺܺ") ^ i4;
        int i5 = ((iM559710 ^ i3) * (-13217)) ^ 2047629641;
        List listM41240 = null;
        Class<Main> cls = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM559710 ^ 2069618441;
        ArrayList arrayList = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        C4847 c4847 = null;
        int i11 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i12 = 0;
        int i13 = 69681081;
        int i14 = 0;
        InterfaceC19370 interfaceC19371 = null;
        String strMo39137 = null;
        int i15 = 0;
        Iterator itM55925 = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i3) * (-19077)) >> 31));
            switch (i13) {
                case -2122170589:
                case 1718098422:
                    i7 = 43648;
                    iM55979 = (C0946.m55979("ۘ᩸") + i3) * 7;
                    i = ((iM55979 ^ i4) * (-8703)) ^ 42686534;
                    i2 = -1296229328;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -2028654932:
                case -80745515:
                    itM55925 = RunnableC0938.m55925(listM41240);
                    i15 = 0;
                    iM55979 = (C0873.m55680("ᩳ۫") + i4) * 39;
                    i = ((iM55979 ^ i3) * (-4387)) ^ (-754618311);
                    i2 = 2115990847;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -2017123153:
                case 916529430:
                    AbstractC0942.m55971();
                    if (C0882.f81846) {
                        iM55979 = C0946.m55979("᩸ܶ") ^ i4;
                        i = ((iM55979 ^ i3) * 28697) ^ (-346228291);
                        i2 = 834851521;
                    } else {
                        iM55979 = (i3 - C0873.m55680("᩻۬")) * (-77);
                        i = ((iM55979 ^ i4) * (-32181)) ^ (-1371139458);
                        i2 = 1751473875;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1943022855:
                case 2002381357:
                    if (interfaceC19371 != null) {
                        iM55979 = (C0946.m55979("᩻۠") + i4) * (-45);
                        i = ((iM55979 ^ i3) * 13995) ^ (-2003227149);
                        i2 = -626658282;
                    } else {
                        iM55979 = (C0873.m55680("ᩳ۫") + i4) * 39;
                        i = ((iM55979 ^ i3) * (-4387)) ^ (-754618311);
                        i2 = 2115990847;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1904614690:
                case -1535696131:
                    sArr = f82953;
                    if (C1012.f81938 >= 0) {
                        iM55979 = (C0946.m55979("ܰۙ") + i3) * 47;
                        i = ((iM55979 ^ i4) * (-10041)) ^ 329424326;
                        i2 = 747691230;
                    } else {
                        iM55979 = (C0946.m55979("ۙۤ") ^ i4) * 15;
                        i = ((iM55979 ^ i3) * 7761) ^ 289206707;
                        i2 = 444355752;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1828868052:
                case -1083997814:
                    ViewOnClickListenerC0939.m55941();
                    iM55979 = (i3 - C0873.m55680("᩻۬")) * (-77);
                    i = ((iM55979 ^ i4) * (-32181)) ^ (-1371139458);
                    i2 = 1751473875;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1571373343:
                case 482887511:
                    arrayList = new ArrayList();
                    listM41240 = c18107.m41240();
                    if (AbstractC0942.m55971()) {
                        iM55979 = C0873.m55680("ܶۘ") ^ i3;
                        i = ((iM55979 ^ i4) * (-24453)) ^ 514916229;
                        i2 = -1624342068;
                    } else {
                        iM55979 = (C0873.m55680("᩶ܺ") + i4) * (-21);
                        i = ((iM55979 ^ i3) * 9179) ^ 782213729;
                        i2 = 1693778277;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1496483306:
                case -876951427:
                    strMo39137 = interfaceC19371.mo39137();
                    sArr3 = f82953;
                    i10 = 539;
                    if (C0882.f81846) {
                        iM55979 = (i3 - C0873.m55680("᩻۬")) * (-77);
                        i = ((iM55979 ^ i4) * (-32181)) ^ (-1371139458);
                        i2 = 1751473875;
                    } else {
                        iM55979 = (i4 - C0873.m55680("᩸۬")) * 55;
                        i = ((iM55979 ^ i3) * (-6199)) ^ 887766602;
                        i2 = 1607078558;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1321331926:
                case 1345167972:
                    if (i12 - (i14 + i11) <= 0) {
                        iM55979 = C0873.m55680("۟ۚ") ^ i3;
                        i = ((iM55979 ^ i4) * (-2295)) ^ 856465437;
                        i2 = -596942354;
                    } else {
                        iM55979 = (C0873.m55680("ۜۢ") ^ i4) * 33;
                        i = ((iM55979 ^ i3) * (-9935)) ^ 978206693;
                        i2 = 417340434;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1087191396:
                case -998180556:
                    i7 = 56330;
                    iM55979 = (C0946.m55979("ۘ᩸") + i3) * 7;
                    i = ((iM55979 ^ i4) * (-8703)) ^ 42686534;
                    i2 = -1296229328;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1077171224:
                case 152954377:
                    if (C1028.m56247() >= 0) {
                        iM55979 = (i3 - C0873.m55680("᩻۬")) * (-77);
                        i = ((iM55979 ^ i4) * (-32181)) ^ (-1371139458);
                        i2 = 1751473875;
                    } else {
                        iM55979 = C0946.m55979("ۘ֨") ^ i4;
                        i = ((iM55979 ^ i3) * (-16657)) ^ (-1068762641);
                        i2 = 700334977;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -991743000:
                case -268132419:
                    C0890.m55740();
                    if (RunnableC0938.m55938() != 0) {
                        iM55979 = (i3 - C0873.m55680("᩻۬")) * (-77);
                        i = ((iM55979 ^ i4) * (-32181)) ^ (-1371139458);
                        i2 = 1751473875;
                    } else {
                        iM55979 = C0946.m55979("ܳܺ") ^ i4;
                        i = ((iM55979 ^ i3) * (-13169)) ^ (-938495431);
                        i2 = 1742703836;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -809267664:
                case -363820989:
                    C0861.m55626();
                    C1071.m56343();
                    break;
                case -663156432:
                case -143990232:
                    int iM56137 = C1012.m56137(arrayList);
                    C0937.m55917(arrayList, interfaceC19371);
                    i15 = iM56137;
                    iM55979 = (C0873.m55680("ᩳ۫") + i4) * 39;
                    i = ((iM55979 ^ i3) * (-4387)) ^ (-754618311);
                    i2 = 2115990847;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -593739578:
                case 8866931:
                    C0912.m55833();
                    if (C1025.f81947 < 0) {
                        iM55979 = C0946.m55979("ܳܺ") ^ i4;
                        i = ((iM55979 ^ i3) * (-13169)) ^ (-938495431);
                        i2 = 1742703836;
                    } else {
                        iM55979 = C0873.m55680("ܶۘ") ^ i3;
                        i = ((iM55979 ^ i4) * (-24453)) ^ 514916229;
                        i2 = -1624342068;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -568200199:
                case -518260286:
                    interfaceC19371 = (InterfaceC19370) C0955.m56035(itM55925);
                    if (interfaceC19371 == interfaceC19370) {
                        iM55979 = (C0873.m55680("ۘܿ") + i3) * 75;
                        i = ((iM55979 ^ i4) * 22183) ^ (-112432911);
                        i2 = -1789533880;
                    } else {
                        iM55979 = C0946.m55979("ۜ᩺") ^ i3;
                        i = ((iM55979 ^ i4) * (-31725)) ^ (-335555380);
                        i2 = 1873954354;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -551966572:
                case -9512689:
                    if (C1229.f82066 >= 0) {
                        iM55979 = C0946.m55979("ܳܺ") ^ i4;
                        i = ((iM55979 ^ i3) * (-13169)) ^ (-938495431);
                        i2 = 1742703836;
                    } else {
                        iM55979 = (C0946.m55979("ܰۙ") + i3) * 47;
                        i = ((iM55979 ^ i4) * (-10041)) ^ 329424326;
                        i2 = 747691230;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -431167642:
                case 1346029766:
                    AbstractC15599 abstractC15599Mo8217 = C0947.m56000(c18107).mo8217();
                    if (C1003.f81929 > 0) {
                        c4847 = new C4847(abstractC15599Mo8217, arrayList, i15);
                        cls = Main.class;
                        if (C0894.f81854 < 0) {
                            iM55979 = (C0873.m55680("ۢ᩷") + i4) * 9;
                            i = ((iM55979 ^ i3) * 16685) ^ (-1014983950);
                            i2 = -1147816059;
                            i6 = iM55979 ^ i2;
                            i5 = i;
                            break;
                        }
                    }
                    int iM55680 = (i3 - C0873.m55680("ۙܰ")) * (-81);
                    i6 = iM55680 ^ (-491002791);
                    i5 = ((iM55680 ^ i4) * 15067) ^ 1457753472;
                    c4847 = null;
                    break;
                case -382806957:
                case -289644534:
                    C5178.m11082(cls, c4847, C0937.m55921(sArr2, i8, i9, i7));
                    Main mainM56594 = C1964.m56594(c18107);
                    if (C0967.f81910 < 0) {
                        C1964.m56594(c18107).m114(c18107, new Intent(mainM56594, (Class<?>) ActivityC17586.class));
                    }
                    iM55979 = C0946.m55979("ܳܺ") ^ i4;
                    i = ((iM55979 ^ i3) * (-13169)) ^ (-938495431);
                    i2 = 1742703836;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -167697893:
                case 635032309:
                    if (C1229.m56404(strMo39137, C1124.m56373(sArr3, i10, 6, i7))) {
                        iM55979 = (i3 - C0946.m55979("ۗ᩸")) * (-73);
                        i = ((iM55979 ^ i4) * 5813) ^ (-1003481692);
                        i2 = -1013197311;
                    } else {
                        iM55979 = (C0946.m55979("ۜ۟") ^ i4) * 15;
                        i = ((iM55979 ^ i3) * 9909) ^ 116186018;
                        i2 = 52131152;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 342213135:
                case 1608869244:
                    if (C8597.m20012(interfaceC19371)) {
                        iM55979 = (i3 - C0946.m55979("ۗ᩸")) * (-73);
                        i = ((iM55979 ^ i4) * 5813) ^ (-1003481692);
                        i2 = -1013197311;
                    } else {
                        iM55979 = (C0873.m55680("ᩳ۫") + i4) * 39;
                        i = ((iM55979 ^ i3) * (-4387)) ^ (-754618311);
                        i2 = 2115990847;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 352926674:
                case 2140362339:
                    i12 = s * s2;
                    i14 = s * s;
                    i11 = 145926400;
                    if (!C0955.m56025()) {
                        iM55979 = (i3 - C0873.m55680("ۚ۠")) * (-35);
                        i = ((iM55979 ^ i4) * 17883) ^ 1877094;
                        i2 = 651018821;
                        i6 = iM55979 ^ i2;
                        i5 = i;
                    } else {
                        int iM55681 = (i3 - C0873.m55680("ۙܰ")) * (-81);
                        i6 = iM55681 ^ (-491002791);
                        i5 = ((iM55681 ^ i4) * 15067) ^ 1457753472;
                        c4847 = null;
                    }
                    break;
                case 634890825:
                case 1249939378:
                    sArr2 = f82953;
                    i9 = 20;
                    if (C0863.m55643()) {
                        int iM559711 = (C0946.m55979("ᩳ֨") ^ i3) * 21;
                        i6 = iM559711 ^ (-499328393);
                        i5 = ((iM559711 ^ i4) * (-22573)) ^ (-1881169712);
                        i8 = 519;
                    } else {
                        i8 = 519;
                        int iM55682 = (i3 - C0873.m55680("ۙܰ")) * (-81);
                        i6 = iM55682 ^ (-491002791);
                        i5 = ((iM55682 ^ i4) * 15067) ^ 1457753472;
                        c4847 = null;
                    }
                    break;
                case 649474433:
                case 1216352102:
                    C0937.m55917(arrayList, interfaceC19371);
                    iM55979 = (C0873.m55680("ᩳ۫") + i4) * 39;
                    i = ((iM55979 ^ i3) * (-4387)) ^ (-754618311);
                    i2 = 2115990847;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 651310806:
                case 1097416359:
                    if (C0866.m55647(itM55925)) {
                        iM55979 = C0873.m55680("ܳ֫") ^ i3;
                        i = ((iM55979 ^ i4) * 18449) ^ 1252345877;
                        i2 = -959818720;
                    } else {
                        iM55979 = C0946.m55979("ܿܰ") ^ i3;
                        i = ((iM55979 ^ i4) * 27547) ^ 1631486489;
                        i2 = 1732054332;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 664111734:
                case 854320578:
                    if (interfaceC19371.mo39135()) {
                        iM55979 = C0873.m55680("ۧ֡") ^ i3;
                        i = ((iM55979 ^ i4) * (-30429)) ^ (-1717059121);
                        i2 = -1104747891;
                    } else {
                        iM55979 = (C0873.m55680("ᩳ۫") + i4) * 39;
                        i = ((iM55979 ^ i3) * (-4387)) ^ (-754618311);
                        i2 = 2115990847;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 732260560:
                case 1594501129:
                    C1194.m56393(arrayList, interfaceC19370);
                    iM55979 = C0946.m55979("᩷ܰ") ^ i4;
                    i = ((iM55979 ^ i3) * (-31677)) ^ (-1543566771);
                    i2 = -1524946488;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 774834696:
                case 2144774636:
                    if (C0992.m56108(arrayList)) {
                        iM55979 = (C0946.m55979("ۘܽ") + i4) * 85;
                        i = ((iM55979 ^ i3) * (-7897)) ^ 1631457410;
                        i2 = 1003570341;
                    } else {
                        iM55979 = C0946.m55979("᩷ܰ") ^ i4;
                        i = ((iM55979 ^ i3) * (-31677)) ^ (-1543566771);
                        i2 = -1524946488;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 1182944940:
                case 1553039242:
                    c = 518;
                    if (!C0927.f81875) {
                        iM55979 = C0946.m55979("ۙ᩵") ^ i3;
                        i = ((iM55979 ^ i4) * (-2113)) ^ (-966869310);
                        i2 = 1720717615;
                        i6 = iM55979 ^ i2;
                        i5 = i;
                    } else {
                        int iM55683 = (i3 - C0873.m55680("ۙܰ")) * (-81);
                        i6 = iM55683 ^ (-491002791);
                        i5 = ((iM55683 ^ i4) * 15067) ^ 1457753472;
                        c4847 = null;
                    }
                    break;
                default:
                    s = sArr[c];
                    s2 = 24160;
                    if (C1964.f83032 <= 0) {
                        iM55979 = C0946.m55979("᩸ܶ") ^ i4;
                        i = ((iM55979 ^ i3) * 28697) ^ (-346228291);
                        i2 = 834851521;
                    } else {
                        iM55979 = (i4 - C0873.m55680("᩺ۢ")) * 15;
                        i = ((iM55979 ^ i3) * (-13349)) ^ 1201024177;
                        i2 = 591988322;
                    }
                    i6 = iM55979 ^ i2;
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
    
        if (p067l.C0882.m55710() == 0) goto L10;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m47296(Class cls, C18107 c18107, InterfaceC19370 interfaceC19370, AbstractC17043 abstractC17043) {
        int iM55680;
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
        int i8 = C0912.f81867;
        int i9 = AbstractC0942.f81890;
        int iM55979 = (C0946.m55979("ܺ᩶") ^ i8) * (-75);
        int i10 = ((iM55979 ^ i9) * (-22225)) ^ (-627922839);
        int i11 = iM55979 ^ 214455011;
        while (true) {
            i7 = ((((i7 ^ i9) * (-21277)) >> 31) & i10) ^ i11;
            switch (i7) {
                case -2097331091:
                case 1291556550:
                    int i12 = s + s2;
                    if ((i12 * i12) - i4 > 0) {
                        iM55680 = (C0946.m55979("ᩳۢ") + i9) * 59;
                        i = ((iM55680 ^ i8) * (-25419)) ^ (-1186273001);
                        i2 = -1995512743;
                    } else {
                        iM55680 = (i8 - C0946.m55979("֨ܽ")) * (-45);
                        i = ((iM55680 ^ i9) * (-11933)) ^ (-872954495);
                        i2 = 897669347;
                    }
                    i11 = iM55680 ^ i2;
                    i10 = i;
                    break;
                case -1832801105:
                case -212553336:
                    C1124.m56367();
                    iM55680 = C0946.m55979("ܽۧ") ^ i8;
                    i = ((iM55680 ^ i9) * 3699) ^ 1890960053;
                    i2 = 1672166775;
                    i11 = iM55680 ^ i2;
                    i10 = i;
                    break;
                case -1801075963:
                case 553002958:
                    i5 = 27573;
                    iM55680 = C0946.m55979("ܽ᩻") ^ i8;
                    i = ((iM55680 ^ i9) * 21337) ^ (-743383680);
                    i2 = -1113382101;
                    i11 = iM55680 ^ i2;
                    i10 = i;
                    break;
                case -1792999884:
                case 588281043:
                    C11245.m26044(interfaceC19370, 2000);
                    C1044.m56284(C1929.m56560(c18107), intent);
                    break;
                case -1641137406:
                case -635199938:
                    s = sArr[183];
                    i3 = s * s;
                    if (C0967.f81910 >= 0) {
                        iM55680 = C0873.m55680("֨᩺") ^ i8;
                        i = ((iM55680 ^ i9) * (-12921)) ^ 1729228484;
                        i2 = -1331780658;
                    } else {
                        iM55680 = C0946.m55979("۠ۤ") ^ i8;
                        i = ((iM55680 ^ i9) * (-32427)) ^ (-490135242);
                        i2 = -482246623;
                    }
                    i11 = iM55680 ^ i2;
                    i10 = i;
                    break;
                case -1483206094:
                case 1929594047:
                    i5 = 28576;
                    iM55680 = C0946.m55979("ܽ᩻") ^ i8;
                    i = ((iM55680 ^ i9) * 21337) ^ (-743383680);
                    i2 = -1113382101;
                    i11 = iM55680 ^ i2;
                    i10 = i;
                    break;
                case -1408149884:
                case -576387620:
                    break;
                case -1403121295:
                case 1799377746:
                    sArr2 = f82953;
                    i6 = 184;
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = C0946.m55979("ܽۧ") ^ i8;
                        i = ((iM55680 ^ i9) * 3699) ^ 1890960053;
                        i2 = 1672166775;
                    } else {
                        iM55680 = C0946.m55979("᩶۠") ^ i9;
                        i = ((iM55680 ^ i8) * (-13231)) ^ 1410990935;
                        i2 = -1380916042;
                    }
                    i11 = iM55680 ^ i2;
                    i10 = i;
                    break;
                case -1386604810:
                case -1010415947:
                    sArr = f82953;
                    if (C0890.m55740()) {
                        iM55680 = (C0946.m55979("ۜܿ") + i8) * (-15);
                        i = ((iM55680 ^ i9) * (-25167)) ^ 132434808;
                        i2 = -1723958523;
                    } else {
                        iM55680 = (C0873.m55680("ᩴ᩸") ^ i8) * (-5);
                        i = ((iM55680 ^ i9) * 8015) ^ 2120973009;
                        i2 = -520946408;
                    }
                    i11 = iM55680 ^ i2;
                    i10 = i;
                    break;
                case -1259639845:
                case 543228329:
                    C0917.m55854();
                    break;
                case -486627709:
                case 1086517512:
                    intent.setData(abstractC17043.m38680());
                    m47294(intent, cls, C0947.m56000(c18107));
                    if (C0894.m55769() >= 0) {
                        iM55680 = C0946.m55979("᩵֫") ^ i9;
                        i = ((iM55680 ^ i8) * (-32221)) ^ (-1926803397);
                        i2 = -1962101879;
                    } else {
                        iM55680 = (C0873.m55680("ᩴܿ") + i9) * (-87);
                        i = ((iM55680 ^ i8) * (-21779)) ^ 975660229;
                        i2 = -1444911315;
                    }
                    i11 = iM55680 ^ i2;
                    i10 = i;
                    break;
                case -358731520:
                case -26672543:
                    intent = new Intent(C0861.m55620(), (Class<?>) cls);
                    if (C0898.f81858 <= 0) {
                        iM55680 = C0873.m55680("֨ۨ") ^ i9;
                        i = ((iM55680 ^ i8) * (-20493)) ^ 155965250;
                        i2 = -1466258576;
                    } else {
                        iM55680 = C0946.m55979("۫ᩳ") ^ i9;
                        i = ((iM55680 ^ i8) * 27887) ^ 2110512178;
                        i2 = 1038756921;
                    }
                    i11 = iM55680 ^ i2;
                    i10 = i;
                    break;
                case -239344984:
                case 772769033:
                    if (C0992.f81922 >= 0) {
                        iM55680 = C0873.m55680("֨᩺") ^ i8;
                        i = ((iM55680 ^ i9) * (-12921)) ^ 1729228484;
                        i2 = -1331780658;
                    } else {
                        iM55680 = C0873.m55680("ܿܶ") ^ i9;
                        i = ((iM55680 ^ i8) * (-9175)) ^ (-1112958589);
                        i2 = -1788072223;
                    }
                    i11 = iM55680 ^ i2;
                    i10 = i;
                    break;
                case -203675473:
                case 1923052272:
                    if (C1071.f81975 <= 0) {
                        iM55680 = C0873.m55680("֨ۨ") ^ i9;
                        i = ((iM55680 ^ i8) * (-20493)) ^ 155965250;
                        i2 = -1466258576;
                    } else {
                        iM55680 = (C0873.m55680("ۘ᩸") + i8) * 15;
                        i = ((iM55680 ^ i9) * 5757) ^ 976808562;
                        i2 = 155925412;
                    }
                    i11 = iM55680 ^ i2;
                    i10 = i;
                    break;
                case -82227169:
                case 1054776581:
                    intent.setAction(C1003.m56132(sArr2, i6, 26, i5));
                    if (C0898.f81858 <= 0) {
                        iM55680 = (C0873.m55680("ᩴ᩸") ^ i8) * (-5);
                        i = ((iM55680 ^ i9) * 8015) ^ 2120973009;
                        i2 = -520946408;
                    } else {
                        iM55680 = (i8 - C0873.m55680("ۛ۫")) * (-73);
                        i = ((iM55680 ^ i9) * 681) ^ (-1898944996);
                        i2 = 1234916159;
                    }
                    i11 = iM55680 ^ i2;
                    i10 = i;
                    break;
                case -55888633:
                case 788546539:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = (C0873.m55680("ᩴ᩸") ^ i8) * (-5);
                        i = ((iM55680 ^ i9) * 8015) ^ 2120973009;
                        i2 = -520946408;
                    } else {
                        iM55680 = (C0873.m55680("ۤ᩷") + i9) * (-19);
                        i = ((iM55680 ^ i8) * 22643) ^ 1599913825;
                        i2 = -472189650;
                    }
                    i11 = iM55680 ^ i2;
                    i10 = i;
                    break;
                case -30371149:
                case 1411519588:
                    if (C0946.f81894 != 0) {
                        iM55680 = C0946.m55979("᩵֫") ^ i9;
                        i = ((iM55680 ^ i8) * (-32221)) ^ (-1926803397);
                        i2 = -1962101879;
                        i11 = iM55680 ^ i2;
                        i10 = i;
                    }
                    iM55680 = C0873.m55680("֨᩺") ^ i8;
                    i = ((iM55680 ^ i9) * (-12921)) ^ 1729228484;
                    i2 = -1331780658;
                    i11 = iM55680 ^ i2;
                    i10 = i;
                    break;
                case 1306717096:
                case 1957421764:
                    C1046.m56302();
                    if (C1229.m56410() == 0) {
                        iM55680 = C0873.m55680("֨ۨ") ^ i9;
                        i = ((iM55680 ^ i8) * (-20493)) ^ 155965250;
                        i2 = -1466258576;
                        i11 = iM55680 ^ i2;
                        i10 = i;
                    }
                    iM55680 = C0946.m55979("ܽۧ") ^ i8;
                    i = ((iM55680 ^ i9) * 3699) ^ 1890960053;
                    i2 = 1672166775;
                    i11 = iM55680 ^ i2;
                    i10 = i;
                    break;
                default:
                    int i13 = 22071204 + i3;
                    i4 = i13 + i13;
                    s2 = 4698;
                    if (C1964.f83032 <= 0) {
                        iM55680 = C0946.m55979("ܽۧ") ^ i8;
                        i = ((iM55680 ^ i9) * 3699) ^ 1890960053;
                        i2 = 1672166775;
                    } else {
                        iM55680 = (C0946.m55979("ۤ۠") + i9) * (-33);
                        i = ((iM55680 ^ i8) * 14969) ^ 1219558438;
                        i2 = -1625521433;
                    }
                    i11 = iM55680 ^ i2;
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
        int iM55979;
        int i2;
        int i3;
        int i4;
        ApplicationC14266.m56479(142);
        f82953 = new short[]{3642, 5138, 5142, 5130, 5142, 5247, 5149, 5150, 5148, 5140, 5130, 5135, 5205, 5646, -4233, -4307, -4296, -4309, -4233, -4307, -4296, -4309, -4233, -4290, -4317, -4233, -4307, -4296, -4317, -4233, -4307, -4290, -4317, -4233, -4307, -4296, -4309, -4233, -4319, -4317, -4233, -4307, -4319, -4317, -4233, -4307, -4296, -4309, -4233, -4317, -4310, -4307, -4233, -4307, -4296, -4309, -4233, -4317, -4310, -4307, -4291, -4233, -4307, -4296, -4309, -4233, -4293, -4317, -4245, -4233, -4307, -4293, -4317, -4245, -4233, -4307, -4293, -4317, -4233, -4307, -4296, -4309, -4233, -4299, -4317, -4243, -4233, -4317, -4304, -4311, -4239, -4250, -4304, -4240, -4239, -4250, -4310, -4240, -4233, -4237, -4347, -4233, -4239, -4317, -4304, -4311, -4347, -4233, -4239, -4250, -4253, -4247, -4247, -4350, -4248, -4236, -4256, -4348, -4315, -4247, -4350, -4248, -4236, -4256, -4348, -4350, -4247, -4236, -4256, -4348, -4315, -4350, -4248, -4236, -4256, -4348, -4350, -4247, -4236, -4256, -4348, -4318, -4245, -4316, -4240, -4315, -4317, -4239, -4250, -4253, -4247, -4350, -4248, -4236, -4256, -4348, -4315, -4350, -4248, -4236, -4256, -4348, -4350, -4247, -4236, -4256, -4348, -4238, -4240, -4240, 2955, 22913, 22931, 22916, 22935, 22957, 22931, 22913, 22957, 22914, 22931, 22918, 22938, 7133, 27604, 27611, 27601, 27591, 27610, 27612, 27601, 27547, 27612, 27611, 27585, 27600, 27611, 27585, 27547, 27604, 27606, 27585, 27612, 27610, 27611, 27547, 27619, 27644, 27632, 27618, 4477, 25171, 25180, 25174, 25152, 25181, 25179, 25174, 25116, 25179, 25180, 25158, 25175, 25180, 25158, 25116, 25171, 25169, 25158, 25179, 25181, 25180, 25116, 25188, 25211, 25207, 25189, 25171, 25162, 25183, 25182, 4458, 22412, -19648, -21102, -17021, 25771, 22355, 20697, -19733, 19645, 18262, 26092, 27266, 24171, 19522, -23437, -16506, -19257, -18921, 28632, -17115, -22543, -22253, 22431, 25936, 27007, -19866, -18978, -17391, 28105, -20335, 4428, -1611, -1602, -1617, 31634, -21107, 31168, -28498, -22798, -32090, -21040, -30700, -32554, -31229, 26806, 32491, 25837, -25556, -29565, -1609, -1612, -1608, -1606, -1609, -28750, -28246, 25944, -25916, 28333, -26932, 24955, 31315, -24848, -21202, 29599, 28728, -23783, -29055, -25791, 26842, 32227, -21357, 27855, -27004, 25830, -24951, -24207, -20939, -25408, -21168, 28492, -26633, -31745, -24113, -21569, 25335, -18716, 30888, -30635, -30697, 31834, 28252, -31341, 2011, 5228, 8159, 11852, -1800, -5979, -4790, 1785, 7265, -3058, 9209, 8087, -1087, -5409, -708, 7069, 32623, 8369, 31770, 31765, 31775, 31753, 31764, 31762, 31775, 31829, 31762, 31765, 31759, 31774, 31765, 31759, 31829, 31770, 31768, 31759, 31762, 31764, 31765, 31829, 31789, 31794, 31806, 31788, 31768, 31767, 31770, 31752, 31752, 7731, 7176, 2351, 21993, 21994, 21990, 21988, 21993, 22015, 21996, 22005, 21992, 21988, 22005, 22005, 21996, 21995, 21986, 22005, 21988, 22012, 21993, 21994, 21988, 21985, 21931, 21991, 21996, 21995, 21931, 21991, 21996, 21995, 21931, 22007, 21984, 21995, 21988, 21992, 21984, 21931, 21991, 21988, 21998, 21995, 21984, 22001, 21988, 22005, 22005, 21993, 21996, 21990, 21988, 22001, 21996, 21994, 21995, 21930, 21994, 21988, 22001, 13440, -12378, -13072, 10210, 12252, 8827, -11771, 12429, 14235, 8744, 14389, 12855, 21931, 21984, 21995, 21990, 22007, 22012, 22005, 22001, 1941, -4606, -4555, -4555, -4568, -4555, -4555, -4574, -4556, -4568, -4558, -4555, -4572, -4574, -4556, -4503, -4570, -4555, -4556, -4572, -4503, -4573, -4574, -4545, -18957, -18073, 27800, -19178, -16600, 27751, 27435, 26340, -26661, -4598, -4558, -4565, -4557, -4562, -4605, -4574, -4545, 31026, -25601, -27628, -25865, 32033, -26281, -32393, 27209, -18871, 5491, -13054, 9074, -9149, -9113, -9109, -9107, -9105, -9124, -9117, -9105, -9091, -9105, -9096, -9141, -9096, -9107, -9089, -9113, -9105, -9116, -9090, -9095, -9117, -9113, -9109, -9107, -9105, -9179, 7317, -8472, 6693, -2125, 7907, 15809, 15810, 15822, 15820, 15809};
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        byte[] bytes = null;
        ExecutorService executorServiceNewSingleThreadExecutor = null;
        short[] sArr = null;
        int i5 = RunnableC1014.f81941;
        int i6 = C1404.f82149;
        int iM55680 = (C0873.m55680("ܶᩳ") ^ i5) * 79;
        int i7 = ((iM55680 ^ i6) * 22719) ^ (-1470873242);
        int i8 = iM55680 ^ (-75966063);
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
                    if (C0949.f81897 >= 0) {
                        i16 = i;
                        bArr2 = bArr;
                        iM55979 = C0946.m55979("ܶۨ") ^ i6;
                        i7 = ((iM55979 ^ i5) * 11869) ^ (-93847619);
                        i2 = 1601577749;
                    } else {
                        int iM559710 = C0946.m55979("ܿ᩻") ^ i5;
                        i7 = ((iM559710 ^ i6) * 4841) ^ (-432460258);
                        i16 = i;
                        iM55979 = iM559710;
                        bArr2 = bArr;
                        i2 = 326006295;
                    }
                    i8 = iM55979 ^ i2;
                    break;
                case -1956847013:
                case -131177071:
                    C1229.m56410();
                    C1017.m56187();
                    int iM559711 = (C0946.m55979("ۡܽ") ^ i6) * (-41);
                    i7 = ((iM559711 ^ i5) * C0719o.a.f2897c) ^ 1684222229;
                    i16 = i16;
                    iM55979 = iM559711;
                    bArr2 = bArr2;
                    i2 = -805481434;
                    i8 = iM55979 ^ i2;
                    break;
                case -1698526506:
                case 1072740638:
                    i3 = 7049;
                    int iM559712 = C0946.m55979("ۨ᩷") ^ i5;
                    i16 = i16;
                    iM55979 = iM559712;
                    i7 = ((iM559712 ^ i6) * (-127)) ^ 2086823287;
                    i12 = i3;
                    bArr2 = bArr2;
                    i2 = -1184642305;
                    i8 = iM55979 ^ i2;
                    break;
                case -1614981152:
                case -911927443:
                    f65869 = bArr2;
                    i4 = i16;
                    bArr3 = new byte[i4];
                    if (!C0949.m56012()) {
                        byte[] bArr4 = bArr2;
                        int iM55681 = (C0873.m55680("᩻ۨ") + i5) * 83;
                        i7 = ((iM55681 ^ i6) * (-8015)) ^ 556584750;
                        i16 = i4;
                        iM55979 = iM55681;
                        bArr2 = bArr4;
                        i2 = 1660400117;
                    } else {
                        int iM559713 = C0946.m55979("۫ܺ") ^ i6;
                        i16 = i4;
                        iM55979 = iM559713;
                        i7 = ((iM559713 ^ i5) * 24899) ^ (-1312066100);
                        bArr2 = bArr2;
                        i2 = -1537087231;
                    }
                    i8 = iM55979 ^ i2;
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
                    f65867 = bArr3;
                    sArr = f82953;
                    if (C0912.m55833()) {
                        iM55979 = C0946.m55979("ܶۨ") ^ i6;
                        i7 = ((iM55979 ^ i5) * 11869) ^ (-93847619);
                        i2 = 1601577749;
                    } else {
                        iM55979 = (C0946.m55979("ۜۨ") + i6) * 93;
                        i7 = ((iM55979 ^ i5) * (-1295)) ^ (-1963294107);
                        i2 = 259975876;
                    }
                    i8 = iM55979 ^ i2;
                    break;
                case -1480813212:
                case 1883968402:
                    ServiceConnectionC1013.m56157();
                    if (RunnableC0938.f81886 < 0) {
                        iM55979 = C0946.m55979("ܶۨ") ^ i6;
                        i7 = ((iM55979 ^ i5) * 11869) ^ (-93847619);
                        i2 = 1601577749;
                    } else {
                        iM55979 = (C0946.m55979("ܳ᩸") ^ i5) * (-95);
                        i7 = ((iM55979 ^ i6) * 18505) ^ (-683433256);
                        i2 = -1042436602;
                    }
                    i8 = iM55979 ^ i2;
                    break;
                case -1410619207:
                case 1046619778:
                    i3 = 5215;
                    int iM559714 = C0946.m55979("ۨ᩷") ^ i5;
                    i16 = i16;
                    iM55979 = iM559714;
                    i7 = ((iM559714 ^ i6) * (-127)) ^ 2086823287;
                    i12 = i3;
                    bArr2 = bArr2;
                    i2 = -1184642305;
                    i8 = iM55979 ^ i2;
                    break;
                case -1257387774:
                case 1808473870:
                    if (C1028.f81950 > 0) {
                        iM55979 = C0946.m55979("ۜۜ") ^ i5;
                        i7 = ((iM55979 ^ i6) * (-10685)) ^ (-1273500118);
                        i2 = 767212499;
                    } else {
                        iM55979 = C0946.m55979("ܶۨ") ^ i6;
                        i7 = ((iM55979 ^ i5) * 11869) ^ (-93847619);
                        i2 = 1601577749;
                    }
                    i8 = iM55979 ^ i2;
                    break;
                case -1050901313:
                case 1516787502:
                    if (i10 - (i11 * i11) >= 0) {
                        iM55979 = (i6 - C0946.m55979("ۡۖ")) * (-121);
                        i7 = ((iM55979 ^ i5) * 17259) ^ (-2024422353);
                        i2 = 328258088;
                    } else {
                        iM55979 = (C0946.m55979("᩸ۛ") + i5) * 13;
                        i7 = ((iM55979 ^ i6) * 17047) ^ (-1631063300);
                        i2 = -957952818;
                    }
                    i8 = iM55979 ^ i2;
                    break;
                case -891250970:
                case 827873716:
                    C0845.m55584();
                    C1194.m56396();
                    throw new RuntimeException();
                case -772156406:
                case -689239563:
                    f65870 = bytes;
                    executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                    if (C1929.f83011 != 0) {
                        i4 = i16;
                        int iM559715 = C0946.m55979("۫ܺ") ^ i6;
                        i16 = i4;
                        iM55979 = iM559715;
                        i7 = ((iM559715 ^ i5) * 24899) ^ (-1312066100);
                        bArr2 = bArr2;
                        i2 = -1537087231;
                    } else {
                        iM55979 = C0946.m55979("᩶۠") ^ i5;
                        i7 = ((iM55979 ^ i6) * 20907) ^ 330423746;
                        i2 = 119835174;
                    }
                    i8 = iM55979 ^ i2;
                    break;
                case -662046755:
                case 1901631924:
                    byte[] bArr5 = {82, 97, 114, PublicSuffixDatabase.EXCEPTION_MARKER, 26, 7};
                    if (C0861.f81831) {
                        int iM559716 = C0946.m55979("ۧۙ") ^ i6;
                        i2 = 1268231182;
                        i16 = 6;
                        i7 = ((iM559716 ^ i5) * 8765) ^ (-2145807494);
                        bArr2 = bArr5;
                        iM55979 = iM559716;
                    } else {
                        bArr2 = bArr5;
                        i16 = 6;
                        iM55979 = C0946.m55979("ܶۨ") ^ i6;
                        i7 = ((iM55979 ^ i5) * 11869) ^ (-93847619);
                        i2 = 1601577749;
                    }
                    i8 = iM55979 ^ i2;
                    break;
                case -587292749:
                case 214557734:
                    bytes = C1017.m56189(sArr, i13, 12, i12).getBytes();
                    if (C0946.m55980() != 0) {
                        iM55979 = C0946.m55979("ۜۜ") ^ i5;
                        i7 = ((iM55979 ^ i6) * (-10685)) ^ (-1273500118);
                        i2 = 767212499;
                    } else {
                        iM55979 = (i5 - C0946.m55979("ۨ᩶")) * 29;
                        i7 = ((iM55979 ^ i6) * 18703) ^ 1970985678;
                        i2 = -1047198346;
                    }
                    i8 = iM55979 ^ i2;
                    break;
                case -251179353:
                case 1280355838:
                    if (C1053.m56327() < 0) {
                        int iM559717 = (C0946.m55979("ۡܽ") ^ i6) * (-41);
                        i7 = ((iM559717 ^ i5) * C0719o.a.f2897c) ^ 1684222229;
                        i16 = i16;
                        iM55979 = iM559717;
                        bArr2 = bArr2;
                        i2 = -805481434;
                    } else {
                        iM55979 = C0946.m55979("ܶۨ") ^ i6;
                        i7 = ((iM55979 ^ i5) * 11869) ^ (-93847619);
                        i2 = 1601577749;
                    }
                    i8 = iM55979 ^ i2;
                    break;
                case 59383860:
                case 1067225614:
                    i15 = s * s;
                    if (C0890.m55740()) {
                        iM55979 = (C0946.m55979("ۢۡ") ^ i6) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i7 = ((iM55979 ^ i5) * 19291) ^ 737802703;
                        i2 = 613951604;
                    } else {
                        i4 = i16;
                        int iM559718 = C0946.m55979("۫ܺ") ^ i6;
                        i16 = i4;
                        iM55979 = iM559718;
                        i7 = ((iM559718 ^ i5) * 24899) ^ (-1312066100);
                        bArr2 = bArr2;
                        i2 = -1537087231;
                    }
                    i8 = iM55979 ^ i2;
                    break;
                case 484370540:
                case 1102491580:
                    i13 = 1;
                    if (C1194.f82045 != 0) {
                        i4 = i16;
                        int iM559719 = C0946.m55979("۫ܺ") ^ i6;
                        i16 = i4;
                        iM55979 = iM559719;
                        i7 = ((iM559719 ^ i5) * 24899) ^ (-1312066100);
                        bArr2 = bArr2;
                        i2 = -1537087231;
                    } else {
                        iM55979 = C0946.m55979("᩷᩵") ^ i6;
                        i7 = ((iM55979 ^ i5) * (-26867)) ^ 750619286;
                        i2 = -656372284;
                    }
                    i8 = iM55979 ^ i2;
                    break;
                case 710271882:
                case 1724742817:
                    f65868 = executorServiceNewSingleThreadExecutor;
                    f65866 = new HashSet();
                    return;
                case 1921269926:
                case 2042007021:
                    i10 = i9 + i9;
                    i11 = s + 8566;
                    if (C0892.f81851) {
                        iM55979 = C0946.m55979("᩹ᩳ") ^ i6;
                        i7 = ((iM55979 ^ i5) * (-6283)) ^ 1819592214;
                        i2 = 360049817;
                    } else {
                        iM55979 = C0946.m55979("ۜۜ") ^ i5;
                        i7 = ((iM55979 ^ i6) * (-10685)) ^ (-1273500118);
                        i2 = 767212499;
                    }
                    i8 = iM55979 ^ i2;
                    break;
                default:
                    bArr = bArr2;
                    i = i16;
                    s = f82953[0];
                    if (RunnableC0897.f81856) {
                        int iM559720 = C0946.m55979("ۖܳ") ^ i5;
                        i7 = ((iM559720 ^ i6) * 17949) ^ 407328486;
                        i16 = i;
                        iM55979 = iM559720;
                        bArr2 = bArr;
                        i2 = 1584825534;
                    } else {
                        i16 = i;
                        bArr2 = bArr;
                        iM55979 = C0946.m55979("ܶۨ") ^ i6;
                        i7 = ((iM55979 ^ i5) * 11869) ^ (-93847619);
                        i2 = 1601577749;
                    }
                    i8 = iM55979 ^ i2;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m47304(C18107 c18107, InterfaceC19370 interfaceC19370, InterfaceC20295 interfaceC20295) {
        AbstractC18422 abstractC18422M56000 = null;
        int i = -313274302;
        int i2 = C0949.f81897;
        int i3 = C0873.f81841;
        int iM55979 = (i3 - C0946.m55979("᩹֡")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
        int i4 = ((iM55979 ^ i2) * (-13665)) ^ (-940493895);
        int i5 = 2009174105;
        while (true) {
            i = ((((i ^ i2) * (-27883)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2124787162:
                case 111290447:
                    if (C1053.f81965 <= 0) {
                        iM55979 = C0873.m55680("ۗ᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * 10981) ^ 1434692612;
                        i5 = -630045719;
                    } else {
                        iM55979 = C0873.m55680("᩸ۜ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 21379) ^ 1888309773;
                        i5 = 1122383680;
                    }
                    break;
                case -2083070995:
                case -51519145:
                    if (RunnableC0897.f81856) {
                        iM55979 = C0946.m55979("ۨ᩺") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-15009)) ^ (-1447350655);
                        i5 = 1682728848;
                    } else {
                        iM55979 = (C0873.m55680("ܰۖ") ^ i3) * 99;
                        i4 = ((iM55979 ^ i2) * (-13035)) ^ (-1876992893);
                        i5 = -1883237007;
                    }
                    break;
                case -1897094172:
                case -404180990:
                    if (C1046.m56302() != 0) {
                        iM55979 = C0946.m55979("ۢۙ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 20697) ^ (-1949578378);
                        i5 = -1641803863;
                    } else {
                        iM55979 = (C0946.m55979("ܿ֨") ^ i2) * (-59);
                        i4 = ((iM55979 ^ i3) * 13369) ^ (-1180355700);
                        i5 = -2010552074;
                    }
                    break;
                case -1647042095:
                case 1820134828:
                    if (!C0927.f81875) {
                        iM55979 = C0946.m55979("ۢۙ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 20697) ^ (-1949578378);
                        i5 = -1641803863;
                    } else {
                        iM55979 = C0873.m55680("֨ۨ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 3469) ^ (-506603290);
                        i5 = -1557031762;
                    }
                    break;
                case -1522755823:
                case -996918056:
                    C0912.m55833();
                    C0992.m56107();
                    iM55979 = C0873.m55680("᩻ܿ") ^ i2;
                    i4 = ((iM55979 ^ i3) * (-10605)) ^ (-977723839);
                    i5 = 426068729;
                    break;
                case -1321343133:
                case 408281954:
                    if (C0947.f81895) {
                        iM55979 = C0873.m55680("᩻ܿ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-10605)) ^ (-977723839);
                        i5 = 426068729;
                    } else {
                        iM55979 = C0946.m55979("ܶۡ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-2315)) ^ 1288905206;
                        i5 = -1160349481;
                    }
                    break;
                case -1122362588:
                case -623307413:
                    if (C0967.f81910 >= 0) {
                        iM55979 = C0873.m55680("ۗ᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * 10981) ^ 1434692612;
                        i5 = -630045719;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ۚۘ")) * (-51);
                        i4 = ((iM55979 ^ i2) * 24985) ^ 718068046;
                        i5 = 41960905;
                    }
                    break;
                case -1070531845:
                case 513632438:
                    C0845.m55584();
                    C0930.m55885();
                    break;
                case -983796594:
                case 2053615304:
                    C1048.m56305();
                    if (C0989.f81920 < 0) {
                        iM55979 = C0946.m55979("ۢۙ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 20697) ^ (-1949578378);
                        i5 = -1641803863;
                    } else {
                        iM55979 = C0873.m55680("᩻ܿ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-10605)) ^ (-977723839);
                        i5 = 426068729;
                    }
                    break;
                case -738342970:
                case 1874435821:
                    if (C0866.f81837 >= 0) {
                        iM55979 = (C0873.m55680("ܰۖ") ^ i3) * 99;
                        i4 = ((iM55979 ^ i2) * (-13035)) ^ (-1876992893);
                        i5 = -1883237007;
                    } else {
                        iM55979 = (C0946.m55979("֫ۚ") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM55979 ^ i2) * (-31155)) ^ 2022079233;
                        i5 = 1586277356;
                    }
                    break;
                case -695753435:
                case 2019828572:
                    abstractC18422M56000.m41979(c18107, interfaceC19370, new C21441(interfaceC19370, interfaceC20295));
                    break;
                case -328448095:
                case 952763505:
                    if (C0877.m55696()) {
                        iM55979 = C0873.m55680("۬ܳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-26891)) ^ (-639149003);
                        i5 = -1118272893;
                    } else {
                        iM55979 = C0873.m55680("ۗ᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * 10981) ^ 1434692612;
                        i5 = -630045719;
                    }
                    break;
                case 356112107:
                case 1669337754:
                    if (C0992.m56107() <= 0) {
                        iM55979 = (C0873.m55680("ܰۖ") ^ i3) * 99;
                        i4 = ((iM55979 ^ i2) * (-13035)) ^ (-1876992893);
                        i5 = -1883237007;
                    } else {
                        iM55979 = C0873.m55680("ܳܿ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-28669)) ^ 221910543;
                        i5 = 179023244;
                    }
                    break;
                case 1599214727:
                case 1722662352:
                    abstractC18422M56000 = C0947.m56000(c18107);
                    if (C0861.f81831) {
                        iM55979 = C0873.m55680("᩺ۗ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 24243) ^ (-555116386);
                        i5 = -1590586137;
                    } else {
                        iM55979 = C0873.m55680("ۗ᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * 10981) ^ 1434692612;
                        i5 = -630045719;
                    }
                    break;
                case 1631326365:
                case 2047536660:
                    if (RunnableC0938.m55938() != 0) {
                        iM55979 = C0873.m55680("֨ۨ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 3469) ^ (-506603290);
                        i5 = -1557031762;
                    } else {
                        iM55979 = C0873.m55680("᩵ᩳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-1647)) ^ 1232253833;
                        i5 = 98678111;
                    }
                    break;
                default:
                    if (C0949.f81897 < 0) {
                        iM55979 = (C0873.m55680("ܰۖ") ^ i3) * 99;
                        i4 = ((iM55979 ^ i2) * (-13035)) ^ (-1876992893);
                        i5 = -1883237007;
                    } else {
                        iM55979 = C0873.m55680("֨ۨ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 3469) ^ (-506603290);
                        i5 = -1557031762;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m47305(InterfaceC19370 interfaceC19370, InterfaceC20295 interfaceC20295, C12073 c12073) {
        c12073.m27641();
        AbstractC17043 abstractC17043M27644 = c12073.m27644();
        synchronized (C20966.class) {
            f65865 = C0989.m56086(abstractC17043M27644);
            f65871 = interfaceC19370.getPath();
        }
        interfaceC20295.mo8469(abstractC17043M27644);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m47292(String str) {
        synchronized (C20966.class) {
            if (!C0906.m55806(str, f65865)) {
                return str;
            }
            return f65871;
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
    /* JADX INFO: renamed from: ֫ */
    public static EnumC6213 m47293(AbstractC17043 abstractC17043) throws Throwable {
        byte b;
        int i;
        byte[] bArr;
        Throwable th;
        int i2;
        int i3;
        int iM55979;
        int i4;
        int i5;
        int i6;
        int iM559710;
        int i7;
        int i8;
        int i9;
        int iM55680;
        int i10;
        int i11;
        int iM559711;
        int i12;
        int i13;
        int iM55681;
        int i14;
        int i15;
        int iM55682;
        int i16;
        int i17;
        int i18;
        InputStream inputStream;
        int i19;
        int iM559712;
        int i20;
        int i21;
        int iM55683;
        int i22;
        int i23;
        int i24 = C0894.f81854;
        int i25 = C1017.f81942;
        int iM559713 = C0946.m55979("ܶ۠") ^ i24;
        int i26 = ((iM559713 ^ i25) * (-841)) ^ (-1819296249);
        Throwable th2 = null;
        Object obj = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        String strM55929 = null;
        int i27 = iM559713 ^ (-1893380856);
        InputStream inputStreamM56128 = null;
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
        int iM55651 = 0;
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
                    iM559711 = C0946.m55979("۠ܳ") ^ i25;
                    i12 = ((iM559711 ^ i24) * (-28383)) ^ (-1121523449);
                    i13 = -1805173745;
                    i27 = iM559711 ^ i13;
                    i26 = i12;
                    b7 = b7;
                    i28 = i28;
                    th2 = th2;
                    bArr5 = bArr5;
                    iM55651 = iM55651;
                    length = length;
                    b6 = b6;
                    i30 = i30;
                    break;
                case -2070273508:
                case 971314138:
                    i29 = i29;
                    i30 = i30;
                    if (C1028.m56248(strM55929, RunnableC0938.m55936(f82953, 78, 8, i31))) {
                        iM55683 = (C0873.m55680("ܰᩴ") + i24) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i22 = ((iM55683 ^ i25) * 24517) ^ 574245079;
                        i23 = 1411003477;
                    } else {
                        iM55683 = (C0873.m55680("֡ۗ") ^ i24) * (-83);
                        i22 = ((iM55683 ^ i25) * (-31169)) ^ 2091449852;
                        i23 = 478328637;
                    }
                    int i35 = iM55683 ^ i23;
                    i30 = i30;
                    int i36 = i29;
                    i27 = i35;
                    i26 = i22;
                    i29 = i36;
                    break;
                case -2025886049:
                case 654023563:
                    i28++;
                    iM55683 = (i25 - C0946.m55979("ܿۘ")) * 89;
                    i22 = ((iM55683 ^ i24) * 20397) ^ 1354852731;
                    i23 = 1568585284;
                    int i37 = iM55683 ^ i23;
                    i30 = i30;
                    int i38 = i29;
                    i27 = i37;
                    i26 = i22;
                    i29 = i38;
                    break;
                case -1976931440:
                case 1119845708:
                    return EnumC6213.f15650;
                case -1943815225:
                case -148196255:
                    i30 = i30;
                    b6 = b6;
                    b = b7;
                    length = length;
                    i = iM55651;
                    bArr = bArr5;
                    th = th2;
                    i2 = i28;
                    try {
                        C0955.m56034(inputStreamM56128);
                        i9 = i;
                        iM55680 = C0873.m55680("ۗۛ") ^ i24;
                        i10 = ((iM55680 ^ i25) * 6323) ^ 287528165;
                        i11 = -1189632627;
                        int i39 = iM55680 ^ i11;
                        b7 = b;
                        i28 = i2;
                        th2 = th;
                        bArr5 = bArr;
                        iM55651 = i9;
                        i27 = i39;
                        i26 = i10;
                        length = length;
                        b6 = b6;
                        i30 = i30;
                    } catch (Throwable th3) {
                        int iM559714 = C0946.m55979("۟۟") ^ i24;
                        obj = th3;
                        i26 = ((iM559714 ^ i25) * (-30013)) ^ 1544173653;
                        b7 = b;
                        length = length;
                        b6 = b6;
                        i30 = i30;
                        i3 = i2;
                        th2 = th;
                        bArr5 = bArr;
                        iM55651 = i;
                        i27 = iM559714 ^ (-938492362);
                        i28 = i3;
                    }
                    break;
                case -1919988422:
                case -502688203:
                    i29 = i29;
                    i30 = i30;
                    if (C0898.m55799(strM55929, C0854.m55597(f82953, 40, 4, i31))) {
                        iM55683 = (C0873.m55680("ܰᩴ") + i24) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i22 = ((iM55683 ^ i25) * 24517) ^ 574245079;
                        i23 = 1411003477;
                    } else {
                        iM55683 = C0873.m55680("ܿ᩹") ^ i25;
                        i22 = ((iM55683 ^ i24) * 26859) ^ (-192049888);
                        i23 = 94988433;
                    }
                    int i310 = iM55683 ^ i23;
                    i30 = i30;
                    int i311 = i29;
                    i27 = i310;
                    i26 = i22;
                    i29 = i311;
                    break;
                case -1911963622:
                case 861295046:
                    return EnumC6213.f15647;
                case -1909619370:
                case -1267041555:
                    i29 = i29;
                    i30 = i30;
                    if (i28 < length) {
                        iM55683 = (C0873.m55680("ܳᩳ") ^ i25) * 45;
                        i22 = ((iM55683 ^ i24) * 11655) ^ 192632989;
                        i23 = 177640202;
                    } else {
                        iM55683 = (C0873.m55680("ᩳۜ") + i24) * (-113);
                        i22 = ((iM55683 ^ i25) * (-3049)) ^ 893919215;
                        i23 = 957729237;
                    }
                    int i312 = iM55683 ^ i23;
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
                    if (C1028.m56248(strM55929, C0894.m55773(f82953, 29, 4, i31))) {
                        iM55683 = (C0873.m55680("ܰᩴ") + i24) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i22 = ((iM55683 ^ i25) * 24517) ^ 574245079;
                        i23 = 1411003477;
                    } else {
                        iM55683 = (i25 - C0873.m55680("ܿۖ")) * (-69);
                        i22 = ((iM55683 ^ i24) * (-27415)) ^ 510757734;
                        i23 = -1557422763;
                    }
                    int i314 = iM55683 ^ i23;
                    i30 = i30;
                    int i315 = i29;
                    i27 = i314;
                    i26 = i22;
                    i29 = i315;
                    break;
                case -1878626231:
                case 886306572:
                    return EnumC6213.f15649;
                case -1850131017:
                case 1285324685:
                    b7 = b7;
                    byte b8 = b6;
                    length = length;
                    int i40 = i30;
                    b6 = b8;
                    try {
                        bArr2 = f65869;
                        iM55979 = (C0946.m55979("᩷ۡ") ^ i24) * (-69);
                        i30 = i40;
                        i4 = ((iM55979 ^ i25) * 10271) ^ 1645082985;
                        i5 = 2129591127;
                        i27 = iM55979 ^ i5;
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
                        i17 = iM55651;
                        inputStream = inputStreamM56128;
                        int iM55684 = C0873.m55680("᩺᩸") ^ i25;
                        int i41 = ((iM55684 ^ i24) * (-27453)) ^ 100950350;
                        b7 = b7;
                        iM55651 = i17;
                        i27 = iM55684 ^ 666843940;
                        inputStreamM56128 = inputStream;
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
                    if (C1028.m56248(strM55929, C1194.m56386(f82953, 74, 4, i31))) {
                        iM55683 = (C0873.m55680("ܰᩴ") + i24) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i22 = ((iM55683 ^ i25) * 24517) ^ 574245079;
                        i23 = 1411003477;
                    } else {
                        iM55683 = (i25 - C0873.m55680("֨֨")) * (-81);
                        i22 = ((iM55683 ^ i24) * 21377) ^ 1304076473;
                        i23 = 540427146;
                    }
                    int i316 = iM55683 ^ i23;
                    i30 = i30;
                    int i317 = i29;
                    i27 = i316;
                    i26 = i22;
                    i29 = i317;
                    break;
                case -1807809711:
                case 322854212:
                    i31 = 61273;
                    iM559710 = (C0946.m55979("ۙܰ") ^ i25) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i7 = ((iM559710 ^ i24) * (-5551)) ^ 746441616;
                    i8 = -713985244;
                    int i42 = iM559710 ^ i8;
                    b7 = b7;
                    i28 = i28;
                    th2 = th2;
                    bArr5 = bArr5;
                    iM55651 = iM55651;
                    i27 = i42;
                    i26 = i7;
                    inputStreamM56128 = inputStreamM56128;
                    i33 = i33;
                    length = length;
                    b6 = b6;
                    i30 = i30;
                    break;
                case -1714665582:
                case 41042189:
                    i30 = i30;
                    i17 = iM55651;
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
                            C23461.m52171(inputStreamM56128, bArr7, i18);
                            inputStream = inputStreamM56128;
                            try {
                                iM55651 = C0866.m55651(0, bArr7);
                                int iM55685 = (C0873.m55680("ۚ۠") ^ i25) * 95;
                                i27 = iM55685 ^ (-1186298355);
                                i26 = ((iM55685 ^ i24) * 19505) ^ 653684759;
                                b7 = b7;
                                inputStreamM56128 = inputStream;
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
                                int iM55686 = C0873.m55680("᩺᩸") ^ i25;
                                int i43 = ((iM55686 ^ i24) * (-27453)) ^ 100950350;
                                b7 = b7;
                                iM55651 = i17;
                                i27 = iM55686 ^ 666843940;
                                inputStreamM56128 = inputStream;
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
                            inputStream = inputStreamM56128;
                            bArr5 = bArr7;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        inputStream = inputStreamM56128;
                        bArr5 = bArr6;
                    }
                    i28 = i3;
                    break;
                case -1612770665:
                case 1619913721:
                    i29 = i29;
                    i30 = i30;
                    if (C0894.m55765(C0892.m55744(abstractC17043)).matches(C0892.m55750(f82953, 90, 80, i31))) {
                        iM55683 = C0873.m55680("۟᩻") ^ i24;
                        i22 = ((iM55683 ^ i25) * 32295) ^ (-263787352);
                        i23 = 600985502;
                    } else {
                        iM55683 = (C0946.m55979("ᩴۗ") + i25) * (-65);
                        i22 = ((iM55683 ^ i24) * (-16887)) ^ 308099983;
                        i23 = -1948116321;
                    }
                    int i318 = iM55683 ^ i23;
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
                        iM55683 = C0946.m55979("֫᩻") ^ i24;
                        i22 = ((iM55683 ^ i25) * 23667) ^ 13561996;
                        i23 = -120659573;
                    } else {
                        iM55683 = (C0873.m55680("ܽۚ") + i25) * (-45);
                        i22 = ((iM55683 ^ i24) * 8613) ^ (-220834935);
                        i23 = 1728876687;
                    }
                    int i3110 = iM55683 ^ i23;
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
                    if (C0898.m55799(RunnableC0938.m55929(C0892.m55744(abstractC17043)), C0866.m55652(f82953, 86, 4, i31))) {
                        iM55683 = (C0873.m55680("᩻ᩳ") + i24) * (-41);
                        i22 = ((iM55683 ^ i25) * 21121) ^ (-444670517);
                        i23 = -1232226996;
                    } else {
                        iM55683 = C0873.m55680("ᩳ۬") ^ i25;
                        i22 = ((iM55683 ^ i24) * (-13469)) ^ 1426435776;
                        i23 = 1315251204;
                    }
                    int i3112 = iM55683 ^ i23;
                    i30 = i30;
                    int i3113 = i29;
                    i27 = i3112;
                    i26 = i22;
                    i29 = i3113;
                    break;
                case -1557742650:
                case -191773654:
                    i19 = 0;
                    int iM55687 = (C0873.m55680("ܰ᩸") ^ i24) * (-25);
                    int i44 = i19;
                    i26 = ((iM55687 ^ i25) * 27273) ^ 1358505869;
                    b7 = b7;
                    i27 = iM55687 ^ (-1994817141);
                    length = length;
                    b6 = b6;
                    i30 = i44;
                    break;
                case -1553433477:
                case 405647034:
                    i29 = i29;
                    i30 = i30;
                    byte[] bArr8 = f65870;
                    try {
                        length = bArr8.length;
                        int iM55688 = C0873.m55680("᩹ܰ") ^ i25;
                        i6 = ((iM55688 ^ i24) * (-20207)) ^ 1455445322;
                        bArr4 = bArr8;
                        i29 = i29;
                        i27 = iM55688 ^ (-1469119675);
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
                        i17 = iM55651;
                        inputStream = inputStreamM56128;
                        int iM55689 = C0873.m55680("᩺᩸") ^ i25;
                        int i45 = ((iM55689 ^ i24) * (-27453)) ^ 100950350;
                        b7 = b7;
                        iM55651 = i17;
                        i27 = iM55689 ^ 666843940;
                        inputStreamM56128 = inputStream;
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
                    iM55979 = C0873.m55680("۬ۙ") ^ i25;
                    i4 = ((iM55979 ^ i24) * 12397) ^ (-903316179);
                    i5 = -1048486752;
                    i27 = iM55979 ^ i5;
                    i26 = i4;
                    b7 = b7;
                    length = length;
                    b6 = b6;
                    i30 = i30;
                    break;
                case -1517098671:
                case -283978203:
                    i32 = 0;
                    iM55979 = C0873.m55680("۬ۙ") ^ i25;
                    i4 = ((iM55979 ^ i24) * 12397) ^ (-903316179);
                    i5 = -1048486752;
                    i27 = iM55979 ^ i5;
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
                        iM559712 = C0946.m55979("ܰۜ") ^ i25;
                        i20 = ((iM559712 ^ i24) * (-20387)) ^ 484015263;
                        i21 = 2090427434;
                    } else {
                        iM559712 = (C0946.m55979("۠۠") + i25) * (-65);
                        i20 = ((iM559712 ^ i24) * (-26249)) ^ (-565996486);
                        i21 = -2024756673;
                    }
                    i27 = iM559712 ^ i21;
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
                        int iM556810 = (i24 - C0873.m55680("᩷ᩴ")) * 109;
                        i27 = iM556810 ^ 1056325602;
                        i26 = ((iM556810 ^ i25) * (-10807)) ^ (-597143356);
                        i30 = i30;
                        b6 = b11;
                        length = length;
                    } catch (Throwable th10) {
                        th = th10;
                        b6 = b11;
                        i28 = i28;
                        i18 = i33;
                        i17 = iM55651;
                        inputStream = inputStreamM56128;
                        int iM556811 = C0873.m55680("᩺᩸") ^ i25;
                        int i48 = ((iM556811 ^ i24) * (-27453)) ^ 100950350;
                        b7 = b7;
                        iM55651 = i17;
                        i27 = iM556811 ^ 666843940;
                        inputStreamM56128 = inputStream;
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
                    RunnableC0897.m55779(inputStreamM56128);
                    iM55683 = C0946.m55979("᩻᩵") ^ i25;
                    i22 = ((iM55683 ^ i24) * (-15089)) ^ (-1170602945);
                    i23 = 924785087;
                    int i3114 = iM55683 ^ i23;
                    i30 = i30;
                    int i3115 = i29;
                    i27 = i3114;
                    i26 = i22;
                    i29 = i3115;
                    break;
                case -1364548213:
                case -838823078:
                    return EnumC6213.f15648;
                case -1249025989:
                case 1250381416:
                    i29 = i29;
                    i30 = i30;
                    z6 = true;
                    iM55683 = C0946.m55979("ܺۜ") ^ i24;
                    i22 = ((iM55683 ^ i25) * (-31863)) ^ 1173479079;
                    i23 = -353649207;
                    int i3116 = iM55683 ^ i23;
                    i30 = i30;
                    int i3117 = i29;
                    i27 = i3116;
                    i26 = i22;
                    i29 = i3117;
                    break;
                case -1210045844:
                case 1179088382:
                    i31 = 63327;
                    iM559710 = (C0946.m55979("ۙܰ") ^ i25) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i7 = ((iM559710 ^ i24) * (-5551)) ^ 746441616;
                    i8 = -713985244;
                    int i49 = iM559710 ^ i8;
                    b7 = b7;
                    i28 = i28;
                    th2 = th2;
                    bArr5 = bArr5;
                    iM55651 = iM55651;
                    i27 = i49;
                    i26 = i7;
                    inputStreamM56128 = inputStreamM56128;
                    i33 = i33;
                    length = length;
                    b6 = b6;
                    i30 = i30;
                    break;
                case -1175736592:
                case 1770248312:
                    i29 = i29;
                    i30 = i30;
                    if (C0898.m55799(strM55929, C1012.m56144(f82953, 52, 9, i31))) {
                        iM55683 = (C0873.m55680("ܰᩴ") + i24) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i22 = ((iM55683 ^ i25) * 24517) ^ 574245079;
                        i23 = 1411003477;
                    } else {
                        iM55683 = (C0946.m55979("᩻ۜ") ^ i25) * (-67);
                        i22 = ((iM55683 ^ i24) * (-24921)) ^ (-645343462);
                        i23 = -461068123;
                    }
                    int i3118 = iM55683 ^ i23;
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
                        bArr3 = f65867;
                        iM55979 = (C0946.m55979("ۗۨ") + i25) * (-13);
                        i4 = ((iM55979 ^ i24) * 24349) ^ (-1459449412);
                        i5 = -65164464;
                        i27 = iM55979 ^ i5;
                        i26 = i4;
                        b7 = b7;
                        length = length;
                        b6 = b6;
                        i30 = i30;
                    } catch (Throwable th11) {
                        th = th11;
                        i28 = i28;
                        i18 = i33;
                        i17 = iM55651;
                        inputStream = inputStreamM56128;
                        int iM556812 = C0873.m55680("᩺᩸") ^ i25;
                        int i410 = ((iM556812 ^ i24) * (-27453)) ^ 100950350;
                        b7 = b7;
                        iM55651 = i17;
                        i27 = iM556812 ^ 666843940;
                        inputStreamM56128 = inputStream;
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
                    iM55979 = (C0873.m55680("᩷ۢ") ^ i24) * 57;
                    i4 = ((iM55979 ^ i25) * 22275) ^ 484767092;
                    i5 = -1350438449;
                    i27 = iM55979 ^ i5;
                    i26 = i4;
                    b7 = b7;
                    length = length;
                    b6 = b6;
                    i30 = i30;
                    break;
                case -984606808:
                case 87961919:
                    return EnumC6213.f15646;
                case -882637380:
                case 71796350:
                    i30 = i30;
                    b6 = b6;
                    b7 = b7;
                    if (b6 != b7) {
                        iM55979 = (C0873.m55680("ۤ۫") + i25) * 3;
                        length = length;
                        i4 = ((iM55979 ^ i24) * 11251) ^ 90454292;
                        i5 = 1901299486;
                    } else {
                        length = length;
                        iM55979 = (i24 - C0873.m55680("ܽ֡")) * (-33);
                        i4 = ((iM55979 ^ i25) * 13343) ^ (-1592882901);
                        i5 = -405035725;
                    }
                    i27 = iM55979 ^ i5;
                    i26 = i4;
                    b7 = b7;
                    length = length;
                    b6 = b6;
                    i30 = i30;
                    break;
                case -857721460:
                case 612325064:
                    i19 = i30 + 1;
                    int iM556813 = (C0873.m55680("ܰ᩸") ^ i24) * (-25);
                    int i411 = i19;
                    i26 = ((iM556813 ^ i25) * 27273) ^ 1358505869;
                    b7 = b7;
                    i27 = iM556813 ^ (-1994817141);
                    length = length;
                    b6 = b6;
                    i30 = i411;
                    break;
                case -802497459:
                case -508372901:
                    return EnumC6213.f15648;
                case -789737294:
                case -737108031:
                    i29 = i29;
                    i30 = i30;
                    if (C0898.m55799(strM55929, C0912.m55822(f82953, 44, 8, i31))) {
                        iM55683 = (C0873.m55680("ܰᩴ") + i24) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i22 = ((iM55683 ^ i25) * 24517) ^ 574245079;
                        i23 = 1411003477;
                    } else {
                        iM55683 = (C0946.m55979("ۛۢ") + i24) * (-21);
                        i22 = ((iM55683 ^ i25) * (-21815)) ^ 937451138;
                        i23 = -587325440;
                    }
                    int i31110 = iM55683 ^ i23;
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
                    if (inputStreamM56128 != null) {
                        iM55683 = (C0873.m55680("۠ܰ") + i24) * 69;
                        i22 = ((iM55683 ^ i25) * 30407) ^ 345984081;
                        i23 = -1971298396;
                    } else {
                        iM55683 = C0946.m55979("᩻᩵") ^ i25;
                        i22 = ((iM55683 ^ i24) * (-15089)) ^ (-1170602945);
                        i23 = 924785087;
                    }
                    int i31112 = iM55683 ^ i23;
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
                        iM55683 = C0873.m55680("ۗۖ") ^ i24;
                        i22 = ((iM55683 ^ i25) * (-13411)) ^ (-1824856921);
                        i23 = -636067592;
                        int i31114 = iM55683 ^ i23;
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
                        i17 = iM55651;
                        inputStream = inputStreamM56128;
                        int iM556814 = C0873.m55680("᩺᩸") ^ i25;
                        int i412 = ((iM556814 ^ i24) * (-27453)) ^ 100950350;
                        b7 = b7;
                        iM55651 = i17;
                        i27 = iM556814 ^ 666843940;
                        inputStreamM56128 = inputStream;
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
                    iM55651 = iM55651;
                    b6 = b6;
                    b7 = b7;
                    length = length;
                    bArr5 = bArr5;
                    i33 = i33;
                    th2 = th2;
                    inputStreamM56128 = inputStreamM56128;
                    i28 = i28;
                    short s = f82953[13];
                    int i50 = (s * 2) + 1;
                    int i51 = s + 1;
                    if ((i51 * i51) - i50 < 0) {
                        iM559710 = C0873.m55680("ۛۜ") ^ i25;
                        i7 = ((iM559710 ^ i24) * (-5723)) ^ (-1364211432);
                        i8 = -1744919851;
                    } else {
                        iM559710 = (i24 - C0946.m55979("ۨܶ")) * (-47);
                        i7 = ((iM559710 ^ i25) * (-8827)) ^ 1034057680;
                        i8 = 337772111;
                    }
                    int i413 = iM559710 ^ i8;
                    b7 = b7;
                    i28 = i28;
                    th2 = th2;
                    bArr5 = bArr5;
                    iM55651 = iM55651;
                    i27 = i413;
                    i26 = i7;
                    inputStreamM56128 = inputStreamM56128;
                    i33 = i33;
                    length = length;
                    b6 = b6;
                    i30 = i30;
                    break;
                case -634687398:
                case -121119174:
                    i29 = i29;
                    i30 = i30;
                    if (C0898.m55799(strM55929, C0892.m55750(f82953, 61, 8, i31))) {
                        iM55683 = (C0873.m55680("ܰᩴ") + i24) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i22 = ((iM55683 ^ i25) * 24517) ^ 574245079;
                        i23 = 1411003477;
                    } else {
                        iM55683 = C0873.m55680("۟֨") ^ i25;
                        i22 = ((iM55683 ^ i24) * 31747) ^ (-1225949369);
                        i23 = -1050069922;
                    }
                    int i31116 = iM55683 ^ i23;
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
                    if (C1028.m56248(strM55929, ServiceConnectionC1013.m56161(f82953, 33, 7, i31))) {
                        iM55683 = (C0873.m55680("ܰᩴ") + i24) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i22 = ((iM55683 ^ i25) * 24517) ^ 574245079;
                        i23 = 1411003477;
                    } else {
                        iM55683 = C0873.m55680("ᩳۤ") ^ i24;
                        i22 = ((iM55683 ^ i25) * 18729) ^ 1416399053;
                        i23 = 1869785485;
                    }
                    int i31118 = iM55683 ^ i23;
                    i30 = i30;
                    int i31119 = i29;
                    i27 = i31118;
                    i26 = i22;
                    i29 = i31119;
                    break;
                case -562772208:
                case 105479647:
                    z5 = true;
                    iM55979 = (C0946.m55979("᩻᩶") ^ i25) * 75;
                    i4 = ((iM55979 ^ i24) * (-30303)) ^ (-1469095960);
                    i5 = -534210484;
                    i27 = iM55979 ^ i5;
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
                        iM55683 = C0946.m55979("ۨᩳ") ^ i24;
                        i22 = ((iM55683 ^ i25) * (-7243)) ^ (-452667881);
                        i23 = -1388149927;
                    } else {
                        iM55683 = (C0873.m55680("ܽ۟") + i25) * 75;
                        i22 = ((iM55683 ^ i24) * 25473) ^ 54722789;
                        i23 = -1673000540;
                    }
                    int i311110 = iM55683 ^ i23;
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
                        iM55683 = C0946.m55979("ۙۡ") ^ i24;
                        i22 = ((iM55683 ^ i25) * (-21279)) ^ (-1202091243);
                        i23 = -524959331;
                    } else {
                        iM55683 = C0873.m55680("ܿܽ") ^ i25;
                        i22 = ((iM55683 ^ i24) * 24101) ^ (-526760580);
                        i23 = -340245817;
                    }
                    int i311112 = iM55683 ^ i23;
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
                        iM55683 = C0946.m55979("ܶۙ") ^ i25;
                        i22 = ((iM55683 ^ i24) * 21445) ^ 49344709;
                        i23 = -906274892;
                    } else {
                        iM55683 = C0946.m55979("ܰ᩵") ^ i24;
                        i22 = ((iM55683 ^ i25) * 23621) ^ 338787725;
                        i23 = 2013372353;
                    }
                    int i311114 = iM55683 ^ i23;
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
                    if (EnumC17494.m39850(abstractC17043)) {
                        iM55683 = C0873.m55680("۟᩵") ^ i25;
                        i22 = ((iM55683 ^ i24) * 3221) ^ (-741790226);
                        i23 = 350876820;
                    } else {
                        iM55683 = (C0873.m55680("ۨۚ") ^ i24) * (-59);
                        i22 = ((iM55683 ^ i25) * 12959) ^ 452998119;
                        i23 = 275305717;
                    }
                    int i311116 = iM55683 ^ i23;
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
                    strM55929 = RunnableC0938.m55929(C1404.m56460(abstractC17043));
                    if (C0898.m55799(strM55929, RunnableC0938.m55936(f82953, 14, 4, i31))) {
                        iM55683 = (C0873.m55680("ܰᩴ") + i24) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i22 = ((iM55683 ^ i25) * 24517) ^ 574245079;
                        i23 = 1411003477;
                    } else {
                        iM55683 = C0873.m55680("۫᩻") ^ i25;
                        i22 = ((iM55683 ^ i24) * 30899) ^ (-198978506);
                        i23 = -1111635126;
                    }
                    int i311118 = iM55683 ^ i23;
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
                        iM55683 = (C0873.m55680("ܰᩴ") + i24) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i22 = ((iM55683 ^ i25) * 24517) ^ 574245079;
                        i23 = 1411003477;
                    } else {
                        iM55683 = C0873.m55680("ۘۛ") ^ i25;
                        i22 = ((iM55683 ^ i24) * (-229)) ^ (-903421341);
                        i23 = 540979610;
                    }
                    int i3111110 = iM55683 ^ i23;
                    i30 = i30;
                    int i3111111 = i29;
                    i27 = i3111110;
                    i26 = i22;
                    i29 = i3111111;
                    break;
                case -167413680:
                case 1113994505:
                    i30 = i30;
                    i9 = iM55651;
                    b6 = b6;
                    b = b7;
                    length = length;
                    bArr = bArr5;
                    th = th2;
                    i2 = i28;
                    if (inputStreamM56128 != null) {
                        iM55680 = C0873.m55680("ۙۚ") ^ i24;
                        i10 = ((iM55680 ^ i25) * 19977) ^ 734392756;
                        i11 = 22766991;
                    } else {
                        iM55680 = C0873.m55680("ۗۛ") ^ i24;
                        i10 = ((iM55680 ^ i25) * 6323) ^ 287528165;
                        i11 = -1189632627;
                    }
                    int i320 = iM55680 ^ i11;
                    b7 = b;
                    i28 = i2;
                    th2 = th;
                    bArr5 = bArr;
                    iM55651 = i9;
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
                    iM55683 = C0873.m55680("ܿܶ") ^ i24;
                    i22 = ((iM55683 ^ i25) * (-21733)) ^ (-1816145312);
                    i23 = 759747589;
                    int i3111112 = iM55683 ^ i23;
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
                    iM55651 = iM55651;
                    bArr5 = bArr5;
                    th2 = th2;
                    i28 = i28;
                    Object obj2 = obj;
                    if (iM55651 != 101010256) {
                        iM559711 = C0946.m55979("ۘ֡") ^ i24;
                        obj = obj2;
                        i12 = ((iM559711 ^ i25) * 2943) ^ 2065376500;
                        i13 = -1690469555;
                    } else {
                        obj = obj2;
                        iM559711 = (C0946.m55979("ܳᩴ") ^ i25) * (-111);
                        i12 = ((iM559711 ^ i24) * 26011) ^ 2010438919;
                        i13 = -1811829499;
                    }
                    i27 = iM559711 ^ i13;
                    i26 = i12;
                    b7 = b7;
                    i28 = i28;
                    th2 = th2;
                    bArr5 = bArr5;
                    iM55651 = iM55651;
                    length = length;
                    b6 = b6;
                    i30 = i30;
                    break;
                case 54561424:
                case 1214742223:
                    i29 = i29;
                    i30 = i30;
                    if (C1028.m56248(strM55929, C1053.m56325(f82953, 25, 4, i31))) {
                        iM55683 = (C0873.m55680("ܰᩴ") + i24) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i22 = ((iM55683 ^ i25) * 24517) ^ 574245079;
                        i23 = 1411003477;
                    } else {
                        iM55683 = C0946.m55979("ۚ۫") ^ i24;
                        i22 = ((iM55683 ^ i25) * (-14415)) ^ (-1194940490);
                        i23 = 34753837;
                    }
                    int i3111114 = iM55683 ^ i23;
                    i30 = i30;
                    int i3111115 = i29;
                    i27 = i3111114;
                    i26 = i22;
                    i29 = i3111115;
                    break;
                case 75382125:
                case 560449495:
                    z4 = false;
                    iM55979 = (C0873.m55680("᩷ۢ") ^ i24) * 57;
                    i4 = ((iM55979 ^ i25) * 22275) ^ 484767092;
                    i5 = -1350438449;
                    i27 = iM55979 ^ i5;
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
                        iM55683 = C0946.m55979("ܺۜ") ^ i24;
                        i22 = ((iM55683 ^ i25) * (-31863)) ^ 1173479079;
                        i23 = -353649207;
                    } else {
                        iM55683 = (C0873.m55680("᩻۟") ^ i25) * 85;
                        i22 = ((iM55683 ^ i24) * (-18781)) ^ 563598425;
                        i23 = -2077234771;
                    }
                    int i3111116 = iM55683 ^ i23;
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
                        iM55682 = C0873.m55680("ۘۤ") ^ i25;
                        i6 = ((iM55682 ^ i24) * 27345) ^ 100889386;
                        i16 = 769441956;
                    } else {
                        iM55682 = (i24 - C0873.m55680("ۜᩴ")) * (-125);
                        i6 = ((iM55682 ^ i25) * 15227) ^ 1909025729;
                        i16 = -1985605945;
                    }
                    i27 = iM55682 ^ i16;
                    i26 = i6;
                    i30 = i30;
                    break;
                case 282124989:
                case 1585565540:
                    i29 = i29;
                    i30 = i30;
                    if (C1028.m56248(strM55929, C0912.m55822(f82953, 69, 5, i31))) {
                        iM55683 = (C0873.m55680("ܰᩴ") + i24) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i22 = ((iM55683 ^ i25) * 24517) ^ 574245079;
                        i23 = 1411003477;
                    } else {
                        iM55683 = C0946.m55979("ܳ᩶") ^ i24;
                        i22 = ((iM55683 ^ i25) * 1863) ^ 1433175224;
                        i23 = 524089207;
                    }
                    int i3111118 = iM55683 ^ i23;
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
                    iM55651 = iM55651;
                    bArr5 = bArr5;
                    if (iM55651 == 1430352451) {
                        iM55681 = (C0873.m55680("۬ܿ") ^ i24) * 119;
                        i14 = ((iM55681 ^ i25) * (-12789)) ^ 1470319195;
                        i15 = 492337510;
                    } else {
                        iM55681 = C0873.m55680("ۡۚ") ^ i25;
                        i14 = ((iM55681 ^ i24) * 2889) ^ (-205355841);
                        i15 = -1562946138;
                    }
                    i27 = iM55681 ^ i15;
                    i26 = i14;
                    b7 = b7;
                    bArr5 = bArr5;
                    iM55651 = iM55651;
                    length = length;
                    b6 = b6;
                    i30 = i30;
                    break;
                case 339310502:
                case 2044015832:
                    i28 = 0;
                    iM55683 = (i25 - C0946.m55979("ܿۘ")) * 89;
                    i22 = ((iM55683 ^ i24) * 20397) ^ 1354852731;
                    i23 = 1568585284;
                    int i31111110 = iM55683 ^ i23;
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
                    iM55651 = iM55651;
                    if (iM55651 != 101075792) {
                        iM55681 = (C0873.m55680("᩺ۢ") ^ i25) * (-51);
                        bArr5 = bArr5;
                        i14 = ((iM55681 ^ i24) * (-6847)) ^ (-2075624249);
                        i15 = 1918858063;
                        i27 = iM55681 ^ i15;
                        i26 = i14;
                        b7 = b7;
                        bArr5 = bArr5;
                        iM55651 = iM55651;
                        length = length;
                        b6 = b6;
                        i30 = i30;
                    } else {
                        bArr5 = bArr5;
                        th2 = th2;
                        i28 = i28;
                        iM559711 = (C0946.m55979("ܳᩴ") ^ i25) * (-111);
                        i12 = ((iM559711 ^ i24) * 26011) ^ 2010438919;
                        i13 = -1811829499;
                        i27 = iM559711 ^ i13;
                        i26 = i12;
                        b7 = b7;
                        i28 = i28;
                        th2 = th2;
                        bArr5 = bArr5;
                        iM55651 = iM55651;
                        length = length;
                        b6 = b6;
                        i30 = i30;
                    }
                    break;
                case 407027101:
                case 1534890264:
                    return EnumC6213.f15653;
                case 540702395:
                case 1591991140:
                    return EnumC6213.f15651;
                case 573412032:
                case 879720960:
                    throw th2;
                case 945662935:
                case 1974873810:
                    z3 = false;
                    iM55683 = C0946.m55979("۫ܺ") ^ i24;
                    i22 = ((iM55683 ^ i25) * 3765) ^ (-1779483587);
                    i23 = 772842685;
                    int i31111112 = iM55683 ^ i23;
                    i30 = i30;
                    int i31111113 = i29;
                    i27 = i31111112;
                    i26 = i22;
                    i29 = i31111113;
                    break;
                case 955870050:
                case 1842159580:
                    return EnumC6213.f15648;
                case 973187411:
                case 1196661950:
                    i29 = i29;
                    i30 = i30;
                    if (z3) {
                        iM55683 = C0946.m55979("ܽ۬") ^ i24;
                        i22 = ((iM55683 ^ i25) * (-20695)) ^ (-1010789744);
                        i23 = -1104235552;
                    } else {
                        iM55683 = (C0946.m55979("ۚ۟") ^ i25) * (-83);
                        i22 = ((iM55683 ^ i24) * 32151) ^ 123949888;
                        i23 = 237901844;
                    }
                    int i31111114 = iM55683 ^ i23;
                    i30 = i30;
                    int i31111115 = i29;
                    i27 = i31111114;
                    i26 = i22;
                    i29 = i31111115;
                    break;
                case 1074769686:
                case 1702630580:
                    z3 = true;
                    iM55683 = C0946.m55979("۫ܺ") ^ i24;
                    i22 = ((iM55683 ^ i25) * 3765) ^ (-1779483587);
                    i23 = 772842685;
                    int i31111116 = iM55683 ^ i23;
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
                    i = iM55651;
                    bArr = bArr5;
                    th = th2;
                    i2 = i28;
                    C0949.m56011(th, obj);
                    i9 = i;
                    iM55680 = C0873.m55680("ۗۛ") ^ i24;
                    i10 = ((iM55680 ^ i25) * 6323) ^ 287528165;
                    i11 = -1189632627;
                    int i321 = iM55680 ^ i11;
                    b7 = b;
                    i28 = i2;
                    th2 = th;
                    bArr5 = bArr;
                    iM55651 = i9;
                    i27 = i321;
                    i26 = i10;
                    length = length;
                    b6 = b6;
                    i30 = i30;
                    break;
                case 1169796789:
                case 1619832353:
                    z2 = false;
                    iM559711 = C0946.m55979("۠ܳ") ^ i25;
                    i12 = ((iM559711 ^ i24) * (-28383)) ^ (-1121523449);
                    i13 = -1805173745;
                    i27 = iM559711 ^ i13;
                    i26 = i12;
                    b7 = b7;
                    i28 = i28;
                    th2 = th2;
                    bArr5 = bArr5;
                    iM55651 = iM55651;
                    length = length;
                    b6 = b6;
                    i30 = i30;
                    break;
                case 1182364361:
                case 1795861661:
                    i30 = i30;
                    i9 = iM55651;
                    b6 = b6;
                    b = b7;
                    length = length;
                    bArr = bArr5;
                    th = th2;
                    i2 = i28;
                    inputStreamM56128 = C1003.m56128(abstractC17043);
                    i33 = 12;
                    iM55680 = C0873.m55680("ۙ᩺") ^ i24;
                    i10 = ((iM55680 ^ i25) * (-7181)) ^ (-1888188647);
                    i11 = 347384890;
                    int i322 = iM55680 ^ i11;
                    b7 = b;
                    i28 = i2;
                    th2 = th;
                    bArr5 = bArr;
                    iM55651 = i9;
                    i27 = i322;
                    i26 = i10;
                    length = length;
                    b6 = b6;
                    i30 = i30;
                    break;
                case 1203980992:
                case 1936623093:
                    z5 = false;
                    iM55979 = (C0946.m55979("᩻᩶") ^ i25) * 75;
                    i4 = ((iM55979 ^ i24) * (-30303)) ^ (-1469095960);
                    i5 = -534210484;
                    i27 = iM55979 ^ i5;
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
                    if (C0898.m55799(strM55929, C0992.m56102(f82953, 18, 7, i31))) {
                        iM55683 = (C0873.m55680("ܰᩴ") + i24) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i22 = ((iM55683 ^ i25) * 24517) ^ 574245079;
                        i23 = 1411003477;
                    } else {
                        iM55683 = C0946.m55979("֫᩵") ^ i24;
                        i22 = ((iM55683 ^ i25) * 7471) ^ (-1316149256);
                        i23 = -987778676;
                    }
                    int i31111118 = iM55683 ^ i23;
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
                    iM55651 = iM55651;
                    bArr5 = bArr5;
                    th2 = th2;
                    i28 = i28;
                    if (iM55651 != 67324752) {
                        iM559711 = C0873.m55680("ܶܰ") ^ i24;
                        i12 = ((iM559711 ^ i25) * 25231) ^ (-1704697262);
                        i13 = 1910036258;
                    } else {
                        iM559711 = (C0946.m55979("ܳᩴ") ^ i25) * (-111);
                        i12 = ((iM559711 ^ i24) * 26011) ^ 2010438919;
                        i13 = -1811829499;
                    }
                    i27 = iM559711 ^ i13;
                    i26 = i12;
                    b7 = b7;
                    i28 = i28;
                    th2 = th2;
                    bArr5 = bArr5;
                    iM55651 = iM55651;
                    length = length;
                    b6 = b6;
                    i30 = i30;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public static void m47312(C18107 c18107, InterfaceC19370 interfaceC19370) {
        int i = 1223724383;
        int i2 = C1053.f81965;
        int i3 = C0877.f81843;
        int iM55979 = C0946.m55979("ᩴۧ") ^ i2;
        int i4 = ((iM55979 ^ i3) * (-6495)) ^ (-871312266);
        int i5 = 1248799147;
        while (true) {
            i = ((((i ^ i3) * (-28999)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2106908987:
                case -267272881:
                    C0890.m55740();
                    iM55979 = C0946.m55979("ۢܶ") ^ i3;
                    i4 = ((iM55979 ^ i2) * 1497) ^ 151838129;
                    i5 = -849280380;
                    break;
                case -1946811182:
                case -356723654:
                    C0949.m56012();
                    if (C0866.f81837 < 0) {
                        iM55979 = C0873.m55680("᩷ܽ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-29119)) ^ 1748636889;
                        i5 = -1001476159;
                    } else {
                        iM55979 = C0946.m55979("ۢܶ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 1497) ^ 151838129;
                        i5 = -849280380;
                    }
                    break;
                case -1914677924:
                case -1085210165:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = C0873.m55680("᩷ܽ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-29119)) ^ 1748636889;
                        i5 = -1001476159;
                    } else {
                        iM55979 = C0873.m55680("ۚܽ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 9447) ^ 1429062527;
                        i5 = -1062572316;
                    }
                    break;
                case -1603525321:
                case 1692337146:
                    ServiceConnectionC1013.m56157();
                    if (C0992.f81922 >= 0) {
                        iM55979 = (i3 - C0946.m55979("۫۟")) * (-99);
                        i4 = ((iM55979 ^ i2) * 29557) ^ 1392327481;
                        i5 = 486713983;
                    } else {
                        iM55979 = C0873.m55680("᩷ܽ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-29119)) ^ 1748636889;
                        i5 = -1001476159;
                    }
                    break;
                case -1148210303:
                case 1733304657:
                    C1404.m56468();
                    if (C1929.f83011 != 0) {
                        iM55979 = (i3 - C0873.m55680("۫֫")) * C0254q.f1218h;
                        i4 = ((iM55979 ^ i2) * (-25979)) ^ (-970856344);
                        i5 = 418072435;
                    } else {
                        iM55979 = C0873.m55680("᩷ܽ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-29119)) ^ 1748636889;
                        i5 = -1001476159;
                    }
                    break;
                case -1087164913:
                case -48312606:
                    if (C1028.f81950 <= 0) {
                        iM55979 = (i3 - C0946.m55979("۫۟")) * (-99);
                        i4 = ((iM55979 ^ i2) * 29557) ^ 1392327481;
                        i5 = 486713983;
                    } else {
                        iM55979 = C0946.m55979("ۤۢ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-32207)) ^ 1554529281;
                        i5 = -18484487;
                    }
                    break;
                case -1003622348:
                case 1457375652:
                    if (C0894.f81854 >= 0) {
                        iM55979 = C0946.m55979("ۢܶ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 1497) ^ 151838129;
                        i5 = -849280380;
                    } else {
                        iM55979 = C0946.m55979("ܳᩴ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-18785)) ^ (-988532912);
                        i5 = -113423725;
                    }
                    break;
                case -784799872:
                case 2117089904:
                    if (C0882.f81846) {
                        iM55979 = C0946.m55979("ۢܶ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 1497) ^ 151838129;
                        i5 = -849280380;
                    } else {
                        iM55979 = C0873.m55680("ۨۛ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 17311) ^ (-1792065707);
                        i5 = 514539266;
                    }
                    break;
                case -547694392:
                case 711840668:
                    if (C0989.f81920 >= 0) {
                        iM55979 = (i3 - C0946.m55979("۫۟")) * (-99);
                        i4 = ((iM55979 ^ i2) * 29557) ^ 1392327481;
                        i5 = 486713983;
                    } else {
                        iM55979 = C0873.m55680("᩺᩷") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-26657)) ^ 1674417775;
                        i5 = -1178651831;
                    }
                    break;
                case -502535232:
                case 1890202778:
                    if (C1036.m56257() <= 0) {
                        iM55979 = (i3 - C0946.m55979("۫۟")) * (-99);
                        i4 = ((iM55979 ^ i2) * 29557) ^ 1392327481;
                        i5 = 486713983;
                    } else {
                        iM55979 = (C0946.m55979("ۖۘ") + i3) * (-57);
                        i4 = ((iM55979 ^ i2) * 32565) ^ 1930124849;
                        i5 = 2053089733;
                    }
                    break;
                case -185164689:
                case 359704650:
                    if (C1003.f81929 > 0) {
                        C1053.m56329(new C22307(c18107, interfaceC19370));
                    }
                    iM55979 = (C0873.m55680("۬֨") + i2) * (-109);
                    i4 = ((iM55979 ^ i3) * 9189) ^ (-583799611);
                    i5 = -751528643;
                    break;
                case 507838746:
                case 1295985158:
                    if (C1964.m56597() != 0) {
                        iM55979 = C0873.m55680("᩷ܽ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-29119)) ^ 1748636889;
                        i5 = -1001476159;
                    } else {
                        iM55979 = C0873.m55680("ܿܽ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-5829)) ^ (-2004824903);
                        i5 = 1652623186;
                    }
                    break;
                case 720882393:
                case 1979336822:
                    if (C0989.f81920 >= 0) {
                        iM55979 = (C0873.m55680("۬֨") + i2) * (-109);
                        i4 = ((iM55979 ^ i3) * 9189) ^ (-583799611);
                        i5 = -751528643;
                    } else {
                        iM55979 = (C0946.m55979("۫ۗ") ^ i3) * 83;
                        i4 = ((iM55979 ^ i2) * (-7231)) ^ 1415204023;
                        i5 = 1860351301;
                    }
                    break;
                case 1127138317:
                case 1421237701:
                    C1124.m56367();
                    break;
                default:
                    if (C0892.f81851) {
                        iM55979 = (C0873.m55680("۫ܿ") ^ i2) * 61;
                        i4 = ((iM55979 ^ i3) * (-19637)) ^ (-1359461706);
                        i5 = -988453085;
                    } else {
                        iM55979 = (i3 - C0873.m55680("۫֫")) * C0254q.f1218h;
                        i4 = ((iM55979 ^ i2) * (-25979)) ^ (-970856344);
                        i5 = 418072435;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m47300(C18107 c18107, AbstractC17043 abstractC17043) throws Throwable {
        InputStream inputStreamM56128 = null;
        int i = 0;
        Exception e = null;
        Main mainM56560 = null;
        Object obj = null;
        Throwable th = null;
        Object th2 = null;
        int i2 = 332141937;
        int i3 = C0863.f81833;
        int i4 = C1012.f81938;
        int iM55680 = (i3 - C0873.m55680("᩻ۧ")) * (-19);
        int i5 = ((iM55680 ^ i4) * (-28039)) ^ 486539783;
        int i6 = -1594065136;
        while (true) {
            i2 = ((((i2 ^ i4) * 6703) >> 31) & i5) ^ (iM55680 ^ i6);
            switch (i2) {
                case -2144937695:
                case 361729497:
                    C0947.m55997();
                    C0854.m55595();
                    return;
                case -2051333409:
                case 891073128:
                    if (C0946.f81894 != 0) {
                        iM55680 = (C0873.m55680("ۗۢ") ^ i4) * (-127);
                        i5 = ((iM55680 ^ i3) * 3659) ^ (-1680016829);
                        i6 = -1963535325;
                    } else {
                        iM55680 = C0946.m55979("᩸ܽ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 9483) ^ 1221208709;
                        i6 = 1592777163;
                    }
                    break;
                case -2042951679:
                case -1158389001:
                    inputStreamM56128 = C1003.m56128(abstractC17043);
                    iM55680 = C0873.m55680("ᩳ۠") ^ i4;
                    i5 = ((iM55680 ^ i3) * 383) ^ (-1567185153);
                    i6 = 1530168380;
                    break;
                case -2022138614:
                case 632507508:
                    try {
                        C0877.m55706(th, th2);
                        iM55680 = C0946.m55979("᩶ۖ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-18483)) ^ (-2076987664);
                        i6 = 193427069;
                    } catch (Exception e2) {
                        e = e2;
                        iM55680 = C0873.m55680("ܰۖ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 3017) ^ 304390900;
                        i6 = 20011736;
                    }
                    break;
                case -1936169033:
                case 1891375613:
                    if (C1404.f82149 >= 0) {
                        iM55680 = C0873.m55680("ܰۨ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-2177)) ^ (-1829629188);
                        i6 = 661251301;
                    } else {
                        iM55680 = C0873.m55680("ۘۚ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 3589) ^ (-150831825);
                        i6 = 892492043;
                    }
                    break;
                case -1808670016:
                case 806681503:
                    C1229.m56410();
                    if (C0989.f81920 < 0) {
                        iM55680 = (C0946.m55979("ܽۨ") ^ i4) * 109;
                        i5 = ((iM55680 ^ i3) * 17881) ^ 259060562;
                        i6 = -1555777332;
                    } else {
                        iM55680 = C0873.m55680("ۜۤ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 389) ^ (-1719648785);
                        i6 = -1804337346;
                    }
                    break;
                case -1776458548:
                case 433781887:
                    mainM56560 = C1929.m56560(c18107);
                    obj = null;
                    if (C0955.f81898) {
                        iM55680 = (C0873.m55680("֫ۛ") + i3) * 49;
                        i5 = ((iM55680 ^ i4) * (-8913)) ^ 866022086;
                        i6 = -2098807603;
                    } else {
                        iM55680 = C0946.m55979("᩹ۖ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 24433) ^ (-390052198);
                        i6 = -560929088;
                    }
                    break;
                case -1744843152:
                case -1118099285:
                    if (C0906.f81862 < 0) {
                        iM55680 = C0873.m55680("ۜۤ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 389) ^ (-1719648785);
                        i6 = -1804337346;
                    } else {
                        iM55680 = C0873.m55680("ۘۚ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 3589) ^ (-150831825);
                        i6 = 892492043;
                    }
                    break;
                case -1665272177:
                case -1164931349:
                    C0917.m55854();
                    if (!C1048.f81963) {
                        iM55680 = (C0946.m55979("ܳۢ") ^ i4) * 31;
                        i5 = ((iM55680 ^ i3) * 24807) ^ 985416915;
                        i6 = 1356451602;
                    } else {
                        iM55680 = (C0873.m55680("ۗۢ") ^ i4) * (-127);
                        i5 = ((iM55680 ^ i3) * 3659) ^ (-1680016829);
                        i6 = -1963535325;
                    }
                    break;
                case -1608158112:
                case -387858827:
                    if (C0989.f81920 >= 0) {
                        iM55680 = C0946.m55979("ܽۘ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-12787)) ^ 793866917;
                        i6 = 682732595;
                    } else {
                        iM55680 = C0873.m55680("ۘۚ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 3589) ^ (-150831825);
                        i6 = 892492043;
                    }
                    break;
                case -1329196395:
                case 835707788:
                    if (C0906.f81862 >= 0) {
                        iM55680 = (C0873.m55680("ۗ᩻") + i4) * 49;
                        i5 = ((iM55680 ^ i3) * (-19653)) ^ 1356856080;
                        i6 = 1551981203;
                    } else {
                        iM55680 = C0946.m55979("۬ܳ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 8207) ^ (-1855425551);
                        i6 = 408177307;
                    }
                    break;
                case -1285365432:
                case 1852803371:
                    if (inputStreamM56128 != null) {
                        iM55680 = (C0873.m55680("ۚۘ") + i4) * 11;
                        i5 = ((iM55680 ^ i3) * (-3933)) ^ 1834122816;
                        i6 = 6280211;
                    } else {
                        iM55680 = C0946.m55979("ۘۖ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 6557) ^ 1915215903;
                        i6 = -778015542;
                    }
                    break;
                case -1179041832:
                case 515952231:
                    C1044.m56272(mainM56560, e, obj);
                    return;
                case -1150419106:
                case 12571741:
                    if (C1003.m56123() != 0) {
                        iM55680 = (C0873.m55680("ۗ᩻") + i4) * 49;
                        i5 = ((iM55680 ^ i3) * (-19653)) ^ 1356856080;
                        i6 = 1551981203;
                    } else {
                        iM55680 = C0873.m55680("᩶ܿ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-18891)) ^ (-2053189217);
                        i6 = -1411928378;
                    }
                    break;
                case -947309304:
                case -69421246:
                    if (RunnableC0938.m55938() != 0) {
                        iM55680 = (C0946.m55979("ܽۨ") ^ i4) * 109;
                        i5 = ((iM55680 ^ i3) * 17881) ^ 259060562;
                        i6 = -1555777332;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ۤۡ")) * (-53);
                        i5 = ((iM55680 ^ i4) * (-16969)) ^ 1590468075;
                        i6 = 1388569715;
                    }
                    break;
                case -944340367:
                case 1981387320:
                    RunnableC0897.m55779(inputStreamM56128);
                    iM55680 = C0946.m55979("ۘۖ") ^ i3;
                    i5 = ((iM55680 ^ i4) * 6557) ^ 1915215903;
                    i6 = -778015542;
                    break;
                case -920316602:
                case 811206665:
                    if (C0927.m55873() > 0) {
                        iM55680 = (C0946.m55979("ܳۢ") ^ i4) * 31;
                        i5 = ((iM55680 ^ i3) * 24807) ^ 985416915;
                        i6 = 1356451602;
                    } else {
                        iM55680 = C0873.m55680("ۜۤ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 389) ^ (-1719648785);
                        i6 = -1804337346;
                    }
                    break;
                case -917768907:
                case 344812017:
                    return;
                case -888537023:
                case -833700004:
                    if (C0845.f81821 >= 0) {
                        iM55680 = (C0873.m55680("֫ۛ") + i3) * 49;
                        i5 = ((iM55680 ^ i4) * (-8913)) ^ 866022086;
                        i6 = -2098807603;
                    } else {
                        iM55680 = C0946.m55979("ۛ۠") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-10161)) ^ (-2118299287);
                        i6 = -21652794;
                    }
                    break;
                case -683030497:
                case -554864118:
                    try {
                        RunnableC0897.m55779(inputStreamM56128);
                        iM55680 = C0946.m55979("᩶ۖ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-18483)) ^ (-2076987664);
                        i6 = 193427069;
                    } catch (Throwable th3) {
                        th2 = th3;
                        iM55680 = (C0873.m55680("ۧۖ") + i3) * (-15);
                        i5 = ((iM55680 ^ i4) * 743) ^ 748171190;
                        i6 = -1348899164;
                    }
                    break;
                case -568327141:
                case 1804043925:
                    if (RunnableC0897.m55784()) {
                        iM55680 = C0873.m55680("ۜۤ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 389) ^ (-1719648785);
                        i6 = -1804337346;
                    } else {
                        iM55680 = (C0873.m55680("۬ۢ") + i3) * (-11);
                        i5 = ((iM55680 ^ i4) * (-26665)) ^ (-848510624);
                        i6 = 651205282;
                    }
                    break;
                case -478772191:
                case 1218620106:
                    if (C0946.f81894 != 0) {
                        iM55680 = C0946.m55979("ܽۘ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-12787)) ^ 793866917;
                        i6 = 682732595;
                    } else {
                        iM55680 = (C0946.m55979("᩶۟") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((iM55680 ^ i3) * (-4109)) ^ 183996824;
                        i6 = 468620655;
                    }
                    break;
                case -474576986:
                case 2142043834:
                    if (inputStreamM56128 != null) {
                        iM55680 = C0946.m55979("᩻᩶") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-2649)) ^ (-1367367861);
                        i6 = 1811572345;
                    } else {
                        iM55680 = C0946.m55979("᩶ۖ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-18483)) ^ (-2076987664);
                        i6 = 193427069;
                    }
                    break;
                case -299637287:
                case 9269306:
                    i = IShizukuService.Stub.TRANSACTION_isHidden;
                    iM55680 = (C0873.m55680("֨۬") ^ i4) * 17;
                    i5 = ((iM55680 ^ i3) * 1071) ^ 59633190;
                    i6 = -163919120;
                    break;
                case -262598948:
                case 1324967353:
                    try {
                        byte[] bArr = new byte[i];
                        C23461.m52184(inputStreamM56128, bArr, i);
                        m47298((AbstractActivityC5549) C1964.m56594(c18107), bArr);
                        iM55680 = (C0873.m55680("ܳܺ") + i4) * 101;
                        i5 = ((iM55680 ^ i3) * 8411) ^ (-1584747315);
                        i6 = 520967232;
                    } catch (Throwable th4) {
                        th = th4;
                        iM55680 = (C0873.m55680("۫۫") + i3) * 85;
                        i5 = ((iM55680 ^ i4) * (-4717)) ^ (-716074053);
                        i6 = -1513076845;
                    }
                    break;
                case -174963841:
                case -173141008:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = (C0873.m55680("֫ۛ") + i3) * 49;
                        i5 = ((iM55680 ^ i4) * (-8913)) ^ 866022086;
                        i6 = -2098807603;
                    } else {
                        iM55680 = (C0873.m55680("ۗۢ") ^ i4) * (-127);
                        i5 = ((iM55680 ^ i3) * 3659) ^ (-1680016829);
                        i6 = -1963535325;
                    }
                    break;
                case -71901799:
                case 326045276:
                    throw th;
                case -10165937:
                case 1065501276:
                    RunnableC0897.m55784();
                    C0947.m55997();
                    iM55680 = C0873.m55680("ۘۚ") ^ i4;
                    i5 = ((iM55680 ^ i3) * 3589) ^ (-150831825);
                    i6 = 892492043;
                    break;
                case 1204582412:
                case 2146470413:
                    if (C0906.m55809() <= 0) {
                        iM55680 = C0873.m55680("ܰۨ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-2177)) ^ (-1829629188);
                        i6 = 661251301;
                    } else {
                        iM55680 = C0873.m55680("ܺ᩹") ^ i3;
                        i5 = ((iM55680 ^ i4) * 18309) ^ (-107779599);
                        i6 = -1931846722;
                    }
                    break;
                case 1268849291:
                case 1903505302:
                    if (C1003.f81929 <= 0) {
                        iM55680 = C0873.m55680("ܰۨ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-2177)) ^ (-1829629188);
                        i6 = 661251301;
                    } else {
                        iM55680 = (C0946.m55979("ۘ᩷") ^ i3) * 93;
                        i5 = ((iM55680 ^ i4) * (-32217)) ^ (-1490491383);
                        i6 = 1161607340;
                    }
                    break;
                default:
                    if (C0949.f81897 >= 0) {
                        iM55680 = C0946.m55979("ܽۘ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-12787)) ^ 793866917;
                        i6 = 682732595;
                    } else {
                        iM55680 = C0873.m55680("ܽܽ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 31499) ^ (-120636166);
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
    /* JADX INFO: renamed from: ᩳ */
    public static void m47314(C18107 c18107, InterfaceC19370 interfaceC19370) {
        int iM55680;
        int i;
        int i2;
        boolean z = false;
        int i3 = C1046.f81962;
        int i4 = C0930.f81879;
        int iM55979 = C0946.m55979("ܶܳ") ^ i4;
        int i5 = ((iM55979 ^ i3) * (-8335)) ^ (-1659751512);
        short[] sArr = null;
        int i6 = iM55979 ^ 814425033;
        RunnableC6688 runnableC6688 = null;
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
                    C0890.m55740();
                    iM55680 = C0946.m55979("ۢ᩷") ^ i3;
                    i = ((iM55680 ^ i4) * (-7469)) ^ (-8505266);
                    i2 = -375456418;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -2054676632:
                case -785643026:
                    c = 549;
                    if (C0898.m55800() <= 0) {
                        iM55680 = C0873.m55680("ۚܿ") ^ i4;
                        i = ((iM55680 ^ i3) * (-12533)) ^ 1588596870;
                        i2 = 1443369996;
                    } else {
                        iM55680 = C0873.m55680("ۖ᩹") ^ i3;
                        i = ((iM55680 ^ i4) * (-22007)) ^ 1624683961;
                        i2 = -595071469;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1974560041:
                case -697442900:
                    s = sArr2[c];
                    s2 = 17497;
                    if (C0890.f81849 != 0) {
                        iM55680 = C0946.m55979("ۢ᩷") ^ i3;
                        i = ((iM55680 ^ i4) * (-7469)) ^ (-8505266);
                        i2 = -375456418;
                    } else {
                        iM55680 = (C0946.m55979("ۡۜ") + i4) * 87;
                        i = ((iM55680 ^ i3) * 16449) ^ (-215654942);
                        i2 = 607310564;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1932908423:
                case 1924544679:
                    i12 = 15789;
                    iM55680 = (C0873.m55680("ۙܰ") ^ i3) * (-103);
                    i = ((iM55680 ^ i4) * 15467) ^ 1032977021;
                    i2 = -348835490;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1780003967:
                case -1227803374:
                    if (C1071.f81975 > 0) {
                        iM55680 = C0946.m55979("ۢ᩷") ^ i3;
                        i = ((iM55680 ^ i4) * (-7469)) ^ (-8505266);
                        i2 = -375456418;
                    } else {
                        iM55680 = (C0873.m55680("۟۬") ^ i4) * 115;
                        i = ((iM55680 ^ i3) * (-12103)) ^ (-215610027);
                        i2 = 2118184520;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1337893370:
                case 506897538:
                    if (C0845.f81821 >= 0) {
                        iM55680 = C0873.m55680("ۚܿ") ^ i4;
                        i = ((iM55680 ^ i3) * (-12533)) ^ 1588596870;
                        i2 = 1443369996;
                    } else {
                        iM55680 = C0873.m55680("ۘ۠") ^ i4;
                        i = ((iM55680 ^ i3) * (-24563)) ^ (-1601134507);
                        i2 = -91970798;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1264857074:
                case 1095670865:
                    i12 = 52127;
                    iM55680 = (C0873.m55680("ۙܰ") ^ i3) * (-103);
                    i = ((iM55680 ^ i4) * 15467) ^ 1032977021;
                    i2 = -348835490;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1084782548:
                case -311639890:
                    C0912.m55833();
                    break;
                case -1019653835:
                case -955140172:
                    runnableC6688.run();
                    break;
                case -963263197:
                case 1188658593:
                    i8 = s + s2;
                    if (C0866.f81837 >= 0) {
                        iM55680 = C0873.m55680("ۚܿ") ^ i4;
                        i = ((iM55680 ^ i3) * (-12533)) ^ 1588596870;
                        i2 = 1443369996;
                    } else {
                        iM55680 = C0946.m55979("ܰۜ") ^ i3;
                        i = ((iM55680 ^ i4) * 3119) ^ (-2060868555);
                        i2 = -1431987840;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -742642450:
                case 161157317:
                    int i14 = i10 + i11;
                    if ((i14 + i14) - i9 >= 0) {
                        iM55680 = (C0946.m55979("֫ܰ") + i3) * 109;
                        i = ((iM55680 ^ i4) * 19021) ^ (-949807044);
                        i2 = 2028900581;
                    } else {
                        iM55680 = (i4 - C0946.m55979("ܶ۠")) * 5;
                        i = ((iM55680 ^ i3) * 13021) ^ 2146265104;
                        i2 = 1563802034;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -734455316:
                case -445776580:
                    sArr2 = f82953;
                    if (C0845.m55584() <= 0) {
                        iM55680 = C0946.m55979("ۚܶ") ^ i3;
                        i = ((iM55680 ^ i4) * 9153) ^ (-1824604386);
                        i2 = -535268311;
                    } else {
                        iM55680 = (C0946.m55979("ܳ᩸") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM55680 ^ i4) * (-22855)) ^ (-194246014);
                        i2 = 1236636220;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -726988635:
                case 2025172575:
                    C0955.m56025();
                    if (!C0917.f81868) {
                        iM55680 = (C0873.m55680("۟۬") ^ i4) * 115;
                        i = ((iM55680 ^ i3) * (-12103)) ^ (-215610027);
                        i2 = 2118184520;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                    } else {
                        int iM559710 = (i4 - C0946.m55979("֡ۨ")) * 17;
                        i6 = iM559710 ^ 311444406;
                        i5 = ((iM559710 ^ i3) * 23051) ^ 701576526;
                        runnableC6688 = null;
                    }
                    break;
                case -702720513:
                case 1214036642:
                    C1053.m56329(new C8895(c18107, interfaceC19370, zArr, strArr, runnableC6688));
                    break;
                case -637195240:
                case 1481129043:
                    strArr = new String[]{null};
                    if (C0955.f81898) {
                        int iM559711 = (i4 - C0946.m55979("֡ۨ")) * 17;
                        i6 = iM559711 ^ 311444406;
                        i5 = ((iM559711 ^ i3) * 23051) ^ 701576526;
                        runnableC6688 = null;
                    } else {
                        runnableC6688 = new RunnableC6688(interfaceC19370, c18107, strArr, zArr);
                        sArr = f82953;
                        if (C0866.f81837 >= 0) {
                            i7 = 550;
                            iM55680 = C0873.m55680("ۚܿ") ^ i4;
                            i = ((iM55680 ^ i3) * (-12533)) ^ 1588596870;
                            i2 = 1443369996;
                            i6 = iM55680 ^ i2;
                            i5 = i;
                        } else {
                            int iM559712 = C0946.m55979("ܺۜ") ^ i4;
                            i5 = ((iM559712 ^ i3) * 307) ^ (-903551424);
                            i6 = iM559712 ^ 1897427220;
                            i7 = 550;
                        }
                    }
                    break;
                case -423719447:
                case 1604711936:
                    if (C1028.m56234(c18107, C0845.m55592(sArr, i7, 5, i12))) {
                        iM55680 = (C0946.m55979("ۢۡ") + i4) * (-65);
                        i = ((iM55680 ^ i3) * (-8551)) ^ 1703456529;
                        i2 = 1777241641;
                    } else {
                        iM55680 = C0873.m55680("۟۠") ^ i3;
                        i = ((iM55680 ^ i4) * 16563) ^ 1165376913;
                        i2 = -1779429261;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -142553395:
                case -59971957:
                    i9 = i8 * i8;
                    i10 = s * s;
                    i11 = 306145009;
                    if (C0955.f81898) {
                        iM55680 = (C0873.m55680("۟۬") ^ i4) * 115;
                        i = ((iM55680 ^ i3) * (-12103)) ^ (-215610027);
                        i2 = 2118184520;
                    } else {
                        iM55680 = C0873.m55680("ܽ᩻") ^ i4;
                        i = ((iM55680 ^ i3) * 13351) ^ 869954786;
                        i2 = -50219066;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 135739081:
                case 644890063:
                    if (C0955.f81898) {
                        iM55680 = (C0873.m55680("۟۬") ^ i4) * 115;
                        i = ((iM55680 ^ i3) * (-12103)) ^ (-215610027);
                        i2 = 2118184520;
                    } else {
                        iM55680 = C0946.m55979("ۚܶ") ^ i3;
                        i = ((iM55680 ^ i4) * 9153) ^ (-1824604386);
                        i2 = -535268311;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 1614955958:
                case 1904147866:
                    zArr[z ? 1 : 0] = z;
                    if (C1003.m56123() != 0) {
                        int iM559713 = (i4 - C0946.m55979("֡ۨ")) * 17;
                        i6 = iM559713 ^ 311444406;
                        i5 = ((iM559713 ^ i3) * 23051) ^ 701576526;
                        runnableC6688 = null;
                    } else {
                        int iM55681 = (C0873.m55680("ܳۡ") + i3) * (-81);
                        i5 = ((iM55681 ^ i4) * (-4721)) ^ 9841992;
                        i6 = iM55681 ^ 1407740579;
                    }
                    break;
                default:
                    zArr = new boolean[1];
                    z = false;
                    z = false;
                    if (C1028.m56247() >= 0) {
                        iM55680 = (C0873.m55680("۟۬") ^ i4) * 115;
                        i = ((iM55680 ^ i3) * (-12103)) ^ (-215610027);
                        i2 = 2118184520;
                    } else {
                        iM55680 = (C0873.m55680("ܳ᩵") + i4) * 59;
                        i = ((iM55680 ^ i3) * (-4291)) ^ (-1672429409);
                        i2 = -1516414530;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m47308(final C18107 c18107, final InterfaceC19370 interfaceC19370, final Class cls) {
        InterfaceC19370 interfaceC19371;
        int iM55979;
        int i;
        int i2;
        int i3;
        int i4;
        View view;
        int i5;
        short[] sArr;
        int iM55680;
        int i6;
        int i7;
        int iM559710;
        int i8;
        int i9;
        int iM55681;
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
        View viewM56181;
        int i14;
        int i15;
        int iM55682;
        int i16;
        int i17;
        C12073 c12073 = null;
        int i18 = 0;
        String str = null;
        int iM559711 = 0;
        int i19 = 1385341986;
        int i20 = C0863.f81833;
        int i21 = C0992.f81922;
        int iM559712 = C0946.m55979("᩹ۖ") ^ i21;
        int i22 = ((iM559712 ^ i20) * 1369) ^ 255322710;
        int i23 = iM559712 ^ (-1772766200);
        String str2 = null;
        Iterator itM55766 = null;
        InterfaceC19370 interfaceC19372 = null;
        boolean[] zArr = null;
        Main main3 = null;
        View view3 = null;
        C20671 c20671 = null;
        short[] sArr3 = null;
        String str3 = null;
        int iM559713 = 0;
        int i24 = 0;
        boolean z = false;
        int i25 = 0;
        int i26 = 0;
        short s = 0;
        final ArrayList arrayList = null;
        String[] strArr2 = null;
        ListView listView3 = null;
        View view4 = null;
        C21793 c21793 = null;
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
                    i5 = iM559713;
                    sArr = sArr3;
                    listView3 = (ListView) C1404.m56465(view, C0946.m55979(RunnableC0871.m55667(sArr, 493, 3, i26)) ^ 2120952642);
                    C7040.m16181(listView3);
                    if (C0955.f81898) {
                        iM55680 = (C0946.m55979("ۜۧ") + i20) * (-59);
                        i6 = ((iM55680 ^ i21) * 9173) ^ 860536296;
                        i7 = -207679166;
                    } else {
                        iM55680 = (i21 - C0873.m55680("᩵ۨ")) * 9;
                        i6 = ((iM55680 ^ i20) * 31437) ^ 1308782270;
                        i7 = -444497686;
                    }
                    sArr3 = sArr;
                    i9 = i4;
                    i23 = iM55680 ^ i7;
                    i22 = i6;
                    iM559713 = i5;
                    view3 = view;
                    i27 = i9;
                    break;
                case -2050348788:
                case -1652908925:
                    String str4 = str3;
                    i27 = i27;
                    c20671 = c20671;
                    main3 = main3;
                    listView3 = listView3;
                    sArr3 = sArr3;
                    view3 = view3;
                    iM559713 = iM559713;
                    InterfaceC19370 interfaceC19373 = (InterfaceC19370) C0955.m56035(itM55766);
                    if (!interfaceC19373.mo39135()) {
                        str3 = str4;
                        interfaceC19372 = interfaceC19373;
                        int iM55683 = C0873.m55680("ܶۤ") ^ i21;
                        sArr3 = sArr3;
                        iM559713 = iM559713;
                        view3 = view3;
                        i27 = i27;
                        i23 = iM55683 ^ (-1558780401);
                        i22 = ((iM55683 ^ i20) * 7107) ^ (-489025746);
                        listView3 = listView3;
                        c20671 = c20671;
                        main3 = main3;
                    } else {
                        int iM55684 = (i20 - C0873.m55680("᩵ۜ")) * 51;
                        int i28 = ((iM55684 ^ i21) * 18823) ^ (-665587032);
                        sArr3 = sArr3;
                        iM559713 = iM559713;
                        view3 = view3;
                        i27 = i27;
                        i23 = iM55684 ^ 464492915;
                        str3 = str4;
                        listView3 = listView3;
                        main3 = main3;
                        interfaceC19372 = interfaceC19373;
                        i22 = i28;
                        c20671 = c20671;
                    }
                    break;
                case -2014436876:
                case -1933138701:
                    i26 = 10494;
                    iM55681 = (i21 - C0946.m55979("۬ۤ")) * (-27);
                    i10 = ((iM55681 ^ i20) * 17795) ^ (-1733206921);
                    i11 = -1584827727;
                    i17 = iM55681 ^ i11;
                    sArr3 = sArr3;
                    iM559713 = iM559713;
                    view3 = view3;
                    i27 = i27;
                    i23 = i17;
                    i22 = i10;
                    str3 = str3;
                    listView3 = listView3;
                    main3 = main3;
                    interfaceC19372 = interfaceC19372;
                    c20671 = c20671;
                    break;
                case -2008954070:
                case -185128012:
                    i25++;
                    strArr = strArr2;
                    int iM55685 = C0873.m55680("ᩴ۫") ^ i21;
                    iM559713 = iM559713;
                    view3 = view3;
                    i27 = i27;
                    strArr2 = strArr;
                    i23 = iM55685 ^ 83637682;
                    i22 = ((iM55685 ^ i20) * 6419) ^ (-178222967);
                    sArr3 = sArr3;
                    str3 = str3;
                    listView3 = listView3;
                    main3 = main3;
                    interfaceC19372 = interfaceC19372;
                    c20671 = c20671;
                    break;
                case -1887300965:
                case 902128269:
                    i27 = i27;
                    c20671 = c20671;
                    interfaceC19372 = interfaceC19372;
                    main3 = main3;
                    listView3 = listView3;
                    sArr3 = sArr3;
                    str3 = str3;
                    view3 = view3;
                    iM559713 = iM559713;
                    if (C1017.m56195(arrayList)) {
                        iM55681 = (C0873.m55680("ᩳۖ") ^ i21) * (-35);
                        i10 = ((iM55681 ^ i20) * (-4547)) ^ 195563319;
                        i11 = -298477983;
                    } else {
                        iM55681 = (C0946.m55979("֡᩷") + i21) * 59;
                        i10 = ((iM55681 ^ i20) * (-30479)) ^ 1840533107;
                        i11 = 1895601039;
                    }
                    i17 = iM55681 ^ i11;
                    sArr3 = sArr3;
                    iM559713 = iM559713;
                    view3 = view3;
                    i27 = i27;
                    i23 = i17;
                    i22 = i10;
                    str3 = str3;
                    listView3 = listView3;
                    main3 = main3;
                    interfaceC19372 = interfaceC19372;
                    c20671 = c20671;
                    break;
                case -1810477842:
                case 1252122672:
                    strArr2[i25] = C1404.m56454(strArr2[i25], z ? 1 : 0, i24);
                    iM55682 = C0946.m55979("᩷᩷") ^ i20;
                    i14 = ((iM55682 ^ i21) * 14291) ^ (-343209562);
                    i16 = 846998275;
                    i23 = iM55682 ^ i16;
                    i22 = i14;
                    break;
                case -1728565483:
                case 1367653865:
                    i27 = i27;
                    c20671 = c20671;
                    main3 = main3;
                    listView3 = listView3;
                    sArr3 = sArr3;
                    view3 = view3;
                    iM559713 = iM559713;
                    String name = interfaceC19370.getName();
                    String parent = interfaceC19370.getParent();
                    arrayList = new ArrayList();
                    itM55766 = C0894.m55766(c18107.m41254());
                    str2 = parent;
                    str3 = name;
                    int iM55686 = C0873.m55680("ܶۤ") ^ i21;
                    sArr3 = sArr3;
                    iM559713 = iM559713;
                    view3 = view3;
                    i27 = i27;
                    i23 = iM55686 ^ (-1558780401);
                    i22 = ((iM55686 ^ i20) * 7107) ^ (-489025746);
                    listView3 = listView3;
                    c20671 = c20671;
                    main3 = main3;
                    break;
                case -1725819301:
                case -845328463:
                    i27 = i27;
                    C0894.m55771((TextView) view4, C0861.m55618(f82953, 499, 8, i26));
                    Main mainM56594 = C1964.m56594(c18107);
                    if (C1229.f82066 >= 0) {
                        int iM559714 = (C0946.m55979("ܰۧ") + i21) * 37;
                        i = ((iM559714 ^ i20) * (-7799)) ^ 1975967972;
                        i3 = iM559714 ^ (-1822412362);
                        c21793 = null;
                        i9 = i27;
                        i23 = i3;
                        i22 = i;
                        i27 = i9;
                    } else {
                        c21793 = new C21793(mainM56594, zArr, strArr2);
                        ListView listView4 = listView3;
                        listView4.setAdapter((ListAdapter) c21793);
                        listView4.setOnItemClickListener(c21793);
                        C20671 c20671M55654 = C0866.m55654(C1964.m56594(c18107));
                        View view5 = view3;
                        C0882.m55725(c20671M55654, view5);
                        iM559713 = iM559713;
                        String strM56092 = C0989.m56092(f82953, 507, 3, i26);
                        if (C1028.f81950 <= 0) {
                            view3 = view5;
                            c20671 = c20671M55654;
                            main3 = main3;
                            sArr3 = sArr3;
                            listView3 = listView4;
                            str = strM56092;
                            interfaceC19372 = interfaceC19372;
                            str3 = str3;
                            iM55681 = (C0946.m55979("ܺ᩻") ^ i21) * (-77);
                            i10 = ((iM55681 ^ i20) * (-7623)) ^ (-2064482112);
                            i11 = -1752707084;
                            i17 = iM55681 ^ i11;
                            sArr3 = sArr3;
                            iM559713 = iM559713;
                            view3 = view3;
                            i27 = i27;
                            i23 = i17;
                            i22 = i10;
                            str3 = str3;
                            listView3 = listView3;
                            main3 = main3;
                            interfaceC19372 = interfaceC19372;
                            c20671 = c20671;
                        } else {
                            int iM559715 = C0946.m55979("᩵ۗ") ^ i20;
                            listView3 = listView4;
                            i22 = ((iM559715 ^ i21) * (-8871)) ^ (-1249189303);
                            view3 = view5;
                            i27 = i27;
                            i23 = iM559715 ^ (-2095090288);
                            iM559713 = iM559713;
                            str = strM56092;
                            c20671 = c20671M55654;
                        }
                    }
                    break;
                case -1678307949:
                case 81595297:
                    ViewOnClickListenerC0939.m55953(c20671, C0873.m55680(str) ^ 2102742746, onClickListener);
                    i27 = i27;
                    iM559711 = C0946.m55979(C0917.m55852(f82953, 510, 3, i26));
                    if (C1929.m56553()) {
                        iM559710 = (C0873.m55680("ۖܺ") + i21) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM559710 ^ i20) * 20481) ^ 285335824;
                        i8 = 492796346;
                    } else {
                        iM559710 = (C0946.m55979("ۤۡ") + i20) * 59;
                        i = ((iM559710 ^ i21) * 5233) ^ 222233652;
                        i8 = 2006378852;
                    }
                    i3 = iM559710 ^ i8;
                    i9 = i27;
                    i23 = i3;
                    i22 = i;
                    i27 = i9;
                    break;
                case -1538083795:
                case -1265268595:
                    i27 = i27;
                    c20671 = c20671;
                    interfaceC19372 = interfaceC19372;
                    main3 = main3;
                    listView3 = listView3;
                    sArr3 = sArr3;
                    str3 = str3;
                    view3 = view3;
                    iM559713 = iM559713;
                    z = false;
                    z = false;
                    z2 = true;
                    if (C0861.m55625(arrayList) == 1) {
                        iM55681 = C0873.m55680("ۛ᩷") ^ i21;
                        i10 = ((iM55681 ^ i20) * 6299) ^ 1804681677;
                        i11 = 893118723;
                    } else {
                        iM55681 = (i20 - C0873.m55680("᩺᩸")) * 17;
                        i10 = ((iM55681 ^ i21) * (-11069)) ^ 161628660;
                        i11 = 61045791;
                    }
                    i17 = iM55681 ^ i11;
                    sArr3 = sArr3;
                    iM559713 = iM559713;
                    view3 = view3;
                    i27 = i27;
                    i23 = i17;
                    i22 = i10;
                    str3 = str3;
                    listView3 = listView3;
                    main3 = main3;
                    interfaceC19372 = interfaceC19372;
                    c20671 = c20671;
                    break;
                case -1530637332:
                case 2107761233:
                    int iM55625 = C0861.m55625(arrayList);
                    strArr = new String[iM55625];
                    zArr = new boolean[iM55625];
                    i25 = 0;
                    int iM55687 = C0873.m55680("ᩴ۫") ^ i21;
                    iM559713 = iM559713;
                    view3 = view3;
                    i27 = i27;
                    strArr2 = strArr;
                    i23 = iM55687 ^ 83637682;
                    i22 = ((iM55687 ^ i20) * 6419) ^ (-178222967);
                    sArr3 = sArr3;
                    str3 = str3;
                    listView3 = listView3;
                    main3 = main3;
                    interfaceC19372 = interfaceC19372;
                    c20671 = c20671;
                    break;
                case -1350143984:
                case 756401219:
                    i12 = i27;
                    i13 = iM559713;
                    listView2 = listView3;
                    main2 = main3;
                    viewM56181 = C1017.m56181(main2, i18 ^ 2121158335);
                    sArr3 = f82953;
                    if (C1024.m56209() < 0) {
                        int iM55688 = C0873.m55680("ۘܿ") ^ i20;
                        i14 = ((iM55688 ^ i21) * 4939) ^ (-1309108338);
                        listView3 = listView2;
                        main3 = main2;
                        iM559713 = i13;
                        view3 = viewM56181;
                        i27 = i12;
                        i23 = iM55688 ^ (-1679530130);
                        i22 = i14;
                    } else {
                        int iM55689 = (C0873.m55680("᩺۠") ^ i21) * (-113);
                        ListView listView5 = listView2;
                        i22 = ((iM55689 ^ i20) * 24747) ^ (-1213640604);
                        i15 = iM55689 ^ 2137045215;
                        listView3 = listView5;
                        main3 = main2;
                        iM559713 = i13;
                        view3 = viewM56181;
                        i27 = i12;
                        i23 = i15;
                    }
                    break;
                case -1307843330:
                case 423597610:
                    C0937.m55918();
                    if (!C0955.f81898) {
                        main = main3;
                        listView = listView3;
                        sArr2 = sArr3;
                        view2 = view3;
                        int iM559716 = (C0946.m55979("ۚ۠") ^ i20) * (-55);
                        Main main4 = main;
                        i22 = ((iM559716 ^ i21) * (-10281)) ^ (-847901806);
                        sArr3 = sArr2;
                        View view6 = view2;
                        listView3 = listView;
                        main3 = main4;
                        i23 = iM559716 ^ (-2036668366);
                        view3 = view6;
                    } else {
                        i27 = i27;
                        iM559710 = (C0873.m55680("ۖܺ") + i21) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM559710 ^ i20) * 20481) ^ 285335824;
                        i8 = 492796346;
                        i3 = iM559710 ^ i8;
                        i9 = i27;
                        i23 = i3;
                        i22 = i;
                        i27 = i9;
                    }
                    break;
                case -1290887099:
                case 301435127:
                    if (C1964.f83032 > 0) {
                        iM55682 = (C0873.m55680("ۧ᩷") ^ i21) * 81;
                        i14 = ((iM55682 ^ i20) * 6025) ^ 495768419;
                        i16 = -1023188927;
                        i23 = iM55682 ^ i16;
                        i22 = i14;
                    } else {
                        i12 = i27;
                        viewM56181 = view3;
                        listView2 = listView3;
                        i13 = iM559713;
                        main2 = main3;
                        int iM556810 = (C0873.m55680("᩺۠") ^ i21) * (-113);
                        ListView listView6 = listView2;
                        i22 = ((iM556810 ^ i20) * 24747) ^ (-1213640604);
                        i15 = iM556810 ^ 2137045215;
                        listView3 = listView6;
                        main3 = main2;
                        iM559713 = i13;
                        view3 = viewM56181;
                        i27 = i12;
                        i23 = i15;
                    }
                    break;
                case -1194869018:
                case 1978481539:
                    i27 = i27;
                    sArr3 = sArr3;
                    View view7 = view3;
                    iM559713 = iM559713;
                    Main main5 = main3;
                    listView3 = listView3;
                    view3 = view7;
                    c20671 = c20671;
                    main3 = main5;
                    if (!C1028.m56248(RunnableC0938.m55929(interfaceC19372.getName()), C0892.m55750(f82953, 486, 4, i26))) {
                        int iM556811 = C0873.m55680("ܶۤ") ^ i21;
                        sArr3 = sArr3;
                        iM559713 = iM559713;
                        view3 = view3;
                        i27 = i27;
                        i23 = iM556811 ^ (-1558780401);
                        i22 = ((iM556811 ^ i20) * 7107) ^ (-489025746);
                        listView3 = listView3;
                        c20671 = c20671;
                        main3 = main3;
                    } else {
                        interfaceC19371 = interfaceC19372;
                        iM55979 = C0873.m55680("ۗܶ") ^ i21;
                        i = ((iM55979 ^ i20) * 337) ^ (-1872082927);
                        i2 = -1733167705;
                        i3 = iM55979 ^ i2;
                        interfaceC19372 = interfaceC19371;
                        sArr3 = sArr3;
                        iM559713 = iM559713;
                        view3 = view3;
                        c20671 = c20671;
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
                    iM55681 = (i21 - C0946.m55979("۬ۤ")) * (-27);
                    i10 = ((iM55681 ^ i20) * 17795) ^ (-1733206921);
                    i11 = -1584827727;
                    i17 = iM55681 ^ i11;
                    sArr3 = sArr3;
                    iM559713 = iM559713;
                    view3 = view3;
                    i27 = i27;
                    i23 = i17;
                    i22 = i10;
                    str3 = str3;
                    listView3 = listView3;
                    main3 = main3;
                    interfaceC19372 = interfaceC19372;
                    c20671 = c20671;
                    break;
                case -1180265400:
                case -1116579344:
                    zArr[i25] = z2;
                    iM55682 = C0946.m55979("۟ۛ") ^ i21;
                    i14 = ((iM55682 ^ i20) * (-27777)) ^ 1524153549;
                    i16 = 1709218054;
                    i23 = iM55682 ^ i16;
                    i22 = i14;
                    break;
                case -1089387217:
                case -365463195:
                    i12 = i27;
                    viewM56181 = view3;
                    listView2 = listView3;
                    i13 = iM559713;
                    listView2.setDivider(null);
                    View viewM56465 = C1404.m56465(viewM56181, C0873.m55680(C1071.m56336(f82953, 496, 3, i26)) ^ 2098190836);
                    if (C1028.f81950 <= 0) {
                        view4 = viewM56465;
                        main2 = main3;
                        onClickListener = null;
                        int iM556812 = (C0873.m55680("᩺۠") ^ i21) * (-113);
                        ListView listView7 = listView2;
                        i22 = ((iM556812 ^ i20) * 24747) ^ (-1213640604);
                        i15 = iM556812 ^ 2137045215;
                        listView3 = listView7;
                        main3 = main2;
                        iM559713 = i13;
                    } else {
                        int iM556813 = (C0873.m55680("ۛ֡") + i21) * (-121);
                        int i29 = ((iM556813 ^ i20) * 29725) ^ (-57282971);
                        i15 = iM556813 ^ 924624833;
                        listView3 = listView2;
                        view4 = viewM56465;
                        i22 = i29;
                        iM559713 = i13;
                        onClickListener = null;
                    }
                    view3 = viewM56181;
                    i27 = i12;
                    i23 = i15;
                    break;
                case -1060284395:
                case -744282932:
                    i27 = i27;
                    c20671 = c20671;
                    interfaceC19371 = interfaceC19372;
                    main3 = main3;
                    listView3 = listView3;
                    sArr3 = sArr3;
                    view3 = view3;
                    iM559713 = iM559713;
                    if (C0906.m55806(interfaceC19371.getName(), str3)) {
                        iM55979 = C0873.m55680("ۗܶ") ^ i21;
                        i = ((iM55979 ^ i20) * 337) ^ (-1872082927);
                        i2 = -1733167705;
                    } else {
                        iM55979 = C0946.m55979("ᩴܳ") ^ i20;
                        i = ((iM55979 ^ i21) * 11983) ^ 1830227191;
                        i2 = 1829061565;
                    }
                    i3 = iM55979 ^ i2;
                    interfaceC19372 = interfaceC19371;
                    sArr3 = sArr3;
                    iM559713 = iM559713;
                    view3 = view3;
                    c20671 = c20671;
                    listView3 = listView3;
                    main3 = main3;
                    i9 = i27;
                    i23 = i3;
                    i22 = i;
                    i27 = i9;
                    break;
                case -1033400326:
                case -110702562:
                    if (!C0927.f81875) {
                        int iM556814 = (C0873.m55680("ܽۡ") + i20) * (-37);
                        i10 = ((iM556814 ^ i21) * (-27463)) ^ 168966528;
                        i17 = iM556814 ^ 1055446;
                        sArr3 = sArr3;
                        iM559713 = iM559713;
                        view3 = view3;
                        i27 = i27;
                        i23 = i17;
                        i22 = i10;
                        str3 = str3;
                        listView3 = listView3;
                        main3 = main3;
                        interfaceC19372 = interfaceC19372;
                        c20671 = c20671;
                    } else {
                        main = main3;
                        listView = listView3;
                        sArr2 = sArr3;
                        view2 = view3;
                        int iM559717 = (C0946.m55979("ۚ۠") ^ i20) * (-55);
                        Main main6 = main;
                        i22 = ((iM559717 ^ i21) * (-10281)) ^ (-847901806);
                        sArr3 = sArr2;
                        View view8 = view2;
                        listView3 = listView;
                        main3 = main6;
                        i23 = iM559717 ^ (-2036668366);
                        view3 = view8;
                    }
                    break;
                case -1001470947:
                case -660959729:
                    String strM55792 = C0898.m55792(f82953, 472, 14, i26);
                    String parent2 = interfaceC19370.getParent();
                    if (C1194.f82045 == 0) {
                        C1194.m56393(arrayList, new C12073(strM55792, parent2, z, z2));
                        C0947.m56000(c18107).mo8202(c18107, arrayList, new Runnable() { // from class: l.᩵ۡܳ

                            /* JADX INFO: renamed from: ܽܿܽ, reason: not valid java name and contains not printable characters */
                            private static final short[] f82948 = {7343, 28215, 28216, 28210, 28196, 28217, 28223, 28210, 28280, 28223, 28216, 28194, 28211, 28216, 28194, 28280, 28215, 28213, 28194, 28223, 28217, 28216, 28280, 28160, 28191, 28179, 28161, 28210, 28211, 28206, 28176, 28223, 28218, 28211, 28197, 28196, 28211, 28197, 28217, 28195, 28196, 28213, 28211, 28197, 28280, 28215, 28196, 28197, 28213};

                            {
                                int i30 = -551694220;
                                int i31 = C1404.f82149;
                                int i32 = C1003.f81929;
                                int iM559718 = C0946.m55979("᩻ܶ") ^ i32;
                                int i33 = ((iM559718 ^ i31) * (-27571)) ^ 2047160127;
                                int i34 = 215766306;
                                while (true) {
                                    i30 = ((((i30 ^ i31) * (-20587)) >> 31) & i33) ^ (iM559718 ^ i34);
                                    switch (i30) {
                                        case -2074395471:
                                        case 2125682719:
                                            RunnableC0897.m55784();
                                            iM559718 = C0873.m55680("ۖܰ") ^ i31;
                                            i33 = ((iM559718 ^ i32) * 2283) ^ 939715313;
                                            i34 = -1758669238;
                                            break;
                                        case -1839030383:
                                        case 1144527608:
                                            if (C0877.f81843 >= 0) {
                                                iM559718 = C0946.m55979("۬ۧ") ^ i31;
                                                i33 = ((iM559718 ^ i32) * 18879) ^ (-790349458);
                                                i34 = -1310451612;
                                            } else {
                                                iM559718 = (C0873.m55680("ۢۚ") ^ i31) * (-47);
                                                i33 = ((iM559718 ^ i32) * 20221) ^ 735786410;
                                                i34 = -1711381388;
                                            }
                                            break;
                                        case -1780117968:
                                        case 1475200742:
                                            if (C1404.f82149 >= 0) {
                                                iM559718 = C0946.m55979("ۜ۠") ^ i32;
                                                i33 = ((iM559718 ^ i31) * 19627) ^ (-1541098914);
                                                i34 = -1507672227;
                                            } else {
                                                iM559718 = (C0946.m55979("ᩴۗ") + i32) * 89;
                                                i33 = ((iM559718 ^ i31) * 5899) ^ 879364191;
                                                i34 = -285402189;
                                            }
                                            break;
                                        case -1616729012:
                                        case 456636250:
                                            if (C1024.f81946) {
                                                iM559718 = C0946.m55979("ۜ۠") ^ i32;
                                                i33 = ((iM559718 ^ i31) * 19627) ^ (-1541098914);
                                                i34 = -1507672227;
                                            } else {
                                                iM559718 = C0946.m55979("᩷ۢ") ^ i32;
                                                i33 = ((iM559718 ^ i31) * (-2375)) ^ 1903252721;
                                                i34 = 1371291140;
                                            }
                                            break;
                                        case -1420471483:
                                        case 1456244675:
                                            C1124.m56367();
                                            if (!C0937.f81884) {
                                                iM559718 = C0946.m55979("ۜ۠") ^ i32;
                                                i33 = ((iM559718 ^ i31) * 19627) ^ (-1541098914);
                                                i34 = -1507672227;
                                            } else {
                                                iM559718 = C0946.m55979("۬ۧ") ^ i31;
                                                i33 = ((iM559718 ^ i32) * 18879) ^ (-790349458);
                                                i34 = -1310451612;
                                            }
                                            break;
                                        case -1374485698:
                                        case 1985204858:
                                            if (C1964.f83032 <= 0) {
                                                iM559718 = C0946.m55979("ۧ֡") ^ i31;
                                                i33 = ((iM559718 ^ i32) * 25797) ^ (-953704960);
                                                i34 = -2098824347;
                                            } else {
                                                iM559718 = C0873.m55680("֫ܺ") ^ i31;
                                                i33 = ((iM559718 ^ i32) * (-8929)) ^ (-1172501651);
                                                i34 = 1783039472;
                                            }
                                            break;
                                        case -1356473895:
                                        case -29485229:
                                            C1025.m56230();
                                            if (!C1024.f81946) {
                                                iM559718 = C0946.m55979("ۜ۠") ^ i32;
                                                i33 = ((iM559718 ^ i31) * 19627) ^ (-1541098914);
                                                i34 = -1507672227;
                                            } else {
                                                iM559718 = C0873.m55680("ۖܰ") ^ i31;
                                                i33 = ((iM559718 ^ i32) * 2283) ^ 939715313;
                                                i34 = -1758669238;
                                            }
                                            break;
                                        case -1100114909:
                                        case 1541424107:
                                            if (C0917.m55854()) {
                                                iM559718 = C0873.m55680("֫ܶ") ^ i32;
                                                i33 = ((iM559718 ^ i31) * (-7769)) ^ 694147725;
                                                i34 = -781741241;
                                            } else {
                                                iM559718 = C0946.m55979("ۧ֡") ^ i31;
                                                i33 = ((iM559718 ^ i32) * 25797) ^ (-953704960);
                                                i34 = -2098824347;
                                            }
                                            break;
                                        case -1058110713:
                                        case 1124477548:
                                            C1003.m56123();
                                            C1025.m56230();
                                            throw new RuntimeException();
                                        case -976060475:
                                        case -477839894:
                                            return;
                                        case -216105532:
                                        case 1367072208:
                                            if (C0890.f81849 != 0) {
                                                iM559718 = C0946.m55979("۬ۧ") ^ i31;
                                                i33 = ((iM559718 ^ i32) * 18879) ^ (-790349458);
                                                i34 = -1310451612;
                                            } else {
                                                iM559718 = C0873.m55680("᩵᩸") ^ i31;
                                                i33 = ((iM559718 ^ i32) * 29007) ^ (-329750225);
                                                i34 = -820060475;
                                            }
                                            break;
                                        case -64870406:
                                        case 330444448:
                                            if (AbstractC0942.f81890 <= 0) {
                                                iM559718 = C0946.m55979("ۜ۠") ^ i32;
                                                i33 = ((iM559718 ^ i31) * 19627) ^ (-1541098914);
                                                i34 = -1507672227;
                                            } else {
                                                iM559718 = (C0946.m55979("ۧ֨") ^ i32) * 93;
                                                i33 = ((iM559718 ^ i31) * 32467) ^ (-974028711);
                                                i34 = -1879047240;
                                            }
                                            break;
                                        case 344961884:
                                        case 1708057123:
                                            if (C0967.f81910 >= 0) {
                                                iM559718 = C0873.m55680("ۖܰ") ^ i31;
                                                i33 = ((iM559718 ^ i32) * 2283) ^ 939715313;
                                                i34 = -1758669238;
                                            } else {
                                                iM559718 = C0946.m55979("ۗۙ") ^ i32;
                                                i33 = ((iM559718 ^ i31) * 30733) ^ (-419990348);
                                                i34 = -1923327149;
                                            }
                                            break;
                                        case 371516349:
                                        case 1005134367:
                                            if (C0937.f81884) {
                                                iM559718 = C0946.m55979("ۨ۟") ^ i31;
                                                i33 = ((iM559718 ^ i32) * (-17063)) ^ (-1726547836);
                                                i34 = 934168097;
                                            } else {
                                                iM559718 = C0946.m55979("ۧ֡") ^ i31;
                                                i33 = ((iM559718 ^ i32) * 25797) ^ (-953704960);
                                                i34 = -2098824347;
                                            }
                                            break;
                                        case 782643537:
                                        case 1830679725:
                                            if (C1071.f81975 <= 0) {
                                                iM559718 = C0873.m55680("ۖܰ") ^ i31;
                                                i33 = ((iM559718 ^ i32) * 2283) ^ 939715313;
                                                i34 = -1758669238;
                                            } else {
                                                iM559718 = C0873.m55680("᩷ᩴ") ^ i32;
                                                i33 = ((iM559718 ^ i31) * 13475) ^ (-950038657);
                                                i34 = 1412023503;
                                            }
                                            break;
                                        default:
                                            if (ViewOnClickListenerC0939.m55941() >= 0) {
                                                iM559718 = C0946.m55979("ۜ۠") ^ i32;
                                                i33 = ((iM559718 ^ i31) * 19627) ^ (-1541098914);
                                                i34 = -1507672227;
                                            } else {
                                                iM559718 = (C0873.m55680("ۡۙ") ^ i31) * (-5);
                                                i33 = ((iM559718 ^ i32) * (-19331)) ^ 1065231613;
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
                                int iM556815;
                                int i30;
                                int i31;
                                int i32 = C0989.f81920;
                                int i33 = C0845.f81821;
                                int iM556816 = (i33 - C0873.m55680("ۗܳ")) * (-111);
                                int i34 = ((iM556816 ^ i32) * (-5517)) ^ 1015732099;
                                ArrayList arrayList2 = null;
                                short[] sArr4 = null;
                                short[] sArr5 = null;
                                short[] sArr6 = null;
                                int i35 = iM556816 ^ 578821045;
                                C11996 c11996 = null;
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
                                String strM27648 = null;
                                C12073 c12074 = null;
                                String strM56029 = null;
                                C18107 c18108 = null;
                                int i43 = 0;
                                while (true) {
                                    i40 = i35 ^ (i34 & (((i40 ^ i32) * 12955) >> 31));
                                    switch (i40) {
                                        case -1693124738:
                                        case -725016486:
                                            if (C0989.f81920 >= 0) {
                                                iM556815 = (C0873.m55680("᩸ܿ") ^ i33) * 73;
                                                i30 = ((iM556815 ^ i32) * 22395) ^ (-1530152830);
                                                i31 = 553889281;
                                            } else {
                                                iM556815 = C0946.m55979("ۗۙ") ^ i32;
                                                i30 = ((iM556815 ^ i33) * (-11765)) ^ (-1038652356);
                                                i31 = -1026840676;
                                            }
                                            i35 = iM556815 ^ i31;
                                            i34 = i30;
                                            break;
                                        case -1679300204:
                                        case -438764190:
                                            i36 = 28246;
                                            iM556815 = (i33 - C0873.m55680("֫ᩳ")) * 19;
                                            i30 = ((iM556815 ^ i32) * (-17621)) ^ (-1843501046);
                                            i31 = -736926607;
                                            i35 = iM556815 ^ i31;
                                            i34 = i30;
                                            break;
                                        case -1328641909:
                                        case 936957458:
                                            C1053.m56327();
                                            C1025.m56230();
                                            break;
                                        case -1277223358:
                                        case -875013417:
                                            arrayList2 = arrayList;
                                            if (i43 < C1012.m56137(arrayList2)) {
                                                iM556815 = (i33 - C0873.m55680("ܽۜ")) * 83;
                                                i30 = ((iM556815 ^ i32) * 5117) ^ (-1780981652);
                                                i31 = -1087005143;
                                            } else {
                                                iM556815 = C0946.m55979("᩶ܽ") ^ i33;
                                                i30 = ((iM556815 ^ i32) * 15445) ^ (-875982924);
                                                i31 = -1264799225;
                                            }
                                            i35 = iM556815 ^ i31;
                                            i34 = i30;
                                            break;
                                        case -1048268606:
                                        case 1495273011:
                                            C11245.m26044(interfaceC19370, 2000);
                                            C1044.m56284(C1964.m56594(c18108), intent);
                                            break;
                                        case -1007228752:
                                        case 1411963379:
                                            i36 = 27254;
                                            iM556815 = (i33 - C0873.m55680("֫ᩳ")) * 19;
                                            i30 = ((iM556815 ^ i32) * (-17621)) ^ (-1843501046);
                                            i31 = -736926607;
                                            i35 = iM556815 ^ i31;
                                            i34 = i30;
                                            break;
                                        case -730605953:
                                        case 938059753:
                                            C0992.m56107();
                                            if (C1024.f81946) {
                                                iM556815 = C0946.m55979("᩻۬") ^ i33;
                                                i30 = ((iM556815 ^ i32) * 15831) ^ 698915186;
                                                i31 = -880873336;
                                            } else {
                                                iM556815 = (C0873.m55680("᩸ܿ") ^ i33) * 73;
                                                i30 = ((iM556815 ^ i32) * 22395) ^ (-1530152830);
                                                i31 = 553889281;
                                            }
                                            i35 = iM556815 ^ i31;
                                            i34 = i30;
                                            break;
                                        case -698861239:
                                        case 1195948700:
                                            c12074.m27641();
                                            c11996.m27459(C0989.m56086(c12074.m27644()));
                                            iM556815 = (C0946.m55979("ۡۘ") ^ i32) * (-77);
                                            i30 = ((iM556815 ^ i33) * 4069) ^ (-2090246823);
                                            i31 = 85224175;
                                            i35 = iM556815 ^ i31;
                                            i34 = i30;
                                            break;
                                        case -696402980:
                                        case 506993901:
                                            RunnableC0871.m55672();
                                            if (C0845.f81821 >= 0) {
                                                int iM559718 = (C0946.m55979("ۖ۠") ^ i33) * 87;
                                                i35 = iM559718 ^ 144698509;
                                                i34 = ((iM559718 ^ i32) * (-11157)) ^ 275749860;
                                                intent = null;
                                            } else {
                                                iM556815 = (C0873.m55680("᩸ܿ") ^ i33) * 73;
                                                i30 = ((iM556815 ^ i32) * 22395) ^ (-1530152830);
                                                i31 = 553889281;
                                                i35 = iM556815 ^ i31;
                                                i34 = i30;
                                            }
                                            break;
                                        case -675412664:
                                        case 1211798731:
                                            c18108 = c18107;
                                            Main mainM56595 = C1964.m56594(c18108);
                                            Class cls2 = cls;
                                            if (C1012.f81938 < 0) {
                                                intent = new Intent(mainM56595, (Class<?>) cls2);
                                                C0882.m55721(intent, 268435456);
                                                if (C1053.f81965 <= 0) {
                                                    iM556815 = C0946.m55979("᩻۬") ^ i33;
                                                    i30 = ((iM556815 ^ i32) * 15831) ^ 698915186;
                                                    i31 = -880873336;
                                                } else {
                                                    iM556815 = (C0873.m55680("۟ۖ") + i33) * 5;
                                                    i30 = ((iM556815 ^ i32) * 22113) ^ (-1721760974);
                                                    i31 = 825354987;
                                                }
                                                i35 = iM556815 ^ i31;
                                                i34 = i30;
                                            } else {
                                                int iM559719 = (C0946.m55979("ۖ۠") ^ i33) * 87;
                                                i35 = iM559719 ^ 144698509;
                                                i34 = ((iM559719 ^ i32) * (-11157)) ^ 275749860;
                                                intent = null;
                                            }
                                            break;
                                        case -619690577:
                                        case 426832771:
                                            if (C0906.m55806(strM27648, C1044.m56276(sArr6, 35, 14, i36))) {
                                                iM556815 = (C0946.m55979("ۡۘ") ^ i32) * (-77);
                                                i30 = ((iM556815 ^ i33) * 4069) ^ (-2090246823);
                                                i31 = 85224175;
                                            } else {
                                                iM556815 = C0946.m55979("۫᩶") ^ i32;
                                                i30 = ((iM556815 ^ i33) * (-2069)) ^ 1866351528;
                                                i31 = 595202869;
                                            }
                                            i35 = iM556815 ^ i31;
                                            i34 = i30;
                                            break;
                                        case -590961146:
                                        case 1443371981:
                                            c12074 = (C12073) C1017.m56196(arrayList2, i43);
                                            strM27648 = c12074.m27648();
                                            sArr6 = f82948;
                                            if (C0890.m55740()) {
                                                iM556815 = C0873.m55680("ۤۚ") ^ i33;
                                                i30 = ((iM556815 ^ i32) * 25733) ^ 2074046846;
                                                i31 = -439012674;
                                            } else {
                                                iM556815 = C0946.m55979("᩻۬") ^ i33;
                                                i30 = ((iM556815 ^ i32) * 15831) ^ 698915186;
                                                i31 = -880873336;
                                            }
                                            i35 = iM556815 ^ i31;
                                            i34 = i30;
                                            break;
                                        case -569624767:
                                        case 358353006:
                                            sArr5 = f82948;
                                            i37 = 1;
                                            i38 = 26;
                                            if (C1404.f82149 < 0) {
                                                iM556815 = (i32 - C0873.m55680("֡ܰ")) * (-63);
                                                i30 = ((iM556815 ^ i33) * 15383) ^ 1584025206;
                                                i31 = 1109203460;
                                                i35 = iM556815 ^ i31;
                                                i34 = i30;
                                            } else {
                                                int iM5597110 = (C0946.m55979("ۖ۠") ^ i33) * 87;
                                                i35 = iM5597110 ^ 144698509;
                                                i34 = ((iM5597110 ^ i32) * (-11157)) ^ 275749860;
                                                intent = null;
                                            }
                                            break;
                                        case -555708232:
                                        case 337727464:
                                            c11996 = new C11996();
                                            i43 = 0;
                                            iM556815 = C0946.m55979("֨ᩴ") ^ i32;
                                            i30 = ((iM556815 ^ i33) * 1295) ^ 1245144677;
                                            i31 = 1190989081;
                                            i35 = iM556815 ^ i31;
                                            i34 = i30;
                                            break;
                                        case -293211924:
                                        case 192204095:
                                            intent.setAction(C0863.m55635(sArr5, i37, i38, i36));
                                            if (C0946.f81894 != 0) {
                                                iM556815 = (i32 - C0873.m55680("ܶ۫")) * (-13);
                                                i30 = ((iM556815 ^ i33) * (-22021)) ^ (-1620420210);
                                                i31 = 1530601882;
                                            } else {
                                                iM556815 = C0873.m55680("ۙۗ") ^ i32;
                                                i30 = ((iM556815 ^ i33) * 19847) ^ (-1422884264);
                                                i31 = 19787256;
                                            }
                                            i35 = iM556815 ^ i31;
                                            i34 = i30;
                                            break;
                                        case -200283023:
                                        case -153490841:
                                            strM56029 = C0955.m56029(f82948, 27, 8, i36);
                                            if (C1053.f81965 <= 0) {
                                                iM556815 = (i32 - C0873.m55680("ܶ۫")) * (-13);
                                                i30 = ((iM556815 ^ i33) * (-22021)) ^ (-1620420210);
                                                i31 = 1530601882;
                                            } else {
                                                iM556815 = C0946.m55979("ۧ֫") ^ i33;
                                                i30 = ((iM556815 ^ i32) * (-17915)) ^ 1148356938;
                                                i31 = -1378699513;
                                            }
                                            i35 = iM556815 ^ i31;
                                            i34 = i30;
                                            break;
                                        case 542588979:
                                        case 1603416053:
                                            i41 = s2 * s3;
                                            i42 = s2 * s2;
                                            i39 = 1718721;
                                            if (C0906.f81862 >= 0) {
                                                iM556815 = C0946.m55979("᩻۬") ^ i33;
                                                i30 = ((iM556815 ^ i32) * 15831) ^ 698915186;
                                                i31 = -880873336;
                                            } else {
                                                iM556815 = (C0873.m55680("ۢۙ") + i33) * (-47);
                                                i30 = ((iM556815 ^ i32) * 21599) ^ 1847106272;
                                                i31 = -693823201;
                                            }
                                            i35 = iM556815 ^ i31;
                                            i34 = i30;
                                            break;
                                        case 678121842:
                                        case 1491492829:
                                            s2 = sArr4[c];
                                            s3 = 2622;
                                            if (C0892.f81851) {
                                                iM556815 = (C0873.m55680("ۖᩴ") + i33) * (-73);
                                                i30 = ((iM556815 ^ i32) * 22045) ^ (-737699778);
                                                i31 = -1422621894;
                                            } else {
                                                iM556815 = (i32 - C0873.m55680("ܶ۫")) * (-13);
                                                i30 = ((iM556815 ^ i33) * (-22021)) ^ (-1620420210);
                                                i31 = 1530601882;
                                            }
                                            i35 = iM556815 ^ i31;
                                            i34 = i30;
                                            break;
                                        case 685721338:
                                        case 1366782440:
                                            intent.putExtra(strM56029, c11996.m27448());
                                            if (C0992.m56107() <= 0) {
                                                iM556815 = C0946.m55979("᩻۬") ^ i33;
                                                i30 = ((iM556815 ^ i32) * 15831) ^ 698915186;
                                                i31 = -880873336;
                                            } else {
                                                iM556815 = (C0873.m55680("ܺۢ") ^ i32) * 5;
                                                i30 = ((iM556815 ^ i33) * (-21079)) ^ (-211581887);
                                                i31 = 137338553;
                                            }
                                            i35 = iM556815 ^ i31;
                                            i34 = i30;
                                            break;
                                        case 711152621:
                                        case 731590262:
                                            C1028.m56247();
                                            C0866.m55645();
                                            iM556815 = C0946.m55979("᩻۬") ^ i33;
                                            i30 = ((iM556815 ^ i32) * 15831) ^ 698915186;
                                            i31 = -880873336;
                                            i35 = iM556815 ^ i31;
                                            i34 = i30;
                                            break;
                                        case 1104175471:
                                        case 1570141345:
                                            i43++;
                                            iM556815 = C0946.m55979("֨ᩴ") ^ i32;
                                            i30 = ((iM556815 ^ i33) * 1295) ^ 1245144677;
                                            i31 = 1190989081;
                                            i35 = iM556815 ^ i31;
                                            i34 = i30;
                                            break;
                                        case 1260529725:
                                        case 1674800886:
                                            if ((i42 + i39) - i41 < 0) {
                                                iM556815 = C0946.m55979("᩶᩻") ^ i32;
                                                i30 = ((iM556815 ^ i33) * (-3713)) ^ 1667874084;
                                                i31 = 920091874;
                                            } else {
                                                iM556815 = C0946.m55979("ۧ᩻") ^ i32;
                                                i30 = ((iM556815 ^ i33) * (-28159)) ^ (-1851649186);
                                                i31 = 284874625;
                                            }
                                            i35 = iM556815 ^ i31;
                                            i34 = i30;
                                            break;
                                        default:
                                            sArr4 = f82948;
                                            c = 0;
                                            if (C0863.f81833 <= 0) {
                                                iM556815 = (C0873.m55680("᩸ܿ") ^ i33) * 73;
                                                i30 = ((iM556815 ^ i32) * 22395) ^ (-1530152830);
                                                i31 = 553889281;
                                            } else {
                                                iM556815 = (i32 - C0946.m55979("۟۟")) * 21;
                                                i30 = ((iM556815 ^ i33) * (-19151)) ^ 798188391;
                                                i31 = 1127201502;
                                            }
                                            i35 = iM556815 ^ i31;
                                            i34 = i30;
                                            break;
                                    }
                                    return;
                                }
                            }
                        });
                    }
                    int iM556815 = (C0873.m55680("ܽۡ") + i20) * (-37);
                    i10 = ((iM556815 ^ i21) * (-27463)) ^ 168966528;
                    i17 = iM556815 ^ 1055446;
                    sArr3 = sArr3;
                    iM559713 = iM559713;
                    view3 = view3;
                    i27 = i27;
                    i23 = i17;
                    i22 = i10;
                    str3 = str3;
                    listView3 = listView3;
                    main3 = main3;
                    interfaceC19372 = interfaceC19372;
                    c20671 = c20671;
                    break;
                case -906122386:
                case 280051200:
                    i27 = iM559711 ^ 2128238660;
                    iM559713 = 2124657121 ^ C0946.m55979(C1012.m56144(f82953, 513, 3, i26));
                    if (C0863.f81833 > 0) {
                        iM55682 = C0873.m55680("ۢۖ") ^ i21;
                        i14 = ((iM55682 ^ i20) * (-28771)) ^ 1195104617;
                        i16 = 643216596;
                        i23 = iM55682 ^ i16;
                        i22 = i14;
                    } else {
                        main = main3;
                        listView = listView3;
                        sArr2 = sArr3;
                        view2 = view3;
                        int iM559718 = (C0946.m55979("ۚ۠") ^ i20) * (-55);
                        Main main7 = main;
                        i22 = ((iM559718 ^ i21) * (-10281)) ^ (-847901806);
                        sArr3 = sArr2;
                        View view9 = view2;
                        listView3 = listView;
                        main3 = main7;
                        i23 = iM559718 ^ (-2036668366);
                        view3 = view9;
                    }
                    break;
                case -887483755:
                case 1307878979:
                    if (C1929.f83011 != 0) {
                        iM55682 = C0946.m55979("᩷ܿ") ^ i20;
                        i14 = ((iM55682 ^ i21) * 18425) ^ 769274229;
                        i16 = -628099245;
                        i23 = iM55682 ^ i16;
                        i22 = i14;
                    } else {
                        main = main3;
                        listView = listView3;
                        sArr2 = sArr3;
                        view2 = view3;
                        int iM559719 = (C0946.m55979("ۚ۠") ^ i20) * (-55);
                        Main main8 = main;
                        i22 = ((iM559719 ^ i21) * (-10281)) ^ (-847901806);
                        sArr3 = sArr2;
                        View view10 = view2;
                        listView3 = listView;
                        main3 = main8;
                        i23 = iM559719 ^ (-2036668366);
                        view3 = view10;
                    }
                    break;
                case -872947440:
                case 917453224:
                    final DialogInterfaceC2564 dialogInterfaceC2564M18268 = C7913.m18268(c20671, i27, onClickListener, iM559713, onClickListener);
                    final boolean[] zArr2 = zArr;
                    C1048.m56304(C1964.m56591(dialogInterfaceC2564M18268), new View.OnClickListener() { // from class: l.֡ۡܳ

                        /* JADX INFO: renamed from: ᩴ᩵ܽ, reason: not valid java name and contains not printable characters */
                        private static final short[] f81828 = {8140, 17367, -18135, 20283, 13717, 13698, 13716, 13704, 13714, 13717, 13700, 13698, 13716, 13769, 13702, 13717, 13716, 13700};

                        {
                            int i30 = 115074108;
                            int i31 = C0906.f81862;
                            int i32 = ServiceConnectionC1013.f81940;
                            int iM559720 = (C0946.m55979("ܶᩴ") ^ i32) * (-43);
                            int i33 = ((iM559720 ^ i31) * 5439) ^ 837480264;
                            int i34 = -1886798306;
                            while (true) {
                                i30 = ((((i30 ^ i31) * 23233) >> 31) & i33) ^ (iM559720 ^ i34);
                                switch (i30) {
                                    case -2082087188:
                                    case 1712143346:
                                        if (C0906.f81862 >= 0) {
                                            iM559720 = (C0946.m55979("᩻۠") ^ i31) * (-107);
                                            i33 = ((iM559720 ^ i32) * 22511) ^ (-610622732);
                                            i34 = -1873792511;
                                        } else {
                                            iM559720 = C0946.m55979("᩶᩻") ^ i31;
                                            i33 = ((iM559720 ^ i32) * (-27427)) ^ (-1533277875);
                                            i34 = -1898322283;
                                        }
                                        break;
                                    case -1886822623:
                                    case -471760088:
                                        if (C1028.f81950 <= 0) {
                                            iM559720 = (C0873.m55680("ۨܺ") ^ i31) * 73;
                                            i33 = ((iM559720 ^ i32) * 3989) ^ (-12787205);
                                            i34 = -1169756477;
                                        } else {
                                            iM559720 = (C0873.m55680("ܺ᩶") + i31) * (-21);
                                            i33 = ((iM559720 ^ i32) * 18239) ^ (-1020024057);
                                            i34 = -1735658673;
                                        }
                                        break;
                                    case -1123460552:
                                    case 2141517635:
                                        if (C0863.f81833 <= 0) {
                                            iM559720 = C0946.m55979("ۡܶ") ^ i32;
                                            i33 = ((iM559720 ^ i31) * (-25193)) ^ (-1416131490);
                                            i34 = 578475843;
                                        } else {
                                            iM559720 = (C0946.m55979("ܳۚ") ^ i32) * 47;
                                            i33 = ((iM559720 ^ i31) * 1357) ^ (-126940477);
                                            i34 = 248892920;
                                        }
                                        break;
                                    case -1020999420:
                                    case 863399149:
                                        if (C0912.f81867 <= 0) {
                                            iM559720 = (C0873.m55680("ۤܳ") + i32) * C0254q.f1218h;
                                            i33 = ((iM559720 ^ i31) * (-22173)) ^ (-831740173);
                                            i34 = 1249317023;
                                        } else {
                                            iM559720 = C0873.m55680("᩹ᩴ") ^ i32;
                                            i33 = ((iM559720 ^ i31) * 31759) ^ (-195341602);
                                            i34 = 1863410823;
                                        }
                                        break;
                                    case -932818179:
                                    case 1536472420:
                                        C1194.m56396();
                                        C0930.m55885();
                                        throw new RuntimeException();
                                    case -829555130:
                                    case 606234682:
                                        C1048.m56305();
                                        if (!C0947.f81895) {
                                            iM559720 = (C0873.m55680("ۨܺ") ^ i31) * 73;
                                            i33 = ((iM559720 ^ i32) * 3989) ^ (-12787205);
                                            i34 = -1169756477;
                                        } else {
                                            iM559720 = (C0873.m55680("ۤܳ") + i32) * C0254q.f1218h;
                                            i33 = ((iM559720 ^ i31) * (-22173)) ^ (-831740173);
                                            i34 = 1249317023;
                                        }
                                        break;
                                    case -721091859:
                                    case 533960904:
                                        if (RunnableC1014.f81941 <= 0) {
                                            iM559720 = C0946.m55979("ۡܶ") ^ i32;
                                            i33 = ((iM559720 ^ i31) * (-25193)) ^ (-1416131490);
                                            i34 = 578475843;
                                        } else {
                                            iM559720 = C0873.m55680("֨ۗ") ^ i32;
                                            i33 = ((iM559720 ^ i31) * (-11023)) ^ 151578558;
                                            i34 = -275430157;
                                        }
                                        break;
                                    case -543748528:
                                    case 567418491:
                                        if (C1194.f82045 != 0) {
                                            iM559720 = C0946.m55979("ۡܶ") ^ i32;
                                            i33 = ((iM559720 ^ i31) * (-25193)) ^ (-1416131490);
                                            i34 = 578475843;
                                        } else {
                                            iM559720 = (C0946.m55979("ܿ֨") + i32) * (-3);
                                            i33 = ((iM559720 ^ i31) * (-20373)) ^ (-579104942);
                                            i34 = -994694635;
                                        }
                                        break;
                                    case -509568762:
                                    case 1019179266:
                                        if (C0989.f81920 >= 0) {
                                            iM559720 = (C0946.m55979("᩻۠") ^ i31) * (-107);
                                            i33 = ((iM559720 ^ i32) * 22511) ^ (-610622732);
                                            i34 = -1873792511;
                                        } else {
                                            iM559720 = (C0873.m55680("᩵ۛ") ^ i31) * (-79);
                                            i33 = ((iM559720 ^ i32) * (-21397)) ^ 708206544;
                                            i34 = 1105915300;
                                        }
                                        break;
                                    case -162832073:
                                    case 1578026290:
                                        if (C1003.f81929 <= 0) {
                                            iM559720 = C0946.m55979("ۡܶ") ^ i32;
                                            i33 = ((iM559720 ^ i31) * (-25193)) ^ (-1416131490);
                                            i34 = 578475843;
                                        } else {
                                            iM559720 = C0873.m55680("᩸᩸") ^ i31;
                                            i33 = ((iM559720 ^ i32) * (-22793)) ^ 822179816;
                                            i34 = 2047802310;
                                        }
                                        break;
                                    case -39631168:
                                    case 1255399864:
                                        return;
                                    case -16140196:
                                    case 642254103:
                                        RunnableC1014.m56177();
                                        if (C1194.f82045 != 0) {
                                            iM559720 = (C0873.m55680("ۨܺ") ^ i31) * 73;
                                            i33 = ((iM559720 ^ i32) * 3989) ^ (-12787205);
                                            i34 = -1169756477;
                                        } else {
                                            iM559720 = (C0873.m55680("ܺ᩻") ^ i32) * 95;
                                            i33 = ((iM559720 ^ i31) * 25969) ^ (-1205376611);
                                            i34 = 667465874;
                                        }
                                        break;
                                    case 56756140:
                                    case 262980134:
                                        if (AbstractC0942.m55971()) {
                                            iM559720 = C0946.m55979("ۡܶ") ^ i32;
                                            i33 = ((iM559720 ^ i31) * (-25193)) ^ (-1416131490);
                                            i34 = 578475843;
                                        } else {
                                            iM559720 = (C0946.m55979("֨۫") ^ i31) * (-63);
                                            i33 = ((iM559720 ^ i32) * 18963) ^ 2047147809;
                                            i34 = -562984315;
                                        }
                                        break;
                                    case 1182506887:
                                    case 1209244377:
                                        C0917.m55854();
                                        iM559720 = (C0873.m55680("ܺ᩻") ^ i32) * 95;
                                        i33 = ((iM559720 ^ i31) * 25969) ^ (-1205376611);
                                        i34 = 667465874;
                                        break;
                                    case 1394625346:
                                    case 1833865724:
                                        if (!C0955.f81898) {
                                            iM559720 = (C0873.m55680("ܺ᩻") ^ i32) * 95;
                                            i33 = ((iM559720 ^ i31) * 25969) ^ (-1205376611);
                                            i34 = 667465874;
                                        } else {
                                            iM559720 = (C0946.m55979("᩻۠") ^ i31) * (-107);
                                            i33 = ((iM559720 ^ i32) * 22511) ^ (-610622732);
                                            i34 = -1873792511;
                                        }
                                        break;
                                    default:
                                        if (C0946.m55980() != 0) {
                                            iM559720 = (C0873.m55680("ۤܳ") + i32) * C0254q.f1218h;
                                            i33 = ((iM559720 ^ i31) * (-22173)) ^ (-831740173);
                                            i34 = 1249317023;
                                        } else {
                                            iM559720 = C0946.m55979("֡ۡ") ^ i32;
                                            i33 = ((iM559720 ^ i31) * 28921) ^ (-1208620186);
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
                            int iM556816;
                            int i30;
                            int i31;
                            short s2;
                            int i32;
                            int iM556817;
                            int i33;
                            int i34;
                            int i35;
                            int i36;
                            int iM556818;
                            int i37;
                            int i38;
                            ArrayList arrayList2;
                            int i39;
                            short s3;
                            int iM559720;
                            int i40;
                            int i41;
                            int iM556819;
                            int i42;
                            ViewOnClickListenerC2664 viewOnClickListenerC2664 = this;
                            int i43 = 1010611830;
                            int i44 = C0877.f81843;
                            int i45 = C0873.f81841;
                            int iM556820 = C0873.m55680("ܺ۠") ^ i45;
                            int i46 = ((iM556820 ^ i44) * 28933) ^ (-2068717416);
                            int i47 = iM556820 ^ 1773976201;
                            final ArrayList arrayList3 = null;
                            short[] sArr4 = null;
                            boolean[] zArr3 = null;
                            boolean z3 = false;
                            int i48 = 0;
                            boolean z4 = false;
                            int i49 = 0;
                            int i50 = 0;
                            int i51 = 0;
                            C12073 c12074 = null;
                            int i52 = 0;
                            int i53 = 0;
                            char c = 0;
                            short s4 = 0;
                            short s5 = 0;
                            int length = 0;
                            short[] sArr5 = null;
                            String strM56276 = null;
                            final InterfaceC19370 interfaceC19374 = null;
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
                                        iM556816 = (i45 - C0873.m55680("ᩴᩴ")) * (-53);
                                        i30 = ((iM556816 ^ i44) * (-8179)) ^ 1707350484;
                                        i31 = 1717556413;
                                        int i54 = iM556816 ^ i31;
                                        arrayList3 = arrayList3;
                                        i47 = i54;
                                        i46 = i30;
                                        break;
                                    case -2031702119:
                                    case -497368204:
                                        arrayList3 = arrayList3;
                                        if (zArr3[i48]) {
                                            iM556816 = C0873.m55680("᩺ᩳ") ^ i45;
                                            i30 = ((iM556816 ^ i44) * 2361) ^ (-437537663);
                                            i31 = 1803704006;
                                        } else {
                                            iM556816 = C0946.m55979("ۙܰ") ^ i44;
                                            i30 = ((iM556816 ^ i45) * (-16923)) ^ (-1202801784);
                                            i31 = 558551711;
                                        }
                                        int i55 = iM556816 ^ i31;
                                        arrayList3 = arrayList3;
                                        i47 = i55;
                                        i46 = i30;
                                        break;
                                    case -1990126399:
                                    case -71420965:
                                        short[] sArr6 = f81828;
                                        if (C0930.f81879 > 0) {
                                            arrayList3 = arrayList3;
                                            String strM56386 = C1194.m56386(sArr6, 4, 14, i49);
                                            if (C1025.f81947 < 0) {
                                                interfaceC19374 = interfaceC19370;
                                                c12074 = new C12073(strM56386, interfaceC19374.getParent(), z3, z4);
                                                if (!C0955.f81898) {
                                                    iM556816 = (C0873.m55680("ܰ֡") + i44) * 61;
                                                    i30 = ((iM556816 ^ i45) * 26439) ^ (-2054457081);
                                                    i31 = -1688142664;
                                                    int i56 = iM556816 ^ i31;
                                                    arrayList3 = arrayList3;
                                                    i47 = i56;
                                                    i46 = i30;
                                                } else {
                                                    i36 = length;
                                                    iM556818 = (i45 - C0873.m55680("ۖ۫")) * (-105);
                                                    i37 = ((iM556818 ^ i44) * 4927) ^ (-895324932);
                                                    i38 = 60782280;
                                                    i35 = iM556818 ^ i38;
                                                    length = i36;
                                                    i46 = i37;
                                                    arrayList3 = arrayList3;
                                                    i47 = i35;
                                                    viewOnClickListenerC2664 = this;
                                                }
                                            } else {
                                                s2 = s4;
                                                i32 = length;
                                                int iM559721 = (C0946.m55979("ۖ֡") + i45) * 31;
                                                int i57 = ((iM559721 ^ i44) * 20047) ^ 2115044932;
                                                i35 = iM559721 ^ (-1061055932);
                                                length = i32;
                                                s4 = s2;
                                                i46 = i57;
                                                arrayList3 = arrayList3;
                                                c12074 = null;
                                                i47 = i35;
                                                viewOnClickListenerC2664 = this;
                                            }
                                        } else {
                                            arrayList2 = arrayList3;
                                            s3 = s4;
                                            i39 = length;
                                            int iM559722 = (i44 - C0946.m55979("ۜۢ")) * (-93);
                                            length = i39;
                                            s4 = s3;
                                            i46 = ((iM559722 ^ i45) * (-2675)) ^ (-1742263988);
                                            c12074 = null;
                                            ArrayList arrayList4 = arrayList2;
                                            i47 = iM559722 ^ (-372845233);
                                            arrayList3 = arrayList4;
                                        }
                                        break;
                                    case -1848312985:
                                    case -95405135:
                                        arrayList3.remove(length2);
                                        iM556819 = (C0946.m55979("ۢۧ") + i45) * 23;
                                        i30 = ((iM556819 ^ i44) * (-29951)) ^ 766760377;
                                        i42 = 220871550;
                                        i47 = iM556819 ^ i42;
                                        i46 = i30;
                                        break;
                                    case -1813022685:
                                    case 1636335558:
                                        i49 = 13799;
                                        iM559720 = (C0946.m55979("ۘۛ") ^ i44) * 17;
                                        i40 = ((iM559720 ^ i45) * 30657) ^ (-155285366);
                                        i41 = -209227240;
                                        int i58 = iM559720 ^ i41;
                                        length = length;
                                        i46 = i40;
                                        arrayList3 = arrayList3;
                                        i47 = i58;
                                        break;
                                    case -1710705686:
                                    case 825358009:
                                        C1024.m56208(dialogInterfaceC2564M18268);
                                        length2 = zArr3.length - 1;
                                        z4 = true;
                                        iM556816 = C0873.m55680("۬᩺") ^ i44;
                                        i30 = ((iM556816 ^ i45) * (-20533)) ^ 2119120643;
                                        i31 = 282696472;
                                        int i59 = iM556816 ^ i31;
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
                                        if (C1053.f81965 <= 0) {
                                            i53 = i60;
                                            int iM559723 = (i44 - C0946.m55979("ۜۢ")) * (-93);
                                            length = i39;
                                            s4 = s3;
                                            i46 = ((iM559723 ^ i45) * (-2675)) ^ (-1742263988);
                                            c12074 = null;
                                            ArrayList arrayList5 = arrayList2;
                                            i47 = iM559723 ^ (-372845233);
                                            arrayList3 = arrayList5;
                                        } else {
                                            int iM556821 = C0873.m55680("᩸ܶ") ^ i44;
                                            int i61 = ((iM556821 ^ i45) * 26641) ^ 1995150801;
                                            int i62 = iM556821 ^ (-923004820);
                                            length = i39;
                                            s4 = s3;
                                            i46 = i61;
                                            viewOnClickListenerC2664 = this;
                                            i53 = i60;
                                            arrayList3 = arrayList2;
                                            i47 = i62;
                                        }
                                        break;
                                    case -1634308085:
                                    case -721367697:
                                        arrayList3 = arrayList;
                                        if (length2 >= 0) {
                                            iM556819 = C0946.m55979("ۨᩴ") ^ i45;
                                            i30 = ((iM556819 ^ i44) * 11197) ^ (-624726955);
                                            i42 = 987204042;
                                        } else {
                                            iM556819 = C0873.m55680("۠ۧ") ^ i45;
                                            i30 = ((iM556819 ^ i44) * 23309) ^ (-159913290);
                                            i42 = -1592917862;
                                        }
                                        i47 = iM556819 ^ i42;
                                        i46 = i30;
                                        break;
                                    case -1537894806:
                                    case 172953249:
                                        C1044.m56286();
                                        break;
                                    case -1469748959:
                                    case -1358621707:
                                        i48++;
                                        iM556816 = (i45 - C0873.m55680("ᩴᩴ")) * (-53);
                                        i30 = ((iM556816 ^ i44) * (-8179)) ^ 1707350484;
                                        i31 = 1717556413;
                                        int i510 = iM556816 ^ i31;
                                        arrayList3 = arrayList3;
                                        i47 = i510;
                                        i46 = i30;
                                        break;
                                    case -1394174226:
                                    case 1617401344:
                                        if (zArr3[length2]) {
                                            iM556819 = (C0946.m55979("ۢۧ") + i45) * 23;
                                            i30 = ((iM556819 ^ i44) * (-29951)) ^ 766760377;
                                            i42 = 220871550;
                                        } else {
                                            iM556819 = C0946.m55979("۬۫") ^ i44;
                                            i30 = ((iM556819 ^ i45) * 9585) ^ (-1897321678);
                                            i42 = 1948253395;
                                        }
                                        i47 = iM556819 ^ i42;
                                        i46 = i30;
                                        break;
                                    case -1378437543:
                                    case 1429744934:
                                        if (!C0917.f81868) {
                                            arrayList2 = arrayList3;
                                            s3 = s4;
                                            i39 = length;
                                            int iM559724 = (i44 - C0946.m55979("ۜۢ")) * (-93);
                                            length = i39;
                                            s4 = s3;
                                            i46 = ((iM559724 ^ i45) * (-2675)) ^ (-1742263988);
                                            c12074 = null;
                                            ArrayList arrayList6 = arrayList2;
                                            i47 = iM559724 ^ (-372845233);
                                            arrayList3 = arrayList6;
                                        } else {
                                            arrayList3 = arrayList3;
                                            s2 = s4;
                                            i32 = length;
                                            int iM559725 = (C0946.m55979("ۖ֡") + i45) * 31;
                                            int i511 = ((iM559725 ^ i44) * 20047) ^ 2115044932;
                                            i35 = iM559725 ^ (-1061055932);
                                            length = i32;
                                            s4 = s2;
                                            i46 = i511;
                                            arrayList3 = arrayList3;
                                            c12074 = null;
                                            i47 = i35;
                                            viewOnClickListenerC2664 = this;
                                        }
                                        break;
                                    case -1240250392:
                                    case 28615830:
                                        arrayList3 = arrayList3;
                                        s2 = s4;
                                        i32 = length;
                                        c = 0;
                                        if (C1003.f81929 <= 0) {
                                            int iM559726 = (C0946.m55979("ۖ֡") + i45) * 31;
                                            int i512 = ((iM559726 ^ i44) * 20047) ^ 2115044932;
                                            i35 = iM559726 ^ (-1061055932);
                                            length = i32;
                                            s4 = s2;
                                            i46 = i512;
                                            arrayList3 = arrayList3;
                                            c12074 = null;
                                        } else {
                                            iM556817 = (C0946.m55979("᩵֨") + i45) * 9;
                                            i33 = ((iM556817 ^ i44) * (-1071)) ^ (-514695474);
                                            i34 = 1690515102;
                                            i35 = iM556817 ^ i34;
                                            length = i32;
                                            s4 = s2;
                                            i46 = i33;
                                            arrayList3 = arrayList3;
                                        }
                                        i47 = i35;
                                        viewOnClickListenerC2664 = this;
                                        break;
                                    case -1000950955:
                                    case -833033361:
                                        C0861.m55626();
                                        if (C0873.f81841 > 0) {
                                            iM556819 = (i44 - C0946.m55979("ܽᩳ")) * 33;
                                            i30 = ((iM556819 ^ i45) * 499) ^ 1191714578;
                                            i42 = 651193145;
                                            i47 = iM556819 ^ i42;
                                            i46 = i30;
                                        } else {
                                            arrayList2 = arrayList3;
                                            s3 = s4;
                                            i39 = length;
                                            int iM559727 = (i44 - C0946.m55979("ۜۢ")) * (-93);
                                            length = i39;
                                            s4 = s3;
                                            i46 = ((iM559727 ^ i45) * (-2675)) ^ (-1742263988);
                                            c12074 = null;
                                            ArrayList arrayList7 = arrayList2;
                                            i47 = iM559727 ^ (-372845233);
                                            arrayList3 = arrayList7;
                                        }
                                        break;
                                    case -399994632:
                                    case 1548903359:
                                        arrayList3 = arrayList3;
                                        length = length;
                                        if (i48 < length) {
                                            iM559720 = C0873.m55680("᩸ۛ") ^ i45;
                                            i40 = ((iM559720 ^ i44) * 18909) ^ (-1850240331);
                                            i41 = -598377540;
                                        } else {
                                            iM559720 = (i44 - C0946.m55979("ۛᩴ")) * (-71);
                                            i40 = ((iM559720 ^ i45) * 28577) ^ (-95924250);
                                            i41 = -1985600231;
                                        }
                                        int i513 = iM559720 ^ i41;
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
                                            iM559720 = C0873.m55680("ᩳܺ") ^ i45;
                                            i40 = ((iM559720 ^ i44) * 31683) ^ (-831272241);
                                            i41 = 1886629933;
                                        } else {
                                            iM559720 = (i44 - C0946.m55979("᩶᩺")) * (-41);
                                            i40 = ((iM559720 ^ i45) * 563) ^ (-104410754);
                                            i41 = 1414795641;
                                        }
                                        int i514 = iM559720 ^ i41;
                                        length = length;
                                        i46 = i40;
                                        arrayList3 = arrayList3;
                                        i47 = i514;
                                        break;
                                    case -225123923:
                                    case 241612075:
                                        C0917.m55842(C0873.m55680(strM56276) ^ 2128558296);
                                        break;
                                    case -113963399:
                                    case 32779293:
                                        arrayList3 = arrayList3;
                                        sArr4 = f81828;
                                        i50 = 1;
                                        i51 = 3;
                                        if (ViewOnClickListenerC0939.f81888 > 0) {
                                            iM556816 = (i45 - C0873.m55680("ۢۡ")) * 53;
                                            i30 = ((iM556816 ^ i44) * (-10063)) ^ 2052847405;
                                            i31 = -1674475086;
                                            int i515 = iM556816 ^ i31;
                                            arrayList3 = arrayList3;
                                            i47 = i515;
                                            i46 = i30;
                                        } else {
                                            i36 = length;
                                            iM556818 = (i45 - C0873.m55680("ۖ۫")) * (-105);
                                            i37 = ((iM556818 ^ i44) * 4927) ^ (-895324932);
                                            i38 = 60782280;
                                            i35 = iM556818 ^ i38;
                                            length = i36;
                                            i46 = i37;
                                            arrayList3 = arrayList3;
                                            i47 = i35;
                                            viewOnClickListenerC2664 = this;
                                        }
                                        break;
                                    case 440630815:
                                    case 2126668574:
                                        if (C1053.m56327() < 0) {
                                            arrayList3 = arrayList3;
                                            iM556816 = (C0946.m55979("ᩴ᩵") + i45) * 39;
                                            i30 = ((iM556816 ^ i44) * (-2119)) ^ 1002520211;
                                            i31 = 2091114248;
                                            int i516 = iM556816 ^ i31;
                                            arrayList3 = arrayList3;
                                            i47 = i516;
                                            i46 = i30;
                                        } else {
                                            arrayList2 = arrayList3;
                                            s3 = s4;
                                            i39 = length;
                                            int iM559728 = (i44 - C0946.m55979("ۜۢ")) * (-93);
                                            length = i39;
                                            s4 = s3;
                                            i46 = ((iM559728 ^ i45) * (-2675)) ^ (-1742263988);
                                            c12074 = null;
                                            ArrayList arrayList8 = arrayList2;
                                            i47 = iM559728 ^ (-372845233);
                                            arrayList3 = arrayList8;
                                        }
                                        break;
                                    case 446037761:
                                    case 994493195:
                                        C0992.m56107();
                                        arrayList2 = arrayList3;
                                        s3 = s4;
                                        i39 = length;
                                        int iM559729 = (i44 - C0946.m55979("ۜۢ")) * (-93);
                                        length = i39;
                                        s4 = s3;
                                        i46 = ((iM559729 ^ i45) * (-2675)) ^ (-1742263988);
                                        c12074 = null;
                                        ArrayList arrayList9 = arrayList2;
                                        i47 = iM559729 ^ (-372845233);
                                        arrayList3 = arrayList9;
                                        break;
                                    case 668675481:
                                    case 1919900526:
                                        C0937.m55917(arrayList3, c12074);
                                        final C18107 c18108 = c18107;
                                        AbstractC18422 abstractC18422M56309 = C1048.m56309(c18108);
                                        if (!C0967.m56074()) {
                                            final Class cls2 = cls;
                                            abstractC18422M56309.mo8202(c18108, arrayList3, new Runnable() { // from class: l.֨ۡܳ

                                                /* JADX INFO: renamed from: ۤۜۤ, reason: not valid java name and contains not printable characters */
                                                private static final short[] f81852 = {4085, 10713, 10710, 10716, 10698, 10711, 10705, 10716, 10646, 10705, 10710, 10700, 10717, 10710, 10700, 10646, 10713, 10715, 10700, 10705, 10711, 10710, 10646, 10734, 10737, 10749, 10735, 10716, 10717, 10688, 10750, 10705, 10708, 10717, 10699, 10698, 10717, 10699, 10711, 10701, 10698, 10715, 10717, 10699, 10646, 10713, 10698, 10699, 10715};

                                                {
                                                    int i63 = 1464563313;
                                                    int i64 = C0992.f81922;
                                                    int i65 = C1124.f82007;
                                                    int iM556822 = (C0873.m55680("ᩳܳ") ^ i64) * 45;
                                                    int i66 = ((iM556822 ^ i65) * (-15669)) ^ 795266440;
                                                    int i67 = -2025210253;
                                                    while (true) {
                                                        i63 = ((((i63 ^ i65) * 6987) >> 31) & i66) ^ (iM556822 ^ i67);
                                                        switch (i63) {
                                                            case -1999164069:
                                                            case -1261736244:
                                                                return;
                                                            case -1995206505:
                                                            case -95408789:
                                                                if (C0890.m55740()) {
                                                                    iM556822 = (C0946.m55979("᩻۠") ^ i64) * 123;
                                                                    i66 = ((iM556822 ^ i65) * (-9417)) ^ (-1503203720);
                                                                    i67 = -1507732913;
                                                                } else {
                                                                    iM556822 = (i64 - C0946.m55979("᩻᩻")) * (-55);
                                                                    i66 = ((iM556822 ^ i65) * 30363) ^ 646304352;
                                                                    i67 = -1663303342;
                                                                }
                                                                break;
                                                            case -1970750846:
                                                            case -1285893496:
                                                                if (C0845.f81821 >= 0) {
                                                                    iM556822 = (C0946.m55979("ۗܶ") ^ i65) * 75;
                                                                    i66 = ((iM556822 ^ i64) * 20643) ^ 161423101;
                                                                    i67 = -2009201165;
                                                                } else {
                                                                    iM556822 = C0873.m55680("ᩳۗ") ^ i65;
                                                                    i66 = ((iM556822 ^ i64) * 19041) ^ 1230714132;
                                                                    i67 = 1509913695;
                                                                }
                                                                break;
                                                            case -1962259144:
                                                            case 870436000:
                                                                if (C1124.f82007 >= 0) {
                                                                    iM556822 = (C0946.m55979("ۗܶ") ^ i65) * 75;
                                                                    i66 = ((iM556822 ^ i64) * 20643) ^ 161423101;
                                                                    i67 = -2009201165;
                                                                } else {
                                                                    iM556822 = C0946.m55979("ܳ۫") ^ i64;
                                                                    i66 = ((iM556822 ^ i65) * 2827) ^ 1110493759;
                                                                    i67 = 1730794858;
                                                                }
                                                                break;
                                                            case -1779192163:
                                                            case 1045993151:
                                                                C1053.m56327();
                                                                throw new RuntimeException();
                                                            case -866204139:
                                                            case 136487140:
                                                                if (AbstractC0942.f81890 <= 0) {
                                                                    iM556822 = (i64 - C0946.m55979("᩻᩻")) * (-55);
                                                                    i66 = ((iM556822 ^ i65) * 30363) ^ 646304352;
                                                                    i67 = -1663303342;
                                                                } else {
                                                                    iM556822 = (C0946.m55979("ۙۖ") + i65) * (-9);
                                                                    i66 = ((iM556822 ^ i64) * (-22747)) ^ (-1705348922);
                                                                    i67 = -314420129;
                                                                }
                                                                break;
                                                            case -783547479:
                                                            case 210990626:
                                                                if (C1048.f81963) {
                                                                    iM556822 = (i65 - C0946.m55979("۫ܳ")) * (-61);
                                                                    i66 = ((iM556822 ^ i64) * 12455) ^ (-1762197193);
                                                                    i67 = 354371539;
                                                                } else {
                                                                    iM556822 = C0873.m55680("ܿ᩷") ^ i64;
                                                                    i66 = ((iM556822 ^ i65) * (-17853)) ^ (-335850955);
                                                                    i67 = -88247320;
                                                                }
                                                                break;
                                                            case -565295825:
                                                            case 611493685:
                                                                if (C1071.m56343() != 0) {
                                                                    iM556822 = (i64 - C0946.m55979("᩻᩻")) * (-55);
                                                                    i66 = ((iM556822 ^ i65) * 30363) ^ 646304352;
                                                                    i67 = -1663303342;
                                                                } else {
                                                                    iM556822 = C0873.m55680("ᩴ۫") ^ i64;
                                                                    i66 = ((iM556822 ^ i65) * 9591) ^ 1041072059;
                                                                    i67 = -516831963;
                                                                }
                                                                break;
                                                            case -263176504:
                                                            case 387711232:
                                                                if (C0949.f81897 >= 0) {
                                                                    iM556822 = (i64 - C0946.m55979("᩻᩻")) * (-55);
                                                                    i66 = ((iM556822 ^ i65) * 30363) ^ 646304352;
                                                                    i67 = -1663303342;
                                                                } else {
                                                                    iM556822 = (C0873.m55680("ۨۘ") + i65) * 97;
                                                                    i66 = ((iM556822 ^ i64) * 22897) ^ 656383749;
                                                                    i67 = -596745896;
                                                                }
                                                                break;
                                                            case -145186165:
                                                            case 1301978350:
                                                                if (C1024.m56209() < 0) {
                                                                    iM556822 = C0946.m55979("ۤ᩸") ^ i65;
                                                                    i66 = ((iM556822 ^ i64) * 21471) ^ (-1759768097);
                                                                    i67 = -1423159373;
                                                                } else {
                                                                    iM556822 = (C0873.m55680("ۨۘ") + i65) * 97;
                                                                    i66 = ((iM556822 ^ i64) * 22897) ^ 656383749;
                                                                    i67 = -596745896;
                                                                }
                                                                break;
                                                            case 415954399:
                                                            case 1876781634:
                                                                C0930.m55885();
                                                                C0930.m55885();
                                                                iM556822 = (C0873.m55680("ۨۘ") + i65) * 97;
                                                                i66 = ((iM556822 ^ i64) * 22897) ^ 656383749;
                                                                i67 = -596745896;
                                                                break;
                                                            case 484228238:
                                                            case 611223437:
                                                                if (C0877.m55696()) {
                                                                    iM556822 = (C0946.m55979("᩶᩺") ^ i65) * (-121);
                                                                    i66 = ((iM556822 ^ i64) * 17649) ^ (-505881895);
                                                                    i67 = 409440750;
                                                                } else {
                                                                    iM556822 = C0873.m55680("ܿ᩷") ^ i64;
                                                                    i66 = ((iM556822 ^ i65) * (-17853)) ^ (-335850955);
                                                                    i67 = -88247320;
                                                                }
                                                                break;
                                                            case 764510585:
                                                            case 1145732275:
                                                                if (C0947.f81895) {
                                                                    iM556822 = (C0946.m55979("ۗܶ") ^ i65) * 75;
                                                                    i66 = ((iM556822 ^ i64) * 20643) ^ 161423101;
                                                                    i67 = -2009201165;
                                                                } else {
                                                                    iM556822 = (C0873.m55680("ܶۜ") + i64) * (-73);
                                                                    i66 = ((iM556822 ^ i65) * (-28967)) ^ (-2133041114);
                                                                    i67 = 544295924;
                                                                }
                                                                break;
                                                            case 1120981219:
                                                            case 1720866982:
                                                                if (RunnableC0897.f81856) {
                                                                    iM556822 = (i65 - C0946.m55979("ۚ֨")) * 65;
                                                                    i66 = ((iM556822 ^ i64) * (-30675)) ^ 485980255;
                                                                    i67 = -460743258;
                                                                } else {
                                                                    iM556822 = (i64 - C0946.m55979("᩻᩻")) * (-55);
                                                                    i66 = ((iM556822 ^ i65) * 30363) ^ 646304352;
                                                                    i67 = -1663303342;
                                                                }
                                                                break;
                                                            case 1539327202:
                                                            case 1863146398:
                                                                if (ViewOnClickListenerC0939.f81888 <= 0) {
                                                                    iM556822 = C0946.m55979("ۤ᩸") ^ i65;
                                                                    i66 = ((iM556822 ^ i64) * 21471) ^ (-1759768097);
                                                                    i67 = -1423159373;
                                                                } else {
                                                                    iM556822 = (C0873.m55680("ܳ۬") + i64) * (-29);
                                                                    i66 = ((iM556822 ^ i65) * (-18399)) ^ (-467172643);
                                                                    i67 = 482078239;
                                                                }
                                                                break;
                                                            default:
                                                                if (C1017.f81942 >= 0) {
                                                                    iM556822 = C0873.m55680("ܿ᩷") ^ i64;
                                                                    i66 = ((iM556822 ^ i65) * (-17853)) ^ (-335850955);
                                                                    i67 = -88247320;
                                                                } else {
                                                                    iM556822 = (C0873.m55680("ۨۘ") + i65) * 97;
                                                                    i66 = ((iM556822 ^ i64) * 22897) ^ 656383749;
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
                                                    int iM556822;
                                                    int i63;
                                                    int i64;
                                                    int i65 = C0989.f81920;
                                                    int i66 = C0873.f81841;
                                                    int iM559730 = (i66 - C0946.m55979("ܳۧ")) * 93;
                                                    int i67 = ((iM559730 ^ i65) * (-9793)) ^ (-717932004);
                                                    ArrayList arrayList10 = null;
                                                    short[] sArr7 = null;
                                                    short[] sArr8 = null;
                                                    short[] sArr9 = null;
                                                    int i68 = iM559730 ^ 1573125358;
                                                    C11996 c11996 = null;
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
                                                    String strM27648 = null;
                                                    C12073 c12075 = null;
                                                    String strM55970 = null;
                                                    C18107 c18109 = null;
                                                    int i74 = 0;
                                                    while (true) {
                                                        i73 = i68 ^ (i67 & (((i73 ^ i65) * 29271) >> 31));
                                                        switch (i73) {
                                                            case -2086281596:
                                                            case 1370333266:
                                                                c12075.m27641();
                                                                c11996.m27459(C1046.m56297(c12075.m27644()));
                                                                iM556822 = (C0873.m55680("ܰ֨") ^ i65) * 109;
                                                                i63 = ((iM556822 ^ i66) * 2299) ^ 400518393;
                                                                i64 = -1854613110;
                                                                i68 = iM556822 ^ i64;
                                                                i67 = i63;
                                                                break;
                                                            case -1848765796:
                                                            case 735727846:
                                                                C1036.m56257();
                                                                if (!C1024.f81946) {
                                                                    int iM556823 = (i65 - C0873.m55680("ܿܽ")) * (-47);
                                                                    i68 = iM556823 ^ (-1767055983);
                                                                    i67 = ((iM556823 ^ i66) * 31051) ^ (-449125790);
                                                                    intent = null;
                                                                } else {
                                                                    iM556822 = C0946.m55979("᩸ܰ") ^ i66;
                                                                    i63 = ((iM556822 ^ i65) * (-14765)) ^ (-1237049459);
                                                                    i64 = 136517408;
                                                                    i68 = iM556822 ^ i64;
                                                                    i67 = i63;
                                                                }
                                                                break;
                                                            case -1789371581:
                                                            case 286704362:
                                                                sArr8 = f81852;
                                                                i70 = 1;
                                                                i71 = 26;
                                                                if (C1012.f81938 >= 0) {
                                                                    iM556822 = (C0873.m55680("᩸ۢ") ^ i66) * (-111);
                                                                    i63 = ((iM556822 ^ i65) * (-2995)) ^ 1627692898;
                                                                    i64 = -1631667037;
                                                                } else {
                                                                    iM556822 = C0873.m55680("ۡۡ") ^ i65;
                                                                    i63 = ((iM556822 ^ i66) * (-10101)) ^ 137516106;
                                                                    i64 = -630890976;
                                                                }
                                                                i68 = iM556822 ^ i64;
                                                                i67 = i63;
                                                                break;
                                                            case -1695101089:
                                                            case 453097650:
                                                                arrayList10 = arrayList3;
                                                                if (i74 < C1012.m56137(arrayList10)) {
                                                                    iM556822 = (i66 - C0873.m55680("֨۟")) * (-73);
                                                                    i63 = ((iM556822 ^ i65) * 21497) ^ 1860665826;
                                                                    i64 = -570181132;
                                                                } else {
                                                                    iM556822 = C0873.m55680("᩶֨") ^ i66;
                                                                    i63 = ((iM556822 ^ i65) * 17709) ^ 1222381831;
                                                                    i64 = 743863583;
                                                                }
                                                                i68 = iM556822 ^ i64;
                                                                i67 = i63;
                                                                break;
                                                            case -1569999818:
                                                            case -1055000079:
                                                                if (i72 - (s7 * s8) < 0) {
                                                                    iM556822 = C0873.m55680("ܿۙ") ^ i65;
                                                                    i63 = ((iM556822 ^ i66) * 20175) ^ 1604810972;
                                                                    i64 = -1482354935;
                                                                } else {
                                                                    iM556822 = (C0873.m55680("ۤܳ") + i65) * (-9);
                                                                    i63 = ((iM556822 ^ i66) * (-11163)) ^ (-607542619);
                                                                    i64 = 2004273138;
                                                                }
                                                                i68 = iM556822 ^ i64;
                                                                i67 = i63;
                                                                break;
                                                            case -1406096444:
                                                            case -758815525:
                                                                sArr7 = f81852;
                                                                c2 = 0;
                                                                if (C1229.m56410() != 0) {
                                                                    iM556822 = C0946.m55979("ۘ۫") ^ i65;
                                                                    i63 = ((iM556822 ^ i66) * (-24937)) ^ 1239682585;
                                                                    i64 = -633966665;
                                                                } else {
                                                                    iM556822 = C0873.m55680("᩹᩷") ^ i66;
                                                                    i63 = ((iM556822 ^ i65) * (-13533)) ^ 1687730920;
                                                                    i64 = 1714868818;
                                                                }
                                                                i68 = iM556822 ^ i64;
                                                                i67 = i63;
                                                                break;
                                                            case -1167382609:
                                                            case 1015378442:
                                                                s7 = sArr7[c2];
                                                                s6 = 8765;
                                                                if (ViewOnClickListenerC0939.f81888 <= 0) {
                                                                    iM556822 = C0946.m55979("᩸ܰ") ^ i66;
                                                                    i63 = ((iM556822 ^ i65) * (-14765)) ^ (-1237049459);
                                                                    i64 = 136517408;
                                                                } else {
                                                                    iM556822 = (C0946.m55979("֡ۗ") ^ i65) * (-53);
                                                                    i63 = ((iM556822 ^ i66) * 9457) ^ (-1303661837);
                                                                    i64 = -307019704;
                                                                }
                                                                i68 = iM556822 ^ i64;
                                                                i67 = i63;
                                                                break;
                                                            case -1094174595:
                                                            case 1384592100:
                                                                i69 = 755;
                                                                iM556822 = (i66 - C0946.m55979("֡ۨ")) * (-27);
                                                                i63 = ((iM556822 ^ i65) * 185) ^ 762241609;
                                                                i64 = -1629259097;
                                                                i68 = iM556822 ^ i64;
                                                                i67 = i63;
                                                                break;
                                                            case -1071297313:
                                                            case 1751690648:
                                                                if (C0890.f81849 != 0) {
                                                                    iM556822 = (C0873.m55680("᩸ۢ") ^ i66) * (-111);
                                                                    i63 = ((iM556822 ^ i65) * (-2995)) ^ 1627692898;
                                                                    i64 = -1631667037;
                                                                } else {
                                                                    iM556822 = C0946.m55979("᩸ܰ") ^ i66;
                                                                    i63 = ((iM556822 ^ i65) * (-14765)) ^ (-1237049459);
                                                                    i64 = 136517408;
                                                                }
                                                                i68 = iM556822 ^ i64;
                                                                i67 = i63;
                                                                break;
                                                            case -944158702:
                                                            case -790464751:
                                                                if (C0906.m55806(strM27648, C1048.m56318(sArr9, 35, 14, i69))) {
                                                                    iM556822 = (C0873.m55680("ܰ֨") ^ i65) * 109;
                                                                    i63 = ((iM556822 ^ i66) * 2299) ^ 400518393;
                                                                    i64 = -1854613110;
                                                                } else {
                                                                    iM556822 = C0873.m55680("ۤۖ") ^ i66;
                                                                    i63 = ((iM556822 ^ i65) * 9499) ^ 306925031;
                                                                    i64 = -652874320;
                                                                }
                                                                i68 = iM556822 ^ i64;
                                                                i67 = i63;
                                                                break;
                                                            case -917242905:
                                                            case -342064526:
                                                                intent.putExtra(strM55970, c11996.m27448());
                                                                if (C0863.f81833 <= 0) {
                                                                    iM556822 = C0946.m55979("᩸ܰ") ^ i66;
                                                                    i63 = ((iM556822 ^ i65) * (-14765)) ^ (-1237049459);
                                                                    i64 = 136517408;
                                                                } else {
                                                                    iM556822 = (C0873.m55680("ۜ۟") + i65) * (-61);
                                                                    i63 = ((iM556822 ^ i66) * (-31921)) ^ (-361105736);
                                                                    i64 = 1856985856;
                                                                }
                                                                i68 = iM556822 ^ i64;
                                                                i67 = i63;
                                                                break;
                                                            case -889379957:
                                                            case 1994761131:
                                                                c18109 = c18108;
                                                                Main mainM56560 = C1929.m56560(c18109);
                                                                Class cls3 = cls2;
                                                                if (C1044.f81959 < 0) {
                                                                    intent = new Intent(mainM56560, (Class<?>) cls3);
                                                                    C0927.m55875(intent, 268435456);
                                                                    if (C1048.f81963) {
                                                                        iM556822 = C0946.m55979("ܿ᩸") ^ i66;
                                                                        i63 = ((iM556822 ^ i65) * 6637) ^ 1700032129;
                                                                        i64 = 1269225141;
                                                                        i68 = iM556822 ^ i64;
                                                                        i67 = i63;
                                                                        break;
                                                                    }
                                                                }
                                                                int iM556824 = (i65 - C0873.m55680("ܿܽ")) * (-47);
                                                                i68 = iM556824 ^ (-1767055983);
                                                                i67 = ((iM556824 ^ i66) * 31051) ^ (-449125790);
                                                                intent = null;
                                                                break;
                                                            case -824176055:
                                                            case -223573801:
                                                                i74++;
                                                                iM556822 = C0946.m55979("ۚܽ") ^ i65;
                                                                i63 = ((iM556822 ^ i66) * 1625) ^ (-94575025);
                                                                i64 = -299648634;
                                                                i68 = iM556822 ^ i64;
                                                                i67 = i63;
                                                                break;
                                                            case -367575464:
                                                            case 1385219038:
                                                                C0861.m55626();
                                                                if (C0967.f81910 < 0) {
                                                                    iM556822 = (C0873.m55680("᩸ۢ") ^ i66) * (-111);
                                                                    i63 = ((iM556822 ^ i65) * (-2995)) ^ 1627692898;
                                                                    i64 = -1631667037;
                                                                } else {
                                                                    iM556822 = C0946.m55979("ۘ۫") ^ i65;
                                                                    i63 = ((iM556822 ^ i66) * (-24937)) ^ 1239682585;
                                                                    i64 = -633966665;
                                                                }
                                                                i68 = iM556822 ^ i64;
                                                                i67 = i63;
                                                                break;
                                                            case -242573348:
                                                            case 1552239641:
                                                                c11996 = new C11996();
                                                                i74 = 0;
                                                                iM556822 = C0946.m55979("ۚܽ") ^ i65;
                                                                i63 = ((iM556822 ^ i66) * 1625) ^ (-94575025);
                                                                i64 = -299648634;
                                                                i68 = iM556822 ^ i64;
                                                                i67 = i63;
                                                                break;
                                                            case -215237746:
                                                            case -120405810:
                                                                C11245.m26044(interfaceC19374, 2000);
                                                                C1044.m56284(C1929.m56560(c18109), intent);
                                                                break;
                                                            case -38010035:
                                                            case 1444606993:
                                                                c12075 = (C12073) C1017.m56196(arrayList10, i74);
                                                                strM27648 = c12075.m27648();
                                                                sArr9 = f81852;
                                                                if (C0912.f81867 <= 0) {
                                                                    iM556822 = C0946.m55979("ۘ۫") ^ i65;
                                                                    i63 = ((iM556822 ^ i66) * (-24937)) ^ 1239682585;
                                                                    i64 = -633966665;
                                                                } else {
                                                                    iM556822 = C0946.m55979("ۛ᩷") ^ i65;
                                                                    i63 = ((iM556822 ^ i66) * 30123) ^ 1914226444;
                                                                    i64 = 849050745;
                                                                }
                                                                i68 = iM556822 ^ i64;
                                                                i67 = i63;
                                                                break;
                                                            case 382225048:
                                                            case 516735841:
                                                                i69 = 10680;
                                                                iM556822 = (i66 - C0946.m55979("֡ۨ")) * (-27);
                                                                i63 = ((iM556822 ^ i65) * 185) ^ 762241609;
                                                                i64 = -1629259097;
                                                                i68 = iM556822 ^ i64;
                                                                i67 = i63;
                                                                break;
                                                            case 789868083:
                                                            case 917827652:
                                                                C1194.m56396();
                                                                C1404.m56468();
                                                                iM556822 = (C0873.m55680("᩸ۢ") ^ i66) * (-111);
                                                                i63 = ((iM556822 ^ i65) * (-2995)) ^ 1627692898;
                                                                i64 = -1631667037;
                                                                i68 = iM556822 ^ i64;
                                                                i67 = i63;
                                                                break;
                                                            case 793204887:
                                                            case 1195528454:
                                                                intent.setAction(C1028.m56235(sArr8, i70, i71, i69));
                                                                if (RunnableC0938.f81886 >= 0) {
                                                                    iM556822 = (C0873.m55680("ܺۢ") + i66) * (-99);
                                                                    i63 = ((iM556822 ^ i65) * 16081) ^ 34084107;
                                                                    i64 = 2096381610;
                                                                } else {
                                                                    iM556822 = C0873.m55680("ۢ᩺") ^ i66;
                                                                    i63 = ((iM556822 ^ i65) * (-8801)) ^ (-1936393807);
                                                                    i64 = 1757467253;
                                                                }
                                                                i68 = iM556822 ^ i64;
                                                                i67 = i63;
                                                                break;
                                                            case 846254827:
                                                            case 1182931917:
                                                                strM55970 = AbstractC0942.m55970(f81852, 27, 8, i69);
                                                                if (C0906.m55809() <= 0) {
                                                                    iM556822 = (C0873.m55680("᩸ۢ") ^ i66) * (-111);
                                                                    i63 = ((iM556822 ^ i65) * (-2995)) ^ 1627692898;
                                                                    i64 = -1631667037;
                                                                } else {
                                                                    iM556822 = (C0946.m55979("ۢ۠") ^ i65) * (-115);
                                                                    i63 = ((iM556822 ^ i66) * (-6831)) ^ 1974808534;
                                                                    i64 = 170623079;
                                                                }
                                                                i68 = iM556822 ^ i64;
                                                                i67 = i63;
                                                                break;
                                                            case 851033167:
                                                            case 1503252946:
                                                                C0989.m56095();
                                                                break;
                                                            default:
                                                                int i75 = s7 + s6;
                                                                i72 = i75 * i75;
                                                                s8 = 35060;
                                                                if (RunnableC0938.f81886 >= 0) {
                                                                    iM556822 = C0946.m55979("᩸ܰ") ^ i66;
                                                                    i63 = ((iM556822 ^ i65) * (-14765)) ^ (-1237049459);
                                                                    i64 = 136517408;
                                                                } else {
                                                                    iM556822 = C0873.m55680("ᩴܽ") ^ i66;
                                                                    i63 = ((iM556822 ^ i65) * 28175) ^ (-21797073);
                                                                    i64 = -120037319;
                                                                }
                                                                i68 = iM556822 ^ i64;
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
                                        int iM5597210 = (i44 - C0946.m55979("ۜۢ")) * (-93);
                                        length = i39;
                                        s4 = s3;
                                        i46 = ((iM5597210 ^ i45) * (-2675)) ^ (-1742263988);
                                        c12074 = null;
                                        ArrayList arrayList10 = arrayList2;
                                        i47 = iM5597210 ^ (-372845233);
                                        arrayList3 = arrayList10;
                                        break;
                                    case 684945923:
                                    case 1392235738:
                                        length2--;
                                        iM556816 = C0873.m55680("۬᩺") ^ i44;
                                        i30 = ((iM556816 ^ i45) * (-20533)) ^ 2119120643;
                                        i31 = 282696472;
                                        int i517 = iM556816 ^ i31;
                                        arrayList3 = arrayList3;
                                        i47 = i517;
                                        i46 = i30;
                                        break;
                                    case 717251660:
                                    case 1467314935:
                                        i49 = 23424;
                                        iM559720 = (C0946.m55979("ۘۛ") ^ i44) * 17;
                                        i40 = ((iM559720 ^ i45) * 30657) ^ (-155285366);
                                        i41 = -209227240;
                                        int i518 = iM559720 ^ i41;
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
                                        sArr5 = f81828;
                                        if (C1017.f81942 >= 0) {
                                            int iM5597211 = (C0946.m55979("ۖ֡") + i45) * 31;
                                            int i519 = ((iM5597211 ^ i44) * 20047) ^ 2115044932;
                                            i35 = iM5597211 ^ (-1061055932);
                                            length = i32;
                                            s4 = s2;
                                            i46 = i519;
                                            arrayList3 = arrayList3;
                                            c12074 = null;
                                        } else {
                                            iM556817 = C0873.m55680("ۨ᩺") ^ i44;
                                            i33 = ((iM556817 ^ i45) * (-19795)) ^ (-1959507541);
                                            i34 = 945597799;
                                            i35 = iM556817 ^ i34;
                                            length = i32;
                                            s4 = s2;
                                            i46 = i33;
                                            arrayList3 = arrayList3;
                                        }
                                        i47 = i35;
                                        viewOnClickListenerC2664 = this;
                                        break;
                                    case 1298491618:
                                    case 1514305985:
                                        arrayList3 = arrayList3;
                                        strM56276 = C1044.m56276(sArr4, i50, i51, i49);
                                        if (C1929.f83011 != 0) {
                                            iM556816 = (C0946.m55979("ᩴ᩵") + i45) * 39;
                                            i30 = ((iM556816 ^ i44) * (-2119)) ^ 1002520211;
                                            i31 = 2091114248;
                                        } else {
                                            iM556816 = C0873.m55680("֫᩺") ^ i44;
                                            i30 = ((iM556816 ^ i45) * (-17059)) ^ 1877796258;
                                            i31 = 2094739871;
                                        }
                                        int i5110 = iM556816 ^ i31;
                                        arrayList3 = arrayList3;
                                        i47 = i5110;
                                        i46 = i30;
                                        break;
                                    default:
                                        arrayList3 = arrayList3;
                                        i36 = length;
                                        s4 = sArr5[c];
                                        s5 = 1532;
                                        if (RunnableC0897.m55784()) {
                                            iM556818 = (i45 - C0873.m55680("ۖ۫")) * (-105);
                                            i37 = ((iM556818 ^ i44) * 4927) ^ (-895324932);
                                            i38 = 60782280;
                                        } else {
                                            iM556818 = (i45 - C0946.m55979("ۧᩳ")) * (-5);
                                            i37 = ((iM556818 ^ i44) * (-29765)) ^ 1217222402;
                                            i38 = -1495926270;
                                        }
                                        i35 = iM556818 ^ i38;
                                        length = i36;
                                        i46 = i37;
                                        arrayList3 = arrayList3;
                                        i47 = i35;
                                        viewOnClickListenerC2664 = this;
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    C1048.m56304(C1071.m56337(dialogInterfaceC2564M18268), new ViewOnClickListenerC10907(zArr, c21793));
                    break;
                case -861122177:
                case 2079788677:
                    i27 = i27;
                    c20671 = c20671;
                    interfaceC19372 = interfaceC19372;
                    main3 = main3;
                    listView3 = listView3;
                    sArr3 = sArr3;
                    str3 = str3;
                    view3 = view3;
                    iM559713 = iM559713;
                    s = f82953[466];
                    if (C1048.m56305() >= 0) {
                        iM55681 = (C0946.m55979("ܺ᩻") ^ i21) * (-77);
                        i10 = ((iM55681 ^ i20) * (-7623)) ^ (-2064482112);
                        i11 = -1752707084;
                    } else {
                        iM55681 = C0873.m55680("ۡ᩸") ^ i20;
                        i10 = ((iM55681 ^ i21) * (-31889)) ^ (-1067224172);
                        i11 = -1055334158;
                    }
                    i17 = iM55681 ^ i11;
                    sArr3 = sArr3;
                    iM559713 = iM559713;
                    view3 = view3;
                    i27 = i27;
                    i23 = i17;
                    i22 = i10;
                    str3 = str3;
                    listView3 = listView3;
                    main3 = main3;
                    interfaceC19372 = interfaceC19372;
                    c20671 = c20671;
                    break;
                case -817869909:
                case 1285472206:
                    C0937.m55918();
                    break;
                case -638366652:
                case 1063437450:
                    i27 = i27;
                    c20671 = c20671;
                    interfaceC19372 = interfaceC19372;
                    main3 = main3;
                    listView3 = listView3;
                    short s2 = s;
                    sArr3 = sArr3;
                    str3 = str3;
                    view3 = view3;
                    iM559713 = iM559713;
                    if (((s2 * s2) + 257827249) - (s2 * 32114) < 0) {
                        int iM556816 = C0873.m55680("ܶ᩶") ^ i20;
                        s = s2;
                        i22 = ((iM556816 ^ i21) * (-4449)) ^ 713815720;
                        sArr3 = sArr3;
                        iM559713 = iM559713;
                        view3 = view3;
                        i27 = i27;
                        i23 = iM556816 ^ (-1627023115);
                    } else {
                        s = s2;
                        iM55681 = C0873.m55680("ۜ۟") ^ i21;
                        i10 = ((iM55681 ^ i20) * (-32719)) ^ 1813824368;
                        i11 = 1433621894;
                        i17 = iM55681 ^ i11;
                        sArr3 = sArr3;
                        iM559713 = iM559713;
                        view3 = view3;
                        i27 = i27;
                        i23 = i17;
                        i22 = i10;
                    }
                    str3 = str3;
                    listView3 = listView3;
                    main3 = main3;
                    interfaceC19372 = interfaceC19372;
                    c20671 = c20671;
                    break;
                case -605758809:
                case -308932675:
                    i27 = i27;
                    c20671 = c20671;
                    interfaceC19372 = interfaceC19372;
                    main3 = main3;
                    listView3 = listView3;
                    sArr3 = sArr3;
                    str3 = str3;
                    view3 = view3;
                    iM559713 = iM559713;
                    String str5 = str2;
                    if (!C0906.m55806(interfaceC19372.getParent(), str5)) {
                        str2 = str5;
                        str3 = str3;
                        interfaceC19372 = interfaceC19372;
                        int iM556817 = C0873.m55680("ܶۤ") ^ i21;
                        sArr3 = sArr3;
                        iM559713 = iM559713;
                        view3 = view3;
                        i27 = i27;
                        i23 = iM556817 ^ (-1558780401);
                        i22 = ((iM556817 ^ i20) * 7107) ^ (-489025746);
                        listView3 = listView3;
                        c20671 = c20671;
                        main3 = main3;
                    } else {
                        iM55681 = (C0946.m55979("ۗ᩶") ^ i20) * 109;
                        str2 = str5;
                        i10 = ((iM55681 ^ i21) * (-27809)) ^ 842642995;
                        i11 = 1341913706;
                        i17 = iM55681 ^ i11;
                        sArr3 = sArr3;
                        iM559713 = iM559713;
                        view3 = view3;
                        i27 = i27;
                        i23 = i17;
                        i22 = i10;
                        str3 = str3;
                        listView3 = listView3;
                        main3 = main3;
                        interfaceC19372 = interfaceC19372;
                        c20671 = c20671;
                    }
                    break;
                case -584706753:
                case 1827935846:
                    RunnableC0871.m55671(C1017.m56189(f82953, 467, 5, i26));
                    break;
                case -379681099:
                case 1892902990:
                    i27 = i27;
                    c20671 = c20671;
                    interfaceC19371 = interfaceC19372;
                    main3 = main3;
                    listView3 = listView3;
                    sArr3 = sArr3;
                    view3 = view3;
                    iM559713 = iM559713;
                    if (i25 < C0861.m55625(arrayList)) {
                        iM55979 = (C0873.m55680("ۜۜ") + i21) * 39;
                        i = ((iM55979 ^ i20) * 14937) ^ (-1829405760);
                        i2 = 1555267036;
                    } else {
                        iM55979 = C0873.m55680("ۤ᩻") ^ i20;
                        i = ((iM55979 ^ i21) * 19687) ^ 48801840;
                        i2 = 1487008264;
                    }
                    i3 = iM55979 ^ i2;
                    interfaceC19372 = interfaceC19371;
                    sArr3 = sArr3;
                    iM559713 = iM559713;
                    view3 = view3;
                    c20671 = c20671;
                    listView3 = listView3;
                    main3 = main3;
                    i9 = i27;
                    i23 = i3;
                    i22 = i;
                    i27 = i9;
                    break;
                case -216788543:
                case 2031639723:
                    C0930.m55885();
                    if (C1003.m56123() == 0) {
                        i4 = i27;
                        view = view3;
                        sArr = sArr3;
                        i5 = iM559713;
                        iM55680 = (C0946.m55979("ۜۧ") + i20) * (-59);
                        i6 = ((iM55680 ^ i21) * 9173) ^ 860536296;
                        i7 = -207679166;
                        sArr3 = sArr;
                        i9 = i4;
                        i23 = iM55680 ^ i7;
                        i22 = i6;
                        iM559713 = i5;
                        view3 = view;
                        i27 = i9;
                    }
                    i27 = i27;
                    iM559710 = (C0873.m55680("ۖܺ") + i21) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i = ((iM559710 ^ i20) * 20481) ^ 285335824;
                    i8 = 492796346;
                    i3 = iM559710 ^ i8;
                    i9 = i27;
                    i23 = i3;
                    i22 = i;
                    i27 = i9;
                    break;
                case 66821975:
                case 1964025704:
                    i27 = i27;
                    c20671 = c20671;
                    main3 = main3;
                    listView3 = listView3;
                    sArr3 = sArr3;
                    view3 = view3;
                    iM559713 = iM559713;
                    C1194.m56393(arrayList, new C12073(interfaceC19372));
                    int iM556818 = C0873.m55680("ܶۤ") ^ i21;
                    sArr3 = sArr3;
                    iM559713 = iM559713;
                    view3 = view3;
                    i27 = i27;
                    i23 = iM556818 ^ (-1558780401);
                    i22 = ((iM556818 ^ i20) * 7107) ^ (-489025746);
                    listView3 = listView3;
                    c20671 = c20671;
                    main3 = main3;
                    break;
                case 106513570:
                case 1320651153:
                    i27 = i27;
                    c20671 = c20671;
                    interfaceC19372 = interfaceC19372;
                    main3 = main3;
                    listView3 = listView3;
                    sArr3 = sArr3;
                    str3 = str3;
                    view3 = view3;
                    iM559713 = iM559713;
                    if (C0866.m55647(itM55766)) {
                        iM55681 = (C0946.m55979("۠֫") + i20) * 77;
                        i10 = ((iM55681 ^ i21) * (-7391)) ^ 1064193187;
                        i11 = -495031585;
                    } else {
                        iM55681 = C0873.m55680("֫ۢ") ^ i20;
                        i10 = ((iM55681 ^ i21) * 1477) ^ (-1929852824);
                        i11 = -1754667251;
                    }
                    i17 = iM55681 ^ i11;
                    sArr3 = sArr3;
                    iM559713 = iM559713;
                    view3 = view3;
                    i27 = i27;
                    i23 = i17;
                    i22 = i10;
                    str3 = str3;
                    listView3 = listView3;
                    main3 = main3;
                    interfaceC19372 = interfaceC19372;
                    c20671 = c20671;
                    break;
                case 500532388:
                case 1078608158:
                    int i30 = i27;
                    View view11 = view3;
                    listView = listView3;
                    sArr2 = sArr3;
                    int i31 = iM559713;
                    Main mainM56560 = C1929.m56560(c18107);
                    view2 = view11;
                    int iM559720 = C0946.m55979(C0861.m55618(f82953, 490, 3, i26));
                    if (C1404.f82149 >= 0) {
                        iM559713 = i31;
                        i27 = i30;
                        i18 = iM559720;
                        main = mainM56560;
                        int iM5597110 = (C0946.m55979("ۚ۠") ^ i20) * (-55);
                        Main main9 = main;
                        i22 = ((iM5597110 ^ i21) * (-10281)) ^ (-847901806);
                        sArr3 = sArr2;
                        View view12 = view2;
                        listView3 = listView;
                        main3 = main9;
                        i23 = iM5597110 ^ (-2036668366);
                        view3 = view12;
                    } else {
                        int iM559721 = (i21 - C0946.m55979("ܽ֨")) * (-119);
                        sArr3 = sArr2;
                        i18 = iM559720;
                        i22 = ((iM559721 ^ i20) * (-689)) ^ (-1616293785);
                        iM559713 = i31;
                        view3 = view2;
                        listView3 = listView;
                        main3 = mainM56560;
                        i23 = iM559721 ^ 634757277;
                        i27 = i30;
                    }
                    break;
                case 603496589:
                case 754915654:
                    C0947.m55997();
                    if (C0854.f81826 != 0) {
                        i12 = i27;
                        viewM56181 = view3;
                        listView2 = listView3;
                        i13 = iM559713;
                        main2 = main3;
                        int iM556819 = (C0873.m55680("᩺۠") ^ i21) * (-113);
                        ListView listView8 = listView2;
                        i22 = ((iM556819 ^ i20) * 24747) ^ (-1213640604);
                        i15 = iM556819 ^ 2137045215;
                        listView3 = listView8;
                        main3 = main2;
                        iM559713 = i13;
                        view3 = viewM56181;
                        i27 = i12;
                        i23 = i15;
                    } else {
                        i27 = i27;
                        iM559710 = (C0873.m55680("ۖܺ") + i21) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM559710 ^ i20) * 20481) ^ 285335824;
                        i8 = 492796346;
                        i3 = iM559710 ^ i8;
                        i9 = i27;
                        i23 = i3;
                        i22 = i;
                        i27 = i9;
                    }
                    break;
                case 714352354:
                case 937995847:
                    if (C0906.m55806(c12073.m27648(), str3)) {
                        iM55682 = (i20 - C0873.m55680("ۘۖ")) * (-25);
                        i14 = ((iM55682 ^ i21) * 23741) ^ 195864905;
                        i16 = 683492349;
                    } else {
                        iM55682 = C0946.m55979("۟ۛ") ^ i21;
                        i14 = ((iM55682 ^ i20) * (-27777)) ^ 1524153549;
                        i16 = 1709218054;
                    }
                    i23 = iM55682 ^ i16;
                    i22 = i14;
                    break;
                case 1280869422:
                case 1707998929:
                    C0955.m56025();
                    if (C0989.f81920 < 0) {
                        i27 = i27;
                        c20671 = c20671;
                        interfaceC19372 = interfaceC19372;
                        main3 = main3;
                        listView3 = listView3;
                        sArr3 = sArr3;
                        str3 = str3;
                        view3 = view3;
                        iM559713 = iM559713;
                        iM55681 = (C0946.m55979("ܺ᩻") ^ i21) * (-77);
                        i10 = ((iM55681 ^ i20) * (-7623)) ^ (-2064482112);
                        i11 = -1752707084;
                        i17 = iM55681 ^ i11;
                        sArr3 = sArr3;
                        iM559713 = iM559713;
                        view3 = view3;
                        i27 = i27;
                        i23 = i17;
                        i22 = i10;
                        str3 = str3;
                        listView3 = listView3;
                        main3 = main3;
                        interfaceC19372 = interfaceC19372;
                        c20671 = c20671;
                    } else {
                        iM55682 = (C0873.m55680("ۧ᩷") ^ i21) * 81;
                        i14 = ((iM55682 ^ i20) * 6025) ^ 495768419;
                        i16 = -1023188927;
                        i23 = iM55682 ^ i16;
                        i22 = i14;
                    }
                    break;
                case 1686736101:
                case 1863190988:
                    c12073 = (C12073) C1017.m56196(arrayList, i25);
                    String strM27648 = c12073.m27648();
                    strArr2[i25] = strM27648;
                    i24 = 100;
                    if (C0927.m55878(strM27648) > 100) {
                        iM55682 = C0946.m55979("᩶ۜ") ^ i20;
                        i14 = ((iM55682 ^ i21) * 4797) ^ (-1808857755);
                        i16 = -1929497399;
                    } else {
                        iM55682 = C0946.m55979("᩷᩷") ^ i20;
                        i14 = ((iM55682 ^ i21) * 14291) ^ (-343209562);
                        i16 = 846998275;
                    }
                    i23 = iM55682 ^ i16;
                    i22 = i14;
                    break;
                default:
                    C1124.m56367();
                    C0873.m55678();
                    i27 = i27;
                    iM559710 = (C0873.m55680("ۖܺ") + i21) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i = ((iM559710 ^ i20) * 20481) ^ 285335824;
                    i8 = 492796346;
                    i3 = iM559710 ^ i8;
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
    /* JADX INFO: renamed from: ۧ */
    public static void m47306(C18107 c18107, AbstractC17043 abstractC17043) throws Throwable {
        int iM55680;
        int i;
        int i2;
        int iM55681;
        int i3;
        int i4;
        int i5;
        int iM55682;
        int i6;
        C18107 c18108 = c18107;
        int i7 = C1053.f81965;
        int i8 = C0989.f81920;
        int iM55683 = C0873.m55680("۟ۙ") ^ i7;
        int i9 = ((iM55683 ^ i8) * (-19039)) ^ (-1552758248);
        C13746 c13746M26103 = null;
        Throwable th = null;
        AbstractC18422 abstractC18422 = null;
        C7280 c7280 = null;
        short[] sArr = null;
        int i10 = iM55683 ^ 747881376;
        int size = 0;
        int i11 = 0;
        boolean z = false;
        boolean zM55806 = false;
        int i12 = 0;
        short s = 0;
        short s2 = 0;
        int i13 = 0;
        short s3 = 0;
        int i14 = 1609162230;
        char c = 0;
        C11245 c11245M41242 = null;
        String strM56086 = null;
        while (true) {
            i14 = i10 ^ (i9 & (((i14 ^ i8) * 4187) >> 31));
            switch (i14) {
                case -2088393713:
                case 615151375:
                    s2 = s2;
                    int i15 = s + s2;
                    i13 = i15 * i15;
                    if (C1025.f81947 >= 0) {
                        iM55681 = (i8 - C0946.m55979("ۗܿ")) * (-31);
                        i3 = ((iM55681 ^ i7) * 30641) ^ 689256871;
                        i4 = 1626798007;
                    } else {
                        iM55681 = (i7 - C0873.m55680("ܺܳ")) * (-7);
                        i3 = ((iM55681 ^ i8) * (-10559)) ^ (-655392095);
                        i4 = 1760512877;
                    }
                    short s4 = s2;
                    i10 = iM55681 ^ i4;
                    i9 = i3;
                    s2 = s4;
                    break;
                case -1981634764:
                case 50682762:
                    s = sArr[c];
                    if (C0917.m55854()) {
                        int iM55979 = C0946.m55979("ۛܳ") ^ i7;
                        i10 = iM55979 ^ (-1210493281);
                        i9 = ((iM55979 ^ i8) * 1507) ^ (-1366658507);
                        s2 = 10770;
                    } else {
                        s2 = 10770;
                        int iM55684 = C0873.m55680("֫ܿ") ^ i7;
                        i5 = ((iM55684 ^ i8) * (-1699)) ^ (-942734998);
                        i10 = iM55684 ^ 2102990368;
                        i9 = i5;
                        c18108 = c18107;
                    }
                    break;
                case -1755553105:
                case 1914849102:
                    if (RunnableC0871.f81839 < 0) {
                        iM55680 = (C0946.m55979("ۚ᩺") + i7) * (-75);
                        i = ((iM55680 ^ i8) * 30341) ^ 1345213361;
                        i2 = 819587754;
                    } else {
                        iM55680 = (i8 - C0946.m55979("ۖ᩻")) * (-85);
                        i = ((iM55680 ^ i7) * (-12717)) ^ (-824341941);
                        i2 = 626875023;
                    }
                    i10 = iM55680 ^ i2;
                    i9 = i;
                    break;
                case -1738531070:
                case -517416696:
                    if (RunnableC0871.m55672() < 0) {
                        s2 = s2;
                        iM55681 = (i8 - C0946.m55979("ۗܿ")) * (-31);
                        i3 = ((iM55681 ^ i7) * 30641) ^ 689256871;
                        i4 = 1626798007;
                        short s5 = s2;
                        i10 = iM55681 ^ i4;
                        i9 = i3;
                        s2 = s5;
                    } else {
                        iM55680 = C0873.m55680("ܿ֡") ^ i7;
                        i = ((iM55680 ^ i8) * (-9493)) ^ (-1123235688);
                        i2 = 647510107;
                        i10 = iM55680 ^ i2;
                        i9 = i;
                    }
                    break;
                case -1667085670:
                case 1429723938:
                    s2 = s2;
                    c = 384;
                    if (RunnableC1014.m56177()) {
                        iM55681 = (C0946.m55979("ܺ۬") ^ i8) * (-91);
                        i3 = ((iM55681 ^ i7) * 11375) ^ (-1005212543);
                        i4 = 1429614381;
                    } else {
                        iM55681 = (i8 - C0946.m55979("ۗܿ")) * (-31);
                        i3 = ((iM55681 ^ i7) * 30641) ^ 689256871;
                        i4 = 1626798007;
                    }
                    short s6 = s2;
                    i10 = iM55681 ^ i4;
                    i9 = i3;
                    s2 = s6;
                    break;
                case -1644743721:
                case -696452133:
                    s2 = s2;
                    if (i13 - (s * s3) < 0) {
                        iM55681 = (C0873.m55680("֡۫") + i8) * 99;
                        i3 = ((iM55681 ^ i7) * 6033) ^ (-371381938);
                        i4 = -1240623824;
                    } else {
                        iM55681 = (i7 - C0946.m55979("ۢۧ")) * 9;
                        i3 = ((iM55681 ^ i8) * 17205) ^ (-573936236);
                        i4 = -2140147018;
                    }
                    short s7 = s2;
                    i10 = iM55681 ^ i4;
                    i9 = i3;
                    s2 = s7;
                    break;
                case -1604322521:
                case 617694414:
                    s2 = s2;
                    c13746M26103 = c11245M41242.m26103();
                    c13746M26103.m31299();
                    iM55681 = (i7 - C0873.m55680("ۡܶ")) * 21;
                    i3 = ((iM55681 ^ i8) * (-26953)) ^ (-232683808);
                    i4 = -1739121830;
                    short s8 = s2;
                    i10 = iM55681 ^ i4;
                    i9 = i3;
                    s2 = s8;
                    break;
                case -1517076707:
                case -752201227:
                    s2 = s2;
                    try {
                        size = c13746M26103.size();
                        iM55681 = (i8 - C0873.m55680("۫ᩳ")) * 65;
                        i3 = ((iM55681 ^ i7) * (-21291)) ^ 2145484718;
                        i4 = 66104610;
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        iM55681 = (i8 - C0873.m55680("ܶܶ")) * (-111);
                        i3 = ((iM55681 ^ i7) * (-21377)) ^ 1513799763;
                        i4 = 1239355635;
                    }
                    short s9 = s2;
                    i10 = iM55681 ^ i4;
                    i9 = i3;
                    s2 = s9;
                    break;
                case -1512031355:
                case 1465532749:
                    i12 = 7207;
                    iM55681 = C0946.m55979("ۧܰ") ^ i7;
                    i3 = ((iM55681 ^ i8) * (-15369)) ^ 312906015;
                    i4 = -1986912297;
                    short s10 = s2;
                    i10 = iM55681 ^ i4;
                    i9 = i3;
                    s2 = s10;
                    break;
                case -1447109812:
                case 272626309:
                    RunnableC0938.m55927(c13746M26103);
                    return;
                case -1385740221:
                case 1235331455:
                    s2 = s2;
                    if (z) {
                        iM55682 = C0873.m55680("ۤۧ") ^ i7;
                        i = ((iM55682 ^ i8) * 32275) ^ 1971607890;
                        i6 = 1313190728;
                    } else {
                        iM55682 = C0946.m55979("ܺۚ") ^ i8;
                        i = ((iM55682 ^ i7) * (-32021)) ^ (-1494513712);
                        i6 = -981169460;
                    }
                    int i16 = iM55682 ^ i6;
                    s2 = s2;
                    i10 = i16;
                    i9 = i;
                    break;
                case -1242718992:
                case 1047328845:
                    i11 = 0;
                    iM55681 = C0946.m55979("᩻ۗ") ^ i7;
                    i3 = ((iM55681 ^ i8) * (-4681)) ^ (-468596042);
                    i4 = 598627904;
                    short s11 = s2;
                    i10 = iM55681 ^ i4;
                    i9 = i3;
                    s2 = s11;
                    break;
                case -1110512682:
                case 818761331:
                    s2 = s2;
                    strM56086 = C0989.m56086(abstractC17043);
                    c11245M41242 = c18107.m41242();
                    if (C0949.f81897 >= 0) {
                        iM55681 = C0873.m55680("᩺᩹") ^ i8;
                        i3 = ((iM55681 ^ i7) * (-20715)) ^ 5600522;
                        i4 = -962815298;
                    } else {
                        iM55681 = (i8 - C0946.m55979("᩸᩺")) * 63;
                        i3 = ((iM55681 ^ i7) * 9193) ^ (-1208881198);
                        i4 = -224615796;
                    }
                    short s12 = s2;
                    i10 = iM55681 ^ i4;
                    i9 = i3;
                    s2 = s12;
                    break;
                case -1092498967:
                case 1363503336:
                    if (C0863.f81833 <= 0) {
                        iM55680 = (C0946.m55979("ۚ᩺") + i7) * (-75);
                        i = ((iM55680 ^ i8) * 30341) ^ 1345213361;
                        i2 = 819587754;
                        i10 = iM55680 ^ i2;
                        i9 = i;
                    } else {
                        s2 = s2;
                        iM55681 = (i8 - C0946.m55979("ۗܿ")) * (-31);
                        i3 = ((iM55681 ^ i7) * 30641) ^ 689256871;
                        i4 = 1626798007;
                        short s13 = s2;
                        i10 = iM55681 ^ i4;
                        i9 = i3;
                        s2 = s13;
                    }
                    break;
                case -641563446:
                case 143757806:
                    if (C1017.m56187() > 0) {
                        s2 = s2;
                        iM55681 = C0873.m55680("᩺᩹") ^ i8;
                        i3 = ((iM55681 ^ i7) * (-20715)) ^ 5600522;
                        i4 = -962815298;
                        short s14 = s2;
                        i10 = iM55681 ^ i4;
                        i9 = i3;
                        s2 = s14;
                    }
                    s2 = s2;
                    iM55681 = (i8 - C0946.m55979("ۗܿ")) * (-31);
                    i3 = ((iM55681 ^ i7) * 30641) ^ 689256871;
                    i4 = 1626798007;
                    short s15 = s2;
                    i10 = iM55681 ^ i4;
                    i9 = i3;
                    s2 = s15;
                    break;
                case -623105189:
                case -110200550:
                    s2 = s2;
                    s3 = 43080;
                    if (C1044.f81959 >= 0) {
                        iM55681 = (C0946.m55979("֫ܶ") + i8) * (-7);
                        i3 = ((iM55681 ^ i7) * 10961) ^ 663057180;
                        i4 = 386321200;
                    } else {
                        iM55681 = C0946.m55979("ۙ᩹") ^ i8;
                        i3 = ((iM55681 ^ i7) * 12881) ^ (-1860048093);
                        i4 = 593416076;
                    }
                    short s16 = s2;
                    i10 = iM55681 ^ i4;
                    i9 = i3;
                    s2 = s16;
                    break;
                case -418981816:
                case 952560408:
                    s2 = s2;
                    sArr = f82953;
                    if (C1071.f81975 <= 0) {
                        iM55681 = (C0946.m55979("֫ܶ") + i8) * (-7);
                        i3 = ((iM55681 ^ i7) * 10961) ^ 663057180;
                        i4 = 386321200;
                    } else {
                        iM55681 = C0946.m55979("ۜ֨") ^ i7;
                        i3 = ((iM55681 ^ i8) * 9735) ^ (-851925475);
                        i4 = -1459701250;
                    }
                    short s17 = s2;
                    i10 = iM55681 ^ i4;
                    i9 = i3;
                    s2 = s17;
                    break;
                case -72259912:
                case 148553588:
                    s2 = s2;
                    if (C0912.f81867 > 0) {
                        iM55681 = (C0873.m55680("᩶᩹") ^ i8) * (-101);
                        i3 = ((iM55681 ^ i7) * 12795) ^ (-879216788);
                        i4 = -1362713964;
                        short s18 = s2;
                        i10 = iM55681 ^ i4;
                        i9 = i3;
                        s2 = s18;
                    } else {
                        s2 = s2;
                        int iM55685 = C0873.m55680("֫ܿ") ^ i7;
                        i5 = ((iM55685 ^ i8) * (-1699)) ^ (-942734998);
                        i10 = iM55685 ^ 2102990368;
                        i9 = i5;
                        c18108 = c18107;
                    }
                    break;
                case -6793932:
                case 780012534:
                    C0894.m55761(c13746M26103);
                    throw th;
                case 20720591:
                case 416231762:
                    s2 = s2;
                    if (C0989.m56095() <= 0) {
                        s2 = s2;
                        int iM55686 = C0873.m55680("֫ܿ") ^ i7;
                        i5 = ((iM55686 ^ i8) * (-1699)) ^ (-942734998);
                        i10 = iM55686 ^ 2102990368;
                    } else {
                        int iM559710 = (C0946.m55979("ۡۛ") ^ i8) * 3;
                        i5 = ((iM559710 ^ i7) * (-19251)) ^ 1211131445;
                        s2 = s2;
                        i10 = iM559710 ^ (-652357928);
                    }
                    i9 = i5;
                    c18108 = c18107;
                    break;
                case 108391774:
                case 816232123:
                    i11++;
                    iM55681 = C0946.m55979("᩻ۗ") ^ i7;
                    i3 = ((iM55681 ^ i8) * (-4681)) ^ (-468596042);
                    i4 = 598627904;
                    short s19 = s2;
                    i10 = iM55681 ^ i4;
                    i9 = i3;
                    s2 = s19;
                    break;
                case 108780927:
                case 1517669321:
                    s2 = s2;
                    if (C1194.m56396() <= 0) {
                        iM55681 = (C0946.m55979("֫ܶ") + i8) * (-7);
                        i3 = ((iM55681 ^ i7) * 10961) ^ 663057180;
                        i4 = 386321200;
                    } else {
                        iM55681 = C0873.m55680("ᩳ᩸") ^ i7;
                        i3 = ((iM55681 ^ i8) * (-29631)) ^ (-712133226);
                        i4 = 1015404601;
                    }
                    short s110 = s2;
                    i10 = iM55681 ^ i4;
                    i9 = i3;
                    s2 = s110;
                    break;
                case 210597224:
                case 806675160:
                    C0861.m55626();
                    C0947.m55997();
                    iM55680 = C0873.m55680("ܿ֡") ^ i7;
                    i = ((iM55680 ^ i8) * (-9493)) ^ (-1123235688);
                    i2 = 647510107;
                    i10 = iM55680 ^ i2;
                    i9 = i;
                    break;
                case 314898225:
                case 1219665558:
                    C0890.m55740();
                    C0898.m55800();
                    return;
                case 389507795:
                case 1624778605:
                    if (C0894.f81854 < 0) {
                        iM55680 = C0873.m55680("ܿ֡") ^ i7;
                        i = ((iM55680 ^ i8) * (-9493)) ^ (-1123235688);
                        i2 = 647510107;
                    } else {
                        iM55680 = C0873.m55680("ۛ֨") ^ i8;
                        i = ((iM55680 ^ i7) * 13167) ^ (-494782033);
                        i2 = 1652449813;
                    }
                    i10 = iM55680 ^ i2;
                    i9 = i;
                    break;
                case 576845624:
                case 2017300259:
                    s2 = s2;
                    AbstractC18422 abstractC18423 = (AbstractC18422) c13746M26103.get(i11);
                    try {
                        z = abstractC18423 instanceof C7280;
                        int iM559711 = (i7 - C0946.m55979("ۚ۟")) * (-73);
                        s2 = s2;
                        i10 = iM559711 ^ 1482122042;
                        i9 = ((iM559711 ^ i8) * (-6097)) ^ (-979531854);
                        abstractC18422 = abstractC18423;
                    } catch (Throwable th3) {
                        th = th3;
                        abstractC18422 = abstractC18423;
                        iM55681 = (i8 - C0873.m55680("ܶܶ")) * (-111);
                        i3 = ((iM55681 ^ i7) * (-21377)) ^ 1513799763;
                        i4 = 1239355635;
                        short s111 = s2;
                        i10 = iM55681 ^ i4;
                        i9 = i3;
                        s2 = s111;
                    }
                    break;
                case 625183900:
                case 868028182:
                    C1028.m56247();
                    if (C0877.f81843 >= 0) {
                        iM55680 = C0873.m55680("֡᩹") ^ i7;
                        i = ((iM55680 ^ i8) * 29003) ^ 533395827;
                        i2 = 594250499;
                        i10 = iM55680 ^ i2;
                        i9 = i;
                    } else {
                        s2 = s2;
                        iM55681 = (i8 - C0946.m55979("ۗܿ")) * (-31);
                        i3 = ((iM55681 ^ i7) * 30641) ^ 689256871;
                        i4 = 1626798007;
                        short s112 = s2;
                        i10 = iM55681 ^ i4;
                        i9 = i3;
                        s2 = s112;
                    }
                    break;
                case 731201419:
                case 1878078280:
                    try {
                        s2 = s2;
                        try {
                            c7280.mo37385(C0861.m55618(f82953, 385, 1, i12));
                            c18107.m41242().m26069(c18108, i11, true);
                            iM55682 = C0873.m55680("ܶ᩶") ^ i8;
                            i = ((iM55682 ^ i7) * (-10735)) ^ (-1841011098);
                            i6 = -451030510;
                            int i17 = iM55682 ^ i6;
                            s2 = s2;
                            i10 = i17;
                            i9 = i;
                        } catch (Throwable th4) {
                            th = th4;
                            th = th;
                            iM55681 = (i8 - C0873.m55680("ܶܶ")) * (-111);
                            i3 = ((iM55681 ^ i7) * (-21377)) ^ 1513799763;
                            i4 = 1239355635;
                            short s113 = s2;
                            i10 = iM55681 ^ i4;
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
                    RunnableC0938.m55927(c13746M26103);
                    if (C1012.f81938 < 0) {
                        C1053.m56329(new C24988(abstractC17043, c18108, strM56086));
                        return;
                    }
                    iM55681 = (C0946.m55979("֫ܶ") + i8) * (-7);
                    i3 = ((iM55681 ^ i7) * 10961) ^ 663057180;
                    i4 = 386321200;
                    short s114 = s2;
                    i10 = iM55681 ^ i4;
                    i9 = i3;
                    s2 = s114;
                    break;
                    break;
                case 1225099772:
                case 1479579561:
                    if (C0946.f81894 == 0) {
                        s2 = s2;
                        iM55681 = (C0946.m55979("֫ܶ") + i8) * (-7);
                        i3 = ((iM55681 ^ i7) * 10961) ^ 663057180;
                        i4 = 386321200;
                        short s115 = s2;
                        i10 = iM55681 ^ i4;
                        i9 = i3;
                        s2 = s115;
                    } else {
                        iM55680 = C0946.m55979("۫ܰ") ^ i7;
                        i = ((iM55680 ^ i8) * 7557) ^ 9826470;
                        i2 = 1020093795;
                        i10 = iM55680 ^ i2;
                        i9 = i;
                    }
                    break;
                case 1261519908:
                case 1526844994:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = (i8 - C0946.m55979("ۖ᩻")) * (-85);
                        i = ((iM55680 ^ i7) * (-12717)) ^ (-824341941);
                        i2 = 626875023;
                    } else {
                        iM55680 = C0946.m55979("۫ܰ") ^ i7;
                        i = ((iM55680 ^ i8) * 7557) ^ 9826470;
                        i2 = 1020093795;
                    }
                    i10 = iM55680 ^ i2;
                    i9 = i;
                    break;
                case 1330002282:
                case 1617216647:
                    s2 = s2;
                    if (zM55806) {
                        iM55682 = (C0946.m55979("ᩴܺ") ^ i7) * (-39);
                        i = ((iM55682 ^ i8) * 15277) ^ 1568225526;
                        i6 = 1786053238;
                    } else {
                        iM55682 = C0946.m55979("ܺۚ") ^ i8;
                        i = ((iM55682 ^ i7) * (-32021)) ^ (-1494513712);
                        i6 = -981169460;
                    }
                    int i18 = iM55682 ^ i6;
                    s2 = s2;
                    i10 = i18;
                    i9 = i;
                    break;
                case 1902681190:
                case 2060264787:
                    i12 = 59457;
                    iM55681 = C0946.m55979("ۧܰ") ^ i7;
                    i3 = ((iM55681 ^ i8) * (-15369)) ^ 312906015;
                    i4 = -1986912297;
                    short s116 = s2;
                    i10 = iM55681 ^ i4;
                    i9 = i3;
                    s2 = s116;
                    break;
                case 2013271749:
                case 2048476899:
                    s2 = s2;
                    C7280 c7281 = (C7280) abstractC18422;
                    try {
                        zM55806 = C0906.m55806(strM56086, c7281.m16734());
                        int iM55687 = C0873.m55680("ᩳ۠") ^ i8;
                        s2 = s2;
                        i10 = iM55687 ^ (-1167599312);
                        i9 = ((iM55687 ^ i7) * 32237) ^ (-1544366745);
                        c7280 = c7281;
                    } catch (Throwable th6) {
                        th = th6;
                        c7280 = c7281;
                        iM55681 = (i8 - C0873.m55680("ܶܶ")) * (-111);
                        i3 = ((iM55681 ^ i7) * (-21377)) ^ 1513799763;
                        i4 = 1239355635;
                        short s117 = s2;
                        i10 = iM55681 ^ i4;
                        i9 = i3;
                        s2 = s117;
                    }
                    break;
                default:
                    s2 = s2;
                    if (i11 < size) {
                        iM55681 = (i8 - C0946.m55979("ۖ᩺")) * 67;
                        i3 = ((iM55681 ^ i7) * (-32469)) ^ (-886975520);
                        i4 = 92350049;
                    } else {
                        iM55681 = C0873.m55680("۫᩷") ^ i7;
                        i3 = ((iM55681 ^ i8) * (-31081)) ^ 1375176203;
                        i4 = 14013045;
                    }
                    short s118 = s2;
                    i10 = iM55681 ^ i4;
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
    /* JADX INFO: renamed from: ֫ */
    public static void m47297(List list, int i, C18107 c18107, Main main, InterfaceC19370 interfaceC19370) {
        int iM55680;
        int i2;
        int i3;
        int iM55979;
        int i4;
        short[] sArr;
        int i5;
        int iM559710;
        int i6;
        int i7;
        int iM55681;
        int i8;
        int i9;
        int i10;
        Class cls;
        list = list;
        int i11 = i;
        c18107 = c18107;
        boolean z = false;
        int i12 = 0;
        Intent intent = null;
        Class cls2 = null;
        AbstractC17043 abstractC17043M27644 = null;
        String strM55652 = null;
        int i13 = 0;
        int i14 = 1411170120;
        int i15 = C1012.f81938;
        int i16 = C1071.f81975;
        int iM55682 = (C0873.m55680("ۚ֡") ^ i16) * 63;
        int i17 = ((iM55682 ^ i15) * 22165) ^ 574098682;
        int i18 = iM55682 ^ (-613103826);
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i19 = 0;
        char c = 0;
        int i20 = 0;
        int i21 = 0;
        Iterator itM55925 = null;
        int i22 = 0;
        short[] sArr4 = null;
        int i23 = 0;
        while (true) {
            i14 = i18 ^ (i17 & (((i14 ^ i15) * 7395) >> 31));
            switch (i14) {
                case -2135962280:
                case 1509391479:
                    cls = ActivityC10218.class;
                    cls2 = cls;
                    iM55681 = (i16 - C0946.m55979("ᩳۡ")) * (-49);
                    i8 = ((iM55681 ^ i15) * 23413) ^ (-293656433);
                    i9 = -1462290804;
                    i18 = iM55681 ^ i9;
                    list = list;
                    i17 = i8;
                    i22 = i22;
                    c18107 = c18107;
                    break;
                case -2119824998:
                case 924285448:
                    short[] sArr5 = sArr2;
                    i5 = i22;
                    intent.setAction(C1025.m56233(sArr5, i5, i19, i13));
                    abstractC17043M27644 = ((C12073) C1929.m56563(list, i12)).m27644();
                    if (RunnableC0938.f81886 < 0) {
                        int iM55683 = C0873.m55680("֡ܳ") ^ i16;
                        i18 = iM55683 ^ (-1672170384);
                        i17 = ((iM55683 ^ i15) * 29603) ^ 686796472;
                        sArr2 = sArr5;
                        i22 = i5;
                        list = list;
                        c18107 = c18107;
                    } else {
                        sArr2 = sArr5;
                        iM559710 = C0946.m55979("᩸ۗ") ^ i16;
                        i6 = ((iM559710 ^ i15) * 28791) ^ (-1417385331);
                        i7 = -1090434782;
                        i18 = iM559710 ^ i7;
                        i17 = i6;
                        i22 = i5;
                        i11 = i;
                    }
                    break;
                case -2055750671:
                case -1200659308:
                    i22 = i22;
                    if (C0930.m55886(itM55925)) {
                        iM55681 = C0873.m55680("ܿ֨") ^ i15;
                        i8 = ((iM55681 ^ i16) * 30265) ^ 2115114878;
                        i9 = 1571366716;
                    } else {
                        iM55681 = C0946.m55979("᩹ۙ") ^ i15;
                        i8 = ((iM55681 ^ i16) * (-22921)) ^ (-1536333619);
                        i9 = 1315346693;
                    }
                    i18 = iM55681 ^ i9;
                    list = list;
                    i17 = i8;
                    i22 = i22;
                    c18107 = c18107;
                    break;
                case -1890494484:
                case 103907635:
                    cls = ActivityC21269.class;
                    cls2 = cls;
                    iM55681 = (i16 - C0946.m55979("ᩳۡ")) * (-49);
                    i8 = ((iM55681 ^ i15) * 23413) ^ (-293656433);
                    i9 = -1462290804;
                    i18 = iM55681 ^ i9;
                    list = list;
                    i17 = i8;
                    i22 = i22;
                    c18107 = c18107;
                    break;
                case -1871876296:
                case -1623996060:
                    sArr2 = f82953;
                    i22 = Primes.SMALL_FACTOR_LIMIT;
                    i19 = 26;
                    if (C0946.f81894 == 0) {
                        int iM55684 = C0873.m55680("۠ۢ") ^ i16;
                        i10 = ((iM55684 ^ i15) * 32567) ^ 251008212;
                        i18 = iM55684 ^ (-1491268776);
                        list = list;
                        i17 = i10;
                        c18107 = c18107;
                    } else {
                        int iM559711 = C0946.m55979("ۘᩴ") ^ i15;
                        i18 = iM559711 ^ (-40931155);
                        i17 = ((iM559711 ^ i16) * 23353) ^ (-1853012286);
                        i11 = i;
                    }
                    break;
                case -1828896057:
                case -1380718490:
                    i5 = i22;
                    if (C0898.f81858 <= 0) {
                        iM559710 = C0946.m55979("᩸ۗ") ^ i16;
                        i6 = ((iM559710 ^ i15) * 28791) ^ (-1417385331);
                        i7 = -1090434782;
                    } else {
                        iM559710 = (i16 - C0946.m55979("ᩴۙ")) * 43;
                        i6 = ((iM559710 ^ i15) * 16871) ^ (-684757638);
                        i7 = 1122659933;
                    }
                    i18 = iM559710 ^ i7;
                    i17 = i6;
                    i22 = i5;
                    i11 = i;
                    break;
                case -1715884867:
                case 176255265:
                    if (RunnableC0871.f81839 < 0) {
                        iM55680 = C0873.m55680("ۜۘ") ^ i16;
                        i2 = ((iM55680 ^ i15) * 7065) ^ (-1578150828);
                        i3 = -1085610389;
                        i18 = iM55680 ^ i3;
                        i17 = i2;
                    } else {
                        int iM559712 = C0946.m55979("ۘᩴ") ^ i15;
                        i18 = iM559712 ^ (-40931155);
                        i17 = ((iM559712 ^ i16) * 23353) ^ (-1853012286);
                        i11 = i;
                    }
                    break;
                case -1712200745:
                case -86534665:
                    if (ViewOnClickListenerC0939.m55941() >= 0) {
                        int iM559713 = C0946.m55979("ۘᩴ") ^ i15;
                        i18 = iM559713 ^ (-40931155);
                        i17 = ((iM559713 ^ i16) * 23353) ^ (-1853012286);
                        i11 = i;
                    } else {
                        int iM55685 = C0873.m55680("ۗ۠") ^ i15;
                        i10 = ((iM55685 ^ i16) * (-24407)) ^ 182644413;
                        i18 = iM55685 ^ (-1081024509);
                        i17 = i10;
                        c18107 = c18107;
                    }
                    break;
                case -1668149519:
                case 729351656:
                    if (i11 != 3) {
                        iM55680 = (i16 - C0946.m55979("۬ۡ")) * 127;
                        i2 = ((iM55680 ^ i15) * 30515) ^ (-1621018982);
                        i3 = -109828916;
                    } else {
                        iM55680 = C0873.m55680("ܶۤ") ^ i16;
                        i2 = ((iM55680 ^ i15) * (-13231)) ^ 1860611085;
                        i3 = 1505476873;
                    }
                    i18 = iM55680 ^ i3;
                    i17 = i2;
                    break;
                case -1490286692:
                case -83154592:
                    i13 = 52462;
                    iM55681 = (i16 - C0873.m55680("ܶۡ")) * (-105);
                    i8 = ((iM55681 ^ i15) * 14777) ^ (-1224834139);
                    i9 = 1683509263;
                    i18 = iM55681 ^ i9;
                    list = list;
                    i17 = i8;
                    i22 = i22;
                    c18107 = c18107;
                    break;
                case -1450323613:
                case -538852032:
                    intent.putExtra(strM55652, z);
                    m47294(intent, cls2, C1048.m56309(c18107));
                    C11245.m26044(interfaceC19370, 2000);
                    ServiceConnectionC1013.m56163(main, intent);
                    return;
                case -1382381332:
                case 1496430869:
                    strM55652 = C0866.m55652(sArr3, i23, 4, i13);
                    if (!RunnableC1014.m56177()) {
                        int iM55686 = C0873.m55680("ۗ۠") ^ i15;
                        i10 = ((iM55686 ^ i16) * (-24407)) ^ 182644413;
                        i18 = iM55686 ^ (-1081024509);
                        i17 = i10;
                        c18107 = c18107;
                    } else {
                        iM55979 = C0873.m55680("۟ۚ") ^ i16;
                        i2 = ((iM55979 ^ i15) * 21597) ^ 1207034020;
                        i4 = -111493029;
                        i18 = iM55979 ^ i4;
                        c18107 = c18107;
                        i17 = i2;
                    }
                    break;
                case -1329792092:
                case -810450695:
                    if (i11 == 4) {
                        iM55680 = (C0946.m55979("ۢ᩵") + i16) * 83;
                        i2 = ((iM55680 ^ i15) * 7549) ^ 1731852428;
                        i3 = -870716761;
                    } else {
                        iM55680 = C0946.m55979("ۤۙ") ^ i15;
                        i2 = ((iM55680 ^ i16) * 17421) ^ (-1224070174);
                        i3 = 1108717018;
                    }
                    i18 = iM55680 ^ i3;
                    i17 = i2;
                    break;
                case -1323441293:
                case 1714538968:
                    if (C0946.f81894 != 0) {
                        int iM55687 = C0873.m55680("ۗ۠") ^ i15;
                        i10 = ((iM55687 ^ i16) * (-24407)) ^ 182644413;
                        i18 = iM55687 ^ (-1081024509);
                        i17 = i10;
                        c18107 = c18107;
                    } else {
                        iM55680 = (C0873.m55680("۠᩹") + i15) * 77;
                        i2 = ((iM55680 ^ i16) * (-23475)) ^ 866763620;
                        i3 = 1356029171;
                        i18 = iM55680 ^ i3;
                        i17 = i2;
                    }
                    break;
                case -1253612744:
                case -76416595:
                    i22 = i22;
                    z = true;
                    i12 = 0;
                    if (i11 != 0) {
                        iM55681 = C0946.m55979("ܽ᩺") ^ i15;
                        i8 = ((iM55681 ^ i16) * 15053) ^ 1956269237;
                        i9 = -1557044491;
                    } else {
                        iM55681 = (C0946.m55979("ۧܶ") + i16) * (-119);
                        i8 = ((iM55681 ^ i15) * 25569) ^ 1656328944;
                        i9 = -1043063156;
                    }
                    i18 = iM55681 ^ i9;
                    list = list;
                    i17 = i8;
                    i22 = i22;
                    c18107 = c18107;
                    break;
                case -1158684926:
                case 692340468:
                    intent.setData(abstractC17043M27644.m38680());
                    sArr3 = f82953;
                    i23 = 237;
                    if (C0906.f81862 < 0) {
                        iM55979 = (i15 - C0946.m55979("ۘ᩸")) * 97;
                        i2 = ((iM55979 ^ i16) * 17049) ^ (-2130958863);
                        i4 = -982669667;
                        i18 = iM55979 ^ i4;
                        c18107 = c18107;
                        i17 = i2;
                    } else {
                        sArr = sArr2;
                        i22 = i22;
                        iM55681 = (i16 - C0873.m55680("ۢۙ")) * (-59);
                        sArr2 = sArr;
                        i8 = ((iM55681 ^ i15) * (-19607)) ^ (-559391002);
                        i9 = -1543796450;
                        i18 = iM55681 ^ i9;
                        list = list;
                        i17 = i8;
                        i22 = i22;
                        c18107 = c18107;
                    }
                    break;
                case -1153181482:
                case 176447938:
                    ServiceConnectionC1013.m56157();
                    iM55680 = (C0873.m55680("۠᩹") + i15) * 77;
                    i2 = ((iM55680 ^ i16) * (-23475)) ^ 866763620;
                    i3 = 1356029171;
                    i18 = iM55680 ^ i3;
                    i17 = i2;
                    break;
                case -1082365805:
                case 1048553506:
                    sArr = sArr2;
                    i22 = i22;
                    intent = new Intent(main, (Class<?>) cls2);
                    C0927.m55875(intent, 268435456);
                    if (C0949.m56012()) {
                        iM55681 = (i16 - C0873.m55680("ۢۙ")) * (-59);
                        sArr2 = sArr;
                        i8 = ((iM55681 ^ i15) * (-19607)) ^ (-559391002);
                        i9 = -1543796450;
                    } else {
                        sArr2 = sArr;
                        iM55681 = (i15 - C0946.m55979("ۡ᩷")) * 31;
                        i8 = ((iM55681 ^ i16) * 13799) ^ (-1274883842);
                        i9 = 2100784630;
                    }
                    i18 = iM55681 ^ i9;
                    list = list;
                    i17 = i8;
                    i22 = i22;
                    c18107 = c18107;
                    break;
                case -1008079980:
                case 99072233:
                    i5 = i22;
                    sArr4 = f82953;
                    c = 210;
                    if (C0854.f81826 != 0) {
                        iM559710 = C0946.m55979("᩸ۗ") ^ i16;
                        i6 = ((iM559710 ^ i15) * 28791) ^ (-1417385331);
                        i7 = -1090434782;
                    } else {
                        iM559710 = C0873.m55680("ۘܽ") ^ i15;
                        i6 = ((iM559710 ^ i16) * (-12813)) ^ 464667421;
                        i7 = 1854605508;
                    }
                    i18 = iM559710 ^ i7;
                    i17 = i6;
                    i22 = i5;
                    i11 = i;
                    break;
                case -994196003:
                case -838908592:
                    i5 = i22;
                    if (C0866.f81837 >= 0) {
                        iM559710 = C0946.m55979("᩸ۗ") ^ i16;
                        i6 = ((iM559710 ^ i15) * 28791) ^ (-1417385331);
                        i7 = -1090434782;
                    } else {
                        iM559710 = C0946.m55979("֡ۖ") ^ i15;
                        i6 = ((iM559710 ^ i16) * 6603) ^ 148942974;
                        i7 = 669625530;
                    }
                    i18 = iM559710 ^ i7;
                    i17 = i6;
                    i22 = i5;
                    i11 = i;
                    break;
                case -826993272:
                case 1400040407:
                    i5 = i22;
                    if (C0898.m55800() > 0) {
                        iM559710 = C0946.m55979("ᩳ֫") ^ i16;
                        i6 = ((iM559710 ^ i15) * 18735) ^ 1462765597;
                        i7 = -502979963;
                        i18 = iM559710 ^ i7;
                        i17 = i6;
                        i22 = i5;
                        i11 = i;
                    } else {
                        i22 = i5;
                        int iM559714 = C0946.m55979("ۘᩴ") ^ i15;
                        i18 = iM559714 ^ (-40931155);
                        i17 = ((iM559714 ^ i16) * 23353) ^ (-1853012286);
                        i11 = i;
                    }
                    break;
                case -610301815:
                case -7511229:
                    i5 = i22;
                    short s = sArr4[c];
                    int i24 = s * 18188;
                    i21 = s * s;
                    if (C0946.m55980() == 0) {
                        int iM559715 = C0946.m55979("ۡ۠") ^ i16;
                        int i25 = ((iM559715 ^ i15) * (-7439)) ^ (-590473991);
                        i18 = iM559715 ^ 1772562391;
                        list = list;
                        i17 = i25;
                        i20 = i24;
                        i22 = i5;
                        i11 = i;
                        c18107 = c18107;
                    } else {
                        i20 = i24;
                        iM559710 = C0946.m55979("᩸ۗ") ^ i16;
                        i6 = ((iM559710 ^ i15) * 28791) ^ (-1417385331);
                        i7 = -1090434782;
                        i18 = iM559710 ^ i7;
                        i17 = i6;
                        i22 = i5;
                        i11 = i;
                    }
                    break;
                case -548694668:
                case 1066450283:
                    cls2 = ActivityC17874.class;
                    iM55681 = (i16 - C0946.m55979("ᩳۡ")) * (-49);
                    i8 = ((iM55681 ^ i15) * 23413) ^ (-293656433);
                    i9 = -1462290804;
                    i18 = iM55681 ^ i9;
                    list = list;
                    i17 = i8;
                    i22 = i22;
                    c18107 = c18107;
                    break;
                case -464016625:
                case 1218168089:
                    C0861.m55626();
                    if (C1048.m56305() >= 0) {
                        sArr = sArr2;
                        i22 = i22;
                        iM55681 = (i16 - C0873.m55680("ۢۙ")) * (-59);
                        sArr2 = sArr;
                        i8 = ((iM55681 ^ i15) * (-19607)) ^ (-559391002);
                        i9 = -1543796450;
                        i18 = iM55681 ^ i9;
                        list = list;
                        i17 = i8;
                        i22 = i22;
                        c18107 = c18107;
                    } else {
                        iM55680 = (C0873.m55680("۠᩹") + i15) * 77;
                        i2 = ((iM55680 ^ i16) * (-23475)) ^ 866763620;
                        i3 = 1356029171;
                        i18 = iM55680 ^ i3;
                        i17 = i2;
                    }
                    break;
                case -396718474:
                case 1327244552:
                    i22 = i22;
                    if (i20 - (i21 + 82700836) <= 0) {
                        iM55681 = C0946.m55979("ۤ᩵") ^ i15;
                        i8 = ((iM55681 ^ i16) * (-12621)) ^ (-35101803);
                        i9 = -768376415;
                    } else {
                        iM55681 = (C0873.m55680("۠ۛ") + i15) * (-87);
                        i8 = ((iM55681 ^ i16) * 4555) ^ (-357263019);
                        i9 = -1899926917;
                    }
                    i18 = iM55681 ^ i9;
                    list = list;
                    i17 = i8;
                    i22 = i22;
                    c18107 = c18107;
                    break;
                case -390227363:
                case 794225146:
                    ((C12073) C0955.m56035(itM55925)).m27641();
                    iM55681 = (i16 - C0873.m55680("ܽ۠")) * 67;
                    i8 = ((iM55681 ^ i15) * (-7383)) ^ (-835470574);
                    i9 = -1702780637;
                    i18 = iM55681 ^ i9;
                    list = list;
                    i17 = i8;
                    i22 = i22;
                    c18107 = c18107;
                    break;
                case -150918521:
                case 1404977564:
                    throw new RuntimeException();
                case 195104972:
                case 2130770343:
                    C10636.m24455(c18107, ((C12073) C1929.m56563(list, i12)).m27644());
                    return;
                case 371573504:
                case 1692750020:
                    i22 = i22;
                    if (i11 != z) {
                        iM55681 = (C0873.m55680("ۘ۫") ^ i15) * 83;
                        i8 = ((iM55681 ^ i16) * (-4265)) ^ (-1728331009);
                        i9 = -504561320;
                    } else {
                        iM55681 = (i15 - C0946.m55979("ۨۤ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = ((iM55681 ^ i16) * 32509) ^ (-1518577237);
                        i9 = 64780364;
                    }
                    i18 = iM55681 ^ i9;
                    list = list;
                    i17 = i8;
                    i22 = i22;
                    c18107 = c18107;
                    break;
                case 377060986:
                case 2030597420:
                    itM55925 = RunnableC0938.m55925(list);
                    iM55681 = (i16 - C0873.m55680("ܽ۠")) * 67;
                    i8 = ((iM55681 ^ i15) * (-7383)) ^ (-835470574);
                    i9 = -1702780637;
                    i18 = iM55681 ^ i9;
                    list = list;
                    i17 = i8;
                    i22 = i22;
                    c18107 = c18107;
                    break;
                case 666116350:
                case 1086761011:
                    C1964.m56597();
                    return;
                case 1127158542:
                case 1799822975:
                    C10636.m24454(c18107, ((C12073) C1929.m56563(list, i12)).m27644());
                    return;
                case 1684771350:
                case 1730620056:
                    i13 = 25138;
                    iM55681 = (i16 - C0873.m55680("ܶۡ")) * (-105);
                    i8 = ((iM55681 ^ i15) * 14777) ^ (-1224834139);
                    i9 = 1683509263;
                    i18 = iM55681 ^ i9;
                    list = list;
                    i17 = i8;
                    i22 = i22;
                    c18107 = c18107;
                    break;
                default:
                    if (i11 != 2) {
                        iM55680 = (i15 - C0873.m55680("ܶᩴ")) * 61;
                        i2 = ((iM55680 ^ i16) * 1527) ^ 1886375735;
                        i3 = 250028778;
                    } else {
                        iM55680 = C0946.m55979("ۡ᩻") ^ i16;
                        i2 = ((iM55680 ^ i15) * 21591) ^ 920706817;
                        i3 = 545960009;
                    }
                    i18 = iM55680 ^ i3;
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
    
        if (p067l.C0912.f81867 <= 0) goto L15;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m47303(C18107 c18107, InterfaceC19370 interfaceC19370, AbstractC17043 abstractC17043) {
        int iM55680;
        int i;
        int i2;
        short s;
        Main main;
        int i3 = C1003.f81929;
        int i4 = C0866.f81837;
        int iM55979 = C0946.m55979("᩶۬") ^ i3;
        int i5 = ((iM55979 ^ i4) * 10113) ^ (-1399379309);
        String strM55773 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM55979 ^ (-702935226);
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = -11409739;
        short s2 = 0;
        Uri uriM38680 = null;
        short[] sArr3 = null;
        int i12 = 0;
        String strM56252 = null;
        Class<ActivityC17874> cls = null;
        Intent intent = null;
        Main mainM56560 = null;
        while (true) {
            i11 = i6 ^ (i5 & (((i11 ^ i4) * (-5653)) >> 31));
            switch (i11) {
                case -2144570222:
                case -1633395489:
                    i12 = 8136;
                    iM55680 = (i3 - C0946.m55979("ۛ۫")) * (-31);
                    i = ((iM55680 ^ i4) * (-11615)) ^ (-394050936);
                    i2 = -118375889;
                    main = mainM56560;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    mainM56560 = main;
                    break;
                case -1967238231:
                case -1795981753:
                    mainM56560 = mainM56560;
                    s2 = sArr[352];
                    if (C1025.m56230()) {
                        iM55680 = C0946.m55979("֫ۖ") ^ i4;
                        i = ((iM55680 ^ i3) * (-9323)) ^ (-1250492398);
                        i2 = -1419289950;
                    } else {
                        iM55680 = C0873.m55680("᩷ܺ") ^ i4;
                        i = ((iM55680 ^ i3) * (-14131)) ^ 1583787288;
                        i2 = 1045772886;
                    }
                    main = mainM56560;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    mainM56560 = main;
                    break;
                case -1869863827:
                case 253974789:
                    C1024.m56209();
                    if (C0917.f81868) {
                        mainM56560 = mainM56560;
                        s = s2;
                        int iM559710 = C0946.m55979("ۧ֫") ^ i3;
                        s2 = s;
                        i5 = ((iM559710 ^ i4) * 7233) ^ (-1376410782);
                        main = mainM56560;
                        i6 = iM559710 ^ 1071626125;
                        mainM56560 = main;
                    }
                    iM55680 = C0946.m55979("ᩳ᩺") ^ i3;
                    mainM56560 = mainM56560;
                    i = ((iM55680 ^ i4) * (-18519)) ^ (-2055848471);
                    i2 = 1899861853;
                    main = mainM56560;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    mainM56560 = main;
                    break;
                case -1829581475:
                case -1592738341:
                    mainM56560 = mainM56560;
                    if (i8 - (91298025 + i9) <= 0) {
                        iM55680 = (C0873.m55680("ᩴ᩷") ^ i3) * (-5);
                        i = ((iM55680 ^ i4) * 8899) ^ (-1949746562);
                        i2 = 1426345408;
                    } else {
                        iM55680 = (C0946.m55979("ۢۘ") ^ i4) * (-71);
                        i = ((iM55680 ^ i3) * 22649) ^ 544508976;
                        i2 = -1660362785;
                    }
                    main = mainM56560;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    mainM56560 = main;
                    break;
                case -1742307240:
                case 1950661162:
                    RunnableC0897.m55784();
                    C0906.m55809();
                    break;
                case -939016907:
                case -86485057:
                    mainM56560 = mainM56560;
                    C0882.m55721(intent, 268435456);
                    sArr3 = f82953;
                    if (C0890.f81849 != 0) {
                        mainM56560 = mainM56560;
                        iM55680 = C0946.m55979("ᩳ᩺") ^ i3;
                        mainM56560 = mainM56560;
                        i = ((iM55680 ^ i4) * (-18519)) ^ (-2055848471);
                        i2 = 1899861853;
                    } else {
                        iM55680 = C0873.m55680("۬ۧ") ^ i3;
                        i = ((iM55680 ^ i4) * 12187) ^ 1073661391;
                        i2 = 618731983;
                    }
                    main = mainM56560;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    mainM56560 = main;
                    break;
                case -851455883:
                case 2017564620:
                    C1024.m56209();
                    break;
                case -794967789:
                case 1101164537:
                    mainM56560 = mainM56560;
                    intent.setData(uriM38680);
                    sArr2 = f82953;
                    i10 = 379;
                    i7 = 5;
                    if (C0967.f81910 >= 0) {
                        iM55680 = (i4 - C0873.m55680("ܶܿ")) * (-115);
                        i = ((iM55680 ^ i3) * 31045) ^ 1787625194;
                        i2 = -861187593;
                    } else {
                        iM55680 = C0873.m55680("ܿ֫") ^ i3;
                        i = ((iM55680 ^ i4) * 16005) ^ 1992155276;
                        i2 = -100256702;
                    }
                    main = mainM56560;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    mainM56560 = main;
                    break;
                case -662730138:
                case 179725481:
                    mainM56560 = mainM56560;
                    strM55773 = C0894.m55773(sArr2, i10, i7, i12);
                    z = true;
                    if (C1036.f81953 < 0) {
                        iM55680 = C0946.m55979("ۘۢ") ^ i4;
                        i = ((iM55680 ^ i3) * (-22161)) ^ (-1216037022);
                        i2 = -2000149331;
                        main = mainM56560;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                        mainM56560 = main;
                    }
                    s = s2;
                    int iM559711 = C0946.m55979("ۧ֫") ^ i3;
                    s2 = s;
                    i5 = ((iM559711 ^ i4) * 7233) ^ (-1376410782);
                    main = mainM56560;
                    i6 = iM559711 ^ 1071626125;
                    mainM56560 = main;
                    break;
                case -512403466:
                case -473977914:
                    mainM56560 = mainM56560;
                    s = s2;
                    i8 = s * 19110;
                    i9 = s * s;
                    if (C0877.f81843 >= 0) {
                        int iM559712 = C0946.m55979("ۧ֫") ^ i3;
                        s2 = s;
                        i5 = ((iM559712 ^ i4) * 7233) ^ (-1376410782);
                        main = mainM56560;
                        i6 = iM559712 ^ 1071626125;
                    } else {
                        s2 = s;
                        iM55680 = C0873.m55680("ܰ᩶") ^ i4;
                        i = ((iM55680 ^ i3) * 10209) ^ (-1149671157);
                        i2 = 1305567768;
                        main = mainM56560;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                    }
                    mainM56560 = main;
                    break;
                case -348009596:
                case 731473879:
                    mainM56560 = C1929.m56560(c18107);
                    cls = ActivityC17874.class;
                    intent = new Intent(mainM56560, cls);
                    if (C0992.f81922 >= 0) {
                        iM55680 = C0946.m55979("ᩳ᩺") ^ i3;
                        mainM56560 = mainM56560;
                        i = ((iM55680 ^ i4) * (-18519)) ^ (-2055848471);
                        i2 = 1899861853;
                    } else {
                        iM55680 = (i4 - C0946.m55979("ᩴ۫")) * (-85);
                        mainM56560 = mainM56560;
                        i = ((iM55680 ^ i3) * 169) ^ 340018886;
                        i2 = 575715377;
                    }
                    main = mainM56560;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    mainM56560 = main;
                    break;
                case -215909716:
                case 497431617:
                    C0992.m56107();
                    if (C1229.m56410() != 0) {
                        mainM56560 = mainM56560;
                        iM55680 = C0946.m55979("֫ۖ") ^ i4;
                        i = ((iM55680 ^ i3) * (-9323)) ^ (-1250492398);
                        i2 = -1419289950;
                        main = mainM56560;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                        mainM56560 = main;
                    } else {
                        int iM55681 = (C0873.m55680("ۚۤ") + i4) * 51;
                        i6 = iM55681 ^ (-1190526430);
                        i5 = ((iM55681 ^ i3) * (-19525)) ^ (-1322627396);
                    }
                    break;
                case -195007464:
                case 434260054:
                    mainM56560 = mainM56560;
                    sArr = f82953;
                    if (C0912.m55833()) {
                        iM55680 = (i4 - C0873.m55680("ܶܿ")) * (-115);
                        i = ((iM55680 ^ i3) * 31045) ^ 1787625194;
                        i2 = -861187593;
                    } else {
                        iM55680 = C0873.m55680("᩵ᩳ") ^ i3;
                        i = ((iM55680 ^ i4) * (-10757)) ^ 1993647321;
                        i2 = -1463532193;
                    }
                    main = mainM56560;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    mainM56560 = main;
                    break;
                case 64343913:
                case 110739625:
                    i12 = 31867;
                    iM55680 = (i3 - C0946.m55979("ۛ۫")) * (-31);
                    i = ((iM55680 ^ i4) * (-11615)) ^ (-394050936);
                    i2 = -118375889;
                    main = mainM56560;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    mainM56560 = main;
                    break;
                case 110664924:
                case 735830947:
                    mainM56560 = mainM56560;
                    strM56252 = C1036.m56252(sArr3, 353, 26, i12);
                    if (RunnableC0897.m55784()) {
                        iM55680 = C0946.m55979("֫ۖ") ^ i4;
                        i = ((iM55680 ^ i3) * (-9323)) ^ (-1250492398);
                        i2 = -1419289950;
                    } else {
                        iM55680 = C0946.m55979("ܺ֫") ^ i3;
                        i = ((iM55680 ^ i4) * 12673) ^ 1104640446;
                        i2 = 1832121329;
                    }
                    main = mainM56560;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    mainM56560 = main;
                    break;
                case 303128142:
                case 957899548:
                    C11245.m26044(interfaceC19370, 2000);
                    C1044.m56284(mainM56560, intent);
                    break;
                case 446064471:
                case 1397195090:
                    RunnableC1014.m56177();
                    mainM56560 = mainM56560;
                    iM55680 = C0946.m55979("֫ۖ") ^ i4;
                    i = ((iM55680 ^ i3) * (-9323)) ^ (-1250492398);
                    i2 = -1419289950;
                    main = mainM56560;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    mainM56560 = main;
                    break;
                case 464623817:
                case 1475062180:
                    intent.putExtra(strM55773, z);
                    m47294(intent, cls, C1048.m56309(c18107));
                    if (C0894.f81854 >= 0) {
                        mainM56560 = mainM56560;
                        iM55680 = (i4 - C0873.m55680("ܶܿ")) * (-115);
                        i = ((iM55680 ^ i3) * 31045) ^ 1787625194;
                        i2 = -861187593;
                    } else {
                        iM55680 = C0873.m55680("ܳ᩶") ^ i3;
                        mainM56560 = mainM56560;
                        i = ((iM55680 ^ i4) * (-3343)) ^ (-1574998502);
                        i2 = 459391703;
                    }
                    main = mainM56560;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    mainM56560 = main;
                    break;
                default:
                    mainM56560 = mainM56560;
                    intent.setAction(strM56252);
                    uriM38680 = abstractC17043.m38680();
                    if (C0861.m55626()) {
                        iM55680 = (i4 - C0873.m55680("ܶܿ")) * (-115);
                        i = ((iM55680 ^ i3) * 31045) ^ 1787625194;
                        i2 = -861187593;
                    } else {
                        iM55680 = C0946.m55979("ۗ۠") ^ i4;
                        i = ((iM55680 ^ i3) * (-13881)) ^ (-53678620);
                        i2 = 264130041;
                    }
                    main = mainM56560;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    mainM56560 = main;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x01ee  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x01c0, code lost:
    
        if (p067l.C1053.f81965 > 0) goto L20;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m47299(C18107 c18107, ArrayList arrayList, InterfaceC19370 interfaceC19370, DialogInterface dialogInterface, int i) {
        AbstractC15599 abstractC15599;
        int i2;
        String str;
        C20671 c20671;
        C20671 c20672;
        int i3;
        Main main;
        Main main2;
        int iM55680;
        int i4;
        short[] sArr;
        int i5;
        int i6;
        C20671 c20673;
        int i7;
        Main main3;
        short[] sArr2;
        Main main4;
        int i8;
        int i9;
        int iM55979;
        int i10;
        int iM55681;
        int i11;
        int i12;
        int iM559710;
        int i13;
        int i14;
        int iM55682;
        int i15;
        int i16;
        boolean z;
        String str2;
        C20671 c20674;
        short[] sArr3;
        int i17;
        int i18;
        C20671 c20675;
        int i19;
        int i20;
        Main main5;
        short[] sArr4;
        int iM559711;
        int iM559712;
        int i21;
        int i22;
        short[] sArr5;
        int i23;
        int i24;
        int i25;
        Main main6;
        short[] sArr6;
        int iM55683;
        int i26;
        int i27;
        boolean z2;
        short[] sArr7;
        int i28;
        int i29;
        int i30;
        Main main7;
        short[] sArr8;
        int iM55684;
        int i31;
        short[] sArr9;
        int iM559713;
        int i32;
        int i33;
        Main main8;
        short[] sArr10;
        int i34;
        C20671 c20676;
        short[] sArr11;
        int i35;
        int i36;
        Main main9;
        int i37;
        C20671 c20677;
        int iM559714;
        int i38;
        int i39;
        C20671 c20678;
        C20671 c20679;
        C20671 c206710;
        int iM559715;
        int i40;
        int i41;
        int iM55685;
        int i42;
        C18107 c18108 = c18107;
        boolean z3 = false;
        int i43 = 0;
        Object obj = null;
        int i44 = 0;
        int iM559716 = 0;
        int i45 = 0;
        int iM559717 = 0;
        int i46 = 0;
        int i47 = 0;
        int i48 = 0;
        int i49 = 0;
        int i50 = -473940687;
        int i51 = C1003.f81929;
        int i52 = C1025.f81947;
        int iM559718 = (i51 - C0946.m55979("۫ۨ")) * (-67);
        int i53 = ((iM559718 ^ i52) * 31653) ^ 711623127;
        int i54 = iM559718 ^ 1395232646;
        Integer num = null;
        String str3 = null;
        Main mainM56594 = null;
        C20671 c206711 = null;
        AbstractC15599 abstractC15599M41289 = null;
        C20671 c206712 = null;
        short[] sArr12 = null;
        short[] sArr13 = null;
        int iM559719 = 0;
        int iM559720 = 0;
        int i55 = 0;
        int i56 = 0;
        int iM559721 = 0;
        int i57 = 0;
        int i58 = 0;
        int i59 = 0;
        int i60 = 0;
        boolean zM56234 = false;
        short s = 0;
        int i61 = 0;
        int i62 = 0;
        int i63 = 0;
        Main main10 = null;
        int i64 = 0;
        Main mainM56595 = null;
        Main mainM56596 = null;
        while (true) {
            i50 = i54 ^ (i53 & (((i50 ^ i52) * 32671) >> 31));
            switch (i50) {
                case -2142770720:
                case 138779992:
                    if (C1194.f82045 != 0) {
                        iM55685 = (i52 - C0946.m55979("ۘ᩶")) * (-93);
                        i4 = ((iM55685 ^ i51) * (-11341)) ^ (-1699443458);
                        i42 = -1333316145;
                        i54 = iM55685 ^ i42;
                        i53 = i4;
                    } else {
                        i34 = i49;
                        c20676 = c206712;
                        i33 = i57;
                        main8 = mainM56594;
                        sArr10 = sArr13;
                        Main main11 = main10;
                        iM559721 = iM559721;
                        main4 = main11;
                        int iM55686 = C0873.m55680("ܽܶ") ^ i51;
                        int i65 = i34;
                        i8 = ((iM55686 ^ i52) * 23315) ^ (-1539519205);
                        i54 = iM55686 ^ 2063220037;
                        sArr13 = sArr10;
                        mainM56594 = main8;
                        i57 = i33;
                        abstractC15599M41289 = abstractC15599M41289;
                        i63 = i63;
                        i58 = i58;
                        c206712 = c20676;
                        i49 = i65;
                        c206711 = c206711;
                        str3 = str3;
                        i53 = i8;
                        int i66 = iM559721;
                        main10 = main4;
                        iM559721 = i66;
                    }
                    break;
                case -2013006872:
                case 688218960:
                    abstractC15599 = abstractC15599M41289;
                    i2 = iM559721;
                    Main main12 = main10;
                    str = str3;
                    c20671 = c206711;
                    c20672 = c206712;
                    i3 = i58;
                    int i67 = i57;
                    main = mainM56594;
                    mainM56595 = C1964.m56594(c18107);
                    if (!zM56234) {
                        main2 = main12;
                        iM55680 = i55;
                        int iM559722 = (i52 - C0946.m55979("ۛ۬")) * 11;
                        int i68 = iM55680;
                        int i69 = ((iM559722 ^ i51) * 2603) ^ 1229831923;
                        i54 = iM559722 ^ (-463003923);
                        i58 = i3;
                        mainM56594 = main;
                        c206712 = c20672;
                        i57 = i68;
                        c206711 = c20671;
                        str3 = str;
                        i53 = i69;
                        main10 = main2;
                        iM559721 = i2;
                        abstractC15599M41289 = abstractC15599;
                    } else {
                        int iM559723 = C0946.m55979("۠ۡ") ^ i51;
                        i4 = ((iM559723 ^ i52) * (-10879)) ^ 845299622;
                        i54 = iM559723 ^ (-1867469570);
                        main10 = main12;
                        mainM56594 = main;
                        i57 = i67;
                        i58 = i3;
                        iM559721 = i2;
                        c206712 = c20672;
                        abstractC15599M41289 = abstractC15599;
                        c206711 = c20671;
                        str3 = str;
                        i53 = i4;
                    }
                    break;
                case -1855917122:
                case -897984979:
                    C1404.m56468();
                    if (C0861.f81831) {
                        iM55685 = C0946.m55979("ۡۢ") ^ i51;
                        i4 = ((iM55685 ^ i52) * 27269) ^ 1928487564;
                        i42 = -1572966999;
                    } else {
                        iM55685 = (i52 - C0946.m55979("ۘ᩶")) * (-93);
                        i4 = ((iM55685 ^ i51) * (-11341)) ^ (-1699443458);
                        i42 = -1333316145;
                    }
                    i54 = iM55685 ^ i42;
                    i53 = i4;
                    break;
                case -1848163374:
                case 1295823461:
                    m47302(c18108, interfaceC19370, ActivityC22429.class);
                    break;
                case -1817351700:
                case -175888054:
                    abstractC15599M41289 = abstractC15599M41289;
                    boolean z4 = z3;
                    i56 = i56;
                    str3 = str3;
                    c206711 = c206711;
                    short[] sArr14 = sArr12;
                    int i70 = i61;
                    int i71 = i63;
                    C20671 c206713 = c206712;
                    int i72 = i58;
                    int i73 = i57;
                    Main main13 = mainM56594;
                    short[] sArr15 = sArr13;
                    Main main14 = main10;
                    iM559721 = iM559721;
                    main4 = main14;
                    short s2 = s;
                    int i74 = s2 + 16473;
                    int i75 = (s2 * s2) + 271359729;
                    if ((i74 * i74) - (i75 + i75) <= 0) {
                        int iM55687 = (C0873.m55680("ܿ۬") ^ i52) * (-19);
                        i53 = ((iM55687 ^ i51) * (-23683)) ^ (-455298284);
                        sArr13 = sArr15;
                        mainM56594 = main13;
                        i57 = i73;
                        i61 = i70;
                        i63 = i71;
                        sArr12 = sArr14;
                        s = s2;
                        c18108 = c18107;
                        i58 = i72;
                        i54 = iM55687 ^ (-710179024);
                        c206712 = c206713;
                        z3 = z4;
                    } else {
                        int iM559724 = (C0946.m55979("ܺ᩵") + i52) * (-21);
                        i53 = ((iM559724 ^ i51) * 32173) ^ (-445233396);
                        sArr13 = sArr15;
                        mainM56594 = main13;
                        i57 = i73;
                        i61 = i70;
                        i63 = i71;
                        sArr12 = sArr14;
                        z3 = z4;
                        s = s2;
                        i54 = iM559724 ^ (-1160334109);
                        i58 = i72;
                        c206712 = c206713;
                        c18108 = c18107;
                    }
                    c206711 = c206711;
                    str3 = str3;
                    i56 = i56;
                    abstractC15599M41289 = abstractC15599M41289;
                    int i610 = iM559721;
                    main10 = main4;
                    iM559721 = i610;
                    break;
                case -1794796545:
                case 641001747:
                    abstractC15599M41289 = abstractC15599M41289;
                    str3 = str3;
                    c206711 = c206711;
                    sArr7 = sArr12;
                    i28 = i61;
                    i29 = i63;
                    c20673 = c206712;
                    i58 = i58;
                    i30 = i57;
                    main7 = mainM56594;
                    sArr8 = sArr13;
                    Main main15 = main10;
                    iM559721 = iM559721;
                    main4 = main15;
                    z2 = z3;
                    if (i58 == (C0873.m55680(C0927.m55863(f82953, 299, 3, i64)) ^ 2123683670)) {
                        iM55684 = (C0946.m55979("ܰᩳ") + i52) * 19;
                        i21 = ((iM55684 ^ i51) * (-18415)) ^ (-151855049);
                        i31 = -272811694;
                    } else {
                        iM55684 = (C0946.m55979("ۤۨ") ^ i51) * (-23);
                        i21 = ((iM55684 ^ i52) * (-8943)) ^ 338470905;
                        i31 = -1145552905;
                    }
                    i54 = iM55684 ^ i31;
                    sArr13 = sArr8;
                    mainM56594 = main7;
                    i57 = i30;
                    i61 = i28;
                    i63 = i29;
                    sArr12 = sArr7;
                    z3 = z2;
                    i58 = i58;
                    c206712 = c20673;
                    c206711 = c206711;
                    str3 = str3;
                    i53 = i21;
                    abstractC15599M41289 = abstractC15599M41289;
                    int i611 = iM559721;
                    main10 = main4;
                    iM559721 = i611;
                    break;
                case -1769978521:
                case 1557910944:
                    C0937.m55908(c206712, i49 ^ 2119852203);
                    C0906.m55817(c206712, iM559716, new DialogInterfaceOnClickListenerC23629(c18108, interfaceC19370));
                    C0967.m56076(c206712, i44, obj);
                    RunnableC0871.m55669(c206712);
                    break;
                case -1761075269:
                case 1485013684:
                    C0912.m55833();
                    break;
                case -1736015704:
                case -1293150554:
                    C20671 c206714 = c206711;
                    C0937.m55908(c206714, i47 ^ i48);
                    C0906.m55817(c206714, iM559716, new DialogInterfaceOnClickListenerC17416(0, c18108, interfaceC19370));
                    C1124.m56374(c206714, i44, obj);
                    C1025.m56221(c206714);
                    break;
                case -1726989923:
                case -1272866292:
                    AbstractC15599 abstractC155910 = abstractC15599M41289;
                    int i76 = i57;
                    String str4 = str3;
                    C20671 c206715 = c206711;
                    c20677 = c206712;
                    Main main16 = mainM56594;
                    int i77 = i58;
                    int iM559725 = C0946.m55979(C0906.m55810(f82953, 314, 3, i64)) ^ 2100280201;
                    if (i77 == iM559725) {
                        iM559714 = (C0873.m55680("ܽ֡") + i51) * (-111);
                        i38 = ((iM559714 ^ i52) * 6625) ^ (-638932447);
                        i39 = -149980174;
                    } else {
                        iM559714 = C0946.m55979("᩶ᩳ") ^ i52;
                        i38 = ((iM559714 ^ i51) * 17767) ^ (-1763526748);
                        i39 = -1012031947;
                    }
                    i54 = iM559714 ^ i39;
                    i60 = iM559725;
                    abstractC15599M41289 = abstractC155910;
                    c20678 = c206715;
                    str3 = str4;
                    i53 = i38;
                    mainM56594 = main16;
                    i57 = i76;
                    i58 = i77;
                    c206712 = c20677;
                    c206711 = c20678;
                    break;
                case -1722676921:
                case 1243496347:
                    main4 = main10;
                    i64 = 14180;
                    iM55681 = (C0873.m55680("᩹ܺ") ^ i51) * 57;
                    i11 = ((iM55681 ^ i52) * (-23873)) ^ (-2008104516);
                    i12 = -47016979;
                    i54 = iM55681 ^ i12;
                    c18108 = c18107;
                    i53 = i11;
                    sArr13 = sArr13;
                    mainM56594 = mainM56594;
                    i57 = i57;
                    i61 = i61;
                    i63 = i63;
                    sArr12 = sArr12;
                    z3 = z3;
                    i58 = i58;
                    c206712 = c206712;
                    c206711 = c206711;
                    str3 = str3;
                    i56 = i56;
                    abstractC15599M41289 = abstractC15599M41289;
                    int i612 = iM559721;
                    main10 = main4;
                    iM559721 = i612;
                    break;
                case -1685976702:
                case -982974045:
                    C0892.m55749();
                    i34 = i49;
                    c20676 = c206712;
                    i33 = i57;
                    main8 = mainM56594;
                    sArr10 = sArr13;
                    Main main17 = main10;
                    iM559721 = iM559721;
                    main4 = main17;
                    int iM55688 = C0873.m55680("ܽܶ") ^ i51;
                    int i613 = i34;
                    i8 = ((iM55688 ^ i52) * 23315) ^ (-1539519205);
                    i54 = iM55688 ^ 2063220037;
                    sArr13 = sArr10;
                    mainM56594 = main8;
                    i57 = i33;
                    abstractC15599M41289 = abstractC15599M41289;
                    i63 = i63;
                    i58 = i58;
                    c206712 = c20676;
                    i49 = i613;
                    c206711 = c206711;
                    str3 = str3;
                    i53 = i8;
                    int i614 = iM559721;
                    main10 = main4;
                    iM559721 = i614;
                    break;
                case -1679118736:
                case 1072443497:
                    C20671 c20671M55654 = C0866.m55654(C1964.m56594(c18107));
                    C1012.m56146(c20671M55654, i60);
                    c20676 = c20671M55654;
                    int iM559726 = C0946.m55979(C0930.m55893(f82953, 326, 3, i64));
                    if (C1194.m56396() <= 0) {
                        i34 = iM559726;
                        i33 = i57;
                        main8 = mainM56594;
                        sArr10 = sArr13;
                        Main main18 = main10;
                        iM559721 = iM559721;
                        main4 = main18;
                        int iM55689 = C0873.m55680("ܽܶ") ^ i51;
                        int i615 = i34;
                        i8 = ((iM55689 ^ i52) * 23315) ^ (-1539519205);
                        i54 = iM55689 ^ 2063220037;
                        sArr13 = sArr10;
                        mainM56594 = main8;
                        i57 = i33;
                        abstractC15599M41289 = abstractC15599M41289;
                        i63 = i63;
                        i58 = i58;
                        c206712 = c20676;
                        i49 = i615;
                        c206711 = c206711;
                        str3 = str3;
                        i53 = i8;
                        int i616 = iM559721;
                        main10 = main4;
                        iM559721 = i616;
                    } else {
                        int iM559727 = (C0946.m55979("ܿᩳ") ^ i51) * 35;
                        i54 = iM559727 ^ (-361067436);
                        i49 = iM559726;
                        i53 = ((iM559727 ^ i52) * 23377) ^ 1813811758;
                        c206712 = c20676;
                    }
                    break;
                case -1622482780:
                case -369541475:
                    C1053.m56329(new C11578(c18108, abstractC15599M41289, interfaceC19370));
                    abstractC15599 = abstractC15599M41289;
                    str3 = str3;
                    c206711 = c206711;
                    c20673 = c206712;
                    i58 = i58;
                    iM55979 = (i51 - C0946.m55979("֫ܶ")) * (-115);
                    i9 = ((iM55979 ^ i52) * (-17247)) ^ (-1548841199);
                    i10 = -2007835776;
                    i54 = iM55979 ^ i10;
                    i58 = i58;
                    c206712 = c20673;
                    c206711 = c206711;
                    str3 = str3;
                    i53 = i9;
                    abstractC15599M41289 = abstractC15599;
                    break;
                case -1597288445:
                case -1061875461:
                    iM559720 = C0946.m55979(C1048.m56318(f82953, 332, 3, i64)) ^ 2098592815;
                    iM55685 = (C0873.m55680("ۖۘ") ^ i51) * (-67);
                    i4 = ((iM55685 ^ i52) * 5623) ^ 340343211;
                    i42 = 1549310440;
                    i54 = iM55685 ^ i42;
                    i53 = i4;
                    break;
                case -1571597188:
                case 1068268741:
                    abstractC15599M41289 = abstractC15599M41289;
                    str3 = str3;
                    c206711 = c206711;
                    sArr11 = sArr12;
                    i35 = i61;
                    c20673 = c206712;
                    i58 = i58;
                    i36 = i57;
                    main9 = mainM56594;
                    i37 = i62;
                    Main main19 = main10;
                    iM559721 = iM559721;
                    main4 = main19;
                    iM559716 = C0946.m55979(ViewOnClickListenerC0939.m55947(sArr11, i35, i37, i64)) ^ 2118268126;
                    sArr13 = f82953;
                    i63 = 308;
                    if (ViewOnClickListenerC0939.m55941() < 0) {
                        sArr9 = sArr11;
                        int iM556810 = C0873.m55680("۫ۖ") ^ i51;
                        i21 = ((iM556810 ^ i52) * (-28449)) ^ (-544832181);
                        i54 = iM556810 ^ (-1896210100);
                        i62 = i37;
                        mainM56594 = main9;
                        i57 = i36;
                        i61 = i35;
                        sArr12 = sArr9;
                        i58 = i58;
                        c206712 = c20673;
                        c206711 = c206711;
                        str3 = str3;
                        i53 = i21;
                        abstractC15599M41289 = abstractC15599M41289;
                        int i617 = iM559721;
                        main10 = main4;
                        iM559721 = i617;
                    }
                    int iM559728 = (C0946.m55979("ۡ᩷") + i51) * (-9);
                    sArr = sArr11;
                    i8 = ((iM559728 ^ i52) * (-7657)) ^ 1994029976;
                    i54 = iM559728 ^ (-119364434);
                    i61 = i35;
                    i62 = i37;
                    mainM56594 = main9;
                    i57 = i36;
                    abstractC15599M41289 = abstractC15599M41289;
                    sArr12 = sArr;
                    i58 = i58;
                    c206712 = c20673;
                    c206711 = c206711;
                    str3 = str3;
                    i53 = i8;
                    int i618 = iM559721;
                    main10 = main4;
                    iM559721 = i618;
                    break;
                case -1502981014:
                case -1198032936:
                    mainM56596.m12253(i43, iM559720, z3);
                    break;
                case -1453440103:
                case 1951957172:
                    abstractC15599M41289 = abstractC15599M41289;
                    z3 = z3;
                    i56 = i56;
                    str3 = str3;
                    c206711 = c206711;
                    sArr12 = sArr12;
                    i61 = i61;
                    i63 = i63;
                    c206712 = c206712;
                    i58 = i58;
                    i57 = i57;
                    mainM56594 = mainM56594;
                    sArr13 = sArr13;
                    Main main20 = main10;
                    iM559721 = iM559721;
                    main4 = main20;
                    s = f82953[272];
                    if (C1964.f83032 <= 0) {
                        iM55681 = (C0946.m55979("ۚ֫") ^ i52) * (-29);
                        i11 = ((iM55681 ^ i51) * 15787) ^ 1178097079;
                        i12 = 564790230;
                    } else {
                        iM55681 = (i51 - C0873.m55680("ۗ᩶")) * (-121);
                        i11 = ((iM55681 ^ i52) * 2387) ^ 652688;
                        i12 = 649632051;
                    }
                    i54 = iM55681 ^ i12;
                    c18108 = c18107;
                    i53 = i11;
                    sArr13 = sArr13;
                    mainM56594 = mainM56594;
                    i57 = i57;
                    i61 = i61;
                    i63 = i63;
                    sArr12 = sArr12;
                    z3 = z3;
                    i58 = i58;
                    c206712 = c206712;
                    c206711 = c206711;
                    str3 = str3;
                    i56 = i56;
                    abstractC15599M41289 = abstractC15599M41289;
                    int i619 = iM559721;
                    main10 = main4;
                    iM559721 = i619;
                    break;
                case -1441756304:
                case -937063396:
                    abstractC15599M41289 = abstractC15599M41289;
                    str3 = str3;
                    c206711 = c206711;
                    i63 = i63;
                    c20673 = c206712;
                    i58 = i58;
                    i33 = i57;
                    main8 = mainM56594;
                    sArr10 = sArr13;
                    Main main21 = main10;
                    iM559721 = iM559721;
                    main4 = main21;
                    i44 = i46 ^ 2103395357;
                    sArr12 = f82953;
                    i61 = 305;
                    i62 = 3;
                    if (C0906.f81862 < 0) {
                        int iM556811 = (C0873.m55680("᩺ۚ") + i52) * (-89);
                        i21 = ((iM556811 ^ i51) * 3675) ^ (-1872809480);
                        i54 = iM556811 ^ (-1006525122);
                        sArr13 = sArr10;
                        mainM56594 = main8;
                        i57 = i33;
                        i63 = i63;
                        i58 = i58;
                        c206712 = c20673;
                        c206711 = c206711;
                        str3 = str3;
                        i53 = i21;
                        abstractC15599M41289 = abstractC15599M41289;
                        int i6110 = iM559721;
                        main10 = main4;
                        iM559721 = i6110;
                    } else {
                        i34 = i49;
                        c20676 = c20673;
                        int iM556812 = C0873.m55680("ܽܶ") ^ i51;
                        int i6111 = i34;
                        i8 = ((iM556812 ^ i52) * 23315) ^ (-1539519205);
                        i54 = iM556812 ^ 2063220037;
                        sArr13 = sArr10;
                        mainM56594 = main8;
                        i57 = i33;
                        abstractC15599M41289 = abstractC15599M41289;
                        i63 = i63;
                        i58 = i58;
                        c206712 = c20676;
                        i49 = i6111;
                        c206711 = c206711;
                        str3 = str3;
                        i53 = i8;
                        int i6112 = iM559721;
                        main10 = main4;
                        iM559721 = i6112;
                    }
                    break;
                case -1400658833:
                case 2053566038:
                    abstractC15599M41289 = abstractC15599M41289;
                    int i78 = iM559721;
                    main4 = main10;
                    str3 = str3;
                    c206711 = c206711;
                    c20673 = c206712;
                    i58 = i58;
                    int i79 = i57;
                    Main main22 = mainM56594;
                    iM559721 = i78;
                    short[] sArr16 = sArr13;
                    int i80 = i63;
                    int iM559729 = C0946.m55979(C0861.m55618(sArr16, i80, 3, i64)) ^ 2121370267;
                    if (i58 != iM559729) {
                        int iM556813 = (C0873.m55680("᩺ۙ") ^ i51) * 71;
                        i63 = i80;
                        i21 = ((iM556813 ^ i52) * 6345) ^ 645861213;
                        i54 = iM556813 ^ 1003496333;
                        sArr13 = sArr16;
                        mainM56594 = main22;
                        i57 = i79;
                        i59 = iM559729;
                        i63 = i63;
                        i58 = i58;
                        c206712 = c20673;
                        c206711 = c206711;
                        str3 = str3;
                        i53 = i21;
                        abstractC15599M41289 = abstractC15599M41289;
                        int i6113 = iM559721;
                        main10 = main4;
                        iM559721 = i6113;
                    } else {
                        int iM559730 = C0946.m55979("ۘ᩹") ^ i51;
                        i8 = ((iM559730 ^ i52) * 4211) ^ (-1661344216);
                        i54 = iM559730 ^ 579187509;
                        i63 = i80;
                        sArr13 = sArr16;
                        mainM56594 = main22;
                        i57 = i79;
                        abstractC15599M41289 = abstractC15599M41289;
                        i59 = iM559729;
                        i58 = i58;
                        c206712 = c20673;
                        c206711 = c206711;
                        str3 = str3;
                        i53 = i8;
                        int i6114 = iM559721;
                        main10 = main4;
                        iM559721 = i6114;
                    }
                    break;
                case -1355024622:
                case -1250769362:
                    abstractC15599M41289 = abstractC15599M41289;
                    z2 = z3;
                    str3 = str3;
                    c206711 = c206711;
                    sArr7 = sArr12;
                    i28 = i61;
                    i29 = i63;
                    c20673 = c206712;
                    i58 = i58;
                    i30 = i57;
                    main7 = mainM56594;
                    sArr8 = sArr13;
                    Main main23 = main10;
                    iM559721 = iM559721;
                    main4 = main23;
                    if (i58 == (C0873.m55680(C1012.m56144(f82953, 296, 3, i64)) ^ 2128330784)) {
                        iM55684 = C0946.m55979("ۤᩴ") ^ i52;
                        i21 = ((iM55684 ^ i51) * (-26177)) ^ (-1202279011);
                        i31 = 851292901;
                    } else {
                        iM55684 = C0873.m55680("۠ۧ") ^ i51;
                        i21 = ((iM55684 ^ i52) * (-10129)) ^ (-833443406);
                        i31 = -1216604272;
                    }
                    i54 = iM55684 ^ i31;
                    sArr13 = sArr8;
                    mainM56594 = main7;
                    i57 = i30;
                    i61 = i28;
                    i63 = i29;
                    sArr12 = sArr7;
                    z3 = z2;
                    i58 = i58;
                    c206712 = c20673;
                    c206711 = c206711;
                    str3 = str3;
                    i53 = i21;
                    abstractC15599M41289 = abstractC15599M41289;
                    int i6115 = iM559721;
                    main10 = main4;
                    iM559721 = i6115;
                    break;
                case -1319617139:
                case 1219274265:
                    m47308(c18108, interfaceC19370, ActivityC18686.class);
                    break;
                case -1248188106:
                case 1461226294:
                    RunnableC0897.m55789(c18108, interfaceC19370, new C18758(0, c18108));
                    break;
                case -1242982401:
                case -1027135908:
                    abstractC15599M41289 = c18107.m41289();
                    if (abstractC15599M41289.mo9723()) {
                        iM55685 = (i52 - C0873.m55680("ۧۧ")) * 33;
                        i4 = ((iM55685 ^ i51) * 30813) ^ (-606594616);
                        i42 = -188333327;
                    } else {
                        iM55685 = (i52 - C0873.m55680("᩹᩶")) * (-59);
                        i4 = ((iM55685 ^ i51) * (-25475)) ^ (-274974047);
                        i42 = 976448180;
                    }
                    i54 = iM55685 ^ i42;
                    i53 = i4;
                    break;
                case -1223431802:
                case 1820689842:
                    C0937.m55918();
                    if (C1017.f81942 >= 0) {
                        abstractC15599M41289 = abstractC15599M41289;
                        z3 = z3;
                        i56 = i56;
                        str3 = str3;
                        c206711 = c206711;
                        sArr12 = sArr12;
                        i61 = i61;
                        i63 = i63;
                        c206712 = c206712;
                        i58 = i58;
                        i57 = i57;
                        mainM56594 = mainM56594;
                        sArr13 = sArr13;
                        Main main24 = main10;
                        iM559721 = iM559721;
                        main4 = main24;
                        iM55682 = (i52 - C0946.m55979("ܿۨ")) * (-105);
                        i15 = ((iM55682 ^ i51) * (-12987)) ^ (-1253356045);
                        i16 = 1421048273;
                        i54 = iM55682 ^ i16;
                        i53 = i15;
                        sArr13 = sArr13;
                        mainM56594 = mainM56594;
                        i57 = i57;
                        i61 = i61;
                        i63 = i63;
                        sArr12 = sArr12;
                        z3 = z3;
                        i58 = i58;
                        c206712 = c206712;
                        c206711 = c206711;
                        str3 = str3;
                        i56 = i56;
                        abstractC15599M41289 = abstractC15599M41289;
                        int i6116 = iM559721;
                        main10 = main4;
                        iM559721 = i6116;
                    }
                    i34 = i49;
                    c20676 = c206712;
                    i33 = i57;
                    main8 = mainM56594;
                    sArr10 = sArr13;
                    Main main110 = main10;
                    iM559721 = iM559721;
                    main4 = main110;
                    int iM556814 = C0873.m55680("ܽܶ") ^ i51;
                    int i6117 = i34;
                    i8 = ((iM556814 ^ i52) * 23315) ^ (-1539519205);
                    i54 = iM556814 ^ 2063220037;
                    sArr13 = sArr10;
                    mainM56594 = main8;
                    i57 = i33;
                    abstractC15599M41289 = abstractC15599M41289;
                    i63 = i63;
                    i58 = i58;
                    c206712 = c20676;
                    i49 = i6117;
                    c206711 = c206711;
                    str3 = str3;
                    i53 = i8;
                    int i6118 = iM559721;
                    main10 = main4;
                    iM559721 = i6118;
                    break;
                case -1080416490:
                case 1507961038:
                    c20679 = c206711;
                    c206710 = c206712;
                    mainM56594 = C1964.m56594(c18107);
                    if (zM56234) {
                        iM559715 = (i51 - C0946.m55979("֫ۙ")) * (-77);
                        i40 = ((iM559715 ^ i52) * (-9955)) ^ (-227227591);
                        i41 = 1718259701;
                    } else {
                        iM559719 = i55;
                        iM559715 = (i52 - C0946.m55979("ۛۢ")) * (-29);
                        i40 = ((iM559715 ^ i51) * (-2095)) ^ 701650922;
                        i41 = 700626128;
                    }
                    i54 = iM559715 ^ i41;
                    i53 = i40;
                    c206712 = c206710;
                    c206711 = c20679;
                    break;
                case -969243880:
                case 1966734766:
                    abstractC15599M41289 = abstractC15599M41289;
                    str3 = str3;
                    c206711 = c206711;
                    sArr9 = sArr12;
                    int i81 = i61;
                    int i82 = i63;
                    c20673 = c206712;
                    i58 = i58;
                    int i83 = i57;
                    Main main25 = mainM56594;
                    short[] sArr17 = sArr13;
                    Main main26 = main10;
                    iM559721 = iM559721;
                    main4 = main26;
                    if (C0898.m55790(c18108, str3)) {
                        iM559713 = C0873.m55680("᩷ܿ") ^ i52;
                        i21 = ((iM559713 ^ i51) * 87) ^ 157863768;
                        i32 = 179747176;
                    } else {
                        iM559713 = (C0946.m55979("ۧۚ") + i51) * (-115);
                        i21 = ((iM559713 ^ i52) * (-30819)) ^ 1643094578;
                        i32 = 186246551;
                    }
                    i54 = iM559713 ^ i32;
                    sArr13 = sArr17;
                    mainM56594 = main25;
                    i57 = i83;
                    i61 = i81;
                    i63 = i82;
                    sArr12 = sArr9;
                    i58 = i58;
                    c206712 = c20673;
                    c206711 = c206711;
                    str3 = str3;
                    i53 = i21;
                    abstractC15599M41289 = abstractC15599M41289;
                    int i6119 = iM559721;
                    main10 = main4;
                    iM559721 = i6119;
                    break;
                case -941760869:
                case 1976926069:
                    iM559719 = C0946.m55979(C1003.m56132(f82953, 329, 3, i64)) ^ 2129010812;
                    c20679 = c206711;
                    c206710 = c206712;
                    iM559715 = (i52 - C0946.m55979("ۛۢ")) * (-29);
                    i40 = ((iM559715 ^ i51) * (-2095)) ^ 701650922;
                    i41 = 700626128;
                    i54 = iM559715 ^ i41;
                    i53 = i40;
                    c206712 = c206710;
                    c206711 = c20679;
                    break;
                case -912728638:
                case 174649741:
                    m47308(c18108, interfaceC19370, ActivityC21578.class);
                    break;
                case -787514538:
                case 1572490493:
                    main10.m12253(i43, iM559721, z3);
                    break;
                case -711685098:
                case -150612956:
                    abstractC15599M41289 = abstractC15599M41289;
                    z2 = z3;
                    str3 = str3;
                    c206711 = c206711;
                    sArr7 = sArr12;
                    i28 = i61;
                    i29 = i63;
                    c20673 = c206712;
                    i58 = i58;
                    i30 = i57;
                    main7 = mainM56594;
                    sArr8 = sArr13;
                    Main main27 = main10;
                    iM559721 = iM559721;
                    main4 = main27;
                    if (C1028.m56234(c18108, str3)) {
                        iM55684 = C0873.m55680("֫ܿ") ^ i52;
                        i21 = ((iM55684 ^ i51) * (-30401)) ^ 570591183;
                        i31 = 1092443695;
                    } else {
                        iM55684 = C0946.m55979("֨۟") ^ i51;
                        i21 = ((iM55684 ^ i52) * 18643) ^ (-219800464);
                        i31 = 1126746100;
                    }
                    i54 = iM55684 ^ i31;
                    sArr13 = sArr8;
                    mainM56594 = main7;
                    i57 = i30;
                    i61 = i28;
                    i63 = i29;
                    sArr12 = sArr7;
                    z3 = z2;
                    i58 = i58;
                    c206712 = c20673;
                    c206711 = c206711;
                    str3 = str3;
                    i53 = i21;
                    abstractC15599M41289 = abstractC15599M41289;
                    int i61110 = iM559721;
                    main10 = main4;
                    iM559721 = i61110;
                    break;
                case -611715270:
                case -536668883:
                    break;
                case -610900428:
                case -455408517:
                    AbstractC15599 abstractC155911 = abstractC15599M41289;
                    boolean z5 = z3;
                    C20671 c206716 = c206711;
                    short[] sArr18 = sArr12;
                    int i84 = i61;
                    int i85 = i63;
                    C20671 c206717 = c206712;
                    int i86 = i58;
                    int i87 = i57;
                    Main main28 = mainM56594;
                    short[] sArr19 = sArr13;
                    Main main29 = main10;
                    iM559721 = iM559721;
                    main4 = main29;
                    i43 = iM559717 ^ 2101936001;
                    String strM55707 = C0877.m55707(f82953, 291, 5, i64);
                    int i88 = i56;
                    if (i86 == i88) {
                        iM55683 = C0946.m55979("ܰ۠") ^ i52;
                        i26 = ((iM55683 ^ i51) * 8465) ^ 913853623;
                        i27 = 554936395;
                    } else {
                        iM55683 = C0873.m55680("ۛ֫") ^ i51;
                        i26 = ((iM55683 ^ i52) * (-26057)) ^ (-68199201);
                        i27 = -1760869258;
                    }
                    i54 = iM55683 ^ i27;
                    i56 = i88;
                    sArr13 = sArr19;
                    mainM56594 = main28;
                    i57 = i87;
                    abstractC15599M41289 = abstractC155911;
                    i61 = i84;
                    i63 = i85;
                    sArr12 = sArr18;
                    i58 = i86;
                    c206712 = c206717;
                    c206711 = c206716;
                    str3 = strM55707;
                    i53 = i26;
                    z3 = z5;
                    int i61111 = iM559721;
                    main10 = main4;
                    iM559721 = i61111;
                    break;
                case -584987611:
                case 2137809707:
                    abstractC15599M41289 = abstractC15599M41289;
                    i56 = i56;
                    str3 = str3;
                    c206711 = c206711;
                    sArr5 = sArr12;
                    i23 = i61;
                    i24 = i63;
                    c206712 = c206712;
                    i58 = i58;
                    i25 = i57;
                    main6 = mainM56594;
                    sArr6 = sArr13;
                    Main main30 = main10;
                    iM559721 = iM559721;
                    main4 = main30;
                    int iM559731 = C0946.m55979(C1071.m56336(f82953, WhirlpoolDigest.REDUCTION_POLYNOMIAL, 3, i64));
                    if (RunnableC0871.m55672() >= 0) {
                        i45 = iM559731;
                        z3 = false;
                        int iM559732 = (C0946.m55979("ܿ۠") ^ i51) * (-93);
                        i54 = iM559732 ^ (-1684739268);
                        i53 = ((iM559732 ^ i52) * (-3903)) ^ 1765524386;
                        sArr13 = sArr6;
                        mainM56594 = main6;
                        i57 = i25;
                        i61 = i23;
                        i63 = i24;
                        sArr12 = sArr5;
                    } else {
                        int iM559733 = C0946.m55979("ۖ᩷") ^ i51;
                        i54 = iM559733 ^ 2239972;
                        i45 = iM559731;
                        i53 = ((iM559733 ^ i52) * (-26661)) ^ (-478885530);
                        sArr13 = sArr6;
                        mainM56594 = main6;
                        i57 = i25;
                        i61 = i23;
                        i63 = i24;
                        sArr12 = sArr5;
                        z3 = false;
                    }
                    i58 = i58;
                    c206712 = c206712;
                    c206711 = c206711;
                    str3 = str3;
                    i56 = i56;
                    abstractC15599M41289 = abstractC15599M41289;
                    int i61112 = iM559721;
                    main10 = main4;
                    iM559721 = i61112;
                    break;
                case -572255501:
                case -497966233:
                    C1017.m56187();
                    if (C1046.f81962 > 0) {
                        abstractC15599M41289 = abstractC15599M41289;
                        str3 = str3;
                        c206711 = c206711;
                        sArr11 = sArr12;
                        i35 = i61;
                        c20673 = c206712;
                        i58 = i58;
                        i36 = i57;
                        main9 = mainM56594;
                        i37 = i62;
                        Main main31 = main10;
                        iM559721 = iM559721;
                        main4 = main31;
                        int iM5597210 = (C0946.m55979("ۡ᩷") + i51) * (-9);
                        sArr = sArr11;
                        i8 = ((iM5597210 ^ i52) * (-7657)) ^ 1994029976;
                        i54 = iM5597210 ^ (-119364434);
                        i61 = i35;
                        i62 = i37;
                        mainM56594 = main9;
                        i57 = i36;
                        abstractC15599M41289 = abstractC15599M41289;
                        sArr12 = sArr;
                        i58 = i58;
                        c206712 = c20673;
                        c206711 = c206711;
                        str3 = str3;
                        i53 = i8;
                        int i61113 = iM559721;
                        main10 = main4;
                        iM559721 = i61113;
                    }
                    abstractC15599M41289 = abstractC15599M41289;
                    z = z3;
                    iM559711 = i56;
                    str2 = str3;
                    c20674 = c206711;
                    sArr3 = sArr12;
                    i17 = i61;
                    i18 = i63;
                    c20675 = c206712;
                    i19 = i58;
                    i20 = i57;
                    main5 = mainM56594;
                    sArr4 = sArr13;
                    Main main32 = main10;
                    iM559721 = iM559721;
                    main4 = main32;
                    iM559712 = (i51 - C0873.m55680("ۧ᩹")) * (-125);
                    i21 = ((iM559712 ^ i52) * 1943) ^ 170142290;
                    i22 = 438353494;
                    i54 = iM559712 ^ i22;
                    sArr13 = sArr4;
                    mainM56594 = main5;
                    i57 = i20;
                    i61 = i17;
                    i63 = i18;
                    sArr12 = sArr3;
                    z3 = z;
                    i58 = i19;
                    c206712 = c20675;
                    c206711 = c20674;
                    str3 = str2;
                    i56 = iM559711;
                    i53 = i21;
                    abstractC15599M41289 = abstractC15599M41289;
                    int i61114 = iM559721;
                    main10 = main4;
                    iM559721 = i61114;
                    break;
                case -551917738:
                case 1568726536:
                    abstractC15599 = abstractC15599M41289;
                    str3 = str3;
                    c206711 = c206711;
                    c20673 = c206712;
                    i58 = i58;
                    i7 = i57;
                    main3 = mainM56594;
                    iM559721 = C0946.m55979(ServiceConnectionC1013.m56161(f82953, 311, 3, i64)) ^ 2099424796;
                    sArr = sArr12;
                    i5 = i61;
                    sArr2 = sArr13;
                    i6 = i63;
                    int iM559734 = (i51 - C0946.m55979("ᩳ᩸")) * 109;
                    i9 = ((iM559734 ^ i52) * (-15765)) ^ (-933411163);
                    i54 = iM559734 ^ 2102212625;
                    sArr13 = sArr2;
                    mainM56594 = main3;
                    i57 = i7;
                    i61 = i5;
                    i63 = i6;
                    sArr12 = sArr;
                    i58 = i58;
                    c206712 = c20673;
                    c206711 = c206711;
                    str3 = str3;
                    i53 = i9;
                    abstractC15599M41289 = abstractC15599;
                    break;
                case -495206239:
                case 1830541218:
                    C0917.m55854();
                    if (RunnableC1014.f81941 > 0) {
                        iM55685 = (i52 - C0946.m55979("ۘ᩶")) * (-93);
                        i4 = ((iM55685 ^ i51) * (-11341)) ^ (-1699443458);
                        i42 = -1333316145;
                    } else {
                        iM55685 = (i51 - C0946.m55979("۠ܽ")) * 9;
                        i4 = ((iM55685 ^ i52) * (-11635)) ^ 1351626498;
                        i42 = 1522129361;
                    }
                    i54 = iM55685 ^ i42;
                    i53 = i4;
                    break;
                case -414017531:
                case 1906689116:
                    C0955.m56036(c18108, interfaceC19370, new C24975(2, c18108));
                    break;
                case -412577474:
                case -30260435:
                    RunnableC0897.m55789(c18108, interfaceC19370, new C16075(c18108));
                    break;
                case -406575368:
                case 16516604:
                    abstractC15599 = abstractC15599M41289;
                    int i89 = i57;
                    Main main33 = mainM56595;
                    str = str3;
                    C20671 c206718 = c206711;
                    C20671 c206719 = c206712;
                    Main main34 = mainM56594;
                    int i90 = i58;
                    if (!C0898.m55790(c18108, str)) {
                        mainM56595 = main33;
                        int iM559735 = C0946.m55979("ۡᩴ") ^ i52;
                        i54 = iM559735 ^ (-1385789808);
                        i58 = i90;
                        c206712 = c206719;
                        c206711 = c206718;
                        str3 = str;
                        i53 = ((iM559735 ^ i51) * (-29935)) ^ 480552014;
                        mainM56594 = main34;
                        i57 = i89;
                        abstractC15599M41289 = abstractC15599;
                    } else {
                        int iM559736 = C0946.m55979("ۢ֫") ^ i52;
                        mainM56595 = main33;
                        i4 = ((iM559736 ^ i51) * 32205) ^ (-191068144);
                        i54 = iM559736 ^ (-1119160476);
                        i58 = i90;
                        mainM56594 = main34;
                        c206712 = c206719;
                        i57 = i89;
                        c206711 = c206718;
                        abstractC15599M41289 = abstractC15599;
                        str3 = str;
                        i53 = i4;
                    }
                    break;
                case -330365889:
                case 823493300:
                    C1229.m56410();
                    if (C0877.f81843 < 0) {
                        abstractC15599M41289 = abstractC15599M41289;
                        z3 = z3;
                        i56 = i56;
                        str3 = str3;
                        c206711 = c206711;
                        sArr12 = sArr12;
                        i61 = i61;
                        i63 = i63;
                        c206712 = c206712;
                        i58 = i58;
                        i57 = i57;
                        mainM56594 = mainM56594;
                        sArr13 = sArr13;
                        Main main35 = main10;
                        iM559721 = iM559721;
                        main4 = main35;
                        int iM556815 = (C0873.m55680("ۙ֨") ^ i52) * 83;
                        i54 = iM556815 ^ (-693355752);
                        i53 = ((iM556815 ^ i51) * 15943) ^ 1970546865;
                        sArr13 = sArr13;
                        mainM56594 = mainM56594;
                        i57 = i57;
                        i61 = i61;
                        i63 = i63;
                        sArr12 = sArr12;
                        z3 = z3;
                        c18108 = c18107;
                        i58 = i58;
                        c206712 = c206712;
                        c206711 = c206711;
                        str3 = str3;
                        i56 = i56;
                        abstractC15599M41289 = abstractC15599M41289;
                        int i61115 = iM559721;
                        main10 = main4;
                        iM559721 = i61115;
                    } else {
                        iM55685 = (i52 - C0946.m55979("ۘ᩶")) * (-93);
                        i4 = ((iM55685 ^ i51) * (-11341)) ^ (-1699443458);
                        i42 = -1333316145;
                        i54 = iM55685 ^ i42;
                        i53 = i4;
                    }
                    break;
                case -313998452:
                case 1238232448:
                    C20671 c20671M55888 = C0930.m55888(C1964.m56594(c18107));
                    int i91 = i59;
                    C1012.m56146(c20671M55888, i91);
                    c206712 = c206712;
                    int iM556816 = C0873.m55680(ViewOnClickListenerC0939.m55947(f82953, 323, 3, i64));
                    i48 = 2126428102;
                    if (C0906.m55809() <= 0) {
                        abstractC15599M41289 = abstractC15599M41289;
                        i56 = i56;
                        i58 = i58;
                        str3 = str3;
                        c206711 = c20671M55888;
                        i59 = i91;
                        sArr5 = sArr12;
                        i23 = i61;
                        i24 = i63;
                        i47 = iM556816;
                        i25 = i57;
                        main6 = mainM56594;
                        sArr6 = sArr13;
                        Main main36 = main10;
                        iM559721 = iM559721;
                        main4 = main36;
                        int iM559737 = (C0946.m55979("ܿ۠") ^ i51) * (-93);
                        i54 = iM559737 ^ (-1684739268);
                        i53 = ((iM559737 ^ i52) * (-3903)) ^ 1765524386;
                        sArr13 = sArr6;
                        mainM56594 = main6;
                        i57 = i25;
                        i61 = i23;
                        i63 = i24;
                        sArr12 = sArr5;
                        i58 = i58;
                        c206712 = c206712;
                        c206711 = c206711;
                        str3 = str3;
                        i56 = i56;
                        abstractC15599M41289 = abstractC15599M41289;
                        int i61116 = iM559721;
                        main10 = main4;
                        iM559721 = i61116;
                    } else {
                        int iM556817 = (i51 - C0873.m55680("᩹ܰ")) * (-25);
                        i54 = iM556817 ^ 278602609;
                        i47 = iM556816;
                        i53 = ((iM556817 ^ i52) * 29057) ^ 22166836;
                        c206712 = c206712;
                        c206711 = c20671M55888;
                        i59 = i91;
                    }
                    break;
                case -255525214:
                case 657959212:
                    mainM56596 = C1964.m56594(c18107);
                    if (zM56234) {
                        iM55685 = C0873.m55680("᩵ܰ") ^ i52;
                        i4 = ((iM55685 ^ i51) * (-25267)) ^ (-198155714);
                        i42 = 875686477;
                    } else {
                        iM559720 = i55;
                        iM55685 = (C0873.m55680("ۖۘ") ^ i51) * (-67);
                        i4 = ((iM55685 ^ i52) * 5623) ^ 340343211;
                        i42 = 1549310440;
                    }
                    i54 = iM55685 ^ i42;
                    i53 = i4;
                    break;
                case -68053794:
                case 436850270:
                    str = str3;
                    C20671 c206720 = c206711;
                    c20677 = c206712;
                    if (!C0898.m55790(c18108, str)) {
                        int iM559738 = C0946.m55979("ۧ֨") ^ i51;
                        i54 = iM559738 ^ 89008869;
                        c20678 = c206720;
                        str3 = str;
                        i53 = ((iM559738 ^ i52) * 14513) ^ (-1817129622);
                        c206712 = c20677;
                        c206711 = c20678;
                    } else {
                        int iM556818 = C0873.m55680("ۘ᩺") ^ i52;
                        c20671 = c206720;
                        i4 = ((iM556818 ^ i51) * 25709) ^ 1424320898;
                        i54 = iM556818 ^ 1869447487;
                        c206712 = c20677;
                        c206711 = c20671;
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
                    iM55681 = (C0873.m55680("᩹ܺ") ^ i51) * 57;
                    i11 = ((iM55681 ^ i52) * (-23873)) ^ (-2008104516);
                    i12 = -47016979;
                    i54 = iM55681 ^ i12;
                    c18108 = c18107;
                    i53 = i11;
                    sArr13 = sArr13;
                    mainM56594 = mainM56594;
                    i57 = i57;
                    i61 = i61;
                    i63 = i63;
                    sArr12 = sArr12;
                    z3 = z3;
                    i58 = i58;
                    c206712 = c206712;
                    c206711 = c206711;
                    str3 = str3;
                    i56 = i56;
                    abstractC15599M41289 = abstractC15599M41289;
                    int i61117 = iM559721;
                    main10 = main4;
                    iM559721 = i61117;
                    break;
                case 365787149:
                case 827445852:
                    C1964.m56597();
                    if (C1929.f83011 == 0) {
                        abstractC15599M41289 = abstractC15599M41289;
                        z3 = z3;
                        i56 = i56;
                        str3 = str3;
                        c206711 = c206711;
                        sArr12 = sArr12;
                        i61 = i61;
                        i63 = i63;
                        c206712 = c206712;
                        i58 = i58;
                        i57 = i57;
                        mainM56594 = mainM56594;
                        sArr13 = sArr13;
                        Main main37 = main10;
                        iM559721 = iM559721;
                        main4 = main37;
                        iM55681 = (C0946.m55979("ۚ֫") ^ i52) * (-29);
                        i11 = ((iM55681 ^ i51) * 15787) ^ 1178097079;
                        i12 = 564790230;
                        i54 = iM55681 ^ i12;
                        c18108 = c18107;
                        i53 = i11;
                        sArr13 = sArr13;
                        mainM56594 = mainM56594;
                        i57 = i57;
                        i61 = i61;
                        i63 = i63;
                        sArr12 = sArr12;
                        z3 = z3;
                        i58 = i58;
                        c206712 = c206712;
                        c206711 = c206711;
                        str3 = str3;
                        i56 = i56;
                        abstractC15599M41289 = abstractC15599M41289;
                        int i61118 = iM559721;
                        main10 = main4;
                        iM559721 = i61118;
                    }
                    abstractC15599M41289 = abstractC15599M41289;
                    z3 = z3;
                    i56 = i56;
                    str3 = str3;
                    c206711 = c206711;
                    sArr12 = sArr12;
                    i61 = i61;
                    i63 = i63;
                    c206712 = c206712;
                    i58 = i58;
                    i57 = i57;
                    mainM56594 = mainM56594;
                    sArr13 = sArr13;
                    Main main38 = main10;
                    iM559721 = iM559721;
                    main4 = main38;
                    int iM556819 = (C0873.m55680("ۙ֨") ^ i52) * 83;
                    i54 = iM556819 ^ (-693355752);
                    i53 = ((iM556819 ^ i51) * 15943) ^ 1970546865;
                    sArr13 = sArr13;
                    mainM56594 = mainM56594;
                    i57 = i57;
                    i61 = i61;
                    i63 = i63;
                    sArr12 = sArr12;
                    z3 = z3;
                    c18108 = c18107;
                    i58 = i58;
                    c206712 = c206712;
                    c206711 = c206711;
                    str3 = str3;
                    i56 = i56;
                    abstractC15599M41289 = abstractC15599M41289;
                    int i61119 = iM559721;
                    main10 = main4;
                    iM559721 = i61119;
                    break;
                case 474425554:
                case 1908266720:
                    abstractC15599M41289 = abstractC15599M41289;
                    boolean z6 = z3;
                    i56 = i56;
                    int i92 = i57;
                    str3 = str3;
                    c206711 = c206711;
                    short[] sArr20 = sArr12;
                    int i93 = i61;
                    int i94 = i63;
                    c206712 = c206712;
                    Main main39 = mainM56594;
                    short[] sArr21 = sArr13;
                    Main main40 = main10;
                    iM559721 = iM559721;
                    main4 = main40;
                    int iM55586 = C0845.m55586(num);
                    if (iM55586 == (C0873.m55680(C1017.m56189(f82953, 276, 3, i64)) ^ 2128726026)) {
                        iM559710 = C0946.m55979("᩵۠") ^ i51;
                        i13 = ((iM559710 ^ i52) * (-12199)) ^ (-700024630);
                        i14 = 1792460154;
                    } else {
                        iM559710 = (C0946.m55979("ۛۧ") ^ i52) * (-87);
                        i13 = ((iM559710 ^ i51) * (-23257)) ^ 487814441;
                        i14 = -1028963283;
                    }
                    i54 = iM559710 ^ i14;
                    sArr13 = sArr21;
                    mainM56594 = main39;
                    i57 = i92;
                    i61 = i93;
                    i63 = i94;
                    sArr12 = sArr20;
                    z3 = z6;
                    i58 = iM55586;
                    i53 = i13;
                    c206712 = c206712;
                    c206711 = c206711;
                    str3 = str3;
                    i56 = i56;
                    abstractC15599M41289 = abstractC15599M41289;
                    int i611110 = iM559721;
                    main10 = main4;
                    iM559721 = i611110;
                    break;
                case 576429037:
                case 1303076487:
                    abstractC15599M41289 = abstractC15599M41289;
                    z3 = z3;
                    i56 = i56;
                    String str5 = str3;
                    c206711 = c206711;
                    sArr12 = sArr12;
                    i61 = i61;
                    i63 = i63;
                    c206712 = c206712;
                    i58 = i58;
                    i57 = i57;
                    mainM56594 = mainM56594;
                    sArr13 = sArr13;
                    Main main41 = main10;
                    iM559721 = iM559721;
                    main4 = main41;
                    i55 = i45 ^ 2128612951;
                    str3 = str5;
                    iM559717 = C0946.m55979(ViewOnClickListenerC0939.m55947(f82953, 288, 3, i64));
                    if (C0912.m55833()) {
                        iM55682 = (i52 - C0946.m55979("ܿۨ")) * (-105);
                        i15 = ((iM55682 ^ i51) * (-12987)) ^ (-1253356045);
                        i16 = 1421048273;
                    } else {
                        iM55682 = (C0946.m55979("᩷ܳ") ^ i52) * (-47);
                        i15 = ((iM55682 ^ i51) * 14827) ^ 1161152492;
                        i16 = -1073716363;
                    }
                    i54 = iM55682 ^ i16;
                    i53 = i15;
                    sArr13 = sArr13;
                    mainM56594 = mainM56594;
                    i57 = i57;
                    i61 = i61;
                    i63 = i63;
                    sArr12 = sArr12;
                    z3 = z3;
                    i58 = i58;
                    c206712 = c206712;
                    c206711 = c206711;
                    str3 = str3;
                    i56 = i56;
                    abstractC15599M41289 = abstractC15599M41289;
                    int i611111 = iM559721;
                    main10 = main4;
                    iM559721 = i611111;
                    break;
                case 593259117:
                case 1632709035:
                    abstractC15599 = abstractC15599M41289;
                    iM559721 = iM559721;
                    str3 = str3;
                    c206711 = c206711;
                    sArr = sArr12;
                    i5 = i61;
                    i6 = i63;
                    c20673 = c206712;
                    i58 = i58;
                    i7 = i57;
                    main3 = mainM56594;
                    sArr2 = sArr13;
                    Main mainM56597 = C1964.m56594(c18107);
                    if (!zM56234) {
                        main10 = mainM56597;
                        iM559721 = i55;
                        int iM559739 = (i51 - C0946.m55979("ᩳ᩸")) * 109;
                        i9 = ((iM559739 ^ i52) * (-15765)) ^ (-933411163);
                        i54 = iM559739 ^ 2102212625;
                        sArr13 = sArr2;
                        mainM56594 = main3;
                        i57 = i7;
                        i61 = i5;
                        i63 = i6;
                        sArr12 = sArr;
                        i58 = i58;
                        c206712 = c20673;
                        c206711 = c206711;
                        str3 = str3;
                        i53 = i9;
                        abstractC15599M41289 = abstractC15599;
                    } else {
                        int iM559740 = (i52 - C0946.m55979("ۨۧ")) * 123;
                        main4 = mainM56597;
                        i8 = ((iM559740 ^ i51) * 6905) ^ 772932604;
                        i54 = iM559740 ^ (-1546282740);
                        sArr13 = sArr2;
                        mainM56594 = main3;
                        i57 = i7;
                        abstractC15599M41289 = abstractC15599;
                        i61 = i5;
                        i63 = i6;
                        sArr12 = sArr;
                        i58 = i58;
                        c206712 = c20673;
                        c206711 = c206711;
                        str3 = str3;
                        i53 = i8;
                        int i611112 = iM559721;
                        main10 = main4;
                        iM559721 = i611112;
                    }
                    break;
                case 616479236:
                case 1960441802:
                    abstractC15599M41289 = abstractC15599M41289;
                    z3 = z3;
                    i56 = i56;
                    str3 = str3;
                    c206711 = c206711;
                    sArr12 = sArr12;
                    i61 = i61;
                    i63 = i63;
                    c206712 = c206712;
                    i58 = i58;
                    i57 = i57;
                    mainM56594 = mainM56594;
                    sArr13 = sArr13;
                    Main main42 = main10;
                    iM559721 = iM559721;
                    main4 = main42;
                    if (i58 == (C0946.m55979(C1124.m56373(f82953, 279, 3, i64)) ^ 2122703658)) {
                        iM55682 = (C0946.m55979("ᩳۤ") ^ i51) * (-59);
                        i15 = ((iM55682 ^ i52) * (-21303)) ^ (-1526085241);
                        i16 = 1089965368;
                    } else {
                        iM55682 = C0873.m55680("ۗ֡") ^ i52;
                        i15 = ((iM55682 ^ i51) * (-9537)) ^ (-1050609003);
                        i16 = -750693060;
                    }
                    i54 = iM55682 ^ i16;
                    i53 = i15;
                    sArr13 = sArr13;
                    mainM56594 = mainM56594;
                    i57 = i57;
                    i61 = i61;
                    i63 = i63;
                    sArr12 = sArr12;
                    z3 = z3;
                    i58 = i58;
                    c206712 = c206712;
                    c206711 = c206711;
                    str3 = str3;
                    i56 = i56;
                    abstractC15599M41289 = abstractC15599M41289;
                    int i611113 = iM559721;
                    main10 = main4;
                    iM559721 = i611113;
                    break;
                case 667307387:
                case 1284267775:
                    abstractC15599M41289 = abstractC15599M41289;
                    z = z3;
                    str2 = str3;
                    c20674 = c206711;
                    sArr3 = sArr12;
                    i17 = i61;
                    i18 = i63;
                    c20675 = c206712;
                    i19 = i58;
                    i20 = i57;
                    main5 = mainM56594;
                    sArr4 = sArr13;
                    Main main43 = main10;
                    iM559721 = iM559721;
                    main4 = main43;
                    iM559711 = C0946.m55979(C0894.m55773(f82953, 282, 3, i64)) ^ 2119941361;
                    if (C1929.f83011 != 0) {
                        iM559712 = (i51 - C0873.m55680("ۧ᩹")) * (-125);
                        i21 = ((iM559712 ^ i52) * 1943) ^ 170142290;
                        i22 = 438353494;
                    } else {
                        iM559712 = (C0946.m55979("ۤ֡") + i52) * 11;
                        i21 = ((iM559712 ^ i51) * (-21225)) ^ (-2274332);
                        i22 = -21847067;
                    }
                    i54 = iM559712 ^ i22;
                    sArr13 = sArr4;
                    mainM56594 = main5;
                    i57 = i20;
                    i61 = i17;
                    i63 = i18;
                    sArr12 = sArr3;
                    z3 = z;
                    i58 = i19;
                    c206712 = c20675;
                    c206711 = c20674;
                    str3 = str2;
                    i56 = iM559711;
                    i53 = i21;
                    abstractC15599M41289 = abstractC15599M41289;
                    int i611114 = iM559721;
                    main10 = main4;
                    iM559721 = i611114;
                    break;
                case 925438309:
                case 1256720713:
                    str3 = str3;
                    c206711 = c206711;
                    c20673 = c206712;
                    abstractC15599 = abstractC15599M41289;
                    i58 = i58;
                    if (i58 == (C0946.m55979(C1194.m56386(f82953, 320, 3, i64)) ^ 2123652940)) {
                        iM55979 = C0946.m55979("ܿᩴ") ^ i52;
                        i9 = ((iM55979 ^ i51) * 12639) ^ 241865427;
                        i10 = 910171300;
                    } else {
                        iM55979 = (i51 - C0946.m55979("֫ܶ")) * (-115);
                        i9 = ((iM55979 ^ i52) * (-17247)) ^ (-1548841199);
                        i10 = -2007835776;
                    }
                    i54 = iM55979 ^ i10;
                    i58 = i58;
                    c206712 = c20673;
                    c206711 = c206711;
                    str3 = str3;
                    i53 = i9;
                    abstractC15599M41289 = abstractC15599;
                    break;
                case 1290976068:
                case 1349696108:
                    abstractC15599M41289 = abstractC15599M41289;
                    z3 = z3;
                    i56 = i56;
                    str3 = str3;
                    c206711 = c206711;
                    sArr12 = sArr12;
                    i61 = i61;
                    i63 = i63;
                    c206712 = c206712;
                    i58 = i58;
                    i57 = i57;
                    mainM56594 = mainM56594;
                    sArr13 = sArr13;
                    Main main44 = main10;
                    iM559721 = iM559721;
                    main4 = main44;
                    zM56234 = C1028.m56234(c18108, C0882.m55717(f82953, 273, 3, i64));
                    dialogInterface.dismiss();
                    num = (Integer) C1017.m56196(arrayList, i);
                    if (C1028.f81950 <= 0) {
                        int iM5568110 = (C0873.m55680("ۙ֨") ^ i52) * 83;
                        i54 = iM5568110 ^ (-693355752);
                        i53 = ((iM5568110 ^ i51) * 15943) ^ 1970546865;
                        sArr13 = sArr13;
                        mainM56594 = mainM56594;
                        i57 = i57;
                        i61 = i61;
                        i63 = i63;
                        sArr12 = sArr12;
                        z3 = z3;
                        c18108 = c18107;
                    } else {
                        iM55681 = C0873.m55680("֨۫") ^ i51;
                        i11 = ((iM55681 ^ i52) * 30529) ^ (-750398092);
                        i12 = 1405368523;
                        i54 = iM55681 ^ i12;
                        c18108 = c18107;
                        i53 = i11;
                        sArr13 = sArr13;
                        mainM56594 = mainM56594;
                        i57 = i57;
                        i61 = i61;
                        i63 = i63;
                        sArr12 = sArr12;
                        z3 = z3;
                    }
                    i58 = i58;
                    c206712 = c206712;
                    c206711 = c206711;
                    str3 = str3;
                    i56 = i56;
                    abstractC15599M41289 = abstractC15599M41289;
                    int i611115 = iM559721;
                    main10 = main4;
                    iM559721 = i611115;
                    break;
                case 1453273182:
                case 1705834937:
                    mainM56595.m12253(i43, i57, z3);
                    break;
                case 1554854203:
                case 1928308979:
                    abstractC15599M41289 = abstractC15599M41289;
                    String str6 = str3;
                    c206711 = c206711;
                    sArr12 = sArr12;
                    i61 = i61;
                    i63 = i63;
                    c206712 = c206712;
                    i58 = i58;
                    i57 = i57;
                    mainM56594 = mainM56594;
                    sArr13 = sArr13;
                    Main main45 = main10;
                    iM559721 = iM559721;
                    main4 = main45;
                    int iM559741 = C0946.m55979(C1071.m56336(f82953, 302, 3, i64));
                    if (C0894.m55769() >= 0) {
                        i46 = iM559741;
                        z3 = z3;
                        i56 = i56;
                        obj = null;
                        str3 = str6;
                        iM55682 = (i52 - C0946.m55979("ܿۨ")) * (-105);
                        i15 = ((iM55682 ^ i51) * (-12987)) ^ (-1253356045);
                        i16 = 1421048273;
                        i54 = iM55682 ^ i16;
                        i53 = i15;
                        sArr13 = sArr13;
                        mainM56594 = mainM56594;
                        i57 = i57;
                        i61 = i61;
                        i63 = i63;
                        sArr12 = sArr12;
                        z3 = z3;
                        i58 = i58;
                        c206712 = c206712;
                        c206711 = c206711;
                        str3 = str3;
                        i56 = i56;
                        abstractC15599M41289 = abstractC15599M41289;
                    } else {
                        int iM556820 = C0873.m55680("ܶᩳ") ^ i52;
                        int i95 = ((iM556820 ^ i51) * 12339) ^ (-453595004);
                        i54 = iM556820 ^ 1587000160;
                        i46 = iM559741;
                        sArr13 = sArr13;
                        mainM56594 = mainM56594;
                        i57 = i57;
                        abstractC15599M41289 = abstractC15599M41289;
                        i61 = i61;
                        i63 = i63;
                        sArr12 = sArr12;
                        i58 = i58;
                        c206712 = c206712;
                        c206711 = c206711;
                        str3 = str6;
                        i53 = i95;
                        obj = null;
                    }
                    int i611116 = iM559721;
                    main10 = main4;
                    iM559721 = i611116;
                    break;
                case 1702188546:
                case 2123556402:
                    mainM56594.m12253(i43, iM559719, z3);
                    break;
                default:
                    abstractC15599 = abstractC15599M41289;
                    str = str3;
                    c20671 = c206711;
                    c20672 = c206712;
                    i3 = i58;
                    main = mainM56594;
                    iM55680 = C0873.m55680(RunnableC1014.m56180(f82953, 317, 3, i64)) ^ 2124213659;
                    i2 = iM559721;
                    main2 = main10;
                    int iM5597211 = (i52 - C0946.m55979("ۛ۬")) * 11;
                    int i620 = iM55680;
                    int i621 = ((iM5597211 ^ i51) * 2603) ^ 1229831923;
                    i54 = iM5597211 ^ (-463003923);
                    i58 = i3;
                    mainM56594 = main;
                    c206712 = c20672;
                    i57 = i620;
                    c206711 = c20671;
                    str3 = str;
                    i53 = i621;
                    main10 = main2;
                    iM559721 = i2;
                    abstractC15599M41289 = abstractC15599;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m47298(AbstractActivityC5549 abstractActivityC5549, byte[] bArr) {
        short[] sArr;
        TextView textView;
        String str;
        int iM55680;
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
        int iM55681;
        int i7;
        int i8;
        int i9;
        View viewM56181;
        int i10;
        int iM55979;
        int i11;
        int iM55682;
        int i12;
        int i13;
        String str3 = null;
        int i14 = 483758826;
        int i15 = C0930.f81879;
        int i16 = C1124.f82007;
        int iM559710 = (i16 - C0946.m55979("۫۬")) * (-77);
        int i17 = ((iM559710 ^ i15) * 25517) ^ 237802952;
        int i18 = iM559710 ^ 1188459405;
        TextView textView3 = null;
        TextView textView4 = null;
        TextView textView5 = null;
        TextView textView6 = null;
        C20671 c20671M55654 = null;
        Object obj = null;
        String strM55863 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        int i19 = 0;
        View view2 = null;
        int i20 = 0;
        int iM33494 = 0;
        int iM559711 = 0;
        int iM559712 = 0;
        int iM559713 = 0;
        int iM55683 = 0;
        int iM55684 = 0;
        int iM559714 = 0;
        int i21 = 0;
        int iM55685 = 0;
        int i22 = 0;
        int iM559715 = 0;
        short s = 0;
        int i23 = 0;
        C14645 c14645 = null;
        int i24 = 0;
        String str4 = null;
        int i25 = 0;
        short[] sArr7 = null;
        while (true) {
            String strM55642 = str3;
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
                            str2 = strM55642;
                            i3 = i24;
                            sArr3 = sArr6;
                            i4 = i25;
                            sArr4 = sArr5;
                            short s2 = f82953[241];
                            int i26 = s2 + 261;
                            i23 = i26 * i26;
                            int iM559716 = (C0946.m55979("᩻᩸") + i15) * (-35);
                            i5 = ((iM559716 ^ i16) * (-28139)) ^ (-1681843783);
                            i6 = iM559716 ^ 687115371;
                            s = s2;
                            sArr5 = sArr4;
                            sArr6 = sArr3;
                            i25 = i4;
                            i24 = i3;
                            strM55642 = str2;
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
                            str = strM55642;
                            C1229.m56406(textView, str);
                            sArr6 = f82953;
                            i20 = 3;
                            if (C0873.f81841 <= 0) {
                                i25 = 251;
                                int iM559717 = C0946.m55979("ۨۢ") ^ i15;
                                strM55642 = str;
                                sArr = sArr;
                                i18 = iM559717 ^ 1610938577;
                                TextView textView7 = textView;
                                i17 = ((iM559717 ^ i16) * (-16791)) ^ 714952891;
                                sArr6 = sArr6;
                                textView4 = textView7;
                            } else {
                                int iM55686 = C0873.m55680("ܺᩳ") ^ i16;
                                textView4 = textView;
                                i17 = ((iM55686 ^ i15) * 3913) ^ (-1676180528);
                                strM55642 = str;
                                sArr = sArr;
                                i25 = 251;
                                i18 = iM55686 ^ (-523232384);
                            }
                            break;
                        case -1621416142:
                        case -1375458035:
                            ViewOnClickListenerC0939.m55953(c20671M55654, iM559712, obj);
                            iM559713 = C0946.m55979(C0947.m55993(f82953, 269, 3, i19)) ^ 2129385567;
                            iM55682 = (C0946.m55979("۬ۤ") + i15) * 31;
                            i12 = ((iM55682 ^ i16) * (-8593)) ^ 1134436303;
                            i13 = -1648330423;
                            i18 = iM55682 ^ i13;
                            i17 = i12;
                            break;
                        case -1512863895:
                        case 378842144:
                            C1071.m56340((TextView) C0892.m55755(view2, iM559711), C0845.m55579(c14645.m33507()));
                            c20671M55654 = C0866.m55654(abstractActivityC5549);
                            C0882.m55725(c20671M55654, view2);
                            sArr = f82953;
                            iM55682 = C0946.m55979("֡᩵") ^ i16;
                            i12 = ((iM55682 ^ i15) * 15183) ^ (-810806355);
                            i13 = 55656146;
                            i18 = iM55682 ^ i13;
                            i17 = i12;
                            break;
                        case -1483435523:
                        case 129835395:
                            sArr = sArr;
                            C1071.m56340((TextView) C1404.m56465(view2, iM55685 ^ i22), C0845.m55579(c14645.m33482()));
                            if (C1025.f81947 < 0) {
                                iM55680 = (C0873.m55680("᩷ۙ") ^ i15) * (-83);
                                i = ((iM55680 ^ i16) * (-4985)) ^ (-1456024925);
                                i2 = -1814975693;
                                sArr7 = sArr;
                                i18 = iM55680 ^ i2;
                                i17 = i;
                            }
                            viewM56181 = view2;
                            textView3 = textView3;
                            strM55642 = strM55642;
                            sArr6 = sArr6;
                            i9 = i25;
                            int iM559718 = C0946.m55979("ܳܺ") ^ i16;
                            sArr5 = sArr5;
                            sArr6 = sArr6;
                            i25 = i9;
                            i24 = i24;
                            strM55642 = strM55642;
                            textView3 = textView3;
                            sArr = sArr;
                            i18 = iM559718 ^ 1491946541;
                            i17 = ((iM559718 ^ i15) * (-4257)) ^ (-1357115516);
                            view2 = viewM56181;
                            c14645 = null;
                            break;
                        case -1454200758:
                        case -152832002:
                            i19 = 16356;
                            iM55681 = (C0873.m55680("֡֡") ^ i15) * 59;
                            i17 = ((iM55681 ^ i16) * 27739) ^ (-79688813);
                            i7 = 213601063;
                            i8 = iM55681 ^ i7;
                            sArr5 = sArr5;
                            i25 = i25;
                            view2 = view2;
                            i24 = i24;
                            strM55642 = strM55642;
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
                            strM55642 = strM55642;
                            i24 = i24;
                            sArr6 = sArr6;
                            i25 = i25;
                            sArr5 = sArr5;
                            int i27 = (s * s) + 68121;
                            if ((i27 + i27) - i23 >= 0) {
                                iM55681 = C0946.m55979("᩸ۙ") ^ i16;
                                i17 = ((iM55681 ^ i15) * 32187) ^ (-1444071948);
                                i7 = 467135688;
                            } else {
                                iM55681 = (C0873.m55680("ۚܺ") ^ i16) * 93;
                                i17 = ((iM55681 ^ i15) * (-25807)) ^ 106723989;
                                i7 = -888020156;
                            }
                            i8 = iM55681 ^ i7;
                            sArr5 = sArr5;
                            i25 = i25;
                            view2 = view2;
                            i24 = i24;
                            strM55642 = strM55642;
                            sArr = sArr;
                            i18 = i8;
                            sArr6 = sArr6;
                            textView3 = textView3;
                            break;
                        case -1276112218:
                        case 1965074778:
                            iM559711 = C0946.m55979(C0937.m55921(f82953, 263, 3, i19)) ^ 2101981974;
                            if (C1012.m56134() <= 0) {
                                iM55682 = C0946.m55979("ᩴᩳ") ^ i15;
                                i12 = ((iM55682 ^ i16) * (-22149)) ^ 764478265;
                                i13 = 2090562506;
                            } else {
                                iM55682 = C0946.m55979("᩺ۛ") ^ i15;
                                i12 = ((iM55682 ^ i16) * (-19769)) ^ (-1342767799);
                                i13 = -1955734210;
                            }
                            i18 = iM55682 ^ i13;
                            i17 = i12;
                            break;
                        case -1271009368:
                        case 1073013672:
                            sArr = sArr;
                            textView6 = (TextView) C1404.m56465(view2, iM559715 ^ 2130269910);
                            if (C0845.f81821 < 0) {
                                iM55680 = C0873.m55680("᩸ۧ") ^ i15;
                                i = ((iM55680 ^ i16) * (-7129)) ^ (-305402638);
                                i2 = 258432683;
                                sArr7 = sArr;
                                i18 = iM55680 ^ i2;
                                i17 = i;
                            }
                            textView = textView4;
                            str = strM55642;
                            int iM559719 = C0946.m55979("ۨۢ") ^ i15;
                            strM55642 = str;
                            sArr = sArr;
                            i18 = iM559719 ^ 1610938577;
                            TextView textView8 = textView;
                            i17 = ((iM559719 ^ i16) * (-16791)) ^ 714952891;
                            sArr6 = sArr6;
                            textView4 = textView8;
                            break;
                        case -1243968995:
                        case 1100388835:
                            C0917.m55854();
                            if (C0992.f81922 >= 0) {
                                iM55682 = C0946.m55979("ᩴᩳ") ^ i15;
                                i12 = ((iM55682 ^ i16) * (-22149)) ^ 764478265;
                                i13 = 2090562506;
                                i18 = iM55682 ^ i13;
                                i17 = i12;
                            } else {
                                sArr = sArr;
                                textView = textView4;
                                str = strM55642;
                                int iM5597110 = C0946.m55979("ۨۢ") ^ i15;
                                strM55642 = str;
                                sArr = sArr;
                                i18 = iM5597110 ^ 1610938577;
                                TextView textView9 = textView;
                                i17 = ((iM5597110 ^ i16) * (-16791)) ^ 714952891;
                                sArr6 = sArr6;
                                textView4 = textView9;
                            }
                            break;
                        case -1222818308:
                        case 315617391:
                            ViewOnClickListenerC0939.m55941();
                            if (C1024.m56209() >= 0) {
                                sArr = sArr;
                                iM55680 = (C0873.m55680("ۙۙ") + i16) * 25;
                                i = ((iM55680 ^ i15) * (-14771)) ^ 1305060685;
                                i2 = 1057633924;
                                sArr7 = sArr;
                                i18 = iM55680 ^ i2;
                                i17 = i;
                            }
                            sArr = sArr;
                            textView = textView4;
                            str = strM55642;
                            int iM5597111 = C0946.m55979("ۨۢ") ^ i15;
                            strM55642 = str;
                            sArr = sArr;
                            i18 = iM5597111 ^ 1610938577;
                            TextView textView10 = textView;
                            i17 = ((iM5597111 ^ i16) * (-16791)) ^ 714952891;
                            sArr6 = sArr6;
                            textView4 = textView10;
                            break;
                        case -1101519287:
                        case 832991888:
                            sArr2 = sArr;
                            textView2 = textView3;
                            str2 = strM55642;
                            sArr3 = sArr6;
                            i4 = i25;
                            view = view2;
                            sArr4 = sArr5;
                            i10 = i24;
                            iM55684 = C0873.m55680(C0861.m55618(sArr4, i10, 3, i19));
                            if (C0947.f81895) {
                                iM55979 = C0873.m55680("ۚۤ") ^ i16;
                                i3 = i10;
                                i5 = ((iM55979 ^ i15) * (-17935)) ^ 22421416;
                                i11 = -521358;
                            } else {
                                i3 = i10;
                                iM55979 = C0946.m55979("֫ۙ") ^ i16;
                                i5 = ((iM55979 ^ i15) * 22749) ^ (-1627517767);
                                i11 = -418103539;
                            }
                            i6 = iM55979 ^ i11;
                            sArr5 = sArr4;
                            sArr6 = sArr3;
                            i25 = i4;
                            i24 = i3;
                            strM55642 = str2;
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
                            strM55642 = strM55642;
                            sArr6 = sArr6;
                            C1229.m56406(textView3, str4);
                            i9 = i25;
                            iM559714 = C0946.m55979(C0877.m55707(f82953, 248, 3, i19));
                            i21 = 2126060006;
                            if (C1024.m56209() < 0) {
                                int iM55687 = (C0873.m55680("֡᩷") + i16) * (-73);
                                i17 = ((iM55687 ^ i15) * 9583) ^ 1022985523;
                                i8 = iM55687 ^ 2022559287;
                                i25 = i9;
                                strM55642 = strM55642;
                                sArr = sArr;
                                i18 = i8;
                                sArr6 = sArr6;
                                textView3 = textView3;
                            } else {
                                viewM56181 = view2;
                                int iM5597112 = C0946.m55979("ܳܺ") ^ i16;
                                sArr5 = sArr5;
                                sArr6 = sArr6;
                                i25 = i9;
                                i24 = i24;
                                strM55642 = strM55642;
                                textView3 = textView3;
                                sArr = sArr;
                                i18 = iM5597112 ^ 1491946541;
                                i17 = ((iM5597112 ^ i15) * (-4257)) ^ (-1357115516);
                                view2 = viewM56181;
                                c14645 = null;
                            }
                            break;
                        case -914685067:
                        case -571531999:
                            view2 = view2;
                            sArr = sArr;
                            textView3 = textView3;
                            strM55642 = strM55642;
                            i24 = i24;
                            sArr6 = sArr6;
                            i25 = i25;
                            sArr5 = sArr5;
                            iM55683 = C0873.m55680(C0892.m55750(f82953, 242, 3, i19));
                            iM55681 = (C0946.m55979("ۜ۬") ^ i15) * 73;
                            i17 = ((iM55681 ^ i16) * 17897) ^ (-799305342);
                            i7 = 1728679071;
                            i8 = iM55681 ^ i7;
                            sArr5 = sArr5;
                            i25 = i25;
                            view2 = view2;
                            i24 = i24;
                            strM55642 = strM55642;
                            sArr = sArr;
                            i18 = i8;
                            sArr6 = sArr6;
                            textView3 = textView3;
                            break;
                        case -771699886:
                        case -603939936:
                            C1229.m56406((TextView) C0892.m55755(view2, C0946.m55979(strM55863) ^ 2117573493), C0863.m55642(c14645.m33486()));
                            iM55682 = C0873.m55680("۬᩷") ^ i16;
                            i12 = ((iM55682 ^ i15) * 5739) ^ 1626786034;
                            i13 = -1743292410;
                            i18 = iM55682 ^ i13;
                            i17 = i12;
                            break;
                        case -431526913:
                        case 1292326871:
                            i19 = 42754;
                            iM55681 = (C0873.m55680("֡֡") ^ i15) * 59;
                            i17 = ((iM55681 ^ i16) * 27739) ^ (-79688813);
                            i7 = 213601063;
                            i8 = iM55681 ^ i7;
                            sArr5 = sArr5;
                            i25 = i25;
                            view2 = view2;
                            i24 = i24;
                            strM55642 = strM55642;
                            sArr = sArr;
                            i18 = i8;
                            sArr6 = sArr6;
                            textView3 = textView3;
                            break;
                        case -295250319:
                        case 1689009639:
                            iM559712 = C0946.m55979(ViewOnClickListenerC0939.m55947(sArr, 266, 3, i19)) ^ 2118437210;
                            obj = null;
                            if (C1964.f83032 > 0) {
                                iM55682 = C0946.m55979("ܿܽ") ^ i16;
                                i12 = ((iM55682 ^ i15) * 26055) ^ (-2060939898);
                                i13 = 1919738043;
                                i18 = iM55682 ^ i13;
                                i17 = i12;
                            } else {
                                view = view2;
                                sArr2 = sArr;
                                textView2 = textView3;
                                str2 = strM55642;
                                i10 = i24;
                                sArr3 = sArr6;
                                i4 = i25;
                                sArr4 = sArr5;
                                iM55979 = C0873.m55680("ۚۤ") ^ i16;
                                i3 = i10;
                                i5 = ((iM55979 ^ i15) * (-17935)) ^ 22421416;
                                i11 = -521358;
                                i6 = iM55979 ^ i11;
                                sArr5 = sArr4;
                                sArr6 = sArr3;
                                i25 = i4;
                                i24 = i3;
                                strM55642 = str2;
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
                            C1071.m56340(textView5, C0845.m55579(iM33494));
                            iM55685 = C0873.m55680(C1124.m56373(f82953, Scalar25519.TARGET_LENGTH, 3, i19));
                            i22 = 2121716547;
                            iM55680 = (i16 - C0946.m55979("ۢۜ")) * (-5);
                            i = ((iM55680 ^ i15) * 14785) ^ (-1612153305);
                            i2 = 1515031276;
                            sArr7 = sArr;
                            i18 = iM55680 ^ i2;
                            i17 = i;
                            break;
                        case -197241668:
                        case 595834684:
                            sArr = sArr;
                            textView4 = (TextView) C1404.m56465(view2, iM559714 ^ i21);
                            strM55642 = C0863.m55642(c14645.m33496());
                            iM55680 = (C0873.m55680("۟ᩳ") + i15) * 21;
                            i = ((iM55680 ^ i16) * 1475) ^ 1680438677;
                            i2 = 1347263770;
                            sArr7 = sArr;
                            i18 = iM55680 ^ i2;
                            i17 = i;
                            break;
                        case 120729342:
                        case 170109396:
                            break;
                        case 210879906:
                        case 567870514:
                            C1229.m56406(textView6, C0845.m55579(c14645.m33509()));
                            sArr = sArr;
                            strM55863 = C0927.m55863(f82953, 260, 3, i19);
                            if (!AbstractC0942.m55971()) {
                                iM55680 = (C0873.m55680("ܳۤ") ^ i15) * 81;
                                i = ((iM55680 ^ i16) * (-8863)) ^ (-1357764430);
                                i2 = 469289797;
                                sArr7 = sArr;
                                i18 = iM55680 ^ i2;
                                i17 = i;
                            }
                            viewM56181 = view2;
                            textView3 = textView3;
                            strM55642 = strM55642;
                            sArr6 = sArr6;
                            i9 = i25;
                            int iM5597113 = C0946.m55979("ܳܺ") ^ i16;
                            sArr5 = sArr5;
                            sArr6 = sArr6;
                            i25 = i9;
                            i24 = i24;
                            strM55642 = strM55642;
                            textView3 = textView3;
                            sArr = sArr;
                            i18 = iM5597113 ^ 1491946541;
                            i17 = ((iM5597113 ^ i15) * (-4257)) ^ (-1357115516);
                            view2 = viewM56181;
                            c14645 = null;
                            break;
                        case 233292206:
                        case 1918991078:
                            sArr = sArr;
                            textView5 = (TextView) C0892.m55755(view2, C0946.m55979(C0861.m55618(sArr6, i25, i20, i19)) ^ 2128237906);
                            iM33494 = c14645.m33494();
                            if (C0949.f81897 >= 0) {
                                iM55680 = (C0873.m55680("ۙۙ") + i16) * 25;
                                i = ((iM55680 ^ i15) * (-14771)) ^ 1305060685;
                                i2 = 1057633924;
                            } else {
                                iM55680 = C0946.m55979("ۢۛ") ^ i15;
                                i = ((iM55680 ^ i16) * 1109) ^ (-1520917720);
                                i2 = -545619775;
                            }
                            sArr7 = sArr;
                            i18 = iM55680 ^ i2;
                            i17 = i;
                            break;
                        case 325910837:
                        case 1320764893:
                            C1003.m56123();
                            ServiceConnectionC1013.m56157();
                            break;
                        case 360560667:
                        case 779625923:
                            C0894.m55769();
                            ServiceConnectionC1013.m56157();
                            sArr = sArr;
                            textView = textView4;
                            str = strM55642;
                            int iM5597114 = C0946.m55979("ۨۢ") ^ i15;
                            strM55642 = str;
                            sArr = sArr;
                            i18 = iM5597114 ^ 1610938577;
                            TextView textView11 = textView;
                            i17 = ((iM5597114 ^ i16) * (-16791)) ^ 714952891;
                            sArr6 = sArr6;
                            textView4 = textView11;
                            break;
                        case 566391504:
                        case 1378180163:
                            C0927.m55873();
                            if (C0877.f81843 < 0) {
                                sArr = sArr;
                                iM55680 = (C0873.m55680("ۙۙ") + i16) * 25;
                                i = ((iM55680 ^ i15) * (-14771)) ^ 1305060685;
                                i2 = 1057633924;
                                sArr7 = sArr;
                                i18 = iM55680 ^ i2;
                                i17 = i;
                            }
                            view = view2;
                            sArr2 = sArr;
                            textView2 = textView3;
                            str2 = strM55642;
                            i10 = i24;
                            sArr3 = sArr6;
                            i4 = i25;
                            sArr4 = sArr5;
                            iM55979 = C0873.m55680("ۚۤ") ^ i16;
                            i3 = i10;
                            i5 = ((iM55979 ^ i15) * (-17935)) ^ 22421416;
                            i11 = -521358;
                            i6 = iM55979 ^ i11;
                            sArr5 = sArr4;
                            sArr6 = sArr3;
                            i25 = i4;
                            i24 = i3;
                            strM55642 = str2;
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
                            strM55642 = strM55642;
                            sArr6 = sArr6;
                            i9 = i25;
                            viewM56181 = C1017.m56181(abstractActivityC5549, iM55683 ^ 2123663398);
                            if (C0917.f81868) {
                                int iM5597115 = C0946.m55979("ܳܺ") ^ i16;
                                sArr5 = sArr5;
                                sArr6 = sArr6;
                                i25 = i9;
                                i24 = i24;
                                strM55642 = strM55642;
                                textView3 = textView3;
                                sArr = sArr;
                                i18 = iM5597115 ^ 1491946541;
                                i17 = ((iM5597115 ^ i15) * (-4257)) ^ (-1357115516);
                                view2 = viewM56181;
                                c14645 = null;
                            } else {
                                C14645 c14646 = new C14645(bArr, 0, true);
                                sArr5 = f82953;
                                i24 = 245;
                                int iM559720 = C0946.m55979("֡ۛ") ^ i16;
                                sArr6 = sArr6;
                                textView3 = textView3;
                                c14645 = c14646;
                                i17 = ((iM559720 ^ i15) * (-12197)) ^ (-74952224);
                                i25 = i9;
                                strM55642 = strM55642;
                                sArr = sArr;
                                i18 = iM559720 ^ (-594417763);
                                view2 = viewM56181;
                            }
                            break;
                        case 885643035:
                        case 1058349823:
                            C0967.m56080(c20671M55654, iM559713, obj);
                            C1048.m56304(C1229.m56405(RunnableC0871.m55669(c20671M55654)), new ViewOnClickListenerC5619(view2, 2));
                            break;
                        default:
                            sArr = sArr;
                            iM559715 = C0946.m55979(RunnableC0938.m55936(f82953, 257, 3, i19));
                            iM55680 = C0873.m55680("ۡ᩷") ^ i16;
                            i = ((iM55680 ^ i15) * 12795) ^ (-813556851);
                            i2 = -758961079;
                            sArr7 = sArr;
                            i18 = iM55680 ^ i2;
                            i17 = i;
                            break;
                    }
                    return;
                }
            }
            short[] sArr8 = sArr6;
            short[] sArr9 = sArr;
            str3 = strM55642;
            int i28 = i25;
            TextView textView12 = (TextView) C0892.m55755(view2, iM55684 ^ 2130640431);
            String str5 = new String(bArr, 4, 3);
            int iM559721 = C0946.m55979("ܿۘ") ^ i15;
            sArr6 = sArr8;
            textView3 = textView12;
            str4 = str5;
            i17 = ((iM559721 ^ i16) * 8791) ^ 899997277;
            sArr7 = sArr9;
            i18 = iM559721 ^ 36162409;
            i25 = i28;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0221 A[PHI: r2
      0x0221: PHI (r2v23 java.lang.String) = (r2v17 java.lang.String), (r2v19 java.lang.String), (r2v24 java.lang.String) binds: [B:53:0x0207, B:50:0x01ff, B:29:0x00e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x025f A[PHI: r2
      0x025f: PHI (r2v18 java.lang.String) = (r2v16 java.lang.String), (r2v19 java.lang.String) binds: [B:57:0x0247, B:50:0x01ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static void m47301(final C18107 c18107, InterfaceC19370 interfaceC19370) {
        int iM55979;
        int i;
        int i2;
        int iM55680;
        int i3;
        int i4;
        int i5;
        int iM559710;
        int i6;
        int i7;
        int iM55681;
        int i8;
        int i9;
        int iM55682;
        c18107 = c18107;
        final InterfaceC19370 interfaceC19371 = interfaceC19370;
        int i10 = -1503301754;
        int i11 = C1044.f81959;
        int i12 = C1012.f81938;
        int iM55683 = (i12 - C0873.m55680("ۡ᩶")) * (-69);
        int i13 = ((iM55683 ^ i11) * (-30685)) ^ 1373346556;
        int i14 = iM55683 ^ 1264201864;
        String strM56156 = null;
        String strM56584 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i15 = 0;
        int iM55684 = 0;
        int iM559711 = 0;
        int iM559712 = 0;
        short s = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        String strM56157 = null;
        String strM55591 = null;
        ArrayList arrayList = null;
        String strM55639 = null;
        String strM55783 = null;
        StringBuilder sb = null;
        CharSequence[] charSequenceArr = null;
        C20671 c20671M55888 = null;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i11) * 25619) >> 31));
            switch (i10) {
                case -1986957812:
                case 292374744:
                    if (!C1404.m56468()) {
                        strM55591 = strM55591;
                        iM55979 = (i12 - C0946.m55979("ۖ۫")) * (-21);
                        i = ((iM55979 ^ i11) * 18409) ^ 999678972;
                        i2 = 956720631;
                        i14 = iM55979 ^ i2;
                        int i19 = i;
                        strM55591 = strM55591;
                        i13 = i19;
                    } else {
                        strM55591 = strM55591;
                        strM56156 = strM56156;
                        sArr = sArr;
                        i5 = i17;
                        i18 = i18;
                        iM559710 = (i11 - C0946.m55979("ۚ۟")) * 39;
                        i6 = ((iM559710 ^ i12) * 22279) ^ (-701246169);
                        i7 = 2047040071;
                        i14 = iM559710 ^ i7;
                        i18 = i18;
                        i17 = i5;
                        sArr = sArr;
                        strM55591 = strM55591;
                        strM56156 = strM56156;
                        i13 = i6;
                        interfaceC19371 = interfaceC19370;
                    }
                    break;
                case -1828133845:
                case 476060870:
                    C0917.m55854();
                    C0863.m55643();
                    break;
                case -1795016625:
                case -1038704570:
                    C0912.m55825(sb, strM55783);
                    strM55591 = strM55591;
                    C1046.m56290(sb, interfaceC19370.getTime());
                    C1003.m56121(sb, strM55783);
                    C1046.m56290(sb, interfaceC19370.getSize());
                    strM55639 = C0863.m55639(sb);
                    if (!(interfaceC19371 instanceof C14387)) {
                        strM55591 = strM55639;
                        iM55680 = C0946.m55979("᩺᩻") ^ i12;
                        i3 = ((iM55680 ^ i11) * (-19639)) ^ (-72539682);
                        i4 = -1124952011;
                        i14 = iM55680 ^ i4;
                        i13 = i3;
                    } else {
                        iM55979 = C0873.m55680("ܿ᩻") ^ i11;
                        i = ((iM55979 ^ i12) * (-14835)) ^ 1465738874;
                        i2 = 1755011661;
                        i14 = iM55979 ^ i2;
                        int i110 = i;
                        strM55591 = strM55591;
                        i13 = i110;
                    }
                    break;
                case -1665084023:
                case -184466328:
                    strM55591 = strM55591;
                    sb = new StringBuilder();
                    C1003.m56121(sb, interfaceC19370.getPath());
                    sArr2 = f82953;
                    iM55979 = (i11 - C0946.m55979("ۖ֫")) * (-115);
                    i = ((iM55979 ^ i12) * 8781) ^ 1394088097;
                    i2 = 716724154;
                    i14 = iM55979 ^ i2;
                    int i111 = i;
                    strM55591 = strM55591;
                    i13 = i111;
                    break;
                case -1608349302:
                case -695603284:
                    i15 = 850;
                    iM559710 = (i12 - C0946.m55979("۬ۚ")) * (-87);
                    i5 = i17;
                    i6 = ((iM559710 ^ i11) * (-9109)) ^ (-149348155);
                    i7 = 1032441998;
                    i14 = iM559710 ^ i7;
                    i18 = i18;
                    i17 = i5;
                    sArr = sArr;
                    strM55591 = strM55591;
                    strM56156 = strM56156;
                    i13 = i6;
                    interfaceC19371 = interfaceC19370;
                    break;
                case -1455515015:
                case 1071888853:
                    if (C0877.f81843 < 0) {
                        strM55591 = strM55591;
                        strM56156 = strM56156;
                        iM55681 = (i12 - C0873.m55680("۬ܳ")) * 17;
                        i6 = ((iM55681 ^ i11) * 16547) ^ 502830927;
                        i8 = 388373417;
                        i14 = iM55681 ^ i8;
                        strM55591 = strM55591;
                        strM56156 = strM56156;
                        i13 = i6;
                        interfaceC19371 = interfaceC19370;
                    } else {
                        strM55591 = strM55591;
                        iM55979 = (i12 - C0946.m55979("ۖ۫")) * (-21);
                        i = ((iM55979 ^ i11) * 18409) ^ 999678972;
                        i2 = 956720631;
                        i14 = iM55979 ^ i2;
                        int i112 = i;
                        strM55591 = strM55591;
                        i13 = i112;
                    }
                    break;
                case -1408256497:
                case 1663359417:
                    strM55591 = strM55591;
                    if (interfaceC19371 instanceof C14387) {
                        iM55979 = C0873.m55680("᩵ۚ") ^ i12;
                        i = ((iM55979 ^ i11) * (-15669)) ^ 1430625177;
                        i2 = -2090563345;
                    } else {
                        iM55979 = (C0946.m55979("۫ۧ") + i11) * 41;
                        i = ((iM55979 ^ i12) * 13911) ^ (-1201719309);
                        i2 = 531879648;
                    }
                    i14 = iM55979 ^ i2;
                    int i113 = i;
                    strM55591 = strM55591;
                    i13 = i113;
                    break;
                case -1347210312:
                case 1574051367:
                    C0861.m55627(c20671M55888, 2102628217 ^ iM559712);
                    C1025.m56221(c20671M55888);
                    break;
                case -1289120172:
                case 1485613260:
                    strM55591 = strM55591;
                    C0937.m55917(arrayList, ServiceConnectionC1013.m56156(2126989253 ^ iM55684));
                    if (C1024.f81946) {
                        iM55979 = (i12 - C0946.m55979("ۖ۫")) * (-21);
                        i = ((iM55979 ^ i11) * 18409) ^ 999678972;
                        i2 = 956720631;
                    } else {
                        iM55979 = C0946.m55979("ۛ۟") ^ i12;
                        i = ((iM55979 ^ i11) * (-28641)) ^ 713758819;
                        i2 = -1097525084;
                    }
                    i14 = iM55979 ^ i2;
                    int i114 = i;
                    strM55591 = strM55591;
                    i13 = i114;
                    break;
                case -1208769250:
                case -1078130142:
                    C0890.m55740();
                    ServiceConnectionC1013.m56157();
                    strM55591 = strM55591;
                    iM55979 = (i12 - C0946.m55979("ۖ۫")) * (-21);
                    i = ((iM55979 ^ i11) * 18409) ^ 999678972;
                    i2 = 956720631;
                    i14 = iM55979 ^ i2;
                    int i115 = i;
                    strM55591 = strM55591;
                    i13 = i115;
                    break;
                case -1189001713:
                case -524242807:
                    StringBuilder sbM21133 = C9179.m21133(strM55639, strM55783);
                    C0845.m55589(sbM21133, ((C14387) interfaceC19371).m33002().m12763());
                    strM55591 = C0845.m55591(sbM21133);
                    iM55680 = C0946.m55979("᩺᩻") ^ i12;
                    i3 = ((iM55680 ^ i11) * (-19639)) ^ (-72539682);
                    i4 = -1124952011;
                    i14 = iM55680 ^ i4;
                    i13 = i3;
                    break;
                case -1141085650:
                case 1623636587:
                    strM55591 = strM55591;
                    iM559712 = C0946.m55979(C0866.m55652(f82953, 348, 3, i15));
                    iM55979 = (C0946.m55979("ܿܶ") ^ i12) * (-127);
                    i = ((iM55979 ^ i11) * 13091) ^ 1949528650;
                    i2 = 2003051352;
                    i14 = iM55979 ^ i2;
                    int i116 = i;
                    strM55591 = strM55591;
                    i13 = i116;
                    break;
                case -1107599257:
                case 193042664:
                    strM55591 = strM55591;
                    iM559711 = C0946.m55979(C1404.m56462(f82953, 345, 3, i15));
                    iM55979 = (C0946.m55979("ܶ۫") + i11) * 97;
                    i = ((iM55979 ^ i12) * (-9693)) ^ 937690319;
                    i2 = 1771645650;
                    i14 = iM55979 ^ i2;
                    int i117 = i;
                    strM55591 = strM55591;
                    i13 = i117;
                    break;
                case -1096704761:
                case 386512306:
                    strM55591 = strM55591;
                    strM56156 = strM56156;
                    sArr = sArr;
                    i5 = i17;
                    i18 = i18;
                    if ((i16 * i16) - ((s * 2) + 1) < 0) {
                        iM559710 = C0946.m55979("ᩳ۫") ^ i11;
                        i6 = ((iM559710 ^ i12) * 22739) ^ (-1171958050);
                        i7 = 1590805676;
                    } else {
                        iM559710 = C0946.m55979("ۖܺ") ^ i11;
                        i6 = ((iM559710 ^ i12) * 5415) ^ 1774527329;
                        i7 = -769965415;
                    }
                    i14 = iM559710 ^ i7;
                    i18 = i18;
                    i17 = i5;
                    sArr = sArr;
                    strM55591 = strM55591;
                    strM56156 = strM56156;
                    i13 = i6;
                    interfaceC19371 = interfaceC19370;
                    break;
                case -1032149852:
                case 165004842:
                    f65868.submit(new RunnableC4201(c18107, interfaceC19371));
                    strM55591 = strM55591;
                    iM55979 = (C0946.m55979("۫ۧ") + i11) * 41;
                    i = ((iM55979 ^ i12) * 13911) ^ (-1201719309);
                    i2 = 531879648;
                    i14 = iM55979 ^ i2;
                    int i118 = i;
                    strM55591 = strM55591;
                    i13 = i118;
                    break;
                case -1019199489:
                case 735631263:
                    strM55591 = strM55591;
                    C0937.m55917(arrayList, ServiceConnectionC1013.m56156(2121929997 ^ iM559711));
                    if (interfaceC19371 instanceof C11450) {
                        iM55979 = C0873.m55680("᩵ۚ") ^ i12;
                        i = ((iM55979 ^ i11) * (-15669)) ^ 1430625177;
                        i2 = -2090563345;
                    } else {
                        iM55979 = C0946.m55979("ۜ۬") ^ i12;
                        i = ((iM55979 ^ i11) * 10305) ^ 817989334;
                        i2 = -701474559;
                    }
                    i14 = iM55979 ^ i2;
                    int i119 = i;
                    strM55591 = strM55591;
                    i13 = i119;
                    break;
                case -922052172:
                case 326217827:
                    strM55591 = strM55591;
                    c20671M55888 = C0930.m55888(C1964.m56594(c18107));
                    charSequenceArr = (CharSequence[]) arrayList.toArray(new String[0]);
                    if (C0845.f81821 < 0) {
                        iM55979 = C0873.m55680("ۘ᩷") ^ i11;
                        i = ((iM55979 ^ i12) * 25425) ^ 249812848;
                        i2 = -612712635;
                        i14 = iM55979 ^ i2;
                        int i1110 = i;
                        strM55591 = strM55591;
                        i13 = i1110;
                    } else {
                        strM56156 = strM56156;
                        iM55681 = (i11 - C0873.m55680("֨ۜ")) * 63;
                        i6 = ((iM55681 ^ i12) * 1255) ^ (-1813090048);
                        i8 = 654448421;
                        i14 = iM55681 ^ i8;
                        strM55591 = strM55591;
                        strM56156 = strM56156;
                        i13 = i6;
                        interfaceC19371 = interfaceC19370;
                    }
                    break;
                case -520702242:
                case 2057190025:
                    strM55591 = strM55591;
                    strM56156 = strM56156;
                    sArr = sArr;
                    i5 = i17;
                    i18 = i18;
                    s = f82953[335];
                    i16 = s + 1;
                    if (C1024.f81946) {
                        iM559710 = (i11 - C0946.m55979("ۚ۟")) * 39;
                        i6 = ((iM559710 ^ i12) * 22279) ^ (-701246169);
                        i7 = 2047040071;
                    } else {
                        iM559710 = C0946.m55979("᩶ܿ") ^ i12;
                        i6 = ((iM559710 ^ i11) * (-6327)) ^ (-1440767436);
                        i7 = -1575037677;
                    }
                    i14 = iM559710 ^ i7;
                    i18 = i18;
                    i17 = i5;
                    sArr = sArr;
                    strM55591 = strM55591;
                    strM56156 = strM56156;
                    i13 = i6;
                    interfaceC19371 = interfaceC19370;
                    break;
                case -370161114:
                case 184123815:
                    strM55591 = strM55591;
                    strM56156 = strM56156;
                    short[] sArr3 = sArr;
                    int i20 = i17;
                    i18 = i18;
                    strM56157 = ServiceConnectionC1013.m56156(C0946.m55979(C0955.m56029(sArr3, i20, i18, i15)) ^ 2123137569);
                    if (C0877.f81843 >= 0) {
                        sArr = sArr3;
                        i5 = i20;
                        iM559710 = (i11 - C0946.m55979("ۚ۟")) * 39;
                        i6 = ((iM559710 ^ i12) * 22279) ^ (-701246169);
                        i7 = 2047040071;
                        i14 = iM559710 ^ i7;
                        i18 = i18;
                        i17 = i5;
                        sArr = sArr;
                        strM55591 = strM55591;
                        strM56156 = strM56156;
                        i13 = i6;
                        interfaceC19371 = interfaceC19370;
                    } else {
                        int iM55685 = (C0873.m55680("᩶᩷") + i12) * (-71);
                        int i21 = ((iM55685 ^ i11) * (-28343)) ^ 1254269561;
                        i14 = iM55685 ^ (-1131728576);
                        i17 = i20;
                        strM56156 = strM56156;
                        i18 = i18;
                        sArr = sArr3;
                        interfaceC19371 = interfaceC19370;
                        strM55591 = strM55591;
                        i13 = i21;
                        c18107 = c18107;
                    }
                    break;
                case -309317560:
                case 1514178661:
                    i15 = 32597;
                    iM559710 = (i12 - C0946.m55979("۬ۚ")) * (-87);
                    i5 = i17;
                    i6 = ((iM559710 ^ i11) * (-9109)) ^ (-149348155);
                    i7 = 1032441998;
                    i14 = iM559710 ^ i7;
                    i18 = i18;
                    i17 = i5;
                    sArr = sArr;
                    strM55591 = strM55591;
                    strM56156 = strM56156;
                    i13 = i6;
                    interfaceC19371 = interfaceC19370;
                    break;
                case 30359048:
                case 688014175:
                    strM55591 = strM55591;
                    strM56156 = strM56156;
                    C1194.m56393(arrayList, strM56156);
                    iM55684 = C0873.m55680(RunnableC0871.m55667(f82953, 342, 3, i15));
                    if (C1044.f81959 < 0) {
                        int iM559713 = (i11 - C0946.m55979("ۗۙ")) * 19;
                        i = ((iM559713 ^ i12) * (-21523)) ^ 1530686906;
                        i14 = iM559713 ^ 1178516622;
                        c18107 = c18107;
                        strM56156 = strM56156;
                        int i1111 = i;
                        strM55591 = strM55591;
                        i13 = i1111;
                    } else {
                        sArr = sArr;
                        i5 = i17;
                        i18 = i18;
                        iM559710 = (i11 - C0946.m55979("ۚ۟")) * 39;
                        i6 = ((iM559710 ^ i12) * 22279) ^ (-701246169);
                        i7 = 2047040071;
                        i14 = iM559710 ^ i7;
                        i18 = i18;
                        i17 = i5;
                        sArr = sArr;
                        strM55591 = strM55591;
                        strM56156 = strM56156;
                        i13 = i6;
                        interfaceC19371 = interfaceC19370;
                    }
                    break;
                case 166038620:
                case 1858064379:
                    if (!ServiceConnectionC1013.m56151(f65866, strM55591)) {
                        strM55591 = strM55591;
                        iM55979 = (C0946.m55979("۫ۧ") + i11) * 41;
                        i = ((iM55979 ^ i12) * 13911) ^ (-1201719309);
                        i2 = 531879648;
                        i14 = iM55979 ^ i2;
                        int i1112 = i;
                        strM55591 = strM55591;
                        i13 = i1112;
                    } else {
                        iM55680 = C0873.m55680("۠۠") ^ i11;
                        i3 = ((iM55680 ^ i12) * (-2941)) ^ 1862901342;
                        i4 = -2121397262;
                        i14 = iM55680 ^ i4;
                        i13 = i3;
                    }
                    break;
                case 305824273:
                case 1884033362:
                    if (C0863.f81833 > 0) {
                        strM55591 = strM55591;
                        strM56156 = strM56156;
                        iM55681 = (i11 - C0873.m55680("֨ۜ")) * 63;
                        i6 = ((iM55681 ^ i12) * 1255) ^ (-1813090048);
                        i8 = 654448421;
                        i14 = iM55681 ^ i8;
                        strM55591 = strM55591;
                        strM56156 = strM56156;
                        i13 = i6;
                        interfaceC19371 = interfaceC19370;
                    }
                    strM55591 = strM55591;
                    strM56156 = strM56156;
                    sArr = sArr;
                    i5 = i17;
                    i18 = i18;
                    iM559710 = (i11 - C0946.m55979("ۚ۟")) * 39;
                    i6 = ((iM559710 ^ i12) * 22279) ^ (-701246169);
                    i7 = 2047040071;
                    i14 = iM559710 ^ i7;
                    i18 = i18;
                    i17 = i5;
                    sArr = sArr;
                    strM55591 = strM55591;
                    strM56156 = strM56156;
                    i13 = i6;
                    interfaceC19371 = interfaceC19370;
                    break;
                case 443358972:
                case 1177065102:
                    strM55591 = strM55591;
                    strM56156 = ServiceConnectionC1013.m56156(C0946.m55979(strM56584) ^ 2097301620);
                    if (C1071.m56343() != 0) {
                        iM55682 = (C0873.m55680("᩹ܽ") + i12) * (-41);
                        i3 = ((iM55682 ^ i11) * 30129) ^ 1385616463;
                        i9 = -318616315;
                    } else {
                        iM55682 = (i12 - C0873.m55680("ᩴᩳ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i3 = ((iM55682 ^ i11) * (-25941)) ^ 1977467716;
                        i9 = -1140016962;
                    }
                    i14 = iM55682 ^ i9;
                    c18107 = c18107;
                    strM55591 = strM55591;
                    i13 = i3;
                    break;
                case 913565890:
                case 2066969628:
                    strM55591 = strM55591;
                    if (C0927.m55866()) {
                        iM55979 = (i11 - C0873.m55680("᩺۟")) * (-37);
                        i = ((iM55979 ^ i12) * 14199) ^ (-901659570);
                        i2 = -1102098743;
                    } else {
                        iM55979 = (C0946.m55979("۫ۧ") + i11) * 41;
                        i = ((iM55979 ^ i12) * 13911) ^ (-1201719309);
                        i2 = 531879648;
                    }
                    i14 = iM55979 ^ i2;
                    int i1113 = i;
                    strM55591 = strM55591;
                    i13 = i1113;
                    break;
                case 1273599300:
                case 1443442183:
                    strM55591 = strM55591;
                    strM56156 = strM56156;
                    arrayList = new ArrayList(4);
                    sArr = f82953;
                    i17 = 336;
                    i18 = 3;
                    if (C0949.f81897 >= 0) {
                        iM55681 = (i12 - C0873.m55680("۬ܳ")) * 17;
                        i6 = ((iM55681 ^ i11) * 16547) ^ 502830927;
                        i8 = 388373417;
                    } else {
                        iM55681 = (C0873.m55680("᩹ۤ") + i11) * (-57);
                        i6 = ((iM55681 ^ i12) * 23673) ^ 975483124;
                        i8 = -1443281582;
                    }
                    i14 = iM55681 ^ i8;
                    strM55591 = strM55591;
                    strM56156 = strM56156;
                    i13 = i6;
                    interfaceC19371 = interfaceC19370;
                    break;
                case 1394688002:
                case 1863017325:
                    strM55591 = strM55591;
                    c20671M55888.m46723(charSequenceArr, -1, new DialogInterface.OnClickListener() { // from class: l.ܰۢܳ

                        /* JADX INFO: renamed from: ۛᩳ᩵, reason: not valid java name and contains not printable characters */
                        private static final short[] f82206 = {7579, 6519, 4048, 8079, 15834, 6222, 7340};

                        {
                            int i22 = -1129193524;
                            int i23 = C0967.f81910;
                            int i24 = C0912.f81867;
                            int iM559714 = (i24 - C0946.m55979("᩻֡")) * 15;
                            int i25 = ((iM559714 ^ i23) * (-30229)) ^ (-363660229);
                            int i26 = -123268133;
                            while (true) {
                                i22 = ((((i22 ^ i23) * (-10231)) >> 31) & i25) ^ (iM559714 ^ i26);
                                switch (i22) {
                                    case -2034299914:
                                    case 520092950:
                                        return;
                                    case -1357483080:
                                    case -842032200:
                                        if (C0863.m55643()) {
                                            iM559714 = (C0946.m55979("۬᩸") ^ i23) * (-65);
                                            i25 = ((iM559714 ^ i24) * (-32209)) ^ (-1830805788);
                                            i26 = -1783460418;
                                        } else {
                                            iM559714 = (C0946.m55979("ۖ֫") + i24) * (-83);
                                            i25 = ((iM559714 ^ i23) * 22137) ^ (-968319482);
                                            i26 = 319203001;
                                        }
                                        break;
                                    case -1130626301:
                                    case 1218634577:
                                        if (C0906.f81862 >= 0) {
                                            iM559714 = C0946.m55979("᩹ܺ") ^ i23;
                                            i25 = ((iM559714 ^ i24) * 12413) ^ 1189529496;
                                            i26 = 1722123439;
                                        } else {
                                            iM559714 = C0873.m55680("۟᩹") ^ i24;
                                            i25 = ((iM559714 ^ i23) * (-745)) ^ (-325756584);
                                            i26 = 1133595220;
                                        }
                                        break;
                                    case -1086449804:
                                    case 878741147:
                                        if (C1025.m56230()) {
                                            iM559714 = C0946.m55979("᩹ܺ") ^ i23;
                                            i25 = ((iM559714 ^ i24) * 12413) ^ 1189529496;
                                            i26 = 1722123439;
                                        } else {
                                            iM559714 = C0946.m55979("ܿۘ") ^ i23;
                                            i25 = ((iM559714 ^ i24) * (-21387)) ^ 63914853;
                                            i26 = -1618974009;
                                        }
                                        break;
                                    case -1072727191:
                                    case -567315250:
                                        if (C0866.f81837 >= 0) {
                                            iM559714 = (C0946.m55979("ۖ֫") + i24) * (-83);
                                            i25 = ((iM559714 ^ i23) * 22137) ^ (-968319482);
                                            i26 = 319203001;
                                        } else {
                                            iM559714 = (C0873.m55680("ܿۜ") + i23) * 57;
                                            i25 = ((iM559714 ^ i24) * (-8211)) ^ (-1613395277);
                                            i26 = 1108402835;
                                        }
                                        break;
                                    case -958134902:
                                    case -809242584:
                                        if (C1028.f81950 <= 0) {
                                            iM559714 = C0873.m55680("᩵ۤ") ^ i23;
                                            i25 = ((iM559714 ^ i24) * (-22573)) ^ (-1441755999);
                                            i26 = 2048761682;
                                        } else {
                                            iM559714 = C0873.m55680("᩷ۙ") ^ i23;
                                            i25 = ((iM559714 ^ i24) * 26433) ^ (-90717175);
                                            i26 = -1478154497;
                                        }
                                        break;
                                    case -419946020:
                                    case 661002253:
                                        if (C1046.m56302() != 0) {
                                            iM559714 = (C0946.m55979("ۖ֫") + i24) * (-83);
                                            i25 = ((iM559714 ^ i23) * 22137) ^ (-968319482);
                                            i26 = 319203001;
                                        } else {
                                            iM559714 = (i23 - C0946.m55979("۟۠")) * (-95);
                                            i25 = ((iM559714 ^ i24) * (-17669)) ^ 1660107698;
                                            i26 = 1176874330;
                                        }
                                        break;
                                    case -318605542:
                                    case -13207393:
                                        C1024.m56209();
                                        iM559714 = C0873.m55680("۟᩹") ^ i24;
                                        i25 = ((iM559714 ^ i23) * (-745)) ^ (-325756584);
                                        i26 = 1133595220;
                                        break;
                                    case -239440887:
                                    case 1700940597:
                                        C1929.m56553();
                                        if (C0930.f81879 <= 0) {
                                            iM559714 = C0946.m55979("᩹ܺ") ^ i23;
                                            i25 = ((iM559714 ^ i24) * 12413) ^ 1189529496;
                                            i26 = 1722123439;
                                        } else {
                                            iM559714 = C0873.m55680("ᩳۘ") ^ i24;
                                            i25 = ((iM559714 ^ i23) * 18643) ^ 297588557;
                                            i26 = 191562240;
                                        }
                                        break;
                                    case -139723216:
                                    case 1408009:
                                        if (C1053.f81965 <= 0) {
                                            iM559714 = C0873.m55680("۟᩹") ^ i24;
                                            i25 = ((iM559714 ^ i23) * (-745)) ^ (-325756584);
                                            i26 = 1133595220;
                                        } else {
                                            iM559714 = C0873.m55680("ۚۨ") ^ i24;
                                            i25 = ((iM559714 ^ i23) * (-25313)) ^ 1694280336;
                                            i26 = -1945505550;
                                        }
                                        break;
                                    case 5996218:
                                    case 1506582868:
                                        C0882.m55710();
                                        C0892.m55749();
                                        throw new RuntimeException();
                                    case 337921514:
                                    case 629285378:
                                        if (C0863.m55643()) {
                                            iM559714 = (C0873.m55680("ۛ᩺") + i24) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                            i25 = ((iM559714 ^ i23) * 32097) ^ 1929388952;
                                            i26 = 1111150000;
                                        } else {
                                            iM559714 = C0946.m55979("᩹ܺ") ^ i23;
                                            i25 = ((iM559714 ^ i24) * 12413) ^ 1189529496;
                                            i26 = 1722123439;
                                        }
                                        break;
                                    case 401794316:
                                    case 498452563:
                                        C0917.m55854();
                                        if (C0946.f81894 != 0) {
                                            iM559714 = C0873.m55680("᩵ۤ") ^ i23;
                                            i25 = ((iM559714 ^ i24) * (-22573)) ^ (-1441755999);
                                            i26 = 2048761682;
                                        } else {
                                            iM559714 = C0946.m55979("᩹ܺ") ^ i23;
                                            i25 = ((iM559714 ^ i24) * 12413) ^ 1189529496;
                                            i26 = 1722123439;
                                        }
                                        break;
                                    case 433489634:
                                    case 742577641:
                                        if (C0906.m55809() <= 0) {
                                            iM559714 = C0873.m55680("᩵ۤ") ^ i23;
                                            i25 = ((iM559714 ^ i24) * (-22573)) ^ (-1441755999);
                                            i26 = 2048761682;
                                        } else {
                                            iM559714 = C0946.m55979("۫᩷") ^ i24;
                                            i25 = ((iM559714 ^ i23) * (-18135)) ^ (-744505373);
                                            i26 = -51102708;
                                        }
                                        break;
                                    case 715050608:
                                    case 1442105114:
                                        if (RunnableC0897.f81856) {
                                            iM559714 = C0946.m55979("ۛۤ") ^ i24;
                                            i25 = ((iM559714 ^ i23) * 26213) ^ 1433495725;
                                            i26 = -321096891;
                                        } else {
                                            iM559714 = C0873.m55680("᩵ۤ") ^ i23;
                                            i25 = ((iM559714 ^ i24) * (-22573)) ^ (-1441755999);
                                            i26 = 2048761682;
                                        }
                                        break;
                                    default:
                                        if (C1044.f81959 >= 0) {
                                            iM559714 = (C0946.m55979("ۖ֫") + i24) * (-83);
                                            i25 = ((iM559714 ^ i23) * 22137) ^ (-968319482);
                                            i26 = 319203001;
                                        } else {
                                            iM559714 = C0873.m55680("۠֫") ^ i24;
                                            i25 = ((iM559714 ^ i23) * (-15755)) ^ (-607045728);
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
                        
                            if (p067l.C1071.f81975 <= 0) goto L34;
                         */
                        @Override // android.content.DialogInterface.OnClickListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void onClick(DialogInterface dialogInterface, int i22) {
                            int i23;
                            int iM55686;
                            int i24;
                            int i25;
                            C18107 c18108;
                            int iM55687;
                            C18107 c18109;
                            int i26;
                            int i27;
                            int iM559714;
                            int iM55688;
                            int i28;
                            int i29;
                            int i30;
                            int iM55689;
                            int i31;
                            int i32;
                            int i33 = 1286551286;
                            int i34 = C1044.f81959;
                            int i35 = C0967.f81910;
                            int iM559715 = (i34 - C0946.m55979("ܳܺ")) * 127;
                            int i36 = ((iM559715 ^ i35) * (-17089)) ^ 210150130;
                            int i37 = iM559715 ^ (-780158439);
                            final InterfaceC19370 interfaceC19372 = null;
                            Object obj = null;
                            short[] sArr4 = null;
                            short[] sArr5 = null;
                            int i38 = 0;
                            final C18107 c181010 = null;
                            int i39 = 0;
                            int iM556810 = 0;
                            int i40 = 0;
                            int i41 = 0;
                            int i42 = 0;
                            short s2 = 0;
                            int i43 = 0;
                            int i44 = 0;
                            short s3 = 0;
                            int i45 = 0;
                            InterfaceC17021 interfaceC17021 = null;
                            short[] sArr6 = null;
                            boolean z = false;
                            int i46 = 0;
                            while (true) {
                                i33 = i37 ^ (i36 & (((i33 ^ i35) * (-1385)) >> 31));
                                switch (i33) {
                                    case -2095020442:
                                    case -1010657207:
                                        C0917.m55842(iM556810);
                                        new ViewOnClickListenerC2424(C1964.m56594(c181010));
                                        break;
                                    case -1988259546:
                                    case 1803676618:
                                        C1028.m56247();
                                        if (RunnableC1014.f81941 > 0) {
                                            iM55689 = C0946.m55979("ۚ᩸") ^ i35;
                                            i31 = ((iM55689 ^ i34) * (-23623)) ^ 320714373;
                                            i32 = -1614801800;
                                        } else {
                                            iM55689 = (C0946.m55979("ܿᩴ") + i35) * 71;
                                            i31 = ((iM55689 ^ i34) * 23987) ^ (-1486797768);
                                            i32 = 1314412526;
                                        }
                                        i37 = iM55689 ^ i32;
                                        i36 = i31;
                                        break;
                                    case -1982765380:
                                    case 1190419414:
                                        C0892.m55749();
                                        C0967.m56074();
                                        sArr4 = sArr4;
                                        iM55686 = C0946.m55979("ۙ۬") ^ i34;
                                        i23 = i38;
                                        i24 = ((iM55686 ^ i35) * 12883) ^ 1055178212;
                                        i25 = 1089052288;
                                        i37 = iM55686 ^ i25;
                                        i36 = i24;
                                        i38 = i23;
                                        sArr4 = sArr4;
                                        break;
                                    case -1964957471:
                                    case 1853230225:
                                        if (C0882.m55713()) {
                                            iM55689 = C0946.m55979("۫۫") ^ i35;
                                            i31 = ((iM55689 ^ i34) * (-20819)) ^ (-677747147);
                                            i32 = 1139504421;
                                        } else {
                                            iM55689 = C0946.m55979("᩷ۗ") ^ i35;
                                            i31 = ((iM55689 ^ i34) * (-8093)) ^ 2022988489;
                                            i32 = 928505821;
                                        }
                                        i37 = iM55689 ^ i32;
                                        i36 = i31;
                                        break;
                                    case -1946262165:
                                    case 1494985730:
                                        i39 = i40 ^ i46;
                                        sArr5 = f82206;
                                        i38 = 4;
                                        i42 = 3;
                                        if (C0930.f81879 > 0) {
                                            iM55689 = C0873.m55680("ۧۚ") ^ i34;
                                            i31 = ((iM55689 ^ i35) * (-6707)) ^ 1220269630;
                                            i32 = -1302406456;
                                            i37 = iM55689 ^ i32;
                                            i36 = i31;
                                        } else {
                                            sArr4 = sArr4;
                                            iM55686 = C0946.m55979("ۙ۬") ^ i34;
                                            i23 = i38;
                                            i24 = ((iM55686 ^ i35) * 12883) ^ 1055178212;
                                            i25 = 1089052288;
                                            i37 = iM55686 ^ i25;
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
                                        if (C1024.f81946) {
                                            i38 = i23;
                                            iM55686 = C0946.m55979("ۙ۬") ^ i34;
                                            i23 = i38;
                                            i24 = ((iM55686 ^ i35) * 12883) ^ 1055178212;
                                            i25 = 1089052288;
                                        } else {
                                            iM55686 = (C0873.m55680("ۤ᩻") ^ i34) * (-85);
                                            i24 = ((iM55686 ^ i35) * (-23167)) ^ 796991132;
                                            i25 = -1188997580;
                                        }
                                        i37 = iM55686 ^ i25;
                                        i36 = i24;
                                        i38 = i23;
                                        sArr4 = sArr4;
                                        break;
                                    case -1869003646:
                                    case -1567546681:
                                        break;
                                    case -1806636069:
                                    case 1495874317:
                                        C0947.m55997();
                                        if (ServiceConnectionC1013.f81940 < 0) {
                                            iM55689 = (C0873.m55680("ۜۙ") ^ i34) * 49;
                                            i31 = ((iM55689 ^ i35) * (-25759)) ^ 918755169;
                                            i32 = 1771171734;
                                            i37 = iM55689 ^ i32;
                                            i36 = i31;
                                        } else {
                                            c18108 = c181010;
                                            sArr4 = sArr4;
                                            iM55687 = (C0873.m55680("᩹ۜ") ^ i35) * (-27);
                                            c18109 = c18108;
                                            i36 = ((iM55687 ^ i34) * 25193) ^ (-303510167);
                                            i26 = -862441745;
                                            i30 = iM55687 ^ i26;
                                            c181010 = c18109;
                                            i37 = i30;
                                            sArr4 = sArr4;
                                        }
                                        break;
                                    case -1786383664:
                                    case 417908676:
                                        if (C0927.m55866()) {
                                            iM55689 = (i34 - C0873.m55680("֫ۖ")) * 91;
                                            i31 = ((iM55689 ^ i35) * 32403) ^ (-1225386793);
                                            i32 = -302482120;
                                        } else {
                                            iM55689 = C0873.m55680("֡᩹") ^ i34;
                                            i31 = ((iM55689 ^ i35) * (-21363)) ^ (-529240024);
                                            i32 = -1189166323;
                                        }
                                        i37 = iM55689 ^ i32;
                                        i36 = i31;
                                        break;
                                    case -1782334185:
                                    case -356284993:
                                        if (C0894.m55772()) {
                                            iM55689 = (C0873.m55680("ܶۨ") ^ i35) * (-69);
                                            i31 = ((iM55689 ^ i34) * 17927) ^ (-669623390);
                                            i32 = -918913774;
                                        } else {
                                            iM55689 = (C0946.m55979("ۨܳ") + i34) * 5;
                                            i31 = ((iM55689 ^ i35) * 24441) ^ (-601720692);
                                            i32 = 1778988006;
                                        }
                                        i37 = iM55689 ^ i32;
                                        i36 = i31;
                                        break;
                                    case -1780086425:
                                    case -2655775:
                                        if (C11164.m25765(C1929.m56560(c181010))) {
                                            iM55689 = C0873.m55680("ۙ᩶") ^ i35;
                                            i31 = ((iM55689 ^ i34) * 17227) ^ 1577143925;
                                            i32 = -482835107;
                                        } else {
                                            iM55689 = C0873.m55680("᩶ۛ") ^ i35;
                                            i31 = ((iM55689 ^ i34) * (-21885)) ^ 1486168483;
                                            i32 = 987484442;
                                        }
                                        i37 = iM55689 ^ i32;
                                        i36 = i31;
                                        break;
                                    case -1739538371:
                                    case 2105302980:
                                        C20966.m47302(c181010, interfaceC19372, ActivityC3142.class);
                                        break;
                                    case -1727667955:
                                    case -743440389:
                                        C0898.m55800();
                                        if (C0906.f81862 >= 0) {
                                            iM55689 = (C0873.m55680("ۜۙ") ^ i34) * 49;
                                            i31 = ((iM55689 ^ i35) * (-25759)) ^ 918755169;
                                            i32 = 1771171734;
                                        } else {
                                            iM55689 = C0946.m55979("ۚ᩸") ^ i35;
                                            i31 = ((iM55689 ^ i34) * (-23623)) ^ 320714373;
                                            i32 = -1614801800;
                                        }
                                        i37 = iM55689 ^ i32;
                                        i36 = i31;
                                        break;
                                    case -1706033413:
                                    case -1210101835:
                                        RunnableC0897.m55789(c181010, interfaceC19372, new C5171(2, c181010));
                                        break;
                                    case -1572009130:
                                    case -828289232:
                                        if (i22 != 4) {
                                            iM55689 = C0873.m55680("ܺ۬") ^ i35;
                                            i31 = ((iM55689 ^ i34) * (-7993)) ^ 1043147237;
                                            i32 = 1473438075;
                                        } else {
                                            iM55689 = C0946.m55979("ܶۤ") ^ i35;
                                            i31 = ((iM55689 ^ i34) * (-20449)) ^ (-1704809200);
                                            i32 = 300667073;
                                        }
                                        i37 = iM55689 ^ i32;
                                        i36 = i31;
                                        break;
                                    case -1535598371:
                                    case -1091212334:
                                        i41 = 28569;
                                        iM55686 = C0873.m55680("۬ۢ") ^ i34;
                                        i23 = i38;
                                        i24 = ((iM55686 ^ i35) * (-12447)) ^ 1823196412;
                                        i25 = -1175987837;
                                        i37 = iM55686 ^ i25;
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
                                        if (C0898.f81858 <= 0) {
                                            iM55686 = (i34 - C0873.m55680("ܺᩴ")) * (-35);
                                            i24 = ((iM55686 ^ i35) * (-8475)) ^ (-1900642036);
                                            i25 = -1028968661;
                                        } else {
                                            iM55686 = (i34 - C0946.m55979("ۗ۬")) * (-3);
                                            i24 = ((iM55686 ^ i35) * (-21427)) ^ 1297135907;
                                            i25 = -178692790;
                                        }
                                        i37 = iM55686 ^ i25;
                                        i36 = i24;
                                        i38 = i23;
                                        sArr4 = sArr4;
                                        break;
                                    case -1317264789:
                                    case -5622349:
                                        interfaceC17021 = null;
                                        iM55689 = C0873.m55680("ܶ᩸") ^ i34;
                                        i31 = ((iM55689 ^ i35) * (-23765)) ^ 1000930323;
                                        i32 = -1206560573;
                                        i37 = iM55689 ^ i32;
                                        i36 = i31;
                                        break;
                                    case -1125110583:
                                    case 706101988:
                                        C1964.m56594(c181010).m12271(i39);
                                        break;
                                    case -1045752934:
                                    case 1755095988:
                                        RunnableC0897.m55789(c181010, interfaceC19372, new InterfaceC20295() { // from class: l.᩷ۡܳ
                                            @Override // p067l.InterfaceC20295
                                            /* JADX INFO: renamed from: ۧ */
                                            public final void mo8469(AbstractC17043 abstractC17043) {
                                                int i48 = -1014491148;
                                                int i49 = C1046.f81962;
                                                int i50 = C1028.f81950;
                                                int iM556811 = C0873.m55680("᩻ۨ") ^ i49;
                                                int i51 = ((iM556811 ^ i50) * 23583) ^ (-458432874);
                                                int i52 = -1407738493;
                                                while (true) {
                                                    i48 = ((((i48 ^ i50) * 23901) >> 31) & i51) ^ (iM556811 ^ i52);
                                                    switch (i48) {
                                                        case -1956710502:
                                                        case -981189915:
                                                            if (C0877.f81843 >= 0) {
                                                                iM556811 = (C0873.m55680("ۨ᩷") ^ i49) * (-5);
                                                                i51 = ((iM556811 ^ i50) * 21557) ^ 444704554;
                                                                i52 = -1036656244;
                                                            } else {
                                                                iM556811 = C0873.m55680("ۘۙ") ^ i49;
                                                                i51 = ((iM556811 ^ i50) * (-6813)) ^ (-11649273);
                                                                i52 = 258252461;
                                                            }
                                                            break;
                                                        case -1943728972:
                                                        case 177172831:
                                                            if (C1929.f83011 == 0) {
                                                                iM556811 = (C0873.m55680("ۗ֡") ^ i50) * 39;
                                                                i51 = ((iM556811 ^ i49) * 28137) ^ 939521104;
                                                                i52 = 2126655116;
                                                            } else {
                                                                iM556811 = C0946.m55979("֡֫") ^ i50;
                                                                i51 = ((iM556811 ^ i49) * (-8507)) ^ 1474556838;
                                                                i52 = 1227360001;
                                                            }
                                                            break;
                                                        case -1404606405:
                                                        case 2035550493:
                                                            if (C0845.f81821 >= 0) {
                                                                iM556811 = C0873.m55680("ۖ۟") ^ i50;
                                                                i51 = ((iM556811 ^ i49) * (-12995)) ^ 1833448000;
                                                                i52 = 1182938117;
                                                            } else {
                                                                iM556811 = (i50 - C0873.m55680("۠ܺ")) * 57;
                                                                i51 = ((iM556811 ^ i49) * 29979) ^ 1972861778;
                                                                i52 = -296130936;
                                                            }
                                                            break;
                                                        case -1223231904:
                                                        case 804387790:
                                                            ServiceConnectionC1013.m56157();
                                                            C1929.m56553();
                                                            break;
                                                        case -1172976651:
                                                        case 141118587:
                                                            if (C0866.f81837 >= 0) {
                                                                iM556811 = (C0873.m55680("ۨ᩷") ^ i49) * (-5);
                                                                i51 = ((iM556811 ^ i50) * 21557) ^ 444704554;
                                                                i52 = -1036656244;
                                                            } else {
                                                                iM556811 = (C0873.m55680("ᩴ᩺") ^ i50) * (-5);
                                                                i51 = ((iM556811 ^ i49) * 24763) ^ (-1564266611);
                                                                i52 = 1994594187;
                                                            }
                                                            break;
                                                        case -877525592:
                                                        case 623984194:
                                                            if (C0946.f81894 != 0) {
                                                                iM556811 = (C0873.m55680("ۗ֡") ^ i50) * 39;
                                                                i51 = ((iM556811 ^ i49) * 28137) ^ 939521104;
                                                                i52 = 2126655116;
                                                            } else {
                                                                iM556811 = (C0946.m55979("᩵ܽ") ^ i49) * (-5);
                                                                i51 = ((iM556811 ^ i50) * 18805) ^ (-1255500550);
                                                                i52 = -309449985;
                                                            }
                                                            break;
                                                        case -796218492:
                                                        case -193147283:
                                                            if (C1046.m56302() != 0) {
                                                                iM556811 = (C0873.m55680("ۨ᩷") ^ i49) * (-5);
                                                                i51 = ((iM556811 ^ i50) * 21557) ^ 444704554;
                                                                i52 = -1036656244;
                                                            } else {
                                                                iM556811 = (i50 - C0946.m55979("᩹ۢ")) * (-25);
                                                                i51 = ((iM556811 ^ i49) * (-26357)) ^ 203428331;
                                                                i52 = -802583482;
                                                            }
                                                            break;
                                                        case -706278011:
                                                        case 94170251:
                                                            if (C1025.f81947 < 0) {
                                                                iM556811 = (C0946.m55979("֡ۘ") ^ i49) * (-17);
                                                                i51 = ((iM556811 ^ i50) * 20765) ^ (-367149882);
                                                                i52 = 955543600;
                                                            } else {
                                                                iM556811 = C0946.m55979("֡֫") ^ i50;
                                                                i51 = ((iM556811 ^ i49) * (-8507)) ^ 1474556838;
                                                                i52 = 1227360001;
                                                            }
                                                            break;
                                                        case -467055058:
                                                        case -86164247:
                                                            if (C0927.f81875) {
                                                                iM556811 = C0946.m55979("֡֫") ^ i50;
                                                                i51 = ((iM556811 ^ i49) * (-8507)) ^ 1474556838;
                                                                i52 = 1227360001;
                                                            } else {
                                                                iM556811 = (C0873.m55680("ܶ᩸") ^ i50) * (-9);
                                                                i51 = ((iM556811 ^ i49) * 6513) ^ (-93807563);
                                                                i52 = 89523239;
                                                            }
                                                            break;
                                                        case -455874521:
                                                        case 72851744:
                                                            C1964.m56597();
                                                            iM556811 = C0946.m55979("֡֫") ^ i50;
                                                            i51 = ((iM556811 ^ i49) * (-8507)) ^ 1474556838;
                                                            i52 = 1227360001;
                                                            break;
                                                        case -151257874:
                                                        case 1910891410:
                                                            if (C1194.f82045 == 0) {
                                                                C1053.m56329(new C12919(c181010, abstractC17043));
                                                            }
                                                            iM556811 = C0873.m55680("ۖ۟") ^ i50;
                                                            i51 = ((iM556811 ^ i49) * (-12995)) ^ 1833448000;
                                                            i52 = 1182938117;
                                                            break;
                                                        case -53109227:
                                                        case 1729016262:
                                                            if (C0989.m56095() <= 0) {
                                                                iM556811 = (C0873.m55680("ۗ֡") ^ i50) * 39;
                                                                i51 = ((iM556811 ^ i49) * 28137) ^ 939521104;
                                                                i52 = 2126655116;
                                                            } else {
                                                                iM556811 = C0873.m55680("᩺ۨ") ^ i49;
                                                                i51 = ((iM556811 ^ i50) * 39) ^ 2013185821;
                                                                i52 = -1565102236;
                                                            }
                                                            break;
                                                        case 252562550:
                                                        case 542877225:
                                                            if (C0854.m55595() >= 0) {
                                                                iM556811 = (C0873.m55680("ۨ᩷") ^ i49) * (-5);
                                                                i51 = ((iM556811 ^ i50) * 21557) ^ 444704554;
                                                                i52 = -1036656244;
                                                            } else {
                                                                iM556811 = (C0946.m55979("֡ۘ") ^ i49) * (-17);
                                                                i51 = ((iM556811 ^ i50) * 20765) ^ (-367149882);
                                                                i52 = 955543600;
                                                            }
                                                            break;
                                                        case 1138385893:
                                                        case 1504567051:
                                                            if (RunnableC0897.m55784()) {
                                                                iM556811 = (C0873.m55680("ۗ֡") ^ i50) * 39;
                                                                i51 = ((iM556811 ^ i49) * 28137) ^ 939521104;
                                                                i52 = 2126655116;
                                                            } else {
                                                                iM556811 = C0946.m55979("᩵۟") ^ i49;
                                                                i51 = ((iM556811 ^ i50) * 22019) ^ (-947391324);
                                                                i52 = 657408575;
                                                            }
                                                            break;
                                                        default:
                                                            if (C0937.m55918() >= 0) {
                                                                iM556811 = (C0873.m55680("ۨ᩷") ^ i49) * (-5);
                                                                i51 = ((iM556811 ^ i50) * 21557) ^ 444704554;
                                                                i52 = -1036656244;
                                                            } else {
                                                                iM556811 = C0873.m55680("ܶ᩵") ^ i49;
                                                                i51 = ((iM556811 ^ i50) * 7905) ^ (-163187141);
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
                                            iM55689 = C0873.m55680("۬᩺") ^ i34;
                                            i31 = ((iM55689 ^ i35) * 663) ^ (-1375970479);
                                            i32 = -2056581980;
                                        } else {
                                            iM55689 = (C0873.m55680("ᩳۙ") ^ i34) * (-23);
                                            i31 = ((iM55689 ^ i35) * 22659) ^ 1491263231;
                                            i32 = 263613936;
                                        }
                                        i37 = iM55689 ^ i32;
                                        i36 = i31;
                                        break;
                                    case -949302805:
                                    case -766513101:
                                        break;
                                    case -934489648:
                                    case -305719265:
                                        C1929.m56560(c181010).m12271(iM556810);
                                        break;
                                    case -934322159:
                                    case 471317848:
                                        RunnableC0897.m55789(c181010, interfaceC19372, new InterfaceC20295() { // from class: l.ۜۡܳ

                                            /* JADX INFO: renamed from: ܰۡ۟, reason: not valid java name and contains not printable characters */
                                            private static final short[] f82031 = {1616, -2950, -2955, -2945, -2967, -2956, -2958, -2945, -3019, -2958, -2955, -2961, -2946, -2955, -2961, -3019, -2950, -2952, -2961, -2958, -2956, -2955, -3019, -2995, -2990, -2978, -2996, -2950, -2967, -2968, -2952, -2979, -2958, -2953, -2946};

                                            {
                                                int i48 = -1999799650;
                                                int i49 = C1404.f82149;
                                                int i50 = C0989.f81920;
                                                int iM556811 = C0873.m55680("᩸ۙ") ^ i49;
                                                int i51 = ((iM556811 ^ i50) * 30279) ^ (-467413467);
                                                int i52 = 2059013212;
                                                while (true) {
                                                    i48 = ((((i48 ^ i50) * (-22965)) >> 31) & i51) ^ (iM556811 ^ i52);
                                                    switch (i48) {
                                                        case -2078739834:
                                                        case -1265477488:
                                                            C0845.m55584();
                                                            iM556811 = (C0873.m55680("ۗ᩷") + i49) * C0254q.f1218h;
                                                            i51 = ((iM556811 ^ i50) * 29837) ^ (-1281138561);
                                                            i52 = 1882073691;
                                                            break;
                                                        case -1953067481:
                                                        case 1378561398:
                                                            if (C0927.f81875) {
                                                                iM556811 = (C0873.m55680("᩹ۛ") + i50) * 99;
                                                                i51 = ((iM556811 ^ i49) * 19811) ^ 1448510323;
                                                                i52 = 1235384621;
                                                            } else {
                                                                iM556811 = C0946.m55979("۟۟") ^ i50;
                                                                i51 = ((iM556811 ^ i49) * 2579) ^ (-439361806);
                                                                i52 = -1255708103;
                                                            }
                                                            break;
                                                        case -1704779318:
                                                        case 637725590:
                                                            if (C1003.m56123() != 0) {
                                                                iM556811 = C0873.m55680("֨۬") ^ i50;
                                                                i51 = ((iM556811 ^ i49) * 11253) ^ 943700515;
                                                                i52 = 1067282716;
                                                            } else {
                                                                iM556811 = (C0873.m55680("ۗ᩷") + i49) * C0254q.f1218h;
                                                                i51 = ((iM556811 ^ i50) * 29837) ^ (-1281138561);
                                                                i52 = 1882073691;
                                                            }
                                                            break;
                                                        case -1366093823:
                                                        case -581568478:
                                                            if (C1012.f81938 >= 0) {
                                                                iM556811 = C0873.m55680("֨۬") ^ i50;
                                                                i51 = ((iM556811 ^ i49) * 11253) ^ 943700515;
                                                                i52 = 1067282716;
                                                            } else {
                                                                iM556811 = (i49 - C0946.m55979("ۧۖ")) * (-77);
                                                                i51 = ((iM556811 ^ i50) * (-23935)) ^ (-1640958735);
                                                                i52 = -1543367920;
                                                            }
                                                            break;
                                                        case -953959041:
                                                        case 1458094469:
                                                            if (C1053.f81965 <= 0) {
                                                                iM556811 = (C0946.m55979("ۜܶ") ^ i49) * 43;
                                                                i51 = ((iM556811 ^ i50) * (-8659)) ^ 621204749;
                                                                i52 = -2059759308;
                                                            } else {
                                                                iM556811 = C0873.m55680("۬ۗ") ^ i50;
                                                                i51 = ((iM556811 ^ i49) * (-7309)) ^ (-949755466);
                                                                i52 = -443096934;
                                                            }
                                                            break;
                                                        case -893444657:
                                                        case -214861993:
                                                            C1964.m56597();
                                                            if (!C0927.f81875) {
                                                                iM556811 = (C0873.m55680("ۗ᩷") + i49) * C0254q.f1218h;
                                                                i51 = ((iM556811 ^ i50) * 29837) ^ (-1281138561);
                                                                i52 = 1882073691;
                                                            } else {
                                                                iM556811 = (C0873.m55680("᩹ۛ") + i50) * 99;
                                                                i51 = ((iM556811 ^ i49) * 19811) ^ 1448510323;
                                                                i52 = 1235384621;
                                                            }
                                                            break;
                                                        case -680482100:
                                                        case 987809203:
                                                            if (C0845.f81821 >= 0) {
                                                                iM556811 = (C0873.m55680("᩹ۛ") + i50) * 99;
                                                                i51 = ((iM556811 ^ i49) * 19811) ^ 1448510323;
                                                                i52 = 1235384621;
                                                            } else {
                                                                iM556811 = (i50 - C0946.m55979("ܰᩴ")) * (-19);
                                                                i51 = ((iM556811 ^ i49) * (-7729)) ^ 297747238;
                                                                i52 = -795935233;
                                                            }
                                                            break;
                                                        case -625983477:
                                                        case 519224104:
                                                            if (C0873.m55678()) {
                                                                iM556811 = C0873.m55680("֨۬") ^ i50;
                                                                i51 = ((iM556811 ^ i49) * 11253) ^ 943700515;
                                                                i52 = 1067282716;
                                                            } else {
                                                                iM556811 = (C0946.m55979("ܿۜ") + i49) * 63;
                                                                i51 = ((iM556811 ^ i50) * 24835) ^ (-1019959436);
                                                                i52 = 1190494153;
                                                            }
                                                            break;
                                                        case -534930214:
                                                        case 664136763:
                                                            if (C0927.f81875) {
                                                                iM556811 = C0873.m55680("ۡ᩵") ^ i50;
                                                                i51 = ((iM556811 ^ i49) * (-14067)) ^ 2021117788;
                                                                i52 = 517661252;
                                                            } else {
                                                                iM556811 = (C0873.m55680("ۧ֨") ^ i49) * 81;
                                                                i51 = ((iM556811 ^ i50) * (-18517)) ^ (-1087815178);
                                                                i52 = 826954285;
                                                            }
                                                            break;
                                                        case -336013465:
                                                        case 1644911272:
                                                            C1404.m56468();
                                                            if (!C1404.m56468()) {
                                                                iM556811 = (C0946.m55979("ۜܶ") ^ i49) * 43;
                                                                i51 = ((iM556811 ^ i50) * (-8659)) ^ 621204749;
                                                                i52 = -2059759308;
                                                            } else {
                                                                iM556811 = (C0873.m55680("᩹ۛ") + i50) * 99;
                                                                i51 = ((iM556811 ^ i49) * 19811) ^ 1448510323;
                                                                i52 = 1235384621;
                                                            }
                                                            break;
                                                        case 280291174:
                                                        case 1026027664:
                                                            if (C0989.f81920 >= 0) {
                                                                iM556811 = C0873.m55680("֨۬") ^ i50;
                                                                i51 = ((iM556811 ^ i49) * 11253) ^ 943700515;
                                                                i52 = 1067282716;
                                                            } else {
                                                                iM556811 = (i50 - C0946.m55979("᩶᩹")) * (-35);
                                                                i51 = ((iM556811 ^ i49) * (-15309)) ^ (-1746231);
                                                                i52 = -1666023714;
                                                            }
                                                            break;
                                                        case 282312576:
                                                        case 431269832:
                                                            return;
                                                        case 450580290:
                                                        case 1185986467:
                                                            if (C1046.f81962 <= 0) {
                                                                iM556811 = C0873.m55680("֨۬") ^ i50;
                                                                i51 = ((iM556811 ^ i49) * 11253) ^ 943700515;
                                                                i52 = 1067282716;
                                                            } else {
                                                                iM556811 = C0873.m55680("ۘۚ") ^ i49;
                                                                i51 = ((iM556811 ^ i50) * (-11715)) ^ (-1972455622);
                                                                i52 = -288736883;
                                                            }
                                                            break;
                                                        case 1074096974:
                                                        case 1624469549:
                                                            if (C1964.f83032 <= 0) {
                                                                iM556811 = C0873.m55680("ۡ᩵") ^ i50;
                                                                i51 = ((iM556811 ^ i49) * (-14067)) ^ 2021117788;
                                                                i52 = 517661252;
                                                            } else {
                                                                iM556811 = C0946.m55979("ۨܿ") ^ i50;
                                                                i51 = ((iM556811 ^ i49) * (-3545)) ^ (-905656699);
                                                                i52 = -1282232221;
                                                            }
                                                            break;
                                                        case 1811978250:
                                                        case 1886249038:
                                                            if (C0906.m55809() <= 0) {
                                                                iM556811 = (C0946.m55979("ۜܶ") ^ i49) * 43;
                                                                i51 = ((iM556811 ^ i50) * (-8659)) ^ 621204749;
                                                                i52 = -2059759308;
                                                            } else {
                                                                iM556811 = C0873.m55680("᩹֡") ^ i49;
                                                                i51 = ((iM556811 ^ i50) * (-17159)) ^ (-1835637967);
                                                                i52 = 319463435;
                                                            }
                                                            break;
                                                        default:
                                                            RunnableC0897.m55784();
                                                            C0863.m55643();
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
                                            @Override // p067l.InterfaceC20295
                                            /* JADX INFO: renamed from: ۧ */
                                            public final void mo8469(AbstractC17043 abstractC17043) {
                                                int i48;
                                                int iM556811;
                                                int i49;
                                                int i50;
                                                C18107 c181011 = null;
                                                String strM55852 = null;
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
                                                int i57 = C0845.f81821;
                                                int i58 = C1229.f82066;
                                                int iM559716 = C0946.m55979("ۘܿ") ^ i58;
                                                int i59 = ((iM559716 ^ i57) * (-16557)) ^ (-527134540);
                                                int i60 = iM559716 ^ (-438539060);
                                                short[] sArr8 = null;
                                                while (true) {
                                                    Intent intent = null;
                                                    while (true) {
                                                        i48 = i60 ^ (i59 & (((i56 ^ i57) * 803) >> 31));
                                                        switch (i48) {
                                                            case -1978428595:
                                                            case -1764625733:
                                                                i53 = 54178;
                                                                iM556811 = C0946.m55979("ۚܳ") ^ i58;
                                                                i49 = ((iM556811 ^ i57) * 9037) ^ 1457577530;
                                                                i50 = 1128603918;
                                                                int i61 = i48;
                                                                i60 = iM556811 ^ i50;
                                                                i59 = i49;
                                                                i56 = i61;
                                                                break;
                                                            case -1748507309:
                                                            case -313334855:
                                                                C0912.m55833();
                                                                if (C0947.m55997()) {
                                                                    i48 = i48;
                                                                }
                                                                iM556811 = (C0946.m55979("֨۬") ^ i58) * (-21);
                                                                i48 = i48;
                                                                i49 = ((iM556811 ^ i57) * (-30141)) ^ 1955414907;
                                                                i50 = 781000634;
                                                                int i62 = i48;
                                                                i60 = iM556811 ^ i50;
                                                                i59 = i49;
                                                                i56 = i62;
                                                                break;
                                                            case -1590526587:
                                                            case -641048993:
                                                                i53 = 62491;
                                                                iM556811 = C0946.m55979("ۚܳ") ^ i58;
                                                                i49 = ((iM556811 ^ i57) * 9037) ^ 1457577530;
                                                                i50 = 1128603918;
                                                                int i63 = i48;
                                                                i60 = iM556811 ^ i50;
                                                                i59 = i49;
                                                                i56 = i63;
                                                                break;
                                                            case -1193086325:
                                                            case 1262663101:
                                                                i48 = i48;
                                                                C1024.m56213(intent, strM55852, C1046.m56297(abstractC17043));
                                                                if (C0947.f81895) {
                                                                    iM556811 = C0946.m55979("۠ۜ") ^ i58;
                                                                    i49 = ((iM556811 ^ i57) * 25273) ^ 392478362;
                                                                    i50 = 641203176;
                                                                } else {
                                                                    iM556811 = (C0873.m55680("֡ܰ") ^ i57) * (-71);
                                                                    i49 = ((iM556811 ^ i58) * 31239) ^ 1833963309;
                                                                    i50 = -1324303351;
                                                                }
                                                                int i64 = i48;
                                                                i60 = iM556811 ^ i50;
                                                                i59 = i49;
                                                                i56 = i64;
                                                                break;
                                                            case -974588805:
                                                            case -470785204:
                                                                i48 = i48;
                                                                s4 = sArr8[c];
                                                                i51 = s4 * s4;
                                                                if (C1024.m56209() >= 0) {
                                                                    iM556811 = C0946.m55979("᩶۟") ^ i57;
                                                                    i49 = ((iM556811 ^ i58) * 32211) ^ (-192439668);
                                                                    i50 = 269491117;
                                                                } else {
                                                                    iM556811 = (i57 - C0946.m55979("᩻᩶")) * (-59);
                                                                    i49 = ((iM556811 ^ i58) * 25369) ^ 1245270941;
                                                                    i50 = -1301662727;
                                                                }
                                                                int i65 = i48;
                                                                i60 = iM556811 ^ i50;
                                                                i59 = i49;
                                                                i56 = i65;
                                                                break;
                                                            case -938929431:
                                                            case 1412199148:
                                                                i48 = i48;
                                                                sArr8 = f82031;
                                                                if (C1053.m56327() >= 0) {
                                                                    iM556811 = C0946.m55979("᩶۟") ^ i57;
                                                                    i49 = ((iM556811 ^ i58) * 32211) ^ (-192439668);
                                                                    i50 = 269491117;
                                                                } else {
                                                                    iM556811 = C0873.m55680("۫֫") ^ i58;
                                                                    i49 = ((iM556811 ^ i57) * 29559) ^ 1200556074;
                                                                    i50 = 171417987;
                                                                }
                                                                int i66 = i48;
                                                                i60 = iM556811 ^ i50;
                                                                i59 = i49;
                                                                i56 = i66;
                                                                break;
                                                            case -908727801:
                                                            case -20542047:
                                                                if (C1071.f81975 <= 0) {
                                                                    i48 = i48;
                                                                    iM556811 = C0946.m55979("᩶۟") ^ i57;
                                                                    i49 = ((iM556811 ^ i58) * 32211) ^ (-192439668);
                                                                    i50 = 269491117;
                                                                    int i67 = i48;
                                                                    i60 = iM556811 ^ i50;
                                                                    i59 = i49;
                                                                    i56 = i67;
                                                                } else {
                                                                    i48 = i48;
                                                                }
                                                                break;
                                                            case -736713954:
                                                            case 1238077307:
                                                                C1048.m56305();
                                                                break;
                                                            case -574496814:
                                                            case -299133070:
                                                                i48 = i48;
                                                                strM55852 = C0917.m55852(f82031, 27, 8, i53);
                                                                if (C1929.f83011 != 0) {
                                                                    iM556811 = C0946.m55979("۠ۜ") ^ i58;
                                                                    i49 = ((iM556811 ^ i57) * 25273) ^ 392478362;
                                                                    i50 = 641203176;
                                                                } else {
                                                                    iM556811 = (C0873.m55680("֨֡") + i58) * 95;
                                                                    i49 = ((iM556811 ^ i57) * 26521) ^ 210749221;
                                                                    i50 = -1333874869;
                                                                }
                                                                int i68 = i48;
                                                                i60 = iM556811 ^ i50;
                                                                i59 = i49;
                                                                i56 = i68;
                                                                break;
                                                            case -572294694:
                                                            case 2136125426:
                                                                i48 = i48;
                                                                sArr7 = f82031;
                                                                i54 = 1;
                                                                i55 = 26;
                                                                if (C1017.m56187() <= 0) {
                                                                    iM556811 = C0946.m55979("᩶۟") ^ i57;
                                                                    i49 = ((iM556811 ^ i58) * 32211) ^ (-192439668);
                                                                    i50 = 269491117;
                                                                } else {
                                                                    iM556811 = (i58 - C0873.m55680("᩹۠")) * 9;
                                                                    i49 = ((iM556811 ^ i57) * 30613) ^ 1997613456;
                                                                    i50 = 369796378;
                                                                }
                                                                int i69 = i48;
                                                                i60 = iM556811 ^ i50;
                                                                i59 = i49;
                                                                i56 = i69;
                                                                break;
                                                            case -559773604:
                                                            case 84546606:
                                                                C0927.m55873();
                                                                C0890.m55740();
                                                                iM556811 = (C0946.m55979("֨۬") ^ i58) * (-21);
                                                                i48 = i48;
                                                                i49 = ((iM556811 ^ i57) * (-30141)) ^ 1955414907;
                                                                i50 = 781000634;
                                                                int i610 = i48;
                                                                i60 = iM556811 ^ i50;
                                                                i59 = i49;
                                                                i56 = i610;
                                                                break;
                                                            case -323600945:
                                                            case 867692348:
                                                                C0927.m55873();
                                                                if (C0946.m55980() != 0) {
                                                                    iM556811 = (C0946.m55979("֨۬") ^ i58) * (-21);
                                                                    i48 = i48;
                                                                    i49 = ((iM556811 ^ i57) * (-30141)) ^ 1955414907;
                                                                    i50 = 781000634;
                                                                } else {
                                                                    i48 = i48;
                                                                    iM556811 = C0946.m55979("۠ۜ") ^ i58;
                                                                    i49 = ((iM556811 ^ i57) * 25273) ^ 392478362;
                                                                    i50 = 641203176;
                                                                }
                                                                int i611 = i48;
                                                                i60 = iM556811 ^ i50;
                                                                i59 = i49;
                                                                i56 = i611;
                                                                break;
                                                            case -223002672:
                                                            case 1180341051:
                                                                i48 = i48;
                                                                c181011 = c181010;
                                                                Main mainM56560 = C1929.m56560(c181011);
                                                                if (C0967.f81910 < 0) {
                                                                    intent = new Intent(mainM56560, (Class<?>) ActivityC18686.class);
                                                                    C0882.m55721(intent, 268435456);
                                                                    if (C0906.f81862 >= 0) {
                                                                        iM556811 = (C0946.m55979("֫ۚ") + i58) * (-99);
                                                                        i49 = ((iM556811 ^ i57) * (-12199)) ^ (-652085749);
                                                                        i50 = -782528097;
                                                                    } else {
                                                                        iM556811 = (i57 - C0946.m55979("֫ܳ")) * (-53);
                                                                        i49 = ((iM556811 ^ i58) * (-25661)) ^ 26429178;
                                                                        i50 = 1813361755;
                                                                    }
                                                                    int i612 = i48;
                                                                    i60 = iM556811 ^ i50;
                                                                    i59 = i49;
                                                                    i56 = i612;
                                                                }
                                                                break;
                                                            case 200840608:
                                                            case 253545893:
                                                                i48 = i48;
                                                                if ((s4 * s5) - i52 <= 0) {
                                                                    iM556811 = C0873.m55680("۟ᩳ") ^ i57;
                                                                    i49 = ((iM556811 ^ i58) * (-30767)) ^ (-1549618398);
                                                                    i50 = 628075616;
                                                                } else {
                                                                    iM556811 = C0946.m55979("᩸֨") ^ i58;
                                                                    i49 = ((iM556811 ^ i57) * (-5177)) ^ (-516386478);
                                                                    i50 = 656543180;
                                                                }
                                                                int i613 = i48;
                                                                i60 = iM556811 ^ i50;
                                                                i59 = i49;
                                                                i56 = i613;
                                                                break;
                                                            case 795244405:
                                                            case 1595839693:
                                                                C11245.m26044(interfaceC19372, 2000);
                                                                C1044.m56284(C1964.m56594(c181011), intent);
                                                                break;
                                                            case 906634413:
                                                            case 1465086682:
                                                                i48 = i48;
                                                                intent.setAction(C0890.m55726(sArr7, i54, i55, i53));
                                                                if (C1046.f81962 <= 0) {
                                                                    iM556811 = (C0946.m55979("֫ۚ") + i58) * (-99);
                                                                    i49 = ((iM556811 ^ i57) * (-12199)) ^ (-652085749);
                                                                    i50 = -782528097;
                                                                } else {
                                                                    iM556811 = C0946.m55979("۠ۖ") ^ i57;
                                                                    i49 = ((iM556811 ^ i58) * 21023) ^ (-1417951258);
                                                                    i50 = 311316943;
                                                                }
                                                                int i614 = i48;
                                                                i60 = iM556811 ^ i50;
                                                                i59 = i49;
                                                                i56 = i614;
                                                                break;
                                                            case 1282334923:
                                                            case 1960819273:
                                                                i48 = i48;
                                                                i52 = i51 + 78428736;
                                                                s5 = 17712;
                                                                if (C0882.m55710() != 0) {
                                                                    iM556811 = C0946.m55979("۠ۜ") ^ i58;
                                                                    i49 = ((iM556811 ^ i57) * 25273) ^ 392478362;
                                                                    i50 = 641203176;
                                                                } else {
                                                                    iM556811 = C0873.m55680("ܺܿ") ^ i58;
                                                                    i49 = ((iM556811 ^ i57) * 32689) ^ (-961437572);
                                                                    i50 = -1173833822;
                                                                }
                                                                int i615 = i48;
                                                                i60 = iM556811 ^ i50;
                                                                i59 = i49;
                                                                i56 = i615;
                                                                break;
                                                            default:
                                                                i48 = i48;
                                                                c = 0;
                                                                if (C1003.m56123() != 0) {
                                                                    iM556811 = C0946.m55979("᩶۟") ^ i57;
                                                                    i49 = ((iM556811 ^ i58) * 32211) ^ (-192439668);
                                                                    i50 = 269491117;
                                                                } else {
                                                                    iM556811 = (C0873.m55680("ۧ۠") ^ i57) * 3;
                                                                    i49 = ((iM556811 ^ i58) * 5635) ^ (-885543708);
                                                                    i50 = 369174522;
                                                                }
                                                                int i616 = i48;
                                                                i60 = iM556811 ^ i50;
                                                                i59 = i49;
                                                                i56 = i616;
                                                                break;
                                                        }
                                                        return;
                                                    }
                                                    int iM556812 = (i57 - C0873.m55680("ۘ᩹")) * (-103);
                                                    i56 = i48;
                                                    i60 = iM556812 ^ (-2024558138);
                                                    i59 = ((iM556812 ^ i58) * 3517) ^ (-1192856485);
                                                }
                                            }
                                        });
                                        break;
                                    case -927837077:
                                    case -329131934:
                                        C0946.m55980();
                                        C1012.m56134();
                                        break;
                                    case -811446850:
                                    case 470754831:
                                        C20966.m47302(c181010, interfaceC19372, ActivityC8645.class);
                                        break;
                                    case -786334518:
                                    case -596193315:
                                        break;
                                    case -728773430:
                                    case -345591496:
                                        sArr4 = sArr4;
                                        i23 = i38;
                                        sArr6 = f82206;
                                        if (C0863.f81833 <= 0) {
                                            iM55686 = C0946.m55979("᩶ܰ") ^ i34;
                                            i24 = ((iM55686 ^ i35) * (-8349)) ^ 326530510;
                                            i25 = -472268440;
                                        } else {
                                            iM55686 = C0946.m55979("۫ۨ") ^ i35;
                                            i24 = ((iM55686 ^ i34) * (-8305)) ^ 145183409;
                                            i25 = -1824834306;
                                        }
                                        i37 = iM55686 ^ i25;
                                        i36 = i24;
                                        i38 = i23;
                                        sArr4 = sArr4;
                                        break;
                                    case -692391893:
                                    case 1160377446:
                                        if (i22 != 3) {
                                            iM55689 = (C0873.m55680("֨֫") ^ i34) * 33;
                                            i31 = ((iM55689 ^ i35) * 23459) ^ (-1839327285);
                                            i32 = 832392045;
                                        } else {
                                            iM55689 = C0946.m55979("۠᩹") ^ i34;
                                            i31 = ((iM55689 ^ i35) * 28029) ^ (-492543511);
                                            i32 = 1654160382;
                                        }
                                        i37 = iM55689 ^ i32;
                                        i36 = i31;
                                        break;
                                    case -496340496:
                                    case -90342354:
                                        if (C0894.m55772()) {
                                            iM55689 = C0873.m55680("ۢۛ") ^ i35;
                                            i31 = ((iM55689 ^ i34) * 16627) ^ 1760069311;
                                            i32 = 21312652;
                                        } else {
                                            iM55689 = C0946.m55979("ܿ᩷") ^ i35;
                                            i31 = ((iM55689 ^ i34) * (-13465)) ^ (-319452093);
                                            i32 = 1717775187;
                                        }
                                        i37 = iM55689 ^ i32;
                                        i36 = i31;
                                        break;
                                    case -289744533:
                                    case 834409773:
                                        sArr4 = sArr4;
                                        dialogInterface.dismiss();
                                        c18108 = c18107;
                                        interfaceC19372 = interfaceC19371;
                                        if (C0854.m55595() >= 0) {
                                            iM55687 = (C0873.m55680("᩹ۜ") ^ i35) * (-27);
                                            c18109 = c18108;
                                            i36 = ((iM55687 ^ i34) * 25193) ^ (-303510167);
                                            i26 = -862441745;
                                        } else {
                                            iM55687 = (C0873.m55680("ۢۜ") ^ i35) * 63;
                                            c18109 = c18108;
                                            i36 = ((iM55687 ^ i34) * 3945) ^ (-1320221850);
                                            i26 = 1207653586;
                                        }
                                        i30 = iM55687 ^ i26;
                                        c181010 = c18109;
                                        i37 = i30;
                                        sArr4 = sArr4;
                                        break;
                                    case -266981936:
                                    case 810464025:
                                        try {
                                            C23058.m51450(C1929.m56560(c181010), interfaceC17021);
                                            iM55689 = C0873.m55680("֡ۗ") ^ i34;
                                            i31 = ((iM55689 ^ i35) * (-179)) ^ 558094922;
                                            i32 = 1328639333;
                                        } catch (Throwable th) {
                                            obj = th;
                                            iM55689 = C0946.m55979("ܰۗ") ^ i35;
                                            i31 = ((iM55689 ^ i34) * (-7965)) ^ (-1069737498);
                                            i32 = -1582623422;
                                        }
                                        i37 = iM55689 ^ i32;
                                        i36 = i31;
                                        break;
                                    case -261001541:
                                    case 771463524:
                                        i46 = 2128119886;
                                        if (C0946.f81894 == 0) {
                                            iM55689 = C0946.m55979("᩷֨") ^ i34;
                                            i31 = ((iM55689 ^ i35) * 17515) ^ 97329142;
                                            i32 = 61230754;
                                            i37 = iM55689 ^ i32;
                                            i36 = i31;
                                        } else {
                                            sArr4 = sArr4;
                                            i23 = i38;
                                            iM55686 = C0946.m55979("᩶ܰ") ^ i34;
                                            i24 = ((iM55686 ^ i35) * (-8349)) ^ 326530510;
                                            i25 = -472268440;
                                            i37 = iM55686 ^ i25;
                                            i36 = i24;
                                            i38 = i23;
                                            sArr4 = sArr4;
                                        }
                                        break;
                                    case -190749199:
                                    case 496922348:
                                        C1044.m56286();
                                        if (RunnableC0938.f81886 < 0) {
                                            sArr4 = sArr4;
                                            i23 = i38;
                                            iM55686 = (i35 - C0946.m55979("᩶֫")) * (-9);
                                            i24 = ((iM55686 ^ i34) * (-32021)) ^ 799720444;
                                            i25 = -2099927108;
                                            i37 = iM55686 ^ i25;
                                            i36 = i24;
                                            i38 = i23;
                                            sArr4 = sArr4;
                                        } else {
                                            iM55689 = (C0873.m55680("ۜۙ") ^ i34) * 49;
                                            i31 = ((iM55689 ^ i35) * (-25759)) ^ 918755169;
                                            i32 = 1771171734;
                                            i37 = iM55689 ^ i32;
                                            i36 = i31;
                                        }
                                        break;
                                    case -153123460:
                                    case 6246513:
                                        sArr4 = sArr4;
                                        i23 = i38;
                                        int i48 = s3 + s2;
                                        if (i44 - (i48 * i48) >= 0) {
                                            iM55686 = C0946.m55979("ۤᩳ") ^ i35;
                                            i24 = ((iM55686 ^ i34) * 11547) ^ 1555606750;
                                            i25 = 802986118;
                                        } else {
                                            iM55686 = C0946.m55979("۟ܶ") ^ i35;
                                            i24 = ((iM55686 ^ i34) * (-16563)) ^ (-1154348551);
                                            i25 = -1079518817;
                                        }
                                        i37 = iM55686 ^ i25;
                                        i36 = i24;
                                        i38 = i23;
                                        sArr4 = sArr4;
                                        break;
                                    case -115515507:
                                    case 221310066:
                                        if (i22 != 2) {
                                            iM55689 = C0946.m55979("ۧᩳ") ^ i35;
                                            i31 = ((iM55689 ^ i34) * (-12241)) ^ 1886237805;
                                            i32 = 1562298387;
                                        } else {
                                            iM55689 = (C0946.m55979("ۢܳ") + i34) * (-53);
                                            i31 = ((iM55689 ^ i35) * 10267) ^ (-2088541804);
                                            i32 = 1554474110;
                                        }
                                        i37 = iM55689 ^ i32;
                                        i36 = i31;
                                        break;
                                    case -59639238:
                                    case 872664572:
                                        i41 = 33606;
                                        iM55686 = C0873.m55680("۬ۢ") ^ i34;
                                        i23 = i38;
                                        i24 = ((iM55686 ^ i35) * (-12447)) ^ 1823196412;
                                        i25 = -1175987837;
                                        i37 = iM55686 ^ i25;
                                        i36 = i24;
                                        i38 = i23;
                                        sArr4 = sArr4;
                                        break;
                                    case 281662849:
                                    case 1975793430:
                                        sArr4 = sArr4;
                                        i23 = i38;
                                        if (C0877.f81843 >= 0) {
                                            iM55686 = (i35 - C0946.m55979("᩶֫")) * (-9);
                                            i24 = ((iM55686 ^ i34) * (-32021)) ^ 799720444;
                                            i25 = -2099927108;
                                        } else {
                                            iM55686 = (C0873.m55680("ۨ᩹") ^ i34) * (-31);
                                            i24 = ((iM55686 ^ i35) * (-10139)) ^ 1710662819;
                                            i25 = -1749481199;
                                        }
                                        i37 = iM55686 ^ i25;
                                        i36 = i24;
                                        i38 = i23;
                                        sArr4 = sArr4;
                                        break;
                                    case 342110962:
                                    case 724546613:
                                        if (C0890.f81849 == 0) {
                                            iM559714 = i40;
                                            sArr4 = sArr4;
                                            i27 = i45;
                                            iM55688 = C0946.m55979("ܺܽ") ^ i34;
                                            i28 = iM559714;
                                            i36 = ((iM55688 ^ i35) * 16171) ^ (-1322406637);
                                            i29 = 470490432;
                                            i30 = iM55688 ^ i29;
                                            i45 = i27;
                                            i40 = i28;
                                            i37 = i30;
                                            sArr4 = sArr4;
                                        }
                                        c18108 = c181010;
                                        sArr4 = sArr4;
                                        iM55687 = (C0873.m55680("᩹ۜ") ^ i35) * (-27);
                                        c18109 = c18108;
                                        i36 = ((iM55687 ^ i34) * 25193) ^ (-303510167);
                                        i26 = -862441745;
                                        i30 = iM55687 ^ i26;
                                        c181010 = c18109;
                                        i37 = i30;
                                        sArr4 = sArr4;
                                        break;
                                    case 413084151:
                                    case 1273808121:
                                        sArr4 = sArr4;
                                        i23 = i38;
                                        s3 = sArr6[0];
                                        i43 = s3 * s3;
                                        if (C0989.f81920 >= 0) {
                                            iM55686 = C0946.m55979("᩶ܰ") ^ i34;
                                            i24 = ((iM55686 ^ i35) * (-8349)) ^ 326530510;
                                            i25 = -472268440;
                                        } else {
                                            iM55686 = C0946.m55979("ۘ᩹") ^ i35;
                                            i24 = ((iM55686 ^ i34) * (-31349)) ^ 1693267993;
                                            i25 = -852726882;
                                        }
                                        i37 = iM55686 ^ i25;
                                        i36 = i24;
                                        i38 = i23;
                                        sArr4 = sArr4;
                                        break;
                                    case 446321600:
                                    case 2013036156:
                                        sArr4 = f82206;
                                        i45 = 1;
                                        if (C1046.f81962 <= 0) {
                                            iM55689 = (C0873.m55680("ۜۙ") ^ i34) * 49;
                                            i31 = ((iM55689 ^ i35) * (-25759)) ^ 918755169;
                                            i32 = 1771171734;
                                        } else {
                                            iM55689 = C0873.m55680("ۛ֨") ^ i34;
                                            i31 = ((iM55689 ^ i35) * (-209)) ^ (-607096561);
                                            i32 = -1302878121;
                                        }
                                        i37 = iM55689 ^ i32;
                                        i36 = i31;
                                        break;
                                    case 705640625:
                                    case 1241439094:
                                        ServiceConnectionC1013.m56155(C1964.m56594(c181010), obj, interfaceC17021);
                                        break;
                                    case 826612269:
                                    case 1358161633:
                                        C1024.m56202(i39);
                                        C12996.m29788(C1929.m56560(c181010), z);
                                        break;
                                    case 973412291:
                                    case 1058572782:
                                        iM556810 = 2119287958 ^ C0873.m55680(C0992.m56102(sArr5, i38, i42, i41));
                                        if (i22 != 0) {
                                            iM55689 = (i34 - C0946.m55979("۠ۢ")) * 33;
                                            i31 = ((iM55689 ^ i35) * 29763) ^ (-2116360676);
                                            i32 = 1429711846;
                                        } else {
                                            iM55689 = (C0946.m55979("ۤ֫") + i35) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                            i31 = ((iM55689 ^ i34) * (-3581)) ^ (-1237080121);
                                            i32 = 1182221979;
                                        }
                                        i37 = iM55689 ^ i32;
                                        i36 = i31;
                                        break;
                                    case 973890466:
                                    case 1561467682:
                                        sArr4 = sArr4;
                                        i27 = i45;
                                        iM559714 = C0946.m55979(C0917.m55852(sArr4, i27, 3, i41));
                                        if (C0892.f81851) {
                                            iM55688 = (C0873.m55680("ۨ᩶") + i35) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                            i28 = iM559714;
                                            i36 = ((iM55688 ^ i34) * (-21865)) ^ 411219069;
                                            i29 = 1941954322;
                                        } else {
                                            iM55688 = C0946.m55979("ܺܽ") ^ i34;
                                            i28 = iM559714;
                                            i36 = ((iM55688 ^ i35) * 16171) ^ (-1322406637);
                                            i29 = 470490432;
                                        }
                                        i30 = iM55688 ^ i29;
                                        i45 = i27;
                                        i40 = i28;
                                        i37 = i30;
                                        sArr4 = sArr4;
                                        break;
                                    case 984069187:
                                    case 1879057923:
                                        if (C0873.f81841 <= 0) {
                                            iM55689 = C0946.m55979("ۢۧ") ^ i35;
                                            i31 = ((iM55689 ^ i34) * (-27675)) ^ (-811470456);
                                            i32 = 457003155;
                                            i37 = iM55689 ^ i32;
                                            i36 = i31;
                                        } else {
                                            c18108 = c181010;
                                            sArr4 = sArr4;
                                            iM55687 = (C0873.m55680("᩹ۜ") ^ i35) * (-27);
                                            c18109 = c18108;
                                            i36 = ((iM55687 ^ i34) * 25193) ^ (-303510167);
                                            i26 = -862441745;
                                            i30 = iM55687 ^ i26;
                                            c181010 = c18109;
                                            i37 = i30;
                                            sArr4 = sArr4;
                                        }
                                        break;
                                    default:
                                        if (C1044.f81959 >= 0) {
                                            sArr4 = sArr4;
                                            i23 = i38;
                                            iM55686 = (i34 - C0873.m55680("ܺᩴ")) * (-35);
                                            i24 = ((iM55686 ^ i35) * (-8475)) ^ (-1900642036);
                                            i25 = -1028968661;
                                            i37 = iM55686 ^ i25;
                                            i36 = i24;
                                            i38 = i23;
                                            sArr4 = sArr4;
                                        }
                                        c18108 = c181010;
                                        sArr4 = sArr4;
                                        iM55687 = (C0873.m55680("᩹ۜ") ^ i35) * (-27);
                                        c18109 = c18108;
                                        i36 = ((iM55687 ^ i34) * 25193) ^ (-303510167);
                                        i26 = -862441745;
                                        i30 = iM55687 ^ i26;
                                        c181010 = c18109;
                                        i37 = i30;
                                        sArr4 = sArr4;
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    if (ViewOnClickListenerC0939.f81888 > 0) {
                        iM55979 = (C0946.m55979("ᩴۜ") + i12) * (-57);
                        i = ((iM55979 ^ i11) * 32177) ^ 302252909;
                        i2 = -847696869;
                        i14 = iM55979 ^ i2;
                        int i1114 = i;
                        strM55591 = strM55591;
                        i13 = i1114;
                    } else {
                        iM55682 = (C0873.m55680("᩹ܽ") + i12) * (-41);
                        i3 = ((iM55682 ^ i11) * 30129) ^ 1385616463;
                        i9 = -318616315;
                        i14 = iM55682 ^ i9;
                        c18107 = c18107;
                        strM55591 = strM55591;
                        i13 = i3;
                    }
                    break;
                case 1752155545:
                case 2061816097:
                    strM55591 = strM55591;
                    strM56156 = strM56156;
                    C1194.m56393(arrayList, strM56157);
                    strM56584 = C1964.m56584(f82953, 339, 3, i15);
                    if (C1017.m56187() <= 0) {
                        iM55681 = (i11 - C0873.m55680("֨ۜ")) * 63;
                        i6 = ((iM55681 ^ i12) * 1255) ^ (-1813090048);
                        i8 = 654448421;
                    } else {
                        iM55681 = (C0873.m55680("ܺ֫") ^ i11) * (-91);
                        i6 = ((iM55681 ^ i12) * (-26655)) ^ 1899496599;
                        i8 = -1656946607;
                    }
                    i14 = iM55681 ^ i8;
                    strM55591 = strM55591;
                    strM56156 = strM56156;
                    i13 = i6;
                    interfaceC19371 = interfaceC19370;
                    break;
                default:
                    strM55591 = strM55591;
                    strM55783 = RunnableC0897.m55783(sArr2, 351, 1, i15);
                    if (!C0927.f81875) {
                        iM55979 = C0873.m55680("᩷ᩳ") ^ i12;
                        i = ((iM55979 ^ i11) * (-29371)) ^ 143246293;
                        i2 = 1996600754;
                        i14 = iM55979 ^ i2;
                        int i1115 = i;
                        strM55591 = strM55591;
                        i13 = i1115;
                    } else {
                        iM55682 = (C0873.m55680("᩹ܽ") + i12) * (-41);
                        i3 = ((iM55682 ^ i11) * 30129) ^ 1385616463;
                        i9 = -318616315;
                        i14 = iM55682 ^ i9;
                        c18107 = c18107;
                        strM55591 = strM55591;
                        i13 = i3;
                    }
                    break;
            }
            return;
        }
    }
}
