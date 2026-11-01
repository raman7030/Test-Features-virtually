package p067l;

import android.view.View;
import bin.p000mt.plus.Main;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ᩴۤܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: SAJE */
/* JADX INFO: loaded from: classes5.dex */
public class C20141 extends AbstractC8202 {

    /* JADX INFO: renamed from: ֡֫ */
    public static final /* synthetic */ int f62355 = 0;

    /* JADX INFO: renamed from: ᩵᩺ۤ, reason: not valid java name and contains not printable characters */
    private static final short[] f82314 = {8713, 24416, 24439, 24417, 24445, 24423, 24416, 24433, 24439, 24417, 24380, 24435, 24416, 24417, 24433, 24380, 24417, 24445, 5958, -12765, 15310, 15136, 16379, 11479, 1080, -11372, 834, 9614, 9263, 1023, -8333, 8692, -22710, -22715, -22720, -22711, -11660, -15973, -13865, -713, 10070, -16326, 8476, -19673, -19637, -19644, -19647, -19640, -19642, -19640, -19640, -19619, -19604, -19619, -19642, -19586, -19644, -19638, -19601, -19647, -19646, -19634, -19642, -931, 11436, -7665, -16375, -6312, -10696, -19709, -19623, -19648, -19619, -19704, -19683, -19627, -19699, -19693, -19693, -19699, -19646, -19637, -19637, -19618, -19640, -19623, -19696, -19683, -19627, -19699, -19699, -19706, -19683, -19627, -19598, -19648, -19644, -19645, -19699, -19699, 1214, 6299, 1198, 4382, -31791, -31791, -31791};

    /* JADX INFO: renamed from: ۖ֫ */
    public AbstractC17043 f62356;

    /* JADX INFO: renamed from: ۘ֫ */
    public AbstractC17043 f62357;

    /* JADX INFO: renamed from: ܺ֫ */
    public boolean f62358;

    /* JADX INFO: renamed from: ᩴ֫ */
    public StringBuilder f62359;

    /* JADX INFO: renamed from: ᩵֫ */
    public ArrayList f62360;

