package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.AbstractCollection;
import org.bouncycastle.pqc.crypto.snova.GF16Utils;

/* JADX INFO: renamed from: l.ۗܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAVZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3343 {

    /* JADX INFO: renamed from: ܿ֡ۢ, reason: not valid java name and contains not printable characters */
    private static final short[] f10564 = {5738, 27017, 27025};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C17249 f10565;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f10566;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public char[] f10567;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AbstractC7479 f10568;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC7479 f10569;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C1032 f10570;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC7479 f10571;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC7479 f10572;

    public C3343(C17249 c17249) {
        this.f10565 = c17249;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b0 A[PHI: r15
      0x00b0: PHI (r15v7 java.lang.Object) = (r15v2 java.lang.Object), (r15v3 java.lang.Object), (r15v2 java.lang.Object) binds: [B:110:0x00b0, B:23:0x00ae, B:11:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x024d A[PHI: r6 r8 r9
      0x024d: PHI (r6v4 int) = (r6v3 int), (r6v2 int), (r6v2 int), (r6v2 int) binds: [B:64:0x024b, B:56:0x0201, B:17:0x008a, B:14:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:64:0x024b, B:56:0x0201, B:17:0x008a, B:14:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:64:0x024b, B:56:0x0201, B:17:0x008a, B:14:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:94:0x0394 A[PHI: r4 r12 r13 r14 r19
      0x0394: PHI (r4v31 int) = (r4v26 int), (r4v27 int), (r4v32 int) binds: [B:9:0x0057, B:93:0x0392, B:76:0x02c7] A[DONT_GENERATE, DONT_INLINE]
      0x0394: PHI (r12v5 l.ܿ۫֡) = (r12v4 l.ܿ۫֡), (r12v2 l.ܿ۫֡), (r12v2 l.ܿ۫֡) binds: [B:9:0x0057, B:93:0x0392, B:76:0x02c7] A[DONT_GENERATE, DONT_INLINE]
      0x0394: PHI (r13v5 java.lang.Object) = (r13v4 java.lang.Object), (r13v2 java.lang.Object), (r13v2 java.lang.Object) binds: [B:9:0x0057, B:93:0x0392, B:76:0x02c7] A[DONT_GENERATE, DONT_INLINE]
      0x0394: PHI (r14v5 l.ܿ۫֡) = (r14v4 l.ܿ۫֡), (r14v2 l.ܿ۫֡), (r14v2 l.ܿ۫֡) binds: [B:9:0x0057, B:93:0x0392, B:76:0x02c7] A[DONT_GENERATE, DONT_INLINE]
      0x0394: PHI (r19v22 int) = (r19v17 int), (r19v18 int), (r19v23 int) binds: [B:9:0x0057, B:93:0x0392, B:76:0x02c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10203(C15152 c15152) {
        int i;
        int iM6981;
        int i2;
        int i3;
        int iM6982;
        int i4;
        int i5;
        int iM2566;
        int i6;
        int i7;
        int i8 = C1773.f6144;
        int i9 = C1047.f3863;
        int iM6983 = (C2105.m6981("᩷ۢ") ^ i8) * (-99);
        int i10 = ((iM6983 ^ i9) * 5041) ^ (-1659871705);
        InterfaceC1779 interfaceC1779 = null;
        Object objM37705 = null;
        int i11 = iM6983 ^ (-1049176296);
        C1109 c1109 = null;
        int i12 = 0;
        int iM37704 = 0;
        int iM9249 = 0;
        int i13 = 0;
        int iM13420 = 0;
        int i14 = 1679245501;
        int i15 = 0;
        C17337 c17337M6037 = null;
        Object objM37706 = null;
        C17337 c17337M6038 = null;
        int i16 = 0;
        while (true) {
            i14 = i11 ^ (i10 & (((i14 ^ i9) * GF16Utils.GF16_MASK) >> 31));
            switch (i14) {
                case -2115906532:
                case -808299673:
                    C0050.m934(c1109, this.f10568);
                    break;
                case -2039652103:
                case -1782742080:
                    iM37704 = this.f10569.m20099().m37704();
                    if (C3245.f10203 <= 0) {
                        iM6981 = C0630.m2566("ܶۜ") ^ i9;
                        i2 = ((iM6981 ^ i8) * 1873) ^ 735652441;
                        i3 = 1055571569;
                    } else {
                        iM6981 = (C0630.m2566("ۨۨ") + i9) * (-79);
                        i2 = ((iM6981 ^ i8) * 11991) ^ (-1785994118);
                        i3 = -532168277;
                    }
                    i11 = iM6981 ^ i3;
                    i10 = i2;
                    break;
                case -1996403146:
                case 689563963:
                    iM13420 = C4570.m13420(c15152, iM9249, i13);
                    if (iM13420 == -1) {
                        iM6981 = (C0630.m2566("ۘ᩸") ^ i9) * 23;
                        i2 = ((iM6981 ^ i8) * (-6985)) ^ 133813685;
                        i3 = 1650706591;
                    } else {
                        iM6981 = C2105.m6981("ۗܰ") ^ i8;
                        i2 = ((iM6981 ^ i9) * 8835) ^ (-1400443174);
                        i3 = 633010508;
                    }
                    i11 = iM6981 ^ i3;
                    i10 = i2;
                    break;
                case -1846185294:
                case 357258784:
                    iM9249 = C3019.m9249(interfaceC1779);
                    i13 = iM37704 - 1;
                    if (C2958.m9034() <= 0) {
                        iM6981 = C0630.m2566("ܶۜ") ^ i9;
                        i2 = ((iM6981 ^ i8) * 1873) ^ 735652441;
                        i3 = 1055571569;
                    } else {
                        iM6981 = C0630.m2566("ۜ᩷") ^ i8;
                        i2 = ((iM6981 ^ i9) * 28571) ^ 1879118817;
                        i3 = -1480802085;
                    }
                    i11 = iM6981 ^ i3;
                    i10 = i2;
                    break;
                case -1824861098:
                case 756301809:
                    i12 = i12;
                    i = i15;
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        iM6982 = C0630.m2566("ۗ֫") ^ i8;
                        i4 = ((iM6982 ^ i9) * 4043) ^ (-1923676590);
                        i5 = 1321829123;
                    } else {
                        iM6982 = C2105.m6981("ۖ֫") ^ i9;
                        i4 = ((iM6982 ^ i8) * 20873) ^ (-146231465);
                        i5 = 1124915173;
                    }
                    int i17 = iM6982 ^ i5;
                    i15 = i;
                    int i18 = i12;
                    i11 = i17;
                    i10 = i4;
                    i12 = i18;
                    break;
                case -1783402073:
                case 1655118263:
                    C3746.m11369();
                    ServiceConnectionC3453.m10564();
                    iM6981 = C0630.m2566("ܶۜ") ^ i9;
                    i2 = ((iM6981 ^ i8) * 1873) ^ 735652441;
                    i3 = 1055571569;
                    i11 = iM6981 ^ i3;
                    i10 = i2;
                    break;
                case -1655850288:
                case 1663493843:
                    C0483.m2121();
                    if (C4263.m12819() >= 0) {
                        iM6981 = C0630.m2566("ܶۜ") ^ i9;
                        i2 = ((iM6981 ^ i8) * 1873) ^ 735652441;
                        i3 = 1055571569;
                    } else {
                        iM6981 = (i8 - C0630.m2566("ܿ᩻")) * (-13);
                        i2 = ((iM6981 ^ i9) * 653) ^ (-201009333);
                        i3 = -1026957479;
                    }
                    i11 = iM6981 ^ i3;
                    i10 = i2;
                    break;
                case -1631470838:
                case 1618230081:
                    C2520.m8026();
                    if (C4263.m12819() >= 0) {
                        iM6981 = (i8 - C0630.m2566("ܿ᩻")) * (-13);
                        i2 = ((iM6981 ^ i9) * 653) ^ (-201009333);
                        i3 = -1026957479;
                    } else {
                        iM6981 = (i9 - C0630.m2566("ᩳ۠")) * (-93);
                        i2 = ((iM6981 ^ i8) * (-30969)) ^ 1483985517;
                        i3 = -4947065;
                    }
                    i11 = iM6981 ^ i3;
                    i10 = i2;
                    break;
                case -1604826898:
                case -1282253442:
                    C3746.m11369();
                    C7811.m20844();
                    break;
                case -1376182295:
                case 1543728853:
                    int i19 = this.f10566;
                    if (i19 == 1) {
                        iM2566 = (C0630.m2566("᩶ᩴ") ^ i8) * (-7);
                        i6 = ((iM2566 ^ i9) * (-12225)) ^ (-445035626);
                        i7 = -1316338580;
                    } else {
                        iM2566 = (C0630.m2566("֫᩸") ^ i9) * (-105);
                        i6 = ((iM2566 ^ i8) * 31075) ^ 1594557953;
                        i7 = 706094597;
                    }
                    int i20 = iM2566 ^ i7;
                    i15 = i19;
                    i11 = i20;
                    i10 = i6;
                    i12 = 1;
                    break;
                case -1239109461:
                case 185025411:
                    i16 = iM37704 + i12;
                    if (!C4570.m13427(c15152, iM9249, i16)) {
                        iM6981 = C2105.m6981("ܰ۫") ^ i8;
                        i2 = ((iM6981 ^ i9) * 21489) ^ 1212018868;
                        i3 = 1325521665;
                        i11 = iM6981 ^ i3;
                        i10 = i2;
                    } else {
                        i = i15;
                        iM6982 = (C2105.m6981("᩶ۡ") ^ i9) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM6982 ^ i8) * 31181) ^ 737913897;
                        i5 = -1586362429;
                        int i110 = iM6982 ^ i5;
                        i15 = i;
                        int i111 = i12;
                        i11 = i110;
                        i10 = i4;
                        i12 = i111;
                    }
                    break;
                case -1208623054:
                case 1260194673:
                    interfaceC1779 = (InterfaceC1779) this.f10569;
                    if (C0237.f1507 == 0) {
                        iM6981 = (C2105.m6981("ܳ᩺") ^ i9) * (-85);
                        i2 = ((iM6981 ^ i8) * 14741) ^ 2051896398;
                        i3 = 329210298;
                        i11 = iM6981 ^ i3;
                        i10 = i2;
                    } else {
                        i12 = i12;
                        i = i15;
                        iM6982 = (C2105.m6981("᩹ᩳ") ^ i9) * (-101);
                        i4 = ((iM6982 ^ i8) * (-9495)) ^ (-152229208);
                        i5 = 628314205;
                        int i112 = iM6982 ^ i5;
                        i15 = i;
                        int i113 = i12;
                        i11 = i112;
                        i10 = i4;
                        i12 = i113;
                    }
                    break;
                case -1168470739:
                case 155644260:
                    i12 = i12;
                    i = i15;
                    C0422.m1943(c1109, this.f10571);
                    if (C3432.f10845 >= 0) {
                        iM6982 = C0630.m2566("ۗ֫") ^ i8;
                        i4 = ((iM6982 ^ i9) * 4043) ^ (-1923676590);
                        i5 = 1321829123;
                    } else {
                        iM6982 = (i9 - C0630.m2566("֨۬")) * (-41);
                        i4 = ((iM6982 ^ i8) * 77) ^ 837274010;
                        i5 = -1741291404;
                    }
                    int i114 = iM6982 ^ i5;
                    i15 = i;
                    int i115 = i12;
                    i11 = i114;
                    i10 = i4;
                    i12 = i115;
                    break;
                case -995556073:
                case -624022988:
                    objM37705 = c17337M6037.m40667().m37705();
                    if (C2105.f7037 != 0) {
                        iM6981 = (i9 - C0630.m2566("ᩳ۠")) * (-93);
                        i2 = ((iM6981 ^ i8) * (-30969)) ^ 1483985517;
                        i3 = -4947065;
                    } else {
                        iM6981 = (C0630.m2566("᩷ۧ") ^ i8) * 51;
                        i2 = ((iM6981 ^ i9) * (-19457)) ^ 1305200169;
                        i3 = -1408487024;
                    }
                    i11 = iM6981 ^ i3;
                    i10 = i2;
                    break;
                case -920157462:
                case 1758189225:
                    C0050.m934(c1109, this.f10572);
                    i = i15;
                    iM6982 = (C2105.m6981("᩶ۡ") ^ i9) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i4 = ((iM6982 ^ i8) * 31181) ^ 737913897;
                    i5 = -1586362429;
                    int i116 = iM6982 ^ i5;
                    i15 = i;
                    int i117 = i12;
                    i11 = i116;
                    i10 = i4;
                    i12 = i117;
                    break;
                case -831255783:
                case 211742740:
                    i12 = i12;
                    i = i15;
                    c1109 = c15152.f46301;
                    if (AbstractC2021.f6743 <= 0) {
                        iM6982 = (C2105.m6981("᩹ᩳ") ^ i9) * (-101);
                        i4 = ((iM6982 ^ i8) * (-9495)) ^ (-152229208);
                        i5 = 628314205;
                    } else {
                        iM6982 = C2105.m6981("᩸ᩴ") ^ i8;
                        i4 = ((iM6982 ^ i9) * 10263) ^ 1553414105;
                        i5 = 1925005791;
                    }
                    int i118 = iM6982 ^ i5;
                    i15 = i;
                    int i119 = i12;
                    i11 = i118;
                    i10 = i4;
                    i12 = i119;
                    break;
                case -748365031:
                case 438015334:
                    i12 = i12;
                    i = i15;
                    if (i == 2) {
                        iM6982 = (C2105.m6981("۠ۘ") + i8) * (-49);
                        i4 = ((iM6982 ^ i9) * (-11935)) ^ 830854658;
                        i5 = -1741969742;
                    } else {
                        iM6982 = C2105.m6981("᩷ۘ") ^ i8;
                        i4 = ((iM6982 ^ i9) * 28367) ^ (-1275281513);
                        i5 = 93391351;
                    }
                    int i1110 = iM6982 ^ i5;
                    i15 = i;
                    int i1111 = i12;
                    i11 = i1110;
                    i10 = i4;
                    i12 = i1111;
                    break;
                case -675354736:
                case 1500644826:
                    if (!C4570.m13427(c15152, iM9249, iM37704 + i12)) {
                        iM6981 = C2105.m6981("۬ܺ") ^ i9;
                        i2 = ((iM6981 ^ i8) * 3619) ^ 2137552827;
                        i3 = -364496501;
                        i11 = iM6981 ^ i3;
                        i10 = i2;
                    } else {
                        i = i15;
                        iM6982 = (C2105.m6981("᩶ۡ") ^ i9) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM6982 ^ i8) * 31181) ^ 737913897;
                        i5 = -1586362429;
                        int i1112 = iM6982 ^ i5;
                        i15 = i;
                        int i1113 = i12;
                        i11 = i1112;
                        i10 = i4;
                        i12 = i1113;
                    }
                    break;
                case -471843198:
                case -463173330:
                    ((AbstractCollection) objM37705).remove(c17337M6037);
                    C0422.m1943(c1109, this.f10569);
                    break;
                case -452564636:
                case -270525999:
                    c17337M6037 = ((AbstractC1815) this.f10569).m6037();
                    if (C2167.f7158 < 0) {
                        iM6981 = (C0630.m2566("ᩴۡ") + i9) * (-83);
                        i2 = ((iM6981 ^ i8) * (-14507)) ^ 1999544619;
                        i3 = -442294007;
                        i11 = iM6981 ^ i3;
                        i10 = i2;
                    } else {
                        i12 = i12;
                        i = i15;
                        iM6982 = C0630.m2566("ۗ֫") ^ i8;
                        i4 = ((iM6982 ^ i9) * 4043) ^ (-1923676590);
                        i5 = 1321829123;
                        int i1114 = iM6982 ^ i5;
                        i15 = i;
                        int i1115 = i12;
                        i11 = i1114;
                        i10 = i4;
                        i12 = i1115;
                    }
                    break;
                case -424404756:
                case 1211412732:
                    objM37706 = c17337M6038.m40667().m37705();
                    if (!C1711.f5919) {
                        iM6981 = (C2105.m6981("ۢᩳ") + i8) * 65;
                        i2 = ((iM6981 ^ i9) * 11675) ^ (-1096348703);
                        i3 = -2026769203;
                        i11 = iM6981 ^ i3;
                        i10 = i2;
                    } else {
                        i12 = i12;
                        i = i15;
                        iM6982 = C0630.m2566("ۗ֫") ^ i8;
                        i4 = ((iM6982 ^ i9) * 4043) ^ (-1923676590);
                        i5 = 1321829123;
                        int i1116 = iM6982 ^ i5;
                        i15 = i;
                        int i1117 = i12;
                        i11 = i1116;
                        i10 = i4;
                        i12 = i1117;
                    }
                    break;
                case 187232508:
                case 1821824123:
                    C22628.m50615();
                    if (C7106.f21815 != 0) {
                        i12 = i12;
                        i = i15;
                        iM6982 = C0630.m2566("ۗ֫") ^ i8;
                        i4 = ((iM6982 ^ i9) * 4043) ^ (-1923676590);
                        i5 = 1321829123;
                        int i1118 = iM6982 ^ i5;
                        i15 = i;
                        int i1119 = i12;
                        i11 = i1118;
                        i10 = i4;
                        i12 = i1119;
                    } else {
                        iM6981 = (i9 - C0630.m2566("ᩳ۠")) * (-93);
                        i2 = ((iM6981 ^ i8) * (-30969)) ^ 1483985517;
                        i3 = -4947065;
                        i11 = iM6981 ^ i3;
                        i10 = i2;
                    }
                    break;
                case 474779932:
                case 1639735116:
                    if (!C4570.m13427(c15152, iM13420, i16)) {
                        iM6981 = (C0630.m2566("ۗ᩶") + i8) * (-119);
                        i2 = ((iM6981 ^ i9) * (-31279)) ^ 2078316417;
                        i3 = -1601244935;
                        i11 = iM6981 ^ i3;
                        i10 = i2;
                    } else {
                        i = i15;
                        iM6982 = (C2105.m6981("᩶ۡ") ^ i9) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM6982 ^ i8) * 31181) ^ 737913897;
                        i5 = -1586362429;
                        int i11110 = iM6982 ^ i5;
                        i15 = i;
                        int i11111 = i12;
                        i11 = i11110;
                        i10 = i4;
                        i12 = i11111;
                    }
                    break;
                case 724521792:
                case 843777109:
                    i = i15;
                    if (i == 3) {
                        iM6982 = (C2105.m6981("֨ܰ") ^ i8) * (-95);
                        i12 = i12;
                        i4 = ((iM6982 ^ i9) * 28997) ^ 520334128;
                        i5 = 1856670420;
                    } else {
                        iM6982 = (C2105.m6981("᩶ۡ") ^ i9) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM6982 ^ i8) * 31181) ^ 737913897;
                        i5 = -1586362429;
                    }
                    int i11112 = iM6982 ^ i5;
                    i15 = i;
                    int i11113 = i12;
                    i11 = i11112;
                    i10 = i4;
                    i12 = i11113;
                    break;
                case 746345092:
                case 1732174124:
                    c17337M6038 = ((AbstractC1815) this.f10569).m6037();
                    if (RunnableC0588.m2441() < 0) {
                        iM6981 = C2105.m6981("֫ۛ") ^ i9;
                        i2 = ((iM6981 ^ i8) * (-23735)) ^ 2023349079;
                        i3 = 1808575253;
                        i11 = iM6981 ^ i3;
                        i10 = i2;
                    } else {
                        i12 = i12;
                        i = i15;
                        iM6982 = C0630.m2566("ۗ֫") ^ i8;
                        i4 = ((iM6982 ^ i9) * 4043) ^ (-1923676590);
                        i5 = 1321829123;
                        int i11114 = iM6982 ^ i5;
                        i15 = i;
                        int i11115 = i12;
                        i11 = i11114;
                        i10 = i4;
                        i12 = i11115;
                    }
                    break;
                case 941257905:
                case 1499674442:
                    ((AbstractCollection) objM37706).remove(c17337M6038);
                    C0050.m934(c1109, this.f10569);
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final char[] m10205() {
        return this.f10567;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 43281. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m10204(l.C15152 r52, int r53, int r54) {
        /*
            Method dump skipped, instruction units count: 4328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3343.m10204(l.ܶۢᩳ, int, int):boolean");
    }
}
