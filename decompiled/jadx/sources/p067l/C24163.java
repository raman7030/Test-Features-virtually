package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩺ۤܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44W5 */
/* JADX INFO: loaded from: classes.dex */
public final class C24163 implements InterfaceC12647 {

    /* JADX INFO: renamed from: ۫ܿ֨, reason: not valid java name and contains not printable characters */
    private static final short[] f83040 = {3921, -12887, -12923, -12901, -12905, -12902, -12897, -12840, -12916, -12897, -12922, 7739, -19312, -24024, -28258};

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ AbstractC17043 f76623;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C18107 f76624;

    /* JADX WARN: Code duplicated, block: B:12:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d4 A[PHI: r13 r17
      0x00d4: PHI (r13v3 int) = (r13v2 int), (r13v1 int) binds: [B:30:0x00d2, B:14:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x00d4: PHI (r17v22 int) = (r17v17 int), (r17v23 int) binds: [B:30:0x00d2, B:14:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x0190 A[PHI: r1 r2 r9 r17
      0x0190: PHI (r1v4 int) = (r1v1 int), (r1v2 int), (r1v1 int) binds: [B:45:0x018e, B:22:0x0091, B:8:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0190: PHI (r2v4 int) = (r2v1 int), (r2v2 int), (r2v1 int) binds: [B:45:0x018e, B:22:0x0091, B:8:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0190: PHI (r9v4 int) = (r9v2 int), (r9v1 int), (r9v1 int) binds: [B:45:0x018e, B:22:0x0091, B:8:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0190: PHI (r17v29 int) = (r17v11 int), (r17v20 int), (r17v30 int) binds: [B:45:0x018e, B:22:0x0091, B:8:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x01eb A[PHI: r6 r11 r12 r17 r18
      0x01eb: PHI (r6v3 int) = (r6v2 int), (r6v1 int), (r6v1 int) binds: [B:53:0x01e9, B:34:0x010b, B:26:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x01eb: PHI (r11v3 short[]) = (r11v1 short[]), (r11v2 short[]), (r11v1 short[]) binds: [B:53:0x01e9, B:34:0x010b, B:26:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x01eb: PHI (r12v3 int) = (r12v1 int), (r12v2 int), (r12v1 int) binds: [B:53:0x01e9, B:34:0x010b, B:26:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x01eb: PHI (r17v18 int) = (r17v9 int), (r17v16 int), (r17v19 int) binds: [B:53:0x01e9, B:34:0x010b, B:26:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x01eb: PHI (r18v2 java.lang.String) = (r18v1 java.lang.String), (r18v1 java.lang.String), (r18v3 java.lang.String) binds: [B:53:0x01e9, B:34:0x010b, B:26:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0265 A[PHI: r3 r4 r5 r7 r8 r17
      0x0265: PHI (r3v3 short[]) = (r3v2 short[]), (r3v1 short[]), (r3v1 short[]), (r3v1 short[]), (r3v1 short[]), (r3v1 short[]), (r3v1 short[]) binds: [B:65:0x0263, B:61:0x0241, B:57:0x0221, B:49:0x01c8, B:16:0x006e, B:14:0x006a, B:11:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r4v3 char) = (r4v1 char), (r4v2 char), (r4v1 char), (r4v1 char), (r4v1 char), (r4v1 char), (r4v1 char) binds: [B:65:0x0263, B:61:0x0241, B:57:0x0221, B:49:0x01c8, B:16:0x006e, B:14:0x006a, B:11:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r5v3 short) = (r5v1 short), (r5v1 short), (r5v2 short), (r5v1 short), (r5v1 short), (r5v1 short), (r5v1 short) binds: [B:65:0x0263, B:61:0x0241, B:57:0x0221, B:49:0x01c8, B:16:0x006e, B:14:0x006a, B:11:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r7v3 int) = (r7v1 int), (r7v1 int), (r7v1 int), (r7v2 int), (r7v1 int), (r7v1 int), (r7v1 int) binds: [B:65:0x0263, B:61:0x0241, B:57:0x0221, B:49:0x01c8, B:16:0x006e, B:14:0x006a, B:11:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r8v3 int) = (r8v1 int), (r8v1 int), (r8v1 int), (r8v2 int), (r8v1 int), (r8v1 int), (r8v1 int) binds: [B:65:0x0263, B:61:0x0241, B:57:0x0221, B:49:0x01c8, B:16:0x006e, B:14:0x006a, B:11:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r17v24 int) = (r17v6 int), (r17v7 int), (r17v8 int), (r17v10 int), (r17v21 int), (r17v23 int), (r17v25 int) binds: [B:65:0x0263, B:61:0x0241, B:57:0x0221, B:49:0x01c8, B:16:0x006e, B:14:0x006a, B:11:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.InterfaceC12647
    /* JADX INFO: renamed from: ܽ */
    public final String mo29077() {
        int iM55680;
        int i;
        int i2;
        int iM55979 = 0;
        int i3 = 0;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        short[] sArr2 = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = -286057022;
        int i12 = C0912.f81867;
        int i13 = C1071.f81975;
        int iM55681 = (C0873.m55680("֨ۜ") ^ i13) * (-65);
        int i14 = ((iM55681 ^ i12) * (-9889)) ^ (-1972154881);
        int i15 = iM55681 ^ (-537365682);
        String strM55936 = null;
        while (true) {
            int i16 = i15 ^ (i14 & (((i11 ^ i12) * (-17475)) >> 31));
            switch (i16) {
                case -2109823113:
                case 1802334378:
                    i16 = i16;
                    int i17 = i6 + i7;
                    if (i5 - (i17 + i17) > 0) {
                        iM55680 = (C0873.m55680("ۛ۟") ^ i12) * 41;
                        i = ((iM55680 ^ i13) * (-18837)) ^ (-774043802);
                        i2 = 1865633131;
                    } else {
                        iM55680 = (i13 - C0946.m55979("ᩴ᩶")) * 71;
                        i = ((iM55680 ^ i12) * (-1749)) ^ 709009554;
                        i2 = -2035498447;
                    }
                    int i18 = i16;
                    i15 = iM55680 ^ i2;
                    i14 = i;
                    i11 = i18;
                    break;
                case -1967729502:
                case 2071952107:
                    C0877.m55696();
                    return null;
                case -1909730851:
                case 1229151392:
                    i16 = i16;
                    if (C0898.m55800() <= 0) {
                        iM55680 = C0873.m55680("ۤۗ") ^ i12;
                        i = ((iM55680 ^ i13) * (-21175)) ^ (-171513514);
                        i2 = -914566331;
                    } else {
                        iM55680 = (C0946.m55979("ۗۜ") ^ i13) * 19;
                        i = ((iM55680 ^ i12) * 18767) ^ (-17836858);
                        i2 = 1724087943;
                    }
                    int i19 = i16;
                    i15 = iM55680 ^ i2;
                    i14 = i;
                    i11 = i19;
                    break;
                case -1878226155:
                case -1122640636:
                    i16 = i16;
                    i7 = 392515344;
                    if (C1025.f81947 >= 0) {
                        iM55680 = C0946.m55979("۬ۢ") ^ i13;
                        i = ((iM55680 ^ i12) * 14537) ^ (-1803849031);
                        i2 = 2098695106;
                    } else {
                        iM55680 = (C0946.m55979("᩻֡") + i13) * 119;
                        i = ((iM55680 ^ i12) * 19653) ^ (-884464437);
                        i2 = 1773784864;
                    }
                    int i110 = i16;
                    i15 = iM55680 ^ i2;
                    i14 = i;
                    i11 = i110;
                    break;
                case -1373340179:
                case -1268159717:
                    i8 = 54763;
                    iM55680 = (C0873.m55680("᩹۠") ^ i13) * 11;
                    i = ((iM55680 ^ i12) * 1275) ^ (-1622872085);
                    i2 = -1260728521;
                    int i111 = i16;
                    i15 = iM55680 ^ i2;
                    i14 = i;
                    i11 = i111;
                    break;
                case -1266963188:
                case -369776858:
                    i16 = i16;
                    s = sArr[c];
                    if (C1017.m56187() <= 0) {
                        iM55680 = C0873.m55680("ۤۗ") ^ i12;
                        i = ((iM55680 ^ i13) * (-21175)) ^ (-171513514);
                        i2 = -914566331;
                    } else {
                        iM55680 = (C0873.m55680("ۧۚ") + i13) * 53;
                        i = ((iM55680 ^ i12) * 22109) ^ (-1393586442);
                        i2 = -1104859067;
                    }
                    int i112 = i16;
                    i15 = iM55680 ^ i2;
                    i14 = i;
                    i11 = i112;
                    break;
                case -1188941768:
                case -651055173:
                    i16 = i16;
                    C1036.m56257();
                    C0917.m55854();
                    iM55680 = C0873.m55680("ۤۗ") ^ i12;
                    i = ((iM55680 ^ i13) * (-21175)) ^ (-171513514);
                    i2 = -914566331;
                    int i113 = i16;
                    i15 = iM55680 ^ i2;
                    i14 = i;
                    i11 = i113;
                    break;
                case -1153964758:
                case 1180543219:
                    i16 = i16;
                    i4 = s + 19812;
                    if (C1046.f81962 <= 0) {
                        iM55680 = (C0873.m55680("ܳۛ") + i12) * 19;
                        i = ((iM55680 ^ i13) * 21479) ^ 113584426;
                        i2 = 110662492;
                    } else {
                        iM55680 = (C0946.m55979("ܳ᩶") ^ i12) * 43;
                        i = ((iM55680 ^ i13) * 30573) ^ 1443539158;
                        i2 = 1262597250;
                    }
                    int i114 = i16;
                    i15 = iM55680 ^ i2;
                    i14 = i;
                    i11 = i114;
                    break;
                case -1062180566:
                case 885496055:
                    i16 = i16;
                    i10 = 3;
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = (C0946.m55979("ۗۜ") ^ i13) * 19;
                        i = ((iM55680 ^ i12) * 18767) ^ (-17836858);
                        i2 = 1724087943;
                    } else {
                        iM55680 = (C0873.m55680("ۤ۟") ^ i12) * (-37);
                        i = ((iM55680 ^ i13) * 15667) ^ (-1459813832);
                        i2 = 1346290395;
                    }
                    int i115 = i16;
                    i15 = iM55680 ^ i2;
                    i14 = i;
                    i11 = i115;
                    break;
                case -1053783083:
                case -174970558:
                    i16 = i16;
                    sArr = f83040;
                    if (C1044.m56286() <= 0) {
                        iM55680 = C0873.m55680("ۤۗ") ^ i12;
                        i = ((iM55680 ^ i13) * (-21175)) ^ (-171513514);
                        i2 = -914566331;
                    } else {
                        iM55680 = (C0873.m55680("ۜ֫") ^ i12) * (-27);
                        i = ((iM55680 ^ i13) * 29817) ^ (-849828135);
                        i2 = 14695503;
                    }
                    int i116 = i16;
                    i15 = iM55680 ^ i2;
                    i14 = i;
                    i11 = i116;
                    break;
                case -941166384:
                case 699534271:
                    i16 = i16;
                    i5 = i4 * i4;
                    i6 = s * s;
                    if (C1964.m56597() != 0) {
                        iM55680 = C0873.m55680("ۤۗ") ^ i12;
                        i = ((iM55680 ^ i13) * (-21175)) ^ (-171513514);
                        i2 = -914566331;
                    } else {
                        iM55680 = (C0946.m55979("᩵ܶ") + i12) * (-67);
                        i = ((iM55680 ^ i13) * 9383) ^ (-697640810);
                        i2 = -65396507;
                    }
                    int i117 = i16;
                    i15 = iM55680 ^ i2;
                    i14 = i;
                    i11 = i117;
                    break;
                case -648941144:
                case 142208542:
                    i16 = i16;
                    c = 11;
                    if (C0955.f81898) {
                        iM55680 = C0873.m55680("ۤۗ") ^ i12;
                        i = ((iM55680 ^ i13) * (-21175)) ^ (-171513514);
                        i2 = -914566331;
                    } else {
                        iM55680 = (C0946.m55979("ᩴۤ") + i13) * 109;
                        i = ((iM55680 ^ i12) * 32413) ^ (-922070146);
                        i2 = -886684932;
                    }
                    int i118 = i16;
                    i15 = iM55680 ^ i2;
                    i14 = i;
                    i11 = i118;
                    break;
                case -369734541:
                case 1000129283:
                    i8 = 57315;
                    iM55680 = (C0873.m55680("᩹۠") ^ i13) * 11;
                    i = ((iM55680 ^ i12) * 1275) ^ (-1622872085);
                    i2 = -1260728521;
                    int i119 = i16;
                    i15 = iM55680 ^ i2;
                    i14 = i;
                    i11 = i119;
                    break;
                case -360221523:
                case 1419361732:
                    i16 = i16;
                    iM55979 = C0946.m55979(strM55936);
                    i3 = 2125521762;
                    if (RunnableC0938.m55938() != 0) {
                        iM55680 = C0946.m55979("۬ۢ") ^ i13;
                        i = ((iM55680 ^ i12) * 14537) ^ (-1803849031);
                        i2 = 2098695106;
                    } else {
                        iM55680 = C0946.m55979("۫֡") ^ i13;
                        i = ((iM55680 ^ i12) * (-9119)) ^ (-1009853666);
                        i2 = -924416119;
                    }
                    int i1110 = i16;
                    i15 = iM55680 ^ i2;
                    i14 = i;
                    i11 = i1110;
                    break;
                case -295860897:
                case 1074091075:
                    return ServiceConnectionC1013.m56156(iM55979 ^ i3);
                case 294588370:
                case 489362746:
                    i16 = i16;
                    sArr2 = f83040;
                    i9 = 12;
                    if (C0882.f81846) {
                        iM55680 = (C0873.m55680("ܳۛ") + i12) * 19;
                        i = ((iM55680 ^ i13) * 21479) ^ 113584426;
                        i2 = 110662492;
                    } else {
                        iM55680 = (C0946.m55979("۟᩸") ^ i12) * (-57);
                        i = ((iM55680 ^ i13) * (-5769)) ^ 501860208;
                        i2 = 659185169;
                    }
                    int i1111 = i16;
                    i15 = iM55680 ^ i2;
                    i14 = i;
                    i11 = i1111;
                    break;
                case 1115543679:
                case 1538033780:
                    if (C0861.f81831) {
                        iM55680 = C0946.m55979("ۜ۠") ^ i12;
                        i16 = i16;
                        i = ((iM55680 ^ i13) * (-4197)) ^ 458136205;
                        i2 = 176774320;
                    } else {
                        i16 = i16;
                        iM55680 = C0873.m55680("ۤۗ") ^ i12;
                        i = ((iM55680 ^ i13) * (-21175)) ^ (-171513514);
                        i2 = -914566331;
                    }
                    int i1112 = i16;
                    i15 = iM55680 ^ i2;
                    i14 = i;
                    i11 = i1112;
                    break;
                case 1676810414:
                case 1775897497:
                    i16 = i16;
                    strM55936 = RunnableC0938.m55936(sArr2, i9, i10, i8);
                    if (C1017.f81942 >= 0) {
                        iM55680 = (C0873.m55680("ܳۛ") + i12) * 19;
                        i = ((iM55680 ^ i13) * 21479) ^ 113584426;
                        i2 = 110662492;
                    } else {
                        iM55680 = C0946.m55979("ۙ۠") ^ i13;
                        i = ((iM55680 ^ i12) * (-14511)) ^ 6360586;
                        i2 = -868454070;
                    }
                    int i1113 = i16;
                    i15 = iM55680 ^ i2;
                    i14 = i;
                    i11 = i1113;
                    break;
                default:
                    RunnableC1014.m56177();
                    if (C1024.f81946) {
                        i16 = i16;
                        iM55680 = C0946.m55979("۬ۢ") ^ i13;
                        i = ((iM55680 ^ i12) * 14537) ^ (-1803849031);
                        i2 = 2098695106;
                    } else {
                        iM55680 = C0946.m55979("ۜ۠") ^ i12;
                        i16 = i16;
                        i = ((iM55680 ^ i13) * (-4197)) ^ 458136205;
                        i2 = 176774320;
                    }
                    int i1114 = i16;
                    i15 = iM55680 ^ i2;
                    i14 = i;
                    i11 = i1114;
                    break;
            }
        }
    }

    @Override // p067l.InterfaceC12647
    /* JADX INFO: renamed from: ֫ */
    public final void mo29075(AbstractC17043 abstractC17043) {
        C18107 c18107 = null;
        int i = -828479898;
        int i2 = C0894.f81854;
        int i3 = C0866.f81837;
        int iM55979 = C0946.m55979("ܽܿ") ^ i2;
        int i4 = ((iM55979 ^ i3) * (-21621)) ^ (-410844258);
        int i5 = 1110643097;
        while (true) {
            i = ((((i ^ i3) * (-23469)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2084469258:
                case -1201847726:
                    if (C1036.f81953 >= 0) {
                        iM55979 = (C0873.m55680("ۘۧ") + i2) * 9;
                        i4 = ((iM55979 ^ i3) * (-24231)) ^ 1145124276;
                        i5 = 1492380436;
                    } else {
                        iM55979 = C0873.m55680("᩸֡") ^ i3;
                        i4 = ((iM55979 ^ i2) * 7959) ^ (-926696602);
                        i5 = -771551260;
                    }
                    break;
                case -1991265324:
                case -1957598755:
                    C0877.m55696();
                    if (RunnableC0897.m55784()) {
                        iM55979 = C0873.m55680("᩸֡") ^ i3;
                        i4 = ((iM55979 ^ i2) * 7959) ^ (-926696602);
                        i5 = -771551260;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ܽۚ")) * 35;
                        i4 = ((iM55979 ^ i2) * (-4313)) ^ 1871380505;
                        i5 = 971532096;
                    }
                    break;
                case -1853899881:
                case 1947797656:
                    C1025.m56229(c18107, C1404.m56460(abstractC17043));
                    break;
                case -1580462292:
                case 2086349595:
                    C0937.m55918();
                    if (ServiceConnectionC1013.f81940 < 0) {
                        iM55979 = C0873.m55680("᩸֡") ^ i3;
                        i4 = ((iM55979 ^ i2) * 7959) ^ (-926696602);
                        i5 = -771551260;
                    } else {
                        iM55979 = (C0946.m55979("᩵ۘ") + i2) * 97;
                        i4 = ((iM55979 ^ i3) * (-6047)) ^ 807425427;
                        i5 = -2036771823;
                    }
                    break;
                case -1503049240:
                case 1017967831:
                    if (C1404.f82149 >= 0) {
                        iM55979 = (C0873.m55680("ۘۧ") + i2) * 9;
                        i4 = ((iM55979 ^ i3) * (-24231)) ^ 1145124276;
                        i5 = 1492380436;
                    } else {
                        iM55979 = C0873.m55680("ۢۧ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-27355)) ^ (-1961729616);
                        i5 = -503350484;
                    }
                    break;
                case -1479883490:
                case 1789432685:
                    c18107 = this.f76624;
                    if (C0894.m55769() >= 0) {
                        iM55979 = C0873.m55680("۠ۖ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-119)) ^ (-1251105419);
                        i5 = 1449934369;
                    } else {
                        iM55979 = C0873.m55680("ۜۢ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-22715)) ^ (-2055772013);
                        i5 = -111028617;
                    }
                    break;
                case -1302365105:
                case 816054592:
                    if (C0955.f81898) {
                        iM55979 = (C0946.m55979("᩵ۘ") + i2) * 97;
                        i4 = ((iM55979 ^ i3) * (-6047)) ^ 807425427;
                        i5 = -2036771823;
                    } else {
                        iM55979 = (i2 - C0873.m55680("ܶ۫")) * (-5);
                        i4 = ((iM55979 ^ i3) * 16235) ^ (-159371335);
                        i5 = -484658032;
                    }
                    break;
                case -1245758605:
                case 173582717:
                    if (C0882.f81846) {
                        iM55979 = (C0873.m55680("ۘۧ") + i2) * 9;
                        i4 = ((iM55979 ^ i3) * (-24231)) ^ 1145124276;
                        i5 = 1492380436;
                    } else {
                        iM55979 = (C0873.m55680("֫ۤ") ^ i2) * (-55);
                        i4 = ((iM55979 ^ i3) * (-285)) ^ 2108517197;
                        i5 = -1074521510;
                    }
                    break;
                case -905227997:
                case 463383390:
                    if (C0930.m55885() <= 0) {
                        iM55979 = (C0873.m55680("ۘۧ") + i2) * 9;
                        i4 = ((iM55979 ^ i3) * (-24231)) ^ 1145124276;
                        i5 = 1492380436;
                    } else {
                        iM55979 = C0873.m55680("ۙ֫") ^ i3;
                        i4 = ((iM55979 ^ i2) * 6759) ^ 963480631;
                        i5 = -395332527;
                    }
                    break;
                case -817106094:
                case 1812738132:
                    if (C1044.m56286() <= 0) {
                        iM55979 = (C0946.m55979("᩵ۘ") + i2) * 97;
                        i4 = ((iM55979 ^ i3) * (-6047)) ^ 807425427;
                        i5 = -2036771823;
                    } else {
                        iM55979 = (C0946.m55979("۠֡") + i3) * 37;
                        i4 = ((iM55979 ^ i2) * (-7597)) ^ 727934456;
                        i5 = -430815812;
                    }
                    break;
                case -548386131:
                case 220423118:
                    C0989.m56095();
                    C0866.m55645();
                    iM55979 = (C0946.m55979("᩵ۘ") + i2) * 97;
                    i4 = ((iM55979 ^ i3) * (-6047)) ^ 807425427;
                    i5 = -2036771823;
                    break;
                case 489307389:
                case 1506482657:
                    C0854.m55595();
                    C0882.m55710();
                    break;
                case 619007274:
                case 1293698206:
                    if (C0894.f81854 >= 0) {
                        iM55979 = (C0873.m55680("ۘۧ") + i2) * 9;
                        i4 = ((iM55979 ^ i3) * (-24231)) ^ 1145124276;
                        i5 = 1492380436;
                    } else {
                        iM55979 = C0873.m55680("ܽۨ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-6539)) ^ (-2113404056);
                        i5 = 1198764801;
                    }
                    break;
                case 927742880:
                case 1623819455:
                    if (C0877.f81843 >= 0) {
                        iM55979 = C0873.m55680("۠ۖ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-119)) ^ (-1251105419);
                        i5 = 1449934369;
                    } else {
                        iM55979 = C0946.m55979("ܺ᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * 12051) ^ 1033749549;
                        i5 = -1249165330;
                    }
                    break;
                case 1173802875:
                case 1820828160:
                    if (C0992.f81922 >= 0) {
                        iM55979 = (C0873.m55680("ۘۧ") + i2) * 9;
                        i4 = ((iM55979 ^ i3) * (-24231)) ^ 1145124276;
                        i5 = 1492380436;
                    } else {
                        iM55979 = C0946.m55979("ۚۢ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 14985) ^ 1294529341;
                        i5 = -276329461;
                    }
                    break;
                default:
                    if (C0906.f81862 >= 0) {
                        iM55979 = (C0873.m55680("ۘۧ") + i2) * 9;
                        i4 = ((iM55979 ^ i3) * (-24231)) ^ 1145124276;
                        i5 = 1492380436;
                    } else {
                        iM55979 = (C0946.m55979("ۜܶ") + i3) * (-27);
                        i4 = ((iM55979 ^ i2) * (-13615)) ^ (-1440167338);
                        i5 = 2104890572;
                    }
                    break;
            }
            return;
        }
    }

    public C24163(C18107 c18107, AbstractC17043 abstractC17043) {
        int i = -1102001546;
        int i2 = C1028.f81950;
        int i3 = C1071.f81975;
        int iM55680 = (C0873.m55680("ᩴܿ") + i3) * 93;
        int i4 = ((iM55680 ^ i2) * 31345) ^ (-340736724);
        int i5 = 1496038868;
        while (true) {
            i = ((((i ^ i2) * 11971) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -1902449118:
                case 725099853:
                    if (C0894.f81854 >= 0) {
                        iM55680 = C0946.m55979("ۖۤ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-23077)) ^ (-920876895);
                        i5 = 1501132762;
                    } else {
                        iM55680 = C0946.m55979("᩵ۢ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 11093) ^ 2082355647;
                        i5 = 221016382;
                    }
                    break;
                case -1809924228:
                case 2143450068:
                    C1929.m56553();
                    if (!C1024.f81946) {
                        iM55680 = C0873.m55680("۠ۢ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 22239) ^ 961817992;
                        i5 = -1721586499;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ۤ᩸")) * 75;
                        i4 = ((iM55680 ^ i2) * (-9057)) ^ (-1443935401);
                        i5 = 935273117;
                    }
                    break;
                case -1672493642:
                case 1322669380:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = C0946.m55979("ۖۤ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-23077)) ^ (-920876895);
                        i5 = 1501132762;
                    } else {
                        iM55680 = (C0873.m55680("ۤ۬") + i2) * (-29);
                        i4 = ((iM55680 ^ i3) * (-20883)) ^ 426986180;
                        i5 = -1591498908;
                    }
                    break;
                case -1583688982:
                case 1695772202:
                    if (C1046.f81962 <= 0) {
                        iM55680 = C0873.m55680("۟ۢ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 2489) ^ 1583669625;
                        i5 = -1474172159;
                    } else {
                        iM55680 = (C0946.m55979("۬ۚ") ^ i2) * 79;
                        i4 = ((iM55680 ^ i3) * (-20401)) ^ (-1049950004);
                        i5 = -1949087776;
                    }
                    break;
                case -1497565455:
                case -1059602423:
                    this.f76624 = c18107;
                    return;
                case -1346325920:
                case 13281291:
                    if (C0892.f81851) {
                        iM55680 = C0946.m55979("᩻ۧ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-3921)) ^ (-1720732904);
                        i5 = 68616526;
                    } else {
                        iM55680 = C0873.m55680("۟ۢ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 2489) ^ 1583669625;
                        i5 = -1474172159;
                    }
                    break;
                case -766830679:
                case 1854626457:
                    if (C0955.f81898) {
                        iM55680 = C0873.m55680("۟ۢ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 2489) ^ 1583669625;
                        i5 = -1474172159;
                    } else {
                        iM55680 = C0873.m55680("᩹ۖ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-22867)) ^ (-2078593517);
                        i5 = -1988601891;
                    }
                    break;
                case -597122005:
                case -4507558:
                    C0949.m56012();
                    C0866.m55645();
                    throw new RuntimeException();
                case -546566879:
                case 1811284694:
                    C0882.m55710();
                    if (C0894.f81854 < 0) {
                        iM55680 = C0946.m55979("ۖۤ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-23077)) ^ (-920876895);
                        i5 = 1501132762;
                    } else {
                        iM55680 = C0873.m55680("۠ۢ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 22239) ^ 961817992;
                        i5 = -1721586499;
                    }
                    break;
                case -169258627:
                case 1246218283:
                    this.f76623 = abstractC17043;
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = (i3 - C0873.m55680("ۤ᩸")) * 75;
                        i4 = ((iM55680 ^ i2) * (-9057)) ^ (-1443935401);
                        i5 = 935273117;
                    } else {
                        iM55680 = C0873.m55680("ۙۤ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 20121) ^ (-755360658);
                        i5 = 139643223;
                    }
                    break;
                case -127244861:
                case 233060060:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = C0873.m55680("۟ۢ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 2489) ^ 1583669625;
                        i5 = -1474172159;
                    } else {
                        iM55680 = (i3 - C0946.m55979("֫֡")) * (-125);
                        i4 = ((iM55680 ^ i2) * (-16391)) ^ 1319890371;
                        i5 = -1224337964;
                    }
                    break;
                case 7991544:
                case 1243986813:
                    if (C1028.f81950 <= 0) {
                        iM55680 = C0873.m55680("۟ۢ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 2489) ^ 1583669625;
                        i5 = -1474172159;
                    } else {
                        iM55680 = (C0873.m55680("᩵ۤ") ^ i3) * (-5);
                        i4 = ((iM55680 ^ i2) * (-11843)) ^ 1352993576;
                        i5 = -1730186236;
                    }
                    break;
                case 368676273:
                case 1870450425:
                    C0937.m55918();
                    RunnableC1014.m56177();
                    iM55680 = C0873.m55680("۠ۢ") ^ i2;
                    i4 = ((iM55680 ^ i3) * 22239) ^ 961817992;
                    i5 = -1721586499;
                    break;
                case 581952578:
                case 1546061085:
                    if (C0917.f81868) {
                        iM55680 = (i3 - C0873.m55680("ۤ᩸")) * 75;
                        i4 = ((iM55680 ^ i2) * (-9057)) ^ (-1443935401);
                        i5 = 935273117;
                    } else {
                        iM55680 = (C0873.m55680("֨ܶ") ^ i2) * (-53);
                        i4 = ((iM55680 ^ i3) * 18791) ^ (-918290012);
                        i5 = -1006090097;
                    }
                    break;
                case 1703279869:
                case 1893079894:
                    if (C0863.m55643()) {
                        iM55680 = (C0873.m55680("ۗۡ") + i3) * (-95);
                        i4 = ((iM55680 ^ i2) * (-14553)) ^ 1956352699;
                        i5 = 62446684;
                    } else {
                        iM55680 = C0946.m55979("ۖۤ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-23077)) ^ (-920876895);
                        i5 = 1501132762;
                    }
                    break;
                default:
                    if (C0898.f81858 <= 0) {
                        iM55680 = C0873.m55680("۟ۢ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 2489) ^ 1583669625;
                        i5 = -1474172159;
                    } else {
                        iM55680 = (C0946.m55979("ۖܳ") + i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM55680 ^ i3) * 9919) ^ 1949521131;
                        i5 = 788608042;
                    }
                    break;
            }
        }
    }

    @Override // p067l.InterfaceC12647
    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC17043 mo29078() {
        return this.f76623;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0120 A[PHI: r1
      0x0120: PHI (r1v4 java.lang.StringBuilder) = 
      (r1v3 java.lang.StringBuilder)
      (r1v2 java.lang.StringBuilder)
      (r1v2 java.lang.StringBuilder)
      (r1v2 java.lang.StringBuilder)
     binds: [B:37:0x011e, B:16:0x007f, B:13:0x0079, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01e8 A[PHI: r2 r3 r7 r8 r9 r10 r11 r13
      0x01e8: PHI (r2v4 l.ܶ᩵ܿ) = (r2v2 l.ܶ᩵ܿ), (r2v2 l.ܶ᩵ܿ), (r2v2 l.ܶ᩵ܿ), (r2v2 l.ܶ᩵ܿ), (r2v2 l.ܶ᩵ܿ), (r2v6 l.ܶ᩵ܿ) binds: [B:56:0x01e6, B:52:0x01c5, B:48:0x01a7, B:28:0x00c4, B:6:0x0050, B:71:0x01e8] A[DONT_GENERATE, DONT_INLINE]
      0x01e8: PHI (r3v5 java.lang.String) = 
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v3 java.lang.String)
      (r3v2 java.lang.String)
     binds: [B:56:0x01e6, B:52:0x01c5, B:48:0x01a7, B:28:0x00c4, B:6:0x0050, B:71:0x01e8] A[DONT_GENERATE, DONT_INLINE]
      0x01e8: PHI (r7v5 short) = (r7v3 short), (r7v2 short), (r7v2 short), (r7v2 short), (r7v2 short), (r7v2 short) binds: [B:56:0x01e6, B:52:0x01c5, B:48:0x01a7, B:28:0x00c4, B:6:0x0050, B:71:0x01e8] A[DONT_GENERATE, DONT_INLINE]
      0x01e8: PHI (r8v5 short) = (r8v3 short), (r8v2 short), (r8v2 short), (r8v2 short), (r8v2 short), (r8v2 short) binds: [B:56:0x01e6, B:52:0x01c5, B:48:0x01a7, B:28:0x00c4, B:6:0x0050, B:71:0x01e8] A[DONT_GENERATE, DONT_INLINE]
      0x01e8: PHI (r9v5 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:56:0x01e6, B:52:0x01c5, B:48:0x01a7, B:28:0x00c4, B:6:0x0050, B:71:0x01e8] A[DONT_GENERATE, DONT_INLINE]
      0x01e8: PHI (r10v5 short) = (r10v2 short), (r10v3 short), (r10v2 short), (r10v2 short), (r10v2 short), (r10v2 short) binds: [B:56:0x01e6, B:52:0x01c5, B:48:0x01a7, B:28:0x00c4, B:6:0x0050, B:71:0x01e8] A[DONT_GENERATE, DONT_INLINE]
      0x01e8: PHI (r11v5 int) = (r11v2 int), (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:56:0x01e6, B:52:0x01c5, B:48:0x01a7, B:28:0x00c4, B:6:0x0050, B:71:0x01e8] A[DONT_GENERATE, DONT_INLINE]
      0x01e8: PHI (r13v5 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:56:0x01e6, B:52:0x01c5, B:48:0x01a7, B:28:0x00c4, B:6:0x0050, B:71:0x01e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0216 A[PHI: r6
      0x0216: PHI (r6v4 char) = (r6v3 char), (r6v2 char), (r6v2 char) binds: [B:60:0x0214, B:18:0x0083, B:16:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0247 A[PHI: r4 r18
      0x0247: PHI (r4v5 java.lang.String) = (r4v2 java.lang.String), (r4v4 java.lang.String), (r4v2 java.lang.String) binds: [B:64:0x0245, B:24:0x00a2, B:13:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x0247: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:64:0x0245, B:24:0x00a2, B:13:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.InterfaceC12647
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17043 mo29074() {
        int iM55680;
        int i;
        int i2;
        int i3 = C1003.f81929;
        int i4 = C1046.f81962;
        int iM55979 = (i4 - C0946.m55979("ۜܺ")) * (-35);
        int i5 = ((iM55979 ^ i3) * (-6233)) ^ (-1137675723);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM55979 ^ (-49517629);
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        short s3 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = -1891703864;
        String strM55750 = null;
        String strM38675 = null;
        AbstractC17043 abstractC17043 = null;
        StringBuilder sb = null;
        while (true) {
            i10 = i6 ^ (i5 & (((i10 ^ i3) * 12647) >> 31));
            switch (i10) {
                case -2061256481:
                case -1247930829:
                    C0992.m56107();
                    iM55680 = (i3 - C0946.m55979("֨ۨ")) * (-121);
                    i = ((iM55680 ^ i4) * 8975) ^ (-383776316);
                    i2 = -417418080;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -2034131983:
                case -730214531:
                    i9 = 40305;
                    iM55680 = (i4 - C0946.m55979("ۨۜ")) * 85;
                    i = ((iM55680 ^ i3) * 20063) ^ (-1118955693);
                    i2 = 1753765814;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -2029112390:
                case 645889761:
                    if (i7 - (i8 * i8) > 0) {
                        iM55680 = (C0873.m55680("ۢ֨") + i3) * (-113);
                        i = ((iM55680 ^ i4) * 30175) ^ 2111580167;
                        i2 = 1322178435;
                    } else {
                        iM55680 = (C0873.m55680("۫ۛ") ^ i4) * (-13);
                        i = ((iM55680 ^ i3) * 29445) ^ (-1749826083);
                        i2 = 806813577;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1951166131:
                case 1407578040:
                    C0949.m56012();
                    return null;
                case -1948914621:
                case 380269275:
                    strM55750 = C0892.m55750(sArr2, 1, 10, i9);
                    if (C1028.f81950 <= 0) {
                        iM55680 = (i3 - C0873.m55680("ۧ᩹")) * (-65);
                        i = ((iM55680 ^ i4) * (-3383)) ^ (-1450499992);
                        i2 = 1130702460;
                    } else {
                        iM55680 = C0873.m55680("ۢۛ") ^ i4;
                        i = ((iM55680 ^ i3) * (-20837)) ^ 1017708723;
                        i2 = 2000486756;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1932223294:
                case 1909224956:
                    C1003.m56121(sb, strM38675);
                    sArr2 = f83040;
                    if (C0949.m56012()) {
                        iM55680 = C0946.m55979("᩹֫") ^ i3;
                        i = ((iM55680 ^ i4) * 24953) ^ 671566064;
                        i2 = -456889607;
                    } else {
                        iM55680 = (C0873.m55680("۠ۨ") + i4) * (-85);
                        i = ((iM55680 ^ i3) * 17689) ^ 1825823581;
                        i2 = 946660670;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1609983701:
                case 604101599:
                    c = 0;
                    if (C0947.f81895) {
                        iM55680 = (i3 - C0946.m55979("֨ۨ")) * (-121);
                        i = ((iM55680 ^ i4) * 8975) ^ (-383776316);
                        i2 = -417418080;
                    } else {
                        iM55680 = C0873.m55680("ᩴᩳ") ^ i4;
                        i = ((iM55680 ^ i3) * (-3451)) ^ (-1637110610);
                        i2 = 2041600126;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1479432196:
                case -694065744:
                    i9 = 52726;
                    iM55680 = (i4 - C0946.m55979("ۨۜ")) * 85;
                    i = ((iM55680 ^ i3) * 20063) ^ (-1118955693);
                    i2 = 1753765814;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1258635514:
                case -960624445:
                    C0930.m55885();
                    if (C1929.f83011 != 0) {
                        iM55680 = C0946.m55979("ᩴۘ") ^ i4;
                        i = ((iM55680 ^ i3) * (-18177)) ^ (-1849314247);
                        i2 = -480987536;
                    } else {
                        iM55680 = (i4 - C0946.m55979("۟᩸")) * C0254q.f1218h;
                        i = ((iM55680 ^ i3) * 9597) ^ 1065944142;
                        i2 = -1892606903;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1204900903:
                case 1100528659:
                    sb = new StringBuilder();
                    if (C1404.m56468()) {
                        iM55680 = C0873.m55680("ۚ᩹") ^ i3;
                        i = ((iM55680 ^ i4) * 6579) ^ (-375648702);
                        i2 = 448360068;
                    } else {
                        iM55680 = C0946.m55979("ᩴۘ") ^ i4;
                        i = ((iM55680 ^ i3) * (-18177)) ^ (-1849314247);
                        i2 = -480987536;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -979915369:
                case -348158122:
                    i8 = s + s3;
                    if (C1036.f81953 >= 0) {
                        iM55680 = C0946.m55979("᩹֫") ^ i3;
                        i = ((iM55680 ^ i4) * 24953) ^ 671566064;
                        i2 = -456889607;
                    } else {
                        iM55680 = C0873.m55680("ۢ᩵") ^ i3;
                        i = ((iM55680 ^ i4) * (-14709)) ^ (-805213329);
                        i2 = -1518894079;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -792032961:
                case -541003561:
                    if (AbstractC0942.m55971()) {
                        iM55680 = C0946.m55979("ᩴۘ") ^ i4;
                        i = ((iM55680 ^ i3) * (-18177)) ^ (-1849314247);
                        i2 = -480987536;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ۧ᩹")) * (-65);
                        i = ((iM55680 ^ i4) * (-3383)) ^ (-1450499992);
                        i2 = 1130702460;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -644456216:
                case -545160890:
                    sArr = f83040;
                    if (C0917.f81868) {
                        iM55680 = (i3 - C0873.m55680("ۧ᩹")) * (-65);
                        i = ((iM55680 ^ i4) * (-3383)) ^ (-1450499992);
                        i2 = 1130702460;
                    } else {
                        iM55680 = C0873.m55680("᩻۠") ^ i3;
                        i = ((iM55680 ^ i4) * 29225) ^ 1370559598;
                        i2 = 108771442;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 438339905:
                case 952162355:
                    abstractC17043 = this.f76623;
                    if (C1071.f81975 <= 0) {
                        iM55680 = C0946.m55979("᩹֫") ^ i3;
                        i = ((iM55680 ^ i4) * 24953) ^ 671566064;
                        i2 = -456889607;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                    } else {
                        int iM55681 = C0873.m55680("ۡ᩶") ^ i4;
                        i5 = ((iM55681 ^ i3) * (-15315)) ^ 584507498;
                        i6 = iM55681 ^ (-828641242);
                    }
                    break;
                case 569030075:
                case 569657338:
                    C1003.m56121(sb, strM55750);
                    return abstractC17043.m38682(C0845.m55591(sb));
                case 741361841:
                case 1866471692:
                    i7 = s * s2;
                    s3 = 8613;
                    if (C1194.f82045 != 0) {
                        iM55680 = C0946.m55979("᩹֫") ^ i3;
                        i = ((iM55680 ^ i4) * 24953) ^ 671566064;
                        i2 = -456889607;
                    } else {
                        iM55680 = C0873.m55680("ܰ᩵") ^ i3;
                        i = ((iM55680 ^ i4) * 4427) ^ (-851594833);
                        i2 = -403829574;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 742535627:
                case 2080947446:
                    if (C0912.f81867 <= 0) {
                        iM55680 = (i3 - C0946.m55979("֨ۨ")) * (-121);
                        i = ((iM55680 ^ i4) * 8975) ^ (-383776316);
                        i2 = -417418080;
                    } else {
                        iM55680 = C0946.m55979("ᩴۘ") ^ i4;
                        i = ((iM55680 ^ i3) * (-18177)) ^ (-1849314247);
                        i2 = -480987536;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 796560550:
                case 2122798968:
                    s = sArr[c];
                    s2 = 34452;
                    if (C0854.m55595() >= 0) {
                        iM55680 = C0946.m55979("᩹֫") ^ i3;
                        i = ((iM55680 ^ i4) * 24953) ^ 671566064;
                        i2 = -456889607;
                    } else {
                        iM55680 = C0946.m55979("ܺ᩹") ^ i4;
                        i = ((iM55680 ^ i3) * 27657) ^ 829190029;
                        i2 = 965310932;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                default:
                    strM38675 = abstractC17043.m38675();
                    if (C0937.f81884) {
                        iM55680 = C0946.m55979("ܳ֫") ^ i3;
                        i = ((iM55680 ^ i4) * (-31241)) ^ 247421455;
                        i2 = -1364385678;
                    } else {
                        iM55680 = C0946.m55979("᩹֫") ^ i3;
                        i = ((iM55680 ^ i4) * 24953) ^ 671566064;
                        i2 = -456889607;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    @Override // p067l.InterfaceC12647
    /* JADX INFO: renamed from: ۧ */
    public final AbstractActivityC5549 mo29076() {
        return C1929.m56560(this.f76624);
    }
}
