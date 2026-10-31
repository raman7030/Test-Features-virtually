package l;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۗۤܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: G668 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3178 {

    /* JADX INFO: renamed from: ᩺᩺۠, reason: not valid java name and contains not printable characters */
    private static final short[] f9988 = {344, 24863, 26930, 24973, 32674, -25258, -22789, 505, 10855, 15702, -470, -16086, 15620, 14339, -9208, -15653, 10536, -1888, -14717, 10567, -11059, 8460, -11143, -13477, 12749, 15433, -12910, 8849, -924, 12578, -1061, -3092, -797, -8398, -9889, 9805, 13050, -2666, -9957, -107, -1735, 3299, -19511, 29111, 28041, 9714, -31297, 24995, 27909, -24663, -31748, -29140, 29925, 18918, -26506, -29154, -31960, -30828, 32375, -30272, -28555, -30431, 28358, 24596, -29527, 32727, 25865, 4177};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractActivityC3346 f9989;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC15252 f9990;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f9991;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC13041 f9992;

    /* JADX WARN: Code duplicated, block: B:54:0x01fb A[PHI: r5 r6 r9 r10 r11 r13 r20 r25
      0x01fb: PHI (r5v4 java.lang.String) = (r5v2 java.lang.String), (r5v2 java.lang.String), (r5v3 java.lang.String), (r5v2 java.lang.String) binds: [B:53:0x01f9, B:31:0x0103, B:27:0x00db, B:23:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:53:0x01f9, B:31:0x0103, B:27:0x00db, B:23:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r9v4 short[]) = (r9v2 short[]), (r9v2 short[]), (r9v3 short[]), (r9v2 short[]) binds: [B:53:0x01f9, B:31:0x0103, B:27:0x00db, B:23:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r10v3 int) = (r10v2 int), (r10v2 int), (r10v2 int), (r10v4 int) binds: [B:53:0x01f9, B:31:0x0103, B:27:0x00db, B:23:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v4 int) binds: [B:53:0x01f9, B:31:0x0103, B:27:0x00db, B:23:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r13v4 int) = (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:53:0x01f9, B:31:0x0103, B:27:0x00db, B:23:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r20v4 int) = (r20v3 int), (r20v2 int), (r20v2 int), (r20v2 int) binds: [B:53:0x01f9, B:31:0x0103, B:27:0x00db, B:23:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r25v5 int) = (r25v4 int), (r25v3 int), (r25v3 int), (r25v3 int) binds: [B:53:0x01f9, B:31:0x0103, B:27:0x00db, B:23:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x025c A[PHI: r4 r7 r8 r15 r17
      0x025c: PHI (r4v4 boolean) = (r4v2 boolean), (r4v3 boolean), (r4v2 boolean), (r4v2 boolean) binds: [B:61:0x025a, B:39:0x0146, B:35:0x0125, B:11:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:61:0x025a, B:39:0x0146, B:35:0x0125, B:11:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:61:0x025a, B:39:0x0146, B:35:0x0125, B:11:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r15v4 short[]) = (r15v2 short[]), (r15v2 short[]), (r15v3 short[]), (r15v2 short[]) binds: [B:61:0x025a, B:39:0x0146, B:35:0x0125, B:11:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:61:0x025a, B:39:0x0146, B:35:0x0125, B:11:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x028e A[PHI: r16 r18 r19
      0x028e: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:65:0x028c, B:58:0x0231, B:14:0x0081, B:11:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x028e: PHI (r18v10 short) = (r18v2 short), (r18v4 short), (r18v2 short), (r18v2 short) binds: [B:65:0x028c, B:58:0x0231, B:14:0x0081, B:11:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x028e: PHI (r19v6 int) = (r19v2 int), (r19v3 int), (r19v2 int), (r19v2 int) binds: [B:65:0x028c, B:58:0x0231, B:14:0x0081, B:11:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9736(C3178 c3178, AbstractC15440 abstractC15440) {
        int iM2566;
        int i;
        int i2;
        int i3 = C0714.f2697;
        int i4 = C1420.f5096;
        int iM2567 = (i4 - C0630.m2566("᩹ۢ")) * 109;
        int i5 = ((iM2567 ^ i3) * (-31031)) ^ 591021980;
        Object[] objArr = null;
        String strM12262 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM2567 ^ 247353010;
        boolean z = false;
        int iM6981 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        char c = 0;
        short s = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = -1271555241;
        int i16 = 0;
        String strM9025 = null;
        AbstractActivityC3346 abstractActivityC3346 = null;
        while (true) {
            i15 = i6 ^ (i5 & (((i15 ^ i3) * (-30505)) >> 31));
            switch (i15) {
                case -1880525277:
                case 1022692108:
                    int i17 = i16 + i11;
                    if ((i17 + i17) - i14 < 0) {
                        iM2566 = C2105.m6981("᩷ۚ") ^ i4;
                        i = ((iM2566 ^ i3) * 31535) ^ 402804951;
                        i2 = 256759820;
                    } else {
                        iM2566 = C0630.m2566("ۗ᩶") ^ i3;
                        i = ((iM2566 ^ i4) * 10277) ^ (-360119400);
                        i2 = 1832249898;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1815491181:
                case -697626066:
                    C4159.m12565();
                    iM2566 = C2105.m6981("֡ۨ") ^ i3;
                    i = ((iM2566 ^ i4) * (-26323)) ^ 216659403;
                    i2 = 735896382;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1748117582:
                case 1142748325:
                    ServiceConnectionC3453.m10564();
                    if (C3683.f11629 < 0) {
                        iM2566 = C2105.m6981("֡ۨ") ^ i3;
                        i = ((iM2566 ^ i4) * (-26323)) ^ 216659403;
                        i2 = 735896382;
                    } else {
                        iM2566 = C2105.m6981("۫ܶ") ^ i4;
                        i = ((iM2566 ^ i3) * 11029) ^ 1913117559;
                        i2 = -1784605679;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1517073340:
                case -955026855:
                    C2958.m9034();
                    break;
                case -1337857836:
                case 1889943551:
                    i14 = i13 * i13;
                    i16 = s * s;
                    i11 = 6563844;
                    if (C3432.f10845 >= 0) {
                        iM2566 = C2105.m6981("۟ۨ") ^ i3;
                        i = ((iM2566 ^ i4) * (-12545)) ^ 664154705;
                        i2 = 1302049902;
                    } else {
                        iM2566 = (C0630.m2566("ܶܺ") ^ i3) * (-31);
                        i = ((iM2566 ^ i4) * (-21055)) ^ (-1571440190);
                        i2 = 1270421402;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1074051005:
                case -717133283:
                    sArr = f9988;
                    if (C4263.f13799 <= 0) {
                        iM2566 = C2105.m6981("۫ܶ") ^ i4;
                        i = ((iM2566 ^ i3) * 11029) ^ 1913117559;
                        i2 = -1784605679;
                    } else {
                        iM2566 = C0630.m2566("ۡ᩸") ^ i4;
                        i = ((iM2566 ^ i3) * 9299) ^ (-1631346222);
                        i2 = -2083089861;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1071864296:
                case 41005520:
                    c = 0;
                    if (C4616.f14690 <= 0) {
                        iM2566 = (C2105.m6981("ۙ֨") ^ i3) * 29;
                        i = ((iM2566 ^ i4) * 5141) ^ 965421761;
                        i2 = -2000362024;
                    } else {
                        iM2566 = C0630.m2566("ܶۗ") ^ i3;
                        i = ((iM2566 ^ i4) * (-19795)) ^ 486785379;
                        i2 = -1272200870;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1027509990:
                case 1283733723:
                    i12 = 28480;
                    iM2566 = (C0630.m2566("᩻᩸") ^ i3) * 93;
                    i = ((iM2566 ^ i4) * (-20929)) ^ (-49762822);
                    i2 = -994686708;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1009486438:
                case 1546437227:
                    RunnableC1108.m3790();
                    if (C0630.f2410 > 0) {
                        int iM2568 = (C0630.m2566("۠֫") ^ i4) * (-19);
                        i5 = ((iM2568 ^ i3) * (-11835)) ^ (-1316627662);
                        i6 = iM2568 ^ (-1937309027);
                    } else {
                        iM2566 = C2105.m6981("֡ۨ") ^ i3;
                        i = ((iM2566 ^ i4) * (-26323)) ^ 216659403;
                        i2 = 735896382;
                        i6 = iM2566 ^ i2;
                        i5 = i;
                    }
                    break;
                case -718531670:
                case 664779415:
                    i9 = 4;
                    i10 = 3;
                    if (C22628.f73083 <= 0) {
                        iM2566 = C2105.m6981("۟ۨ") ^ i3;
                        i = ((iM2566 ^ i4) * (-12545)) ^ 664154705;
                        i2 = 1302049902;
                    } else {
                        iM2566 = C0630.m2566("ۡ᩷") ^ i4;
                        i = ((iM2566 ^ i3) * 30673) ^ 256752908;
                        i2 = 530377915;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -517902342:
                case 1549195417:
                    abstractActivityC3346.m10218(C0630.m2566(C7106.m19110(sArr3, i9, i10, i12)) ^ 2099127731, strM12262, z);
                    break;
                case -183787580:
                case 2113953196:
                    strM12262 = C4075.m12262(abstractActivityC3346, 2103138365 ^ iM6981, objArr);
                    sArr3 = f9988;
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = C2105.m6981("۟ۨ") ^ i3;
                        i = ((iM2566 ^ i4) * (-12545)) ^ 664154705;
                        i2 = 1302049902;
                    } else {
                        iM2566 = (i4 - C0630.m2566("᩸ۗ")) * (-37);
                        i = ((iM2566 ^ i3) * (-27145)) ^ (-813748645);
                        i2 = 330982080;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -123048463:
                case 666008144:
                    sArr2 = f9988;
                    i7 = 1;
                    i8 = 3;
                    if (C3432.f10845 >= 0) {
                        iM2566 = (C2105.m6981("ۙ֨") ^ i3) * 29;
                        i = ((iM2566 ^ i4) * 5141) ^ 965421761;
                        i2 = -2000362024;
                    } else {
                        iM2566 = (C0630.m2566("ܰۢ") + i4) * 95;
                        i = ((iM2566 ^ i3) * (-24559)) ^ (-1412277415);
                        i2 = 1514667386;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 907736474:
                case 1963766092:
                    abstractActivityC3346 = c3178.f9989;
                    strM9025 = C2958.m9025(abstractC15440);
                    objArr = new Object[1];
                    if (!C2272.f7362) {
                        iM2566 = C0630.m2566("ᩴܰ") ^ i4;
                        i = ((iM2566 ^ i3) * (-9525)) ^ (-790513145);
                        i2 = 1034374277;
                        i6 = iM2566 ^ i2;
                        i5 = i;
                    } else {
                        int iM2569 = (C0630.m2566("۠֫") ^ i4) * (-19);
                        i5 = ((iM2569 ^ i3) * (-11835)) ^ (-1316627662);
                        i6 = iM2569 ^ (-1937309027);
                    }
                    break;
                case 979647782:
                case 2008333197:
                    short s2 = sArr[c];
                    int i18 = s2 + 2562;
                    if (C3746.f11829 <= 0) {
                        s = s2;
                        i13 = i18;
                        iM2566 = C2105.m6981("۫ܶ") ^ i4;
                        i = ((iM2566 ^ i3) * 11029) ^ 1913117559;
                        i2 = -1784605679;
                        i6 = iM2566 ^ i2;
                        i5 = i;
                    } else {
                        int iM6982 = (C2105.m6981("ۚ֨") + i4) * (-117);
                        i5 = ((iM6982 ^ i3) * (-589)) ^ (-852663686);
                        i6 = iM6982 ^ 1933820681;
                        s = s2;
                        i13 = i18;
                    }
                    break;
                case 1288535162:
                case 1954998126:
                    if (C1916.f6442) {
                        iM2566 = (C2105.m6981("ۙ֨") ^ i3) * 29;
                        i = ((iM2566 ^ i4) * 5141) ^ 965421761;
                        i2 = -2000362024;
                    } else {
                        iM2566 = C2105.m6981("۫ܶ") ^ i4;
                        i = ((iM2566 ^ i3) * 11029) ^ 1913117559;
                        i2 = -1784605679;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 1583282605:
                case 2121182253:
                    z = false;
                    objArr[0] = strM9025;
                    if (C1711.f5919) {
                        iM2566 = (C2105.m6981("ۙ֨") ^ i3) * 29;
                        i = ((iM2566 ^ i4) * 5141) ^ 965421761;
                        i2 = -2000362024;
                    } else {
                        iM2566 = (C2105.m6981("֨֫") ^ i3) * 81;
                        i = ((iM2566 ^ i4) * 18987) ^ 2104216559;
                        i2 = -6552177;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 1878929294:
                case 1926972800:
                    iM6981 = C2105.m6981(RunnableC1108.m3789(sArr2, i7, i8, i12));
                    if (RunnableC1937.m6387() != 0) {
                        iM2566 = C2105.m6981("۟ۨ") ^ i3;
                        i = ((iM2566 ^ i4) * (-12545)) ^ 664154705;
                        i2 = 1302049902;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ܺܺ")) * 109;
                        i = ((iM2566 ^ i4) * 6227) ^ (-2084148001);
                        i2 = -380897867;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                default:
                    i12 = 63413;
                    iM2566 = (C0630.m2566("᩻᩸") ^ i3) * 93;
                    i = ((iM2566 ^ i4) * (-20929)) ^ (-49762822);
                    i2 = -994686708;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    public C3178(AbstractActivityC3346 abstractActivityC3346, AbstractC15440 abstractC15440) {
        InterfaceC13041 interfaceC13041 = null;
        int i = 432829305;
        int i2 = C22628.f73083;
        int i3 = C1294.f4556;
        int iM2566 = (C0630.m2566("᩺ܳ") ^ i3) * 79;
        int i4 = ((iM2566 ^ i2) * (-24119)) ^ (-768809081);
        int i5 = 1504212173;
        while (true) {
            i = ((((i ^ i2) * 19953) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2049393989:
                case 467591513:
                    C0483.m2121();
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = C0630.m2566("ۙܰ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 769) ^ 819872096;
                        i5 = 420529750;
                    } else {
                        iM2566 = (C0630.m2566("ܽۖ") + i2) * (-19);
                        i4 = ((iM2566 ^ i3) * (-30855)) ^ 471504659;
                        i5 = -1932599031;
                    }
                    break;
                case -2020168402:
                case -1812529747:
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = C0630.m2566("ۙܶ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 3443) ^ 462084415;
                        i5 = -278312193;
                    } else {
                        iM2566 = C0630.m2566("ܿۚ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 723) ^ 256406617;
                        i5 = -745230451;
                    }
                    break;
                case -1931758875:
                case 860334585:
                    C0630.m2564();
                    iM2566 = C0630.m2566("ۙܰ") ^ i3;
                    i4 = ((iM2566 ^ i2) * 769) ^ 819872096;
                    i5 = 420529750;
                    break;
                case -1847230592:
                case -862466943:
                    if (C3245.m9925() != 0) {
                        iM2566 = C0630.m2566("ۙܶ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 3443) ^ 462084415;
                        i5 = -278312193;
                    } else {
                        iM2566 = C0630.m2566("ܰ᩻") ^ i2;
                        i4 = ((iM2566 ^ i3) * 509) ^ 1448463538;
                        i5 = 1212027760;
                    }
                    break;
                case -1239897334:
                case -605535531:
                    C22628.m50615();
                    C1773.m5908();
                    throw new RuntimeException();
                case -1147521746:
                case 1264139422:
                    if (C1128.f4106 <= 0) {
                        iM2566 = (i2 - C2105.m6981("ۤᩴ")) * 55;
                        i4 = ((iM2566 ^ i3) * 4579) ^ 1647967064;
                        i5 = 373972462;
                    } else {
                        iM2566 = C0630.m2566("ۙܰ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 769) ^ 819872096;
                        i5 = 420529750;
                    }
                    break;
                case -812686783:
                case 76385959:
                    if (C5695.f17556 >= 0) {
                        iM2566 = (i2 - C2105.m6981("ۤᩴ")) * 55;
                        i4 = ((iM2566 ^ i3) * 4579) ^ 1647967064;
                        i5 = 373972462;
                    } else {
                        iM2566 = (C2105.m6981("۬ۧ") ^ i3) * 83;
                        i4 = ((iM2566 ^ i2) * (-13341)) ^ 1259517656;
                        i5 = 1932330609;
                    }
                    break;
                case -628451487:
                case 1295637777:
                    C3911.m11924();
                    if (C1047.m3599() >= 0) {
                        iM2566 = C2105.m6981("۫ۗ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-4789)) ^ 421216284;
                        i5 = -464431111;
                    } else {
                        iM2566 = C0630.m2566("ۙܰ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 769) ^ 819872096;
                        i5 = 420529750;
                    }
                    break;
                case -512071797:
                case -128727400:
                    if (C3911.m11924() <= 0) {
                        iM2566 = C0630.m2566("ۙܰ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 769) ^ 819872096;
                        i5 = 420529750;
                    } else {
                        iM2566 = C0630.m2566("ܽ֨") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-23501)) ^ 907510944;
                        i5 = -1894706532;
                    }
                    break;
                case -428388843:
                case 1872204997:
                    this.f9992 = interfaceC13041;
                    if (C1916.f6442) {
                        iM2566 = (i3 - C0630.m2566("֨ۤ")) * 127;
                        i4 = ((iM2566 ^ i2) * 6871) ^ (-1684012243);
                        i5 = -1788577922;
                    } else {
                        iM2566 = C0630.m2566("ۙܶ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 3443) ^ 462084415;
                        i5 = -278312193;
                    }
                    break;
                case -214967940:
                case 1100185839:
                    this.f9989 = abstractActivityC3346;
                    this.f9991 = abstractC15440;
                    return;
                case 651239086:
                case 1147446460:
                    if (C0050.f910 >= 0) {
                        iM2566 = C2105.m6981("۫ۗ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-4789)) ^ 421216284;
                        i5 = -464431111;
                    } else {
                        iM2566 = C2105.m6981("۬ᩳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-13283)) ^ 139101333;
                        i5 = 1619469677;
                    }
                    break;
                case 777586973:
                case 2111696088:
                    if (C7811.f24123 >= 0) {
                        iM2566 = C0630.m2566("ۙܰ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 769) ^ 819872096;
                        i5 = 420529750;
                    } else {
                        iM2566 = C0630.m2566("ۡ֡") ^ i3;
                        i4 = ((iM2566 ^ i2) * 14981) ^ (-388668909);
                        i5 = -124174902;
                    }
                    break;
                case 1387154897:
                case 1563997955:
                    interfaceC13041 = new InterfaceC13041() { // from class: l.֡ۤܿ
                        @Override // l.InterfaceC13041
                        public final void accept(Object obj) {
                            C3178.m9736(this.f1766, (AbstractC15440) obj);
                        }
                    };
                    if (C4159.f13567) {
                        iM2566 = C0630.m2566("ܳܰ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 18613) ^ (-636770997);
                        i5 = 322108944;
                    } else {
                        iM2566 = C2105.m6981("۫ۗ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-4789)) ^ 421216284;
                        i5 = -464431111;
                    }
                    break;
                case 1469141249:
                case 1830749658:
                    if (C2126.f7087) {
                        iM2566 = C0630.m2566("ۙܰ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 769) ^ 819872096;
                        i5 = 420529750;
                    } else {
                        iM2566 = (C2105.m6981("ۙ֡") ^ i2) * (-33);
                        i4 = ((iM2566 ^ i3) * (-22079)) ^ 1131013933;
                        i5 = -321234914;
                    }
                    break;
                default:
                    if (C1916.f6442) {
                        iM2566 = C0630.m2566("ۧܶ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-2789)) ^ 763099870;
                        i5 = -1508563359;
                    } else {
                        iM2566 = C0630.m2566("ۙܶ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 3443) ^ 462084415;
                        i5 = -278312193;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9743(C9363 c9363) {
        this.f9992 = c9363;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 29901. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9742() {
        /*
            Method dump skipped, instruction units count: 2990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3178.m9742():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0119, code lost:
    
        if (l.ViewOnClickListenerC1958.f6529 > 0) goto L8;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m9737(final C3178 c3178, final byte[] bArr, final byte[] bArr2) {
        int i;
        int iM6981;
        int i2;
        int i3;
        int i4;
        int iM6982;
        int i5;
        int i6;
        int i7;
        int i8;
        int iM2566;
        int i9;
        int i10;
        int iM2567;
        int i11;
        int i12;
        int i13;
        int iM2568;
        int i14;
        int i15;
        int iM6983;
        int i16;
        int i17;
        int i18;
        int i19;
        short[] sArr;
        int iM2569;
        int i20;
        int i21;
        int iM25610;
        int i22;
        int i23;
        boolean z = false;
        int i24 = 0;
        int i25 = -1356825317;
        int i26 = C3537.f11231;
        int i27 = C2520.f8000;
        int iM6984 = C2105.m6981("ۜۘ") ^ i26;
        int i28 = ((iM6984 ^ i27) * 14839) ^ (-1421294744);
        int i29 = iM6984 ^ (-1082966883);
        RadioButton radioButton = null;
        final RadioButton[] radioButtonArr = null;
        RadioButton radioButton2 = null;
        RadioButton radioButton3 = null;
        RadioButton radioButton4 = null;
        final EditText editText = null;
        C19258 c19258M2130 = null;
        Object obj = null;
        String strM10748 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        int i30 = 0;
        int iM6985 = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        char c = 0;
        int i34 = 0;
        int i35 = 0;
        int iM6986 = 0;
        int iM25611 = 0;
        int i36 = 0;
        int iM6987 = 0;
        int iM25612 = 0;
        char c2 = 0;
        int i37 = 0;
        int iM25613 = 0;
        short s = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = 0;
        RadioButton radioButton5 = null;
        RadioButton radioButton6 = null;
        View.OnClickListener onClickListener = null;
        int iM25614 = 0;
        View viewM9259 = null;
        AbstractActivityC3346 abstractActivityC3346 = null;
        while (true) {
            i25 = i29 ^ (i28 & (((i25 ^ i27) * (-7369)) >> 31));
            switch (i25) {
                case -2102081439:
                case -227962511:
                    C2520.m8026();
                    if (C0483.f2088 >= 0) {
                        onClickListener = onClickListener;
                        editText = editText;
                        radioButton4 = radioButton4;
                        i7 = i30;
                        i8 = iM6985;
                        iM2566 = (C0630.m2566("ۧ֨") ^ i27) * (-61);
                        i9 = ((iM2566 ^ i26) * 15641) ^ 489323869;
                        i10 = -843936770;
                        i29 = iM2566 ^ i10;
                        i28 = i9;
                        i30 = i7;
                        iM6985 = i8;
                        radioButton4 = radioButton4;
                        editText = editText;
                        onClickListener = onClickListener;
                    } else {
                        onClickListener = onClickListener;
                        editText = editText;
                        radioButton4 = radioButton4;
                        sArr3 = sArr3;
                        i39 = i39;
                        i40 = i40;
                        i30 = i30;
                        iM6985 = iM6985;
                        sArr = sArr2;
                        i38 = i38;
                        iM2569 = (C2105.m6981("ۘۘ") + i26) * 9;
                        sArr2 = sArr;
                        i16 = ((iM2569 ^ i27) * 19789) ^ 1217695496;
                        i20 = -354502249;
                        i18 = iM2569 ^ i20;
                        i38 = i38;
                        iM6985 = iM6985;
                        sArr3 = sArr3;
                        i39 = i39;
                        i40 = i40;
                        sArr2 = sArr2;
                        i29 = i18;
                        i28 = i16;
                        radioButton4 = radioButton4;
                        i30 = i30;
                        onClickListener = onClickListener;
                        editText = editText;
                    }
                    break;
                case -2083503109:
                case -1760322201:
                    onClickListener = onClickListener;
                    editText = editText;
                    radioButton4 = radioButton4;
                    sArr2 = sArr2;
                    sArr3 = sArr3;
                    i39 = i39;
                    i40 = i40;
                    i30 = i30;
                    iM6985 = iM6985;
                    i38 = i38;
                    viewM9259 = C3019.m9259(abstractActivityC3346, i34 ^ i35);
                    abstractActivityC3346 = abstractActivityC3346;
                    strM10748 = C3537.m10748(f9988, 11, 3, i32);
                    if (C3019.f9544 < 0) {
                        iM2568 = C0630.m2566("ܰܰ") ^ i26;
                        i14 = ((iM2568 ^ i27) * (-10141)) ^ 5662940;
                        i15 = 1689204446;
                        int i41 = iM2568 ^ i15;
                        i38 = i38;
                        i30 = i30;
                        iM6985 = iM6985;
                        sArr3 = sArr3;
                        i39 = i39;
                        i40 = i40;
                        sArr2 = sArr2;
                        i29 = i41;
                        i28 = i14;
                        radioButton4 = radioButton4;
                        editText = editText;
                        onClickListener = onClickListener;
                        abstractActivityC3346 = abstractActivityC3346;
                    } else {
                        abstractActivityC3346 = abstractActivityC3346;
                        iM2569 = (i26 - C0630.m2566("۫ۜ")) * (-75);
                        i16 = ((iM2569 ^ i27) * 30339) ^ 650159417;
                        i20 = -1322632756;
                        i18 = iM2569 ^ i20;
                        i38 = i38;
                        iM6985 = iM6985;
                        sArr3 = sArr3;
                        i39 = i39;
                        i40 = i40;
                        sArr2 = sArr2;
                        i29 = i18;
                        i28 = i16;
                        radioButton4 = radioButton4;
                        i30 = i30;
                        onClickListener = onClickListener;
                        editText = editText;
                    }
                    break;
                case -2074881856:
                case -1684173390:
                    onClickListener = onClickListener;
                    editText = editText;
                    radioButton4 = radioButton4;
                    C0964.m3404(radioButton4, C4075.m12251(iM25613));
                    i7 = i30;
                    i8 = iM6985;
                    iM6987 = C2105.m6981(C5695.m16034(f9988, 29, 3, i32));
                    iM2566 = (C0630.m2566("ܺ֡") ^ i26) * (-99);
                    i9 = ((iM2566 ^ i27) * 557) ^ (-279269173);
                    i10 = 1213287868;
                    i29 = iM2566 ^ i10;
                    i28 = i9;
                    i30 = i7;
                    iM6985 = i8;
                    radioButton4 = radioButton4;
                    editText = editText;
                    onClickListener = onClickListener;
                    break;
                case -1968506743:
                case -1455594664:
                    final TextView textView = (TextView) C1005.m3507(viewM9259, iM6985);
                    editText = editText;
                    onClickListener = new View.OnClickListener() { // from class: l.۠ۤܿ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            RadioButton[] radioButtonArr2 = radioButtonArr;
                            int length = radioButtonArr2.length;
                            int i42 = 0;
                            while (true) {
                                boolean z2 = true;
                                if (i42 >= length) {
                                    break;
                                }
                                RadioButton radioButton7 = radioButtonArr2[i42];
                                if (view != radioButton7) {
                                    z2 = false;
                                }
                                radioButton7.setChecked(z2);
                                i42++;
                            }
                            editText.setVisibility(view != radioButtonArr2[1] ? 8 : 0);
                            textView.setText((String) view.getTag());
                        }
                    };
                    i21 = 0;
                    int iM6988 = (C2105.m6981("᩻۫") ^ i26) * 119;
                    i30 = i21;
                    i19 = ((iM6988 ^ i27) * (-19449)) ^ 1164078710;
                    i29 = iM6988 ^ 1357183093;
                    i28 = i19;
                    i30 = i30;
                    editText = editText;
                    break;
                case -1831746738:
                case 894135086:
                    onClickListener = onClickListener;
                    editText = editText;
                    radioButton4 = radioButton4;
                    sArr3 = sArr3;
                    i39 = i39;
                    i30 = i30;
                    iM6985 = iM6985;
                    i = i40;
                    radioButton6 = (RadioButton) C1005.m3507(viewM9259, iM6986 ^ 2118758219);
                    i31 = 3;
                    if (C2105.f7037 == 0) {
                        iM6981 = (C2105.m6981("ܳ᩵") + i26) * (-53);
                        i2 = ((iM6981 ^ i27) * 18439) ^ 1328781525;
                        i3 = 2830314;
                        i29 = iM6981 ^ i3;
                        i28 = i2;
                        i40 = i;
                        i30 = i30;
                        iM6985 = iM6985;
                        sArr3 = sArr3;
                        i39 = i39;
                        radioButton4 = radioButton4;
                        editText = editText;
                        onClickListener = onClickListener;
                    } else {
                        i40 = i;
                        i38 = i38;
                        iM2569 = (i26 - C0630.m2566("۫ۜ")) * (-75);
                        i16 = ((iM2569 ^ i27) * 30339) ^ 650159417;
                        i20 = -1322632756;
                        i18 = iM2569 ^ i20;
                        i38 = i38;
                        iM6985 = iM6985;
                        sArr3 = sArr3;
                        i39 = i39;
                        i40 = i40;
                        sArr2 = sArr2;
                        i29 = i18;
                        i28 = i16;
                        radioButton4 = radioButton4;
                        i30 = i30;
                        onClickListener = onClickListener;
                        editText = editText;
                    }
                    break;
                case -1806177842:
                case 2039714827:
                    onClickListener = onClickListener;
                    editText = editText;
                    radioButton4 = radioButton4;
                    sArr3 = sArr3;
                    i39 = i39;
                    i30 = i30;
                    iM6985 = iM6985;
                    i = i40;
                    radioButtonArr = new RadioButton[i31];
                    z = false;
                    radioButtonArr[0] = radioButton5;
                    c = 1;
                    radioButtonArr[1] = radioButton;
                    c2 = 2;
                    iM6981 = (C0630.m2566("֫ܳ") ^ i27) * (-49);
                    i2 = ((iM6981 ^ i26) * (-12443)) ^ 189243190;
                    i3 = -273461697;
                    i29 = iM6981 ^ i3;
                    i28 = i2;
                    i40 = i;
                    i30 = i30;
                    iM6985 = iM6985;
                    sArr3 = sArr3;
                    i39 = i39;
                    radioButton4 = radioButton4;
                    editText = editText;
                    onClickListener = onClickListener;
                    break;
                case -1766179066:
                case 950310138:
                    onClickListener = onClickListener;
                    editText = editText;
                    radioButton4 = radioButton4;
                    sArr3 = sArr3;
                    i39 = i39;
                    i40 = i40;
                    i30 = i30;
                    iM6985 = iM6985;
                    sArr = sArr2;
                    i38 = i38;
                    iM25614 = C0630.m2566(C3911.m11919(sArr, i38, 3, i32)) ^ 2126711603;
                    if (C2272.f7362) {
                        iM2569 = (C2105.m6981("ۘۘ") + i26) * 9;
                        sArr2 = sArr;
                        i16 = ((iM2569 ^ i27) * 19789) ^ 1217695496;
                        i20 = -354502249;
                    } else {
                        sArr2 = sArr;
                        iM2569 = (i27 - C0630.m2566("ۙۚ")) * 63;
                        i16 = ((iM2569 ^ i26) * (-10321)) ^ (-2118314482);
                        i20 = 821790061;
                    }
                    i18 = iM2569 ^ i20;
                    i38 = i38;
                    iM6985 = iM6985;
                    sArr3 = sArr3;
                    i39 = i39;
                    i40 = i40;
                    sArr2 = sArr2;
                    i29 = i18;
                    i28 = i16;
                    radioButton4 = radioButton4;
                    i30 = i30;
                    onClickListener = onClickListener;
                    editText = editText;
                    break;
                case -1707437093:
                case 761995491:
                    onClickListener = onClickListener;
                    if (i30 < i31) {
                        iM2567 = C0630.m2566("ۨ֨") ^ i27;
                        i11 = ((iM2567 ^ i26) * 6357) ^ (-329336451);
                        i12 = -1319346893;
                    } else {
                        iM2567 = C2105.m6981("᩵֫") ^ i27;
                        i11 = ((iM2567 ^ i26) * (-17469)) ^ (-28342749);
                        i12 = 642991925;
                    }
                    i29 = iM2567 ^ i12;
                    i28 = i11;
                    onClickListener = onClickListener;
                    break;
                case -1656497687:
                case 1445635951:
                    iM6985 = 2120128979 ^ C2105.m6981(C0422.m1955(sArr5, 32, 3, i32));
                    int iM25615 = (C0630.m2566("᩷ۡ") + i27) * 37;
                    i13 = ((iM25615 ^ i26) * (-32403)) ^ (-1710970691);
                    i29 = iM25615 ^ (-1511883425);
                    i28 = i13;
                    editText = editText;
                    onClickListener = onClickListener;
                    break;
                case -1636825653:
                case -1439633349:
                    onClickListener = onClickListener;
                    editText = editText;
                    radioButton4 = radioButton4;
                    i7 = i30;
                    i8 = iM6985;
                    radioButtonArr[c2] = radioButton6;
                    radioButton2 = radioButtonArr[z ? 1 : 0];
                    sArr3 = f9988;
                    i39 = 20;
                    i40 = 3;
                    if (C7106.f21815 != 0) {
                        iM2566 = C2105.m6981("ܺۜ") ^ i27;
                        i9 = ((iM2566 ^ i26) * 24813) ^ 763566599;
                        i10 = -1996995101;
                    } else {
                        iM2566 = (i26 - C0630.m2566("᩺֡")) * (-107);
                        i9 = ((iM2566 ^ i27) * 19389) ^ 1049841952;
                        i10 = 178960428;
                    }
                    i29 = iM2566 ^ i10;
                    i28 = i9;
                    i30 = i7;
                    iM6985 = i8;
                    radioButton4 = radioButton4;
                    editText = editText;
                    onClickListener = onClickListener;
                    break;
                case -1634931880:
                case -1235392372:
                    onClickListener = onClickListener;
                    editText = editText;
                    radioButton4 = radioButton4;
                    i7 = i30;
                    i8 = iM6985;
                    short[] sArr7 = sArr4;
                    int i42 = i37;
                    iM25613 = C0630.m2566(C3432.m10488(sArr7, i42, 3, i32)) ^ 2122841330;
                    if (C2272.f7362) {
                        sArr4 = sArr7;
                        i37 = i42;
                        iM2566 = C2105.m6981("ܺۜ") ^ i27;
                        i9 = ((iM2566 ^ i26) * 24813) ^ 763566599;
                        i10 = -1996995101;
                        i29 = iM2566 ^ i10;
                        i28 = i9;
                    } else {
                        int iM25616 = (C0630.m2566("ۢܺ") + i26) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        sArr4 = sArr7;
                        i29 = iM25616 ^ (-2129439630);
                        i28 = ((iM25616 ^ i27) * 24605) ^ (-746804356);
                        i37 = i42;
                    }
                    i30 = i7;
                    iM6985 = i8;
                    radioButton4 = radioButton4;
                    editText = editText;
                    onClickListener = onClickListener;
                    break;
                case -1416351411:
                case 1858792363:
                    abstractActivityC3346 = abstractActivityC3346;
                    onClickListener = onClickListener;
                    editText = editText;
                    radioButton4 = radioButton4;
                    sArr2 = sArr2;
                    sArr3 = sArr3;
                    i39 = i39;
                    i40 = i40;
                    i30 = i30;
                    iM6985 = iM6985;
                    i38 = i38;
                    s = f9988[7];
                    i24 = s * s;
                    if (C3911.f12484 < 0) {
                        iM2568 = C0630.m2566("֡ۗ") ^ i27;
                        i14 = ((iM2568 ^ i26) * (-1993)) ^ (-986057904);
                        i15 = -659401215;
                        int i43 = iM2568 ^ i15;
                        i38 = i38;
                        i30 = i30;
                        iM6985 = iM6985;
                        sArr3 = sArr3;
                        i39 = i39;
                        i40 = i40;
                        sArr2 = sArr2;
                        i29 = i43;
                        i28 = i14;
                        radioButton4 = radioButton4;
                        editText = editText;
                        onClickListener = onClickListener;
                        abstractActivityC3346 = abstractActivityC3346;
                    } else {
                        abstractActivityC3346 = abstractActivityC3346;
                        iM2569 = (i26 - C0630.m2566("۫ۜ")) * (-75);
                        i16 = ((iM2569 ^ i27) * 30339) ^ 650159417;
                        i20 = -1322632756;
                        i18 = iM2569 ^ i20;
                        i38 = i38;
                        iM6985 = iM6985;
                        sArr3 = sArr3;
                        i39 = i39;
                        i40 = i40;
                        sArr2 = sArr2;
                        i29 = i18;
                        i28 = i16;
                        radioButton4 = radioButton4;
                        i30 = i30;
                        onClickListener = onClickListener;
                        editText = editText;
                    }
                    break;
                case -1387543323:
                case -1310524057:
                    onClickListener = onClickListener;
                    editText = (EditText) C11340.m28028(viewM9259, iM6987 ^ 2103079459);
                    sArr5 = f9988;
                    if (C3911.m11924() > 0) {
                        iM2567 = C0630.m2566("۟ۢ") ^ i27;
                        i11 = ((iM2567 ^ i26) * (-22355)) ^ 700898175;
                        i12 = 384289374;
                        i29 = iM2567 ^ i12;
                        i28 = i11;
                        onClickListener = onClickListener;
                    }
                    editText = editText;
                    radioButton4 = radioButton4;
                    i7 = i30;
                    i8 = iM6985;
                    iM2566 = (C0630.m2566("ۧ֨") ^ i27) * (-61);
                    i9 = ((iM2566 ^ i26) * 15641) ^ 489323869;
                    i10 = -843936770;
                    i29 = iM2566 ^ i10;
                    i28 = i9;
                    i30 = i7;
                    iM6985 = i8;
                    radioButton4 = radioButton4;
                    editText = editText;
                    onClickListener = onClickListener;
                    break;
                case -1382848632:
                case -515495861:
                    onClickListener = onClickListener;
                    editText = editText;
                    radioButton4 = radioButton4;
                    i7 = i30;
                    i8 = iM6985;
                    iM25611 = C0630.m2566(C1128.m3841(f9988, 23, 3, i32));
                    i36 = 2123579346;
                    if (C3245.f10203 <= 0) {
                        iM2566 = (C0630.m2566("ۧ֨") ^ i27) * (-61);
                        i9 = ((iM2566 ^ i26) * 15641) ^ 489323869;
                        i10 = -843936770;
                    } else {
                        iM2566 = (i27 - C2105.m6981("֨ۛ")) * 15;
                        i9 = ((iM2566 ^ i26) * 30861) ^ 887897377;
                        i10 = -1990931941;
                    }
                    i29 = iM2566 ^ i10;
                    i28 = i9;
                    i30 = i7;
                    iM6985 = i8;
                    radioButton4 = radioButton4;
                    editText = editText;
                    onClickListener = onClickListener;
                    break;
                case -1376471369:
                case 412047308:
                    c19258M2130 = C0483.m2130(abstractActivityC3346);
                    C0798.m3013(c19258M2130, viewM9259);
                    onClickListener = onClickListener;
                    iM25612 = C0630.m2566(C1420.m4902(f9988, 35, 3, i32));
                    iM2567 = C0630.m2566("᩸֫") ^ i26;
                    i11 = ((iM2567 ^ i27) * 22117) ^ (-1624412476);
                    i12 = -2047568394;
                    i29 = iM2567 ^ i12;
                    i28 = i11;
                    onClickListener = onClickListener;
                    break;
                case -1368910686:
                case -606530707:
                    i32 = 43572;
                    iM2568 = C0630.m2566("᩻ᩳ") ^ i27;
                    i14 = ((iM2568 ^ i26) * (-8363)) ^ (-949042469);
                    i15 = -2093667721;
                    int i44 = iM2568 ^ i15;
                    i38 = i38;
                    i30 = i30;
                    iM6985 = iM6985;
                    sArr3 = sArr3;
                    i39 = i39;
                    i40 = i40;
                    sArr2 = sArr2;
                    i29 = i44;
                    i28 = i14;
                    radioButton4 = radioButton4;
                    editText = editText;
                    onClickListener = onClickListener;
                    abstractActivityC3346 = abstractActivityC3346;
                    break;
                case -1256792940:
                case -22071854:
                    i4 = i40;
                    radioButton5 = (RadioButton) C11340.m28028(viewM9259, C0630.m2566(strM10748) ^ 2125396188);
                    sArr2 = f9988;
                    i38 = 14;
                    iM6982 = (i26 - C2105.m6981("᩻ۤ")) * (-27);
                    i5 = ((iM6982 ^ i27) * (-20195)) ^ (-1238211727);
                    i6 = -646474081;
                    i29 = iM6982 ^ i6;
                    i28 = i5;
                    i30 = i30;
                    iM6985 = iM6985;
                    sArr3 = sArr3;
                    i39 = i39;
                    i40 = i4;
                    radioButton4 = radioButton4;
                    editText = editText;
                    onClickListener = onClickListener;
                    break;
                case -1252550643:
                case 1558274035:
                    C1773.m5908();
                    C0798.m2998();
                    onClickListener = onClickListener;
                    editText = editText;
                    radioButton4 = radioButton4;
                    sArr3 = sArr3;
                    i39 = i39;
                    i40 = i40;
                    i30 = i30;
                    iM6985 = iM6985;
                    i38 = i38;
                    iM2569 = (i26 - C0630.m2566("۫ۜ")) * (-75);
                    i16 = ((iM2569 ^ i27) * 30339) ^ 650159417;
                    i20 = -1322632756;
                    i18 = iM2569 ^ i20;
                    i38 = i38;
                    iM6985 = iM6985;
                    sArr3 = sArr3;
                    i39 = i39;
                    i40 = i40;
                    sArr2 = sArr2;
                    i29 = i18;
                    i28 = i16;
                    radioButton4 = radioButton4;
                    i30 = i30;
                    onClickListener = onClickListener;
                    editText = editText;
                    break;
                case -1044705772:
                case 273745020:
                    i32 = 56430;
                    iM2568 = C0630.m2566("᩻ᩳ") ^ i27;
                    i14 = ((iM2568 ^ i26) * (-8363)) ^ (-949042469);
                    i15 = -2093667721;
                    int i45 = iM2568 ^ i15;
                    i38 = i38;
                    i30 = i30;
                    iM6985 = iM6985;
                    sArr3 = sArr3;
                    i39 = i39;
                    i40 = i40;
                    sArr2 = sArr2;
                    i29 = i45;
                    i28 = i14;
                    radioButton4 = radioButton4;
                    editText = editText;
                    onClickListener = onClickListener;
                    abstractActivityC3346 = abstractActivityC3346;
                    break;
                case -946754841:
                case 1840044768:
                    radioButton = (RadioButton) C11340.m28028(viewM9259, iM25614);
                    i4 = i40;
                    iM6986 = C2105.m6981(RunnableC1937.m6385(f9988, 17, 3, i32));
                    iM6982 = C0630.m2566("᩶۬") ^ i27;
                    i5 = ((iM6982 ^ i26) * 6579) ^ (-1391593320);
                    i6 = -1091790772;
                    i29 = iM6982 ^ i6;
                    i28 = i5;
                    i30 = i30;
                    iM6985 = iM6985;
                    sArr3 = sArr3;
                    i39 = i39;
                    i40 = i4;
                    radioButton4 = radioButton4;
                    editText = editText;
                    onClickListener = onClickListener;
                    break;
                case -902791183:
                case 1951774049:
                    break;
                case -876547266:
                case 842076270:
                    C0483.m2135(c19258M2130, z);
                    final DialogInterfaceC0206 dialogInterfaceC0206M11213 = C3683.m11213(c19258M2130);
                    final EditText editText2 = editText;
                    C2126.m7039(C22628.m50609(dialogInterfaceC0206M11213), new View.OnClickListener() { // from class: l.ܶۤܿ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) throws Throwable {
                            C3178.m9738(this.f46349, radioButtonArr, bArr, bArr2, dialogInterfaceC0206M11213, editText2);
                        }
                    });
                    break;
                case -421081557:
                case 1393961731:
                    AbstractActivityC3346 abstractActivityC3347 = abstractActivityC3346;
                    onClickListener = onClickListener;
                    editText = editText;
                    radioButton4 = radioButton4;
                    short[] sArr8 = sArr2;
                    short[] sArr9 = sArr3;
                    int i46 = i39;
                    int i47 = i40;
                    i30 = i30;
                    int i48 = iM6985;
                    int i49 = i38;
                    int i50 = i24 + 66194496;
                    short s2 = s;
                    int i51 = s2 + 8136;
                    if ((i51 * i51) - (i50 + i50) <= 0) {
                        iM6983 = (C0630.m2566("ܳۨ") + i26) * (-19);
                        i16 = ((iM6983 ^ i27) * 3573) ^ 255748892;
                        i17 = -1259728482;
                    } else {
                        iM6983 = C2105.m6981("۫ۡ") ^ i26;
                        i16 = ((iM6983 ^ i27) * 23295) ^ 741700816;
                        i17 = -1041705632;
                    }
                    i18 = iM6983 ^ i17;
                    s = s2;
                    i38 = i49;
                    iM6985 = i48;
                    sArr3 = sArr9;
                    i39 = i46;
                    i40 = i47;
                    sArr2 = sArr8;
                    abstractActivityC3346 = abstractActivityC3347;
                    i29 = i18;
                    i28 = i16;
                    radioButton4 = radioButton4;
                    i30 = i30;
                    onClickListener = onClickListener;
                    editText = editText;
                    break;
                case 56388437:
                case 1959301662:
                    ServiceConnectionC3453.m10564();
                    if (!C2520.m8026()) {
                        onClickListener = onClickListener;
                        editText = editText;
                        radioButton4 = radioButton4;
                        sArr3 = sArr3;
                        i39 = i39;
                        i40 = i40;
                        i30 = i30;
                        iM6985 = iM6985;
                        i38 = i38;
                        iM2569 = (i26 - C0630.m2566("۫ۜ")) * (-75);
                        i16 = ((iM2569 ^ i27) * 30339) ^ 650159417;
                        i20 = -1322632756;
                        i18 = iM2569 ^ i20;
                        i38 = i38;
                        iM6985 = iM6985;
                        sArr3 = sArr3;
                        i39 = i39;
                        i40 = i40;
                        sArr2 = sArr2;
                        i29 = i18;
                        i28 = i16;
                        radioButton4 = radioButton4;
                        i30 = i30;
                        onClickListener = onClickListener;
                        editText = editText;
                    } else {
                        iM25610 = (C2105.m6981("ܿۘ") + i26) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i22 = ((iM25610 ^ i27) * 367) ^ 1848147295;
                        i23 = -1816624636;
                        i29 = iM25610 ^ i23;
                        i28 = i22;
                    }
                    break;
                case 143830395:
                case 869029790:
                    onClickListener = onClickListener;
                    editText = editText;
                    radioButton4 = radioButton4;
                    sArr2 = sArr2;
                    sArr3 = sArr3;
                    i39 = i39;
                    i40 = i40;
                    i30 = i30;
                    iM6985 = iM6985;
                    i38 = i38;
                    AbstractActivityC3346 abstractActivityC3348 = c3178.f9989;
                    int iM6989 = C2105.m6981(C2520.m8030(f9988, 8, 3, i32));
                    i35 = 2130272305;
                    if (C3432.f10845 < 0) {
                        int iM69810 = (C2105.m6981("ۘ۟") + i27) * 55;
                        i19 = ((iM69810 ^ i26) * (-28917)) ^ 538563345;
                        i38 = i38;
                        iM6985 = iM6985;
                        sArr3 = sArr3;
                        i39 = i39;
                        i40 = i40;
                        sArr2 = sArr2;
                        i29 = iM69810 ^ (-2092541066);
                        radioButton4 = radioButton4;
                        abstractActivityC3346 = abstractActivityC3348;
                        onClickListener = onClickListener;
                        i34 = iM6989;
                        i28 = i19;
                        i30 = i30;
                        editText = editText;
                    } else {
                        abstractActivityC3346 = abstractActivityC3348;
                        i34 = iM6989;
                        iM2569 = (i26 - C0630.m2566("۫ۜ")) * (-75);
                        i16 = ((iM2569 ^ i27) * 30339) ^ 650159417;
                        i20 = -1322632756;
                        i18 = iM2569 ^ i20;
                        i38 = i38;
                        iM6985 = iM6985;
                        sArr3 = sArr3;
                        i39 = i39;
                        i40 = i40;
                        sArr2 = sArr2;
                        i29 = i18;
                        i28 = i16;
                        radioButton4 = radioButton4;
                        i30 = i30;
                        onClickListener = onClickListener;
                        editText = editText;
                    }
                    break;
                case 310260595:
                case 1042285761:
                    ViewOnClickListenerC1958.m6429();
                    C0050.m940();
                    break;
                case 989351591:
                case 1671341164:
                    C4159.m12564(radioButtonArr[i30], onClickListener);
                    i21 = i30 + 1;
                    editText = editText;
                    int iM69811 = (C2105.m6981("᩻۫") ^ i26) * 119;
                    i30 = i21;
                    i19 = ((iM69811 ^ i27) * (-19449)) ^ 1164078710;
                    i29 = iM69811 ^ 1357183093;
                    i28 = i19;
                    i30 = i30;
                    editText = editText;
                    break;
                case 1023322250:
                case 1414439823:
                    obj = null;
                    C1294.m4380(c19258M2130, iM25612 ^ 2100311495, null);
                    sArr6 = f9988;
                    i33 = 38;
                    if (C4117.f13076 <= 0) {
                        iM25610 = (C2105.m6981("ܿۘ") + i26) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i22 = ((iM25610 ^ i27) * 367) ^ 1848147295;
                        i23 = -1816624636;
                    } else {
                        iM25610 = (i26 - C0630.m2566("ۛۢ")) * 81;
                        i22 = ((iM25610 ^ i27) * 15271) ^ (-1338196755);
                        i23 = 1690421324;
                    }
                    i29 = iM25610 ^ i23;
                    i28 = i22;
                    break;
                case 1065795487:
                case 1309412707:
                    C2520.m8029(c19258M2130, C2105.m6981(C3911.m11919(sArr6, i33, 3, i32)) ^ 2125010341, obj);
                    iM25610 = (C2105.m6981("ۗ۬") + i27) * (-5);
                    i22 = ((iM25610 ^ i26) * (-27101)) ^ (-1908338693);
                    i23 = -1912390483;
                    i29 = iM25610 ^ i23;
                    i28 = i22;
                    break;
                case 1403780659:
                case 1775413580:
                    onClickListener = onClickListener;
                    editText = editText;
                    radioButton4 = radioButton4;
                    short[] sArr10 = sArr3;
                    i30 = i30;
                    iM6985 = iM6985;
                    int i52 = i39;
                    i = i40;
                    sArr3 = sArr10;
                    String strM12251 = C4075.m12251(C2105.m6981(C3019.m9250(sArr10, i52, i, i32)) ^ 2130705073);
                    i39 = i52;
                    RadioButton radioButton7 = radioButton2;
                    C4263.m12823(radioButton7, strM12251);
                    radioButton3 = radioButtonArr[c];
                    iM6981 = C2105.m6981("ܰ֡") ^ i26;
                    radioButton2 = radioButton7;
                    i2 = ((iM6981 ^ i27) * (-24609)) ^ 985693810;
                    i3 = 822067312;
                    i29 = iM6981 ^ i3;
                    i28 = i2;
                    i40 = i;
                    i30 = i30;
                    iM6985 = iM6985;
                    sArr3 = sArr3;
                    i39 = i39;
                    radioButton4 = radioButton4;
                    editText = editText;
                    onClickListener = onClickListener;
                    break;
                default:
                    int i53 = iM6985;
                    int i54 = i30;
                    RadioButton radioButton8 = radioButton3;
                    C0964.m3404(radioButton8, C4075.m12251(iM25611 ^ i36));
                    RadioButton radioButton9 = radioButtonArr[c2];
                    sArr4 = f9988;
                    i37 = 26;
                    int iM25617 = (C0630.m2566("ܳۜ") ^ i27) * (-9);
                    i13 = ((iM25617 ^ i26) * (-3669)) ^ (-821181393);
                    i29 = iM25617 ^ (-1587071433);
                    radioButton3 = radioButton8;
                    i30 = i54;
                    iM6985 = i53;
                    radioButton4 = radioButton9;
                    i28 = i13;
                    editText = editText;
                    onClickListener = onClickListener;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x03db A[PHI: r8 r9 r17
      0x03db: PHI (r8v2 short[]) = (r8v1 short[]), (r8v1 short[]), (r8v3 short[]) binds: [B:103:0x03d9, B:85:0x0301, B:81:0x02e2] A[DONT_GENERATE, DONT_INLINE]
      0x03db: PHI (r9v2 char) = (r9v1 char), (r9v1 char), (r9v3 char) binds: [B:103:0x03d9, B:85:0x0301, B:81:0x02e2] A[DONT_GENERATE, DONT_INLINE]
      0x03db: PHI (r17v7 'e' java.lang.Exception) = (r17v2 'e' java.lang.Exception), (r17v6 'e' java.lang.Exception), (r17v8 'e' java.lang.Exception) binds: [B:103:0x03d9, B:85:0x0301, B:81:0x02e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:112:0x0440 A[PHI: r17
      0x0440: PHI (r17v24 'e' java.lang.Exception) = (r17v0 'e' java.lang.Exception), (r17v3 'e' java.lang.Exception), (r17v25 'e' java.lang.Exception) binds: [B:111:0x043e, B:99:0x03b7, B:18:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e4, code lost:
    
        if (l.C0237.f1507 == 0) goto L26;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m9738(C3178 c3178, RadioButton[] radioButtonArr, byte[] bArr, byte[] bArr2, DialogInterfaceC0206 dialogInterfaceC0206, EditText editText) throws Throwable {
        int iM6981;
        int i;
        int iM6982;
        int i2;
        int iM6983;
        int i3;
        int iM2566 = 0;
        short[] sArr = null;
        char c = 0;
        int i4 = 0;
        int i5 = -1368616626;
        int i6 = C3245.f10203;
        int i7 = C4075.f12947;
        int iM2567 = C0630.m2566("ܰ᩺") ^ i7;
        int i8 = ((iM2567 ^ i6) * 22281) ^ (-1444937767);
        int i9 = iM2567 ^ 1437519052;
        AbstractActivityC3346 abstractActivityC3346 = null;
        Exception e = null;
        Object obj = null;
        AbstractC15440 abstractC15440 = null;
        while (true) {
            i5 = ((((i5 ^ i6) * (-3765)) >> 31) & i8) ^ i9;
            switch (i5) {
                case -2134950469:
                case -1092145350:
                    C2958.m9034();
                    ViewOnClickListenerC1958.m6429();
                    break;
                case -2130551333:
                case 830360865:
                    e = e;
                    sArr = f9988;
                    c = ')';
                    if (C3683.m11222()) {
                        iM6981 = C0630.m2566("ۙۤ") ^ i6;
                        i8 = ((iM6981 ^ i7) * 141) ^ (-90584205);
                        i = 1459204360;
                    } else {
                        iM6981 = C0630.m2566("ܺܺ") ^ i6;
                        i8 = ((iM6981 ^ i7) * 20693) ^ 1432087370;
                        i = -1384085926;
                    }
                    i9 = iM6981 ^ i;
                    e = e;
                    break;
                case -1958207153:
                case 1290962727:
                    e = e;
                    obj = null;
                    if (C2167.m7157(radioButtonArr[1])) {
                        iM6981 = (C2105.m6981("ۚۚ") ^ i6) * (-99);
                        i8 = ((iM6981 ^ i7) * (-4435)) ^ (-2077543146);
                        i = 1342887130;
                    } else {
                        iM6981 = C0630.m2566("ۙ᩵") ^ i7;
                        i8 = ((iM6981 ^ i6) * 5627) ^ (-725764992);
                        i = 1363378329;
                    }
                    i9 = iM6981 ^ i;
                    e = e;
                    break;
                case -1945524774:
                case -232481997:
                    C0483.m2121();
                    C0964.m3413();
                    e = e;
                    iM6981 = C2105.m6981("֨ۘ") ^ i7;
                    i8 = ((iM6981 ^ i6) * 971) ^ 1827080193;
                    i = 149199443;
                    i9 = iM6981 ^ i;
                    e = e;
                    break;
                case -1879492238:
                case -1088135288:
                    e = e;
                    short s = sArr[c];
                    if ((s * 5976) - ((s * s) + 8928144) <= 0) {
                        iM6981 = (i7 - C2105.m6981("ۨ᩸")) * (-109);
                        i8 = ((iM6981 ^ i6) * 12115) ^ 1201351631;
                        i = -112297632;
                    } else {
                        iM6981 = C0630.m2566("ܺۙ") ^ i7;
                        i8 = ((iM6981 ^ i6) * 21833) ^ 629372005;
                        i = -802065949;
                    }
                    i9 = iM6981 ^ i;
                    e = e;
                    break;
                case -1641390641:
                case -1054827693:
                case 315582972:
                case 1769670736:
                    break;
                case -1498389603:
                case 120600211:
                    e = e;
                    if (C0714.f2697 >= 0) {
                        iM6981 = C0630.m2566("ۖܰ") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-301)) ^ 1777955750;
                        i = 1401851248;
                    } else {
                        iM6981 = C0630.m2566("ۧ۫") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-3435)) ^ 1485056223;
                        i = 1592542211;
                    }
                    i9 = iM6981 ^ i;
                    e = e;
                    break;
                case -1486651431:
                case -654917996:
                    e = e;
                    if (C1128.f4106 <= 0) {
                        iM6981 = (i7 - C0630.m2566("ۤ۟")) * 35;
                        i8 = ((iM6981 ^ i6) * (-7181)) ^ (-1189732594);
                        i = -1719876051;
                    } else {
                        iM6981 = (i7 - C2105.m6981("ۘܿ")) * 93;
                        i8 = ((iM6981 ^ i6) * (-25431)) ^ 1512166373;
                        i = -1439920868;
                    }
                    i9 = iM6981 ^ i;
                    e = e;
                    break;
                case -1445525705:
                case 54751609:
                    try {
                        e = e;
                        AbstractC15440 abstractC15440M46628 = C20319.m46628(C8863.m22897(), abstractC15440.m36517(), bArr, bArr2, C0050.m947(C4117.m12350(editText)));
                        C0422.m1956();
                        C1504.m5172(dialogInterfaceC0206);
                        c3178.f9992.accept(abstractC15440M46628);
                        iM6982 = (i6 - C2105.m6981("᩸᩶")) * (-115);
                        i8 = 568611637 ^ ((iM6982 ^ i7) * 7513);
                        i2 = -310194894;
                        i9 = i2 ^ iM6982;
                        e = e;
                    } catch (Exception e2) {
                        e = e2;
                        iM6983 = (C2105.m6981("ܺ۬") + i6) * (-23);
                        i8 = ((iM6983 ^ i7) * (-27375)) ^ 1534251652;
                        i3 = 322160161;
                        i9 = iM6983 ^ i3;
                    }
                    break;
                case -1442312263:
                case -652705795:
                    e = e;
                    AbstractC15440 abstractC15440M13999 = C4796.m13999(C8863.m22897(), abstractC15440.m36517(), bArr, bArr2);
                    C0422.m1956();
                    C1504.m5172(dialogInterfaceC0206);
                    c3178.f9992.accept(abstractC15440M13999);
                    iM6982 = (i7 - C2105.m6981("᩹ۨ")) * 9;
                    i8 = 207756856 ^ ((iM6982 ^ i6) * (-25073));
                    i2 = 171316162;
                    i9 = i2 ^ iM6982;
                    e = e;
                    break;
                case -1430610525:
                case -881418913:
                    C4263.m12821(new C20112(c3178, bArr, bArr2, dialogInterfaceC0206));
                    break;
                case -1317538483:
                case -571136930:
                    e = e;
                    if (C21923.m49329()) {
                        iM6981 = (i7 - C0630.m2566("ۤ۟")) * 35;
                        i8 = ((iM6981 ^ i6) * (-7181)) ^ (-1189732594);
                        i = -1719876051;
                    } else {
                        iM6981 = (C2105.m6981("۟ܶ") + i7) * 119;
                        i8 = ((iM6981 ^ i6) * (-24313)) ^ (-812740103);
                        i = 1703648874;
                    }
                    i9 = iM6981 ^ i;
                    e = e;
                    break;
                case -1235361161:
                case 218421665:
                    e = e;
                    if (C3683.f11629 >= 0) {
                        iM6981 = C0630.m2566("ۙۤ") ^ i6;
                        i8 = ((iM6981 ^ i7) * 141) ^ (-90584205);
                        i = 1459204360;
                    } else {
                        iM6981 = C0630.m2566("ۢܰ") ^ i6;
                        i8 = ((iM6981 ^ i7) * 2577) ^ 375145956;
                        i = 319277511;
                    }
                    i9 = iM6981 ^ i;
                    e = e;
                    break;
                case -936856627:
                case 1675812180:
                    break;
                case -643232967:
                case 1026133402:
                    if (C1711.m5736() > 0) {
                        e = e;
                        iM6981 = C2105.m6981("ܳ᩶") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-20521)) ^ (-1756962276);
                        i = -1368390639;
                        i9 = iM6981 ^ i;
                        e = e;
                    }
                    e = e;
                    iM6981 = C2105.m6981("֨ۘ") ^ i7;
                    i8 = ((iM6981 ^ i6) * 971) ^ 1827080193;
                    i = 149199443;
                    i9 = iM6981 ^ i;
                    e = e;
                    break;
                case -466938152:
                case -389330742:
                    e = e;
                    if (C3432.m10477() <= 0) {
                        iM6981 = C2105.m6981("֨ۘ") ^ i7;
                        i8 = ((iM6981 ^ i6) * 971) ^ 1827080193;
                        i = 149199443;
                    } else {
                        iM6981 = (C0630.m2566("۠ۧ") + i6) * (-7);
                        i8 = ((iM6981 ^ i7) * (-29291)) ^ 2101660351;
                        i = 1777288169;
                    }
                    i9 = iM6981 ^ i;
                    e = e;
                    break;
                case -462548396:
                case -83324078:
                    e = e;
                    if (RunnableC1937.m6384(editText) == 0) {
                        iM6982 = (C0630.m2566("᩹᩶") + i6) * 77;
                        i8 = (-744416021) ^ ((iM6982 ^ i7) * 5963);
                        i2 = -1284474087;
                    } else {
                        iM6982 = C2105.m6981("ᩴ۟") ^ i7;
                        i8 = (-707849725) ^ ((iM6982 ^ i6) * 24439);
                        i2 = 563031044;
                    }
                    i9 = i2 ^ iM6982;
                    e = e;
                    break;
                case -452628818:
                case 2021065268:
                    if (C1047.f3863 >= 0) {
                        iM6983 = (i6 - C2105.m6981("۬᩹")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i8 = ((iM6983 ^ i7) * 11659) ^ (-144631360);
                        i3 = 1665741734;
                    } else {
                        iM6983 = (C2105.m6981("ۧۢ") + i7) * (-99);
                        i8 = ((iM6983 ^ i6) * 31839) ^ (-788893814);
                        i3 = 226485285;
                    }
                    i9 = iM6983 ^ i3;
                    break;
                case -381292926:
                case 2129772263:
                    C0050.m940();
                    if (C2958.f9394 >= 0) {
                        iM6983 = (i6 - C2105.m6981("۬᩹")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i8 = ((iM6983 ^ i7) * 11659) ^ (-144631360);
                        i3 = 1665741734;
                        i9 = iM6983 ^ i3;
                    } else {
                        e = e;
                        iM6981 = C2105.m6981("֨ۘ") ^ i7;
                        i8 = ((iM6981 ^ i6) * 971) ^ 1827080193;
                        i = 149199443;
                        i9 = iM6981 ^ i;
                        e = e;
                    }
                    break;
                case -334620648:
                case 1524965472:
                    iM2566 = C0630.m2566(C4616.m13542(f9988, 42, 3, i4));
                    if (!C1916.f6442) {
                        e = e;
                        iM6981 = C2105.m6981("᩻۬") ^ i7;
                        i8 = ((iM6981 ^ i6) * (-20275)) ^ 1417161527;
                        i = -265344963;
                        i9 = iM6981 ^ i;
                        e = e;
                    } else {
                        iM6983 = C0630.m2566("ܿۤ") ^ i7;
                        i8 = ((iM6983 ^ i6) * (-16415)) ^ (-1629457826);
                        i3 = -466758934;
                        i9 = iM6983 ^ i3;
                    }
                    break;
                case -313003078:
                case 1912016386:
                    C0422.m1963();
                    if (C3245.f10203 <= 0) {
                        iM6983 = (i6 - C0630.m2566("ܶۡ")) * (-125);
                        i8 = ((iM6983 ^ i7) * 27473) ^ 548859078;
                        i3 = -484907846;
                    } else {
                        iM6983 = (C0630.m2566("ܺܰ") ^ i7) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i8 = ((iM6983 ^ i6) * 8667) ^ 1644759591;
                        i3 = 1315324393;
                    }
                    i9 = iM6983 ^ i3;
                    break;
                case -286081772:
                case 186253487:
                    if (C2105.f7037 != 0) {
                        iM6983 = (i6 - C0630.m2566("ܶۡ")) * (-125);
                        i8 = ((iM6983 ^ i7) * 27473) ^ 548859078;
                        i3 = -484907846;
                        i9 = iM6983 ^ i3;
                    } else {
                        e = e;
                        iM6981 = (i7 - C0630.m2566("ۤ۟")) * 35;
                        i8 = ((iM6981 ^ i6) * (-7181)) ^ (-1189732594);
                        i = -1719876051;
                        i9 = iM6981 ^ i;
                        e = e;
                    }
                    break;
                case -197687093:
                case 667825693:
                    ServiceConnectionC3453.m10561(abstractActivityC3346, e, obj);
                    break;
                case -79808053:
                case -61775979:
                    e = e;
                    abstractActivityC3346 = c3178.f9989;
                    abstractC15440 = c3178.f9991;
                    if (C2167.m7157(radioButtonArr[0])) {
                        iM6981 = (C0630.m2566("ᩴ᩺") ^ i7) * (-29);
                        i8 = ((iM6981 ^ i6) * 16703) ^ (-1321151310);
                        i = 659009529;
                    } else {
                        iM6981 = (C0630.m2566("۫ۙ") + i6) * 69;
                        i8 = ((iM6981 ^ i7) * (-30895)) ^ 1442733790;
                        i = 100859177;
                    }
                    i9 = iM6981 ^ i;
                    e = e;
                    break;
                case 99072436:
                case 2090188943:
                    e = e;
                    if (C0630.f2410 <= 0) {
                        iM6981 = C0630.m2566("ۙۤ") ^ i6;
                        i8 = ((iM6981 ^ i7) * 141) ^ (-90584205);
                        i = 1459204360;
                    } else {
                        iM6981 = (C0630.m2566("ۗ᩻") ^ i6) * 27;
                        i8 = ((iM6981 ^ i7) * 15227) ^ 2053400729;
                        i = 2048980080;
                    }
                    i9 = iM6981 ^ i;
                    e = e;
                    break;
                case 147959096:
                case 1211549031:
                    i4 = 8959;
                    iM6981 = C2105.m6981("ܳ֫") ^ i6;
                    i8 = ((iM6981 ^ i7) * 20023) ^ 422024966;
                    i = -649624197;
                    i9 = iM6981 ^ i;
                    e = e;
                    break;
                case 850463482:
                case 1732760350:
                    e = e;
                    if (C0050.f910 >= 0) {
                        iM6981 = C2105.m6981("᩻۬") ^ i7;
                        i8 = ((iM6981 ^ i6) * (-20275)) ^ 1417161527;
                        i = -265344963;
                    } else {
                        iM6981 = (C0630.m2566("᩻۫") + i7) * 109;
                        i8 = ((iM6981 ^ i6) * 7125) ^ 1635482038;
                        i = -1501891841;
                    }
                    i9 = iM6981 ^ i;
                    e = e;
                    break;
                case 987178905:
                case 1225610466:
                    C2520.m8026();
                    if (C2105.f7037 != 0) {
                        e = e;
                        iM6981 = C0630.m2566("ۖܰ") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-301)) ^ 1777955750;
                        i = 1401851248;
                        i9 = iM6981 ^ i;
                        e = e;
                    }
                    e = e;
                    iM6981 = (i7 - C0630.m2566("ۤ۟")) * 35;
                    i8 = ((iM6981 ^ i6) * (-7181)) ^ (-1189732594);
                    i = -1719876051;
                    i9 = iM6981 ^ i;
                    e = e;
                    break;
                case 991118951:
                case 1954558539:
                    C1773.m5908();
                    if (C3019.f9544 >= 0) {
                        e = e;
                        iM6981 = C2105.m6981("᩻۬") ^ i7;
                        i8 = ((iM6981 ^ i6) * (-20275)) ^ 1417161527;
                        i = -265344963;
                        i9 = iM6981 ^ i;
                        e = e;
                    } else {
                        iM6983 = (C0630.m2566("ܺܰ") ^ i7) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i8 = ((iM6983 ^ i6) * 8667) ^ 1644759591;
                        i3 = 1315324393;
                        i9 = iM6983 ^ i3;
                    }
                    break;
                case 1219096956:
                case 1819681975:
                    C1504.m5167(2100921313 ^ iM2566);
                    C0798.m3010(editText);
                    break;
                case 1483376356:
                case 1976177446:
                    i4 = 36723;
                    iM6981 = C2105.m6981("ܳ֫") ^ i6;
                    i8 = ((iM6981 ^ i7) * 20023) ^ 422024966;
                    i = -649624197;
                    i9 = iM6981 ^ i;
                    e = e;
                    break;
                default:
                    e = e;
                    if (C0050.f910 >= 0) {
                        iM6981 = C2105.m6981("ܳ᩶") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-20521)) ^ (-1756962276);
                        i = -1368390639;
                    } else {
                        iM6981 = (i7 - C0630.m2566("᩶֡")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i8 = ((iM6981 ^ i6) * (-19203)) ^ 244307929;
                        i = 343673029;
                    }
                    i9 = iM6981 ^ i;
                    e = e;
                    break;
            }
            return;
        }
    }
}
