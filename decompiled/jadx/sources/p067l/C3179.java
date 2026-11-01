package p067l;

import bin.p000mt.plus.Main;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.֨ۗܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5MV */
/* JADX INFO: loaded from: classes3.dex */
public class C3179 extends AbstractC8202 {

    /* JADX INFO: renamed from: ᩹۠ۜ, reason: not valid java name and contains not printable characters */
    private static final short[] f81847 = {5437, 30115, -17982, -20849, 4897, -30288, -30273, -30278, -30285, 362, 5702, 2333, 2099, -7082, -8687, 8204, 24164, 24171, 24174, 24167, 24178, 24163, 24161, 24169, 24163, 24165, 24167, 24140, 24163, 24175, 24167, 24172, 24167, 24181, 24146, 24163, 24161, 24169, 24163, 24165, 24167, 24140, 24163, 24175, 24167, 24183, 24177, 24167, 24141, 24174, 24166, 24143, 24167, 24182, 24170, 24173, 24166, 24169, 24167, 24167, 24178, 24131, 24178, 24169, 24145, 24171, 24165, 24128, 24174, 24173, 24161, 24169, 24157, 24161, 24174, 24173, 24172, 24167, 24108, 24182, 24175, 24178, 9792, -5034, -1431, -5727, -7529, -914, -16257};

    /* JADX INFO: renamed from: ۖ֫ */
    public AbstractC17043 f6109;

