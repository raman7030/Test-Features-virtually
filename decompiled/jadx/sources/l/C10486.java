package l;

import android.content.pm.PackageInfo;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۤᩴ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C2R7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10486 {

    /* JADX INFO: renamed from: ۟֡֡, reason: not valid java name and contains not printable characters */
    private static final short[] f31454 = {8484, -18682, -18615, -18600, -18621, -18682, -18615, -18600, -18621, -18597, -18597};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4841 f31455;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f31456;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f31457;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440[] f31458;

    /* JADX WARN: Code duplicated, block: B:56:0x0193  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:66:0x020e  */
    /* JADX WARN: Code duplicated, block: B:70:0x023c A[PHI: r12
      0x023c: PHI (r12v3 long) = (r12v1 long), (r12v1 long), (r12v2 long), (r12v1 long), (r12v1 long) binds: [B:69:0x023a, B:47:0x0158, B:26:0x0097, B:15:0x0058, B:12:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x0277 A[PHI: r14 r20
      0x0277: PHI (r14v4 long) = (r14v1 long), (r14v2 long), (r14v1 long) binds: [B:59:0x01c3, B:22:0x0072, B:75:0x0275] A[DONT_GENERATE, DONT_INLINE]
      0x0277: PHI (r20v3 long) = (r20v1 long), (r20v1 long), (r20v5 long) binds: [B:59:0x01c3, B:22:0x0072, B:75:0x0275] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m26375() {
        int iM6981;
        int i;
        int i2;
        AbstractC15440[] abstractC15440Arr = null;
        long j = 0;
        int length = 0;
        int i3 = 0;
        long j2 = 0;
        long jMo23127 = 0;
        long j3 = 0;
        int i4 = 1513650041;
        int i5 = ServiceConnectionC3453.f10921;
        int i6 = C22628.f73083;
        int iM2566 = (C0630.m2566("۫ܰ") + i5) * (-97);
        int i7 = ((iM2566 ^ i6) * 31751) ^ 1268056096;
        int i8 = iM2566 ^ (-1613594457);
        long jMo23128 = 0;
        long j4 = 0;
        while (true) {
            i4 = i8 ^ (i7 & (((i4 ^ i6) * 2111) >> 31));
            switch (i4) {
                case -2092346860:
                case 2129356247:
                    if (C4159.f13567) {
                        iM6981 = (C0630.m2566("ۖۢ") + i6) * 57;
                        i = ((iM6981 ^ i5) * (-27469)) ^ (-1464082201);
                        i2 = 1755085382;
                    } else {
                        iM6981 = C2105.m6981("֫ܽ") ^ i6;
                        i = ((iM6981 ^ i5) * (-27421)) ^ (-12814317);
                        i2 = -1145250164;
                    }
                    int i9 = i;
                    i8 = iM6981 ^ i2;
                    i7 = i9;
                    break;
                case -1997973582:
                case -362230791:
                    if (C3537.f11231 >= 0) {
                        iM6981 = (i5 - C0630.m2566("ۗܽ")) * (-93);
                        i = ((iM6981 ^ i6) * (-3603)) ^ 1912327386;
                        i2 = -1798300823;
                    } else {
                        iM6981 = (C2105.m6981("۟֫") ^ i6) * 109;
                        i = ((iM6981 ^ i5) * 16035) ^ 1678885544;
                        i2 = -1414062252;
                    }
                    int i10 = i;
                    i8 = iM6981 ^ i2;
                    i7 = i10;
                    break;
                case -1979122264:
                case -749883952:
                    if (C1047.m3599() >= 0) {
                        iM6981 = (C0630.m2566("ۖۢ") + i6) * 57;
                        i = ((iM6981 ^ i5) * (-27469)) ^ (-1464082201);
                        i2 = 1755085382;
                    } else {
                        iM6981 = (C2105.m6981("ܽۡ") ^ i6) * (-61);
                        i = ((iM6981 ^ i5) * 26019) ^ 624510204;
                        i2 = -1574886660;
                    }
                    int i11 = i;
                    i8 = iM6981 ^ i2;
                    i7 = i11;
                    break;
                case -1973429432:
                case -1437796995:
                    C0630.m2564();
                    return 0L;
                case -1906348387:
                case -1630040179:
                    if (C3019.m9255() <= 0) {
                        iM6981 = C0630.m2566("ۧۘ") ^ i5;
                        i = ((iM6981 ^ i6) * 14541) ^ 529754607;
                        i2 = 1722348265;
                    } else {
                        iM6981 = (C0630.m2566("ۖۢ") + i6) * 57;
                        i = ((iM6981 ^ i5) * (-27469)) ^ (-1464082201);
                        i2 = 1755085382;
                    }
                    int i12 = i;
                    i8 = iM6981 ^ i2;
                    i7 = i12;
                    break;
                case -1820710732:
                case -823542311:
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = (C0630.m2566("ۖۢ") + i6) * 57;
                        i = ((iM6981 ^ i5) * (-27469)) ^ (-1464082201);
                        i2 = 1755085382;
                    } else {
                        iM6981 = C0630.m2566("۫ܶ") ^ i5;
                        i = ((iM6981 ^ i6) * 16963) ^ (-1924687774);
                        i2 = 1919564324;
                    }
                    int i13 = i;
                    i8 = iM6981 ^ i2;
                    i7 = i13;
                    break;
                case -1759427151:
                case -801108685:
                    ViewOnClickListenerC1958.m6429();
                    C21923.m49329();
                    iM6981 = C0630.m2566("ۧۘ") ^ i5;
                    i = ((iM6981 ^ i6) * 14541) ^ 529754607;
                    i2 = 1722348265;
                    int i14 = i;
                    i8 = iM6981 ^ i2;
                    i7 = i14;
                    break;
                case -1686638159:
                case 2091817460:
                    if (C3245.f10203 <= 0) {
                        iM6981 = (C2105.m6981("ᩳۛ") + i6) * (-93);
                        i = ((iM6981 ^ i5) * (-24205)) ^ 1725591268;
                        i2 = -1854789748;
                    } else {
                        iM6981 = (i5 - C2105.m6981("᩺᩵")) * 5;
                        i = ((iM6981 ^ i6) * 1005) ^ 498517993;
                        i2 = 674130107;
                    }
                    int i15 = i;
                    i8 = iM6981 ^ i2;
                    i7 = i15;
                    break;
                case -1633873153:
                case 401080885:
                    if (j4 != -1) {
                        iM6981 = (i6 - C0630.m2566("ܳ᩶")) * (-117);
                        i = ((iM6981 ^ i5) * (-5689)) ^ (-531766807);
                        i2 = 818030897;
                    } else {
                        iM6981 = (i5 - C2105.m6981("ܽۗ")) * (-127);
                        i = ((iM6981 ^ i6) * 2533) ^ 1808999291;
                        i2 = -1096492602;
                    }
                    int i16 = i;
                    i8 = iM6981 ^ i2;
                    i7 = i16;
                    break;
                case -1593681914:
                case 1504957175:
                    if (C3019.m9255() <= 0) {
                        iM6981 = C0630.m2566("ۧۘ") ^ i5;
                        i = ((iM6981 ^ i6) * 14541) ^ 529754607;
                        i2 = 1722348265;
                    } else {
                        iM6981 = (i6 - C2105.m6981("۫۟")) * 51;
                        i = ((iM6981 ^ i5) * 14047) ^ 1753432638;
                        i2 = 1927805604;
                    }
                    int i17 = i;
                    i8 = iM6981 ^ i2;
                    i7 = i17;
                    break;
                case -1479472072:
                case -953632024:
                    if (i3 < length) {
                        iM6981 = C2105.m6981("ۘ۠") ^ i6;
                        i = ((iM6981 ^ i5) * 23683) ^ 96674894;
                        i2 = -1964788246;
                    } else {
                        j = j2;
                        iM6981 = (i5 - C0630.m2566("ۡۡ")) * 27;
                        i = ((iM6981 ^ i6) * 6435) ^ 174415766;
                        i2 = 1465581496;
                    }
                    int i18 = i;
                    i8 = iM6981 ^ i2;
                    i7 = i18;
                    break;
                case -1454025528:
                case 1568611655:
                    this.f31457 = j;
                    return j;
                case -1435859540:
                case -107020588:
                    long j5 = this.f31457;
                    if (C3537.f11231 >= 0) {
                        j4 = j5;
                        iM6981 = (C2105.m6981("ᩳۛ") + i6) * (-93);
                        i = ((iM6981 ^ i5) * (-24205)) ^ 1725591268;
                        i2 = -1854789748;
                        int i19 = i;
                        i8 = iM6981 ^ i2;
                        i7 = i19;
                    } else {
                        int iM6982 = C2105.m6981("᩹᩻") ^ i5;
                        j4 = j5;
                        i8 = iM6982 ^ 1727809530;
                        i7 = ((iM6982 ^ i6) * 24071) ^ (-5605713);
                    }
                    break;
                case -1090492415:
                case -383043810:
                    jMo23127 = abstractC15440Arr[i3].mo23127();
                    if (C0714.m2805()) {
                        iM6981 = C2105.m6981("֨᩺") ^ i6;
                        i = ((iM6981 ^ i5) * (-9085)) ^ (-170638725);
                        i2 = 976808700;
                    } else {
                        iM6981 = (C0630.m2566("ۖۢ") + i6) * 57;
                        i = ((iM6981 ^ i5) * (-27469)) ^ (-1464082201);
                        i2 = 1755085382;
                    }
                    int i110 = i;
                    i8 = iM6981 ^ i2;
                    i7 = i110;
                    break;
                case -953692939:
                case 266020301:
                    j3 = j2 + jMo23127;
                    if (C3537.f11231 >= 0) {
                        iM6981 = (C2105.m6981("ᩳۛ") + i6) * (-93);
                        i = ((iM6981 ^ i5) * (-24205)) ^ 1725591268;
                        i2 = -1854789748;
                    } else {
                        iM6981 = (C2105.m6981("ۢ۫") + i5) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM6981 ^ i6) * (-32261)) ^ 1450063739;
                        i2 = 1511635069;
                    }
                    int i111 = i;
                    i8 = iM6981 ^ i2;
                    i7 = i111;
                    break;
                case -808768784:
                case -492540670:
                    jMo23128 = this.f31456.mo23127();
                    abstractC15440Arr = this.f31458;
                    if (abstractC15440Arr != null) {
                        iM6981 = (C0630.m2566("ۜ֡") ^ i6) * 59;
                        i = ((iM6981 ^ i5) * (-4473)) ^ (-1243039071);
                        i2 = 1231765032;
                    } else {
                        j = jMo23128;
                        iM6981 = (i5 - C0630.m2566("ۡۡ")) * 27;
                        i = ((iM6981 ^ i6) * 6435) ^ 174415766;
                        i2 = 1465581496;
                    }
                    int i112 = i;
                    i8 = iM6981 ^ i2;
                    i7 = i112;
                    break;
                case -705494635:
                case 585688170:
                    length = abstractC15440Arr.length;
                    j2 = jMo23128;
                    i3 = 0;
                    iM6981 = C0630.m2566("ۤ᩻") ^ i5;
                    i = ((iM6981 ^ i6) * (-23083)) ^ (-526469628);
                    i2 = 1260783967;
                    int i113 = i;
                    i8 = iM6981 ^ i2;
                    i7 = i113;
                    break;
                case -436512950:
                case -277514515:
                    i3++;
                    j2 = j3;
                    iM6981 = C0630.m2566("ۤ᩻") ^ i5;
                    i = ((iM6981 ^ i6) * (-23083)) ^ (-526469628);
                    i2 = 1260783967;
                    int i114 = i;
                    i8 = iM6981 ^ i2;
                    i7 = i114;
                    break;
                case -367697757:
                case 238752418:
                    if (C1005.m3501()) {
                        iM6981 = (C0630.m2566("ܽ᩶") + i5) * 115;
                        i = ((iM6981 ^ i6) * (-2913)) ^ (-1425642851);
                        i2 = -391904902;
                    } else {
                        iM6981 = C0630.m2566("ۧۘ") ^ i5;
                        i = ((iM6981 ^ i6) * 14541) ^ 529754607;
                        i2 = 1722348265;
                    }
                    int i115 = i;
                    i8 = iM6981 ^ i2;
                    i7 = i115;
                    break;
                case -291358550:
                case -98040979:
                    RunnableC0588.m2441();
                    if (C1005.f3721) {
                        iM6981 = C0630.m2566("ۧۘ") ^ i5;
                        i = ((iM6981 ^ i6) * 14541) ^ 529754607;
                        i2 = 1722348265;
                    } else {
                        iM6981 = (i5 - C0630.m2566("ۗܽ")) * (-93);
                        i = ((iM6981 ^ i6) * (-3603)) ^ 1912327386;
                        i2 = -1798300823;
                    }
                    int i116 = i;
                    i8 = iM6981 ^ i2;
                    i7 = i116;
                    break;
                case 266333640:
                case 1869469937:
                    return j4;
                default:
                    if (C2272.m7503()) {
                        iM6981 = C2105.m6981("֫ܽ") ^ i6;
                        i = ((iM6981 ^ i5) * (-27421)) ^ (-12814317);
                        i2 = -1145250164;
                    } else {
                        iM6981 = C2105.m6981("۠֨") ^ i6;
                        i = ((iM6981 ^ i5) * 21775) ^ (-1916284588);
                        i2 = -537478008;
                    }
                    int i117 = i;
                    i8 = iM6981 ^ i2;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m26373() {
        int iM2566;
        int i;
        int i2;
        String strM9035;
        int i3 = RunnableC1937.f6483;
        int i4 = C4117.f13076;
        int iM2567 = C0630.m2566("۠ۤ") ^ i3;
        int i5 = ((iM2567 ^ i4) * 10617) ^ 1746842548;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2567 ^ 333128339;
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
        String strM2816 = null;
        AbstractC15440[] abstractC15440Arr = null;
        String strM11225 = null;
        String strM6378 = null;
        String strM6678 = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * 14937) >> 31));
            switch (i13) {
                case -2110250563:
                case 530518216:
                    sArr3 = f31454;
                    if (C3746.f11829 <= 0) {
                        iM2566 = (C0630.m2566("᩸᩸") + i3) * (-113);
                        i = ((iM2566 ^ i4) * 30067) ^ 72560004;
                        i2 = 90811992;
                    } else {
                        iM2566 = C0630.m2566("ܺۤ") ^ i4;
                        i = ((iM2566 ^ i3) * (-11267)) ^ 905631845;
                        i2 = -304634767;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -2071535825:
                case -1407424283:
                    strM9035 = C2958.m9035(strM6678, C5695.m16034(sArr2, i8, i9, i10));
                    str = strM9035;
                    iM2566 = (C2105.m6981("᩻۠") ^ i4) * (-61);
                    i = ((iM2566 ^ i3) * (-7677)) ^ 372874295;
                    i2 = 1664451768;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1861256461:
                case -473426255:
                    if (C0050.f910 >= 0) {
                        iM2566 = (C0630.m2566("᩸᩸") + i3) * (-113);
                        i = ((iM2566 ^ i4) * 30067) ^ 72560004;
                        i2 = 90811992;
                    } else {
                        iM2566 = (C2105.m6981("֫۬") + i3) * (-51);
                        i = ((iM2566 ^ i4) * 23961) ^ 1745242890;
                        i2 = -1783365298;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1704353809:
                case 658736057:
                    strM9035 = C2958.m9035(strM6678, strM2816);
                    str = strM9035;
                    iM2566 = (C2105.m6981("᩻۠") ^ i4) * (-61);
                    i = ((iM2566 ^ i3) * (-7677)) ^ 372874295;
                    i2 = 1664451768;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1474639023:
                case -1127308769:
                    i10 = 46888;
                    iM2566 = C0630.m2566("֡᩸") ^ i4;
                    i = ((iM2566 ^ i3) * (-11947)) ^ 1455877941;
                    i2 = 964243733;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1421810273:
                case 668624429:
                    if (abstractC15440Arr == null) {
                        str = strM6678;
                        iM2566 = (C2105.m6981("᩻۠") ^ i4) * (-61);
                        i = ((iM2566 ^ i3) * (-7677)) ^ 372874295;
                        i2 = 1664451768;
                    } else {
                        iM2566 = C0630.m2566("ۨܽ") ^ i3;
                        i = ((iM2566 ^ i4) * 30121) ^ (-1205042624);
                        i2 = -65212215;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1248959709:
                case 2059545025:
                    C3432.m10477();
                    iM2566 = (C0630.m2566("᩸᩸") + i3) * (-113);
                    i = ((iM2566 ^ i4) * 30067) ^ 72560004;
                    i2 = 90811992;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1185999118:
                case -469385492:
                    i10 = 21008;
                    iM2566 = C0630.m2566("֡᩸") ^ i4;
                    i = ((iM2566 ^ i3) * (-11947)) ^ 1455877941;
                    i2 = 964243733;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1155606468:
                case -661757550:
                    c = 0;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = (C0630.m2566("᩺᩵") ^ i4) * (-97);
                        i = ((iM2566 ^ i3) * 14811) ^ 304813672;
                        i2 = -55825873;
                    } else {
                        iM2566 = C0630.m2566("ܰۡ") ^ i3;
                        i = ((iM2566 ^ i4) * 11471) ^ (-1485969424);
                        i2 = -1778106335;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -999732537:
                case -409977135:
                    if (abstractC15440Arr == null) {
                        strM2816 = strM11225;
                        iM2566 = C2105.m6981("ۡ᩸") ^ i4;
                        i = ((iM2566 ^ i3) * 28347) ^ 1818581000;
                        i2 = -861869313;
                    } else {
                        iM2566 = C0630.m2566("ۘۛ") ^ i4;
                        i = ((iM2566 ^ i3) * 10315) ^ (-1161196307);
                        i2 = 663503015;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -954559820:
                case 1038077685:
                    s = 13922;
                    if (C5695.m16023() >= 0) {
                        iM2566 = (C0630.m2566("᩸᩸") + i3) * (-113);
                        i = ((iM2566 ^ i4) * 30067) ^ 72560004;
                        i2 = 90811992;
                    } else {
                        iM2566 = (C0630.m2566("ۡ֨") ^ i4) * (-85);
                        i = ((iM2566 ^ i3) * (-21559)) ^ (-1099957141);
                        i2 = 219808499;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -919056865:
                case 1666443684:
                    strM6378 = RunnableC1937.m6378(strM6678);
                    if (C1047.f3863 >= 0) {
                        iM2566 = (C2105.m6981("֫۬") + i3) * (-51);
                        i = ((iM2566 ^ i4) * 23961) ^ 1745242890;
                        i2 = -1783365298;
                    } else {
                        iM2566 = C2105.m6981("ۧ۠") ^ i4;
                        i = ((iM2566 ^ i3) * 20927) ^ 31108307;
                        i2 = 1714248912;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -909234572:
                case 1900347651:
                    strM2816 = C0714.m2816(f31454, 5, 5, i10);
                    iM2566 = C2105.m6981("ۡ᩸") ^ i4;
                    i = ((iM2566 ^ i3) * 28347) ^ 1818581000;
                    i2 = -861869313;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -559171870:
                case 574072883:
                    if (i12 - (s2 * s) < 0) {
                        iM2566 = C2105.m6981("ۗۚ") ^ i3;
                        i = ((iM2566 ^ i4) * 28163) ^ (-78935468);
                        i2 = 1978055461;
                    } else {
                        iM2566 = C0630.m2566("ܰۗ") ^ i3;
                        i = ((iM2566 ^ i4) * (-14829)) ^ 187971152;
                        i2 = 757962898;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -511105589:
                case 1093684633:
                    if (C4263.f13799 > 0) {
                        iM2566 = (C2105.m6981("֫۬") + i3) * (-51);
                        i = ((iM2566 ^ i4) * 23961) ^ 1745242890;
                        i2 = -1783365298;
                    } else {
                        iM2566 = C0630.m2566("ۨ᩺") ^ i4;
                        i = ((iM2566 ^ i3) * (-7933)) ^ 1532375583;
                        i2 = -1258193788;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -7635506:
                case 132610746:
                    s2 = sArr3[c];
                    i11 = s2 * s2;
                    if (C4159.m12565() >= 0) {
                        iM2566 = (C0630.m2566("۬ᩴ") + i3) * 71;
                        i = ((iM2566 ^ i4) * (-10163)) ^ 855162787;
                        i2 = 1431076955;
                    } else {
                        iM2566 = C2105.m6981("ۙ᩵") ^ i4;
                        i = ((iM2566 ^ i3) * (-22325)) ^ 586581801;
                        i2 = 1036601863;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 49407289:
                case 1423323102:
                    boolean zM11370 = C3746.m11370(strM6378, strM11225);
                    abstractC15440Arr = this.f31458;
                    if (zM11370) {
                        iM2566 = C2105.m6981("᩻ۛ") ^ i4;
                        i = ((iM2566 ^ i3) * 157) ^ (-1461127541);
                        i2 = -41270024;
                    } else {
                        iM2566 = C2105.m6981("ۛۤ") ^ i3;
                        i = ((iM2566 ^ i4) * (-13289)) ^ 527729258;
                        i2 = 1435127428;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 168451822:
                case 1795178012:
                    i12 = i11 + 48455521;
                    if (C2272.m7503()) {
                        iM2566 = (C0630.m2566("᩸᩸") + i3) * (-113);
                        i = ((iM2566 ^ i4) * 30067) ^ 72560004;
                        i2 = 90811992;
                    } else {
                        iM2566 = (i3 - C0630.m2566("֫ۚ")) * 45;
                        i = ((iM2566 ^ i4) * 19281) ^ (-1154212519);
                        i2 = 1676980619;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 578113489:
                case 820255406:
                    sArr = f31454;
                    i7 = 1;
                    if (C2105.f7037 != 0) {
                        iM2566 = (C0630.m2566("۬ᩴ") + i3) * 71;
                        i = ((iM2566 ^ i4) * (-10163)) ^ 855162787;
                        i2 = 1431076955;
                    } else {
                        iM2566 = C0630.m2566("ܽܺ") ^ i4;
                        i = ((iM2566 ^ i3) * (-15147)) ^ (-1577465361);
                        i2 = 2139374651;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 590953861:
                case 1672312131:
                    C2105.m6982();
                    if (C7811.f24123 >= 0) {
                        iM2566 = (C0630.m2566("᩸᩸") + i3) * (-113);
                        i = ((iM2566 ^ i4) * 30067) ^ 72560004;
                        i2 = 90811992;
                    } else {
                        iM2566 = (C0630.m2566("᩺᩵") ^ i4) * (-97);
                        i = ((iM2566 ^ i3) * 14811) ^ 304813672;
                        i2 = -55825873;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 657124974:
                case 1845490358:
                    sArr2 = f31454;
                    i8 = 10;
                    i9 = 1;
                    if (C3911.m11924() <= 0) {
                        iM2566 = (C0630.m2566("᩺᩵") ^ i4) * (-97);
                        i = ((iM2566 ^ i3) * 14811) ^ 304813672;
                        i2 = -55825873;
                    } else {
                        iM2566 = (C0630.m2566("ۢᩴ") + i3) * 97;
                        i = ((iM2566 ^ i4) * (-15137)) ^ 75441167;
                        i2 = -1019956653;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 692926721:
                case 818538430:
                    strM11225 = C3683.m11225(sArr, i7, 4, i10);
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = C0630.m2566("ۨ᩺") ^ i4;
                        i = ((iM2566 ^ i3) * (-7933)) ^ 1532375583;
                        i2 = -1258193788;
                    } else {
                        iM2566 = C0630.m2566("ۢ֨") ^ i3;
                        i = ((iM2566 ^ i4) * (-30445)) ^ (-1370427978);
                        i2 = -986371086;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 847384350:
                case 2075068045:
                    return C3663.m11176(ViewOnClickListenerC2040.m6667(), str);
                case 1750147058:
                case 1873830725:
                    strM6678 = ViewOnClickListenerC2040.m6678(this.f31455);
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = (C0630.m2566("۬ᩴ") + i3) * 71;
                        i = ((iM2566 ^ i4) * (-10163)) ^ 855162787;
                        i2 = 1431076955;
                    } else {
                        iM2566 = C0630.m2566("ۚܿ") ^ i3;
                        i = ((iM2566 ^ i4) * 20941) ^ 1396763059;
                        i2 = 1490766480;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                default:
                    C3019.m9255();
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26374(AbstractC15440 abstractC15440, InterfaceC1393 interfaceC1393) throws Throwable {
        int iM6981;
        int i;
        int i2;
        int i3 = C3746.f11829;
        int i4 = AbstractC2021.f6743;
        int iM6982 = C2105.m6981("۬ۤ") ^ i4;
        int i5 = ((iM6982 ^ i3) * (-18357)) ^ (-1093469349);
        Throwable th = null;
        Object obj = null;
        AbstractC15440 abstractC15441 = null;
        int i6 = iM6982 ^ (-1845073169);
        C8918 c8918 = null;
        int length = 0;
        int i7 = 0;
        boolean zM7150 = false;
        int i8 = -1078616504;
        AbstractC15440[] abstractC15440Arr = null;
        Throwable th2 = null;
        AbstractC15440 abstractC15442 = null;
        int i9 = 0;
        while (true) {
            i8 = i6 ^ (i5 & (((i8 ^ i3) * 5139) >> 31));
            switch (i8) {
                case -2096122037:
                case 498150084:
                    if (C3746.f11829 > 0) {
                        iM6981 = (i4 - C0630.m2566("ܰᩴ")) * 27;
                        i = ((iM6981 ^ i3) * 983) ^ (-1525174630);
                        i2 = 817059482;
                    } else {
                        iM6981 = C0630.m2566("ᩴ᩶") ^ i4;
                        i = ((iM6981 ^ i3) * 7501) ^ 1803743860;
                        i2 = 29343943;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -2092912134:
                case -1991207738:
                    abstractC15440.mo18537(ViewOnClickListenerC1958.m6432());
                    return;
                case -1847667753:
                case 1007807406:
                    if (C1773.f6144 <= 0) {
                        iM6981 = C0630.m2566("᩻ᩳ") ^ i4;
                        i = ((iM6981 ^ i3) * (-16557)) ^ (-1660034643);
                        i2 = 1547427424;
                    } else {
                        iM6981 = C2105.m6981("֨֨") ^ i3;
                        i = ((iM6981 ^ i4) * (-18237)) ^ 1744047111;
                        i2 = 1267449281;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1799753146:
                case 489790035:
                    C0714.m2815(th2, obj);
                    iM6981 = C2105.m6981("ۢܿ") ^ i4;
                    i = ((iM6981 ^ i3) * 28825) ^ 1725086666;
                    i2 = -900132846;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1698167510:
                case 1330827361:
                    if (C2105.f7037 != 0) {
                        iM6981 = C0630.m2566("ᩴ᩶") ^ i4;
                        i = ((iM6981 ^ i3) * 7501) ^ 1803743860;
                        i2 = 29343943;
                    } else {
                        iM6981 = (C0630.m2566("۠۠") ^ i4) * 67;
                        i = ((iM6981 ^ i3) * (-31321)) ^ (-697196676);
                        i2 = -786018145;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1661779188:
                case -1423412795:
                    throw th2;
                case -1484807522:
                case 1598841069:
                    if (C3432.f10845 >= 0) {
                        iM6981 = (C2105.m6981("۬ᩳ") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM6981 ^ i4) * 27373) ^ 173659445;
                        i2 = 907848185;
                    } else {
                        iM6981 = (i4 - C0630.m2566("ܰᩴ")) * 27;
                        i = ((iM6981 ^ i3) * 983) ^ (-1525174630);
                        i2 = 817059482;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1451058015:
                case 1178276892:
                    return;
                case -1423101955:
                case 853313220:
                    if (C2272.f7362) {
                        iM6981 = (C0630.m2566("ܳ᩵") ^ i3) * (-105);
                        i = ((iM6981 ^ i4) * 26519) ^ 373514142;
                        i2 = -1589722872;
                    } else {
                        iM6981 = C2105.m6981("֫᩹") ^ i3;
                        i = ((iM6981 ^ i4) * 13945) ^ (-1508719716);
                        i2 = -1723692799;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1324532401:
                case 1847666311:
                    abstractC15441 = abstractC15440Arr[i7];
                    zM7150 = C2167.m7150(interfaceC1393);
                    iM6981 = C0630.m2566("ܰܳ") ^ i4;
                    i = ((iM6981 ^ i3) * (-3079)) ^ (-1800864609);
                    i2 = -1512083283;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1233415924:
                case 177348283:
                    if (C0050.f910 >= 0) {
                        iM6981 = (C0630.m2566("ܳ᩵") ^ i3) * (-105);
                        i = ((iM6981 ^ i4) * 26519) ^ 373514142;
                        i2 = -1589722872;
                    } else {
                        iM6981 = C0630.m2566("ۖۜ") ^ i4;
                        i = ((iM6981 ^ i3) * (-539)) ^ (-96110070);
                        i2 = 650643242;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1175391256:
                case -338396949:
                    try {
                        RunnableC3474.m10629(c8918);
                        iM6981 = C2105.m6981("᩵۟") ^ i4;
                        i = ((iM6981 ^ i3) * 2203) ^ 614452708;
                        i2 = 1119098734;
                    } catch (Throwable th3) {
                        th = th3;
                        iM6981 = (C0630.m2566("ᩴᩳ") ^ i3) * 31;
                        i = ((iM6981 ^ i4) * 15079) ^ 614790598;
                        i2 = -886091547;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1085694909:
                case 913019366:
                    if (C0714.m2807(interfaceC1393)) {
                        iM6981 = C2105.m6981("ۧۜ") ^ i3;
                        i = ((iM6981 ^ i4) * (-27555)) ^ 477841767;
                        i2 = 640124014;
                    } else {
                        iM6981 = C0630.m2566("۬ܰ") ^ i4;
                        i = ((iM6981 ^ i3) * 27795) ^ 665100640;
                        i2 = 1132701011;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -922638663:
                case 1904773353:
                    C11340.m28031();
                    if (C7811.f24123 >= 0) {
                        iM6981 = (C2105.m6981("ۖ֡") + i4) * 73;
                        i = ((iM6981 ^ i3) * 9205) ^ (-1253692584);
                        i2 = -1420698054;
                    } else {
                        iM6981 = C0630.m2566("ܽ֫") ^ i3;
                        i = ((iM6981 ^ i4) * (-2937)) ^ (-428911092);
                        i2 = -2102443360;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -693757891:
                case 1767948645:
                    if (C4925.m14321()) {
                        iM6981 = C0630.m2566("۫ۡ") ^ i3;
                        i = ((iM6981 ^ i4) * (-4921)) ^ (-1585594772);
                        i2 = -276233867;
                    } else {
                        iM6981 = C2105.m6981("ۘ֫") ^ i4;
                        i = ((iM6981 ^ i3) * 9499) ^ 1345187498;
                        i2 = -14103823;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -671450560:
                case 1447852007:
                    abstractC15442.m36500(abstractC15440, (C17558) null, interfaceC1393);
                    if (C2167.m7150(interfaceC1393)) {
                        iM6981 = (C2105.m6981("۟۬") + i4) * 109;
                        i = ((iM6981 ^ i3) * 25789) ^ 716808827;
                        i2 = -976375591;
                    } else {
                        iM6981 = (C2105.m6981("᩸ۛ") ^ i3) * 51;
                        i = ((iM6981 ^ i4) * (-9737)) ^ (-750643937);
                        i2 = 350601943;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -664055285:
                case 998241279:
                    abstractC15440.mo27929();
                    iM6981 = C2105.m6981("ۘ֫") ^ i4;
                    i = ((iM6981 ^ i3) * 9499) ^ 1345187498;
                    i2 = -14103823;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -650503021:
                case 1604142509:
                    if (C4075.f12947 >= 0) {
                        iM6981 = C0630.m2566("᩻ᩳ") ^ i4;
                        i = ((iM6981 ^ i3) * (-16557)) ^ (-1660034643);
                        i2 = 1547427424;
                    } else {
                        iM6981 = C2105.m6981("֡᩻") ^ i4;
                        i = ((iM6981 ^ i3) * 29489) ^ 1711707573;
                        i2 = 727822563;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -532017377:
                case 933548907:
                    C3911.m11924();
                    return;
                case -461968309:
                case 624691103:
                    C3683.m11222();
                    if (C3911.f12484 < 0) {
                        iM6981 = (i4 - C0630.m2566("ܰᩴ")) * 27;
                        i = ((iM6981 ^ i3) * 983) ^ (-1525174630);
                        i2 = 817059482;
                    } else {
                        iM6981 = (C2105.m6981("ۖ֡") + i4) * 73;
                        i = ((iM6981 ^ i3) * 9205) ^ (-1253692584);
                        i2 = -1420698054;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -322020505:
                case 337486823:
                    if (C0714.m2807(interfaceC1393)) {
                        iM6981 = (i3 - C0630.m2566("᩺ܿ")) * (-111);
                        i = ((iM6981 ^ i4) * (-4759)) ^ 1955929455;
                        i2 = 1380948255;
                    } else {
                        iM6981 = C2105.m6981("ۘ֫") ^ i4;
                        i = ((iM6981 ^ i3) * 9499) ^ 1345187498;
                        i2 = -14103823;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -310445736:
                case 356719204:
                    try {
                        c8918 = new C8918(abstractC15440);
                        iM6981 = (i4 - C0630.m2566("᩶᩸")) * 35;
                        i = ((iM6981 ^ i3) * 10053) ^ (-986730753);
                        i2 = -263911025;
                    } catch (Throwable th4) {
                        th = th4;
                        c8918 = null;
                        iM6981 = (C0630.m2566("ᩴᩳ") ^ i3) * 31;
                        i = ((iM6981 ^ i4) * 15079) ^ 614790598;
                        i2 = -886091547;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -305892621:
                case 2110519194:
                    if (C2105.f7037 != 0) {
                        iM6981 = (C0630.m2566("ܳ᩵") ^ i3) * (-105);
                        i = ((iM6981 ^ i4) * 26519) ^ 373514142;
                        i2 = -1589722872;
                    } else {
                        iM6981 = C0630.m2566("᩷ۖ") ^ i3;
                        i = ((iM6981 ^ i4) * 5141) ^ 1426722420;
                        i2 = -839427033;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -210429651:
                case 546619279:
                    if (zM7150) {
                        iM6981 = (i3 - C2105.m6981("֡ۘ")) * (-35);
                        i = ((iM6981 ^ i4) * (-27255)) ^ 1247873854;
                        i2 = 465021821;
                    } else {
                        iM6981 = (C0630.m2566("ۧܳ") + i3) * 55;
                        i = ((iM6981 ^ i4) * (-4167)) ^ (-1674994505);
                        i2 = 16179794;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -207121457:
                case 1405200917:
                    if (i7 < length) {
                        iM6981 = (C2105.m6981("֨ܽ") ^ i4) * (-55);
                        i = ((iM6981 ^ i3) * 11583) ^ 1805959381;
                        i2 = 256678593;
                    } else {
                        iM6981 = (i3 - C2105.m6981("֡ۘ")) * (-35);
                        i = ((iM6981 ^ i4) * (-27255)) ^ 1247873854;
                        i2 = 465021821;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -40237015:
                case 1890760458:
                    c8918.m23009(i9);
                    C0422.m1961(c8918, C1005.m3496(abstractC15442));
                    abstractC15442.m36495(c8918.m23007(), interfaceC1393);
                    length = abstractC15440Arr.length;
                    iM6981 = C0630.m2566("᩺ۙ") ^ i4;
                    i = ((iM6981 ^ i3) * 26761) ^ (-2100816693);
                    i2 = 991206962;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -26677387:
                case 1252251914:
                    if (C3432.f10845 >= 0) {
                        iM6981 = (C0630.m2566("ۜ֡") ^ i3) * (-91);
                        i = ((iM6981 ^ i4) * (-17135)) ^ 453471648;
                        i2 = 803504589;
                    } else {
                        iM6981 = C2105.m6981("ܶ᩷") ^ i3;
                        i = ((iM6981 ^ i4) * 949) ^ 496355309;
                        i2 = -1075597705;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -6616118:
                case 1923596126:
                    if (C0382.f1805) {
                        iM6981 = C0630.m2566("ۛ᩺") ^ i4;
                        i = ((iM6981 ^ i3) * (-22469)) ^ (-1591066975);
                        i2 = 1471963113;
                    } else {
                        iM6981 = C0630.m2566("ۖۜ") ^ i4;
                        i = ((iM6981 ^ i3) * (-539)) ^ (-96110070);
                        i2 = 650643242;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 18235029:
                case 872545911:
                    if (C4616.f14690 <= 0) {
                        iM6981 = C0630.m2566("᩻ᩳ") ^ i4;
                        i = ((iM6981 ^ i3) * (-16557)) ^ (-1660034643);
                        i2 = 1547427424;
                    } else {
                        iM6981 = (C2105.m6981("ۜ֫") + i3) * (-113);
                        i = ((iM6981 ^ i4) * (-1939)) ^ (-1844241240);
                        i2 = -689658259;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 70948109:
                case 681104364:
                    i9 = 3;
                    iM6981 = C2105.m6981("۫ܳ") ^ i3;
                    i = ((iM6981 ^ i4) * (-11857)) ^ 1911242737;
                    i2 = 376119879;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 142467531:
                case 1468358679:
                    C5695.m16023();
                    iM6981 = C2105.m6981("᩸ᩳ") ^ i4;
                    i = ((iM6981 ^ i3) * 21505) ^ (-898182679);
                    i2 = -1226584473;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 266959360:
                case 1408250259:
                    i7++;
                    iM6981 = (C2105.m6981("۬ۛ") ^ i3) * (-19);
                    i = ((iM6981 ^ i4) * 30539) ^ (-1596246831);
                    i2 = -1367444211;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 324111935:
                case 1643169125:
                    if (C1294.f4556 < 0) {
                        iM6981 = C2105.m6981("᩸ᩳ") ^ i4;
                        i = ((iM6981 ^ i3) * 21505) ^ (-898182679);
                        i2 = -1226584473;
                    } else {
                        iM6981 = (C2105.m6981("۬ᩳ") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM6981 ^ i4) * 27373) ^ 173659445;
                        i2 = 907848185;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 355071764:
                case 1406793074:
                    throw th;
                case 405327861:
                case 2005244742:
                    try {
                        C0050.m930(c8918, C11340.m28023(abstractC15441));
                        abstractC15441.m36495(c8918.m23007(), interfaceC1393);
                        iM6981 = C2105.m6981("ܰ᩸") ^ i3;
                        i = ((iM6981 ^ i4) * 2955) ^ 505935721;
                        i2 = 1764805549;
                    } catch (Throwable th5) {
                        th2 = th5;
                        iM6981 = C2105.m6981("ᩳ֫") ^ i4;
                        i = ((iM6981 ^ i3) * (-18159)) ^ (-465315240);
                        i2 = 1826649706;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 590417513:
                case 2043198675:
                    abstractC15440.mo27929();
                    return;
                case 627392401:
                case 760365092:
                    abstractC15442 = this.f31456;
                    abstractC15440Arr = this.f31458;
                    if (abstractC15440Arr == null) {
                        iM6981 = C0630.m2566("ܰܽ") ^ i3;
                        i = ((iM6981 ^ i4) * (-6955)) ^ 966072224;
                        i2 = -1323051864;
                    } else {
                        iM6981 = (i4 - C0630.m2566("ܶۢ")) * 57;
                        i = ((iM6981 ^ i3) * (-12371)) ^ (-1712633906);
                        i2 = 1585822843;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 977911921:
                case 1052927735:
                    try {
                        RunnableC3474.m10629(c8918);
                        iM6981 = C2105.m6981("ۢܿ") ^ i4;
                        i = ((iM6981 ^ i3) * 28825) ^ 1725086666;
                        i2 = -900132846;
                        i6 = iM6981 ^ i2;
                        i5 = i;
                    } catch (Throwable th6) {
                        int iM2566 = C0630.m2566("᩷ۢ") ^ i3;
                        i6 = iM2566 ^ (-228359704);
                        obj = th6;
                        i5 = ((iM2566 ^ i4) * (-20539)) ^ 246397364;
                    }
                    break;
                case 1011464100:
                case 1841113646:
                    i7 = 0;
                    iM6981 = (C2105.m6981("۬ۛ") ^ i3) * (-19);
                    i = ((iM6981 ^ i4) * 30539) ^ (-1596246831);
                    i2 = -1367444211;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 1090392158:
                case 1453643070:
                    abstractC15440.mo27929();
                    iM6981 = C0630.m2566("۬ܰ") ^ i4;
                    i = ((iM6981 ^ i3) * 27795) ^ 665100640;
                    i2 = 1132701011;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 1461060038:
                case 1844231718:
                    if (C1711.m5736() > 0) {
                        iM6981 = C2105.m6981("᩸ᩳ") ^ i4;
                        i = ((iM6981 ^ i3) * 21505) ^ (-898182679);
                        i2 = -1226584473;
                    } else {
                        iM6981 = (C0630.m2566("ۜ֡") ^ i3) * (-91);
                        i = ((iM6981 ^ i4) * (-17135)) ^ 453471648;
                        i2 = 803504589;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 1885491823:
                case 2005370949:
                    C1128.m3851();
                    if (C4263.f13799 <= 0) {
                        iM6981 = C0630.m2566("ᩴ᩶") ^ i4;
                        i = ((iM6981 ^ i3) * 7501) ^ 1803743860;
                        i2 = 29343943;
                    } else {
                        iM6981 = (C0630.m2566("ܳ᩵") ^ i3) * (-105);
                        i = ((iM6981 ^ i4) * 26519) ^ 373514142;
                        i2 = -1589722872;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 2054595998:
                case 2142604246:
                    if (C3911.f12484 >= 0) {
                        iM6981 = C0630.m2566("᩻ᩳ") ^ i4;
                        i = ((iM6981 ^ i3) * (-16557)) ^ (-1660034643);
                        i2 = 1547427424;
                    } else {
                        iM6981 = C0630.m2566("ܺۡ") ^ i4;
                        i = ((iM6981 ^ i3) * 30361) ^ (-1416674208);
                        i2 = 1790673610;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                default:
                    if (RunnableC0588.m2441() >= 0) {
                        iM6981 = (C0630.m2566("ۜ֡") ^ i3) * (-91);
                        i = ((iM6981 ^ i4) * (-17135)) ^ 453471648;
                        i2 = 803504589;
                    } else {
                        iM6981 = C2105.m6981("֫ۡ") ^ i4;
                        i = ((iM6981 ^ i3) * 2839) ^ (-460342545);
                        i2 = 470409247;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    public C10486(C4841 c4841) {
        PackageInfo packageInfo = null;
        String str = null;
        int i = 0;
        AbstractC15440 abstractC15440M10487 = null;
        String[] strArr = null;
        InterfaceC17664 map = null;
        Object[] array = null;
        int i2 = -1767964970;
        int i3 = C1294.f4556;
        int i4 = C0422.f1886;
        int iM2566 = C0630.m2566("᩸ܺ") ^ i3;
        int i5 = ((iM2566 ^ i4) * 20681) ^ 1548713450;
        int i6 = 1331483258;
        while (true) {
            i2 = ((((i2 ^ i4) * 6797) >> 31) & i5) ^ (iM2566 ^ i6);
            switch (i2) {
                case -2025049713:
                case 1025242126:
                    InterfaceC17664 interfaceC17664Stream = C22311.stream(strArr);
                    if (ServiceConnectionC3453.f10921 < 0) {
                        map = interfaceC17664Stream.map(new C19415(1));
                        if (C3019.f9544 < 0) {
                            iM2566 = C2105.m6981("۫᩵") ^ i4;
                            i5 = ((iM2566 ^ i3) * 26657) ^ 832945980;
                            i6 = 1735081345;
                        }
                        break;
                    }
                    iM2566 = (i4 - C2105.m6981("ۨ᩶")) * 109;
                    i5 = ((iM2566 ^ i3) * 1385) ^ (-1416137976);
                    i6 = 1384595630;
                    break;
                case -1935629388:
                case -885347421:
                    if (strArr.length == 0) {
                        iM2566 = (C2105.m6981("ۛ۬") ^ i4) * (-67);
                        i5 = ((iM2566 ^ i3) * (-22673)) ^ (-1438609134);
                        i6 = 1118427687;
                    } else {
                        iM2566 = C0630.m2566("ۛۙ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-26177)) ^ 1889089805;
                        i6 = -1844209285;
                    }
                    break;
                case -1824865756:
                case 999497501:
                    str = packageInfo.applicationInfo.sourceDir;
                    if (C0237.f1507 != 0) {
                        iM2566 = C0630.m2566("ۨ۠") ^ i3;
                        i5 = ((iM2566 ^ i4) * 17517) ^ 1503777793;
                        i6 = 1488114024;
                    } else {
                        iM2566 = C0630.m2566("᩹۟") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-7171)) ^ (-1447730123);
                        i6 = -637404925;
                    }
                    break;
                case -1598255978:
                case 2139131498:
                    array = map.toArray(new C12602());
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = C0630.m2566("ۢ᩸") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-18213)) ^ (-1511353442);
                        i6 = -1473827034;
                    } else {
                        iM2566 = (i3 - C0630.m2566("۠۫")) * (-119);
                        i5 = ((iM2566 ^ i4) * (-14905)) ^ (-457179199);
                        i6 = -2004903198;
                    }
                    break;
                case -1578189561:
                case 290425036:
                    strArr = c4841.f15288.applicationInfo.splitSourceDirs;
                    if (strArr != null) {
                        iM2566 = (C0630.m2566("֡᩷") ^ i4) * 81;
                        i5 = ((iM2566 ^ i3) * (-14749)) ^ 427614643;
                        i6 = 700310148;
                    } else {
                        iM2566 = (C2105.m6981("ۛ۬") ^ i4) * (-67);
                        i5 = ((iM2566 ^ i3) * (-22673)) ^ (-1438609134);
                        i6 = 1118427687;
                    }
                    break;
                case -1194740511:
                case 1041831018:
                    abstractC15440M10487 = C3432.m10487(str, new String[i]);
                    if (C1504.f5354) {
                        iM2566 = (i4 - C2105.m6981("֫۠")) * (-33);
                        i5 = ((iM2566 ^ i3) * (-2693)) ^ (-291510259);
                        i6 = -2099792815;
                    } else {
                        iM2566 = C0630.m2566("ۛܰ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-19317)) ^ (-1056935431);
                        i6 = -878265605;
                    }
                    break;
                case -1020413239:
                case 1689180005:
                    this.f31456 = abstractC15440M10487;
                    if (C0714.f2697 >= 0) {
                        iM2566 = C2105.m6981("۬᩺") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-29079)) ^ 345390254;
                        i6 = -1921786241;
                    } else {
                        iM2566 = C0630.m2566("᩹ۙ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 25291) ^ 1858191621;
                        i6 = 249901228;
                    }
                    break;
                case -1007378767:
                case -509302019:
                    packageInfo = c4841.f15288;
                    if (C3663.f11553) {
                        iM2566 = (i4 - C2105.m6981("֫۠")) * (-33);
                        i5 = ((iM2566 ^ i3) * (-2693)) ^ (-291510259);
                        i6 = -2099792815;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ۖ۟")) * (-43);
                        i5 = ((iM2566 ^ i4) * 20357) ^ 1003125518;
                        i6 = 177530030;
                    }
                    break;
                case -918398375:
                case -831972499:
                    if (!C1005.f3721) {
                        iM2566 = C0630.m2566("ۢ᩸") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-18213)) ^ (-1511353442);
                        i6 = -1473827034;
                    } else {
                        iM2566 = (i4 - C2105.m6981("֫۠")) * (-33);
                        i5 = ((iM2566 ^ i3) * (-2693)) ^ (-291510259);
                        i6 = -2099792815;
                    }
                    break;
                case -847982383:
                case 120551131:
                    C1916.m6308();
                    if (C21923.f70183 == 0) {
                        iM2566 = C0630.m2566("ۨ۠") ^ i3;
                        i5 = ((iM2566 ^ i4) * 17517) ^ 1503777793;
                        i6 = 1488114024;
                    } else {
                        iM2566 = (i4 - C2105.m6981("֫۠")) * (-33);
                        i5 = ((iM2566 ^ i3) * (-2693)) ^ (-291510259);
                        i6 = -2099792815;
                    }
                    break;
                case -741890640:
                case 956219543:
                    this.f31458 = null;
                    return;
                case -531144813:
                case 473093713:
                    this.f31457 = -1L;
                    if (C0050.f910 >= 0) {
                        iM2566 = (i4 - C2105.m6981("֫۠")) * (-33);
                        i5 = ((iM2566 ^ i3) * (-2693)) ^ (-291510259);
                        i6 = -2099792815;
                    } else {
                        iM2566 = (C2105.m6981("ۘۗ") ^ i3) * 99;
                        i5 = ((iM2566 ^ i4) * 3879) ^ (-1572793533);
                        i6 = -1818312585;
                    }
                    break;
                case -138757189:
                case 214956496:
                    C5695.m16023();
                    C21923.m49329();
                    iM2566 = (i4 - C2105.m6981("֫۠")) * (-33);
                    i5 = ((iM2566 ^ i3) * (-2693)) ^ (-291510259);
                    i6 = -2099792815;
                    break;
                case 45572877:
                case 1259622981:
                    C2167.m7155();
                    throw new RuntimeException();
                case 477680963:
                case 601675147:
                    this.f31455 = c4841;
                    if (C3245.f10203 <= 0) {
                        iM2566 = C0630.m2566("ۢ᩸") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-18213)) ^ (-1511353442);
                        i6 = -1473827034;
                    } else {
                        iM2566 = (C2105.m6981("ۡ֡") + i4) * 17;
                        i5 = ((iM2566 ^ i3) * (-26325)) ^ (-752784942);
                        i6 = 1683580224;
                    }
                    break;
                case 578525530:
                case 1655246640:
                    C0483.m2121();
                    if (C7106.m19120() <= 0) {
                        iM2566 = (i4 - C2105.m6981("ۨ᩶")) * 109;
                        i5 = ((iM2566 ^ i3) * 1385) ^ (-1416137976);
                        i6 = 1384595630;
                    } else {
                        iM2566 = C0630.m2566("ۨ۠") ^ i3;
                        i5 = ((iM2566 ^ i4) * 17517) ^ 1503777793;
                        i6 = 1488114024;
                    }
                    break;
                case 723911106:
                case 2142214308:
                    this.f31458 = (AbstractC15440[]) array;
                    return;
                default:
                    i = 0;
                    if (C4075.f12947 >= 0) {
                        iM2566 = C2105.m6981("۬᩺") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-29079)) ^ 345390254;
                        i6 = -1921786241;
                    } else {
                        iM2566 = C2105.m6981("ܿܿ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-2583)) ^ 487443281;
                        i6 = -1608380416;
                    }
                    break;
            }
        }
    }
}
