package l;

import com.google.android.material.slider.BaseSlider;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۬ᩳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: L2RS */
/* JADX INFO: loaded from: classes4.dex */
public final class C13286 extends AbstractC7548 {

    /* JADX INFO: renamed from: ᩹۠ۜ, reason: not valid java name and contains not printable characters */
    private static final short[] f39771 = {8126, -22573, 17457, 18646, 7554, -8314, 14591, 12718, 16211, -12831, -10511, 8870, 26414, 26459, 26427, 26418, 26435, 26459, 26430, 26387, 26382, -4820, 2794, 1244};

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f39772;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f39773;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22933 f39774;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19099 f39775;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f39776;

    /* JADX WARN: Code duplicated, block: B:23:0x0076  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f7 A[PHI: r10 r11 r12 r16
      0x00f7: PHI (r10v3 short[]) = (r10v2 short[]), (r10v1 short[]), (r10v1 short[]) binds: [B:34:0x00f5, B:30:0x00d4, B:11:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r11v3 int) = (r11v2 int), (r11v1 int), (r11v1 int) binds: [B:34:0x00f5, B:30:0x00d4, B:11:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r12v3 int) = (r12v1 int), (r12v2 int), (r12v1 int) binds: [B:34:0x00f5, B:30:0x00d4, B:11:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r16v22 int) = (r16v16 int), (r16v17 int), (r16v23 int) binds: [B:34:0x00f5, B:30:0x00d4, B:11:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x0208 A[PHI: r5 r6 r7 r8 r16 r17
      0x0208: PHI (r5v3 int) = (r5v2 int), (r5v1 int), (r5v1 int), (r5v1 int) binds: [B:57:0x0206, B:53:0x01e1, B:49:0x01bf, B:26:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x0208: PHI (r6v3 int) = (r6v2 int), (r6v1 int), (r6v1 int), (r6v1 int) binds: [B:57:0x0206, B:53:0x01e1, B:49:0x01bf, B:26:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x0208: PHI (r7v3 int) = (r7v1 int), (r7v2 int), (r7v1 int), (r7v1 int) binds: [B:57:0x0206, B:53:0x01e1, B:49:0x01bf, B:26:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x0208: PHI (r8v3 short) = (r8v1 short), (r8v1 short), (r8v2 short), (r8v1 short) binds: [B:57:0x0206, B:53:0x01e1, B:49:0x01bf, B:26:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x0208: PHI (r16v18 int) = (r16v8 int), (r16v9 int), (r16v10 int), (r16v19 int) binds: [B:57:0x0206, B:53:0x01e1, B:49:0x01bf, B:26:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x0208: PHI (r17v2 int) = (r17v1 int), (r17v1 int), (r17v1 int), (r17v3 int) binds: [B:57:0x0206, B:53:0x01e1, B:49:0x01bf, B:26:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0256 A[PHI: r3 r4 r16
      0x0256: PHI (r3v3 char) = (r3v2 char), (r3v1 char), (r3v1 char) binds: [B:65:0x0254, B:61:0x0238, B:10:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x0256: PHI (r4v3 short) = (r4v1 short), (r4v2 short), (r4v1 short) binds: [B:65:0x0254, B:61:0x0238, B:10:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x0256: PHI (r16v24 int) = (r16v6 int), (r16v7 int), (r16v25 int) binds: [B:65:0x0254, B:61:0x0238, B:10:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        int iM6981;
        int i;
        int i2;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        short s2 = 0;
        int i6 = 0;
        short[] sArr2 = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = -1941025437;
        int i10 = C1420.f5096;
        int i11 = C3911.f12484;
        int iM6982 = C2105.m6981("ۗۤ") ^ i11;
        int i12 = ((iM6982 ^ i10) * 15771) ^ (-1925508381);
        int i13 = iM6982 ^ (-1346899652);
        int iM6983 = 0;
        while (true) {
            int i14 = i13 ^ (i12 & (((i9 ^ i10) * (-21607)) >> 31));
            switch (i14) {
                case -2032425985:
                case -845405949:
                    i14 = i14;
                    i8 = 3;
                    if (C2126.f7087) {
                        iM6981 = C0630.m2566("ۛ۠") ^ i11;
                        i = ((iM6981 ^ i10) * (-28331)) ^ (-1089210212);
                        i2 = -1994759030;
                    } else {
                        iM6981 = C2105.m6981("۟᩵") ^ i11;
                        i = ((iM6981 ^ i10) * (-16673)) ^ (-2026603070);
                        i2 = -960019501;
                    }
                    int i15 = i14;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    i9 = i15;
                    break;
                case -1821987354:
                case -165090187:
                    i6 = 32219;
                    iM6981 = (i11 - C0630.m2566("ܿ᩺")) * 71;
                    i = ((iM6981 ^ i10) * 5079) ^ (-1407895848);
                    i2 = -111616494;
                    int i16 = i14;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    i9 = i16;
                    break;
                case -1635801442:
                case -242496874:
                    i14 = i14;
                    int i17 = s + s2;
                    if (i5 - (i17 * i17) >= 0) {
                        iM6981 = (C2105.m6981("᩸ܰ") + i11) * 19;
                        i = ((iM6981 ^ i10) * (-6537)) ^ (-1330248892);
                        i2 = 1408008233;
                    } else {
                        iM6981 = (i10 - C0630.m2566("ۜ֡")) * 89;
                        i = ((iM6981 ^ i11) * 13917) ^ 69064713;
                        i2 = 39639441;
                    }
                    int i18 = i14;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    i9 = i18;
                    break;
                case -1595157039:
                case 803773933:
                    C3683.m11222();
                    break;
                case -1556364074:
                case -1044224036:
                    i14 = i14;
                    i3 = s * s;
                    i4 = 4743684;
                    if (C4159.m12565() >= 0) {
                        iM6981 = C0630.m2566("᩸۠") ^ i10;
                        i = ((iM6981 ^ i11) * 24559) ^ (-676545403);
                        i2 = 898027216;
                    } else {
                        iM6981 = C0630.m2566("֫ۜ") ^ i11;
                        i = ((iM6981 ^ i10) * 9769) ^ 1363364870;
                        i2 = 1039106881;
                    }
                    int i19 = i14;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    i9 = i19;
                    break;
                case -1547874676:
                case -1299996470:
                    i14 = i14;
                    sArr2 = f39771;
                    i7 = 1;
                    if (C1047.m3599() >= 0) {
                        iM6981 = C0630.m2566("ۛ۠") ^ i11;
                        i = ((iM6981 ^ i10) * (-28331)) ^ (-1089210212);
                        i2 = -1994759030;
                    } else {
                        iM6981 = (C0630.m2566("ܶܳ") + i10) * (-57);
                        i = ((iM6981 ^ i11) * (-11969)) ^ 1596972642;
                        i2 = 708680436;
                    }
                    int i110 = i14;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    i9 = i110;
                    break;
                case -1537588292:
                case -479407654:
                    break;
                case -1402606626:
                case 1661489768:
                    i14 = i14;
                    c = 0;
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = (C0630.m2566("۠ܿ") ^ i10) * (-61);
                        i = ((iM6981 ^ i11) * (-22063)) ^ 2083190051;
                        i2 = 772977519;
                    } else {
                        iM6981 = (C2105.m6981("᩵֡") ^ i10) * 35;
                        i = ((iM6981 ^ i11) * 10071) ^ (-1041565576);
                        i2 = -1326584867;
                    }
                    int i111 = i14;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    i9 = i111;
                    break;
                case -1289504722:
                case 1984900652:
                    C1294.m4372();
                    if (C1711.f5919) {
                        i14 = i14;
                        iM6981 = C0630.m2566("ۛ۠") ^ i11;
                        i = ((iM6981 ^ i10) * (-28331)) ^ (-1089210212);
                        i2 = -1994759030;
                        int i112 = i14;
                        i13 = iM6981 ^ i2;
                        i12 = i;
                        i9 = i112;
                    }
                    i14 = i14;
                    iM6981 = (C0630.m2566("۠ܿ") ^ i10) * (-61);
                    i = ((iM6981 ^ i11) * (-22063)) ^ 2083190051;
                    i2 = 772977519;
                    int i113 = i14;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    i9 = i113;
                    break;
                case -1248494916:
                case -76505819:
                    C1711.m5731(this.f39772);
                    break;
                case -1213703310:
                case -236899004:
                    i14 = i14;
                    if (C4159.m12572(this.f39774)) {
                        iM6981 = (C2105.m6981("᩸۬") ^ i11) * (-121);
                        i = ((iM6981 ^ i10) * 24483) ^ (-2081135969);
                        i2 = 1145593499;
                    } else {
                        iM6981 = C0630.m2566("᩶ܳ") ^ i10;
                        i = ((iM6981 ^ i11) * (-22189)) ^ 302002674;
                        i2 = -529224091;
                    }
                    int i114 = i14;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    i9 = i114;
                    break;
                case -619965499:
                case 512637523:
                    i14 = i14;
                    int i20 = i3 + i4;
                    i5 = i20 + i20;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = C0630.m2566("᩸۠") ^ i10;
                        i = ((iM6981 ^ i11) * 24559) ^ (-676545403);
                        i2 = 898027216;
                    } else {
                        iM6981 = (C2105.m6981("ܰܰ") ^ i11) * 9;
                        i = ((iM6981 ^ i10) * (-20811)) ^ (-2116246984);
                        i2 = -128167416;
                    }
                    int i115 = i14;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    i9 = i115;
                    break;
                case -611294858:
                case -193717803:
                    i14 = i14;
                    s = sArr[c];
                    if (C0050.f910 >= 0) {
                        iM6981 = (C0630.m2566("۠ܿ") ^ i10) * (-61);
                        i = ((iM6981 ^ i11) * (-22063)) ^ 2083190051;
                        i2 = 772977519;
                    } else {
                        iM6981 = C2105.m6981("ۤۤ") ^ i10;
                        i = ((iM6981 ^ i11) * (-27969)) ^ (-277310795);
                        i2 = -2113380152;
                    }
                    int i116 = i14;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    i9 = i116;
                    break;
                case -572530500:
                case -364267310:
                    C1504.m5167(iM6983 ^ 2127183867);
                    if (C1773.f6144 <= 0) {
                        iM6981 = C0630.m2566("ᩴᩴ") ^ i10;
                        i14 = i14;
                        i = ((iM6981 ^ i11) * (-28411)) ^ 960190521;
                        i2 = 1814104313;
                    } else {
                        i14 = i14;
                        iM6981 = (i11 - C0630.m2566("۟֫")) * (-7);
                        i = ((iM6981 ^ i10) * (-26695)) ^ 1042988884;
                        i2 = 1421831428;
                    }
                    int i117 = i14;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    i9 = i117;
                    break;
                case -520937381:
                case 539265712:
                    i14 = i14;
                    iM6983 = C2105.m6981(C1773.m5917(sArr2, i7, i8, i6));
                    if (RunnableC1108.f4040) {
                        iM6981 = (i10 - C2105.m6981("۠ۗ")) * (-7);
                        i = ((iM6981 ^ i11) * 15793) ^ (-1928713522);
                        i2 = -818693529;
                    } else {
                        iM6981 = C0630.m2566("᩸۠") ^ i10;
                        i = ((iM6981 ^ i11) * 24559) ^ (-676545403);
                        i2 = 898027216;
                    }
                    int i118 = i14;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    i9 = i118;
                    break;
                case -430075211:
                case 644227440:
                    i14 = i14;
                    s2 = 2178;
                    if (C1504.f5354) {
                        iM6981 = C0630.m2566("᩸۠") ^ i10;
                        i = ((iM6981 ^ i11) * 24559) ^ (-676545403);
                        i2 = 898027216;
                    } else {
                        iM6981 = (C0630.m2566("ܶۨ") ^ i10) * 85;
                        i = ((iM6981 ^ i11) * (-18575)) ^ 1922848019;
                        i2 = 1940735944;
                    }
                    int i119 = i14;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    i9 = i119;
                    break;
                case -312317415:
                case -154232882:
                    C3746.m11369();
                    iM6981 = C0630.m2566("ᩴᩴ") ^ i10;
                    i14 = i14;
                    i = ((iM6981 ^ i11) * (-28411)) ^ 960190521;
                    i2 = 1814104313;
                    int i1110 = i14;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    i9 = i1110;
                    break;
                case 169903427:
                case 1230245316:
                    i14 = i14;
                    sArr = f39771;
                    if (C2272.f7362) {
                        iM6981 = C0630.m2566("᩹ۧ") ^ i11;
                        i = ((iM6981 ^ i10) * 9225) ^ (-939051065);
                        i2 = -2030377777;
                    } else {
                        iM6981 = C2105.m6981("᩹᩶") ^ i11;
                        i = ((iM6981 ^ i10) * 16195) ^ 1934400354;
                        i2 = -2048378016;
                    }
                    int i1111 = i14;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    i9 = i1111;
                    break;
                case 1149377951:
                case 1895154206:
                    i6 = 57164;
                    iM6981 = (i11 - C0630.m2566("ܿ᩺")) * 71;
                    i = ((iM6981 ^ i10) * 5079) ^ (-1407895848);
                    i2 = -111616494;
                    int i1112 = i14;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    i9 = i1112;
                    break;
                case 1612380500:
                case 2051464212:
                    C1773.m5908();
                    if (C0483.m2121()) {
                        i14 = i14;
                        iM6981 = (C0630.m2566("۠ܿ") ^ i10) * (-61);
                        i = ((iM6981 ^ i11) * (-22063)) ^ 2083190051;
                        i2 = 772977519;
                    } else {
                        iM6981 = C0630.m2566("ᩴᩴ") ^ i10;
                        i14 = i14;
                        i = ((iM6981 ^ i11) * (-28411)) ^ 960190521;
                        i2 = 1814104313;
                    }
                    int i1113 = i14;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    i9 = i1113;
                    break;
                default:
                    C3683.m11222();
                    if (C0630.f2410 > 0) {
                        i14 = i14;
                        iM6981 = C0630.m2566("᩹ۧ") ^ i11;
                        i = ((iM6981 ^ i10) * 9225) ^ (-939051065);
                        i2 = -2030377777;
                        int i1114 = i14;
                        i13 = iM6981 ^ i2;
                        i12 = i;
                        i9 = i1114;
                    }
                    i14 = i14;
                    iM6981 = (C0630.m2566("۠ܿ") ^ i10) * (-61);
                    i = ((iM6981 ^ i11) * (-22063)) ^ 2083190051;
                    i2 = 772977519;
                    int i1115 = i14;
                    i13 = iM6981 ^ i2;
                    i12 = i;
                    i9 = i1115;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        AbstractActivityC3346 abstractActivityC3346 = null;
        int i = 1134514070;
        int i2 = AbstractC2021.f6743;
        int i3 = C3746.f11829;
        int iM6981 = (i2 - C2105.m6981("᩷֡")) * (-13);
        int i4 = ((iM6981 ^ i3) * 26081) ^ 1094474426;
        int i5 = -1306782852;
        while (true) {
            i = ((((i ^ i3) * (-2139)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -1982435997:
                case 731691943:
                    if (C0714.f2697 >= 0) {
                        iM6981 = C0630.m2566("ۚۛ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 19455) ^ (-1387624579);
                        i5 = -2133699408;
                    } else {
                        iM6981 = (C0630.m2566("ᩳۘ") + i2) * (-113);
                        i4 = ((iM6981 ^ i3) * 10843) ^ (-1328577418);
                        i5 = 1443195979;
                    }
                    break;
                case -1919653330:
                case 1213997540:
                    if (C1504.f5354) {
                        iM6981 = (C2105.m6981("᩹ܽ") + i2) * (-43);
                        i4 = ((iM6981 ^ i3) * (-17781)) ^ (-1040473500);
                        i5 = -1807315448;
                    } else {
                        iM6981 = (C0630.m2566("ۡܽ") ^ i2) * (-21);
                        i4 = ((iM6981 ^ i3) * 12229) ^ (-1127650514);
                        i5 = 704993542;
                    }
                    break;
                case -1915124598:
                case -347284877:
                    if (C0714.m2805()) {
                        iM6981 = (C0630.m2566("ۧᩴ") ^ i3) * (-117);
                        i4 = ((iM6981 ^ i2) * (-5713)) ^ (-1961662702);
                        i5 = -143738734;
                    } else {
                        iM6981 = (C2105.m6981("ᩳܿ") + i2) * 69;
                        i4 = ((iM6981 ^ i3) * 18743) ^ (-279396133);
                        i5 = 1319682522;
                    }
                    break;
                case -1749540288:
                case 782879772:
                    C7811.m20844();
                    if (C4616.f14690 > 0) {
                        iM6981 = (C2105.m6981("ᩳܿ") + i2) * 69;
                        i4 = ((iM6981 ^ i3) * 18743) ^ (-279396133);
                        i5 = 1319682522;
                    } else {
                        iM6981 = C0630.m2566("ۚۛ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 19455) ^ (-1387624579);
                        i5 = -2133699408;
                    }
                    break;
                case -1637236496:
                case 2054909050:
                    ServiceConnectionC3453.m10564();
                    break;
                case -1570624429:
                case -100033063:
                    if (C0050.f910 >= 0) {
                        iM6981 = (C2105.m6981("᩹ܽ") + i2) * (-43);
                        i4 = ((iM6981 ^ i3) * (-17781)) ^ (-1040473500);
                        i5 = -1807315448;
                    } else {
                        iM6981 = C0630.m2566("᩹ܰ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 9773) ^ (-1936262441);
                        i5 = -347203300;
                    }
                    break;
                case -1525329407:
                case 585103776:
                    if (C4263.f13799 <= 0) {
                        iM6981 = C0630.m2566("ۚۛ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 19455) ^ (-1387624579);
                        i5 = -2133699408;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ۧۘ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM6981 ^ i2) * 26291) ^ 1221303707;
                        i5 = 451166168;
                    }
                    break;
                case -1396764563:
                case -460825669:
                    C1047.m3599();
                    C3683.m11222();
                    iM6981 = C0630.m2566("֡᩹") ^ i3;
                    i4 = ((iM6981 ^ i2) * (-29193)) ^ (-351093768);
                    i5 = -122666771;
                    break;
                case -1331087440:
                case -435435756:
                    C0964.m3413();
                    if (C3683.f11629 < 0) {
                        iM6981 = (C2105.m6981("᩹ܽ") + i2) * (-43);
                        i4 = ((iM6981 ^ i3) * (-17781)) ^ (-1040473500);
                        i5 = -1807315448;
                    } else {
                        iM6981 = C0630.m2566("֡᩹") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-29193)) ^ (-351093768);
                        i5 = -122666771;
                    }
                    break;
                case -838712045:
                case -194755955:
                    abstractActivityC3346 = this.f39776;
                    if (C0964.f3626 != 0) {
                        iM6981 = (i3 - C2105.m6981("֨᩶")) * (-69);
                        i4 = ((iM6981 ^ i2) * 32501) ^ 1960803834;
                        i5 = -803365747;
                    } else {
                        iM6981 = C2105.m6981("ۧۚ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-7039)) ^ (-1861730420);
                        i5 = 1763458613;
                    }
                    break;
                case -269743890:
                case 701238057:
                    if (C0964.f3626 != 0) {
                        iM6981 = C0630.m2566("֡᩹") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-29193)) ^ (-351093768);
                        i5 = -122666771;
                    } else {
                        iM6981 = C2105.m6981("ۜ᩻") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-27993)) ^ 1204869477;
                        i5 = -188199729;
                    }
                    break;
                case 264612355:
                case 1278525370:
                    C4075.m12246(abstractActivityC3346, exc, null);
                    break;
                case 310337777:
                case 1157126504:
                    if (C3245.f10203 <= 0) {
                        iM6981 = C0630.m2566("ۚۛ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 19455) ^ (-1387624579);
                        i5 = -2133699408;
                    } else {
                        iM6981 = C0630.m2566("֡᩹") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-29193)) ^ (-351093768);
                        i5 = -122666771;
                    }
                    break;
                case 437082876:
                case 842881954:
                    if (C3663.f11553) {
                        iM6981 = (C2105.m6981("ᩳܿ") + i2) * 69;
                        i4 = ((iM6981 ^ i3) * 18743) ^ (-279396133);
                        i5 = 1319682522;
                    } else {
                        iM6981 = (C2105.m6981("ܶ᩶") + i2) * (-127);
                        i4 = ((iM6981 ^ i3) * 12531) ^ 810711445;
                        i5 = 690668330;
                    }
                    break;
                case 536071424:
                case 1273328775:
                    if (C5695.f17556 >= 0) {
                        iM6981 = (C2105.m6981("ᩳܿ") + i2) * 69;
                        i4 = ((iM6981 ^ i3) * 18743) ^ (-279396133);
                        i5 = 1319682522;
                    } else {
                        iM6981 = C0630.m2566("۠᩹") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-14769)) ^ 1542802192;
                        i5 = -1009977987;
                    }
                    break;
                default:
                    if (C2520.f8000 >= 0) {
                        iM6981 = (C2105.m6981("ᩳܿ") + i2) * 69;
                        i4 = ((iM6981 ^ i3) * 18743) ^ (-279396133);
                        i5 = 1319682522;
                    } else {
                        iM6981 = C2105.m6981("ۙ۬") ^ i2;
                        i4 = ((iM6981 ^ i3) * 9617) ^ 1079897250;
                        i5 = 1230608816;
                    }
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 25561. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        /*
            Method dump skipped, instruction units count: 2556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13286.mo1009():void");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b9 A[PHI: r8 r9
      0x00b9: PHI (r8v4 int) = (r8v3 int), (r8v2 int) binds: [B:27:0x00b7, B:9:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x00b9: PHI (r9v4 int) = (r9v3 int), (r9v2 int) binds: [B:27:0x00b7, B:9:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00f6 A[PHI: r4 r7
      0x00f6: PHI (r4v4 int) = (r4v2 int), (r4v3 int), (r4v2 int), (r4v2 int), (r4v2 int) binds: [B:31:0x00f4, B:23:0x0093, B:17:0x0076, B:15:0x0072, B:12:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x00f6: PHI (r7v5 java.lang.String) = 
      (r7v4 java.lang.String)
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
     binds: [B:31:0x00f4, B:23:0x0093, B:17:0x0076, B:15:0x0072, B:12:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0212 A[PHI: r14 r22
      0x0212: PHI (r14v3 short) = (r14v2 short), (r14v2 short), (r14v5 short) binds: [B:15:0x0072, B:9:0x0061, B:6:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0212: PHI (r22v4 int) = (r22v3 int), (r22v3 int), (r22v6 int) binds: [B:15:0x0072, B:9:0x0061, B:6:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0248 A[PHI: r16 r17
      0x0248: PHI (r16v4 int) = (r16v3 int), (r16v2 int) binds: [B:60:0x0246, B:12:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0248: PHI (r17v4 int) = (r17v3 int), (r17v2 int) binds: [B:60:0x0246, B:12:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x027f A[PHI: r2 r3 r5 r6 r10 r11 r12
      0x027f: PHI (r2v4 l.᩺ۤܿ) = (r2v2 l.᩺ۤܿ), (r2v3 l.᩺ۤܿ), (r2v2 l.᩺ۤܿ), (r2v2 l.᩺ۤܿ), (r2v2 l.᩺ۤܿ) binds: [B:64:0x027d, B:47:0x019f, B:43:0x017b, B:39:0x0157, B:35:0x012d] A[DONT_GENERATE, DONT_INLINE]
      0x027f: PHI (r3v4 java.lang.Runnable) = 
      (r3v2 java.lang.Runnable)
      (r3v3 java.lang.Runnable)
      (r3v2 java.lang.Runnable)
      (r3v2 java.lang.Runnable)
      (r3v2 java.lang.Runnable)
     binds: [B:64:0x027d, B:47:0x019f, B:43:0x017b, B:39:0x0157, B:35:0x012d] A[DONT_GENERATE, DONT_INLINE]
      0x027f: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:64:0x027d, B:47:0x019f, B:43:0x017b, B:39:0x0157, B:35:0x012d] A[DONT_GENERATE, DONT_INLINE]
      0x027f: PHI (r6v4 int) = (r6v2 int), (r6v2 int), (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:64:0x027d, B:47:0x019f, B:43:0x017b, B:39:0x0157, B:35:0x012d] A[DONT_GENERATE, DONT_INLINE]
      0x027f: PHI (r10v5 short) = (r10v4 short), (r10v2 short), (r10v2 short), (r10v2 short), (r10v2 short) binds: [B:64:0x027d, B:47:0x019f, B:43:0x017b, B:39:0x0157, B:35:0x012d] A[DONT_GENERATE, DONT_INLINE]
      0x027f: PHI (r11v4 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v3 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:64:0x027d, B:47:0x019f, B:43:0x017b, B:39:0x0157, B:35:0x012d] A[DONT_GENERATE, DONT_INLINE]
      0x027f: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:64:0x027d, B:47:0x019f, B:43:0x017b, B:39:0x0157, B:35:0x012d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        int iM2566;
        int i;
        int i2;
        int i3 = AbstractC2021.f6743;
        int i4 = C22628.f73083;
        int iM2567 = C0630.m2566("ᩳۤ") ^ i3;
        int i5 = ((iM2567 ^ i4) * (-19393)) ^ (-916698727);
        Runnable runnable = null;
        String strM10633 = null;
        short[] sArr = null;
        int i6 = iM2567 ^ 472783910;
        C22933 c22933 = null;
        int i7 = 0;
        int iM6981 = 0;
        int i8 = 0;
        int iM2568 = 0;
        int i9 = 0;
        short s = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 297907456;
        int i15 = 0;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i4) * (-22921)) >> 31));
            switch (i14) {
                case -2070820371:
                case 1210307768:
                    iM6981 = C2105.m6981(C0050.m948(sArr, i10, 3, i11));
                    i8 = 2102671063;
                    if (C3019.f9544 >= 0) {
                        iM2566 = (C2105.m6981("ۡᩳ") ^ i3) * (-3);
                        i = ((iM2566 ^ i4) * (-19407)) ^ 1335559508;
                        i2 = -1553016201;
                    } else {
                        iM2566 = (C2105.m6981("᩺֨") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM2566 ^ i4) * 11897) ^ 864242066;
                        i2 = 254217709;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -2044402182:
                case 929422502:
                    c22933.m51045(i7);
                    c22933.mo49547();
                    this.f39774 = c22933;
                    break;
                case -1553441877:
                case 466525513:
                    C0050.m940();
                    iM2566 = (C2105.m6981("ۚۘ") + i3) * (-53);
                    i = ((iM2566 ^ i4) * (-4837)) ^ (-1647885949);
                    i2 = -674920358;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1380388372:
                case 1881157596:
                    AbstractC2021.m6574();
                    if (C1294.f4556 >= 0) {
                        iM2566 = (C2105.m6981("ۚۘ") + i3) * (-53);
                        i = ((iM2566 ^ i4) * (-4837)) ^ (-1647885949);
                        i2 = -674920358;
                    } else {
                        iM2566 = (i4 - C0630.m2566("ۖܶ")) * 27;
                        i = ((iM2566 ^ i3) * 13465) ^ (-2046774752);
                        i2 = -1256980264;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1155420246:
                case -649630127:
                    C22628.m50615();
                    C3911.m11924();
                    break;
                case -1103369732:
                case -791989734:
                    c22933.m51049(iM6981 ^ i8);
                    if (C22628.f73083 <= 0) {
                        iM2566 = (C2105.m6981("ۡᩳ") ^ i3) * (-3);
                        i = ((iM2566 ^ i4) * (-19407)) ^ 1335559508;
                        i2 = -1553016201;
                    } else {
                        iM2566 = (C0630.m2566("ᩳᩳ") + i4) * (-53);
                        i = ((iM2566 ^ i3) * (-6847)) ^ 1772751845;
                        i2 = 1022553370;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1043182494:
                case 1250404724:
                    s = f39771[4];
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = (C2105.m6981("ۡᩳ") ^ i3) * (-3);
                        i = ((iM2566 ^ i4) * (-19407)) ^ 1335559508;
                        i2 = -1553016201;
                    } else {
                        iM2566 = C0630.m2566("ۘۨ") ^ i4;
                        i = ((iM2566 ^ i3) * (-1249)) ^ 1509053973;
                        i2 = -570935543;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -899343713:
                case -171568297:
                    c22933.m51038(iM2568 ^ i9);
                    i7 = 0;
                    if (C0483.f2088 >= 0) {
                        iM2566 = (C2105.m6981("ۚۘ") + i3) * (-53);
                        i = ((iM2566 ^ i4) * (-4837)) ^ (-1647885949);
                        i2 = -674920358;
                    } else {
                        iM2566 = (i4 - C2105.m6981("ܺۖ")) * (-9);
                        i = ((iM2566 ^ i3) * 15787) ^ (-831099062);
                        i2 = 745079655;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -834297839:
                case 1248846180:
                    iM2568 = C0630.m2566(strM10633);
                    i9 = 2126743532;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = (C0630.m2566("۠۟") + i4) * (-93);
                        i = ((iM2566 ^ i3) * 2531) ^ 867607511;
                        i2 = 1845970586;
                    } else {
                        iM2566 = (i4 - C2105.m6981("᩷۠")) * (-51);
                        i = ((iM2566 ^ i3) * (-10953)) ^ (-1545743569);
                        i2 = -1314102523;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -798032805:
                case -659010288:
                    int i16 = s + s2;
                    if (i15 - (i16 * i16) >= 0) {
                        iM2566 = (i4 - C0630.m2566("֡۫")) * 5;
                        i = ((iM2566 ^ i3) * (-25371)) ^ (-824110028);
                        i2 = 1331955653;
                    } else {
                        iM2566 = C0630.m2566("ۨۤ") ^ i3;
                        i = ((iM2566 ^ i4) * (-16215)) ^ (-1089565004);
                        i2 = 963071361;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -544843733:
                case 1956759759:
                    c22933.mo49542(runnable);
                    sArr = f39771;
                    i10 = 5;
                    if (C4263.f13799 <= 0) {
                        iM2566 = (C2105.m6981("ۡᩳ") ^ i3) * (-3);
                        i = ((iM2566 ^ i4) * (-19407)) ^ 1335559508;
                        i2 = -1553016201;
                    } else {
                        iM2566 = C0630.m2566("ܳۧ") ^ i3;
                        i = ((iM2566 ^ i4) * 25319) ^ 2136990969;
                        i2 = 512343343;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -423554122:
                case 1875713790:
                    i11 = 49614;
                    iM2566 = C0630.m2566("ܶܿ") ^ i4;
                    i = ((iM2566 ^ i3) * 10377) ^ (-750483520);
                    i2 = 1543092389;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -400823558:
                case 648902527:
                    i12 = s * s;
                    i13 = 144576576;
                    if (C0237.f1507 != 0) {
                        iM2566 = (i3 - C2105.m6981("᩺ۜ")) * 37;
                        i = ((iM2566 ^ i4) * 24373) ^ 725008942;
                        i2 = -166776743;
                    } else {
                        iM2566 = (C2105.m6981("᩺ܽ") + i3) * 101;
                        i = ((iM2566 ^ i4) * (-10605)) ^ (-1357755414);
                        i2 = -731533634;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -341658565:
                case 235263740:
                    strM10633 = RunnableC3474.m10633(f39771, 8, 3, i11);
                    if (C22628.f73083 <= 0) {
                        iM2566 = (C2105.m6981("ۚۘ") + i3) * (-53);
                        i = ((iM2566 ^ i4) * (-4837)) ^ (-1647885949);
                        i2 = -674920358;
                    } else {
                        iM2566 = (C0630.m2566("ܺۡ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM2566 ^ i4) * 867) ^ 1698376286;
                        i2 = -969117666;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 36820348:
                case 1156303908:
                    if (ServiceConnectionC3453.m10564() > 0) {
                        iM2566 = (C2105.m6981("ۚۘ") + i3) * (-53);
                        i = ((iM2566 ^ i4) * (-4837)) ^ (-1647885949);
                        i2 = -674920358;
                    } else {
                        iM2566 = (i3 - C2105.m6981("᩺ۜ")) * 37;
                        i = ((iM2566 ^ i4) * 24373) ^ 725008942;
                        i2 = -166776743;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 284392544:
                case 1601045786:
                    if (C11340.f33930 >= 0) {
                        iM2566 = (i4 - C0630.m2566("ۖܶ")) * 27;
                        i = ((iM2566 ^ i3) * 13465) ^ (-2046774752);
                        i2 = -1256980264;
                    } else {
                        iM2566 = (C0630.m2566("۠۟") + i4) * (-93);
                        i = ((iM2566 ^ i3) * 2531) ^ 867607511;
                        i2 = 1845970586;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 652342846:
                case 1847220367:
                    c22933 = new C22933(this.f39776);
                    runnable = null;
                    if (C1005.f3721) {
                        iM2566 = (i4 - C0630.m2566("֡ܺ")) * (-91);
                        i = ((iM2566 ^ i3) * 18717) ^ (-1023467895);
                        i2 = 118193721;
                    } else {
                        iM2566 = (C2105.m6981("ۡᩳ") ^ i3) * (-3);
                        i = ((iM2566 ^ i4) * (-19407)) ^ 1335559508;
                        i2 = -1553016201;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 719979066:
                case 1108316312:
                    i11 = 18655;
                    iM2566 = C0630.m2566("ܶܿ") ^ i4;
                    i = ((iM2566 ^ i3) * 10377) ^ (-750483520);
                    i2 = 1543092389;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                default:
                    int i17 = i12 + i13;
                    i15 = i17 + i17;
                    s2 = 12024;
                    if (C0714.f2697 >= 0) {
                        iM2566 = (i4 - C0630.m2566("ۖܶ")) * 27;
                        i = ((iM2566 ^ i3) * 13465) ^ (-2046774752);
                        i2 = -1256980264;
                    } else {
                        iM2566 = C0630.m2566("ۘۡ") ^ i3;
                        i = ((iM2566 ^ i4) * (-19145)) ^ (-783466300);
                        i2 = -1911416422;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    public C13286(AbstractActivityC3346 abstractActivityC3346, AbstractC15440 abstractC15440, C19099 c19099, Runnable runnable) {
        int i = -1299258203;
        int i2 = C4616.f14690;
        int i3 = C4263.f13799;
        this.f39776 = abstractActivityC3346;
        this.f39773 = abstractC15440;
        this.f39775 = c19099;
        this.f39772 = runnable;
        int iM6981 = C2105.m6981("ۘۧ") ^ i3;
        int i4 = ((iM6981 ^ i2) * (-25343)) ^ 1447950595;
        int i5 = 992399561;
        while (true) {
            i = (iM6981 ^ i5) ^ (i4 & (((i ^ i2) * 31951) >> 31));
            switch (i) {
                case -2146897777:
                case 1318641685:
                    return;
                case -1816312580:
                case -1046078712:
                    if (C3911.m11924() <= 0) {
                        iM6981 = (C2105.m6981("ܶ᩺") ^ i2) * 27;
                        i4 = ((iM6981 ^ i3) * (-25459)) ^ (-2107103439);
                        i5 = 2066150601;
                    } else {
                        iM6981 = (C2105.m6981("ᩴܶ") + i2) * (-119);
                        i4 = ((iM6981 ^ i3) * 12069) ^ (-1769101192);
                        i5 = 1452223260;
                    }
                    break;
                case -1415200242:
                case -698612716:
                    RunnableC0588.m2441();
                    ViewOnClickListenerC1958.m6429();
                    throw new RuntimeException();
                case -865282776:
                case 2065590357:
                    C5695.m16023();
                    if (C0798.f2919) {
                        iM6981 = (C2105.m6981("ۖܺ") + i3) * (-123);
                        i4 = ((iM6981 ^ i2) * (-7507)) ^ (-1798976520);
                        i5 = 384365684;
                    } else {
                        iM6981 = (C2105.m6981("ܶ᩺") ^ i2) * 27;
                        i4 = ((iM6981 ^ i3) * (-25459)) ^ (-2107103439);
                        i5 = 2066150601;
                    }
                    break;
                case -711663016:
                case 1513679786:
                    ServiceConnectionC3453.m10564();
                    C5695.m16023();
                    iM6981 = (C2105.m6981("ᩴܶ") + i2) * (-119);
                    i4 = ((iM6981 ^ i3) * 12069) ^ (-1769101192);
                    i5 = 1452223260;
                    break;
                case 921001696:
                case 1855591525:
                    C21923.m49329();
                    if (C1916.f6442) {
                        iM6981 = C0630.m2566("ᩴ᩺") ^ i3;
                        i4 = ((iM6981 ^ i2) * 22371) ^ (-2032918920);
                        i5 = -506755594;
                    } else {
                        iM6981 = (C2105.m6981("ᩴܶ") + i2) * (-119);
                        i4 = ((iM6981 ^ i3) * 12069) ^ (-1769101192);
                        i5 = 1452223260;
                    }
                    break;
                default:
                    if (C1773.f6144 <= 0) {
                        iM6981 = C2105.m6981("ۛᩳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-10823)) ^ 1622790637;
                        i5 = 1571117165;
                    } else {
                        iM6981 = C0630.m2566("ܰۤ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-6209)) ^ 1191945790;
                        i5 = 2059676809;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        this.f39774.m51051();
    }
}
