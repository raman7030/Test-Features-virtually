package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.HashSet;
import java.util.Random;

/* JADX INFO: renamed from: l.ܿ۬ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 760C */
/* JADX INFO: loaded from: classes5.dex */
public final class C17369 implements InterfaceC18075 {

    /* JADX INFO: renamed from: ᩺᩻֫, reason: not valid java name and contains not printable characters */
    private static final short[] f53175 = {8439, -5070, -5071, -5072, -5065, -5066, -5067, -5068, -5061, -5062, -5063, -5064, -5057, -5058, -5059, -5060, -5085, -5086, -5087, -5088, -5081, -5082, -5083, -5084, -5077, -5078, -5079, -5102, -5103, -5104, -5097, -5098, -5099, -5100, -5093, -5094, -5095, -5096, -5089, -5090, -5091, -5092, -5117, -5118, -5119, -5120, -5113, -5114, -5115, -5116, -5109, -5110, -5111, -5021, -5022, -5023, -5024, -5017, -5018, -5019, -5020, -5013, -5014, -5108};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashSet f53176;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f53177;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f53178;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f53179;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Random f53180;

    /* JADX WARN: Code duplicated, block: B:74:0x02d5 A[PHI: r8 r12 r16 r17 r18 r19 r22 r26
      0x02d5: PHI (r8v3 int) = (r8v1 int), (r8v1 int), (r8v4 int) binds: [B:73:0x02d3, B:69:0x02b1, B:10:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x02d5: PHI (r12v3 char) = (r12v1 char), (r12v1 char), (r12v4 char) binds: [B:73:0x02d3, B:69:0x02b1, B:10:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x02d5: PHI (r16v3 short) = (r16v2 short), (r16v1 short), (r16v1 short) binds: [B:73:0x02d3, B:69:0x02b1, B:10:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x02d5: PHI (r17v3 int) = (r17v1 int), (r17v2 int), (r17v1 int) binds: [B:73:0x02d3, B:69:0x02b1, B:10:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x02d5: PHI (r18v3 int) = (r18v1 int), (r18v2 int), (r18v1 int) binds: [B:73:0x02d3, B:69:0x02b1, B:10:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x02d5: PHI (r19v3 int) = (r19v1 int), (r19v2 int), (r19v1 int) binds: [B:73:0x02d3, B:69:0x02b1, B:10:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x02d5: PHI (r22v4 short) = (r22v3 short), (r22v2 short), (r22v2 short) binds: [B:73:0x02d3, B:69:0x02b1, B:10:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x02d5: PHI (r26v38 int) = (r26v7 int), (r26v8 int), (r26v39 int) binds: [B:73:0x02d3, B:69:0x02b1, B:10:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x030d A[PHI: r6 r7 r20 r21 r27 r28
      0x030d: PHI (r6v2 int) = (r6v1 int), (r6v1 int), (r6v3 int) binds: [B:78:0x030b, B:56:0x0230, B:44:0x01b1] A[DONT_GENERATE, DONT_INLINE]
      0x030d: PHI (r7v2 java.lang.StringBuilder) = (r7v1 java.lang.StringBuilder), (r7v1 java.lang.StringBuilder), (r7v3 java.lang.StringBuilder) binds: [B:78:0x030b, B:56:0x0230, B:44:0x01b1] A[DONT_GENERATE, DONT_INLINE]
      0x030d: PHI (r20v4 short[]) = (r20v3 short[]), (r20v2 short[]), (r20v2 short[]) binds: [B:78:0x030b, B:56:0x0230, B:44:0x01b1] A[DONT_GENERATE, DONT_INLINE]
      0x030d: PHI (r21v4 char) = (r21v3 char), (r21v2 char), (r21v2 char) binds: [B:78:0x030b, B:56:0x0230, B:44:0x01b1] A[DONT_GENERATE, DONT_INLINE]
      0x030d: PHI (r27v3 int) = (r27v1 int), (r27v2 int), (r27v1 int) binds: [B:78:0x030b, B:56:0x0230, B:44:0x01b1] A[DONT_GENERATE, DONT_INLINE]
      0x030d: PHI (r28v20 int) = (r28v6 int), (r28v15 int), (r28v3 int) binds: [B:78:0x030b, B:56:0x0230, B:44:0x01b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008b, code lost:
    
        if (l.C2105.f7037 != 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008e, code lost:
    
        r1 = l.C2105.m6981("ܽۗ") ^ r24;
        r2 = ((r1 ^ r25) * 5561) ^ (-157000594);
        r26 = -1151777289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x005e, code lost:
    
        if (l.ViewOnClickListenerC1958.m6429() >= 0) goto L16;
     */
    @Override // l.InterfaceC18075
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String mo6135() {
        int iM2566;
        int i;
        int i2;
        int i3;
        int iM2567;
        int i4;
        Random random = null;
        int iNextInt = 0;
        int i5 = 0;
        int i6 = 0;
        StringBuilder sb = null;
        int iNextInt2 = 0;
        String str = null;
        int i7 = 0;
        String strM947 = null;
        char cM3000 = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 3262032;
        int i12 = C4117.f13076;
        int i13 = ViewOnClickListenerC1958.f6529;
        int iM6981 = (C2105.m6981("ۙ۫") ^ i13) * 81;
        int i14 = ((iM6981 ^ i12) * (-5177)) ^ (-104490002);
        int i15 = iM6981 ^ (-243900676);
        short[] sArr = null;
        short[] sArr2 = null;
        int i16 = 0;
        int i17 = 0;
        char c = 0;
        short s2 = 0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            i11 = i15 ^ (i14 & (((i11 ^ i12) * 31971) >> 31));
            switch (i11) {
                case -2091310539:
                case -1812541202:
                    i19 = i19;
                    random = this.f53180;
                    if (C3537.f11231 >= 0) {
                        iM2566 = C2105.m6981("۬᩸") ^ i13;
                        i = ((iM2566 ^ i12) * 6509) ^ (-912429471);
                        i2 = -642164832;
                    } else {
                        iM2566 = (i12 - C0630.m2566("ᩴۗ")) * 73;
                        i = ((iM2566 ^ i13) * 31675) ^ (-1662571076);
                        i2 = -1010413175;
                    }
                    int i20 = iM2566 ^ i2;
                    i19 = i19;
                    i15 = i20;
                    i14 = i;
                    break;
                case -2077964455:
                case 1850568297:
                    i19 = i19;
                    sArr = f53175;
                    c = 0;
                    if (!C2272.f7362) {
                        iM2566 = C0630.m2566("֡᩻") ^ i12;
                        i = ((iM2566 ^ i13) * 29893) ^ (-671781184);
                        i2 = -1064816099;
                        int i21 = iM2566 ^ i2;
                        i19 = i19;
                        i15 = i21;
                        i14 = i;
                    } else {
                        i19 = i19;
                        iM2567 = C2105.m6981("ܳۖ") ^ i13;
                        i = ((iM2567 ^ i12) * 15627) ^ 1321739156;
                        i4 = 1463297782;
                        i15 = iM2567 ^ i4;
                        i14 = i;
                    }
                    break;
                case -2043356176:
                case 2102861677:
                    int i22 = i19;
                    iNextInt = random.nextInt(i22);
                    i5 = this.f53178;
                    if (RunnableC3474.f10992 <= 0) {
                        i19 = i22;
                        iM2566 = C2105.m6981("۬᩸") ^ i13;
                        i = ((iM2566 ^ i12) * 6509) ^ (-912429471);
                        i2 = -642164832;
                    } else {
                        iM2566 = C2105.m6981("ۢۜ") ^ i13;
                        i19 = i22;
                        i = ((iM2566 ^ i12) * (-5407)) ^ 2045451360;
                        i2 = -1271657309;
                    }
                    int i23 = iM2566 ^ i2;
                    i19 = i19;
                    i15 = i23;
                    i14 = i;
                    break;
                case -2036235411:
                case -1493247793:
                    sb.ensureCapacity(i6);
                    iNextInt2 = random.nextInt(52);
                    if (C1294.f4556 < 0) {
                        iM2567 = (i13 - C2105.m6981("ܰ֫")) * 53;
                        i = ((iM2567 ^ i12) * 6887) ^ 2105921928;
                        i4 = 1898704841;
                        i15 = iM2567 ^ i4;
                        i14 = i;
                    }
                    i19 = i19;
                    iM2566 = (C0630.m2566("۟᩸") ^ i13) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i = ((iM2566 ^ i12) * (-28947)) ^ (-1244014364);
                    i2 = -2058248427;
                    int i24 = iM2566 ^ i2;
                    i19 = i19;
                    i15 = i24;
                    i14 = i;
                    break;
                case -2033782932:
                case 1368936795:
                    cM3000 = C0798.m3000(str, random.nextInt(63));
                    if (C2958.m9034() > 0) {
                        iM2567 = C0630.m2566("᩸᩶") ^ i13;
                        i = ((iM2567 ^ i12) * 6649) ^ 1881667133;
                        i4 = 1852454329;
                        i15 = iM2567 ^ i4;
                        i14 = i;
                    }
                    i19 = i19;
                    iM2566 = (C0630.m2566("۟᩸") ^ i13) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i = ((iM2566 ^ i12) * (-28947)) ^ (-1244014364);
                    i2 = -2058248427;
                    int i25 = iM2566 ^ i2;
                    i19 = i19;
                    i15 = i25;
                    i14 = i;
                    break;
                case -1946921841:
                case -1743742486:
                    i3 = 60499;
                    i16 = i3;
                    iM2566 = C2105.m6981("ܰۜ") ^ i13;
                    i = ((iM2566 ^ i12) * (-959)) ^ 1388399825;
                    i2 = -1908818834;
                    int i26 = iM2566 ^ i2;
                    i19 = i19;
                    i15 = i26;
                    i14 = i;
                    break;
                case -1919286629:
                case 1749536150:
                    C1773.m5908();
                    break;
                case -1826320714:
                case 1668797249:
                    if (i7 < i6) {
                        iM2567 = C0630.m2566("᩷ܽ") ^ i12;
                        i = ((iM2567 ^ i13) * (-5077)) ^ (-1612376539);
                        i4 = 122875994;
                    } else {
                        iM2567 = C2105.m6981("ۘ۠") ^ i12;
                        i = ((iM2567 ^ i13) * (-13691)) ^ (-780649940);
                        i4 = -1613855187;
                    }
                    i15 = iM2567 ^ i4;
                    i14 = i;
                    break;
                case -1774100416:
                case -138172142:
                    i19 = i19;
                    s2 = sArr[c];
                    s = 23422;
                    if (C1711.m5736() <= 0) {
                        iM2566 = (C0630.m2566("۟᩸") ^ i13) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM2566 ^ i12) * (-28947)) ^ (-1244014364);
                        i2 = -2058248427;
                    } else {
                        iM2566 = C2105.m6981("ܳ᩵") ^ i13;
                        i = ((iM2566 ^ i12) * (-19019)) ^ (-1501297460);
                        i2 = 1699625062;
                    }
                    int i27 = iM2566 ^ i2;
                    i19 = i19;
                    i15 = i27;
                    i14 = i;
                    break;
                case -1695610088:
                case -635765259:
                    i18 = 1;
                    i19 = this.f53177 + 1;
                    if (C4616.f14690 <= 0) {
                        iM2567 = C2105.m6981("ܳۖ") ^ i13;
                        i = ((iM2567 ^ i12) * 15627) ^ 1321739156;
                        i4 = 1463297782;
                    } else {
                        iM2567 = (i13 - C0630.m2566("ۗ᩹")) * 59;
                        i = ((iM2567 ^ i12) * (-16023)) ^ 2078397003;
                        i4 = -267833255;
                    }
                    i15 = iM2567 ^ i4;
                    i14 = i;
                    break;
                case -1093213321:
                case 230598151:
                    return strM947;
                case -922237054:
                case -270218666:
                    strM947 = C0050.m947(sb);
                    if (!ServiceConnectionC3453.m10557(this.f53176, C1047.m3595(strM947))) {
                        i19 = i19;
                        iM2566 = C2105.m6981("ܰۜ") ^ i13;
                        i = ((iM2566 ^ i12) * (-959)) ^ 1388399825;
                        i2 = -1908818834;
                        int i28 = iM2566 ^ i2;
                        i19 = i19;
                        i15 = i28;
                        i14 = i;
                    } else {
                        iM2567 = (C0630.m2566("ᩴۘ") + i12) * 95;
                        i = ((iM2567 ^ i13) * (-32015)) ^ (-402811918);
                        i4 = -1999249950;
                        i15 = iM2567 ^ i4;
                        i14 = i;
                    }
                    break;
                case -800435867:
                case 829253107:
                    i19 = i19;
                    i8 = s2 * s;
                    i9 = s2 * s2;
                    i10 = 137147521;
                    if (C1711.f5919) {
                        iM2566 = (C0630.m2566("۟᩸") ^ i13) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM2566 ^ i12) * (-28947)) ^ (-1244014364);
                        i2 = -2058248427;
                    } else {
                        iM2566 = C0630.m2566("ۚۙ") ^ i13;
                        i = ((iM2566 ^ i12) * (-27035)) ^ (-1346758372);
                        i2 = 2032586023;
                    }
                    int i29 = iM2566 ^ i2;
                    i19 = i19;
                    i15 = i29;
                    i14 = i;
                    break;
                case -535333714:
                case -116722780:
                    i6 = iNextInt + i5;
                    sb = this.f53179;
                    sb.setLength(0);
                    if (C1005.f3721) {
                        iM2567 = C0630.m2566("ܽۘ") ^ i12;
                        i = ((iM2567 ^ i13) * (-22341)) ^ 1189440587;
                        i4 = -798425359;
                    } else {
                        iM2567 = C2105.m6981("ܳۖ") ^ i13;
                        i = ((iM2567 ^ i12) * 15627) ^ 1321739156;
                        i4 = 1463297782;
                    }
                    i15 = iM2567 ^ i4;
                    i14 = i;
                    break;
                case -345755213:
                case 977985392:
                    C2105.m6979(sb, cM3000);
                    i7++;
                    iM2567 = C2105.m6981("֫ܰ") ^ i13;
                    i = ((iM2567 ^ i12) * 9313) ^ (-430082654);
                    i4 = 928301459;
                    i15 = iM2567 ^ i4;
                    i14 = i;
                    break;
                case -309315478:
                case 1151752670:
                    C7811.m20844();
                    i19 = i19;
                    iM2566 = (C0630.m2566("۟᩸") ^ i13) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i = ((iM2566 ^ i12) * (-28947)) ^ (-1244014364);
                    i2 = -2058248427;
                    int i210 = iM2566 ^ i2;
                    i19 = i19;
                    i15 = i210;
                    i14 = i;
                    break;
                case -304853555:
                case -146606680:
                    i3 = 59689;
                    i16 = i3;
                    iM2566 = C2105.m6981("ܰۜ") ^ i13;
                    i = ((iM2566 ^ i12) * (-959)) ^ 1388399825;
                    i2 = -1908818834;
                    int i211 = iM2566 ^ i2;
                    i19 = i19;
                    i15 = i211;
                    i14 = i;
                    break;
                case -31704633:
                case 196755314:
                    C4263.m12819();
                    C4263.m12819();
                    return null;
                case 52126914:
                case 1482756615:
                    C4159.m12565();
                    if (C0483.f2088 < 0) {
                        iM2567 = C2105.m6981("ۙۜ") ^ i12;
                        i = ((iM2567 ^ i13) * 14935) ^ 1170482823;
                        i4 = 880641267;
                        i15 = iM2567 ^ i4;
                        i14 = i;
                    }
                    i19 = i19;
                    iM2566 = (C0630.m2566("۟᩸") ^ i13) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i = ((iM2566 ^ i12) * (-28947)) ^ (-1244014364);
                    i2 = -2058248427;
                    int i212 = iM2566 ^ i2;
                    i19 = i19;
                    i15 = i212;
                    i14 = i;
                    break;
                case 437935653:
                case 2026578176:
                    sArr2 = f53175;
                    i17 = 1;
                    if (C3911.f12484 < 0) {
                        iM2567 = (i12 - C2105.m6981("᩻᩶")) * (-23);
                        i = ((iM2567 ^ i13) * 19313) ^ 2132064077;
                        i4 = 733599866;
                        i15 = iM2567 ^ i4;
                        i14 = i;
                    }
                    i19 = i19;
                    iM2566 = C2105.m6981("۬᩸") ^ i13;
                    i = ((iM2566 ^ i12) * 6509) ^ (-912429471);
                    i2 = -642164832;
                    int i213 = iM2566 ^ i2;
                    i19 = i19;
                    i15 = i213;
                    i14 = i;
                    break;
                case 529982550:
                case 1990025200:
                    String strM1840 = C0382.m1840(sArr2, i17, 63, i16);
                    C2105.m6979(sb, C0798.m3000(strM1840, iNextInt2));
                    str = strM1840;
                    i7 = i18;
                    iM2567 = C2105.m6981("֫ܰ") ^ i13;
                    i = ((iM2567 ^ i12) * 9313) ^ (-430082654);
                    i4 = 928301459;
                    i15 = iM2567 ^ i4;
                    i14 = i;
                    break;
                case 755348015:
                case 1630372664:
                    i19 = i19;
                    if ((i9 + i10) - i8 >= 0) {
                        iM2566 = (C0630.m2566("֫ܶ") ^ i12) * (-61);
                        i = ((iM2566 ^ i13) * 27543) ^ 1092001040;
                        i2 = -905910258;
                    } else {
                        iM2566 = C2105.m6981("ۤ۫") ^ i12;
                        i = ((iM2566 ^ i13) * (-4587)) ^ (-1547151994);
                        i2 = -1155724307;
                    }
                    int i214 = iM2566 ^ i2;
                    i19 = i19;
                    i15 = i214;
                    i14 = i;
                    break;
                default:
                    C0798.m2998();
                    break;
            }
        }
    }

    public C17369() {
        Random random = null;
        int i = 0;
        int i2 = -994227683;
        int i3 = C2958.f9394;
        int i4 = C0714.f2697;
        int iM6981 = (C2105.m6981("ܰᩳ") ^ i4) * 19;
        int i5 = ((iM6981 ^ i3) * 16631) ^ (-2041381484);
        int i6 = 732966509;
        while (true) {
            i2 = ((((i2 ^ i3) * 5807) >> 31) & i5) ^ (iM6981 ^ i6);
            switch (i2) {
                case -1990667007:
                case -1455548669:
                    C4159.m12565();
                    if (C2167.f7158 < 0) {
                        iM6981 = C2105.m6981("ۧ᩸") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-15121)) ^ 498531288;
                        i6 = 1781343161;
                    } else {
                        iM6981 = C2105.m6981("᩹ۜ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-30481)) ^ 493795905;
                        i6 = -568407941;
                    }
                    break;
                case -1848995519:
                case 790608727:
                    if (C1504.f5354) {
                        iM6981 = C2105.m6981("ۧ᩸") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-15121)) ^ 498531288;
                        i6 = 1781343161;
                    } else {
                        iM6981 = C0630.m2566("ۚܿ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 21391) ^ 9698817;
                        i6 = -1390135917;
                    }
                    break;
                case -1798268536:
                case 1333335023:
                    if (C3911.f12484 >= 0) {
                        iM6981 = C2105.m6981("ۧ᩸") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-15121)) ^ 498531288;
                        i6 = 1781343161;
                    } else {
                        this.f53176 = new HashSet();
                        if (C1711.m5736() <= 0) {
                            iM6981 = C0630.m2566("֫۟") ^ i4;
                            i5 = ((iM6981 ^ i3) * 4343) ^ (-845671184);
                            i6 = 661765002;
                        } else {
                            iM6981 = (C2105.m6981("ۧۤ") ^ i3) * (-117);
                            i5 = ((iM6981 ^ i4) * 19107) ^ 1070923057;
                            i6 = -1537575210;
                        }
                    }
                    break;
                case -1649528890:
                case -1488309390:
                    i = 3;
                    if (C4075.f12947 >= 0) {
                        iM6981 = C2105.m6981("ᩴ۫") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-3597)) ^ 619330182;
                        i6 = 1805978904;
                    } else {
                        iM6981 = (i3 - C0630.m2566("᩻ۚ")) * 9;
                        i5 = ((iM6981 ^ i4) * 9553) ^ 592421237;
                        i6 = 1474922126;
                    }
                    break;
                case -1626404513:
                case 567022802:
                    if (!AbstractC2021.m6574()) {
                        iM6981 = (C2105.m6981("ۤۙ") + i3) * (-63);
                        i5 = ((iM6981 ^ i4) * 16535) ^ (-1939605970);
                        i6 = -1046147299;
                    } else {
                        iM6981 = C2105.m6981("ᩴ۫") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-3597)) ^ 619330182;
                        i6 = 1805978904;
                    }
                    break;
                case -1537347177:
                case 488009768:
                    random = new Random();
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = C0630.m2566("֫۟") ^ i4;
                        i5 = ((iM6981 ^ i3) * 4343) ^ (-845671184);
                        i6 = 661765002;
                    } else {
                        iM6981 = (C2105.m6981("ۗ֡") ^ i3) * 21;
                        i5 = ((iM6981 ^ i4) * 12659) ^ 1696095124;
                        i6 = -117745716;
                    }
                    break;
                case -906685674:
                case -728493962:
                    this.f53178 = i;
                    this.f53177 = 8;
                    return;
                case -483322931:
                case 935717581:
                    if (C22628.f73083 <= 0) {
                        iM6981 = C2105.m6981("ۧ᩸") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-15121)) ^ 498531288;
                        i6 = 1781343161;
                    } else {
                        iM6981 = (i4 - C0630.m2566("᩻ܳ")) * 35;
                        i5 = ((iM6981 ^ i3) * 1563) ^ 669581310;
                        i6 = -443167762;
                    }
                    break;
                case -328079711:
                case 833023659:
                    this.f53180 = random;
                    if (C1128.m3851() <= 0) {
                        iM6981 = C2105.m6981("ᩴ۫") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-3597)) ^ 619330182;
                        i6 = 1805978904;
                    } else {
                        iM6981 = (C2105.m6981("ۗۙ") ^ i4) * 93;
                        i5 = ((iM6981 ^ i3) * (-28905)) ^ (-1444392757);
                        i6 = 640255275;
                    }
                    break;
                case -202006216:
                case 1838218001:
                    AbstractC2021.m6574();
                    iM6981 = C2105.m6981("᩹ۜ") ^ i4;
                    i5 = ((iM6981 ^ i3) * (-30481)) ^ 493795905;
                    i6 = -568407941;
                    break;
                case -153720912:
                case 1395218168:
                    if (C3911.f12484 >= 0) {
                        iM6981 = C0630.m2566("֫۟") ^ i4;
                        i5 = ((iM6981 ^ i3) * 4343) ^ (-845671184);
                        i6 = 661765002;
                    } else {
                        this.f53179 = new StringBuilder();
                        if (C2272.m7503()) {
                            iM6981 = (C2105.m6981("ۤۙ") + i3) * (-63);
                            i5 = ((iM6981 ^ i4) * 16535) ^ (-1939605970);
                            i6 = -1046147299;
                        } else {
                            iM6981 = C2105.m6981("ܿۡ") ^ i4;
                            i5 = ((iM6981 ^ i3) * (-8339)) ^ 1100319452;
                            i6 = 688246509;
                        }
                    }
                    break;
                case 594277419:
                case 1916429931:
                    if (RunnableC1108.f4040) {
                        iM6981 = C0630.m2566("᩸ۙ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-17151)) ^ (-1302891807);
                        i6 = -997781667;
                    } else {
                        iM6981 = C0630.m2566("֫۟") ^ i4;
                        i5 = ((iM6981 ^ i3) * 4343) ^ (-845671184);
                        i6 = 661765002;
                    }
                    break;
                case 1347611109:
                case 2076997315:
                    ViewOnClickListenerC1958.m6429();
                    throw new RuntimeException();
                default:
                    C4117.m12364();
                    if (RunnableC3474.f10992 > 0) {
                        iM6981 = (C2105.m6981("ۤۙ") + i3) * (-63);
                        i5 = ((iM6981 ^ i4) * 16535) ^ (-1939605970);
                        i6 = -1046147299;
                    } else {
                        iM6981 = C2105.m6981("᩹ۜ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-30481)) ^ 493795905;
                        i6 = -568407941;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m40701() {
        this.f53176.clear();
    }
}
