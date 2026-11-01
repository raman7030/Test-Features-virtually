package p067l;

import bin.p000mt.plus.Main;
import com.google.android.material.slider.BaseSlider;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۨۡܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05ZQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C13394 extends AbstractC9542 {

    /* JADX INFO: renamed from: ᩵ܶܶ, reason: not valid java name and contains not printable characters */
    private static final short[] f82156 = {5271, 13784, 13714, 13715, 13710, 13737, 13714, 13715, 13710, 13784, 13708, 13727, 13702, 5403, 16893, 32233, -19008, 16708, -22245, 20239, 9, -1760, -5501, 15656, 14392, -10428, -2778};

    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ C18107 f37584;

    /* JADX INFO: renamed from: ۘ */
    public AbstractC17043 f37585;

    /* JADX INFO: renamed from: ۜ */
    public AbstractC17043 f37586;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ AbstractC17043 f37587;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ int[] f37588;

    /* JADX INFO: renamed from: ܳ */
    public AbstractC17043 f37589;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ int[] f37590;

    /* JADX INFO: renamed from: ᩷ */
    public AbstractC17043 f37591;

    /* JADX INFO: renamed from: ᩻ */
    public C24164 f37592;

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
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        int iM55979;
        int i;
        int i2;
        int i3 = C0873.f81841;
        int i4 = C1036.f81953;
        int iM55680 = C0873.m55680("ۚۤ") ^ i3;
        int i5 = ((iM55680 ^ i4) * (-4663)) ^ (-1671399034);
        Runnable runnable = null;
        String strM55893 = null;
        short[] sArr = null;
        int i6 = iM55680 ^ 1382532787;
        C24164 c24164 = null;
        int iM559710 = 0;
        int i7 = 0;
        int iM55681 = 0;
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
                    iM55681 = C0873.m55680(strM55893);
                    i8 = 2127957149;
                    if (C0912.f81867 <= 0) {
                        iM55979 = (C0946.m55979("᩶ܺ") + i3) * (-95);
                        i = ((iM55979 ^ i4) * 27289) ^ 135881763;
                        i2 = 992785085;
                    } else {
                        iM55979 = C0873.m55680("᩻᩺") ^ i4;
                        i = ((iM55979 ^ i3) * 18363) ^ 235756742;
                        i2 = 769312305;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -2126662501:
                case -1415024607:
                    i12 = s * s;
                    i13 = 171374281;
                    if (C0946.m55980() != 0) {
                        iM55979 = (C0946.m55979("᩻۠") ^ i3) * (-29);
                        i = ((iM55979 ^ i4) * (-10183)) ^ 806173041;
                        i2 = -2046505770;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ܳ۠")) * (-83);
                        i = ((iM55979 ^ i4) * (-29891)) ^ (-1542787925);
                        i2 = -1304956025;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1845495598:
                case 1067721215:
                    if (C1229.f82066 < 0) {
                        iM55979 = C0873.m55680("᩹᩻") ^ i3;
                        i = ((iM55979 ^ i4) * 25715) ^ (-818087635);
                        i2 = -956792397;
                    } else {
                        iM55979 = (C0873.m55680("᩵ۧ") + i4) * (-75);
                        i = ((iM55979 ^ i3) * (-9761)) ^ (-32005499);
                        i2 = 395611218;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1832180258:
                case 1667345585:
                    sArr = f82156;
                    i9 = 14;
                    i10 = 3;
                    if (C0989.m56095() <= 0) {
                        iM55979 = C0873.m55680("᩹᩻") ^ i3;
                        i = ((iM55979 ^ i4) * 25715) ^ (-818087635);
                        i2 = -956792397;
                    } else {
                        iM55979 = (C0873.m55680("֫ܶ") ^ i3) * (-121);
                        i = ((iM55979 ^ i4) * 6959) ^ 646939390;
                        i2 = 965377117;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1672797737:
                case 1606897721:
                    C0927.m55873();
                    break;
                case -1244865154:
                case 1558695005:
                    c24164.m53440(iM559710 ^ i7);
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = (C0946.m55979("᩻۠") ^ i3) * (-29);
                        i = ((iM55979 ^ i4) * (-10183)) ^ 806173041;
                        i2 = -2046505770;
                    } else {
                        iM55979 = C0873.m55680("ܶܽ") ^ i4;
                        i = ((iM55979 ^ i3) * 16817) ^ (-1156397274);
                        i2 = 923319024;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -885346437:
                case 650694009:
                    c24164.m53429(iM55681 ^ i8);
                    runnable = null;
                    if (C1048.f81963) {
                        iM55979 = (C0946.m55979("ܶ᩷") + i4) * (-119);
                        i = ((iM55979 ^ i3) * (-30541)) ^ (-1213064039);
                        i2 = -1105797240;
                    } else {
                        iM55979 = (C0946.m55979("᩶ܺ") + i3) * (-95);
                        i = ((iM55979 ^ i4) * 27289) ^ 135881763;
                        i2 = 992785085;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -773096926:
                case 1046594640:
                    strM55893 = C0930.m55893(f82156, 17, 3, i11);
                    if (C0947.f81895) {
                        iM55979 = (C0946.m55979("᩶ܺ") + i3) * (-95);
                        i = ((iM55979 ^ i4) * 27289) ^ 135881763;
                        i2 = 992785085;
                    } else {
                        iM55979 = C0873.m55680("۬ۘ") ^ i3;
                        i = ((iM55979 ^ i4) * 27151) ^ (-896975675);
                        i2 = 2146752546;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -643420141:
                case 1812508087:
                    C1124.m56367();
                    if (C0989.m56095() > 0) {
                        iM55979 = C0873.m55680("᩹᩻") ^ i3;
                        i = ((iM55979 ^ i4) * 25715) ^ (-818087635);
                        i2 = -956792397;
                    } else {
                        iM55979 = C0873.m55680("᩸᩺") ^ i4;
                        i = ((iM55979 ^ i3) * (-21201)) ^ 894960478;
                        i2 = -2114997451;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 29133365:
                case 1436000892:
                    c24164 = new C24164(C1964.m56594(this.f37584));
                    if (C0890.f81849 != 0) {
                        iM55979 = (C0873.m55680("᩵ۧ") + i4) * (-75);
                        i = ((iM55979 ^ i3) * (-9761)) ^ (-32005499);
                        i2 = 395611218;
                    } else {
                        iM55979 = C0946.m55979("᩺۬") ^ i4;
                        i = ((iM55979 ^ i3) * 3593) ^ (-41263482);
                        i2 = 1948989561;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 123129646:
                case 526476962:
                    i11 = 12813;
                    iM55979 = (i4 - C0873.m55680("ܰۙ")) * 35;
                    i = ((iM55979 ^ i3) * 6909) ^ (-632981197);
                    i2 = -1856879375;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 148370111:
                case 643223960:
                    s = f82156[13];
                    if (C0898.m55800() <= 0) {
                        iM55979 = (C0946.m55979("᩶ܺ") + i3) * (-95);
                        i = ((iM55979 ^ i4) * 27289) ^ 135881763;
                        i2 = 992785085;
                    } else {
                        iM55979 = C0946.m55979("᩵ۜ") ^ i4;
                        i = ((iM55979 ^ i3) * (-6921)) ^ (-49456202);
                        i2 = 1296592179;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 272634784:
                case 1992978505:
                    i11 = 37348;
                    iM55979 = (i4 - C0873.m55680("ܰۙ")) * 35;
                    i = ((iM55979 ^ i3) * 6909) ^ (-632981197);
                    i2 = -1856879375;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 391940047:
                case 1293223361:
                    if (C0882.f81846) {
                        iM55979 = C0873.m55680("᩹᩻") ^ i3;
                        i = ((iM55979 ^ i4) * 25715) ^ (-818087635);
                        i2 = -956792397;
                    } else {
                        iM55979 = (C0946.m55979("᩶ܺ") + i3) * (-95);
                        i = ((iM55979 ^ i4) * 27289) ^ 135881763;
                        i2 = 992785085;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 439605858:
                case 1128182720:
                    int i16 = s + s2;
                    if ((i16 * i16) - i15 <= 0) {
                        iM55979 = C0873.m55680("ۤ֨") ^ i3;
                        i = ((iM55979 ^ i4) * 20985) ^ 1840412371;
                        i2 = 1171346080;
                    } else {
                        iM55979 = (C0946.m55979("֫֫") ^ i3) * 33;
                        i = ((iM55979 ^ i4) * 26501) ^ (-401884970);
                        i2 = -965611857;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 456122726:
                case 1125799146:
                    iM559710 = C0946.m55979(C0873.m55689(sArr, i9, i10, i11));
                    i7 = 2125424796;
                    if (C0937.f81884) {
                        iM55979 = C0873.m55680("֡ۖ") ^ i3;
                        i = ((iM55979 ^ i4) * 24021) ^ (-324055075);
                        i2 = 106403406;
                    } else {
                        iM55979 = (C0873.m55680("᩵ۧ") + i4) * (-75);
                        i = ((iM55979 ^ i3) * (-9761)) ^ (-32005499);
                        i2 = 395611218;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 477690873:
                case 718991618:
                    int i17 = i12 + i13;
                    i15 = i17 + i17;
                    s2 = 13091;
                    if (C1046.f81962 <= 0) {
                        iM55979 = (C0946.m55979("᩻۠") ^ i3) * (-29);
                        i = ((iM55979 ^ i4) * (-10183)) ^ 806173041;
                        i2 = -2046505770;
                    } else {
                        iM55979 = C0946.m55979("᩺ᩳ") ^ i4;
                        i = ((iM55979 ^ i3) * (-15215)) ^ (-1827265624);
                        i2 = -1512121620;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 627817635:
                case 1729092130:
                    ViewOnClickListenerC0939.m55941();
                    iM55979 = C0873.m55680("᩹᩻") ^ i3;
                    i = ((iM55979 ^ i4) * 25715) ^ (-818087635);
                    i2 = -956792397;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                default:
                    c24164.mo51878(runnable);
                    c24164.mo51883();
                    this.f37592 = c24164;
                    break;
            }
            return;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        AbstractC17043 abstractC17043 = null;
        int i = -1040897992;
        int i2 = C0898.f81858;
        int i3 = C0873.f81841;
        int iM55979 = (C0946.m55979("ۢۧ") ^ i2) * 19;
        int i4 = ((iM55979 ^ i3) * (-14331)) ^ (-625460690);
        int i5 = 773784616;
        while (true) {
            i = ((((i ^ i3) * 19737) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1998452779:
                case -1799961093:
                    AbstractC0942.m55966(abstractC17043);
                    if (C1025.f81947 >= 0) {
                        iM55979 = (i2 - C0946.m55979("ۖ۫")) * (-39);
                        i4 = ((iM55979 ^ i3) * 20949) ^ (-1602740613);
                        i5 = -1691486087;
                    } else {
                        iM55979 = (C0946.m55979("ܰۧ") + i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM55979 ^ i2) * 32067) ^ 1211844762;
                        i5 = -474007919;
                    }
                    break;
                case -1908180814:
                case 796628106:
                    if (C1929.f83011 != 0) {
                        iM55979 = (C0946.m55979("֨ۧ") ^ i3) * (-105);
                        i4 = ((iM55979 ^ i2) * (-20133)) ^ (-1945805724);
                        i5 = -1871994836;
                    } else {
                        iM55979 = (C0873.m55680("᩷ۚ") ^ i2) * (-115);
                        i4 = ((iM55979 ^ i3) * 26669) ^ 66524756;
                        i5 = 1350671170;
                    }
                    break;
                case -1883025569:
                case 1884227972:
                    abstractC17043 = this.f37591;
                    if (C0877.f81843 >= 0) {
                        iM55979 = (C0946.m55979("ۤ۫") + i2) * (-51);
                        i4 = ((iM55979 ^ i3) * (-13781)) ^ 1475098757;
                        i5 = 1878428535;
                    } else {
                        iM55979 = (C0873.m55680("۫᩵") ^ i3) * (-17);
                        i4 = ((iM55979 ^ i2) * 2595) ^ (-1254942511);
                        i5 = -211997497;
                    }
                    break;
                case -1862704848:
                case -1646495279:
                    this.f37592.m53442();
                    C0845.m55580();
                    break;
                case -1617265372:
                case 1634149579:
                    if (C1229.f82066 >= 0) {
                        iM55979 = C0873.m55680("֫֨") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-8499)) ^ 1940470552;
                        i5 = -681170314;
                    } else {
                        iM55979 = (C0946.m55979("ܽۚ") ^ i2) * 67;
                        i4 = ((iM55979 ^ i3) * (-16413)) ^ (-1187730571);
                        i5 = 976600077;
                    }
                    break;
                case -1470997738:
                case 152095059:
                    if (C0890.m55740()) {
                        iM55979 = C0946.m55979("ۜۘ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-20247)) ^ 2142961325;
                        i5 = -1759600240;
                    } else {
                        iM55979 = (C0946.m55979("ܿ֫") ^ i3) * 89;
                        i4 = ((iM55979 ^ i2) * (-31423)) ^ (-252052405);
                        i5 = 2066932479;
                    }
                    break;
                case -1374725190:
                case 1572924787:
                    C1017.m56187();
                    if (!C0927.f81875) {
                        iM55979 = (C0946.m55979("ܿ֫") ^ i3) * 89;
                        i4 = ((iM55979 ^ i2) * (-31423)) ^ (-252052405);
                        i5 = 2066932479;
                    } else {
                        iM55979 = (C0946.m55979("ۤ۫") + i2) * (-51);
                        i4 = ((iM55979 ^ i3) * (-13781)) ^ 1475098757;
                        i5 = 1878428535;
                    }
                    break;
                case -1162064031:
                case -734347153:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = (C0946.m55979("ܿ֫") ^ i3) * 89;
                        i4 = ((iM55979 ^ i2) * (-31423)) ^ (-252052405);
                        i5 = 2066932479;
                    } else {
                        iM55979 = (C0873.m55680("᩷ۙ") ^ i2) * (-77);
                        i4 = ((iM55979 ^ i3) * (-23121)) ^ 1846037350;
                        i5 = -407843413;
                    }
                    break;
                case -603646771:
                case -366917375:
                    if (C0890.m55740()) {
                        iM55979 = (i3 - C0946.m55979("᩺ܳ")) * 7;
                        i4 = ((iM55979 ^ i2) * 11801) ^ 1258697379;
                        i5 = 1438938001;
                    } else {
                        iM55979 = (C0946.m55979("֨ۧ") ^ i3) * (-105);
                        i4 = ((iM55979 ^ i2) * (-20133)) ^ (-1945805724);
                        i5 = -1871994836;
                    }
                    break;
                case -538797853:
                case 1932703756:
                    ViewOnClickListenerC0939.m55941();
                    if (C1017.f81942 >= 0) {
                        iM55979 = (C0946.m55979("֨ۧ") ^ i3) * (-105);
                        i4 = ((iM55979 ^ i2) * (-20133)) ^ (-1945805724);
                        i5 = -1871994836;
                    } else {
                        iM55979 = (C0946.m55979("ܿ֫") ^ i3) * 89;
                        i4 = ((iM55979 ^ i2) * (-31423)) ^ (-252052405);
                        i5 = 2066932479;
                    }
                    break;
                case -66992507:
                case 1939976444:
                    C0892.m55749();
                    RunnableC1014.m56177();
                    break;
                case -21701381:
                case 1291768661:
                    if (C0937.m55918() >= 0) {
                        iM55979 = (C0946.m55979("ۤ۫") + i2) * (-51);
                        i4 = ((iM55979 ^ i3) * (-13781)) ^ 1475098757;
                        i5 = 1878428535;
                    } else {
                        iM55979 = (C0946.m55979("ܿ᩵") ^ i2) * 53;
                        i4 = ((iM55979 ^ i3) * 26363) ^ (-1109151330);
                        i5 = 397580697;
                    }
                    break;
                case 15948818:
                case 923661708:
                    if (C1929.m56553()) {
                        iM55979 = (C0946.m55979("֨ۧ") ^ i3) * (-105);
                        i4 = ((iM55979 ^ i2) * (-20133)) ^ (-1945805724);
                        i5 = -1871994836;
                    } else {
                        iM55979 = (C0873.m55680("᩸۟") + i3) * (-125);
                        i4 = ((iM55979 ^ i2) * (-32597)) ^ (-1671679223);
                        i5 = 1778531658;
                    }
                    break;
                case 791273090:
                case 1594976184:
                    if (C0930.m55885() <= 0) {
                        iM55979 = C0873.m55680("֫֨") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-8499)) ^ 1940470552;
                        i5 = -681170314;
                    } else {
                        iM55979 = (C0946.m55979("֨ۧ") ^ i3) * (-105);
                        i4 = ((iM55979 ^ i2) * (-20133)) ^ (-1945805724);
                        i5 = -1871994836;
                    }
                    break;
                case 1677952460:
                case 2076071629:
                    if (C0882.f81846) {
                        iM55979 = (C0946.m55979("֨ۧ") ^ i3) * (-105);
                        i4 = ((iM55979 ^ i2) * (-20133)) ^ (-1945805724);
                        i5 = -1871994836;
                    } else {
                        iM55979 = C0873.m55680("ۧۙ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 10875) ^ (-1108979814);
                        i5 = -1543180433;
                    }
                    break;
                default:
                    C1044.m56286();
                    C0892.m55749();
                    iM55979 = (C0946.m55979("ܿ֫") ^ i3) * 89;
                    i4 = ((iM55979 ^ i2) * (-31423)) ^ (-252052405);
                    i5 = 2066932479;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x016b, code lost:
    
        if (p067l.C1012.m56134() <= 0) goto L19;
     */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo3405() throws Throwable {
        int iM55680;
        int i;
        int i2;
        int iM55979;
        int i3;
        short s;
        int i4;
        int iM559710;
        int i5;
        int i6;
        int i7;
        int iM55681;
        int i8;
        int i9;
        int i10;
        C10844 c10844;
        Object obj;
        Throwable th;
        int i11;
        C24164 c24164;
        int iM559711;
        int i12;
        int i13;
        int iM55682;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Throwable th2;
        int i19;
        C13394 c13394 = this;
        int i20 = -889049918;
        int i21 = AbstractC0942.f81890;
        int i22 = C1017.f81942;
        int iM559712 = C0946.m55979("ۜ۠") ^ i22;
        int i23 = ((iM559712 ^ i21) * 9115) ^ (-476104720);
        int i24 = iM559712 ^ 78886365;
        C24164 c24165 = null;
        Throwable th3 = null;
        Object obj2 = null;
        Object obj3 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        AbstractC17043 abstractC17043 = null;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int iM559713 = 0;
        char c = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        short s2 = 0;
        int i32 = 0;
        C10844 c10845 = null;
        int i33 = 0;
        C19561 c19561 = null;
        Throwable th4 = null;
        short[] sArr3 = null;
        int iM559714 = 0;
        C19561 c19562 = null;
        C24164 c24166 = null;
        Object obj4 = null;
        Throwable th5 = null;
        while (true) {
            i20 = i24 ^ (i23 & (((i20 ^ i21) * 7137) >> 31));
            switch (i20) {
                case -2137093890:
                case -1247621491:
                    C1012.m56134();
                    th4 = th4;
                    iM55680 = C0873.m55680("ܶۗ") ^ i21;
                    i = ((iM55680 ^ i22) * (-11353)) ^ (-1231970425);
                    i2 = 92671432;
                    int i34 = iM55680 ^ i2;
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
                    iM55681 = (C0873.m55680("ۚ۟") ^ i21) * (-95);
                    i8 = ((iM55681 ^ i22) * 19889) ^ 504642701;
                    i9 = -245181798;
                    i10 = iM55681 ^ i9;
                    sArr2 = sArr2;
                    i33 = i33;
                    i26 = i26;
                    obj2 = obj2;
                    th2 = th4;
                    i24 = i10;
                    i23 = i8;
                    abstractC17043 = abstractC17043;
                    c24165 = c24165;
                    th3 = th3;
                    c10845 = c10845;
                    th4 = th2;
                    short[] sArr4 = sArr3;
                    i32 = i4;
                    sArr3 = sArr4;
                    break;
                case -1974529456:
                case -78965049:
                    AbstractC0942.m55971();
                    break;
                case -1967645578:
                case 1764213339:
                    C1194.m56396();
                    if (C0912.f81867 > 0) {
                        iM55979 = C0946.m55979("ᩴ۬") ^ i22;
                        i = ((iM55979 ^ i21) * 21793) ^ 1573479507;
                        i3 = -1913995266;
                        i24 = iM55979 ^ i3;
                        i23 = i;
                    }
                    th4 = th4;
                    iM55680 = C0873.m55680("ܶۗ") ^ i21;
                    i = ((iM55680 ^ i22) * (-11353)) ^ (-1231970425);
                    i2 = 92671432;
                    int i35 = iM55680 ^ i2;
                    th4 = th4;
                    i24 = i35;
                    i23 = i;
                    break;
                case -1951432026:
                case 169375929:
                    try {
                        C0967.m56075(c19562);
                        iM55979 = C0873.m55680("ܿۨ") ^ i22;
                        i = ((iM55979 ^ i21) * 12681) ^ 2060457038;
                        i3 = -695127604;
                        i24 = iM55979 ^ i3;
                        i23 = i;
                    } catch (Throwable th6) {
                        int iM559715 = (C0946.m55979("ܽۨ") ^ i22) * (-35);
                        i24 = iM559715 ^ (-1149952418);
                        i19 = ((iM559715 ^ i21) * 3247) ^ (-1370944014);
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
                    c24166.m53429(iM559713 ^ 2101988040);
                    c19562 = new C19561(abstractC17043);
                    iM55680 = (C0946.m55979("ܽ᩶") + i21) * (-5);
                    i = ((iM55680 ^ i22) * (-22211)) ^ 1823618446;
                    i2 = -209416674;
                    int i36 = iM55680 ^ i2;
                    th4 = th4;
                    i24 = i36;
                    i23 = i;
                    break;
                case -1864631326:
                case 777217789:
                    th4 = th4;
                    c10845 = c10845;
                    obj2 = obj2;
                    i33 = i33;
                    th3 = th3;
                    i26 = i26;
                    c24165 = c24165;
                    sArr2 = sArr2;
                    abstractC17043 = abstractC17043;
                    int i37 = i32;
                    sArr3 = sArr3;
                    i4 = i37;
                    s2 = sArr[c];
                    if (!C0955.f81898) {
                        int iM55683 = (C0873.m55680("ۤ᩷") + i22) * (-77);
                        i5 = ((iM55683 ^ i21) * 12125) ^ (-1155235382);
                        i7 = iM55683 ^ (-39676897);
                        sArr2 = sArr2;
                        i33 = i33;
                        abstractC17043 = abstractC17043;
                        i26 = i26;
                        obj2 = obj2;
                        c24165 = c24165;
                        th3 = th3;
                        c10845 = c10845;
                        th4 = th4;
                        i24 = i7;
                        i23 = i5;
                        c13394 = this;
                        short[] sArr5 = sArr3;
                        i32 = i4;
                        sArr3 = sArr5;
                    } else {
                        i33 = i33;
                        int iM55684 = (C0873.m55680("ۡܽ") + i22) * 65;
                        i5 = ((iM55684 ^ i21) * (-18987)) ^ 1764598682;
                        i7 = iM55684 ^ (-1062563144);
                        sArr2 = sArr2;
                        abstractC17043 = abstractC17043;
                        i26 = i26;
                        obj2 = obj2;
                        c24165 = c24165;
                        th3 = th3;
                        c10845 = c10845;
                        th4 = th4;
                        i24 = i7;
                        i23 = i5;
                        c13394 = this;
                        short[] sArr6 = sArr3;
                        i32 = i4;
                        sArr3 = sArr6;
                    }
                    break;
                case -1709737054:
                case -1121795542:
                    try {
                        th4 = th4;
                        c13394.f37586 = C22348.m50170(c19562, c13394.f37589, c13394.f37585, c13394.f37592.m53434());
                        iM55680 = C0946.m55979("֡ܺ") ^ i21;
                        i = ((iM55680 ^ i22) * 14679) ^ (-1518845609);
                        i2 = 870369304;
                        int i38 = iM55680 ^ i2;
                        th4 = th4;
                        i24 = i38;
                    } catch (Throwable th7) {
                        th4 = th7;
                        iM55979 = C0946.m55979("ۧ᩸") ^ i21;
                        i = ((iM55979 ^ i22) * 22065) ^ (-500233177);
                        i3 = 1555171147;
                        i24 = iM55979 ^ i3;
                    }
                    i23 = i;
                    break;
                case -1374995170:
                case -654342743:
                    th4 = th4;
                    c10845 = c10845;
                    obj2 = obj2;
                    i33 = i33;
                    th3 = th3;
                    i26 = i26;
                    c24165 = c24165;
                    sArr2 = sArr2;
                    abstractC17043 = abstractC17043;
                    int i39 = i32;
                    sArr3 = sArr3;
                    i4 = i39;
                    int i40 = i30 + i31;
                    if (i29 - (i40 + i40) <= 0) {
                        iM55681 = C0946.m55979("ܶܰ") ^ i21;
                        i8 = ((iM55681 ^ i22) * (-3197)) ^ (-857874494);
                        i9 = 1163667594;
                    } else {
                        iM55681 = C0946.m55979("ܶۡ") ^ i22;
                        i8 = ((iM55681 ^ i21) * (-14195)) ^ 667269713;
                        i9 = 1399876723;
                    }
                    i10 = iM55681 ^ i9;
                    sArr2 = sArr2;
                    i33 = i33;
                    i26 = i26;
                    obj2 = obj2;
                    th2 = th4;
                    i24 = i10;
                    i23 = i8;
                    abstractC17043 = abstractC17043;
                    c24165 = c24165;
                    th3 = th3;
                    c10845 = c10845;
                    th4 = th2;
                    short[] sArr7 = sArr3;
                    i32 = i4;
                    sArr3 = sArr7;
                    break;
                case -1325201979:
                case 22743113:
                    th4 = th4;
                    c10844 = c10845;
                    obj = obj2;
                    th = th3;
                    i11 = i26;
                    int i41 = i32;
                    sArr3 = sArr3;
                    i4 = i41;
                    c24164 = c24165;
                    c24164.m53429(iM559714 ^ 2121397989);
                    if (C1404.f82149 >= 0) {
                        iM559711 = (C0873.m55680("ۚۛ") + i21) * (-31);
                        i12 = ((iM559711 ^ i22) * 11699) ^ (-1611642514);
                        i13 = -573818397;
                    } else {
                        iM559711 = C0946.m55979("᩵᩹") ^ i22;
                        i12 = ((iM559711 ^ i21) * (-28493)) ^ 851981075;
                        i13 = -849548962;
                    }
                    i16 = iM559711 ^ i13;
                    c24165 = c24164;
                    th3 = th;
                    c10845 = c10844;
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
                    c10845 = c10845;
                    obj = obj2;
                    th3 = th3;
                    i11 = i26;
                    int i42 = i32;
                    sArr3 = sArr3;
                    i4 = i42;
                    try {
                        C1124.m56366(c19561);
                        iM55682 = C0946.m55979("ۗܶ") ^ i22;
                        i14 = ((iM55682 ^ i21) * (-14873)) ^ 1636881445;
                        i15 = -1095347881;
                        i18 = iM55682 ^ i15;
                        i26 = i11;
                        obj2 = obj;
                        th2 = th4;
                        i24 = i18;
                        i23 = i14;
                        th3 = th3;
                        c10845 = c10845;
                        th4 = th2;
                        short[] sArr9 = sArr3;
                        i32 = i4;
                        sArr3 = sArr9;
                    } catch (Throwable th8) {
                        int iM55685 = (C0873.m55680("ۙۨ") ^ i22) * (-39);
                        obj2 = th8;
                        i23 = ((iM55685 ^ i21) * (-11031)) ^ 732244460;
                        i26 = i11;
                        i32 = i4;
                        sArr3 = sArr3;
                        i24 = iM55685 ^ 705088060;
                        th3 = th3;
                        c10845 = c10845;
                        th4 = th4;
                    }
                    break;
                case -1262247907:
                case -663889881:
                    C1012.m56134();
                    if (C0912.f81867 <= 0) {
                        th4 = th4;
                        c10845 = c10845;
                        obj2 = obj2;
                        th3 = th3;
                        i26 = i26;
                        c24165 = c24165;
                        sArr2 = sArr2;
                        abstractC17043 = abstractC17043;
                        int i43 = i32;
                        sArr3 = sArr3;
                        i4 = i43;
                        int iM55686 = (C0873.m55680("ۡܽ") + i22) * 65;
                        i5 = ((iM55686 ^ i21) * (-18987)) ^ 1764598682;
                        i7 = iM55686 ^ (-1062563144);
                        sArr2 = sArr2;
                        abstractC17043 = abstractC17043;
                        i26 = i26;
                        obj2 = obj2;
                        c24165 = c24165;
                        th3 = th3;
                        c10845 = c10845;
                        th4 = th4;
                        i24 = i7;
                        i23 = i5;
                        c13394 = this;
                        short[] sArr10 = sArr3;
                        i32 = i4;
                        sArr3 = sArr10;
                    } else {
                        th4 = th4;
                        iM55680 = C0873.m55680("ܶۗ") ^ i21;
                        i = ((iM55680 ^ i22) * (-11353)) ^ (-1231970425);
                        i2 = 92671432;
                        int i310 = iM55680 ^ i2;
                        th4 = th4;
                        i24 = i310;
                        i23 = i;
                    }
                    break;
                case -943535565:
                case -387858301:
                    C0877.m55706(th4, obj3);
                    iM55979 = C0873.m55680("ܿۨ") ^ i22;
                    i = ((iM55979 ^ i21) * 12681) ^ 2060457038;
                    i3 = -695127604;
                    i24 = iM55979 ^ i3;
                    i23 = i;
                    break;
                case -843048189:
                case 1559374759:
                    if (C0873.f81841 <= 0) {
                        th4 = th4;
                        c10845 = c10845;
                        obj2 = obj2;
                        i33 = i33;
                        th3 = th3;
                        i26 = i26;
                        c24165 = c24165;
                        sArr2 = sArr2;
                        abstractC17043 = abstractC17043;
                        s = s2;
                        int i44 = i32;
                        sArr3 = sArr3;
                        i4 = i44;
                        iM559710 = C0873.m55680("ۤۙ") ^ i22;
                        i5 = ((iM559710 ^ i21) * 31031) ^ 212309764;
                        i6 = -1881546530;
                        i7 = iM559710 ^ i6;
                        s2 = s;
                        sArr2 = sArr2;
                        i33 = i33;
                        abstractC17043 = abstractC17043;
                        i26 = i26;
                        obj2 = obj2;
                        c24165 = c24165;
                        th3 = th3;
                        c10845 = c10845;
                        th4 = th4;
                        i24 = i7;
                        i23 = i5;
                        c13394 = this;
                        short[] sArr11 = sArr3;
                        i32 = i4;
                        sArr3 = sArr11;
                    } else {
                        iM55979 = C0946.m55979("ۙۧ") ^ i21;
                        i = ((iM55979 ^ i22) * (-21343)) ^ 2053161834;
                        i3 = 1066243830;
                        i24 = iM55979 ^ i3;
                        i23 = i;
                    }
                    break;
                case -720739821:
                case 1532864636:
                    th4 = th4;
                    c10845 = c10845;
                    obj2 = obj2;
                    i33 = i33;
                    th3 = th3;
                    i26 = i26;
                    c24165 = c24165;
                    sArr2 = sArr2;
                    abstractC17043 = abstractC17043;
                    s = s2;
                    int i45 = i32;
                    sArr3 = sArr3;
                    i4 = i45;
                    sArr = f82156;
                    c = 20;
                    if (C0863.f81833 <= 0) {
                        iM559710 = C0873.m55680("ܰܽ") ^ i22;
                        i5 = ((iM559710 ^ i21) * (-2983)) ^ 1616333086;
                        i6 = 1702513242;
                    } else {
                        iM559710 = (C0946.m55979("ۤ᩶") + i21) * (-9);
                        i5 = ((iM559710 ^ i22) * (-32005)) ^ (-282406836);
                        i6 = 1663268897;
                    }
                    i7 = iM559710 ^ i6;
                    s2 = s;
                    sArr2 = sArr2;
                    i33 = i33;
                    abstractC17043 = abstractC17043;
                    i26 = i26;
                    obj2 = obj2;
                    c24165 = c24165;
                    th3 = th3;
                    c10845 = c10845;
                    th4 = th4;
                    i24 = i7;
                    i23 = i5;
                    c13394 = this;
                    short[] sArr12 = sArr3;
                    i32 = i4;
                    sArr3 = sArr12;
                    break;
                case -539497571:
                case 665344028:
                    th4 = th4;
                    c10845 = c10845;
                    obj = obj2;
                    i17 = i33;
                    th3 = th3;
                    i11 = i26;
                    int i46 = i32;
                    sArr3 = sArr3;
                    i4 = i46;
                    abstractC17043 = c13394.f37591;
                    C24164 c24167 = c13394.f37592;
                    sArr2 = f82156;
                    if (C0894.f81854 >= 0) {
                        c24165 = c24167;
                        int iM55687 = C0873.m55680("ۡۡ") ^ i21;
                        i14 = ((iM55687 ^ i22) * (-23433)) ^ (-1567760936);
                        i18 = iM55687 ^ (-588955149);
                        i33 = i17;
                        i26 = i11;
                        obj2 = obj;
                        th2 = th4;
                        i24 = i18;
                        i23 = i14;
                        th3 = th3;
                        c10845 = c10845;
                        th4 = th2;
                        short[] sArr13 = sArr3;
                        i32 = i4;
                        sArr3 = sArr13;
                    } else {
                        int iM559716 = (i22 - C0946.m55979("ܺܺ")) * (-41);
                        c24165 = c24167;
                        i23 = ((iM559716 ^ i21) * (-709)) ^ 1026128454;
                        i33 = i17;
                        i26 = i11;
                        obj2 = obj;
                        i32 = i4;
                        sArr3 = sArr3;
                        i24 = iM559716 ^ 1140362130;
                        th3 = th3;
                        c10845 = c10845;
                        th4 = th4;
                    }
                    break;
                case -517439902:
                case -177608414:
                    th4 = th4;
                    c10845 = c10845;
                    obj2 = obj2;
                    i33 = i33;
                    th3 = th3;
                    i26 = i26;
                    c24165 = c24165;
                    sArr2 = sArr2;
                    abstractC17043 = abstractC17043;
                    int i47 = i32;
                    sArr3 = sArr3;
                    i4 = i47;
                    i29 = i28 * i28;
                    i30 = s2 * s2;
                    i31 = 801025;
                    if (C1194.f82045 == 0) {
                        iM55681 = (C0873.m55680("᩵᩵") ^ i22) * (-7);
                        i8 = ((iM55681 ^ i21) * (-4323)) ^ (-1923984030);
                        i9 = -303884668;
                        i10 = iM55681 ^ i9;
                        sArr2 = sArr2;
                        i33 = i33;
                        i26 = i26;
                        obj2 = obj2;
                        th2 = th4;
                        i24 = i10;
                        i23 = i8;
                        abstractC17043 = abstractC17043;
                        c24165 = c24165;
                        th3 = th3;
                        c10845 = c10845;
                        th4 = th2;
                        short[] sArr14 = sArr3;
                        i32 = i4;
                        sArr3 = sArr14;
                    } else {
                        s = s2;
                        iM559710 = C0873.m55680("ܰܽ") ^ i22;
                        i5 = ((iM559710 ^ i21) * (-2983)) ^ 1616333086;
                        i6 = 1702513242;
                        i7 = iM559710 ^ i6;
                        s2 = s;
                        sArr2 = sArr2;
                        i33 = i33;
                        abstractC17043 = abstractC17043;
                        i26 = i26;
                        obj2 = obj2;
                        c24165 = c24165;
                        th3 = th3;
                        c10845 = c10845;
                        th4 = th4;
                        i24 = i7;
                        i23 = i5;
                        c13394 = this;
                        short[] sArr15 = sArr3;
                        i32 = i4;
                        sArr3 = sArr15;
                    }
                    break;
                case -441287481:
                case -398790255:
                    th4 = th4;
                    iM559713 = C0946.m55979(C1124.m56373(sArr3, i27, i26, i25));
                    if (C1124.m56367() < 0) {
                        iM55680 = C0873.m55680("ܳۢ") ^ i22;
                        i = ((iM55680 ^ i21) * 19199) ^ 1545569832;
                        i2 = 630240021;
                        int i311 = iM55680 ^ i2;
                        th4 = th4;
                        i24 = i311;
                        i23 = i;
                    } else {
                        c10845 = c10845;
                        obj2 = obj2;
                        i33 = i33;
                        th3 = th3;
                        i26 = i26;
                        c24165 = c24165;
                        sArr2 = sArr2;
                        abstractC17043 = abstractC17043;
                        s = s2;
                        int i48 = i32;
                        sArr3 = sArr3;
                        i4 = i48;
                        iM559710 = C0873.m55680("ۤۙ") ^ i22;
                        i5 = ((iM559710 ^ i21) * 31031) ^ 212309764;
                        i6 = -1881546530;
                        i7 = iM559710 ^ i6;
                        s2 = s;
                        sArr2 = sArr2;
                        i33 = i33;
                        abstractC17043 = abstractC17043;
                        i26 = i26;
                        obj2 = obj2;
                        c24165 = c24165;
                        th3 = th3;
                        c10845 = c10845;
                        th4 = th4;
                        i24 = i7;
                        i23 = i5;
                        c13394 = this;
                        short[] sArr16 = sArr3;
                        i32 = i4;
                        sArr3 = sArr16;
                    }
                    break;
                case -428848346:
                case 380472344:
                    th4 = th4;
                    c10845 = c10845;
                    obj2 = obj2;
                    i33 = i33;
                    th3 = th3;
                    i26 = i26;
                    c24165 = c24165;
                    sArr2 = sArr2;
                    abstractC17043 = abstractC17043;
                    int i49 = i32;
                    sArr3 = sArr3;
                    i4 = i49;
                    s = s2;
                    int i50 = s + 895;
                    if (C0845.f81821 >= 0) {
                        i28 = i50;
                        iM559710 = C0873.m55680("ۤۙ") ^ i22;
                        i5 = ((iM559710 ^ i21) * 31031) ^ 212309764;
                        i6 = -1881546530;
                        i7 = iM559710 ^ i6;
                        s2 = s;
                        sArr2 = sArr2;
                        i33 = i33;
                        abstractC17043 = abstractC17043;
                        i26 = i26;
                        obj2 = obj2;
                        c24165 = c24165;
                        th3 = th3;
                        c10845 = c10845;
                        th4 = th4;
                        i24 = i7;
                        i23 = i5;
                    } else {
                        int iM55688 = (i21 - C0873.m55680("ۖۧ")) * 75;
                        i28 = i50;
                        i23 = ((iM55688 ^ i22) * 11527) ^ (-1803127372);
                        s2 = s;
                        sArr2 = sArr2;
                        i33 = i33;
                        abstractC17043 = abstractC17043;
                        i26 = i26;
                        obj2 = obj2;
                        c24165 = c24165;
                        th3 = th3;
                        c10845 = c10845;
                        th4 = th4;
                        i24 = iM55688 ^ (-1763829500);
                    }
                    c13394 = this;
                    short[] sArr17 = sArr3;
                    i32 = i4;
                    sArr3 = sArr17;
                    break;
                case -292240539:
                case 1699410466:
                    C1124.m56366(c19562);
                    return;
                case -213279049:
                case 1589230539:
                    th4 = th4;
                    C0967.m56075(c19561);
                    if (C0947.m56001(c13394.f37592)) {
                        iM55680 = C0946.m55979("ۨۜ") ^ i22;
                        i = ((iM55680 ^ i21) * (-12405)) ^ (-2108623241);
                        i2 = -1547765311;
                    } else {
                        iM55680 = (i22 - C0946.m55979("᩺ۨ")) * 43;
                        i = ((iM55680 ^ i21) * 7067) ^ (-1688817917);
                        i2 = 1029742205;
                    }
                    int i312 = iM55680 ^ i2;
                    th4 = th4;
                    i24 = i312;
                    i23 = i;
                    break;
                case -147011250:
                case 1548781900:
                    C0861.m55626();
                    if (C1071.f81975 > 0) {
                        th4 = th4;
                        c10845 = c10845;
                        obj = obj2;
                        i17 = i33;
                        th3 = th3;
                        i11 = i26;
                        int i51 = i32;
                        sArr3 = sArr3;
                        i4 = i51;
                        int iM55689 = C0873.m55680("ۡۡ") ^ i21;
                        i14 = ((iM55689 ^ i22) * (-23433)) ^ (-1567760936);
                        i18 = iM55689 ^ (-588955149);
                        i33 = i17;
                        i26 = i11;
                        obj2 = obj;
                        th2 = th4;
                        i24 = i18;
                        i23 = i14;
                        th3 = th3;
                        c10845 = c10845;
                        th4 = th2;
                        short[] sArr18 = sArr3;
                        i32 = i4;
                        sArr3 = sArr18;
                    } else {
                        th4 = th4;
                        c10845 = c10845;
                        obj2 = obj2;
                        i33 = i33;
                        th3 = th3;
                        i26 = i26;
                        c24165 = c24165;
                        sArr2 = sArr2;
                        abstractC17043 = abstractC17043;
                        s = s2;
                        int i52 = i32;
                        sArr3 = sArr3;
                        i4 = i52;
                        iM559710 = C0873.m55680("ܰܽ") ^ i22;
                        i5 = ((iM559710 ^ i21) * (-2983)) ^ 1616333086;
                        i6 = 1702513242;
                        i7 = iM559710 ^ i6;
                        s2 = s;
                        sArr2 = sArr2;
                        i33 = i33;
                        abstractC17043 = abstractC17043;
                        i26 = i26;
                        obj2 = obj2;
                        c24165 = c24165;
                        th3 = th3;
                        c10845 = c10845;
                        th4 = th4;
                        i24 = i7;
                        i23 = i5;
                        c13394 = this;
                        short[] sArr19 = sArr3;
                        i32 = i4;
                        sArr3 = sArr19;
                    }
                    break;
                case -34763608:
                case 334905779:
                    i4 = i32;
                    i25 = 42295;
                    iM55681 = (C0873.m55680("ۚ۟") ^ i21) * (-95);
                    i8 = ((iM55681 ^ i22) * 19889) ^ 504642701;
                    i9 = -245181798;
                    i10 = iM55681 ^ i9;
                    sArr2 = sArr2;
                    i33 = i33;
                    i26 = i26;
                    obj2 = obj2;
                    th2 = th4;
                    i24 = i10;
                    i23 = i8;
                    abstractC17043 = abstractC17043;
                    c24165 = c24165;
                    th3 = th3;
                    c10845 = c10845;
                    th4 = th2;
                    short[] sArr110 = sArr3;
                    i32 = i4;
                    sArr3 = sArr110;
                    break;
                case 29694711:
                case 699539728:
                    short[] sArr20 = sArr3;
                    Throwable th9 = th4;
                    C10844 c10846 = c10845;
                    int iM559717 = C0946.m55979("ܽۜ") ^ i21;
                    i23 = ((iM559717 ^ i22) * 14943) ^ (-2077024940);
                    th3 = th3;
                    i26 = i26;
                    obj2 = obj2;
                    c10845 = c10846;
                    th4 = th9;
                    i24 = iM559717 ^ 1006713584;
                    sArr3 = sArr20;
                    i32 = 0;
                    break;
                case 53219189:
                case 712678132:
                    th4 = th4;
                    c10845 = c10845;
                    obj2 = obj2;
                    th3 = th3;
                    i26 = i26;
                    c24165 = c24165;
                    sArr2 = sArr2;
                    abstractC17043 = abstractC17043;
                    int i53 = i32;
                    sArr3 = sArr3;
                    i4 = i53;
                    i33 = 21;
                    if (C1036.f81953 < 0) {
                        int iM559718 = C0946.m55979("ۜܺ") ^ i21;
                        i8 = ((iM559718 ^ i22) * (-19687)) ^ 1987229140;
                        i10 = iM559718 ^ 216895939;
                        sArr2 = sArr2;
                        i26 = i26;
                        obj2 = obj2;
                        th2 = th4;
                        i24 = i10;
                        i23 = i8;
                        abstractC17043 = abstractC17043;
                        c24165 = c24165;
                        th3 = th3;
                        c10845 = c10845;
                        th4 = th2;
                        short[] sArr111 = sArr3;
                        i32 = i4;
                        sArr3 = sArr111;
                    } else {
                        int iM556810 = (C0873.m55680("ۡܽ") + i22) * 65;
                        i5 = ((iM556810 ^ i21) * (-18987)) ^ 1764598682;
                        i7 = iM556810 ^ (-1062563144);
                        sArr2 = sArr2;
                        abstractC17043 = abstractC17043;
                        i26 = i26;
                        obj2 = obj2;
                        c24165 = c24165;
                        th3 = th3;
                        c10845 = c10845;
                        th4 = th4;
                        i24 = i7;
                        i23 = i5;
                        c13394 = this;
                        short[] sArr112 = sArr3;
                        i32 = i4;
                        sArr3 = sArr112;
                    }
                    break;
                case 82482249:
                case 695695751:
                    th4 = th4;
                    c24166 = c13394.f37592;
                    sArr3 = f82156;
                    i27 = 24;
                    i26 = 3;
                    if (C1124.m56367() >= 0) {
                        iM55680 = C0873.m55680("ܶۗ") ^ i21;
                        i = ((iM55680 ^ i22) * (-11353)) ^ (-1231970425);
                        i2 = 92671432;
                    } else {
                        iM55680 = C0873.m55680("۟᩷") ^ i21;
                        i = ((iM55680 ^ i22) * (-15427)) ^ 368680187;
                        i2 = -1290265540;
                    }
                    int i313 = iM55680 ^ i2;
                    th4 = th4;
                    i24 = i313;
                    i23 = i;
                    break;
                case 103401924:
                case 106045911:
                    if (C0882.m55710() == 0) {
                        th4 = th4;
                        c10844 = c10845;
                        obj = obj2;
                        th = th3;
                        i11 = i26;
                        c24164 = c24165;
                        int i54 = i32;
                        sArr3 = sArr3;
                        i4 = i54;
                        iM559711 = (C0873.m55680("ۚۛ") + i21) * (-31);
                        i12 = ((iM559711 ^ i22) * 11699) ^ (-1611642514);
                        i13 = -573818397;
                        i16 = iM559711 ^ i13;
                        c24165 = c24164;
                        th3 = th;
                        c10845 = c10844;
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
                    c10845 = c10845;
                    obj2 = obj2;
                    i33 = i33;
                    th3 = th3;
                    i26 = i26;
                    c24165 = c24165;
                    sArr2 = sArr2;
                    abstractC17043 = abstractC17043;
                    s = s2;
                    int i55 = i32;
                    sArr3 = sArr3;
                    i4 = i55;
                    iM559710 = C0873.m55680("ܰܽ") ^ i22;
                    i5 = ((iM559710 ^ i21) * (-2983)) ^ 1616333086;
                    i6 = 1702513242;
                    i7 = iM559710 ^ i6;
                    s2 = s;
                    sArr2 = sArr2;
                    i33 = i33;
                    abstractC17043 = abstractC17043;
                    i26 = i26;
                    obj2 = obj2;
                    c24165 = c24165;
                    th3 = th3;
                    c10845 = c10845;
                    th4 = th4;
                    i24 = i7;
                    i23 = i5;
                    c13394 = this;
                    short[] sArr114 = sArr3;
                    i32 = i4;
                    sArr3 = sArr114;
                    break;
                case 421939039:
                case 1823984487:
                    th4 = th4;
                    try {
                        RunnableC1014.m56176(c10845);
                        iM55680 = (C0873.m55680("ۛۚ") + i22) * 99;
                        i = ((iM55680 ^ i21) * (-26945)) ^ (-1099767468);
                        i2 = -1113904295;
                        int i314 = iM55680 ^ i2;
                        th4 = th4;
                        i24 = i314;
                        i23 = i;
                    } catch (Throwable th10) {
                        int iM556811 = (C0873.m55680("ۨ۬") + i21) * 51;
                        th4 = th4;
                        i24 = iM556811 ^ 571149286;
                        i19 = ((iM556811 ^ i22) * 11585) ^ 1429483450;
                        obj4 = th10;
                        i23 = i19;
                    }
                    break;
                case 484879280:
                case 955345812:
                    th4 = th4;
                    c10845 = c10845;
                    obj = obj2;
                    th3 = th3;
                    i11 = i26;
                    int i56 = i32;
                    sArr3 = sArr3;
                    i4 = i56;
                    c19561 = new C19561(c13394.f37587);
                    iM55682 = (i21 - C0946.m55979("۟ܶ")) * 27;
                    i14 = ((iM55682 ^ i22) * 10295) ^ (-479734823);
                    i15 = 155328271;
                    i18 = iM55682 ^ i15;
                    i26 = i11;
                    obj2 = obj;
                    th2 = th4;
                    i24 = i18;
                    i23 = i14;
                    th3 = th3;
                    c10845 = c10845;
                    th4 = th2;
                    short[] sArr115 = sArr3;
                    i32 = i4;
                    sArr3 = sArr115;
                    break;
                case 649520545:
                case 1671782147:
                    th4 = th4;
                    Object obj5 = obj2;
                    C0877.m55706(th3, obj5);
                    i11 = i26;
                    obj = obj5;
                    c10845 = c10845;
                    th3 = th3;
                    int i57 = i32;
                    sArr3 = sArr3;
                    i4 = i57;
                    iM55682 = C0946.m55979("ۗܶ") ^ i22;
                    i14 = ((iM55682 ^ i21) * (-14873)) ^ 1636881445;
                    i15 = -1095347881;
                    i18 = iM55682 ^ i15;
                    i26 = i11;
                    obj2 = obj;
                    th2 = th4;
                    i24 = i18;
                    i23 = i14;
                    th3 = th3;
                    c10845 = c10845;
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
                        C10844 c10847 = new C10844(abstractC17043);
                        int iM559719 = C0946.m55979("ۙ᩶") ^ i22;
                        i12 = ((iM559719 ^ i21) * (-11281)) ^ (-1735200597);
                        th4 = th4;
                        i24 = iM559719 ^ (-797116416);
                        th3 = th11;
                        c10845 = c10847;
                    } catch (Throwable th12) {
                        th3 = th12;
                        c10845 = null;
                        int iM559720 = C0946.m55979("ܺ᩻") ^ i21;
                        i12 = ((iM559720 ^ i22) * 13673) ^ 1765001602;
                        i16 = iM559720 ^ (-450141172);
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
                        C0877.m55706(th5, obj4);
                        iM55680 = (C0873.m55680("ۛۚ") + i22) * 99;
                        i = ((iM55680 ^ i21) * (-26945)) ^ (-1099767468);
                        i2 = -1113904295;
                        int i315 = iM55680 ^ i2;
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
                        int iM559721 = C0946.m55979("ܺ᩻") ^ i21;
                        i12 = ((iM559721 ^ i22) * 13673) ^ 1765001602;
                        i16 = iM559721 ^ (-450141172);
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
                    C1036.m56257();
                    return;
                case 1377687063:
                case 1913071999:
                    return;
                case 1514653086:
                case 1934745461:
                    th4 = th4;
                    c10845 = c10845;
                    obj2 = obj2;
                    th3 = th3;
                    i26 = i26;
                    c24165 = c24165;
                    int i60 = i32;
                    sArr3 = sArr3;
                    i4 = i60;
                    sArr2 = sArr2;
                    i33 = i33;
                    iM559714 = C0946.m55979(C1024.m56203(sArr2, i33, 3, i25));
                    if (RunnableC0938.f81886 >= 0) {
                        iM55681 = (C0873.m55680("۬۟") + i22) * 35;
                        abstractC17043 = abstractC17043;
                        i8 = ((iM55681 ^ i21) * 5799) ^ 766796997;
                        i9 = 1636386852;
                    } else {
                        abstractC17043 = abstractC17043;
                        iM55681 = (C0946.m55979("ᩳ᩹") + i22) * 19;
                        i8 = ((iM55681 ^ i21) * 6145) ^ (-77205217);
                        i9 = 570015445;
                    }
                    i10 = iM55681 ^ i9;
                    sArr2 = sArr2;
                    i33 = i33;
                    i26 = i26;
                    obj2 = obj2;
                    th2 = th4;
                    i24 = i10;
                    i23 = i8;
                    abstractC17043 = abstractC17043;
                    c24165 = c24165;
                    th3 = th3;
                    c10845 = c10845;
                    th4 = th2;
                    short[] sArr119 = sArr3;
                    i32 = i4;
                    sArr3 = sArr119;
                    break;
                case 1583362273:
                case 2142161537:
                    if (C0946.f81894 != 0) {
                        iM55979 = C0946.m55979("ۙۧ") ^ i21;
                        i = ((iM55979 ^ i22) * (-21343)) ^ 2053161834;
                        i3 = 1066243830;
                        i24 = iM55979 ^ i3;
                        i23 = i;
                    } else {
                        th4 = th4;
                        c10845 = c10845;
                        obj2 = obj2;
                        th3 = th3;
                        i26 = i26;
                        c24165 = c24165;
                        sArr2 = sArr2;
                        abstractC17043 = abstractC17043;
                        int i410 = i32;
                        sArr3 = sArr3;
                        i4 = i410;
                        int iM556812 = (C0873.m55680("ۡܽ") + i22) * 65;
                        i5 = ((iM556812 ^ i21) * (-18987)) ^ 1764598682;
                        i7 = iM556812 ^ (-1062563144);
                        sArr2 = sArr2;
                        abstractC17043 = abstractC17043;
                        i26 = i26;
                        obj2 = obj2;
                        c24165 = c24165;
                        th3 = th3;
                        c10845 = c10845;
                        th4 = th4;
                        i24 = i7;
                        i23 = i5;
                        c13394 = this;
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
                    c10845 = c10845;
                    Object obj6 = obj2;
                    int i61 = i32;
                    sArr3 = sArr3;
                    i4 = i61;
                    try {
                        C0863.m55637(c10845, i4);
                        th3 = th3;
                        try {
                            i11 = i26;
                            try {
                                obj = obj6;
                                try {
                                    C22348.m50171(C22348.m50169(c19561), c13394.f37588[c13394.f37590[i4]], new C7041(c10845, new AtomicInteger()), c13394.f37592.m53434());
                                    try {
                                        RunnableC1014.m56176(c10845);
                                        iM55682 = C0873.m55680("᩷ܿ") ^ i21;
                                        i14 = ((iM55682 ^ i22) * (-5453)) ^ (-1389842257);
                                        i15 = -1512035684;
                                        i18 = iM55682 ^ i15;
                                        i26 = i11;
                                        obj2 = obj;
                                        th2 = th4;
                                        i24 = i18;
                                        i23 = i14;
                                        th3 = th3;
                                        c10845 = c10845;
                                        th4 = th2;
                                        short[] sArr1111 = sArr3;
                                        i32 = i4;
                                        sArr3 = sArr1111;
                                    } catch (Throwable th14) {
                                        th3 = th14;
                                        c10845 = c10845;
                                        int iM559722 = C0946.m55979("ܺ᩻") ^ i21;
                                        i12 = ((iM559722 ^ i22) * 13673) ^ 1765001602;
                                        i16 = iM559722 ^ (-450141172);
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
                                    iM55682 = (i21 - C0873.m55680("᩶֡")) * (-125);
                                    i14 = ((iM55682 ^ i22) * 24817) ^ 2141617754;
                                    i15 = -587399249;
                                }
                            } catch (Throwable th16) {
                                th = th16;
                                obj = obj6;
                                th5 = th;
                                iM55682 = (i21 - C0873.m55680("᩶֡")) * (-125);
                                i14 = ((iM55682 ^ i22) * 24817) ^ 2141617754;
                                i15 = -587399249;
                                i18 = iM55682 ^ i15;
                                i26 = i11;
                                obj2 = obj;
                                th2 = th4;
                                i24 = i18;
                                i23 = i14;
                                th3 = th3;
                                c10845 = c10845;
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
                            iM55682 = (i21 - C0873.m55680("᩶֡")) * (-125);
                            i14 = ((iM55682 ^ i22) * 24817) ^ 2141617754;
                            i15 = -587399249;
                            i18 = iM55682 ^ i15;
                            i26 = i11;
                            obj2 = obj;
                            th2 = th4;
                            i24 = i18;
                            i23 = i14;
                            th3 = th3;
                            c10845 = c10845;
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
                    C1024.m56209();
                    if (!C0882.f81846) {
                        th4 = th4;
                        c10845 = c10845;
                        obj2 = obj2;
                        i33 = i33;
                        th3 = th3;
                        i26 = i26;
                        c24165 = c24165;
                        sArr2 = sArr2;
                        abstractC17043 = abstractC17043;
                        s = s2;
                        int i411 = i32;
                        sArr3 = sArr3;
                        i4 = i411;
                        iM559710 = C0873.m55680("ۤۙ") ^ i22;
                        i5 = ((iM559710 ^ i21) * 31031) ^ 212309764;
                        i6 = -1881546530;
                        i7 = iM559710 ^ i6;
                        s2 = s;
                        sArr2 = sArr2;
                        i33 = i33;
                        abstractC17043 = abstractC17043;
                        i26 = i26;
                        obj2 = obj2;
                        c24165 = c24165;
                        th3 = th3;
                        c10845 = c10845;
                        th4 = th4;
                        i24 = i7;
                        i23 = i5;
                        c13394 = this;
                        short[] sArr1115 = sArr3;
                        i32 = i4;
                        sArr3 = sArr1115;
                    } else {
                        iM55979 = (C0946.m55979("ۙ᩻") + i21) * 99;
                        i = ((iM55979 ^ i22) * (-30071)) ^ (-1512477538);
                        i3 = -2106057365;
                        i24 = iM55979 ^ i3;
                        i23 = i;
                    }
                    break;
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        AbstractC17043 abstractC17043 = null;
        Main mainM56560 = null;
        int i = 1522371356;
        int i2 = C0949.f81897;
        int i3 = C1053.f81965;
        int iM55680 = C0873.m55680("֫ۙ") ^ i3;
        int i4 = ((iM55680 ^ i2) * (-3657)) ^ 320310168;
        int i5 = 412311915;
        while (true) {
            i = ((((i ^ i2) * 5321) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -1733542380:
                case -1694482930:
                    C1053.m56327();
                    if (!C0955.f81898) {
                        iM55680 = (C0873.m55680("ܰ۟") + i3) * 51;
                        i4 = ((iM55680 ^ i2) * (-14771)) ^ 161292996;
                        i5 = -1244855563;
                    } else {
                        iM55680 = C0946.m55979("۠ܺ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 6015) ^ (-1477111798);
                        i5 = -1962257303;
                    }
                    break;
                case -1450548322:
                case 104942189:
                    if (C0854.f81826 != 0) {
                        iM55680 = C0873.m55680("ᩳۤ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 18711) ^ 165671955;
                        i5 = 1112901881;
                    } else {
                        iM55680 = (i3 - C0946.m55979("᩸ۡ")) * (-49);
                        i4 = ((iM55680 ^ i2) * 24425) ^ (-1797514422);
                        i5 = 1176525123;
                    }
                    break;
                case -1126553806:
                case -405040425:
                    if (C1024.f81946) {
                        iM55680 = C0873.m55680("֫ۧ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-939)) ^ (-935596270);
                        i5 = 510373415;
                    } else {
                        iM55680 = (C0873.m55680("᩸ᩳ") ^ i2) * (-7);
                        i4 = ((iM55680 ^ i3) * 23719) ^ 2007008994;
                        i5 = 583448916;
                    }
                    break;
                case -915096845:
                case 692555554:
                    C0877.m55696();
                    if (C1071.m56343() == 0) {
                        iM55680 = C0873.m55680("ᩳۤ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 18711) ^ 165671955;
                        i5 = 1112901881;
                    } else {
                        iM55680 = (C0873.m55680("ܰ۟") + i3) * 51;
                        i4 = ((iM55680 ^ i2) * (-14771)) ^ 161292996;
                        i5 = -1244855563;
                    }
                    break;
                case -704521742:
                case 1396842011:
                    abstractC17043 = this.f37586;
                    if (C0873.m55678()) {
                        iM55680 = C0946.m55979("۠ܺ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 6015) ^ (-1477111798);
                        i5 = -1962257303;
                    } else {
                        iM55680 = (C0873.m55680("ۤۖ") + i3) * (-69);
                        i4 = ((iM55680 ^ i2) * (-32659)) ^ (-619146116);
                        i5 = -1590591462;
                    }
                    break;
                case -616237536:
                case 2114553843:
                    if (ServiceConnectionC1013.f81940 < 0) {
                        iM55680 = C0946.m55979("۠ܺ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 6015) ^ (-1477111798);
                        i5 = -1962257303;
                    } else {
                        iM55680 = C0873.m55680("֫ۧ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-939)) ^ (-935596270);
                        i5 = 510373415;
                    }
                    break;
                case -455670315:
                case 751828685:
                    if (C0917.m55854()) {
                        iM55680 = (C0946.m55979("ۤۨ") + i3) * (-25);
                        i4 = ((iM55680 ^ i2) * (-15757)) ^ 1957896598;
                        i5 = -2037515993;
                    } else {
                        iM55680 = (C0873.m55680("ܰ۟") + i3) * 51;
                        i4 = ((iM55680 ^ i2) * (-14771)) ^ 161292996;
                        i5 = -1244855563;
                    }
                    break;
                case -410373761:
                case 1278302458:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = C0873.m55680("ᩳۤ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 18711) ^ 165671955;
                        i5 = 1112901881;
                    } else {
                        iM55680 = (C0946.m55979("᩻ۖ") + i2) * (-43);
                        i4 = ((iM55680 ^ i3) * 1525) ^ 1984359275;
                        i5 = 1370307857;
                    }
                    break;
                case -323147906:
                case 2000515010:
                    ServiceConnectionC1013.m56155(mainM56560, exc, null);
                    break;
                case -291656864:
                case 1138556260:
                    RunnableC1014.m56173(abstractC17043);
                    if (ServiceConnectionC1013.m56157() <= 0) {
                        iM55680 = C0946.m55979("᩻ܰ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 24121) ^ (-1385679662);
                        i5 = -47468594;
                    } else {
                        iM55680 = (C0946.m55979("ۗ᩷") ^ i2) * 57;
                        i4 = ((iM55680 ^ i3) * 18357) ^ (-875456577);
                        i5 = 276312211;
                    }
                    break;
                case 9006227:
                case 1684507411:
                    if (C0912.f81867 <= 0) {
                        iM55680 = (C0873.m55680("ܰ۟") + i3) * 51;
                        i4 = ((iM55680 ^ i2) * (-14771)) ^ 161292996;
                        i5 = -1244855563;
                    } else {
                        iM55680 = (i2 - C0873.m55680("ۡ᩺")) * (-45);
                        i4 = ((iM55680 ^ i3) * 28389) ^ (-1662678296);
                        i5 = 1652155209;
                    }
                    break;
                case 387287084:
                case 1950598757:
                    mainM56560 = C1929.m56560(this.f37584);
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55680 = C0946.m55979("۠ܺ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 6015) ^ (-1477111798);
                        i5 = -1962257303;
                    } else {
                        iM55680 = C0946.m55979("᩻۠") ^ i3;
                        i4 = ((iM55680 ^ i2) * 12367) ^ 1748916249;
                        i5 = 1130528047;
                    }
                    break;
                case 708260243:
                case 1845946875:
                    C1194.m56396();
                    C1048.m56305();
                    break;
                case 742805540:
                case 2058910606:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55680 = C0873.m55680("ᩳۤ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 18711) ^ 165671955;
                        i5 = 1112901881;
                    } else {
                        iM55680 = (C0946.m55979("ܺ۫") + i2) * (-89);
                        i4 = ((iM55680 ^ i3) * (-14121)) ^ 933687686;
                        i5 = -1499912973;
                    }
                    break;
                case 1381762069:
                case 2092017843:
                    C1194.m56396();
                    ServiceConnectionC1013.m56157();
                    iM55680 = C0873.m55680("֫ۧ") ^ i3;
                    i4 = ((iM55680 ^ i2) * (-939)) ^ (-935596270);
                    i5 = 510373415;
                    break;
                default:
                    if (RunnableC0871.m55672() >= 0) {
                        iM55680 = C0946.m55979("᩻ܰ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 24121) ^ (-1385679662);
                        i5 = -47468594;
                    } else {
                        iM55680 = C0873.m55680("ܶ֨") ^ i3;
                        i4 = ((iM55680 ^ i2) * 29355) ^ 1305004433;
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
    
        if (p067l.C0866.f81837 >= 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C13394(AbstractC17043 abstractC17043, C18107 c18107, int[] iArr, int[] iArr2) {
        AbstractC17043 abstractC17044;
        StringBuilder sb;
        int iM55979;
        int i;
        int i2;
        int iM55680;
        int i3;
        int i4;
        int iM55681;
        int i5;
        int i6 = C0967.f81910;
        int i7 = RunnableC0871.f81839;
        short s = f82156[0];
        int i8 = ((s * s) + 13242321) - (s * 7278) < 0 ? 27936 : 13814;
        this.f37587 = abstractC17043;
        this.f37584 = c18107;
        this.f37588 = iArr;
        this.f37590 = iArr2;
        int iM559710 = (i6 - C0946.m55979("ۖ᩸")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
        int i9 = ((iM559710 ^ i7) * (-31939)) ^ 242047833;
        short[] sArr = null;
        int i10 = iM559710 ^ (-1463381124);
        int i11 = 0;
        int i12 = 24489844;
        short[] sArr2 = null;
        String strM55591 = null;
        String strM38675 = null;
        StringBuilder sb2 = null;
        AbstractC17043 abstractC17043M38682 = null;
        String strM56293 = null;
        StringBuilder sb3 = null;
        while (true) {
            i12 = i10 ^ (i9 & (((i12 ^ i7) * 27201) >> 31));
            switch (i12) {
                case -2089489238:
                case 1518636262:
                    abstractC17044 = abstractC17043M38682;
                    sb = sb2;
                    sb3 = new StringBuilder();
                    if (C0912.f81867 <= 0) {
                        iM55979 = C0946.m55979("ᩳᩳ") ^ i7;
                        i = ((iM55979 ^ i6) * (-6979)) ^ 1015603876;
                        i2 = -125803184;
                    } else {
                        iM55979 = C0873.m55680("ۡ֫") ^ i7;
                        i = ((iM55979 ^ i6) * (-20829)) ^ (-1111552164);
                        i2 = 2134552906;
                    }
                    int i13 = iM55979 ^ i2;
                    sb2 = sb;
                    i10 = i13;
                    i9 = i;
                    abstractC17043M38682 = abstractC17044;
                    break;
                case -2058813609:
                case 1237451473:
                    abstractC17044 = abstractC17043M38682;
                    sb = sb2;
                    C1003.m56121(sb3, strM56293);
                    if (C0854.f81826 != 0) {
                        iM55979 = C0946.m55979("ᩳᩳ") ^ i7;
                        i = ((iM55979 ^ i6) * (-6979)) ^ 1015603876;
                        i2 = -125803184;
                    } else {
                        iM55979 = C0873.m55680("ᩴۛ") ^ i7;
                        i = ((iM55979 ^ i6) * 12035) ^ 1007972836;
                        i2 = 1693578229;
                    }
                    int i14 = iM55979 ^ i2;
                    sb2 = sb;
                    i10 = i14;
                    i9 = i;
                    abstractC17043M38682 = abstractC17044;
                    break;
                case -2033123758:
                case -68927227:
                    this.f37589 = abstractC17043M38682;
                    sb2 = new StringBuilder();
                    if (C1017.f81942 >= 0) {
                        abstractC17044 = abstractC17043M38682;
                        iM55681 = (C0946.m55979("ܶ᩸") + i7) * 77;
                        i = ((iM55681 ^ i6) * (-19205)) ^ 2074691726;
                        i5 = 616322209;
                    } else {
                        iM55681 = C0873.m55680("᩸ۛ") ^ i7;
                        abstractC17044 = abstractC17043M38682;
                        i = ((iM55681 ^ i6) * (-25147)) ^ (-634541933);
                        i5 = 1651476534;
                    }
                    i10 = iM55681 ^ i5;
                    i9 = i;
                    abstractC17043M38682 = abstractC17044;
                    break;
                case -1852765145:
                case -1189475812:
                    abstractC17044 = abstractC17043M38682;
                    sb = sb2;
                    strM56293 = C1046.m56293(sArr2, 1, 4, i8);
                    if (C0967.m56074()) {
                        iM55979 = C0873.m55680("᩸ۨ") ^ i6;
                        i = ((iM55979 ^ i7) * 4313) ^ 1740473083;
                        i2 = 1195882767;
                    } else {
                        iM55979 = (i6 - C0946.m55979("ۖۜ")) * (-35);
                        i = ((iM55979 ^ i7) * (-4227)) ^ (-774104749);
                        i2 = -1588295865;
                    }
                    int i15 = iM55979 ^ i2;
                    sb2 = sb;
                    i10 = i15;
                    i9 = i;
                    abstractC17043M38682 = abstractC17044;
                    break;
                case -1571101568:
                case -423521265:
                    abstractC17044 = abstractC17043M38682;
                    sb = sb2;
                    C0912.m55825(sb3, abstractC17043.m38675());
                    sArr2 = f82156;
                    if (RunnableC0871.f81839 < 0) {
                        iM55979 = C0946.m55979("֫ۢ") ^ i7;
                        i = ((iM55979 ^ i6) * 19649) ^ 484942935;
                        i2 = 141182239;
                        int i16 = iM55979 ^ i2;
                        sb2 = sb;
                        i10 = i16;
                        i9 = i;
                        abstractC17043M38682 = abstractC17044;
                    } else {
                        abstractC17043M38682 = abstractC17044;
                        iM55680 = C0946.m55979("۟᩷") ^ i6;
                        i3 = ((iM55680 ^ i7) * 6309) ^ (-937546412);
                        i4 = 752765124;
                        StringBuilder sb4 = sb;
                        i10 = iM55680 ^ i4;
                        i9 = i3;
                        sb2 = sb4;
                    }
                    break;
                case -1485148184:
                case -1149856045:
                    C0992.m56107();
                    break;
                case -1084773346:
                case 2032404710:
                    abstractC17044 = abstractC17043M38682;
                    sb = sb2;
                    this.f37591 = C0946.m55985(C17853.f53278);
                    if (RunnableC0938.m55938() == 0) {
                        iM55979 = (i6 - C0946.m55979("ۡۨ")) * 97;
                        i = ((iM55979 ^ i7) * 20267) ^ (-1312649350);
                        i2 = -1281822229;
                        int i17 = iM55979 ^ i2;
                        sb2 = sb;
                        i10 = i17;
                        i9 = i;
                        abstractC17043M38682 = abstractC17044;
                    } else {
                        sb2 = sb;
                        iM55681 = (C0946.m55979("ܶ᩸") + i7) * 77;
                        i = ((iM55681 ^ i6) * (-19205)) ^ 2074691726;
                        i5 = 616322209;
                        i10 = iM55681 ^ i5;
                        i9 = i;
                        abstractC17043M38682 = abstractC17044;
                    }
                    break;
                case -880472713:
                case -40060322:
                    C1003.m56121(sb2, C0947.m55993(sArr, i11, 8, i8));
                    strM55591 = C0845.m55591(sb2);
                    if (C1024.f81946) {
                        abstractC17044 = abstractC17043M38682;
                        sb = sb2;
                        iM55979 = C0946.m55979("ᩳᩳ") ^ i7;
                        i = ((iM55979 ^ i6) * (-6979)) ^ 1015603876;
                        i2 = -125803184;
                        int i18 = iM55979 ^ i2;
                        sb2 = sb;
                        i10 = i18;
                        i9 = i;
                        abstractC17043M38682 = abstractC17044;
                    } else {
                        int iM559711 = C0946.m55979("ᩴۨ") ^ i7;
                        i10 = iM559711 ^ (-1031342393);
                        i9 = ((iM559711 ^ i6) * 27365) ^ 3708522;
                        strM55591 = strM55591;
                    }
                    break;
                case -857716181:
                case -74278653:
                    ViewOnClickListenerC0939.m55941();
                    if (C1124.m56367() < 0) {
                        abstractC17044 = abstractC17043M38682;
                        iM55681 = (C0946.m55979("ܶ᩸") + i7) * 77;
                        i = ((iM55681 ^ i6) * (-19205)) ^ 2074691726;
                        i5 = 616322209;
                        i10 = iM55681 ^ i5;
                        i9 = i;
                        abstractC17043M38682 = abstractC17044;
                    } else {
                        iM55680 = (C0873.m55680("ۢ᩶") + i6) * 45;
                        sb = sb2;
                        i3 = ((iM55680 ^ i7) * (-8895)) ^ (-111327080);
                        i4 = -47912818;
                        StringBuilder sb5 = sb;
                        i10 = iM55680 ^ i4;
                        i9 = i3;
                        sb2 = sb5;
                    }
                    break;
                case -755416675:
                case 1534997404:
                    this.f37585 = abstractC17043.m38682(strM55591);
                    this.f37586 = abstractC17043M38682;
                    return;
                case -597619699:
                case -49727811:
                    sb = sb2;
                    abstractC17043M38682 = abstractC17043.m38682(C0863.m55639(sb3));
                    if (C0949.f81897 >= 0) {
                        iM55680 = C0946.m55979("۟᩷") ^ i6;
                        i3 = ((iM55680 ^ i7) * 6309) ^ (-937546412);
                        i4 = 752765124;
                    } else {
                        iM55680 = (C0873.m55680("۠֨") + i6) * (-67);
                        i3 = ((iM55680 ^ i7) * (-31989)) ^ 773957238;
                        i4 = -2008936791;
                    }
                    StringBuilder sb6 = sb;
                    i10 = iM55680 ^ i4;
                    i9 = i3;
                    sb2 = sb6;
                    break;
                case 98182881:
                case 1974161052:
                    C1071.m56343();
                    C1003.m56123();
                    iM55680 = (C0873.m55680("ۢ᩶") + i6) * 45;
                    sb = sb2;
                    i3 = ((iM55680 ^ i7) * (-8895)) ^ (-111327080);
                    i4 = -47912818;
                    StringBuilder sb7 = sb;
                    i10 = iM55680 ^ i4;
                    i9 = i3;
                    sb2 = sb7;
                    break;
                case 550701689:
                case 1896200070:
                    C0937.m55918();
                    RunnableC0897.m55784();
                    throw new RuntimeException();
                case 755557716:
                case 1635308703:
                    C0906.m55809();
                    if (C0992.m56107() > 0) {
                        abstractC17044 = abstractC17043M38682;
                        sb = sb2;
                        iM55979 = C0873.m55680("᩸ۨ") ^ i6;
                        i = ((iM55979 ^ i7) * 4313) ^ 1740473083;
                        i2 = 1195882767;
                        int i19 = iM55979 ^ i2;
                        sb2 = sb;
                        i10 = i19;
                        i9 = i;
                        abstractC17043M38682 = abstractC17044;
                    }
                    abstractC17044 = abstractC17043M38682;
                    iM55681 = (C0946.m55979("ܶ᩸") + i7) * 77;
                    i = ((iM55681 ^ i6) * (-19205)) ^ 2074691726;
                    i5 = 616322209;
                    i10 = iM55681 ^ i5;
                    i9 = i;
                    abstractC17043M38682 = abstractC17044;
                    break;
                case 1061652416:
                case 1445308666:
                    C0912.m55825(sb2, strM38675);
                    sArr = f82156;
                    i11 = 5;
                    if (C0898.f81858 <= 0) {
                        iM55680 = (C0873.m55680("ۢ᩶") + i6) * 45;
                        sb = sb2;
                        i3 = ((iM55680 ^ i7) * (-8895)) ^ (-111327080);
                        i4 = -47912818;
                    } else {
                        sb = sb2;
                        iM55680 = (i6 - C0946.m55979("᩵۬")) * (-17);
                        i3 = ((iM55680 ^ i7) * (-189)) ^ (-1435785155);
                        i4 = 1908446084;
                    }
                    StringBuilder sb8 = sb;
                    i10 = iM55680 ^ i4;
                    i9 = i3;
                    sb2 = sb8;
                    break;
                default:
                    sb = sb2;
                    strM38675 = abstractC17043.m38675();
                    if (ViewOnClickListenerC0939.f81888 > 0) {
                        iM55680 = C0873.m55680("ۜܶ") ^ i6;
                        i3 = ((iM55680 ^ i7) * (-25405)) ^ (-273557991);
                        i4 = -1260153778;
                        StringBuilder sb9 = sb;
                        i10 = iM55680 ^ i4;
                        i9 = i3;
                        sb2 = sb9;
                    } else {
                        abstractC17044 = abstractC17043M38682;
                        iM55979 = C0873.m55680("᩸ۨ") ^ i6;
                        i = ((iM55979 ^ i7) * 4313) ^ 1740473083;
                        i2 = 1195882767;
                        int i110 = iM55979 ^ i2;
                        sb2 = sb;
                        i10 = i110;
                        i9 = i;
                        abstractC17043M38682 = abstractC17044;
                    }
                    break;
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C24164 c24164 = null;
        String strM55744 = null;
        int i = -2108524802;
        int i2 = C0845.f81821;
        int i3 = C1053.f81965;
        int iM55979 = C0946.m55979("᩻۬") ^ i3;
        int i4 = ((iM55979 ^ i2) * 27447) ^ (-2101487508);
        int i5 = 1908078339;
        while (true) {
            i = ((((i ^ i2) * 11511) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1977324545:
                case 1558633038:
                    if (C0955.m56025()) {
                        iM55979 = C0946.m55979("᩸ܳ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-20415)) ^ 1408198413;
                        i5 = 845442877;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ܿܽ")) * 97;
                        i4 = ((iM55979 ^ i2) * 1205) ^ 1573173223;
                        i5 = -307329986;
                    }
                    break;
                case -1816505495:
                case 384241962:
                    if (C0898.m55800() <= 0) {
                        iM55979 = (C0946.m55979("᩺ۧ") + i3) * 65;
                        i4 = ((iM55979 ^ i2) * (-4703)) ^ 36044834;
                        i5 = 222264303;
                    } else {
                        iM55979 = C0873.m55680("ܽ֨") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-17265)) ^ 988618818;
                        i5 = 1223030718;
                    }
                    break;
                case -1577258809:
                case 2092513437:
                    if (C0906.m55809() <= 0) {
                        iM55979 = (C0873.m55680("ܰ᩷") + i3) * 43;
                        i4 = ((iM55979 ^ i2) * 22927) ^ 202765615;
                        i5 = -1657804356;
                    } else {
                        iM55979 = (i2 - C0873.m55680("ۙ᩵")) * (-101);
                        i4 = ((iM55979 ^ i3) * 25699) ^ 1936655526;
                        i5 = 266304475;
                    }
                    break;
                case -1552543678:
                case -573811895:
                    C0845.m55584();
                    iM55979 = (C0873.m55680("ܰ᩷") + i3) * 43;
                    i4 = ((iM55979 ^ i2) * 22927) ^ 202765615;
                    i5 = -1657804356;
                    break;
                case -1512537558:
                case -203003263:
                    RunnableC1014.m56173(this.f37586);
                    break;
                case -1129245185:
                case 348761780:
                    strM55744 = C0892.m55744(this.f37586);
                    if (C0946.m55980() != 0) {
                        iM55979 = C0946.m55979("᩸ܳ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-20415)) ^ 1408198413;
                        i5 = 845442877;
                    } else {
                        iM55979 = C0946.m55979("ۘ᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-4323)) ^ 1544829143;
                        i5 = -1987155962;
                    }
                    break;
                case -826127923:
                case 2141694744:
                    C0906.m55809();
                    if (!C1024.f81946) {
                        iM55979 = C0946.m55979("֨᩸") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-15927)) ^ 1725595844;
                        i5 = -829935174;
                    } else {
                        iM55979 = (C0873.m55680("ܰ᩷") + i3) * 43;
                        i4 = ((iM55979 ^ i2) * 22927) ^ 202765615;
                        i5 = -1657804356;
                    }
                    break;
                case -707141850:
                case 993868084:
                    if (C0854.f81826 != 0) {
                        iM55979 = C0946.m55979("֨᩸") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-15927)) ^ 1725595844;
                        i5 = -829935174;
                    } else {
                        iM55979 = (C0873.m55680("۫᩸") ^ i2) * (-71);
                        i4 = ((iM55979 ^ i3) * (-10633)) ^ (-966971480);
                        i5 = -49228835;
                    }
                    break;
                case -621881068:
                case -574783667:
                    if (C0947.m56001(c24164)) {
                        iM55979 = C0946.m55979("᩶᩸") ^ i2;
                        i4 = ((iM55979 ^ i3) * 19929) ^ (-452282414);
                        i5 = 1501483427;
                    } else {
                        iM55979 = C0946.m55979("ۙᩴ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-10117)) ^ 765648515;
                        i5 = -1997680020;
                    }
                    break;
                case -246877987:
                case 122209122:
                    if (C1017.m56187() <= 0) {
                        iM55979 = C0946.m55979("᩸ܳ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-20415)) ^ 1408198413;
                        i5 = 845442877;
                    } else {
                        iM55979 = (C0946.m55979("᩶ᩴ") ^ i3) * (-89);
                        i4 = ((iM55979 ^ i2) * (-25191)) ^ 853656657;
                        i5 = -1360123142;
                    }
                    break;
                case -93204765:
                case 1997383955:
                    if (C0930.f81879 <= 0) {
                        iM55979 = C0946.m55979("֨᩸") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-15927)) ^ 1725595844;
                        i5 = -829935174;
                    } else {
                        iM55979 = (C0873.m55680("᩵ۢ") ^ i2) * (-111);
                        i4 = ((iM55979 ^ i3) * 28977) ^ (-2062252911);
                        i5 = -2101504133;
                    }
                    break;
                case 133753284:
                case 1451958553:
                    C1229.m56410();
                    C0947.m55997();
                    break;
                case 283886891:
                case 1794289329:
                    if (C0898.f81858 <= 0) {
                        iM55979 = (C0873.m55680("ܰ᩷") + i3) * 43;
                        i4 = ((iM55979 ^ i2) * 22927) ^ 202765615;
                        i5 = -1657804356;
                    } else {
                        iM55979 = C0873.m55680("ۜۜ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 24129) ^ (-891755270);
                        i5 = 642457567;
                    }
                    break;
                case 305021294:
                case 841868577:
                    if (RunnableC0871.m55672() >= 0) {
                        iM55979 = (C0946.m55979("᩺ۧ") + i3) * 65;
                        i4 = ((iM55979 ^ i2) * (-4703)) ^ 36044834;
                        i5 = 222264303;
                    } else {
                        iM55979 = (C0873.m55680("ܰ᩷") + i3) * 43;
                        i4 = ((iM55979 ^ i2) * 22927) ^ 202765615;
                        i5 = -1657804356;
                    }
                    break;
                case 556255686:
                case 1091035642:
                    C1229.m56410();
                    if (C1229.f82066 >= 0) {
                        iM55979 = (C0873.m55680("ܰ᩷") + i3) * 43;
                        i4 = ((iM55979 ^ i2) * 22927) ^ 202765615;
                        i5 = -1657804356;
                    } else {
                        iM55979 = C0873.m55680("᩺ᩴ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 29603) ^ 39831456;
                        i5 = 1607483955;
                    }
                    break;
                case 688893656:
                case 1681577504:
                    if (C0930.m55885() <= 0) {
                        iM55979 = (C0873.m55680("ܰ᩷") + i3) * 43;
                        i4 = ((iM55979 ^ i2) * 22927) ^ 202765615;
                        i5 = -1657804356;
                    } else {
                        iM55979 = C0873.m55680("֫ۨ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 219) ^ 1747864841;
                        i5 = 1864366271;
                    }
                    break;
                case 1172694522:
                case 1964046504:
                    c24164 = this.f37592;
                    if (C1929.f83011 != 0) {
                        iM55979 = (C0946.m55979("᩺ۧ") + i3) * 65;
                        i4 = ((iM55979 ^ i2) * (-4703)) ^ 36044834;
                        i5 = 222264303;
                    } else {
                        iM55979 = C0946.m55979("ܳܿ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-30001)) ^ (-699295791);
                        i5 = -835911257;
                    }
                    break;
                default:
                    C1025.m56229(this.f37584, strM55744);
                    break;
            }
            return;
        }
    }
}