    /* JADX WARN: Code duplicated, block: B:24:0x0094 A[PHI: r4 r15
      0x0094: PHI (r4v4 int) = (r4v3 int), (r4v2 int), (r4v2 int), (r4v2 int) binds: [B:23:0x0092, B:17:0x0078, B:15:0x0075, B:12:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x0094: PHI (r15v4 short[]) = (r15v3 short[]), (r15v2 short[]), (r15v2 short[]), (r15v2 short[]) binds: [B:23:0x0092, B:17:0x0078, B:15:0x0075, B:12:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01f1 A[PHI: r3 r6 r7 r8 r9
      0x01f1: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v3 java.lang.String), (r3v2 java.lang.String), (r3v2 java.lang.String) binds: [B:55:0x01ef, B:31:0x0102, B:9:0x0062, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x01f1: PHI (r6v4 short) = (r6v3 short), (r6v2 short), (r6v2 short), (r6v2 short) binds: [B:55:0x01ef, B:31:0x0102, B:9:0x0062, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x01f1: PHI (r7v4 short) = (r7v3 short), (r7v2 short), (r7v2 short), (r7v2 short) binds: [B:55:0x01ef, B:31:0x0102, B:9:0x0062, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x01f1: PHI (r8v3 int) = (r8v2 int), (r8v2 int), (r8v2 int), (r8v5 int) binds: [B:55:0x01ef, B:31:0x0102, B:9:0x0062, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x01f1: PHI (r9v3 short) = (r9v2 short), (r9v2 short), (r9v2 short), (r9v5 short) binds: [B:55:0x01ef, B:31:0x0102, B:9:0x0062, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0226 A[PHI: r10 r12 r13 r21
      0x0226: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:59:0x0224, B:50:0x01b8, B:39:0x0143, B:12:0x006d, B:9:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r12v4 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:59:0x0224, B:50:0x01b8, B:39:0x0143, B:12:0x006d, B:9:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:59:0x0224, B:50:0x01b8, B:39:0x0143, B:12:0x006d, B:9:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r21v5 char) = (r21v4 char), (r21v3 char), (r21v3 char), (r21v3 char), (r21v3 char) binds: [B:59:0x0224, B:50:0x01b8, B:39:0x0143, B:12:0x006d, B:9:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0258 A[PHI: r14 r16
      0x0258: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:63:0x0256, B:35:0x011f, B:15:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:63:0x0256, B:35:0x011f, B:15:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5127() {
        int iM55979;
        int i;
        int i2;
        int i3 = C0992.f81922;
        int i4 = C1044.f81959;
        int iM55680 = (C0873.m55680("֫ۜ") + i3) * (-59);
        int i5 = ((iM55680 ^ i4) * 16811) ^ (-1057820729);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM55680 ^ 1879408784;
        int i7 = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        short s3 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -1109407337;
        char c = 0;
        String strM55707 = null;
        int iM55681 = 0;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * 23863) >> 31));
            switch (i13) {
                case -2113654301:
                case 1661441587:
                    i10 = 33791;
                    iM55979 = (i4 - C0946.m55979("ܽۗ")) * 19;
                    i = ((iM55979 ^ i3) * 7163) ^ (-1178944931);
                    i2 = -570839904;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1995134978:
                case 1300711783:
                    iM55681 = 2102022067 ^ C0873.m55680(strM55707);
                    if (C0937.f81884) {
                        iM55979 = C0946.m55979("۫ۢ") ^ i4;
                        i = ((iM55979 ^ i3) * (-29577)) ^ 654648812;
                        i2 = 297301803;
                    } else {
                        iM55979 = (C0946.m55979("ۘۖ") + i3) * (-117);
                        i = ((iM55979 ^ i4) * (-2715)) ^ 1879412568;
                        i2 = 1399821957;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1826629060:
                case 1850643379:
                    i10 = 11256;
                    iM55979 = (i4 - C0946.m55979("ܽۗ")) * 19;
                    i = ((iM55979 ^ i3) * 7163) ^ (-1178944931);
                    i2 = -570839904;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1713128540:
                case 1094605889:
                    C0898.m55798(this, iM55681);
                    sArr3 = f82314;
                    i7 = IShizukuService.Stub.TRANSACTION_isHidden;
                    if (C0873.f81841 <= 0) {
                        iM55979 = (C0873.m55680("ܺ᩹") + i4) * 27;
                        i = ((iM55979 ^ i3) * 24511) ^ 1951653359;
                        i2 = 355640357;
                    } else {
                        iM55979 = C0946.m55979("ᩳܶ") ^ i3;
                        i = ((iM55979 ^ i4) * 12047) ^ (-1755010634);
                        i2 = -1684537720;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1705178654:
                case -59543381:
                    s = sArr[c];
                    s2 = 268;
                    if (C1071.f81975 <= 0) {
                        iM55979 = (i4 - C0873.m55680("ܺۖ")) * 87;
                        i = ((iM55979 ^ i3) * 7723) ^ 617969367;
                        i2 = -1262925385;
                    } else {
                        iM55979 = (C0873.m55680("ۧۙ") + i3) * 47;
                        i = ((iM55979 ^ i4) * (-24425)) ^ (-1957311730);
                        i2 = 2061050995;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1698475047:
                case -1019666314:
                    strM55707 = C0877.m55707(sArr2, i11, i12, i10);
                    if (C1028.f81950 <= 0) {
                        iM55979 = (i4 - C0873.m55680("ܺۖ")) * 87;
                        i = ((iM55979 ^ i3) * 7723) ^ 617969367;
                        i2 = -1262925385;
                    } else {
                        iM55979 = C0946.m55979("ᩳۙ") ^ i3;
                        i = ((iM55979 ^ i4) * 22017) ^ (-2044299145);
                        i2 = -1608123823;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1688316760:
                case 501822939:
                    if (i8 - (i9 * i9) > 0) {
                        iM55979 = (C0946.m55979("ܶ᩶") + i3) * (-93);
                        i = ((iM55979 ^ i4) * (-1729)) ^ (-238845833);
                        i2 = -977763741;
                    } else {
                        iM55979 = C0873.m55680("ᩳܽ") ^ i3;
                        i = ((iM55979 ^ i4) * 25193) ^ (-2100742142);
                        i2 = 1873183545;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1018657510:
                case 1757858249:
                    sArr2 = f82314;
                    i11 = 101;
                    if (RunnableC1014.m56177()) {
                        iM55979 = C0946.m55979("ܰۗ") ^ i4;
                        i = ((iM55979 ^ i3) * 27189) ^ 826855708;
                        i2 = 1337296558;
                    } else {
                        iM55979 = C0946.m55979("᩻ۨ") ^ i4;
                        i = ((iM55979 ^ i3) * (-1919)) ^ 1750087192;
                        i2 = 2085701405;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -952678184:
                case -501362157:
                    C0854.m55595();
                    if (C0845.m55584() > 0) {
                        iM55979 = (C0873.m55680("ܺ᩹") + i4) * 27;
                        i = ((iM55979 ^ i3) * 24511) ^ 1951653359;
                        i2 = 355640357;
                    } else {
                        iM55979 = C0946.m55979("᩻ۨ") ^ i4;
                        i = ((iM55979 ^ i3) * (-1919)) ^ 1750087192;
                        i2 = 2085701405;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -940674351:
                case 578787158:
                    i12 = 3;
                    if (C1046.f81962 <= 0) {
                        iM55979 = (C0873.m55680("ۚܽ") + i3) * (-3);
                        i = ((iM55979 ^ i4) * 29155) ^ (-883330936);
                        i2 = 1851128748;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ۧ᩻")) * (-101);
                        i = ((iM55979 ^ i4) * 4493) ^ (-1953107725);
                        i2 = -1520426547;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -615239731:
                case 933775807:
                    C1929.m56553();
                    if (C0949.f81897 >= 0) {
                        iM55979 = C0946.m55979("᩻ۨ") ^ i4;
                        i = ((iM55979 ^ i3) * (-1919)) ^ 1750087192;
                        i2 = 2085701405;
                    } else {
                        iM55979 = (i4 - C0873.m55680("ܺۖ")) * 87;
                        i = ((iM55979 ^ i3) * 7723) ^ 617969367;
                        i2 = -1262925385;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -200708856:
                case 167064949:
                    RunnableC0938.m55938();
                    if (C1194.f82045 == 0) {
                        iM55979 = (C0873.m55680("ܺ᩹") + i4) * 27;
                        i = ((iM55979 ^ i3) * 24511) ^ 1951653359;
                        i2 = 355640357;
                    } else {
                        iM55979 = (C0873.m55680("ۚܽ") + i3) * (-3);
                        i = ((iM55979 ^ i4) * 29155) ^ (-883330936);
                        i2 = 1851128748;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 476500382:
                case 1498232043:
                    C0912.m55833();
                    iM55979 = (C0873.m55680("ܺ᩹") + i4) * 27;
                    i = ((iM55979 ^ i3) * 24511) ^ 1951653359;
                    i2 = 355640357;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 493896153:
                case 1838021962:
                    c = 'd';
                    if (C1036.f81953 >= 0) {
                        iM55979 = C0946.m55979("᩻ۨ") ^ i4;
                        i = ((iM55979 ^ i3) * (-1919)) ^ 1750087192;
                        i2 = 2085701405;
                    } else {
                        iM55979 = (i3 - C0946.m55979("᩶۬")) * 123;
                        i = ((iM55979 ^ i4) * 4023) ^ (-556622205);
                        i2 = -679697419;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 803108680:
                case 1983204443:
                    C0946.m55981(this, C1036.m56252(sArr3, i7, 3, i10));
                    break;
                case 945346308:
                case 1955064072:
                    C0967.m56074();
                    break;
                case 1112384903:
                case 1692693284:
                    i9 = s + s3;
                    if (C0873.f81841 <= 0) {
                        iM55979 = C0946.m55979("᩻ۨ") ^ i4;
                        i = ((iM55979 ^ i3) * (-1919)) ^ 1750087192;
                        i2 = 2085701405;
                    } else {
                        iM55979 = (C0946.m55979("ۨ᩹") ^ i4) * 81;
                        i = ((iM55979 ^ i3) * (-23065)) ^ (-1292810420);
                        i2 = 956005826;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 1268687573:
                case 1427184589:
                    sArr = f82314;
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = (C0873.m55680("ۚܽ") + i3) * (-3);
                        i = ((iM55979 ^ i4) * 29155) ^ (-883330936);
                        i2 = 1851128748;
                    } else {
                        iM55979 = C0946.m55979("۬۠") ^ i4;
                        i = ((iM55979 ^ i3) * (-1933)) ^ (-1916799801);
                        i2 = -1792307851;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                default:
                    i8 = s * s2;
                    s3 = 67;
                    if (C0890.m55740()) {
                        iM55979 = C0946.m55979("᩻᩻") ^ i4;
                        i = ((iM55979 ^ i3) * (-23799)) ^ (-197476565);
                        i2 = -323211876;
                    } else {
                        iM55979 = (i4 - C0873.m55680("ܺۖ")) * 87;
                        i = ((iM55979 ^ i3) * 7723) ^ 617969367;
                        i2 = -1262925385;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5589(AbstractActivityC5549 abstractActivityC5549, C18736 c18736, boolean z) {
        int i = -964220559;
        int i2 = C1053.f81965;
        int i3 = C0992.f81922;
        int iM55680 = (C0873.m55680("᩺ۤ") + i3) * (-87);
        int i4 = ((iM55680 ^ i2) * (-20711)) ^ 252692463;
        int i5 = 679603147;
        while (true) {
            i = ((((i ^ i2) * 25741) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2122938015:
                case 392835792:
                    if (!RunnableC0897.f81856) {
                        iM55680 = C0946.m55979("᩶᩶") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-12781)) ^ 722522814;
                        i5 = -176197354;
                    } else {
                        iM55680 = C0873.m55680("ۖ֫") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-5947)) ^ 788829352;
                        i5 = -391274073;
                    }
                    break;
                case -1849791978:
                case -1060676554:
                    if (C1964.f83032 <= 0) {
                        iM55680 = (C0946.m55979("ۜܳ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM55680 ^ i3) * (-1077)) ^ (-477005610);
                        i5 = -460705341;
                    } else {
                        iM55680 = (C0873.m55680("ܿۢ") ^ i2) * (-15);
                        i4 = ((iM55680 ^ i3) * (-9905)) ^ (-913209886);
                        i5 = 1436279952;
                    }
                    break;
                case -1847092130:
                case -230264930:
                    if (C1028.f81950 <= 0) {
                        iM55680 = (C0873.m55680("ۗۡ") ^ i3) * (-115);
                        i4 = ((iM55680 ^ i2) * (-15337)) ^ (-1690789049);
                        i5 = 1475189122;
                    } else {
                        iM55680 = (C0946.m55979("ᩳܺ") + i2) * 51;
                        i4 = ((iM55680 ^ i3) * (-21413)) ^ (-1228801717);
                        i5 = 1388943715;
                    }
                    break;
                case -1691908292:
                case 360788833:
                    if (C0906.f81862 >= 0) {
                        iM55680 = C0946.m55979("ܿۛ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-27055)) ^ 1000868023;
                        i5 = 1522177497;
                    } else {
                        iM55680 = C0873.m55680("ۡ᩸") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-14643)) ^ 1587866137;
                        i5 = 1730237452;
                    }
                    break;
                case -1683058964:
                case -1156315285:
                    if (C1404.f82149 >= 0) {
                        iM55680 = C0946.m55979("᩶᩶") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-12781)) ^ 722522814;
                        i5 = -176197354;
                    } else {
                        iM55680 = (C0873.m55680("ᩴ֫") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM55680 ^ i2) * (-15433)) ^ 518044389;
                        i5 = -1192069155;
                    }
                    break;
                case -1634362540:
                case -535696337:
                    C0917.m55854();
                    if (C0898.f81858 > 0) {
                        iM55680 = C0946.m55979("ܿۛ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-27055)) ^ 1000868023;
                        i5 = 1522177497;
                    } else {
                        iM55680 = (C0873.m55680("ۗۡ") ^ i3) * (-115);
                        i4 = ((iM55680 ^ i2) * (-15337)) ^ (-1690789049);
                        i5 = 1475189122;
                    }
                    break;
                case -1616978363:
                case -1414560082:
                    if (C0992.m56110(c18736)) {
                        iM55680 = C0873.m55680("֫ܺ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-5357)) ^ 1131572160;
                        i5 = 188457654;
                    } else {
                        iM55680 = (C0873.m55680("۟᩷") ^ i3) * 89;
                        i4 = ((iM55680 ^ i2) * (-23191)) ^ (-1228174562);
                        i5 = -1145584672;
                    }
                    break;
                case -1230484122:
                case 1842622148:
                    if (C1964.f83032 <= 0) {
                        iM55680 = (C0946.m55979("ۜܳ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM55680 ^ i3) * (-1077)) ^ (-477005610);
                        i5 = -460705341;
                    } else {
                        iM55680 = C0946.m55979("֡ᩴ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-10873)) ^ 126043757;
                        i5 = 535244445;
                    }
                    break;
                case -1091859386:
                case 598271918:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = (C0873.m55680("ۗۡ") ^ i3) * (-115);
                        i4 = ((iM55680 ^ i2) * (-15337)) ^ (-1690789049);
                        i5 = 1475189122;
                    } else {
                        iM55680 = (C0946.m55979("ܺܰ") + i2) * (-101);
                        i4 = ((iM55680 ^ i3) * (-19689)) ^ 153139427;
                        i5 = 493772918;
                    }
                    break;
                case -588164838:
                case 257615347:
                    AbstractC0942.m55971();
                    break;
                case -542523721:
                case 1117491810:
                    if (C0937.m55918() >= 0) {
                        iM55680 = (C0946.m55979("ۜܳ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM55680 ^ i3) * (-1077)) ^ (-477005610);
                        i5 = -460705341;
                    } else {
                        iM55680 = (C0946.m55979("ܰ᩷") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM55680 ^ i2) * 16245) ^ (-1225493168);
                        i5 = 1326738921;
                    }
                    break;
                case -369910058:
                case 648767144:
                    break;
                case -167368919:
                case 1244064412:
                    if (C0946.m55980() != 0) {
                        iM55680 = (C0946.m55979("ۜܳ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM55680 ^ i3) * (-1077)) ^ (-477005610);
                        i5 = -460705341;
                    } else {
                        iM55680 = (C0946.m55979("᩷ܿ") ^ i2) * (-19);
                        i4 = ((iM55680 ^ i3) * (-26239)) ^ (-980746843);
                        i5 = -1017635273;
                    }
                    break;
                case -18168118:
                case 1036608222:
                    if (C1036.f81953 >= 0) {
                        iM55680 = C0946.m55979("ܿۛ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-27055)) ^ 1000868023;
                        i5 = 1522177497;
                    } else {
                        iM55680 = (C0946.m55979("ܶ᩻") + i3) * 75;
                        i4 = ((iM55680 ^ i2) * 14551) ^ (-715107943);
                        i5 = 1583084785;
                    }
                    break;
                case 384005540:
                case 1063730545:
                    m45587(abstractActivityC5549);
                    iM55680 = (C0873.m55680("۟᩷") ^ i3) * 89;
                    i4 = ((iM55680 ^ i2) * (-23191)) ^ (-1228174562);
                    i5 = -1145584672;
                    break;
                case 637537641:
                case 1400738451:
                    if (RunnableC0871.m55672() >= 0) {
                        iM55680 = C0873.m55680("ۖ֫") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-5947)) ^ 788829352;
                        i5 = -391274073;
                    } else {
                        iM55680 = (C0946.m55979("ᩳ᩹") ^ i3) * 11;
                        i4 = ((iM55680 ^ i2) * 9599) ^ (-1881860348);
                        i5 = 1479196086;
                    }
                    break;
                case 1278710238:
                case 1860590477:
                    C1003.m56123();
                    if (C0863.f81833 <= 0) {
                        iM55680 = (C0873.m55680("ۗۡ") ^ i3) * (-115);
                        i4 = ((iM55680 ^ i2) * (-15337)) ^ (-1690789049);
                        i5 = 1475189122;
                    } else {
                        iM55680 = C0946.m55979("᩶᩶") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-12781)) ^ 722522814;
                        i5 = -176197354;
                    }
                    break;
                default:
                    C0955.m56025();
                    iM55680 = C0873.m55680("ۖ֫") ^ i2;
                    i4 = ((iM55680 ^ i3) * (-5947)) ^ 788829352;
                    i5 = -391274073;
                    break;
            }
            return;
        }
    }

    public C20141() {
        ArrayList arrayList = null;
        int i = 1937444691;
        int i2 = C0898.f81858;
        int i3 = C0992.f81922;
        int iM55979 = C0946.m55979("ܿ᩺") ^ i2;
        int i4 = ((iM55979 ^ i3) * (-24139)) ^ 741300797;
        int i5 = -1139998971;
        while (true) {
            i = ((((i ^ i3) * (-8555)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2052813484:
                case -1266154538:
                    arrayList = new ArrayList();
                    if (C0873.m55678()) {
                        iM55979 = C0946.m55979("ۘ᩷") ^ i3;
                        i4 = ((iM55979 ^ i2) * 25405) ^ 1699603165;
                        i5 = 394771720;
                    } else {
                        iM55979 = C0946.m55979("۫֫") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-705)) ^ (-1936393837);
                        i5 = -945365327;
                    }
                    break;
                case -2036016354:
                case -47455134:
                    C0890.m55740();
                    if (C1964.f83032 > 0) {
                        iM55979 = C0873.m55680("ۗܿ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 27591) ^ (-600858503);
                        i5 = 955546411;
                    } else {
                        iM55979 = C0946.m55979("ۘ᩷") ^ i3;
                        i4 = ((iM55979 ^ i2) * 25405) ^ 1699603165;
                        i5 = 394771720;
                    }
                    break;
                case -1859935119:
                case -98117017:
                    C0949.m56012();
                    C0873.m55678();
                    iM55979 = (i3 - C0946.m55979("ۗ᩶")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i4 = ((iM55979 ^ i2) * (-25881)) ^ (-1612916087);
                    i5 = 1410771837;
                    break;
                case -1306089210:
                case -842081918:
                    this.f62358 = true;
                    return;
                case -1294529062:
                case 83874580:
                    C0845.m55584();
                    throw new RuntimeException();
                case -1254615660:
                case 1321093976:
                    this.f62360 = arrayList;
                    if (C0989.f81920 >= 0) {
                        iM55979 = C0873.m55680("ۗܿ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 27591) ^ (-600858503);
                        i5 = 955546411;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ۤܿ")) * (-51);
                        i4 = ((iM55979 ^ i2) * (-30533)) ^ 1587641106;
                        i5 = -211849553;
                    }
                    break;
                case -1215424734:
                case -819853991:
                    if (C0894.f81854 >= 0) {
                        iM55979 = (C0873.m55680("ۚ᩻") + i2) * (-125);
                        i4 = ((iM55979 ^ i3) * 13687) ^ (-304922752);
                        i5 = 774771424;
                    } else {
                        iM55979 = C0946.m55979("᩷ܳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 10141) ^ 1198088822;
                        i5 = -1525006369;
                    }
                    break;
                case -935664372:
                case 1890043657:
                    if (C0946.m55980() != 0) {
                        iM55979 = C0873.m55680("ۗܿ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 27591) ^ (-600858503);
                        i5 = 955546411;
                    } else {
                        iM55979 = C0873.m55680("۬᩶") ^ i3;
                        i4 = ((iM55979 ^ i2) * 20717) ^ 53096070;
                        i5 = 146259482;
                    }
                    break;
                case -451492128:
                case 1028294956:
                    if (C0854.f81826 != 0) {
                        iM55979 = (C0873.m55680("ۚ᩻") + i2) * (-125);
                        i4 = ((iM55979 ^ i3) * 13687) ^ (-304922752);
                        i5 = 774771424;
                    } else {
                        iM55979 = (C0873.m55680("ᩴᩳ") ^ i2) * 101;
                        i4 = ((iM55979 ^ i3) * 14895) ^ (-1433818367);
                        i5 = 333340267;
                    }
                    break;
                case -113402469:
                case 821392262:
                    C0930.m55885();
                    if (C0947.f81895) {
                        iM55979 = (i3 - C0946.m55979("ۗ᩶")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM55979 ^ i2) * (-25881)) ^ (-1612916087);
                        i5 = 1410771837;
                    } else {
                        iM55979 = C0873.m55680("ᩳ᩵") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-2765)) ^ (-2013573998);
                        i5 = 1795562636;
                    }
                    break;
                case 812689323:
                case 1457798594:
                    if (C0873.f81841 <= 0) {
                        iM55979 = C0946.m55979("ۘ᩷") ^ i3;
                        i4 = ((iM55979 ^ i2) * 25405) ^ 1699603165;
                        i5 = 394771720;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ۗ᩶")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM55979 ^ i2) * (-25881)) ^ (-1612916087);
                        i5 = 1410771837;
                    }
                    break;
                case 1179425327:
                case 1537403518:
                    if (C0863.f81833 > 0) {
                        this.f62359 = new StringBuilder();
                        if (!C0873.m55678()) {
                            iM55979 = C0946.m55979("ܽۧ") ^ i2;
                            i4 = ((iM55979 ^ i3) * (-10199)) ^ (-1519623226);
                            i5 = -1163769468;
                        }
                        break;
                    }
                    iM55979 = (C0873.m55680("ۚ᩻") + i2) * (-125);
                    i4 = ((iM55979 ^ i3) * 13687) ^ (-304922752);
                    i5 = 774771424;
                    break;
                case 1220054451:
                case 1639485009:
                    if (C0854.f81826 != 0) {
                        iM55979 = C0946.m55979("ۘ᩷") ^ i3;
                        i4 = ((iM55979 ^ i2) * 25405) ^ 1699603165;
                        i5 = 394771720;
                    } else {
                        iM55979 = (i2 - C0946.m55979("ۨ᩵")) * (-79);
                        i4 = ((iM55979 ^ i3) * 13969) ^ (-591136143);
                        i5 = 255475673;
                    }
                    break;
                case 1353837330:
                case 1440436488:
                    if (C1229.f82066 >= 0) {
                        iM55979 = (i3 - C0946.m55979("ۗ᩶")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM55979 ^ i2) * (-25881)) ^ (-1612916087);
                        i5 = 1410771837;
                    } else {
                        iM55979 = C0946.m55979("ۢ᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * 22999) ^ (-6898203);
                        i5 = 1336671538;
                    }
                    break;
                default:
                    if (C0949.f81897 >= 0) {
                        iM55979 = C0873.m55680("ۗܿ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 27591) ^ (-600858503);
                        i5 = 955546411;
                    } else {
                        iM55979 = C0946.m55979("᩻᩻") ^ i2;
                        i4 = ((iM55979 ^ i3) * 2613) ^ 1276007741;
                        i5 = -1061311068;
                    }
                    break;
            }
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۠ */
    public final C13596 mo5124() {
        return C24966.f79714;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0192 A[PHI: r1
      0x0192: PHI (r1v6 java.lang.String) = (r1v3 java.lang.String), (r1v2 java.lang.String), (r1v2 java.lang.String), (r1v2 java.lang.String) binds: [B:44:0x0190, B:12:0x0079, B:9:0x0070, B:89:0x0192] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0257 A[PHI: r18 r20
      0x0257: PHI (r18v4 short) = (r18v3 short), (r18v2 short) binds: [B:60:0x0255, B:9:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0257: PHI (r20v4 short) = (r20v3 short), (r20v2 short) binds: [B:60:0x0255, B:9:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x028b A[PHI: r5 r6 r7 r9 r11 r14 r15 r16 r17 r19 r25
      0x028b: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:64:0x0289, B:48:0x01c5, B:32:0x010b, B:24:0x00bf, B:6:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x028b: PHI (r6v4 int) = (r6v2 int), (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:64:0x0289, B:48:0x01c5, B:32:0x010b, B:24:0x00bf, B:6:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x028b: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:64:0x0289, B:48:0x01c5, B:32:0x010b, B:24:0x00bf, B:6:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x028b: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:64:0x0289, B:48:0x01c5, B:32:0x010b, B:24:0x00bf, B:6:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x028b: PHI (r11v4 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:64:0x0289, B:48:0x01c5, B:32:0x010b, B:24:0x00bf, B:6:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x028b: PHI (r14v4 short[]) = (r14v2 short[]), (r14v3 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:64:0x0289, B:48:0x01c5, B:32:0x010b, B:24:0x00bf, B:6:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x028b: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:64:0x0289, B:48:0x01c5, B:32:0x010b, B:24:0x00bf, B:6:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x028b: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:64:0x0289, B:48:0x01c5, B:32:0x010b, B:24:0x00bf, B:6:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x028b: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:64:0x0289, B:48:0x01c5, B:32:0x010b, B:24:0x00bf, B:6:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x028b: PHI (r19v3 int) = (r19v2 int), (r19v2 int), (r19v2 int), (r19v2 int), (r19v4 int) binds: [B:64:0x0289, B:48:0x01c5, B:32:0x010b, B:24:0x00bf, B:6:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x028b: PHI (r25v4 short) = (r25v3 short), (r25v3 short), (r25v3 short), (r25v3 short), (r25v5 short) binds: [B:64:0x0289, B:48:0x01c5, B:32:0x010b, B:24:0x00bf, B:6:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo5123() {
        int iM55979;
        int i;
        int i2;
        int i3 = C1003.f81929;
        int i4 = C0873.f81841;
        int iM55680 = C0873.m55680("ۗܳ") ^ i4;
        int i5 = ((iM55680 ^ i3) * (-6219)) ^ 1519906768;
        String strM55783 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM55680 ^ (-1520490462);
        int iM559710 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        char c = 0;
        short s = 0;
        int i12 = 0;
        short s2 = 0;
        int i13 = 920183626;
        short s3 = 0;
        String[] strArr = null;
        short[] sArr4 = null;
        int i14 = 0;
        String strM13453 = null;
        String strM55689 = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i3) * 7053) >> 31));
            switch (i13) {
                case -2016412255:
                case -1210949519:
                    strM55689 = C0873.m55689(sArr, i11, i7, i10);
                    if (C0949.m56012()) {
                        iM55979 = C0946.m55979("֡֨") ^ i3;
                        i = ((iM55979 ^ i4) * (-3343)) ^ 583604171;
                        i2 = -433056681;
                    } else {
                        iM55979 = C0946.m55979("ۨۧ") ^ i4;
                        i = ((iM55979 ^ i3) * 8125) ^ (-1935767988);
                        i2 = -440708508;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1883253108:
                case -1610882152:
                    i9 = 39;
                    i8 = 3;
                    if (C1071.f81975 <= 0) {
                        iM55979 = C0873.m55680("ܰܳ") ^ i3;
                        i = ((iM55979 ^ i4) * 9469) ^ (-6967551);
                        i2 = -908560948;
                    } else {
                        iM55979 = C0873.m55680("ܿۨ") ^ i4;
                        i = ((iM55979 ^ i3) * (-1977)) ^ 1199116963;
                        i2 = 338247056;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1801536647:
                case 1952719186:
                    i10 = 42796;
                    iM55979 = (i4 - C0946.m55979("᩻ۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i = ((iM55979 ^ i3) * (-3495)) ^ 229436251;
                    i2 = -1106078655;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1756658595:
                case -325870969:
                    strArr = new String[]{strM13453, C1044.m56275(iM559710 ^ i14)};
                    sArr3 = f82314;
                    if (C1194.f82045 == 0) {
                        iM55979 = (i3 - C0873.m55680("ۛ֡")) * (-99);
                        i = ((iM55979 ^ i4) * (-1449)) ^ 838583408;
                        i2 = 882692066;
                        i6 = iM55979 ^ i2;
                        i5 = i;
                    } else {
                        int iM55681 = (C0873.m55680("᩻֡") + i3) * 31;
                        i5 = ((iM55681 ^ i4) * 11981) ^ (-1342387552);
                        i6 = iM55681 ^ 68017040;
                    }
                    break;
                case -1657298510:
                case -1415404843:
                    if (i12 - (s2 * s3) >= 0) {
                        iM55979 = (C0873.m55680("᩷ᩳ") ^ i3) * (-67);
                        i = ((iM55979 ^ i4) * (-23719)) ^ (-1555559047);
                        i2 = 1855108509;
                    } else {
                        iM55979 = C0873.m55680("ۛܽ") ^ i3;
                        i = ((iM55979 ^ i4) * 10551) ^ 1702737294;
                        i2 = 1659232920;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1554575396:
                case -1089773091:
                    strM13453 = m13453(strM55689);
                    sArr2 = f82314;
                    if (!C0917.f81868) {
                        iM55979 = (i3 - C0873.m55680("۟ܽ")) * (-127);
                        i = ((iM55979 ^ i4) * 31233) ^ 738234710;
                        i2 = -1050986552;
                        i6 = iM55979 ^ i2;
                        i5 = i;
                    } else {
                        int iM55682 = (C0873.m55680("᩻֡") + i3) * 31;
                        i5 = ((iM55682 ^ i4) * 11981) ^ (-1342387552);
                        i6 = iM55682 ^ 68017040;
                    }
                    break;
                case -1198552887:
                case -867188428:
                    if (C0898.f81858 > 0) {
                        iM55979 = C0946.m55979("֡֨") ^ i3;
                        i = ((iM55979 ^ i4) * (-3343)) ^ 583604171;
                        i2 = -433056681;
                        i6 = iM55979 ^ i2;
                        i5 = i;
                    } else {
                        int iM55683 = (C0873.m55680("᩻֡") + i3) * 31;
                        i5 = ((iM55683 ^ i4) * 11981) ^ (-1342387552);
                        i6 = iM55683 ^ 68017040;
                    }
                    break;
                case -1167332897:
                case -341718105:
                    if (C0927.f81875) {
                        iM55979 = (C0873.m55680("ۤ᩺") ^ i4) * C0254q.f1218h;
                        i = ((iM55979 ^ i3) * 10821) ^ 5505688;
                        i2 = 2018424928;
                    } else {
                        iM55979 = C0946.m55979("֡֨") ^ i3;
                        i = ((iM55979 ^ i4) * (-3343)) ^ 583604171;
                        i2 = -433056681;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1001785320:
                case 1368502954:
                    C1046.m56302();
                    int iM55684 = (C0873.m55680("᩻֡") + i3) * 31;
                    i5 = ((iM55684 ^ i4) * 11981) ^ (-1342387552);
                    i6 = iM55684 ^ 68017040;
                    break;
                case -974016830:
                case 2099170346:
                    sArr = f82314;
                    i11 = 32;
                    i7 = 4;
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55979 = C0873.m55680("ܰܳ") ^ i3;
                        i = ((iM55979 ^ i4) * 9469) ^ (-6967551);
                        i2 = -908560948;
                    } else {
                        iM55979 = (C0946.m55979("ۢܳ") + i3) * (-93);
                        i = ((iM55979 ^ i4) * 25039) ^ 1523194131;
                        i2 = -834100742;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -890256936:
                case 660689122:
                    strM55783 = RunnableC0897.m55783(sArr2, 36, 3, i10);
                    if (C0845.m55584() > 0) {
                        iM55979 = C0946.m55979("ۚ۬") ^ i4;
                        i = ((iM55979 ^ i3) * (-20045)) ^ 1187005863;
                        i2 = 2011007563;
                        i6 = iM55979 ^ i2;
                        i5 = i;
                    } else {
                        int iM55685 = (C0873.m55680("᩻֡") + i3) * 31;
                        i5 = ((iM55685 ^ i4) * 11981) ^ (-1342387552);
                        i6 = iM55685 ^ 68017040;
                    }
                    break;
                case -611630143:
                case 1060311523:
                    s2 = sArr4[c];
                    s = 19276;
                    if (C1044.f81959 >= 0) {
                        iM55979 = (C0873.m55680("ۤ᩺") ^ i4) * C0254q.f1218h;
                        i = ((iM55979 ^ i3) * 10821) ^ 5505688;
                        i2 = 2018424928;
                    } else {
                        iM55979 = C0873.m55680("֨۬") ^ i3;
                        i = ((iM55979 ^ i4) * (-26239)) ^ 2062538862;
                        i2 = 1260700266;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -48532378:
                case 689443138:
                    C1025.m56230();
                    C1053.m56327();
                    return null;
                case -1106856:
                case 530797874:
                    sArr4 = f82314;
                    c = 31;
                    if (C0906.f81862 >= 0) {
                        iM55979 = C0873.m55680("ܰܳ") ^ i3;
                        i = ((iM55979 ^ i4) * 9469) ^ (-6967551);
                        i2 = -908560948;
                    } else {
                        iM55979 = (C0946.m55979("ᩳ۠") + i4) * (-59);
                        i = ((iM55979 ^ i3) * 31661) ^ 1260115657;
                        i2 = -1007612322;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 274327048:
                case 1083990322:
                    i10 = 63366;
                    iM55979 = (i4 - C0946.m55979("᩻ۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i = ((iM55979 ^ i3) * (-3495)) ^ 229436251;
                    i2 = -1106078655;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 670133580:
                case 762166879:
                    iM559710 = C0946.m55979(strM55783);
                    i14 = 2128043103;
                    if (C0912.f81867 <= 0) {
                        iM55979 = C0873.m55680("ܰܳ") ^ i3;
                        i = ((iM55979 ^ i4) * 9469) ^ (-6967551);
                        i2 = -908560948;
                    } else {
                        iM55979 = C0946.m55979("ۧۖ") ^ i4;
                        i = ((iM55979 ^ i3) * (-6517)) ^ 1538303985;
                        i2 = -1239176946;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 1018167725:
                case 1318663519:
                    return C0912.m55826(C0946.m55979(C1053.m56325(sArr3, i9, i8, i10)) ^ 2121285402, strArr);
                case 1068626544:
                case 1674533552:
                    C1024.m56209();
                    if (C0894.f81854 < 0) {
                        iM55979 = C0946.m55979("֡֨") ^ i3;
                        i = ((iM55979 ^ i4) * (-3343)) ^ 583604171;
                        i2 = -433056681;
                    } else {
                        iM55979 = (C0946.m55979("ۢᩴ") ^ i4) * (-53);
                        i = ((iM55979 ^ i3) * 21059) ^ 740649313;
                        i2 = -2130679403;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                default:
                    int i15 = s2 + s;
                    i12 = i15 * i15;
                    s3 = 77104;
                    if (C0937.f81884) {
                        iM55979 = C0873.m55680("۠ۜ") ^ i4;
                        i = ((iM55979 ^ i3) * 16037) ^ (-1799816131);
                        i2 = -947415800;
                    } else {
                        iM55979 = C0873.m55680("ܰܳ") ^ i3;
                        i = ((iM55979 ^ i4) * 9469) ^ (-6967551);
                        i2 = -908560948;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        int i = 1720401369;
        int i2 = C0967.f81910;
        int i3 = C0949.f81897;
        int iM55680 = C0873.m55680("ۨܿ") ^ i3;
        int i4 = ((iM55680 ^ i2) * 24157) ^ (-602865200);
        int i5 = 728349887;
        while (true) {
            i = ((((i ^ i2) * 22567) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -1662921908:
                case 303724069:
                    if (!C1024.f81946) {
                        iM55680 = C0946.m55979("ۨۙ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 1813) ^ 1231952432;
                        i5 = -692458973;
                    } else {
                        iM55680 = C0946.m55979("ۚܺ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-3807)) ^ (-1523483933);
                        i5 = -1954405415;
                    }
                    break;
                case -1598176669:
                case 1699072673:
                    if (C1017.m56186(c18736)) {
                        iM55680 = (C0946.m55979("ܿ᩶") + i2) * 43;
                        i4 = ((iM55680 ^ i3) * 4667) ^ 560454746;
                        i5 = 1407639770;
                    } else {
                        iM55680 = C0946.m55979("۠᩹") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-30449)) ^ (-977519846);
                        i5 = -1502046836;
                    }
                    break;
                case -1307878323:
                case 1561355711:
                    break;
                case -1260447508:
                case 2133784115:
                    if (C0992.m56110(c18736)) {
                        iM55680 = C0873.m55680("ۙۨ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-23443)) ^ 1912834583;
                        i5 = -1010466176;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ۙ᩸")) * (-87);
                        i4 = ((iM55680 ^ i2) * (-19073)) ^ 769084199;
                        i5 = -1846747726;
                    }
                    break;
                case -1157886005:
                case 1340677486:
                    C1036.m56257();
                    break;
                case -874102579:
                case 1426083650:
                    if (C0992.f81922 >= 0) {
                        iM55680 = C0873.m55680("ۖܺ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 11615) ^ (-521102461);
                        i5 = -884203225;
                    } else {
                        iM55680 = C0873.m55680("᩵ۧ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-16351)) ^ 26286822;
                        i5 = -746537615;
                    }
                    break;
                case -859821786:
                case 678778419:
                    if (C0946.f81894 != 0) {
                        iM55680 = C0873.m55680("ۖܺ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 11615) ^ (-521102461);
                        i5 = -884203225;
                    } else {
                        iM55680 = C0873.m55680("ۙܽ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-577)) ^ (-824345016);
                        i5 = 723112371;
                    }
                    break;
                case -623205408:
                case 1617255775:
                    if (C1003.m56123() != 0) {
                        iM55680 = C0873.m55680("᩷᩸") ^ i3;
                        i4 = ((iM55680 ^ i2) * 32387) ^ (-510013028);
                        i5 = -1766006871;
                    } else {
                        iM55680 = (C0946.m55979("֨۠") + i2) * (-5);
                        i4 = ((iM55680 ^ i3) * 6311) ^ (-967304778);
                        i5 = 2111850410;
                    }
                    break;
                case -594340424:
                case 1279912320:
                    RunnableC0871.m55675(c18107, C1404.m56460(this.f62356));
                    c18107.m41241();
                    iM55680 = (i3 - C0946.m55979("ۙ᩸")) * (-87);
                    i4 = ((iM55680 ^ i2) * (-19073)) ^ 769084199;
                    i5 = -1846747726;
                    break;
                case -587331876:
                case 2502701:
                    if (C0992.f81922 >= 0) {
                        iM55680 = C0946.m55979("ۨۙ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 1813) ^ 1231952432;
                        i5 = -692458973;
                    } else {
                        iM55680 = C0873.m55680("᩷᩸") ^ i3;
                        i4 = ((iM55680 ^ i2) * 32387) ^ (-510013028);
                        i5 = -1766006871;
                    }
                    break;
                case -230691378:
                case 410244207:
                    if (C0967.f81910 >= 0) {
                        iM55680 = C0946.m55979("ۨۙ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 1813) ^ 1231952432;
                        i5 = -692458973;
                    } else {
                        iM55680 = (C0873.m55680("۟ۙ") ^ i2) * 91;
                        i4 = ((iM55680 ^ i3) * (-27693)) ^ (-1191410661);
                        i5 = -1598958510;
                    }
                    break;
                case -96233018:
                case 462499288:
                    C1229.m56410();
                    C1929.m56553();
                    iM55680 = C0873.m55680("᩷᩸") ^ i3;
                    i4 = ((iM55680 ^ i2) * 32387) ^ (-510013028);
                    i5 = -1766006871;
                    break;
                case 65218344:
                case 476409831:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = C0873.m55680("᩷᩸") ^ i3;
                        i4 = ((iM55680 ^ i2) * 32387) ^ (-510013028);
                        i5 = -1766006871;
                    } else {
                        iM55680 = C0946.m55979("ۙۚ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 1859) ^ (-92889121);
                        i5 = 460233054;
                    }
                    break;
                case 151226358:
                case 1557723258:
                    if (C1046.m56302() != 0) {
                        iM55680 = C0946.m55979("ۚܺ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-3807)) ^ (-1523483933);
                        i5 = -1954405415;
                    } else {
                        iM55680 = (i3 - C0873.m55680("᩻᩺")) * 39;
                        i4 = ((iM55680 ^ i2) * (-12543)) ^ 824208314;
                        i5 = 2076909326;
                    }
                    break;
                case 181733957:
                case 1510833091:
                    if (C1025.f81947 >= 0) {
                        iM55680 = C0873.m55680("ۖܺ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 11615) ^ (-521102461);
                        i5 = -884203225;
                    } else {
                        iM55680 = C0873.m55680("ܶۙ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 581) ^ (-1541623936);
                        i5 = 362169187;
                    }
                    break;
                case 267369204:
                case 915650427:
                    C1003.m56123();
                    if (!C0955.f81898) {
                        iM55680 = (C0873.m55680("ᩳۙ") ^ i2) * (-5);
                        i4 = ((iM55680 ^ i3) * 14709) ^ 82390814;
                        i5 = 1579773694;
                    } else {
                        iM55680 = C0873.m55680("᩷᩸") ^ i3;
                        i4 = ((iM55680 ^ i2) * 32387) ^ (-510013028);
                        i5 = -1766006871;
                    }
                    break;
                case 321545500:
                case 657535523:
                    m45587(main);
                    iM55680 = C0946.m55979("۠᩹") ^ i3;
                    i4 = ((iM55680 ^ i2) * (-30449)) ^ (-977519846);
                    i5 = -1502046836;
                    break;
                case 443184501:
                case 1214353915:
                    if (m13478(c18107)) {
                        iM55680 = (i2 - C0946.m55979("ۤ۠")) * C0254q.f1218h;
                        i4 = ((iM55680 ^ i3) * (-1113)) ^ 2011406186;
                        i5 = -208060992;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ۙ᩸")) * (-87);
                        i4 = ((iM55680 ^ i2) * (-19073)) ^ 769084199;
                        i5 = -1846747726;
                    }
                    break;
                case 480994832:
                case 485668566:
                    if (RunnableC0897.f81856) {
                        iM55680 = (i3 - C0946.m55979("ᩳۘ")) * (-11);
                        i4 = ((iM55680 ^ i2) * (-6901)) ^ (-140903161);
                        i5 = -1603795165;
                    } else {
                        iM55680 = (C0873.m55680("ᩳۙ") ^ i2) * (-5);
                        i4 = ((iM55680 ^ i3) * 14709) ^ 82390814;
                        i5 = 1579773694;
                    }
                    break;
                case 707413430:
                case 941932782:
                    if (C1071.m56343() != 0) {
                        iM55680 = C0873.m55680("ۖܺ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 11615) ^ (-521102461);
                        i5 = -884203225;
                    } else {
                        iM55680 = (C0873.m55680("ۢ᩸") ^ i2) * (-41);
                        i4 = ((iM55680 ^ i3) * 28653) ^ (-1295118105);
                        i5 = 1767107811;
                    }
                    break;
                default:
                    if (C0989.f81920 >= 0) {
                        iM55680 = C0873.m55680("ۖܺ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 11615) ^ (-521102461);
                        i5 = -884203225;
                    } else {
                        iM55680 = C0873.m55680("۫ۡ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-2985)) ^ (-786592774);
                        i5 = -1760595182;
                    }
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 65321. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public final p067l.C18736 mo5125() {
        /*
            Method dump skipped, instruction units count: 6532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C20141.mo5125():l.ܿ۠ۢ");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 22961. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ֫ */
    private p067l.C19561 m45586(p067l.C19561 r54, p067l.C5738 r55, java.util.TreeSet r56) {
        /*
            Method dump skipped, instruction units count: 2296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C20141.m45586(l.ᩳܰۡ, l.ۗ᩺ۡ, java.util.TreeSet):l.ᩳܰۡ");
    }

    /* JADX WARN: Code duplicated, block: B:48:0x01fc A[PHI: r6 r7 r15 r22
      0x01fc: PHI (r6v5 int) = (r6v2 int), (r6v2 int), (r6v4 int), (r6v2 int) binds: [B:13:0x0088, B:47:0x01fa, B:38:0x019a, B:22:0x00bd] A[DONT_GENERATE, DONT_INLINE]
      0x01fc: PHI (r7v5 int) = (r7v2 int), (r7v2 int), (r7v4 int), (r7v2 int) binds: [B:13:0x0088, B:47:0x01fa, B:38:0x019a, B:22:0x00bd] A[DONT_GENERATE, DONT_INLINE]
      0x01fc: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:13:0x0088, B:47:0x01fa, B:38:0x019a, B:22:0x00bd] A[DONT_GENERATE, DONT_INLINE]
      0x01fc: PHI (r22v18 int) = (r22v5 int), (r22v11 int), (r22v13 int), (r22v19 int) binds: [B:13:0x0088, B:47:0x01fa, B:38:0x019a, B:22:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩳ */
    private void m45587(final AbstractActivityC5549 abstractActivityC5549) {
        int iM55680;
        int i;
        int i2;
        short s;
        int iM55681;
        int i3;
        int i4;
        int iM55682;
        int i5;
        final C20141 c20141 = this;
        int i6 = C0898.f81858;
        int i7 = C1229.f82066;
        int iM55979 = C0946.m55979("᩺ۧ") ^ i6;
        int i8 = ((iM55979 ^ i7) * (-26101)) ^ 1841735824;
        C20671 c20671M55654 = null;
        Object obj = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i9 = iM55979 ^ (-1814013443);
        boolean z = false;
        int iM559710 = 0;
        int iM55683 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        short s2 = 0;
        int i14 = -1064853326;
        short s3 = 0;
        short[] sArr3 = null;
        String strM56325 = null;
        int i15 = 0;
        while (true) {
            i14 = i9 ^ (i8 & (((i14 ^ i7) * (-14429)) >> 31));
            switch (i14) {
                case -2074342242:
                case 1651162277:
                    C0967.m56074();
                    if (C0845.m55584() <= 0) {
                        i10 = i10;
                        iM55680 = C0873.m55680("۟ᩴ") ^ i7;
                        i = ((iM55680 ^ i6) * 23369) ^ 2108898815;
                        i2 = -676350543;
                        i10 = i10;
                        i9 = iM55680 ^ i2;
                        i8 = i;
                    } else {
                        i10 = i10;
                        s = s2;
                        iM55681 = (i7 - C0873.m55680("ۨ֫")) * 53;
                        i8 = ((iM55681 ^ i6) * (-8411)) ^ 61711696;
                        i3 = -564649332;
                        i5 = iM55681 ^ i3;
                        s2 = s;
                        i10 = i10;
                        i9 = i5;
                        c20141 = this;
                    }
                    break;
                case -1687722600:
                case -599399042:
                    i10 = i10;
                    s = s2;
                    sArr3 = f82314;
                    c = 18;
                    if (C0955.f81898) {
                        iM55681 = (i7 - C0873.m55680("ۨ֫")) * 53;
                        i8 = ((iM55681 ^ i6) * (-8411)) ^ 61711696;
                        i3 = -564649332;
                    } else {
                        iM55681 = C0873.m55680("ᩴۖ") ^ i6;
                        i8 = ((iM55681 ^ i7) * (-8499)) ^ (-548093588);
                        i3 = 920298320;
                    }
                    i5 = iM55681 ^ i3;
                    s2 = s;
                    i10 = i10;
                    i9 = i5;
                    c20141 = this;
                    break;
                case -1677756963:
                case 1244714968:
                    i10 = i10;
                    ViewOnClickListenerC0939.m55953(c20671M55654, iM559710, obj);
                    strM56325 = C1053.m56325(f82314, 28, 3, i12);
                    if (C0989.f81920 >= 0) {
                        iM55680 = C0946.m55979("֨ܺ") ^ i7;
                        i = ((iM55680 ^ i6) * (-31175)) ^ 755593869;
                        i2 = 2037807038;
                    } else {
                        iM55680 = C0873.m55680("ܺ۫") ^ i7;
                        i = ((iM55680 ^ i6) * 1619) ^ (-297098347);
                        i2 = -1502681003;
                    }
                    i10 = i10;
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
                case -1381267779:
                case 420308676:
                    i10 = i10;
                    iM559710 = 2129210819 ^ C0946.m55979(C1071.m56336(sArr2, i11, 3, i12));
                    obj = null;
                    if (C0898.f81858 <= 0) {
                        iM55680 = C0873.m55680("۟ᩴ") ^ i7;
                        i = ((iM55680 ^ i6) * 23369) ^ 2108898815;
                        i2 = -676350543;
                    } else {
                        iM55680 = C0946.m55979("ۛ֫") ^ i6;
                        i = ((iM55680 ^ i7) * (-24471)) ^ 1452876882;
                        i2 = 1119095328;
                    }
                    i10 = i10;
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
                case -1272998564:
                case -487812488:
                    i10 = i10;
                    if (c20141.f62358) {
                        iM55680 = C0946.m55979("ۡ֨") ^ i7;
                        i = ((iM55680 ^ i6) * (-14013)) ^ 1989717134;
                        i2 = 1740075357;
                    } else {
                        iM55680 = (C0946.m55979("ᩳ֡") + i7) * (-57);
                        i = ((iM55680 ^ i6) * 32131) ^ (-1184818509);
                        i2 = 1894516572;
                    }
                    i10 = i10;
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
                case -1077467824:
                case 459551962:
                    i10 = i10;
                    iM55683 = C0873.m55680(C0930.m55893(f82314, 22, 3, i12));
                    i15 = 2122597437;
                    if (C1003.m56123() != 0) {
                        iM55680 = C0946.m55979("ܳܳ") ^ i6;
                        i = ((iM55680 ^ i7) * 18955) ^ 1822170238;
                        i2 = -1931940554;
                    } else {
                        iM55680 = (C0873.m55680("ۡۤ") ^ i6) * (-45);
                        i = ((iM55680 ^ i7) * (-27769)) ^ 1275703247;
                        i2 = -2050719479;
                    }
                    i10 = i10;
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
                case -979516167:
                case 336343946:
                    i12 = 16475;
                    iM55680 = (C0946.m55979("ܽᩴ") ^ i6) * 101;
                    i = ((iM55680 ^ i7) * 20781) ^ 697143016;
                    i2 = -1097117885;
                    i10 = i10;
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
                case -930741141:
                case 773291667:
                    if (!RunnableC0897.f81856) {
                        i10 = i10;
                        s = s2;
                        iM55681 = (i7 - C0873.m55680("ۨ֫")) * 53;
                        i8 = ((iM55681 ^ i6) * (-8411)) ^ 61711696;
                        i3 = -564649332;
                        i5 = iM55681 ^ i3;
                        s2 = s;
                        i10 = i10;
                        i9 = i5;
                        c20141 = this;
                    } else {
                        i10 = i10;
                        iM55680 = C0946.m55979("ܳܳ") ^ i6;
                        i = ((iM55680 ^ i7) * 18955) ^ 1822170238;
                        i2 = -1931940554;
                        i10 = i10;
                        i9 = iM55680 ^ i2;
                        i8 = i;
                    }
                    break;
                case -912110336:
                case 1992790547:
                    int i16 = i10;
                    C1012.m56146(c20671M55654, C0873.m55680(C1024.m56203(sArr, i13, i16, i12)) ^ 2103276643);
                    if (C0854.f81826 != 0) {
                        i10 = i16;
                        s = s2;
                        iM55681 = (i7 - C0873.m55680("ۨ֫")) * 53;
                        i8 = ((iM55681 ^ i6) * (-8411)) ^ 61711696;
                        i3 = -564649332;
                        i5 = iM55681 ^ i3;
                        s2 = s;
                        i10 = i10;
                        i9 = i5;
                        c20141 = this;
                    } else {
                        int iM55684 = C0873.m55680("ܶۤ") ^ i6;
                        i8 = ((iM55684 ^ i7) * 10313) ^ (-1555907165);
                        i10 = i16;
                        i9 = iM55684 ^ (-1220295434);
                    }
                    break;
                case -877821781:
                case -590534940:
                    i12 = 22487;
                    iM55680 = (C0946.m55979("ܽᩴ") ^ i6) * 101;
                    i = ((iM55680 ^ i7) * 20781) ^ 697143016;
                    i2 = -1097117885;
                    i10 = i10;
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
                case -699961603:
                case 956025163:
                    i10 = i10;
                    z = false;
                    c20141.f62358 = false;
                    c20671M55654 = C0866.m55654(abstractActivityC5549);
                    sArr = f82314;
                    if (C0894.f81854 < 0) {
                        iM55680 = C0873.m55680("ۖۘ") ^ i6;
                        i = ((iM55680 ^ i7) * (-22433)) ^ (-1357254195);
                        i2 = 1687990351;
                        i10 = i10;
                        i9 = iM55680 ^ i2;
                        i8 = i;
                    } else {
                        iM55682 = C0873.m55680("ۨܿ") ^ i6;
                        i8 = ((iM55682 ^ i7) * 3281) ^ (-420623474);
                        i4 = 332266327;
                        i5 = iM55682 ^ i4;
                        i10 = i10;
                        i9 = i5;
                        c20141 = this;
                    }
                    break;
                case -572147507:
                case 90298040:
                    i10 = i10;
                    C0937.m55908(c20671M55654, iM55683 ^ i15);
                    sArr2 = f82314;
                    i11 = 25;
                    if (!C1048.f81963) {
                        iM55682 = C0873.m55680("ۨܿ") ^ i6;
                        i8 = ((iM55682 ^ i7) * 3281) ^ (-420623474);
                        i4 = 332266327;
                        i5 = iM55682 ^ i4;
                        i10 = i10;
                        i9 = i5;
                        c20141 = this;
                    } else {
                        iM55680 = C0873.m55680("ۛۨ") ^ i7;
                        i = ((iM55680 ^ i6) * (-25499)) ^ 1679232595;
                        i2 = 475764887;
                        i10 = i10;
                        i9 = iM55680 ^ i2;
                        i8 = i;
                    }
                    break;
                case 150174424:
                case 182151684:
                    C1071.m56343();
                    break;
                case 272647631:
                case 1599714285:
                    break;
                case 386954382:
                case 1929952173:
                    i10 = i10;
                    s = s2;
                    int i17 = s + 4742;
                    if ((s2 * s3) - (i17 * i17) <= 0) {
                        iM55681 = (C0946.m55979("ܳۘ") ^ i6) * (-79);
                        i8 = ((iM55681 ^ i7) * (-23913)) ^ (-1316571847);
                        i3 = -1789669098;
                    } else {
                        iM55681 = (C0946.m55979("ۢܿ") + i7) * (-97);
                        i8 = ((iM55681 ^ i6) * 15701) ^ (-2100572777);
                        i3 = 1458334821;
                    }
                    i5 = iM55681 ^ i3;
                    s2 = s;
                    i10 = i10;
                    i9 = i5;
                    c20141 = this;
                    break;
                case 396282851:
                case 542548140:
                    i10 = i10;
                    C0967.m56076(c20671M55654, C0946.m55979(strM56325) ^ 2125205245, obj);
                    C0866.m55659(c20671M55654, z);
                    if (C0992.f81922 >= 0) {
                        iM55680 = C0946.m55979("ܳܳ") ^ i6;
                        i = ((iM55680 ^ i7) * 18955) ^ 1822170238;
                        i2 = -1931940554;
                    } else {
                        iM55680 = C0873.m55680("֨᩶") ^ i6;
                        i = ((iM55680 ^ i7) * (-29455)) ^ (-446739629);
                        i2 = 1239019597;
                    }
                    i10 = i10;
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
                case 457777608:
                case 619246878:
                    C0992.m56107();
                    if (C1017.f81942 < 0) {
                        i10 = i10;
                        iM55680 = C0946.m55979("֨ܺ") ^ i7;
                        i = ((iM55680 ^ i6) * (-31175)) ^ 755593869;
                        i2 = 2037807038;
                        i10 = i10;
                        i9 = iM55680 ^ i2;
                        i8 = i;
                    } else {
                        i10 = i10;
                        s = s2;
                        iM55681 = (i7 - C0873.m55680("ۨ֫")) * 53;
                        i8 = ((iM55681 ^ i6) * (-8411)) ^ 61711696;
                        i3 = -564649332;
                        i5 = iM55681 ^ i3;
                        s2 = s;
                        i10 = i10;
                        i9 = i5;
                        c20141 = this;
                    }
                    break;
                case 716902427:
                case 1813540165:
                    i13 = 19;
                    if (C1012.m56134() <= 0) {
                        i10 = 3;
                        iM55680 = C0946.m55979("ܳܳ") ^ i6;
                        i = ((iM55680 ^ i7) * 18955) ^ 1822170238;
                        i2 = -1931940554;
                        i10 = i10;
                        i9 = iM55680 ^ i2;
                        i8 = i;
                    } else {
                        int iM55685 = C0873.m55680("ܶܳ") ^ i7;
                        i8 = ((iM55685 ^ i6) * 15341) ^ (-877078695);
                        i9 = iM55685 ^ (-952651287);
                        i10 = 3;
                    }
                    break;
                case 898914358:
                case 1717542787:
                    C0992.m56107();
                    C1044.m56286();
                    i10 = i10;
                    s = s2;
                    iM55681 = (i7 - C0873.m55680("ۨ֫")) * 53;
                    i8 = ((iM55681 ^ i6) * (-8411)) ^ 61711696;
                    i3 = -564649332;
                    i5 = iM55681 ^ i3;
                    s2 = s;
                    i10 = i10;
                    i9 = i5;
                    c20141 = this;
                    break;
                case 1046322810:
                case 1998203487:
                    i10 = i10;
                    s2 = sArr3[c];
                    s3 = 18968;
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55682 = C0873.m55680("ۨܿ") ^ i6;
                        i8 = ((iM55682 ^ i7) * 3281) ^ (-420623474);
                        i4 = 332266327;
                    } else {
                        iM55682 = C0873.m55680("᩷᩷") ^ i7;
                        i8 = ((iM55682 ^ i6) * (-16681)) ^ (-1792369638);
                        i4 = -1495007447;
                    }
                    i5 = iM55682 ^ i4;
                    i10 = i10;
                    i9 = i5;
                    c20141 = this;
                    break;
                default:
                    i10 = i10;
                    C0947.m55996(C1929.m56567(RunnableC0871.m55669(c20671M55654)), new View.OnClickListener(c20141) { // from class: l.ۖۤܽ

                        /* JADX INFO: renamed from: ܰ᩵᩵, reason: not valid java name and contains not printable characters */
                        private static final short[] f81906 = {945, 2974, 2981, 2980, 2997, 2976, 2984, 2989, 2994, 3055, 2997, 3001, 2997};

                        /* JADX INFO: renamed from: ᩸ */
                        public final /* synthetic */ C20141 f10671;

                        {
                            int i18 = 2127951883;
                            int i19 = C0845.f81821;
                            int i20 = C1404.f82149;
                            int iM55686 = C0873.m55680("᩻ۘ") ^ i19;
                            int i21 = ((iM55686 ^ i20) * (-20909)) ^ 2063907598;
                            int i22 = -2097676318;
                            while (true) {
                                i18 = ((((i18 ^ i20) * (-22735)) >> 31) & i21) ^ (iM55686 ^ i22);
                                switch (i18) {
                                    case -2042928778:
                                    case -626717827:
                                        if (C0906.m55809() <= 0) {
                                            iM55686 = (C0946.m55979("ۖۙ") + i19) * (-79);
                                            i21 = ((iM55686 ^ i20) * 13253) ^ (-1975665684);
                                            i22 = -1329346690;
                                        } else {
                                            iM55686 = C0946.m55979("ܽܽ") ^ i20;
                                            i21 = ((iM55686 ^ i19) * (-21863)) ^ 1481578469;
                                            i22 = 173957638;
                                        }
                                        break;
                                    case -1724058694:
                                    case -1677493136:
                                        if (C0882.f81846) {
                                            iM55686 = (C0946.m55979("ܽۜ") ^ i19) * 53;
                                            i21 = ((iM55686 ^ i20) * 19765) ^ (-362322629);
                                            i22 = -1192513712;
                                        } else {
                                            iM55686 = (C0873.m55680("ۗ۟") + i20) * 7;
                                            i21 = ((iM55686 ^ i19) * 9365) ^ 1251179921;
                                            i22 = -1029012079;
                                        }
                                        break;
                                    case -1276263553:
                                    case 260541293:
                                        if (ServiceConnectionC1013.f81940 >= 0) {
                                            iM55686 = C0873.m55680("۟᩸") ^ i20;
                                            i21 = ((iM55686 ^ i19) * 32039) ^ 1343780052;
                                            i22 = 889099843;
                                        } else {
                                            iM55686 = C0873.m55680("ۚۨ") ^ i19;
                                            i21 = ((iM55686 ^ i20) * (-9739)) ^ (-1157843322);
                                            i22 = 637586808;
                                        }
                                        break;
                                    case -1207192368:
                                    case 590488934:
                                        C1229.m56410();
                                        C0992.m56107();
                                        iM55686 = (C0873.m55680("ۡ᩸") + i20) * (-33);
                                        i21 = ((iM55686 ^ i19) * 10219) ^ 1491937738;
                                        i22 = -847870591;
                                        break;
                                    case -1174779098:
                                    case 1445300953:
                                        if (C0917.f81868) {
                                            iM55686 = (C0873.m55680("᩸ۖ") ^ i19) * (-67);
                                            i21 = ((iM55686 ^ i20) * (-23943)) ^ (-1904675839);
                                            i22 = -872089740;
                                        } else {
                                            iM55686 = C0873.m55680("ۨܰ") ^ i19;
                                            i21 = ((iM55686 ^ i20) * (-18485)) ^ 637228402;
                                            i22 = 803369064;
                                        }
                                        break;
                                    case -1120924267:
                                    case 2019647033:
                                        if (ViewOnClickListenerC0939.f81888 <= 0) {
                                            iM55686 = (C0946.m55979("ܽۜ") ^ i19) * 53;
                                            i21 = ((iM55686 ^ i20) * 19765) ^ (-362322629);
                                            i22 = -1192513712;
                                        } else {
                                            iM55686 = (i20 - C0873.m55680("᩵ۨ")) * (-55);
                                            i21 = ((iM55686 ^ i19) * 26081) ^ (-805246267);
                                            i22 = 1032243688;
                                        }
                                        break;
                                    case -997316814:
                                    case 157668448:
                                        if (C0898.m55800() <= 0) {
                                            iM55686 = (C0946.m55979("ܽۜ") ^ i19) * 53;
                                            i21 = ((iM55686 ^ i20) * 19765) ^ (-362322629);
                                            i22 = -1192513712;
                                        } else {
                                            iM55686 = (C0946.m55979("֡᩶") ^ i20) * (-99);
                                            i21 = ((iM55686 ^ i19) * 13159) ^ 2138150505;
                                            i22 = -1039178045;
                                        }
                                        break;
                                    case -750276501:
                                    case -677936404:
                                        return;
                                    case -669231881:
                                    case -155749036:
                                        if (C0873.f81841 > 0) {
                                            iM55686 = C0873.m55680("۟᩸") ^ i20;
                                            i21 = ((iM55686 ^ i19) * 32039) ^ 1343780052;
                                            i22 = 889099843;
                                        } else {
                                            iM55686 = (C0873.m55680("ۡ᩸") + i20) * (-33);
                                            i21 = ((iM55686 ^ i19) * 10219) ^ 1491937738;
                                            i22 = -847870591;
                                        }
                                        break;
                                    case -667065872:
                                    case -522953210:
                                        C1048.m56305();
                                        if (C0946.m55980() == 0) {
                                            iM55686 = (C0946.m55979("ۖۙ") + i19) * (-79);
                                            i21 = ((iM55686 ^ i20) * 13253) ^ (-1975665684);
                                            i22 = -1329346690;
                                        } else {
                                            iM55686 = (C0873.m55680("ۡ᩸") + i20) * (-33);
                                            i21 = ((iM55686 ^ i19) * 10219) ^ 1491937738;
                                            i22 = -847870591;
                                        }
                                        break;
                                    case -369786291:
                                    case 829039494:
                                        if (ServiceConnectionC1013.f81940 >= 0) {
                                            iM55686 = (C0873.m55680("᩸ۖ") ^ i19) * (-67);
                                            i21 = ((iM55686 ^ i20) * (-23943)) ^ (-1904675839);
                                            i22 = -872089740;
                                        } else {
                                            iM55686 = (C0873.m55680("ۧ۟") ^ i19) * 13;
                                            i21 = ((iM55686 ^ i20) * 1767) ^ 85858561;
                                            i22 = 1767561698;
                                        }
                                        break;
                                    case 469720260:
                                    case 1795460908:
                                        C1044.m56286();
                                        throw new RuntimeException();
                                    case 746651637:
                                    case 1379213729:
                                        C1025.m56230();
                                        if (C0906.f81862 >= 0) {
                                            iM55686 = (C0946.m55979("ܽۜ") ^ i19) * 53;
                                            i21 = ((iM55686 ^ i20) * 19765) ^ (-362322629);
                                            i22 = -1192513712;
                                        } else {
                                            iM55686 = C0873.m55680("۟᩸") ^ i20;
                                            i21 = ((iM55686 ^ i19) * 32039) ^ 1343780052;
                                            i22 = 889099843;
                                        }
                                        break;
                                    case 1123016704:
                                    case 1462820621:
                                        if (C0882.m55710() != 0) {
                                            iM55686 = C0873.m55680("۟᩸") ^ i20;
                                            i21 = ((iM55686 ^ i19) * 32039) ^ 1343780052;
                                            i22 = 889099843;
                                        } else {
                                            iM55686 = C0873.m55680("۫ܽ") ^ i19;
                                            i21 = ((iM55686 ^ i20) * (-16825)) ^ 588771945;
                                            i22 = 1704538947;
                                        }
                                        break;
                                    case 1233420900:
                                    case 2119293204:
                                        this.f10671 = c20141;
                                        if (C0906.f81862 >= 0) {
                                            iM55686 = (C0946.m55979("ۖۙ") + i19) * (-79);
                                            i21 = ((iM55686 ^ i20) * 13253) ^ (-1975665684);
                                            i22 = -1329346690;
                                        } else {
                                            iM55686 = C0946.m55979("᩻ܳ") ^ i20;
                                            i21 = ((iM55686 ^ i19) * 9959) ^ 1251047204;
                                            i22 = -2095463383;
                                        }
                                        break;
                                    default:
                                        if (C1036.f81953 >= 0) {
                                            iM55686 = (C0946.m55979("ܽۜ") ^ i19) * 53;
                                            i21 = ((iM55686 ^ i20) * 19765) ^ (-362322629);
                                            i22 = -1192513712;
                                        } else {
                                            iM55686 = C0873.m55680("ܿܶ") ^ i19;
                                            i21 = ((iM55686 ^ i20) * (-17287)) ^ 952808434;
                                            i22 = 942398894;
                                        }
                                        break;
                                }
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:52:0x01d3 A[PHI: r2 r3 r4 r8 r13 r14 r15
                          0x01d3: PHI (r2v8 l.ᩴۤܽ) = (r2v2 l.ᩴۤܽ), (r2v3 l.ᩴۤܽ), (r2v2 l.ᩴۤܽ), (r2v2 l.ᩴۤܽ), (r2v2 l.ᩴۤܽ) binds: [B:51:0x01d1, B:40:0x0157, B:20:0x008a, B:7:0x005b, B:83:0x01d3] A[DONT_GENERATE, DONT_INLINE]
                          0x01d3: PHI (r3v8 l.ܶ᩵ܿ) = (r3v2 l.ܶ᩵ܿ), (r3v3 l.ܶ᩵ܿ), (r3v2 l.ܶ᩵ܿ), (r3v2 l.ܶ᩵ܿ), (r3v2 l.ܶ᩵ܿ) binds: [B:51:0x01d1, B:40:0x0157, B:20:0x008a, B:7:0x005b, B:83:0x01d3] A[DONT_GENERATE, DONT_INLINE]
                          0x01d3: PHI (r4v8 java.lang.StringBuilder) = 
                          (r4v2 java.lang.StringBuilder)
                          (r4v3 java.lang.StringBuilder)
                          (r4v2 java.lang.StringBuilder)
                          (r4v2 java.lang.StringBuilder)
                          (r4v2 java.lang.StringBuilder)
                         binds: [B:51:0x01d1, B:40:0x0157, B:20:0x008a, B:7:0x005b, B:83:0x01d3] A[DONT_GENERATE, DONT_INLINE]
                          0x01d3: PHI (r8v7 java.lang.String) = 
                          (r8v2 java.lang.String)
                          (r8v2 java.lang.String)
                          (r8v3 java.lang.String)
                          (r8v2 java.lang.String)
                          (r8v2 java.lang.String)
                         binds: [B:51:0x01d1, B:40:0x0157, B:20:0x008a, B:7:0x005b, B:83:0x01d3] A[DONT_GENERATE, DONT_INLINE]
                          0x01d3: PHI (r13v7 int) = (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:51:0x01d1, B:40:0x0157, B:20:0x008a, B:7:0x005b, B:83:0x01d3] A[DONT_GENERATE, DONT_INLINE]
                          0x01d3: PHI (r14v7 int) = (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:51:0x01d1, B:40:0x0157, B:20:0x008a, B:7:0x005b, B:83:0x01d3] A[DONT_GENERATE, DONT_INLINE]
                          0x01d3: PHI (r15v7 int) = (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:51:0x01d1, B:40:0x0157, B:20:0x008a, B:7:0x005b, B:83:0x01d3] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:56:0x0208 A[PHI: r17 r22
                          0x0208: PHI (r17v4 short) = (r17v3 short), (r17v2 short) binds: [B:55:0x0206, B:7:0x005b] A[DONT_GENERATE, DONT_INLINE]
                          0x0208: PHI (r22v5 short) = (r22v4 short), (r22v3 short) binds: [B:55:0x0206, B:7:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:60:0x0238 A[PHI: r6 r10 r11 r16
                          0x0238: PHI (r6v3 java.lang.String) = (r6v2 java.lang.String), (r6v2 java.lang.String), (r6v4 java.lang.String) binds: [B:59:0x0236, B:32:0x00f6, B:28:0x00d4] A[DONT_GENERATE, DONT_INLINE]
                          0x0238: PHI (r10v4 short[]) = (r10v2 short[]), (r10v3 short[]), (r10v2 short[]) binds: [B:59:0x0236, B:32:0x00f6, B:28:0x00d4] A[DONT_GENERATE, DONT_INLINE]
                          0x0238: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:59:0x0236, B:32:0x00f6, B:28:0x00d4] A[DONT_GENERATE, DONT_INLINE]
                          0x0238: PHI (r16v4 char) = (r16v3 char), (r16v2 char), (r16v2 char) binds: [B:59:0x0236, B:32:0x00f6, B:28:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int iM55686;
                            int i18;
                            int i19;
                            short[] sArr4;
                            ViewOnClickListenerC4718 viewOnClickListenerC4718 = this;
                            int i20 = -1686443859;
                            int i21 = C1044.f81959;
                            int i22 = C0930.f81879;
                            int iM55687 = C0873.m55680("᩻ۚ") ^ i21;
                            int i23 = ((iM55687 ^ i22) * 4207) ^ 2140004043;
                            int i24 = iM55687 ^ (-1637280821);
                            short[] sArr5 = null;
                            short[] sArr6 = null;
                            int i25 = 0;
                            int i26 = 0;
                            int i27 = 0;
                            int i28 = 0;
                            int i29 = 0;
                            char c2 = 0;
                            short s4 = 0;
                            short s5 = 0;
                            String strM55591 = null;
                            AbstractC17043 abstractC17043M38682 = null;
                            String strM56233 = null;
                            String strM38675 = null;
                            StringBuilder sb = null;
                            AbstractC17043 abstractC17043 = null;
                            C20141 c20142 = null;
                            while (true) {
                                i20 = i24 ^ (i23 & (((i20 ^ i22) * (-31939)) >> 31));
                                switch (i20) {
                                    case -2081090766:
                                    case -434480709:
                                        c20142 = viewOnClickListenerC4718.f10671;
                                        abstractC17043 = c20142.f62356;
                                        sb = new StringBuilder();
                                        if (C1024.f81946) {
                                            iM55686 = C0946.m55979("ۜ֡") ^ i21;
                                            i18 = ((iM55686 ^ i22) * (-26587)) ^ (-1953278300);
                                            i19 = -1822232723;
                                        } else {
                                            iM55686 = (C0946.m55979("֨ܿ") ^ i21) * C0254q.f1218h;
                                            i18 = ((iM55686 ^ i22) * (-929)) ^ (-1902417265);
                                            i19 = 465429801;
                                        }
                                        i24 = iM55686 ^ i19;
                                        i23 = i18;
                                        break;
                                    case -1909704591:
                                    case -554416938:
                                        C0912.m55825(sb, strM56233);
                                        abstractC17043M38682 = abstractC17043.m38682(C0863.m55639(sb));
                                        if (!C0861.f81831) {
                                            sArr4 = sArr5;
                                            int iM559711 = (C0946.m55979("᩺ۡ") ^ i22) * 63;
                                            i24 = iM559711 ^ 811280115;
                                            sArr5 = sArr4;
                                            i23 = ((iM559711 ^ i21) * 23117) ^ 372460193;
                                            viewOnClickListenerC4718 = this;
                                        } else {
                                            iM55686 = (i22 - C0873.m55680("᩶ۖ")) * (-89);
                                            i18 = ((iM55686 ^ i21) * (-3627)) ^ (-1325974520);
                                            i19 = -1075672469;
                                            i24 = iM55686 ^ i19;
                                            i23 = i18;
                                        }
                                        break;
                                    case -1887611718:
                                    case 1015611214:
                                        strM38675 = c20142.f62356.m38675();
                                        if (C0890.m55740()) {
                                            iM55686 = C0946.m55979("ܺۚ") ^ i22;
                                            i18 = ((iM55686 ^ i21) * (-10683)) ^ (-574977937);
                                            i19 = 283209308;
                                        } else {
                                            iM55686 = (i22 - C0946.m55979("ۚ֫")) * (-81);
                                            i18 = ((iM55686 ^ i21) * 14279) ^ (-1520359459);
                                            i19 = -1348688787;
                                        }
                                        i24 = iM55686 ^ i19;
                                        i23 = i18;
                                        break;
                                    case -1656691425:
                                    case 1360790653:
                                        C1964.m56597();
                                        if (C1404.f82149 >= 0) {
                                            iM55686 = C0946.m55979("ۜ֡") ^ i21;
                                            i18 = ((iM55686 ^ i22) * (-26587)) ^ (-1953278300);
                                            i19 = -1822232723;
                                            i24 = iM55686 ^ i19;
                                            i23 = i18;
                                        } else {
                                            sArr4 = sArr5;
                                            int iM559712 = (C0946.m55979("᩺ۡ") ^ i22) * 63;
                                            i24 = iM559712 ^ 811280115;
                                            sArr5 = sArr4;
                                            i23 = ((iM559712 ^ i21) * 23117) ^ 372460193;
                                            viewOnClickListenerC4718 = this;
                                        }
                                        break;
                                    case -1333584100:
                                    case 220609334:
                                        C0877.m55696();
                                        break;
                                    case -1325298477:
                                    case -207043166:
                                        c2 = 0;
                                        if (RunnableC0897.f81856) {
                                            iM55686 = C0873.m55680("ۘۖ") ^ i22;
                                            i18 = ((iM55686 ^ i21) * (-24991)) ^ (-1352714175);
                                            i19 = -1747187641;
                                        } else {
                                            iM55686 = (i21 - C0946.m55979("ۡ۠")) * 7;
                                            i18 = ((iM55686 ^ i22) * 10603) ^ 691775004;
                                            i19 = -1531258398;
                                        }
                                        i24 = iM55686 ^ i19;
                                        i23 = i18;
                                        break;
                                    case -1225379422:
                                    case -221232022:
                                        ActivityC16573.m37551(abstractActivityC5549, strM55591, C1404.m56460(abstractC17043M38682), C1046.m56297(abstractC17043M38682), null);
                                        break;
                                    case -1216719874:
                                    case 615217159:
                                        i27 = s4 * s5;
                                        i28 = s4 * s4;
                                        i29 = 160149025;
                                        if (C0861.m55626()) {
                                            iM55686 = C0946.m55979("ۜ֡") ^ i21;
                                            i18 = ((iM55686 ^ i22) * (-26587)) ^ (-1953278300);
                                            i19 = -1822232723;
                                        } else {
                                            iM55686 = C0946.m55979("ۗۚ") ^ i22;
                                            i18 = ((iM55686 ^ i21) * (-4349)) ^ (-674168986);
                                            i19 = 966863465;
                                        }
                                        i24 = iM55686 ^ i19;
                                        i23 = i18;
                                        break;
                                    case -1188924198:
                                    case 934701825:
                                        i25 = 3009;
                                        iM55686 = C0946.m55979("ܶܽ") ^ i22;
                                        i18 = ((iM55686 ^ i21) * 11363) ^ 1223893650;
                                        i19 = -1387752445;
                                        i24 = iM55686 ^ i19;
                                        i23 = i18;
                                        break;
                                    case -1185432606:
                                    case 516792813:
                                        if (RunnableC1014.m56177()) {
                                            iM55686 = C0946.m55979("ۜ֡") ^ i21;
                                            i18 = ((iM55686 ^ i22) * (-26587)) ^ (-1953278300);
                                            i19 = -1822232723;
                                        } else {
                                            iM55686 = C0946.m55979("ܺᩴ") ^ i22;
                                            i18 = ((iM55686 ^ i21) * (-27351)) ^ (-1824003562);
                                            i19 = -1275232621;
                                        }
                                        i24 = iM55686 ^ i19;
                                        i23 = i18;
                                        break;
                                    case -1184779441:
                                    case -432172066:
                                        s4 = sArr5[c2];
                                        s5 = 25310;
                                        if (C1036.m56257() <= 0) {
                                            iM55686 = C0946.m55979("ܺᩴ") ^ i22;
                                            i18 = ((iM55686 ^ i21) * (-27351)) ^ (-1824003562);
                                            i19 = -1275232621;
                                        } else {
                                            iM55686 = C0946.m55979("ܳ᩹") ^ i21;
                                            i18 = ((iM55686 ^ i22) * 28773) ^ 651094353;
                                            i19 = 1059175296;
                                        }
                                        i24 = iM55686 ^ i19;
                                        i23 = i18;
                                        break;
                                    case -997279581:
                                    case 1046276426:
                                        C1003.m56121(sb, strM38675);
                                        sArr6 = f81906;
                                        i26 = 1;
                                        if (C0992.f81922 >= 0) {
                                            iM55686 = (i21 - C0946.m55979("ۡ۠")) * 7;
                                            i18 = ((iM55686 ^ i22) * 10603) ^ 691775004;
                                            i19 = -1531258398;
                                        } else {
                                            iM55686 = (C0946.m55979("᩷᩸") ^ i21) * 93;
                                            i18 = ((iM55686 ^ i22) * 6311) ^ 1072246290;
                                            i19 = -1152302293;
                                        }
                                        i24 = iM55686 ^ i19;
                                        i23 = i18;
                                        break;
                                    case -610782024:
                                    case 372324780:
                                        sArr4 = f81906;
                                        if (C1044.f81959 < 0) {
                                            int iM55688 = (C0873.m55680("᩺۫") + i21) * (-125);
                                            i18 = ((iM55688 ^ i22) * (-1529)) ^ 2046038538;
                                            i24 = iM55688 ^ (-1705188935);
                                            viewOnClickListenerC4718 = this;
                                            sArr5 = sArr4;
                                            i23 = i18;
                                        } else {
                                            int iM559713 = (C0946.m55979("᩺ۡ") ^ i22) * 63;
                                            i24 = iM559713 ^ 811280115;
                                            sArr5 = sArr4;
                                            i23 = ((iM559713 ^ i21) * 23117) ^ 372460193;
                                            viewOnClickListenerC4718 = this;
                                        }
                                        break;
                                    case -89040093:
                                    case 456729840:
                                        if (C1036.f81953 >= 0) {
                                            iM55686 = (i22 - C0946.m55979("ۚ֫")) * (-81);
                                            i18 = ((iM55686 ^ i21) * 14279) ^ (-1520359459);
                                            i19 = -1348688787;
                                            i24 = iM55686 ^ i19;
                                            i23 = i18;
                                        } else {
                                            sArr4 = sArr5;
                                            int iM559714 = (C0946.m55979("᩺ۡ") ^ i22) * 63;
                                            i24 = iM559714 ^ 811280115;
                                            sArr5 = sArr4;
                                            i23 = ((iM559714 ^ i21) * 23117) ^ 372460193;
                                            viewOnClickListenerC4718 = this;
                                        }
                                        break;
                                    case 50956211:
                                    case 2076004386:
                                        i25 = 8760;
                                        iM55686 = C0946.m55979("ܶܽ") ^ i22;
                                        i18 = ((iM55686 ^ i21) * 11363) ^ 1223893650;
                                        i19 = -1387752445;
                                        i24 = iM55686 ^ i19;
                                        i23 = i18;
                                        break;
                                    case 387748220:
                                    case 1670385021:
                                        if (i27 - (i28 + i29) > 0) {
                                            iM55686 = (i22 - C0946.m55979("ۤ֨")) * 29;
                                            i18 = ((iM55686 ^ i21) * (-19181)) ^ 416973671;
                                            i19 = 820384264;
                                        } else {
                                            iM55686 = C0946.m55979("ۡۧ") ^ i21;
                                            i18 = ((iM55686 ^ i22) * 20249) ^ (-183936237);
                                            i19 = 830060836;
                                        }
                                        i24 = iM55686 ^ i19;
                                        i23 = i18;
                                        break;
                                    case 860607646:
                                    case 2047153977:
                                        strM56233 = C1025.m56233(sArr6, i26, 12, i25);
                                        if (C1028.f81950 <= 0) {
                                            iM55686 = (i21 - C0946.m55979("ۡ۠")) * 7;
                                            i18 = ((iM55686 ^ i22) * 10603) ^ 691775004;
                                            i19 = -1531258398;
                                        } else {
                                            iM55686 = C0873.m55680("᩶᩵") ^ i21;
                                            i18 = ((iM55686 ^ i22) * 29155) ^ 2101086004;
                                            i19 = 108291862;
                                        }
                                        i24 = iM55686 ^ i19;
                                        i23 = i18;
                                        break;
                                    case 1743329043:
                                    case 2125133297:
                                        strM55591 = C0845.m55591(c20142.f62359);
                                        if (C0967.f81910 >= 0) {
                                            iM55686 = C0946.m55979("ۜ֡") ^ i21;
                                            i18 = ((iM55686 ^ i22) * (-26587)) ^ (-1953278300);
                                            i19 = -1822232723;
                                        } else {
                                            iM55686 = C0946.m55979("ۘۡ") ^ i21;
                                            i18 = ((iM55686 ^ i22) * 5057) ^ (-1229154129);
                                            i19 = 1051589491;
                                        }
                                        i24 = iM55686 ^ i19;
                                        i23 = i18;
                                        break;
                                    default:
                                        C0894.m55769();
                                        sArr4 = sArr5;
                                        int iM559715 = (C0946.m55979("᩺ۡ") ^ i22) * 63;
                                        i24 = iM559715 ^ 811280115;
                                        sArr5 = sArr4;
                                        i23 = ((iM559715 ^ i21) * 23117) ^ 372460193;
                                        viewOnClickListenerC4718 = this;
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    iM55680 = (C0946.m55979("ᩳ֡") + i7) * (-57);
                    i = ((iM55680 ^ i6) * 32131) ^ (-1184818509);
                    i2 = 1894516572;
                    i10 = i10;
                    i9 = iM55680 ^ i2;
                    i8 = i;
                    break;
            }
            return;
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        AbstractC17043 abstractC17043 = null;
        AbstractC17043 abstractC17044 = null;
        Iterator itM56090 = null;
        int i = -1439170109;
        int i2 = C0912.f81867;
        int i3 = ServiceConnectionC1013.f81940;
        int iM55979 = C0946.m55979("᩵ۜ") ^ i3;
        int i4 = ((iM55979 ^ i2) * 8223) ^ 983266196;
        int i5 = 2109906328;
        while (true) {
            i = ((((i ^ i2) * 8747) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2061501215:
                case -1720479482:
                    if (C0992.m56110(c18736)) {
                        iM55979 = C0946.m55979("᩹ۜ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-15557)) ^ (-454138598);
                        i5 = 1749720933;
                    } else {
                        iM55979 = C0873.m55680("ۢ᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * 27237) ^ (-1794084830);
                        i5 = -2053546654;
                    }
                    break;
                case -1858710545:
                case 1357653510:
                    if (C0937.f81884) {
                        iM55979 = C0873.m55680("֨ۜ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-19571)) ^ 1149350689;
                        i5 = 756906140;
                    } else {
                        iM55979 = (C0946.m55979("ۛܶ") ^ i2) * (-125);
                        i4 = ((iM55979 ^ i3) * (-3547)) ^ (-1464636590);
                        i5 = 371975680;
                    }
                    break;
                case -1663704506:
                case 1861989357:
                    itM56090 = C0989.m56090(this.f62360);
                    iM55979 = C0873.m55680("ۚ֫") ^ i3;
                    i4 = ((iM55979 ^ i2) * 655) ^ (-989175722);
                    i5 = -1592999198;
                    break;
                case -1492678889:
                case -655721188:
                    RunnableC1014.m56173(abstractC17043);
                    iM55979 = C0873.m55680("ۢ᩹") ^ i2;
                    i4 = ((iM55979 ^ i3) * 7935) ^ 956906086;
                    i5 = 758220718;
                    break;
                case -1421446867:
                case 851497655:
                    if (C1194.f82045 != 0) {
                        iM55979 = (C0946.m55979("ۘ᩹") + i3) * (-19);
                        i4 = ((iM55979 ^ i2) * 15463) ^ (-724302344);
                        i5 = 248887088;
                    } else {
                        iM55979 = (i2 - C0946.m55979("᩷ᩴ")) * 9;
                        i4 = ((iM55979 ^ i3) * 23105) ^ 1794899908;
                        i5 = -1396426932;
                    }
                    break;
                case -1351752016:
                case -760535943:
                    if (C1404.f82149 >= 0) {
                        iM55979 = (C0946.m55979("ۘ᩹") + i3) * (-19);
                        i4 = ((iM55979 ^ i2) * 15463) ^ (-724302344);
                        i5 = 248887088;
                    } else {
                        iM55979 = C0946.m55979("ܿ᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-10179)) ^ (-1213975726);
                        i5 = -1768926224;
                    }
                    break;
                case -1303736776:
                case -825768669:
                    if (C0845.m55584() <= 0) {
                        iM55979 = C0873.m55680("֡᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-23797)) ^ (-771528057);
                        i5 = -6742218;
                    } else {
                        iM55979 = C0946.m55979("֫ۤ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 1129) ^ (-468674862);
                        i5 = -1774213460;
                    }
                    break;
                case -1098889981:
                case 1321079040:
                    if (!RunnableC0897.m55784()) {
                        iM55979 = (C0946.m55979("ۘ᩹") + i3) * (-19);
                        i4 = ((iM55979 ^ i2) * 15463) ^ (-724302344);
                        i5 = 248887088;
                    } else {
                        iM55979 = C0873.m55680("֡᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-23797)) ^ (-771528057);
                        i5 = -6742218;
                    }
                    break;
                case -933250893:
                case 1673231357:
                    RunnableC1014.m56173((AbstractC17043) RunnableC0897.m55785(itM56090));
                    iM55979 = C0873.m55680("ۚ֫") ^ i3;
                    i4 = ((iM55979 ^ i2) * 655) ^ (-989175722);
                    i5 = -1592999198;
                    break;
                case -924141160:
                case 1609621994:
                    C0863.m55636();
                    break;
                case -897773049:
                case 325984959:
                    C0845.m55584();
                    iM55979 = (C0946.m55979("ۛܶ") ^ i2) * (-125);
                    i4 = ((iM55979 ^ i3) * (-3547)) ^ (-1464636590);
                    i5 = 371975680;
                    break;
                case -881458639:
                case 2071985144:
                    if (C0906.f81862 >= 0) {
                        iM55979 = (C0873.m55680("ۚ᩷") + i2) * 9;
                        i4 = ((iM55979 ^ i3) * 17509) ^ (-1083214322);
                        i5 = 747900153;
                    } else {
                        iM55979 = (C0946.m55979("᩵֫") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM55979 ^ i3) * 28711) ^ 520613659;
                        i5 = 1873697949;
                    }
                    break;
                case -712029430:
                case 2053594523:
                    if (C1028.f81950 <= 0) {
                        iM55979 = (C0946.m55979("ۛܶ") ^ i2) * (-125);
                        i4 = ((iM55979 ^ i3) * (-3547)) ^ (-1464636590);
                        i5 = 371975680;
                    } else {
                        iM55979 = (C0873.m55680("֡۠") ^ i3) * 95;
                        i4 = ((iM55979 ^ i2) * (-22715)) ^ (-1215484976);
                        i5 = -436247528;
                    }
                    break;
                case -680250610:
                case 1308355971:
                    if (C0866.m55647(itM56090)) {
                        iM55979 = C0946.m55979("ᩴۧ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 11635) ^ 160420379;
                        i5 = -1890601858;
                    } else {
                        iM55979 = (C0946.m55979("ܳ۫") + i2) * 109;
                        i4 = ((iM55979 ^ i3) * 30581) ^ 1139281358;
                        i5 = -2110679082;
                    }
                    break;
                case -677364595:
                case 1859589436:
                    if (C0967.f81910 >= 0) {
                        iM55979 = (C0946.m55979("ۘ᩹") + i3) * (-19);
                        i4 = ((iM55979 ^ i2) * 15463) ^ (-724302344);
                        i5 = 248887088;
                    } else {
                        iM55979 = (C0873.m55680("᩺ۗ") ^ i3) * (-55);
                        i4 = ((iM55979 ^ i2) * (-11449)) ^ (-1260167410);
                        i5 = 1813541101;
                    }
                    break;
                case -260698355:
                case 1707224142:
                    C0894.m55769();
                    break;
                case -201905398:
                case 1733469581:
                    C0877.m55696();
                    if (C0992.f81922 >= 0) {
                        iM55979 = C0873.m55680("֡᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-23797)) ^ (-771528057);
                        i5 = -6742218;
                    } else {
                        iM55979 = (C0946.m55979("ۛܶ") ^ i2) * (-125);
                        i4 = ((iM55979 ^ i3) * (-3547)) ^ (-1464636590);
                        i5 = 371975680;
                    }
                    break;
                case -140678998:
                case 1816464950:
                    if (C1012.m56134() <= 0) {
                        iM55979 = (C0873.m55680("ۚ᩷") + i2) * 9;
                        i4 = ((iM55979 ^ i3) * 17509) ^ (-1083214322);
                        i5 = 747900153;
                    } else {
                        iM55979 = (C0946.m55979("ۛܶ") ^ i2) * (-125);
                        i4 = ((iM55979 ^ i3) * (-3547)) ^ (-1464636590);
                        i5 = 371975680;
                    }
                    break;
                case 171947369:
                case 1566166016:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = C0873.m55680("ܰܺ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-26329)) ^ 1296678110;
                        i5 = -1269344972;
                    } else {
                        iM55979 = (C0873.m55680("ۛۚ") + i2) * 3;
                        i4 = ((iM55979 ^ i3) * 14219) ^ 1790265380;
                        i5 = 1316804664;
                    }
                    break;
                case 303262394:
                case 697586707:
                    if (RunnableC0897.f81856) {
                        iM55979 = C0946.m55979("ᩴ۠") ^ i3;
                        i4 = ((iM55979 ^ i2) * 20653) ^ 1253092082;
                        i5 = 1202896561;
                    } else {
                        iM55979 = C0873.m55680("֡᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-23797)) ^ (-771528057);
                        i5 = -6742218;
                    }
                    break;
                case 730038130:
                case 1465416149:
                    abstractC17043 = this.f62357;
                    if (abstractC17043 != null) {
                        iM55979 = C0946.m55979("ۗܶ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 21373) ^ (-669321500);
                        i5 = 1274063192;
                    } else {
                        iM55979 = C0873.m55680("ۢ᩹") ^ i2;
                        i4 = ((iM55979 ^ i3) * 7935) ^ 956906086;
                        i5 = 758220718;
                    }
                    break;
                case 1216154834:
                case 2059986245:
                    if (C0877.f81843 >= 0) {
                        iM55979 = (C0946.m55979("ۘ᩹") + i3) * (-19);
                        i4 = ((iM55979 ^ i2) * 15463) ^ (-724302344);
                        i5 = 248887088;
                    } else {
                        iM55979 = (i2 - C0946.m55979("ܽۡ")) * (-7);
                        i4 = ((iM55979 ^ i3) * (-13623)) ^ 582632297;
                        i5 = -137267799;
                    }
                    break;
                case 1227217756:
                case 1768835012:
                    abstractC17044 = this.f62356;
                    if (abstractC17044 != null) {
                        iM55979 = (i2 - C0946.m55979("ۢܺ")) * (-109);
                        i4 = ((iM55979 ^ i3) * 2107) ^ (-1034472235);
                        i5 = 1176547668;
                    } else {
                        iM55979 = C0946.m55979("᩹ۜ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-15557)) ^ (-454138598);
                        i5 = 1749720933;
                    }
                    break;
                default:
                    AbstractC0942.m55966(abstractC17044);
                    iM55979 = C0946.m55979("᩹ۜ") ^ i2;
                    i4 = ((iM55979 ^ i3) * (-15557)) ^ (-454138598);
                    i5 = 1749720933;
                    break;
            }
            return;
        }
    }
}
