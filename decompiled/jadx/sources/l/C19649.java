package l;

import com.umeng.analytics.pro.o;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Random;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩵ᩴۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: V4FO */
/* JADX INFO: loaded from: classes4.dex */
public final class C19649 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Random f63401;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final char[] f63402;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C13309 f63403;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C17426 f63404;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C17426 f63405;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int f63406;

    /* JADX WARN: Code duplicated, block: B:20:0x00a0 A[PHI: r21
      0x00a0: PHI (r21v4 int) = (r21v3 int), (r21v2 int) binds: [B:19:0x009e, B:7:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0116 A[PHI: r17 r18
      0x0116: PHI (r17v4 int) = (r17v3 int), (r17v2 int) binds: [B:31:0x0114, B:10:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0116: PHI (r18v4 char[]) = (r18v3 char[]), (r18v2 char[]) binds: [B:31:0x0114, B:10:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0209 A[PHI: r8 r11 r13 r15 r16 r19
      0x0209: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:55:0x0207, B:49:0x01c8, B:39:0x016a, B:35:0x0148, B:27:0x00f2] A[DONT_GENERATE, DONT_INLINE]
      0x0209: PHI (r11v4 byte) = (r11v2 byte), (r11v3 byte), (r11v2 byte), (r11v2 byte), (r11v2 byte) binds: [B:55:0x0207, B:49:0x01c8, B:39:0x016a, B:35:0x0148, B:27:0x00f2] A[DONT_GENERATE, DONT_INLINE]
      0x0209: PHI (r13v4 byte) = (r13v2 byte), (r13v2 byte), (r13v3 byte), (r13v2 byte), (r13v2 byte) binds: [B:55:0x0207, B:49:0x01c8, B:39:0x016a, B:35:0x0148, B:27:0x00f2] A[DONT_GENERATE, DONT_INLINE]
      0x0209: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:55:0x0207, B:49:0x01c8, B:39:0x016a, B:35:0x0148, B:27:0x00f2] A[DONT_GENERATE, DONT_INLINE]
      0x0209: PHI (r16v4 int) = (r16v2 int), (r16v2 int), (r16v2 int), (r16v3 int), (r16v2 int) binds: [B:55:0x0207, B:49:0x01c8, B:39:0x016a, B:35:0x0148, B:27:0x00f2] A[DONT_GENERATE, DONT_INLINE]
      0x0209: PHI (r19v3 char) = (r19v2 char), (r19v2 char), (r19v2 char), (r19v2 char), (r19v4 char) binds: [B:55:0x0207, B:49:0x01c8, B:39:0x016a, B:35:0x0148, B:27:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0245 A[PHI: r6 r7 r20
      0x0245: PHI (r6v4 byte[]) = (r6v3 byte[]), (r6v2 byte[]), (r6v2 byte[]), (r6v2 byte[]) binds: [B:59:0x0243, B:23:0x00d4, B:13:0x0085, B:7:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:59:0x0243, B:23:0x00d4, B:13:0x0085, B:7:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r20v4 int) = (r20v2 int), (r20v3 int), (r20v2 int), (r20v2 int) binds: [B:59:0x0243, B:23:0x00d4, B:13:0x0085, B:7:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x02ce A[PHI: r1 r2
      0x02ce: PHI (r1v5 java.security.MessageDigest) = 
      (r1v3 java.security.MessageDigest)
      (r1v2 java.security.MessageDigest)
      (r1v2 java.security.MessageDigest)
      (r1v2 java.security.MessageDigest)
     binds: [B:69:0x02cc, B:13:0x0085, B:10:0x007a, B:5:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x02ce: PHI (r2v5 java.nio.charset.Charset) = 
      (r2v3 java.nio.charset.Charset)
      (r2v2 java.nio.charset.Charset)
      (r2v2 java.nio.charset.Charset)
      (r2v2 java.nio.charset.Charset)
     binds: [B:69:0x02cc, B:13:0x0085, B:10:0x007a, B:5:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m45166(String str) {
        int iM2566;
        int i;
        int i2;
        int i3 = ServiceConnectionC3453.f10921;
        int i4 = ViewOnClickListenerC1958.f6529;
        int iM6981 = (C2105.m6981("۠ۛ") ^ i4) * (-69);
        int i5 = ((iM6981 ^ i3) * 18361) ^ (-2018643998);
        byte[] bArrM5903 = null;
        byte[] bArrDigest = null;
        char[] cArr = null;
        char[] cArr2 = null;
        int i6 = iM6981 ^ (-1406060360);
        int i7 = 0;
        int length = 0;
        int i8 = 0;
        int length2 = 0;
        byte b = 0;
        int i9 = 0;
        byte b2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 968278546;
        int i17 = 0;
        Charset charset = null;
        MessageDigest messageDigestM34526 = null;
        while (true) {
            i16 = i6 ^ (i5 & (((i16 ^ i3) * 31427) >> 31));
            switch (i16) {
                case -2094092505:
                case 552716230:
                    C1773.m5908();
                    if (C4117.m12364() != 0) {
                        iM2566 = C0630.m2566("᩶ܶ") ^ i3;
                        i = ((iM2566 ^ i4) * 407) ^ (-1560423410);
                        i2 = 746103784;
                    } else {
                        iM2566 = C2105.m6981("᩹ᩳ") ^ i3;
                        i = ((iM2566 ^ i4) * (-17439)) ^ 849575845;
                        i2 = 942619387;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -2058979896:
                case 1786216344:
                    if (i7 < bArrM5903.length) {
                        iM2566 = C0630.m2566("᩵֨") ^ i3;
                        i = ((iM2566 ^ i4) * 11019) ^ (-69352);
                        i2 = -809145602;
                    } else {
                        iM2566 = C2105.m6981("ۘ᩶") ^ i3;
                        i = ((iM2566 ^ i4) * 23383) ^ (-671183550);
                        i2 = 1720033624;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1972192586:
                case 770925131:
                    messageDigestM34526.update(bArrM5903);
                    bArrDigest = messageDigestM34526.digest();
                    length = bArrDigest.length;
                    if (C1420.m4913()) {
                        iM2566 = (C2105.m6981("۫ۗ") ^ i4) * (-81);
                        i = ((iM2566 ^ i3) * (-19363)) ^ (-420677409);
                        i2 = -1958348608;
                    } else {
                        iM2566 = C2105.m6981("֫֫") ^ i4;
                        i = ((iM2566 ^ i3) * 1723) ^ (-72910922);
                        i2 = -1636438721;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1676879271:
                case 1934688008:
                    cArr = new char[length << i8];
                    length2 = bArrDigest.length;
                    i9 = i17;
                    i10 = 0;
                    iM2566 = (C2105.m6981("֨᩷") ^ i3) * 85;
                    i = ((iM2566 ^ i4) * 3543) ^ 1864952672;
                    i2 = -189122616;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1617272439:
                case -723812207:
                    ViewOnClickListenerC1958.m6429();
                    if (C1294.m4372() <= 0) {
                        iM2566 = C0630.m2566("᩶ܶ") ^ i3;
                        i = ((iM2566 ^ i4) * 407) ^ (-1560423410);
                        i2 = 746103784;
                    } else {
                        iM2566 = (C2105.m6981("۫ۗ") ^ i4) * (-81);
                        i = ((iM2566 ^ i3) * (-19363)) ^ (-420677409);
                        i2 = -1958348608;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1255889849:
                case -679069004:
                    cArr[i10] = c;
                    i14 = i10 + 2;
                    if (C7106.m19120() <= 0) {
                        iM2566 = (C2105.m6981("۫ۗ") ^ i4) * (-81);
                        i = ((iM2566 ^ i3) * (-19363)) ^ (-420677409);
                        i2 = -1958348608;
                    } else {
                        iM2566 = C2105.m6981("۟ܳ") ^ i4;
                        i = ((iM2566 ^ i3) * (-31239)) ^ 2077127922;
                        i2 = 1077305423;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1140098185:
                case -1064538856:
                    C4263.m12819();
                    return null;
                case -1074557143:
                case 928338831:
                    i12 = b2 >>> 4;
                    if (C4075.f12947 >= 0) {
                        iM2566 = (C2105.m6981("۠ۜ") ^ i4) * 23;
                        i = ((iM2566 ^ i3) * 27043) ^ (-2143697085);
                        i2 = -1616131435;
                    } else {
                        iM2566 = (C0630.m2566("ۡۙ") + i4) * (-77);
                        i = ((iM2566 ^ i3) * 8241) ^ 1823866182;
                        i2 = 1683281809;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1021506279:
                case 590456413:
                    b = (byte) (~bArrM5903[i7]);
                    if (C0798.f2919) {
                        iM2566 = (C2105.m6981("۠ۜ") ^ i4) * 23;
                        i = ((iM2566 ^ i3) * 27043) ^ (-2143697085);
                        i2 = -1616131435;
                    } else {
                        iM2566 = C0630.m2566("ۡ֫") ^ i4;
                        i = ((iM2566 ^ i3) * (-24139)) ^ 1036478734;
                        i2 = 2016253119;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -920895643:
                case 336926796:
                    i15 = b2 & 15;
                    if (AbstractC2021.m6574()) {
                        iM2566 = C0630.m2566("᩹ܰ") ^ i4;
                        i = ((iM2566 ^ i3) * (-6803)) ^ 1487161265;
                        i2 = 1959876646;
                    } else {
                        iM2566 = C0630.m2566("۠֨") ^ i3;
                        i = ((iM2566 ^ i4) * 4269) ^ (-279573274);
                        i2 = -798496386;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -900268952:
                case 824842659:
                    i8 = 1;
                    if (C0630.f2410 <= 0) {
                        iM2566 = (C2105.m6981("۠ۜ") ^ i4) * 23;
                        i = ((iM2566 ^ i3) * 27043) ^ (-2143697085);
                        i2 = -1616131435;
                    } else {
                        iM2566 = C2105.m6981("ۚ֫") ^ i4;
                        i = ((iM2566 ^ i3) * 30665) ^ 83510743;
                        i2 = 661881134;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -781623052:
                case 1061530612:
                    c = cArr2[i13];
                    if (C2167.f7158 >= 0) {
                        iM2566 = (C2105.m6981("۠ۜ") ^ i4) * 23;
                        i = ((iM2566 ^ i3) * 27043) ^ (-2143697085);
                        i2 = -1616131435;
                    } else {
                        iM2566 = C0630.m2566("ۨ᩸") ^ i4;
                        i = ((iM2566 ^ i3) * 26293) ^ 74484208;
                        i2 = -2086310381;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -716062804:
                case -151127721:
                    i13 = i12 & 15;
                    cArr2 = f63402;
                    if (C4616.m13552() != 0) {
                        iM2566 = C2105.m6981("᩹ᩳ") ^ i3;
                        i = ((iM2566 ^ i4) * (-17439)) ^ 849575845;
                        i2 = 942619387;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ۢۜ")) * 49;
                        i = ((iM2566 ^ i4) * 6235) ^ (-1417720709);
                        i2 = -1977437278;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -541586115:
                case 739175010:
                    bArrM5903[i7] = b;
                    i7++;
                    int iM6982 = (C2105.m6981("۬۠") ^ i4) * (-33);
                    i5 = ((iM6982 ^ i3) * 18915) ^ 1271175095;
                    i6 = iM6982 ^ 1293558213;
                    break;
                case -476187261:
                case 1016121030:
                    cArr[i11] = cArr2[i15];
                    i9++;
                    i10 = i14;
                    iM2566 = (C2105.m6981("֨᩷") ^ i3) * 85;
                    i = ((iM2566 ^ i4) * 3543) ^ 1864952672;
                    i2 = -189122616;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -447232538:
                case 259910415:
                    b2 = bArrDigest[i9];
                    i11 = i10 + 1;
                    if (C1294.f4556 >= 0) {
                        iM2566 = (C2105.m6981("۠ۜ") ^ i4) * 23;
                        i = ((iM2566 ^ i3) * 27043) ^ (-2143697085);
                        i2 = -1616131435;
                    } else {
                        iM2566 = C0630.m2566("᩵ۗ") ^ i3;
                        i = ((iM2566 ^ i4) * (-12867)) ^ 75196759;
                        i2 = -610165251;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -238074132:
                case 278639016:
                    RunnableC1108.m3790();
                    if (C0050.f910 >= 0) {
                        iM2566 = (C2105.m6981("۫ۗ") ^ i4) * (-81);
                        i = ((iM2566 ^ i3) * (-19363)) ^ (-420677409);
                        i2 = -1958348608;
                    } else {
                        iM2566 = C0630.m2566("᩹ܰ") ^ i4;
                        i = ((iM2566 ^ i3) * (-6803)) ^ 1487161265;
                        i2 = 1959876646;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -118889081:
                case 1521294499:
                    if (i9 < length2) {
                        iM2566 = C0630.m2566("ۗۚ") ^ i3;
                        i = ((iM2566 ^ i4) * (-14297)) ^ 1140804373;
                        i2 = -477444964;
                    } else {
                        iM2566 = (C2105.m6981("۠᩻") + i4) * 13;
                        i = ((iM2566 ^ i3) * 2871) ^ 737185857;
                        i2 = 513759195;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -27281732:
                case 936721290:
                    messageDigestM34526 = C14460.m34526();
                    charset = StandardCharsets.UTF_8;
                    if (C0483.f2088 >= 0) {
                        iM2566 = C0630.m2566("᩶ܶ") ^ i3;
                        i = ((iM2566 ^ i4) * 407) ^ (-1560423410);
                        i2 = 746103784;
                    } else {
                        iM2566 = C0630.m2566("۫ܿ") ^ i3;
                        i = ((iM2566 ^ i4) * 19569) ^ (-1446847265);
                        i2 = -2078785778;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 824590054:
                case 1531238001:
                    return new String(cArr);
                case 1760499658:
                case 1854378070:
                    bArrM5903 = C1773.m5903(str, charset);
                    i7 = 0;
                    i17 = 0;
                    int iM6983 = (C2105.m6981("۬۠") ^ i4) * (-33);
                    i5 = ((iM6983 ^ i3) * 18915) ^ 1271175095;
                    i6 = iM6983 ^ 1293558213;
                    break;
                default:
                    C0422.m1963();
                    iM2566 = C0630.m2566("᩶ܶ") ^ i3;
                    i = ((iM2566 ^ i4) * 407) ^ (-1560423410);
                    i2 = 746103784;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m45165() {
        int i = 0;
        char[] cArr = null;
        int i2 = 0;
        Random random = null;
        int i3 = 0;
        int iNextInt = 0;
        char cForDigit = 0;
        int i4 = 96074516;
        int i5 = C4075.f12947;
        int i6 = C3746.f11829;
        int iM2566 = (C0630.m2566("֨᩹") + i5) * (-95);
        int i7 = ((iM2566 ^ i6) * (-9031)) ^ (-680001493);
        int i8 = -1465857786;
        while (true) {
            i4 = ((((i4 ^ i6) * 8115) >> 31) & i7) ^ (iM2566 ^ i8);
            switch (i4) {
                case -2095528885:
                case -606301721:
                    i2 = 0;
                    iM2566 = (C0630.m2566("ۨۨ") + i5) * 35;
                    i7 = ((iM2566 ^ i6) * (-12669)) ^ 1456175033;
                    i8 = -719200546;
                    break;
                case -1969674017:
                case -1826521867:
                    return new String(cArr);
                case -1671670488:
                case -850807473:
                    i = 8;
                    cArr = new char[8];
                    if (C1773.f6144 <= 0) {
                        iM2566 = C0630.m2566("ܺᩳ") ^ i6;
                        i7 = ((iM2566 ^ i5) * 8693) ^ (-1082290342);
                        i8 = -1435687187;
                    } else {
                        iM2566 = C2105.m6981("ᩳ᩺") ^ i5;
                        i7 = ((iM2566 ^ i6) * 20481) ^ 1475902891;
                        i8 = -424711422;
                    }
                    break;
                case -1510932313:
                case 1635261209:
                    if (!C0382.f1805) {
                        iM2566 = C0630.m2566("ۖܶ") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-8697)) ^ (-1089031162);
                        i8 = 1104630571;
                    } else {
                        iM2566 = C2105.m6981("ܽܿ") ^ i5;
                        i7 = ((iM2566 ^ i6) * 11945) ^ 559871659;
                        i8 = 1301069241;
                    }
                    break;
                case -1471037405:
                case 655278318:
                    RunnableC0588.m2441();
                    C3019.m9255();
                    return null;
                case -1200753858:
                case -474978161:
                    iNextInt = random.nextInt(i3);
                    if (C2126.f7087) {
                        iM2566 = C0630.m2566("ۖܶ") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-8697)) ^ (-1089031162);
                        i8 = 1104630571;
                    } else {
                        iM2566 = (C2105.m6981("ۡۤ") ^ i5) * (-95);
                        i7 = ((iM2566 ^ i6) * 30753) ^ (-1208579511);
                        i8 = 136876128;
                    }
                    break;
                case -1069742900:
                case 155377902:
                    if (ServiceConnectionC3453.f10921 < 0) {
                        iM2566 = C0630.m2566("ܺᩳ") ^ i6;
                        i7 = ((iM2566 ^ i5) * 8693) ^ (-1082290342);
                        i8 = -1435687187;
                    } else {
                        iM2566 = (C2105.m6981("ܺۛ") + i5) * 49;
                        i7 = ((iM2566 ^ i6) * 9571) ^ (-1069084518);
                        i8 = 2028109936;
                    }
                    break;
                case -975746109:
                case 370791839:
                    C2167.m7155();
                    if (C2958.f9394 >= 0) {
                        iM2566 = C0630.m2566("ܺᩳ") ^ i6;
                        i7 = ((iM2566 ^ i5) * 8693) ^ (-1082290342);
                        i8 = -1435687187;
                    } else {
                        iM2566 = C0630.m2566("ۖܶ") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-8697)) ^ (-1089031162);
                        i8 = 1104630571;
                    }
                    break;
                case -860580751:
                case 1775968063:
                    RunnableC0588.m2441();
                    C1005.m3501();
                    iM2566 = C0630.m2566("ۖܶ") ^ i6;
                    i7 = ((iM2566 ^ i5) * (-8697)) ^ (-1089031162);
                    i8 = 1104630571;
                    break;
                case -804846639:
                case 1062752578:
                    random = f63401;
                    i3 = 36;
                    if (C3019.m9255() <= 0) {
                        iM2566 = C0630.m2566("ۖܶ") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-8697)) ^ (-1089031162);
                        i8 = 1104630571;
                    } else {
                        iM2566 = C0630.m2566("ۜܺ") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-28739)) ^ 558495014;
                        i8 = -558604283;
                    }
                    break;
                case -171857360:
                case 1352822568:
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = C2105.m6981("ܽܿ") ^ i5;
                        i7 = ((iM2566 ^ i6) * 11945) ^ 559871659;
                        i8 = 1301069241;
                    } else {
                        iM2566 = C2105.m6981("ۨۚ") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-20615)) ^ 97407823;
                        i8 = 1381014557;
                    }
                    break;
                case -126700610:
                case 1274004276:
                    if (C1504.f5354) {
                        iM2566 = C0630.m2566("ܺᩳ") ^ i6;
                        i7 = ((iM2566 ^ i5) * 8693) ^ (-1082290342);
                        i8 = -1435687187;
                    } else {
                        iM2566 = (C2105.m6981("ۢۧ") + i6) * (-29);
                        i7 = ((iM2566 ^ i5) * (-19125)) ^ 860587415;
                        i8 = -1507063799;
                    }
                    break;
                case -10108361:
                case 1983139266:
                    if (C0964.f3626 != 0) {
                        iM2566 = (C2105.m6981("᩵ۢ") ^ i6) * 69;
                        i7 = ((iM2566 ^ i5) * 20235) ^ 1121153874;
                        i8 = -1314661018;
                    } else {
                        iM2566 = C0630.m2566("ۨ۠") ^ i5;
                        i7 = ((iM2566 ^ i6) * (-22157)) ^ 1817174375;
                        i8 = -654728696;
                    }
                    break;
                case 200553512:
                case 1907390806:
                    if (i2 < i) {
                        iM2566 = C2105.m6981("᩺۫") ^ i6;
                        i7 = ((iM2566 ^ i5) * 15597) ^ (-809608945);
                        i8 = 1501700630;
                    } else {
                        iM2566 = (C2105.m6981("֫ۡ") ^ i5) * (-57);
                        i7 = ((iM2566 ^ i6) * (-12017)) ^ 159522819;
                        i8 = 688822141;
                    }
                    break;
                case 763729621:
                case 1478176950:
                    if (RunnableC1108.f4040) {
                        iM2566 = C2105.m6981("᩻ۢ") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-20981)) ^ (-1793099502);
                        i8 = -440223895;
                    } else {
                        iM2566 = (C2105.m6981("᩵ۢ") ^ i6) * 69;
                        i7 = ((iM2566 ^ i5) * 20235) ^ 1121153874;
                        i8 = -1314661018;
                    }
                    break;
                case 881395722:
                case 1579017362:
                    if (C22628.f73083 <= 0) {
                        iM2566 = C0630.m2566("ۖܶ") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-8697)) ^ (-1089031162);
                        i8 = 1104630571;
                    } else {
                        iM2566 = C0630.m2566("۬ۤ") ^ i5;
                        i7 = ((iM2566 ^ i6) * (-28649)) ^ 642061392;
                        i8 = -1512154507;
                    }
                    break;
                case 1436887820:
                case 1841700795:
                    cForDigit = Character.forDigit(iNextInt, i3);
                    if (C1420.f5096 <= 0) {
                        iM2566 = (C2105.m6981("᩵ۢ") ^ i6) * 69;
                        i7 = ((iM2566 ^ i5) * 20235) ^ 1121153874;
                        i8 = -1314661018;
                    } else {
                        iM2566 = C2105.m6981("۟᩷") ^ i5;
                        i7 = ((iM2566 ^ i6) * 26875) ^ (-230023076);
                        i8 = -1476789557;
                    }
                    break;
                case 1861694653:
                case 2093121100:
                    if (C2105.m6982() != 0) {
                        iM2566 = (C2105.m6981("᩵ۢ") ^ i6) * 69;
                        i7 = ((iM2566 ^ i5) * 20235) ^ 1121153874;
                        i8 = -1314661018;
                    } else {
                        iM2566 = C2105.m6981("۠᩺") ^ i6;
                        i7 = ((iM2566 ^ i5) * 27943) ^ 1312005883;
                        i8 = 758539339;
                    }
                    break;
                default:
                    cArr[i2] = cForDigit;
                    i2++;
                    iM2566 = (C0630.m2566("ۨۨ") + i5) * 35;
                    i7 = ((iM2566 ^ i6) * (-12669)) ^ 1456175033;
                    i8 = -719200546;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0083  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:55:0x0217 A[PHI: r1 r2 r12
      0x0217: PHI (r1v4 l.ܿܶۡ) = (r1v3 l.ܿܶۡ), (r1v2 l.ܿܶۡ), (r1v2 l.ܿܶۡ), (r1v2 l.ܿܶۡ), (r1v2 l.ܿܶۡ) binds: [B:54:0x0215, B:50:0x01f3, B:34:0x0133, B:13:0x0047, B:10:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0217: PHI (r2v6 l.۬᩵) = (r2v2 l.۬᩵), (r2v4 l.۬᩵), (r2v2 l.۬᩵), (r2v2 l.۬᩵), (r2v2 l.۬᩵) binds: [B:54:0x0215, B:50:0x01f3, B:34:0x0133, B:13:0x0047, B:10:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0217: PHI (r12v8 l.ܺᩴۡ) = (r12v4 l.ܺᩴۡ), (r12v5 l.ܺᩴۡ), (r12v4 l.ܺᩴۡ), (r12v4 l.ܺᩴۡ), (r12v4 l.ܺᩴۡ) binds: [B:54:0x0215, B:50:0x01f3, B:34:0x0133, B:13:0x0047, B:10:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x024e A[PHI: r0 r4
      0x024e: PHI (r0v11 char[]) = (r0v10 char[]), (r0v2 char[]), (r0v2 char[]), (r0v2 char[]) binds: [B:58:0x024c, B:42:0x018a, B:38:0x015c, B:7:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r4v7 int) = (r4v2 int), (r4v6 int), (r4v2 int), (r4v2 int) binds: [B:58:0x024c, B:42:0x018a, B:38:0x015c, B:7:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        int iM6981;
        int i;
        char[] cArr = null;
        C17426 c17426 = null;
        C13309 c13309 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = -827019194;
        int i6 = C0483.f2088;
        int i7 = C4117.f13076;
        int iM6982 = C2105.m6981("᩵۫") ^ i7;
        int i8 = ((iM6982 ^ i6) * 6729) ^ 102205775;
        int i9 = -704785681;
        while (true) {
            int i10 = iM6982 ^ i9;
            C16119 c16119 = null;
            while (true) {
                i5 = ((((i5 ^ i6) * (-1309)) >> 31) & i8) ^ i10;
                switch (i5) {
                    case -2137809513:
                    case -598990033:
                        C0050.m937(c13309, 4153, c16119);
                        C0050.m937(c13309, 4161, c16119);
                        C0050.m937(c13309, 4160, c16119);
                        i2 = 4162;
                        if (C4616.f14690 <= 0) {
                            iM6981 = C2105.m6981("֡ܳ") ^ i6;
                            i8 = ((iM6981 ^ i7) * 15147) ^ (-717870380);
                            i = -636079865;
                        } else {
                            iM6981 = C2105.m6981("ۚᩳ") ^ i7;
                            i8 = ((iM6981 ^ i6) * (-2527)) ^ (-1390009476);
                            i = 477858424;
                        }
                        i10 = iM6981 ^ i;
                        break;
                    case -2093517986:
                    case -1811984429:
                        f63401 = new Random();
                        cArr = new char[16];
                        if (AbstractC2021.f6743 <= 0) {
                            iM6981 = C2105.m6981("֡ܳ") ^ i6;
                            i8 = ((iM6981 ^ i7) * 15147) ^ (-717870380);
                            i = -636079865;
                        } else {
                            iM6981 = C2105.m6981("ܶ۫") ^ i6;
                            i8 = ((iM6981 ^ i7) * 13657) ^ 1413485355;
                            i = -1289621461;
                        }
                        i10 = iM6981 ^ i;
                        break;
                    case -2020683405:
                    case -203816829:
                        C0714.m2805();
                        if (C1420.f5096 > 0) {
                        }
                        iM6981 = C2105.m6981("ܺ᩶") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-12811)) ^ 1664501522;
                        i = -1531982050;
                        i10 = iM6981 ^ i;
                        break;
                    case -2013919670:
                    case 1155316319:
                        if (C3432.f10845 < 0) {
                            iM6981 = C2105.m6981("ܺ᩶") ^ i6;
                            i8 = ((iM6981 ^ i7) * (-12811)) ^ 1664501522;
                            i = -1531982050;
                        } else {
                            iM6981 = (C0630.m2566("۟᩺") ^ i7) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                            i8 = ((iM6981 ^ i6) * (-8091)) ^ (-1703102541);
                            i = 416574215;
                        }
                        i10 = iM6981 ^ i;
                        break;
                    case -1854680253:
                    case 95811401:
                        C0050.m937(c13309, o.a.m, c16119);
                        C0422.m1952(c13309, o.a.f77939l, c16119);
                        i3 = o.a.p;
                        iM6981 = (C2105.m6981("۟᩹") ^ i7) * (-43);
                        i8 = ((iM6981 ^ i6) * 22955) ^ (-2131632938);
                        i = -1312071720;
                        i10 = iM6981 ^ i;
                        break;
                    case -1840340478:
                    case 100312438:
                        f63404 = c17426;
                        f63405 = new C17426();
                        c13309 = new C13309();
                        f63403 = c13309;
                        if (C2958.f9394 < 0) {
                            c16119 = new C16119();
                            C0050.m937(c13309, 4119, c16119);
                            C0050.m937(c13309, o.a.d, c16119);
                            if (C2272.m7503()) {
                                iM6981 = (C0630.m2566("۟᩺") ^ i7) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                i8 = ((iM6981 ^ i6) * (-8091)) ^ (-1703102541);
                                i = 416574215;
                            } else {
                                iM6981 = C0630.m2566("ۨܰ") ^ i6;
                                i8 = ((iM6981 ^ i7) * (-10327)) ^ (-1944965534);
                                i = 567761924;
                            }
                            i10 = iM6981 ^ i;
                        }
                        break;
                    case -1441875401:
                    case 2023593884:
                        C0050.m937(c13309, o.a.k, c16119);
                        C0422.m1952(c13309, o.a.n, c16119);
                        if (C4159.m12565() >= 0) {
                            iM6981 = (C0630.m2566("۟᩺") ^ i7) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                            i8 = ((iM6981 ^ i6) * (-8091)) ^ (-1703102541);
                            i = 416574215;
                        } else {
                            iM6981 = C0630.m2566("ܰ֡") ^ i6;
                            i8 = ((iM6981 ^ i7) * 18413) ^ 199017531;
                            i = 1313890609;
                        }
                        i10 = iM6981 ^ i;
                        break;
                    case -1302373318:
                    case -1105310685:
                        C0050.m937(c13309, 4145, c16119);
                        C0422.m1952(c13309, 4116, c16119);
                        C0050.m937(c13309, 4135, c16119);
                        C0422.m1952(c13309, 4197, c16119);
                        return;
                    case -572363719:
                    case 1749954329:
                        C0050.m937(c13309, i3, c16119);
                        C0422.m1952(c13309, 4358, c16119);
                        if (C3432.m10477() <= 0) {
                            iM6981 = C2105.m6981("ܺ᩶") ^ i6;
                            i8 = ((iM6981 ^ i7) * (-12811)) ^ 1664501522;
                            i = -1531982050;
                        } else {
                            iM6981 = (C0630.m2566("ᩳ۬") + i6) * 99;
                            i8 = ((iM6981 ^ i7) * 30841) ^ 991597289;
                            i = 922713320;
                        }
                        i10 = iM6981 ^ i;
                        break;
                    case -464940848:
                    case 87413430:
                        C5695.m16023();
                        if (C3746.f11829 > 0) {
                            iM6981 = (C0630.m2566("۟᩺") ^ i7) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                            i8 = ((iM6981 ^ i6) * (-8091)) ^ (-1703102541);
                            i = 416574215;
                        } else {
                            iM6981 = C0630.m2566("ۗ᩶") ^ i7;
                            i8 = ((iM6981 ^ i6) * (-23765)) ^ (-662636580);
                            i = -784371054;
                        }
                        i10 = iM6981 ^ i;
                        break;
                    case -318281200:
                    case 1901313688:
                        C0050.m937(c13309, i4, c16119);
                        C0050.m937(c13309, 4144, c16119);
                        if (C7106.f21815 != 0) {
                            iM6981 = C0630.m2566("ۗ᩶") ^ i7;
                            i8 = ((iM6981 ^ i6) * (-23765)) ^ (-662636580);
                            i = -784371054;
                        } else {
                            iM6981 = C2105.m6981("۟۠") ^ i7;
                            i8 = ((iM6981 ^ i6) * 19541) ^ 1172514288;
                            i = -459924100;
                        }
                        i10 = iM6981 ^ i;
                        break;
                    case 1052608654:
                    case 2098559484:
                        C0050.m937(c13309, o.a.a, c16119);
                        C0050.m937(c13309, 4136, c16119);
                        i4 = 4137;
                        iM6981 = C2105.m6981("ۡۜ") ^ i7;
                        i8 = ((iM6981 ^ i6) * 9173) ^ 1549721443;
                        i = -1144116052;
                        i10 = iM6981 ^ i;
                        break;
                    case 1178684775:
                    case 1253244422:
                        C0422.m1952(c13309, i2, c16119);
                        C0050.m937(c13309, 4151, c16119);
                        C0050.m937(c13309, o.a.c, c16119);
                        if (C2958.m9034() <= 0) {
                            iM6981 = C2105.m6981("֡ܳ") ^ i6;
                            i8 = ((iM6981 ^ i7) * 15147) ^ (-717870380);
                            i = -636079865;
                        } else {
                            iM6981 = (i6 - C0630.m2566("ۡۨ")) * 9;
                            i8 = ((iM6981 ^ i7) * (-28755)) ^ 1706048660;
                            i = 1916334731;
                        }
                        i10 = iM6981 ^ i;
                        break;
                    case 1283674315:
                    case 2072798049:
                        C1916.m6308();
                        throw new RuntimeException();
                    case 1426355423:
                    case 1812086877:
                        // fill-array-data instruction
                        cArr[0] = '0';
                        cArr[1] = '1';
                        cArr[2] = '2';
                        cArr[3] = '3';
                        cArr[4] = '4';
                        cArr[5] = '5';
                        cArr[6] = '6';
                        cArr[7] = '7';
                        cArr[8] = '8';
                        cArr[9] = '9';
                        cArr[10] = 'A';
                        cArr[11] = 'B';
                        cArr[12] = 'C';
                        cArr[13] = 'D';
                        cArr[14] = 'E';
                        cArr[15] = 'F';
                        f63402 = cArr;
                        c17426 = new C17426();
                        if (C0964.f3626 != 0) {
                            iM6981 = (C0630.m2566("۟᩺") ^ i7) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                            i8 = ((iM6981 ^ i6) * (-8091)) ^ (-1703102541);
                            i = 416574215;
                        } else {
                            iM6981 = C2105.m6981("֫ۗ") ^ i7;
                            i8 = ((iM6981 ^ i6) * 19745) ^ (-633094052);
                            i = 1395886429;
                        }
                        i10 = iM6981 ^ i;
                        break;
                    case 2053008534:
                    case 2141439340:
                        ServiceConnectionC3453.m10564();
                        iM6981 = C2105.m6981("ܺ᩶") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-12811)) ^ 1664501522;
                        i = -1531982050;
                        i10 = iM6981 ^ i;
                        break;
                    default:
                        C0422.m1952(c13309, o.a.h, c16119);
                        C0050.m937(c13309, o.a.e, c16119);
                        if (C2958.f9394 >= 0) {
                            iM6981 = C2105.m6981("֡ܳ") ^ i6;
                            i8 = ((iM6981 ^ i7) * 15147) ^ (-717870380);
                            i = -636079865;
                        } else {
                            iM6981 = (C2105.m6981("ۚ֡") ^ i7) * (-43);
                            i8 = ((iM6981 ^ i6) * (-1071)) ^ (-2061439445);
                            i = -1333918193;
                        }
                        i10 = iM6981 ^ i;
                        break;
                }
            }
            iM6982 = C2105.m6981("۠ᩳ") ^ i6;
            i8 = ((iM6982 ^ i7) * (-16675)) ^ (-1208905343);
            i9 = -1602192132;
        }
    }
}
