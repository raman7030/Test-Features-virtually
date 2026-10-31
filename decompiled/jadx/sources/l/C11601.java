package l;

import bin.mt.plus.Main;
import com.google.android.material.slider.BaseSlider;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۨۡܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05ZQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C11601 extends AbstractC7548 {

    /* JADX INFO: renamed from: ᩵ܶܶ, reason: not valid java name and contains not printable characters */
    private static final short[] f34586 = {5271, 13784, 13714, 13715, 13710, 13737, 13714, 13715, 13710, 13784, 13708, 13727, 13702, 5403, 16893, 32233, -19008, 16708, -22245, 20239, 9, -1760, -5501, 15656, 14392, -10428, -2778};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f34587;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f34588;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f34589;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f34590;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int[] f34591;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f34592;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int[] f34593;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f34594;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C22933 f34595;

    /* JADX WARN: Code duplicated, block: B:42:0x0150 A[PHI: r10 r11 r15
      0x0150: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:41:0x014e, B:17:0x0089, B:14:0x006f, B:11:0x0064, B:8:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0150: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:41:0x014e, B:17:0x0089, B:14:0x006f, B:11:0x0064, B:8:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0150: PHI (r15v4 short[]) = (r15v3 short[]), (r15v2 short[]), (r15v2 short[]), (r15v2 short[]), (r15v2 short[]) binds: [B:41:0x014e, B:17:0x0089, B:14:0x006f, B:11:0x0064, B:8:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x018d A[PHI: r2 r4 r5
      0x018d: PHI (r2v5 l.᩺ۤܿ) = (r2v3 l.᩺ۤܿ), (r2v2 l.᩺ۤܿ), (r2v2 l.᩺ۤܿ) binds: [B:45:0x018b, B:37:0x012c, B:8:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x018d: PHI (r4v5 int) = (r4v2 int), (r4v3 int), (r4v2 int) binds: [B:45:0x018b, B:37:0x012c, B:8:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x018d: PHI (r5v5 int) = (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:45:0x018b, B:37:0x012c, B:8:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x023f A[PHI: r13 r16 r17 r22
      0x023f: PHI (r13v4 short) = (r13v2 short), (r13v3 short), (r13v2 short) binds: [B:60:0x023d, B:56:0x021c, B:33:0x0105] A[DONT_GENERATE, DONT_INLINE]
      0x023f: PHI (r16v4 int) = (r16v3 int), (r16v2 int), (r16v2 int) binds: [B:60:0x023d, B:56:0x021c, B:33:0x0105] A[DONT_GENERATE, DONT_INLINE]
      0x023f: PHI (r17v4 int) = (r17v3 int), (r17v2 int), (r17v2 int) binds: [B:60:0x023d, B:56:0x021c, B:33:0x0105] A[DONT_GENERATE, DONT_INLINE]
      0x023f: PHI (r22v5 int) = (r22v3 int), (r22v4 int), (r22v3 int) binds: [B:60:0x023d, B:56:0x021c, B:33:0x0105] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0279 A[PHI: r3 r6 r7 r8 r9
      0x0279: PHI (r3v4 java.lang.Runnable) = 
      (r3v2 java.lang.Runnable)
      (r3v2 java.lang.Runnable)
      (r3v2 java.lang.Runnable)
      (r3v3 java.lang.Runnable)
      (r3v2 java.lang.Runnable)
     binds: [B:64:0x0277, B:29:0x00e4, B:25:0x00bf, B:21:0x009a, B:11:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0279: PHI (r6v5 java.lang.String) = 
      (r6v2 java.lang.String)
      (r6v4 java.lang.String)
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
     binds: [B:64:0x0277, B:29:0x00e4, B:25:0x00bf, B:21:0x009a, B:11:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0279: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:64:0x0277, B:29:0x00e4, B:25:0x00bf, B:21:0x009a, B:11:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0279: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:64:0x0277, B:29:0x00e4, B:25:0x00bf, B:21:0x009a, B:11:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0279: PHI (r9v5 short) = (r9v4 short), (r9v2 short), (r9v2 short), (r9v2 short), (r9v2 short) binds: [B:64:0x0277, B:29:0x00e4, B:25:0x00bf, B:21:0x009a, B:11:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        int iM6981;
        int i;
        int i2;
        int i3 = C0630.f2410;
        int i4 = C3911.f12484;
        int iM2566 = C0630.m2566("ۚۤ") ^ i3;
        int i5 = ((iM2566 ^ i4) * (-4663)) ^ (-1671399034);
        Runnable runnable = null;
        String strM5917 = null;
        short[] sArr = null;
        int i6 = iM2566 ^ 1382532787;
        C22933 c22933 = null;
        int iM6982 = 0;
        int i7 = 0;
        int iM2567 = 0;
        int i8 = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 358959661;
        int i15 = 0;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i4) * 1383) >> 31));
            switch (i14) {
                case -2138205316:
                case 625273352:
                    iM2567 = C0630.m2566(strM5917);
                    i8 = 2127957149;
                    if (C1420.f5096 <= 0) {
                        iM6981 = (C2105.m6981("᩶ܺ") + i3) * (-95);
                        i = ((iM6981 ^ i4) * 27289) ^ 135881763;
                        i2 = 992785085;
                    } else {
                        iM6981 = C0630.m2566("᩻᩺") ^ i4;
                        i = ((iM6981 ^ i3) * 18363) ^ 235756742;
                        i2 = 769312305;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -2126662501:
                case -1415024607:
                    i12 = s * s;
                    i13 = 171374281;
                    if (C2105.m6982() != 0) {
                        iM6981 = (C2105.m6981("᩻۠") ^ i3) * (-29);
                        i = ((iM6981 ^ i4) * (-10183)) ^ 806173041;
                        i2 = -2046505770;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ܳ۠")) * (-83);
                        i = ((iM6981 ^ i4) * (-29891)) ^ (-1542787925);
                        i2 = -1304956025;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1845495598:
                case 1067721215:
                    if (C7811.f24123 < 0) {
                        iM6981 = C0630.m2566("᩹᩻") ^ i3;
                        i = ((iM6981 ^ i4) * 25715) ^ (-818087635);
                        i2 = -956792397;
                    } else {
                        iM6981 = (C0630.m2566("᩵ۧ") + i4) * (-75);
                        i = ((iM6981 ^ i3) * (-9761)) ^ (-32005499);
                        i2 = 395611218;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1832180258:
                case 1667345585:
                    sArr = f34586;
                    i9 = 14;
                    i10 = 3;
                    if (C2958.m9034() <= 0) {
                        iM6981 = C0630.m2566("᩹᩻") ^ i3;
                        i = ((iM6981 ^ i4) * 25715) ^ (-818087635);
                        i2 = -956792397;
                    } else {
                        iM6981 = (C0630.m2566("֫ܶ") ^ i3) * (-121);
                        i = ((iM6981 ^ i4) * 6959) ^ 646939390;
                        i2 = 965377117;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1672797737:
                case 1606897721:
                    C1711.m5736();
                    break;
                case -1244865154:
                case 1558695005:
                    c22933.m51049(iM6982 ^ i7);
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = (C2105.m6981("᩻۠") ^ i3) * (-29);
                        i = ((iM6981 ^ i4) * (-10183)) ^ 806173041;
                        i2 = -2046505770;
                    } else {
                        iM6981 = C0630.m2566("ܶܽ") ^ i4;
                        i = ((iM6981 ^ i3) * 16817) ^ (-1156397274);
                        i2 = 923319024;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -885346437:
                case 650694009:
                    c22933.m51038(iM2567 ^ i8);
                    runnable = null;
                    if (C4159.f13567) {
                        iM6981 = (C2105.m6981("ܶ᩷") + i4) * (-119);
                        i = ((iM6981 ^ i3) * (-30541)) ^ (-1213064039);
                        i2 = -1105797240;
                    } else {
                        iM6981 = (C2105.m6981("᩶ܺ") + i3) * (-95);
                        i = ((iM6981 ^ i4) * 27289) ^ 135881763;
                        i2 = 992785085;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -773096926:
                case 1046594640:
                    strM5917 = C1773.m5917(f34586, 17, 3, i11);
                    if (C2126.f7087) {
                        iM6981 = (C2105.m6981("᩶ܺ") + i3) * (-95);
                        i = ((iM6981 ^ i4) * 27289) ^ 135881763;
                        i2 = 992785085;
                    } else {
                        iM6981 = C0630.m2566("۬ۘ") ^ i3;
                        i = ((iM6981 ^ i4) * 27151) ^ (-896975675);
                        i2 = 2146752546;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -643420141:
                case 1812508087:
                    C5695.m16023();
                    if (C2958.m9034() > 0) {
                        iM6981 = C0630.m2566("᩹᩻") ^ i3;
                        i = ((iM6981 ^ i4) * 25715) ^ (-818087635);
                        i2 = -956792397;
                    } else {
                        iM6981 = C0630.m2566("᩸᩺") ^ i4;
                        i = ((iM6981 ^ i3) * (-21201)) ^ 894960478;
                        i2 = -2114997451;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 29133365:
                case 1436000892:
                    c22933 = new C22933(C22628.m50612(this.f34587));
                    if (C0964.f3626 != 0) {
                        iM6981 = (C0630.m2566("᩵ۧ") + i4) * (-75);
                        i = ((iM6981 ^ i3) * (-9761)) ^ (-32005499);
                        i2 = 395611218;
                    } else {
                        iM6981 = C2105.m6981("᩺۬") ^ i4;
                        i = ((iM6981 ^ i3) * 3593) ^ (-41263482);
                        i2 = 1948989561;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 123129646:
                case 526476962:
                    i11 = 12813;
                    iM6981 = (i4 - C0630.m2566("ܰۙ")) * 35;
                    i = ((iM6981 ^ i3) * 6909) ^ (-632981197);
                    i2 = -1856879375;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 148370111:
                case 643223960:
                    s = f34586[13];
                    if (C1128.m3851() <= 0) {
                        iM6981 = (C2105.m6981("᩶ܺ") + i3) * (-95);
                        i = ((iM6981 ^ i4) * 27289) ^ 135881763;
                        i2 = 992785085;
                    } else {
                        iM6981 = C2105.m6981("᩵ۜ") ^ i4;
                        i = ((iM6981 ^ i3) * (-6921)) ^ (-49456202);
                        i2 = 1296592179;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 272634784:
                case 1992978505:
                    i11 = 37348;
                    iM6981 = (i4 - C0630.m2566("ܰۙ")) * 35;
                    i = ((iM6981 ^ i3) * 6909) ^ (-632981197);
                    i2 = -1856879375;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 391940047:
                case 1293223361:
                    if (C0798.f2919) {
                        iM6981 = C0630.m2566("᩹᩻") ^ i3;
                        i = ((iM6981 ^ i4) * 25715) ^ (-818087635);
                        i2 = -956792397;
                    } else {
                        iM6981 = (C2105.m6981("᩶ܺ") + i3) * (-95);
                        i = ((iM6981 ^ i4) * 27289) ^ 135881763;
                        i2 = 992785085;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 439605858:
                case 1128182720:
                    int i16 = s + s2;
                    if ((i16 * i16) - i15 <= 0) {
                        iM6981 = C0630.m2566("ۤ֨") ^ i3;
                        i = ((iM6981 ^ i4) * 20985) ^ 1840412371;
                        i2 = 1171346080;
                    } else {
                        iM6981 = (C2105.m6981("֫֫") ^ i3) * 33;
                        i = ((iM6981 ^ i4) * 26501) ^ (-401884970);
                        i2 = -965611857;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 456122726:
                case 1125799146:
                    iM6982 = C2105.m6981(C0630.m2575(sArr, i9, i10, i11));
                    i7 = 2125424796;
                    if (C1916.f6442) {
                        iM6981 = C0630.m2566("֡ۖ") ^ i3;
                        i = ((iM6981 ^ i4) * 24021) ^ (-324055075);
                        i2 = 106403406;
                    } else {
                        iM6981 = (C0630.m2566("᩵ۧ") + i4) * (-75);
                        i = ((iM6981 ^ i3) * (-9761)) ^ (-32005499);
                        i2 = 395611218;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 477690873:
                case 718991618:
                    int i17 = i12 + i13;
                    i15 = i17 + i17;
                    s2 = 13091;
                    if (C4117.f13076 <= 0) {
                        iM6981 = (C2105.m6981("᩻۠") ^ i3) * (-29);
                        i = ((iM6981 ^ i4) * (-10183)) ^ 806173041;
                        i2 = -2046505770;
                    } else {
                        iM6981 = C2105.m6981("᩺ᩳ") ^ i4;
                        i = ((iM6981 ^ i3) * (-15215)) ^ (-1827265624);
                        i2 = -1512121620;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 627817635:
                case 1729092130:
                    ViewOnClickListenerC1958.m6429();
                    iM6981 = C0630.m2566("᩹᩻") ^ i3;
                    i = ((iM6981 ^ i4) * 25715) ^ (-818087635);
                    i2 = -956792397;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                default:
                    c22933.mo49542(runnable);
                    c22933.mo49547();
                    this.f34595 = c22933;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        AbstractC15440 abstractC15440 = null;
        int i = -1040897992;
        int i2 = C1128.f4106;
        int i3 = C0630.f2410;
        int iM6981 = (C2105.m6981("ۢۧ") ^ i2) * 19;
        int i4 = ((iM6981 ^ i3) * (-14331)) ^ (-625460690);
        int i5 = 773784616;
        while (true) {
            i = ((((i ^ i3) * 19737) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -1998452779:
                case -1799961093:
                    AbstractC2021.m6569(abstractC15440);
                    if (C3683.f11629 >= 0) {
                        iM6981 = (i2 - C2105.m6981("ۖ۫")) * (-39);
                        i4 = ((iM6981 ^ i3) * 20949) ^ (-1602740613);
                        i5 = -1691486087;
                    } else {
                        iM6981 = (C2105.m6981("ܰۧ") + i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM6981 ^ i2) * 32067) ^ 1211844762;
                        i5 = -474007919;
                    }
                    break;
                case -1908180814:
                case 796628106:
                    if (C21923.f70183 != 0) {
                        iM6981 = (C2105.m6981("֨ۧ") ^ i3) * (-105);
                        i4 = ((iM6981 ^ i2) * (-20133)) ^ (-1945805724);
                        i5 = -1871994836;
                    } else {
                        iM6981 = (C0630.m2566("᩷ۚ") ^ i2) * (-115);
                        i4 = ((iM6981 ^ i3) * 26669) ^ 66524756;
                        i5 = 1350671170;
                    }
                    break;
                case -1883025569:
                case 1884227972:
                    abstractC15440 = this.f34594;
                    if (C0714.f2697 >= 0) {
                        iM6981 = (C2105.m6981("ۤ۫") + i2) * (-51);
                        i4 = ((iM6981 ^ i3) * (-13781)) ^ 1475098757;
                        i5 = 1878428535;
                    } else {
                        iM6981 = (C0630.m2566("۫᩵") ^ i3) * (-17);
                        i4 = ((iM6981 ^ i2) * 2595) ^ (-1254942511);
                        i5 = -211997497;
                    }
                    break;
                case -1862704848:
                case -1646495279:
                    this.f34595.m51051();
                    C0050.m936();
                    break;
                case -1617265372:
                case 1634149579:
                    if (C7811.f24123 >= 0) {
                        iM6981 = C0630.m2566("֫֨") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-8499)) ^ 1940470552;
                        i5 = -681170314;
                    } else {
                        iM6981 = (C2105.m6981("ܽۚ") ^ i2) * 67;
                        i4 = ((iM6981 ^ i3) * (-16413)) ^ (-1187730571);
                        i5 = 976600077;
                    }
                    break;
                case -1470997738:
                case 152095059:
                    if (C0964.m3413()) {
                        iM6981 = C2105.m6981("ۜۘ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-20247)) ^ 2142961325;
                        i5 = -1759600240;
                    } else {
                        iM6981 = (C2105.m6981("ܿ֫") ^ i3) * 89;
                        i4 = ((iM6981 ^ i2) * (-31423)) ^ (-252052405);
                        i5 = 2066932479;
                    }
                    break;
                case -1374725190:
                case 1572924787:
                    C3537.m10746();
                    if (!C1711.f5919) {
                        iM6981 = (C2105.m6981("ܿ֫") ^ i3) * 89;
                        i4 = ((iM6981 ^ i2) * (-31423)) ^ (-252052405);
                        i5 = 2066932479;
                    } else {
                        iM6981 = (C2105.m6981("ۤ۫") + i2) * (-51);
                        i4 = ((iM6981 ^ i3) * (-13781)) ^ 1475098757;
                        i5 = 1878428535;
                    }
                    break;
                case -1162064031:
                case -734347153:
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = (C2105.m6981("ܿ֫") ^ i3) * 89;
                        i4 = ((iM6981 ^ i2) * (-31423)) ^ (-252052405);
                        i5 = 2066932479;
                    } else {
                        iM6981 = (C0630.m2566("᩷ۙ") ^ i2) * (-77);
                        i4 = ((iM6981 ^ i3) * (-23121)) ^ 1846037350;
                        i5 = -407843413;
                    }
                    break;
                case -603646771:
                case -366917375:
                    if (C0964.m3413()) {
                        iM6981 = (i3 - C2105.m6981("᩺ܳ")) * 7;
                        i4 = ((iM6981 ^ i2) * 11801) ^ 1258697379;
                        i5 = 1438938001;
                    } else {
                        iM6981 = (C2105.m6981("֨ۧ") ^ i3) * (-105);
                        i4 = ((iM6981 ^ i2) * (-20133)) ^ (-1945805724);
                        i5 = -1871994836;
                    }
                    break;
                case -538797853:
                case 1932703756:
                    ViewOnClickListenerC1958.m6429();
                    if (C3537.f11231 >= 0) {
                        iM6981 = (C2105.m6981("֨ۧ") ^ i3) * (-105);
                        i4 = ((iM6981 ^ i2) * (-20133)) ^ (-1945805724);
                        i5 = -1871994836;
                    } else {
                        iM6981 = (C2105.m6981("ܿ֫") ^ i3) * 89;
                        i4 = ((iM6981 ^ i2) * (-31423)) ^ (-252052405);
                        i5 = 2066932479;
                    }
                    break;
                case -66992507:
                case 1939976444:
                    C1005.m3501();
                    RunnableC3474.m10630();
                    break;
                case -21701381:
                case 1291768661:
                    if (C1916.m6308() >= 0) {
                        iM6981 = (C2105.m6981("ۤ۫") + i2) * (-51);
                        i4 = ((iM6981 ^ i3) * (-13781)) ^ 1475098757;
                        i5 = 1878428535;
                    } else {
                        iM6981 = (C2105.m6981("ܿ᩵") ^ i2) * 53;
                        i4 = ((iM6981 ^ i3) * 26363) ^ (-1109151330);
                        i5 = 397580697;
                    }
                    break;
                case 15948818:
                case 923661708:
                    if (C21923.m49329()) {
                        iM6981 = (C2105.m6981("֨ۧ") ^ i3) * (-105);
                        i4 = ((iM6981 ^ i2) * (-20133)) ^ (-1945805724);
                        i5 = -1871994836;
                    } else {
                        iM6981 = (C0630.m2566("᩸۟") + i3) * (-125);
                        i4 = ((iM6981 ^ i2) * (-32597)) ^ (-1671679223);
                        i5 = 1778531658;
                    }
                    break;
                case 791273090:
                case 1594976184:
                    if (C1773.m5908() <= 0) {
                        iM6981 = C0630.m2566("֫֨") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-8499)) ^ 1940470552;
                        i5 = -681170314;
                    } else {
                        iM6981 = (C2105.m6981("֨ۧ") ^ i3) * (-105);
                        i4 = ((iM6981 ^ i2) * (-20133)) ^ (-1945805724);
                        i5 = -1871994836;
                    }
                    break;
                case 1677952460:
                case 2076071629:
                    if (C0798.f2919) {
                        iM6981 = (C2105.m6981("֨ۧ") ^ i3) * (-105);
                        i4 = ((iM6981 ^ i2) * (-20133)) ^ (-1945805724);
                        i5 = -1871994836;
                    } else {
                        iM6981 = C0630.m2566("ۧۙ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 10875) ^ (-1108979814);
                        i5 = -1543180433;
                    }
                    break;
                default:
                    C4075.m12263();
                    C1005.m3501();
                    iM6981 = (C2105.m6981("ܿ֫") ^ i3) * 89;
                    i4 = ((iM6981 ^ i2) * (-31423)) ^ (-252052405);
                    i5 = 2066932479;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x016b, code lost:
    
        if (l.C3432.m10477() <= 0) goto L19;
     */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1009() throws Throwable {
        int iM2566;
        int i;
        int i2;
        int iM6981;
        int i3;
        short s;
        int i4;
        int iM6982;
        int i5;
        int i6;
        int i7;
        int iM2567;
        int i8;
        int i9;
        int i10;
        C8918 c8918;
        Object obj;
        Throwable th;
        int i11;
        C22933 c22933;
        int iM6983;
        int i12;
        int i13;
        int iM2568;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Throwable th2;
        int i19;
        C11601 c11601 = this;
        int i20 = -889049918;
        int i21 = AbstractC2021.f6743;
        int i22 = C3537.f11231;
        int iM6984 = C2105.m6981("ۜ۠") ^ i22;
        int i23 = ((iM6984 ^ i21) * 9115) ^ (-476104720);
        int i24 = iM6984 ^ 78886365;
        C22933 c22934 = null;
        Throwable th3 = null;
        Object obj2 = null;
        Object obj3 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        AbstractC15440 abstractC15440 = null;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int iM6985 = 0;
        char c = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        short s2 = 0;
        int i32 = 0;
        C8918 c8919 = null;
        int i33 = 0;
        C18090 c18090 = null;
        Throwable th4 = null;
        short[] sArr3 = null;
        int iM6986 = 0;
        C18090 c18091 = null;
        C22933 c22935 = null;
        Object obj4 = null;
        Throwable th5 = null;
        while (true) {
            i20 = i24 ^ (i23 & (((i20 ^ i21) * 7137) >> 31));
            switch (i20) {
                case -2137093890:
                case -1247621491:
                    C3432.m10477();
                    th4 = th4;
                    iM2566 = C0630.m2566("ܶۗ") ^ i21;
                    i = ((iM2566 ^ i22) * (-11353)) ^ (-1231970425);
                    i2 = 92671432;
                    int i34 = iM2566 ^ i2;
                    th4 = th4;
                    i24 = i34;
                    i23 = i;
                    break;
                case -2107103231:
                case 120117775:
                    throw th4;
                case -2105559495:
                case -2100722094:
                    i4 = i32;
                    i25 = 4137;
                    iM2567 = (C0630.m2566("ۚ۟") ^ i21) * (-95);
                    i8 = ((iM2567 ^ i22) * 19889) ^ 504642701;
                    i9 = -245181798;
                    i10 = iM2567 ^ i9;
                    sArr2 = sArr2;
                    i33 = i33;
                    i26 = i26;
                    obj2 = obj2;
                    th2 = th4;
                    i24 = i10;
                    i23 = i8;
                    abstractC15440 = abstractC15440;
                    c22934 = c22934;
                    th3 = th3;
                    c8919 = c8919;
                    th4 = th2;
                    short[] sArr4 = sArr3;
                    i32 = i4;
                    sArr3 = sArr4;
                    break;
                case -1974529456:
                case -78965049:
                    AbstractC2021.m6574();
                    break;
                case -1967645578:
                case 1764213339:
                    C7106.m19120();
                    if (C1420.f5096 > 0) {
                        iM6981 = C2105.m6981("ᩴ۬") ^ i22;
                        i = ((iM6981 ^ i21) * 21793) ^ 1573479507;
                        i3 = -1913995266;
                        i24 = iM6981 ^ i3;
                        i23 = i;
                    }
                    th4 = th4;
                    iM2566 = C0630.m2566("ܶۗ") ^ i21;
                    i = ((iM2566 ^ i22) * (-11353)) ^ (-1231970425);
                    i2 = 92671432;
                    int i35 = iM2566 ^ i2;
                    th4 = th4;
                    i24 = i35;
                    i23 = i;
                    break;
                case -1951432026:
                case 169375929:
                    try {
                        C2520.m8028(c18091);
                        iM6981 = C0630.m2566("ܿۨ") ^ i22;
                        i = ((iM6981 ^ i21) * 12681) ^ 2060457038;
                        i3 = -695127604;
                        i24 = iM6981 ^ i3;
                        i23 = i;
                    } catch (Throwable th6) {
                        int iM6987 = (C2105.m6981("ܽۨ") ^ i22) * (-35);
                        i24 = iM6987 ^ (-1149952418);
                        i19 = ((iM6987 ^ i21) * 3247) ^ (-1370944014);
                        obj3 = th6;
                        i23 = i19;
                    }
                    break;
                case -1902345090:
                case -1484800766:
                    th4 = th4;
                    throw th5;
                case -1886698686:
                case -198616752:
                    th4 = th4;
                    c22935.m51038(iM6985 ^ 2101988040);
                    c18091 = new C18090(abstractC15440);
                    iM2566 = (C2105.m6981("ܽ᩶") + i21) * (-5);
                    i = ((iM2566 ^ i22) * (-22211)) ^ 1823618446;
                    i2 = -209416674;
                    int i36 = iM2566 ^ i2;
                    th4 = th4;
                    i24 = i36;
                    i23 = i;
                    break;
                case -1864631326:
                case 777217789:
                    th4 = th4;
                    c8919 = c8919;
                    obj2 = obj2;
                    i33 = i33;
                    th3 = th3;
                    i26 = i26;
                    c22934 = c22934;
                    sArr2 = sArr2;
                    abstractC15440 = abstractC15440;
                    int i37 = i32;
                    sArr3 = sArr3;
                    i4 = i37;
                    s2 = sArr[c];
                    if (!C2272.f7362) {
                        int iM2569 = (C0630.m2566("ۤ᩷") + i22) * (-77);
                        i5 = ((iM2569 ^ i21) * 12125) ^ (-1155235382);
                        i7 = iM2569 ^ (-39676897);
                        sArr2 = sArr2;
                        i33 = i33;
                        abstractC15440 = abstractC15440;
                        i26 = i26;
                        obj2 = obj2;
                        c22934 = c22934;
                        th3 = th3;
                        c8919 = c8919;
                        th4 = th4;
                        i24 = i7;
                        i23 = i5;
                        c11601 = this;
                        short[] sArr5 = sArr3;
                        i32 = i4;
                        sArr3 = sArr5;
                    } else {
                        i33 = i33;
                        int iM25610 = (C0630.m2566("ۡܽ") + i22) * 65;
                        i5 = ((iM25610 ^ i21) * (-18987)) ^ 1764598682;
                        i7 = iM25610 ^ (-1062563144);
                        sArr2 = sArr2;
                        abstractC15440 = abstractC15440;
                        i26 = i26;
                        obj2 = obj2;
                        c22934 = c22934;
                        th3 = th3;
                        c8919 = c8919;
                        th4 = th4;
                        i24 = i7;
                        i23 = i5;
                        c11601 = this;
                        short[] sArr6 = sArr3;
                        i32 = i4;
                        sArr3 = sArr6;
                    }
                    break;
                case -1709737054:
                case -1121795542:
                    try {
                        th4 = th4;
                        c11601.f34589 = C21022.m47840(c18091, c11601.f34592, c11601.f34588, c11601.f34595.m51043());
                        iM2566 = C2105.m6981("֡ܺ") ^ i21;
                        i = ((iM2566 ^ i22) * 14679) ^ (-1518845609);
                        i2 = 870369304;
                        int i38 = iM2566 ^ i2;
                        th4 = th4;
                        i24 = i38;
                    } catch (Throwable th7) {
                        th4 = th7;
                        iM6981 = C2105.m6981("ۧ᩸") ^ i21;
                        i = ((iM6981 ^ i22) * 22065) ^ (-500233177);
                        i3 = 1555171147;
                        i24 = iM6981 ^ i3;
                    }
                    i23 = i;
                    break;
                case -1374995170:
                case -654342743:
                    th4 = th4;
                    c8919 = c8919;
                    obj2 = obj2;
                    i33 = i33;
                    th3 = th3;
                    i26 = i26;
                    c22934 = c22934;
                    sArr2 = sArr2;
                    abstractC15440 = abstractC15440;
                    int i39 = i32;
                    sArr3 = sArr3;
                    i4 = i39;
                    int i40 = i30 + i31;
                    if (i29 - (i40 + i40) <= 0) {
                        iM2567 = C2105.m6981("ܶܰ") ^ i21;
                        i8 = ((iM2567 ^ i22) * (-3197)) ^ (-857874494);
                        i9 = 1163667594;
                    } else {
                        iM2567 = C2105.m6981("ܶۡ") ^ i22;
                        i8 = ((iM2567 ^ i21) * (-14195)) ^ 667269713;
                        i9 = 1399876723;
                    }
                    i10 = iM2567 ^ i9;
                    sArr2 = sArr2;
                    i33 = i33;
                    i26 = i26;
                    obj2 = obj2;
                    th2 = th4;
                    i24 = i10;
                    i23 = i8;
                    abstractC15440 = abstractC15440;
                    c22934 = c22934;
                    th3 = th3;
                    c8919 = c8919;
                    th4 = th2;
                    short[] sArr7 = sArr3;
                    i32 = i4;
                    sArr3 = sArr7;
                    break;
                case -1325201979:
                case 22743113:
                    th4 = th4;
                    c8918 = c8919;
                    obj = obj2;
                    th = th3;
                    i11 = i26;
                    int i41 = i32;
                    sArr3 = sArr3;
                    i4 = i41;
                    c22933 = c22934;
                    c22933.m51038(iM6986 ^ 2121397989);
                    if (C11340.f33930 >= 0) {
                        iM6983 = (C0630.m2566("ۚۛ") + i21) * (-31);
                        i12 = ((iM6983 ^ i22) * 11699) ^ (-1611642514);
                        i13 = -573818397;
                    } else {
                        iM6983 = C2105.m6981("᩵᩹") ^ i22;
                        i12 = ((iM6983 ^ i21) * (-28493)) ^ 851981075;
                        i13 = -849548962;
                    }
                    i16 = iM6983 ^ i13;
                    c22934 = c22933;
                    th3 = th;
                    c8919 = c8918;
                    th4 = th4;
                    i24 = i16;
                    i23 = i12;
                    i26 = i11;
                    obj2 = obj;
                    short[] sArr8 = sArr3;
                    i32 = i4;
                    sArr3 = sArr8;
                    break;
                case -1283387122:
                case -1247117820:
                    th4 = th4;
                    c8919 = c8919;
                    obj = obj2;
                    th3 = th3;
                    i11 = i26;
                    int i42 = i32;
                    sArr3 = sArr3;
                    i4 = i42;
                    try {
                        C5695.m16020(c18090);
                        iM2568 = C2105.m6981("ۗܶ") ^ i22;
                        i14 = ((iM2568 ^ i21) * (-14873)) ^ 1636881445;
                        i15 = -1095347881;
                        i18 = iM2568 ^ i15;
                        i26 = i11;
                        obj2 = obj;
                        th2 = th4;
                        i24 = i18;
                        i23 = i14;
                        th3 = th3;
                        c8919 = c8919;
                        th4 = th2;
                        short[] sArr9 = sArr3;
                        i32 = i4;
                        sArr3 = sArr9;
                    } catch (Throwable th8) {
                        int iM25611 = (C0630.m2566("ۙۨ") ^ i22) * (-39);
                        obj2 = th8;
                        i23 = ((iM25611 ^ i21) * (-11031)) ^ 732244460;
                        i26 = i11;
                        i32 = i4;
                        sArr3 = sArr3;
                        i24 = iM25611 ^ 705088060;
                        th3 = th3;
                        c8919 = c8919;
                        th4 = th4;
                    }
                    break;
                case -1262247907:
                case -663889881:
                    C3432.m10477();
                    if (C1420.f5096 <= 0) {
                        th4 = th4;
                        c8919 = c8919;
                        obj2 = obj2;
                        th3 = th3;
                        i26 = i26;
                        c22934 = c22934;
                        sArr2 = sArr2;
                        abstractC15440 = abstractC15440;
                        int i43 = i32;
                        sArr3 = sArr3;
                        i4 = i43;
                        int iM25612 = (C0630.m2566("ۡܽ") + i22) * 65;
                        i5 = ((iM25612 ^ i21) * (-18987)) ^ 1764598682;
                        i7 = iM25612 ^ (-1062563144);
                        sArr2 = sArr2;
                        abstractC15440 = abstractC15440;
                        i26 = i26;
                        obj2 = obj2;
                        c22934 = c22934;
                        th3 = th3;
                        c8919 = c8919;
                        th4 = th4;
                        i24 = i7;
                        i23 = i5;
                        c11601 = this;
                        short[] sArr10 = sArr3;
                        i32 = i4;
                        sArr3 = sArr10;
                    } else {
                        th4 = th4;
                        iM2566 = C0630.m2566("ܶۗ") ^ i21;
                        i = ((iM2566 ^ i22) * (-11353)) ^ (-1231970425);
                        i2 = 92671432;
                        int i310 = iM2566 ^ i2;
                        th4 = th4;
                        i24 = i310;
                        i23 = i;
                    }
                    break;
                case -943535565:
                case -387858301:
                    C0714.m2815(th4, obj3);
                    iM6981 = C0630.m2566("ܿۨ") ^ i22;
                    i = ((iM6981 ^ i21) * 12681) ^ 2060457038;
                    i3 = -695127604;
                    i24 = iM6981 ^ i3;
                    i23 = i;
                    break;
                case -843048189:
                case 1559374759:
                    if (C0630.f2410 <= 0) {
                        th4 = th4;
                        c8919 = c8919;
                        obj2 = obj2;
                        i33 = i33;
                        th3 = th3;
                        i26 = i26;
                        c22934 = c22934;
                        sArr2 = sArr2;
                        abstractC15440 = abstractC15440;
                        s = s2;
                        int i44 = i32;
                        sArr3 = sArr3;
                        i4 = i44;
                        iM6982 = C0630.m2566("ۤۙ") ^ i22;
                        i5 = ((iM6982 ^ i21) * 31031) ^ 212309764;
                        i6 = -1881546530;
                        i7 = iM6982 ^ i6;
                        s2 = s;
                        sArr2 = sArr2;
                        i33 = i33;
                        abstractC15440 = abstractC15440;
                        i26 = i26;
                        obj2 = obj2;
                        c22934 = c22934;
                        th3 = th3;
                        c8919 = c8919;
                        th4 = th4;
                        i24 = i7;
                        i23 = i5;
                        c11601 = this;
                        short[] sArr11 = sArr3;
                        i32 = i4;
                        sArr3 = sArr11;
                    } else {
                        iM6981 = C2105.m6981("ۙۧ") ^ i21;
                        i = ((iM6981 ^ i22) * (-21343)) ^ 2053161834;
                        i3 = 1066243830;
                        i24 = iM6981 ^ i3;
                        i23 = i;
                    }
                    break;
                case -720739821:
                case 1532864636:
                    th4 = th4;
                    c8919 = c8919;
                    obj2 = obj2;
                    i33 = i33;
                    th3 = th3;
                    i26 = i26;
                    c22934 = c22934;
                    sArr2 = sArr2;
                    abstractC15440 = abstractC15440;
                    s = s2;
                    int i45 = i32;
                    sArr3 = sArr3;
                    i4 = i45;
                    sArr = f34586;
                    c = 20;
                    if (C0422.f1886 <= 0) {
                        iM6982 = C0630.m2566("ܰܽ") ^ i22;
                        i5 = ((iM6982 ^ i21) * (-2983)) ^ 1616333086;
                        i6 = 1702513242;
                    } else {
                        iM6982 = (C2105.m6981("ۤ᩶") + i21) * (-9);
                        i5 = ((iM6982 ^ i22) * (-32005)) ^ (-282406836);
                        i6 = 1663268897;
                    }
                    i7 = iM6982 ^ i6;
                    s2 = s;
                    sArr2 = sArr2;
                    i33 = i33;
                    abstractC15440 = abstractC15440;
                    i26 = i26;
                    obj2 = obj2;
                    c22934 = c22934;
                    th3 = th3;
                    c8919 = c8919;
                    th4 = th4;
                    i24 = i7;
                    i23 = i5;
                    c11601 = this;
                    short[] sArr12 = sArr3;
                    i32 = i4;
                    sArr3 = sArr12;
                    break;
                case -539497571:
                case 665344028:
                    th4 = th4;
                    c8919 = c8919;
                    obj = obj2;
                    i17 = i33;
                    th3 = th3;
                    i11 = i26;
                    int i46 = i32;
                    sArr3 = sArr3;
                    i4 = i46;
                    abstractC15440 = c11601.f34594;
                    C22933 c22936 = c11601.f34595;
                    sArr2 = f34586;
                    if (C1047.f3863 >= 0) {
                        c22934 = c22936;
                        int iM25613 = C0630.m2566("ۡۡ") ^ i21;
                        i14 = ((iM25613 ^ i22) * (-23433)) ^ (-1567760936);
                        i18 = iM25613 ^ (-588955149);
                        i33 = i17;
                        i26 = i11;
                        obj2 = obj;
                        th2 = th4;
                        i24 = i18;
                        i23 = i14;
                        th3 = th3;
                        c8919 = c8919;
                        th4 = th2;
                        short[] sArr13 = sArr3;
                        i32 = i4;
                        sArr3 = sArr13;
                    } else {
                        int iM6988 = (i22 - C2105.m6981("ܺܺ")) * (-41);
                        c22934 = c22936;
                        i23 = ((iM6988 ^ i21) * (-709)) ^ 1026128454;
                        i33 = i17;
                        i26 = i11;
                        obj2 = obj;
                        i32 = i4;
                        sArr3 = sArr3;
                        i24 = iM6988 ^ 1140362130;
                        th3 = th3;
                        c8919 = c8919;
                        th4 = th4;
                    }
                    break;
                case -517439902:
                case -177608414:
                    th4 = th4;
                    c8919 = c8919;
                    obj2 = obj2;
                    i33 = i33;
                    th3 = th3;
                    i26 = i26;
                    c22934 = c22934;
                    sArr2 = sArr2;
                    abstractC15440 = abstractC15440;
                    int i47 = i32;
                    sArr3 = sArr3;
                    i4 = i47;
                    i29 = i28 * i28;
                    i30 = s2 * s2;
                    i31 = 801025;
                    if (C7106.f21815 == 0) {
                        iM2567 = (C0630.m2566("᩵᩵") ^ i22) * (-7);
                        i8 = ((iM2567 ^ i21) * (-4323)) ^ (-1923984030);
                        i9 = -303884668;
                        i10 = iM2567 ^ i9;
                        sArr2 = sArr2;
                        i33 = i33;
                        i26 = i26;
                        obj2 = obj2;
                        th2 = th4;
                        i24 = i10;
                        i23 = i8;
                        abstractC15440 = abstractC15440;
                        c22934 = c22934;
                        th3 = th3;
                        c8919 = c8919;
                        th4 = th2;
                        short[] sArr14 = sArr3;
                        i32 = i4;
                        sArr3 = sArr14;
                    } else {
                        s = s2;
                        iM6982 = C0630.m2566("ܰܽ") ^ i22;
                        i5 = ((iM6982 ^ i21) * (-2983)) ^ 1616333086;
                        i6 = 1702513242;
                        i7 = iM6982 ^ i6;
                        s2 = s;
                        sArr2 = sArr2;
                        i33 = i33;
                        abstractC15440 = abstractC15440;
                        i26 = i26;
                        obj2 = obj2;
                        c22934 = c22934;
                        th3 = th3;
                        c8919 = c8919;
                        th4 = th4;
                        i24 = i7;
                        i23 = i5;
                        c11601 = this;
                        short[] sArr15 = sArr3;
                        i32 = i4;
                        sArr3 = sArr15;
                    }
                    break;
                case -441287481:
                case -398790255:
                    th4 = th4;
                    iM6985 = C2105.m6981(C5695.m16034(sArr3, i27, i26, i25));
                    if (C5695.m16023() < 0) {
                        iM2566 = C0630.m2566("ܳۢ") ^ i22;
                        i = ((iM2566 ^ i21) * 19199) ^ 1545569832;
                        i2 = 630240021;
                        int i311 = iM2566 ^ i2;
                        th4 = th4;
                        i24 = i311;
                        i23 = i;
                    } else {
                        c8919 = c8919;
                        obj2 = obj2;
                        i33 = i33;
                        th3 = th3;
                        i26 = i26;
                        c22934 = c22934;
                        sArr2 = sArr2;
                        abstractC15440 = abstractC15440;
                        s = s2;
                        int i48 = i32;
                        sArr3 = sArr3;
                        i4 = i48;
                        iM6982 = C0630.m2566("ۤۙ") ^ i22;
                        i5 = ((iM6982 ^ i21) * 31031) ^ 212309764;
                        i6 = -1881546530;
                        i7 = iM6982 ^ i6;
                        s2 = s;
                        sArr2 = sArr2;
                        i33 = i33;
                        abstractC15440 = abstractC15440;
                        i26 = i26;
                        obj2 = obj2;
                        c22934 = c22934;
                        th3 = th3;
                        c8919 = c8919;
                        th4 = th4;
                        i24 = i7;
                        i23 = i5;
                        c11601 = this;
                        short[] sArr16 = sArr3;
                        i32 = i4;
                        sArr3 = sArr16;
                    }
                    break;
                case -428848346:
                case 380472344:
                    th4 = th4;
                    c8919 = c8919;
                    obj2 = obj2;
                    i33 = i33;
                    th3 = th3;
                    i26 = i26;
                    c22934 = c22934;
                    sArr2 = sArr2;
                    abstractC15440 = abstractC15440;
                    int i49 = i32;
                    sArr3 = sArr3;
                    i4 = i49;
                    s = s2;
                    int i50 = s + 895;
                    if (C0050.f910 >= 0) {
                        i28 = i50;
                        iM6982 = C0630.m2566("ۤۙ") ^ i22;
                        i5 = ((iM6982 ^ i21) * 31031) ^ 212309764;
                        i6 = -1881546530;
                        i7 = iM6982 ^ i6;
                        s2 = s;
                        sArr2 = sArr2;
                        i33 = i33;
                        abstractC15440 = abstractC15440;
                        i26 = i26;
                        obj2 = obj2;
                        c22934 = c22934;
                        th3 = th3;
                        c8919 = c8919;
                        th4 = th4;
                        i24 = i7;
                        i23 = i5;
                    } else {
                        int iM25614 = (i21 - C0630.m2566("ۖۧ")) * 75;
                        i28 = i50;
                        i23 = ((iM25614 ^ i22) * 11527) ^ (-1803127372);
                        s2 = s;
                        sArr2 = sArr2;
                        i33 = i33;
                        abstractC15440 = abstractC15440;
                        i26 = i26;
                        obj2 = obj2;
                        c22934 = c22934;
                        th3 = th3;
                        c8919 = c8919;
                        th4 = th4;
                        i24 = iM25614 ^ (-1763829500);
                    }
                    c11601 = this;
                    short[] sArr17 = sArr3;
                    i32 = i4;
                    sArr3 = sArr17;
                    break;
                case -292240539:
                case 1699410466:
                    C5695.m16020(c18091);
                    return;
                case -213279049:
                case 1589230539:
                    th4 = th4;
                    C2520.m8028(c18090);
                    if (C2126.m7044(c11601.f34595)) {
                        iM2566 = C2105.m6981("ۨۜ") ^ i22;
                        i = ((iM2566 ^ i21) * (-12405)) ^ (-2108623241);
                        i2 = -1547765311;
                    } else {
                        iM2566 = (i22 - C2105.m6981("᩺ۨ")) * 43;
                        i = ((iM2566 ^ i21) * 7067) ^ (-1688817917);
                        i2 = 1029742205;
                    }
                    int i312 = iM2566 ^ i2;
                    th4 = th4;
                    i24 = i312;
                    i23 = i;
                    break;
                case -147011250:
                case 1548781900:
                    C0382.m1848();
                    if (C4616.f14690 > 0) {
                        th4 = th4;
                        c8919 = c8919;
                        obj = obj2;
                        i17 = i33;
                        th3 = th3;
                        i11 = i26;
                        int i51 = i32;
                        sArr3 = sArr3;
                        i4 = i51;
                        int iM25615 = C0630.m2566("ۡۡ") ^ i21;
                        i14 = ((iM25615 ^ i22) * (-23433)) ^ (-1567760936);
                        i18 = iM25615 ^ (-588955149);
                        i33 = i17;
                        i26 = i11;
                        obj2 = obj;
                        th2 = th4;
                        i24 = i18;
                        i23 = i14;
                        th3 = th3;
                        c8919 = c8919;
                        th4 = th2;
                        short[] sArr18 = sArr3;
                        i32 = i4;
                        sArr3 = sArr18;
                    } else {
                        th4 = th4;
                        c8919 = c8919;
                        obj2 = obj2;
                        i33 = i33;
                        th3 = th3;
                        i26 = i26;
                        c22934 = c22934;
                        sArr2 = sArr2;
                        abstractC15440 = abstractC15440;
                        s = s2;
                        int i52 = i32;
                        sArr3 = sArr3;
                        i4 = i52;
                        iM6982 = C0630.m2566("ܰܽ") ^ i22;
                        i5 = ((iM6982 ^ i21) * (-2983)) ^ 1616333086;
                        i6 = 1702513242;
                        i7 = iM6982 ^ i6;
                        s2 = s;
                        sArr2 = sArr2;
                        i33 = i33;
                        abstractC15440 = abstractC15440;
                        i26 = i26;
                        obj2 = obj2;
                        c22934 = c22934;
                        th3 = th3;
                        c8919 = c8919;
                        th4 = th4;
                        i24 = i7;
                        i23 = i5;
                        c11601 = this;
                        short[] sArr19 = sArr3;
                        i32 = i4;
                        sArr3 = sArr19;
                    }
                    break;
                case -34763608:
                case 334905779:
                    i4 = i32;
                    i25 = 42295;
                    iM2567 = (C0630.m2566("ۚ۟") ^ i21) * (-95);
                    i8 = ((iM2567 ^ i22) * 19889) ^ 504642701;
                    i9 = -245181798;
                    i10 = iM2567 ^ i9;
                    sArr2 = sArr2;
                    i33 = i33;
                    i26 = i26;
                    obj2 = obj2;
                    th2 = th4;
                    i24 = i10;
                    i23 = i8;
                    abstractC15440 = abstractC15440;
                    c22934 = c22934;
                    th3 = th3;
                    c8919 = c8919;
                    th4 = th2;
                    short[] sArr110 = sArr3;
                    i32 = i4;
                    sArr3 = sArr110;
                    break;
                case 29694711:
                case 699539728:
                    short[] sArr20 = sArr3;
                    Throwable th9 = th4;
                    C8918 c89110 = c8919;
                    int iM6989 = C2105.m6981("ܽۜ") ^ i21;
                    i23 = ((iM6989 ^ i22) * 14943) ^ (-2077024940);
                    th3 = th3;
                    i26 = i26;
                    obj2 = obj2;
                    c8919 = c89110;
                    th4 = th9;
                    i24 = iM6989 ^ 1006713584;
                    sArr3 = sArr20;
                    i32 = 0;
                    break;
                case 53219189:
                case 712678132:
                    th4 = th4;
                    c8919 = c8919;
                    obj2 = obj2;
                    th3 = th3;
                    i26 = i26;
                    c22934 = c22934;
                    sArr2 = sArr2;
                    abstractC15440 = abstractC15440;
                    int i53 = i32;
                    sArr3 = sArr3;
                    i4 = i53;
                    i33 = 21;
                    if (C3911.f12484 < 0) {
                        int iM69810 = C2105.m6981("ۜܺ") ^ i21;
                        i8 = ((iM69810 ^ i22) * (-19687)) ^ 1987229140;
                        i10 = iM69810 ^ 216895939;
                        sArr2 = sArr2;
                        i26 = i26;
                        obj2 = obj2;
                        th2 = th4;
                        i24 = i10;
                        i23 = i8;
                        abstractC15440 = abstractC15440;
                        c22934 = c22934;
                        th3 = th3;
                        c8919 = c8919;
                        th4 = th2;
                        short[] sArr111 = sArr3;
                        i32 = i4;
                        sArr3 = sArr111;
                    } else {
                        int iM25616 = (C0630.m2566("ۡܽ") + i22) * 65;
                        i5 = ((iM25616 ^ i21) * (-18987)) ^ 1764598682;
                        i7 = iM25616 ^ (-1062563144);
                        sArr2 = sArr2;
                        abstractC15440 = abstractC15440;
                        i26 = i26;
                        obj2 = obj2;
                        c22934 = c22934;
                        th3 = th3;
                        c8919 = c8919;
                        th4 = th4;
                        i24 = i7;
                        i23 = i5;
                        c11601 = this;
                        short[] sArr112 = sArr3;
                        i32 = i4;
                        sArr3 = sArr112;
                    }
                    break;
                case 82482249:
                case 695695751:
                    th4 = th4;
                    c22935 = c11601.f34595;
                    sArr3 = f34586;
                    i27 = 24;
                    i26 = 3;
                    if (C5695.m16023() >= 0) {
                        iM2566 = C0630.m2566("ܶۗ") ^ i21;
                        i = ((iM2566 ^ i22) * (-11353)) ^ (-1231970425);
                        i2 = 92671432;
                    } else {
                        iM2566 = C0630.m2566("۟᩷") ^ i21;
                        i = ((iM2566 ^ i22) * (-15427)) ^ 368680187;
                        i2 = -1290265540;
                    }
                    int i313 = iM2566 ^ i2;
                    th4 = th4;
                    i24 = i313;
                    i23 = i;
                    break;
                case 103401924:
                case 106045911:
                    if (C0798.m2998() == 0) {
                        th4 = th4;
                        c8918 = c8919;
                        obj = obj2;
                        th = th3;
                        i11 = i26;
                        c22933 = c22934;
                        int i54 = i32;
                        sArr3 = sArr3;
                        i4 = i54;
                        iM6983 = (C0630.m2566("ۚۛ") + i21) * (-31);
                        i12 = ((iM6983 ^ i22) * 11699) ^ (-1611642514);
                        i13 = -573818397;
                        i16 = iM6983 ^ i13;
                        c22934 = c22933;
                        th3 = th;
                        c8919 = c8918;
                        th4 = th4;
                        i24 = i16;
                        i23 = i12;
                        i26 = i11;
                        obj2 = obj;
                        short[] sArr113 = sArr3;
                        i32 = i4;
                        sArr3 = sArr113;
                    }
                    th4 = th4;
                    c8919 = c8919;
                    obj2 = obj2;
                    i33 = i33;
                    th3 = th3;
                    i26 = i26;
                    c22934 = c22934;
                    sArr2 = sArr2;
                    abstractC15440 = abstractC15440;
                    s = s2;
                    int i55 = i32;
                    sArr3 = sArr3;
                    i4 = i55;
                    iM6982 = C0630.m2566("ܰܽ") ^ i22;
                    i5 = ((iM6982 ^ i21) * (-2983)) ^ 1616333086;
                    i6 = 1702513242;
                    i7 = iM6982 ^ i6;
                    s2 = s;
                    sArr2 = sArr2;
                    i33 = i33;
                    abstractC15440 = abstractC15440;
                    i26 = i26;
                    obj2 = obj2;
                    c22934 = c22934;
                    th3 = th3;
                    c8919 = c8919;
                    th4 = th4;
                    i24 = i7;
                    i23 = i5;
                    c11601 = this;
                    short[] sArr114 = sArr3;
                    i32 = i4;
                    sArr3 = sArr114;
                    break;
                case 421939039:
                case 1823984487:
                    th4 = th4;
                    try {
                        RunnableC3474.m10629(c8919);
                        iM2566 = (C0630.m2566("ۛۚ") + i22) * 99;
                        i = ((iM2566 ^ i21) * (-26945)) ^ (-1099767468);
                        i2 = -1113904295;
                        int i314 = iM2566 ^ i2;
                        th4 = th4;
                        i24 = i314;
                        i23 = i;
                    } catch (Throwable th10) {
                        int iM25617 = (C0630.m2566("ۨ۬") + i21) * 51;
                        th4 = th4;
                        i24 = iM25617 ^ 571149286;
                        i19 = ((iM25617 ^ i22) * 11585) ^ 1429483450;
                        obj4 = th10;
                        i23 = i19;
                    }
                    break;
                case 484879280:
                case 955345812:
                    th4 = th4;
                    c8919 = c8919;
                    obj = obj2;
                    th3 = th3;
                    i11 = i26;
                    int i56 = i32;
                    sArr3 = sArr3;
                    i4 = i56;
                    c18090 = new C18090(c11601.f34590);
                    iM2568 = (i21 - C2105.m6981("۟ܶ")) * 27;
                    i14 = ((iM2568 ^ i22) * 10295) ^ (-479734823);
                    i15 = 155328271;
                    i18 = iM2568 ^ i15;
                    i26 = i11;
                    obj2 = obj;
                    th2 = th4;
                    i24 = i18;
                    i23 = i14;
                    th3 = th3;
                    c8919 = c8919;
                    th4 = th2;
                    short[] sArr115 = sArr3;
                    i32 = i4;
                    sArr3 = sArr115;
                    break;
                case 649520545:
                case 1671782147:
                    th4 = th4;
                    Object obj5 = obj2;
                    C0714.m2815(th3, obj5);
                    i11 = i26;
                    obj = obj5;
                    c8919 = c8919;
                    th3 = th3;
                    int i57 = i32;
                    sArr3 = sArr3;
                    i4 = i57;
                    iM2568 = C2105.m6981("ۗܶ") ^ i22;
                    i14 = ((iM2568 ^ i21) * (-14873)) ^ 1636881445;
                    i15 = -1095347881;
                    i18 = iM2568 ^ i15;
                    i26 = i11;
                    obj2 = obj;
                    th2 = th4;
                    i24 = i18;
                    i23 = i14;
                    th3 = th3;
                    c8919 = c8919;
                    th4 = th2;
                    short[] sArr116 = sArr3;
                    i32 = i4;
                    sArr3 = sArr116;
                    break;
                case 715650571:
                case 1544115728:
                    Throwable th11 = th3;
                    th4 = th4;
                    obj = obj2;
                    i11 = i26;
                    int i58 = i32;
                    sArr3 = sArr3;
                    i4 = i58;
                    try {
                        C8918 c89111 = new C8918(abstractC15440);
                        int iM69811 = C2105.m6981("ۙ᩶") ^ i22;
                        i12 = ((iM69811 ^ i21) * (-11281)) ^ (-1735200597);
                        th4 = th4;
                        i24 = iM69811 ^ (-797116416);
                        th3 = th11;
                        c8919 = c89111;
                    } catch (Throwable th12) {
                        th3 = th12;
                        c8919 = null;
                        int iM69812 = C2105.m6981("ܺ᩻") ^ i21;
                        i12 = ((iM69812 ^ i22) * 13673) ^ 1765001602;
                        i16 = iM69812 ^ (-450141172);
                        th4 = th4;
                        i24 = i16;
                    }
                    i23 = i12;
                    i26 = i11;
                    obj2 = obj;
                    short[] sArr117 = sArr3;
                    i32 = i4;
                    sArr3 = sArr117;
                    break;
                case 961854422:
                case 1714263299:
                    th4 = th4;
                    try {
                        C0714.m2815(th5, obj4);
                        iM2566 = (C0630.m2566("ۛۚ") + i22) * 99;
                        i = ((iM2566 ^ i21) * (-26945)) ^ (-1099767468);
                        i2 = -1113904295;
                        int i315 = iM2566 ^ i2;
                        th4 = th4;
                        i24 = i315;
                        i23 = i;
                    } catch (Throwable th13) {
                        th3 = th13;
                        obj = obj2;
                        i11 = i26;
                        int i59 = i32;
                        sArr3 = sArr3;
                        i4 = i59;
                        int iM69813 = C2105.m6981("ܺ᩻") ^ i21;
                        i12 = ((iM69813 ^ i22) * 13673) ^ 1765001602;
                        i16 = iM69813 ^ (-450141172);
                        th4 = th4;
                        i24 = i16;
                        i23 = i12;
                        i26 = i11;
                        obj2 = obj;
                        short[] sArr118 = sArr3;
                        i32 = i4;
                        sArr3 = sArr118;
                    }
                    break;
                case 1366635317:
                case 1395418154:
                    C3911.m11924();
                    return;
                case 1377687063:
                case 1913071999:
                    return;
                case 1514653086:
                case 1934745461:
                    th4 = th4;
                    c8919 = c8919;
                    obj2 = obj2;
                    th3 = th3;
                    i26 = i26;
                    c22934 = c22934;
                    int i60 = i32;
                    sArr3 = sArr3;
                    i4 = i60;
                    sArr2 = sArr2;
                    i33 = i33;
                    iM6986 = C2105.m6981(C3663.m11162(sArr2, i33, 3, i25));
                    if (RunnableC1937.f6483 >= 0) {
                        iM2567 = (C0630.m2566("۬۟") + i22) * 35;
                        abstractC15440 = abstractC15440;
                        i8 = ((iM2567 ^ i21) * 5799) ^ 766796997;
                        i9 = 1636386852;
                    } else {
                        abstractC15440 = abstractC15440;
                        iM2567 = (C2105.m6981("ᩳ᩹") + i22) * 19;
                        i8 = ((iM2567 ^ i21) * 6145) ^ (-77205217);
                        i9 = 570015445;
                    }
                    i10 = iM2567 ^ i9;
                    sArr2 = sArr2;
                    i33 = i33;
                    i26 = i26;
                    obj2 = obj2;
                    th2 = th4;
                    i24 = i10;
                    i23 = i8;
                    abstractC15440 = abstractC15440;
                    c22934 = c22934;
                    th3 = th3;
                    c8919 = c8919;
                    th4 = th2;
                    short[] sArr119 = sArr3;
                    i32 = i4;
                    sArr3 = sArr119;
                    break;
                case 1583362273:
                case 2142161537:
                    if (C2105.f7037 != 0) {
                        iM6981 = C2105.m6981("ۙۧ") ^ i21;
                        i = ((iM6981 ^ i22) * (-21343)) ^ 2053161834;
                        i3 = 1066243830;
                        i24 = iM6981 ^ i3;
                        i23 = i;
                    } else {
                        th4 = th4;
                        c8919 = c8919;
                        obj2 = obj2;
                        th3 = th3;
                        i26 = i26;
                        c22934 = c22934;
                        sArr2 = sArr2;
                        abstractC15440 = abstractC15440;
                        int i410 = i32;
                        sArr3 = sArr3;
                        i4 = i410;
                        int iM25618 = (C0630.m2566("ۡܽ") + i22) * 65;
                        i5 = ((iM25618 ^ i21) * (-18987)) ^ 1764598682;
                        i7 = iM25618 ^ (-1062563144);
                        sArr2 = sArr2;
                        abstractC15440 = abstractC15440;
                        i26 = i26;
                        obj2 = obj2;
                        c22934 = c22934;
                        th3 = th3;
                        c8919 = c8919;
                        th4 = th4;
                        i24 = i7;
                        i23 = i5;
                        c11601 = this;
                        short[] sArr1110 = sArr3;
                        i32 = i4;
                        sArr3 = sArr1110;
                    }
                    break;
                case 1651229181:
                case 1863288354:
                    throw th3;
                case 1789612620:
                case 1804237906:
                    th4 = th4;
                    c8919 = c8919;
                    Object obj6 = obj2;
                    int i61 = i32;
                    sArr3 = sArr3;
                    i4 = i61;
                    try {
                        C0422.m1957(c8919, i4);
                        th3 = th3;
                        try {
                            i11 = i26;
                            try {
                                obj = obj6;
                                try {
                                    C21022.m47841(C21022.m47839(c18090), c11601.f34591[c11601.f34593[i4]], new C4916(c8919, new AtomicInteger()), c11601.f34595.m51043());
                                    try {
                                        RunnableC3474.m10629(c8919);
                                        iM2568 = C0630.m2566("᩷ܿ") ^ i21;
                                        i14 = ((iM2568 ^ i22) * (-5453)) ^ (-1389842257);
                                        i15 = -1512035684;
                                        i18 = iM2568 ^ i15;
                                        i26 = i11;
                                        obj2 = obj;
                                        th2 = th4;
                                        i24 = i18;
                                        i23 = i14;
                                        th3 = th3;
                                        c8919 = c8919;
                                        th4 = th2;
                                        short[] sArr1111 = sArr3;
                                        i32 = i4;
                                        sArr3 = sArr1111;
                                    } catch (Throwable th14) {
                                        th3 = th14;
                                        c8919 = c8919;
                                        int iM69814 = C2105.m6981("ܺ᩻") ^ i21;
                                        i12 = ((iM69814 ^ i22) * 13673) ^ 1765001602;
                                        i16 = iM69814 ^ (-450141172);
                                        th4 = th4;
                                        i24 = i16;
                                        i23 = i12;
                                        i26 = i11;
                                        obj2 = obj;
                                        short[] sArr1112 = sArr3;
                                        i32 = i4;
                                        sArr3 = sArr1112;
                                    }
                                } catch (Throwable th15) {
                                    th = th15;
                                    th5 = th;
                                    iM2568 = (i21 - C0630.m2566("᩶֡")) * (-125);
                                    i14 = ((iM2568 ^ i22) * 24817) ^ 2141617754;
                                    i15 = -587399249;
                                }
                            } catch (Throwable th16) {
                                th = th16;
                                obj = obj6;
                                th5 = th;
                                iM2568 = (i21 - C0630.m2566("᩶֡")) * (-125);
                                i14 = ((iM2568 ^ i22) * 24817) ^ 2141617754;
                                i15 = -587399249;
                                i18 = iM2568 ^ i15;
                                i26 = i11;
                                obj2 = obj;
                                th2 = th4;
                                i24 = i18;
                                i23 = i14;
                                th3 = th3;
                                c8919 = c8919;
                                th4 = th2;
                                short[] sArr1113 = sArr3;
                                i32 = i4;
                                sArr3 = sArr1113;
                                break;
                            }
                        } catch (Throwable th17) {
                            th = th17;
                            i11 = i26;
                            obj = obj6;
                            th5 = th;
                            iM2568 = (i21 - C0630.m2566("᩶֡")) * (-125);
                            i14 = ((iM2568 ^ i22) * 24817) ^ 2141617754;
                            i15 = -587399249;
                            i18 = iM2568 ^ i15;
                            i26 = i11;
                            obj2 = obj;
                            th2 = th4;
                            i24 = i18;
                            i23 = i14;
                            th3 = th3;
                            c8919 = c8919;
                            th4 = th2;
                            short[] sArr1114 = sArr3;
                            i32 = i4;
                            sArr3 = sArr1114;
                            break;
                        }
                    } catch (Throwable th18) {
                        th = th18;
                        th3 = th3;
                    }
                    break;
                default:
                    C3663.m11168();
                    if (!C0798.f2919) {
                        th4 = th4;
                        c8919 = c8919;
                        obj2 = obj2;
                        i33 = i33;
                        th3 = th3;
                        i26 = i26;
                        c22934 = c22934;
                        sArr2 = sArr2;
                        abstractC15440 = abstractC15440;
                        s = s2;
                        int i411 = i32;
                        sArr3 = sArr3;
                        i4 = i411;
                        iM6982 = C0630.m2566("ۤۙ") ^ i22;
                        i5 = ((iM6982 ^ i21) * 31031) ^ 212309764;
                        i6 = -1881546530;
                        i7 = iM6982 ^ i6;
                        s2 = s;
                        sArr2 = sArr2;
                        i33 = i33;
                        abstractC15440 = abstractC15440;
                        i26 = i26;
                        obj2 = obj2;
                        c22934 = c22934;
                        th3 = th3;
                        c8919 = c8919;
                        th4 = th4;
                        i24 = i7;
                        i23 = i5;
                        c11601 = this;
                        short[] sArr1115 = sArr3;
                        i32 = i4;
                        sArr3 = sArr1115;
                    } else {
                        iM6981 = (C2105.m6981("ۙ᩻") + i21) * 99;
                        i = ((iM6981 ^ i22) * (-30071)) ^ (-1512477538);
                        i3 = -2106057365;
                        i24 = iM6981 ^ i3;
                        i23 = i;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        AbstractC15440 abstractC15440 = null;
        Main mainM49336 = null;
        int i = 1522371356;
        int i2 = C2167.f7158;
        int i3 = C4263.f13799;
        int iM2566 = C0630.m2566("֫ۙ") ^ i3;
        int i4 = ((iM2566 ^ i2) * (-3657)) ^ 320310168;
        int i5 = 412311915;
        while (true) {
            i = ((((i ^ i2) * 5321) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -1733542380:
                case -1694482930:
                    C4263.m12819();
                    if (!C2272.f7362) {
                        iM2566 = (C0630.m2566("ܰ۟") + i3) * 51;
                        i4 = ((iM2566 ^ i2) * (-14771)) ^ 161292996;
                        i5 = -1244855563;
                    } else {
                        iM2566 = C2105.m6981("۠ܺ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 6015) ^ (-1477111798);
                        i5 = -1962257303;
                    }
                    break;
                case -1450548322:
                case 104942189:
                    if (C0237.f1507 != 0) {
                        iM2566 = C0630.m2566("ᩳۤ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 18711) ^ 165671955;
                        i5 = 1112901881;
                    } else {
                        iM2566 = (i3 - C2105.m6981("᩸ۡ")) * (-49);
                        i4 = ((iM2566 ^ i2) * 24425) ^ (-1797514422);
                        i5 = 1176525123;
                    }
                    break;
                case -1126553806:
                case -405040425:
                    if (C3663.f11553) {
                        iM2566 = C0630.m2566("֫ۧ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-939)) ^ (-935596270);
                        i5 = 510373415;
                    } else {
                        iM2566 = (C0630.m2566("᩸ᩳ") ^ i2) * (-7);
                        i4 = ((iM2566 ^ i3) * 23719) ^ 2007008994;
                        i5 = 583448916;
                    }
                    break;
                case -915096845:
                case 692555554:
                    C0714.m2805();
                    if (C4616.m13552() == 0) {
                        iM2566 = C0630.m2566("ᩳۤ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 18711) ^ 165671955;
                        i5 = 1112901881;
                    } else {
                        iM2566 = (C0630.m2566("ܰ۟") + i3) * 51;
                        i4 = ((iM2566 ^ i2) * (-14771)) ^ 161292996;
                        i5 = -1244855563;
                    }
                    break;
                case -704521742:
                case 1396842011:
                    abstractC15440 = this.f34589;
                    if (C0630.m2564()) {
                        iM2566 = C2105.m6981("۠ܺ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 6015) ^ (-1477111798);
                        i5 = -1962257303;
                    } else {
                        iM2566 = (C0630.m2566("ۤۖ") + i3) * (-69);
                        i4 = ((iM2566 ^ i2) * (-32659)) ^ (-619146116);
                        i5 = -1590591462;
                    }
                    break;
                case -616237536:
                case 2114553843:
                    if (ServiceConnectionC3453.f10921 < 0) {
                        iM2566 = C2105.m6981("۠ܺ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 6015) ^ (-1477111798);
                        i5 = -1962257303;
                    } else {
                        iM2566 = C0630.m2566("֫ۧ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-939)) ^ (-935596270);
                        i5 = 510373415;
                    }
                    break;
                case -455670315:
                case 751828685:
                    if (C1504.m5179()) {
                        iM2566 = (C2105.m6981("ۤۨ") + i3) * (-25);
                        i4 = ((iM2566 ^ i2) * (-15757)) ^ 1957896598;
                        i5 = -2037515993;
                    } else {
                        iM2566 = (C0630.m2566("ܰ۟") + i3) * 51;
                        i4 = ((iM2566 ^ i2) * (-14771)) ^ 161292996;
                        i5 = -1244855563;
                    }
                    break;
                case -410373761:
                case 1278302458:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = C0630.m2566("ᩳۤ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 18711) ^ 165671955;
                        i5 = 1112901881;
                    } else {
                        iM2566 = (C2105.m6981("᩻ۖ") + i2) * (-43);
                        i4 = ((iM2566 ^ i3) * 1525) ^ 1984359275;
                        i5 = 1370307857;
                    }
                    break;
                case -323147906:
                case 2000515010:
                    ServiceConnectionC3453.m10561(mainM49336, exc, null);
                    break;
                case -291656864:
                case 1138556260:
                    RunnableC3474.m10626(abstractC15440);
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        iM2566 = C2105.m6981("᩻ܰ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 24121) ^ (-1385679662);
                        i5 = -47468594;
                    } else {
                        iM2566 = (C2105.m6981("ۗ᩷") ^ i2) * 57;
                        i4 = ((iM2566 ^ i3) * 18357) ^ (-875456577);
                        i5 = 276312211;
                    }
                    break;
                case 9006227:
                case 1684507411:
                    if (C1420.f5096 <= 0) {
                        iM2566 = (C0630.m2566("ܰ۟") + i3) * 51;
                        i4 = ((iM2566 ^ i2) * (-14771)) ^ 161292996;
                        i5 = -1244855563;
                    } else {
                        iM2566 = (i2 - C0630.m2566("ۡ᩺")) * (-45);
                        i4 = ((iM2566 ^ i3) * 28389) ^ (-1662678296);
                        i5 = 1652155209;
                    }
                    break;
                case 387287084:
                case 1950598757:
                    mainM49336 = C21923.m49336(this.f34587);
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = C2105.m6981("۠ܺ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 6015) ^ (-1477111798);
                        i5 = -1962257303;
                    } else {
                        iM2566 = C2105.m6981("᩻۠") ^ i3;
                        i4 = ((iM2566 ^ i2) * 12367) ^ 1748916249;
                        i5 = 1130528047;
                    }
                    break;
                case 708260243:
                case 1845946875:
                    C7106.m19120();
                    C4159.m12565();
                    break;
                case 742805540:
                case 2058910606:
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = C0630.m2566("ᩳۤ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 18711) ^ 165671955;
                        i5 = 1112901881;
                    } else {
                        iM2566 = (C2105.m6981("ܺ۫") + i2) * (-89);
                        i4 = ((iM2566 ^ i3) * (-14121)) ^ 933687686;
                        i5 = -1499912973;
                    }
                    break;
                case 1381762069:
                case 2092017843:
                    C7106.m19120();
                    ServiceConnectionC3453.m10564();
                    iM2566 = C0630.m2566("֫ۧ") ^ i3;
                    i4 = ((iM2566 ^ i2) * (-939)) ^ (-935596270);
                    i5 = 510373415;
                    break;
                default:
                    if (RunnableC0588.m2441() >= 0) {
                        iM2566 = C2105.m6981("᩻ܰ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 24121) ^ (-1385679662);
                        i5 = -47468594;
                    } else {
                        iM2566 = C0630.m2566("ܶ֨") ^ i3;
                        i4 = ((iM2566 ^ i2) * 29355) ^ 1305004433;
                        i5 = 2020447456;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0239 A[PHI: r3 r8 r16 r17
      0x0239: PHI (r3v5 java.lang.StringBuilder) = (r3v3 java.lang.StringBuilder), (r3v2 java.lang.StringBuilder), (r3v2 java.lang.StringBuilder) binds: [B:61:0x0237, B:48:0x019d, B:15:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x0239: PHI (r8v9 java.lang.String) = (r8v2 java.lang.String), (r8v2 java.lang.String), (r8v10 java.lang.String) binds: [B:61:0x0237, B:48:0x019d, B:15:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x0239: PHI (r16v18 java.lang.StringBuilder) = (r16v6 java.lang.StringBuilder), (r16v8 java.lang.StringBuilder), (r16v19 java.lang.StringBuilder) binds: [B:61:0x0237, B:48:0x019d, B:15:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x0239: PHI (r17v14 l.ܶ᩵ܿ) = (r17v7 l.ܶ᩵ܿ), (r17v9 l.ܶ᩵ܿ), (r17v15 l.ܶ᩵ܿ) binds: [B:61:0x0237, B:48:0x019d, B:15:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007e, code lost:
    
        if (l.C0483.f2088 >= 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C11601(AbstractC15440 abstractC15440, C16560 c16560, int[] iArr, int[] iArr2) {
        AbstractC15440 abstractC15441;
        StringBuilder sb;
        int iM6981;
        int i;
        int i2;
        int iM2566;
        int i3;
        int i4;
        int iM2567;
        int i5;
        int i6 = C2520.f8000;
        int i7 = RunnableC0588.f2309;
        short s = f34586[0];
        int i8 = ((s * s) + 13242321) - (s * 7278) < 0 ? 27936 : 13814;
        this.f34590 = abstractC15440;
        this.f34587 = c16560;
        this.f34591 = iArr;
        this.f34593 = iArr2;
        int iM6982 = (i6 - C2105.m6981("ۖ᩸")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
        int i9 = ((iM6982 ^ i7) * (-31939)) ^ 242047833;
        short[] sArr = null;
        int i10 = iM6982 ^ (-1463381124);
        int i11 = 0;
        int i12 = 24489844;
        short[] sArr2 = null;
        String strM947 = null;
        String strM36517 = null;
        StringBuilder sb2 = null;
        AbstractC15440 abstractC15440M36524 = null;
        String strM12355 = null;
        StringBuilder sb3 = null;
        while (true) {
            i12 = i10 ^ (i9 & (((i12 ^ i7) * 27201) >> 31));
            switch (i12) {
                case -2089489238:
                case 1518636262:
                    abstractC15441 = abstractC15440M36524;
                    sb = sb2;
                    sb3 = new StringBuilder();
                    if (C1420.f5096 <= 0) {
                        iM6981 = C2105.m6981("ᩳᩳ") ^ i7;
                        i = ((iM6981 ^ i6) * (-6979)) ^ 1015603876;
                        i2 = -125803184;
                    } else {
                        iM6981 = C0630.m2566("ۡ֫") ^ i7;
                        i = ((iM6981 ^ i6) * (-20829)) ^ (-1111552164);
                        i2 = 2134552906;
                    }
                    int i13 = iM6981 ^ i2;
                    sb2 = sb;
                    i10 = i13;
                    i9 = i;
                    abstractC15440M36524 = abstractC15441;
                    break;
                case -2058813609:
                case 1237451473:
                    abstractC15441 = abstractC15440M36524;
                    sb = sb2;
                    C3245.m9923(sb3, strM12355);
                    if (C0237.f1507 != 0) {
                        iM6981 = C2105.m6981("ᩳᩳ") ^ i7;
                        i = ((iM6981 ^ i6) * (-6979)) ^ 1015603876;
                        i2 = -125803184;
                    } else {
                        iM6981 = C0630.m2566("ᩴۛ") ^ i7;
                        i = ((iM6981 ^ i6) * 12035) ^ 1007972836;
                        i2 = 1693578229;
                    }
                    int i14 = iM6981 ^ i2;
                    sb2 = sb;
                    i10 = i14;
                    i9 = i;
                    abstractC15440M36524 = abstractC15441;
                    break;
                case -2033123758:
                case -68927227:
                    this.f34592 = abstractC15440M36524;
                    sb2 = new StringBuilder();
                    if (C3537.f11231 >= 0) {
                        abstractC15441 = abstractC15440M36524;
                        iM2567 = (C2105.m6981("ܶ᩸") + i7) * 77;
                        i = ((iM2567 ^ i6) * (-19205)) ^ 2074691726;
                        i5 = 616322209;
                    } else {
                        iM2567 = C0630.m2566("᩸ۛ") ^ i7;
                        abstractC15441 = abstractC15440M36524;
                        i = ((iM2567 ^ i6) * (-25147)) ^ (-634541933);
                        i5 = 1651476534;
                    }
                    i10 = iM2567 ^ i5;
                    i9 = i;
                    abstractC15440M36524 = abstractC15441;
                    break;
                case -1852765145:
                case -1189475812:
                    abstractC15441 = abstractC15440M36524;
                    sb = sb2;
                    strM12355 = C4117.m12355(sArr2, 1, 4, i8);
                    if (C2520.m8026()) {
                        iM6981 = C0630.m2566("᩸ۨ") ^ i6;
                        i = ((iM6981 ^ i7) * 4313) ^ 1740473083;
                        i2 = 1195882767;
                    } else {
                        iM6981 = (i6 - C2105.m6981("ۖۜ")) * (-35);
                        i = ((iM6981 ^ i7) * (-4227)) ^ (-774104749);
                        i2 = -1588295865;
                    }
                    int i15 = iM6981 ^ i2;
                    sb2 = sb;
                    i10 = i15;
                    i9 = i;
                    abstractC15440M36524 = abstractC15441;
                    break;
                case -1571101568:
                case -423521265:
                    abstractC15441 = abstractC15440M36524;
                    sb = sb2;
                    C1420.m4905(sb3, abstractC15440.m36517());
                    sArr2 = f34586;
                    if (RunnableC0588.f2309 < 0) {
                        iM6981 = C2105.m6981("֫ۢ") ^ i7;
                        i = ((iM6981 ^ i6) * 19649) ^ 484942935;
                        i2 = 141182239;
                        int i16 = iM6981 ^ i2;
                        sb2 = sb;
                        i10 = i16;
                        i9 = i;
                        abstractC15440M36524 = abstractC15441;
                    } else {
                        abstractC15440M36524 = abstractC15441;
                        iM2566 = C2105.m6981("۟᩷") ^ i6;
                        i3 = ((iM2566 ^ i7) * 6309) ^ (-937546412);
                        i4 = 752765124;
                        StringBuilder sb4 = sb;
                        i10 = iM2566 ^ i4;
                        i9 = i3;
                        sb2 = sb4;
                    }
                    break;
                case -1485148184:
                case -1149856045:
                    C3019.m9255();
                    break;
                case -1084773346:
                case 2032404710:
                    abstractC15441 = abstractC15440M36524;
                    sb = sb2;
                    this.f34594 = C2105.m6987(C16293.f50111);
                    if (RunnableC1937.m6387() == 0) {
                        iM6981 = (i6 - C2105.m6981("ۡۨ")) * 97;
                        i = ((iM6981 ^ i7) * 20267) ^ (-1312649350);
                        i2 = -1281822229;
                        int i17 = iM6981 ^ i2;
                        sb2 = sb;
                        i10 = i17;
                        i9 = i;
                        abstractC15440M36524 = abstractC15441;
                    } else {
                        sb2 = sb;
                        iM2567 = (C2105.m6981("ܶ᩸") + i7) * 77;
                        i = ((iM2567 ^ i6) * (-19205)) ^ 2074691726;
                        i5 = 616322209;
                        i10 = iM2567 ^ i5;
                        i9 = i;
                        abstractC15440M36524 = abstractC15441;
                    }
                    break;
                case -880472713:
                case -40060322:
                    C3245.m9923(sb2, C2126.m7036(sArr, i11, 8, i8));
                    strM947 = C0050.m947(sb2);
                    if (C3663.f11553) {
                        abstractC15441 = abstractC15440M36524;
                        sb = sb2;
                        iM6981 = C2105.m6981("ᩳᩳ") ^ i7;
                        i = ((iM6981 ^ i6) * (-6979)) ^ 1015603876;
                        i2 = -125803184;
                        int i18 = iM6981 ^ i2;
                        sb2 = sb;
                        i10 = i18;
                        i9 = i;
                        abstractC15440M36524 = abstractC15441;
                    } else {
                        int iM6983 = C2105.m6981("ᩴۨ") ^ i7;
                        i10 = iM6983 ^ (-1031342393);
                        i9 = ((iM6983 ^ i6) * 27365) ^ 3708522;
                        strM947 = strM947;
                    }
                    break;
                case -857716181:
                case -74278653:
                    ViewOnClickListenerC1958.m6429();
                    if (C5695.m16023() < 0) {
                        abstractC15441 = abstractC15440M36524;
                        iM2567 = (C2105.m6981("ܶ᩸") + i7) * 77;
                        i = ((iM2567 ^ i6) * (-19205)) ^ 2074691726;
                        i5 = 616322209;
                        i10 = iM2567 ^ i5;
                        i9 = i;
                        abstractC15440M36524 = abstractC15441;
                    } else {
                        iM2566 = (C0630.m2566("ۢ᩶") + i6) * 45;
                        sb = sb2;
                        i3 = ((iM2566 ^ i7) * (-8895)) ^ (-111327080);
                        i4 = -47912818;
                        StringBuilder sb5 = sb;
                        i10 = iM2566 ^ i4;
                        i9 = i3;
                        sb2 = sb5;
                    }
                    break;
                case -755416675:
                case 1534997404:
                    this.f34588 = abstractC15440.m36524(strM947);
                    this.f34589 = abstractC15440M36524;
                    return;
                case -597619699:
                case -49727811:
                    sb = sb2;
                    abstractC15440M36524 = abstractC15440.m36524(C0422.m1959(sb3));
                    if (C2167.f7158 >= 0) {
                        iM2566 = C2105.m6981("۟᩷") ^ i6;
                        i3 = ((iM2566 ^ i7) * 6309) ^ (-937546412);
                        i4 = 752765124;
                    } else {
                        iM2566 = (C0630.m2566("۠֨") + i6) * (-67);
                        i3 = ((iM2566 ^ i7) * (-31989)) ^ 773957238;
                        i4 = -2008936791;
                    }
                    StringBuilder sb6 = sb;
                    i10 = iM2566 ^ i4;
                    i9 = i3;
                    sb2 = sb6;
                    break;
                case 98182881:
                case 1974161052:
                    C4616.m13552();
                    C3245.m9925();
                    iM2566 = (C0630.m2566("ۢ᩶") + i6) * 45;
                    sb = sb2;
                    i3 = ((iM2566 ^ i7) * (-8895)) ^ (-111327080);
                    i4 = -47912818;
                    StringBuilder sb7 = sb;
                    i10 = iM2566 ^ i4;
                    i9 = i3;
                    sb2 = sb7;
                    break;
                case 550701689:
                case 1896200070:
                    C1916.m6308();
                    RunnableC1108.m3790();
                    throw new RuntimeException();
                case 755557716:
                case 1635308703:
                    C1294.m4372();
                    if (C3019.m9255() > 0) {
                        abstractC15441 = abstractC15440M36524;
                        sb = sb2;
                        iM6981 = C0630.m2566("᩸ۨ") ^ i6;
                        i = ((iM6981 ^ i7) * 4313) ^ 1740473083;
                        i2 = 1195882767;
                        int i19 = iM6981 ^ i2;
                        sb2 = sb;
                        i10 = i19;
                        i9 = i;
                        abstractC15440M36524 = abstractC15441;
                    }
                    abstractC15441 = abstractC15440M36524;
                    iM2567 = (C2105.m6981("ܶ᩸") + i7) * 77;
                    i = ((iM2567 ^ i6) * (-19205)) ^ 2074691726;
                    i5 = 616322209;
                    i10 = iM2567 ^ i5;
                    i9 = i;
                    abstractC15440M36524 = abstractC15441;
                    break;
                case 1061652416:
                case 1445308666:
                    C1420.m4905(sb2, strM36517);
                    sArr = f34586;
                    i11 = 5;
                    if (C1128.f4106 <= 0) {
                        iM2566 = (C0630.m2566("ۢ᩶") + i6) * 45;
                        sb = sb2;
                        i3 = ((iM2566 ^ i7) * (-8895)) ^ (-111327080);
                        i4 = -47912818;
                    } else {
                        sb = sb2;
                        iM2566 = (i6 - C2105.m6981("᩵۬")) * (-17);
                        i3 = ((iM2566 ^ i7) * (-189)) ^ (-1435785155);
                        i4 = 1908446084;
                    }
                    StringBuilder sb8 = sb;
                    i10 = iM2566 ^ i4;
                    i9 = i3;
                    sb2 = sb8;
                    break;
                default:
                    sb = sb2;
                    strM36517 = abstractC15440.m36517();
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        iM2566 = C0630.m2566("ۜܶ") ^ i6;
                        i3 = ((iM2566 ^ i7) * (-25405)) ^ (-273557991);
                        i4 = -1260153778;
                        StringBuilder sb9 = sb;
                        i10 = iM2566 ^ i4;
                        i9 = i3;
                        sb2 = sb9;
                    } else {
                        abstractC15441 = abstractC15440M36524;
                        iM6981 = C0630.m2566("᩸ۨ") ^ i6;
                        i = ((iM6981 ^ i7) * 4313) ^ 1740473083;
                        i2 = 1195882767;
                        int i110 = iM6981 ^ i2;
                        sb2 = sb;
                        i10 = i110;
                        i9 = i;
                        abstractC15440M36524 = abstractC15441;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        C22933 c22933 = null;
        String strM3496 = null;
        int i = -2108524802;
        int i2 = C0050.f910;
        int i3 = C4263.f13799;
        int iM6981 = C2105.m6981("᩻۬") ^ i3;
        int i4 = ((iM6981 ^ i2) * 27447) ^ (-2101487508);
        int i5 = 1908078339;
        while (true) {
            i = ((((i ^ i2) * 11511) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -1977324545:
                case 1558633038:
                    if (C2272.m7503()) {
                        iM6981 = C2105.m6981("᩸ܳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-20415)) ^ 1408198413;
                        i5 = 845442877;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ܿܽ")) * 97;
                        i4 = ((iM6981 ^ i2) * 1205) ^ 1573173223;
                        i5 = -307329986;
                    }
                    break;
                case -1816505495:
                case 384241962:
                    if (C1128.m3851() <= 0) {
                        iM6981 = (C2105.m6981("᩺ۧ") + i3) * 65;
                        i4 = ((iM6981 ^ i2) * (-4703)) ^ 36044834;
                        i5 = 222264303;
                    } else {
                        iM6981 = C0630.m2566("ܽ֨") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-17265)) ^ 988618818;
                        i5 = 1223030718;
                    }
                    break;
                case -1577258809:
                case 2092513437:
                    if (C1294.m4372() <= 0) {
                        iM6981 = (C0630.m2566("ܰ᩷") + i3) * 43;
                        i4 = ((iM6981 ^ i2) * 22927) ^ 202765615;
                        i5 = -1657804356;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ۙ᩵")) * (-101);
                        i4 = ((iM6981 ^ i3) * 25699) ^ 1936655526;
                        i5 = 266304475;
                    }
                    break;
                case -1552543678:
                case -573811895:
                    C0050.m940();
                    iM6981 = (C0630.m2566("ܰ᩷") + i3) * 43;
                    i4 = ((iM6981 ^ i2) * 22927) ^ 202765615;
                    i5 = -1657804356;
                    break;
                case -1512537558:
                case -203003263:
                    RunnableC3474.m10626(this.f34589);
                    break;
                case -1129245185:
                case 348761780:
                    strM3496 = C1005.m3496(this.f34589);
                    if (C2105.m6982() != 0) {
                        iM6981 = C2105.m6981("᩸ܳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-20415)) ^ 1408198413;
                        i5 = 845442877;
                    } else {
                        iM6981 = C2105.m6981("ۘ᩺") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-4323)) ^ 1544829143;
                        i5 = -1987155962;
                    }
                    break;
                case -826127923:
                case 2141694744:
                    C1294.m4372();
                    if (!C3663.f11553) {
                        iM6981 = C2105.m6981("֨᩸") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-15927)) ^ 1725595844;
                        i5 = -829935174;
                    } else {
                        iM6981 = (C0630.m2566("ܰ᩷") + i3) * 43;
                        i4 = ((iM6981 ^ i2) * 22927) ^ 202765615;
                        i5 = -1657804356;
                    }
                    break;
                case -707141850:
                case 993868084:
                    if (C0237.f1507 != 0) {
                        iM6981 = C2105.m6981("֨᩸") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-15927)) ^ 1725595844;
                        i5 = -829935174;
                    } else {
                        iM6981 = (C0630.m2566("۫᩸") ^ i2) * (-71);
                        i4 = ((iM6981 ^ i3) * (-10633)) ^ (-966971480);
                        i5 = -49228835;
                    }
                    break;
                case -621881068:
                case -574783667:
                    if (C2126.m7044(c22933)) {
                        iM6981 = C2105.m6981("᩶᩸") ^ i2;
                        i4 = ((iM6981 ^ i3) * 19929) ^ (-452282414);
                        i5 = 1501483427;
                    } else {
                        iM6981 = C2105.m6981("ۙᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-10117)) ^ 765648515;
                        i5 = -1997680020;
                    }
                    break;
                case -246877987:
                case 122209122:
                    if (C3537.m10746() <= 0) {
                        iM6981 = C2105.m6981("᩸ܳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-20415)) ^ 1408198413;
                        i5 = 845442877;
                    } else {
                        iM6981 = (C2105.m6981("᩶ᩴ") ^ i3) * (-89);
                        i4 = ((iM6981 ^ i2) * (-25191)) ^ 853656657;
                        i5 = -1360123142;
                    }
                    break;
                case -93204765:
                case 1997383955:
                    if (C1773.f6144 <= 0) {
                        iM6981 = C2105.m6981("֨᩸") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-15927)) ^ 1725595844;
                        i5 = -829935174;
                    } else {
                        iM6981 = (C0630.m2566("᩵ۢ") ^ i2) * (-111);
                        i4 = ((iM6981 ^ i3) * 28977) ^ (-2062252911);
                        i5 = -2101504133;
                    }
                    break;
                case 133753284:
                case 1451958553:
                    C7811.m20844();
                    C2126.m7040();
                    break;
                case 283886891:
                case 1794289329:
                    if (C1128.f4106 <= 0) {
                        iM6981 = (C0630.m2566("ܰ᩷") + i3) * 43;
                        i4 = ((iM6981 ^ i2) * 22927) ^ 202765615;
                        i5 = -1657804356;
                    } else {
                        iM6981 = C0630.m2566("ۜۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 24129) ^ (-891755270);
                        i5 = 642457567;
                    }
                    break;
                case 305021294:
                case 841868577:
                    if (RunnableC0588.m2441() >= 0) {
                        iM6981 = (C2105.m6981("᩺ۧ") + i3) * 65;
                        i4 = ((iM6981 ^ i2) * (-4703)) ^ 36044834;
                        i5 = 222264303;
                    } else {
                        iM6981 = (C0630.m2566("ܰ᩷") + i3) * 43;
                        i4 = ((iM6981 ^ i2) * 22927) ^ 202765615;
                        i5 = -1657804356;
                    }
                    break;
                case 556255686:
                case 1091035642:
                    C7811.m20844();
                    if (C7811.f24123 >= 0) {
                        iM6981 = (C0630.m2566("ܰ᩷") + i3) * 43;
                        i4 = ((iM6981 ^ i2) * 22927) ^ 202765615;
                        i5 = -1657804356;
                    } else {
                        iM6981 = C0630.m2566("᩺ᩴ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 29603) ^ 39831456;
                        i5 = 1607483955;
                    }
                    break;
                case 688893656:
                case 1681577504:
                    if (C1773.m5908() <= 0) {
                        iM6981 = (C0630.m2566("ܰ᩷") + i3) * 43;
                        i4 = ((iM6981 ^ i2) * 22927) ^ 202765615;
                        i5 = -1657804356;
                    } else {
                        iM6981 = C0630.m2566("֫ۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 219) ^ 1747864841;
                        i5 = 1864366271;
                    }
                    break;
                case 1172694522:
                case 1964046504:
                    c22933 = this.f34595;
                    if (C21923.f70183 != 0) {
                        iM6981 = (C2105.m6981("᩺ۧ") + i3) * 65;
                        i4 = ((iM6981 ^ i2) * (-4703)) ^ 36044834;
                        i5 = 222264303;
                    } else {
                        iM6981 = C2105.m6981("ܳܿ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-30001)) ^ (-699295791);
                        i5 = -835911257;
                    }
                    break;
                default:
                    C3683.m11221(this.f34587, strM3496);
                    break;
            }
            return;
        }
    }
}