    /* JADX INFO: renamed from: ܺ֫ */
    public AbstractC17043 f6110;

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۡ */
    public final boolean mo5459() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007e A[PHI: r2
      0x007e: PHI (r2v4 java.lang.String) = (r2v3 java.lang.String), (r2v1 java.lang.String), (r2v1 java.lang.String), (r2v1 java.lang.String) binds: [B:20:0x007c, B:16:0x0061, B:14:0x005e, B:8:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x0101 A[PHI: r21
      0x0101: PHI (r21v3 int) = (r21v2 int), (r21v1 int), (r21v1 int) binds: [B:32:0x00ff, B:14:0x005e, B:11:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x01b9 A[PHI: r3 r8 r9 r14 r15
      0x01b9: PHI (r3v5 int) = (r3v2 int), (r3v3 int), (r3v2 int) binds: [B:47:0x01b7, B:24:0x00b5, B:8:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x01b9: PHI (r8v4 int) = (r8v2 int), (r8v1 int), (r8v1 int) binds: [B:47:0x01b7, B:24:0x00b5, B:8:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x01b9: PHI (r9v4 short) = (r9v2 short), (r9v1 short), (r9v1 short) binds: [B:47:0x01b7, B:24:0x00b5, B:8:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x01b9: PHI (r14v4 short[]) = (r14v1 short[]), (r14v2 short[]), (r14v1 short[]) binds: [B:47:0x01b7, B:24:0x00b5, B:8:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x01b9: PHI (r15v4 int) = (r15v1 int), (r15v2 int), (r15v1 int) binds: [B:47:0x01b7, B:24:0x00b5, B:8:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01f2 A[PHI: r6 r7 r11 r12 r13
      0x01f2: PHI (r6v3 int) = (r6v2 int), (r6v1 int), (r6v1 int) binds: [B:51:0x01f0, B:36:0x0136, B:11:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x01f2: PHI (r7v3 int) = (r7v2 int), (r7v1 int), (r7v1 int) binds: [B:51:0x01f0, B:36:0x0136, B:11:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x01f2: PHI (r11v3 short[]) = (r11v1 short[]), (r11v2 short[]), (r11v1 short[]) binds: [B:51:0x01f0, B:36:0x0136, B:11:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x01f2: PHI (r12v3 int) = (r12v1 int), (r12v2 int), (r12v1 int) binds: [B:51:0x01f0, B:36:0x0136, B:11:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x01f2: PHI (r13v3 int) = (r13v1 int), (r13v2 int), (r13v1 int) binds: [B:51:0x01f0, B:36:0x0136, B:11:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0261 A[PHI: r5 r16 r22
      0x0261: PHI (r5v3 short) = (r5v1 short), (r5v1 short), (r5v2 short), (r5v1 short) binds: [B:63:0x025f, B:59:0x0243, B:55:0x0225, B:28:0x00db] A[DONT_GENERATE, DONT_INLINE]
      0x0261: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:63:0x025f, B:59:0x0243, B:55:0x0225, B:28:0x00db] A[DONT_GENERATE, DONT_INLINE]
      0x0261: PHI (r22v5 char) = (r22v3 char), (r22v4 char), (r22v3 char), (r22v3 char) binds: [B:63:0x025f, B:59:0x0243, B:55:0x0225, B:28:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5127() {
        int iM55680;
        int i;
        int i2;
        String strM55792 = null;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        short s2 = 0;
        int i6 = 0;
        short[] sArr = null;
        int i7 = 0;
        int i8 = 0;
        short[] sArr2 = null;
        int i9 = 0;
        int i10 = -273655700;
        int i11 = C1017.f81942;
        int i12 = C1046.f81962;
        int iM55681 = C0873.m55680("۠ۜ") ^ i11;
        int i13 = ((iM55681 ^ i12) * (-11085)) ^ 1736962503;
        int i14 = iM55681 ^ (-1820105982);
        short[] sArr3 = null;
        int i15 = 0;
        int iM55682 = 0;
        char c = 0;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i12) * 9759) >> 31));
            switch (i10) {
                case -2018776808:
                case 1665319862:
                    strM55792 = C0898.m55792(sArr2, i9, i15, i6);
                    if (C0861.m55626()) {
                        iM55680 = (C0873.m55680("ۡ֫") + i11) * (-39);
                        i = ((iM55680 ^ i12) * 11471) ^ 196431355;
                        i2 = 1014174233;
                    } else {
                        iM55680 = (C0873.m55680("ᩴᩳ") + i12) * (-125);
                        i = ((iM55680 ^ i11) * (-3941)) ^ 1489593049;
                        i2 = 1901658130;
                    }
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case -1944398099:
                case -1433092174:
                    C0912.m55833();
                    if (C0989.f81920 >= 0) {
                        iM55680 = (C0873.m55680("ܰ۬") + i12) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM55680 ^ i11) * 2897) ^ (-1707469549);
                        i2 = 1037429126;
                    } else {
                        iM55680 = (C0946.m55979("ᩴۚ") + i11) * (-87);
                        i = ((iM55680 ^ i12) * (-18003)) ^ (-590966469);
                        i2 = 1431537818;
                    }
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case -1687075187:
                case 524923024:
                    int i16 = s + s2;
                    if (i5 - (i16 * i16) < 0) {
                        iM55680 = (C0946.m55979("ۡܽ") ^ i11) * (-95);
                        i = ((iM55680 ^ i12) * (-23327)) ^ 780097223;
                        i2 = -1914369687;
                    } else {
                        iM55680 = (C0873.m55680("ۜ᩸") + i12) * (-71);
                        i = ((iM55680 ^ i11) * 13649) ^ (-1545208200);
                        i2 = 451698716;
                    }
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case -1578192225:
                case -1355298711:
                    i6 = 39560;
                    iM55680 = (C0946.m55979("֫۬") + i12) * (-45);
                    i = ((iM55680 ^ i11) * (-30783)) ^ 1897884677;
                    i2 = 2041545082;
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case -1492695472:
                case -489350641:
                    i3 = s * s;
                    i4 = 418609;
                    if (C1044.f81959 >= 0) {
                        iM55680 = (C0946.m55979("ᩴۚ") + i11) * (-87);
                        i = ((iM55680 ^ i12) * (-18003)) ^ (-590966469);
                        i2 = 1431537818;
                    } else {
                        iM55680 = (C0873.m55680("ۜۜ") + i11) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM55680 ^ i12) * 29923) ^ 104604709;
                        i2 = 755096487;
                    }
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case -1196261484:
                case 310105431:
                    C1028.m56239(this, iM55682 ^ 2127782745);
                    if (C0946.f81894 != 0) {
                        iM55680 = C0946.m55979("᩶֫") ^ i12;
                        i = ((iM55680 ^ i11) * (-4213)) ^ (-1593040272);
                        i2 = 2006015028;
                    } else {
                        iM55680 = C0946.m55979("᩸֨") ^ i11;
                        i = ((iM55680 ^ i12) * (-31439)) ^ (-813304824);
                        i2 = -1788334587;
                    }
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case -1110300782:
                case 658917465:
                    c = 'R';
                    if (C0949.f81897 >= 0) {
                        iM55680 = C0946.m55979("᩶֫") ^ i12;
                        i = ((iM55680 ^ i11) * (-4213)) ^ (-1593040272);
                        i2 = 2006015028;
                    } else {
                        iM55680 = C0946.m55979("ۙۜ") ^ i11;
                        i = ((iM55680 ^ i12) * (-26311)) ^ (-17827405);
                        i2 = -315163119;
                    }
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case -943704286:
                case 1680907957:
                    sArr = f81847;
                    i7 = 83;
                    i8 = 3;
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = (C0946.m55979("ᩴۚ") + i11) * (-87);
                        i = ((iM55680 ^ i12) * (-18003)) ^ (-590966469);
                        i2 = 1431537818;
                    } else {
                        iM55680 = C0873.m55680("ܰ᩹") ^ i11;
                        i = ((iM55680 ^ i12) * 3641) ^ 925642483;
                        i2 = -1347936044;
                    }
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case -883349679:
                case -324327328:
                    m13491(C0946.m55979(strM55792) ^ 2127234633);
                    break;
                case -767423686:
                case 1154619519:
                    sArr2 = f81847;
                    i9 = 86;
                    i15 = 3;
                    if (C0955.f81898) {
                        iM55680 = (i11 - C0873.m55680("ܽۙ")) * 95;
                        i = ((iM55680 ^ i12) * (-30165)) ^ 2030887000;
                        i2 = 1599018719;
                    } else {
                        iM55680 = (i12 - C0946.m55979("۠᩸")) * (-57);
                        i = ((iM55680 ^ i11) * (-12047)) ^ 147648541;
                        i2 = 721027249;
                    }
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case -553736806:
                case -330283478:
                    C1404.m56468();
                    if (C0861.f81831) {
                        iM55680 = (C0873.m55680("ܰ۬") + i12) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM55680 ^ i11) * 2897) ^ (-1707469549);
                        i2 = 1037429126;
                    } else {
                        iM55680 = (C0873.m55680("ۡ֫") + i11) * (-39);
                        i = ((iM55680 ^ i12) * 11471) ^ 196431355;
                        i2 = 1014174233;
                    }
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case -146822409:
                case 1815247230:
                    i6 = 38970;
                    iM55680 = (C0946.m55979("֫۬") + i12) * (-45);
                    i = ((iM55680 ^ i11) * (-30783)) ^ 1897884677;
                    i2 = 2041545082;
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case 119416992:
                case 2115098071:
                    iM55682 = C0873.m55680(C1071.m56336(sArr, i7, i8, i6));
                    if (C0845.f81821 >= 0) {
                        iM55680 = (C0873.m55680("ܰ۬") + i12) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM55680 ^ i11) * 2897) ^ (-1707469549);
                        i2 = 1037429126;
                    } else {
                        iM55680 = C0873.m55680("᩵ᩳ") ^ i12;
                        i = ((iM55680 ^ i11) * 16819) ^ (-1254350422);
                        i2 = -294081619;
                    }
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case 559677286:
                case 1568188190:
                    C0930.m55885();
                    if (C0912.m55833()) {
                        iM55680 = (C0873.m55680("ۡ֫") + i11) * (-39);
                        i = ((iM55680 ^ i12) * 11471) ^ 196431355;
                        i2 = 1014174233;
                    } else {
                        iM55680 = (i11 - C0873.m55680("ܽۙ")) * 95;
                        i = ((iM55680 ^ i12) * (-30165)) ^ 2030887000;
                        i2 = 1599018719;
                    }
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case 675400317:
                case 1213644175:
                    int i17 = i3 + i4;
                    i5 = i17 + i17;
                    s2 = 647;
                    if (C0949.m56012()) {
                        iM55680 = (i11 - C0873.m55680("ܽۙ")) * 95;
                        i = ((iM55680 ^ i12) * (-30165)) ^ 2030887000;
                        i2 = 1599018719;
                    } else {
                        iM55680 = (C0873.m55680("ۘ᩻") ^ i11) * (-71);
                        i = ((iM55680 ^ i12) * 22495) ^ (-119014041);
                        i2 = 1308841964;
                    }
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case 986947605:
                case 1016015224:
                    s = sArr3[c];
                    if (C0861.f81831) {
                        iM55680 = (C0946.m55979("ۙܳ") ^ i12) * 23;
                        i = ((iM55680 ^ i11) * 18769) ^ (-1089007426);
                        i2 = 784462036;
                    } else {
                        iM55680 = C0946.m55979("᩶֫") ^ i12;
                        i = ((iM55680 ^ i11) * (-4213)) ^ (-1593040272);
                        i2 = 2006015028;
                    }
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case 1111143604:
                case 1140568976:
                    sArr3 = f81847;
                    if (C1012.f81938 >= 0) {
                        iM55680 = C0946.m55979("᩶֫") ^ i12;
                        i = ((iM55680 ^ i11) * (-4213)) ^ (-1593040272);
                        i2 = 2006015028;
                    } else {
                        iM55680 = C0873.m55680("᩻۫") ^ i12;
                        i = ((iM55680 ^ i11) * 6125) ^ 1345565618;
                        i2 = -350714139;
                    }
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                case 1530564591:
                case 1924612661:
                    C1229.m56410();
                    RunnableC0871.m55672();
                    iM55680 = (C0873.m55680("ۡ֫") + i11) * (-39);
                    i = ((iM55680 ^ i12) * 11471) ^ 196431355;
                    i2 = 1014174233;
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    break;
                default:
                    ViewOnClickListenerC0939.m55941();
                    break;
            }
            return;
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۠ */
    public final C13596 mo5124() {
        return C24966.f79714;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x018e A[PHI: r3 r4 r6
      0x018e: PHI (r3v4 short) = (r3v3 short), (r3v2 short), (r3v2 short) binds: [B:58:0x018c, B:53:0x0157, B:11:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x018e: PHI (r4v4 int) = (r4v3 int), (r4v2 int), (r4v2 int) binds: [B:58:0x018c, B:53:0x0157, B:11:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x018e: PHI (r6v5 int) = (r6v2 int), (r6v4 int), (r6v2 int) binds: [B:58:0x018c, B:53:0x0157, B:11:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x01c1 A[PHI: r2 r7
      0x01c1: PHI (r2v4 char) = (r2v3 char), (r2v2 char), (r2v2 char) binds: [B:62:0x01bf, B:49:0x0138, B:16:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x01c1: PHI (r7v4 short) = (r7v2 short), (r7v3 short), (r7v2 short) binds: [B:62:0x01bf, B:49:0x0138, B:16:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x01ef A[PHI: r1 r5
      0x01ef: PHI (r1v4 short[]) = (r1v3 short[]), (r1v2 short[]) binds: [B:66:0x01ed, B:7:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x01ef: PHI (r5v3 int) = (r5v2 int), (r5v5 int) binds: [B:66:0x01ed, B:7:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if (p067l.RunnableC0871.f81839 >= 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (p067l.C1025.f81947 < 0) goto L11;
     */
    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C18736 mo5458(Exception exc) {
        int iM55979;
        int i;
        int i2;
        Exception c3924 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        short s2 = 0;
        int i6 = 0;
        int i7 = 938698249;
        int i8 = ServiceConnectionC1013.f81940;
        int i9 = C1964.f83032;
        int iM55680 = (i8 - C0873.m55680("֫ܳ")) * (-127);
        int i10 = ((iM55680 ^ i9) * 27969) ^ 1315943264;
        int i11 = -410171936;
        while (true) {
            int i12 = iM55680 ^ i11;
            while (true) {
                i7 = ((((i7 ^ i9) * 4321) >> 31) & i10) ^ i12;
                switch (i7) {
                    case -1942403436:
                    case 587103420:
                        i6 = 9422;
                        iM55979 = C0873.m55680("۠ۛ") ^ i9;
                        i = ((iM55979 ^ i8) * (-2363)) ^ 1973572801;
                        i2 = -1778956208;
                        i12 = iM55979 ^ i2;
                        i10 = i;
                        break;
                    case -1865213060:
                    case 1981863250:
                        C1017.m56187();
                        break;
                    case -1794000404:
                    case -1186235682:
                        return C18736.m42764(c3924);
                    case -1764049048:
                    case 1507371555:
                        if (C0927.f81875) {
                            iM55979 = (i9 - C0873.m55680("ۗܺ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i = ((iM55979 ^ i8) * 25173) ^ (-467640733);
                            i2 = -862476496;
                        } else {
                            iM55979 = C0946.m55979("֡۠") ^ i8;
                            i = ((iM55979 ^ i9) * (-25147)) ^ 1870123921;
                            i2 = -1838261613;
                        }
                        i12 = iM55979 ^ i2;
                        i10 = i;
                        break;
                    case -1755723391:
                    case -1609263800:
                        if (exc instanceof C9567) {
                            iM55979 = (i8 - C0873.m55680("֫᩺")) * (-107);
                            i = ((iM55979 ^ i9) * (-6763)) ^ (-1785730257);
                            i2 = 173705213;
                        } else {
                            c3924 = exc;
                            iM55979 = C0946.m55979("ۖۤ") ^ i9;
                            i = ((iM55979 ^ i8) * (-2403)) ^ 2078637883;
                            i2 = -1594726975;
                        }
                        i12 = iM55979 ^ i2;
                        i10 = i;
                        break;
                    case -1696695778:
                    case 1381094549:
                        i6 = 64808;
                        iM55979 = C0873.m55680("۠ۛ") ^ i9;
                        i = ((iM55979 ^ i8) * (-2363)) ^ 1973572801;
                        i2 = -1778956208;
                        i12 = iM55979 ^ i2;
                        i10 = i;
                        break;
                    case -1579067745:
                    case 1378369903:
                        C1044.m56286();
                        return null;
                    case -1275544318:
                    case 2086135705:
                        C1036.m56257();
                        if (C0866.f81837 < 0) {
                        }
                        iM55979 = (C0873.m55680("ۧۘ") + i9) * 47;
                        i = ((iM55979 ^ i8) * (-4255)) ^ 745363980;
                        i2 = 1161271443;
                        i12 = iM55979 ^ i2;
                        i10 = i;
                        break;
                    case -1062086295:
                    case -18191320:
                        short[] sArr2 = f81847;
                        if (C1124.f82007 < 0 && C0917.m55854()) {
                            String strM55792 = C0898.m55792(sArr2, 1, 3, i6);
                            if (C1124.m56367() < 0) {
                                c3924 = new C3924(C0946.m55979(strM55792) ^ 2119646779);
                                iM55979 = C0946.m55979("ۖۤ") ^ i9;
                                i = ((iM55979 ^ i8) * (-2403)) ^ 2078637883;
                                i2 = -1594726975;
                                i12 = iM55979 ^ i2;
                                i10 = i;
                            }
                            iM55979 = (i9 - C0873.m55680("ۗܺ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i = ((iM55979 ^ i8) * 25173) ^ (-467640733);
                            i2 = -862476496;
                            i12 = iM55979 ^ i2;
                            i10 = i;
                        }
                        iM55979 = C0873.m55680("ۛܰ") ^ i8;
                        i = ((iM55979 ^ i9) * (-23113)) ^ (-863212623);
                        i2 = -1868510884;
                        i12 = iM55979 ^ i2;
                        i10 = i;
                        break;
                    case -1016515583:
                    case 2116109347:
                        int i13 = i3 + i4;
                        i5 = i13 + i13;
                        if (C0873.f81841 <= 0) {
                            iM55979 = (C0873.m55680("ۧۘ") + i9) * 47;
                            i = ((iM55979 ^ i8) * (-4255)) ^ 745363980;
                            i2 = 1161271443;
                        } else {
                            iM55979 = (C0873.m55680("᩷۫") + i9) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                            i = ((iM55979 ^ i8) * 4369) ^ (-1900164696);
                            i2 = 1190945197;
                        }
                        i12 = iM55979 ^ i2;
                        i10 = i;
                        break;
                    case -713292586:
                    case -213664556:
                        RunnableC1014.m56177();
                        iM55979 = (C0873.m55680("ۧۘ") + i9) * 47;
                        i = ((iM55979 ^ i8) * (-4255)) ^ 745363980;
                        i2 = 1161271443;
                        i12 = iM55979 ^ i2;
                        i10 = i;
                        break;
                    case -380058228:
                    case 1728826181:
                        s2 = 6412;
                        if (C1124.f82007 >= 0) {
                            iM55979 = C0873.m55680("ۛܰ") ^ i8;
                            i = ((iM55979 ^ i9) * (-23113)) ^ (-863212623);
                            i2 = -1868510884;
                        } else {
                            iM55979 = C0946.m55979("᩺ܰ") ^ i9;
                            i = ((iM55979 ^ i8) * 19655) ^ (-25580347);
                            i2 = 996130172;
                        }
                        i12 = iM55979 ^ i2;
                        i10 = i;
                        break;
                    case 43412195:
                    case 1825199888:
                        C1404.m56468();
                        break;
                    case 247431273:
                    case 540864047:
                        int i14 = s + s2;
                        if (i5 - (i14 * i14) < 0) {
                            iM55979 = (C0873.m55680("ۧ۟") + i8) * (-49);
                            i = ((iM55979 ^ i9) * (-15483)) ^ 1933479500;
                            i2 = 1048689190;
                        } else {
                            iM55979 = C0946.m55979("۬ܺ") ^ i8;
                            i = ((iM55979 ^ i9) * 18759) ^ 1528191715;
                            i2 = -838249470;
                        }
                        i12 = iM55979 ^ i2;
                        i10 = i;
                        break;
                    case 618094545:
                    case 2123963068:
                        sArr = f81847;
                        if (C1044.f81959 >= 0) {
                            iM55979 = C0873.m55680("ܳۡ") ^ i9;
                            i = ((iM55979 ^ i8) * 4077) ^ (-1037042825);
                            i2 = 1136866751;
                        } else {
                            iM55979 = C0946.m55979("۫ܿ") ^ i9;
                            i = ((iM55979 ^ i8) * 8903) ^ 546453895;
                            i2 = 321930216;
                        }
                        i12 = iM55979 ^ i2;
                        i10 = i;
                        break;
                    case 651401407:
                    case 1787866985:
                        c = 0;
                        if (C1036.f81953 >= 0) {
                            iM55979 = C0873.m55680("ۛܰ") ^ i8;
                            i = ((iM55979 ^ i9) * (-23113)) ^ (-863212623);
                            i2 = -1868510884;
                        } else {
                            iM55979 = C0946.m55979("᩻ܳ") ^ i9;
                            i = ((iM55979 ^ i8) * (-17941)) ^ (-1004619229);
                            i2 = 486438057;
                        }
                        i12 = iM55979 ^ i2;
                        i10 = i;
                        break;
                    case 689851986:
                    case 1128989672:
                        s = sArr[c];
                        i3 = s * s;
                        if (ViewOnClickListenerC0939.f81888 <= 0) {
                            iM55979 = (C0873.m55680("ۧۘ") + i9) * 47;
                            i = ((iM55979 ^ i8) * (-4255)) ^ 745363980;
                            i2 = 1161271443;
                        } else {
                            iM55979 = (C0946.m55979("ۙۗ") + i8) * 53;
                            i = ((iM55979 ^ i9) * 12479) ^ (-226937507);
                            i2 = 1336077468;
                        }
                        i12 = iM55979 ^ i2;
                        i10 = i;
                        break;
                    default:
                        i4 = 41113744;
                        if (C0947.f81895) {
                            iM55979 = C0873.m55680("ܳۡ") ^ i9;
                            i = ((iM55979 ^ i8) * 4077) ^ (-1037042825);
                            i2 = 1136866751;
                        } else {
                            iM55979 = C0946.m55979("ܿܽ") ^ i8;
                            i = ((iM55979 ^ i9) * 22879) ^ 885669297;
                            i2 = 798893743;
                        }
                        i12 = iM55979 ^ i2;
                        i10 = i;
                        break;
                }
            }
            iM55680 = (i8 - C0946.m55979("ۗۖ")) * 85;
            i10 = ((iM55680 ^ i9) * 16437) ^ 1515861244;
            i11 = 2071451379;
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        int i = -1734193717;
        int i2 = C1229.f82066;
        int i3 = C0967.f81910;
        int iM55680 = C0873.m55680("᩻᩶") ^ i3;
        int i4 = ((iM55680 ^ i2) * (-19995)) ^ 1856005451;
        int i5 = -1693204028;
        while (true) {
            i = ((((i ^ i2) * 29687) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2072721469:
                case -1481754249:
                    C0930.m55885();
                    if (!C1024.f81946) {
                        iM55680 = C0946.m55979("ۛ۠") ^ i3;
                        i4 = ((iM55680 ^ i2) * 15907) ^ (-2021083135);
                        i5 = 1243484348;
                    } else {
                        iM55680 = (C0873.m55680("᩵᩷") ^ i2) * (-35);
                        i4 = ((iM55680 ^ i3) * 28277) ^ (-2064668264);
                        i5 = 489850918;
                    }
                    break;
                case -1596324393:
                case -189196240:
                    if (C0863.f81833 <= 0) {
                        iM55680 = (C0873.m55680("᩵᩷") ^ i2) * (-35);
                        i4 = ((iM55680 ^ i3) * 28277) ^ (-2064668264);
                        i5 = 489850918;
                    } else {
                        iM55680 = (C0873.m55680("ۙ۬") + i2) * (-107);
                        i4 = ((iM55680 ^ i3) * 15293) ^ 182400846;
                        i5 = 1511675232;
                    }
                    break;
                case -1531138138:
                case -1233037417:
                    C1929.m56553();
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = C0946.m55979("ۛ۠") ^ i3;
                        i4 = ((iM55680 ^ i2) * 15907) ^ (-2021083135);
                        i5 = 1243484348;
                    } else {
                        iM55680 = C0873.m55680("᩺֫") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-30827)) ^ (-342295948);
                        i5 = -1364888244;
                    }
                    break;
                case -1203507886:
                case -98846622:
                    if (C0947.m55997()) {
                        iM55680 = C0873.m55680("ᩴᩳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-20241)) ^ (-1846974487);
                        i5 = -479811687;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ۗܽ")) * 53;
                        i4 = ((iM55680 ^ i2) * (-18591)) ^ 589775937;
                        i5 = -983309562;
                    }
                    break;
                case -1187552268:
                case 139137884:
                    if (C0927.f81875) {
                        iM55680 = C0873.m55680("ᩴᩳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-20241)) ^ (-1846974487);
                        i5 = -479811687;
                    } else {
                        iM55680 = (C0873.m55680("֫ۙ") + i2) * (-55);
                        i4 = ((iM55680 ^ i3) * 21703) ^ (-1318962707);
                        i5 = 938041252;
                    }
                    break;
                case -1044774003:
                case -1011130962:
                    C0967.m56074();
                    iM55680 = C0873.m55680("᩺֫") ^ i2;
                    i4 = ((iM55680 ^ i3) * (-30827)) ^ (-342295948);
                    i5 = -1364888244;
                    break;
                case -934451961:
                case 728870954:
                    C1025.m56229(c18107, C1404.m56460(this.f6110));
                    c18107.m41241();
                    iM55680 = (C0946.m55979("᩺ܳ") + i3) * (-15);
                    i4 = ((iM55680 ^ i2) * 30165) ^ (-1446311020);
                    i5 = 121603388;
                    break;
                case -884050033:
                case 1757487538:
                    C0873.m55678();
                    if (C0894.f81854 < 0) {
                        iM55680 = (C0873.m55680("᩵᩷") ^ i2) * (-35);
                        i4 = ((iM55680 ^ i3) * 28277) ^ (-2064668264);
                        i5 = 489850918;
                    } else {
                        iM55680 = C0946.m55979("᩻۠") ^ i2;
                        i4 = ((iM55680 ^ i3) * 19455) ^ (-1976914018);
                        i5 = 375244789;
                    }
                    break;
                case -703055295:
                case 1911948695:
                    break;
                case -333071304:
                case 1323401292:
                    if (C0992.m56110(c18736)) {
                        iM55680 = C0946.m55979("ܿ᩹") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-3887)) ^ 1765120297;
                        i5 = -1443852356;
                    } else {
                        iM55680 = (C0946.m55979("᩺ܳ") + i3) * (-15);
                        i4 = ((iM55680 ^ i2) * 30165) ^ (-1446311020);
                        i5 = 121603388;
                    }
                    break;
                case -218678631:
                case 932594667:
                    if (C1046.f81962 <= 0) {
                        iM55680 = (C0873.m55680("᩵᩷") ^ i2) * (-35);
                        i4 = ((iM55680 ^ i3) * 28277) ^ (-2064668264);
                        i5 = 489850918;
                    } else {
                        iM55680 = C0946.m55979("᩹᩻") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-16633)) ^ 855230395;
                        i5 = -2026145798;
                    }
                    break;
                case 180273072:
                case 1720235056:
                    if (C1017.f81942 >= 0) {
                        iM55680 = C0873.m55680("᩺֫") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-30827)) ^ (-342295948);
                        i5 = -1364888244;
                    } else {
                        iM55680 = C0946.m55979("ۧܺ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-9525)) ^ (-825405435);
                        i5 = -359524875;
                    }
                    break;
                case 211611788:
                case 1324444000:
                    if (C1025.m56230()) {
                        iM55680 = C0946.m55979("ۛ۠") ^ i3;
                        i4 = ((iM55680 ^ i2) * 15907) ^ (-2021083135);
                        i5 = 1243484348;
                    } else {
                        iM55680 = (i2 - C0946.m55979("۠ۚ")) * (-113);
                        i4 = ((iM55680 ^ i3) * 5779) ^ (-862489046);
                        i5 = 7164759;
                    }
                    break;
                case 280250059:
                case 1015951848:
                    if (C0949.m56012()) {
                        iM55680 = C0873.m55680("ᩴᩳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-20241)) ^ (-1846974487);
                        i5 = -479811687;
                    } else {
                        iM55680 = C0946.m55979("ܶ᩻") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-3301)) ^ (-1168114990);
                        i5 = -1152483086;
                    }
                    break;
                case 349520523:
                case 1970755156:
                    if (C0906.f81862 >= 0) {
                        iM55680 = C0873.m55680("ᩴᩳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-20241)) ^ (-1846974487);
                        i5 = -479811687;
                    } else {
                        iM55680 = C0946.m55979("֫ܿ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 19007) ^ (-1924653506);
                        i5 = 729709431;
                    }
                    break;
                case 402698721:
                case 1053386129:
                    if (m13478(c18107)) {
                        iM55680 = C0873.m55680("ۢۢ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-18447)) ^ 1494528270;
                        i5 = -1596611522;
                    } else {
                        iM55680 = (C0946.m55979("᩺ܳ") + i3) * (-15);
                        i4 = ((iM55680 ^ i2) * 30165) ^ (-1446311020);
                        i5 = 121603388;
                    }
                    break;
                case 525765242:
                case 1331403268:
                    C0863.m55643();
                    C1036.m56257();
                    break;
                case 764670176:
                case 1923735200:
                    if (C0937.f81884) {
                        iM55680 = C0946.m55979("ۨ᩷") ^ i2;
                        i4 = ((iM55680 ^ i3) * 25225) ^ 1649757192;
                        i5 = 1574275568;
                    } else {
                        iM55680 = C0873.m55680("ᩴᩳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-20241)) ^ (-1846974487);
                        i5 = -479811687;
                    }
                    break;
                default:
                    if (C1229.f82066 >= 0) {
                        iM55680 = C0946.m55979("ۛ۠") ^ i3;
                        i4 = ((iM55680 ^ i2) * 15907) ^ (-2021083135);
                        i5 = 1243484348;
                    } else {
                        iM55680 = C0873.m55680("᩷۠") ^ i3;
                        i4 = ((iM55680 ^ i2) * 28047) ^ 161996526;
                        i5 = 848335081;
                    }
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
        int i = 993407820;
        int i2 = C0873.f81841;
        int i3 = C1053.f81965;
        int iM55680 = (i3 - C0873.m55680("ۜܶ")) * (-81);
        int i4 = ((iM55680 ^ i2) * 13681) ^ (-882407494);
        int i5 = 1988659097;
        while (true) {
            i = ((((i ^ i2) * 2407) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -1793519082:
                case 585032224:
                    if (C1028.m56247() >= 0) {
                        iM55680 = C0873.m55680("᩵۟") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-19667)) ^ (-398535727);
                        i5 = 1508267743;
                    } else {
                        iM55680 = C0946.m55979("ᩴܳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-14925)) ^ 659788576;
                        i5 = 1179231041;
                    }
                    break;
                case -1423069789:
                case 1280937012:
                    RunnableC1014.m56173(abstractC17043);
                    iM55680 = (C0873.m55680("᩶ۙ") + i2) * 63;
                    i4 = ((iM55680 ^ i3) * 16647) ^ (-1126801293);
                    i5 = -1575694559;
                    break;
                case -1414820103:
                case -869171852:
                    C0989.m56095();
                    iM55680 = C0946.m55979("۫ۨ") ^ i3;
                    i4 = ((iM55680 ^ i2) * (-18843)) ^ 2137438215;
                    i5 = -980448089;
                    break;
                case -1326036059:
                case 429133259:
                    if (C1024.m56209() >= 0) {
                        iM55680 = C0873.m55680("᩵۟") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-19667)) ^ (-398535727);
                        i5 = 1508267743;
                    } else {
                        iM55680 = (C0873.m55680("ۜܰ") + i2) * (-109);
                        i4 = ((iM55680 ^ i3) * 29461) ^ (-461680796);
                        i5 = 443550208;
                    }
                    break;
                case -1147983914:
                case 55935635:
                    ViewOnClickListenerC0939.m55941();
                    if (C0949.f81897 >= 0) {
                        iM55680 = C0946.m55979("۫ۨ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-18843)) ^ 2137438215;
                        i5 = -980448089;
                    } else {
                        iM55680 = C0873.m55680("֡᩷") ^ i3;
                        i4 = ((iM55680 ^ i2) * 31673) ^ (-201105323);
                        i5 = -127034198;
                    }
                    break;
                case -921139405:
                case 186091349:
                    if (C0861.f81831) {
                        iM55680 = C0873.m55680("᩸ۡ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-2489)) ^ 11918777;
                        i5 = 699519034;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ۧ֨")) * 55;
                        i4 = ((iM55680 ^ i2) * 26683) ^ 1315243148;
                        i5 = 365044827;
                    }
                    break;
                case -765538933:
                case 710904922:
                    if (C0937.m55918() >= 0) {
                        iM55680 = (C0873.m55680("ۡۡ") + i2) * (-37);
                        i4 = ((iM55680 ^ i3) * 27503) ^ 441819037;
                        i5 = -1764017562;
                    } else {
                        iM55680 = C0946.m55979("۫ۨ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-18843)) ^ 2137438215;
                        i5 = -980448089;
                    }
                    break;
                case -687644175:
                case 1324978249:
                    RunnableC1014.m56173(abstractC17044);
                    iM55680 = C0873.m55680("᩸ۤ") ^ i2;
                    i4 = ((iM55680 ^ i3) * 247) ^ 1755367603;
                    i5 = 836246820;
                    break;
                case -637652660:
                case 746463841:
                    if (C1046.m56302() != 0) {
                        iM55680 = (C0873.m55680("ۡۡ") + i2) * (-37);
                        i4 = ((iM55680 ^ i3) * 27503) ^ 441819037;
                        i5 = -1764017562;
                    } else {
                        iM55680 = C0873.m55680("֨ܽ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 21659) ^ 2083898271;
                        i5 = 1369955974;
                    }
                    break;
                case -510665284:
                case 342885357:
                    if (C0992.m56110(c18736)) {
                        iM55680 = C0873.m55680("᩸ۤ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 247) ^ 1755367603;
                        i5 = 836246820;
                    } else {
                        iM55680 = C0873.m55680("ۗܿ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 27001) ^ (-2043670842);
                        i5 = 503687390;
                    }
                    break;
                case -370734962:
                case 710499006:
                    abstractC17044 = this.f6110;
                    if (abstractC17044 != null) {
                        iM55680 = (i2 - C0946.m55979("᩸֡")) * (-35);
                        i4 = ((iM55680 ^ i3) * (-9641)) ^ (-1720254321);
                        i5 = 1296260344;
                    } else {
                        iM55680 = C0873.m55680("᩸ۤ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 247) ^ 1755367603;
                        i5 = 836246820;
                    }
                    break;
                case -322253359:
                case 332532114:
                    if (C0861.f81831) {
                        iM55680 = C0946.m55979("۫ۡ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 13447) ^ (-1009890626);
                        i5 = -810999802;
                    } else {
                        iM55680 = C0873.m55680("᩵۟") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-19667)) ^ (-398535727);
                        i5 = 1508267743;
                    }
                    break;
                case -237799214:
                case 234634698:
                    AbstractC0942.m55971();
                    C1036.m56257();
                    break;
                case -177658033:
                case 1922474020:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55680 = C0873.m55680("᩵۟") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-19667)) ^ (-398535727);
                        i5 = 1508267743;
                    } else {
                        iM55680 = C0946.m55979("۫ۨ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-18843)) ^ 2137438215;
                        i5 = -980448089;
                    }
                    break;
                case 14079962:
                case 1214245179:
                    if (C0863.m55643()) {
                        iM55680 = (i2 - C0873.m55680("ܺۨ")) * (-93);
                        i4 = ((iM55680 ^ i3) * 27181) ^ 1127472369;
                        i5 = 444398565;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ۧ֨")) * 55;
                        i4 = ((iM55680 ^ i2) * 26683) ^ 1315243148;
                        i5 = 365044827;
                    }
                    break;
                case 172367187:
                case 1802225934:
                    abstractC17043 = this.f6109;
                    if (abstractC17043 != null) {
                        iM55680 = (C0946.m55979("᩶֫") ^ i3) * (-27);
                        i4 = ((iM55680 ^ i2) * (-22069)) ^ 73231946;
                        i5 = -757820142;
                    } else {
                        iM55680 = (C0873.m55680("᩶ۙ") + i2) * 63;
                        i4 = ((iM55680 ^ i3) * 16647) ^ (-1126801293);
                        i5 = -1575694559;
                    }
                    break;
                case 280813236:
                case 2017234926:
                    if (RunnableC0871.m55672() >= 0) {
                        iM55680 = (i3 - C0873.m55680("ۧ֨")) * 55;
                        i4 = ((iM55680 ^ i2) * 26683) ^ 1315243148;
                        i5 = 365044827;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ܳ۟")) * (-57);
                        i4 = ((iM55680 ^ i2) * (-27659)) ^ 131900588;
                        i5 = 281078348;
                    }
                    break;
                case 486176568:
                case 2042990779:
                    if (C0845.f81821 >= 0) {
                        iM55680 = C0873.m55680("᩵۟") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-19667)) ^ (-398535727);
                        i5 = 1508267743;
                    } else {
                        iM55680 = C0873.m55680("ۗ۠") ^ i3;
                        i4 = ((iM55680 ^ i2) * 29351) ^ 1966778684;
                        i5 = -308100467;
                    }
                    break;
                case 502186619:
                case 2046294323:
                    if (C0890.f81849 != 0) {
                        iM55680 = C0873.m55680("᩵۟") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-19667)) ^ (-398535727);
                        i5 = 1508267743;
                    } else {
                        iM55680 = (i3 - C0946.m55979("᩻᩸")) * (-17);
                        i4 = ((iM55680 ^ i2) * (-27405)) ^ (-1241810440);
                        i5 = -2033230241;
                    }
                    break;
                case 674969422:
                case 1198449800:
                    if (C0890.f81849 != 0) {
                        iM55680 = C0873.m55680("᩵۟") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-19667)) ^ (-398535727);
                        i5 = 1508267743;
                    } else {
                        iM55680 = (C0873.m55680("۫ܶ") + i3) * 85;
                        i4 = ((iM55680 ^ i2) * (-29607)) ^ 1415691298;
                        i5 = -1909880354;
                    }
                    break;
                default:
                    C0863.m55636();
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x007c  */
    /* JADX WARN: Code duplicated, block: B:57:0x020c A[PHI: r1 r2 r10 r14
      0x020c: PHI (r1v7 java.lang.String) = 
      (r1v2 java.lang.String)
      (r1v4 java.lang.String)
      (r1v2 java.lang.String)
      (r1v2 java.lang.String)
      (r1v2 java.lang.String)
     binds: [B:56:0x020a, B:41:0x0175, B:15:0x0094, B:6:0x0055, B:87:0x020c] A[DONT_GENERATE, DONT_INLINE]
      0x020c: PHI (r2v4 java.lang.String) = 
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v6 java.lang.String)
     binds: [B:56:0x020a, B:41:0x0175, B:15:0x0094, B:6:0x0055, B:87:0x020c] A[DONT_GENERATE, DONT_INLINE]
      0x020c: PHI (r10v5 int) = (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:56:0x020a, B:41:0x0175, B:15:0x0094, B:6:0x0055, B:87:0x020c] A[DONT_GENERATE, DONT_INLINE]
      0x020c: PHI (r14v4 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]), (r14v6 short[]) binds: [B:56:0x020a, B:41:0x0175, B:15:0x0094, B:6:0x0055, B:87:0x020c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x023f A[PHI: r5 r6 r11 r12 r22
      0x023f: PHI (r5v3 int) = (r5v2 int), (r5v2 int), (r5v4 int) binds: [B:60:0x023d, B:52:0x01eb, B:29:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x023f: PHI (r6v3 int) = (r6v2 int), (r6v2 int), (r6v4 int) binds: [B:60:0x023d, B:52:0x01eb, B:29:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x023f: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:60:0x023d, B:52:0x01eb, B:29:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x023f: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:60:0x023d, B:52:0x01eb, B:29:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x023f: PHI (r22v5 short) = (r22v4 short), (r22v3 short), (r22v3 short) binds: [B:60:0x023d, B:52:0x01eb, B:29:0x0104] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0277 A[PHI: r3 r4 r7 r8 r15 r16 r17
      0x0277: PHI (r3v4 java.lang.String[]) = 
      (r3v2 java.lang.String[])
      (r3v2 java.lang.String[])
      (r3v3 java.lang.String[])
      (r3v2 java.lang.String[])
      (r3v2 java.lang.String[])
     binds: [B:64:0x0275, B:33:0x0129, B:25:0x00e1, B:21:0x00b7, B:13:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0277: PHI (r4v5 java.lang.String) = 
      (r4v2 java.lang.String)
      (r4v4 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
     binds: [B:64:0x0275, B:33:0x0129, B:25:0x00e1, B:21:0x00b7, B:13:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0277: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:64:0x0275, B:33:0x0129, B:25:0x00e1, B:21:0x00b7, B:13:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0277: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:64:0x0275, B:33:0x0129, B:25:0x00e1, B:21:0x00b7, B:13:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0277: PHI (r15v4 short[]) = (r15v2 short[]), (r15v2 short[]), (r15v3 short[]), (r15v2 short[]), (r15v2 short[]) binds: [B:64:0x0275, B:33:0x0129, B:25:0x00e1, B:21:0x00b7, B:13:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0277: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:64:0x0275, B:33:0x0129, B:25:0x00e1, B:21:0x00b7, B:13:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0277: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:64:0x0275, B:33:0x0129, B:25:0x00e1, B:21:0x00b7, B:13:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo5123() {
        int iM55680;
        int i;
        int i2;
        int i3 = C1012.f81938;
        int i4 = C1036.f81953;
        int iM55979 = C0946.m55979("ۧ۟") ^ i4;
        int i5 = ((iM55979 ^ i3) * 3049) ^ (-1750254262);
        String strM55970 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM55979 ^ (-1733697723);
        int iM559710 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        char c = 0;
        int i13 = -1012769866;
        short s = 0;
        String[] strArr = null;
        short[] sArr3 = null;
        int i14 = 0;
        String strM13453 = null;
        String strM55822 = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i3) * (-26987)) >> 31));
            switch (i13) {
                case -1976430323:
                case 60002477:
                    i11 = i10 * i10;
                    i12 = s * 2;
                    if (C0854.f81826 != 0) {
                        iM55680 = (i4 - C0946.m55979("᩺ܺ")) * (-85);
                        i = ((iM55680 ^ i3) * (-11679)) ^ 1962912565;
                        i2 = -1586273819;
                    } else {
                        iM55680 = (C0873.m55680("۟ۧ") ^ i3) * 89;
                        i = ((iM55680 ^ i4) * 10529) ^ 1932849627;
                        i2 = 1276272449;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1929746558:
                case 1541937410:
                    s = sArr[c];
                    if (C1025.f81947 >= 0) {
                        iM55680 = (i4 - C0946.m55979("᩺ܺ")) * (-85);
                        i = ((iM55680 ^ i3) * (-11679)) ^ 1962912565;
                        i2 = -1586273819;
                    } else {
                        iM55680 = (i4 - C0873.m55680("᩹ۜ")) * (-21);
                        i = ((iM55680 ^ i3) * 13689) ^ 162388306;
                        i2 = 755255528;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1790295453:
                case 1297612459:
                    i8 = 12;
                    i9 = 3;
                    if (C0866.f81837 >= 0) {
                        iM55680 = (C0946.m55979("ܽ۟") ^ i3) * (-39);
                        i = ((iM55680 ^ i4) * (-13951)) ^ 1058437278;
                        i2 = -357229885;
                    } else {
                        iM55680 = C0946.m55979("ۘ᩶") ^ i4;
                        i = ((iM55680 ^ i3) * 2057) ^ (-1418464144);
                        i2 = 133805316;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1682147471:
                case 1900695015:
                    i14 = 13577;
                    iM55680 = (i3 - C0873.m55680("ܶܳ")) * 5;
                    i = ((iM55680 ^ i4) * (-7863)) ^ 385050188;
                    i2 = 560744296;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1583878519:
                case 1809300172:
                    iM559710 = C0946.m55979(strM55970);
                    i7 = 2097618106;
                    if (C0854.f81826 != 0) {
                        iM55680 = (i4 - C0946.m55979("᩺ܺ")) * (-85);
                        i = ((iM55680 ^ i3) * (-11679)) ^ 1962912565;
                        i2 = -1586273819;
                    } else {
                        iM55680 = (C0873.m55680("ܰۢ") + i4) * (-45);
                        i = ((iM55680 ^ i3) * 3629) ^ 1276324841;
                        i2 = -1058890838;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1557894957:
                case -748683853:
                    i14 = 35286;
                    iM55680 = (i3 - C0873.m55680("ܶܳ")) * 5;
                    i = ((iM55680 ^ i4) * (-7863)) ^ 385050188;
                    i2 = 560744296;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1475542657:
                case -1133296223:
                    strM55822 = C0912.m55822(f81847, 5, 4, i14);
                    if (C1003.f81929 <= 0) {
                        iM55680 = C0946.m55979("۬ܿ") ^ i3;
                        i = ((iM55680 ^ i4) * (-449)) ^ 1694817845;
                        i2 = -945187462;
                    } else {
                        iM55680 = C0946.m55979("ۚۜ") ^ i4;
                        i = ((iM55680 ^ i3) * 11131) ^ 1681960120;
                        i2 = -2119111213;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1458866769:
                case 1570312367:
                    strArr = new String[]{strM13453, ServiceConnectionC1013.m56156(iM559710 ^ i7)};
                    sArr2 = f81847;
                    if (C0955.m56025()) {
                        iM55680 = (C0946.m55979("ܽ۟") ^ i3) * (-39);
                        i = ((iM55680 ^ i4) * (-13951)) ^ 1058437278;
                        i2 = -357229885;
                    } else {
                        iM55680 = C0946.m55979("᩻ۤ") ^ i3;
                        i = ((iM55680 ^ i4) * (-13815)) ^ (-1266501028);
                        i2 = 542974594;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1390972122:
                case 1924993921:
                    C1044.m56286();
                    C0949.m56012();
                    return null;
                case -1204642431:
                case 31518767:
                    if ((i12 + 1) - i11 > 0) {
                        iM55680 = (C0946.m55979("ۢܿ") ^ i4) * (-61);
                        i = ((iM55680 ^ i3) * (-26263)) ^ 994002086;
                        i2 = -1964572545;
                    } else {
                        iM55680 = C0946.m55979("۟᩶") ^ i3;
                        i = ((iM55680 ^ i4) * 22691) ^ (-527433602);
                        i2 = 372300940;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -518357617:
                case -96943804:
                    return C1003.m56122(C0873.m55680(C0912.m55822(sArr2, i8, i9, i14)) ^ 2129083585, strArr);
                case -209469694:
                case 581274350:
                    i10 = s + 1;
                    if (C0930.f81879 <= 0) {
                        iM55680 = C0946.m55979("۬ܿ") ^ i3;
                        i = ((iM55680 ^ i4) * (-449)) ^ 1694817845;
                        i2 = -945187462;
                    } else {
                        iM55680 = (C0873.m55680("ۤۧ") + i4) * (-117);
                        i = ((iM55680 ^ i3) * (-13097)) ^ 1395344064;
                        i2 = 2052669477;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -202905543:
                case 1733496964:
                    strM13453 = m13453(strM55822);
                    sArr3 = f81847;
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = C0946.m55979("۬ܿ") ^ i3;
                        i = ((iM55680 ^ i4) * (-449)) ^ 1694817845;
                        i2 = -945187462;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                    } else {
                        int iM559711 = C0946.m55979("۫ܿ") ^ i3;
                        i5 = ((iM559711 ^ i4) * 26515) ^ (-844220567);
                        i6 = iM559711 ^ (-987493851);
                    }
                    break;
                case -153868574:
                case 887535128:
                    if (C0949.f81897 >= 0) {
                        iM55680 = (C0873.m55680("᩸ۤ") ^ i4) * 123;
                        i = ((iM55680 ^ i3) * 6791) ^ (-313915173);
                        i2 = -2007099723;
                    } else {
                        iM55680 = (i3 - C0873.m55680("֨֫")) * 73;
                        i = ((iM55680 ^ i4) * 2697) ^ 912935377;
                        i2 = -976541362;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -105895761:
                case 2118788488:
                    sArr = f81847;
                    c = 4;
                    if (C0866.m55645()) {
                        iM55680 = C0873.m55680("֫᩺") ^ i3;
                        i = ((iM55680 ^ i4) * 10853) ^ 332812442;
                        i2 = -285439995;
                    } else {
                        iM55680 = (C0946.m55979("ܽ۟") ^ i3) * (-39);
                        i = ((iM55680 ^ i4) * (-13951)) ^ 1058437278;
                        i2 = -357229885;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 814987082:
                case 1733380547:
                    if (C0946.m55980() != 0) {
                        iM55680 = (C0873.m55680("᩸ۤ") ^ i4) * 123;
                        i = ((iM55680 ^ i3) * 6791) ^ (-313915173);
                        i2 = -2007099723;
                    } else {
                        iM55680 = (C0946.m55979("ܽ۟") ^ i3) * (-39);
                        i = ((iM55680 ^ i4) * (-13951)) ^ 1058437278;
                        i2 = -357229885;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 828208768:
                case 1710243734:
                    C1036.m56257();
                    iM55680 = C0946.m55979("۬ܿ") ^ i3;
                    i = ((iM55680 ^ i4) * (-449)) ^ 1694817845;
                    i2 = -945187462;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 1700198011:
                case 1882229945:
                    strM55970 = AbstractC0942.m55970(sArr3, 9, 3, i14);
                    if (C0898.f81858 <= 0) {
                        iM55680 = (C0946.m55979("ܽ۟") ^ i3) * (-39);
                        i = ((iM55680 ^ i4) * (-13951)) ^ 1058437278;
                        i2 = -357229885;
                    } else {
                        iM55680 = (C0873.m55680("۫᩹") + i4) * (-49);
                        i = ((iM55680 ^ i3) * 6847) ^ 321119806;
                        i2 = -1518329183;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                default:
                    if (C0947.f81895) {
                        iM55680 = C0946.m55979("۬ܿ") ^ i3;
                        i = ((iM55680 ^ i4) * (-449)) ^ 1694817845;
                        i2 = -945187462;
                    } else {
                        iM55680 = (C0873.m55680("᩸ۤ") ^ i4) * 123;
                        i = ((iM55680 ^ i3) * 6791) ^ (-313915173);
                        i2 = -2007099723;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d0, code lost:
    
        if (p067l.C0882.m55710() != 0) goto L14;
     */
    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C18736 mo5125() throws Throwable {
        int i;
        String str;
        short[] sArr;
        int i2;
        short[] sArr2;
        int i3;
        int i4;
        short[] sArr3;
        int i5;
        short[] sArr4;
        int i6;
        String str2;
        int i7;
        short[] sArr5;
        int i8;
        String str3;
        short s;
        int i9;
        int i10;
        short[] sArr6;
        int iM55680;
        int i11;
        int i12;
        int i13;
        int iM55979;
        int i14;
        int i15;
        int iM55681;
        int i16;
        int i17;
        int iM55682;
        int i18;
        int i19;
        int iM55683;
        int i20;
        int iM55684;
        int i21;
        C3179 c3179 = this;
        int i22 = 1728232560;
        int i23 = RunnableC0871.f81839;
        int i24 = C0906.f81862;
        int iM559710 = (C0946.m55979("۠ۘ") + i24) * (-77);
        int i25 = ((iM559710 ^ i23) * 18959) ^ 1917152364;
        int i26 = iM559710 ^ (-1211594666);
        C13457 c13457M13469 = null;
        C7203 c7203 = null;
        String strM55707 = null;
        AbstractC17043 abstractC17043 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        short[] sArr10 = null;
        int i27 = 0;
        short s2 = 0;
        AbstractC17043 abstractC17044 = null;
        boolean zM55827 = false;
        boolean zM56131 = false;
        char c = 0;
        short s3 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        String str4 = null;
        String strM13492 = null;
        int i33 = 0;
        String strM13493 = null;
        short[] sArr11 = null;
        AbstractC17043 abstractC17045 = null;
        while (true) {
            i22 = i26 ^ (i25 & (((i22 ^ i23) * 10441) >> 31));
            switch (i22) {
                case -2144318808:
                case 1465521491:
                    C0890.m55740();
                    if (C1071.f81975 <= 0) {
                        i7 = i27;
                        s = s2;
                        str3 = str4;
                        i5 = i28;
                        sArr5 = sArr10;
                        i9 = i31;
                        i8 = i32;
                        str2 = strM55707;
                        sArr6 = sArr9;
                        int iM55685 = C0873.m55680("ᩳ᩸") ^ i23;
                        i26 = iM55685 ^ 798344636;
                        s2 = s;
                        i25 = ((iM55685 ^ i24) * (-28829)) ^ (-491972236);
                        sArr9 = sArr6;
                        strM55707 = str2;
                        i31 = i9;
                        i32 = i8;
                        sArr10 = sArr5;
                        str4 = str3;
                        i27 = i7;
                        i28 = i5;
                        c3179 = this;
                    } else {
                        iM55684 = C0873.m55680("۠۠") ^ i24;
                        i10 = ((iM55684 ^ i23) * 30911) ^ (-1303066601);
                        i21 = -104861008;
                        i26 = iM55684 ^ i21;
                        i25 = i10;
                    }
                    break;
                case -1976318245:
                case -1735134793:
                    i7 = i27;
                    str3 = str4;
                    i5 = i28;
                    sArr4 = sArr8;
                    i6 = i29;
                    sArr5 = sArr10;
                    i9 = i31;
                    i8 = i32;
                    str2 = strM55707;
                    sArr6 = sArr9;
                    s = sArr7[c];
                    s3 = 5136;
                    if (ViewOnClickListenerC0939.m55941() < 0) {
                        iM55680 = (C0873.m55680("ۤܿ") ^ i23) * (-65);
                        i11 = ((iM55680 ^ i24) * (-27137)) ^ 640147102;
                        i12 = -1081071611;
                        i26 = iM55680 ^ i12;
                        i25 = i11;
                        sArr8 = sArr4;
                        i29 = i6;
                        sArr9 = sArr6;
                        strM55707 = str2;
                        i31 = i9;
                        i32 = i8;
                        sArr10 = sArr5;
                        str4 = str3;
                        i27 = i7;
                        i28 = i5;
                        s2 = s;
                        c3179 = this;
                    } else {
                        sArr9 = sArr6;
                        int iM559711 = C0946.m55979("᩷֨") ^ i24;
                        i26 = iM559711 ^ 792446610;
                        i25 = ((iM559711 ^ i23) * (-5813)) ^ (-1452988836);
                        sArr8 = sArr4;
                        i29 = i6;
                        strM55707 = str2;
                        i31 = i9;
                        i32 = i8;
                        sArr10 = sArr5;
                        str4 = str3;
                        i27 = i7;
                        i28 = i5;
                        s2 = s;
                        c3179 = this;
                    }
                    break;
                case -1959978263:
                case 372326565:
                    C9885.m23165(abstractC17044, abstractC17043, zM56131, strM13492, strM13493, c7203);
                    iM55979 = (C0946.m55979("᩸ۙ") ^ i23) * (-109);
                    i14 = ((iM55979 ^ i24) * 14965) ^ (-810425214);
                    i15 = 1116121157;
                    i26 = iM55979 ^ i15;
                    i27 = i27;
                    i25 = i14;
                    strM55707 = strM55707;
                    str4 = str4;
                    i28 = i28;
                    i33 = i33;
                    sArr11 = sArr11;
                    s2 = s2;
                    break;
                case -1915639392:
                case -378224454:
                    return C0912.m55832();
                case -1701573922:
                case 1911742108:
                    i33 = i33;
                    sArr11 = sArr11;
                    i = i27;
                    s2 = s2;
                    i28 = i28;
                    short[] sArr12 = sArr10;
                    int i34 = i31;
                    int i35 = i32;
                    str4 = str4;
                    strM55707 = strM55707;
                    sArr3 = sArr9;
                    zM55827 = C0912.m55827(c3179, C1048.m56318(sArr3, 45, 12, i));
                    c13457M13469 = m13469();
                    if (C1053.f81965 > 0) {
                        int iM559712 = (C0946.m55979("ۢۛ") + i23) * 65;
                        int i36 = ((iM559712 ^ i24) * 6863) ^ 1485563199;
                        i26 = iM559712 ^ 1999059791;
                        i27 = i;
                        sArr10 = sArr12;
                        i31 = i34;
                        i32 = i35;
                        i25 = i36;
                        sArr9 = sArr3;
                        strM55707 = strM55707;
                        str4 = str4;
                        i28 = i28;
                        i33 = i33;
                        sArr11 = sArr11;
                        s2 = s2;
                    } else {
                        sArr2 = sArr12;
                        i4 = i35;
                        str = str4;
                        sArr = sArr8;
                        i2 = i29;
                        sArr11 = sArr11;
                        i3 = i34;
                        i33 = i33;
                        int iM559713 = (C0946.m55979("֨ܰ") + i23) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i10 = ((iM559713 ^ i24) * (-18033)) ^ 282862755;
                        i26 = iM559713 ^ (-1871043307);
                        c3179 = this;
                        sArr8 = sArr;
                        i29 = i2;
                        sArr9 = sArr3;
                        strM55707 = strM55707;
                        i31 = i3;
                        i32 = i4;
                        sArr10 = sArr2;
                        str4 = str;
                        i28 = i28;
                        s2 = s2;
                        i27 = i;
                        i25 = i10;
                    }
                    break;
                case -1555276301:
                case 197828416:
                    i = i27;
                    s2 = s2;
                    str = str4;
                    int i37 = i28;
                    sArr = sArr8;
                    i2 = i29;
                    sArr2 = sArr10;
                    i3 = i31;
                    i4 = i32;
                    strM55707 = strM55707;
                    sArr3 = sArr9;
                    AbstractC17043 abstractC17043M13451 = c3179.m13451(C0866.m55652(sArr11, i33, i37, i));
                    if (!C0861.f81831) {
                        i28 = i37;
                        abstractC17044 = abstractC17043M13451;
                        int iM559714 = (C0946.m55979("֨ܰ") + i23) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i10 = ((iM559714 ^ i24) * (-18033)) ^ 282862755;
                        i26 = iM559714 ^ (-1871043307);
                        c3179 = this;
                        sArr8 = sArr;
                        i29 = i2;
                        sArr9 = sArr3;
                        strM55707 = strM55707;
                        i31 = i3;
                        i32 = i4;
                        sArr10 = sArr2;
                        str4 = str;
                        i28 = i28;
                        s2 = s2;
                        i27 = i;
                        i25 = i10;
                    } else {
                        int iM55686 = (C0873.m55680("ܰᩳ") ^ i24) * 19;
                        i26 = iM55686 ^ 1134938432;
                        sArr8 = sArr;
                        i29 = i2;
                        sArr9 = sArr3;
                        strM55707 = strM55707;
                        i31 = i3;
                        i32 = i4;
                        sArr10 = sArr2;
                        str4 = str;
                        s2 = s2;
                        i27 = i;
                        i28 = i37;
                        i25 = ((iM55686 ^ i23) * (-31107)) ^ 1098850615;
                        abstractC17044 = abstractC17043M13451;
                        c3179 = this;
                    }
                    break;
                case -1548400396:
                case -1103614472:
                    int i38 = i33;
                    short[] sArr13 = sArr11;
                    i = i27;
                    s2 = s2;
                    strM55707 = strM55707;
                    i28 = i28;
                    sArr = sArr8;
                    i2 = i29;
                    sArr3 = sArr9;
                    sArr2 = sArr10;
                    i3 = i31;
                    i4 = i32;
                    String strM55750 = C0892.m55750(f81847, 20, 11, i);
                    if (C0930.f81879 <= 0) {
                        str = strM55750;
                        i33 = i38;
                        sArr11 = sArr13;
                        int iM559715 = (C0946.m55979("֨ܰ") + i23) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i10 = ((iM559715 ^ i24) * (-18033)) ^ 282862755;
                        i26 = iM559715 ^ (-1871043307);
                        c3179 = this;
                        sArr8 = sArr;
                        i29 = i2;
                        sArr9 = sArr3;
                        strM55707 = strM55707;
                        i31 = i3;
                        i32 = i4;
                        sArr10 = sArr2;
                        str4 = str;
                        i28 = i28;
                        s2 = s2;
                        i27 = i;
                        i25 = i10;
                    } else {
                        int iM559716 = (C0946.m55979("ܺۡ") + i23) * 123;
                        int i39 = ((iM559716 ^ i24) * (-21687)) ^ (-2113787942);
                        i26 = iM559716 ^ 1494947460;
                        sArr8 = sArr;
                        i29 = i2;
                        sArr9 = sArr3;
                        strM55707 = strM55707;
                        i31 = i3;
                        i32 = i4;
                        sArr10 = sArr2;
                        i28 = i28;
                        i33 = i38;
                        s2 = s2;
                        i27 = i;
                        str4 = strM55750;
                        i25 = i39;
                        sArr11 = sArr13;
                    }
                    break;
                case -1516643178:
                case -257588211:
                    int i40 = i33;
                    short[] sArr14 = sArr11;
                    int i41 = i27;
                    short s4 = s2;
                    String str5 = str4;
                    i5 = i28;
                    sArr5 = sArr10;
                    int i42 = i31;
                    int i43 = i32;
                    str2 = strM55707;
                    sArr6 = sArr9;
                    strM13492 = c3179.m13492(str5);
                    sArr8 = f81847;
                    i29 = 31;
                    i30 = 14;
                    if (C1194.m56396() <= 0) {
                        i7 = i41;
                        str3 = str5;
                        i9 = i42;
                        i8 = i43;
                        i33 = i40;
                        sArr11 = sArr14;
                        s = s4;
                        int iM55687 = C0873.m55680("ᩳ᩸") ^ i23;
                        i26 = iM55687 ^ 798344636;
                        s2 = s;
                        i25 = ((iM55687 ^ i24) * (-28829)) ^ (-491972236);
                        sArr9 = sArr6;
                        strM55707 = str2;
                        i31 = i9;
                        i32 = i8;
                        sArr10 = sArr5;
                        str4 = str3;
                        i27 = i7;
                        i28 = i5;
                        c3179 = this;
                    } else {
                        int iM55688 = (C0873.m55680("ۛۙ") ^ i24) * (-95);
                        int i44 = ((iM55688 ^ i23) * 10509) ^ (-960909708);
                        i26 = iM55688 ^ (-1016409403);
                        i27 = i41;
                        i31 = i42;
                        i32 = i43;
                        i25 = i44;
                        sArr9 = sArr6;
                        strM55707 = str2;
                        sArr10 = sArr5;
                        i28 = i5;
                        i33 = i40;
                        sArr11 = sArr14;
                        s2 = s4;
                        str4 = str5;
                    }
                    break;
                case -1263580172:
                case -152746203:
                    C9885.m23163(abstractC17044, abstractC17045, false, strM13492, strM13493, c7203);
                    iM55979 = C0873.m55680("ۘۘ") ^ i23;
                    i14 = ((iM55979 ^ i24) * 2821) ^ 1484223632;
                    i15 = 1824864153;
                    i26 = iM55979 ^ i15;
                    i27 = i27;
                    i25 = i14;
                    strM55707 = strM55707;
                    str4 = str4;
                    i28 = i28;
                    i33 = i33;
                    sArr11 = sArr11;
                    s2 = s2;
                    break;
                case -1247481081:
                case -288518656:
                    i13 = 17928;
                    int iM55689 = (C0873.m55680("۟۟") + i24) * (-99);
                    i26 = iM55689 ^ (-1933542407);
                    i25 = ((iM55689 ^ i23) * 13737) ^ (-1461288735);
                    sArr8 = sArr8;
                    i29 = i29;
                    sArr9 = sArr9;
                    strM55707 = strM55707;
                    i31 = i31;
                    i32 = i32;
                    sArr10 = sArr10;
                    str4 = str4;
                    i28 = i28;
                    s2 = s2;
                    i27 = i13;
                    c3179 = this;
                    break;
                case -1234340746:
                case 530109953:
                    C0861.m55626();
                    break;
                case -1193502310:
                case 759482533:
                    C1929.m56553();
                    i33 = i33;
                    sArr11 = sArr11;
                    i27 = i27;
                    s2 = s2;
                    i28 = i28;
                    str4 = str4;
                    strM55707 = strM55707;
                    iM55979 = C0873.m55680("֡ۡ") ^ i24;
                    i14 = ((iM55979 ^ i23) * (-28087)) ^ (-2050806332);
                    i15 = -1356027344;
                    i26 = iM55979 ^ i15;
                    i27 = i27;
                    i25 = i14;
                    strM55707 = strM55707;
                    str4 = str4;
                    i28 = i28;
                    i33 = i33;
                    sArr11 = sArr11;
                    s2 = s2;
                    break;
                case -1014170042:
                case -804349385:
                    i = i27;
                    s2 = s2;
                    str = str4;
                    sArr = sArr8;
                    i2 = i29;
                    sArr2 = sArr10;
                    i3 = i31;
                    i4 = i32;
                    strM55707 = strM55707;
                    sArr3 = sArr9;
                    sArr11 = f81847;
                    i33 = 16;
                    if (C0894.f81854 < 0) {
                        int iM556810 = C0873.m55680("ۘ᩺") ^ i23;
                        i26 = iM556810 ^ (-1842246067);
                        sArr8 = sArr;
                        i29 = i2;
                        sArr9 = sArr3;
                        strM55707 = strM55707;
                        i31 = i3;
                        i32 = i4;
                        sArr10 = sArr2;
                        str4 = str;
                        s2 = s2;
                        i28 = 4;
                        i27 = i;
                        i25 = ((iM556810 ^ i24) * (-11523)) ^ 776314429;
                        c3179 = this;
                    } else {
                        i28 = 4;
                        int iM559717 = (C0946.m55979("֨ܰ") + i23) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i10 = ((iM559717 ^ i24) * (-18033)) ^ 282862755;
                        i26 = iM559717 ^ (-1871043307);
                        c3179 = this;
                        sArr8 = sArr;
                        i29 = i2;
                        sArr9 = sArr3;
                        strM55707 = strM55707;
                        i31 = i3;
                        i32 = i4;
                        sArr10 = sArr2;
                        str4 = str;
                        i28 = i28;
                        s2 = s2;
                        i27 = i;
                        i25 = i10;
                    }
                    break;
                case -927616176:
                case 1195331542:
                    int i45 = i33;
                    short[] sArr15 = sArr11;
                    i = i27;
                    s2 = s2;
                    i5 = i28;
                    sArr4 = sArr8;
                    i6 = i29;
                    short[] sArr16 = sArr10;
                    int i46 = i31;
                    int i47 = i32;
                    String str6 = str4;
                    str2 = strM55707;
                    int i48 = i30;
                    strM13493 = c3179.m13492(C0917.m55852(sArr4, i6, i48, i));
                    sArr9 = f81847;
                    if (!C0912.m55833()) {
                        int iM556811 = (i23 - C0873.m55680("᩷ۨ")) * (-117);
                        i10 = ((iM556811 ^ i24) * 21407) ^ 190178365;
                        i26 = iM556811 ^ 1004162004;
                        i31 = i46;
                        i32 = i47;
                        sArr8 = sArr4;
                        i29 = i6;
                        i30 = i48;
                        strM55707 = str2;
                        str4 = str6;
                        sArr10 = sArr16;
                        i28 = i5;
                        i33 = i45;
                        sArr11 = sArr15;
                        s2 = s2;
                        i27 = i;
                        i25 = i10;
                    } else {
                        i7 = i;
                        sArr5 = sArr16;
                        i8 = i47;
                        i30 = i48;
                        str3 = str6;
                        sArr11 = sArr15;
                        s = s2;
                        i9 = i46;
                        i33 = i45;
                        int iM559718 = C0946.m55979("᩷֨") ^ i24;
                        i26 = iM559718 ^ 792446610;
                        i25 = ((iM559718 ^ i23) * (-5813)) ^ (-1452988836);
                        sArr8 = sArr4;
                        i29 = i6;
                        strM55707 = str2;
                        i31 = i9;
                        i32 = i8;
                        sArr10 = sArr5;
                        str4 = str3;
                        i27 = i7;
                        i28 = i5;
                        s2 = s;
                        c3179 = this;
                    }
                    break;
                case -919519760:
                case 1454872731:
                    if (C0877.f81843 >= 0) {
                        i = i27;
                        s2 = s2;
                        str = str4;
                        i28 = i28;
                        sArr = sArr8;
                        i2 = i29;
                        sArr2 = sArr10;
                        i3 = i31;
                        i4 = i32;
                        strM55707 = strM55707;
                        sArr3 = sArr9;
                        int iM559719 = (C0946.m55979("֨ܰ") + i23) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i10 = ((iM559719 ^ i24) * (-18033)) ^ 282862755;
                        i26 = iM559719 ^ (-1871043307);
                        c3179 = this;
                        sArr8 = sArr;
                        i29 = i2;
                        sArr9 = sArr3;
                        strM55707 = strM55707;
                        i31 = i3;
                        i32 = i4;
                        sArr10 = sArr2;
                        str4 = str;
                        i28 = i28;
                        s2 = s2;
                        i27 = i;
                        i25 = i10;
                    } else {
                        i33 = i33;
                        sArr11 = sArr11;
                        i27 = i27;
                        s2 = s2;
                        i28 = i28;
                        str4 = str4;
                        strM55707 = strM55707;
                        iM55979 = C0873.m55680("֡ۡ") ^ i24;
                        i14 = ((iM55979 ^ i23) * (-28087)) ^ (-2050806332);
                        i15 = -1356027344;
                        i26 = iM55979 ^ i15;
                        i27 = i27;
                        i25 = i14;
                        strM55707 = strM55707;
                        str4 = str4;
                        i28 = i28;
                        i33 = i33;
                        sArr11 = sArr11;
                        s2 = s2;
                    }
                    break;
                case -696360765:
                case 1481759381:
                    C9885.m23165(abstractC17044, abstractC17045, false, strM13492, strM13493, c7203);
                    iM55979 = C0873.m55680("ۘۘ") ^ i23;
                    i14 = ((iM55979 ^ i24) * 2821) ^ 1484223632;
                    i15 = 1824864153;
                    i26 = iM55979 ^ i15;
                    i27 = i27;
                    i25 = i14;
                    strM55707 = strM55707;
                    str4 = str4;
                    i28 = i28;
                    i33 = i33;
                    sArr11 = sArr11;
                    s2 = s2;
                    break;
                case -639447795:
                case 1465087006:
                    i13 = 24066;
                    int iM556812 = (C0873.m55680("۟۟") + i24) * (-99);
                    i26 = iM556812 ^ (-1933542407);
                    i25 = ((iM556812 ^ i23) * 13737) ^ (-1461288735);
                    sArr8 = sArr8;
                    i29 = i29;
                    sArr9 = sArr9;
                    strM55707 = strM55707;
                    i31 = i31;
                    i32 = i32;
                    sArr10 = sArr10;
                    str4 = str4;
                    i28 = i28;
                    s2 = s2;
                    i27 = i13;
                    c3179 = this;
                    break;
                case -304643281:
                case 916642761:
                    i7 = i27;
                    s = s2;
                    str3 = str4;
                    i5 = i28;
                    sArr4 = sArr8;
                    i6 = i29;
                    sArr5 = sArr10;
                    i9 = i31;
                    i8 = i32;
                    str2 = strM55707;
                    sArr6 = sArr9;
                    sArr7 = f81847;
                    c = 15;
                    if (!C0890.m55740()) {
                        sArr8 = sArr4;
                        i29 = i6;
                        int iM556813 = C0873.m55680("ᩳ᩸") ^ i23;
                        i26 = iM556813 ^ 798344636;
                        s2 = s;
                        i25 = ((iM556813 ^ i24) * (-28829)) ^ (-491972236);
                        sArr9 = sArr6;
                        strM55707 = str2;
                        i31 = i9;
                        i32 = i8;
                        sArr10 = sArr5;
                        str4 = str3;
                        i27 = i7;
                        i28 = i5;
                        c3179 = this;
                    } else {
                        iM55680 = (i24 - C0873.m55680("᩻ܰ")) * 71;
                        i11 = ((iM55680 ^ i23) * 6303) ^ 368054791;
                        i12 = 11999937;
                        i26 = iM55680 ^ i12;
                        i25 = i11;
                        sArr8 = sArr4;
                        i29 = i6;
                        sArr9 = sArr6;
                        strM55707 = str2;
                        i31 = i9;
                        i32 = i8;
                        sArr10 = sArr5;
                        str4 = str3;
                        i27 = i7;
                        i28 = i5;
                        s2 = s;
                        c3179 = this;
                    }
                    break;
                case -180481226:
                case 658829106:
                    if (C0949.m56007(this)) {
                        iM55684 = (i23 - C0946.m55979("᩸۟")) * 59;
                        i10 = ((iM55684 ^ i24) * (-6965)) ^ 77860587;
                        i21 = -242969288;
                    } else {
                        iM55684 = C0873.m55680("ᩳ֨") ^ i24;
                        i10 = ((iM55684 ^ i23) * (-25837)) ^ 63549980;
                        i21 = -1415164143;
                    }
                    i26 = iM55684 ^ i21;
                    i25 = i10;
                    break;
                case 2402683:
                case 1359913403:
                    C1012.m56134();
                    C0892.m55749();
                    return null;
                case 60409347:
                case 386424117:
                    i33 = i33;
                    sArr11 = sArr11;
                    int i49 = i27;
                    s2 = s2;
                    i28 = i28;
                    str4 = str4;
                    strM55707 = C0877.m55707(f81847, 72, 6, i49);
                    if (c13457M13469 != null) {
                        iM55681 = (C0946.m55979("۟ۙ") ^ i23) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i16 = ((iM55681 ^ i24) * (-2337)) ^ (-1503593420);
                        i17 = 604317621;
                    } else {
                        iM55681 = (i24 - C0873.m55680("᩺᩹")) * 49;
                        i16 = ((iM55681 ^ i23) * 22937) ^ 851894475;
                        i17 = -306970634;
                    }
                    i26 = iM55681 ^ i17;
                    i27 = i49;
                    i25 = i16;
                    str4 = str4;
                    i28 = i28;
                    i33 = i33;
                    sArr11 = sArr11;
                    s2 = s2;
                    break;
                case 78495919:
                case 818278128:
                    c3179.mo13474(0);
                    AbstractC17043 abstractC17043M38649 = abstractC17044.m38649(strM55707);
                    c3179.f6110 = abstractC17043M38649;
                    C11896.m27215(c3179.f6109, abstractC17043M38649, c13457M13469, c3179);
                    iM55979 = (C0946.m55979("᩸ۙ") ^ i23) * (-109);
                    i14 = ((iM55979 ^ i24) * 14965) ^ (-810425214);
                    i15 = 1116121157;
                    i26 = iM55979 ^ i15;
                    i27 = i27;
                    i25 = i14;
                    strM55707 = strM55707;
                    str4 = str4;
                    i28 = i28;
                    i33 = i33;
                    sArr11 = sArr11;
                    s2 = s2;
                    break;
                case 78833880:
                case 865246223:
                    return m13481();
                case 87781931:
                case 1072831624:
                    C9885.m23163(abstractC17044, abstractC17043, zM56131, strM13492, strM13493, c7203);
                    iM55979 = (C0946.m55979("᩸ۙ") ^ i23) * (-109);
                    i14 = ((iM55979 ^ i24) * 14965) ^ (-810425214);
                    i15 = 1116121157;
                    i26 = iM55979 ^ i15;
                    i27 = i27;
                    i25 = i14;
                    strM55707 = strM55707;
                    str4 = str4;
                    i28 = i28;
                    i33 = i33;
                    sArr11 = sArr11;
                    s2 = s2;
                    break;
                case 456047516:
                case 1758430058:
                    i33 = i33;
                    sArr11 = sArr11;
                    i27 = i27;
                    s2 = s2;
                    i28 = i28;
                    short[] sArr17 = sArr10;
                    int i50 = i31;
                    int i51 = i32;
                    str4 = str4;
                    strM55707 = strM55707;
                    zM56131 = C1003.m56131(c3179, C0882.m55717(sArr17, i50, i51, i27));
                    c7203 = new C7203(c3179);
                    if (C0949.f81897 >= 0) {
                        sArr10 = sArr17;
                        i31 = i50;
                        i32 = i51;
                        iM55979 = C0873.m55680("֡ۡ") ^ i24;
                        i14 = ((iM55979 ^ i23) * (-28087)) ^ (-2050806332);
                        i15 = -1356027344;
                        i26 = iM55979 ^ i15;
                        i27 = i27;
                        i25 = i14;
                    } else {
                        int iM556814 = (i23 - C0873.m55680("ۜܺ")) * 81;
                        int i52 = ((iM556814 ^ i24) * (-6733)) ^ 525806280;
                        i26 = iM556814 ^ (-1350694892);
                        i27 = i27;
                        sArr10 = sArr17;
                        i31 = i50;
                        i32 = i51;
                        i25 = i52;
                    }
                    strM55707 = strM55707;
                    str4 = str4;
                    i28 = i28;
                    i33 = i33;
                    sArr11 = sArr11;
                    s2 = s2;
                    break;
                case 562104530:
                case 2147294034:
                    int i53 = i27;
                    strM55707 = strM55707;
                    AbstractC17043 abstractC17043M38678 = abstractC17044.m38678(ServiceConnectionC1013.m56161(f81847, 78, 4, i53));
                    c3179.f6109 = abstractC17043M38678;
                    if (zM55827) {
                        iM55683 = C0873.m55680("ۖ᩸") ^ i24;
                        i18 = ((iM55683 ^ i23) * (-7711)) ^ (-2003059721);
                        i20 = 1508712300;
                    } else {
                        iM55683 = (C0873.m55680("ۗۗ") ^ i24) * 87;
                        i18 = ((iM55683 ^ i23) * 24239) ^ 1668392792;
                        i20 = 596451944;
                    }
                    i26 = iM55683 ^ i20;
                    i27 = i53;
                    abstractC17045 = abstractC17043M38678;
                    i25 = i18;
                    strM55707 = strM55707;
                    str4 = str4;
                    i28 = i28;
                    i33 = i33;
                    sArr11 = sArr11;
                    s2 = s2;
                    break;
                case 1199565146:
                case 1840991450:
                    int i54 = i27;
                    strM55707 = strM55707;
                    AbstractC17043 abstractC17043M386410 = abstractC17044.m38649(strM55707);
                    c3179.f6110 = abstractC17043M386410;
                    if (zM55827) {
                        iM55682 = C0873.m55680("ܳ᩺") ^ i23;
                        i18 = ((iM55682 ^ i24) * (-30579)) ^ 862909924;
                        i19 = -1665108957;
                    } else {
                        iM55682 = (C0873.m55680("ۜۤ") + i24) * (-123);
                        i18 = ((iM55682 ^ i23) * (-15343)) ^ 805440540;
                        i19 = 1833690134;
                    }
                    i26 = iM55682 ^ i19;
                    i27 = i54;
                    abstractC17043 = abstractC17043M386410;
                    i25 = i18;
                    strM55707 = strM55707;
                    str4 = str4;
                    i28 = i28;
                    i33 = i33;
                    sArr11 = sArr11;
                    s2 = s2;
                    break;
                case 1421374261:
                case 1846865575:
                    i33 = i33;
                    sArr11 = sArr11;
                    i27 = i27;
                    s2 = s2;
                    i28 = i28;
                    str4 = str4;
                    strM55707 = strM55707;
                    sArr10 = f81847;
                    i31 = 57;
                    i32 = 15;
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = C0873.m55680("֡ۡ") ^ i24;
                        i14 = ((iM55979 ^ i23) * (-28087)) ^ (-2050806332);
                        i15 = -1356027344;
                    } else {
                        iM55979 = C0946.m55979("ܰܳ") ^ i24;
                        i14 = ((iM55979 ^ i23) * 13613) ^ 1875768653;
                        i15 = -943205566;
                    }
                    i26 = iM55979 ^ i15;
                    i27 = i27;
                    i25 = i14;
                    strM55707 = strM55707;
                    str4 = str4;
                    i28 = i28;
                    i33 = i33;
                    sArr11 = sArr11;
                    s2 = s2;
                    break;
                default:
                    int i55 = i27;
                    s = s2;
                    str3 = str4;
                    i5 = i28;
                    sArr4 = sArr8;
                    i6 = i29;
                    sArr5 = sArr10;
                    i9 = i31;
                    i8 = i32;
                    str2 = strM55707;
                    sArr6 = sArr9;
                    int i56 = s + s3;
                    i7 = i55;
                    if ((i56 * i56) - (s * 20544) >= 0) {
                        iM55680 = C0946.m55979("ۘۨ") ^ i24;
                        i11 = ((iM55680 ^ i23) * (-39)) ^ 777327207;
                        i12 = 1995087926;
                    } else {
                        iM55680 = C0946.m55979("ۙ۠") ^ i23;
                        i11 = ((iM55680 ^ i24) * (-10621)) ^ 1945908846;
                        i12 = 2000071304;
                    }
                    i26 = iM55680 ^ i12;
                    i25 = i11;
                    sArr8 = sArr4;
                    i29 = i6;
                    sArr9 = sArr6;
                    strM55707 = str2;
                    i31 = i9;
                    i32 = i8;
                    sArr10 = sArr5;
                    str4 = str3;
                    i27 = i7;
                    i28 = i5;
                    s2 = s;
                    c3179 = this;
                    break;
            }
        }
    }
}
