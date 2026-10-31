package l;

import android.content.Intent;
import android.widget.EditText;
import android.widget.Spinner;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܶۢ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 517G */
/* JADX INFO: loaded from: classes4.dex */
public final class C15155 {

    /* JADX INFO: renamed from: ܰ֫᩶, reason: not valid java name and contains not printable characters */
    private static final short[] f46310 = {11, 23040, 23068, 23045, 23063, 23065, 23070, 23097, 23060, 7196, -21923, 30243, 26352, 7237, 23437, 22028, 16564, -20697, -23654, -16424, -17715, -24070, -19203, 16523, -20781, 18330, -16502, -24220, -32669, 18786, 18619, 23948, 21733, -20910, 16975, 19290, -17254, -18305, -28797, 21243, -21247, -30974, 20886, -30824, -12016, -12010, -12027, -12022, -12009, -12024, -12027, -12016, -12021, -12010, -11973, -12016, -12031, -12009, -12016, -12031, -12010, -11973, -12025, -12021, -12022, -12016, -12031, -12022, -12016, -24213, 23213, 23400, 24568, -24968, -30201};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f46311;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C16709 f46312;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f46313;

    /* JADX WARN: Code duplicated, block: B:36:0x00b3 A[PHI: r1 r8
      0x00b3: PHI (r1v5 java.util.concurrent.ExecutorService) = 
      (r1v2 java.util.concurrent.ExecutorService)
      (r1v3 java.util.concurrent.ExecutorService)
      (r1v2 java.util.concurrent.ExecutorService)
      (r1v2 java.util.concurrent.ExecutorService)
      (r1v2 java.util.concurrent.ExecutorService)
     binds: [B:35:0x00b1, B:27:0x0074, B:18:0x004c, B:16:0x0049, B:10:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x00b3: PHI (r8v8 l.֡ۢ᩷) = (r8v4 l.֡ۢ᩷), (r8v5 l.֡ۢ᩷), (r8v4 l.֡ۢ᩷), (r8v4 l.֡ۢ᩷), (r8v4 l.֡ۢ᩷) binds: [B:35:0x00b1, B:27:0x0074, B:18:0x004c, B:16:0x0049, B:10:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:53:0x016a  */
    /* JADX WARN: Code duplicated, block: B:57:0x019b A[PHI: r0
      0x019b: PHI (r0v4 java.util.ArrayList) = (r0v3 java.util.ArrayList), (r0v2 java.util.ArrayList) binds: [B:56:0x0199, B:31:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    public C15155(AbstractActivityC3346 abstractActivityC3346, C16709 c16709) {
        int iM2566;
        int i;
        ArrayList arrayList = null;
        ExecutorService executorServiceNewSingleThreadExecutor = null;
        int i2 = -1157796329;
        int i3 = C3019.f9544;
        int i4 = C3245.f10203;
        int iM2567 = C0630.m2566("ᩴۜ") ^ i3;
        int i5 = ((iM2567 ^ i4) * 18049) ^ (-1649475259);
        int i6 = 1848156925;
        while (true) {
            int i7 = iM2567 ^ i6;
            C0339 c0339 = null;
            while (true) {
                i2 = ((((i2 ^ i4) * (-5097)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2088103451:
                    case -32025648:
                        arrayList = new ArrayList();
                        if (ServiceConnectionC3453.m10564() <= 0) {
                            iM2566 = (C0630.m2566("۫۫") ^ i4) * (-43);
                            i5 = ((iM2566 ^ i3) * 17441) ^ 132367392;
                            i = -1784086900;
                        } else {
                            iM2566 = C0630.m2566("᩵۬") ^ i4;
                            i5 = ((iM2566 ^ i3) * 26031) ^ (-1759900369);
                            i = -1976038337;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -2033933926:
                    case 1128021487:
                        if (!C0798.f2919) {
                            iM2566 = (C0630.m2566("ۨۛ") + i3) * 57;
                            i5 = ((iM2566 ^ i4) * (-4493)) ^ 300087942;
                            i = -1888772478;
                            i7 = iM2566 ^ i;
                        }
                        break;
                    case -2001149162:
                    case 1053521730:
                        if (C21923.f70183 != 0) {
                            iM2566 = C2105.m6981("ۜᩳ") ^ i3;
                            i5 = ((iM2566 ^ i4) * (-18599)) ^ 861505858;
                            i = -229464738;
                        } else {
                            iM2566 = C2105.m6981("ܺۘ") ^ i3;
                            i5 = ((iM2566 ^ i4) * (-1565)) ^ (-1960951518);
                            i = 324163898;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -1606526684:
                    case 548521052:
                        C0237.m1481();
                        if (C1005.f3721) {
                            iM2566 = C0630.m2566("۟֨") ^ i3;
                            i5 = ((iM2566 ^ i4) * 32297) ^ 147077537;
                            i = -1272193909;
                        } else {
                            iM2566 = C2105.m6981("֡۟") ^ i3;
                            i5 = ((iM2566 ^ i4) * (-12311)) ^ 1325163081;
                            i = -1552590731;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -1472041152:
                    case -444096338:
                        if (C2167.f7158 >= 0) {
                            iM2566 = C2105.m6981("֡۟") ^ i3;
                            i5 = ((iM2566 ^ i4) * (-12311)) ^ 1325163081;
                            i = -1552590731;
                        } else {
                            iM2566 = C2105.m6981("۫۠") ^ i3;
                            i5 = ((iM2566 ^ i4) * (-21221)) ^ 442138346;
                            i = -1365415606;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -1258507700:
                    case 536069049:
                        C7811.m20844();
                        iM2566 = C0630.m2566("۟֨") ^ i3;
                        i5 = ((iM2566 ^ i4) * 32297) ^ 147077537;
                        i = -1272193909;
                        i7 = iM2566 ^ i;
                        break;
                    case -1065233244:
                    case 1322542299:
                        C2958.m9034();
                        if (C1128.m3851() > 0) {
                        }
                        iM2566 = C2105.m6981("ۜᩳ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-18599)) ^ 861505858;
                        i = -229464738;
                        i7 = iM2566 ^ i;
                        break;
                    case -950849567:
                    case 1100209474:
                        this.f46311 = abstractActivityC3346;
                        this.f46312 = c16709;
                        if (RunnableC1937.m6387() != 0) {
                            iM2566 = (C0630.m2566("۫۫") ^ i4) * (-43);
                            i5 = ((iM2566 ^ i3) * 17441) ^ 132367392;
                            i = -1784086900;
                        } else {
                            iM2566 = C0630.m2566("۫᩷") ^ i3;
                            i5 = ((iM2566 ^ i4) * (-29795)) ^ (-1069718037);
                            i = -1901604583;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -840306430:
                    case 1691897608:
                        c0339.m20265(executorServiceNewSingleThreadExecutor);
                        C0964.m3402(c0339);
                        return;
                    case -833266006:
                    case 1502253010:
                        C3746.m11369();
                        C1005.m3501();
                        throw new RuntimeException();
                    case -521931914:
                    case 1715697161:
                        if (C1047.f3863 >= 0) {
                            iM2566 = C2105.m6981("֡۟") ^ i3;
                            i5 = ((iM2566 ^ i4) * (-12311)) ^ 1325163081;
                            i = -1552590731;
                        } else {
                            iM2566 = (i4 - C2105.m6981("ۜܰ")) * 13;
                            i5 = ((iM2566 ^ i3) * (-17779)) ^ 177999280;
                            i = -19585850;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case 326716874:
                    case 1661380613:
                        executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                        if (C0483.f2088 < 0) {
                            c0339 = new C0339(this, abstractActivityC3346, executorServiceNewSingleThreadExecutor, c16709);
                            if (C3019.f9544 >= 0) {
                                iM2566 = C0630.m2566("۟֨") ^ i3;
                                i5 = ((iM2566 ^ i4) * 32297) ^ 147077537;
                                i = -1272193909;
                            } else {
                                iM2566 = (C2105.m6981("ۙ᩻") ^ i4) * 53;
                                i5 = ((iM2566 ^ i3) * (-27585)) ^ 98648500;
                                i = 1206558266;
                            }
                            i7 = iM2566 ^ i;
                        }
                        break;
                    case 871680329:
                    case 1017684015:
                        this.f46313 = arrayList;
                        if (C3537.f11231 >= 0) {
                            iM2566 = C0630.m2566("۟֨") ^ i3;
                            i5 = ((iM2566 ^ i4) * 32297) ^ 147077537;
                            i = -1272193909;
                        } else {
                            iM2566 = C2105.m6981("ܶ۫") ^ i4;
                            i5 = ((iM2566 ^ i3) * (-8495)) ^ 2128141534;
                            i = -450194948;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case 1501305688:
                    case 1990587771:
                        if (C3019.f9544 >= 0) {
                            iM2566 = C0630.m2566("۟֨") ^ i3;
                            i5 = ((iM2566 ^ i4) * 32297) ^ 147077537;
                            i = -1272193909;
                        } else {
                            iM2566 = C2105.m6981("ۜᩳ") ^ i3;
                            i5 = ((iM2566 ^ i4) * (-18599)) ^ 861505858;
                            i = -229464738;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    default:
                        if (C4075.m12263() <= 0) {
                            iM2566 = C2105.m6981("֡۟") ^ i3;
                            i5 = ((iM2566 ^ i4) * (-12311)) ^ 1325163081;
                            i = -1552590731;
                        } else {
                            iM2566 = C2105.m6981("ۜ᩸") ^ i4;
                            i5 = ((iM2566 ^ i3) * 26815) ^ (-455070438);
                            i = 517019483;
                        }
                        i7 = iM2566 ^ i;
                        break;
                }
            }
            iM2567 = (C0630.m2566("ۘ֡") + i4) * 35;
            i5 = ((iM2567 ^ i3) * 19673) ^ (-1514354712);
            i6 = -1072617016;
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0228 A[PHI: r2 r5
      0x0228: PHI (r2v26 l.ۗܺ᩷) = (r2v6 l.ۗܺ᩷), (r2v19 l.ۗܺ᩷), (r2v1 l.ۗܺ᩷), (r2v1 l.ۗܺ᩷) binds: [B:61:0x0226, B:32:0x00e3, B:16:0x0067, B:13:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r5v3 char) = (r5v2 char), (r5v1 char), (r5v1 char), (r5v1 char) binds: [B:61:0x0226, B:32:0x00e3, B:16:0x0067, B:13:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004d, code lost:
    
        if (l.C1047.m3599() >= 0) goto L10;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m35856(C15155 c15155) {
        int iM2566;
        int i;
        C15155 c15156 = c15155;
        AbstractActivityC3346 abstractActivityC3346 = null;
        String strM5914 = null;
        char c = 0;
        short s = 0;
        int i2 = 0;
        int i3 = 0;
        short s2 = 0;
        int i4 = 0;
        int i5 = 0;
        short[] sArr = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = -1705954545;
        int i9 = C2958.f9394;
        int i10 = C7811.f24123;
        int iM6981 = (C2105.m6981("᩺ۛ") ^ i9) * (-83);
        int i11 = ((iM6981 ^ i10) * (-27429)) ^ 1927442183;
        int i12 = iM6981 ^ 2013151431;
        short[] sArr2 = null;
        Intent intent = null;
        while (true) {
            i8 = i12 ^ (i11 & (((i8 ^ i10) * 3421) >> 31));
            switch (i8) {
                case -2138584082:
                case -1234501842:
                    abstractActivityC3346 = abstractActivityC3346;
                    i3 = i2 * i2;
                    s2 = 2;
                    if (C1420.m4913()) {
                        iM2566 = C2105.m6981("᩻֡") ^ i10;
                        i11 = ((iM2566 ^ i9) * (-25569)) ^ 1409723865;
                        i = 917694526;
                    } else {
                        iM2566 = (C0630.m2566("᩷֡") ^ i9) * (-107);
                        i11 = ((iM2566 ^ i10) * (-31969)) ^ (-180167646);
                        i = 883092500;
                    }
                    int i13 = iM2566 ^ i;
                    abstractActivityC3346 = abstractActivityC3346;
                    i12 = i13;
                    c15156 = c15155;
                    break;
                case -2025777153:
                case 1912231756:
                    C3432.m10477();
                    if (RunnableC1937.m6387() != 0) {
                        abstractActivityC3346 = abstractActivityC3346;
                        iM2566 = C0630.m2566("ۡۨ") ^ i9;
                        i11 = ((iM2566 ^ i10) * 17873) ^ 2009535595;
                        i = -69786996;
                        int i14 = iM2566 ^ i;
                        abstractActivityC3346 = abstractActivityC3346;
                        i12 = i14;
                    } else {
                        int iM6982 = (C2105.m6981("ᩴۛ") + i10) * (-55);
                        i11 = ((iM6982 ^ i9) * (-1659)) ^ 801737919;
                        i12 = iM6982 ^ 1799142719;
                        intent = null;
                    }
                    c15156 = c15155;
                    break;
                case -2016296976:
                case 250946620:
                    C0630.m2564();
                    RunnableC3474.m10630();
                    break;
                case -1930428329:
                case 1491569687:
                    C0630.m2564();
                    if (C21923.f70183 != 0) {
                        int iM6983 = (C2105.m6981("ᩴۛ") + i10) * (-55);
                        i11 = ((iM6983 ^ i9) * (-1659)) ^ 801737919;
                        i12 = iM6983 ^ 1799142719;
                        intent = null;
                    } else {
                        abstractActivityC3346 = abstractActivityC3346;
                        iM2566 = C2105.m6981("᩻֡") ^ i10;
                        i11 = ((iM2566 ^ i9) * (-25569)) ^ 1409723865;
                        i = 917694526;
                        int i15 = iM2566 ^ i;
                        abstractActivityC3346 = abstractActivityC3346;
                        i12 = i15;
                    }
                    c15156 = c15155;
                    break;
                case -1908157989:
                case 285368591:
                    abstractActivityC3346 = abstractActivityC3346;
                    c = 0;
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        iM2566 = (i10 - C0630.m2566("ۘ᩷")) * (-87);
                        i11 = ((iM2566 ^ i9) * (-7087)) ^ 1809754148;
                        i = -451150788;
                        int i16 = iM2566 ^ i;
                        abstractActivityC3346 = abstractActivityC3346;
                        i12 = i16;
                        c15156 = c15155;
                    } else {
                        abstractActivityC3346 = abstractActivityC3346;
                        int iM6984 = (C2105.m6981("ᩴۛ") + i10) * (-55);
                        i11 = ((iM6984 ^ i9) * (-1659)) ^ 801737919;
                        i12 = iM6984 ^ 1799142719;
                        intent = null;
                        c15156 = c15155;
                    }
                    break;
                case -1764688988:
                case -531845181:
                    abstractActivityC3346 = c15156.f46311;
                    if (C4616.f14690 <= 0) {
                        int iM6985 = (C2105.m6981("ᩴۛ") + i10) * (-55);
                        i11 = ((iM6985 ^ i9) * (-1659)) ^ 801737919;
                        i12 = iM6985 ^ 1799142719;
                        intent = null;
                    } else {
                        intent = new Intent(abstractActivityC3346, (Class<?>) ActivityC4094.class);
                        if (C7811.f24123 >= 0) {
                            int iM6986 = C2105.m6981("ۡ᩵") ^ i10;
                            i11 = ((iM6986 ^ i9) * (-30949)) ^ 926812556;
                            i12 = iM6986 ^ 1972612179;
                        } else {
                            int iM2567 = (i9 - C0630.m2566("ۙܽ")) * 89;
                            i12 = iM2567 ^ 25792375;
                            i11 = ((iM2567 ^ i10) * 3789) ^ (-2022042052);
                        }
                    }
                    c15156 = c15155;
                    break;
                case -1646552560:
                case 992770291:
                    sArr = f46310;
                    i7 = 8;
                    if (C3432.f10845 >= 0) {
                        abstractActivityC3346 = abstractActivityC3346;
                        i6 = 1;
                        iM2566 = C0630.m2566("ۡۨ") ^ i9;
                        i11 = ((iM2566 ^ i10) * 17873) ^ 2009535595;
                        i = -69786996;
                        int i17 = iM2566 ^ i;
                        abstractActivityC3346 = abstractActivityC3346;
                        i12 = i17;
                        c15156 = c15155;
                    } else {
                        int iM2568 = (C0630.m2566("᩵۫") ^ i10) * (-99);
                        i12 = iM2568 ^ 730431424;
                        i11 = ((iM2568 ^ i9) * (-21297)) ^ 992148359;
                        i6 = 1;
                    }
                    break;
                case -1347466463:
                case 2024973235:
                    C0714.m2805();
                    abstractActivityC3346 = abstractActivityC3346;
                    iM2566 = C0630.m2566("ۡۨ") ^ i9;
                    i11 = ((iM2566 ^ i10) * 17873) ^ 2009535595;
                    i = -69786996;
                    int i18 = iM2566 ^ i;
                    abstractActivityC3346 = abstractActivityC3346;
                    i12 = i18;
                    c15156 = c15155;
                    break;
                case -1110836611:
                case -235029575:
                    abstractActivityC3346 = abstractActivityC3346;
                    sArr2 = f46310;
                    if (C3683.f11629 >= 0) {
                        iM2566 = C2105.m6981("᩷ᩴ") ^ i9;
                        i11 = ((iM2566 ^ i10) * 22477) ^ (-364978647);
                        i = -1379526563;
                    } else {
                        iM2566 = C0630.m2566("᩷ۤ") ^ i9;
                        i11 = ((iM2566 ^ i10) * (-32189)) ^ (-1913192509);
                        i = 2070032385;
                    }
                    int i19 = iM2566 ^ i;
                    abstractActivityC3346 = abstractActivityC3346;
                    i12 = i19;
                    c15156 = c15155;
                    break;
                case -1099566475:
                case -119089715:
                    abstractActivityC3346 = abstractActivityC3346;
                    i4 = s * s2;
                    if (C2126.f7087) {
                        iM2566 = C0630.m2566("ۡۨ") ^ i9;
                        i11 = ((iM2566 ^ i10) * 17873) ^ 2009535595;
                        i = -69786996;
                    } else {
                        iM2566 = (i10 - C0630.m2566("ۚܰ")) * 33;
                        i11 = ((iM2566 ^ i9) * (-15839)) ^ 792505459;
                        i = -136249767;
                    }
                    int i110 = iM2566 ^ i;
                    abstractActivityC3346 = abstractActivityC3346;
                    i12 = i110;
                    c15156 = c15155;
                    break;
                case -1000110432:
                case 2113771936:
                    break;
                case -344156734:
                case 1002701403:
                    i5 = 44888;
                    iM2566 = C0630.m2566("᩺ۙ") ^ i10;
                    i11 = ((iM2566 ^ i9) * (-21519)) ^ 558409528;
                    i = 656606588;
                    int i111 = iM2566 ^ i;
                    abstractActivityC3346 = abstractActivityC3346;
                    i12 = i111;
                    c15156 = c15155;
                    break;
                case -91144083:
                case 1443294140:
                    i5 = 23152;
                    iM2566 = C0630.m2566("᩺ۙ") ^ i10;
                    i11 = ((iM2566 ^ i9) * (-21519)) ^ 558409528;
                    i = 656606588;
                    int i112 = iM2566 ^ i;
                    abstractActivityC3346 = abstractActivityC3346;
                    i12 = i112;
                    c15156 = c15155;
                    break;
                case 86890861:
                case 1593067532:
                    C3663.m11172(intent, C1773.m5917(sArr, i6, i7, i5), strM5914);
                    C4075.m12261(abstractActivityC3346, intent);
                    break;
                case 240296671:
                case 1650847956:
                    abstractActivityC3346 = abstractActivityC3346;
                    s = sArr2[c];
                    if (C1128.m3851() > 0) {
                        iM2566 = (C0630.m2566("ۢܳ") ^ i10) * 33;
                        i11 = ((iM2566 ^ i9) * (-20635)) ^ 702594724;
                        i = 2076754328;
                        int i113 = iM2566 ^ i;
                        abstractActivityC3346 = abstractActivityC3346;
                        i12 = i113;
                        c15156 = c15155;
                    }
                    abstractActivityC3346 = abstractActivityC3346;
                    int iM6987 = C2105.m6981("ۡ᩵") ^ i10;
                    i11 = ((iM6987 ^ i9) * (-30949)) ^ 926812556;
                    i12 = iM6987 ^ 1972612179;
                    c15156 = c15155;
                    break;
                case 338704381:
                case 403562888:
                    abstractActivityC3346 = abstractActivityC3346;
                    if (i3 - (i4 + 1) < 0) {
                        iM2566 = C2105.m6981("ܺ۫") ^ i10;
                        i11 = ((iM2566 ^ i9) * 2213) ^ 595267036;
                        i = -1976294931;
                    } else {
                        iM2566 = (C2105.m6981("ᩳܺ") ^ i9) * (-75);
                        i11 = ((iM2566 ^ i10) * 11081) ^ (-435799170);
                        i = 2031356620;
                    }
                    int i114 = iM2566 ^ i;
                    abstractActivityC3346 = abstractActivityC3346;
                    i12 = i114;
                    c15156 = c15155;
                    break;
                case 492778748:
                case 962077420:
                    strM5914 = C1773.m5914(c15156.f46312);
                    if (C7811.m20844() != 0) {
                        abstractActivityC3346 = abstractActivityC3346;
                        iM2566 = C2105.m6981("᩷ᩴ") ^ i9;
                        i11 = ((iM2566 ^ i10) * 22477) ^ (-364978647);
                        i = -1379526563;
                        int i115 = iM2566 ^ i;
                        abstractActivityC3346 = abstractActivityC3346;
                        i12 = i115;
                        c15156 = c15155;
                    } else {
                        int iM6988 = C2105.m6981("ۡۜ") ^ i9;
                        i12 = iM6988 ^ 1761189020;
                        i11 = ((iM6988 ^ i10) * (-11731)) ^ (-1624632756);
                        abstractActivityC3346 = abstractActivityC3346;
                    }
                    break;
                default:
                    abstractActivityC3346 = abstractActivityC3346;
                    i2 = s + 1;
                    if (C1005.f3721) {
                        iM2566 = (C2105.m6981("ۜ۫") + i9) * 49;
                        i11 = ((iM2566 ^ i10) * 27375) ^ (-1300437457);
                        i = 1572807272;
                        int i116 = iM2566 ^ i;
                        abstractActivityC3346 = abstractActivityC3346;
                        i12 = i116;
                        c15156 = c15155;
                    }
                    abstractActivityC3346 = abstractActivityC3346;
                    int iM6989 = C2105.m6981("ۡ᩵") ^ i10;
                    i11 = ((iM6989 ^ i9) * (-30949)) ^ 926812556;
                    i12 = iM6989 ^ 1972612179;
                    c15156 = c15155;
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 32721. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m35860(l.C15155 r65) {
        /*
            Method dump skipped, instruction units count: 3272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15155.m35860(l.ܶۢ᩷):void");
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0130 A[PHI: r0 r4
      0x0130: PHI (r0v3 int) = (r0v2 int), (r0v1 int) binds: [B:41:0x012e, B:33:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x0130: PHI (r4v3 l.֨ۧᩳ) = (r4v2 l.֨ۧᩳ), (r4v6 l.֨ۧᩳ) binds: [B:41:0x012e, B:33:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x01be A[PHI: r1 r5 r6 r7
      0x01be: PHI (r1v5 short) = (r1v4 short), (r1v2 short) binds: [B:53:0x01bc, B:49:0x019c] A[DONT_GENERATE, DONT_INLINE]
      0x01be: PHI (r5v3 short) = (r5v2 short), (r5v1 short) binds: [B:53:0x01bc, B:49:0x019c] A[DONT_GENERATE, DONT_INLINE]
      0x01be: PHI (r6v2 int) = (r6v1 int), (r6v4 int) binds: [B:53:0x01bc, B:49:0x019c] A[DONT_GENERATE, DONT_INLINE]
      0x01be: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:53:0x01bc, B:49:0x019c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0210 A[PHI: r2 r3
      0x0210: PHI (r2v6 java.lang.String) = (r2v1 java.lang.String), (r2v1 java.lang.String), (r2v7 java.lang.String) binds: [B:61:0x020e, B:57:0x01f1, B:10:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0210: PHI (r3v5 short[]) = (r3v1 short[]), (r3v2 short[]), (r3v1 short[]) binds: [B:61:0x020e, B:57:0x01f1, B:10:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x029a  */
    /* JADX WARN: Code duplicated, block: B:82:0x02cc  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35857(C15155 c15155, Spinner spinner, EditText editText, EditText editText2) {
        int iM2566;
        int i;
        int i2;
        int iM2567;
        int i3;
        int selectedItemPosition = 0;
        String strM5726 = null;
        short[] sArr = null;
        short s = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1338083753;
        int i8 = C1047.f3863;
        int i9 = C3911.f12484;
        int iM6981 = C2105.m6981("ۖܽ") ^ i9;
        int i10 = ((iM6981 ^ i8) * (-16587)) ^ 442575293;
        int i11 = iM6981 ^ 1909635138;
        AbstractC1083 abstractC1083 = null;
        short s2 = 0;
        while (true) {
            i7 = ((((i7 ^ i8) * 28845) >> 31) & i10) ^ i11;
            switch (i7) {
                case -2096518181:
                case -880944951:
                    if (RunnableC0588.m2441() >= 0) {
                        iM2566 = (C0630.m2566("ܿ֨") + i8) * (-101);
                        i = ((iM2566 ^ i9) * (-29633)) ^ 2102962620;
                        i2 = 1179022296;
                    } else {
                        iM2566 = (C2105.m6981("ܳۗ") + i8) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM2566 ^ i9) * 23319) ^ 1862569539;
                        i2 = -1841369840;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -2052025436:
                case 1723356781:
                    strM5726 = C1711.m5726(f46310, 10, 3, i6);
                    if (!AbstractC2021.m6574()) {
                        iM2567 = (C0630.m2566("ᩳۧ") + i9) * (-81);
                        i10 = ((iM2567 ^ i8) * (-3889)) ^ 869588875;
                        i3 = 363986803;
                        i11 = iM2567 ^ i3;
                    } else {
                        iM2566 = C0630.m2566("۟ܿ") ^ i9;
                        i = ((iM2566 ^ i8) * 4421) ^ 1110768217;
                        i2 = -1562090102;
                        i11 = iM2566 ^ i2;
                        i10 = i;
                    }
                    break;
                case -2006772595:
                case -458577612:
                    C3663.m11161(C0630.m2566(strM5726) ^ 2119133463);
                    break;
                case -1899994966:
                case -984549037:
                    if (C1916.f6442) {
                        iM2566 = (i8 - C0630.m2566("۫ۙ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM2566 ^ i9) * 26557) ^ (-1630670598);
                        i2 = 797669821;
                    } else {
                        iM2566 = (i8 - C0630.m2566("᩺۠")) * 67;
                        i = ((iM2566 ^ i9) * (-11981)) ^ 2009022397;
                        i2 = -688295127;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -1851073553:
                case 1635176641:
                    C22628.m50615();
                    break;
                case -1758378640:
                case 543892250:
                    if (C1420.m4913()) {
                        iM2566 = (i8 - C0630.m2566("᩺۠")) * 67;
                        i = ((iM2566 ^ i9) * (-11981)) ^ 2009022397;
                        i2 = -688295127;
                    } else {
                        iM2566 = (C0630.m2566("ۨ᩷") + i9) * (-29);
                        i = ((iM2566 ^ i8) * 13277) ^ (-1760299453);
                        i2 = 1528874167;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -1716539121:
                case 1183441610:
                    ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                    C8101 c8101 = new C8101(c15155, executorServiceNewSingleThreadExecutor, abstractC1083, editText, editText2);
                    c8101.m20265(executorServiceNewSingleThreadExecutor);
                    C0964.m3402(c8101);
                    break;
                case -1675802390:
                case 1771248922:
                    if (RunnableC1937.m6384(editText) == 0) {
                        iM2566 = C0630.m2566("ܽ᩶") ^ i8;
                        i = ((iM2566 ^ i9) * 15025) ^ 1427642588;
                        i2 = 147352596;
                    } else {
                        iM2566 = C2105.m6981("ᩴܰ") ^ i9;
                        i = ((iM2566 ^ i8) * 32361) ^ 1104852629;
                        i2 = -1960147880;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -1547850152:
                case 1369309867:
                    if (C3432.f10845 >= 0) {
                        iM2566 = (i8 - C0630.m2566("᩺۠")) * 67;
                        i = ((iM2566 ^ i9) * (-11981)) ^ 2009022397;
                        i2 = -688295127;
                        i11 = iM2566 ^ i2;
                        i10 = i;
                    }
                    iM2566 = C0630.m2566("۟ܿ") ^ i9;
                    i = ((iM2566 ^ i8) * 4421) ^ 1110768217;
                    i2 = -1562090102;
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -1397974263:
                case -748045024:
                    if (C3432.f10845 < 0) {
                        iM2566 = C0630.m2566("۟ܿ") ^ i9;
                        i = ((iM2566 ^ i8) * 4421) ^ 1110768217;
                        i2 = -1562090102;
                        i11 = iM2566 ^ i2;
                        i10 = i;
                    } else {
                        iM2567 = (C0630.m2566("۬ܳ") ^ i9) * (-29);
                        i10 = ((iM2567 ^ i8) * (-32749)) ^ (-406212573);
                        i3 = 1233560281;
                        i11 = iM2567 ^ i3;
                    }
                    break;
                case -1347257962:
                case 1502370878:
                    sArr = f46310;
                    if (C3746.f11829 <= 0) {
                        iM2566 = C0630.m2566("۟ܿ") ^ i9;
                        i = ((iM2566 ^ i8) * 4421) ^ 1110768217;
                        i2 = -1562090102;
                    } else {
                        iM2566 = (C2105.m6981("ۚ֫") ^ i8) * (-49);
                        i = ((iM2566 ^ i9) * (-28073)) ^ (-1598831158);
                        i2 = -1266336791;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -1157144554:
                case -1044715493:
                    break;
                case -918009741:
                case 1858992923:
                    i6 = 45680;
                    iM2566 = (C0630.m2566("᩹᩹") ^ i9) * (-109);
                    i = ((iM2566 ^ i8) * 11835) ^ (-1317662647);
                    i2 = -945744982;
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -836889470:
                case -489731362:
                    if (C1420.f5096 <= 0) {
                        iM2566 = C0630.m2566("۟ܿ") ^ i9;
                        i = ((iM2566 ^ i8) * 4421) ^ 1110768217;
                        i2 = -1562090102;
                    } else {
                        iM2566 = (i9 - C2105.m6981("᩵ۛ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM2566 ^ i8) * 9159) ^ 2060720540;
                        i2 = -802863405;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -784245340:
                case 1841994097:
                    abstractC1083 = (AbstractC1083) C3019.m9263(c15155.f46313, selectedItemPosition);
                    if (abstractC1083.mo3741()) {
                        iM2566 = C0630.m2566("ۨܿ") ^ i8;
                        i = ((iM2566 ^ i9) * 20757) ^ (-267311294);
                        i2 = -873383180;
                    } else {
                        iM2566 = C0630.m2566("۠ܺ") ^ i9;
                        i = ((iM2566 ^ i8) * 18001) ^ (-828532981);
                        i2 = 660148820;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -621626519:
                case -28042262:
                    int i12 = s2 + s;
                    i4 = i12 * i12;
                    i5 = s2 * 2;
                    if (RunnableC3474.m10630()) {
                        iM2566 = C2105.m6981("ۖᩳ") ^ i9;
                        i = ((iM2566 ^ i8) * (-9571)) ^ (-817759171);
                        i2 = 1201160122;
                    } else {
                        iM2566 = (C2105.m6981("ۢۘ") ^ i9) * (-69);
                        i = ((iM2566 ^ i8) * 12597) ^ (-1562108757);
                        i2 = -1793878470;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -213855348:
                case 1790021596:
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = (C0630.m2566("ܿ֨") + i8) * (-101);
                        i = ((iM2566 ^ i9) * (-29633)) ^ 2102962620;
                        i2 = 1179022296;
                    } else {
                        iM2566 = (C0630.m2566("۟ۖ") ^ i8) * (-73);
                        i = ((iM2566 ^ i9) * (-2803)) ^ 1925015623;
                        i2 = 1246179596;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case 804049904:
                case 1599603169:
                    s2 = sArr[9];
                    s = 1;
                    if (RunnableC1108.f4040) {
                        iM2566 = (i9 - C0630.m2566("᩷ۖ")) * (-59);
                        i = ((iM2566 ^ i8) * (-3523)) ^ 2046263016;
                        i2 = 875625284;
                    } else {
                        iM2566 = (C2105.m6981("ۢۘ") ^ i9) * (-69);
                        i = ((iM2566 ^ i8) * 12597) ^ (-1562108757);
                        i2 = -1793878470;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case 1141350367:
                case 1523425962:
                    C0237.m1481();
                    if (!C2272.f7362) {
                        iM2567 = (C0630.m2566("۬ܳ") ^ i9) * (-29);
                        i10 = ((iM2567 ^ i8) * (-32749)) ^ (-406212573);
                        i3 = 1233560281;
                        i11 = iM2567 ^ i3;
                    } else {
                        iM2566 = (C0630.m2566("ܿ֨") + i8) * (-101);
                        i = ((iM2566 ^ i9) * (-29633)) ^ 2102962620;
                        i2 = 1179022296;
                        i11 = iM2566 ^ i2;
                        i10 = i;
                    }
                    break;
                case 1265526966:
                case 2054262625:
                    i6 = 62201;
                    iM2566 = (C0630.m2566("᩹᩹") ^ i9) * (-109);
                    i = ((iM2566 ^ i8) * 11835) ^ (-1317662647);
                    i2 = -945744982;
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case 1321687022:
                case 1976707013:
                    selectedItemPosition = spinner.getSelectedItemPosition();
                    if (selectedItemPosition == -1) {
                        iM2566 = C0630.m2566("۠ܺ") ^ i9;
                        i = ((iM2566 ^ i8) * 18001) ^ (-828532981);
                        i2 = 660148820;
                    } else {
                        iM2566 = C2105.m6981("ۚۖ") ^ i8;
                        i = ((iM2566 ^ i9) * (-4259)) ^ 1235401392;
                        i2 = 291870399;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case 1330172970:
                case 1578355286:
                    if (C0964.m3413()) {
                        iM2566 = C2105.m6981("ۛ᩷") ^ i9;
                        i = ((iM2566 ^ i8) * (-24141)) ^ (-178295600);
                        i2 = -1940764875;
                    } else {
                        iM2566 = (i8 - C0630.m2566("᩺۠")) * 67;
                        i = ((iM2566 ^ i9) * (-11981)) ^ 2009022397;
                        i2 = -688295127;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case 1762488606:
                case 2078583631:
                    C4159.m12565();
                    C4117.m12364();
                    iM2567 = (C0630.m2566("۬ܳ") ^ i9) * (-29);
                    i10 = ((iM2567 ^ i8) * (-32749)) ^ (-406212573);
                    i3 = 1233560281;
                    i11 = iM2567 ^ i3;
                    break;
                default:
                    if (i4 - (i5 + 1) < 0) {
                        iM2566 = C0630.m2566("ۤ֫") ^ i8;
                        i = ((iM2566 ^ i9) * 15407) ^ (-397027907);
                        i2 = 1144034909;
                    } else {
                        iM2566 = (i8 - C2105.m6981("᩶ۖ")) * q.h;
                        i = ((iM2566 ^ i9) * 11967) ^ 930178951;
                        i2 = 1500032275;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
            }
            return;
        }
    }
}
