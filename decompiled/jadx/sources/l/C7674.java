package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۟᩵ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAY9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7674 {

    /* JADX INFO: renamed from: ܿۧܽ, reason: not valid java name and contains not printable characters */
    private static final short[] f23698 = {5691, -10723, -10693, -10707, -10694, -10740, -10711, -10692, -10711, -10751, -10714, -10706, -10713, -10656, -10692, -10719, -10715, -10707, -10635, -10652, -10648, -10693, -10691, -10715, -10715, -10711, -10694, -10703, -10635, -10652, -10648, -10714, -10711, -10715, -10707, -10635, -10655, 2710, 32643, -18306, -28193, -6092, -6088, -31877, -22927, -27877, -27892, 32076, -29484, 27151, -25169, -19645, -32107, -29113, -28294};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f23699;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f23700;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f23701;

    /* JADX WARN: Code duplicated, block: B:58:0x01d9 A[PHI: r6 r7 r12 r13 r17 r19
      0x01d9: PHI (r6v5 int) = (r6v1 int), (r6v2 int), (r6v1 int) binds: [B:57:0x01d7, B:44:0x015f, B:11:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x01d9: PHI (r7v5 int) = (r7v1 int), (r7v2 int), (r7v1 int) binds: [B:57:0x01d7, B:44:0x015f, B:11:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x01d9: PHI (r12v4 int) = (r12v1 int), (r12v1 int), (r12v5 int) binds: [B:57:0x01d7, B:44:0x015f, B:11:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x01d9: PHI (r13v4 java.lang.String) = (r13v1 java.lang.String), (r13v1 java.lang.String), (r13v5 java.lang.String) binds: [B:57:0x01d7, B:44:0x015f, B:11:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x01d9: PHI (r17v26 int) = (r17v6 int), (r17v9 int), (r17v27 int) binds: [B:57:0x01d7, B:44:0x015f, B:11:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x01d9: PHI (r19v25 int) = (r19v3 int), (r19v6 int), (r19v26 int) binds: [B:57:0x01d7, B:44:0x015f, B:11:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x020e A[PHI: r4 r17 r18 r19
      0x020e: PHI (r4v4 long) = (r4v1 long), (r4v3 long), (r4v1 long) binds: [B:61:0x020c, B:48:0x0181, B:8:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x020e: PHI (r17v17 int) = (r17v5 int), (r17v8 int), (r17v19 int) binds: [B:61:0x020c, B:48:0x0181, B:8:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x020e: PHI (r18v3 char) = (r18v2 char), (r18v1 char), (r18v1 char) binds: [B:61:0x020c, B:48:0x0181, B:8:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x020e: PHI (r19v12 int) = (r19v2 int), (r19v5 int), (r19v14 int) binds: [B:61:0x020c, B:48:0x0181, B:8:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x004e, code lost:
    
        if (l.C4159.f13567 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005d, code lost:
    
        if (l.C11340.m28031() == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int hashCode() {
        int i;
        int i2;
        int iM6981;
        int i3;
        int i4;
        int iM2566;
        int i5;
        int iM2567;
        int i6;
        int i7;
        long j = 0;
        long j2 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int iM6982 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        String str = null;
        int i14 = -535743618;
        int i15 = RunnableC1937.f6483;
        int i16 = C1420.f5096;
        int iM6983 = C2105.m6981("֡ۙ") ^ i15;
        int i17 = ((iM6983 ^ i16) * 11083) ^ (-1724360588);
        int i18 = iM6983 ^ 2004192909;
        char c = 0;
        while (true) {
            i14 = i18 ^ (i17 & (((i14 ^ i16) * 14935) >> 31));
            switch (i14) {
                case -1904770018:
                case -1900847126:
                    C1047.m3599();
                    C22628.m50615();
                    i = i10;
                    i2 = i11;
                    iM6981 = (i16 - C0630.m2566("᩵ۡ")) * (-53);
                    i3 = ((iM6981 ^ i15) * 17371) ^ 1817980598;
                    i4 = -112648217;
                    int i19 = iM6981 ^ i4;
                    i11 = i2;
                    i18 = i19;
                    i17 = i3;
                    i10 = i;
                    break;
                case -1844026773:
                case 650245103:
                    i = i10;
                    i2 = i11;
                    i8 = (int) j2;
                    i9 = 31;
                    if (RunnableC1937.m6387() != 0) {
                        iM6981 = (i16 - C0630.m2566("᩵ۡ")) * (-53);
                        i3 = ((iM6981 ^ i15) * 17371) ^ 1817980598;
                        i4 = -112648217;
                    } else {
                        iM6981 = C0630.m2566("ۙᩴ") ^ i16;
                        i3 = ((iM6981 ^ i15) * (-3867)) ^ (-1461482947);
                        i4 = 1042136850;
                    }
                    int i110 = iM6981 ^ i4;
                    i11 = i2;
                    i18 = i110;
                    i17 = i3;
                    i10 = i;
                    break;
                case -1767713716:
                case -993547257:
                    i = i10;
                    i2 = i11;
                    j2 = (j >>> c) ^ j;
                    if (C11340.f33930 >= 0) {
                        iM6981 = (C2105.m6981("ۚۢ") ^ i16) * (-9);
                        i3 = ((iM6981 ^ i15) * 28819) ^ 94449354;
                        i4 = 981411822;
                    } else {
                        iM6981 = (i15 - C0630.m2566("۠᩷")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i3 = ((iM6981 ^ i16) * (-32399)) ^ (-198682723);
                        i4 = 1738806098;
                    }
                    int i111 = iM6981 ^ i4;
                    i11 = i2;
                    i18 = i111;
                    i17 = i3;
                    i10 = i;
                    break;
                case -1579227885:
                case 1998732413:
                    i = i10;
                    i2 = i11;
                    iM6982 = C2105.m6981(this.f23700);
                    if (C7106.m19120() <= 0) {
                        iM6981 = C2105.m6981("᩹ۚ") ^ i15;
                        i3 = ((iM6981 ^ i16) * (-28895)) ^ (-1951072653);
                        i4 = 1841235395;
                    } else {
                        iM6981 = (C2105.m6981("ۗۗ") ^ i16) * 63;
                        i3 = ((iM6981 ^ i15) * (-5795)) ^ (-1630314002);
                        i4 = 1951883891;
                    }
                    int i112 = iM6981 ^ i4;
                    i11 = i2;
                    i18 = i112;
                    i17 = i3;
                    i10 = i;
                    break;
                case -1483022422:
                case 989017418:
                    C1047.m3599();
                    break;
                case -1466266839:
                case 17686860:
                    i13 = i11 * i12;
                    str = this.f23699;
                    if (C1294.f4556 < 0) {
                        iM2567 = C2105.m6981("᩶᩷") ^ i15;
                        i2 = i11;
                        i6 = ((iM2567 ^ i16) * (-29969)) ^ 457982202;
                        i7 = -19839509;
                        int i20 = i2;
                        i18 = iM2567 ^ i7;
                        i17 = i6;
                        i11 = i20;
                    } else {
                        i = i10;
                        i2 = i11;
                        iM6981 = (i16 - C0630.m2566("᩵ۡ")) * (-53);
                        i3 = ((iM6981 ^ i15) * 17371) ^ 1817980598;
                        i4 = -112648217;
                        int i113 = iM6981 ^ i4;
                        i11 = i2;
                        i18 = i113;
                        i17 = i3;
                        i10 = i;
                    }
                    break;
                case -1242954119:
                case 2111277629:
                    i2 = i11;
                    i10 = i8 * i9;
                    if (C1773.m5908() <= 0) {
                        iM2567 = (C0630.m2566("ۛ᩻") ^ i16) * (-121);
                        i6 = ((iM2567 ^ i15) * (-5367)) ^ 1261926368;
                        i7 = 314883355;
                    } else {
                        iM2567 = C0630.m2566("֨ᩴ") ^ i15;
                        i6 = ((iM2567 ^ i16) * 3381) ^ 1961528308;
                        i7 = -423548261;
                    }
                    int i21 = i2;
                    i18 = iM2567 ^ i7;
                    i17 = i6;
                    i11 = i21;
                    break;
                case -1017604501:
                case 1865536512:
                    return C2105.m6981(str) + i13;
                case -622773761:
                case 387194463:
                    i11 = iM6982 + i10;
                    if (C3911.f12484 >= 0) {
                        i = i10;
                        iM2566 = C2105.m6981("᩵᩺") ^ i15;
                        i3 = ((iM2566 ^ i16) * (-18337)) ^ 404567025;
                        i5 = 525586021;
                    } else {
                        iM2566 = C0630.m2566("֡ۡ") ^ i15;
                        i = i10;
                        i3 = ((iM2566 ^ i16) * (-15113)) ^ (-376595128);
                        i5 = 2140686949;
                    }
                    i18 = iM2566 ^ i5;
                    i17 = i3;
                    i10 = i;
                    break;
                case -596144684:
                case 254452220:
                    i = i10;
                    i2 = i11;
                    j = this.f23701;
                    if (C0237.f1507 == 0) {
                        iM6981 = C0630.m2566("۫ܳ") ^ i16;
                        i3 = ((iM6981 ^ i15) * (-14829)) ^ 1334401257;
                        i4 = -714550672;
                        int i114 = iM6981 ^ i4;
                        i11 = i2;
                        i18 = i114;
                        i17 = i3;
                        i10 = i;
                    } else {
                        i11 = i2;
                        iM2566 = C2105.m6981("᩵᩺") ^ i15;
                        i3 = ((iM2566 ^ i16) * (-18337)) ^ 404567025;
                        i5 = 525586021;
                        i18 = iM2566 ^ i5;
                        i17 = i3;
                        i10 = i;
                    }
                    break;
                case -426318593:
                case -323584791:
                    i = i10;
                    i2 = i11;
                    c = ' ';
                    if (C22628.f73083 <= 0) {
                        iM6981 = (C2105.m6981("ۚۢ") ^ i16) * (-9);
                        i3 = ((iM6981 ^ i15) * 28819) ^ 94449354;
                        i4 = 981411822;
                    } else {
                        iM6981 = C2105.m6981("۠ۘ") ^ i16;
                        i3 = ((iM6981 ^ i15) * (-25605)) ^ (-1612890004);
                        i4 = -1523388074;
                    }
                    int i115 = iM6981 ^ i4;
                    i11 = i2;
                    i18 = i115;
                    i17 = i3;
                    i10 = i;
                    break;
                case -419892934:
                case -254608652:
                    i = i10;
                    i2 = i11;
                    if (C0382.f1805) {
                        iM6981 = (C0630.m2566("۠֡") + i15) * (-17);
                        i3 = ((iM6981 ^ i16) * (-21093)) ^ (-1400000829);
                        i4 = -1816646991;
                    } else {
                        iM6981 = (i16 - C0630.m2566("᩵ۡ")) * (-53);
                        i3 = ((iM6981 ^ i15) * 17371) ^ 1817980598;
                        i4 = -112648217;
                    }
                    int i116 = iM6981 ^ i4;
                    i11 = i2;
                    i18 = i116;
                    i17 = i3;
                    i10 = i;
                    break;
                case -293920721:
                case 125577301:
                    i2 = i11;
                    i12 = 31;
                    if (ServiceConnectionC3453.f10921 < 0) {
                        iM2567 = C2105.m6981("ܿۚ") ^ i16;
                        i6 = ((iM2567 ^ i15) * (-19209)) ^ (-10801802);
                        i7 = -347031610;
                        int i22 = i2;
                        i18 = iM2567 ^ i7;
                        i17 = i6;
                        i11 = i22;
                    } else {
                        i = i10;
                        iM6981 = C2105.m6981("᩹ۚ") ^ i15;
                        i3 = ((iM6981 ^ i16) * (-28895)) ^ (-1951072653);
                        i4 = 1841235395;
                        int i117 = iM6981 ^ i4;
                        i11 = i2;
                        i18 = i117;
                        i17 = i3;
                        i10 = i;
                    }
                    break;
                case -60825240:
                case 107759364:
                    C2958.m9034();
                    break;
                case 249748543:
                case 1039854479:
                    C4159.m12565();
                    AbstractC2021.m6574();
                    return 0;
                default:
                    if (RunnableC0588.f2309 < 0) {
                        i = i10;
                        i2 = i11;
                        iM6981 = (C2105.m6981("ۚۢ") ^ i16) * (-9);
                        i3 = ((iM6981 ^ i15) * 28819) ^ 94449354;
                        i4 = 981411822;
                        int i118 = iM6981 ^ i4;
                        i11 = i2;
                        i18 = i118;
                        i17 = i3;
                        i10 = i;
                    }
                    i = i10;
                    i2 = i11;
                    iM6981 = C2105.m6981("᩹ۚ") ^ i15;
                    i3 = ((iM6981 ^ i16) * (-28895)) ^ (-1951072653);
                    i4 = 1841235395;
                    int i119 = iM6981 ^ i4;
                    i11 = i2;
                    i18 = i119;
                    i17 = i3;
                    i10 = i;
                    break;
            }
        }
    }

    public C7674(long j, String str, ArrayList arrayList) {
        int i = -1725845853;
        int i2 = AbstractC2021.f6743;
        int i3 = C4075.f12947;
        int iM2566 = (C0630.m2566("֨ܽ") ^ i3) * 45;
        int i4 = ((iM2566 ^ i2) * 28175) ^ (-1144330578);
        int i5 = 770944035;
        while (true) {
            i = ((((i ^ i2) * 7929) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2145032259:
                case 1833414906:
                    C1916.m6308();
                    throw new RuntimeException();
                case -2117398525:
                case 1030477873:
                    this.f23699 = str;
                    return;
                case -1981903823:
                case -1882785358:
                    if (C0798.f2919) {
                        iM2566 = C0630.m2566("ۖۙ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-11645)) ^ 1989171096;
                        i5 = 174882728;
                    } else {
                        iM2566 = (i3 - C2105.m6981("۫ۨ")) * (-45);
                        i4 = ((iM2566 ^ i2) * 15079) ^ 13423026;
                        i5 = -1397201281;
                    }
                    break;
                case -1893443399:
                case -710984282:
                    if (C2167.f7158 >= 0) {
                        iM2566 = C0630.m2566("ۖۙ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-11645)) ^ 1989171096;
                        i5 = 174882728;
                    } else {
                        iM2566 = C0630.m2566("᩶᩶") ^ i3;
                        i4 = ((iM2566 ^ i2) * 15405) ^ (-1013352777);
                        i5 = -780824297;
                    }
                    break;
                case -1854622536:
                case 1556490984:
                    if (C1773.f6144 > 0) {
                        iM2566 = (C2105.m6981("ܽ᩸") + i2) * 53;
                        i4 = ((iM2566 ^ i3) * (-27609)) ^ 1193738169;
                        i5 = -1377400111;
                    } else {
                        iM2566 = (C2105.m6981("ۗ᩷") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM2566 ^ i2) * 28441) ^ (-1939205964);
                        i5 = 1562461397;
                    }
                    break;
                case -1686723950:
                case 669759399:
                    if (C4263.f13799 <= 0) {
                        iM2566 = (C2105.m6981("ܽ᩸") + i2) * 53;
                        i4 = ((iM2566 ^ i3) * (-27609)) ^ 1193738169;
                        i5 = -1377400111;
                    } else {
                        iM2566 = (i2 - C2105.m6981("۟ۖ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM2566 ^ i3) * (-9821)) ^ 1811360939;
                        i5 = -1797931981;
                    }
                    break;
                case -1533239266:
                case 728870722:
                    if (C3537.m10746() <= 0) {
                        iM2566 = (C2105.m6981("ۗ᩷") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM2566 ^ i2) * 28441) ^ (-1939205964);
                        i5 = 1562461397;
                    } else {
                        iM2566 = (i3 - C0630.m2566("۟ܽ")) * (-125);
                        i4 = ((iM2566 ^ i2) * 28683) ^ 128299642;
                        i5 = 1276666985;
                    }
                    break;
                case -1228071649:
                case 522948682:
                    if (C21923.f70183 == 0) {
                        iM2566 = C0630.m2566("ۖۙ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-11645)) ^ 1989171096;
                        i5 = 174882728;
                    } else {
                        iM2566 = (C2105.m6981("ܽ᩸") + i2) * 53;
                        i4 = ((iM2566 ^ i3) * (-27609)) ^ 1193738169;
                        i5 = -1377400111;
                    }
                    break;
                case -1109854318:
                case -705706838:
                    this.f23701 = j;
                    this.f23700 = arrayList;
                    if (C1294.f4556 >= 0) {
                        iM2566 = (C0630.m2566("᩵ܽ") + i3) * 45;
                        i4 = ((iM2566 ^ i2) * 26647) ^ 1938701264;
                        i5 = 1314818399;
                    } else {
                        iM2566 = (C0630.m2566("᩺ܽ") ^ i3) * 65;
                        i4 = ((iM2566 ^ i2) * 3111) ^ 38402083;
                        i5 = -2086899278;
                    }
                    break;
                case -914461592:
                case -734137633:
                    if (C2520.f8000 >= 0) {
                        iM2566 = C0630.m2566("ۖۙ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-11645)) ^ 1989171096;
                        i5 = 174882728;
                    } else {
                        iM2566 = (C0630.m2566("᩷᩷") + i3) * (-77);
                        i4 = ((iM2566 ^ i2) * 31067) ^ 1090378213;
                        i5 = -1607826055;
                    }
                    break;
                case -143876554:
                case 1894708989:
                    C4075.m12263();
                    if (C0714.f2697 < 0) {
                        iM2566 = (C0630.m2566("᩵ܽ") + i3) * 45;
                        i4 = ((iM2566 ^ i2) * 26647) ^ 1938701264;
                        i5 = 1314818399;
                    } else {
                        iM2566 = C0630.m2566("ۖۙ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-11645)) ^ 1989171096;
                        i5 = 174882728;
                    }
                    break;
                case 454860194:
                case 503305513:
                    if (C0714.f2697 >= 0) {
                        iM2566 = C0630.m2566("ۖۙ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-11645)) ^ 1989171096;
                        i5 = 174882728;
                    } else {
                        iM2566 = C2105.m6981("ۘ۫") ^ i2;
                        i4 = ((iM2566 ^ i3) * 11463) ^ (-1613864985);
                        i5 = -645002199;
                    }
                    break;
                case 948555420:
                case 1550135207:
                    C11340.m28031();
                    C1916.m6308();
                    iM2566 = (C2105.m6981("ۗ᩷") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i4 = ((iM2566 ^ i2) * 28441) ^ (-1939205964);
                    i5 = 1562461397;
                    break;
                case 1381124989:
                case 1538682321:
                    if (C22628.f73083 <= 0) {
                        iM2566 = C2105.m6981("ۘܺ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 19493) ^ 1592362486;
                        i5 = 642032156;
                    } else {
                        iM2566 = (C0630.m2566("ۘᩴ") + i2) * (-67);
                        i4 = ((iM2566 ^ i3) * (-19387)) ^ 1029500885;
                        i5 = 1819682258;
                    }
                    break;
                case 1474530318:
                case 1650936572:
                    if (C0630.f2410 <= 0) {
                        iM2566 = (C0630.m2566("᩵ܽ") + i3) * 45;
                        i4 = ((iM2566 ^ i2) * 26647) ^ 1938701264;
                        i5 = 1314818399;
                    } else {
                        iM2566 = (C0630.m2566("ۗ᩸") + i2) * 73;
                        i4 = ((iM2566 ^ i3) * (-2715)) ^ (-1860652817);
                        i5 = 958404246;
                    }
                    break;
                default:
                    if (C1916.m6308() >= 0) {
                        iM2566 = (C2105.m6981("ܽ᩸") + i2) * 53;
                        i4 = ((iM2566 ^ i3) * (-27609)) ^ 1193738169;
                        i5 = -1377400111;
                    } else {
                        iM2566 = C2105.m6981("ۜۙ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 28563) ^ (-1811748832);
                        i5 = 21616880;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m20528() {
        return this.f23699;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m20529() {
        return this.f23700;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m20531() {
        return this.f23701;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b1 A[PHI: r4
      0x00b1: PHI (r4v3 java.lang.String) = (r4v2 java.lang.String), (r4v1 java.lang.String), (r4v1 java.lang.String) binds: [B:27:0x00af, B:12:0x0066, B:9:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00ec A[PHI: r6 r7 r8 r14 r15
      0x00ec: PHI (r6v4 short[]) = (r6v2 short[]), (r6v3 short[]), (r6v2 short[]), (r6v2 short[]) binds: [B:31:0x00ea, B:23:0x008f, B:17:0x0070, B:15:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x00ec: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:31:0x00ea, B:23:0x008f, B:17:0x0070, B:15:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x00ec: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:31:0x00ea, B:23:0x008f, B:17:0x0070, B:15:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x00ec: PHI (r14v3 short[]) = (r14v2 short[]), (r14v1 short[]), (r14v1 short[]), (r14v1 short[]) binds: [B:31:0x00ea, B:23:0x008f, B:17:0x0070, B:15:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x00ec: PHI (r15v3 int) = (r15v2 int), (r15v1 int), (r15v1 int), (r15v1 int) binds: [B:31:0x00ea, B:23:0x008f, B:17:0x0070, B:15:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x013d A[PHI: r11 r12 r13
      0x013d: PHI (r11v3 short[]) = (r11v2 short[]), (r11v1 short[]) binds: [B:36:0x013b, B:9:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x013d: PHI (r12v3 int) = (r12v2 int), (r12v1 int) binds: [B:36:0x013b, B:9:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x013d: PHI (r13v3 int) = (r13v2 int), (r13v1 int) binds: [B:36:0x013b, B:9:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0259 A[PHI: r2 r5 r16 r17 r18 r23 r24
      0x0259: PHI (r2v3 long) = (r2v1 long), (r2v1 long), (r2v1 long), (r2v1 long), (r2v1 long), (r2v5 long) binds: [B:62:0x0257, B:58:0x0238, B:54:0x0219, B:15:0x006c, B:12:0x0066, B:43:0x019e] A[DONT_GENERATE, DONT_INLINE]
      0x0259: PHI (r5v3 java.lang.StringBuilder) = 
      (r5v2 java.lang.StringBuilder)
      (r5v2 java.lang.StringBuilder)
      (r5v2 java.lang.StringBuilder)
      (r5v2 java.lang.StringBuilder)
      (r5v2 java.lang.StringBuilder)
      (r5v4 java.lang.StringBuilder)
     binds: [B:62:0x0257, B:58:0x0238, B:54:0x0219, B:15:0x006c, B:12:0x0066, B:43:0x019e] A[DONT_GENERATE, DONT_INLINE]
      0x0259: PHI (r16v4 int) = (r16v2 int), (r16v3 int), (r16v2 int), (r16v2 int), (r16v2 int), (r16v2 int) binds: [B:62:0x0257, B:58:0x0238, B:54:0x0219, B:15:0x006c, B:12:0x0066, B:43:0x019e] A[DONT_GENERATE, DONT_INLINE]
      0x0259: PHI (r17v4 int) = (r17v2 int), (r17v3 int), (r17v2 int), (r17v2 int), (r17v2 int), (r17v2 int) binds: [B:62:0x0257, B:58:0x0238, B:54:0x0219, B:15:0x006c, B:12:0x0066, B:43:0x019e] A[DONT_GENERATE, DONT_INLINE]
      0x0259: PHI (r18v4 int) = (r18v2 int), (r18v2 int), (r18v3 int), (r18v2 int), (r18v2 int), (r18v2 int) binds: [B:62:0x0257, B:58:0x0238, B:54:0x0219, B:15:0x006c, B:12:0x0066, B:43:0x019e] A[DONT_GENERATE, DONT_INLINE]
      0x0259: PHI (r23v5 short) = (r23v4 short), (r23v3 short), (r23v3 short), (r23v3 short), (r23v3 short), (r23v3 short) binds: [B:62:0x0257, B:58:0x0238, B:54:0x0219, B:15:0x006c, B:12:0x0066, B:43:0x019e] A[DONT_GENERATE, DONT_INLINE]
      0x0259: PHI (r24v3 short) = (r24v1 short), (r24v1 short), (r24v2 short), (r24v1 short), (r24v1 short), (r24v1 short) binds: [B:62:0x0257, B:58:0x0238, B:54:0x0219, B:15:0x006c, B:12:0x0066, B:43:0x019e] A[DONT_GENERATE, DONT_INLINE]] */
    public final String toString() {
        int iM2566;
        int i;
        int i2;
        long j = 0;
        String strM10748 = null;
        int i3 = 0;
        short[] sArr = null;
        int i4 = 0;
        int i5 = 0;
        short[] sArr2 = null;
        int i6 = 0;
        int i7 = -1037217923;
        int i8 = C1047.f3863;
        int i9 = C3245.f10203;
        int iM2567 = (C0630.m2566("۠֡") ^ i9) * (-113);
        int i10 = ((iM2567 ^ i8) * (-13239)) ^ (-1386366596);
        int i11 = iM2567 ^ (-1925368360);
        short[] sArr3 = null;
        StringBuilder sb = null;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        short s = 0;
        short s2 = 0;
        while (true) {
            i7 = i11 ^ (i10 & (((i7 ^ i8) * (-18675)) >> 31));
            switch (i7) {
                case -2138394548:
                case -1661631049:
                    int i17 = s + s2;
                    if ((i17 * i17) - i16 > 0) {
                        iM2566 = C0630.m2566("֫ۧ") ^ i8;
                        i = ((iM2566 ^ i9) * (-19699)) ^ 492072199;
                        i2 = -1254689150;
                    } else {
                        iM2566 = C0630.m2566("᩶۟") ^ i9;
                        i = ((iM2566 ^ i8) * 23463) ^ 1047164693;
                        i2 = -1210992484;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -2078203167:
                case -245026446:
                    strM10748 = C3537.m10748(sArr2, i6, 7, i3);
                    if (C4159.f13567) {
                        iM2566 = (C0630.m2566("۠ۤ") + i8) * (-101);
                        i = ((iM2566 ^ i9) * (-26259)) ^ (-637142719);
                        i2 = -87696382;
                    } else {
                        iM2566 = C2105.m6981("ۨۙ") ^ i8;
                        i = ((iM2566 ^ i9) * (-12303)) ^ 707826258;
                        i2 = -917109098;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -1783899171:
                case -1356762928:
                    i3 = 54856;
                    iM2566 = (C2105.m6981("ۛۢ") + i9) * (-13);
                    i = ((iM2566 ^ i8) * (-15547)) ^ 25818129;
                    i2 = -277509252;
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -1674789184:
                case 28713663:
                    int i18 = i14 + i15;
                    i16 = i18 + i18;
                    s2 = 12326;
                    if (C1773.f6144 <= 0) {
                        iM2566 = C0630.m2566("ܺܶ") ^ i8;
                        i = ((iM2566 ^ i9) * 16775) ^ (-1598250607);
                        i2 = -159686692;
                    } else {
                        iM2566 = C0630.m2566("֨᩸") ^ i8;
                        i = ((iM2566 ^ i9) * 22847) ^ (-2107671148);
                        i2 = 294471950;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -1460825305:
                case 1358944648:
                    if (C1294.f4556 >= 0) {
                        iM2566 = C2105.m6981("ۨۙ") ^ i8;
                        i = ((iM2566 ^ i9) * (-12303)) ^ 707826258;
                        i2 = -917109098;
                    } else {
                        iM2566 = (C0630.m2566("ۗ᩺") ^ i9) * (-93);
                        i = ((iM2566 ^ i8) * 32463) ^ (-983532853);
                        i2 = 2012899713;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -1258007139:
                case -1081652544:
                    C2520.m8026();
                    C4159.m12565();
                    return null;
                case -1131091596:
                case -792799999:
                    short[] sArr4 = f23698;
                    if (!C0382.m1848()) {
                        sb = new StringBuilder(C5695.m16034(sArr4, 1, 18, i3));
                        j = this.f23701;
                        if (C4263.f13799 <= 0) {
                            iM2566 = C0630.m2566("ܺܶ") ^ i8;
                            i = ((iM2566 ^ i9) * 16775) ^ (-1598250607);
                            i2 = -159686692;
                        } else {
                            iM2566 = (C2105.m6981("ܰ۫") + i9) * (-77);
                            i = ((iM2566 ^ i8) * 10089) ^ 359868155;
                            i2 = -1143742227;
                        }
                        i11 = iM2566 ^ i2;
                        i10 = i;
                    } else {
                        int iM6981 = C2105.m6981("ۚۗ") ^ i8;
                        i11 = iM6981 ^ (-578353188);
                        i10 = ((iM6981 ^ i9) * 4529) ^ (-505052717);
                        sb = null;
                    }
                    break;
                case -904434115:
                case 1163945663:
                    s = f23698[0];
                    if (C1916.f6442) {
                        iM2566 = C0630.m2566("ۘ᩸") ^ i9;
                        i = ((iM2566 ^ i8) * 22235) ^ (-1836577506);
                        i2 = 150409346;
                    } else {
                        iM2566 = C0630.m2566("ܺܶ") ^ i8;
                        i = ((iM2566 ^ i9) * 16775) ^ (-1598250607);
                        i2 = -159686692;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -848649993:
                case -712322051:
                    sArr3 = f23698;
                    i12 = 36;
                    i13 = 1;
                    if (C1711.f5919) {
                        iM2566 = (C2105.m6981("ۢۨ") + i9) * 45;
                        i = ((iM2566 ^ i8) * (-12043)) ^ (-987297706);
                        i2 = -1166076149;
                    } else {
                        iM2566 = C2105.m6981("᩻ۧ") ^ i9;
                        i = ((iM2566 ^ i8) * 25279) ^ 1430801824;
                        i2 = 1339866221;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case -255169553:
                case 713991754:
                    i14 = s * s;
                    i15 = 151930276;
                    if (C1773.f6144 <= 0) {
                        iM2566 = C0630.m2566("ܺܶ") ^ i8;
                        i = ((iM2566 ^ i9) * 16775) ^ (-1598250607);
                        i2 = -159686692;
                    } else {
                        iM2566 = C0630.m2566("᩻ܶ") ^ i8;
                        i = ((iM2566 ^ i9) * 14585) ^ 588561973;
                        i2 = -1932715059;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case 238216480:
                case 1977435987:
                    if (ServiceConnectionC3453.m10564() > 0) {
                        iM2566 = C0630.m2566("ܺܶ") ^ i8;
                        i = ((iM2566 ^ i9) * 16775) ^ (-1598250607);
                        i2 = -159686692;
                    } else {
                        iM2566 = C2105.m6981("ۨۙ") ^ i8;
                        i = ((iM2566 ^ i9) * (-12303)) ^ 707826258;
                        i2 = -917109098;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case 412233644:
                case 1143922446:
                    if (C3663.f11553) {
                        iM2566 = C0630.m2566("ܺܶ") ^ i8;
                        i = ((iM2566 ^ i9) * 16775) ^ (-1598250607);
                        i2 = -159686692;
                    } else {
                        iM2566 = (C2105.m6981("ۢۨ") + i9) * 45;
                        i = ((iM2566 ^ i8) * (-12043)) ^ (-987297706);
                        i2 = -1166076149;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case 451456916:
                case 1752848895:
                    C4117.m12352(sb, j);
                    sArr = f23698;
                    i4 = 19;
                    i5 = 10;
                    if (C4075.f12947 >= 0) {
                        iM2566 = (C0630.m2566("ۗ᩺") ^ i9) * (-93);
                        i = ((iM2566 ^ i8) * 32463) ^ (-983532853);
                        i2 = 2012899713;
                    } else {
                        iM2566 = (i8 - C2105.m6981("ܽ᩷")) * (-81);
                        i = ((iM2566 ^ i9) * 2227) ^ 1531970061;
                        i2 = -823284827;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case 490522730:
                case 1241000602:
                    C1128.m3845(sb, this.f23700);
                    sArr2 = f23698;
                    i6 = 29;
                    if (C7811.f24123 >= 0) {
                        iM2566 = (C2105.m6981("ۢۨ") + i9) * 45;
                        i = ((iM2566 ^ i8) * (-12043)) ^ (-987297706);
                        i2 = -1166076149;
                    } else {
                        iM2566 = C0630.m2566("᩻ۚ") ^ i8;
                        i = ((iM2566 ^ i9) * 27249) ^ 1272845901;
                        i2 = 2082344868;
                    }
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case 944653687:
                case 1780520329:
                    i3 = 14717;
                    iM2566 = (C2105.m6981("ۛۢ") + i9) * (-13);
                    i = ((iM2566 ^ i8) * (-15547)) ^ 25818129;
                    i2 = -277509252;
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                case 1187757722:
                case 1839652809:
                    return C23202.m51498(sb, strM10748, this.f23699, C0964.m3396(sArr3, i12, i13, i3));
                case 1636675379:
                case 2063842697:
                    C3245.m9925();
                    iM2566 = (C2105.m6981("ۢۨ") + i9) * 45;
                    i = ((iM2566 ^ i8) * (-12043)) ^ (-987297706);
                    i2 = -1166076149;
                    i11 = iM2566 ^ i2;
                    i10 = i;
                    break;
                default:
                    C3245.m9923(sb, C0382.m1840(sArr, i4, i5, i3));
                    if (C4117.f13076 > 0) {
                        iM2566 = C0630.m2566("ۨ۬") ^ i9;
                        i = ((iM2566 ^ i8) * (-24135)) ^ (-1118352787);
                        i2 = 1061506310;
                        i11 = iM2566 ^ i2;
                        i10 = i;
                    } else {
                        int iM6982 = C2105.m6981("ۚۗ") ^ i8;
                        i11 = iM6982 ^ (-578353188);
                        i10 = ((iM6982 ^ i9) * 4529) ^ (-505052717);
                        sb = null;
                    }
                    break;
            }
        }
    }

    public final boolean equals(Object obj) {
        C7674 c7674 = null;
        long j = 0;
        int i = 667158510;
        int i2 = AbstractC2021.f6743;
        int i3 = C4075.f12947;
        int iM6981 = (i2 - C2105.m6981("֨ۙ")) * (-83);
        int i4 = ((iM6981 ^ i3) * 11417) ^ 1049344454;
        int i5 = -1832859449;
        while (true) {
            i = ((((i ^ i3) * (-12143)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2136371642:
                case -328465754:
                    if (C1047.m3599() >= 0) {
                        iM6981 = C2105.m6981("᩺֫") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-22187)) ^ 1773362778;
                        i5 = 371252378;
                    } else {
                        iM6981 = (C2105.m6981("᩺᩸") + i3) * 75;
                        i4 = ((iM6981 ^ i2) * 25985) ^ 845779128;
                        i5 = 900568814;
                    }
                    break;
                case -2133309046:
                case 1602210506:
                    if (C5695.f17556 >= 0) {
                        iM6981 = C0630.m2566("᩺᩹") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-27561)) ^ 897882242;
                        i5 = -162872680;
                    } else {
                        iM6981 = C0630.m2566("۟ۧ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 17045) ^ 123853996;
                        i5 = -1361702167;
                    }
                    break;
                case -2035302826:
                case -212142154:
                    if (C3019.f9544 >= 0) {
                        iM6981 = C2105.m6981("᩻֨") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-17375)) ^ 1083119132;
                        i5 = 1205280757;
                    } else {
                        iM6981 = C0630.m2566("۬᩶") ^ i3;
                        i4 = ((iM6981 ^ i2) * 15415) ^ (-98771521);
                        i5 = -1412973277;
                    }
                    break;
                case -1758715435:
                case -924826646:
                    return false;
                case -1748885179:
                case -612730850:
                    if (obj instanceof C7674) {
                        iM6981 = C0630.m2566("ۜ֡") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-24259)) ^ (-13469261);
                        i5 = 172279493;
                    } else {
                        iM6981 = C0630.m2566("۬ܺ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 29515) ^ (-305735272);
                        i5 = -1048153192;
                    }
                    break;
                case -1718601477:
                case -1389046076:
                    if (C4117.f13076 > 0) {
                        iM6981 = C2105.m6981("᩻֨") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-17375)) ^ 1083119132;
                        i5 = 1205280757;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ۙ᩸")) * (-127);
                        i4 = ((iM6981 ^ i2) * 435) ^ 695695046;
                        i5 = -1733959740;
                    }
                    break;
                case -1569364439:
                case 597450225:
                    if (C22628.f73083 <= 0) {
                        iM6981 = C2105.m6981("᩺֫") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-22187)) ^ 1773362778;
                        i5 = 371252378;
                    } else {
                        iM6981 = C2105.m6981("ܺۚ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 4273) ^ 926169716;
                        i5 = 537326832;
                    }
                    break;
                case -1546231943:
                case -1277136850:
                    if (C1711.f5919) {
                        iM6981 = C2105.m6981("᩻֨") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-17375)) ^ 1083119132;
                        i5 = 1205280757;
                    } else {
                        iM6981 = C0630.m2566("ۛۡ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 15233) ^ (-2021803171);
                        i5 = -804918605;
                    }
                    break;
                case -1460503973:
                case 665215605:
                    if (C3683.f11629 >= 0) {
                        iM6981 = C2105.m6981("᩺֫") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-22187)) ^ 1773362778;
                        i5 = 371252378;
                    } else {
                        iM6981 = (C2105.m6981("ۨ۬") + i3) * 83;
                        i4 = ((iM6981 ^ i2) * 17361) ^ 1876437053;
                        i5 = -2026277075;
                    }
                    break;
                case -1292433799:
                case 1225358531:
                    if (j != c7674.f23701) {
                        iM6981 = C0630.m2566("۬ܺ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 29515) ^ (-305735272);
                        i5 = -1048153192;
                    } else {
                        iM6981 = (C2105.m6981("ܽ۫") + i2) * (-69);
                        i4 = ((iM6981 ^ i3) * 10007) ^ (-1179644391);
                        i5 = 1476597075;
                    }
                    break;
                case -1203504299:
                case -972298340:
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        iM6981 = C0630.m2566("᩺᩹") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-27561)) ^ 897882242;
                        i5 = -162872680;
                    } else {
                        iM6981 = (C0630.m2566("ۙ֨") ^ i3) * 47;
                        i4 = ((iM6981 ^ i2) * 27193) ^ 443123722;
                        i5 = 1470499027;
                    }
                    break;
                case -1174664000:
                case 1082747240:
                    RunnableC1937.m6387();
                    if (C4117.f13076 > 0) {
                        iM6981 = C0630.m2566("᩺᩹") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-27561)) ^ 897882242;
                        i5 = -162872680;
                    } else {
                        iM6981 = C2105.m6981("᩻֨") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-17375)) ^ 1083119132;
                        i5 = 1205280757;
                    }
                    break;
                case -1007859363:
                case 2108332213:
                    ViewOnClickListenerC1958.m6429();
                    return false;
                case -126073214:
                case 158870785:
                    if (C7106.f21815 != 0) {
                        iM6981 = C0630.m2566("֫ۧ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-26433)) ^ 1777891910;
                        i5 = -73469989;
                    } else {
                        iM6981 = (C2105.m6981("ܿۧ") + i2) * 87;
                        i4 = ((iM6981 ^ i3) * 29521) ^ (-495031333);
                        i5 = -591982874;
                    }
                    break;
                case -70521608:
                case 818447796:
                    if (C1294.m4369(this.f23700, c7674.f23700)) {
                        iM6981 = (i3 - C0630.m2566("᩺᩷")) * (-25);
                        i4 = ((iM6981 ^ i2) * (-32631)) ^ (-599613084);
                        i5 = -1104851711;
                    } else {
                        iM6981 = C0630.m2566("۬ܺ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 29515) ^ (-305735272);
                        i5 = -1048153192;
                    }
                    break;
                case 293513979:
                case 412081009:
                    C0050.m940();
                    iM6981 = (i3 - C2105.m6981("ۙ᩸")) * (-127);
                    i4 = ((iM6981 ^ i2) * 435) ^ 695695046;
                    i5 = -1733959740;
                    break;
                case 422401357:
                case 690145791:
                    return true;
                case 532216833:
                case 2115148927:
                    if (C22628.f73083 <= 0) {
                        iM6981 = C0630.m2566("֫ۧ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-26433)) ^ 1777891910;
                        i5 = -73469989;
                    } else {
                        iM6981 = C2105.m6981("᩻֨") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-17375)) ^ 1083119132;
                        i5 = 1205280757;
                    }
                    break;
                case 736714249:
                case 1949188781:
                    if (this == obj) {
                        iM6981 = (C2105.m6981("۠᩺") ^ i3) * (-105);
                        i4 = ((iM6981 ^ i2) * 29683) ^ 1105454533;
                        i5 = 996572945;
                    } else {
                        iM6981 = C2105.m6981("ܳۘ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-11273)) ^ (-462764567);
                        i5 = 1394708419;
                    }
                    break;
                case 887813014:
                case 1559139075:
                    c7674 = (C7674) obj;
                    j = this.f23701;
                    if (C1916.f6442) {
                        iM6981 = C0630.m2566("ۤۛ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 10933) ^ 626601547;
                        i5 = 1002159489;
                    } else {
                        iM6981 = C0630.m2566("᩺᩹") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-27561)) ^ 897882242;
                        i5 = -162872680;
                    }
                    break;
                case 1991024019:
                case 2098761388:
                    if (C1711.f5919) {
                        iM6981 = C0630.m2566("᩺᩹") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-27561)) ^ 897882242;
                        i5 = -162872680;
                    } else {
                        iM6981 = C0630.m2566("᩸۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * 32549) ^ (-170972852);
                        i5 = -704628062;
                    }
                    break;
                default:
                    if (!C1294.m4369(this.f23699, c7674.f23699)) {
                        iM6981 = C0630.m2566("۬ܺ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 29515) ^ (-305735272);
                        i5 = -1048153192;
                    } else {
                        iM6981 = (C2105.m6981("۠᩺") ^ i3) * (-105);
                        i4 = ((iM6981 ^ i2) * 29683) ^ 1105454533;
                        i5 = 996572945;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:127:0x056c A[PHI: r10 r16 r19 r20 r21 r22 r28
      0x056c: PHI (r10v5 int) = (r10v2 int), (r10v2 int), (r10v6 int) binds: [B:126:0x056a, B:118:0x0510, B:18:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x056c: PHI (r16v5 char) = (r16v3 char), (r16v2 char), (r16v2 char) binds: [B:126:0x056a, B:118:0x0510, B:18:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x056c: PHI (r19v5 int) = (r19v2 int), (r19v3 int), (r19v2 int) binds: [B:126:0x056a, B:118:0x0510, B:18:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x056c: PHI (r20v5 int) = (r20v2 int), (r20v3 int), (r20v2 int) binds: [B:126:0x056a, B:118:0x0510, B:18:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x056c: PHI (r21v5 int) = (r21v2 int), (r21v3 int), (r21v2 int) binds: [B:126:0x056a, B:118:0x0510, B:18:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x056c: PHI (r22v5 short[]) = (r22v3 short[]), (r22v2 short[]), (r22v2 short[]) binds: [B:126:0x056a, B:118:0x0510, B:18:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x056c: PHI (r28v44 short[]) = (r28v2 short[]), (r28v4 short[]), (r28v45 short[]) binds: [B:126:0x056a, B:118:0x0510, B:18:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00fd A[PHI: r14
      0x00fd: PHI (r14v5 java.lang.String) = (r14v4 java.lang.String), (r14v2 java.lang.String), (r14v2 java.lang.String), (r14v2 java.lang.String) binds: [B:32:0x00fb, B:24:0x00c3, B:21:0x00b9, B:5:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0226  */
    /* JADX WARN: Code duplicated, block: B:64:0x0254 A[PHI: r11
      0x0254: PHI (r11v5 java.lang.String) = (r11v4 java.lang.String), (r11v2 java.lang.String), (r11v2 java.lang.String) binds: [B:63:0x0252, B:14:0x008f, B:11:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x02ef A[PHI: r7 r12 r29
      0x02ef: PHI (r7v6 l.ܰ᩵ۡ) = (r7v3 l.ܰ᩵ۡ), (r7v2 l.ܰ᩵ۡ), (r7v2 l.ܰ᩵ۡ), (r7v2 l.ܰ᩵ۡ) binds: [B:78:0x02ed, B:53:0x01ec, B:11:0x0084, B:173:0x02ef] A[DONT_GENERATE, DONT_INLINE]
      0x02ef: PHI (r12v7 java.lang.String) = (r12v2 java.lang.String), (r12v4 java.lang.String), (r12v2 java.lang.String), (r12v2 java.lang.String) binds: [B:78:0x02ed, B:53:0x01ec, B:11:0x0084, B:173:0x02ef] A[DONT_GENERATE, DONT_INLINE]
      0x02ef: PHI (r29v7 int) = (r29v4 int), (r29v3 int), (r29v3 int), (r29v3 int) binds: [B:78:0x02ed, B:53:0x01ec, B:11:0x0084, B:173:0x02ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b9, code lost:
    
        if (l.C7106.f21815 != 0) goto L33;
     */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m20530() {
        int iM6981;
        int i;
        int i2;
        int iM2566;
        int i3;
        int iM2567;
        int i4;
        int iM6982;
        int i5;
        int i6;
        int i7 = ViewOnClickListenerC1958.f6529;
        int i8 = C11340.f33930;
        int iM6983 = C2105.m6981("ۤܰ") ^ i7;
        int i9 = ((iM6983 ^ i8) * (-30023)) ^ (-1828842856);
        Iterator itM12354 = null;
        Iterator itM12355 = null;
        Object objM3791 = null;
        String strM9031 = null;
        int i10 = iM6983 ^ (-58838344);
        ArrayList arrayList = null;
        int i11 = 0;
        int i12 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = -829515791;
        int i17 = 0;
        ArrayList arrayList2 = null;
        C14023 c14023 = null;
        short[] sArr = null;
        int iIntValue = 0;
        short[] sArr2 = null;
        String strM10633 = null;
        String strM5726 = null;
        String strM12817 = null;
        String strM2816 = null;
        int i18 = 0;
        while (true) {
            i16 = i10 ^ (i9 & (((i16 ^ i8) * 627) >> 31));
            switch (i16) {
                case -2023171002:
                case -1915031802:
                    iM2566 = C0630.m2566(strM10633);
                    i3 = 2123291560;
                    i11 = iM2566 ^ i3;
                    iM2567 = (C2105.m6981("֨ۢ") + i8) * 45;
                    i = ((iM2567 ^ i7) * (-18007)) ^ 933426158;
                    i4 = 1020456423;
                    i10 = iM2567 ^ i4;
                    i9 = i;
                    break;
                case -2009201454:
                case 963414715:
                    iM2566 = C2105.m6981(strM12817);
                    i3 = 2129822106;
                    i11 = iM2566 ^ i3;
                    iM2567 = (C2105.m6981("֨ۢ") + i8) * 45;
                    i = ((iM2567 ^ i7) * (-18007)) ^ 933426158;
                    i4 = 1020456423;
                    i10 = iM2567 ^ i4;
                    i9 = i;
                    break;
                case -1930452108:
                case 1777889249:
                    i11 = 0;
                    iM2567 = (C2105.m6981("֨ۢ") + i8) * 45;
                    i = ((iM2567 ^ i7) * (-18007)) ^ 933426158;
                    i4 = 1020456423;
                    i10 = iM2567 ^ i4;
                    i9 = i;
                    break;
                case -1861136180:
                case 414570147:
                    i12 = 59416;
                    iM6981 = (i7 - C2105.m6981("᩺ۙ")) * (-7);
                    i = ((iM6981 ^ i8) * 10017) ^ 1654759293;
                    i2 = -1704961607;
                    sArr = sArr;
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -1766509160:
                case -1624117883:
                    strM10633 = RunnableC3474.m10633(f23698, 52, 3, i12);
                    if (C3537.m10746() <= 0) {
                        iM2567 = C2105.m6981("۟ܳ") ^ i8;
                        i = ((iM2567 ^ i7) * 7269) ^ (-159724385);
                        i4 = 1212781386;
                    } else {
                        iM2567 = C2105.m6981("᩷ܰ") ^ i8;
                        i = ((iM2567 ^ i7) * (-1033)) ^ 1578043806;
                        i4 = 1396818147;
                    }
                    i10 = iM2567 ^ i4;
                    i9 = i;
                    break;
                case -1747575637:
                case 2073651894:
                    strM2816 = C0714.m2816(f23698, 43, 3, i12);
                    if (C22628.f73083 <= 0) {
                        iM2567 = C2105.m6981("᩻᩺") ^ i7;
                        i = ((iM2567 ^ i8) * (-14789)) ^ (-982137520);
                        i4 = 1559711582;
                    } else {
                        iM2567 = (C0630.m2566("ۖᩳ") ^ i8) * (-115);
                        i = ((iM2567 ^ i7) * 7187) ^ 1000870137;
                        i4 = 2071609883;
                    }
                    i10 = iM2567 ^ i4;
                    i9 = i;
                    break;
                case -1671206846:
                case -536554746:
                    C7811.m20844();
                    return null;
                case -1608444184:
                case 209198737:
                    if (C3663.f11553) {
                        iM2567 = C2105.m6981("᩻᩺") ^ i7;
                        i = ((iM2567 ^ i8) * (-14789)) ^ (-982137520);
                        i4 = 1559711582;
                    } else {
                        iM2567 = (C2105.m6981("ᩳ۠") ^ i8) * 3;
                        i = ((iM2567 ^ i7) * 20037) ^ (-553921176);
                        i4 = -1192803765;
                    }
                    i10 = iM2567 ^ i4;
                    i9 = i;
                    break;
                case -1541492038:
                case -100622658:
                    sArr = sArr;
                    s = sArr2[c];
                    s2 = 24776;
                    if (C2105.f7037 != 0) {
                        iM6981 = (C0630.m2566("ۡᩳ") + i8) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM6981 ^ i7) * (-27183)) ^ 573933182;
                        i2 = 814585264;
                    } else {
                        iM6981 = C2105.m6981("᩺֡") ^ i7;
                        i = ((iM6981 ^ i8) * (-25243)) ^ (-1217254146);
                        i2 = 2034865197;
                    }
                    sArr = sArr;
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -1470281149:
                case 235086868:
                    sArr = sArr;
                    sArr2 = f23698;
                    c = '%';
                    if (C3663.f11553) {
                        iM6981 = C2105.m6981("ۗᩴ") ^ i8;
                        i = ((iM6981 ^ i7) * (-26911)) ^ (-792048540);
                        i2 = 208626616;
                    } else {
                        iM6981 = (C2105.m6981("۠᩵") + i8) * (-111);
                        i = ((iM6981 ^ i7) * (-23669)) ^ (-338327114);
                        i2 = -78543393;
                    }
                    sArr = sArr;
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -1468416469:
                case -666522887:
                    C0237.m1481();
                    if (C4075.m12263() <= 0) {
                        iM2567 = C2105.m6981("۟ܳ") ^ i8;
                        i = ((iM2567 ^ i7) * 7269) ^ (-159724385);
                        i4 = 1212781386;
                    } else {
                        iM2567 = C0630.m2566("᩺ᩴ") ^ i7;
                        i = ((iM2567 ^ i8) * 25635) ^ (-1503526963);
                        i4 = 563624336;
                    }
                    i10 = iM2567 ^ i4;
                    i9 = i;
                    break;
                case -1321648576:
                case 1711900094:
                    C1916.m6307(arrayList2, objM3791);
                    iM6982 = (i8 - C2105.m6981("֡۟")) * (-107);
                    i5 = ((iM6982 ^ i7) * (-11705)) ^ 1335791135;
                    i6 = -2109539851;
                    short[] sArr3 = sArr;
                    i10 = iM6982 ^ i6;
                    i9 = i5;
                    sArr = sArr3;
                    break;
                case -1216120421:
                case -789605949:
                    sArr = sArr;
                    if (C1773.m5910(itM12355)) {
                        iM6982 = C2105.m6981("ۜۘ") ^ i7;
                        i5 = ((iM6982 ^ i8) * (-30623)) ^ (-1247348171);
                        i6 = 599828079;
                    } else {
                        iM6982 = (C0630.m2566("۠᩹") ^ i7) * 59;
                        i5 = ((iM6982 ^ i8) * 13873) ^ (-1816638689);
                        i6 = 1784654884;
                    }
                    short[] sArr4 = sArr;
                    i10 = iM6982 ^ i6;
                    i9 = i5;
                    sArr = sArr4;
                    break;
                case -1197299028:
                case 364382056:
                    sArr = sArr;
                    iIntValue = ((Number) RunnableC1108.m3791(itM12354)).intValue();
                    if (iIntValue != 0) {
                        iM6982 = C0630.m2566("ۚۜ") ^ i8;
                        i5 = ((iM6982 ^ i7) * 32341) ^ 82170630;
                        i6 = -1973486077;
                    } else {
                        iM6982 = C0630.m2566("᩺᩹") ^ i8;
                        i5 = ((iM6982 ^ i7) * (-13517)) ^ (-1831149434);
                        i6 = 660813744;
                    }
                    short[] sArr5 = sArr;
                    i10 = iM6982 ^ i6;
                    i9 = i5;
                    sArr = sArr5;
                    break;
                case -1133448455:
                case 2097442095:
                    sArr = sArr;
                    if (i13 - (i14 + i15) > 0) {
                        iM6981 = (C0630.m2566("ᩳۗ") ^ i8) * 11;
                        i = ((iM6981 ^ i7) * (-22337)) ^ 1845657077;
                        i2 = 1282158188;
                    } else {
                        iM6981 = C0630.m2566("ۚ֫") ^ i7;
                        i = ((iM6981 ^ i8) * (-763)) ^ (-309859859);
                        i2 = 1284941957;
                    }
                    sArr = sArr;
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -1121075989:
                case 1031093081:
                    strM5726 = C1711.m5726(f23698, 49, 3, i12);
                    if (C3245.m9925() == 0) {
                        iM2567 = (C0630.m2566("ᩳ֫") ^ i7) * 115;
                        i = ((iM2567 ^ i8) * (-32075)) ^ (-348531544);
                        i4 = -576932828;
                        i10 = iM2567 ^ i4;
                        i9 = i;
                    } else {
                        sArr = sArr;
                        iM6982 = C0630.m2566("᩸֡") ^ i7;
                        i5 = ((iM6982 ^ i8) * 19351) ^ 113844599;
                        i6 = -201225994;
                        short[] sArr6 = sArr;
                        i10 = iM6982 ^ i6;
                        i9 = i5;
                        sArr = sArr6;
                    }
                    break;
                case -996402280:
                case -416274300:
                    ViewOnClickListenerC1958.m6429();
                    if (C4159.m12565() >= 0) {
                        iM2567 = C0630.m2566("᩺ᩴ") ^ i7;
                        i = ((iM2567 ^ i8) * 25635) ^ (-1503526963);
                        i4 = 563624336;
                    } else {
                        iM2567 = C2105.m6981("᩻᩺") ^ i7;
                        i = ((iM2567 ^ i8) * (-14789)) ^ (-982137520);
                        i4 = 1559711582;
                    }
                    i10 = iM2567 ^ i4;
                    i9 = i;
                    break;
                case -996326113:
                case 761858685:
                    sArr = sArr;
                    i13 = s * s2;
                    i14 = s * s;
                    i15 = 153462544;
                    if (C3245.m9925() != 0) {
                        iM6981 = C2105.m6981("ۗᩴ") ^ i8;
                        i = ((iM6981 ^ i7) * (-26911)) ^ (-792048540);
                        i2 = 208626616;
                    } else {
                        iM6981 = C2105.m6981("֫֫") ^ i8;
                        i = ((iM6981 ^ i7) * (-29931)) ^ (-1953099759);
                        i2 = 1750753445;
                    }
                    sArr = sArr;
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -968886076:
                case 389702073:
                    iM2566 = C0630.m2566(strM5726);
                    i3 = 2128934220;
                    i11 = iM2566 ^ i3;
                    iM2567 = (C2105.m6981("֨ۢ") + i8) * 45;
                    i = ((iM2567 ^ i7) * (-18007)) ^ 933426158;
                    i4 = 1020456423;
                    i10 = iM2567 ^ i4;
                    i9 = i;
                    break;
                case -876754058:
                case 32566817:
                    iM2566 = C0630.m2566(strM2816);
                    i3 = 2123307464;
                    i11 = iM2566 ^ i3;
                    iM2567 = (C2105.m6981("֨ۢ") + i8) * 45;
                    i = ((iM2567 ^ i7) * (-18007)) ^ 933426158;
                    i4 = 1020456423;
                    i10 = iM2567 ^ i4;
                    i9 = i;
                    break;
                case -790538686:
                case -265675219:
                    sArr = f23698;
                    i18 = 41;
                    if (C1005.m3501()) {
                        iM2567 = C0630.m2566("֨ۗ") ^ i7;
                        i = ((iM2567 ^ i8) * (-8133)) ^ 1760954869;
                        i4 = -1333530621;
                        i10 = iM2567 ^ i4;
                        i9 = i;
                    }
                    sArr = sArr;
                    iM6981 = C2105.m6981("ۗᩴ") ^ i8;
                    i = ((iM6981 ^ i7) * (-26911)) ^ (-792048540);
                    i2 = 208626616;
                    sArr = sArr;
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -684960606:
                case -459218405:
                    return C1913.m6272(arrayList2, C1711.m5726(sArr, i18, 2, i12), null, null, c14023, i17);
                case -577737158:
                case 148350006:
                    C0382.m1848();
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2567 = (C0630.m2566("۟֫") + i7) * (-25);
                        i = ((iM2567 ^ i8) * (-18979)) ^ (-825884246);
                        i4 = -1656959029;
                        i10 = iM2567 ^ i4;
                        i9 = i;
                    }
                    sArr = sArr;
                    iM6981 = C2105.m6981("ۗᩴ") ^ i8;
                    i = ((iM6981 ^ i7) * (-26911)) ^ (-792048540);
                    i2 = 208626616;
                    sArr = sArr;
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -538008567:
                case 1843113074:
                    C3245.m9925();
                    if (!C4159.f13567) {
                        sArr = sArr;
                        iM6982 = C0630.m2566("᩸֡") ^ i7;
                        i5 = ((iM6982 ^ i8) * 19351) ^ 113844599;
                        i6 = -201225994;
                        short[] sArr7 = sArr;
                        i10 = iM6982 ^ i6;
                        i9 = i5;
                        sArr = sArr7;
                    } else {
                        iM2567 = (C2105.m6981("ᩳ۠") ^ i8) * 3;
                        i = ((iM2567 ^ i7) * 20037) ^ (-553921176);
                        i4 = -1192803765;
                        i10 = iM2567 ^ i4;
                        i9 = i;
                    }
                    break;
                case -531128826:
                case 2011420964:
                    objM3791 = RunnableC1108.m3791(itM12355);
                    if (((Number) objM3791).intValue() == 0) {
                        iM6982 = (i8 - C2105.m6981("֡۟")) * (-107);
                        i5 = ((iM6982 ^ i7) * (-11705)) ^ 1335791135;
                        i6 = -2109539851;
                        short[] sArr8 = sArr;
                        i10 = iM6982 ^ i6;
                        i9 = i5;
                        sArr = sArr8;
                    } else {
                        iM2567 = C0630.m2566("᩹᩵") ^ i7;
                        i = ((iM2567 ^ i8) * 14181) ^ 19647981;
                        i4 = 841576085;
                        i10 = iM2567 ^ i4;
                        i9 = i;
                    }
                    break;
                case -469059464:
                case 696089185:
                    ArrayList arrayList3 = this.f23700;
                    ArrayList arrayList4 = new ArrayList(C1913.m6270((Iterable) arrayList3));
                    itM12354 = C4117.m12354(arrayList3);
                    arrayList = arrayList4;
                    iM6981 = C2105.m6981("᩶ܳ") ^ i8;
                    i = ((iM6981 ^ i7) * 22857) ^ 856173793;
                    i2 = -1762471067;
                    sArr = sArr;
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -385205951:
                case -349311186:
                    if (iIntValue != 5) {
                        iM2567 = (C0630.m2566("ۗ᩵") + i7) * 45;
                        i = ((iM2567 ^ i8) * (-20593)) ^ (-1031621130);
                        i4 = 1182952101;
                    } else {
                        iM2567 = (C2105.m6981("᩺ܽ") ^ i7) * 83;
                        i = ((iM2567 ^ i8) * (-5335)) ^ 386843389;
                        i4 = -643779239;
                    }
                    i10 = iM2567 ^ i4;
                    i9 = i;
                    break;
                case -301918361:
                case 243129662:
                    c14023 = new C14023();
                    i17 = 30;
                    if (C0422.f1886 <= 0) {
                        iM2567 = (C2105.m6981("ᩳ۠") ^ i8) * 3;
                        i = ((iM2567 ^ i7) * 20037) ^ (-553921176);
                        i4 = -1192803765;
                    } else {
                        iM2567 = C0630.m2566("ܽۗ") ^ i8;
                        i = ((iM2567 ^ i7) * 29121) ^ (-1937415778);
                        i4 = 80451140;
                    }
                    i10 = iM2567 ^ i4;
                    i9 = i;
                    break;
                case -239059573:
                case 1575583185:
                    if (iIntValue != 2) {
                        iM2567 = C2105.m6981("ᩳܺ") ^ i7;
                        i = ((iM2567 ^ i8) * 26003) ^ (-1567732349);
                        i4 = 416538734;
                    } else {
                        iM2567 = (C0630.m2566("᩸ܳ") + i7) * (-3);
                        i = ((iM2567 ^ i8) * (-17793)) ^ (-1189589208);
                        i4 = 546247965;
                    }
                    i10 = iM2567 ^ i4;
                    i9 = i;
                    break;
                case -213229645:
                case 609178985:
                    sArr = sArr;
                    strM9031 = C2958.m9031(f23698, 38, 3, i12);
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        iM6982 = C0630.m2566("᩸֡") ^ i7;
                        i5 = ((iM6982 ^ i8) * 19351) ^ 113844599;
                        i6 = -201225994;
                    } else {
                        iM6982 = C2105.m6981("ۨ᩷") ^ i7;
                        i5 = ((iM6982 ^ i8) * 9769) ^ (-1377548474);
                        i6 = 1476364935;
                    }
                    short[] sArr9 = sArr;
                    i10 = iM6982 ^ i6;
                    i9 = i5;
                    sArr = sArr9;
                    break;
                case 64806463:
                case 1183940957:
                    iM2566 = C0630.m2566(strM9031);
                    i3 = 2102481768;
                    i11 = iM2566 ^ i3;
                    iM2567 = (C2105.m6981("֨ۢ") + i8) * 45;
                    i = ((iM2567 ^ i7) * (-18007)) ^ 933426158;
                    i4 = 1020456423;
                    i10 = iM2567 ^ i4;
                    i9 = i;
                    break;
                case 327097836:
                case 2103446205:
                    if (iIntValue != 4) {
                        iM2567 = (C2105.m6981("֨ۡ") + i8) * 75;
                        i = ((iM2567 ^ i7) * (-5641)) ^ (-1143522945);
                        i4 = -1012724119;
                    } else {
                        iM2567 = (C0630.m2566("᩸ܳ") + i7) * (-3);
                        i = ((iM2567 ^ i8) * (-17793)) ^ (-1189589208);
                        i4 = 546247965;
                    }
                    i10 = iM2567 ^ i4;
                    i9 = i;
                    break;
                case 587494711:
                case 1166935541:
                    strM12817 = C4263.m12817(f23698, 46, 3, i12);
                    if (C0237.f1507 != 0) {
                        iM2567 = (C2105.m6981("ᩳ۠") ^ i8) * 3;
                        i = ((iM2567 ^ i7) * 20037) ^ (-553921176);
                        i4 = -1192803765;
                    } else {
                        iM2567 = (C2105.m6981("ۛᩳ") ^ i8) * 49;
                        i = ((iM2567 ^ i7) * 31761) ^ 686233482;
                        i4 = 336501334;
                    }
                    i10 = iM2567 ^ i4;
                    i9 = i;
                    break;
                case 643203014:
                case 2002387033:
                    C1916.m6307(arrayList, C3245.m9931(i11));
                    iM6981 = C2105.m6981("᩶ܳ") ^ i8;
                    i = ((iM6981 ^ i7) * 22857) ^ 856173793;
                    i2 = -1762471067;
                    sArr = sArr;
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case 783036345:
                case 1291026302:
                    if (iIntValue != 3) {
                        iM2567 = C0630.m2566("ۡۡ") ^ i8;
                        i = ((iM2567 ^ i7) * 27353) ^ 122056226;
                        i4 = -950671632;
                    } else {
                        iM2567 = C2105.m6981("ۜۤ") ^ i8;
                        i = ((iM2567 ^ i7) * (-23847)) ^ (-1724683591);
                        i4 = 1762082911;
                    }
                    i10 = iM2567 ^ i4;
                    i9 = i;
                    break;
                case 1121701668:
                case 1291615331:
                    sArr = sArr;
                    if (C1773.m5910(itM12354)) {
                        iM6982 = (C0630.m2566("ܿܳ") + i7) * (-119);
                        i5 = ((iM6982 ^ i8) * (-29413)) ^ 791668801;
                        i6 = 1537231951;
                    } else {
                        iM6982 = (C2105.m6981("֨ܿ") + i7) * 123;
                        i5 = ((iM6982 ^ i8) * (-10711)) ^ 1787133349;
                        i6 = 495042600;
                    }
                    short[] sArr10 = sArr;
                    i10 = iM6982 ^ i6;
                    i9 = i5;
                    sArr = sArr10;
                    break;
                case 1176497990:
                case 1584661117:
                    if (iIntValue != 1) {
                        iM2567 = (i8 - C2105.m6981("᩻ۡ")) * (-23);
                        i = ((iM2567 ^ i7) * 2941) ^ (-972919081);
                        i4 = 21030381;
                    } else {
                        iM2567 = C0630.m2566("ܶ۬") ^ i7;
                        i = ((iM2567 ^ i8) * (-11427)) ^ 819827572;
                        i4 = -1007329558;
                    }
                    i10 = iM2567 ^ i4;
                    i9 = i;
                    break;
                case 1304911809:
                case 1895194834:
                    arrayList2 = new ArrayList();
                    itM12355 = C4117.m12354(arrayList);
                    iM6982 = (i8 - C2105.m6981("֡۟")) * (-107);
                    i5 = ((iM6982 ^ i7) * (-11705)) ^ 1335791135;
                    i6 = -2109539851;
                    short[] sArr11 = sArr;
                    i10 = iM6982 ^ i6;
                    i9 = i5;
                    sArr = sArr11;
                    break;
                case 1369991108:
                case 1441905552:
                    i12 = 24529;
                    iM6981 = (i7 - C2105.m6981("᩺ۙ")) * (-7);
                    i = ((iM6981 ^ i8) * 10017) ^ 1654759293;
                    i2 = -1704961607;
                    sArr = sArr;
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case 1431524382:
                case 1649313681:
                    break;
                default:
                    C3537.m10746();
                    iM2567 = C2105.m6981("۟ܳ") ^ i8;
                    i = ((iM2567 ^ i7) * 7269) ^ (-159724385);
                    i4 = 1212781386;
                    i10 = iM2567 ^ i4;
                    i9 = i;
                    break;
            }
        }
    }
}
