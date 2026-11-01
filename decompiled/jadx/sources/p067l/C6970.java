package p067l;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.drawable.ColorDrawable;
import java.io.File;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۙᩴ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C2R7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6970 {

    /* JADX INFO: renamed from: ܰ᩺᩺, reason: not valid java name and contains not printable characters */
    private static final short[] f81980 = {431, -7194, -7194, -7194, -7194, -7194, -7194, -7275, -7274, -7286, -7281, -7278, -7187};

    /* JADX INFO: renamed from: ֫ */
    public final long f18117;

    /* JADX INFO: renamed from: ۖ */
    public final int f18118;

    /* JADX INFO: renamed from: ۜ */
    public boolean f18119;

    /* JADX INFO: renamed from: ۡ */
    public final PackageInfo f18120;

    /* JADX INFO: renamed from: ۢ */
    public final int f18121;

    /* JADX INFO: renamed from: ۧ */
    public C5629 f18122;

    /* JADX INFO: renamed from: ܳ */
    public final C0878 f18123;

    /* JADX INFO: renamed from: ܺ */
    public final String f18124;

    /* JADX INFO: renamed from: ܽ */
    public String f18125;

    /* JADX INFO: renamed from: ܿ */
    public boolean f18126;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f18127;

    /* JADX INFO: renamed from: ᩷ */
    public final String f18128;

    /* JADX INFO: renamed from: ᩻ */
    public final C0878 f18129;

    /* JADX INFO: renamed from: ֫ */
    public final void m15965(boolean z) {
        C5629 c5629 = null;
        int i = 0;
        int i2 = 0;
        C5629 c56210 = null;
        int i3 = 0;
        int i4 = 0;
        int i5 = 2095093300;
        int i6 = C1046.f81962;
        int i7 = RunnableC0871.f81839;
        int iM55680 = C0873.m55680("ܽۡ") ^ i7;
        int i8 = ((iM55680 ^ i6) * (-10739)) ^ 1558128728;
        int i9 = 1058001923;
        while (true) {
            i5 = ((((i5 ^ i6) * 11203) >> 31) & i8) ^ (iM55680 ^ i9);
            switch (i5) {
                case -2067551924:
                case -336954766:
                    C0873.m55678();
                    if (C0863.f81833 <= 0) {
                        iM55680 = C0946.m55979("᩻ۚ") ^ i6;
                        i8 = ((iM55680 ^ i7) * (-21541)) ^ (-500288996);
                        i9 = -1117819431;
                    } else {
                        iM55680 = (i7 - C0946.m55979("۠֨")) * 49;
                        i8 = ((iM55680 ^ i6) * 15531) ^ 2074350486;
                        i9 = -2096283719;
                    }
                    break;
                case -2051959228:
                case 1677618470:
                    c56210.f13642 = i3 + i4;
                    break;
                case -2016001394:
                case -1248621154:
                    i2 = -1;
                    if (RunnableC0871.m55672() >= 0) {
                        iM55680 = C0946.m55979("۠ۗ") ^ i6;
                        i8 = ((iM55680 ^ i7) * (-29627)) ^ (-610981582);
                        i9 = -1227774428;
                    } else {
                        iM55680 = C0873.m55680("ۘۖ") ^ i7;
                        i8 = ((iM55680 ^ i6) * (-24265)) ^ 1908880926;
                        i9 = -905262458;
                    }
                    break;
                case -1935922669:
                case 1408364503:
                    c5629.f13642 = i + i2;
                    iM55680 = (i7 - C0873.m55680("ܶۖ")) * 65;
                    i8 = ((iM55680 ^ i6) * 23419) ^ 2061815526;
                    i9 = 1289398985;
                    break;
                case -1493906200:
                case -971259540:
                    if (ServiceConnectionC1013.m56157() <= 0) {
                        iM55680 = C0946.m55979("᩻ۚ") ^ i6;
                        i8 = ((iM55680 ^ i7) * (-21541)) ^ (-500288996);
                        i9 = -1117819431;
                    } else {
                        iM55680 = (C0946.m55979("ۙ۬") + i7) * (-51);
                        i8 = ((iM55680 ^ i6) * 29787) ^ 987263034;
                        i9 = -1770544559;
                    }
                    break;
                case -1305139545:
                case 256052634:
                    if (C1048.f81963) {
                        iM55680 = (C0873.m55680("۠᩸") + i7) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i8 = ((iM55680 ^ i6) * (-11943)) ^ 1139936609;
                        i9 = -2073001084;
                    } else {
                        iM55680 = C0946.m55979("۠ۗ") ^ i6;
                        i8 = ((iM55680 ^ i7) * (-29627)) ^ (-610981582);
                        i9 = -1227774428;
                    }
                    break;
                case -1091191078:
                case 1536096275:
                    if (C0877.m55696()) {
                        iM55680 = C0946.m55979("۫ܿ") ^ i6;
                        i8 = ((iM55680 ^ i7) * (-3075)) ^ (-1932972303);
                        i9 = 1502235273;
                    } else {
                        iM55680 = C0946.m55979("۠ۗ") ^ i6;
                        i8 = ((iM55680 ^ i7) * (-29627)) ^ (-610981582);
                        i9 = -1227774428;
                    }
                    break;
                case -992491861:
                case 1725970846:
                    if (C0861.f81831) {
                        iM55680 = C0873.m55680("֨֫") ^ i6;
                        i8 = ((iM55680 ^ i7) * (-6135)) ^ 1613958826;
                        i9 = -398683778;
                    } else {
                        iM55680 = (i7 - C0946.m55979("۠֨")) * 49;
                        i8 = ((iM55680 ^ i6) * 15531) ^ 2074350486;
                        i9 = -2096283719;
                    }
                    break;
                case -747455152:
                case -342504255:
                    if (C0989.f81920 >= 0) {
                        iM55680 = (i7 - C0946.m55979("۠֨")) * 49;
                        i8 = ((iM55680 ^ i6) * 15531) ^ 2074350486;
                        i9 = -2096283719;
                    } else {
                        iM55680 = C0873.m55680("֨ۨ") ^ i6;
                        i8 = ((iM55680 ^ i7) * 25301) ^ (-1061504304);
                        i9 = 1836434274;
                    }
                    break;
                case -535238796:
                case -508813059:
                    if (C1012.f81938 >= 0) {
                        iM55680 = (C0946.m55979("ۜۗ") ^ i7) * (-43);
                        i8 = ((iM55680 ^ i6) * (-5047)) ^ 1316406949;
                        i9 = -1508673240;
                    } else {
                        iM55680 = (i7 - C0946.m55979("۠֨")) * 49;
                        i8 = ((iM55680 ^ i6) * 15531) ^ 2074350486;
                        i9 = -2096283719;
                    }
                    break;
                case -458023074:
                case 180118796:
                    i4 = 1;
                    if (C1017.f81942 >= 0) {
                        iM55680 = (C0946.m55979("ۜۗ") ^ i7) * (-43);
                        i8 = ((iM55680 ^ i6) * (-5047)) ^ 1316406949;
                        i9 = -1508673240;
                    } else {
                        iM55680 = (C0873.m55680("ۧۡ") + i7) * (-79);
                        i8 = ((iM55680 ^ i6) * (-18915)) ^ 508857604;
                        i9 = 420060319;
                    }
                    break;
                case -401773380:
                case 1370401742:
                    c5629 = this.f18122;
                    i = c5629.f13642;
                    if (C0882.m55710() != 0) {
                        iM55680 = C0946.m55979("᩻ۚ") ^ i6;
                        i8 = ((iM55680 ^ i7) * (-21541)) ^ (-500288996);
                        i9 = -1117819431;
                    } else {
                        iM55680 = C0873.m55680("ۤ᩶") ^ i7;
                        i8 = ((iM55680 ^ i6) * 14117) ^ (-501355054);
                        i9 = 506285363;
                    }
                    break;
                case -369196202:
                case 421724194:
                    this.f18126 = z;
                    if (z) {
                        iM55680 = (i6 - C0873.m55680("ۜ֨")) * 59;
                        i8 = ((iM55680 ^ i7) * (-3289)) ^ 1258995601;
                        i9 = -285318880;
                    } else {
                        iM55680 = C0873.m55680("᩻۟") ^ i6;
                        i8 = ((iM55680 ^ i7) * (-31557)) ^ (-695818122);
                        i9 = 123996845;
                    }
                    break;
                case -307989976:
                case -98619506:
                    C1404.m56468();
                    C0863.m55643();
                    break;
                case -289786407:
                case 365901394:
                    c56210 = this.f18122;
                    i3 = c56210.f13642;
                    if (C1964.f83032 <= 0) {
                        iM55680 = (i7 - C0946.m55979("۠֨")) * 49;
                        i8 = ((iM55680 ^ i6) * 15531) ^ 2074350486;
                        i9 = -2096283719;
                    } else {
                        iM55680 = C0946.m55979("ۧ᩵") ^ i6;
                        i8 = ((iM55680 ^ i7) * (-9997)) ^ 732210560;
                        i9 = 1551175621;
                    }
                    break;
                case -179362327:
                case 1940209225:
                    if (C1053.f81965 <= 0) {
                        iM55680 = C0946.m55979("۠ۗ") ^ i6;
                        i8 = ((iM55680 ^ i7) * (-29627)) ^ (-610981582);
                        i9 = -1227774428;
                    } else {
                        iM55680 = C0946.m55979("ۙ᩺") ^ i6;
                        i8 = ((iM55680 ^ i7) * (-435)) ^ (-516248289);
                        i9 = 1515346150;
                    }
                    break;
                case -107912014:
                case 1890895381:
                    if (C1053.f81965 <= 0) {
                        iM55680 = (C0946.m55979("ۜۗ") ^ i7) * (-43);
                        i8 = ((iM55680 ^ i6) * (-5047)) ^ 1316406949;
                        i9 = -1508673240;
                    } else {
                        iM55680 = (i7 - C0946.m55979("ᩴ᩻")) * 63;
                        i8 = ((iM55680 ^ i6) * (-18955)) ^ (-1939655381);
                        i9 = -1751734639;
                    }
                    break;
                case 12450026:
                case 211496064:
                    if (this.f18126 != z) {
                        iM55680 = (C0946.m55979("᩻ܽ") + i6) * 29;
                        i8 = ((iM55680 ^ i7) * (-2525)) ^ (-1821390838);
                        i9 = 1019926419;
                    } else {
                        iM55680 = (i7 - C0873.m55680("ܶۖ")) * 65;
                        i8 = ((iM55680 ^ i6) * 23419) ^ 2061815526;
                        i9 = 1289398985;
                    }
                    break;
                case 556601277:
                case 1002237829:
                    C1046.m56302();
                    iM55680 = (i7 - C0946.m55979("۠֨")) * 49;
                    i8 = ((iM55680 ^ i6) * 15531) ^ 2074350486;
                    i9 = -2096283719;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m15964() {
        String strM15721 = null;
        int i = 926276081;
        int i2 = C0866.f81837;
        int i3 = C1071.f81975;
        int iM55680 = (i2 - C0873.m55680("۟ۗ")) * (-113);
        int i4 = ((iM55680 ^ i3) * (-13707)) ^ (-465244804);
        int i5 = -1753607272;
        while (true) {
            i = ((((i ^ i3) * (-9067)) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -1998922820:
                case 1975397498:
                    C0992.m56107();
                    if (C1012.f81938 < 0) {
                        iM55680 = C0873.m55680("ۡܰ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 9431) ^ (-1163390095);
                        i5 = 802204946;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ۛۚ")) * (-115);
                        i4 = ((iM55680 ^ i2) * (-2425)) ^ 1022428620;
                        i5 = 580304681;
                    }
                    break;
                case -1796222065:
                case 398503446:
                    this.f18125 = strM15721;
                    iM55680 = C0873.m55680("ܶᩳ") ^ i2;
                    i4 = ((iM55680 ^ i3) * 23581) ^ (-1504428288);
                    i5 = 1071756014;
                    break;
                case -1697091326:
                case -102193193:
                    if (!C0882.f81846) {
                        iM55680 = C0873.m55680("ۡܰ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 9431) ^ (-1163390095);
                        i5 = 802204946;
                    } else {
                        iM55680 = C0873.m55680("ۖܽ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-16513)) ^ (-668971558);
                        i5 = -1432510114;
                    }
                    break;
                case -1668132012:
                case 1103415282:
                    C0992.m56107();
                    if (C0912.f81867 > 0) {
                        iM55680 = C0873.m55680("֡ۚ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-1967)) ^ 1410235247;
                        i5 = -548156338;
                    } else {
                        iM55680 = C0873.m55680("ۖܽ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-16513)) ^ (-668971558);
                        i5 = -1432510114;
                    }
                    break;
                case -1535746064:
                case 159134700:
                    if (C1124.f82007 >= 0) {
                        iM55680 = C0873.m55680("ۖܽ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-16513)) ^ (-668971558);
                        i5 = -1432510114;
                    } else {
                        iM55680 = (C0946.m55979("ܽ᩻") ^ i2) * (-5);
                        i4 = ((iM55680 ^ i3) * 23979) ^ (-190534664);
                        i5 = 1756153590;
                    }
                    break;
                case -1150565308:
                case 922314890:
                    C0947.m55997();
                    return null;
                case -939066748:
                case -857646759:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55680 = (i3 - C0946.m55979("ܳ᩺")) * (-13);
                        i4 = ((iM55680 ^ i2) * 20821) ^ 1350076606;
                        i5 = -1810886929;
                    } else {
                        iM55680 = (C0946.m55979("᩻֨") ^ i3) * 85;
                        i4 = ((iM55680 ^ i2) * 10119) ^ (-1763034521);
                        i5 = 1334582814;
                    }
                    break;
                case -894022495:
                case 2143828532:
                    if (C1053.f81965 <= 0) {
                        iM55680 = (i3 - C0946.m55979("ܳ᩺")) * (-13);
                        i4 = ((iM55680 ^ i2) * 20821) ^ 1350076606;
                        i5 = -1810886929;
                    } else {
                        iM55680 = (C0873.m55680("ܰ֡") + i3) * (-37);
                        i4 = ((iM55680 ^ i2) * 25629) ^ (-895376811);
                        i5 = 1492947817;
                    }
                    break;
                case -525974113:
                case 1045125762:
                    if (C0906.f81862 >= 0) {
                        iM55680 = (i3 - C0946.m55979("ۛۚ")) * (-115);
                        i4 = ((iM55680 ^ i2) * (-2425)) ^ 1022428620;
                        i5 = 580304681;
                    } else {
                        iM55680 = (C0873.m55680("ۧ᩵") ^ i2) * 45;
                        i4 = ((iM55680 ^ i3) * (-28671)) ^ 234558488;
                        i5 = -92406826;
                    }
                    break;
                case -524149488:
                case 1214332438:
                    return this.f18125;
                case -395079448:
                case 380764317:
                    if (this.f18125 == null) {
                        iM55680 = C0946.m55979("֫۟") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-12171)) ^ (-95584478);
                        i5 = 798990744;
                    } else {
                        iM55680 = C0873.m55680("ܶᩳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 23581) ^ (-1504428288);
                        i5 = 1071756014;
                    }
                    break;
                case -257970378:
                case 1243603027:
                    if (C0937.m55918() >= 0) {
                        iM55680 = C0873.m55680("ۖܽ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-16513)) ^ (-668971558);
                        i5 = -1432510114;
                    } else {
                        iM55680 = (C0873.m55680("᩵ۘ") ^ i2) * (-97);
                        i4 = ((iM55680 ^ i3) * (-20605)) ^ 140189653;
                        i5 = -1107230815;
                    }
                    break;
                case -252500098:
                case 1082947707:
                    C1404.m56468();
                    iM55680 = (i3 - C0946.m55979("ۛۚ")) * (-115);
                    i4 = ((iM55680 ^ i2) * (-2425)) ^ 1022428620;
                    i5 = 580304681;
                    break;
                case 153405900:
                case 1972214573:
                    strM15721 = C6860.m15721(this.f18120);
                    if (C0873.f81841 <= 0) {
                        iM55680 = C0873.m55680("֡ۚ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-1967)) ^ 1410235247;
                        i5 = -548156338;
                    } else {
                        iM55680 = C0946.m55979("ܺ֫") ^ i2;
                        i4 = ((iM55680 ^ i3) * 19199) ^ (-1680290412);
                        i5 = -708749583;
                    }
                    break;
                case 182641987:
                case 1062064217:
                    if (C0937.f81884) {
                        iM55680 = C0873.m55680("᩵ۗ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-7015)) ^ (-1662706372);
                        i5 = 1822885265;
                    } else {
                        iM55680 = C0873.m55680("ۡܰ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 9431) ^ (-1163390095);
                        i5 = 802204946;
                    }
                    break;
                case 648518058:
                case 1433055600:
                    if (C0955.f81898) {
                        iM55680 = (i3 - C0946.m55979("ܳ᩺")) * (-13);
                        i4 = ((iM55680 ^ i2) * 20821) ^ 1350076606;
                        i5 = -1810886929;
                    } else {
                        iM55680 = (C0946.m55979("ۧ֨") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM55680 ^ i3) * (-2241)) ^ 1498568334;
                        i5 = 1664852958;
                    }
                    break;
                case 1509925807:
                case 1832012959:
                    if (C0861.f81831) {
                        iM55680 = C0946.m55979("ۢۛ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-32029)) ^ 730686836;
                        i5 = 1943122825;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ۛۚ")) * (-115);
                        i4 = ((iM55680 ^ i2) * (-2425)) ^ 1022428620;
                        i5 = 580304681;
                    }
                    break;
                default:
                    if (C1044.f81959 >= 0) {
                        iM55680 = (i3 - C0946.m55979("ۛۚ")) * (-115);
                        i4 = ((iM55680 ^ i2) * (-2425)) ^ 1022428620;
                        i5 = 580304681;
                    } else {
                        iM55680 = C0946.m55979("᩸ۗ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-25805)) ^ 2028327716;
                        i5 = 1267378432;
                    }
                    break;
            }
        }
    }

    public C6970(PackageInfo packageInfo) {
        int iM55979;
        int i;
        ApplicationInfo applicationInfo;
        long length;
        int i2;
        int i3;
        int iM55680;
        int i4;
        int i5;
        int i6;
        ApplicationInfo applicationInfo2;
        int i7;
        long j;
        long j2;
        int iM55681;
        int i8;
        int i9 = 866467556;
        int i10 = C1053.f81965;
        int i11 = ViewOnClickListenerC0939.f81888;
        short s = f81980[0];
        int i12 = ((s * s) + 95824521) - (s * 19578) < 0 ? 44353 : 58310;
        int iM559710 = C0946.m55979("ܿ۟") ^ i10;
        long j3 = 0;
        String strM55986 = null;
        StringBuilder sb = null;
        long length2 = 0;
        short[] sArr = null;
        int i13 = 0;
        int i14 = ((iM559710 ^ i11) * (-32437)) ^ (-1840168554);
        String[] strArr = null;
        StringBuilder sb2 = null;
        long j4 = 0;
        ApplicationInfo applicationInfo3 = null;
        long j5 = 0;
        int i15 = iM559710 ^ 1617322557;
        long j6 = 0;
        int i16 = 0;
        int length3 = 0;
        while (true) {
            i9 = i15 ^ (i14 & (((i9 ^ i11) * (-8345)) >> 31));
            switch (i9) {
                case -2119926527:
                case -1110843985:
                    if (C1003.m56123() != 0) {
                        iM55979 = C0873.m55680("ۖܺ") ^ i11;
                        i14 = ((iM55979 ^ i10) * 29401) ^ (-189970222);
                        i = 1028742448;
                        i15 = iM55979 ^ i;
                    } else {
                        j = j5;
                        i2 = i12;
                        applicationInfo2 = applicationInfo3;
                        i6 = i16;
                        long j7 = j;
                        int iM559711 = (C0946.m55979("ۢۤ") + i10) * 53;
                        i7 = i6;
                        applicationInfo3 = applicationInfo2;
                        i12 = i2;
                        j5 = j7;
                        i15 = iM559711 ^ 956806502;
                        i14 = ((iM559711 ^ i11) * (-27917)) ^ 58912517;
                        i16 = i7;
                    }
                    break;
                case -2105183149:
                case 112239224:
                    C1003.m56121(sb, C24158.m53411(j6));
                    this.f18128 = C0845.m55591(sb);
                    iM55681 = (i10 - C0873.m55680("۬ۚ")) * (-89);
                    i14 = ((iM55681 ^ i11) * (-13717)) ^ 962523380;
                    i8 = -1730641903;
                    int i17 = iM55681 ^ i8;
                    sb = sb;
                    i15 = i17;
                    break;
                case -1964312411:
                case 2106874729:
                    if (C1929.f83011 != 0) {
                        sb = sb;
                        applicationInfo = applicationInfo3;
                        length = j5;
                        i2 = i12;
                        i3 = i16;
                        iM55680 = (C0946.m55979("۟۬") ^ i10) * 81;
                        i4 = ((iM55680 ^ i11) * (-5173)) ^ 2116329240;
                        i5 = 281849172;
                        StringBuilder sb3 = sb;
                        i15 = iM55680 ^ i5;
                        i12 = i2;
                        j5 = length;
                        i14 = i4;
                        sb = sb3;
                        i16 = i3;
                        applicationInfo3 = applicationInfo;
                    } else {
                        j = j5;
                        i2 = i12;
                        applicationInfo2 = applicationInfo3;
                        i6 = i16;
                        long j8 = j;
                        int iM559712 = (C0946.m55979("ۢۤ") + i10) * 53;
                        i7 = i6;
                        applicationInfo3 = applicationInfo2;
                        i12 = i2;
                        j5 = j8;
                        i15 = iM559712 ^ 956806502;
                        i14 = ((iM559712 ^ i11) * (-27917)) ^ 58912517;
                        i16 = i7;
                    }
                    break;
                case -1901419670:
                case 1959729738:
                    sb = sb;
                    applicationInfo = applicationInfo3;
                    length = j5;
                    i2 = i12;
                    i3 = i16;
                    this.f18118 = applicationInfo.targetSdkVersion;
                    this.f18121 = C20272.m45785(applicationInfo);
                    if (C0930.m55885() <= 0) {
                        iM55680 = C0946.m55979("ۖ֨") ^ i10;
                        i4 = ((iM55680 ^ i11) * (-17747)) ^ 1779578314;
                        i5 = 398521456;
                    } else {
                        iM55680 = C0946.m55979("۟ۜ") ^ i11;
                        i4 = ((iM55680 ^ i10) * (-8221)) ^ 1976100452;
                        i5 = 350511238;
                    }
                    StringBuilder sb4 = sb;
                    i15 = iM55680 ^ i5;
                    i12 = i2;
                    j5 = length;
                    i14 = i4;
                    sb = sb4;
                    i16 = i3;
                    applicationInfo3 = applicationInfo;
                    break;
                case -1661747761:
                case -1402421467:
                    sb = new StringBuilder();
                    C0912.m55825(sb, packageInfo.versionName);
                    C0912.m55825(sb, strM55986);
                    if (C1124.f82007 < 0) {
                        iM55979 = C0946.m55979("ܺᩳ") ^ i10;
                        i14 = ((iM55979 ^ i11) * (-25943)) ^ 1055340453;
                        i = 950125335;
                        i15 = iM55979 ^ i;
                    } else {
                        j = j5;
                        i2 = i12;
                        applicationInfo2 = applicationInfo3;
                        i6 = i16;
                        long j9 = j;
                        int iM559713 = (C0946.m55979("ۢۤ") + i10) * 53;
                        i7 = i6;
                        applicationInfo3 = applicationInfo2;
                        i12 = i2;
                        j5 = j9;
                        i15 = iM559713 ^ 956806502;
                        i14 = ((iM559713 ^ i11) * (-27917)) ^ 58912517;
                        i16 = i7;
                    }
                    break;
                case -1537492901:
                case 677066704:
                    sb = sb;
                    strM55986 = C0946.m55986(f81980, 1, 3, i12);
                    if (j6 != j3) {
                        iM55681 = C0873.m55680("᩺ܿ") ^ i11;
                        i14 = ((iM55681 ^ i10) * 11185) ^ (-1754344944);
                        i8 = -925686275;
                    } else {
                        iM55681 = C0873.m55680("᩸ܿ") ^ i10;
                        i14 = ((iM55681 ^ i11) * (-12051)) ^ (-1418448268);
                        i8 = -2073636262;
                    }
                    int i18 = iM55681 ^ i8;
                    sb = sb;
                    i15 = i18;
                    break;
                case -1518539879:
                case -1321274246:
                    C0912.m55825(sb, C0866.m55652(sArr, 4, 9, i12));
                    if (!C0917.f81868) {
                        iM55979 = C0946.m55979("ܺۧ") ^ i11;
                        i14 = ((iM55979 ^ i10) * (-10869)) ^ 2050498637;
                        i = 1385423010;
                        i15 = iM55979 ^ i;
                    } else {
                        sb = sb;
                        applicationInfo = applicationInfo3;
                        length = j5;
                        i2 = i12;
                        i3 = i16;
                        iM55680 = C0946.m55979("ۖ֨") ^ i10;
                        i4 = ((iM55680 ^ i11) * (-17747)) ^ 1779578314;
                        i5 = 398521456;
                        StringBuilder sb5 = sb;
                        i15 = iM55680 ^ i5;
                        i12 = i2;
                        j5 = length;
                        i14 = i4;
                        sb = sb5;
                        i16 = i3;
                        applicationInfo3 = applicationInfo;
                    }
                    break;
                case -1338392395:
                case -362727623:
                    sb = sb;
                    sb2 = new StringBuilder();
                    C0912.m55825(sb2, packageInfo.versionName);
                    C1003.m56121(sb2, strM55986);
                    if (C1124.f82007 < 0) {
                        iM55681 = C0873.m55680("ܿ֫") ^ i10;
                        i14 = ((iM55681 ^ i11) * 5261) ^ 235479719;
                        i8 = -297432541;
                        int i19 = iM55681 ^ i8;
                        sb = sb;
                        i15 = i19;
                    } else {
                        applicationInfo = applicationInfo3;
                        length = j5;
                        i2 = i12;
                        i3 = i16;
                        iM55680 = C0946.m55979("ۖ֨") ^ i10;
                        i4 = ((iM55680 ^ i11) * (-17747)) ^ 1779578314;
                        i5 = 398521456;
                        StringBuilder sb6 = sb;
                        i15 = iM55680 ^ i5;
                        i12 = i2;
                        j5 = length;
                        i14 = i4;
                        sb = sb6;
                        i16 = i3;
                        applicationInfo3 = applicationInfo;
                    }
                    break;
                case -1263899772:
                case -394631288:
                    i6 = i16;
                    sb = sb;
                    length = j5;
                    i2 = i12;
                    applicationInfo2 = packageInfo.applicationInfo;
                    C0992.m56109(applicationInfo2);
                    if (C0873.f81841 <= 0) {
                        j = length;
                        sb = sb;
                        long j10 = j;
                        int iM559714 = (C0946.m55979("ۢۤ") + i10) * 53;
                        i7 = i6;
                        applicationInfo3 = applicationInfo2;
                        i12 = i2;
                        j5 = j10;
                        i15 = iM559714 ^ 956806502;
                        i14 = ((iM559714 ^ i11) * (-27917)) ^ 58912517;
                    } else {
                        int iM559715 = (C0946.m55979("ۘܽ") ^ i10) * (-35);
                        i7 = i6;
                        applicationInfo3 = applicationInfo2;
                        i12 = i2;
                        j5 = length;
                        i14 = ((iM559715 ^ i11) * 10721) ^ (-1643027282);
                        sb = sb;
                        i15 = iM559715 ^ (-1551514317);
                    }
                    i16 = i7;
                    break;
                case -922437994:
                case 1413131413:
                    sb = sb;
                    applicationInfo = applicationInfo3;
                    length = j5;
                    i2 = i12;
                    i3 = i16;
                    this.f18120 = packageInfo;
                    this.f18124 = packageInfo.packageName;
                    if (C1964.f83032 <= 0) {
                        iM55680 = (C0946.m55979("۟۬") ^ i10) * 81;
                        i4 = ((iM55680 ^ i11) * (-5173)) ^ 2116329240;
                        i5 = 281849172;
                    } else {
                        iM55680 = (i11 - C0873.m55680("ۖᩳ")) * (-95);
                        i4 = ((iM55680 ^ i10) * 20731) ^ 78609418;
                        i5 = 1941237662;
                    }
                    StringBuilder sb7 = sb;
                    i15 = iM55680 ^ i5;
                    i12 = i2;
                    j5 = length;
                    i14 = i4;
                    sb = sb7;
                    i16 = i3;
                    applicationInfo3 = applicationInfo;
                    break;
                case -864197855:
                case -717416590:
                    sb = sb;
                    if (i16 >= length3) {
                        applicationInfo = applicationInfo3;
                        j2 = j5;
                        j6 = j4;
                        int iM55682 = C0873.m55680("᩺᩸") ^ i10;
                        long j11 = j2;
                        i14 = ((iM55682 ^ i11) * (-6971)) ^ 382028014;
                        sb = sb;
                        i15 = iM55682 ^ 470045126;
                        i12 = i12;
                        j5 = j11;
                        applicationInfo3 = applicationInfo;
                    } else {
                        iM55681 = C0873.m55680("ܰܰ") ^ i10;
                        i14 = ((iM55681 ^ i11) * 17395) ^ 1663889767;
                        i8 = -896540957;
                        int i110 = iM55681 ^ i8;
                        sb = sb;
                        i15 = i110;
                    }
                    break;
                case -830406825:
                case -635878073:
                    C0912.m55825(sb2, C24158.m53411(this.f18117));
                    this.f18128 = C0845.m55591(sb2);
                    iM55681 = (i10 - C0873.m55680("۬ۚ")) * (-89);
                    i14 = ((iM55681 ^ i11) * (-13717)) ^ 962523380;
                    i8 = -1730641903;
                    int i111 = iM55681 ^ i8;
                    sb = sb;
                    i15 = i111;
                    break;
                case -662107723:
                case 217911366:
                    C1003.m56121(sb, C24158.m53411(this.f18117));
                    sArr = f81980;
                    if (RunnableC0938.f81886 < 0) {
                        iM55979 = (C0873.m55680("᩸֫") ^ i11) * 51;
                        i14 = ((iM55979 ^ i10) * 14109) ^ 1833198391;
                        i = 1933676214;
                        i15 = iM55979 ^ i;
                    } else {
                        sb = sb;
                        applicationInfo = applicationInfo3;
                        length = j5;
                        i2 = i12;
                        i3 = i16;
                        iM55680 = (C0946.m55979("۟۬") ^ i10) * 81;
                        i4 = ((iM55680 ^ i11) * (-5173)) ^ 2116329240;
                        i5 = 281849172;
                        StringBuilder sb8 = sb;
                        i15 = iM55680 ^ i5;
                        i12 = i2;
                        j5 = length;
                        i14 = i4;
                        sb = sb8;
                        i16 = i3;
                        applicationInfo3 = applicationInfo;
                    }
                    break;
                case -557292138:
                case 1246045111:
                    length3 = strArr.length;
                    j4 = j3;
                    i16 = 0;
                    iM55681 = C0946.m55979("᩺᩶") ^ i11;
                    i14 = ((iM55681 ^ i10) * (-29595)) ^ (-1878995044);
                    i8 = -2128741255;
                    int i112 = iM55681 ^ i8;
                    sb = sb;
                    i15 = i112;
                    break;
                case -297423980:
                case 1514464878:
                    C1003.m56123();
                    throw new RuntimeException();
                case 230535349:
                case 1463522275:
                    j4 += length2;
                    i16++;
                    iM55681 = C0946.m55979("᩺᩶") ^ i11;
                    i14 = ((iM55681 ^ i10) * (-29595)) ^ (-1878995044);
                    i8 = -2128741255;
                    int i113 = iM55681 ^ i8;
                    sb = sb;
                    i15 = i113;
                    break;
                case 330634510:
                case 1086791532:
                    i2 = i12;
                    sb = sb;
                    applicationInfo = applicationInfo3;
                    length = new File(applicationInfo.sourceDir).length();
                    if (!C0873.m55678()) {
                        iM55680 = C0873.m55680("᩸۟") ^ i10;
                        i3 = i16;
                        i4 = ((iM55680 ^ i11) * 4575) ^ 1568984707;
                        i5 = 1592056505;
                        StringBuilder sb9 = sb;
                        i15 = iM55680 ^ i5;
                        i12 = i2;
                        j5 = length;
                        i14 = i4;
                        sb = sb9;
                        i16 = i3;
                        applicationInfo3 = applicationInfo;
                    } else {
                        i6 = i16;
                        applicationInfo2 = applicationInfo;
                        j = length;
                        sb = sb;
                        long j12 = j;
                        int iM559716 = (C0946.m55979("ۢۤ") + i10) * 53;
                        i7 = i6;
                        applicationInfo3 = applicationInfo2;
                        i12 = i2;
                        j5 = j12;
                        i15 = iM559716 ^ 956806502;
                        i14 = ((iM559716 ^ i11) * (-27917)) ^ 58912517;
                        i16 = i7;
                    }
                    break;
                case 357032536:
                case 816391953:
                    this.f18129 = new C0878(new ColorDrawable(i13));
                    return;
                case 495531250:
                case 1769087523:
                    C0890.m55740();
                    C1036.m56257();
                    j = j5;
                    i2 = i12;
                    applicationInfo2 = applicationInfo3;
                    i6 = i16;
                    long j13 = j;
                    int iM559717 = (C0946.m55979("ۢۤ") + i10) * 53;
                    i7 = i6;
                    applicationInfo3 = applicationInfo2;
                    i12 = i2;
                    j5 = j13;
                    i15 = iM559717 ^ 956806502;
                    i14 = ((iM559717 ^ i11) * (-27917)) ^ 58912517;
                    i16 = i7;
                    break;
                case 597427402:
                case 761504841:
                    C0882.m55710();
                    if (C0989.f81920 >= 0) {
                        iM55979 = (i11 - C0873.m55680("֨᩷")) * 85;
                        i14 = ((iM55979 ^ i10) * 17915) ^ (-821102548);
                        i = 1702394925;
                        i15 = iM55979 ^ i;
                    } else {
                        sb = sb;
                        applicationInfo = applicationInfo3;
                        length = j5;
                        i2 = i12;
                        i3 = i16;
                        iM55680 = (C0946.m55979("۟۬") ^ i10) * 81;
                        i4 = ((iM55680 ^ i11) * (-5173)) ^ 2116329240;
                        i5 = 281849172;
                        StringBuilder sb10 = sb;
                        i15 = iM55680 ^ i5;
                        i12 = i2;
                        j5 = length;
                        i14 = i4;
                        sb = sb10;
                        i16 = i3;
                        applicationInfo3 = applicationInfo;
                    }
                    break;
                case 1419390023:
                case 1427035704:
                    this.f18123 = new C0878(new ColorDrawable(i13));
                    if (RunnableC1014.f81941 > 0) {
                        iM55979 = (C0873.m55680("ۛۘ") + i11) * 69;
                        i14 = ((iM55979 ^ i10) * 17785) ^ (-47904219);
                        i = -1652603403;
                        i15 = iM55979 ^ i;
                    } else {
                        sb = sb;
                        applicationInfo = applicationInfo3;
                        length = j5;
                        i2 = i12;
                        i3 = i16;
                        iM55680 = C0946.m55979("ۖ֨") ^ i10;
                        i4 = ((iM55680 ^ i11) * (-17747)) ^ 1779578314;
                        i5 = 398521456;
                        StringBuilder sb11 = sb;
                        i15 = iM55680 ^ i5;
                        i12 = i2;
                        j5 = length;
                        i14 = i4;
                        sb = sb11;
                        i16 = i3;
                        applicationInfo3 = applicationInfo;
                    }
                    break;
                case 1677716733:
                case 1790691574:
                    sb = sb;
                    j2 = j5;
                    this.f18117 = j2;
                    applicationInfo = applicationInfo3;
                    strArr = applicationInfo.splitSourceDirs;
                    j3 = 0;
                    if (strArr != null) {
                        int iM559718 = (C0946.m55979("֡ۨ") ^ i11) * (-49);
                        j5 = j2;
                        i14 = ((iM559718 ^ i10) * 32445) ^ 1638819865;
                        i13 = 0;
                        sb = sb;
                        i15 = iM559718 ^ (-1358132217);
                    } else {
                        j6 = 0;
                        i13 = 0;
                        int iM55683 = C0873.m55680("᩺᩸") ^ i10;
                        long j14 = j2;
                        i14 = ((iM55683 ^ i11) * (-6971)) ^ 382028014;
                        sb = sb;
                        i15 = iM55683 ^ 470045126;
                        i12 = i12;
                        j5 = j14;
                    }
                    applicationInfo3 = applicationInfo;
                    break;
                default:
                    length2 = new File(strArr[i16]).length();
                    if (C0967.f81910 < 0) {
                        iM55979 = C0873.m55680("᩵᩸") ^ i11;
                        i14 = ((iM55979 ^ i10) * (-25659)) ^ 1548701946;
                        i = 1503484449;
                        i15 = iM55979 ^ i;
                    } else {
                        j = j5;
                        i2 = i12;
                        applicationInfo2 = applicationInfo3;
                        i6 = i16;
                        long j15 = j;
                        int iM559719 = (C0946.m55979("ۢۤ") + i10) * 53;
                        i7 = i6;
                        applicationInfo3 = applicationInfo2;
                        i12 = i2;
                        j5 = j15;
                        i15 = iM559719 ^ 956806502;
                        i14 = ((iM559719 ^ i11) * (-27917)) ^ 58912517;
                        i16 = i7;
                    }
                    break;
            }
        }
    }
}
