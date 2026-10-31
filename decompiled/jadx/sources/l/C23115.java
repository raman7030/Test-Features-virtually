package l;

import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.DataOutputStream;
import java.io.IOException;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩺ܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 970R */
/* JADX INFO: loaded from: classes.dex */
public final class C23115 implements InterfaceC22410 {

    /* JADX INFO: renamed from: ۧܰۚ, reason: not valid java name and contains not printable characters */
    private static final short[] f74352 = {2013, -14427, -14462, -14438, -14451, -14464, -14459, -14456, -14388, -14436, -14451, -14440, -14440, -14455, -14434, -14462, -14388, -14436, -14451, -14440, -14449, -14460, -14388, -14464, -14451, -14443, -14455, -14434, 8422, 27696, 27672, 27653, 27649, 27660, 27733, 27667, 27676, 27673, 27649, 27664, 27655, 27664, 27665, 27733, 27653, 27668, 27649, 27649, 27664, 27655, 27675, 27733, 27653, 27668, 27649, 27670, 27677, 27733, 27673, 27668, 27660, 27664, 27655};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f74353;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f74354;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12532 f74355;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC11164 f74356;

    /* JADX WARN: Code duplicated, block: B:44:0x015a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0204  */
    /* JADX WARN: Code duplicated, block: B:60:0x023a A[PHI: r1 r2 r4
      0x023a: PHI (r1v2 int) = (r1v1 int), (r1v3 int) binds: [B:59:0x0238, B:27:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x023a: PHI (r2v2 long) = (r2v1 long), (r2v3 long) binds: [B:59:0x0238, B:27:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x023a: PHI (r4v2 long) = (r4v1 long), (r4v3 long) binds: [B:59:0x0238, B:27:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m51302(C23115 c23115, int i, int i2, long[] jArr, int i3, int i4) {
        int iM2566;
        int i5;
        int i6;
        int i7 = i4;
        int iM1484 = 0;
        long j = 0;
        long j2 = 0;
        long jM10482 = 0;
        int i8 = -296343072;
        int i9 = C3537.f11231;
        int i10 = C3911.f12484;
        int iM6981 = C2105.m6981("᩵ۤ") ^ i9;
        int i11 = ((iM6981 ^ i10) * 19885) ^ (-905773025);
        int i12 = iM6981 ^ (-754642480);
        while (true) {
            i8 = ((((i8 ^ i10) * 31651) >> 31) & i11) ^ i12;
            switch (i8) {
                case -2105303705:
                case -816834805:
                    if (C4075.m12263() > 0) {
                        iM2566 = C0630.m2566("ܺۤ") ^ i10;
                        i5 = ((iM2566 ^ i9) * 30899) ^ (-2077390906);
                        i6 = -454321915;
                        i12 = iM2566 ^ i6;
                        i11 = i5;
                        i7 = i4;
                    }
                    iM2566 = (C0630.m2566("֫ۜ") ^ i9) * q.h;
                    i5 = ((iM2566 ^ i10) * (-16397)) ^ (-2135766476);
                    i6 = 1991354918;
                    i12 = iM2566 ^ i6;
                    i11 = i5;
                    i7 = i4;
                    break;
                case -2026996021:
                case -793662488:
                    if (C1294.m4372() <= 0) {
                        iM2566 = (C0630.m2566("֫ۜ") ^ i9) * q.h;
                        i5 = ((iM2566 ^ i10) * (-16397)) ^ (-2135766476);
                        i6 = 1991354918;
                    } else {
                        iM2566 = C0630.m2566("᩹ۢ") ^ i10;
                        i5 = ((iM2566 ^ i9) * (-10623)) ^ (-1381226365);
                        i6 = -1590323187;
                    }
                    i12 = iM2566 ^ i6;
                    i11 = i5;
                    i7 = i4;
                    break;
                case -1909743673:
                case 241002484:
                    C1005.m3501();
                    if (C3683.f11629 >= 0) {
                        iM2566 = (i10 - C0630.m2566("ۘۘ")) * (-9);
                        i5 = ((iM2566 ^ i9) * (-4969)) ^ (-1272972621);
                        i6 = 1192031448;
                        i12 = iM2566 ^ i6;
                        i11 = i5;
                        i7 = i4;
                    }
                    iM2566 = (C0630.m2566("֫ۜ") ^ i9) * q.h;
                    i5 = ((iM2566 ^ i10) * (-16397)) ^ (-2135766476);
                    i6 = 1991354918;
                    i12 = iM2566 ^ i6;
                    i11 = i5;
                    i7 = i4;
                    break;
                case -1783020295:
                case 1039516708:
                    iM1484 = C0237.m1484(i, i7);
                    j = i2;
                    j2 = i7;
                    if (C0630.f2410 <= 0) {
                        iM2566 = C2105.m6981("ۤۤ") ^ i9;
                        i5 = ((iM2566 ^ i10) * (-23521)) ^ 1318603629;
                        i6 = 1396329901;
                        i12 = iM2566 ^ i6;
                        i11 = i5;
                    } else {
                        int iM6982 = (C2105.m6981("ᩳᩳ") + i10) * (-37);
                        i11 = ((iM6982 ^ i9) * (-5323)) ^ 644402201;
                        i12 = iM6982 ^ (-182928162);
                    }
                    i7 = i4;
                    break;
                case -1628122265:
                case -1526224741:
                    C21923.m49329();
                    iM2566 = (C0630.m2566("֫ۜ") ^ i9) * q.h;
                    i5 = ((iM2566 ^ i10) * (-16397)) ^ (-2135766476);
                    i6 = 1991354918;
                    i12 = iM2566 ^ i6;
                    i11 = i5;
                    i7 = i4;
                    break;
                case -1400025660:
                case 1205175697:
                    if (C3019.f9544 >= 0) {
                        iM2566 = C0630.m2566("֨۬") ^ i9;
                        i5 = ((iM2566 ^ i10) * (-19805)) ^ 592958210;
                        i6 = 1603413449;
                    } else {
                        iM2566 = (C0630.m2566("ۗۡ") ^ i9) * (-81);
                        i5 = ((iM2566 ^ i10) * 8875) ^ (-1360676569);
                        i6 = -2098579684;
                    }
                    i12 = iM2566 ^ i6;
                    i11 = i5;
                    i7 = i4;
                    break;
                case -1178607699:
                case 1633983847:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = C0630.m2566("ܺۤ") ^ i10;
                        i5 = ((iM2566 ^ i9) * 30899) ^ (-2077390906);
                        i6 = -454321915;
                    } else {
                        iM2566 = (C0630.m2566("۟ۗ") ^ i9) * (-57);
                        i5 = ((iM2566 ^ i10) * 23651) ^ (-1767178259);
                        i6 = 859162631;
                    }
                    i12 = iM2566 ^ i6;
                    i11 = i5;
                    i7 = i4;
                    break;
                case -1034672973:
                case 34101754:
                    C3746.m11369();
                    if (!C2167.m7155()) {
                        iM2566 = C0630.m2566("֨۬") ^ i9;
                        i5 = ((iM2566 ^ i10) * (-19805)) ^ 592958210;
                        i6 = 1603413449;
                        i12 = iM2566 ^ i6;
                        i11 = i5;
                        i7 = i4;
                    }
                    iM2566 = (C0630.m2566("֫ۜ") ^ i9) * q.h;
                    i5 = ((iM2566 ^ i10) * (-16397)) ^ (-2135766476);
                    i6 = 1991354918;
                    i12 = iM2566 ^ i6;
                    i11 = i5;
                    i7 = i4;
                    break;
                case -927670639:
                case 1437177801:
                    jM10482 = C3432.m10482(j, ((long) c23115.f74355.m30740()) + j2);
                    if (C2167.f7158 >= 0) {
                        iM2566 = (C0630.m2566("֫ۜ") ^ i9) * q.h;
                        i5 = ((iM2566 ^ i10) * (-16397)) ^ (-2135766476);
                        i6 = 1991354918;
                        i12 = iM2566 ^ i6;
                        i11 = i5;
                        i7 = i4;
                    } else {
                        int iM6983 = C2105.m6981("֫ᩴ") ^ i9;
                        i12 = iM6983 ^ 639004124;
                        i11 = ((iM6983 ^ i10) * 4113) ^ 1526420038;
                    }
                    break;
                case -811726212:
                case 651763836:
                    if (C0630.m2564()) {
                        iM2566 = C0630.m2566("ܺۤ") ^ i10;
                        i5 = ((iM2566 ^ i9) * 30899) ^ (-2077390906);
                        i6 = -454321915;
                    } else {
                        iM2566 = (C2105.m6981("ۘ۫") ^ i10) * (-79);
                        i5 = ((iM2566 ^ i9) * (-4663)) ^ 629795308;
                        i6 = -1435189824;
                    }
                    i12 = iM2566 ^ i6;
                    i11 = i5;
                    i7 = i4;
                    break;
                case -393218847:
                case 2002378614:
                    if (C3019.f9544 >= 0) {
                        iM2566 = C0630.m2566("֨۬") ^ i9;
                        i5 = ((iM2566 ^ i10) * (-19805)) ^ 592958210;
                        i6 = 1603413449;
                    } else {
                        iM2566 = (C2105.m6981("ۡ᩷") + i10) * (-63);
                        i5 = ((iM2566 ^ i9) * (-26543)) ^ 365988684;
                        i6 = 271279919;
                    }
                    i12 = iM2566 ^ i6;
                    i11 = i5;
                    i7 = i4;
                    break;
                case -163267025:
                case -139482177:
                    C17513.m40910(iM1484 - i3, ((int) jM10482) - i3, jArr);
                    break;
                case -103160422:
                case 46081685:
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = C2105.m6981("ۤۤ") ^ i9;
                        i5 = ((iM2566 ^ i10) * (-23521)) ^ 1318603629;
                        i6 = 1396329901;
                    } else {
                        iM2566 = (C0630.m2566("᩷ۡ") + i10) * (-5);
                        i5 = ((iM2566 ^ i9) * 1513) ^ 92598221;
                        i6 = -1002453368;
                    }
                    i12 = iM2566 ^ i6;
                    i11 = i5;
                    i7 = i4;
                    break;
                case 114391285:
                case 2125121657:
                    if (C2520.f8000 >= 0) {
                        iM2566 = (i10 - C0630.m2566("ۘۘ")) * (-9);
                        i5 = ((iM2566 ^ i9) * (-4969)) ^ (-1272972621);
                        i6 = 1192031448;
                    } else {
                        iM2566 = C2105.m6981("ۨ۟") ^ i9;
                        i5 = ((iM2566 ^ i10) * (-24245)) ^ 562183707;
                        i6 = 17333077;
                    }
                    i12 = iM2566 ^ i6;
                    i11 = i5;
                    i7 = i4;
                    break;
                case 219418822:
                case 365975270:
                    if (C0050.f910 >= 0) {
                        iM2566 = C0630.m2566("֨۬") ^ i9;
                        i5 = ((iM2566 ^ i10) * (-19805)) ^ 592958210;
                        i6 = 1603413449;
                    } else {
                        iM2566 = C0630.m2566("֫۟") ^ i9;
                        i5 = ((iM2566 ^ i10) * 9463) ^ (-1179649974);
                        i6 = -1495243352;
                    }
                    i12 = iM2566 ^ i6;
                    i11 = i5;
                    i7 = i4;
                    break;
                default:
                    C1916.m6308();
                    break;
            }
            return;
        }
    }

    @Override // l.InterfaceC22410
    /* JADX INFO: renamed from: ܿ */
    public final long mo32108() {
        AbstractC11164 abstractC11164 = null;
        long jMo21897 = 0;
        int i = -706442985;
        int i2 = C0483.f2088;
        int i3 = C2167.f7158;
        int iM2566 = (C0630.m2566("ۢۖ") + i3) * 83;
        int i4 = ((iM2566 ^ i2) * 26385) ^ 721256467;
        int i5 = -418750460;
        while (true) {
            i = ((((i ^ i2) * 25135) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -1872972502:
                case -852105788:
                    abstractC11164 = this.f74356;
                    if (C0050.m940() <= 0) {
                        iM2566 = C0630.m2566("ܳ᩹") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-28117)) ^ 1139454937;
                        i5 = -209888049;
                    } else {
                        iM2566 = C0630.m2566("ۗۢ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-32129)) ^ 2042066823;
                        i5 = 714854169;
                    }
                    break;
                case -1745347321:
                case 1389779317:
                    return jMo21897 + 16;
                case -1448396905:
                case 707471695:
                    C0714.m2805();
                    iM2566 = (C0630.m2566("ۡܿ") ^ i2) * (-97);
                    i4 = ((iM2566 ^ i3) * 6363) ^ (-1586834333);
                    i5 = -1871165152;
                    break;
                case -1433159076:
                case -220134766:
                    if (C0237.f1507 != 0) {
                        iM2566 = C2105.m6981("ۡ᩶") ^ i3;
                        i4 = ((iM2566 ^ i2) * 6485) ^ (-414159961);
                        i5 = -50907979;
                    } else {
                        iM2566 = (C0630.m2566("֫ۧ") + i3) * 25;
                        i4 = ((iM2566 ^ i2) * (-6931)) ^ (-1986833896);
                        i5 = 684117124;
                    }
                    break;
                case -1321789660:
                case 561676518:
                    if (C0964.m3413()) {
                        iM2566 = C0630.m2566("֡᩻") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-11693)) ^ 593724188;
                        i5 = 639658731;
                    } else {
                        iM2566 = C2105.m6981("ۧ֨") ^ i2;
                        i4 = ((iM2566 ^ i3) * 417) ^ (-753354765);
                        i5 = -484490076;
                    }
                    break;
                case -1281613950:
                case 1804860523:
                    if (C1916.f6442) {
                        iM2566 = (C2105.m6981("֫ۢ") ^ i3) * (-123);
                        i4 = ((iM2566 ^ i2) * 16565) ^ (-1261443621);
                        i5 = 712937520;
                    } else {
                        iM2566 = (C0630.m2566("ۡܿ") ^ i2) * (-97);
                        i4 = ((iM2566 ^ i3) * 6363) ^ (-1586834333);
                        i5 = -1871165152;
                    }
                    break;
                case -1175495483:
                case -333072656:
                    jMo21897 = abstractC11164.mo21897();
                    if (C3663.f11553) {
                        iM2566 = C0630.m2566("۟۟") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-25185)) ^ 661640822;
                        i5 = -821761161;
                    } else {
                        iM2566 = (i2 - C2105.m6981("᩺ۡ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2566 ^ i3) * 30593) ^ 438625000;
                        i5 = -688089399;
                    }
                    break;
                case -1099600857:
                case -470757501:
                    C0422.m1963();
                    return 0L;
                case -1096036856:
                case -662693260:
                    if (C4263.f13799 <= 0) {
                        iM2566 = C2105.m6981("ۡ᩶") ^ i3;
                        i4 = ((iM2566 ^ i2) * 6485) ^ (-414159961);
                        i5 = -50907979;
                    } else {
                        iM2566 = (C0630.m2566("᩹۫") ^ i3) * 101;
                        i4 = ((iM2566 ^ i2) * 8325) ^ (-1206114207);
                        i5 = -1616119070;
                    }
                    break;
                case -779159693:
                case 289622134:
                    if (C2105.f7037 != 0) {
                        iM2566 = C2105.m6981("ۧ֨") ^ i2;
                        i4 = ((iM2566 ^ i3) * 417) ^ (-753354765);
                        i5 = -484490076;
                    } else {
                        iM2566 = (C0630.m2566("ۤۘ") + i2) * 79;
                        i4 = ((iM2566 ^ i3) * (-26595)) ^ (-1399835521);
                        i5 = 1652579505;
                    }
                    break;
                case -722371773:
                case -117181422:
                    if (C0964.f3626 != 0) {
                        iM2566 = C2105.m6981("ۧ֨") ^ i2;
                        i4 = ((iM2566 ^ i3) * 417) ^ (-753354765);
                        i5 = -484490076;
                    } else {
                        iM2566 = (C0630.m2566("ۛᩴ") + i3) * (-33);
                        i4 = ((iM2566 ^ i2) * (-21301)) ^ (-1889512065);
                        i5 = -1876238998;
                    }
                    break;
                case -205422436:
                case 374521009:
                    C2272.m7503();
                    if (C3911.f12484 >= 0) {
                        iM2566 = C2105.m6981("ۡ᩶") ^ i3;
                        i4 = ((iM2566 ^ i2) * 6485) ^ (-414159961);
                        i5 = -50907979;
                    } else {
                        iM2566 = C0630.m2566("ܳ᩹") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-28117)) ^ 1139454937;
                        i5 = -209888049;
                    }
                    break;
                case -172473359:
                case 296302148:
                    if (C3746.f11829 <= 0) {
                        iM2566 = C0630.m2566("۟۟") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-25185)) ^ 661640822;
                        i5 = -821761161;
                    } else {
                        iM2566 = C0630.m2566("ۗ᩻") ^ i3;
                        i4 = ((iM2566 ^ i2) * 16535) ^ (-1470261575);
                        i5 = 646599756;
                    }
                    break;
                case -2345234:
                case 1271655072:
                    if (C22628.f73083 <= 0) {
                        iM2566 = C2105.m6981("ۧ֨") ^ i2;
                        i4 = ((iM2566 ^ i3) * 417) ^ (-753354765);
                        i5 = -484490076;
                    } else {
                        iM2566 = (C0630.m2566("ۛ᩶") ^ i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM2566 ^ i3) * (-21941)) ^ 438120020;
                        i5 = -1324397254;
                    }
                    break;
                case 631330598:
                case 1440015441:
                    if (C1294.f4556 >= 0) {
                        iM2566 = C2105.m6981("ۧ֨") ^ i2;
                        i4 = ((iM2566 ^ i3) * 417) ^ (-753354765);
                        i5 = -484490076;
                    } else {
                        iM2566 = (C0630.m2566("ۡܿ") ^ i2) * (-97);
                        i4 = ((iM2566 ^ i3) * 6363) ^ (-1586834333);
                        i5 = -1871165152;
                    }
                    break;
                default:
                    C3663.m11168();
                    if (C1773.f6144 <= 0) {
                        iM2566 = C0630.m2566("ܳ᩹") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-28117)) ^ 1139454937;
                        i5 = -209888049;
                    } else {
                        iM2566 = (C0630.m2566("ۡܿ") ^ i2) * (-97);
                        i4 = ((iM2566 ^ i3) * 6363) ^ (-1586834333);
                        i5 = -1871165152;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x02c1 A[PHI: r20
      0x02c1: PHI (r20v31 int) = (r20v15 int), (r20v30 int), (r20v35 int) binds: [B:72:0x02a6, B:14:0x0061, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x02f7 A[PHI: r20
      0x02f7: PHI (r20v13 int) = (r20v11 int), (r20v14 int) binds: [B:82:0x0318, B:78:0x02f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x0350 A[PHI: r20
      0x0350: PHI (r20v18 int) = (r20v10 int), (r20v16 int), (r20v19 int) binds: [B:87:0x034e, B:68:0x0284, B:60:0x0242] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:92:0x0384 A[PHI: r20
      0x0384: PHI (r20v28 int) = (r20v9 int), (r20v17 int), (r20v29 int) binds: [B:91:0x0382, B:64:0x0264, B:18:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0086, code lost:
    
        if (l.C11340.m28031() == false) goto L18;
     */
    @Override // l.InterfaceC22410
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo32102(final int i, final byte[] bArr, int i2, final int i3) {
        int iM2566;
        int i4;
        int i5;
        int i6;
        int iM6981;
        int i7;
        int i8;
        int i9;
        int iM2567;
        int i10;
        int i11;
        int i12;
        C12532 c12532 = null;
        int i13 = 0;
        int i14 = -1362475929;
        int i15 = RunnableC0588.f2309;
        int i16 = C11340.f33930;
        int iM2568 = C0630.m2566("ۨۚ") ^ i16;
        int i17 = ((iM2568 ^ i15) * 18259) ^ (-791686879);
        int i18 = iM2568 ^ (-1561616201);
        AbstractC11164 abstractC11164 = null;
        C16807 c16807 = null;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int iM30740 = 0;
        int i23 = 0;
        int i24 = 0;
        long jM51303 = 0;
        int iM1484 = 0;
        int iM7501 = 0;
        while (true) {
            i14 = i18 ^ (i17 & (((i14 ^ i15) * 16795) >> 31));
            switch (i14) {
                case -2124209525:
                case -641985493:
                    i6 = i19;
                    if (C11340.m28031()) {
                        iM6981 = (i16 - C2105.m6981("ܽܿ")) * 101;
                        i7 = ((iM6981 ^ i15) * 12821) ^ 1416680793;
                        i8 = 1333494103;
                    } else {
                        iM6981 = C0630.m2566("᩷᩸") ^ i16;
                        i7 = ((iM6981 ^ i15) * (-11069)) ^ (-1428250581);
                        i8 = -125164538;
                    }
                    i12 = i6;
                    i18 = iM6981 ^ i8;
                    i17 = i7;
                    i19 = i12;
                    break;
                case -2038075688:
                case 528746275:
                    i6 = i19;
                    c12532 = this.f74355;
                    i24 = 0;
                    i13 = 1;
                    if (c12532.m30740() == 1) {
                        iM2567 = (i16 - C2105.m6981("᩶ܳ")) * 87;
                        i10 = ((iM2567 ^ i15) * (-2615)) ^ (-1936918438);
                        i11 = 442033814;
                    } else {
                        iM2567 = (i15 - C0630.m2566("ܶ֡")) * 67;
                        i10 = ((iM2567 ^ i16) * (-17853)) ^ 531252868;
                        i11 = 1346790188;
                    }
                    i9 = iM2567 ^ i11;
                    i17 = i10;
                    i12 = i6;
                    i18 = i9;
                    i19 = i12;
                    break;
                case -1883507370:
                case -125010609:
                    i6 = i19;
                    iM1484 = C0237.m1484(i, this.f74354);
                    iM7501 = C2272.m7501(i2, this.f74353);
                    if (iM1484 < iM7501) {
                        iM6981 = C2105.m6981("۬᩺") ^ i16;
                        i7 = ((iM6981 ^ i15) * 20067) ^ 1267827788;
                        i8 = -877735663;
                        i12 = i6;
                        i18 = iM6981 ^ i8;
                        i17 = i7;
                        i19 = i12;
                    } else {
                        int iM6982 = (i16 - C2105.m6981("۟᩹")) * 67;
                        i17 = ((iM6982 ^ i15) * (-29713)) ^ 2105751339;
                        i9 = iM6982 ^ (-1722337537);
                        i12 = i6;
                        i18 = i9;
                        i19 = i12;
                    }
                    break;
                case -1812927194:
                case 748899803:
                    C21923.m49329();
                    C4263.m12819();
                    i6 = i19;
                    iM6981 = C0630.m2566("᩹ܳ") ^ i15;
                    i7 = ((iM6981 ^ i16) * (-21359)) ^ 518792215;
                    i8 = -1052020775;
                    i12 = i6;
                    i18 = iM6981 ^ i8;
                    i17 = i7;
                    i19 = i12;
                    break;
                case -1795827669:
                case 1992383353:
                    i6 = i19;
                    if (C4075.f12947 >= 0) {
                        iM6981 = C0630.m2566("᩹ܳ") ^ i15;
                        i7 = ((iM6981 ^ i16) * (-21359)) ^ 518792215;
                        i8 = -1052020775;
                    } else {
                        iM6981 = C2105.m6981("᩻ۢ") ^ i16;
                        i7 = ((iM6981 ^ i15) * 1665) ^ (-1271102623);
                        i8 = 1063103314;
                    }
                    i12 = i6;
                    i18 = iM6981 ^ i8;
                    i17 = i7;
                    i19 = i12;
                    break;
                case -1770822528:
                case 474658676:
                    i21 = i23 + iM30740;
                    iM2566 = (C0630.m2566("֨۬") ^ i16) * 77;
                    i4 = ((iM2566 ^ i15) * (-23353)) ^ 18752624;
                    i5 = 564385547;
                    i18 = iM2566 ^ i5;
                    i17 = i4;
                    break;
                case -1715229737:
                case 983658340:
                    if (C3019.f9544 >= 0) {
                        iM2566 = (C2105.m6981("ۢۜ") ^ i15) * 69;
                        i4 = ((iM2566 ^ i16) * (-26311)) ^ 1889556872;
                        i5 = -1839706776;
                        i18 = iM2566 ^ i5;
                        i17 = i4;
                    } else {
                        i6 = i19;
                        iM6981 = C0630.m2566("᩷᩸") ^ i16;
                        i7 = ((iM6981 ^ i15) * (-11069)) ^ (-1428250581);
                        i8 = -125164538;
                        i12 = i6;
                        i18 = iM6981 ^ i8;
                        i17 = i7;
                        i19 = i12;
                    }
                    break;
                case -1697591774:
                case -244443629:
                    C17513.m40911(i21, c12532.f37652, (i3 + i19) - i, bArr, i20 - i19);
                    break;
                case -1690206989:
                case 599340198:
                    i22 = i19 - c16807.f51593;
                    iM30740 = c12532.m30740();
                    i23 = i22 % iM30740;
                    if (i23 == 0) {
                        i21 = i24;
                        iM2566 = (C0630.m2566("֨۬") ^ i16) * 77;
                        i4 = ((iM2566 ^ i15) * (-23353)) ^ 18752624;
                        i5 = 564385547;
                    } else {
                        iM2566 = (i15 - C0630.m2566("ۜܳ")) * 119;
                        i4 = ((iM2566 ^ i16) * (-29391)) ^ (-83930166);
                        i5 = 1218003494;
                    }
                    i18 = iM2566 ^ i5;
                    i17 = i4;
                    break;
                case -1675927857:
                case 1902156831:
                    i6 = i19;
                    if (C2105.f7037 != 0) {
                        iM6981 = C0630.m2566("᩹ܳ") ^ i15;
                        i7 = ((iM6981 ^ i16) * (-21359)) ^ 518792215;
                        i8 = -1052020775;
                    } else {
                        iM6981 = C0630.m2566("ܳܽ") ^ i16;
                        i7 = ((iM6981 ^ i15) * 32125) ^ 623166200;
                        i8 = -654795887;
                    }
                    i12 = i6;
                    i18 = iM6981 ^ i8;
                    i17 = i7;
                    i19 = i12;
                    break;
                case -1484699678:
                case 1488169900:
                    C4159.m12565();
                    C2520.m8026();
                    break;
                case -1094108528:
                case -618337458:
                    if ((((i22 ^ iM30740) >> 31) | i13) > 0) {
                        i21 = i23;
                        iM2566 = (C0630.m2566("֨۬") ^ i16) * 77;
                        i4 = ((iM2566 ^ i15) * (-23353)) ^ 18752624;
                        i5 = 564385547;
                    } else {
                        iM2566 = (C2105.m6981("ܰۨ") ^ i16) * (-73);
                        i4 = ((iM2566 ^ i15) * 4337) ^ (-2048079817);
                        i5 = 1669611304;
                    }
                    i18 = iM2566 ^ i5;
                    i17 = i4;
                    break;
                case -888240588:
                case 485594016:
                    jM51303 = m51303(iM1484, iM7501);
                    abstractC11164 = this.f74356;
                    if (jM51303 != -1) {
                        int iM2569 = C0630.m2566("ۨۛ") ^ i16;
                        i17 = ((iM2569 ^ i15) * 3477) ^ (-2047108066);
                        i19 = i19;
                        i18 = iM2569 ^ (-88705771);
                    } else {
                        i6 = i19;
                        iM2567 = C2105.m6981("۠᩻") ^ i15;
                        i10 = ((iM2567 ^ i16) * (-8487)) ^ 633771657;
                        i11 = -1130155034;
                        i9 = iM2567 ^ i11;
                        i17 = i10;
                        i12 = i6;
                        i18 = i9;
                        i19 = i12;
                    }
                    break;
                case -344672343:
                case 2010165660:
                    i6 = i19;
                    if (C0382.f1805) {
                        iM6981 = C2105.m6981("֫֨") ^ i15;
                        i7 = ((iM6981 ^ i16) * 2801) ^ 870470990;
                        i8 = -606135734;
                    } else {
                        iM6981 = (C0630.m2566("۫۫") + i15) * (-91);
                        i7 = ((iM6981 ^ i16) * (-19689)) ^ (-1961649700);
                        i8 = 396812604;
                    }
                    i12 = i6;
                    i18 = iM6981 ^ i8;
                    i17 = i7;
                    i19 = i12;
                    break;
                case -79849835:
                case 2025068861:
                    i6 = i19;
                    if (C5695.f17556 >= 0) {
                        iM6981 = (C0630.m2566("۫۫") + i15) * (-91);
                        i7 = ((iM6981 ^ i16) * (-19689)) ^ (-1961649700);
                        i8 = 396812604;
                    } else {
                        iM6981 = C0630.m2566("۠ۘ") ^ i15;
                        i7 = ((iM6981 ^ i16) * 4009) ^ 1934967923;
                        i8 = 98597528;
                    }
                    i12 = i6;
                    i18 = iM6981 ^ i8;
                    i17 = i7;
                    i19 = i12;
                    break;
                case -70237596:
                case 317250113:
                    C2105.m6982();
                    break;
                case 22905085:
                case 616526408:
                    i6 = i19;
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        i19 = i6;
                        iM6981 = C2105.m6981("֫᩵") ^ i16;
                        i6 = i19;
                        i7 = ((iM6981 ^ i15) * (-2737)) ^ (-1529605980);
                        i8 = -292846990;
                    } else {
                        iM6981 = (i15 - C2105.m6981("ۙᩴ")) * (-99);
                        i7 = ((iM6981 ^ i16) * 2887) ^ 1557325096;
                        i8 = -1727687284;
                    }
                    i12 = i6;
                    i18 = iM6981 ^ i8;
                    i17 = i7;
                    i19 = i12;
                    break;
                case 28602136:
                case 1109676216:
                    i6 = i19;
                    if (C4117.f13076 <= 0) {
                        i19 = i6;
                        iM6981 = C2105.m6981("֫᩵") ^ i16;
                        i6 = i19;
                        i7 = ((iM6981 ^ i15) * (-2737)) ^ (-1529605980);
                        i8 = -292846990;
                    } else {
                        iM6981 = C2105.m6981("ۚ᩶") ^ i16;
                        i7 = ((iM6981 ^ i15) * 21601) ^ 133533018;
                        i8 = -713602787;
                    }
                    i12 = i6;
                    i18 = iM6981 ^ i8;
                    i17 = i7;
                    i19 = i12;
                    break;
                case 52284586:
                case 215112391:
                    i6 = i19;
                    if (C0422.m1963()) {
                        iM6981 = (C0630.m2566("ۨۖ") + i15) * 9;
                        i7 = ((iM6981 ^ i16) * 22739) ^ (-1550890398);
                        i8 = -1854948150;
                    } else {
                        iM6981 = (C0630.m2566("۫۫") + i15) * (-91);
                        i7 = ((iM6981 ^ i16) * (-19689)) ^ (-1961649700);
                        i8 = 396812604;
                    }
                    i12 = i6;
                    i18 = iM6981 ^ i8;
                    i17 = i7;
                    i19 = i12;
                    break;
                case 56818559:
                case 1282385363:
                    this.f74356.mo21893(bArr, iM1484, iM7501, c12532.f37652[i24], (i3 + iM1484) - i);
                    break;
                case 530489657:
                case 1951066901:
                    break;
                case 626533330:
                case 764813459:
                    int iM30741 = c12532.m30740();
                    final int i25 = iM1484;
                    final int i26 = iM7501;
                    abstractC11164.m27689(iM1484, iM7501, iM30741, new InterfaceC21705() { // from class: l.ۛܽܳ
                        @Override // l.InterfaceC21705
                        /* JADX INFO: renamed from: ֫ */
                        public final void mo4084(int i27, int i28) {
                            C23115.m51300(this.f18980, i25, i26, bArr, i3, i, i28);
                        }
                    });
                    break;
                case 742811098:
                case 1421576855:
                    if (!C1005.f3721) {
                        iM6981 = C2105.m6981("֫᩵") ^ i16;
                        i6 = i19;
                        i7 = ((iM6981 ^ i15) * (-2737)) ^ (-1529605980);
                        i8 = -292846990;
                        i12 = i6;
                        i18 = iM6981 ^ i8;
                        i17 = i7;
                        i19 = i12;
                    } else {
                        iM2566 = (C2105.m6981("ۢۜ") ^ i15) * 69;
                        i4 = ((iM2566 ^ i16) * (-26311)) ^ 1889556872;
                        i5 = -1839706776;
                        i18 = iM2566 ^ i5;
                        i17 = i4;
                    }
                    break;
                case 782012122:
                case 1283946788:
                    i19 = (int) (jM51303 >>> 32);
                    i20 = (int) jM51303;
                    c16807 = (C16807) abstractC11164;
                    if (!C2126.m7040()) {
                        iM2566 = (i15 - C0630.m2566("ۨ᩹")) * 21;
                        i4 = ((iM2566 ^ i16) * (-945)) ^ 829734019;
                        i5 = -2111764016;
                        i18 = iM2566 ^ i5;
                        i17 = i4;
                    } else {
                        iM6981 = C2105.m6981("֫᩵") ^ i16;
                        i6 = i19;
                        i7 = ((iM6981 ^ i15) * (-2737)) ^ (-1529605980);
                        i8 = -292846990;
                        i12 = i6;
                        i18 = iM6981 ^ i8;
                        i17 = i7;
                        i19 = i12;
                    }
                    break;
                default:
                    i6 = i19;
                    if (C3683.f11629 >= 0) {
                        iM6981 = C0630.m2566("᩷᩸") ^ i16;
                        i7 = ((iM6981 ^ i15) * (-11069)) ^ (-1428250581);
                        i8 = -125164538;
                    } else {
                        iM6981 = (C2105.m6981("ۖ۟") + i15) * (-93);
                        i7 = ((iM6981 ^ i16) * 18245) ^ 1228606724;
                        i8 = -694634941;
                    }
                    i12 = i6;
                    i18 = iM6981 ^ i8;
                    i17 = i7;
                    i19 = i12;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0086, code lost:
    
        if (l.C1005.f3721 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0075, code lost:
    
        if (l.C1294.m4372() > 0) goto L13;
     */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private long m51303(int i, int i2) {
        int iM2566;
        int i3;
        int iM6981;
        int i4;
        int i5;
        long j;
        int iM2567;
        int i6;
        int iM2568;
        int i7;
        int i8 = i;
        C16807 c16807 = null;
        C12532 c12532 = null;
        int i9 = 0;
        int iM39542 = 0;
        int i10 = 0;
        int i11 = 0;
        long j2 = 0;
        long j3 = 0;
        int i12 = 311666403;
        int i13 = AbstractC2021.f6743;
        int i14 = C3911.f12484;
        int iM6982 = (i14 - C2105.m6981("᩺ᩴ")) * 9;
        int i15 = ((iM6982 ^ i13) * 10067) ^ (-1599015068);
        int i16 = iM6982 ^ 2096247110;
        long j4 = 0;
        int iM11932 = 0;
        AbstractC11164 abstractC11164 = null;
        int iMo21899 = 0;
        int iM10482 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        while (true) {
            i12 = i16 ^ (i15 & (((i12 ^ i13) * 17829) >> 31));
            switch (i12) {
                case -2128486923:
                case -1564668754:
                    return -1L;
                case -1891264988:
                case -906889106:
                    j = j4;
                    i9 = (int) j;
                    iM2568 = C0630.m2566("ۢ۠") ^ i14;
                    i15 = ((iM2568 ^ i13) * (-22639)) ^ (-582321114);
                    i7 = 1391715630;
                    i16 = iM2568 ^ i7;
                    j4 = j;
                    iM11932 = iM11932;
                    j10 = j10;
                    break;
                case -1882399582:
                case -819714151:
                    C4159.m12565();
                    C7106.m19120();
                    iM11932 = iM11932;
                    j10 = j10;
                    iM2566 = C0630.m2566("᩶ۖ") ^ i14;
                    i15 = ((iM2566 ^ i13) * 24441) ^ (-1888973030);
                    i3 = -398177970;
                    i16 = iM2566 ^ i3;
                    iM11932 = iM11932;
                    j10 = j10;
                    break;
                case -1681163015:
                case 496592036:
                    iM11932 = iM11932;
                    j10 = j10;
                    j4 = j6 + 1;
                    if (j4 < -2147483648L) {
                        iM2566 = C2105.m6981("ۗۙ") ^ i14;
                        i15 = ((iM2566 ^ i13) * 17803) ^ 956495876;
                        i3 = 1406121448;
                    } else {
                        iM2566 = C2105.m6981("ۨۗ") ^ i13;
                        i15 = ((iM2566 ^ i14) * 21621) ^ (-357955065);
                        i3 = -1621382398;
                    }
                    i16 = iM2566 ^ i3;
                    iM11932 = iM11932;
                    j10 = j10;
                    break;
                case -1662494619:
                case -1069182611:
                    iM11932 = iM11932;
                    j10 = j10;
                    i11 = -1;
                    if (C1005.f3721) {
                        iM2566 = (C2105.m6981("ۘۖ") ^ i14) * 91;
                        i15 = ((iM2566 ^ i13) * 4629) ^ (-917759124);
                        i3 = 1140435493;
                    } else {
                        iM2566 = C0630.m2566("᩶ۖ") ^ i14;
                        i15 = ((iM2566 ^ i13) * 24441) ^ (-1888973030);
                        i3 = -398177970;
                    }
                    i16 = iM2566 ^ i3;
                    iM11932 = iM11932;
                    j10 = j10;
                    break;
                case -1587567427:
                case 1512005314:
                    iM11932 = C3911.m11932(i8, c16807.mo21899(iM39542));
                    j10 = i2;
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = (C0630.m2566("ۖۜ") + i13) * 75;
                        i4 = ((iM6981 ^ i14) * 26751) ^ 495795432;
                        i5 = 644004580;
                    } else {
                        iM6981 = (C2105.m6981("᩺۫") ^ i13) * 91;
                        i4 = ((iM6981 ^ i14) * 26105) ^ 1208555059;
                        i5 = 236362923;
                    }
                    i16 = iM6981 ^ i5;
                    i15 = i4;
                    break;
                case -1538466026:
                case -1231788676:
                    return (((long) iM10482) & 4294967295L) | j3;
                case -1530452562:
                case 22547943:
                    if (C3019.f9544 >= 0) {
                        iM6981 = (C0630.m2566("ۖۜ") + i13) * 75;
                        i4 = ((iM6981 ^ i14) * 26751) ^ 495795432;
                        i5 = 644004580;
                        i16 = iM6981 ^ i5;
                        i15 = i4;
                    } else {
                        iM11932 = iM11932;
                        j10 = j10;
                        j = j4;
                        int iM2569 = (C0630.m2566("ۖ᩻") + i14) * (-3);
                        i15 = (-385169981) ^ ((iM2569 ^ i13) * 16221);
                        i16 = iM2569 ^ 21521771;
                        i8 = i;
                        j4 = j;
                        iM11932 = iM11932;
                        j10 = j10;
                    }
                    break;
                case -1381035392:
                case 1781833923:
                    iM11932 = iM11932;
                    j10 = j10;
                    j = j4;
                    long j12 = i8;
                    long jM30740 = c12532.m30740();
                    if (C4263.f13799 <= 0) {
                        j9 = jM30740;
                        j11 = j12;
                        int iM25610 = (C0630.m2566("ۖ᩻") + i14) * (-3);
                        i15 = (-385169981) ^ ((iM25610 ^ i13) * 16221);
                        i16 = iM25610 ^ 21521771;
                        i8 = i;
                        j4 = j;
                        iM11932 = iM11932;
                    } else {
                        int iM25611 = (i13 - C0630.m2566("֡ۛ")) * (-69);
                        i16 = iM25611 ^ 1218064800;
                        i8 = i;
                        i15 = ((iM25611 ^ i14) * 5099) ^ (-1075000338);
                        j4 = j;
                        j9 = jM30740;
                        iM11932 = iM11932;
                        j11 = j12;
                    }
                    j10 = j10;
                    break;
                case -1274011899:
                case 653156107:
                    iM11932 = iM11932;
                    j10 = j10;
                    iM39542 = c16807.m39542(i9);
                    int iM39543 = c16807.m39542(i2);
                    if (iM39542 >= iM39543) {
                        i10 = iM39543;
                        j = j4;
                        iM2567 = C0630.m2566("۬֨") ^ i14;
                        i15 = ((iM2567 ^ i13) * (-24959)) ^ (-1771706383);
                        i6 = 1740777436;
                        i16 = iM2567 ^ i6;
                        i8 = i;
                        j4 = j;
                    } else {
                        int iM25612 = (i13 - C0630.m2566("ܰ᩵")) * (-23);
                        i16 = iM25612 ^ (-1751374637);
                        i10 = iM39543;
                        i15 = ((iM25612 ^ i14) * 17125) ^ 1667258488;
                    }
                    iM11932 = iM11932;
                    j10 = j10;
                    break;
                case -1255388897:
                case 265372391:
                    j = j4;
                    i9 = Integer.MIN_VALUE;
                    iM2568 = C0630.m2566("ۢ۠") ^ i14;
                    i15 = ((iM2568 ^ i13) * (-22639)) ^ (-582321114);
                    i7 = 1391715630;
                    i16 = iM2568 ^ i7;
                    j4 = j;
                    iM11932 = iM11932;
                    j10 = j10;
                    break;
                case -1157103387:
                case 1113233799:
                    break;
                case -1069200680:
                case -332910625:
                    iM11932 = iM11932;
                    j10 = j10;
                    j = j4;
                    c16807 = (C16807) abstractC11164;
                    int i17 = c16807.f51595;
                    c12532 = this.f74355;
                    if (i17 != c12532.m30740()) {
                        iM2567 = C0630.m2566("۬֨") ^ i14;
                        i15 = ((iM2567 ^ i13) * (-24959)) ^ (-1771706383);
                        i6 = 1740777436;
                    } else {
                        iM2567 = (C0630.m2566("ۨۛ") + i13) * 47;
                        i15 = ((iM2567 ^ i14) * (-31217)) ^ 1857786994;
                        i6 = -2092152471;
                    }
                    i16 = iM2567 ^ i6;
                    i8 = i;
                    j4 = j;
                    iM11932 = iM11932;
                    j10 = j10;
                    break;
                case -810523914:
                case 973761590:
                    iM11932 = iM11932;
                    j5 = j8 + j7;
                    if (C4075.f12947 < 0) {
                        int iM6983 = (i14 - C2105.m6981("۠ۢ")) * (-97);
                        i15 = ((iM6983 ^ i13) * 24653) ^ 998465019;
                        i16 = iM6983 ^ 1742113911;
                        iM11932 = iM11932;
                    } else {
                        j10 = j10;
                        iM2566 = C0630.m2566("᩵ܰ") ^ i14;
                        i15 = ((iM2566 ^ i13) * (-14169)) ^ 353879026;
                        i3 = 1109866720;
                        i16 = iM2566 ^ i3;
                        iM11932 = iM11932;
                        j10 = j10;
                    }
                    break;
                case -479310335:
                case 1630321909:
                    iM11932 = iM11932;
                    j10 = j10;
                    j = j4;
                    if (C1047.f3863 >= 0) {
                        iM2567 = C2105.m6981("᩻᩷") ^ i13;
                        i15 = ((iM2567 ^ i14) * (-30809)) ^ (-651171587);
                        i6 = -1718753466;
                    } else {
                        iM2567 = C0630.m2566("᩻ܺ") ^ i13;
                        i15 = ((iM2567 ^ i14) * (-17511)) ^ (-1070361259);
                        i6 = -1203452580;
                    }
                    i16 = iM2567 ^ i6;
                    i8 = i;
                    j4 = j;
                    iM11932 = iM11932;
                    j10 = j10;
                    break;
                case -476618054:
                case 1834859319:
                    iM10482 = (int) C3432.m10482(j10, j5);
                    long j13 = iM11932;
                    if (!C2272.f7362) {
                        int iM25613 = C0630.m2566("᩶ۜ") ^ i13;
                        iM11932 = iM11932;
                        i16 = iM25613 ^ (-1445558747);
                        i15 = ((iM25613 ^ i14) * (-6895)) ^ 1970321801;
                        j2 = j13;
                        iM11932 = iM11932;
                    } else {
                        iM11932 = iM11932;
                        j10 = j10;
                        j2 = j13;
                        iM2566 = C0630.m2566("᩶ۖ") ^ i14;
                        i15 = ((iM2566 ^ i13) * 24441) ^ (-1888973030);
                        i3 = -398177970;
                        i16 = iM2566 ^ i3;
                        iM11932 = iM11932;
                        j10 = j10;
                    }
                    break;
                case -324926637:
                case -219706977:
                    iM11932 = iM11932;
                    j10 = j10;
                    j = j4;
                    j6 = j11 - j9;
                    if (C3537.f11231 < 0) {
                        iM2568 = (C0630.m2566("ۡۛ") + i14) * (-75);
                        i15 = ((iM2568 ^ i13) * (-18185)) ^ 1569562325;
                        i7 = 1185560735;
                        i16 = iM2568 ^ i7;
                        j4 = j;
                        iM11932 = iM11932;
                        j10 = j10;
                    }
                    int iM25614 = (C0630.m2566("ۖ᩻") + i14) * (-3);
                    i15 = (-385169981) ^ ((iM25614 ^ i13) * 16221);
                    i16 = iM25614 ^ 21521771;
                    i8 = i;
                    j4 = j;
                    iM11932 = iM11932;
                    j10 = j10;
                    break;
                case -286427456:
                case 1822134900:
                    iM11932 = iM11932;
                    j10 = j10;
                    j = j4;
                    AbstractC11164 abstractC11165 = this.f74356;
                    if (abstractC11165 instanceof C16807) {
                        int iM25615 = (i14 - C0630.m2566("᩶ۛ")) * (-59);
                        i16 = iM25615 ^ 169971816;
                        i8 = i;
                        abstractC11164 = abstractC11165;
                        i15 = ((iM25615 ^ i13) * (-18111)) ^ (-1162929676);
                    } else {
                        abstractC11164 = abstractC11165;
                        iM2567 = C0630.m2566("۬֨") ^ i14;
                        i15 = ((iM2567 ^ i13) * (-24959)) ^ (-1771706383);
                        i6 = 1740777436;
                        i16 = iM2567 ^ i6;
                        i8 = i;
                    }
                    j4 = j;
                    iM11932 = iM11932;
                    j10 = j10;
                    break;
                case -8441216:
                case 1567925945:
                    j3 = j2 << 32;
                    if (C1916.m6308() < 0) {
                        iM6981 = (C2105.m6981("᩸᩻") + i13) * 17;
                        i4 = ((iM6981 ^ i14) * 14959) ^ (-878170825);
                        i5 = 1998562202;
                        i16 = iM6981 ^ i5;
                        i15 = i4;
                    } else {
                        iM11932 = iM11932;
                        j10 = j10;
                        j = j4;
                        iM2567 = C2105.m6981("᩻᩷") ^ i13;
                        i15 = ((iM2567 ^ i14) * (-30809)) ^ (-651171587);
                        i6 = -1718753466;
                        i16 = iM2567 ^ i6;
                        i8 = i;
                        j4 = j;
                        iM11932 = iM11932;
                        j10 = j10;
                    }
                    break;
                case 245650555:
                case 2122070375:
                    AbstractC2021.m6574();
                    C3683.m11222();
                    return 0L;
                case 1115658836:
                case 2081113470:
                    iM11932 = iM11932;
                    long j14 = iMo21899;
                    j10 = j10;
                    long jM30741 = c12532.m30740();
                    if (C3245.f10203 <= 0) {
                        j7 = jM30741;
                        j8 = j14;
                        iM2566 = C0630.m2566("᩵ܰ") ^ i14;
                        i15 = ((iM2566 ^ i13) * (-14169)) ^ 353879026;
                        i3 = 1109866720;
                        i16 = iM2566 ^ i3;
                    } else {
                        int iM6984 = (i13 - C2105.m6981("᩷ܶ")) * 65;
                        i15 = ((iM6984 ^ i14) * (-26355)) ^ 1739291133;
                        i16 = iM6984 ^ 980820178;
                        j7 = jM30741;
                        j8 = j14;
                    }
                    iM11932 = iM11932;
                    j10 = j10;
                    break;
                case 1358122412:
                case 1690724882:
                    iM11932 = iM11932;
                    j10 = j10;
                    iMo21899 = c16807.mo21899(i10 + i11);
                    if (C2105.f7037 == 0) {
                        iM2566 = (i14 - C0630.m2566("ᩴ᩹")) * 47;
                        i15 = ((iM2566 ^ i13) * 17401) ^ (-375054735);
                        i3 = 521393678;
                        i16 = iM2566 ^ i3;
                        iM11932 = iM11932;
                        j10 = j10;
                    } else {
                        iM11932 = iM11932;
                        j10 = j10;
                        iM6981 = (C0630.m2566("ۖۜ") + i13) * 75;
                        i4 = ((iM6981 ^ i14) * 26751) ^ 495795432;
                        i5 = 644004580;
                        i16 = iM6981 ^ i5;
                        i15 = i4;
                    }
                    break;
                default:
                    C2167.m7155();
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x017f A[PHI: r1
      0x017f: PHI (r1v2 int) = (r1v1 int), (r1v1 int), (r1v3 int) binds: [B:44:0x017d, B:34:0x010b, B:30:0x00e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0260  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if (l.C4616.m13552() != 0) goto L14;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m51300(C23115 c23115, int i, int i2, byte[] bArr, int i3, int i4, int i5) {
        int iM2566;
        int i6;
        int i7;
        int iM11932 = 0;
        C12532 c12532 = null;
        int iM10482 = 0;
        int i8 = -353616653;
        int i9 = C4117.f13076;
        int i10 = C2958.f9394;
        int iM6981 = C2105.m6981("ܶۚ") ^ i10;
        int i11 = ((iM6981 ^ i9) * (-15059)) ^ 1872584130;
        int i12 = iM6981 ^ (-51384607);
        while (true) {
            i8 = ((((i8 ^ i9) * (-6591)) >> 31) & i11) ^ i12;
            switch (i8) {
                case -2105601340:
                case -1503036260:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = (C2105.m6981("ᩳۙ") + i9) * 69;
                        i6 = ((iM2566 ^ i10) * (-10961)) ^ (-593147976);
                        i7 = -54372415;
                    } else {
                        iM2566 = C0630.m2566("֨᩸") ^ i10;
                        i6 = ((iM2566 ^ i9) * (-32131)) ^ 1610013760;
                        i7 = 2056847083;
                    }
                    i12 = iM2566 ^ i7;
                    i11 = i6;
                    break;
                case -2093694183:
                case 85577396:
                    if (RunnableC0588.m2441() >= 0) {
                        iM2566 = (C2105.m6981("ᩳۙ") + i9) * 69;
                        i6 = ((iM2566 ^ i10) * (-10961)) ^ (-593147976);
                        i7 = -54372415;
                    } else {
                        iM2566 = C2105.m6981("۟ᩳ") ^ i10;
                        i6 = ((iM2566 ^ i9) * (-6347)) ^ 638768298;
                        i7 = -803969468;
                    }
                    i12 = iM2566 ^ i7;
                    i11 = i6;
                    break;
                case -1928808577:
                case 1500829657:
                    if (C3432.m10477() <= 0) {
                        iM2566 = C0630.m2566("ۜܽ") ^ i9;
                        i6 = ((iM2566 ^ i10) * 24905) ^ 793641651;
                        i7 = 550799051;
                    } else {
                        iM2566 = C2105.m6981("ۨ֡") ^ i10;
                        i6 = ((iM2566 ^ i9) * 18363) ^ 2005255705;
                        i7 = 77533356;
                    }
                    i12 = iM2566 ^ i7;
                    i11 = i6;
                    break;
                case -1828369528:
                case -239267454:
                    if (C3432.f10845 >= 0) {
                        iM2566 = C0630.m2566("ۜܽ") ^ i9;
                        i6 = ((iM2566 ^ i10) * 24905) ^ 793641651;
                        i7 = 550799051;
                    } else {
                        iM2566 = (C2105.m6981("ۧۜ") + i9) * (-127);
                        i6 = ((iM2566 ^ i10) * (-10173)) ^ 300941272;
                        i7 = 451682922;
                    }
                    i12 = iM2566 ^ i7;
                    i11 = i6;
                    break;
                case -1711812192:
                case -1023530702:
                    C1047.m3599();
                    if (!C2272.f7362) {
                        iM2566 = C0630.m2566("֨֨") ^ i10;
                        i6 = ((iM2566 ^ i9) * (-30035)) ^ (-1415797860);
                        i7 = -1549604443;
                        i12 = iM2566 ^ i7;
                        i11 = i6;
                    }
                    iM2566 = (C0630.m2566("֨ۧ") ^ i9) * (-115);
                    i6 = ((iM2566 ^ i10) * (-9245)) ^ (-819602279);
                    i7 = -1188272018;
                    i12 = iM2566 ^ i7;
                    i11 = i6;
                    break;
                case -1698475514:
                case -997580505:
                    C1711.m5736();
                    C2167.m7155();
                    iM2566 = C0630.m2566("ۜܽ") ^ i9;
                    i6 = ((iM2566 ^ i10) * 24905) ^ 793641651;
                    i7 = 550799051;
                    i12 = iM2566 ^ i7;
                    i11 = i6;
                    break;
                case -1320220958:
                case -1165189162:
                    C0237.m1481();
                    if (C1711.f5919) {
                        iM2566 = (C0630.m2566("ܶۛ") + i10) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i6 = ((iM2566 ^ i9) * 19031) ^ (-1822755188);
                        i7 = -264106469;
                        i12 = iM2566 ^ i7;
                        i11 = i6;
                    }
                    iM2566 = C0630.m2566("ۜܽ") ^ i9;
                    i6 = ((iM2566 ^ i10) * 24905) ^ 793641651;
                    i7 = 550799051;
                    i12 = iM2566 ^ i7;
                    i11 = i6;
                    break;
                case -1291056561:
                case -345859306:
                    if (C4117.f13076 <= 0) {
                        iM2566 = C0630.m2566("֨֨") ^ i10;
                        i6 = ((iM2566 ^ i9) * (-30035)) ^ (-1415797860);
                        i7 = -1549604443;
                    } else {
                        iM2566 = (C2105.m6981("᩹ᩳ") ^ i9) * (-77);
                        i6 = ((iM2566 ^ i10) * (-28741)) ^ 1261230792;
                        i7 = 1719837923;
                    }
                    i12 = iM2566 ^ i7;
                    i11 = i6;
                    break;
                case -1281075551:
                case -21231261:
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = C0630.m2566("ۜܽ") ^ i9;
                        i6 = ((iM2566 ^ i10) * 24905) ^ 793641651;
                        i7 = 550799051;
                    } else {
                        iM2566 = (i9 - C2105.m6981("᩺ۛ")) * (-15);
                        i6 = ((iM2566 ^ i10) * 12173) ^ (-251711408);
                        i7 = 1767157183;
                    }
                    i12 = iM2566 ^ i7;
                    i11 = i6;
                    break;
                case -1244491480:
                case -467981830:
                    if (C3911.f12484 >= 0) {
                        iM2566 = (C0630.m2566("֨ۧ") ^ i9) * (-115);
                        i6 = ((iM2566 ^ i10) * (-9245)) ^ (-819602279);
                        i7 = -1188272018;
                    } else {
                        iM2566 = C2105.m6981("᩸ܳ") ^ i9;
                        i6 = ((iM2566 ^ i10) * 2251) ^ (-381014113);
                        i7 = 264140485;
                    }
                    i12 = iM2566 ^ i7;
                    i11 = i6;
                    break;
                case -472234979:
                case -145791601:
                    AbstractC2021.m6568(c12532.f37652, iM11932 - i5, bArr, (i3 + iM11932) - i4, iM10482 - iM11932);
                    int iM2567 = C0630.m2566("᩵۫") ^ i10;
                    i12 = iM2567 ^ (-879670735);
                    i11 = ((iM2567 ^ i9) * (-30707)) ^ 1175858513;
                    break;
                case -414814444:
                case 164483602:
                    if (C4075.f12947 >= 0) {
                        iM2566 = C0630.m2566("ۜܽ") ^ i9;
                        i6 = ((iM2566 ^ i10) * 24905) ^ 793641651;
                        i7 = 550799051;
                    } else {
                        iM2566 = C0630.m2566("᩺ܿ") ^ i10;
                        i6 = ((iM2566 ^ i9) * 19241) ^ 223794095;
                        i7 = 1089697722;
                    }
                    i12 = iM2566 ^ i7;
                    i11 = i6;
                    break;
                case -393666023:
                case 624317351:
                    iM11932 = C3911.m11932(i, i5);
                    if (C1047.f3863 >= 0) {
                        iM2566 = (C2105.m6981("ᩳۙ") + i9) * 69;
                        i6 = ((iM2566 ^ i10) * (-10961)) ^ (-593147976);
                        i7 = -54372415;
                    } else {
                        iM2566 = (i9 - C2105.m6981("ۛ۟")) * 83;
                        i6 = ((iM2566 ^ i10) * (-23443)) ^ 818380570;
                        i7 = 1881332757;
                    }
                    i12 = iM2566 ^ i7;
                    i11 = i6;
                    break;
                case -26430242:
                case 1451263538:
                    break;
                case 565376527:
                case 1051765680:
                    break;
                case 1395973804:
                case 1430004256:
                    C12532 c12533 = c23115.f74355;
                    iM10482 = (int) C3432.m10482(i2, ((long) i5) + ((long) c12533.m30740()));
                    if (iM11932 < iM10482) {
                        int iM6982 = C2105.m6981("ᩴۚ") ^ i9;
                        i11 = ((iM6982 ^ i10) * (-26493)) ^ 2056964624;
                        i12 = iM6982 ^ (-1585068594);
                        c12532 = c12533;
                    } else {
                        c12532 = c12533;
                        int iM2568 = C0630.m2566("᩵۫") ^ i10;
                        i12 = iM2568 ^ (-879670735);
                        i11 = ((iM2568 ^ i9) * (-30707)) ^ 1175858513;
                    }
                    break;
                case 1567251111:
                case 1981663117:
                    C0050.m940();
                    C0964.m3413();
                    break;
                default:
                    if (C0237.f1507 != 0) {
                        iM2566 = (C0630.m2566("ܶۛ") + i10) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i6 = ((iM2566 ^ i9) * 19031) ^ (-1822755188);
                        i7 = -264106469;
                    } else {
                        iM2566 = (i10 - C2105.m6981("۫᩵")) * (-83);
                        i6 = ((iM2566 ^ i9) * (-25553)) ^ (-1091022960);
                        i7 = 2025665930;
                    }
                    i12 = iM2566 ^ i7;
                    i11 = i6;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x01a0 A[PHI: r17
      0x01a0: PHI (r17v21 int) = (r17v6 int), (r17v18 int), (r17v23 int) binds: [B:42:0x0186, B:15:0x0069, B:7:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x025a A[PHI: r8 r9 r10 r17
      0x025a: PHI (r8v7 int) = (r8v2 int), (r8v2 int), (r8v2 int), (r8v8 int) binds: [B:61:0x0258, B:48:0x01d6, B:34:0x0128, B:19:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r9v4 byte[]) = (r9v2 byte[]), (r9v2 byte[]), (r9v2 byte[]), (r9v5 byte[]) binds: [B:61:0x0258, B:48:0x01d6, B:34:0x0128, B:19:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v2 int), (r10v5 int) binds: [B:61:0x0258, B:48:0x01d6, B:34:0x0128, B:19:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r17v16 int) = (r17v1 int), (r17v5 int), (r17v8 int), (r17v17 int) binds: [B:61:0x0258, B:48:0x01d6, B:34:0x0128, B:19:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0067, code lost:
    
        if (l.C3683.m11222() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        r17 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
    
        if (l.C0382.f1805 == false) goto L18;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m51301(C23115 c23115, int i, int i2, byte[] bArr, int i3, long[] jArr, int i4) {
        int i5;
        int iM6981;
        int i6;
        int i7;
        int i8;
        int i9 = i4;
        int i10 = 0;
        long j = 0;
        long j2 = 0;
        C12532 c12532 = null;
        int i11 = 0;
        int iM10482 = 0;
        byte[] bArr2 = null;
        int i12 = 0;
        int i13 = 1819655209;
        int i14 = C22628.f73083;
        int i15 = C1294.f4556;
        int iM6982 = C2105.m6981("ۜۖ") ^ i14;
        int i16 = ((iM6982 ^ i15) * (-13089)) ^ (-466047239);
        int i17 = 1387215814;
        while (true) {
            int i18 = iM6982 ^ i17;
            while (true) {
                i13 = ((((i13 ^ i15) * 9161) >> 31) & i16) ^ i18;
                switch (i13) {
                    case -1960010595:
                    case -88374107:
                        RunnableC1937.m6387();
                        break;
                    case -1826058843:
                    case -85419247:
                        i5 = i10;
                        if (C0798.f2919) {
                            iM6981 = C0630.m2566("ۛ۬") ^ i15;
                            i6 = ((iM6981 ^ i14) * 28997) ^ (-136938254);
                            i7 = 1309467097;
                        } else {
                            iM6981 = (C0630.m2566("ܰۖ") ^ i15) * 65;
                            i6 = ((iM6981 ^ i14) * 18717) ^ 1026499660;
                            i7 = -573480967;
                        }
                        i18 = iM6981 ^ i7;
                        i16 = i6;
                        i10 = i5;
                        i9 = i4;
                        break;
                    case -1690608213:
                    case -1037307862:
                        if (C0050.f910 < 0) {
                        }
                        i5 = i10;
                        iM6981 = (C0630.m2566("ۗ۬") ^ i14) * (-57);
                        i6 = ((iM6981 ^ i15) * (-5511)) ^ (-1273062524);
                        i7 = 514303604;
                        i18 = iM6981 ^ i7;
                        i16 = i6;
                        i10 = i5;
                        i9 = i4;
                        break;
                    case -1572413272:
                    case 1733092959:
                        i5 = i10;
                        if (C4159.m12565() >= 0) {
                            iM6981 = (C0630.m2566("۫ܺ") + i14) * (-37);
                            i6 = ((iM6981 ^ i15) * (-26033)) ^ (-121864024);
                            i7 = 892973703;
                        } else {
                            iM6981 = C2105.m6981("ܺ֫") ^ i15;
                            i6 = ((iM6981 ^ i14) * 2805) ^ 1028901971;
                            i7 = -2067603033;
                        }
                        i18 = iM6981 ^ i7;
                        i16 = i6;
                        i10 = i5;
                        i9 = i4;
                        break;
                    case -1509088505:
                    case -1314308011:
                        int i19 = i10 - i3;
                        RunnableC3474.m10623(bArr2, i12, bArr, i19, iM10482 - i10);
                        C17513.m40910(i19, iM10482 - i3, jArr);
                        break;
                    case -1506441859:
                    case 77116914:
                        int iM1484 = C0237.m1484(i, i9);
                        long j3 = i2;
                        long j4 = i9;
                        C12532 c12533 = c23115.f74355;
                        int iM30740 = c12533.m30740();
                        if (C4263.f13799 <= 0) {
                            c12532 = c12533;
                            i8 = iM1484;
                            j = j3;
                            j2 = j4;
                            i11 = iM30740;
                            int iM6983 = C2105.m6981("֫ܽ") ^ i15;
                            i18 = iM6983 ^ 875781490;
                            i16 = ((iM6983 ^ i14) * (-17409)) ^ (-1367524281);
                            i10 = i8;
                            i9 = i4;
                        } else {
                            int iM6984 = C2105.m6981("᩵۬") ^ i14;
                            i16 = ((iM6984 ^ i15) * 2777) ^ (-188972706);
                            i18 = iM6984 ^ 1169181337;
                            i9 = i4;
                            c12532 = c12533;
                            i10 = iM1484;
                            j = j3;
                            j2 = j4;
                            i11 = iM30740;
                        }
                        break;
                    case -1395889868:
                    case -580133298:
                        i5 = i10;
                        if (C21923.m49329()) {
                            iM6981 = (C0630.m2566("ۗ۬") ^ i14) * (-57);
                            i6 = ((iM6981 ^ i15) * (-5511)) ^ (-1273062524);
                            i7 = 514303604;
                        } else {
                            iM6981 = (C0630.m2566("ۗ᩷") + i14) * 55;
                            i6 = ((iM6981 ^ i15) * (-31201)) ^ 17325770;
                            i7 = 636442960;
                        }
                        i18 = iM6981 ^ i7;
                        i16 = i6;
                        i10 = i5;
                        i9 = i4;
                        break;
                    case -1360947830:
                    case 53888097:
                        C7106.m19120();
                        break;
                    case -1240014571:
                    case 927919245:
                        i5 = i10;
                        if (C2167.m7155()) {
                            iM6981 = (C0630.m2566("۫ܺ") + i14) * (-37);
                            i6 = ((iM6981 ^ i15) * (-26033)) ^ (-121864024);
                            i7 = 892973703;
                        } else {
                            iM6981 = (i15 - C0630.m2566("᩻ۡ")) * 67;
                            i6 = ((iM6981 ^ i14) * 29361) ^ (-386050493);
                            i7 = 1750764818;
                        }
                        i18 = iM6981 ^ i7;
                        i16 = i6;
                        i10 = i5;
                        i9 = i4;
                        break;
                    case -1160625748:
                    case -519795581:
                        ViewOnClickListenerC1958.m6429();
                        C4117.m12364();
                        i5 = i10;
                        iM6981 = (C0630.m2566("۫ܺ") + i14) * (-37);
                        i6 = ((iM6981 ^ i15) * (-26033)) ^ (-121864024);
                        i7 = 892973703;
                        i18 = iM6981 ^ i7;
                        i16 = i6;
                        i10 = i5;
                        i9 = i4;
                        break;
                    case -927883069:
                    case 518281582:
                        C4117.m12364();
                        break;
                    case -528895948:
                    case 1884321645:
                        iM10482 = (int) C3432.m10482(j, ((long) i11) + j2);
                        bArr2 = c12532.f37652;
                        i12 = i10 - i9;
                        if (C4263.m12819() >= 0) {
                            i5 = i10;
                            iM6981 = (C0630.m2566("۫ܺ") + i14) * (-37);
                            i6 = ((iM6981 ^ i15) * (-26033)) ^ (-121864024);
                            i7 = 892973703;
                            i18 = iM6981 ^ i7;
                            i16 = i6;
                            i10 = i5;
                            i9 = i4;
                        } else {
                            int iM2566 = C0630.m2566("ۚ᩻") ^ i15;
                            i16 = ((iM2566 ^ i14) * 32645) ^ 676995359;
                            i18 = iM2566 ^ 151354317;
                            i10 = i10;
                        }
                        break;
                    case -434363935:
                    case -307454450:
                        i5 = i10;
                        if (C2167.m7155()) {
                            iM6981 = (C0630.m2566("۫ܺ") + i14) * (-37);
                            i6 = ((iM6981 ^ i15) * (-26033)) ^ (-121864024);
                            i7 = 892973703;
                        } else {
                            iM6981 = C2105.m6981("ᩳۡ") ^ i14;
                            i6 = ((iM6981 ^ i15) * 10691) ^ 1407885409;
                            i7 = 1962233486;
                        }
                        i18 = iM6981 ^ i7;
                        i16 = i6;
                        i10 = i5;
                        i9 = i4;
                        break;
                    case -292440323:
                    case 492738038:
                        i5 = i10;
                        if (!C2272.f7362) {
                            iM6981 = (C0630.m2566("ۘ۬") + i15) * (-99);
                            i6 = ((iM6981 ^ i14) * 26881) ^ (-1671647825);
                            i7 = -1454312126;
                            i18 = iM6981 ^ i7;
                            i16 = i6;
                            i10 = i5;
                            i9 = i4;
                        }
                        i8 = i5;
                        int iM6985 = C2105.m6981("֫ܽ") ^ i15;
                        i18 = iM6985 ^ 875781490;
                        i16 = ((iM6985 ^ i14) * (-17409)) ^ (-1367524281);
                        i10 = i8;
                        i9 = i4;
                        break;
                    case 734704189:
                    case 1645672611:
                        i5 = i10;
                        if (C3019.f9544 < 0) {
                            iM6981 = C0630.m2566("۬ܶ") ^ i14;
                            i6 = ((iM6981 ^ i15) * 16255) ^ 961655541;
                            i7 = -613257772;
                            i18 = iM6981 ^ i7;
                            i16 = i6;
                            i10 = i5;
                            i9 = i4;
                        }
                        i8 = i5;
                        int iM6986 = C2105.m6981("֫ܽ") ^ i15;
                        i18 = iM6986 ^ 875781490;
                        i16 = ((iM6986 ^ i14) * (-17409)) ^ (-1367524281);
                        i10 = i8;
                        i9 = i4;
                        break;
                    default:
                        i5 = i10;
                        if (C4616.m13552() != 0) {
                            iM6981 = C0630.m2566("ۛ۬") ^ i15;
                            i6 = ((iM6981 ^ i14) * 28997) ^ (-136938254);
                            i7 = 1309467097;
                        } else {
                            iM6981 = (C0630.m2566("֡ۖ") ^ i14) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            i6 = ((iM6981 ^ i15) * 1949) ^ 1441498689;
                            i7 = 352620727;
                        }
                        i18 = iM6981 ^ i7;
                        i16 = i6;
                        i10 = i5;
                        i9 = i4;
                        break;
                }
                return;
            }
            iM6982 = C0630.m2566("᩸ᩴ") ^ i15;
            i16 = ((iM6982 ^ i14) * 31345) ^ 409724108;
            i17 = 1437629554;
        }
    }

    @Override // l.InterfaceC22410
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo32106(InterfaceC22410 interfaceC22410) {
        C23115 c23115 = null;
        int iM30740 = 0;
        int i = 1183777754;
        int i2 = RunnableC1937.f6483;
        int i3 = ServiceConnectionC3453.f10921;
        int iM2566 = (C0630.m2566("᩻᩻") + i3) * (-67);
        int i4 = ((iM2566 ^ i2) * 1273) ^ 1449399346;
        int i5 = 559018370;
        while (true) {
            i = ((((i ^ i2) * (-7081)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2130278993:
                case -885274715:
                    if (interfaceC22410 instanceof C23115) {
                        iM2566 = (i2 - C2105.m6981("ܳܰ")) * 67;
                        i4 = ((iM2566 ^ i3) * (-16387)) ^ (-1011589793);
                        i5 = -1391894235;
                    } else {
                        iM2566 = C0630.m2566("֨֡") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-19325)) ^ (-1830766742);
                        i5 = 477944990;
                    }
                    break;
                case -2089911166:
                case 1053664422:
                    c23115 = (C23115) interfaceC22410;
                    if (this.f74354 == c23115.f74354) {
                        iM2566 = (C2105.m6981("֨ܳ") + i3) * 95;
                        i4 = ((iM2566 ^ i2) * (-27715)) ^ (-605314345);
                        i5 = -514718993;
                    } else {
                        iM2566 = C0630.m2566("֨֡") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-19325)) ^ (-1830766742);
                        i5 = 477944990;
                    }
                    break;
                case -2062843865:
                case -625611431:
                    iM30740 = this.f74355.m30740();
                    if (C1504.f5354) {
                        iM2566 = C0630.m2566("᩹᩺") ^ i3;
                        i4 = ((iM2566 ^ i2) * 6963) ^ 786706652;
                        i5 = -1921325068;
                    } else {
                        iM2566 = C0630.m2566("ۜܺ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-11947)) ^ (-1627547903);
                        i5 = -133098500;
                    }
                    break;
                case -1918912691:
                case -49559218:
                    return false;
                case -1871230210:
                case 1052397923:
                    if (C3245.f10203 <= 0) {
                        iM2566 = (C0630.m2566("֡ܿ") ^ i2) * (-77);
                        i4 = ((iM2566 ^ i3) * (-29687)) ^ 1148605304;
                        i5 = 1530137922;
                    } else {
                        iM2566 = C0630.m2566("ܳ֡") ^ i2;
                        i4 = ((iM2566 ^ i3) * 5295) ^ (-1943188464);
                        i5 = -1498184868;
                    }
                    break;
                case -1834213839:
                case -1306601108:
                    if (C1128.f4106 <= 0) {
                        iM2566 = (C0630.m2566("֡ܿ") ^ i2) * (-77);
                        i4 = ((iM2566 ^ i3) * (-29687)) ^ 1148605304;
                        i5 = 1530137922;
                    } else {
                        iM2566 = (i2 - C0630.m2566("ۙ֡")) * 31;
                        i4 = ((iM2566 ^ i3) * 5575) ^ (-405725012);
                        i5 = -1282984970;
                    }
                    break;
                case -1709100156:
                case 928037048:
                    if (C2520.f8000 >= 0) {
                        iM2566 = C2105.m6981("ۢܿ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-31521)) ^ 849602814;
                        i5 = -1451309840;
                    } else {
                        iM2566 = (C0630.m2566("᩸۟") + i3) * (-91);
                        i4 = ((iM2566 ^ i2) * 599) ^ 463463023;
                        i5 = 939071196;
                    }
                    break;
                case -1470993608:
                case 448072546:
                    C5695.m16023();
                    ViewOnClickListenerC1958.m6429();
                    return false;
                case -1164929350:
                case 1166667037:
                    C11340.m28031();
                    if (!C1711.f5919) {
                        iM2566 = (C0630.m2566("֡ܿ") ^ i2) * (-77);
                        i4 = ((iM2566 ^ i3) * (-29687)) ^ 1148605304;
                        i5 = 1530137922;
                    } else {
                        iM2566 = C2105.m6981("ۜۖ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-5409)) ^ (-1704842566);
                        i5 = -163437208;
                    }
                    break;
                case -1137608782:
                case 612982541:
                    if (C4117.m12364() != 0) {
                        iM2566 = C2105.m6981("ۜۖ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-5409)) ^ (-1704842566);
                        i5 = -163437208;
                    } else {
                        iM2566 = C0630.m2566("ۛۨ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-23271)) ^ (-436222462);
                        i5 = 2119905324;
                    }
                    break;
                case -853642065:
                case 1808348631:
                    if (this.f74356.mo21895(c23115.f74356)) {
                        iM2566 = C0630.m2566("۠ܳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-19155)) ^ (-615875611);
                        i5 = -569094246;
                    } else {
                        iM2566 = C0630.m2566("֨֡") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-19325)) ^ (-1830766742);
                        i5 = 477944990;
                    }
                    break;
                case -795671354:
                case 435851528:
                    if (C1420.m4913()) {
                        iM2566 = C2105.m6981("ۜۖ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-5409)) ^ (-1704842566);
                        i5 = -163437208;
                    } else {
                        iM2566 = (C0630.m2566("ܺܶ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM2566 ^ i2) * 26291) ^ 969942927;
                        i5 = -1481293073;
                    }
                    break;
                case -778746971:
                case -473405386:
                    C0714.m2805();
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        iM2566 = C2105.m6981("ۢܿ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-31521)) ^ 849602814;
                        i5 = -1451309840;
                    } else {
                        iM2566 = C2105.m6981("ۜۖ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-5409)) ^ (-1704842566);
                        i5 = -163437208;
                    }
                    break;
                case -613610478:
                case -442845494:
                    if (C1047.f3863 >= 0) {
                        iM2566 = C0630.m2566("᩵ܰ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-28381)) ^ 731566000;
                        i5 = 1081452500;
                    } else {
                        iM2566 = (C0630.m2566("᩻ۛ") ^ i2) * 87;
                        i4 = ((iM2566 ^ i3) * (-23617)) ^ 886942649;
                        i5 = -746819499;
                    }
                    break;
                case -179522225:
                case 294552575:
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = (C0630.m2566("֡ܿ") ^ i2) * (-77);
                        i4 = ((iM2566 ^ i3) * (-29687)) ^ 1148605304;
                        i5 = 1530137922;
                    } else {
                        iM2566 = C0630.m2566("ܺ᩸") ^ i3;
                        i4 = ((iM2566 ^ i2) * 17877) ^ (-464018434);
                        i5 = 667732139;
                    }
                    break;
                case -160419058:
                case 286642378:
                    if (this.f74353 == c23115.f74353) {
                        iM2566 = (i2 - C2105.m6981("ۙܽ")) * (-7);
                        i4 = ((iM2566 ^ i3) * (-28783)) ^ (-1534309096);
                        i5 = -662762705;
                    } else {
                        iM2566 = C0630.m2566("֨֡") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-19325)) ^ (-1830766742);
                        i5 = 477944990;
                    }
                    break;
                case 230751176:
                case 668694916:
                    if (C3245.m9925() != 0) {
                        iM2566 = C0630.m2566("᩹᩺") ^ i3;
                        i4 = ((iM2566 ^ i2) * 6963) ^ 786706652;
                        i5 = -1921325068;
                    } else {
                        iM2566 = (C0630.m2566("ۧ۠") + i2) * 109;
                        i4 = ((iM2566 ^ i3) * 30445) ^ 1608387668;
                        i5 = -1571456267;
                    }
                    break;
                case 350633298:
                case 629628551:
                    if (iM30740 == c23115.f74355.m30740()) {
                        iM2566 = C2105.m6981("᩸۬") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-25857)) ^ (-805926486);
                        i5 = -2025980973;
                    } else {
                        iM2566 = C0630.m2566("֨֡") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-19325)) ^ (-1830766742);
                        i5 = 477944990;
                    }
                    break;
                case 741826040:
                case 1636720037:
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = C0630.m2566("᩵ܰ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-28381)) ^ 731566000;
                        i5 = 1081452500;
                    } else {
                        iM2566 = C2105.m6981("ۢܿ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-31521)) ^ 849602814;
                        i5 = -1451309840;
                    }
                    break;
                case 1074904019:
                case 1610189792:
                    if (C2520.f8000 >= 0) {
                        iM2566 = C0630.m2566("᩵ܰ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-28381)) ^ 731566000;
                        i5 = 1081452500;
                    } else {
                        iM2566 = C0630.m2566("ᩳܰ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 12723) ^ (-881579543);
                        i5 = -516672091;
                    }
                    break;
                case 1277668243:
                case 1341607139:
                    return true;
                default:
                    C2167.m7155();
                    RunnableC3474.m10630();
                    iM2566 = C2105.m6981("ۜۖ") ^ i3;
                    i4 = ((iM2566 ^ i2) * (-5409)) ^ (-1704842566);
                    i5 = -163437208;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51304(DataOutputStream dataOutputStream, int i, int i2, int i3) throws IOException {
        int iM2566;
        int i4;
        int i5;
        int i6;
        short s;
        int iM6981;
        int i7;
        int i8;
        int iM2567;
        int i9;
        int i10;
        int iM6982;
        int i11;
        int i12;
        int iM2568;
        int i13;
        DataOutputStream dataOutputStream2 = dataOutputStream;
        int i14 = 0;
        int i15 = 0;
        int i16 = -1255434467;
        int i17 = ServiceConnectionC3453.f10921;
        int i18 = C4117.f13076;
        int iM6983 = (i17 - C2105.m6981("ۚᩴ")) * (-113);
        int i19 = ((iM6983 ^ i18) * (-7165)) ^ (-2032447681);
        int i20 = iM6983 ^ (-271742500);
        long j = 0;
        long j2 = 0;
        AbstractC11164 abstractC11164M27686 = null;
        int iMo21889 = 0;
        int iM11932 = 0;
        int i21 = 0;
        int iM30740 = 0;
        short s2 = 0;
        C12532 c12532 = null;
        AbstractC11164 abstractC11164 = null;
        long j3 = 0;
        int iM7501 = 0;
        int i22 = 0;
        while (true) {
            i16 = i20 ^ (i19 & (((i16 ^ i18) * 25301) >> 31));
            switch (i16) {
                case -2057470134:
                case 1598036466:
                    j2 = j + j3;
                    if (j2 <= -2147483648L) {
                        iM2566 = C2105.m6981("ۖ᩺") ^ i17;
                        i4 = ((iM2566 ^ i18) * (-2565)) ^ (-104794673);
                        i5 = -1120161384;
                    } else {
                        iM2566 = (C0630.m2566("᩻ۜ") ^ i18) * 7;
                        i4 = ((iM2566 ^ i17) * 31365) ^ (-1793119223);
                        i5 = 632690883;
                    }
                    i20 = iM2566 ^ i5;
                    dataOutputStream2 = dataOutputStream;
                    i19 = i4;
                    break;
                case -2027155127:
                case -577904403:
                    i6 = iM30740;
                    iMo21889 = iMo21889;
                    short s3 = s2;
                    int i23 = s3 + 871;
                    i14 = i23 * i23;
                    i15 = s3 * s3;
                    if (!C0483.m2121()) {
                        s = s3;
                        iM6981 = C0630.m2566("ۙᩳ") ^ i17;
                        i7 = ((iM6981 ^ i18) * 10477) ^ 2144047359;
                        i8 = -68015096;
                        int i24 = iM6981 ^ i8;
                        i19 = i7;
                        s2 = s;
                        dataOutputStream2 = dataOutputStream;
                        i20 = i24;
                        iMo21889 = iMo21889;
                        iM30740 = i6;
                    } else {
                        int iM6984 = (C2105.m6981("ܳۖ") + i18) * 95;
                        i19 = ((iM6984 ^ i17) * 969) ^ 519337030;
                        iMo21889 = iMo21889;
                        iM30740 = i6;
                        s2 = s3;
                        i20 = iM6984 ^ 1678515796;
                        dataOutputStream2 = dataOutputStream;
                    }
                    break;
                case -1992581610:
                case -1834586770:
                    i6 = iM30740;
                    s = s2;
                    iMo21889 = iMo21889;
                    if (C3746.f11829 <= 0) {
                        iM6981 = C2105.m6981("ܳۜ") ^ i17;
                        i7 = ((iM6981 ^ i18) * 31899) ^ 1926435558;
                        i8 = 713942721;
                    } else {
                        iM6981 = (C2105.m6981("ۨܶ") + i17) * (-69);
                        i7 = ((iM6981 ^ i18) * 22833) ^ 1040842065;
                        i8 = 855443453;
                    }
                    int i25 = iM6981 ^ i8;
                    i19 = i7;
                    s2 = s;
                    dataOutputStream2 = dataOutputStream;
                    i20 = i25;
                    iMo21889 = iMo21889;
                    iM30740 = i6;
                    break;
                case -1989062468:
                case -326822167:
                    i6 = iM30740;
                    iMo21889 = iMo21889;
                    s2 = f74352[28];
                    if (C1294.m4372() <= 0) {
                        iM2567 = (C0630.m2566("ܽ᩷") + i18) * (-29);
                        i9 = ((iM2567 ^ i17) * 23099) ^ 1735442996;
                        i10 = 1181742628;
                    } else {
                        iM2567 = (i17 - C0630.m2566("ܶۖ")) * 67;
                        i9 = ((iM2567 ^ i18) * (-31921)) ^ (-2144958147);
                        i10 = -651882019;
                    }
                    i20 = iM2567 ^ i10;
                    i19 = i9;
                    iMo21889 = iMo21889;
                    iM30740 = i6;
                    dataOutputStream2 = dataOutputStream;
                    break;
                case -1861301859:
                case 888939090:
                    i6 = iM30740;
                    s = s2;
                    iMo21889 = iMo21889;
                    if (RunnableC1937.m6387() != 0) {
                        iM6981 = C0630.m2566("ۧۧ") ^ i17;
                        i7 = ((iM6981 ^ i18) * (-31177)) ^ (-500509972);
                        i8 = 1513188845;
                    } else {
                        iM6981 = C0630.m2566("ܳܶ") ^ i17;
                        i7 = ((iM6981 ^ i18) * 31657) ^ (-296177008);
                        i8 = -800162853;
                    }
                    int i26 = iM6981 ^ i8;
                    i19 = i7;
                    s2 = s;
                    dataOutputStream2 = dataOutputStream;
                    i20 = i26;
                    iMo21889 = iMo21889;
                    iM30740 = i6;
                    break;
                case -1848739973:
                case -87880865:
                    throw new IOException(AbstractC2021.m6573(f74352, 29, 34, i22));
                case -1668212990:
                case -757335997:
                    int i27 = iM30740;
                    j = ((long) iM11932) - ((long) i27);
                    j3 = 1;
                    if (C3432.m10477() > 0) {
                        int iM6985 = C2105.m6981("ۤ۫") ^ i18;
                        i20 = iM6985 ^ 159997906;
                        iM30740 = i27;
                        i19 = ((iM6985 ^ i17) * 29207) ^ 2103892616;
                        dataOutputStream2 = dataOutputStream;
                    } else {
                        iMo21889 = iMo21889;
                        i6 = i27;
                        s = s2;
                        iM6981 = C2105.m6981("ܳۜ") ^ i17;
                        i7 = ((iM6981 ^ i18) * 31899) ^ 1926435558;
                        i8 = 713942721;
                        int i28 = iM6981 ^ i8;
                        i19 = i7;
                        s2 = s;
                        dataOutputStream2 = dataOutputStream;
                        i20 = i28;
                        iMo21889 = iMo21889;
                        iM30740 = i6;
                    }
                    break;
                case -1228520323:
                case 1996282944:
                    C3019.m9255();
                    if (C3911.m11924() <= 0) {
                        iM6982 = C0630.m2566("ᩴܳ") ^ i18;
                        i11 = ((iM6982 ^ i17) * (-845)) ^ (-159559662);
                        i12 = -327433404;
                        i20 = iM6982 ^ i12;
                        dataOutputStream2 = dataOutputStream;
                        i19 = i11;
                    } else {
                        i6 = iM30740;
                        s = s2;
                        iMo21889 = iMo21889;
                        iM6981 = C2105.m6981("ܳۜ") ^ i17;
                        i7 = ((iM6981 ^ i18) * 31899) ^ 1926435558;
                        i8 = 713942721;
                        int i29 = iM6981 ^ i8;
                        i19 = i7;
                        s2 = s;
                        dataOutputStream2 = dataOutputStream;
                        i20 = i29;
                        iMo21889 = iMo21889;
                        iM30740 = i6;
                    }
                    break;
                case -1173559756:
                case -965020232:
                    RunnableC1108.m3790();
                    C0422.m1963();
                    return;
                case -1162779940:
                case 256019702:
                    if (C1420.f5096 > 0) {
                        i6 = iM30740;
                        s = s2;
                        iMo21889 = iMo21889;
                        iM6981 = C0630.m2566("ۙᩳ") ^ i17;
                        i7 = ((iM6981 ^ i18) * 10477) ^ 2144047359;
                        i8 = -68015096;
                        int i210 = iM6981 ^ i8;
                        i19 = i7;
                        s2 = s;
                        dataOutputStream2 = dataOutputStream;
                        i20 = i210;
                        iMo21889 = iMo21889;
                        iM30740 = i6;
                    }
                    i6 = iM30740;
                    s = s2;
                    iMo21889 = iMo21889;
                    iM6981 = C2105.m6981("ܳۜ") ^ i17;
                    i7 = ((iM6981 ^ i18) * 31899) ^ 1926435558;
                    i8 = 713942721;
                    int i211 = iM6981 ^ i8;
                    i19 = i7;
                    s2 = s;
                    dataOutputStream2 = dataOutputStream;
                    i20 = i211;
                    iMo21889 = iMo21889;
                    iM30740 = i6;
                    break;
                case -904155022:
                case 169092382:
                    int i30 = iM30740;
                    iM11932 = C3911.m11932(i, this.f74354);
                    iM7501 = C2272.m7501(i2, this.f74353);
                    iMo21889 = iMo21889;
                    C12532 c12533 = this.f74355;
                    if (AbstractC2021.f6743 <= 0) {
                        c12532 = c12533;
                        i6 = i30;
                        iM2567 = (C0630.m2566("ܽ᩷") + i18) * (-29);
                        i9 = ((iM2567 ^ i17) * 23099) ^ 1735442996;
                        i10 = 1181742628;
                        i20 = iM2567 ^ i10;
                        i19 = i9;
                        iMo21889 = iMo21889;
                        iM30740 = i6;
                    } else {
                        int iM6986 = C2105.m6981("ᩳᩴ") ^ i18;
                        i20 = iM6986 ^ (-1986561845);
                        i19 = ((iM6986 ^ i17) * (-11121)) ^ 1770240424;
                        iMo21889 = iMo21889;
                        c12532 = c12533;
                        iM30740 = i30;
                    }
                    dataOutputStream2 = dataOutputStream;
                    break;
                case -813448418:
                case 115170964:
                    i22 = 21184;
                    iM2567 = (i17 - C0630.m2566("ܶ۫")) * 85;
                    i6 = iM30740;
                    i9 = ((iM2567 ^ i18) * 23171) ^ 548411068;
                    i10 = 1679575333;
                    i20 = iM2567 ^ i10;
                    i19 = i9;
                    iMo21889 = iMo21889;
                    iM30740 = i6;
                    dataOutputStream2 = dataOutputStream;
                    break;
                case -547509235:
                case 813996303:
                    iM30740 = c12532.m30740();
                    abstractC11164 = this.f74356;
                    RunnableC3474.m10618(abstractC11164);
                    if (RunnableC1937.f6483 >= 0) {
                        iM6982 = C0630.m2566("ᩴܳ") ^ i18;
                        i11 = ((iM6982 ^ i17) * (-845)) ^ (-159559662);
                        i12 = -327433404;
                    } else {
                        iM6982 = C2105.m6981("ۙ֡") ^ i17;
                        i11 = ((iM6982 ^ i18) * 26009) ^ 1126902246;
                        i12 = 1885748122;
                    }
                    i20 = iM6982 ^ i12;
                    dataOutputStream2 = dataOutputStream;
                    i19 = i11;
                    break;
                case -368274733:
                case 146384828:
                    C1420.m4914(dataOutputStream2, i3);
                    C3245.m9922(dataOutputStream2, iM11932 - i);
                    C3245.m9922(dataOutputStream2, iM7501 - iM11932);
                    abstractC11164M27686.mo21892(dataOutputStream2, i);
                    return;
                case -204452446:
                case 2050781449:
                    i21 = (int) j2;
                    iM2566 = C0630.m2566("᩺۫") ^ i17;
                    i4 = ((iM2566 ^ i18) * (-17585)) ^ (-875366455);
                    i5 = -2132450384;
                    i20 = iM2566 ^ i5;
                    dataOutputStream2 = dataOutputStream;
                    i19 = i4;
                    break;
                case 131547370:
                case 1295956200:
                    i22 = 27765;
                    iM2567 = (i17 - C0630.m2566("ܶ۫")) * 85;
                    i6 = iM30740;
                    i9 = ((iM2567 ^ i18) * 23171) ^ 548411068;
                    i10 = 1679575333;
                    i20 = iM2567 ^ i10;
                    i19 = i9;
                    iMo21889 = iMo21889;
                    iM30740 = i6;
                    dataOutputStream2 = dataOutputStream;
                    break;
                case 303183159:
                case 569371067:
                    i6 = iM30740;
                    s = s2;
                    iMo21889 = iMo21889;
                    if (C3432.f10845 >= 0) {
                        iM6981 = C0630.m2566("ۙᩳ") ^ i17;
                        i7 = ((iM6981 ^ i18) * 10477) ^ 2144047359;
                        i8 = -68015096;
                    } else {
                        iM6981 = (i18 - C0630.m2566("ܺܿ")) * 61;
                        i7 = ((iM6981 ^ i17) * 14429) ^ 1997510029;
                        i8 = -1724998648;
                    }
                    int i212 = iM6981 ^ i8;
                    i19 = i7;
                    s2 = s;
                    dataOutputStream2 = dataOutputStream;
                    i20 = i212;
                    iMo21889 = iMo21889;
                    iM30740 = i6;
                    break;
                case 386217922:
                case 1490583252:
                    C4263.m12819();
                    i6 = iM30740;
                    s = s2;
                    iMo21889 = iMo21889;
                    iM6981 = C2105.m6981("ܳۜ") ^ i17;
                    i7 = ((iM6981 ^ i18) * 31899) ^ 1926435558;
                    i8 = 713942721;
                    int i213 = iM6981 ^ i8;
                    i19 = i7;
                    s2 = s;
                    dataOutputStream2 = dataOutputStream;
                    i20 = i213;
                    iMo21889 = iMo21889;
                    iM30740 = i6;
                    break;
                case 636302333:
                case 2085765959:
                    final int[] iArr = new int[iMo21889];
                    final int[] iArr2 = {0};
                    if (AbstractC2021.f6743 > 0) {
                        abstractC11164.mo21891(i21, iM7501, new InterfaceC21705() { // from class: l.۟ܽܳ
                            @Override // l.InterfaceC21705
                            /* JADX INFO: renamed from: ֫ */
                            public final void mo4084(int i31, int i32) {
                                int[] iArr3 = iArr2;
                                int i33 = iArr3[0];
                                iArr3[0] = i33 + 1;
                                iArr[i33] = i32;
                            }
                        });
                        abstractC11164M27686 = AbstractC11164.m27686(iMo21889, iArr);
                        iM2566 = C2105.m6981("᩶᩶") ^ i18;
                        i4 = ((iM2566 ^ i17) * 24453) ^ 1903410614;
                        i5 = 388795163;
                        i20 = iM2566 ^ i5;
                        dataOutputStream2 = dataOutputStream;
                        i19 = i4;
                    } else {
                        iM6982 = C0630.m2566("ᩴܳ") ^ i18;
                        i11 = ((iM6982 ^ i17) * (-845)) ^ (-159559662);
                        i12 = -327433404;
                        i20 = iM6982 ^ i12;
                        dataOutputStream2 = dataOutputStream;
                        i19 = i11;
                    }
                    break;
                case 743881588:
                case 1635406268:
                    abstractC11164M27686 = C15353.f47054;
                    iM2566 = C2105.m6981("᩶᩶") ^ i18;
                    i4 = ((iM2566 ^ i17) * 24453) ^ 1903410614;
                    i5 = 388795163;
                    i20 = iM2566 ^ i5;
                    dataOutputStream2 = dataOutputStream;
                    i19 = i4;
                    break;
                case 764656012:
                case 1018783944:
                    i6 = iM30740;
                    s = s2;
                    iMo21889 = iMo21889;
                    if (C0714.f2697 < 0) {
                        iM6981 = C2105.m6981("᩸᩺") ^ i18;
                        i7 = ((iM6981 ^ i17) * (-13675)) ^ (-447517780);
                        i8 = -1169177780;
                        int i214 = iM6981 ^ i8;
                        i19 = i7;
                        s2 = s;
                        dataOutputStream2 = dataOutputStream;
                        i20 = i214;
                        iMo21889 = iMo21889;
                        iM30740 = i6;
                    } else {
                        s2 = s;
                        iM2567 = (C0630.m2566("ܽ᩷") + i18) * (-29);
                        i9 = ((iM2567 ^ i17) * 23099) ^ 1735442996;
                        i10 = 1181742628;
                        i20 = iM2567 ^ i10;
                        i19 = i9;
                        iMo21889 = iMo21889;
                        iM30740 = i6;
                        dataOutputStream2 = dataOutputStream;
                    }
                    break;
                case 858147090:
                case 1361682754:
                    i6 = iM30740;
                    iMo21889 = iMo21889;
                    int i31 = i15 + 758641;
                    if ((i31 + i31) - i14 < 0) {
                        iM2567 = (C2105.m6981("ۜۛ") ^ i17) * (-19);
                        i9 = ((iM2567 ^ i18) * 12023) ^ 820078102;
                        i10 = 1870318199;
                    } else {
                        iM2567 = C2105.m6981("ۜܿ") ^ i18;
                        i9 = ((iM2567 ^ i17) * 20183) ^ (-814164050);
                        i10 = 469236140;
                    }
                    i20 = iM2567 ^ i10;
                    i19 = i9;
                    iMo21889 = iMo21889;
                    iM30740 = i6;
                    dataOutputStream2 = dataOutputStream;
                    break;
                case 1095326994:
                case 1835198023:
                    C3911.m11924();
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        i6 = iM30740;
                        s = s2;
                        iMo21889 = iMo21889;
                        iM6981 = C0630.m2566("ۧۧ") ^ i17;
                        i7 = ((iM6981 ^ i18) * (-31177)) ^ (-500509972);
                        i8 = 1513188845;
                        int i215 = iM6981 ^ i8;
                        i19 = i7;
                        s2 = s;
                        dataOutputStream2 = dataOutputStream;
                        i20 = i215;
                        iMo21889 = iMo21889;
                        iM30740 = i6;
                    }
                    i6 = iM30740;
                    s = s2;
                    iMo21889 = iMo21889;
                    iM6981 = C2105.m6981("ܳۜ") ^ i17;
                    i7 = ((iM6981 ^ i18) * 31899) ^ 1926435558;
                    i8 = 713942721;
                    int i216 = iM6981 ^ i8;
                    i19 = i7;
                    s2 = s;
                    dataOutputStream2 = dataOutputStream;
                    i20 = i216;
                    iMo21889 = iMo21889;
                    iM30740 = i6;
                    break;
                case 1100766009:
                case 1105616764:
                    if (abstractC11164M27686.mo21898() != 0) {
                        iM2568 = C2105.m6981("ܶۗ") ^ i18;
                        i11 = ((iM2568 ^ i17) * 29613) ^ 380298385;
                        i13 = -1127879147;
                    } else {
                        iM2568 = (C0630.m2566("ۙܶ") ^ i17) * (-23);
                        i11 = ((iM2568 ^ i18) * (-15473)) ^ 1812353930;
                        i13 = 604285870;
                    }
                    i20 = iM2568 ^ i13;
                    i19 = i11;
                    break;
                case 1136273090:
                case 1372367500:
                    i21 = Integer.MIN_VALUE;
                    iM2566 = C0630.m2566("᩺۫") ^ i17;
                    i4 = ((iM2566 ^ i18) * (-17585)) ^ (-875366455);
                    i5 = -2132450384;
                    i20 = iM2566 ^ i5;
                    dataOutputStream2 = dataOutputStream;
                    i19 = i4;
                    break;
                case 1458493378:
                case 1813097841:
                    iMo21889 = abstractC11164.mo21889(i21, iM7501);
                    if (iMo21889 == abstractC11164.mo21898()) {
                        abstractC11164M27686 = abstractC11164;
                        iM2566 = C2105.m6981("᩶᩶") ^ i18;
                        i4 = ((iM2566 ^ i17) * 24453) ^ 1903410614;
                        i5 = 388795163;
                    } else {
                        iM2566 = (i18 - C0630.m2566("᩺۬")) * 35;
                        i4 = ((iM2566 ^ i17) * 30475) ^ (-72600269);
                        i5 = 279251072;
                    }
                    i20 = iM2566 ^ i5;
                    dataOutputStream2 = dataOutputStream;
                    i19 = i4;
                    break;
                default:
                    if (iMo21889 == 0) {
                        iM2566 = C2105.m6981("ۖۚ") ^ i18;
                        i4 = ((iM2566 ^ i17) * 12823) ^ (-1210904451);
                        i5 = 2057304855;
                    } else {
                        iM2566 = (C0630.m2566("ۘ۠") ^ i17) * (-67);
                        i4 = ((iM2566 ^ i18) * 11767) ^ 1817105267;
                        i5 = -2028169761;
                    }
                    i20 = iM2566 ^ i5;
                    dataOutputStream2 = dataOutputStream;
                    i19 = i4;
                    break;
            }
        }
    }

    public C23115(C12532 c12532, AbstractC11164 abstractC11164, int i, int i2) {
        int i3 = 1393518716;
        int i4 = C0050.f910;
        int i5 = C0714.f2697;
        short s = f74352[0];
        int i6 = 52004 * s;
        int i7 = s + 13001;
        int i8 = (i7 * i7) - i6 < 0 ? 28079 : 51180;
        int iM6981 = (C2105.m6981("۬۬") + i5) * 59;
        int i9 = ((iM6981 ^ i4) * 16899) ^ 504600049;
        int i10 = -1451559922;
        while (true) {
            i3 = ((((i3 ^ i4) * (-3547)) >> 31) & i9) ^ (iM6981 ^ i10);
            switch (i3) {
                case -1869242884:
                case 1695868193:
                    if (abstractC11164.mo21898() != 0) {
                        iM6981 = C2105.m6981("۟ܰ") ^ i5;
                        i9 = ((iM6981 ^ i4) * (-6341)) ^ (-240828714);
                        i10 = -237062119;
                    } else {
                        iM6981 = C2105.m6981("ܶۜ") ^ i4;
                        i9 = ((iM6981 ^ i5) * 11749) ^ (-653161668);
                        i10 = -845092609;
                    }
                    break;
                case -1760875914:
                case 2037505145:
                    C3911.m11924();
                    if (C1047.f3863 < 0) {
                        iM6981 = (i5 - C0630.m2566("ܰܳ")) * (-101);
                        i9 = ((iM6981 ^ i4) * (-28791)) ^ 2028761195;
                        i10 = 1677587683;
                    } else {
                        iM6981 = C2105.m6981("۠᩻") ^ i5;
                        i9 = ((iM6981 ^ i4) * 22807) ^ 1594965384;
                        i10 = 1330101542;
                    }
                    break;
                case -1738663451:
                case -484483861:
                    this.f74354 = i;
                    this.f74353 = i2;
                    return;
                case -1340947587:
                case -471692149:
                    this.f74355 = c12532;
                    this.f74356 = abstractC11164;
                    if (C1504.f5354) {
                        iM6981 = (i5 - C0630.m2566("ܰܳ")) * (-101);
                        i9 = ((iM6981 ^ i4) * (-28791)) ^ 2028761195;
                        i10 = 1677587683;
                    } else {
                        iM6981 = C0630.m2566("֨᩶") ^ i4;
                        i9 = ((iM6981 ^ i5) * (-20805)) ^ (-1072071674);
                        i10 = 1694223712;
                    }
                    break;
                case -1056421728:
                case 1611881027:
                    C2105.m6982();
                    C3537.m10746();
                    iM6981 = C2105.m6981("ۧܳ") ^ i4;
                    i9 = ((iM6981 ^ i5) * 21983) ^ (-576130641);
                    i10 = 69275845;
                    break;
                case -125513566:
                case 808645451:
                    C0798.m2998();
                    C0382.m1848();
                    throw new RuntimeException();
                case -39565538:
                case 822416338:
                    short[] sArr = f74352;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = (i4 - C2105.m6981("᩶ۛ")) * (-85);
                        i9 = ((iM6981 ^ i5) * (-30969)) ^ 1636128630;
                        i10 = -1993030892;
                    } else {
                        if (C1128.f4106 > 0) {
                            if (C3537.f11231 < 0 && C0050.f910 < 0) {
                                if (C7106.f21815 == 0) {
                                    if (C0050.f910 < 0) {
                                        if (ServiceConnectionC3453.f10921 < 0) {
                                            if (C0382.f1805 && !C3663.f11553) {
                                                throw new IllegalArgumentException(C2167.m7159(sArr, 1, 27, i8));
                                            }
                                        }
                                    }
                                }
                                iM6981 = (i5 - C0630.m2566("ܰܳ")) * (-101);
                                i9 = ((iM6981 ^ i4) * (-28791)) ^ 2028761195;
                                i10 = 1677587683;
                            }
                            iM6981 = C0630.m2566("۟᩷") ^ i4;
                            i9 = ((iM6981 ^ i5) * 12587) ^ 2042869019;
                            i10 = -45614603;
                        }
                        iM6981 = C2105.m6981("۠᩻") ^ i5;
                        i9 = ((iM6981 ^ i4) * 22807) ^ 1594965384;
                        i10 = 1330101542;
                    }
                    break;
                case 31591366:
                case 1002730343:
                    if (C4117.f13076 <= 0) {
                        iM6981 = (i4 - C2105.m6981("᩶ۛ")) * (-85);
                        i9 = ((iM6981 ^ i5) * (-30969)) ^ 1636128630;
                        i10 = -1993030892;
                    } else {
                        iM6981 = (i5 - C0630.m2566("ܰܳ")) * (-101);
                        i9 = ((iM6981 ^ i4) * (-28791)) ^ 2028761195;
                        i10 = 1677587683;
                    }
                    break;
                case 42451294:
                case 2140241461:
                    if (i < i2) {
                        iM6981 = C0630.m2566("ۘ֡") ^ i5;
                        i9 = ((iM6981 ^ i4) * 27325) ^ 1147436693;
                        i10 = 1840074591;
                    } else {
                        iM6981 = C2105.m6981("ܶۜ") ^ i4;
                        i9 = ((iM6981 ^ i5) * 11749) ^ (-653161668);
                        i10 = -845092609;
                    }
                    break;
                default:
                    if (!C1711.f5919) {
                        iM6981 = C2105.m6981("ۧܳ") ^ i4;
                        i9 = ((iM6981 ^ i5) * 21983) ^ (-576130641);
                        i10 = 69275845;
                    } else {
                        iM6981 = C2105.m6981("۠᩻") ^ i5;
                        i9 = ((iM6981 ^ i4) * 22807) ^ 1594965384;
                        i10 = 1330101542;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0317 A[PHI: r19 r20
      0x0317: PHI (r19v35 int) = (r19v9 int), (r19v10 int), (r19v42 int) binds: [B:72:0x0315, B:68:0x02ee, B:11:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0317: PHI (r20v32 int) = (r20v10 int), (r20v11 int), (r20v37 int) binds: [B:72:0x0315, B:68:0x02ee, B:11:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x0351 A[PHI: r19 r20
      0x0351: PHI (r19v40 int) = (r19v8 int), (r19v11 int), (r19v41 int) binds: [B:76:0x034f, B:64:0x02c6, B:10:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x0351: PHI (r20v35 int) = (r20v9 int), (r20v12 int), (r20v36 int) binds: [B:76:0x034f, B:64:0x02c6, B:10:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x03b0 A[PHI: r19 r20
      0x03b0: PHI (r19v33 int) = (r19v6 int), (r19v7 int), (r19v12 int), (r19v13 int), (r19v34 int) binds: [B:84:0x03ae, B:80:0x038a, B:60:0x02a0, B:56:0x027c, B:14:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x03b0: PHI (r20v30 int) = (r20v7 int), (r20v8 int), (r20v13 int), (r20v14 int), (r20v31 int) binds: [B:84:0x03ae, B:80:0x038a, B:60:0x02a0, B:56:0x027c, B:14:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008e, code lost:
    
        if (l.C3019.f9544 < 0) goto L14;
     */
    @Override // l.InterfaceC22410
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo32104(final byte[] bArr, final int i, int i2, final long[] jArr) {
        int iM6981;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int iM6982;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int iM2566;
        int i13;
        int i14;
        long jM51303 = 0;
        C12532 c12532 = null;
        int i15 = C1128.f4106;
        int i16 = C1773.f6144;
        int iM2567 = C0630.m2566("֫᩷") ^ i16;
        int i17 = ((iM2567 ^ i15) * 16805) ^ 602272741;
        C16807 c16807 = null;
        int i18 = iM2567 ^ 647674080;
        int i19 = 0;
        int iM1484 = 0;
        int iM7501 = 0;
        int i20 = 0;
        int iM30740 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 1159731760;
        AbstractC11164 abstractC11164 = null;
        int i24 = 0;
        while (true) {
            i23 = i18 ^ (i17 & (((i23 ^ i15) * 15423) >> 31));
            switch (i23) {
                case -2117987328:
                case -1123476261:
                    i22 = i21 + iM30740;
                    int iM6983 = (C2105.m6981("ᩴܺ") + i15) * (-41);
                    i17 = ((iM6983 ^ i16) * (-16209)) ^ (-896273755);
                    i18 = iM6983 ^ (-1270756005);
                    break;
                case -1977246670:
                case -1549767906:
                    i6 = i19;
                    i7 = i24;
                    if (C5695.m16023() >= 0) {
                        iM6982 = C0630.m2566("ۗ۬") ^ i16;
                        i8 = ((iM6982 ^ i15) * 16313) ^ (-671649176);
                        i9 = -1229604298;
                    } else {
                        iM6982 = C2105.m6981("ᩴۛ") ^ i15;
                        i8 = ((iM6982 ^ i16) * 28091) ^ 1575596810;
                        i9 = -1016873111;
                    }
                    i24 = i7;
                    i18 = iM6982 ^ i9;
                    i17 = i8;
                    i19 = i6;
                    break;
                case -1861126907:
                case -1098237995:
                    i6 = i19;
                    i7 = i24;
                    if (C3537.m10746() <= 0) {
                        iM6982 = C0630.m2566("ۢ֨") ^ i15;
                        i8 = ((iM6982 ^ i16) * (-19523)) ^ 1409104271;
                        i9 = -777695274;
                    } else {
                        iM6982 = (C2105.m6981("֡ۡ") ^ i15) * (-111);
                        i8 = ((iM6982 ^ i16) * 4641) ^ 1562883744;
                        i9 = 599540986;
                    }
                    i24 = i7;
                    i18 = iM6982 ^ i9;
                    i17 = i8;
                    i19 = i6;
                    break;
                case -1809195677:
                case 459031857:
                    i22 = 0;
                    int iM6984 = (C2105.m6981("ᩴܺ") + i15) * (-41);
                    i17 = ((iM6984 ^ i16) * (-16209)) ^ (-896273755);
                    i18 = iM6984 ^ (-1270756005);
                    break;
                case -1786728347:
                case 10446909:
                    i6 = i19;
                    i7 = i24;
                    if (C7811.f24123 >= 0) {
                        iM6982 = C0630.m2566("ۗ۬") ^ i16;
                        i8 = ((iM6982 ^ i15) * 16313) ^ (-671649176);
                        i9 = -1229604298;
                    } else {
                        iM6982 = C2105.m6981("᩸ܶ") ^ i16;
                        i8 = ((iM6982 ^ i15) * (-1045)) ^ (-459819626);
                        i9 = 1682582652;
                    }
                    i24 = i7;
                    i18 = iM6982 ^ i9;
                    i17 = i8;
                    i19 = i6;
                    break;
                case -1744305867:
                case -1697640210:
                    C0382.m1848();
                    break;
                case -1535947394:
                case 929370917:
                    i7 = i24;
                    jM51303 = m51303(iM1484, iM7501);
                    abstractC11164 = this.f74356;
                    c12532 = this.f74355;
                    if (jM51303 == -1) {
                        i6 = i19;
                        int iM6985 = C2105.m6981("ܳ᩺") ^ i16;
                        int i25 = ((iM6985 ^ i15) * 31557) ^ 1630964232;
                        i10 = iM6985 ^ 473832209;
                        i17 = i25;
                        i24 = i7;
                        i18 = i10;
                        i19 = i6;
                    } else {
                        int iM2568 = C0630.m2566("֨᩻") ^ i15;
                        i17 = ((iM2568 ^ i16) * 5933) ^ 763491024;
                        i19 = i19;
                        i11 = i7;
                        i18 = iM2568 ^ (-107368184);
                        i24 = i11;
                    }
                    break;
                case -1487800757:
                case 123487009:
                    i12 = i24;
                    i20 = i19 - c16807.f51593;
                    iM30740 = c12532.m30740();
                    i21 = i20 % iM30740;
                    if (i21 == 0) {
                        iM2566 = C2105.m6981("۬ۡ") ^ i15;
                        i13 = ((iM2566 ^ i16) * 3975) ^ 85897695;
                        i14 = -1666381858;
                    } else {
                        iM2566 = (C0630.m2566("᩶۟") ^ i16) * (-27);
                        i13 = ((iM2566 ^ i15) * 15911) ^ (-1536492898);
                        i14 = 2132449167;
                    }
                    i11 = i12;
                    i18 = iM2566 ^ i14;
                    i17 = i13;
                    i24 = i11;
                    break;
                case -1367110027:
                case 847479616:
                    final int i26 = iM1484;
                    final int i27 = iM7501;
                    abstractC11164.m27689(iM1484, iM7501, c12532.m30740(), new InterfaceC21705() { // from class: l.ۤܽܳ
                        @Override // l.InterfaceC21705
                        /* JADX INFO: renamed from: ֫ */
                        public final void mo4084(int i28, int i29) {
                            C23115.m51301(this.f31307, i26, i27, bArr, i, jArr, i29);
                        }
                    });
                    break;
                case -1205465844:
                case -262729943:
                    if (C22628.m50615() == 0) {
                        i6 = i19;
                        i7 = i24;
                        iM6982 = (C2105.m6981("ۘۙ") + i15) * (-109);
                        i8 = ((iM6982 ^ i16) * 18445) ^ (-50872315);
                        i9 = 1792819900;
                        i24 = i7;
                        i18 = iM6982 ^ i9;
                        i17 = i8;
                        i19 = i6;
                    }
                    i6 = i19;
                    i7 = i24;
                    iM6982 = C0630.m2566("ۢ֨") ^ i15;
                    i8 = ((iM6982 ^ i16) * (-19523)) ^ 1409104271;
                    i9 = -777695274;
                    i24 = i7;
                    i18 = iM6982 ^ i9;
                    i17 = i8;
                    i19 = i6;
                    break;
                case -1188961768:
                case 1140550565:
                    i6 = i19;
                    i7 = i24;
                    if (RunnableC1937.m6387() != 0) {
                        iM6982 = (C2105.m6981("ۘۙ") + i15) * (-109);
                        i8 = ((iM6982 ^ i16) * 18445) ^ (-50872315);
                        i9 = 1792819900;
                    } else {
                        iM6982 = (i16 - C0630.m2566("۬ܺ")) * 101;
                        i8 = ((iM6982 ^ i15) * (-15995)) ^ (-2043545904);
                        i9 = -512665907;
                    }
                    i24 = i7;
                    i18 = iM6982 ^ i9;
                    i17 = i8;
                    i19 = i6;
                    break;
                case -874216890:
                case 1344734927:
                    i6 = i19;
                    i7 = i24;
                    if (C1294.f4556 >= 0) {
                        iM6982 = C0630.m2566("ۢ֨") ^ i15;
                        i8 = ((iM6982 ^ i16) * (-19523)) ^ 1409104271;
                        i9 = -777695274;
                    } else {
                        iM6982 = (C0630.m2566("֡᩵") + i15) * 67;
                        i8 = ((iM6982 ^ i16) * 30609) ^ (-215220541);
                        i9 = 134087869;
                    }
                    i24 = i7;
                    i18 = iM6982 ^ i9;
                    i17 = i8;
                    i19 = i6;
                    break;
                case -760923594:
                case 339359961:
                    break;
                case -652111080:
                case 1349152975:
                    C3245.m9925();
                    C2958.m9034();
                    i6 = i19;
                    i7 = i24;
                    iM6982 = C0630.m2566("ۗ۬") ^ i16;
                    i8 = ((iM6982 ^ i15) * 16313) ^ (-671649176);
                    i9 = -1229604298;
                    i24 = i7;
                    i18 = iM6982 ^ i9;
                    i17 = i8;
                    i19 = i6;
                    break;
                case -622602896:
                case -325569837:
                    i6 = i19;
                    i7 = i24;
                    iM1484 = C0237.m1484(i, this.f74354);
                    iM7501 = C2272.m7501(i2, this.f74353);
                    if (iM1484 < iM7501) {
                        iM6982 = (i16 - C2105.m6981("ۧۧ")) * 11;
                        i8 = ((iM6982 ^ i15) * 8167) ^ 1068979213;
                        i9 = 897361111;
                        i24 = i7;
                        i18 = iM6982 ^ i9;
                        i17 = i8;
                        i19 = i6;
                    } else {
                        int iM2569 = (C0630.m2566("۫᩷") ^ i15) * 15;
                        i17 = ((iM2569 ^ i16) * (-21241)) ^ 1511578761;
                        i10 = iM2569 ^ 1810908101;
                        i24 = i7;
                        i18 = i10;
                        i19 = i6;
                    }
                    break;
                case -532292628:
                case 1842007506:
                    i6 = i19;
                    i7 = i24;
                    if (C1128.f4106 <= 0) {
                        iM6982 = C0630.m2566("ۗ۬") ^ i16;
                        i8 = ((iM6982 ^ i15) * 16313) ^ (-671649176);
                        i9 = -1229604298;
                    } else {
                        iM6982 = C2105.m6981("᩶ۚ") ^ i15;
                        i8 = ((iM6982 ^ i16) * (-7609)) ^ 1448681070;
                        i9 = -1660449655;
                    }
                    i24 = i7;
                    i18 = iM6982 ^ i9;
                    i17 = i8;
                    i19 = i6;
                    break;
                case -471460049:
                case 1861680628:
                    if ((((i20 ^ iM30740) >> 31) | 1) <= 0) {
                        iM2566 = C0630.m2566("ᩴۧ") ^ i16;
                        i12 = i24;
                        i13 = ((iM2566 ^ i15) * (-26049)) ^ 464003240;
                        i14 = -1816705058;
                        i11 = i12;
                        i18 = iM2566 ^ i14;
                        i17 = i13;
                        i24 = i11;
                    } else {
                        i22 = i21;
                        int iM6986 = (C2105.m6981("ᩴܺ") + i15) * (-41);
                        i17 = ((iM6986 ^ i16) * (-16209)) ^ (-896273755);
                        i18 = iM6986 ^ (-1270756005);
                    }
                    break;
                case 60510992:
                case 1720056453:
                    C21923.m49329();
                    break;
                case 136778554:
                case 1813944645:
                    i6 = i19;
                    i7 = i24;
                    if (C0798.m2998() != 0) {
                        iM6982 = C0630.m2566("ۗ۬") ^ i16;
                        i8 = ((iM6982 ^ i15) * 16313) ^ (-671649176);
                        i9 = -1229604298;
                    } else {
                        iM6982 = (C2105.m6981("᩶ܰ") ^ i16) * (-127);
                        i8 = ((iM6982 ^ i15) * (-31197)) ^ 87477600;
                        i9 = 1169459390;
                    }
                    i24 = i7;
                    i18 = iM6982 ^ i9;
                    i17 = i8;
                    i19 = i6;
                    break;
                case 370642841:
                case 1467248048:
                    int i28 = i19 - i;
                    C17513.m40911(i22, c12532.f37652, i28, bArr, i24 - i19);
                    C17513.m40910(i28, i24 - i, jArr);
                    break;
                case 820052136:
                case 1027384713:
                    i6 = i19;
                    i7 = i24;
                    if (C0714.m2805()) {
                        iM6982 = C0630.m2566("ᩴ᩵") ^ i16;
                        i8 = ((iM6982 ^ i15) * 645) ^ (-1437458298);
                        i9 = 1833256146;
                    } else {
                        iM6982 = (C2105.m6981("ۘۙ") + i15) * (-109);
                        i8 = ((iM6982 ^ i16) * 18445) ^ (-50872315);
                        i9 = 1792819900;
                    }
                    i24 = i7;
                    i18 = iM6982 ^ i9;
                    i17 = i8;
                    i19 = i6;
                    break;
                case 898891307:
                case 901198551:
                    if (C0237.m1481() >= 0) {
                        iM6981 = (C2105.m6981("ۚܶ") + i16) * 43;
                        i3 = i19;
                        i4 = ((iM6981 ^ i15) * 10629) ^ (-1456955629);
                        i5 = -630258538;
                        int i29 = i3;
                        i18 = iM6981 ^ i5;
                        i17 = i4;
                        i19 = i29;
                    } else {
                        i6 = i19;
                        i7 = i24;
                        iM6982 = C0630.m2566("ۗ۬") ^ i16;
                        i8 = ((iM6982 ^ i15) * 16313) ^ (-671649176);
                        i9 = -1229604298;
                        i24 = i7;
                        i18 = iM6982 ^ i9;
                        i17 = i8;
                        i19 = i6;
                    }
                    break;
                case 1257535028:
                case 1571002146:
                    i6 = i19;
                    i7 = i24;
                    if (C1504.f5354) {
                        iM6982 = (i15 - C0630.m2566("᩹ᩳ")) * 91;
                        i8 = ((iM6982 ^ i16) * 17231) ^ 1521029041;
                        i9 = -1108891434;
                    } else {
                        iM6982 = (C0630.m2566("֫ۚ") ^ i15) * (-81);
                        i8 = ((iM6982 ^ i16) * 397) ^ 822140496;
                        i9 = -1797243399;
                    }
                    i24 = i7;
                    i18 = iM6982 ^ i9;
                    i17 = i8;
                    i19 = i6;
                    break;
                default:
                    i19 = (int) (jM51303 >>> 32);
                    i24 = (int) jM51303;
                    c16807 = (C16807) abstractC11164;
                    if (C0630.m2564()) {
                        iM6981 = (C2105.m6981("ۚܶ") + i16) * 43;
                        i3 = i19;
                        i4 = ((iM6981 ^ i15) * 10629) ^ (-1456955629);
                        i5 = -630258538;
                    } else {
                        iM6981 = (C2105.m6981("ۘۛ") + i16) * (-123);
                        i3 = i19;
                        i4 = ((iM6981 ^ i15) * (-10251)) ^ 1287173619;
                        i5 = 768164374;
                    }
                    int i210 = i3;
                    i18 = iM6981 ^ i5;
                    i17 = i4;
                    i19 = i210;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x022e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0262 A[PHI: r0 r4
      0x0262: PHI (r0v6 int) = (r0v2 int), (r0v2 int), (r0v2 int), (r0v2 int), (r0v2 int), (r0v8 int) binds: [B:18:0x005c, B:70:0x0260, B:54:0x01a5, B:50:0x0187, B:46:0x0167, B:25:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r4v4 int) = (r4v1 int), (r4v1 int), (r4v1 int), (r4v1 int), (r4v1 int), (r4v5 int) binds: [B:18:0x005c, B:70:0x0260, B:54:0x01a5, B:50:0x0187, B:46:0x0167, B:25:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.InterfaceC22410
    /* JADX INFO: renamed from: ֫ */
    public final void mo32101(final int i, int i2, final long[] jArr) {
        int iM2566;
        int i3;
        int i4;
        int iM6981;
        int i5;
        int i6;
        long jM51303 = 0;
        int i7 = 0;
        int i8 = C0050.f910;
        int i9 = C0714.f2697;
        int iM6982 = C2105.m6981("֫᩹") ^ i8;
        int i10 = ((iM6982 ^ i9) * 30505) ^ (-1278523834);
        int i11 = iM6982 ^ 2056920189;
        int i12 = 0;
        int i13 = -1529789818;
        int iM1484 = 0;
        int iM3783 = 0;
        while (true) {
            i13 = ((((i13 ^ i9) * 13011) >> 31) & i10) ^ i11;
            switch (i13) {
                case -2043956614:
                case 43148492:
                    break;
                case -2042639592:
                case -1192673946:
                    if (C4263.m12819() >= 0) {
                        iM2566 = (C2105.m6981("ܿۙ") + i9) * 109;
                        i3 = ((iM2566 ^ i8) * (-3881)) ^ 1298178146;
                        i4 = -1853589186;
                    } else {
                        iM2566 = (i8 - C0630.m2566("۟ۡ")) * 35;
                        i3 = ((iM2566 ^ i9) * 25327) ^ (-499977963);
                        i4 = -1790776717;
                    }
                    i11 = iM2566 ^ i4;
                    i10 = i3;
                    break;
                case -1965787057:
                case 1306795449:
                    if (C3663.m11168() >= 0) {
                        iM2566 = (i8 - C0630.m2566("۬۫")) * (-107);
                        i3 = ((iM2566 ^ i9) * (-11409)) ^ 1227973754;
                        i4 = 1427089762;
                        i11 = iM2566 ^ i4;
                        i10 = i3;
                    } else {
                        int iM6983 = C2105.m6981("᩻ۨ") ^ i9;
                        i10 = ((iM6983 ^ i8) * 4859) ^ (-1668212708);
                        i11 = iM6983 ^ 1756907551;
                    }
                    break;
                case -1938378528:
                case -400760640:
                    if (C3683.f11629 >= 0) {
                        iM2566 = (C2105.m6981("ܿۙ") + i9) * 109;
                        i3 = ((iM2566 ^ i8) * (-3881)) ^ 1298178146;
                        i4 = -1853589186;
                    } else {
                        iM2566 = C2105.m6981("ܳܶ") ^ i8;
                        i3 = ((iM2566 ^ i9) * 24341) ^ (-1727019603);
                        i4 = -794639261;
                    }
                    i11 = iM2566 ^ i4;
                    i10 = i3;
                    break;
                case -1606908869:
                case 1896357520:
                    C21923.m49329();
                    if (!C1711.f5919) {
                        iM2566 = (C2105.m6981("ܿۙ") + i9) * 109;
                        i3 = ((iM2566 ^ i8) * (-3881)) ^ 1298178146;
                        i4 = -1853589186;
                        i11 = iM2566 ^ i4;
                        i10 = i3;
                    } else {
                        int iM6984 = C2105.m6981("᩻ۨ") ^ i9;
                        i10 = ((iM6984 ^ i8) * 4859) ^ (-1668212708);
                        i11 = iM6984 ^ 1756907551;
                    }
                    break;
                case -1424668007:
                case 1777569738:
                    jM51303 = m51303(iM1484, iM3783);
                    if (jM51303 != -1) {
                        iM6981 = C0630.m2566("ۤ᩵") ^ i9;
                        i5 = ((iM6981 ^ i8) * 9805) ^ (-2131134149);
                        i6 = 1523245283;
                    } else {
                        iM6981 = (C0630.m2566("ۙۚ") ^ i8) * 73;
                        i5 = ((iM6981 ^ i9) * 25915) ^ 1721185521;
                        i6 = 2010471279;
                    }
                    i11 = iM6981 ^ i6;
                    i10 = i5;
                    break;
                case -1151370628:
                case 1375793236:
                    if (RunnableC1937.m6387() != 0) {
                        iM2566 = (i8 - C0630.m2566("۬۫")) * (-107);
                        i3 = ((iM2566 ^ i9) * (-11409)) ^ 1227973754;
                        i4 = 1427089762;
                    } else {
                        iM2566 = (i9 - C2105.m6981("۠۫")) * (-77);
                        i3 = ((iM2566 ^ i8) * (-20017)) ^ (-2002726140);
                        i4 = -262193949;
                    }
                    i11 = iM2566 ^ i4;
                    i10 = i3;
                    break;
                case -1037539211:
                case 498482626:
                    if (C1128.f4106 <= 0) {
                        iM2566 = C0630.m2566("ۡۨ") ^ i8;
                        i3 = ((iM2566 ^ i9) * (-29671)) ^ 481337506;
                        i4 = 1553810775;
                    } else {
                        iM2566 = (C0630.m2566("᩵ܽ") ^ i8) * 45;
                        i3 = ((iM2566 ^ i9) * (-4169)) ^ 1003736630;
                        i4 = 277854559;
                    }
                    i11 = iM2566 ^ i4;
                    i10 = i3;
                    break;
                case -914104743:
                case 2089865045:
                    int iM30740 = this.f74355.m30740();
                    if (!C0630.m2564()) {
                        final int i14 = iM1484;
                        final int i15 = iM3783;
                        this.f74356.m27689(iM1484, iM3783, iM30740, new InterfaceC21705() { // from class: l.ۨܽܳ
                            @Override // l.InterfaceC21705
                            /* JADX INFO: renamed from: ֫ */
                            public final void mo4084(int i16, int i17) {
                                C23115.m51302(this.f35281, i14, i15, jArr, i, i17);
                            }
                        });
                    } else {
                        iM2566 = (C2105.m6981("᩸ᩳ") + i9) * (-49);
                        i3 = ((iM2566 ^ i8) * 12615) ^ (-1387261885);
                        i4 = -1881276463;
                        i11 = iM2566 ^ i4;
                        i10 = i3;
                    }
                    break;
                case -729478417:
                case 622631311:
                    i7 = (int) (jM51303 >>> 32);
                    i12 = (int) jM51303;
                    if (C0237.f1507 == 0) {
                        iM6981 = (C2105.m6981("ۜᩴ") ^ i8) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((iM6981 ^ i9) * (-26999)) ^ (-873942801);
                        i6 = -951464238;
                        i11 = iM6981 ^ i6;
                        i10 = i5;
                    } else {
                        iM2566 = (C2105.m6981("ܿۙ") + i9) * 109;
                        i3 = ((iM2566 ^ i8) * (-3881)) ^ 1298178146;
                        i4 = -1853589186;
                        i11 = iM2566 ^ i4;
                        i10 = i3;
                    }
                    break;
                case -625893605:
                case 51713740:
                    if (C4616.m13552() != 0) {
                        iM2566 = (C2105.m6981("᩸ᩳ") + i9) * (-49);
                        i3 = ((iM2566 ^ i8) * 12615) ^ (-1387261885);
                        i4 = -1881276463;
                    } else {
                        iM2566 = (i9 - C0630.m2566("۫ܺ")) * 49;
                        i3 = ((iM2566 ^ i8) * 30677) ^ 1308377858;
                        i4 = 985702382;
                    }
                    i11 = iM2566 ^ i4;
                    i10 = i3;
                    break;
                case -420189745:
                case 1788092458:
                    C0964.m3413();
                    break;
                case 12546616:
                case 2042301816:
                    if (C0483.f2088 >= 0) {
                        iM2566 = (C2105.m6981("ܿۙ") + i9) * 109;
                        i3 = ((iM2566 ^ i8) * (-3881)) ^ 1298178146;
                        i4 = -1853589186;
                    } else {
                        iM2566 = C0630.m2566("۫ܶ") ^ i9;
                        i3 = ((iM2566 ^ i8) * (-26353)) ^ 1506630131;
                        i4 = 1716725622;
                    }
                    i11 = iM2566 ^ i4;
                    i10 = i3;
                    break;
                case 104402656:
                case 1509000587:
                    iM1484 = C0237.m1484(i, this.f74354);
                    iM3783 = RunnableC1108.m3783(i2, this.f74353);
                    if (iM1484 >= iM3783) {
                        iM2566 = C2105.m6981("ܺ᩶") ^ i9;
                        i3 = ((iM2566 ^ i8) * 30831) ^ 2117510016;
                        i4 = -1931639635;
                    } else {
                        iM2566 = (C2105.m6981("ᩴܿ") ^ i8) * (-35);
                        i3 = ((iM2566 ^ i9) * 24955) ^ 1455891388;
                        i4 = -564296551;
                    }
                    i11 = iM2566 ^ i4;
                    i10 = i3;
                    break;
                case 160748661:
                case 2103616535:
                    RunnableC0588.m2441();
                    int iM6985 = C2105.m6981("᩻ۨ") ^ i9;
                    i10 = ((iM6985 ^ i8) * 4859) ^ (-1668212708);
                    i11 = iM6985 ^ 1756907551;
                    break;
                case 419797095:
                case 523639592:
                    if (C4263.f13799 <= 0) {
                        iM2566 = (C2105.m6981("᩸ᩳ") + i9) * (-49);
                        i3 = ((iM2566 ^ i8) * 12615) ^ (-1387261885);
                        i4 = -1881276463;
                    } else {
                        iM2566 = (C0630.m2566("ܰ᩻") + i9) * 47;
                        i3 = ((iM2566 ^ i8) * 21955) ^ (-884621551);
                        i4 = 1924358220;
                    }
                    i11 = iM2566 ^ i4;
                    i10 = i3;
                    break;
                case 601874111:
                case 738672459:
                    if (C4263.m12819() >= 0) {
                        iM2566 = (C2105.m6981("ܿۙ") + i9) * 109;
                        i3 = ((iM2566 ^ i8) * (-3881)) ^ 1298178146;
                        i4 = -1853589186;
                    } else {
                        iM2566 = (C2105.m6981("ۘۡ") ^ i8) * 91;
                        i3 = ((iM2566 ^ i9) * 29859) ^ 1708474614;
                        i4 = -839356486;
                    }
                    i11 = iM2566 ^ i4;
                    i10 = i3;
                    break;
                case 844561630:
                case 1607115115:
                    if (C0714.f2697 < 0) {
                        iM2566 = C0630.m2566("ۡۨ") ^ i8;
                        i3 = ((iM2566 ^ i9) * (-29671)) ^ 481337506;
                        i4 = 1553810775;
                        i11 = iM2566 ^ i4;
                        i10 = i3;
                    } else {
                        int iM6986 = C2105.m6981("᩻ۨ") ^ i9;
                        i10 = ((iM6986 ^ i8) * 4859) ^ (-1668212708);
                        i11 = iM6986 ^ 1756907551;
                    }
                    break;
                default:
                    C17513.m40910(i7 - i, i12 - i, jArr);
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0264 A[PHI: r5 r6 r7 r9 r17
      0x0264: PHI (r5v5 int) = (r5v4 int), (r5v2 int), (r5v2 int), (r5v2 int) binds: [B:42:0x0133, B:75:0x0262, B:71:0x0248, B:62:0x01f8] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r6v5 l.ۧᩳܳ) = (r6v4 l.ۧᩳܳ), (r6v2 l.ۧᩳܳ), (r6v2 l.ۧᩳܳ), (r6v2 l.ۧᩳܳ) binds: [B:42:0x0133, B:75:0x0262, B:71:0x0248, B:62:0x01f8] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r7v4 long) = (r7v2 long), (r7v1 long), (r7v1 long), (r7v1 long) binds: [B:42:0x0133, B:75:0x0262, B:71:0x0248, B:62:0x01f8] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r9v4 long) = (r9v2 long), (r9v1 long), (r9v1 long), (r9v1 long) binds: [B:42:0x0133, B:75:0x0262, B:71:0x0248, B:62:0x01f8] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r17v17 int) = (r17v6 int), (r17v14 int), (r17v15 int), (r17v20 int) binds: [B:42:0x0133, B:75:0x0262, B:71:0x0248, B:62:0x01f8] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.InterfaceC22410
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo32105(int i, int i2) {
        int iM2566;
        int i3;
        int i4;
        int i5;
        int iM6981;
        int i6;
        int i7;
        C23115 c23115 = this;
        int i8 = C3746.f11829;
        int i9 = RunnableC1937.f6483;
        int iM2567 = C0630.m2566("ۤ᩶") ^ i9;
        int i10 = ((iM2567 ^ i8) * (-10683)) ^ 746779990;
        long j = 0;
        int i11 = iM2567 ^ 130095642;
        int iM1484 = 0;
        int iM3783 = 0;
        int i12 = 0;
        int i13 = 139191361;
        int i14 = 0;
        long j2 = 0;
        long j3 = 0;
        AbstractC11164 abstractC11164 = null;
        int iM30740 = 0;
        while (true) {
            i13 = i11 ^ (i10 & (((i13 ^ i8) * (-20415)) >> 31));
            switch (i13) {
                case -2137292869:
                case 1831659234:
                    if (j <= -2147483648L) {
                        iM2566 = (C0630.m2566("ۙܺ") ^ i8) * (-15);
                        i3 = ((iM2566 ^ i9) * 11763) ^ (-741535397);
                        i4 = -1337497902;
                    } else {
                        iM2566 = (i9 - C2105.m6981("ۧۘ")) * 77;
                        i3 = ((iM2566 ^ i8) * 4711) ^ 956162874;
                        i4 = 1694934294;
                    }
                    i11 = iM2566 ^ i4;
                    i10 = i3;
                    break;
                case -2076110381:
                case 34423305:
                    i12 = (int) j;
                    iM2566 = C0630.m2566("۬ܰ") ^ i9;
                    i3 = ((iM2566 ^ i8) * 14437) ^ 916161325;
                    i4 = 1430653471;
                    i11 = iM2566 ^ i4;
                    i10 = i3;
                    break;
                case -2037091145:
                case -1986423978:
                    AbstractC2021.m6565(abstractC11164);
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        iM2566 = (i9 - C0630.m2566("ܳ۠")) * 73;
                        i3 = ((iM2566 ^ i8) * (-30497)) ^ (-911317103);
                        i4 = 1348787051;
                        i11 = iM2566 ^ i4;
                        i10 = i3;
                    } else {
                        int iM2568 = (i8 - C0630.m2566("۠᩹")) * (-103);
                        i10 = ((iM2568 ^ i9) * (-6245)) ^ 1955402140;
                        i11 = iM2568 ^ 1809059623;
                        c23115 = this;
                    }
                    break;
                case -2013655904:
                case 37546117:
                    i5 = i14;
                    if (C0050.f910 < 0) {
                        iM6981 = C0630.m2566("ۨۧ") ^ i8;
                        i10 = ((iM6981 ^ i9) * 5117) ^ 1914406750;
                        i6 = 1187311722;
                        i14 = i5;
                        i11 = iM6981 ^ i6;
                        c23115 = this;
                    } else {
                        i14 = i5;
                        int iM2569 = (i8 - C0630.m2566("۠᩹")) * (-103);
                        i10 = ((iM2569 ^ i9) * (-6245)) ^ 1955402140;
                        i11 = iM2569 ^ 1809059623;
                        c23115 = this;
                    }
                    break;
                case -1948597273:
                case 1225210870:
                    i12 = Integer.MIN_VALUE;
                    iM2566 = C0630.m2566("۬ܰ") ^ i9;
                    i3 = ((iM2566 ^ i8) * 14437) ^ 916161325;
                    i4 = 1430653471;
                    i11 = iM2566 ^ i4;
                    i10 = i3;
                    break;
                case -1941062674:
                case -470802921:
                    i5 = i14;
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = C2105.m6981("ۡۧ") ^ i9;
                        i10 = ((iM6981 ^ i8) * (-14683)) ^ 1518352275;
                        i6 = -1646197388;
                    } else {
                        iM6981 = C2105.m6981("ܿۜ") ^ i9;
                        i10 = ((iM6981 ^ i8) * (-30649)) ^ (-1535208690);
                        i6 = -1881423264;
                    }
                    i14 = i5;
                    i11 = iM6981 ^ i6;
                    c23115 = this;
                    break;
                case -1776143070:
                case -1223459611:
                    i5 = i14;
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = (C2105.m6981("᩻ᩳ") + i8) * 71;
                        i10 = ((iM6981 ^ i9) * 20443) ^ (-2009528946);
                        i6 = -848242600;
                    } else {
                        iM6981 = C0630.m2566("ܿۤ") ^ i8;
                        i10 = ((iM6981 ^ i9) * 25431) ^ (-235576609);
                        i6 = -2060865161;
                    }
                    i14 = i5;
                    i11 = iM6981 ^ i6;
                    c23115 = this;
                    break;
                case -1775781785:
                case 507050551:
                    i5 = i14;
                    if (C0798.f2919) {
                        iM6981 = C2105.m6981("ۡۧ") ^ i9;
                        i10 = ((iM6981 ^ i8) * (-14683)) ^ 1518352275;
                        i6 = -1646197388;
                    } else {
                        iM6981 = C0630.m2566("ۡۜ") ^ i9;
                        i10 = ((iM6981 ^ i8) * (-12863)) ^ 1074858737;
                        i6 = -1814041676;
                    }
                    i14 = i5;
                    i11 = iM6981 ^ i6;
                    c23115 = this;
                    break;
                case -1330533933:
                case 608918440:
                    return false;
                case -1206970997:
                case -995817231:
                    if (abstractC11164.mo21889(i12, iM3783) == 0) {
                        i7 = i14;
                        int iM6982 = C2105.m6981("֡᩶") ^ i8;
                        int i15 = i7;
                        i3 = ((iM6982 ^ i9) * (-32369)) ^ (-1331193571);
                        i14 = i15;
                        i11 = iM6982 ^ (-697816637);
                        i10 = i3;
                    } else {
                        iM2566 = C0630.m2566("۟۬") ^ i8;
                        i3 = ((iM2566 ^ i9) * (-2605)) ^ (-1245853769);
                        i4 = -1753302821;
                        i11 = iM2566 ^ i4;
                        i10 = i3;
                    }
                    break;
                case -1067149028:
                case 1615606386:
                    iM30740 = c23115.f74355.m30740();
                    abstractC11164 = c23115.f74356;
                    if (!C1504.f5354) {
                        iM2566 = C0630.m2566("۠۠") ^ i8;
                        i3 = ((iM2566 ^ i9) * 2909) ^ 1583515858;
                        i4 = -531767214;
                        i11 = iM2566 ^ i4;
                        i10 = i3;
                    } else {
                        i5 = i14;
                        iM6981 = C2105.m6981("ۡۧ") ^ i9;
                        i10 = ((iM6981 ^ i8) * (-14683)) ^ 1518352275;
                        i6 = -1646197388;
                        i14 = i5;
                        i11 = iM6981 ^ i6;
                        c23115 = this;
                    }
                    break;
                case -986049754:
                case -186262488:
                    if (C0237.f1507 == 0) {
                        int iM25610 = (i8 - C0630.m2566("۠᩹")) * (-103);
                        i10 = ((iM25610 ^ i9) * (-6245)) ^ 1955402140;
                        i11 = iM25610 ^ 1809059623;
                        c23115 = this;
                    } else {
                        iM2566 = C0630.m2566("᩵ᩴ") ^ i9;
                        i3 = ((iM2566 ^ i8) * (-1655)) ^ (-667868603);
                        i4 = -889918078;
                        i11 = iM2566 ^ i4;
                        i10 = i3;
                    }
                    break;
                case -908209618:
                case 1449500639:
                    j3 = iM1484;
                    j2 = iM30740;
                    if (!C0382.f1805) {
                        i5 = i14;
                        iM6981 = C2105.m6981("ۡۧ") ^ i9;
                        i10 = ((iM6981 ^ i8) * (-14683)) ^ 1518352275;
                        i6 = -1646197388;
                        i14 = i5;
                        i11 = iM6981 ^ i6;
                        c23115 = this;
                    } else {
                        iM2566 = C2105.m6981("ܶۙ") ^ i9;
                        i3 = ((iM2566 ^ i8) * (-21497)) ^ (-2042093495);
                        i4 = 1904808418;
                        i11 = iM2566 ^ i4;
                        i10 = i3;
                    }
                    break;
                case -825347034:
                case 1247731891:
                    if (C22628.f73083 <= 0) {
                        iM2566 = C0630.m2566("᩵ᩴ") ^ i9;
                        i3 = ((iM2566 ^ i8) * (-1655)) ^ (-667868603);
                        i4 = -889918078;
                    } else {
                        iM2566 = C2105.m6981("۬᩶") ^ i9;
                        i3 = ((iM2566 ^ i8) * (-6805)) ^ 491643481;
                        i4 = 1423523078;
                    }
                    i11 = iM2566 ^ i4;
                    i10 = i3;
                    break;
                case -529913685:
                case -210853034:
                    j = 1 + (j3 - j2);
                    if (!C0798.f2919) {
                        iM2566 = (C0630.m2566("۠ۙ") + i8) * (-59);
                        i3 = ((iM2566 ^ i9) * 1079) ^ (-1084418435);
                        i4 = -886898835;
                        i11 = iM2566 ^ i4;
                        i10 = i3;
                    } else {
                        i5 = i14;
                        iM6981 = (C2105.m6981("᩻ᩳ") + i8) * 71;
                        i10 = ((iM6981 ^ i9) * 20443) ^ (-2009528946);
                        i6 = -848242600;
                        i14 = i5;
                        i11 = iM6981 ^ i6;
                        c23115 = this;
                    }
                    break;
                case -240702509:
                case 131966562:
                    return true;
                case -182444725:
                case 1374715829:
                    C3663.m11168();
                    C2958.m9034();
                    iM2566 = C0630.m2566("᩵ᩴ") ^ i9;
                    i3 = ((iM2566 ^ i8) * (-1655)) ^ (-667868603);
                    i4 = -889918078;
                    i11 = iM2566 ^ i4;
                    i10 = i3;
                    break;
                case -97108642:
                case 538797168:
                    i5 = i14;
                    if (C2167.f7158 >= 0) {
                        iM6981 = C2105.m6981("ۡۧ") ^ i9;
                        i10 = ((iM6981 ^ i8) * (-14683)) ^ 1518352275;
                        i6 = -1646197388;
                    } else {
                        iM6981 = C2105.m6981("ۘ᩶") ^ i9;
                        i10 = ((iM6981 ^ i8) * (-25863)) ^ 1341012237;
                        i6 = 802922187;
                    }
                    i14 = i5;
                    i11 = iM6981 ^ i6;
                    c23115 = this;
                    break;
                case 201459320:
                case 1977750214:
                    if (C3019.f9544 < 0) {
                        i5 = i14;
                        iM6981 = (C2105.m6981("᩻ᩳ") + i8) * 71;
                        i10 = ((iM6981 ^ i9) * 20443) ^ (-2009528946);
                        i6 = -848242600;
                        i14 = i5;
                        i11 = iM6981 ^ i6;
                        c23115 = this;
                    } else {
                        iM2566 = C0630.m2566("᩵ᩴ") ^ i9;
                        i3 = ((iM2566 ^ i8) * (-1655)) ^ (-667868603);
                        i4 = -889918078;
                        i11 = iM2566 ^ i4;
                        i10 = i3;
                    }
                    break;
                case 975259042:
                case 1528069175:
                    C22628.m50615();
                    return false;
                case 999610426:
                case 1866977504:
                    i7 = i14;
                    iM1484 = C0237.m1484(i, i7);
                    iM3783 = RunnableC1108.m3783(i2, c23115.f74353);
                    if (iM1484 < iM3783) {
                        int iM25611 = C0630.m2566("᩶ۙ") ^ i9;
                        i10 = ((iM25611 ^ i8) * (-6643)) ^ 309683346;
                        i11 = iM25611 ^ 1367637269;
                        i14 = i7;
                    } else {
                        int iM6983 = C2105.m6981("֡᩶") ^ i8;
                        int i16 = i7;
                        i3 = ((iM6983 ^ i9) * (-32369)) ^ (-1331193571);
                        i14 = i16;
                        i11 = iM6983 ^ (-697816637);
                        i10 = i3;
                    }
                    break;
                default:
                    int i17 = c23115.f74354;
                    if (C0630.m2564()) {
                        i14 = i17;
                        int iM25612 = (i8 - C0630.m2566("۠᩹")) * (-103);
                        i10 = ((iM25612 ^ i9) * (-6245)) ^ 1955402140;
                        i11 = iM25612 ^ 1809059623;
                    } else {
                        int iM25613 = C0630.m2566("۟ܽ") ^ i8;
                        i11 = iM25613 ^ 1565347041;
                        i14 = i17;
                        i10 = ((iM25613 ^ i9) * (-13561)) ^ (-468965811);
                    }
                    c23115 = this;
                    break;
            }
        }
    }

    @Override // l.InterfaceC22410
    /* JADX INFO: renamed from: ֫ */
    public final long mo32100() {
        return this.f74356.mo21890();
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0498 A[PHI: r21 r35 r36
      0x0498: PHI (r21v27 int) = (r21v4 int), (r21v5 int), (r21v28 int) binds: [B:113:0x0496, B:109:0x0473, B:18:0x00c3] A[DONT_GENERATE, DONT_INLINE]
      0x0498: PHI (r35v74 int) = (r35v50 int), (r35v51 int), (r35v75 int) binds: [B:113:0x0496, B:109:0x0473, B:18:0x00c3] A[DONT_GENERATE, DONT_INLINE]
      0x0498: PHI (r36v19 int) = (r36v2 int), (r36v3 int), (r36v20 int) binds: [B:113:0x0496, B:109:0x0473, B:18:0x00c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c1, code lost:
    
        if (l.C1047.f3863 >= 0) goto L18;
     */
    @Override // l.InterfaceC22410
    /* JADX INFO: renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo32107(int i, int i2) {
        int iM6981;
        int i3;
        int i4;
        int iM11932;
        int i5;
        int i6;
        int i7;
        int i8;
        int iM6982;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = C1294.f4556;
        int i14 = C4075.f12947;
        int iM6983 = C2105.m6981("᩶۠") ^ i13;
        int i15 = ((iM6983 ^ i14) * 30949) ^ 1624092528;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i16 = iM6983 ^ (-1450461339);
        int i17 = 0;
        int iMo21889 = 0;
        int i18 = 0;
        int i19 = 623732572;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        C12532 c12532 = null;
        long j7 = 0;
        long j8 = 0;
        int iM7501 = 0;
        AbstractC11164 abstractC11164 = null;
        long j9 = 0;
        int iM30740 = 0;
        long j10 = 0;
        long j11 = 0;
        int i20 = 0;
        while (true) {
            i19 = i16 ^ ((((i19 ^ i14) * (-14429)) >> 31) & i15);
            switch (i19) {
                case -2087830904:
                case 1773144340:
                    if (C4616.f14690 > 0) {
                        iM6981 = C0630.m2566("᩷᩻") ^ i14;
                        i15 = ((iM6981 ^ i13) * 23443) ^ 207956524;
                        i3 = -900097882;
                        i16 = iM6981 ^ i3;
                    } else {
                        i11 = i20;
                        i5 = i17;
                        int iM2566 = (C0630.m2566("֫ۘ") + i14) * (-13);
                        i12 = ((iM2566 ^ i13) * 719) ^ 1197993579;
                        i16 = iM2566 ^ (-1082578510);
                        i15 = i12;
                        i17 = i5;
                        i20 = i11;
                    }
                    break;
                case -1870288680:
                case 358541121:
                    return (((long) iMo21889) * j5) + j2;
                case -1829793015:
                case 109066852:
                    i6 = iM7501;
                    i7 = i20;
                    i8 = i17;
                    if (C1005.f3721) {
                        iM6982 = (i14 - C2105.m6981("᩺ۘ")) * (-115);
                        i15 = ((iM6982 ^ i13) * (-4157)) ^ 735195834;
                        i9 = 432778524;
                    } else {
                        iM6982 = C2105.m6981("ۧۤ") ^ i14;
                        i15 = ((iM6982 ^ i13) * 695) ^ 2042172874;
                        i9 = -1461945087;
                    }
                    i10 = iM6982 ^ i9;
                    i17 = i8;
                    iM7501 = i6;
                    i20 = i7;
                    i16 = i10;
                    break;
                case -1783534085:
                case -1311031042:
                    RunnableC1937.m6387();
                    if (!C0382.f1805) {
                        i6 = iM7501;
                        i7 = i20;
                        i8 = i17;
                        iM6982 = C2105.m6981("ۧۤ") ^ i14;
                        i15 = ((iM6982 ^ i13) * 695) ^ 2042172874;
                        i9 = -1461945087;
                        i10 = iM6982 ^ i9;
                        i17 = i8;
                        iM7501 = i6;
                        i20 = i7;
                        i16 = i10;
                    } else {
                        i11 = i20;
                        i5 = i17;
                        int iM2567 = (C0630.m2566("֫ۘ") + i14) * (-13);
                        i12 = ((iM2567 ^ i13) * 719) ^ 1197993579;
                        i16 = iM2567 ^ (-1082578510);
                        i15 = i12;
                        i17 = i5;
                        i20 = i11;
                    }
                    break;
                case -1757198662:
                case 1843769158:
                    return j9;
                case -1732369436:
                case -61804534:
                    return abstractC11164.mo21890();
                case -1727380904:
                case -473693851:
                    return Math.max(j9, j3 + 64);
                case -1700934612:
                case 545763332:
                    C1005.m3501();
                    i11 = i20;
                    i5 = i17;
                    int iM2568 = (C0630.m2566("֫ۘ") + i14) * (-13);
                    i12 = ((iM2568 ^ i13) * 719) ^ 1197993579;
                    i16 = iM2568 ^ (-1082578510);
                    i15 = i12;
                    i17 = i5;
                    i20 = i11;
                    break;
                case -1643373162:
                case -455256025:
                    j11 = ((long) iMo21889) * j5;
                    j9 = j11 + j2;
                    if (iMo21889 <= i17) {
                        iM6981 = (C2105.m6981("ۛۤ") + i13) * 43;
                        i15 = ((iM6981 ^ i14) * 1307) ^ 177374096;
                        i3 = 192863386;
                    } else {
                        iM6981 = C0630.m2566("۟ۙ") ^ i13;
                        i15 = ((iM6981 ^ i14) * 177) ^ (-630889764);
                        i3 = 1347732614;
                    }
                    i16 = iM6981 ^ i3;
                    break;
                case -1641616917:
                case 1489980282:
                    j3 = j6 * j8;
                    if (C0483.f2088 < 0) {
                        iM6981 = C2105.m6981("ۗܿ") ^ i14;
                        i15 = ((iM6981 ^ i13) * 1409) ^ 139444742;
                        i3 = 290556104;
                        i16 = iM6981 ^ i3;
                    } else {
                        i4 = iM7501;
                        iM11932 = i20;
                        i5 = i17;
                        int iM2569 = (C0630.m2566("ۨ᩹") + i14) * (-17);
                        i17 = i5;
                        i20 = iM11932;
                        i15 = ((iM2569 ^ i13) * (-21381)) ^ (-1620248762);
                        int i21 = i4;
                        i16 = iM2569 ^ (-537032970);
                        iM7501 = i21;
                    }
                    break;
                case -1564434327:
                case 1604504840:
                    i18 = (int) j;
                    iM6981 = C0630.m2566("ۨܶ") ^ i14;
                    i15 = ((iM6981 ^ i13) * (-16071)) ^ (-1536548112);
                    i3 = 1532548370;
                    i16 = iM6981 ^ i3;
                    break;
                case -1528900997:
                case -911281856:
                    if (iMo21889 <= i17) {
                        iM6981 = (C0630.m2566("ۘ᩻") ^ i13) * (-103);
                        i15 = ((iM6981 ^ i14) * 7001) ^ (-2020890093);
                        i3 = -1035430166;
                    } else {
                        iM6981 = C2105.m6981("۟ܰ") ^ i14;
                        i15 = ((iM6981 ^ i13) * (-10821)) ^ (-1448209612);
                        i3 = -155977101;
                    }
                    i16 = iM6981 ^ i3;
                    break;
                case -1485659707:
                case -567098935:
                    i6 = iM7501;
                    i7 = i20;
                    i8 = i17;
                    if (C1420.m4913()) {
                        iM6982 = C0630.m2566("۠ۡ") ^ i13;
                        i15 = ((iM6982 ^ i14) * 28131) ^ 1319558291;
                        i9 = 517155540;
                    } else {
                        iM6982 = C0630.m2566("᩻᩸") ^ i14;
                        i15 = ((iM6982 ^ i13) * 30277) ^ (-1366843211);
                        i9 = -2053083170;
                    }
                    i10 = iM6982 ^ i9;
                    i17 = i8;
                    iM7501 = i6;
                    i20 = i7;
                    i16 = i10;
                    break;
                case -1406141587:
                case -430597046:
                    C3432.m10477();
                    return 0L;
                case -1279097267:
                case 1858099245:
                    return j2;
                case -1273034977:
                case -650023186:
                    i6 = iM7501;
                    i7 = i20;
                    i8 = i17;
                    if (C1711.f5919) {
                        iM6982 = C2105.m6981("ۧۤ") ^ i14;
                        i15 = ((iM6982 ^ i13) * 695) ^ 2042172874;
                        i9 = -1461945087;
                    } else {
                        iM6982 = (C2105.m6981("᩺ۜ") + i13) * (-121);
                        i15 = ((iM6982 ^ i14) * (-28887)) ^ (-1317622985);
                        i9 = -467134498;
                    }
                    i10 = iM6982 ^ i9;
                    i17 = i8;
                    iM7501 = i6;
                    i20 = i7;
                    i16 = i10;
                    break;
                case -817232566:
                case 455327839:
                    i11 = i20;
                    i5 = i17;
                    iM7501 = C2272.m7501(i2, this.f74353);
                    C12532 c12533 = this.f74355;
                    if (C21923.f70183 != 0) {
                        c12532 = c12533;
                        int iM25610 = (C0630.m2566("֫ۘ") + i14) * (-13);
                        i12 = ((iM25610 ^ i13) * 719) ^ 1197993579;
                        i16 = iM25610 ^ (-1082578510);
                        i15 = i12;
                    } else {
                        int iM25611 = C0630.m2566("ۛ᩸") ^ i14;
                        c12532 = c12533;
                        i15 = ((iM25611 ^ i13) * 22511) ^ 65905823;
                        i16 = iM25611 ^ (-2133057065);
                    }
                    i17 = i5;
                    i20 = i11;
                    break;
                case -754771580:
                case 1091103329:
                    iMo21889 = abstractC11164.mo21889(i18, iM7501);
                    if (iMo21889 == 0) {
                        iM6981 = C0630.m2566("ۢܰ") ^ i13;
                        i15 = ((iM6981 ^ i14) * 8067) ^ (-1870091103);
                        i3 = -380788098;
                    } else {
                        iM6981 = C0630.m2566("֨֨") ^ i13;
                        i15 = ((iM6981 ^ i14) * (-8917)) ^ 788435839;
                        i3 = -1533462771;
                    }
                    i16 = iM6981 ^ i3;
                    break;
                case -640883545:
                case 1364974249:
                    abstractC11164 = this.f74356;
                    RunnableC3474.m10618(abstractC11164);
                    i4 = iM7501;
                    iM11932 = i20;
                    i5 = i17;
                    long j12 = iM11932;
                    if (C3683.f11629 >= 0) {
                        j10 = j12;
                        int iM25612 = (C0630.m2566("ۨ᩹") + i14) * (-17);
                        i17 = i5;
                        i20 = iM11932;
                        i15 = ((iM25612 ^ i13) * (-21381)) ^ (-1620248762);
                        int i22 = i4;
                        i16 = iM25612 ^ (-537032970);
                        iM7501 = i22;
                    } else {
                        int iM6984 = C2105.m6981("ܺ۫") ^ i13;
                        i15 = ((iM6984 ^ i14) * (-18103)) ^ 334111327;
                        i17 = i5;
                        iM7501 = i4;
                        i20 = iM11932;
                        i16 = iM6984 ^ (-599783533);
                        j10 = j12;
                    }
                    break;
                case -520240563:
                case 1390397460:
                    j5 = 4;
                    j2 = 48;
                    if (abstractC11164 instanceof C16807) {
                        iM6981 = (C2105.m6981("ܶۘ") + i13) * (-17);
                        i15 = ((iM6981 ^ i14) * 32135) ^ 170864829;
                        i3 = 1852151226;
                    } else {
                        iM6981 = C0630.m2566("ᩴᩳ") ^ i13;
                        i15 = ((iM6981 ^ i14) * 19661) ^ (-1465513890);
                        i3 = -973018536;
                    }
                    i16 = iM6981 ^ i3;
                    break;
                case -445220393:
                case 189196249:
                    j4 = 1;
                    j = j7 + 1;
                    if (j <= -2147483648L) {
                        iM6981 = (C0630.m2566("۟ܽ") ^ i14) * (-105);
                        i15 = ((iM6981 ^ i13) * 4089) ^ (-1547024831);
                        i3 = 1330378438;
                    } else {
                        iM6981 = (C0630.m2566("ۧᩴ") ^ i13) * 69;
                        i15 = ((iM6981 ^ i14) * 9263) ^ (-570473093);
                        i3 = -1879420745;
                    }
                    i16 = iM6981 ^ i3;
                    break;
                case -312395891:
                case 1178978523:
                    return 0L;
                case -297277805:
                case 773738993:
                    C0050.m940();
                    if (!C1420.m4913()) {
                        i11 = i20;
                        i5 = i17;
                        int iM25613 = (C0630.m2566("֫ۘ") + i14) * (-13);
                        i12 = ((iM25613 ^ i13) * 719) ^ 1197993579;
                        i16 = iM25613 ^ (-1082578510);
                        i15 = i12;
                        i17 = i5;
                        i20 = i11;
                    } else {
                        iM6981 = (C2105.m6981("ۘܺ") ^ i13) * (-45);
                        i15 = ((iM6981 ^ i14) * (-2803)) ^ 1775536587;
                        i3 = 1379189567;
                        i16 = iM6981 ^ i3;
                    }
                    break;
                case 143122162:
                case 268340351:
                    i4 = iM7501;
                    i11 = i20;
                    i5 = i17;
                    iM30740 = c12532.m30740();
                    if (C1128.f4106 > 0) {
                        int iM6985 = C2105.m6981("۠֫") ^ i13;
                        i12 = ((iM6985 ^ i14) * (-21487)) ^ (-1075589450);
                        iM7501 = i4;
                        i16 = iM6985 ^ (-28068279);
                        i15 = i12;
                        i17 = i5;
                        i20 = i11;
                    } else {
                        iM11932 = i11;
                        int iM25614 = (C0630.m2566("ۨ᩹") + i14) * (-17);
                        i17 = i5;
                        i20 = iM11932;
                        i15 = ((iM25614 ^ i13) * (-21381)) ^ (-1620248762);
                        int i23 = i4;
                        i16 = iM25614 ^ (-537032970);
                        iM7501 = i23;
                    }
                    break;
                case 194065446:
                case 439571080:
                    if (iMo21889 == abstractC11164.mo21898()) {
                        iM6981 = C2105.m6981("ܶ᩵") ^ i14;
                        i15 = ((iM6981 ^ i13) * 27181) ^ 175526898;
                        i3 = 1946884141;
                    } else {
                        iM6981 = C2105.m6981("֡ܺ") ^ i14;
                        i15 = ((iM6981 ^ i13) * 24535) ^ 1756354687;
                        i3 = 1755735596;
                    }
                    i16 = iM6981 ^ i3;
                    break;
                case 234369371:
                case 1198619400:
                    i5 = i17;
                    i4 = iM7501;
                    iM11932 = C3911.m11932(i, this.f74354);
                    if (C4117.f13076 > 0) {
                        int iM6986 = (i13 - C2105.m6981("֡ܽ")) * (-95);
                        int i24 = ((iM6986 ^ i14) * (-4849)) ^ 180432972;
                        i10 = iM6986 ^ (-1018309755);
                        i17 = i5;
                        i20 = iM11932;
                        i15 = i24;
                        iM7501 = i4;
                        i16 = i10;
                    } else {
                        int iM25615 = (C0630.m2566("ۨ᩹") + i14) * (-17);
                        i17 = i5;
                        i20 = iM11932;
                        i15 = ((iM25615 ^ i13) * (-21381)) ^ (-1620248762);
                        int i25 = i4;
                        i16 = iM25615 ^ (-537032970);
                        iM7501 = i25;
                    }
                    break;
                case 238620441:
                case 251896697:
                    if (iMo21889 >= 3) {
                        iM6981 = C0630.m2566("ᩴ֡") ^ i14;
                        i15 = ((iM6981 ^ i13) * 21239) ^ 478164690;
                        i3 = 999992888;
                    } else {
                        iM6981 = C2105.m6981("ۙۛ") ^ i14;
                        i15 = ((iM6981 ^ i13) * 31429) ^ (-1990071988);
                        i3 = 417227298;
                    }
                    i16 = iM6981 ^ i3;
                    break;
                case 406186115:
                case 1107412890:
                    break;
                case 682576468:
                case 1561557612:
                    i18 = Integer.MIN_VALUE;
                    iM6981 = C0630.m2566("ۨܶ") ^ i14;
                    i15 = ((iM6981 ^ i13) * (-16071)) ^ (-1536548112);
                    i3 = 1532548370;
                    i16 = iM6981 ^ i3;
                    break;
                case 1083019086:
                case 1762333196:
                    i17 = 64;
                    if (abstractC11164 instanceof C8299) {
                        iM6981 = C0630.m2566("ۛ֨") ^ i13;
                        i15 = ((iM6981 ^ i14) * 15175) ^ 1264202153;
                        i3 = 198622845;
                    } else {
                        iM6981 = C0630.m2566("ܽۘ") ^ i14;
                        i15 = ((iM6981 ^ i13) * (-21629)) ^ 29817833;
                        i3 = 1820765892;
                    }
                    i16 = iM6981 ^ i3;
                    break;
                case 1374484386:
                case 2060062625:
                    return (((long) iMo21889) * j5) + j2;
                case 1668805656:
                case 2129147802:
                    return abstractC11164.mo21890();
                case 1934120777:
                case 2132250244:
                    j7 = j10 - ((long) iM30740);
                    if (C2105.f7037 == 0) {
                        iM6981 = C0630.m2566("ܶ۠") ^ i14;
                        i15 = ((iM6981 ^ i13) * 5055) ^ 1791808041;
                        i3 = 1831702117;
                        i16 = iM6981 ^ i3;
                    } else {
                        i6 = iM7501;
                        i7 = i20;
                        i8 = i17;
                        iM6982 = C0630.m2566("۠ۡ") ^ i13;
                        i15 = ((iM6982 ^ i14) * 28131) ^ 1319558291;
                        i9 = 517155540;
                        i10 = iM6982 ^ i9;
                        i17 = i8;
                        iM7501 = i6;
                        i20 = i7;
                        i16 = i10;
                    }
                    break;
                default:
                    j8 = 8;
                    j6 = (j11 - j4) / 8;
                    if (!C1504.f5354) {
                        iM6981 = C0630.m2566("ۗۖ") ^ i13;
                        i15 = ((iM6981 ^ i14) * 5533) ^ 831651181;
                        i3 = -137943154;
                        i16 = iM6981 ^ i3;
                    } else {
                        i4 = iM7501;
                        iM11932 = i20;
                        i5 = i17;
                        int iM25616 = (C0630.m2566("ۨ᩹") + i14) * (-17);
                        i17 = i5;
                        i20 = iM11932;
                        i15 = ((iM25616 ^ i13) * (-21381)) ^ (-1620248762);
                        int i26 = i4;
                        i16 = iM25616 ^ (-537032970);
                        iM7501 = i26;
                    }
                    break;
            }
        }
    }
}
