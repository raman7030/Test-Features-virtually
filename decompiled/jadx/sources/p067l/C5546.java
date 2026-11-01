package p067l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.AbstractCollection;
import org.bouncycastle.pqc.crypto.snova.GF16Utils;

/* JADX INFO: renamed from: l.ۗܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAVZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5546 {

    /* JADX INFO: renamed from: ܿ֡ۢ, reason: not valid java name and contains not printable characters */
    private static final short[] f81932 = {5738, 27017, 27025};

    /* JADX INFO: renamed from: ֫ */
    public C18762 f13374;

    /* JADX INFO: renamed from: ۜ */
    public int f13375;

    /* JADX INFO: renamed from: ۧ */
    public char[] f13376;

    /* JADX INFO: renamed from: ܳ */
    public AbstractC9476 f13377;

    /* JADX INFO: renamed from: ܽ */
    public AbstractC9476 f13378;

    /* JADX INFO: renamed from: ܿ */
    public C3349 f13379;

    /* JADX INFO: renamed from: ᩳ */
    public AbstractC9476 f13380;

    /* JADX INFO: renamed from: ᩻ */
    public AbstractC9476 f13381;

    public C5546(C18762 c18762) {
        this.f13374 = c18762;
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
    /* JADX INFO: renamed from: ֫ */
    public final void m12239(C16769 c16769) {
        int i;
        int iM55979;
        int i2;
        int i3;
        int iM559710;
        int i4;
        int i5;
        int iM55680;
        int i6;
        int i7;
        int i8 = C0930.f81879;
        int i9 = C0894.f81854;
        int iM559711 = (C0946.m55979("᩷ۢ") ^ i8) * (-99);
        int i10 = ((iM559711 ^ i9) * 5041) ^ (-1659871705);
        InterfaceC4059 interfaceC4059 = null;
        Object objM39880 = null;
        int i11 = iM559711 ^ (-1049176296);
        C3422 c3422 = null;
        int i12 = 0;
        int iM39879 = 0;
        int iM56101 = 0;
        int i13 = 0;
        int iM15308 = 0;
        int i14 = 1679245501;
        int i15 = 0;
        C18845 c18845M8235 = null;
        Object objM39881 = null;
        C18845 c18845M8236 = null;
        int i16 = 0;
        while (true) {
            i14 = i11 ^ (i10 & (((i14 ^ i9) * GF16Utils.GF16_MASK) >> 31));
            switch (i14) {
                case -2115906532:
                case -808299673:
                    C0845.m55578(c3422, this.f13377);
                    break;
                case -2039652103:
                case -1782742080:
                    iM39879 = this.f13378.m22075().m39879();
                    if (C1003.f81929 <= 0) {
                        iM55979 = C0873.m55680("ܶۜ") ^ i9;
                        i2 = ((iM55979 ^ i8) * 1873) ^ 735652441;
                        i3 = 1055571569;
                    } else {
                        iM55979 = (C0873.m55680("ۨۨ") + i9) * (-79);
                        i2 = ((iM55979 ^ i8) * 11991) ^ (-1785994118);
                        i3 = -532168277;
                    }
                    i11 = iM55979 ^ i3;
                    i10 = i2;
                    break;
                case -1996403146:
                case 689563963:
                    iM15308 = C6712.m15308(c16769, iM56101, i13);
                    if (iM15308 == -1) {
                        iM55979 = (C0873.m55680("ۘ᩸") ^ i9) * 23;
                        i2 = ((iM55979 ^ i8) * (-6985)) ^ 133813685;
                        i3 = 1650706591;
                    } else {
                        iM55979 = C0946.m55979("ۗܰ") ^ i8;
                        i2 = ((iM55979 ^ i9) * 8835) ^ (-1400443174);
                        i3 = 633010508;
                    }
                    i11 = iM55979 ^ i3;
                    i10 = i2;
                    break;
                case -1846185294:
                case 357258784:
                    iM56101 = C0992.m56101(interfaceC4059);
                    i13 = iM39879 - 1;
                    if (C0989.m56095() <= 0) {
                        iM55979 = C0873.m55680("ܶۜ") ^ i9;
                        i2 = ((iM55979 ^ i8) * 1873) ^ 735652441;
                        i3 = 1055571569;
                    } else {
                        iM55979 = C0873.m55680("ۜ᩷") ^ i8;
                        i2 = ((iM55979 ^ i9) * 28571) ^ 1879118817;
                        i3 = -1480802085;
                    }
                    i11 = iM55979 ^ i3;
                    i10 = i2;
                    break;
                case -1824861098:
                case 756301809:
                    i12 = i12;
                    i = i15;
                    if (ServiceConnectionC1013.m56157() <= 0) {
                        iM559710 = C0873.m55680("ۗ֫") ^ i8;
                        i4 = ((iM559710 ^ i9) * 4043) ^ (-1923676590);
                        i5 = 1321829123;
                    } else {
                        iM559710 = C0946.m55979("ۖ֫") ^ i9;
                        i4 = ((iM559710 ^ i8) * 20873) ^ (-146231465);
                        i5 = 1124915173;
                    }
                    int i17 = iM559710 ^ i5;
                    i15 = i;
                    int i18 = i12;
                    i11 = i17;
                    i10 = i4;
                    i12 = i18;
                    break;
                case -1783402073:
                case 1655118263:
                    C1028.m56247();
                    ServiceConnectionC1013.m56157();
                    iM55979 = C0873.m55680("ܶۜ") ^ i9;
                    i2 = ((iM55979 ^ i8) * 1873) ^ 735652441;
                    i3 = 1055571569;
                    i11 = iM55979 ^ i3;
                    i10 = i2;
                    break;
                case -1655850288:
                case 1663493843:
                    C0866.m55645();
                    if (C1053.m56327() >= 0) {
                        iM55979 = C0873.m55680("ܶۜ") ^ i9;
                        i2 = ((iM55979 ^ i8) * 1873) ^ 735652441;
                        i3 = 1055571569;
                    } else {
                        iM55979 = (i8 - C0873.m55680("ܿ᩻")) * (-13);
                        i2 = ((iM55979 ^ i9) * 653) ^ (-201009333);
                        i3 = -1026957479;
                    }
                    i11 = iM55979 ^ i3;
                    i10 = i2;
                    break;
                case -1631470838:
                case 1618230081:
                    C0967.m56074();
                    if (C1053.m56327() >= 0) {
                        iM55979 = (i8 - C0873.m55680("ܿ᩻")) * (-13);
                        i2 = ((iM55979 ^ i9) * 653) ^ (-201009333);
                        i3 = -1026957479;
                    } else {
                        iM55979 = (i9 - C0873.m55680("ᩳ۠")) * (-93);
                        i2 = ((iM55979 ^ i8) * (-30969)) ^ 1483985517;
                        i3 = -4947065;
                    }
                    i11 = iM55979 ^ i3;
                    i10 = i2;
                    break;
                case -1604826898:
                case -1282253442:
                    C1028.m56247();
                    C1229.m56410();
                    break;
                case -1376182295:
                case 1543728853:
                    int i19 = this.f13375;
                    if (i19 == 1) {
                        iM55680 = (C0873.m55680("᩶ᩴ") ^ i8) * (-7);
                        i6 = ((iM55680 ^ i9) * (-12225)) ^ (-445035626);
                        i7 = -1316338580;
                    } else {
                        iM55680 = (C0873.m55680("֫᩸") ^ i9) * (-105);
                        i6 = ((iM55680 ^ i8) * 31075) ^ 1594557953;
                        i7 = 706094597;
                    }
                    int i20 = iM55680 ^ i7;
                    i15 = i19;
                    i11 = i20;
                    i10 = i6;
                    i12 = 1;
                    break;
                case -1239109461:
                case 185025411:
                    i16 = iM39879 + i12;
                    if (!C6712.m15315(c16769, iM56101, i16)) {
                        iM55979 = C0946.m55979("ܰ۫") ^ i8;
                        i2 = ((iM55979 ^ i9) * 21489) ^ 1212018868;
                        i3 = 1325521665;
                        i11 = iM55979 ^ i3;
                        i10 = i2;
                    } else {
                        i = i15;
                        iM559710 = (C0946.m55979("᩶ۡ") ^ i9) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM559710 ^ i8) * 31181) ^ 737913897;
                        i5 = -1586362429;
                        int i110 = iM559710 ^ i5;
                        i15 = i;
                        int i111 = i12;
                        i11 = i110;
                        i10 = i4;
                        i12 = i111;
                    }
                    break;
                case -1208623054:
                case 1260194673:
                    interfaceC4059 = (InterfaceC4059) this.f13378;
                    if (C0854.f81826 == 0) {
                        iM55979 = (C0946.m55979("ܳ᩺") ^ i9) * (-85);
                        i2 = ((iM55979 ^ i8) * 14741) ^ 2051896398;
                        i3 = 329210298;
                        i11 = iM55979 ^ i3;
                        i10 = i2;
                    } else {
                        i12 = i12;
                        i = i15;
                        iM559710 = (C0946.m55979("᩹ᩳ") ^ i9) * (-101);
                        i4 = ((iM559710 ^ i8) * (-9495)) ^ (-152229208);
                        i5 = 628314205;
                        int i112 = iM559710 ^ i5;
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
                    C0863.m55628(c3422, this.f13380);
                    if (C1012.f81938 >= 0) {
                        iM559710 = C0873.m55680("ۗ֫") ^ i8;
                        i4 = ((iM559710 ^ i9) * 4043) ^ (-1923676590);
                        i5 = 1321829123;
                    } else {
                        iM559710 = (i9 - C0873.m55680("֨۬")) * (-41);
                        i4 = ((iM559710 ^ i8) * 77) ^ 837274010;
                        i5 = -1741291404;
                    }
                    int i114 = iM559710 ^ i5;
                    i15 = i;
                    int i115 = i12;
                    i11 = i114;
                    i10 = i4;
                    i12 = i115;
                    break;
                case -995556073:
                case -624022988:
                    objM39880 = c18845M8235.m42918().m39880();
                    if (C0946.f81894 != 0) {
                        iM55979 = (i9 - C0873.m55680("ᩳ۠")) * (-93);
                        i2 = ((iM55979 ^ i8) * (-30969)) ^ 1483985517;
                        i3 = -4947065;
                    } else {
                        iM55979 = (C0873.m55680("᩷ۧ") ^ i8) * 51;
                        i2 = ((iM55979 ^ i9) * (-19457)) ^ 1305200169;
                        i3 = -1408487024;
                    }
                    i11 = iM55979 ^ i3;
                    i10 = i2;
                    break;
                case -920157462:
                case 1758189225:
                    C0845.m55578(c3422, this.f13381);
                    i = i15;
                    iM559710 = (C0946.m55979("᩶ۡ") ^ i9) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i4 = ((iM559710 ^ i8) * 31181) ^ 737913897;
                    i5 = -1586362429;
                    int i116 = iM559710 ^ i5;
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
                    c3422 = c16769.f49420;
                    if (AbstractC0942.f81890 <= 0) {
                        iM559710 = (C0946.m55979("᩹ᩳ") ^ i9) * (-101);
                        i4 = ((iM559710 ^ i8) * (-9495)) ^ (-152229208);
                        i5 = 628314205;
                    } else {
                        iM559710 = C0946.m55979("᩸ᩴ") ^ i8;
                        i4 = ((iM559710 ^ i9) * 10263) ^ 1553414105;
                        i5 = 1925005791;
                    }
                    int i118 = iM559710 ^ i5;
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
                        iM559710 = (C0946.m55979("۠ۘ") + i8) * (-49);
                        i4 = ((iM559710 ^ i9) * (-11935)) ^ 830854658;
                        i5 = -1741969742;
                    } else {
                        iM559710 = C0946.m55979("᩷ۘ") ^ i8;
                        i4 = ((iM559710 ^ i9) * 28367) ^ (-1275281513);
                        i5 = 93391351;
                    }
                    int i1110 = iM559710 ^ i5;
                    i15 = i;
                    int i1111 = i12;
                    i11 = i1110;
                    i10 = i4;
                    i12 = i1111;
                    break;
                case -675354736:
                case 1500644826:
                    if (!C6712.m15315(c16769, iM56101, iM39879 + i12)) {
                        iM55979 = C0946.m55979("۬ܺ") ^ i9;
                        i2 = ((iM55979 ^ i8) * 3619) ^ 2137552827;
                        i3 = -364496501;
                        i11 = iM55979 ^ i3;
                        i10 = i2;
                    } else {
                        i = i15;
                        iM559710 = (C0946.m55979("᩶ۡ") ^ i9) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM559710 ^ i8) * 31181) ^ 737913897;
                        i5 = -1586362429;
                        int i1112 = iM559710 ^ i5;
                        i15 = i;
                        int i1113 = i12;
                        i11 = i1112;
                        i10 = i4;
                        i12 = i1113;
                    }
                    break;
                case -471843198:
                case -463173330:
                    ((AbstractCollection) objM39880).remove(c18845M8235);
                    C0863.m55628(c3422, this.f13378);
                    break;
                case -452564636:
                case -270525999:
                    c18845M8235 = ((AbstractC4093) this.f13378).m8235();
                    if (C0949.f81897 < 0) {
                        iM55979 = (C0873.m55680("ᩴۡ") + i9) * (-83);
                        i2 = ((iM55979 ^ i8) * (-14507)) ^ 1999544619;
                        i3 = -442294007;
                        i11 = iM55979 ^ i3;
                        i10 = i2;
                    } else {
                        i12 = i12;
                        i = i15;
                        iM559710 = C0873.m55680("ۗ֫") ^ i8;
                        i4 = ((iM559710 ^ i9) * 4043) ^ (-1923676590);
                        i5 = 1321829123;
                        int i1114 = iM559710 ^ i5;
                        i15 = i;
                        int i1115 = i12;
                        i11 = i1114;
                        i10 = i4;
                        i12 = i1115;
                    }
                    break;
                case -424404756:
                case 1211412732:
                    objM39881 = c18845M8236.m42918().m39880();
                    if (!C0927.f81875) {
                        iM55979 = (C0946.m55979("ۢᩳ") + i8) * 65;
                        i2 = ((iM55979 ^ i9) * 11675) ^ (-1096348703);
                        i3 = -2026769203;
                        i11 = iM55979 ^ i3;
                        i10 = i2;
                    } else {
                        i12 = i12;
                        i = i15;
                        iM559710 = C0873.m55680("ۗ֫") ^ i8;
                        i4 = ((iM559710 ^ i9) * 4043) ^ (-1923676590);
                        i5 = 1321829123;
                        int i1116 = iM559710 ^ i5;
                        i15 = i;
                        int i1117 = i12;
                        i11 = i1116;
                        i10 = i4;
                        i12 = i1117;
                    }
                    break;
                case 187232508:
                case 1821824123:
                    C1964.m56597();
                    if (C1194.f82045 != 0) {
                        i12 = i12;
                        i = i15;
                        iM559710 = C0873.m55680("ۗ֫") ^ i8;
                        i4 = ((iM559710 ^ i9) * 4043) ^ (-1923676590);
                        i5 = 1321829123;
                        int i1118 = iM559710 ^ i5;
                        i15 = i;
                        int i1119 = i12;
                        i11 = i1118;
                        i10 = i4;
                        i12 = i1119;
                    } else {
                        iM55979 = (i9 - C0873.m55680("ᩳ۠")) * (-93);
                        i2 = ((iM55979 ^ i8) * (-30969)) ^ 1483985517;
                        i3 = -4947065;
                        i11 = iM55979 ^ i3;
                        i10 = i2;
                    }
                    break;
                case 474779932:
                case 1639735116:
                    if (!C6712.m15315(c16769, iM15308, i16)) {
                        iM55979 = (C0873.m55680("ۗ᩶") + i8) * (-119);
                        i2 = ((iM55979 ^ i9) * (-31279)) ^ 2078316417;
                        i3 = -1601244935;
                        i11 = iM55979 ^ i3;
                        i10 = i2;
                    } else {
                        i = i15;
                        iM559710 = (C0946.m55979("᩶ۡ") ^ i9) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM559710 ^ i8) * 31181) ^ 737913897;
                        i5 = -1586362429;
                        int i11110 = iM559710 ^ i5;
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
                        iM559710 = (C0946.m55979("֨ܰ") ^ i8) * (-95);
                        i12 = i12;
                        i4 = ((iM559710 ^ i9) * 28997) ^ 520334128;
                        i5 = 1856670420;
                    } else {
                        iM559710 = (C0946.m55979("᩶ۡ") ^ i9) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM559710 ^ i8) * 31181) ^ 737913897;
                        i5 = -1586362429;
                    }
                    int i11112 = iM559710 ^ i5;
                    i15 = i;
                    int i11113 = i12;
                    i11 = i11112;
                    i10 = i4;
                    i12 = i11113;
                    break;
                case 746345092:
                case 1732174124:
                    c18845M8236 = ((AbstractC4093) this.f13378).m8235();
                    if (RunnableC0871.m55672() < 0) {
                        iM55979 = C0946.m55979("֫ۛ") ^ i9;
                        i2 = ((iM55979 ^ i8) * (-23735)) ^ 2023349079;
                        i3 = 1808575253;
                        i11 = iM55979 ^ i3;
                        i10 = i2;
                    } else {
                        i12 = i12;
                        i = i15;
                        iM559710 = C0873.m55680("ۗ֫") ^ i8;
                        i4 = ((iM559710 ^ i9) * 4043) ^ (-1923676590);
                        i5 = 1321829123;
                        int i11114 = iM559710 ^ i5;
                        i15 = i;
                        int i11115 = i12;
                        i11 = i11114;
                        i10 = i4;
                        i12 = i11115;
                    }
                    break;
                case 941257905:
                case 1499674442:
                    ((AbstractCollection) objM39881).remove(c18845M8236);
                    C0845.m55578(c3422, this.f13378);
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final char[] m12241() {
        return this.f13376;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 43281. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m12240(p067l.C16769 r52, int r53, int r54) {
        /*
            Method dump skipped, instruction units count: 4328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C5546.m12240(l.ܶۢᩳ, int, int):boolean");
    }
}
