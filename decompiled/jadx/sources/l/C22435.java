package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩹ܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I9S1 */
/* JADX INFO: loaded from: classes.dex */
public final class C22435 extends AbstractC13262 {

    /* JADX INFO: renamed from: ᩷ᩳ᩵, reason: not valid java name and contains not printable characters */
    private static final short[] f72682;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static boolean f72683;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C21730 f72684;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte[] f72685;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte[] f72686;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f72687;

    static {
        ApplicationC12518.m30701(159);
        f72682 = new short[]{8307, -26794, -26798, -26812, -26794, -26798, -26812, -26824, -26796, -26795, -26796, -26824, -26809, -26788, -26796, -26812, -26846, -26809, -26762, -26765, -26765, -26754, -26759, -26768, -26823, -26766, -26759, -26764, -26819, -26819, -26819, -26818, -26823, -26766, -26759, -26764, 1910, 23608, 23579, 23582, 23642, 23580, 23571, 23574, 23583, 23616, 23642, 23611, 23615, 23593, -12497, 2591, 10231, 13420, 8734, -8509, 23611, 23615, 23593, 23637, 23609, 23608, 23609, 23637, 23594, 23601, 23609, 23593, 23631, 23594, 23579, 23582, 23582, 23571, 23572, 23581, 8448, -23893, -26280, 16543};
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static native AbstractC15440 m50360(AbstractC15440 abstractC15440, String str, byte[] bArr, byte[] bArr2);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static native boolean m50361(byte[] bArr, byte[] bArr2, byte[] bArr3);

    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ֫ */
    public native void mo32190();

    public C22435(AbstractC15440 abstractC15440) {
        this.f72687 = abstractC15440;
    }

    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ۘ */
    public final String mo10324() {
        return this.f72687.m36517() + '+';
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03ac A[PHI: r7 r8 r16 r17 r18 r19
      0x03ac: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:100:0x03aa, B:73:0x0296, B:9:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x03ac: PHI (r8v4 short) = (r8v2 short), (r8v3 short), (r8v2 short) binds: [B:100:0x03aa, B:73:0x0296, B:9:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x03ac: PHI (r16v29 int) = (r16v5 int), (r16v10 int), (r16v30 int) binds: [B:100:0x03aa, B:73:0x0296, B:9:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x03ac: PHI (r17v22 short[]) = (r17v1 short[]), (r17v6 short[]), (r17v23 short[]) binds: [B:100:0x03aa, B:73:0x0296, B:9:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x03ac: PHI (r18v22 char) = (r18v2 char), (r18v6 char), (r18v23 char) binds: [B:100:0x03aa, B:73:0x0296, B:9:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x03ac: PHI (r19v26 int) = (r19v2 int), (r19v7 int), (r19v27 int) binds: [B:100:0x03aa, B:73:0x0296, B:9:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:105:0x03e3 A[PHI: r16 r17 r18 r19
      0x03e3: PHI (r16v19 int) = (r16v4 int), (r16v6 int), (r16v20 int) binds: [B:104:0x03e1, B:96:0x0388, B:24:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x03e3: PHI (r17v15 short[]) = (r17v0 short[]), (r17v2 short[]), (r17v16 short[]) binds: [B:104:0x03e1, B:96:0x0388, B:24:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x03e3: PHI (r18v15 char) = (r18v1 char), (r18v3 char), (r18v16 char) binds: [B:104:0x03e1, B:96:0x0388, B:24:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x03e3: PHI (r19v16 int) = (r19v1 int), (r19v3 int), (r19v17 int) binds: [B:104:0x03e1, B:96:0x0388, B:24:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ᩵ */
    public void mo32196() {
        int iM2566;
        int i;
        int iM6981;
        int i2;
        int iM6982;
        int i3;
        int iM2567;
        int i4;
        String strM31506 = null;
        boolean zM50361 = false;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i5 = 0;
        int i6 = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = -970807502;
        int i10 = C2167.f7158;
        int i11 = C4117.f13076;
        int iM6983 = C2105.m6981("ۘܺ") ^ i10;
        int i12 = ((iM6983 ^ i11) * 2955) ^ (-2045177283);
        int i13 = 105075306;
        while (true) {
            int i14 = iM6983 ^ i13;
            while (true) {
                i9 = ((((i9 ^ i11) * (-11867)) >> 31) & i12) ^ i14;
                switch (i9) {
                    case -2137940910:
                    case -552270546:
                        c = c;
                        i5 = i5;
                        i9 = i9;
                        sArr = f72682;
                        if (C2167.f7158 >= 0) {
                            iM2566 = (i10 - C2105.m6981("᩸᩻")) * (-45);
                            i12 = ((iM2566 ^ i11) * (-441)) ^ 237530393;
                            i = -1414109227;
                        } else {
                            iM2566 = (C0630.m2566("۫ۙ") ^ i10) * (-77);
                            i12 = ((iM2566 ^ i11) * 4823) ^ (-1441122722);
                            i = 1043019611;
                        }
                        i14 = iM2566 ^ i;
                        i9 = i9;
                        c = c;
                        i5 = i5;
                        break;
                    case -2054654690:
                    case 822557623:
                        i8 = 46522;
                        iM6981 = (C0630.m2566("᩵֨") ^ i11) * (-89);
                        i12 = ((iM6981 ^ i10) * 23041) ^ 144011206;
                        i2 = -1090553296;
                        i14 = iM6981 ^ i2;
                        i9 = i9;
                        sArr = sArr;
                        c = c;
                        i5 = i5;
                        break;
                    case -1795810427:
                    case 1901074039:
                        sArr = sArr;
                        c = c;
                        i5 = i5;
                        i9 = i9;
                        if (C4263.f13799 <= 0) {
                            iM6981 = (i11 - C2105.m6981("᩺ᩳ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i12 = ((iM6981 ^ i10) * 6947) ^ (-952250541);
                            i2 = -1033496313;
                        } else {
                            iM6981 = C2105.m6981("᩺ۢ") ^ i10;
                            i12 = ((iM6981 ^ i11) * (-32371)) ^ 1066854072;
                            i2 = 63412577;
                        }
                        i14 = iM6981 ^ i2;
                        i9 = i9;
                        sArr = sArr;
                        c = c;
                        i5 = i5;
                        break;
                    case -1717198109:
                    case -1654362721:
                        sArr = sArr;
                        c = c;
                        i5 = i5;
                        i9 = i9;
                        i6 = i5 * i5;
                        s2 = 2;
                        if (C2167.f7158 >= 0) {
                            iM6981 = (i11 - C2105.m6981("᩺ᩳ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i12 = ((iM6981 ^ i10) * 6947) ^ (-952250541);
                            i2 = -1033496313;
                        } else {
                            iM6981 = C2105.m6981("۟ۙ") ^ i10;
                            i12 = ((iM6981 ^ i11) * (-27159)) ^ (-49603101);
                            i2 = 179491755;
                        }
                        i14 = iM6981 ^ i2;
                        i9 = i9;
                        sArr = sArr;
                        c = c;
                        i5 = i5;
                        break;
                    case -1625115421:
                    case -1591622220:
                        sArr = sArr;
                        c = c;
                        i5 = i5;
                        i9 = i9;
                        if (RunnableC1937.f6483 >= 0) {
                            iM6981 = (i11 - C0630.m2566("᩻۫")) * (-109);
                            i12 = ((iM6981 ^ i10) * 14721) ^ 455545845;
                            i2 = -648493887;
                        } else {
                            iM6981 = (C2105.m6981("ܳ֨") + i11) * (-107);
                            i12 = ((iM6981 ^ i10) * 26267) ^ (-602818820);
                            i2 = 766160041;
                        }
                        i14 = iM6981 ^ i2;
                        i9 = i9;
                        sArr = sArr;
                        c = c;
                        i5 = i5;
                        break;
                    case -1619656746:
                    case 990063499:
                        short[] sArr2 = sArr;
                        char c2 = c;
                        i5 = s + 1;
                        if (C0964.m3413()) {
                            iM2567 = C0630.m2566("ۢ᩶") ^ i10;
                            i12 = ((iM2567 ^ i11) * (-20723)) ^ (-1443230931);
                            i4 = 1089716497;
                        } else {
                            iM2567 = C0630.m2566("ᩴۙ") ^ i10;
                            i12 = ((iM2567 ^ i11) * 10987) ^ 284914976;
                            i4 = -1602161447;
                        }
                        i14 = iM2567 ^ i4;
                        i9 = i9;
                        sArr = sArr2;
                        c = c2;
                        break;
                    case -1590669134:
                    case 1141748863:
                        C0964.m3413();
                        C3683.m11222();
                        break;
                    case -1294851525:
                    case 497715591:
                        break;
                    case -1184751564:
                    case 1043136384:
                        sArr = sArr;
                        c = c;
                        i5 = i5;
                        i9 = i9;
                        if (zM50361) {
                            iM6981 = C0630.m2566("ᩳۙ") ^ i11;
                            i12 = ((iM6981 ^ i10) * (-667)) ^ 2069891263;
                            i2 = -468155814;
                        } else {
                            iM6981 = C0630.m2566("᩻ᩳ") ^ i10;
                            i12 = ((iM6981 ^ i11) * 19015) ^ 556926682;
                            i2 = -130285535;
                        }
                        i14 = iM6981 ^ i2;
                        i9 = i9;
                        sArr = sArr;
                        c = c;
                        i5 = i5;
                        break;
                    case -1172444767:
                    case -295341485:
                        C4117.m12364();
                        iM6983 = (i11 - C0630.m2566("ᩳ᩷")) * (-91);
                        i12 = ((iM6983 ^ i10) * (-22541)) ^ (-296846522);
                        i13 = -2035108707;
                        break;
                    case -1054391775:
                    case 2058626428:
                        sArr = sArr;
                        c = c;
                        i5 = i5;
                        i9 = i9;
                        C12951 c12951M36528 = this.f72687.m36528();
                        C22124.m49722((InterfaceC20008) c12951M36528, -1395514437);
                        byte[] bArr = new byte[64];
                        c12951M36528.m31489(64, bArr);
                        byte[] bArr2 = new byte[16];
                        c12951M36528.m31489(16, bArr2);
                        strM31506 = c12951M36528.m31506();
                        zM50361 = m50361(bArr, bArr2, c12951M36528.m31496());
                        iM6981 = (C2105.m6981("᩵ᩳ") + i10) * 63;
                        i12 = ((iM6981 ^ i11) * (-17837)) ^ 1685826549;
                        i2 = 1127229884;
                        i14 = iM6981 ^ i2;
                        i9 = i9;
                        sArr = sArr;
                        c = c;
                        i5 = i5;
                        break;
                    case -1015855257:
                    case -739998633:
                        sArr = sArr;
                        c = c;
                        i5 = i5;
                        i9 = i9;
                        i7 = s * s2;
                        if (C11340.f33930 >= 0) {
                            iM6981 = (i11 - C0630.m2566("ۜۧ")) * (-99);
                            i12 = ((iM6981 ^ i10) * (-10699)) ^ (-1307262088);
                            i2 = 440725442;
                        } else {
                            iM6981 = C2105.m6981("ۙ᩸") ^ i11;
                            i12 = ((iM6981 ^ i10) * 19959) ^ (-349621093);
                            i2 = 1663198680;
                        }
                        i14 = iM6981 ^ i2;
                        i9 = i9;
                        sArr = sArr;
                        c = c;
                        i5 = i5;
                        break;
                    case -1003868561:
                    case -566835308:
                        if (C0714.f2697 >= 0) {
                            sArr = sArr;
                            c = c;
                            i5 = i5;
                            i9 = i9;
                            iM6981 = (i11 - C0630.m2566("ۜۧ")) * (-99);
                            i12 = ((iM6981 ^ i10) * (-10699)) ^ (-1307262088);
                            i2 = 440725442;
                            i14 = iM6981 ^ i2;
                            i9 = i9;
                            sArr = sArr;
                            c = c;
                            i5 = i5;
                        }
                        c = c;
                        i5 = i5;
                        i9 = i9;
                        iM2566 = (i10 - C2105.m6981("᩸᩻")) * (-45);
                        i12 = ((iM2566 ^ i11) * (-441)) ^ 237530393;
                        i = -1414109227;
                        i14 = iM2566 ^ i;
                        i9 = i9;
                        c = c;
                        i5 = i5;
                        break;
                    case -998305745:
                    case 1529399085:
                        C4616.m13552();
                        if (C3911.f12484 < 0) {
                            iM6983 = (C2105.m6981("ۨۡ") ^ i10) * 119;
                            i12 = ((iM6983 ^ i11) * 22481) ^ 473424975;
                            i13 = 1640490882;
                        } else {
                            iM6983 = (C0630.m2566("᩷ܺ") + i11) * (-3);
                            i12 = ((iM6983 ^ i10) * 28061) ^ (-1218635642);
                            i13 = 1099207811;
                        }
                        break;
                    case -934731737:
                    case 43148197:
                        sArr = sArr;
                        c = c;
                        i5 = i5;
                        i9 = i9;
                        s = sArr[c];
                        if (C7106.f21815 == 0) {
                            iM6981 = (C2105.m6981("᩻ܽ") + i11) * 33;
                            i12 = ((iM6981 ^ i10) * (-8373)) ^ 1605442296;
                            i2 = -1357754305;
                            i14 = iM6981 ^ i2;
                            i9 = i9;
                            sArr = sArr;
                            c = c;
                            i5 = i5;
                        } else {
                            sArr = sArr;
                            iM2566 = (i10 - C2105.m6981("᩸᩻")) * (-45);
                            i12 = ((iM2566 ^ i11) * (-441)) ^ 237530393;
                            i = -1414109227;
                            i14 = iM2566 ^ i;
                            i9 = i9;
                            c = c;
                            i5 = i5;
                        }
                        break;
                    case -724477260:
                    case 545980306:
                        C22628.m50615();
                        if (!C0422.m1963()) {
                            iM6983 = (i10 - C2105.m6981("᩻᩷")) * 3;
                            i12 = ((iM6983 ^ i11) * 17343) ^ 1038184389;
                            i13 = -791580301;
                        } else {
                            iM6983 = (i11 - C0630.m2566("ᩳ᩷")) * (-91);
                            i12 = ((iM6983 ^ i10) * (-22541)) ^ (-296846522);
                            i13 = -2035108707;
                        }
                        break;
                    case -649861024:
                    case 1634113006:
                        sArr = sArr;
                        c = c;
                        i5 = i5;
                        i9 = i9;
                        if (C7106.f21815 == 0) {
                            iM6981 = (C2105.m6981("ܳᩴ") ^ i10) * (-71);
                            i12 = ((iM6981 ^ i11) * 10019) ^ 623729213;
                            i2 = -684137888;
                            i14 = iM6981 ^ i2;
                            i9 = i9;
                            sArr = sArr;
                            c = c;
                            i5 = i5;
                        } else {
                            c = c;
                            iM6982 = (C2105.m6981("۬ܳ") ^ i10) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i12 = ((iM6982 ^ i11) * 3) ^ 929551641;
                            i3 = 724568638;
                            i14 = iM6982 ^ i3;
                            i9 = i9;
                            sArr = sArr;
                            i5 = i5;
                        }
                        break;
                    case -643246361:
                    case 1743267596:
                        C3683.m11222();
                        if (C1294.m4372() <= 0) {
                            sArr = sArr;
                            c = c;
                            i5 = i5;
                            i9 = i9;
                            iM6981 = (i11 - C0630.m2566("᩻۫")) * (-109);
                            i12 = ((iM6981 ^ i10) * 14721) ^ 455545845;
                            i2 = -648493887;
                            i14 = iM6981 ^ i2;
                            i9 = i9;
                            sArr = sArr;
                            c = c;
                            i5 = i5;
                        } else {
                            iM6983 = (C2105.m6981("ۨۡ") ^ i10) * 119;
                            i12 = ((iM6983 ^ i11) * 22481) ^ 473424975;
                            i13 = 1640490882;
                        }
                        break;
                    case -627953937:
                    case 2073641154:
                        sArr = sArr;
                        c = c;
                        i5 = i5;
                        i9 = i9;
                        if (C2126.m7040()) {
                            iM6981 = (i11 - C0630.m2566("᩻۫")) * (-109);
                            i12 = ((iM6981 ^ i10) * 14721) ^ 455545845;
                            i2 = -648493887;
                        } else {
                            iM6981 = C0630.m2566("֡ۤ") ^ i11;
                            i12 = ((iM6981 ^ i10) * 21029) ^ 1555328548;
                            i2 = 934263338;
                        }
                        i14 = iM6981 ^ i2;
                        i9 = i9;
                        sArr = sArr;
                        c = c;
                        i5 = i5;
                        break;
                    case -186647030:
                    case 1725460523:
                        if (C3432.f10845 >= 0) {
                            iM6983 = (C0630.m2566("᩷ܺ") + i11) * (-3);
                            i12 = ((iM6983 ^ i10) * 28061) ^ (-1218635642);
                            i13 = 1099207811;
                        } else {
                            iM6983 = (i11 - C0630.m2566("ᩳ᩷")) * (-91);
                            i12 = ((iM6983 ^ i10) * (-22541)) ^ (-296846522);
                            i13 = -2035108707;
                        }
                        break;
                    case 101605546:
                    case 560579423:
                        try {
                            i9 = i9;
                            try {
                                sArr = sArr;
                                try {
                                    c = c;
                                    i5 = i5;
                                    try {
                                        this.f72684 = new C21730(strM31506, mo10324(), C3245.m9924(C2105.m6981(ViewOnClickListenerC1958.m6435(f72682, 77, 3, i8)) ^ 2120811077, new Object[]{strM31506}));
                                        break;
                                    } catch (Exception unused) {
                                    }
                                } catch (Exception unused2) {
                                    c = c;
                                    i5 = i5;
                                }
                            } catch (Exception unused3) {
                                sArr = sArr;
                            }
                        } catch (Exception unused4) {
                            sArr = sArr;
                            c = c;
                            i5 = i5;
                            i9 = i9;
                        }
                        iM6981 = C0630.m2566("ᩳۙ") ^ i11;
                        i12 = ((iM6981 ^ i10) * (-667)) ^ 2069891263;
                        i2 = -468155814;
                        i14 = iM6981 ^ i2;
                        i9 = i9;
                        sArr = sArr;
                        c = c;
                        i5 = i5;
                        break;
                    case 523840873:
                    case 2011662484:
                        i8 = 49989;
                        iM6981 = (C0630.m2566("᩵֨") ^ i11) * (-89);
                        i12 = ((iM6981 ^ i10) * 23041) ^ 144011206;
                        i2 = -1090553296;
                        i14 = iM6981 ^ i2;
                        i9 = i9;
                        sArr = sArr;
                        c = c;
                        i5 = i5;
                        break;
                    case 615194064:
                    case 1836209820:
                        sArr = sArr;
                        c = c;
                        i5 = i5;
                        i9 = i9;
                        this.f72684 = null;
                        iM6981 = (C2105.m6981("ۨ᩹") ^ i10) * 63;
                        i12 = ((iM6981 ^ i11) * 19461) ^ (-1762728645);
                        i2 = 117216373;
                        i14 = iM6981 ^ i2;
                        i9 = i9;
                        sArr = sArr;
                        c = c;
                        i5 = i5;
                        break;
                    case 904597952:
                    case 1874922633:
                        sArr = sArr;
                        c = c;
                        i5 = i5;
                        i9 = i9;
                        if ((i7 + 1) - i6 > 0) {
                            iM6981 = C2105.m6981("ܺۘ") ^ i11;
                            i12 = ((iM6981 ^ i10) * 27125) ^ (-1188606142);
                            i2 = -750712473;
                        } else {
                            iM6981 = C0630.m2566("۬᩹") ^ i10;
                            i12 = ((iM6981 ^ i11) * 23967) ^ 598740489;
                            i2 = -1364068929;
                        }
                        i14 = iM6981 ^ i2;
                        i9 = i9;
                        sArr = sArr;
                        c = c;
                        i5 = i5;
                        break;
                    case 1216834474:
                    case 1849525743:
                        sArr = sArr;
                        i5 = i5;
                        i9 = i9;
                        c = 'L';
                        if (C2126.m7040()) {
                            iM6982 = (C2105.m6981("۬ܳ") ^ i10) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i12 = ((iM6982 ^ i11) * 3) ^ 929551641;
                            i3 = 724568638;
                        } else {
                            iM6982 = C2105.m6981("ۡۗ") ^ i11;
                            i12 = ((iM6982 ^ i10) * (-13617)) ^ (-1482443365);
                            i3 = 1415259412;
                        }
                        i14 = iM6982 ^ i3;
                        i9 = i9;
                        sArr = sArr;
                        i5 = i5;
                        break;
                    case 1226980058:
                    case 1570549173:
                        C2105.m6982();
                        if (C3911.f12484 < 0) {
                            sArr = sArr;
                            i5 = i5;
                            i9 = i9;
                            iM6982 = (C2105.m6981("۬ܳ") ^ i10) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i12 = ((iM6982 ^ i11) * 3) ^ 929551641;
                            i3 = 724568638;
                            i14 = iM6982 ^ i3;
                            i9 = i9;
                            sArr = sArr;
                            i5 = i5;
                        } else {
                            iM6983 = (i10 - C2105.m6981("᩻᩷")) * 3;
                            i12 = ((iM6983 ^ i11) * 17343) ^ 1038184389;
                            i13 = -791580301;
                        }
                        break;
                    case 1316173444:
                    case 1780152302:
                        C2958.m9034();
                        if (RunnableC0588.m2441() < 0) {
                            iM6983 = (C0630.m2566("᩷ܺ") + i11) * (-3);
                            i12 = ((iM6983 ^ i10) * 28061) ^ (-1218635642);
                            i13 = 1099207811;
                        }
                        c = c;
                        i5 = i5;
                        i9 = i9;
                        iM2566 = (i10 - C2105.m6981("᩸᩻")) * (-45);
                        i12 = ((iM2566 ^ i11) * (-441)) ^ 237530393;
                        i = -1414109227;
                        i14 = iM2566 ^ i;
                        i9 = i9;
                        c = c;
                        i5 = i5;
                        break;
                    default:
                        if (RunnableC3474.f10992 > 0) {
                            sArr = sArr;
                            c = c;
                            i5 = i5;
                            i9 = i9;
                            iM6981 = (i11 - C2105.m6981("᩺ᩳ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i12 = ((iM6981 ^ i10) * 6947) ^ (-952250541);
                            i2 = -1033496313;
                            i14 = iM6981 ^ i2;
                            i9 = i9;
                            sArr = sArr;
                            c = c;
                            i5 = i5;
                        } else {
                            iM6983 = (C2105.m6981("ۨۡ") ^ i10) * 119;
                            i12 = ((iM6983 ^ i11) * 22481) ^ 473424975;
                            i13 = 1640490882;
                        }
                        break;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C21730 m50362() {
        return this.f72684;
    }

    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ֡ */
    public final void mo14000() {
        this.f72685 = null;
        this.f72686 = null;
    }

    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ۜ */
    public final byte[] mo10325() {
        return this.f72685;
    }

    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ᩷ */
    public final byte[] mo10326() {
        return this.f72686;
    }

    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ۖ */
    public final String mo14002() {
        return this.f72687.getName();
    }

    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ۢ */
    public final String mo14004() {
        return this.f72687.getName();
    }

    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ܳ */
    public final String mo14006() {
        return this.f72687.m36517();
    }

    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ֫ */
    public final String mo14001(String str) {
        String strConcat = str.concat(".enc");
        AbstractC15440 abstractC15440 = this.f72687;
        return C16999.m39861(abstractC15440, abstractC15440.m36524(strConcat));
    }

    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ۧ */
    public final void mo14005() {
        this.f72687.mo27929();
    }

    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ܿ */
    public final String mo14007() {
        return this.f72687.getName();
    }

    @Override // l.AbstractC13262
    /* JADX INFO: renamed from: ᩳ */
    public final byte[] mo14008() throws IOException {
        byte[] bArrM36506 = this.f72687.m36506();
        C22124.m49722((InterfaceC20008) new C12951(bArrM36506), -1395514437);
        return bArrM36506;
    }
}
