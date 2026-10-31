package l;

import bin.mt.plus.Main;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.۟ۡܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05ZQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C7367 extends AbstractC7548 {

    /* JADX INFO: renamed from: ֡ۨۢ, reason: not valid java name and contains not printable characters */
    private static final short[] f22632 = {8899, -25187, 18053, 18239, 2818, 14899, 10762, -949};

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f22633;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f22634;

    /* JADX WARN: Code duplicated, block: B:48:0x017b A[PHI: r1 r2 r9 r17
      0x017b: PHI (r1v3 int) = (r1v1 int), (r1v2 int), (r1v1 int) binds: [B:47:0x0179, B:24:0x0095, B:13:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x017b: PHI (r2v3 int) = (r2v1 int), (r2v2 int), (r2v1 int) binds: [B:47:0x0179, B:24:0x0095, B:13:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x017b: PHI (r9v3 int) = (r9v2 int), (r9v1 int), (r9v1 int) binds: [B:47:0x0179, B:24:0x0095, B:13:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x017b: PHI (r17v23 int) = (r17v10 int), (r17v19 int), (r17v24 int) binds: [B:47:0x0179, B:24:0x0095, B:13:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x01a7 A[PHI: r7 r8 r17 r18
      0x01a7: PHI (r7v2 int) = (r7v1 int), (r7v1 int), (r7v1 int), (r7v4 int) binds: [B:28:0x00b9, B:16:0x0075, B:10:0x004d, B:6:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x01a7: PHI (r8v2 short) = (r8v1 short), (r8v1 short), (r8v1 short), (r8v4 short) binds: [B:28:0x00b9, B:16:0x0075, B:10:0x004d, B:6:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x01a7: PHI (r17v27 int) = (r17v18 int), (r17v21 int), (r17v26 int), (r17v30 int) binds: [B:28:0x00b9, B:16:0x0075, B:10:0x004d, B:6:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x01a7: PHI (r18v3 java.lang.String) = (r18v2 java.lang.String), (r18v1 java.lang.String), (r18v1 java.lang.String), (r18v1 java.lang.String) binds: [B:28:0x00b9, B:16:0x0075, B:10:0x004d, B:6:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x01fb A[PHI: r5 r11 r12 r17
      0x01fb: PHI (r5v3 short) = (r5v2 short), (r5v1 short), (r5v1 short), (r5v1 short), (r5v1 short) binds: [B:57:0x01f9, B:36:0x00fc, B:18:0x0079, B:16:0x0075, B:13:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r11v3 short[]) = (r11v1 short[]), (r11v2 short[]), (r11v1 short[]), (r11v1 short[]), (r11v1 short[]) binds: [B:57:0x01f9, B:36:0x00fc, B:18:0x0079, B:16:0x0075, B:13:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r12v3 int) = (r12v1 int), (r12v2 int), (r12v1 int), (r12v1 int), (r12v1 int) binds: [B:57:0x01f9, B:36:0x00fc, B:18:0x0079, B:16:0x0075, B:13:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r17v22 int) = (r17v8 int), (r17v15 int), (r17v20 int), (r17v21 int), (r17v24 int) binds: [B:57:0x01f9, B:36:0x00fc, B:18:0x0079, B:16:0x0075, B:13:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0250 A[PHI: r3 r4 r6 r13 r17
      0x0250: PHI (r3v3 short[]) = (r3v2 short[]), (r3v1 short[]), (r3v1 short[]), (r3v1 short[]) binds: [B:65:0x024e, B:61:0x022e, B:53:0x01da, B:32:0x00d9] A[DONT_GENERATE, DONT_INLINE]
      0x0250: PHI (r4v3 char) = (r4v1 char), (r4v2 char), (r4v1 char), (r4v1 char) binds: [B:65:0x024e, B:61:0x022e, B:53:0x01da, B:32:0x00d9] A[DONT_GENERATE, DONT_INLINE]
      0x0250: PHI (r6v3 int) = (r6v1 int), (r6v1 int), (r6v2 int), (r6v1 int) binds: [B:65:0x024e, B:61:0x022e, B:53:0x01da, B:32:0x00d9] A[DONT_GENERATE, DONT_INLINE]
      0x0250: PHI (r13v2 int) = (r13v1 int), (r13v1 int), (r13v1 int), (r13v3 int) binds: [B:65:0x024e, B:61:0x022e, B:53:0x01da, B:32:0x00d9] A[DONT_GENERATE, DONT_INLINE]
      0x0250: PHI (r17v16 int) = (r17v6 int), (r17v7 int), (r17v9 int), (r17v17 int) binds: [B:65:0x024e, B:61:0x022e, B:53:0x01da, B:32:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        int iM2566;
        int i;
        int i2;
        int iM6981 = 0;
        int i3 = 0;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i4 = 0;
        int i5 = 0;
        short s2 = 0;
        int i6 = 0;
        int i7 = 0;
        short[] sArr2 = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 1735264172;
        int i11 = ViewOnClickListenerC1958.f6529;
        int i12 = C0714.f2697;
        int iM6982 = (i12 - C2105.m6981("ܿ᩶")) * 41;
        int i13 = ((iM6982 ^ i11) * (-28835)) ^ 1277951957;
        int i14 = iM6982 ^ 758556154;
        String strM9031 = null;
        while (true) {
            int i15 = i14 ^ (i13 & (((i10 ^ i11) * (-8725)) >> 31));
            switch (i15) {
                case -1529095256:
                case 241201984:
                    i15 = i15;
                    strM9031 = C2958.m9031(sArr2, i8, i9, i7);
                    if (C0050.f910 >= 0) {
                        iM2566 = (i11 - C2105.m6981("ܽۧ")) * (-53);
                        i = ((iM2566 ^ i12) * (-6041)) ^ 1241303996;
                        i2 = -858698758;
                    } else {
                        iM2566 = (C2105.m6981("۫᩺") ^ i11) * 109;
                        i = ((iM2566 ^ i12) * 20269) ^ (-1472724198);
                        i2 = 1610818472;
                    }
                    int i16 = i15;
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    i10 = i16;
                    break;
                case -1419196802:
                case -63795310:
                    i15 = i15;
                    if (i5 - (i6 + 1) < 0) {
                        iM2566 = (C2105.m6981("᩵ᩴ") ^ i12) * (-99);
                        i = ((iM2566 ^ i11) * (-30971)) ^ (-1562261606);
                        i2 = -528307118;
                    } else {
                        iM2566 = (C2105.m6981("ۙۙ") + i11) * 53;
                        i = ((iM2566 ^ i12) * 28223) ^ (-2042159741);
                        i2 = 71394300;
                    }
                    int i17 = i15;
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    i10 = i17;
                    break;
                case -1414373437:
                case 1440889147:
                    i15 = i15;
                    s = sArr[c];
                    if (C1005.f3721) {
                        iM2566 = C0630.m2566("ۖܳ") ^ i12;
                        i = ((iM2566 ^ i11) * (-9631)) ^ (-1526881170);
                        i2 = 1130677816;
                    } else {
                        iM2566 = (C0630.m2566("᩵֨") + i12) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM2566 ^ i11) * (-3225)) ^ 502796413;
                        i2 = 54976960;
                    }
                    int i18 = i15;
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    i10 = i18;
                    break;
                case -1291305904:
                case 2046200587:
                    i15 = i15;
                    iM6981 = C2105.m6981(strM9031);
                    i3 = 2130541279;
                    if (C4263.f13799 <= 0) {
                        iM2566 = C0630.m2566("ܶ۫") ^ i12;
                        i = ((iM2566 ^ i11) * (-26747)) ^ (-78227928);
                        i2 = -2083538477;
                    } else {
                        iM2566 = (i11 - C0630.m2566("ۡۧ")) * 43;
                        i = ((iM2566 ^ i12) * (-11191)) ^ (-1235792715);
                        i2 = 1243237825;
                    }
                    int i19 = i15;
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    i10 = i19;
                    break;
                case -1060052718:
                case 402430378:
                    C0422.m1963();
                    if (C3746.f11829 <= 0) {
                        i15 = i15;
                        iM2566 = (i11 - C2105.m6981("ܽۧ")) * (-53);
                        i = ((iM2566 ^ i12) * (-6041)) ^ 1241303996;
                        i2 = -858698758;
                    } else {
                        iM2566 = C2105.m6981("ۨܿ") ^ i12;
                        i15 = i15;
                        i = ((iM2566 ^ i11) * 29237) ^ 1880036461;
                        i2 = -1554490468;
                    }
                    int i110 = i15;
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    i10 = i110;
                    break;
                case -1052995132:
                case -407612916:
                    i15 = i15;
                    sArr = f22632;
                    if (C2958.f9394 >= 0) {
                        iM2566 = (i11 - C2105.m6981("ᩳۛ")) * (-127);
                        i = ((iM2566 ^ i12) * 11205) ^ 1068863362;
                        i2 = 1410803781;
                    } else {
                        iM2566 = (i12 - C0630.m2566("ܳ۫")) * (-69);
                        i = ((iM2566 ^ i11) * 2707) ^ (-338612291);
                        i2 = -1538401466;
                    }
                    int i111 = i15;
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    i10 = i111;
                    break;
                case -975532927:
                case -852818120:
                    i15 = i15;
                    i4 = s + 1;
                    if (C1005.f3721) {
                        iM2566 = C0630.m2566("ۤܶ") ^ i11;
                        i = ((iM2566 ^ i12) * (-8475)) ^ (-1881517400);
                        i2 = -2080299717;
                    } else {
                        iM2566 = (i11 - C2105.m6981("ᩳۛ")) * (-127);
                        i = ((iM2566 ^ i12) * 11205) ^ 1068863362;
                        i2 = 1410803781;
                    }
                    int i112 = i15;
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    i10 = i112;
                    break;
                case -393821570:
                case -243762566:
                    i15 = i15;
                    i9 = 3;
                    if (C21923.f70183 != 0) {
                        iM2566 = (i11 - C2105.m6981("ᩳۛ")) * (-127);
                        i = ((iM2566 ^ i12) * 11205) ^ 1068863362;
                        i2 = 1410803781;
                    } else {
                        iM2566 = (C2105.m6981("ᩴ۫") + i12) * 95;
                        i = ((iM2566 ^ i11) * 21977) ^ (-452730165);
                        i2 = -554835668;
                    }
                    int i113 = i15;
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    i10 = i113;
                    break;
                case -340452173:
                case 419036648:
                    i7 = 8856;
                    iM2566 = C0630.m2566("ۨۙ") ^ i11;
                    i = ((iM2566 ^ i12) * 30099) ^ (-248226519);
                    i2 = 1646468174;
                    int i114 = i15;
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    i10 = i114;
                    break;
                case -224593016:
                case 1543969713:
                    i15 = i15;
                    i6 = s * s2;
                    if (C21923.m49329()) {
                        iM2566 = C0630.m2566("ܶ۫") ^ i12;
                        i = ((iM2566 ^ i11) * (-26747)) ^ (-78227928);
                        i2 = -2083538477;
                    } else {
                        iM2566 = C0630.m2566("᩻᩺") ^ i12;
                        i = ((iM2566 ^ i11) * 24419) ^ 1421771475;
                        i2 = 623153980;
                    }
                    int i115 = i15;
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    i10 = i115;
                    break;
                case -52633144:
                case 226510267:
                    i15 = i15;
                    if (C22628.f73083 <= 0) {
                        iM2566 = (C0630.m2566("᩵֨") + i12) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM2566 ^ i11) * (-3225)) ^ 502796413;
                        i2 = 54976960;
                    } else {
                        iM2566 = (i11 - C2105.m6981("ܽۧ")) * (-53);
                        i = ((iM2566 ^ i12) * (-6041)) ^ 1241303996;
                        i2 = -858698758;
                    }
                    int i116 = i15;
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    i10 = i116;
                    break;
                case -37166356:
                case 10887649:
                    i15 = i15;
                    c = 0;
                    if (C1504.m5179()) {
                        iM2566 = (i11 - C2105.m6981("ܳ᩸")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM2566 ^ i12) * 3485) ^ (-542008801);
                        i2 = 786812021;
                    } else {
                        iM2566 = (i11 - C2105.m6981("ᩳۛ")) * (-127);
                        i = ((iM2566 ^ i12) * 11205) ^ 1068863362;
                        i2 = 1410803781;
                    }
                    int i117 = i15;
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    i10 = i117;
                    break;
                case 29371353:
                case 1808652058:
                    C3663.m11161(iM6981 ^ i3);
                    break;
                case 564578906:
                case 756522198:
                    i15 = i15;
                    if (C3019.f9544 >= 0) {
                        iM2566 = (C0630.m2566("᩵֨") + i12) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM2566 ^ i11) * (-3225)) ^ 502796413;
                        i2 = 54976960;
                    } else {
                        iM2566 = C0630.m2566("ܶ۫") ^ i12;
                        i = ((iM2566 ^ i11) * (-26747)) ^ (-78227928);
                        i2 = -2083538477;
                    }
                    int i118 = i15;
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    i10 = i118;
                    break;
                case 613082204:
                case 1202671024:
                    C0237.m1481();
                    break;
                case 845079392:
                case 905995400:
                    i15 = i15;
                    sArr2 = f22632;
                    i8 = 1;
                    if (C0382.f1805) {
                        iM2566 = (i12 - C0630.m2566("ᩳܿ")) * (-9);
                        i = ((iM2566 ^ i11) * 26297) ^ 1021197364;
                        i2 = 237851645;
                    } else {
                        iM2566 = (C0630.m2566("᩵֨") + i12) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM2566 ^ i11) * (-3225)) ^ 502796413;
                        i2 = 54976960;
                    }
                    int i119 = i15;
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    i10 = i119;
                    break;
                case 1478469909:
                case 1796676599:
                    i15 = i15;
                    C4075.m12263();
                    iM2566 = (C0630.m2566("᩵֨") + i12) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i = ((iM2566 ^ i11) * (-3225)) ^ 502796413;
                    i2 = 54976960;
                    int i1110 = i15;
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    i10 = i1110;
                    break;
                case 1875853055:
                case 2123843358:
                    i7 = 7538;
                    iM2566 = C0630.m2566("ۨۙ") ^ i11;
                    i = ((iM2566 ^ i12) * 30099) ^ (-248226519);
                    i2 = 1646468174;
                    int i1111 = i15;
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    i10 = i1111;
                    break;
                default:
                    i15 = i15;
                    i5 = i4 * i4;
                    s2 = 2;
                    if (C4075.m12263() <= 0) {
                        iM2566 = (i11 - C2105.m6981("ܽۧ")) * (-53);
                        i = ((iM2566 ^ i12) * (-6041)) ^ 1241303996;
                        i2 = -858698758;
                    } else {
                        iM2566 = C0630.m2566("ۤۜ") ^ i11;
                        i = ((iM2566 ^ i12) * (-5709)) ^ 1382580591;
                        i2 = 136602622;
                    }
                    int i1112 = i15;
                    i14 = iM2566 ^ i2;
                    i13 = i;
                    i10 = i1112;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C16560 c16560 = null;
        int i = -1168803400;
        int i2 = C1773.f6144;
        int i3 = C1128.f4106;
        int iM6981 = (C2105.m6981("᩹ܽ") ^ i2) * 59;
        int i4 = ((iM6981 ^ i3) * (-12701)) ^ 1148973256;
        int i5 = 2050382118;
        while (true) {
            i = ((((i ^ i3) * (-13875)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2096215842:
                case -1028800700:
                    C4075.m12246(C22628.m50612(c16560), exc, null);
                    break;
                case -2082709050:
                case -1989174363:
                    ViewOnClickListenerC1958.m6429();
                    C0483.m2121();
                    iM6981 = C0630.m2566("ᩴ᩶") ^ i3;
                    i4 = ((iM6981 ^ i2) * 27841) ^ (-2088822708);
                    i5 = 1019490614;
                    break;
                case -1891525484:
                case -882875779:
                    if (C22628.f73083 > 0) {
                        iM6981 = C2105.m6981("ۚۗ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 12261) ^ (-1429557785);
                        i5 = 568225277;
                    } else {
                        iM6981 = C2105.m6981("ܺᩳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-31857)) ^ 689894803;
                        i5 = -1891786132;
                    }
                    break;
                case -1667327038:
                case 2105292359:
                    if (C0964.f3626 != 0) {
                        iM6981 = C2105.m6981("ۚۗ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 12261) ^ (-1429557785);
                        i5 = 568225277;
                    } else {
                        iM6981 = (C0630.m2566("᩸ۧ") ^ i3) * (-103);
                        i4 = ((iM6981 ^ i2) * (-21381)) ^ (-482358057);
                        i5 = -743590854;
                    }
                    break;
                case -1585432093:
                case -1337889575:
                    if (!C1504.f5354) {
                        iM6981 = C0630.m2566("ᩴ᩶") ^ i3;
                        i4 = ((iM6981 ^ i2) * 27841) ^ (-2088822708);
                        i5 = 1019490614;
                    } else {
                        iM6981 = C2105.m6981("ۚۗ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 12261) ^ (-1429557785);
                        i5 = 568225277;
                    }
                    break;
                case -1168429346:
                case -245615870:
                    if (C2958.f9394 >= 0) {
                        iM6981 = C0630.m2566("ᩴ᩶") ^ i3;
                        i4 = ((iM6981 ^ i2) * 27841) ^ (-2088822708);
                        i5 = 1019490614;
                    } else {
                        iM6981 = C0630.m2566("ۖۢ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 14215) ^ (-342901856);
                        i5 = 139416334;
                    }
                    break;
                case -1075275008:
                case 1424057538:
                    if (C2126.f7087) {
                        iM6981 = C2105.m6981("ᩴ۠") ^ i2;
                        i4 = ((iM6981 ^ i3) * 12903) ^ (-852515299);
                        i5 = -1386071332;
                    } else {
                        iM6981 = (i3 - C2105.m6981("᩸᩶")) * (-69);
                        i4 = ((iM6981 ^ i2) * (-3681)) ^ (-2127449528);
                        i5 = -1148926951;
                    }
                    break;
                case -975656445:
                case -153064696:
                    if (C3663.m11168() >= 0) {
                        iM6981 = (C0630.m2566("ۘ۬") ^ i3) * (-111);
                        i4 = ((iM6981 ^ i2) * (-7103)) ^ (-1797725949);
                        i5 = -1054498808;
                    } else {
                        iM6981 = C2105.m6981("ܰ᩶") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-12535)) ^ (-1318973763);
                        i5 = -1306328206;
                    }
                    break;
                case -332110452:
                case 876836988:
                    RunnableC1937.m6387();
                    break;
                case -8058042:
                case 964425463:
                    if (C0964.f3626 != 0) {
                        iM6981 = (C0630.m2566("ۘ۬") ^ i3) * (-111);
                        i4 = ((iM6981 ^ i2) * (-7103)) ^ (-1797725949);
                        i5 = -1054498808;
                    } else {
                        iM6981 = C0630.m2566("᩵ۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-4275)) ^ (-732275463);
                        i5 = -538809869;
                    }
                    break;
                case 13340170:
                case 2068747316:
                    c16560 = this.f22634;
                    if (C2105.f7037 != 0) {
                        iM6981 = (C0630.m2566("ۘ۬") ^ i3) * (-111);
                        i4 = ((iM6981 ^ i2) * (-7103)) ^ (-1797725949);
                        i5 = -1054498808;
                    } else {
                        iM6981 = (C0630.m2566("ۧ֫") ^ i2) * 15;
                        i4 = ((iM6981 ^ i3) * (-6825)) ^ 988552336;
                        i5 = 2142262666;
                    }
                    break;
                case 248182167:
                case 362591575:
                    if (C0630.m2564()) {
                        iM6981 = C2105.m6981("ۚۗ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 12261) ^ (-1429557785);
                        i5 = 568225277;
                    } else {
                        iM6981 = (C2105.m6981("᩷ۡ") + i2) * 43;
                        i4 = ((iM6981 ^ i3) * 14795) ^ (-1386690246);
                        i5 = -1001195412;
                    }
                    break;
                case 263278798:
                case 503878060:
                    if (C1504.m5179()) {
                        iM6981 = C0630.m2566("۫ۧ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 26925) ^ 858691177;
                        i5 = 1960420210;
                    } else {
                        iM6981 = (C0630.m2566("ۘ۬") ^ i3) * (-111);
                        i4 = ((iM6981 ^ i2) * (-7103)) ^ (-1797725949);
                        i5 = -1054498808;
                    }
                    break;
                case 693809416:
                case 1221180480:
                    if (C0483.f2088 < 0) {
                        iM6981 = C2105.m6981("ᩴ۠") ^ i2;
                        i4 = ((iM6981 ^ i3) * 12903) ^ (-852515299);
                        i5 = -1386071332;
                    } else {
                        iM6981 = C0630.m2566("ᩴ᩶") ^ i3;
                        i4 = ((iM6981 ^ i2) * 27841) ^ (-2088822708);
                        i5 = 1019490614;
                    }
                    break;
                case 695389621:
                case 2086500838:
                    if (C21923.f70183 != 0) {
                        iM6981 = C2105.m6981("ۚۗ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 12261) ^ (-1429557785);
                        i5 = 568225277;
                    } else {
                        iM6981 = (C2105.m6981("ܳ֫") ^ i2) * 35;
                        i4 = ((iM6981 ^ i3) * 18751) ^ (-1602306315);
                        i5 = -1794548158;
                    }
                    break;
                default:
                    if (C1420.m4913()) {
                        iM6981 = C2105.m6981("ۚۗ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 12261) ^ (-1429557785);
                        i5 = 568225277;
                    } else {
                        iM6981 = C2105.m6981("᩷᩻") ^ i3;
                        i4 = ((iM6981 ^ i2) * 10707) ^ 344221727;
                        i5 = -150846870;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006f  */
    /* JADX WARN: Code duplicated, block: B:53:0x01b1 A[PHI: r8 r11
      0x01b1: PHI (r8v4 int) = (r8v3 int), (r8v2 int) binds: [B:52:0x01af, B:6:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x01b1: PHI (r11v3 int) = (r11v2 int), (r11v5 int) binds: [B:52:0x01af, B:6:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01e5 A[PHI: r2 r7 r9 r10
      0x01e5: PHI (r2v4 bin.mt.plus.Main) = (r2v2 bin.mt.plus.Main), (r2v2 bin.mt.plus.Main), (r2v3 bin.mt.plus.Main), (r2v2 bin.mt.plus.Main) binds: [B:56:0x01e3, B:48:0x0192, B:36:0x0107, B:9:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x01e5: PHI (r7v4 short) = (r7v3 short), (r7v2 short), (r7v2 short), (r7v2 short) binds: [B:56:0x01e3, B:48:0x0192, B:36:0x0107, B:9:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x01e5: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:56:0x01e3, B:48:0x0192, B:36:0x0107, B:9:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x01e5: PHI (r10v4 short) = (r10v2 short), (r10v3 short), (r10v2 short), (r10v2 short) binds: [B:56:0x01e3, B:48:0x0192, B:36:0x0107, B:9:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0219 A[PHI: r6
      0x0219: PHI (r6v4 char) = (r6v3 char), (r6v2 char) binds: [B:60:0x0217, B:12:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0249 A[PHI: r3 r4 r13 r14 r15 r20
      0x0249: PHI (r3v4 int) = (r3v2 int), (r3v2 int), (r3v2 int), (r3v3 int), (r3v2 int), (r3v2 int), (r3v2 int) binds: [B:64:0x0247, B:32:0x00e5, B:28:0x00c5, B:24:0x00a5, B:18:0x0087, B:15:0x006b, B:12:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0249: PHI (r4v4 int) = (r4v2 int), (r4v2 int), (r4v2 int), (r4v3 int), (r4v2 int), (r4v2 int), (r4v2 int) binds: [B:64:0x0247, B:32:0x00e5, B:28:0x00c5, B:24:0x00a5, B:18:0x0087, B:15:0x006b, B:12:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0249: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:64:0x0247, B:32:0x00e5, B:28:0x00c5, B:24:0x00a5, B:18:0x0087, B:15:0x006b, B:12:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0249: PHI (r14v4 int) = (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:64:0x0247, B:32:0x00e5, B:28:0x00c5, B:24:0x00a5, B:18:0x0087, B:15:0x006b, B:12:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0249: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:64:0x0247, B:32:0x00e5, B:28:0x00c5, B:24:0x00a5, B:18:0x0087, B:15:0x006b, B:12:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0249: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:64:0x0247, B:32:0x00e5, B:28:0x00c5, B:24:0x00a5, B:18:0x0087, B:15:0x006b, B:12:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        int iM6981;
        int i;
        int i2;
        int i3 = C7811.f24123;
        int i4 = C0422.f1886;
        int iM6982 = (i4 - C2105.m6981("ۨ֨")) * 115;
        int i5 = ((iM6982 ^ i3) * 22405) ^ 1239185652;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM6982 ^ (-999973400);
        Main mainM49336 = null;
        int iM2566 = 0;
        int i7 = 0;
        char c = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 661693189;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i3) * 17187) >> 31));
            switch (i14) {
                case -2095816780:
                case 1862953702:
                    mainM49336 = C21923.m49336(this.f22634);
                    if (C4616.f14690 <= 0) {
                        iM6981 = (i4 - C0630.m2566("᩸ܳ")) * (-51);
                        i = ((iM6981 ^ i3) * (-2107)) ^ (-1446357905);
                        i2 = 1954416846;
                    } else {
                        iM6981 = (C2105.m6981("ۘ۠") + i4) * (-63);
                        i = ((iM6981 ^ i3) * 27793) ^ (-995333124);
                        i2 = 680126155;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -2092503326:
                case -201811967:
                    m20267(mainM49336, iM2566 ^ i7);
                    break;
                case -2082758843:
                case 815686472:
                    i12 = 5;
                    i13 = 3;
                    if (C2272.f7362) {
                        iM6981 = C2105.m6981("֨᩻") ^ i4;
                        i = ((iM6981 ^ i3) * (-4411)) ^ (-1492861305);
                        i2 = -1331781531;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ۨܺ")) * (-113);
                        i = ((iM6981 ^ i3) * (-16801)) ^ 1143571751;
                        i2 = -376313787;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1947927957:
                case -1175975300:
                    if (C4616.f14690 <= 0) {
                        iM6981 = C2105.m6981("֨᩻") ^ i4;
                        i = ((iM6981 ^ i3) * (-4411)) ^ (-1492861305);
                        i2 = -1331781531;
                    } else {
                        iM6981 = (C2105.m6981("ۛۙ") ^ i4) * 25;
                        i = ((iM6981 ^ i3) * 29773) ^ 1487442392;
                        i2 = 34928269;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1711346419:
                case 1865042286:
                    if ((i10 + 1) - i9 <= 0) {
                        iM6981 = C2105.m6981("ܳܿ") ^ i3;
                        i = ((iM6981 ^ i4) * 24199) ^ 1651704803;
                        i2 = 111181667;
                    } else {
                        iM6981 = C0630.m2566("۠ۚ") ^ i4;
                        i = ((iM6981 ^ i3) * 15751) ^ (-468763941);
                        i2 = -1404348362;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1691688168:
                case 1375599788:
                    i9 = i8 * i8;
                    s2 = 2;
                    if (C0050.f910 >= 0) {
                        iM6981 = (i4 - C0630.m2566("᩸ܳ")) * (-51);
                        i = ((iM6981 ^ i3) * (-2107)) ^ (-1446357905);
                        i2 = 1954416846;
                    } else {
                        iM6981 = C0630.m2566("᩻ܽ") ^ i3;
                        i = ((iM6981 ^ i4) * (-19481)) ^ (-817100884);
                        i2 = -731160638;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1675433793:
                case -1007037658:
                    C1916.m6308();
                    if (C1420.f5096 > 0) {
                        iM6981 = (C2105.m6981("ۛۙ") ^ i4) * 25;
                        i = ((iM6981 ^ i3) * 29773) ^ 1487442392;
                        i2 = 34928269;
                    } else {
                        iM6981 = (i4 - C0630.m2566("᩸ܳ")) * (-51);
                        i = ((iM6981 ^ i3) * (-2107)) ^ (-1446357905);
                        i2 = 1954416846;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1571709675:
                case 1234826624:
                    c = 4;
                    if (C1711.f5919) {
                        iM6981 = C0630.m2566("ۙ۟") ^ i3;
                        i = ((iM6981 ^ i4) * 14577) ^ 488839031;
                        i2 = 974447626;
                    } else {
                        iM6981 = C0630.m2566("ۨܿ") ^ i3;
                        i = ((iM6981 ^ i4) * (-1569)) ^ 1244588578;
                        i2 = -679091284;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1559376559:
                case 1719008188:
                    s = sArr[c];
                    if (C2272.f7362) {
                        iM6981 = (i4 - C0630.m2566("᩸ܳ")) * (-51);
                        i = ((iM6981 ^ i3) * (-2107)) ^ (-1446357905);
                        i2 = 1954416846;
                    } else {
                        iM6981 = (C2105.m6981("᩷ۜ") ^ i3) * 39;
                        i = ((iM6981 ^ i4) * (-26365)) ^ 399480711;
                        i2 = 194461811;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1468716361:
                case 958027673:
                    C4616.m13552();
                    break;
                case -1264533299:
                case -496254926:
                    i11 = 63087;
                    iM6981 = C0630.m2566("ۖܿ") ^ i3;
                    i = ((iM6981 ^ i4) * 7669) ^ 484166505;
                    i2 = 853819866;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1219470264:
                case -274956915:
                    i11 = 45648;
                    iM6981 = C0630.m2566("ۖܿ") ^ i3;
                    i = ((iM6981 ^ i4) * 7669) ^ 484166505;
                    i2 = 853819866;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -548029159:
                case -384240252:
                    iM2566 = C0630.m2566(RunnableC0588.m2436(sArr2, i12, i13, i11));
                    i7 = 2097199129;
                    if (C22628.m50615() != 0) {
                        iM6981 = C2105.m6981("֨᩻") ^ i4;
                        i = ((iM6981 ^ i3) * (-4411)) ^ (-1492861305);
                        i2 = -1331781531;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ۤۢ")) * 9;
                        i = ((iM6981 ^ i4) * (-30443)) ^ (-1189143629);
                        i2 = -1037450765;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -181796901:
                case 1109322859:
                    sArr = f22632;
                    if (C1504.f5354) {
                        iM6981 = C2105.m6981("֨᩻") ^ i4;
                        i = ((iM6981 ^ i3) * (-4411)) ^ (-1492861305);
                        i2 = -1331781531;
                    } else {
                        iM6981 = (i4 - C2105.m6981("᩹ۡ")) * 9;
                        i = ((iM6981 ^ i3) * 13733) ^ 2139486027;
                        i2 = 1115283028;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -177373950:
                case -22257520:
                    sArr2 = f22632;
                    if (C4075.f12947 >= 0) {
                        iM6981 = C2105.m6981("֨᩻") ^ i4;
                        i = ((iM6981 ^ i3) * (-4411)) ^ (-1492861305);
                        i2 = -1331781531;
                    } else {
                        iM6981 = C0630.m2566("ܿ֡") ^ i3;
                        i = ((iM6981 ^ i4) * 13563) ^ (-300806175);
                        i2 = 841727040;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 222944898:
                case 2109244864:
                    RunnableC0588.m2441();
                    if (C3683.m11222()) {
                        iM6981 = C0630.m2566("ۙ۟") ^ i3;
                        i = ((iM6981 ^ i4) * 14577) ^ 488839031;
                        i2 = 974447626;
                    } else {
                        iM6981 = C2105.m6981("֨᩻") ^ i4;
                        i = ((iM6981 ^ i3) * (-4411)) ^ (-1492861305);
                        i2 = -1331781531;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 398258749:
                case 1834970967:
                    i8 = s + 1;
                    if (C1916.f6442) {
                        iM6981 = (i4 - C2105.m6981("֡᩸")) * 57;
                        i = ((iM6981 ^ i3) * 4203) ^ (-91785077);
                        i2 = 387960610;
                    } else {
                        iM6981 = C2105.m6981("ܰۚ") ^ i3;
                        i = ((iM6981 ^ i4) * (-24959)) ^ (-447333771);
                        i2 = 1913254859;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 1735021074:
                case 1830098890:
                    AbstractC2021.m6574();
                    iM6981 = C2105.m6981("֨᩻") ^ i4;
                    i = ((iM6981 ^ i3) * (-4411)) ^ (-1492861305);
                    i2 = -1331781531;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                default:
                    i10 = s * s2;
                    if (C0422.f1886 <= 0) {
                        iM6981 = C2105.m6981("ܰۚ") ^ i3;
                        i = ((iM6981 ^ i4) * (-24959)) ^ (-447333771);
                        i2 = 1913254859;
                    } else {
                        iM6981 = C2105.m6981("ۤۨ") ^ i4;
                        i = ((iM6981 ^ i3) * 12027) ^ 1324645461;
                        i2 = -2129300856;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    public C7367(C16560 c16560, AbstractC15440 abstractC15440) {
        int i = 1726901177;
        int i2 = C2520.f8000;
        int i3 = ServiceConnectionC3453.f10921;
        this.f22634 = c16560;
        this.f22633 = abstractC15440;
        int iM6981 = (C2105.m6981("ۚۖ") ^ i3) * (-115);
        int i4 = ((iM6981 ^ i2) * (-32641)) ^ (-1028680325);
        int i5 = -105088547;
        while (true) {
            i = (iM6981 ^ i5) ^ (i4 & (((i ^ i2) * (-5357)) >> 31));
            switch (i) {
                case -1706574520:
                case 1901937189:
                    if (C4263.f13799 > 0) {
                        iM6981 = C0630.m2566("᩷ۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 5847) ^ 1045919348;
                        i5 = -70638735;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ۧ۟")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM6981 ^ i2) * 11511) ^ (-493921419);
                        i5 = 1840777138;
                    }
                    break;
                case -1674025296:
                case -1571141028:
                    C2272.m7503();
                    if (C0714.f2697 < 0) {
                        iM6981 = (i2 - C2105.m6981("۫ۘ")) * 57;
                        i4 = ((iM6981 ^ i3) * 17049) ^ 1702260746;
                        i5 = 1713510058;
                    } else {
                        iM6981 = C2105.m6981("ۖ᩺") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-30159)) ^ (-64053093);
                        i5 = 725278158;
                    }
                    break;
                case -1584287159:
                case 2048527233:
                    return;
                case -942815526:
                case 407406849:
                    if (C7106.f21815 != 0) {
                        iM6981 = (i2 - C2105.m6981("۫ۘ")) * 57;
                        i4 = ((iM6981 ^ i3) * 17049) ^ 1702260746;
                        i5 = 1713510058;
                    } else {
                        iM6981 = C0630.m2566("᩷ۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 5847) ^ 1045919348;
                        i5 = -70638735;
                    }
                    break;
                case -352723901:
                case 1886244980:
                    ViewOnClickListenerC1958.m6429();
                    C2520.m8026();
                    throw new RuntimeException();
                case -243315957:
                case 1836226666:
                    C3537.m10746();
                    C4159.m12565();
                    iM6981 = C0630.m2566("᩷ۨ") ^ i2;
                    i4 = ((iM6981 ^ i3) * 5847) ^ 1045919348;
                    i5 = -70638735;
                    break;
                default:
                    if (C4159.f13567) {
                        iM6981 = (C0630.m2566("ۤܺ") ^ i3) * (-43);
                        i4 = ((iM6981 ^ i2) * 29865) ^ 819580946;
                        i5 = -1813138601;
                    } else {
                        iM6981 = (C2105.m6981("᩵ۚ") + i2) * (-23);
                        i4 = ((iM6981 ^ i3) * (-27583)) ^ (-1157096867);
                        i5 = -270543439;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        C9840.m24910(this.f22633);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        C0237.m1487(this);
    }
}
