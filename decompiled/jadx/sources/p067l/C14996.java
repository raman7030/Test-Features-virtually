package p067l;

import com.google.android.material.slider.BaseSlider;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۬ᩳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: L2RS */
/* JADX INFO: loaded from: classes4.dex */
public final class C14996 extends AbstractC9542 {

    /* JADX INFO: renamed from: ᩹۠ۜ, reason: not valid java name and contains not printable characters */
    private static final short[] f82191 = {8126, -22573, 17457, 18646, 7554, -8314, 14591, 12718, 16211, -12831, -10511, 8870, 26414, 26459, 26427, 26418, 26435, 26459, 26430, 26387, 26382, -4820, 2794, 1244};

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ Runnable f42839;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ AbstractC17043 f42840;

    /* JADX INFO: renamed from: ܳ */
    public C24164 f42841;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ C20521 f42842;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ AbstractActivityC5549 f42843;

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
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        int iM55979;
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
        int i10 = C0912.f81867;
        int i11 = C1036.f81953;
        int iM559710 = C0946.m55979("ۗۤ") ^ i11;
        int i12 = ((iM559710 ^ i10) * 15771) ^ (-1925508381);
        int i13 = iM559710 ^ (-1346899652);
        int iM559711 = 0;
        while (true) {
            int i14 = i13 ^ (i12 & (((i9 ^ i10) * (-21607)) >> 31));
            switch (i14) {
                case -2032425985:
                case -845405949:
                    i14 = i14;
                    i8 = 3;
                    if (C0947.f81895) {
                        iM55979 = C0873.m55680("ۛ۠") ^ i11;
                        i = ((iM55979 ^ i10) * (-28331)) ^ (-1089210212);
                        i2 = -1994759030;
                    } else {
                        iM55979 = C0946.m55979("۟᩵") ^ i11;
                        i = ((iM55979 ^ i10) * (-16673)) ^ (-2026603070);
                        i2 = -960019501;
                    }
                    int i15 = i14;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    i9 = i15;
                    break;
                case -1821987354:
                case -165090187:
                    i6 = 32219;
                    iM55979 = (i11 - C0873.m55680("ܿ᩺")) * 71;
                    i = ((iM55979 ^ i10) * 5079) ^ (-1407895848);
                    i2 = -111616494;
                    int i16 = i14;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    i9 = i16;
                    break;
                case -1635801442:
                case -242496874:
                    i14 = i14;
                    int i17 = s + s2;
                    if (i5 - (i17 * i17) >= 0) {
                        iM55979 = (C0946.m55979("᩸ܰ") + i11) * 19;
                        i = ((iM55979 ^ i10) * (-6537)) ^ (-1330248892);
                        i2 = 1408008233;
                    } else {
                        iM55979 = (i10 - C0873.m55680("ۜ֡")) * 89;
                        i = ((iM55979 ^ i11) * 13917) ^ 69064713;
                        i2 = 39639441;
                    }
                    int i18 = i14;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    i9 = i18;
                    break;
                case -1595157039:
                case 803773933:
                    C1025.m56230();
                    break;
                case -1556364074:
                case -1044224036:
                    i14 = i14;
                    i3 = s * s;
                    i4 = 4743684;
                    if (C1048.m56305() >= 0) {
                        iM55979 = C0873.m55680("᩸۠") ^ i10;
                        i = ((iM55979 ^ i11) * 24559) ^ (-676545403);
                        i2 = 898027216;
                    } else {
                        iM55979 = C0873.m55680("֫ۜ") ^ i11;
                        i = ((iM55979 ^ i10) * 9769) ^ 1363364870;
                        i2 = 1039106881;
                    }
                    int i19 = i14;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    i9 = i19;
                    break;
                case -1547874676:
                case -1299996470:
                    i14 = i14;
                    sArr2 = f82191;
                    i7 = 1;
                    if (C0894.m55769() >= 0) {
                        iM55979 = C0873.m55680("ۛ۠") ^ i11;
                        i = ((iM55979 ^ i10) * (-28331)) ^ (-1089210212);
                        i2 = -1994759030;
                    } else {
                        iM55979 = (C0873.m55680("ܶܳ") + i10) * (-57);
                        i = ((iM55979 ^ i11) * (-11969)) ^ 1596972642;
                        i2 = 708680436;
                    }
                    int i110 = i14;
                    i13 = iM55979 ^ i2;
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
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = (C0873.m55680("۠ܿ") ^ i10) * (-61);
                        i = ((iM55979 ^ i11) * (-22063)) ^ 2083190051;
                        i2 = 772977519;
                    } else {
                        iM55979 = (C0946.m55979("᩵֡") ^ i10) * 35;
                        i = ((iM55979 ^ i11) * 10071) ^ (-1041565576);
                        i2 = -1326584867;
                    }
                    int i111 = i14;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    i9 = i111;
                    break;
                case -1289504722:
                case 1984900652:
                    C0906.m55809();
                    if (C0927.f81875) {
                        i14 = i14;
                        iM55979 = C0873.m55680("ۛ۠") ^ i11;
                        i = ((iM55979 ^ i10) * (-28331)) ^ (-1089210212);
                        i2 = -1994759030;
                        int i112 = i14;
                        i13 = iM55979 ^ i2;
                        i12 = i;
                        i9 = i112;
                    }
                    i14 = i14;
                    iM55979 = (C0873.m55680("۠ܿ") ^ i10) * (-61);
                    i = ((iM55979 ^ i11) * (-22063)) ^ 2083190051;
                    i2 = 772977519;
                    int i113 = i14;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    i9 = i113;
                    break;
                case -1248494916:
                case -76505819:
                    C0927.m55868(this.f42839);
                    break;
                case -1213703310:
                case -236899004:
                    i14 = i14;
                    if (C1048.m56312(this.f42841)) {
                        iM55979 = (C0946.m55979("᩸۬") ^ i11) * (-121);
                        i = ((iM55979 ^ i10) * 24483) ^ (-2081135969);
                        i2 = 1145593499;
                    } else {
                        iM55979 = C0873.m55680("᩶ܳ") ^ i10;
                        i = ((iM55979 ^ i11) * (-22189)) ^ 302002674;
                        i2 = -529224091;
                    }
                    int i114 = i14;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    i9 = i114;
                    break;
                case -619965499:
                case 512637523:
                    i14 = i14;
                    int i20 = i3 + i4;
                    i5 = i20 + i20;
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = C0873.m55680("᩸۠") ^ i10;
                        i = ((iM55979 ^ i11) * 24559) ^ (-676545403);
                        i2 = 898027216;
                    } else {
                        iM55979 = (C0946.m55979("ܰܰ") ^ i11) * 9;
                        i = ((iM55979 ^ i10) * (-20811)) ^ (-2116246984);
                        i2 = -128167416;
                    }
                    int i115 = i14;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    i9 = i115;
                    break;
                case -611294858:
                case -193717803:
                    i14 = i14;
                    s = sArr[c];
                    if (C0845.f81821 >= 0) {
                        iM55979 = (C0873.m55680("۠ܿ") ^ i10) * (-61);
                        i = ((iM55979 ^ i11) * (-22063)) ^ 2083190051;
                        i2 = 772977519;
                    } else {
                        iM55979 = C0946.m55979("ۤۤ") ^ i10;
                        i = ((iM55979 ^ i11) * (-27969)) ^ (-277310795);
                        i2 = -2113380152;
                    }
                    int i116 = i14;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    i9 = i116;
                    break;
                case -572530500:
                case -364267310:
                    C0917.m55842(iM559711 ^ 2127183867);
                    if (C0930.f81879 <= 0) {
                        iM55979 = C0873.m55680("ᩴᩴ") ^ i10;
                        i14 = i14;
                        i = ((iM55979 ^ i11) * (-28411)) ^ 960190521;
                        i2 = 1814104313;
                    } else {
                        i14 = i14;
                        iM55979 = (i11 - C0873.m55680("۟֫")) * (-7);
                        i = ((iM55979 ^ i10) * (-26695)) ^ 1042988884;
                        i2 = 1421831428;
                    }
                    int i117 = i14;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    i9 = i117;
                    break;
                case -520937381:
                case 539265712:
                    i14 = i14;
                    iM559711 = C0946.m55979(C0930.m55893(sArr2, i7, i8, i6));
                    if (RunnableC0897.f81856) {
                        iM55979 = (i10 - C0946.m55979("۠ۗ")) * (-7);
                        i = ((iM55979 ^ i11) * 15793) ^ (-1928713522);
                        i2 = -818693529;
                    } else {
                        iM55979 = C0873.m55680("᩸۠") ^ i10;
                        i = ((iM55979 ^ i11) * 24559) ^ (-676545403);
                        i2 = 898027216;
                    }
                    int i118 = i14;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    i9 = i118;
                    break;
                case -430075211:
                case 644227440:
                    i14 = i14;
                    s2 = 2178;
                    if (C0917.f81868) {
                        iM55979 = C0873.m55680("᩸۠") ^ i10;
                        i = ((iM55979 ^ i11) * 24559) ^ (-676545403);
                        i2 = 898027216;
                    } else {
                        iM55979 = (C0873.m55680("ܶۨ") ^ i10) * 85;
                        i = ((iM55979 ^ i11) * (-18575)) ^ 1922848019;
                        i2 = 1940735944;
                    }
                    int i119 = i14;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    i9 = i119;
                    break;
                case -312317415:
                case -154232882:
                    C1028.m56247();
                    iM55979 = C0873.m55680("ᩴᩴ") ^ i10;
                    i14 = i14;
                    i = ((iM55979 ^ i11) * (-28411)) ^ 960190521;
                    i2 = 1814104313;
                    int i1110 = i14;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    i9 = i1110;
                    break;
                case 169903427:
                case 1230245316:
                    i14 = i14;
                    sArr = f82191;
                    if (C0955.f81898) {
                        iM55979 = C0873.m55680("᩹ۧ") ^ i11;
                        i = ((iM55979 ^ i10) * 9225) ^ (-939051065);
                        i2 = -2030377777;
                    } else {
                        iM55979 = C0946.m55979("᩹᩶") ^ i11;
                        i = ((iM55979 ^ i10) * 16195) ^ 1934400354;
                        i2 = -2048378016;
                    }
                    int i1111 = i14;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    i9 = i1111;
                    break;
                case 1149377951:
                case 1895154206:
                    i6 = 57164;
                    iM55979 = (i11 - C0873.m55680("ܿ᩺")) * 71;
                    i = ((iM55979 ^ i10) * 5079) ^ (-1407895848);
                    i2 = -111616494;
                    int i1112 = i14;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    i9 = i1112;
                    break;
                case 1612380500:
                case 2051464212:
                    C0930.m55885();
                    if (C0866.m55645()) {
                        i14 = i14;
                        iM55979 = (C0873.m55680("۠ܿ") ^ i10) * (-61);
                        i = ((iM55979 ^ i11) * (-22063)) ^ 2083190051;
                        i2 = 772977519;
                    } else {
                        iM55979 = C0873.m55680("ᩴᩴ") ^ i10;
                        i14 = i14;
                        i = ((iM55979 ^ i11) * (-28411)) ^ 960190521;
                        i2 = 1814104313;
                    }
                    int i1113 = i14;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    i9 = i1113;
                    break;
                default:
                    C1025.m56230();
                    if (C0873.f81841 > 0) {
                        i14 = i14;
                        iM55979 = C0873.m55680("᩹ۧ") ^ i11;
                        i = ((iM55979 ^ i10) * 9225) ^ (-939051065);
                        i2 = -2030377777;
                        int i1114 = i14;
                        i13 = iM55979 ^ i2;
                        i12 = i;
                        i9 = i1114;
                    }
                    i14 = i14;
                    iM55979 = (C0873.m55680("۠ܿ") ^ i10) * (-61);
                    i = ((iM55979 ^ i11) * (-22063)) ^ 2083190051;
                    i2 = 772977519;
                    int i1115 = i14;
                    i13 = iM55979 ^ i2;
                    i12 = i;
                    i9 = i1115;
                    break;
            }
            return;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        AbstractActivityC5549 abstractActivityC5549 = null;
        int i = 1134514070;
        int i2 = AbstractC0942.f81890;
        int i3 = C1028.f81950;
        int iM55979 = (i2 - C0946.m55979("᩷֡")) * (-13);
        int i4 = ((iM55979 ^ i3) * 26081) ^ 1094474426;
        int i5 = -1306782852;
        while (true) {
            i = ((((i ^ i3) * (-2139)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1982435997:
                case 731691943:
                    if (C0877.f81843 >= 0) {
                        iM55979 = C0873.m55680("ۚۛ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 19455) ^ (-1387624579);
                        i5 = -2133699408;
                    } else {
                        iM55979 = (C0873.m55680("ᩳۘ") + i2) * (-113);
                        i4 = ((iM55979 ^ i3) * 10843) ^ (-1328577418);
                        i5 = 1443195979;
                    }
                    break;
                case -1919653330:
                case 1213997540:
                    if (C0917.f81868) {
                        iM55979 = (C0946.m55979("᩹ܽ") + i2) * (-43);
                        i4 = ((iM55979 ^ i3) * (-17781)) ^ (-1040473500);
                        i5 = -1807315448;
                    } else {
                        iM55979 = (C0873.m55680("ۡܽ") ^ i2) * (-21);
                        i4 = ((iM55979 ^ i3) * 12229) ^ (-1127650514);
                        i5 = 704993542;
                    }
                    break;
                case -1915124598:
                case -347284877:
                    if (C0877.m55696()) {
                        iM55979 = (C0873.m55680("ۧᩴ") ^ i3) * (-117);
                        i4 = ((iM55979 ^ i2) * (-5713)) ^ (-1961662702);
                        i5 = -143738734;
                    } else {
                        iM55979 = (C0946.m55979("ᩳܿ") + i2) * 69;
                        i4 = ((iM55979 ^ i3) * 18743) ^ (-279396133);
                        i5 = 1319682522;
                    }
                    break;
                case -1749540288:
                case 782879772:
                    C1229.m56410();
                    if (C1071.f81975 > 0) {
                        iM55979 = (C0946.m55979("ᩳܿ") + i2) * 69;
                        i4 = ((iM55979 ^ i3) * 18743) ^ (-279396133);
                        i5 = 1319682522;
                    } else {
                        iM55979 = C0873.m55680("ۚۛ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 19455) ^ (-1387624579);
                        i5 = -2133699408;
                    }
                    break;
                case -1637236496:
                case 2054909050:
                    ServiceConnectionC1013.m56157();
                    break;
                case -1570624429:
                case -100033063:
                    if (C0845.f81821 >= 0) {
                        iM55979 = (C0946.m55979("᩹ܽ") + i2) * (-43);
                        i4 = ((iM55979 ^ i3) * (-17781)) ^ (-1040473500);
                        i5 = -1807315448;
                    } else {
                        iM55979 = C0873.m55680("᩹ܰ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 9773) ^ (-1936262441);
                        i5 = -347203300;
                    }
                    break;
                case -1525329407:
                case 585103776:
                    if (C1053.f81965 <= 0) {
                        iM55979 = C0873.m55680("ۚۛ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 19455) ^ (-1387624579);
                        i5 = -2133699408;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ۧۘ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM55979 ^ i2) * 26291) ^ 1221303707;
                        i5 = 451166168;
                    }
                    break;
                case -1396764563:
                case -460825669:
                    C0894.m55769();
                    C1025.m56230();
                    iM55979 = C0873.m55680("֡᩹") ^ i3;
                    i4 = ((iM55979 ^ i2) * (-29193)) ^ (-351093768);
                    i5 = -122666771;
                    break;
                case -1331087440:
                case -435435756:
                    C0890.m55740();
                    if (C1025.f81947 < 0) {
                        iM55979 = (C0946.m55979("᩹ܽ") + i2) * (-43);
                        i4 = ((iM55979 ^ i3) * (-17781)) ^ (-1040473500);
                        i5 = -1807315448;
                    } else {
                        iM55979 = C0873.m55680("֡᩹") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-29193)) ^ (-351093768);
                        i5 = -122666771;
                    }
                    break;
                case -838712045:
                case -194755955:
                    abstractActivityC5549 = this.f42843;
                    if (C0890.f81849 != 0) {
                        iM55979 = (i3 - C0946.m55979("֨᩶")) * (-69);
                        i4 = ((iM55979 ^ i2) * 32501) ^ 1960803834;
                        i5 = -803365747;
                    } else {
                        iM55979 = C0946.m55979("ۧۚ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-7039)) ^ (-1861730420);
                        i5 = 1763458613;
                    }
                    break;
                case -269743890:
                case 701238057:
                    if (C0890.f81849 != 0) {
                        iM55979 = C0873.m55680("֡᩹") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-29193)) ^ (-351093768);
                        i5 = -122666771;
                    } else {
                        iM55979 = C0946.m55979("ۜ᩻") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-27993)) ^ 1204869477;
                        i5 = -188199729;
                    }
                    break;
                case 264612355:
                case 1278525370:
                    C1044.m56272(abstractActivityC5549, exc, null);
                    break;
                case 310337777:
                case 1157126504:
                    if (C1003.f81929 <= 0) {
                        iM55979 = C0873.m55680("ۚۛ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 19455) ^ (-1387624579);
                        i5 = -2133699408;
                    } else {
                        iM55979 = C0873.m55680("֡᩹") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-29193)) ^ (-351093768);
                        i5 = -122666771;
                    }
                    break;
                case 437082876:
                case 842881954:
                    if (C1024.f81946) {
                        iM55979 = (C0946.m55979("ᩳܿ") + i2) * 69;
                        i4 = ((iM55979 ^ i3) * 18743) ^ (-279396133);
                        i5 = 1319682522;
                    } else {
                        iM55979 = (C0946.m55979("ܶ᩶") + i2) * (-127);
                        i4 = ((iM55979 ^ i3) * 12531) ^ 810711445;
                        i5 = 690668330;
                    }
                    break;
                case 536071424:
                case 1273328775:
                    if (C1124.f82007 >= 0) {
                        iM55979 = (C0946.m55979("ᩳܿ") + i2) * 69;
                        i4 = ((iM55979 ^ i3) * 18743) ^ (-279396133);
                        i5 = 1319682522;
                    } else {
                        iM55979 = C0873.m55680("۠᩹") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-14769)) ^ 1542802192;
                        i5 = -1009977987;
                    }
                    break;
                default:
                    if (C0967.f81910 >= 0) {
                        iM55979 = (C0946.m55979("ᩳܿ") + i2) * 69;
                        i4 = ((iM55979 ^ i3) * 18743) ^ (-279396133);
                        i5 = 1319682522;
                    } else {
                        iM55979 = C0946.m55979("ۙ۬") ^ i2;
                        i4 = ((iM55979 ^ i3) * 9617) ^ 1079897250;
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
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        /*
            Method dump skipped, instruction units count: 2556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C14996.mo3405():void");
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
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        int iM55680;
        int i;
        int i2;
        int i3 = AbstractC0942.f81890;
        int i4 = C1964.f83032;
        int iM55681 = C0873.m55680("ᩳۤ") ^ i3;
        int i5 = ((iM55681 ^ i4) * (-19393)) ^ (-916698727);
        Runnable runnable = null;
        String strM56180 = null;
        short[] sArr = null;
        int i6 = iM55681 ^ 472783910;
        C24164 c24164 = null;
        int i7 = 0;
        int iM55979 = 0;
        int i8 = 0;
        int iM55682 = 0;
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
                    iM55979 = C0946.m55979(C0845.m55592(sArr, i10, 3, i11));
                    i8 = 2102671063;
                    if (C0992.f81922 >= 0) {
                        iM55680 = (C0946.m55979("ۡᩳ") ^ i3) * (-3);
                        i = ((iM55680 ^ i4) * (-19407)) ^ 1335559508;
                        i2 = -1553016201;
                    } else {
                        iM55680 = (C0946.m55979("᩺֨") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM55680 ^ i4) * 11897) ^ 864242066;
                        i2 = 254217709;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -2044402182:
                case 929422502:
                    c24164.m53436(i7);
                    c24164.mo51883();
                    this.f42841 = c24164;
                    break;
                case -1553441877:
                case 466525513:
                    C0845.m55584();
                    iM55680 = (C0946.m55979("ۚۘ") + i3) * (-53);
                    i = ((iM55680 ^ i4) * (-4837)) ^ (-1647885949);
                    i2 = -674920358;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1380388372:
                case 1881157596:
                    AbstractC0942.m55971();
                    if (C0906.f81862 >= 0) {
                        iM55680 = (C0946.m55979("ۚۘ") + i3) * (-53);
                        i = ((iM55680 ^ i4) * (-4837)) ^ (-1647885949);
                        i2 = -674920358;
                    } else {
                        iM55680 = (i4 - C0873.m55680("ۖܶ")) * 27;
                        i = ((iM55680 ^ i3) * 13465) ^ (-2046774752);
                        i2 = -1256980264;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1155420246:
                case -649630127:
                    C1964.m56597();
                    C1036.m56257();
                    break;
                case -1103369732:
                case -791989734:
                    c24164.m53440(iM55979 ^ i8);
                    if (C1964.f83032 <= 0) {
                        iM55680 = (C0946.m55979("ۡᩳ") ^ i3) * (-3);
                        i = ((iM55680 ^ i4) * (-19407)) ^ 1335559508;
                        i2 = -1553016201;
                    } else {
                        iM55680 = (C0873.m55680("ᩳᩳ") + i4) * (-53);
                        i = ((iM55680 ^ i3) * (-6847)) ^ 1772751845;
                        i2 = 1022553370;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1043182494:
                case 1250404724:
                    s = f82191[4];
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = (C0946.m55979("ۡᩳ") ^ i3) * (-3);
                        i = ((iM55680 ^ i4) * (-19407)) ^ 1335559508;
                        i2 = -1553016201;
                    } else {
                        iM55680 = C0873.m55680("ۘۨ") ^ i4;
                        i = ((iM55680 ^ i3) * (-1249)) ^ 1509053973;
                        i2 = -570935543;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -899343713:
                case -171568297:
                    c24164.m53429(iM55682 ^ i9);
                    i7 = 0;
                    if (C0866.f81837 >= 0) {
                        iM55680 = (C0946.m55979("ۚۘ") + i3) * (-53);
                        i = ((iM55680 ^ i4) * (-4837)) ^ (-1647885949);
                        i2 = -674920358;
                    } else {
                        iM55680 = (i4 - C0946.m55979("ܺۖ")) * (-9);
                        i = ((iM55680 ^ i3) * 15787) ^ (-831099062);
                        i2 = 745079655;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -834297839:
                case 1248846180:
                    iM55682 = C0873.m55680(strM56180);
                    i9 = 2126743532;
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55680 = (C0873.m55680("۠۟") + i4) * (-93);
                        i = ((iM55680 ^ i3) * 2531) ^ 867607511;
                        i2 = 1845970586;
                    } else {
                        iM55680 = (i4 - C0946.m55979("᩷۠")) * (-51);
                        i = ((iM55680 ^ i3) * (-10953)) ^ (-1545743569);
                        i2 = -1314102523;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -798032805:
                case -659010288:
                    int i16 = s + s2;
                    if (i15 - (i16 * i16) >= 0) {
                        iM55680 = (i4 - C0873.m55680("֡۫")) * 5;
                        i = ((iM55680 ^ i3) * (-25371)) ^ (-824110028);
                        i2 = 1331955653;
                    } else {
                        iM55680 = C0873.m55680("ۨۤ") ^ i3;
                        i = ((iM55680 ^ i4) * (-16215)) ^ (-1089565004);
                        i2 = 963071361;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -544843733:
                case 1956759759:
                    c24164.mo51878(runnable);
                    sArr = f82191;
                    i10 = 5;
                    if (C1053.f81965 <= 0) {
                        iM55680 = (C0946.m55979("ۡᩳ") ^ i3) * (-3);
                        i = ((iM55680 ^ i4) * (-19407)) ^ 1335559508;
                        i2 = -1553016201;
                    } else {
                        iM55680 = C0873.m55680("ܳۧ") ^ i3;
                        i = ((iM55680 ^ i4) * 25319) ^ 2136990969;
                        i2 = 512343343;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -423554122:
                case 1875713790:
                    i11 = 49614;
                    iM55680 = C0873.m55680("ܶܿ") ^ i4;
                    i = ((iM55680 ^ i3) * 10377) ^ (-750483520);
                    i2 = 1543092389;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -400823558:
                case 648902527:
                    i12 = s * s;
                    i13 = 144576576;
                    if (C0854.f81826 != 0) {
                        iM55680 = (i3 - C0946.m55979("᩺ۜ")) * 37;
                        i = ((iM55680 ^ i4) * 24373) ^ 725008942;
                        i2 = -166776743;
                    } else {
                        iM55680 = (C0946.m55979("᩺ܽ") + i3) * 101;
                        i = ((iM55680 ^ i4) * (-10605)) ^ (-1357755414);
                        i2 = -731533634;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -341658565:
                case 235263740:
                    strM56180 = RunnableC1014.m56180(f82191, 8, 3, i11);
                    if (C1964.f83032 <= 0) {
                        iM55680 = (C0946.m55979("ۚۘ") + i3) * (-53);
                        i = ((iM55680 ^ i4) * (-4837)) ^ (-1647885949);
                        i2 = -674920358;
                    } else {
                        iM55680 = (C0873.m55680("ܺۡ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM55680 ^ i4) * 867) ^ 1698376286;
                        i2 = -969117666;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 36820348:
                case 1156303908:
                    if (ServiceConnectionC1013.m56157() > 0) {
                        iM55680 = (C0946.m55979("ۚۘ") + i3) * (-53);
                        i = ((iM55680 ^ i4) * (-4837)) ^ (-1647885949);
                        i2 = -674920358;
                    } else {
                        iM55680 = (i3 - C0946.m55979("᩺ۜ")) * 37;
                        i = ((iM55680 ^ i4) * 24373) ^ 725008942;
                        i2 = -166776743;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 284392544:
                case 1601045786:
                    if (C1404.f82149 >= 0) {
                        iM55680 = (i4 - C0873.m55680("ۖܶ")) * 27;
                        i = ((iM55680 ^ i3) * 13465) ^ (-2046774752);
                        i2 = -1256980264;
                    } else {
                        iM55680 = (C0873.m55680("۠۟") + i4) * (-93);
                        i = ((iM55680 ^ i3) * 2531) ^ 867607511;
                        i2 = 1845970586;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 652342846:
                case 1847220367:
                    c24164 = new C24164(this.f42843);
                    runnable = null;
                    if (C0892.f81851) {
                        iM55680 = (i4 - C0873.m55680("֡ܺ")) * (-91);
                        i = ((iM55680 ^ i3) * 18717) ^ (-1023467895);
                        i2 = 118193721;
                    } else {
                        iM55680 = (C0946.m55979("ۡᩳ") ^ i3) * (-3);
                        i = ((iM55680 ^ i4) * (-19407)) ^ 1335559508;
                        i2 = -1553016201;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 719979066:
                case 1108316312:
                    i11 = 18655;
                    iM55680 = C0873.m55680("ܶܿ") ^ i4;
                    i = ((iM55680 ^ i3) * 10377) ^ (-750483520);
                    i2 = 1543092389;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                default:
                    int i17 = i12 + i13;
                    i15 = i17 + i17;
                    s2 = 12024;
                    if (C0877.f81843 >= 0) {
                        iM55680 = (i4 - C0873.m55680("ۖܶ")) * 27;
                        i = ((iM55680 ^ i3) * 13465) ^ (-2046774752);
                        i2 = -1256980264;
                    } else {
                        iM55680 = C0873.m55680("ۘۡ") ^ i3;
                        i = ((iM55680 ^ i4) * (-19145)) ^ (-783466300);
                        i2 = -1911416422;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    public C14996(AbstractActivityC5549 abstractActivityC5549, AbstractC17043 abstractC17043, C20521 c20521, Runnable runnable) {
        int i = -1299258203;
        int i2 = C1071.f81975;
        int i3 = C1053.f81965;
        this.f42843 = abstractActivityC5549;
        this.f42840 = abstractC17043;
        this.f42842 = c20521;
        this.f42839 = runnable;
        int iM55979 = C0946.m55979("ۘۧ") ^ i3;
        int i4 = ((iM55979 ^ i2) * (-25343)) ^ 1447950595;
        int i5 = 992399561;
        while (true) {
            i = (iM55979 ^ i5) ^ (i4 & (((i ^ i2) * 31951) >> 31));
            switch (i) {
                case -2146897777:
                case 1318641685:
                    return;
                case -1816312580:
                case -1046078712:
                    if (C1036.m56257() <= 0) {
                        iM55979 = (C0946.m55979("ܶ᩺") ^ i2) * 27;
                        i4 = ((iM55979 ^ i3) * (-25459)) ^ (-2107103439);
                        i5 = 2066150601;
                    } else {
                        iM55979 = (C0946.m55979("ᩴܶ") + i2) * (-119);
                        i4 = ((iM55979 ^ i3) * 12069) ^ (-1769101192);
                        i5 = 1452223260;
                    }
                    break;
                case -1415200242:
                case -698612716:
                    RunnableC0871.m55672();
                    ViewOnClickListenerC0939.m55941();
                    throw new RuntimeException();
                case -865282776:
                case 2065590357:
                    C1124.m56367();
                    if (C0882.f81846) {
                        iM55979 = (C0946.m55979("ۖܺ") + i3) * (-123);
                        i4 = ((iM55979 ^ i2) * (-7507)) ^ (-1798976520);
                        i5 = 384365684;
                    } else {
                        iM55979 = (C0946.m55979("ܶ᩺") ^ i2) * 27;
                        i4 = ((iM55979 ^ i3) * (-25459)) ^ (-2107103439);
                        i5 = 2066150601;
                    }
                    break;
                case -711663016:
                case 1513679786:
                    ServiceConnectionC1013.m56157();
                    C1124.m56367();
                    iM55979 = (C0946.m55979("ᩴܶ") + i2) * (-119);
                    i4 = ((iM55979 ^ i3) * 12069) ^ (-1769101192);
                    i5 = 1452223260;
                    break;
                case 921001696:
                case 1855591525:
                    C1929.m56553();
                    if (C0937.f81884) {
                        iM55979 = C0873.m55680("ᩴ᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * 22371) ^ (-2032918920);
                        i5 = -506755594;
                    } else {
                        iM55979 = (C0946.m55979("ᩴܶ") + i2) * (-119);
                        i4 = ((iM55979 ^ i3) * 12069) ^ (-1769101192);
                        i5 = 1452223260;
                    }
                    break;
                default:
                    if (C0930.f81879 <= 0) {
                        iM55979 = C0946.m55979("ۛᩳ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-10823)) ^ 1622790637;
                        i5 = 1571117165;
                    } else {
                        iM55979 = C0873.m55680("ܰۤ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-6209)) ^ 1191945790;
                        i5 = 2059676809;
                    }
                    break;
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f42841.m53442();
    }
}
