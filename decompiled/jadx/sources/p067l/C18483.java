package p067l;

/* JADX INFO: renamed from: l.ܽ᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: R98C */
/* JADX INFO: loaded from: classes4.dex */
public final class C18483 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֡ᩴ᩺, reason: not valid java name and contains not printable characters */
    private static final short[] f82275 = {7397, 24155, 24149, 24137, 24190, 24145, 24157, 24149, 24075, 24131, 24147, 24152, 24149, 24157, 24149, 24131, 24075, 24134, 24065, 24182, 24153, 24156, 24149, 24158, 24145, 24157, 24149, 24075, 24155, 24149, 24149, 24128, 24166, 24065, 24163, 24153, 24151, 24158, 24145, 24132, 24133, 24130, 24149, 24180, 24145, 24132, 24145, 24075, 24171, 24173, 24077, 24092, 24080};

    /* JADX INFO: renamed from: ֫ */
    public final boolean f55214;

    /* JADX INFO: renamed from: ۧ */
    public final String f55215;

    /* JADX INFO: renamed from: ܽ */
    public final EnumC10104 f55216;

    /* JADX INFO: renamed from: ᩳ */
    public final String f55217;

    /* JADX WARN: Code duplicated, block: B:17:0x0078  */
    /* JADX WARN: Code duplicated, block: B:68:0x02ac A[PHI: r1 r2 r5 r11 r15 r25
      0x02ac: PHI (r1v27 l.ܽ᩺ܽ) = (r1v9 l.ܽ᩺ܽ), (r1v24 l.ܽ᩺ܽ), (r1v28 l.ܽ᩺ܽ) binds: [B:32:0x010d, B:67:0x02aa, B:59:0x0258] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r2v3 java.lang.Object[]) = (r2v1 java.lang.Object[]), (r2v2 java.lang.Object[]), (r2v1 java.lang.Object[]) binds: [B:32:0x010d, B:67:0x02aa, B:59:0x0258] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r5v2 int) = (r5v1 int), (r5v1 int), (r5v3 int) binds: [B:32:0x010d, B:67:0x02aa, B:59:0x0258] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r11v4 short[]) = (r11v3 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:32:0x010d, B:67:0x02aa, B:59:0x0258] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r15v4 int) = (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:32:0x010d, B:67:0x02aa, B:59:0x0258] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r25v3 java.lang.Boolean) = (r25v1 java.lang.Boolean), (r25v2 java.lang.Boolean), (r25v1 java.lang.Boolean) binds: [B:32:0x010d, B:67:0x02aa, B:59:0x0258] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x035f A[PHI: r1 r7 r13 r14 r16 r17 r18 r20
      0x035f: PHI (r1v43 l.ܽ᩺ܽ) = (r1v5 l.ܽ᩺ܽ), (r1v18 l.ܽ᩺ܽ), (r1v19 l.ܽ᩺ܽ), (r1v44 l.ܽ᩺ܽ) binds: [B:44:0x0197, B:82:0x035d, B:78:0x033b, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x035f: PHI (r7v5 java.lang.StringBuilder) = 
      (r7v2 java.lang.StringBuilder)
      (r7v1 java.lang.StringBuilder)
      (r7v1 java.lang.StringBuilder)
      (r7v1 java.lang.StringBuilder)
     binds: [B:44:0x0197, B:82:0x035d, B:78:0x033b, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x035f: PHI (r13v6 short[]) = (r13v3 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:44:0x0197, B:82:0x035d, B:78:0x033b, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x035f: PHI (r14v6 int) = (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:44:0x0197, B:82:0x035d, B:78:0x033b, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x035f: PHI (r16v6 int) = (r16v2 int), (r16v3 int), (r16v2 int), (r16v2 int) binds: [B:44:0x0197, B:82:0x035d, B:78:0x033b, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x035f: PHI (r17v6 int) = (r17v2 int), (r17v3 int), (r17v2 int), (r17v2 int) binds: [B:44:0x0197, B:82:0x035d, B:78:0x033b, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x035f: PHI (r18v6 int) = (r18v2 int), (r18v2 int), (r18v3 int), (r18v2 int) binds: [B:44:0x0197, B:82:0x035d, B:78:0x033b, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x035f: PHI (r20v6 short) = (r20v2 short), (r20v2 short), (r20v3 short), (r20v2 short) binds: [B:44:0x0197, B:82:0x035d, B:78:0x033b, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    public final String toString() {
        int iM55979;
        int i;
        int iM55680;
        int i2;
        int i3;
        String[] strArrM55948;
        C18483 c18483 = this;
        Object[] objArr = null;
        int i4 = 0;
        int i5 = 0;
        String strM55970 = null;
        StringBuilder sb = null;
        int i6 = 0;
        String strM56403 = null;
        String[] strArr = null;
        int i7 = -532903907;
        int i8 = C1071.f81975;
        int i9 = C1229.f82066;
        int iM559710 = C0946.m55979("ۧ᩹") ^ i8;
        int i10 = ((iM559710 ^ i9) * (-7915)) ^ (-1095740994);
        int i11 = iM559710 ^ (-807658184);
        String str = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        short s = 0;
        short s2 = 0;
        Boolean boolM56119 = null;
        while (true) {
            i7 = i11 ^ (i10 & (((i7 ^ i9) * 11489) >> 31));
            switch (i7) {
                case -2102861423:
                case 1336056438:
                    C0912.m55825(sb, RunnableC0897.m55783(f82275, 49, 1, i12));
                    return C0863.m55639(sb);
                case -1977581235:
                case -1654926950:
                    c18483 = c18483;
                    boolM56119 = C1003.m56119(c18483.f55214);
                    objArr = new Object[4];
                    if (C1964.f83032 <= 0) {
                        iM55680 = (C0946.m55979("ۚᩴ") + i8) * 109;
                        i2 = ((iM55680 ^ i9) * (-28685)) ^ (-1351852895);
                        i3 = -1435857485;
                    } else {
                        iM55680 = C0946.m55979("᩶ܶ") ^ i9;
                        i2 = ((iM55680 ^ i8) * 23575) ^ 774474857;
                        i3 = -2067988321;
                    }
                    i11 = iM55680 ^ i3;
                    c18483 = c18483;
                    i10 = i2;
                    break;
                case -1836501716:
                case -1783592679:
                    C0912.m55825(sb, strM56403);
                    C1028.m56245(sb, objArr[i6]);
                    if (i6 != strArr.length - i5) {
                        iM55979 = C0873.m55680("ܶۚ") ^ i9;
                        i10 = ((iM55979 ^ i8) * 17471) ^ (-1630425541);
                        i = -1460001807;
                    } else {
                        iM55979 = C0946.m55979("᩷ۗ") ^ i8;
                        i10 = ((iM55979 ^ i9) * (-12283)) ^ 1589310057;
                        i = 291366952;
                    }
                    i11 = iM55979 ^ i;
                    c18483 = this;
                    break;
                case -1754866683:
                case -454131874:
                    strArrM55948 = new String[i4];
                    strArr = strArrM55948;
                    iM55979 = C0946.m55979("۬۠") ^ i8;
                    i10 = ((iM55979 ^ i9) * (-8425)) ^ (-1802216780);
                    i = 635675684;
                    i11 = iM55979 ^ i;
                    c18483 = this;
                    break;
                case -1717954928:
                case 894369368:
                    c18483 = c18483;
                    String str2 = c18483.f55215;
                    if (C1017.m56187() <= 0) {
                        str = str2;
                        i4 = 0;
                        iM55680 = (C0873.m55680("ۖ֫") ^ i9) * 81;
                        i2 = ((iM55680 ^ i8) * 14485) ^ 713346158;
                        i3 = 752476959;
                        i11 = iM55680 ^ i3;
                        c18483 = c18483;
                        i10 = i2;
                    } else {
                        int iM55681 = C0873.m55680("ᩴ᩸") ^ i8;
                        str = str2;
                        c18483 = c18483;
                        i10 = ((iM55681 ^ i9) * 24635) ^ 990415753;
                        i11 = iM55681 ^ 2043701059;
                        i4 = 0;
                    }
                    break;
                case -1712534721:
                case 1600714503:
                    c18483 = c18483;
                    objArr[i4] = str;
                    i5 = 1;
                    objArr[1] = c18483.f55216;
                    if (C1929.f83011 != 0) {
                        iM55680 = (C0946.m55979("ۚᩴ") + i8) * 109;
                        i2 = ((iM55680 ^ i9) * (-28685)) ^ (-1351852895);
                        i3 = -1435857485;
                    } else {
                        iM55680 = C0946.m55979("۬ܽ") ^ i8;
                        i2 = ((iM55680 ^ i9) * 14901) ^ (-803974805);
                        i3 = 1541146856;
                    }
                    i11 = iM55680 ^ i3;
                    c18483 = c18483;
                    i10 = i2;
                    break;
                case -1657194778:
                case -34981719:
                    c18483 = c18483;
                    i15 = s * s;
                    i16 = 122279364;
                    if (C1053.f81965 <= 0) {
                        iM55680 = (C0946.m55979("ۗۘ") ^ i8) * (-19);
                        i2 = ((iM55680 ^ i9) * 5927) ^ (-1160417679);
                        i3 = 932053034;
                    } else {
                        iM55680 = C0946.m55979("ۙۧ") ^ i9;
                        i2 = ((iM55680 ^ i8) * (-31165)) ^ (-1970906659);
                        i3 = 1695869662;
                    }
                    i11 = iM55680 ^ i3;
                    c18483 = c18483;
                    i10 = i2;
                    break;
                case -1611978484:
                case -656434190:
                    strM56403 = C1229.m56403(sArr2, i14, 1, i12);
                    if (C1025.f81947 < 0) {
                        iM55979 = C0873.m55680("ܶܺ") ^ i9;
                        i10 = ((iM55979 ^ i8) * (-24727)) ^ 1141752142;
                        i = 608217754;
                        i11 = iM55979 ^ i;
                        c18483 = this;
                    } else {
                        c18483 = this;
                        iM55680 = (C0873.m55680("ۖ֫") ^ i9) * 81;
                        i2 = ((iM55680 ^ i8) * 14485) ^ 713346158;
                        i3 = 752476959;
                        i11 = iM55680 ^ i3;
                        c18483 = c18483;
                        i10 = i2;
                    }
                    break;
                case -1569531108:
                case 260009319:
                    i12 = 56279;
                    iM55680 = C0873.m55680("᩹ۘ") ^ i9;
                    i2 = ((iM55680 ^ i8) * 831) ^ 72898015;
                    i3 = 1003716469;
                    i11 = iM55680 ^ i3;
                    c18483 = c18483;
                    i10 = i2;
                    break;
                case -789786276:
                case 2103905273:
                    c18483 = this;
                    objArr[2] = c18483.f55217;
                    objArr[3] = boolM56119;
                    if (C1036.f81953 >= 0) {
                        iM55680 = (C0946.m55979("۬ۚ") ^ i9) * 55;
                        i2 = ((iM55680 ^ i8) * (-17059)) ^ 571300089;
                        i3 = -275862480;
                    } else {
                        iM55680 = C0946.m55979("᩹᩷") ^ i9;
                        i2 = ((iM55680 ^ i8) * 13033) ^ 932052796;
                        i3 = 1333462032;
                    }
                    i11 = iM55680 ^ i3;
                    c18483 = c18483;
                    i10 = i2;
                    break;
                case -737605855:
                case 2045942191:
                    if (C1044.f81959 >= 0) {
                        int iM559711 = (i8 - C0946.m55979("ܿᩳ")) * (-81);
                        i2 = ((iM559711 ^ i9) * (-2083)) ^ 1899398131;
                        i11 = iM559711 ^ (-1700803036);
                    } else {
                        c18483 = c18483;
                        iM55680 = (C0946.m55979("۬ۚ") ^ i9) * 55;
                        i2 = ((iM55680 ^ i8) * (-17059)) ^ 571300089;
                        i3 = -275862480;
                        i11 = iM55680 ^ i3;
                        c18483 = c18483;
                    }
                    i10 = i2;
                    break;
                case -723192649:
                case 559959889:
                    c18483 = c18483;
                    int i18 = i15 + i16;
                    i17 = i18 + i18;
                    s2 = 11058;
                    if (C1024.f81946) {
                        iM55680 = (C0946.m55979("ۗۘ") ^ i8) * (-19);
                        i2 = ((iM55680 ^ i9) * 5927) ^ (-1160417679);
                        i3 = 932053034;
                    } else {
                        iM55680 = (C0873.m55680("ܺۧ") ^ i8) * 59;
                        i2 = ((iM55680 ^ i9) * 12317) ^ 956651768;
                        i3 = -54967747;
                    }
                    i11 = iM55680 ^ i3;
                    c18483 = c18483;
                    i10 = i2;
                    break;
                case -719610625:
                case 61360757:
                    if (C0873.f81841 > 0) {
                        c18483 = c18483;
                        iM55680 = (C0873.m55680("ۖ֫") ^ i9) * 81;
                        i2 = ((iM55680 ^ i8) * 14485) ^ 713346158;
                        i3 = 752476959;
                        i11 = iM55680 ^ i3;
                        c18483 = c18483;
                        i10 = i2;
                    }
                    c18483 = c18483;
                    iM55680 = (C0946.m55979("ۗۘ") ^ i8) * (-19);
                    i2 = ((iM55680 ^ i9) * 5927) ^ (-1160417679);
                    i3 = 932053034;
                    i11 = iM55680 ^ i3;
                    c18483 = c18483;
                    i10 = i2;
                    break;
                case -543456624:
                case 1568295481:
                    strArrM55948 = ViewOnClickListenerC0939.m55948(strM55970, C1024.m56203(f82275, 47, 1, i12));
                    strArr = strArrM55948;
                    iM55979 = C0946.m55979("۬۠") ^ i8;
                    i10 = ((iM55979 ^ i9) * (-8425)) ^ (-1802216780);
                    i = 635675684;
                    i11 = iM55979 ^ i;
                    c18483 = this;
                    break;
                case -379112566:
                case 1618006573:
                    c18483 = c18483;
                    s = f82275[0];
                    if (C0861.f81831) {
                        iM55680 = C0873.m55680("ۗ᩶") ^ i8;
                        i2 = ((iM55680 ^ i9) * 28231) ^ (-116209273);
                        i3 = -1149106599;
                    } else {
                        iM55680 = (C0873.m55680("ۖ֫") ^ i9) * 81;
                        i2 = ((iM55680 ^ i8) * 14485) ^ 713346158;
                        i3 = 752476959;
                    }
                    i11 = iM55680 ^ i3;
                    c18483 = c18483;
                    i10 = i2;
                    break;
                case -319264716:
                case 420085970:
                    C1003.m56121(sb, C1404.m56462(f82275, 51, 2, i12));
                    iM55979 = C0946.m55979("᩷ۗ") ^ i8;
                    i10 = ((iM55979 ^ i9) * (-12283)) ^ 1589310057;
                    i = 291366952;
                    i11 = iM55979 ^ i;
                    c18483 = this;
                    break;
                case -24605111:
                case 408916020:
                    strM55970 = AbstractC0942.m55970(f82275, 1, 46, i12);
                    if (C0882.m55719(strM55970) == 0) {
                        iM55979 = C0873.m55680("ۨ᩵") ^ i8;
                        i10 = ((iM55979 ^ i9) * (-9969)) ^ 1059888333;
                        i = -1310854584;
                    } else {
                        iM55979 = C0873.m55680("۫᩸") ^ i9;
                        i10 = ((iM55979 ^ i8) * 27801) ^ (-246308109);
                        i = -326467693;
                    }
                    i11 = iM55979 ^ i;
                    c18483 = this;
                    break;
                case 56141712:
                case 1155887601:
                    sb = new StringBuilder();
                    sArr = f82275;
                    i13 = 48;
                    if (C0912.f81867 > 0) {
                        iM55979 = (i9 - C0946.m55979("ܳ᩹")) * (-77);
                        i10 = ((iM55979 ^ i8) * (-8483)) ^ 1835182266;
                        i = 961157654;
                        i11 = iM55979 ^ i;
                        c18483 = this;
                    } else {
                        c18483 = this;
                        iM55680 = (C0946.m55979("ۗۘ") ^ i8) * (-19);
                        i2 = ((iM55680 ^ i9) * 5927) ^ (-1160417679);
                        i3 = 932053034;
                        i11 = iM55680 ^ i3;
                        c18483 = c18483;
                        i10 = i2;
                    }
                    break;
                case 119319586:
                case 937758120:
                    i6++;
                    iM55979 = (i8 - C0873.m55680("ۘۚ")) * (-119);
                    i10 = ((iM55979 ^ i9) * 2987) ^ 1930719638;
                    i = -714282213;
                    i11 = iM55979 ^ i;
                    c18483 = this;
                    break;
                case 177483536:
                case 395358631:
                    C0906.m55809();
                    return null;
                case 295481442:
                case 1457673506:
                    c18483 = c18483;
                    int i19 = s + s2;
                    if ((i19 * i19) - i17 > 0) {
                        iM55680 = C0946.m55979("᩵᩻") ^ i8;
                        i2 = ((iM55680 ^ i9) * (-27171)) ^ (-254737402);
                        i3 = -2067117190;
                    } else {
                        iM55680 = C0873.m55680("᩵۫") ^ i9;
                        i2 = ((iM55680 ^ i8) * 7769) ^ 982795238;
                        i3 = -1576482025;
                    }
                    i11 = iM55680 ^ i3;
                    c18483 = c18483;
                    i10 = i2;
                    break;
                case 335230278:
                case 579544777:
                    i12 = 24112;
                    iM55680 = C0873.m55680("᩹ۘ") ^ i9;
                    i2 = ((iM55680 ^ i8) * 831) ^ 72898015;
                    i3 = 1003716469;
                    i11 = iM55680 ^ i3;
                    c18483 = c18483;
                    i10 = i2;
                    break;
                case 712878517:
                case 940905344:
                    if (i6 < strArr.length) {
                        iM55979 = (C0873.m55680("᩵۬") ^ i9) * (-3);
                        i10 = ((iM55979 ^ i8) * (-14875)) ^ 1055443118;
                        i = -1597301917;
                    } else {
                        iM55979 = C0873.m55680("ܺۖ") ^ i9;
                        i10 = ((iM55979 ^ i8) * 25529) ^ 1978547236;
                        i = 861454858;
                    }
                    i11 = iM55979 ^ i;
                    c18483 = this;
                    break;
                case 967124633:
                case 1612774765:
                    if (C0892.m55749()) {
                        c18483 = c18483;
                        iM55680 = (C0946.m55979("ۗۘ") ^ i8) * (-19);
                        i2 = ((iM55680 ^ i9) * 5927) ^ (-1160417679);
                        i3 = 932053034;
                        i11 = iM55680 ^ i3;
                        c18483 = c18483;
                    } else {
                        int iM559712 = (i8 - C0946.m55979("ܿᩳ")) * (-81);
                        i2 = ((iM559712 ^ i9) * (-2083)) ^ 1899398131;
                        i11 = iM559712 ^ (-1700803036);
                    }
                    i10 = i2;
                    break;
                case 1133894277:
                case 1485854104:
                    C6406.m14673(C18483.class, sb, C0949.m56016(sArr, i13, 1, i12));
                    i6 = i4;
                    iM55979 = (i8 - C0873.m55680("ۘۚ")) * (-119);
                    i10 = ((iM55979 ^ i9) * 2987) ^ 1930719638;
                    i = -714282213;
                    i11 = iM55979 ^ i;
                    c18483 = this;
                    break;
                case 1196517325:
                case 1257184883:
                    C0912.m55825(sb, strArr[i6]);
                    sArr2 = f82275;
                    i14 = 50;
                    if (C0854.f81826 == 0) {
                        iM55979 = (C0946.m55979("۠᩷") + i8) * (-11);
                        i10 = ((iM55979 ^ i9) * 14807) ^ (-1139647838);
                        i = -905442481;
                        i11 = iM55979 ^ i;
                        c18483 = this;
                    } else {
                        c18483 = this;
                        iM55680 = (C0946.m55979("ۚᩴ") + i8) * 109;
                        i2 = ((iM55680 ^ i9) * (-28685)) ^ (-1351852895);
                        i3 = -1435857485;
                        i11 = iM55680 ^ i3;
                        c18483 = c18483;
                        i10 = i2;
                    }
                    break;
                default:
                    C0898.m55800();
                    ViewOnClickListenerC0939.m55941();
                    c18483 = c18483;
                    iM55680 = (C0946.m55979("ۗۘ") ^ i8) * (-19);
                    i2 = ((iM55680 ^ i9) * 5927) ^ (-1160417679);
                    i3 = 932053034;
                    i11 = iM55680 ^ i3;
                    c18483 = c18483;
                    i10 = i2;
                    break;
            }
        }
    }

    public C18483(String str, EnumC10104 enumC10104, String str2, boolean z) {
        this.f55215 = str;
        this.f55216 = enumC10104;
        this.f55217 = str2;
        this.f55214 = z;
    }

    public final boolean equals(Object obj) {
        C18483 c18483 = null;
        int i = 1280119364;
        int i2 = C0863.f81833;
        int i3 = C0894.f81854;
        int iM55680 = (C0873.m55680("֨۬") ^ i2) * (-91);
        int i4 = ((iM55680 ^ i3) * 30987) ^ (-139983954);
        int i5 = -405290460;
        while (true) {
            i = ((((i ^ i3) * 21947) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2139264670:
                case 1247834839:
                    C0906.m55809();
                    return false;
                case -1959690369:
                case 794272740:
                    if (C1012.f81938 >= 0) {
                        iM55680 = (C0873.m55680("᩸ۡ") + i3) * 59;
                        i4 = ((iM55680 ^ i2) * 29665) ^ 418165640;
                        i5 = -1254733412;
                    } else {
                        iM55680 = (C0873.m55680("ۚۚ") + i3) * 23;
                        i4 = ((iM55680 ^ i2) * 3915) ^ 1420594973;
                        i5 = -963338537;
                    }
                    break;
                case -1899870386:
                case -1722549800:
                    C1124.m56367();
                    if (C0967.f81910 < 0) {
                        iM55680 = C0873.m55680("᩻۫") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-17121)) ^ 2009006185;
                        i5 = 298937309;
                    } else {
                        iM55680 = (C0873.m55680("᩷ۜ") + i2) * 47;
                        i4 = ((iM55680 ^ i3) * (-10003)) ^ 1896532625;
                        i5 = 1741356732;
                    }
                    break;
                case -1883059911:
                case -1209272432:
                    return false;
                case -1010298275:
                case 1867163203:
                    if (C1012.f81938 >= 0) {
                        iM55680 = C0873.m55680("᩻۫") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-17121)) ^ 2009006185;
                        i5 = 298937309;
                    } else {
                        iM55680 = (i3 - C0946.m55979("᩷۠")) * (-51);
                        i4 = ((iM55680 ^ i2) * (-24797)) ^ 827342323;
                        i5 = 1008542187;
                    }
                    break;
                case -776917925:
                case 842954660:
                    return true;
                case -646488673:
                case 1934143992:
                    if (C0845.f81821 >= 0) {
                        iM55680 = (C0873.m55680("᩸ۡ") + i3) * 59;
                        i4 = ((iM55680 ^ i2) * 29665) ^ 418165640;
                        i5 = -1254733412;
                    } else {
                        iM55680 = (C0946.m55979("᩵ۘ") ^ i2) * (-39);
                        i4 = ((iM55680 ^ i3) * (-12681)) ^ 1468109388;
                        i5 = 379158776;
                    }
                    break;
                case -437683252:
                case 1924943838:
                    if (C0946.m55980() != 0) {
                        iM55680 = (C0873.m55680("᩷ۜ") + i2) * 47;
                        i4 = ((iM55680 ^ i3) * (-10003)) ^ 1896532625;
                        i5 = 1741356732;
                    } else {
                        iM55680 = C0873.m55680("ۛ᩵") ^ i2;
                        i4 = ((iM55680 ^ i3) * 21625) ^ 1008563344;
                        i5 = 330492931;
                    }
                    break;
                case -436340491:
                case 777107962:
                    RunnableC1014.m56177();
                    if (C1028.f81950 > 0) {
                        iM55680 = C0873.m55680("ۛܿ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 12013) ^ (-395551062);
                        i5 = 338372469;
                    } else {
                        iM55680 = C0873.m55680("᩻۫") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-17121)) ^ 2009006185;
                        i5 = 298937309;
                    }
                    break;
                case -364366521:
                case 1457081268:
                    if (C1025.m56226(this.f55215, c18483.f55215)) {
                        iM55680 = C0946.m55979("֨ᩳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-25505)) ^ (-907553603);
                        i5 = -1695720003;
                    } else {
                        iM55680 = C0873.m55680("ۧ᩶") ^ i2;
                        i4 = ((iM55680 ^ i3) * 14075) ^ (-401486732);
                        i5 = -1758889385;
                    }
                    break;
                case -307848629:
                case 187325115:
                    if (C0890.m55740()) {
                        iM55680 = C0946.m55979("۟ܰ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 5451) ^ 1233213832;
                        i5 = -1814372273;
                    } else {
                        iM55680 = C0873.m55680("ۛܿ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 12013) ^ (-395551062);
                        i5 = 338372469;
                    }
                    break;
                case -201076634:
                case 1043883584:
                    C0946.m55980();
                    C0955.m56025();
                    iM55680 = (C0946.m55979("ۧܳ") + i3) * 53;
                    i4 = ((iM55680 ^ i2) * 14135) ^ 719735005;
                    i5 = 6724110;
                    break;
                case 64283871:
                case 395677983:
                    if (RunnableC0871.m55666(this.f55216, c18483.f55216)) {
                        iM55680 = (C0946.m55979("ܰۗ") + i2) * 65;
                        i4 = ((iM55680 ^ i3) * 5731) ^ 181249278;
                        i5 = 1942262027;
                    } else {
                        iM55680 = C0873.m55680("ۧ᩶") ^ i2;
                        i4 = ((iM55680 ^ i3) * 14075) ^ (-401486732);
                        i5 = -1758889385;
                    }
                    break;
                case 154735372:
                case 891159085:
                    C1025.m56230();
                    if (!RunnableC0897.f81856) {
                        iM55680 = (C0873.m55680("᩷ۜ") + i2) * 47;
                        i4 = ((iM55680 ^ i3) * (-10003)) ^ 1896532625;
                        i5 = 1741356732;
                    } else {
                        iM55680 = (C0946.m55979("ۧܳ") + i3) * 53;
                        i4 = ((iM55680 ^ i2) * 14135) ^ 719735005;
                        i5 = 6724110;
                    }
                    break;
                case 190398968:
                case 291414122:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = (C0873.m55680("᩷ۜ") + i2) * 47;
                        i4 = ((iM55680 ^ i3) * (-10003)) ^ 1896532625;
                        i5 = 1741356732;
                    } else {
                        iM55680 = (C0946.m55979("ۧۛ") + i3) * (-25);
                        i4 = ((iM55680 ^ i2) * (-13623)) ^ (-1564320149);
                        i5 = 1021090438;
                    }
                    break;
                case 196280892:
                case 334328461:
                    if (C0873.f81841 <= 0) {
                        iM55680 = C0873.m55680("᩻۫") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-17121)) ^ 2009006185;
                        i5 = 298937309;
                    } else {
                        iM55680 = (C0873.m55680("ۙ᩺") ^ i3) * 41;
                        i4 = ((iM55680 ^ i2) * (-22401)) ^ (-1411427904);
                        i5 = -269155931;
                    }
                    break;
                case 460215971:
                case 1698310992:
                    if (C1929.f83011 != 0) {
                        iM55680 = C0873.m55680("ۛܿ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 12013) ^ (-395551062);
                        i5 = 338372469;
                    } else {
                        iM55680 = C0873.m55680("۠۫") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-23527)) ^ 414927801;
                        i5 = -50142010;
                    }
                    break;
                case 540197795:
                case 1718215422:
                    if (RunnableC0871.m55666(this.f55217, c18483.f55217)) {
                        iM55680 = (i3 - C0873.m55680("ۡᩴ")) * (-97);
                        i4 = ((iM55680 ^ i2) * 21427) ^ (-926954418);
                        i5 = 1474212270;
                    } else {
                        iM55680 = C0873.m55680("ۧ᩶") ^ i2;
                        i4 = ((iM55680 ^ i3) * 14075) ^ (-401486732);
                        i5 = -1758889385;
                    }
                    break;
                case 571225930:
                case 1963129035:
                    if (C0854.f81826 != 0) {
                        iM55680 = C0873.m55680("᩻۫") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-17121)) ^ 2009006185;
                        i5 = 298937309;
                    } else {
                        iM55680 = C0946.m55979("֡ۚ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 12451) ^ (-2070317632);
                        i5 = -398288032;
                    }
                    break;
                case 794800154:
                case 1202240589:
                    if (C0873.f81841 <= 0) {
                        iM55680 = (C0873.m55680("᩸ۡ") + i3) * 59;
                        i4 = ((iM55680 ^ i2) * 29665) ^ 418165640;
                        i5 = -1254733412;
                    } else {
                        iM55680 = (i2 - C0873.m55680("ۙܽ")) * (-49);
                        i4 = ((iM55680 ^ i3) * (-3337)) ^ 1260643445;
                        i5 = 147670412;
                    }
                    break;
                case 871330975:
                case 2061854044:
                    if (obj instanceof C18483) {
                        iM55680 = C0946.m55979("ۛ۫") ^ i3;
                        i4 = ((iM55680 ^ i2) * 25977) ^ 415524748;
                        i5 = 1097452981;
                    } else {
                        iM55680 = C0873.m55680("ۧ᩶") ^ i2;
                        i4 = ((iM55680 ^ i3) * 14075) ^ (-401486732);
                        i5 = -1758889385;
                    }
                    break;
                default:
                    c18483 = (C18483) obj;
                    if (this.f55214 == c18483.f55214) {
                        iM55680 = (C0873.m55680("ۚ۠") + i2) * 73;
                        i4 = ((iM55680 ^ i3) * (-20703)) ^ (-2040651035);
                        i5 = -249784456;
                    } else {
                        iM55680 = C0873.m55680("ۧ᩶") ^ i2;
                        i4 = ((iM55680 ^ i3) * 14075) ^ (-401486732);
                        i5 = -1758889385;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x012e A[PHI: r6 r16
      0x012e: PHI (r6v4 java.lang.String) = (r6v3 java.lang.String), (r6v2 java.lang.String), (r6v2 java.lang.String), (r6v2 java.lang.String) binds: [B:38:0x012c, B:19:0x0089, B:17:0x0085, B:10:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x012e: PHI (r16v20 int) = (r16v11 int), (r16v15 int), (r16v17 int), (r16v21 int) binds: [B:38:0x012c, B:19:0x0089, B:17:0x0085, B:10:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x0164 A[PHI: r5 r9 r16
      0x0164: PHI (r5v4 int) = (r5v3 int), (r5v2 int) binds: [B:42:0x0162, B:6:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x0164: PHI (r9v3 int) = (r9v2 int), (r9v5 int) binds: [B:42:0x0162, B:6:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x0164: PHI (r16v23 int) = (r16v10 int), (r16v26 int) binds: [B:42:0x0162, B:6:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x01b6 A[PHI: r10 r11 r16
      0x01b6: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:50:0x01b4, B:46:0x0194, B:29:0x00cf, B:11:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x01b6: PHI (r11v4 int) = (r11v2 int), (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:50:0x01b4, B:46:0x0194, B:29:0x00cf, B:11:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x01b6: PHI (r16v19 int) = (r16v8 int), (r16v9 int), (r16v13 int), (r16v22 int) binds: [B:50:0x01b4, B:46:0x0194, B:29:0x00cf, B:11:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0208 A[PHI: r2 r4 r7 r8 r12 r16
      0x0208: PHI (r2v4 int) = (r2v3 int), (r2v2 int), (r2v2 int), (r2v2 int), (r2v2 int) binds: [B:58:0x0206, B:54:0x01e4, B:34:0x010a, B:25:0x00a9, B:17:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x0208: PHI (r4v4 int) = (r4v3 int), (r4v2 int), (r4v2 int), (r4v2 int), (r4v2 int) binds: [B:58:0x0206, B:54:0x01e4, B:34:0x010a, B:25:0x00a9, B:17:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x0208: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:58:0x0206, B:54:0x01e4, B:34:0x010a, B:25:0x00a9, B:17:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x0208: PHI (r8v4 l.۠ۧᩳ) = (r8v2 l.۠ۧᩳ), (r8v2 l.۠ۧᩳ), (r8v3 l.۠ۧᩳ), (r8v2 l.۠ۧᩳ), (r8v2 l.۠ۧᩳ) binds: [B:58:0x0206, B:54:0x01e4, B:34:0x010a, B:25:0x00a9, B:17:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x0208: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:58:0x0206, B:54:0x01e4, B:34:0x010a, B:25:0x00a9, B:17:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x0208: PHI (r16v16 int) = (r16v6 int), (r16v7 int), (r16v12 int), (r16v14 int), (r16v17 int) binds: [B:58:0x0206, B:54:0x01e4, B:34:0x010a, B:25:0x00a9, B:17:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iM55979;
        int i;
        int i2;
        int i3 = C1044.f81959;
        int i4 = C1964.f83032;
        int iM55680 = C0873.m55680("֡ܺ") ^ i3;
        int i5 = ((iM55680 ^ i4) * (-30261)) ^ 1497566437;
        String str = null;
        EnumC10104 enumC10104 = null;
        int i6 = iM55680 ^ 1593734499;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int iM49003 = 0;
        int iHashCode = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1514796893;
        while (true) {
            int i15 = i6 ^ (i5 & (((i14 ^ i4) * (-16135)) >> 31));
            switch (i15) {
                case -2077987062:
                case 1798760357:
                    i15 = i15;
                    i13 = i11 * i12;
                    if (C0906.f81862 >= 0) {
                        iM55979 = C0946.m55979("ۙۤ") ^ i4;
                        i = ((iM55979 ^ i3) * 9495) ^ 1213061542;
                        i2 = -1957383752;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ۖ۫")) * 41;
                        i = ((iM55979 ^ i4) * 31945) ^ (-1016239351);
                        i2 = -1167445312;
                    }
                    int i16 = i15;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i14 = i16;
                    break;
                case -1974967295:
                case -1134414034:
                    i8 = 1231;
                    iM55979 = C0873.m55680("ۘ᩹") ^ i4;
                    i = ((iM55979 ^ i3) * 5949) ^ (-2002248910);
                    i2 = 9393018;
                    int i17 = i15;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i14 = i17;
                    break;
                case -1753614460:
                case -369101998:
                    if (C1028.f81950 <= 0) {
                        i15 = i15;
                        iM55979 = C0873.m55680("ܰܶ") ^ i4;
                        i = ((iM55979 ^ i3) * (-9803)) ^ 2135321964;
                        i2 = -1808974979;
                    } else {
                        iM55979 = (C0946.m55979("ۘۨ") ^ i3) * 71;
                        i15 = i15;
                        i = ((iM55979 ^ i4) * 13125) ^ 320959495;
                        i2 = -1660593551;
                    }
                    int i18 = i15;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i14 = i18;
                    break;
                case -1580278888:
                case 696972245:
                    C0949.m56012();
                    C1124.m56367();
                    return 0;
                case -1408412969:
                case 1627485430:
                    i15 = i15;
                    str = this.f55215;
                    if (C0882.f81846) {
                        iM55979 = C0873.m55680("ܰܶ") ^ i4;
                        i = ((iM55979 ^ i3) * (-9803)) ^ 2135321964;
                        i2 = -1808974979;
                    } else {
                        iM55979 = (C0873.m55680("ۢܶ") + i3) * 53;
                        i = ((iM55979 ^ i4) * 31301) ^ 1725257748;
                        i2 = -869159692;
                    }
                    int i19 = i15;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i14 = i19;
                    break;
                case -1375062555:
                case 294461667:
                    C1194.m56396();
                    if (C1194.m56396() > 0) {
                        i15 = i15;
                        iM55979 = C0946.m55979("۟ᩴ") ^ i4;
                        i = ((iM55979 ^ i3) * 22535) ^ (-1141924108);
                        i2 = -602137916;
                        int i110 = i15;
                        i6 = iM55979 ^ i2;
                        i5 = i;
                        i14 = i110;
                    }
                    i15 = i15;
                    iM55979 = C0873.m55680("ܰܶ") ^ i4;
                    i = ((iM55979 ^ i3) * (-9803)) ^ 2135321964;
                    i2 = -1808974979;
                    int i111 = i15;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i14 = i111;
                    break;
                case -1327242822:
                case -878620849:
                    i15 = i15;
                    i10 = i8 * i9;
                    if (C1194.m56396() <= 0) {
                        iM55979 = (C0946.m55979("ܳۢ") + i3) * 67;
                        i = ((iM55979 ^ i4) * 30075) ^ (-536099308);
                        i2 = 505140368;
                    } else {
                        iM55979 = C0946.m55979("ᩴ֫") ^ i3;
                        i = ((iM55979 ^ i4) * (-9749)) ^ 1806712997;
                        i2 = -380019559;
                    }
                    int i112 = i15;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i14 = i112;
                    break;
                case -1302497077:
                case 125464530:
                    i15 = i15;
                    if (C0967.m56074()) {
                        iM55979 = C0946.m55979("۟ᩴ") ^ i4;
                        i = ((iM55979 ^ i3) * 22535) ^ (-1141924108);
                        i2 = -602137916;
                    } else {
                        iM55979 = C0946.m55979("֨᩵") ^ i3;
                        i = ((iM55979 ^ i4) * 6521) ^ (-1990182670);
                        i2 = -1718694831;
                    }
                    int i113 = i15;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i14 = i113;
                    break;
                case -1095275408:
                case 937562278:
                    i15 = i15;
                    RunnableC0897.m55784();
                    C1025.m56230();
                    iM55979 = C0873.m55680("ܰܶ") ^ i4;
                    i = ((iM55979 ^ i3) * (-9803)) ^ 2135321964;
                    i2 = -1808974979;
                    int i114 = i15;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i14 = i114;
                    break;
                case -1086139449:
                case -147197784:
                    i15 = i15;
                    iM49003 = C21720.m49003(i10, i7, str);
                    enumC10104 = this.f55216;
                    if (C0866.f81837 >= 0) {
                        iM55979 = C0946.m55979("ۙۤ") ^ i4;
                        i = ((iM55979 ^ i3) * 9495) ^ 1213061542;
                        i2 = -1957383752;
                    } else {
                        iM55979 = (i4 - C0946.m55979("ۛۙ")) * (-69);
                        i = ((iM55979 ^ i3) * (-13109)) ^ 871981387;
                        i2 = 27160802;
                    }
                    int i115 = i15;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i14 = i115;
                    break;
                case -970349082:
                case -950641963:
                    i15 = i15;
                    if (C1229.f82066 >= 0) {
                        iM55979 = C0946.m55979("ۙۤ") ^ i4;
                        i = ((iM55979 ^ i3) * 9495) ^ 1213061542;
                        i2 = -1957383752;
                    } else {
                        iM55979 = (C0873.m55680("ۘۚ") ^ i4) * 59;
                        i = ((iM55979 ^ i3) * (-28915)) ^ (-1175039170);
                        i2 = 1828605193;
                    }
                    int i116 = i15;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i14 = i116;
                    break;
                case -831635697:
                case 1220530970:
                    i8 = 1237;
                    iM55979 = C0873.m55680("ۘ᩹") ^ i4;
                    i = ((iM55979 ^ i3) * 5949) ^ (-2002248910);
                    i2 = 9393018;
                    int i117 = i15;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i14 = i117;
                    break;
                case -720575799:
                case 1282434825:
                    i15 = i15;
                    C1404.m56468();
                    if (C0937.f81884) {
                        iM55979 = C0946.m55979("ۙۤ") ^ i4;
                        i = ((iM55979 ^ i3) * 9495) ^ 1213061542;
                        i2 = -1957383752;
                    } else {
                        iM55979 = C0873.m55680("ܰܶ") ^ i4;
                        i = ((iM55979 ^ i3) * (-9803)) ^ 2135321964;
                        i2 = -1808974979;
                    }
                    int i118 = i15;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i14 = i118;
                    break;
                case -693776126:
                case 305705713:
                    i15 = i15;
                    if (this.f55214) {
                        iM55979 = (i3 - C0946.m55979("ۗۖ")) * 75;
                        i = ((iM55979 ^ i4) * 30137) ^ (-2065251137);
                        i2 = 2015788786;
                    } else {
                        iM55979 = (i4 - C0946.m55979("֫᩷")) * (-53);
                        i = ((iM55979 ^ i3) * 2935) ^ (-697878650);
                        i2 = -1869169401;
                    }
                    int i119 = i15;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i14 = i119;
                    break;
                case -543714615:
                case 166861056:
                    i15 = i15;
                    i11 = iHashCode + iM49003;
                    i12 = 31;
                    if (C0937.m55918() >= 0) {
                        iM55979 = C0946.m55979("۟ᩴ") ^ i4;
                        i = ((iM55979 ^ i3) * 22535) ^ (-1141924108);
                        i2 = -602137916;
                    } else {
                        iM55979 = C0873.m55680("ۛ۬") ^ i4;
                        i = ((iM55979 ^ i3) * 139) ^ (-331062143);
                        i2 = -1312312680;
                    }
                    int i1110 = i15;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i14 = i1110;
                    break;
                case -462848278:
                case 1813577147:
                    return C12826.hashCode(this.f55217) + i13;
                case 299177028:
                case 580011248:
                    i15 = i15;
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = C0946.m55979("۟ᩴ") ^ i4;
                        i = ((iM55979 ^ i3) * 22535) ^ (-1141924108);
                        i2 = -602137916;
                    } else {
                        iM55979 = (C0873.m55680("᩹ۨ") + i4) * (-113);
                        i = ((iM55979 ^ i3) * 31309) ^ (-244449397);
                        i2 = -2051061228;
                    }
                    int i1111 = i15;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i14 = i1111;
                    break;
                case 896318264:
                case 1850011576:
                    i15 = i15;
                    i7 = 31;
                    i9 = 31;
                    if (C1046.f81962 <= 0) {
                        iM55979 = C0946.m55979("ۙۤ") ^ i4;
                        i = ((iM55979 ^ i3) * 9495) ^ 1213061542;
                        i2 = -1957383752;
                    } else {
                        iM55979 = (C0946.m55979("ۡܽ") ^ i3) * 87;
                        i = ((iM55979 ^ i4) * (-18967)) ^ 1918827076;
                        i2 = -1860483238;
                    }
                    int i1112 = i15;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i14 = i1112;
                    break;
                default:
                    i15 = i15;
                    iHashCode = C12826.hashCode(enumC10104);
                    if (C1071.f81975 <= 0) {
                        iM55979 = (C0946.m55979("ܳۢ") + i3) * 67;
                        i = ((iM55979 ^ i4) * 30075) ^ (-536099308);
                        i2 = 505140368;
                    } else {
                        iM55979 = (i3 - C0946.m55979("֨᩹")) * (-77);
                        i = ((iM55979 ^ i4) * (-14861)) ^ (-2125928581);
                        i2 = 592430892;
                    }
                    int i1113 = i15;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i14 = i1113;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m42019() {
        return this.f55214;
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m42020() {
        return this.f55217;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m42021() {
        return this.f55215;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final EnumC10104 m42022() {
        return this.f55216;
    }
}
