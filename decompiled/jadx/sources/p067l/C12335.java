package p067l;

import android.content.pm.PackageInfo;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۤᩴ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C2R7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12335 {

    /* JADX INFO: renamed from: ۟֡֡, reason: not valid java name and contains not printable characters */
    private static final short[] f82132 = {8484, -18682, -18615, -18600, -18621, -18682, -18615, -18600, -18621, -18597, -18597};

    /* JADX INFO: renamed from: ֫ */
    public final C6970 f34418;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC17043 f34419;

    /* JADX INFO: renamed from: ܽ */
    public long f34420;

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC17043[] f34421;

    /* JADX WARN: Code duplicated, block: B:56:0x0193  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:66:0x020e  */
    /* JADX WARN: Code duplicated, block: B:70:0x023c A[PHI: r12
      0x023c: PHI (r12v3 long) = (r12v1 long), (r12v1 long), (r12v2 long), (r12v1 long), (r12v1 long) binds: [B:69:0x023a, B:47:0x0158, B:26:0x0097, B:15:0x0058, B:12:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x0277 A[PHI: r14 r20
      0x0277: PHI (r14v4 long) = (r14v1 long), (r14v2 long), (r14v1 long) binds: [B:59:0x01c3, B:22:0x0072, B:75:0x0275] A[DONT_GENERATE, DONT_INLINE]
      0x0277: PHI (r20v3 long) = (r20v1 long), (r20v1 long), (r20v5 long) binds: [B:59:0x01c3, B:22:0x0072, B:75:0x0275] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۧ */
    public final long m28408() {
        int iM55979;
        int i;
        int i2;
        AbstractC17043[] abstractC17043Arr = null;
        long j = 0;
        int length = 0;
        int i3 = 0;
        long j2 = 0;
        long jMo25101 = 0;
        long j3 = 0;
        int i4 = 1513650041;
        int i5 = ServiceConnectionC1013.f81940;
        int i6 = C1964.f83032;
        int iM55680 = (C0873.m55680("۫ܰ") + i5) * (-97);
        int i7 = ((iM55680 ^ i6) * 31751) ^ 1268056096;
        int i8 = iM55680 ^ (-1613594457);
        long jMo25102 = 0;
        long j4 = 0;
        while (true) {
            i4 = i8 ^ (i7 & (((i4 ^ i6) * 2111) >> 31));
            switch (i4) {
                case -2092346860:
                case 2129356247:
                    if (C1048.f81963) {
                        iM55979 = (C0873.m55680("ۖۢ") + i6) * 57;
                        i = ((iM55979 ^ i5) * (-27469)) ^ (-1464082201);
                        i2 = 1755085382;
                    } else {
                        iM55979 = C0946.m55979("֫ܽ") ^ i6;
                        i = ((iM55979 ^ i5) * (-27421)) ^ (-12814317);
                        i2 = -1145250164;
                    }
                    int i9 = i;
                    i8 = iM55979 ^ i2;
                    i7 = i9;
                    break;
                case -1997973582:
                case -362230791:
                    if (C1017.f81942 >= 0) {
                        iM55979 = (i5 - C0873.m55680("ۗܽ")) * (-93);
                        i = ((iM55979 ^ i6) * (-3603)) ^ 1912327386;
                        i2 = -1798300823;
                    } else {
                        iM55979 = (C0946.m55979("۟֫") ^ i6) * 109;
                        i = ((iM55979 ^ i5) * 16035) ^ 1678885544;
                        i2 = -1414062252;
                    }
                    int i10 = i;
                    i8 = iM55979 ^ i2;
                    i7 = i10;
                    break;
                case -1979122264:
                case -749883952:
                    if (C0894.m55769() >= 0) {
                        iM55979 = (C0873.m55680("ۖۢ") + i6) * 57;
                        i = ((iM55979 ^ i5) * (-27469)) ^ (-1464082201);
                        i2 = 1755085382;
                    } else {
                        iM55979 = (C0946.m55979("ܽۡ") ^ i6) * (-61);
                        i = ((iM55979 ^ i5) * 26019) ^ 624510204;
                        i2 = -1574886660;
                    }
                    int i11 = i;
                    i8 = iM55979 ^ i2;
                    i7 = i11;
                    break;
                case -1973429432:
                case -1437796995:
                    C0873.m55678();
                    return 0L;
                case -1906348387:
                case -1630040179:
                    if (C0992.m56107() <= 0) {
                        iM55979 = C0873.m55680("ۧۘ") ^ i5;
                        i = ((iM55979 ^ i6) * 14541) ^ 529754607;
                        i2 = 1722348265;
                    } else {
                        iM55979 = (C0873.m55680("ۖۢ") + i6) * 57;
                        i = ((iM55979 ^ i5) * (-27469)) ^ (-1464082201);
                        i2 = 1755085382;
                    }
                    int i12 = i;
                    i8 = iM55979 ^ i2;
                    i7 = i12;
                    break;
                case -1820710732:
                case -823542311:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = (C0873.m55680("ۖۢ") + i6) * 57;
                        i = ((iM55979 ^ i5) * (-27469)) ^ (-1464082201);
                        i2 = 1755085382;
                    } else {
                        iM55979 = C0873.m55680("۫ܶ") ^ i5;
                        i = ((iM55979 ^ i6) * 16963) ^ (-1924687774);
                        i2 = 1919564324;
                    }
                    int i13 = i;
                    i8 = iM55979 ^ i2;
                    i7 = i13;
                    break;
                case -1759427151:
                case -801108685:
                    ViewOnClickListenerC0939.m55941();
                    C1929.m56553();
                    iM55979 = C0873.m55680("ۧۘ") ^ i5;
                    i = ((iM55979 ^ i6) * 14541) ^ 529754607;
                    i2 = 1722348265;
                    int i14 = i;
                    i8 = iM55979 ^ i2;
                    i7 = i14;
                    break;
                case -1686638159:
                case 2091817460:
                    if (C1003.f81929 <= 0) {
                        iM55979 = (C0946.m55979("ᩳۛ") + i6) * (-93);
                        i = ((iM55979 ^ i5) * (-24205)) ^ 1725591268;
                        i2 = -1854789748;
                    } else {
                        iM55979 = (i5 - C0946.m55979("᩺᩵")) * 5;
                        i = ((iM55979 ^ i6) * 1005) ^ 498517993;
                        i2 = 674130107;
                    }
                    int i15 = i;
                    i8 = iM55979 ^ i2;
                    i7 = i15;
                    break;
                case -1633873153:
                case 401080885:
                    if (j4 != -1) {
                        iM55979 = (i6 - C0873.m55680("ܳ᩶")) * (-117);
                        i = ((iM55979 ^ i5) * (-5689)) ^ (-531766807);
                        i2 = 818030897;
                    } else {
                        iM55979 = (i5 - C0946.m55979("ܽۗ")) * (-127);
                        i = ((iM55979 ^ i6) * 2533) ^ 1808999291;
                        i2 = -1096492602;
                    }
                    int i16 = i;
                    i8 = iM55979 ^ i2;
                    i7 = i16;
                    break;
                case -1593681914:
                case 1504957175:
                    if (C0992.m56107() <= 0) {
                        iM55979 = C0873.m55680("ۧۘ") ^ i5;
                        i = ((iM55979 ^ i6) * 14541) ^ 529754607;
                        i2 = 1722348265;
                    } else {
                        iM55979 = (i6 - C0946.m55979("۫۟")) * 51;
                        i = ((iM55979 ^ i5) * 14047) ^ 1753432638;
                        i2 = 1927805604;
                    }
                    int i17 = i;
                    i8 = iM55979 ^ i2;
                    i7 = i17;
                    break;
                case -1479472072:
                case -953632024:
                    if (i3 < length) {
                        iM55979 = C0946.m55979("ۘ۠") ^ i6;
                        i = ((iM55979 ^ i5) * 23683) ^ 96674894;
                        i2 = -1964788246;
                    } else {
                        j = j2;
                        iM55979 = (i5 - C0873.m55680("ۡۡ")) * 27;
                        i = ((iM55979 ^ i6) * 6435) ^ 174415766;
                        i2 = 1465581496;
                    }
                    int i18 = i;
                    i8 = iM55979 ^ i2;
                    i7 = i18;
                    break;
                case -1454025528:
                case 1568611655:
                    this.f34420 = j;
                    return j;
                case -1435859540:
                case -107020588:
                    long j5 = this.f34420;
                    if (C1017.f81942 >= 0) {
                        j4 = j5;
                        iM55979 = (C0946.m55979("ᩳۛ") + i6) * (-93);
                        i = ((iM55979 ^ i5) * (-24205)) ^ 1725591268;
                        i2 = -1854789748;
                        int i19 = i;
                        i8 = iM55979 ^ i2;
                        i7 = i19;
                    } else {
                        int iM559710 = C0946.m55979("᩹᩻") ^ i5;
                        j4 = j5;
                        i8 = iM559710 ^ 1727809530;
                        i7 = ((iM559710 ^ i6) * 24071) ^ (-5605713);
                    }
                    break;
                case -1090492415:
                case -383043810:
                    jMo25101 = abstractC17043Arr[i3].mo25101();
                    if (C0877.m55696()) {
                        iM55979 = C0946.m55979("֨᩺") ^ i6;
                        i = ((iM55979 ^ i5) * (-9085)) ^ (-170638725);
                        i2 = 976808700;
                    } else {
                        iM55979 = (C0873.m55680("ۖۢ") + i6) * 57;
                        i = ((iM55979 ^ i5) * (-27469)) ^ (-1464082201);
                        i2 = 1755085382;
                    }
                    int i110 = i;
                    i8 = iM55979 ^ i2;
                    i7 = i110;
                    break;
                case -953692939:
                case 266020301:
                    j3 = j2 + jMo25101;
                    if (C1017.f81942 >= 0) {
                        iM55979 = (C0946.m55979("ᩳۛ") + i6) * (-93);
                        i = ((iM55979 ^ i5) * (-24205)) ^ 1725591268;
                        i2 = -1854789748;
                    } else {
                        iM55979 = (C0946.m55979("ۢ۫") + i5) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM55979 ^ i6) * (-32261)) ^ 1450063739;
                        i2 = 1511635069;
                    }
                    int i111 = i;
                    i8 = iM55979 ^ i2;
                    i7 = i111;
                    break;
                case -808768784:
                case -492540670:
                    jMo25102 = this.f34419.mo25101();
                    abstractC17043Arr = this.f34421;
                    if (abstractC17043Arr != null) {
                        iM55979 = (C0873.m55680("ۜ֡") ^ i6) * 59;
                        i = ((iM55979 ^ i5) * (-4473)) ^ (-1243039071);
                        i2 = 1231765032;
                    } else {
                        j = jMo25102;
                        iM55979 = (i5 - C0873.m55680("ۡۡ")) * 27;
                        i = ((iM55979 ^ i6) * 6435) ^ 174415766;
                        i2 = 1465581496;
                    }
                    int i112 = i;
                    i8 = iM55979 ^ i2;
                    i7 = i112;
                    break;
                case -705494635:
                case 585688170:
                    length = abstractC17043Arr.length;
                    j2 = jMo25102;
                    i3 = 0;
                    iM55979 = C0873.m55680("ۤ᩻") ^ i5;
                    i = ((iM55979 ^ i6) * (-23083)) ^ (-526469628);
                    i2 = 1260783967;
                    int i113 = i;
                    i8 = iM55979 ^ i2;
                    i7 = i113;
                    break;
                case -436512950:
                case -277514515:
                    i3++;
                    j2 = j3;
                    iM55979 = C0873.m55680("ۤ᩻") ^ i5;
                    i = ((iM55979 ^ i6) * (-23083)) ^ (-526469628);
                    i2 = 1260783967;
                    int i114 = i;
                    i8 = iM55979 ^ i2;
                    i7 = i114;
                    break;
                case -367697757:
                case 238752418:
                    if (C0892.m55749()) {
                        iM55979 = (C0873.m55680("ܽ᩶") + i5) * 115;
                        i = ((iM55979 ^ i6) * (-2913)) ^ (-1425642851);
                        i2 = -391904902;
                    } else {
                        iM55979 = C0873.m55680("ۧۘ") ^ i5;
                        i = ((iM55979 ^ i6) * 14541) ^ 529754607;
                        i2 = 1722348265;
                    }
                    int i115 = i;
                    i8 = iM55979 ^ i2;
                    i7 = i115;
                    break;
                case -291358550:
                case -98040979:
                    RunnableC0871.m55672();
                    if (C0892.f81851) {
                        iM55979 = C0873.m55680("ۧۘ") ^ i5;
                        i = ((iM55979 ^ i6) * 14541) ^ 529754607;
                        i2 = 1722348265;
                    } else {
                        iM55979 = (i5 - C0873.m55680("ۗܽ")) * (-93);
                        i = ((iM55979 ^ i6) * (-3603)) ^ 1912327386;
                        i2 = -1798300823;
                    }
                    int i116 = i;
                    i8 = iM55979 ^ i2;
                    i7 = i116;
                    break;
                case 266333640:
                case 1869469937:
                    return j4;
                default:
                    if (C0955.m56025()) {
                        iM55979 = C0946.m55979("֫ܽ") ^ i6;
                        i = ((iM55979 ^ i5) * (-27421)) ^ (-12814317);
                        i2 = -1145250164;
                    } else {
                        iM55979 = C0946.m55979("۠֨") ^ i6;
                        i = ((iM55979 ^ i5) * 21775) ^ (-1916284588);
                        i2 = -537478008;
                    }
                    int i117 = i;
                    i8 = iM55979 ^ i2;
                    i7 = i117;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x015f A[PHI: r4
      0x015f: PHI (r4v4 java.lang.String) = (r4v3 java.lang.String), (r4v2 java.lang.String) binds: [B:40:0x015d, B:11:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x01b2 A[PHI: r3
      0x01b2: PHI (r3v4 java.lang.String) = (r3v3 java.lang.String), (r3v2 java.lang.String), (r3v2 java.lang.String) binds: [B:48:0x01b0, B:14:0x0072, B:11:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02a6 A[PHI: r2 r8 r15 r18 r24
      0x02a6: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v3 java.lang.String), (r2v2 java.lang.String) binds: [B:71:0x02a4, B:52:0x01e8, B:44:0x0190] A[DONT_GENERATE, DONT_INLINE]
      0x02a6: PHI (r8v3 int) = (r8v2 int), (r8v2 int), (r8v4 int) binds: [B:71:0x02a4, B:52:0x01e8, B:44:0x0190] A[DONT_GENERATE, DONT_INLINE]
      0x02a6: PHI (r15v3 short[]) = (r15v2 short[]), (r15v2 short[]), (r15v4 short[]) binds: [B:71:0x02a4, B:52:0x01e8, B:44:0x0190] A[DONT_GENERATE, DONT_INLINE]
      0x02a6: PHI (r18v4 int) = (r18v3 int), (r18v2 int), (r18v2 int) binds: [B:71:0x02a4, B:52:0x01e8, B:44:0x0190] A[DONT_GENERATE, DONT_INLINE]
      0x02a6: PHI (r24v5 short) = (r24v4 short), (r24v3 short), (r24v3 short) binds: [B:71:0x02a4, B:52:0x01e8, B:44:0x0190] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02d9 A[PHI: r9 r11 r12 r17
      0x02d9: PHI (r9v5 short[]) = (r9v2 short[]), (r9v3 short[]), (r9v2 short[]) binds: [B:75:0x02d7, B:23:0x009c, B:8:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x02d9: PHI (r11v5 int) = (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:75:0x02d7, B:23:0x009c, B:8:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x02d9: PHI (r12v5 int) = (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:75:0x02d7, B:23:0x009c, B:8:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x02d9: PHI (r17v5 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:75:0x02d7, B:23:0x009c, B:8:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x030b A[PHI: r13 r16 r19
      0x030b: PHI (r13v4 short) = (r13v2 short), (r13v2 short), (r13v3 short), (r13v2 short), (r13v2 short), (r13v2 short) binds: [B:79:0x0309, B:67:0x0280, B:63:0x025b, B:16:0x0076, B:14:0x0072, B:8:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x030b: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:79:0x0309, B:67:0x0280, B:63:0x025b, B:16:0x0076, B:14:0x0072, B:8:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x030b: PHI (r19v4 int) = (r19v2 int), (r19v3 int), (r19v2 int), (r19v2 int), (r19v2 int), (r19v2 int) binds: [B:79:0x0309, B:67:0x0280, B:63:0x025b, B:16:0x0076, B:14:0x0072, B:8:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17043 m28406() {
        int iM55680;
        int i;
        int i2;
        String strM56096;
        int i3 = RunnableC0938.f81886;
        int i4 = C1046.f81962;
        int iM55681 = C0873.m55680("۠ۤ") ^ i3;
        int i5 = ((iM55681 ^ i4) * 10617) ^ 1746842548;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM55681 ^ 333128339;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short s = 0;
        int i10 = 0;
        char c = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -1684131025;
        short s2 = 0;
        short[] sArr3 = null;
        String str = null;
        String strM55707 = null;
        AbstractC17043[] abstractC17043Arr = null;
        String strM56233 = null;
        String strM55929 = null;
        String strM8804 = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * 14937) >> 31));
            switch (i13) {
                case -2110250563:
                case 530518216:
                    sArr3 = f82132;
                    if (C1028.f81950 <= 0) {
                        iM55680 = (C0873.m55680("᩸᩸") + i3) * (-113);
                        i = ((iM55680 ^ i4) * 30067) ^ 72560004;
                        i2 = 90811992;
                    } else {
                        iM55680 = C0873.m55680("ܺۤ") ^ i4;
                        i = ((iM55680 ^ i3) * (-11267)) ^ 905631845;
                        i2 = -304634767;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -2071535825:
                case -1407424283:
                    strM56096 = C0989.m56096(strM8804, C1124.m56373(sArr2, i8, i9, i10));
                    str = strM56096;
                    iM55680 = (C0946.m55979("᩻۠") ^ i4) * (-61);
                    i = ((iM55680 ^ i3) * (-7677)) ^ 372874295;
                    i2 = 1664451768;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1861256461:
                case -473426255:
                    if (C0845.f81821 >= 0) {
                        iM55680 = (C0873.m55680("᩸᩸") + i3) * (-113);
                        i = ((iM55680 ^ i4) * 30067) ^ 72560004;
                        i2 = 90811992;
                    } else {
                        iM55680 = (C0946.m55979("֫۬") + i3) * (-51);
                        i = ((iM55680 ^ i4) * 23961) ^ 1745242890;
                        i2 = -1783365298;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1704353809:
                case 658736057:
                    strM56096 = C0989.m56096(strM8804, strM55707);
                    str = strM56096;
                    iM55680 = (C0946.m55979("᩻۠") ^ i4) * (-61);
                    i = ((iM55680 ^ i3) * (-7677)) ^ 372874295;
                    i2 = 1664451768;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1474639023:
                case -1127308769:
                    i10 = 46888;
                    iM55680 = C0873.m55680("֡᩸") ^ i4;
                    i = ((iM55680 ^ i3) * (-11947)) ^ 1455877941;
                    i2 = 964243733;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1421810273:
                case 668624429:
                    if (abstractC17043Arr == null) {
                        str = strM8804;
                        iM55680 = (C0946.m55979("᩻۠") ^ i4) * (-61);
                        i = ((iM55680 ^ i3) * (-7677)) ^ 372874295;
                        i2 = 1664451768;
                    } else {
                        iM55680 = C0873.m55680("ۨܽ") ^ i3;
                        i = ((iM55680 ^ i4) * 30121) ^ (-1205042624);
                        i2 = -65212215;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1248959709:
                case 2059545025:
                    C1012.m56134();
                    iM55680 = (C0873.m55680("᩸᩸") + i3) * (-113);
                    i = ((iM55680 ^ i4) * 30067) ^ 72560004;
                    i2 = 90811992;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1185999118:
                case -469385492:
                    i10 = 21008;
                    iM55680 = C0873.m55680("֡᩸") ^ i4;
                    i = ((iM55680 ^ i3) * (-11947)) ^ 1455877941;
                    i2 = 964243733;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1155606468:
                case -661757550:
                    c = 0;
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55680 = (C0873.m55680("᩺᩵") ^ i4) * (-97);
                        i = ((iM55680 ^ i3) * 14811) ^ 304813672;
                        i2 = -55825873;
                    } else {
                        iM55680 = C0873.m55680("ܰۡ") ^ i3;
                        i = ((iM55680 ^ i4) * 11471) ^ (-1485969424);
                        i2 = -1778106335;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -999732537:
                case -409977135:
                    if (abstractC17043Arr == null) {
                        strM55707 = strM56233;
                        iM55680 = C0946.m55979("ۡ᩸") ^ i4;
                        i = ((iM55680 ^ i3) * 28347) ^ 1818581000;
                        i2 = -861869313;
                    } else {
                        iM55680 = C0873.m55680("ۘۛ") ^ i4;
                        i = ((iM55680 ^ i3) * 10315) ^ (-1161196307);
                        i2 = 663503015;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -954559820:
                case 1038077685:
                    s = 13922;
                    if (C1124.m56367() >= 0) {
                        iM55680 = (C0873.m55680("᩸᩸") + i3) * (-113);
                        i = ((iM55680 ^ i4) * 30067) ^ 72560004;
                        i2 = 90811992;
                    } else {
                        iM55680 = (C0873.m55680("ۡ֨") ^ i4) * (-85);
                        i = ((iM55680 ^ i3) * (-21559)) ^ (-1099957141);
                        i2 = 219808499;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -919056865:
                case 1666443684:
                    strM55929 = RunnableC0938.m55929(strM8804);
                    if (C0894.f81854 >= 0) {
                        iM55680 = (C0946.m55979("֫۬") + i3) * (-51);
                        i = ((iM55680 ^ i4) * 23961) ^ 1745242890;
                        i2 = -1783365298;
                    } else {
                        iM55680 = C0946.m55979("ۧ۠") ^ i4;
                        i = ((iM55680 ^ i3) * 20927) ^ 31108307;
                        i2 = 1714248912;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -909234572:
                case 1900347651:
                    strM55707 = C0877.m55707(f82132, 5, 5, i10);
                    iM55680 = C0946.m55979("ۡ᩸") ^ i4;
                    i = ((iM55680 ^ i3) * 28347) ^ 1818581000;
                    i2 = -861869313;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -559171870:
                case 574072883:
                    if (i12 - (s2 * s) < 0) {
                        iM55680 = C0946.m55979("ۗۚ") ^ i3;
                        i = ((iM55680 ^ i4) * 28163) ^ (-78935468);
                        i2 = 1978055461;
                    } else {
                        iM55680 = C0873.m55680("ܰۗ") ^ i3;
                        i = ((iM55680 ^ i4) * (-14829)) ^ 187971152;
                        i2 = 757962898;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -511105589:
                case 1093684633:
                    if (C1053.f81965 > 0) {
                        iM55680 = (C0946.m55979("֫۬") + i3) * (-51);
                        i = ((iM55680 ^ i4) * 23961) ^ 1745242890;
                        i2 = -1783365298;
                    } else {
                        iM55680 = C0873.m55680("ۨ᩺") ^ i4;
                        i = ((iM55680 ^ i3) * (-7933)) ^ 1532375583;
                        i2 = -1258193788;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -7635506:
                case 132610746:
                    s2 = sArr3[c];
                    i11 = s2 * s2;
                    if (C1048.m56305() >= 0) {
                        iM55680 = (C0873.m55680("۬ᩴ") + i3) * 71;
                        i = ((iM55680 ^ i4) * (-10163)) ^ 855162787;
                        i2 = 1431076955;
                    } else {
                        iM55680 = C0946.m55979("ۙ᩵") ^ i4;
                        i = ((iM55680 ^ i3) * (-22325)) ^ 586581801;
                        i2 = 1036601863;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 49407289:
                case 1423323102:
                    boolean zM56248 = C1028.m56248(strM55929, strM56233);
                    abstractC17043Arr = this.f34421;
                    if (zM56248) {
                        iM55680 = C0946.m55979("᩻ۛ") ^ i4;
                        i = ((iM55680 ^ i3) * 157) ^ (-1461127541);
                        i2 = -41270024;
                    } else {
                        iM55680 = C0946.m55979("ۛۤ") ^ i3;
                        i = ((iM55680 ^ i4) * (-13289)) ^ 527729258;
                        i2 = 1435127428;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 168451822:
                case 1795178012:
                    i12 = i11 + 48455521;
                    if (C0955.m56025()) {
                        iM55680 = (C0873.m55680("᩸᩸") + i3) * (-113);
                        i = ((iM55680 ^ i4) * 30067) ^ 72560004;
                        i2 = 90811992;
                    } else {
                        iM55680 = (i3 - C0873.m55680("֫ۚ")) * 45;
                        i = ((iM55680 ^ i4) * 19281) ^ (-1154212519);
                        i2 = 1676980619;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 578113489:
                case 820255406:
                    sArr = f82132;
                    i7 = 1;
                    if (C0946.f81894 != 0) {
                        iM55680 = (C0873.m55680("۬ᩴ") + i3) * 71;
                        i = ((iM55680 ^ i4) * (-10163)) ^ 855162787;
                        i2 = 1431076955;
                    } else {
                        iM55680 = C0873.m55680("ܽܺ") ^ i4;
                        i = ((iM55680 ^ i3) * (-15147)) ^ (-1577465361);
                        i2 = 2139374651;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 590953861:
                case 1672312131:
                    C0946.m55980();
                    if (C1229.f82066 >= 0) {
                        iM55680 = (C0873.m55680("᩸᩸") + i3) * (-113);
                        i = ((iM55680 ^ i4) * 30067) ^ 72560004;
                        i2 = 90811992;
                    } else {
                        iM55680 = (C0873.m55680("᩺᩵") ^ i4) * (-97);
                        i = ((iM55680 ^ i3) * 14811) ^ 304813672;
                        i2 = -55825873;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 657124974:
                case 1845490358:
                    sArr2 = f82132;
                    i8 = 10;
                    i9 = 1;
                    if (C1036.m56257() <= 0) {
                        iM55680 = (C0873.m55680("᩺᩵") ^ i4) * (-97);
                        i = ((iM55680 ^ i3) * 14811) ^ 304813672;
                        i2 = -55825873;
                    } else {
                        iM55680 = (C0873.m55680("ۢᩴ") + i3) * 97;
                        i = ((iM55680 ^ i4) * (-15137)) ^ 75441167;
                        i2 = -1019956653;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 692926721:
                case 818538430:
                    strM56233 = C1025.m56233(sArr, i7, 4, i10);
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = C0873.m55680("ۨ᩺") ^ i4;
                        i = ((iM55680 ^ i3) * (-7933)) ^ 1532375583;
                        i2 = -1258193788;
                    } else {
                        iM55680 = C0873.m55680("ۢ֨") ^ i3;
                        i = ((iM55680 ^ i4) * (-30445)) ^ (-1370427978);
                        i2 = -986371086;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 847384350:
                case 2075068045:
                    return C1024.m56217(ViewOnClickListenerC4308.m8793(), str);
                case 1750147058:
                case 1873830725:
                    strM8804 = ViewOnClickListenerC4308.m8804(this.f34418);
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = (C0873.m55680("۬ᩴ") + i3) * 71;
                        i = ((iM55680 ^ i4) * (-10163)) ^ 855162787;
                        i2 = 1431076955;
                    } else {
                        iM55680 = C0873.m55680("ۚܿ") ^ i3;
                        i = ((iM55680 ^ i4) * 20941) ^ 1396763059;
                        i2 = 1490766480;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                default:
                    C0992.m56107();
                    return null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:117:0x041a  */
    /* JADX WARN: Code duplicated, block: B:125:0x0464  */
    /* JADX WARN: Code duplicated, block: B:129:0x0494  */
    /* JADX WARN: Code duplicated, block: B:135:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:21:0x0084  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:56:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:85:0x02d5  */
    /* JADX INFO: renamed from: ֫ */
    public final void m28407(AbstractC17043 abstractC17043, InterfaceC3693 interfaceC3693) throws Throwable {
        int iM55979;
        int i;
        int i2;
        int i3 = C1028.f81950;
        int i4 = AbstractC0942.f81890;
        int iM559710 = C0946.m55979("۬ۤ") ^ i4;
        int i5 = ((iM559710 ^ i3) * (-18357)) ^ (-1093469349);
        Throwable th = null;
        Object obj = null;
        AbstractC17043 abstractC17044 = null;
        int i6 = iM559710 ^ (-1845073169);
        C10844 c10844 = null;
        int length = 0;
        int i7 = 0;
        boolean zM56007 = false;
        int i8 = -1078616504;
        AbstractC17043[] abstractC17043Arr = null;
        Throwable th2 = null;
        AbstractC17043 abstractC17045 = null;
        int i9 = 0;
        while (true) {
            i8 = i6 ^ (i5 & (((i8 ^ i3) * 5139) >> 31));
            switch (i8) {
                case -2096122037:
                case 498150084:
                    if (C1028.f81950 > 0) {
                        iM55979 = (i4 - C0873.m55680("ܰᩴ")) * 27;
                        i = ((iM55979 ^ i3) * 983) ^ (-1525174630);
                        i2 = 817059482;
                    } else {
                        iM55979 = C0873.m55680("ᩴ᩶") ^ i4;
                        i = ((iM55979 ^ i3) * 7501) ^ 1803743860;
                        i2 = 29343943;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -2092912134:
                case -1991207738:
                    abstractC17043.mo20486(ViewOnClickListenerC0939.m55944());
                    return;
                case -1847667753:
                case 1007807406:
                    if (C0930.f81879 <= 0) {
                        iM55979 = C0873.m55680("᩻ᩳ") ^ i4;
                        i = ((iM55979 ^ i3) * (-16557)) ^ (-1660034643);
                        i2 = 1547427424;
                    } else {
                        iM55979 = C0946.m55979("֨֨") ^ i3;
                        i = ((iM55979 ^ i4) * (-18237)) ^ 1744047111;
                        i2 = 1267449281;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1799753146:
                case 489790035:
                    C0877.m55706(th2, obj);
                    iM55979 = C0946.m55979("ۢܿ") ^ i4;
                    i = ((iM55979 ^ i3) * 28825) ^ 1725086666;
                    i2 = -900132846;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1698167510:
                case 1330827361:
                    if (C0946.f81894 != 0) {
                        iM55979 = C0873.m55680("ᩴ᩶") ^ i4;
                        i = ((iM55979 ^ i3) * 7501) ^ 1803743860;
                        i2 = 29343943;
                    } else {
                        iM55979 = (C0873.m55680("۠۠") ^ i4) * 67;
                        i = ((iM55979 ^ i3) * (-31321)) ^ (-697196676);
                        i2 = -786018145;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1661779188:
                case -1423412795:
                    throw th2;
                case -1484807522:
                case 1598841069:
                    if (C1012.f81938 >= 0) {
                        iM55979 = (C0946.m55979("۬ᩳ") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM55979 ^ i4) * 27373) ^ 173659445;
                        i2 = 907848185;
                    } else {
                        iM55979 = (i4 - C0873.m55680("ܰᩴ")) * 27;
                        i = ((iM55979 ^ i3) * 983) ^ (-1525174630);
                        i2 = 817059482;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1451058015:
                case 1178276892:
                    return;
                case -1423101955:
                case 853313220:
                    if (C0955.f81898) {
                        iM55979 = (C0873.m55680("ܳ᩵") ^ i3) * (-105);
                        i = ((iM55979 ^ i4) * 26519) ^ 373514142;
                        i2 = -1589722872;
                    } else {
                        iM55979 = C0946.m55979("֫᩹") ^ i3;
                        i = ((iM55979 ^ i4) * 13945) ^ (-1508719716);
                        i2 = -1723692799;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1324532401:
                case 1847666311:
                    abstractC17044 = abstractC17043Arr[i7];
                    zM56007 = C0949.m56007(interfaceC3693);
                    iM55979 = C0873.m55680("ܰܳ") ^ i4;
                    i = ((iM55979 ^ i3) * (-3079)) ^ (-1800864609);
                    i2 = -1512083283;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1233415924:
                case 177348283:
                    if (C0845.f81821 >= 0) {
                        iM55979 = (C0873.m55680("ܳ᩵") ^ i3) * (-105);
                        i = ((iM55979 ^ i4) * 26519) ^ 373514142;
                        i2 = -1589722872;
                    } else {
                        iM55979 = C0873.m55680("ۖۜ") ^ i4;
                        i = ((iM55979 ^ i3) * (-539)) ^ (-96110070);
                        i2 = 650643242;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1175391256:
                case -338396949:
                    try {
                        RunnableC1014.m56176(c10844);
                        iM55979 = C0946.m55979("᩵۟") ^ i4;
                        i = ((iM55979 ^ i3) * 2203) ^ 614452708;
                        i2 = 1119098734;
                    } catch (Throwable th3) {
                        th = th3;
                        iM55979 = (C0873.m55680("ᩴᩳ") ^ i3) * 31;
                        i = ((iM55979 ^ i4) * 15079) ^ 614790598;
                        i2 = -886091547;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1085694909:
                case 913019366:
                    if (C0877.m55698(interfaceC3693)) {
                        iM55979 = C0946.m55979("ۧۜ") ^ i3;
                        i = ((iM55979 ^ i4) * (-27555)) ^ 477841767;
                        i2 = 640124014;
                    } else {
                        iM55979 = C0873.m55680("۬ܰ") ^ i4;
                        i = ((iM55979 ^ i3) * 27795) ^ 665100640;
                        i2 = 1132701011;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -922638663:
                case 1904773353:
                    C1404.m56468();
                    if (C1229.f82066 >= 0) {
                        iM55979 = (C0946.m55979("ۖ֡") + i4) * 73;
                        i = ((iM55979 ^ i3) * 9205) ^ (-1253692584);
                        i2 = -1420698054;
                    } else {
                        iM55979 = C0873.m55680("ܽ֫") ^ i3;
                        i = ((iM55979 ^ i4) * (-2937)) ^ (-428911092);
                        i2 = -2102443360;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -693757891:
                case 1767948645:
                    if (C7050.m16218()) {
                        iM55979 = C0873.m55680("۫ۡ") ^ i3;
                        i = ((iM55979 ^ i4) * (-4921)) ^ (-1585594772);
                        i2 = -276233867;
                    } else {
                        iM55979 = C0946.m55979("ۘ֫") ^ i4;
                        i = ((iM55979 ^ i3) * 9499) ^ 1345187498;
                        i2 = -14103823;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -671450560:
                case 1447852007:
                    abstractC17045.m38658(abstractC17043, (C19056) null, interfaceC3693);
                    if (C0949.m56007(interfaceC3693)) {
                        iM55979 = (C0946.m55979("۟۬") + i4) * 109;
                        i = ((iM55979 ^ i3) * 25789) ^ 716808827;
                        i2 = -976375591;
                    } else {
                        iM55979 = (C0946.m55979("᩸ۛ") ^ i3) * 51;
                        i = ((iM55979 ^ i4) * (-9737)) ^ (-750643937);
                        i2 = 350601943;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -664055285:
                case 998241279:
                    abstractC17043.mo29990();
                    iM55979 = C0946.m55979("ۘ֫") ^ i4;
                    i = ((iM55979 ^ i3) * 9499) ^ 1345187498;
                    i2 = -14103823;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -650503021:
                case 1604142509:
                    if (C1044.f81959 >= 0) {
                        iM55979 = C0873.m55680("᩻ᩳ") ^ i4;
                        i = ((iM55979 ^ i3) * (-16557)) ^ (-1660034643);
                        i2 = 1547427424;
                    } else {
                        iM55979 = C0946.m55979("֡᩻") ^ i4;
                        i = ((iM55979 ^ i3) * 29489) ^ 1711707573;
                        i2 = 727822563;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -532017377:
                case 933548907:
                    C1036.m56257();
                    return;
                case -461968309:
                case 624691103:
                    C1025.m56230();
                    if (C1036.f81953 < 0) {
                        iM55979 = (i4 - C0873.m55680("ܰᩴ")) * 27;
                        i = ((iM55979 ^ i3) * 983) ^ (-1525174630);
                        i2 = 817059482;
                    } else {
                        iM55979 = (C0946.m55979("ۖ֡") + i4) * 73;
                        i = ((iM55979 ^ i3) * 9205) ^ (-1253692584);
                        i2 = -1420698054;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -322020505:
                case 337486823:
                    if (C0877.m55698(interfaceC3693)) {
                        iM55979 = (i3 - C0873.m55680("᩺ܿ")) * (-111);
                        i = ((iM55979 ^ i4) * (-4759)) ^ 1955929455;
                        i2 = 1380948255;
                    } else {
                        iM55979 = C0946.m55979("ۘ֫") ^ i4;
                        i = ((iM55979 ^ i3) * 9499) ^ 1345187498;
                        i2 = -14103823;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -310445736:
                case 356719204:
                    try {
                        c10844 = new C10844(abstractC17043);
                        iM55979 = (i4 - C0873.m55680("᩶᩸")) * 35;
                        i = ((iM55979 ^ i3) * 10053) ^ (-986730753);
                        i2 = -263911025;
                    } catch (Throwable th4) {
                        th = th4;
                        c10844 = null;
                        iM55979 = (C0873.m55680("ᩴᩳ") ^ i3) * 31;
                        i = ((iM55979 ^ i4) * 15079) ^ 614790598;
                        i2 = -886091547;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -305892621:
                case 2110519194:
                    if (C0946.f81894 != 0) {
                        iM55979 = (C0873.m55680("ܳ᩵") ^ i3) * (-105);
                        i = ((iM55979 ^ i4) * 26519) ^ 373514142;
                        i2 = -1589722872;
                    } else {
                        iM55979 = C0873.m55680("᩷ۖ") ^ i3;
                        i = ((iM55979 ^ i4) * 5141) ^ 1426722420;
                        i2 = -839427033;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -210429651:
                case 546619279:
                    if (zM56007) {
                        iM55979 = (i3 - C0946.m55979("֡ۘ")) * (-35);
                        i = ((iM55979 ^ i4) * (-27255)) ^ 1247873854;
                        i2 = 465021821;
                    } else {
                        iM55979 = (C0873.m55680("ۧܳ") + i3) * 55;
                        i = ((iM55979 ^ i4) * (-4167)) ^ (-1674994505);
                        i2 = 16179794;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -207121457:
                case 1405200917:
                    if (i7 < length) {
                        iM55979 = (C0946.m55979("֨ܽ") ^ i4) * (-55);
                        i = ((iM55979 ^ i3) * 11583) ^ 1805959381;
                        i2 = 256678593;
                    } else {
                        iM55979 = (i3 - C0946.m55979("֡ۘ")) * (-35);
                        i = ((iM55979 ^ i4) * (-27255)) ^ 1247873854;
                        i2 = 465021821;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -40237015:
                case 1890760458:
                    c10844.m24983(i9);
                    C0863.m55641(c10844, C0892.m55744(abstractC17045));
                    abstractC17045.m38653(c10844.m24981(), interfaceC3693);
                    length = abstractC17043Arr.length;
                    iM55979 = C0873.m55680("᩺ۙ") ^ i4;
                    i = ((iM55979 ^ i3) * 26761) ^ (-2100816693);
                    i2 = 991206962;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -26677387:
                case 1252251914:
                    if (C1012.f81938 >= 0) {
                        iM55979 = (C0873.m55680("ۜ֡") ^ i3) * (-91);
                        i = ((iM55979 ^ i4) * (-17135)) ^ 453471648;
                        i2 = 803504589;
                    } else {
                        iM55979 = C0946.m55979("ܶ᩷") ^ i3;
                        i = ((iM55979 ^ i4) * 949) ^ 496355309;
                        i2 = -1075597705;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -6616118:
                case 1923596126:
                    if (C0861.f81831) {
                        iM55979 = C0873.m55680("ۛ᩺") ^ i4;
                        i = ((iM55979 ^ i3) * (-22469)) ^ (-1591066975);
                        i2 = 1471963113;
                    } else {
                        iM55979 = C0873.m55680("ۖۜ") ^ i4;
                        i = ((iM55979 ^ i3) * (-539)) ^ (-96110070);
                        i2 = 650643242;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 18235029:
                case 872545911:
                    if (C1071.f81975 <= 0) {
                        iM55979 = C0873.m55680("᩻ᩳ") ^ i4;
                        i = ((iM55979 ^ i3) * (-16557)) ^ (-1660034643);
                        i2 = 1547427424;
                    } else {
                        iM55979 = (C0946.m55979("ۜ֫") + i3) * (-113);
                        i = ((iM55979 ^ i4) * (-1939)) ^ (-1844241240);
                        i2 = -689658259;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 70948109:
                case 681104364:
                    i9 = 3;
                    iM55979 = C0946.m55979("۫ܳ") ^ i3;
                    i = ((iM55979 ^ i4) * (-11857)) ^ 1911242737;
                    i2 = 376119879;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 142467531:
                case 1468358679:
                    C1124.m56367();
                    iM55979 = C0946.m55979("᩸ᩳ") ^ i4;
                    i = ((iM55979 ^ i3) * 21505) ^ (-898182679);
                    i2 = -1226584473;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 266959360:
                case 1408250259:
                    i7++;
                    iM55979 = (C0946.m55979("۬ۛ") ^ i3) * (-19);
                    i = ((iM55979 ^ i4) * 30539) ^ (-1596246831);
                    i2 = -1367444211;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 324111935:
                case 1643169125:
                    if (C0906.f81862 < 0) {
                        iM55979 = C0946.m55979("᩸ᩳ") ^ i4;
                        i = ((iM55979 ^ i3) * 21505) ^ (-898182679);
                        i2 = -1226584473;
                    } else {
                        iM55979 = (C0946.m55979("۬ᩳ") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM55979 ^ i4) * 27373) ^ 173659445;
                        i2 = 907848185;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 355071764:
                case 1406793074:
                    throw th;
                case 405327861:
                case 2005244742:
                    try {
                        C0845.m55577(c10844, C1404.m56460(abstractC17044));
                        abstractC17044.m38653(c10844.m24981(), interfaceC3693);
                        iM55979 = C0946.m55979("ܰ᩸") ^ i3;
                        i = ((iM55979 ^ i4) * 2955) ^ 505935721;
                        i2 = 1764805549;
                    } catch (Throwable th5) {
                        th2 = th5;
                        iM55979 = C0946.m55979("ᩳ֫") ^ i4;
                        i = ((iM55979 ^ i3) * (-18159)) ^ (-465315240);
                        i2 = 1826649706;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 590417513:
                case 2043198675:
                    abstractC17043.mo29990();
                    return;
                case 627392401:
                case 760365092:
                    abstractC17045 = this.f34419;
                    abstractC17043Arr = this.f34421;
                    if (abstractC17043Arr == null) {
                        iM55979 = C0873.m55680("ܰܽ") ^ i3;
                        i = ((iM55979 ^ i4) * (-6955)) ^ 966072224;
                        i2 = -1323051864;
                    } else {
                        iM55979 = (i4 - C0873.m55680("ܶۢ")) * 57;
                        i = ((iM55979 ^ i3) * (-12371)) ^ (-1712633906);
                        i2 = 1585822843;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 977911921:
                case 1052927735:
                    try {
                        RunnableC1014.m56176(c10844);
                        iM55979 = C0946.m55979("ۢܿ") ^ i4;
                        i = ((iM55979 ^ i3) * 28825) ^ 1725086666;
                        i2 = -900132846;
                        i6 = iM55979 ^ i2;
                        i5 = i;
                    } catch (Throwable th6) {
                        int iM55680 = C0873.m55680("᩷ۢ") ^ i3;
                        i6 = iM55680 ^ (-228359704);
                        obj = th6;
                        i5 = ((iM55680 ^ i4) * (-20539)) ^ 246397364;
                    }
                    break;
                case 1011464100:
                case 1841113646:
                    i7 = 0;
                    iM55979 = (C0946.m55979("۬ۛ") ^ i3) * (-19);
                    i = ((iM55979 ^ i4) * 30539) ^ (-1596246831);
                    i2 = -1367444211;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 1090392158:
                case 1453643070:
                    abstractC17043.mo29990();
                    iM55979 = C0873.m55680("۬ܰ") ^ i4;
                    i = ((iM55979 ^ i3) * 27795) ^ 665100640;
                    i2 = 1132701011;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 1461060038:
                case 1844231718:
                    if (C0927.m55873() > 0) {
                        iM55979 = C0946.m55979("᩸ᩳ") ^ i4;
                        i = ((iM55979 ^ i3) * 21505) ^ (-898182679);
                        i2 = -1226584473;
                    } else {
                        iM55979 = (C0873.m55680("ۜ֡") ^ i3) * (-91);
                        i = ((iM55979 ^ i4) * (-17135)) ^ 453471648;
                        i2 = 803504589;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 1885491823:
                case 2005370949:
                    C0898.m55800();
                    if (C1053.f81965 <= 0) {
                        iM55979 = C0873.m55680("ᩴ᩶") ^ i4;
                        i = ((iM55979 ^ i3) * 7501) ^ 1803743860;
                        i2 = 29343943;
                    } else {
                        iM55979 = (C0873.m55680("ܳ᩵") ^ i3) * (-105);
                        i = ((iM55979 ^ i4) * 26519) ^ 373514142;
                        i2 = -1589722872;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 2054595998:
                case 2142604246:
                    if (C1036.f81953 >= 0) {
                        iM55979 = C0873.m55680("᩻ᩳ") ^ i4;
                        i = ((iM55979 ^ i3) * (-16557)) ^ (-1660034643);
                        i2 = 1547427424;
                    } else {
                        iM55979 = C0873.m55680("ܺۡ") ^ i4;
                        i = ((iM55979 ^ i3) * 30361) ^ (-1416674208);
                        i2 = 1790673610;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                default:
                    if (RunnableC0871.m55672() >= 0) {
                        iM55979 = (C0873.m55680("ۜ֡") ^ i3) * (-91);
                        i = ((iM55979 ^ i4) * (-17135)) ^ 453471648;
                        i2 = 803504589;
                    } else {
                        iM55979 = C0946.m55979("֫ۡ") ^ i4;
                        i = ((iM55979 ^ i3) * 2839) ^ (-460342545);
                        i2 = 470409247;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    public C12335(C6970 c6970) {
        PackageInfo packageInfo = null;
        String str = null;
        int i = 0;
        AbstractC17043 abstractC17043M56143 = null;
        String[] strArr = null;
        InterfaceC19157 map = null;
        Object[] array = null;
        int i2 = -1767964970;
        int i3 = C0906.f81862;
        int i4 = C0863.f81833;
        int iM55680 = C0873.m55680("᩸ܺ") ^ i3;
        int i5 = ((iM55680 ^ i4) * 20681) ^ 1548713450;
        int i6 = 1331483258;
        while (true) {
            i2 = ((((i2 ^ i4) * 6797) >> 31) & i5) ^ (iM55680 ^ i6);
            switch (i2) {
                case -2025049713:
                case 1025242126:
                    InterfaceC19157 interfaceC19157Stream = C23573.stream(strArr);
                    if (ServiceConnectionC1013.f81940 < 0) {
                        map = interfaceC19157Stream.map(new C20820(1));
                        if (C0992.f81922 < 0) {
                            iM55680 = C0946.m55979("۫᩵") ^ i4;
                            i5 = ((iM55680 ^ i3) * 26657) ^ 832945980;
                            i6 = 1735081345;
                        }
                        break;
                    }
                    iM55680 = (i4 - C0946.m55979("ۨ᩶")) * 109;
                    i5 = ((iM55680 ^ i3) * 1385) ^ (-1416137976);
                    i6 = 1384595630;
                    break;
                case -1935629388:
                case -885347421:
                    if (strArr.length == 0) {
                        iM55680 = (C0946.m55979("ۛ۬") ^ i4) * (-67);
                        i5 = ((iM55680 ^ i3) * (-22673)) ^ (-1438609134);
                        i6 = 1118427687;
                    } else {
                        iM55680 = C0873.m55680("ۛۙ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-26177)) ^ 1889089805;
                        i6 = -1844209285;
                    }
                    break;
                case -1824865756:
                case 999497501:
                    str = packageInfo.applicationInfo.sourceDir;
                    if (C0854.f81826 != 0) {
                        iM55680 = C0873.m55680("ۨ۠") ^ i3;
                        i5 = ((iM55680 ^ i4) * 17517) ^ 1503777793;
                        i6 = 1488114024;
                    } else {
                        iM55680 = C0873.m55680("᩹۟") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-7171)) ^ (-1447730123);
                        i6 = -637404925;
                    }
                    break;
                case -1598255978:
                case 2139131498:
                    array = map.toArray(new C14346());
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = C0873.m55680("ۢ᩸") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-18213)) ^ (-1511353442);
                        i6 = -1473827034;
                    } else {
                        iM55680 = (i3 - C0873.m55680("۠۫")) * (-119);
                        i5 = ((iM55680 ^ i4) * (-14905)) ^ (-457179199);
                        i6 = -2004903198;
                    }
                    break;
                case -1578189561:
                case 290425036:
                    strArr = c6970.f18120.applicationInfo.splitSourceDirs;
                    if (strArr != null) {
                        iM55680 = (C0873.m55680("֡᩷") ^ i4) * 81;
                        i5 = ((iM55680 ^ i3) * (-14749)) ^ 427614643;
                        i6 = 700310148;
                    } else {
                        iM55680 = (C0946.m55979("ۛ۬") ^ i4) * (-67);
                        i5 = ((iM55680 ^ i3) * (-22673)) ^ (-1438609134);
                        i6 = 1118427687;
                    }
                    break;
                case -1194740511:
                case 1041831018:
                    abstractC17043M56143 = C1012.m56143(str, new String[i]);
                    if (C0917.f81868) {
                        iM55680 = (i4 - C0946.m55979("֫۠")) * (-33);
                        i5 = ((iM55680 ^ i3) * (-2693)) ^ (-291510259);
                        i6 = -2099792815;
                    } else {
                        iM55680 = C0873.m55680("ۛܰ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-19317)) ^ (-1056935431);
                        i6 = -878265605;
                    }
                    break;
                case -1020413239:
                case 1689180005:
                    this.f34419 = abstractC17043M56143;
                    if (C0877.f81843 >= 0) {
                        iM55680 = C0946.m55979("۬᩺") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-29079)) ^ 345390254;
                        i6 = -1921786241;
                    } else {
                        iM55680 = C0873.m55680("᩹ۙ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 25291) ^ 1858191621;
                        i6 = 249901228;
                    }
                    break;
                case -1007378767:
                case -509302019:
                    packageInfo = c6970.f18120;
                    if (C1024.f81946) {
                        iM55680 = (i4 - C0946.m55979("֫۠")) * (-33);
                        i5 = ((iM55680 ^ i3) * (-2693)) ^ (-291510259);
                        i6 = -2099792815;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ۖ۟")) * (-43);
                        i5 = ((iM55680 ^ i4) * 20357) ^ 1003125518;
                        i6 = 177530030;
                    }
                    break;
                case -918398375:
                case -831972499:
                    if (!C0892.f81851) {
                        iM55680 = C0873.m55680("ۢ᩸") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-18213)) ^ (-1511353442);
                        i6 = -1473827034;
                    } else {
                        iM55680 = (i4 - C0946.m55979("֫۠")) * (-33);
                        i5 = ((iM55680 ^ i3) * (-2693)) ^ (-291510259);
                        i6 = -2099792815;
                    }
                    break;
                case -847982383:
                case 120551131:
                    C0937.m55918();
                    if (C1929.f83011 == 0) {
                        iM55680 = C0873.m55680("ۨ۠") ^ i3;
                        i5 = ((iM55680 ^ i4) * 17517) ^ 1503777793;
                        i6 = 1488114024;
                    } else {
                        iM55680 = (i4 - C0946.m55979("֫۠")) * (-33);
                        i5 = ((iM55680 ^ i3) * (-2693)) ^ (-291510259);
                        i6 = -2099792815;
                    }
                    break;
                case -741890640:
                case 956219543:
                    this.f34421 = null;
                    return;
                case -531144813:
                case 473093713:
                    this.f34420 = -1L;
                    if (C0845.f81821 >= 0) {
                        iM55680 = (i4 - C0946.m55979("֫۠")) * (-33);
                        i5 = ((iM55680 ^ i3) * (-2693)) ^ (-291510259);
                        i6 = -2099792815;
                    } else {
                        iM55680 = (C0946.m55979("ۘۗ") ^ i3) * 99;
                        i5 = ((iM55680 ^ i4) * 3879) ^ (-1572793533);
                        i6 = -1818312585;
                    }
                    break;
                case -138757189:
                case 214956496:
                    C1124.m56367();
                    C1929.m56553();
                    iM55680 = (i4 - C0946.m55979("֫۠")) * (-33);
                    i5 = ((iM55680 ^ i3) * (-2693)) ^ (-291510259);
                    i6 = -2099792815;
                    break;
                case 45572877:
                case 1259622981:
                    C0949.m56012();
                    throw new RuntimeException();
                case 477680963:
                case 601675147:
                    this.f34418 = c6970;
                    if (C1003.f81929 <= 0) {
                        iM55680 = C0873.m55680("ۢ᩸") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-18213)) ^ (-1511353442);
                        i6 = -1473827034;
                    } else {
                        iM55680 = (C0946.m55979("ۡ֡") + i4) * 17;
                        i5 = ((iM55680 ^ i3) * (-26325)) ^ (-752784942);
                        i6 = 1683580224;
                    }
                    break;
                case 578525530:
                case 1655246640:
                    C0866.m55645();
                    if (C1194.m56396() <= 0) {
                        iM55680 = (i4 - C0946.m55979("ۨ᩶")) * 109;
                        i5 = ((iM55680 ^ i3) * 1385) ^ (-1416137976);
                        i6 = 1384595630;
                    } else {
                        iM55680 = C0873.m55680("ۨ۠") ^ i3;
                        i5 = ((iM55680 ^ i4) * 17517) ^ 1503777793;
                        i6 = 1488114024;
                    }
                    break;
                case 723911106:
                case 2142214308:
                    this.f34421 = (AbstractC17043[]) array;
                    return;
                default:
                    i = 0;
                    if (C1044.f81959 >= 0) {
                        iM55680 = C0946.m55979("۬᩺") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-29079)) ^ 345390254;
                        i6 = -1921786241;
                    } else {
                        iM55680 = C0946.m55979("ܿܿ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-2583)) ^ 487443281;
                        i6 = -1608380416;
                    }
                    break;
            }
        }
    }
}
