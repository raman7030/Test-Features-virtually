package l;

/* JADX INFO: renamed from: l.ܽ᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: R98C */
/* JADX INFO: loaded from: classes4.dex */
public final class C16955 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֡ᩴ᩺, reason: not valid java name and contains not printable characters */
    private static final short[] f52033 = {7397, 24155, 24149, 24137, 24190, 24145, 24157, 24149, 24075, 24131, 24147, 24152, 24149, 24157, 24149, 24131, 24075, 24134, 24065, 24182, 24153, 24156, 24149, 24158, 24145, 24157, 24149, 24075, 24155, 24149, 24149, 24128, 24166, 24065, 24163, 24153, 24151, 24158, 24145, 24132, 24133, 24130, 24149, 24180, 24145, 24132, 24145, 24075, 24171, 24173, 24077, 24092, 24080};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f52034;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f52035;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC8139 f52036;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f52037;

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
        int iM6981;
        int i;
        int iM2566;
        int i2;
        int i3;
        String[] strArrM6436;
        C16955 c16955 = this;
        Object[] objArr = null;
        int i4 = 0;
        int i5 = 0;
        String strM6573 = null;
        StringBuilder sb = null;
        int i6 = 0;
        String strM20837 = null;
        String[] strArr = null;
        int i7 = -532903907;
        int i8 = C4616.f14690;
        int i9 = C7811.f24123;
        int iM6982 = C2105.m6981("ۧ᩹") ^ i8;
        int i10 = ((iM6982 ^ i9) * (-7915)) ^ (-1095740994);
        int i11 = iM6982 ^ (-807658184);
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
        Boolean boolM9921 = null;
        while (true) {
            i7 = i11 ^ (i10 & (((i7 ^ i9) * 11489) >> 31));
            switch (i7) {
                case -2102861423:
                case 1336056438:
                    C1420.m4905(sb, RunnableC1108.m3789(f52033, 49, 1, i12));
                    return C0422.m1959(sb);
                case -1977581235:
                case -1654926950:
                    c16955 = c16955;
                    boolM9921 = C3245.m9921(c16955.f52034);
                    objArr = new Object[4];
                    if (C22628.f73083 <= 0) {
                        iM2566 = (C2105.m6981("ۚᩴ") + i8) * 109;
                        i2 = ((iM2566 ^ i9) * (-28685)) ^ (-1351852895);
                        i3 = -1435857485;
                    } else {
                        iM2566 = C2105.m6981("᩶ܶ") ^ i9;
                        i2 = ((iM2566 ^ i8) * 23575) ^ 774474857;
                        i3 = -2067988321;
                    }
                    i11 = iM2566 ^ i3;
                    c16955 = c16955;
                    i10 = i2;
                    break;
                case -1836501716:
                case -1783592679:
                    C1420.m4905(sb, strM20837);
                    C3746.m11367(sb, objArr[i6]);
                    if (i6 != strArr.length - i5) {
                        iM6981 = C0630.m2566("ܶۚ") ^ i9;
                        i10 = ((iM6981 ^ i8) * 17471) ^ (-1630425541);
                        i = -1460001807;
                    } else {
                        iM6981 = C2105.m6981("᩷ۗ") ^ i8;
                        i10 = ((iM6981 ^ i9) * (-12283)) ^ 1589310057;
                        i = 291366952;
                    }
                    i11 = iM6981 ^ i;
                    c16955 = this;
                    break;
                case -1754866683:
                case -454131874:
                    strArrM6436 = new String[i4];
                    strArr = strArrM6436;
                    iM6981 = C2105.m6981("۬۠") ^ i8;
                    i10 = ((iM6981 ^ i9) * (-8425)) ^ (-1802216780);
                    i = 635675684;
                    i11 = iM6981 ^ i;
                    c16955 = this;
                    break;
                case -1717954928:
                case 894369368:
                    c16955 = c16955;
                    String str2 = c16955.f52035;
                    if (C3537.m10746() <= 0) {
                        str = str2;
                        i4 = 0;
                        iM2566 = (C0630.m2566("ۖ֫") ^ i9) * 81;
                        i2 = ((iM2566 ^ i8) * 14485) ^ 713346158;
                        i3 = 752476959;
                        i11 = iM2566 ^ i3;
                        c16955 = c16955;
                        i10 = i2;
                    } else {
                        int iM2567 = C0630.m2566("ᩴ᩸") ^ i8;
                        str = str2;
                        c16955 = c16955;
                        i10 = ((iM2567 ^ i9) * 24635) ^ 990415753;
                        i11 = iM2567 ^ 2043701059;
                        i4 = 0;
                    }
                    break;
                case -1712534721:
                case 1600714503:
                    c16955 = c16955;
                    objArr[i4] = str;
                    i5 = 1;
                    objArr[1] = c16955.f52036;
                    if (C21923.f70183 != 0) {
                        iM2566 = (C2105.m6981("ۚᩴ") + i8) * 109;
                        i2 = ((iM2566 ^ i9) * (-28685)) ^ (-1351852895);
                        i3 = -1435857485;
                    } else {
                        iM2566 = C2105.m6981("۬ܽ") ^ i8;
                        i2 = ((iM2566 ^ i9) * 14901) ^ (-803974805);
                        i3 = 1541146856;
                    }
                    i11 = iM2566 ^ i3;
                    c16955 = c16955;
                    i10 = i2;
                    break;
                case -1657194778:
                case -34981719:
                    c16955 = c16955;
                    i15 = s * s;
                    i16 = 122279364;
                    if (C4263.f13799 <= 0) {
                        iM2566 = (C2105.m6981("ۗۘ") ^ i8) * (-19);
                        i2 = ((iM2566 ^ i9) * 5927) ^ (-1160417679);
                        i3 = 932053034;
                    } else {
                        iM2566 = C2105.m6981("ۙۧ") ^ i9;
                        i2 = ((iM2566 ^ i8) * (-31165)) ^ (-1970906659);
                        i3 = 1695869662;
                    }
                    i11 = iM2566 ^ i3;
                    c16955 = c16955;
                    i10 = i2;
                    break;
                case -1611978484:
                case -656434190:
                    strM20837 = C7811.m20837(sArr2, i14, 1, i12);
                    if (C3683.f11629 < 0) {
                        iM6981 = C0630.m2566("ܶܺ") ^ i9;
                        i10 = ((iM6981 ^ i8) * (-24727)) ^ 1141752142;
                        i = 608217754;
                        i11 = iM6981 ^ i;
                        c16955 = this;
                    } else {
                        c16955 = this;
                        iM2566 = (C0630.m2566("ۖ֫") ^ i9) * 81;
                        i2 = ((iM2566 ^ i8) * 14485) ^ 713346158;
                        i3 = 752476959;
                        i11 = iM2566 ^ i3;
                        c16955 = c16955;
                        i10 = i2;
                    }
                    break;
                case -1569531108:
                case 260009319:
                    i12 = 56279;
                    iM2566 = C0630.m2566("᩹ۘ") ^ i9;
                    i2 = ((iM2566 ^ i8) * 831) ^ 72898015;
                    i3 = 1003716469;
                    i11 = iM2566 ^ i3;
                    c16955 = c16955;
                    i10 = i2;
                    break;
                case -789786276:
                case 2103905273:
                    c16955 = this;
                    objArr[2] = c16955.f52037;
                    objArr[3] = boolM9921;
                    if (C3911.f12484 >= 0) {
                        iM2566 = (C2105.m6981("۬ۚ") ^ i9) * 55;
                        i2 = ((iM2566 ^ i8) * (-17059)) ^ 571300089;
                        i3 = -275862480;
                    } else {
                        iM2566 = C2105.m6981("᩹᩷") ^ i9;
                        i2 = ((iM2566 ^ i8) * 13033) ^ 932052796;
                        i3 = 1333462032;
                    }
                    i11 = iM2566 ^ i3;
                    c16955 = c16955;
                    i10 = i2;
                    break;
                case -737605855:
                case 2045942191:
                    if (C4075.f12947 >= 0) {
                        int iM6983 = (i8 - C2105.m6981("ܿᩳ")) * (-81);
                        i2 = ((iM6983 ^ i9) * (-2083)) ^ 1899398131;
                        i11 = iM6983 ^ (-1700803036);
                    } else {
                        c16955 = c16955;
                        iM2566 = (C2105.m6981("۬ۚ") ^ i9) * 55;
                        i2 = ((iM2566 ^ i8) * (-17059)) ^ 571300089;
                        i3 = -275862480;
                        i11 = iM2566 ^ i3;
                        c16955 = c16955;
                    }
                    i10 = i2;
                    break;
                case -723192649:
                case 559959889:
                    c16955 = c16955;
                    int i18 = i15 + i16;
                    i17 = i18 + i18;
                    s2 = 11058;
                    if (C3663.f11553) {
                        iM2566 = (C2105.m6981("ۗۘ") ^ i8) * (-19);
                        i2 = ((iM2566 ^ i9) * 5927) ^ (-1160417679);
                        i3 = 932053034;
                    } else {
                        iM2566 = (C0630.m2566("ܺۧ") ^ i8) * 59;
                        i2 = ((iM2566 ^ i9) * 12317) ^ 956651768;
                        i3 = -54967747;
                    }
                    i11 = iM2566 ^ i3;
                    c16955 = c16955;
                    i10 = i2;
                    break;
                case -719610625:
                case 61360757:
                    if (C0630.f2410 > 0) {
                        c16955 = c16955;
                        iM2566 = (C0630.m2566("ۖ֫") ^ i9) * 81;
                        i2 = ((iM2566 ^ i8) * 14485) ^ 713346158;
                        i3 = 752476959;
                        i11 = iM2566 ^ i3;
                        c16955 = c16955;
                        i10 = i2;
                    }
                    c16955 = c16955;
                    iM2566 = (C2105.m6981("ۗۘ") ^ i8) * (-19);
                    i2 = ((iM2566 ^ i9) * 5927) ^ (-1160417679);
                    i3 = 932053034;
                    i11 = iM2566 ^ i3;
                    c16955 = c16955;
                    i10 = i2;
                    break;
                case -543456624:
                case 1568295481:
                    strArrM6436 = ViewOnClickListenerC1958.m6436(strM6573, C3663.m11162(f52033, 47, 1, i12));
                    strArr = strArrM6436;
                    iM6981 = C2105.m6981("۬۠") ^ i8;
                    i10 = ((iM6981 ^ i9) * (-8425)) ^ (-1802216780);
                    i = 635675684;
                    i11 = iM6981 ^ i;
                    c16955 = this;
                    break;
                case -379112566:
                case 1618006573:
                    c16955 = c16955;
                    s = f52033[0];
                    if (C0382.f1805) {
                        iM2566 = C0630.m2566("ۗ᩶") ^ i8;
                        i2 = ((iM2566 ^ i9) * 28231) ^ (-116209273);
                        i3 = -1149106599;
                    } else {
                        iM2566 = (C0630.m2566("ۖ֫") ^ i9) * 81;
                        i2 = ((iM2566 ^ i8) * 14485) ^ 713346158;
                        i3 = 752476959;
                    }
                    i11 = iM2566 ^ i3;
                    c16955 = c16955;
                    i10 = i2;
                    break;
                case -319264716:
                case 420085970:
                    C3245.m9923(sb, C11340.m28025(f52033, 51, 2, i12));
                    iM6981 = C2105.m6981("᩷ۗ") ^ i8;
                    i10 = ((iM6981 ^ i9) * (-12283)) ^ 1589310057;
                    i = 291366952;
                    i11 = iM6981 ^ i;
                    c16955 = this;
                    break;
                case -24605111:
                case 408916020:
                    strM6573 = AbstractC2021.m6573(f52033, 1, 46, i12);
                    if (C0798.m3007(strM6573) == 0) {
                        iM6981 = C0630.m2566("ۨ᩵") ^ i8;
                        i10 = ((iM6981 ^ i9) * (-9969)) ^ 1059888333;
                        i = -1310854584;
                    } else {
                        iM6981 = C0630.m2566("۫᩸") ^ i9;
                        i10 = ((iM6981 ^ i8) * 27801) ^ (-246308109);
                        i = -326467693;
                    }
                    i11 = iM6981 ^ i;
                    c16955 = this;
                    break;
                case 56141712:
                case 1155887601:
                    sb = new StringBuilder();
                    sArr = f52033;
                    i13 = 48;
                    if (C1420.f5096 > 0) {
                        iM6981 = (i9 - C2105.m6981("ܳ᩹")) * (-77);
                        i10 = ((iM6981 ^ i8) * (-8483)) ^ 1835182266;
                        i = 961157654;
                        i11 = iM6981 ^ i;
                        c16955 = this;
                    } else {
                        c16955 = this;
                        iM2566 = (C2105.m6981("ۗۘ") ^ i8) * (-19);
                        i2 = ((iM2566 ^ i9) * 5927) ^ (-1160417679);
                        i3 = 932053034;
                        i11 = iM2566 ^ i3;
                        c16955 = c16955;
                        i10 = i2;
                    }
                    break;
                case 119319586:
                case 937758120:
                    i6++;
                    iM6981 = (i8 - C0630.m2566("ۘۚ")) * (-119);
                    i10 = ((iM6981 ^ i9) * 2987) ^ 1930719638;
                    i = -714282213;
                    i11 = iM6981 ^ i;
                    c16955 = this;
                    break;
                case 177483536:
                case 395358631:
                    C1294.m4372();
                    return null;
                case 295481442:
                case 1457673506:
                    c16955 = c16955;
                    int i19 = s + s2;
                    if ((i19 * i19) - i17 > 0) {
                        iM2566 = C2105.m6981("᩵᩻") ^ i8;
                        i2 = ((iM2566 ^ i9) * (-27171)) ^ (-254737402);
                        i3 = -2067117190;
                    } else {
                        iM2566 = C0630.m2566("᩵۫") ^ i9;
                        i2 = ((iM2566 ^ i8) * 7769) ^ 982795238;
                        i3 = -1576482025;
                    }
                    i11 = iM2566 ^ i3;
                    c16955 = c16955;
                    i10 = i2;
                    break;
                case 335230278:
                case 579544777:
                    i12 = 24112;
                    iM2566 = C0630.m2566("᩹ۘ") ^ i9;
                    i2 = ((iM2566 ^ i8) * 831) ^ 72898015;
                    i3 = 1003716469;
                    i11 = iM2566 ^ i3;
                    c16955 = c16955;
                    i10 = i2;
                    break;
                case 712878517:
                case 940905344:
                    if (i6 < strArr.length) {
                        iM6981 = (C0630.m2566("᩵۬") ^ i9) * (-3);
                        i10 = ((iM6981 ^ i8) * (-14875)) ^ 1055443118;
                        i = -1597301917;
                    } else {
                        iM6981 = C0630.m2566("ܺۖ") ^ i9;
                        i10 = ((iM6981 ^ i8) * 25529) ^ 1978547236;
                        i = 861454858;
                    }
                    i11 = iM6981 ^ i;
                    c16955 = this;
                    break;
                case 967124633:
                case 1612774765:
                    if (C1005.m3501()) {
                        c16955 = c16955;
                        iM2566 = (C2105.m6981("ۗۘ") ^ i8) * (-19);
                        i2 = ((iM2566 ^ i9) * 5927) ^ (-1160417679);
                        i3 = 932053034;
                        i11 = iM2566 ^ i3;
                        c16955 = c16955;
                    } else {
                        int iM6984 = (i8 - C2105.m6981("ܿᩳ")) * (-81);
                        i2 = ((iM6984 ^ i9) * (-2083)) ^ 1899398131;
                        i11 = iM6984 ^ (-1700803036);
                    }
                    i10 = i2;
                    break;
                case 1133894277:
                case 1485854104:
                    C4248.m12793(C16955.class, sb, C2167.m7159(sArr, i13, 1, i12));
                    i6 = i4;
                    iM6981 = (i8 - C0630.m2566("ۘۚ")) * (-119);
                    i10 = ((iM6981 ^ i9) * 2987) ^ 1930719638;
                    i = -714282213;
                    i11 = iM6981 ^ i;
                    c16955 = this;
                    break;
                case 1196517325:
                case 1257184883:
                    C1420.m4905(sb, strArr[i6]);
                    sArr2 = f52033;
                    i14 = 50;
                    if (C0237.f1507 == 0) {
                        iM6981 = (C2105.m6981("۠᩷") + i8) * (-11);
                        i10 = ((iM6981 ^ i9) * 14807) ^ (-1139647838);
                        i = -905442481;
                        i11 = iM6981 ^ i;
                        c16955 = this;
                    } else {
                        c16955 = this;
                        iM2566 = (C2105.m6981("ۚᩴ") + i8) * 109;
                        i2 = ((iM2566 ^ i9) * (-28685)) ^ (-1351852895);
                        i3 = -1435857485;
                        i11 = iM2566 ^ i3;
                        c16955 = c16955;
                        i10 = i2;
                    }
                    break;
                default:
                    C1128.m3851();
                    ViewOnClickListenerC1958.m6429();
                    c16955 = c16955;
                    iM2566 = (C2105.m6981("ۗۘ") ^ i8) * (-19);
                    i2 = ((iM2566 ^ i9) * 5927) ^ (-1160417679);
                    i3 = 932053034;
                    i11 = iM2566 ^ i3;
                    c16955 = c16955;
                    i10 = i2;
                    break;
            }
        }
    }

    public C16955(String str, EnumC8139 enumC8139, String str2, boolean z) {
        this.f52035 = str;
        this.f52036 = enumC8139;
        this.f52037 = str2;
        this.f52034 = z;
    }

    public final boolean equals(Object obj) {
        C16955 c16955 = null;
        int i = 1280119364;
        int i2 = C0422.f1886;
        int i3 = C1047.f3863;
        int iM2566 = (C0630.m2566("֨۬") ^ i2) * (-91);
        int i4 = ((iM2566 ^ i3) * 30987) ^ (-139983954);
        int i5 = -405290460;
        while (true) {
            i = ((((i ^ i3) * 21947) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2139264670:
                case 1247834839:
                    C1294.m4372();
                    return false;
                case -1959690369:
                case 794272740:
                    if (C3432.f10845 >= 0) {
                        iM2566 = (C0630.m2566("᩸ۡ") + i3) * 59;
                        i4 = ((iM2566 ^ i2) * 29665) ^ 418165640;
                        i5 = -1254733412;
                    } else {
                        iM2566 = (C0630.m2566("ۚۚ") + i3) * 23;
                        i4 = ((iM2566 ^ i2) * 3915) ^ 1420594973;
                        i5 = -963338537;
                    }
                    break;
                case -1899870386:
                case -1722549800:
                    C5695.m16023();
                    if (C2520.f8000 < 0) {
                        iM2566 = C0630.m2566("᩻۫") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-17121)) ^ 2009006185;
                        i5 = 298937309;
                    } else {
                        iM2566 = (C0630.m2566("᩷ۜ") + i2) * 47;
                        i4 = ((iM2566 ^ i3) * (-10003)) ^ 1896532625;
                        i5 = 1741356732;
                    }
                    break;
                case -1883059911:
                case -1209272432:
                    return false;
                case -1010298275:
                case 1867163203:
                    if (C3432.f10845 >= 0) {
                        iM2566 = C0630.m2566("᩻۫") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-17121)) ^ 2009006185;
                        i5 = 298937309;
                    } else {
                        iM2566 = (i3 - C2105.m6981("᩷۠")) * (-51);
                        i4 = ((iM2566 ^ i2) * (-24797)) ^ 827342323;
                        i5 = 1008542187;
                    }
                    break;
                case -776917925:
                case 842954660:
                    return true;
                case -646488673:
                case 1934143992:
                    if (C0050.f910 >= 0) {
                        iM2566 = (C0630.m2566("᩸ۡ") + i3) * 59;
                        i4 = ((iM2566 ^ i2) * 29665) ^ 418165640;
                        i5 = -1254733412;
                    } else {
                        iM2566 = (C2105.m6981("᩵ۘ") ^ i2) * (-39);
                        i4 = ((iM2566 ^ i3) * (-12681)) ^ 1468109388;
                        i5 = 379158776;
                    }
                    break;
                case -437683252:
                case 1924943838:
                    if (C2105.m6982() != 0) {
                        iM2566 = (C0630.m2566("᩷ۜ") + i2) * 47;
                        i4 = ((iM2566 ^ i3) * (-10003)) ^ 1896532625;
                        i5 = 1741356732;
                    } else {
                        iM2566 = C0630.m2566("ۛ᩵") ^ i2;
                        i4 = ((iM2566 ^ i3) * 21625) ^ 1008563344;
                        i5 = 330492931;
                    }
                    break;
                case -436340491:
                case 777107962:
                    RunnableC3474.m10630();
                    if (C3746.f11829 > 0) {
                        iM2566 = C0630.m2566("ۛܿ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 12013) ^ (-395551062);
                        i5 = 338372469;
                    } else {
                        iM2566 = C0630.m2566("᩻۫") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-17121)) ^ 2009006185;
                        i5 = 298937309;
                    }
                    break;
                case -364366521:
                case 1457081268:
                    if (C3683.m11218(this.f52035, c16955.f52035)) {
                        iM2566 = C2105.m6981("֨ᩳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-25505)) ^ (-907553603);
                        i5 = -1695720003;
                    } else {
                        iM2566 = C0630.m2566("ۧ᩶") ^ i2;
                        i4 = ((iM2566 ^ i3) * 14075) ^ (-401486732);
                        i5 = -1758889385;
                    }
                    break;
                case -307848629:
                case 187325115:
                    if (C0964.m3413()) {
                        iM2566 = C2105.m6981("۟ܰ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 5451) ^ 1233213832;
                        i5 = -1814372273;
                    } else {
                        iM2566 = C0630.m2566("ۛܿ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 12013) ^ (-395551062);
                        i5 = 338372469;
                    }
                    break;
                case -201076634:
                case 1043883584:
                    C2105.m6982();
                    C2272.m7503();
                    iM2566 = (C2105.m6981("ۧܳ") + i3) * 53;
                    i4 = ((iM2566 ^ i2) * 14135) ^ 719735005;
                    i5 = 6724110;
                    break;
                case 64283871:
                case 395677983:
                    if (RunnableC0588.m2435(this.f52036, c16955.f52036)) {
                        iM2566 = (C2105.m6981("ܰۗ") + i2) * 65;
                        i4 = ((iM2566 ^ i3) * 5731) ^ 181249278;
                        i5 = 1942262027;
                    } else {
                        iM2566 = C0630.m2566("ۧ᩶") ^ i2;
                        i4 = ((iM2566 ^ i3) * 14075) ^ (-401486732);
                        i5 = -1758889385;
                    }
                    break;
                case 154735372:
                case 891159085:
                    C3683.m11222();
                    if (!RunnableC1108.f4040) {
                        iM2566 = (C0630.m2566("᩷ۜ") + i2) * 47;
                        i4 = ((iM2566 ^ i3) * (-10003)) ^ 1896532625;
                        i5 = 1741356732;
                    } else {
                        iM2566 = (C2105.m6981("ۧܳ") + i3) * 53;
                        i4 = ((iM2566 ^ i2) * 14135) ^ 719735005;
                        i5 = 6724110;
                    }
                    break;
                case 190398968:
                case 291414122:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = (C0630.m2566("᩷ۜ") + i2) * 47;
                        i4 = ((iM2566 ^ i3) * (-10003)) ^ 1896532625;
                        i5 = 1741356732;
                    } else {
                        iM2566 = (C2105.m6981("ۧۛ") + i3) * (-25);
                        i4 = ((iM2566 ^ i2) * (-13623)) ^ (-1564320149);
                        i5 = 1021090438;
                    }
                    break;
                case 196280892:
                case 334328461:
                    if (C0630.f2410 <= 0) {
                        iM2566 = C0630.m2566("᩻۫") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-17121)) ^ 2009006185;
                        i5 = 298937309;
                    } else {
                        iM2566 = (C0630.m2566("ۙ᩺") ^ i3) * 41;
                        i4 = ((iM2566 ^ i2) * (-22401)) ^ (-1411427904);
                        i5 = -269155931;
                    }
                    break;
                case 460215971:
                case 1698310992:
                    if (C21923.f70183 != 0) {
                        iM2566 = C0630.m2566("ۛܿ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 12013) ^ (-395551062);
                        i5 = 338372469;
                    } else {
                        iM2566 = C0630.m2566("۠۫") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-23527)) ^ 414927801;
                        i5 = -50142010;
                    }
                    break;
                case 540197795:
                case 1718215422:
                    if (RunnableC0588.m2435(this.f52037, c16955.f52037)) {
                        iM2566 = (i3 - C0630.m2566("ۡᩴ")) * (-97);
                        i4 = ((iM2566 ^ i2) * 21427) ^ (-926954418);
                        i5 = 1474212270;
                    } else {
                        iM2566 = C0630.m2566("ۧ᩶") ^ i2;
                        i4 = ((iM2566 ^ i3) * 14075) ^ (-401486732);
                        i5 = -1758889385;
                    }
                    break;
                case 571225930:
                case 1963129035:
                    if (C0237.f1507 != 0) {
                        iM2566 = C0630.m2566("᩻۫") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-17121)) ^ 2009006185;
                        i5 = 298937309;
                    } else {
                        iM2566 = C2105.m6981("֡ۚ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 12451) ^ (-2070317632);
                        i5 = -398288032;
                    }
                    break;
                case 794800154:
                case 1202240589:
                    if (C0630.f2410 <= 0) {
                        iM2566 = (C0630.m2566("᩸ۡ") + i3) * 59;
                        i4 = ((iM2566 ^ i2) * 29665) ^ 418165640;
                        i5 = -1254733412;
                    } else {
                        iM2566 = (i2 - C0630.m2566("ۙܽ")) * (-49);
                        i4 = ((iM2566 ^ i3) * (-3337)) ^ 1260643445;
                        i5 = 147670412;
                    }
                    break;
                case 871330975:
                case 2061854044:
                    if (obj instanceof C16955) {
                        iM2566 = C2105.m6981("ۛ۫") ^ i3;
                        i4 = ((iM2566 ^ i2) * 25977) ^ 415524748;
                        i5 = 1097452981;
                    } else {
                        iM2566 = C0630.m2566("ۧ᩶") ^ i2;
                        i4 = ((iM2566 ^ i3) * 14075) ^ (-401486732);
                        i5 = -1758889385;
                    }
                    break;
                default:
                    c16955 = (C16955) obj;
                    if (this.f52034 == c16955.f52034) {
                        iM2566 = (C0630.m2566("ۚ۠") + i2) * 73;
                        i4 = ((iM2566 ^ i3) * (-20703)) ^ (-2040651035);
                        i5 = -249784456;
                    } else {
                        iM2566 = C0630.m2566("ۧ᩶") ^ i2;
                        i4 = ((iM2566 ^ i3) * 14075) ^ (-401486732);
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
        int iM6981;
        int i;
        int i2;
        int i3 = C4075.f12947;
        int i4 = C22628.f73083;
        int iM2566 = C0630.m2566("֡ܺ") ^ i3;
        int i5 = ((iM2566 ^ i4) * (-30261)) ^ 1497566437;
        String str = null;
        EnumC8139 enumC8139 = null;
        int i6 = iM2566 ^ 1593734499;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int iM46680 = 0;
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
                    if (C1294.f4556 >= 0) {
                        iM6981 = C2105.m6981("ۙۤ") ^ i4;
                        i = ((iM6981 ^ i3) * 9495) ^ 1213061542;
                        i2 = -1957383752;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ۖ۫")) * 41;
                        i = ((iM6981 ^ i4) * 31945) ^ (-1016239351);
                        i2 = -1167445312;
                    }
                    int i16 = i15;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i14 = i16;
                    break;
                case -1974967295:
                case -1134414034:
                    i8 = 1231;
                    iM6981 = C0630.m2566("ۘ᩹") ^ i4;
                    i = ((iM6981 ^ i3) * 5949) ^ (-2002248910);
                    i2 = 9393018;
                    int i17 = i15;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i14 = i17;
                    break;
                case -1753614460:
                case -369101998:
                    if (C3746.f11829 <= 0) {
                        i15 = i15;
                        iM6981 = C0630.m2566("ܰܶ") ^ i4;
                        i = ((iM6981 ^ i3) * (-9803)) ^ 2135321964;
                        i2 = -1808974979;
                    } else {
                        iM6981 = (C2105.m6981("ۘۨ") ^ i3) * 71;
                        i15 = i15;
                        i = ((iM6981 ^ i4) * 13125) ^ 320959495;
                        i2 = -1660593551;
                    }
                    int i18 = i15;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i14 = i18;
                    break;
                case -1580278888:
                case 696972245:
                    C2167.m7155();
                    C5695.m16023();
                    return 0;
                case -1408412969:
                case 1627485430:
                    i15 = i15;
                    str = this.f52035;
                    if (C0798.f2919) {
                        iM6981 = C0630.m2566("ܰܶ") ^ i4;
                        i = ((iM6981 ^ i3) * (-9803)) ^ 2135321964;
                        i2 = -1808974979;
                    } else {
                        iM6981 = (C0630.m2566("ۢܶ") + i3) * 53;
                        i = ((iM6981 ^ i4) * 31301) ^ 1725257748;
                        i2 = -869159692;
                    }
                    int i19 = i15;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i14 = i19;
                    break;
                case -1375062555:
                case 294461667:
                    C7106.m19120();
                    if (C7106.m19120() > 0) {
                        i15 = i15;
                        iM6981 = C2105.m6981("۟ᩴ") ^ i4;
                        i = ((iM6981 ^ i3) * 22535) ^ (-1141924108);
                        i2 = -602137916;
                        int i110 = i15;
                        i6 = iM6981 ^ i2;
                        i5 = i;
                        i14 = i110;
                    }
                    i15 = i15;
                    iM6981 = C0630.m2566("ܰܶ") ^ i4;
                    i = ((iM6981 ^ i3) * (-9803)) ^ 2135321964;
                    i2 = -1808974979;
                    int i111 = i15;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i14 = i111;
                    break;
                case -1327242822:
                case -878620849:
                    i15 = i15;
                    i10 = i8 * i9;
                    if (C7106.m19120() <= 0) {
                        iM6981 = (C2105.m6981("ܳۢ") + i3) * 67;
                        i = ((iM6981 ^ i4) * 30075) ^ (-536099308);
                        i2 = 505140368;
                    } else {
                        iM6981 = C2105.m6981("ᩴ֫") ^ i3;
                        i = ((iM6981 ^ i4) * (-9749)) ^ 1806712997;
                        i2 = -380019559;
                    }
                    int i112 = i15;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i14 = i112;
                    break;
                case -1302497077:
                case 125464530:
                    i15 = i15;
                    if (C2520.m8026()) {
                        iM6981 = C2105.m6981("۟ᩴ") ^ i4;
                        i = ((iM6981 ^ i3) * 22535) ^ (-1141924108);
                        i2 = -602137916;
                    } else {
                        iM6981 = C2105.m6981("֨᩵") ^ i3;
                        i = ((iM6981 ^ i4) * 6521) ^ (-1990182670);
                        i2 = -1718694831;
                    }
                    int i113 = i15;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i14 = i113;
                    break;
                case -1095275408:
                case 937562278:
                    i15 = i15;
                    RunnableC1108.m3790();
                    C3683.m11222();
                    iM6981 = C0630.m2566("ܰܶ") ^ i4;
                    i = ((iM6981 ^ i3) * (-9803)) ^ 2135321964;
                    i2 = -1808974979;
                    int i114 = i15;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i14 = i114;
                    break;
                case -1086139449:
                case -147197784:
                    i15 = i15;
                    iM46680 = C20361.m46680(i10, i7, str);
                    enumC8139 = this.f52036;
                    if (C0483.f2088 >= 0) {
                        iM6981 = C2105.m6981("ۙۤ") ^ i4;
                        i = ((iM6981 ^ i3) * 9495) ^ 1213061542;
                        i2 = -1957383752;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ۛۙ")) * (-69);
                        i = ((iM6981 ^ i3) * (-13109)) ^ 871981387;
                        i2 = 27160802;
                    }
                    int i115 = i15;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i14 = i115;
                    break;
                case -970349082:
                case -950641963:
                    i15 = i15;
                    if (C7811.f24123 >= 0) {
                        iM6981 = C2105.m6981("ۙۤ") ^ i4;
                        i = ((iM6981 ^ i3) * 9495) ^ 1213061542;
                        i2 = -1957383752;
                    } else {
                        iM6981 = (C0630.m2566("ۘۚ") ^ i4) * 59;
                        i = ((iM6981 ^ i3) * (-28915)) ^ (-1175039170);
                        i2 = 1828605193;
                    }
                    int i116 = i15;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i14 = i116;
                    break;
                case -831635697:
                case 1220530970:
                    i8 = 1237;
                    iM6981 = C0630.m2566("ۘ᩹") ^ i4;
                    i = ((iM6981 ^ i3) * 5949) ^ (-2002248910);
                    i2 = 9393018;
                    int i117 = i15;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i14 = i117;
                    break;
                case -720575799:
                case 1282434825:
                    i15 = i15;
                    C11340.m28031();
                    if (C1916.f6442) {
                        iM6981 = C2105.m6981("ۙۤ") ^ i4;
                        i = ((iM6981 ^ i3) * 9495) ^ 1213061542;
                        i2 = -1957383752;
                    } else {
                        iM6981 = C0630.m2566("ܰܶ") ^ i4;
                        i = ((iM6981 ^ i3) * (-9803)) ^ 2135321964;
                        i2 = -1808974979;
                    }
                    int i118 = i15;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i14 = i118;
                    break;
                case -693776126:
                case 305705713:
                    i15 = i15;
                    if (this.f52034) {
                        iM6981 = (i3 - C2105.m6981("ۗۖ")) * 75;
                        i = ((iM6981 ^ i4) * 30137) ^ (-2065251137);
                        i2 = 2015788786;
                    } else {
                        iM6981 = (i4 - C2105.m6981("֫᩷")) * (-53);
                        i = ((iM6981 ^ i3) * 2935) ^ (-697878650);
                        i2 = -1869169401;
                    }
                    int i119 = i15;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i14 = i119;
                    break;
                case -543714615:
                case 166861056:
                    i15 = i15;
                    i11 = iHashCode + iM46680;
                    i12 = 31;
                    if (C1916.m6308() >= 0) {
                        iM6981 = C2105.m6981("۟ᩴ") ^ i4;
                        i = ((iM6981 ^ i3) * 22535) ^ (-1141924108);
                        i2 = -602137916;
                    } else {
                        iM6981 = C0630.m2566("ۛ۬") ^ i4;
                        i = ((iM6981 ^ i3) * 139) ^ (-331062143);
                        i2 = -1312312680;
                    }
                    int i1110 = i15;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i14 = i1110;
                    break;
                case -462848278:
                case 1813577147:
                    return C11003.hashCode(this.f52037) + i13;
                case 299177028:
                case 580011248:
                    i15 = i15;
                    if (RunnableC3474.f10992 <= 0) {
                        iM6981 = C2105.m6981("۟ᩴ") ^ i4;
                        i = ((iM6981 ^ i3) * 22535) ^ (-1141924108);
                        i2 = -602137916;
                    } else {
                        iM6981 = (C0630.m2566("᩹ۨ") + i4) * (-113);
                        i = ((iM6981 ^ i3) * 31309) ^ (-244449397);
                        i2 = -2051061228;
                    }
                    int i1111 = i15;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i14 = i1111;
                    break;
                case 896318264:
                case 1850011576:
                    i15 = i15;
                    i7 = 31;
                    i9 = 31;
                    if (C4117.f13076 <= 0) {
                        iM6981 = C2105.m6981("ۙۤ") ^ i4;
                        i = ((iM6981 ^ i3) * 9495) ^ 1213061542;
                        i2 = -1957383752;
                    } else {
                        iM6981 = (C2105.m6981("ۡܽ") ^ i3) * 87;
                        i = ((iM6981 ^ i4) * (-18967)) ^ 1918827076;
                        i2 = -1860483238;
                    }
                    int i1112 = i15;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i14 = i1112;
                    break;
                default:
                    i15 = i15;
                    iHashCode = C11003.hashCode(enumC8139);
                    if (C4616.f14690 <= 0) {
                        iM6981 = (C2105.m6981("ܳۢ") + i3) * 67;
                        i = ((iM6981 ^ i4) * 30075) ^ (-536099308);
                        i2 = 505140368;
                    } else {
                        iM6981 = (i3 - C2105.m6981("֨᩹")) * (-77);
                        i = ((iM6981 ^ i4) * (-14861)) ^ (-2125928581);
                        i2 = 592430892;
                    }
                    int i1113 = i15;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i14 = i1113;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m39778() {
        return this.f52034;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m39779() {
        return this.f52037;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m39780() {
        return this.f52035;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final EnumC8139 m39781() {
        return this.f52036;
    }
}
