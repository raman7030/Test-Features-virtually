package p067l;

import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩸۬ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H508 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22900 implements InterfaceC24834 {

    /* JADX INFO: renamed from: ۛۛ֫, reason: not valid java name and contains not printable characters */
    private static final short[] f83008 = {8902, 16284, -12905, -11339, 8827, -5709, -1838, -15834, -26590, -26555, -15985, 3936, -13720, 992, -24208, 18897, 17766, 7022, -8168, -1757, -1636, 8727, -7240, 8357, -14235};

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C23570 f72068;

    /* JADX WARN: Code duplicated, block: B:52:0x01c3 A[PHI: r8 r12 r13 r14 r18
      0x01c3: PHI (r8v4 int) = (r8v3 int), (r8v2 int) binds: [B:51:0x01c1, B:32:0x00f8] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r12v3 short[]) = (r12v2 short[]), (r12v4 short[]) binds: [B:51:0x01c1, B:32:0x00f8] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r13v3 int) = (r13v2 int), (r13v4 int) binds: [B:51:0x01c1, B:32:0x00f8] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r14v3 int) = (r14v2 int), (r14v4 int) binds: [B:51:0x01c1, B:32:0x00f8] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r18v14 int) = (r18v6 int), (r18v15 int) binds: [B:51:0x01c1, B:32:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01fb A[PHI: r3 r6 r7 r9 r18
      0x01fb: PHI (r3v3 int) = (r3v2 int), (r3v2 int), (r3v4 int) binds: [B:55:0x01f9, B:47:0x019f, B:15:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r6v4 short) = (r6v3 short), (r6v2 short), (r6v2 short) binds: [B:55:0x01f9, B:47:0x019f, B:15:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r7v4 short) = (r7v3 short), (r7v2 short), (r7v2 short) binds: [B:55:0x01f9, B:47:0x019f, B:15:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:55:0x01f9, B:47:0x019f, B:15:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r18v25 int) = (r18v5 int), (r18v7 int), (r18v26 int) binds: [B:55:0x01f9, B:47:0x019f, B:15:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0234 A[PHI: r5 r10 r18 r19
      0x0234: PHI (r5v4 char) = (r5v2 char), (r5v3 char), (r5v2 char) binds: [B:63:0x0256, B:59:0x0232, B:43:0x017c] A[DONT_GENERATE, DONT_INLINE]
      0x0234: PHI (r10v3 short) = (r10v2 short), (r10v2 short), (r10v4 short) binds: [B:63:0x0256, B:59:0x0232, B:43:0x017c] A[DONT_GENERATE, DONT_INLINE]
      0x0234: PHI (r18v8 int) = (r18v3 int), (r18v4 int), (r18v9 int) binds: [B:63:0x0256, B:59:0x0232, B:43:0x017c] A[DONT_GENERATE, DONT_INLINE]
      0x0234: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:63:0x0256, B:59:0x0232, B:43:0x017c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.InterfaceC24834
    /* JADX INFO: renamed from: ܿ */
    public final void mo48747(String str) {
        int iM55680;
        int i;
        int i2;
        int i3 = ServiceConnectionC1013.f81940;
        int i4 = C0906.f81862;
        int iM55681 = C0873.m55680("ᩳܰ") ^ i3;
        int i5 = ((iM55681 ^ i4) * 15897) ^ (-1511635298);
        C23570 c23570 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM55681 ^ (-1727471553);
        int i7 = 0;
        int iM55979 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        int i9 = 0;
        short s3 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 839221095;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * (-15253)) >> 31));
            switch (i13) {
                case -1933814929:
                case 269521385:
                    i7 = i7;
                    int i14 = s + s3;
                    if (i9 - (i14 * i14) > 0) {
                        iM55680 = C0946.m55979("ۙ֨") ^ i4;
                        i = ((iM55680 ^ i3) * 31073) ^ 1528373086;
                        i2 = -741358451;
                    } else {
                        iM55680 = (C0873.m55680("ۚ᩺") + i4) * (-109);
                        i = ((iM55680 ^ i3) * (-16585)) ^ 240529872;
                        i2 = 1518452361;
                    }
                    int i15 = i7;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    i7 = i15;
                    break;
                case -1922481175:
                case 559726018:
                    C0863.m55643();
                    int iM559710 = (C0946.m55979("ۨۛ") + i4) * 93;
                    i6 = iM559710 ^ 1931299395;
                    i5 = ((iM559710 ^ i3) * (-28379)) ^ 684718364;
                    break;
                case -1805656809:
                case -446219355:
                    C0955.m56025();
                    break;
                case -1581930579:
                case -854486391:
                    C1028.m56239(c23570, i7);
                    C0946.m55981(c23570, str);
                    break;
                case -1272576477:
                case 2093460297:
                    i10 = 22691;
                    iM55680 = (C0946.m55979("ۚܿ") ^ i3) * (-67);
                    i = ((iM55680 ^ i4) * 9377) ^ 747223015;
                    i2 = -844153375;
                    int i16 = i7;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    i7 = i16;
                    break;
                case -1263779461:
                case 786572659:
                    if (RunnableC0938.m55938() != 0) {
                        i7 = i7;
                        iM55680 = (i3 - C0946.m55979("ܿۛ")) * 71;
                        i = ((iM55680 ^ i4) * (-27219)) ^ (-1777874928);
                        i2 = 904764741;
                        int i17 = i7;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                        i7 = i17;
                    } else {
                        int iM559711 = (C0946.m55979("ۨۛ") + i4) * 93;
                        i6 = iM559711 ^ 1931299395;
                        i5 = ((iM559711 ^ i3) * (-28379)) ^ 684718364;
                    }
                    break;
                case -1018034451:
                case 920748960:
                    i7 = i7;
                    sArr2 = f83008;
                    i11 = 18;
                    i12 = 3;
                    if (C0898.m55800() <= 0) {
                        iM55680 = (C0946.m55979("֫ۛ") ^ i3) * 93;
                        i = ((iM55680 ^ i4) * (-23567)) ^ (-1076233711);
                        i2 = 754372760;
                    } else {
                        iM55680 = (C0946.m55979("۫ۧ") + i3) * 83;
                        i = ((iM55680 ^ i4) * (-3845)) ^ (-1109764754);
                        i2 = 1895510841;
                    }
                    int i18 = i7;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    i7 = i18;
                    break;
                case -985814497:
                case 577045720:
                    i10 = 29248;
                    iM55680 = (C0946.m55979("ۚܿ") ^ i3) * (-67);
                    i = ((iM55680 ^ i4) * 9377) ^ 747223015;
                    i2 = -844153375;
                    int i19 = i7;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    i7 = i19;
                    break;
                case -927283342:
                case 958757112:
                    C1024.m56209();
                    if (C1036.f81953 < 0) {
                        iM55680 = (C0873.m55680("᩵֫") ^ i4) * (-3);
                        i7 = i7;
                        i = ((iM55680 ^ i3) * (-25147)) ^ 1832595891;
                        i2 = 477436695;
                        int i110 = i7;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                        i7 = i110;
                    } else {
                        int iM559712 = (C0946.m55979("ۨۛ") + i4) * 93;
                        i6 = iM559712 ^ 1931299395;
                        i5 = ((iM559712 ^ i3) * (-28379)) ^ 684718364;
                    }
                    break;
                case -895238274:
                case 1322186939:
                    i7 = i7;
                    s3 = 1;
                    if (C1124.f82007 >= 0) {
                        i7 = i7;
                        iM55680 = (C0873.m55680("᩵֫") ^ i4) * (-3);
                        i7 = i7;
                        i = ((iM55680 ^ i3) * (-25147)) ^ 1832595891;
                        i2 = 477436695;
                    } else {
                        iM55680 = (C0946.m55979("۬ܶ") + i3) * (-43);
                        i = ((iM55680 ^ i4) * 1129) ^ (-221087593);
                        i2 = -1098328531;
                    }
                    int i111 = i7;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    i7 = i111;
                    break;
                case -709557852:
                case 1522075271:
                    i7 = i7;
                    i9 = i8 + 1;
                    if (C0898.f81858 <= 0) {
                        iM55680 = (i3 - C0946.m55979("ܿۛ")) * 71;
                        i = ((iM55680 ^ i4) * (-27219)) ^ (-1777874928);
                        i2 = 904764741;
                    } else {
                        iM55680 = (C0873.m55680("۬ۜ") ^ i3) * (-27);
                        i = ((iM55680 ^ i4) * (-23183)) ^ (-1064755138);
                        i2 = 1327509691;
                    }
                    int i112 = i7;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    i7 = i112;
                    break;
                case -537677503:
                case -64298396:
                    i7 = i7;
                    c = 17;
                    if (C1017.f81942 >= 0) {
                        i7 = i7;
                        iM55680 = (C0873.m55680("᩵֫") ^ i4) * (-3);
                        i7 = i7;
                        i = ((iM55680 ^ i3) * (-25147)) ^ 1832595891;
                        i2 = 477436695;
                    } else {
                        iM55680 = (i4 - C0873.m55680("ܽ۟")) * 91;
                        i = ((iM55680 ^ i3) * (-29423)) ^ 1332333554;
                        i2 = 34167147;
                    }
                    int i113 = i7;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    i7 = i113;
                    break;
                case -465597740:
                case 807341073:
                    i7 = 2099563313 ^ iM55979;
                    c23570 = this.f72068;
                    if (AbstractC0942.f81890 <= 0) {
                        iM55680 = (C0873.m55680("᩵֫") ^ i4) * (-3);
                        i7 = i7;
                        i = ((iM55680 ^ i3) * (-25147)) ^ 1832595891;
                        i2 = 477436695;
                        int i114 = i7;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                        i7 = i114;
                    } else {
                        int iM55682 = (C0873.m55680("ۤۙ") ^ i3) * (-125);
                        i5 = ((iM55682 ^ i4) * 8805) ^ (-1108542576);
                        i6 = iM55682 ^ (-354066654);
                    }
                    break;
                case -290960610:
                case 994111920:
                    C0955.m56025();
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        i7 = i7;
                        iM55680 = C0873.m55680("ۜۧ") ^ i4;
                        i = ((iM55680 ^ i3) * (-4617)) ^ 957047992;
                        i2 = 463744219;
                        int i115 = i7;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                        i7 = i115;
                    }
                    i7 = i7;
                    iM55680 = (i3 - C0946.m55979("ܿۛ")) * 71;
                    i = ((iM55680 ^ i4) * (-27219)) ^ (-1777874928);
                    i2 = 904764741;
                    int i116 = i7;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    i7 = i116;
                    break;
                case 117785972:
                case 236566403:
                    i7 = i7;
                    i8 = s * s2;
                    if (C0906.f81862 >= 0) {
                        iM55680 = (C0946.m55979("֫ۛ") ^ i3) * 93;
                        i = ((iM55680 ^ i4) * (-23567)) ^ (-1076233711);
                        i2 = 754372760;
                    } else {
                        iM55680 = C0946.m55979("ܿۢ") ^ i4;
                        i = ((iM55680 ^ i3) * 13781) ^ 265869467;
                        i2 = 2059227148;
                    }
                    int i117 = i7;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    i7 = i117;
                    break;
                case 416471578:
                case 1979461202:
                    i7 = i7;
                    if (C0930.f81879 <= 0) {
                        iM55680 = C0873.m55680("ۜۧ") ^ i4;
                        i = ((iM55680 ^ i3) * (-4617)) ^ 957047992;
                        i2 = 463744219;
                    } else {
                        iM55680 = C0873.m55680("ۢ֫") ^ i3;
                        i = ((iM55680 ^ i4) * 19411) ^ (-1406487816);
                        i2 = -841177444;
                    }
                    int i118 = i7;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    i7 = i118;
                    break;
                case 556501221:
                case 1615571851:
                    i7 = i7;
                    sArr = f83008;
                    if (C1025.f81947 >= 0) {
                        i7 = i7;
                        iM55680 = (C0873.m55680("᩵֫") ^ i4) * (-3);
                        i7 = i7;
                        i = ((iM55680 ^ i3) * (-25147)) ^ 1832595891;
                        i2 = 477436695;
                    } else {
                        iM55680 = (C0946.m55979("ᩳۙ") ^ i4) * 115;
                        i = ((iM55680 ^ i3) * 28933) ^ (-1867649786);
                        i2 = 2109996854;
                    }
                    int i119 = i7;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    i7 = i119;
                    break;
                case 771933337:
                case 902813112:
                    i7 = i7;
                    s = sArr[c];
                    s2 = 2;
                    if (C0927.f81875) {
                        iM55680 = (i3 - C0946.m55979("ܿۛ")) * 71;
                        i = ((iM55680 ^ i4) * (-27219)) ^ (-1777874928);
                        i2 = 904764741;
                    } else {
                        iM55680 = (C0873.m55680("ܳ۫") + i3) * 61;
                        i = ((iM55680 ^ i4) * 16285) ^ (-1833391648);
                        i2 = 1883834908;
                    }
                    int i1110 = i7;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    i7 = i1110;
                    break;
                default:
                    iM55979 = C0946.m55979(AbstractC0942.m55970(sArr2, i11, i12, i10));
                    if (C0955.f81898) {
                        i7 = i7;
                        iM55680 = (i3 - C0946.m55979("ܿۛ")) * 71;
                        i = ((iM55680 ^ i4) * (-27219)) ^ (-1777874928);
                        i2 = 904764741;
                    } else {
                        iM55680 = C0873.m55680("ۨۡ") ^ i4;
                        i7 = i7;
                        i = ((iM55680 ^ i3) * 14121) ^ 454875191;
                        i2 = -1625856317;
                    }
                    int i1111 = i7;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    i7 = i1111;
                    break;
            }
            return;
        }
    }

    @Override // p067l.InterfaceC14797
    /* JADX INFO: renamed from: ֫ */
    public final void mo14981(int i, int i2) {
        int i3 = -2102508896;
        int i4 = C0967.f81910;
        int i5 = C0898.f81858;
        int iM55680 = C0873.m55680("۬ۗ") ^ i4;
        int i6 = ((iM55680 ^ i5) * 765) ^ 1390858729;
        int i7 = -1034877852;
        while (true) {
            i3 = ((((i3 ^ i5) * (-8939)) >> 31) & i6) ^ (iM55680 ^ i7);
            switch (i3) {
                case -1923005494:
                case 1756524537:
                    C1124.m56367();
                    C0906.m55809();
                    iM55680 = C0873.m55680("۟ܶ") ^ i4;
                    i6 = ((iM55680 ^ i5) * 1323) ^ (-233597811);
                    i7 = -2030570824;
                    break;
                case -1889844821:
                case -1169018211:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55680 = C0946.m55979("᩻ܶ") ^ i5;
                        i6 = ((iM55680 ^ i4) * 27477) ^ 19686850;
                        i7 = 1004791139;
                    } else {
                        iM55680 = C0873.m55680("᩶ܿ") ^ i5;
                        i6 = ((iM55680 ^ i4) * 6251) ^ (-1228871545);
                        i7 = 1716251502;
                    }
                    break;
                case -1635669692:
                case -491859644:
                    if (!C0917.f81868) {
                        iM55680 = (C0946.m55979("ܺ᩶") ^ i4) * 99;
                        i6 = ((iM55680 ^ i5) * 19131) ^ (-992973806);
                        i7 = 1040045573;
                    } else {
                        iM55680 = C0873.m55680("۟ܶ") ^ i4;
                        i6 = ((iM55680 ^ i5) * 1323) ^ (-233597811);
                        i7 = -2030570824;
                    }
                    break;
                case -1594156685:
                case 573676113:
                    this.f72068.mo13474(i2);
                    break;
                case -1544424543:
                case 862248624:
                    C0873.m55678();
                    if (C0898.m55800() <= 0) {
                        iM55680 = (C0946.m55979("ۢ᩻") ^ i5) * (-93);
                        i6 = ((iM55680 ^ i4) * 759) ^ (-2006031502);
                        i7 = 1792471577;
                    } else {
                        iM55680 = C0873.m55680("۟ܶ") ^ i4;
                        i6 = ((iM55680 ^ i5) * 1323) ^ (-233597811);
                        i7 = -2030570824;
                    }
                    break;
                case -1102586187:
                case 1855426292:
                    if (C0906.m55809() <= 0) {
                        iM55680 = (C0946.m55979("ܺ᩶") ^ i4) * 99;
                        i6 = ((iM55680 ^ i5) * 19131) ^ (-992973806);
                        i7 = 1040045573;
                    } else {
                        iM55680 = C0946.m55979("ۗ֫") ^ i4;
                        i6 = ((iM55680 ^ i5) * 327) ^ 1192371845;
                        i7 = -1143082580;
                    }
                    break;
                case -1085487650:
                case 301492742:
                    if (C0917.f81868) {
                        iM55680 = C0873.m55680("۟ܶ") ^ i4;
                        i6 = ((iM55680 ^ i5) * 1323) ^ (-233597811);
                        i7 = -2030570824;
                    } else {
                        iM55680 = (C0873.m55680("ܳܶ") + i4) * (-23);
                        i6 = ((iM55680 ^ i5) * 11247) ^ 819454659;
                        i7 = 7376608;
                    }
                    break;
                case -1015731713:
                case 1031975805:
                    C0861.m55626();
                    if (C1036.f81953 < 0) {
                        iM55680 = C0946.m55979("᩻ܶ") ^ i5;
                        i6 = ((iM55680 ^ i4) * 27477) ^ 19686850;
                        i7 = 1004791139;
                    } else {
                        iM55680 = (C0946.m55979("ۢ᩻") ^ i5) * (-93);
                        i6 = ((iM55680 ^ i4) * 759) ^ (-2006031502);
                        i7 = 1792471577;
                    }
                    break;
                case -842306391:
                case 1240797531:
                    if (C0854.f81826 != 0) {
                        iM55680 = C0873.m55680("۟ܶ") ^ i4;
                        i6 = ((iM55680 ^ i5) * 1323) ^ (-233597811);
                        i7 = -2030570824;
                    } else {
                        iM55680 = C0873.m55680("ܶۜ") ^ i5;
                        i6 = ((iM55680 ^ i4) * (-23227)) ^ 1175182778;
                        i7 = -1211620240;
                    }
                    break;
                case -675560087:
                case 1154671169:
                    if (C0937.f81884) {
                        iM55680 = C0873.m55680("ۚۙ") ^ i4;
                        i6 = ((iM55680 ^ i5) * 7641) ^ 1246590473;
                        i7 = -1449817798;
                    } else {
                        iM55680 = C0946.m55979("ᩳᩳ") ^ i5;
                        i6 = ((iM55680 ^ i4) * 25951) ^ (-799354748);
                        i7 = -1777934100;
                    }
                    break;
                case -153419914:
                case 881931894:
                    if (C0912.m55833()) {
                        iM55680 = C0873.m55680("۟ܶ") ^ i4;
                        i6 = ((iM55680 ^ i5) * 1323) ^ (-233597811);
                        i7 = -2030570824;
                    } else {
                        iM55680 = C0946.m55979("ۧۧ") ^ i4;
                        i6 = ((iM55680 ^ i5) * (-25939)) ^ (-505368070);
                        i7 = 83842335;
                    }
                    break;
                case -152779921:
                case 1858918191:
                    if (C0892.f81851) {
                        iM55680 = C0873.m55680("ۙۛ") ^ i4;
                        i6 = ((iM55680 ^ i5) * 1829) ^ (-1831734383);
                        i7 = 1618534562;
                    } else {
                        iM55680 = C0946.m55979("᩻ܶ") ^ i5;
                        i6 = ((iM55680 ^ i4) * 27477) ^ 19686850;
                        i7 = 1004791139;
                    }
                    break;
                case 177703889:
                case 813293644:
                    if (C0989.f81920 >= 0) {
                        iM55680 = C0873.m55680("۟ܶ") ^ i4;
                        i6 = ((iM55680 ^ i5) * 1323) ^ (-233597811);
                        i7 = -2030570824;
                    } else {
                        iM55680 = C0873.m55680("۠ᩴ") ^ i5;
                        i6 = ((iM55680 ^ i4) * (-10877)) ^ 661007152;
                        i7 = 1280707101;
                    }
                    break;
                case 223602395:
                case 1501943535:
                    C0863.m55643();
                    C0863.m55643();
                    break;
                case 1445749989:
                case 1953350511:
                    if (C0854.m55595() >= 0) {
                        iM55680 = C0946.m55979("ᩳᩳ") ^ i5;
                        i6 = ((iM55680 ^ i4) * 25951) ^ (-799354748);
                        i7 = -1777934100;
                    } else {
                        iM55680 = C0946.m55979("ܺۙ") ^ i5;
                        i6 = ((iM55680 ^ i4) * 5621) ^ (-480103137);
                        i7 = -27386271;
                    }
                    break;
                default:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = (C0946.m55979("ۢ᩻") ^ i5) * (-93);
                        i6 = ((iM55680 ^ i4) * 759) ^ (-2006031502);
                        i7 = 1792471577;
                    } else {
                        iM55680 = (C0946.m55979("ܶ֫") ^ i5) * (-123);
                        i6 = ((iM55680 ^ i4) * 2721) ^ 2076610820;
                        i7 = 1449209540;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00e7 A[PHI: r8 r14 r15
      0x00e7: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:29:0x00e5, B:25:0x00be, B:15:0x007d, B:8:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x00e7: PHI (r14v4 short[]) = (r14v2 short[]), (r14v3 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:29:0x00e5, B:25:0x00be, B:15:0x007d, B:8:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x00e7: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:29:0x00e5, B:25:0x00be, B:15:0x007d, B:8:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0169 A[PHI: r1
      0x0169: PHI (r1v5 int) = (r1v4 int), (r1v2 int), (r1v2 int), (r1v2 int) binds: [B:41:0x0167, B:17:0x0081, B:15:0x007d, B:11:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0223 A[PHI: r10 r21
      0x0223: PHI (r10v4 short) = (r10v3 short), (r10v2 short) binds: [B:56:0x0221, B:8:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0223: PHI (r21v5 int) = (r21v4 int), (r21v3 int) binds: [B:56:0x0221, B:8:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0278 A[PHI: r2 r3 r4 r5 r6 r7 r12 r13 r16
      0x0278: PHI (r2v4 l.᩹۬ܽ) = (r2v2 l.᩹۬ܽ), (r2v2 l.᩹۬ܽ), (r2v2 l.᩹۬ܽ), (r2v2 l.᩹۬ܽ), (r2v2 l.᩹۬ܽ), (r2v6 l.᩹۬ܽ) binds: [B:64:0x0276, B:60:0x0255, B:45:0x01a3, B:33:0x0119, B:21:0x009d, B:87:0x0278] A[DONT_GENERATE, DONT_INLINE]
      0x0278: PHI (r3v4 java.lang.Object[]) = 
      (r3v2 java.lang.Object[])
      (r3v2 java.lang.Object[])
      (r3v2 java.lang.Object[])
      (r3v2 java.lang.Object[])
      (r3v2 java.lang.Object[])
      (r3v7 java.lang.Object[])
     binds: [B:64:0x0276, B:60:0x0255, B:45:0x01a3, B:33:0x0119, B:21:0x009d, B:87:0x0278] A[DONT_GENERATE, DONT_INLINE]
      0x0278: PHI (r4v6 java.lang.String) = 
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v4 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
     binds: [B:64:0x0276, B:60:0x0255, B:45:0x01a3, B:33:0x0119, B:21:0x009d, B:87:0x0278] A[DONT_GENERATE, DONT_INLINE]
      0x0278: PHI (r5v5 int) = (r5v2 int), (r5v2 int), (r5v2 int), (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:64:0x0276, B:60:0x0255, B:45:0x01a3, B:33:0x0119, B:21:0x009d, B:87:0x0278] A[DONT_GENERATE, DONT_INLINE]
      0x0278: PHI (r6v5 int) = (r6v2 int), (r6v2 int), (r6v2 int), (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:64:0x0276, B:60:0x0255, B:45:0x01a3, B:33:0x0119, B:21:0x009d, B:87:0x0278] A[DONT_GENERATE, DONT_INLINE]
      0x0278: PHI (r7v6 short) = (r7v4 short), (r7v2 short), (r7v2 short), (r7v2 short), (r7v2 short), (r7v2 short) binds: [B:64:0x0276, B:60:0x0255, B:45:0x01a3, B:33:0x0119, B:21:0x009d, B:87:0x0278] A[DONT_GENERATE, DONT_INLINE]
      0x0278: PHI (r12v5 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:64:0x0276, B:60:0x0255, B:45:0x01a3, B:33:0x0119, B:21:0x009d, B:87:0x0278] A[DONT_GENERATE, DONT_INLINE]
      0x0278: PHI (r13v5 int) = (r13v2 int), (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:64:0x0276, B:60:0x0255, B:45:0x01a3, B:33:0x0119, B:21:0x009d, B:87:0x0278] A[DONT_GENERATE, DONT_INLINE]
      0x0278: PHI (r16v5 int) = (r16v2 int), (r16v3 int), (r16v2 int), (r16v2 int), (r16v2 int), (r16v2 int) binds: [B:64:0x0276, B:60:0x0255, B:45:0x01a3, B:33:0x0119, B:21:0x009d, B:87:0x0278] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.InterfaceC14797
    /* JADX INFO: renamed from: ۙ */
    public final void mo14983() {
        int iM55680;
        int i;
        int i2;
        int i3 = C1036.f81953;
        int i4 = C1404.f82149;
        int iM55979 = C0946.m55979("᩻ۗ") ^ i4;
        int i5 = ((iM55979 ^ i3) * 3645) ^ (-353312099);
        String strM55667 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM55979 ^ 577023882;
        int iM559710 = 0;
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -881039492;
        int i14 = 0;
        Object[] objArr = null;
        C23570 c23570 = null;
        int iM559711 = 0;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i3) * 25279) >> 31));
            switch (i13) {
                case -1935320086:
                case 176719050:
                    C1017.m56187();
                    iM55680 = (C0946.m55979("ۗۛ") + i3) * 101;
                    i = ((iM55680 ^ i4) * 26345) ^ 348855829;
                    i2 = -1024116041;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1807272132:
                case 490895403:
                    objArr[0] = ViewOnClickListenerC0939.m55947(sArr, i10, 2, i9);
                    if (C1071.m56343() != 0) {
                        iM55680 = C0873.m55680("ۗ᩻") ^ i3;
                        i = ((iM55680 ^ i4) * (-10627)) ^ 761952857;
                        i2 = -328512421;
                    } else {
                        iM55680 = C0946.m55979("᩹᩶") ^ i3;
                        i = ((iM55680 ^ i4) * (-17911)) ^ 1007994587;
                        i2 = 872800310;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1723086799:
                case -756709058:
                    sArr2 = f83008;
                    i11 = 10;
                    i8 = 3;
                    if (C0890.f81849 != 0) {
                        iM55680 = C0873.m55680("ۗ᩻") ^ i3;
                        i = ((iM55680 ^ i4) * (-10627)) ^ 761952857;
                        i2 = -328512421;
                    } else {
                        iM55680 = (i4 - C0873.m55680("۬ܳ")) * 13;
                        i = ((iM55680 ^ i3) * 16159) ^ (-1733055000);
                        i2 = -490784633;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1694275734:
                case -287772539:
                    if (C0927.f81875) {
                        iM55680 = C0873.m55680("ۗ᩻") ^ i3;
                        i = ((iM55680 ^ i4) * (-10627)) ^ 761952857;
                        i2 = -328512421;
                    } else {
                        iM55680 = (C0873.m55680("ۢ֫") + i3) * 15;
                        i = ((iM55680 ^ i4) * 6577) ^ 1543973121;
                        i2 = 801226300;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1670544957:
                case -69749846:
                    int i15 = s + s2;
                    if ((i15 * i15) - i14 >= 0) {
                        iM55680 = (C0873.m55680("ۜۘ") + i3) * (-71);
                        i = ((iM55680 ^ i4) * 25749) ^ 1130814795;
                        i2 = -730812797;
                    } else {
                        iM55680 = C0946.m55979("ۡۜ") ^ i4;
                        i = ((iM55680 ^ i3) * (-11999)) ^ 2005745010;
                        i2 = -1181395390;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1523934916:
                case 927424711:
                    c23570 = this.f72068;
                    C0898.m55798(c23570, iM559711);
                    objArr = new Object[1];
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = C0946.m55979("᩺ᩳ") ^ i4;
                        i = ((iM55680 ^ i3) * (-4703)) ^ (-1733001217);
                        i2 = 1328156527;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                    } else {
                        int iM55681 = (C0873.m55680("ܳᩴ") ^ i3) * 37;
                        i5 = ((iM55681 ^ i4) * 16193) ^ 436998373;
                        i6 = iM55681 ^ (-1893198811);
                    }
                    break;
                case -1483235480:
                case -1083530638:
                    if (C0845.f81821 < 0) {
                        iM55680 = (C0946.m55979("ۗۛ") + i3) * 101;
                        i = ((iM55680 ^ i4) * 26345) ^ 348855829;
                        i2 = -1024116041;
                    } else {
                        iM55680 = C0873.m55680("ۗ᩻") ^ i3;
                        i = ((iM55680 ^ i4) * (-10627)) ^ 761952857;
                        i2 = -328512421;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1466061058:
                case -1263664287:
                    C1053.m56327();
                    if (C1025.f81947 < 0) {
                        iM55680 = (C0946.m55979("ۗۛ") + i3) * 101;
                        i = ((iM55680 ^ i4) * 26345) ^ 348855829;
                        i2 = -1024116041;
                    } else {
                        iM55680 = C0873.m55680("۫ۖ") ^ i4;
                        i = ((iM55680 ^ i3) * 13165) ^ (-836278624);
                        i2 = 1941792031;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1291995234:
                case -1009484273:
                    i12 = s * 2;
                    if (C1229.f82066 >= 0) {
                        iM55680 = C0946.m55979("᩺ᩳ") ^ i4;
                        i = ((iM55680 ^ i3) * (-4703)) ^ (-1733001217);
                        i2 = 1328156527;
                    } else {
                        iM55680 = (C0946.m55979("ᩴܽ") ^ i4) * (-43);
                        i = ((iM55680 ^ i3) * (-31343)) ^ (-552317824);
                        i2 = -361496298;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1217644209:
                case -1177169725:
                    i14 = i12 + 1;
                    s2 = 1;
                    if (C1048.m56305() >= 0) {
                        iM55680 = (C0873.m55680("ۢ֫") + i3) * 15;
                        i = ((iM55680 ^ i4) * 6577) ^ 1543973121;
                        i2 = 801226300;
                    } else {
                        iM55680 = (C0873.m55680("᩷ܳ") + i4) * 73;
                        i = ((iM55680 ^ i3) * (-16785)) ^ (-52299702);
                        i2 = 2066127922;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1181241737:
                case -361864424:
                    strM55667 = RunnableC0871.m55667(f83008, 5, 3, i9);
                    if (C1048.f81963) {
                        iM55680 = (C0946.m55979("ۗ᩵") + i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM55680 ^ i4) * 18353) ^ (-75762762);
                        i2 = 1588830307;
                    } else {
                        iM55680 = C0946.m55979("᩺ᩳ") ^ i4;
                        i = ((iM55680 ^ i3) * (-4703)) ^ (-1733001217);
                        i2 = 1328156527;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -972043591:
                case 2138970392:
                    iM559711 = 2124751828 ^ C0946.m55979(strM55667);
                    if (C1003.f81929 <= 0) {
                        iM55680 = (C0946.m55979("ۗۛ") + i3) * 101;
                        i = ((iM55680 ^ i4) * 26345) ^ 348855829;
                        i2 = -1024116041;
                    } else {
                        iM55680 = (C0873.m55680("ܳۚ") + i4) * 89;
                        i = ((iM55680 ^ i3) * 13793) ^ (-1834960027);
                        i2 = -172950388;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -775470815:
                case 418814460:
                    sArr = f83008;
                    i10 = 8;
                    if (C1025.f81947 >= 0) {
                        iM55680 = C0946.m55979("᩺ᩳ") ^ i4;
                        i = ((iM55680 ^ i3) * (-4703)) ^ (-1733001217);
                        i2 = 1328156527;
                    } else {
                        iM55680 = C0946.m55979("ܰ۫") ^ i4;
                        i = ((iM55680 ^ i3) * (-15385)) ^ 833829545;
                        i2 = -915883348;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -162680054:
                case 903432726:
                    s = f83008[4];
                    if (C0845.f81821 >= 0) {
                        iM55680 = C0946.m55979("᩺ᩳ") ^ i4;
                        i = ((iM55680 ^ i3) * (-4703)) ^ (-1733001217);
                        i2 = 1328156527;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ۛ᩺")) * (-67);
                        i = ((iM55680 ^ i4) * 24981) ^ (-1259957061);
                        i2 = 540418720;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -152753849:
                case 278059401:
                    C0873.m55686(c23570, C0912.m55826(iM559710 ^ i7, objArr));
                    break;
                case -63560040:
                case 582172234:
                    i9 = 39028;
                    iM55680 = (C0873.m55680("ܳۧ") ^ i3) * 29;
                    i = ((iM55680 ^ i4) * 8311) ^ 1858100536;
                    i2 = -1638175126;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 614957686:
                case 1442853890:
                    iM559710 = C0946.m55979(AbstractC0942.m55970(sArr2, i11, i8, i9));
                    i7 = 2121690475;
                    if (C0854.f81826 != 0) {
                        iM55680 = C0946.m55979("᩺ᩳ") ^ i4;
                        i = ((iM55680 ^ i3) * (-4703)) ^ (-1733001217);
                        i2 = 1328156527;
                    } else {
                        iM55680 = C0873.m55680("ۨܺ") ^ i4;
                        i = ((iM55680 ^ i3) * (-411)) ^ (-1818429879);
                        i2 = -994565145;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 1717290341:
                case 1841278309:
                    i9 = 42285;
                    iM55680 = (C0873.m55680("ܳۧ") ^ i3) * 29;
                    i = ((iM55680 ^ i4) * 8311) ^ 1858100536;
                    i2 = -1638175126;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                default:
                    C0955.m56025();
                    C0992.m56107();
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x011c A[PHI: r12 r13 r14 r18
      0x011c: PHI (r12v4 short[]) = (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:35:0x011a, B:31:0x00f7, B:11:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x011c: PHI (r13v4 int) = (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:35:0x011a, B:31:0x00f7, B:11:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x011c: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:35:0x011a, B:31:0x00f7, B:11:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x011c: PHI (r18v26 int) = (r18v18 int), (r18v19 int), (r18v28 int) binds: [B:35:0x011a, B:31:0x00f7, B:11:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0236 A[PHI: r5 r8 r9 r18
      0x0236: PHI (r5v4 char) = (r5v2 char), (r5v3 char), (r5v2 char) binds: [B:15:0x0074, B:58:0x0234, B:50:0x01db] A[DONT_GENERATE, DONT_INLINE]
      0x0236: PHI (r8v3 int) = (r8v2 int), (r8v2 int), (r8v4 int) binds: [B:15:0x0074, B:58:0x0234, B:50:0x01db] A[DONT_GENERATE, DONT_INLINE]
      0x0236: PHI (r9v3 int) = (r9v2 int), (r9v2 int), (r9v4 int) binds: [B:15:0x0074, B:58:0x0234, B:50:0x01db] A[DONT_GENERATE, DONT_INLINE]
      0x0236: PHI (r18v10 int) = (r18v5 int), (r18v8 int), (r18v11 int) binds: [B:15:0x0074, B:58:0x0234, B:50:0x01db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x026f A[PHI: r10 r18 r19
      0x026f: PHI (r10v3 int) = (r10v2 int), (r10v2 int), (r10v4 int) binds: [B:66:0x028f, B:62:0x026d, B:46:0x01b3] A[DONT_GENERATE, DONT_INLINE]
      0x026f: PHI (r18v12 int) = (r18v6 int), (r18v7 int), (r18v13 int) binds: [B:66:0x028f, B:62:0x026d, B:46:0x01b3] A[DONT_GENERATE, DONT_INLINE]
      0x026f: PHI (r19v5 short[]) = (r19v3 short[]), (r19v4 short[]), (r19v3 short[]) binds: [B:66:0x028f, B:62:0x026d, B:46:0x01b3] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.InterfaceC24834
    /* JADX INFO: renamed from: ᩳ */
    public final void mo48748(String str) {
        int iM55979;
        int i;
        int i2;
        int i3 = C0989.f81920;
        int i4 = C0906.f81862;
        int iM559710 = C0946.m55979("ܿ۬") ^ i3;
        int i5 = ((iM559710 ^ i4) * 17409) ^ 1932624145;
        C23570 c23570 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM559710 ^ 1098028213;
        int i7 = 0;
        int iM559711 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -190289483;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i4) * 1843) >> 31));
            switch (i14) {
                case -1942761049:
                case -604988288:
                    i7 = i7;
                    i10 = 303073281;
                    if (C1036.m56257() <= 0) {
                        i7 = i7;
                        iM55979 = (C0873.m55680("֫ܿ") ^ i4) * (-47);
                        i7 = i7;
                        i = ((iM55979 ^ i3) * (-6285)) ^ 658624701;
                        i2 = -93964373;
                    } else {
                        iM55979 = (C0946.m55979("ۨۜ") ^ i4) * 31;
                        i = ((iM55979 ^ i3) * 9511) ^ 1572247128;
                        i2 = -2138455688;
                    }
                    int i15 = i7;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i7 = i15;
                    break;
                case -1827764158:
                case 1942406559:
                    i7 = i7;
                    c = 21;
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = (C0873.m55680("ۨۨ") + i4) * (-53);
                        i = ((iM55979 ^ i3) * (-27741)) ^ (-1859011174);
                        i2 = 1578782637;
                    } else {
                        iM55979 = (C0873.m55680("ۗᩳ") ^ i4) * 41;
                        i = ((iM55979 ^ i3) * (-10465)) ^ 489627044;
                        i2 = -872204082;
                    }
                    int i16 = i7;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i7 = i16;
                    break;
                case -1658927180:
                case 628056132:
                    if (!C0882.f81846) {
                        int iM559712 = (i3 - C0946.m55979("ܰܶ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i6 = iM559712 ^ (-1124095326);
                        i5 = ((iM559712 ^ i4) * (-30439)) ^ (-19639728);
                    } else {
                        iM55979 = (C0873.m55680("֫ܿ") ^ i4) * (-47);
                        i7 = i7;
                        i = ((iM55979 ^ i3) * (-6285)) ^ 658624701;
                        i2 = -93964373;
                        int i17 = i7;
                        i6 = iM55979 ^ i2;
                        i5 = i;
                        i7 = i17;
                    }
                    break;
                case -1482746691:
                case -747126219:
                    i7 = i7;
                    i8 = s * s2;
                    i9 = s * s;
                    if (RunnableC0938.m55938() != 0) {
                        iM55979 = (C0873.m55680("ۨۨ") + i4) * (-53);
                        i = ((iM55979 ^ i3) * (-27741)) ^ (-1859011174);
                        i2 = 1578782637;
                    } else {
                        iM55979 = C0946.m55979("۫ۚ") ^ i3;
                        i = ((iM55979 ^ i4) * 25055) ^ (-279095158);
                        i2 = 785554264;
                    }
                    int i18 = i7;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i7 = i18;
                    break;
                case -1427599705:
                case 1600730748:
                    i11 = 48870;
                    iM55979 = C0873.m55680("ܰۙ") ^ i3;
                    i = ((iM55979 ^ i4) * 3461) ^ 911298885;
                    i2 = -252567488;
                    int i19 = i7;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i7 = i19;
                    break;
                case -1402919239:
                case 475450613:
                    C0866.m55645();
                    iM55979 = (C0873.m55680("֫ܿ") ^ i4) * (-47);
                    i7 = i7;
                    i = ((iM55979 ^ i3) * (-6285)) ^ 658624701;
                    i2 = -93964373;
                    int i110 = i7;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i7 = i110;
                    break;
                case -1299369863:
                case 874969083:
                    i7 = i7;
                    if ((i9 + i10) - i8 >= 0) {
                        iM55979 = C0946.m55979("᩻ۛ") ^ i4;
                        i = ((iM55979 ^ i3) * (-22225)) ^ 1968853791;
                        i2 = 98763596;
                    } else {
                        iM55979 = (C0873.m55680("ۖ۬") ^ i3) * (-105);
                        i = ((iM55979 ^ i4) * (-14383)) ^ 2127582322;
                        i2 = 463866673;
                    }
                    int i111 = i7;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i7 = i111;
                    break;
                case -1290818320:
                case 289139453:
                    i7 = i7;
                    i13 = 3;
                    if (C1024.m56209() >= 0) {
                        iM55979 = C0873.m55680("ܳۘ") ^ i4;
                        i = ((iM55979 ^ i3) * 19081) ^ (-33407939);
                        i2 = -769837676;
                    } else {
                        iM55979 = C0946.m55979("۫ܿ") ^ i4;
                        i = ((iM55979 ^ i3) * 20101) ^ (-586283650);
                        i2 = -1633548353;
                    }
                    int i112 = i7;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i7 = i112;
                    break;
                case -1269782097:
                case 1614981007:
                    i7 = i7;
                    if (C1048.f81963) {
                        iM55979 = (C0946.m55979("ܶۛ") ^ i3) * 95;
                        i = ((iM55979 ^ i4) * (-26057)) ^ 504430887;
                        i2 = 340654825;
                    } else {
                        i7 = i7;
                        iM55979 = (C0873.m55680("֫ܿ") ^ i4) * (-47);
                        i7 = i7;
                        i = ((iM55979 ^ i3) * (-6285)) ^ 658624701;
                        i2 = -93964373;
                    }
                    int i113 = i7;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i7 = i113;
                    break;
                case -1001054943:
                case 758822669:
                    i7 = i7;
                    s = sArr[c];
                    s2 = 34818;
                    if (C0866.f81837 >= 0) {
                        iM55979 = C0873.m55680("ۛ֨") ^ i3;
                        i = ((iM55979 ^ i4) * (-18667)) ^ (-1563780486);
                        i2 = -1652106829;
                    } else {
                        iM55979 = (C0946.m55979("᩵۫") + i3) * (-55);
                        i = ((iM55979 ^ i4) * (-13089)) ^ 1410110154;
                        i2 = -212974744;
                    }
                    int i114 = i7;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i7 = i114;
                    break;
                case -558287320:
                case 1856761446:
                    i11 = 56632;
                    iM55979 = C0873.m55680("ܰۙ") ^ i3;
                    i = ((iM55979 ^ i4) * 3461) ^ 911298885;
                    i2 = -252567488;
                    int i115 = i7;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i7 = i115;
                    break;
                case -470194393:
                case -350726605:
                    i7 = i7;
                    sArr = f83008;
                    if (C0906.f81862 >= 0) {
                        i7 = i7;
                        iM55979 = (C0873.m55680("֫ܿ") ^ i4) * (-47);
                        i7 = i7;
                        i = ((iM55979 ^ i3) * (-6285)) ^ 658624701;
                        i2 = -93964373;
                    } else {
                        iM55979 = (i4 - C0873.m55680("ۜܰ")) * (-35);
                        i = ((iM55979 ^ i3) * 29179) ^ (-961665895);
                        i2 = 1647043460;
                    }
                    int i116 = i7;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i7 = i116;
                    break;
                case -203380467:
                case 1898065084:
                    i7 = 2120228100 ^ iM559711;
                    c23570 = this.f72068;
                    if (C1028.f81950 <= 0) {
                        iM55979 = (C0873.m55680("֫ܿ") ^ i4) * (-47);
                        i7 = i7;
                        i = ((iM55979 ^ i3) * (-6285)) ^ 658624701;
                        i2 = -93964373;
                        int i117 = i7;
                        i6 = iM55979 ^ i2;
                        i5 = i;
                        i7 = i117;
                    } else {
                        int iM55680 = (C0873.m55680("ᩳ۠") + i3) * (-95);
                        i5 = ((iM55680 ^ i4) * 8167) ^ 32861491;
                        i6 = iM55680 ^ 10829696;
                    }
                    break;
                case -48241770:
                case 1755633929:
                    C0930.m55885();
                    if (C0930.f81879 > 0) {
                        i7 = i7;
                        iM55979 = C0873.m55680("ܳۘ") ^ i4;
                        i = ((iM55979 ^ i3) * 19081) ^ (-33407939);
                        i2 = -769837676;
                        int i118 = i7;
                        i6 = iM55979 ^ i2;
                        i5 = i;
                        i7 = i118;
                    }
                    iM55979 = (C0873.m55680("֫ܿ") ^ i4) * (-47);
                    i7 = i7;
                    i = ((iM55979 ^ i3) * (-6285)) ^ 658624701;
                    i2 = -93964373;
                    int i119 = i7;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i7 = i119;
                    break;
                case 97525630:
                case 848168658:
                    i7 = i7;
                    sArr2 = f83008;
                    i12 = 22;
                    if (C1404.f82149 >= 0) {
                        iM55979 = C0873.m55680("ܳۘ") ^ i4;
                        i = ((iM55979 ^ i3) * 19081) ^ (-33407939);
                        i2 = -769837676;
                    } else {
                        iM55979 = C0873.m55680("۬ܰ") ^ i4;
                        i = ((iM55979 ^ i3) * (-31557)) ^ (-1928477531);
                        i2 = -1103920878;
                    }
                    int i1110 = i7;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i7 = i1110;
                    break;
                case 108736612:
                case 1188030366:
                    C0898.m55798(c23570, i7);
                    C0873.m55686(c23570, str);
                    break;
                case 264957574:
                case 2098554298:
                    if (!C0912.m55833()) {
                        i7 = i7;
                        iM55979 = (C0873.m55680("ۨۨ") + i4) * (-53);
                        i = ((iM55979 ^ i3) * (-27741)) ^ (-1859011174);
                        i2 = 1578782637;
                        int i1111 = i7;
                        i6 = iM55979 ^ i2;
                        i5 = i;
                        i7 = i1111;
                    } else {
                        int iM559713 = (i3 - C0946.m55979("ܰܶ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i6 = iM559713 ^ (-1124095326);
                        i5 = ((iM559713 ^ i4) * (-30439)) ^ (-19639728);
                    }
                    break;
                case 594637649:
                case 669114532:
                    C1024.m56209();
                    C1036.m56257();
                    break;
                default:
                    iM559711 = C0946.m55979(C1194.m56386(sArr2, i12, i13, i11));
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        i7 = i7;
                        iM55979 = C0873.m55680("ۛ֨") ^ i3;
                        i = ((iM55979 ^ i4) * (-18667)) ^ (-1563780486);
                        i2 = -1652106829;
                    } else {
                        iM55979 = C0946.m55979("ۗۚ") ^ i3;
                        i7 = i7;
                        i = ((iM55979 ^ i4) * 1815) ^ (-971997640);
                        i2 = 113420665;
                    }
                    int i1112 = i7;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    i7 = i1112;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0204 A[PHI: r8 r11 r19
      0x0204: PHI (r8v4 int) = (r8v3 int), (r8v2 int) binds: [B:54:0x0202, B:46:0x01b8] A[DONT_GENERATE, DONT_INLINE]
      0x0204: PHI (r11v3 int) = (r11v2 int), (r11v4 int) binds: [B:54:0x0202, B:46:0x01b8] A[DONT_GENERATE, DONT_INLINE]
      0x0204: PHI (r19v10 int) = (r19v8 int), (r19v11 int) binds: [B:54:0x0202, B:46:0x01b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0254 A[PHI: r3 r5 r6 r7 r13 r14 r15 r19
      0x0254: PHI (r3v5 int) = (r3v2 int), (r3v2 int), (r3v4 int), (r3v2 int) binds: [B:59:0x0252, B:35:0x012b, B:12:0x006a, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r5v4 char) = (r5v3 char), (r5v2 char), (r5v2 char), (r5v2 char) binds: [B:59:0x0252, B:35:0x012b, B:12:0x006a, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r6v3 short) = (r6v2 short), (r6v2 short), (r6v2 short), (r6v6 short) binds: [B:59:0x0252, B:35:0x012b, B:12:0x006a, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r7v3 short) = (r7v2 short), (r7v2 short), (r7v2 short), (r7v6 short) binds: [B:59:0x0252, B:35:0x012b, B:12:0x006a, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:59:0x0252, B:35:0x012b, B:12:0x006a, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:59:0x0252, B:35:0x012b, B:12:0x006a, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:59:0x0252, B:35:0x012b, B:12:0x006a, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r19v28 int) = (r19v7 int), (r19v16 int), (r19v25 int), (r19v32 int) binds: [B:59:0x0252, B:35:0x012b, B:12:0x006a, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x02aa A[PHI: r9 r10 r19 r20
      0x02aa: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:67:0x02a8, B:63:0x0288, B:50:0x01dc, B:10:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x02aa: PHI (r10v4 short) = (r10v2 short), (r10v2 short), (r10v3 short), (r10v2 short) binds: [B:67:0x02a8, B:63:0x0288, B:50:0x01dc, B:10:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x02aa: PHI (r19v26 int) = (r19v5 int), (r19v6 int), (r19v9 int), (r19v27 int) binds: [B:67:0x02a8, B:63:0x0288, B:50:0x01dc, B:10:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x02aa: PHI (r20v5 short[]) = (r20v3 short[]), (r20v4 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:67:0x02a8, B:63:0x0288, B:50:0x01dc, B:10:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.InterfaceC24834
    /* JADX INFO: renamed from: ۜ */
    public final void mo48746(String str) {
        int iM55680;
        int i;
        int i2;
        int i3 = C0873.f81841;
        int i4 = C0877.f81843;
        int iM55681 = C0873.m55680("ܰ᩸") ^ i4;
        int i5 = ((iM55681 ^ i3) * (-30067)) ^ 1038719060;
        C23570 c23570 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM55681 ^ (-826650556);
        int i7 = 0;
        int iM55682 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        int i9 = 0;
        short s3 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1917184009;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i3) * (-5915)) >> 31));
            switch (i14) {
                case -1752477521:
                case 843108501:
                    C0912.m55833();
                    if (C1003.f81929 <= 0) {
                        int iM55683 = (i4 - C0873.m55680("ۙ᩶")) * 65;
                        i5 = ((iM55683 ^ i3) * (-16827)) ^ (-1093769371);
                        i6 = iM55683 ^ 1309685220;
                    } else {
                        i7 = i7;
                        iM55680 = C0946.m55979("ۙۜ") ^ i4;
                        i = ((iM55680 ^ i3) * (-12173)) ^ (-504715605);
                        i2 = -351804662;
                        int i15 = i7;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                        i7 = i15;
                    }
                    break;
                case -1733620506:
                case 1206678837:
                    i7 = i7;
                    sArr2 = f83008;
                    i12 = 14;
                    i13 = 3;
                    if (C1404.f82149 >= 0) {
                        iM55680 = C0873.m55680("۠ۢ") ^ i3;
                        i = ((iM55680 ^ i4) * 25089) ^ 1367112894;
                        i2 = 839218375;
                    } else {
                        iM55680 = (C0873.m55680("ᩳ᩻") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM55680 ^ i3) * 2249) ^ (-109577857);
                        i2 = -1124566755;
                    }
                    int i16 = i7;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    i7 = i16;
                    break;
                case -1620390406:
                case 457107840:
                    i7 = i7;
                    i10 = s * s3;
                    if (C1025.m56230()) {
                        iM55680 = C0873.m55680("᩺ۡ") ^ i4;
                        i = ((iM55680 ^ i3) * (-22865)) ^ (-617165022);
                        i2 = 981149204;
                    } else {
                        iM55680 = (C0946.m55979("ᩴܽ") ^ i4) * (-91);
                        i = ((iM55680 ^ i3) * 17233) ^ 594646524;
                        i2 = -951982380;
                    }
                    int i17 = i7;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    i7 = i17;
                    break;
                case -1603701347:
                case 1031339491:
                    i7 = i7;
                    i9 = i8 * i8;
                    s3 = 2;
                    if (C0955.f81898) {
                        iM55680 = C0946.m55979("ۙۜ") ^ i4;
                        i = ((iM55680 ^ i3) * (-12173)) ^ (-504715605);
                        i2 = -351804662;
                    } else {
                        iM55680 = (C0873.m55680("᩺ۜ") + i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM55680 ^ i4) * (-17231)) ^ (-486341377);
                        i2 = -348302862;
                    }
                    int i18 = i7;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    i7 = i18;
                    break;
                case -1565490922:
                case 1453304990:
                    C1028.m56239(c23570, i7);
                    C0873.m55686(c23570, str);
                    break;
                case -1540014885:
                case 1026953817:
                    i7 = i7;
                    i8 = s + s2;
                    if (AbstractC0942.m55971()) {
                        iM55680 = C0873.m55680("᩺ۡ") ^ i4;
                        i = ((iM55680 ^ i3) * (-22865)) ^ (-617165022);
                        i2 = 981149204;
                    } else {
                        iM55680 = (C0946.m55979("ܺۨ") + i4) * 73;
                        i = ((iM55680 ^ i3) * 28577) ^ 747505147;
                        i2 = 884554174;
                    }
                    int i19 = i7;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    i7 = i19;
                    break;
                case -1380859408:
                case -1238279922:
                    i7 = i7;
                    if (i9 - (i10 + 1) >= 0) {
                        iM55680 = (i3 - C0873.m55680("ۢܰ")) * 79;
                        i = ((iM55680 ^ i4) * 4331) ^ (-90513794);
                        i2 = 1003598347;
                    } else {
                        iM55680 = (C0873.m55680("֡۫") ^ i4) * 67;
                        i = ((iM55680 ^ i3) * 12023) ^ (-1708216772);
                        i2 = 567788257;
                    }
                    int i110 = i7;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    i7 = i110;
                    break;
                case -1271461970:
                case -687001912:
                    C1044.m56286();
                    if (C0930.f81879 <= 0) {
                        i7 = i7;
                        iM55680 = C0873.m55680("۠ۢ") ^ i3;
                        i = ((iM55680 ^ i4) * 25089) ^ 1367112894;
                        i2 = 839218375;
                        int i111 = i7;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                        i7 = i111;
                    }
                    i7 = i7;
                    iM55680 = C0946.m55979("ۙۜ") ^ i4;
                    i = ((iM55680 ^ i3) * (-12173)) ^ (-504715605);
                    i2 = -351804662;
                    int i112 = i7;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    i7 = i112;
                    break;
                case -1155923868:
                case 1756710787:
                    C0955.m56025();
                    if (RunnableC0897.f81856) {
                        int iM55979 = (C0946.m55979("֡ۡ") ^ i3) * (-117);
                        i6 = iM55979 ^ (-1088021449);
                        i5 = ((iM55979 ^ i4) * 17991) ^ (-191280957);
                    } else {
                        i7 = i7;
                        iM55680 = C0946.m55979("ۙۜ") ^ i4;
                        i = ((iM55680 ^ i3) * (-12173)) ^ (-504715605);
                        i2 = -351804662;
                        int i113 = i7;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                        i7 = i113;
                    }
                    break;
                case -1108029646:
                case 1089843985:
                    i7 = i7;
                    if (AbstractC0942.f81890 <= 0) {
                        iM55680 = C0946.m55979("ۙۜ") ^ i4;
                        i = ((iM55680 ^ i3) * (-12173)) ^ (-504715605);
                        i2 = -351804662;
                    } else {
                        iM55680 = C0873.m55680("ܽ֫") ^ i3;
                        i = ((iM55680 ^ i4) * (-2257)) ^ (-1346507435);
                        i2 = -1404486073;
                    }
                    int i114 = i7;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    i7 = i114;
                    break;
                case -1064708470:
                case 1312572396:
                    iM55682 = C0873.m55680(C1071.m56336(sArr2, i12, i13, i11));
                    if (C0912.f81867 <= 0) {
                        i7 = i7;
                        iM55680 = C0873.m55680("۠ۢ") ^ i3;
                        i = ((iM55680 ^ i4) * 25089) ^ 1367112894;
                        i2 = 839218375;
                    } else {
                        iM55680 = C0946.m55979("ۘۖ") ^ i3;
                        i7 = i7;
                        i = ((iM55680 ^ i4) * 25791) ^ 782199973;
                        i2 = 522629862;
                    }
                    int i115 = i7;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    i7 = i115;
                    break;
                case -947620669:
                case 1365814586:
                    i11 = 54247;
                    iM55680 = (C0873.m55680("ۘ۠") + i3) * 123;
                    i = ((iM55680 ^ i4) * 13715) ^ (-578526986);
                    i2 = 197607324;
                    int i116 = i7;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    i7 = i116;
                    break;
                case -376545553:
                case -272770945:
                    i7 = i7;
                    c = '\r';
                    if (C1017.f81942 >= 0) {
                        iM55680 = C0873.m55680("۠ۢ") ^ i3;
                        i = ((iM55680 ^ i4) * 25089) ^ 1367112894;
                        i2 = 839218375;
                    } else {
                        iM55680 = (C0873.m55680("ۤ᩶") ^ i3) * 71;
                        i = ((iM55680 ^ i4) * 8047) ^ (-1227992914);
                        i2 = -1114798187;
                    }
                    int i117 = i7;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    i7 = i117;
                    break;
                case -234296352:
                case 1167492958:
                    i7 = 2127784509 ^ iM55682;
                    c23570 = this.f72068;
                    if (C0946.m55980() == 0) {
                        iM55680 = (C0946.m55979("ܿᩳ") + i3) * 41;
                        i7 = i7;
                        i = ((iM55680 ^ i4) * 12085) ^ 940049963;
                        i2 = 617482620;
                        int i118 = i7;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                        i7 = i118;
                    } else {
                        int iM55684 = (i4 - C0873.m55680("ۙ᩶")) * 65;
                        i5 = ((iM55684 ^ i3) * (-16827)) ^ (-1093769371);
                        i6 = iM55684 ^ 1309685220;
                    }
                    break;
                case -151439601:
                case 2053264833:
                    i7 = i7;
                    sArr = f83008;
                    if (C0917.f81868) {
                        iM55680 = C0946.m55979("ۙۜ") ^ i4;
                        i = ((iM55680 ^ i3) * (-12173)) ^ (-504715605);
                        i2 = -351804662;
                    } else {
                        iM55680 = (i4 - C0873.m55680("᩵᩶")) * (-5);
                        i = ((iM55680 ^ i3) * (-397)) ^ (-1269308474);
                        i2 = -787785605;
                    }
                    int i119 = i7;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    i7 = i119;
                    break;
                case 520957636:
                case 1808174717:
                    i11 = 35840;
                    iM55680 = (C0873.m55680("ۘ۠") + i3) * 123;
                    i = ((iM55680 ^ i4) * 13715) ^ (-578526986);
                    i2 = 197607324;
                    int i1110 = i7;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    i7 = i1110;
                    break;
                case 632130527:
                case 1875457668:
                    C0873.m55678();
                    C0873.m55678();
                    i7 = i7;
                    iM55680 = C0946.m55979("ۙۜ") ^ i4;
                    i = ((iM55680 ^ i3) * (-12173)) ^ (-504715605);
                    i2 = -351804662;
                    int i1111 = i7;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    i7 = i1111;
                    break;
                case 1363794807:
                case 1699226164:
                    RunnableC0938.m55938();
                    C0927.m55873();
                    break;
                default:
                    i7 = i7;
                    s = sArr[c];
                    s2 = 1;
                    if (C1929.m56553()) {
                        iM55680 = C0873.m55680("۠ۢ") ^ i3;
                        i = ((iM55680 ^ i4) * 25089) ^ 1367112894;
                        i2 = 839218375;
                    } else {
                        iM55680 = (i4 - C0873.m55680("ۢ᩵")) * 69;
                        i = ((iM55680 ^ i3) * (-11819)) ^ 737310022;
                        i2 = 1713862571;
                    }
                    int i1112 = i7;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    i7 = i1112;
                    break;
            }
            return;
        }
    }

    public C22900(C23570 c23570) {
        this.f72068 = c23570;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0283 A[PHI: r7 r8 r16 r17
      0x0283: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:64:0x0281, B:48:0x01e0, B:20:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x0283: PHI (r8v4 short) = (r8v2 short), (r8v3 short), (r8v2 short) binds: [B:64:0x0281, B:48:0x01e0, B:20:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x0283: PHI (r16v21 int) = (r16v6 int), (r16v10 int), (r16v22 int) binds: [B:64:0x0281, B:48:0x01e0, B:20:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x0283: PHI (r17v19 l.᩹۬ܽ) = (r17v6 l.᩹۬ܽ), (r17v10 l.᩹۬ܽ), (r17v20 l.᩹۬ܽ) binds: [B:64:0x0281, B:48:0x01e0, B:20:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x02b5 A[PHI: r3 r4 r6 r16 r17
      0x02b5: PHI (r3v3 int) = (r3v2 int), (r3v2 int), (r3v2 int), (r3v4 int) binds: [B:68:0x02b3, B:60:0x0260, B:52:0x0204, B:32:0x0101] A[DONT_GENERATE, DONT_INLINE]
      0x02b5: PHI (r4v3 int) = (r4v2 int), (r4v2 int), (r4v2 int), (r4v4 int) binds: [B:68:0x02b3, B:60:0x0260, B:52:0x0204, B:32:0x0101] A[DONT_GENERATE, DONT_INLINE]
      0x02b5: PHI (r6v4 short) = (r6v2 short), (r6v2 short), (r6v3 short), (r6v2 short) binds: [B:68:0x02b3, B:60:0x0260, B:52:0x0204, B:32:0x0101] A[DONT_GENERATE, DONT_INLINE]
      0x02b5: PHI (r16v16 int) = (r16v5 int), (r16v7 int), (r16v9 int), (r16v17 int) binds: [B:68:0x02b3, B:60:0x0260, B:52:0x0204, B:32:0x0101] A[DONT_GENERATE, DONT_INLINE]
      0x02b5: PHI (r17v16 l.᩹۬ܽ) = (r17v5 l.᩹۬ܽ), (r17v7 l.᩹۬ܽ), (r17v9 l.᩹۬ܽ), (r17v17 l.᩹۬ܽ) binds: [B:68:0x02b3, B:60:0x0260, B:52:0x0204, B:32:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.InterfaceC14797
    /* JADX INFO: renamed from: ֫ */
    public final void mo14982(boolean z, boolean z2) {
        int iM55680;
        int i;
        int i2;
        int i3 = C1046.f81962;
        int i4 = C0866.f81837;
        int iM55681 = C0873.m55680("۟۫") ^ i4;
        int i5 = ((iM55681 ^ i3) * (-1295)) ^ (-2082483521);
        String strM55726 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM55681 ^ (-718083559);
        C23570 c23570 = null;
        int iM55979 = 0;
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -2055031756;
        while (true) {
            int i13 = i6 ^ (i5 & (((i12 ^ i3) * 23157) >> 31));
            switch (i13) {
                case -1695608872:
                case -798051944:
                    i9 = 14274;
                    iM55680 = C0946.m55979("֫ܳ") ^ i4;
                    i = ((iM55680 ^ i3) * 9811) ^ 1774594088;
                    i2 = -1022344937;
                    i12 = i13;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    c23570 = c23570;
                    break;
                case -1511091692:
                case 1440026327:
                    c23570 = c23570;
                    i13 = i13;
                    if (C0861.f81831) {
                        iM55680 = (C0873.m55680("ۡ᩷") + i3) * 25;
                        i = ((iM55680 ^ i4) * 23281) ^ (-914561261);
                        i2 = 986840952;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ۧᩳ")) * (-87);
                        i = ((iM55680 ^ i4) * (-8419)) ^ 430571400;
                        i2 = 2126513621;
                    }
                    i12 = i13;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    c23570 = c23570;
                    break;
                case -1381330249:
                case -62216043:
                    i13 = i13;
                    C0845.m55584();
                    if (C1404.f82149 >= 0) {
                        c23570 = c23570;
                        iM55680 = C0946.m55979("۫ۡ") ^ i4;
                        i = ((iM55680 ^ i3) * 5385) ^ 372468675;
                        i2 = -152179329;
                        i12 = i13;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                        c23570 = c23570;
                    }
                    c23570 = c23570;
                    iM55680 = C0946.m55979("ۨۢ") ^ i4;
                    i = ((iM55680 ^ i3) * 13443) ^ (-100453866);
                    i2 = 705628380;
                    i12 = i13;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    c23570 = c23570;
                    break;
                case -1045883289:
                case -984634801:
                    i13 = i13;
                    if (C1046.f81962 > 0) {
                        iM55680 = C0873.m55680("᩵᩹") ^ i3;
                        c23570 = c23570;
                        i = ((iM55680 ^ i4) * (-4507)) ^ (-1407422430);
                        i2 = -77576524;
                        i12 = i13;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                        c23570 = c23570;
                    }
                    c23570 = c23570;
                    iM55680 = C0946.m55979("ۨۢ") ^ i4;
                    i = ((iM55680 ^ i3) * 13443) ^ (-100453866);
                    i2 = 705628380;
                    i12 = i13;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    c23570 = c23570;
                    break;
                case -1034687074:
                case -15851482:
                    C0967.m56074();
                    if (C0861.m55626()) {
                        c23570 = c23570;
                        i13 = i13;
                        iM55680 = C0946.m55979("ۨۢ") ^ i4;
                        i = ((iM55680 ^ i3) * 13443) ^ (-100453866);
                        i2 = 705628380;
                        i12 = i13;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                        c23570 = c23570;
                    } else {
                        int iM55682 = C0873.m55680("ۗ᩹") ^ i4;
                        i6 = iM55682 ^ 443290318;
                        i5 = ((iM55682 ^ i3) * (-13429)) ^ 1843925130;
                        i12 = i13;
                    }
                    break;
                case -786788479:
                case 168912886:
                    c23570 = c23570;
                    i13 = i13;
                    if (C1194.f82045 != 0) {
                        iM55680 = (i3 - C0946.m55979("ۧᩳ")) * (-87);
                        i = ((iM55680 ^ i4) * (-8419)) ^ 430571400;
                        i2 = 2126513621;
                    } else {
                        iM55680 = (C0873.m55680("᩹᩵") ^ i4) * (-43);
                        i = ((iM55680 ^ i3) * 31949) ^ 301034861;
                        i2 = 2007245768;
                    }
                    i12 = i13;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    c23570 = c23570;
                    break;
                case -753679946:
                case 285361207:
                    i9 = 20603;
                    iM55680 = C0946.m55979("֫ܳ") ^ i4;
                    i = ((iM55680 ^ i3) * 9811) ^ 1774594088;
                    i2 = -1022344937;
                    i12 = i13;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    c23570 = c23570;
                    break;
                case -636018704:
                case 189670354:
                    C0946.m55981(c23570, C5410.m11878(z, z2));
                    break;
                case -561168629:
                case 1015322529:
                    c23570 = c23570;
                    i13 = i13;
                    s = sArr[0];
                    if (C1929.f83011 != 0) {
                        iM55680 = (i3 - C0946.m55979("ۧᩳ")) * (-87);
                        i = ((iM55680 ^ i4) * (-8419)) ^ 430571400;
                        i2 = 2126513621;
                    } else {
                        iM55680 = (C0946.m55979("֨ۢ") ^ i4) * (-61);
                        i = ((iM55680 ^ i3) * 30171) ^ 769036821;
                        i2 = -795431534;
                    }
                    i12 = i13;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    c23570 = c23570;
                    break;
                case -426609289:
                case 1275407073:
                    i13 = i13;
                    c23570 = this.f72068;
                    C0898.m55798(c23570, iM55979 ^ i7);
                    if (C1044.f81959 >= 0) {
                        iM55680 = C0873.m55680("᩵᩹") ^ i3;
                        c23570 = c23570;
                        i = ((iM55680 ^ i4) * (-4507)) ^ (-1407422430);
                        i2 = -77576524;
                    } else {
                        iM55680 = (C0873.m55680("᩷۬") ^ i3) * (-5);
                        c23570 = c23570;
                        i = ((iM55680 ^ i4) * 14069) ^ 2090822699;
                        i2 = 1162147220;
                    }
                    i12 = i13;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    c23570 = c23570;
                    break;
                case -254187664:
                case 473145852:
                    c23570 = c23570;
                    i13 = i13;
                    sArr2 = f83008;
                    i10 = 1;
                    i11 = 3;
                    if (C0967.m56074()) {
                        c23570 = c23570;
                        iM55680 = C0873.m55680("᩵᩹") ^ i3;
                        c23570 = c23570;
                        i = ((iM55680 ^ i4) * (-4507)) ^ (-1407422430);
                        i2 = -77576524;
                    } else {
                        iM55680 = (C0946.m55979("ܺ֫") ^ i3) * (-7);
                        i = ((iM55680 ^ i4) * (-12519)) ^ (-668479121);
                        i2 = -854972250;
                    }
                    i12 = i13;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    c23570 = c23570;
                    break;
                case -233214104:
                case 82132985:
                    c23570 = c23570;
                    i13 = i13;
                    i8 = s * 38332;
                    s2 = 9583;
                    if (C0955.f81898) {
                        iM55680 = C0946.m55979("۫ۡ") ^ i4;
                        i = ((iM55680 ^ i3) * 5385) ^ 372468675;
                        i2 = -152179329;
                    } else {
                        iM55680 = C0873.m55680("ۛ۫") ^ i3;
                        i = ((iM55680 ^ i4) * (-9525)) ^ 1069807319;
                        i2 = 2019979631;
                    }
                    i12 = i13;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    c23570 = c23570;
                    break;
                case -230693885:
                case -33843694:
                    c23570 = c23570;
                    i13 = i13;
                    if (C1044.f81959 >= 0) {
                        iM55680 = C0946.m55979("۫ۡ") ^ i4;
                        i = ((iM55680 ^ i3) * 5385) ^ 372468675;
                        i2 = -152179329;
                    } else {
                        iM55680 = C0873.m55680("᩹ۗ") ^ i3;
                        i = ((iM55680 ^ i4) * (-19847)) ^ 371861193;
                        i2 = 52408078;
                    }
                    i12 = i13;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    c23570 = c23570;
                    break;
                case -181632475:
                case 288802857:
                    C1194.m56396();
                    C0992.m56107();
                    break;
                case -15762574:
                case 1836560064:
                    i13 = i13;
                    strM55726 = C0890.m55726(sArr2, i10, i11, i9);
                    if (C1229.f82066 >= 0) {
                        c23570 = c23570;
                        iM55680 = C0946.m55979("ۨۢ") ^ i4;
                        i = ((iM55680 ^ i3) * 13443) ^ (-100453866);
                        i2 = 705628380;
                    } else {
                        iM55680 = (C0946.m55979("ۛ᩻") + i4) * (-73);
                        c23570 = c23570;
                        i = ((iM55680 ^ i3) * (-17607)) ^ (-388867212);
                        i2 = 236465653;
                    }
                    i12 = i13;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    c23570 = c23570;
                    break;
                case 440192712:
                case 1125547117:
                    c23570 = c23570;
                    i13 = i13;
                    sArr = f83008;
                    if (AbstractC0942.f81890 <= 0) {
                        iM55680 = C0946.m55979("ۨۢ") ^ i4;
                        i = ((iM55680 ^ i3) * 13443) ^ (-100453866);
                        i2 = 705628380;
                    } else {
                        iM55680 = (i4 - C0946.m55979("ۢۘ")) * (-19);
                        i = ((iM55680 ^ i3) * 23239) ^ (-1453596120);
                        i2 = 1291084392;
                    }
                    i12 = i13;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    c23570 = c23570;
                    break;
                case 701392426:
                case 860780139:
                    i13 = i13;
                    C1024.m56209();
                    c23570 = c23570;
                    iM55680 = C0946.m55979("ۨۢ") ^ i4;
                    i = ((iM55680 ^ i3) * 13443) ^ (-100453866);
                    i2 = 705628380;
                    i12 = i13;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    c23570 = c23570;
                    break;
                case 987283030:
                case 1353744336:
                    i13 = i13;
                    iM55979 = C0946.m55979(strM55726);
                    if (C0906.f81862 >= 0) {
                        c23570 = c23570;
                        i7 = 2124790830;
                        iM55680 = (i3 - C0946.m55979("ۧᩳ")) * (-87);
                        i = ((iM55680 ^ i4) * (-8419)) ^ 430571400;
                        i2 = 2126513621;
                        i12 = i13;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                        c23570 = c23570;
                    } else {
                        int iM55683 = (C0873.m55680("۬᩹") + i3) * (-105);
                        i12 = i13;
                        i6 = iM55683 ^ (-2139175333);
                        i5 = ((iM55683 ^ i4) * 7697) ^ 423552393;
                        i7 = 2124790830;
                    }
                    break;
                default:
                    c23570 = c23570;
                    i13 = i13;
                    int i14 = s + s2;
                    if (i8 - (i14 * i14) <= 0) {
                        iM55680 = C0873.m55680("ۧۚ") ^ i3;
                        i = ((iM55680 ^ i4) * 29201) ^ (-1578004378);
                        i2 = -2049275966;
                    } else {
                        iM55680 = (C0873.m55680("ۛۗ") ^ i4) * (-39);
                        i = ((iM55680 ^ i3) * (-8711)) ^ 261682528;
                        i2 = -1686472353;
                    }
                    i12 = i13;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    c23570 = c23570;
                    break;
            }
            return;
        }
    }

    @Override // p067l.InterfaceC18588
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo3924() {
        return C0949.m56007(this.f72068);
    }
}
